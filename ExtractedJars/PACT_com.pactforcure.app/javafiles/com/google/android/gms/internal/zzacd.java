// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal:
//			zzacc

public interface zzacd
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzacd
	{

		public static zzacd zzbB(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonService");
		//    4    6:aload_0         
		//    5    7:ldc1            #13  <String "com.google.android.gms.common.internal.service.ICommonService">
		//    6    9:invokeinterface #19  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzacd))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzacd>
		//*  12   23:ifeq            31
				return (zzacd)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzacd>
		//   15   30:areturn         
			else
				return ((zzacd) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzacd$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #23  <Method void zzacd$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    2: default 28
		//		               1: 46
		//		               1598968902: 38
			default:
				return super.onTransact(i, parcel, parcel1, j);
		//    2   28:aload_0         
		//    3   29:iload_1         
		//    4   30:aload_2         
		//    5   31:aload_3         
		//    6   32:iload           4
		//    7   34:invokespecial   #30  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//    8   37:ireturn         

			case 1598968902: 
				parcel1.writeString("com.google.android.gms.common.internal.service.ICommonService");
		//    9   38:aload_3         
		//   10   39:ldc1            #13  <String "com.google.android.gms.common.internal.service.ICommonService">
		//   11   41:invokevirtual   #36  <Method void Parcel.writeString(String)>
				return true;
		//   12   44:iconst_1        
		//   13   45:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.common.internal.service.ICommonService");
		//   14   46:aload_2         
		//   15   47:ldc1            #13  <String "com.google.android.gms.common.internal.service.ICommonService">
		//   16   49:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
				zza(zzacc.zza.zzbA(parcel.readStrongBinder()));
		//   17   52:aload_0         
		//   18   53:aload_2         
		//   19   54:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
		//   20   57:invokestatic    #49  <Method zzacc zzacc$zza.zzbA(IBinder)>
		//   21   60:invokevirtual   #52  <Method void zza(zzacc)>
				return true;
		//   22   63:iconst_1        
		//   23   64:ireturn         
			}
		}
	}

	private static class zza.zza
		implements zzacd
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		public void zza(zzacc zzacc1)
			throws RemoteException
		{
			IBinder ibinder;
			Parcel parcel;
			ibinder = null;
		//    0    0:aconst_null     
		//    1    1:astore_2        
			parcel = Parcel.obtain();
		//    2    2:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    5:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.service.ICommonService");
		//    4    6:aload_3         
		//    5    7:ldc1            #32  <String "com.google.android.gms.common.internal.service.ICommonService">
		//    6    9:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzacc1 == null)
				break MISSING_BLOCK_LABEL_23;
		//    7   12:aload_1         
		//    8   13:ifnull          23
			ibinder = zzacc1.asBinder();
		//    9   16:aload_1         
		//   10   17:invokeinterface #40  <Method IBinder zzacc.asBinder()>
		//   11   22:astore_2        
			parcel.writeStrongBinder(ibinder);
		//   12   23:aload_3         
		//   13   24:aload_2         
		//   14   25:invokevirtual   #43  <Method void Parcel.writeStrongBinder(IBinder)>
			zzrp.transact(1, parcel, ((Parcel) (null)), 1);
		//   15   28:aload_0         
		//   16   29:getfield        #18  <Field IBinder zzrp>
		//   17   32:iconst_1        
		//   18   33:aload_3         
		//   19   34:aconst_null     
		//   20   35:iconst_1        
		//   21   36:invokeinterface #49  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   22   41:pop             
			parcel.recycle();
		//   23   42:aload_3         
		//   24   43:invokevirtual   #52  <Method void Parcel.recycle()>
			return;
		//   25   46:return          
			zzacc1;
		//   26   47:astore_1        
			parcel.recycle();
		//   27   48:aload_3         
		//   28   49:invokevirtual   #52  <Method void Parcel.recycle()>
			throw zzacc1;
		//   29   52:aload_1         
		//   30   53:athrow          
		}

		private IBinder zzrp;

		zza.zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrp = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrp>
		//    5    9:return          
		}
	}


	public abstract void zza(zzacc zzacc)
		throws RemoteException;
}
