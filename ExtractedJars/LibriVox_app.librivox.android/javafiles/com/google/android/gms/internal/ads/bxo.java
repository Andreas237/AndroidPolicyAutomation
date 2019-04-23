// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.c.b;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bcj, bxn, bxp, bck, 
//			zzwf, kn

public abstract class bxo extends bcj
	implements bxn
{

	public bxo()
	{
		super("com.google.android.gms.ads.internal.client.IClientApi");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IClientApi">
	//    2    3:invokespecial   #13  <Method void bcj(String)>
	//    3    6:return          
	}

	public static bxn asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IClientApi">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof bxn)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class bxn>
	//*  10   19:ifeq            27
			return (bxn)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class bxn>
	//   13   26:areturn         
		else
			return ((bxn) (new bxp(ibinder)));
	//   14   27:new             #24  <Class bxp>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void bxp(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 12: default 64
	//	               1 428
	//	               2 379
	//	               3 340
	//	               4 316
	//	               5 285
	//	               6 250
	//	               7 226
	//	               8 202
	//	               9 174
	//	               10 132
	//	               11 94
	//	               12 66
		default:
			return false;
	//    2   64:iconst_0        
	//    3   65:ireturn         

		case 12: // '\f'
			parcel = ((Parcel) (createRewardedVideoAdSku(b.a(parcel.readStrongBinder()), parcel.readInt())));
	//    4   66:aload_0         
	//    5   67:aload_2         
	//    6   68:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//    7   71:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//    8   74:aload_2         
	//    9   75:invokevirtual   #45  <Method int Parcel.readInt()>
	//   10   78:invokevirtual   #49  <Method tu createRewardedVideoAdSku(com.google.android.gms.c.a, int)>
	//   11   81:astore_2        
			parcel1.writeNoException();
	//   12   82:aload_3         
	//   13   83:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   14   86:aload_3         
	//   15   87:aload_2         
	//   16   88:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  17   91:goto            474
		case 11: // '\013'
			parcel = ((Parcel) (createNativeAdViewHolderDelegate(b.a(parcel.readStrongBinder()), b.a(parcel.readStrongBinder()), b.a(parcel.readStrongBinder()))));
	//   18   94:aload_0         
	//   19   95:aload_2         
	//   20   96:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   21   99:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   22  102:aload_2         
	//   23  103:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   24  106:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   25  109:aload_2         
	//   26  110:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   27  113:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   28  116:invokevirtual   #61  <Method co createNativeAdViewHolderDelegate(com.google.android.gms.c.a, com.google.android.gms.c.a, com.google.android.gms.c.a)>
	//   29  119:astore_2        
			parcel1.writeNoException();
	//   30  120:aload_3         
	//   31  121:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   32  124:aload_3         
	//   33  125:aload_2         
	//   34  126:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  35  129:goto            474
		case 10: // '\n'
			parcel = ((Parcel) (createSearchAdManager(b.a(parcel.readStrongBinder()), (zzwf)bck.a(parcel, zzwf.CREATOR), parcel.readString(), parcel.readInt())));
	//   36  132:aload_0         
	//   37  133:aload_2         
	//   38  134:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   39  137:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   40  140:aload_2         
	//   41  141:getstatic       #67  <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//   42  144:invokestatic    #70  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//   43  147:checkcast       #63  <Class zzwf>
	//   44  150:aload_2         
	//   45  151:invokevirtual   #74  <Method String Parcel.readString()>
	//   46  154:aload_2         
	//   47  155:invokevirtual   #45  <Method int Parcel.readInt()>
	//   48  158:invokevirtual   #78  <Method bxc createSearchAdManager(com.google.android.gms.c.a, zzwf, String, int)>
	//   49  161:astore_2        
			parcel1.writeNoException();
	//   50  162:aload_3         
	//   51  163:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   52  166:aload_3         
	//   53  167:aload_2         
	//   54  168:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  55  171:goto            474
		case 9: // '\t'
			parcel = ((Parcel) (getMobileAdsSettingsManagerWithClientJarVersion(b.a(parcel.readStrongBinder()), parcel.readInt())));
	//   56  174:aload_0         
	//   57  175:aload_2         
	//   58  176:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   59  179:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   60  182:aload_2         
	//   61  183:invokevirtual   #45  <Method int Parcel.readInt()>
	//   62  186:invokevirtual   #82  <Method bxu getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.c.a, int)>
	//   63  189:astore_2        
			parcel1.writeNoException();
	//   64  190:aload_3         
	//   65  191:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   66  194:aload_3         
	//   67  195:aload_2         
	//   68  196:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  69  199:goto            474
		case 8: // '\b'
			parcel = ((Parcel) (createAdOverlay(b.a(parcel.readStrongBinder()))));
	//   70  202:aload_0         
	//   71  203:aload_2         
	//   72  204:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   73  207:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   74  210:invokevirtual   #86  <Method nn createAdOverlay(com.google.android.gms.c.a)>
	//   75  213:astore_2        
			parcel1.writeNoException();
	//   76  214:aload_3         
	//   77  215:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   78  218:aload_3         
	//   79  219:aload_2         
	//   80  220:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  81  223:goto            474
		case 7: // '\007'
			parcel = ((Parcel) (createInAppPurchaseManager(b.a(parcel.readStrongBinder()))));
	//   82  226:aload_0         
	//   83  227:aload_2         
	//   84  228:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   85  231:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   86  234:invokevirtual   #90  <Method nx createInAppPurchaseManager(com.google.android.gms.c.a)>
	//   87  237:astore_2        
			parcel1.writeNoException();
	//   88  238:aload_3         
	//   89  239:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//   90  242:aload_3         
	//   91  243:aload_2         
	//   92  244:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//*  93  247:goto            474
		case 6: // '\006'
			parcel = ((Parcel) (createRewardedVideoAd(b.a(parcel.readStrongBinder()), kn.a(parcel.readStrongBinder()), parcel.readInt())));
	//   94  250:aload_0         
	//   95  251:aload_2         
	//   96  252:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//   97  255:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//   98  258:aload_2         
	//   99  259:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  100  262:invokestatic    #95  <Method km kn.a(IBinder)>
	//  101  265:aload_2         
	//  102  266:invokevirtual   #45  <Method int Parcel.readInt()>
	//  103  269:invokevirtual   #99  <Method tu createRewardedVideoAd(com.google.android.gms.c.a, km, int)>
	//  104  272:astore_2        
			parcel1.writeNoException();
	//  105  273:aload_3         
	//  106  274:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  107  277:aload_3         
	//  108  278:aload_2         
	//  109  279:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 110  282:goto            474
		case 5: // '\005'
			parcel = ((Parcel) (createNativeAdViewDelegate(b.a(parcel.readStrongBinder()), b.a(parcel.readStrongBinder()))));
	//  111  285:aload_0         
	//  112  286:aload_2         
	//  113  287:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  114  290:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  115  293:aload_2         
	//  116  294:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  117  297:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  118  300:invokevirtual   #103 <Method cj createNativeAdViewDelegate(com.google.android.gms.c.a, com.google.android.gms.c.a)>
	//  119  303:astore_2        
			parcel1.writeNoException();
	//  120  304:aload_3         
	//  121  305:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  122  308:aload_3         
	//  123  309:aload_2         
	//  124  310:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 125  313:goto            474
		case 4: // '\004'
			parcel = ((Parcel) (getMobileAdsSettingsManager(b.a(parcel.readStrongBinder()))));
	//  126  316:aload_0         
	//  127  317:aload_2         
	//  128  318:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  129  321:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  130  324:invokevirtual   #107 <Method bxu getMobileAdsSettingsManager(com.google.android.gms.c.a)>
	//  131  327:astore_2        
			parcel1.writeNoException();
	//  132  328:aload_3         
	//  133  329:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  134  332:aload_3         
	//  135  333:aload_2         
	//  136  334:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 137  337:goto            474
		case 3: // '\003'
			parcel = ((Parcel) (createAdLoaderBuilder(b.a(parcel.readStrongBinder()), parcel.readString(), kn.a(parcel.readStrongBinder()), parcel.readInt())));
	//  138  340:aload_0         
	//  139  341:aload_2         
	//  140  342:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  141  345:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  142  348:aload_2         
	//  143  349:invokevirtual   #74  <Method String Parcel.readString()>
	//  144  352:aload_2         
	//  145  353:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  146  356:invokestatic    #95  <Method km kn.a(IBinder)>
	//  147  359:aload_2         
	//  148  360:invokevirtual   #45  <Method int Parcel.readInt()>
	//  149  363:invokevirtual   #111 <Method bwx createAdLoaderBuilder(com.google.android.gms.c.a, String, km, int)>
	//  150  366:astore_2        
			parcel1.writeNoException();
	//  151  367:aload_3         
	//  152  368:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  153  371:aload_3         
	//  154  372:aload_2         
	//  155  373:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 156  376:goto            474
		case 2: // '\002'
			parcel = ((Parcel) (createInterstitialAdManager(b.a(parcel.readStrongBinder()), (zzwf)bck.a(parcel, zzwf.CREATOR), parcel.readString(), kn.a(parcel.readStrongBinder()), parcel.readInt())));
	//  157  379:aload_0         
	//  158  380:aload_2         
	//  159  381:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  160  384:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  161  387:aload_2         
	//  162  388:getstatic       #67  <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//  163  391:invokestatic    #70  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  164  394:checkcast       #63  <Class zzwf>
	//  165  397:aload_2         
	//  166  398:invokevirtual   #74  <Method String Parcel.readString()>
	//  167  401:aload_2         
	//  168  402:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  169  405:invokestatic    #95  <Method km kn.a(IBinder)>
	//  170  408:aload_2         
	//  171  409:invokevirtual   #45  <Method int Parcel.readInt()>
	//  172  412:invokevirtual   #115 <Method bxc createInterstitialAdManager(com.google.android.gms.c.a, zzwf, String, km, int)>
	//  173  415:astore_2        
			parcel1.writeNoException();
	//  174  416:aload_3         
	//  175  417:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  176  420:aload_3         
	//  177  421:aload_2         
	//  178  422:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;

	//* 179  425:goto            474
		case 1: // '\001'
			parcel = ((Parcel) (createBannerAdManager(b.a(parcel.readStrongBinder()), (zzwf)bck.a(parcel, zzwf.CREATOR), parcel.readString(), kn.a(parcel.readStrongBinder()), parcel.readInt())));
	//  180  428:aload_0         
	//  181  429:aload_2         
	//  182  430:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  183  433:invokestatic    #41  <Method com.google.android.gms.c.a b.a(IBinder)>
	//  184  436:aload_2         
	//  185  437:getstatic       #67  <Field android.os.Parcelable$Creator zzwf.CREATOR>
	//  186  440:invokestatic    #70  <Method android.os.Parcelable bck.a(Parcel, android.os.Parcelable$Creator)>
	//  187  443:checkcast       #63  <Class zzwf>
	//  188  446:aload_2         
	//  189  447:invokevirtual   #74  <Method String Parcel.readString()>
	//  190  450:aload_2         
	//  191  451:invokevirtual   #35  <Method IBinder Parcel.readStrongBinder()>
	//  192  454:invokestatic    #95  <Method km kn.a(IBinder)>
	//  193  457:aload_2         
	//  194  458:invokevirtual   #45  <Method int Parcel.readInt()>
	//  195  461:invokevirtual   #118 <Method bxc createBannerAdManager(com.google.android.gms.c.a, zzwf, String, km, int)>
	//  196  464:astore_2        
			parcel1.writeNoException();
	//  197  465:aload_3         
	//  198  466:invokevirtual   #52  <Method void Parcel.writeNoException()>
			bck.a(parcel1, ((android.os.IInterface) (parcel)));
	//  199  469:aload_3         
	//  200  470:aload_2         
	//  201  471:invokestatic    #57  <Method void bck.a(Parcel, android.os.IInterface)>
			break;
		}
		return true;
	//  202  474:iconst_1        
	//  203  475:ireturn         
	}
}
