// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth:
//			c

public class AccountChangeEventsResponse extends AbstractSafeParcelable
{

	AccountChangeEventsResponse(int i, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
		b = (List)am.a(((Object) (list)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #29  <Method Object am.a(Object)>
	//    8   14:checkcast       #31  <Class List>
	//    9   17:putfield        #33  <Field List b>
	//   10   20:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field int a>
	//    7   11:invokestatic    #43  <Method void c.a(Parcel, int, int)>
		c.c(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #33  <Field List b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #47  <Method void c.c(Parcel, int, List, boolean)>
		c.a(parcel, i);
	//   14   24:aload_1         
	//   15   25:iload_2         
	//   16   26:invokestatic    #49  <Method void c.a(Parcel, int)>
	//   17   29:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.auth.c();
	private final int a;
	private final List b;

	static 
	{
	//    0    0:new             #14  <Class com.google.android.gms.auth.c>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void com.google.android.gms.auth.c()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
