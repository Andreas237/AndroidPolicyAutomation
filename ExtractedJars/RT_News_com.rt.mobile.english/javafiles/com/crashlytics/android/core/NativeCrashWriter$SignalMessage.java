// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.SignalData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, ByteString, CodedOutputStream

private static final class NativeCrashWriter$SignalMessage extends e
{

	public int getPropertiesSize()
	{
		return CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(sigName)) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(sigCode)) + CodedOutputStream.computeUInt64Size(3, sigAddr);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field String sigName>
	//    3    5:invokestatic    #46  <Method ByteString ByteString.copyFromUtf8(String)>
	//    4    8:invokestatic    #52  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    5   11:iconst_2        
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field String sigCode>
	//    8   16:invokestatic    #46  <Method ByteString ByteString.copyFromUtf8(String)>
	//    9   19:invokestatic    #52  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   10   22:iadd            
	//   11   23:iconst_3        
	//   12   24:aload_0         
	//   13   25:getfield        #37  <Field long sigAddr>
	//   14   28:invokestatic    #56  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   15   31:iadd            
	//   16   32:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(sigName));
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field String sigName>
	//    4    6:invokestatic    #46  <Method ByteString ByteString.copyFromUtf8(String)>
	//    5    9:invokevirtual   #64  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(sigCode));
	//    6   12:aload_1         
	//    7   13:iconst_2        
	//    8   14:aload_0         
	//    9   15:getfield        #32  <Field String sigCode>
	//   10   18:invokestatic    #46  <Method ByteString ByteString.copyFromUtf8(String)>
	//   11   21:invokevirtual   #64  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt64(3, sigAddr);
	//   12   24:aload_1         
	//   13   25:iconst_3        
	//   14   26:aload_0         
	//   15   27:getfield        #37  <Field long sigAddr>
	//   16   30:invokevirtual   #68  <Method void CodedOutputStream.writeUInt64(int, long)>
	//   17   33:return          
	}

	private static final int PROTOBUF_TAG = 3;
	private final long sigAddr;
	private final String sigCode;
	private final String sigName;

	public NativeCrashWriter$SignalMessage(SignalData signaldata)
	{
		super(3, new e[0]);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_0        
	//    3    3:anewarray       e[]
	//    4    6:invokespecial   #20  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		sigName = signaldata.name;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #25  <Field String SignalData.name>
	//    8   14:putfield        #27  <Field String sigName>
		sigCode = signaldata.code;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #30  <Field String SignalData.code>
	//   12   22:putfield        #32  <Field String sigCode>
		sigAddr = signaldata.faultAddress;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #35  <Field long SignalData.faultAddress>
	//   16   30:putfield        #37  <Field long sigAddr>
	//   17   33:return          
	}
}
