import java.util.Random;

// Adapter pattern 을 적용할 수 있을 것이다.
// CompressedFile은 Directory와 같이 사용할 수 있다.
// 따라서 크게는 File, Directory만 사용하되 Compressed File은
// 


public class Main {
    final int FILE_MIN_SIZE = 1000;
    final int FILE_MAX_SIZE = 4000;
    final int FILE_DIFF = FILE_MAX_SIZE - FILE_MIN_SIZE;
    String[] fileNames = { "a.java", "b.java", "c.txt", "d.txt" };

    // Random클래스 사용할 때 항상 같은 패턴이 나오도록 하기 위해, seed를 고정시킴
    Random random = new Random(FILE_MAX_SIZE);

    private int getRandomFileSize() {
        return random.nextInt(FILE_DIFF) + FILE_MIN_SIZE;
    }

    public CompressedFile createCompressedFileAndAddFiles(String name) {
        final int compressedRate = 30;

        // 새로운 압축 파일을 생성
        CompressedFile cf = new CompressedFile(name, compressedRate);

        // 압축 파일에 3개 파일(a.java, b.java, c.txt)를 추가
        for (int i = 0; i < 3; i++) {
            cf.addFile(new File(fileNames[i], getRandomFileSize()));
        }
        // 압축 파일에 a.java 파일을 다시 추가해봄(파일 크기가 달라짐)
        cf.addFile(new File(fileNames[0], getRandomFileSize()));
        return cf;
    }

    public Directory createDirectoryAndCopyFiles() {
        final String compressedFileName = "comp.dpz";
        final String dirName = "NewDir";

        System.out.println("\n***** 디렉토리 생성하고 파일 복사하기 *****");
        Directory drec = new Directory(dirName);
        for (String fileName : fileNames) {
            drec.copy(new File(fileName, getRandomFileSize()), true);
        }
        System.out.println("\n***** 압축 파일 생성해서 디렉토리에 복사하기 *****");
        CompressedFile cf = createCompressedFileAndAddFiles(compressedFileName);
        System.out.printf("\n***** 압축 파일의 두 번째 파일이 %s인지 확인 *****\n", fileNames[1]);
        IFile f = cf.getFile(1);
        System.out.printf("두 번째 파일 이름: %s\n", f.getName());

        System.out.println("***** 압축 파일에서 두 번째 파일 삭제 *****");
        cf.removeFile(f);

        System.out.println("\n***** 생성된 압축 파일을 해제해보기 *****");
        cf.uncompress();

        System.out.println("\n***** 디렉토리에 압축 파일 복사 *****");
        drec.copy(cf, true);

        System.out.println("\n***** 디렉토리에 이미 있는 파일을 다시 복사해보기 *****");
        drec.copy(new File(fileNames[1], getRandomFileSize()), true);
        return drec;
    }

    public void deleteFilesInDirectory(Directory directory) {
        System.out.println("***** 디렉토리에서 없는 파일 삭제해보기 *****");
        directory.delete("e.txt");
        System.out.println("***** 디렉토리에 있는 파일 삭제 *****");
        directory.delete(fileNames[2]);
    }

    public void printDirectory(Directory directory) {
        System.out.println("***** 디렉토리 내용 출력해보기 *****");
        System.out.println(directory);
    }

    public static void main(String[] args) {
        Main m = new Main();
        Directory directory = m.createDirectoryAndCopyFiles();
        m.deleteFilesInDirectory(directory);
        m.printDirectory(directory);
    }
}
