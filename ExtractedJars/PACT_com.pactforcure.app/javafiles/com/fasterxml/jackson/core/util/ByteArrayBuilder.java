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
	//    2    2:invokespecial   #30  <Method void ByteArrayBuilder(BufferRecycler)>
	//    3    5:return          
	}

	public ByteArrayBuilder(int i)
	{
		this(((BufferRecycler) (null)), i);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:iload_1         
	//    3    3:invokespecial   #34  <Method void ByteArrayBuilder(BufferRecycler, int)>
	//    4    6:return          
	}

	public ByteArrayBuilder(BufferRecycler bufferrecycler)
	{
		this(bufferrecycler, 500);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:sipush          500
	//    3    5:invokespecial   #34  <Method void ByteArrayBuilder(BufferRecycler, int)>
	//    4    8:return          
	}

	public ByteArrayBuilder(BufferRecycler bufferrecycler, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void OutputStream()>
		_pastBlocks = new LinkedList();
	//    2    4:aload_0         
	//    3    5:new             #38  <Class LinkedList>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void LinkedList()>
	//    6   12:putfield        #41  <Field LinkedList _pastBlocks>
		_bufferRecycler = bufferrecycler;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #43  <Field BufferRecycler _bufferRecycler>
		if(bufferrecycler == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       34
			bufferrecycler = ((BufferRecycler) (new byte[i]));
	//   12   24:iload_2         
	//   13   25:newarray        byte[]
	//   14   27:astore_1        
		else
	//*  15   28:aload_0         
	//*  16   29:aload_1         
	//*  17   30:putfield        #45  <Field byte[] _currBlock>
	//*  18   33:return          
			bufferrecycler = ((BufferRecycler) (bufferrecycler.allocByteBuffer(2)));
	//   19   34:aload_1         
	//   20   35:iconst_2        
	//   21   36:invokevirtual   #51  <Method byte[] BufferRecycler.allocByteBuffer(int)>
	//   22   39:astore_1        
		_currBlock = ((byte []) (bufferrecycler));
	//*  23   40:goto            28
	}

	private void _allocMore()
	{
		_pastLen = _pastLen + _currBlock.length;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field int _pastLen>
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field byte[] _currBlock>
	//    5    9:arraylength     
	//    6   10:iadd            
	//    7   11:putfield        #54  <Field int _pastLen>
		int j = Math.max(_pastLen >> 1, 1000);
	//    8   14:aload_0         
	//    9   15:getfield        #54  <Field int _pastLen>
	//   10   18:iconst_1        
	//   11   19:ishr            
	//   12   20:sipush          1000
	//   13   23:invokestatic    #60  <Method int Math.max(int, int)>
	//   14   26:istore_2        
		int i = j;
	//   15   27:iload_2         
	//   16   28:istore_1        
		if(j > 0x40000)
	//*  17   29:iload_2         
	//*  18   30:ldc1            #11  <Int 0x40000>
	//*  19   32:icmple          38
			i = 0x40000;
	//   20   35:ldc1            #11  <Int 0x40000>
	//   21   37:istore_1        
		_pastBlocks.add(((Object) (_currBlock)));
	//   22   38:aload_0         
	//   23   39:getfield        #41  <Field LinkedList _pastBlocks>
	//   24   42:aload_0         
	//   25   43:getfield        #45  <Field byte[] _currBlock>
	//   26   46:invokevirtual   #64  <Method boolean LinkedList.add(Object)>
	//   27   49:pop             
		_currBlock = new byte[i];
	//   28   50:aload_0         
	//   29   51:iload_1         
	//   30   52:newarray        byte[]
	//   31   54:putfield        #45  <Field byte[] _currBlock>
		_currBlockPtr = 0;
	//   32   57:aload_0         
	//   33   58:iconst_0        
	//   34   59:putfield        #66  <Field int _currBlockPtr>
	//   35   62:return          
	}

	public void append(int i)
	{
		if(_currBlockPtr >= _currBlock.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field int _currBlockPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #45  <Field byte[] _currBlock>
	//*   4    8:arraylength     
	//*   5    9:icmplt          16
			_allocMore();
	//    6   12:aload_0         
	//    7   13:invokespecial   #69  <Method void _allocMore()>
		byte abyte0[] = _currBlock;
	//    8   16:aload_0         
	//    9   17:getfield        #45  <Field byte[] _currBlock>
	//   10   20:astore_3        
		int j = _currBlockPtr;
	//   11   21:aload_0         
	//   12   22:getfield        #66  <Field int _currBlockPtr>
	//   13   25:istore_2        
		_currBlockPtr = j + 1;
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:putfield        #66  <Field int _currBlockPtr>
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
		if(_currBlockPtr + 2 < _currBlock.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field int _currBlockPtr>
	//*   2    4:iconst_2        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #45  <Field byte[] _currBlock>
	//*   6   10:arraylength     
	//*   7   11:icmpge          87
		{
			byte abyte0[] = _currBlock;
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field byte[] _currBlock>
	//   10   18:astore_3        
			int j = _currBlockPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #66  <Field int _currBlockPtr>
	//   13   23:istore_2        
			_currBlockPtr = j + 1;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:putfield        #66  <Field int _currBlockPtr>
			abyte0[j] = (byte)(i >> 16);
	//   19   31:aload_3         
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:bipush          16
	//   23   36:ishr            
	//   24   37:int2byte        
	//   25   38:bastore         
			abyte0 = _currBlock;
	//   26   39:aload_0         
	//   27   40:getfield        #45  <Field byte[] _currBlock>
	//   28   43:astore_3        
			j = _currBlockPtr;
	//   29   44:aload_0         
	//   30   45:getfield        #66  <Field int _currBlockPtr>
	//   31   48:istore_2        
			_currBlockPtr = j + 1;
	//   32   49:aload_0         
	//   33   50:iload_2         
	//   34   51:iconst_1        
	//   35   52:iadd            
	//   36   53:putfield        #66  <Field int _currBlockPtr>
			abyte0[j] = (byte)(i >> 8);
	//   37   56:aload_3         
	//   38   57:iload_2         
	//   39   58:iload_1         
	//   40   59:bipush          8
	//   41   61:ishr            
	//   42   62:int2byte        
	//   43   63:bastore         
			abyte0 = _currBlock;
	//   44   64:aload_0         
	//   45   65:getfield        #45  <Field byte[] _currBlock>
	//   46   68:astore_3        
			j = _currBlockPtr;
	//   47   69:aload_0         
	//   48   70:getfield        #66  <Field int _currBlockPtr>
	//   49   73:istore_2        
			_currBlockPtr = j + 1;
	//   50   74:aload_0         
	//   51   75:iload_2         
	//   52   76:iconst_1        
	//   53   77:iadd            
	//   54   78:putfield        #66  <Field int _currBlockPtr>
			abyte0[j] = (byte)i;
	//   55   81:aload_3         
	//   56   82:iload_2         
	//   57   83:iload_1         
	//   58   84:int2byte        
	//   59   85:bastore         
			return;
	//   60   86:return          
		} else
		{
			append(i >> 16);
	//   61   87:aload_0         
	//   62   88:iload_1         
	//   63   89:bipush          16
	//   64   91:ishr            
	//   65   92:invokevirtual   #72  <Method void append(int)>
			append(i >> 8);
	//   66   95:aload_0         
	//   67   96:iload_1         
	//   68   97:bipush          8
	//   69   99:ishr            
	//   70  100:invokevirtual   #72  <Method void append(int)>
			append(i);
	//   71  103:aload_0         
	//   72  104:iload_1         
	//   73  105:invokevirtual   #72  <Method void append(int)>
			return;
	//   74  108:return          
		}
	}

	public void appendTwoBytes(int i)
	{
		if(_currBlockPtr + 1 < _currBlock.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field int _currBlockPtr>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #45  <Field byte[] _currBlock>
	//*   6   10:arraylength     
	//*   7   11:icmpge          62
		{
			byte abyte0[] = _currBlock;
	//    8   14:aload_0         
	//    9   15:getfield        #45  <Field byte[] _currBlock>
	//   10   18:astore_3        
			int j = _currBlockPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #66  <Field int _currBlockPtr>
	//   13   23:istore_2        
			_currBlockPtr = j + 1;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:putfield        #66  <Field int _currBlockPtr>
			abyte0[j] = (byte)(i >> 8);
	//   19   31:aload_3         
	//   20   32:iload_2         
	//   21   33:iload_1         
	//   22   34:bipush          8
	//   23   36:ishr            
	//   24   37:int2byte        
	//   25   38:bastore         
			abyte0 = _currBlock;
	//   26   39:aload_0         
	//   27   40:getfield        #45  <Field byte[] _currBlock>
	//   28   43:astore_3        
			j = _currBlockPtr;
	//   29   44:aload_0         
	//   30   45:getfield        #66  <Field int _currBlockPtr>
	//   31   48:istore_2        
			_currBlockPtr = j + 1;
	//   32   49:aload_0         
	//   33   50:iload_2         
	//   34   51:iconst_1        
	//   35   52:iadd            
	//   36   53:putfield        #66  <Field int _currBlockPtr>
			abyte0[j] = (byte)i;
	//   37   56:aload_3         
	//   38   57:iload_2         
	//   39   58:iload_1         
	//   40   59:int2byte        
	//   41   60:bastore         
			return;
	//   42   61:return          
		} else
		{
			append(i >> 8);
	//   43   62:aload_0         
	//   44   63:iload_1         
	//   45   64:bipush          8
	//   46   66:ishr            
	//   47   67:invokevirtual   #72  <Method void append(int)>
			append(i);
	//   48   70:aload_0         
	//   49   71:iload_1         
	//   50   72:invokevirtual   #72  <Method void append(int)>
			return;
	//   51   75:return          
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
	//    2    2:putfield        #66  <Field int _currBlockPtr>
		return toByteArray();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #79  <Method byte[] toByteArray()>
	//    5    9:areturn         
	}

	public byte[] finishCurrentSegment()
	{
		_allocMore();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void _allocMore()>
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
	//    1    1:getfield        #66  <Field int _currBlockPtr>
	//    2    4:ireturn         
	}

	public void release()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method void reset()>
		if(_bufferRecycler != null && _currBlock != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #43  <Field BufferRecycler _bufferRecycler>
	//*   4    8:ifnull          35
	//*   5   11:aload_0         
	//*   6   12:getfield        #45  <Field byte[] _currBlock>
	//*   7   15:ifnull          35
		{
			_bufferRecycler.releaseByteBuffer(2, _currBlock);
	//    8   18:aload_0         
	//    9   19:getfield        #43  <Field BufferRecycler _bufferRecycler>
	//   10   22:iconst_2        
	//   11   23:aload_0         
	//   12   24:getfield        #45  <Field byte[] _currBlock>
	//   13   27:invokevirtual   #92  <Method void BufferRecycler.releaseByteBuffer(int, byte[])>
			_currBlock = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #45  <Field byte[] _currBlock>
		}
	//   17   35:return          
	}

	public void reset()
	{
		_pastLen = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #54  <Field int _pastLen>
		_currBlockPtr = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #66  <Field int _currBlockPtr>
		if(!_pastBlocks.isEmpty())
	//*   6   10:aload_0         
	//*   7   11:getfield        #41  <Field LinkedList _pastBlocks>
	//*   8   14:invokevirtual   #96  <Method boolean LinkedList.isEmpty()>
	//*   9   17:ifne            27
			_pastBlocks.clear();
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field LinkedList _pastBlocks>
	//   12   24:invokevirtual   #99  <Method void LinkedList.clear()>
	//   13   27:return          
	}

	public byte[] resetAndGetFirstSegment()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #88  <Method void reset()>
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
	//    2    2:putfield        #66  <Field int _currBlockPtr>
	//    3    5:return          
	}

	public byte[] toByteArray()
	{
		int j = _pastLen + _currBlockPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int _pastLen>
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field int _currBlockPtr>
	//    4    8:iadd            
	//    5    9:istore_2        
		Object obj;
		if(j == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            22
		{
			obj = ((Object) (NO_BYTES));
	//    8   14:getstatic       #25  <Field byte[] NO_BYTES>
	//    9   17:astore          4
		} else
	//*  10   19:aload           4
	//*  11   21:areturn         
		{
			byte abyte0[] = new byte[j];
	//   12   22:iload_2         
	//   13   23:newarray        byte[]
	//   14   25:astore          5
			int i = 0;
	//   15   27:iconst_0        
	//   16   28:istore_1        
			for(obj = ((Object) (_pastBlocks.iterator())); ((Iterator) (obj)).hasNext();)
	//*  17   29:aload_0         
	//*  18   30:getfield        #41  <Field LinkedList _pastBlocks>
	//*  19   33:invokevirtual   #105 <Method Iterator LinkedList.iterator()>
	//*  20   36:astore          4
	//*  21   38:aload           4
	//*  22   40:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  23   45:ifeq            81
			{
				byte abyte1[] = (byte[])((Iterator) (obj)).next();
	//   24   48:aload           4
	//   25   50:invokeinterface #114 <Method Object Iterator.next()>
	//   26   55:checkcast       #115 <Class byte[]>
	//   27   58:astore          6
				int k = abyte1.length;
	//   28   60:aload           6
	//   29   62:arraylength     
	//   30   63:istore_3        
				System.arraycopy(((Object) (abyte1)), 0, ((Object) (abyte0)), i, k);
	//   31   64:aload           6
	//   32   66:iconst_0        
	//   33   67:aload           5
	//   34   69:iload_1         
	//   35   70:iload_3         
	//   36   71:invokestatic    #121 <Method void System.arraycopy(Object, int, Object, int, int)>
				i += k;
	//   37   74:iload_1         
	//   38   75:iload_3         
	//   39   76:iadd            
	//   40   77:istore_1        
			}

	//*  41   78:goto            38
			System.arraycopy(((Object) (_currBlock)), 0, ((Object) (abyte0)), i, _currBlockPtr);
	//   42   81:aload_0         
	//   43   82:getfield        #45  <Field byte[] _currBlock>
	//   44   85:iconst_0        
	//   45   86:aload           5
	//   46   88:iload_1         
	//   47   89:aload_0         
	//   48   90:getfield        #66  <Field int _currBlockPtr>
	//   49   93:invokestatic    #121 <Method void System.arraycopy(Object, int, Object, int, int)>
			i += _currBlockPtr;
	//   50   96:iload_1         
	//   51   97:aload_0         
	//   52   98:getfield        #66  <Field int _currBlockPtr>
	//   53  101:iadd            
	//   54  102:istore_1        
			if(i != j)
	//*  55  103:iload_1         
	//*  56  104:iload_2         
	//*  57  105:icmpeq          149
				throw new RuntimeException((new StringBuilder()).append("Internal error: total len assumed to be ").append(j).append(", copied ").append(i).append(" bytes").toString());
	//   58  108:new             #123 <Class RuntimeException>
	//   59  111:dup             
	//   60  112:new             #125 <Class StringBuilder>
	//   61  115:dup             
	//   62  116:invokespecial   #126 <Method void StringBuilder()>
	//   63  119:ldc1            #128 <String "Internal error: total len assumed to be ">
	//   64  121:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   65  124:iload_2         
	//   66  125:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   67  128:ldc1            #136 <String ", copied ">
	//   68  130:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   69  133:iload_1         
	//   70  134:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//   71  137:ldc1            #138 <String " bytes">
	//   72  139:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//   73  142:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   74  145:invokespecial   #145 <Method void RuntimeException(String)>
	//   75  148:athrow          
			obj = ((Object) (abyte0));
	//   76  149:aload           5
	//   77  151:astore          4
			if(!_pastBlocks.isEmpty())
	//*  78  153:aload_0         
	//*  79  154:getfield        #41  <Field LinkedList _pastBlocks>
	//*  80  157:invokevirtual   #96  <Method boolean LinkedList.isEmpty()>
	//*  81  160:ifne            19
			{
				reset();
	//   82  163:aload_0         
	//   83  164:invokevirtual   #88  <Method void reset()>
				return abyte0;
	//   84  167:aload           5
	//   85  169:areturn         
			}
		}
		return ((byte []) (obj));
	}

	public void write(int i)
	{
		append(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #72  <Method void append(int)>
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
	//    6    9:getfield        #66  <Field int _currBlockPtr>
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
	//   22   38:getfield        #66  <Field int _currBlockPtr>
	//   23   41:iload           6
	//   24   43:invokestatic    #121 <Method void System.arraycopy(Object, int, Object, int, int)>
				l = k + i1;
	//   25   46:iload           4
	//   26   48:iload           6
	//   27   50:iadd            
	//   28   51:istore          5
				_currBlockPtr = _currBlockPtr + i1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #66  <Field int _currBlockPtr>
	//   32   58:iload           6
	//   33   60:iadd            
	//   34   61:putfield        #66  <Field int _currBlockPtr>
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
	//   43   75:invokespecial   #69  <Method void _allocMore()>
			k = l;
	//   44   78:iload           5
	//   45   80:istore          4
			j = i;
	//   46   82:iload_2         
	//   47   83:istore_3        
		} while(true);
	//   48   84:goto            3
	}

	static final int DEFAULT_BLOCK_ARRAY_SIZE = 40;
	private static final int INITIAL_BLOCK_SIZE = 500;
	private static final int MAX_BLOCK_SIZE = 0x40000;
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
	//    2    3:putstatic       #25  <Field byte[] NO_BYTES>
	//*   3    6:return          
	}
}
