// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzej, zzlo, zzel, zzlr, 
//			zzlt

public final class zzlq extends zzej
	implements zzlo
{

	zzlq(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.ads.internal.client.IVideoController");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.ads.internal.client.IVideoController">
	//    3    4:invokespecial   #13  <Method void zzej(IBinder, String)>
	//    4    7:return          
	}

	public final float getAspectRatio()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(9, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          9
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		float f = parcel.readFloat();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #31  <Method float Parcel.readFloat()>
	//    8   15:fstore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return f;
	//   11   20:fload_1         
	//   12   21:freturn         
	}

	public final int getPlaybackState()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(5, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_5        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_2        
		int i = parcel.readInt();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #41  <Method int Parcel.readInt()>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public final boolean isClickToExpandEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(12, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          12
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzel.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #49  <Method boolean zzel.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isCustomControlsEnabled()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(10, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          10
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		boolean flag = zzel.zza(parcel);
	//    6   11:aload_2         
	//    7   12:invokestatic    #49  <Method boolean zzel.zza(Parcel)>
	//    8   15:istore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return flag;
	//   11   20:iload_1         
	//   12   21:ireturn         
	}

	public final boolean isMuted()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(4, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_4        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5    9:astore_2        
		boolean flag = zzel.zza(parcel);
	//    6   10:aload_2         
	//    7   11:invokestatic    #49  <Method boolean zzel.zza(Parcel)>
	//    8   14:istore_1        
		parcel.recycle();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #35  <Method void Parcel.recycle()>
		return flag;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	public final void mute(boolean flag)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, flag);
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokestatic    #56  <Method void zzel.zza(Parcel, boolean)>
		((zzej)this).transactAndReadExceptionReturnVoid(3, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_3        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #60  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	public final void pause()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(2, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #60  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void play()
		throws RemoteException
	{
		((zzej)this).transactAndReadExceptionReturnVoid(1, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #60  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//    5    9:return          
	}

	public final void zza(zzlr zzlr1)
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzel.zza(parcel, ((android.os.IInterface) (zzlr1)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #66  <Method void zzel.zza(Parcel, android.os.IInterface)>
		((zzej)this).transactAndReadExceptionReturnVoid(8, parcel);
	//    6   10:aload_0         
	//    7   11:bipush          8
	//    8   13:aload_2         
	//    9   14:invokevirtual   #60  <Method void zzej.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   17:return          
	}

	public final float zzim()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(6, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          6
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		float f = parcel.readFloat();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #31  <Method float Parcel.readFloat()>
	//    8   15:fstore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return f;
	//   11   20:fload_1         
	//   12   21:freturn         
	}

	public final float zzin()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(7, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          7
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		float f = parcel.readFloat();
	//    6   11:aload_2         
	//    7   12:invokevirtual   #31  <Method float Parcel.readFloat()>
	//    8   15:fstore_1        
		parcel.recycle();
	//    9   16:aload_2         
	//   10   17:invokevirtual   #35  <Method void Parcel.recycle()>
		return f;
	//   11   20:fload_1         
	//   12   21:freturn         
	}

	public final zzlr zzio()
		throws RemoteException
	{
		Parcel parcel = ((zzej)this).transactAndReadException(11, ((zzej)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:aload_0         
	//    3    4:invokevirtual   #22  <Method Parcel zzej.obtainAndWriteInterfaceToken()>
	//    4    7:invokevirtual   #26  <Method Parcel zzej.transactAndReadException(int, Parcel)>
	//    5   10:astore_2        
		Object obj = ((Object) (parcel.readStrongBinder()));
	//    6   11:aload_2         
	//    7   12:invokevirtual   #74  <Method IBinder Parcel.readStrongBinder()>
	//    8   15:astore_1        
		if(obj == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       25
		{
			obj = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		} else
	//*  13   22:goto            58
		{
			android.os.IInterface iinterface = ((IBinder) (obj)).queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
	//   14   25:aload_1         
	//   15   26:ldc1            #76  <String "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks">
	//   16   28:invokeinterface #82  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//   17   33:astore_3        
			if(iinterface instanceof zzlr)
	//*  18   34:aload_3         
	//*  19   35:instanceof      #84  <Class zzlr>
	//*  20   38:ifeq            49
				obj = ((Object) ((zzlr)iinterface));
	//   21   41:aload_3         
	//   22   42:checkcast       #84  <Class zzlr>
	//   23   45:astore_1        
			else
	//*  24   46:goto            58
				obj = ((Object) (new zzlt(((IBinder) (obj)))));
	//   25   49:new             #86  <Class zzlt>
	//   26   52:dup             
	//   27   53:aload_1         
	//   28   54:invokespecial   #88  <Method void zzlt(IBinder)>
	//   29   57:astore_1        
		}
		parcel.recycle();
	//   30   58:aload_2         
	//   31   59:invokevirtual   #35  <Method void Parcel.recycle()>
		return ((zzlr) (obj));
	//   32   62:aload_1         
	//   33   63:areturn         
	}
}
