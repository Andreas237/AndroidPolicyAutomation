// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import java.io.*;
import java.util.*;

// Referenced classes of package ch.qos.logback.core.encoder:
//			EncoderBase, ByteArrayUtil

public class ObjectStreamEncoder extends EncoderBase
{

	public ObjectStreamEncoder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void EncoderBase()>
		MAX_BUFFER_SIZE = 100;
	//    2    4:aload_0         
	//    3    5:bipush          100
	//    4    7:putfield        #20  <Field int MAX_BUFFER_SIZE>
		bufferList = ((List) (new ArrayList(MAX_BUFFER_SIZE)));
	//    5   10:aload_0         
	//    6   11:new             #22  <Class ArrayList>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:getfield        #20  <Field int MAX_BUFFER_SIZE>
	//   10   19:invokespecial   #25  <Method void ArrayList(int)>
	//   11   22:putfield        #27  <Field List bufferList>
	//   12   25:return          
	}

	public void close()
	{
		writeBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method void writeBuffer()>
	//    2    4:return          
	}

	public void doEncode(Object obj)
	{
		bufferList.add(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field List bufferList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #40  <Method boolean List.add(Object)>
	//    4   10:pop             
		if(bufferList.size() == MAX_BUFFER_SIZE)
	//*   5   11:aload_0         
	//*   6   12:getfield        #27  <Field List bufferList>
	//*   7   15:invokeinterface #44  <Method int List.size()>
	//*   8   20:aload_0         
	//*   9   21:getfield        #20  <Field int MAX_BUFFER_SIZE>
	//*  10   24:icmpne          31
			writeBuffer();
	//   11   27:aload_0         
	//   12   28:invokevirtual   #32  <Method void writeBuffer()>
	//   13   31:return          
	}

	public void init(OutputStream outputstream)
	{
		super.init(outputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void EncoderBase.init(OutputStream)>
		bufferList.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field List bufferList>
	//    5    9:invokeinterface #53  <Method void List.clear()>
	//    6   14:return          
	}

	void writeBuffer()
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(10000);
	//    0    0:new             #55  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:sipush          10000
	//    3    7:invokespecial   #56  <Method void ByteArrayOutputStream(int)>
	//    4   10:astore_3        
		int i = bufferList.size();
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field List bufferList>
	//    7   15:invokeinterface #44  <Method int List.size()>
	//    8   20:istore_1        
		writeHeader(bytearrayoutputstream, i);
	//    9   21:aload_0         
	//   10   22:aload_3         
	//   11   23:iload_1         
	//   12   24:invokevirtual   #60  <Method void writeHeader(ByteArrayOutputStream, int)>
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(((OutputStream) (bytearrayoutputstream)));
	//   13   27:new             #62  <Class ObjectOutputStream>
	//   14   30:dup             
	//   15   31:aload_3         
	//   16   32:invokespecial   #64  <Method void ObjectOutputStream(OutputStream)>
	//   17   35:astore_2        
		for(Iterator iterator = bufferList.iterator(); iterator.hasNext(); objectoutputstream.writeObject(iterator.next()));
	//   18   36:aload_0         
	//   19   37:getfield        #27  <Field List bufferList>
	//   20   40:invokeinterface #68  <Method Iterator List.iterator()>
	//   21   45:astore          4
	//   22   47:aload           4
	//   23   49:invokeinterface #74  <Method boolean Iterator.hasNext()>
	//   24   54:ifeq            71
	//   25   57:aload_2         
	//   26   58:aload           4
	//   27   60:invokeinterface #78  <Method Object Iterator.next()>
	//   28   65:invokevirtual   #81  <Method void ObjectOutputStream.writeObject(Object)>
	//*  29   68:goto            47
		bufferList.clear();
	//   30   71:aload_0         
	//   31   72:getfield        #27  <Field List bufferList>
	//   32   75:invokeinterface #53  <Method void List.clear()>
		objectoutputstream.flush();
	//   33   80:aload_2         
	//   34   81:invokevirtual   #84  <Method void ObjectOutputStream.flush()>
		writeFooter(bytearrayoutputstream, i);
	//   35   84:aload_0         
	//   36   85:aload_3         
	//   37   86:iload_1         
	//   38   87:invokevirtual   #87  <Method void writeFooter(ByteArrayOutputStream, int)>
		byte abyte0[] = bytearrayoutputstream.toByteArray();
	//   39   90:aload_3         
	//   40   91:invokevirtual   #91  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   41   94:astore_3        
		objectoutputstream.close();
	//   42   95:aload_2         
	//   43   96:invokevirtual   #93  <Method void ObjectOutputStream.close()>
		writeEndPosition(abyte0);
	//   44   99:aload_0         
	//   45  100:aload_3         
	//   46  101:invokevirtual   #97  <Method void writeEndPosition(byte[])>
		outputStream.write(abyte0);
	//   47  104:aload_0         
	//   48  105:getfield        #101 <Field OutputStream outputStream>
	//   49  108:aload_3         
	//   50  109:invokevirtual   #106 <Method void OutputStream.write(byte[])>
	//   51  112:return          
	}

	void writeEndPosition(byte abyte0[])
	{
		ByteArrayUtil.writeInt(abyte0, 8, abyte0.length - 8);
	//    0    0:aload_1         
	//    1    1:bipush          8
	//    2    3:aload_1         
	//    3    4:arraylength     
	//    4    5:bipush          8
	//    5    7:isub            
	//    6    8:invokestatic    #112 <Method void ByteArrayUtil.writeInt(byte[], int, int)>
	//    7   11:return          
	}

	void writeFooter(ByteArrayOutputStream bytearrayoutputstream, int i)
	{
		ByteArrayUtil.writeInt(bytearrayoutputstream, 0x262b5373);
	//    0    0:aload_1         
	//    1    1:ldc1            #10  <Int 0x262b5373>
	//    2    3:invokestatic    #114 <Method void ByteArrayUtil.writeInt(ByteArrayOutputStream, int)>
		ByteArrayUtil.writeInt(bytearrayoutputstream, i ^ 0x262b5373);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:ldc1            #10  <Int 0x262b5373>
	//    6   10:ixor            
	//    7   11:invokestatic    #114 <Method void ByteArrayUtil.writeInt(ByteArrayOutputStream, int)>
	//    8   14:return          
	}

	void writeHeader(ByteArrayOutputStream bytearrayoutputstream, int i)
	{
		ByteArrayUtil.writeInt(bytearrayoutputstream, 0x6e78f671);
	//    0    0:aload_1         
	//    1    1:ldc1            #8   <Int 0x6e78f671>
	//    2    3:invokestatic    #114 <Method void ByteArrayUtil.writeInt(ByteArrayOutputStream, int)>
		ByteArrayUtil.writeInt(bytearrayoutputstream, i);
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:invokestatic    #114 <Method void ByteArrayUtil.writeInt(ByteArrayOutputStream, int)>
		ByteArrayUtil.writeInt(bytearrayoutputstream, 0);
	//    6   11:aload_1         
	//    7   12:iconst_0        
	//    8   13:invokestatic    #114 <Method void ByteArrayUtil.writeInt(ByteArrayOutputStream, int)>
		ByteArrayUtil.writeInt(bytearrayoutputstream, i ^ 0x6e78f671);
	//    9   16:aload_1         
	//   10   17:iload_2         
	//   11   18:ldc1            #8   <Int 0x6e78f671>
	//   12   20:ixor            
	//   13   21:invokestatic    #114 <Method void ByteArrayUtil.writeInt(ByteArrayOutputStream, int)>
	//   14   24:return          
	}

	public static final int START_PEBBLE = 0x6e78f671;
	public static final int STOP_PEBBLE = 0x262b5373;
	private int MAX_BUFFER_SIZE;
	List bufferList;
}
