// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.Parcel;
import android.os.RemoteException;
import android.view.Surface;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zzb, zzec, zzc

public abstract class zzed extends zzb
	implements zzec
{

	public zzed()
	{
		super("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
	//    0    0:aload_0         
	//    1    1:ldc1            #10  <String "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks">
	//    2    3:invokespecial   #13  <Method void zzb(String)>
	//    3    6:return          
	}

	protected final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 4: default 32
	//	               1 59
	//	               2 48
	//	               3 41
	//	               4 34
		default:
			return false;
	//    2   32:iconst_0        
	//    3   33:ireturn         

		case 4: // '\004'
			zzc();
	//    4   34:aload_0         
	//    5   35:invokevirtual   #21  <Method void zzc()>
			break;

	//*   6   38:goto            81
		case 3: // '\003'
			onDisconnected();
	//    7   41:aload_0         
	//    8   42:invokevirtual   #24  <Method void onDisconnected()>
			break;

	//*   9   45:goto            81
		case 2: // '\002'
			onError(parcel.readInt());
	//   10   48:aload_0         
	//   11   49:aload_2         
	//   12   50:invokevirtual   #30  <Method int Parcel.readInt()>
	//   13   53:invokevirtual   #34  <Method void onError(int)>
			break;

	//*  14   56:goto            81
		case 1: // '\001'
			zza(parcel.readInt(), parcel.readInt(), (Surface)zzc.zza(parcel, Surface.CREATOR));
	//   15   59:aload_0         
	//   16   60:aload_2         
	//   17   61:invokevirtual   #30  <Method int Parcel.readInt()>
	//   18   64:aload_2         
	//   19   65:invokevirtual   #30  <Method int Parcel.readInt()>
	//   20   68:aload_2         
	//   21   69:getstatic       #40  <Field android.os.Parcelable$Creator Surface.CREATOR>
	//   22   72:invokestatic    #46  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//   23   75:checkcast       #36  <Class Surface>
	//   24   78:invokevirtual   #49  <Method void zza(int, int, Surface)>
			break;
		}
		parcel1.writeNoException();
	//   25   81:aload_3         
	//   26   82:invokevirtual   #52  <Method void Parcel.writeNoException()>
		return true;
	//   27   85:iconst_1        
	//   28   86:ireturn         
	}
}
