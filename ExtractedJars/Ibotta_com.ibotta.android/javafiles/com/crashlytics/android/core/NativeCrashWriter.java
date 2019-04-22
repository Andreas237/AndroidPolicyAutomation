// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import com.crashlytics.android.core.internal.models.BinaryImageData;
import com.crashlytics.android.core.internal.models.CustomAttributeData;
import com.crashlytics.android.core.internal.models.DeviceData;
import com.crashlytics.android.core.internal.models.SessionEventData;
import com.crashlytics.android.core.internal.models.SignalData;
import com.crashlytics.android.core.internal.models.ThreadData;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.crashlytics.android.core:
//			LogFileManager, CodedOutputStream, ByteString

class NativeCrashWriter
{
	private static final class ApplicationMessage extends ProtobufMessage
	{

		public ApplicationMessage(ExecutionMessage executionmessage, RepeatedMessage repeatedmessage)
		{
			super(3, new ProtobufMessage[] {
				executionmessage, repeatedmessage
			});
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:iconst_2        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:dup             
		//    5    7:iconst_0        
		//    6    8:aload_1         
		//    7    9:aastore         
		//    8   10:dup             
		//    9   11:iconst_1        
		//   10   12:aload_2         
		//   11   13:aastore         
		//   12   14:invokespecial   #12  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		//   13   17:return          
		}
	}

	private static final class BinaryImageMessage extends ProtobufMessage
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

