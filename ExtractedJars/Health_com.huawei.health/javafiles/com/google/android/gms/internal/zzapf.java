// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.common.api.Status;

public interface zzapf
	extends IInterface
{
	public static abstract class zza extends Binder
		implements zzapf
	{

		public static zzapf zzcJ(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
		//    4    6:aload_0         
		//    5    7:ldc1            #15  <String "com.google.android.gms.fitness.internal.IStatusCallback">
		//    6    9:invokeinterface #28  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface != null && (iinterface instanceof zzapf))
		//*   8   15:aload_1         
		//*   9   16:ifnull          31
		//*  10   19:aload_1         
		//*  11   20:instanceof      #6   <Class zzapf>
		//*  12   23:ifeq            31
				return (zzapf)iinterface;
		//   13   26:aload_1         
		//   14   27:checkcast       #6   <Class zzapf>
		//   15   30:areturn         
			else
				return ((zzapf) (new zza(ibinder)));
		//   16   31:new             #9   <Class zzapf$zza$zza>
		//   17   34:dup             
		//   18   35:aload_0         
		//   19   36:invokespecial   #31  <Method void zzapf$zza$zza(IBinder)>
		//   20   39:areturn         
		}

		public IBinder asBinder()
		{
			return ((IBinder) (this));
		//    0    0:aload_0         
		//    1    1:areturn         
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:lookupswitch    2: default 28
		//		               1: 39
		//		               1598968902: 31
		//*   2   28:goto            77
			case 1598968902: 
				parcel1.writeString("com.google.android.gms.fitness.internal.IStatusCallback");
		//    3   31:aload_3         
		//    4   32:ldc1            #15  <String "com.google.android.gms.fitness.internal.IStatusCallback">
		//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
				return true;
		//    6   37:iconst_1        
		//    7   38:ireturn         

			case 1: // '\001'
				parcel.enforceInterface("com.google.android.gms.fitness.internal.IStatusCallback");
		//    8   39:aload_2         
		//    9   40:ldc1            #15  <String "com.google.android.gms.fitness.internal.IStatusCallback">
		//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
				if(parcel.readInt() != 0)
		//*  11   45:aload_2         
		//*  12   46:invokevirtual   #50  <Method int Parcel.readInt()>
		//*  13   49:ifeq            68
					parcel = ((Parcel) ((Status)Status.CREATOR.createFromParcel(parcel)));
		//   14   52:getstatic       #56  <Field android.os.Parcelable$Creator Status.CREATOR>
		//   15   55:aload_2         
		//   16   56:invokeinterface #62  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   17   61:checkcast       #52  <Class Status>
		//   18   64:astore_2        
				else
		//*  19   65:goto            70
					parcel = null;
		//   20   68:aconst_null     
		//   21   69:astore_2        
				zzp(((Status) (parcel)));
		//   22   70:aload_0         
		//   23   71:aload_2         
		//   24   72:invokevirtual   #66  <Method void zzp(Status)>
				return true;
		//   25   75:iconst_1        
		//   26   76:ireturn         
			}
			return super.onTransact(i, parcel, parcel1, j);
		//   27   77:aload_0         
		//   28   78:iload_1         
		//   29   79:aload_2         
		//   30   80:aload_3         
		//   31   81:iload           4
		//   32   83:invokespecial   #68  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
		//   33   86:ireturn         
		}

		public zza()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Binder()>
			attachInterface(((IInterface) (this)), "com.google.android.gms.fitness.internal.IStatusCallback");
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:ldc1            #15  <String "com.google.android.gms.fitness.internal.IStatusCallback">
		//    5    8:invokevirtual   #19  <Method void attachInterface(IInterface, String)>
		//    6   11:return          
		}
	}

	static class zza.zza
		implements zzapf
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public void zzp(Status status)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("com.google.android.gms.fitness.internal.IStatusCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #33  <String "com.google.android.gms.fitness.internal.IStatusCallback">
		//    4    7:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(status == null)
				break MISSING_BLOCK_LABEL_28;
		//    5   10:aload_1         
		//    6   11:ifnull          28
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			status.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #47  <Method void Status.writeToParcel(Parcel, int)>
			break MISSING_BLOCK_LABEL_33;
		//   14   25:goto            33
			parcel.writeInt(0);
		//   15   28:aload_2         
		//   16   29:iconst_0        
		//   17   30:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			zzrk.transact(1, parcel, ((Parcel) (null)), 1);
		//   18   33:aload_0         
		//   19   34:getfield        #18  <Field IBinder zzrk>
		//   20   37:iconst_1        
		//   21   38:aload_2         
		//   22   39:aconst_null     
		//   23   40:iconst_1        
		//   24   41:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   25   46:pop             
			parcel.recycle();
		//   26   47:aload_2         
		//   27   48:invokevirtual   #56  <Method void Parcel.recycle()>
			return;
		//   28   51:return          
			status;
		//   29   52:astore_1        
			parcel.recycle();
		//   30   53:aload_2         
		//   31   54:invokevirtual   #56  <Method void Parcel.recycle()>
			throw status;
		//   32   57:aload_1         
		//   33   58:athrow          
		}

		private IBinder zzrk;

		zza.zza(IBinder ibinder)
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


	public abstract void zzp(Status status)
		throws RemoteException;
}
