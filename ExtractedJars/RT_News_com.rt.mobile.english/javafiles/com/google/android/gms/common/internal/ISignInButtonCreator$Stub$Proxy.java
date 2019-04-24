// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.common.internal:
//			ISignInButtonCreator, SignInButtonConfig

public static class ISignInButtonCreator$Stub$Proxy extends zza
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

	ISignInButtonCreator$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.ISignInButtonCreator">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
