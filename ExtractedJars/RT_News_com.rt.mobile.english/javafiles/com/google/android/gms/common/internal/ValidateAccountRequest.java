// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.internal:
//			ValidateAccountRequestCreator

public class ValidateAccountRequest extends AbstractSafeParcelable
{

	ValidateAccountRequest(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void AbstractSafeParcelable()>
		zzal = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #32  <Field int zzal>
	//    5    9:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, zzal);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field int zzal>
	//    7   11:invokestatic    #46  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #49  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   11   19:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ValidateAccountRequestCreator();
	private final int zzal;

	static 
	{
	//    0    0:new             #20  <Class ValidateAccountRequestCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void ValidateAccountRequestCreator()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
