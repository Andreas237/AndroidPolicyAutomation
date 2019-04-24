// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

// Referenced classes of package com.google.protobuf:
//			ByteString

public static final class ByteString$Output extends OutputStream
{

	private byte[] copyArray(byte abyte0[], int i)
	{
		byte abyte1[] = new byte[i];
	//    0    0:iload_2         
	//    1    1:newarray        byte[]
	//    2    3:astore_3        
		System.arraycopy(((Object) (abyte0)), 0, ((Object) (abyte1)), 0, Math.min(abyte0.length, i));
	//    3    4:aload_1         
	//    4    5:iconst_0        
	//    5    6:aload_3         
	//    6    7:iconst_0        
	//    7    8:aload_1         
	//    8    9:arraylength     
	//    9   10:iload_2         
	//   10   11:invokestatic    #50  <Method int Math.min(int, int)>
	//   11   14:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		return abyte1;
	//   12   17:aload_3         
	//   13   18:areturn         
	}

	private void flushFullBuffer(int i)
	{
		flushedBuffers.add(((Object) (new ByteString(buffer))));
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ArrayList flushedBuffers>
	//    2    4:new             #59  <Class ByteString$LiteralByteString>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #42  <Field byte[] buffer>
	//    6   12:invokespecial   #62  <Method void ByteString$LiteralByteString(byte[])>
	//    7   15:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
	//    8   18:pop             
		flushedBuffersTotalBytes = flushedBuffersTotalBytes + buffer.length;
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #68  <Field int flushedBuffersTotalBytes>
	//   12   24:aload_0         
	//   13   25:getfield        #42  <Field byte[] buffer>
	//   14   28:arraylength     
	//   15   29:iadd            
	//   16   30:putfield        #68  <Field int flushedBuffersTotalBytes>
		buffer = new byte[Math.max(initialCapacity, Math.max(i, flushedBuffersTotalBytes >>> 1))];
	//   17   33:aload_0         
	//   18   34:aload_0         
	//   19   35:getfield        #35  <Field int initialCapacity>
	//   20   38:iload_1         
	//   21   39:aload_0         
	//   22   40:getfield        #68  <Field int flushedBuffersTotalBytes>
	//   23   43:iconst_1        
	//   24   44:iushr           
	//   25   45:invokestatic    #71  <Method int Math.max(int, int)>
	//   26   48:invokestatic    #71  <Method int Math.max(int, int)>
	//   27   51:newarray        byte[]
	//   28   53:putfield        #42  <Field byte[] buffer>
		bufferPos = 0;
	//   29   56:aload_0         
	//   30   57:iconst_0        
	//   31   58:putfield        #73  <Field int bufferPos>
	//   32   61:return          
	}

