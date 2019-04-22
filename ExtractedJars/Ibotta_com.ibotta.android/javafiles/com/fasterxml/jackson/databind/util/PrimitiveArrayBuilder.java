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
			if(_next == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field PrimitiveArrayBuilder$Node _next>
		//*   2    4:ifnonnull       13
			{
				_next = node;
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:putfield        #44  <Field PrimitiveArrayBuilder$Node _next>
				return;
		//    6   12:return          
			} else
			{
				throw new IllegalStateException();
		//    7   13:new             #46  <Class IllegalStateException>
		//    8   16:dup             
		//    9   17:invokespecial   #47  <Method void IllegalStateException()>
		//   10   20:athrow          
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
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	protected abstract Object _constructArray(int i);

	protected void _reset()
	{
		Node node = _bufferTail;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field PrimitiveArrayBuilder$Node _bufferTail>
	//    2    4:astore_1        
		if(node != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			_freeBuffer = node.getData();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method Object PrimitiveArrayBuilder$Node.getData()>
	//    8   14:putfield        #33  <Field Object _freeBuffer>
		_bufferTail = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #27  <Field PrimitiveArrayBuilder$Node _bufferTail>
		_bufferHead = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #35  <Field PrimitiveArrayBuilder$Node _bufferHead>
		_bufferedEntryCount = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #37  <Field int _bufferedEntryCount>
	//   18   32:return          
	}

	public final Object appendCompletedChunk(Object obj, int i)
	{
		obj = ((Object) (new Node(obj, i)));
	//    0    0:new             #7   <Class PrimitiveArrayBuilder$Node>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokespecial   #42  <Method void PrimitiveArrayBuilder$Node(Object, int)>
	//    5    9:astore_1        
		if(_bufferHead == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #35  <Field PrimitiveArrayBuilder$Node _bufferHead>
	//*   8   14:ifnonnull       30
		{
			_bufferTail = ((Node) (obj));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #27  <Field PrimitiveArrayBuilder$Node _bufferTail>
			_bufferHead = ((Node) (obj));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:putfield        #35  <Field PrimitiveArrayBuilder$Node _bufferHead>
		} else
	//*  15   27:goto            43
		{
			_bufferTail.linkNext(((Node) (obj)));
	//   16   30:aload_0         
	//   17   31:getfield        #27  <Field PrimitiveArrayBuilder$Node _bufferTail>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #46  <Method void PrimitiveArrayBuilder$Node.linkNext(PrimitiveArrayBuilder$Node)>
			_bufferTail = ((Node) (obj));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:putfield        #27  <Field PrimitiveArrayBuilder$Node _bufferTail>
		}
		_bufferedEntryCount = _bufferedEntryCount + i;
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #37  <Field int _bufferedEntryCount>
	//   26   48:iload_2         
	//   27   49:iadd            
	//   28   50:putfield        #37  <Field int _bufferedEntryCount>
		if(i < 16384)
	//*  29   53:iload_2         
	//*  30   54:sipush          16384
	//*  31   57:icmpge          67
			i += i;
	//   32   60:iload_2         
	//   33   61:iload_2         
	//   34   62:iadd            
	//   35   63:istore_2        
		else
	//*  36   64:goto            73
			i += i >> 2;
	//   37   67:iload_2         
	//   38   68:iload_2         
	//   39   69:iconst_2        
	//   40   70:ishr            
	//   41   71:iadd            
	//   42   72:istore_2        
		return _constructArray(i);
	//   43   73:aload_0         
	//   44   74:iload_2         
	//   45   75:invokevirtual   #48  <Method Object _constructArray(int)>
	//   46   78:areturn         
	}

	public int bufferedSize()
	{
		return _bufferedEntryCount;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int _bufferedEntryCount>
	//    2    4:ireturn         
	}

	public Object completeAndClearBuffer(Object obj, int i)
	{
		int k = _bufferedEntryCount + i;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int _bufferedEntryCount>
	//    2    4:iload_2         
	//    3    5:iadd            
	//    4    6:istore          4
		Object obj1 = _constructArray(k);
	//    5    8:aload_0         
	//    6    9:iload           4
	//    7   11:invokevirtual   #48  <Method Object _constructArray(int)>
	//    8   14:astore          6
		Node node = _bufferHead;
	//    9   16:aload_0         
	//   10   17:getfield        #35  <Field PrimitiveArrayBuilder$Node _bufferHead>
	//   11   20:astore          5
		int j = 0;
	//   12   22:iconst_0        
	//   13   23:istore_3        
		for(; node != null; node = node.next())
	//*  14   24:aload           5
	//*  15   26:ifnull          48
			j = node.copyData(obj1, j);
	//   16   29:aload           5
	//   17   31:aload           6
	//   18   33:iload_3         
	//   19   34:invokevirtual   #57  <Method int PrimitiveArrayBuilder$Node.copyData(Object, int)>
	//   20   37:istore_3        

	//   21   38:aload           5
	//   22   40:invokevirtual   #61  <Method PrimitiveArrayBuilder$Node PrimitiveArrayBuilder$Node.next()>
	//   23   43:astore          5
	//*  24   45:goto            24
		System.arraycopy(obj, 0, obj1, j, i);
	//   25   48:aload_1         
	//   26   49:iconst_0        
	//   27   50:aload           6
	//   28   52:iload_3         
	//   29   53:iload_2         
	//   30   54:invokestatic    #67  <Method void System.arraycopy(Object, int, Object, int, int)>
		i = j + i;
	//   31   57:iload_3         
	//   32   58:iload_2         
	//   33   59:iadd            
	//   34   60:istore_2        
		if(i == k)
	//*  35   61:iload_2         
	//*  36   62:iload           4
	//*  37   64:icmpne          70
		{
			return obj1;
	//   38   67:aload           6
	//   39   69:areturn         
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//   40   70:new             #69  <Class StringBuilder>
	//   41   73:dup             
	//   42   74:invokespecial   #70  <Method void StringBuilder()>
	//   43   77:astore_1        
			((StringBuilder) (obj)).append("Should have gotten ");
	//   44   78:aload_1         
	//   45   79:ldc1            #72  <String "Should have gotten ">
	//   46   81:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   47   84:pop             
			((StringBuilder) (obj)).append(k);
	//   48   85:aload_1         
	//   49   86:iload           4
	//   50   88:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   51   91:pop             
			((StringBuilder) (obj)).append(" entries, got ");
	//   52   92:aload_1         
	//   53   93:ldc1            #81  <String " entries, got ">
	//   54   95:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   55   98:pop             
			((StringBuilder) (obj)).append(i);
	//   56   99:aload_1         
	//   57  100:iload_2         
	//   58  101:invokevirtual   #79  <Method StringBuilder StringBuilder.append(int)>
	//   59  104:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   60  105:new             #83  <Class IllegalStateException>
	//   61  108:dup             
	//   62  109:aload_1         
	//   63  110:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   64  113:invokespecial   #90  <Method void IllegalStateException(String)>
	//   65  116:athrow          
		}
	}

	public Object resetAndStart()
	{
		_reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #93  <Method void _reset()>
		Object obj1 = _freeBuffer;
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field Object _freeBuffer>
	//    4    8:astore_2        
		Object obj = obj1;
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(obj1 == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       22
			obj = _constructArray(12);
	//    9   15:aload_0         
	//   10   16:bipush          12
	//   11   18:invokevirtual   #48  <Method Object _constructArray(int)>
	//   12   21:astore_1        
		return obj;
	//   13   22:aload_1         
	//   14   23:areturn         
	}

	protected Node _bufferHead;
	protected Node _bufferTail;
	protected int _bufferedEntryCount;
	protected Object _freeBuffer;
}
