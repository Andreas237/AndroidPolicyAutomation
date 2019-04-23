// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.p;
import com.google.android.gms.ads.internal.overlay.q;
import com.google.android.gms.ads.internal.overlay.r;
import com.google.android.gms.ads.internal.overlay.w;
import com.google.android.gms.ads.internal.overlay.x;
import com.google.android.gms.c.a;
import com.google.android.gms.c.d;
import com.google.android.gms.internal.ads.bu;
import com.google.android.gms.internal.ads.bw;
import com.google.android.gms.internal.ads.bwk;
import com.google.android.gms.internal.ads.bwx;
import com.google.android.gms.internal.ads.bxc;
import com.google.android.gms.internal.ads.bxo;
import com.google.android.gms.internal.ads.bxu;
import com.google.android.gms.internal.ads.cj;
import com.google.android.gms.internal.ads.co;
import com.google.android.gms.internal.ads.gt;
import com.google.android.gms.internal.ads.km;
import com.google.android.gms.internal.ads.m;
import com.google.android.gms.internal.ads.nn;
import com.google.android.gms.internal.ads.nx;
import com.google.android.gms.internal.ads.tl;
import com.google.android.gms.internal.ads.tu;
import com.google.android.gms.internal.ads.xg;
import com.google.android.gms.internal.ads.zzbbi;
import com.google.android.gms.internal.ads.zzwf;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal:
//			aw, l, bs, bu, 
//			m, aq, y

public class ClientApi extends bxo
{

