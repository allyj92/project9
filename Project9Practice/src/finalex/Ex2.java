package finalex;

class Parents{
    // final 메솓는 재정의 할 수 없음
    final void method1(){
    }
    void method2(){
    }

}

class child extends Parents{
    @Override
    void method2() {
        super.method2();
    }
}