// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bvo

public final class zzvv extends AbstractSafeParcelable
{

	public zzvv(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String b>
	//    8   14:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #33  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #36  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, 2, b, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #26  <Field String b>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #36  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, i);
	//   15   25:aload_1         
	//   16   26:iload_2         
	//   17   27:invokestatic    #38  <Method void c.a(Parcel, int)>
	//   18   30:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bvo();
	private final String a;
	private final String b;

	static 
	{
	//    0    0:new             #14  <Class bvo>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void bvo()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
