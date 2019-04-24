// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzx, zzaf

public static abstract class zzx$zza extends Binder
	implements zzx
{
	private static class zza
		implements zzx
	{

		public IBinder asBinder()
		{
			return zzrp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrp>
		//    2    4:areturn         
		}

		public void zza(zzaf zzaf1)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    1    3:astore_2        
			parcel1 = Parcel.obtain();
		//    2    4:invokestatic    #30  <Method Parcel Parcel.obtain()>
		//    3    7:astore_3        
			parcel.writeInterfaceToken("com.google.android.gms.common.internal.IResolveAccountCallbacks");
		//    4    8:aload_2         
		//    5    9:ldc1            #32  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
		//    6   11:invokevirtual   #36  <Method void Parcel.writeInterfaceToken(String)>
			if(zzaf1 == null)
				break MISSING_BLOCK_LABEL_56;
		//    7   14:aload_1         
		//    8   15:ifnull          56
			parcel.writeInt(1);
		//    9   18:aload_2         
		//   10   19:iconst_1        
		//   11   20:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			zzaf1.writeToParcel(parcel, 0);
		//   12   23:aload_1         
		//   13   24:aload_2         
		//   14   25:iconst_0        
		//   15   26:invokevirtual   #46  <Method void zzaf.writeToParcel(Parcel, int)>
_L1:
			zzrp.transact(2, parcel, parcel1, 0);
		//   16   29:aload_0         
		//   17   30:getfield        #18  <Field IBinder zzrp>
		//   18   33:iconst_2        
		//   19   34:aload_2         
		//   20   35:aload_3         
		//   21   36:iconst_0        
		//   22   37:invokeinterface #52  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   42:pop             
			parcel1.readException();
		//   24   43:aload_3         
		//   25   44:invokevirtual   #55  <Method void Parcel.readException()>
			parcel1.recycle();
		//   26   47:aload_3         
		//   27   48:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   28   51:aload_2         
		//   29   52:invokevirtual   #58  <Method void Parcel.recycle()>
			return;
		//   30   55:return          
			parcel.writeInt(0);
		//   31   56:aload_2         
		//   32   57:iconst_0        
		//   33   58:invokevirtual   #40  <Method void Parcel.writeInt(int)>
			  goto _L1
		//*  34   61:goto            29
			zzaf1;
		//   35   64:astore_1        
			parcel1.recycle();
		//   36   65:aload_3         
		//   37   66:invokevirtual   #58  <Method void Parcel.recycle()>
			parcel.recycle();
		//   38   69:aload_2         
		//   39   70:invokevirtual   #58  <Method void Parcel.recycle()>
			throw zzaf1;
		//   40   73:aload_1         
		//   41   74:athrow          
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


	public static zzx zzbw(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
	//    4    6:aload_0         
	//    5    7:ldc1            #13  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
	//    6    9:invokeinterface #19  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzx))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzx>
	//*  12   23:ifeq            31
			return (zzx)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzx>
	//   15   30:areturn         
		else
			return ((zzx) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzx$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #23  <Method void zzx$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               2: 46
	//	               1598968902: 38
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
			parcel1.writeString("com.google.android.gms.common.internal.IResolveAccountCallbacks");
	//    9   38:aload_3         
	//   10   39:ldc1            #13  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
	//   11   41:invokevirtual   #36  <Method void Parcel.writeString(String)>
			return true;
	//   12   44:iconst_1        
	//   13   45:ireturn         

		case 2: // '\002'
			parcel.enforceInterface("com.google.android.gms.common.internal.IResolveAccountCallbacks");
	//   14   46:aload_2         
	//   15   47:ldc1            #13  <String "com.google.android.gms.common.internal.IResolveAccountCallbacks">
	//   16   49:invokevirtual   #39  <Method void Parcel.enforceInterface(String)>
			break;
		}
		if(parcel.readInt() != 0)
	//*  17   52:aload_2         
	//*  18   53:invokevirtual   #43  <Method int Parcel.readInt()>
	//*  19   56:ifeq            83
			parcel = ((Parcel) ((zzaf)zzaf.CREATOR.createFromParcel(parcel)));
	//   20   59:getstatic       #49  <Field android.os.Parcelable$Creator zzaf.CREATOR>
	//   21   62:aload_2         
	//   22   63:invokeinterface #55  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
	//   23   68:checkcast       #45  <Class zzaf>
	//   24   71:astore_2        
		else
	//*  25   72:aload_0         
	//*  26   73:aload_2         
	//*  27   74:invokevirtual   #58  <Method void zza(zzaf)>
	//*  28   77:aload_3         
	//*  29   78:invokevirtual   #62  <Method void Parcel.writeNoException()>
	//*  30   81:iconst_1        
	//*  31   82:ireturn         
			parcel = null;
	//   32   83:aconst_null     
	//   33   84:astore_2        
		zza(((zzaf) (parcel)));
		parcel1.writeNoException();
		return true;
	//*  34   85:goto            72
	}
}