	private void flushLastBuffer()
	{
		if(bufferPos < buffer.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int bufferPos>
	//*   2    4:aload_0         
	//*   3    5:getfield        #42  <Field byte[] buffer>
	//*   4    8:arraylength     
	//*   5    9:icmpge          51
		{
			if(bufferPos > 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #73  <Field int bufferPos>
	//*   8   16:ifle            77
			{
				byte abyte0[] = copyArray(buffer, bufferPos);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field byte[] buffer>
	//   12   24:aload_0         
	//   13   25:getfield        #73  <Field int bufferPos>
	//   14   28:invokespecial   #76  <Method byte[] copyArray(byte[], int)>
	//   15   31:astore_1        
				flushedBuffers.add(((Object) (new ByteString(abyte0))));
	//   16   32:aload_0         
	//   17   33:getfield        #40  <Field ArrayList flushedBuffers>
	//   18   36:new             #59  <Class ByteString$LiteralByteString>
	//   19   39:dup             
	//   20   40:aload_1         
	//   21   41:invokespecial   #62  <Method void ByteString$LiteralByteString(byte[])>
	//   22   44:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
	//   23   47:pop             
			}
		} else
	//*  24   48:goto            77
		{
			flushedBuffers.add(((Object) (new ByteString(buffer))));
	//   25   51:aload_0         
	//   26   52:getfield        #40  <Field ArrayList flushedBuffers>
	//   27   55:new             #59  <Class ByteString$LiteralByteString>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:getfield        #42  <Field byte[] buffer>
	//   31   63:invokespecial   #62  <Method void ByteString$LiteralByteString(byte[])>
	//   32   66:invokevirtual   #66  <Method boolean ArrayList.add(Object)>
	//   33   69:pop             
			buffer = EMPTY_BYTE_ARRAY;
	//   34   70:aload_0         
	//   35   71:getstatic       #21  <Field byte[] EMPTY_BYTE_ARRAY>
	//   36   74:putfield        #42  <Field byte[] buffer>
		}
		flushedBuffersTotalBytes = flushedBuffersTotalBytes + bufferPos;
	//   37   77:aload_0         
	//   38   78:aload_0         
	//   39   79:getfield        #68  <Field int flushedBuffersTotalBytes>
	//   40   82:aload_0         
	//   41   83:getfield        #73  <Field int bufferPos>
	//   42   86:iadd            
	//   43   87:putfield        #68  <Field int flushedBuffersTotalBytes>
		bufferPos = 0;
	//   44   90:aload_0         
	//   45   91:iconst_0        
	//   46   92:putfield        #73  <Field int bufferPos>
	//   47   95:return          
	}

	public void reset()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		flushedBuffers.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #40  <Field ArrayList flushedBuffers>
	//    4    6:invokevirtual   #80  <Method void ArrayList.clear()>
		flushedBuffersTotalBytes = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #68  <Field int flushedBuffersTotalBytes>
		bufferPos = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field int bufferPos>
		this;
	//   11   19:aload_0         
		JVM INSTR monitorexit ;
	//   12   20:monitorexit     
		return;
	//   13   21:return          
		Exception exception;
		exception;
	//   14   22:astore_1        
	//*  15   23:aload_0         
		throw exception;
	//   16   24:monitorexit     
	//   17   25:aload_1         
	//   18   26:athrow          
	}

	public int size()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		int j;
		i = flushedBuffersTotalBytes;
	//    2    2:aload_0         
	//    3    3:getfield        #68  <Field int flushedBuffersTotalBytes>
	//    4    6:istore_1        
		j = bufferPos;
	//    5    7:aload_0         
	//    6    8:getfield        #73  <Field int bufferPos>
	//    7   11:istore_2        
		this;
	//    8   12:aload_0         
		JVM INSTR monitorexit ;
	//    9   13:monitorexit     
		return i + j;
	//   10   14:iload_1         
	//   11   15:iload_2         
	//   12   16:iadd            
	//   13   17:ireturn         
		Exception exception;
		exception;
	//   14   18:astore_3        
	//*  15   19:aload_0         
		throw exception;
	//   16   20:monitorexit     
	//   17   21:aload_3         
	//   18   22:athrow          
	}

	public ByteString toByteString()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		ByteString bytestring;
		flushLastBuffer();
	//    2    2:aload_0         
	//    3    3:invokespecial   #86  <Method void flushLastBuffer()>
		bytestring = ByteString.copyFrom(((Iterable) (flushedBuffers)));
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field ArrayList flushedBuffers>
	//    6   10:invokestatic    #90  <Method ByteString ByteString.copyFrom(Iterable)>
	//    7   13:astore_1        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return bytestring;
	//   10   16:aload_1         
	//   11   17:areturn         
		Exception exception;
		exception;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw exception;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public String toString()
	{
		return String.format("<ByteString.Output@%s size=%d>", new Object[] {
			Integer.toHexString(System.identityHashCode(((Object) (this)))), Integer.valueOf(size())
		});
	//    0    0:ldc1            #94  <String "<ByteString.Output@%s size=%d>">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:invokestatic    #100 <Method int System.identityHashCode(Object)>
	//    7   12:invokestatic    #106 <Method String Integer.toHexString(int)>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:invokevirtual   #108 <Method int size()>
	//   13   22:invokestatic    #112 <Method Integer Integer.valueOf(int)>
	//   14   25:aastore         
	//   15   26:invokestatic    #118 <Method String String.format(String, Object[])>
	//   16   29:areturn         
	}

