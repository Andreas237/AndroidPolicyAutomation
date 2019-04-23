// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.auth-api:
//			j

public final class zzy extends AbstractSafeParcelable
{

	public zzy(Credential credential)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void AbstractSafeParcelable()>
		a = credential;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Credential a>
	//    5    9:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int k = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #29  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		c.a(parcel, 1, ((android.os.Parcelable) (a)), i, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #22  <Field Credential a>
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokestatic    #32  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		c.a(parcel, k);
	//   10   16:aload_1         
	//   11   17:iload_3         
	//   12   18:invokestatic    #34  <Method void c.a(Parcel, int)>
	//   13   21:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new j();
	private final Credential a;

	static 
	{
	//    0    0:new             #12  <Class j>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void j()>
	//    3    7:putstatic       #17  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
