// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzta, zzuu

final class zzwi extends zzta
{

	zzwi()
	{
		this(((List) (new ArrayList(10))));
	//    0    0:aload_0         
	//    1    1:new             #24  <Class ArrayList>
	//    2    4:dup             
	//    3    5:bipush          10
	//    4    7:invokespecial   #27  <Method void ArrayList(int)>
	//    5   10:invokespecial   #30  <Method void zzwi(List)>
	//    6   13:return          
	}

	private zzwi(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zzta()>
		zzbzz = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field List zzbzz>
	//    5    9:return          
	}

	public static zzwi zzxu()
	{
		return zzcbm;
	//    0    0:getstatic       #18  <Field zzwi zzcbm>
	//    1    3:areturn         
	}

	public final void add(int i, Object obj)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void zzta.zzua()>
		zzbzz.add(i, obj);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field List zzbzz>
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
		return zzbzz.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List zzbzz>
	//    2    4:iload_1         
	//    3    5:invokeinterface #56  <Method Object List.get(int)>
	//    4   10:areturn         
	}

	public final Object remove(int i)
	{
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void zzta.zzua()>
		Object obj = zzbzz.remove(i);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field List zzbzz>
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
		((zzta)this).zzua();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method void zzta.zzua()>
		obj = zzbzz.set(i, obj);
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field List zzbzz>
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
		return zzbzz.size();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field List zzbzz>
	//    2    4:invokeinterface #69  <Method int List.size()>
	//    3    9:ireturn         
	}

	public final zzuu zzal(int i)
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
			((List) (arraylist)).addAll(((java.util.Collection) (zzbzz)));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field List zzbzz>
	//   12   22:invokeinterface #76  <Method boolean List.addAll(java.util.Collection)>
	//   13   27:pop             
			return ((zzuu) (new zzwi(((List) (arraylist)))));
	//   14   28:new             #2   <Class zzwi>
	//   15   31:dup             
	//   16   32:aload_2         
	//   17   33:invokespecial   #30  <Method void zzwi(List)>
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

	private static final zzwi zzcbm;
	private final List zzbzz;

	static 
	{
		zzwi zzwi1 = new zzwi();
	//    0    0:new             #2   <Class zzwi>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzwi()>
	//    3    7:astore_0        
		zzcbm = zzwi1;
	//    4    8:aload_0         
	//    5    9:putstatic       #18  <Field zzwi zzcbm>
		((zzta) (zzwi1)).zzsw();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #21  <Method void zzta.zzsw()>
	//*   8   16:return          
	}
}
