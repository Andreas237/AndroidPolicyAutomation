// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.cast;

import android.os.*;
import com.google.android.gms.common.api.internal.IStatusCallback;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.cast:
//			zza, zzdd, zzc

public final class zzde extends zza
	implements zzdd
{

	zzde(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.cast.internal.ICastService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.cast.internal.ICastService">
	//    3    4:invokespecial   #13  <Method void zza(IBinder, String)>
	//    4    7:return          
	}

	public final void zza(IStatusCallback istatuscallback, String as[], String s, List list)
		throws RemoteException
	{
		Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method Parcel zza.obtainAndWriteInterfaceToken()>
	//    2    4:astore          5
		zzc.zza(parcel, ((android.os.IInterface) (istatuscallback)));
	//    3    6:aload           5
	//    4    8:aload_1         
	//    5    9:invokestatic    #27  <Method void zzc.zza(Parcel, android.os.IInterface)>
		parcel.writeStringArray(as);
	//    6   12:aload           5
	//    7   14:aload_2         
	//    8   15:invokevirtual   #33  <Method void Parcel.writeStringArray(String[])>
		parcel.writeString(s);
	//    9   18:aload           5
	//   10   20:aload_3         
	//   11   21:invokevirtual   #37  <Method void Parcel.writeString(String)>
		parcel.writeTypedList(list);
	//   12   24:aload           5
	//   13   26:aload           4
	//   14   28:invokevirtual   #41  <Method void Parcel.writeTypedList(List)>
		((zza)this).transactOneway(2, parcel);
	//   15   31:aload_0         
	//   16   32:iconst_2        
	//   17   33:aload           5
	//   18   35:invokevirtual   #45  <Method void zza.transactOneway(int, Parcel)>
	//   19   38:return          
	}
}
