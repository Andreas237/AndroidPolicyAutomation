// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.collection;

import java.util.Iterator;

// Referenced classes of package com.firebase.client.collection:
//			ArraySortedMap

class ArraySortedMap$1
	implements Iterator
{

	public boolean hasNext()
	{
		if(val$reverse)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field boolean val$reverse>
	//*   2    4:ifeq            16
		{
			if(currentPos >= 0)
	//*   3    7:aload_0         
	//*   4    8:getfield        #32  <Field int currentPos>
	//*   5   11:iflt            33
				return true;
	//    6   14:iconst_1        
	//    7   15:ireturn         
		} else
		if(currentPos < ArraySortedMap.access$000(ArraySortedMap.this).length)
	//*   8   16:aload_0         
	//*   9   17:getfield        #32  <Field int currentPos>
	//*  10   20:aload_0         
	//*  11   21:getfield        #23  <Field ArraySortedMap this$0>
	//*  12   24:invokestatic    #39  <Method Object[] ArraySortedMap.access$000(ArraySortedMap)>
	//*  13   27:arraylength     
	//*  14   28:icmpge          33
			return true;
	//   15   31:iconst_1        
	//   16   32:ireturn         
		return false;
	//   17   33:iconst_0        
	//   18   34:ireturn         
	}

	public volatile Object next()
	{
		return ((Object) (next()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #44  <Method java.util.Map$Entry next()>
	//    2    4:areturn         
	}

	public java.util.Map.Entry next()
	{
		Object obj = ArraySortedMap.access$000(ArraySortedMap.this)[currentPos];
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ArraySortedMap this$0>
	//    2    4:invokestatic    #39  <Method Object[] ArraySortedMap.access$000(ArraySortedMap)>
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field int currentPos>
	//    5   11:aaload          
	//    6   12:astore_2        
		Object aobj[] = ArraySortedMap.access$100(ArraySortedMap.this);
	//    7   13:aload_0         
	//    8   14:getfield        #23  <Field ArraySortedMap this$0>
	//    9   17:invokestatic    #47  <Method Object[] ArraySortedMap.access$100(ArraySortedMap)>
	//   10   20:astore_3        
		int i = currentPos;
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field int currentPos>
	//   13   25:istore_1        
		Object obj1 = aobj[i];
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:aaload          
	//   17   29:astore_3        
		if(val$reverse)
	//*  18   30:aload_0         
	//*  19   31:getfield        #27  <Field boolean val$reverse>
	//*  20   34:ifeq            44
			i--;
	//   21   37:iload_1         
	//   22   38:iconst_1        
	//   23   39:isub            
	//   24   40:istore_1        
		else
	//*  25   41:goto            48
			i++;
	//   26   44:iload_1         
	//   27   45:iconst_1        
	//   28   46:iadd            
	//   29   47:istore_1        
		currentPos = i;
	//   30   48:aload_0         
	//   31   49:iload_1         
	//   32   50:putfield        #32  <Field int currentPos>
		return ((java.util.Map.Entry) (new java.util.eImmutableEntry(obj, obj1)));
	//   33   53:new             #49  <Class java.util.AbstractMap$SimpleImmutableEntry>
	//   34   56:dup             
	//   35   57:aload_2         
	//   36   58:aload_3         
	//   37   59:invokespecial   #52  <Method void java.util.AbstractMap$SimpleImmutableEntry(Object, Object)>
	//   38   62:areturn         
	}

	public void remove()
	{
		throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
	//    0    0:new             #57  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #59  <String "Can't remove elements from ImmutableSortedMap">
	//    3    6:invokespecial   #62  <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	int currentPos;
	final ArraySortedMap this$0;
	final int val$pos;
	final boolean val$reverse;

	ArraySortedMap$1()
	{
		this$0 = final_arraysortedmap;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field ArraySortedMap this$0>
		val$pos = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #25  <Field int val$pos>
		val$reverse = Z.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #27  <Field boolean val$reverse>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #30  <Method void Object()>
		currentPos = val$pos;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #25  <Field int val$pos>
	//   14   24:putfield        #32  <Field int currentPos>
	//   15   27:return          
	}
}
