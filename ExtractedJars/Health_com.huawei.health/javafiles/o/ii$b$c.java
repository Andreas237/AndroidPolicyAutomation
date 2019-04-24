// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.os.*;

// Referenced classes of package o:
//			ii

static class ii$b$c
	implements ii
{

	public IBinder asBinder()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field IBinder d>
	//    2    4:areturn         
	}

	public int b(Bundle bundle)
		throws RemoteException
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #31  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.amap.api.service.locationprovider.ILocationProviderService");
	//    4    9:aload_3         
	//    5   10:ldc1            #33  <String "com.amap.api.service.locationprovider.ILocationProviderService">
	//    6   12:invokevirtual   #37  <Method void Parcel.writeInterfaceToken(String)>
		if(bundle == null)
			break MISSING_BLOCK_LABEL_33;
	//    7   15:aload_1         
	//    8   16:ifnull          33
		parcel.writeInt(1);
	//    9   19:aload_3         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		bundle.writeToParcel(parcel, 0);
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #47  <Method void Bundle.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_38;
	//   16   30:goto            38
		parcel.writeInt(0);
	//   17   33:aload_3         
	//   18   34:iconst_0        
	//   19   35:invokevirtual   #41  <Method void Parcel.writeInt(int)>
		int i;
		d.transact(1, parcel, parcel1, 0);
	//   20   38:aload_0         
	//   21   39:getfield        #19  <Field IBinder d>
	//   22   42:iconst_1        
	//   23   43:aload_3         
	//   24   44:aload           4
	//   25   46:iconst_0        
	//   26   47:invokeinterface #53  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   27   52:pop             
		parcel1.readException();
	//   28   53:aload           4
	//   29   55:invokevirtual   #56  <Method void Parcel.readException()>
		i = parcel1.readInt();
	//   30   58:aload           4
	//   31   60:invokevirtual   #60  <Method int Parcel.readInt()>
	//   32   63:istore_2        
		if(parcel1.readInt() != 0)
	//*  33   64:aload           4
	//*  34   66:invokevirtual   #60  <Method int Parcel.readInt()>
	//*  35   69:ifeq            78
			bundle.readFromParcel(parcel1);
	//   36   72:aload_1         
	//   37   73:aload           4
	//   38   75:invokevirtual   #64  <Method void Bundle.readFromParcel(Parcel)>
		parcel1.recycle();
	//   39   78:aload           4
	//   40   80:invokevirtual   #67  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   83:aload_3         
	//   42   84:invokevirtual   #67  <Method void Parcel.recycle()>
		return i;
	//   43   87:iload_2         
	//   44   88:ireturn         
		bundle;
	//   45   89:astore_1        
		parcel1.recycle();
	//   46   90:aload           4
	//   47   92:invokevirtual   #67  <Method void Parcel.recycle()>
		parcel.recycle();
	//   48   95:aload_3         
	//   49   96:invokevirtual   #67  <Method void Parcel.recycle()>
		throw bundle;
	//   50   99:aload_1         
	//   51  100:athrow          
	}

	private IBinder d;

	ii$b$c(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		d = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field IBinder d>
	//    5    9:return          
	}
}
