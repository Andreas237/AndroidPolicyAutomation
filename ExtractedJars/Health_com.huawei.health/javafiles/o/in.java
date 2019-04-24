// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class in
{

	protected in(File file, ArrayList arraylist, int ai[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #19  <Field boolean d>
		e = file;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #21  <Field File e>
		b = arraylist;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #23  <Field ArrayList b>
		a = ai;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #25  <Field int[] a>
	//   14   24:return          
	}

	protected final void b(boolean flag)
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #19  <Field boolean d>
	//    3    5:return          
	}

	public byte[] c()
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #33  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void ByteArrayOutputStream()>
	//    3    7:astore_1        
		DataOutputStream dataoutputstream = new DataOutputStream(((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:new             #36  <Class DataOutputStream>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #39  <Method void DataOutputStream(java.io.OutputStream)>
	//    8   16:astore_2        
		for(Iterator iterator = b.iterator(); iterator.hasNext();)
	//*   9   17:aload_0         
	//*  10   18:getfield        #23  <Field ArrayList b>
	//*  11   21:invokevirtual   #45  <Method Iterator ArrayList.iterator()>
	//*  12   24:astore_3        
	//*  13   25:aload_3         
	//*  14   26:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*  15   31:ifeq            64
		{
			byte abyte0[] = (byte[])iterator.next();
	//   16   34:aload_3         
	//   17   35:invokeinterface #55  <Method Object Iterator.next()>
	//   18   40:checkcast       #57  <Class byte[]>
	//   19   43:astore          4
			try
			{
				dataoutputstream.writeInt(abyte0.length);
	//   20   45:aload_2         
	//   21   46:aload           4
	//   22   48:arraylength     
	//   23   49:invokevirtual   #61  <Method void DataOutputStream.writeInt(int)>
				dataoutputstream.write(abyte0);
	//   24   52:aload_2         
	//   25   53:aload           4
	//   26   55:invokevirtual   #65  <Method void DataOutputStream.write(byte[])>
			}
	//*  27   58:goto            25
	//*  28   61:goto            25
	//*  29   64:aload_1         
	//*  30   65:invokevirtual   #68  <Method void ByteArrayOutputStream.close()>
	//*  31   68:aload_2         
	//*  32   69:invokevirtual   #69  <Method void DataOutputStream.close()>
	//*  33   72:aload_1         
	//*  34   73:invokevirtual   #72  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//*  35   76:areturn         
			catch(IOException ioexception1) { }
	//   36   77:astore          4
		}

		try
		{
			bytearrayoutputstream.close();
			dataoutputstream.close();
		}
	//*  37   79:goto            61
		catch(IOException ioexception) { }
	//   38   82:astore_2        
		return bytearrayoutputstream.toByteArray();
	//*  39   83:goto            72
	}

	protected final boolean d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean d>
	//    2    4:ireturn         
	}

	protected final int e()
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(b == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #23  <Field ArrayList b>
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		for(int i = 0; i < b.size(); i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:aload_0         
	//*  11   15:getfield        #23  <Field ArrayList b>
	//*  12   18:invokevirtual   #76  <Method int ArrayList.size()>
	//*  13   21:icmpge          64
		{
			int k;
			if(b.get(i) != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #23  <Field ArrayList b>
	//*  16   28:iload_1         
	//*  17   29:invokevirtual   #80  <Method Object ArrayList.get(int)>
	//*  18   32:ifnull          51
				k = ((byte[])b.get(i)).length;
	//   19   35:aload_0         
	//   20   36:getfield        #23  <Field ArrayList b>
	//   21   39:iload_1         
	//   22   40:invokevirtual   #80  <Method Object ArrayList.get(int)>
	//   23   43:checkcast       #57  <Class byte[]>
	//   24   46:arraylength     
	//   25   47:istore_3        
			else
	//*  26   48:goto            53
				k = 0;
	//   27   51:iconst_0        
	//   28   52:istore_3        
			j += k;
	//   29   53:iload_2         
	//   30   54:iload_3         
	//   31   55:iadd            
	//   32   56:istore_2        
		}

	//   33   57:iload_1         
	//   34   58:iconst_1        
	//   35   59:iadd            
	//   36   60:istore_1        
	//*  37   61:goto            13
		return j;
	//   38   64:iload_2         
	//   39   65:ireturn         
	}

	protected int a[];
	private ArrayList b;
	private boolean d;
	protected File e;
}
