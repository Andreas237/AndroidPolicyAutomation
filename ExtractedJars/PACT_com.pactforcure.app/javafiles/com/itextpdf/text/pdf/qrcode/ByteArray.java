// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


public final class ByteArray
{

	public ByteArray()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		bytes = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #16  <Field byte[] bytes>
		size = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #18  <Field int size>
	//    8   14:return          
	}

	public ByteArray(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		bytes = new byte[i];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:newarray        byte[]
	//    5    8:putfield        #16  <Field byte[] bytes>
		size = i;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #18  <Field int size>
	//    9   16:return          
	}

	public ByteArray(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		bytes = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field byte[] bytes>
		size = bytes.length;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field byte[] bytes>
	//    8   14:arraylength     
	//    9   15:putfield        #18  <Field int size>
	//   10   18:return          
	}

	public void appendByte(int i)
	{
		if(size == 0 || size >= bytes.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field int size>
	//*   2    4:ifeq            19
	//*   3    7:aload_0         
	//*   4    8:getfield        #18  <Field int size>
	//*   5   11:aload_0         
	//*   6   12:getfield        #16  <Field byte[] bytes>
	//*   7   15:arraylength     
	//*   8   16:icmplt          34
			reserve(Math.max(32, size << 1));
	//    9   19:aload_0         
	//   10   20:bipush          32
	//   11   22:aload_0         
	//   12   23:getfield        #18  <Field int size>
	//   13   26:iconst_1        
	//   14   27:ishl            
	//   15   28:invokestatic    #28  <Method int Math.max(int, int)>
	//   16   31:invokevirtual   #31  <Method void reserve(int)>
		bytes[size] = (byte)i;
	//   17   34:aload_0         
	//   18   35:getfield        #16  <Field byte[] bytes>
	//   19   38:aload_0         
	//   20   39:getfield        #18  <Field int size>
	//   21   42:iload_1         
	//   22   43:int2byte        
	//   23   44:bastore         
		size = size + 1;
	//   24   45:aload_0         
	//   25   46:aload_0         
	//   26   47:getfield        #18  <Field int size>
	//   27   50:iconst_1        
	//   28   51:iadd            
	//   29   52:putfield        #18  <Field int size>
	//   30   55:return          
	}

	public int at(int i)
	{
		return bytes[i] & 0xff;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field byte[] bytes>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:sipush          255
	//    5    9:iand            
	//    6   10:ireturn         
	}

	public boolean isEmpty()
	{
		return size == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int size>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void reserve(int i)
	{
		if(bytes == null || bytes.length < i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field byte[] bytes>
	//*   2    4:ifnull          16
	//*   3    7:aload_0         
	//*   4    8:getfield        #16  <Field byte[] bytes>
	//*   5   11:arraylength     
	//*   6   12:iload_1         
	//*   7   13:icmpge          47
		{
			byte abyte0[] = new byte[i];
	//    8   16:iload_1         
	//    9   17:newarray        byte[]
	//   10   19:astore_2        
			if(bytes != null)
	//*  11   20:aload_0         
	//*  12   21:getfield        #16  <Field byte[] bytes>
	//*  13   24:ifnull          42
				System.arraycopy(((Object) (bytes)), 0, ((Object) (abyte0)), 0, bytes.length);
	//   14   27:aload_0         
	//   15   28:getfield        #16  <Field byte[] bytes>
	//   16   31:iconst_0        
	//   17   32:aload_2         
	//   18   33:iconst_0        
	//   19   34:aload_0         
	//   20   35:getfield        #16  <Field byte[] bytes>
	//   21   38:arraylength     
	//   22   39:invokestatic    #41  <Method void System.arraycopy(Object, int, Object, int, int)>
			bytes = abyte0;
	//   23   42:aload_0         
	//   24   43:aload_2         
	//   25   44:putfield        #16  <Field byte[] bytes>
		}
	//   26   47:return          
	}

	public void set(int i, int j)
	{
		bytes[i] = (byte)j;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field byte[] bytes>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:int2byte        
	//    5    7:bastore         
	//    6    8:return          
	}

	public void set(byte abyte0[], int i, int j)
	{
		bytes = new byte[j];
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:newarray        byte[]
	//    3    4:putfield        #16  <Field byte[] bytes>
		size = j;
	//    4    7:aload_0         
	//    5    8:iload_3         
	//    6    9:putfield        #18  <Field int size>
		for(int k = 0; k < j; k++)
	//*   7   12:iconst_0        
	//*   8   13:istore          4
	//*   9   15:iload           4
	//*  10   17:iload_3         
	//*  11   18:icmpge          43
			bytes[k] = abyte0[i + k];
	//   12   21:aload_0         
	//   13   22:getfield        #16  <Field byte[] bytes>
	//   14   25:iload           4
	//   15   27:aload_1         
	//   16   28:iload_2         
	//   17   29:iload           4
	//   18   31:iadd            
	//   19   32:baload          
	//   20   33:bastore         

	//   21   34:iload           4
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore          4
	//*  25   40:goto            15
	//   26   43:return          
	}

	public int size()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int size>
	//    2    4:ireturn         
	}

	private static final int INITIAL_SIZE = 32;
	private byte bytes[];
	private int size;
}
