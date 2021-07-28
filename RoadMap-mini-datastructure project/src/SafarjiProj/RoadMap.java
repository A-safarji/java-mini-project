package SafarjiProj;
public class RoadMap<T> {	
        
	
        private int size;
      
       // private int capacity=1000;
	private MyArray<Map> info = new MyArrayImpl(Map.class, 1000);
	
	public boolean addLocation(Map road) { 
	info.add(road);
		return true;
	}
	public  Map findLocation(int buldingNo , int zipcod) {
            //    Map b= new  Map(buldingNo, "" , "" , zipcode);
      
         
          if(info.find(new Map(buldingNo,"","", zipcod))!= null){ // look only for zip and bulid num 
              
             return info.find(new Map(buldingNo,"","", zipcod));
          }else{
              Map b = new Map(0," Does not exist"," Does not exist",0);
            System.err.println("Not found");
              return b;
          }
           // return null;
             
           
          
            
            
   
}
            
	public boolean deleteLocation(int buldingNo , int zipcode) {
        //    Map d= new  Map(buldingNo, "" , "" , zipcode);
            if(info.delete(new Map(buldingNo, "" , "" , zipcode))) { // like find

                return true;
            }
            return false;
       
}
	
public boolean Modfiy(T value){
    {  // zip and bulid num have to be the same as i used find function! and the other strings can be change
       
       if(info.Modfiy((Map) value)){
           return true;
       }else{
           info.delete((Map) value);
       }
           
    
    
        }
            return false;
}
           
                
            
   
          
     
    

	public void showAll() {
		          System.out.println(info.toString());
	}
	
	
}
