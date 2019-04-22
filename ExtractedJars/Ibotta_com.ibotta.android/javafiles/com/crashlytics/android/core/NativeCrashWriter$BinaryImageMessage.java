// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.BinaryImageData;
import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, CodedOutputStream, ByteString

private static final class NativeCrashWriter$BinaryImageMessage extends NativeCrashWriter.ProtobufMessage
{

	public int getPropertiesSize()
	{
		int i = CodedOutputStream.computeUInt64Size(1, baseAddr);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field long baseAddr>
	//    3    5:invokestatic    #49  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    4    8:istore_1        
		int j = CodedOutputStream.computeUInt64Size(2, imageSize);
	//    5    9:iconst_2        
	//    6   10:aload_0         
	//    7   11:getfield        #30  <Field long imageSize>
	//    8   14:invokestatic    #49  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    9   17:istore_2        
		return CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(filePath)) + i + j + CodedOutputStream.computeBytesSize(4, ByteString.copyFromUtf8(uuid));
	//   10   18:iconst_3        
	//   11   19:aload_0         
	//   12   20:getfield        #35  <Field String filePath>
	//   13   23:invokestatic    #55  <Method ByteString ByteString.copyFromUtf8(String)>
	//   14   26:invokestatic    #59  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   15   29:iload_1         
	//   16   30:iadd            
	//   17   31:iload_2         
	//   18   32:iadd            
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #40  <Field String uuid>
	//   22   38:invokestatic    #55  <Method ByteString ByteString.copyFromUtf8(String)>
	//   23   41:invokestatic    #59  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   24   44:iadd            
	//   25   45:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeUInt64(1, baseAddr);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field long baseAddr>
	//    4    6:invokevirtual   #67  <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt64(2, imageSize);
	//    5    9:aload_1         
	//    6   10:iconst_2        
	//    7   11:aload_0         
	//    8   12:getfield        #30  <Field long imageSize>
	//    9   15:invokevirtual   #67  <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(filePath));
	//   10   18:aload_1         
	//   11   19:iconst_3        
	//   12   20:aload_0         
	//   13   21:getfield        #35  <Field String filePath>
	//   14   24:invokestatic    #55  <Method ByteString ByteString.copyFromUtf8(String)>
	//   15   27:invokevirtual   #71  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(4, ByteString.copyFromUtf8(uuid));
	//   16   30:aload_1         
	//   17   31:iconst_4        
	//   18   32:aload_0         
	//   19   33:getfield        #40  <Field String uuid>
	//   20   36:invokestatic    #55  <Method ByteString ByteString.copyFromUtf8(String)>
	//   21   39:invokevirtual   #71  <Method void CodedOutputStream.writeBytes(int, ByteString)>
	//   22   42:return          
	}

	private final long baseAddr;
	private final String filePath;
	private final long imageSize;
	private final String uuid;

	public NativeCrashWriter$BinaryImageMessage(BinaryImageData binaryimagedata)
	{
		super(4, new NativeCrashWriter.ProtobufMessage[0]);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iconst_0        
	//    3    3:anewarray       NativeCrashWriter.ProtobufMessage[]
	//    4    6:invokespecial   #18  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		baseAddr = binaryimagedata.baseAddress;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #23  <Field long BinaryImageData.baseAddress>
	//    8   14:putfield        #25  <Field long baseAddr>
		imageSize = binaryimagedata.size;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #28  <Field long BinaryImageData.size>
	//   12   22:putfield        #30  <Field long imageSize>
		filePath = binaryimagedata.path;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #33  <Field String BinaryImageData.path>
	//   16   30:putfield        #35  <Field String filePath>
		uuid = binaryimagedata.id;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #38  <Field String BinaryImageData.id>
	//   20   38:putfield        #40  <Field String uuid>
	//   21   41:return          
	}
}
