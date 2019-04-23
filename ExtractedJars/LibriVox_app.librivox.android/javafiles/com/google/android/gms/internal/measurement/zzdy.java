// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			p

public final class zzdy extends AbstractSafeParcelable
{

	zzdy(long l, long l1, boolean flag, String s, String s1, 
			String s2, Bundle bundle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void AbstractSafeParcelable()>
		a = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #31  <Field long a>
		b = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #33  <Field long b>
		c = flag;
	//    8   14:aload_0         
	//    9   15:iload           5
	//   10   17:putfield        #35  <Field boolean c>
		d = s;
	//   11   20:aload_0         
	//   12   21:aload           6
	//   13   23:putfield        #37  <Field String d>
		e = s1;
	//   14   26:aload_0         
	//   15   27:aload           7
	//   16   29:putfield        #39  <Field String e>
		f = s2;
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:putfield        #41  <Field String f>
		g = bundle;
	//   20   38:aload_0         
	//   21   39:aload           9
	//   22   41:putfield        #43  <Field Bundle g>
	//   23   44:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #31  <Field long a>
	//    7   11:invokestatic    #53  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #33  <Field long b>
	//   12   20:invokestatic    #53  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #35  <Field boolean c>
	//   17   29:invokestatic    #56  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field String d>
	//   22   38:iconst_0        
	//   23   39:invokestatic    #59  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e, false);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #39  <Field String e>
	//   28   48:iconst_0        
	//   29   49:invokestatic    #59  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #41  <Field String f>
	//   34   59:iconst_0        
	//   35   60:invokestatic    #59  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g, false);
	//   36   63:aload_1         
	//   37   64:bipush          7
	//   38   66:aload_0         
	//   39   67:getfield        #43  <Field Bundle g>
	//   40   70:iconst_0        
	//   41   71:invokestatic    #62  <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   42   74:aload_1         
	//   43   75:iload_2         
	//   44   76:invokestatic    #64  <Method void c.a(Parcel, int)>
	//   45   79:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new p();
	public final long a;
	public final long b;
	public final boolean c;
	public final String d;
	public final String e;
	public final String f;
	public final Bundle g;

	static 
	{
	//    0    0:new             #21  <Class p>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void p()>
	//    3    7:putstatic       #26  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
