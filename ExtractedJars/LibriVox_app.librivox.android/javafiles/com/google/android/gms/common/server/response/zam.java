// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.server.response:
//			c

public final class zam extends AbstractSafeParcelable
{

	zam(int i, String s, FastJsonResponse.Field field)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		c = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #26  <Field int c>
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #28  <Field String a>
		b = field;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #30  <Field FastJsonResponse$Field b>
	//   11   19:return          
	}

	zam(String s, FastJsonResponse.Field field)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
		c = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #26  <Field int c>
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #28  <Field String a>
		b = field;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #30  <Field FastJsonResponse$Field b>
	//   11   19:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int c>
	//    7   11:invokestatic    #41  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #28  <Field String a>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #44  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (b)), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #30  <Field FastJsonResponse$Field b>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #47  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   21   35:aload_1         
	//   22   36:iload_3         
	//   23   37:invokestatic    #49  <Method void c.a(Parcel, int)>
	//   24   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.common.server.response.c();
	final String a;
	final FastJsonResponse.Field b;
	private final int c;

	static 
	{
	//    0    0:new             #16  <Class com.google.android.gms.common.server.response.c>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void com.google.android.gms.common.server.response.c()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
