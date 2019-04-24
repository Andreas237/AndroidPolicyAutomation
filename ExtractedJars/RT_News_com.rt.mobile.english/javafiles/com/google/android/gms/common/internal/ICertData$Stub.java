// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			ICertData

public static abstract class ICertData$Stub extends zzb
	implements ICertData
{
	public static class Proxy extends zza
		implements ICertData
	{

		public IObjectWrapper getBytesWrapped()
			throws RemoteException
		{
			Parcel parcel = ((zza)this).transactAndReadException(1, ((zza)this).obtainAndWriteInterfaceToken());
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//    5    9:astore_1        
			IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
		//    6   10:aload_1         
		//    7   11:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
		//    8   14:invokestatic    #42  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//    9   17:astore_2        
			parcel.recycle();
		//   10   18:aload_1         
		//   11   19:invokevirtual   #46  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   12   22:aload_2         
		//   13   23:areturn         
		}

		public int getHashCode()
			throws RemoteException
		{
			Parcel parcel = ((zza)this).transactAndReadException(2, ((zza)this).obtainAndWriteInterfaceToken());
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//    5    9:astore_2        
			int i = parcel.readInt();
		//    6   10:aload_2         
		//    7   11:invokevirtual   #52  <Method int Parcel.readInt()>
		//    8   14:istore_1        
			parcel.recycle();
		//    9   15:aload_2         
		//   10   16:invokevirtual   #46  <Method void Parcel.recycle()>
			return i;
		//   11   19:iload_1         
		//   12   20:ireturn         
		}

		Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.ICertData");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.ICertData">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public static ICertData asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.ICertData">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof ICertData)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class ICertData>
	//*  10   19:ifeq            27
			return (ICertData)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class ICertData>
	//   13   26:areturn         
		else
			return ((ICertData) (new Proxy(ibinder)));
	//   14   27:new             #9   <Class ICertData$Stub$Proxy>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void ICertData$Stub$Proxy(IBinder)>
	//   18   35:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 43
	//	               2 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 2: // '\002'
			i = getHashCode();
	//    4   26:aload_0         
	//    5   27:invokevirtual   #37  <Method int getHashCode()>
	//    6   30:istore_1        
			parcel1.writeNoException();
	//    7   31:aload_3         
	//    8   32:invokevirtual   #42  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
	//    9   35:aload_3         
	//   10   36:iload_1         
	//   11   37:invokevirtual   #46  <Method void Parcel.writeInt(int)>
			break;

	//*  12   40:goto            57
		case 1: // '\001'
			parcel = ((Parcel) (getBytesWrapped()));
	//   13   43:aload_0         
	//   14   44:invokevirtual   #50  <Method IObjectWrapper getBytesWrapped()>
	//   15   47:astore_2        
			parcel1.writeNoException();
	//   16   48:aload_3         
	//   17   49:invokevirtual   #42  <Method void Parcel.writeNoException()>
			zzc.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   18   52:aload_3         
	//   19   53:aload_2         
	//   20   54:invokestatic    #56  <Method void zzc.zza(Parcel, android.os.IInterface)>
			break;
		}
		return true;
	//   21   57:iconst_1        
	//   22   58:ireturn         
	}

	public ICertData$Stub()
	{
		super("com.google.android.gms.common.internal.ICertData");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.ICertData">
	//    2    3:invokespecial   #17  <Method void zzb(String)>
	//    3    6:return          
	}
}
