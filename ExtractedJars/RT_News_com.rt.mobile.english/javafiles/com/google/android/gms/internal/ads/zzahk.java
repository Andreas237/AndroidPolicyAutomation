// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzahl, zzjj

public final class zzahk extends AbstractSafeParcelable
{

	public zzahk(zzjj zzjj, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void AbstractSafeParcelable()>
		zzccv = zzjj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #38  <Field zzjj zzccv>
		zzacp = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #40  <Field String zzacp>
	//    8   14:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zzccv)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field zzjj zzccv>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #54  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 3, zzacp, false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #40  <Field String zzacp>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #58  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   16   26:aload_1         
	//   17   27:iload_3         
	//   18   28:invokestatic    #61  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   19   31:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzahl();
	public final String zzacp;
	public final zzjj zzccv;

	static 
	{
	//    0    0:new             #26  <Class zzahl>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void zzahl()>
	//    3    7:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
