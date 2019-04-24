// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanj, zzasi, zzhs, zzarc, 
//			zzaoi, zzaqw, zzarf, zzasc, 
//			zzci, zzang, zzanz

final class zzard
	implements zzanj
{

	zzard(Context context, zzci zzci, zzang zzang, zzw zzw, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		zzdck = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field Context zzdck>
		zzbqd = zzci;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field zzci zzbqd>
		zzdcl = zzang;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #27  <Field zzang zzdcl>
		zzdcm = zzw;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #29  <Field zzw zzdcm>
		zzdcn = s;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #31  <Field String zzdcn>
	//   17   31:return          
	}

	public final zzanz zzc(Object obj)
	{
		Object obj1 = ((Object) (zzdck));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Context zzdck>
	//    2    4:astore_2        
		Object obj2 = ((Object) (zzbqd));
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field zzci zzbqd>
	//    5    9:astore_3        
		zzang zzang = zzdcl;
	//    6   10:aload_0         
	//    7   11:getfield        #27  <Field zzang zzdcl>
	//    8   14:astore          4
		zzw zzw = zzdcm;
	//    9   16:aload_0         
	//   10   17:getfield        #29  <Field zzw zzdcm>
	//   11   20:astore          5
		obj = ((Object) (zzdcn));
	//   12   22:aload_0         
	//   13   23:getfield        #31  <Field String zzdcn>
	//   14   26:astore_1        
		zzbv.zzel();
	//   15   27:invokestatic    #40  <Method zzarc zzbv.zzel()>
	//   16   30:pop             
		obj1 = ((Object) (zzarc.zza(((Context) (obj1)), zzasi.zzvq(), "", false, false, ((zzci) (obj2)), zzang, ((zznx) (null)), ((com.google.android.gms.ads.internal.zzbo) (null)), zzw, zzhs.zzhm())));
	//   17   31:aload_2         
	//   18   32:invokestatic    #46  <Method zzasi zzasi.zzvq()>
	//   19   35:ldc1            #48  <String "">
	//   20   37:iconst_0        
	//   21   38:iconst_0        
	//   22   39:aload_3         
	//   23   40:aload           4
	//   24   42:aconst_null     
	//   25   43:aconst_null     
	//   26   44:aload           5
	//   27   46:invokestatic    #54  <Method zzhs zzhs.zzhm()>
	//   28   49:invokestatic    #60  <Method zzaqw zzarc.zza(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, com.google.android.gms.ads.internal.zzbo, zzw, zzhs)>
	//   29   52:astore_2        
		obj2 = ((Object) (zzaoi.zzj(obj1)));
	//   30   53:aload_2         
	//   31   54:invokestatic    #66  <Method zzaoi zzaoi.zzj(Object)>
	//   32   57:astore_3        
		((zzaqw) (obj1)).zzuf().zza(((zzasd) (new zzarf(((zzaoi) (obj2))))));
	//   33   58:aload_2         
	//   34   59:invokeinterface #72  <Method zzasc zzaqw.zzuf()>
	//   35   64:new             #74  <Class zzarf>
	//   36   67:dup             
	//   37   68:aload_3         
	//   38   69:invokespecial   #77  <Method void zzarf(zzaoi)>
	//   39   72:invokeinterface #82  <Method void zzasc.zza(zzasd)>
		((zzaqw) (obj1)).loadUrl(((String) (obj)));
	//   40   77:aload_2         
	//   41   78:aload_1         
	//   42   79:invokeinterface #86  <Method void zzaqw.loadUrl(String)>
		return ((zzanz) (obj2));
	//   43   84:aload_3         
	//   44   85:areturn         
	}

	private final zzci zzbqd;
	private final Context zzdck;
	private final zzang zzdcl;
	private final zzw zzdcm;
	private final String zzdcn;
}
