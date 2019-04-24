// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlinx.coroutines.channels;


// Referenced classes of package kotlinx.coroutines.channels:
//			ActorScope, ReceiveChannel

public static final class ActorScope$DefaultImpls
{

	public static boolean cancel(ActorScope actorscope)
	{
		return pls.cancel((ReceiveChannel)actorscope);
	//    0    0:aload_0         
	//    1    1:checkcast       #27  <Class ReceiveChannel>
	//    2    4:invokestatic    #32  <Method boolean ReceiveChannel$DefaultImpls.cancel(ReceiveChannel)>
	//    3    7:ireturn         
	}
}