	public void write(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		byte abyte0[];
		if(bufferPos == buffer.length)
	//*   2    2:aload_0         
	//*   3    3:getfield        #73  <Field int bufferPos>
	//*   4    6:aload_0         
	//*   5    7:getfield        #42  <Field byte[] buffer>
	//*   6   10:arraylength     
	//*   7   11:icmpne          19
			flushFullBuffer(1);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokespecial   #121 <Method void flushFullBuffer(int)>
		abyte0 = buffer;
	//   11   19:aload_0         
	//   12   20:getfield        #42  <Field byte[] buffer>
	//   13   23:astore_3        
		j = bufferPos;
	//   14   24:aload_0         
	//   15   25:getfield        #73  <Field int bufferPos>
	//   16   28:istore_2        
		bufferPos = j + 1;
	//   17   29:aload_0         
	//   18   30:iload_2         
	//   19   31:iconst_1        
	//   20   32:iadd            
	//   21   33:putfield        #73  <Field int bufferPos>
		abyte0[j] = (byte)i;
	//   22   36:aload_3         
	//   23   37:iload_2         
	//   24   38:iload_1         
	//   25   39:int2byte        
	//   26   40:bastore         
		this;
	//   27   41:aload_0         
		JVM INSTR monitorexit ;
	//   28   42:monitorexit     
		return;
	//   29   43:return          
		Exception exception;
		exception;
	//   30   44:astore_3        
	//*  31   45:aload_0         
		throw exception;
	//   32   46:monitorexit     
	//   33   47:aload_3         
	//   34   48:athrow          
	}

	public void write(byte abyte0[], int i, int j)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(j <= buffer.length - bufferPos)
	//*   2    2:iload_3         
	//*   3    3:aload_0         
	//*   4    4:getfield        #42  <Field byte[] buffer>
	//*   5    7:arraylength     
	//*   6    8:aload_0         
	//*   7    9:getfield        #73  <Field int bufferPos>
	//*   8   12:isub            
	//*   9   13:icmpgt          43
		{
			System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), bufferPos, j);
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:aload_0         
	//   13   19:getfield        #42  <Field byte[] buffer>
	//   14   22:aload_0         
	//   15   23:getfield        #73  <Field int bufferPos>
	//   16   26:iload_3         
	//   17   27:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
			bufferPos = bufferPos + j;
	//   18   30:aload_0         
	//   19   31:aload_0         
	//   20   32:getfield        #73  <Field int bufferPos>
	//   21   35:iload_3         
	//   22   36:iadd            
	//   23   37:putfield        #73  <Field int bufferPos>
			break MISSING_BLOCK_LABEL_99;
	//   24   40:goto            99
		}
		int k;
		k = buffer.length - bufferPos;
	//   25   43:aload_0         
	//   26   44:getfield        #42  <Field byte[] buffer>
	//   27   47:arraylength     
	//   28   48:aload_0         
	//   29   49:getfield        #73  <Field int bufferPos>
	//   30   52:isub            
	//   31   53:istore          4
		System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), bufferPos, k);
	//   32   55:aload_1         
	//   33   56:iload_2         
	//   34   57:aload_0         
	//   35   58:getfield        #42  <Field byte[] buffer>
	//   36   61:aload_0         
	//   37   62:getfield        #73  <Field int bufferPos>
	//   38   65:iload           4
	//   39   67:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		j -= k;
	//   40   70:iload_3         
	//   41   71:iload           4
	//   42   73:isub            
	//   43   74:istore_3        
		flushFullBuffer(j);
	//   44   75:aload_0         
	//   45   76:iload_3         
	//   46   77:invokespecial   #121 <Method void flushFullBuffer(int)>
		System.arraycopy(((Object) (abyte0)), i + k, ((Object) (buffer)), 0, j);
	//   47   80:aload_1         
	//   48   81:iload_2         
	//   49   82:iload           4
	//   50   84:iadd            
	//   51   85:aload_0         
	//   52   86:getfield        #42  <Field byte[] buffer>
	//   53   89:iconst_0        
	//   54   90:iload_3         
	//   55   91:invokestatic    #56  <Method void System.arraycopy(Object, int, Object, int, int)>
		bufferPos = j;
	//   56   94:aload_0         
	//   57   95:iload_3         
	//   58   96:putfield        #73  <Field int bufferPos>
		this;
	//   59   99:aload_0         
		JVM INSTR monitorexit ;
	//   60  100:monitorexit     
		return;
	//   61  101:return          
		abyte0;
	//   62  102:astore_1        
	//*  63  103:aload_0         
		throw abyte0;
	//   64  104:monitorexit     
	//   65  105:aload_1         
	//   66  106:athrow          
	}

	public void writeTo(OutputStream outputstream)
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int j;
		ByteString abytestring[];
		byte abyte0[];
		abytestring = (ByteString[])flushedBuffers.toArray(((Object []) (new ByteString[flushedBuffers.size()])));
	//    2    2:aload_0         
	//    3    3:getfield        #40  <Field ArrayList flushedBuffers>
	//    4    6:aload_0         
	//    5    7:getfield        #40  <Field ArrayList flushedBuffers>
	//    6   10:invokevirtual   #127 <Method int ArrayList.size()>
	//    7   13:anewarray       ByteString[]
	//    8   16:invokevirtual   #131 <Method Object[] ArrayList.toArray(Object[])>
	//    9   19:checkcast       #133 <Class ByteString[]>
	//   10   22:astore          5
		abyte0 = buffer;
	//   11   24:aload_0         
	//   12   25:getfield        #42  <Field byte[] buffer>
	//   13   28:astore          6
		j = bufferPos;
	//   14   30:aload_0         
	//   15   31:getfield        #73  <Field int bufferPos>
	//   16   34:istore_3        
		this;
	//   17   35:aload_0         
		JVM INSTR monitorexit ;
	//   18   36:monitorexit     
		  goto _L1
	//*  19   37:goto            45
		outputstream;
	//   20   40:astore_1        
	//*  21   41:aload_0         
		throw outputstream;
	//   22   42:monitorexit     
	//   23   43:aload_1         
	//   24   44:athrow          
