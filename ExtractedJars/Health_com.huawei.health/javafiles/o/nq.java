// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import java.util.List;

// Referenced classes of package o:
//			nu, oa, lh, ln, 
//			nz, oc, nr, nv, 
//			nw, mf, lq, kz

public class nq extends nu
{

	public nq(oa oa1, ln ln1, nv nv1, kz kz)
	{
		super(oa1, ln1, nv1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method void nu(oa, ln, nv)>
		t = new Path();
	//    5    7:aload_0         
	//    6    8:new             #15  <Class Path>
	//    7   11:dup             
	//    8   12:invokespecial   #18  <Method void Path()>
	//    9   15:putfield        #20  <Field Path t>
		p = kz;
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:putfield        #22  <Field kz p>
	//   13   24:return          
	}

	public RectF a()
	{
		f.set(l.m());
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RectF f>
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field oa l>
	//    4    8:invokevirtual   #38  <Method RectF oa.m()>
	//    5   11:invokevirtual   #44  <Method void RectF.set(RectF)>
		f.inset(0.0F, -c.i());
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field RectF f>
	//    8   18:fconst_0        
	//    9   19:aload_0         
	//   10   20:getfield        #48  <Field lh c>
	//   11   23:invokevirtual   #54  <Method float lh.i()>
	//   12   26:fneg            
	//   13   27:invokevirtual   #58  <Method void RectF.inset(float, float)>
		return f;
	//   14   30:aload_0         
	//   15   31:getfield        #29  <Field RectF f>
	//   16   34:areturn         
	}

	public void b(Canvas canvas)
	{
		if(!i.c() || !i.B())
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field ln i>
	//*   2    4:invokevirtual   #68  <Method boolean ln.c()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #63  <Field ln i>
	//*   6   14:invokevirtual   #71  <Method boolean ln.B()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		b.setColor(i.k());
	//    9   21:aload_0         
	//   10   22:getfield        #74  <Field Paint b>
	//   11   25:aload_0         
	//   12   26:getfield        #63  <Field ln i>
	//   13   29:invokevirtual   #78  <Method int ln.k()>
	//   14   32:invokevirtual   #84  <Method void Paint.setColor(int)>
		b.setStrokeWidth(i.d());
	//   15   35:aload_0         
	//   16   36:getfield        #74  <Field Paint b>
	//   17   39:aload_0         
	//   18   40:getfield        #63  <Field ln i>
	//   19   43:invokevirtual   #87  <Method float ln.d()>
	//   20   46:invokevirtual   #91  <Method void Paint.setStrokeWidth(float)>
		if(i.j() == ln.e.d || i.j() == ln.e.c || i.j() == ln.e.a)
	//*  21   49:aload_0         
	//*  22   50:getfield        #63  <Field ln i>
	//*  23   53:invokevirtual   #95  <Method ln$e ln.j()>
	//*  24   56:getstatic       #100 <Field ln$e ln$e.d>
	//*  25   59:if_acmpeq       88
	//*  26   62:aload_0         
	//*  27   63:getfield        #63  <Field ln i>
	//*  28   66:invokevirtual   #95  <Method ln$e ln.j()>
	//*  29   69:getstatic       #102 <Field ln$e ln$e.c>
	//*  30   72:if_acmpeq       88
	//*  31   75:aload_0         
	//*  32   76:getfield        #63  <Field ln i>
	//*  33   79:invokevirtual   #95  <Method ln$e ln.j()>
	//*  34   82:getstatic       #104 <Field ln$e ln$e.a>
	//*  35   85:if_acmpne       124
			canvas.drawLine(l.h(), l.e(), l.h(), l.i(), b);
	//   36   88:aload_1         
	//   37   89:aload_0         
	//   38   90:getfield        #33  <Field oa l>
	//   39   93:invokevirtual   #107 <Method float oa.h()>
	//   40   96:aload_0         
	//   41   97:getfield        #33  <Field oa l>
	//   42  100:invokevirtual   #110 <Method float oa.e()>
	//   43  103:aload_0         
	//   44  104:getfield        #33  <Field oa l>
	//   45  107:invokevirtual   #107 <Method float oa.h()>
	//   46  110:aload_0         
	//   47  111:getfield        #33  <Field oa l>
	//   48  114:invokevirtual   #111 <Method float oa.i()>
	//   49  117:aload_0         
	//   50  118:getfield        #74  <Field Paint b>
	//   51  121:invokevirtual   #117 <Method void Canvas.drawLine(float, float, float, float, Paint)>
		if(i.j() == ln.e.e || i.j() == ln.e.b || i.j() == ln.e.a)
	//*  52  124:aload_0         
	//*  53  125:getfield        #63  <Field ln i>
	//*  54  128:invokevirtual   #95  <Method ln$e ln.j()>
	//*  55  131:getstatic       #119 <Field ln$e ln$e.e>
	//*  56  134:if_acmpeq       163
	//*  57  137:aload_0         
	//*  58  138:getfield        #63  <Field ln i>
	//*  59  141:invokevirtual   #95  <Method ln$e ln.j()>
	//*  60  144:getstatic       #121 <Field ln$e ln$e.b>
	//*  61  147:if_acmpeq       163
	//*  62  150:aload_0         
	//*  63  151:getfield        #63  <Field ln i>
	//*  64  154:invokevirtual   #95  <Method ln$e ln.j()>
	//*  65  157:getstatic       #104 <Field ln$e ln$e.a>
	//*  66  160:if_acmpne       199
			canvas.drawLine(l.f(), l.e(), l.f(), l.i(), b);
	//   67  163:aload_1         
	//   68  164:aload_0         
	//   69  165:getfield        #33  <Field oa l>
	//   70  168:invokevirtual   #123 <Method float oa.f()>
	//   71  171:aload_0         
	//   72  172:getfield        #33  <Field oa l>
	//   73  175:invokevirtual   #110 <Method float oa.e()>
	//   74  178:aload_0         
	//   75  179:getfield        #33  <Field oa l>
	//   76  182:invokevirtual   #123 <Method float oa.f()>
	//   77  185:aload_0         
	//   78  186:getfield        #33  <Field oa l>
	//   79  189:invokevirtual   #111 <Method float oa.i()>
	//   80  192:aload_0         
	//   81  193:getfield        #74  <Field Paint b>
	//   82  196:invokevirtual   #117 <Method void Canvas.drawLine(float, float, float, float, Paint)>
	//   83  199:return          
	}

	public void c(Canvas canvas)
	{
		if(!i.B() || !i.g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field ln i>
	//*   2    4:invokevirtual   #71  <Method boolean ln.B()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #63  <Field ln i>
	//*   6   14:invokevirtual   #126 <Method boolean ln.g()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float f = i.v();
	//    9   21:aload_0         
	//   10   22:getfield        #63  <Field ln i>
	//   11   25:invokevirtual   #129 <Method float ln.v()>
	//   12   28:fstore_2        
		a.setTypeface(i.x());
	//   13   29:aload_0         
	//   14   30:getfield        #131 <Field Paint a>
	//   15   33:aload_0         
	//   16   34:getfield        #63  <Field ln i>
	//   17   37:invokevirtual   #135 <Method android.graphics.Typeface ln.x()>
	//   18   40:invokevirtual   #139 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   19   43:pop             
		a.setTextSize(i.z());
	//   20   44:aload_0         
	//   21   45:getfield        #131 <Field Paint a>
	//   22   48:aload_0         
	//   23   49:getfield        #63  <Field ln i>
	//   24   52:invokevirtual   #142 <Method float ln.z()>
	//   25   55:invokevirtual   #145 <Method void Paint.setTextSize(float)>
		a.setColor(i.A());
	//   26   58:aload_0         
	//   27   59:getfield        #131 <Field Paint a>
	//   28   62:aload_0         
	//   29   63:getfield        #63  <Field ln i>
	//   30   66:invokevirtual   #148 <Method int ln.A()>
	//   31   69:invokevirtual   #84  <Method void Paint.setColor(int)>
		nz nz1 = nz.d(0.0F, 0.0F);
	//   32   72:fconst_0        
	//   33   73:fconst_0        
	//   34   74:invokestatic    #153 <Method nz nz.d(float, float)>
	//   35   77:astore_3        
		if(i.j() == ln.e.d)
	//*  36   78:aload_0         
	//*  37   79:getfield        #63  <Field ln i>
	//*  38   82:invokevirtual   #95  <Method ln$e ln.j()>
	//*  39   85:getstatic       #100 <Field ln$e ln$e.d>
	//*  40   88:if_acmpne       120
		{
			nz1.e = 0.0F;
	//   41   91:aload_3         
	//   42   92:fconst_0        
	//   43   93:putfield        #156 <Field float nz.e>
			nz1.c = 0.5F;
	//   44   96:aload_3         
	//   45   97:ldc1            #157 <Float 0.5F>
	//   46   99:putfield        #159 <Field float nz.c>
			d(canvas, l.h() + f, nz1);
	//   47  102:aload_0         
	//   48  103:aload_1         
	//   49  104:aload_0         
	//   50  105:getfield        #33  <Field oa l>
	//   51  108:invokevirtual   #107 <Method float oa.h()>
	//   52  111:fload_2         
	//   53  112:fadd            
	//   54  113:aload_3         
	//   55  114:invokevirtual   #162 <Method void d(Canvas, float, nz)>
		} else
	//*  56  117:goto            298
		if(i.j() == ln.e.c)
	//*  57  120:aload_0         
	//*  58  121:getfield        #63  <Field ln i>
	//*  59  124:invokevirtual   #95  <Method ln$e ln.j()>
	//*  60  127:getstatic       #102 <Field ln$e ln$e.c>
	//*  61  130:if_acmpne       162
		{
			nz1.e = 1.0F;
	//   62  133:aload_3         
	//   63  134:fconst_1        
	//   64  135:putfield        #156 <Field float nz.e>
			nz1.c = 0.5F;
	//   65  138:aload_3         
	//   66  139:ldc1            #157 <Float 0.5F>
	//   67  141:putfield        #159 <Field float nz.c>
			d(canvas, l.h() - f, nz1);
	//   68  144:aload_0         
	//   69  145:aload_1         
	//   70  146:aload_0         
	//   71  147:getfield        #33  <Field oa l>
	//   72  150:invokevirtual   #107 <Method float oa.h()>
	//   73  153:fload_2         
	//   74  154:fsub            
	//   75  155:aload_3         
	//   76  156:invokevirtual   #162 <Method void d(Canvas, float, nz)>
		} else
	//*  77  159:goto            298
		if(i.j() == ln.e.e)
	//*  78  162:aload_0         
	//*  79  163:getfield        #63  <Field ln i>
	//*  80  166:invokevirtual   #95  <Method ln$e ln.j()>
	//*  81  169:getstatic       #119 <Field ln$e ln$e.e>
	//*  82  172:if_acmpne       204
		{
			nz1.e = 1.0F;
	//   83  175:aload_3         
	//   84  176:fconst_1        
	//   85  177:putfield        #156 <Field float nz.e>
			nz1.c = 0.5F;
	//   86  180:aload_3         
	//   87  181:ldc1            #157 <Float 0.5F>
	//   88  183:putfield        #159 <Field float nz.c>
			d(canvas, l.f() - f, nz1);
	//   89  186:aload_0         
	//   90  187:aload_1         
	//   91  188:aload_0         
	//   92  189:getfield        #33  <Field oa l>
	//   93  192:invokevirtual   #123 <Method float oa.f()>
	//   94  195:fload_2         
	//   95  196:fsub            
	//   96  197:aload_3         
	//   97  198:invokevirtual   #162 <Method void d(Canvas, float, nz)>
		} else
	//*  98  201:goto            298
		if(i.j() == ln.e.b)
	//*  99  204:aload_0         
	//* 100  205:getfield        #63  <Field ln i>
	//* 101  208:invokevirtual   #95  <Method ln$e ln.j()>
	//* 102  211:getstatic       #121 <Field ln$e ln$e.b>
	//* 103  214:if_acmpne       246
		{
			nz1.e = 1.0F;
	//  104  217:aload_3         
	//  105  218:fconst_1        
	//  106  219:putfield        #156 <Field float nz.e>
			nz1.c = 0.5F;
	//  107  222:aload_3         
	//  108  223:ldc1            #157 <Float 0.5F>
	//  109  225:putfield        #159 <Field float nz.c>
			d(canvas, l.f() + f, nz1);
	//  110  228:aload_0         
	//  111  229:aload_1         
	//  112  230:aload_0         
	//  113  231:getfield        #33  <Field oa l>
	//  114  234:invokevirtual   #123 <Method float oa.f()>
	//  115  237:fload_2         
	//  116  238:fadd            
	//  117  239:aload_3         
	//  118  240:invokevirtual   #162 <Method void d(Canvas, float, nz)>
		} else
	//* 119  243:goto            298
		{
			nz1.e = 0.0F;
	//  120  246:aload_3         
	//  121  247:fconst_0        
	//  122  248:putfield        #156 <Field float nz.e>
			nz1.c = 0.5F;
	//  123  251:aload_3         
	//  124  252:ldc1            #157 <Float 0.5F>
	//  125  254:putfield        #159 <Field float nz.c>
			d(canvas, l.h() + f, nz1);
	//  126  257:aload_0         
	//  127  258:aload_1         
	//  128  259:aload_0         
	//  129  260:getfield        #33  <Field oa l>
	//  130  263:invokevirtual   #107 <Method float oa.h()>
	//  131  266:fload_2         
	//  132  267:fadd            
	//  133  268:aload_3         
	//  134  269:invokevirtual   #162 <Method void d(Canvas, float, nz)>
			nz1.e = 1.0F;
	//  135  272:aload_3         
	//  136  273:fconst_1        
	//  137  274:putfield        #156 <Field float nz.e>
			nz1.c = 0.5F;
	//  138  277:aload_3         
	//  139  278:ldc1            #157 <Float 0.5F>
	//  140  280:putfield        #159 <Field float nz.c>
			d(canvas, l.f() - f, nz1);
	//  141  283:aload_0         
	//  142  284:aload_1         
	//  143  285:aload_0         
	//  144  286:getfield        #33  <Field oa l>
	//  145  289:invokevirtual   #123 <Method float oa.f()>
	//  146  292:fload_2         
	//  147  293:fsub            
	//  148  294:aload_3         
	//  149  295:invokevirtual   #162 <Method void d(Canvas, float, nz)>
		}
		nz.c(nz1);
	//  150  298:aload_3         
	//  151  299:invokestatic    #165 <Method void nz.c(nz)>
	//  152  302:return          
	}

	protected void d()
	{
		a.setTypeface(i.x());
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field Paint a>
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field ln i>
	//    4    8:invokevirtual   #135 <Method android.graphics.Typeface ln.x()>
	//    5   11:invokevirtual   #139 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//    6   14:pop             
		a.setTextSize(i.z());
	//    7   15:aload_0         
	//    8   16:getfield        #131 <Field Paint a>
	//    9   19:aload_0         
	//   10   20:getfield        #63  <Field ln i>
	//   11   23:invokevirtual   #142 <Method float ln.z()>
	//   12   26:invokevirtual   #145 <Method void Paint.setTextSize(float)>
		Object obj = ((Object) (i.n()));
	//   13   29:aload_0         
	//   14   30:getfield        #63  <Field ln i>
	//   15   33:invokevirtual   #169 <Method String ln.n()>
	//   16   36:astore_3        
		obj = ((Object) (oc.a(a, ((String) (obj)))));
	//   17   37:aload_0         
	//   18   38:getfield        #131 <Field Paint a>
	//   19   41:aload_3         
	//   20   42:invokestatic    #174 <Method nr oc.a(Paint, String)>
	//   21   45:astore_3        
		float f = (int)(((nr) (obj)).a + i.v() * 3.5F);
	//   22   46:aload_3         
	//   23   47:getfield        #178 <Field float nr.a>
	//   24   50:aload_0         
	//   25   51:getfield        #63  <Field ln i>
	//   26   54:invokevirtual   #129 <Method float ln.v()>
	//   27   57:ldc1            #179 <Float 3.5F>
	//   28   59:fmul            
	//   29   60:fadd            
	//   30   61:f2i             
	//   31   62:i2f             
	//   32   63:fstore_1        
		float f1 = ((nr) (obj)).d;
	//   33   64:aload_3         
	//   34   65:getfield        #181 <Field float nr.d>
	//   35   68:fstore_2        
		obj = ((Object) (oc.d(((nr) (obj)).a, f1, i.C())));
	//   36   69:aload_3         
	//   37   70:getfield        #178 <Field float nr.a>
	//   38   73:fload_2         
	//   39   74:aload_0         
	//   40   75:getfield        #63  <Field ln i>
	//   41   78:invokevirtual   #184 <Method float ln.C()>
	//   42   81:invokestatic    #187 <Method nr oc.d(float, float, float)>
	//   43   84:astore_3        
		i.C = Math.round(f);
	//   44   85:aload_0         
	//   45   86:getfield        #63  <Field ln i>
	//   46   89:fload_1         
	//   47   90:invokestatic    #193 <Method int Math.round(float)>
	//   48   93:putfield        #196 <Field int ln.C>
		i.j = Math.round(f1);
	//   49   96:aload_0         
	//   50   97:getfield        #63  <Field ln i>
	//   51  100:fload_2         
	//   52  101:invokestatic    #193 <Method int Math.round(float)>
	//   53  104:putfield        #198 <Field int ln.j>
		i.B = (int)(((nr) (obj)).a + i.v() * 3.5F);
	//   54  107:aload_0         
	//   55  108:getfield        #63  <Field ln i>
	//   56  111:aload_3         
	//   57  112:getfield        #178 <Field float nr.a>
	//   58  115:aload_0         
	//   59  116:getfield        #63  <Field ln i>
	//   60  119:invokevirtual   #129 <Method float ln.v()>
	//   61  122:ldc1            #179 <Float 3.5F>
	//   62  124:fmul            
	//   63  125:fadd            
	//   64  126:f2i             
	//   65  127:putfield        #200 <Field int ln.B>
		i.I = Math.round(((nr) (obj)).d);
	//   66  130:aload_0         
	//   67  131:getfield        #63  <Field ln i>
	//   68  134:aload_3         
	//   69  135:getfield        #181 <Field float nr.d>
	//   70  138:invokestatic    #193 <Method int Math.round(float)>
	//   71  141:putfield        #202 <Field int ln.I>
		nr.b(((nr) (obj)));
	//   72  144:aload_3         
	//   73  145:invokestatic    #205 <Method void nr.b(nr)>
	//   74  148:return          
	}

	public void d(float f, float f1, boolean flag)
	{
		float f3 = f;
	//    0    0:fload_1         
	//    1    1:fstore          5
		float f2 = f1;
	//    2    3:fload_2         
	//    3    4:fstore          4
		if(l.g() > 10F)
	//*   4    6:aload_0         
	//*   5    7:getfield        #33  <Field oa l>
	//*   6   10:invokevirtual   #208 <Method float oa.g()>
	//*   7   13:ldc1            #209 <Float 10F>
	//*   8   15:fcmpl           
	//*   9   16:ifle            132
		{
			f3 = f;
	//   10   19:fload_1         
	//   11   20:fstore          5
			f2 = f1;
	//   12   22:fload_2         
	//   13   23:fstore          4
			if(!l.s())
	//*  14   25:aload_0         
	//*  15   26:getfield        #33  <Field oa l>
	//*  16   29:invokevirtual   #212 <Method boolean oa.s()>
	//*  17   32:ifne            132
			{
				nw nw1 = e.b(l.f(), l.i());
	//   18   35:aload_0         
	//   19   36:getfield        #215 <Field nv e>
	//   20   39:aload_0         
	//   21   40:getfield        #33  <Field oa l>
	//   22   43:invokevirtual   #123 <Method float oa.f()>
	//   23   46:aload_0         
	//   24   47:getfield        #33  <Field oa l>
	//   25   50:invokevirtual   #111 <Method float oa.i()>
	//   26   53:invokevirtual   #220 <Method nw nv.b(float, float)>
	//   27   56:astore          6
				nw nw2 = e.b(l.f(), l.e());
	//   28   58:aload_0         
	//   29   59:getfield        #215 <Field nv e>
	//   30   62:aload_0         
	//   31   63:getfield        #33  <Field oa l>
	//   32   66:invokevirtual   #123 <Method float oa.f()>
	//   33   69:aload_0         
	//   34   70:getfield        #33  <Field oa l>
	//   35   73:invokevirtual   #110 <Method float oa.e()>
	//   36   76:invokevirtual   #220 <Method nw nv.b(float, float)>
	//   37   79:astore          7
				if(flag)
	//*  38   81:iload_3         
	//*  39   82:ifeq            102
				{
					f = (float)nw2.c;
	//   40   85:aload           7
	//   41   87:getfield        #225 <Field double nw.c>
	//   42   90:d2f             
	//   43   91:fstore_1        
					f1 = (float)nw1.c;
	//   44   92:aload           6
	//   45   94:getfield        #225 <Field double nw.c>
	//   46   97:d2f             
	//   47   98:fstore_2        
				} else
	//*  48   99:goto            116
				{
					f = (float)nw1.c;
	//   49  102:aload           6
	//   50  104:getfield        #225 <Field double nw.c>
	//   51  107:d2f             
	//   52  108:fstore_1        
					f1 = (float)nw2.c;
	//   53  109:aload           7
	//   54  111:getfield        #225 <Field double nw.c>
	//   55  114:d2f             
	//   56  115:fstore_2        
				}
				nw.e(nw1);
	//   57  116:aload           6
	//   58  118:invokestatic    #228 <Method void nw.e(nw)>
				nw.e(nw2);
	//   59  121:aload           7
	//   60  123:invokestatic    #228 <Method void nw.e(nw)>
				f2 = f1;
	//   61  126:fload_2         
	//   62  127:fstore          4
				f3 = f;
	//   63  129:fload_1         
	//   64  130:fstore          5
			}
		}
		d(f3, f2);
	//   65  132:aload_0         
	//   66  133:fload           5
	//   67  135:fload           4
	//   68  137:invokevirtual   #230 <Method void d(float, float)>
	//   69  140:return          
	}

	protected void d(Canvas canvas, float f, float f1, Path path)
	{
		path.moveTo(l.h(), f1);
	//    0    0:aload           4
	//    1    2:aload_0         
	//    2    3:getfield        #33  <Field oa l>
	//    3    6:invokevirtual   #107 <Method float oa.h()>
	//    4    9:fload_3         
	//    5   10:invokevirtual   #234 <Method void Path.moveTo(float, float)>
		path.lineTo(l.f(), f1);
	//    6   13:aload           4
	//    7   15:aload_0         
	//    8   16:getfield        #33  <Field oa l>
	//    9   19:invokevirtual   #123 <Method float oa.f()>
	//   10   22:fload_3         
	//   11   23:invokevirtual   #237 <Method void Path.lineTo(float, float)>
		canvas.drawPath(path, d);
	//   12   26:aload_1         
	//   13   27:aload           4
	//   14   29:aload_0         
	//   15   30:getfield        #239 <Field Paint d>
	//   16   33:invokevirtual   #243 <Method void Canvas.drawPath(Path, Paint)>
		path.reset();
	//   17   36:aload           4
	//   18   38:invokevirtual   #246 <Method void Path.reset()>
	//   19   41:return          
	}

	protected void d(Canvas canvas, float f, nz nz1)
	{
		float f1 = this.i.C();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ln i>
	//    2    4:invokevirtual   #184 <Method float ln.C()>
	//    3    7:fstore          4
		boolean flag = this.i.b();
	//    4    9:aload_0         
	//    5   10:getfield        #63  <Field ln i>
	//    6   13:invokevirtual   #248 <Method boolean ln.b()>
	//    7   16:istore          7
		float af[] = new float[this.i.d * 2];
	//    8   18:aload_0         
	//    9   19:getfield        #63  <Field ln i>
	//   10   22:getfield        #250 <Field int ln.d>
	//   11   25:iconst_2        
	//   12   26:imul            
	//   13   27:newarray        float[]
	//   14   29:astore          8
		for(int i = 0; i < af.length; i += 2)
	//*  15   31:iconst_0        
	//*  16   32:istore          6
	//*  17   34:iload           6
	//*  18   36:aload           8
	//*  19   38:arraylength     
	//*  20   39:icmpge          97
			if(flag)
	//*  21   42:iload           7
	//*  22   44:ifeq            69
				af[i + 1] = this.i.c[i / 2];
	//   23   47:aload           8
	//   24   49:iload           6
	//   25   51:iconst_1        
	//   26   52:iadd            
	//   27   53:aload_0         
	//   28   54:getfield        #63  <Field ln i>
	//   29   57:getfield        #253 <Field float[] ln.c>
	//   30   60:iload           6
	//   31   62:iconst_2        
	//   32   63:idiv            
	//   33   64:faload          
	//   34   65:fastore         
			else
	//*  35   66:goto            88
				af[i + 1] = this.i.a[i / 2];
	//   36   69:aload           8
	//   37   71:iload           6
	//   38   73:iconst_1        
	//   39   74:iadd            
	//   40   75:aload_0         
	//   41   76:getfield        #63  <Field ln i>
	//   42   79:getfield        #255 <Field float[] ln.a>
	//   43   82:iload           6
	//   44   84:iconst_2        
	//   45   85:idiv            
	//   46   86:faload          
	//   47   87:fastore         

	//   48   88:iload           6
	//   49   90:iconst_2        
	//   50   91:iadd            
	//   51   92:istore          6
	//*  52   94:goto            34
		e.e(af);
	//   53   97:aload_0         
	//   54   98:getfield        #215 <Field nv e>
	//   55  101:aload           8
	//   56  103:invokevirtual   #258 <Method void nv.e(float[])>
		for(int j = 0; j < af.length; j += 2)
	//*  57  106:iconst_0        
	//*  58  107:istore          6
	//*  59  109:iload           6
	//*  60  111:aload           8
	//*  61  113:arraylength     
	//*  62  114:icmpge          186
		{
			float f2 = af[j + 1];
	//   63  117:aload           8
	//   64  119:iload           6
	//   65  121:iconst_1        
	//   66  122:iadd            
	//   67  123:faload          
	//   68  124:fstore          5
			if(l.g(f2))
	//*  69  126:aload_0         
	//*  70  127:getfield        #33  <Field oa l>
	//*  71  130:fload           5
	//*  72  132:invokevirtual   #261 <Method boolean oa.g(float)>
	//*  73  135:ifeq            177
				c(canvas, this.i.r().b(this.i.a[j / 2], ((lh) (this.i))), f, f2, nz1, f1);
	//   74  138:aload_0         
	//   75  139:aload_1         
	//   76  140:aload_0         
	//   77  141:getfield        #63  <Field ln i>
	//   78  144:invokevirtual   #265 <Method mf ln.r()>
	//   79  147:aload_0         
	//   80  148:getfield        #63  <Field ln i>
	//   81  151:getfield        #255 <Field float[] ln.a>
	//   82  154:iload           6
	//   83  156:iconst_2        
	//   84  157:idiv            
	//   85  158:faload          
	//   86  159:aload_0         
	//   87  160:getfield        #63  <Field ln i>
	//   88  163:invokeinterface #270 <Method String mf.b(float, lh)>
	//   89  168:fload_2         
	//   90  169:fload           5
	//   91  171:aload_3         
	//   92  172:fload           4
	//   93  174:invokevirtual   #273 <Method void c(Canvas, String, float, float, nz, float)>
		}

	//   94  177:iload           6
	//   95  179:iconst_2        
	//   96  180:iadd            
	//   97  181:istore          6
	//*  98  183:goto            109
	//   99  186:return          
	}

	public void e(Canvas canvas)
	{
		List list = this.i.l();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ln i>
	//    2    4:invokevirtual   #276 <Method List ln.l()>
	//    3    7:astore          7
		if(list == null || list.size() <= 0)
	//*   4    9:aload           7
	//*   5   11:ifnull          24
	//*   6   14:aload           7
	//*   7   16:invokeinterface #281 <Method int List.size()>
	//*   8   21:ifgt            25
			return;
	//    9   24:return          
		float af[] = o;
	//   10   25:aload_0         
	//   11   26:getfield        #284 <Field float[] o>
	//   12   29:astore          8
		af[0] = 0.0F;
	//   13   31:aload           8
	//   14   33:iconst_0        
	//   15   34:fconst_0        
	//   16   35:fastore         
		af[1] = 0.0F;
	//   17   36:aload           8
	//   18   38:iconst_1        
	//   19   39:fconst_0        
	//   20   40:fastore         
		Path path = t;
	//   21   41:aload_0         
	//   22   42:getfield        #20  <Field Path t>
	//   23   45:astore          9
		path.reset();
	//   24   47:aload           9
	//   25   49:invokevirtual   #246 <Method void Path.reset()>
		for(int i = 0; i < list.size(); i++)
	//*  26   52:iconst_0        
	//*  27   53:istore          5
	//*  28   55:iload           5
	//*  29   57:aload           7
	//*  30   59:invokeinterface #281 <Method int List.size()>
	//*  31   64:icmpge          566
		{
			Object obj = ((Object) ((lq)list.get(i)));
	//   32   67:aload           7
	//   33   69:iload           5
	//   34   71:invokeinterface #288 <Method Object List.get(int)>
	//   35   76:checkcast       #290 <Class lq>
	//   36   79:astore          11
			if(!((lq) (obj)).B())
	//*  37   81:aload           11
	//*  38   83:invokevirtual   #291 <Method boolean lq.B()>
	//*  39   86:ifne            92
				continue;
	//   40   89:goto            557
			int j = canvas.save();
	//   41   92:aload_1         
	//   42   93:invokevirtual   #294 <Method int Canvas.save()>
	//   43   96:istore          6
			n.set(l.m());
	//   44   98:aload_0         
	//   45   99:getfield        #296 <Field RectF n>
	//   46  102:aload_0         
	//   47  103:getfield        #33  <Field oa l>
	//   48  106:invokevirtual   #38  <Method RectF oa.m()>
	//   49  109:invokevirtual   #44  <Method void RectF.set(RectF)>
			n.inset(0.0F, -((lq) (obj)).d());
	//   50  112:aload_0         
	//   51  113:getfield        #296 <Field RectF n>
	//   52  116:fconst_0        
	//   53  117:aload           11
	//   54  119:invokevirtual   #297 <Method float lq.d()>
	//   55  122:fneg            
	//   56  123:invokevirtual   #58  <Method void RectF.inset(float, float)>
			canvas.clipRect(n);
	//   57  126:aload_1         
	//   58  127:aload_0         
	//   59  128:getfield        #296 <Field RectF n>
	//   60  131:invokevirtual   #301 <Method boolean Canvas.clipRect(RectF)>
	//   61  134:pop             
			h.setStyle(android.graphics.Paint.Style.STROKE);
	//   62  135:aload_0         
	//   63  136:getfield        #303 <Field Paint h>
	//   64  139:getstatic       #309 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   65  142:invokevirtual   #313 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			h.setColor(((lq) (obj)).b());
	//   66  145:aload_0         
	//   67  146:getfield        #303 <Field Paint h>
	//   68  149:aload           11
	//   69  151:invokevirtual   #315 <Method int lq.b()>
	//   70  154:invokevirtual   #84  <Method void Paint.setColor(int)>
			h.setStrokeWidth(((lq) (obj)).d());
	//   71  157:aload_0         
	//   72  158:getfield        #303 <Field Paint h>
	//   73  161:aload           11
	//   74  163:invokevirtual   #297 <Method float lq.d()>
	//   75  166:invokevirtual   #91  <Method void Paint.setStrokeWidth(float)>
			h.setPathEffect(((android.graphics.PathEffect) (((lq) (obj)).a())));
	//   76  169:aload_0         
	//   77  170:getfield        #303 <Field Paint h>
	//   78  173:aload           11
	//   79  175:invokevirtual   #318 <Method android.graphics.DashPathEffect lq.a()>
	//   80  178:invokevirtual   #322 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   81  181:pop             
			af[1] = ((lq) (obj)).e();
	//   82  182:aload           8
	//   83  184:iconst_1        
	//   84  185:aload           11
	//   85  187:invokevirtual   #323 <Method float lq.e()>
	//   86  190:fastore         
			e.e(af);
	//   87  191:aload_0         
	//   88  192:getfield        #215 <Field nv e>
	//   89  195:aload           8
	//   90  197:invokevirtual   #258 <Method void nv.e(float[])>
			path.moveTo(l.f(), af[1]);
	//   91  200:aload           9
	//   92  202:aload_0         
	//   93  203:getfield        #33  <Field oa l>
	//   94  206:invokevirtual   #123 <Method float oa.f()>
	//   95  209:aload           8
	//   96  211:iconst_1        
	//   97  212:faload          
	//   98  213:invokevirtual   #234 <Method void Path.moveTo(float, float)>
			path.lineTo(l.h(), af[1]);
	//   99  216:aload           9
	//  100  218:aload_0         
	//  101  219:getfield        #33  <Field oa l>
	//  102  222:invokevirtual   #107 <Method float oa.h()>
	//  103  225:aload           8
	//  104  227:iconst_1        
	//  105  228:faload          
	//  106  229:invokevirtual   #237 <Method void Path.lineTo(float, float)>
			canvas.drawPath(path, h);
	//  107  232:aload_1         
	//  108  233:aload           9
	//  109  235:aload_0         
	//  110  236:getfield        #303 <Field Paint h>
	//  111  239:invokevirtual   #243 <Method void Canvas.drawPath(Path, Paint)>
			path.reset();
	//  112  242:aload           9
	//  113  244:invokevirtual   #246 <Method void Path.reset()>
			String s = ((lq) (obj)).f();
	//  114  247:aload           11
	//  115  249:invokevirtual   #325 <Method String lq.f()>
	//  116  252:astore          10
			if(s != null && !s.equals(""))
	//* 117  254:aload           10
	//* 118  256:ifnull          551
	//* 119  259:aload           10
	//* 120  261:ldc2            #327 <String "">
	//* 121  264:invokevirtual   #333 <Method boolean String.equals(Object)>
	//* 122  267:ifne            551
			{
				h.setStyle(((lq) (obj)).c());
	//  123  270:aload_0         
	//  124  271:getfield        #303 <Field Paint h>
	//  125  274:aload           11
	//  126  276:invokevirtual   #336 <Method android.graphics.Paint$Style lq.c()>
	//  127  279:invokevirtual   #313 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				h.setPathEffect(((android.graphics.PathEffect) (null)));
	//  128  282:aload_0         
	//  129  283:getfield        #303 <Field Paint h>
	//  130  286:aconst_null     
	//  131  287:invokevirtual   #322 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  132  290:pop             
				h.setColor(((lq) (obj)).A());
	//  133  291:aload_0         
	//  134  292:getfield        #303 <Field Paint h>
	//  135  295:aload           11
	//  136  297:invokevirtual   #337 <Method int lq.A()>
	//  137  300:invokevirtual   #84  <Method void Paint.setColor(int)>
				h.setStrokeWidth(0.5F);
	//  138  303:aload_0         
	//  139  304:getfield        #303 <Field Paint h>
	//  140  307:ldc1            #157 <Float 0.5F>
	//  141  309:invokevirtual   #91  <Method void Paint.setStrokeWidth(float)>
				h.setTextSize(((lq) (obj)).z());
	//  142  312:aload_0         
	//  143  313:getfield        #303 <Field Paint h>
	//  144  316:aload           11
	//  145  318:invokevirtual   #338 <Method float lq.z()>
	//  146  321:invokevirtual   #145 <Method void Paint.setTextSize(float)>
				float f = oc.e(h, s);
	//  147  324:aload_0         
	//  148  325:getfield        #303 <Field Paint h>
	//  149  328:aload           10
	//  150  330:invokestatic    #341 <Method int oc.e(Paint, String)>
	//  151  333:i2f             
	//  152  334:fstore_2        
				float f1 = oc.b(4F) + ((lq) (obj)).v();
	//  153  335:ldc2            #342 <Float 4F>
	//  154  338:invokestatic    #345 <Method float oc.b(float)>
	//  155  341:aload           11
	//  156  343:invokevirtual   #346 <Method float lq.v()>
	//  157  346:fadd            
	//  158  347:fstore_3        
				float f2 = ((lq) (obj)).d() + f + ((lq) (obj)).y();
	//  159  348:aload           11
	//  160  350:invokevirtual   #297 <Method float lq.d()>
	//  161  353:fload_2         
	//  162  354:fadd            
	//  163  355:aload           11
	//  164  357:invokevirtual   #349 <Method float lq.y()>
	//  165  360:fadd            
	//  166  361:fstore          4
				obj = ((Object) (((lq) (obj)).k()));
	//  167  363:aload           11
	//  168  365:invokevirtual   #352 <Method lq$e lq.k()>
	//  169  368:astore          11
				if(obj == lq.e.b)
	//* 170  370:aload           11
	//* 171  372:getstatic       #357 <Field lq$e lq$e.b>
	//* 172  375:if_acmpne       419
				{
					h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  173  378:aload_0         
	//  174  379:getfield        #303 <Field Paint h>
	//  175  382:getstatic       #363 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  176  385:invokevirtual   #367 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, l.h() - f1, (af[1] - f2) + f, h);
	//  177  388:aload_1         
	//  178  389:aload           10
	//  179  391:aload_0         
	//  180  392:getfield        #33  <Field oa l>
	//  181  395:invokevirtual   #107 <Method float oa.h()>
	//  182  398:fload_3         
	//  183  399:fsub            
	//  184  400:aload           8
	//  185  402:iconst_1        
	//  186  403:faload          
	//  187  404:fload           4
	//  188  406:fsub            
	//  189  407:fload_2         
	//  190  408:fadd            
	//  191  409:aload_0         
	//  192  410:getfield        #303 <Field Paint h>
	//  193  413:invokevirtual   #371 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 194  416:goto            551
				if(obj == lq.e.a)
	//* 195  419:aload           11
	//* 196  421:getstatic       #373 <Field lq$e lq$e.a>
	//* 197  424:if_acmpne       466
				{
					h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  198  427:aload_0         
	//  199  428:getfield        #303 <Field Paint h>
	//  200  431:getstatic       #363 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  201  434:invokevirtual   #367 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, l.h() - f1, af[1] + f2, h);
	//  202  437:aload_1         
	//  203  438:aload           10
	//  204  440:aload_0         
	//  205  441:getfield        #33  <Field oa l>
	//  206  444:invokevirtual   #107 <Method float oa.h()>
	//  207  447:fload_3         
	//  208  448:fsub            
	//  209  449:aload           8
	//  210  451:iconst_1        
	//  211  452:faload          
	//  212  453:fload           4
	//  213  455:fadd            
	//  214  456:aload_0         
	//  215  457:getfield        #303 <Field Paint h>
	//  216  460:invokevirtual   #371 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 217  463:goto            551
				if(obj == lq.e.c)
	//* 218  466:aload           11
	//* 219  468:getstatic       #375 <Field lq$e lq$e.c>
	//* 220  471:if_acmpne       515
				{
					h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  221  474:aload_0         
	//  222  475:getfield        #303 <Field Paint h>
	//  223  478:getstatic       #378 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  224  481:invokevirtual   #367 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, l.f() + f1, (af[1] - f2) + f, h);
	//  225  484:aload_1         
	//  226  485:aload           10
	//  227  487:aload_0         
	//  228  488:getfield        #33  <Field oa l>
	//  229  491:invokevirtual   #123 <Method float oa.f()>
	//  230  494:fload_3         
	//  231  495:fadd            
	//  232  496:aload           8
	//  233  498:iconst_1        
	//  234  499:faload          
	//  235  500:fload           4
	//  236  502:fsub            
	//  237  503:fload_2         
	//  238  504:fadd            
	//  239  505:aload_0         
	//  240  506:getfield        #303 <Field Paint h>
	//  241  509:invokevirtual   #371 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 242  512:goto            551
				{
					h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  243  515:aload_0         
	//  244  516:getfield        #303 <Field Paint h>
	//  245  519:getstatic       #378 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  246  522:invokevirtual   #367 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, l.a() + f1, af[1] + f2, h);
	//  247  525:aload_1         
	//  248  526:aload           10
	//  249  528:aload_0         
	//  250  529:getfield        #33  <Field oa l>
	//  251  532:invokevirtual   #380 <Method float oa.a()>
	//  252  535:fload_3         
	//  253  536:fadd            
	//  254  537:aload           8
	//  255  539:iconst_1        
	//  256  540:faload          
	//  257  541:fload           4
	//  258  543:fadd            
	//  259  544:aload_0         
	//  260  545:getfield        #303 <Field Paint h>
	//  261  548:invokevirtual   #371 <Method void Canvas.drawText(String, float, float, Paint)>
				}
			}
			canvas.restoreToCount(j);
	//  262  551:aload_1         
	//  263  552:iload           6
	//  264  554:invokevirtual   #383 <Method void Canvas.restoreToCount(int)>
		}

	//  265  557:iload           5
	//  266  559:iconst_1        
	//  267  560:iadd            
	//  268  561:istore          5
	//* 269  563:goto            55
	//  270  566:return          
	}

	protected kz p;
	protected Path t;
}
