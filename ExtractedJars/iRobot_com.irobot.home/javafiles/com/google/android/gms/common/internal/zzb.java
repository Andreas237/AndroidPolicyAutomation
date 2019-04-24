// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzc

public final class zzb extends AbstractSafeParcelable
{

	public zzb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AbstractSafeParcelable()>
	//    2    4:return          
	}

	zzb(Bundle bundle, Feature afeature[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AbstractSafeParcelable()>
		zzcz = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Bundle zzcz>
		zzda = afeature;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field Feature[] zzda>
	//    8   14:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeBundle(parcel, 1, zzcz, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field Bundle zzcz>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #50  <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 2, ((android.os.Parcelable []) (zzda)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #36  <Field Feature[] zzda>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #54  <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   16   26:aload_1         
	//   17   27:iload_3         
	//   18   28:invokestatic    #57  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   19   31:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	Bundle zzcz;
	Feature zzda[];

	static 
	{
	//    0    0:new             #22  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void zzc()>
	//    3    7:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
