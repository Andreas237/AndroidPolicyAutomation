// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzacq, zzaqw, zzaoj, zzakb

final class zzacw
	implements zzv
{

	zzacw(zzacq zzacq1, zzaqw zzaqw1, zzaoj zzaoj1)
	{
		zzcbs = zzacq1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field zzacq zzcbs>
		zzcbq = zzaqw1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field zzaqw zzcbq>
		zzcbr = zzaoj1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field zzaoj zzcbr>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #24  <Method void Object()>
	//   11   19:return          
	}

	public final void zza(Object obj, Map map)
	{
		obj = ((Object) ((String)map.get("success")));
	//    0    0:aload_2         
	//    1    1:ldc1            #31  <String "success">
	//    2    3:invokeinterface #37  <Method Object Map.get(Object)>
	//    3    8:checkcast       #39  <Class String>
	//    4   11:astore_1        
		map = ((Map) ((String)map.get("failure")));
	//    5   12:aload_2         
	//    6   13:ldc1            #41  <String "failure">
	//    7   15:invokeinterface #37  <Method Object Map.get(Object)>
	//    8   20:checkcast       #39  <Class String>
	//    9   23:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (map))))
			break MISSING_BLOCK_LABEL_45;
	//   10   24:aload_2         
	//   11   25:invokestatic    #47  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   12   28:ifne            45
		obj = ((Object) (new JSONObject(((String) (map)))));
	//   13   31:new             #49  <Class JSONObject>
	//   14   34:dup             
	//   15   35:aload_2         
	//   16   36:invokespecial   #52  <Method void JSONObject(String)>
	//   17   39:astore_1        
		boolean flag;
		flag = false;
	//   18   40:iconst_0        
	//   19   41:istore_3        
		break MISSING_BLOCK_LABEL_56;
	//   20   42:goto            56
		obj = ((Object) (new JSONObject(((String) (obj)))));
	//   21   45:new             #49  <Class JSONObject>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokespecial   #52  <Method void JSONObject(String)>
	//   25   53:astore_1        
		flag = true;
	//   26   54:iconst_1        
	//   27   55:istore_3        
		if(!zzacq.zza(zzcbs).equals(((Object) (((JSONObject) (obj)).optString("ads_id", "")))))
	//*  28   56:aload_0         
	//*  29   57:getfield        #17  <Field zzacq zzcbs>
	//*  30   60:invokestatic    #57  <Method String zzacq.zza(zzacq)>
	//*  31   63:aload_1         
	//*  32   64:ldc1            #59  <String "ads_id">
	//*  33   66:ldc1            #61  <String "">
	//*  34   68:invokevirtual   #65  <Method String JSONObject.optString(String, String)>
	//*  35   71:invokevirtual   #69  <Method boolean String.equals(Object)>
	//*  36   74:ifne            78
			return;
	//   37   77:return          
		try
		{
			zzcbq.zzb("/nativeAdPreProcess", ((zzv) (this)));
	//   38   78:aload_0         
	//   39   79:getfield        #19  <Field zzaqw zzcbq>
	//   40   82:ldc1            #71  <String "/nativeAdPreProcess">
	//   41   84:aload_0         
	//   42   85:invokeinterface #77  <Method void zzaqw.zzb(String, zzv)>
			map = ((Map) (new JSONObject()));
	//   43   90:new             #49  <Class JSONObject>
	//   44   93:dup             
	//   45   94:invokespecial   #78  <Method void JSONObject()>
	//   46   97:astore_2        
			((JSONObject) (map)).put("success", flag);
	//   47   98:aload_2         
	//   48   99:ldc1            #31  <String "success">
	//   49  101:iload_3         
	//   50  102:invokevirtual   #82  <Method JSONObject JSONObject.put(String, boolean)>
	//   51  105:pop             
			((JSONObject) (map)).put("json", obj);
	//   52  106:aload_2         
	//   53  107:ldc1            #84  <String "json">
	//   54  109:aload_1         
	//   55  110:invokevirtual   #87  <Method JSONObject JSONObject.put(String, Object)>
	//   56  113:pop             
			zzcbr.set(((Object) (map)));
	//   57  114:aload_0         
	//   58  115:getfield        #21  <Field zzaoj zzcbr>
	//   59  118:aload_2         
	//   60  119:invokevirtual   #93  <Method void zzaoj.set(Object)>
			return;
	//   61  122:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  62  123:astore_1        
		{
			zzakb.zzb("Error while preprocessing json.", ((Throwable) (obj)));
	//   63  124:ldc1            #95  <String "Error while preprocessing json.">
	//   64  126:aload_1         
	//   65  127:invokestatic    #100 <Method void zzakb.zzb(String, Throwable)>
		}
		zzcbr.setException(((Throwable) (obj)));
	//   66  130:aload_0         
	//   67  131:getfield        #21  <Field zzaoj zzcbr>
	//   68  134:aload_1         
	//   69  135:invokevirtual   #104 <Method void zzaoj.setException(Throwable)>
		return;
	//   70  138:return          
	}

	private final zzaqw zzcbq;
	private final zzaoj zzcbr;
	private final zzacq zzcbs;
}
