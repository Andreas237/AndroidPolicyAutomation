// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ug, zzwb

public final class zzavh extends AbstractSafeParcelable
{

	public zzavh(zzwb zzwb, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
		a = zzwb;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field zzwb a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String b>
	//    8   14:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		c.a(parcel, 2, ((android.os.Parcelable) (a)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #25  <Field zzwb a>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #37  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		c.a(parcel, 3, b, false);
	//   10   16:aload_1         
	//   11   17:iconst_3        
	//   12   18:aload_0         
	//   13   19:getfield        #27  <Field String b>
	//   14   22:iconst_0        
	//   15   23:invokestatic    #40  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, j);
	//   16   26:aload_1         
	//   17   27:iload_3         
	//   18   28:invokestatic    #42  <Method void c.a(Parcel, int)>
	//   19   31:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ug();
	public final zzwb a;
	public final String b;

	static 
	{
	//    0    0:new             #15  <Class ug>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ug()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
