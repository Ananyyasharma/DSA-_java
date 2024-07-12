class sumofalldivisor {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
       Long gcd=1L;
       Long lcm=1L;
        
        while(A>0 && B>0){
            if(A>B){
                A=A%B;
            }else{
                B=B%A;
            }
        }
        if(A==0){
             gcd=B;
        }else{
            gcd=A;
        }
        
        lcm=(A*B)/gcd;
        
        return new Long[] {lcm, gcd};
    }
};


 
