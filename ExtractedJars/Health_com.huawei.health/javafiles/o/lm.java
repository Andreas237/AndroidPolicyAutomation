// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.DashPathEffect;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package o:
//			lj, li, oc, oa, 
//			nr

public class lm extends lj
{
	public static final class a extends Enum
	{

		public static a valueOf(String s1)
		{
			return (a)Enum.valueOf(o/lm$a, s1);
		//    0    0:ldc1            #2   <Class lm$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #41  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lm$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) (e)).clone();
		//    0    0:getstatic       #33  <Field lm$a[] e>
		//    1    3:invokevirtual   #48  <Method Object _5B_Lo.lm$a_3B_.clone()>
		//    2    6:checkcast       #44  <Class lm$a[]>
		//    3    9:areturn         
		}

		public static final a a;
		public static final a c;
		public static final a d;
		private static final a e[];

		static 
		{
			d = new a("LEFT", 0);
		//    0    0:new             #2   <Class lm$a>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "LEFT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void lm$a(String, int)>
		//    5   10:putstatic       #23  <Field lm$a d>
			c = new a("CENTER", 1);
		//    6   13:new             #2   <Class lm$a>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "CENTER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void lm$a(String, int)>
		//   11   23:putstatic       #27  <Field lm$a c>
			a = new a("RIGHT", 2);
		//   12   26:new             #2   <Class lm$a>
		//   13   29:dup             
		//   14   30:ldc1            #29  <String "RIGHT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #21  <Method void lm$a(String, int)>
		//   17   36:putstatic       #31  <Field lm$a a>
			e = (new a[] {
				d, c, a
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       a[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #23  <Field lm$a d>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #27  <Field lm$a c>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #31  <Field lm$a a>
		//   31   60:aastore         
		//   32   61:putstatic       #33  <Field lm$a[] e>
		//*  33   64:return          
		}

		private a(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #35  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class b extends Enum
	{

		public static b valueOf(String s1)
		{
			return (b)Enum.valueOf(o/lm$b, s1);
		//    0    0:ldc1            #2   <Class lm$b>
		//    1    2:aload_0         
		//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lm$b>
		//    4    9:areturn         
		}

		public static b[] values()
		{
			return (b[])((b []) (c)).clone();
		//    0    0:getstatic       #28  <Field lm$b[] c>
		//    1    3:invokevirtual   #43  <Method Object _5B_Lo.lm$b_3B_.clone()>
		//    2    6:checkcast       #39  <Class lm$b[]>
		//    3    9:areturn         
		}

		public static final b b;
		private static final b c[];
		public static final b e;

		static 
		{
			e = new b("LEFT_TO_RIGHT", 0);
		//    0    0:new             #2   <Class lm$b>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "LEFT_TO_RIGHT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void lm$b(String, int)>
		//    5   10:putstatic       #22  <Field lm$b e>
			b = new b("RIGHT_TO_LEFT", 1);
		//    6   13:new             #2   <Class lm$b>
		//    7   16:dup             
		//    8   17:ldc1            #24  <String "RIGHT_TO_LEFT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void lm$b(String, int)>
		//   11   23:putstatic       #26  <Field lm$b b>
			c = (new b[] {
				e, b
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       b[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field lm$b e>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #26  <Field lm$b b>
		//   21   41:aastore         
		//   22   42:putstatic       #28  <Field lm$b[] c>
		//*  23   45:return          
		}

		private b(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #30  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class c extends Enum
	{

		public static c valueOf(String s1)
		{
			return (c)Enum.valueOf(o/lm$c, s1);
		//    0    0:ldc1            #2   <Class lm$c>
		//    1    2:aload_0         
		//    2    3:invokestatic    #56  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lm$c>
		//    4    9:areturn         
		}

		public static c[] values()
		{
			return (c[])((c []) (k)).clone();
		//    0    0:getstatic       #48  <Field lm$c[] k>
		//    1    3:invokevirtual   #63  <Method Object _5B_Lo.lm$c_3B_.clone()>
		//    2    6:checkcast       #59  <Class lm$c[]>
		//    3    9:areturn         
		}

		public static final c a;
		public static final c b;
		public static final c c;
		public static final c d;
		public static final c e;
		public static final c h;
		private static final c k[];

		static 
		{
			c = new c("NONE", 0);
		//    0    0:new             #2   <Class lm$c>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "NONE">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #24  <Method void lm$c(String, int)>
		//    5   10:putstatic       #26  <Field lm$c c>
			b = new c("EMPTY", 1);
		//    6   13:new             #2   <Class lm$c>
		//    7   16:dup             
		//    8   17:ldc1            #28  <String "EMPTY">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #24  <Method void lm$c(String, int)>
		//   11   23:putstatic       #30  <Field lm$c b>
			e = new c("DEFAULT", 2);
		//   12   26:new             #2   <Class lm$c>
		//   13   29:dup             
		//   14   30:ldc1            #32  <String "DEFAULT">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #24  <Method void lm$c(String, int)>
		//   17   36:putstatic       #34  <Field lm$c e>
			d = new c("SQUARE", 3);
		//   18   39:new             #2   <Class lm$c>
		//   19   42:dup             
		//   20   43:ldc1            #36  <String "SQUARE">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #24  <Method void lm$c(String, int)>
		//   23   49:putstatic       #38  <Field lm$c d>
			a = new c("CIRCLE", 4);
		//   24   52:new             #2   <Class lm$c>
		//   25   55:dup             
		//   26   56:ldc1            #40  <String "CIRCLE">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #24  <Method void lm$c(String, int)>
		//   29   62:putstatic       #42  <Field lm$c a>
			h = new c("LINE", 5);
		//   30   65:new             #2   <Class lm$c>
		//   31   68:dup             
		//   32   69:ldc1            #44  <String "LINE">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #24  <Method void lm$c(String, int)>
		//   35   75:putstatic       #46  <Field lm$c h>
			k = (new c[] {
				c, b, e, d, a, h
			});
		//   36   78:bipush          6
		//   37   80:anewarray       c[]
		//   38   83:dup             
		//   39   84:iconst_0        
		//   40   85:getstatic       #26  <Field lm$c c>
		//   41   88:aastore         
		//   42   89:dup             
		//   43   90:iconst_1        
		//   44   91:getstatic       #30  <Field lm$c b>
		//   45   94:aastore         
		//   46   95:dup             
		//   47   96:iconst_2        
		//   48   97:getstatic       #34  <Field lm$c e>
		//   49  100:aastore         
		//   50  101:dup             
		//   51  102:iconst_3        
		//   52  103:getstatic       #38  <Field lm$c d>
		//   53  106:aastore         
		//   54  107:dup             
		//   55  108:iconst_4        
		//   56  109:getstatic       #42  <Field lm$c a>
		//   57  112:aastore         
		//   58  113:dup             
		//   59  114:iconst_5        
		//   60  115:getstatic       #46  <Field lm$c h>
		//   61  118:aastore         
		//   62  119:putstatic       #48  <Field lm$c[] k>
		//*  63  122:return          
		}

		private c(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #50  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class d extends Enum
	{

		public static d valueOf(String s1)
		{
			return (d)Enum.valueOf(o/lm$d, s1);
		//    0    0:ldc1            #2   <Class lm$d>
		//    1    2:aload_0         
		//    2    3:invokestatic    #37  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lm$d>
		//    4    9:areturn         
		}

		public static d[] values()
		{
			return (d[])((d []) (a)).clone();
		//    0    0:getstatic       #29  <Field lm$d[] a>
		//    1    3:invokevirtual   #44  <Method Object _5B_Lo.lm$d_3B_.clone()>
		//    2    6:checkcast       #40  <Class lm$d[]>
		//    3    9:areturn         
		}

		private static final d a[];
		public static final d b;
		public static final d c;

		static 
		{
			c = new d("HORIZONTAL", 0);
		//    0    0:new             #2   <Class lm$d>
		//    1    3:dup             
		//    2    4:ldc1            #17  <String "HORIZONTAL">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #21  <Method void lm$d(String, int)>
		//    5   10:putstatic       #23  <Field lm$d c>
			b = new d("VERTICAL", 1);
		//    6   13:new             #2   <Class lm$d>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "VERTICAL">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #21  <Method void lm$d(String, int)>
		//   11   23:putstatic       #27  <Field lm$d b>
			a = (new d[] {
				c, b
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       d[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #23  <Field lm$d c>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #27  <Field lm$d b>
		//   21   41:aastore         
		//   22   42:putstatic       #29  <Field lm$d[] a>
		//*  23   45:return          
		}

		private d(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #31  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class e extends Enum
	{

		public static e valueOf(String s1)
		{
			return (e)Enum.valueOf(o/lm$e, s1);
		//    0    0:ldc1            #2   <Class lm$e>
		//    1    2:aload_0         
		//    2    3:invokestatic    #92  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lm$e>
		//    4    9:areturn         
		}

		public static e[] values()
		{
			return (e[])((e []) (n)).clone();
		//    0    0:getstatic       #84  <Field lm$e[] n>
		//    1    3:invokevirtual   #99  <Method Object _5B_Lo.lm$e_3B_.clone()>
		//    2    6:checkcast       #95  <Class lm$e[]>
		//    3    9:areturn         
		}

		public static final e a;
		public static final e b;
		public static final e c;
		public static final e d;
		public static final e e;
		public static final e f;
		public static final e g;
		public static final e h;
		public static final e i;
		public static final e k;
		public static final e m;
		private static final e n[];
		public static final e o;
		public static final e p;

		static 
		{
			b = new e("RIGHT_OF_CHART", 0);
		//    0    0:new             #2   <Class lm$e>
		//    1    3:dup             
		//    2    4:ldc1            #28  <String "RIGHT_OF_CHART">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #32  <Method void lm$e(String, int)>
		//    5   10:putstatic       #34  <Field lm$e b>
			e = new e("RIGHT_OF_CHART_CENTER", 1);
		//    6   13:new             #2   <Class lm$e>
		//    7   16:dup             
		//    8   17:ldc1            #36  <String "RIGHT_OF_CHART_CENTER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #32  <Method void lm$e(String, int)>
		//   11   23:putstatic       #38  <Field lm$e e>
			a = new e("RIGHT_OF_CHART_INSIDE", 2);
		//   12   26:new             #2   <Class lm$e>
		//   13   29:dup             
		//   14   30:ldc1            #40  <String "RIGHT_OF_CHART_INSIDE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #32  <Method void lm$e(String, int)>
		//   17   36:putstatic       #42  <Field lm$e a>
			c = new e("LEFT_OF_CHART", 3);
		//   18   39:new             #2   <Class lm$e>
		//   19   42:dup             
		//   20   43:ldc1            #44  <String "LEFT_OF_CHART">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #32  <Method void lm$e(String, int)>
		//   23   49:putstatic       #46  <Field lm$e c>
			d = new e("LEFT_OF_CHART_CENTER", 4);
		//   24   52:new             #2   <Class lm$e>
		//   25   55:dup             
		//   26   56:ldc1            #48  <String "LEFT_OF_CHART_CENTER">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #32  <Method void lm$e(String, int)>
		//   29   62:putstatic       #50  <Field lm$e d>
			k = new e("LEFT_OF_CHART_INSIDE", 5);
		//   30   65:new             #2   <Class lm$e>
		//   31   68:dup             
		//   32   69:ldc1            #52  <String "LEFT_OF_CHART_INSIDE">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #32  <Method void lm$e(String, int)>
		//   35   75:putstatic       #54  <Field lm$e k>
			h = new e("BELOW_CHART_LEFT", 6);
		//   36   78:new             #2   <Class lm$e>
		//   37   81:dup             
		//   38   82:ldc1            #56  <String "BELOW_CHART_LEFT">
		//   39   84:bipush          6
		//   40   86:invokespecial   #32  <Method void lm$e(String, int)>
		//   41   89:putstatic       #58  <Field lm$e h>
			g = new e("BELOW_CHART_RIGHT", 7);
		//   42   92:new             #2   <Class lm$e>
		//   43   95:dup             
		//   44   96:ldc1            #60  <String "BELOW_CHART_RIGHT">
		//   45   98:bipush          7
		//   46  100:invokespecial   #32  <Method void lm$e(String, int)>
		//   47  103:putstatic       #62  <Field lm$e g>
			i = new e("BELOW_CHART_CENTER", 8);
		//   48  106:new             #2   <Class lm$e>
		//   49  109:dup             
		//   50  110:ldc1            #64  <String "BELOW_CHART_CENTER">
		//   51  112:bipush          8
		//   52  114:invokespecial   #32  <Method void lm$e(String, int)>
		//   53  117:putstatic       #66  <Field lm$e i>
			f = new e("ABOVE_CHART_LEFT", 9);
		//   54  120:new             #2   <Class lm$e>
		//   55  123:dup             
		//   56  124:ldc1            #68  <String "ABOVE_CHART_LEFT">
		//   57  126:bipush          9
		//   58  128:invokespecial   #32  <Method void lm$e(String, int)>
		//   59  131:putstatic       #70  <Field lm$e f>
			p = new e("ABOVE_CHART_RIGHT", 10);
		//   60  134:new             #2   <Class lm$e>
		//   61  137:dup             
		//   62  138:ldc1            #72  <String "ABOVE_CHART_RIGHT">
		//   63  140:bipush          10
		//   64  142:invokespecial   #32  <Method void lm$e(String, int)>
		//   65  145:putstatic       #74  <Field lm$e p>
			o = new e("ABOVE_CHART_CENTER", 11);
		//   66  148:new             #2   <Class lm$e>
		//   67  151:dup             
		//   68  152:ldc1            #76  <String "ABOVE_CHART_CENTER">
		//   69  154:bipush          11
		//   70  156:invokespecial   #32  <Method void lm$e(String, int)>
		//   71  159:putstatic       #78  <Field lm$e o>
			m = new e("PIECHART_CENTER", 12);
		//   72  162:new             #2   <Class lm$e>
		//   73  165:dup             
		//   74  166:ldc1            #80  <String "PIECHART_CENTER">
		//   75  168:bipush          12
		//   76  170:invokespecial   #32  <Method void lm$e(String, int)>
		//   77  173:putstatic       #82  <Field lm$e m>
			n = (new e[] {
				b, e, a, c, d, k, h, g, i, f, 
				p, o, m
			});
		//   78  176:bipush          13
		//   79  178:anewarray       e[]
		//   80  181:dup             
		//   81  182:iconst_0        
		//   82  183:getstatic       #34  <Field lm$e b>
		//   83  186:aastore         
		//   84  187:dup             
		//   85  188:iconst_1        
		//   86  189:getstatic       #38  <Field lm$e e>
		//   87  192:aastore         
		//   88  193:dup             
		//   89  194:iconst_2        
		//   90  195:getstatic       #42  <Field lm$e a>
		//   91  198:aastore         
		//   92  199:dup             
		//   93  200:iconst_3        
		//   94  201:getstatic       #46  <Field lm$e c>
		//   95  204:aastore         
		//   96  205:dup             
		//   97  206:iconst_4        
		//   98  207:getstatic       #50  <Field lm$e d>
		//   99  210:aastore         
		//  100  211:dup             
		//  101  212:iconst_5        
		//  102  213:getstatic       #54  <Field lm$e k>
		//  103  216:aastore         
		//  104  217:dup             
		//  105  218:bipush          6
		//  106  220:getstatic       #58  <Field lm$e h>
		//  107  223:aastore         
		//  108  224:dup             
		//  109  225:bipush          7
		//  110  227:getstatic       #62  <Field lm$e g>
		//  111  230:aastore         
		//  112  231:dup             
		//  113  232:bipush          8
		//  114  234:getstatic       #66  <Field lm$e i>
		//  115  237:aastore         
		//  116  238:dup             
		//  117  239:bipush          9
		//  118  241:getstatic       #70  <Field lm$e f>
		//  119  244:aastore         
		//  120  245:dup             
		//  121  246:bipush          10
		//  122  248:getstatic       #74  <Field lm$e p>
		//  123  251:aastore         
		//  124  252:dup             
		//  125  253:bipush          11
		//  126  255:getstatic       #78  <Field lm$e o>
		//  127  258:aastore         
		//  128  259:dup             
		//  129  260:bipush          12
		//  130  262:getstatic       #82  <Field lm$e m>
		//  131  265:aastore         
		//  132  266:putstatic       #84  <Field lm$e[] n>
		//* 133  269:return          
		}

		private e(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #86  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}

	public static final class k extends Enum
	{

		public static k valueOf(String s1)
		{
			return (k)Enum.valueOf(o/lm$k, s1);
		//    0    0:ldc1            #2   <Class lm$k>
		//    1    2:aload_0         
		//    2    3:invokestatic    #42  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class lm$k>
		//    4    9:areturn         
		}

		public static k[] values()
		{
			return (k[])((k []) (a)).clone();
		//    0    0:getstatic       #34  <Field lm$k[] a>
		//    1    3:invokevirtual   #49  <Method Object _5B_Lo.lm$k_3B_.clone()>
		//    2    6:checkcast       #45  <Class lm$k[]>
		//    3    9:areturn         
		}

		private static final k a[];
		public static final k b;
		public static final k c;
		public static final k d;

		static 
		{
			c = new k("TOP", 0);
		//    0    0:new             #2   <Class lm$k>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "TOP">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void lm$k(String, int)>
		//    5   10:putstatic       #24  <Field lm$k c>
			b = new k("CENTER", 1);
		//    6   13:new             #2   <Class lm$k>
		//    7   16:dup             
		//    8   17:ldc1            #26  <String "CENTER">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void lm$k(String, int)>
		//   11   23:putstatic       #28  <Field lm$k b>
			d = new k("BOTTOM", 2);
		//   12   26:new             #2   <Class lm$k>
		//   13   29:dup             
		//   14   30:ldc1            #30  <String "BOTTOM">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void lm$k(String, int)>
		//   17   36:putstatic       #32  <Field lm$k d>
			a = (new k[] {
				c, b, d
			});
		//   18   39:iconst_3        
		//   19   40:anewarray       k[]
		//   20   43:dup             
		//   21   44:iconst_0        
		//   22   45:getstatic       #24  <Field lm$k c>
		//   23   48:aastore         
		//   24   49:dup             
		//   25   50:iconst_1        
		//   26   51:getstatic       #28  <Field lm$k b>
		//   27   54:aastore         
		//   28   55:dup             
		//   29   56:iconst_2        
		//   30   57:getstatic       #32  <Field lm$k d>
		//   31   60:aastore         
		//   32   61:putstatic       #34  <Field lm$k[] a>
		//*  33   64:return          
		}

		private k(String s1, int i1)
		{
			super(s1, i1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #36  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public lm()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void lj()>
		b = new li[0];
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:anewarray       li[]
	//    5    9:putfield        #63  <Field li[] b>
		g = false;
	//    6   12:aload_0         
	//    7   13:iconst_0        
	//    8   14:putfield        #65  <Field boolean g>
		h = a.d;
	//    9   17:aload_0         
	//   10   18:getstatic       #67  <Field lm$a lm$a.d>
	//   11   21:putfield        #69  <Field lm$a h>
		k = k.d;
	//   12   24:aload_0         
	//   13   25:getstatic       #71  <Field lm$k lm$k.d>
	//   14   28:putfield        #73  <Field lm$k k>
		f = d.c;
	//   15   31:aload_0         
	//   16   32:getstatic       #75  <Field lm$d lm$d.c>
	//   17   35:putfield        #77  <Field lm$d f>
		n = false;
	//   18   38:aload_0         
	//   19   39:iconst_0        
	//   20   40:putfield        #79  <Field boolean n>
		m = b.e;
	//   21   43:aload_0         
	//   22   44:getstatic       #81  <Field lm$b lm$b.e>
	//   23   47:putfield        #83  <Field lm$b m>
		o = c.d;
	//   24   50:aload_0         
	//   25   51:getstatic       #85  <Field lm$c lm$c.d>
	//   26   54:putfield        #87  <Field lm$c o>
		l = 8F;
	//   27   57:aload_0         
	//   28   58:ldc1            #88  <Float 8F>
	//   29   60:putfield        #90  <Field float l>
		p = 3F;
	//   30   63:aload_0         
	//   31   64:ldc1            #91  <Float 3F>
	//   32   66:putfield        #93  <Field float p>
		r = null;
	//   33   69:aload_0         
	//   34   70:aconst_null     
	//   35   71:putfield        #95  <Field DashPathEffect r>
		u = 6F;
	//   36   74:aload_0         
	//   37   75:ldc1            #96  <Float 6F>
	//   38   77:putfield        #98  <Field float u>
		q = 0.0F;
	//   39   80:aload_0         
	//   40   81:fconst_0        
	//   41   82:putfield        #100 <Field float q>
		t = 5F;
	//   42   85:aload_0         
	//   43   86:ldc1            #101 <Float 5F>
	//   44   88:putfield        #103 <Field float t>
		s = 3F;
	//   45   91:aload_0         
	//   46   92:ldc1            #91  <Float 3F>
	//   47   94:putfield        #105 <Field float s>
		w = 0.95F;
	//   48   97:aload_0         
	//   49   98:ldc1            #106 <Float 0.95F>
	//   50  100:putfield        #108 <Field float w>
		c = 0.0F;
	//   51  103:aload_0         
	//   52  104:fconst_0        
	//   53  105:putfield        #110 <Field float c>
		d = 0.0F;
	//   54  108:aload_0         
	//   55  109:fconst_0        
	//   56  110:putfield        #112 <Field float d>
		e = 0.0F;
	//   57  113:aload_0         
	//   58  114:fconst_0        
	//   59  115:putfield        #114 <Field float e>
		a = 0.0F;
	//   60  118:aload_0         
	//   61  119:fconst_0        
	//   62  120:putfield        #116 <Field float a>
		j = false;
	//   63  123:aload_0         
	//   64  124:iconst_0        
	//   65  125:putfield        #118 <Field boolean j>
		C = ((List) (new ArrayList(16)));
	//   66  128:aload_0         
	//   67  129:new             #120 <Class ArrayList>
	//   68  132:dup             
	//   69  133:bipush          16
	//   70  135:invokespecial   #123 <Method void ArrayList(int)>
	//   71  138:putfield        #125 <Field List C>
		B = ((List) (new ArrayList(16)));
	//   72  141:aload_0         
	//   73  142:new             #120 <Class ArrayList>
	//   74  145:dup             
	//   75  146:bipush          16
	//   76  148:invokespecial   #123 <Method void ArrayList(int)>
	//   77  151:putfield        #127 <Field List B>
		E = ((List) (new ArrayList(16)));
	//   78  154:aload_0         
	//   79  155:new             #120 <Class ArrayList>
	//   80  158:dup             
	//   81  159:bipush          16
	//   82  161:invokespecial   #123 <Method void ArrayList(int)>
	//   83  164:putfield        #129 <Field List E>
		D = oc.b(10F);
	//   84  167:aload_0         
	//   85  168:ldc1            #130 <Float 10F>
	//   86  170:invokestatic    #135 <Method float oc.b(float)>
	//   87  173:putfield        #138 <Field float D>
		y = oc.b(5F);
	//   88  176:aload_0         
	//   89  177:ldc1            #101 <Float 5F>
	//   90  179:invokestatic    #135 <Method float oc.b(float)>
	//   91  182:putfield        #141 <Field float y>
		z = oc.b(3F);
	//   92  185:aload_0         
	//   93  186:ldc1            #91  <Float 3F>
	//   94  188:invokestatic    #135 <Method float oc.b(float)>
	//   95  191:putfield        #144 <Field float z>
	//   96  194:return          
	}

	public a a()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field lm$a h>
	//    2    4:areturn         
	}

	public void a(a a1)
	{
		h = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #69  <Field lm$a h>
	//    3    5:return          
	}

	public void b(List list)
	{
		b = (li[])list.toArray(((Object []) (new li[list.size()])));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokeinterface #154 <Method int List.size()>
	//    4    8:anewarray       li[]
	//    5   11:invokeinterface #158 <Method Object[] List.toArray(Object[])>
	//    6   16:checkcast       #159 <Class li[]>
	//    7   19:putfield        #63  <Field li[] b>
	//    8   22:return          
	}

	public void b(b b1)
	{
		m = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #83  <Field lm$b m>
	//    3    5:return          
	}

	public void b(d d1)
	{
		f = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #77  <Field lm$d f>
	//    3    5:return          
	}

	public boolean b()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field boolean g>
	//    2    4:ireturn         
	}

	public float c(Paint paint)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		float f2 = 0.0F;
	//    2    2:fconst_0        
	//    3    3:fstore_3        
		float f6 = oc.b(t);
	//    4    4:aload_0         
	//    5    5:getfield        #103 <Field float t>
	//    6    8:invokestatic    #135 <Method float oc.b(float)>
	//    7   11:fstore          6
		li ali[] = b;
	//    8   13:aload_0         
	//    9   14:getfield        #63  <Field li[] b>
	//   10   17:astore          9
		int j1 = ali.length;
	//   11   19:aload           9
	//   12   21:arraylength     
	//   13   22:istore          8
		for(int i1 = 0; i1 < j1;)
	//*  14   24:iconst_0        
	//*  15   25:istore          7
	//*  16   27:iload           7
	//*  17   29:iload           8
	//*  18   31:icmpge          141
		{
			Object obj = ((Object) (ali[i1]));
	//   19   34:aload           9
	//   20   36:iload           7
	//   21   38:aaload          
	//   22   39:astore          10
			float f3;
			if(Float.isNaN(((li) (obj)).e))
	//*  23   41:aload           10
	//*  24   43:getfield        #166 <Field float li.e>
	//*  25   46:invokestatic    #172 <Method boolean Float.isNaN(float)>
	//*  26   49:ifeq            61
				f3 = l;
	//   27   52:aload_0         
	//   28   53:getfield        #90  <Field float l>
	//   29   56:fstore          4
			else
	//*  30   58:goto            68
				f3 = ((li) (obj)).e;
	//   31   61:aload           10
	//   32   63:getfield        #166 <Field float li.e>
	//   33   66:fstore          4
			float f4 = oc.b(f3);
	//   34   68:fload           4
	//   35   70:invokestatic    #135 <Method float oc.b(float)>
	//   36   73:fstore          5
			f3 = f2;
	//   37   75:fload_3         
	//   38   76:fstore          4
			if(f4 > f2)
	//*  39   78:fload           5
	//*  40   80:fload_3         
	//*  41   81:fcmpl           
	//*  42   82:ifle            89
				f3 = f4;
	//   43   85:fload           5
	//   44   87:fstore          4
			obj = ((Object) (((li) (obj)).c));
	//   45   89:aload           10
	//   46   91:getfield        #175 <Field String li.c>
	//   47   94:astore          10
			if(obj == null)
	//*  48   96:aload           10
	//*  49   98:ifnonnull       106
			{
				f2 = f1;
	//   50  101:fload_2         
	//   51  102:fstore_3        
			} else
	//*  52  103:goto            127
			{
				float f5 = oc.d(paint, ((String) (obj)));
	//   53  106:aload_1         
	//   54  107:aload           10
	//   55  109:invokestatic    #178 <Method int oc.d(Paint, String)>
	//   56  112:i2f             
	//   57  113:fstore          5
				f2 = f1;
	//   58  115:fload_2         
	//   59  116:fstore_3        
				if(f5 > f1)
	//*  60  117:fload           5
	//*  61  119:fload_2         
	//*  62  120:fcmpl           
	//*  63  121:ifle            127
					f2 = f5;
	//   64  124:fload           5
	//   65  126:fstore_3        
			}
			i1++;
	//   66  127:iload           7
	//   67  129:iconst_1        
	//   68  130:iadd            
	//   69  131:istore          7
			f1 = f2;
	//   70  133:fload_3         
	//   71  134:fstore_2        
			f2 = f3;
	//   72  135:fload           4
	//   73  137:fstore_3        
		}

	//*  74  138:goto            27
		return f1 + f2 + f6;
	//   75  141:fload_2         
	//   76  142:fload_3         
	//   77  143:fadd            
	//   78  144:fload           6
	//   79  146:fadd            
	//   80  147:freturn         
	}

	public void c(Paint paint, oa oa1)
	{
		float f13;
		float f14;
		float f17;
		float f18;
		float f19;
		int j2;
		boolean flag3;
		li ali[];
		f14 = oc.b(l);
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field float l>
	//    2    4:invokestatic    #135 <Method float oc.b(float)>
	//    3    7:fstore          9
		f18 = oc.b(s);
	//    4    9:aload_0         
	//    5   10:getfield        #105 <Field float s>
	//    6   13:invokestatic    #135 <Method float oc.b(float)>
	//    7   16:fstore          12
		f19 = oc.b(t);
	//    8   18:aload_0         
	//    9   19:getfield        #103 <Field float t>
	//   10   22:invokestatic    #135 <Method float oc.b(float)>
	//   11   25:fstore          13
		f13 = oc.b(u);
	//   12   27:aload_0         
	//   13   28:getfield        #98  <Field float u>
	//   14   31:invokestatic    #135 <Method float oc.b(float)>
	//   15   34:fstore          8
		f17 = oc.b(q);
	//   16   36:aload_0         
	//   17   37:getfield        #100 <Field float q>
	//   18   40:invokestatic    #135 <Method float oc.b(float)>
	//   19   43:fstore          11
		flag3 = j;
	//   20   45:aload_0         
	//   21   46:getfield        #118 <Field boolean j>
	//   22   49:istore          21
		ali = b;
	//   23   51:aload_0         
	//   24   52:getfield        #63  <Field li[] b>
	//   25   55:astore          22
		j2 = ali.length;
	//   26   57:aload           22
	//   27   59:arraylength     
	//   28   60:istore          20
		a = c(paint);
	//   29   62:aload_0         
	//   30   63:aload_0         
	//   31   64:aload_1         
	//   32   65:invokevirtual   #181 <Method float c(Paint)>
	//   33   68:putfield        #116 <Field float a>
		e = e(paint);
	//   34   71:aload_0         
	//   35   72:aload_0         
	//   36   73:aload_1         
	//   37   74:invokevirtual   #183 <Method float e(Paint)>
	//   38   77:putfield        #114 <Field float e>
		static class _cls4
		{

			static final int a[];
			static final int e[];

			static 
			{
				a = new int[d.values().length];
			//    0    0:invokestatic    #19  <Method lm$d[] lm$d.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #21  <Field int[] a>
				try
				{
					a[d.b.ordinal()] = 1;
			//    4    9:getstatic       #21  <Field int[] a>
			//    5   12:getstatic       #25  <Field lm$d lm$d.b>
			//    6   15:invokevirtual   #29  <Method int lm$d.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					a[d.c.ordinal()] = 2;
			//   11   24:getstatic       #21  <Field int[] a>
			//   12   27:getstatic       #32  <Field lm$d lm$d.c>
			//   13   30:invokevirtual   #29  <Method int lm$d.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				e = new int[e.values().length];
			//   18   39:invokestatic    #37  <Method lm$e[] lm$e.values()>
			//   19   42:arraylength     
			//   20   43:newarray        int[]
			//   21   45:putstatic       #39  <Field int[] e>
				try
				{
					e[e.c.ordinal()] = 1;
			//   22   48:getstatic       #39  <Field int[] e>
			//   23   51:getstatic       #42  <Field lm$e lm$e.c>
			//   24   54:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   25   57:iconst_1        
			//   26   58:iastore         
				}
			//*  27   59:goto            63
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   28   62:astore_0        
				try
				{
					e[e.k.ordinal()] = 2;
			//   29   63:getstatic       #39  <Field int[] e>
			//   30   66:getstatic       #46  <Field lm$e lm$e.k>
			//   31   69:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   32   72:iconst_2        
			//   33   73:iastore         
				}
			//*  34   74:goto            78
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   35   77:astore_0        
				try
				{
					e[e.d.ordinal()] = 3;
			//   36   78:getstatic       #39  <Field int[] e>
			//   37   81:getstatic       #49  <Field lm$e lm$e.d>
			//   38   84:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   39   87:iconst_3        
			//   40   88:iastore         
				}
			//*  41   89:goto            93
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   42   92:astore_0        
				try
				{
					e[e.b.ordinal()] = 4;
			//   43   93:getstatic       #39  <Field int[] e>
			//   44   96:getstatic       #51  <Field lm$e lm$e.b>
			//   45   99:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   46  102:iconst_4        
			//   47  103:iastore         
				}
			//*  48  104:goto            108
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   49  107:astore_0        
				try
				{
					e[e.a.ordinal()] = 5;
			//   50  108:getstatic       #39  <Field int[] e>
			//   51  111:getstatic       #53  <Field lm$e lm$e.a>
			//   52  114:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   53  117:iconst_5        
			//   54  118:iastore         
				}
			//*  55  119:goto            123
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   56  122:astore_0        
				try
				{
					e[e.e.ordinal()] = 6;
			//   57  123:getstatic       #39  <Field int[] e>
			//   58  126:getstatic       #55  <Field lm$e lm$e.e>
			//   59  129:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   60  132:bipush          6
			//   61  134:iastore         
				}
			//*  62  135:goto            139
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   63  138:astore_0        
				try
				{
					e[e.f.ordinal()] = 7;
			//   64  139:getstatic       #39  <Field int[] e>
			//   65  142:getstatic       #58  <Field lm$e lm$e.f>
			//   66  145:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   67  148:bipush          7
			//   68  150:iastore         
				}
			//*  69  151:goto            155
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   70  154:astore_0        
				try
				{
					e[e.o.ordinal()] = 8;
			//   71  155:getstatic       #39  <Field int[] e>
			//   72  158:getstatic       #61  <Field lm$e lm$e.o>
			//   73  161:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   74  164:bipush          8
			//   75  166:iastore         
				}
			//*  76  167:goto            171
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   77  170:astore_0        
				try
				{
					e[e.p.ordinal()] = 9;
			//   78  171:getstatic       #39  <Field int[] e>
			//   79  174:getstatic       #64  <Field lm$e lm$e.p>
			//   80  177:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   81  180:bipush          9
			//   82  182:iastore         
				}
			//*  83  183:goto            187
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   84  186:astore_0        
				try
				{
					e[e.h.ordinal()] = 10;
			//   85  187:getstatic       #39  <Field int[] e>
			//   86  190:getstatic       #67  <Field lm$e lm$e.h>
			//   87  193:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   88  196:bipush          10
			//   89  198:iastore         
				}
			//*  90  199:goto            203
				catch(NoSuchFieldError nosuchfielderror11) { }
			//   91  202:astore_0        
				try
				{
					e[e.i.ordinal()] = 11;
			//   92  203:getstatic       #39  <Field int[] e>
			//   93  206:getstatic       #70  <Field lm$e lm$e.i>
			//   94  209:invokevirtual   #43  <Method int lm$e.ordinal()>
			//   95  212:bipush          11
			//   96  214:iastore         
				}
			//*  97  215:goto            219
				catch(NoSuchFieldError nosuchfielderror12) { }
			//   98  218:astore_0        
				try
				{
					e[e.g.ordinal()] = 12;
			//   99  219:getstatic       #39  <Field int[] e>
			//  100  222:getstatic       #73  <Field lm$e lm$e.g>
			//  101  225:invokevirtual   #43  <Method int lm$e.ordinal()>
			//  102  228:bipush          12
			//  103  230:iastore         
				}
			//* 104  231:goto            235
				catch(NoSuchFieldError nosuchfielderror13) { }
			//  105  234:astore_0        
				try
				{
					e[e.m.ordinal()] = 13;
			//  106  235:getstatic       #39  <Field int[] e>
			//  107  238:getstatic       #76  <Field lm$e lm$e.m>
			//  108  241:invokevirtual   #43  <Method int lm$e.ordinal()>
			//  109  244:bipush          13
			//  110  246:iastore         
			//  111  247:return          
				}
				catch(NoSuchFieldError nosuchfielderror14) { }
			//  112  248:astore_0        
			//* 113  249:return          
			}
		}

		_cls4.a[f.ordinal()];
	//   39   80:getstatic       #186 <Field int[] lm$4.a>
	//   40   83:aload_0         
	//   41   84:getfield        #77  <Field lm$d f>
	//   42   87:invokevirtual   #189 <Method int lm$d.ordinal()>
	//   43   90:iaload          
		JVM INSTR lookupswitch 2: default 116
	//	               1: 119
	//	               2: 466;
	//   44   91:lookupswitch    2: default 116
	//	               1: 119
	//	               2: 466
		   goto _L1 _L2 _L3
_L1:
		break; /* Loop/switch isn't completed */
	//   45  116:goto            1040
_L2:
		float f1 = 0.0F;
	//   46  119:fconst_0        
	//   47  120:fstore_3        
		float f6 = 0.0F;
	//   48  121:fconst_0        
	//   49  122:fstore          5
		float f4 = 0.0F;
	//   50  124:fconst_0        
	//   51  125:fstore          4
		float f20 = oc.a(paint);
	//   52  127:aload_1         
	//   53  128:invokestatic    #191 <Method float oc.a(Paint)>
	//   54  131:fstore          14
		boolean flag = false;
	//   55  133:iconst_0        
	//   56  134:istore          17
		for(int l1 = 0; l1 < j2;)
	//*  57  136:iconst_0        
	//*  58  137:istore          19
	//*  59  139:iload           19
	//*  60  141:iload           20
	//*  61  143:icmpge          452
		{
			oa1 = ((oa) (ali[l1]));
	//   62  146:aload           22
	//   63  148:iload           19
	//   64  150:aaload          
	//   65  151:astore_2        
			boolean flag1;
			if(((li) (oa1)).d != c.c)
	//*  66  152:aload_2         
	//*  67  153:getfield        #192 <Field lm$c li.d>
	//*  68  156:getstatic       #194 <Field lm$c lm$c.c>
	//*  69  159:if_acmpeq       168
				flag1 = true;
	//   70  162:iconst_1        
	//   71  163:istore          18
			else
	//*  72  165:goto            171
				flag1 = false;
	//   73  168:iconst_0        
	//   74  169:istore          18
			float f8;
			if(Float.isNaN(((li) (oa1)).e))
	//*  75  171:aload_2         
	//*  76  172:getfield        #166 <Field float li.e>
	//*  77  175:invokestatic    #172 <Method boolean Float.isNaN(float)>
	//*  78  178:ifeq            188
				f8 = f14;
	//   79  181:fload           9
	//   80  183:fstore          6
			else
	//*  81  185:goto            197
				f8 = oc.b(((li) (oa1)).e);
	//   82  188:aload_2         
	//   83  189:getfield        #166 <Field float li.e>
	//   84  192:invokestatic    #135 <Method float oc.b(float)>
	//   85  195:fstore          6
			oa1 = ((oa) (((li) (oa1)).c));
	//   86  197:aload_2         
	//   87  198:getfield        #175 <Field String li.c>
	//   88  201:astore_2        
			if(!flag)
	//*  89  202:iload           17
	//*  90  204:ifne            210
				f4 = 0.0F;
	//   91  207:fconst_0        
	//   92  208:fstore          4
			f13 = f4;
	//   93  210:fload           4
	//   94  212:fstore          8
			if(flag1)
	//*  95  214:iload           18
	//*  96  216:ifeq            242
			{
				float f10 = f4;
	//   97  219:fload           4
	//   98  221:fstore          7
				if(flag)
	//*  99  223:iload           17
	//* 100  225:ifeq            235
					f10 = f4 + f18;
	//  101  228:fload           4
	//  102  230:fload           12
	//  103  232:fadd            
	//  104  233:fstore          7
				f13 = f10 + f8;
	//  105  235:fload           7
	//  106  237:fload           6
	//  107  239:fadd            
	//  108  240:fstore          8
			}
			float f15;
			if(oa1 != null)
	//* 109  242:aload_2         
	//* 110  243:ifnull          379
			{
				float f11;
				if(flag1 && !flag)
	//* 111  246:iload           18
	//* 112  248:ifeq            277
	//* 113  251:iload           17
	//* 114  253:ifne            277
				{
					f4 = f13 + f19;
	//  115  256:fload           8
	//  116  258:fload           13
	//  117  260:fadd            
	//  118  261:fstore          4
					f8 = f1;
	//  119  263:fload_3         
	//  120  264:fstore          6
					f11 = f6;
	//  121  266:fload           5
	//  122  268:fstore          7
					flag1 = flag;
	//  123  270:iload           17
	//  124  272:istore          18
				} else
	//* 125  274:goto            321
				{
					f8 = f1;
	//  126  277:fload_3         
	//  127  278:fstore          6
					f11 = f6;
	//  128  280:fload           5
	//  129  282:fstore          7
					f4 = f13;
	//  130  284:fload           8
	//  131  286:fstore          4
					flag1 = flag;
	//  132  288:iload           17
	//  133  290:istore          18
					if(flag)
	//* 134  292:iload           17
	//* 135  294:ifeq            321
					{
						f8 = Math.max(f1, f13);
	//  136  297:fload_3         
	//  137  298:fload           8
	//  138  300:invokestatic    #200 <Method float Math.max(float, float)>
	//  139  303:fstore          6
						f11 = f6 + (f20 + f17);
	//  140  305:fload           5
	//  141  307:fload           14
	//  142  309:fload           11
	//  143  311:fadd            
	//  144  312:fadd            
	//  145  313:fstore          7
						f4 = 0.0F;
	//  146  315:fconst_0        
	//  147  316:fstore          4
						flag1 = false;
	//  148  318:iconst_0        
	//  149  319:istore          18
					}
				}
				f1 = f4 + (float)oc.d(paint, ((String) (oa1)));
	//  150  321:fload           4
	//  151  323:aload_1         
	//  152  324:aload_2         
	//  153  325:invokestatic    #178 <Method int oc.d(Paint, String)>
	//  154  328:i2f             
	//  155  329:fadd            
	//  156  330:fstore_3        
				f15 = f8;
	//  157  331:fload           6
	//  158  333:fstore          10
				f13 = f11;
	//  159  335:fload           7
	//  160  337:fstore          8
				f4 = f1;
	//  161  339:fload_3         
	//  162  340:fstore          4
				flag = flag1;
	//  163  342:iload           18
	//  164  344:istore          17
				if(l1 < j2 - 1)
	//* 165  346:iload           19
	//* 166  348:iload           20
	//* 167  350:iconst_1        
	//* 168  351:isub            
	//* 169  352:icmpge          431
				{
					f13 = f11 + (f20 + f17);
	//  170  355:fload           7
	//  171  357:fload           14
	//  172  359:fload           11
	//  173  361:fadd            
	//  174  362:fadd            
	//  175  363:fstore          8
					f15 = f8;
	//  176  365:fload           6
	//  177  367:fstore          10
					f4 = f1;
	//  178  369:fload_3         
	//  179  370:fstore          4
					flag = flag1;
	//  180  372:iload           18
	//  181  374:istore          17
				}
			} else
	//* 182  376:goto            431
			{
				boolean flag2 = true;
	//  183  379:iconst_1        
	//  184  380:istore          18
				f8 = f13 + f8;
	//  185  382:fload           8
	//  186  384:fload           6
	//  187  386:fadd            
	//  188  387:fstore          6
				f15 = f1;
	//  189  389:fload_3         
	//  190  390:fstore          10
				f13 = f6;
	//  191  392:fload           5
	//  192  394:fstore          8
				f4 = f8;
	//  193  396:fload           6
	//  194  398:fstore          4
				flag = flag2;
	//  195  400:iload           18
	//  196  402:istore          17
				if(l1 < j2 - 1)
	//* 197  404:iload           19
	//* 198  406:iload           20
	//* 199  408:iconst_1        
	//* 200  409:isub            
	//* 201  410:icmpge          431
				{
					f4 = f8 + f18;
	//  202  413:fload           6
	//  203  415:fload           12
	//  204  417:fadd            
	//  205  418:fstore          4
					flag = flag2;
	//  206  420:iload           18
	//  207  422:istore          17
					f13 = f6;
	//  208  424:fload           5
	//  209  426:fstore          8
					f15 = f1;
	//  210  428:fload_3         
	//  211  429:fstore          10
				}
			}
			f1 = Math.max(f15, f4);
	//  212  431:fload           10
	//  213  433:fload           4
	//  214  435:invokestatic    #200 <Method float Math.max(float, float)>
	//  215  438:fstore_3        
			l1++;
	//  216  439:iload           19
	//  217  441:iconst_1        
	//  218  442:iadd            
	//  219  443:istore          19
			f6 = f13;
	//  220  445:fload           8
	//  221  447:fstore          5
		}

	//* 222  449:goto            139
		c = f1;
	//  223  452:aload_0         
	//  224  453:fload_3         
	//  225  454:putfield        #110 <Field float c>
		d = f6;
	//  226  457:aload_0         
	//  227  458:fload           5
	//  228  460:putfield        #112 <Field float d>
		break; /* Loop/switch isn't completed */
	//  229  463:goto            1040
_L3:
		float f5;
		float f7;
		float f9;
		float f16;
		float f21;
		float f22;
		float f23;
		int i1;
		int i2;
		f16 = oc.a(paint);
	//  230  466:aload_1         
	//  231  467:invokestatic    #191 <Method float oc.a(Paint)>
	//  232  470:fstore          10
		f21 = oc.e(paint);
	//  233  472:aload_1         
	//  234  473:invokestatic    #201 <Method float oc.e(Paint)>
	//  235  476:fstore          14
		f22 = oa1.g();
	//  236  478:aload_2         
	//  237  479:invokevirtual   #206 <Method float oa.g()>
	//  238  482:fstore          15
		f23 = w;
	//  239  484:aload_0         
	//  240  485:getfield        #108 <Field float w>
	//  241  488:fstore          16
		f5 = 0.0F;
	//  242  490:fconst_0        
	//  243  491:fstore          4
		f9 = 0.0F;
	//  244  493:fconst_0        
	//  245  494:fstore          6
		f7 = 0.0F;
	//  246  496:fconst_0        
	//  247  497:fstore          5
		i2 = -1;
	//  248  499:iconst_m1       
	//  249  500:istore          19
		B.clear();
	//  250  502:aload_0         
	//  251  503:getfield        #127 <Field List B>
	//  252  506:invokeinterface #209 <Method void List.clear()>
		C.clear();
	//  253  511:aload_0         
	//  254  512:getfield        #125 <Field List C>
	//  255  515:invokeinterface #209 <Method void List.clear()>
		E.clear();
	//  256  520:aload_0         
	//  257  521:getfield        #129 <Field List E>
	//  258  524:invokeinterface #209 <Method void List.clear()>
		i1 = 0;
	//  259  529:iconst_0        
	//  260  530:istore          17
_L9:
		if(i1 >= j2) goto _L5; else goto _L4
	//  261  532:iload           17
	//  262  534:iload           20
	//  263  536:icmpge          974
_L4:
		float f2;
		int k1;
		oa1 = ((oa) (ali[i1]));
	//  264  539:aload           22
	//  265  541:iload           17
	//  266  543:aaload          
	//  267  544:astore_2        
		if(((li) (oa1)).d != c.c)
	//* 268  545:aload_2         
	//* 269  546:getfield        #192 <Field lm$c li.d>
	//* 270  549:getstatic       #194 <Field lm$c lm$c.c>
	//* 271  552:if_acmpeq       561
			k1 = 1;
	//  272  555:iconst_1        
	//  273  556:istore          18
		else
	//* 274  558:goto            564
			k1 = 0;
	//  275  561:iconst_0        
	//  276  562:istore          18
		if(Float.isNaN(((li) (oa1)).e))
	//* 277  564:aload_2         
	//* 278  565:getfield        #166 <Field float li.e>
	//* 279  568:invokestatic    #172 <Method boolean Float.isNaN(float)>
	//* 280  571:ifeq            580
			f2 = f14;
	//  281  574:fload           9
	//  282  576:fstore_3        
		else
	//* 283  577:goto            588
			f2 = oc.b(((li) (oa1)).e);
	//  284  580:aload_2         
	//  285  581:getfield        #166 <Field float li.e>
	//  286  584:invokestatic    #135 <Method float oc.b(float)>
	//  287  587:fstore_3        
		oa1 = ((oa) (((li) (oa1)).c));
	//  288  588:aload_2         
	//  289  589:getfield        #175 <Field String li.c>
	//  290  592:astore_2        
		B.add(((Object) (Boolean.valueOf(false))));
	//  291  593:aload_0         
	//  292  594:getfield        #127 <Field List B>
	//  293  597:iconst_0        
	//  294  598:invokestatic    #215 <Method Boolean Boolean.valueOf(boolean)>
	//  295  601:invokeinterface #219 <Method boolean List.add(Object)>
	//  296  606:pop             
		if(i2 == -1)
	//* 297  607:iload           19
	//* 298  609:iconst_m1       
	//* 299  610:icmpne          619
			f7 = 0.0F;
	//  300  613:fconst_0        
	//  301  614:fstore          5
		else
	//* 302  616:goto            626
			f7 += f18;
	//  303  619:fload           5
	//  304  621:fload           12
	//  305  623:fadd            
	//  306  624:fstore          5
		if(oa1 != null)
	//* 307  626:aload_2         
	//* 308  627:ifnull          690
		{
			C.add(((Object) (oc.a(paint, ((String) (oa1))))));
	//  309  630:aload_0         
	//  310  631:getfield        #125 <Field List C>
	//  311  634:aload_1         
	//  312  635:aload_2         
	//  313  636:invokestatic    #222 <Method nr oc.a(Paint, String)>
	//  314  639:invokeinterface #219 <Method boolean List.add(Object)>
	//  315  644:pop             
			if(k1 != 0)
	//* 316  645:iload           18
	//* 317  647:ifeq            658
				f2 = f19 + f2;
	//  318  650:fload           13
	//  319  652:fload_3         
	//  320  653:fadd            
	//  321  654:fstore_3        
			else
	//* 322  655:goto            660
				f2 = 0.0F;
	//  323  658:fconst_0        
	//  324  659:fstore_3        
			f2 = f7 + f2 + ((nr)C.get(i1)).a;
	//  325  660:fload           5
	//  326  662:fload_3         
	//  327  663:fadd            
	//  328  664:aload_0         
	//  329  665:getfield        #125 <Field List C>
	//  330  668:iload           17
	//  331  670:invokeinterface #226 <Method Object List.get(int)>
	//  332  675:checkcast       #228 <Class nr>
	//  333  678:getfield        #229 <Field float nr.a>
	//  334  681:fadd            
	//  335  682:fstore_3        
			k1 = i2;
	//  336  683:iload           19
	//  337  685:istore          18
		} else
	//* 338  687:goto            741
		{
			C.add(((Object) (nr.c(0.0F, 0.0F))));
	//  339  690:aload_0         
	//  340  691:getfield        #125 <Field List C>
	//  341  694:fconst_0        
	//  342  695:fconst_0        
	//  343  696:invokestatic    #232 <Method nr nr.c(float, float)>
	//  344  699:invokeinterface #219 <Method boolean List.add(Object)>
	//  345  704:pop             
			if(k1 == 0)
	//* 346  705:iload           18
	//* 347  707:ifeq            713
	//* 348  710:goto            715
				f2 = 0.0F;
	//  349  713:fconst_0        
	//  350  714:fstore_3        
			f7 += f2;
	//  351  715:fload           5
	//  352  717:fload_3         
	//  353  718:fadd            
	//  354  719:fstore          5
			f2 = f7;
	//  355  721:fload           5
	//  356  723:fstore_3        
			k1 = i2;
	//  357  724:iload           19
	//  358  726:istore          18
			if(i2 == -1)
	//* 359  728:iload           19
	//* 360  730:iconst_m1       
	//* 361  731:icmpne          741
			{
				k1 = i1;
	//  362  734:iload           17
	//  363  736:istore          18
				f2 = f7;
	//  364  738:fload           5
	//  365  740:fstore_3        
			}
		}
		if(oa1 != null) goto _L7; else goto _L6
	//  366  741:aload_2         
	//  367  742:ifnonnull       762
_L6:
		float f12;
		f7 = f5;
	//  368  745:fload           4
	//  369  747:fstore          5
		f12 = f9;
	//  370  749:fload           6
	//  371  751:fstore          7
		if(i1 != j2 - 1) goto _L8; else goto _L7
	//  372  753:iload           17
	//  373  755:iload           20
	//  374  757:iconst_1        
	//  375  758:isub            
	//  376  759:icmpne          940
_L7:
		if(f9 == 0.0F)
	//* 377  762:fload           6
	//* 378  764:fconst_0        
	//* 379  765:fcmpl           
	//* 380  766:ifne            775
			f7 = 0.0F;
	//  381  769:fconst_0        
	//  382  770:fstore          5
		else
	//* 383  772:goto            779
			f7 = f13;
	//  384  775:fload           8
	//  385  777:fstore          5
		if(!flag3 || f9 == 0.0F || f22 * f23 - f9 >= f7 + f2)
	//* 386  779:iload           21
	//* 387  781:ifeq            807
	//* 388  784:fload           6
	//* 389  786:fconst_0        
	//* 390  787:fcmpl           
	//* 391  788:ifeq            807
	//* 392  791:fload           15
	//* 393  793:fload           16
	//* 394  795:fmul            
	//* 395  796:fload           6
	//* 396  798:fsub            
	//* 397  799:fload           5
	//* 398  801:fload_3         
	//* 399  802:fadd            
	//* 400  803:fcmpl           
	//* 401  804:iflt            827
		{
			f7 = f9 + (f7 + f2);
	//  402  807:fload           6
	//  403  809:fload           5
	//  404  811:fload_3         
	//  405  812:fadd            
	//  406  813:fadd            
	//  407  814:fstore          5
			f9 = f5;
	//  408  816:fload           4
	//  409  818:fstore          6
			f5 = f7;
	//  410  820:fload           5
	//  411  822:fstore          4
		} else
	//* 412  824:goto            893
		{
			E.add(((Object) (nr.c(f9, f16))));
	//  413  827:aload_0         
	//  414  828:getfield        #129 <Field List E>
	//  415  831:fload           6
	//  416  833:fload           10
	//  417  835:invokestatic    #232 <Method nr nr.c(float, float)>
	//  418  838:invokeinterface #219 <Method boolean List.add(Object)>
	//  419  843:pop             
			f9 = Math.max(f5, f9);
	//  420  844:fload           4
	//  421  846:fload           6
	//  422  848:invokestatic    #200 <Method float Math.max(float, float)>
	//  423  851:fstore          6
			List list = B;
	//  424  853:aload_0         
	//  425  854:getfield        #127 <Field List B>
	//  426  857:astore          23
			if(k1 > -1)
	//* 427  859:iload           18
	//* 428  861:iconst_m1       
	//* 429  862:icmple          872
				i2 = k1;
	//  430  865:iload           18
	//  431  867:istore          19
			else
	//* 432  869:goto            876
				i2 = i1;
	//  433  872:iload           17
	//  434  874:istore          19
			list.set(i2, ((Object) (Boolean.valueOf(true))));
	//  435  876:aload           23
	//  436  878:iload           19
	//  437  880:iconst_1        
	//  438  881:invokestatic    #215 <Method Boolean Boolean.valueOf(boolean)>
	//  439  884:invokeinterface #236 <Method Object List.set(int, Object)>
	//  440  889:pop             
			f5 = f2;
	//  441  890:fload_3         
	//  442  891:fstore          4
		}
		f7 = f9;
	//  443  893:fload           6
	//  444  895:fstore          5
		f12 = f5;
	//  445  897:fload           4
	//  446  899:fstore          7
		if(i1 == j2 - 1)
	//* 447  901:iload           17
	//* 448  903:iload           20
	//* 449  905:iconst_1        
	//* 450  906:isub            
	//* 451  907:icmpne          940
		{
			E.add(((Object) (nr.c(f5, f16))));
	//  452  910:aload_0         
	//  453  911:getfield        #129 <Field List E>
	//  454  914:fload           4
	//  455  916:fload           10
	//  456  918:invokestatic    #232 <Method nr nr.c(float, float)>
	//  457  921:invokeinterface #219 <Method boolean List.add(Object)>
	//  458  926:pop             
			f7 = Math.max(f9, f5);
	//  459  927:fload           6
	//  460  929:fload           4
	//  461  931:invokestatic    #200 <Method float Math.max(float, float)>
	//  462  934:fstore          5
			f12 = f5;
	//  463  936:fload           4
	//  464  938:fstore          7
		}
_L8:
		if(oa1 != null)
	//* 465  940:aload_2         
	//* 466  941:ifnull          950
			k1 = -1;
	//  467  944:iconst_m1       
	//  468  945:istore          18
	//* 469  947:goto            950
		i1++;
	//  470  950:iload           17
	//  471  952:iconst_1        
	//  472  953:iadd            
	//  473  954:istore          17
		f5 = f7;
	//  474  956:fload           5
	//  475  958:fstore          4
		f9 = f12;
	//  476  960:fload           7
	//  477  962:fstore          6
		f7 = f2;
	//  478  964:fload_3         
	//  479  965:fstore          5
		i2 = k1;
	//  480  967:iload           18
	//  481  969:istore          19
		  goto _L9
	//* 482  971:goto            532
_L5:
		c = f5;
	//  483  974:aload_0         
	//  484  975:fload           4
	//  485  977:putfield        #110 <Field float c>
		float f3 = E.size();
	//  486  980:aload_0         
	//  487  981:getfield        #129 <Field List E>
	//  488  984:invokeinterface #154 <Method int List.size()>
	//  489  989:i2f             
	//  490  990:fstore_3        
		int j1;
		if(E.size() == 0)
	//* 491  991:aload_0         
	//* 492  992:getfield        #129 <Field List E>
	//* 493  995:invokeinterface #154 <Method int List.size()>
	//* 494 1000:ifne            1009
			j1 = 0;
	//  495 1003:iconst_0        
	//  496 1004:istore          17
		else
	//* 497 1006:goto            1022
			j1 = E.size() - 1;
	//  498 1009:aload_0         
	//  499 1010:getfield        #129 <Field List E>
	//  500 1013:invokeinterface #154 <Method int List.size()>
	//  501 1018:iconst_1        
	//  502 1019:isub            
	//  503 1020:istore          17
		d = f3 * f16 + (float)j1 * (f21 + f17);
	//  504 1022:aload_0         
	//  505 1023:fload_3         
	//  506 1024:fload           10
	//  507 1026:fmul            
	//  508 1027:iload           17
	//  509 1029:i2f             
	//  510 1030:fload           14
	//  511 1032:fload           11
	//  512 1034:fadd            
	//  513 1035:fmul            
	//  514 1036:fadd            
	//  515 1037:putfield        #112 <Field float d>
		d = d + z;
	//  516 1040:aload_0         
	//  517 1041:aload_0         
	//  518 1042:getfield        #112 <Field float d>
	//  519 1045:aload_0         
	//  520 1046:getfield        #144 <Field float z>
	//  521 1049:fadd            
	//  522 1050:putfield        #112 <Field float d>
		c = c + y;
	//  523 1053:aload_0         
	//  524 1054:aload_0         
	//  525 1055:getfield        #110 <Field float c>
	//  526 1058:aload_0         
	//  527 1059:getfield        #141 <Field float y>
	//  528 1062:fadd            
	//  529 1063:putfield        #110 <Field float c>
		return;
	//  530 1066:return          
	}

	public void c(k k1)
	{
		k = k1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #73  <Field lm$k k>
	//    3    5:return          
	}

	public li[] c()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #240 <Field li[] i>
	//    2    4:areturn         
	}

	public li[] d()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field li[] b>
	//    2    4:areturn         
	}

	public float e(Paint paint)
	{
		float f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		li ali[] = b;
	//    2    2:aload_0         
	//    3    3:getfield        #63  <Field li[] b>
	//    4    6:astore          7
		int j1 = ali.length;
	//    5    8:aload           7
	//    6   10:arraylength     
	//    7   11:istore          6
		for(int i1 = 0; i1 < j1;)
	//*   8   13:iconst_0        
	//*   9   14:istore          5
	//*  10   16:iload           5
	//*  11   18:iload           6
	//*  12   20:icmpge          75
		{
			String s1 = ali[i1].c;
	//   13   23:aload           7
	//   14   25:iload           5
	//   15   27:aaload          
	//   16   28:getfield        #175 <Field String li.c>
	//   17   31:astore          8
			float f2;
			if(s1 == null)
	//*  18   33:aload           8
	//*  19   35:ifnonnull       43
			{
				f2 = f1;
	//   20   38:fload_2         
	//   21   39:fstore_3        
			} else
	//*  22   40:goto            64
			{
				float f3 = oc.e(paint, s1);
	//   23   43:aload_1         
	//   24   44:aload           8
	//   25   46:invokestatic    #242 <Method int oc.e(Paint, String)>
	//   26   49:i2f             
	//   27   50:fstore          4
				f2 = f1;
	//   28   52:fload_2         
	//   29   53:fstore_3        
				if(f3 > f1)
	//*  30   54:fload           4
	//*  31   56:fload_2         
	//*  32   57:fcmpl           
	//*  33   58:ifle            64
					f2 = f3;
	//   34   61:fload           4
	//   35   63:fstore_3        
			}
			i1++;
	//   36   64:iload           5
	//   37   66:iconst_1        
	//   38   67:iadd            
	//   39   68:istore          5
			f1 = f2;
	//   40   70:fload_3         
	//   41   71:fstore_2        
		}

	//*  42   72:goto            16
		return f1;
	//   43   75:fload_2         
	//   44   76:freturn         
	}

	public k e()
	{
		return k;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field lm$k k>
	//    2    4:areturn         
	}

	public b f()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field lm$b m>
	//    2    4:areturn         
	}

	public float g()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field float l>
	//    2    4:freturn         
	}

	public boolean h()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean n>
	//    2    4:ireturn         
	}

	public d i()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field lm$d f>
	//    2    4:areturn         
	}

	public c k()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field lm$c o>
	//    2    4:areturn         
	}

	public float l()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field float t>
	//    2    4:freturn         
	}

	public float m()
	{
		return u;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field float u>
	//    2    4:freturn         
	}

	public float n()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float p>
	//    2    4:freturn         
	}

	public float o()
	{
		return q;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field float q>
	//    2    4:freturn         
	}

	public DashPathEffect p()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field DashPathEffect r>
	//    2    4:areturn         
	}

	public List q()
	{
		return E;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field List E>
	//    2    4:areturn         
	}

	public List r()
	{
		return C;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field List C>
	//    2    4:areturn         
	}

	public float s()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field float s>
	//    2    4:freturn         
	}

	public List t()
	{
		return B;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field List B>
	//    2    4:areturn         
	}

	public float u()
	{
		return w;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field float w>
	//    2    4:freturn         
	}

	private List B;
	private List C;
	private List E;
	public float a;
	private li b[];
	public float c;
	public float d;
	public float e;
	private d f;
	private boolean g;
	private a h;
	private li i[];
	private boolean j;
	private k k;
	private float l;
	private b m;
	private boolean n;
	private c o;
	private float p;
	private float q;
	private DashPathEffect r;
	private float s;
	private float t;
	private float u;
	private float w;
}
