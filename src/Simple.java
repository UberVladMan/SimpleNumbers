class Simple {
    private int num;

    void setNum(int num) {
        this.num = num;
    }

    void simple(){
        int pre = 0;
        while (this.num % 2 == 0){
        if(pre != 2) {
            System.out.println("2 ");
            }
        this.num = this.num/2;
        pre = 2;
        }

        for(int i = 3; i <= (int) Math.sqrt(this.num); i = i+2){
                while(this.num % i == 0 ) {
                    if (pre != i) System.out.println(i+" ");
                    this.num = this.num/i;
                    pre = i;
                }
        }
        if (this.num > 2){
            if (pre != this.num) System.out.println(this.num + " ");
        }
    }
}
