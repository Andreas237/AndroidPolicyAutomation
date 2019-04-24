// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzcp

public class zzco extends zza
{

	public zzco(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void zza()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int statusCode>
		zzbhU = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int zzbhU>
	//    8   14:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzcp.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #32  <Method void com.google.android.gms.wearable.internal.zzcp.zza(zzco, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzcp();
	public final int statusCode;
	public final int zzbhU;

	static 
	{
	//    0    0:new             #14  <Class zzcp>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void zzcp()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
