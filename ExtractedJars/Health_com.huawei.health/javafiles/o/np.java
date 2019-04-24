// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import com.github.mikephil.charting.data.PieEntry;
import java.util.*;

// Referenced classes of package o:
//			nl, oc, li, lm, 
//			oa, nr, ma, mz, 
//			mt, mx, ms

public class np extends nl
{

	public np(oa oa1, lm lm1)
	{
		super(oa1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void nl(oa)>
		b = ((List) (new ArrayList(16)));
	//    3    5:aload_0         
	//    4    6:new             #25  <Class ArrayList>
	//    5    9:dup             
	//    6   10:bipush          16
	//    7   12:invokespecial   #28  <Method void ArrayList(int)>
	//    8   15:putfield        #30  <Field List b>
		c = new android.graphics.Paint.FontMetrics();
	//    9   18:aload_0         
	//   10   19:new             #32  <Class android.graphics.Paint$FontMetrics>
	//   11   22:dup             
	//   12   23:invokespecial   #35  <Method void android.graphics.Paint$FontMetrics()>
	//   13   26:putfield        #37  <Field android.graphics.Paint$FontMetrics c>
		h = new Path();
	//   14   29:aload_0         
	//   15   30:new             #39  <Class Path>
	//   16   33:dup             
	//   17   34:invokespecial   #40  <Method void Path()>
	//   18   37:putfield        #42  <Field Path h>
		e = lm1;
	//   19   40:aload_0         
	//   20   41:aload_2         
	//   21   42:putfield        #44  <Field lm e>
		d = new Paint(1);
	//   22   45:aload_0         
	//   23   46:new             #46  <Class Paint>
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:invokespecial   #47  <Method void Paint(int)>
	//   27   54:putfield        #49  <Field Paint d>
		d.setTextSize(oc.b(9F));
	//   28   57:aload_0         
	//   29   58:getfield        #49  <Field Paint d>
	//   30   61:ldc1            #50  <Float 9F>
	//   31   63:invokestatic    #55  <Method float oc.b(float)>
	//   32   66:invokevirtual   #59  <Method void Paint.setTextSize(float)>
		d.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   33   69:aload_0         
	//   34   70:getfield        #49  <Field Paint d>
	//   35   73:getstatic       #65  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   36   76:invokevirtual   #69  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		a = new Paint(1);
	//   37   79:aload_0         
	//   38   80:new             #46  <Class Paint>
	//   39   83:dup             
	//   40   84:iconst_1        
	//   41   85:invokespecial   #47  <Method void Paint(int)>
	//   42   88:putfield        #71  <Field Paint a>
		a.setStyle(android.graphics.Paint.Style.FILL);
	//   43   91:aload_0         
	//   44   92:getfield        #71  <Field Paint a>
	//   45   95:getstatic       #77  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   46   98:invokevirtual   #81  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   47  101:return          
	}

	protected void b(Canvas canvas, float f, float f1, String s)
	{
		canvas.drawText(s, f, f1, d);
	//    0    0:aload_1         
	//    1    1:aload           4
	//    2    3:fload_2         
	//    3    4:fload_3         
	//    4    5:aload_0         
	//    5    6:getfield        #49  <Field Paint d>
	//    6    9:invokevirtual   #89  <Method void Canvas.drawText(String, float, float, Paint)>
	//    7   12:return          
	}

	protected void c(Canvas canvas, float f, float f1, li li1, lm lm1)
	{
		if(li1.i == 0x112234 || li1.i == 0x112233 || li1.i == 0)
	//*   0    0:aload           4
	//*   1    2:getfield        #96  <Field int li.i>
	//*   2    5:ldc1            #97  <Int 0x112234>
	//*   3    7:icmpeq          28
	//*   4   10:aload           4
	//*   5   12:getfield        #96  <Field int li.i>
	//*   6   15:ldc1            #98  <Int 0x112233>
	//*   7   17:icmpeq          28
	//*   8   20:aload           4
	//*   9   22:getfield        #96  <Field int li.i>
	//*  10   25:ifne            29
			return;
	//   11   28:return          
		int i = canvas.save();
	//   12   29:aload_1         
	//   13   30:invokevirtual   #102 <Method int Canvas.save()>
	//   14   33:istore          8
		lm.c c2 = li1.d;
	//   15   35:aload           4
	//   16   37:getfield        #105 <Field lm$c li.d>
	//   17   40:astore          10
		lm.c c1 = c2;
	//   18   42:aload           10
	//   19   44:astore          9
		if(c2 == lm.c.e)
	//*  20   46:aload           10
	//*  21   48:getstatic       #109 <Field lm$c lm$c.e>
	//*  22   51:if_acmpne       61
			c1 = lm1.k();
	//   23   54:aload           5
	//   24   56:invokevirtual   #115 <Method lm$c lm.k()>
	//   25   59:astore          9
		a.setColor(li1.i);
	//   26   61:aload_0         
	//   27   62:getfield        #71  <Field Paint a>
	//   28   65:aload           4
	//   29   67:getfield        #96  <Field int li.i>
	//   30   70:invokevirtual   #118 <Method void Paint.setColor(int)>
		float f2;
		if(Float.isNaN(li1.e))
	//*  31   73:aload           4
	//*  32   75:getfield        #121 <Field float li.e>
	//*  33   78:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//*  34   81:ifeq            94
			f2 = lm1.g();
	//   35   84:aload           5
	//   36   86:invokevirtual   #131 <Method float lm.g()>
	//   37   89:fstore          6
		else
	//*  38   91:goto            101
			f2 = li1.e;
	//   39   94:aload           4
	//   40   96:getfield        #121 <Field float li.e>
	//   41   99:fstore          6
		float f4 = oc.b(f2);
	//   42  101:fload           6
	//   43  103:invokestatic    #55  <Method float oc.b(float)>
	//   44  106:fstore          7
		f2 = f4 / 2.0F;
	//   45  108:fload           7
	//   46  110:fconst_2        
	//   47  111:fdiv            
	//   48  112:fstore          6
		static class _cls5
		{

			static final int a[];
			static final int b[];
			static final int c[];
			static final int e[];

			static 
			{
				b = new int[lm.c.values().length];
			//    0    0:invokestatic    #21  <Method lm$c[] lm$c.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #23  <Field int[] b>
				try
				{
					b[lm.c.c.ordinal()] = 1;
			//    4    9:getstatic       #23  <Field int[] b>
			//    5   12:getstatic       #26  <Field lm$c lm$c.c>
			//    6   15:invokevirtual   #30  <Method int lm$c.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					b[lm.c.b.ordinal()] = 2;
			//   11   24:getstatic       #23  <Field int[] b>
			//   12   27:getstatic       #32  <Field lm$c lm$c.b>
			//   13   30:invokevirtual   #30  <Method int lm$c.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					b[lm.c.e.ordinal()] = 3;
			//   18   39:getstatic       #23  <Field int[] b>
			//   19   42:getstatic       #34  <Field lm$c lm$c.e>
			//   20   45:invokevirtual   #30  <Method int lm$c.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					b[lm.c.a.ordinal()] = 4;
			//   25   54:getstatic       #23  <Field int[] b>
			//   26   57:getstatic       #36  <Field lm$c lm$c.a>
			//   27   60:invokevirtual   #30  <Method int lm$c.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
				}
			//*  30   65:goto            69
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   68:astore_0        
				try
				{
					b[lm.c.d.ordinal()] = 5;
			//   32   69:getstatic       #23  <Field int[] b>
			//   33   72:getstatic       #39  <Field lm$c lm$c.d>
			//   34   75:invokevirtual   #30  <Method int lm$c.ordinal()>
			//   35   78:iconst_5        
			//   36   79:iastore         
				}
			//*  37   80:goto            84
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   83:astore_0        
				try
				{
					b[lm.c.h.ordinal()] = 6;
			//   39   84:getstatic       #23  <Field int[] b>
			//   40   87:getstatic       #42  <Field lm$c lm$c.h>
			//   41   90:invokevirtual   #30  <Method int lm$c.ordinal()>
			//   42   93:bipush          6
			//   43   95:iastore         
				}
			//*  44   96:goto            100
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   45   99:astore_0        
				c = new int[lm.d.values().length];
			//   46  100:invokestatic    #47  <Method lm$d[] lm$d.values()>
			//   47  103:arraylength     
			//   48  104:newarray        int[]
			//   49  106:putstatic       #49  <Field int[] c>
				try
				{
					c[lm.d.c.ordinal()] = 1;
			//   50  109:getstatic       #49  <Field int[] c>
			//   51  112:getstatic       #52  <Field lm$d lm$d.c>
			//   52  115:invokevirtual   #53  <Method int lm$d.ordinal()>
			//   53  118:iconst_1        
			//   54  119:iastore         
				}
			//*  55  120:goto            124
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   56  123:astore_0        
				try
				{
					c[lm.d.b.ordinal()] = 2;
			//   57  124:getstatic       #49  <Field int[] c>
			//   58  127:getstatic       #55  <Field lm$d lm$d.b>
			//   59  130:invokevirtual   #53  <Method int lm$d.ordinal()>
			//   60  133:iconst_2        
			//   61  134:iastore         
				}
			//*  62  135:goto            139
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   63  138:astore_0        
				a = new int[lm.k.values().length];
			//   64  139:invokestatic    #60  <Method lm$k[] lm$k.values()>
			//   65  142:arraylength     
			//   66  143:newarray        int[]
			//   67  145:putstatic       #62  <Field int[] a>
				try
				{
					a[lm.k.c.ordinal()] = 1;
			//   68  148:getstatic       #62  <Field int[] a>
			//   69  151:getstatic       #65  <Field lm$k lm$k.c>
			//   70  154:invokevirtual   #66  <Method int lm$k.ordinal()>
			//   71  157:iconst_1        
			//   72  158:iastore         
				}
			//*  73  159:goto            163
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   74  162:astore_0        
				try
				{
					a[lm.k.d.ordinal()] = 2;
			//   75  163:getstatic       #62  <Field int[] a>
			//   76  166:getstatic       #68  <Field lm$k lm$k.d>
			//   77  169:invokevirtual   #66  <Method int lm$k.ordinal()>
			//   78  172:iconst_2        
			//   79  173:iastore         
				}
			//*  80  174:goto            178
				catch(NoSuchFieldError nosuchfielderror9) { }
			//   81  177:astore_0        
				try
				{
					a[lm.k.b.ordinal()] = 3;
			//   82  178:getstatic       #62  <Field int[] a>
			//   83  181:getstatic       #70  <Field lm$k lm$k.b>
			//   84  184:invokevirtual   #66  <Method int lm$k.ordinal()>
			//   85  187:iconst_3        
			//   86  188:iastore         
				}
			//*  87  189:goto            193
				catch(NoSuchFieldError nosuchfielderror10) { }
			//   88  192:astore_0        
				e = new int[lm.a.values().length];
			//   89  193:invokestatic    #75  <Method lm$a[] lm$a.values()>
			//   90  196:arraylength     
			//   91  197:newarray        int[]
			//   92  199:putstatic       #77  <Field int[] e>
				try
				{
					e[lm.a.d.ordinal()] = 1;
			//   93  202:getstatic       #77  <Field int[] e>
			//   94  205:getstatic       #80  <Field lm$a lm$a.d>
			//   95  208:invokevirtual   #81  <Method int lm$a.ordinal()>
			//   96  211:iconst_1        
			//   97  212:iastore         
				}
			//*  98  213:goto            217
				catch(NoSuchFieldError nosuchfielderror11) { }
			//   99  216:astore_0        
				try
				{
					e[lm.a.a.ordinal()] = 2;
			//  100  217:getstatic       #77  <Field int[] e>
			//  101  220:getstatic       #83  <Field lm$a lm$a.a>
			//  102  223:invokevirtual   #81  <Method int lm$a.ordinal()>
			//  103  226:iconst_2        
			//  104  227:iastore         
				}
			//* 105  228:goto            232
				catch(NoSuchFieldError nosuchfielderror12) { }
			//  106  231:astore_0        
				try
				{
					e[lm.a.c.ordinal()] = 3;
			//  107  232:getstatic       #77  <Field int[] e>
			//  108  235:getstatic       #85  <Field lm$a lm$a.c>
			//  109  238:invokevirtual   #81  <Method int lm$a.ordinal()>
			//  110  241:iconst_3        
			//  111  242:iastore         
			//  112  243:return          
				}
				catch(NoSuchFieldError nosuchfielderror13) { }
			//  113  244:astore_0        
			//* 114  245:return          
			}
		}

		switch(_cls5.b[c1.ordinal()])
	//*  49  114:getstatic       #134 <Field int[] np$5.b>
	//*  50  117:aload           9
	//*  51  119:invokevirtual   #137 <Method int lm$c.ordinal()>
	//*  52  122:iaload          
		{
		case 1: // '\001'
		case 2: // '\002'
		default:
			break;

	//*  53  123:tableswitch     1 6: default 160
	//	               1 163
	//	               2 166
	//	               3 169
	//	               4 169
	//	               5 197
	//	               6 231
	//*  54  160:goto            360
	//*  55  163:goto            360
	//*  56  166:goto            360
		case 3: // '\003'
		case 4: // '\004'
			a.setStyle(android.graphics.Paint.Style.FILL);
	//   57  169:aload_0         
	//   58  170:getfield        #71  <Field Paint a>
	//   59  173:getstatic       #77  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   60  176:invokevirtual   #81  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			canvas.drawCircle(f + f2, f1, f2, a);
	//   61  179:aload_1         
	//   62  180:fload_2         
	//   63  181:fload           6
	//   64  183:fadd            
	//   65  184:fload_3         
	//   66  185:fload           6
	//   67  187:aload_0         
	//   68  188:getfield        #71  <Field Paint a>
	//   69  191:invokevirtual   #141 <Method void Canvas.drawCircle(float, float, float, Paint)>
			break;
	//   70  194:goto            360

		case 5: // '\005'
			a.setStyle(android.graphics.Paint.Style.FILL);
	//   71  197:aload_0         
	//   72  198:getfield        #71  <Field Paint a>
	//   73  201:getstatic       #77  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   74  204:invokevirtual   #81  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			canvas.drawRect(f, f1 - f2, f + f4, f1 + f2, a);
	//   75  207:aload_1         
	//   76  208:fload_2         
	//   77  209:fload_3         
	//   78  210:fload           6
	//   79  212:fsub            
	//   80  213:fload_2         
	//   81  214:fload           7
	//   82  216:fadd            
	//   83  217:fload_3         
	//   84  218:fload           6
	//   85  220:fadd            
	//   86  221:aload_0         
	//   87  222:getfield        #71  <Field Paint a>
	//   88  225:invokevirtual   #145 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			break;
	//   89  228:goto            360

		case 6: // '\006'
			float f3;
			if(Float.isNaN(li1.a))
	//*  90  231:aload           4
	//*  91  233:getfield        #147 <Field float li.a>
	//*  92  236:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//*  93  239:ifeq            252
				f3 = lm1.n();
	//   94  242:aload           5
	//   95  244:invokevirtual   #150 <Method float lm.n()>
	//   96  247:fstore          6
			else
	//*  97  249:goto            259
				f3 = li1.a;
	//   98  252:aload           4
	//   99  254:getfield        #147 <Field float li.a>
	//  100  257:fstore          6
			f3 = oc.b(f3);
	//  101  259:fload           6
	//  102  261:invokestatic    #55  <Method float oc.b(float)>
	//  103  264:fstore          6
			if(li1.b == null)
	//* 104  266:aload           4
	//* 105  268:getfield        #153 <Field android.graphics.DashPathEffect li.b>
	//* 106  271:ifnonnull       284
				li1 = ((li) (lm1.p()));
	//  107  274:aload           5
	//  108  276:invokevirtual   #157 <Method android.graphics.DashPathEffect lm.p()>
	//  109  279:astore          4
			else
	//* 110  281:goto            291
				li1 = ((li) (li1.b));
	//  111  284:aload           4
	//  112  286:getfield        #153 <Field android.graphics.DashPathEffect li.b>
	//  113  289:astore          4
			a.setStyle(android.graphics.Paint.Style.STROKE);
	//  114  291:aload_0         
	//  115  292:getfield        #71  <Field Paint a>
	//  116  295:getstatic       #160 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  117  298:invokevirtual   #81  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			a.setStrokeWidth(f3);
	//  118  301:aload_0         
	//  119  302:getfield        #71  <Field Paint a>
	//  120  305:fload           6
	//  121  307:invokevirtual   #163 <Method void Paint.setStrokeWidth(float)>
			a.setPathEffect(((android.graphics.PathEffect) (li1)));
	//  122  310:aload_0         
	//  123  311:getfield        #71  <Field Paint a>
	//  124  314:aload           4
	//  125  316:invokevirtual   #167 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  126  319:pop             
			h.reset();
	//  127  320:aload_0         
	//  128  321:getfield        #42  <Field Path h>
	//  129  324:invokevirtual   #170 <Method void Path.reset()>
			h.moveTo(f, f1);
	//  130  327:aload_0         
	//  131  328:getfield        #42  <Field Path h>
	//  132  331:fload_2         
	//  133  332:fload_3         
	//  134  333:invokevirtual   #174 <Method void Path.moveTo(float, float)>
			h.lineTo(f + f4, f1);
	//  135  336:aload_0         
	//  136  337:getfield        #42  <Field Path h>
	//  137  340:fload_2         
	//  138  341:fload           7
	//  139  343:fadd            
	//  140  344:fload_3         
	//  141  345:invokevirtual   #177 <Method void Path.lineTo(float, float)>
			canvas.drawPath(h, a);
	//  142  348:aload_1         
	//  143  349:aload_0         
	//  144  350:getfield        #42  <Field Path h>
	//  145  353:aload_0         
	//  146  354:getfield        #71  <Field Paint a>
	//  147  357:invokevirtual   #181 <Method void Canvas.drawPath(Path, Paint)>
			break;
		}
		canvas.restoreToCount(i);
	//  148  360:aload_1         
	//  149  361:iload           8
	//  150  363:invokevirtual   #184 <Method void Canvas.restoreToCount(int)>
	//  151  366:return          
	}

	public void e(Canvas canvas)
	{
		if(!e.B())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field lm e>
	//*   2    4:invokevirtual   #189 <Method boolean lm.B()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		android.graphics.Typeface typeface = e.x();
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field lm e>
	//    7   15:invokevirtual   #193 <Method android.graphics.Typeface lm.x()>
	//    8   18:astore          24
		if(typeface != null)
	//*   9   20:aload           24
	//*  10   22:ifnull          35
			d.setTypeface(typeface);
	//   11   25:aload_0         
	//   12   26:getfield        #49  <Field Paint d>
	//   13   29:aload           24
	//   14   31:invokevirtual   #197 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   15   34:pop             
		d.setTextSize(e.z());
	//   16   35:aload_0         
	//   17   36:getfield        #49  <Field Paint d>
	//   18   39:aload_0         
	//   19   40:getfield        #44  <Field lm e>
	//   20   43:invokevirtual   #200 <Method float lm.z()>
	//   21   46:invokevirtual   #59  <Method void Paint.setTextSize(float)>
		d.setColor(e.A());
	//   22   49:aload_0         
	//   23   50:getfield        #49  <Field Paint d>
	//   24   53:aload_0         
	//   25   54:getfield        #44  <Field lm e>
	//   26   57:invokevirtual   #203 <Method int lm.A()>
	//   27   60:invokevirtual   #118 <Method void Paint.setColor(int)>
		float f18 = oc.c(d, c);
	//   28   63:aload_0         
	//   29   64:getfield        #49  <Field Paint d>
	//   30   67:aload_0         
	//   31   68:getfield        #37  <Field android.graphics.Paint$FontMetrics c>
	//   32   71:invokestatic    #206 <Method float oc.c(Paint, android.graphics.Paint$FontMetrics)>
	//   33   74:fstore          16
		float f19 = oc.e(d, c) + oc.b(e.o());
	//   34   76:aload_0         
	//   35   77:getfield        #49  <Field Paint d>
	//   36   80:aload_0         
	//   37   81:getfield        #37  <Field android.graphics.Paint$FontMetrics c>
	//   38   84:invokestatic    #208 <Method float oc.e(Paint, android.graphics.Paint$FontMetrics)>
	//   39   87:aload_0         
	//   40   88:getfield        #44  <Field lm e>
	//   41   91:invokevirtual   #211 <Method float lm.o()>
	//   42   94:invokestatic    #55  <Method float oc.b(float)>
	//   43   97:fadd            
	//   44   98:fstore          17
		float f20 = f18 - (float)oc.e(d, "ABC") / 2.0F;
	//   45  100:fload           16
	//   46  102:aload_0         
	//   47  103:getfield        #49  <Field Paint d>
	//   48  106:ldc1            #213 <String "ABC">
	//   49  108:invokestatic    #216 <Method int oc.e(Paint, String)>
	//   50  111:i2f             
	//   51  112:fconst_2        
	//   52  113:fdiv            
	//   53  114:fsub            
	//   54  115:fstore          18
		li ali[] = e.d();
	//   55  117:aload_0         
	//   56  118:getfield        #44  <Field lm e>
	//   57  121:invokevirtual   #219 <Method li[] lm.d()>
	//   58  124:astore          24
		float f10 = oc.b(e.l());
	//   59  126:aload_0         
	//   60  127:getfield        #44  <Field lm e>
	//   61  130:invokevirtual   #222 <Method float lm.l()>
	//   62  133:invokestatic    #55  <Method float oc.b(float)>
	//   63  136:fstore          10
		float f17 = oc.b(e.m());
	//   64  138:aload_0         
	//   65  139:getfield        #44  <Field lm e>
	//   66  142:invokevirtual   #225 <Method float lm.m()>
	//   67  145:invokestatic    #55  <Method float oc.b(float)>
	//   68  148:fstore          15
		lm.d d3 = e.i();
	//   69  150:aload_0         
	//   70  151:getfield        #44  <Field lm e>
	//   71  154:invokevirtual   #228 <Method lm$d lm.i()>
	//   72  157:astore          28
		lm.a a1 = e.a();
	//   73  159:aload_0         
	//   74  160:getfield        #44  <Field lm e>
	//   75  163:invokevirtual   #231 <Method lm$a lm.a()>
	//   76  166:astore          26
		Object obj = ((Object) (e.e()));
	//   77  168:aload_0         
	//   78  169:getfield        #44  <Field lm e>
	//   79  172:invokevirtual   #234 <Method lm$k lm.e()>
	//   80  175:astore          27
		lm.b b1 = e.f();
	//   81  177:aload_0         
	//   82  178:getfield        #44  <Field lm e>
	//   83  181:invokevirtual   #238 <Method lm$b lm.f()>
	//   84  184:astore          25
		float f11 = oc.b(e.g());
	//   85  186:aload_0         
	//   86  187:getfield        #44  <Field lm e>
	//   87  190:invokevirtual   #131 <Method float lm.g()>
	//   88  193:invokestatic    #55  <Method float oc.b(float)>
	//   89  196:fstore          11
		float f16 = oc.b(e.s());
	//   90  198:aload_0         
	//   91  199:getfield        #44  <Field lm e>
	//   92  202:invokevirtual   #241 <Method float lm.s()>
	//   93  205:invokestatic    #55  <Method float oc.b(float)>
	//   94  208:fstore          14
		float f6 = e.y();
	//   95  210:aload_0         
	//   96  211:getfield        #44  <Field lm e>
	//   97  214:invokevirtual   #244 <Method float lm.y()>
	//   98  217:fstore          9
		float f1 = e.v();
	//   99  219:aload_0         
	//  100  220:getfield        #44  <Field lm e>
	//  101  223:invokevirtual   #247 <Method float lm.v()>
	//  102  226:fstore          7
		float f = 0.0F;
	//  103  228:fconst_0        
	//  104  229:fstore          6
		switch(_cls5.e[a1.ordinal()])
	//* 105  231:getstatic       #249 <Field int[] np$5.e>
	//* 106  234:aload           26
	//* 107  236:invokevirtual   #252 <Method int lm$a.ordinal()>
	//* 108  239:iaload          
		{
	//* 109  240:tableswitch     1 3: default 268
	//	               1 271
	//	               2 321
	//	               3 383
	//* 110  268:goto            521
		case 1: // '\001'
			if(d3 != lm.d.b)
	//* 111  271:aload           28
	//* 112  273:getstatic       #257 <Field lm$d lm$d.b>
	//* 113  276:if_acmpne       282
	//* 114  279:goto            294
				f1 = this.l.f() + f1;
	//  115  282:aload_0         
	//  116  283:getfield        #260 <Field oa l>
	//  117  286:invokevirtual   #264 <Method float oa.f()>
	//  118  289:fload           7
	//  119  291:fadd            
	//  120  292:fstore          7
			f = f1;
	//  121  294:fload           7
	//  122  296:fstore          6
			if(b1 == lm.b.b)
	//* 123  298:aload           25
	//* 124  300:getstatic       #269 <Field lm$b lm$b.b>
	//* 125  303:if_acmpne       521
				f = f1 + e.c;
	//  126  306:fload           7
	//  127  308:aload_0         
	//  128  309:getfield        #44  <Field lm e>
	//  129  312:getfield        #271 <Field float lm.c>
	//  130  315:fadd            
	//  131  316:fstore          6
			break;

	//* 132  318:goto            521
		case 2: // '\002'
			if(d3 == lm.d.b)
	//* 133  321:aload           28
	//* 134  323:getstatic       #257 <Field lm$d lm$d.b>
	//* 135  326:if_acmpne       344
				f1 = this.l.o() - f1;
	//  136  329:aload_0         
	//  137  330:getfield        #260 <Field oa l>
	//  138  333:invokevirtual   #272 <Method float oa.o()>
	//  139  336:fload           7
	//  140  338:fsub            
	//  141  339:fstore          7
			else
	//* 142  341:goto            356
				f1 = this.l.h() - f1;
	//  143  344:aload_0         
	//  144  345:getfield        #260 <Field oa l>
	//  145  348:invokevirtual   #274 <Method float oa.h()>
	//  146  351:fload           7
	//  147  353:fsub            
	//  148  354:fstore          7
			f = f1;
	//  149  356:fload           7
	//  150  358:fstore          6
			if(b1 == lm.b.e)
	//* 151  360:aload           25
	//* 152  362:getstatic       #276 <Field lm$b lm$b.e>
	//* 153  365:if_acmpne       521
				f = f1 - e.c;
	//  154  368:fload           7
	//  155  370:aload_0         
	//  156  371:getfield        #44  <Field lm e>
	//  157  374:getfield        #271 <Field float lm.c>
	//  158  377:fsub            
	//  159  378:fstore          6
			break;

	//* 160  380:goto            521
		case 3: // '\003'
			if(d3 == lm.d.b)
	//* 161  383:aload           28
	//* 162  385:getstatic       #257 <Field lm$d lm$d.b>
	//* 163  388:if_acmpne       405
				f = this.l.o() / 2.0F;
	//  164  391:aload_0         
	//  165  392:getfield        #260 <Field oa l>
	//  166  395:invokevirtual   #272 <Method float oa.o()>
	//  167  398:fconst_2        
	//  168  399:fdiv            
	//  169  400:fstore          6
			else
	//* 170  402:goto            424
				f = this.l.f() + this.l.g() / 2.0F;
	//  171  405:aload_0         
	//  172  406:getfield        #260 <Field oa l>
	//  173  409:invokevirtual   #264 <Method float oa.f()>
	//  174  412:aload_0         
	//  175  413:getfield        #260 <Field oa l>
	//  176  416:invokevirtual   #277 <Method float oa.g()>
	//  177  419:fconst_2        
	//  178  420:fdiv            
	//  179  421:fadd            
	//  180  422:fstore          6
			float f3;
			if(b1 == lm.b.e)
	//* 181  424:aload           25
	//* 182  426:getstatic       #276 <Field lm$b lm$b.e>
	//* 183  429:if_acmpne       439
				f3 = f1;
	//  184  432:fload           7
	//  185  434:fstore          8
			else
	//* 186  436:goto            444
				f3 = -f1;
	//  187  439:fload           7
	//  188  441:fneg            
	//  189  442:fstore          8
			f3 = f + f3;
	//  190  444:fload           6
	//  191  446:fload           8
	//  192  448:fadd            
	//  193  449:fstore          8
			f = f3;
	//  194  451:fload           8
	//  195  453:fstore          6
			if(d3 == lm.d.b)
	//* 196  455:aload           28
	//* 197  457:getstatic       #257 <Field lm$d lm$d.b>
	//* 198  460:if_acmpne       521
			{
				double d2 = f3;
	//  199  463:fload           8
	//  200  465:f2d             
	//  201  466:dstore          4
				double d1;
				if(b1 == lm.b.e)
	//* 202  468:aload           25
	//* 203  470:getstatic       #276 <Field lm$b lm$b.e>
	//* 204  473:if_acmpne       497
					d1 = (double)(-e.c) / 2D + (double)f1;
	//  205  476:aload_0         
	//  206  477:getfield        #44  <Field lm e>
	//  207  480:getfield        #271 <Field float lm.c>
	//  208  483:fneg            
	//  209  484:f2d             
	//  210  485:ldc2w           #278 <Double 2D>
	//  211  488:ddiv            
	//  212  489:fload           7
	//  213  491:f2d             
	//  214  492:dadd            
	//  215  493:dstore_2        
				else
	//* 216  494:goto            514
					d1 = (double)e.c / 2D - (double)f1;
	//  217  497:aload_0         
	//  218  498:getfield        #44  <Field lm e>
	//  219  501:getfield        #271 <Field float lm.c>
	//  220  504:f2d             
	//  221  505:ldc2w           #278 <Double 2D>
	//  222  508:ddiv            
	//  223  509:fload           7
	//  224  511:f2d             
	//  225  512:dsub            
	//  226  513:dstore_2        
				f = (float)(d2 + d1);
	//  227  514:dload           4
	//  228  516:dload_2         
	//  229  517:dadd            
	//  230  518:d2f             
	//  231  519:fstore          6
			}
			break;
		}
		float f13;
		boolean flag1;
		switch(_cls5.c[d3.ordinal()])
	//* 232  521:getstatic       #281 <Field int[] np$5.c>
	//* 233  524:aload           28
	//* 234  526:invokevirtual   #282 <Method int lm$d.ordinal()>
	//* 235  529:iaload          
		{
	//* 236  530:lookupswitch    2: default 556
	//	               1: 557
	//	               2: 1212
		default:
			return;
	//  237  556:return          

		case 1: // '\001'
			List list = e.q();
	//  238  557:aload_0         
	//  239  558:getfield        #44  <Field lm e>
	//  240  561:invokevirtual   #286 <Method List lm.q()>
	//  241  564:astore          28
			List list1 = e.r();
	//  242  566:aload_0         
	//  243  567:getfield        #44  <Field lm e>
	//  244  570:invokevirtual   #289 <Method List lm.r()>
	//  245  573:astore          29
			List list2 = e.t();
	//  246  575:aload_0         
	//  247  576:getfield        #44  <Field lm e>
	//  248  579:invokevirtual   #292 <Method List lm.t()>
	//  249  582:astore          30
			float f4 = f;
	//  250  584:fload           6
	//  251  586:fstore          8
			f1 = 0.0F;
	//  252  588:fconst_0        
	//  253  589:fstore          7
			switch(_cls5.a[((lm.k) (obj)).ordinal()])
	//* 254  591:getstatic       #294 <Field int[] np$5.a>
	//* 255  594:aload           27
	//* 256  596:invokevirtual   #297 <Method int lm$k.ordinal()>
	//* 257  599:iaload          
			{
	//* 258  600:tableswitch     1 3: default 628
	//	               1 631
	//	               2 638
	//	               3 661
	//* 259  628:goto            683
			case 1: // '\001'
				f1 = f6;
	//  260  631:fload           9
	//  261  633:fstore          7
				break;

	//* 262  635:goto            683
			case 2: // '\002'
				f1 = this.l.n() - f6 - e.d;
	//  263  638:aload_0         
	//  264  639:getfield        #260 <Field oa l>
	//  265  642:invokevirtual   #298 <Method float oa.n()>
	//  266  645:fload           9
	//  267  647:fsub            
	//  268  648:aload_0         
	//  269  649:getfield        #44  <Field lm e>
	//  270  652:getfield        #300 <Field float lm.d>
	//  271  655:fsub            
	//  272  656:fstore          7
				break;

	//* 273  658:goto            683
			case 3: // '\003'
				f1 = (this.l.n() - e.d) / 2.0F + f6;
	//  274  661:aload_0         
	//  275  662:getfield        #260 <Field oa l>
	//  276  665:invokevirtual   #298 <Method float oa.n()>
	//  277  668:aload_0         
	//  278  669:getfield        #44  <Field lm e>
	//  279  672:getfield        #300 <Field float lm.d>
	//  280  675:fsub            
	//  281  676:fconst_2        
	//  282  677:fdiv            
	//  283  678:fload           9
	//  284  680:fadd            
	//  285  681:fstore          7
				break;
			}
			int l = 0;
	//  286  683:iconst_0        
	//  287  684:istore          22
			int i = 0;
	//  288  686:iconst_0        
	//  289  687:istore          19
			int i1 = ali.length;
	//  290  689:aload           24
	//  291  691:arraylength     
	//  292  692:istore          23
			f6 = f1;
	//  293  694:fload           7
	//  294  696:fstore          9
			while(i < i1) 
	//* 295  698:iload           19
	//* 296  700:iload           23
	//* 297  702:icmpge          1211
			{
				obj = ((Object) (ali[i]));
	//  298  705:aload           24
	//  299  707:iload           19
	//  300  709:aaload          
	//  301  710:astore          27
				boolean flag;
				if(((li) (obj)).d != lm.c.c)
	//* 302  712:aload           27
	//* 303  714:getfield        #105 <Field lm$c li.d>
	//* 304  717:getstatic       #302 <Field lm$c lm$c.c>
	//* 305  720:if_acmpeq       729
					flag = true;
	//  306  723:iconst_1        
	//  307  724:istore          20
				else
	//* 308  726:goto            732
					flag = false;
	//  309  729:iconst_0        
	//  310  730:istore          20
				float f14;
				if(Float.isNaN(((li) (obj)).e))
	//* 311  732:aload           27
	//* 312  734:getfield        #121 <Field float li.e>
	//* 313  737:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//* 314  740:ifeq            750
					f14 = f11;
	//  315  743:fload           11
	//  316  745:fstore          13
				else
	//* 317  747:goto            760
					f14 = oc.b(((li) (obj)).e);
	//  318  750:aload           27
	//  319  752:getfield        #121 <Field float li.e>
	//  320  755:invokestatic    #55  <Method float oc.b(float)>
	//  321  758:fstore          13
				f1 = f4;
	//  322  760:fload           8
	//  323  762:fstore          7
				float f12 = f6;
	//  324  764:fload           9
	//  325  766:fstore          12
				if(i < list2.size())
	//* 326  768:iload           19
	//* 327  770:aload           30
	//* 328  772:invokeinterface #307 <Method int List.size()>
	//* 329  777:icmpge          820
				{
					f1 = f4;
	//  330  780:fload           8
	//  331  782:fstore          7
					f12 = f6;
	//  332  784:fload           9
	//  333  786:fstore          12
					if(((Boolean)list2.get(i)).booleanValue())
	//* 334  788:aload           30
	//* 335  790:iload           19
	//* 336  792:invokeinterface #311 <Method Object List.get(int)>
	//* 337  797:checkcast       #313 <Class Boolean>
	//* 338  800:invokevirtual   #316 <Method boolean Boolean.booleanValue()>
	//* 339  803:ifeq            820
					{
						f1 = f;
	//  340  806:fload           6
	//  341  808:fstore          7
						f12 = f6 + (f18 + f19);
	//  342  810:fload           9
	//  343  812:fload           16
	//  344  814:fload           17
	//  345  816:fadd            
	//  346  817:fadd            
	//  347  818:fstore          12
					}
				}
				f4 = f1;
	//  348  820:fload           7
	//  349  822:fstore          8
				int k = l;
	//  350  824:iload           22
	//  351  826:istore          21
				if(f1 == f)
	//* 352  828:fload           7
	//* 353  830:fload           6
	//* 354  832:fcmpl           
	//* 355  833:ifne            933
				{
					f4 = f1;
	//  356  836:fload           7
	//  357  838:fstore          8
					k = l;
	//  358  840:iload           22
	//  359  842:istore          21
					if(a1 == lm.a.c)
	//* 360  844:aload           26
	//* 361  846:getstatic       #319 <Field lm$a lm$a.c>
	//* 362  849:if_acmpne       933
					{
						f4 = f1;
	//  363  852:fload           7
	//  364  854:fstore          8
						k = l;
	//  365  856:iload           22
	//  366  858:istore          21
						if(l < list.size())
	//* 367  860:iload           22
	//* 368  862:aload           28
	//* 369  864:invokeinterface #307 <Method int List.size()>
	//* 370  869:icmpge          933
						{
							if(b1 == lm.b.b)
	//* 371  872:aload           25
	//* 372  874:getstatic       #269 <Field lm$b lm$b.b>
	//* 373  877:if_acmpne       900
								f4 = ((nr)list.get(l)).a;
	//  374  880:aload           28
	//  375  882:iload           22
	//  376  884:invokeinterface #311 <Method Object List.get(int)>
	//  377  889:checkcast       #321 <Class nr>
	//  378  892:getfield        #322 <Field float nr.a>
	//  379  895:fstore          8
							else
	//* 380  897:goto            918
								f4 = -((nr)list.get(l)).a;
	//  381  900:aload           28
	//  382  902:iload           22
	//  383  904:invokeinterface #311 <Method Object List.get(int)>
	//  384  909:checkcast       #321 <Class nr>
	//  385  912:getfield        #322 <Field float nr.a>
	//  386  915:fneg            
	//  387  916:fstore          8
							f4 = f1 + f4 / 2.0F;
	//  388  918:fload           7
	//  389  920:fload           8
	//  390  922:fconst_2        
	//  391  923:fdiv            
	//  392  924:fadd            
	//  393  925:fstore          8
							k = l + 1;
	//  394  927:iload           22
	//  395  929:iconst_1        
	//  396  930:iadd            
	//  397  931:istore          21
						}
					}
				}
				if(((li) (obj)).c == null)
	//* 398  933:aload           27
	//* 399  935:getfield        #325 <Field String li.c>
	//* 400  938:ifnonnull       947
					l = 1;
	//  401  941:iconst_1        
	//  402  942:istore          22
				else
	//* 403  944:goto            950
					l = 0;
	//  404  947:iconst_0        
	//  405  948:istore          22
				f1 = f4;
	//  406  950:fload           8
	//  407  952:fstore          7
				if(flag)
	//* 408  954:iload           20
	//* 409  956:ifeq            1015
				{
					f6 = f4;
	//  410  959:fload           8
	//  411  961:fstore          9
					if(b1 == lm.b.b)
	//* 412  963:aload           25
	//* 413  965:getstatic       #269 <Field lm$b lm$b.b>
	//* 414  968:if_acmpne       978
						f6 = f4 - f14;
	//  415  971:fload           8
	//  416  973:fload           13
	//  417  975:fsub            
	//  418  976:fstore          9
					c(canvas, f6, f12 + f20, ((li) (obj)), e);
	//  419  978:aload_0         
	//  420  979:aload_1         
	//  421  980:fload           9
	//  422  982:fload           12
	//  423  984:fload           18
	//  424  986:fadd            
	//  425  987:aload           27
	//  426  989:aload_0         
	//  427  990:getfield        #44  <Field lm e>
	//  428  993:invokevirtual   #327 <Method void c(Canvas, float, float, li, lm)>
					f1 = f6;
	//  429  996:fload           9
	//  430  998:fstore          7
					if(b1 == lm.b.e)
	//* 431 1000:aload           25
	//* 432 1002:getstatic       #276 <Field lm$b lm$b.e>
	//* 433 1005:if_acmpne       1015
						f1 = f6 + f14;
	//  434 1008:fload           9
	//  435 1010:fload           13
	//  436 1012:fadd            
	//  437 1013:fstore          7
				}
				if(l == 0)
	//* 438 1015:iload           22
	//* 439 1017:ifne            1167
				{
					f4 = f1;
	//  440 1020:fload           7
	//  441 1022:fstore          8
					if(flag)
	//* 442 1024:iload           20
	//* 443 1026:ifeq            1056
					{
						if(b1 == lm.b.b)
	//* 444 1029:aload           25
	//* 445 1031:getstatic       #269 <Field lm$b lm$b.b>
	//* 446 1034:if_acmpne       1045
							f4 = -f10;
	//  447 1037:fload           10
	//  448 1039:fneg            
	//  449 1040:fstore          8
						else
	//* 450 1042:goto            1049
							f4 = f10;
	//  451 1045:fload           10
	//  452 1047:fstore          8
						f4 = f1 + f4;
	//  453 1049:fload           7
	//  454 1051:fload           8
	//  455 1053:fadd            
	//  456 1054:fstore          8
					}
					f1 = f4;
	//  457 1056:fload           8
	//  458 1058:fstore          7
					if(b1 == lm.b.b)
	//* 459 1060:aload           25
	//* 460 1062:getstatic       #269 <Field lm$b lm$b.b>
	//* 461 1065:if_acmpne       1088
						f1 = f4 - ((nr)list1.get(i)).a;
	//  462 1068:fload           8
	//  463 1070:aload           29
	//  464 1072:iload           19
	//  465 1074:invokeinterface #311 <Method Object List.get(int)>
	//  466 1079:checkcast       #321 <Class nr>
	//  467 1082:getfield        #322 <Field float nr.a>
	//  468 1085:fsub            
	//  469 1086:fstore          7
					b(canvas, f1, f12 + f18, ((li) (obj)).c);
	//  470 1088:aload_0         
	//  471 1089:aload_1         
	//  472 1090:fload           7
	//  473 1092:fload           12
	//  474 1094:fload           16
	//  475 1096:fadd            
	//  476 1097:aload           27
	//  477 1099:getfield        #325 <Field String li.c>
	//  478 1102:invokevirtual   #329 <Method void b(Canvas, float, float, String)>
					f4 = f1;
	//  479 1105:fload           7
	//  480 1107:fstore          8
					if(b1 == lm.b.e)
	//* 481 1109:aload           25
	//* 482 1111:getstatic       #276 <Field lm$b lm$b.e>
	//* 483 1114:if_acmpne       1137
						f4 = f1 + ((nr)list1.get(i)).a;
	//  484 1117:fload           7
	//  485 1119:aload           29
	//  486 1121:iload           19
	//  487 1123:invokeinterface #311 <Method Object List.get(int)>
	//  488 1128:checkcast       #321 <Class nr>
	//  489 1131:getfield        #322 <Field float nr.a>
	//  490 1134:fadd            
	//  491 1135:fstore          8
					if(b1 == lm.b.b)
	//* 492 1137:aload           25
	//* 493 1139:getstatic       #269 <Field lm$b lm$b.b>
	//* 494 1142:if_acmpne       1153
						f1 = -f17;
	//  495 1145:fload           15
	//  496 1147:fneg            
	//  497 1148:fstore          7
					else
	//* 498 1150:goto            1157
						f1 = f17;
	//  499 1153:fload           15
	//  500 1155:fstore          7
					f4 += f1;
	//  501 1157:fload           8
	//  502 1159:fload           7
	//  503 1161:fadd            
	//  504 1162:fstore          8
				} else
	//* 505 1164:goto            1194
				{
					if(b1 == lm.b.b)
	//* 506 1167:aload           25
	//* 507 1169:getstatic       #269 <Field lm$b lm$b.b>
	//* 508 1172:if_acmpne       1183
						f4 = -f16;
	//  509 1175:fload           14
	//  510 1177:fneg            
	//  511 1178:fstore          8
					else
	//* 512 1180:goto            1187
						f4 = f16;
	//  513 1183:fload           14
	//  514 1185:fstore          8
					f4 = f1 + f4;
	//  515 1187:fload           7
	//  516 1189:fload           8
	//  517 1191:fadd            
	//  518 1192:fstore          8
				}
				i++;
	//  519 1194:iload           19
	//  520 1196:iconst_1        
	//  521 1197:iadd            
	//  522 1198:istore          19
				f6 = f12;
	//  523 1200:fload           12
	//  524 1202:fstore          9
				l = k;
	//  525 1204:iload           21
	//  526 1206:istore          22
			}
	//* 527 1208:goto            698
			return;
	//  528 1211:return          

		case 2: // '\002'
			f13 = 0.0F;
	//  529 1212:fconst_0        
	//  530 1213:fstore          12
			flag1 = false;
	//  531 1215:iconst_0        
	//  532 1216:istore          20
			f1 = 0.0F;
	//  533 1218:fconst_0        
	//  534 1219:fstore          7
			break;
		}
		switch(_cls5.a[((lm.k) (obj)).ordinal()])
	//* 535 1221:getstatic       #294 <Field int[] np$5.a>
	//* 536 1224:aload           27
	//* 537 1226:invokevirtual   #297 <Method int lm$k.ordinal()>
	//* 538 1229:iaload          
		{
		default:
			break;

	//* 539 1230:tableswitch     1 3: default 1256
	//	               1 1259
	//	               2 1292
	//	               3 1339
	//* 540 1256:goto            1368
		case 1: // '\001'
			if(a1 == lm.a.c)
	//* 541 1259:aload           26
	//* 542 1261:getstatic       #319 <Field lm$a lm$a.c>
	//* 543 1264:if_acmpne       1273
				f1 = 0.0F;
	//  544 1267:fconst_0        
	//  545 1268:fstore          7
			else
	//* 546 1270:goto            1282
				f1 = this.l.e();
	//  547 1273:aload_0         
	//  548 1274:getfield        #260 <Field oa l>
	//  549 1277:invokevirtual   #331 <Method float oa.e()>
	//  550 1280:fstore          7
			f1 += f6;
	//  551 1282:fload           7
	//  552 1284:fload           9
	//  553 1286:fadd            
	//  554 1287:fstore          7
			break;
	//  555 1289:goto            1368

		case 2: // '\002'
			if(a1 == lm.a.c)
	//* 556 1292:aload           26
	//* 557 1294:getstatic       #319 <Field lm$a lm$a.c>
	//* 558 1297:if_acmpne       1312
				f1 = this.l.n();
	//  559 1300:aload_0         
	//  560 1301:getfield        #260 <Field oa l>
	//  561 1304:invokevirtual   #298 <Method float oa.n()>
	//  562 1307:fstore          7
			else
	//* 563 1309:goto            1321
				f1 = this.l.i();
	//  564 1312:aload_0         
	//  565 1313:getfield        #260 <Field oa l>
	//  566 1316:invokevirtual   #333 <Method float oa.i()>
	//  567 1319:fstore          7
			f1 -= e.d + f6;
	//  568 1321:fload           7
	//  569 1323:aload_0         
	//  570 1324:getfield        #44  <Field lm e>
	//  571 1327:getfield        #300 <Field float lm.d>
	//  572 1330:fload           9
	//  573 1332:fadd            
	//  574 1333:fsub            
	//  575 1334:fstore          7
			break;

	//* 576 1336:goto            1368
		case 3: // '\003'
			f1 = (this.l.n() / 2.0F - e.d / 2.0F) + e.y();
	//  577 1339:aload_0         
	//  578 1340:getfield        #260 <Field oa l>
	//  579 1343:invokevirtual   #298 <Method float oa.n()>
	//  580 1346:fconst_2        
	//  581 1347:fdiv            
	//  582 1348:aload_0         
	//  583 1349:getfield        #44  <Field lm e>
	//  584 1352:getfield        #300 <Field float lm.d>
	//  585 1355:fconst_2        
	//  586 1356:fdiv            
	//  587 1357:fsub            
	//  588 1358:aload_0         
	//  589 1359:getfield        #44  <Field lm e>
	//  590 1362:invokevirtual   #244 <Method float lm.y()>
	//  591 1365:fadd            
	//  592 1366:fstore          7
			break;
		}
		int j = 0;
	//  593 1368:iconst_0        
	//  594 1369:istore          19
		float f5 = f1;
	//  595 1371:fload           7
	//  596 1373:fstore          8
		while(j < ali.length) 
	//* 597 1375:iload           19
	//* 598 1377:aload           24
	//* 599 1379:arraylength     
	//* 600 1380:icmpge          1697
		{
			li li1 = ali[j];
	//  601 1383:aload           24
	//  602 1385:iload           19
	//  603 1387:aaload          
	//  604 1388:astore          26
			boolean flag2;
			if(li1.d != lm.c.c)
	//* 605 1390:aload           26
	//* 606 1392:getfield        #105 <Field lm$c li.d>
	//* 607 1395:getstatic       #302 <Field lm$c lm$c.c>
	//* 608 1398:if_acmpeq       1407
				flag2 = true;
	//  609 1401:iconst_1        
	//  610 1402:istore          21
			else
	//* 611 1404:goto            1410
				flag2 = false;
	//  612 1407:iconst_0        
	//  613 1408:istore          21
			float f15;
			if(Float.isNaN(li1.e))
	//* 614 1410:aload           26
	//* 615 1412:getfield        #121 <Field float li.e>
	//* 616 1415:invokestatic    #127 <Method boolean Float.isNaN(float)>
	//* 617 1418:ifeq            1428
				f15 = f11;
	//  618 1421:fload           11
	//  619 1423:fstore          13
			else
	//* 620 1425:goto            1438
				f15 = oc.b(li1.e);
	//  621 1428:aload           26
	//  622 1430:getfield        #121 <Field float li.e>
	//  623 1433:invokestatic    #55  <Method float oc.b(float)>
	//  624 1436:fstore          13
			float f7 = f;
	//  625 1438:fload           6
	//  626 1440:fstore          9
			float f2 = f7;
	//  627 1442:fload           9
	//  628 1444:fstore          7
			if(flag2)
	//* 629 1446:iload           21
	//* 630 1448:ifeq            1516
			{
				if(b1 == lm.b.e)
	//* 631 1451:aload           25
	//* 632 1453:getstatic       #276 <Field lm$b lm$b.e>
	//* 633 1456:if_acmpne       1469
					f7 += f13;
	//  634 1459:fload           9
	//  635 1461:fload           12
	//  636 1463:fadd            
	//  637 1464:fstore          9
				else
	//* 638 1466:goto            1479
					f7 -= f15 - f13;
	//  639 1469:fload           9
	//  640 1471:fload           13
	//  641 1473:fload           12
	//  642 1475:fsub            
	//  643 1476:fsub            
	//  644 1477:fstore          9
				c(canvas, f7, f5 + f20, li1, e);
	//  645 1479:aload_0         
	//  646 1480:aload_1         
	//  647 1481:fload           9
	//  648 1483:fload           8
	//  649 1485:fload           18
	//  650 1487:fadd            
	//  651 1488:aload           26
	//  652 1490:aload_0         
	//  653 1491:getfield        #44  <Field lm e>
	//  654 1494:invokevirtual   #327 <Method void c(Canvas, float, float, li, lm)>
				f2 = f7;
	//  655 1497:fload           9
	//  656 1499:fstore          7
				if(b1 == lm.b.e)
	//* 657 1501:aload           25
	//* 658 1503:getstatic       #276 <Field lm$b lm$b.e>
	//* 659 1506:if_acmpne       1516
					f2 = f7 + f15;
	//  660 1509:fload           9
	//  661 1511:fload           13
	//  662 1513:fadd            
	//  663 1514:fstore          7
			}
			if(li1.c != null)
	//* 664 1516:aload           26
	//* 665 1518:getfield        #325 <Field String li.c>
	//* 666 1521:ifnull          1671
			{
				if(flag2 && !flag1)
	//* 667 1524:iload           21
	//* 668 1526:ifeq            1564
	//* 669 1529:iload           20
	//* 670 1531:ifne            1564
				{
					float f8;
					if(b1 == lm.b.e)
	//* 671 1534:aload           25
	//* 672 1536:getstatic       #276 <Field lm$b lm$b.e>
	//* 673 1539:if_acmpne       1549
						f8 = f10;
	//  674 1542:fload           10
	//  675 1544:fstore          9
					else
	//* 676 1546:goto            1554
						f8 = -f10;
	//  677 1549:fload           10
	//  678 1551:fneg            
	//  679 1552:fstore          9
					f2 += f8;
	//  680 1554:fload           7
	//  681 1556:fload           9
	//  682 1558:fadd            
	//  683 1559:fstore          7
				} else
	//* 684 1561:goto            1573
				if(flag1)
	//* 685 1564:iload           20
	//* 686 1566:ifeq            1573
					f2 = f;
	//  687 1569:fload           6
	//  688 1571:fstore          7
				float f9 = f2;
	//  689 1573:fload           7
	//  690 1575:fstore          9
				if(b1 == lm.b.b)
	//* 691 1577:aload           25
	//* 692 1579:getstatic       #269 <Field lm$b lm$b.b>
	//* 693 1582:if_acmpne       1603
					f9 = f2 - (float)oc.d(d, li1.c);
	//  694 1585:fload           7
	//  695 1587:aload_0         
	//  696 1588:getfield        #49  <Field Paint d>
	//  697 1591:aload           26
	//  698 1593:getfield        #325 <Field String li.c>
	//  699 1596:invokestatic    #335 <Method int oc.d(Paint, String)>
	//  700 1599:i2f             
	//  701 1600:fsub            
	//  702 1601:fstore          9
				if(!flag1)
	//* 703 1603:iload           20
	//* 704 1605:ifne            1628
				{
					b(canvas, f9, f5 + f18, li1.c);
	//  705 1608:aload_0         
	//  706 1609:aload_1         
	//  707 1610:fload           9
	//  708 1612:fload           8
	//  709 1614:fload           16
	//  710 1616:fadd            
	//  711 1617:aload           26
	//  712 1619:getfield        #325 <Field String li.c>
	//  713 1622:invokevirtual   #329 <Method void b(Canvas, float, float, String)>
				} else
	//* 714 1625:goto            1655
				{
					f5 += f18 + f19;
	//  715 1628:fload           8
	//  716 1630:fload           16
	//  717 1632:fload           17
	//  718 1634:fadd            
	//  719 1635:fadd            
	//  720 1636:fstore          8
					b(canvas, f9, f5 + f18, li1.c);
	//  721 1638:aload_0         
	//  722 1639:aload_1         
	//  723 1640:fload           9
	//  724 1642:fload           8
	//  725 1644:fload           16
	//  726 1646:fadd            
	//  727 1647:aload           26
	//  728 1649:getfield        #325 <Field String li.c>
	//  729 1652:invokevirtual   #329 <Method void b(Canvas, float, float, String)>
				}
				f5 += f18 + f19;
	//  730 1655:fload           8
	//  731 1657:fload           16
	//  732 1659:fload           17
	//  733 1661:fadd            
	//  734 1662:fadd            
	//  735 1663:fstore          8
				f2 = 0.0F;
	//  736 1665:fconst_0        
	//  737 1666:fstore          7
			} else
	//* 738 1668:goto            1684
			{
				f2 = f13 + (f15 + f16);
	//  739 1671:fload           12
	//  740 1673:fload           13
	//  741 1675:fload           14
	//  742 1677:fadd            
	//  743 1678:fadd            
	//  744 1679:fstore          7
				flag1 = true;
	//  745 1681:iconst_1        
	//  746 1682:istore          20
			}
			j++;
	//  747 1684:iload           19
	//  748 1686:iconst_1        
	//  749 1687:iadd            
	//  750 1688:istore          19
			f13 = f2;
	//  751 1690:fload           7
	//  752 1692:fstore          12
		}
	//* 753 1694:goto            1375
	//  754 1697:return          
	}

	public void e(ma ma1)
	{
		if(!e.b())
	//*   0    0:aload_0         
	//*   1    1:getfield        #44  <Field lm e>
	//*   2    4:invokevirtual   #338 <Method boolean lm.b()>
	//*   3    7:ifne            720
		{
			b.clear();
	//    4   10:aload_0         
	//    5   11:getfield        #30  <Field List b>
	//    6   14:invokeinterface #341 <Method void List.clear()>
label0:
			for(int i = 0; i < ma1.e(); i++)
	//*   7   19:iconst_0        
	//*   8   20:istore_2        
	//*   9   21:iload_2         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #345 <Method int ma.e()>
	//*  12   26:icmpge          684
			{
				mz mz1 = ma1.a(i);
	//   13   29:aload_1         
	//   14   30:iload_2         
	//   15   31:invokevirtual   #348 <Method mz ma.a(int)>
	//   16   34:astore          6
				List list = mz1.k();
	//   17   36:aload           6
	//   18   38:invokeinterface #352 <Method List mz.k()>
	//   19   43:astore          7
				int j1 = mz1.C();
	//   20   45:aload           6
	//   21   47:invokeinterface #355 <Method int mz.C()>
	//   22   52:istore          4
				if((mz1 instanceof mt) && ((mt)mz1).a())
	//*  23   54:aload           6
	//*  24   56:instanceof      #357 <Class mt>
	//*  25   59:ifeq            238
	//*  26   62:aload           6
	//*  27   64:checkcast       #357 <Class mt>
	//*  28   67:invokeinterface #359 <Method boolean mt.a()>
	//*  29   72:ifeq            238
				{
					mt mt1 = (mt)mz1;
	//   30   75:aload           6
	//   31   77:checkcast       #357 <Class mt>
	//   32   80:astore          5
					String as[] = mt1.g();
	//   33   82:aload           5
	//   34   84:invokeinterface #362 <Method String[] mt.g()>
	//   35   89:astore          8
					for(int j = 0; j < list.size() && j < mt1.d(); j++)
	//*  36   91:iconst_0        
	//*  37   92:istore_3        
	//*  38   93:iload_3         
	//*  39   94:aload           7
	//*  40   96:invokeinterface #307 <Method int List.size()>
	//*  41  101:icmpge          189
	//*  42  104:iload_3         
	//*  43  105:aload           5
	//*  44  107:invokeinterface #364 <Method int mt.d()>
	//*  45  112:icmpge          189
						b.add(((Object) (new li(as[j % as.length], mz1.q(), mz1.u(), mz1.w(), mz1.y(), ((Integer)list.get(j)).intValue()))));
	//   46  115:aload_0         
	//   47  116:getfield        #30  <Field List b>
	//   48  119:new             #92  <Class li>
	//   49  122:dup             
	//   50  123:aload           8
	//   51  125:iload_3         
	//   52  126:aload           8
	//   53  128:arraylength     
	//   54  129:irem            
	//   55  130:aaload          
	//   56  131:aload           6
	//   57  133:invokeinterface #366 <Method lm$c mz.q()>
	//   58  138:aload           6
	//   59  140:invokeinterface #369 <Method float mz.u()>
	//   60  145:aload           6
	//   61  147:invokeinterface #372 <Method float mz.w()>
	//   62  152:aload           6
	//   63  154:invokeinterface #374 <Method android.graphics.DashPathEffect mz.y()>
	//   64  159:aload           7
	//   65  161:iload_3         
	//   66  162:invokeinterface #311 <Method Object List.get(int)>
	//   67  167:checkcast       #376 <Class Integer>
	//   68  170:invokevirtual   #379 <Method int Integer.intValue()>
	//   69  173:invokespecial   #382 <Method void li(String, lm$c, float, float, android.graphics.DashPathEffect, int)>
	//   70  176:invokeinterface #386 <Method boolean List.add(Object)>
	//   71  181:pop             

	//   72  182:iload_3         
	//   73  183:iconst_1        
	//   74  184:iadd            
	//   75  185:istore_3        
	//*  76  186:goto            93
					if(mt1.o() != null)
	//*  77  189:aload           5
	//*  78  191:invokeinterface #389 <Method String mt.o()>
	//*  79  196:ifnull          235
						b.add(((Object) (new li(mz1.o(), lm.c.c, (0.0F / 0.0F), (0.0F / 0.0F), ((android.graphics.DashPathEffect) (null)), 0x112233))));
	//   80  199:aload_0         
	//   81  200:getfield        #30  <Field List b>
	//   82  203:new             #92  <Class li>
	//   83  206:dup             
	//   84  207:aload           6
	//   85  209:invokeinterface #390 <Method String mz.o()>
	//   86  214:getstatic       #302 <Field lm$c lm$c.c>
	//   87  217:ldc2            #391 <Float (0.0F / 0.0F)>
	//   88  220:ldc2            #391 <Float (0.0F / 0.0F)>
	//   89  223:aconst_null     
	//   90  224:ldc1            #98  <Int 0x112233>
	//   91  226:invokespecial   #382 <Method void li(String, lm$c, float, float, android.graphics.DashPathEffect, int)>
	//   92  229:invokeinterface #386 <Method boolean List.add(Object)>
	//   93  234:pop             
					continue;
	//   94  235:goto            677
				}
				if(mz1 instanceof mx)
	//*  95  238:aload           6
	//*  96  240:instanceof      #393 <Class mx>
	//*  97  243:ifeq            401
				{
					mx mx1 = (mx)mz1;
	//   98  246:aload           6
	//   99  248:checkcast       #393 <Class mx>
	//  100  251:astore          5
					for(int k = 0; k < list.size() && k < j1; k++)
	//* 101  253:iconst_0        
	//* 102  254:istore_3        
	//* 103  255:iload_3         
	//* 104  256:aload           7
	//* 105  258:invokeinterface #307 <Method int List.size()>
	//* 106  263:icmpge          352
	//* 107  266:iload_3         
	//* 108  267:iload           4
	//* 109  269:icmpge          352
						b.add(((Object) (new li(((PieEntry)mx1.f(k)).getLabel(), mz1.q(), mz1.u(), mz1.w(), mz1.y(), ((Integer)list.get(k)).intValue()))));
	//  110  272:aload_0         
	//  111  273:getfield        #30  <Field List b>
	//  112  276:new             #92  <Class li>
	//  113  279:dup             
	//  114  280:aload           5
	//  115  282:iload_3         
	//  116  283:invokeinterface #396 <Method com.github.mikephil.charting.data.Entry mx.f(int)>
	//  117  288:checkcast       #398 <Class PieEntry>
	//  118  291:invokevirtual   #401 <Method String PieEntry.getLabel()>
	//  119  294:aload           6
	//  120  296:invokeinterface #366 <Method lm$c mz.q()>
	//  121  301:aload           6
	//  122  303:invokeinterface #369 <Method float mz.u()>
	//  123  308:aload           6
	//  124  310:invokeinterface #372 <Method float mz.w()>
	//  125  315:aload           6
	//  126  317:invokeinterface #374 <Method android.graphics.DashPathEffect mz.y()>
	//  127  322:aload           7
	//  128  324:iload_3         
	//  129  325:invokeinterface #311 <Method Object List.get(int)>
	//  130  330:checkcast       #376 <Class Integer>
	//  131  333:invokevirtual   #379 <Method int Integer.intValue()>
	//  132  336:invokespecial   #382 <Method void li(String, lm$c, float, float, android.graphics.DashPathEffect, int)>
	//  133  339:invokeinterface #386 <Method boolean List.add(Object)>
	//  134  344:pop             

	//  135  345:iload_3         
	//  136  346:iconst_1        
	//  137  347:iadd            
	//  138  348:istore_3        
	//* 139  349:goto            255
					if(mx1.o() != null)
	//* 140  352:aload           5
	//* 141  354:invokeinterface #402 <Method String mx.o()>
	//* 142  359:ifnull          398
						b.add(((Object) (new li(mz1.o(), lm.c.c, (0.0F / 0.0F), (0.0F / 0.0F), ((android.graphics.DashPathEffect) (null)), 0x112233))));
	//  143  362:aload_0         
	//  144  363:getfield        #30  <Field List b>
	//  145  366:new             #92  <Class li>
	//  146  369:dup             
	//  147  370:aload           6
	//  148  372:invokeinterface #390 <Method String mz.o()>
	//  149  377:getstatic       #302 <Field lm$c lm$c.c>
	//  150  380:ldc2            #391 <Float (0.0F / 0.0F)>
	//  151  383:ldc2            #391 <Float (0.0F / 0.0F)>
	//  152  386:aconst_null     
	//  153  387:ldc1            #98  <Int 0x112233>
	//  154  389:invokespecial   #382 <Method void li(String, lm$c, float, float, android.graphics.DashPathEffect, int)>
	//  155  392:invokeinterface #386 <Method boolean List.add(Object)>
	//  156  397:pop             
					continue;
	//  157  398:goto            677
				}
				if((mz1 instanceof ms) && ((ms)mz1).a() != 0x112233)
	//* 158  401:aload           6
	//* 159  403:instanceof      #404 <Class ms>
	//* 160  406:ifeq            551
	//* 161  409:aload           6
	//* 162  411:checkcast       #404 <Class ms>
	//* 163  414:invokeinterface #406 <Method int ms.a()>
	//* 164  419:ldc1            #98  <Int 0x112233>
	//* 165  421:icmpeq          551
				{
					int l = ((ms)mz1).a();
	//  166  424:aload           6
	//  167  426:checkcast       #404 <Class ms>
	//  168  429:invokeinterface #406 <Method int ms.a()>
	//  169  434:istore_3        
					j1 = ((ms)mz1).e();
	//  170  435:aload           6
	//  171  437:checkcast       #404 <Class ms>
	//  172  440:invokeinterface #407 <Method int ms.e()>
	//  173  445:istore          4
					b.add(((Object) (new li(((String) (null)), mz1.q(), mz1.u(), mz1.w(), mz1.y(), l))));
	//  174  447:aload_0         
	//  175  448:getfield        #30  <Field List b>
	//  176  451:new             #92  <Class li>
	//  177  454:dup             
	//  178  455:aconst_null     
	//  179  456:aload           6
	//  180  458:invokeinterface #366 <Method lm$c mz.q()>
	//  181  463:aload           6
	//  182  465:invokeinterface #369 <Method float mz.u()>
	//  183  470:aload           6
	//  184  472:invokeinterface #372 <Method float mz.w()>
	//  185  477:aload           6
	//  186  479:invokeinterface #374 <Method android.graphics.DashPathEffect mz.y()>
	//  187  484:iload_3         
	//  188  485:invokespecial   #382 <Method void li(String, lm$c, float, float, android.graphics.DashPathEffect, int)>
	//  189  488:invokeinterface #386 <Method boolean List.add(Object)>
	//  190  493:pop             
					b.add(((Object) (new li(mz1.o(), mz1.q(), mz1.u(), mz1.w(), mz1.y(), j1))));
	//  191  494:aload_0         
	//  192  495:getfield        #30  <Field List b>
	//  193  498:new             #92  <Class li>
	//  194  501:dup             
	//  195  502:aload           6
	//  196  504:invokeinterface #390 <Method String mz.o()>
	//  197  509:aload           6
	//  198  511:invokeinterface #366 <Method lm$c mz.q()>
	//  199  516:aload           6
	//  200  518:invokeinterface #369 <Method float mz.u()>
	//  201  523:aload           6
	//  202  525:invokeinterface #372 <Method float mz.w()>
	//  203  530:aload           6
	//  204  532:invokeinterface #374 <Method android.graphics.DashPathEffect mz.y()>
	//  205  537:iload           4
	//  206  539:invokespecial   #382 <Method void li(String, lm$c, float, float, android.graphics.DashPathEffect, int)>
	//  207  542:invokeinterface #386 <Method boolean List.add(Object)>
	//  208  547:pop             
					continue;
	//  209  548:goto            677
				}
				int i1 = 0;
	//  210  551:iconst_0        
	//  211  552:istore_3        
				do
				{
					if(i1 >= list.size() || i1 >= j1)
						continue label0;
	//  212  553:iload_3         
	//  213  554:aload           7
	//  214  556:invokeinterface #307 <Method int List.size()>
	//  215  561:icmpge          677
	//  216  564:iload_3         
	//  217  565:iload           4
	//  218  567:icmpge          677
					String s;
					if(i1 < list.size() - 1 && i1 < j1 - 1)
	//* 219  570:iload_3         
	//* 220  571:aload           7
	//* 221  573:invokeinterface #307 <Method int List.size()>
	//* 222  578:iconst_1        
	//* 223  579:isub            
	//* 224  580:icmpge          597
	//* 225  583:iload_3         
	//* 226  584:iload           4
	//* 227  586:iconst_1        
	//* 228  587:isub            
	//* 229  588:icmpge          597
						s = null;
	//  230  591:aconst_null     
	//  231  592:astore          5
					else
	//* 232  594:goto            609
						s = ma1.a(i).o();
	//  233  597:aload_1         
	//  234  598:iload_2         
	//  235  599:invokevirtual   #348 <Method mz ma.a(int)>
	//  236  602:invokeinterface #390 <Method String mz.o()>
	//  237  607:astore          5
					b.add(((Object) (new li(s, mz1.q(), mz1.u(), mz1.w(), mz1.y(), ((Integer)list.get(i1)).intValue()))));
	//  238  609:aload_0         
	//  239  610:getfield        #30  <Field List b>
	//  240  613:new             #92  <Class li>
	//  241  616:dup             
	//  242  617:aload           5
	//  243  619:aload           6
	//  244  621:invokeinterface #366 <Method lm$c mz.q()>
	//  245  626:aload           6
	//  246  628:invokeinterface #369 <Method float mz.u()>
	//  247  633:aload           6
	//  248  635:invokeinterface #372 <Method float mz.w()>
	//  249  640:aload           6
	//  250  642:invokeinterface #374 <Method android.graphics.DashPathEffect mz.y()>
	//  251  647:aload           7
	//  252  649:iload_3         
	//  253  650:invokeinterface #311 <Method Object List.get(int)>
	//  254  655:checkcast       #376 <Class Integer>
	//  255  658:invokevirtual   #379 <Method int Integer.intValue()>
	//  256  661:invokespecial   #382 <Method void li(String, lm$c, float, float, android.graphics.DashPathEffect, int)>
	//  257  664:invokeinterface #386 <Method boolean List.add(Object)>
	//  258  669:pop             
					i1++;
	//  259  670:iload_3         
	//  260  671:iconst_1        
	//  261  672:iadd            
	//  262  673:istore_3        
				} while(true);
	//  263  674:goto            553
			}

	//  264  677:iload_2         
	//  265  678:iconst_1        
	//  266  679:iadd            
	//  267  680:istore_2        
	//* 268  681:goto            21
			if(e.c() != null)
	//* 269  684:aload_0         
	//* 270  685:getfield        #44  <Field lm e>
	//* 271  688:invokevirtual   #409 <Method li[] lm.c()>
	//* 272  691:ifnull          709
				Collections.addAll(((java.util.Collection) (b)), ((Object []) (e.c())));
	//  273  694:aload_0         
	//  274  695:getfield        #30  <Field List b>
	//  275  698:aload_0         
	//  276  699:getfield        #44  <Field lm e>
	//  277  702:invokevirtual   #409 <Method li[] lm.c()>
	//  278  705:invokestatic    #415 <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//  279  708:pop             
			e.b(b);
	//  280  709:aload_0         
	//  281  710:getfield        #44  <Field lm e>
	//  282  713:aload_0         
	//  283  714:getfield        #30  <Field List b>
	//  284  717:invokevirtual   #418 <Method void lm.b(List)>
		}
		ma1 = ((ma) (e.x()));
	//  285  720:aload_0         
	//  286  721:getfield        #44  <Field lm e>
	//  287  724:invokevirtual   #193 <Method android.graphics.Typeface lm.x()>
	//  288  727:astore_1        
		if(ma1 != null)
	//* 289  728:aload_1         
	//* 290  729:ifnull          741
			d.setTypeface(((android.graphics.Typeface) (ma1)));
	//  291  732:aload_0         
	//  292  733:getfield        #49  <Field Paint d>
	//  293  736:aload_1         
	//  294  737:invokevirtual   #197 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//  295  740:pop             
		d.setTextSize(e.z());
	//  296  741:aload_0         
	//  297  742:getfield        #49  <Field Paint d>
	//  298  745:aload_0         
	//  299  746:getfield        #44  <Field lm e>
	//  300  749:invokevirtual   #200 <Method float lm.z()>
	//  301  752:invokevirtual   #59  <Method void Paint.setTextSize(float)>
		d.setColor(e.A());
	//  302  755:aload_0         
	//  303  756:getfield        #49  <Field Paint d>
	//  304  759:aload_0         
	//  305  760:getfield        #44  <Field lm e>
	//  306  763:invokevirtual   #203 <Method int lm.A()>
	//  307  766:invokevirtual   #118 <Method void Paint.setColor(int)>
		e.c(d, this.l);
	//  308  769:aload_0         
	//  309  770:getfield        #44  <Field lm e>
	//  310  773:aload_0         
	//  311  774:getfield        #49  <Field Paint d>
	//  312  777:aload_0         
	//  313  778:getfield        #260 <Field oa l>
	//  314  781:invokevirtual   #421 <Method void lm.c(Paint, oa)>
	//  315  784:return          
	}

	protected Paint a;
	protected List b;
	protected android.graphics.Paint.FontMetrics c;
	protected Paint d;
	protected lm e;
	private Path h;
}
