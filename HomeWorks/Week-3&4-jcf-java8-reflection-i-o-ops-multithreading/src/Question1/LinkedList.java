package Question1;


public class LinkedList <T>{

	Node start, end;
	public int size;
	
	LinkedList(){
		start = null;
		end = null;
		size =0;
	}
	
	public boolean isEmpty() {
		return start == null;
	}
	
	public int getSize(){
		return size;
	}
	
	public void insert(int val)
    {
        Node nptr;
        nptr = new Node(val, null, null);
        if (start == null) {
        	
        	nptr.setLinkNext(nptr);
        	nptr.setLinkPrevious(nptr);
        	start = nptr;
        	end = start;
        }
        else
        {
            nptr.setLinkPrevious(end);
            end.setLinkNext(nptr);
            start.setLinkPrevious(nptr);
            nptr.setLinkNext(start);
            end = nptr;
        }
        size++;
    }
	
	public int getValue(int pos) {
		try {
			if(pos>size || pos<1) throw new Exception(); 
			Node ptr = start;
			for(int i = 1; i<pos; i++) {
				ptr = ptr.getLinkNext();
			}
			return ptr.getData();
		 
		}catch(Exception e) {
			System.out.println("Girdiginiz posisyona ait deger bulunmamistir.");
		}
		return -1;
	}
	
	public void delete(int pos) {
		// BAŞTAN SİLME
		if(pos == 1){
			start = start.getLinkNext();
			size--;
			return ;
			
		}
		
		// SONUNDAN SİLME 
		if(pos == size){
			Node ptr = start;
			
			for(int i = 1; i <= size ; i++) {
				ptr.setLinkNext(null);
				size--;
				return;
			}
		}
		
		// ARADAN SİLME
		
		Node ptr = start;
		pos = pos - 1;
		for(int i = 1; i < size; i++) {
			if(i == pos) {
				Node tmp = ptr.getLinkNext();
				tmp = tmp.getLinkNext();
				ptr.setLinkNext(tmp);
				break;
			}
			ptr = ptr.getLinkNext();
		}
		size--;
	}
	
	
	
}
