import java.io.File;

public class FileTest{
    public FileTest(){}
    public static void main(String[] args){
        System.out.println(args[0]);
        File file = new File(args[0]+".txt");
        if(file.exists()){
            file.delete();
            System.out.println("�ļ���ɾ��");
        }else{
            try{
                file.createNewFile();
                String x = "�ļ��Ѵ���";
                System.out.println(x);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}