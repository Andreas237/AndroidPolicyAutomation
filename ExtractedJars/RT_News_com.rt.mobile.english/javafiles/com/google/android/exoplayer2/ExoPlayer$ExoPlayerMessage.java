// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;


// Referenced classes of package com.google.android.exoplayer2:
//			ExoPlayer

public static final class ExoPlayer$ExoPlayerMessage
{

	public final Object message;
	public final int messageType;
	public final PlayerMessage.Target target;

	public ExoPlayer$ExoPlayerMessage(PlayerMessage.Target target1, int i, Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		target = target1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field PlayerMessage$Target target>
		messageType = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #23  <Field int messageType>
		message = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #25  <Field Object message>
	//   11   19:return          
	}
}
