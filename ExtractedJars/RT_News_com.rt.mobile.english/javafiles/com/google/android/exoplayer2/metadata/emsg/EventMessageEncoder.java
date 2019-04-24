// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.metadata.emsg;

import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.*;

// Referenced classes of package com.google.android.exoplayer2.metadata.emsg:
//			EventMessage

public final class EventMessageEncoder
{

	public EventMessageEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class ByteArrayOutputStream>
	//    4    8:dup             
	//    5    9:sipush          512
	//    6   12:invokespecial   #17  <Method void ByteArrayOutputStream(int)>
	//    7   15:putfield        #19  <Field ByteArrayOutputStream byteArrayOutputStream>
		dataOutputStream = new DataOutputStream(((java.io.OutputStream) (byteArrayOutputStream)));
	//    8   18:aload_0         
	//    9   19:new             #21  <Class DataOutputStream>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field ByteArrayOutputStream byteArrayOutputStream>
	//   13   27:invokespecial   #24  <Method void DataOutputStream(java.io.OutputStream)>
	//   14   30:putfield        #26  <Field DataOutputStream dataOutputStream>
	//   15   33:return          
	}

	private static void writeNullTerminatedString(DataOutputStream dataoutputstream, String s)
		throws IOException
	{
		dataoutputstream.writeBytes(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method void DataOutputStream.writeBytes(String)>
		dataoutputstream.writeByte(0);
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #38  <Method void DataOutputStream.writeByte(int)>
	//    6   10:return          
	}

	private static void writeUnsignedInt(DataOutputStream dataoutputstream, long l)
		throws IOException
	{
		dataoutputstream.writeByte((int)(l >>> 24) & 0xff);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:bipush          24
	//    3    4:lushr           
	//    4    5:l2i             
	//    5    6:sipush          255
	//    6    9:iand            
	//    7   10:invokevirtual   #38  <Method void DataOutputStream.writeByte(int)>
		dataoutputstream.writeByte((int)(l >>> 16) & 0xff);
	//    8   13:aload_0         
	//    9   14:lload_1         
	//   10   15:bipush          16
	//   11   17:lushr           
	//   12   18:l2i             
	//   13   19:sipush          255
	//   14   22:iand            
	//   15   23:invokevirtual   #38  <Method void DataOutputStream.writeByte(int)>
		dataoutputstream.writeByte((int)(l >>> 8) & 0xff);
	//   16   26:aload_0         
	//   17   27:lload_1         
	//   18   28:bipush          8
	//   19   30:lushr           
	//   20   31:l2i             
	//   21   32:sipush          255
	//   22   35:iand            
	//   23   36:invokevirtual   #38  <Method void DataOutputStream.writeByte(int)>
		dataoutputstream.writeByte((int)l & 0xff);
	//   24   39:aload_0         
	//   25   40:lload_1         
	//   26   41:l2i             
	//   27   42:sipush          255
	//   28   45:iand            
	//   29   46:invokevirtual   #38  <Method void DataOutputStream.writeByte(int)>
	//   30   49:return          
	}

	public byte[] encode(EventMessage eventmessage, long l)
	{
		boolean flag;
		if(l >= 0L)
	//*   0    0:lload_2         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:iflt            12
			flag = true;
	//    4    6:iconst_1        
	//    5    7:istore          6
		else
	//*   6    9:goto            15
			flag = false;
	//    7   12:iconst_0        
	//    8   13:istore          6
		Assertions.checkArgument(flag);
	//    9   15:iload           6
	//   10   17:invokestatic    #50  <Method void Assertions.checkArgument(boolean)>
		byteArrayOutputStream.reset();
	//   11   20:aload_0         
	//   12   21:getfield        #19  <Field ByteArrayOutputStream byteArrayOutputStream>
	//   13   24:invokevirtual   #53  <Method void ByteArrayOutputStream.reset()>
		writeNullTerminatedString(dataOutputStream, eventmessage.schemeIdUri);
	//   14   27:aload_0         
	//   15   28:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   16   31:aload_1         
	//   17   32:getfield        #59  <Field String EventMessage.schemeIdUri>
	//   18   35:invokestatic    #61  <Method void writeNullTerminatedString(DataOutputStream, String)>
		if(eventmessage.value == null) goto _L2; else goto _L1
	//   19   38:aload_1         
	//   20   39:getfield        #64  <Field String EventMessage.value>
	//   21   42:ifnull          162
_L1:
		String s = eventmessage.value;
	//   22   45:aload_1         
	//   23   46:getfield        #64  <Field String EventMessage.value>
	//   24   49:astore          7
	//*  25   51:goto            54
_L4:
		try
		{
			writeNullTerminatedString(dataOutputStream, s);
	//   26   54:aload_0         
	//   27   55:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   28   58:aload           7
	//   29   60:invokestatic    #61  <Method void writeNullTerminatedString(DataOutputStream, String)>
			writeUnsignedInt(dataOutputStream, l);
	//   30   63:aload_0         
	//   31   64:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   32   67:lload_2         
	//   33   68:invokestatic    #66  <Method void writeUnsignedInt(DataOutputStream, long)>
			long l1 = Util.scaleLargeTimestamp(eventmessage.presentationTimeUs, l, 0xf4240L);
	//   34   71:aload_1         
	//   35   72:getfield        #70  <Field long EventMessage.presentationTimeUs>
	//   36   75:lload_2         
	//   37   76:ldc2w           #71  <Long 0xf4240L>
	//   38   79:invokestatic    #78  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   39   82:lstore          4
			writeUnsignedInt(dataOutputStream, l1);
	//   40   84:aload_0         
	//   41   85:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   42   88:lload           4
	//   43   90:invokestatic    #66  <Method void writeUnsignedInt(DataOutputStream, long)>
			l = Util.scaleLargeTimestamp(eventmessage.durationMs, l, 1000L);
	//   44   93:aload_1         
	//   45   94:getfield        #81  <Field long EventMessage.durationMs>
	//   46   97:lload_2         
	//   47   98:ldc2w           #82  <Long 1000L>
	//   48  101:invokestatic    #78  <Method long Util.scaleLargeTimestamp(long, long, long)>
	//   49  104:lstore_2        
			writeUnsignedInt(dataOutputStream, l);
	//   50  105:aload_0         
	//   51  106:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   52  109:lload_2         
	//   53  110:invokestatic    #66  <Method void writeUnsignedInt(DataOutputStream, long)>
			writeUnsignedInt(dataOutputStream, eventmessage.id);
	//   54  113:aload_0         
	//   55  114:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   56  117:aload_1         
	//   57  118:getfield        #86  <Field long EventMessage.id>
	//   58  121:invokestatic    #66  <Method void writeUnsignedInt(DataOutputStream, long)>
			dataOutputStream.write(eventmessage.messageData);
	//   59  124:aload_0         
	//   60  125:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   61  128:aload_1         
	//   62  129:getfield        #90  <Field byte[] EventMessage.messageData>
	//   63  132:invokevirtual   #94  <Method void DataOutputStream.write(byte[])>
			dataOutputStream.flush();
	//   64  135:aload_0         
	//   65  136:getfield        #26  <Field DataOutputStream dataOutputStream>
	//   66  139:invokevirtual   #97  <Method void DataOutputStream.flush()>
			eventmessage = ((EventMessage) (byteArrayOutputStream.toByteArray()));
	//   67  142:aload_0         
	//   68  143:getfield        #19  <Field ByteArrayOutputStream byteArrayOutputStream>
	//   69  146:invokevirtual   #101 <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   70  149:astore_1        
		}
	//*  71  150:aload_1         
	//*  72  151:areturn         
		// Misplaced declaration of an exception variable
		catch(EventMessage eventmessage)
	//*  73  152:astore_1        
		{
			throw new RuntimeException(((Throwable) (eventmessage)));
	//   74  153:new             #103 <Class RuntimeException>
	//   75  156:dup             
	//   76  157:aload_1         
	//   77  158:invokespecial   #106 <Method void RuntimeException(Throwable)>
	//   78  161:athrow          
		}
		return ((byte []) (eventmessage));
_L2:
		s = "";
	//   79  162:ldc1            #108 <String "">
	//   80  164:astore          7
		if(true) goto _L4; else goto _L3
	//   81  166:goto            54
_L3:
	}

	private final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
	private final DataOutputStream dataOutputStream;
}
