// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.zzac;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzabh

public class zzabi
{

	public zzabi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #13  <Class WeakHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void WeakHashMap()>
	//    6   12:invokestatic    #20  <Method Set Collections.newSetFromMap(java.util.Map)>
	//    7   15:putfield        #22  <Field Set zzasL>
	//    8   18:return          
	}

	public static zzabh.zzb zza(Object obj, String s)
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
		return new zzabh.zzb(obj, s);
	//   12   21:new             #44  <Class zzabh$zzb>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aload_1         
	//   16   27:invokespecial   #47  <Method void zzabh$zzb(Object, String)>
	//   17   30:areturn         
	}

	public static zzabh zzb(Object obj, Looper looper, String s)
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
		return new zzabh(looper, obj, s);
	//   12   21:new             #55  <Class zzabh>
	//   13   24:dup             
	//   14   25:aload_1         
	//   15   26:aload_0         
	//   16   27:aload_2         
	//   17   28:invokespecial   #58  <Method void zzabh(Looper, Object, String)>
	//   18   31:areturn         
	}

	public void release()
	{
		for(Iterator iterator = zzasL.iterator(); iterator.hasNext(); ((zzabh)iterator.next()).clear());
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Set zzasL>
	//    2    4:invokeinterface #66  <Method Iterator Set.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #72  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            34
	//    7   19:aload_1         
	//    8   20:invokeinterface #76  <Method Object Iterator.next()>
	//    9   25:checkcast       #55  <Class zzabh>
	//   10   28:invokevirtual   #79  <Method void zzabh.clear()>
	//*  11   31:goto            10
		zzasL.clear();
	//   12   34:aload_0         
	//   13   35:getfield        #22  <Field Set zzasL>
	//   14   38:invokeinterface #80  <Method void Set.clear()>
	//   15   43:return          
	}

	public zzabh zza(Object obj, Looper looper, String s)
	{
		obj = ((Object) (zzb(obj, looper, s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokestatic    #82  <Method zzabh zzb(Object, Looper, String)>
	//    4    6:astore_1        
		zzasL.add(obj);
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field Set zzasL>
	//    7   11:aload_1         
	//    8   12:invokeinterface #86  <Method boolean Set.add(Object)>
	//    9   17:pop             
		return ((zzabh) (obj));
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public zzabh zzb(Object obj, Looper looper)
	{
		return zza(obj, looper, "NO_TYPE");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #89  <String "NO_TYPE">
	//    4    5:invokevirtual   #91  <Method zzabh zza(Object, Looper, String)>
	//    5    8:areturn         
	}

	private final Set zzasL = Collections.newSetFromMap(((java.util.Map) (new WeakHashMap())));
}
