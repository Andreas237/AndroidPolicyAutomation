// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzq, zzcl

public final class zzcm extends zzq
	implements zzcl
{

	zzcm(IBinder ibinder)
	{
		super(ibinder, "com.google.android.gms.analytics.internal.IAnalyticsService");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #10  <String "com.google.android.gms.analytics.internal.IAnalyticsService">
	//    3    4:invokespecial   #13  <Method void zzq(IBinder, String)>
	//    4    7:return          
	}

	public final void zza(Map map, long l, String s, List list)
	{
		Parcel parcel = ((zzq)this).obtainAndWriteInterfaceToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method Parcel zzq.obtainAndWriteInterfaceToken()>
	//    2    4:astore          6
		parcel.writeMap(map);
	//    3    6:aload           6
	//    4    8:aload_1         
	//    5    9:invokevirtual   #26  <Method void Parcel.writeMap(Map)>
		parcel.writeLong(l);
	//    6   12:aload           6
	//    7   14:lload_2         
	//    8   15:invokevirtual   #30  <Method void Parcel.writeLong(long)>
		parcel.writeString(s);
	//    9   18:aload           6
	//   10   20:aload           4
	//   11   22:invokevirtual   #34  <Method void Parcel.writeString(String)>
		parcel.writeTypedList(list);
	//   12   25:aload           6
	//   13   27:aload           5
	//   14   29:invokevirtual   #38  <Method void Parcel.writeTypedList(List)>
		((zzq)this).zza(1, parcel);
	//   15   32:aload_0         
	//   16   33:iconst_1        
	//   17   34:aload           6
	//   18   36:invokevirtual   #41  <Method void zzq.zza(int, Parcel)>
	//   19   39:return          
	}

	public final void zzbr()
	{
		((zzq)this).zza(2, ((zzq)this).obtainAndWriteInterfaceToken());
	//    0    0:aload_0         
	//    1    1:iconst_2        
	//    2    2:aload_0         
	//    3    3:invokevirtual   #20  <Method Parcel zzq.obtainAndWriteInterfaceToken()>
	//    4    6:invokevirtual   #41  <Method void zzq.zza(int, Parcel)>
	//    5    9:return          
	}
}
