package Interface;
interface whatsappcalls
{
	void calls();
	void mute();
	void disconnect();
	
}
class audiocall implements whatsappcalls
{

	@Override
	public void calls() 
	{
		System.out.println("audiocalls");
	}

	@Override
	public void mute()
	{
		System.out.println("audiocall is muted");
		
	}

	@Override
	public void disconnect() 
	{
		System.out.println("audiocall is disconnected");
		
		
	}
	
}
class videocall implements whatsappcalls
{

	@Override
	public void calls()
	{
		System.out.println("videocalls");
		
	}

	@Override
	public void mute() 
	{
		System.out.println("videocall is muted");
		
	}

	@Override
	public void disconnect()
	{
		System.out.println("video call is disconnected");
	}
	
}

public class Interface {

	public static void main(String[] args)
	{
		audiocall ob=new audiocall();
		ob.calls();
		ob.mute();
		ob.disconnect();
		videocall vc=new videocall();
		vc.calls();
		vc.mute();
		vc.disconnect();
		whatsappcalls wc=new videocall();
		wc.calls();
		wc.mute();
		wc.disconnect();
		wc=new audiocall();
		wc.calls();
		wc.mute();
		wc.disconnect();
		
		

	}

	
}


