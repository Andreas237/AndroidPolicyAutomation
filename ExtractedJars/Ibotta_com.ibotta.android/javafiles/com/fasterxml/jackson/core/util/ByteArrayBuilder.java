// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			BufferRecycler

public final class ByteArrayBuilder extends OutputStream
{

	public ByteArrayBuilder()
	{
		this(((BufferRecycler) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #24  <Method void ByteArrayBuilder(BufferRecycler)>
	//    3    5:return          
	}

	public ByteArrayBuilder(int i)
	{
		this(((BufferRecycler) (null)), i);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:invokespecial   #28  <Method void ByteArrayBuilder(BufferRecycler, int)>
	//    4    6:return          
	}

	public ByteArrayBuilder(BufferRecycler bufferrecycler)
	{
		this(bufferrecycler, 500);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          500
	//    3    5:invokespecial   #28  <Method void ByteArrayBuilder(BufferRecycler, int)>
	//    4    8:return          
	}

	public ByteArrayBuilder(BufferRecycler bufferrecycler, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void OutputStream()>
		_pastBlocks = new LinkedList();
	//    2    4:aload_0         
	//    3    5:new             #32  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void LinkedList()>
	//    6   12:putfield        #35  <Field LinkedList _pastBlocks>
		_bufferRecycler = bufferrecycler;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #37  <Field BufferRecycler _bufferRecycler>
		if(bufferrecycler == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       31
			bufferrecycler = ((BufferRecycler) (new byte[i]));
	//   12   24:iload_2         
	//   13   25:newarray        byte[]
	//   14   27:astore_1        
		else
	//*  15   28:goto            37
			bufferrecycler = ((BufferRecycler) (bufferrecycler.allocByteBuffer(2)));
	//   16   31:aload_1         
	//   17   32:iconst_2        
	//   18   33:invokevirtual   #43  <Method byte[] BufferRecycler.allocByteBuffer(int)>
	//   19   36:astore_1        
		_currBlock = ((byte []) (bufferrecycler));
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:putfield        #45  <Field byte[] _currBlock>
	//   23   42:return          
	}

	private void _allocMore()
	{
		int i = _pastLen + _currBlock.length;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int _pastLen>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field byte[] _currBlock>
	//    4    8:arraylength     
	//    5    9:iadd            
	//    6   10:istore_1        
		if(i >= 0)
	//*   7   11:iload_1         
	//*   8   12:iflt            69
		{
			_pastLen = i;
	//    9   15:aload_0         
	//   10   16:iload_1         
	//   11   17:putfield        #48  <Field int _pastLen>
			int j = Math.max(_pastLen >> 1, 1000);
	//   12   20:aload_0         
	//   13   21:getfield        #48  <Field int _pastLen>
	//   14   24:iconst_1        
	//   15   25:ishr            
	//   16   26:sipush          1000
	//   17   29:invokestatic    #54  <Method int Math.max(int, int)>
	//   18   32:istore_2        
			i = j;
	//   19   33:iload_2         
	//   20   34:istore_1        
			if(j > 0x40000)
	//*  21   35:iload_2         
	//*  22   36:ldc1            #55  <Int 0x40000>
	//*  23   38:icmple          44
				i = 0x40000;
	//   24   41:ldc1            #55  <Int 0x40000>
	//   25   43:istore_1        
			_pastBlocks.add(((Object) (_currBlock)));
	//   26   44:aload_0         
	//   27   45:getfield        #35  <Field LinkedList _pastBlocks>
	//   28   48:aload_0         
	//   29   49:getfield        #45  <Field byte[] _currBlock>
	//   30   52:invokevirtual   #59  <Method boolean LinkedList.add(Object)>
	//   31   55:pop             
			_currBlock = new byte[i];
	//   32   56:aload_0         
	//   33   57:iload_1         
	//   34   58:newarray        byte[]
	//   35   60:putfield        #45  <Field byte[] _currBlock>
			_currBlockPtr = 0;
	//   36   63:aload_0         
	//   37   64:iconst_0        
	//   38   65:putfield        #61  <Field int _currBlockPtr>
			return;
	//   39   68:return          
		} else
		{
			throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
	//   40   69:new             #63  <Class IllegalStateException>
	//   41   72:dup             
	//   42   73:ldc1            #65  <String "Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`">
	//   43   75:invokespecial   #68  <Method void IllegalStateException(String)>
	//   44   78:athrow          
		}
	}

	public void append(int i)
	{
		if(_currBlockPtr >= _currBlock.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field int _currBlockPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field byte[] _currBlock>
	//*   4    8:arraylength     
	//*   5    9:icmplt          16
			_allocMore();
	//    6   12:aload_0         
	//    7   13:invokespecial   #71  <Method void _allocMore()>
		byte abyte0[] = _currBlock;
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field byte[] _currBlock>
	//   10   20:astore_3        
		int j = _currBlockPtr;
	//   11   21:aload_0         
	//   12   22:getfield        #61  <Field int _currBlockPtr>
	//   13   25:istore_2        
		_currBlockPtr = j + 1;
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:putfield        #61  <Field int _currBlockPtr>
		abyte0[j] = (byte)i;
	//   19   33:aload_3         
	//   20   34:iload_2         
	//   21   35:iload_1         
	//   22   36:int2byte        
	//   23   37:bastore         
	//   24   38:return          
	}

	public void appendThreeBytes(int i)
	{
		int j = _currBlockPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _currBlockPtr>
	//    2    4:istore_2        
		byte abyte0[] = _currBlock;
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field byte[] _currBlock>
	//    5    9:astore_3        
		if(j + 2 < abyte0.length)
	//*   6   10:iload_2         
	//*   7   11:iconst_2        
	//*   8   12:iadd            
	//*   9   13:aload_3         
	//*  10   14:arraylength     
	//*  11   15:icmpge          71
		{
			_currBlockPtr = j + 1;
	//   12   18:aload_0         
	//   13   19:iload_2         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:putfield        #61  <Field int _currBlockPtr>
			abyte0[j] = (byte)(i >> 16);
	//   17   25:aload_3         
	//   18   26:iload_2         
	//   19   27:iload_1         
	//   20   28:bipush          16
	//   21   30:ishr            
	//   22   31:int2byte        
	//   23   32:bastore         
			j = _currBlockPtr;
	//   24   33:aload_0         
	//   25   34:getfield        #61  <Field int _currBlockPtr>
	//   26   37:istore_2        
			_currBlockPtr = j + 1;
	//   27   38:aload_0         
	//   28   39:iload_2         
	//   29   40:iconst_1        
	//   30   41:iadd            
	//   31   42:putfield        #61  <Field int _currBlockPtr>
			abyte0[j] = (byte)(i >> 8);
	//   32   45:aload_3         
	//   33   46:iload_2         
	//   34   47:iload_1         
	//   35   48:bipush          8
	//   36   50:ishr            
	//   37   51:int2byte        
	//   38   52:bastore         
			j = _currBlockPtr;
	//   39   53:aload_0         
	//   40   54:getfield        #61  <Field int _currBlockPtr>
	//   41   57:istore_2        
			_currBlockPtr = j + 1;
	//   42   58:aload_0         
	//   43   59:iload_2         
	//   44   60:iconst_1        
	//   45   61:iadd            
	//   46   62:putfield        #61  <Field int _currBlockPtr>
			abyte0[j] = (byte)i;
	//   47   65:aload_3         
	//   48   66:iload_2         
	//   49   67:iload_1         
	//   50   68:int2byte        
	//   51   69:bastore         
			return;
	//   52   70:return          
		} else
		{
			append(i >> 16);
	//   53   71:aload_0         
	//   54   72:iload_1         
	//   55   73:bipush          16
	//   56   75:ishr            
	//   57   76:invokevirtual   #74  <Method void append(int)>
			append(i >> 8);
	//   58   79:aload_0         
	//   59   80:iload_1         
	//   60   81:bipush          8
	//   61   83:ishr            
	//   62   84:invokevirtual   #74  <Method void append(int)>
			append(i);
	//   63   87:aload_0         
	//   64   88:iload_1         
	//   65   89:invokevirtual   #74  <Method void append(int)>
			return;
	//   66   92:return          
		}
	}

	public void appendTwoBytes(int i)
	{
		int j = _currBlockPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _currBlockPtr>
	//    2    4:istore_2        
		byte abyte0[] = _currBlock;
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field byte[] _currBlock>
	//    5    9:astore_3        
		if(j + 1 < abyte0.length)
	//*   6   10:iload_2         
	//*   7   11:iconst_1        
	//*   8   12:iadd            
	//*   9   13:aload_3         
	//*  10   14:arraylength     
	//*  11   15:icmpge          51
		{
			_currBlockPtr = j + 1;
	//   12   18:aload_0         
	//   13   19:iload_2         
	//   14   20:iconst_1        
	//   15   21:iadd            
	//   16   22:putfield        #61  <Field int _currBlockPtr>
			abyte0[j] = (byte)(i >> 8);
	//   17   25:aload_3         
	//   18   26:iload_2         
	//   19   27:iload_1         
	//   20   28:bipush          8
	//   21   30:ishr            
	//   22   31:int2byte        
	//   23   32:bastore         
			j = _currBlockPtr;
	//   24   33:aload_0         
	//   25   34:getfield        #61  <Field int _currBlockPtr>
	//   26   37:istore_2        
			_currBlockPtr = j + 1;
	//   27   38:aload_0         
	//   28   39:iload_2         
	//   29   40:iconst_1        
	//   30   41:iadd            
	//   31   42:putfield        #61  <Field int _currBlockPtr>
			abyte0[j] = (byte)i;
	//   32   45:aload_3         
	//   33   46:iload_2         
	//   34   47:iload_1         
	//   35   48:int2byte        
	//   36   49:bastore         
			return;
	//   37   50:return          
		} else
		{
			append(i >> 8);
	//   38   51:aload_0         
	//   39   52:iload_1         
	//   40   53:bipush          8
	//   41   55:ishr            
	//   42   56:invokevirtual   #74  <Method void append(int)>
			append(i);
	//   43   59:aload_0         
	//   44   60:iload_1         
	//   45   61:invokevirtual   #74  <Method void append(int)>
			return;
	//   46   64:return          
		}
	}

	public void close()
	{
	//    0    0:return          
	}

	public byte[] completeAndCoalesce(int i)
	{
		_currBlockPtr = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int _currBlockPtr>
		return toByteArray();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #81  <Method byte[] toByteArray()>
	//    5    9:areturn         
	}

	public byte[] finishCurrentSegment()
	{
		_allocMore();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void _allocMore()>
		return _currBlock;
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field byte[] _currBlock>
	//    4    8:areturn         
	}

	public void flush()
	{
	//    0    0:return          
	}

	public byte[] getCurrentSegment()
	{
		return _currBlock;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field byte[] _currBlock>
	//    2    4:areturn         
	}

	public int getCurrentSegmentLength()
	{
		return _currBlockPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _currBlockPtr>
	//    2    4:ireturn         
	}

	public void release()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method void reset()>
		BufferRecycler bufferrecycler = _bufferRecycler;
	//    2    4:aload_0         
	//    3    5:getfield        #37  <Field BufferRecycler _bufferRecycler>
	//    4    8:astore_1        
		if(bufferrecycler != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          33
		{
			byte abyte0[] = _currBlock;
	//    7   13:aload_0         
	//    8   14:getfield        #45  <Field byte[] _currBlock>
	//    9   17:astore_2        
			if(abyte0 != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          33
			{
				bufferrecycler.releaseByteBuffer(2, abyte0);
	//   12   22:aload_1         
	//   13   23:iconst_2        
	//   14   24:aload_2         
	//   15   25:invokevirtual   #94  <Method void BufferRecycler.releaseByteBuffer(int, byte[])>
				_currBlock = null;
	//   16   28:aload_0         
	//   17   29:aconst_null     
	//   18   30:putfield        #45  <Field byte[] _currBlock>
			}
		}
	//   19   33:return          
	}

	public void reset()
	{
		_pastLen = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #48  <Field int _pastLen>
		_currBlockPtr = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #61  <Field int _currBlockPtr>
		if(!_pastBlocks.isEmpty())
	//*   6   10:aload_0         
	//*   7   11:getfield        #35  <Field LinkedList _pastBlocks>
	//*   8   14:invokevirtual   #98  <Method boolean LinkedList.isEmpty()>
	//*   9   17:ifne            27
			_pastBlocks.clear();
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field LinkedList _pastBlocks>
	//   12   24:invokevirtual   #101 <Method void LinkedList.clear()>
	//   13   27:return          
	}

	public byte[] resetAndGetFirstSegment()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method void reset()>
		return _currBlock;
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field byte[] _currBlock>
	//    4    8:areturn         
	}

	public void setCurrentSegmentLength(int i)
	{
		_currBlockPtr = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #61  <Field int _currBlockPtr>
	//    3    5:return          
	}

	public byte[] toByteArray()
	{
		int j = _pastLen + _currBlockPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field int _pastLen>
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field int _currBlockPtr>
	//    4    8:iadd            
	//    5    9:istore_2        
		if(j == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            18
			return NO_BYTES;
	//    8   14:getstatic       #19  <Field byte[] NO_BYTES>
	//    9   17:areturn         
		byte abyte0[] = new byte[j];
	//   10   18:iload_2         
	//   11   19:newarray        byte[]
	//   12   21:astore          4
		Iterator iterator = _pastBlocks.iterator();
	//   13   23:aload_0         
	//   14   24:getfield        #35  <Field LinkedList _pastBlocks>
	//   15   27:invokevirtual   #107 <Method Iterator LinkedList.iterator()>
	//   16   30:astore          5
		int i;
		int k;
		for(i = 0; iterator.hasNext(); i += k)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:aload           5
	//*  20   36:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//*  21   41:ifeq            77
		{
			byte abyte1[] = (byte[])iterator.next();
	//   22   44:aload           5
	//   23   46:invokeinterface #116 <Method Object Iterator.next()>
	//   24   51:checkcast       #117 <Class byte[]>
	//   25   54:astore          6
			k = abyte1.length;
	//   26   56:aload           6
	//   27   58:arraylength     
	//   28   59:istore_3        
			System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, k);
	//   29   60:aload           6
	//   30   62:iconst_0        
	//   31   63:aload           4
	//   32   65:iload_1         
	//   33   66:iload_3         
	//   34   67:invokestatic    #123 <Method void System.arraycopy(Object, int, Object, int, int)>
		}

	//   35   70:iload_1         
	//   36   71:iload_3         
	//   37   72:iadd            
	//   38   73:istore_1        
	//*  39   74:goto            34
		System.arraycopy(((Object) (_currBlock)), 0, ((Object) (abyte0)), i, _currBlockPtr);
	//   40   77:aload_0         
	//   41   78:getfield        #45  <Field byte[] _currBlock>
	//   42   81:iconst_0        
	//   43   82:aload           4
	//   44   84:iload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #61  <Field int _currBlockPtr>
	//   47   89:invokestatic    #123 <Method void System.arraycopy(Object, int, Object, int, int)>
		i += _currBlockPtr;
	//   48   92:iload_1         
	//   49   93:aload_0         
	//   50   94:getfield        #61  <Field int _currBlockPtr>
	//   51   97:iadd            
	//   52   98:istore_1        
		if(i == j)
	//*  53   99:iload_1         
	//*  54  100:iload_2         
	//*  55  101:icmpne          121
		{
			if(!_pastBlocks.isEmpty())
	//*  56  104:aload_0         
	//*  57  105:getfield        #35  <Field LinkedList _pastBlocks>
	//*  58  108:invokevirtual   #98  <Method boolean LinkedList.isEmpty()>
	//*  59  111:ifne            118
				reset();
	//   60  114:aload_0         
	//   61  115:invokevirtual   #90  <Method void reset()>
			return abyte0;
	//   62  118:aload           4
	//   63  120:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   64  121:new             #125 <Class StringBuilder>
	//   65  124:dup             
	//   66  125:invokespecial   #126 <Method void StringBuilder()>
	//   67  128:astore          4
			stringbuilder.append("Internal error: total len assumed to be ");
	//   68  130:aload           4
	//   69  132:ldc1            #128 <String "Internal error: total len assumed to be ">
	//   70  134:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
			stringbuilder.append(j);
	//   72  138:aload           4
	//   73  140:iload_2         
	//   74  141:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   75  144:pop             
			stringbuilder.append(", copied ");
	//   76  145:aload           4
	//   77  147:ldc1            #136 <String ", copied ">
	//   78  149:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   79  152:pop             
			stringbuilder.append(i);
	//   80  153:aload           4
	//   81  155:iload_1         
	//   82  156:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   83  159:pop             
			stringbuilder.append(" bytes");
	//   84  160:aload           4
	//   85  162:ldc1            #138 <String " bytes">
	//   86  164:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   87  167:pop             
			throw new RuntimeException(stringbuilder.toString());
	//   88  168:new             #140 <Class RuntimeException>
	//   89  171:dup             
	//   90  172:aload           4
	//   91  174:invokevirtual   #144 <Method String StringBuilder.toString()>
	//   92  177:invokespecial   #145 <Method void RuntimeException(String)>
	//   93  180:athrow          
		}
	}

	public void write(int i)
	{
		append(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #74  <Method void append(int)>
	//    3    5:return          
	}

	public void write(byte abyte0[])
	{
		write(abyte0, 0, abyte0.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #150 <Method void write(byte[], int, int)>
	//    6    8:return          
	}

	public void write(byte abyte0[], int i, int j)
	{
		int k = i;
	//    0    0:iload_2         
	//    1    1:istore          4
		do
		{
			int i1 = Math.min(_currBlock.length - _currBlockPtr, j);
	//    2    3:aload_0         
	//    3    4:getfield        #45  <Field byte[] _currBlock>
	//    4    7:arraylength     
	//    5    8:aload_0         
	//    6    9:getfield        #61  <Field int _currBlockPtr>
	//    7   12:isub            
	//    8   13:iload_3         
	//    9   14:invokestatic    #153 <Method int Math.min(int, int)>
	//   10   17:istore          6
			int l = k;
	//   11   19:iload           4
	//   12   21:istore          5
			i = j;
	//   13   23:iload_3         
	//   14   24:istore_2        
			if(i1 > 0)
	//*  15   25:iload           6
	//*  16   27:ifle            69
			{
				System.arraycopy(((Object) (abyte0)), k, ((Object) (_currBlock)), _currBlockPtr, i1);
	//   17   30:aload_1         
	//   18   31:iload           4
	//   19   33:aload_0         
	//   20   34:getfield        #45  <Field byte[] _currBlock>
	//   21   37:aload_0         
	//   22   38:getfield        #61  <Field int _currBlockPtr>
	//   23   41:iload           6
	//   24   43:invokestatic    #123 <Method void System.arraycopy(Object, int, Object, int, int)>
				l = k + i1;
	//   25   46:iload           4
	//   26   48:iload           6
	//   27   50:iadd            
	//   28   51:istore          5
				_currBlockPtr = _currBlockPtr + i1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #61  <Field int _currBlockPtr>
	//   32   58:iload           6
	//   33   60:iadd            
	//   34   61:putfield        #61  <Field int _currBlockPtr>
				i = j - i1;
	//   35   64:iload_3         
	//   36   65:iload           6
	//   37   67:isub            
	//   38   68:istore_2        
			}
			if(i <= 0)
	//*  39   69:iload_2         
	//*  40   70:ifgt            74
				return;
	//   41   73:return          
			_allocMore();
	//   42   74:aload_0         
	//   43   75:invokespecial   #71  <Method void _allocMore()>
			k = l;
	//   44   78:iload           5
	//   45   80:istore          4
			j = i;
	//   46   82:iload_2         
	//   47   83:istore_3        
		} while(true);
	//   48   84:goto            3
	}

	public static final byte NO_BYTES[] = new byte[0];
	private final BufferRecycler _bufferRecycler;
	private byte _currBlock[];
	private int _currBlockPtr;
	private final LinkedList _pastBlocks;
	private int _pastLen;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #19  <Field byte[] NO_BYTES>
	//*   3    6:return          
	}
}
