// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzld, zzlf, zzjn, 
//			zzel, zzxo

public abstract class zzle extends zzek
	implements zzld
{

	public zzle()
	{
		super("com.google.android.gms.ads.internal.client.IClientApi");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IClientApi">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzld asInterface(IBinder ibinder)
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
		if(iinterface instanceof zzld)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzld>
	//*  10   19:ifeq            27
			return (zzld)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzld>
	//   13   26:areturn         
		else
			return ((zzld) (new zzlf(ibinder)));
	//   14   27:new             #24  <Class zzlf>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzlf(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 11: default 60
	//	               1 306
	//	               2 266
	//	               3 236
	//	               4 221
	//	               5 199
	//	               6 173
	//	               7 158
	//	               8 143
	//	               9 124
	//	               10 91
	//	               11 62
		default:
			return false;
	//    2   60:iconst_0        
	//    3   61:ireturn         

		case 11: // '\013'
			parcel = ((Parcel) (createNativeAdViewHolderDelegate(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()))));
	//    4   62:aload_0         
	//    5   63:aload_2         
	//    6   64:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//    7   67:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    8   70:aload_2         
	//    9   71:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   10   74:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   11   77:aload_2         
	//   12   78:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   13   81:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   14   84:invokevirtual   #46  <Method zzqf createNativeAdViewHolderDelegate(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
	//   15   87:astore_2        
			break;

	//*  16   88:goto            343
		case 10: // '\n'
			parcel = ((Parcel) (createSearchAdManager(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzjn)zzel.zza(parcel, zzjn.CREATOR), parcel.readString(), parcel.readInt())));
	//   17   91:aload_0         
	//   18   92:aload_2         
	//   19   93:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   20   96:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   21   99:aload_2         
	//   22  100:getstatic       #52  <Field android.os.Parcelable$Creator zzjn.CREATOR>
	//   23  103:invokestatic    #58  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   24  106:checkcast       #48  <Class zzjn>
	//   25  109:aload_2         
	//   26  110:invokevirtual   #62  <Method String Parcel.readString()>
	//   27  113:aload_2         
	//   28  114:invokevirtual   #66  <Method int Parcel.readInt()>
	//   29  117:invokevirtual   #70  <Method zzks createSearchAdManager(com.google.android.gms.dynamic.IObjectWrapper, zzjn, String, int)>
	//   30  120:astore_2        
			break;

	//*  31  121:goto            343
		case 9: // '\t'
			parcel = ((Parcel) (getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt())));
	//   32  124:aload_0         
	//   33  125:aload_2         
	//   34  126:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   35  129:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   36  132:aload_2         
	//   37  133:invokevirtual   #66  <Method int Parcel.readInt()>
	//   38  136:invokevirtual   #74  <Method zzlj getMobileAdsSettingsManagerWithClientJarVersion(com.google.android.gms.dynamic.IObjectWrapper, int)>
	//   39  139:astore_2        
			break;

	//*  40  140:goto            343
		case 8: // '\b'
			parcel = ((Parcel) (createAdOverlay(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()))));
	//   41  143:aload_0         
	//   42  144:aload_2         
	//   43  145:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   44  148:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   45  151:invokevirtual   #78  <Method zzaap createAdOverlay(com.google.android.gms.dynamic.IObjectWrapper)>
	//   46  154:astore_2        
			break;

	//*  47  155:goto            343
		case 7: // '\007'
			parcel = ((Parcel) (createInAppPurchaseManager(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()))));
	//   48  158:aload_0         
	//   49  159:aload_2         
	//   50  160:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   51  163:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   52  166:invokevirtual   #82  <Method zzaaz createInAppPurchaseManager(com.google.android.gms.dynamic.IObjectWrapper)>
	//   53  169:astore_2        
			break;

	//*  54  170:goto            343
		case 6: // '\006'
			parcel = ((Parcel) (createRewardedVideoAd(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzxo.zzr(parcel.readStrongBinder()), parcel.readInt())));
	//   55  173:aload_0         
	//   56  174:aload_2         
	//   57  175:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   58  178:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   59  181:aload_2         
	//   60  182:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   61  185:invokestatic    #88  <Method zzxn zzxo.zzr(IBinder)>
	//   62  188:aload_2         
	//   63  189:invokevirtual   #66  <Method int Parcel.readInt()>
	//   64  192:invokevirtual   #92  <Method zzagz createRewardedVideoAd(com.google.android.gms.dynamic.IObjectWrapper, zzxn, int)>
	//   65  195:astore_2        
			break;

	//*  66  196:goto            343
		case 5: // '\005'
			parcel = ((Parcel) (createNativeAdViewDelegate(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()))));
	//   67  199:aload_0         
	//   68  200:aload_2         
	//   69  201:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   70  204:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   71  207:aload_2         
	//   72  208:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   73  211:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   74  214:invokevirtual   #96  <Method zzqa createNativeAdViewDelegate(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
	//   75  217:astore_2        
			break;

	//*  76  218:goto            343
		case 4: // '\004'
			parcel = ((Parcel) (getMobileAdsSettingsManager(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()))));
	//   77  221:aload_0         
	//   78  222:aload_2         
	//   79  223:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   80  226:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   81  229:invokevirtual   #100 <Method zzlj getMobileAdsSettingsManager(com.google.android.gms.dynamic.IObjectWrapper)>
	//   82  232:astore_2        
			break;

	//*  83  233:goto            343
		case 3: // '\003'
			parcel = ((Parcel) (createAdLoaderBuilder(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzxo.zzr(parcel.readStrongBinder()), parcel.readInt())));
	//   84  236:aload_0         
	//   85  237:aload_2         
	//   86  238:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   87  241:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   88  244:aload_2         
	//   89  245:invokevirtual   #62  <Method String Parcel.readString()>
	//   90  248:aload_2         
	//   91  249:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   92  252:invokestatic    #88  <Method zzxn zzxo.zzr(IBinder)>
	//   93  255:aload_2         
	//   94  256:invokevirtual   #66  <Method int Parcel.readInt()>
	//   95  259:invokevirtual   #104 <Method zzkn createAdLoaderBuilder(com.google.android.gms.dynamic.IObjectWrapper, String, zzxn, int)>
	//   96  262:astore_2        
			break;

	//*  97  263:goto            343
		case 2: // '\002'
			parcel = ((Parcel) (createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzjn)zzel.zza(parcel, zzjn.CREATOR), parcel.readString(), zzxo.zzr(parcel.readStrongBinder()), parcel.readInt())));
	//   98  266:aload_0         
	//   99  267:aload_2         
	//  100  268:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//  101  271:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//  102  274:aload_2         
	//  103  275:getstatic       #52  <Field android.os.Parcelable$Creator zzjn.CREATOR>
	//  104  278:invokestatic    #58  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//  105  281:checkcast       #48  <Class zzjn>
	//  106  284:aload_2         
	//  107  285:invokevirtual   #62  <Method String Parcel.readString()>
	//  108  288:aload_2         
	//  109  289:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//  110  292:invokestatic    #88  <Method zzxn zzxo.zzr(IBinder)>
	//  111  295:aload_2         
	//  112  296:invokevirtual   #66  <Method int Parcel.readInt()>
	//  113  299:invokevirtual   #108 <Method zzks createInterstitialAdManager(com.google.android.gms.dynamic.IObjectWrapper, zzjn, String, zzxn, int)>
	//  114  302:astore_2        
			break;

	//* 115  303:goto            343
		case 1: // '\001'
			parcel = ((Parcel) (createBannerAdManager(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (zzjn)zzel.zza(parcel, zzjn.CREATOR), parcel.readString(), zzxo.zzr(parcel.readStrongBinder()), parcel.readInt())));
	//  116  306:aload_0         
	//  117  307:aload_2         
	//  118  308:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//  119  311:invokestatic    #42  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//  120  314:aload_2         
	//  121  315:getstatic       #52  <Field android.os.Parcelable$Creator zzjn.CREATOR>
	//  122  318:invokestatic    #58  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//  123  321:checkcast       #48  <Class zzjn>
	//  124  324:aload_2         
	//  125  325:invokevirtual   #62  <Method String Parcel.readString()>
	//  126  328:aload_2         
	//  127  329:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//  128  332:invokestatic    #88  <Method zzxn zzxo.zzr(IBinder)>
	//  129  335:aload_2         
	//  130  336:invokevirtual   #66  <Method int Parcel.readInt()>
	//  131  339:invokevirtual   #111 <Method zzks createBannerAdManager(com.google.android.gms.dynamic.IObjectWrapper, zzjn, String, zzxn, int)>
	//  132  342:astore_2        
			break;
		}
		parcel1.writeNoException();
	//  133  343:aload_3         
	//  134  344:invokevirtual   #114 <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  135  347:aload_3         
	//  136  348:aload_2         
	//  137  349:invokestatic    #117 <Method void zzel.zza(Parcel, android.os.IInterface)>
		return true;
	//  138  352:iconst_1        
	//  139  353:ireturn         
	}
}
