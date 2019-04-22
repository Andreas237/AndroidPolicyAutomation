// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.*;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.dynamic:
//			IFragmentWrapper, IObjectWrapper

public static class IFragmentWrapper$Stub$Proxy extends zza
	implements IFragmentWrapper
{

	public IObjectWrapper getActivity()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(2, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #42  <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #46  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public Bundle getArguments()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(3, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_3        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		Bundle bundle = (Bundle)zzc.zza(parcel, Bundle.CREATOR);
	//    6   10:aload_1         
	//    7   11:getstatic       #55  <Field android.os.Parcelable$Creator Bundle.CREATOR>
	//    8   14:invokestatic    #61  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    9   17:checkcast       #51  <Class Bundle>
	//   10   20:astore_2        
		parcel.recycle();
	//   11   21:aload_1         
	//   12   22:invokevirtual   #46  <Method void Parcel.recycle()>
		return bundle;
	//   13   25:aload_2         
	//   14   26:areturn         
	}

	public int getId()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(4, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_2        
		int i = parcel.readInt();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #66  <Method int Parcel.readInt()>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #46  <Method void Parcel.recycle()>
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public IFragmentWrapper getParentFragment()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(5, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5    9:astore_1        
		IFragmentWrapper ifragmentwrapper = IFragmentWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   10:aload_1         
	//    7   11:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    8   14:invokestatic    #71  <Method IFragmentWrapper IFragmentWrapper$Stub.asInterface(IBinder)>
	//    9   17:astore_2        
		parcel.recycle();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #46  <Method void Parcel.recycle()>
		return ifragmentwrapper;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	public IObjectWrapper getResources()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(6, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #42  <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #46  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public boolean getRetainInstance()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(7, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public String getTag()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(8, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		String s = parcel.readString();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #82  <Method String Parcel.readString()>
	//    8   15:astore_2        
		parcel.recycle();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return s;
	//   11   20:aload_2         
	//   12   21:areturn         
	}

	public IFragmentWrapper getTargetFragment()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(9, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IFragmentWrapper ifragmentwrapper = IFragmentWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #71  <Method IFragmentWrapper IFragmentWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #46  <Method void Parcel.recycle()>
		return ifragmentwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public int getTargetRequestCode()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(10, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		int i = parcel.readInt();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #66  <Method int Parcel.readInt()>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return i;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public boolean getUserVisibleHint()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(11, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public IObjectWrapper getView()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(12, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_1        
		IObjectWrapper iobjectwrapper = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
	//    6   11:aload_1         
	//    7   12:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:invokestatic    #42  <Method IObjectWrapper IObjectWrapper$Stub.asInterface(IBinder)>
	//    9   18:astore_2        
		parcel.recycle();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #46  <Method void Parcel.recycle()>
		return iobjectwrapper;
	//   12   23:aload_2         
	//   13   24:areturn         
	}

	public boolean isAdded()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(13, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          13
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public boolean isDetached()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(14, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          14
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public boolean isHidden()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(15, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          15
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public boolean isInLayout()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(16, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public boolean isRemoving()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(17, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          17
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public boolean isResumed()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(18, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          18
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public boolean isVisible()
		throws RemoteException
	{
		Parcel parcel = ((zza)this).transactAndReadException(19, ((zza)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          19
	//    2    3:aload_0         
	//    3    4:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzc.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #77  <Method boolean zzc.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #46  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public void registerForContextMenu(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #98  <Method void zzc.zza(Parcel, android.os.IInterface)>
		((zza)this).transactAndReadExceptionReturnVoid(20, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          20
	//    8   13:aload_2         
	//    9   14:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public void setHasOptionsMenu(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #107 <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(21, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          21
	//    8   13:aload_2         
	//    9   14:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public void setMenuVisibility(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #107 <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(22, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          22
	//    8   13:aload_2         
	//    9   14:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public void setRetainInstance(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #107 <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(23, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          23
	//    8   13:aload_2         
	//    9   14:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public void setUserVisibleHint(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #107 <Method void zzc.zza(Parcel, boolean)>
		((zza)this).transactAndReadExceptionReturnVoid(24, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          24
	//    8   13:aload_2         
	//    9   14:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public void startActivity(Intent intent)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.Parcelable) (intent)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #115 <Method void zzc.zza(Parcel, android.os.Parcelable)>
		((zza)this).transactAndReadExceptionReturnVoid(25, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          25
	//    8   13:aload_2         
	//    9   14:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public void startActivityForResult(Intent intent, int i)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_3        
		zzc.zza(parcel, ((android.os.Parcelable) (intent)));
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokestatic    #115 <Method void zzc.zza(Parcel, android.os.Parcelable)>
		parcel.writeInt(i);
	//    6   10:aload_3         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #121 <Method void Parcel.writeInt(int)>
		((zza)this).transactAndReadExceptionReturnVoid(26, parcel);
	//    9   15:aload_0         
	//   10   16:bipush          26
	//   11   18:aload_3         
	//   12   19:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   13   22:return          
	}

	public void unregisterForContextMenu(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #98  <Method void zzc.zza(Parcel, android.os.IInterface)>
		((zza)this).transactAndReadExceptionReturnVoid(27, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          27
	//    8   13:aload_2         
	//    9   14:invokevirtual   #102 <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	IFragmentWrapper$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.dynamic.IFragmentWrapper");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.dynamic.IFragmentWrapper">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
