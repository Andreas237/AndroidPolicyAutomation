// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


public abstract class PrimitiveArrayBuilder
{
	static final class Node
	{

		public int copyData(Object obj, int i)
		{
			System.arraycopy(_data, 0, obj, i, _dataLength);
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Object _data>
		//    2    4:iconst_0        
		//    3    5:aload_1         
		//    4    6:iload_2         
		//    5    7:aload_0         
		//    6    8:getfield        #25  <Field int _dataLength>
		//    7   11:invokestatic    #36  <Method void System.arraycopy(Object, int, Object, int, int)>
			return i + _dataLength;
		//    8   14:iload_2         
		//    9   15:aload_0         
		//   10   16:getfield        #25  <Field int _dataLength>
		//   11   19:iadd            
		//   12   20:ireturn         
		}

		public Object getData()
		{
			return _data;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Object _data>
		//    2    4:areturn         
		}

		public void linkNext(Node node)
		{
			if(_next != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field PrimitiveArrayBuilder$Node _next>
		//*   2    4:ifnull          15
			{
				throw new IllegalStateException();
		//    3    7:new             #46  <Class IllegalStateException>
		//    4   10:dup             
		//    5   11:invokespecial   #47  <Method void IllegalStateException()>
		//    6   14:athrow          
			} else
			{
				_next = node;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #44  <Field PrimitiveArrayBuilder$Node _next>
				return;
		//   10   20:return          
			}
		}

		public Node next()
		{
			return _next;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field PrimitiveArrayBuilder$Node _next>
		//    2    4:areturn         
		}

		final Object _data;
		final int _dataLength;
		Node _next;

		public Node(Object obj, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
			_data = obj;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #23  <Field Object _data>
			_dataLength = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #25  <Field int _dataLength>
		//    8   14:return          
		}
	}


	protected PrimitiveArrayBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	protected abstract Object _constructArray(int i);

