// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.internal.stable.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			ConnectionInfo

public interface IGmsCallbacks
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements IGmsCallbacks
	{

		public static IGmsCallbacks asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.IGmsCallbacks">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IGmsCallbacks)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IGmsCallbacks>
		//*  10   19:ifeq            27
				return (IGmsCallbacks)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IGmsCallbacks>
		//   13   26:areturn         
			else
				return ((IGmsCallbacks) (new Proxy(ibinder)));
		//   14   27:new             #9   <Class IGmsCallbacks$Stub$Proxy>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IGmsCallbacks$Stub$Proxy(IBinder)>
		//   18   35:areturn         
		}

		protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     1 3: default 28
		//		               1 76
		//		               2 55
		//		               3 30
			default:
				return false;
		//    2   28:iconst_0        
		//    3   29:ireturn         

			case 3: // '\003'
				onPostInitCompleteWithConnectionInfo(parcel.readInt(), parcel.readStrongBinder(), (ConnectionInfo)zzc.zza(parcel, ConnectionInfo.CREATOR));
		//    4   30:aload_0         
		//    5   31:aload_2         
		//    6   32:invokevirtual   #39  <Method int Parcel.readInt()>
		//    7   35:aload_2         
		//    8   36:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
		//    9   39:aload_2         
		//   10   40:getstatic       #49  <Field android.os.Parcelable$Creator ConnectionInfo.CREATOR>
		//   11   43:invokestatic    #55  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   12   46:checkcast       #45  <Class ConnectionInfo>
		//   13   49:invokevirtual   #59  <Method void onPostInitCompleteWithConnectionInfo(int, IBinder, ConnectionInfo)>
				break;

		//*  14   52:goto            98
			case 2: // '\002'
				onAccountValidationComplete(parcel.readInt(), (Bundle)zzc.zza(parcel, Bundle.CREATOR));
		//   15   55:aload_0         
		//   16   56:aload_2         
		//   17   57:invokevirtual   #39  <Method int Parcel.readInt()>
		//   18   60:aload_2         
		//   19   61:getstatic       #62  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   20   64:invokestatic    #55  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   21   67:checkcast       #61  <Class Bundle>
		//   22   70:invokevirtual   #66  <Method void onAccountValidationComplete(int, Bundle)>
				break;

		//*  23   73:goto            98
			case 1: // '\001'
				onPostInitComplete(parcel.readInt(), parcel.readStrongBinder(), (Bundle)zzc.zza(parcel, Bundle.CREATOR));
		//   24   76:aload_0         
		//   25   77:aload_2         
		//   26   78:invokevirtual   #39  <Method int Parcel.readInt()>
		//   27   81:aload_2         
		//   28   82:invokevirtual   #43  <Method IBinder Parcel.readStrongBinder()>
		//   29   85:aload_2         
		//   30   86:getstatic       #62  <Field android.os.Parcelable$Creator Bundle.CREATOR>
		//   31   89:invokestatic    #55  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
		//   32   92:checkcast       #61  <Class Bundle>
		//   33   95:invokevirtual   #70  <Method void onPostInitComplete(int, IBinder, Bundle)>
				break;
			}
			parcel1.writeNoException();
		//   34   98:aload_3         
		//   35   99:invokevirtual   #73  <Method void Parcel.writeNoException()>
			return true;
		//   36  102:iconst_1        
		//   37  103:ireturn         
		}

		public Stub()
		{
			super("com.google.android.gms.common.internal.IGmsCallbacks");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.IGmsCallbacks">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static class Stub.Proxy extends zza
		implements IGmsCallbacks
	{

		public void onAccountValidationComplete(int i, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore_3        
			parcel.writeInt(i);
		//    3    5:aload_3         
		//    4    6:iload_1         
		//    5    7:invokevirtual   #32  <Method void Parcel.writeInt(int)>
			zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
		//    6   10:aload_3         
		//    7   11:aload_2         
		//    8   12:invokestatic    #38  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			((zza)this).transactAndReadExceptionReturnVoid(2, parcel);
		//    9   15:aload_0         
		//   10   16:iconst_2        
		//   11   17:aload_3         
		//   12   18:invokevirtual   #42  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
		//   13   21:return          
		}

		public void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          4
			parcel.writeInt(i);
		//    3    6:aload           4
		//    4    8:iload_1         
		//    5    9:invokevirtual   #32  <Method void Parcel.writeInt(int)>
			parcel.writeStrongBinder(ibinder);
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokevirtual   #48  <Method void Parcel.writeStrongBinder(IBinder)>
			zzc.zza(parcel, ((android.os.Parcelable) (bundle)));
		//    9   18:aload           4
		//   10   20:aload_3         
		//   11   21:invokestatic    #38  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			((zza)this).transactAndReadExceptionReturnVoid(1, parcel);
		//   12   24:aload_0         
		//   13   25:iconst_1        
		//   14   26:aload           4
		//   15   28:invokevirtual   #42  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
		//   16   31:return          
		}

		public void onPostInitCompleteWithConnectionInfo(int i, IBinder ibinder, ConnectionInfo connectioninfo)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          4
			parcel.writeInt(i);
		//    3    6:aload           4
		//    4    8:iload_1         
		//    5    9:invokevirtual   #32  <Method void Parcel.writeInt(int)>
			parcel.writeStrongBinder(ibinder);
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokevirtual   #48  <Method void Parcel.writeStrongBinder(IBinder)>
			zzc.zza(parcel, ((android.os.Parcelable) (connectioninfo)));
		//    9   18:aload           4
		//   10   20:aload_3         
		//   11   21:invokestatic    #38  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			((zza)this).transactAndReadExceptionReturnVoid(3, parcel);
		//   12   24:aload_0         
		//   13   25:iconst_3        
		//   14   26:aload           4
		//   15   28:invokevirtual   #42  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
		//   16   31:return          
		}

		Stub.Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.IGmsCallbacks");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IGmsCallbacks">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract void onAccountValidationComplete(int i, Bundle bundle)
		throws RemoteException;

	public abstract void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
		throws RemoteException;

	public abstract void onPostInitCompleteWithConnectionInfo(int i, IBinder ibinder, ConnectionInfo connectioninfo)
		throws RemoteException;
}
