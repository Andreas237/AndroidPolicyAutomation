// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, CodedOutputStream, ByteString

private static final class NativeCrashWriter$LogMessage extends sage
{

	public int getPropertiesSize()
	{
		return CodedOutputStream.computeBytesSize(1, logBytes);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #19  <Field ByteString logBytes>
	//    3    5:invokestatic    #28  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    4    8:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeBytes(1, logBytes);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field ByteString logBytes>
	//    4    6:invokevirtual   #36  <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//    5    9:return          
	}

	private static final int PROTOBUF_TAG = 6;
	ByteString logBytes;

	public NativeCrashWriter$LogMessage(ByteString bytestring)
	{
		super(6, new sage[0]);
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:iconst_0        
	//    3    4:anewarray       sage[]
	//    4    7:invokespecial   #17  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		logBytes = bytestring;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #19  <Field ByteString logBytes>
	//    8   15:return          
	}
}
