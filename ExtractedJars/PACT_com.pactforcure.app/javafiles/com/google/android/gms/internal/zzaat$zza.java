// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.*;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//			zzaat

public static abstract class zzaat$zza extends Binder
	implements zzaat
{
	private static class zza
		implements zzaat
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		public void zzp(Status status)
			throws RemoteException
		{
			Parcel parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel.writeInterfaceToken("com.google.android.gms.common.api.internal.IStatusCallback");
		//    2    4:aload_2         
		//    3    5:ldc1            #33  <String "com.google.android.gms.common.api.internal.IStatusCallback">
		//    4    7:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
			if(status == null)
				break MISSING_BLOCK_LABEL_44;
		//    5   10:aload_1         
		//    6   11:ifnull          44
			parcel.writeInt(1);
		//    7   14:aload_2         
		//    8   15:iconst_1        
		//    9   16:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			status.writeToParcel(parcel, 0);
		//   10   19:aload_1         
		//   11   20:aload_2         
		//   12   21:iconst_0        
		//   13   22:invokevirtual   #47  <Method void Status.writeToParcel(Parcel, int)>
_L1:
			zzrp.transact(1, parcel, ((Parcel) (null)), 1);
		//   14   25:aload_0         
		//   15   26:getfield        #18  <Field IBinder zzrp>
		//   16   29:iconst_1        
		//   17   30:aload_2         
		//   18   31:aconst_null     
		//   19   32:iconst_1        
		//   20   33:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   21   38:pop             
			parcel.recycle();
		//   22   39:aload_2         
		//   23   40:invokevirtual   #56  <Method void Parcel.recycle()>
			return;
		//   24   43:return          
			parcel.writeInt(0);
		//   25   44:aload_2         
		//   26   45:iconst_0        
		//   27   46:invokevirtual   #41  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  28   49:goto            25
			status;
		//   29   52:astore_1        
			parcel.recycle();
		//   30   53:aload_2         
		//   31   54:invokevirtual   #56  <Method void Parcel.recycle()>
			throw status;
		//   32   57:aload_1         
		//   33   58:athrow          
		}

		private IBinder zzrp;

		zza(IBinder ibinder)
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


	public static zzaat zzbp(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.common.api.internal.IStatusCallback">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzaat))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzaat>
	//*  12   23:ifeq            31
			return (zzaat)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzaat>
	//   15   30:areturn         
		else
			return ((zzaat) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzaat$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzaat$zza$zza(IBinder)>
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
	//	               1: 46
	//	               1598968902: 38
		default:
			return super.onTransact(i, parcel, parcel1, j);
	//    2   28:aload_0         
	//    3   29:iload_1         
	//    4   30:aload_2         
	//    5   31:aload_3         
	//    6   32:iload           4
	//    7   34:invokespecial   #39  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//    8   37:ireturn         

		case 1598968902: 
			parcel1.writeString("com.google.android.gms.common.api.internal.IStatusCallback");
	//    9   38:aload_3         
	//   10   39:ldc1            #15  <String "com.google.android.gms.common.api.internal.IStatusCallback">
	//   11   41:invokevirtual   #45  <Method void Parcel.writeString(String)>
			return true;
	//   12   44:iconst_1        
	//   13   45:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.common.api.internal.IStatusCallback");
	//   14   46:aload_2         
	//   15   47:ldc1            #15  <String "com.google.android.gms.common.api.internal.IStatusCallback">
	//   16   49:invokevirtual   #48  <Method void Parcel.enforceInterface(String)>
			break;
		}
		if(parcel.readInt() != 0)
	//*  17   52:aload_2         
	//*  18   53:invokevirtual   #52  <Method int Parcel.readInt()>
	//*  19   56:ifeq            79
			parcel = ((Parcel) ((Status)Status.CREATOR.createFromParcel(parcel)));
	//   20   59:getstatic       #58  <Field android.os.Parcelable$Creator Status.CREATOR>
	//   21   62:aload_2         
	//   22   63:invokeinterface #64  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   68:checkcast       #54  <Class Status>
	//   24   71:astore_2        
		else
	//*  25   72:aload_0         
	//*  26   73:aload_2         
	//*  27   74:invokevirtual   #68  <Method void zzp(Status)>
	//*  28   77:iconst_1        
	//*  29   78:ireturn         
			parcel = null;
	//   30   79:aconst_null     
	//   31   80:astore_2        
		zzp(((Status) (parcel)));
		return true;
	//*  32   81:goto            72
	}

	public zzaat$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.common.api.internal.IStatusCallback");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.common.api.internal.IStatusCallback">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
