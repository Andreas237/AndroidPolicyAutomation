// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import java.io.IOException;

// Referenced classes of package com.crashlytics.android.core:
//			NativeCrashWriter, CodedOutputStream, ByteString

private static final class NativeCrashWriter$FrameMessage extends ge
{

	public int getPropertiesSize()
	{
		return CodedOutputStream.computeUInt64Size(1, address) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(symbol)) + CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(file)) + CodedOutputStream.computeUInt64Size(4, offset) + CodedOutputStream.computeUInt32Size(5, importance);
	//    0    0:iconst_1        
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field long address>
	//    3    5:invokestatic    #46  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//    4    8:iconst_2        
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field String symbol>
	//    7   13:invokestatic    #52  <Method ByteString ByteString.copyFromUtf8(String)>
	//    8   16:invokestatic    #56  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//    9   19:iadd            
	//   10   20:iconst_3        
	//   11   21:aload_0         
	//   12   22:getfield        #31  <Field String file>
	//   13   25:invokestatic    #52  <Method ByteString ByteString.copyFromUtf8(String)>
	//   14   28:invokestatic    #56  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
	//   15   31:iadd            
	//   16   32:iconst_4        
	//   17   33:aload_0         
	//   18   34:getfield        #34  <Field long offset>
	//   19   37:invokestatic    #46  <Method int CodedOutputStream.computeUInt64Size(int, long)>
	//   20   40:iadd            
	//   21   41:iconst_5        
	//   22   42:aload_0         
	//   23   43:getfield        #37  <Field int importance>
	//   24   46:invokestatic    #60  <Method int CodedOutputStream.computeUInt32Size(int, int)>
	//   25   49:iadd            
	//   26   50:ireturn         
	}

	public void writeProperties(CodedOutputStream codedoutputstream)
		throws IOException
	{
		codedoutputstream.writeUInt64(1, address);
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #25  <Field long address>
	//    4    6:invokevirtual   #68  <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(symbol));
	//    5    9:aload_1         
	//    6   10:iconst_2        
	//    7   11:aload_0         
	//    8   12:getfield        #28  <Field String symbol>
	//    9   15:invokestatic    #52  <Method ByteString ByteString.copyFromUtf8(String)>
	//   10   18:invokevirtual   #72  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(file));
	//   11   21:aload_1         
	//   12   22:iconst_3        
	//   13   23:aload_0         
	//   14   24:getfield        #31  <Field String file>
	//   15   27:invokestatic    #52  <Method ByteString ByteString.copyFromUtf8(String)>
	//   16   30:invokevirtual   #72  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		codedoutputstream.writeUInt64(4, offset);
	//   17   33:aload_1         
	//   18   34:iconst_4        
	//   19   35:aload_0         
	//   20   36:getfield        #34  <Field long offset>
	//   21   39:invokevirtual   #68  <Method void CodedOutputStream.writeUInt64(int, long)>
		codedoutputstream.writeUInt32(5, importance);
	//   22   42:aload_1         
	//   23   43:iconst_5        
	//   24   44:aload_0         
	//   25   45:getfield        #37  <Field int importance>
	//   26   48:invokevirtual   #76  <Method void CodedOutputStream.writeUInt32(int, int)>
	//   27   51:return          
	}

	private final long address;
	private final String file;
	private final int importance;
	private final long offset;
	private final String symbol;

	public NativeCrashWriter$FrameMessage(com.crashlytics.android.core.internal.models.ThreadData.FrameData framedata)
	{
		super(3, new ge[0]);
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:iconst_0        
	//    3    3:anewarray       ge[]
	//    4    6:invokespecial   #20  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		address = framedata.address;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getfield        #24  <Field long com.crashlytics.android.core.internal.models.ThreadData$FrameData.address>
	//    8   14:putfield        #25  <Field long address>
		symbol = framedata.symbol;
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:getfield        #27  <Field String com.crashlytics.android.core.internal.models.ThreadData$FrameData.symbol>
	//   12   22:putfield        #28  <Field String symbol>
		file = framedata.file;
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:getfield        #30  <Field String com.crashlytics.android.core.internal.models.ThreadData$FrameData.file>
	//   16   30:putfield        #31  <Field String file>
		offset = framedata.offset;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #33  <Field long com.crashlytics.android.core.internal.models.ThreadData$FrameData.offset>
	//   20   38:putfield        #34  <Field long offset>
		importance = framedata.importance;
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:getfield        #36  <Field int com.crashlytics.android.core.internal.models.ThreadData$FrameData.importance>
	//   24   46:putfield        #37  <Field int importance>
	//   25   49:return          
	}
}
