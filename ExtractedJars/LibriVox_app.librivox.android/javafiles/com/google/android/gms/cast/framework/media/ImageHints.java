// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			ak

public class ImageHints extends AbstractSafeParcelable
{

	public ImageHints(int i, int j, int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #24  <Field int a>
		b = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #26  <Field int b>
		c = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #28  <Field int c>
	//   11   19:return          
	}

	public int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int a>
	//    2    4:ireturn         
	}

	public int b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field int b>
	//    2    4:ireturn         
	}

	public int c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int c>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #36  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a());
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #38  <Method int a()>
	//    7   11:invokestatic    #41  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #43  <Method int b()>
	//   12   20:invokestatic    #41  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #45  <Method int c()>
	//   17   29:invokestatic    #41  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   18   32:aload_1         
	//   19   33:iload_2         
	//   20   34:invokestatic    #47  <Method void c.a(Parcel, int)>
	//   21   37:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ak();
	private final int a;
	private final int b;
	private final int c;

	static 
	{
	//    0    0:new             #14  <Class ak>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void ak()>
	//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
