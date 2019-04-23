// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aqk, ast

final class auj extends aqk
{

	auj()
	{
		this(((List) (new ArrayList(10))));
	//    0    0:aload_0         
	//    1    1:new             #20  <Class ArrayList>
	//    2    4:dup             
	//    3    5:bipush          10
	//    4    7:invokespecial   #23  <Method void ArrayList(int)>
	//    5   10:invokespecial   #26  <Method void auj(List)>
	//    6   13:return          
	}

	private auj(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void aqk()>
		b = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #29  <Field List b>
	//    5    9:return          
	}

	public static auj d()
	{
		return a;
	//    0    0:getstatic       #15  <Field auj a>
	//    1    3:areturn         
	}

	public final ast a(int i)
	{
		if(i >= size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #36  <Method int size()>
	//*   3    5:icmplt          37
		{
			ArrayList arraylist = new ArrayList(i);
	//    4    8:new             #20  <Class ArrayList>
	//    5   11:dup             
	//    6   12:iload_1         
	//    7   13:invokespecial   #23  <Method void ArrayList(int)>
	//    8   16:astore_2        
			((List) (arraylist)).addAll(((java.util.Collection) (b)));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #29  <Field List b>
	//   12   22:invokeinterface #42  <Method boolean List.addAll(java.util.Collection)>
	//   13   27:pop             
			return ((ast) (new auj(((List) (arraylist)))));
	//   14   28:new             #2   <Class auj>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:invokespecial   #26  <Method void auj(List)>
	//   18   36:areturn         
		} else
		{
			throw new IllegalArgumentException();
	//   19   37:new             #44  <Class IllegalArgumentException>
	//   20   40:dup             
	//   21   41:invokespecial   #45  <Method void IllegalArgumentException()>
	//   22   44:athrow          
		}
	}

	public final void add(int i, Object obj)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method void aqk.c()>
		b.add(i, obj);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field List b>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #52  <Method void List.add(int, Object)>
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #56  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #56  <Field int modCount>
	//   13   25:return          
	}

	public final Object get(int i)
	{
		return b.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List b>
	//    2    4:iload_1         
	//    3    5:invokeinterface #60  <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public final Object remove(int i)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method void aqk.c()>
		Object obj = b.remove(i);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field List b>
	//    4    8:iload_1         
	//    5    9:invokeinterface #63  <Method Object List.remove(int)>
	//    6   14:astore_2        
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #56  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #56  <Field int modCount>
		return obj;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public final Object set(int i, Object obj)
	{
		((aqk)this).c();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #50  <Method void aqk.c()>
		obj = b.set(i, obj);
	//    2    4:aload_0         
	//    3    5:getfield        #29  <Field List b>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #67  <Method Object List.set(int, Object)>
	//    7   15:astore_2        
		modCount = modCount + 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #56  <Field int modCount>
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:putfield        #56  <Field int modCount>
		return obj;
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	public final int size()
	{
		return b.size();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field List b>
	//    2    4:invokeinterface #68  <Method int List.size()>
	//    3    9:ireturn         
	}

	private static final auj a;
	private final List b;

	static 
	{
		auj auj1 = new auj();
	//    0    0:new             #2   <Class auj>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void auj()>
	//    3    7:astore_0        
		a = auj1;
	//    4    8:aload_0         
	//    5    9:putstatic       #15  <Field auj a>
		((aqk) (auj1)).b();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #17  <Method void aqk.b()>
	//*   8   16:return          
	}
}
