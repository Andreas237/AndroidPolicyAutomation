// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			ap

public class NotificationAction extends AbstractSafeParcelable
{

	NotificationAction(String s, int i, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String a>
		b = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #27  <Field int b>
		c = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #29  <Field String c>
	//   11   19:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String a>
	//    2    4:areturn         
	}

	public int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field int b>
	//    2    4:ireturn         
	}

	public String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String c>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #38  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #40  <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #43  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #45  <Method int b()>
	//   13   21:invokestatic    #48  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c(), false);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:invokevirtual   #50  <Method String c()>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #43  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #52  <Method void c.a(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ap();
	private final String a;
	private final int b;
	private final String c;

	static 
	{
	//    0    0:new             #15  <Class ap>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ap()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
