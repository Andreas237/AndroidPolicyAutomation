// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzbq

public class zzbp extends zza
{

	public zzbp(int i, ParcelFileDescriptor parcelfiledescriptor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void zza()>
		statusCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int statusCode>
		zzbyd = parcelfiledescriptor;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field ParcelFileDescriptor zzbyd>
	//    8   14:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzbq.zza(this, parcel, i | 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iconst_1        
	//    4    4:ior             
	//    5    5:invokestatic    #33  <Method void com.google.android.gms.wearable.internal.zzbq.zza(zzbp, Parcel, int)>
	//    6    8:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzbq();
	public final int statusCode;
	public final ParcelFileDescriptor zzbyd;

	static 
	{
	//    0    0:new             #15  <Class zzbq>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void zzbq()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
