public class test {
	
	public static void main(String[] args) {
		
    	int[] data = {1, 4, 2, 5, 3};
        int[] data_n = {0, 1, 2, 3, 4};
    	
        for(int i = 0; i < data.length; i++) {
        	System.out.println(data[i]+" = "+data_n[i]);
        }

        for(int i=0; i < data.length-1; i++) {
            for(int ii=0; ii < data.length-i-1; ii++) {
            	if(data[ii] < data[ii+1]) {
            		int tmp = data[ii];
                    int tmp_n = data_n[ii];
            		data[ii] = data[ii+1];
                    data_n[ii] = data_n[ii+1];
            		data[ii+1] = tmp;
                    data_n[ii+1] = tmp_n;
            	}
            }
        }
        System.out.println();
        for(int i = 0; i < data.length; i++) {
            
        	System.out.println(data[i]+" = "+data_n[i]);
        }
	}
}