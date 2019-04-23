// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzav, zzcn

final class zzeb extends zzav
{

	zzeb()
	{
		this(((List) (new ArrayList(10))));
	//    0    0:aload_0         
	//    1    1:new             #24  <Class ArrayList>
	//    2    4:dup             
	//    3    5:bipush          10
	//    4    7:invokespecial   #27  <Method void ArrayList(int)>
	//    5   10:invokespecial   #30  <Method void zzeb(List)>
	//    6   13:return          
	}

	private zzeb(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zzav()>
		zzls = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field List zzls>
	//    5    9:return          
	}

	public static zzeb zzcn()
	{
		return zznf;
	//    0    0:getstatic       #18  <Field zzeb zznf>
	//    1    3:areturn         
	}

	public final void add(int i, Object obj)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void zzav.zzw()>
		zzls.add(i, obj);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field List zzls>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #47  <Method void List.add(int, Object)>
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #51  <Field int modCount>
	//   13   25:return          
	}

	public final Object get(int i)
	{
		return zzls.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List zzls>
	//    2    4:iload_1         
	//    3    5:invokeinterface #56  <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public final Object remove(int i)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void zzav.zzw()>
		Object obj = zzls.remove(i);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field List zzls>
	//    4    8:iload_1         
	//    5    9:invokeinterface #60  <Method Object List.remove(int)>
	//    6   14:astore_2        
		modCount = modCount + 1;
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field int modCount>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:putfield        #51  <Field int modCount>
		return obj;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public final Object set(int i, Object obj)
	{
		((zzav)this).zzw();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void zzav.zzw()>
		obj = zzls.set(i, obj);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field List zzls>
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #64  <Method Object List.set(int, Object)>
	//    7   15:astore_2        
		modCount = modCount + 1;
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #51  <Field int modCount>
	//   11   21:iconst_1        
	//   12   22:iadd            
	//   13   23:putfield        #51  <Field int modCount>
		return obj;
	//   14   26:aload_2         
	//   15   27:areturn         
	}

	public final int size()
	{
		return zzls.size();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List zzls>
	//    2    4:invokeinterface #69  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final zzcn zzi(int i)
	{
		if(i >= size())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #72  <Method int size()>
	//*   3    5:icmplt          37
		{
			ArrayList arraylist = new ArrayList(i);
	//    4    8:new             #24  <Class ArrayList>
	//    5   11:dup             
	//    6   12:iload_1         
	//    7   13:invokespecial   #27  <Method void ArrayList(int)>
	//    8   16:astore_2        
			((List) (arraylist)).addAll(((java.util.Collection) (zzls)));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field List zzls>
	//   12   22:invokeinterface #76  <Method boolean List.addAll(java.util.Collection)>
	//   13   27:pop             
			return ((zzcn) (new zzeb(((List) (arraylist)))));
	//   14   28:new             #2   <Class zzeb>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:invokespecial   #30  <Method void zzeb(List)>
	//   18   36:areturn         
		} else
		{
			throw new IllegalArgumentException();
	//   19   37:new             #78  <Class IllegalArgumentException>
	//   20   40:dup             
	//   21   41:invokespecial   #79  <Method void IllegalArgumentException()>
	//   22   44:athrow          
		}
	}

	private static final zzeb zznf;
	private final List zzls;

	static 
	{
		zzeb zzeb1 = new zzeb();
	//    0    0:new             #2   <Class zzeb>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzeb()>
	//    3    7:astore_0        
		zznf = zzeb1;
	//    4    8:aload_0         
	//    5    9:putstatic       #18  <Field zzeb zznf>
		((zzav) (zzeb1)).zzv();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #21  <Method void zzav.zzv()>
	//*   8   16:return          
	}
}