_L1:
		int k = abytestring.length;
	//   25   45:aload           5
	//   26   47:arraylength     
	//   27   48:istore          4
		for(int i = 0; i < k; i++)
	//*  28   50:iconst_0        
	//*  29   51:istore_2        
	//*  30   52:iload_2         
	//*  31   53:iload           4
	//*  32   55:icmpge          73
			abytestring[i].writeTo(outputstream);
	//   33   58:aload           5
	//   34   60:iload_2         
	//   35   61:aaload          
	//   36   62:aload_1         
	//   37   63:invokevirtual   #135 <Method void ByteString.writeTo(OutputStream)>

	//   38   66:iload_2         
	//   39   67:iconst_1        
	//   40   68:iadd            
	//   41   69:istore_2        
	//*  42   70:goto            52
		outputstream.write(copyArray(abyte0, j));
	//   43   73:aload_1         
	//   44   74:aload_0         
	//   45   75:aload           6
	//   46   77:iload_3         
	//   47   78:invokespecial   #76  <Method byte[] copyArray(byte[], int)>
	//   48   81:invokevirtual   #137 <Method void OutputStream.write(byte[])>
		return;
	//   49   84:return          
	}

	private static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
	private byte buffer[];
	private int bufferPos;
	private final ArrayList flushedBuffers;
	private int flushedBuffersTotalBytes;
	private final int initialCapacity;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #21  <Field byte[] EMPTY_BYTE_ARRAY>
	//*   3    6:return          
	}

	ByteString$Output(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void OutputStream()>
		if(i < 0)
	//*   2    4:iload_1         
	//*   3    5:ifge            18
		{
			throw new IllegalArgumentException("Buffer size < 0");
	//    4    8:new             #28  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #30  <String "Buffer size < 0">
	//    7   14:invokespecial   #33  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		} else
		{
			initialCapacity = i;
	//    9   18:aload_0         
	//   10   19:iload_1         
	//   11   20:putfield        #35  <Field int initialCapacity>
			flushedBuffers = new ArrayList();
	//   12   23:aload_0         
	//   13   24:new             #37  <Class ArrayList>
	//   14   27:dup             
	//   15   28:invokespecial   #38  <Method void ArrayList()>
	//   16   31:putfield        #40  <Field ArrayList flushedBuffers>
			buffer = new byte[i];
	//   17   34:aload_0         
	//   18   35:iload_1         
	//   19   36:newarray        byte[]
	//   20   38:putfield        #42  <Field byte[] buffer>
			return;
	//   21   41:return          
		}
	}
}
