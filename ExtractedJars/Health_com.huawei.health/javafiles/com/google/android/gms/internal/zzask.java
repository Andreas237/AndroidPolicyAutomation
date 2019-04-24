// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.zzj;
import com.google.android.gms.location.zzk;

// Referenced classes of package com.google.android.gms.internal:
//			zzasl, zzasc, zzasi

public class zzask extends zza
{

	zzask(int i, zzasi zzasi, IBinder ibinder, PendingIntent pendingintent, IBinder ibinder1, IBinder ibinder2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void zza()>
		zzbkP = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #33  <Field int zzbkP>
		zzbkQ = zzasi;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field zzasi zzbkQ>
		if(ibinder == null)
	//*   8   14:aload_3         
	//*   9   15:ifnonnull       23
			zzasi = null;
	//   10   18:aconst_null     
	//   11   19:astore_2        
		else
	//*  12   20:goto            28
			zzasi = ((zzasi) (com.google.android.gms.location.zzk.zza.zzde(ibinder)));
	//   13   23:aload_3         
	//   14   24:invokestatic    #41  <Method zzk com.google.android.gms.location.zzk$zza.zzde(IBinder)>
	//   15   27:astore_2        
		zzbkR = ((zzk) (zzasi));
	//   16   28:aload_0         
	//   17   29:aload_2         
	//   18   30:putfield        #43  <Field zzk zzbkR>
		mPendingIntent = pendingintent;
	//   19   33:aload_0         
	//   20   34:aload           4
	//   21   36:putfield        #45  <Field PendingIntent mPendingIntent>
		if(ibinder1 == null)
	//*  22   39:aload           5
	//*  23   41:ifnonnull       49
			zzasi = null;
	//   24   44:aconst_null     
	//   25   45:astore_2        
		else
	//*  26   46:goto            55
			zzasi = ((zzasi) (com.google.android.gms.location.zzj.zza.zzdd(ibinder1)));
	//   27   49:aload           5
	//   28   51:invokestatic    #51  <Method zzj com.google.android.gms.location.zzj$zza.zzdd(IBinder)>
	//   29   54:astore_2        
		zzbkS = ((zzj) (zzasi));
	//   30   55:aload_0         
	//   31   56:aload_2         
	//   32   57:putfield        #53  <Field zzj zzbkS>
		if(ibinder2 == null)
	//*  33   60:aload           6
	//*  34   62:ifnonnull       70
			zzasi = null;
	//   35   65:aconst_null     
	//   36   66:astore_2        
		else
	//*  37   67:goto            76
			zzasi = ((zzasi) (zzasc.zza.zzdg(ibinder2)));
	//   38   70:aload           6
	//   39   72:invokestatic    #59  <Method zzasc zzasc$zza.zzdg(IBinder)>
	//   40   75:astore_2        
		zzbkT = ((zzasc) (zzasi));
	//   41   76:aload_0         
	//   42   77:aload_2         
	//   43   78:putfield        #61  <Field zzasc zzbkT>
	//   44   81:return          
	}

