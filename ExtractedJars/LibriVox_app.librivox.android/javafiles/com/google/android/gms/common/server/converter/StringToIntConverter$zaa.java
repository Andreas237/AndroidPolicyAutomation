// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.server.converter:
//			c

public final class StringToIntConverter$zaa extends AbstractSafeParcelable
{

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #37  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, c);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #25  <Field int c>
	//    7   11:invokestatic    #40  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field String a>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #43  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #29  <Field int b>
	//   18   30:invokestatic    #40  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:invokestatic    #45  <Method void c.a(Parcel, int)>
	//   22   38:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.common.server.converter.c();
	final String a;
	final int b;
	private final int c;

	static 
	{
	//    0    0:new             #15  <Class com.google.android.gms.common.server.converter.c>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void com.google.android.gms.common.server.converter.c()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	StringToIntConverter$zaa(int i, String s, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
		c = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int c>
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field String a>
		b = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #29  <Field int b>
	//   11   19:return          
	}

	StringToIntConverter$zaa(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
		c = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #25  <Field int c>
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #27  <Field String a>
		b = i;
	//    8   14:aload_0         
	//    9   15:iload_2         
	//   10   16:putfield        #29  <Field int b>
	//   11   19:return          
	}
}
