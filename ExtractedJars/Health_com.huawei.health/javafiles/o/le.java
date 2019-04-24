// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

// Referenced classes of package o:
//			ld, mn, nw, lp, 
//			nv, nt, nu, mi, 
//			nb, oa, oc, lt, 
//			mh, mv, ln, lm, 
//			nj, np, nd, nc

public abstract class le extends ld
	implements mn
{

	public le(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #66  <Method void ld(Context)>
		c = 100;
	//    3    5:aload_0         
	//    4    6:bipush          100
	//    5    8:putfield        #68  <Field int c>
		b = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #70  <Field boolean b>
		d = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #72  <Field boolean d>
		e = true;
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:putfield        #74  <Field boolean e>
		i = true;
	//   15   26:aload_0         
	//   16   27:iconst_1        
	//   17   28:putfield        #76  <Field boolean i>
		a = true;
	//   18   31:aload_0         
	//   19   32:iconst_1        
	//   20   33:putfield        #78  <Field boolean a>
		ab = true;
	//   21   36:aload_0         
	//   22   37:iconst_1        
	//   23   38:putfield        #80  <Field boolean ab>
		aa = true;
	//   24   41:aload_0         
	//   25   42:iconst_1        
	//   26   43:putfield        #82  <Field boolean aa>
		ac = true;
	//   27   46:aload_0         
	//   28   47:iconst_1        
	//   29   48:putfield        #84  <Field boolean ac>
		h = false;
	//   30   51:aload_0         
	//   31   52:iconst_0        
	//   32   53:putfield        #86  <Field boolean h>
		g = false;
	//   33   56:aload_0         
	//   34   57:iconst_0        
	//   35   58:putfield        #88  <Field boolean g>
		p = false;
	//   36   61:aload_0         
	//   37   62:iconst_0        
	//   38   63:putfield        #90  <Field boolean p>
		o = 15F;
	//   39   66:aload_0         
	//   40   67:ldc1            #91  <Float 15F>
	//   41   69:putfield        #93  <Field float o>
		m = false;
	//   42   72:aload_0         
	//   43   73:iconst_0        
	//   44   74:putfield        #95  <Field boolean m>
		af = 0L;
	//   45   77:aload_0         
	//   46   78:lconst_0        
	//   47   79:putfield        #97  <Field long af>
		ad = 0L;
	//   48   82:aload_0         
	//   49   83:lconst_0        
	//   50   84:putfield        #99  <Field long ad>
		ae = new RectF();
	//   51   87:aload_0         
	//   52   88:new             #101 <Class RectF>
	//   53   91:dup             
	//   54   92:invokespecial   #104 <Method void RectF()>
	//   55   95:putfield        #106 <Field RectF ae>
		w = new Matrix();
	//   56   98:aload_0         
	//   57   99:new             #108 <Class Matrix>
	//   58  102:dup             
	//   59  103:invokespecial   #109 <Method void Matrix()>
	//   60  106:putfield        #111 <Field Matrix w>
		y = new Matrix();
	//   61  109:aload_0         
	//   62  110:new             #108 <Class Matrix>
	//   63  113:dup             
	//   64  114:invokespecial   #109 <Method void Matrix()>
	//   65  117:putfield        #113 <Field Matrix y>
		ag = false;
	//   66  120:aload_0         
	//   67  121:iconst_0        
	//   68  122:putfield        #115 <Field boolean ag>
		z = new float[2];
	//   69  125:aload_0         
	//   70  126:iconst_2        
	//   71  127:newarray        float[]
	//   72  129:putfield        #117 <Field float[] z>
		v = nw.a(0.0D, 0.0D);
	//   73  132:aload_0         
	//   74  133:dconst_0        
	//   75  134:dconst_0        
	//   76  135:invokestatic    #122 <Method nw nw.a(double, double)>
	//   77  138:putfield        #124 <Field nw v>
		B = nw.a(0.0D, 0.0D);
	//   78  141:aload_0         
	//   79  142:dconst_0        
	//   80  143:dconst_0        
	//   81  144:invokestatic    #122 <Method nw nw.a(double, double)>
	//   82  147:putfield        #126 <Field nw B>
		C = new float[2];
	//   83  150:aload_0         
	//   84  151:iconst_2        
	//   85  152:newarray        float[]
	//   86  154:putfield        #128 <Field float[] C>
	//   87  157:return          
	}

	public le(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #132 <Method void ld(Context, AttributeSet)>
		c = 100;
	//    4    6:aload_0         
	//    5    7:bipush          100
	//    6    9:putfield        #68  <Field int c>
		b = false;
	//    7   12:aload_0         
	//    8   13:iconst_0        
	//    9   14:putfield        #70  <Field boolean b>
		d = false;
	//   10   17:aload_0         
	//   11   18:iconst_0        
	//   12   19:putfield        #72  <Field boolean d>
		e = true;
	//   13   22:aload_0         
	//   14   23:iconst_1        
	//   15   24:putfield        #74  <Field boolean e>
		i = true;
	//   16   27:aload_0         
	//   17   28:iconst_1        
	//   18   29:putfield        #76  <Field boolean i>
		a = true;
	//   19   32:aload_0         
	//   20   33:iconst_1        
	//   21   34:putfield        #78  <Field boolean a>
		ab = true;
	//   22   37:aload_0         
	//   23   38:iconst_1        
	//   24   39:putfield        #80  <Field boolean ab>
		aa = true;
	//   25   42:aload_0         
	//   26   43:iconst_1        
	//   27   44:putfield        #82  <Field boolean aa>
		ac = true;
	//   28   47:aload_0         
	//   29   48:iconst_1        
	//   30   49:putfield        #84  <Field boolean ac>
		h = false;
	//   31   52:aload_0         
	//   32   53:iconst_0        
	//   33   54:putfield        #86  <Field boolean h>
		g = false;
	//   34   57:aload_0         
	//   35   58:iconst_0        
	//   36   59:putfield        #88  <Field boolean g>
		p = false;
	//   37   62:aload_0         
	//   38   63:iconst_0        
	//   39   64:putfield        #90  <Field boolean p>
		o = 15F;
	//   40   67:aload_0         
	//   41   68:ldc1            #91  <Float 15F>
	//   42   70:putfield        #93  <Field float o>
		m = false;
	//   43   73:aload_0         
	//   44   74:iconst_0        
	//   45   75:putfield        #95  <Field boolean m>
		af = 0L;
	//   46   78:aload_0         
	//   47   79:lconst_0        
	//   48   80:putfield        #97  <Field long af>
		ad = 0L;
	//   49   83:aload_0         
	//   50   84:lconst_0        
	//   51   85:putfield        #99  <Field long ad>
		ae = new RectF();
	//   52   88:aload_0         
	//   53   89:new             #101 <Class RectF>
	//   54   92:dup             
	//   55   93:invokespecial   #104 <Method void RectF()>
	//   56   96:putfield        #106 <Field RectF ae>
		w = new Matrix();
	//   57   99:aload_0         
	//   58  100:new             #108 <Class Matrix>
	//   59  103:dup             
	//   60  104:invokespecial   #109 <Method void Matrix()>
	//   61  107:putfield        #111 <Field Matrix w>
		y = new Matrix();
	//   62  110:aload_0         
	//   63  111:new             #108 <Class Matrix>
	//   64  114:dup             
	//   65  115:invokespecial   #109 <Method void Matrix()>
	//   66  118:putfield        #113 <Field Matrix y>
		ag = false;
	//   67  121:aload_0         
	//   68  122:iconst_0        
	//   69  123:putfield        #115 <Field boolean ag>
		z = new float[2];
	//   70  126:aload_0         
	//   71  127:iconst_2        
	//   72  128:newarray        float[]
	//   73  130:putfield        #117 <Field float[] z>
		v = nw.a(0.0D, 0.0D);
	//   74  133:aload_0         
	//   75  134:dconst_0        
	//   76  135:dconst_0        
	//   77  136:invokestatic    #122 <Method nw nw.a(double, double)>
	//   78  139:putfield        #124 <Field nw v>
		B = nw.a(0.0D, 0.0D);
	//   79  142:aload_0         
	//   80  143:dconst_0        
	//   81  144:dconst_0        
	//   82  145:invokestatic    #122 <Method nw nw.a(double, double)>
	//   83  148:putfield        #126 <Field nw B>
		C = new float[2];
	//   84  151:aload_0         
	//   85  152:iconst_2        
	//   86  153:newarray        float[]
	//   87  155:putfield        #128 <Field float[] C>
	//   88  158:return          
	}

	public le(Context context, AttributeSet attributeset, int j)
	{
		super(context, attributeset, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #135 <Method void ld(Context, AttributeSet, int)>
		c = 100;
	//    5    7:aload_0         
	//    6    8:bipush          100
	//    7   10:putfield        #68  <Field int c>
		b = false;
	//    8   13:aload_0         
	//    9   14:iconst_0        
	//   10   15:putfield        #70  <Field boolean b>
		d = false;
	//   11   18:aload_0         
	//   12   19:iconst_0        
	//   13   20:putfield        #72  <Field boolean d>
		e = true;
	//   14   23:aload_0         
	//   15   24:iconst_1        
	//   16   25:putfield        #74  <Field boolean e>
		i = true;
	//   17   28:aload_0         
	//   18   29:iconst_1        
	//   19   30:putfield        #76  <Field boolean i>
		a = true;
	//   20   33:aload_0         
	//   21   34:iconst_1        
	//   22   35:putfield        #78  <Field boolean a>
		ab = true;
	//   23   38:aload_0         
	//   24   39:iconst_1        
	//   25   40:putfield        #80  <Field boolean ab>
		aa = true;
	//   26   43:aload_0         
	//   27   44:iconst_1        
	//   28   45:putfield        #82  <Field boolean aa>
		ac = true;
	//   29   48:aload_0         
	//   30   49:iconst_1        
	//   31   50:putfield        #84  <Field boolean ac>
		h = false;
	//   32   53:aload_0         
	//   33   54:iconst_0        
	//   34   55:putfield        #86  <Field boolean h>
		g = false;
	//   35   58:aload_0         
	//   36   59:iconst_0        
	//   37   60:putfield        #88  <Field boolean g>
		p = false;
	//   38   63:aload_0         
	//   39   64:iconst_0        
	//   40   65:putfield        #90  <Field boolean p>
		o = 15F;
	//   41   68:aload_0         
	//   42   69:ldc1            #91  <Float 15F>
	//   43   71:putfield        #93  <Field float o>
		m = false;
	//   44   74:aload_0         
	//   45   75:iconst_0        
	//   46   76:putfield        #95  <Field boolean m>
		af = 0L;
	//   47   79:aload_0         
	//   48   80:lconst_0        
	//   49   81:putfield        #97  <Field long af>
		ad = 0L;
	//   50   84:aload_0         
	//   51   85:lconst_0        
	//   52   86:putfield        #99  <Field long ad>
		ae = new RectF();
	//   53   89:aload_0         
	//   54   90:new             #101 <Class RectF>
	//   55   93:dup             
	//   56   94:invokespecial   #104 <Method void RectF()>
	//   57   97:putfield        #106 <Field RectF ae>
		w = new Matrix();
	//   58  100:aload_0         
	//   59  101:new             #108 <Class Matrix>
	//   60  104:dup             
	//   61  105:invokespecial   #109 <Method void Matrix()>
	//   62  108:putfield        #111 <Field Matrix w>
		y = new Matrix();
	//   63  111:aload_0         
	//   64  112:new             #108 <Class Matrix>
	//   65  115:dup             
	//   66  116:invokespecial   #109 <Method void Matrix()>
	//   67  119:putfield        #113 <Field Matrix y>
		ag = false;
	//   68  122:aload_0         
	//   69  123:iconst_0        
	//   70  124:putfield        #115 <Field boolean ag>
		z = new float[2];
	//   71  127:aload_0         
	//   72  128:iconst_2        
	//   73  129:newarray        float[]
	//   74  131:putfield        #117 <Field float[] z>
		v = nw.a(0.0D, 0.0D);
	//   75  134:aload_0         
	//   76  135:dconst_0        
	//   77  136:dconst_0        
	//   78  137:invokestatic    #122 <Method nw nw.a(double, double)>
	//   79  140:putfield        #124 <Field nw v>
		B = nw.a(0.0D, 0.0D);
	//   80  143:aload_0         
	//   81  144:dconst_0        
	//   82  145:dconst_0        
	//   83  146:invokestatic    #122 <Method nw nw.a(double, double)>
	//   84  149:putfield        #126 <Field nw B>
		C = new float[2];
	//   85  152:aload_0         
	//   86  153:iconst_2        
	//   87  154:newarray        float[]
	//   88  156:putfield        #128 <Field float[] C>
	//   89  159:return          
	}

	protected void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #137 <Method void ld.a()>
		l = new lp(lp.b.b);
	//    2    4:aload_0         
	//    3    5:new             #139 <Class lp>
	//    4    8:dup             
	//    5    9:getstatic       #144 <Field lp$b lp$b.b>
	//    6   12:invokespecial   #147 <Method void lp(lp$b)>
	//    7   15:putfield        #149 <Field lp l>
		r = new lp(lp.b.e);
	//    8   18:aload_0         
	//    9   19:new             #139 <Class lp>
	//   10   22:dup             
	//   11   23:getstatic       #151 <Field lp$b lp$b.e>
	//   12   26:invokespecial   #147 <Method void lp(lp$b)>
	//   13   29:putfield        #153 <Field lp r>
		q = new nv(O);
	//   14   32:aload_0         
	//   15   33:new             #155 <Class nv>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:getfield        #159 <Field oa O>
	//   19   41:invokespecial   #162 <Method void nv(oa)>
	//   20   44:putfield        #164 <Field nv q>
		u = new nv(O);
	//   21   47:aload_0         
	//   22   48:new             #155 <Class nv>
	//   23   51:dup             
	//   24   52:aload_0         
	//   25   53:getfield        #159 <Field oa O>
	//   26   56:invokespecial   #162 <Method void nv(oa)>
	//   27   59:putfield        #166 <Field nv u>
		s = new nt(O, l, q);
	//   28   62:aload_0         
	//   29   63:new             #168 <Class nt>
	//   30   66:dup             
	//   31   67:aload_0         
	//   32   68:getfield        #159 <Field oa O>
	//   33   71:aload_0         
	//   34   72:getfield        #149 <Field lp l>
	//   35   75:aload_0         
	//   36   76:getfield        #164 <Field nv q>
	//   37   79:invokespecial   #171 <Method void nt(oa, lp, nv)>
	//   38   82:putfield        #173 <Field nt s>
		t = new nt(O, r, u);
	//   39   85:aload_0         
	//   40   86:new             #168 <Class nt>
	//   41   89:dup             
	//   42   90:aload_0         
	//   43   91:getfield        #159 <Field oa O>
	//   44   94:aload_0         
	//   45   95:getfield        #153 <Field lp r>
	//   46   98:aload_0         
	//   47   99:getfield        #166 <Field nv u>
	//   48  102:invokespecial   #171 <Method void nt(oa, lp, nv)>
	//   49  105:putfield        #175 <Field nt t>
		x = new nu(O, H, q);
	//   50  108:aload_0         
	//   51  109:new             #177 <Class nu>
	//   52  112:dup             
	//   53  113:aload_0         
	//   54  114:getfield        #159 <Field oa O>
	//   55  117:aload_0         
	//   56  118:getfield        #181 <Field ln H>
	//   57  121:aload_0         
	//   58  122:getfield        #164 <Field nv q>
	//   59  125:invokespecial   #184 <Method void nu(oa, ln, nv)>
	//   60  128:putfield        #186 <Field nu x>
		setHighlighter(new mi(((mn) (this))));
	//   61  131:aload_0         
	//   62  132:new             #188 <Class mi>
	//   63  135:dup             
	//   64  136:aload_0         
	//   65  137:invokespecial   #191 <Method void mi(mn)>
	//   66  140:invokevirtual   #195 <Method void setHighlighter(mi)>
		K = ((nd) (new nb(this, O.p(), 3F)));
	//   67  143:aload_0         
	//   68  144:new             #197 <Class nb>
	//   69  147:dup             
	//   70  148:aload_0         
	//   71  149:aload_0         
	//   72  150:getfield        #159 <Field oa O>
	//   73  153:invokevirtual   #202 <Method Matrix oa.p()>
	//   74  156:ldc1            #203 <Float 3F>
	//   75  158:invokespecial   #206 <Method void nb(le, Matrix, float)>
	//   76  161:putfield        #210 <Field nd K>
		f = new Paint();
	//   77  164:aload_0         
	//   78  165:new             #212 <Class Paint>
	//   79  168:dup             
	//   80  169:invokespecial   #213 <Method void Paint()>
	//   81  172:putfield        #215 <Field Paint f>
		f.setStyle(android.graphics.Paint.Style.FILL);
	//   82  175:aload_0         
	//   83  176:getfield        #215 <Field Paint f>
	//   84  179:getstatic       #221 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   85  182:invokevirtual   #225 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		f.setColor(Color.rgb(240, 240, 240));
	//   86  185:aload_0         
	//   87  186:getfield        #215 <Field Paint f>
	//   88  189:sipush          240
	//   89  192:sipush          240
	//   90  195:sipush          240
	//   91  198:invokestatic    #231 <Method int Color.rgb(int, int, int)>
	//   92  201:invokevirtual   #235 <Method void Paint.setColor(int)>
		k = new Paint();
	//   93  204:aload_0         
	//   94  205:new             #212 <Class Paint>
	//   95  208:dup             
	//   96  209:invokespecial   #213 <Method void Paint()>
	//   97  212:putfield        #237 <Field Paint k>
		k.setStyle(android.graphics.Paint.Style.STROKE);
	//   98  215:aload_0         
	//   99  216:getfield        #237 <Field Paint k>
	//  100  219:getstatic       #240 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  101  222:invokevirtual   #225 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		k.setColor(0xff000000);
	//  102  225:aload_0         
	//  103  226:getfield        #237 <Field Paint k>
	//  104  229:ldc1            #241 <Int 0xff000000>
	//  105  231:invokevirtual   #235 <Method void Paint.setColor(int)>
		k.setStrokeWidth(oc.b(1.0F));
	//  106  234:aload_0         
	//  107  235:getfield        #237 <Field Paint k>
	//  108  238:fconst_1        
	//  109  239:invokestatic    #246 <Method float oc.b(float)>
	//  110  242:invokevirtual   #250 <Method void Paint.setStrokeWidth(float)>
	//  111  245:return          
	}

	protected void a(Canvas canvas)
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #86  <Field boolean h>
	//*   2    4:ifeq            22
			canvas.drawRect(O.m(), f);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #159 <Field oa O>
	//    6   12:invokevirtual   #254 <Method RectF oa.m()>
	//    7   15:aload_0         
	//    8   16:getfield        #215 <Field Paint f>
	//    9   19:invokevirtual   #260 <Method void Canvas.drawRect(RectF, Paint)>
		if(g)
	//*  10   22:aload_0         
	//*  11   23:getfield        #88  <Field boolean g>
	//*  12   26:ifeq            44
			canvas.drawRect(O.m(), k);
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #159 <Field oa O>
	//   16   34:invokevirtual   #254 <Method RectF oa.m()>
	//   17   37:aload_0         
	//   18   38:getfield        #237 <Field Paint k>
	//   19   41:invokevirtual   #260 <Method void Canvas.drawRect(RectF, Paint)>
	//   20   44:return          
	}

	public nv b(lp.b b1)
	{
		if(b1 == lp.b.b)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #144 <Field lp$b lp$b.b>
	//*   2    4:if_acmpne       12
			return q;
	//    3    7:aload_0         
	//    4    8:getfield        #164 <Field nv q>
	//    5   11:areturn         
		else
			return u;
	//    6   12:aload_0         
	//    7   13:getfield        #166 <Field nv u>
	//    8   16:areturn         
	}

	public void b(float f1, float f2, float f3, float f4)
	{
		O.a(f1, f2, f3, -f4, w);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field oa O>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:fload_3         
	//    5    7:fload           4
	//    6    9:fneg            
	//    7   10:aload_0         
	//    8   11:getfield        #111 <Field Matrix w>
	//    9   14:invokevirtual   #265 <Method void oa.a(float, float, float, float, Matrix)>
		O.d(w, ((android.view.View) (this)), false);
	//   10   17:aload_0         
	//   11   18:getfield        #159 <Field oa O>
	//   12   21:aload_0         
	//   13   22:getfield        #111 <Field Matrix w>
	//   14   25:aload_0         
	//   15   26:iconst_0        
	//   16   27:invokevirtual   #268 <Method Matrix oa.d(Matrix, android.view.View, boolean)>
	//   17   30:pop             
		f();
	//   18   31:aload_0         
	//   19   32:invokevirtual   #270 <Method void f()>
		postInvalidate();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #273 <Method void postInvalidate()>
	//   22   39:return          
	}

	public boolean c(lp.b b1)
	{
		return e(b1).E();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #277 <Method lp e(lp$b)>
	//    3    5:invokevirtual   #281 <Method boolean lp.E()>
	//    4    8:ireturn         
	}

	public void computeScroll()
	{
		if(K instanceof nb)
	//*   0    0:aload_0         
	//*   1    1:getfield        #210 <Field nd K>
	//*   2    4:instanceof      #197 <Class nb>
	//*   3    7:ifeq            20
			((nb)K).b();
	//    4   10:aload_0         
	//    5   11:getfield        #210 <Field nd K>
	//    6   14:checkcast       #197 <Class nb>
	//    7   17:invokevirtual   #284 <Method void nb.b()>
	//    8   20:return          
	}

	protected float d(lp.b b1)
	{
		if(b1 == lp.b.b)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #144 <Field lp$b lp$b.b>
	//*   2    4:if_acmpne       15
			return l.w;
	//    3    7:aload_0         
	//    4    8:getfield        #149 <Field lp l>
	//    5   11:getfield        #287 <Field float lp.w>
	//    6   14:freturn         
		else
			return r.w;
	//    7   15:aload_0         
	//    8   16:getfield        #153 <Field lp r>
	//    9   19:getfield        #287 <Field float lp.w>
	//   10   22:freturn         
	}

	public mv d(float f1, float f2)
	{
		mh mh1 = a(f1, f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #291 <Method mh a(float, float)>
	//    4    6:astore_3        
		if(mh1 != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          29
			return (mv)((lt)A).a(mh1.g());
	//    7   11:aload_0         
	//    8   12:getfield        #295 <Field ma A>
	//    9   15:checkcast       #297 <Class lt>
	//   10   18:aload_3         
	//   11   19:invokevirtual   #302 <Method int mh.g()>
	//   12   22:invokevirtual   #305 <Method mz lt.a(int)>
	//   13   25:checkcast       #307 <Class mv>
	//   14   28:areturn         
		else
			return null;
	//   15   29:aconst_null     
	//   16   30:areturn         
	}

	protected void d()
	{
		H.d(((lt)A).i(), ((lt)A).f());
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ln H>
	//    2    4:aload_0         
	//    3    5:getfield        #295 <Field ma A>
	//    4    8:checkcast       #297 <Class lt>
	//    5   11:invokevirtual   #310 <Method float lt.i()>
	//    6   14:aload_0         
	//    7   15:getfield        #295 <Field ma A>
	//    8   18:checkcast       #297 <Class lt>
	//    9   21:invokevirtual   #312 <Method float lt.f()>
	//   10   24:invokevirtual   #317 <Method void ln.d(float, float)>
		l.d(((lt)A).a(lp.b.b), ((lt)A).d(lp.b.b));
	//   11   27:aload_0         
	//   12   28:getfield        #149 <Field lp l>
	//   13   31:aload_0         
	//   14   32:getfield        #295 <Field ma A>
	//   15   35:checkcast       #297 <Class lt>
	//   16   38:getstatic       #144 <Field lp$b lp$b.b>
	//   17   41:invokevirtual   #319 <Method float lt.a(lp$b)>
	//   18   44:aload_0         
	//   19   45:getfield        #295 <Field ma A>
	//   20   48:checkcast       #297 <Class lt>
	//   21   51:getstatic       #144 <Field lp$b lp$b.b>
	//   22   54:invokevirtual   #321 <Method float lt.d(lp$b)>
	//   23   57:invokevirtual   #322 <Method void lp.d(float, float)>
		r.d(((lt)A).a(lp.b.e), ((lt)A).d(lp.b.e));
	//   24   60:aload_0         
	//   25   61:getfield        #153 <Field lp r>
	//   26   64:aload_0         
	//   27   65:getfield        #295 <Field ma A>
	//   28   68:checkcast       #297 <Class lt>
	//   29   71:getstatic       #151 <Field lp$b lp$b.e>
	//   30   74:invokevirtual   #319 <Method float lt.a(lp$b)>
	//   31   77:aload_0         
	//   32   78:getfield        #295 <Field ma A>
	//   33   81:checkcast       #297 <Class lt>
	//   34   84:getstatic       #151 <Field lp$b lp$b.e>
	//   35   87:invokevirtual   #321 <Method float lt.d(lp$b)>
	//   36   90:invokevirtual   #322 <Method void lp.d(float, float)>
	//   37   93:return          
	}

	public lp e(lp.b b1)
	{
		if(b1 == lp.b.b)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #144 <Field lp$b lp$b.b>
	//*   2    4:if_acmpne       12
			return l;
	//    3    7:aload_0         
	//    4    8:getfield        #149 <Field lp l>
	//    5   11:areturn         
		else
			return r;
	//    6   12:aload_0         
	//    7   13:getfield        #153 <Field lp r>
	//    8   16:areturn         
	}

	protected void e(RectF rectf)
	{
		rectf.left = 0.0F;
	//    0    0:aload_1         
	//    1    1:fconst_0        
	//    2    2:putfield        #326 <Field float RectF.left>
		rectf.right = 0.0F;
	//    3    5:aload_1         
	//    4    6:fconst_0        
	//    5    7:putfield        #329 <Field float RectF.right>
		rectf.top = 0.0F;
	//    6   10:aload_1         
	//    7   11:fconst_0        
	//    8   12:putfield        #332 <Field float RectF.top>
		rectf.bottom = 0.0F;
	//    9   15:aload_1         
	//   10   16:fconst_0        
	//   11   17:putfield        #335 <Field float RectF.bottom>
		static class _cls2
		{

			static final int a[];
			static final int c[];
			static final int e[];

			static 
			{
				e = new int[lm.d.values().length];
			//    0    0:invokestatic    #20  <Method lm$d[] lm$d.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #22  <Field int[] e>
				try
				{
					e[lm.d.b.ordinal()] = 1;
			//    4    9:getstatic       #22  <Field int[] e>
			//    5   12:getstatic       #26  <Field lm$d lm$d.b>
			//    6   15:invokevirtual   #30  <Method int lm$d.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					e[lm.d.c.ordinal()] = 2;
			//   11   24:getstatic       #22  <Field int[] e>
			//   12   27:getstatic       #32  <Field lm$d lm$d.c>
			//   13   30:invokevirtual   #30  <Method int lm$d.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				c = new int[lm.a.values().length];
			//   18   39:invokestatic    #37  <Method lm$a[] lm$a.values()>
			//   19   42:arraylength     
			//   20   43:newarray        int[]
			//   21   45:putstatic       #39  <Field int[] c>
				try
				{
					c[lm.a.d.ordinal()] = 1;
			//   22   48:getstatic       #39  <Field int[] c>
			//   23   51:getstatic       #43  <Field lm$a lm$a.d>
			//   24   54:invokevirtual   #44  <Method int lm$a.ordinal()>
			//   25   57:iconst_1        
			//   26   58:iastore         
				}
			//*  27   59:goto            63
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   28   62:astore_0        
				try
				{
					c[lm.a.a.ordinal()] = 2;
			//   29   63:getstatic       #39  <Field int[] c>
			//   30   66:getstatic       #46  <Field lm$a lm$a.a>
			//   31   69:invokevirtual   #44  <Method int lm$a.ordinal()>
			//   32   72:iconst_2        
			//   33   73:iastore         
				}
			//*  34   74:goto            78
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   35   77:astore_0        
				try
				{
					c[lm.a.c.ordinal()] = 3;
			//   36   78:getstatic       #39  <Field int[] c>
			//   37   81:getstatic       #48  <Field lm$a lm$a.c>
			//   38   84:invokevirtual   #44  <Method int lm$a.ordinal()>
			//   39   87:iconst_3        
			//   40   88:iastore         
				}
			//*  41   89:goto            93
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   42   92:astore_0        
				a = new int[lm.k.values().length];
			//   43   93:invokestatic    #53  <Method lm$k[] lm$k.values()>
			//   44   96:arraylength     
			//   45   97:newarray        int[]
			//   46   99:putstatic       #55  <Field int[] a>
				try
				{
					a[lm.k.c.ordinal()] = 1;
			//   47  102:getstatic       #55  <Field int[] a>
			//   48  105:getstatic       #58  <Field lm$k lm$k.c>
			//   49  108:invokevirtual   #59  <Method int lm$k.ordinal()>
			//   50  111:iconst_1        
			//   51  112:iastore         
				}
			//*  52  113:goto            117
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   53  116:astore_0        
				try
				{
					a[lm.k.d.ordinal()] = 2;
			//   54  117:getstatic       #55  <Field int[] a>
			//   55  120:getstatic       #61  <Field lm$k lm$k.d>
			//   56  123:invokevirtual   #59  <Method int lm$k.ordinal()>
			//   57  126:iconst_2        
			//   58  127:iastore         
			//   59  128:return          
				}
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   60  129:astore_0        
			//*  61  130:return          
			}
		}

		if(N != null && N.B() && !N.h())
	//*  12   20:aload_0         
	//*  13   21:getfield        #339 <Field lm N>
	//*  14   24:ifnull          552
	//*  15   27:aload_0         
	//*  16   28:getfield        #339 <Field lm N>
	//*  17   31:invokevirtual   #343 <Method boolean lm.B()>
	//*  18   34:ifeq            552
	//*  19   37:aload_0         
	//*  20   38:getfield        #339 <Field lm N>
	//*  21   41:invokevirtual   #345 <Method boolean lm.h()>
	//*  22   44:ifne            552
			switch(_cls2.e[N.i().ordinal()])
	//*  23   47:getstatic       #348 <Field int[] le$2.e>
	//*  24   50:aload_0         
	//*  25   51:getfield        #339 <Field lm N>
	//*  26   54:invokevirtual   #351 <Method lm$d lm.i()>
	//*  27   57:invokevirtual   #356 <Method int lm$d.ordinal()>
	//*  28   60:iaload          
			{
	//*  29   61:lookupswitch    2: default 88
	//	               1: 89
	//	               2: 351
			default:
				return;
	//   30   88:return          

			case 1: // '\001'
				switch(_cls2.c[N.a().ordinal()])
	//*  31   89:getstatic       #358 <Field int[] le$2.c>
	//*  32   92:aload_0         
	//*  33   93:getfield        #339 <Field lm N>
	//*  34   96:invokevirtual   #361 <Method lm$a lm.a()>
	//*  35   99:invokevirtual   #364 <Method int lm$a.ordinal()>
	//*  36  102:iaload          
				{
				default:
					break;

	//*  37  103:tableswitch     1 3: default 128
	//	               1 131
	//	               2 176
	//	               3 221
	//*  38  128:goto            350
				case 1: // '\001'
					rectf.left = rectf.left + (Math.min(N.c, O.o() * N.u()) + N.v());
	//   39  131:aload_1         
	//   40  132:aload_1         
	//   41  133:getfield        #326 <Field float RectF.left>
	//   42  136:aload_0         
	//   43  137:getfield        #339 <Field lm N>
	//   44  140:getfield        #366 <Field float lm.c>
	//   45  143:aload_0         
	//   46  144:getfield        #159 <Field oa O>
	//   47  147:invokevirtual   #368 <Method float oa.o()>
	//   48  150:aload_0         
	//   49  151:getfield        #339 <Field lm N>
	//   50  154:invokevirtual   #370 <Method float lm.u()>
	//   51  157:fmul            
	//   52  158:invokestatic    #376 <Method float Math.min(float, float)>
	//   53  161:aload_0         
	//   54  162:getfield        #339 <Field lm N>
	//   55  165:invokevirtual   #378 <Method float lm.v()>
	//   56  168:fadd            
	//   57  169:fadd            
	//   58  170:putfield        #326 <Field float RectF.left>
					break;
	//   59  173:goto            350

				case 2: // '\002'
					rectf.right = rectf.right + (Math.min(N.c, O.o() * N.u()) + N.v());
	//   60  176:aload_1         
	//   61  177:aload_1         
	//   62  178:getfield        #329 <Field float RectF.right>
	//   63  181:aload_0         
	//   64  182:getfield        #339 <Field lm N>
	//   65  185:getfield        #366 <Field float lm.c>
	//   66  188:aload_0         
	//   67  189:getfield        #159 <Field oa O>
	//   68  192:invokevirtual   #368 <Method float oa.o()>
	//   69  195:aload_0         
	//   70  196:getfield        #339 <Field lm N>
	//   71  199:invokevirtual   #370 <Method float lm.u()>
	//   72  202:fmul            
	//   73  203:invokestatic    #376 <Method float Math.min(float, float)>
	//   74  206:aload_0         
	//   75  207:getfield        #339 <Field lm N>
	//   76  210:invokevirtual   #378 <Method float lm.v()>
	//   77  213:fadd            
	//   78  214:fadd            
	//   79  215:putfield        #329 <Field float RectF.right>
					break;
	//   80  218:goto            350

				case 3: // '\003'
					switch(_cls2.a[N.e().ordinal()])
	//*  81  221:getstatic       #380 <Field int[] le$2.a>
	//*  82  224:aload_0         
	//*  83  225:getfield        #339 <Field lm N>
	//*  84  228:invokevirtual   #383 <Method lm$k lm.e()>
	//*  85  231:invokevirtual   #386 <Method int lm$k.ordinal()>
	//*  86  234:iaload          
					{
	//*  87  235:lookupswitch    2: default 260
	//	               1: 263
	//	               2: 308
	//*  88  260:goto            350
					case 1: // '\001'
						rectf.top = rectf.top + (Math.min(N.d, O.n() * N.u()) + N.y());
	//   89  263:aload_1         
	//   90  264:aload_1         
	//   91  265:getfield        #332 <Field float RectF.top>
	//   92  268:aload_0         
	//   93  269:getfield        #339 <Field lm N>
	//   94  272:getfield        #388 <Field float lm.d>
	//   95  275:aload_0         
	//   96  276:getfield        #159 <Field oa O>
	//   97  279:invokevirtual   #390 <Method float oa.n()>
	//   98  282:aload_0         
	//   99  283:getfield        #339 <Field lm N>
	//  100  286:invokevirtual   #370 <Method float lm.u()>
	//  101  289:fmul            
	//  102  290:invokestatic    #376 <Method float Math.min(float, float)>
	//  103  293:aload_0         
	//  104  294:getfield        #339 <Field lm N>
	//  105  297:invokevirtual   #392 <Method float lm.y()>
	//  106  300:fadd            
	//  107  301:fadd            
	//  108  302:putfield        #332 <Field float RectF.top>
						break;

	//* 109  305:goto            350
					case 2: // '\002'
						rectf.bottom = rectf.bottom + (Math.min(N.d, O.n() * N.u()) + N.y());
	//  110  308:aload_1         
	//  111  309:aload_1         
	//  112  310:getfield        #335 <Field float RectF.bottom>
	//  113  313:aload_0         
	//  114  314:getfield        #339 <Field lm N>
	//  115  317:getfield        #388 <Field float lm.d>
	//  116  320:aload_0         
	//  117  321:getfield        #159 <Field oa O>
	//  118  324:invokevirtual   #390 <Method float oa.n()>
	//  119  327:aload_0         
	//  120  328:getfield        #339 <Field lm N>
	//  121  331:invokevirtual   #370 <Method float lm.u()>
	//  122  334:fmul            
	//  123  335:invokestatic    #376 <Method float Math.min(float, float)>
	//  124  338:aload_0         
	//  125  339:getfield        #339 <Field lm N>
	//  126  342:invokevirtual   #392 <Method float lm.y()>
	//  127  345:fadd            
	//  128  346:fadd            
	//  129  347:putfield        #335 <Field float RectF.bottom>
						break;
					}
					break;
				}
				return;
	//  130  350:return          

			case 2: // '\002'
				switch(_cls2.a[N.e().ordinal()])
	//* 131  351:getstatic       #380 <Field int[] le$2.a>
	//* 132  354:aload_0         
	//* 133  355:getfield        #339 <Field lm N>
	//* 134  358:invokevirtual   #383 <Method lm$k lm.e()>
	//* 135  361:invokevirtual   #386 <Method int lm$k.ordinal()>
	//* 136  364:iaload          
				{
	//* 137  365:lookupswitch    2: default 392
	//	               1: 393
	//	               2: 473
				default:
					return;
	//  138  392:return          

				case 1: // '\001'
					rectf.top = rectf.top + (Math.min(N.d, O.n() * N.u()) + N.y());
	//  139  393:aload_1         
	//  140  394:aload_1         
	//  141  395:getfield        #332 <Field float RectF.top>
	//  142  398:aload_0         
	//  143  399:getfield        #339 <Field lm N>
	//  144  402:getfield        #388 <Field float lm.d>
	//  145  405:aload_0         
	//  146  406:getfield        #159 <Field oa O>
	//  147  409:invokevirtual   #390 <Method float oa.n()>
	//  148  412:aload_0         
	//  149  413:getfield        #339 <Field lm N>
	//  150  416:invokevirtual   #370 <Method float lm.u()>
	//  151  419:fmul            
	//  152  420:invokestatic    #376 <Method float Math.min(float, float)>
	//  153  423:aload_0         
	//  154  424:getfield        #339 <Field lm N>
	//  155  427:invokevirtual   #392 <Method float lm.y()>
	//  156  430:fadd            
	//  157  431:fadd            
	//  158  432:putfield        #332 <Field float RectF.top>
					if(getXAxis().B() && getXAxis().g())
	//* 159  435:aload_0         
	//* 160  436:invokevirtual   #396 <Method ln getXAxis()>
	//* 161  439:invokevirtual   #397 <Method boolean ln.B()>
	//* 162  442:ifeq            552
	//* 163  445:aload_0         
	//* 164  446:invokevirtual   #396 <Method ln getXAxis()>
	//* 165  449:invokevirtual   #399 <Method boolean ln.g()>
	//* 166  452:ifeq            552
					{
						rectf.top = rectf.top + (float)getXAxis().I;
	//  167  455:aload_1         
	//  168  456:aload_1         
	//  169  457:getfield        #332 <Field float RectF.top>
	//  170  460:aload_0         
	//  171  461:invokevirtual   #396 <Method ln getXAxis()>
	//  172  464:getfield        #401 <Field int ln.I>
	//  173  467:i2f             
	//  174  468:fadd            
	//  175  469:putfield        #332 <Field float RectF.top>
						return;
	//  176  472:return          
					}
					break;

				case 2: // '\002'
					rectf.bottom = rectf.bottom + (Math.min(N.d, O.n() * N.u()) + N.y());
	//  177  473:aload_1         
	//  178  474:aload_1         
	//  179  475:getfield        #335 <Field float RectF.bottom>
	//  180  478:aload_0         
	//  181  479:getfield        #339 <Field lm N>
	//  182  482:getfield        #388 <Field float lm.d>
	//  183  485:aload_0         
	//  184  486:getfield        #159 <Field oa O>
	//  185  489:invokevirtual   #390 <Method float oa.n()>
	//  186  492:aload_0         
	//  187  493:getfield        #339 <Field lm N>
	//  188  496:invokevirtual   #370 <Method float lm.u()>
	//  189  499:fmul            
	//  190  500:invokestatic    #376 <Method float Math.min(float, float)>
	//  191  503:aload_0         
	//  192  504:getfield        #339 <Field lm N>
	//  193  507:invokevirtual   #392 <Method float lm.y()>
	//  194  510:fadd            
	//  195  511:fadd            
	//  196  512:putfield        #335 <Field float RectF.bottom>
					if(getXAxis().B() && getXAxis().g())
	//* 197  515:aload_0         
	//* 198  516:invokevirtual   #396 <Method ln getXAxis()>
	//* 199  519:invokevirtual   #397 <Method boolean ln.B()>
	//* 200  522:ifeq            552
	//* 201  525:aload_0         
	//* 202  526:invokevirtual   #396 <Method ln getXAxis()>
	//* 203  529:invokevirtual   #399 <Method boolean ln.g()>
	//* 204  532:ifeq            552
						rectf.bottom = rectf.bottom + (float)getXAxis().I;
	//  205  535:aload_1         
	//  206  536:aload_1         
	//  207  537:getfield        #335 <Field float RectF.bottom>
	//  208  540:aload_0         
	//  209  541:invokevirtual   #396 <Method ln getXAxis()>
	//  210  544:getfield        #401 <Field int ln.I>
	//  211  547:i2f             
	//  212  548:fadd            
	//  213  549:putfield        #335 <Field float RectF.bottom>
					break;
				}
				break;
			}
	//  214  552:return          
	}

	public void f()
	{
		if(!ag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field boolean ag>
	//*   2    4:ifne            420
		{
			e(ae);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #106 <Field RectF ae>
	//    6   12:invokevirtual   #403 <Method void e(RectF)>
			float f2 = 0.0F + ae.left;
	//    7   15:fconst_0        
	//    8   16:aload_0         
	//    9   17:getfield        #106 <Field RectF ae>
	//   10   20:getfield        #326 <Field float RectF.left>
	//   11   23:fadd            
	//   12   24:fstore_2        
			float f5 = 0.0F + ae.top;
	//   13   25:fconst_0        
	//   14   26:aload_0         
	//   15   27:getfield        #106 <Field RectF ae>
	//   16   30:getfield        #332 <Field float RectF.top>
	//   17   33:fadd            
	//   18   34:fstore          5
			float f1 = 0.0F + ae.right;
	//   19   36:fconst_0        
	//   20   37:aload_0         
	//   21   38:getfield        #106 <Field RectF ae>
	//   22   41:getfield        #329 <Field float RectF.right>
	//   23   44:fadd            
	//   24   45:fstore_1        
			float f6 = 0.0F + ae.bottom;
	//   25   46:fconst_0        
	//   26   47:aload_0         
	//   27   48:getfield        #106 <Field RectF ae>
	//   28   51:getfield        #335 <Field float RectF.bottom>
	//   29   54:fadd            
	//   30   55:fstore          6
			float f3 = f2;
	//   31   57:fload_2         
	//   32   58:fstore_3        
			if(l.L())
	//*  33   59:aload_0         
	//*  34   60:getfield        #149 <Field lp l>
	//*  35   63:invokevirtual   #406 <Method boolean lp.L()>
	//*  36   66:ifeq            86
				f3 = f2 + l.d(s.e());
	//   37   69:fload_2         
	//   38   70:aload_0         
	//   39   71:getfield        #149 <Field lp l>
	//   40   74:aload_0         
	//   41   75:getfield        #173 <Field nt s>
	//   42   78:invokevirtual   #409 <Method Paint nt.e()>
	//   43   81:invokevirtual   #412 <Method float lp.d(Paint)>
	//   44   84:fadd            
	//   45   85:fstore_3        
			float f4 = f1;
	//   46   86:fload_1         
	//   47   87:fstore          4
			if(r.L())
	//*  48   89:aload_0         
	//*  49   90:getfield        #153 <Field lp r>
	//*  50   93:invokevirtual   #406 <Method boolean lp.L()>
	//*  51   96:ifeq            117
				f4 = f1 + r.d(t.e());
	//   52   99:fload_1         
	//   53  100:aload_0         
	//   54  101:getfield        #153 <Field lp r>
	//   55  104:aload_0         
	//   56  105:getfield        #175 <Field nt t>
	//   57  108:invokevirtual   #409 <Method Paint nt.e()>
	//   58  111:invokevirtual   #412 <Method float lp.d(Paint)>
	//   59  114:fadd            
	//   60  115:fstore          4
			f2 = f5;
	//   61  117:fload           5
	//   62  119:fstore_2        
			f1 = f6;
	//   63  120:fload           6
	//   64  122:fstore_1        
			if(H.B())
	//*  65  123:aload_0         
	//*  66  124:getfield        #181 <Field ln H>
	//*  67  127:invokevirtual   #397 <Method boolean ln.B()>
	//*  68  130:ifeq            248
			{
				f2 = f5;
	//   69  133:fload           5
	//   70  135:fstore_2        
				f1 = f6;
	//   71  136:fload           6
	//   72  138:fstore_1        
				if(H.g())
	//*  73  139:aload_0         
	//*  74  140:getfield        #181 <Field ln H>
	//*  75  143:invokevirtual   #399 <Method boolean ln.g()>
	//*  76  146:ifeq            248
				{
					float f7 = (float)H.I + H.y();
	//   77  149:aload_0         
	//   78  150:getfield        #181 <Field ln H>
	//   79  153:getfield        #401 <Field int ln.I>
	//   80  156:i2f             
	//   81  157:aload_0         
	//   82  158:getfield        #181 <Field ln H>
	//   83  161:invokevirtual   #413 <Method float ln.y()>
	//   84  164:fadd            
	//   85  165:fstore          7
					if(H.j() == ln.e.e)
	//*  86  167:aload_0         
	//*  87  168:getfield        #181 <Field ln H>
	//*  88  171:invokevirtual   #417 <Method ln$e ln.j()>
	//*  89  174:getstatic       #422 <Field ln$e ln$e.e>
	//*  90  177:if_acmpne       192
					{
						f1 = f6 + f7;
	//   91  180:fload           6
	//   92  182:fload           7
	//   93  184:fadd            
	//   94  185:fstore_1        
						f2 = f5;
	//   95  186:fload           5
	//   96  188:fstore_2        
					} else
	//*  97  189:goto            248
					if(H.j() == ln.e.d)
	//*  98  192:aload_0         
	//*  99  193:getfield        #181 <Field ln H>
	//* 100  196:invokevirtual   #417 <Method ln$e ln.j()>
	//* 101  199:getstatic       #424 <Field ln$e ln$e.d>
	//* 102  202:if_acmpne       217
					{
						f2 = f5 + f7;
	//  103  205:fload           5
	//  104  207:fload           7
	//  105  209:fadd            
	//  106  210:fstore_2        
						f1 = f6;
	//  107  211:fload           6
	//  108  213:fstore_1        
					} else
	//* 109  214:goto            248
					{
						f2 = f5;
	//  110  217:fload           5
	//  111  219:fstore_2        
						f1 = f6;
	//  112  220:fload           6
	//  113  222:fstore_1        
						if(H.j() == ln.e.a)
	//* 114  223:aload_0         
	//* 115  224:getfield        #181 <Field ln H>
	//* 116  227:invokevirtual   #417 <Method ln$e ln.j()>
	//* 117  230:getstatic       #426 <Field ln$e ln$e.a>
	//* 118  233:if_acmpne       248
						{
							f1 = f6 + f7;
	//  119  236:fload           6
	//  120  238:fload           7
	//  121  240:fadd            
	//  122  241:fstore_1        
							f2 = f5 + f7;
	//  123  242:fload           5
	//  124  244:fload           7
	//  125  246:fadd            
	//  126  247:fstore_2        
						}
					}
				}
			}
			f2 += getExtraTopOffset();
	//  127  248:fload_2         
	//  128  249:aload_0         
	//  129  250:invokevirtual   #429 <Method float getExtraTopOffset()>
	//  130  253:fadd            
	//  131  254:fstore_2        
			f4 += getExtraRightOffset();
	//  132  255:fload           4
	//  133  257:aload_0         
	//  134  258:invokevirtual   #432 <Method float getExtraRightOffset()>
	//  135  261:fadd            
	//  136  262:fstore          4
			f1 += getExtraBottomOffset();
	//  137  264:fload_1         
	//  138  265:aload_0         
	//  139  266:invokevirtual   #435 <Method float getExtraBottomOffset()>
	//  140  269:fadd            
	//  141  270:fstore_1        
			f3 += getExtraLeftOffset();
	//  142  271:fload_3         
	//  143  272:aload_0         
	//  144  273:invokevirtual   #438 <Method float getExtraLeftOffset()>
	//  145  276:fadd            
	//  146  277:fstore_3        
			f5 = oc.b(o);
	//  147  278:aload_0         
	//  148  279:getfield        #93  <Field float o>
	//  149  282:invokestatic    #246 <Method float oc.b(float)>
	//  150  285:fstore          5
			O.a(Math.max(f5, f3), Math.max(f5, f2), Math.max(f5, f4), Math.max(f5, f1));
	//  151  287:aload_0         
	//  152  288:getfield        #159 <Field oa O>
	//  153  291:fload           5
	//  154  293:fload_3         
	//  155  294:invokestatic    #441 <Method float Math.max(float, float)>
	//  156  297:fload           5
	//  157  299:fload_2         
	//  158  300:invokestatic    #441 <Method float Math.max(float, float)>
	//  159  303:fload           5
	//  160  305:fload           4
	//  161  307:invokestatic    #441 <Method float Math.max(float, float)>
	//  162  310:fload           5
	//  163  312:fload_1         
	//  164  313:invokestatic    #441 <Method float Math.max(float, float)>
	//  165  316:invokevirtual   #443 <Method void oa.a(float, float, float, float)>
			if(j)
	//* 166  319:aload_0         
	//* 167  320:getfield        #445 <Field boolean j>
	//* 168  323:ifeq            420
			{
				Log.i("MPAndroidChart", (new StringBuilder()).append("offsetLeft: ").append(f3).append(", offsetTop: ").append(f2).append(", offsetRight: ").append(f4).append(", offsetBottom: ").append(f1).toString());
	//  169  326:ldc2            #447 <String "MPAndroidChart">
	//  170  329:new             #449 <Class StringBuilder>
	//  171  332:dup             
	//  172  333:invokespecial   #450 <Method void StringBuilder()>
	//  173  336:ldc2            #452 <String "offsetLeft: ">
	//  174  339:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  175  342:fload_3         
	//  176  343:invokevirtual   #459 <Method StringBuilder StringBuilder.append(float)>
	//  177  346:ldc2            #461 <String ", offsetTop: ">
	//  178  349:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  179  352:fload_2         
	//  180  353:invokevirtual   #459 <Method StringBuilder StringBuilder.append(float)>
	//  181  356:ldc2            #463 <String ", offsetRight: ">
	//  182  359:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  183  362:fload           4
	//  184  364:invokevirtual   #459 <Method StringBuilder StringBuilder.append(float)>
	//  185  367:ldc2            #465 <String ", offsetBottom: ">
	//  186  370:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  187  373:fload_1         
	//  188  374:invokevirtual   #459 <Method StringBuilder StringBuilder.append(float)>
	//  189  377:invokevirtual   #469 <Method String StringBuilder.toString()>
	//  190  380:invokestatic    #474 <Method int Log.i(String, String)>
	//  191  383:pop             
				Log.i("MPAndroidChart", (new StringBuilder()).append("Content: ").append(O.m().toString()).toString());
	//  192  384:ldc2            #447 <String "MPAndroidChart">
	//  193  387:new             #449 <Class StringBuilder>
	//  194  390:dup             
	//  195  391:invokespecial   #450 <Method void StringBuilder()>
	//  196  394:ldc2            #476 <String "Content: ">
	//  197  397:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  198  400:aload_0         
	//  199  401:getfield        #159 <Field oa O>
	//  200  404:invokevirtual   #254 <Method RectF oa.m()>
	//  201  407:invokevirtual   #477 <Method String RectF.toString()>
	//  202  410:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  203  413:invokevirtual   #469 <Method String StringBuilder.toString()>
	//  204  416:invokestatic    #474 <Method int Log.i(String, String)>
	//  205  419:pop             
			}
		}
		g();
	//  206  420:aload_0         
	//  207  421:invokevirtual   #479 <Method void g()>
		i();
	//  208  424:aload_0         
	//  209  425:invokevirtual   #481 <Method void i()>
	//  210  428:return          
	}

	protected void g()
	{
		u.e(r.E());
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field nv u>
	//    2    4:aload_0         
	//    3    5:getfield        #153 <Field lp r>
	//    4    8:invokevirtual   #281 <Method boolean lp.E()>
	//    5   11:invokevirtual   #484 <Method void nv.e(boolean)>
		q.e(l.E());
	//    6   14:aload_0         
	//    7   15:getfield        #164 <Field nv q>
	//    8   18:aload_0         
	//    9   19:getfield        #149 <Field lp l>
	//   10   22:invokevirtual   #281 <Method boolean lp.E()>
	//   11   25:invokevirtual   #484 <Method void nv.e(boolean)>
	//   12   28:return          
	}

	public lp getAxisLeft()
	{
		return l;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field lp l>
	//    2    4:areturn         
	}

	public lp getAxisRight()
	{
		return r;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field lp r>
	//    2    4:areturn         
	}

	public volatile lt getData()
	{
		return (lt)super.getData();
	//    0    0:aload_0         
	//    1    1:invokespecial   #492 <Method ma ld.getData()>
	//    2    4:checkcast       #297 <Class lt>
	//    3    7:areturn         
	}

	public nc getDrawListener()
	{
		return n;
	//    0    0:aload_0         
	//    1    1:getfield        #496 <Field nc n>
	//    2    4:areturn         
	}

	public float getHighestVisibleX()
	{
		b(lp.b.b).b(O.h(), O.i(), B);
	//    0    0:aload_0         
	//    1    1:getstatic       #144 <Field lp$b lp$b.b>
	//    2    4:invokevirtual   #499 <Method nv b(lp$b)>
	//    3    7:aload_0         
	//    4    8:getfield        #159 <Field oa O>
	//    5   11:invokevirtual   #501 <Method float oa.h()>
	//    6   14:aload_0         
	//    7   15:getfield        #159 <Field oa O>
	//    8   18:invokevirtual   #502 <Method float oa.i()>
	//    9   21:aload_0         
	//   10   22:getfield        #126 <Field nw B>
	//   11   25:invokevirtual   #505 <Method void nv.b(float, float, nw)>
		return (float)Math.min(H.u, B.b);
	//   12   28:aload_0         
	//   13   29:getfield        #181 <Field ln H>
	//   14   32:getfield        #507 <Field float ln.u>
	//   15   35:f2d             
	//   16   36:aload_0         
	//   17   37:getfield        #126 <Field nw B>
	//   18   40:getfield        #510 <Field double nw.b>
	//   19   43:invokestatic    #513 <Method double Math.min(double, double)>
	//   20   46:d2f             
	//   21   47:freturn         
	}

	public float getLowestVisibleX()
	{
		b(lp.b.b).b(O.f(), O.i(), v);
	//    0    0:aload_0         
	//    1    1:getstatic       #144 <Field lp$b lp$b.b>
	//    2    4:invokevirtual   #499 <Method nv b(lp$b)>
	//    3    7:aload_0         
	//    4    8:getfield        #159 <Field oa O>
	//    5   11:invokevirtual   #515 <Method float oa.f()>
	//    6   14:aload_0         
	//    7   15:getfield        #159 <Field oa O>
	//    8   18:invokevirtual   #502 <Method float oa.i()>
	//    9   21:aload_0         
	//   10   22:getfield        #124 <Field nw v>
	//   11   25:invokevirtual   #505 <Method void nv.b(float, float, nw)>
		return (float)Math.max(H.q, v.b);
	//   12   28:aload_0         
	//   13   29:getfield        #181 <Field ln H>
	//   14   32:getfield        #517 <Field float ln.q>
	//   15   35:f2d             
	//   16   36:aload_0         
	//   17   37:getfield        #124 <Field nw v>
	//   18   40:getfield        #510 <Field double nw.b>
	//   19   43:invokestatic    #519 <Method double Math.max(double, double)>
	//   20   46:d2f             
	//   21   47:freturn         
	}

	public int getMaxVisibleCount()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int c>
	//    2    4:ireturn         
	}

	public float getMinOffset()
	{
		return o;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field float o>
	//    2    4:freturn         
	}

	public nt getRendererLeftYAxis()
	{
		return s;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field nt s>
	//    2    4:areturn         
	}

	public nt getRendererRightYAxis()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field nt t>
	//    2    4:areturn         
	}

	public nu getRendererXAxis()
	{
		return x;
	//    0    0:aload_0         
	//    1    1:getfield        #186 <Field nu x>
	//    2    4:areturn         
	}

	public float getScaleX()
	{
		if(O == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field oa O>
	//*   2    4:ifnonnull       9
			return 1.0F;
	//    3    7:fconst_1        
	//    4    8:freturn         
		else
			return O.u();
	//    5    9:aload_0         
	//    6   10:getfield        #159 <Field oa O>
	//    7   13:invokevirtual   #528 <Method float oa.u()>
	//    8   16:freturn         
	}

	public float getScaleY()
	{
		if(O == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field oa O>
	//*   2    4:ifnonnull       9
			return 1.0F;
	//    3    7:fconst_1        
	//    4    8:freturn         
		else
			return O.t();
	//    5    9:aload_0         
	//    6   10:getfield        #159 <Field oa O>
	//    7   13:invokevirtual   #531 <Method float oa.t()>
	//    8   16:freturn         
	}

	public float getVisibleXRange()
	{
		return Math.abs(getHighestVisibleX() - getLowestVisibleX());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #534 <Method float getHighestVisibleX()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #536 <Method float getLowestVisibleX()>
	//    4    8:fsub            
	//    5    9:invokestatic    #539 <Method float Math.abs(float)>
	//    6   12:freturn         
	}

	public float getYChartMax()
	{
		return Math.max(l.u, r.u);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field lp l>
	//    2    4:getfield        #541 <Field float lp.u>
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field lp r>
	//    5   11:getfield        #541 <Field float lp.u>
	//    6   14:invokestatic    #441 <Method float Math.max(float, float)>
	//    7   17:freturn         
	}

	public float getYChartMin()
	{
		return Math.min(l.q, r.q);
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field lp l>
	//    2    4:getfield        #543 <Field float lp.q>
	//    3    7:aload_0         
	//    4    8:getfield        #153 <Field lp r>
	//    5   11:getfield        #543 <Field float lp.q>
	//    6   14:invokestatic    #376 <Method float Math.min(float, float)>
	//    7   17:freturn         
	}

	public void h()
	{
		if(A == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field ma A>
	//*   2    4:ifnonnull       25
		{
			if(j)
	//*   3    7:aload_0         
	//*   4    8:getfield        #445 <Field boolean j>
	//*   5   11:ifeq            24
				Log.i("MPAndroidChart", "Preparing... DATA NOT SET.");
	//    6   14:ldc2            #447 <String "MPAndroidChart">
	//    7   17:ldc2            #545 <String "Preparing... DATA NOT SET.">
	//    8   20:invokestatic    #474 <Method int Log.i(String, String)>
	//    9   23:pop             
			return;
	//   10   24:return          
		}
		if(j)
	//*  11   25:aload_0         
	//*  12   26:getfield        #445 <Field boolean j>
	//*  13   29:ifeq            42
			Log.i("MPAndroidChart", "Preparing...");
	//   14   32:ldc2            #447 <String "MPAndroidChart">
	//   15   35:ldc2            #547 <String "Preparing...">
	//   16   38:invokestatic    #474 <Method int Log.i(String, String)>
	//   17   41:pop             
		if(S != null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #551 <Field nj S>
	//*  20   46:ifnull          56
			S.e();
	//   21   49:aload_0         
	//   22   50:getfield        #551 <Field nj S>
	//   23   53:invokevirtual   #555 <Method void nj.e()>
		d();
	//   24   56:aload_0         
	//   25   57:invokevirtual   #557 <Method void d()>
		s.d(l.q, l.u, l.E());
	//   26   60:aload_0         
	//   27   61:getfield        #173 <Field nt s>
	//   28   64:aload_0         
	//   29   65:getfield        #149 <Field lp l>
	//   30   68:getfield        #543 <Field float lp.q>
	//   31   71:aload_0         
	//   32   72:getfield        #149 <Field lp l>
	//   33   75:getfield        #541 <Field float lp.u>
	//   34   78:aload_0         
	//   35   79:getfield        #149 <Field lp l>
	//   36   82:invokevirtual   #281 <Method boolean lp.E()>
	//   37   85:invokevirtual   #560 <Method void nt.d(float, float, boolean)>
		t.d(r.q, r.u, r.E());
	//   38   88:aload_0         
	//   39   89:getfield        #175 <Field nt t>
	//   40   92:aload_0         
	//   41   93:getfield        #153 <Field lp r>
	//   42   96:getfield        #543 <Field float lp.q>
	//   43   99:aload_0         
	//   44  100:getfield        #153 <Field lp r>
	//   45  103:getfield        #541 <Field float lp.u>
	//   46  106:aload_0         
	//   47  107:getfield        #153 <Field lp r>
	//   48  110:invokevirtual   #281 <Method boolean lp.E()>
	//   49  113:invokevirtual   #560 <Method void nt.d(float, float, boolean)>
		x.d(H.q, H.u, false);
	//   50  116:aload_0         
	//   51  117:getfield        #186 <Field nu x>
	//   52  120:aload_0         
	//   53  121:getfield        #181 <Field ln H>
	//   54  124:getfield        #517 <Field float ln.q>
	//   55  127:aload_0         
	//   56  128:getfield        #181 <Field ln H>
	//   57  131:getfield        #507 <Field float ln.u>
	//   58  134:iconst_0        
	//   59  135:invokevirtual   #561 <Method void nu.d(float, float, boolean)>
		if(N != null)
	//*  60  138:aload_0         
	//*  61  139:getfield        #339 <Field lm N>
	//*  62  142:ifnull          156
			J.e(A);
	//   63  145:aload_0         
	//   64  146:getfield        #564 <Field np J>
	//   65  149:aload_0         
	//   66  150:getfield        #295 <Field ma A>
	//   67  153:invokevirtual   #569 <Method void np.e(ma)>
		f();
	//   68  156:aload_0         
	//   69  157:invokevirtual   #270 <Method void f()>
	//   70  160:return          
	}

	protected void i()
	{
		if(j)
	//*   0    0:aload_0         
	//*   1    1:getfield        #445 <Field boolean j>
	//*   2    4:ifeq            72
			Log.i("MPAndroidChart", (new StringBuilder()).append("Preparing Value-Px Matrix, xmin: ").append(H.q).append(", xmax: ").append(H.u).append(", xdelta: ").append(H.w).toString());
	//    3    7:ldc2            #447 <String "MPAndroidChart">
	//    4   10:new             #449 <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #450 <Method void StringBuilder()>
	//    7   17:ldc2            #571 <String "Preparing Value-Px Matrix, xmin: ">
	//    8   20:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:aload_0         
	//   10   24:getfield        #181 <Field ln H>
	//   11   27:getfield        #517 <Field float ln.q>
	//   12   30:invokevirtual   #459 <Method StringBuilder StringBuilder.append(float)>
	//   13   33:ldc2            #573 <String ", xmax: ">
	//   14   36:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   15   39:aload_0         
	//   16   40:getfield        #181 <Field ln H>
	//   17   43:getfield        #507 <Field float ln.u>
	//   18   46:invokevirtual   #459 <Method StringBuilder StringBuilder.append(float)>
	//   19   49:ldc2            #575 <String ", xdelta: ">
	//   20   52:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//   21   55:aload_0         
	//   22   56:getfield        #181 <Field ln H>
	//   23   59:getfield        #576 <Field float ln.w>
	//   24   62:invokevirtual   #459 <Method StringBuilder StringBuilder.append(float)>
	//   25   65:invokevirtual   #469 <Method String StringBuilder.toString()>
	//   26   68:invokestatic    #474 <Method int Log.i(String, String)>
	//   27   71:pop             
		u.e(H.q, H.w, r.w, r.q);
	//   28   72:aload_0         
	//   29   73:getfield        #166 <Field nv u>
	//   30   76:aload_0         
	//   31   77:getfield        #181 <Field ln H>
	//   32   80:getfield        #517 <Field float ln.q>
	//   33   83:aload_0         
	//   34   84:getfield        #181 <Field ln H>
	//   35   87:getfield        #576 <Field float ln.w>
	//   36   90:aload_0         
	//   37   91:getfield        #153 <Field lp r>
	//   38   94:getfield        #287 <Field float lp.w>
	//   39   97:aload_0         
	//   40   98:getfield        #153 <Field lp r>
	//   41  101:getfield        #543 <Field float lp.q>
	//   42  104:invokevirtual   #578 <Method void nv.e(float, float, float, float)>
		q.e(H.q, H.w, l.w, l.q);
	//   43  107:aload_0         
	//   44  108:getfield        #164 <Field nv q>
	//   45  111:aload_0         
	//   46  112:getfield        #181 <Field ln H>
	//   47  115:getfield        #517 <Field float ln.q>
	//   48  118:aload_0         
	//   49  119:getfield        #181 <Field ln H>
	//   50  122:getfield        #576 <Field float ln.w>
	//   51  125:aload_0         
	//   52  126:getfield        #149 <Field lp l>
	//   53  129:getfield        #287 <Field float lp.w>
	//   54  132:aload_0         
	//   55  133:getfield        #149 <Field lp l>
	//   56  136:getfield        #543 <Field float lp.q>
	//   57  139:invokevirtual   #578 <Method void nv.e(float, float, float, float)>
	//   58  142:return          
	}

	protected void k()
	{
		float f1 = getLowestVisibleX();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #536 <Method float getLowestVisibleX()>
	//    2    4:fstore_1        
		float f2 = getHighestVisibleX();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #534 <Method float getHighestVisibleX()>
	//    5    9:fstore_2        
		((lt)A).b(f1, f2);
	//    6   10:aload_0         
	//    7   11:getfield        #295 <Field ma A>
	//    8   14:checkcast       #297 <Class lt>
	//    9   17:fload_1         
	//   10   18:fload_2         
	//   11   19:invokevirtual   #580 <Method void lt.b(float, float)>
		H.d(((lt)A).i(), ((lt)A).f());
	//   12   22:aload_0         
	//   13   23:getfield        #181 <Field ln H>
	//   14   26:aload_0         
	//   15   27:getfield        #295 <Field ma A>
	//   16   30:checkcast       #297 <Class lt>
	//   17   33:invokevirtual   #310 <Method float lt.i()>
	//   18   36:aload_0         
	//   19   37:getfield        #295 <Field ma A>
	//   20   40:checkcast       #297 <Class lt>
	//   21   43:invokevirtual   #312 <Method float lt.f()>
	//   22   46:invokevirtual   #317 <Method void ln.d(float, float)>
		if(l.B())
	//*  23   49:aload_0         
	//*  24   50:getfield        #149 <Field lp l>
	//*  25   53:invokevirtual   #581 <Method boolean lp.B()>
	//*  26   56:ifeq            92
			l.d(((lt)A).a(lp.b.b), ((lt)A).d(lp.b.b));
	//   27   59:aload_0         
	//   28   60:getfield        #149 <Field lp l>
	//   29   63:aload_0         
	//   30   64:getfield        #295 <Field ma A>
	//   31   67:checkcast       #297 <Class lt>
	//   32   70:getstatic       #144 <Field lp$b lp$b.b>
	//   33   73:invokevirtual   #319 <Method float lt.a(lp$b)>
	//   34   76:aload_0         
	//   35   77:getfield        #295 <Field ma A>
	//   36   80:checkcast       #297 <Class lt>
	//   37   83:getstatic       #144 <Field lp$b lp$b.b>
	//   38   86:invokevirtual   #321 <Method float lt.d(lp$b)>
	//   39   89:invokevirtual   #322 <Method void lp.d(float, float)>
		if(r.B())
	//*  40   92:aload_0         
	//*  41   93:getfield        #153 <Field lp r>
	//*  42   96:invokevirtual   #581 <Method boolean lp.B()>
	//*  43   99:ifeq            135
			r.d(((lt)A).a(lp.b.e), ((lt)A).d(lp.b.e));
	//   44  102:aload_0         
	//   45  103:getfield        #153 <Field lp r>
	//   46  106:aload_0         
	//   47  107:getfield        #295 <Field ma A>
	//   48  110:checkcast       #297 <Class lt>
	//   49  113:getstatic       #151 <Field lp$b lp$b.e>
	//   50  116:invokevirtual   #319 <Method float lt.a(lp$b)>
	//   51  119:aload_0         
	//   52  120:getfield        #295 <Field ma A>
	//   53  123:checkcast       #297 <Class lt>
	//   54  126:getstatic       #151 <Field lp$b lp$b.e>
	//   55  129:invokevirtual   #321 <Method float lt.d(lp$b)>
	//   56  132:invokevirtual   #322 <Method void lp.d(float, float)>
		f();
	//   57  135:aload_0         
	//   58  136:invokevirtual   #270 <Method void f()>
	//   59  139:return          
	}

	public boolean l()
	{
		return a || ab;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean a>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #80  <Field boolean ab>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean m()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field boolean a>
	//    2    4:ireturn         
	}

	public boolean n()
	{
		return aa;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field boolean aa>
	//    2    4:ireturn         
	}

	public boolean o()
	{
		return ab;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field boolean ab>
	//    2    4:ireturn         
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #584 <Method void ld.onDraw(Canvas)>
		if(A == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #295 <Field ma A>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		long l1 = System.currentTimeMillis();
	//    7   13:invokestatic    #590 <Method long System.currentTimeMillis()>
	//    8   16:lstore_3        
		a(canvas);
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #592 <Method void a(Canvas)>
		if(b)
	//*  12   22:aload_0         
	//*  13   23:getfield        #70  <Field boolean b>
	//*  14   26:ifeq            33
			k();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #594 <Method void k()>
		if(l.B())
	//*  17   33:aload_0         
	//*  18   34:getfield        #149 <Field lp l>
	//*  19   37:invokevirtual   #581 <Method boolean lp.B()>
	//*  20   40:ifeq            71
			s.d(l.q, l.u, l.E());
	//   21   43:aload_0         
	//   22   44:getfield        #173 <Field nt s>
	//   23   47:aload_0         
	//   24   48:getfield        #149 <Field lp l>
	//   25   51:getfield        #543 <Field float lp.q>
	//   26   54:aload_0         
	//   27   55:getfield        #149 <Field lp l>
	//   28   58:getfield        #541 <Field float lp.u>
	//   29   61:aload_0         
	//   30   62:getfield        #149 <Field lp l>
	//   31   65:invokevirtual   #281 <Method boolean lp.E()>
	//   32   68:invokevirtual   #560 <Method void nt.d(float, float, boolean)>
		if(r.B())
	//*  33   71:aload_0         
	//*  34   72:getfield        #153 <Field lp r>
	//*  35   75:invokevirtual   #581 <Method boolean lp.B()>
	//*  36   78:ifeq            109
			t.d(r.q, r.u, r.E());
	//   37   81:aload_0         
	//   38   82:getfield        #175 <Field nt t>
	//   39   85:aload_0         
	//   40   86:getfield        #153 <Field lp r>
	//   41   89:getfield        #543 <Field float lp.q>
	//   42   92:aload_0         
	//   43   93:getfield        #153 <Field lp r>
	//   44   96:getfield        #541 <Field float lp.u>
	//   45   99:aload_0         
	//   46  100:getfield        #153 <Field lp r>
	//   47  103:invokevirtual   #281 <Method boolean lp.E()>
	//   48  106:invokevirtual   #560 <Method void nt.d(float, float, boolean)>
		if(H.B())
	//*  49  109:aload_0         
	//*  50  110:getfield        #181 <Field ln H>
	//*  51  113:invokevirtual   #397 <Method boolean ln.B()>
	//*  52  116:ifeq            141
			x.d(H.q, H.u, false);
	//   53  119:aload_0         
	//   54  120:getfield        #186 <Field nu x>
	//   55  123:aload_0         
	//   56  124:getfield        #181 <Field ln H>
	//   57  127:getfield        #517 <Field float ln.q>
	//   58  130:aload_0         
	//   59  131:getfield        #181 <Field ln H>
	//   60  134:getfield        #507 <Field float ln.u>
	//   61  137:iconst_0        
	//   62  138:invokevirtual   #561 <Method void nu.d(float, float, boolean)>
		x.b(canvas);
	//   63  141:aload_0         
	//   64  142:getfield        #186 <Field nu x>
	//   65  145:aload_1         
	//   66  146:invokevirtual   #596 <Method void nu.b(Canvas)>
		s.d(canvas);
	//   67  149:aload_0         
	//   68  150:getfield        #173 <Field nt s>
	//   69  153:aload_1         
	//   70  154:invokevirtual   #598 <Method void nt.d(Canvas)>
		t.d(canvas);
	//   71  157:aload_0         
	//   72  158:getfield        #175 <Field nt t>
	//   73  161:aload_1         
	//   74  162:invokevirtual   #598 <Method void nt.d(Canvas)>
		x.a(canvas);
	//   75  165:aload_0         
	//   76  166:getfield        #186 <Field nu x>
	//   77  169:aload_1         
	//   78  170:invokevirtual   #599 <Method void nu.a(Canvas)>
		s.e(canvas);
	//   79  173:aload_0         
	//   80  174:getfield        #173 <Field nt s>
	//   81  177:aload_1         
	//   82  178:invokevirtual   #601 <Method void nt.e(Canvas)>
		t.e(canvas);
	//   83  181:aload_0         
	//   84  182:getfield        #175 <Field nt t>
	//   85  185:aload_1         
	//   86  186:invokevirtual   #601 <Method void nt.e(Canvas)>
		if(H.B() && H.o())
	//*  87  189:aload_0         
	//*  88  190:getfield        #181 <Field ln H>
	//*  89  193:invokevirtual   #397 <Method boolean ln.B()>
	//*  90  196:ifeq            217
	//*  91  199:aload_0         
	//*  92  200:getfield        #181 <Field ln H>
	//*  93  203:invokevirtual   #603 <Method boolean ln.o()>
	//*  94  206:ifeq            217
			x.e(canvas);
	//   95  209:aload_0         
	//   96  210:getfield        #186 <Field nu x>
	//   97  213:aload_1         
	//   98  214:invokevirtual   #604 <Method void nu.e(Canvas)>
		if(l.B() && l.o())
	//*  99  217:aload_0         
	//* 100  218:getfield        #149 <Field lp l>
	//* 101  221:invokevirtual   #581 <Method boolean lp.B()>
	//* 102  224:ifeq            245
	//* 103  227:aload_0         
	//* 104  228:getfield        #149 <Field lp l>
	//* 105  231:invokevirtual   #605 <Method boolean lp.o()>
	//* 106  234:ifeq            245
			s.c(canvas);
	//  107  237:aload_0         
	//  108  238:getfield        #173 <Field nt s>
	//  109  241:aload_1         
	//  110  242:invokevirtual   #607 <Method void nt.c(Canvas)>
		if(r.B() && r.o())
	//* 111  245:aload_0         
	//* 112  246:getfield        #153 <Field lp r>
	//* 113  249:invokevirtual   #581 <Method boolean lp.B()>
	//* 114  252:ifeq            273
	//* 115  255:aload_0         
	//* 116  256:getfield        #153 <Field lp r>
	//* 117  259:invokevirtual   #605 <Method boolean lp.o()>
	//* 118  262:ifeq            273
			t.c(canvas);
	//  119  265:aload_0         
	//  120  266:getfield        #175 <Field nt t>
	//  121  269:aload_1         
	//  122  270:invokevirtual   #607 <Method void nt.c(Canvas)>
		int j = canvas.save();
	//  123  273:aload_1         
	//  124  274:invokevirtual   #610 <Method int Canvas.save()>
	//  125  277:istore_2        
		canvas.clipRect(O.m());
	//  126  278:aload_1         
	//  127  279:aload_0         
	//  128  280:getfield        #159 <Field oa O>
	//  129  283:invokevirtual   #254 <Method RectF oa.m()>
	//  130  286:invokevirtual   #614 <Method boolean Canvas.clipRect(RectF)>
	//  131  289:pop             
		S.a(canvas);
	//  132  290:aload_0         
	//  133  291:getfield        #551 <Field nj S>
	//  134  294:aload_1         
	//  135  295:invokevirtual   #615 <Method void nj.a(Canvas)>
		if(z())
	//* 136  298:aload_0         
	//* 137  299:invokevirtual   #617 <Method boolean z()>
	//* 138  302:ifeq            317
			S.d(canvas, Q);
	//  139  305:aload_0         
	//  140  306:getfield        #551 <Field nj S>
	//  141  309:aload_1         
	//  142  310:aload_0         
	//  143  311:getfield        #621 <Field mh[] Q>
	//  144  314:invokevirtual   #624 <Method void nj.d(Canvas, mh[])>
		canvas.restoreToCount(j);
	//  145  317:aload_1         
	//  146  318:iload_2         
	//  147  319:invokevirtual   #627 <Method void Canvas.restoreToCount(int)>
		S.d(canvas);
	//  148  322:aload_0         
	//  149  323:getfield        #551 <Field nj S>
	//  150  326:aload_1         
	//  151  327:invokevirtual   #628 <Method void nj.d(Canvas)>
		if(H.B() && !H.o())
	//* 152  330:aload_0         
	//* 153  331:getfield        #181 <Field ln H>
	//* 154  334:invokevirtual   #397 <Method boolean ln.B()>
	//* 155  337:ifeq            358
	//* 156  340:aload_0         
	//* 157  341:getfield        #181 <Field ln H>
	//* 158  344:invokevirtual   #603 <Method boolean ln.o()>
	//* 159  347:ifne            358
			x.e(canvas);
	//  160  350:aload_0         
	//  161  351:getfield        #186 <Field nu x>
	//  162  354:aload_1         
	//  163  355:invokevirtual   #604 <Method void nu.e(Canvas)>
		if(l.B() && !l.o())
	//* 164  358:aload_0         
	//* 165  359:getfield        #149 <Field lp l>
	//* 166  362:invokevirtual   #581 <Method boolean lp.B()>
	//* 167  365:ifeq            386
	//* 168  368:aload_0         
	//* 169  369:getfield        #149 <Field lp l>
	//* 170  372:invokevirtual   #605 <Method boolean lp.o()>
	//* 171  375:ifne            386
			s.c(canvas);
	//  172  378:aload_0         
	//  173  379:getfield        #173 <Field nt s>
	//  174  382:aload_1         
	//  175  383:invokevirtual   #607 <Method void nt.c(Canvas)>
		if(r.B() && !r.o())
	//* 176  386:aload_0         
	//* 177  387:getfield        #153 <Field lp r>
	//* 178  390:invokevirtual   #581 <Method boolean lp.B()>
	//* 179  393:ifeq            414
	//* 180  396:aload_0         
	//* 181  397:getfield        #153 <Field lp r>
	//* 182  400:invokevirtual   #605 <Method boolean lp.o()>
	//* 183  403:ifne            414
			t.c(canvas);
	//  184  406:aload_0         
	//  185  407:getfield        #175 <Field nt t>
	//  186  410:aload_1         
	//  187  411:invokevirtual   #607 <Method void nt.c(Canvas)>
		x.c(canvas);
	//  188  414:aload_0         
	//  189  415:getfield        #186 <Field nu x>
	//  190  418:aload_1         
	//  191  419:invokevirtual   #629 <Method void nu.c(Canvas)>
		s.b(canvas);
	//  192  422:aload_0         
	//  193  423:getfield        #173 <Field nt s>
	//  194  426:aload_1         
	//  195  427:invokevirtual   #630 <Method void nt.b(Canvas)>
		t.b(canvas);
	//  196  430:aload_0         
	//  197  431:getfield        #175 <Field nt t>
	//  198  434:aload_1         
	//  199  435:invokevirtual   #630 <Method void nt.b(Canvas)>
		if(u())
	//* 200  438:aload_0         
	//* 201  439:invokevirtual   #632 <Method boolean u()>
	//* 202  442:ifeq            478
		{
			int i1 = canvas.save();
	//  203  445:aload_1         
	//  204  446:invokevirtual   #610 <Method int Canvas.save()>
	//  205  449:istore_2        
			canvas.clipRect(O.m());
	//  206  450:aload_1         
	//  207  451:aload_0         
	//  208  452:getfield        #159 <Field oa O>
	//  209  455:invokevirtual   #254 <Method RectF oa.m()>
	//  210  458:invokevirtual   #614 <Method boolean Canvas.clipRect(RectF)>
	//  211  461:pop             
			S.e(canvas);
	//  212  462:aload_0         
	//  213  463:getfield        #551 <Field nj S>
	//  214  466:aload_1         
	//  215  467:invokevirtual   #633 <Method void nj.e(Canvas)>
			canvas.restoreToCount(i1);
	//  216  470:aload_1         
	//  217  471:iload_2         
	//  218  472:invokevirtual   #627 <Method void Canvas.restoreToCount(int)>
		} else
	//* 219  475:goto            486
		{
			S.e(canvas);
	//  220  478:aload_0         
	//  221  479:getfield        #551 <Field nj S>
	//  222  482:aload_1         
	//  223  483:invokevirtual   #633 <Method void nj.e(Canvas)>
		}
		J.e(canvas);
	//  224  486:aload_0         
	//  225  487:getfield        #564 <Field np J>
	//  226  490:aload_1         
	//  227  491:invokevirtual   #634 <Method void np.e(Canvas)>
		b(canvas);
	//  228  494:aload_0         
	//  229  495:aload_1         
	//  230  496:invokevirtual   #635 <Method void b(Canvas)>
		d(canvas);
	//  231  499:aload_0         
	//  232  500:aload_1         
	//  233  501:invokevirtual   #636 <Method void d(Canvas)>
		if(this.j)
	//* 234  504:aload_0         
	//* 235  505:getfield        #445 <Field boolean j>
	//* 236  508:ifeq            599
		{
			l1 = System.currentTimeMillis() - l1;
	//  237  511:invokestatic    #590 <Method long System.currentTimeMillis()>
	//  238  514:lload_3         
	//  239  515:lsub            
	//  240  516:lstore_3        
			af = af + l1;
	//  241  517:aload_0         
	//  242  518:aload_0         
	//  243  519:getfield        #97  <Field long af>
	//  244  522:lload_3         
	//  245  523:ladd            
	//  246  524:putfield        #97  <Field long af>
			ad = ad + 1L;
	//  247  527:aload_0         
	//  248  528:aload_0         
	//  249  529:getfield        #99  <Field long ad>
	//  250  532:lconst_1        
	//  251  533:ladd            
	//  252  534:putfield        #99  <Field long ad>
			long l2 = af / ad;
	//  253  537:aload_0         
	//  254  538:getfield        #97  <Field long af>
	//  255  541:aload_0         
	//  256  542:getfield        #99  <Field long ad>
	//  257  545:ldiv            
	//  258  546:lstore          5
			Log.i("MPAndroidChart", (new StringBuilder()).append("Drawtime: ").append(l1).append(" ms, average: ").append(l2).append(" ms, cycles: ").append(ad).toString());
	//  259  548:ldc2            #447 <String "MPAndroidChart">
	//  260  551:new             #449 <Class StringBuilder>
	//  261  554:dup             
	//  262  555:invokespecial   #450 <Method void StringBuilder()>
	//  263  558:ldc2            #638 <String "Drawtime: ">
	//  264  561:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  265  564:lload_3         
	//  266  565:invokevirtual   #641 <Method StringBuilder StringBuilder.append(long)>
	//  267  568:ldc2            #643 <String " ms, average: ">
	//  268  571:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  269  574:lload           5
	//  270  576:invokevirtual   #641 <Method StringBuilder StringBuilder.append(long)>
	//  271  579:ldc2            #645 <String " ms, cycles: ">
	//  272  582:invokevirtual   #456 <Method StringBuilder StringBuilder.append(String)>
	//  273  585:aload_0         
	//  274  586:getfield        #99  <Field long ad>
	//  275  589:invokevirtual   #641 <Method StringBuilder StringBuilder.append(long)>
	//  276  592:invokevirtual   #469 <Method String StringBuilder.toString()>
	//  277  595:invokestatic    #474 <Method int Log.i(String, String)>
	//  278  598:pop             
		}
	//  279  599:return          
	}

	protected void onSizeChanged(int j, int i1, int j1, int k1)
	{
		float af1[] = C;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field float[] C>
	//    2    4:astore          5
		C[1] = 0.0F;
	//    3    6:aload_0         
	//    4    7:getfield        #128 <Field float[] C>
	//    5   10:iconst_1        
	//    6   11:fconst_0        
	//    7   12:fastore         
		af1[0] = 0.0F;
	//    8   13:aload           5
	//    9   15:iconst_0        
	//   10   16:fconst_0        
	//   11   17:fastore         
		if(m)
	//*  12   18:aload_0         
	//*  13   19:getfield        #95  <Field boolean m>
	//*  14   22:ifeq            65
		{
			C[0] = O.f();
	//   15   25:aload_0         
	//   16   26:getfield        #128 <Field float[] C>
	//   17   29:iconst_0        
	//   18   30:aload_0         
	//   19   31:getfield        #159 <Field oa O>
	//   20   34:invokevirtual   #515 <Method float oa.f()>
	//   21   37:fastore         
			C[1] = O.e();
	//   22   38:aload_0         
	//   23   39:getfield        #128 <Field float[] C>
	//   24   42:iconst_1        
	//   25   43:aload_0         
	//   26   44:getfield        #159 <Field oa O>
	//   27   47:invokevirtual   #649 <Method float oa.e()>
	//   28   50:fastore         
			b(lp.b.b).d(C);
	//   29   51:aload_0         
	//   30   52:getstatic       #144 <Field lp$b lp$b.b>
	//   31   55:invokevirtual   #499 <Method nv b(lp$b)>
	//   32   58:aload_0         
	//   33   59:getfield        #128 <Field float[] C>
	//   34   62:invokevirtual   #652 <Method void nv.d(float[])>
		}
		super.onSizeChanged(j, i1, j1, k1);
	//   35   65:aload_0         
	//   36   66:iload_1         
	//   37   67:iload_2         
	//   38   68:iload_3         
	//   39   69:iload           4
	//   40   71:invokespecial   #654 <Method void ld.onSizeChanged(int, int, int, int)>
		if(m)
	//*  41   74:aload_0         
	//*  42   75:getfield        #95  <Field boolean m>
	//*  43   78:ifeq            108
		{
			b(lp.b.b).e(C);
	//   44   81:aload_0         
	//   45   82:getstatic       #144 <Field lp$b lp$b.b>
	//   46   85:invokevirtual   #499 <Method nv b(lp$b)>
	//   47   88:aload_0         
	//   48   89:getfield        #128 <Field float[] C>
	//   49   92:invokevirtual   #656 <Method void nv.e(float[])>
			O.e(C, ((android.view.View) (this)));
	//   50   95:aload_0         
	//   51   96:getfield        #159 <Field oa O>
	//   52   99:aload_0         
	//   53  100:getfield        #128 <Field float[] C>
	//   54  103:aload_0         
	//   55  104:invokevirtual   #659 <Method void oa.e(float[], android.view.View)>
			return;
	//   56  107:return          
		} else
		{
			O.d(O.p(), ((android.view.View) (this)), true);
	//   57  108:aload_0         
	//   58  109:getfield        #159 <Field oa O>
	//   59  112:aload_0         
	//   60  113:getfield        #159 <Field oa O>
	//   61  116:invokevirtual   #202 <Method Matrix oa.p()>
	//   62  119:aload_0         
	//   63  120:iconst_1        
	//   64  121:invokevirtual   #268 <Method Matrix oa.d(Matrix, android.view.View, boolean)>
	//   65  124:pop             
			return;
	//   66  125:return          
		}
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #663 <Method boolean ld.onTouchEvent(MotionEvent)>
	//    3    5:pop             
		if(K == null || A == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #210 <Field nd K>
	//*   6   10:ifnull          20
	//*   7   13:aload_0         
	//*   8   14:getfield        #295 <Field ma A>
	//*   9   17:ifnonnull       22
			return false;
	//   10   20:iconst_0        
	//   11   21:ireturn         
		if(!I)
	//*  12   22:aload_0         
	//*  13   23:getfield        #665 <Field boolean I>
	//*  14   26:ifne            31
			return false;
	//   15   29:iconst_0        
	//   16   30:ireturn         
		else
			return K.onTouch(((android.view.View) (this)), motionevent);
	//   17   31:aload_0         
	//   18   32:getfield        #210 <Field nd K>
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #671 <Method boolean nd.onTouch(android.view.View, MotionEvent)>
	//   22   40:ireturn         
	}

	public boolean p()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field boolean i>
	//    2    4:ireturn         
	}

	public boolean q()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field boolean e>
	//    2    4:ireturn         
	}

	public boolean r()
	{
		return ac;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean ac>
	//    2    4:ireturn         
	}

	public boolean s()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field boolean d>
	//    2    4:ireturn         
	}

	public void setAutoScaleMinMaxEnabled(boolean flag)
	{
		b = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field boolean b>
	//    3    5:return          
	}

	public void setBorderColor(int j)
	{
		k.setColor(j);
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field Paint k>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method void Paint.setColor(int)>
	//    4    8:return          
	}

	public void setBorderWidth(float f1)
	{
		k.setStrokeWidth(oc.b(f1));
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field Paint k>
	//    2    4:fload_1         
	//    3    5:invokestatic    #246 <Method float oc.b(float)>
	//    4    8:invokevirtual   #250 <Method void Paint.setStrokeWidth(float)>
	//    5   11:return          
	}

	public void setClipValuesToContent(boolean flag)
	{
		p = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #90  <Field boolean p>
	//    3    5:return          
	}

	public void setDoubleTapToZoomEnabled(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #74  <Field boolean e>
	//    3    5:return          
	}

	public void setDragEnabled(boolean flag)
	{
		a = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean a>
		ab = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #80  <Field boolean ab>
	//    6   10:return          
	}

	public void setDragOffsetX(float f1)
	{
		O.l(f1);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field oa O>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #680 <Method void oa.l(float)>
	//    4    8:return          
	}

	public void setDragOffsetY(float f1)
	{
		O.o(f1);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field oa O>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #683 <Method void oa.o(float)>
	//    4    8:return          
	}

	public void setDragXEnabled(boolean flag)
	{
		a = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #78  <Field boolean a>
	//    3    5:return          
	}

	public void setDragYEnabled(boolean flag)
	{
		ab = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field boolean ab>
	//    3    5:return          
	}

	public void setDrawBorders(boolean flag)
	{
		g = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field boolean g>
	//    3    5:return          
	}

	public void setDrawGridBackground(boolean flag)
	{
		h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #86  <Field boolean h>
	//    3    5:return          
	}

	public void setGridBackgroundColor(int j)
	{
		f.setColor(j);
	//    0    0:aload_0         
	//    1    1:getfield        #215 <Field Paint f>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #235 <Method void Paint.setColor(int)>
	//    4    8:return          
	}

	public void setHighlightPerDragEnabled(boolean flag)
	{
		i = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #76  <Field boolean i>
	//    3    5:return          
	}

	public void setKeepPositionOnRotation(boolean flag)
	{
		m = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #95  <Field boolean m>
	//    3    5:return          
	}

	public void setMaxVisibleValueCount(int j)
	{
		c = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #68  <Field int c>
	//    3    5:return          
	}

	public void setMinOffset(float f1)
	{
		o = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #93  <Field float o>
	//    3    5:return          
	}

	public void setOnDrawListener(nc nc)
	{
		n = nc;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #496 <Field nc n>
	//    3    5:return          
	}

	public void setPaint(Paint paint, int j)
	{
		super.setPaint(paint, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #698 <Method void ld.setPaint(Paint, int)>
		switch(j)
	//*   4    6:iload_2         
		{
	//*   5    7:lookupswitch    1: default 24
	//	               4: 25
		default:
			return;
	//    6   24:return          

		case 4: // '\004'
			f = paint;
	//    7   25:aload_0         
	//    8   26:aload_1         
	//    9   27:putfield        #215 <Field Paint f>
			break;
		}
	//   10   30:return          
	}

	public void setPinchZoom(boolean flag)
	{
		d = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #72  <Field boolean d>
	//    3    5:return          
	}

	public void setRendererLeftYAxis(nt nt1)
	{
		s = nt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #173 <Field nt s>
	//    3    5:return          
	}

	public void setRendererRightYAxis(nt nt1)
	{
		t = nt1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #175 <Field nt t>
	//    3    5:return          
	}

	public void setScaleEnabled(boolean flag)
	{
		aa = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field boolean aa>
		ac = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #84  <Field boolean ac>
	//    6   10:return          
	}

	public void setScaleMinima(float f1, float f2)
	{
		O.e(f1);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field oa O>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #706 <Method void oa.e(float)>
		O.b(f2);
	//    4    8:aload_0         
	//    5    9:getfield        #159 <Field oa O>
	//    6   12:fload_2         
	//    7   13:invokevirtual   #708 <Method void oa.b(float)>
	//    8   16:return          
	}

	public void setScaleXEnabled(boolean flag)
	{
		aa = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field boolean aa>
	//    3    5:return          
	}

	public void setScaleYEnabled(boolean flag)
	{
		ac = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #84  <Field boolean ac>
	//    3    5:return          
	}

	public void setViewPortOffsets(float f1, float f2, float f3, float f4)
	{
		ag = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #115 <Field boolean ag>
		post(new Runnable(f1, f2, f3, f4) {

			public void run()
			{
				a.O.a(e, c, d, b);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field le a>
			//    2    4:getfield        #39  <Field oa le.O>
			//    3    7:aload_0         
			//    4    8:getfield        #24  <Field float e>
			//    5   11:aload_0         
			//    6   12:getfield        #26  <Field float c>
			//    7   15:aload_0         
			//    8   16:getfield        #28  <Field float d>
			//    9   19:aload_0         
			//   10   20:getfield        #30  <Field float b>
			//   11   23:invokevirtual   #43  <Method void oa.a(float, float, float, float)>
				a.g();
			//   12   26:aload_0         
			//   13   27:getfield        #22  <Field le a>
			//   14   30:invokevirtual   #46  <Method void le.g()>
				a.i();
			//   15   33:aload_0         
			//   16   34:getfield        #22  <Field le a>
			//   17   37:invokevirtual   #49  <Method void le.i()>
			//   18   40:return          
			}

			final le a;
			final float b;
			final float c;
			final float d;
			final float e;

			
			{
				a = le.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field le a>
				e = f1;
			//    3    5:aload_0         
			//    4    6:fload_2         
			//    5    7:putfield        #24  <Field float e>
				c = f2;
			//    6   10:aload_0         
			//    7   11:fload_3         
			//    8   12:putfield        #26  <Field float c>
				d = f3;
			//    9   15:aload_0         
			//   10   16:fload           4
			//   11   18:putfield        #28  <Field float d>
				b = f4;
			//   12   21:aload_0         
			//   13   22:fload           5
			//   14   24:putfield        #30  <Field float b>
				super();
			//   15   27:aload_0         
			//   16   28:invokespecial   #33  <Method void Object()>
			//   17   31:return          
			}
		}
);
	//    3    5:aload_0         
	//    4    6:new             #11  <Class le$5>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:fload_1         
	//    8   12:fload_2         
	//    9   13:fload_3         
	//   10   14:fload           4
	//   11   16:invokespecial   #714 <Method void le$5(le, float, float, float, float)>
	//   12   19:invokevirtual   #718 <Method boolean post(Runnable)>
	//   13   22:pop             
	//   14   23:return          
	}

	public void setVisibleXRange(float f1, float f2)
	{
		f1 = H.w / f1;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ln H>
	//    2    4:getfield        #576 <Field float ln.w>
	//    3    7:fload_1         
	//    4    8:fdiv            
	//    5    9:fstore_1        
		f2 = H.w / f2;
	//    6   10:aload_0         
	//    7   11:getfield        #181 <Field ln H>
	//    8   14:getfield        #576 <Field float ln.w>
	//    9   17:fload_2         
	//   10   18:fdiv            
	//   11   19:fstore_2        
		O.e(f1, f2);
	//   12   20:aload_0         
	//   13   21:getfield        #159 <Field oa O>
	//   14   24:fload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #721 <Method void oa.e(float, float)>
	//   17   29:return          
	}

	public void setVisibleXRangeMaximum(float f1)
	{
		f1 = H.w / f1;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ln H>
	//    2    4:getfield        #576 <Field float ln.w>
	//    3    7:fload_1         
	//    4    8:fdiv            
	//    5    9:fstore_1        
		O.e(f1);
	//    6   10:aload_0         
	//    7   11:getfield        #159 <Field oa O>
	//    8   14:fload_1         
	//    9   15:invokevirtual   #706 <Method void oa.e(float)>
	//   10   18:return          
	}

	public void setVisibleXRangeMinimum(float f1)
	{
		f1 = H.w / f1;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field ln H>
	//    2    4:getfield        #576 <Field float ln.w>
	//    3    7:fload_1         
	//    4    8:fdiv            
	//    5    9:fstore_1        
		O.d(f1);
	//    6   10:aload_0         
	//    7   11:getfield        #159 <Field oa O>
	//    8   14:fload_1         
	//    9   15:invokevirtual   #725 <Method void oa.d(float)>
	//   10   18:return          
	}

	public void setVisibleYRange(float f1, float f2, lp.b b1)
	{
		f1 = d(b1) / f1;
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokevirtual   #728 <Method float d(lp$b)>
	//    3    5:fload_1         
	//    4    6:fdiv            
	//    5    7:fstore_1        
		f2 = d(b1) / f2;
	//    6    8:aload_0         
	//    7    9:aload_3         
	//    8   10:invokevirtual   #728 <Method float d(lp$b)>
	//    9   13:fload_2         
	//   10   14:fdiv            
	//   11   15:fstore_2        
		O.b(f1, f2);
	//   12   16:aload_0         
	//   13   17:getfield        #159 <Field oa O>
	//   14   20:fload_1         
	//   15   21:fload_2         
	//   16   22:invokevirtual   #729 <Method void oa.b(float, float)>
	//   17   25:return          
	}

	public void setVisibleYRangeMaximum(float f1, lp.b b1)
	{
		f1 = d(b1) / f1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #728 <Method float d(lp$b)>
	//    3    5:fload_1         
	//    4    6:fdiv            
	//    5    7:fstore_1        
		O.b(f1);
	//    6    8:aload_0         
	//    7    9:getfield        #159 <Field oa O>
	//    8   12:fload_1         
	//    9   13:invokevirtual   #708 <Method void oa.b(float)>
	//   10   16:return          
	}

	public void setVisibleYRangeMinimum(float f1, lp.b b1)
	{
		f1 = d(b1) / f1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #728 <Method float d(lp$b)>
	//    3    5:fload_1         
	//    4    6:fdiv            
	//    5    7:fstore_1        
		O.a(f1);
	//    6    8:aload_0         
	//    7    9:getfield        #159 <Field oa O>
	//    8   12:fload_1         
	//    9   13:invokevirtual   #734 <Method void oa.a(float)>
	//   10   16:return          
	}

	public void setXAxisRenderer(nu nu1)
	{
		x = nu1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #186 <Field nu x>
	//    3    5:return          
	}

	public boolean t()
	{
		return O.r();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field oa O>
	//    2    4:invokevirtual   #738 <Method boolean oa.r()>
	//    3    7:ireturn         
	}

	public boolean u()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field boolean p>
	//    2    4:ireturn         
	}

	public boolean v()
	{
		if(l.E())
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field lp l>
	//*   2    4:invokevirtual   #281 <Method boolean lp.E()>
	//*   3    7:ifeq            12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		return r.E();
	//    6   12:aload_0         
	//    7   13:getfield        #153 <Field lp r>
	//    8   16:invokevirtual   #281 <Method boolean lp.E()>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public boolean y()
	{
		return O.v();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field oa O>
	//    2    4:invokevirtual   #740 <Method boolean oa.v()>
	//    3    7:ireturn         
	}

	protected nw B;
	protected float C[];
	private boolean a;
	private boolean aa;
	private boolean ab;
	private boolean ac;
	private long ad;
	private RectF ae;
	private long af;
	private boolean ag;
	protected boolean b;
	protected int c;
	protected boolean d;
	protected boolean e;
	protected Paint f;
	protected boolean g;
	protected boolean h;
	protected boolean i;
	protected Paint k;
	protected lp l;
	protected boolean m;
	protected nc n;
	protected float o;
	protected boolean p;
	protected nv q;
	protected lp r;
	protected nt s;
	protected nt t;
	protected nv u;
	protected nw v;
	protected Matrix w;
	protected nu x;
	protected Matrix y;
	protected float z[];
}