	public ClientApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void bxo()>
	//    2    4:return          
	}

	public bwx createAdLoaderBuilder(a a, String s, km km, int i)
	{
		a = ((a) ((Context)d.a(a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object d.a(a)>
	//    2    4:checkcast       #23  <Class Context>
	//    3    7:astore_1        
		aw.e();
	//    4    8:invokestatic    #29  <Method xg aw.e()>
	//    5   11:pop             
		return ((bwx) (new l(((Context) (a)), s, km, new zzbbi(0xda3360, i, true, xg.l(((Context) (a)))), com.google.android.gms.ads.internal.bs.a(((Context) (a))))));
	//    6   12:new             #31  <Class l>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:new             #33  <Class zzbbi>
	//   12   22:dup             
	//   13   23:ldc1            #34  <Int 0xda3360>
	//   14   25:iload           4
	//   15   27:iconst_1        
	//   16   28:aload_1         
	//   17   29:invokestatic    #40  <Method boolean xg.l(Context)>
	//   18   32:invokespecial   #43  <Method void zzbbi(int, int, boolean, boolean)>
	//   19   35:aload_1         
	//   20   36:invokestatic    #48  <Method bs com.google.android.gms.ads.internal.bs.a(Context)>
	//   21   39:invokespecial   #51  <Method void l(Context, String, km, zzbbi, bs)>
	//   22   42:areturn         
	}

	public nn createAdOverlay(a a)
	{
		a = ((a) ((Activity)d.a(a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object d.a(a)>
	//    2    4:checkcast       #55  <Class Activity>
	//    3    7:astore_1        
		AdOverlayInfoParcel adoverlayinfoparcel = AdOverlayInfoParcel.a(((Activity) (a)).getIntent());
	//    4    8:aload_1         
	//    5    9:invokevirtual   #59  <Method android.content.Intent Activity.getIntent()>
	//    6   12:invokestatic    #64  <Method AdOverlayInfoParcel AdOverlayInfoParcel.a(android.content.Intent)>
	//    7   15:astore_2        
		if(adoverlayinfoparcel == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       29
			return ((nn) (new q(((Activity) (a)))));
	//   10   20:new             #66  <Class q>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #69  <Method void q(Activity)>
	//   14   28:areturn         
		switch(adoverlayinfoparcel.k)
	//*  15   29:aload_2         
	//*  16   30:getfield        #73  <Field int AdOverlayInfoParcel.k>
		{
	//*  17   33:tableswitch     1 4: default 64
	//	               1 101
	//	               2 92
	//	               3 83
	//	               4 73
		default:
			return ((nn) (new q(((Activity) (a)))));
	//   18   64:new             #66  <Class q>
	//   19   67:dup             
	//   20   68:aload_1         
	//   21   69:invokespecial   #69  <Method void q(Activity)>
	//   22   72:areturn         

		case 4: // '\004'
			return ((nn) (new r(((Activity) (a)), adoverlayinfoparcel)));
	//   23   73:new             #75  <Class r>
	//   24   76:dup             
	//   25   77:aload_1         
	//   26   78:aload_2         
	//   27   79:invokespecial   #78  <Method void r(Activity, AdOverlayInfoParcel)>
	//   28   82:areturn         

		case 3: // '\003'
			return ((nn) (new x(((Activity) (a)))));
	//   29   83:new             #80  <Class x>
	//   30   86:dup             
	//   31   87:aload_1         
	//   32   88:invokespecial   #81  <Method void x(Activity)>
	//   33   91:areturn         

		case 2: // '\002'
			return ((nn) (new w(((Activity) (a)))));
	//   34   92:new             #83  <Class w>
	//   35   95:dup             
	//   36   96:aload_1         
	//   37   97:invokespecial   #84  <Method void w(Activity)>
	//   38  100:areturn         

		case 1: // '\001'
			return ((nn) (new p(((Activity) (a)))));
	//   39  101:new             #86  <Class p>
	//   40  104:dup             
	//   41  105:aload_1         
	//   42  106:invokespecial   #87  <Method void p(Activity)>
	//   43  109:areturn         
		}
	}

	public bxc createBannerAdManager(a a, zzwf zzwf1, String s, km km, int i)
	{
		a = ((a) ((Context)d.a(a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object d.a(a)>
	//    2    4:checkcast       #23  <Class Context>
	//    3    7:astore_1        
		aw.e();
	//    4    8:invokestatic    #29  <Method xg aw.e()>
	//    5   11:pop             
		return ((bxc) (new com.google.android.gms.ads.internal.bu(((Context) (a)), zzwf1, s, km, new zzbbi(0xda3360, i, true, xg.l(((Context) (a)))), com.google.android.gms.ads.internal.bs.a(((Context) (a))))));
	//    6   12:new             #91  <Class com.google.android.gms.ads.internal.bu>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload           4
	//   12   21:new             #33  <Class zzbbi>
	//   13   24:dup             
	//   14   25:ldc1            #34  <Int 0xda3360>
	//   15   27:iload           5
	//   16   29:iconst_1        
	//   17   30:aload_1         
	//   18   31:invokestatic    #40  <Method boolean xg.l(Context)>
	//   19   34:invokespecial   #43  <Method void zzbbi(int, int, boolean, boolean)>
	//   20   37:aload_1         
	//   21   38:invokestatic    #48  <Method bs com.google.android.gms.ads.internal.bs.a(Context)>
	//   22   41:invokespecial   #94  <Method void com.google.android.gms.ads.internal.bu(Context, zzwf, String, km, zzbbi, bs)>
	//   23   44:areturn         
	}

	public nx createInAppPurchaseManager(a a)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public bxc createInterstitialAdManager(a a, zzwf zzwf1, String s, km km, int i)
	{
		zzbbi zzbbi1;
label0:
		{
			a = ((a) ((Context)d.a(a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object d.a(a)>
	//    2    4:checkcast       #23  <Class Context>
	//    3    7:astore_1        
			com.google.android.gms.internal.ads.p.a(((Context) (a)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #102 <Method void com.google.android.gms.internal.ads.p.a(Context)>
			aw.e();
	//    6   12:invokestatic    #29  <Method xg aw.e()>
	//    7   15:pop             
			boolean flag1 = xg.l(((Context) (a)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #40  <Method boolean xg.l(Context)>
	//   10   20:istore          7
			boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore          6
			zzbbi1 = new zzbbi(0xda3360, i, true, flag1);
	//   13   25:new             #33  <Class zzbbi>
	//   14   28:dup             
	//   15   29:ldc1            #34  <Int 0xda3360>
	//   16   31:iload           5
	//   17   33:iconst_1        
	//   18   34:iload           7
	//   19   36:invokespecial   #43  <Method void zzbbi(int, int, boolean, boolean)>
	//   20   39:astore          8
			flag1 = "reward_mb".equals(((Object) (zzwf1.a)));
	//   21   41:ldc1            #104 <String "reward_mb">
	//   22   43:aload_2         
	//   23   44:getfield        #109 <Field String zzwf.a>
	//   24   47:invokevirtual   #115 <Method boolean String.equals(Object)>
	//   25   50:istore          7
			if(!flag1)
	//*  26   52:iload           7
	//*  27   54:ifne            83
			{
				com.google.android.gms.internal.ads.e e = com.google.android.gms.internal.ads.p.aC;
	//   28   57:getstatic       #119 <Field com.google.android.gms.internal.ads.e com.google.android.gms.internal.ads.p.aC>
	//   29   60:astore          9
				i = ((int) (flag));
	//   30   62:iload           6
	//   31   64:istore          5
				if(((Boolean)bwk.e().a(e)).booleanValue())
					break label0;
	//   32   66:invokestatic    #124 <Method m bwk.e()>
	//   33   69:aload           9
	//   34   71:invokevirtual   #129 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//   35   74:checkcast       #131 <Class Boolean>
	//   36   77:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//   37   80:ifne            120
			}
			if(flag1)
	//*  38   83:iload           7
	//*  39   85:ifeq            117
			{
				com.google.android.gms.internal.ads.e e1 = com.google.android.gms.internal.ads.p.aD;
	//   40   88:getstatic       #138 <Field com.google.android.gms.internal.ads.e com.google.android.gms.internal.ads.p.aD>
	//   41   91:astore          9
				if(((Boolean)bwk.e().a(e1)).booleanValue())
	//*  42   93:invokestatic    #124 <Method m bwk.e()>
	//*  43   96:aload           9
	//*  44   98:invokevirtual   #129 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  45  101:checkcast       #131 <Class Boolean>
	//*  46  104:invokevirtual   #135 <Method boolean Boolean.booleanValue()>
	//*  47  107:ifeq            117
				{
					i = ((int) (flag));
	//   48  110:iload           6
	//   49  112:istore          5
					break label0;
	//   50  114:goto            120
				}
			}
			i = 0;
	//   51  117:iconst_0        
	//   52  118:istore          5
		}
		if(i != 0)
	//*  53  120:iload           5
	//*  54  122:ifeq            143
			return ((bxc) (new gt(((Context) (a)), s, km, zzbbi1, com.google.android.gms.ads.internal.bs.a(((Context) (a))))));
	//   55  125:new             #140 <Class gt>
	//   56  128:dup             
	//   57  129:aload_1         
	//   58  130:aload_3         
	//   59  131:aload           4
	//   60  133:aload           8
	//   61  135:aload_1         
	//   62  136:invokestatic    #48  <Method bs com.google.android.gms.ads.internal.bs.a(Context)>
	//   63  139:invokespecial   #141 <Method void gt(Context, String, km, zzbbi, bs)>
	//   64  142:areturn         
		else
			return ((bxc) (new com.google.android.gms.ads.internal.m(((Context) (a)), zzwf1, s, km, zzbbi1, com.google.android.gms.ads.internal.bs.a(((Context) (a))))));
	//   65  143:new             #143 <Class com.google.android.gms.ads.internal.m>
	//   66  146:dup             
	//   67  147:aload_1         
	//   68  148:aload_2         
	//   69  149:aload_3         
	//   70  150:aload           4
	//   71  152:aload           8
	//   72  154:aload_1         
	//   73  155:invokestatic    #48  <Method bs com.google.android.gms.ads.internal.bs.a(Context)>
	//   74  158:invokespecial   #144 <Method void com.google.android.gms.ads.internal.m(Context, zzwf, String, km, zzbbi, bs)>
	//   75  161:areturn         
	}

	public cj createNativeAdViewDelegate(a a, a a1)
	{
		return ((cj) (new bu((FrameLayout)d.a(a), (FrameLayout)d.a(a1))));
	//    0    0:new             #148 <Class bu>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #21  <Method Object d.a(a)>
	//    4    8:checkcast       #150 <Class FrameLayout>
	//    5   11:aload_2         
	//    6   12:invokestatic    #21  <Method Object d.a(a)>
	//    7   15:checkcast       #150 <Class FrameLayout>
	//    8   18:invokespecial   #153 <Method void bu(FrameLayout, FrameLayout)>
	//    9   21:areturn         
	}

	public co createNativeAdViewHolderDelegate(a a, a a1, a a2)
	{
		return ((co) (new bw((View)d.a(a), (HashMap)d.a(a1), (HashMap)d.a(a2))));
	//    0    0:new             #157 <Class bw>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #21  <Method Object d.a(a)>
	//    4    8:checkcast       #159 <Class View>
	//    5   11:aload_2         
	//    6   12:invokestatic    #21  <Method Object d.a(a)>
	//    7   15:checkcast       #161 <Class HashMap>
	//    8   18:aload_3         
	//    9   19:invokestatic    #21  <Method Object d.a(a)>
	//   10   22:checkcast       #161 <Class HashMap>
	//   11   25:invokespecial   #164 <Method void bw(View, HashMap, HashMap)>
	//   12   28:areturn         
	}

	public tu createRewardedVideoAd(a a, km km, int i)
	{
		a = ((a) ((Context)d.a(a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object d.a(a)>
	//    2    4:checkcast       #23  <Class Context>
	//    3    7:astore_1        
		aw.e();
	//    4    8:invokestatic    #29  <Method xg aw.e()>
	//    5   11:pop             
		zzbbi zzbbi1 = new zzbbi(0xda3360, i, true, xg.l(((Context) (a))));
	//    6   12:new             #33  <Class zzbbi>
	//    7   15:dup             
	//    8   16:ldc1            #34  <Int 0xda3360>
	//    9   18:iload_3         
	//   10   19:iconst_1        
	//   11   20:aload_1         
	//   12   21:invokestatic    #40  <Method boolean xg.l(Context)>
	//   13   24:invokespecial   #43  <Method void zzbbi(int, int, boolean, boolean)>
	//   14   27:astore          4
		return ((tu) (new tl(((Context) (a)), com.google.android.gms.ads.internal.bs.a(((Context) (a))), km, zzbbi1)));
	//   15   29:new             #168 <Class tl>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:aload_1         
	//   19   35:invokestatic    #48  <Method bs com.google.android.gms.ads.internal.bs.a(Context)>
	//   20   38:aload_2         
	//   21   39:aload           4
	//   22   41:invokespecial   #171 <Method void tl(Context, bs, km, zzbbi)>
	//   23   44:areturn         
	}

	public tu createRewardedVideoAdSku(a a, int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public bxc createSearchAdManager(a a, zzwf zzwf1, String s, int i)
	{
		a = ((a) ((Context)d.a(a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object d.a(a)>
	//    2    4:checkcast       #23  <Class Context>
	//    3    7:astore_1        
		aw.e();
	//    4    8:invokestatic    #29  <Method xg aw.e()>
	//    5   11:pop             
		return ((bxc) (new aq(((Context) (a)), zzwf1, s, new zzbbi(0xda3360, i, true, xg.l(((Context) (a)))))));
	//    6   12:new             #177 <Class aq>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:new             #33  <Class zzbbi>
	//   12   22:dup             
	//   13   23:ldc1            #34  <Int 0xda3360>
	//   14   25:iload           4
	//   15   27:iconst_1        
	//   16   28:aload_1         
	//   17   29:invokestatic    #40  <Method boolean xg.l(Context)>
	//   18   32:invokespecial   #43  <Method void zzbbi(int, int, boolean, boolean)>
	//   19   35:invokespecial   #180 <Method void aq(Context, zzwf, String, zzbbi)>
	//   20   38:areturn         
	}

	public bxu getMobileAdsSettingsManager(a a)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public bxu getMobileAdsSettingsManagerWithClientJarVersion(a a, int i)
	{
		a = ((a) ((Context)d.a(a)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #21  <Method Object d.a(a)>
	//    2    4:checkcast       #23  <Class Context>
	//    3    7:astore_1        
		aw.e();
	//    4    8:invokestatic    #29  <Method xg aw.e()>
	//    5   11:pop             
		return ((bxu) (com.google.android.gms.ads.internal.y.a(((Context) (a)), new zzbbi(0xda3360, i, true, xg.l(((Context) (a)))))));
	//    6   12:aload_1         
	//    7   13:new             #33  <Class zzbbi>
	//    8   16:dup             
	//    9   17:ldc1            #34  <Int 0xda3360>
	//   10   19:iload_2         
	//   11   20:iconst_1        
	//   12   21:aload_1         
	//   13   22:invokestatic    #40  <Method boolean xg.l(Context)>
	//   14   25:invokespecial   #43  <Method void zzbbi(int, int, boolean, boolean)>
	//   15   28:invokestatic    #189 <Method y com.google.android.gms.ads.internal.y.a(Context, zzbbi)>
	//   16   31:areturn         
	}
}
