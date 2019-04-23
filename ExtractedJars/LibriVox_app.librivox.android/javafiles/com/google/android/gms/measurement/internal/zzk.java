// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.measurement.internal:
//			es

public final class zzk extends AbstractSafeParcelable
{

	zzk(String s, String s1, String s2, long l1, String s3, long l2, long l3, String s4, boolean flag, boolean flag1, String s5, 
			long l4, long l5, int i1, boolean flag2, boolean flag3, 
			boolean flag4, String s6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		am.a(s);
	//    2    4:aload_1         
	//    3    5:invokestatic    #45  <Method String am.a(String)>
	//    4    8:pop             
		a = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #47  <Field String a>
		if(TextUtils.isEmpty(((CharSequence) (s1))))
	//*   8   14:aload_2         
	//*   9   15:invokestatic    #53  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   18:ifeq            26
			s1 = null;
	//   11   21:aconst_null     
	//   12   22:astore_2        
	//*  13   23:goto            26
		b = s1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #55  <Field String b>
		c = s2;
	//   17   31:aload_0         
	//   18   32:aload_3         
	//   19   33:putfield        #57  <Field String c>
		j = l1;
	//   20   36:aload_0         
	//   21   37:lload           4
	//   22   39:putfield        #59  <Field long j>
		d = s3;
	//   23   42:aload_0         
	//   24   43:aload           6
	//   25   45:putfield        #61  <Field String d>
		e = l2;
	//   26   48:aload_0         
	//   27   49:lload           7
	//   28   51:putfield        #63  <Field long e>
		f = l3;
	//   29   54:aload_0         
	//   30   55:lload           9
	//   31   57:putfield        #65  <Field long f>
		g = s4;
	//   32   60:aload_0         
	//   33   61:aload           11
	//   34   63:putfield        #67  <Field String g>
		h = flag;
	//   35   66:aload_0         
	//   36   67:iload           12
	//   37   69:putfield        #69  <Field boolean h>
		i = flag1;
	//   38   72:aload_0         
	//   39   73:iload           13
	//   40   75:putfield        #71  <Field boolean i>
		k = s5;
	//   41   78:aload_0         
	//   42   79:aload           14
	//   43   81:putfield        #73  <Field String k>
		l = l4;
	//   44   84:aload_0         
	//   45   85:lload           15
	//   46   87:putfield        #75  <Field long l>
		m = l5;
	//   47   90:aload_0         
	//   48   91:lload           17
	//   49   93:putfield        #77  <Field long m>
		n = i1;
	//   50   96:aload_0         
	//   51   97:iload           19
	//   52   99:putfield        #79  <Field int n>
		o = flag2;
	//   53  102:aload_0         
	//   54  103:iload           20
	//   55  105:putfield        #81  <Field boolean o>
		p = flag3;
	//   56  108:aload_0         
	//   57  109:iload           21
	//   58  111:putfield        #83  <Field boolean p>
		q = flag4;
	//   59  114:aload_0         
	//   60  115:iload           22
	//   61  117:putfield        #85  <Field boolean q>
		r = s6;
	//   62  120:aload_0         
	//   63  121:aload           23
	//   64  123:putfield        #87  <Field String r>
	//   65  126:return          
	}

