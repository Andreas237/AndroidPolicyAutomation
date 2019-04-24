// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;

// Referenced classes of package com.google.android.gms.internal:
//			zzasa

public final class zzarz extends zza
	implements Result
{

	public zzarz(Status status)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void zza()>
		zzair = status;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field Status zzair>
	//    5    9:return          
	}

	public Status getStatus()
	{
		return zzair;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Status zzair>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.internal.zzasa.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #44  <Method void com.google.android.gms.internal.zzasa.zza(zzarz, Parcel, int)>
	//    4    6:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzasa();
	public static final zzarz zzbkB;
	private final Status zzair;

	static 
	{
		zzbkB = new zzarz(Status.zzazx);
	//    0    0:new             #2   <Class zzarz>
	//    1    3:dup             
	//    2    4:getstatic       #20  <Field Status Status.zzazx>
	//    3    7:invokespecial   #24  <Method void zzarz(Status)>
	//    4   10:putstatic       #26  <Field zzarz zzbkB>
	//    5   13:new             #28  <Class zzasa>
	//    6   16:dup             
	//    7   17:invokespecial   #30  <Method void zzasa()>
	//    8   20:putstatic       #32  <Field android.os.Parcelable$Creator CREATOR>
	//*   9   23:return          
	}
}
