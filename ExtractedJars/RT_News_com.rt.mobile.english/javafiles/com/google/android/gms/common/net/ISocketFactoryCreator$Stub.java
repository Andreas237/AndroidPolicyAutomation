// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.net;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.*;

// Referenced classes of package com.google.android.gms.common.net:
//			ISocketFactoryCreator

public static abstract class ISocketFactoryCreator$Stub extends zzb
	implements ISocketFactoryCreator
{
	public static class Proxy extends zza
		implements ISocketFactoryCreator
	{

		public IObjectWrapper newSocketFactory(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2, boolean flag)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          5
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    3    6:aload           5
		//    4    8:aload_1         
		//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
		//    6   12:aload           5
		//    7   14:aload_2         
		//    8   15:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
		//    9   18:aload           5
		//   10   20:aload_3         
		//   11   21:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			zzc.zza(parcel, flag);
		//   12   24:aload           5
		//   13   26:iload           4
		//   14   28:invokestatic    #35  <Method void zzc.zza(Parcel, boolean)>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, parcel)));
		//   15   31:aload_0         
		//   16   32:iconst_1        
		//   17   33:aload           5
		//   18   35:invokevirtual   #39  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   19   38:astore_1        
			iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder());
		//   20   39:aload_1         
		//   21   40:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
		//   22   43:invokestatic    #51  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   23   46:astore_2        
			((Parcel) (iobjectwrapper)).recycle();
		//   24   47:aload_1         
		//   25   48:invokevirtual   #55  <Method void Parcel.recycle()>
			return iobjectwrapper1;
		//   26   51:aload_2         
		//   27   52:areturn         
		}

		public IObjectWrapper newSocketFactoryWithCacheDir(IObjectWrapper iobjectwrapper, IObjectWrapper iobjectwrapper1, IObjectWrapper iobjectwrapper2, String s)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          5
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    3    6:aload           5
		//    4    8:aload_1         
		//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper1)));
		//    6   12:aload           5
		//    7   14:aload_2         
		//    8   15:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper2)));
		//    9   18:aload           5
		//   10   20:aload_3         
		//   11   21:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			parcel.writeString(s);
		//   12   24:aload           5
		//   13   26:aload           4
		//   14   28:invokevirtual   #62  <Method void Parcel.writeString(String)>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(2, parcel)));
		//   15   31:aload_0         
		//   16   32:iconst_2        
		//   17   33:aload           5
		//   18   35:invokevirtual   #39  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   19   38:astore_1        
			iobjectwrapper1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder());
		//   20   39:aload_1         
		//   21   40:invokevirtual   #45  <Method IBinder Parcel.readStrongBinder()>
		//   22   43:invokestatic    #51  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   23   46:astore_2        
			((Parcel) (iobjectwrapper)).recycle();
		//   24   47:aload_1         
		//   25   48:invokevirtual   #55  <Method void Parcel.recycle()>
			return iobjectwrapper1;
		//   26   51:aload_2         
		//   27   52:areturn         
		}

		Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.net.ISocketFactoryCreator");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.net.ISocketFactoryCreator">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public static ISocketFactoryCreator asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.net.ISocketFactoryCreator");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.common.net.ISocketFactoryCreator">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof ISocketFactoryCreator)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class ISocketFactoryCreator>
	//*  10   19:ifeq            27
			return (ISocketFactoryCreator)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ISocketFactoryCreator>
	//   13   26:areturn         
		else
			return ((ISocketFactoryCreator) (new Proxy(ibinder)));
	//   14   27:new             #9   <Class ISocketFactoryCreator$Stub$Proxy>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void ISocketFactoryCreator$Stub$Proxy(IBinder)>
	//   18   35:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 59
	//	               2 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 2: // '\002'
			parcel = ((Parcel) (newSocketFactoryWithCacheDir(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString())));
	//    4   26:aload_0         
	//    5   27:aload_2         
	//    6   28:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//    7   31:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    8   34:aload_2         
	//    9   35:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   10   38:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   11   41:aload_2         
	//   12   42:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   13   45:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   14   48:aload_2         
	//   15   49:invokevirtual   #48  <Method String Parcel.readString()>
	//   16   52:invokevirtual   #52  <Method IObjectWrapper newSocketFactoryWithCacheDir(IObjectWrapper, IObjectWrapper, IObjectWrapper, String)>
	//   17   55:astore_2        
			break;

	//*  18   56:goto            89
		case 1: // '\001'
			parcel = ((Parcel) (newSocketFactory(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), zzc.zza(parcel))));
	//   19   59:aload_0         
	//   20   60:aload_2         
	//   21   61:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   22   64:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   23   67:aload_2         
	//   24   68:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   25   71:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   26   74:aload_2         
	//   27   75:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   28   78:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   29   81:aload_2         
	//   30   82:invokestatic    #58  <Method boolean zzc.zza(Parcel)>
	//   31   85:invokevirtual   #62  <Method IObjectWrapper newSocketFactory(IObjectWrapper, IObjectWrapper, IObjectWrapper, boolean)>
	//   32   88:astore_2        
			break;
		}
		parcel1.writeNoException();
	//   33   89:aload_3         
	//   34   90:invokevirtual   #65  <Method void Parcel.writeNoException()>
		zzc.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   35   93:aload_3         
	//   36   94:aload_2         
	//   37   95:invokestatic    #68  <Method void zzc.zza(Parcel, android.os.IInterface)>
		return true;
	//   38   98:iconst_1        
	//   39   99:ireturn         
	}

	public ISocketFactoryCreator$Stub()
	{
		super("com.google.android.gms.common.net.ISocketFactoryCreator");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.common.net.ISocketFactoryCreator">
	//    2    3:invokespecial   #17  <Method void zzb(String)>
	//    3    6:return          
	}
}
