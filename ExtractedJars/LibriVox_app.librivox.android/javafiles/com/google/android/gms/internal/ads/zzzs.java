// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.c.a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bzi

public final class zzzs extends AbstractSafeParcelable
{

	public zzzs(a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AbstractSafeParcelable()>
		a = a1.a();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #26  <Method String a.a()>
	//    5    9:putfield        #28  <Field String a>
	//    6   12:return          
	}

	zzzs(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #28  <Field String a>
	//    5    9:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 15, a, false);
	//    3    5:aload_1         
	//    4    6:bipush          15
	//    5    8:aload_0         
	//    6    9:getfield        #28  <Field String a>
	//    7   12:iconst_0        
	//    8   13:invokestatic    #39  <Method void c.a(Parcel, int, String, boolean)>
		c.a(parcel, i);
	//    9   16:aload_1         
	//   10   17:iload_2         
	//   11   18:invokestatic    #41  <Method void c.a(Parcel, int)>
	//   12   21:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bzi();
	public final String a;

	static 
	{
	//    0    0:new             #13  <Class bzi>
	//    1    3:dup             
	//    2    4:invokespecial   #16  <Method void bzi()>
	//    3    7:putstatic       #18  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
