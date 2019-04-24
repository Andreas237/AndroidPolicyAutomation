// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzvk, zzuq, zzwl, zzwm

final class zzwh
{

	private zzwh()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void ConcurrentHashMap()>
	//    6   12:putfield        #25  <Field ConcurrentMap zzcbn>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class zzvk>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void zzvk()>
	//   11   23:putfield        #30  <Field zzwm zzcbm>
	//   12   26:return          
	}

	public static zzwh zzxt()
	{
		return zzcbl;
	//    0    0:getstatic       #18  <Field zzwh zzcbl>
	//    1    3:areturn         
	}

	public final zzwl zzak(Object obj)
	{
		return zzi(obj.getClass());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #38  <Method Class Object.getClass()>
	//    3    5:invokevirtual   #42  <Method zzwl zzi(Class)>
	//    4    8:areturn         
	}

	public final zzwl zzi(Class class1)
	{
		zzuq.zza(((Object) (class1)), "messageType");
	//    0    0:aload_1         
	//    1    1:ldc1            #46  <String "messageType">
	//    2    3:invokestatic    #52  <Method Object zzuq.zza(Object, String)>
	//    3    6:pop             
		zzwl zzwl1 = (zzwl)zzcbn.get(((Object) (class1)));
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field ConcurrentMap zzcbn>
	//    6   11:aload_1         
	//    7   12:invokeinterface #58  <Method Object ConcurrentMap.get(Object)>
	//    8   17:checkcast       #60  <Class zzwl>
	//    9   20:astore_3        
		Object obj = ((Object) (zzwl1));
	//   10   21:aload_3         
	//   11   22:astore_2        
		if(zzwl1 == null)
	//*  12   23:aload_3         
	//*  13   24:ifnonnull       73
		{
			obj = ((Object) (zzcbm.zzh(class1)));
	//   14   27:aload_0         
	//   15   28:getfield        #30  <Field zzwm zzcbm>
	//   16   31:aload_1         
	//   17   32:invokeinterface #65  <Method zzwl zzwm.zzh(Class)>
	//   18   37:astore_2        
			zzuq.zza(((Object) (class1)), "messageType");
	//   19   38:aload_1         
	//   20   39:ldc1            #46  <String "messageType">
	//   21   41:invokestatic    #52  <Method Object zzuq.zza(Object, String)>
	//   22   44:pop             
			zzuq.zza(obj, "schema");
	//   23   45:aload_2         
	//   24   46:ldc1            #67  <String "schema">
	//   25   48:invokestatic    #52  <Method Object zzuq.zza(Object, String)>
	//   26   51:pop             
			class1 = ((Class) ((zzwl)zzcbn.putIfAbsent(((Object) (class1)), obj)));
	//   27   52:aload_0         
	//   28   53:getfield        #25  <Field ConcurrentMap zzcbn>
	//   29   56:aload_1         
	//   30   57:aload_2         
	//   31   58:invokeinterface #71  <Method Object ConcurrentMap.putIfAbsent(Object, Object)>
	//   32   63:checkcast       #60  <Class zzwl>
	//   33   66:astore_1        
			if(class1 != null)
	//*  34   67:aload_1         
	//*  35   68:ifnull          73
				obj = ((Object) (class1));
	//   36   71:aload_1         
	//   37   72:astore_2        
		}
		return ((zzwl) (obj));
	//   38   73:aload_2         
	//   39   74:areturn         
	}

	private static final zzwh zzcbl = new zzwh();
	private final zzwm zzcbm = new zzvk();
	private final ConcurrentMap zzcbn = new ConcurrentHashMap();

	static 
	{
	//    0    0:new             #2   <Class zzwh>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzwh()>
	//    3    7:putstatic       #18  <Field zzwh zzcbl>
	//*   4   10:return          
	}
}
