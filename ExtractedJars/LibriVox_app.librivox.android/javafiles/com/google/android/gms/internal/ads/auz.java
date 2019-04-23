// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.ads:
//			auq, auy, aur

class auz extends AbstractSet
{

	private auz(auq auq1)
	{
		a = auq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field auq a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void AbstractSet()>
	//    5    9:return          
	}

	auz(auq auq1, aur aur)
	{
		this(auq1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void auz(auq)>
	//    3    5:return          
	}

	public boolean add(Object obj)
	{
		obj = ((Object) ((java.util.Map.Entry)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class java.util.Map$Entry>
	//    2    4:astore_1        
		if(!contains(obj))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #24  <Method boolean contains(Object)>
	//*   6   10:ifne            38
		{
			a.a((Comparable)((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
	//    7   13:aload_0         
	//    8   14:getfield        #10  <Field auq a>
	//    9   17:aload_1         
	//   10   18:invokeinterface #28  <Method Object java.util.Map$Entry.getKey()>
	//   11   23:checkcast       #30  <Class Comparable>
	//   12   26:aload_1         
	//   13   27:invokeinterface #33  <Method Object java.util.Map$Entry.getValue()>
	//   14   32:invokevirtual   #38  <Method Object auq.a(Comparable, Object)>
	//   15   35:pop             
			return true;
	//   16   36:iconst_1        
	//   17   37:ireturn         
		} else
		{
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		}
	}

	public void clear()
	{
		a.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field auq a>
	//    2    4:invokevirtual   #41  <Method void auq.clear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		Object obj1 = ((Object) ((java.util.Map.Entry)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class java.util.Map$Entry>
	//    2    4:astore_2        
		obj = a.get(((java.util.Map.Entry) (obj1)).getKey());
	//    3    5:aload_0         
	//    4    6:getfield        #10  <Field auq a>
	//    5    9:aload_2         
	//    6   10:invokeinterface #28  <Method Object java.util.Map$Entry.getKey()>
	//    7   15:invokevirtual   #45  <Method Object auq.get(Object)>
	//    8   18:astore_1        
		obj1 = ((java.util.Map.Entry) (obj1)).getValue();
	//    9   19:aload_2         
	//   10   20:invokeinterface #33  <Method Object java.util.Map$Entry.getValue()>
	//   11   25:astore_2        
		return obj == obj1 || obj != null && obj.equals(obj1);
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:if_acmpeq       48
	//   15   31:aload_1         
	//   16   32:ifnull          46
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #50  <Method boolean Object.equals(Object)>
	//   20   40:ifeq            46
	//   21   43:goto            48
	//   22   46:iconst_0        
	//   23   47:ireturn         
	//   24   48:iconst_1        
	//   25   49:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new auy(a, ((aur) (null)))));
	//    0    0:new             #54  <Class auy>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #10  <Field auq a>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #56  <Method void auy(auq, aur)>
	//    6   12:areturn         
	}

	public boolean remove(Object obj)
	{
		obj = ((Object) ((java.util.Map.Entry)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class java.util.Map$Entry>
	//    2    4:astore_1        
		if(contains(obj))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #24  <Method boolean contains(Object)>
	//*   6   10:ifeq            29
		{
			a.remove(((java.util.Map.Entry) (obj)).getKey());
	//    7   13:aload_0         
	//    8   14:getfield        #10  <Field auq a>
	//    9   17:aload_1         
	//   10   18:invokeinterface #28  <Method Object java.util.Map$Entry.getKey()>
	//   11   23:invokevirtual   #59  <Method Object auq.remove(Object)>
	//   12   26:pop             
			return true;
	//   13   27:iconst_1        
	//   14   28:ireturn         
		} else
		{
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		}
	}

	public int size()
	{
		return a.size();
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field auq a>
	//    2    4:invokevirtual   #63  <Method int auq.size()>
	//    3    7:ireturn         
	}

	private final auq a;
}
