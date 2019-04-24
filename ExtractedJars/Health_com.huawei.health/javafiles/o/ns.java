// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import java.util.List;

// Referenced classes of package o:
//			nt, oa, lp, nv, 
//			nw, lh, oc, lq

public class ns extends nt
{

	public ns(oa oa1, lp lp1, nv nv1)
	{
		super(oa1, lp1, nv1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #13  <Method void nt(oa, lp, nv)>
		q = new Path();
	//    5    7:aload_0         
	//    6    8:new             #15  <Class Path>
	//    7   11:dup             
	//    8   12:invokespecial   #18  <Method void Path()>
	//    9   15:putfield        #20  <Field Path q>
		s = new Path();
	//   10   18:aload_0         
	//   11   19:new             #15  <Class Path>
	//   12   22:dup             
	//   13   23:invokespecial   #18  <Method void Path()>
	//   14   26:putfield        #22  <Field Path s>
		u = new float[4];
	//   15   29:aload_0         
	//   16   30:iconst_4        
	//   17   31:newarray        float[]
	//   18   33:putfield        #24  <Field float[] u>
		h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   19   36:aload_0         
	//   20   37:getfield        #28  <Field Paint h>
	//   21   40:getstatic       #34  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   22   43:invokevirtual   #40  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//   23   46:return          
	}

	protected void a(Canvas canvas)
	{
		int i = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #49  <Method int Canvas.save()>
	//    2    4:istore_2        
		p.set(l.m());
	//    3    5:aload_0         
	//    4    6:getfield        #53  <Field RectF p>
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field oa l>
	//    7   13:invokevirtual   #63  <Method RectF oa.m()>
	//    8   16:invokevirtual   #69  <Method void RectF.set(RectF)>
		p.inset(-k.N(), 0.0F);
	//    9   19:aload_0         
	//   10   20:getfield        #53  <Field RectF p>
	//   11   23:aload_0         
	//   12   24:getfield        #73  <Field lp k>
	//   13   27:invokevirtual   #79  <Method float lp.N()>
	//   14   30:fneg            
	//   15   31:fconst_0        
	//   16   32:invokevirtual   #83  <Method void RectF.inset(float, float)>
		canvas.clipRect(t);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #86  <Field RectF t>
	//   20   40:invokevirtual   #90  <Method boolean Canvas.clipRect(RectF)>
	//   21   43:pop             
		nw nw1 = e.d(0.0F, 0.0F);
	//   22   44:aload_0         
	//   23   45:getfield        #94  <Field nv e>
	//   24   48:fconst_0        
	//   25   49:fconst_0        
	//   26   50:invokevirtual   #100 <Method nw nv.d(float, float)>
	//   27   53:astore_3        
		f.setColor(k.M());
	//   28   54:aload_0         
	//   29   55:getfield        #103 <Field Paint f>
	//   30   58:aload_0         
	//   31   59:getfield        #73  <Field lp k>
	//   32   62:invokevirtual   #106 <Method int lp.M()>
	//   33   65:invokevirtual   #110 <Method void Paint.setColor(int)>
		f.setStrokeWidth(k.N());
	//   34   68:aload_0         
	//   35   69:getfield        #103 <Field Paint f>
	//   36   72:aload_0         
	//   37   73:getfield        #73  <Field lp k>
	//   38   76:invokevirtual   #79  <Method float lp.N()>
	//   39   79:invokevirtual   #114 <Method void Paint.setStrokeWidth(float)>
		Path path = q;
	//   40   82:aload_0         
	//   41   83:getfield        #20  <Field Path q>
	//   42   86:astore          4
		path.reset();
	//   43   88:aload           4
	//   44   90:invokevirtual   #117 <Method void Path.reset()>
		path.moveTo((float)nw1.b - 1.0F, l.e());
	//   45   93:aload           4
	//   46   95:aload_3         
	//   47   96:getfield        #123 <Field double nw.b>
	//   48   99:d2f             
	//   49  100:fconst_1        
	//   50  101:fsub            
	//   51  102:aload_0         
	//   52  103:getfield        #57  <Field oa l>
	//   53  106:invokevirtual   #125 <Method float oa.e()>
	//   54  109:invokevirtual   #128 <Method void Path.moveTo(float, float)>
		path.lineTo((float)nw1.b - 1.0F, l.i());
	//   55  112:aload           4
	//   56  114:aload_3         
	//   57  115:getfield        #123 <Field double nw.b>
	//   58  118:d2f             
	//   59  119:fconst_1        
	//   60  120:fsub            
	//   61  121:aload_0         
	//   62  122:getfield        #57  <Field oa l>
	//   63  125:invokevirtual   #131 <Method float oa.i()>
	//   64  128:invokevirtual   #134 <Method void Path.lineTo(float, float)>
		canvas.drawPath(path, f);
	//   65  131:aload_1         
	//   66  132:aload           4
	//   67  134:aload_0         
	//   68  135:getfield        #103 <Field Paint f>
	//   69  138:invokevirtual   #138 <Method void Canvas.drawPath(Path, Paint)>
		canvas.restoreToCount(i);
	//   70  141:aload_1         
	//   71  142:iload_2         
	//   72  143:invokevirtual   #141 <Method void Canvas.restoreToCount(int)>
	//   73  146:return          
	}

	protected void a(Canvas canvas, float f, float af[], float f1)
	{
		a.setTypeface(k.x());
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Paint a>
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field lp k>
	//    4    8:invokevirtual   #148 <Method android.graphics.Typeface lp.x()>
	//    5   11:invokevirtual   #152 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//    6   14:pop             
		a.setTextSize(k.z());
	//    7   15:aload_0         
	//    8   16:getfield        #144 <Field Paint a>
	//    9   19:aload_0         
	//   10   20:getfield        #73  <Field lp k>
	//   11   23:invokevirtual   #155 <Method float lp.z()>
	//   12   26:invokevirtual   #158 <Method void Paint.setTextSize(float)>
		a.setColor(k.A());
	//   13   29:aload_0         
	//   14   30:getfield        #144 <Field Paint a>
	//   15   33:aload_0         
	//   16   34:getfield        #73  <Field lp k>
	//   17   37:invokevirtual   #161 <Method int lp.A()>
	//   18   40:invokevirtual   #110 <Method void Paint.setColor(int)>
		int i;
		if(k.I())
	//*  19   43:aload_0         
	//*  20   44:getfield        #73  <Field lp k>
	//*  21   47:invokevirtual   #165 <Method boolean lp.I()>
	//*  22   50:ifeq            59
			i = 0;
	//   23   53:iconst_0        
	//   24   54:istore          5
		else
	//*  25   56:goto            62
			i = 1;
	//   26   59:iconst_1        
	//   27   60:istore          5
		int j;
		if(k.F())
	//*  28   62:aload_0         
	//*  29   63:getfield        #73  <Field lp k>
	//*  30   66:invokevirtual   #168 <Method boolean lp.F()>
	//*  31   69:ifeq            84
			j = k.d;
	//   32   72:aload_0         
	//   33   73:getfield        #73  <Field lp k>
	//   34   76:getfield        #170 <Field int lp.d>
	//   35   79:istore          6
		else
	//*  36   81:goto            95
			j = k.d - 1;
	//   37   84:aload_0         
	//   38   85:getfield        #73  <Field lp k>
	//   39   88:getfield        #170 <Field int lp.d>
	//   40   91:iconst_1        
	//   41   92:isub            
	//   42   93:istore          6
		for(; i < j; i++)
	//*  43   95:iload           5
	//*  44   97:iload           6
	//*  45   99:icmpge          138
			canvas.drawText(k.d(i), af[i * 2], f - f1, a);
	//   46  102:aload_1         
	//   47  103:aload_0         
	//   48  104:getfield        #73  <Field lp k>
	//   49  107:iload           5
	//   50  109:invokevirtual   #173 <Method String lp.d(int)>
	//   51  112:aload_3         
	//   52  113:iload           5
	//   53  115:iconst_2        
	//   54  116:imul            
	//   55  117:faload          
	//   56  118:fload_2         
	//   57  119:fload           4
	//   58  121:fsub            
	//   59  122:aload_0         
	//   60  123:getfield        #144 <Field Paint a>
	//   61  126:invokevirtual   #177 <Method void Canvas.drawText(String, float, float, Paint)>

	//   62  129:iload           5
	//   63  131:iconst_1        
	//   64  132:iadd            
	//   65  133:istore          5
	//*  66  135:goto            95
	//   67  138:return          
	}

	protected float[] a()
	{
		if(o.length != k.d * 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field float[] o>
	//*   2    4:arraylength     
	//*   3    5:aload_0         
	//*   4    6:getfield        #73  <Field lp k>
	//*   5    9:getfield        #170 <Field int lp.d>
	//*   6   12:iconst_2        
	//*   7   13:imul            
	//*   8   14:icmpeq          32
			o = new float[k.d * 2];
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #73  <Field lp k>
	//   12   22:getfield        #170 <Field int lp.d>
	//   13   25:iconst_2        
	//   14   26:imul            
	//   15   27:newarray        float[]
	//   16   29:putfield        #181 <Field float[] o>
		float af[] = o;
	//   17   32:aload_0         
	//   18   33:getfield        #181 <Field float[] o>
	//   19   36:astore_2        
		for(int i = 0; i < af.length; i += 2)
	//*  20   37:iconst_0        
	//*  21   38:istore_1        
	//*  22   39:iload_1         
	//*  23   40:aload_2         
	//*  24   41:arraylength     
	//*  25   42:icmpge          66
			af[i] = k.a[i / 2];
	//   26   45:aload_2         
	//   27   46:iload_1         
	//   28   47:aload_0         
	//   29   48:getfield        #73  <Field lp k>
	//   30   51:getfield        #183 <Field float[] lp.a>
	//   31   54:iload_1         
	//   32   55:iconst_2        
	//   33   56:idiv            
	//   34   57:faload          
	//   35   58:fastore         

	//   36   59:iload_1         
	//   37   60:iconst_2        
	//   38   61:iadd            
	//   39   62:istore_1        
	//*  40   63:goto            39
		e.e(af);
	//   41   66:aload_0         
	//   42   67:getfield        #94  <Field nv e>
	//   43   70:aload_2         
	//   44   71:invokevirtual   #186 <Method void nv.e(float[])>
		return af;
	//   45   74:aload_2         
	//   46   75:areturn         
	}

	protected Path b(Path path, int i, float af[])
	{
		path.moveTo(af[i], l.e());
	//    0    0:aload_1         
	//    1    1:aload_3         
	//    2    2:iload_2         
	//    3    3:faload          
	//    4    4:aload_0         
	//    5    5:getfield        #57  <Field oa l>
	//    6    8:invokevirtual   #125 <Method float oa.e()>
	//    7   11:invokevirtual   #128 <Method void Path.moveTo(float, float)>
		path.lineTo(af[i], l.i());
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:iload_2         
	//   11   17:faload          
	//   12   18:aload_0         
	//   13   19:getfield        #57  <Field oa l>
	//   14   22:invokevirtual   #131 <Method float oa.i()>
	//   15   25:invokevirtual   #134 <Method void Path.lineTo(float, float)>
		return path;
	//   16   28:aload_1         
	//   17   29:areturn         
	}

	public RectF b()
	{
		g.set(l.m());
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field RectF g>
	//    2    4:aload_0         
	//    3    5:getfield        #57  <Field oa l>
	//    4    8:invokevirtual   #63  <Method RectF oa.m()>
	//    5   11:invokevirtual   #69  <Method void RectF.set(RectF)>
		g.inset(-c.i(), 0.0F);
	//    6   14:aload_0         
	//    7   15:getfield        #190 <Field RectF g>
	//    8   18:aload_0         
	//    9   19:getfield        #194 <Field lh c>
	//   10   22:invokevirtual   #197 <Method float lh.i()>
	//   11   25:fneg            
	//   12   26:fconst_0        
	//   13   27:invokevirtual   #83  <Method void RectF.inset(float, float)>
		return g;
	//   14   30:aload_0         
	//   15   31:getfield        #190 <Field RectF g>
	//   16   34:areturn         
	}

	public void b(Canvas canvas)
	{
		if(!k.B() || !k.g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field lp k>
	//*   2    4:invokevirtual   #200 <Method boolean lp.B()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #73  <Field lp k>
	//*   6   14:invokevirtual   #202 <Method boolean lp.g()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float af[] = a();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #204 <Method float[] a()>
	//   11   25:astore          4
		a.setTypeface(k.x());
	//   12   27:aload_0         
	//   13   28:getfield        #144 <Field Paint a>
	//   14   31:aload_0         
	//   15   32:getfield        #73  <Field lp k>
	//   16   35:invokevirtual   #148 <Method android.graphics.Typeface lp.x()>
	//   17   38:invokevirtual   #152 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   18   41:pop             
		a.setTextSize(k.z());
	//   19   42:aload_0         
	//   20   43:getfield        #144 <Field Paint a>
	//   21   46:aload_0         
	//   22   47:getfield        #73  <Field lp k>
	//   23   50:invokevirtual   #155 <Method float lp.z()>
	//   24   53:invokevirtual   #158 <Method void Paint.setTextSize(float)>
		a.setColor(k.A());
	//   25   56:aload_0         
	//   26   57:getfield        #144 <Field Paint a>
	//   27   60:aload_0         
	//   28   61:getfield        #73  <Field lp k>
	//   29   64:invokevirtual   #161 <Method int lp.A()>
	//   30   67:invokevirtual   #110 <Method void Paint.setColor(int)>
		a.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   31   70:aload_0         
	//   32   71:getfield        #144 <Field Paint a>
	//   33   74:getstatic       #207 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   34   77:invokevirtual   #40  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		float f = oc.b(2.5F);
	//   35   80:ldc1            #208 <Float 2.5F>
	//   36   82:invokestatic    #213 <Method float oc.b(float)>
	//   37   85:fstore_2        
		float f1 = oc.e(a, "Q");
	//   38   86:aload_0         
	//   39   87:getfield        #144 <Field Paint a>
	//   40   90:ldc1            #215 <String "Q">
	//   41   92:invokestatic    #218 <Method int oc.e(Paint, String)>
	//   42   95:i2f             
	//   43   96:fstore_3        
		lp.b b1 = k.j();
	//   44   97:aload_0         
	//   45   98:getfield        #73  <Field lp k>
	//   46  101:invokevirtual   #222 <Method lp$b lp.j()>
	//   47  104:astore          5
		lp.c c1 = k.H();
	//   48  106:aload_0         
	//   49  107:getfield        #73  <Field lp k>
	//   50  110:invokevirtual   #226 <Method lp$c lp.H()>
	//   51  113:astore          6
		if(b1 == lp.b.b)
	//*  52  115:aload           5
	//*  53  117:getstatic       #231 <Field lp$b lp$b.b>
	//*  54  120:if_acmpne       157
		{
			if(c1 == lp.c.a)
	//*  55  123:aload           6
	//*  56  125:getstatic       #236 <Field lp$c lp$c.a>
	//*  57  128:if_acmpne       144
				f = l.e() - f;
	//   58  131:aload_0         
	//   59  132:getfield        #57  <Field oa l>
	//   60  135:invokevirtual   #125 <Method float oa.e()>
	//   61  138:fload_2         
	//   62  139:fsub            
	//   63  140:fstore_2        
			else
	//*  64  141:goto            192
				f = l.e() - f;
	//   65  144:aload_0         
	//   66  145:getfield        #57  <Field oa l>
	//   67  148:invokevirtual   #125 <Method float oa.e()>
	//   68  151:fload_2         
	//   69  152:fsub            
	//   70  153:fstore_2        
		} else
	//*  71  154:goto            192
		if(c1 == lp.c.a)
	//*  72  157:aload           6
	//*  73  159:getstatic       #236 <Field lp$c lp$c.a>
	//*  74  162:if_acmpne       180
			f = l.i() + f1 + f;
	//   75  165:aload_0         
	//   76  166:getfield        #57  <Field oa l>
	//   77  169:invokevirtual   #131 <Method float oa.i()>
	//   78  172:fload_3         
	//   79  173:fadd            
	//   80  174:fload_2         
	//   81  175:fadd            
	//   82  176:fstore_2        
		else
	//*  83  177:goto            192
			f = l.i() + f1 + f;
	//   84  180:aload_0         
	//   85  181:getfield        #57  <Field oa l>
	//   86  184:invokevirtual   #131 <Method float oa.i()>
	//   87  187:fload_3         
	//   88  188:fadd            
	//   89  189:fload_2         
	//   90  190:fadd            
	//   91  191:fstore_2        
		a(canvas, f, af, k.y());
	//   92  192:aload_0         
	//   93  193:aload_1         
	//   94  194:fload_2         
	//   95  195:aload           4
	//   96  197:aload_0         
	//   97  198:getfield        #73  <Field lp k>
	//   98  201:invokevirtual   #239 <Method float lp.y()>
	//   99  204:invokevirtual   #241 <Method void a(Canvas, float, float[], float)>
	//  100  207:return          
	}

	public void c(Canvas canvas)
	{
		List list = k.l();
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field lp k>
	//    2    4:invokevirtual   #244 <Method List lp.l()>
	//    3    7:astore          7
		if(list == null || list.size() <= 0)
	//*   4    9:aload           7
	//*   5   11:ifnull          24
	//*   6   14:aload           7
	//*   7   16:invokeinterface #249 <Method int List.size()>
	//*   8   21:ifgt            25
			return;
	//    9   24:return          
		float af[] = u;
	//   10   25:aload_0         
	//   11   26:getfield        #24  <Field float[] u>
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
		af[2] = 0.0F;
	//   21   41:aload           8
	//   22   43:iconst_2        
	//   23   44:fconst_0        
	//   24   45:fastore         
		af[3] = 0.0F;
	//   25   46:aload           8
	//   26   48:iconst_3        
	//   27   49:fconst_0        
	//   28   50:fastore         
		Path path = s;
	//   29   51:aload_0         
	//   30   52:getfield        #22  <Field Path s>
	//   31   55:astore          9
		path.reset();
	//   32   57:aload           9
	//   33   59:invokevirtual   #117 <Method void Path.reset()>
		for(int i = 0; i < list.size(); i++)
	//*  34   62:iconst_0        
	//*  35   63:istore          5
	//*  36   65:iload           5
	//*  37   67:aload           7
	//*  38   69:invokeinterface #249 <Method int List.size()>
	//*  39   74:icmpge          621
		{
			Object obj = ((Object) ((lq)list.get(i)));
	//   40   77:aload           7
	//   41   79:iload           5
	//   42   81:invokeinterface #253 <Method Object List.get(int)>
	//   43   86:checkcast       #255 <Class lq>
	//   44   89:astore          11
			if(!((lq) (obj)).B())
	//*  45   91:aload           11
	//*  46   93:invokevirtual   #256 <Method boolean lq.B()>
	//*  47   96:ifne            102
				continue;
	//   48   99:goto            612
			int j = canvas.save();
	//   49  102:aload_1         
	//   50  103:invokevirtual   #49  <Method int Canvas.save()>
	//   51  106:istore          6
			t.set(l.m());
	//   52  108:aload_0         
	//   53  109:getfield        #86  <Field RectF t>
	//   54  112:aload_0         
	//   55  113:getfield        #57  <Field oa l>
	//   56  116:invokevirtual   #63  <Method RectF oa.m()>
	//   57  119:invokevirtual   #69  <Method void RectF.set(RectF)>
			t.inset(-((lq) (obj)).d(), 0.0F);
	//   58  122:aload_0         
	//   59  123:getfield        #86  <Field RectF t>
	//   60  126:aload           11
	//   61  128:invokevirtual   #258 <Method float lq.d()>
	//   62  131:fneg            
	//   63  132:fconst_0        
	//   64  133:invokevirtual   #83  <Method void RectF.inset(float, float)>
			canvas.clipRect(t);
	//   65  136:aload_1         
	//   66  137:aload_0         
	//   67  138:getfield        #86  <Field RectF t>
	//   68  141:invokevirtual   #90  <Method boolean Canvas.clipRect(RectF)>
	//   69  144:pop             
			af[0] = ((lq) (obj)).e();
	//   70  145:aload           8
	//   71  147:iconst_0        
	//   72  148:aload           11
	//   73  150:invokevirtual   #259 <Method float lq.e()>
	//   74  153:fastore         
			af[2] = ((lq) (obj)).e();
	//   75  154:aload           8
	//   76  156:iconst_2        
	//   77  157:aload           11
	//   78  159:invokevirtual   #259 <Method float lq.e()>
	//   79  162:fastore         
			e.e(af);
	//   80  163:aload_0         
	//   81  164:getfield        #94  <Field nv e>
	//   82  167:aload           8
	//   83  169:invokevirtual   #186 <Method void nv.e(float[])>
			af[1] = l.e();
	//   84  172:aload           8
	//   85  174:iconst_1        
	//   86  175:aload_0         
	//   87  176:getfield        #57  <Field oa l>
	//   88  179:invokevirtual   #125 <Method float oa.e()>
	//   89  182:fastore         
			af[3] = l.i();
	//   90  183:aload           8
	//   91  185:iconst_3        
	//   92  186:aload_0         
	//   93  187:getfield        #57  <Field oa l>
	//   94  190:invokevirtual   #131 <Method float oa.i()>
	//   95  193:fastore         
			path.moveTo(af[0], af[1]);
	//   96  194:aload           9
	//   97  196:aload           8
	//   98  198:iconst_0        
	//   99  199:faload          
	//  100  200:aload           8
	//  101  202:iconst_1        
	//  102  203:faload          
	//  103  204:invokevirtual   #128 <Method void Path.moveTo(float, float)>
			path.lineTo(af[2], af[3]);
	//  104  207:aload           9
	//  105  209:aload           8
	//  106  211:iconst_2        
	//  107  212:faload          
	//  108  213:aload           8
	//  109  215:iconst_3        
	//  110  216:faload          
	//  111  217:invokevirtual   #134 <Method void Path.lineTo(float, float)>
			h.setStyle(android.graphics.Paint.Style.STROKE);
	//  112  220:aload_0         
	//  113  221:getfield        #28  <Field Paint h>
	//  114  224:getstatic       #265 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  115  227:invokevirtual   #269 <Method void Paint.setStyle(android.graphics.Paint$Style)>
			h.setColor(((lq) (obj)).b());
	//  116  230:aload_0         
	//  117  231:getfield        #28  <Field Paint h>
	//  118  234:aload           11
	//  119  236:invokevirtual   #271 <Method int lq.b()>
	//  120  239:invokevirtual   #110 <Method void Paint.setColor(int)>
			h.setPathEffect(((android.graphics.PathEffect) (((lq) (obj)).a())));
	//  121  242:aload_0         
	//  122  243:getfield        #28  <Field Paint h>
	//  123  246:aload           11
	//  124  248:invokevirtual   #274 <Method android.graphics.DashPathEffect lq.a()>
	//  125  251:invokevirtual   #278 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  126  254:pop             
			h.setStrokeWidth(((lq) (obj)).d());
	//  127  255:aload_0         
	//  128  256:getfield        #28  <Field Paint h>
	//  129  259:aload           11
	//  130  261:invokevirtual   #258 <Method float lq.d()>
	//  131  264:invokevirtual   #114 <Method void Paint.setStrokeWidth(float)>
			canvas.drawPath(path, h);
	//  132  267:aload_1         
	//  133  268:aload           9
	//  134  270:aload_0         
	//  135  271:getfield        #28  <Field Paint h>
	//  136  274:invokevirtual   #138 <Method void Canvas.drawPath(Path, Paint)>
			path.reset();
	//  137  277:aload           9
	//  138  279:invokevirtual   #117 <Method void Path.reset()>
			String s1 = ((lq) (obj)).f();
	//  139  282:aload           11
	//  140  284:invokevirtual   #281 <Method String lq.f()>
	//  141  287:astore          10
			if(s1 != null && !s1.equals(""))
	//* 142  289:aload           10
	//* 143  291:ifnull          606
	//* 144  294:aload           10
	//* 145  296:ldc2            #283 <String "">
	//* 146  299:invokevirtual   #289 <Method boolean String.equals(Object)>
	//* 147  302:ifne            606
			{
				h.setStyle(((lq) (obj)).c());
	//  148  305:aload_0         
	//  149  306:getfield        #28  <Field Paint h>
	//  150  309:aload           11
	//  151  311:invokevirtual   #292 <Method android.graphics.Paint$Style lq.c()>
	//  152  314:invokevirtual   #269 <Method void Paint.setStyle(android.graphics.Paint$Style)>
				h.setPathEffect(((android.graphics.PathEffect) (null)));
	//  153  317:aload_0         
	//  154  318:getfield        #28  <Field Paint h>
	//  155  321:aconst_null     
	//  156  322:invokevirtual   #278 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  157  325:pop             
				h.setColor(((lq) (obj)).A());
	//  158  326:aload_0         
	//  159  327:getfield        #28  <Field Paint h>
	//  160  330:aload           11
	//  161  332:invokevirtual   #293 <Method int lq.A()>
	//  162  335:invokevirtual   #110 <Method void Paint.setColor(int)>
				h.setTypeface(((lq) (obj)).x());
	//  163  338:aload_0         
	//  164  339:getfield        #28  <Field Paint h>
	//  165  342:aload           11
	//  166  344:invokevirtual   #294 <Method android.graphics.Typeface lq.x()>
	//  167  347:invokevirtual   #152 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//  168  350:pop             
				h.setStrokeWidth(0.5F);
	//  169  351:aload_0         
	//  170  352:getfield        #28  <Field Paint h>
	//  171  355:ldc2            #295 <Float 0.5F>
	//  172  358:invokevirtual   #114 <Method void Paint.setStrokeWidth(float)>
				h.setTextSize(((lq) (obj)).z());
	//  173  361:aload_0         
	//  174  362:getfield        #28  <Field Paint h>
	//  175  365:aload           11
	//  176  367:invokevirtual   #296 <Method float lq.z()>
	//  177  370:invokevirtual   #158 <Method void Paint.setTextSize(float)>
				float f = ((lq) (obj)).d() + ((lq) (obj)).v();
	//  178  373:aload           11
	//  179  375:invokevirtual   #258 <Method float lq.d()>
	//  180  378:aload           11
	//  181  380:invokevirtual   #299 <Method float lq.v()>
	//  182  383:fadd            
	//  183  384:fstore_2        
				float f1 = oc.b(2.0F) + ((lq) (obj)).y();
	//  184  385:fconst_2        
	//  185  386:invokestatic    #213 <Method float oc.b(float)>
	//  186  389:aload           11
	//  187  391:invokevirtual   #300 <Method float lq.y()>
	//  188  394:fadd            
	//  189  395:fstore_3        
				obj = ((Object) (((lq) (obj)).k()));
	//  190  396:aload           11
	//  191  398:invokevirtual   #303 <Method lq$e lq.k()>
	//  192  401:astore          11
				if(obj == lq.e.b)
	//* 193  403:aload           11
	//* 194  405:getstatic       #308 <Field lq$e lq$e.b>
	//* 195  408:if_acmpne       464
				{
					float f2 = oc.e(h, s1);
	//  196  411:aload_0         
	//  197  412:getfield        #28  <Field Paint h>
	//  198  415:aload           10
	//  199  417:invokestatic    #218 <Method int oc.e(Paint, String)>
	//  200  420:i2f             
	//  201  421:fstore          4
					h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  202  423:aload_0         
	//  203  424:getfield        #28  <Field Paint h>
	//  204  427:getstatic       #34  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  205  430:invokevirtual   #40  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s1, af[0] + f, l.e() + f1 + f2, h);
	//  206  433:aload_1         
	//  207  434:aload           10
	//  208  436:aload           8
	//  209  438:iconst_0        
	//  210  439:faload          
	//  211  440:fload_2         
	//  212  441:fadd            
	//  213  442:aload_0         
	//  214  443:getfield        #57  <Field oa l>
	//  215  446:invokevirtual   #125 <Method float oa.e()>
	//  216  449:fload_3         
	//  217  450:fadd            
	//  218  451:fload           4
	//  219  453:fadd            
	//  220  454:aload_0         
	//  221  455:getfield        #28  <Field Paint h>
	//  222  458:invokevirtual   #177 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 223  461:goto            606
				if(obj == lq.e.a)
	//* 224  464:aload           11
	//* 225  466:getstatic       #310 <Field lq$e lq$e.a>
	//* 226  469:if_acmpne       510
				{
					h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  227  472:aload_0         
	//  228  473:getfield        #28  <Field Paint h>
	//  229  476:getstatic       #34  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  230  479:invokevirtual   #40  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s1, af[0] + f, l.i() - f1, h);
	//  231  482:aload_1         
	//  232  483:aload           10
	//  233  485:aload           8
	//  234  487:iconst_0        
	//  235  488:faload          
	//  236  489:fload_2         
	//  237  490:fadd            
	//  238  491:aload_0         
	//  239  492:getfield        #57  <Field oa l>
	//  240  495:invokevirtual   #131 <Method float oa.i()>
	//  241  498:fload_3         
	//  242  499:fsub            
	//  243  500:aload_0         
	//  244  501:getfield        #28  <Field Paint h>
	//  245  504:invokevirtual   #177 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 246  507:goto            606
				if(obj == lq.e.c)
	//* 247  510:aload           11
	//* 248  512:getstatic       #312 <Field lq$e lq$e.c>
	//* 249  515:if_acmpne       571
				{
					h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  250  518:aload_0         
	//  251  519:getfield        #28  <Field Paint h>
	//  252  522:getstatic       #315 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  253  525:invokevirtual   #40  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					float f3 = oc.e(h, s1);
	//  254  528:aload_0         
	//  255  529:getfield        #28  <Field Paint h>
	//  256  532:aload           10
	//  257  534:invokestatic    #218 <Method int oc.e(Paint, String)>
	//  258  537:i2f             
	//  259  538:fstore          4
					canvas.drawText(s1, af[0] - f, l.e() + f1 + f3, h);
	//  260  540:aload_1         
	//  261  541:aload           10
	//  262  543:aload           8
	//  263  545:iconst_0        
	//  264  546:faload          
	//  265  547:fload_2         
	//  266  548:fsub            
	//  267  549:aload_0         
	//  268  550:getfield        #57  <Field oa l>
	//  269  553:invokevirtual   #125 <Method float oa.e()>
	//  270  556:fload_3         
	//  271  557:fadd            
	//  272  558:fload           4
	//  273  560:fadd            
	//  274  561:aload_0         
	//  275  562:getfield        #28  <Field Paint h>
	//  276  565:invokevirtual   #177 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 277  568:goto            606
				{
					h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  278  571:aload_0         
	//  279  572:getfield        #28  <Field Paint h>
	//  280  575:getstatic       #315 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  281  578:invokevirtual   #40  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s1, af[0] - f, l.i() - f1, h);
	//  282  581:aload_1         
	//  283  582:aload           10
	//  284  584:aload           8
	//  285  586:iconst_0        
	//  286  587:faload          
	//  287  588:fload_2         
	//  288  589:fsub            
	//  289  590:aload_0         
	//  290  591:getfield        #57  <Field oa l>
	//  291  594:invokevirtual   #131 <Method float oa.i()>
	//  292  597:fload_3         
	//  293  598:fsub            
	//  294  599:aload_0         
	//  295  600:getfield        #28  <Field Paint h>
	//  296  603:invokevirtual   #177 <Method void Canvas.drawText(String, float, float, Paint)>
				}
			}
			canvas.restoreToCount(j);
	//  297  606:aload_1         
	//  298  607:iload           6
	//  299  609:invokevirtual   #141 <Method void Canvas.restoreToCount(int)>
		}

	//  300  612:iload           5
	//  301  614:iconst_1        
	//  302  615:iadd            
	//  303  616:istore          5
	//* 304  618:goto            65
	//  305  621:return          
	}

	public void d(float f, float f1, boolean flag)
	{
		float f3 = f;
	//    0    0:fload_1         
	//    1    1:fstore          5
		float f2 = f1;
	//    2    3:fload_2         
	//    3    4:fstore          4
		if(l.k() > 10F)
	//*   4    6:aload_0         
	//*   5    7:getfield        #57  <Field oa l>
	//*   6   10:invokevirtual   #318 <Method float oa.k()>
	//*   7   13:ldc2            #319 <Float 10F>
	//*   8   16:fcmpl           
	//*   9   17:ifle            133
		{
			f3 = f;
	//   10   20:fload_1         
	//   11   21:fstore          5
			f2 = f1;
	//   12   23:fload_2         
	//   13   24:fstore          4
			if(!l.q())
	//*  14   26:aload_0         
	//*  15   27:getfield        #57  <Field oa l>
	//*  16   30:invokevirtual   #321 <Method boolean oa.q()>
	//*  17   33:ifne            133
			{
				nw nw1 = e.b(l.f(), l.e());
	//   18   36:aload_0         
	//   19   37:getfield        #94  <Field nv e>
	//   20   40:aload_0         
	//   21   41:getfield        #57  <Field oa l>
	//   22   44:invokevirtual   #323 <Method float oa.f()>
	//   23   47:aload_0         
	//   24   48:getfield        #57  <Field oa l>
	//   25   51:invokevirtual   #125 <Method float oa.e()>
	//   26   54:invokevirtual   #325 <Method nw nv.b(float, float)>
	//   27   57:astore          6
				nw nw2 = e.b(l.h(), l.e());
	//   28   59:aload_0         
	//   29   60:getfield        #94  <Field nv e>
	//   30   63:aload_0         
	//   31   64:getfield        #57  <Field oa l>
	//   32   67:invokevirtual   #327 <Method float oa.h()>
	//   33   70:aload_0         
	//   34   71:getfield        #57  <Field oa l>
	//   35   74:invokevirtual   #125 <Method float oa.e()>
	//   36   77:invokevirtual   #325 <Method nw nv.b(float, float)>
	//   37   80:astore          7
				if(!flag)
	//*  38   82:iload_3         
	//*  39   83:ifne            103
				{
					f = (float)nw1.b;
	//   40   86:aload           6
	//   41   88:getfield        #123 <Field double nw.b>
	//   42   91:d2f             
	//   43   92:fstore_1        
					f1 = (float)nw2.b;
	//   44   93:aload           7
	//   45   95:getfield        #123 <Field double nw.b>
	//   46   98:d2f             
	//   47   99:fstore_2        
				} else
	//*  48  100:goto            117
				{
					f = (float)nw2.b;
	//   49  103:aload           7
	//   50  105:getfield        #123 <Field double nw.b>
	//   51  108:d2f             
	//   52  109:fstore_1        
					f1 = (float)nw1.b;
	//   53  110:aload           6
	//   54  112:getfield        #123 <Field double nw.b>
	//   55  115:d2f             
	//   56  116:fstore_2        
				}
				nw.e(nw1);
	//   57  117:aload           6
	//   58  119:invokestatic    #330 <Method void nw.e(nw)>
				nw.e(nw2);
	//   59  122:aload           7
	//   60  124:invokestatic    #330 <Method void nw.e(nw)>
				f2 = f1;
	//   61  127:fload_2         
	//   62  128:fstore          4
				f3 = f;
	//   63  130:fload_1         
	//   64  131:fstore          5
			}
		}
		d(f3, f2);
	//   65  133:aload_0         
	//   66  134:fload           5
	//   67  136:fload           4
	//   68  138:invokevirtual   #332 <Method void d(float, float)>
	//   69  141:return          
	}

	public void d(Canvas canvas)
	{
		if(!k.B() || !k.c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field lp k>
	//*   2    4:invokevirtual   #200 <Method boolean lp.B()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #73  <Field lp k>
	//*   6   14:invokevirtual   #334 <Method boolean lp.c()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		b.setColor(k.k());
	//    9   21:aload_0         
	//   10   22:getfield        #336 <Field Paint b>
	//   11   25:aload_0         
	//   12   26:getfield        #73  <Field lp k>
	//   13   29:invokevirtual   #338 <Method int lp.k()>
	//   14   32:invokevirtual   #110 <Method void Paint.setColor(int)>
		b.setStrokeWidth(k.d());
	//   15   35:aload_0         
	//   16   36:getfield        #336 <Field Paint b>
	//   17   39:aload_0         
	//   18   40:getfield        #73  <Field lp k>
	//   19   43:invokevirtual   #339 <Method float lp.d()>
	//   20   46:invokevirtual   #114 <Method void Paint.setStrokeWidth(float)>
		if(k.j() == lp.b.b)
	//*  21   49:aload_0         
	//*  22   50:getfield        #73  <Field lp k>
	//*  23   53:invokevirtual   #222 <Method lp$b lp.j()>
	//*  24   56:getstatic       #231 <Field lp$b lp$b.b>
	//*  25   59:if_acmpne       99
		{
			canvas.drawLine(l.f(), l.e(), l.h(), l.e(), b);
	//   26   62:aload_1         
	//   27   63:aload_0         
	//   28   64:getfield        #57  <Field oa l>
	//   29   67:invokevirtual   #323 <Method float oa.f()>
	//   30   70:aload_0         
	//   31   71:getfield        #57  <Field oa l>
	//   32   74:invokevirtual   #125 <Method float oa.e()>
	//   33   77:aload_0         
	//   34   78:getfield        #57  <Field oa l>
	//   35   81:invokevirtual   #327 <Method float oa.h()>
	//   36   84:aload_0         
	//   37   85:getfield        #57  <Field oa l>
	//   38   88:invokevirtual   #125 <Method float oa.e()>
	//   39   91:aload_0         
	//   40   92:getfield        #336 <Field Paint b>
	//   41   95:invokevirtual   #343 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   42   98:return          
		} else
		{
			canvas.drawLine(l.f(), l.i(), l.h(), l.i(), b);
	//   43   99:aload_1         
	//   44  100:aload_0         
	//   45  101:getfield        #57  <Field oa l>
	//   46  104:invokevirtual   #323 <Method float oa.f()>
	//   47  107:aload_0         
	//   48  108:getfield        #57  <Field oa l>
	//   49  111:invokevirtual   #131 <Method float oa.i()>
	//   50  114:aload_0         
	//   51  115:getfield        #57  <Field oa l>
	//   52  118:invokevirtual   #327 <Method float oa.h()>
	//   53  121:aload_0         
	//   54  122:getfield        #57  <Field oa l>
	//   55  125:invokevirtual   #131 <Method float oa.i()>
	//   56  128:aload_0         
	//   57  129:getfield        #336 <Field Paint b>
	//   58  132:invokevirtual   #343 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   59  135:return          
		}
	}

	protected Path q;
	protected Path s;
	protected float u[];
}
