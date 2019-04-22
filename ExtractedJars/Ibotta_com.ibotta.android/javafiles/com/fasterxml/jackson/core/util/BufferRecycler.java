// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;


public class BufferRecycler
{

	public BufferRecycler()
	{
		this(4, 4);
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:iconst_4        
	//    3    3:invokespecial   #22  <Method void BufferRecycler(int, int)>
	//    4    6:return          
	}

	protected BufferRecycler(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		_byteBuffers = new byte[i][];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:anewarray       byte[][]
	//    5    9:putfield        #28  <Field byte[][] _byteBuffers>
		_charBuffers = new char[j][];
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:anewarray       char[][]
	//    9   17:putfield        #32  <Field char[][] _charBuffers>
	//   10   20:return          
	}

	public final byte[] allocByteBuffer(int i)
	{
		return allocByteBuffer(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #37  <Method byte[] allocByteBuffer(int, int)>
	//    4    6:areturn         
	}

	public byte[] allocByteBuffer(int i, int j)
	{
		int l = byteBufferLength(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #41  <Method int byteBufferLength(int)>
	//    3    5:istore          4
		int k = j;
	//    4    7:iload_2         
	//    5    8:istore_3        
		if(j < l)
	//*   6    9:iload_2         
	//*   7   10:iload           4
	//*   8   12:icmpge          18
			k = l;
	//    9   15:iload           4
	//   10   17:istore_3        
		byte abyte0[][] = _byteBuffers;
	//   11   18:aload_0         
	//   12   19:getfield        #28  <Field byte[][] _byteBuffers>
	//   13   22:astore          5
		byte abyte1[] = abyte0[i];
	//   14   24:aload           5
	//   15   26:iload_1         
	//   16   27:aaload          
	//   17   28:astore          6
		if(abyte1 != null && abyte1.length >= k)
	//*  18   30:aload           6
	//*  19   32:ifnull          53
	//*  20   35:aload           6
	//*  21   37:arraylength     
	//*  22   38:iload_3         
	//*  23   39:icmpge          45
	//*  24   42:goto            53
		{
			abyte0[i] = null;
	//   25   45:aload           5
	//   26   47:iload_1         
	//   27   48:aconst_null     
	//   28   49:aastore         
			return abyte1;
	//   29   50:aload           6
	//   30   52:areturn         
		} else
		{
			return balloc(k);
	//   31   53:aload_0         
	//   32   54:iload_3         
	//   33   55:invokevirtual   #44  <Method byte[] balloc(int)>
	//   34   58:areturn         
		}
	}

	public final char[] allocCharBuffer(int i)
	{
		return allocCharBuffer(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #49  <Method char[] allocCharBuffer(int, int)>
	//    4    6:areturn         
	}

	public char[] allocCharBuffer(int i, int j)
	{
		int l = charBufferLength(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #52  <Method int charBufferLength(int)>
	//    3    5:istore          4
		int k = j;
	//    4    7:iload_2         
	//    5    8:istore_3        
		if(j < l)
	//*   6    9:iload_2         
	//*   7   10:iload           4
	//*   8   12:icmpge          18
			k = l;
	//    9   15:iload           4
	//   10   17:istore_3        
		char ac[][] = _charBuffers;
	//   11   18:aload_0         
	//   12   19:getfield        #32  <Field char[][] _charBuffers>
	//   13   22:astore          5
		char ac1[] = ac[i];
	//   14   24:aload           5
	//   15   26:iload_1         
	//   16   27:aaload          
	//   17   28:astore          6
		if(ac1 != null && ac1.length >= k)
	//*  18   30:aload           6
	//*  19   32:ifnull          53
	//*  20   35:aload           6
	//*  21   37:arraylength     
	//*  22   38:iload_3         
	//*  23   39:icmpge          45
	//*  24   42:goto            53
		{
			ac[i] = null;
	//   25   45:aload           5
	//   26   47:iload_1         
	//   27   48:aconst_null     
	//   28   49:aastore         
			return ac1;
	//   29   50:aload           6
	//   30   52:areturn         
		} else
		{
			return calloc(k);
	//   31   53:aload_0         
	//   32   54:iload_3         
	//   33   55:invokevirtual   #55  <Method char[] calloc(int)>
	//   34   58:areturn         
		}
	}

	protected byte[] balloc(int i)
	{
		return new byte[i];
	//    0    0:iload_1         
	//    1    1:newarray        byte[]
	//    2    3:areturn         
	}

	protected int byteBufferLength(int i)
	{
		return BYTE_BUFFER_LENGTHS[i];
	//    0    0:getstatic       #15  <Field int[] BYTE_BUFFER_LENGTHS>
	//    1    3:iload_1         
	//    2    4:iaload          
	//    3    5:ireturn         
	}

	protected char[] calloc(int i)
	{
		return new char[i];
	//    0    0:iload_1         
	//    1    1:newarray        char[]
	//    2    3:areturn         
	}

	protected int charBufferLength(int i)
	{
		return CHAR_BUFFER_LENGTHS[i];
	//    0    0:getstatic       #17  <Field int[] CHAR_BUFFER_LENGTHS>
	//    1    3:iload_1         
	//    2    4:iaload          
	//    3    5:ireturn         
	}

	public void releaseByteBuffer(int i, byte abyte0[])
	{
		_byteBuffers[i] = abyte0;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field byte[][] _byteBuffers>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aastore         
	//    5    7:return          
	}

	public void releaseCharBuffer(int i, char ac[])
	{
		_charBuffers[i] = ac;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field char[][] _charBuffers>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aastore         
	//    5    7:return          
	}

	private static final int BYTE_BUFFER_LENGTHS[] = {
		8000, 8000, 2000, 2000
	};
	private static final int CHAR_BUFFER_LENGTHS[] = {
		4000, 4000, 200, 200
	};
	protected final byte _byteBuffers[][];
	protected final char _charBuffers[][];

	static 
	{
	//    0    0:iconst_4        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:sipush          8000
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:sipush          8000
	//    9   14:iastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:sipush          2000
	//   13   20:iastore         
	//   14   21:dup             
	//   15   22:iconst_3        
	//   16   23:sipush          2000
	//   17   26:iastore         
	//   18   27:putstatic       #15  <Field int[] BYTE_BUFFER_LENGTHS>
	//   19   30:iconst_4        
	//   20   31:newarray        int[]
	//   21   33:dup             
	//   22   34:iconst_0        
	//   23   35:sipush          4000
	//   24   38:iastore         
	//   25   39:dup             
	//   26   40:iconst_1        
	//   27   41:sipush          4000
	//   28   44:iastore         
	//   29   45:dup             
	//   30   46:iconst_2        
	//   31   47:sipush          200
	//   32   50:iastore         
	//   33   51:dup             
	//   34   52:iconst_3        
	//   35   53:sipush          200
	//   36   56:iastore         
	//   37   57:putstatic       #17  <Field int[] CHAR_BUFFER_LENGTHS>
	//*  38   60:return          
	}
}
