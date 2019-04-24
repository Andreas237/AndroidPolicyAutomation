// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzct

public class zzcs extends zza
{

	public zzcs(int i, long l, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void zza()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int statusCode>
		zzbUP = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #30  <Field long zzbUP>
		zzbUR = list;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #32  <Field List zzbUR>
	//   11   20:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzct.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #40  <Method void com.google.android.gms.wearable.internal.zzct.zza(zzcs, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzct();
	public final int statusCode;
	public final long zzbUP;
	public final List zzbUR;

	static 
	{
	//    0    0:new             #18  <Class zzct>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void zzct()>
	//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
