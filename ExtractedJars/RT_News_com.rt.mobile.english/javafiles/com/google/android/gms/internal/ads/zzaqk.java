// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaqh

final class zzaqk
	implements Runnable
{

	zzaqk(zzaqh zzaqh1, String s, String s1, String s2, String s3)
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
		zzdbf = s2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #23  <Field String zzdbf>
		val$message = s3;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #25  <Field String val$message>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #28  <Method void Object()>
	//   17   31:return          
	}

	public final void run()
	{
		HashMap hashmap = new HashMap();
	//    0    0:new             #32  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void HashMap()>
	//    3    7:astore_1        
		((Map) (hashmap)).put("event", "precacheCanceled");
	//    4    8:aload_1         
	//    5    9:ldc1            #35  <String "event">
	//    6   11:ldc1            #37  <String "precacheCanceled">
	//    7   13:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//    8   18:pop             
		((Map) (hashmap)).put("src", ((Object) (zzcce)));
	//    9   19:aload_1         
	//   10   20:ldc1            #45  <String "src">
	//   11   22:aload_0         
	//   12   23:getfield        #19  <Field String zzcce>
	//   13   26:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//   14   31:pop             
		if(!TextUtils.isEmpty(((CharSequence) (zzdba))))
	//*  15   32:aload_0         
	//*  16   33:getfield        #21  <Field String zzdba>
	//*  17   36:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   39:ifne            55
			((Map) (hashmap)).put("cachedSrc", ((Object) (zzdba)));
	//   19   42:aload_1         
	//   20   43:ldc1            #53  <String "cachedSrc">
	//   21   45:aload_0         
	//   22   46:getfield        #21  <Field String zzdba>
	//   23   49:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//   24   54:pop             
		((Map) (hashmap)).put("type", ((Object) (zzaqh.zza(zzdbe, zzdbf))));
	//   25   55:aload_1         
	//   26   56:ldc1            #55  <String "type">
	//   27   58:aload_0         
	//   28   59:getfield        #17  <Field zzaqh zzdbe>
	//   29   62:aload_0         
	//   30   63:getfield        #23  <Field String zzdbf>
	//   31   66:invokestatic    #61  <Method String zzaqh.zza(zzaqh, String)>
	//   32   69:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//   33   74:pop             
		((Map) (hashmap)).put("reason", ((Object) (zzdbf)));
	//   34   75:aload_1         
	//   35   76:ldc1            #63  <String "reason">
	//   36   78:aload_0         
	//   37   79:getfield        #23  <Field String zzdbf>
	//   38   82:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//   39   87:pop             
		if(!TextUtils.isEmpty(((CharSequence) (val$message))))
	//*  40   88:aload_0         
	//*  41   89:getfield        #25  <Field String val$message>
	//*  42   92:invokestatic    #51  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  43   95:ifne            111
			((Map) (hashmap)).put("message", ((Object) (val$message)));
	//   44   98:aload_1         
	//   45   99:ldc1            #65  <String "message">
	//   46  101:aload_0         
	//   47  102:getfield        #25  <Field String val$message>
	//   48  105:invokeinterface #43  <Method Object Map.put(Object, Object)>
	//   49  110:pop             
		zzaqh.zza(zzdbe, "onPrecacheEvent", ((Map) (hashmap)));
	//   50  111:aload_0         
	//   51  112:getfield        #17  <Field zzaqh zzdbe>
	//   52  115:ldc1            #67  <String "onPrecacheEvent">
	//   53  117:aload_1         
	//   54  118:invokestatic    #70  <Method void zzaqh.zza(zzaqh, String, Map)>
	//   55  121:return          
	}

	private final String val$message;
	private final String zzcce;
	private final String zzdba;
	private final zzaqh zzdbe;
	private final String zzdbf;
}
