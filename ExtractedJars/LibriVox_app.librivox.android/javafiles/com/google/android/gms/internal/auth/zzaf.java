// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.auth:
//			d

public final class zzaf extends AbstractSafeParcelable
{

	zzaf(int i, String s, byte abyte0[])
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
		c = (byte[])am.a(((Object) (abyte0)));
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:invokestatic    #31  <Method Object am.a(Object)>
	//   13   25:checkcast       #36  <Class byte[]>
	//   14   28:putfield        #38  <Field byte[] c>
	//   15   31:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #45  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #26  <Field int a>
	//    7   11:invokestatic    #48  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #35  <Field String b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #51  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #38  <Field byte[] c>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #54  <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   20   34:aload_1         
	//   21   35:iload_2         
	//   22   36:invokestatic    #56  <Method void c.a(Parcel, int)>
	//   23   39:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new d();
	private final int a = 1;
	private final String b;
	private final byte c[];

	static 
	{
	//    0    0:new             #16  <Class d>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void d()>
	//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
