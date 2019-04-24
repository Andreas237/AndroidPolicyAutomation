// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbm

public class zzbl extends zza
{

	public zzbl(int i, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void zza()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int statusCode>
		zzbUB = list;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field List zzbUB>
	//    8   14:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzbm.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #36  <Method void com.google.android.gms.wearable.internal.zzbm.zza(zzbl, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbm();
	public final int statusCode;
	public final List zzbUB;

	static 
	{
	//    0    0:new             #16  <Class zzbm>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void zzbm()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
