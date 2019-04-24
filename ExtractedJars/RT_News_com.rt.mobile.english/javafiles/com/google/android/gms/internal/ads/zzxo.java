// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzek, zzxn, zzxp, zzel

public abstract class zzxo extends zzek
	implements zzxn
{

	public zzxo()
	{
		super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator">
	//    2    3:invokespecial   #13  <Method void zzek(String)>
	//    3    6:return          
	}

	public static zzxn zzr(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
	//    4    6:aload_0         
	//    5    7:ldc1            #10  <String "com.google.android.gms.ads.internal.mediation.client.IAdapterCreator">
	//    6    9:invokeinterface #22  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof zzxn)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class zzxn>
	//*  10   19:ifeq            27
			return (zzxn)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class zzxn>
	//   13   26:areturn         
		else
			return ((zzxn) (new zzxp(ibinder)));
	//   14   27:new             #24  <Class zzxp>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #27  <Method void zzxp(IBinder)>
	//   18   35:areturn         
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		i;
	//    0    0:iload_1         
		JVM INSTR tableswitch 1 3: default 28
	//	               1 65
	//	               2 42
	//	               3 30;
	//    1    1:tableswitch     1 3: default 28
	//	               1 65
	//	               2 42
	//	               3 30
		   goto _L1 _L2 _L3 _L4
_L1:
		return false;
	//    2   28:iconst_0        
	//    3   29:ireturn         
_L4:
		parcel = ((Parcel) (zzbq(parcel.readString())));
	//    4   30:aload_0         
	//    5   31:aload_2         
	//    6   32:invokevirtual   #37  <Method String Parcel.readString()>
	//    7   35:invokevirtual   #41  <Method zzzj zzbq(String)>
	//    8   38:astore_2        
		  goto _L5
	//*   9   39:goto            74
_L3:
		boolean flag = zzbn(parcel.readString());
	//   10   42:aload_0         
	//   11   43:aload_2         
	//   12   44:invokevirtual   #37  <Method String Parcel.readString()>
	//   13   47:invokevirtual   #45  <Method boolean zzbn(String)>
	//   14   50:istore          5
		parcel1.writeNoException();
	//   15   52:aload_3         
	//   16   53:invokevirtual   #48  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, flag);
	//   17   56:aload_3         
	//   18   57:iload           5
	//   19   59:invokestatic    #54  <Method void zzel.zza(Parcel, boolean)>
		  goto _L6
	//*  20   62:goto            83
_L2:
		parcel = ((Parcel) (zzbm(parcel.readString())));
	//   21   65:aload_0         
	//   22   66:aload_2         
	//   23   67:invokevirtual   #37  <Method String Parcel.readString()>
	//   24   70:invokevirtual   #58  <Method zzxq zzbm(String)>
	//   25   73:astore_2        
_L5:
		parcel1.writeNoException();
	//   26   74:aload_3         
	//   27   75:invokevirtual   #48  <Method void Parcel.writeNoException()>
		zzel.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   28   78:aload_3         
	//   29   79:aload_2         
	//   30   80:invokestatic    #61  <Method void zzel.zza(Parcel, android.os.IInterface)>
_L6:
		return true;
	//   31   83:iconst_1        
	//   32   84:ireturn         
	}
}
