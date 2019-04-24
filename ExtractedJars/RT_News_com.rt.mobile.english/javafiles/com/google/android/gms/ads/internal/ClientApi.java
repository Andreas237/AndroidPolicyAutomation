// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzq;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.overlay.zzs;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.*;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal:
//			zzbv, zzak, zzw, zzy, 
//			zzal, zzbp, zzay

public class ClientApi extends zzle
{

	public ClientApi()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void zzle()>
	//    2    4:return          
	}

	public zzkn createAdLoaderBuilder(IObjectWrapper iobjectwrapper, String s, zzxn zzxn, int i)
	{
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #25  <Class Context>
	//    3    7:astore_1        
		zzbv.zzek();
	//    4    8:invokestatic    #31  <Method zzakk zzbv.zzek()>
	//    5   11:pop             
		return ((zzkn) (new zzak(((Context) (iobjectwrapper)), s, zzxn, new zzang(0xbdfcb8, i, true, zzakk.zzav(((Context) (iobjectwrapper)))), zzw.zzc(((Context) (iobjectwrapper))))));
	//    6   12:new             #33  <Class zzak>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:new             #35  <Class zzang>
	//   12   22:dup             
	//   13   23:ldc1            #36  <Int 0xbdfcb8>
	//   14   25:iload           4
	//   15   27:iconst_1        
	//   16   28:aload_1         
	//   17   29:invokestatic    #42  <Method boolean zzakk.zzav(Context)>
	//   18   32:invokespecial   #45  <Method void zzang(int, int, boolean, boolean)>
	//   19   35:aload_1         
	//   20   36:invokestatic    #51  <Method zzw zzw.zzc(Context)>
	//   21   39:invokespecial   #54  <Method void zzak(Context, String, zzxn, zzang, zzw)>
	//   22   42:areturn         
	}

	public zzaap createAdOverlay(IObjectWrapper iobjectwrapper)
	{
		iobjectwrapper = ((IObjectWrapper) ((Activity)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #58  <Class Activity>
	//    3    7:astore_1        
		AdOverlayInfoParcel adoverlayinfoparcel = AdOverlayInfoParcel.zzc(((Activity) (iobjectwrapper)).getIntent());
	//    4    8:aload_1         
	//    5    9:invokevirtual   #62  <Method android.content.Intent Activity.getIntent()>
	//    6   12:invokestatic    #67  <Method AdOverlayInfoParcel AdOverlayInfoParcel.zzc(android.content.Intent)>
	//    7   15:astore_2        
		if(adoverlayinfoparcel == null)
	//*   8   16:aload_2         
	//*   9   17:ifnonnull       29
			return ((zzaap) (new zzr(((Activity) (iobjectwrapper)))));
	//   10   20:new             #69  <Class zzr>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:invokespecial   #72  <Method void zzr(Activity)>
	//   14   28:areturn         
		switch(adoverlayinfoparcel.zzbyu)
	//*  15   29:aload_2         
	//*  16   30:getfield        #76  <Field int AdOverlayInfoParcel.zzbyu>
		{
	//*  17   33:tableswitch     1 4: default 64
	//	               1 101
	//	               2 92
	//	               3 83
	//	               4 73
		default:
			return ((zzaap) (new zzr(((Activity) (iobjectwrapper)))));
	//   18   64:new             #69  <Class zzr>
	//   19   67:dup             
	//   20   68:aload_1         
	//   21   69:invokespecial   #72  <Method void zzr(Activity)>
	//   22   72:areturn         

		case 4: // '\004'
			return ((zzaap) (new zzs(((Activity) (iobjectwrapper)), adoverlayinfoparcel)));
	//   23   73:new             #78  <Class zzs>
	//   24   76:dup             
	//   25   77:aload_1         
	//   26   78:aload_2         
	//   27   79:invokespecial   #81  <Method void zzs(Activity, AdOverlayInfoParcel)>
	//   28   82:areturn         

		case 3: // '\003'
			return ((zzaap) (new zzy(((Activity) (iobjectwrapper)))));
	//   29   83:new             #83  <Class zzy>
	//   30   86:dup             
	//   31   87:aload_1         
	//   32   88:invokespecial   #84  <Method void zzy(Activity)>
	//   33   91:areturn         

		case 2: // '\002'
			return ((zzaap) (new zzx(((Activity) (iobjectwrapper)))));
	//   34   92:new             #86  <Class zzx>
	//   35   95:dup             
	//   36   96:aload_1         
	//   37   97:invokespecial   #87  <Method void zzx(Activity)>
	//   38  100:areturn         

		case 1: // '\001'
			return ((zzaap) (new zzq(((Activity) (iobjectwrapper)))));
	//   39  101:new             #89  <Class zzq>
	//   40  104:dup             
	//   41  105:aload_1         
	//   42  106:invokespecial   #90  <Method void zzq(Activity)>
	//   43  109:areturn         
		}
	}

	public zzks createBannerAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn1, String s, zzxn zzxn, int i)
		throws RemoteException
	{
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #25  <Class Context>
	//    3    7:astore_1        
		zzbv.zzek();
	//    4    8:invokestatic    #31  <Method zzakk zzbv.zzek()>
	//    5   11:pop             
		return ((zzks) (new com.google.android.gms.ads.internal.zzy(((Context) (iobjectwrapper)), zzjn1, s, zzxn, new zzang(0xbdfcb8, i, true, zzakk.zzav(((Context) (iobjectwrapper)))), zzw.zzc(((Context) (iobjectwrapper))))));
	//    6   12:new             #96  <Class com.google.android.gms.ads.internal.zzy>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:aload           4
	//   12   21:new             #35  <Class zzang>
	//   13   24:dup             
	//   14   25:ldc1            #36  <Int 0xbdfcb8>
	//   15   27:iload           5
	//   16   29:iconst_1        
	//   17   30:aload_1         
	//   18   31:invokestatic    #42  <Method boolean zzakk.zzav(Context)>
	//   19   34:invokespecial   #45  <Method void zzang(int, int, boolean, boolean)>
	//   20   37:aload_1         
	//   21   38:invokestatic    #51  <Method zzw zzw.zzc(Context)>
	//   22   41:invokespecial   #99  <Method void com.google.android.gms.ads.internal.zzy(Context, zzjn, String, zzxn, zzang, zzw)>
	//   23   44:areturn         
	}

	public zzaaz createInAppPurchaseManager(IObjectWrapper iobjectwrapper)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public zzks createInterstitialAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn1, String s, zzxn zzxn, int i)
		throws RemoteException
	{
		zzang zzang1;
label0:
		{
			iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #25  <Class Context>
	//    3    7:astore_1        
			zznk.initialize(((Context) (iobjectwrapper)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #109 <Method void zznk.initialize(Context)>
			zzbv.zzek();
	//    6   12:invokestatic    #31  <Method zzakk zzbv.zzek()>
	//    7   15:pop             
			boolean flag1 = zzakk.zzav(((Context) (iobjectwrapper)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #42  <Method boolean zzakk.zzav(Context)>
	//   10   20:istore          7
			boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore          6
			zzang1 = new zzang(0xbdfcb8, i, true, flag1);
	//   13   25:new             #35  <Class zzang>
	//   14   28:dup             
	//   15   29:ldc1            #36  <Int 0xbdfcb8>
	//   16   31:iload           5
	//   17   33:iconst_1        
	//   18   34:iload           7
	//   19   36:invokespecial   #45  <Method void zzang(int, int, boolean, boolean)>
	//   20   39:astore          8
			flag1 = "reward_mb".equals(((Object) (zzjn1.zzarb)));
	//   21   41:ldc1            #111 <String "reward_mb">
	//   22   43:aload_2         
	//   23   44:getfield        #117 <Field String zzjn.zzarb>
	//   24   47:invokevirtual   #123 <Method boolean String.equals(Object)>
	//   25   50:istore          7
			if(!flag1)
	//*  26   52:iload           7
	//*  27   54:ifne            83
			{
				com.google.android.gms.internal.ads.zzna zzna = zznk.zzayy;
	//   28   57:getstatic       #127 <Field com.google.android.gms.internal.ads.zzna zznk.zzayy>
	//   29   60:astore          9
				i = ((int) (flag));
	//   30   62:iload           6
	//   31   64:istore          5
				if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
					break label0;
	//   32   66:invokestatic    #133 <Method zzni zzkb.zzik()>
	//   33   69:aload           9
	//   34   71:invokevirtual   #139 <Method Object zzni.zzd(com.google.android.gms.internal.ads.zzna)>
	//   35   74:checkcast       #141 <Class Boolean>
	//   36   77:invokevirtual   #145 <Method boolean Boolean.booleanValue()>
	//   37   80:ifne            120
			}
			if(flag1)
	//*  38   83:iload           7
	//*  39   85:ifeq            117
			{
				com.google.android.gms.internal.ads.zzna zzna1 = zznk.zzayz;
	//   40   88:getstatic       #148 <Field com.google.android.gms.internal.ads.zzna zznk.zzayz>
	//   41   91:astore          9
				if(((Boolean)zzkb.zzik().zzd(zzna1)).booleanValue())
	//*  42   93:invokestatic    #133 <Method zzni zzkb.zzik()>
	//*  43   96:aload           9
	//*  44   98:invokevirtual   #139 <Method Object zzni.zzd(com.google.android.gms.internal.ads.zzna)>
	//*  45  101:checkcast       #141 <Class Boolean>
	//*  46  104:invokevirtual   #145 <Method boolean Boolean.booleanValue()>
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
			return ((zzks) (new zzub(((Context) (iobjectwrapper)), s, zzxn, zzang1, zzw.zzc(((Context) (iobjectwrapper))))));
	//   55  125:new             #150 <Class zzub>
	//   56  128:dup             
	//   57  129:aload_1         
	//   58  130:aload_3         
	//   59  131:aload           4
	//   60  133:aload           8
	//   61  135:aload_1         
	//   62  136:invokestatic    #51  <Method zzw zzw.zzc(Context)>
	//   63  139:invokespecial   #151 <Method void zzub(Context, String, zzxn, zzang, zzw)>
	//   64  142:areturn         
		else
			return ((zzks) (new zzal(((Context) (iobjectwrapper)), zzjn1, s, zzxn, zzang1, zzw.zzc(((Context) (iobjectwrapper))))));
	//   65  143:new             #153 <Class zzal>
	//   66  146:dup             
	//   67  147:aload_1         
	//   68  148:aload_2         
	//   69  149:aload_3         
	//   70  150:aload           4
	//   71  152:aload           8
	//   72  154:aload_1         
	//   73  155:invokestatic    #51  <Method zzw zzw.zzc(Context)>
	//   74  158:invokespecial   #154 <Method void zzal(Context, zzjn, String, zzxn, zzang, zzw)>
	//   75  161:areturn         
	}

	public zzqa createNativeAdViewDelegate(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1)
	{
		return ((zzqa) (new zzpn((FrameLayout)ObjectWrapper.unwrap(iobjectwrapper), (FrameLayout)ObjectWrapper.unwrap(iobjectwrapper1))));
	//    0    0:new             #158 <Class zzpn>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #160 <Class FrameLayout>
	//    5   11:aload_2         
	//    6   12:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    7   15:checkcast       #160 <Class FrameLayout>
	//    8   18:invokespecial   #163 <Method void zzpn(FrameLayout, FrameLayout)>
	//    9   21:areturn         
	}

	public zzqf createNativeAdViewHolderDelegate(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2)
	{
		return ((zzqf) (new zzpp((View)ObjectWrapper.unwrap(iobjectwrapper), (HashMap)ObjectWrapper.unwrap(iobjectwrapper1), (HashMap)ObjectWrapper.unwrap(iobjectwrapper2))));
	//    0    0:new             #167 <Class zzpp>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    4    8:checkcast       #169 <Class View>
	//    5   11:aload_2         
	//    6   12:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    7   15:checkcast       #171 <Class HashMap>
	//    8   18:aload_3         
	//    9   19:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   10   22:checkcast       #171 <Class HashMap>
	//   11   25:invokespecial   #174 <Method void zzpp(View, HashMap, HashMap)>
	//   12   28:areturn         
	}

	public zzagz createRewardedVideoAd(IObjectWrapper iobjectwrapper, zzxn zzxn, int i)
	{
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #25  <Class Context>
	//    3    7:astore_1        
		zzbv.zzek();
	//    4    8:invokestatic    #31  <Method zzakk zzbv.zzek()>
	//    5   11:pop             
		zzang zzang1 = new zzang(0xbdfcb8, i, true, zzakk.zzav(((Context) (iobjectwrapper))));
	//    6   12:new             #35  <Class zzang>
	//    7   15:dup             
	//    8   16:ldc1            #36  <Int 0xbdfcb8>
	//    9   18:iload_3         
	//   10   19:iconst_1        
	//   11   20:aload_1         
	//   12   21:invokestatic    #42  <Method boolean zzakk.zzav(Context)>
	//   13   24:invokespecial   #45  <Method void zzang(int, int, boolean, boolean)>
	//   14   27:astore          4
		return ((zzagz) (new zzagq(((Context) (iobjectwrapper)), zzw.zzc(((Context) (iobjectwrapper))), zzxn, zzang1)));
	//   15   29:new             #178 <Class zzagq>
	//   16   32:dup             
	//   17   33:aload_1         
	//   18   34:aload_1         
	//   19   35:invokestatic    #51  <Method zzw zzw.zzc(Context)>
	//   20   38:aload_2         
	//   21   39:aload           4
	//   22   41:invokespecial   #181 <Method void zzagq(Context, zzw, zzxn, zzang)>
	//   23   44:areturn         
	}

	public zzks createSearchAdManager(IObjectWrapper iobjectwrapper, zzjn zzjn1, String s, int i)
		throws RemoteException
	{
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #25  <Class Context>
	//    3    7:astore_1        
		zzbv.zzek();
	//    4    8:invokestatic    #31  <Method zzakk zzbv.zzek()>
	//    5   11:pop             
		return ((zzks) (new zzbp(((Context) (iobjectwrapper)), zzjn1, s, new zzang(0xbdfcb8, i, true, zzakk.zzav(((Context) (iobjectwrapper)))))));
	//    6   12:new             #185 <Class zzbp>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:aload_3         
	//   11   19:new             #35  <Class zzang>
	//   12   22:dup             
	//   13   23:ldc1            #36  <Int 0xbdfcb8>
	//   14   25:iload           4
	//   15   27:iconst_1        
	//   16   28:aload_1         
	//   17   29:invokestatic    #42  <Method boolean zzakk.zzav(Context)>
	//   18   32:invokespecial   #45  <Method void zzang(int, int, boolean, boolean)>
	//   19   35:invokespecial   #188 <Method void zzbp(Context, zzjn, String, zzang)>
	//   20   38:areturn         
	}

	public zzlj getMobileAdsSettingsManager(IObjectWrapper iobjectwrapper)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public zzlj getMobileAdsSettingsManagerWithClientJarVersion(IObjectWrapper iobjectwrapper, int i)
	{
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//    2    4:checkcast       #25  <Class Context>
	//    3    7:astore_1        
		zzbv.zzek();
	//    4    8:invokestatic    #31  <Method zzakk zzbv.zzek()>
	//    5   11:pop             
		return ((zzlj) (zzay.zza(((Context) (iobjectwrapper)), new zzang(0xbdfcb8, i, true, zzakk.zzav(((Context) (iobjectwrapper)))))));
	//    6   12:aload_1         
	//    7   13:new             #35  <Class zzang>
	//    8   16:dup             
	//    9   17:ldc1            #36  <Int 0xbdfcb8>
	//   10   19:iload_2         
	//   11   20:iconst_1        
	//   12   21:aload_1         
	//   13   22:invokestatic    #42  <Method boolean zzakk.zzav(Context)>
	//   14   25:invokespecial   #45  <Method void zzang(int, int, boolean, boolean)>
	//   15   28:invokestatic    #200 <Method zzay zzay.zza(Context, zzang)>
	//   16   31:areturn         
	}
}
