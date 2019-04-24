// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzasd, zzpg, zzpf, zzacm, 
//			zzakb

final class zzph
	implements zzasd
{

	zzph(zzpg zzpg1, Map map, zzacm zzacm1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		zzbjk = zzpg1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field zzpg zzbjk>
		zzbjl = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Map zzbjl>
		zzbjm = zzacm1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #23  <Field zzacm zzbjm>
	//   11   19:return          
	}

	public final void zze(boolean flag)
	{
		zzpg zzpg1 = zzbjk;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field zzpg zzbjk>
	//    2    4:astore_2        
		Object obj = ((Object) (zzbjl));
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field Map zzbjl>
	//    5    9:astore          4
		zzacm zzacm1 = zzbjm;
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field zzacm zzbjm>
	//    8   15:astore_3        
		zzpf.zza(zzpg1.zzbjj, (String)((Map) (obj)).get("id"));
	//    9   16:aload_2         
	//   10   17:getfield        #34  <Field zzpf zzpg.zzbjj>
	//   11   20:aload           4
	//   12   22:ldc1            #36  <String "id">
	//   13   24:invokeinterface #42  <Method Object Map.get(Object)>
	//   14   29:checkcast       #44  <Class String>
	//   15   32:invokestatic    #50  <Method String zzpf.zza(zzpf, String)>
	//   16   35:pop             
		obj = ((Object) (new JSONObject()));
	//   17   36:new             #52  <Class JSONObject>
	//   18   39:dup             
	//   19   40:invokespecial   #53  <Method void JSONObject()>
	//   20   43:astore          4
		try
		{
			((JSONObject) (obj)).put("messageType", "htmlLoaded");
	//   21   45:aload           4
	//   22   47:ldc1            #55  <String "messageType">
	//   23   49:ldc1            #57  <String "htmlLoaded">
	//   24   51:invokevirtual   #61  <Method JSONObject JSONObject.put(String, Object)>
	//   25   54:pop             
			((JSONObject) (obj)).put("id", ((Object) (zzpf.zzb(zzpg1.zzbjj))));
	//   26   55:aload           4
	//   27   57:ldc1            #36  <String "id">
	//   28   59:aload_2         
	//   29   60:getfield        #34  <Field zzpf zzpg.zzbjj>
	//   30   63:invokestatic    #65  <Method String zzpf.zzb(zzpf)>
	//   31   66:invokevirtual   #61  <Method JSONObject JSONObject.put(String, Object)>
	//   32   69:pop             
			zzacm1.zza("sendMessageToNativeJs", ((JSONObject) (obj)));
	//   33   70:aload_3         
	//   34   71:ldc1            #67  <String "sendMessageToNativeJs">
	//   35   73:aload           4
	//   36   75:invokeinterface #72  <Method void zzacm.zza(String, JSONObject)>
			return;
	//   37   80:return          
		}
		catch(JSONException jsonexception)
	//*  38   81:astore_2        
		{
			zzakb.zzb("Unable to dispatch sendMessageToNativeJs event", ((Throwable) (jsonexception)));
	//   39   82:ldc1            #74  <String "Unable to dispatch sendMessageToNativeJs event">
	//   40   84:aload_2         
	//   41   85:invokestatic    #79  <Method void zzakb.zzb(String, Throwable)>
		}
	//   42   88:return          
	}

	private final zzpg zzbjk;
	private final Map zzbjl;
	private final zzacm zzbjm;
}
