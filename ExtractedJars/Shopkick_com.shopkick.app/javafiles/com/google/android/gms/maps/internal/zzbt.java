// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.maps.internal;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzb;
import com.google.android.gms.internal.maps.zzc;

// Referenced classes of package com.google.android.gms.maps.internal:
//			zzbs

public abstract class zzbt extends zzb
	implements zzbs
{

	public zzbt()
	{
		super("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.maps.internal.ISnapshotReadyCallback">
	//    2    3:invokespecial   #13  <Method void zzb(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 2: default 24
	//	               1 40
	//	               2 26
		default:
			return false;
	//    2   24:iconst_0        
	//    3   25:ireturn         

		case 2: // '\002'
			zzb(com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4   26:aload_0         
	//    5   27:aload_2         
	//    6   28:invokevirtual   #24  <Method android.os.IBinder Parcel.readStrongBinder()>
	//    7   31:invokestatic    #30  <Method com.google.android.gms.dynamic.IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(android.os.IBinder)>
	//    8   34:invokevirtual   #34  <Method void zzb(com.google.android.gms.dynamic.IObjectWrapper)>
			break;

	//*   9   37:goto            54
		case 1: // '\001'
			onSnapshotReady((Bitmap)zzc.zza(parcel, Bitmap.CREATOR));
	//   10   40:aload_0         
	//   11   41:aload_2         
	//   12   42:getstatic       #40  <Field android.os.Parcelable$Creator Bitmap.CREATOR>
	//   13   45:invokestatic    #46  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   14   48:checkcast       #36  <Class Bitmap>
	//   15   51:invokevirtual   #50  <Method void onSnapshotReady(Bitmap)>
			break;
		}
		parcel1.writeNoException();
	//   16   54:aload_3         
	//   17   55:invokevirtual   #53  <Method void Parcel.writeNoException()>
		return true;
	//   18   58:iconst_1        
	//   19   59:ireturn         
	}
}
