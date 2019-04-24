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

		private static final int PROTOBUF_TAG = 3;

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
		//   12   14:invokespecial   #15  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
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
		//    2    2:getfield        #28  <Field long baseAddr>
		//    3    5:invokestatic    #52  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//    4    8:istore_1        
			int j = CodedOutputStream.computeUInt64Size(2, imageSize);
		//    5    9:iconst_2        
		//    6   10:aload_0         
		//    7   11:getfield        #33  <Field long imageSize>
		//    8   14:invokestatic    #52  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//    9   17:istore_2        
			return CodedOutputStream.computeBytesSize(3, ByteString.copyFromUtf8(filePath)) + i + j + CodedOutputStream.computeBytesSize(4, ByteString.copyFromUtf8(uuid));
		//   10   18:iconst_3        
		//   11   19:aload_0         
		//   12   20:getfield        #38  <Field String filePath>
		//   13   23:invokestatic    #58  <Method ByteString ByteString.copyFromUtf8(String)>
		//   14   26:invokestatic    #62  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//   15   29:iload_1         
		//   16   30:iadd            
		//   17   31:iload_2         
		//   18   32:iadd            
		//   19   33:iconst_4        
		//   20   34:aload_0         
		//   21   35:getfield        #43  <Field String uuid>
		//   22   38:invokestatic    #58  <Method ByteString ByteString.copyFromUtf8(String)>
		//   23   41:invokestatic    #62  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
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
		//    3    3:getfield        #28  <Field long baseAddr>
		//    4    6:invokevirtual   #70  <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeUInt64(2, imageSize);
		//    5    9:aload_1         
		//    6   10:iconst_2        
		//    7   11:aload_0         
		//    8   12:getfield        #33  <Field long imageSize>
		//    9   15:invokevirtual   #70  <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(filePath));
		//   10   18:aload_1         
		//   11   19:iconst_3        
		//   12   20:aload_0         
		//   13   21:getfield        #38  <Field String filePath>
		//   14   24:invokestatic    #58  <Method ByteString ByteString.copyFromUtf8(String)>
		//   15   27:invokevirtual   #74  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeBytes(4, ByteString.copyFromUtf8(uuid));
		//   16   30:aload_1         
		//   17   31:iconst_4        
		//   18   32:aload_0         
		//   19   33:getfield        #43  <Field String uuid>
		//   20   36:invokestatic    #58  <Method ByteString ByteString.copyFromUtf8(String)>
		//   21   39:invokevirtual   #74  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		//   22   42:return          
		}

		private static final int PROTOBUF_TAG = 4;
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
		//    4    6:invokespecial   #21  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			baseAddr = binaryimagedata.baseAddress;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #26  <Field long BinaryImageData.baseAddress>
		//    8   14:putfield        #28  <Field long baseAddr>
			imageSize = binaryimagedata.size;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #31  <Field long BinaryImageData.size>
		//   12   22:putfield        #33  <Field long imageSize>
			filePath = binaryimagedata.path;
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getfield        #36  <Field String BinaryImageData.path>
		//   16   30:putfield        #38  <Field String filePath>
			uuid = binaryimagedata.id;
		//   17   33:aload_0         
		//   18   34:aload_1         
		//   19   35:getfield        #41  <Field String BinaryImageData.id>
		//   20   38:putfield        #43  <Field String uuid>
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
		//    2    2:getfield        #23  <Field String key>
		//    3    5:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
		//    4    8:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//    5   11:istore_1        
			String s;
			if(value == null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #26  <Field String value>
		//*   8   16:ifnonnull       33
				s = "";
		//    9   19:ldc1            #43  <String "">
		//   10   21:astore_2        
			else
		//*  11   22:iload_1         
		//*  12   23:iconst_2        
		//*  13   24:aload_2         
		//*  14   25:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
		//*  15   28:invokestatic    #41  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//*  16   31:iadd            
		//*  17   32:ireturn         
				s = value;
		//   18   33:aload_0         
		//   19   34:getfield        #26  <Field String value>
		//   20   37:astore_2        
			return i + CodedOutputStream.computeBytesSize(2, ByteString.copyFromUtf8(s));
		//*  21   38:goto            22
		}

		public void writeProperties(CodedOutputStream codedoutputstream)
			throws IOException
		{
			codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(key));
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:aload_0         
		//    3    3:getfield        #23  <Field String key>
		//    4    6:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
		//    5    9:invokevirtual   #51  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			String s;
			if(value == null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #26  <Field String value>
		//*   8   16:ifnonnull       32
				s = "";
		//    9   19:ldc1            #43  <String "">
		//   10   21:astore_2        
			else
		//*  11   22:aload_1         
		//*  12   23:iconst_2        
		//*  13   24:aload_2         
		//*  14   25:invokestatic    #35  <Method ByteString ByteString.copyFromUtf8(String)>
		//*  15   28:invokevirtual   #51  <Method void CodedOutputStream.writeBytes(int, ByteString)>
		//*  16   31:return          
				s = value;
		//   17   32:aload_0         
		//   18   33:getfield        #26  <Field String value>
		//   19   36:astore_2        
			codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(s));
		//*  20   37:goto            22
		}

		private static final int PROTOBUF_TAG = 2;
		private final String key;
		private final String value;

		public CustomAttributeMessage(CustomAttributeData customattributedata)
		{
			super(2, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
		//    4    6:invokespecial   #18  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			key = customattributedata.key;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #22  <Field String CustomAttributeData.key>
		//    8   14:putfield        #23  <Field String key>
			value = customattributedata.value;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #25  <Field String CustomAttributeData.value>
		//   12   22:putfield        #26  <Field String value>
		//   13   25:return          
		}
	}

	private static final class DeviceMessage extends ProtobufMessage
	{

		public int getPropertiesSize()
		{
			return 0 + CodedOutputStream.computeFloatSize(1, batteryLevel) + CodedOutputStream.computeSInt32Size(2, batteryVelocity) + CodedOutputStream.computeBoolSize(3, proximityOn) + CodedOutputStream.computeUInt32Size(4, orientation) + CodedOutputStream.computeUInt64Size(5, ramUsed) + CodedOutputStream.computeUInt64Size(6, diskUsed);
		//    0    0:iconst_0        
		//    1    1:iconst_1        
		//    2    2:aload_0         
		//    3    3:getfield        #26  <Field float batteryLevel>
		//    4    6:invokestatic    #45  <Method int CodedOutputStream.computeFloatSize(int, float)>
		//    5    9:iadd            
		//    6   10:iconst_2        
		//    7   11:aload_0         
		//    8   12:getfield        #28  <Field int batteryVelocity>
		//    9   15:invokestatic    #49  <Method int CodedOutputStream.computeSInt32Size(int, int)>
		//   10   18:iadd            
		//   11   19:iconst_3        
		//   12   20:aload_0         
		//   13   21:getfield        #30  <Field boolean proximityOn>
		//   14   24:invokestatic    #53  <Method int CodedOutputStream.computeBoolSize(int, boolean)>
		//   15   27:iadd            
		//   16   28:iconst_4        
		//   17   29:aload_0         
		//   18   30:getfield        #32  <Field int orientation>
		//   19   33:invokestatic    #56  <Method int CodedOutputStream.computeUInt32Size(int, int)>
		//   20   36:iadd            
		//   21   37:iconst_5        
		//   22   38:aload_0         
		//   23   39:getfield        #34  <Field long ramUsed>
		//   24   42:invokestatic    #60  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//   25   45:iadd            
		//   26   46:bipush          6
		//   27   48:aload_0         
		//   28   49:getfield        #36  <Field long diskUsed>
		//   29   52:invokestatic    #60  <Method int CodedOutputStream.computeUInt64Size(int, long)>
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
		//    3    3:getfield        #26  <Field float batteryLevel>
		//    4    6:invokevirtual   #68  <Method void CodedOutputStream.writeFloat(int, float)>
			codedoutputstream.writeSInt32(2, batteryVelocity);
		//    5    9:aload_1         
		//    6   10:iconst_2        
		//    7   11:aload_0         
		//    8   12:getfield        #28  <Field int batteryVelocity>
		//    9   15:invokevirtual   #72  <Method void CodedOutputStream.writeSInt32(int, int)>
			codedoutputstream.writeBool(3, proximityOn);
		//   10   18:aload_1         
		//   11   19:iconst_3        
		//   12   20:aload_0         
		//   13   21:getfield        #30  <Field boolean proximityOn>
		//   14   24:invokevirtual   #76  <Method void CodedOutputStream.writeBool(int, boolean)>
			codedoutputstream.writeUInt32(4, orientation);
		//   15   27:aload_1         
		//   16   28:iconst_4        
		//   17   29:aload_0         
		//   18   30:getfield        #32  <Field int orientation>
		//   19   33:invokevirtual   #79  <Method void CodedOutputStream.writeUInt32(int, int)>
			codedoutputstream.writeUInt64(5, ramUsed);
		//   20   36:aload_1         
		//   21   37:iconst_5        
		//   22   38:aload_0         
		//   23   39:getfield        #34  <Field long ramUsed>
		//   24   42:invokevirtual   #83  <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeUInt64(6, diskUsed);
		//   25   45:aload_1         
		//   26   46:bipush          6
		//   27   48:aload_0         
		//   28   49:getfield        #36  <Field long diskUsed>
		//   29   52:invokevirtual   #83  <Method void CodedOutputStream.writeUInt64(int, long)>
		//   30   55:return          
		}

		private static final int PROTOBUF_TAG = 5;
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
		//    4    6:invokespecial   #24  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			batteryLevel = f;
		//    5    9:aload_0         
		//    6   10:fload_1         
		//    7   11:putfield        #26  <Field float batteryLevel>
			batteryVelocity = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #28  <Field int batteryVelocity>
			proximityOn = flag;
		//   11   19:aload_0         
		//   12   20:iload_3         
		//   13   21:putfield        #30  <Field boolean proximityOn>
			orientation = j;
		//   14   24:aload_0         
		//   15   25:iload           4
		//   16   27:putfield        #32  <Field int orientation>
			ramUsed = l;
		//   17   30:aload_0         
		//   18   31:lload           5
		//   19   33:putfield        #34  <Field long ramUsed>
			diskUsed = l1;
		//   20   36:aload_0         
		//   21   37:lload           7
		//   22   39:putfield        #36  <Field long diskUsed>
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

		public transient EventMessage(long l, String s, ProtobufMessage aprotobufmessage[])
		{
			super(10, aprotobufmessage);
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

	private static final class ExecutionMessage extends ProtobufMessage
	{

		private static final int PROTOBUF_TAG = 1;

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
		//   16   18:invokespecial   #15  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
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
		//    2    2:getfield        #27  <Field long address>
		//    3    5:invokestatic    #48  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//    4    8:iconst_2        
		//    5    9:aload_0         
		//    6   10:getfield        #30  <Field String symbol>
		//    7   13:invokestatic    #54  <Method ByteString ByteString.copyFromUtf8(String)>
		//    8   16:invokestatic    #58  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//    9   19:iadd            
		//   10   20:iconst_3        
		//   11   21:aload_0         
		//   12   22:getfield        #33  <Field String file>
		//   13   25:invokestatic    #54  <Method ByteString ByteString.copyFromUtf8(String)>
		//   14   28:invokestatic    #58  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//   15   31:iadd            
		//   16   32:iconst_4        
		//   17   33:aload_0         
		//   18   34:getfield        #36  <Field long offset>
		//   19   37:invokestatic    #48  <Method int CodedOutputStream.computeUInt64Size(int, long)>
		//   20   40:iadd            
		//   21   41:iconst_5        
		//   22   42:aload_0         
		//   23   43:getfield        #39  <Field int importance>
		//   24   46:invokestatic    #62  <Method int CodedOutputStream.computeUInt32Size(int, int)>
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
		//    3    3:getfield        #27  <Field long address>
		//    4    6:invokevirtual   #70  <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeBytes(2, ByteString.copyFromUtf8(symbol));
		//    5    9:aload_1         
		//    6   10:iconst_2        
		//    7   11:aload_0         
		//    8   12:getfield        #30  <Field String symbol>
		//    9   15:invokestatic    #54  <Method ByteString ByteString.copyFromUtf8(String)>
		//   10   18:invokevirtual   #74  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeBytes(3, ByteString.copyFromUtf8(file));
		//   11   21:aload_1         
		//   12   22:iconst_3        
		//   13   23:aload_0         
		//   14   24:getfield        #33  <Field String file>
		//   15   27:invokestatic    #54  <Method ByteString ByteString.copyFromUtf8(String)>
		//   16   30:invokevirtual   #74  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeUInt64(4, offset);
		//   17   33:aload_1         
		//   18   34:iconst_4        
		//   19   35:aload_0         
		//   20   36:getfield        #36  <Field long offset>
		//   21   39:invokevirtual   #70  <Method void CodedOutputStream.writeUInt64(int, long)>
			codedoutputstream.writeUInt32(5, importance);
		//   22   42:aload_1         
		//   23   43:iconst_5        
		//   24   44:aload_0         
		//   25   45:getfield        #39  <Field int importance>
		//   26   48:invokevirtual   #78  <Method void CodedOutputStream.writeUInt32(int, int)>
		//   27   51:return          
		}

		private static final int PROTOBUF_TAG = 3;
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
		//    4    6:invokespecial   #22  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			address = framedata.address;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:getfield        #26  <Field long com.crashlytics.android.core.internal.models.ThreadData$FrameData.address>
		//    8   14:putfield        #27  <Field long address>
			symbol = framedata.symbol;
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:getfield        #29  <Field String com.crashlytics.android.core.internal.models.ThreadData$FrameData.symbol>
		//   12   22:putfield        #30  <Field String symbol>
			file = framedata.file;
		//   13   25:aload_0         
		//   14   26:aload_1         
		//   15   27:getfield        #32  <Field String com.crashlytics.android.core.internal.models.ThreadData$FrameData.file>
		//   16   30:putfield        #33  <Field String file>
			offset = framedata.offset;
		//   17   33:aload_0         
		//   18   34:aload_1         
		//   19   35:getfield        #35  <Field long com.crashlytics.android.core.internal.models.ThreadData$FrameData.offset>
		//   20   38:putfield        #36  <Field long offset>
			importance = framedata.importance;
		//   21   41:aload_0         
		//   22   42:aload_1         
		//   23   43:getfield        #38  <Field int com.crashlytics.android.core.internal.models.ThreadData$FrameData.importance>
		//   24   46:putfield        #39  <Field int importance>
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

		public LogMessage(ByteString bytestring)
		{
			super(6, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:bipush          6
		//    2    3:iconst_0        
		//    3    4:anewarray       ProtobufMessage[]
		//    4    7:invokespecial   #17  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			logBytes = bytestring;
		//    5   10:aload_0         
		//    6   11:aload_1         
		//    7   12:putfield        #19  <Field ByteString logBytes>
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
		//    4    6:getfield        #20  <Field NativeCrashWriter$ProtobufMessage[] children>
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
		//   13   23:getfield        #20  <Field NativeCrashWriter$ProtobufMessage[] children>
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
		//*   6   10:ifnull          19
		//*   7   13:aload_0         
		//*   8   14:aload_2         
		//*   9   15:putfield        #20  <Field NativeCrashWriter$ProtobufMessage[] children>
		//*  10   18:return          
				aprotobufmessage = NativeCrashWriter.EMPTY_CHILDREN;
		//   11   19:invokestatic    #24  <Method NativeCrashWriter$ProtobufMessage[] NativeCrashWriter.access$000()>
		//   12   22:astore_2        
			children = aprotobufmessage;
		//*  13   23:goto            13
		}
	}

	private static final class RepeatedMessage extends ProtobufMessage
	{

		public int getSize()
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			ProtobufMessage aprotobufmessage[] = messages;
		//    2    2:aload_0         
		//    3    3:getfield        #16  <Field NativeCrashWriter$ProtobufMessage[] messages>
		//    4    6:astore          4
			int k = aprotobufmessage.length;
		//    5    8:aload           4
		//    6   10:arraylength     
		//    7   11:istore_3        
			for(int i = 0; i < k; i++)
		//*   8   12:iconst_0        
		//*   9   13:istore_1        
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

		public SignalMessage(SignalData signaldata)
		{
			super(3, new ProtobufMessage[0]);
		//    0    0:aload_0         
		//    1    1:iconst_3        
		//    2    2:iconst_0        
		//    3    3:anewarray       ProtobufMessage[]
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

	private static final class ThreadMessage extends ProtobufMessage
	{

		private boolean hasName()
		{
			return name != null && name.length() > 0;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field String name>
		//    2    4:ifnull          19
		//    3    7:aload_0         
		//    4    8:getfield        #23  <Field String name>
		//    5   11:invokevirtual   #35  <Method int String.length()>
		//    6   14:ifle            19
		//    7   17:iconst_1        
		//    8   18:ireturn         
		//    9   19:iconst_0        
		//   10   20:ireturn         
		}

		public int getPropertiesSize()
		{
			int i;
			if(hasName())
		//*   0    0:aload_0         
		//*   1    1:invokespecial   #38  <Method boolean hasName()>
		//*   2    4:ifeq            30
				i = CodedOutputStream.computeBytesSize(1, ByteString.copyFromUtf8(name));
		//    3    7:iconst_1        
		//    4    8:aload_0         
		//    5    9:getfield        #23  <Field String name>
		//    6   12:invokestatic    #44  <Method ByteString ByteString.copyFromUtf8(String)>
		//    7   15:invokestatic    #50  <Method int CodedOutputStream.computeBytesSize(int, ByteString)>
		//    8   18:istore_1        
			else
		//*   9   19:iconst_2        
		//*  10   20:aload_0         
		//*  11   21:getfield        #26  <Field int importance>
		//*  12   24:invokestatic    #54  <Method int CodedOutputStream.computeUInt32Size(int, int)>
		//*  13   27:iload_1         
		//*  14   28:iadd            
		//*  15   29:ireturn         
				i = 0;
		//   16   30:iconst_0        
		//   17   31:istore_1        
			return CodedOutputStream.computeUInt32Size(2, importance) + i;
		//*  18   32:goto            19
		}

		public void writeProperties(CodedOutputStream codedoutputstream)
			throws IOException
		{
			if(hasName())
		//*   0    0:aload_0         
		//*   1    1:invokespecial   #38  <Method boolean hasName()>
		//*   2    4:ifeq            19
				codedoutputstream.writeBytes(1, ByteString.copyFromUtf8(name));
		//    3    7:aload_1         
		//    4    8:iconst_1        
		//    5    9:aload_0         
		//    6   10:getfield        #23  <Field String name>
		//    7   13:invokestatic    #44  <Method ByteString ByteString.copyFromUtf8(String)>
		//    8   16:invokevirtual   #62  <Method void CodedOutputStream.writeBytes(int, ByteString)>
			codedoutputstream.writeUInt32(2, importance);
		//    9   19:aload_1         
		//   10   20:iconst_2        
		//   11   21:aload_0         
		//   12   22:getfield        #26  <Field int importance>
		//   13   25:invokevirtual   #66  <Method void CodedOutputStream.writeUInt32(int, int)>
		//   14   28:return          
		}

		private static final int PROTOBUF_TAG = 1;
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
		//    8   10:invokespecial   #18  <Method void NativeCrashWriter$ProtobufMessage(int, NativeCrashWriter$ProtobufMessage[])>
			name = threaddata.name;
		//    9   13:aload_0         
		//   10   14:aload_1         
		//   11   15:getfield        #22  <Field String ThreadData.name>
		//   12   18:putfield        #23  <Field String name>
			importance = threaddata.importance;
		//   13   21:aload_0         
		//   14   22:aload_1         
		//   15   23:getfield        #25  <Field int ThreadData.importance>
		//   16   26:putfield        #26  <Field int importance>
		//   17   29:return          
		}
	}


	NativeCrashWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void Object()>
	//    2    4:return          
	}

	private static RepeatedMessage createBinaryImagesMessage(BinaryImageData abinaryimagedata[])
	{
		int i;
		BinaryImageMessage abinaryimagemessage[];
		if(abinaryimagedata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          38
			abinaryimagemessage = new BinaryImageMessage[abinaryimagedata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       BinaryImageMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_2         
	//*  10   14:arraylength     
	//*  11   15:icmpge          45
	//*  12   18:aload_2         
	//*  13   19:iload_1         
	//*  14   20:new             #9   <Class NativeCrashWriter$BinaryImageMessage>
	//*  15   23:dup             
	//*  16   24:aload_0         
	//*  17   25:iload_1         
	//*  18   26:aaload          
	//*  19   27:invokespecial   #91  <Method void NativeCrashWriter$BinaryImageMessage(BinaryImageData)>
	//*  20   30:aastore         
	//*  21   31:iload_1         
	//*  22   32:iconst_1        
	//*  23   33:iadd            
	//*  24   34:istore_1        
	//*  25   35:goto            12
			abinaryimagemessage = EMPTY_BINARY_IMAGE_MESSAGES;
	//   26   38:getstatic       #79  <Field NativeCrashWriter$BinaryImageMessage[] EMPTY_BINARY_IMAGE_MESSAGES>
	//   27   41:astore_2        
		for(i = 0; i < abinaryimagemessage.length; i++)
			abinaryimagemessage[i] = new BinaryImageMessage(abinaryimagedata[i]);

	//*  28   42:goto            10
		return new RepeatedMessage(((ProtobufMessage []) (abinaryimagemessage)));
	//   29   45:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   30   48:dup             
	//   31   49:aload_2         
	//   32   50:invokespecial   #94  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
	//   33   53:areturn         
	}

	private static RepeatedMessage createCustomAttributesMessage(CustomAttributeData acustomattributedata[])
	{
		int i;
		CustomAttributeMessage acustomattributemessage[];
		if(acustomattributedata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          38
			acustomattributemessage = new CustomAttributeMessage[acustomattributedata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       CustomAttributeMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_2         
	//*  10   14:arraylength     
	//*  11   15:icmpge          45
	//*  12   18:aload_2         
	//*  13   19:iload_1         
	//*  14   20:new             #12  <Class NativeCrashWriter$CustomAttributeMessage>
	//*  15   23:dup             
	//*  16   24:aload_0         
	//*  17   25:iload_1         
	//*  18   26:aaload          
	//*  19   27:invokespecial   #99  <Method void NativeCrashWriter$CustomAttributeMessage(CustomAttributeData)>
	//*  20   30:aastore         
	//*  21   31:iload_1         
	//*  22   32:iconst_1        
	//*  23   33:iadd            
	//*  24   34:istore_1        
	//*  25   35:goto            12
			acustomattributemessage = EMPTY_CUSTOM_ATTRIBUTE_MESSAGES;
	//   26   38:getstatic       #81  <Field NativeCrashWriter$CustomAttributeMessage[] EMPTY_CUSTOM_ATTRIBUTE_MESSAGES>
	//   27   41:astore_2        
		for(i = 0; i < acustomattributemessage.length; i++)
			acustomattributemessage[i] = new CustomAttributeMessage(acustomattributedata[i]);

	//*  28   42:goto            10
		return new RepeatedMessage(((ProtobufMessage []) (acustomattributemessage)));
	//   29   45:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   30   48:dup             
	//   31   49:aload_2         
	//   32   50:invokespecial   #94  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
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
	//    4    8:invokespecial   #102 <Method void NativeCrashWriter$NullMessage()>
	//    5   11:areturn         
		else
			return ((ProtobufMessage) (new DeviceMessage((float)devicedata.batteryCapacity / 100F, devicedata.batteryVelocity, devicedata.proximity, devicedata.orientation, devicedata.totalPhysicalMemory - devicedata.availablePhysicalMemory, devicedata.totalInternalStorage - devicedata.availableInternalStorage)));
	//    6   12:new             #15  <Class NativeCrashWriter$DeviceMessage>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #108 <Field int DeviceData.batteryCapacity>
	//   10   20:i2f             
	//   11   21:ldc1            #109 <Float 100F>
	//   12   23:fdiv            
	//   13   24:aload_0         
	//   14   25:getfield        #112 <Field int DeviceData.batteryVelocity>
	//   15   28:aload_0         
	//   16   29:getfield        #116 <Field boolean DeviceData.proximity>
	//   17   32:aload_0         
	//   18   33:getfield        #119 <Field int DeviceData.orientation>
	//   19   36:aload_0         
	//   20   37:getfield        #123 <Field long DeviceData.totalPhysicalMemory>
	//   21   40:aload_0         
	//   22   41:getfield        #126 <Field long DeviceData.availablePhysicalMemory>
	//   23   44:lsub            
	//   24   45:aload_0         
	//   25   46:getfield        #129 <Field long DeviceData.totalInternalStorage>
	//   26   49:aload_0         
	//   27   50:getfield        #132 <Field long DeviceData.availableInternalStorage>
	//   28   53:lsub            
	//   29   54:invokespecial   #135 <Method void NativeCrashWriter$DeviceMessage(float, int, boolean, int, long, long)>
	//   30   57:areturn         
	}

	private static EventMessage createEventMessage(SessionEventData sessioneventdata, LogFileManager logfilemanager, Map map)
		throws IOException
	{
		Object obj;
		ByteString bytestring;
		if(sessioneventdata.signal != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field SignalData SessionEventData.signal>
	//*   2    4:ifnull          140
			obj = ((Object) (sessioneventdata.signal));
	//    3    7:aload_0         
	//    4    8:getfield        #144 <Field SignalData SessionEventData.signal>
	//    5   11:astore_3        
		else
	//*   6   12:new             #6   <Class NativeCrashWriter$ApplicationMessage>
	//*   7   15:dup             
	//*   8   16:new             #21  <Class NativeCrashWriter$ExecutionMessage>
	//*   9   19:dup             
	//*  10   20:new             #39  <Class NativeCrashWriter$SignalMessage>
	//*  11   23:dup             
	//*  12   24:aload_3         
	//*  13   25:invokespecial   #147 <Method void NativeCrashWriter$SignalMessage(SignalData)>
	//*  14   28:aload_0         
	//*  15   29:getfield        #151 <Field ThreadData[] SessionEventData.threads>
	//*  16   32:invokestatic    #155 <Method NativeCrashWriter$RepeatedMessage createThreadsMessage(ThreadData[])>
	//*  17   35:aload_0         
	//*  18   36:getfield        #159 <Field BinaryImageData[] SessionEventData.binaryImages>
	//*  19   39:invokestatic    #161 <Method NativeCrashWriter$RepeatedMessage createBinaryImagesMessage(BinaryImageData[])>
	//*  20   42:invokespecial   #164 <Method void NativeCrashWriter$ExecutionMessage(NativeCrashWriter$SignalMessage, NativeCrashWriter$RepeatedMessage, NativeCrashWriter$RepeatedMessage)>
	//*  21   45:aload_0         
	//*  22   46:getfield        #168 <Field CustomAttributeData[] SessionEventData.customAttributes>
	//*  23   49:aload_2         
	//*  24   50:invokestatic    #172 <Method CustomAttributeData[] mergeCustomAttributes(CustomAttributeData[], Map)>
	//*  25   53:invokestatic    #174 <Method NativeCrashWriter$RepeatedMessage createCustomAttributesMessage(CustomAttributeData[])>
	//*  26   56:invokespecial   #177 <Method void NativeCrashWriter$ApplicationMessage(NativeCrashWriter$ExecutionMessage, NativeCrashWriter$RepeatedMessage)>
	//*  27   59:astore_2        
	//*  28   60:aload_0         
	//*  29   61:getfield        #181 <Field DeviceData SessionEventData.deviceData>
	//*  30   64:invokestatic    #183 <Method NativeCrashWriter$ProtobufMessage createDeviceMessage(DeviceData)>
	//*  31   67:astore_3        
	//*  32   68:aload_1         
	//*  33   69:invokevirtual   #189 <Method ByteString LogFileManager.getByteStringForLog()>
	//*  34   72:astore          4
	//*  35   74:aload           4
	//*  36   76:ifnonnull       91
	//*  37   79:invokestatic    #195 <Method Logger Fabric.getLogger()>
	//*  38   82:ldc1            #197 <String "CrashlyticsCore">
	//*  39   84:ldc1            #199 <String "No log data to include with this event.">
	//*  40   86:invokeinterface #205 <Method void Logger.d(String, String)>
	//*  41   91:aload_1         
	//*  42   92:invokevirtual   #208 <Method void LogFileManager.clearLog()>
	//*  43   95:aload           4
	//*  44   97:ifnull          147
	//*  45  100:new             #27  <Class NativeCrashWriter$LogMessage>
	//*  46  103:dup             
	//*  47  104:aload           4
	//*  48  106:invokespecial   #211 <Method void NativeCrashWriter$LogMessage(ByteString)>
	//*  49  109:astore_1        
	//*  50  110:new             #18  <Class NativeCrashWriter$EventMessage>
	//*  51  113:dup             
	//*  52  114:aload_0         
	//*  53  115:getfield        #214 <Field long SessionEventData.timestamp>
	//*  54  118:ldc1            #59  <String "ndk-crash">
	//*  55  120:iconst_3        
	//*  56  121:anewarray       ProtobufMessage[]
	//*  57  124:dup             
	//*  58  125:iconst_0        
	//*  59  126:aload_2         
	//*  60  127:aastore         
	//*  61  128:dup             
	//*  62  129:iconst_1        
	//*  63  130:aload_3         
	//*  64  131:aastore         
	//*  65  132:dup             
	//*  66  133:iconst_2        
	//*  67  134:aload_1         
	//*  68  135:aastore         
	//*  69  136:invokespecial   #217 <Method void NativeCrashWriter$EventMessage(long, String, NativeCrashWriter$ProtobufMessage[])>
	//*  70  139:areturn         
			obj = ((Object) (DEFAULT_SIGNAL));
	//   71  140:getstatic       #71  <Field SignalData DEFAULT_SIGNAL>
	//   72  143:astore_3        
		map = ((Map) (new ApplicationMessage(new ExecutionMessage(new SignalMessage(((SignalData) (obj))), createThreadsMessage(sessioneventdata.threads), createBinaryImagesMessage(sessioneventdata.binaryImages)), createCustomAttributesMessage(mergeCustomAttributes(sessioneventdata.customAttributes, map)))));
		obj = ((Object) (createDeviceMessage(sessioneventdata.deviceData)));
		bytestring = logfilemanager.getByteStringForLog();
		if(bytestring == null)
			Fabric.getLogger().d("CrashlyticsCore", "No log data to include with this event.");
		logfilemanager.clearLog();
		if(bytestring != null)
			logfilemanager = ((LogFileManager) (new LogMessage(bytestring)));
		else
	//*  73  144:goto            12
			logfilemanager = ((LogFileManager) (new NullMessage()));
	//   74  147:new             #30  <Class NativeCrashWriter$NullMessage>
	//   75  150:dup             
	//   76  151:invokespecial   #102 <Method void NativeCrashWriter$NullMessage()>
	//   77  154:astore_1        
		return new EventMessage(sessioneventdata.timestamp, "ndk-crash", new ProtobufMessage[] {
			map, obj, logfilemanager
		});
	//*  78  155:goto            110
	}

	private static RepeatedMessage createFramesMessage(com.crashlytics.android.core.internal.models.ThreadData.FrameData aframedata[])
	{
		int i;
		FrameMessage aframemessage[];
		if(aframedata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          38
			aframemessage = new FrameMessage[aframedata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       FrameMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_2         
	//*  10   14:arraylength     
	//*  11   15:icmpge          45
	//*  12   18:aload_2         
	//*  13   19:iload_1         
	//*  14   20:new             #24  <Class NativeCrashWriter$FrameMessage>
	//*  15   23:dup             
	//*  16   24:aload_0         
	//*  17   25:iload_1         
	//*  18   26:aaload          
	//*  19   27:invokespecial   #225 <Method void NativeCrashWriter$FrameMessage(com.crashlytics.android.core.internal.models.ThreadData$FrameData)>
	//*  20   30:aastore         
	//*  21   31:iload_1         
	//*  22   32:iconst_1        
	//*  23   33:iadd            
	//*  24   34:istore_1        
	//*  25   35:goto            12
			aframemessage = EMPTY_FRAME_MESSAGES;
	//   26   38:getstatic       #77  <Field NativeCrashWriter$FrameMessage[] EMPTY_FRAME_MESSAGES>
	//   27   41:astore_2        
		for(i = 0; i < aframemessage.length; i++)
			aframemessage[i] = new FrameMessage(aframedata[i]);

	//*  28   42:goto            10
		return new RepeatedMessage(((ProtobufMessage []) (aframemessage)));
	//   29   45:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   30   48:dup             
	//   31   49:aload_2         
	//   32   50:invokespecial   #94  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
	//   33   53:areturn         
	}

	private static RepeatedMessage createThreadsMessage(ThreadData athreaddata[])
	{
		int i;
		ThreadMessage athreadmessage[];
		if(athreaddata != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          47
			athreadmessage = new ThreadMessage[athreaddata.length];
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:anewarray       ThreadMessage[]
	//    5    9:astore_2        
		else
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_1         
	//*   9   13:aload_2         
	//*  10   14:arraylength     
	//*  11   15:icmpge          54
	//*  12   18:aload_0         
	//*  13   19:iload_1         
	//*  14   20:aaload          
	//*  15   21:astore_3        
	//*  16   22:aload_2         
	//*  17   23:iload_1         
	//*  18   24:new             #42  <Class NativeCrashWriter$ThreadMessage>
	//*  19   27:dup             
	//*  20   28:aload_3         
	//*  21   29:aload_3         
	//*  22   30:getfield        #231 <Field com.crashlytics.android.core.internal.models.ThreadData$FrameData[] ThreadData.frames>
	//*  23   33:invokestatic    #233 <Method NativeCrashWriter$RepeatedMessage createFramesMessage(com.crashlytics.android.core.internal.models.ThreadData$FrameData[])>
	//*  24   36:invokespecial   #236 <Method void NativeCrashWriter$ThreadMessage(ThreadData, NativeCrashWriter$RepeatedMessage)>
	//*  25   39:aastore         
	//*  26   40:iload_1         
	//*  27   41:iconst_1        
	//*  28   42:iadd            
	//*  29   43:istore_1        
	//*  30   44:goto            12
			athreadmessage = EMPTY_THREAD_MESSAGES;
	//   31   47:getstatic       #75  <Field NativeCrashWriter$ThreadMessage[] EMPTY_THREAD_MESSAGES>
	//   32   50:astore_2        
		for(i = 0; i < athreadmessage.length; i++)
		{
			ThreadData threaddata = athreaddata[i];
			athreadmessage[i] = new ThreadMessage(threaddata, createFramesMessage(threaddata.frames));
		}

	//*  33   51:goto            10
		return new RepeatedMessage(((ProtobufMessage []) (athreadmessage)));
	//   34   54:new             #36  <Class NativeCrashWriter$RepeatedMessage>
	//   35   57:dup             
	//   36   58:aload_2         
	//   37   59:invokespecial   #94  <Method void NativeCrashWriter$RepeatedMessage(NativeCrashWriter$ProtobufMessage[])>
	//   38   62:areturn         
	}

	private static CustomAttributeData[] mergeCustomAttributes(CustomAttributeData acustomattributedata[], Map map)
	{
		map = ((Map) (new TreeMap(map)));
	//    0    0:new             #238 <Class TreeMap>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #241 <Method void TreeMap(Map)>
	//    4    8:astore_1        
		if(acustomattributedata != null)
	//*   5    9:aload_0         
	//*   6   10:ifnull          52
		{
			int k = acustomattributedata.length;
	//    7   13:aload_0         
	//    8   14:arraylength     
	//    9   15:istore_3        
			for(int i = 0; i < k; i++)
	//*  10   16:iconst_0        
	//*  11   17:istore_2        
	//*  12   18:iload_2         
	//*  13   19:iload_3         
	//*  14   20:icmpge          52
			{
				CustomAttributeData customattributedata = acustomattributedata[i];
	//   15   23:aload_0         
	//   16   24:iload_2         
	//   17   25:aaload          
	//   18   26:astore          4
				map.put(((Object) (customattributedata.key)), ((Object) (customattributedata.value)));
	//   19   28:aload_1         
	//   20   29:aload           4
	//   21   31:getfield        #246 <Field String CustomAttributeData.key>
	//   22   34:aload           4
	//   23   36:getfield        #249 <Field String CustomAttributeData.value>
	//   24   39:invokeinterface #255 <Method Object Map.put(Object, Object)>
	//   25   44:pop             
			}

	//   26   45:iload_2         
	//   27   46:iconst_1        
	//   28   47:iadd            
	//   29   48:istore_2        
		}
	//*  30   49:goto            18
		acustomattributedata = ((CustomAttributeData []) ((java.util.Map.Entry[])map.entrySet().toArray(((Object []) (new java.util.Map.Entry[map.size()])))));
	//   31   52:aload_1         
	//   32   53:invokeinterface #259 <Method Set Map.entrySet()>
	//   33   58:aload_1         
	//   34   59:invokeinterface #263 <Method int Map.size()>
	//   35   64:anewarray       java.util.Map.Entry[]
	//   36   67:invokeinterface #271 <Method Object[] Set.toArray(Object[])>
	//   37   72:checkcast       #273 <Class java.util.Map$Entry[]>
	//   38   75:astore_0        
		map = ((Map) (new CustomAttributeData[acustomattributedata.length]));
	//   39   76:aload_0         
	//   40   77:arraylength     
	//   41   78:anewarray       CustomAttributeData[]
	//   42   81:astore_1        
		for(int j = 0; j < map.length; j++)
	//*  43   82:iconst_0        
	//*  44   83:istore_2        
	//*  45   84:iload_2         
	//*  46   85:aload_1         
	//*  47   86:arraylength     
	//*  48   87:icmpge          129
			map[j] = ((/*<invalid signature>*/java.lang.Object) (new CustomAttributeData((String)((java.util.Map.Entry) (acustomattributedata[j])).getKey(), (String)((java.util.Map.Entry) (acustomattributedata[j])).getValue())));
	//   49   90:aload_1         
	//   50   91:iload_2         
	//   51   92:new             #243 <Class CustomAttributeData>
	//   52   95:dup             
	//   53   96:aload_0         
	//   54   97:iload_2         
	//   55   98:aaload          
	//   56   99:invokeinterface #277 <Method Object java.util.Map$Entry.getKey()>
	//   57  104:checkcast       #279 <Class String>
	//   58  107:aload_0         
	//   59  108:iload_2         
	//   60  109:aaload          
	//   61  110:invokeinterface #282 <Method Object java.util.Map$Entry.getValue()>
	//   62  115:checkcast       #279 <Class String>
	//   63  118:invokespecial   #284 <Method void CustomAttributeData(String, String)>
	//   64  121:aastore         

	//   65  122:iload_2         
	//   66  123:iconst_1        
	//   67  124:iadd            
	//   68  125:istore_2        
	//*  69  126:goto            84
		return ((CustomAttributeData []) (map));
	//   70  129:aload_1         
	//   71  130:areturn         
	}

	public static void writeNativeCrash(SessionEventData sessioneventdata, LogFileManager logfilemanager, Map map, CodedOutputStream codedoutputstream)
		throws IOException
	{
		createEventMessage(sessioneventdata, logfilemanager, map).write(codedoutputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #289 <Method NativeCrashWriter$EventMessage createEventMessage(SessionEventData, LogFileManager, Map)>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #293 <Method void NativeCrashWriter$EventMessage.write(CodedOutputStream)>
	//    6   10:return          
	}

	private static final SignalData DEFAULT_SIGNAL = new SignalData("", "", 0L);
	private static final BinaryImageMessage EMPTY_BINARY_IMAGE_MESSAGES[] = new BinaryImageMessage[0];
	private static final ProtobufMessage EMPTY_CHILDREN[] = new ProtobufMessage[0];
	private static final CustomAttributeMessage EMPTY_CUSTOM_ATTRIBUTE_MESSAGES[] = new CustomAttributeMessage[0];
	private static final FrameMessage EMPTY_FRAME_MESSAGES[] = new FrameMessage[0];
	private static final ThreadMessage EMPTY_THREAD_MESSAGES[] = new ThreadMessage[0];
	static final String NDK_CRASH_TYPE = "ndk-crash";

	static 
	{
	//    0    0:new             #63  <Class SignalData>
	//    1    3:dup             
	//    2    4:ldc1            #65  <String "">
	//    3    6:ldc1            #65  <String "">
	//    4    8:lconst_0        
	//    5    9:invokespecial   #69  <Method void SignalData(String, String, long)>
	//    6   12:putstatic       #71  <Field SignalData DEFAULT_SIGNAL>
	//    7   15:iconst_0        
	//    8   16:anewarray       ProtobufMessage[]
	//    9   19:putstatic       #73  <Field NativeCrashWriter$ProtobufMessage[] EMPTY_CHILDREN>
	//   10   22:iconst_0        
	//   11   23:anewarray       ThreadMessage[]
	//   12   26:putstatic       #75  <Field NativeCrashWriter$ThreadMessage[] EMPTY_THREAD_MESSAGES>
	//   13   29:iconst_0        
	//   14   30:anewarray       FrameMessage[]
	//   15   33:putstatic       #77  <Field NativeCrashWriter$FrameMessage[] EMPTY_FRAME_MESSAGES>
	//   16   36:iconst_0        
	//   17   37:anewarray       BinaryImageMessage[]
	//   18   40:putstatic       #79  <Field NativeCrashWriter$BinaryImageMessage[] EMPTY_BINARY_IMAGE_MESSAGES>
	//   19   43:iconst_0        
	//   20   44:anewarray       CustomAttributeMessage[]
	//   21   47:putstatic       #81  <Field NativeCrashWriter$CustomAttributeMessage[] EMPTY_CUSTOM_ATTRIBUTE_MESSAGES>
	//*  22   50:return          
	}


/*
	static ProtobufMessage[] access$000()
	{
		return EMPTY_CHILDREN;
	//    0    0:getstatic       #73  <Field NativeCrashWriter$ProtobufMessage[] EMPTY_CHILDREN>
	//    1    3:areturn         
	}

*/
}
