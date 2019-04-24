// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.os.*;
import com.google.android.gms.maps.model.Tile;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zzi

public static abstract class zzi$zza extends Binder
	implements zzi
{
	static class zza
		implements zzi
	{

		public IBinder asBinder()
		{
			return zzrk;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field IBinder zzrk>
		//    2    4:areturn         
		}

		public Tile getTile(int i, int j, int k)
			throws RemoteException
		{
			Parcel parcel;
			Parcel parcel1;
			parcel = Parcel.obtain();
		//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    1    3:astore          5
			parcel1 = Parcel.obtain();
		//    2    5:invokestatic    #31  <Method Parcel Parcel.obtain()>
		//    3    8:astore          6
			Tile tile;
label0:
			{
				parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
		//    4   10:aload           5
		//    5   12:ldc1            #33  <String "com.google.android.gms.maps.model.internal.ITileProviderDelegate">
		//    6   14:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
				parcel.writeInt(i);
		//    7   17:aload           5
		//    8   19:iload_1         
		//    9   20:invokevirtual   #41  <Method void Parcel.writeInt(int)>
				parcel.writeInt(j);
		//   10   23:aload           5
		//   11   25:iload_2         
		//   12   26:invokevirtual   #41  <Method void Parcel.writeInt(int)>
				parcel.writeInt(k);
		//   13   29:aload           5
		//   14   31:iload_3         
		//   15   32:invokevirtual   #41  <Method void Parcel.writeInt(int)>
				zzrk.transact(1, parcel, parcel1, 0);
		//   16   35:aload_0         
		//   17   36:getfield        #18  <Field IBinder zzrk>
		//   18   39:iconst_1        
		//   19   40:aload           5
		//   20   42:aload           6
		//   21   44:iconst_0        
		//   22   45:invokeinterface #47  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
		//   23   50:pop             
				parcel1.readException();
		//   24   51:aload           6
		//   25   53:invokevirtual   #50  <Method void Parcel.readException()>
				if(parcel1.readInt() != 0)
		//*  26   56:aload           6
		//*  27   58:invokevirtual   #54  <Method int Parcel.readInt()>
		//*  28   61:ifeq            82
				{
					tile = (Tile)Tile.CREATOR.createFromParcel(parcel1);
		//   29   64:getstatic       #60  <Field android.os.Parcelable$Creator Tile.CREATOR>
		//   30   67:aload           6
		//   31   69:invokeinterface #66  <Method Object android.os.Parcelable$Creator.createFromParcel(Parcel)>
		//   32   74:checkcast       #56  <Class Tile>
		//   33   77:astore          4
					break label0;
		//   34   79:goto            85
				}
				tile = null;
		//   35   82:aconst_null     
		//   36   83:astore          4
			}
			parcel1.recycle();
		//   37   85:aload           6
		//   38   87:invokevirtual   #69  <Method void Parcel.recycle()>
			parcel.recycle();
		//   39   90:aload           5
		//   40   92:invokevirtual   #69  <Method void Parcel.recycle()>
			return tile;
		//   41   95:aload           4
		//   42   97:areturn         
			Exception exception;
			exception;
		//   43   98:astore          4
			parcel1.recycle();
		//   44  100:aload           6
		//   45  102:invokevirtual   #69  <Method void Parcel.recycle()>
			parcel.recycle();
		//   46  105:aload           5
		//   47  107:invokevirtual   #69  <Method void Parcel.recycle()>
			throw exception;
		//   48  110:aload           4
		//   49  112:athrow          
		}

		private IBinder zzrk;

		zza(IBinder ibinder)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzrk = ibinder;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field IBinder zzrk>
		//    5    9:return          
		}
	}


	public static zzi zzer(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
	//    4    6:aload_0         
	//    5    7:ldc1            #15  <String "com.google.android.gms.maps.model.internal.ITileProviderDelegate">
	//    6    9:invokeinterface #28  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface != null && (iinterface instanceof zzi))
	//*   8   15:aload_1         
	//*   9   16:ifnull          31
	//*  10   19:aload_1         
	//*  11   20:instanceof      #6   <Class zzi>
	//*  12   23:ifeq            31
			return (zzi)iinterface;
	//   13   26:aload_1         
	//   14   27:checkcast       #6   <Class zzi>
	//   15   30:areturn         
		else
			return ((zzi) (new zza(ibinder)));
	//   16   31:new             #9   <Class zzi$zza$zza>
	//   17   34:dup             
	//   18   35:aload_0         
	//   19   36:invokespecial   #31  <Method void zzi$zza$zza(IBinder)>
	//   20   39:areturn         
	}

	public IBinder asBinder()
	{
		return ((IBinder) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:lookupswitch    2: default 28
	//	               1: 39
	//	               1598968902: 31
	//*   2   28:goto            91
		case 1598968902: 
			parcel1.writeString("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
	//    3   31:aload_3         
	//    4   32:ldc1            #15  <String "com.google.android.gms.maps.model.internal.ITileProviderDelegate">
	//    5   34:invokevirtual   #43  <Method void Parcel.writeString(String)>
			return true;
	//    6   37:iconst_1        
	//    7   38:ireturn         

		case 1: // '\001'
			parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileProviderDelegate");
	//    8   39:aload_2         
	//    9   40:ldc1            #15  <String "com.google.android.gms.maps.model.internal.ITileProviderDelegate">
	//   10   42:invokevirtual   #46  <Method void Parcel.enforceInterface(String)>
			parcel = ((Parcel) (getTile(parcel.readInt(), parcel.readInt(), parcel.readInt())));
	//   11   45:aload_0         
	//   12   46:aload_2         
	//   13   47:invokevirtual   #50  <Method int Parcel.readInt()>
	//   14   50:aload_2         
	//   15   51:invokevirtual   #50  <Method int Parcel.readInt()>
	//   16   54:aload_2         
	//   17   55:invokevirtual   #50  <Method int Parcel.readInt()>
	//   18   58:invokevirtual   #54  <Method Tile getTile(int, int, int)>
	//   19   61:astore_2        
			parcel1.writeNoException();
	//   20   62:aload_3         
	//   21   63:invokevirtual   #57  <Method void Parcel.writeNoException()>
			if(parcel != null)
	//*  22   66:aload_2         
	//*  23   67:ifnull          84
			{
				parcel1.writeInt(1);
	//   24   70:aload_3         
	//   25   71:iconst_1        
	//   26   72:invokevirtual   #61  <Method void Parcel.writeInt(int)>
				((Tile) (parcel)).writeToParcel(parcel1, 1);
	//   27   75:aload_2         
	//   28   76:aload_3         
	//   29   77:iconst_1        
	//   30   78:invokevirtual   #67  <Method void Tile.writeToParcel(Parcel, int)>
			} else
	//*  31   81:goto            89
			{
				parcel1.writeInt(0);
	//   32   84:aload_3         
	//   33   85:iconst_0        
	//   34   86:invokevirtual   #61  <Method void Parcel.writeInt(int)>
			}
			return true;
	//   35   89:iconst_1        
	//   36   90:ireturn         
		}
		return super.onTransact(i, parcel, parcel1, j);
	//   37   91:aload_0         
	//   38   92:iload_1         
	//   39   93:aload_2         
	//   40   94:aload_3         
	//   41   95:iload           4
	//   42   97:invokespecial   #69  <Method boolean Binder.onTransact(int, Parcel, Parcel, int)>
	//   43  100:ireturn         
	}

	public zzi$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Binder()>
		attachInterface(((android.os.IInterface) (this)), "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:ldc1            #15  <String "com.google.android.gms.maps.model.internal.ITileProviderDelegate">
	//    5    8:invokevirtual   #19  <Method void attachInterface(android.os.IInterface, String)>
	//    6   11:return          
	}
}
