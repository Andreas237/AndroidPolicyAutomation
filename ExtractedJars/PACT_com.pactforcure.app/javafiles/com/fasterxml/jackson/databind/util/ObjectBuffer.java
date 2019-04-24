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
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	protected final void _copyTo(Object obj, int i, Object aobj[], int j)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		for(LinkedNode linkednode = _head; linkednode != null; linkednode = linkednode.next())
	//*   2    3:aload_0         
	//*   3    4:getfield        #25  <Field LinkedNode _head>
	//*   4    7:astore          7
	//*   5    9:aload           7
	//*   6   11:ifnull          57
		{
			Object aobj1[] = (Object[])linkednode.value();
	//    7   14:aload           7
	//    8   16:invokevirtual   #31  <Method Object LinkedNode.value()>
	//    9   19:checkcast       #32  <Class Object[]>
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
	//   19   37:invokestatic    #38  <Method void System.arraycopy(Object, int, Object, int, int)>
			k += l;
	//   20   40:iload           5
	//   21   42:iload           6
	//   22   44:iadd            
	//   23   45:istore          5
		}

	//   24   47:aload           7
	//   25   49:invokevirtual   #42  <Method LinkedNode LinkedNode.next()>
	//   26   52:astore          7
	//*  27   54:goto            9
		System.arraycopy(((Object) (aobj)), 0, obj, k, j);
	//   28   57:aload_3         
	//   29   58:iconst_0        
	//   30   59:aload_1         
	//   31   60:iload           5
	//   32   62:iload           4
	//   33   64:invokestatic    #38  <Method void System.arraycopy(Object, int, Object, int, int)>
		j = k + j;
	//   34   67:iload           5
	//   35   69:iload           4
	//   36   71:iadd            
	//   37   72:istore          4
		if(j != i)
	//*  38   74:iload           4
	//*  39   76:iload_2         
	//*  40   77:icmpeq          117
			throw new IllegalStateException((new StringBuilder()).append("Should have gotten ").append(i).append(" entries, got ").append(j).toString());
	//   41   80:new             #44  <Class IllegalStateException>
	//   42   83:dup             
	//   43   84:new             #46  <Class StringBuilder>
	//   44   87:dup             
	//   45   88:invokespecial   #47  <Method void StringBuilder()>
	//   46   91:ldc1            #49  <String "Should have gotten ">
	//   47   93:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   48   96:iload_2         
	//   49   97:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   50  100:ldc1            #58  <String " entries, got ">
	//   51  102:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   52  105:iload           4
	//   53  107:invokevirtual   #56  <Method StringBuilder StringBuilder.append(int)>
	//   54  110:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   55  113:invokespecial   #65  <Method void IllegalStateException(String)>
	//   56  116:athrow          
		else
			return;
	//   57  117:return          
	}

	protected void _reset()
	{
		if(_tail != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field LinkedNode _tail>
	//*   2    4:ifnull          21
			_freeBuffer = (Object[])_tail.value();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #68  <Field LinkedNode _tail>
	//    6   12:invokevirtual   #31  <Method Object LinkedNode.value()>
	//    7   15:checkcast       #32  <Class Object[]>
	//    8   18:putfield        #70  <Field Object[] _freeBuffer>
		_tail = null;
	//    9   21:aload_0         
	//   10   22:aconst_null     
	//   11   23:putfield        #68  <Field LinkedNode _tail>
		_head = null;
	//   12   26:aload_0         
	//   13   27:aconst_null     
	//   14   28:putfield        #25  <Field LinkedNode _head>
		_size = 0;
	//   15   31:aload_0         
	//   16   32:iconst_0        
	//   17   33:putfield        #72  <Field int _size>
	//   18   36:return          
	}

	public Object[] appendCompletedChunk(Object aobj[])
	{
		int i;
		int j;
		LinkedNode linkednode = new LinkedNode(((Object) (aobj)), ((LinkedNode) (null)));
	//    0    0:new             #27  <Class LinkedNode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #77  <Method void LinkedNode(Object, LinkedNode)>
	//    5    9:astore          4
		if(_head == null)
	//*   6   11:aload_0         
	//*   7   12:getfield        #25  <Field LinkedNode _head>
	//*   8   15:ifnonnull       59
		{
			_tail = linkednode;
	//    9   18:aload_0         
	//   10   19:aload           4
	//   11   21:putfield        #68  <Field LinkedNode _tail>
			_head = linkednode;
	//   12   24:aload_0         
	//   13   25:aload           4
	//   14   27:putfield        #25  <Field LinkedNode _head>
		} else
	//*  15   30:aload_1         
	//*  16   31:arraylength     
	//*  17   32:istore_3        
	//*  18   33:aload_0         
	//*  19   34:aload_0         
	//*  20   35:getfield        #72  <Field int _size>
	//*  21   38:iload_3         
	//*  22   39:iadd            
	//*  23   40:putfield        #72  <Field int _size>
	//*  24   43:iload_3         
	//*  25   44:sipush          16384
	//*  26   47:icmpge          77
	//*  27   50:iload_3         
	//*  28   51:iload_3         
	//*  29   52:iadd            
	//*  30   53:istore_2        
	//*  31   54:iload_2         
	//*  32   55:anewarray       Object[]
	//*  33   58:areturn         
		{
			_tail.linkNext(linkednode);
	//   34   59:aload_0         
	//   35   60:getfield        #68  <Field LinkedNode _tail>
	//   36   63:aload           4
	//   37   65:invokevirtual   #81  <Method void LinkedNode.linkNext(LinkedNode)>
			_tail = linkednode;
	//   38   68:aload_0         
	//   39   69:aload           4
	//   40   71:putfield        #68  <Field LinkedNode _tail>
		}
		j = aobj.length;
		_size = _size + j;
		if(j >= 16384) goto _L2; else goto _L1
_L1:
		i = j + j;
_L4:
		return new Object[i];
	//*  41   74:goto            30
_L2:
		i = j;
	//   42   77:iload_3         
	//   43   78:istore_2        
		if(j < 0x40000)
	//*  44   79:iload_3         
	//*  45   80:ldc1            #7   <Int 0x40000>
	//*  46   82:icmpge          54
			i = j + (j >> 2);
	//   47   85:iload_3         
	//   48   86:iload_3         
	//   49   87:iconst_2        
	//   50   88:ishr            
	//   51   89:iadd            
	//   52   90:istore_2        
		if(true) goto _L4; else goto _L3
	//   53   91:goto            54
_L3:
	}

	public int bufferedSize()
	{
		return _size;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int _size>
	//    2    4:ireturn         
	}

	public void completeAndClearBuffer(Object aobj[], int i, List list)
	{
		for(LinkedNode linkednode = _head; linkednode != null; linkednode = linkednode.next())
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field LinkedNode _head>
	//*   2    4:astore          6
	//*   3    6:aload           6
	//*   4    8:ifnull          67
		{
			Object aobj1[] = (Object[])linkednode.value();
	//    5   11:aload           6
	//    6   13:invokevirtual   #31  <Method Object LinkedNode.value()>
	//    7   16:checkcast       #32  <Class Object[]>
	//    8   19:astore          7
			int j = 0;
	//    9   21:iconst_0        
	//   10   22:istore          4
			for(int l = aobj1.length; j < l; j++)
	//*  11   24:aload           7
	//*  12   26:arraylength     
	//*  13   27:istore          5
	//*  14   29:iload           4
	//*  15   31:iload           5
	//*  16   33:icmpge          57
				list.add(aobj1[j]);
	//   17   36:aload_3         
	//   18   37:aload           7
	//   19   39:iload           4
	//   20   41:aaload          
	//   21   42:invokeinterface #91  <Method boolean List.add(Object)>
	//   22   47:pop             

	//   23   48:iload           4
	//   24   50:iconst_1        
	//   25   51:iadd            
	//   26   52:istore          4
		}

	//   27   54:goto            29
	//   28   57:aload           6
	//   29   59:invokevirtual   #42  <Method LinkedNode LinkedNode.next()>
	//   30   62:astore          6
	//*  31   64:goto            6
		for(int k = 0; k < i; k++)
	//*  32   67:iconst_0        
	//*  33   68:istore          4
	//*  34   70:iload           4
	//*  35   72:iload_2         
	//*  36   73:icmpge          96
			list.add(aobj[k]);
	//   37   76:aload_3         
	//   38   77:aload_1         
	//   39   78:iload           4
	//   40   80:aaload          
	//   41   81:invokeinterface #91  <Method boolean List.add(Object)>
	//   42   86:pop             

	//   43   87:iload           4
	//   44   89:iconst_1        
	//   45   90:iadd            
	//   46   91:istore          4
	//*  47   93:goto            70
	//   48   96:return          
	}

	public Object[] completeAndClearBuffer(Object aobj[], int i)
	{
		int j = i + _size;
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field int _size>
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
	//   13   19:invokevirtual   #96  <Method void _copyTo(Object, int, Object[], int)>
		return aobj1;
	//   14   22:aload           4
	//   15   24:areturn         
	}

	public Object[] completeAndClearBuffer(Object aobj[], int i, Class class1)
	{
		int j = i + _size;
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #72  <Field int _size>
	//    3    5:iadd            
	//    4    6:istore          4
		class1 = ((Class) ((Object[])(Object[])Array.newInstance(class1, j)));
	//    5    8:aload_3         
	//    6    9:iload           4
	//    7   11:invokestatic    #103 <Method Object Array.newInstance(Class, int)>
	//    8   14:checkcast       #32  <Class Object[]>
	//    9   17:checkcast       #32  <Class Object[]>
	//   10   20:astore_3        
		_copyTo(((Object) (class1)), j, aobj, i);
	//   11   21:aload_0         
	//   12   22:aload_3         
	//   13   23:iload           4
	//   14   25:aload_1         
	//   15   26:iload_2         
	//   16   27:invokevirtual   #96  <Method void _copyTo(Object, int, Object[], int)>
		_reset();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #105 <Method void _reset()>
		return ((Object []) (class1));
	//   19   34:aload_3         
	//   20   35:areturn         
	}

	public int initialCapacity()
	{
		if(_freeBuffer == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #70  <Field Object[] _freeBuffer>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _freeBuffer.length;
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field Object[] _freeBuffer>
	//    7   13:arraylength     
	//    8   14:ireturn         
	}

	public Object[] resetAndStart()
	{
		_reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method void _reset()>
		if(_freeBuffer == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #70  <Field Object[] _freeBuffer>
	//*   4    8:ifnonnull       17
			return new Object[12];
	//    5   11:bipush          12
	//    6   13:anewarray       Object[]
	//    7   16:areturn         
		else
			return _freeBuffer;
	//    8   17:aload_0         
	//    9   18:getfield        #70  <Field Object[] _freeBuffer>
	//   10   21:areturn         
	}

	private static final int MAX_CHUNK = 0x40000;
	private static final int SMALL_CHUNK = 16384;
	private Object _freeBuffer[];
	private LinkedNode _head;
	private int _size;
	private LinkedNode _tail;
}
