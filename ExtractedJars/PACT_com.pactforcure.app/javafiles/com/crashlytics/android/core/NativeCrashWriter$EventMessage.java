// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, CodedOutputStream, ByteString

private static final class NativeCrashWriter$EventMessage extends ge
{

	public int getPropertiesSize()
	{
		return CodedOutputStream.computeUInt64Size(1, time) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(crashType));
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #21  <Field long time>
	//    3    5:invokestatic    #32  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    4    8:iconst_2        
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field String crashType>
	//    7   13:invokestatic    #38  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   16:invokestatic    #42  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    9   19:iadd            
	//   10   20:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeUInt64(1, time);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field long time>
	//    4    6:invokevirtual   #50  <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(crashType));
	//    5    9:aload_1         
	//    6   10:iconst_2        
	//    7   11:aload_0         
	//    8   12:getfield        #23  <Field String crashType>
	//    9   15:invokestatic    #38  <Method ByteString ByteString.copyFromUtf8(String)>
	//   10   18:invokevirtual   #54  <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//   11   21:return          
	}

	private static final int PROTOBUF_TAG = 10;
	private final String crashType;
	private final long time;

	public transient NativeCrashWriter$EventMessage(long l, String s, ge age[])
	{
		super(10, age);
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload           4
	//    3    5:invokespecial   #19  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		time = l;
	//    4    8:aload_0         
	//    5    9:lload_1         
	//    6   10:putfield        #21  <Field long time>
		crashType = s;
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:putfield        #23  <Field String crashType>
	//   10   18:return          
	}
}
