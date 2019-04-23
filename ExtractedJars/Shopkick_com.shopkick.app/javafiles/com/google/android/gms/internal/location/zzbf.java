// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.location.*;

// Referenced classes of package com.google.android.gms.internal.location:
//			zzbg, zzaj, zzal, zzbd

public final class zzbf extends AbstractSafeParcelable
{

	zzbf(int i, zzbd zzbd, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1, IBinder ibinder2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #56  <Method void AbstractSafeParcelable()>
		zzcg = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #58  <Field int zzcg>
		zzdl = zzbd;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #60  <Field zzbd zzdl>
		Object obj = null;
	//    8   14:aconst_null     
	//    9   15:astore          7
		if(ibinder == null)
	//*  10   17:aload_3         
	//*  11   18:ifnonnull       26
			zzbd = null;
	//   12   21:aconst_null     
	//   13   22:astore_2        
		else
	//*  14   23:goto            31
			zzbd = ((zzbd) (zzy.zzc(ibinder)));
	//   15   26:aload_3         
	//   16   27:invokestatic    #66  <Method zzx zzy.zzc(IBinder)>
	//   17   30:astore_2        
		zzdm = ((zzx) (zzbd));
	//   18   31:aload_0         
	//   19   32:aload_2         
	//   20   33:putfield        #68  <Field zzx zzdm>
		zzbv = pendingintent;
	//   21   36:aload_0         
	//   22   37:aload           4
	//   23   39:putfield        #70  <Field PendingIntent zzbv>
		if(ibinder1 == null)
	//*  24   42:aload           5
	//*  25   44:ifnonnull       52
			zzbd = null;
	//   26   47:aconst_null     
	//   27   48:astore_2        
		else
	//*  28   49:goto            58
			zzbd = ((zzbd) (zzv.zzb(ibinder1)));
	//   29   52:aload           5
	//   30   54:invokestatic    #76  <Method zzu zzv.zzb(IBinder)>
	//   31   57:astore_2        
		zzdn = ((zzu) (zzbd));
	//   32   58:aload_0         
	//   33   59:aload_2         
	//   34   60:putfield        #78  <Field zzu zzdn>
		if(ibinder2 == null)
	//*  35   63:aload           6
	//*  36   65:ifnonnull       74
			zzbd = ((zzbd) (obj));
	//   37   68:aload           7
	//   38   70:astore_2        
		else
	//*  39   71:goto            120
		if(ibinder2 == null)
	//*  40   74:aload           6
	//*  41   76:ifnonnull       85
		{
			zzbd = ((zzbd) (obj));
	//   42   79:aload           7
	//   43   81:astore_2        
		} else
	//*  44   82:goto            120
		{
			zzbd = ((zzbd) (ibinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback")));
	//   45   85:aload           6
	//   46   87:ldc1            #80  <String "com.google.android.gms.location.internal.IFusedLocationProviderCallback">
	//   47   89:invokeinterface #86  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   48   94:astore_2        
			if(zzbd instanceof zzaj)
	//*  49   95:aload_2         
	//*  50   96:instanceof      #88  <Class zzaj>
	//*  51   99:ifeq            110
				zzbd = ((zzbd) ((zzaj)zzbd));
	//   52  102:aload_2         
	//   53  103:checkcast       #88  <Class zzaj>
	//   54  106:astore_2        
			else
	//*  55  107:goto            120
				zzbd = ((zzbd) (new zzal(ibinder2)));
	//   56  110:new             #90  <Class zzal>
	//   57  113:dup             
	//   58  114:aload           6
	//   59  116:invokespecial   #93  <Method void zzal(IBinder)>
	//   60  119:astore_2        
		}
		zzcj = ((zzaj) (zzbd));
	//   61  120:aload_0         
	//   62  121:aload_2         
	//   63  122:putfield        #95  <Field zzaj zzcj>
	//   64  125:return          
	}

	public static zzbf zza(zzu zzu1, zzaj zzaj1)
	{
		IBinder ibinder = zzu1.asBinder();
	//    0    0:aload_0         
	//    1    1:invokeinterface #106 <Method IBinder zzu.asBinder()>
	//    2    6:astore_2        
		if(zzaj1 != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          21
			zzu1 = ((zzu) (zzaj1.asBinder()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #107 <Method IBinder zzaj.asBinder()>
	//    7   17:astore_0        
		else
	//*   8   18:goto            23
			zzu1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_0        
		return new zzbf(2, ((zzbd) (null)), ((IBinder) (null)), ((PendingIntent) (null)), ibinder, ((IBinder) (zzu1)));
	//   11   23:new             #2   <Class zzbf>
	//   12   26:dup             
	//   13   27:iconst_2        
	//   14   28:aconst_null     
	//   15   29:aconst_null     
	//   16   30:aconst_null     
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:invokespecial   #109 <Method void zzbf(int, zzbd, IBinder, PendingIntent, IBinder, IBinder)>
	//   20   36:areturn         
	}

	public static zzbf zza(zzx zzx1, zzaj zzaj1)
	{
		IBinder ibinder = zzx1.asBinder();
	//    0    0:aload_0         
	//    1    1:invokeinterface #113 <Method IBinder zzx.asBinder()>
	//    2    6:astore_2        
		if(zzaj1 != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          21
			zzx1 = ((zzx) (zzaj1.asBinder()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #107 <Method IBinder zzaj.asBinder()>
	//    7   17:astore_0        
		else
	//*   8   18:goto            23
			zzx1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_0        
		return new zzbf(2, ((zzbd) (null)), ibinder, ((PendingIntent) (null)), ((IBinder) (null)), ((IBinder) (zzx1)));
	//   11   23:new             #2   <Class zzbf>
	//   12   26:dup             
	//   13   27:iconst_2        
	//   14   28:aconst_null     
	//   15   29:aload_2         
	//   16   30:aconst_null     
	//   17   31:aconst_null     
	//   18   32:aload_0         
	//   19   33:invokespecial   #109 <Method void zzbf(int, zzbd, IBinder, PendingIntent, IBinder, IBinder)>
	//   20   36:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #121 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zzcg);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #58  <Field int zzcg>
	//    7   11:invokestatic    #125 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zzdl)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #60  <Field zzbd zzdl>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #129 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		Object obj = ((Object) (zzdm));
	//   15   25:aload_0         
	//   16   26:getfield        #68  <Field zzx zzdm>
	//   17   29:astore          4
		Object obj1 = null;
	//   18   31:aconst_null     
	//   19   32:astore          5
		if(obj == null)
	//*  20   34:aload           4
	//*  21   36:ifnonnull       45
			obj = null;
	//   22   39:aconst_null     
	//   23   40:astore          4
		else
	//*  24   42:goto            54
			obj = ((Object) (((zzx) (obj)).asBinder()));
	//   25   45:aload           4
	//   26   47:invokeinterface #113 <Method IBinder zzx.asBinder()>
	//   27   52:astore          4
		SafeParcelWriter.writeIBinder(parcel, 3, ((IBinder) (obj)), false);
	//   28   54:aload_1         
	//   29   55:iconst_3        
	//   30   56:aload           4
	//   31   58:iconst_0        
	//   32   59:invokestatic    #133 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 4, ((android.os.Parcelable) (zzbv)), i, false);
	//   33   62:aload_1         
	//   34   63:iconst_4        
	//   35   64:aload_0         
	//   36   65:getfield        #70  <Field PendingIntent zzbv>
	//   37   68:iload_2         
	//   38   69:iconst_0        
	//   39   70:invokestatic    #129 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		obj = ((Object) (zzdn));
	//   40   73:aload_0         
	//   41   74:getfield        #78  <Field zzu zzdn>
	//   42   77:astore          4
		if(obj == null)
	//*  43   79:aload           4
	//*  44   81:ifnonnull       90
			obj = null;
	//   45   84:aconst_null     
	//   46   85:astore          4
		else
	//*  47   87:goto            99
			obj = ((Object) (((zzu) (obj)).asBinder()));
	//   48   90:aload           4
	//   49   92:invokeinterface #106 <Method IBinder zzu.asBinder()>
	//   50   97:astore          4
		SafeParcelWriter.writeIBinder(parcel, 5, ((IBinder) (obj)), false);
	//   51   99:aload_1         
	//   52  100:iconst_5        
	//   53  101:aload           4
	//   54  103:iconst_0        
	//   55  104:invokestatic    #133 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		obj = ((Object) (zzcj));
	//   56  107:aload_0         
	//   57  108:getfield        #95  <Field zzaj zzcj>
	//   58  111:astore          4
		if(obj == null)
	//*  59  113:aload           4
	//*  60  115:ifnonnull       125
			obj = ((Object) (obj1));
	//   61  118:aload           5
	//   62  120:astore          4
		else
	//*  63  122:goto            134
			obj = ((Object) (((zzaj) (obj)).asBinder()));
	//   64  125:aload           4
	//   65  127:invokeinterface #107 <Method IBinder zzaj.asBinder()>
	//   66  132:astore          4
		SafeParcelWriter.writeIBinder(parcel, 6, ((IBinder) (obj)), false);
	//   67  134:aload_1         
	//   68  135:bipush          6
	//   69  137:aload           4
	//   70  139:iconst_0        
	//   71  140:invokestatic    #133 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   72  143:aload_1         
	//   73  144:iload_3         
	//   74  145:invokestatic    #136 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   75  148:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbg();
	private PendingIntent zzbv;
	private int zzcg;
	private zzaj zzcj;
	private zzbd zzdl;
	private zzx zzdm;
	private zzu zzdn;

	static 
	{
	//    0    0:new             #46  <Class zzbg>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void zzbg()>
	//    3    7:putstatic       #51  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
