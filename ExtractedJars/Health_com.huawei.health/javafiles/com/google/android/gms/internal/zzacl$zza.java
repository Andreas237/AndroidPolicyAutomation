// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacl, zzack

public static abstract class zzacl$zza extends Binder
	implements zzacl
{
	static class zza
		implements zzacl
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zza(zzack zzack1)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
		//    2    4:aload_2         
		//    3    5:ldc1            #32  <String "com.google.android.gms.common.internal.service.ICommonService">
		//    4    7:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzack1 == null) goto _L2; else goto _L1
		//    5   10:aload_1         
		//    6   11:ifnull          55
_L1:
			zzack1 = ((zzack) (zzack1.asBinder()));
		//    7   14:aload_1         
		//    8   15:invokeinterface #40  <Method IBinder zzack.asBinder()>
		//    9   20:astore_1        
		//*  10   21:goto            24
_L4:
			parcel.writeStrongBinder(((IBinder) (zzack1)));
		//   11   24:aload_2         
		//   12   25:aload_1         
		//   13   26:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrk.transact(1, parcel, ((Parcel) (null)), 1);
		//   14   29:aload_0         
		//   15   30:getfield        #18  <Field IBinder zzrk>
		//   16   33:iconst_1        
		//   17   34:aload_2         
		//   18   35:aconst_null     
		//   19   36:iconst_1        
		//   20   37:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   21   42:pop             
			parcel.recycle();
		//   22   43:aload_2         
		//   23   44:invokevirtual   #52  <Method void Parcel.recycle()>
			return;
		//   24   47:return          
			zzack1;
		//   25   48:astore_1        
			parcel.recycle();
		//   26   49:aload_2         
		//   27   50:invokevirtual   #52  <Method void Parcel.recycle()>
			throw zzack1;
		//   28   53:aload_1         
		//   29   54:athrow          
_L2:
			zzack1 = null;
		//   30   55:aconst_null     
		//   31   56:astore_1        
			if(true) goto _L4; else goto _L3
		//   32   57:goto            24
_L3:
		}

		private IBinder zzrk;

		zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrk = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrk>
		//    5    9:return          
		}
	}


	public static zzacl zzbB(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.common.internal.service.ICommonService">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzacl))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzacl>
	//*  12   23:ifeq            31
			return (zzacl)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzacl>
	//   15   30:areturn         
		else
			return ((zzacl) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzacl$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zzacl$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               1: 39
	//	               1598968902: 31
	//*   2   28:goto            58
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.common.internal.service.ICommonService");
	//    3   31:aload_3         
	//    4   32:ldc1            #13  <String "com.google.android.gms.common.internal.service.ICommonService">
	//    5   34:invokevirtual   #34  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
	//    8   39:aload_2         
	//    9   40:ldc1            #13  <String "com.google.android.gms.common.internal.service.ICommonService">
	//   10   42:invokevirtual   #37  <Method void Parcel.enforceInterface(String)>
			zza(zzack$zza.zzbA(parcel.readStrongBinder()));
	//   11   45:aload_0         
	//   12   46:aload_2         
	//   13   47:invokevirtual   #41  <Method IBinder Parcel.readStrongBinder()>
	//   14   50:invokestatic    #47  <Method zzack zzack$zza.zzbA(IBinder)>
	//   15   53:invokevirtual   #50  <Method void zza(zzack)>
			return true;
	//   16   56:iconst_1        
	//   17   57:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   18   58:aload_0         
	//   19   59:iload_1         
	//   20   60:aload_2         
	//   21   61:aload_3         
	//   22   62:iload           4
	//   23   64:invokespecial   #52  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   24   67:ireturn         
	}
}
