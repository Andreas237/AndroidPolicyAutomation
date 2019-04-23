// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.signin.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.signin.internal:
//			h

public final class zah extends AbstractSafeParcelable
{

	zah(int i, ResolveAccountRequest resolveaccountrequest)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
		b = resolveaccountrequest;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field ResolveAccountRequest b>
	//    8   14:return          
	}

	public zah(ResolveAccountRequest resolveaccountrequest)
	{
		this(1, resolveaccountrequest);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:aload_1         
	//    3    3:invokespecial   #29  <Method void zah(int, ResolveAccountRequest)>
	//    4    6:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field int a>
	//    7   11:invokestatic    #39  <Method void c.a(Parcel, int, int)>
		c.a(parcel, 2, ((android.os.Parcelable) (b)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #26  <Field ResolveAccountRequest b>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #42  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		c.a(parcel, j);
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:invokestatic    #44  <Method void c.a(Parcel, int)>
	//   18   30:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new h();
	private final int a;
	private final ResolveAccountRequest b;

	static 
	{
	//    0    0:new             #14  <Class h>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void h()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
