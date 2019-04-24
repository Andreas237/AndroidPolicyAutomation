// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.*;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpf, zzacm, zzakb

final class zzpk
	implements zzv
{

	zzpk(zzpf zzpf1, zzacm zzacm1)
	{
		zzbjj = zzpf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzpf zzbjj>
		zzbji = zzacm1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #17  <Field zzacm zzbji>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #20  <Method void Object()>
	//    8   14:return          
	}

	public final void zza(Object obj, Map map)
	{
		obj = ((Object) (new JSONObject()));
	//    0    0:new             #27  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void JSONObject()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((JSONObject) (obj)).put(s, map.get(((Object) (s)))))
	//*   4    8:aload_2         
	//*   5    9:invokeinterface #34  <Method Set Map.keySet()>
	//*   6   14:invokeinterface #40  <Method Iterator Set.iterator()>
	//*   7   19:astore_3        
	//*   8   20:aload_3         
	//*   9   21:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            58
			s = (String)iterator.next();
	//   11   29:aload_3         
	//   12   30:invokeinterface #50  <Method Object Iterator.next()>
	//   13   35:checkcast       #52  <Class String>
	//   14   38:astore          4

	//   15   40:aload_1         
	//   16   41:aload           4
	//   17   43:aload_2         
	//   18   44:aload           4
	//   19   46:invokeinterface #56  <Method Object Map.get(Object)>
	//   20   51:invokevirtual   #60  <Method JSONObject JSONObject.put(String, Object)>
	//   21   54:pop             
	//*  22   55:goto            20
		try
		{
			((JSONObject) (obj)).put("id", ((Object) (zzpf.zzb(zzbjj))));
	//   23   58:aload_1         
	//   24   59:ldc1            #62  <String "id">
	//   25   61:aload_0         
	//   26   62:getfield        #15  <Field zzpf zzbjj>
	//   27   65:invokestatic    #68  <Method String zzpf.zzb(zzpf)>
	//   28   68:invokevirtual   #60  <Method JSONObject JSONObject.put(String, Object)>
	//   29   71:pop             
			zzbji.zza("sendMessageToNativeJs", ((JSONObject) (obj)));
	//   30   72:aload_0         
	//   31   73:getfield        #17  <Field zzacm zzbji>
	//   32   76:ldc1            #70  <String "sendMessageToNativeJs">
	//   33   78:aload_1         
	//   34   79:invokeinterface #75  <Method void zzacm.zza(String, JSONObject)>
			return;
	//   35   84:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  36   85:astore_1        
		{
			zzakb.zzb("Unable to dispatch sendMessageToNativeJs event", ((Throwable) (obj)));
	//   37   86:ldc1            #77  <String "Unable to dispatch sendMessageToNativeJs event">
	//   38   88:aload_1         
	//   39   89:invokestatic    #82  <Method void zzakb.zzb(String, Throwable)>
		}
		return;
	//   40   92:return          
	}

	private final zzacm zzbji;
	private final zzpf zzbjj;
}
