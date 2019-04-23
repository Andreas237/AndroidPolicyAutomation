// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.stats:
//			StatsEvent, b

public final class WakeLockEvent extends StatsEvent
{

	WakeLockEvent(int i1, long l1, int j1, String s, int k1, List list, 
			String s1, long l2, int i2, String s2, String s3, float f1, 
			long l3, String s4)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void StatsEvent()>
		a = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #40  <Field int a>
		b = l1;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #42  <Field long b>
		c = j1;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #44  <Field int c>
		d = s;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #46  <Field String d>
		e = s2;
	//   14   26:aload_0         
	//   15   27:aload           12
	//   16   29:putfield        #48  <Field String e>
		f = s4;
	//   17   32:aload_0         
	//   18   33:aload           17
	//   19   35:putfield        #50  <Field String f>
		g = k1;
	//   20   38:aload_0         
	//   21   39:iload           6
	//   22   41:putfield        #52  <Field int g>
		o = -1L;
	//   23   44:aload_0         
	//   24   45:ldc2w           #53  <Long -1L>
	//   25   48:putfield        #56  <Field long o>
		h = list;
	//   26   51:aload_0         
	//   27   52:aload           7
	//   28   54:putfield        #58  <Field List h>
		i = s1;
	//   29   57:aload_0         
	//   30   58:aload           8
	//   31   60:putfield        #60  <Field String i>
		j = l2;
	//   32   63:aload_0         
	//   33   64:lload           9
	//   34   66:putfield        #62  <Field long j>
		k = i2;
	//   35   69:aload_0         
	//   36   70:iload           11
	//   37   72:putfield        #64  <Field int k>
		l = s3;
	//   38   75:aload_0         
	//   39   76:aload           13
	//   40   78:putfield        #66  <Field String l>
		m = f1;
	//   41   81:aload_0         
	//   42   82:fload           14
	//   43   84:putfield        #68  <Field float m>
		n = l3;
	//   44   87:aload_0         
	//   45   88:lload           15
	//   46   90:putfield        #70  <Field long n>
	//   47   93:return          
	}

	public final long a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field long b>
	//    2    4:lreturn         
	}

	public final int b()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field int c>
	//    2    4:ireturn         
	}

	public final long c()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field long o>
	//    2    4:lreturn         
	}

	public final String d()
	{
		String s3 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String d>
	//    2    4:astore          9
		int i1 = g;
	//    3    6:aload_0         
	//    4    7:getfield        #52  <Field int g>
	//    5   10:istore_2        
		Object obj = ((Object) (h));
	//    6   11:aload_0         
	//    7   12:getfield        #58  <Field List h>
	//    8   15:astore          4
		if(obj == null)
	//*   9   17:aload           4
	//*  10   19:ifnonnull       29
			obj = "";
	//   11   22:ldc1            #75  <String "">
	//   12   24:astore          4
		else
	//*  13   26:goto            38
			obj = ((Object) (TextUtils.join(",", ((Iterable) (obj)))));
	//   14   29:ldc1            #77  <String ",">
	//   15   31:aload           4
	//   16   33:invokestatic    #83  <Method String TextUtils.join(CharSequence, Iterable)>
	//   17   36:astore          4
		int j1 = k;
	//   18   38:aload_0         
	//   19   39:getfield        #64  <Field int k>
	//   20   42:istore_3        
		String s1 = e;
	//   21   43:aload_0         
	//   22   44:getfield        #48  <Field String e>
	//   23   47:astore          6
		String s = s1;
	//   24   49:aload           6
	//   25   51:astore          5
		if(s1 == null)
	//*  26   53:aload           6
	//*  27   55:ifnonnull       62
			s = "";
	//   28   58:ldc1            #75  <String "">
	//   29   60:astore          5
		String s2 = l;
	//   30   62:aload_0         
	//   31   63:getfield        #66  <Field String l>
	//   32   66:astore          7
		s1 = s2;
	//   33   68:aload           7
	//   34   70:astore          6
		if(s2 == null)
	//*  35   72:aload           7
	//*  36   74:ifnonnull       81
			s1 = "";
	//   37   77:ldc1            #75  <String "">
	//   38   79:astore          6
		float f1 = m;
	//   39   81:aload_0         
	//   40   82:getfield        #68  <Field float m>
	//   41   85:fstore_1        
		Object obj1 = ((Object) (f));
	//   42   86:aload_0         
	//   43   87:getfield        #50  <Field String f>
	//   44   90:astore          8
		s2 = ((String) (obj1));
	//   45   92:aload           8
	//   46   94:astore          7
		if(obj1 == null)
	//*  47   96:aload           8
	//*  48   98:ifnonnull       105
			s2 = "";
	//   49  101:ldc1            #75  <String "">
	//   50  103:astore          7
		obj1 = ((Object) (new StringBuilder(String.valueOf(((Object) (s3))).length() + 45 + String.valueOf(obj).length() + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length())));
	//   51  105:new             #85  <Class StringBuilder>
	//   52  108:dup             
	//   53  109:aload           9
	//   54  111:invokestatic    #91  <Method String String.valueOf(Object)>
	//   55  114:invokevirtual   #94  <Method int String.length()>
	//   56  117:bipush          45
	//   57  119:iadd            
	//   58  120:aload           4
	//   59  122:invokestatic    #91  <Method String String.valueOf(Object)>
	//   60  125:invokevirtual   #94  <Method int String.length()>
	//   61  128:iadd            
	//   62  129:aload           5
	//   63  131:invokestatic    #91  <Method String String.valueOf(Object)>
	//   64  134:invokevirtual   #94  <Method int String.length()>
	//   65  137:iadd            
	//   66  138:aload           6
	//   67  140:invokestatic    #91  <Method String String.valueOf(Object)>
	//   68  143:invokevirtual   #94  <Method int String.length()>
	//   69  146:iadd            
	//   70  147:aload           7
	//   71  149:invokestatic    #91  <Method String String.valueOf(Object)>
	//   72  152:invokevirtual   #94  <Method int String.length()>
	//   73  155:iadd            
	//   74  156:invokespecial   #97  <Method void StringBuilder(int)>
	//   75  159:astore          8
		((StringBuilder) (obj1)).append("\t");
	//   76  161:aload           8
	//   77  163:ldc1            #99  <String "\t">
	//   78  165:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   79  168:pop             
		((StringBuilder) (obj1)).append(s3);
	//   80  169:aload           8
	//   81  171:aload           9
	//   82  173:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   83  176:pop             
		((StringBuilder) (obj1)).append("\t");
	//   84  177:aload           8
	//   85  179:ldc1            #99  <String "\t">
	//   86  181:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   87  184:pop             
		((StringBuilder) (obj1)).append(i1);
	//   88  185:aload           8
	//   89  187:iload_2         
	//   90  188:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//   91  191:pop             
		((StringBuilder) (obj1)).append("\t");
	//   92  192:aload           8
	//   93  194:ldc1            #99  <String "\t">
	//   94  196:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   95  199:pop             
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   96  200:aload           8
	//   97  202:aload           4
	//   98  204:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   99  207:pop             
		((StringBuilder) (obj1)).append("\t");
	//  100  208:aload           8
	//  101  210:ldc1            #99  <String "\t">
	//  102  212:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  103  215:pop             
		((StringBuilder) (obj1)).append(j1);
	//  104  216:aload           8
	//  105  218:iload_3         
	//  106  219:invokevirtual   #106 <Method StringBuilder StringBuilder.append(int)>
	//  107  222:pop             
		((StringBuilder) (obj1)).append("\t");
	//  108  223:aload           8
	//  109  225:ldc1            #99  <String "\t">
	//  110  227:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  111  230:pop             
		((StringBuilder) (obj1)).append(s);
	//  112  231:aload           8
	//  113  233:aload           5
	//  114  235:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  115  238:pop             
		((StringBuilder) (obj1)).append("\t");
	//  116  239:aload           8
	//  117  241:ldc1            #99  <String "\t">
	//  118  243:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  119  246:pop             
		((StringBuilder) (obj1)).append(s1);
	//  120  247:aload           8
	//  121  249:aload           6
	//  122  251:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  123  254:pop             
		((StringBuilder) (obj1)).append("\t");
	//  124  255:aload           8
	//  125  257:ldc1            #99  <String "\t">
	//  126  259:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  127  262:pop             
		((StringBuilder) (obj1)).append(f1);
	//  128  263:aload           8
	//  129  265:fload_1         
	//  130  266:invokevirtual   #109 <Method StringBuilder StringBuilder.append(float)>
	//  131  269:pop             
		((StringBuilder) (obj1)).append("\t");
	//  132  270:aload           8
	//  133  272:ldc1            #99  <String "\t">
	//  134  274:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  135  277:pop             
		((StringBuilder) (obj1)).append(s2);
	//  136  278:aload           8
	//  137  280:aload           7
	//  138  282:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  139  285:pop             
		return ((StringBuilder) (obj1)).toString();
	//  140  286:aload           8
	//  141  288:invokevirtual   #112 <Method String StringBuilder.toString()>
	//  142  291:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i1)
	{
		i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #119 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field int a>
	//    7   11:invokestatic    #122 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, ((StatsEvent)this).a());
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokevirtual   #124 <Method long StatsEvent.a()>
	//   12   20:invokestatic    #127 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d, false);
	//   13   23:aload_1         
	//   14   24:iconst_4        
	//   15   25:aload_0         
	//   16   26:getfield        #46  <Field String d>
	//   17   29:iconst_0        
	//   18   30:invokestatic    #130 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, g);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #52  <Field int g>
	//   23   39:invokestatic    #122 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 6, h, false);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #58  <Field List h>
	//   28   49:iconst_0        
	//   29   50:invokestatic    #133 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, j);
	//   30   53:aload_1         
	//   31   54:bipush          8
	//   32   56:aload_0         
	//   33   57:getfield        #62  <Field long j>
	//   34   60:invokestatic    #127 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, e, false);
	//   35   63:aload_1         
	//   36   64:bipush          10
	//   37   66:aload_0         
	//   38   67:getfield        #48  <Field String e>
	//   39   70:iconst_0        
	//   40   71:invokestatic    #130 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, ((StatsEvent)this).b());
	//   41   74:aload_1         
	//   42   75:bipush          11
	//   43   77:aload_0         
	//   44   78:invokevirtual   #135 <Method int StatsEvent.b()>
	//   45   81:invokestatic    #122 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, i, false);
	//   46   84:aload_1         
	//   47   85:bipush          12
	//   48   87:aload_0         
	//   49   88:getfield        #60  <Field String i>
	//   50   91:iconst_0        
	//   51   92:invokestatic    #130 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, l, false);
	//   52   95:aload_1         
	//   53   96:bipush          13
	//   54   98:aload_0         
	//   55   99:getfield        #66  <Field String l>
	//   56  102:iconst_0        
	//   57  103:invokestatic    #130 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, k);
	//   58  106:aload_1         
	//   59  107:bipush          14
	//   60  109:aload_0         
	//   61  110:getfield        #64  <Field int k>
	//   62  113:invokestatic    #122 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, m);
	//   63  116:aload_1         
	//   64  117:bipush          15
	//   65  119:aload_0         
	//   66  120:getfield        #68  <Field float m>
	//   67  123:invokestatic    #138 <Method void c.a(Parcel, int, float)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, n);
	//   68  126:aload_1         
	//   69  127:bipush          16
	//   70  129:aload_0         
	//   71  130:getfield        #70  <Field long n>
	//   72  133:invokestatic    #127 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, f, false);
	//   73  136:aload_1         
	//   74  137:bipush          17
	//   75  139:aload_0         
	//   76  140:getfield        #50  <Field String f>
	//   77  143:iconst_0        
	//   78  144:invokestatic    #130 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   79  147:aload_1         
	//   80  148:iload_2         
	//   81  149:invokestatic    #140 <Method void c.a(Parcel, int)>
	//   82  152:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new b();
	private final int a;
	private final long b;
	private int c;
	private final String d;
	private final String e;
	private final String f;
	private final int g;
	private final List h;
	private final String i;
	private final long j;
	private int k;
	private final String l;
	private final float m;
	private final long n;
	private long o;

	static 
	{
	//    0    0:new             #30  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void b()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
