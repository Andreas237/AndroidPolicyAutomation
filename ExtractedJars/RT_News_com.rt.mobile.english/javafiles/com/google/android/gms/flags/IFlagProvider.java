// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.flags;

import android.os.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.*;

public interface IFlagProvider
	extends IInterface
{
	public static abstract class Stub extends zzb
		implements IFlagProvider
	{

		public static IFlagProvider asInterface(IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_0         
		//*   1    1:ifnonnull       6
				return null;
		//    2    4:aconst_null     
		//    3    5:areturn         
			IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
		//    4    6:aload_0         
		//    5    7:ldc1            #14  <String "com.google.android.gms.flags.IFlagProvider">
		//    6    9:invokeinterface #26  <Method IInterface IBinder.queryLocalInterface(String)>
		//    7   14:astore_1        
			if(iinterface instanceof IFlagProvider)
		//*   8   15:aload_1         
		//*   9   16:instanceof      #6   <Class IFlagProvider>
		//*  10   19:ifeq            27
				return (IFlagProvider)iinterface;
		//   11   22:aload_1         
		//   12   23:checkcast       #6   <Class IFlagProvider>
		//   13   26:areturn         
			else
				return ((IFlagProvider) (new Proxy(ibinder)));
		//   14   27:new             #9   <Class IFlagProvider$Stub$Proxy>
		//   15   30:dup             
		//   16   31:aload_0         
		//   17   32:invokespecial   #29  <Method void IFlagProvider$Stub$Proxy(IBinder)>
		//   18   35:areturn         
		}

		protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     1 5: default 36
		//		               1 158
		//		               2 127
		//		               3 98
		//		               4 67
		//		               5 38
			default:
				return false;
		//    2   36:iconst_0        
		//    3   37:ireturn         

			case 5: // '\005'
				parcel = ((Parcel) (getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt())));
		//    4   38:aload_0         
		//    5   39:aload_2         
		//    6   40:invokevirtual   #39  <Method String Parcel.readString()>
		//    7   43:aload_2         
		//    8   44:invokevirtual   #39  <Method String Parcel.readString()>
		//    9   47:aload_2         
		//   10   48:invokevirtual   #43  <Method int Parcel.readInt()>
		//   11   51:invokevirtual   #47  <Method String getStringFlagValue(String, String, int)>
		//   12   54:astore_2        
				parcel1.writeNoException();
		//   13   55:aload_3         
		//   14   56:invokevirtual   #50  <Method void Parcel.writeNoException()>
				parcel1.writeString(((String) (parcel)));
		//   15   59:aload_3         
		//   16   60:aload_2         
		//   17   61:invokevirtual   #53  <Method void Parcel.writeString(String)>
				break;

		//*  18   64:goto            173
			case 4: // '\004'
				long l = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
		//   19   67:aload_0         
		//   20   68:aload_2         
		//   21   69:invokevirtual   #39  <Method String Parcel.readString()>
		//   22   72:aload_2         
		//   23   73:invokevirtual   #57  <Method long Parcel.readLong()>
		//   24   76:aload_2         
		//   25   77:invokevirtual   #43  <Method int Parcel.readInt()>
		//   26   80:invokevirtual   #61  <Method long getLongFlagValue(String, long, int)>
		//   27   83:lstore          5
				parcel1.writeNoException();
		//   28   85:aload_3         
		//   29   86:invokevirtual   #50  <Method void Parcel.writeNoException()>
				parcel1.writeLong(l);
		//   30   89:aload_3         
		//   31   90:lload           5
		//   32   92:invokevirtual   #65  <Method void Parcel.writeLong(long)>
				break;

		//*  33   95:goto            173
			case 3: // '\003'
				i = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
		//   34   98:aload_0         
		//   35   99:aload_2         
		//   36  100:invokevirtual   #39  <Method String Parcel.readString()>
		//   37  103:aload_2         
		//   38  104:invokevirtual   #43  <Method int Parcel.readInt()>
		//   39  107:aload_2         
		//   40  108:invokevirtual   #43  <Method int Parcel.readInt()>
		//   41  111:invokevirtual   #69  <Method int getIntFlagValue(String, int, int)>
		//   42  114:istore_1        
				parcel1.writeNoException();
		//   43  115:aload_3         
		//   44  116:invokevirtual   #50  <Method void Parcel.writeNoException()>
				parcel1.writeInt(i);
		//   45  119:aload_3         
		//   46  120:iload_1         
		//   47  121:invokevirtual   #73  <Method void Parcel.writeInt(int)>
				break;

		//*  48  124:goto            173
			case 2: // '\002'
				boolean flag = getBooleanFlagValue(parcel.readString(), zzc.zza(parcel), parcel.readInt());
		//   49  127:aload_0         
		//   50  128:aload_2         
		//   51  129:invokevirtual   #39  <Method String Parcel.readString()>
		//   52  132:aload_2         
		//   53  133:invokestatic    #79  <Method boolean zzc.zza(Parcel)>
		//   54  136:aload_2         
		//   55  137:invokevirtual   #43  <Method int Parcel.readInt()>
		//   56  140:invokevirtual   #83  <Method boolean getBooleanFlagValue(String, boolean, int)>
		//   57  143:istore          7
				parcel1.writeNoException();
		//   58  145:aload_3         
		//   59  146:invokevirtual   #50  <Method void Parcel.writeNoException()>
				zzc.zza(parcel1, flag);
		//   60  149:aload_3         
		//   61  150:iload           7
		//   62  152:invokestatic    #86  <Method void zzc.zza(Parcel, boolean)>
				break;

		//*  63  155:goto            173
			case 1: // '\001'
				init(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
		//   64  158:aload_0         
		//   65  159:aload_2         
		//   66  160:invokevirtual   #90  <Method IBinder Parcel.readStrongBinder()>
		//   67  163:invokestatic    #95  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//   68  166:invokevirtual   #99  <Method void init(IObjectWrapper)>
				parcel1.writeNoException();
		//   69  169:aload_3         
		//   70  170:invokevirtual   #50  <Method void Parcel.writeNoException()>
				break;
			}
			return true;
		//   71  173:iconst_1        
		//   72  174:ireturn         
		}

		public Stub()
		{
			super("com.google.android.gms.flags.IFlagProvider");
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <String "com.google.android.gms.flags.IFlagProvider">
		//    2    3:invokespecial   #17  <Method void zzb(String)>
		//    3    6:return          
		}
	}

	public static class Stub.Proxy extends zza
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
			zzc.zza(parcel, ((IInterface) (iobjectwrapper)));
		//    3    5:aload_2         
		//    4    6:aload_1         
		//    5    7:invokestatic    #81  <Method void zzc.zza(Parcel, IInterface)>
			((zza)this).transactAndReadExceptionReturnVoid(1, parcel);
		//    6   10:aload_0         
		//    7   11:iconst_1        
		//    8   12:aload_2         
		//    9   13:invokevirtual   #85  <Method void zza.transactAndReadExceptionReturnVoid(int, Parcel)>
		//   10   16:return          
		}

		Stub.Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.flags.IFlagProvider");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.flags.IFlagProvider">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public abstract boolean getBooleanFlagValue(String s, boolean flag, int i)
		throws RemoteException;

	public abstract int getIntFlagValue(String s, int i, int j)
		throws RemoteException;

	public abstract long getLongFlagValue(String s, long l, int i)
		throws RemoteException;

	public abstract String getStringFlagValue(String s, String s1, int i)
		throws RemoteException;

	public abstract void init(IObjectWrapper iobjectwrapper)
		throws RemoteException;
}
