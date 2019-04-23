// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.mediation;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.e;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.g;
import com.google.android.gms.ads.j;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.a;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.l;
import com.google.android.gms.ads.mediation.o;
import com.google.android.gms.ads.reward.d;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.aag;
import com.google.android.gms.internal.ads.bwk;
import com.google.android.gms.internal.ads.byg;
import com.google.android.gms.internal.ads.zv;
import com.google.android.gms.internal.ads.zzbiy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.ads.mediation:
//			o, p, d, e, 
//			f

public abstract class AbstractAdViewAdapter
	implements MediationBannerAdapter, MediationNativeAdapter, l, o, MediationRewardedVideoAdAdapter, zzbiy
{

	public AbstractAdViewAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class com.google.ads.mediation.o>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #43  <Method void com.google.ads.mediation.o(AbstractAdViewAdapter)>
	//    7   13:putfield        #45  <Field d zzhy>
	//    8   16:return          
	}

	private final com.google.android.gms.ads.d zza(Context context, a a1, Bundle bundle, Bundle bundle1)
	{
		e e1 = new e();
	//    0    0:new             #50  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #51  <Method void e()>
	//    3    7:astore          7
		Object obj = ((Object) (a1.a()));
	//    4    9:aload_2         
	//    5   10:invokeinterface #57  <Method java.util.Date a.a()>
	//    6   15:astore          8
		if(obj != null)
	//*   7   17:aload           8
	//*   8   19:ifnull          30
			e1.a(((java.util.Date) (obj)));
	//    9   22:aload           7
	//   10   24:aload           8
	//   11   26:invokevirtual   #60  <Method e e.a(java.util.Date)>
	//   12   29:pop             
		int i = a1.b();
	//   13   30:aload_2         
	//   14   31:invokeinterface #64  <Method int a.b()>
	//   15   36:istore          5
		if(i != 0)
	//*  16   38:iload           5
	//*  17   40:ifeq            51
			e1.a(i);
	//   18   43:aload           7
	//   19   45:iload           5
	//   20   47:invokevirtual   #67  <Method e e.a(int)>
	//   21   50:pop             
		obj = ((Object) (a1.c()));
	//   22   51:aload_2         
	//   23   52:invokeinterface #71  <Method Set a.c()>
	//   24   57:astore          8
		if(obj != null)
	//*  25   59:aload           8
	//*  26   61:ifnull          102
			for(obj = ((Object) (((Set) (obj)).iterator())); ((Iterator) (obj)).hasNext(); e1.a((String)((Iterator) (obj)).next()));
	//   27   64:aload           8
	//   28   66:invokeinterface #77  <Method Iterator Set.iterator()>
	//   29   71:astore          8
	//   30   73:aload           8
	//   31   75:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//   32   80:ifeq            102
	//   33   83:aload           7
	//   34   85:aload           8
	//   35   87:invokeinterface #87  <Method Object Iterator.next()>
	//   36   92:checkcast       #89  <Class String>
	//   37   95:invokevirtual   #92  <Method e e.a(String)>
	//   38   98:pop             
	//*  39   99:goto            73
		obj = ((Object) (a1.d()));
	//   40  102:aload_2         
	//   41  103:invokeinterface #96  <Method android.location.Location a.d()>
	//   42  108:astore          8
		if(obj != null)
	//*  43  110:aload           8
	//*  44  112:ifnull          123
			e1.a(((android.location.Location) (obj)));
	//   45  115:aload           7
	//   46  117:aload           8
	//   47  119:invokevirtual   #99  <Method e e.a(android.location.Location)>
	//   48  122:pop             
		if(a1.f())
	//*  49  123:aload_2         
	//*  50  124:invokeinterface #102 <Method boolean a.f()>
	//*  51  129:ifeq            146
		{
			bwk.a();
	//   52  132:invokestatic    #107 <Method zv bwk.a()>
	//   53  135:pop             
			e1.b(zv.a(context));
	//   54  136:aload           7
	//   55  138:aload_1         
	//   56  139:invokestatic    #112 <Method String zv.a(Context)>
	//   57  142:invokevirtual   #114 <Method e e.b(String)>
	//   58  145:pop             
		}
		if(a1.e() != -1)
	//*  59  146:aload_2         
	//*  60  147:invokeinterface #117 <Method int a.e()>
	//*  61  152:iconst_m1       
	//*  62  153:icmpeq          187
		{
			int k = a1.e();
	//   63  156:aload_2         
	//   64  157:invokeinterface #117 <Method int a.e()>
	//   65  162:istore          5
			boolean flag = true;
	//   66  164:iconst_1        
	//   67  165:istore          6
			if(k != 1)
	//*  68  167:iload           5
	//*  69  169:iconst_1        
	//*  70  170:icmpne          176
	//*  71  173:goto            179
				flag = false;
	//   72  176:iconst_0        
	//   73  177:istore          6
			e1.a(flag);
	//   74  179:aload           7
	//   75  181:iload           6
	//   76  183:invokevirtual   #120 <Method e e.a(boolean)>
	//   77  186:pop             
		}
		e1.b(a1.g());
	//   78  187:aload           7
	//   79  189:aload_2         
	//   80  190:invokeinterface #123 <Method boolean a.g()>
	//   81  195:invokevirtual   #125 <Method e e.b(boolean)>
	//   82  198:pop             
		e1.a(com/google/ads/mediation/admob/AdMobAdapter, zza(bundle, bundle1));
	//   83  199:aload           7
	//   84  201:ldc1            #127 <Class AdMobAdapter>
	//   85  203:aload_0         
	//   86  204:aload_3         
	//   87  205:aload           4
	//   88  207:invokevirtual   #130 <Method Bundle zza(Bundle, Bundle)>
	//   89  210:invokevirtual   #133 <Method e e.a(Class, Bundle)>
	//   90  213:pop             
		return e1.a();
	//   91  214:aload           7
	//   92  216:invokevirtual   #136 <Method com.google.android.gms.ads.d e.a()>
	//   93  219:areturn         
	}

	static j zza(AbstractAdViewAdapter abstractadviewadapter, j j1)
	{
		abstractadviewadapter.zzhw = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #139 <Field j zzhw>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static com.google.android.gms.ads.reward.mediation.a zza(AbstractAdViewAdapter abstractadviewadapter)
	{
		return abstractadviewadapter.zzhx;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field com.google.android.gms.ads.reward.mediation.a zzhx>
	//    2    4:areturn         
	}

	static j zzb(AbstractAdViewAdapter abstractadviewadapter)
	{
		return abstractadviewadapter.zzhw;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field j zzhw>
	//    2    4:areturn         
	}

	public String getAdUnitId(Bundle bundle)
	{
		return bundle.getString("pubid");
	//    0    0:aload_1         
	//    1    1:ldc1            #21  <String "pubid">
	//    2    3:invokevirtual   #152 <Method String Bundle.getString(String)>
	//    3    6:areturn         
	}

	public View getBannerView()
	{
		return ((View) (zzhs));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field g zzhs>
	//    2    4:areturn         
	}

	public Bundle getInterstitialAdapterInfo()
	{
		return (new c()).a(1).a();
	//    0    0:new             #160 <Class c>
	//    1    3:dup             
	//    2    4:invokespecial   #161 <Method void c()>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #164 <Method c c.a(int)>
	//    5   11:invokevirtual   #166 <Method Bundle c.a()>
	//    6   14:areturn         
	}

	public byg getVideoController()
	{
		Object obj = ((Object) (zzhs));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field g zzhs>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((g) (obj)).getVideoController()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #173 <Method com.google.android.gms.ads.o g.getVideoController()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((com.google.android.gms.ads.o) (obj)).a();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #177 <Method byg com.google.android.gms.ads.o.a()>
	//   12   22:areturn         
		}
		return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public void initialize(Context context, a a1, String s, com.google.android.gms.ads.reward.mediation.a a2, Bundle bundle, Bundle bundle1)
	{
		zzhv = context.getApplicationContext();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #185 <Method Context Context.getApplicationContext()>
	//    3    5:putfield        #187 <Field Context zzhv>
		zzhx = a2;
	//    4    8:aload_0         
	//    5    9:aload           4
	//    6   11:putfield        #142 <Field com.google.android.gms.ads.reward.mediation.a zzhx>
		zzhx.a(((MediationRewardedVideoAdAdapter) (this)));
	//    7   14:aload_0         
	//    8   15:getfield        #142 <Field com.google.android.gms.ads.reward.mediation.a zzhx>
	//    9   18:aload_0         
	//   10   19:invokeinterface #192 <Method void com.google.android.gms.ads.reward.mediation.a.a(MediationRewardedVideoAdAdapter)>
	//   11   24:return          
	}

	public boolean isInitialized()
	{
		return zzhx != null;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field com.google.android.gms.ads.reward.mediation.a zzhx>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void loadAd(a a1, Bundle bundle, Bundle bundle1)
	{
		Context context = zzhv;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field Context zzhv>
	//    2    4:astore          4
		if(context != null && zzhx != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          99
	//*   5   11:aload_0         
	//*   6   12:getfield        #142 <Field com.google.android.gms.ads.reward.mediation.a zzhx>
	//*   7   15:ifnonnull       21
	//*   8   18:goto            99
		{
			zzhw = new j(context);
	//    9   21:aload_0         
	//   10   22:new             #197 <Class j>
	//   11   25:dup             
	//   12   26:aload           4
	//   13   28:invokespecial   #200 <Method void j(Context)>
	//   14   31:putfield        #139 <Field j zzhw>
			zzhw.a(true);
	//   15   34:aload_0         
	//   16   35:getfield        #139 <Field j zzhw>
	//   17   38:iconst_1        
	//   18   39:invokevirtual   #203 <Method void j.a(boolean)>
			zzhw.a(getAdUnitId(bundle));
	//   19   42:aload_0         
	//   20   43:getfield        #139 <Field j zzhw>
	//   21   46:aload_0         
	//   22   47:aload_2         
	//   23   48:invokevirtual   #205 <Method String getAdUnitId(Bundle)>
	//   24   51:invokevirtual   #208 <Method void j.a(String)>
			zzhw.a(zzhy);
	//   25   54:aload_0         
	//   26   55:getfield        #139 <Field j zzhw>
	//   27   58:aload_0         
	//   28   59:getfield        #45  <Field d zzhy>
	//   29   62:invokevirtual   #211 <Method void j.a(d)>
			zzhw.a(((com.google.android.gms.ads.reward.a) (new p(this))));
	//   30   65:aload_0         
	//   31   66:getfield        #139 <Field j zzhw>
	//   32   69:new             #213 <Class p>
	//   33   72:dup             
	//   34   73:aload_0         
	//   35   74:invokespecial   #214 <Method void p(AbstractAdViewAdapter)>
	//   36   77:invokevirtual   #217 <Method void j.a(com.google.android.gms.ads.reward.a)>
			zzhw.a(zza(zzhv, a1, bundle1, bundle));
	//   37   80:aload_0         
	//   38   81:getfield        #139 <Field j zzhw>
	//   39   84:aload_0         
	//   40   85:aload_0         
	//   41   86:getfield        #187 <Field Context zzhv>
	//   42   89:aload_1         
	//   43   90:aload_3         
	//   44   91:aload_2         
	//   45   92:invokespecial   #219 <Method com.google.android.gms.ads.d zza(Context, a, Bundle, Bundle)>
	//   46   95:invokevirtual   #222 <Method void j.a(com.google.android.gms.ads.d)>
			return;
	//   47   98:return          
		} else
		{
			aag.c("AdMobAdapter.loadAd called before initialize.");
	//   48   99:ldc1            #224 <String "AdMobAdapter.loadAd called before initialize.">
	//   49  101:invokestatic    #228 <Method void aag.c(String)>
			return;
	//   50  104:return          
		}
	}

	public void onDestroy()
	{
		g g1 = zzhs;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field g zzhs>
	//    2    4:astore_1        
		if(g1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			g1.c();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #231 <Method void g.c()>
			zzhs = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #156 <Field g zzhs>
		}
		if(zzht != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #233 <Field j zzht>
	//*  12   22:ifnull          30
			zzht = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #233 <Field j zzht>
		if(zzhu != null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #235 <Field b zzhu>
	//*  18   34:ifnull          42
			zzhu = null;
	//   19   37:aload_0         
	//   20   38:aconst_null     
	//   21   39:putfield        #235 <Field b zzhu>
		if(zzhw != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #139 <Field j zzhw>
	//*  24   46:ifnull          54
			zzhw = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #139 <Field j zzhw>
	//   28   54:return          
	}

	public void onImmersiveModeUpdated(boolean flag)
	{
		j j1 = zzht;
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field j zzht>
	//    2    4:astore_2        
		if(j1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			j1.b(flag);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #238 <Method void j.b(boolean)>
		j1 = zzhw;
	//    8   14:aload_0         
	//    9   15:getfield        #139 <Field j zzhw>
	//   10   18:astore_2        
		if(j1 != null)
	//*  11   19:aload_2         
	//*  12   20:ifnull          28
			j1.b(flag);
	//   13   23:aload_2         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #238 <Method void j.b(boolean)>
	//   16   28:return          
	}

	public void onPause()
	{
		g g1 = zzhs;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field g zzhs>
	//    2    4:astore_1        
		if(g1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			g1.b();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #241 <Method void g.b()>
	//    7   13:return          
	}

	public void onResume()
	{
		g g1 = zzhs;
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field g zzhs>
	//    2    4:astore_1        
		if(g1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			g1.a();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #244 <Method void g.a()>
	//    7   13:return          
	}

	public void requestBannerAd(Context context, com.google.android.gms.ads.mediation.d d1, Bundle bundle, f f1, a a1, Bundle bundle1)
	{
		zzhs = new g(context);
	//    0    0:aload_0         
	//    1    1:new             #170 <Class g>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #247 <Method void g(Context)>
	//    5    9:putfield        #156 <Field g zzhs>
		zzhs.setAdSize(new f(f1.b(), f1.a()));
	//    6   12:aload_0         
	//    7   13:getfield        #156 <Field g zzhs>
	//    8   16:new             #249 <Class f>
	//    9   19:dup             
	//   10   20:aload           4
	//   11   22:invokevirtual   #250 <Method int f.b()>
	//   12   25:aload           4
	//   13   27:invokevirtual   #252 <Method int f.a()>
	//   14   30:invokespecial   #255 <Method void f(int, int)>
	//   15   33:invokevirtual   #259 <Method void g.setAdSize(f)>
		zzhs.setAdUnitId(getAdUnitId(bundle));
	//   16   36:aload_0         
	//   17   37:getfield        #156 <Field g zzhs>
	//   18   40:aload_0         
	//   19   41:aload_3         
	//   20   42:invokevirtual   #205 <Method String getAdUnitId(Bundle)>
	//   21   45:invokevirtual   #262 <Method void g.setAdUnitId(String)>
		zzhs.setAdListener(((com.google.android.gms.ads.a) (new com.google.ads.mediation.d(this, d1))));
	//   22   48:aload_0         
	//   23   49:getfield        #156 <Field g zzhs>
	//   24   52:new             #264 <Class com.google.ads.mediation.d>
	//   25   55:dup             
	//   26   56:aload_0         
	//   27   57:aload_2         
	//   28   58:invokespecial   #267 <Method void com.google.ads.mediation.d(AbstractAdViewAdapter, com.google.android.gms.ads.mediation.d)>
	//   29   61:invokevirtual   #271 <Method void g.setAdListener(com.google.android.gms.ads.a)>
		zzhs.a(zza(context, a1, bundle1, bundle));
	//   30   64:aload_0         
	//   31   65:getfield        #156 <Field g zzhs>
	//   32   68:aload_0         
	//   33   69:aload_1         
	//   34   70:aload           5
	//   35   72:aload           6
	//   36   74:aload_3         
	//   37   75:invokespecial   #219 <Method com.google.android.gms.ads.d zza(Context, a, Bundle, Bundle)>
	//   38   78:invokevirtual   #272 <Method void g.a(com.google.android.gms.ads.d)>
	//   39   81:return          
	}

	public void requestInterstitialAd(Context context, com.google.android.gms.ads.mediation.e e1, Bundle bundle, a a1, Bundle bundle1)
	{
		zzht = new j(context);
	//    0    0:aload_0         
	//    1    1:new             #197 <Class j>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #200 <Method void j(Context)>
	//    5    9:putfield        #233 <Field j zzht>
		zzht.a(getAdUnitId(bundle));
	//    6   12:aload_0         
	//    7   13:getfield        #233 <Field j zzht>
	//    8   16:aload_0         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #205 <Method String getAdUnitId(Bundle)>
	//   11   21:invokevirtual   #208 <Method void j.a(String)>
		zzht.a(((com.google.android.gms.ads.a) (new com.google.ads.mediation.e(this, e1))));
	//   12   24:aload_0         
	//   13   25:getfield        #233 <Field j zzht>
	//   14   28:new             #276 <Class com.google.ads.mediation.e>
	//   15   31:dup             
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokespecial   #279 <Method void com.google.ads.mediation.e(AbstractAdViewAdapter, com.google.android.gms.ads.mediation.e)>
	//   19   37:invokevirtual   #281 <Method void j.a(com.google.android.gms.ads.a)>
		zzht.a(zza(context, a1, bundle1, bundle));
	//   20   40:aload_0         
	//   21   41:getfield        #233 <Field j zzht>
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aload           4
	//   25   48:aload           5
	//   26   50:aload_3         
	//   27   51:invokespecial   #219 <Method com.google.android.gms.ads.d zza(Context, a, Bundle, Bundle)>
	//   28   54:invokevirtual   #222 <Method void j.a(com.google.android.gms.ads.d)>
	//   29   57:return          
	}

	public void requestNativeAd(Context context, com.google.android.gms.ads.mediation.f f1, Bundle bundle, com.google.android.gms.ads.mediation.j j1, Bundle bundle1)
	{
		com.google.ads.mediation.f f2 = new com.google.ads.mediation.f(this, f1);
	//    0    0:new             #285 <Class com.google.ads.mediation.f>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokespecial   #288 <Method void com.google.ads.mediation.f(AbstractAdViewAdapter, com.google.android.gms.ads.mediation.f)>
	//    5    9:astore          6
		com.google.android.gms.ads.c c1 = (new com.google.android.gms.ads.c(context, bundle.getString("pubid"))).a(((com.google.android.gms.ads.a) (f2)));
	//    6   11:new             #290 <Class com.google.android.gms.ads.c>
	//    7   14:dup             
	//    8   15:aload_1         
	//    9   16:aload_3         
	//   10   17:ldc1            #21  <String "pubid">
	//   11   19:invokevirtual   #152 <Method String Bundle.getString(String)>
	//   12   22:invokespecial   #293 <Method void com.google.android.gms.ads.c(Context, String)>
	//   13   25:aload           6
	//   14   27:invokevirtual   #296 <Method com.google.android.gms.ads.c com.google.android.gms.ads.c.a(com.google.android.gms.ads.a)>
	//   15   30:astore          7
		f1 = ((com.google.android.gms.ads.mediation.f) (j1.h()));
	//   16   32:aload           4
	//   17   34:invokeinterface #302 <Method com.google.android.gms.ads.formats.e com.google.android.gms.ads.mediation.j.h()>
	//   18   39:astore_2        
		if(f1 != null)
	//*  19   40:aload_2         
	//*  20   41:ifnull          51
			c1.a(((com.google.android.gms.ads.formats.e) (f1)));
	//   21   44:aload           7
	//   22   46:aload_2         
	//   23   47:invokevirtual   #305 <Method com.google.android.gms.ads.c com.google.android.gms.ads.c.a(com.google.android.gms.ads.formats.e)>
	//   24   50:pop             
		if(j1.j())
	//*  25   51:aload           4
	//*  26   53:invokeinterface #308 <Method boolean com.google.android.gms.ads.mediation.j.j()>
	//*  27   58:ifeq            69
			c1.a(((com.google.android.gms.ads.formats.q) (f2)));
	//   28   61:aload           7
	//   29   63:aload           6
	//   30   65:invokevirtual   #311 <Method com.google.android.gms.ads.c com.google.android.gms.ads.c.a(com.google.android.gms.ads.formats.q)>
	//   31   68:pop             
		if(j1.i())
	//*  32   69:aload           4
	//*  33   71:invokeinterface #314 <Method boolean com.google.android.gms.ads.mediation.j.i()>
	//*  34   76:ifeq            87
			c1.a(((com.google.android.gms.ads.formats.j) (f2)));
	//   35   79:aload           7
	//   36   81:aload           6
	//   37   83:invokevirtual   #317 <Method com.google.android.gms.ads.c com.google.android.gms.ads.c.a(com.google.android.gms.ads.formats.j)>
	//   38   86:pop             
		if(j1.k())
	//*  39   87:aload           4
	//*  40   89:invokeinterface #320 <Method boolean com.google.android.gms.ads.mediation.j.k()>
	//*  41   94:ifeq            105
			c1.a(((com.google.android.gms.ads.formats.l) (f2)));
	//   42   97:aload           7
	//   43   99:aload           6
	//   44  101:invokevirtual   #323 <Method com.google.android.gms.ads.c com.google.android.gms.ads.c.a(com.google.android.gms.ads.formats.l)>
	//   45  104:pop             
		if(j1.l())
	//*  46  105:aload           4
	//*  47  107:invokeinterface #326 <Method boolean com.google.android.gms.ads.mediation.j.l()>
	//*  48  112:ifeq            201
		{
			String s;
			for(Iterator iterator = j1.m().keySet().iterator(); iterator.hasNext(); c1.a(s, ((com.google.android.gms.ads.formats.o) (f2)), ((com.google.android.gms.ads.formats.n) (f1))))
	//*  49  115:aload           4
	//*  50  117:invokeinterface #330 <Method Map com.google.android.gms.ads.mediation.j.m()>
	//*  51  122:invokeinterface #335 <Method Set Map.keySet()>
	//*  52  127:invokeinterface #77  <Method Iterator Set.iterator()>
	//*  53  132:astore          8
	//*  54  134:aload           8
	//*  55  136:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  56  141:ifeq            201
			{
				s = (String)iterator.next();
	//   57  144:aload           8
	//   58  146:invokeinterface #87  <Method Object Iterator.next()>
	//   59  151:checkcast       #89  <Class String>
	//   60  154:astore          9
				if(((Boolean)j1.m().get(((Object) (s)))).booleanValue())
	//*  61  156:aload           4
	//*  62  158:invokeinterface #330 <Method Map com.google.android.gms.ads.mediation.j.m()>
	//*  63  163:aload           9
	//*  64  165:invokeinterface #339 <Method Object Map.get(Object)>
	//*  65  170:checkcast       #341 <Class Boolean>
	//*  66  173:invokevirtual   #344 <Method boolean Boolean.booleanValue()>
	//*  67  176:ifeq            185
					f1 = ((com.google.android.gms.ads.mediation.f) (f2));
	//   68  179:aload           6
	//   69  181:astore_2        
				else
	//*  70  182:goto            187
					f1 = null;
	//   71  185:aconst_null     
	//   72  186:astore_2        
			}

	//   73  187:aload           7
	//   74  189:aload           9
	//   75  191:aload           6
	//   76  193:aload_2         
	//   77  194:invokevirtual   #347 <Method com.google.android.gms.ads.c com.google.android.gms.ads.c.a(String, com.google.android.gms.ads.formats.o, com.google.android.gms.ads.formats.n)>
	//   78  197:pop             
		}
	//*  79  198:goto            134
		zzhu = c1.a();
	//   80  201:aload_0         
	//   81  202:aload           7
	//   82  204:invokevirtual   #350 <Method b com.google.android.gms.ads.c.a()>
	//   83  207:putfield        #235 <Field b zzhu>
		zzhu.a(zza(context, ((a) (j1)), bundle1, bundle));
	//   84  210:aload_0         
	//   85  211:getfield        #235 <Field b zzhu>
	//   86  214:aload_0         
	//   87  215:aload_1         
	//   88  216:aload           4
	//   89  218:aload           5
	//   90  220:aload_3         
	//   91  221:invokespecial   #219 <Method com.google.android.gms.ads.d zza(Context, a, Bundle, Bundle)>
	//   92  224:invokevirtual   #353 <Method void b.a(com.google.android.gms.ads.d)>
	//   93  227:return          
	}

	public void showInterstitial()
	{
		zzht.a();
	//    0    0:aload_0         
	//    1    1:getfield        #233 <Field j zzht>
	//    2    4:invokevirtual   #355 <Method void j.a()>
	//    3    7:return          
	}

	public void showVideo()
	{
		zzhw.a();
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field j zzhw>
	//    2    4:invokevirtual   #355 <Method void j.a()>
	//    3    7:return          
	}

	protected abstract Bundle zza(Bundle bundle, Bundle bundle1);

	public static final String AD_UNIT_ID_PARAMETER = "pubid";
	private g zzhs;
	private j zzht;
	private b zzhu;
	private Context zzhv;
	private j zzhw;
	private com.google.android.gms.ads.reward.mediation.a zzhx;
	private final d zzhy = new com.google.ads.mediation.o(this);
}
