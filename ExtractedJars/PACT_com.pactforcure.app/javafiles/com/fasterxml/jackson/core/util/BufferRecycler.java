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
	//    3    3:invokespecial   #35  <Method void BufferRecycler(int, int)>
	//    4    6:return          
	}

	protected BufferRecycler(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_byteBuffers = new byte[i][];
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:anewarray       byte[][]
	//    5    9:putfield        #41  <Field byte[][] _byteBuffers>
		_charBuffers = new char[j][];
	//    6   12:aload_0         
	//    7   13:iload_2         
	//    8   14:anewarray       char[][]
	//    9   17:putfield        #45  <Field char[][] _charBuffers>
	//   10   20:return          
	}

	public final byte[] allocByteBuffer(int i)
	{
		return allocByteBuffer(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #50  <Method byte[] allocByteBuffer(int, int)>
	//    4    6:areturn         
	}

	public byte[] allocByteBuffer(int i, int j)
	{
		int l = byteBufferLength(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #54  <Method int byteBufferLength(int)>
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
		byte abyte0[] = _byteBuffers[i];
	//   11   18:aload_0         
	//   12   19:getfield        #41  <Field byte[][] _byteBuffers>
	//   13   22:iload_1         
	//   14   23:aaload          
	//   15   24:astore          5
		if(abyte0 == null || abyte0.length < k)
	//*  16   26:aload           5
	//*  17   28:ifnull          38
	//*  18   31:aload           5
	//*  19   33:arraylength     
	//*  20   34:iload_3         
	//*  21   35:icmpge          44
		{
			return balloc(k);
	//   22   38:aload_0         
	//   23   39:iload_3         
	//   24   40:invokevirtual   #57  <Method byte[] balloc(int)>
	//   25   43:areturn         
		} else
		{
			_byteBuffers[i] = null;
	//   26   44:aload_0         
	//   27   45:getfield        #41  <Field byte[][] _byteBuffers>
	//   28   48:iload_1         
	//   29   49:aconst_null     
	//   30   50:aastore         
			return abyte0;
	//   31   51:aload           5
	//   32   53:areturn         
		}
	}

	public final char[] allocCharBuffer(int i)
	{
		return allocCharBuffer(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #62  <Method char[] allocCharBuffer(int, int)>
	//    4    6:areturn         
	}

	public char[] allocCharBuffer(int i, int j)
	{
		int l = charBufferLength(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #65  <Method int charBufferLength(int)>
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
		char ac[] = _charBuffers[i];
	//   11   18:aload_0         
	//   12   19:getfield        #45  <Field char[][] _charBuffers>
	//   13   22:iload_1         
	//   14   23:aaload          
	//   15   24:astore          5
		if(ac == null || ac.length < k)
	//*  16   26:aload           5
	//*  17   28:ifnull          38
	//*  18   31:aload           5
	//*  19   33:arraylength     
	//*  20   34:iload_3         
	//*  21   35:icmpge          44
		{
			return calloc(k);
	//   22   38:aload_0         
	//   23   39:iload_3         
	//   24   40:invokevirtual   #68  <Method char[] calloc(int)>
	//   25   43:areturn         
		} else
		{
			_charBuffers[i] = null;
	//   26   44:aload_0         
	//   27   45:getfield        #45  <Field char[][] _charBuffers>
	//   28   48:iload_1         
	//   29   49:aconst_null     
	//   30   50:aastore         
			return ac;
	//   31   51:aload           5
	//   32   53:areturn         
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
	//    0    0:getstatic       #28  <Field int[] BYTE_BUFFER_LENGTHS>
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
	//    0    0:getstatic       #30  <Field int[] CHAR_BUFFER_LENGTHS>
	//    1    3:iload_1         
	//    2    4:iaload          
	//    3    5:ireturn         
	}

	public final void releaseByteBuffer(int i, byte abyte0[])
	{
		_byteBuffers[i] = abyte0;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field byte[][] _byteBuffers>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aastore         
	//    5    7:return          
	}

	public void releaseCharBuffer(int i, char ac[])
	{
		_charBuffers[i] = ac;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field char[][] _charBuffers>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aastore         
	//    5    7:return          
	}

	public static final int BYTE_BASE64_CODEC_BUFFER = 3;
	private static final int BYTE_BUFFER_LENGTHS[] = {
		8000, 8000, 2000, 2000
	};
	public static final int BYTE_READ_IO_BUFFER = 0;
	public static final int BYTE_WRITE_CONCAT_BUFFER = 2;
	public static final int BYTE_WRITE_ENCODING_BUFFER = 1;
	private static final int CHAR_BUFFER_LENGTHS[] = {
		4000, 4000, 200, 200
	};
	public static final int CHAR_CONCAT_BUFFER = 1;
	public static final int CHAR_NAME_COPY_BUFFER = 3;
	public static final int CHAR_TEXT_BUFFER = 2;
	public static final int CHAR_TOKEN_BUFFER = 0;
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
	//   18   27:putstatic       #28  <Field int[] BYTE_BUFFER_LENGTHS>
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
	//   37   57:putstatic       #30  <Field int[] CHAR_BUFFER_LENGTHS>
	//*  38   60:return          
	}
}
