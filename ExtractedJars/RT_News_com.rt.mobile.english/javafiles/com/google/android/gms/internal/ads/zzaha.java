// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzagz, zzahb, zzagx, 
//			zzagy, zzel, zzky, zzahe, 
//			zzahg, zzahk

public abstract class zzaha extends zzek
	implements zzagz
{

	public zzaha()
	{
		super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzagz zzy(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzagz)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzagz>
	//*  10   19:ifeq            27
			return (zzagz)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzagz>
	//   13   26:areturn         
		else
			return ((zzagz) (new zzahb(ibinder)));
	//   14   27:new             #24  <Class zzahb>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzahb(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		if(i == 34) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:bipush          34
	//    2    3:icmpeq          393
_L1:
		Object obj;
		Object obj1;
		obj1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          7
		obj = null;
	//    5    9:aconst_null     
	//    6   10:astore          6
		i;
	//    7   12:iload_1         
		JVM INSTR tableswitch 1 3: default 40
	//	               1 372
	//	               2 365
	//	               3 306;
	//    8   13:tableswitch     1 3: default 40
	//	               1 372
	//	               2 365
	//	               3 306
		   goto _L3 _L4 _L5 _L6
_L3:
		switch(i)
	//*   9   40:iload_1         
		{
	//*  10   41:tableswitch     5 16: default 104
	//	               5 287
	//	               6 280
	//	               7 273
	//	               8 266
	//	               9 252
	//	               10 238
	//	               11 224
	//	               12 207
	//	               13 196
	//	               14 182
	//	               15 165
	//	               16 106
		default:
			return false;
	//   11  104:iconst_0        
	//   12  105:ireturn         

		case 16: // '\020'
			parcel = ((Parcel) (parcel.readStrongBinder()));
	//   13  106:aload_2         
	//   14  107:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   15  110:astore_2        
			if(parcel == null)
	//*  16  111:aload_2         
	//*  17  112:ifnonnull       121
			{
				parcel = ((Parcel) (obj));
	//   18  115:aload           6
	//   19  117:astore_2        
			} else
	//*  20  118:goto            157
			{
				android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
	//   21  121:aload_2         
	//   22  122:ldc1            #39  <String "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener">
	//   23  124:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   24  129:astore          6
				if(iinterface instanceof zzagx)
	//*  25  131:aload           6
	//*  26  133:instanceof      #41  <Class zzagx>
	//*  27  136:ifeq            148
					parcel = ((Parcel) ((zzagx)iinterface));
	//   28  139:aload           6
	//   29  141:checkcast       #41  <Class zzagx>
	//   30  144:astore_2        
				else
	//*  31  145:goto            157
					parcel = ((Parcel) (new zzagy(((IBinder) (parcel)))));
	//   32  148:new             #43  <Class zzagy>
	//   33  151:dup             
	//   34  152:aload_2         
	//   35  153:invokespecial   #44  <Method void zzagy(IBinder)>
	//   36  156:astore_2        
			}
			zza(((zzagx) (parcel)));
	//   37  157:aload_0         
	//   38  158:aload_2         
	//   39  159:invokevirtual   #48  <Method void zza(zzagx)>
			break; /* Loop/switch isn't completed */
	//   40  162:goto            386

		case 15: // '\017'
			parcel = ((Parcel) (zzba()));
	//   41  165:aload_0         
	//   42  166:invokevirtual   #52  <Method android.os.Bundle zzba()>
	//   43  169:astore_2        
			parcel1.writeNoException();
	//   44  170:aload_3         
	//   45  171:invokevirtual   #55  <Method void Parcel.writeNoException()>
			zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   46  174:aload_3         
	//   47  175:aload_2         
	//   48  176:invokestatic    #61  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
			break;

	//*  49  179:goto            404
		case 14: // '\016'
			zza(zzky.zzc(parcel.readStrongBinder()));
	//   50  182:aload_0         
	//   51  183:aload_2         
	//   52  184:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   53  187:invokestatic    #67  <Method zzkx zzky.zzc(IBinder)>
	//   54  190:invokevirtual   #70  <Method void zza(zzkx)>
			break; /* Loop/switch isn't completed */
	//   55  193:goto            386

		case 13: // '\r'
			setUserId(parcel.readString());
	//   56  196:aload_0         
	//   57  197:aload_2         
	//   58  198:invokevirtual   #74  <Method String Parcel.readString()>
	//   59  201:invokevirtual   #77  <Method void setUserId(String)>
			break; /* Loop/switch isn't completed */
	//   60  204:goto            386

		case 12: // '\f'
			parcel = ((Parcel) (getMediationAdapterClassName()));
	//   61  207:aload_0         
	//   62  208:invokevirtual   #80  <Method String getMediationAdapterClassName()>
	//   63  211:astore_2        
			parcel1.writeNoException();
	//   64  212:aload_3         
	//   65  213:invokevirtual   #55  <Method void Parcel.writeNoException()>
			parcel1.writeString(((String) (parcel)));
	//   66  216:aload_3         
	//   67  217:aload_2         
	//   68  218:invokevirtual   #83  <Method void Parcel.writeString(String)>
			break;

	//*  69  221:goto            404
		case 11: // '\013'
			zzf(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   70  224:aload_0         
	//   71  225:aload_2         
	//   72  226:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   73  229:invokestatic    #89  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   74  232:invokevirtual   #93  <Method void zzf(com.google.android.gms.dynamic.IObjectWrapper)>
			break; /* Loop/switch isn't completed */
	//   75  235:goto            386

		case 10: // '\n'
			zze(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   76  238:aload_0         
	//   77  239:aload_2         
	//   78  240:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   79  243:invokestatic    #89  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   80  246:invokevirtual   #96  <Method void zze(com.google.android.gms.dynamic.IObjectWrapper)>
			break; /* Loop/switch isn't completed */
	//   81  249:goto            386

		case 9: // '\t'
			zzd(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   82  252:aload_0         
	//   83  253:aload_2         
	//   84  254:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//   85  257:invokestatic    #89  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   86  260:invokevirtual   #99  <Method void zzd(com.google.android.gms.dynamic.IObjectWrapper)>
			break; /* Loop/switch isn't completed */
	//   87  263:goto            386

		case 8: // '\b'
			destroy();
	//   88  266:aload_0         
	//   89  267:invokevirtual   #102 <Method void destroy()>
			break; /* Loop/switch isn't completed */
	//   90  270:goto            386

		case 7: // '\007'
			resume();
	//   91  273:aload_0         
	//   92  274:invokevirtual   #105 <Method void resume()>
			break; /* Loop/switch isn't completed */
	//   93  277:goto            386

		case 6: // '\006'
			pause();
	//   94  280:aload_0         
	//   95  281:invokevirtual   #108 <Method void pause()>
			break; /* Loop/switch isn't completed */
	//   96  284:goto            386

		case 5: // '\005'
			boolean flag = isLoaded();
	//   97  287:aload_0         
	//   98  288:invokevirtual   #112 <Method boolean isLoaded()>
	//   99  291:istore          5
			parcel1.writeNoException();
	//  100  293:aload_3         
	//  101  294:invokevirtual   #55  <Method void Parcel.writeNoException()>
			zzel.zza(parcel1, flag);
	//  102  297:aload_3         
	//  103  298:iload           5
	//  104  300:invokestatic    #115 <Method void zzel.zza(Parcel, boolean)>
			break;
		}
		  goto _L7
	//* 105  303:goto            404
_L6:
		parcel = ((Parcel) (parcel.readStrongBinder()));
	//  106  306:aload_2         
	//  107  307:invokevirtual   #37  <Method IBinder Parcel.readStrongBinder()>
	//  108  310:astore_2        
		if(parcel == null)
	//* 109  311:aload_2         
	//* 110  312:ifnonnull       321
		{
			parcel = ((Parcel) (obj1));
	//  111  315:aload           7
	//  112  317:astore_2        
		} else
	//* 113  318:goto            357
		{
			android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
	//  114  321:aload_2         
	//  115  322:ldc1            #117 <String "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener">
	//  116  324:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  117  329:astore          6
			if(iinterface1 instanceof zzahe)
	//* 118  331:aload           6
	//* 119  333:instanceof      #119 <Class zzahe>
	//* 120  336:ifeq            348
				parcel = ((Parcel) ((zzahe)iinterface1));
	//  121  339:aload           6
	//  122  341:checkcast       #119 <Class zzahe>
	//  123  344:astore_2        
			else
	//* 124  345:goto            357
				parcel = ((Parcel) (new zzahg(((IBinder) (parcel)))));
	//  125  348:new             #121 <Class zzahg>
	//  126  351:dup             
	//  127  352:aload_2         
	//  128  353:invokespecial   #122 <Method void zzahg(IBinder)>
	//  129  356:astore_2        
		}
		zza(((zzahe) (parcel)));
	//  130  357:aload_0         
	//  131  358:aload_2         
	//  132  359:invokevirtual   #125 <Method void zza(zzahe)>
		break; /* Loop/switch isn't completed */
	//  133  362:goto            386
_L5:
		show();
	//  134  365:aload_0         
	//  135  366:invokevirtual   #128 <Method void show()>
		break; /* Loop/switch isn't completed */
	//  136  369:goto            386
_L4:
		zza((zzahk)zzel.zza(parcel, zzahk.CREATOR));
	//  137  372:aload_0         
	//  138  373:aload_2         
	//  139  374:getstatic       #134 <Field android.os.Parcelable$Creator zzahk.CREATOR>
	//  140  377:invokestatic    #137 <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//  141  380:checkcast       #130 <Class zzahk>
	//  142  383:invokevirtual   #140 <Method void zza(zzahk)>
_L8:
		parcel1.writeNoException();
	//  143  386:aload_3         
	//  144  387:invokevirtual   #55  <Method void Parcel.writeNoException()>
		break; /* Loop/switch isn't completed */
	//  145  390:goto            404
_L2:
		setImmersiveMode(zzel.zza(parcel));
	//  146  393:aload_0         
	//  147  394:aload_2         
	//  148  395:invokestatic    #143 <Method boolean zzel.zza(Parcel)>
	//  149  398:invokevirtual   #147 <Method void setImmersiveMode(boolean)>
		if(true) goto _L8; else goto _L7
	//  150  401:goto            386
_L7:
		return true;
	//  151  404:iconst_1        
	//  152  405:ireturn         
	}
}
