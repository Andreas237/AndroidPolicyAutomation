// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.auth.api.accounttransfer:
//			e

public class DeviceMetaData extends AbstractSafeParcelable
{

	DeviceMetaData(int i, boolean flag, long l, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void AbstractSafeParcelable()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #27  <Field int a>
		b = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #29  <Field boolean b>
		c = l;
	//    8   14:aload_0         
	//    9   15:lload_3         
	//   10   16:putfield        #31  <Field long c>
		d = flag1;
	//   11   19:aload_0         
	//   12   20:iload           5
	//   13   22:putfield        #33  <Field boolean d>
	//   14   25:return          
	}

	public boolean a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean b>
	//    2    4:ireturn         
	}

	public long b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field long c>
	//    2    4:lreturn         
	}

	public boolean c()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field boolean d>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #42  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #27  <Field int a>
	//    7   11:invokestatic    #45  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #47  <Method boolean a()>
	//   12   20:invokestatic    #50  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b());
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:invokevirtual   #52  <Method long b()>
	//   17   29:invokestatic    #55  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:invokevirtual   #57  <Method boolean c()>
	//   22   38:invokestatic    #50  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   23   41:aload_1         
	//   24   42:iload_2         
	//   25   43:invokestatic    #59  <Method void c.a(Parcel, int)>
	//   26   46:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new e();
	private final int a;
	private boolean b;
	private long c;
	private final boolean d;

	static 
	{
	//    0    0:new             #17  <Class e>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void e()>
	//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
