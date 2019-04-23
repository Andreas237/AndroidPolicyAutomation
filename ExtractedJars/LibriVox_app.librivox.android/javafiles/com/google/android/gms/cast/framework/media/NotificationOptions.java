// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.media;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;

// Referenced classes of package com.google.android.gms.cast.framework.media:
//			aq, ai, aj

public class NotificationOptions extends AbstractSafeParcelable
{

	public NotificationOptions(List list, int ai1[], long l1, String s1, int i1, int j1, 
			int k1, int i2, int j2, int k2, int l2, int i3, int j3, 
			int k3, int l3, int i4, int j4, int k4, int l4, int i5, 
			int j5, int k5, int l5, int i6, int j6, int k6, int l6, 
			int i7, int j7, int k7, int l7, IBinder ibinder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void AbstractSafeParcelable()>
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore          34
		if(list != null)
	//*   4    7:aload_1         
	//*   5    8:ifnull          26
			c = ((List) (new ArrayList(((java.util.Collection) (list)))));
	//    6   11:aload_0         
	//    7   12:new             #76  <Class ArrayList>
	//    8   15:dup             
	//    9   16:aload_1         
	//   10   17:invokespecial   #79  <Method void ArrayList(java.util.Collection)>
	//   11   20:putfield        #81  <Field List c>
		else
	//*  12   23:goto            31
			c = null;
	//   13   26:aload_0         
	//   14   27:aconst_null     
	//   15   28:putfield        #81  <Field List c>
		if(ai1 != null)
	//*  16   31:aload_2         
	//*  17   32:ifnull          48
			d = Arrays.copyOf(ai1, ai1.length);
	//   18   35:aload_0         
	//   19   36:aload_2         
	//   20   37:aload_2         
	//   21   38:arraylength     
	//   22   39:invokestatic    #85  <Method int[] Arrays.copyOf(int[], int)>
	//   23   42:putfield        #87  <Field int[] d>
		else
	//*  24   45:goto            53
			d = null;
	//   25   48:aload_0         
	//   26   49:aconst_null     
	//   27   50:putfield        #87  <Field int[] d>
		e = l1;
	//   28   53:aload_0         
	//   29   54:lload_3         
	//   30   55:putfield        #89  <Field long e>
		f = s1;
	//   31   58:aload_0         
	//   32   59:aload           5
	//   33   61:putfield        #91  <Field String f>
		g = i1;
	//   34   64:aload_0         
	//   35   65:iload           6
	//   36   67:putfield        #93  <Field int g>
		h = j1;
	//   37   70:aload_0         
	//   38   71:iload           7
	//   39   73:putfield        #95  <Field int h>
		i = k1;
	//   40   76:aload_0         
	//   41   77:iload           8
	//   42   79:putfield        #97  <Field int i>
		j = i2;
	//   43   82:aload_0         
	//   44   83:iload           9
	//   45   85:putfield        #99  <Field int j>
		k = j2;
	//   46   88:aload_0         
	//   47   89:iload           10
	//   48   91:putfield        #101 <Field int k>
		l = k2;
	//   49   94:aload_0         
	//   50   95:iload           11
	//   51   97:putfield        #103 <Field int l>
		m = l2;
	//   52  100:aload_0         
	//   53  101:iload           12
	//   54  103:putfield        #105 <Field int m>
		n = i3;
	//   55  106:aload_0         
	//   56  107:iload           13
	//   57  109:putfield        #107 <Field int n>
		o = j3;
	//   58  112:aload_0         
	//   59  113:iload           14
	//   60  115:putfield        #109 <Field int o>
		p = k3;
	//   61  118:aload_0         
	//   62  119:iload           15
	//   63  121:putfield        #111 <Field int p>
		q = l3;
	//   64  124:aload_0         
	//   65  125:iload           16
	//   66  127:putfield        #113 <Field int q>
		r = i4;
	//   67  130:aload_0         
	//   68  131:iload           17
	//   69  133:putfield        #115 <Field int r>
		s = j4;
	//   70  136:aload_0         
	//   71  137:iload           18
	//   72  139:putfield        #117 <Field int s>
		t = k4;
	//   73  142:aload_0         
	//   74  143:iload           19
	//   75  145:putfield        #119 <Field int t>
		u = l4;
	//   76  148:aload_0         
	//   77  149:iload           20
	//   78  151:putfield        #121 <Field int u>
		v = i5;
	//   79  154:aload_0         
	//   80  155:iload           21
	//   81  157:putfield        #123 <Field int v>
		w = j5;
	//   82  160:aload_0         
	//   83  161:iload           22
	//   84  163:putfield        #125 <Field int w>
		x = k5;
	//   85  166:aload_0         
	//   86  167:iload           23
	//   87  169:putfield        #127 <Field int x>
		y = l5;
	//   88  172:aload_0         
	//   89  173:iload           24
	//   90  175:putfield        #129 <Field int y>
		z = i6;
	//   91  178:aload_0         
	//   92  179:iload           25
	//   93  181:putfield        #131 <Field int z>
		A = j6;
	//   94  184:aload_0         
	//   95  185:iload           26
	//   96  187:putfield        #133 <Field int A>
		B = k6;
	//   97  190:aload_0         
	//   98  191:iload           27
	//   99  193:putfield        #135 <Field int B>
		C = l6;
	//  100  196:aload_0         
	//  101  197:iload           28
	//  102  199:putfield        #137 <Field int C>
		D = i7;
	//  103  202:aload_0         
	//  104  203:iload           29
	//  105  205:putfield        #139 <Field int D>
		E = j7;
	//  106  208:aload_0         
	//  107  209:iload           30
	//  108  211:putfield        #141 <Field int E>
		F = k7;
	//  109  214:aload_0         
	//  110  215:iload           31
	//  111  217:putfield        #143 <Field int F>
		G = l7;
	//  112  220:aload_0         
	//  113  221:iload           32
	//  114  223:putfield        #145 <Field int G>
		if(ibinder == null)
	//* 115  226:aload           33
	//* 116  228:ifnonnull       237
		{
			list = ((List) (obj));
	//  117  231:aload           34
	//  118  233:astore_1        
		} else
	//* 119  234:goto            272
		{
			list = ((List) (ibinder.queryLocalInterface("com.google.android.gms.cast.framework.media.INotificationActionsProvider")));
	//  120  237:aload           33
	//  121  239:ldc1            #147 <String "com.google.android.gms.cast.framework.media.INotificationActionsProvider">
	//  122  241:invokeinterface #153 <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//  123  246:astore_1        
			if(list instanceof ai)
	//* 124  247:aload_1         
	//* 125  248:instanceof      #155 <Class ai>
	//* 126  251:ifeq            262
				list = ((List) ((ai)list));
	//  127  254:aload_1         
	//  128  255:checkcast       #155 <Class ai>
	//  129  258:astore_1        
			else
	//* 130  259:goto            272
				list = ((List) (new aj(ibinder)));
	//  131  262:new             #157 <Class aj>
	//  132  265:dup             
	//  133  266:aload           33
	//  134  268:invokespecial   #160 <Method void aj(IBinder)>
	//  135  271:astore_1        
		}
		H = ((ai) (list));
	//  136  272:aload_0         
	//  137  273:aload_1         
	//  138  274:putfield        #162 <Field ai H>
	//  139  277:return          
	}

