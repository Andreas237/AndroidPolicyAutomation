// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines.channels;


// Referenced classes of package kotlinx.coroutines.channels:
//			SendChannel, ReceiveChannel

public interface Channel
	extends SendChannel, ReceiveChannel
{
	public static final class DefaultImpls
	{

		public static boolean cancel(Channel channel)
		{
			return ReceiveChannel.DefaultImpls.cancel((ReceiveChannel)channel);
		//    0    0:aload_0         
		//    1    1:checkcast       #27  <Class ReceiveChannel>
		//    2    4:invokestatic    #32  <Method boolean ReceiveChannel$DefaultImpls.cancel(ReceiveChannel)>
		//    3    7:ireturn         
		}
	}


	public static final int CONFLATED = -1;
	public static final Factory Factory = Factory...INSTANCE;
	public static final int RENDEZVOUS = 0;
	public static final int UNLIMITED = 0x7fffffff;

	/* static  */
	/* { */
	/* block-local class not found */
	class Factory {}

	//    0    0:getstatic       #43  <Field Channel$Factory Channel$Factory.$$INSTANCE>
	//    1    3:putstatic       #45  <Field Channel$Factory Factory>
	//*   2    6:return          
	/* } */
}
