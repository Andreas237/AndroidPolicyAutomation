// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.encoder;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.encoder:
//			NonClosableInputStream, ByteArrayUtil

public class EventObjectInputStream extends InputStream
{

	EventObjectInputStream(InputStream inputstream)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void InputStream()>
		buffer = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #19  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void ArrayList()>
	//    6   12:putfield        #22  <Field List buffer>
		index = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #24  <Field int index>
		ncis = new NonClosableInputStream(inputstream);
	//   10   20:aload_0         
	//   11   21:new             #26  <Class NonClosableInputStream>
	//   12   24:dup             
	//   13   25:aload_1         
	//   14   26:invokespecial   #28  <Method void NonClosableInputStream(InputStream)>
	//   15   29:putfield        #30  <Field NonClosableInputStream ncis>
	//   16   32:return          
	}

	private void internalReset()
	{
		index = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #24  <Field int index>
		buffer.clear();
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field List buffer>
	//    5    9:invokeinterface #37  <Method void List.clear()>
	//    6   14:return          
	}

	public int available()
	{
		return ncis.available();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field NonClosableInputStream ncis>
	//    2    4:invokevirtual   #41  <Method int NonClosableInputStream.available()>
	//    3    7:ireturn         
	}

	public void close()
	{
		ncis.realClose();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field NonClosableInputStream ncis>
	//    2    4:invokevirtual   #45  <Method void NonClosableInputStream.realClose()>
	//    3    7:return          
	}

	Object getFromBuffer()
	{
		if(index >= buffer.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int index>
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field List buffer>
	//*   4    8:invokeinterface #50  <Method int List.size()>
	//*   5   13:icmplt          18
		{
			return ((Object) (null));
	//    6   16:aconst_null     
	//    7   17:areturn         
		} else
		{
			List list = buffer;
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field List buffer>
	//   10   22:astore_2        
			int i = index;
	//   11   23:aload_0         
	//   12   24:getfield        #24  <Field int index>
	//   13   27:istore_1        
			index = i + 1;
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:iadd            
	//   18   32:putfield        #24  <Field int index>
			return list.get(i);
	//   19   35:aload_2         
	//   20   36:iload_1         
	//   21   37:invokeinterface #54  <Method Object List.get(int)>
	//   22   42:areturn         
		}
	}

	public int read()
	{
		throw new UnsupportedOperationException("Only the readEvent method is supported.");
	//    0    0:new             #59  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #61  <String "Only the readEvent method is supported.">
	//    3    6:invokespecial   #64  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public Object readEvent()
	{
		Object obj = getFromBuffer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #67  <Method Object getFromBuffer()>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			return obj;
	//    5    9:aload_2         
	//    6   10:areturn         
		internalReset();
	//    7   11:aload_0         
	//    8   12:invokespecial   #69  <Method void internalReset()>
		int i = readHeader();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #72  <Method int readHeader()>
	//   11   19:istore_1        
		if(i == -1)
	//*  12   20:iload_1         
	//*  13   21:iconst_m1       
	//*  14   22:icmpne          27
		{
			return ((Object) (null));
	//   15   25:aconst_null     
	//   16   26:areturn         
		} else
		{
			readPayload(i);
	//   17   27:aload_0         
	//   18   28:iload_1         
	//   19   29:invokevirtual   #76  <Method void readPayload(int)>
			readFooter(i);
	//   20   32:aload_0         
	//   21   33:iload_1         
	//   22   34:invokevirtual   #79  <Method void readFooter(int)>
			return getFromBuffer();
	//   23   37:aload_0         
	//   24   38:invokevirtual   #67  <Method Object getFromBuffer()>
	//   25   41:areturn         
		}
	}

	Object readEvents(ObjectInputStream objectinputstream)
	{
		Object obj = objectinputstream.readObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #88  <Method Object ObjectInputStream.readObject()>
	//    2    4:astore_2        
		try
		{
			buffer.add(obj);
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field List buffer>
	//    5    9:aload_2         
	//    6   10:invokeinterface #92  <Method boolean List.add(Object)>
	//    7   15:pop             
		}
	//*   8   16:aload_2         
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(ObjectInputStream objectinputstream)
	//*  10   18:astore_1        
		{
			break MISSING_BLOCK_LABEL_25;
	//   11   19:goto            25
		}
		return obj;
		objectinputstream;
	//   12   22:astore_1        
		obj = null;
	//   13   23:aconst_null     
	//   14   24:astore_2        
		((ClassNotFoundException) (objectinputstream)).printStackTrace();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #95  <Method void ClassNotFoundException.printStackTrace()>
		return obj;
	//   17   29:aload_2         
	//   18   30:areturn         
	}

	void readFooter(int i)
	{
		byte abyte0[] = new byte[8];
	//    0    0:bipush          8
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		if(ncis.read(abyte0) == -1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field NonClosableInputStream ncis>
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #99  <Method int NonClosableInputStream.read(byte[])>
	//*   7   13:iconst_m1       
	//*   8   14:icmpne          27
			throw new IllegalStateException("Looks like a corrupt stream");
	//    9   17:new             #101 <Class IllegalStateException>
	//   10   20:dup             
	//   11   21:ldc1            #103 <String "Looks like a corrupt stream">
	//   12   23:invokespecial   #104 <Method void IllegalStateException(String)>
	//   13   26:athrow          
		if(ByteArrayUtil.readInt(abyte0, 0) != 0x262b5373)
	//*  14   27:aload_2         
	//*  15   28:iconst_0        
	//*  16   29:invokestatic    #110 <Method int ByteArrayUtil.readInt(byte[], int)>
	//*  17   32:ldc1            #111 <Int 0x262b5373>
	//*  18   34:icmpeq          47
			throw new IllegalStateException("Looks like a corrupt stream");
	//   19   37:new             #101 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc1            #103 <String "Looks like a corrupt stream">
	//   22   43:invokespecial   #104 <Method void IllegalStateException(String)>
	//   23   46:athrow          
		if(ByteArrayUtil.readInt(abyte0, 4) != (i ^ 0x262b5373))
	//*  24   47:aload_2         
	//*  25   48:iconst_4        
	//*  26   49:invokestatic    #110 <Method int ByteArrayUtil.readInt(byte[], int)>
	//*  27   52:iload_1         
	//*  28   53:ldc1            #111 <Int 0x262b5373>
	//*  29   55:ixor            
	//*  30   56:icmpeq          69
			throw new IllegalStateException("Invalid checksum");
	//   31   59:new             #101 <Class IllegalStateException>
	//   32   62:dup             
	//   33   63:ldc1            #113 <String "Invalid checksum">
	//   34   65:invokespecial   #104 <Method void IllegalStateException(String)>
	//   35   68:athrow          
		else
			return;
	//   36   69:return          
	}

	int readHeader()
	{
		byte abyte0[] = new byte[16];
	//    0    0:bipush          16
	//    1    2:newarray        byte[]
	//    2    4:astore_2        
		if(ncis.read(abyte0) == -1)
	//*   3    5:aload_0         
	//*   4    6:getfield        #30  <Field NonClosableInputStream ncis>
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #99  <Method int NonClosableInputStream.read(byte[])>
	//*   7   13:iconst_m1       
	//*   8   14:icmpne          19
			return -1;
	//    9   17:iconst_m1       
	//   10   18:ireturn         
		if(ByteArrayUtil.readInt(abyte0, 0) != 0x6e78f671)
	//*  11   19:aload_2         
	//*  12   20:iconst_0        
	//*  13   21:invokestatic    #110 <Method int ByteArrayUtil.readInt(byte[], int)>
	//*  14   24:ldc1            #114 <Int 0x6e78f671>
	//*  15   26:icmpeq          39
			throw new IllegalStateException("Does not look like data created by ObjectStreamEncoder");
	//   16   29:new             #101 <Class IllegalStateException>
	//   17   32:dup             
	//   18   33:ldc1            #116 <String "Does not look like data created by ObjectStreamEncoder">
	//   19   35:invokespecial   #104 <Method void IllegalStateException(String)>
	//   20   38:athrow          
		int i = ByteArrayUtil.readInt(abyte0, 4);
	//   21   39:aload_2         
	//   22   40:iconst_4        
	//   23   41:invokestatic    #110 <Method int ByteArrayUtil.readInt(byte[], int)>
	//   24   44:istore_1        
		if(ByteArrayUtil.readInt(abyte0, 12) != (0x6e78f671 ^ i))
	//*  25   45:aload_2         
	//*  26   46:bipush          12
	//*  27   48:invokestatic    #110 <Method int ByteArrayUtil.readInt(byte[], int)>
	//*  28   51:ldc1            #114 <Int 0x6e78f671>
	//*  29   53:iload_1         
	//*  30   54:ixor            
	//*  31   55:icmpeq          68
			throw new IllegalStateException("Invalid checksum");
	//   32   58:new             #101 <Class IllegalStateException>
	//   33   61:dup             
	//   34   62:ldc1            #113 <String "Invalid checksum">
	//   35   64:invokespecial   #104 <Method void IllegalStateException(String)>
	//   36   67:athrow          
		else
			return i;
	//   37   68:iload_1         
	//   38   69:ireturn         
	}

	void readPayload(int i)
	{
		ArrayList arraylist = new ArrayList(i);
	//    0    0:new             #19  <Class ArrayList>
	//    1    3:dup             
	//    2    4:iload_1         
	//    3    5:invokespecial   #118 <Method void ArrayList(int)>
	//    4    8:astore_3        
		ObjectInputStream objectinputstream = new ObjectInputStream(((InputStream) (ncis)));
	//    5    9:new             #85  <Class ObjectInputStream>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field NonClosableInputStream ncis>
	//    9   17:invokespecial   #119 <Method void ObjectInputStream(InputStream)>
	//   10   20:astore          4
		for(int j = 0; j < i; j++)
	//*  11   22:iconst_0        
	//*  12   23:istore_2        
	//*  13   24:iload_2         
	//*  14   25:iload_1         
	//*  15   26:icmpge          49
			((List) (arraylist)).add(readEvents(objectinputstream));
	//   16   29:aload_3         
	//   17   30:aload_0         
	//   18   31:aload           4
	//   19   33:invokevirtual   #121 <Method Object readEvents(ObjectInputStream)>
	//   20   36:invokeinterface #92  <Method boolean List.add(Object)>
	//   21   41:pop             

	//   22   42:iload_2         
	//   23   43:iconst_1        
	//   24   44:iadd            
	//   25   45:istore_2        
	//*  26   46:goto            24
		objectinputstream.close();
	//   27   49:aload           4
	//   28   51:invokevirtual   #123 <Method void ObjectInputStream.close()>
	//   29   54:return          
	}

	List buffer;
	int index;
	NonClosableInputStream ncis;
}
