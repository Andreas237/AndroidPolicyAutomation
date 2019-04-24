// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import java.util.List;

// Referenced classes of package o:
//			ni, oc, oa, lh, 
//			ln, nv, lq, nz, 
//			nr, nw, mf

public class nu extends ni
{

	public nu(oa oa1, ln ln1, nv nv1)
	{
		super(oa1, nv1, ((lh) (ln1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload_2         
	//    4    4:invokespecial   #21  <Method void ni(oa, nv, lh)>
		g = new Path();
	//    5    7:aload_0         
	//    6    8:new             #23  <Class Path>
	//    7   11:dup             
	//    8   12:invokespecial   #26  <Method void Path()>
	//    9   15:putfield        #28  <Field Path g>
		k = new float[2];
	//   10   18:aload_0         
	//   11   19:iconst_2        
	//   12   20:newarray        float[]
	//   13   22:putfield        #30  <Field float[] k>
		f = new RectF();
	//   14   25:aload_0         
	//   15   26:new             #32  <Class RectF>
	//   16   29:dup             
	//   17   30:invokespecial   #33  <Method void RectF()>
	//   18   33:putfield        #35  <Field RectF f>
		o = new float[2];
	//   19   36:aload_0         
	//   20   37:iconst_2        
	//   21   38:newarray        float[]
	//   22   40:putfield        #37  <Field float[] o>
		n = new RectF();
	//   23   43:aload_0         
	//   24   44:new             #32  <Class RectF>
	//   25   47:dup             
	//   26   48:invokespecial   #33  <Method void RectF()>
	//   27   51:putfield        #39  <Field RectF n>
		m = new float[4];
	//   28   54:aload_0         
	//   29   55:iconst_4        
	//   30   56:newarray        float[]
	//   31   58:putfield        #41  <Field float[] m>
		p = new Path();
	//   32   61:aload_0         
	//   33   62:new             #23  <Class Path>
	//   34   65:dup             
	//   35   66:invokespecial   #26  <Method void Path()>
	//   36   69:putfield        #43  <Field Path p>
		i = ln1;
	//   37   72:aload_0         
	//   38   73:aload_2         
	//   39   74:putfield        #45  <Field ln i>
		a.setColor(0xff000000);
	//   40   77:aload_0         
	//   41   78:getfield        #49  <Field Paint a>
	//   42   81:ldc1            #50  <Int 0xff000000>
	//   43   83:invokevirtual   #56  <Method void Paint.setColor(int)>
		a.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   44   86:aload_0         
	//   45   87:getfield        #49  <Field Paint a>
	//   46   90:getstatic       #62  <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   47   93:invokevirtual   #66  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		a.setTextSize(oc.b(10F));
	//   48   96:aload_0         
	//   49   97:getfield        #49  <Field Paint a>
	//   50  100:ldc1            #67  <Float 10F>
	//   51  102:invokestatic    #73  <Method float oc.b(float)>
	//   52  105:invokevirtual   #77  <Method void Paint.setTextSize(float)>
	//   53  108:return          
	}

	public RectF a()
	{
		f.set(l.m());
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field RectF f>
	//    2    4:aload_0         
	//    3    5:getfield        #83  <Field oa l>
	//    4    8:invokevirtual   #87  <Method RectF oa.m()>
	//    5   11:invokevirtual   #91  <Method void RectF.set(RectF)>
		f.inset(-c.i(), 0.0F);
	//    6   14:aload_0         
	//    7   15:getfield        #35  <Field RectF f>
	//    8   18:aload_0         
	//    9   19:getfield        #95  <Field lh c>
	//   10   22:invokevirtual   #100 <Method float lh.i()>
	//   11   25:fneg            
	//   12   26:fconst_0        
	//   13   27:invokevirtual   #104 <Method void RectF.inset(float, float)>
		return f;
	//   14   30:aload_0         
	//   15   31:getfield        #35  <Field RectF f>
	//   16   34:areturn         
	}

	public void a(Canvas canvas)
	{
		if(!i.e() || !i.B())
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ln i>
	//*   2    4:invokevirtual   #111 <Method boolean ln.e()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #45  <Field ln i>
	//*   6   14:invokevirtual   #114 <Method boolean ln.B()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		int i1 = canvas.save();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #120 <Method int Canvas.save()>
	//   11   25:istore_3        
		canvas.clipRect(a());
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:invokevirtual   #122 <Method RectF a()>
	//   15   31:invokevirtual   #126 <Method boolean Canvas.clipRect(RectF)>
	//   16   34:pop             
		if(k.length != c.d * 2)
	//*  17   35:aload_0         
	//*  18   36:getfield        #30  <Field float[] k>
	//*  19   39:arraylength     
	//*  20   40:aload_0         
	//*  21   41:getfield        #95  <Field lh c>
	//*  22   44:getfield        #130 <Field int lh.d>
	//*  23   47:iconst_2        
	//*  24   48:imul            
	//*  25   49:icmpeq          67
			k = new float[i.d * 2];
	//   26   52:aload_0         
	//   27   53:aload_0         
	//   28   54:getfield        #45  <Field ln i>
	//   29   57:getfield        #131 <Field int ln.d>
	//   30   60:iconst_2        
	//   31   61:imul            
	//   32   62:newarray        float[]
	//   33   64:putfield        #30  <Field float[] k>
		float af[] = k;
	//   34   67:aload_0         
	//   35   68:getfield        #30  <Field float[] k>
	//   36   71:astore          4
		for(int j = 0; j < af.length; j += 2)
	//*  37   73:iconst_0        
	//*  38   74:istore_2        
	//*  39   75:iload_2         
	//*  40   76:aload           4
	//*  41   78:arraylength     
	//*  42   79:icmpge          121
		{
			af[j] = i.a[j / 2];
	//   43   82:aload           4
	//   44   84:iload_2         
	//   45   85:aload_0         
	//   46   86:getfield        #45  <Field ln i>
	//   47   89:getfield        #133 <Field float[] ln.a>
	//   48   92:iload_2         
	//   49   93:iconst_2        
	//   50   94:idiv            
	//   51   95:faload          
	//   52   96:fastore         
			af[j + 1] = i.a[j / 2];
	//   53   97:aload           4
	//   54   99:iload_2         
	//   55  100:iconst_1        
	//   56  101:iadd            
	//   57  102:aload_0         
	//   58  103:getfield        #45  <Field ln i>
	//   59  106:getfield        #133 <Field float[] ln.a>
	//   60  109:iload_2         
	//   61  110:iconst_2        
	//   62  111:idiv            
	//   63  112:faload          
	//   64  113:fastore         
		}

	//   65  114:iload_2         
	//   66  115:iconst_2        
	//   67  116:iadd            
	//   68  117:istore_2        
	//*  69  118:goto            75
		e.e(af);
	//   70  121:aload_0         
	//   71  122:getfield        #136 <Field nv e>
	//   72  125:aload           4
	//   73  127:invokevirtual   #141 <Method void nv.e(float[])>
		b();
	//   74  130:aload_0         
	//   75  131:invokevirtual   #143 <Method void b()>
		Path path = g;
	//   76  134:aload_0         
	//   77  135:getfield        #28  <Field Path g>
	//   78  138:astore          5
		path.reset();
	//   79  140:aload           5
	//   80  142:invokevirtual   #146 <Method void Path.reset()>
		for(int l = 0; l < af.length; l += 2)
	//*  81  145:iconst_0        
	//*  82  146:istore_2        
	//*  83  147:iload_2         
	//*  84  148:aload           4
	//*  85  150:arraylength     
	//*  86  151:icmpge          178
			d(canvas, af[l], af[l + 1], path);
	//   87  154:aload_0         
	//   88  155:aload_1         
	//   89  156:aload           4
	//   90  158:iload_2         
	//   91  159:faload          
	//   92  160:aload           4
	//   93  162:iload_2         
	//   94  163:iconst_1        
	//   95  164:iadd            
	//   96  165:faload          
	//   97  166:aload           5
	//   98  168:invokevirtual   #149 <Method void d(Canvas, float, float, Path)>

	//   99  171:iload_2         
	//  100  172:iconst_2        
	//  101  173:iadd            
	//  102  174:istore_2        
	//* 103  175:goto            147
		canvas.restoreToCount(i1);
	//  104  178:aload_1         
	//  105  179:iload_3         
	//  106  180:invokevirtual   #152 <Method void Canvas.restoreToCount(int)>
	//  107  183:return          
	}

	public void a(Canvas canvas, lq lq1, float af[])
	{
		m[0] = af[0];
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float[] m>
	//    2    4:iconst_0        
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:faload          
	//    6    8:fastore         
		m[1] = l.e();
	//    7    9:aload_0         
	//    8   10:getfield        #41  <Field float[] m>
	//    9   13:iconst_1        
	//   10   14:aload_0         
	//   11   15:getfield        #83  <Field oa l>
	//   12   18:invokevirtual   #155 <Method float oa.e()>
	//   13   21:fastore         
		m[2] = af[0];
	//   14   22:aload_0         
	//   15   23:getfield        #41  <Field float[] m>
	//   16   26:iconst_2        
	//   17   27:aload_3         
	//   18   28:iconst_0        
	//   19   29:faload          
	//   20   30:fastore         
		m[3] = l.i();
	//   21   31:aload_0         
	//   22   32:getfield        #41  <Field float[] m>
	//   23   35:iconst_3        
	//   24   36:aload_0         
	//   25   37:getfield        #83  <Field oa l>
	//   26   40:invokevirtual   #156 <Method float oa.i()>
	//   27   43:fastore         
		p.reset();
	//   28   44:aload_0         
	//   29   45:getfield        #43  <Field Path p>
	//   30   48:invokevirtual   #146 <Method void Path.reset()>
		p.moveTo(m[0], m[1]);
	//   31   51:aload_0         
	//   32   52:getfield        #43  <Field Path p>
	//   33   55:aload_0         
	//   34   56:getfield        #41  <Field float[] m>
	//   35   59:iconst_0        
	//   36   60:faload          
	//   37   61:aload_0         
	//   38   62:getfield        #41  <Field float[] m>
	//   39   65:iconst_1        
	//   40   66:faload          
	//   41   67:invokevirtual   #159 <Method void Path.moveTo(float, float)>
		p.lineTo(m[2], m[3]);
	//   42   70:aload_0         
	//   43   71:getfield        #43  <Field Path p>
	//   44   74:aload_0         
	//   45   75:getfield        #41  <Field float[] m>
	//   46   78:iconst_2        
	//   47   79:faload          
	//   48   80:aload_0         
	//   49   81:getfield        #41  <Field float[] m>
	//   50   84:iconst_3        
	//   51   85:faload          
	//   52   86:invokevirtual   #162 <Method void Path.lineTo(float, float)>
		h.setStyle(android.graphics.Paint.Style.STROKE);
	//   53   89:aload_0         
	//   54   90:getfield        #165 <Field Paint h>
	//   55   93:getstatic       #171 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   56   96:invokevirtual   #175 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		h.setColor(lq1.b());
	//   57   99:aload_0         
	//   58  100:getfield        #165 <Field Paint h>
	//   59  103:aload_2         
	//   60  104:invokevirtual   #179 <Method int lq.b()>
	//   61  107:invokevirtual   #56  <Method void Paint.setColor(int)>
		h.setStrokeWidth(lq1.d());
	//   62  110:aload_0         
	//   63  111:getfield        #165 <Field Paint h>
	//   64  114:aload_2         
	//   65  115:invokevirtual   #181 <Method float lq.d()>
	//   66  118:invokevirtual   #184 <Method void Paint.setStrokeWidth(float)>
		h.setPathEffect(((android.graphics.PathEffect) (lq1.a())));
	//   67  121:aload_0         
	//   68  122:getfield        #165 <Field Paint h>
	//   69  125:aload_2         
	//   70  126:invokevirtual   #187 <Method android.graphics.DashPathEffect lq.a()>
	//   71  129:invokevirtual   #191 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   72  132:pop             
		canvas.drawPath(p, h);
	//   73  133:aload_1         
	//   74  134:aload_0         
	//   75  135:getfield        #43  <Field Path p>
	//   76  138:aload_0         
	//   77  139:getfield        #165 <Field Paint h>
	//   78  142:invokevirtual   #195 <Method void Canvas.drawPath(Path, Paint)>
	//   79  145:return          
	}

	protected void b()
	{
		d.setColor(i.a());
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field Paint d>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field ln i>
	//    4    8:invokevirtual   #199 <Method int ln.a()>
	//    5   11:invokevirtual   #56  <Method void Paint.setColor(int)>
		d.setStrokeWidth(i.i());
	//    6   14:aload_0         
	//    7   15:getfield        #197 <Field Paint d>
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field ln i>
	//   10   22:invokevirtual   #200 <Method float ln.i()>
	//   11   25:invokevirtual   #184 <Method void Paint.setStrokeWidth(float)>
		d.setPathEffect(((android.graphics.PathEffect) (i.t())));
	//   12   28:aload_0         
	//   13   29:getfield        #197 <Field Paint d>
	//   14   32:aload_0         
	//   15   33:getfield        #45  <Field ln i>
	//   16   36:invokevirtual   #203 <Method android.graphics.DashPathEffect ln.t()>
	//   17   39:invokevirtual   #191 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   18   42:pop             
	//   19   43:return          
	}

	public void b(Canvas canvas)
	{
		if(!i.c() || !i.B())
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ln i>
	//*   2    4:invokevirtual   #205 <Method boolean ln.c()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #45  <Field ln i>
	//*   6   14:invokevirtual   #114 <Method boolean ln.B()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		b.setColor(i.k());
	//    9   21:aload_0         
	//   10   22:getfield        #207 <Field Paint b>
	//   11   25:aload_0         
	//   12   26:getfield        #45  <Field ln i>
	//   13   29:invokevirtual   #209 <Method int ln.k()>
	//   14   32:invokevirtual   #56  <Method void Paint.setColor(int)>
		b.setStrokeWidth(i.d());
	//   15   35:aload_0         
	//   16   36:getfield        #207 <Field Paint b>
	//   17   39:aload_0         
	//   18   40:getfield        #45  <Field ln i>
	//   19   43:invokevirtual   #210 <Method float ln.d()>
	//   20   46:invokevirtual   #184 <Method void Paint.setStrokeWidth(float)>
		b.setPathEffect(((android.graphics.PathEffect) (i.u())));
	//   21   49:aload_0         
	//   22   50:getfield        #207 <Field Paint b>
	//   23   53:aload_0         
	//   24   54:getfield        #45  <Field ln i>
	//   25   57:invokevirtual   #213 <Method android.graphics.DashPathEffect ln.u()>
	//   26   60:invokevirtual   #191 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   27   63:pop             
		if(i.j() == ln.e.d || i.j() == ln.e.c || i.j() == ln.e.a)
	//*  28   64:aload_0         
	//*  29   65:getfield        #45  <Field ln i>
	//*  30   68:invokevirtual   #217 <Method ln$e ln.j()>
	//*  31   71:getstatic       #222 <Field ln$e ln$e.d>
	//*  32   74:if_acmpeq       103
	//*  33   77:aload_0         
	//*  34   78:getfield        #45  <Field ln i>
	//*  35   81:invokevirtual   #217 <Method ln$e ln.j()>
	//*  36   84:getstatic       #224 <Field ln$e ln$e.c>
	//*  37   87:if_acmpeq       103
	//*  38   90:aload_0         
	//*  39   91:getfield        #45  <Field ln i>
	//*  40   94:invokevirtual   #217 <Method ln$e ln.j()>
	//*  41   97:getstatic       #226 <Field ln$e ln$e.a>
	//*  42  100:if_acmpne       139
			canvas.drawLine(l.f(), l.e(), l.h(), l.e(), b);
	//   43  103:aload_1         
	//   44  104:aload_0         
	//   45  105:getfield        #83  <Field oa l>
	//   46  108:invokevirtual   #228 <Method float oa.f()>
	//   47  111:aload_0         
	//   48  112:getfield        #83  <Field oa l>
	//   49  115:invokevirtual   #155 <Method float oa.e()>
	//   50  118:aload_0         
	//   51  119:getfield        #83  <Field oa l>
	//   52  122:invokevirtual   #230 <Method float oa.h()>
	//   53  125:aload_0         
	//   54  126:getfield        #83  <Field oa l>
	//   55  129:invokevirtual   #155 <Method float oa.e()>
	//   56  132:aload_0         
	//   57  133:getfield        #207 <Field Paint b>
	//   58  136:invokevirtual   #234 <Method void Canvas.drawLine(float, float, float, float, Paint)>
		if(i.j() == ln.e.e || i.j() == ln.e.b || i.j() == ln.e.a)
	//*  59  139:aload_0         
	//*  60  140:getfield        #45  <Field ln i>
	//*  61  143:invokevirtual   #217 <Method ln$e ln.j()>
	//*  62  146:getstatic       #236 <Field ln$e ln$e.e>
	//*  63  149:if_acmpeq       178
	//*  64  152:aload_0         
	//*  65  153:getfield        #45  <Field ln i>
	//*  66  156:invokevirtual   #217 <Method ln$e ln.j()>
	//*  67  159:getstatic       #238 <Field ln$e ln$e.b>
	//*  68  162:if_acmpeq       178
	//*  69  165:aload_0         
	//*  70  166:getfield        #45  <Field ln i>
	//*  71  169:invokevirtual   #217 <Method ln$e ln.j()>
	//*  72  172:getstatic       #226 <Field ln$e ln$e.a>
	//*  73  175:if_acmpne       214
			canvas.drawLine(l.f(), l.i(), l.h(), l.i(), b);
	//   74  178:aload_1         
	//   75  179:aload_0         
	//   76  180:getfield        #83  <Field oa l>
	//   77  183:invokevirtual   #228 <Method float oa.f()>
	//   78  186:aload_0         
	//   79  187:getfield        #83  <Field oa l>
	//   80  190:invokevirtual   #156 <Method float oa.i()>
	//   81  193:aload_0         
	//   82  194:getfield        #83  <Field oa l>
	//   83  197:invokevirtual   #230 <Method float oa.h()>
	//   84  200:aload_0         
	//   85  201:getfield        #83  <Field oa l>
	//   86  204:invokevirtual   #156 <Method float oa.i()>
	//   87  207:aload_0         
	//   88  208:getfield        #207 <Field Paint b>
	//   89  211:invokevirtual   #234 <Method void Canvas.drawLine(float, float, float, float, Paint)>
	//   90  214:return          
	}

	public void c(Canvas canvas)
	{
		if(!i.B() || !i.g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field ln i>
	//*   2    4:invokevirtual   #114 <Method boolean ln.B()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #45  <Field ln i>
	//*   6   14:invokevirtual   #240 <Method boolean ln.g()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float f1 = i.y();
	//    9   21:aload_0         
	//   10   22:getfield        #45  <Field ln i>
	//   11   25:invokevirtual   #243 <Method float ln.y()>
	//   12   28:fstore_2        
		a.setTypeface(i.x());
	//   13   29:aload_0         
	//   14   30:getfield        #49  <Field Paint a>
	//   15   33:aload_0         
	//   16   34:getfield        #45  <Field ln i>
	//   17   37:invokevirtual   #247 <Method android.graphics.Typeface ln.x()>
	//   18   40:invokevirtual   #251 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   19   43:pop             
		a.setTextSize(i.z());
	//   20   44:aload_0         
	//   21   45:getfield        #49  <Field Paint a>
	//   22   48:aload_0         
	//   23   49:getfield        #45  <Field ln i>
	//   24   52:invokevirtual   #254 <Method float ln.z()>
	//   25   55:invokevirtual   #77  <Method void Paint.setTextSize(float)>
		a.setColor(i.A());
	//   26   58:aload_0         
	//   27   59:getfield        #49  <Field Paint a>
	//   28   62:aload_0         
	//   29   63:getfield        #45  <Field ln i>
	//   30   66:invokevirtual   #257 <Method int ln.A()>
	//   31   69:invokevirtual   #56  <Method void Paint.setColor(int)>
		nz nz1 = nz.d(0.0F, 0.0F);
	//   32   72:fconst_0        
	//   33   73:fconst_0        
	//   34   74:invokestatic    #262 <Method nz nz.d(float, float)>
	//   35   77:astore_3        
		if(i.j() == ln.e.d)
	//*  36   78:aload_0         
	//*  37   79:getfield        #45  <Field ln i>
	//*  38   82:invokevirtual   #217 <Method ln$e ln.j()>
	//*  39   85:getstatic       #222 <Field ln$e ln$e.d>
	//*  40   88:if_acmpne       121
		{
			nz1.e = 0.5F;
	//   41   91:aload_3         
	//   42   92:ldc2            #263 <Float 0.5F>
	//   43   95:putfield        #266 <Field float nz.e>
			nz1.c = 1.0F;
	//   44   98:aload_3         
	//   45   99:fconst_1        
	//   46  100:putfield        #268 <Field float nz.c>
			d(canvas, l.e() - f1, nz1);
	//   47  103:aload_0         
	//   48  104:aload_1         
	//   49  105:aload_0         
	//   50  106:getfield        #83  <Field oa l>
	//   51  109:invokevirtual   #155 <Method float oa.e()>
	//   52  112:fload_2         
	//   53  113:fsub            
	//   54  114:aload_3         
	//   55  115:invokevirtual   #271 <Method void d(Canvas, float, nz)>
		} else
	//*  56  118:goto            322
		if(i.j() == ln.e.c)
	//*  57  121:aload_0         
	//*  58  122:getfield        #45  <Field ln i>
	//*  59  125:invokevirtual   #217 <Method ln$e ln.j()>
	//*  60  128:getstatic       #224 <Field ln$e ln$e.c>
	//*  61  131:if_acmpne       173
		{
			nz1.e = 0.5F;
	//   62  134:aload_3         
	//   63  135:ldc2            #263 <Float 0.5F>
	//   64  138:putfield        #266 <Field float nz.e>
			nz1.c = 1.0F;
	//   65  141:aload_3         
	//   66  142:fconst_1        
	//   67  143:putfield        #268 <Field float nz.c>
			d(canvas, l.e() + f1 + (float)i.I, nz1);
	//   68  146:aload_0         
	//   69  147:aload_1         
	//   70  148:aload_0         
	//   71  149:getfield        #83  <Field oa l>
	//   72  152:invokevirtual   #155 <Method float oa.e()>
	//   73  155:fload_2         
	//   74  156:fadd            
	//   75  157:aload_0         
	//   76  158:getfield        #45  <Field ln i>
	//   77  161:getfield        #273 <Field int ln.I>
	//   78  164:i2f             
	//   79  165:fadd            
	//   80  166:aload_3         
	//   81  167:invokevirtual   #271 <Method void d(Canvas, float, nz)>
		} else
	//*  82  170:goto            322
		if(i.j() == ln.e.e)
	//*  83  173:aload_0         
	//*  84  174:getfield        #45  <Field ln i>
	//*  85  177:invokevirtual   #217 <Method ln$e ln.j()>
	//*  86  180:getstatic       #236 <Field ln$e ln$e.e>
	//*  87  183:if_acmpne       216
		{
			nz1.e = 0.5F;
	//   88  186:aload_3         
	//   89  187:ldc2            #263 <Float 0.5F>
	//   90  190:putfield        #266 <Field float nz.e>
			nz1.c = 0.0F;
	//   91  193:aload_3         
	//   92  194:fconst_0        
	//   93  195:putfield        #268 <Field float nz.c>
			d(canvas, l.i() + f1, nz1);
	//   94  198:aload_0         
	//   95  199:aload_1         
	//   96  200:aload_0         
	//   97  201:getfield        #83  <Field oa l>
	//   98  204:invokevirtual   #156 <Method float oa.i()>
	//   99  207:fload_2         
	//  100  208:fadd            
	//  101  209:aload_3         
	//  102  210:invokevirtual   #271 <Method void d(Canvas, float, nz)>
		} else
	//* 103  213:goto            322
		if(i.j() == ln.e.b)
	//* 104  216:aload_0         
	//* 105  217:getfield        #45  <Field ln i>
	//* 106  220:invokevirtual   #217 <Method ln$e ln.j()>
	//* 107  223:getstatic       #238 <Field ln$e ln$e.b>
	//* 108  226:if_acmpne       268
		{
			nz1.e = 0.5F;
	//  109  229:aload_3         
	//  110  230:ldc2            #263 <Float 0.5F>
	//  111  233:putfield        #266 <Field float nz.e>
			nz1.c = 0.0F;
	//  112  236:aload_3         
	//  113  237:fconst_0        
	//  114  238:putfield        #268 <Field float nz.c>
			d(canvas, l.i() - f1 - (float)i.I, nz1);
	//  115  241:aload_0         
	//  116  242:aload_1         
	//  117  243:aload_0         
	//  118  244:getfield        #83  <Field oa l>
	//  119  247:invokevirtual   #156 <Method float oa.i()>
	//  120  250:fload_2         
	//  121  251:fsub            
	//  122  252:aload_0         
	//  123  253:getfield        #45  <Field ln i>
	//  124  256:getfield        #273 <Field int ln.I>
	//  125  259:i2f             
	//  126  260:fsub            
	//  127  261:aload_3         
	//  128  262:invokevirtual   #271 <Method void d(Canvas, float, nz)>
		} else
	//* 129  265:goto            322
		{
			nz1.e = 0.5F;
	//  130  268:aload_3         
	//  131  269:ldc2            #263 <Float 0.5F>
	//  132  272:putfield        #266 <Field float nz.e>
			nz1.c = 1.0F;
	//  133  275:aload_3         
	//  134  276:fconst_1        
	//  135  277:putfield        #268 <Field float nz.c>
			d(canvas, l.e() - f1, nz1);
	//  136  280:aload_0         
	//  137  281:aload_1         
	//  138  282:aload_0         
	//  139  283:getfield        #83  <Field oa l>
	//  140  286:invokevirtual   #155 <Method float oa.e()>
	//  141  289:fload_2         
	//  142  290:fsub            
	//  143  291:aload_3         
	//  144  292:invokevirtual   #271 <Method void d(Canvas, float, nz)>
			nz1.e = 0.5F;
	//  145  295:aload_3         
	//  146  296:ldc2            #263 <Float 0.5F>
	//  147  299:putfield        #266 <Field float nz.e>
			nz1.c = 0.0F;
	//  148  302:aload_3         
	//  149  303:fconst_0        
	//  150  304:putfield        #268 <Field float nz.c>
			d(canvas, l.i() + f1, nz1);
	//  151  307:aload_0         
	//  152  308:aload_1         
	//  153  309:aload_0         
	//  154  310:getfield        #83  <Field oa l>
	//  155  313:invokevirtual   #156 <Method float oa.i()>
	//  156  316:fload_2         
	//  157  317:fadd            
	//  158  318:aload_3         
	//  159  319:invokevirtual   #271 <Method void d(Canvas, float, nz)>
		}
		nz.c(nz1);
	//  160  322:aload_3         
	//  161  323:invokestatic    #276 <Method void nz.c(nz)>
	//  162  326:return          
	}

	protected void c(Canvas canvas, String s, float f1, float f2, nz nz1, float f3)
	{
		oc.d(canvas, s, f1, f2, a, nz1, f3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:fload_3         
	//    3    3:fload           4
	//    4    5:aload_0         
	//    5    6:getfield        #49  <Field Paint a>
	//    6    9:aload           5
	//    7   11:fload           6
	//    8   13:invokestatic    #280 <Method void oc.d(Canvas, String, float, float, Paint, nz, float)>
	//    9   16:return          
	}

	protected void d()
	{
		Object obj = ((Object) (i.n()));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ln i>
	//    2    4:invokevirtual   #283 <Method String ln.n()>
	//    3    7:astore_3        
		a.setTypeface(i.x());
	//    4    8:aload_0         
	//    5    9:getfield        #49  <Field Paint a>
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field ln i>
	//    8   16:invokevirtual   #247 <Method android.graphics.Typeface ln.x()>
	//    9   19:invokevirtual   #251 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   10   22:pop             
		a.setTextSize(i.z());
	//   11   23:aload_0         
	//   12   24:getfield        #49  <Field Paint a>
	//   13   27:aload_0         
	//   14   28:getfield        #45  <Field ln i>
	//   15   31:invokevirtual   #254 <Method float ln.z()>
	//   16   34:invokevirtual   #77  <Method void Paint.setTextSize(float)>
		obj = ((Object) (oc.a(a, ((String) (obj)))));
	//   17   37:aload_0         
	//   18   38:getfield        #49  <Field Paint a>
	//   19   41:aload_3         
	//   20   42:invokestatic    #286 <Method nr oc.a(Paint, String)>
	//   21   45:astore_3        
		float f1 = ((nr) (obj)).a;
	//   22   46:aload_3         
	//   23   47:getfield        #290 <Field float nr.a>
	//   24   50:fstore_1        
		float f2 = oc.e(a, "Q");
	//   25   51:aload_0         
	//   26   52:getfield        #49  <Field Paint a>
	//   27   55:ldc2            #292 <String "Q">
	//   28   58:invokestatic    #295 <Method int oc.e(Paint, String)>
	//   29   61:i2f             
	//   30   62:fstore_2        
		nr nr1 = oc.d(f1, f2, i.C());
	//   31   63:fload_1         
	//   32   64:fload_2         
	//   33   65:aload_0         
	//   34   66:getfield        #45  <Field ln i>
	//   35   69:invokevirtual   #298 <Method float ln.C()>
	//   36   72:invokestatic    #301 <Method nr oc.d(float, float, float)>
	//   37   75:astore          4
		i.C = Math.round(f1);
	//   38   77:aload_0         
	//   39   78:getfield        #45  <Field ln i>
	//   40   81:fload_1         
	//   41   82:invokestatic    #307 <Method int Math.round(float)>
	//   42   85:putfield        #309 <Field int ln.C>
		i.j = Math.round(f2);
	//   43   88:aload_0         
	//   44   89:getfield        #45  <Field ln i>
	//   45   92:fload_2         
	//   46   93:invokestatic    #307 <Method int Math.round(float)>
	//   47   96:putfield        #311 <Field int ln.j>
		i.B = Math.round(nr1.a);
	//   48   99:aload_0         
	//   49  100:getfield        #45  <Field ln i>
	//   50  103:aload           4
	//   51  105:getfield        #290 <Field float nr.a>
	//   52  108:invokestatic    #307 <Method int Math.round(float)>
	//   53  111:putfield        #313 <Field int ln.B>
		i.I = Math.round(nr1.d);
	//   54  114:aload_0         
	//   55  115:getfield        #45  <Field ln i>
	//   56  118:aload           4
	//   57  120:getfield        #315 <Field float nr.d>
	//   58  123:invokestatic    #307 <Method int Math.round(float)>
	//   59  126:putfield        #273 <Field int ln.I>
		nr.b(nr1);
	//   60  129:aload           4
	//   61  131:invokestatic    #318 <Method void nr.b(nr)>
		nr.b(((nr) (obj)));
	//   62  134:aload_3         
	//   63  135:invokestatic    #318 <Method void nr.b(nr)>
	//   64  138:return          
	}

	protected void d(float f1, float f2)
	{
		super.d(f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #320 <Method void ni.d(float, float)>
		d();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #322 <Method void d()>
	//    6   10:return          
	}

	public void d(float f1, float f2, boolean flag)
	{
		float f4 = f1;
	//    0    0:fload_1         
	//    1    1:fstore          5
		float f3 = f2;
	//    2    3:fload_2         
	//    3    4:fstore          4
		if(l.g() > 10F)
	//*   4    6:aload_0         
	//*   5    7:getfield        #83  <Field oa l>
	//*   6   10:invokevirtual   #325 <Method float oa.g()>
	//*   7   13:ldc1            #67  <Float 10F>
	//*   8   15:fcmpl           
	//*   9   16:ifle            132
		{
			f4 = f1;
	//   10   19:fload_1         
	//   11   20:fstore          5
			f3 = f2;
	//   12   22:fload_2         
	//   13   23:fstore          4
			if(!l.q())
	//*  14   25:aload_0         
	//*  15   26:getfield        #83  <Field oa l>
	//*  16   29:invokevirtual   #328 <Method boolean oa.q()>
	//*  17   32:ifne            132
			{
				nw nw1 = e.b(l.f(), l.e());
	//   18   35:aload_0         
	//   19   36:getfield        #136 <Field nv e>
	//   20   39:aload_0         
	//   21   40:getfield        #83  <Field oa l>
	//   22   43:invokevirtual   #228 <Method float oa.f()>
	//   23   46:aload_0         
	//   24   47:getfield        #83  <Field oa l>
	//   25   50:invokevirtual   #155 <Method float oa.e()>
	//   26   53:invokevirtual   #331 <Method nw nv.b(float, float)>
	//   27   56:astore          6
				nw nw2 = e.b(l.h(), l.e());
	//   28   58:aload_0         
	//   29   59:getfield        #136 <Field nv e>
	//   30   62:aload_0         
	//   31   63:getfield        #83  <Field oa l>
	//   32   66:invokevirtual   #230 <Method float oa.h()>
	//   33   69:aload_0         
	//   34   70:getfield        #83  <Field oa l>
	//   35   73:invokevirtual   #155 <Method float oa.e()>
	//   36   76:invokevirtual   #331 <Method nw nv.b(float, float)>
	//   37   79:astore          7
				if(flag)
	//*  38   81:iload_3         
	//*  39   82:ifeq            102
				{
					f1 = (float)nw2.b;
	//   40   85:aload           7
	//   41   87:getfield        #336 <Field double nw.b>
	//   42   90:d2f             
	//   43   91:fstore_1        
					f2 = (float)nw1.b;
	//   44   92:aload           6
	//   45   94:getfield        #336 <Field double nw.b>
	//   46   97:d2f             
	//   47   98:fstore_2        
				} else
	//*  48   99:goto            116
				{
					f1 = (float)nw1.b;
	//   49  102:aload           6
	//   50  104:getfield        #336 <Field double nw.b>
	//   51  107:d2f             
	//   52  108:fstore_1        
					f2 = (float)nw2.b;
	//   53  109:aload           7
	//   54  111:getfield        #336 <Field double nw.b>
	//   55  114:d2f             
	//   56  115:fstore_2        
				}
				nw.e(nw1);
	//   57  116:aload           6
	//   58  118:invokestatic    #339 <Method void nw.e(nw)>
				nw.e(nw2);
	//   59  121:aload           7
	//   60  123:invokestatic    #339 <Method void nw.e(nw)>
				f3 = f2;
	//   61  126:fload_2         
	//   62  127:fstore          4
				f4 = f1;
	//   63  129:fload_1         
	//   64  130:fstore          5
			}
		}
		d(f4, f3);
	//   65  132:aload_0         
	//   66  133:fload           5
	//   67  135:fload           4
	//   68  137:invokevirtual   #340 <Method void d(float, float)>
	//   69  140:return          
	}

	protected void d(Canvas canvas, float f1, float f2, Path path)
	{
		path.moveTo(f1, l.i());
	//    0    0:aload           4
	//    1    2:fload_2         
	//    2    3:aload_0         
	//    3    4:getfield        #83  <Field oa l>
	//    4    7:invokevirtual   #156 <Method float oa.i()>
	//    5   10:invokevirtual   #159 <Method void Path.moveTo(float, float)>
		path.lineTo(f1, l.e());
	//    6   13:aload           4
	//    7   15:fload_2         
	//    8   16:aload_0         
	//    9   17:getfield        #83  <Field oa l>
	//   10   20:invokevirtual   #155 <Method float oa.e()>
	//   11   23:invokevirtual   #162 <Method void Path.lineTo(float, float)>
		canvas.drawPath(path, d);
	//   12   26:aload_1         
	//   13   27:aload           4
	//   14   29:aload_0         
	//   15   30:getfield        #197 <Field Paint d>
	//   16   33:invokevirtual   #195 <Method void Canvas.drawPath(Path, Paint)>
		path.reset();
	//   17   36:aload           4
	//   18   38:invokevirtual   #146 <Method void Path.reset()>
	//   19   41:return          
	}

	protected void d(Canvas canvas, float f1, nz nz1)
	{
		float f4 = i.C();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ln i>
	//    2    4:invokevirtual   #298 <Method float ln.C()>
	//    3    7:fstore          6
		boolean flag = i.b();
	//    4    9:aload_0         
	//    5   10:getfield        #45  <Field ln i>
	//    6   13:invokevirtual   #342 <Method boolean ln.b()>
	//    7   16:istore          9
		float af[] = new float[i.d * 2];
	//    8   18:aload_0         
	//    9   19:getfield        #45  <Field ln i>
	//   10   22:getfield        #131 <Field int ln.d>
	//   11   25:iconst_2        
	//   12   26:imul            
	//   13   27:newarray        float[]
	//   14   29:astore          10
		for(int j = 0; j < af.length; j += 2)
	//*  15   31:iconst_0        
	//*  16   32:istore          8
	//*  17   34:iload           8
	//*  18   36:aload           10
	//*  19   38:arraylength     
	//*  20   39:icmpge          93
			if(flag)
	//*  21   42:iload           9
	//*  22   44:ifeq            67
				af[j] = i.c[j / 2];
	//   23   47:aload           10
	//   24   49:iload           8
	//   25   51:aload_0         
	//   26   52:getfield        #45  <Field ln i>
	//   27   55:getfield        #344 <Field float[] ln.c>
	//   28   58:iload           8
	//   29   60:iconst_2        
	//   30   61:idiv            
	//   31   62:faload          
	//   32   63:fastore         
			else
	//*  33   64:goto            84
				af[j] = i.a[j / 2];
	//   34   67:aload           10
	//   35   69:iload           8
	//   36   71:aload_0         
	//   37   72:getfield        #45  <Field ln i>
	//   38   75:getfield        #133 <Field float[] ln.a>
	//   39   78:iload           8
	//   40   80:iconst_2        
	//   41   81:idiv            
	//   42   82:faload          
	//   43   83:fastore         

	//   44   84:iload           8
	//   45   86:iconst_2        
	//   46   87:iadd            
	//   47   88:istore          8
	//*  48   90:goto            34
		e.e(af);
	//   49   93:aload_0         
	//   50   94:getfield        #136 <Field nv e>
	//   51   97:aload           10
	//   52   99:invokevirtual   #141 <Method void nv.e(float[])>
		for(int l = 0; l < af.length; l += 2)
	//*  53  102:iconst_0        
	//*  54  103:istore          8
	//*  55  105:iload           8
	//*  56  107:aload           10
	//*  57  109:arraylength     
	//*  58  110:icmpge          312
		{
			float f3 = af[l];
	//   59  113:aload           10
	//   60  115:iload           8
	//   61  117:faload          
	//   62  118:fstore          5
			if(!this.l.c(f3))
				continue;
	//   63  120:aload_0         
	//   64  121:getfield        #83  <Field oa l>
	//   65  124:fload           5
	//   66  126:invokevirtual   #347 <Method boolean oa.c(float)>
	//   67  129:ifeq            303
			String s = i.r().b(i.a[l / 2], ((lh) (i)));
	//   68  132:aload_0         
	//   69  133:getfield        #45  <Field ln i>
	//   70  136:invokevirtual   #351 <Method mf ln.r()>
	//   71  139:aload_0         
	//   72  140:getfield        #45  <Field ln i>
	//   73  143:getfield        #133 <Field float[] ln.a>
	//   74  146:iload           8
	//   75  148:iconst_2        
	//   76  149:idiv            
	//   77  150:faload          
	//   78  151:aload_0         
	//   79  152:getfield        #45  <Field ln i>
	//   80  155:invokeinterface #356 <Method String mf.b(float, lh)>
	//   81  160:astore          11
			float f2 = f3;
	//   82  162:fload           5
	//   83  164:fstore          4
			if(i.D())
	//*  84  166:aload_0         
	//*  85  167:getfield        #45  <Field ln i>
	//*  86  170:invokevirtual   #358 <Method boolean ln.D()>
	//*  87  173:ifeq            290
				if(l == i.d - 1 && i.d > 1)
	//*  88  176:iload           8
	//*  89  178:aload_0         
	//*  90  179:getfield        #45  <Field ln i>
	//*  91  182:getfield        #131 <Field int ln.d>
	//*  92  185:iconst_1        
	//*  93  186:isub            
	//*  94  187:icmpne          264
	//*  95  190:aload_0         
	//*  96  191:getfield        #45  <Field ln i>
	//*  97  194:getfield        #131 <Field int ln.d>
	//*  98  197:iconst_1        
	//*  99  198:icmple          264
				{
					float f5 = oc.d(a, s);
	//  100  201:aload_0         
	//  101  202:getfield        #49  <Field Paint a>
	//  102  205:aload           11
	//  103  207:invokestatic    #360 <Method int oc.d(Paint, String)>
	//  104  210:i2f             
	//  105  211:fstore          7
					f2 = f3;
	//  106  213:fload           5
	//  107  215:fstore          4
					if(f5 > this.l.b() * 2.0F)
	//* 108  217:fload           7
	//* 109  219:aload_0         
	//* 110  220:getfield        #83  <Field oa l>
	//* 111  223:invokevirtual   #362 <Method float oa.b()>
	//* 112  226:fconst_2        
	//* 113  227:fmul            
	//* 114  228:fcmpl           
	//* 115  229:ifle            261
					{
						f2 = f3;
	//  116  232:fload           5
	//  117  234:fstore          4
						if(f3 + f5 > this.l.o())
	//* 118  236:fload           5
	//* 119  238:fload           7
	//* 120  240:fadd            
	//* 121  241:aload_0         
	//* 122  242:getfield        #83  <Field oa l>
	//* 123  245:invokevirtual   #364 <Method float oa.o()>
	//* 124  248:fcmpl           
	//* 125  249:ifle            261
							f2 = f3 - f5 / 2.0F;
	//  126  252:fload           5
	//  127  254:fload           7
	//  128  256:fconst_2        
	//  129  257:fdiv            
	//  130  258:fsub            
	//  131  259:fstore          4
					}
				} else
	//* 132  261:goto            290
				{
					f2 = f3;
	//  133  264:fload           5
	//  134  266:fstore          4
					if(l == 0)
	//* 135  268:iload           8
	//* 136  270:ifne            290
						f2 = f3 + (float)oc.d(a, s) / 2.0F;
	//  137  273:fload           5
	//  138  275:aload_0         
	//  139  276:getfield        #49  <Field Paint a>
	//  140  279:aload           11
	//  141  281:invokestatic    #360 <Method int oc.d(Paint, String)>
	//  142  284:i2f             
	//  143  285:fconst_2        
	//  144  286:fdiv            
	//  145  287:fadd            
	//  146  288:fstore          4
				}
			c(canvas, s, f2, f1, nz1, f4);
	//  147  290:aload_0         
	//  148  291:aload_1         
	//  149  292:aload           11
	//  150  294:fload           4
	//  151  296:fload_2         
	//  152  297:aload_3         
	//  153  298:fload           6
	//  154  300:invokevirtual   #366 <Method void c(Canvas, String, float, float, nz, float)>
		}

	//  155  303:iload           8
	//  156  305:iconst_2        
	//  157  306:iadd            
	//  158  307:istore          8
	//* 159  309:goto            105
	//  160  312:return          
	}

	public void e(Canvas canvas)
	{
		List list = i.l();
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field ln i>
	//    2    4:invokevirtual   #369 <Method List ln.l()>
	//    3    7:astore          4
		if(list == null || list.size() <= 0)
	//*   4    9:aload           4
	//*   5   11:ifnull          24
	//*   6   14:aload           4
	//*   7   16:invokeinterface #374 <Method int List.size()>
	//*   8   21:ifgt            25
			return;
	//    9   24:return          
		float af[] = o;
	//   10   25:aload_0         
	//   11   26:getfield        #37  <Field float[] o>
	//   12   29:astore          5
		af[0] = 0.0F;
	//   13   31:aload           5
	//   14   33:iconst_0        
	//   15   34:fconst_0        
	//   16   35:fastore         
		af[1] = 0.0F;
	//   17   36:aload           5
	//   18   38:iconst_1        
	//   19   39:fconst_0        
	//   20   40:fastore         
		for(int j = 0; j < list.size(); j++)
	//*  21   41:iconst_0        
	//*  22   42:istore_2        
	//*  23   43:iload_2         
	//*  24   44:aload           4
	//*  25   46:invokeinterface #374 <Method int List.size()>
	//*  26   51:icmpge          180
		{
			lq lq1 = (lq)list.get(j);
	//   27   54:aload           4
	//   28   56:iload_2         
	//   29   57:invokeinterface #378 <Method Object List.get(int)>
	//   30   62:checkcast       #177 <Class lq>
	//   31   65:astore          6
			if(lq1.B())
	//*  32   67:aload           6
	//*  33   69:invokevirtual   #379 <Method boolean lq.B()>
	//*  34   72:ifne            78
	//*  35   75:goto            173
			{
				int l = canvas.save();
	//   36   78:aload_1         
	//   37   79:invokevirtual   #120 <Method int Canvas.save()>
	//   38   82:istore_3        
				n.set(this.l.m());
	//   39   83:aload_0         
	//   40   84:getfield        #39  <Field RectF n>
	//   41   87:aload_0         
	//   42   88:getfield        #83  <Field oa l>
	//   43   91:invokevirtual   #87  <Method RectF oa.m()>
	//   44   94:invokevirtual   #91  <Method void RectF.set(RectF)>
				n.inset(-lq1.d(), 0.0F);
	//   45   97:aload_0         
	//   46   98:getfield        #39  <Field RectF n>
	//   47  101:aload           6
	//   48  103:invokevirtual   #181 <Method float lq.d()>
	//   49  106:fneg            
	//   50  107:fconst_0        
	//   51  108:invokevirtual   #104 <Method void RectF.inset(float, float)>
				canvas.clipRect(n);
	//   52  111:aload_1         
	//   53  112:aload_0         
	//   54  113:getfield        #39  <Field RectF n>
	//   55  116:invokevirtual   #126 <Method boolean Canvas.clipRect(RectF)>
	//   56  119:pop             
				af[0] = lq1.e();
	//   57  120:aload           5
	//   58  122:iconst_0        
	//   59  123:aload           6
	//   60  125:invokevirtual   #380 <Method float lq.e()>
	//   61  128:fastore         
				af[1] = 0.0F;
	//   62  129:aload           5
	//   63  131:iconst_1        
	//   64  132:fconst_0        
	//   65  133:fastore         
				e.e(af);
	//   66  134:aload_0         
	//   67  135:getfield        #136 <Field nv e>
	//   68  138:aload           5
	//   69  140:invokevirtual   #141 <Method void nv.e(float[])>
				a(canvas, lq1, af);
	//   70  143:aload_0         
	//   71  144:aload_1         
	//   72  145:aload           6
	//   73  147:aload           5
	//   74  149:invokevirtual   #382 <Method void a(Canvas, lq, float[])>
				e(canvas, lq1, af, lq1.y() + 2.0F);
	//   75  152:aload_0         
	//   76  153:aload_1         
	//   77  154:aload           6
	//   78  156:aload           5
	//   79  158:aload           6
	//   80  160:invokevirtual   #383 <Method float lq.y()>
	//   81  163:fconst_2        
	//   82  164:fadd            
	//   83  165:invokevirtual   #386 <Method void e(Canvas, lq, float[], float)>
				canvas.restoreToCount(l);
	//   84  168:aload_1         
	//   85  169:iload_3         
	//   86  170:invokevirtual   #152 <Method void Canvas.restoreToCount(int)>
			}
		}

	//   87  173:iload_2         
	//   88  174:iconst_1        
	//   89  175:iadd            
	//   90  176:istore_2        
	//*  91  177:goto            43
	//   92  180:return          
	}

	public void e(Canvas canvas, lq lq1, float af[], float f1)
	{
		String s = lq1.f();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #388 <Method String lq.f()>
	//    2    4:astore          7
		if(s != null && !s.equals(""))
	//*   3    6:aload           7
	//*   4    8:ifnull          288
	//*   5   11:aload           7
	//*   6   13:ldc2            #390 <String "">
	//*   7   16:invokevirtual   #396 <Method boolean String.equals(Object)>
	//*   8   19:ifne            288
		{
			h.setStyle(lq1.c());
	//    9   22:aload_0         
	//   10   23:getfield        #165 <Field Paint h>
	//   11   26:aload_2         
	//   12   27:invokevirtual   #399 <Method android.graphics.Paint$Style lq.c()>
	//   13   30:invokevirtual   #175 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			h.setPathEffect(((android.graphics.PathEffect) (null)));
	//   14   33:aload_0         
	//   15   34:getfield        #165 <Field Paint h>
	//   16   37:aconst_null     
	//   17   38:invokevirtual   #191 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   18   41:pop             
			h.setColor(lq1.A());
	//   19   42:aload_0         
	//   20   43:getfield        #165 <Field Paint h>
	//   21   46:aload_2         
	//   22   47:invokevirtual   #400 <Method int lq.A()>
	//   23   50:invokevirtual   #56  <Method void Paint.setColor(int)>
			h.setStrokeWidth(0.5F);
	//   24   53:aload_0         
	//   25   54:getfield        #165 <Field Paint h>
	//   26   57:ldc2            #263 <Float 0.5F>
	//   27   60:invokevirtual   #184 <Method void Paint.setStrokeWidth(float)>
			h.setTextSize(lq1.z());
	//   28   63:aload_0         
	//   29   64:getfield        #165 <Field Paint h>
	//   30   67:aload_2         
	//   31   68:invokevirtual   #401 <Method float lq.z()>
	//   32   71:invokevirtual   #77  <Method void Paint.setTextSize(float)>
			float f2 = lq1.d() + lq1.v();
	//   33   74:aload_2         
	//   34   75:invokevirtual   #181 <Method float lq.d()>
	//   35   78:aload_2         
	//   36   79:invokevirtual   #404 <Method float lq.v()>
	//   37   82:fadd            
	//   38   83:fstore          5
			lq1 = ((lq) (lq1.k()));
	//   39   85:aload_2         
	//   40   86:invokevirtual   #407 <Method lq$e lq.k()>
	//   41   89:astore_2        
			if(lq1 == lq.e.b)
	//*  42   90:aload_2         
	//*  43   91:getstatic       #412 <Field lq$e lq$e.b>
	//*  44   94:if_acmpne       149
			{
				float f3 = oc.e(h, s);
	//   45   97:aload_0         
	//   46   98:getfield        #165 <Field Paint h>
	//   47  101:aload           7
	//   48  103:invokestatic    #295 <Method int oc.e(Paint, String)>
	//   49  106:i2f             
	//   50  107:fstore          6
				h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   51  109:aload_0         
	//   52  110:getfield        #165 <Field Paint h>
	//   53  113:getstatic       #415 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   54  116:invokevirtual   #66  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				canvas.drawText(s, af[0] + f2, l.e() + f1 + f3, h);
	//   55  119:aload_1         
	//   56  120:aload           7
	//   57  122:aload_3         
	//   58  123:iconst_0        
	//   59  124:faload          
	//   60  125:fload           5
	//   61  127:fadd            
	//   62  128:aload_0         
	//   63  129:getfield        #83  <Field oa l>
	//   64  132:invokevirtual   #155 <Method float oa.e()>
	//   65  135:fload           4
	//   66  137:fadd            
	//   67  138:fload           6
	//   68  140:fadd            
	//   69  141:aload_0         
	//   70  142:getfield        #165 <Field Paint h>
	//   71  145:invokevirtual   #419 <Method void Canvas.drawText(String, float, float, Paint)>
				return;
	//   72  148:return          
			}
			if(lq1 == lq.e.a)
	//*  73  149:aload_2         
	//*  74  150:getstatic       #421 <Field lq$e lq$e.a>
	//*  75  153:if_acmpne       193
			{
				h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   76  156:aload_0         
	//   77  157:getfield        #165 <Field Paint h>
	//   78  160:getstatic       #415 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   79  163:invokevirtual   #66  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				canvas.drawText(s, af[0] + f2, l.i() - f1, h);
	//   80  166:aload_1         
	//   81  167:aload           7
	//   82  169:aload_3         
	//   83  170:iconst_0        
	//   84  171:faload          
	//   85  172:fload           5
	//   86  174:fadd            
	//   87  175:aload_0         
	//   88  176:getfield        #83  <Field oa l>
	//   89  179:invokevirtual   #156 <Method float oa.i()>
	//   90  182:fload           4
	//   91  184:fsub            
	//   92  185:aload_0         
	//   93  186:getfield        #165 <Field Paint h>
	//   94  189:invokevirtual   #419 <Method void Canvas.drawText(String, float, float, Paint)>
				return;
	//   95  192:return          
			}
			if(lq1 == lq.e.c)
	//*  96  193:aload_2         
	//*  97  194:getstatic       #423 <Field lq$e lq$e.c>
	//*  98  197:if_acmpne       252
			{
				h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//   99  200:aload_0         
	//  100  201:getfield        #165 <Field Paint h>
	//  101  204:getstatic       #426 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  102  207:invokevirtual   #66  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				float f4 = oc.e(h, s);
	//  103  210:aload_0         
	//  104  211:getfield        #165 <Field Paint h>
	//  105  214:aload           7
	//  106  216:invokestatic    #295 <Method int oc.e(Paint, String)>
	//  107  219:i2f             
	//  108  220:fstore          6
				canvas.drawText(s, af[0] - f2, l.e() + f1 + f4, h);
	//  109  222:aload_1         
	//  110  223:aload           7
	//  111  225:aload_3         
	//  112  226:iconst_0        
	//  113  227:faload          
	//  114  228:fload           5
	//  115  230:fsub            
	//  116  231:aload_0         
	//  117  232:getfield        #83  <Field oa l>
	//  118  235:invokevirtual   #155 <Method float oa.e()>
	//  119  238:fload           4
	//  120  240:fadd            
	//  121  241:fload           6
	//  122  243:fadd            
	//  123  244:aload_0         
	//  124  245:getfield        #165 <Field Paint h>
	//  125  248:invokevirtual   #419 <Method void Canvas.drawText(String, float, float, Paint)>
				return;
	//  126  251:return          
			}
			h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  127  252:aload_0         
	//  128  253:getfield        #165 <Field Paint h>
	//  129  256:getstatic       #426 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  130  259:invokevirtual   #66  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			canvas.drawText(s, af[0] - f2, l.i() - f1, h);
	//  131  262:aload_1         
	//  132  263:aload           7
	//  133  265:aload_3         
	//  134  266:iconst_0        
	//  135  267:faload          
	//  136  268:fload           5
	//  137  270:fsub            
	//  138  271:aload_0         
	//  139  272:getfield        #83  <Field oa l>
	//  140  275:invokevirtual   #156 <Method float oa.i()>
	//  141  278:fload           4
	//  142  280:fsub            
	//  143  281:aload_0         
	//  144  282:getfield        #165 <Field Paint h>
	//  145  285:invokevirtual   #419 <Method void Canvas.drawText(String, float, float, Paint)>
		}
	//  146  288:return          
	}

	protected RectF f;
	protected Path g;
	protected ln i;
	protected float k[];
	float m[];
	protected RectF n;
	protected float o[];
	private Path p;
}
