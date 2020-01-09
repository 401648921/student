public interface ManagementSystem {
    public abstract void inputStudent();  //输入学生信息方法
    public abstract void inputClass();  //输入班级信息方法
    public abstract void selectId();  //通过学号查询学生方法
    public abstract void selectClass();   //通过班级编号查找多个同学方法
    public abstract void alterStudent();  //修改学生信息方法
    public abstract void alterClass();   //修改班级信息方法
    public abstract void remove();     //删除学生信息方法
    public abstract void selcetChoice(int flag);   //选择通过学号或者班级查询方法
}
