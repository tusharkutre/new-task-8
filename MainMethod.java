class MainMethod{

public static void main(String[] args){

//tripod datatype
//new object reference is allocated to memory- copy1
//new object is created and allocated to the memory

Tripod ref1 = new Tripod();
System.out.println("The default value of Tripod is : " +ref1.brand);//default value
ref1.brand = "Boat";
System.out.println("new value : "+ref1.brand);

//className var/ref name = keyword constructor();
Tripod ref2 = new Tripod(); //2nd copy of object
System.out.println("The default value of Tripod is : " +ref2.brand);
ref2.price=2000;
//updated/changed reference
System.out.println("Boat RoackerZ 400 price : " +ref2.price);

//3rd copy
Tripod ref3 = new Tripod();
ref3.isTrue = true;
System.out.println(ref3.isTrue);
}

}