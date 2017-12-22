package ourprograms;

public class PostCardImp implements Postcard1,Postcard2 {

	
		public void setname()
		{
			
			System.out.println("Amarpreet Singh Khalsa");
		}
		
        public void setfrom()
        {
			
			System.out.println("JAMMU GREATER KAILASH");
		}
        public void delhi()
        {
			
			System.out.println("Amarpreet Singh Khalsa is from delhi");
		}
        public void jammu()
        {
			
			System.out.println("Amarpreet Singh Khalsa is from jammu");
		}
        public static void main(String[] args) 
        {
        Postcard1 a=new PostCardImp();
        Postcard2 b=new PostCardImp();
        a.setname();
        a.setfrom();
        a.setname();
        b.delhi();
        b.jammu();
	}

	
		
	}


