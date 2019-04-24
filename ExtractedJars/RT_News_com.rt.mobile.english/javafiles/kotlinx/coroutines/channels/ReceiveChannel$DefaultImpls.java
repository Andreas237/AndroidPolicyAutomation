// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines.channels;


// Referenced classes of package kotlinx.coroutines.channels:
//			ReceiveChannel

public static final class ReceiveChannel$DefaultImpls
{

	public static boolean cancel(ReceiveChannel receivechannel)
	{
		return receivechannel.cancel(((Throwable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokeinterface #28  <Method boolean ReceiveChannel.cancel(Throwable)>
	//    3    7:ireturn         
	}

	public static boolean cancel$default(ReceiveChannel receivechannel, Throwable throwable, int i, Object obj)
	{
		if(obj != null)
	//*   0    0:aload_3         
	//*   1    1:ifnull          14
			throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
	//    2    4:new             #45  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:ldc1            #47  <String "Super calls with default arguments not supported in this target, function: cancel">
	//    5   10:invokespecial   #51  <Method void UnsupportedOperationException(String)>
	//    6   13:athrow          
		if((i & 1) != 0)
	//*   7   14:iload_2         
	//*   8   15:iconst_1        
	//*   9   16:iand            
	//*  10   17:ifeq            25
			throwable = (Throwable)null;
	//   11   20:aconst_null     
	//   12   21:checkcast       #53  <Class Throwable>
	//   13   24:astore_1        
		return receivechannel.cancel(throwable);
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokeinterface #28  <Method boolean ReceiveChannel.cancel(Throwable)>
	//   17   32:ireturn         
	}

	public static void isClosedForReceive$annotations()
	{
	//    0    0:return          
	}

	public static void isEmpty$annotations()
	{
	//    0    0:return          
	}

	public static void onReceiveOrNull$annotations()
	{
	//    0    0:return          
	}
}
