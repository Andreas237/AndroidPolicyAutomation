// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;


// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter

private static final class NativeCrashWriter$ApplicationMessage extends NativeCrashWriter.ProtobufMessage
{

	private static final int PROTOBUF_TAG = 3;

	public NativeCrashWriter$ApplicationMessage(NativeCrashWriter.ExecutionMessage executionmessage, NativeCrashWriter.RepeatedMessage repeatedmessage)
	{
		super(3, new NativeCrashWriter.ProtobufMessage[] {
			executionmessage, repeatedmessage
		});
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_2        
	//    3    3:anewarray       NativeCrashWriter.ProtobufMessage[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_1         
	//    7    9:aastore         
	//    8   10:dup             
	//    9   11:iconst_1        
	//   10   12:aload_2         
	//   11   13:aastore         
	//   12   14:invokespecial   #15  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
	//   13   17:return          
	}
}
