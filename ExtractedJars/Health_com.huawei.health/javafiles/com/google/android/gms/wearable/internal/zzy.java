// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzz

public class zzy extends zza
{

	public zzy(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void zza()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #23  <Field int statusCode>
	//    5    9:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzz.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #29  <Method void com.google.android.gms.wearable.internal.zzz.zza(zzy, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzz();
	public final int statusCode;

	static 
	{
	//    0    0:new             #13  <Class zzz>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void zzz()>
	//    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
