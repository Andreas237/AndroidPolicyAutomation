// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamite;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.*;

public interface IDynamiteLoader
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements IDynamiteLoader
	{

		public static IDynamiteLoader asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoader">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IDynamiteLoader)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IDynamiteLoader>
		//*  10   19:ifeq            27
				return (IDynamiteLoader)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IDynamiteLoader>
		//   13   26:areturn         
			else
				return ((IDynamiteLoader) (new Proxy(ibinder)));
		//   14   27:new             #9   <Class IDynamiteLoader$Stub$Proxy>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IDynamiteLoader$Stub$Proxy(IBinder)>
		//   18   35:areturn         
		}

		protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			i;
		//    0    0:iload_1         
			JVM INSTR tableswitch 1 3: default 28
		//		               1 85
		//		               2 53
		//		               3 30;
		//    1    1:tableswitch     1 3: default 28
		//		               1 85
		//		               2 53
		//		               3 30
			   goto _L1 _L2 _L3 _L4
_L1:
			return false;
		//    2   28:iconst_0        
		//    3   29:ireturn         
_L4:
			i = getModuleVersion2(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), zzc.zza(parcel));
		//    4   30:aload_0         
		//    5   31:aload_2         
		//    6   32:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
		//    7   35:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//    8   38:aload_2         
		//    9   39:invokevirtual   #48  <Method String Parcel.readString()>
		//   10   42:aload_2         
		//   11   43:invokestatic    #54  <Method boolean zzc.zza(Parcel)>
		//   12   46:invokevirtual   #58  <Method int getModuleVersion2(IObjectWrapper, String, boolean)>
		//   13   49:istore_1        
			  goto _L5
		//*  14   50:goto            101
_L3:
			parcel = ((Parcel) (createModuleContext(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString(), parcel.readInt())));
		//   15   53:aload_0         
		//   16   54:aload_2         
		//   17   55:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
		//   18   58:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   19   61:aload_2         
		//   20   62:invokevirtual   #48  <Method String Parcel.readString()>
		//   21   65:aload_2         
		//   22   66:invokevirtual   #62  <Method int Parcel.readInt()>
		//   23   69:invokevirtual   #66  <Method IObjectWrapper createModuleContext(IObjectWrapper, String, int)>
		//   24   72:astore_2        
			parcel1.writeNoException();
		//   25   73:aload_3         
		//   26   74:invokevirtual   #69  <Method void Parcel.writeNoException()>
			zzc.zza(parcel1, ((IInterface) (parcel)));
		//   27   77:aload_3         
		//   28   78:aload_2         
		//   29   79:invokestatic    #72  <Method void zzc.zza(Parcel, IInterface)>
			  goto _L6
		//*  30   82:goto            110
_L2:
			i = getModuleVersion(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()), parcel.readString());
		//   31   85:aload_0         
		//   32   86:aload_2         
		//   33   87:invokevirtual   #39  <Method IBinder Parcel.readStrongBinder()>
		//   34   90:invokestatic    #44  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   35   93:aload_2         
		//   36   94:invokevirtual   #48  <Method String Parcel.readString()>
		//   37   97:invokevirtual   #76  <Method int getModuleVersion(IObjectWrapper, String)>
		//   38  100:istore_1        
_L5:
			parcel1.writeNoException();
		//   39  101:aload_3         
		//   40  102:invokevirtual   #69  <Method void Parcel.writeNoException()>
			parcel1.writeInt(i);
		//   41  105:aload_3         
		//   42  106:iload_1         
		//   43  107:invokevirtual   #80  <Method void Parcel.writeInt(int)>
_L6:
			return true;
		//   44  110:iconst_1        
		//   45  111:ireturn         
		}

		public Stub()
		{
			super("com.google.android.gms.dynamite.IDynamiteLoader");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoader">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static class Stub.Proxy extends zza
		implements IDynamiteLoader
	{

		public IObjectWrapper createModuleContext(IObjectWrapper iobjectwrapper, String s, int i)
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
			parcel.writeInt(i);
		//    9   18:aload           4
		//   10   20:iload_3         
		//   11   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(2, parcel)));
		//   12   24:aload_0         
		//   13   25:iconst_2        
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

		public int getModuleVersion(IObjectWrapper iobjectwrapper, String s)
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
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(1, parcel)));
		//    9   18:aload_0         
		//   10   19:iconst_1        
		//   11   20:aload           4
		//   12   22:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   13   25:astore_1        
			int i = ((Parcel) (iobjectwrapper)).readInt();
		//   14   26:aload_1         
		//   15   27:invokevirtual   #67  <Method int Parcel.readInt()>
		//   16   30:istore_3        
			((Parcel) (iobjectwrapper)).recycle();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #60  <Method void Parcel.recycle()>
			return i;
		//   19   35:iload_3         
		//   20   36:ireturn         
		}

		public int getModuleVersion2(IObjectWrapper iobjectwrapper, String s, boolean flag)
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
			zzc.zza(parcel, flag);
		//    9   18:aload           5
		//   10   20:iload_3         
		//   11   21:invokestatic    #72  <Method void zzc.zza(Parcel, boolean)>
			iobjectwrapper = ((IObjectWrapper) (((zza)this).transactAndReadException(3, parcel)));
		//   12   24:aload_0         
		//   13   25:iconst_3        
		//   14   26:aload           5
		//   15   28:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   16   31:astore_1        
			int i = ((Parcel) (iobjectwrapper)).readInt();
		//   17   32:aload_1         
		//   18   33:invokevirtual   #67  <Method int Parcel.readInt()>
		//   19   36:istore          4
			((Parcel) (iobjectwrapper)).recycle();
		//   20   38:aload_1         
		//   21   39:invokevirtual   #60  <Method void Parcel.recycle()>
			return i;
		//   22   42:iload           4
		//   23   44:ireturn         
		}

		Stub.Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.dynamite.IDynamiteLoader");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.dynamite.IDynamiteLoader">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract IObjectWrapper createModuleContext(IObjectWrapper iobjectwrapper, String s, int i)
		throws RemoteException;

	public abstract int getModuleVersion(IObjectWrapper iobjectwrapper, String s)
		throws RemoteException;

	public abstract int getModuleVersion2(IObjectWrapper iobjectwrapper, String s, boolean flag)
		throws RemoteException;
}
