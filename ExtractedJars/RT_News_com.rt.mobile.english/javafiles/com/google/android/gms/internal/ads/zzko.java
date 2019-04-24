// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzkn, zzrm, zzel, 
//			zzrj, zzjn, zzlg, zzli, 
//			zzpl, zzrg, zzrd, zzra, 
//			zzqx, zzkh, zzkj

public abstract class zzko extends zzek
	implements zzkn
{

	public zzko()
	{
		super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IAdLoaderBuilder">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		Object obj;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          6
		obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		i;
	//    4    6:iload_1         
		JVM INSTR tableswitch 1 10: default 60
	//	               1 309
	//	               2 250
	//	               3 232
	//	               4 218
	//	               5 193
	//	               6 176
	//	               7 117
	//	               8 93
	//	               9 76
	//	               10 62;
	//    5    7:tableswitch     1 10: default 60
	//	               1 309
	//	               2 250
	//	               3 232
	//	               4 218
	//	               5 193
	//	               6 176
	//	               7 117
	//	               8 93
	//	               9 76
	//	               10 62
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
		return false;
	//    6   60:iconst_0        
	//    7   61:ireturn         
_L11:
		zza(zzrm.zzq(parcel.readStrongBinder()));
	//    8   62:aload_0         
	//    9   63:aload_2         
	//   10   64:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   11   67:invokestatic    #30  <Method zzrl zzrm.zzq(IBinder)>
	//   12   70:invokevirtual   #34  <Method void zza(zzrl)>
		break; /* Loop/switch isn't completed */
	//   13   73:goto            243
_L10:
		zza((PublisherAdViewOptions)zzel.zza(parcel, PublisherAdViewOptions.CREATOR));
	//   14   76:aload_0         
	//   15   77:aload_2         
	//   16   78:getstatic       #40  <Field android.os.Parcelable$Creator PublisherAdViewOptions.CREATOR>
	//   17   81:invokestatic    #45  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   18   84:checkcast       #36  <Class PublisherAdViewOptions>
	//   19   87:invokevirtual   #48  <Method void zza(PublisherAdViewOptions)>
		break; /* Loop/switch isn't completed */
	//   20   90:goto            243
_L9:
		zza(zzrj.zzp(parcel.readStrongBinder()), (zzjn)zzel.zza(parcel, zzjn.CREATOR));
	//   21   93:aload_0         
	//   22   94:aload_2         
	//   23   95:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   24   98:invokestatic    #54  <Method zzri zzrj.zzp(IBinder)>
	//   25  101:aload_2         
	//   26  102:getstatic       #57  <Field android.os.Parcelable$Creator zzjn.CREATOR>
	//   27  105:invokestatic    #45  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   28  108:checkcast       #56  <Class zzjn>
	//   29  111:invokevirtual   #60  <Method void zza(zzri, zzjn)>
		break; /* Loop/switch isn't completed */
	//   30  114:goto            243
_L8:
		parcel = ((Parcel) (parcel.readStrongBinder()));
	//   31  117:aload_2         
	//   32  118:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   33  121:astore_2        
		if(parcel == null)
	//*  34  122:aload_2         
	//*  35  123:ifnonnull       132
		{
			parcel = ((Parcel) (obj));
	//   36  126:aload           5
	//   37  128:astore_2        
		} else
	//*  38  129:goto            168
		{
			android.os.IInterface iinterface = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
	//   39  132:aload_2         
	//   40  133:ldc1            #62  <String "com.google.android.gms.ads.internal.client.ICorrelationIdProvider">
	//   41  135:invokeinterface #68  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   42  140:astore          5
			if(iinterface instanceof zzlg)
	//*  43  142:aload           5
	//*  44  144:instanceof      #70  <Class zzlg>
	//*  45  147:ifeq            159
				parcel = ((Parcel) ((zzlg)iinterface));
	//   46  150:aload           5
	//   47  152:checkcast       #70  <Class zzlg>
	//   48  155:astore_2        
			else
	//*  49  156:goto            168
				parcel = ((Parcel) (new zzli(((IBinder) (parcel)))));
	//   50  159:new             #72  <Class zzli>
	//   51  162:dup             
	//   52  163:aload_2         
	//   53  164:invokespecial   #75  <Method void zzli(IBinder)>
	//   54  167:astore_2        
		}
		zzb(((zzlg) (parcel)));
	//   55  168:aload_0         
	//   56  169:aload_2         
	//   57  170:invokevirtual   #79  <Method void zzb(zzlg)>
		break; /* Loop/switch isn't completed */
	//   58  173:goto            243
_L7:
		zza((zzpl)zzel.zza(parcel, zzpl.CREATOR));
	//   59  176:aload_0         
	//   60  177:aload_2         
	//   61  178:getstatic       #82  <Field android.os.Parcelable$Creator zzpl.CREATOR>
	//   62  181:invokestatic    #45  <Method android.os.Parcelable zzel.zza(Parcel, android.os.Parcelable$Creator)>
	//   63  184:checkcast       #81  <Class zzpl>
	//   64  187:invokevirtual   #85  <Method void zza(zzpl)>
		break; /* Loop/switch isn't completed */
	//   65  190:goto            243
_L6:
		zza(parcel.readString(), zzrg.zzo(parcel.readStrongBinder()), zzrd.zzn(parcel.readStrongBinder()));
	//   66  193:aload_0         
	//   67  194:aload_2         
	//   68  195:invokevirtual   #89  <Method String Parcel.readString()>
	//   69  198:aload_2         
	//   70  199:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   71  202:invokestatic    #95  <Method zzrf zzrg.zzo(IBinder)>
	//   72  205:aload_2         
	//   73  206:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   74  209:invokestatic    #101 <Method zzrc zzrd.zzn(IBinder)>
	//   75  212:invokevirtual   #104 <Method void zza(String, zzrf, zzrc)>
		break; /* Loop/switch isn't completed */
	//   76  215:goto            243
_L5:
		zza(zzra.zzm(parcel.readStrongBinder()));
	//   77  218:aload_0         
	//   78  219:aload_2         
	//   79  220:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   80  223:invokestatic    #110 <Method zzqz zzra.zzm(IBinder)>
	//   81  226:invokevirtual   #113 <Method void zza(zzqz)>
		break; /* Loop/switch isn't completed */
	//   82  229:goto            243
_L4:
		zza(zzqx.zzl(parcel.readStrongBinder()));
	//   83  232:aload_0         
	//   84  233:aload_2         
	//   85  234:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   86  237:invokestatic    #119 <Method zzqw zzqx.zzl(IBinder)>
	//   87  240:invokevirtual   #122 <Method void zza(zzqw)>
_L13:
		parcel1.writeNoException();
	//   88  243:aload_3         
	//   89  244:invokevirtual   #125 <Method void Parcel.writeNoException()>
		break; /* Loop/switch isn't completed */
	//   90  247:goto            323
_L3:
		parcel = ((Parcel) (parcel.readStrongBinder()));
	//   91  250:aload_2         
	//   92  251:invokevirtual   #24  <Method IBinder Parcel.readStrongBinder()>
	//   93  254:astore_2        
		if(parcel == null)
	//*  94  255:aload_2         
	//*  95  256:ifnonnull       265
		{
			parcel = ((Parcel) (obj1));
	//   96  259:aload           6
	//   97  261:astore_2        
		} else
	//*  98  262:goto            301
		{
			android.os.IInterface iinterface1 = ((IBinder) (parcel)).queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
	//   99  265:aload_2         
	//  100  266:ldc1            #127 <String "com.google.android.gms.ads.internal.client.IAdListener">
	//  101  268:invokeinterface #68  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  102  273:astore          5
			if(iinterface1 instanceof zzkh)
	//* 103  275:aload           5
	//* 104  277:instanceof      #129 <Class zzkh>
	//* 105  280:ifeq            292
				parcel = ((Parcel) ((zzkh)iinterface1));
	//  106  283:aload           5
	//  107  285:checkcast       #129 <Class zzkh>
	//  108  288:astore_2        
			else
	//* 109  289:goto            301
				parcel = ((Parcel) (new zzkj(((IBinder) (parcel)))));
	//  110  292:new             #131 <Class zzkj>
	//  111  295:dup             
	//  112  296:aload_2         
	//  113  297:invokespecial   #132 <Method void zzkj(IBinder)>
	//  114  300:astore_2        
		}
		zzb(((zzkh) (parcel)));
	//  115  301:aload_0         
	//  116  302:aload_2         
	//  117  303:invokevirtual   #135 <Method void zzb(zzkh)>
		if(true) goto _L13; else goto _L12
	//  118  306:goto            243
_L2:
		parcel = ((Parcel) (zzdh()));
	//  119  309:aload_0         
	//  120  310:invokevirtual   #139 <Method zzkk zzdh()>
	//  121  313:astore_2        
		parcel1.writeNoException();
	//  122  314:aload_3         
	//  123  315:invokevirtual   #125 <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//  124  318:aload_3         
	//  125  319:aload_2         
	//  126  320:invokestatic    #142 <Method void zzel.zza(Parcel, android.os.IInterface)>
_L12:
		return true;
	//  127  323:iconst_1        
	//  128  324:ireturn         
	}
}
