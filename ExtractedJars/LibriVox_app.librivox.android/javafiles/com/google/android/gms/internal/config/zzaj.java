// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.config;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.config:
//			i

public final class zzaj extends AbstractSafeParcelable
{

	public zzaj(Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractSafeParcelable()>
		a = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Bundle a>
	//    5    9:return          
	}

	public final Bundle a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field Bundle a>
	//    2    4:areturn         
	}

	public final void writeToParcel(Parcel parcel, int j)
	{
		j = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #30  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field Bundle a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #33  <Method void c.a(Parcel, int, Bundle, boolean)>
		c.a(parcel, j);
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokestatic    #35  <Method void c.a(Parcel, int)>
	//   12   20:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new i();
	private final Bundle a;

	static 
	{
	//    0    0:new             #12  <Class i>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void i()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
