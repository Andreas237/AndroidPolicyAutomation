// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.zzac;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzaaz

public class zzaba
{

	public zzaba()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void WeakHashMap()>
	//    6   12:invokestatic    #20  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #22  <Field Set zzarH>
	//    8   18:return          
	}

	public static zzaaz.zzb zza(Object obj, String s)
	{
		zzac.zzb(obj, "Listener must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "Listener must not be null">
	//    2    3:invokestatic    #34  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzac.zzb(((Object) (s)), "Listener type must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #36  <String "Listener type must not be null">
	//    6   10:invokestatic    #34  <Method Object zzac.zzb(Object, Object)>
	//    7   13:pop             
		zzac.zzh(s, "Listener type must not be empty");
	//    8   14:aload_1         
	//    9   15:ldc1            #38  <String "Listener type must not be empty">
	//   10   17:invokestatic    #42  <Method String zzac.zzh(String, Object)>
	//   11   20:pop             
		return new zzaaz.zzb(obj, s);
	//   12   21:new             #44  <Class zzaaz$zzb>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokespecial   #47  <Method void zzaaz$zzb(Object, String)>
	//   17   30:areturn         
	}

	public static zzaaz zzb(Object obj, Looper looper, String s)
	{
		zzac.zzb(obj, "Listener must not be null");
	//    0    0:aload_0         
	//    1    1:ldc1            #28  <String "Listener must not be null">
	//    2    3:invokestatic    #34  <Method Object zzac.zzb(Object, Object)>
	//    3    6:pop             
		zzac.zzb(((Object) (looper)), "Looper must not be null");
	//    4    7:aload_1         
	//    5    8:ldc1            #53  <String "Looper must not be null">
	//    6   10:invokestatic    #34  <Method Object zzac.zzb(Object, Object)>
	//    7   13:pop             
		zzac.zzb(((Object) (s)), "Listener type must not be null");
	//    8   14:aload_2         
	//    9   15:ldc1            #36  <String "Listener type must not be null">
	//   10   17:invokestatic    #34  <Method Object zzac.zzb(Object, Object)>
	//   11   20:pop             
		return new zzaaz(looper, obj, s);
	//   12   21:new             #55  <Class zzaaz>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:aload_0         
	//   16   27:aload_2         
	//   17   28:invokespecial   #58  <Method void zzaaz(Looper, Object, String)>
	//   18   31:areturn         
	}

	public void release()
	{
		for(Iterator iterator = zzarH.iterator(); iterator.hasNext(); ((zzaaz)iterator.next()).clear());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Set zzarH>
	//    2    4:invokeinterface #66  <Method Iterator Set.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            34
	//    7   19:aload_1         
	//    8   20:invokeinterface #76  <Method Object Iterator.next()>
	//    9   25:checkcast       #55  <Class zzaaz>
	//   10   28:invokevirtual   #79  <Method void zzaaz.clear()>
	//*  11   31:goto            10
		zzarH.clear();
	//   12   34:aload_0         
	//   13   35:getfield        #22  <Field Set zzarH>
	//   14   38:invokeinterface #80  <Method void Set.clear()>
	//   15   43:return          
	}

	public zzaaz zza(Object obj, Looper looper, String s)
	{
		obj = ((Object) (zzb(obj, looper, s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #82  <Method zzaaz zzb(Object, Looper, String)>
	//    4    6:astore_1        
		zzarH.add(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field Set zzarH>
	//    7   11:aload_1         
	//    8   12:invokeinterface #86  <Method boolean Set.add(Object)>
	//    9   17:pop             
		return ((zzaaz) (obj));
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public zzaaz zzb(Object obj, Looper looper)
	{
		return zza(obj, looper, "NO_TYPE");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #89  <String "NO_TYPE">
	//    4    5:invokevirtual   #91  <Method zzaaz zza(Object, Looper, String)>
	//    5    8:areturn         
	}

	private final Set zzarH = Collections.newSetFromMap(((java.util.Map) (new WeakHashMap())));
}
