// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.common.internal:
//			IGmsServiceBroker, IGmsCallbacks, GetServiceRequest

private static final class IGmsServiceBroker$Stub$zza
	implements IGmsServiceBroker
{

	public final IBinder asBinder()
	{
		return zza;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field IBinder zza>
	//    2    4:areturn         
	}

	public final void getService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
	{
		Parcel parcel;
		Parcel parcel1;
		parcel = Parcel.obtain();
	//    0    0:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    1    3:astore_3        
		parcel1 = Parcel.obtain();
	//    2    4:invokestatic    #29  <Method Parcel Parcel.obtain()>
	//    3    7:astore          4
		parcel.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
	//    4    9:aload_3         
	//    5   10:ldc1            #31  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
	//    6   12:invokevirtual   #35  <Method void Parcel.writeInterfaceToken(String)>
		if(igmscallbacks == null) goto _L2; else goto _L1
	//    7   15:aload_1         
	//    8   16:ifnull          100
_L1:
		igmscallbacks = ((IGmsCallbacks) (igmscallbacks.asBinder()));
	//    9   19:aload_1         
	//   10   20:invokeinterface #39  <Method IBinder IGmsCallbacks.asBinder()>
	//   11   25:astore_1        
	//*  12   26:goto            29
_L4:
		parcel.writeStrongBinder(((IBinder) (igmscallbacks)));
	//   13   29:aload_3         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #42  <Method void Parcel.writeStrongBinder(IBinder)>
		if(getservicerequest == null)
			break MISSING_BLOCK_LABEL_52;
	//   16   34:aload_2         
	//   17   35:ifnull          52
		parcel.writeInt(1);
	//   18   38:aload_3         
	//   19   39:iconst_1        
	//   20   40:invokevirtual   #46  <Method void Parcel.writeInt(int)>
		getservicerequest.writeToParcel(parcel, 0);
	//   21   43:aload_2         
	//   22   44:aload_3         
	//   23   45:iconst_0        
	//   24   46:invokevirtual   #52  <Method void GetServiceRequest.writeToParcel(Parcel, int)>
		break MISSING_BLOCK_LABEL_57;
	//   25   49:goto            57
		parcel.writeInt(0);
	//   26   52:aload_3         
	//   27   53:iconst_0        
	//   28   54:invokevirtual   #46  <Method void Parcel.writeInt(int)>
		zza.transact(46, parcel, parcel1, 0);
	//   29   57:aload_0         
	//   30   58:getfield        #18  <Field IBinder zza>
	//   31   61:bipush          46
	//   32   63:aload_3         
	//   33   64:aload           4
	//   34   66:iconst_0        
	//   35   67:invokeinterface #58  <Method boolean IBinder.transact(int, Parcel, Parcel, int)>
	//   36   72:pop             
		parcel1.readException();
	//   37   73:aload           4
	//   38   75:invokevirtual   #61  <Method void Parcel.readException()>
		parcel1.recycle();
	//   39   78:aload           4
	//   40   80:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   41   83:aload_3         
	//   42   84:invokevirtual   #64  <Method void Parcel.recycle()>
		return;
	//   43   87:return          
		igmscallbacks;
	//   44   88:astore_1        
		parcel1.recycle();
	//   45   89:aload           4
	//   46   91:invokevirtual   #64  <Method void Parcel.recycle()>
		parcel.recycle();
	//   47   94:aload_3         
	//   48   95:invokevirtual   #64  <Method void Parcel.recycle()>
		throw igmscallbacks;
	//   49   98:aload_1         
	//   50   99:athrow          
_L2:
		igmscallbacks = null;
	//   51  100:aconst_null     
	//   52  101:astore_1        
		if(true) goto _L4; else goto _L3
	//   53  102:goto            29
_L3:
	}

	private final IBinder zza;

	IGmsServiceBroker$Stub$zza(IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		zza = ibinder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field IBinder zza>
	//    5    9:return          
	}
}
