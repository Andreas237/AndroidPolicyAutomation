// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.internal:
//			ay

public class SignInButtonConfig extends AbstractSafeParcelable
{

	SignInButtonConfig(int i, int j, int k, Scope ascope[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field int b>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #31  <Field int c>
		d = ascope;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #33  <Field Scope[] d>
	//   14   25:return          
	}

	public int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int b>
	//    2    4:ireturn         
	}

	public int b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int c>
	//    2    4:ireturn         
	}

	public Scope[] c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Scope[] d>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #43  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field int a>
	//    7   11:invokestatic    #46  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #48  <Method int a()>
	//   12   20:invokestatic    #46  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #50  <Method int b()>
	//   17   29:invokestatic    #46  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, ((android.os.Parcelable []) (c())), i, false);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #52  <Method Scope[] c()>
	//   22   38:iload_2         
	//   23   39:iconst_0        
	//   24   40:invokestatic    #55  <Method void c.a(Parcel, int, android.os.Parcelable[], int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   25   43:aload_1         
	//   26   44:iload_3         
	//   27   45:invokestatic    #57  <Method void c.a(Parcel, int)>
	//   28   48:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ay();
	private final int a;
	private final int b;
	private final int c;
	private final Scope d[];

	static 
	{
	//    0    0:new             #17  <Class ay>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void ay()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
