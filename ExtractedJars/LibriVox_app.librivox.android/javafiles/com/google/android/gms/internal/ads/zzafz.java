// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			fb

public final class zzafz extends AbstractSafeParcelable
{

	public zzafz(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
	//    5    9:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #31  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field int a>
	//    7   11:invokestatic    #34  <Method void c.a(Parcel, int, int)>
		c.a(parcel, i);
	//    8   14:aload_1         
	//    9   15:iload_2         
	//   10   16:invokestatic    #36  <Method void c.a(Parcel, int)>
	//   11   19:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new fb();
	public final int a;

	static 
	{
	//    0    0:new             #14  <Class fb>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void fb()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
