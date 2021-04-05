package test;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Comparator;

	class Employee{
		int empId;
		String empName;
		int empAge;
		public Employee(int empId, String empName, int empAge) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empAge = empAge;
		}
	}
	public class ComparatorLambdaEg1 {
	      public static void main(String[] args) {
	    	  ArrayList<Employee> Emp = new ArrayList<Employee>();
	    	  Emp.add(new Employee(4,"Francy",30));
	    	  Emp.add(new Employee(6,"Ram",25));
	    	  Emp.add(new Employee(8,"Divya",20));
	    	  Emp.add(new Employee(5,"Dharshan",15));
	    	    
	    	 // Collections.sort(Emp,new ComparatorId());
	    	  
//	    	  for(Employee emp1: Emp) {
//	    		  System.out.println(emp1.empId+ " "+emp1.empName+ " "+emp1.empAge);
//	    	  }
	    	  
	    	  System.out.println("Sorting Based on Age");
	    	  Comparator<Employee> obj = (e1,e2) -> {
	    		  return ((e1.empAge == e2.empAge) ? 0 : (e1.empAge > e2.empAge) ? 1 : -1);
	    	  };
	    	  Collections.sort(Emp, obj);
	    	  Emp.forEach(
	    			  (N)->System.out.println(N.empId+ " "+N.empName+ " "+N.empAge)
	    		  );
	    	  
	    	  
	 }
}
//	class ComparatorId implements Comparator{
//	public int compare(Object o1, Object o2) {
//		Employee e1 = (Employee) o1;
//		Employee e2 = (Employee) o2;
//		int c = ((e1.empId == e2.empId) ? 0 : (e1.empId == e2.empId) ? 1 : -1);
//	    return c;	
	
//			if(e1.empId == e2.empId) {
//				return 0;}
//				else if(e1.empId > e2.empId) {
//					return 1;}
//					else {
//						return -1;}
//	}}


