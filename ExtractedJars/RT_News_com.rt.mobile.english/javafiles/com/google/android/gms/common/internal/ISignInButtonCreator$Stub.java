// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			ISignInButtonCreator, SignInButtonConfig

public static abstract class ISignInButtonCreator$Stub extends zzb
	implements ISignInButtonCreator
{
	public static class Proxy extends zza
		implements ISignInButtonCreator
	{

		public IObjectWrapper newSignInButton(IObjectWrapper iobjectwrapper, int i, int j)
			throws RemoteException
		{
			Object obj = ((Object) (((zza)this).obtainAndWriteInterfaceToken()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          4
			zzc.zza(((Parcel) (obj)), ((android.os.IInterface) (iobjectwrapper)));
		//    3    6:aload           4
		//    4    8:aload_1         
		//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			((Parcel) (obj)).writeInt(i);
		//    6   12:aload           4
		//    7   14:iload_2         
		//    8   15:invokevirtual   #38  <Method void Parcel.writeInt(int)>
			((Parcel) (obj)).writeInt(j);
		//    9   18:aload           4
		//   10   20:iload_3         
		//   11   21:invokevirtual   #38  <Method void Parcel.writeInt(int)>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, ((Parcel) (obj)))));
		//   12   24:aload_0         
		//   13   25:iconst_1        
		//   14   26:aload           4
		//   15   28:invokevirtual   #42  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   16   31:astore_1        
			obj = ((Object) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder())));
		//   17   32:aload_1         
		//   18   33:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
		//   19   36:invokestatic    #52  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   20   39:astore          4
			((Parcel) (iobjectwrapper)).recycle();
		//   21   41:aload_1         
		//   22   42:invokevirtual   #56  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (obj));
		//   23   45:aload           4
		//   24   47:areturn         
		}

		public IObjectWrapper newSignInButtonFromConfig(IObjectWrapper iobjectwrapper, SignInButtonConfig signinbuttonconfig)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore_3        
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    3    5:aload_3         
		//    4    6:aload_1         
		//    5    7:invokestatic    #32  <Method void zzc.zza(Parcel, android.os.IInterface)>
			zzc.zza(parcel, ((android.os.Parcelable) (signinbuttonconfig)));
		//    6   10:aload_3         
		//    7   11:aload_2         
		//    8   12:invokestatic    #62  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(2, parcel)));
		//    9   15:aload_0         
		//   10   16:iconst_2        
		//   11   17:aload_3         
		//   12   18:invokevirtual   #42  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   13   21:astore_1        
			signinbuttonconfig = ((SignInButtonConfig) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder())));
		//   14   22:aload_1         
		//   15   23:invokevirtual   #46  <Method IBinder Parcel.readStrongBinder()>
		//   16   26:invokestatic    #52  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   17   29:astore_2        
			((Parcel) (iobjectwrapper)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #56  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (signinbuttonconfig));
		//   20   34:aload_2         
		//   21   35:areturn         
		}

		Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public static ISignInButtonCreator asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof ISignInButtonCreator)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class ISignInButtonCreator>
	//*  10   19:ifeq            27
			return (ISignInButtonCreator)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ISignInButtonCreator>
	//   13   26:areturn         
		else
			return ((ISignInButtonCreator) (new Proxy(ibinder)));
	//   14   27:new             #9   <Class ISignInButtonCreator$Stub$Proxy>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void ISignInButtonCreator$Stub$Proxy(IBinder)>
	//   18   35:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 51
	//	               2 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 2: // '\002'
			parcel = ((Parcel) (newSignInButtonFromConfig(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), (SignInButtonConfig)zzc.zza(parcel, SignInButtonConfig.CREATOR))));
	//    4   26:aload_0         
	//    5   27:aload_2         
	//    6   28:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//    7   31:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//    8   34:aload_2         
	//    9   35:getstatic       #50  <Field android.os.Parcelable$Creator SignInButtonConfig.CREATOR>
	//   10   38:invokestatic    #56  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   11   41:checkcast       #46  <Class SignInButtonConfig>
	//   12   44:invokevirtual   #60  <Method IObjectWrapper newSignInButtonFromConfig(IObjectWrapper, SignInButtonConfig)>
	//   13   47:astore_2        
			break;

	//*  14   48:goto            71
		case 1: // '\001'
			parcel = ((Parcel) (newSignInButton(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt())));
	//   15   51:aload_0         
	//   16   52:aload_2         
	//   17   53:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
	//   18   56:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   19   59:aload_2         
	//   20   60:invokevirtual   #64  <Method int Parcel.readInt()>
	//   21   63:aload_2         
	//   22   64:invokevirtual   #64  <Method int Parcel.readInt()>
	//   23   67:invokevirtual   #68  <Method IObjectWrapper newSignInButton(IObjectWrapper, int, int)>
	//   24   70:astore_2        
			break;
		}
		parcel1.writeNoException();
	//   25   71:aload_3         
	//   26   72:invokevirtual   #71  <Method void Parcel.writeNoException()>
		zzc.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   27   75:aload_3         
	//   28   76:aload_2         
	//   29   77:invokestatic    #74  <Method void zzc.zza(Parcel, android.os.IInterface)>
		return true;
	//   30   80:iconst_1        
	//   31   81:ireturn         
	}

	public ISignInButtonCreator$Stub()
	{
		super("com.google.android.gms.common.internal.ISignInButtonCreator");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//    2    3:invokespecial   #17  <Method void zzb(String)>
	//    3    6:return          
	}
}
