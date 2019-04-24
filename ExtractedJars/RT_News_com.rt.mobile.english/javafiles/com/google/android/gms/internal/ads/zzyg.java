// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzyf, zzel

public abstract class zzyg extends zzek
	implements zzyf
{

	public zzyg()
	{
		super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR tableswitch 2 22: default 100
	//	               2 347
	//	               3 330
	//	               4 322
	//	               5 305
	//	               6 297
	//	               7 289
	//	               8 270
	//	               9 262
	//	               10 254
	//	               11 246
	//	               12 238
	//	               13 230
	//	               14 222
	//	               15 214
	//	               16 197
	//	               17 178
	//	               18 169
	//	               19 158
	//	               20 144
	//	               21 116
	//	               22 102;
	//    1    1:tableswitch     2 22: default 100
	//	               2 347
	//	               3 330
	//	               4 322
	//	               5 305
	//	               6 297
	//	               7 289
	//	               8 270
	//	               9 262
	//	               10 254
	//	               11 246
	//	               12 238
	//	               13 230
	//	               14 222
	//	               15 214
	//	               16 197
	//	               17 178
	//	               18 169
	//	               19 158
	//	               20 144
	//	               21 116
	//	               22 102
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
		return false;
	//    2  100:iconst_0        
	//    3  101:ireturn         
_L22:
		zzl(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4  102:aload_0         
	//    5  103:aload_2         
	//    6  104:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    7  107:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//    8  110:invokevirtual   #34  <Method void zzl(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L23
	//*   9  113:goto            162
_L21:
		zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   10  116:aload_0         
	//   11  117:aload_2         
	//   12  118:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   13  121:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   14  124:aload_2         
	//   15  125:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   16  128:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   17  131:aload_2         
	//   18  132:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   19  135:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   20  138:invokevirtual   #38  <Method void zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L23
	//*  21  141:goto            162
_L20:
		zzj(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   22  144:aload_0         
	//   23  145:aload_2         
	//   24  146:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   25  149:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   26  152:invokevirtual   #41  <Method void zzj(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L23
	//*  27  155:goto            162
_L19:
		recordImpression();
	//   28  158:aload_0         
	//   29  159:invokevirtual   #44  <Method void recordImpression()>
_L23:
		parcel1.writeNoException();
	//   30  162:aload_3         
	//   31  163:invokevirtual   #47  <Method void Parcel.writeNoException()>
		break MISSING_BLOCK_LABEL_361;
	//   32  166:goto            361
_L18:
		boolean flag = getOverrideClickHandling();
	//   33  169:aload_0         
	//   34  170:invokevirtual   #51  <Method boolean getOverrideClickHandling()>
	//   35  173:istore          7
		  goto _L24
	//*  36  175:goto            184
_L17:
		flag = getOverrideImpressionRecording();
	//   37  178:aload_0         
	//   38  179:invokevirtual   #54  <Method boolean getOverrideImpressionRecording()>
	//   39  182:istore          7
_L24:
		parcel1.writeNoException();
	//   40  184:aload_3         
	//   41  185:invokevirtual   #47  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, flag);
	//   42  188:aload_3         
	//   43  189:iload           7
	//   44  191:invokestatic    #60  <Method void zzel.zza(Parcel, boolean)>
		break MISSING_BLOCK_LABEL_361;
	//   45  194:goto            361
_L16:
		parcel = ((Parcel) (getExtras()));
	//   46  197:aload_0         
	//   47  198:invokevirtual   #64  <Method android.os.Bundle getExtras()>
	//   48  201:astore_2        
		parcel1.writeNoException();
	//   49  202:aload_3         
	//   50  203:invokevirtual   #47  <Method void Parcel.writeNoException()>
		zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   51  206:aload_3         
	//   52  207:aload_2         
	//   53  208:invokestatic    #67  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
		break MISSING_BLOCK_LABEL_361;
	//   54  211:goto            361
_L15:
		parcel = ((Parcel) (zzke()));
	//   55  214:aload_0         
	//   56  215:invokevirtual   #71  <Method com.google.android.gms.dynamic.IObjectWrapper zzke()>
	//   57  218:astore_2        
		  goto _L25
	//*  58  219:goto            310
_L14:
		parcel = ((Parcel) (zzmw()));
	//   59  222:aload_0         
	//   60  223:invokevirtual   #74  <Method com.google.android.gms.dynamic.IObjectWrapper zzmw()>
	//   61  226:astore_2        
		  goto _L25
	//*  62  227:goto            310
_L13:
		parcel = ((Parcel) (zzmv()));
	//   63  230:aload_0         
	//   64  231:invokevirtual   #77  <Method com.google.android.gms.dynamic.IObjectWrapper zzmv()>
	//   65  234:astore_2        
		  goto _L25
	//*  66  235:goto            310
_L12:
		parcel = ((Parcel) (zzkf()));
	//   67  238:aload_0         
	//   68  239:invokevirtual   #81  <Method zzps zzkf()>
	//   69  242:astore_2        
		  goto _L25
	//*  70  243:goto            310
_L11:
		parcel = ((Parcel) (getVideoController()));
	//   71  246:aload_0         
	//   72  247:invokevirtual   #85  <Method zzlo getVideoController()>
	//   73  250:astore_2        
		  goto _L25
	//*  74  251:goto            310
_L10:
		parcel = ((Parcel) (getPrice()));
	//   75  254:aload_0         
	//   76  255:invokevirtual   #89  <Method String getPrice()>
	//   77  258:astore_2        
		break MISSING_BLOCK_LABEL_352;
	//   78  259:goto            352
_L9:
		parcel = ((Parcel) (getStore()));
	//   79  262:aload_0         
	//   80  263:invokevirtual   #92  <Method String getStore()>
	//   81  266:astore_2        
		break MISSING_BLOCK_LABEL_352;
	//   82  267:goto            352
_L8:
		double d = getStarRating();
	//   83  270:aload_0         
	//   84  271:invokevirtual   #96  <Method double getStarRating()>
	//   85  274:dstore          5
		parcel1.writeNoException();
	//   86  276:aload_3         
	//   87  277:invokevirtual   #47  <Method void Parcel.writeNoException()>
		parcel1.writeDouble(d);
	//   88  280:aload_3         
	//   89  281:dload           5
	//   90  283:invokevirtual   #100 <Method void Parcel.writeDouble(double)>
		break MISSING_BLOCK_LABEL_361;
	//   91  286:goto            361
_L7:
		parcel = ((Parcel) (getAdvertiser()));
	//   92  289:aload_0         
	//   93  290:invokevirtual   #103 <Method String getAdvertiser()>
	//   94  293:astore_2        
		break MISSING_BLOCK_LABEL_352;
	//   95  294:goto            352
_L6:
		parcel = ((Parcel) (getCallToAction()));
	//   96  297:aload_0         
	//   97  298:invokevirtual   #106 <Method String getCallToAction()>
	//   98  301:astore_2        
		break MISSING_BLOCK_LABEL_352;
	//   99  302:goto            352
_L5:
		parcel = ((Parcel) (zzjz()));
	//  100  305:aload_0         
	//  101  306:invokevirtual   #110 <Method zzpw zzjz()>
	//  102  309:astore_2        
_L25:
		parcel1.writeNoException();
	//  103  310:aload_3         
	//  104  311:invokevirtual   #47  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  105  314:aload_3         
	//  106  315:aload_2         
	//  107  316:invokestatic    #113 <Method void zzel.zza(Parcel, android.os.IInterface)>
		break MISSING_BLOCK_LABEL_361;
	//  108  319:goto            361
_L4:
		parcel = ((Parcel) (getBody()));
	//  109  322:aload_0         
	//  110  323:invokevirtual   #116 <Method String getBody()>
	//  111  326:astore_2        
		break MISSING_BLOCK_LABEL_352;
	//  112  327:goto            352
_L3:
		parcel = ((Parcel) (getImages()));
	//  113  330:aload_0         
	//  114  331:invokevirtual   #120 <Method java.util.List getImages()>
	//  115  334:astore_2        
		parcel1.writeNoException();
	//  116  335:aload_3         
	//  117  336:invokevirtual   #47  <Method void Parcel.writeNoException()>
		parcel1.writeList(((java.util.List) (parcel)));
	//  118  339:aload_3         
	//  119  340:aload_2         
	//  120  341:invokevirtual   #124 <Method void Parcel.writeList(java.util.List)>
		break MISSING_BLOCK_LABEL_361;
	//  121  344:goto            361
_L2:
		parcel = ((Parcel) (getHeadline()));
	//  122  347:aload_0         
	//  123  348:invokevirtual   #127 <Method String getHeadline()>
	//  124  351:astore_2        
		parcel1.writeNoException();
	//  125  352:aload_3         
	//  126  353:invokevirtual   #47  <Method void Parcel.writeNoException()>
		parcel1.writeString(((String) (parcel)));
	//  127  356:aload_3         
	//  128  357:aload_2         
	//  129  358:invokevirtual   #130 <Method void Parcel.writeString(String)>
		return true;
	//  130  361:iconst_1        
	//  131  362:ireturn         
	}
}
