// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.gmsg.zzv;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzpf, zzaqw, zzacm, zzph, 
//			zzasc

final class zzpg
	implements zzv
{

	zzpg(zzpf zzpf1, zzacm zzacm1)
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
		obj = ((Object) ((zzaqw)zzpf.zza(zzbjj).get()));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field zzpf zzbjj>
	//    2    4:invokestatic    #28  <Method WeakReference zzpf.zza(zzpf)>
	//    3    7:invokevirtual   #34  <Method Object WeakReference.get()>
	//    4   10:checkcast       #36  <Class zzaqw>
	//    5   13:astore_1        
		if(obj == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       31
		{
			zzbji.zzb("/loadHtml", ((zzv) (this)));
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field zzacm zzbji>
	//   10   22:ldc1            #38  <String "/loadHtml">
	//   11   24:aload_0         
	//   12   25:invokeinterface #44  <Method void zzacm.zzb(String, zzv)>
			return;
	//   13   30:return          
		}
		((zzaqw) (obj)).zzuf().zza(((zzasd) (new zzph(this, map, zzbji))));
	//   14   31:aload_1         
	//   15   32:invokeinterface #48  <Method zzasc zzaqw.zzuf()>
	//   16   37:new             #50  <Class zzph>
	//   17   40:dup             
	//   18   41:aload_0         
	//   19   42:aload_2         
	//   20   43:aload_0         
	//   21   44:getfield        #17  <Field zzacm zzbji>
	//   22   47:invokespecial   #53  <Method void zzph(zzpg, Map, zzacm)>
	//   23   50:invokeinterface #58  <Method void zzasc.zza(zzasd)>
		String s = (String)map.get("overlayHtml");
	//   24   55:aload_2         
	//   25   56:ldc1            #60  <String "overlayHtml">
	//   26   58:invokeinterface #65  <Method Object Map.get(Object)>
	//   27   63:checkcast       #67  <Class String>
	//   28   66:astore_3        
		map = ((Map) ((String)map.get("baseUrl")));
	//   29   67:aload_2         
	//   30   68:ldc1            #69  <String "baseUrl">
	//   31   70:invokeinterface #65  <Method Object Map.get(Object)>
	//   32   75:checkcast       #67  <Class String>
	//   33   78:astore_2        
		if(TextUtils.isEmpty(((CharSequence) (map))))
	//*  34   79:aload_2         
	//*  35   80:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  36   83:ifeq            98
		{
			((zzaqw) (obj)).loadData(s, "text/html", "UTF-8");
	//   37   86:aload_1         
	//   38   87:aload_3         
	//   39   88:ldc1            #77  <String "text/html">
	//   40   90:ldc1            #79  <String "UTF-8">
	//   41   92:invokeinterface #83  <Method void zzaqw.loadData(String, String, String)>
			return;
	//   42   97:return          
		} else
		{
			((zzaqw) (obj)).loadDataWithBaseURL(((String) (map)), s, "text/html", "UTF-8", ((String) (null)));
	//   43   98:aload_1         
	//   44   99:aload_2         
	//   45  100:aload_3         
	//   46  101:ldc1            #77  <String "text/html">
	//   47  103:ldc1            #79  <String "UTF-8">
	//   48  105:aconst_null     
	//   49  106:invokeinterface #87  <Method void zzaqw.loadDataWithBaseURL(String, String, String, String, String)>
			return;
	//   50  111:return          
		}
	}

	private final zzacm zzbji;
	final zzpf zzbjj;
}
