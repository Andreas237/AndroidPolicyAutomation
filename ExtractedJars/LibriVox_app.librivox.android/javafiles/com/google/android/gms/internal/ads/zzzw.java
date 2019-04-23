// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bzk

public final class zzzw extends AbstractSafeParcelable
{

	public zzzw(q q1)
	{
		this(q1.a(), q1.b(), q1.c());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method boolean q.a()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #29  <Method boolean q.b()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #31  <Method boolean q.c()>
	//    7   13:invokespecial   #34  <Method void zzzw(boolean, boolean, boolean)>
	//    8   16:return          
	}

	public zzzw(boolean flag, boolean flag1, boolean flag2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field boolean a>
		b = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #39  <Field boolean b>
		c = flag2;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #41  <Field boolean c>
	//   11   19:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #48  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field boolean a>
	//    7   11:invokestatic    #51  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field boolean b>
	//   12   20:invokestatic    #51  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #41  <Field boolean c>
	//   17   29:invokestatic    #51  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #53  <Method void c.a(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new bzk();
	public final boolean a;
	public final boolean b;
	public final boolean c;

	static 
	{
	//    0    0:new             #15  <Class bzk>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void bzk()>
	//    3    7:putstatic       #20  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
