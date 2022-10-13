import java.util.List;//第六次提交
import java.util.ArrayList;
//报名入学接口
interface ISignUp{
    // 打印输出结果
    public void print();
    // 检查是否有 stuType对应的班级名额
    // 如果没有剩余名额，请返回 false ，否则学生将报名进入该班级并返回 true
    public boolean addStudent (int stuType);
    // 解析命令行输入的参数（格式），如文档描述
public static IParams parse() throws Exception{
 	System.out.println("输入的参数格式为文档描述");
 };
}


interface IParams {
    // 获取大班名额
    public int getBig();
    // 获取中班名额
    public int getMedium();
    // 获取小班名额
    public int getSmall();
    // 获取入学序列，例如 [1 2 2 3] 表示依次报名入学一名大班、中班、中班、小班学生
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
