// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import java.util.List;

// Referenced classes of package o:
//			ni, oc, oa, lp, 
//			nv, nw, lh, lq

public class nt extends ni
{

	public nt(oa oa1, lp lp1, nv nv1)
	{
		super(oa1, nv1, ((lh) (lp1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload_2         
	//    4    4:invokespecial   #24  <Method void ni(oa, nv, lh)>
		i = new Path();
	//    5    7:aload_0         
	//    6    8:new             #26  <Class Path>
	//    7   11:dup             
	//    8   12:invokespecial   #29  <Method void Path()>
	//    9   15:putfield        #31  <Field Path i>
		g = new RectF();
	//   10   18:aload_0         
	//   11   19:new             #33  <Class RectF>
	//   12   22:dup             
	//   13   23:invokespecial   #34  <Method void RectF()>
	//   14   26:putfield        #36  <Field RectF g>
		o = new float[2];
	//   15   29:aload_0         
	//   16   30:iconst_2        
	//   17   31:newarray        float[]
	//   18   33:putfield        #38  <Field float[] o>
		m = new Path();
	//   19   36:aload_0         
	//   20   37:new             #26  <Class Path>
	//   21   40:dup             
	//   22   41:invokespecial   #29  <Method void Path()>
	//   23   44:putfield        #40  <Field Path m>
		p = new RectF();
	//   24   47:aload_0         
	//   25   48:new             #33  <Class RectF>
	//   26   51:dup             
	//   27   52:invokespecial   #34  <Method void RectF()>
	//   28   55:putfield        #42  <Field RectF p>
		n = new Path();
	//   29   58:aload_0         
	//   30   59:new             #26  <Class Path>
	//   31   62:dup             
	//   32   63:invokespecial   #29  <Method void Path()>
	//   33   66:putfield        #44  <Field Path n>
		r = new float[2];
	//   34   69:aload_0         
	//   35   70:iconst_2        
	//   36   71:newarray        float[]
	//   37   73:putfield        #46  <Field float[] r>
		t = new RectF();
	//   38   76:aload_0         
	//   39   77:new             #33  <Class RectF>
	//   40   80:dup             
	//   41   81:invokespecial   #34  <Method void RectF()>
	//   42   84:putfield        #48  <Field RectF t>
		k = lp1;
	//   43   87:aload_0         
	//   44   88:aload_2         
	//   45   89:putfield        #50  <Field lp k>
		if(l != null)
	//*  46   92:aload_0         
	//*  47   93:getfield        #54  <Field oa l>
	//*  48   96:ifnull          159
		{
			a.setColor(0xff000000);
	//   49   99:aload_0         
	//   50  100:getfield        #57  <Field Paint a>
	//   51  103:ldc1            #58  <Int 0xff000000>
	//   52  105:invokevirtual   #64  <Method void Paint.setColor(int)>
			a.setTextSize(oc.b(10F));
	//   53  108:aload_0         
	//   54  109:getfield        #57  <Field Paint a>
	//   55  112:ldc1            #65  <Float 10F>
	//   56  114:invokestatic    #71  <Method float oc.b(float)>
	//   57  117:invokevirtual   #75  <Method void Paint.setTextSize(float)>
			f = new Paint(1);
	//   58  120:aload_0         
	//   59  121:new             #60  <Class Paint>
	//   60  124:dup             
	//   61  125:iconst_1        
	//   62  126:invokespecial   #77  <Method void Paint(int)>
	//   63  129:putfield        #79  <Field Paint f>
			f.setColor(0xff888888);
	//   64  132:aload_0         
	//   65  133:getfield        #79  <Field Paint f>
	//   66  136:ldc1            #80  <Int 0xff888888>
	//   67  138:invokevirtual   #64  <Method void Paint.setColor(int)>
			f.setStrokeWidth(1.0F);
	//   68  141:aload_0         
	//   69  142:getfield        #79  <Field Paint f>
	//   70  145:fconst_1        
	//   71  146:invokevirtual   #83  <Method void Paint.setStrokeWidth(float)>
			f.setStyle(android.graphics.Paint.Style.STROKE);
	//   72  149:aload_0         
	//   73  150:getfield        #79  <Field Paint f>
	//   74  153:getstatic       #89  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   75  156:invokevirtual   #93  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		}
	//   76  159:return          
	}

	protected void a(Canvas canvas)
	{
		int j = canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #101 <Method int Canvas.save()>
	//    2    4:istore_2        
		p.set(l.m());
	//    3    5:aload_0         
	//    4    6:getfield        #42  <Field RectF p>
	//    5    9:aload_0         
	//    6   10:getfield        #54  <Field oa l>
	//    7   13:invokevirtual   #106 <Method RectF oa.m()>
	//    8   16:invokevirtual   #110 <Method void RectF.set(RectF)>
		p.inset(0.0F, -k.N());
	//    9   19:aload_0         
	//   10   20:getfield        #42  <Field RectF p>
	//   11   23:fconst_0        
	//   12   24:aload_0         
	//   13   25:getfield        #50  <Field lp k>
	//   14   28:invokevirtual   #116 <Method float lp.N()>
	//   15   31:fneg            
	//   16   32:invokevirtual   #120 <Method void RectF.inset(float, float)>
		canvas.clipRect(p);
	//   17   35:aload_1         
	//   18   36:aload_0         
	//   19   37:getfield        #42  <Field RectF p>
	//   20   40:invokevirtual   #124 <Method boolean Canvas.clipRect(RectF)>
	//   21   43:pop             
		nw nw1 = e.d(0.0F, 0.0F);
	//   22   44:aload_0         
	//   23   45:getfield        #128 <Field nv e>
	//   24   48:fconst_0        
	//   25   49:fconst_0        
	//   26   50:invokevirtual   #134 <Method nw nv.d(float, float)>
	//   27   53:astore_3        
		f.setColor(k.M());
	//   28   54:aload_0         
	//   29   55:getfield        #79  <Field Paint f>
	//   30   58:aload_0         
	//   31   59:getfield        #50  <Field lp k>
	//   32   62:invokevirtual   #137 <Method int lp.M()>
	//   33   65:invokevirtual   #64  <Method void Paint.setColor(int)>
		f.setStrokeWidth(k.N());
	//   34   68:aload_0         
	//   35   69:getfield        #79  <Field Paint f>
	//   36   72:aload_0         
	//   37   73:getfield        #50  <Field lp k>
	//   38   76:invokevirtual   #116 <Method float lp.N()>
	//   39   79:invokevirtual   #83  <Method void Paint.setStrokeWidth(float)>
		Path path = m;
	//   40   82:aload_0         
	//   41   83:getfield        #40  <Field Path m>
	//   42   86:astore          4
		path.reset();
	//   43   88:aload           4
	//   44   90:invokevirtual   #140 <Method void Path.reset()>
		path.moveTo(l.f(), (float)nw1.c);
	//   45   93:aload           4
	//   46   95:aload_0         
	//   47   96:getfield        #54  <Field oa l>
	//   48   99:invokevirtual   #142 <Method float oa.f()>
	//   49  102:aload_3         
	//   50  103:getfield        #148 <Field double nw.c>
	//   51  106:d2f             
	//   52  107:invokevirtual   #151 <Method void Path.moveTo(float, float)>
		path.lineTo(l.h(), (float)nw1.c);
	//   53  110:aload           4
	//   54  112:aload_0         
	//   55  113:getfield        #54  <Field oa l>
	//   56  116:invokevirtual   #154 <Method float oa.h()>
	//   57  119:aload_3         
	//   58  120:getfield        #148 <Field double nw.c>
	//   59  123:d2f             
	//   60  124:invokevirtual   #157 <Method void Path.lineTo(float, float)>
		canvas.drawPath(path, f);
	//   61  127:aload_1         
	//   62  128:aload           4
	//   63  130:aload_0         
	//   64  131:getfield        #79  <Field Paint f>
	//   65  134:invokevirtual   #161 <Method void Canvas.drawPath(Path, Paint)>
		canvas.restoreToCount(j);
	//   66  137:aload_1         
	//   67  138:iload_2         
	//   68  139:invokevirtual   #164 <Method void Canvas.restoreToCount(int)>
	//   69  142:return          
	}

	protected void a(Canvas canvas, float f1, float af[], float f2)
	{
		int j;
		if(k.I())
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field lp k>
	//*   2    4:invokevirtual   #169 <Method boolean lp.I()>
	//*   3    7:ifeq            16
			j = 0;
	//    4   10:iconst_0        
	//    5   11:istore          5
		else
	//*   6   13:goto            19
			j = 1;
	//    7   16:iconst_1        
	//    8   17:istore          5
		int l;
		if(k.F())
	//*   9   19:aload_0         
	//*  10   20:getfield        #50  <Field lp k>
	//*  11   23:invokevirtual   #172 <Method boolean lp.F()>
	//*  12   26:ifeq            41
			l = k.d;
	//   13   29:aload_0         
	//   14   30:getfield        #50  <Field lp k>
	//   15   33:getfield        #174 <Field int lp.d>
	//   16   36:istore          6
		else
	//*  17   38:goto            52
			l = k.d - 1;
	//   18   41:aload_0         
	//   19   42:getfield        #50  <Field lp k>
	//   20   45:getfield        #174 <Field int lp.d>
	//   21   48:iconst_1        
	//   22   49:isub            
	//   23   50:istore          6
		for(; j < l; j++)
	//*  24   52:iload           5
	//*  25   54:iload           6
	//*  26   56:icmpge          97
			canvas.drawText(k.d(j), f1, af[j * 2 + 1] + f2, a);
	//   27   59:aload_1         
	//   28   60:aload_0         
	//   29   61:getfield        #50  <Field lp k>
	//   30   64:iload           5
	//   31   66:invokevirtual   #177 <Method String lp.d(int)>
	//   32   69:fload_2         
	//   33   70:aload_3         
	//   34   71:iload           5
	//   35   73:iconst_2        
	//   36   74:imul            
	//   37   75:iconst_1        
	//   38   76:iadd            
	//   39   77:faload          
	//   40   78:fload           4
	//   41   80:fadd            
	//   42   81:aload_0         
	//   43   82:getfield        #57  <Field Paint a>
	//   44   85:invokevirtual   #181 <Method void Canvas.drawText(String, float, float, Paint)>

	//   45   88:iload           5
	//   46   90:iconst_1        
	//   47   91:iadd            
	//   48   92:istore          5
	//*  49   94:goto            52
	//   50   97:return          
	}

	protected float[] a()
	{
		if(o.length != k.d * 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field float[] o>
	//*   2    4:arraylength     
	//*   3    5:aload_0         
	//*   4    6:getfield        #50  <Field lp k>
	//*   5    9:getfield        #174 <Field int lp.d>
	//*   6   12:iconst_2        
	//*   7   13:imul            
	//*   8   14:icmpeq          32
			o = new float[k.d * 2];
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #50  <Field lp k>
	//   12   22:getfield        #174 <Field int lp.d>
	//   13   25:iconst_2        
	//   14   26:imul            
	//   15   27:newarray        float[]
	//   16   29:putfield        #38  <Field float[] o>
		float af[] = o;
	//   17   32:aload_0         
	//   18   33:getfield        #38  <Field float[] o>
	//   19   36:astore_2        
		for(int j = 0; j < af.length; j += 2)
	//*  20   37:iconst_0        
	//*  21   38:istore_1        
	//*  22   39:iload_1         
	//*  23   40:aload_2         
	//*  24   41:arraylength     
	//*  25   42:icmpge          68
			af[j + 1] = k.a[j / 2];
	//   26   45:aload_2         
	//   27   46:iload_1         
	//   28   47:iconst_1        
	//   29   48:iadd            
	//   30   49:aload_0         
	//   31   50:getfield        #50  <Field lp k>
	//   32   53:getfield        #184 <Field float[] lp.a>
	//   33   56:iload_1         
	//   34   57:iconst_2        
	//   35   58:idiv            
	//   36   59:faload          
	//   37   60:fastore         

	//   38   61:iload_1         
	//   39   62:iconst_2        
	//   40   63:iadd            
	//   41   64:istore_1        
	//*  42   65:goto            39
		e.e(af);
	//   43   68:aload_0         
	//   44   69:getfield        #128 <Field nv e>
	//   45   72:aload_2         
	//   46   73:invokevirtual   #187 <Method void nv.e(float[])>
		return af;
	//   47   76:aload_2         
	//   48   77:areturn         
	}

	protected Path b(Path path, int j, float af[])
	{
		path.moveTo(l.a(), af[j + 1]);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #54  <Field oa l>
	//    3    5:invokevirtual   #190 <Method float oa.a()>
	//    4    8:aload_3         
	//    5    9:iload_2         
	//    6   10:iconst_1        
	//    7   11:iadd            
	//    8   12:faload          
	//    9   13:invokevirtual   #151 <Method void Path.moveTo(float, float)>
		path.lineTo(l.h(), af[j + 1]);
	//   10   16:aload_1         
	//   11   17:aload_0         
	//   12   18:getfield        #54  <Field oa l>
	//   13   21:invokevirtual   #154 <Method float oa.h()>
	//   14   24:aload_3         
	//   15   25:iload_2         
	//   16   26:iconst_1        
	//   17   27:iadd            
	//   18   28:faload          
	//   19   29:invokevirtual   #157 <Method void Path.lineTo(float, float)>
		return path;
	//   20   32:aload_1         
	//   21   33:areturn         
	}

	public RectF b()
	{
		g.set(l.m());
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field RectF g>
	//    2    4:aload_0         
	//    3    5:getfield        #54  <Field oa l>
	//    4    8:invokevirtual   #106 <Method RectF oa.m()>
	//    5   11:invokevirtual   #110 <Method void RectF.set(RectF)>
		g.inset(0.0F, -c.i());
	//    6   14:aload_0         
	//    7   15:getfield        #36  <Field RectF g>
	//    8   18:fconst_0        
	//    9   19:aload_0         
	//   10   20:getfield        #193 <Field lh c>
	//   11   23:invokevirtual   #197 <Method float lh.i()>
	//   12   26:fneg            
	//   13   27:invokevirtual   #120 <Method void RectF.inset(float, float)>
		return g;
	//   14   30:aload_0         
	//   15   31:getfield        #36  <Field RectF g>
	//   16   34:areturn         
	}

	public void b(Canvas canvas)
	{
		if(!k.B() || !k.g())
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field lp k>
	//*   2    4:invokevirtual   #200 <Method boolean lp.B()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #50  <Field lp k>
	//*   6   14:invokevirtual   #202 <Method boolean lp.g()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float af[] = a();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #204 <Method float[] a()>
	//   11   25:astore          5
		a.setTypeface(k.x());
	//   12   27:aload_0         
	//   13   28:getfield        #57  <Field Paint a>
	//   14   31:aload_0         
	//   15   32:getfield        #50  <Field lp k>
	//   16   35:invokevirtual   #208 <Method android.graphics.Typeface lp.x()>
	//   17   38:invokevirtual   #212 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   18   41:pop             
		a.setTextSize(k.z());
	//   19   42:aload_0         
	//   20   43:getfield        #57  <Field Paint a>
	//   21   46:aload_0         
	//   22   47:getfield        #50  <Field lp k>
	//   23   50:invokevirtual   #215 <Method float lp.z()>
	//   24   53:invokevirtual   #75  <Method void Paint.setTextSize(float)>
		a.setColor(k.A());
	//   25   56:aload_0         
	//   26   57:getfield        #57  <Field Paint a>
	//   27   60:aload_0         
	//   28   61:getfield        #50  <Field lp k>
	//   29   64:invokevirtual   #218 <Method int lp.A()>
	//   30   67:invokevirtual   #64  <Method void Paint.setColor(int)>
		float f1 = k.v();
	//   31   70:aload_0         
	//   32   71:getfield        #50  <Field lp k>
	//   33   74:invokevirtual   #221 <Method float lp.v()>
	//   34   77:fstore_2        
		float f2 = (float)oc.e(a, "A") / 2.5F;
	//   35   78:aload_0         
	//   36   79:getfield        #57  <Field Paint a>
	//   37   82:ldc1            #222 <String "A">
	//   38   84:invokestatic    #225 <Method int oc.e(Paint, String)>
	//   39   87:i2f             
	//   40   88:ldc1            #226 <Float 2.5F>
	//   41   90:fdiv            
	//   42   91:fstore_3        
		float f3 = k.y();
	//   43   92:aload_0         
	//   44   93:getfield        #50  <Field lp k>
	//   45   96:invokevirtual   #229 <Method float lp.y()>
	//   46   99:fstore          4
		lp.b b1 = k.j();
	//   47  101:aload_0         
	//   48  102:getfield        #50  <Field lp k>
	//   49  105:invokevirtual   #233 <Method lp$b lp.j()>
	//   50  108:astore          6
		lp.c c1 = k.H();
	//   51  110:aload_0         
	//   52  111:getfield        #50  <Field lp k>
	//   53  114:invokevirtual   #237 <Method lp$c lp.H()>
	//   54  117:astore          7
		if(b1 == lp.b.b)
	//*  55  119:aload           6
	//*  56  121:getstatic       #242 <Field lp$b lp$b.b>
	//*  57  124:if_acmpne       181
		{
			if(c1 == lp.c.a)
	//*  58  127:aload           7
	//*  59  129:getstatic       #247 <Field lp$c lp$c.a>
	//*  60  132:if_acmpne       158
			{
				a.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//   61  135:aload_0         
	//   62  136:getfield        #57  <Field Paint a>
	//   63  139:getstatic       #253 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//   64  142:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				f1 = l.a() - f1;
	//   65  145:aload_0         
	//   66  146:getfield        #54  <Field oa l>
	//   67  149:invokevirtual   #190 <Method float oa.a()>
	//   68  152:fload_2         
	//   69  153:fsub            
	//   70  154:fstore_2        
			} else
	//*  71  155:goto            232
			{
				a.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   72  158:aload_0         
	//   73  159:getfield        #57  <Field Paint a>
	//   74  162:getstatic       #260 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   75  165:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				f1 = l.a() + f1;
	//   76  168:aload_0         
	//   77  169:getfield        #54  <Field oa l>
	//   78  172:invokevirtual   #190 <Method float oa.a()>
	//   79  175:fload_2         
	//   80  176:fadd            
	//   81  177:fstore_2        
			}
		} else
	//*  82  178:goto            232
		if(c1 == lp.c.a)
	//*  83  181:aload           7
	//*  84  183:getstatic       #247 <Field lp$c lp$c.a>
	//*  85  186:if_acmpne       212
		{
			a.setTextAlign(android.graphics.Paint.Align.LEFT);
	//   86  189:aload_0         
	//   87  190:getfield        #57  <Field Paint a>
	//   88  193:getstatic       #260 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//   89  196:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			f1 = l.h() + f1;
	//   90  199:aload_0         
	//   91  200:getfield        #54  <Field oa l>
	//   92  203:invokevirtual   #154 <Method float oa.h()>
	//   93  206:fload_2         
	//   94  207:fadd            
	//   95  208:fstore_2        
		} else
	//*  96  209:goto            232
		{
			a.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//   97  212:aload_0         
	//   98  213:getfield        #57  <Field Paint a>
	//   99  216:getstatic       #253 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  100  219:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			f1 = l.h() - f1;
	//  101  222:aload_0         
	//  102  223:getfield        #54  <Field oa l>
	//  103  226:invokevirtual   #154 <Method float oa.h()>
	//  104  229:fload_2         
	//  105  230:fsub            
	//  106  231:fstore_2        
		}
		a(canvas, f1, af, f2 + f3);
	//  107  232:aload_0         
	//  108  233:aload_1         
	//  109  234:fload_2         
	//  110  235:aload           5
	//  111  237:fload_3         
	//  112  238:fload           4
	//  113  240:fadd            
	//  114  241:invokevirtual   #262 <Method void a(Canvas, float, float[], float)>
	//  115  244:return          
	}

	public void c(Canvas canvas)
	{
		List list = k.l();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field lp k>
	//    2    4:invokevirtual   #265 <Method List lp.l()>
	//    3    7:astore          7
		if(list == null || list.size() <= 0)
	//*   4    9:aload           7
	//*   5   11:ifnull          24
	//*   6   14:aload           7
	//*   7   16:invokeinterface #270 <Method int List.size()>
	//*   8   21:ifgt            25
			return;
	//    9   24:return          
		float af[] = r;
	//   10   25:aload_0         
	//   11   26:getfield        #46  <Field float[] r>
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
		Path path = n;
	//   21   41:aload_0         
	//   22   42:getfield        #44  <Field Path n>
	//   23   45:astore          9
		path.reset();
	//   24   47:aload           9
	//   25   49:invokevirtual   #140 <Method void Path.reset()>
		for(int j = 0; j < list.size(); j++)
	//*  26   52:iconst_0        
	//*  27   53:istore          5
	//*  28   55:iload           5
	//*  29   57:aload           7
	//*  30   59:invokeinterface #270 <Method int List.size()>
	//*  31   64:icmpge          580
		{
			Object obj = ((Object) ((lq)list.get(j)));
	//   32   67:aload           7
	//   33   69:iload           5
	//   34   71:invokeinterface #274 <Method Object List.get(int)>
	//   35   76:checkcast       #276 <Class lq>
	//   36   79:astore          11
			if(!((lq) (obj)).B())
	//*  37   81:aload           11
	//*  38   83:invokevirtual   #277 <Method boolean lq.B()>
	//*  39   86:ifne            92
				continue;
	//   40   89:goto            571
			int l = canvas.save();
	//   41   92:aload_1         
	//   42   93:invokevirtual   #101 <Method int Canvas.save()>
	//   43   96:istore          6
			t.set(this.l.m());
	//   44   98:aload_0         
	//   45   99:getfield        #48  <Field RectF t>
	//   46  102:aload_0         
	//   47  103:getfield        #54  <Field oa l>
	//   48  106:invokevirtual   #106 <Method RectF oa.m()>
	//   49  109:invokevirtual   #110 <Method void RectF.set(RectF)>
			t.inset(0.0F, -((lq) (obj)).d());
	//   50  112:aload_0         
	//   51  113:getfield        #48  <Field RectF t>
	//   52  116:fconst_0        
	//   53  117:aload           11
	//   54  119:invokevirtual   #279 <Method float lq.d()>
	//   55  122:fneg            
	//   56  123:invokevirtual   #120 <Method void RectF.inset(float, float)>
			canvas.clipRect(t);
	//   57  126:aload_1         
	//   58  127:aload_0         
	//   59  128:getfield        #48  <Field RectF t>
	//   60  131:invokevirtual   #124 <Method boolean Canvas.clipRect(RectF)>
	//   61  134:pop             
			h.setStyle(android.graphics.Paint.Style.STROKE);
	//   62  135:aload_0         
	//   63  136:getfield        #281 <Field Paint h>
	//   64  139:getstatic       #89  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   65  142:invokevirtual   #93  <Method void Paint.setStyle(android.graphics.Paint$Style)>
			h.setColor(((lq) (obj)).b());
	//   66  145:aload_0         
	//   67  146:getfield        #281 <Field Paint h>
	//   68  149:aload           11
	//   69  151:invokevirtual   #283 <Method int lq.b()>
	//   70  154:invokevirtual   #64  <Method void Paint.setColor(int)>
			h.setStrokeWidth(((lq) (obj)).d());
	//   71  157:aload_0         
	//   72  158:getfield        #281 <Field Paint h>
	//   73  161:aload           11
	//   74  163:invokevirtual   #279 <Method float lq.d()>
	//   75  166:invokevirtual   #83  <Method void Paint.setStrokeWidth(float)>
			h.setPathEffect(((android.graphics.PathEffect) (((lq) (obj)).a())));
	//   76  169:aload_0         
	//   77  170:getfield        #281 <Field Paint h>
	//   78  173:aload           11
	//   79  175:invokevirtual   #286 <Method android.graphics.DashPathEffect lq.a()>
	//   80  178:invokevirtual   #290 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   81  181:pop             
			af[1] = ((lq) (obj)).e();
	//   82  182:aload           8
	//   83  184:iconst_1        
	//   84  185:aload           11
	//   85  187:invokevirtual   #292 <Method float lq.e()>
	//   86  190:fastore         
			e.e(af);
	//   87  191:aload_0         
	//   88  192:getfield        #128 <Field nv e>
	//   89  195:aload           8
	//   90  197:invokevirtual   #187 <Method void nv.e(float[])>
			path.moveTo(this.l.f(), af[1]);
	//   91  200:aload           9
	//   92  202:aload_0         
	//   93  203:getfield        #54  <Field oa l>
	//   94  206:invokevirtual   #142 <Method float oa.f()>
	//   95  209:aload           8
	//   96  211:iconst_1        
	//   97  212:faload          
	//   98  213:invokevirtual   #151 <Method void Path.moveTo(float, float)>
			path.lineTo(this.l.h(), af[1]);
	//   99  216:aload           9
	//  100  218:aload_0         
	//  101  219:getfield        #54  <Field oa l>
	//  102  222:invokevirtual   #154 <Method float oa.h()>
	//  103  225:aload           8
	//  104  227:iconst_1        
	//  105  228:faload          
	//  106  229:invokevirtual   #157 <Method void Path.lineTo(float, float)>
			canvas.drawPath(path, h);
	//  107  232:aload_1         
	//  108  233:aload           9
	//  109  235:aload_0         
	//  110  236:getfield        #281 <Field Paint h>
	//  111  239:invokevirtual   #161 <Method void Canvas.drawPath(Path, Paint)>
			path.reset();
	//  112  242:aload           9
	//  113  244:invokevirtual   #140 <Method void Path.reset()>
			String s = ((lq) (obj)).f();
	//  114  247:aload           11
	//  115  249:invokevirtual   #295 <Method String lq.f()>
	//  116  252:astore          10
			if(s != null && !s.equals(""))
	//* 117  254:aload           10
	//* 118  256:ifnull          565
	//* 119  259:aload           10
	//* 120  261:ldc2            #297 <String "">
	//* 121  264:invokevirtual   #303 <Method boolean String.equals(Object)>
	//* 122  267:ifne            565
			{
				h.setStyle(((lq) (obj)).c());
	//  123  270:aload_0         
	//  124  271:getfield        #281 <Field Paint h>
	//  125  274:aload           11
	//  126  276:invokevirtual   #306 <Method android.graphics.Paint$Style lq.c()>
	//  127  279:invokevirtual   #93  <Method void Paint.setStyle(android.graphics.Paint$Style)>
				h.setPathEffect(((android.graphics.PathEffect) (null)));
	//  128  282:aload_0         
	//  129  283:getfield        #281 <Field Paint h>
	//  130  286:aconst_null     
	//  131  287:invokevirtual   #290 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  132  290:pop             
				h.setColor(((lq) (obj)).A());
	//  133  291:aload_0         
	//  134  292:getfield        #281 <Field Paint h>
	//  135  295:aload           11
	//  136  297:invokevirtual   #307 <Method int lq.A()>
	//  137  300:invokevirtual   #64  <Method void Paint.setColor(int)>
				h.setTypeface(((lq) (obj)).x());
	//  138  303:aload_0         
	//  139  304:getfield        #281 <Field Paint h>
	//  140  307:aload           11
	//  141  309:invokevirtual   #308 <Method android.graphics.Typeface lq.x()>
	//  142  312:invokevirtual   #212 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//  143  315:pop             
				h.setStrokeWidth(0.5F);
	//  144  316:aload_0         
	//  145  317:getfield        #281 <Field Paint h>
	//  146  320:ldc2            #309 <Float 0.5F>
	//  147  323:invokevirtual   #83  <Method void Paint.setStrokeWidth(float)>
				h.setTextSize(((lq) (obj)).z());
	//  148  326:aload_0         
	//  149  327:getfield        #281 <Field Paint h>
	//  150  330:aload           11
	//  151  332:invokevirtual   #310 <Method float lq.z()>
	//  152  335:invokevirtual   #75  <Method void Paint.setTextSize(float)>
				float f1 = oc.e(h, s);
	//  153  338:aload_0         
	//  154  339:getfield        #281 <Field Paint h>
	//  155  342:aload           10
	//  156  344:invokestatic    #225 <Method int oc.e(Paint, String)>
	//  157  347:i2f             
	//  158  348:fstore_2        
				float f2 = oc.b(4F) + ((lq) (obj)).v();
	//  159  349:ldc2            #311 <Float 4F>
	//  160  352:invokestatic    #71  <Method float oc.b(float)>
	//  161  355:aload           11
	//  162  357:invokevirtual   #312 <Method float lq.v()>
	//  163  360:fadd            
	//  164  361:fstore_3        
				float f3 = ((lq) (obj)).d() + f1 + ((lq) (obj)).y();
	//  165  362:aload           11
	//  166  364:invokevirtual   #279 <Method float lq.d()>
	//  167  367:fload_2         
	//  168  368:fadd            
	//  169  369:aload           11
	//  170  371:invokevirtual   #313 <Method float lq.y()>
	//  171  374:fadd            
	//  172  375:fstore          4
				obj = ((Object) (((lq) (obj)).k()));
	//  173  377:aload           11
	//  174  379:invokevirtual   #316 <Method lq$e lq.k()>
	//  175  382:astore          11
				if(obj == lq.e.b)
	//* 176  384:aload           11
	//* 177  386:getstatic       #321 <Field lq$e lq$e.b>
	//* 178  389:if_acmpne       433
				{
					h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  179  392:aload_0         
	//  180  393:getfield        #281 <Field Paint h>
	//  181  396:getstatic       #253 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  182  399:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, this.l.h() - f2, (af[1] - f3) + f1, h);
	//  183  402:aload_1         
	//  184  403:aload           10
	//  185  405:aload_0         
	//  186  406:getfield        #54  <Field oa l>
	//  187  409:invokevirtual   #154 <Method float oa.h()>
	//  188  412:fload_3         
	//  189  413:fsub            
	//  190  414:aload           8
	//  191  416:iconst_1        
	//  192  417:faload          
	//  193  418:fload           4
	//  194  420:fsub            
	//  195  421:fload_2         
	//  196  422:fadd            
	//  197  423:aload_0         
	//  198  424:getfield        #281 <Field Paint h>
	//  199  427:invokevirtual   #181 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 200  430:goto            565
				if(obj == lq.e.a)
	//* 201  433:aload           11
	//* 202  435:getstatic       #323 <Field lq$e lq$e.a>
	//* 203  438:if_acmpne       480
				{
					h.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  204  441:aload_0         
	//  205  442:getfield        #281 <Field Paint h>
	//  206  445:getstatic       #253 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  207  448:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, this.l.h() - f2, af[1] + f3, h);
	//  208  451:aload_1         
	//  209  452:aload           10
	//  210  454:aload_0         
	//  211  455:getfield        #54  <Field oa l>
	//  212  458:invokevirtual   #154 <Method float oa.h()>
	//  213  461:fload_3         
	//  214  462:fsub            
	//  215  463:aload           8
	//  216  465:iconst_1        
	//  217  466:faload          
	//  218  467:fload           4
	//  219  469:fadd            
	//  220  470:aload_0         
	//  221  471:getfield        #281 <Field Paint h>
	//  222  474:invokevirtual   #181 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 223  477:goto            565
				if(obj == lq.e.c)
	//* 224  480:aload           11
	//* 225  482:getstatic       #325 <Field lq$e lq$e.c>
	//* 226  485:if_acmpne       529
				{
					h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  227  488:aload_0         
	//  228  489:getfield        #281 <Field Paint h>
	//  229  492:getstatic       #260 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  230  495:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, this.l.f() + f2, (af[1] - f3) + f1, h);
	//  231  498:aload_1         
	//  232  499:aload           10
	//  233  501:aload_0         
	//  234  502:getfield        #54  <Field oa l>
	//  235  505:invokevirtual   #142 <Method float oa.f()>
	//  236  508:fload_3         
	//  237  509:fadd            
	//  238  510:aload           8
	//  239  512:iconst_1        
	//  240  513:faload          
	//  241  514:fload           4
	//  242  516:fsub            
	//  243  517:fload_2         
	//  244  518:fadd            
	//  245  519:aload_0         
	//  246  520:getfield        #281 <Field Paint h>
	//  247  523:invokevirtual   #181 <Method void Canvas.drawText(String, float, float, Paint)>
				} else
	//* 248  526:goto            565
				{
					h.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  249  529:aload_0         
	//  250  530:getfield        #281 <Field Paint h>
	//  251  533:getstatic       #260 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  252  536:invokevirtual   #257 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
					canvas.drawText(s, this.l.a() + f2, af[1] + f3, h);
	//  253  539:aload_1         
	//  254  540:aload           10
	//  255  542:aload_0         
	//  256  543:getfield        #54  <Field oa l>
	//  257  546:invokevirtual   #190 <Method float oa.a()>
	//  258  549:fload_3         
	//  259  550:fadd            
	//  260  551:aload           8
	//  261  553:iconst_1        
	//  262  554:faload          
	//  263  555:fload           4
	//  264  557:fadd            
	//  265  558:aload_0         
	//  266  559:getfield        #281 <Field Paint h>
	//  267  562:invokevirtual   #181 <Method void Canvas.drawText(String, float, float, Paint)>
				}
			}
			canvas.restoreToCount(l);
	//  268  565:aload_1         
	//  269  566:iload           6
	//  270  568:invokevirtual   #164 <Method void Canvas.restoreToCount(int)>
		}

	//  271  571:iload           5
	//  272  573:iconst_1        
	//  273  574:iadd            
	//  274  575:istore          5
	//* 275  577:goto            55
	//  276  580:return          
	}

	public void d(Canvas canvas)
	{
		if(!k.B() || !k.c())
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field lp k>
	//*   2    4:invokevirtual   #200 <Method boolean lp.B()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #50  <Field lp k>
	//*   6   14:invokevirtual   #327 <Method boolean lp.c()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		b.setColor(k.k());
	//    9   21:aload_0         
	//   10   22:getfield        #329 <Field Paint b>
	//   11   25:aload_0         
	//   12   26:getfield        #50  <Field lp k>
	//   13   29:invokevirtual   #331 <Method int lp.k()>
	//   14   32:invokevirtual   #64  <Method void Paint.setColor(int)>
		b.setStrokeWidth(k.d());
	//   15   35:aload_0         
	//   16   36:getfield        #329 <Field Paint b>
	//   17   39:aload_0         
	//   18   40:getfield        #50  <Field lp k>
	//   19   43:invokevirtual   #332 <Method float lp.d()>
	//   20   46:invokevirtual   #83  <Method void Paint.setStrokeWidth(float)>
		if(k.j() == lp.b.b)
	//*  21   49:aload_0         
	//*  22   50:getfield        #50  <Field lp k>
	//*  23   53:invokevirtual   #233 <Method lp$b lp.j()>
	//*  24   56:getstatic       #242 <Field lp$b lp$b.b>
	//*  25   59:if_acmpne       99
		{
			canvas.drawLine(l.f(), l.e(), l.f(), l.i(), b);
	//   26   62:aload_1         
	//   27   63:aload_0         
	//   28   64:getfield        #54  <Field oa l>
	//   29   67:invokevirtual   #142 <Method float oa.f()>
	//   30   70:aload_0         
	//   31   71:getfield        #54  <Field oa l>
	//   32   74:invokevirtual   #333 <Method float oa.e()>
	//   33   77:aload_0         
	//   34   78:getfield        #54  <Field oa l>
	//   35   81:invokevirtual   #142 <Method float oa.f()>
	//   36   84:aload_0         
	//   37   85:getfield        #54  <Field oa l>
	//   38   88:invokevirtual   #334 <Method float oa.i()>
	//   39   91:aload_0         
	//   40   92:getfield        #329 <Field Paint b>
	//   41   95:invokevirtual   #338 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   42   98:return          
		} else
		{
			canvas.drawLine(l.h(), l.e(), l.h(), l.i(), b);
	//   43   99:aload_1         
	//   44  100:aload_0         
	//   45  101:getfield        #54  <Field oa l>
	//   46  104:invokevirtual   #154 <Method float oa.h()>
	//   47  107:aload_0         
	//   48  108:getfield        #54  <Field oa l>
	//   49  111:invokevirtual   #333 <Method float oa.e()>
	//   50  114:aload_0         
	//   51  115:getfield        #54  <Field oa l>
	//   52  118:invokevirtual   #154 <Method float oa.h()>
	//   53  121:aload_0         
	//   54  122:getfield        #54  <Field oa l>
	//   55  125:invokevirtual   #334 <Method float oa.i()>
	//   56  128:aload_0         
	//   57  129:getfield        #329 <Field Paint b>
	//   58  132:invokevirtual   #338 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   59  135:return          
		}
	}

	public void e(Canvas canvas)
	{
		if(!k.B())
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field lp k>
	//*   2    4:invokevirtual   #200 <Method boolean lp.B()>
	//*   3    7:ifne            11
			return;
	//    4   10:return          
		if(k.e())
	//*   5   11:aload_0         
	//*   6   12:getfield        #50  <Field lp k>
	//*   7   15:invokevirtual   #340 <Method boolean lp.e()>
	//*   8   18:ifeq            138
		{
			int l = canvas.save();
	//    9   21:aload_1         
	//   10   22:invokevirtual   #101 <Method int Canvas.save()>
	//   11   25:istore_3        
			canvas.clipRect(b());
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:invokevirtual   #342 <Method RectF b()>
	//   15   31:invokevirtual   #124 <Method boolean Canvas.clipRect(RectF)>
	//   16   34:pop             
			float af[] = a();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #204 <Method float[] a()>
	//   19   39:astore          4
			d.setColor(k.a());
	//   20   41:aload_0         
	//   21   42:getfield        #344 <Field Paint d>
	//   22   45:aload_0         
	//   23   46:getfield        #50  <Field lp k>
	//   24   49:invokevirtual   #346 <Method int lp.a()>
	//   25   52:invokevirtual   #64  <Method void Paint.setColor(int)>
			d.setStrokeWidth(k.i());
	//   26   55:aload_0         
	//   27   56:getfield        #344 <Field Paint d>
	//   28   59:aload_0         
	//   29   60:getfield        #50  <Field lp k>
	//   30   63:invokevirtual   #347 <Method float lp.i()>
	//   31   66:invokevirtual   #83  <Method void Paint.setStrokeWidth(float)>
			d.setPathEffect(((android.graphics.PathEffect) (k.t())));
	//   32   69:aload_0         
	//   33   70:getfield        #344 <Field Paint d>
	//   34   73:aload_0         
	//   35   74:getfield        #50  <Field lp k>
	//   36   77:invokevirtual   #349 <Method android.graphics.DashPathEffect lp.t()>
	//   37   80:invokevirtual   #290 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   38   83:pop             
			Path path = i;
	//   39   84:aload_0         
	//   40   85:getfield        #31  <Field Path i>
	//   41   88:astore          5
			path.reset();
	//   42   90:aload           5
	//   43   92:invokevirtual   #140 <Method void Path.reset()>
			for(int j = 0; j < af.length; j += 2)
	//*  44   95:iconst_0        
	//*  45   96:istore_2        
	//*  46   97:iload_2         
	//*  47   98:aload           4
	//*  48  100:arraylength     
	//*  49  101:icmpge          133
			{
				canvas.drawPath(b(path, j, af), d);
	//   50  104:aload_1         
	//   51  105:aload_0         
	//   52  106:aload           5
	//   53  108:iload_2         
	//   54  109:aload           4
	//   55  111:invokevirtual   #351 <Method Path b(Path, int, float[])>
	//   56  114:aload_0         
	//   57  115:getfield        #344 <Field Paint d>
	//   58  118:invokevirtual   #161 <Method void Canvas.drawPath(Path, Paint)>
				path.reset();
	//   59  121:aload           5
	//   60  123:invokevirtual   #140 <Method void Path.reset()>
			}

	//   61  126:iload_2         
	//   62  127:iconst_2        
	//   63  128:iadd            
	//   64  129:istore_2        
	//*  65  130:goto            97
			canvas.restoreToCount(l);
	//   66  133:aload_1         
	//   67  134:iload_3         
	//   68  135:invokevirtual   #164 <Method void Canvas.restoreToCount(int)>
		}
		if(k.K())
	//*  69  138:aload_0         
	//*  70  139:getfield        #50  <Field lp k>
	//*  71  142:invokevirtual   #354 <Method boolean lp.K()>
	//*  72  145:ifeq            153
			a(canvas);
	//   73  148:aload_0         
	//   74  149:aload_1         
	//   75  150:invokevirtual   #356 <Method void a(Canvas)>
	//   76  153:return          
	}

	protected Paint f;
	protected RectF g;
	protected Path i;
	protected lp k;
	protected Path m;
	protected Path n;
	protected float o[];
	protected RectF p;
	protected float r[];
	protected RectF t;
}
