// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.auth:
//			e

public final class zzah extends AbstractSafeParcelable
{

	zzah(int i, String s, PendingIntent pendingintent)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void AbstractSafeParcelable()>
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #26  <Field int a>
		b = (String)am.a(((Object) (s)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #31  <Method Object am.a(Object)>
	//    8   14:checkcast       #33  <Class String>
	//    9   17:putfield        #35  <Field String b>
		c = (PendingIntent)am.a(((Object) (pendingintent)));
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:invokestatic    #31  <Method Object am.a(Object)>
	//   13   25:checkcast       #37  <Class PendingIntent>
	//   14   28:putfield        #39  <Field PendingIntent c>
	//   15   31:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int a>
	//    7   11:invokestatic    #49  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #35  <Field String b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #52  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (c)), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #39  <Field PendingIntent c>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #55  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   21   35:aload_1         
	//   22   36:iload_3         
	//   23   37:invokestatic    #57  <Method void c.a(Parcel, int)>
	//   24   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new e();
	private final int a = 1;
	private final String b;
	private final PendingIntent c;

	static 
	{
	//    0    0:new             #16  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void e()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