		public BinaryImageMessage(BinaryImageData binaryimagedata)
		{
			super(4, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_4        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
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

	private static final class CustomAttributeMessage extends ProtobufMessage
	{

		public int getPropertiesSize()
		{
			int i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(key));
		//    0    0:iconst_1        
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field String key>
		//    3    5:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
		//    4    8:invokestatic    #38  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//    5   11:istore_1        
			String s1 = value;
		//    6   12:aload_0         
		//    7   13:getfield        #23  <Field String value>
		//    8   16:astore_3        
			String s = s1;
		//    9   17:aload_3         
		//   10   18:astore_2        
			if(s1 == null)
		//*  11   19:aload_3         
		//*  12   20:ifnonnull       26
				s = "";
		//   13   23:ldc1            #40  <String "">
		//   14   25:astore_2        
			return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
		//   15   26:iload_1         
		//   16   27:iconst_2        
		//   17   28:aload_2         
		//   18   29:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
		//   19   32:invokestatic    #38  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//   20   35:iadd            
		//   21   36:ireturn         
		}

		public void writeProperties(CodedOutputStream codedoutputstream)
			throws IOException
		{
			codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(key));
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:aload_0         
		//    3    3:getfield        #20  <Field String key>
		//    4    6:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
		//    5    9:invokevirtual   #48  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			String s1 = value;
		//    6   12:aload_0         
		//    7   13:getfield        #23  <Field String value>
		//    8   16:astore_3        
			String s = s1;
		//    9   17:aload_3         
		//   10   18:astore_2        
			if(s1 == null)
		//*  11   19:aload_3         
		//*  12   20:ifnonnull       26
				s = "";
		//   13   23:ldc1            #40  <String "">
		//   14   25:astore_2        
			codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
		//   15   26:aload_1         
		//   16   27:iconst_2        
		//   17   28:aload_2         
		//   18   29:invokestatic    #32  <Method ByteString ByteString.copyFromUtf8(String)>
		//   19   32:invokevirtual   #48  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		//   20   35:return          
		}

		private final String key;
		private final String value;

		public CustomAttributeMessage(CustomAttributeData customattributedata)
		{
			super(2, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:invokespecial   #15  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			key = customattributedata.key;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #19  <Field String CustomAttributeData.key>
		//    8   14:putfield        #20  <Field String key>
			value = customattributedata.value;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #22  <Field String CustomAttributeData.value>
		//   12   22:putfield        #23  <Field String value>
		//   13   25:return          
		}
	}

	private static final class DeviceMessage extends ProtobufMessage
	{

		public int getPropertiesSize()
		{
			return CodedOutputStream.computeFloatSize(1, batteryLevel) + 0 + CodedOutputStream.computeSInt32Size(2, batteryVelocity) + CodedOutputStream.computeBoolSize(3, proximityOn) + CodedOutputStream.computeUInt32Size(4, orientation) + CodedOutputStream.computeUInt64Size(5, ramUsed) + CodedOutputStream.computeUInt64Size(6, diskUsed);
		//    0    0:iconst_1        
		//    1    1:aload_0         
		//    2    2:getfield        #24  <Field float batteryLevel>
		//    3    5:invokestatic    #43  <Method int CodedOutputStream.computeFloatSize(int, float)>
		//    4    8:iconst_0        
		//    5    9:iadd            
		//    6   10:iconst_2        
		//    7   11:aload_0         
		//    8   12:getfield        #26  <Field int batteryVelocity>
		//    9   15:invokestatic    #47  <Method int CodedOutputStream.computeSInt32Size(int, int)>
		//   10   18:iadd            
		//   11   19:iconst_3        
		//   12   20:aload_0         
		//   13   21:getfield        #28  <Field boolean proximityOn>
		//   14   24:invokestatic    #51  <Method int CodedOutputStream.computeBoolSize(int, boolean)>
		//   15   27:iadd            
		//   16   28:iconst_4        
		//   17   29:aload_0         
		//   18   30:getfield        #30  <Field int orientation>
		//   19   33:invokestatic    #54  <Method int CodedOutputStream.computeUInt32Size(int, int)>
		//   20   36:iadd            
		//   21   37:iconst_5        
		//   22   38:aload_0         
		//   23   39:getfield        #32  <Field long ramUsed>
		//   24   42:invokestatic    #58  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//   25   45:iadd            
		//   26   46:bipush          6
		//   27   48:aload_0         
		//   28   49:getfield        #34  <Field long diskUsed>
		//   29   52:invokestatic    #58  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//   30   55:iadd            
		//   31   56:ireturn         
		}

		public void writeProperties(CodedOutputStream codedoutputstream)
			throws IOException
		{
			codedoutputstream.writeFloat(1, batteryLevel);
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:aload_0         
		//    3    3:getfield        #24  <Field float batteryLevel>
		//    4    6:invokevirtual   #66  <Method void CodedOutputStream.writeFloat(int, float)>
			codedoutputstream.writeSInt32(2, batteryVelocity);
		//    5    9:aload_1         
		//    6   10:iconst_2        
		//    7   11:aload_0         
		//    8   12:getfield        #26  <Field int batteryVelocity>
		//    9   15:invokevirtual   #70  <Method void CodedOutputStream.writeSInt32(int, int)>
			codedoutputstream.writeBool(3, proximityOn);
		//   10   18:aload_1         
		//   11   19:iconst_3        
		//   12   20:aload_0         
		//   13   21:getfield        #28  <Field boolean proximityOn>
		//   14   24:invokevirtual   #74  <Method void CodedOutputStream.writeBool(int, boolean)>
			codedoutputstream.writeUInt32(4, orientation);
		//   15   27:aload_1         
		//   16   28:iconst_4        
		//   17   29:aload_0         
		//   18   30:getfield        #30  <Field int orientation>
		//   19   33:invokevirtual   #77  <Method void CodedOutputStream.writeUInt32(int, int)>
			codedoutputstream.writeUInt64(5, ramUsed);
		//   20   36:aload_1         
		//   21   37:iconst_5        
		//   22   38:aload_0         
		//   23   39:getfield        #32  <Field long ramUsed>
		//   24   42:invokevirtual   #81  <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeUInt64(6, diskUsed);
		//   25   45:aload_1         
		//   26   46:bipush          6
		//   27   48:aload_0         
		//   28   49:getfield        #34  <Field long diskUsed>
		//   29   52:invokevirtual   #81  <Method void CodedOutputStream.writeUInt64(int, long)>
		//   30   55:return          
		}

		private final float batteryLevel;
		private final int batteryVelocity;
		private final long diskUsed;
		private final int orientation;
		private final boolean proximityOn;
		private final long ramUsed;

		public DeviceMessage(float f, int i, boolean flag, int j, long l, long l1)
		{
			super(5, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_5        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:invokespecial   #22  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			batteryLevel = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #24  <Field float batteryLevel>
			batteryVelocity = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #26  <Field int batteryVelocity>
			proximityOn = flag;
		//   11   19:aload_0         
		//   12   20:iload_3         
		//   13   21:putfield        #28  <Field boolean proximityOn>
			orientation = j;
		//   14   24:aload_0         
		//   15   25:iload           4
		//   16   27:putfield        #30  <Field int orientation>
			ramUsed = l;
		//   17   30:aload_0         
		//   18   31:lload           5
		//   19   33:putfield        #32  <Field long ramUsed>
			diskUsed = l1;
		//   20   36:aload_0         
		//   21   37:lload           7
		//   22   39:putfield        #34  <Field long diskUsed>
		//   23   42:return          
		}
	}

	private static final class EventMessage extends ProtobufMessage
	{

		public int getPropertiesSize()
		{
			return CodedOutputStream.computeUInt64Size(1, time) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(crashType));
		//    0    0:iconst_1        
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field long time>
		//    3    5:invokestatic    #29  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//    4    8:iconst_2        
		//    5    9:aload_0         
		//    6   10:getfield        #20  <Field String crashType>
		//    7   13:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
		//    8   16:invokestatic    #39  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
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
		//    3    3:getfield        #18  <Field long time>
		//    4    6:invokevirtual   #47  <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(crashType));
		//    5    9:aload_1         
		//    6   10:iconst_2        
		//    7   11:aload_0         
		//    8   12:getfield        #20  <Field String crashType>
		//    9   15:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
		//   10   18:invokevirtual   #51  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		//   11   21:return          
		}

		private final String crashType;
		private final long time;

		public transient EventMessage(long l, String s, ProtobufMessage aprotobufmessage[])
		{
			super(10, aprotobufmessage);
		//    0    0:aload_0         
		//    1    1:bipush          10
		//    2    3:aload           4
		//    3    5:invokespecial   #16  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			time = l;
		//    4    8:aload_0         
		//    5    9:lload_1         
		//    6   10:putfield        #18  <Field long time>
			crashType = s;
		//    7   13:aload_0         
		//    8   14:aload_3         
		//    9   15:putfield        #20  <Field String crashType>
		//   10   18:return          
		}
	}

	private static final class ExecutionMessage extends ProtobufMessage
	{

		public ExecutionMessage(SignalMessage signalmessage, RepeatedMessage repeatedmessage, RepeatedMessage repeatedmessage1)
		{
			super(1, new ProtobufMessage[] {
				repeatedmessage, signalmessage, repeatedmessage1
			});
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:anewarray       ProtobufMessage[]
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
		//   16   18:invokespecial   #12  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		//   17   21:return          
		}
	}

	private static final class FrameMessage extends ProtobufMessage
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

		public FrameMessage(com.crashlytics.android.core.internal.models.ThreadData.FrameData framedata)
		{
			super(3, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
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

	private static final class LogMessage extends ProtobufMessage
	{

		public int getPropertiesSize()
		{
			return CodedOutputStream.computeBytesSize(1, logBytes);
		//    0    0:iconst_1        
		//    1    1:aload_0         
		//    2    2:getfield        #16  <Field ByteString logBytes>
		//    3    5:invokestatic    #25  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//    4    8:ireturn         
		}

		public void writeProperties(CodedOutputStream codedoutputstream)
			throws IOException
		{
			codedoutputstream.writeBytes(1, logBytes);
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:aload_0         
		//    3    3:getfield        #16  <Field ByteString logBytes>
		//    4    6:invokevirtual   #33  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		//    5    9:return          
		}

		ByteString logBytes;

		public LogMessage(ByteString bytestring)
		{
			super(6, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:bipush          6
		//    2    3:iconst_0        
		//    3    4:anewarray       ProtobufMessage[]
		//    4    7:invokespecial   #14  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			logBytes = bytestring;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #16  <Field ByteString logBytes>
		//    8   15:return          
		}
	}

	private static final class NullMessage extends ProtobufMessage
	{

		public int getSize()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void write(CodedOutputStream codedoutputstream)
			throws IOException
		{
		//    0    0:return          
		}

		public NullMessage()
		{
			super(0, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:invokespecial   #12  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
		//    5    9:return          
		}
	}

	private static abstract class ProtobufMessage
	{

		public int getPropertiesSize()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSize()
		{
			int i = getSizeNoTag();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #31  <Method int getSizeNoTag()>
		//    2    4:istore_1        
			return i + CodedOutputStream.computeRawVarint32Size(i) + CodedOutputStream.computeTagSize(tag);
		//    3    5:iload_1         
		//    4    6:iload_1         
		//    5    7:invokestatic    #37  <Method int CodedOutputStream.computeRawVarint32Size(int)>
		//    6   10:iadd            
		//    7   11:aload_0         
		//    8   12:getfield        #18  <Field int tag>
		//    9   15:invokestatic    #40  <Method int CodedOutputStream.computeTagSize(int)>
		//   10   18:iadd            
		//   11   19:ireturn         
		}

		public int getSizeNoTag()
		{
			int j = getPropertiesSize();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #42  <Method int getPropertiesSize()>
		//    2    4:istore_2        
			ProtobufMessage aprotobufmessage[] = children;
		//    3    5:aload_0         
		//    4    6:getfield        #24  <Field NativeCrashWriter$ProtobufMessage[] children>
		//    5    9:astore          4
			int k = aprotobufmessage.length;
		//    6   11:aload           4
		//    7   13:arraylength     
		//    8   14:istore_3        
			for(int i = 0; i < k; i++)
		//*   9   15:iconst_0        
		//*  10   16:istore_1        
		//*  11   17:iload_1         
		//*  12   18:iload_3         
		//*  13   19:icmpge          39
				j += aprotobufmessage[i].getSize();
		//   14   22:iload_2         
		//   15   23:aload           4
		//   16   25:iload_1         
		//   17   26:aaload          
		//   18   27:invokevirtual   #44  <Method int getSize()>
		//   19   30:iadd            
		//   20   31:istore_2        

		//   21   32:iload_1         
		//   22   33:iconst_1        
		//   23   34:iadd            
		//   24   35:istore_1        
		//*  25   36:goto            17
			return j;
		//   26   39:iload_2         
		//   27   40:ireturn         
		}

		public void write(CodedOutputStream codedoutputstream)
			throws IOException
		{
			codedoutputstream.writeTag(tag, 2);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #18  <Field int tag>
		//    3    5:iconst_2        
		//    4    6:invokevirtual   #52  <Method void CodedOutputStream.writeTag(int, int)>
			codedoutputstream.writeRawVarint32(getSizeNoTag());
		//    5    9:aload_1         
		//    6   10:aload_0         
		//    7   11:invokevirtual   #31  <Method int getSizeNoTag()>
		//    8   14:invokevirtual   #56  <Method void CodedOutputStream.writeRawVarint32(int)>
			writeProperties(codedoutputstream);
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:invokevirtual   #59  <Method void writeProperties(CodedOutputStream)>
			ProtobufMessage aprotobufmessage[] = children;
		//   12   22:aload_0         
		//   13   23:getfield        #24  <Field NativeCrashWriter$ProtobufMessage[] children>
		//   14   26:astore          4
			int j = aprotobufmessage.length;
		//   15   28:aload           4
		//   16   30:arraylength     
		//   17   31:istore_3        
			for(int i = 0; i < j; i++)
		//*  18   32:iconst_0        
		//*  19   33:istore_2        
		//*  20   34:iload_2         
		//*  21   35:iload_3         
		//*  22   36:icmpge          54
				aprotobufmessage[i].write(codedoutputstream);
		//   23   39:aload           4
		//   24   41:iload_2         
		//   25   42:aaload          
		//   26   43:aload_1         
		//   27   44:invokevirtual   #61  <Method void write(CodedOutputStream)>

		//   28   47:iload_2         
		//   29   48:iconst_1        
		//   30   49:iadd            
		//   31   50:istore_2        
		//*  32   51:goto            34
		//   33   54:return          
		}

		public void writeProperties(CodedOutputStream codedoutputstream)
			throws IOException
		{
		//    0    0:return          
		}

		private final ProtobufMessage children[];
		private final int tag;

		public transient ProtobufMessage(int i, ProtobufMessage aprotobufmessage[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			tag = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #18  <Field int tag>
			if(aprotobufmessage == null)
		//*   5    9:aload_2         
		//*   6   10:ifnull          16
		//*   7   13:goto            20
				aprotobufmessage = NativeCrashWriter.EMPTY_CHILDREN;
		//    8   16:invokestatic    #22  <Method NativeCrashWriter$ProtobufMessage[] NativeCrashWriter.access$000()>
		//    9   19:astore_2        
			children = aprotobufmessage;
		//   10   20:aload_0         
		//   11   21:aload_2         
		//   12   22:putfield        #24  <Field NativeCrashWriter$ProtobufMessage[] children>
		//   13   25:return          
		}
	}

	private static final class RepeatedMessage extends ProtobufMessage
	{

		public int getSize()
		{
			ProtobufMessage aprotobufmessage[] = messages;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field NativeCrashWriter$ProtobufMessage[] messages>
		//    2    4:astore          4
			int k = aprotobufmessage.length;
		//    3    6:aload           4
		//    4    8:arraylength     
		//    5    9:istore_3        
			int i = 0;
		//    6   10:iconst_0        
		//    7   11:istore_1        
			int j = 0;
		//    8   12:iconst_0        
		//    9   13:istore_2        
			for(; i < k; i++)
		//*  10   14:iload_1         
		//*  11   15:iload_3         
		//*  12   16:icmpge          36
				j += aprotobufmessage[i].getSize();
		//   13   19:iload_2         
		//   14   20:aload           4
		//   15   22:iload_1         
		//   16   23:aaload          
		//   17   24:invokevirtual   #21  <Method int NativeCrashWriter$ProtobufMessage.getSize()>
		//   18   27:iadd            
		//   19   28:istore_2        

		//   20   29:iload_1         
		//   21   30:iconst_1        
		//   22   31:iadd            
		//   23   32:istore_1        
		//*  24   33:goto            14
			return j;
		//   25   36:iload_2         
		//   26   37:ireturn         
		}

		public void write(CodedOutputStream codedoutputstream)
			throws IOException
		{
			ProtobufMessage aprotobufmessage[] = messages;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field NativeCrashWriter$ProtobufMessage[] messages>
		//    2    4:astore          4
			int j = aprotobufmessage.length;
		//    3    6:aload           4
		//    4    8:arraylength     
		//    5    9:istore_3        
			for(int i = 0; i < j; i++)
		//*   6   10:iconst_0        
		//*   7   11:istore_2        
		//*   8   12:iload_2         
		//*   9   13:iload_3         
		//*  10   14:icmpge          32
				aprotobufmessage[i].write(codedoutputstream);
		//   11   17:aload           4
		//   12   19:iload_2         
		//   13   20:aaload          
		//   14   21:aload_1         
		//   15   22:invokevirtual   #27  <Method void NativeCrashWriter$ProtobufMessage.write(CodedOutputStream)>

		//   16   25:iload_2         
		//   17   26:iconst_1        
		//   18   27:iadd            
		//   19   28:istore_2        
		//*  20   29:goto            12
		//   21   32:return          
		}

		private final ProtobufMessage messages[];

		public transient RepeatedMessage(ProtobufMessage aprotobufmessage[])
		{
			super(0, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:invokespecial   #14  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			messages = aprotobufmessage;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #16  <Field NativeCrashWriter$ProtobufMessage[] messages>
		//    8   14:return          
		}
	}

	private static final class SignalMessage extends ProtobufMessage
	{

		public int getPropertiesSize()
		{
			return CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(sigName)) + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(sigCode)) + CodedOutputStream.computeUInt64Size(3, sigAddr);
		//    0    0:iconst_1        
		//    1    1:aload_0         
		//    2    2:getfield        #24  <Field String sigName>
		//    3    5:invokestatic    #43  <Method ByteString ByteString.copyFromUtf8(String)>
		//    4    8:invokestatic    #49  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//    5   11:iconst_2        
		//    6   12:aload_0         
		//    7   13:getfield        #29  <Field String sigCode>
		//    8   16:invokestatic    #43  <Method ByteString ByteString.copyFromUtf8(String)>
		//    9   19:invokestatic    #49  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//   10   22:iadd            
		//   11   23:iconst_3        
		//   12   24:aload_0         
		//   13   25:getfield        #34  <Field long sigAddr>
		//   14   28:invokestatic    #53  <Method int CodedOutputStream.computeUInt64Size(int, long)>
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
		//    3    3:getfield        #24  <Field String sigName>
		//    4    6:invokestatic    #43  <Method ByteString ByteString.copyFromUtf8(String)>
		//    5    9:invokevirtual   #61  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(sigCode));
		//    6   12:aload_1         
		//    7   13:iconst_2        
		//    8   14:aload_0         
		//    9   15:getfield        #29  <Field String sigCode>
		//   10   18:invokestatic    #43  <Method ByteString ByteString.copyFromUtf8(String)>
		//   11   21:invokevirtual   #61  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeUInt64(3, sigAddr);
		//   12   24:aload_1         
		//   13   25:iconst_3        
		//   14   26:aload_0         
		//   15   27:getfield        #34  <Field long sigAddr>
		//   16   30:invokevirtual   #65  <Method void CodedOutputStream.writeUInt64(int, long)>
		//   17   33:return          
		}

		private final long sigAddr;
		private final String sigCode;
		private final String sigName;

		public SignalMessage(SignalData signaldata)
		{
			super(3, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:invokespecial   #17  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			sigName = signaldata.name;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #22  <Field String SignalData.name>
		//    8   14:putfield        #24  <Field String sigName>
			sigCode = signaldata.code;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #27  <Field String SignalData.code>
		//   12   22:putfield        #29  <Field String sigCode>
			sigAddr = signaldata.faultAddress;
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getfield        #32  <Field long SignalData.faultAddress>
		//   16   30:putfield        #34  <Field long sigAddr>
		//   17   33:return          
		}
	}

	private static final class ThreadMessage extends ProtobufMessage
	{

		private boolean hasName()
		{
			String s = name;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field String name>
		//    2    4:astore_1        
			return s != null && s.length() > 0;
		//    3    5:aload_1         
		//    4    6:ifnull          18
		//    5    9:aload_1         
		//    6   10:invokevirtual   #33  <Method int String.length()>
		//    7   13:ifle            18
		//    8   16:iconst_1        
		//    9   17:ireturn         
		//   10   18:iconst_0        
		//   11   19:ireturn         
		}

		public int getPropertiesSize()
		{
			int i;
			if(hasName())
		//*   0    0:aload_0         
		//*   1    1:invokespecial   #36  <Method boolean hasName()>
		//*   2    4:ifeq            22
				i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(name));
		//    3    7:iconst_1        
		//    4    8:aload_0         
		//    5    9:getfield        #21  <Field String name>
		//    6   12:invokestatic    #42  <Method ByteString ByteString.copyFromUtf8(String)>
		//    7   15:invokestatic    #48  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//    8   18:istore_1        
			else
		//*   9   19:goto            24
				i = 0;
		//   10   22:iconst_0        
		//   11   23:istore_1        
			return CodedOutputStream.computeUInt32Size(2, importance) + i;
		//   12   24:iconst_2        
		//   13   25:aload_0         
		//   14   26:getfield        #24  <Field int importance>
		//   15   29:invokestatic    #52  <Method int CodedOutputStream.computeUInt32Size(int, int)>
		//   16   32:iload_1         
		//   17   33:iadd            
		//   18   34:ireturn         
		}

		public void writeProperties(CodedOutputStream codedoutputstream)
			throws IOException
		{
			if(hasName())
		//*   0    0:aload_0         
		//*   1    1:invokespecial   #36  <Method boolean hasName()>
		//*   2    4:ifeq            19
				codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(name));
		//    3    7:aload_1         
		//    4    8:iconst_1        
		//    5    9:aload_0         
		//    6   10:getfield        #21  <Field String name>
		//    7   13:invokestatic    #42  <Method ByteString ByteString.copyFromUtf8(String)>
		//    8   16:invokevirtual   #60  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeUInt32(2, importance);
		//    9   19:aload_1         
		//   10   20:iconst_2        
		//   11   21:aload_0         
		//   12   22:getfield        #24  <Field int importance>
		//   13   25:invokevirtual   #64  <Method void CodedOutputStream.writeUInt32(int, int)>
		//   14   28:return          
		}

		private final int importance;
		private final String name;

		public ThreadMessage(ThreadData threaddata, RepeatedMessage repeatedmessage)
		{
			super(1, new ProtobufMessage[] {
				repeatedmessage
			});
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_1        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:dup             
		//    5    7:iconst_0        
		//    6    8:aload_2         
		//    7    9:aastore         
		//    8   10:invokespecial   #16  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			name = threaddata.name;
		//    9   13:aload_0         
		//   10   14:aload_1         
		//   11   15:getfield        #20  <Field String ThreadData.name>
		//   12   18:putfield        #21  <Field String name>
			importance = threaddata.importance;
		//   13   21:aload_0         
		//   14   22:aload_1         
		//   15   23:getfield        #23  <Field int ThreadData.importance>
		//   16   26:putfield        #24  <Field int importance>
		//   17   29:return          
		}
	}


	private static RepeatedMessage createBinaryImagesMessage(BinaryImageData abinaryimagedata[])
	{
		BinaryImageMessage abinaryimagemessage[];
		if(abinaryimagedata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			abinaryimagemessage = new BinaryImageMessage[abinaryimagedata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       BinaryImageMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:goto            17
			abinaryimagemessage = EMPTY_BINARY_IMAGE_MESSAGES;
	//    7   13:getstatic       #75  <Field NativeCrashWriter$BinaryImageMessage[] EMPTY_BINARY_IMAGE_MESSAGES>
	//    8   16:astore_2        
		for(int i = 0; i < abinaryimagemessage.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_2         
	//*  13   21:arraylength     
	//*  14   22:icmpge          45
			abinaryimagemessage[i] = new BinaryImageMessage(abinaryimagedata[i]);
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:new             #9   <Class NativeCrashWriter$BinaryImageMessage>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:aaload          
	//   22   34:invokespecial   #85  <Method void NativeCrashWriter$BinaryImageMessage(BinaryImageData)>
	//   23   37:aastore         

	//   24   38:iload_1         
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore_1        
	//*  28   42:goto            19
		return new RepeatedMessage(((ProtobufMessage []) (abinaryimagemessage)));
	//   29   45:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   30   48:dup             
	//   31   49:aload_2         
	//   32   50:invokespecial   #88  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
	//   33   53:areturn         
	}

	private static RepeatedMessage createCustomAttributesMessage(CustomAttributeData acustomattributedata[])
	{
		CustomAttributeMessage acustomattributemessage[];
		if(acustomattributedata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			acustomattributemessage = new CustomAttributeMessage[acustomattributedata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       CustomAttributeMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:goto            17
			acustomattributemessage = EMPTY_CUSTOM_ATTRIBUTE_MESSAGES;
	//    7   13:getstatic       #77  <Field NativeCrashWriter$CustomAttributeMessage[] EMPTY_CUSTOM_ATTRIBUTE_MESSAGES>
	//    8   16:astore_2        
		for(int i = 0; i < acustomattributemessage.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_2         
	//*  13   21:arraylength     
	//*  14   22:icmpge          45
			acustomattributemessage[i] = new CustomAttributeMessage(acustomattributedata[i]);
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:new             #12  <Class NativeCrashWriter$CustomAttributeMessage>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:aaload          
	//   22   34:invokespecial   #93  <Method void NativeCrashWriter$CustomAttributeMessage(CustomAttributeData)>
	//   23   37:aastore         

	//   24   38:iload_1         
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore_1        
	//*  28   42:goto            19
		return new RepeatedMessage(((ProtobufMessage []) (acustomattributemessage)));
	//   29   45:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   30   48:dup             
	//   31   49:aload_2         
	//   32   50:invokespecial   #88  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
	//   33   53:areturn         
	}

	private static ProtobufMessage createDeviceMessage(DeviceData devicedata)
	{
		if(devicedata == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       12
			return ((ProtobufMessage) (new NullMessage()));
	//    2    4:new             #30  <Class NativeCrashWriter$NullMessage>
	//    3    7:dup             
	//    4    8:invokespecial   #97  <Method void NativeCrashWriter$NullMessage()>
	//    5   11:areturn         
		else
			return ((ProtobufMessage) (new DeviceMessage((float)devicedata.batteryCapacity / 100F, devicedata.batteryVelocity, devicedata.proximity, devicedata.orientation, devicedata.totalPhysicalMemory - devicedata.availablePhysicalMemory, devicedata.totalInternalStorage - devicedata.availableInternalStorage)));
	//    6   12:new             #15  <Class NativeCrashWriter$DeviceMessage>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #103 <Field int DeviceData.batteryCapacity>
	//   10   20:i2f             
	//   11   21:ldc1            #104 <Float 100F>
	//   12   23:fdiv            
	//   13   24:aload_0         
	//   14   25:getfield        #107 <Field int DeviceData.batteryVelocity>
	//   15   28:aload_0         
	//   16   29:getfield        #111 <Field boolean DeviceData.proximity>
	//   17   32:aload_0         
	//   18   33:getfield        #114 <Field int DeviceData.orientation>
	//   19   36:aload_0         
	//   20   37:getfield        #118 <Field long DeviceData.totalPhysicalMemory>
	//   21   40:aload_0         
	//   22   41:getfield        #121 <Field long DeviceData.availablePhysicalMemory>
	//   23   44:lsub            
	//   24   45:aload_0         
	//   25   46:getfield        #124 <Field long DeviceData.totalInternalStorage>
	//   26   49:aload_0         
	//   27   50:getfield        #127 <Field long DeviceData.availableInternalStorage>
	//   28   53:lsub            
	//   29   54:invokespecial   #130 <Method void NativeCrashWriter$DeviceMessage(float, int, boolean, int, long, long)>
	//   30   57:areturn         
	}

	private static EventMessage createEventMessage(SessionEventData sessioneventdata, LogFileManager logfilemanager, Map map)
		throws IOException
	{
		Object obj;
		if(sessioneventdata.signal != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field SignalData SessionEventData.signal>
	//*   2    4:ifnull          15
			obj = ((Object) (sessioneventdata.signal));
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field SignalData SessionEventData.signal>
	//    5   11:astore_3        
		else
	//*   6   12:goto            19
			obj = ((Object) (DEFAULT_SIGNAL));
	//    7   15:getstatic       #67  <Field SignalData DEFAULT_SIGNAL>
	//    8   18:astore_3        
		map = ((Map) (new ApplicationMessage(new ExecutionMessage(new SignalMessage(((SignalData) (obj))), createThreadsMessage(sessioneventdata.threads), createBinaryImagesMessage(sessioneventdata.binaryImages)), createCustomAttributesMessage(mergeCustomAttributes(sessioneventdata.customAttributes, map)))));
	//    9   19:new             #6   <Class NativeCrashWriter$ApplicationMessage>
	//   10   22:dup             
	//   11   23:new             #21  <Class NativeCrashWriter$ExecutionMessage>
	//   12   26:dup             
	//   13   27:new             #39  <Class NativeCrashWriter$SignalMessage>
	//   14   30:dup             
	//   15   31:aload_3         
	//   16   32:invokespecial   #142 <Method void NativeCrashWriter$SignalMessage(SignalData)>
	//   17   35:aload_0         
	//   18   36:getfield        #146 <Field ThreadData[] SessionEventData.threads>
	//   19   39:invokestatic    #150 <Method NativeCrashWriter$RepeatedMessage createThreadsMessage(ThreadData[])>
	//   20   42:aload_0         
	//   21   43:getfield        #154 <Field BinaryImageData[] SessionEventData.binaryImages>
	//   22   46:invokestatic    #156 <Method NativeCrashWriter$RepeatedMessage createBinaryImagesMessage(BinaryImageData[])>
	//   23   49:invokespecial   #159 <Method void NativeCrashWriter$ExecutionMessage(NativeCrashWriter$SignalMessage, NativeCrashWriter$RepeatedMessage, NativeCrashWriter$RepeatedMessage)>
	//   24   52:aload_0         
	//   25   53:getfield        #163 <Field CustomAttributeData[] SessionEventData.customAttributes>
	//   26   56:aload_2         
	//   27   57:invokestatic    #167 <Method CustomAttributeData[] mergeCustomAttributes(CustomAttributeData[], Map)>
	//   28   60:invokestatic    #169 <Method NativeCrashWriter$RepeatedMessage createCustomAttributesMessage(CustomAttributeData[])>
	//   29   63:invokespecial   #172 <Method void NativeCrashWriter$ApplicationMessage(NativeCrashWriter$ExecutionMessage, NativeCrashWriter$RepeatedMessage)>
	//   30   66:astore_2        
		obj = ((Object) (createDeviceMessage(sessioneventdata.deviceData)));
	//   31   67:aload_0         
	//   32   68:getfield        #176 <Field DeviceData SessionEventData.deviceData>
	//   33   71:invokestatic    #178 <Method NativeCrashWriter$ProtobufMessage createDeviceMessage(DeviceData)>
	//   34   74:astore_3        
		ByteString bytestring = logfilemanager.getByteStringForLog();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #184 <Method ByteString LogFileManager.getByteStringForLog()>
	//   37   79:astore          4
		if(bytestring == null)
	//*  38   81:aload           4
	//*  39   83:ifnonnull       98
			Fabric.getLogger().d("CrashlyticsCore", "No log data to include with this event.");
	//   40   86:invokestatic    #190 <Method Logger Fabric.getLogger()>
	//   41   89:ldc1            #192 <String "CrashlyticsCore">
	//   42   91:ldc1            #194 <String "No log data to include with this event.">
	//   43   93:invokeinterface #200 <Method void Logger.d(String, String)>
		logfilemanager.clearLog();
	//   44   98:aload_1         
	//   45   99:invokevirtual   #203 <Method void LogFileManager.clearLog()>
		if(bytestring != null)
	//*  46  102:aload           4
	//*  47  104:ifnull          120
			logfilemanager = ((LogFileManager) (new LogMessage(bytestring)));
	//   48  107:new             #27  <Class NativeCrashWriter$LogMessage>
	//   49  110:dup             
	//   50  111:aload           4
	//   51  113:invokespecial   #206 <Method void NativeCrashWriter$LogMessage(ByteString)>
	//   52  116:astore_1        
		else
	//*  53  117:goto            128
			logfilemanager = ((LogFileManager) (new NullMessage()));
	//   54  120:new             #30  <Class NativeCrashWriter$NullMessage>
	//   55  123:dup             
	//   56  124:invokespecial   #97  <Method void NativeCrashWriter$NullMessage()>
	//   57  127:astore_1        
		return new EventMessage(sessioneventdata.timestamp, "ndk-crash", new ProtobufMessage[] {
			map, obj, logfilemanager
		});
	//   58  128:new             #18  <Class NativeCrashWriter$EventMessage>
	//   59  131:dup             
	//   60  132:aload_0         
	//   61  133:getfield        #209 <Field long SessionEventData.timestamp>
	//   62  136:ldc1            #211 <String "ndk-crash">
	//   63  138:iconst_3        
	//   64  139:anewarray       ProtobufMessage[]
	//   65  142:dup             
	//   66  143:iconst_0        
	//   67  144:aload_2         
	//   68  145:aastore         
	//   69  146:dup             
	//   70  147:iconst_1        
	//   71  148:aload_3         
	//   72  149:aastore         
	//   73  150:dup             
	//   74  151:iconst_2        
	//   75  152:aload_1         
	//   76  153:aastore         
	//   77  154:invokespecial   #214 <Method void NativeCrashWriter$EventMessage(long, String, NativeCrashWriter$ProtobufMessage[])>
	//   78  157:areturn         
	}

	private static RepeatedMessage createFramesMessage(com.crashlytics.android.core.internal.models.ThreadData.FrameData aframedata[])
	{
		FrameMessage aframemessage[];
		if(aframedata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			aframemessage = new FrameMessage[aframedata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       FrameMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:goto            17
			aframemessage = EMPTY_FRAME_MESSAGES;
	//    7   13:getstatic       #73  <Field NativeCrashWriter$FrameMessage[] EMPTY_FRAME_MESSAGES>
	//    8   16:astore_2        
		for(int i = 0; i < aframemessage.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_2         
	//*  13   21:arraylength     
	//*  14   22:icmpge          45
			aframemessage[i] = new FrameMessage(aframedata[i]);
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:new             #24  <Class NativeCrashWriter$FrameMessage>
	//   18   30:dup             
	//   19   31:aload_0         
	//   20   32:iload_1         
	//   21   33:aaload          
	//   22   34:invokespecial   #222 <Method void NativeCrashWriter$FrameMessage(com.crashlytics.android.core.internal.models.ThreadData$FrameData)>
	//   23   37:aastore         

	//   24   38:iload_1         
	//   25   39:iconst_1        
	//   26   40:iadd            
	//   27   41:istore_1        
	//*  28   42:goto            19
		return new RepeatedMessage(((ProtobufMessage []) (aframemessage)));
	//   29   45:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   30   48:dup             
	//   31   49:aload_2         
	//   32   50:invokespecial   #88  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
	//   33   53:areturn         
	}

	private static RepeatedMessage createThreadsMessage(ThreadData athreaddata[])
	{
		ThreadMessage athreadmessage[];
		if(athreaddata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          13
			athreadmessage = new ThreadMessage[athreaddata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       ThreadMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:goto            17
			athreadmessage = EMPTY_THREAD_MESSAGES;
	//    7   13:getstatic       #71  <Field NativeCrashWriter$ThreadMessage[] EMPTY_THREAD_MESSAGES>
	//    8   16:astore_2        
		for(int i = 0; i < athreadmessage.length; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore_1        
	//*  11   19:iload_1         
	//*  12   20:aload_2         
	//*  13   21:arraylength     
	//*  14   22:icmpge          54
		{
			ThreadData threaddata = athreaddata[i];
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:aaload          
	//   18   28:astore_3        
			athreadmessage[i] = new ThreadMessage(threaddata, createFramesMessage(threaddata.frames));
	//   19   29:aload_2         
	//   20   30:iload_1         
	//   21   31:new             #42  <Class NativeCrashWriter$ThreadMessage>
	//   22   34:dup             
	//   23   35:aload_3         
	//   24   36:aload_3         
	//   25   37:getfield        #228 <Field com.crashlytics.android.core.internal.models.ThreadData$FrameData[] ThreadData.frames>
	//   26   40:invokestatic    #230 <Method NativeCrashWriter$RepeatedMessage createFramesMessage(com.crashlytics.android.core.internal.models.ThreadData$FrameData[])>
	//   27   43:invokespecial   #233 <Method void NativeCrashWriter$ThreadMessage(ThreadData, NativeCrashWriter$RepeatedMessage)>
	//   28   46:aastore         
		}

	//   29   47:iload_1         
	//   30   48:iconst_1        
	//   31   49:iadd            
	//   32   50:istore_1        
	//*  33   51:goto            19
		return new RepeatedMessage(((ProtobufMessage []) (athreadmessage)));
	//   34   54:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   35   57:dup             
	//   36   58:aload_2         
	//   37   59:invokespecial   #88  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
	//   38   62:areturn         
	}

	private static CustomAttributeData[] mergeCustomAttributes(CustomAttributeData acustomattributedata[], Map map)
	{
		map = ((Map) (new TreeMap(map)));
	//    0    0:new             #235 <Class TreeMap>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #238 <Method void TreeMap(Map)>
	//    4    8:astore_1        
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore_3        
		if(acustomattributedata != null)
	//*   7   11:aload_0         
	//*   8   12:ifnull          56
		{
			int k = acustomattributedata.length;
	//    9   15:aload_0         
	//   10   16:arraylength     
	//   11   17:istore          4
			for(int i = 0; i < k; i++)
	//*  12   19:iconst_0        
	//*  13   20:istore_2        
	//*  14   21:iload_2         
	//*  15   22:iload           4
	//*  16   24:icmpge          56
			{
				CustomAttributeData customattributedata = acustomattributedata[i];
	//   17   27:aload_0         
	//   18   28:iload_2         
	//   19   29:aaload          
	//   20   30:astore          5
				map.put(((Object) (customattributedata.key)), ((Object) (customattributedata.value)));
	//   21   32:aload_1         
	//   22   33:aload           5
	//   23   35:getfield        #244 <Field String CustomAttributeData.key>
	//   24   38:aload           5
	//   25   40:getfield        #247 <Field String CustomAttributeData.value>
	//   26   43:invokeinterface #253 <Method Object Map.put(Object, Object)>
	//   27   48:pop             
			}

	//   28   49:iload_2         
	//   29   50:iconst_1        
	//   30   51:iadd            
	//   31   52:istore_2        
		}
	//*  32   53:goto            21
		acustomattributedata = ((CustomAttributeData []) ((java.util.Map.Entry[])map.entrySet().toArray(((Object []) (new java.util.Map.Entry[map.size()])))));
	//   33   56:aload_1         
	//   34   57:invokeinterface #257 <Method Set Map.entrySet()>
	//   35   62:aload_1         
	//   36   63:invokeinterface #261 <Method int Map.size()>
	//   37   68:anewarray       java.util.Map.Entry[]
	//   38   71:invokeinterface #269 <Method Object[] Set.toArray(Object[])>
	//   39   76:checkcast       #271 <Class java.util.Map$Entry[]>
	//   40   79:astore_0        
		map = ((Map) (new CustomAttributeData[acustomattributedata.length]));
	//   41   80:aload_0         
	//   42   81:arraylength     
	//   43   82:anewarray       CustomAttributeData[]
	//   44   85:astore_1        
		for(int j = ((int) (flag)); j < map.length; j++)
	//*  45   86:iload_3         
	//*  46   87:istore_2        
	//*  47   88:iload_2         
	//*  48   89:aload_1         
	//*  49   90:arraylength     
	//*  50   91:icmpge          133
			map[j] = ((/*<invalid signature>*/java.lang.Object) (new CustomAttributeData((String)((java.util.Map.Entry) (acustomattributedata[j])).getKey(), (String)((java.util.Map.Entry) (acustomattributedata[j])).getValue())));
	//   51   94:aload_1         
	//   52   95:iload_2         
	//   53   96:new             #240 <Class CustomAttributeData>
	//   54   99:dup             
	//   55  100:aload_0         
	//   56  101:iload_2         
	//   57  102:aaload          
	//   58  103:invokeinterface #275 <Method Object java.util.Map$Entry.getKey()>
	//   59  108:checkcast       #277 <Class String>
	//   60  111:aload_0         
	//   61  112:iload_2         
	//   62  113:aaload          
	//   63  114:invokeinterface #280 <Method Object java.util.Map$Entry.getValue()>
	//   64  119:checkcast       #277 <Class String>
	//   65  122:invokespecial   #282 <Method void CustomAttributeData(String, String)>
	//   66  125:aastore         

	//   67  126:iload_2         
	//   68  127:iconst_1        
	//   69  128:iadd            
	//   70  129:istore_2        
	//*  71  130:goto            88
		return ((CustomAttributeData []) (map));
	//   72  133:aload_1         
	//   73  134:areturn         
	}

	public static void writeNativeCrash(SessionEventData sessioneventdata, LogFileManager logfilemanager, Map map, CodedOutputStream codedoutputstream)
		throws IOException
	{
		createEventMessage(sessioneventdata, logfilemanager, map).write(codedoutputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #287 <Method NativeCrashWriter$EventMessage createEventMessage(SessionEventData, LogFileManager, Map)>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #291 <Method void NativeCrashWriter$EventMessage.write(CodedOutputStream)>
	//    6   10:return          
	}

	private static final SignalData DEFAULT_SIGNAL = new SignalData("", "", 0L);
	private static final BinaryImageMessage EMPTY_BINARY_IMAGE_MESSAGES[] = new BinaryImageMessage[0];
	private static final ProtobufMessage EMPTY_CHILDREN[] = new ProtobufMessage[0];
	private static final CustomAttributeMessage EMPTY_CUSTOM_ATTRIBUTE_MESSAGES[] = new CustomAttributeMessage[0];
	private static final FrameMessage EMPTY_FRAME_MESSAGES[] = new FrameMessage[0];
	private static final ThreadMessage EMPTY_THREAD_MESSAGES[] = new ThreadMessage[0];

	static 
	{
	//    0    0:new             #59  <Class SignalData>
	//    1    3:dup             
	//    2    4:ldc1            #61  <String "">
	//    3    6:ldc1            #61  <String "">
	//    4    8:lconst_0        
	//    5    9:invokespecial   #65  <Method void SignalData(String, String, long)>
	//    6   12:putstatic       #67  <Field SignalData DEFAULT_SIGNAL>
	//    7   15:iconst_0        
	//    8   16:anewarray       ProtobufMessage[]
	//    9   19:putstatic       #69  <Field NativeCrashWriter$ProtobufMessage[] EMPTY_CHILDREN>
	//   10   22:iconst_0        
	//   11   23:anewarray       ThreadMessage[]
	//   12   26:putstatic       #71  <Field NativeCrashWriter$ThreadMessage[] EMPTY_THREAD_MESSAGES>
	//   13   29:iconst_0        
	//   14   30:anewarray       FrameMessage[]
	//   15   33:putstatic       #73  <Field NativeCrashWriter$FrameMessage[] EMPTY_FRAME_MESSAGES>
	//   16   36:iconst_0        
	//   17   37:anewarray       BinaryImageMessage[]
	//   18   40:putstatic       #75  <Field NativeCrashWriter$BinaryImageMessage[] EMPTY_BINARY_IMAGE_MESSAGES>
	//   19   43:iconst_0        
	//   20   44:anewarray       CustomAttributeMessage[]
	//   21   47:putstatic       #77  <Field NativeCrashWriter$CustomAttributeMessage[] EMPTY_CUSTOM_ATTRIBUTE_MESSAGES>
	//*  22   50:return          
	}


/*
	static ProtobufMessage[] access$000()
	{
		return EMPTY_CHILDREN;
	//    0    0:getstatic       #69  <Field NativeCrashWriter$ProtobufMessage[] EMPTY_CHILDREN>
	//    1    3:areturn         
	}

*/
}
