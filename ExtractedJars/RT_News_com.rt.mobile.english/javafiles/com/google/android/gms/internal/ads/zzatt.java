// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzatu

public final class zzatt extends AbstractSafeParcelable
{

	zzatt(int i, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int versionCode>
		packageName = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field String packageName>
		zzdhd = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field String zzdhd>
	//   11   19:return          
	}

	public zzatt(String s, String s1)
	{
		this(1, s, s1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:aload_2         
	//    4    4:invokespecial   #46  <Method void zzatt(int, String, String)>
	//    5    7:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #54  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int versionCode>
	//    7   11:invokestatic    #58  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, packageName, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field String packageName>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #62  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 3, zzdhd, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #41  <Field String zzdhd>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #62  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #65  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzatu();
	private final String packageName;
	private final int versionCode;
	private final String zzdhd;

	static 
	{
	//    0    0:new             #25  <Class zzatu>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzatu()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
