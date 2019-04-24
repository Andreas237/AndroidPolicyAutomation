// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzxz, zzel

public abstract class zzya extends zzek
	implements zzxz
{

	public zzya()
	{
		super("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR tableswitch 2 22: default 100
	//	               2 353
	//	               3 336
	//	               4 328
	//	               5 311
	//	               6 303
	//	               7 284
	//	               8 276
	//	               9 268
	//	               10 257
	//	               11 243
	//	               12 229
	//	               13 210
	//	               14 201
	//	               15 184
	//	               16 170
	//	               17 162
	//	               18 154
	//	               19 146
	//	               20 138
	//	               21 130
	//	               22 102;
	//    1    1:tableswitch     2 22: default 100
	//	               2 353
	//	               3 336
	//	               4 328
	//	               5 311
	//	               6 303
	//	               7 284
	//	               8 276
	//	               9 268
	//	               10 257
	//	               11 243
	//	               12 229
	//	               13 210
	//	               14 201
	//	               15 184
	//	               16 170
	//	               17 162
	//	               18 154
	//	               19 146
	//	               20 138
	//	               21 130
	//	               22 102
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
		return false;
	//    2  100:iconst_0        
	//    3  101:ireturn         
_L22:
		zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4  102:aload_0         
	//    5  103:aload_2         
	//    6  104:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    7  107:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//    8  110:aload_2         
	//    9  111:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   10  114:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   11  117:aload_2         
	//   12  118:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   13  121:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   14  124:invokevirtual   #34  <Method void zzb(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L23
	//*  15  127:goto            261
_L21:
		parcel = ((Parcel) (zzke()));
	//   16  130:aload_0         
	//   17  131:invokevirtual   #38  <Method com.google.android.gms.dynamic.IObjectWrapper zzke()>
	//   18  134:astore_2        
		  goto _L24
	//*  19  135:goto            316
_L20:
		parcel = ((Parcel) (zzmw()));
	//   20  138:aload_0         
	//   21  139:invokevirtual   #41  <Method com.google.android.gms.dynamic.IObjectWrapper zzmw()>
	//   22  142:astore_2        
		  goto _L24
	//*  23  143:goto            316
_L19:
		parcel = ((Parcel) (zzkf()));
	//   24  146:aload_0         
	//   25  147:invokevirtual   #45  <Method zzps zzkf()>
	//   26  150:astore_2        
		  goto _L24
	//*  27  151:goto            316
_L18:
		parcel = ((Parcel) (zzmv()));
	//   28  154:aload_0         
	//   29  155:invokevirtual   #48  <Method com.google.android.gms.dynamic.IObjectWrapper zzmv()>
	//   30  158:astore_2        
		  goto _L24
	//*  31  159:goto            316
_L17:
		parcel = ((Parcel) (getVideoController()));
	//   32  162:aload_0         
	//   33  163:invokevirtual   #52  <Method zzlo getVideoController()>
	//   34  166:astore_2        
		  goto _L24
	//*  35  167:goto            316
_L16:
		zzl(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   36  170:aload_0         
	//   37  171:aload_2         
	//   38  172:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   39  175:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   40  178:invokevirtual   #56  <Method void zzl(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L23
	//*  41  181:goto            261
_L15:
		parcel = ((Parcel) (getExtras()));
	//   42  184:aload_0         
	//   43  185:invokevirtual   #60  <Method android.os.Bundle getExtras()>
	//   44  188:astore_2        
		parcel1.writeNoException();
	//   45  189:aload_3         
	//   46  190:invokevirtual   #63  <Method void Parcel.writeNoException()>
		zzel.zzb(parcel1, ((android.os.Parcelable) (parcel)));
	//   47  193:aload_3         
	//   48  194:aload_2         
	//   49  195:invokestatic    #68  <Method void zzel.zzb(Parcel, android.os.Parcelable)>
		break MISSING_BLOCK_LABEL_367;
	//   50  198:goto            367
_L14:
		boolean flag = getOverrideClickHandling();
	//   51  201:aload_0         
	//   52  202:invokevirtual   #72  <Method boolean getOverrideClickHandling()>
	//   53  205:istore          7
		  goto _L25
	//*  54  207:goto            216
_L13:
		flag = getOverrideImpressionRecording();
	//   55  210:aload_0         
	//   56  211:invokevirtual   #75  <Method boolean getOverrideImpressionRecording()>
	//   57  214:istore          7
_L25:
		parcel1.writeNoException();
	//   58  216:aload_3         
	//   59  217:invokevirtual   #63  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, flag);
	//   60  220:aload_3         
	//   61  221:iload           7
	//   62  223:invokestatic    #79  <Method void zzel.zza(Parcel, boolean)>
		break MISSING_BLOCK_LABEL_367;
	//   63  226:goto            367
_L12:
		zzk(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   64  229:aload_0         
	//   65  230:aload_2         
	//   66  231:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   67  234:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   68  237:invokevirtual   #82  <Method void zzk(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L23
	//*  69  240:goto            261
_L11:
		zzj(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   70  243:aload_0         
	//   71  244:aload_2         
	//   72  245:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   73  248:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   74  251:invokevirtual   #85  <Method void zzj(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L23
	//*  75  254:goto            261
_L10:
		recordImpression();
	//   76  257:aload_0         
	//   77  258:invokevirtual   #88  <Method void recordImpression()>
_L23:
		parcel1.writeNoException();
	//   78  261:aload_3         
	//   79  262:invokevirtual   #63  <Method void Parcel.writeNoException()>
		break MISSING_BLOCK_LABEL_367;
	//   80  265:goto            367
_L9:
		parcel = ((Parcel) (getPrice()));
	//   81  268:aload_0         
	//   82  269:invokevirtual   #92  <Method String getPrice()>
	//   83  272:astore_2        
		break MISSING_BLOCK_LABEL_358;
	//   84  273:goto            358
_L8:
		parcel = ((Parcel) (getStore()));
	//   85  276:aload_0         
	//   86  277:invokevirtual   #95  <Method String getStore()>
	//   87  280:astore_2        
		break MISSING_BLOCK_LABEL_358;
	//   88  281:goto            358
_L7:
		double d = getStarRating();
	//   89  284:aload_0         
	//   90  285:invokevirtual   #99  <Method double getStarRating()>
	//   91  288:dstore          5
		parcel1.writeNoException();
	//   92  290:aload_3         
	//   93  291:invokevirtual   #63  <Method void Parcel.writeNoException()>
		parcel1.writeDouble(d);
	//   94  294:aload_3         
	//   95  295:dload           5
	//   96  297:invokevirtual   #103 <Method void Parcel.writeDouble(double)>
		break MISSING_BLOCK_LABEL_367;
	//   97  300:goto            367
_L6:
		parcel = ((Parcel) (getCallToAction()));
	//   98  303:aload_0         
	//   99  304:invokevirtual   #106 <Method String getCallToAction()>
	//  100  307:astore_2        
		break MISSING_BLOCK_LABEL_358;
	//  101  308:goto            358
_L5:
		parcel = ((Parcel) (zzjz()));
	//  102  311:aload_0         
	//  103  312:invokevirtual   #110 <Method zzpw zzjz()>
	//  104  315:astore_2        
_L24:
		parcel1.writeNoException();
	//  105  316:aload_3         
	//  106  317:invokevirtual   #63  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  107  320:aload_3         
	//  108  321:aload_2         
	//  109  322:invokestatic    #113 <Method void zzel.zza(Parcel, android.os.IInterface)>
		break MISSING_BLOCK_LABEL_367;
	//  110  325:goto            367
_L4:
		parcel = ((Parcel) (getBody()));
	//  111  328:aload_0         
	//  112  329:invokevirtual   #116 <Method String getBody()>
	//  113  332:astore_2        
		break MISSING_BLOCK_LABEL_358;
	//  114  333:goto            358
_L3:
		parcel = ((Parcel) (getImages()));
	//  115  336:aload_0         
	//  116  337:invokevirtual   #120 <Method java.util.List getImages()>
	//  117  340:astore_2        
		parcel1.writeNoException();
	//  118  341:aload_3         
	//  119  342:invokevirtual   #63  <Method void Parcel.writeNoException()>
		parcel1.writeList(((java.util.List) (parcel)));
	//  120  345:aload_3         
	//  121  346:aload_2         
	//  122  347:invokevirtual   #124 <Method void Parcel.writeList(java.util.List)>
		break MISSING_BLOCK_LABEL_367;
	//  123  350:goto            367
_L2:
		parcel = ((Parcel) (getHeadline()));
	//  124  353:aload_0         
	//  125  354:invokevirtual   #127 <Method String getHeadline()>
	//  126  357:astore_2        
		parcel1.writeNoException();
	//  127  358:aload_3         
	//  128  359:invokevirtual   #63  <Method void Parcel.writeNoException()>
		parcel1.writeString(((String) (parcel)));
	//  129  362:aload_3         
	//  130  363:aload_2         
	//  131  364:invokevirtual   #130 <Method void Parcel.writeString(String)>
		return true;
	//  132  367:iconst_1        
	//  133  368:ireturn         
	}
}
