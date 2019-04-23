// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzwo, zzww, zzwp

class zzwx extends AbstractSet
{

	private zzwx(zzwo zzwo1)
	{
		zzcby = zzwo1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #11  <Field zzwo zzcby>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #14  <Method void AbstractSet()>
	//    5    9:return          
	}

	zzwx(zzwo zzwo1, zzwp zzwp)
	{
		this(zzwo1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void zzwx(zzwo)>
	//    3    5:return          
	}

	public boolean add(Object obj)
	{
		obj = ((Object) ((java.util.Map.Entry)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class java.util.Map$Entry>
	//    2    4:astore_1        
		if(!contains(obj))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #25  <Method boolean contains(Object)>
	//*   6   10:ifne            38
		{
			zzcby.zza((Comparable)((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
	//    7   13:aload_0         
	//    8   14:getfield        #11  <Field zzwo zzcby>
	//    9   17:aload_1         
	//   10   18:invokeinterface #29  <Method Object java.util.Map$Entry.getKey()>
	//   11   23:checkcast       #31  <Class Comparable>
	//   12   26:aload_1         
	//   13   27:invokeinterface #34  <Method Object java.util.Map$Entry.getValue()>
	//   14   32:invokevirtual   #40  <Method Object zzwo.zza(Comparable, Object)>
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
		zzcby.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field zzwo zzcby>
	//    2    4:invokevirtual   #43  <Method void zzwo.clear()>
	//    3    7:return          
	}

	public boolean contains(Object obj)
	{
		Object obj1 = ((Object) ((java.util.Map.Entry)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class java.util.Map$Entry>
	//    2    4:astore_2        
		obj = zzcby.get(((java.util.Map.Entry) (obj1)).getKey());
	//    3    5:aload_0         
	//    4    6:getfield        #11  <Field zzwo zzcby>
	//    5    9:aload_2         
	//    6   10:invokeinterface #29  <Method Object java.util.Map$Entry.getKey()>
	//    7   15:invokevirtual   #47  <Method Object zzwo.get(Object)>
	//    8   18:astore_1        
		obj1 = ((java.util.Map.Entry) (obj1)).getValue();
	//    9   19:aload_2         
	//   10   20:invokeinterface #34  <Method Object java.util.Map$Entry.getValue()>
	//   11   25:astore_2        
		return obj == obj1 || obj != null && obj.equals(obj1);
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:if_acmpeq       48
	//   15   31:aload_1         
	//   16   32:ifnull          46
	//   17   35:aload_1         
	//   18   36:aload_2         
	//   19   37:invokevirtual   #52  <Method boolean Object.equals(Object)>
	//   20   40:ifeq            46
	//   21   43:goto            48
	//   22   46:iconst_0        
	//   23   47:ireturn         
	//   24   48:iconst_1        
	//   25   49:ireturn         
	}

	public Iterator iterator()
	{
		return ((Iterator) (new zzww(zzcby, ((zzwp) (null)))));
	//    0    0:new             #56  <Class zzww>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #11  <Field zzwo zzcby>
	//    4    8:aconst_null     
	//    5    9:invokespecial   #58  <Method void zzww(zzwo, zzwp)>
	//    6   12:areturn         
	}

	public boolean remove(Object obj)
	{
		obj = ((Object) ((java.util.Map.Entry)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #22  <Class java.util.Map$Entry>
	//    2    4:astore_1        
		if(contains(obj))
	//*   3    5:aload_0         
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #25  <Method boolean contains(Object)>
	//*   6   10:ifeq            29
		{
			zzcby.remove(((java.util.Map.Entry) (obj)).getKey());
	//    7   13:aload_0         
	//    8   14:getfield        #11  <Field zzwo zzcby>
	//    9   17:aload_1         
	//   10   18:invokeinterface #29  <Method Object java.util.Map$Entry.getKey()>
	//   11   23:invokevirtual   #63  <Method Object zzwo.remove(Object)>
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
		return zzcby.size();
	//    0    0:aload_0         
	//    1    1:getfield        #11  <Field zzwo zzcby>
	//    2    4:invokevirtual   #67  <Method int zzwo.size()>
	//    3    7:ireturn         
	}

	private final zzwo zzcby;
}
