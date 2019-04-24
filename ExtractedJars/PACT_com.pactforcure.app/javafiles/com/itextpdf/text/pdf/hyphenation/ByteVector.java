// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.hyphenation;

import java.io.Serializable;

public class ByteVector
	implements Serializable
{

	public ByteVector()
	{
		this(2048);
	//    0    0:aload_0         
	//    1    1:sipush          2048
	//    2    4:invokespecial   #22  <Method void ByteVector(int)>
	//    3    7:return          
	}

	public ByteVector(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(i > 0)
	//*   2    4:iload_1         
	//*   3    5:ifle            29
			blockSize = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #27  <Field int blockSize>
		else
	//*   7   13:aload_0         
	//*   8   14:aload_0         
	//*   9   15:getfield        #27  <Field int blockSize>
	//*  10   18:newarray        byte[]
	//*  11   20:putfield        #29  <Field byte[] array>
	//*  12   23:aload_0         
	//*  13   24:iconst_0        
	//*  14   25:putfield        #31  <Field int n>
	//*  15   28:return          
			blockSize = 2048;
	//   16   29:aload_0         
	//   17   30:sipush          2048
	//   18   33:putfield        #27  <Field int blockSize>
		array = new byte[blockSize];
		n = 0;
	//*  19   36:goto            13
	}

	public ByteVector(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		blockSize = 2048;
	//    2    4:aload_0         
	//    3    5:sipush          2048
	//    4    8:putfield        #27  <Field int blockSize>
		array = abyte0;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:putfield        #29  <Field byte[] array>
		n = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #31  <Field int n>
	//   11   21:return          
	}

	public ByteVector(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		if(i > 0)
	//*   2    4:iload_2         
	//*   3    5:ifle            24
			blockSize = i;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #27  <Field int blockSize>
		else
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:putfield        #29  <Field byte[] array>
	//*  10   18:aload_0         
	//*  11   19:iconst_0        
	//*  12   20:putfield        #31  <Field int n>
	//*  13   23:return          
			blockSize = 2048;
	//   14   24:aload_0         
	//   15   25:sipush          2048
	//   16   28:putfield        #27  <Field int blockSize>
		array = abyte0;
		n = 0;
	//*  17   31:goto            13
	}

	public int alloc(int i)
	{
		int j = n;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int n>
	//    2    4:istore_2        
		int k = array.length;
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field byte[] array>
	//    5    9:arraylength     
	//    6   10:istore_3        
		if(n + i >= k)
	//*   7   11:aload_0         
	//*   8   12:getfield        #31  <Field int n>
	//*   9   15:iload_1         
	//*  10   16:iadd            
	//*  11   17:iload_3         
	//*  12   18:icmplt          49
		{
			byte abyte0[] = new byte[blockSize + k];
	//   13   21:aload_0         
	//   14   22:getfield        #27  <Field int blockSize>
	//   15   25:iload_3         
	//   16   26:iadd            
	//   17   27:newarray        byte[]
	//   18   29:astore          4
			System.arraycopy(((Object) (array)), 0, ((Object) (abyte0)), 0, k);
	//   19   31:aload_0         
	//   20   32:getfield        #29  <Field byte[] array>
	//   21   35:iconst_0        
	//   22   36:aload           4
	//   23   38:iconst_0        
	//   24   39:iload_3         
	//   25   40:invokestatic    #41  <Method void System.arraycopy(Object, int, Object, int, int)>
			array = abyte0;
	//   26   43:aload_0         
	//   27   44:aload           4
	//   28   46:putfield        #29  <Field byte[] array>
		}
		n = n + i;
	//   29   49:aload_0         
	//   30   50:aload_0         
	//   31   51:getfield        #31  <Field int n>
	//   32   54:iload_1         
	//   33   55:iadd            
	//   34   56:putfield        #31  <Field int n>
		return j;
	//   35   59:iload_2         
	//   36   60:ireturn         
	}

	public int capacity()
	{
		return array.length;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[] array>
	//    2    4:arraylength     
	//    3    5:ireturn         
	}

	public byte get(int i)
	{
		return array[i];
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[] array>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:ireturn         
	}

	public byte[] getArray()
	{
		return array;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[] array>
	//    2    4:areturn         
	}

	public int length()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int n>
	//    2    4:ireturn         
	}

	public void put(int i, byte byte0)
	{
		array[i] = byte0;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field byte[] array>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:bastore         
	//    5    7:return          
	}

	public void trimToSize()
	{
		if(n < array.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field int n>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field byte[] array>
	//*   4    8:arraylength     
	//*   5    9:icmpge          38
		{
			byte abyte0[] = new byte[n];
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field int n>
	//    8   16:newarray        byte[]
	//    9   18:astore_1        
			System.arraycopy(((Object) (array)), 0, ((Object) (abyte0)), 0, n);
	//   10   19:aload_0         
	//   11   20:getfield        #29  <Field byte[] array>
	//   12   23:iconst_0        
	//   13   24:aload_1         
	//   14   25:iconst_0        
	//   15   26:aload_0         
	//   16   27:getfield        #31  <Field int n>
	//   17   30:invokestatic    #41  <Method void System.arraycopy(Object, int, Object, int, int)>
			array = abyte0;
	//   18   33:aload_0         
	//   19   34:aload_1         
	//   20   35:putfield        #29  <Field byte[] array>
		}
	//   21   38:return          
	}

	private static final int DEFAULT_BLOCK_SIZE = 2048;
	private static final long serialVersionUID = 0x5ee1b7a1L;
	private byte array[];
	private int blockSize;
	private int n;
}
