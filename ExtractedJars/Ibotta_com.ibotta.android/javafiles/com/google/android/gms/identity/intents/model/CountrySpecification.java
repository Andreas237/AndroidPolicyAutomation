// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.identity.intents.model:
//			zza

public class CountrySpecification extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	public CountrySpecification(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void AbstractSafeParcelable()>
		zzk = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #36  <Field String zzk>
	//    5    9:return          
	}

	public String getCountryCode()
	{
		return zzk;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field String zzk>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, zzk, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #36  <Field String zzk>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #52  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #55  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zza();
	private String zzk;

	static 
	{
	//    0    0:new             #24  <Class zza>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void zza()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
