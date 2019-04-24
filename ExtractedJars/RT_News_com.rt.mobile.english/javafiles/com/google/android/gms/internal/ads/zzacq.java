// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.gmsg.zzab;
import com.google.android.gms.ads.internal.gmsg.zzv;
import com.google.android.gms.ads.internal.*;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzacm, zzakb, zznk, zzkb, 
//			zzni, zzarc, zzpe, zzacr, 
//			zzaoe, zzano, zzanm, zzaqw, 
//			zzacx, zzacz, zzacy, zzaoj, 
//			zzacw, zzasc, zzacs, zzact, 
//			zzacu, zzacv, zzada, zzci, 
//			zzanz, zzang

public final class zzacq
	implements zzacm
{

	public zzacq(Context context, zzbc zzbc, String s, zzci zzci, zzang zzang)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		zzakb.zzdj("Webview loading for native ads.");
	//    2    4:ldc1            #32  <String "Webview loading for native ads.">
	//    3    6:invokestatic    #38  <Method void zzakb.zzdj(String)>
		mContext = context;
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:putfield        #40  <Field Context mContext>
		zzcbc = zzbc;
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:putfield        #42  <Field zzbc zzcbc>
		zzbjc = zzci;
	//   10   19:aload_0         
	//   11   20:aload           4
	//   12   22:putfield        #44  <Field zzci zzbjc>
		zzzw = zzang;
	//   13   25:aload_0         
	//   14   26:aload           5
	//   15   28:putfield        #46  <Field zzang zzzw>
		zzaae = s;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #48  <Field String zzaae>
		zzbv.zzel();
	//   19   36:invokestatic    #54  <Method zzarc zzbv.zzel()>
	//   20   39:pop             
		context = mContext;
	//   21   40:aload_0         
	//   22   41:getfield        #40  <Field Context mContext>
	//   23   44:astore_1        
		zzci = ((zzci) (zzzw));
	//   24   45:aload_0         
	//   25   46:getfield        #46  <Field zzang zzzw>
	//   26   49:astore          4
		zzang = ((zzang) (zznk.zzbbp));
	//   27   51:getstatic       #60  <Field zzna zznk.zzbbp>
	//   28   54:astore          5
		context = ((Context) (com.google.android.gms.internal.ads.zzarc.zza(context, ((zzang) (zzci)), (String)zzkb.zzik().zzd(((zzna) (zzang))), zzbjc, ((zza) (zzcbc)).zzbi())));
	//   29   56:aload_1         
	//   30   57:aload           4
	//   31   59:invokestatic    #66  <Method zzni zzkb.zzik()>
	//   32   62:aload           5
	//   33   64:invokevirtual   #72  <Method Object zzni.zzd(zzna)>
	//   34   67:checkcast       #74  <Class String>
	//   35   70:aload_0         
	//   36   71:getfield        #44  <Field zzci zzbjc>
	//   37   74:aload_0         
	//   38   75:getfield        #42  <Field zzbc zzcbc>
	//   39   78:invokevirtual   #80  <Method com.google.android.gms.ads.internal.zzw zza.zzbi()>
	//   40   81:invokestatic    #86  <Method zzanz com.google.android.gms.internal.ads.zzarc.zza(Context, zzang, String, zzci, com.google.android.gms.ads.internal.zzw)>
	//   41   84:astore_1        
		zzcbn = new zzab(mContext);
	//   42   85:aload_0         
	//   43   86:new             #88  <Class zzab>
	//   44   89:dup             
	//   45   90:aload_0         
	//   46   91:getfield        #40  <Field Context mContext>
	//   47   94:invokespecial   #91  <Method void zzab(Context)>
	//   48   97:putfield        #93  <Field zzab zzcbn>
		zzcbo = new zzpe(((zzpa) (zzbc)), s);
	//   49  100:aload_0         
	//   50  101:new             #95  <Class zzpe>
	//   51  104:dup             
	//   52  105:aload_2         
	//   53  106:aload_3         
	//   54  107:invokespecial   #98  <Method void zzpe(zzpa, String)>
	//   55  110:putfield        #100 <Field zzpe zzcbo>
		zzcbm = com.google.android.gms.internal.ads.zzano.zza(((zzanz) (context)), ((zzanj) (new zzacr(this))), zzaoe.zzcvz);
	//   56  113:aload_0         
	//   57  114:aload_1         
	//   58  115:new             #102 <Class zzacr>
	//   59  118:dup             
	//   60  119:aload_0         
	//   61  120:invokespecial   #105 <Method void zzacr(zzacq)>
	//   62  123:getstatic       #111 <Field java.util.concurrent.Executor zzaoe.zzcvz>
	//   63  126:invokestatic    #116 <Method zzanz com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanj, java.util.concurrent.Executor)>
	//   64  129:putfield        #118 <Field zzanz zzcbm>
		com.google.android.gms.internal.ads.zzanm.zza(zzcbm, "WebViewNativeAdsUtil.constructor");
	//   65  132:aload_0         
	//   66  133:getfield        #118 <Field zzanz zzcbm>
	//   67  136:ldc1            #120 <String "WebViewNativeAdsUtil.constructor">
	//   68  138:invokestatic    #125 <Method void com.google.android.gms.internal.ads.zzanm.zza(zzanz, String)>
	//   69  141:return          
	}

	static String zza(zzacq zzacq1)
	{
		return zzacq1.zzaae;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String zzaae>
	//    2    4:areturn         
	}

	final zzanz zza(JSONObject jsonobject, zzaqw zzaqw1)
		throws Exception
	{
		jsonobject.put("ads_id", ((Object) (zzaae)));
	//    0    0:aload_1         
	//    1    1:ldc1            #132 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #48  <Field String zzaae>
	//    4    7:invokevirtual   #138 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		zzaqw1.zzb("google.afma.nativeAds.handleDownloadedImpressionPing", jsonobject);
	//    6   11:aload_2         
	//    7   12:ldc1            #140 <String "google.afma.nativeAds.handleDownloadedImpressionPing">
	//    8   14:aload_1         
	//    9   15:invokeinterface #146 <Method void zzaqw.zzb(String, JSONObject)>
		return ((zzanz) (zzano.zzi(((Object) (new JSONObject())))));
	//   10   20:new             #134 <Class JSONObject>
	//   11   23:dup             
	//   12   24:invokespecial   #147 <Method void JSONObject()>
	//   13   27:invokestatic    #151 <Method zzany zzano.zzi(Object)>
	//   14   30:areturn         
	}

	public final void zza(String s, zzv zzv)
	{
		com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanl) (new zzacx(this, s, zzv))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #155 <Class zzacx>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #158 <Method void zzacx(zzacq, String, zzv)>
	//    8   14:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    9   17:invokestatic    #164 <Method void com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanl, java.util.concurrent.Executor)>
	//   10   20:return          
	}

	public final void zza(String s, JSONObject jsonobject)
	{
		com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanl) (new zzacz(this, s, jsonobject))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #168 <Class zzacz>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #171 <Method void zzacz(zzacq, String, JSONObject)>
	//    8   14:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    9   17:invokestatic    #164 <Method void com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanl, java.util.concurrent.Executor)>
	//   10   20:return          
	}

	final zzanz zzb(JSONObject jsonobject, zzaqw zzaqw1)
		throws Exception
	{
		jsonobject.put("ads_id", ((Object) (zzaae)));
	//    0    0:aload_1         
	//    1    1:ldc1            #132 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #48  <Field String zzaae>
	//    4    7:invokevirtual   #138 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		zzaqw1.zzb("google.afma.nativeAds.handleImpressionPing", jsonobject);
	//    6   11:aload_2         
	//    7   12:ldc1            #173 <String "google.afma.nativeAds.handleImpressionPing">
	//    8   14:aload_1         
	//    9   15:invokeinterface #146 <Method void zzaqw.zzb(String, JSONObject)>
		return ((zzanz) (zzano.zzi(((Object) (new JSONObject())))));
	//   10   20:new             #134 <Class JSONObject>
	//   11   23:dup             
	//   12   24:invokespecial   #147 <Method void JSONObject()>
	//   13   27:invokestatic    #151 <Method zzany zzano.zzi(Object)>
	//   14   30:areturn         
	}

	public final void zzb(String s, zzv zzv)
	{
		com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanl) (new zzacy(this, s, zzv))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #175 <Class zzacy>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #176 <Method void zzacy(zzacq, String, zzv)>
	//    8   14:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    9   17:invokestatic    #164 <Method void com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanl, java.util.concurrent.Executor)>
	//   10   20:return          
	}

	final zzanz zzc(JSONObject jsonobject, zzaqw zzaqw1)
		throws Exception
	{
		jsonobject.put("ads_id", ((Object) (zzaae)));
	//    0    0:aload_1         
	//    1    1:ldc1            #132 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #48  <Field String zzaae>
	//    4    7:invokevirtual   #138 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		zzaqw1.zzb("google.afma.nativeAds.handleClickGmsg", jsonobject);
	//    6   11:aload_2         
	//    7   12:ldc1            #179 <String "google.afma.nativeAds.handleClickGmsg">
	//    8   14:aload_1         
	//    9   15:invokeinterface #146 <Method void zzaqw.zzb(String, JSONObject)>
		return ((zzanz) (zzano.zzi(((Object) (new JSONObject())))));
	//   10   20:new             #134 <Class JSONObject>
	//   11   23:dup             
	//   12   24:invokespecial   #147 <Method void JSONObject()>
	//   13   27:invokestatic    #151 <Method zzany zzano.zzi(Object)>
	//   14   30:areturn         
	}

	final zzanz zzd(JSONObject jsonobject, zzaqw zzaqw1)
		throws Exception
	{
		jsonobject.put("ads_id", ((Object) (zzaae)));
	//    0    0:aload_1         
	//    1    1:ldc1            #132 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #48  <Field String zzaae>
	//    4    7:invokevirtual   #138 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		zzaoj zzaoj1 = new zzaoj();
	//    6   11:new             #181 <Class zzaoj>
	//    7   14:dup             
	//    8   15:invokespecial   #182 <Method void zzaoj()>
	//    9   18:astore_3        
		zzaqw1.zza("/nativeAdPreProcess", ((zzv) (new zzacw(this, zzaqw1, zzaoj1))));
	//   10   19:aload_2         
	//   11   20:ldc1            #184 <String "/nativeAdPreProcess">
	//   12   22:new             #186 <Class zzacw>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:invokespecial   #189 <Method void zzacw(zzacq, zzaqw, zzaoj)>
	//   18   32:invokeinterface #191 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, zzv)>
		zzaqw1.zzb("google.afma.nativeAds.preProcessJsonGmsg", jsonobject);
	//   19   37:aload_2         
	//   20   38:ldc1            #193 <String "google.afma.nativeAds.preProcessJsonGmsg">
	//   21   40:aload_1         
	//   22   41:invokeinterface #146 <Method void zzaqw.zzb(String, JSONObject)>
		return ((zzanz) (zzaoj1));
	//   23   46:aload_3         
	//   24   47:areturn         
	}

	final zzanz zzh(zzaqw zzaqw1)
		throws Exception
	{
		zzakb.zzdj("Javascript has loaded for native ads.");
	//    0    0:ldc1            #197 <String "Javascript has loaded for native ads.">
	//    1    2:invokestatic    #38  <Method void zzakb.zzdj(String)>
		zzaqw1.zzuf().zza(((zzjd) (zzcbc)), ((com.google.android.gms.ads.internal.gmsg.zzb) (zzcbc)), ((com.google.android.gms.ads.internal.overlay.zzn) (zzcbc)), ((com.google.android.gms.ads.internal.gmsg.zzd) (zzcbc)), ((com.google.android.gms.ads.internal.overlay.zzt) (zzcbc)), false, ((com.google.android.gms.ads.internal.gmsg.zzz) (null)), new zzx(mContext, ((zzait) (null)), ((zzael) (null))), ((zzaam) (null)), ((zzait) (null)));
	//    2    5:aload_1         
	//    3    6:invokeinterface #201 <Method zzasc zzaqw.zzuf()>
	//    4   11:aload_0         
	//    5   12:getfield        #42  <Field zzbc zzcbc>
	//    6   15:aload_0         
	//    7   16:getfield        #42  <Field zzbc zzcbc>
	//    8   19:aload_0         
	//    9   20:getfield        #42  <Field zzbc zzcbc>
	//   10   23:aload_0         
	//   11   24:getfield        #42  <Field zzbc zzcbc>
	//   12   27:aload_0         
	//   13   28:getfield        #42  <Field zzbc zzcbc>
	//   14   31:iconst_0        
	//   15   32:aconst_null     
	//   16   33:new             #203 <Class zzx>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:getfield        #40  <Field Context mContext>
	//   20   41:aconst_null     
	//   21   42:aconst_null     
	//   22   43:invokespecial   #206 <Method void zzx(Context, zzait, zzael)>
	//   23   46:aconst_null     
	//   24   47:aconst_null     
	//   25   48:invokeinterface #211 <Method void com.google.android.gms.internal.ads.zzasc.zza(zzjd, com.google.android.gms.ads.internal.gmsg.zzb, com.google.android.gms.ads.internal.overlay.zzn, com.google.android.gms.ads.internal.gmsg.zzd, com.google.android.gms.ads.internal.overlay.zzt, boolean, com.google.android.gms.ads.internal.gmsg.zzz, zzx, zzaam, zzait)>
		zzaqw1.zza("/logScionEvent", ((zzv) (zzcbn)));
	//   26   53:aload_1         
	//   27   54:ldc1            #213 <String "/logScionEvent">
	//   28   56:aload_0         
	//   29   57:getfield        #93  <Field zzab zzcbn>
	//   30   60:invokeinterface #191 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, zzv)>
		zzaqw1.zza("/logScionEvent", ((zzv) (zzcbo)));
	//   31   65:aload_1         
	//   32   66:ldc1            #213 <String "/logScionEvent">
	//   33   68:aload_0         
	//   34   69:getfield        #100 <Field zzpe zzcbo>
	//   35   72:invokeinterface #191 <Method void com.google.android.gms.internal.ads.zzaqw.zza(String, zzv)>
		return ((zzanz) (zzano.zzi(((Object) (zzaqw1)))));
	//   36   77:aload_1         
	//   37   78:invokestatic    #151 <Method zzany zzano.zzi(Object)>
	//   38   81:areturn         
	}

	public final zzanz zzh(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanj) (new zzacs(this, jsonobject))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #216 <Class zzacs>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #219 <Method void zzacs(zzacq, JSONObject)>
	//    7   13:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    8   16:invokestatic    #116 <Method zzanz com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanj, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	public final zzanz zzi(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanj) (new zzact(this, jsonobject))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #222 <Class zzact>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #223 <Method void zzact(zzacq, JSONObject)>
	//    7   13:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    8   16:invokestatic    #116 <Method zzanz com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanj, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	public final zzanz zzj(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanj) (new zzacu(this, jsonobject))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #226 <Class zzacu>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #227 <Method void zzacu(zzacq, JSONObject)>
	//    7   13:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    8   16:invokestatic    #116 <Method zzanz com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanj, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	public final zzanz zzk(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanj) (new zzacv(this, jsonobject))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #230 <Class zzacv>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #231 <Method void zzacv(zzacq, JSONObject)>
	//    7   13:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    8   16:invokestatic    #116 <Method zzanz com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanj, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	public final void zzmc()
	{
		com.google.android.gms.internal.ads.zzano.zza(zzcbm, ((zzanl) (new zzada(this))), zzaoe.zzcvy);
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field zzanz zzcbm>
	//    2    4:new             #234 <Class zzada>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #235 <Method void zzada(zzacq)>
	//    6   12:getstatic       #161 <Field java.util.concurrent.Executor zzaoe.zzcvy>
	//    7   15:invokestatic    #164 <Method void com.google.android.gms.internal.ads.zzano.zza(zzanz, zzanl, java.util.concurrent.Executor)>
	//    8   18:return          
	}

	private final Context mContext;
	private String zzaae;
	private final zzci zzbjc;
	private final zzbc zzcbc;
	private zzanz zzcbm;
	private final zzab zzcbn;
	private final zzpe zzcbo;
	private final zzang zzzw;
}
