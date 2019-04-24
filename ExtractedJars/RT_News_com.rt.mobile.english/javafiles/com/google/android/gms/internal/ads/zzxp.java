// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzxn, zzxq, zzxs, 
//			zzel, zzzk, zzzj

public final class zzxp extends zzej
	implements zzxn
{

	zzxp(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final zzxq zzbm(String s)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		parcel.writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #28  <Method void Parcel.writeString(String)>
		parcel = ((zzej)this).transactAndReadException(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #32  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_2        
		s = ((String) (parcel.readStrongBinder()));
	//   11   17:aload_2         
	//   12   18:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:astore_1        
		if(s == null)
	//*  14   22:aload_1         
	//*  15   23:ifnonnull       31
		{
			s = null;
	//   16   26:aconst_null     
	//   17   27:astore_1        
		} else
	//*  18   28:goto            64
		{
			android.os.IInterface iinterface = ((IBinder) (s)).queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
	//   19   31:aload_1         
	//   20   32:ldc1            #38  <String "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter">
	//   21   34:invokeinterface #44  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   22   39:astore_3        
			if(iinterface instanceof zzxq)
	//*  23   40:aload_3         
	//*  24   41:instanceof      #46  <Class zzxq>
	//*  25   44:ifeq            55
				s = ((String) ((zzxq)iinterface));
	//   26   47:aload_3         
	//   27   48:checkcast       #46  <Class zzxq>
	//   28   51:astore_1        
			else
	//*  29   52:goto            64
				s = ((String) (new zzxs(((IBinder) (s)))));
	//   30   55:new             #48  <Class zzxs>
	//   31   58:dup             
	//   32   59:aload_1         
	//   33   60:invokespecial   #50  <Method void zzxs(IBinder)>
	//   34   63:astore_1        
		}
		parcel.recycle();
	//   35   64:aload_2         
	//   36   65:invokevirtual   #54  <Method void Parcel.recycle()>
		return ((zzxq) (s));
	//   37   68:aload_1         
	//   38   69:areturn         
	}

	public final boolean zzbn(String s)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		parcel.writeString(s);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #28  <Method void Parcel.writeString(String)>
		s = ((String) (((zzej)this).transactAndReadException(2, parcel)));
	//    6   10:aload_0         
	//    7   11:iconst_2        
	//    8   12:aload_3         
	//    9   13:invokevirtual   #32  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		boolean flag = zzel.zza(((Parcel) (s)));
	//   11   17:aload_1         
	//   12   18:invokestatic    #63  <Method boolean zzel.zza(Parcel)>
	//   13   21:istore_2        
		((Parcel) (s)).recycle();
	//   14   22:aload_1         
	//   15   23:invokevirtual   #54  <Method void Parcel.recycle()>
		return flag;
	//   16   26:iload_2         
	//   17   27:ireturn         
	}

	public final zzzj zzbq(String s)
		throws RemoteException
	{
		Object obj = ((Object) (((zzej)this).obtainAndWriteInterfaceToken()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		((Parcel) (obj)).writeString(s);
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #28  <Method void Parcel.writeString(String)>
		s = ((String) (((zzej)this).transactAndReadException(3, ((Parcel) (obj)))));
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #32  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//   10   16:astore_1        
		obj = ((Object) (zzzk.zzt(((Parcel) (s)).readStrongBinder())));
	//   11   17:aload_1         
	//   12   18:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//   13   21:invokestatic    #71  <Method zzzj zzzk.zzt(IBinder)>
	//   14   24:astore_2        
		((Parcel) (s)).recycle();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #54  <Method void Parcel.recycle()>
		return ((zzzj) (obj));
	//   17   29:aload_2         
	//   18   30:areturn         
	}
}
