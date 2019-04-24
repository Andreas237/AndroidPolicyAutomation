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
	//   18   33:invokevirtual   #49  <Method byte[] BufferRecycler.allocByteBuffer(int)>
	//   19   36:astore_1        
		_currBlock = ((byte []) (bufferrecycler));
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:putfield        #51  <Field byte[] _currBlock>
	//   23   42:return          
	}

	private void _allocMore()
	{
		int i = _pastLen + _currBlock.length;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int _pastLen>
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field byte[] _currBlock>
	//    4    8:arraylength     
	//    5    9:iadd            
	//    6   10:istore_1        
		if(i < 0)
	//*   7   11:iload_1         
	//*   8   12:ifge            25
			throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
	//    9   15:new             #56  <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:ldc1            #58  <String "Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`">
	//   12   21:invokespecial   #61  <Method void IllegalStateException(String)>
	//   13   24:athrow          
		_pastLen = i;
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:putfield        #54  <Field int _pastLen>
		int j = Math.max(_pastLen >> 1, 1000);
	//   17   30:aload_0         
	//   18   31:getfield        #54  <Field int _pastLen>
	//   19   34:iconst_1        
	//   20   35:ishr            
	//   21   36:sipush          1000
	//   22   39:invokestatic    #67  <Method int Math.max(int, int)>
	//   23   42:istore_2        
		i = j;
	//   24   43:iload_2         
	//   25   44:istore_1        
		if(j > 0x40000)
	//*  26   45:iload_2         
	//*  27   46:ldc1            #11  <Int 0x40000>
	//*  28   48:icmple          54
			i = 0x40000;
	//   29   51:ldc1            #11  <Int 0x40000>
	//   30   53:istore_1        
		_pastBlocks.add(((Object) (_currBlock)));
	//   31   54:aload_0         
	//   32   55:getfield        #41  <Field LinkedList _pastBlocks>
	//   33   58:aload_0         
	//   34   59:getfield        #51  <Field byte[] _currBlock>
	//   35   62:invokevirtual   #71  <Method boolean LinkedList.add(Object)>
	//   36   65:pop             
		_currBlock = new byte[i];
	//   37   66:aload_0         
	//   38   67:iload_1         
	//   39   68:newarray        byte[]
	//   40   70:putfield        #51  <Field byte[] _currBlock>
		_currBlockPtr = 0;
	//   41   73:aload_0         
	//   42   74:iconst_0        
	//   43   75:putfield        #73  <Field int _currBlockPtr>
	//   44   78:return          
	}

	public void append(int i)
	{
		if(_currBlockPtr >= _currBlock.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int _currBlockPtr>
	//*   2    4:aload_0         
	//*   3    5:getfield        #51  <Field byte[] _currBlock>
	//*   4    8:arraylength     
	//*   5    9:icmplt          16
			_allocMore();
	//    6   12:aload_0         
	//    7   13:invokespecial   #76  <Method void _allocMore()>
		byte abyte0[] = _currBlock;
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field byte[] _currBlock>
	//   10   20:astore_3        
		int j = _currBlockPtr;
	//   11   21:aload_0         
	//   12   22:getfield        #73  <Field int _currBlockPtr>
	//   13   25:istore_2        
		_currBlockPtr = j + 1;
	//   14   26:aload_0         
	//   15   27:iload_2         
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:putfield        #73  <Field int _currBlockPtr>
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
	//*   1    1:getfield        #73  <Field int _currBlockPtr>
	//*   2    4:iconst_2        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #51  <Field byte[] _currBlock>
	//*   6   10:arraylength     
	//*   7   11:icmpge          87
		{
			byte abyte0[] = _currBlock;
	//    8   14:aload_0         
	//    9   15:getfield        #51  <Field byte[] _currBlock>
	//   10   18:astore_3        
			int j = _currBlockPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #73  <Field int _currBlockPtr>
	//   13   23:istore_2        
			_currBlockPtr = j + 1;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:putfield        #73  <Field int _currBlockPtr>
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
	//   27   40:getfield        #51  <Field byte[] _currBlock>
	//   28   43:astore_3        
			j = _currBlockPtr;
	//   29   44:aload_0         
	//   30   45:getfield        #73  <Field int _currBlockPtr>
	//   31   48:istore_2        
			_currBlockPtr = j + 1;
	//   32   49:aload_0         
	//   33   50:iload_2         
	//   34   51:iconst_1        
	//   35   52:iadd            
	//   36   53:putfield        #73  <Field int _currBlockPtr>
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
	//   45   65:getfield        #51  <Field byte[] _currBlock>
	//   46   68:astore_3        
			j = _currBlockPtr;
	//   47   69:aload_0         
	//   48   70:getfield        #73  <Field int _currBlockPtr>
	//   49   73:istore_2        
			_currBlockPtr = j + 1;
	//   50   74:aload_0         
	//   51   75:iload_2         
	//   52   76:iconst_1        
	//   53   77:iadd            
	//   54   78:putfield        #73  <Field int _currBlockPtr>
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
	//   65   92:invokevirtual   #79  <Method void append(int)>
			append(i >> 8);
	//   66   95:aload_0         
	//   67   96:iload_1         
	//   68   97:bipush          8
	//   69   99:ishr            
	//   70  100:invokevirtual   #79  <Method void append(int)>
			append(i);
	//   71  103:aload_0         
	//   72  104:iload_1         
	//   73  105:invokevirtual   #79  <Method void append(int)>
			return;
	//   74  108:return          
		}
	}

	public void appendTwoBytes(int i)
	{
		if(_currBlockPtr + 1 < _currBlock.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int _currBlockPtr>
	//*   2    4:iconst_1        
	//*   3    5:iadd            
	//*   4    6:aload_0         
	//*   5    7:getfield        #51  <Field byte[] _currBlock>
	//*   6   10:arraylength     
	//*   7   11:icmpge          62
		{
			byte abyte0[] = _currBlock;
	//    8   14:aload_0         
	//    9   15:getfield        #51  <Field byte[] _currBlock>
	//   10   18:astore_3        
			int j = _currBlockPtr;
	//   11   19:aload_0         
	//   12   20:getfield        #73  <Field int _currBlockPtr>
	//   13   23:istore_2        
			_currBlockPtr = j + 1;
	//   14   24:aload_0         
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:putfield        #73  <Field int _currBlockPtr>
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
	//   27   40:getfield        #51  <Field byte[] _currBlock>
	//   28   43:astore_3        
			j = _currBlockPtr;
	//   29   44:aload_0         
	//   30   45:getfield        #73  <Field int _currBlockPtr>
	//   31   48:istore_2        
			_currBlockPtr = j + 1;
	//   32   49:aload_0         
	//   33   50:iload_2         
	//   34   51:iconst_1        
	//   35   52:iadd            
	//   36   53:putfield        #73  <Field int _currBlockPtr>
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
	//   47   67:invokevirtual   #79  <Method void append(int)>
			append(i);
	//   48   70:aload_0         
	//   49   71:iload_1         
	//   50   72:invokevirtual   #79  <Method void append(int)>
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
	//    2    2:putfield        #73  <Field int _currBlockPtr>
		return toByteArray();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #86  <Method byte[] toByteArray()>
	//    5    9:areturn         
	}

	public byte[] finishCurrentSegment()
	{
		_allocMore();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void _allocMore()>
		return _currBlock;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field byte[] _currBlock>
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
	//    1    1:getfield        #51  <Field byte[] _currBlock>
	//    2    4:areturn         
	}

	public int getCurrentSegmentLength()
	{
		return _currBlockPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field int _currBlockPtr>
	//    2    4:ireturn         
	}

	public void release()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method void reset()>
		if(_bufferRecycler != null && _currBlock != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #43  <Field BufferRecycler _bufferRecycler>
	//*   4    8:ifnull          35
	//*   5   11:aload_0         
	//*   6   12:getfield        #51  <Field byte[] _currBlock>
	//*   7   15:ifnull          35
		{
			_bufferRecycler.releaseByteBuffer(2, _currBlock);
	//    8   18:aload_0         
	//    9   19:getfield        #43  <Field BufferRecycler _bufferRecycler>
	//   10   22:iconst_2        
	//   11   23:aload_0         
	//   12   24:getfield        #51  <Field byte[] _currBlock>
	//   13   27:invokevirtual   #99  <Method void BufferRecycler.releaseByteBuffer(int, byte[])>
			_currBlock = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #51  <Field byte[] _currBlock>
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
	//    5    7:putfield        #73  <Field int _currBlockPtr>
		if(!_pastBlocks.isEmpty())
	//*   6   10:aload_0         
	//*   7   11:getfield        #41  <Field LinkedList _pastBlocks>
	//*   8   14:invokevirtual   #103 <Method boolean LinkedList.isEmpty()>
	//*   9   17:ifne            27
			_pastBlocks.clear();
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field LinkedList _pastBlocks>
	//   12   24:invokevirtual   #106 <Method void LinkedList.clear()>
	//   13   27:return          
	}

	public byte[] resetAndGetFirstSegment()
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #95  <Method void reset()>
		return _currBlock;
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field byte[] _currBlock>
	//    4    8:areturn         
	}

	public void setCurrentSegmentLength(int i)
	{
		_currBlockPtr = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field int _currBlockPtr>
	//    3    5:return          
	}

	public byte[] toByteArray()
	{
		int j = _pastLen + _currBlockPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field int _pastLen>
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field int _currBlockPtr>
	//    4    8:iadd            
	//    5    9:istore_2        
		if(j == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            18
			return NO_BYTES;
	//    8   14:getstatic       #25  <Field byte[] NO_BYTES>
	//    9   17:areturn         
		byte abyte0[] = new byte[j];
	//   10   18:iload_2         
	//   11   19:newarray        byte[]
	//   12   21:astore          4
		Iterator iterator = _pastBlocks.iterator();
	//   13   23:aload_0         
	//   14   24:getfield        #41  <Field LinkedList _pastBlocks>
	//   15   27:invokevirtual   #112 <Method Iterator LinkedList.iterator()>
	//   16   30:astore          5
		int i;
		int k;
		for(i = 0; iterator.hasNext(); i += k)
	//*  17   32:iconst_0        
	//*  18   33:istore_1        
	//*  19   34:aload           5
	//*  20   36:invokeinterface #117 <Method boolean Iterator.hasNext()>
	//*  21   41:ifeq            77
		{
			byte abyte1[] = (byte[])iterator.next();
	//   22   44:aload           5
	//   23   46:invokeinterface #121 <Method Object Iterator.next()>
	//   24   51:checkcast       #122 <Class byte[]>
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
	//   34   67:invokestatic    #128 <Method void System.arraycopy(Object, int, Object, int, int)>
		}

	//   35   70:iload_1         
	//   36   71:iload_3         
	//   37   72:iadd            
	//   38   73:istore_1        
	//*  39   74:goto            34
		System.arraycopy(((Object) (_currBlock)), 0, ((Object) (abyte0)), i, _currBlockPtr);
	//   40   77:aload_0         
	//   41   78:getfield        #51  <Field byte[] _currBlock>
	//   42   81:iconst_0        
	//   43   82:aload           4
	//   44   84:iload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #73  <Field int _currBlockPtr>
	//   47   89:invokestatic    #128 <Method void System.arraycopy(Object, int, Object, int, int)>
		i += _currBlockPtr;
	//   48   92:iload_1         
	//   49   93:aload_0         
	//   50   94:getfield        #73  <Field int _currBlockPtr>
	//   51   97:iadd            
	//   52   98:istore_1        
		if(i != j)
	//*  53   99:iload_1         
	//*  54  100:iload_2         
	//*  55  101:icmpeq          164
		{
			abyte0 = ((byte []) (new StringBuilder()));
	//   56  104:new             #130 <Class StringBuilder>
	//   57  107:dup             
	//   58  108:invokespecial   #131 <Method void StringBuilder()>
	//   59  111:astore          4
			((StringBuilder) (abyte0)).append("Internal error: total len assumed to be ");
	//   60  113:aload           4
	//   61  115:ldc1            #133 <String "Internal error: total len assumed to be ">
	//   62  117:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   63  120:pop             
			((StringBuilder) (abyte0)).append(j);
	//   64  121:aload           4
	//   65  123:iload_2         
	//   66  124:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   67  127:pop             
			((StringBuilder) (abyte0)).append(", copied ");
	//   68  128:aload           4
	//   69  130:ldc1            #141 <String ", copied ">
	//   70  132:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   71  135:pop             
			((StringBuilder) (abyte0)).append(i);
	//   72  136:aload           4
	//   73  138:iload_1         
	//   74  139:invokevirtual   #139 <Method StringBuilder StringBuilder.append(int)>
	//   75  142:pop             
			((StringBuilder) (abyte0)).append(" bytes");
	//   76  143:aload           4
	//   77  145:ldc1            #143 <String " bytes">
	//   78  147:invokevirtual   #136 <Method StringBuilder StringBuilder.append(String)>
	//   79  150:pop             
			throw new RuntimeException(((StringBuilder) (abyte0)).toString());
	//   80  151:new             #145 <Class RuntimeException>
	//   81  154:dup             
	//   82  155:aload           4
	//   83  157:invokevirtual   #149 <Method String StringBuilder.toString()>
	//   84  160:invokespecial   #150 <Method void RuntimeException(String)>
	//   85  163:athrow          
		}
		if(!_pastBlocks.isEmpty())
	//*  86  164:aload_0         
	//*  87  165:getfield        #41  <Field LinkedList _pastBlocks>
	//*  88  168:invokevirtual   #103 <Method boolean LinkedList.isEmpty()>
	//*  89  171:ifne            178
			reset();
	//   90  174:aload_0         
	//   91  175:invokevirtual   #95  <Method void reset()>
		return abyte0;
	//   92  178:aload           4
	//   93  180:areturn         
	}

	public void write(int i)
	{
		append(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #79  <Method void append(int)>
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
	//    5    5:invokevirtual   #155 <Method void write(byte[], int, int)>
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
	//    3    4:getfield        #51  <Field byte[] _currBlock>
	//    4    7:arraylength     
	//    5    8:aload_0         
	//    6    9:getfield        #73  <Field int _currBlockPtr>
	//    7   12:isub            
	//    8   13:iload_3         
	//    9   14:invokestatic    #158 <Method int Math.min(int, int)>
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
	//   20   34:getfield        #51  <Field byte[] _currBlock>
	//   21   37:aload_0         
	//   22   38:getfield        #73  <Field int _currBlockPtr>
	//   23   41:iload           6
	//   24   43:invokestatic    #128 <Method void System.arraycopy(Object, int, Object, int, int)>
				l = k + i1;
	//   25   46:iload           4
	//   26   48:iload           6
	//   27   50:iadd            
	//   28   51:istore          5
				_currBlockPtr = _currBlockPtr + i1;
	//   29   53:aload_0         
	//   30   54:aload_0         
	//   31   55:getfield        #73  <Field int _currBlockPtr>
	//   32   58:iload           6
	//   33   60:iadd            
	//   34   61:putfield        #73  <Field int _currBlockPtr>
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
	//   43   75:invokespecial   #76  <Method void _allocMore()>
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
