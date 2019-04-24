// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzyc, zzel

public abstract class zzyd extends zzek
	implements zzyc
{

	public zzyd()
	{
		super("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR tableswitch 2 22: default 100
	//	               2 326
	//	               3 309
	//	               4 301
	//	               5 284
	//	               6 276
	//	               7 268
	//	               8 257
	//	               9 243
	//	               10 229
	//	               11 210
	//	               12 201
	//	               13 184
	//	               14 170
	//	               15 162
	//	               16 154
	//	               17 100
	//	               18 100
	//	               19 146
	//	               20 138
	//	               21 130
	//	               22 102;
	//    1    1:tableswitch     2 22: default 100
	//	               2 326
	//	               3 309
	//	               4 301
	//	               5 284
	//	               6 276
	//	               7 268
	//	               8 257
	//	               9 243
	//	               10 229
	//	               11 210
	//	               12 201
	//	               13 184
	//	               14 170
	//	               15 162
	//	               16 154
	//	               17 100
	//	               18 100
	//	               19 146
	//	               20 138
	//	               21 130
	//	               22 102
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L1 _L1 _L17 _L18 _L19 _L20
_L1:
		return false;
	//    2  100:iconst_0        
	//    3  101:ireturn         
_L20:
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
		  goto _L21
	//*  15  127:goto            261
_L19:
		parcel = ((Parcel) (zzke()));
	//   16  130:aload_0         
	//   17  131:invokevirtual   #38  <Method com.google.android.gms.dynamic.IObjectWrapper zzke()>
	//   18  134:astore_2        
		  goto _L22
	//*  19  135:goto            289
_L18:
		parcel = ((Parcel) (zzmw()));
	//   20  138:aload_0         
	//   21  139:invokevirtual   #41  <Method com.google.android.gms.dynamic.IObjectWrapper zzmw()>
	//   22  142:astore_2        
		  goto _L22
	//*  23  143:goto            289
_L17:
		parcel = ((Parcel) (zzkf()));
	//   24  146:aload_0         
	//   25  147:invokevirtual   #45  <Method zzps zzkf()>
	//   26  150:astore_2        
		  goto _L22
	//*  27  151:goto            289
_L16:
		parcel = ((Parcel) (getVideoController()));
	//   28  154:aload_0         
	//   29  155:invokevirtual   #49  <Method zzlo getVideoController()>
	//   30  158:astore_2        
		  goto _L22
	//*  31  159:goto            289
_L15:
		parcel = ((Parcel) (zzmv()));
	//   32  162:aload_0         
	//   33  163:invokevirtual   #52  <Method com.google.android.gms.dynamic.IObjectWrapper zzmv()>
	//   34  166:astore_2        
		  goto _L22
	//*  35  167:goto            289
_L14:
		zzl(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   36  170:aload_0         
	//   37  171:aload_2         
	//   38  172:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   39  175:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   40  178:invokevirtual   #56  <Method void zzl(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L21
	//*  41  181:goto            261
_L13:
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
		break MISSING_BLOCK_LABEL_340;
	//   50  198:goto            340
_L12:
		boolean flag = getOverrideClickHandling();
	//   51  201:aload_0         
	//   52  202:invokevirtual   #72  <Method boolean getOverrideClickHandling()>
	//   53  205:istore          5
		  goto _L23
	//*  54  207:goto            216
_L11:
		flag = getOverrideImpressionRecording();
	//   55  210:aload_0         
	//   56  211:invokevirtual   #75  <Method boolean getOverrideImpressionRecording()>
	//   57  214:istore          5
_L23:
		parcel1.writeNoException();
	//   58  216:aload_3         
	//   59  217:invokevirtual   #63  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, flag);
	//   60  220:aload_3         
	//   61  221:iload           5
	//   62  223:invokestatic    #79  <Method void zzel.zza(Parcel, boolean)>
		break MISSING_BLOCK_LABEL_340;
	//   63  226:goto            340
_L10:
		zzk(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   64  229:aload_0         
	//   65  230:aload_2         
	//   66  231:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   67  234:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   68  237:invokevirtual   #82  <Method void zzk(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L21
	//*  69  240:goto            261
_L9:
		zzj(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   70  243:aload_0         
	//   71  244:aload_2         
	//   72  245:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//   73  248:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//   74  251:invokevirtual   #85  <Method void zzj(com.google.android.gms.dynamic.IObjectWrapper)>
		  goto _L21
	//*  75  254:goto            261
_L8:
		recordImpression();
	//   76  257:aload_0         
	//   77  258:invokevirtual   #88  <Method void recordImpression()>
_L21:
		parcel1.writeNoException();
	//   78  261:aload_3         
	//   79  262:invokevirtual   #63  <Method void Parcel.writeNoException()>
		break MISSING_BLOCK_LABEL_340;
	//   80  265:goto            340
_L7:
		parcel = ((Parcel) (getAdvertiser()));
	//   81  268:aload_0         
	//   82  269:invokevirtual   #92  <Method String getAdvertiser()>
	//   83  272:astore_2        
		break MISSING_BLOCK_LABEL_331;
	//   84  273:goto            331
_L6:
		parcel = ((Parcel) (getCallToAction()));
	//   85  276:aload_0         
	//   86  277:invokevirtual   #95  <Method String getCallToAction()>
	//   87  280:astore_2        
		break MISSING_BLOCK_LABEL_331;
	//   88  281:goto            331
_L5:
		parcel = ((Parcel) (zzkg()));
	//   89  284:aload_0         
	//   90  285:invokevirtual   #99  <Method zzpw zzkg()>
	//   91  288:astore_2        
_L22:
		parcel1.writeNoException();
	//   92  289:aload_3         
	//   93  290:invokevirtual   #63  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   94  293:aload_3         
	//   95  294:aload_2         
	//   96  295:invokestatic    #102 <Method void zzel.zza(Parcel, android.os.IInterface)>
		break MISSING_BLOCK_LABEL_340;
	//   97  298:goto            340
_L4:
		parcel = ((Parcel) (getBody()));
	//   98  301:aload_0         
	//   99  302:invokevirtual   #105 <Method String getBody()>
	//  100  305:astore_2        
		break MISSING_BLOCK_LABEL_331;
	//  101  306:goto            331
_L3:
		parcel = ((Parcel) (getImages()));
	//  102  309:aload_0         
	//  103  310:invokevirtual   #109 <Method java.util.List getImages()>
	//  104  313:astore_2        
		parcel1.writeNoException();
	//  105  314:aload_3         
	//  106  315:invokevirtual   #63  <Method void Parcel.writeNoException()>
		parcel1.writeList(((java.util.List) (parcel)));
	//  107  318:aload_3         
	//  108  319:aload_2         
	//  109  320:invokevirtual   #113 <Method void Parcel.writeList(java.util.List)>
		break MISSING_BLOCK_LABEL_340;
	//  110  323:goto            340
_L2:
		parcel = ((Parcel) (getHeadline()));
	//  111  326:aload_0         
	//  112  327:invokevirtual   #116 <Method String getHeadline()>
	//  113  330:astore_2        
		parcel1.writeNoException();
	//  114  331:aload_3         
	//  115  332:invokevirtual   #63  <Method void Parcel.writeNoException()>
		parcel1.writeString(((String) (parcel)));
	//  116  335:aload_3         
	//  117  336:aload_2         
	//  118  337:invokevirtual   #119 <Method void Parcel.writeString(String)>
		return true;
	//  119  340:iconst_1        
	//  120  341:ireturn         
	}
}
