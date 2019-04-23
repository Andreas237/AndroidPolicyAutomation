// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			sa, zzbbi

public final class zzatb extends AbstractSafeParcelable
{

	public zzatb(Bundle bundle, zzbbi zzbbi, ApplicationInfo applicationinfo, String s, List list, PackageInfo packageinfo, String s1, 
			boolean flag, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void AbstractSafeParcelable()>
		a = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field Bundle a>
		b = zzbbi;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #41  <Field zzbbi b>
		d = s;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #43  <Field String d>
		c = applicationinfo;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #45  <Field ApplicationInfo c>
		e = list;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #47  <Field List e>
		f = packageinfo;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #49  <Field PackageInfo f>
		g = s1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #51  <Field String g>
		h = flag;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #53  <Field boolean h>
		i = s2;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #55  <Field String i>
	//   29   55:return          
	}

	public final void writeToParcel(Parcel parcel, int j)
	{
		int k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #63  <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #39  <Field Bundle a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #66  <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((android.os.Parcelable) (b)), j, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #41  <Field zzbbi b>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #69  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (c)), j, false);
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:getfield        #45  <Field ApplicationInfo c>
	//   20   32:iload_2         
	//   21   33:iconst_0        
	//   22   34:invokestatic    #69  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   23   37:aload_1         
	//   24   38:iconst_4        
	//   25   39:aload_0         
	//   26   40:getfield        #43  <Field String d>
	//   27   43:iconst_0        
	//   28   44:invokestatic    #72  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 5, e, false);
	//   29   47:aload_1         
	//   30   48:iconst_5        
	//   31   49:aload_0         
	//   32   50:getfield        #47  <Field List e>
	//   33   53:iconst_0        
	//   34   54:invokestatic    #75  <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, ((android.os.Parcelable) (f)), j, false);
	//   35   57:aload_1         
	//   36   58:bipush          6
	//   37   60:aload_0         
	//   38   61:getfield        #49  <Field PackageInfo f>
	//   39   64:iload_2         
	//   40   65:iconst_0        
	//   41   66:invokestatic    #69  <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g, false);
	//   42   69:aload_1         
	//   43   70:bipush          7
	//   44   72:aload_0         
	//   45   73:getfield        #51  <Field String g>
	//   46   76:iconst_0        
	//   47   77:invokestatic    #72  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, h);
	//   48   80:aload_1         
	//   49   81:bipush          8
	//   50   83:aload_0         
	//   51   84:getfield        #53  <Field boolean h>
	//   52   87:invokestatic    #78  <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, i, false);
	//   53   90:aload_1         
	//   54   91:bipush          9
	//   55   93:aload_0         
	//   56   94:getfield        #55  <Field String i>
	//   57   97:iconst_0        
	//   58   98:invokestatic    #72  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
	//   59  101:aload_1         
	//   60  102:iload_3         
	//   61  103:invokestatic    #80  <Method void c.a(Parcel, int)>
	//   62  106:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new sa();
	private final Bundle a;
	private final zzbbi b;
	private final ApplicationInfo c;
	private final String d;
	private final List e;
	private final PackageInfo f;
	private final String g;
	private final boolean h;
	private final String i;

	static 
	{
	//    0    0:new             #29  <Class sa>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void sa()>
	//    3    7:putstatic       #34  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
