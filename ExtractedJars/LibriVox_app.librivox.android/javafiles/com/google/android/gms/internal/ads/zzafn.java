// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal.ads:
//			ep

public final class zzafn extends AbstractSafeParcelable
{

	zzafn(boolean flag, String s, int i, byte abyte0[], String as[], String as1[], boolean flag1, 
			long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AbstractSafeParcelable()>
		a = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field boolean a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String b>
		c = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #39  <Field int c>
		d = abyte0;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #41  <Field byte[] d>
		e = as;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #43  <Field String[] e>
		f = as1;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #45  <Field String[] f>
		g = flag1;
	//   20   37:aload_0         
	//   21   38:iload           7
	//   22   40:putfield        #47  <Field boolean g>
		h = l;
	//   23   43:aload_0         
	//   24   44:lload           8
	//   25   46:putfield        #49  <Field long h>
	//   26   49:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #56  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #35  <Field boolean a>
	//    7   11:invokestatic    #59  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #37  <Field String b>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #62  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #39  <Field int c>
	//   18   30:invokestatic    #65  <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   19   33:aload_1         
	//   20   34:iconst_4        
	//   21   35:aload_0         
	//   22   36:getfield        #41  <Field byte[] d>
	//   23   39:iconst_0        
	//   24   40:invokestatic    #68  <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e, false);
	//   25   43:aload_1         
	//   26   44:iconst_5        
	//   27   45:aload_0         
	//   28   46:getfield        #43  <Field String[] e>
	//   29   49:iconst_0        
	//   30   50:invokestatic    #71  <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f, false);
	//   31   53:aload_1         
	//   32   54:bipush          6
	//   33   56:aload_0         
	//   34   57:getfield        #45  <Field String[] f>
	//   35   60:iconst_0        
	//   36   61:invokestatic    #71  <Method void c.a(Parcel, int, String[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g);
	//   37   64:aload_1         
	//   38   65:bipush          7
	//   39   67:aload_0         
	//   40   68:getfield        #47  <Field boolean g>
	//   41   71:invokestatic    #59  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, h);
	//   42   74:aload_1         
	//   43   75:bipush          8
	//   44   77:aload_0         
	//   45   78:getfield        #49  <Field long h>
	//   46   81:invokestatic    #74  <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   47   84:aload_1         
	//   48   85:iload_2         
	//   49   86:invokestatic    #76  <Method void c.a(Parcel, int)>
	//   50   89:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new ep();
	public final boolean a;
	public final String b;
	public final int c;
	public final byte d[];
	public final String e[];
	public final String f[];
	public final boolean g;
	public final long h;

	static 
	{
	//    0    0:new             #25  <Class ep>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void ep()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