	public static zzask zza(zzasi zzasi, PendingIntent pendingintent, zzasc zzasc1)
	{
		if(zzasc1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          14
			zzasc1 = ((zzasc) (zzasc1.asBinder()));
	//    2    4:aload_2         
	//    3    5:invokeinterface #70  <Method IBinder zzasc.asBinder()>
	//    4   10:astore_2        
		else
	//*   5   11:goto            16
			zzasc1 = null;
	//    6   14:aconst_null     
	//    7   15:astore_2        
		return new zzask(1, zzasi, ((IBinder) (null)), pendingintent, ((IBinder) (null)), ((IBinder) (zzasc1)));
	//    8   16:new             #2   <Class zzask>
	//    9   19:dup             
	//   10   20:iconst_1        
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:aload_1         
	//   14   24:aconst_null     
	//   15   25:aload_2         
	//   16   26:invokespecial   #72  <Method void zzask(int, zzasi, IBinder, PendingIntent, IBinder, IBinder)>
	//   17   29:areturn         
	}

	public static zzask zza(zzasi zzasi, zzj zzj1, zzasc zzasc1)
	{
		IBinder ibinder = zzj1.asBinder();
	//    0    0:aload_1         
	//    1    1:invokeinterface #77  <Method IBinder zzj.asBinder()>
	//    2    6:astore_3        
		if(zzasc1 != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          21
			zzj1 = ((zzj) (zzasc1.asBinder()));
	//    5   11:aload_2         
	//    6   12:invokeinterface #70  <Method IBinder zzasc.asBinder()>
	//    7   17:astore_1        
		else
	//*   8   18:goto            23
			zzj1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_1        
		return new zzask(1, zzasi, ((IBinder) (null)), ((PendingIntent) (null)), ibinder, ((IBinder) (zzj1)));
	//   11   23:new             #2   <Class zzask>
	//   12   26:dup             
	//   13   27:iconst_1        
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:aconst_null     
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokespecial   #72  <Method void zzask(int, zzasi, IBinder, PendingIntent, IBinder, IBinder)>
	//   20   36:areturn         
	}

	public static zzask zza(zzasi zzasi, zzk zzk1, zzasc zzasc1)
	{
		IBinder ibinder = zzk1.asBinder();
	//    0    0:aload_1         
	//    1    1:invokeinterface #81  <Method IBinder zzk.asBinder()>
	//    2    6:astore_3        
		if(zzasc1 != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          21
			zzk1 = ((zzk) (zzasc1.asBinder()));
	//    5   11:aload_2         
	//    6   12:invokeinterface #70  <Method IBinder zzasc.asBinder()>
	//    7   17:astore_1        
		else
	//*   8   18:goto            23
			zzk1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_1        
		return new zzask(1, zzasi, ibinder, ((PendingIntent) (null)), ((IBinder) (null)), ((IBinder) (zzk1)));
	//   11   23:new             #2   <Class zzask>
	//   12   26:dup             
	//   13   27:iconst_1        
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:aconst_null     
	//   17   31:aconst_null     
	//   18   32:aload_1         
	//   19   33:invokespecial   #72  <Method void zzask(int, zzasi, IBinder, PendingIntent, IBinder, IBinder)>
	//   20   36:areturn         
	}

	public static zzask zza(zzj zzj1, zzasc zzasc1)
	{
		IBinder ibinder = zzj1.asBinder();
	//    0    0:aload_0         
	//    1    1:invokeinterface #77  <Method IBinder zzj.asBinder()>
	//    2    6:astore_2        
		if(zzasc1 != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          21
			zzj1 = ((zzj) (zzasc1.asBinder()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #70  <Method IBinder zzasc.asBinder()>
	//    7   17:astore_0        
		else
	//*   8   18:goto            23
			zzj1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_0        
		return new zzask(2, ((zzasi) (null)), ((IBinder) (null)), ((PendingIntent) (null)), ibinder, ((IBinder) (zzj1)));
	//   11   23:new             #2   <Class zzask>
	//   12   26:dup             
	//   13   27:iconst_2        
	//   14   28:aconst_null     
	//   15   29:aconst_null     
	//   16   30:aconst_null     
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:invokespecial   #72  <Method void zzask(int, zzasi, IBinder, PendingIntent, IBinder, IBinder)>
	//   20   36:areturn         
	}

	public static zzask zza(zzk zzk1, zzasc zzasc1)
	{
		IBinder ibinder = zzk1.asBinder();
	//    0    0:aload_0         
	//    1    1:invokeinterface #81  <Method IBinder zzk.asBinder()>
	//    2    6:astore_2        
		if(zzasc1 != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          21
			zzk1 = ((zzk) (zzasc1.asBinder()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #70  <Method IBinder zzasc.asBinder()>
	//    7   17:astore_0        
		else
	//*   8   18:goto            23
			zzk1 = null;
	//    9   21:aconst_null     
	//   10   22:astore_0        
		return new zzask(2, ((zzasi) (null)), ibinder, ((PendingIntent) (null)), ((IBinder) (null)), ((IBinder) (zzk1)));
	//   11   23:new             #2   <Class zzask>
	//   12   26:dup             
	//   13   27:iconst_2        
	//   14   28:aconst_null     
	//   15   29:aload_2         
	//   16   30:aconst_null     
	//   17   31:aconst_null     
	//   18   32:aload_0         
	//   19   33:invokespecial   #72  <Method void zzask(int, zzasi, IBinder, PendingIntent, IBinder, IBinder)>
	//   20   36:areturn         
	}

	public static zzask zzb(PendingIntent pendingintent, zzasc zzasc1)
	{
		if(zzasc1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			zzasc1 = ((zzasc) (zzasc1.asBinder()));
	//    2    4:aload_1         
	//    3    5:invokeinterface #70  <Method IBinder zzasc.asBinder()>
	//    4   10:astore_1        
		else
	//*   5   11:goto            16
			zzasc1 = null;
	//    6   14:aconst_null     
	//    7   15:astore_1        
		return new zzask(2, ((zzasi) (null)), ((IBinder) (null)), pendingintent, ((IBinder) (null)), ((IBinder) (zzasc1)));
	//    8   16:new             #2   <Class zzask>
	//    9   19:dup             
	//   10   20:iconst_2        
	//   11   21:aconst_null     
	//   12   22:aconst_null     
	//   13   23:aload_0         
	//   14   24:aconst_null     
	//   15   25:aload_1         
	//   16   26:invokespecial   #72  <Method void zzask(int, zzasi, IBinder, PendingIntent, IBinder, IBinder)>
	//   17   29:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzasl.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #90  <Method void com.google.android.gms.internal.zzasl.zza(zzask, Parcel, int)>
	//    4    6:return          
	}

	IBinder zzIr()
	{
		if(zzbkR == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #43  <Field zzk zzbkR>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzbkR.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field zzk zzbkR>
	//    7   13:invokeinterface #81  <Method IBinder zzk.asBinder()>
	//    8   18:areturn         
	}

	IBinder zzIs()
	{
		if(zzbkS == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field zzj zzbkS>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzbkS.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field zzj zzbkS>
	//    7   13:invokeinterface #77  <Method IBinder zzj.asBinder()>
	//    8   18:areturn         
	}

	IBinder zzIt()
	{
		if(zzbkT == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field zzasc zzbkT>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zzbkT.asBinder();
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field zzasc zzbkT>
	//    7   13:invokeinterface #70  <Method IBinder zzasc.asBinder()>
	//    8   18:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzasl();
	PendingIntent mPendingIntent;
	int zzbkP;
	zzasi zzbkQ;
	zzk zzbkR;
	zzj zzbkS;
	zzasc zzbkT;

	static 
	{
	//    0    0:new             #23  <Class zzasl>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void zzasl()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
