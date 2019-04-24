// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.*;

public interface IDynamiteLoaderV2
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements IDynamiteLoaderV2
	{

		public static IDynamiteLoaderV2 asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoaderV2">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IDynamiteLoaderV2)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IDynamiteLoaderV2>
		//*  10   19:ifeq            27
				return (IDynamiteLoaderV2)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IDynamiteLoaderV2>
		//   13   26:areturn         
			else
				return ((IDynamiteLoaderV2) (new Proxy(ibinder)));
		//   14   27:new             #9   <Class IDynamiteLoaderV2$Stub$Proxy>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IDynamiteLoaderV2$Stub$Proxy(IBinder)>
		//   18   35:areturn         
		}

		protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     1 2: default 24
		//		               1 56
		//		               2 26
			default:
				return false;
		//    2   24:iconst_0        
		//    3   25:ireturn         

			case 2: // '\002'
				parcel = ((Parcel) (loadModule2(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()))));
		//    4   26:aload_0         
		//    5   27:aload_2         
		//    6   28:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
		//    7   31:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//    8   34:aload_2         
		//    9   35:invokevirtual   #48  <Method String Parcel.readString()>
		//   10   38:aload_2         
		//   11   39:invokevirtual   #52  <Method int Parcel.readInt()>
		//   12   42:aload_2         
		//   13   43:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
		//   14   46:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   15   49:invokevirtual   #56  <Method IObjectWrapper loadModule2(IObjectWrapper, String, int, IObjectWrapper)>
		//   16   52:astore_2        
				break;

		//*  17   53:goto            76
			case 1: // '\001'
				parcel = ((Parcel) (loadModule(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.createByteArray())));
		//   18   56:aload_0         
		//   19   57:aload_2         
		//   20   58:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
		//   21   61:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   22   64:aload_2         
		//   23   65:invokevirtual   #48  <Method String Parcel.readString()>
		//   24   68:aload_2         
		//   25   69:invokevirtual   #60  <Method byte[] Parcel.createByteArray()>
		//   26   72:invokevirtual   #64  <Method IObjectWrapper loadModule(IObjectWrapper, String, byte[])>
		//   27   75:astore_2        
				break;
			}
			parcel1.writeNoException();
		//   28   76:aload_3         
		//   29   77:invokevirtual   #67  <Method void Parcel.writeNoException()>
			zzc.zza(parcel1, ((IInterface) (parcel)));
		//   30   80:aload_3         
		//   31   81:aload_2         
		//   32   82:invokestatic    #73  <Method void zzc.zza(Parcel, IInterface)>
			return true;
		//   33   85:iconst_1        
		//   34   86:ireturn         
		}

		public Stub()
		{
			super("com.google.android.gms.dynamite.IDynamiteLoaderV2");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoaderV2">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static class Stub.Proxy extends zza
		implements IDynamiteLoaderV2
	{

		public IObjectWrapper loadModule(IObjectWrapper iobjectwrapper, String s, byte abyte0[])
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          4
			zzc.zza(parcel, ((IInterface) (iobjectwrapper)));
		//    3    6:aload           4
		//    4    8:aload_1         
		//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, IInterface)>
			parcel.writeString(s);
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokevirtual   #38  <Method void Parcel.writeString(String)>
			parcel.writeByteArray(abyte0);
		//    9   18:aload           4
		//   10   20:aload_3         
		//   11   21:invokevirtual   #42  <Method void Parcel.writeByteArray(byte[])>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, parcel)));
		//   12   24:aload_0         
		//   13   25:iconst_1        
		//   14   26:aload           4
		//   15   28:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   16   31:astore_1        
			s = ((String) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder())));
		//   17   32:aload_1         
		//   18   33:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
		//   19   36:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   20   39:astore_2        
			((Parcel) (iobjectwrapper)).recycle();
		//   21   40:aload_1         
		//   22   41:invokevirtual   #60  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (s));
		//   23   44:aload_2         
		//   24   45:areturn         
		}

		public IObjectWrapper loadModule2(IObjectWrapper iobjectwrapper, String s, int i, IObjectWrapper iobjectwrapper1)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          5
			zzc.zza(parcel, ((IInterface) (iobjectwrapper)));
		//    3    6:aload           5
		//    4    8:aload_1         
		//    5    9:invokestatic    #32  <Method void zzc.zza(Parcel, IInterface)>
			parcel.writeString(s);
		//    6   12:aload           5
		//    7   14:aload_2         
		//    8   15:invokevirtual   #38  <Method void Parcel.writeString(String)>
			parcel.writeInt(i);
		//    9   18:aload           5
		//   10   20:iload_3         
		//   11   21:invokevirtual   #67  <Method void Parcel.writeInt(int)>
			zzc.zza(parcel, ((IInterface) (iobjectwrapper1)));
		//   12   24:aload           5
		//   13   26:aload           4
		//   14   28:invokestatic    #32  <Method void zzc.zza(Parcel, IInterface)>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(2, parcel)));
		//   15   31:aload_0         
		//   16   32:iconst_2        
		//   17   33:aload           5
		//   18   35:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   19   38:astore_1        
			s = ((String) (com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(((Parcel) (iobjectwrapper)).readStrongBinder())));
		//   20   39:aload_1         
		//   21   40:invokevirtual   #50  <Method IBinder Parcel.readStrongBinder()>
		//   22   43:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   23   46:astore_2        
			((Parcel) (iobjectwrapper)).recycle();
		//   24   47:aload_1         
		//   25   48:invokevirtual   #60  <Method void Parcel.recycle()>
			return ((IObjectWrapper) (s));
		//   26   51:aload_2         
		//   27   52:areturn         
		}

		Stub.Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoaderV2">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract IObjectWrapper loadModule(IObjectWrapper iobjectwrapper, String s, byte abyte0[])
		throws RemoteException;

	public abstract IObjectWrapper loadModule2(IObjectWrapper iobjectwrapper, String s, int i, IObjectWrapper iobjectwrapper1)
		throws RemoteException;
}