	protected void _reset()
	{
		if(_bufferTail != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field PrimitiveArrayBuilder$Node _bufferTail>
	//*   2    4:ifnull          18
			_freeBuffer = _bufferTail.getData();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field PrimitiveArrayBuilder$Node _bufferTail>
	//    6   12:invokevirtual   #37  <Method Object PrimitiveArrayBuilder$Node.getData()>
	//    7   15:putfield        #39  <Field Object _freeBuffer>
		_bufferTail = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #33  <Field PrimitiveArrayBuilder$Node _bufferTail>
		_bufferHead = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #41  <Field PrimitiveArrayBuilder$Node _bufferHead>
		_bufferedEntryCount = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #43  <Field int _bufferedEntryCount>
	//   17   33:return          
	}

	public final Object appendCompletedChunk(Object obj, int i)
	{
		obj = ((Object) (new Node(obj, i)));
	//    0    0:new             #7   <Class PrimitiveArrayBuilder$Node>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #48  <Method void PrimitiveArrayBuilder$Node(Object, int)>
	//    5    9:astore_1        
		if(_bufferHead == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #41  <Field PrimitiveArrayBuilder$Node _bufferHead>
	//*   8   14:ifnonnull       54
		{
			_bufferTail = ((Node) (obj));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #33  <Field PrimitiveArrayBuilder$Node _bufferTail>
			_bufferHead = ((Node) (obj));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #41  <Field PrimitiveArrayBuilder$Node _bufferHead>
		} else
	//*  15   27:aload_0         
	//*  16   28:aload_0         
	//*  17   29:getfield        #43  <Field int _bufferedEntryCount>
	//*  18   32:iload_2         
	//*  19   33:iadd            
	//*  20   34:putfield        #43  <Field int _bufferedEntryCount>
	//*  21   37:iload_2         
	//*  22   38:sipush          16384
	//*  23   41:icmpge          70
	//*  24   44:iload_2         
	//*  25   45:iload_2         
	//*  26   46:iadd            
	//*  27   47:istore_2        
	//*  28   48:aload_0         
	//*  29   49:iload_2         
	//*  30   50:invokevirtual   #50  <Method Object _constructArray(int)>
	//*  31   53:areturn         
		{
			_bufferTail.linkNext(((Node) (obj)));
	//   32   54:aload_0         
	//   33   55:getfield        #33  <Field PrimitiveArrayBuilder$Node _bufferTail>
	//   34   58:aload_1         
	//   35   59:invokevirtual   #54  <Method void PrimitiveArrayBuilder$Node.linkNext(PrimitiveArrayBuilder$Node)>
			_bufferTail = ((Node) (obj));
	//   36   62:aload_0         
	//   37   63:aload_1         
	//   38   64:putfield        #33  <Field PrimitiveArrayBuilder$Node _bufferTail>
		}
		_bufferedEntryCount = _bufferedEntryCount + i;
		if(i < 16384)
			i += i;
		else
	//*  39   67:goto            27
			i += i >> 2;
	//   40   70:iload_2         
	//   41   71:iload_2         
	//   42   72:iconst_2        
	//   43   73:ishr            
	//   44   74:iadd            
	//   45   75:istore_2        
		return _constructArray(i);
	//*  46   76:goto            48
	}

	public int bufferedSize()
	{
		return _bufferedEntryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int _bufferedEntryCount>
	//    2    4:ireturn         
	}

	public Object completeAndClearBuffer(Object obj, int i)
	{
		int k = i + _bufferedEntryCount;
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field int _bufferedEntryCount>
	//    3    5:iadd            
	//    4    6:istore          4
		Object obj1 = _constructArray(k);
	//    5    8:aload_0         
	//    6    9:iload           4
	//    7   11:invokevirtual   #50  <Method Object _constructArray(int)>
	//    8   14:astore          6
		int j = 0;
	//    9   16:iconst_0        
	//   10   17:istore_3        
		for(Node node = _bufferHead; node != null; node = node.next())
	//*  11   18:aload_0         
	//*  12   19:getfield        #41  <Field PrimitiveArrayBuilder$Node _bufferHead>
	//*  13   22:astore          5
	//*  14   24:aload           5
	//*  15   26:ifnull          48
			j = node.copyData(obj1, j);
	//   16   29:aload           5
	//   17   31:aload           6
	//   18   33:iload_3         
	//   19   34:invokevirtual   #63  <Method int PrimitiveArrayBuilder$Node.copyData(Object, int)>
	//   20   37:istore_3        

	//   21   38:aload           5
	//   22   40:invokevirtual   #67  <Method PrimitiveArrayBuilder$Node PrimitiveArrayBuilder$Node.next()>
	//   23   43:astore          5
	//*  24   45:goto            24
		System.arraycopy(obj, 0, obj1, j, i);
	//   25   48:aload_1         
	//   26   49:iconst_0        
	//   27   50:aload           6
	//   28   52:iload_3         
	//   29   53:iload_2         
	//   30   54:invokestatic    #73  <Method void System.arraycopy(Object, int, Object, int, int)>
		i = j + i;
	//   31   57:iload_3         
	//   32   58:iload_2         
	//   33   59:iadd            
	//   34   60:istore_2        
		if(i != k)
	//*  35   61:iload_2         
	//*  36   62:iload           4
	//*  37   64:icmpeq          104
			throw new IllegalStateException((new StringBuilder()).append("Should have gotten ").append(k).append(" entries, got ").append(i).toString());
	//   38   67:new             #75  <Class IllegalStateException>
	//   39   70:dup             
	//   40   71:new             #77  <Class StringBuilder>
	//   41   74:dup             
	//   42   75:invokespecial   #78  <Method void StringBuilder()>
	//   43   78:ldc1            #80  <String "Should have gotten ">
	//   44   80:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   45   83:iload           4
	//   46   85:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   47   88:ldc1            #89  <String " entries, got ">
	//   48   90:invokevirtual   #84  <Method StringBuilder StringBuilder.append(String)>
	//   49   93:iload_2         
	//   50   94:invokevirtual   #87  <Method StringBuilder StringBuilder.append(int)>
	//   51   97:invokevirtual   #93  <Method String StringBuilder.toString()>
	//   52  100:invokespecial   #96  <Method void IllegalStateException(String)>
	//   53  103:athrow          
		else
			return obj1;
	//   54  104:aload           6
	//   55  106:areturn         
	}

	public Object resetAndStart()
	{
		_reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method void _reset()>
		if(_freeBuffer == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #39  <Field Object _freeBuffer>
	//*   4    8:ifnonnull       18
			return _constructArray(12);
	//    5   11:aload_0         
	//    6   12:bipush          12
	//    7   14:invokevirtual   #50  <Method Object _constructArray(int)>
	//    8   17:areturn         
		else
			return _freeBuffer;
	//    9   18:aload_0         
	//   10   19:getfield        #39  <Field Object _freeBuffer>
	//   11   22:areturn         
	}

	static final int INITIAL_CHUNK_SIZE = 12;
	static final int MAX_CHUNK_SIZE = 0x40000;
	static final int SMALL_CHUNK_SIZE = 16384;
	protected Node _bufferHead;
	protected Node _bufferTail;
	protected int _bufferedEntryCount;
	protected Object _freeBuffer;
}
