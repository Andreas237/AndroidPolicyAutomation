// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqh

final class zzaqj
	implements Runnable
{

	zzaqj(zzaqh zzaqh1, String s, String s1, int i)
	{
		zzdbe = zzaqh1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzaqh zzdbe>
		zzcce = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String zzcce>
		zzdba = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field String zzdba>
		zzdbc = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #23  <Field int zzdbc>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #26  <Method void Object()>
	//   14   25:return          
	}

	public final void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #30  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("event", "precacheComplete");
	//    4    8:aload_1         
	//    5    9:ldc1            #33  <String "event">
	//    6   11:ldc1            #35  <String "precacheComplete">
	//    7   13:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("src", ((Object) (zzcce)));
	//    9   19:aload_1         
	//   10   20:ldc1            #43  <String "src">
	//   11   22:aload_0         
	//   12   23:getfield        #19  <Field String zzcce>
	//   13   26:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//   14   31:pop             
		((Map) (hashmap)).put("cachedSrc", ((Object) (zzdba)));
	//   15   32:aload_1         
	//   16   33:ldc1            #45  <String "cachedSrc">
	//   17   35:aload_0         
	//   18   36:getfield        #21  <Field String zzdba>
	//   19   39:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//   20   44:pop             
		((Map) (hashmap)).put("totalBytes", ((Object) (Integer.toString(zzdbc))));
	//   21   45:aload_1         
	//   22   46:ldc1            #47  <String "totalBytes">
	//   23   48:aload_0         
	//   24   49:getfield        #23  <Field int zzdbc>
	//   25   52:invokestatic    #53  <Method String Integer.toString(int)>
	//   26   55:invokeinterface #41  <Method Object Map.put(Object, Object)>
	//   27   60:pop             
		zzaqh.zza(zzdbe, "onPrecacheEvent", ((Map) (hashmap)));
	//   28   61:aload_0         
	//   29   62:getfield        #17  <Field zzaqh zzdbe>
	//   30   65:ldc1            #55  <String "onPrecacheEvent">
	//   31   67:aload_1         
	//   32   68:invokestatic    #61  <Method void zzaqh.zza(zzaqh, String, Map)>
	//   33   71:return          
	}

	private final String zzcce;
	private final String zzdba;
	private final int zzdbc;
	private final zzaqh zzdbe;
}
