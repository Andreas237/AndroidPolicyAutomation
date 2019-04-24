// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzzj, zzzl, zzel, 
//			zzzh, zzzi, zzxu, zzzf, 
//			zzzg, zzjn, zzzm, zzzn

public abstract class zzzk extends zzek
	implements zzzj
{

	public zzzk()
	{
		super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzzj zzt(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzzj)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzzj>
	//*  10   19:ifeq            27
			return (zzzj)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzzj>
	//   13   26:areturn         
		else
			return ((zzzj) (new zzzl(ibinder)));
	//   14   27:new             #24  <Class zzzl>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzzl(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		Object obj;
		byte abyte0[];
		String s1;
		abyte0 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		s1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          5
		i;
	//    6    9:iload_1         
		JVM INSTR tableswitch 1 7: default 52
	//	               1 349
	//	               2 332
	//	               3 324
	//	               4 196
	//	               5 179
	//	               6 65
	//	               7 54;
	//    7   10:tableswitch     1 7: default 52
	//	               1 349
	//	               2 332
	//	               3 324
	//	               4 196
	//	               5 179
	//	               6 65
	//	               7 54
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		return false;
	//    8   52:iconst_0        
	//    9   53:ireturn         
_L8:
		showInterstitial();
	//   10   54:aload_0         
	//   11   55:invokevirtual   #34  <Method void showInterstitial()>
_L10:
		parcel1.writeNoException();
	//   12   58:aload_3         
	//   13   59:invokevirtual   #39  <Method void Parcel.writeNoException()>
		break; /* Loop/switch isn't completed */
	//   14   62:goto            441
_L7:
		abyte0 = parcel.createByteArray();
	//   15   65:aload_2         
	//   16   66:invokevirtual   #43  <Method byte[] Parcel.createByteArray()>
	//   17   69:astore          6
		s1 = parcel.readString();
	//   18   71:aload_2         
	//   19   72:invokevirtual   #47  <Method String Parcel.readString()>
	//   20   75:astore          7
		Bundle bundle = (Bundle)zzel.zza(parcel, Bundle.CREATOR);
	//   21   77:aload_2         
	//   22   78:getstatic       #53  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   23   81:invokestatic    #59  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   24   84:checkcast       #49  <Class Bundle>
	//   25   87:astore          8
		com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//   26   89:aload_2         
	//   27   90:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//   28   93:invokestatic    #69  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   29   96:astore          9
		IBinder ibinder = parcel.readStrongBinder();
	//   30   98:aload_2         
	//   31   99:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//   32  102:astore          10
		if(ibinder != null)
	//*  33  104:aload           10
	//*  34  106:ifnonnull       112
	//*  35  109:goto            155
		{
			obj = ((Object) (ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback")));
	//   36  112:aload           10
	//   37  114:ldc1            #71  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback">
	//   38  116:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   39  121:astore          5
			if(obj instanceof zzzh)
	//*  40  123:aload           5
	//*  41  125:instanceof      #73  <Class zzzh>
	//*  42  128:ifeq            141
				obj = ((Object) ((zzzh)obj));
	//   43  131:aload           5
	//   44  133:checkcast       #73  <Class zzzh>
	//   45  136:astore          5
			else
	//*  46  138:goto            109
				obj = ((Object) (new zzzi(ibinder)));
	//   47  141:new             #75  <Class zzzi>
	//   48  144:dup             
	//   49  145:aload           10
	//   50  147:invokespecial   #76  <Method void zzzi(IBinder)>
	//   51  150:astore          5
		}
	//*  52  152:goto            109
		zza(abyte0, s1, bundle, iobjectwrapper1, ((zzzh) (obj)), zzxu.zzs(parcel.readStrongBinder()));
	//   53  155:aload_0         
	//   54  156:aload           6
	//   55  158:aload           7
	//   56  160:aload           8
	//   57  162:aload           9
	//   58  164:aload           5
	//   59  166:aload_2         
	//   60  167:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//   61  170:invokestatic    #82  <Method zzxt zzxu.zzs(IBinder)>
	//   62  173:invokevirtual   #85  <Method void zza(byte[], String, Bundle, com.google.android.gms.dynamic.IObjectWrapper, zzzh, zzxt)>
		continue; /* Loop/switch isn't completed */
	//   63  176:goto            58
_L6:
		parcel = ((Parcel) (getVideoController()));
	//   64  179:aload_0         
	//   65  180:invokevirtual   #89  <Method zzlo getVideoController()>
	//   66  183:astore_2        
		parcel1.writeNoException();
	//   67  184:aload_3         
	//   68  185:invokevirtual   #39  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   69  188:aload_3         
	//   70  189:aload_2         
	//   71  190:invokestatic    #92  <Method void zzel.zza(Parcel, android.os.IInterface)>
		break; /* Loop/switch isn't completed */
	//   72  193:goto            441
_L5:
		s1 = ((String) (parcel.createByteArray()));
	//   73  196:aload_2         
	//   74  197:invokevirtual   #43  <Method byte[] Parcel.createByteArray()>
	//   75  200:astore          7
		String s2 = parcel.readString();
	//   76  202:aload_2         
	//   77  203:invokevirtual   #47  <Method String Parcel.readString()>
	//   78  206:astore          8
		Bundle bundle2 = (Bundle)zzel.zza(parcel, Bundle.CREATOR);
	//   79  208:aload_2         
	//   80  209:getstatic       #53  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//   81  212:invokestatic    #59  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   82  215:checkcast       #49  <Class Bundle>
	//   83  218:astore          9
		com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper2 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//   84  220:aload_2         
	//   85  221:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//   86  224:invokestatic    #69  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   87  227:astore          10
		Object obj1 = ((Object) (parcel.readStrongBinder()));
	//   88  229:aload_2         
	//   89  230:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//   90  233:astore          5
		if(obj1 == null)
	//*  91  235:aload           5
	//*  92  237:ifnonnull       247
		{
			obj1 = ((Object) (abyte0));
	//   93  240:aload           6
	//   94  242:astore          5
		} else
	//*  95  244:goto            290
		{
			android.os.IInterface iinterface = ((IBinder) (obj1)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
	//   96  247:aload           5
	//   97  249:ldc1            #94  <String "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback">
	//   98  251:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   99  256:astore          6
			if(iinterface instanceof zzzf)
	//* 100  258:aload           6
	//* 101  260:instanceof      #96  <Class zzzf>
	//* 102  263:ifeq            276
				obj1 = ((Object) ((zzzf)iinterface));
	//  103  266:aload           6
	//  104  268:checkcast       #96  <Class zzzf>
	//  105  271:astore          5
			else
	//* 106  273:goto            244
				obj1 = ((Object) (new zzzg(((IBinder) (obj1)))));
	//  107  276:new             #98  <Class zzzg>
	//  108  279:dup             
	//  109  280:aload           5
	//  110  282:invokespecial   #99  <Method void zzzg(IBinder)>
	//  111  285:astore          5
		}
	//* 112  287:goto            244
		zza(((byte []) (s1)), s2, bundle2, iobjectwrapper2, ((zzzf) (obj1)), zzxu.zzs(parcel.readStrongBinder()), (zzjn)zzel.zza(parcel, zzjn.CREATOR));
	//  113  290:aload_0         
	//  114  291:aload           7
	//  115  293:aload           8
	//  116  295:aload           9
	//  117  297:aload           10
	//  118  299:aload           5
	//  119  301:aload_2         
	//  120  302:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//  121  305:invokestatic    #82  <Method zzxt zzxu.zzs(IBinder)>
	//  122  308:aload_2         
	//  123  309:getstatic       #102 <Field android.os.Parcelable$Creator zzjn.CREATOR>
	//  124  312:invokestatic    #59  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//  125  315:checkcast       #101 <Class zzjn>
	//  126  318:invokevirtual   #105 <Method void zza(byte[], String, Bundle, com.google.android.gms.dynamic.IObjectWrapper, zzzf, zzxt, zzjn)>
		continue; /* Loop/switch isn't completed */
	//  127  321:goto            58
_L4:
		parcel = ((Parcel) (zznd()));
	//  128  324:aload_0         
	//  129  325:invokevirtual   #109 <Method zzzt zznd()>
	//  130  328:astore_2        
		break; /* Loop/switch isn't completed */
	//  131  329:goto            337
_L3:
		parcel = ((Parcel) (zznc()));
	//  132  332:aload_0         
	//  133  333:invokevirtual   #112 <Method zzzt zznc()>
	//  134  336:astore_2        
		parcel1.writeNoException();
	//  135  337:aload_3         
	//  136  338:invokevirtual   #39  <Method void Parcel.writeNoException()>
		zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//  137  341:aload_3         
	//  138  342:aload_2         
	//  139  343:invokestatic    #116 <Method void zzel.zzb(Parcel, android.os.Parcelable)>
		break; /* Loop/switch isn't completed */
	//  140  346:goto            441
_L2:
		com.google.android.gms.dynamic.IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//  141  349:aload_2         
	//  142  350:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//  143  353:invokestatic    #69  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//  144  356:astore          5
		String s = parcel.readString();
	//  145  358:aload_2         
	//  146  359:invokevirtual   #47  <Method String Parcel.readString()>
	//  147  362:astore          6
		Bundle bundle1 = (Bundle)zzel.zza(parcel, Bundle.CREATOR);
	//  148  364:aload_2         
	//  149  365:getstatic       #53  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//  150  368:invokestatic    #59  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//  151  371:checkcast       #49  <Class Bundle>
	//  152  374:astore          8
		parcel = ((Parcel) (parcel.readStrongBinder()));
	//  153  376:aload_2         
	//  154  377:invokevirtual   #63  <Method IBinder Parcel.readStrongBinder()>
	//  155  380:astore_2        
		if(parcel == null)
	//* 156  381:aload_2         
	//* 157  382:ifnonnull       391
		{
			parcel = ((Parcel) (s1));
	//  158  385:aload           7
	//  159  387:astore_2        
		} else
	//* 160  388:goto            427
		{
			android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
	//  161  391:aload_2         
	//  162  392:ldc1            #118 <String "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback">
	//  163  394:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  164  399:astore          7
			if(iinterface1 instanceof zzzm)
	//* 165  401:aload           7
	//* 166  403:instanceof      #120 <Class zzzm>
	//* 167  406:ifeq            418
				parcel = ((Parcel) ((zzzm)iinterface1));
	//  168  409:aload           7
	//  169  411:checkcast       #120 <Class zzzm>
	//  170  414:astore_2        
			else
	//* 171  415:goto            427
				parcel = ((Parcel) (new zzzn(((IBinder) (parcel)))));
	//  172  418:new             #122 <Class zzzn>
	//  173  421:dup             
	//  174  422:aload_2         
	//  175  423:invokespecial   #123 <Method void zzzn(IBinder)>
	//  176  426:astore_2        
		}
		zza(iobjectwrapper, s, bundle1, ((zzzm) (parcel)));
	//  177  427:aload_0         
	//  178  428:aload           5
	//  179  430:aload           6
	//  180  432:aload           8
	//  181  434:aload_2         
	//  182  435:invokevirtual   #126 <Method void zza(com.google.android.gms.dynamic.IObjectWrapper, String, Bundle, zzzm)>
		if(true) goto _L10; else goto _L9
	//  183  438:goto            58
_L9:
		return true;
	//  184  441:iconst_1        
	//  185  442:ireturn         
	}
}
