import java.util.List;//�������ύ
import java.util.ArrayList;
//������ѧ�ӿ�
interface ISignUp{
    // ��ӡ������
    public void print();
    // ����Ƿ��� stuType��Ӧ�İ༶����
    // ���û��ʣ������뷵�� false ������ѧ������������ð༶������ true
    public boolean addStudent (int stuType);
    // ��������������Ĳ�������ʽ�������ĵ�����
public static IParams parse() throws Exception{
 	System.out.println("����Ĳ�����ʽΪ�ĵ�����");
 };
}


interface IParams {
    // ��ȡ�������
    public int getBig();
    // ��ȡ�а�����
    public int getMedium();
    // ��ȡС������
    public int getSmall();
    // ��ȡ��ѧ���У����� [1 2 2 3] ��ʾ���α�����ѧһ����ࡢ�аࡢ�аࡢС��ѧ��
    public ArrayList<Integer> getPlanSignUp ();
}

public class SchoolSystem implements ISignUp{
	int big;
	int medium;
	int small;
	public SchoolSystem(int big,int medium,int small) {
		this.big=big;
		this.medium=medium;
		this.small=small;
	}
	public int getBig() {
		return big;
	}
	public int getMedium() {
		return medium;
	}
	public int getSmall() {
		return small;
	}
	public void setBig(int big) {
		this.big=big;
	}
	public void setMedium(int medium) {
		this.medium=medium;
	}
	public void setSmall(int small) {
		this.small=small;
	}
	public void print() {
		System.out.println("");
		
	}
	 public boolean addStudent (int stuType) {
		 if(){}
	 }

}
public static void main(String[] args) throws Exception {
        IParams params = ISignUp.parse();//SchoolSystem.parse();
        SchoolSystem sc = new SchoolSystem (params.getBig(), params.getMedium(),params.getSmall());
        ArrayList<Integer> plan = params. getPlanSignUp ();
        for (int i = 0; i < plan.size(); i++) {
            sc. addStudent (plan.get(i));
        }
        sc.print();
    }
