// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.zza;
import com.google.android.gms.internal.stable.zzc;

// Referenced classes of package com.google.android.gms.flags:
//			IFlagProvider

public static class IFlagProvider$Stub$Proxy extends zza
	implements IFlagProvider
{

	public boolean getBooleanFlagValue(String s, boolean flag, int i)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method void Parcel.writeString(String)>
		zzc.zza(parcel, flag);
	//    6   12:aload           4
	//    7   14:iload_2         
	//    8   15:invokestatic    #38  <Method void zzc.zza(Parcel, boolean)>
		parcel.writeInt(i);
	//    9   18:aload           4
	//   10   20:iload_3         
	//   11   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		s = ((String) (((zza)this).transactAndReadException(2, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_2        
	//   14   26:aload           4
	//   15   28:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   16   31:astore_1        
		flag = zzc.zza(((Parcel) (s)));
	//   17   32:aload_1         
	//   18   33:invokestatic    #49  <Method boolean zzc.zza(Parcel)>
	//   19   36:istore_2        
		((Parcel) (s)).recycle();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #53  <Method void Parcel.recycle()>
		return flag;
	//   22   41:iload_2         
	//   23   42:ireturn         
	}

	public int getIntFlagValue(String s, int i, int j)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//    6   12:aload           4
	//    7   14:iload_2         
	//    8   15:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		parcel.writeInt(j);
	//    9   18:aload           4
	//   10   20:iload_3         
	//   11   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		s = ((String) (((zza)this).transactAndReadException(3, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_3        
	//   14   26:aload           4
	//   15   28:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   16   31:astore_1        
		i = ((Parcel) (s)).readInt();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #60  <Method int Parcel.readInt()>
	//   19   36:istore_2        
		((Parcel) (s)).recycle();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #53  <Method void Parcel.recycle()>
		return i;
	//   22   41:iload_2         
	//   23   42:ireturn         
	}

	public long getLongFlagValue(String s, long l, int i)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		parcel.writeString(s);
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method void Parcel.writeString(String)>
		parcel.writeLong(l);
	//    6   12:aload           5
	//    7   14:lload_2         
	//    8   15:invokevirtual   #66  <Method void Parcel.writeLong(long)>
		parcel.writeInt(i);
	//    9   18:aload           5
	//   10   20:iload           4
	//   11   22:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		s = ((String) (((zza)this).transactAndReadException(4, parcel)));
	//   12   25:aload_0         
	//   13   26:iconst_4        
	//   14   27:aload           5
	//   15   29:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   16   32:astore_1        
		l = ((Parcel) (s)).readLong();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #70  <Method long Parcel.readLong()>
	//   19   37:lstore_2        
		((Parcel) (s)).recycle();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #53  <Method void Parcel.recycle()>
		return l;
	//   22   42:lload_2         
	//   23   43:lreturn         
	}

	public String getStringFlagValue(String s, String s1, int i)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          4
		parcel.writeString(s);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #32  <Method void Parcel.writeString(String)>
		parcel.writeString(s1);
	//    6   12:aload           4
	//    7   14:aload_2         
	//    8   15:invokevirtual   #32  <Method void Parcel.writeString(String)>
		parcel.writeInt(i);
	//    9   18:aload           4
	//   10   20:iload_3         
	//   11   21:invokevirtual   #42  <Method void Parcel.writeInt(int)>
		s = ((String) (((zza)this).transactAndReadException(5, parcel)));
	//   12   24:aload_0         
	//   13   25:iconst_5        
	//   14   26:aload           4
	//   15   28:invokevirtual   #46  <Method Parcel zza.transactAndReadException(int, Parcel)>
	//   16   31:astore_1        
		s1 = ((Parcel) (s)).readString();
	//   17   32:aload_1         
	//   18   33:invokevirtual   #76  <Method String Parcel.readString()>
	//   19   36:astore_2        
		((Parcel) (s)).recycle();
	//   20   37:aload_1         
	//   21   38:invokevirtual   #53  <Method void Parcel.recycle()>
		return s1;
	//   22   41:aload_2         
	//   23   42:areturn         
	}

	public void init(IObjectWrapper iobjectwrapper)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore_2        
		zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:invokestatic    #81  <Method void zzc.zza(Parcel, android.os.IInterface)>
		((zza)this).transactAndReadExceptionReturnVoid(1, parcel);
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:aload_2         
	//    9   13:invokevirtual   #85  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
	//   10   16:return          
	}

	IFlagProvider$Stub$Proxy(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.flags.IFlagProvider");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "com.google.android.gms.flags.IFlagProvider">
	//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
	//    4    7:return          
	}
}
