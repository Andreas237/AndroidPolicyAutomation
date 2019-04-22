// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			LinkedNode

public final class ObjectBuffer
{

	public ObjectBuffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:return          
	}

	protected final void _copyTo(Object obj, int i, Object aobj[], int j)
	{
		LinkedNode linkednode = _head;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field LinkedNode _head>
	//    2    4:astore          7
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		for(; linkednode != null; linkednode = linkednode.next())
	//*   5    9:aload           7
	//*   6   11:ifnull          57
		{
			Object aobj1[] = (Object[])linkednode.value();
	//    7   14:aload           7
	//    8   16:invokevirtual   #27  <Method Object LinkedNode.value()>
	//    9   19:checkcast       #28  <Class Object[]>
	//   10   22:astore          8
			int l = aobj1.length;
	//   11   24:aload           8
	//   12   26:arraylength     
	//   13   27:istore          6
			System.arraycopy(((Object) (aobj1)), 0, obj, k, l);
	//   14   29:aload           8
	//   15   31:iconst_0        
	//   16   32:aload_1         
	//   17   33:iload           5
	//   18   35:iload           6
	//   19   37:invokestatic    #34  <Method void System.arraycopy(Object, int, Object, int, int)>
			k += l;
	//   20   40:iload           5
	//   21   42:iload           6
	//   22   44:iadd            
	//   23   45:istore          5
		}

	//   24   47:aload           7
	//   25   49:invokevirtual   #38  <Method LinkedNode LinkedNode.next()>
	//   26   52:astore          7
	//*  27   54:goto            9
		System.arraycopy(((Object) (aobj)), 0, obj, k, j);
	//   28   57:aload_3         
	//   29   58:iconst_0        
	//   30   59:aload_1         
	//   31   60:iload           5
	//   32   62:iload           4
	//   33   64:invokestatic    #34  <Method void System.arraycopy(Object, int, Object, int, int)>
		j = k + j;
	//   34   67:iload           5
	//   35   69:iload           4
	//   36   71:iadd            
	//   37   72:istore          4
		if(j == i)
	//*  38   74:iload           4
	//*  39   76:iload_2         
	//*  40   77:icmpne          81
		{
			return;
	//   41   80:return          
		} else
		{
			obj = ((Object) (new StringBuilder()));
	//   42   81:new             #40  <Class StringBuilder>
	//   43   84:dup             
	//   44   85:invokespecial   #41  <Method void StringBuilder()>
	//   45   88:astore_1        
			((StringBuilder) (obj)).append("Should have gotten ");
	//   46   89:aload_1         
	//   47   90:ldc1            #43  <String "Should have gotten ">
	//   48   92:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   49   95:pop             
			((StringBuilder) (obj)).append(i);
	//   50   96:aload_1         
	//   51   97:iload_2         
	//   52   98:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   53  101:pop             
			((StringBuilder) (obj)).append(" entries, got ");
	//   54  102:aload_1         
	//   55  103:ldc1            #52  <String " entries, got ">
	//   56  105:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
	//   57  108:pop             
			((StringBuilder) (obj)).append(j);
	//   58  109:aload_1         
	//   59  110:iload           4
	//   60  112:invokevirtual   #50  <Method StringBuilder StringBuilder.append(int)>
	//   61  115:pop             
			throw new IllegalStateException(((StringBuilder) (obj)).toString());
	//   62  116:new             #54  <Class IllegalStateException>
	//   63  119:dup             
	//   64  120:aload_1         
	//   65  121:invokevirtual   #58  <Method String StringBuilder.toString()>
	//   66  124:invokespecial   #61  <Method void IllegalStateException(String)>
	//   67  127:athrow          
		}
	}

	protected void _reset()
	{
		LinkedNode linkednode = _tail;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field LinkedNode _tail>
	//    2    4:astore_1        
		if(linkednode != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			_freeBuffer = (Object[])linkednode.value();
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #27  <Method Object LinkedNode.value()>
	//    8   14:checkcast       #28  <Class Object[]>
	//    9   17:putfield        #66  <Field Object[] _freeBuffer>
		_tail = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #64  <Field LinkedNode _tail>
		_head = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #21  <Field LinkedNode _head>
		_size = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #68  <Field int _size>
	//   19   35:return          
	}

	public Object[] appendCompletedChunk(Object aobj[])
	{
		LinkedNode linkednode = new LinkedNode(((Object) (aobj)), ((LinkedNode) (null)));
	//    0    0:new             #23  <Class LinkedNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #73  <Method void LinkedNode(Object, LinkedNode)>
	//    5    9:astore          4
		if(_head == null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #21  <Field LinkedNode _head>
	//*   8   15:ifnonnull       33
		{
			_tail = linkednode;
	//    9   18:aload_0         
	//   10   19:aload           4
	//   11   21:putfield        #64  <Field LinkedNode _tail>
			_head = linkednode;
	//   12   24:aload_0         
	//   13   25:aload           4
	//   14   27:putfield        #21  <Field LinkedNode _head>
		} else
	//*  15   30:goto            48
		{
			_tail.linkNext(linkednode);
	//   16   33:aload_0         
	//   17   34:getfield        #64  <Field LinkedNode _tail>
	//   18   37:aload           4
	//   19   39:invokevirtual   #77  <Method void LinkedNode.linkNext(LinkedNode)>
			_tail = linkednode;
	//   20   42:aload_0         
	//   21   43:aload           4
	//   22   45:putfield        #64  <Field LinkedNode _tail>
		}
		int j = aobj.length;
	//   23   48:aload_1         
	//   24   49:arraylength     
	//   25   50:istore_3        
		_size = _size + j;
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #68  <Field int _size>
	//   29   56:iload_3         
	//   30   57:iadd            
	//   31   58:putfield        #68  <Field int _size>
		int i;
		if(j < 16384)
	//*  32   61:iload_3         
	//*  33   62:sipush          16384
	//*  34   65:icmpge          75
		{
			i = j + j;
	//   35   68:iload_3         
	//   36   69:iload_3         
	//   37   70:iadd            
	//   38   71:istore_2        
		} else
	//*  39   72:goto            89
		{
			i = j;
	//   40   75:iload_3         
	//   41   76:istore_2        
			if(j < 0x40000)
	//*  42   77:iload_3         
	//*  43   78:ldc1            #78  <Int 0x40000>
	//*  44   80:icmpge          89
				i = j + (j >> 2);
	//   45   83:iload_3         
	//   46   84:iload_3         
	//   47   85:iconst_2        
	//   48   86:ishr            
	//   49   87:iadd            
	//   50   88:istore_2        
		}
		return new Object[i];
	//   51   89:iload_2         
	//   52   90:anewarray       Object[]
	//   53   93:areturn         
	}

	public int bufferedSize()
	{
		return _size;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int _size>
	//    2    4:ireturn         
	}

	public void completeAndClearBuffer(Object aobj[], int i, List list)
	{
		LinkedNode linkednode = _head;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field LinkedNode _head>
	//    2    4:astore          7
		int j;
		do
		{
			j = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
			boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          5
			if(linkednode == null)
				break;
	//    7   12:aload           7
	//    8   14:ifnull          74
			Object aobj1[] = (Object[])linkednode.value();
	//    9   17:aload           7
	//   10   19:invokevirtual   #27  <Method Object LinkedNode.value()>
	//   11   22:checkcast       #28  <Class Object[]>
	//   12   25:astore          8
			int k = aobj1.length;
	//   13   27:aload           8
	//   14   29:arraylength     
	//   15   30:istore          6
			for(j = ((int) (flag)); j < k; j++)
	//*  16   32:iload           5
	//*  17   34:istore          4
	//*  18   36:iload           4
	//*  19   38:iload           6
	//*  20   40:icmpge          64
				list.add(aobj1[j]);
	//   21   43:aload_3         
	//   22   44:aload           8
	//   23   46:iload           4
	//   24   48:aaload          
	//   25   49:invokeinterface #88  <Method boolean List.add(Object)>
	//   26   54:pop             

	//   27   55:iload           4
	//   28   57:iconst_1        
	//   29   58:iadd            
	//   30   59:istore          4
	//*  31   61:goto            36
			linkednode = linkednode.next();
	//   32   64:aload           7
	//   33   66:invokevirtual   #38  <Method LinkedNode LinkedNode.next()>
	//   34   69:astore          7
		} while(true);
	//   35   71:goto            6
		for(; j < i; j++)
	//*  36   74:iload           4
	//*  37   76:iload_2         
	//*  38   77:icmpge          100
			list.add(aobj[j]);
	//   39   80:aload_3         
	//   40   81:aload_1         
	//   41   82:iload           4
	//   42   84:aaload          
	//   43   85:invokeinterface #88  <Method boolean List.add(Object)>
	//   44   90:pop             

	//   45   91:iload           4
	//   46   93:iconst_1        
	//   47   94:iadd            
	//   48   95:istore          4
	//*  49   97:goto            74
		_reset();
	//   50  100:aload_0         
	//   51  101:invokevirtual   #90  <Method void _reset()>
	//   52  104:return          
	}

	public Object[] completeAndClearBuffer(Object aobj[], int i)
	{
		int j = _size + i;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int _size>
	//    2    4:iload_2         
	//    3    5:iadd            
	//    4    6:istore_3        
		Object aobj1[] = new Object[j];
	//    5    7:iload_3         
	//    6    8:anewarray       Object[]
	//    7   11:astore          4
		_copyTo(((Object) (aobj1)), j, aobj, i);
	//    8   13:aload_0         
	//    9   14:aload           4
	//   10   16:iload_3         
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #95  <Method void _copyTo(Object, int, Object[], int)>
		_reset();
	//   14   22:aload_0         
	//   15   23:invokevirtual   #90  <Method void _reset()>
		return aobj1;
	//   16   26:aload           4
	//   17   28:areturn         
	}

	public Object[] completeAndClearBuffer(Object aobj[], int i, Class class1)
	{
		int j = _size + i;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int _size>
	//    2    4:iload_2         
	//    3    5:iadd            
	//    4    6:istore          4
		class1 = ((Class) ((Object[])Array.newInstance(class1, j)));
	//    5    8:aload_3         
	//    6    9:iload           4
	//    7   11:invokestatic    #102 <Method Object Array.newInstance(Class, int)>
	//    8   14:checkcast       #28  <Class Object[]>
	//    9   17:astore_3        
		_copyTo(((Object) (class1)), j, aobj, i);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:iload           4
	//   13   22:aload_1         
	//   14   23:iload_2         
	//   15   24:invokevirtual   #95  <Method void _copyTo(Object, int, Object[], int)>
		_reset();
	//   16   27:aload_0         
	//   17   28:invokevirtual   #90  <Method void _reset()>
		return ((Object []) (class1));
	//   18   31:aload_3         
	//   19   32:areturn         
	}

	public int initialCapacity()
	{
		Object aobj[] = _freeBuffer;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Object[] _freeBuffer>
	//    2    4:astore_1        
		if(aobj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return aobj.length;
	//    7   11:aload_1         
	//    8   12:arraylength     
	//    9   13:ireturn         
	}

	public Object[] resetAndStart()
	{
		_reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method void _reset()>
		Object aobj[] = _freeBuffer;
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field Object[] _freeBuffer>
	//    4    8:astore_1        
		if(aobj == null)
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       26
		{
			aobj = new Object[12];
	//    7   13:bipush          12
	//    8   15:anewarray       Object[]
	//    9   18:astore_1        
			_freeBuffer = aobj;
	//   10   19:aload_0         
	//   11   20:aload_1         
	//   12   21:putfield        #66  <Field Object[] _freeBuffer>
			return aobj;
	//   13   24:aload_1         
	//   14   25:areturn         
		} else
		{
			return aobj;
	//   15   26:aload_1         
	//   16   27:areturn         
		}
	}

	public Object[] resetAndStart(Object aobj[], int i)
	{
		_reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method void _reset()>
		Object aobj1[] = _freeBuffer;
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field Object[] _freeBuffer>
	//    4    8:astore_3        
		if(aobj1 == null || aobj1.length < i)
	//*   5    9:aload_3         
	//*   6   10:ifnull          19
	//*   7   13:aload_3         
	//*   8   14:arraylength     
	//*   9   15:iload_2         
	//*  10   16:icmpge          32
			_freeBuffer = new Object[Math.max(12, i)];
	//   11   19:aload_0         
	//   12   20:bipush          12
	//   13   22:iload_2         
	//   14   23:invokestatic    #112 <Method int Math.max(int, int)>
	//   15   26:anewarray       Object[]
	//   16   29:putfield        #66  <Field Object[] _freeBuffer>
		System.arraycopy(((Object) (aobj)), 0, ((Object) (_freeBuffer)), 0, i);
	//   17   32:aload_1         
	//   18   33:iconst_0        
	//   19   34:aload_0         
	//   20   35:getfield        #66  <Field Object[] _freeBuffer>
	//   21   38:iconst_0        
	//   22   39:iload_2         
	//   23   40:invokestatic    #34  <Method void System.arraycopy(Object, int, Object, int, int)>
		return _freeBuffer;
	//   24   43:aload_0         
	//   25   44:getfield        #66  <Field Object[] _freeBuffer>
	//   26   47:areturn         
	}

	private Object _freeBuffer[];
	private LinkedNode _head;
	private int _size;
	private LinkedNode _tail;
}
