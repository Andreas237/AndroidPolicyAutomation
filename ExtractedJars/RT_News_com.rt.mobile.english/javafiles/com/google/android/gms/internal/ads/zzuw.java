// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.ads.internal.zzw;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzuo, zzuu, zzarg, zzasi, 
//			zzhs, zzarc, zzaqw, zzkb, 
//			zzamu, zzakk, zzuz, zzasc, 
//			zzvd, zzup, zzuy, zzva, 
//			zzvb, zzvc, zzux, zzwd, 
//			zzang, zzci, zzuv, zzwc

public final class zzuw
	implements zzuo, zzuu
{

	public zzuw(Context context, zzang zzang, zzci zzci, zzw zzw)
		throws zzarg
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field Context mContext>
		zzbv.zzel();
	//    5    9:invokestatic    #30  <Method zzarc zzbv.zzel()>
	//    6   12:pop             
		zzbnd = zzarc.zza(context, zzasi.zzvq(), "", false, false, zzci, zzang, ((zznx) (null)), ((com.google.android.gms.ads.internal.zzbo) (null)), ((zzw) (null)), zzhs.zzhm());
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #36  <Method zzasi zzasi.zzvq()>
	//   10   18:ldc1            #38  <String "">
	//   11   20:iconst_0        
	//   12   21:iconst_0        
	//   13   22:aload_3         
	//   14   23:aload_2         
	//   15   24:aconst_null     
	//   16   25:aconst_null     
	//   17   26:aconst_null     
	//   18   27:invokestatic    #44  <Method zzhs zzhs.zzhm()>
	//   19   30:invokestatic    #50  <Method zzaqw zzarc.zza(Context, zzasi, String, boolean, boolean, zzci, zzang, zznx, com.google.android.gms.ads.internal.zzbo, zzw, zzhs)>
	//   20   33:putfield        #52  <Field zzaqw zzbnd>
		zzbnd.getView().setWillNotDraw(true);
	//   21   36:aload_0         
	//   22   37:getfield        #52  <Field zzaqw zzbnd>
	//   23   40:invokeinterface #58  <Method View zzaqw.getView()>
	//   24   45:iconst_1        
	//   25   46:invokevirtual   #64  <Method void View.setWillNotDraw(boolean)>
	//   26   49:return          
	}

	private static void runOnUiThread(Runnable runnable)
	{
		zzkb.zzif();
	//    0    0:invokestatic    #75  <Method zzamu zzkb.zzif()>
	//    1    3:pop             
		if(zzamu.zzsh())
	//*   2    4:invokestatic    #81  <Method boolean zzamu.zzsh()>
	//*   3    7:ifeq            17
		{
			runnable.run();
	//    4   10:aload_0         
	//    5   11:invokeinterface #86  <Method void Runnable.run()>
			return;
	//    6   16:return          
		} else
		{
			zzakk.zzcrm.post(runnable);
	//    7   17:getstatic       #92  <Field Handler zzakk.zzcrm>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #98  <Method boolean Handler.post(Runnable)>
	//   10   24:pop             
			return;
	//   11   25:return          
		}
	}

	static zzaqw zza(zzuw zzuw1)
	{
		return zzuw1.zzbnd;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzaqw zzbnd>
	//    2    4:areturn         
	}

	public final void destroy()
	{
		zzbnd.destroy();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzaqw zzbnd>
	//    2    4:invokeinterface #102 <Method void zzaqw.destroy()>
	//    3    9:return          
	}

	public final void zza(zzuv zzuv)
	{
		zzasc zzasc1 = zzbnd.zzuf();
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzaqw zzbnd>
	//    2    4:invokeinterface #107 <Method zzasc zzaqw.zzuf()>
	//    3    9:astore_2        
		((Object) (zzuv)).getClass();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #111 <Method Class Object.getClass()>
	//    6   14:pop             
		zzasc1.zza(zzuz.zzb(zzuv));
	//    7   15:aload_2         
	//    8   16:aload_1         
	//    9   17:invokestatic    #117 <Method zzase zzuz.zzb(zzuv)>
	//   10   20:invokeinterface #122 <Method void zzasc.zza(zzase)>
	//   11   25:return          
	}

	public final void zza(String s, zzv zzv)
	{
		zzbnd.zza(s, ((zzv) (new zzvd(this, zzv))));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzaqw zzbnd>
	//    2    4:aload_1         
	//    3    5:new             #125 <Class zzvd>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokespecial   #128 <Method void zzvd(zzuw, zzv)>
	//    8   14:invokeinterface #130 <Method void zzaqw.zza(String, zzv)>
	//    9   19:return          
	}

	public final void zza(String s, Map map)
	{
		zzup.zza(((zzuo) (this)), s, map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #138 <Method void zzup.zza(zzuo, String, Map)>
	//    4    6:return          
	}

	public final void zza(String s, JSONObject jsonobject)
	{
		zzup.zzb(((zzuo) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #142 <Method void zzup.zzb(zzuo, String, JSONObject)>
	//    4    6:return          
	}

	public final void zzb(String s, zzv zzv)
	{
		zzbnd.zza(s, ((com.google.android.gms.common.util.Predicate) (new zzuy(zzv))));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzaqw zzbnd>
	//    2    4:aload_1         
	//    3    5:new             #144 <Class zzuy>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokespecial   #147 <Method void zzuy(zzv)>
	//    7   13:invokeinterface #150 <Method void zzaqw.zza(String, com.google.android.gms.common.util.Predicate)>
	//    8   18:return          
	}

	public final void zzb(String s, JSONObject jsonobject)
	{
		zzup.zza(((zzuo) (this)), s, jsonobject);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #152 <Method void zzup.zza(zzuo, String, JSONObject)>
	//    4    6:return          
	}

	public final void zzbb(String s)
	{
		runOnUiThread(((Runnable) (new zzva(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[] {
			s
		})))));
	//    0    0:new             #156 <Class zzva>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #158 <String "<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>">
	//    4    7:iconst_1        
	//    5    8:anewarray       Object[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_1         
	//    9   14:aastore         
	//   10   15:invokestatic    #164 <Method String String.format(String, Object[])>
	//   11   18:invokespecial   #167 <Method void zzva(zzuw, String)>
	//   12   21:invokestatic    #169 <Method void runOnUiThread(Runnable)>
	//   13   24:return          
	}

	public final void zzbc(String s)
	{
		runOnUiThread(((Runnable) (new zzvb(this, s))));
	//    0    0:new             #172 <Class zzvb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #173 <Method void zzvb(zzuw, String)>
	//    5    9:invokestatic    #169 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	public final void zzbd(String s)
	{
		runOnUiThread(((Runnable) (new zzvc(this, s))));
	//    0    0:new             #176 <Class zzvc>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #177 <Method void zzvc(zzuw, String)>
	//    5    9:invokestatic    #169 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	public final void zzbe(String s)
	{
		runOnUiThread(((Runnable) (new zzux(this, s))));
	//    0    0:new             #180 <Class zzux>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #181 <Method void zzux(zzuw, String)>
	//    5    9:invokestatic    #169 <Method void runOnUiThread(Runnable)>
	//    6   12:return          
	}

	final void zzbi(String s)
	{
		zzbnd.zzbe(s);
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field zzaqw zzbnd>
	//    2    4:aload_1         
	//    3    5:invokeinterface #184 <Method void zzaqw.zzbe(String)>
	//    4   10:return          
	}

	public final void zzf(String s, String s1)
	{
		zzup.zza(((zzuo) (this)), s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #189 <Method void zzup.zza(zzuo, String, String)>
	//    4    6:return          
	}

	public final zzwc zzlw()
	{
		return ((zzwc) (new zzwd(((zzwb) (this)))));
	//    0    0:new             #193 <Class zzwd>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #196 <Method void zzwd(zzwb)>
	//    4    8:areturn         
	}

	private final Context mContext;
	private final zzaqw zzbnd;
}
