// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.model.internal;

import android.os.*;
import com.google.android.gms.maps.model.Tile;

// Referenced classes of package com.google.android.gms.maps.model.internal:
//			zzi

static class zzi$zza$zza
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

	zzi$zza$zza(IBinder ibinder)
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
