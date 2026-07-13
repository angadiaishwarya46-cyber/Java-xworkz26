class WashingMachine { 
   
   static boolean isConnected; 
    
	static int maxMode = 7; 
    static int currentMode; 
    static int minMode; 

    public static void onOroff(){ 
        if (isConnected == false){ 
            isConnected = true; 
            System.out.println("WashingMachine is connected..."); 
        } 
		else if (isConnected == true){ 
            isConnected = false; 
            System.out.println("WashingMachine is dis-connected..."); 
        } 
        return; 
    } 

    public static void increaseMode(){ 
        if(isConnected == true){ 
            if(currentMode < maxMode){ 
                currentMode = currentMode + 1; 
                System.out.println("The currentMode is " + currentMode); 
            } 
			else if (currentMode == maxMode) { 
                System.out.println("Max Mode reached..."); 
            } 
        } 
		else if (isConnected == false) { 
            System.out.println("Turn On the WashingMachine first..."); 
        } 
    } 

    public static void decreaseMode(){ 
        if(isConnected == true){ 
            if(currentMode > minMode){ 
                currentMode = currentMode - 1; 
                System.out.println("The currentMode is " + currentMode); 
            } 
			else if (currentMode == minMode) { 
                System.out.println("Max Mode reached..."); 
            } 
        } else if (isConnected == false) { 
            System.out.println("Turn On the WashingMachine first..."); 
        } 
    } 

    public static void main(String[] args){ 
        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        System.out.println(isConnected); 
        onOroff(); 
        System.out.println("main ended"); 

        
        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        increaseMode(); 
        increaseMode(); 
        increaseMode(); 
        increaseMode(); 
        increaseMode(); 
        increaseMode(); 
        increaseMode(); 
        onOroff(); 
        System.out.println("main ended"); 

        System.out.println("main started"); 
        System.out.println(isConnected); 
        onOroff(); 
        decreaseMode(); 
        decreaseMode(); 
        decreaseMode(); 
        decreaseMode(); 
        increaseMode(); 
        decreaseMode(); 
        decreaseMode(); 
        onOroff(); 
        System.out.println("main ended"); 
    } 
}
