// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.ads.internal:
//			r

public final class zzaq extends AbstractSafeParcelable
{

	zzaq(boolean flag, boolean flag1, String s, boolean flag2, float f1, int j, boolean flag3, 
			boolean flag4, boolean flag5)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #34  <Field boolean a>
		b = flag1;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #36  <Field boolean b>
		i = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #38  <Field String i>
		c = flag2;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #40  <Field boolean c>
		d = f1;
	//   14   25:aload_0         
	//   15   26:fload           5
	//   16   28:putfield        #42  <Field float d>
		e = j;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #44  <Field int e>
		f = flag3;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #46  <Field boolean f>
		g = flag4;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #48  <Field boolean g>
		h = flag5;
	//   26   49:aload_0         
	//   27   50:iload           9
	//   28   52:putfield        #50  <Field boolean h>
	//   29   55:return          
	}

	public zzaq(boolean flag, boolean flag1, boolean flag2, float f1, int j, boolean flag3, boolean flag4, 
			boolean flag5)
	{
		this(flag, flag1, ((String) (null)), flag2, f1, j, flag3, flag4, flag5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:iload_3         
	//    5    5:fload           4
	//    6    7:iload           5
	//    7    9:iload           6
	//    8   11:iload           7
	//    9   13:iload           8
	//   10   15:invokespecial   #53  <Method void zzaq(boolean, boolean, String, boolean, float, int, boolean, boolean, boolean)>
	//   11   18:return          
	}

	public final void writeToParcel(Parcel parcel, int j)
	{
		j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #34  <Field boolean a>
	//    7   11:invokestatic    #63  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b);
	//    8   14:aload_1         
	//    9   15:iconst_3        
	//   10   16:aload_0         
	//   11   17:getfield        #36  <Field boolean b>
	//   12   20:invokestatic    #63  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, i, false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #38  <Field String i>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #66  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, c);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #40  <Field boolean c>
	//   23   39:invokestatic    #63  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, d);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #42  <Field float d>
	//   28   49:invokestatic    #69  <Method void c.a(Parcel, int, float)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, e);
	//   29   52:aload_1         
	//   30   53:bipush          7
	//   31   55:aload_0         
	//   32   56:getfield        #44  <Field int e>
	//   33   59:invokestatic    #72  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, f);
	//   34   62:aload_1         
	//   35   63:bipush          8
	//   36   65:aload_0         
	//   37   66:getfield        #46  <Field boolean f>
	//   38   69:invokestatic    #63  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, g);
	//   39   72:aload_1         
	//   40   73:bipush          9
	//   41   75:aload_0         
	//   42   76:getfield        #48  <Field boolean g>
	//   43   79:invokestatic    #63  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, h);
	//   44   82:aload_1         
	//   45   83:bipush          10
	//   46   85:aload_0         
	//   47   86:getfield        #50  <Field boolean h>
	//   48   89:invokestatic    #63  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   49   92:aload_1         
	//   50   93:iload_2         
	//   51   94:invokestatic    #74  <Method void c.a(Parcel, int)>
	//   52   97:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new r();
	public final boolean a;
	public final boolean b;
	public final boolean c;
	public final float d;
	public final int e;
	public final boolean f;
	public final boolean g;
	public final boolean h;
	private final String i;

	static 
	{
	//    0    0:new             #24  <Class r>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void r()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
