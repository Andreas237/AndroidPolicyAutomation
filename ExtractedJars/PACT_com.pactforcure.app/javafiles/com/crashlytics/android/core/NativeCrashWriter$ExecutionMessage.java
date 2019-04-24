// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter

private static final class NativeCrashWriter$ExecutionMessage extends NativeCrashWriter.ProtobufMessage
{

	private static final int PROTOBUF_TAG = 1;

	public NativeCrashWriter$ExecutionMessage(NativeCrashWriter.SignalMessage signalmessage, NativeCrashWriter.RepeatedMessage repeatedmessage, NativeCrashWriter.RepeatedMessage repeatedmessage1)
	{
		super(1, new NativeCrashWriter.ProtobufMessage[] {
			repeatedmessage, signalmessage, repeatedmessage1
		});
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:anewarray       NativeCrashWriter.ProtobufMessage[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:dup             
	//    9   11:iconst_1        
	//   10   12:aload_1         
	//   11   13:aastore         
	//   12   14:dup             
	//   13   15:iconst_2        
	//   14   16:aload_3         
	//   15   17:aastore         
	//   16   18:invokespecial   #15  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
	//   17   21:return          
	}
}
