// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.*;
import com.google.android.gms.ads.internal.gmsg.ag;
import com.google.android.gms.ads.internal.gmsg.f;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal.ads:
//			pp, wx, p, bwk, 
//			m, aft, bm, pu, 
//			abj, aas, aaq, afn, 
//			agv, pv, qe, qb, 
//			qd, pw, qc, px, 
//			py, abo, pz, abe, 
//			zzbbi, bad

public final class pt
	implements pp
{

	public pt(Context context, ac ac, String s, bad bad, zzbbi zzbbi)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		wx.d("Webview loading for native ads.");
	//    2    4:ldc1            #30  <String "Webview loading for native ads.">
	//    3    6:invokestatic    #35  <Method void wx.d(String)>
		d = context;
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:putfield        #37  <Field Context d>
		f = ac;
	//    7   14:aload_0         
	//    8   15:aload_2         
	//    9   16:putfield        #39  <Field ac f>
		g = bad;
	//   10   19:aload_0         
	//   11   20:aload           4
	//   12   22:putfield        #41  <Field bad g>
		e = zzbbi;
	//   13   25:aload_0         
	//   14   26:aload           5
	//   15   28:putfield        #43  <Field zzbbi e>
		h = s;
	//   16   31:aload_0         
	//   17   32:aload_3         
	//   18   33:putfield        #45  <Field String h>
		aw.f();
	//   19   36:invokestatic    #50  <Method aft aw.f()>
	//   20   39:pop             
		context = d;
	//   21   40:aload_0         
	//   22   41:getfield        #37  <Field Context d>
	//   23   44:astore_1        
		bad = ((bad) (e));
	//   24   45:aload_0         
	//   25   46:getfield        #43  <Field zzbbi e>
	//   26   49:astore          4
		zzbbi = ((zzbbi) (p.bx));
	//   27   51:getstatic       #56  <Field e p.bx>
	//   28   54:astore          5
		context = ((Context) (com.google.android.gms.internal.ads.aft.a(context, ((zzbbi) (bad)), (String)bwk.e().a(((e) (zzbbi))), g, ((a) (f)).i())));
	//   29   56:aload_1         
	//   30   57:aload           4
	//   31   59:invokestatic    #61  <Method m bwk.e()>
	//   32   62:aload           5
	//   33   64:invokevirtual   #66  <Method Object com.google.android.gms.internal.ads.m.a(e)>
	//   34   67:checkcast       #68  <Class String>
	//   35   70:aload_0         
	//   36   71:getfield        #41  <Field bad g>
	//   37   74:aload_0         
	//   38   75:getfield        #39  <Field ac f>
	//   39   78:invokevirtual   #74  <Method com.google.android.gms.ads.internal.bs a.i()>
	//   40   81:invokestatic    #79  <Method abe com.google.android.gms.internal.ads.aft.a(Context, zzbbi, String, bad, com.google.android.gms.ads.internal.bs)>
	//   41   84:astore_1        
		b = new f(d);
	//   42   85:aload_0         
	//   43   86:new             #81  <Class f>
	//   44   89:dup             
	//   45   90:aload_0         
	//   46   91:getfield        #37  <Field Context d>
	//   47   94:invokespecial   #84  <Method void f(Context)>
	//   48   97:putfield        #86  <Field f b>
		c = new bm(((bi) (ac)), s);
	//   49  100:aload_0         
	//   50  101:new             #88  <Class bm>
	//   51  104:dup             
	//   52  105:aload_2         
	//   53  106:aload_3         
	//   54  107:invokespecial   #91  <Method void bm(bi, String)>
	//   55  110:putfield        #93  <Field bm c>
		a = com.google.android.gms.internal.ads.aas.a(((abe) (context)), ((aan) (new pu(this))), abj.b);
	//   56  113:aload_0         
	//   57  114:aload_1         
	//   58  115:new             #95  <Class pu>
	//   59  118:dup             
	//   60  119:aload_0         
	//   61  120:invokespecial   #98  <Method void pu(pt)>
	//   62  123:getstatic       #103 <Field java.util.concurrent.Executor abj.b>
	//   63  126:invokestatic    #108 <Method abe com.google.android.gms.internal.ads.aas.a(abe, aan, java.util.concurrent.Executor)>
	//   64  129:putfield        #110 <Field abe a>
		com.google.android.gms.internal.ads.aaq.a(a, "WebViewNativeAdsUtil.constructor");
	//   65  132:aload_0         
	//   66  133:getfield        #110 <Field abe a>
	//   67  136:ldc1            #112 <String "WebViewNativeAdsUtil.constructor">
	//   68  138:invokestatic    #117 <Method void com.google.android.gms.internal.ads.aaq.a(abe, String)>
	//   69  141:return          
	}

	static String a(pt pt1)
	{
		return pt1.h;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field String h>
	//    2    4:areturn         
	}

	final abe a(afn afn1)
	{
		wx.d("Javascript has loaded for native ads.");
	//    0    0:ldc1            #122 <String "Javascript has loaded for native ads.">
	//    1    2:invokestatic    #35  <Method void wx.d(String)>
		agv agv1 = afn1.w();
	//    2    5:aload_1         
	//    3    6:invokeinterface #128 <Method agv afn.w()>
	//    4   11:astore_2        
		ac ac = f;
	//    5   12:aload_0         
	//    6   13:getfield        #39  <Field ac f>
	//    7   16:astore_3        
		agv1.a(((bvm) (ac)), ((com.google.android.gms.ads.internal.gmsg.n) (ac)), ((com.google.android.gms.ads.internal.overlay.m) (ac)), ((com.google.android.gms.ads.internal.gmsg.p) (ac)), ((com.google.android.gms.ads.internal.overlay.s) (ac)), false, ((com.google.android.gms.ads.internal.gmsg.ak) (null)), new bt(d, ((vo) (null)), ((zzaso) (null))), ((nj) (null)), ((vo) (null)));
	//    8   17:aload_2         
	//    9   18:aload_3         
	//   10   19:aload_3         
	//   11   20:aload_3         
	//   12   21:aload_3         
	//   13   22:aload_3         
	//   14   23:iconst_0        
	//   15   24:aconst_null     
	//   16   25:new             #130 <Class bt>
	//   17   28:dup             
	//   18   29:aload_0         
	//   19   30:getfield        #37  <Field Context d>
	//   20   33:aconst_null     
	//   21   34:aconst_null     
	//   22   35:invokespecial   #133 <Method void bt(Context, vo, zzaso)>
	//   23   38:aconst_null     
	//   24   39:aconst_null     
	//   25   40:invokeinterface #138 <Method void com.google.android.gms.internal.ads.agv.a(bvm, com.google.android.gms.ads.internal.gmsg.n, com.google.android.gms.ads.internal.overlay.m, com.google.android.gms.ads.internal.gmsg.p, com.google.android.gms.ads.internal.overlay.s, boolean, com.google.android.gms.ads.internal.gmsg.ak, bt, nj, vo)>
		afn1.a("/logScionEvent", ((ag) (b)));
	//   26   45:aload_1         
	//   27   46:ldc1            #140 <String "/logScionEvent">
	//   28   48:aload_0         
	//   29   49:getfield        #86  <Field f b>
	//   30   52:invokeinterface #143 <Method void com.google.android.gms.internal.ads.afn.a(String, ag)>
		afn1.a("/logScionEvent", ((ag) (c)));
	//   31   57:aload_1         
	//   32   58:ldc1            #140 <String "/logScionEvent">
	//   33   60:aload_0         
	//   34   61:getfield        #93  <Field bm c>
	//   35   64:invokeinterface #143 <Method void com.google.android.gms.internal.ads.afn.a(String, ag)>
		return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (afn1)))));
	//   36   69:aload_1         
	//   37   70:invokestatic    #146 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   38   73:areturn         
	}

	public final abe a(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.aas.a(a, ((aan) (new pv(this, jsonobject))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #149 <Class pv>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #152 <Method void pv(pt, JSONObject)>
	//    7   13:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    8   16:invokestatic    #108 <Method abe com.google.android.gms.internal.ads.aas.a(abe, aan, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	final abe a(JSONObject jsonobject, afn afn1)
	{
		jsonobject.put("ads_id", ((Object) (h)));
	//    0    0:aload_1         
	//    1    1:ldc1            #157 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #45  <Field String h>
	//    4    7:invokevirtual   #163 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		afn1.b("google.afma.nativeAds.handleDownloadedImpressionPing", jsonobject);
	//    6   11:aload_2         
	//    7   12:ldc1            #165 <String "google.afma.nativeAds.handleDownloadedImpressionPing">
	//    8   14:aload_1         
	//    9   15:invokeinterface #168 <Method void afn.b(String, JSONObject)>
		return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (new JSONObject())))));
	//   10   20:new             #159 <Class JSONObject>
	//   11   23:dup             
	//   12   24:invokespecial   #169 <Method void JSONObject()>
	//   13   27:invokestatic    #146 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   14   30:areturn         
	}

	public final void a()
	{
		com.google.android.gms.internal.ads.aas.a(a, ((aap) (new qe(this))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #171 <Class qe>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:invokespecial   #172 <Method void qe(pt)>
	//    6   12:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    7   15:invokestatic    #175 <Method void com.google.android.gms.internal.ads.aas.a(abe, aap, java.util.concurrent.Executor)>
	//    8   18:return          
	}

	public final void a(String s, ag ag)
	{
		com.google.android.gms.internal.ads.aas.a(a, ((aap) (new qb(this, s, ag))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #177 <Class qb>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #180 <Method void qb(pt, String, ag)>
	//    8   14:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    9   17:invokestatic    #175 <Method void com.google.android.gms.internal.ads.aas.a(abe, aap, java.util.concurrent.Executor)>
	//   10   20:return          
	}

	public final void a(String s, JSONObject jsonobject)
	{
		com.google.android.gms.internal.ads.aas.a(a, ((aap) (new qd(this, s, jsonobject))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #182 <Class qd>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #185 <Method void qd(pt, String, JSONObject)>
	//    8   14:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    9   17:invokestatic    #175 <Method void com.google.android.gms.internal.ads.aas.a(abe, aap, java.util.concurrent.Executor)>
	//   10   20:return          
	}

	public final abe b(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.aas.a(a, ((aan) (new pw(this, jsonobject))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #187 <Class pw>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #188 <Method void pw(pt, JSONObject)>
	//    7   13:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    8   16:invokestatic    #108 <Method abe com.google.android.gms.internal.ads.aas.a(abe, aan, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	final abe b(JSONObject jsonobject, afn afn1)
	{
		jsonobject.put("ads_id", ((Object) (h)));
	//    0    0:aload_1         
	//    1    1:ldc1            #157 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #45  <Field String h>
	//    4    7:invokevirtual   #163 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		afn1.b("google.afma.nativeAds.handleImpressionPing", jsonobject);
	//    6   11:aload_2         
	//    7   12:ldc1            #190 <String "google.afma.nativeAds.handleImpressionPing">
	//    8   14:aload_1         
	//    9   15:invokeinterface #168 <Method void afn.b(String, JSONObject)>
		return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (new JSONObject())))));
	//   10   20:new             #159 <Class JSONObject>
	//   11   23:dup             
	//   12   24:invokespecial   #169 <Method void JSONObject()>
	//   13   27:invokestatic    #146 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   14   30:areturn         
	}

	public final void b(String s, ag ag)
	{
		com.google.android.gms.internal.ads.aas.a(a, ((aap) (new qc(this, s, ag))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #192 <Class qc>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokespecial   #193 <Method void qc(pt, String, ag)>
	//    8   14:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    9   17:invokestatic    #175 <Method void com.google.android.gms.internal.ads.aas.a(abe, aap, java.util.concurrent.Executor)>
	//   10   20:return          
	}

	public final abe c(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.aas.a(a, ((aan) (new px(this, jsonobject))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #195 <Class px>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #196 <Method void px(pt, JSONObject)>
	//    7   13:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    8   16:invokestatic    #108 <Method abe com.google.android.gms.internal.ads.aas.a(abe, aan, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	final abe c(JSONObject jsonobject, afn afn1)
	{
		jsonobject.put("ads_id", ((Object) (h)));
	//    0    0:aload_1         
	//    1    1:ldc1            #157 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #45  <Field String h>
	//    4    7:invokevirtual   #163 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		afn1.b("google.afma.nativeAds.handleClickGmsg", jsonobject);
	//    6   11:aload_2         
	//    7   12:ldc1            #198 <String "google.afma.nativeAds.handleClickGmsg">
	//    8   14:aload_1         
	//    9   15:invokeinterface #168 <Method void afn.b(String, JSONObject)>
		return ((abe) (com.google.android.gms.internal.ads.aas.a(((Object) (new JSONObject())))));
	//   10   20:new             #159 <Class JSONObject>
	//   11   23:dup             
	//   12   24:invokespecial   #169 <Method void JSONObject()>
	//   13   27:invokestatic    #146 <Method abd com.google.android.gms.internal.ads.aas.a(Object)>
	//   14   30:areturn         
	}

	public final abe d(JSONObject jsonobject)
	{
		return com.google.android.gms.internal.ads.aas.a(a, ((aan) (new py(this, jsonobject))), com.google.android.gms.internal.ads.abj.a);
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field abe a>
	//    2    4:new             #200 <Class py>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #201 <Method void py(pt, JSONObject)>
	//    7   13:getstatic       #154 <Field java.util.concurrent.Executor com.google.android.gms.internal.ads.abj.a>
	//    8   16:invokestatic    #108 <Method abe com.google.android.gms.internal.ads.aas.a(abe, aan, java.util.concurrent.Executor)>
	//    9   19:areturn         
	}

	final abe d(JSONObject jsonobject, afn afn1)
	{
		jsonobject.put("ads_id", ((Object) (h)));
	//    0    0:aload_1         
	//    1    1:ldc1            #157 <String "ads_id">
	//    2    3:aload_0         
	//    3    4:getfield        #45  <Field String h>
	//    4    7:invokevirtual   #163 <Method JSONObject JSONObject.put(String, Object)>
	//    5   10:pop             
		abo abo1 = new abo();
	//    6   11:new             #203 <Class abo>
	//    7   14:dup             
	//    8   15:invokespecial   #204 <Method void abo()>
	//    9   18:astore_3        
		afn1.a("/nativeAdPreProcess", ((ag) (new pz(this, afn1, abo1))));
	//   10   19:aload_2         
	//   11   20:ldc1            #206 <String "/nativeAdPreProcess">
	//   12   22:new             #208 <Class pz>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:invokespecial   #211 <Method void pz(pt, afn, abo)>
	//   18   32:invokeinterface #143 <Method void com.google.android.gms.internal.ads.afn.a(String, ag)>
		afn1.b("google.afma.nativeAds.preProcessJsonGmsg", jsonobject);
	//   19   37:aload_2         
	//   20   38:ldc1            #213 <String "google.afma.nativeAds.preProcessJsonGmsg">
	//   21   40:aload_1         
	//   22   41:invokeinterface #168 <Method void afn.b(String, JSONObject)>
		return ((abe) (abo1));
	//   23   46:aload_3         
	//   24   47:areturn         
	}

	private abe a;
	private final f b;
	private final bm c;
	private final Context d;
	private final zzbbi e;
	private final ac f;
	private final bad g;
	private String h;
}