	static List G()
	{
		return a;
	//    0    0:getstatic       #62  <Field List a>
	//    1    3:areturn         
	}

	static int[] H()
	{
		return b;
	//    0    0:getstatic       #64  <Field int[] b>
	//    1    3:areturn         
	}

	public final int A()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field int C>
	//    2    4:ireturn         
	}

	public final int B()
	{
		return D;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field int D>
	//    2    4:ireturn         
	}

	public final int C()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int E>
	//    2    4:ireturn         
	}

	public final int D()
	{
		return F;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field int F>
	//    2    4:ireturn         
	}

	public final int E()
	{
		return G;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field int G>
	//    2    4:ireturn         
	}

	public final ai F()
	{
		return H;
	//    0    0:aload_0         
	//    1    1:getfield        #162 <Field ai H>
	//    2    4:areturn         
	}

	public List a()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field List c>
	//    2    4:areturn         
	}

	public int[] b()
	{
		int ai1[] = d;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int[] d>
	//    2    4:astore_1        
		return Arrays.copyOf(ai1, ai1.length);
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:arraylength     
	//    6    8:invokestatic    #85  <Method int[] Arrays.copyOf(int[], int)>
	//    7   11:areturn         
	}

	public long c()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field long e>
	//    2    4:lreturn         
	}

	public String d()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field String f>
	//    2    4:areturn         
	}

	public int e()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int g>
	//    2    4:ireturn         
	}

	public int f()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int h>
	//    2    4:ireturn         
	}

	public int g()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field int i>
	//    2    4:ireturn         
	}

	public int h()
	{
		return j;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int j>
	//    2    4:ireturn         
	}

	public int i()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int k>
	//    2    4:ireturn         
	}

	public int j()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int l>
	//    2    4:ireturn         
	}

	public int k()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field int m>
	//    2    4:ireturn         
	}

	public int l()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field int n>
	//    2    4:ireturn         
	}

	public int m()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int o>
	//    2    4:ireturn         
	}

	public int n()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field int p>
	//    2    4:ireturn         
	}

	public int o()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int q>
	//    2    4:ireturn         
	}

	public int p()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #115 <Field int r>
	//    2    4:ireturn         
	}

	public int q()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field int s>
	//    2    4:ireturn         
	}

	public final int r()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int t>
	//    2    4:ireturn         
	}

	public int s()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field int u>
	//    2    4:ireturn         
	}

	public int t()
	{
		return v;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field int v>
	//    2    4:ireturn         
	}

	public final int u()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field int w>
	//    2    4:ireturn         
	}

	public final int v()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field int x>
	//    2    4:ireturn         
	}

	public final int w()
	{
		return y;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field int y>
	//    2    4:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #175 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 2, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #177 <Method List a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #180 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #182 <Method int[] b()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #185 <Method void c.a(Parcel, int, int[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, c());
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #187 <Method long c()>
	//   19   31:invokestatic    #190 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, d(), false);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:invokevirtual   #192 <Method String d()>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #195 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, e());
	//   26   44:aload_1         
	//   27   45:bipush          6
	//   28   47:aload_0         
	//   29   48:invokevirtual   #197 <Method int e()>
	//   30   51:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, f());
	//   31   54:aload_1         
	//   32   55:bipush          7
	//   33   57:aload_0         
	//   34   58:invokevirtual   #202 <Method int f()>
	//   35   61:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, g());
	//   36   64:aload_1         
	//   37   65:bipush          8
	//   38   67:aload_0         
	//   39   68:invokevirtual   #204 <Method int g()>
	//   40   71:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, h());
	//   41   74:aload_1         
	//   42   75:bipush          9
	//   43   77:aload_0         
	//   44   78:invokevirtual   #206 <Method int h()>
	//   45   81:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, i());
	//   46   84:aload_1         
	//   47   85:bipush          10
	//   48   87:aload_0         
	//   49   88:invokevirtual   #208 <Method int i()>
	//   50   91:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, j());
	//   51   94:aload_1         
	//   52   95:bipush          11
	//   53   97:aload_0         
	//   54   98:invokevirtual   #210 <Method int j()>
	//   55  101:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, k());
	//   56  104:aload_1         
	//   57  105:bipush          12
	//   58  107:aload_0         
	//   59  108:invokevirtual   #212 <Method int k()>
	//   60  111:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, l());
	//   61  114:aload_1         
	//   62  115:bipush          13
	//   63  117:aload_0         
	//   64  118:invokevirtual   #214 <Method int l()>
	//   65  121:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, m());
	//   66  124:aload_1         
	//   67  125:bipush          14
	//   68  127:aload_0         
	//   69  128:invokevirtual   #216 <Method int m()>
	//   70  131:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, n());
	//   71  134:aload_1         
	//   72  135:bipush          15
	//   73  137:aload_0         
	//   74  138:invokevirtual   #218 <Method int n()>
	//   75  141:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, o());
	//   76  144:aload_1         
	//   77  145:bipush          16
	//   78  147:aload_0         
	//   79  148:invokevirtual   #220 <Method int o()>
	//   80  151:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 17, p());
	//   81  154:aload_1         
	//   82  155:bipush          17
	//   83  157:aload_0         
	//   84  158:invokevirtual   #222 <Method int p()>
	//   85  161:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 18, q());
	//   86  164:aload_1         
	//   87  165:bipush          18
	//   88  167:aload_0         
	//   89  168:invokevirtual   #224 <Method int q()>
	//   90  171:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 19, t);
	//   91  174:aload_1         
	//   92  175:bipush          19
	//   93  177:aload_0         
	//   94  178:getfield        #119 <Field int t>
	//   95  181:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 20, s());
	//   96  184:aload_1         
	//   97  185:bipush          20
	//   98  187:aload_0         
	//   99  188:invokevirtual   #226 <Method int s()>
	//  100  191:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 21, t());
	//  101  194:aload_1         
	//  102  195:bipush          21
	//  103  197:aload_0         
	//  104  198:invokevirtual   #228 <Method int t()>
	//  105  201:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 22, w);
	//  106  204:aload_1         
	//  107  205:bipush          22
	//  108  207:aload_0         
	//  109  208:getfield        #125 <Field int w>
	//  110  211:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 23, x);
	//  111  214:aload_1         
	//  112  215:bipush          23
	//  113  217:aload_0         
	//  114  218:getfield        #127 <Field int x>
	//  115  221:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 24, y);
	//  116  224:aload_1         
	//  117  225:bipush          24
	//  118  227:aload_0         
	//  119  228:getfield        #129 <Field int y>
	//  120  231:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 25, z);
	//  121  234:aload_1         
	//  122  235:bipush          25
	//  123  237:aload_0         
	//  124  238:getfield        #131 <Field int z>
	//  125  241:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 26, A);
	//  126  244:aload_1         
	//  127  245:bipush          26
	//  128  247:aload_0         
	//  129  248:getfield        #133 <Field int A>
	//  130  251:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 27, B);
	//  131  254:aload_1         
	//  132  255:bipush          27
	//  133  257:aload_0         
	//  134  258:getfield        #135 <Field int B>
	//  135  261:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 28, C);
	//  136  264:aload_1         
	//  137  265:bipush          28
	//  138  267:aload_0         
	//  139  268:getfield        #137 <Field int C>
	//  140  271:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 29, D);
	//  141  274:aload_1         
	//  142  275:bipush          29
	//  143  277:aload_0         
	//  144  278:getfield        #139 <Field int D>
	//  145  281:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 30, E);
	//  146  284:aload_1         
	//  147  285:bipush          30
	//  148  287:aload_0         
	//  149  288:getfield        #141 <Field int E>
	//  150  291:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 31, F);
	//  151  294:aload_1         
	//  152  295:bipush          31
	//  153  297:aload_0         
	//  154  298:getfield        #143 <Field int F>
	//  155  301:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 32, G);
	//  156  304:aload_1         
	//  157  305:bipush          32
	//  158  307:aload_0         
	//  159  308:getfield        #145 <Field int G>
	//  160  311:invokestatic    #200 <Method void c.a(Parcel, int, int)>
		Object obj = ((Object) (H));
	//  161  314:aload_0         
	//  162  315:getfield        #162 <Field ai H>
	//  163  318:astore_3        
		if(obj == null)
	//* 164  319:aload_3         
	//* 165  320:ifnonnull       328
			obj = null;
	//  166  323:aconst_null     
	//  167  324:astore_3        
		else
	//* 168  325:goto            335
			obj = ((Object) (((ai) (obj)).asBinder()));
	//  169  328:aload_3         
	//  170  329:invokeinterface #232 <Method IBinder ai.asBinder()>
	//  171  334:astore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 33, ((IBinder) (obj)), false);
	//  172  335:aload_1         
	//  173  336:bipush          33
	//  174  338:aload_3         
	//  175  339:iconst_0        
	//  176  340:invokestatic    #235 <Method void c.a(Parcel, int, IBinder, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//  177  343:aload_1         
	//  178  344:iload_2         
	//  179  345:invokestatic    #237 <Method void c.a(Parcel, int)>
	//  180  348:return          
	}

	public final int x()
	{
		return z;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int z>
	//    2    4:ireturn         
	}

	public final int y()
	{
		return A;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int A>
	//    2    4:ireturn         
	}

	public final int z()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field int B>
	//    2    4:ireturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new aq();
	private static final List a = Arrays.asList(((Object []) (new String[] {
		"com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK", "com.google.android.gms.cast.framework.action.STOP_CASTING"
	})));
	private static final int b[] = {
		0, 1
	};
	private final int A;
	private final int B;
	private final int C;
	private final int D;
	private final int E;
	private final int F;
	private final int G;
	private final ai H;
	private final List c;
	private final int d[];
	private final long e;
	private final String f;
	private final int g;
	private final int h;
	private final int i;
	private final int j;
	private final int k;
	private final int l;
	private final int m;
	private final int n;
	private final int o;
	private final int p;
	private final int q;
	private final int r;
	private final int s;
	private final int t;
	private final int u;
	private final int v;
	private final int w;
	private final int x;
	private final int y;
	private final int z;

	static 
	{
	//    0    0:iconst_2        
	//    1    1:anewarray       String[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:ldc1            #52  <String "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK">
	//    5    8:aastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #54  <String "com.google.android.gms.cast.framework.action.STOP_CASTING">
	//    9   13:aastore         
	//   10   14:invokestatic    #60  <Method List Arrays.asList(Object[])>
	//   11   17:putstatic       #62  <Field List a>
	//   12   20:iconst_2        
	//   13   21:newarray        int[]
	//   14   23:dup             
	//   15   24:iconst_0        
	//   16   25:iconst_0        
	//   17   26:iastore         
	//   18   27:dup             
	//   19   28:iconst_1        
	//   20   29:iconst_1        
	//   21   30:iastore         
	//   22   31:putstatic       #64  <Field int[] b>
	//   23   34:new             #66  <Class aq>
	//   24   37:dup             
	//   25   38:invokespecial   #69  <Method void aq()>
	//   26   41:putstatic       #71  <Field android.os.Parcelable$Creator CREATOR>
	//*  27   44:return          
	}
}