	zzk(String s, String s1, String s2, String s3, long l1, long l2, String s4, boolean flag, boolean flag1, long l3, String s5, 
			long l4, long l5, int i1, boolean flag2, boolean flag3, 
			boolean flag4, String s6)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #55  <Field String b>
		c = s2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #57  <Field String c>
		j = l3;
	//   11   19:aload_0         
	//   12   20:lload           12
	//   13   22:putfield        #59  <Field long j>
		d = s3;
	//   14   25:aload_0         
	//   15   26:aload           4
	//   16   28:putfield        #61  <Field String d>
		e = l1;
	//   17   31:aload_0         
	//   18   32:lload           5
	//   19   34:putfield        #63  <Field long e>
		f = l2;
	//   20   37:aload_0         
	//   21   38:lload           7
	//   22   40:putfield        #65  <Field long f>
		g = s4;
	//   23   43:aload_0         
	//   24   44:aload           9
	//   25   46:putfield        #67  <Field String g>
		h = flag;
	//   26   49:aload_0         
	//   27   50:iload           10
	//   28   52:putfield        #69  <Field boolean h>
		i = flag1;
	//   29   55:aload_0         
	//   30   56:iload           11
	//   31   58:putfield        #71  <Field boolean i>
		k = s5;
	//   32   61:aload_0         
	//   33   62:aload           14
	//   34   64:putfield        #73  <Field String k>
		l = l4;
	//   35   67:aload_0         
	//   36   68:lload           15
	//   37   70:putfield        #75  <Field long l>
		m = l5;
	//   38   73:aload_0         
	//   39   74:lload           17
	//   40   76:putfield        #77  <Field long m>
		n = i1;
	//   41   79:aload_0         
	//   42   80:iload           19
	//   43   82:putfield        #79  <Field int n>
		o = flag2;
	//   44   85:aload_0         
	//   45   86:iload           20
	//   46   88:putfield        #81  <Field boolean o>
		p = flag3;
	//   47   91:aload_0         
	//   48   92:iload           21
	//   49   94:putfield        #83  <Field boolean p>
		q = flag4;
	//   50   97:aload_0         
	//   51   98:iload           22
	//   52  100:putfield        #85  <Field boolean q>
		r = s6;
	//   53  103:aload_0         
	//   54  104:aload           23
	//   55  106:putfield        #87  <Field String r>
	//   56  109:return          
	}

	public final void writeToParcel(Parcel parcel, int i1)
	{
		i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #95  <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #98  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #55  <Field String b>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #98  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c, false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #57  <Field String c>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #98  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d, false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:getfield        #61  <Field String d>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #98  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e);
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:getfield        #63  <Field long e>
	//   31   52:invokestatic    #101 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f);
	//   32   55:aload_1         
	//   33   56:bipush          7
	//   34   58:aload_0         
	//   35   59:getfield        #65  <Field long f>
	//   36   62:invokestatic    #101 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, g, false);
	//   37   65:aload_1         
	//   38   66:bipush          8
	//   39   68:aload_0         
	//   40   69:getfield        #67  <Field String g>
	//   41   72:iconst_0        
	//   42   73:invokestatic    #98  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h);
	//   43   76:aload_1         
	//   44   77:bipush          9
	//   45   79:aload_0         
	//   46   80:getfield        #69  <Field boolean h>
	//   47   83:invokestatic    #104 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, i);
	//   48   86:aload_1         
	//   49   87:bipush          10
	//   50   89:aload_0         
	//   51   90:getfield        #71  <Field boolean i>
	//   52   93:invokestatic    #104 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, j);
	//   53   96:aload_1         
	//   54   97:bipush          11
	//   55   99:aload_0         
	//   56  100:getfield        #59  <Field long j>
	//   57  103:invokestatic    #101 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, k, false);
	//   58  106:aload_1         
	//   59  107:bipush          12
	//   60  109:aload_0         
	//   61  110:getfield        #73  <Field String k>
	//   62  113:iconst_0        
	//   63  114:invokestatic    #98  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, l);
	//   64  117:aload_1         
	//   65  118:bipush          13
	//   66  120:aload_0         
	//   67  121:getfield        #75  <Field long l>
	//   68  124:invokestatic    #101 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, m);
	//   69  127:aload_1         
	//   70  128:bipush          14
	//   71  130:aload_0         
	//   72  131:getfield        #77  <Field long m>
	//   73  134:invokestatic    #101 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, n);
	//   74  137:aload_1         
	//   75  138:bipush          15
	//   76  140:aload_0         
	//   77  141:getfield        #79  <Field int n>
	//   78  144:invokestatic    #107 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, o);
	//   79  147:aload_1         
	//   80  148:bipush          16
	//   81  150:aload_0         
	//   82  151:getfield        #81  <Field boolean o>
	//   83  154:invokestatic    #104 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, p);
	//   84  157:aload_1         
	//   85  158:bipush          17
	//   86  160:aload_0         
	//   87  161:getfield        #83  <Field boolean p>
	//   88  164:invokestatic    #104 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, q);
	//   89  167:aload_1         
	//   90  168:bipush          18
	//   91  170:aload_0         
	//   92  171:getfield        #85  <Field boolean q>
	//   93  174:invokestatic    #104 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, r, false);
	//   94  177:aload_1         
	//   95  178:bipush          19
	//   96  180:aload_0         
	//   97  181:getfield        #87  <Field String r>
	//   98  184:iconst_0        
	//   99  185:invokestatic    #98  <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//  100  188:aload_1         
	//  101  189:iload_2         
	//  102  190:invokestatic    #109 <Method void c.a(Parcel, int)>
	//  103  193:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new es();
	public final String a;
	public final String b;
	public final String c;
	public final String d;
	public final long e;
	public final long f;
	public final String g;
	public final boolean h;
	public final boolean i;
	public final long j;
	public final String k;
	public final long l;
	public final long m;
	public final int n;
	public final boolean o;
	public final boolean p;
	public final boolean q;
	public final String r;

	static 
	{
	//    0    0:new             #32  <Class es>
	//    1    3:dup             
	//    2    4:invokespecial   #35  <Method void es()>
	//    3    7:putstatic       #37  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
