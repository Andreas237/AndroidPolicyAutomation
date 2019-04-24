// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.data.Entry;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package o:
//			nn, na, mj, la, 
//			oa, mu, lx, nv, 
//			mh, nw, nz, oc

public class nm extends nn
{
	class b
	{

		protected void d(na na1, boolean flag, boolean flag1)
		{
			int j = na1.N();
		//    0    0:aload_1         
		//    1    1:invokeinterface #37  <Method int na.N()>
		//    2    6:istore          7
			float f = na1.e();
		//    3    8:aload_1         
		//    4    9:invokeinterface #40  <Method float na.e()>
		//    5   14:fstore          4
			float f1 = na1.b();
		//    6   16:aload_1         
		//    7   17:invokeinterface #42  <Method float na.b()>
		//    8   22:fstore          5
			for(int i = 0; i < j; i++)
		//*   9   24:iconst_0        
		//*  10   25:istore          6
		//*  11   27:iload           6
		//*  12   29:iload           7
		//*  13   31:icmpge          211
			{
				Object obj = ((Object) (android.graphics.Bitmap.Config.ARGB_4444));
		//   14   34:getstatic       #48  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_4444>
		//   15   37:astore          8
				obj = ((Object) (Bitmap.createBitmap((int)((double)f * 2.1000000000000001D), (int)((double)f * 2.1000000000000001D), ((android.graphics.Bitmap.Config) (obj)))));
		//   16   39:fload           4
		//   17   41:f2d             
		//   18   42:ldc2w           #49  <Double 2.1000000000000001D>
		//   19   45:dmul            
		//   20   46:d2i             
		//   21   47:fload           4
		//   22   49:f2d             
		//   23   50:ldc2w           #49  <Double 2.1000000000000001D>
		//   24   53:dmul            
		//   25   54:d2i             
		//   26   55:aload           8
		//   27   57:invokestatic    #56  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
		//   28   60:astore          8
				Canvas canvas = new Canvas(((Bitmap) (obj)));
		//   29   62:new             #58  <Class Canvas>
		//   30   65:dup             
		//   31   66:aload           8
		//   32   68:invokespecial   #61  <Method void Canvas(Bitmap)>
		//   33   71:astore          9
				e[i] = ((Bitmap) (obj));
		//   34   73:aload_0         
		//   35   74:getfield        #63  <Field Bitmap[] e>
		//   36   77:iload           6
		//   37   79:aload           8
		//   38   81:aastore         
				a.h.setColor(na1.k(i));
		//   39   82:aload_0         
		//   40   83:getfield        #17  <Field nm a>
		//   41   86:getfield        #67  <Field Paint nm.h>
		//   42   89:aload_1         
		//   43   90:iload           6
		//   44   92:invokeinterface #71  <Method int na.k(int)>
		//   45   97:invokevirtual   #77  <Method void Paint.setColor(int)>
				if(flag1)
		//*  46  100:iload_3         
		//*  47  101:ifeq            162
				{
					c.reset();
		//   48  104:aload_0         
		//   49  105:getfield        #25  <Field Path c>
		//   50  108:invokevirtual   #80  <Method void Path.reset()>
					c.addCircle(f, f, f, android.graphics.Path.Direction.CW);
		//   51  111:aload_0         
		//   52  112:getfield        #25  <Field Path c>
		//   53  115:fload           4
		//   54  117:fload           4
		//   55  119:fload           4
		//   56  121:getstatic       #86  <Field android.graphics.Path$Direction android.graphics.Path$Direction.CW>
		//   57  124:invokevirtual   #90  <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
					c.addCircle(f, f, f1, android.graphics.Path.Direction.CCW);
		//   58  127:aload_0         
		//   59  128:getfield        #25  <Field Path c>
		//   60  131:fload           4
		//   61  133:fload           4
		//   62  135:fload           5
		//   63  137:getstatic       #93  <Field android.graphics.Path$Direction android.graphics.Path$Direction.CCW>
		//   64  140:invokevirtual   #90  <Method void Path.addCircle(float, float, float, android.graphics.Path$Direction)>
					canvas.drawPath(c, a.h);
		//   65  143:aload           9
		//   66  145:aload_0         
		//   67  146:getfield        #25  <Field Path c>
		//   68  149:aload_0         
		//   69  150:getfield        #17  <Field nm a>
		//   70  153:getfield        #67  <Field Paint nm.h>
		//   71  156:invokevirtual   #97  <Method void Canvas.drawPath(Path, Paint)>
					continue;
		//   72  159:goto            202
				}
				canvas.drawCircle(f, f, f, a.h);
		//   73  162:aload           9
		//   74  164:fload           4
		//   75  166:fload           4
		//   76  168:fload           4
		//   77  170:aload_0         
		//   78  171:getfield        #17  <Field nm a>
		//   79  174:getfield        #67  <Field Paint nm.h>
		//   80  177:invokevirtual   #101 <Method void Canvas.drawCircle(float, float, float, Paint)>
				if(flag)
		//*  81  180:iload_2         
		//*  82  181:ifeq            202
					canvas.drawCircle(f, f, f1, a.b);
		//   83  184:aload           9
		//   84  186:fload           4
		//   85  188:fload           4
		//   86  190:fload           5
		//   87  192:aload_0         
		//   88  193:getfield        #17  <Field nm a>
		//   89  196:getfield        #103 <Field Paint nm.b>
		//   90  199:invokevirtual   #101 <Method void Canvas.drawCircle(float, float, float, Paint)>
			}

		//   91  202:iload           6
		//   92  204:iconst_1        
		//   93  205:iadd            
		//   94  206:istore          6
		//*  95  208:goto            27
		//   96  211:return          
		}

		protected boolean d(na na1)
		{
			int i = na1.N();
		//    0    0:aload_1         
		//    1    1:invokeinterface #37  <Method int na.N()>
		//    2    6:istore_2        
			boolean flag = false;
		//    3    7:iconst_0        
		//    4    8:istore_3        
			if(e == null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #63  <Field Bitmap[] e>
		//*   7   13:ifnonnull       26
			{
				e = new Bitmap[i];
		//    8   16:aload_0         
		//    9   17:iload_2         
		//   10   18:anewarray       Bitmap[]
		//   11   21:putfield        #63  <Field Bitmap[] e>
				return true;
		//   12   24:iconst_1        
		//   13   25:ireturn         
			}
			if(e.length != i)
		//*  14   26:aload_0         
		//*  15   27:getfield        #63  <Field Bitmap[] e>
		//*  16   30:arraylength     
		//*  17   31:iload_2         
		//*  18   32:icmpeq          45
			{
				e = new Bitmap[i];
		//   19   35:aload_0         
		//   20   36:iload_2         
		//   21   37:anewarray       Bitmap[]
		//   22   40:putfield        #63  <Field Bitmap[] e>
				flag = true;
		//   23   43:iconst_1        
		//   24   44:istore_3        
			}
			return flag;
		//   25   45:iload_3         
		//   26   46:ireturn         
		}

		protected Bitmap e(int i)
		{
			return e[i % e.length];
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field Bitmap[] e>
		//    2    4:iload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #63  <Field Bitmap[] e>
		//    5    9:arraylength     
		//    6   10:irem            
		//    7   11:aaload          
		//    8   12:areturn         
		}

		final nm a;
		private Path c;
		private Bitmap e[];

		private b()
		{
			a = nm.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field nm a>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			c = new Path();
		//    5    9:aload_0         
		//    6   10:new             #22  <Class Path>
		//    7   13:dup             
		//    8   14:invokespecial   #23  <Method void Path()>
		//    9   17:putfield        #25  <Field Path c>
		//   10   20:return          
		}

	}


	public nm(mu mu1, la la1, oa oa1)
	{
		super(la1, oa1);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokespecial   #34  <Method void nn(la, oa)>
		d = android.graphics.Bitmap.Config.ARGB_8888;
	//    4    6:aload_0         
	//    5    7:getstatic       #39  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//    6   10:putfield        #41  <Field android.graphics.Bitmap$Config d>
		p = new Path();
	//    7   13:aload_0         
	//    8   14:new             #43  <Class Path>
	//    9   17:dup             
	//   10   18:invokespecial   #46  <Method void Path()>
	//   11   21:putfield        #48  <Field Path p>
		o = new Path();
	//   12   24:aload_0         
	//   13   25:new             #43  <Class Path>
	//   14   28:dup             
	//   15   29:invokespecial   #46  <Method void Path()>
	//   16   32:putfield        #50  <Field Path o>
		q = new float[4];
	//   17   35:aload_0         
	//   18   36:iconst_4        
	//   19   37:newarray        float[]
	//   20   39:putfield        #52  <Field float[] q>
		m = new Path();
	//   21   42:aload_0         
	//   22   43:new             #43  <Class Path>
	//   23   46:dup             
	//   24   47:invokespecial   #46  <Method void Path()>
	//   25   50:putfield        #54  <Field Path m>
		u = new HashMap();
	//   26   53:aload_0         
	//   27   54:new             #56  <Class HashMap>
	//   28   57:dup             
	//   29   58:invokespecial   #57  <Method void HashMap()>
	//   30   61:putfield        #59  <Field HashMap u>
		r = new float[2];
	//   31   64:aload_0         
	//   32   65:iconst_2        
	//   33   66:newarray        float[]
	//   34   68:putfield        #61  <Field float[] r>
		c = mu1;
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:putfield        #63  <Field mu c>
		b = new Paint(1);
	//   38   76:aload_0         
	//   39   77:new             #65  <Class Paint>
	//   40   80:dup             
	//   41   81:iconst_1        
	//   42   82:invokespecial   #68  <Method void Paint(int)>
	//   43   85:putfield        #70  <Field Paint b>
		b.setStyle(android.graphics.Paint.Style.FILL);
	//   44   88:aload_0         
	//   45   89:getfield        #70  <Field Paint b>
	//   46   92:getstatic       #76  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   47   95:invokevirtual   #80  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		b.setColor(-1);
	//   48   98:aload_0         
	//   49   99:getfield        #70  <Field Paint b>
	//   50  102:iconst_m1       
	//   51  103:invokevirtual   #83  <Method void Paint.setColor(int)>
	//   52  106:return          
	}

	private void c(na na1, int i, int j, Path path)
	{
		float f = na1.R().e(na1, c);
	//    0    0:aload_1         
	//    1    1:invokeinterface #91  <Method mj na.R()>
	//    2    6:aload_1         
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field mu c>
	//    5   11:invokeinterface #96  <Method float mj.e(na, mu)>
	//    6   16:fstore          5
		float f1 = this.i.d();
	//    7   18:aload_0         
	//    8   19:getfield        #100 <Field la i>
	//    9   22:invokevirtual   #105 <Method float la.d()>
	//   10   25:fstore          6
		boolean flag;
		if(na1.a() == ly.c.c)
	//*  11   27:aload_1         
	//*  12   28:invokeinterface #108 <Method ly$c na.a()>
	//*  13   33:getstatic       #113 <Field ly$c ly$c.c>
	//*  14   36:if_acmpne       45
			flag = true;
	//   15   39:iconst_1        
	//   16   40:istore          7
		else
	//*  17   42:goto            48
			flag = false;
	//   18   45:iconst_0        
	//   19   46:istore          7
		path.reset();
	//   20   48:aload           4
	//   21   50:invokevirtual   #116 <Method void Path.reset()>
		Entry entry = na1.f(i);
	//   22   53:aload_1         
	//   23   54:iload_2         
	//   24   55:invokeinterface #120 <Method Entry na.f(int)>
	//   25   60:astore          8
		path.moveTo(entry.getX(), f);
	//   26   62:aload           4
	//   27   64:aload           8
	//   28   66:invokevirtual   #125 <Method float Entry.getX()>
	//   29   69:fload           5
	//   30   71:invokevirtual   #129 <Method void Path.moveTo(float, float)>
		path.lineTo(entry.getX(), entry.getY() * f1);
	//   31   74:aload           4
	//   32   76:aload           8
	//   33   78:invokevirtual   #125 <Method float Entry.getX()>
	//   34   81:aload           8
	//   35   83:invokevirtual   #132 <Method float Entry.getY()>
	//   36   86:fload           6
	//   37   88:fmul            
	//   38   89:invokevirtual   #135 <Method void Path.lineTo(float, float)>
		Entry entry1 = null;
	//   39   92:aconst_null     
	//   40   93:astore          9
		entry = null;
	//   41   95:aconst_null     
	//   42   96:astore          8
		for(i++; i <= j; i++)
	//*  43   98:iload_2         
	//*  44   99:iconst_1        
	//*  45  100:iadd            
	//*  46  101:istore_2        
	//*  47  102:iload_2         
	//*  48  103:iload_3         
	//*  49  104:icmpgt          173
		{
			entry1 = na1.f(i);
	//   50  107:aload_1         
	//   51  108:iload_2         
	//   52  109:invokeinterface #120 <Method Entry na.f(int)>
	//   53  114:astore          9
			if(flag && entry != null)
	//*  54  116:iload           7
	//*  55  118:ifeq            144
	//*  56  121:aload           8
	//*  57  123:ifnull          144
				path.lineTo(entry1.getX(), entry.getY() * f1);
	//   58  126:aload           4
	//   59  128:aload           9
	//   60  130:invokevirtual   #125 <Method float Entry.getX()>
	//   61  133:aload           8
	//   62  135:invokevirtual   #132 <Method float Entry.getY()>
	//   63  138:fload           6
	//   64  140:fmul            
	//   65  141:invokevirtual   #135 <Method void Path.lineTo(float, float)>
			path.lineTo(entry1.getX(), entry1.getY() * f1);
	//   66  144:aload           4
	//   67  146:aload           9
	//   68  148:invokevirtual   #125 <Method float Entry.getX()>
	//   69  151:aload           9
	//   70  153:invokevirtual   #132 <Method float Entry.getY()>
	//   71  156:fload           6
	//   72  158:fmul            
	//   73  159:invokevirtual   #135 <Method void Path.lineTo(float, float)>
			entry = entry1;
	//   74  162:aload           9
	//   75  164:astore          8
		}

	//   76  166:iload_2         
	//   77  167:iconst_1        
	//   78  168:iadd            
	//   79  169:istore_2        
	//*  80  170:goto            102
		if(entry1 != null)
	//*  81  173:aload           9
	//*  82  175:ifnull          190
			path.lineTo(entry1.getX(), f);
	//   83  178:aload           4
	//   84  180:aload           9
	//   85  182:invokevirtual   #125 <Method float Entry.getX()>
	//   86  185:fload           5
	//   87  187:invokevirtual   #135 <Method void Path.lineTo(float, float)>
		path.close();
	//   88  190:aload           4
	//   89  192:invokevirtual   #138 <Method void Path.close()>
	//   90  195:return          
	}

	public void a(Canvas canvas)
	{
		int i = (int)l.o();
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field oa l>
	//    2    4:invokevirtual   #147 <Method float oa.o()>
	//    3    7:f2i             
	//    4    8:istore_2        
		int j = (int)l.n();
	//    5    9:aload_0         
	//    6   10:getfield        #143 <Field oa l>
	//    7   13:invokevirtual   #150 <Method float oa.n()>
	//    8   16:f2i             
	//    9   17:istore_3        
		if(e == null || ((Bitmap)e.get()).getWidth() != i || ((Bitmap)e.get()).getHeight() != j)
	//*  10   18:aload_0         
	//*  11   19:getfield        #152 <Field WeakReference e>
	//*  12   22:ifnull          59
	//*  13   25:aload_0         
	//*  14   26:getfield        #152 <Field WeakReference e>
	//*  15   29:invokevirtual   #158 <Method Object WeakReference.get()>
	//*  16   32:checkcast       #160 <Class Bitmap>
	//*  17   35:invokevirtual   #164 <Method int Bitmap.getWidth()>
	//*  18   38:iload_2         
	//*  19   39:icmpne          59
	//*  20   42:aload_0         
	//*  21   43:getfield        #152 <Field WeakReference e>
	//*  22   46:invokevirtual   #158 <Method Object WeakReference.get()>
	//*  23   49:checkcast       #160 <Class Bitmap>
	//*  24   52:invokevirtual   #167 <Method int Bitmap.getHeight()>
	//*  25   55:iload_3         
	//*  26   56:icmpeq          112
			if(i > 0 && j > 0)
	//*  27   59:iload_2         
	//*  28   60:ifle            111
	//*  29   63:iload_3         
	//*  30   64:ifle            111
			{
				e = new WeakReference(((Object) (Bitmap.createBitmap(i, j, d))));
	//   31   67:aload_0         
	//   32   68:new             #154 <Class WeakReference>
	//   33   71:dup             
	//   34   72:iload_2         
	//   35   73:iload_3         
	//   36   74:aload_0         
	//   37   75:getfield        #41  <Field android.graphics.Bitmap$Config d>
	//   38   78:invokestatic    #171 <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   39   81:invokespecial   #174 <Method void WeakReference(Object)>
	//   40   84:putfield        #152 <Field WeakReference e>
				a = new Canvas((Bitmap)e.get());
	//   41   87:aload_0         
	//   42   88:new             #176 <Class Canvas>
	//   43   91:dup             
	//   44   92:aload_0         
	//   45   93:getfield        #152 <Field WeakReference e>
	//   46   96:invokevirtual   #158 <Method Object WeakReference.get()>
	//   47   99:checkcast       #160 <Class Bitmap>
	//   48  102:invokespecial   #179 <Method void Canvas(Bitmap)>
	//   49  105:putfield        #181 <Field Canvas a>
			} else
	//*  50  108:goto            112
			{
				return;
	//   51  111:return          
			}
		((Bitmap)e.get()).eraseColor(0);
	//   52  112:aload_0         
	//   53  113:getfield        #152 <Field WeakReference e>
	//   54  116:invokevirtual   #158 <Method Object WeakReference.get()>
	//   55  119:checkcast       #160 <Class Bitmap>
	//   56  122:iconst_0        
	//   57  123:invokevirtual   #184 <Method void Bitmap.eraseColor(int)>
		Iterator iterator = c.getLineData().h().iterator();
	//   58  126:aload_0         
	//   59  127:getfield        #63  <Field mu c>
	//   60  130:invokeinterface #190 <Method lx mu.getLineData()>
	//   61  135:invokevirtual   #196 <Method List lx.h()>
	//   62  138:invokeinterface #202 <Method Iterator List.iterator()>
	//   63  143:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   64  145:aload           4
	//   65  147:invokeinterface #208 <Method boolean Iterator.hasNext()>
	//   66  152:ifeq            187
			na na1 = (na)iterator.next();
	//   67  155:aload           4
	//   68  157:invokeinterface #211 <Method Object Iterator.next()>
	//   69  162:checkcast       #87  <Class na>
	//   70  165:astore          5
			if(na1.j())
	//*  71  167:aload           5
	//*  72  169:invokeinterface #214 <Method boolean na.j()>
	//*  73  174:ifeq            184
				c(canvas, na1);
	//   74  177:aload_0         
	//   75  178:aload_1         
	//   76  179:aload           5
	//   77  181:invokevirtual   #217 <Method void c(Canvas, na)>
		} while(true);
	//   78  184:goto            145
		canvas.drawBitmap((Bitmap)e.get(), 0.0F, 0.0F, h);
	//   79  187:aload_1         
	//   80  188:aload_0         
	//   81  189:getfield        #152 <Field WeakReference e>
	//   82  192:invokevirtual   #158 <Method Object WeakReference.get()>
	//   83  195:checkcast       #160 <Class Bitmap>
	//   84  198:fconst_0        
	//   85  199:fconst_0        
	//   86  200:aload_0         
	//   87  201:getfield        #219 <Field Paint h>
	//   88  204:invokevirtual   #223 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
	//   89  207:return          
	}

	protected void a(Canvas canvas, na na1)
	{
		int j = na1.C();
	//    0    0:aload_2         
	//    1    1:invokeinterface #226 <Method int na.C()>
	//    2    6:istore          5
		boolean flag = na1.L();
	//    3    8:aload_2         
	//    4    9:invokeinterface #229 <Method boolean na.L()>
	//    5   14:istore          9
		int i;
		if(flag)
	//*   6   16:iload           9
	//*   7   18:ifeq            27
			i = 4;
	//    8   21:iconst_4        
	//    9   22:istore          4
		else
	//*  10   24:goto            30
			i = 2;
	//   11   27:iconst_2        
	//   12   28:istore          4
		nv nv1 = c.b(na1.D());
	//   13   30:aload_0         
	//   14   31:getfield        #63  <Field mu c>
	//   15   34:aload_2         
	//   16   35:invokeinterface #233 <Method lp$b na.D()>
	//   17   40:invokeinterface #236 <Method nv mu.b(lp$b)>
	//   18   45:astore          11
		float f = this.i.d();
	//   19   47:aload_0         
	//   20   48:getfield        #100 <Field la i>
	//   21   51:invokevirtual   #105 <Method float la.d()>
	//   22   54:fstore_3        
		h.setStyle(android.graphics.Paint.Style.STROKE);
	//   23   55:aload_0         
	//   24   56:getfield        #219 <Field Paint h>
	//   25   59:getstatic       #239 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   26   62:invokevirtual   #80  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		Canvas canvas1;
		if(na1.g())
	//*  27   65:aload_2         
	//*  28   66:invokeinterface #242 <Method boolean na.g()>
	//*  29   71:ifeq            83
			canvas1 = a;
	//   30   74:aload_0         
	//   31   75:getfield        #181 <Field Canvas a>
	//   32   78:astore          10
		else
	//*  33   80:goto            86
			canvas1 = canvas;
	//   34   83:aload_1         
	//   35   84:astore          10
		this.f.b(((mn) (c)), ((mv) (na1)));
	//   36   86:aload_0         
	//   37   87:getfield        #245 <Field nk$d f>
	//   38   90:aload_0         
	//   39   91:getfield        #63  <Field mu c>
	//   40   94:aload_2         
	//   41   95:invokevirtual   #250 <Method void nk$d.b(mn, mv)>
		if(na1.V() && j > 0)
	//*  42   98:aload_2         
	//*  43   99:invokeinterface #253 <Method boolean na.V()>
	//*  44  104:ifeq            124
	//*  45  107:iload           5
	//*  46  109:ifle            124
			a(canvas, na1, nv1, this.f);
	//   47  112:aload_0         
	//   48  113:aload_1         
	//   49  114:aload_2         
	//   50  115:aload           11
	//   51  117:aload_0         
	//   52  118:getfield        #245 <Field nk$d f>
	//   53  121:invokevirtual   #256 <Method void a(Canvas, na, nv, nk$d)>
		if(na1.k().size() > 1)
	//*  54  124:aload_2         
	//*  55  125:invokeinterface #259 <Method List na.k()>
	//*  56  130:invokeinterface #262 <Method int List.size()>
	//*  57  135:iconst_1        
	//*  58  136:icmple          509
		{
			if(q.length <= i * 2)
	//*  59  139:aload_0         
	//*  60  140:getfield        #52  <Field float[] q>
	//*  61  143:arraylength     
	//*  62  144:iload           4
	//*  63  146:iconst_2        
	//*  64  147:imul            
	//*  65  148:icmpgt          161
				q = new float[i * 4];
	//   66  151:aload_0         
	//   67  152:iload           4
	//   68  154:iconst_4        
	//   69  155:imul            
	//   70  156:newarray        float[]
	//   71  158:putfield        #52  <Field float[] q>
			j = this.f.c;
	//   72  161:aload_0         
	//   73  162:getfield        #245 <Field nk$d f>
	//   74  165:getfield        #265 <Field int nk$d.c>
	//   75  168:istore          5
			do
			{
				if(j > this.f.a + this.f.c)
					break;
	//   76  170:iload           5
	//   77  172:aload_0         
	//   78  173:getfield        #245 <Field nk$d f>
	//   79  176:getfield        #267 <Field int nk$d.a>
	//   80  179:aload_0         
	//   81  180:getfield        #245 <Field nk$d f>
	//   82  183:getfield        #265 <Field int nk$d.c>
	//   83  186:iadd            
	//   84  187:icmpgt          506
				canvas = ((Canvas) (na1.f(j)));
	//   85  190:aload_2         
	//   86  191:iload           5
	//   87  193:invokeinterface #120 <Method Entry na.f(int)>
	//   88  198:astore_1        
				if(canvas != null)
	//*  89  199:aload_1         
	//*  90  200:ifnonnull       206
	//*  91  203:goto            497
				{
					q[0] = ((Entry) (canvas)).getX();
	//   92  206:aload_0         
	//   93  207:getfield        #52  <Field float[] q>
	//   94  210:iconst_0        
	//   95  211:aload_1         
	//   96  212:invokevirtual   #125 <Method float Entry.getX()>
	//   97  215:fastore         
					q[1] = ((Entry) (canvas)).getY() * f;
	//   98  216:aload_0         
	//   99  217:getfield        #52  <Field float[] q>
	//  100  220:iconst_1        
	//  101  221:aload_1         
	//  102  222:invokevirtual   #132 <Method float Entry.getY()>
	//  103  225:fload_3         
	//  104  226:fmul            
	//  105  227:fastore         
					if(j < this.f.d)
	//* 106  228:iload           5
	//* 107  230:aload_0         
	//* 108  231:getfield        #245 <Field nk$d f>
	//* 109  234:getfield        #269 <Field int nk$d.d>
	//* 110  237:icmpge          361
					{
						canvas = ((Canvas) (na1.f(j + 1)));
	//  111  240:aload_2         
	//  112  241:iload           5
	//  113  243:iconst_1        
	//  114  244:iadd            
	//  115  245:invokeinterface #120 <Method Entry na.f(int)>
	//  116  250:astore_1        
						if(canvas == null)
	//* 117  251:aload_1         
	//* 118  252:ifnonnull       258
							break;
	//  119  255:goto            506
						if(flag)
	//* 120  258:iload           9
	//* 121  260:ifeq            336
						{
							q[2] = ((Entry) (canvas)).getX();
	//  122  263:aload_0         
	//  123  264:getfield        #52  <Field float[] q>
	//  124  267:iconst_2        
	//  125  268:aload_1         
	//  126  269:invokevirtual   #125 <Method float Entry.getX()>
	//  127  272:fastore         
							q[3] = q[1];
	//  128  273:aload_0         
	//  129  274:getfield        #52  <Field float[] q>
	//  130  277:iconst_3        
	//  131  278:aload_0         
	//  132  279:getfield        #52  <Field float[] q>
	//  133  282:iconst_1        
	//  134  283:faload          
	//  135  284:fastore         
							q[4] = q[2];
	//  136  285:aload_0         
	//  137  286:getfield        #52  <Field float[] q>
	//  138  289:iconst_4        
	//  139  290:aload_0         
	//  140  291:getfield        #52  <Field float[] q>
	//  141  294:iconst_2        
	//  142  295:faload          
	//  143  296:fastore         
							q[5] = q[3];
	//  144  297:aload_0         
	//  145  298:getfield        #52  <Field float[] q>
	//  146  301:iconst_5        
	//  147  302:aload_0         
	//  148  303:getfield        #52  <Field float[] q>
	//  149  306:iconst_3        
	//  150  307:faload          
	//  151  308:fastore         
							q[6] = ((Entry) (canvas)).getX();
	//  152  309:aload_0         
	//  153  310:getfield        #52  <Field float[] q>
	//  154  313:bipush          6
	//  155  315:aload_1         
	//  156  316:invokevirtual   #125 <Method float Entry.getX()>
	//  157  319:fastore         
							q[7] = ((Entry) (canvas)).getY() * f;
	//  158  320:aload_0         
	//  159  321:getfield        #52  <Field float[] q>
	//  160  324:bipush          7
	//  161  326:aload_1         
	//  162  327:invokevirtual   #132 <Method float Entry.getY()>
	//  163  330:fload_3         
	//  164  331:fmul            
	//  165  332:fastore         
						} else
	//* 166  333:goto            385
						{
							q[2] = ((Entry) (canvas)).getX();
	//  167  336:aload_0         
	//  168  337:getfield        #52  <Field float[] q>
	//  169  340:iconst_2        
	//  170  341:aload_1         
	//  171  342:invokevirtual   #125 <Method float Entry.getX()>
	//  172  345:fastore         
							q[3] = ((Entry) (canvas)).getY() * f;
	//  173  346:aload_0         
	//  174  347:getfield        #52  <Field float[] q>
	//  175  350:iconst_3        
	//  176  351:aload_1         
	//  177  352:invokevirtual   #132 <Method float Entry.getY()>
	//  178  355:fload_3         
	//  179  356:fmul            
	//  180  357:fastore         
						}
					} else
	//* 181  358:goto            385
					{
						q[2] = q[0];
	//  182  361:aload_0         
	//  183  362:getfield        #52  <Field float[] q>
	//  184  365:iconst_2        
	//  185  366:aload_0         
	//  186  367:getfield        #52  <Field float[] q>
	//  187  370:iconst_0        
	//  188  371:faload          
	//  189  372:fastore         
						q[3] = q[1];
	//  190  373:aload_0         
	//  191  374:getfield        #52  <Field float[] q>
	//  192  377:iconst_3        
	//  193  378:aload_0         
	//  194  379:getfield        #52  <Field float[] q>
	//  195  382:iconst_1        
	//  196  383:faload          
	//  197  384:fastore         
					}
					nv1.e(q);
	//  198  385:aload           11
	//  199  387:aload_0         
	//  200  388:getfield        #52  <Field float[] q>
	//  201  391:invokevirtual   #274 <Method void nv.e(float[])>
					if(!this.l.k(q[0]))
	//* 202  394:aload_0         
	//* 203  395:getfield        #143 <Field oa l>
	//* 204  398:aload_0         
	//* 205  399:getfield        #52  <Field float[] q>
	//* 206  402:iconst_0        
	//* 207  403:faload          
	//* 208  404:invokevirtual   #277 <Method boolean oa.k(float)>
	//* 209  407:ifne            413
						break;
	//  210  410:goto            506
					if(this.l.i(q[2]) && (this.l.f(q[1]) || this.l.h(q[3])))
	//* 211  413:aload_0         
	//* 212  414:getfield        #143 <Field oa l>
	//* 213  417:aload_0         
	//* 214  418:getfield        #52  <Field float[] q>
	//* 215  421:iconst_2        
	//* 216  422:faload          
	//* 217  423:invokevirtual   #279 <Method boolean oa.i(float)>
	//* 218  426:ifeq            497
	//* 219  429:aload_0         
	//* 220  430:getfield        #143 <Field oa l>
	//* 221  433:aload_0         
	//* 222  434:getfield        #52  <Field float[] q>
	//* 223  437:iconst_1        
	//* 224  438:faload          
	//* 225  439:invokevirtual   #281 <Method boolean oa.f(float)>
	//* 226  442:ifne            464
	//* 227  445:aload_0         
	//* 228  446:getfield        #143 <Field oa l>
	//* 229  449:aload_0         
	//* 230  450:getfield        #52  <Field float[] q>
	//* 231  453:iconst_3        
	//* 232  454:faload          
	//* 233  455:invokevirtual   #283 <Method boolean oa.h(float)>
	//* 234  458:ifne            464
	//* 235  461:goto            497
					{
						h.setColor(na1.e(j));
	//  236  464:aload_0         
	//  237  465:getfield        #219 <Field Paint h>
	//  238  468:aload_2         
	//  239  469:iload           5
	//  240  471:invokeinterface #286 <Method int na.e(int)>
	//  241  476:invokevirtual   #83  <Method void Paint.setColor(int)>
						canvas1.drawLines(q, 0, i * 2, h);
	//  242  479:aload           10
	//  243  481:aload_0         
	//  244  482:getfield        #52  <Field float[] q>
	//  245  485:iconst_0        
	//  246  486:iload           4
	//  247  488:iconst_2        
	//  248  489:imul            
	//  249  490:aload_0         
	//  250  491:getfield        #219 <Field Paint h>
	//  251  494:invokevirtual   #290 <Method void Canvas.drawLines(float[], int, int, Paint)>
					}
				}
				j++;
	//  252  497:iload           5
	//  253  499:iconst_1        
	//  254  500:iadd            
	//  255  501:istore          5
			} while(true);
	//  256  503:goto            170
		} else
	//* 257  506:goto            917
		{
			if(q.length < Math.max(j * i, i) * 2)
	//* 258  509:aload_0         
	//* 259  510:getfield        #52  <Field float[] q>
	//* 260  513:arraylength     
	//* 261  514:iload           5
	//* 262  516:iload           4
	//* 263  518:imul            
	//* 264  519:iload           4
	//* 265  521:invokestatic    #296 <Method int Math.max(int, int)>
	//* 266  524:iconst_2        
	//* 267  525:imul            
	//* 268  526:icmpge          547
				q = new float[Math.max(j * i, i) * 4];
	//  269  529:aload_0         
	//  270  530:iload           5
	//  271  532:iload           4
	//  272  534:imul            
	//  273  535:iload           4
	//  274  537:invokestatic    #296 <Method int Math.max(int, int)>
	//  275  540:iconst_4        
	//  276  541:imul            
	//  277  542:newarray        float[]
	//  278  544:putfield        #52  <Field float[] q>
			if(na1.f(this.f.c) != null)
	//* 279  547:aload_2         
	//* 280  548:aload_0         
	//* 281  549:getfield        #245 <Field nk$d f>
	//* 282  552:getfield        #265 <Field int nk$d.c>
	//* 283  555:invokeinterface #120 <Method Entry na.f(int)>
	//* 284  560:ifnull          917
			{
				int l = 0;
	//  285  563:iconst_0        
	//  286  564:istore          6
				for(int k = this.f.c; k <= this.f.a + this.f.c;)
	//* 287  566:aload_0         
	//* 288  567:getfield        #245 <Field nk$d f>
	//* 289  570:getfield        #265 <Field int nk$d.c>
	//* 290  573:istore          5
	//* 291  575:iload           5
	//* 292  577:aload_0         
	//* 293  578:getfield        #245 <Field nk$d f>
	//* 294  581:getfield        #267 <Field int nk$d.a>
	//* 295  584:aload_0         
	//* 296  585:getfield        #245 <Field nk$d f>
	//* 297  588:getfield        #265 <Field int nk$d.c>
	//* 298  591:iadd            
	//* 299  592:icmpgt          853
				{
					int i1;
					if(k == 0)
	//* 300  595:iload           5
	//* 301  597:ifne            606
						i1 = 0;
	//  302  600:iconst_0        
	//  303  601:istore          7
					else
	//* 304  603:goto            612
						i1 = k - 1;
	//  305  606:iload           5
	//  306  608:iconst_1        
	//  307  609:isub            
	//  308  610:istore          7
					Entry entry = na1.f(i1);
	//  309  612:aload_2         
	//  310  613:iload           7
	//  311  615:invokeinterface #120 <Method Entry na.f(int)>
	//  312  620:astore          12
					canvas = ((Canvas) (na1.f(k)));
	//  313  622:aload_2         
	//  314  623:iload           5
	//  315  625:invokeinterface #120 <Method Entry na.f(int)>
	//  316  630:astore_1        
					i1 = l;
	//  317  631:iload           6
	//  318  633:istore          7
					if(entry != null)
	//* 319  635:aload           12
	//* 320  637:ifnull          840
						if(canvas == null)
	//* 321  640:aload_1         
	//* 322  641:ifnonnull       651
						{
							i1 = l;
	//  323  644:iload           6
	//  324  646:istore          7
						} else
	//* 325  648:goto            840
						{
							float af1[] = q;
	//  326  651:aload_0         
	//  327  652:getfield        #52  <Field float[] q>
	//  328  655:astore          13
							int j1 = l + 1;
	//  329  657:iload           6
	//  330  659:iconst_1        
	//  331  660:iadd            
	//  332  661:istore          8
							af1[l] = entry.getX();
	//  333  663:aload           13
	//  334  665:iload           6
	//  335  667:aload           12
	//  336  669:invokevirtual   #125 <Method float Entry.getX()>
	//  337  672:fastore         
							af1 = q;
	//  338  673:aload_0         
	//  339  674:getfield        #52  <Field float[] q>
	//  340  677:astore          13
							i1 = j1 + 1;
	//  341  679:iload           8
	//  342  681:iconst_1        
	//  343  682:iadd            
	//  344  683:istore          7
							af1[j1] = entry.getY() * f;
	//  345  685:aload           13
	//  346  687:iload           8
	//  347  689:aload           12
	//  348  691:invokevirtual   #132 <Method float Entry.getY()>
	//  349  694:fload_3         
	//  350  695:fmul            
	//  351  696:fastore         
							l = i1;
	//  352  697:iload           7
	//  353  699:istore          6
							if(flag)
	//* 354  701:iload           9
	//* 355  703:ifeq            796
							{
								float af2[] = q;
	//  356  706:aload_0         
	//  357  707:getfield        #52  <Field float[] q>
	//  358  710:astore          13
								l = i1 + 1;
	//  359  712:iload           7
	//  360  714:iconst_1        
	//  361  715:iadd            
	//  362  716:istore          6
								af2[i1] = ((Entry) (canvas)).getX();
	//  363  718:aload           13
	//  364  720:iload           7
	//  365  722:aload_1         
	//  366  723:invokevirtual   #125 <Method float Entry.getX()>
	//  367  726:fastore         
								af2 = q;
	//  368  727:aload_0         
	//  369  728:getfield        #52  <Field float[] q>
	//  370  731:astore          13
								i1 = l + 1;
	//  371  733:iload           6
	//  372  735:iconst_1        
	//  373  736:iadd            
	//  374  737:istore          7
								af2[l] = entry.getY() * f;
	//  375  739:aload           13
	//  376  741:iload           6
	//  377  743:aload           12
	//  378  745:invokevirtual   #132 <Method float Entry.getY()>
	//  379  748:fload_3         
	//  380  749:fmul            
	//  381  750:fastore         
								af2 = q;
	//  382  751:aload_0         
	//  383  752:getfield        #52  <Field float[] q>
	//  384  755:astore          13
								j1 = i1 + 1;
	//  385  757:iload           7
	//  386  759:iconst_1        
	//  387  760:iadd            
	//  388  761:istore          8
								af2[i1] = ((Entry) (canvas)).getX();
	//  389  763:aload           13
	//  390  765:iload           7
	//  391  767:aload_1         
	//  392  768:invokevirtual   #125 <Method float Entry.getX()>
	//  393  771:fastore         
								af2 = q;
	//  394  772:aload_0         
	//  395  773:getfield        #52  <Field float[] q>
	//  396  776:astore          13
								l = j1 + 1;
	//  397  778:iload           8
	//  398  780:iconst_1        
	//  399  781:iadd            
	//  400  782:istore          6
								af2[j1] = entry.getY() * f;
	//  401  784:aload           13
	//  402  786:iload           8
	//  403  788:aload           12
	//  404  790:invokevirtual   #132 <Method float Entry.getY()>
	//  405  793:fload_3         
	//  406  794:fmul            
	//  407  795:fastore         
							}
							float af[] = q;
	//  408  796:aload_0         
	//  409  797:getfield        #52  <Field float[] q>
	//  410  800:astore          12
							j1 = l + 1;
	//  411  802:iload           6
	//  412  804:iconst_1        
	//  413  805:iadd            
	//  414  806:istore          8
							af[l] = ((Entry) (canvas)).getX();
	//  415  808:aload           12
	//  416  810:iload           6
	//  417  812:aload_1         
	//  418  813:invokevirtual   #125 <Method float Entry.getX()>
	//  419  816:fastore         
							af = q;
	//  420  817:aload_0         
	//  421  818:getfield        #52  <Field float[] q>
	//  422  821:astore          12
							i1 = j1 + 1;
	//  423  823:iload           8
	//  424  825:iconst_1        
	//  425  826:iadd            
	//  426  827:istore          7
							af[j1] = ((Entry) (canvas)).getY() * f;
	//  427  829:aload           12
	//  428  831:iload           8
	//  429  833:aload_1         
	//  430  834:invokevirtual   #132 <Method float Entry.getY()>
	//  431  837:fload_3         
	//  432  838:fmul            
	//  433  839:fastore         
						}
					k++;
	//  434  840:iload           5
	//  435  842:iconst_1        
	//  436  843:iadd            
	//  437  844:istore          5
					l = i1;
	//  438  846:iload           7
	//  439  848:istore          6
				}

	//* 440  850:goto            575
				if(l > 0)
	//* 441  853:iload           6
	//* 442  855:ifle            917
				{
					nv1.e(q);
	//  443  858:aload           11
	//  444  860:aload_0         
	//  445  861:getfield        #52  <Field float[] q>
	//  446  864:invokevirtual   #274 <Method void nv.e(float[])>
					i = Math.max((this.f.a + 1) * i, i);
	//  447  867:aload_0         
	//  448  868:getfield        #245 <Field nk$d f>
	//  449  871:getfield        #267 <Field int nk$d.a>
	//  450  874:iconst_1        
	//  451  875:iadd            
	//  452  876:iload           4
	//  453  878:imul            
	//  454  879:iload           4
	//  455  881:invokestatic    #296 <Method int Math.max(int, int)>
	//  456  884:istore          4
					h.setColor(na1.m());
	//  457  886:aload_0         
	//  458  887:getfield        #219 <Field Paint h>
	//  459  890:aload_2         
	//  460  891:invokeinterface #298 <Method int na.m()>
	//  461  896:invokevirtual   #83  <Method void Paint.setColor(int)>
					canvas1.drawLines(q, 0, i * 2, h);
	//  462  899:aload           10
	//  463  901:aload_0         
	//  464  902:getfield        #52  <Field float[] q>
	//  465  905:iconst_0        
	//  466  906:iload           4
	//  467  908:iconst_2        
	//  468  909:imul            
	//  469  910:aload_0         
	//  470  911:getfield        #219 <Field Paint h>
	//  471  914:invokevirtual   #290 <Method void Canvas.drawLines(float[], int, int, Paint)>
				}
			}
		}
		h.setPathEffect(((android.graphics.PathEffect) (null)));
	//  472  917:aload_0         
	//  473  918:getfield        #219 <Field Paint h>
	//  474  921:aconst_null     
	//  475  922:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  476  925:pop             
	//  477  926:return          
	}

	protected void a(Canvas canvas, na na1, nv nv1, nk.d d1)
	{
		Path path = m;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Path m>
	//    2    4:astore          10
		int l = d1.c;
	//    3    6:aload           4
	//    4    8:getfield        #265 <Field int nk$d.c>
	//    5   11:istore          8
		int k = d1.a + d1.c;
	//    6   13:aload           4
	//    7   15:getfield        #267 <Field int nk$d.a>
	//    8   18:aload           4
	//    9   20:getfield        #265 <Field int nk$d.c>
	//   10   23:iadd            
	//   11   24:istore          7
		int i = 0;
	//   12   26:iconst_0        
	//   13   27:istore          5
		int j;
		int i1;
		do
		{
			i1 = l + i * 128;
	//   14   29:iload           8
	//   15   31:iload           5
	//   16   33:sipush          128
	//   17   36:imul            
	//   18   37:iadd            
	//   19   38:istore          9
			j = i1 + 128;
	//   20   40:iload           9
	//   21   42:sipush          128
	//   22   45:iadd            
	//   23   46:istore          6
			if(j > k)
	//*  24   48:iload           6
	//*  25   50:iload           7
	//*  26   52:icmple          62
				j = k;
	//   27   55:iload           7
	//   28   57:istore          6
	//*  29   59:goto            62
			if(i1 <= j)
	//*  30   62:iload           9
	//*  31   64:iload           6
	//*  32   66:icmpgt          130
			{
				c(na1, i1, j, path);
	//   33   69:aload_0         
	//   34   70:aload_2         
	//   35   71:iload           9
	//   36   73:iload           6
	//   37   75:aload           10
	//   38   77:invokespecial   #304 <Method void c(na, int, int, Path)>
				nv1.a(path);
	//   39   80:aload_3         
	//   40   81:aload           10
	//   41   83:invokevirtual   #307 <Method void nv.a(Path)>
				d1 = ((nk.d) (na1.Q()));
	//   42   86:aload_2         
	//   43   87:invokeinterface #311 <Method Drawable na.Q()>
	//   44   92:astore          4
				if(d1 != null)
	//*  45   94:aload           4
	//*  46   96:ifnull          111
					d(canvas, path, ((Drawable) (d1)));
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:aload           10
	//   50  103:aload           4
	//   51  105:invokevirtual   #314 <Method void d(Canvas, Path, Drawable)>
				else
	//*  52  108:goto            130
					b(canvas, path, na1.O(), na1.S());
	//   53  111:aload_0         
	//   54  112:aload_1         
	//   55  113:aload           10
	//   56  115:aload_2         
	//   57  116:invokeinterface #317 <Method int na.O()>
	//   58  121:aload_2         
	//   59  122:invokeinterface #320 <Method int na.S()>
	//   60  127:invokevirtual   #323 <Method void b(Canvas, Path, int, int)>
			}
			i++;
	//   61  130:iload           5
	//   62  132:iconst_1        
	//   63  133:iadd            
	//   64  134:istore          5
		} while(i1 <= j);
	//   65  136:iload           9
	//   66  138:iload           6
	//   67  140:icmple          29
	//   68  143:return          
	}

	protected void b(Canvas canvas)
	{
		h.setStyle(android.graphics.Paint.Style.FILL);
	//    0    0:aload_0         
	//    1    1:getfield        #219 <Field Paint h>
	//    2    4:getstatic       #76  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//    3    7:invokevirtual   #80  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		float f = this.i.d();
	//    4   10:aload_0         
	//    5   11:getfield        #100 <Field la i>
	//    6   14:invokevirtual   #105 <Method float la.d()>
	//    7   17:fstore_2        
		r[0] = 0.0F;
	//    8   18:aload_0         
	//    9   19:getfield        #61  <Field float[] r>
	//   10   22:iconst_0        
	//   11   23:fconst_0        
	//   12   24:fastore         
		r[1] = 0.0F;
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field float[] r>
	//   15   29:iconst_1        
	//   16   30:fconst_0        
	//   17   31:fastore         
		List list = c.getLineData().h();
	//   18   32:aload_0         
	//   19   33:getfield        #63  <Field mu c>
	//   20   36:invokeinterface #190 <Method lx mu.getLineData()>
	//   21   41:invokevirtual   #196 <Method List lx.h()>
	//   22   44:astore          12
		for(int i = 0; i < list.size(); i++)
	//*  23   46:iconst_0        
	//*  24   47:istore          5
	//*  25   49:iload           5
	//*  26   51:aload           12
	//*  27   53:invokeinterface #262 <Method int List.size()>
	//*  28   58:icmpge          501
		{
			na na1 = (na)list.get(i);
	//   29   61:aload           12
	//   30   63:iload           5
	//   31   65:invokeinterface #326 <Method Object List.get(int)>
	//   32   70:checkcast       #87  <Class na>
	//   33   73:astore          13
			if(!na1.j() || !na1.M() || na1.C() == 0)
	//*  34   75:aload           13
	//*  35   77:invokeinterface #214 <Method boolean na.j()>
	//*  36   82:ifeq            492
	//*  37   85:aload           13
	//*  38   87:invokeinterface #329 <Method boolean na.M()>
	//*  39   92:ifeq            492
	//*  40   95:aload           13
	//*  41   97:invokeinterface #226 <Method int na.C()>
	//*  42  102:ifne            108
				continue;
	//   43  105:goto            492
			b.setColor(na1.K());
	//   44  108:aload_0         
	//   45  109:getfield        #70  <Field Paint b>
	//   46  112:aload           13
	//   47  114:invokeinterface #332 <Method int na.K()>
	//   48  119:invokevirtual   #83  <Method void Paint.setColor(int)>
			nv nv1 = c.b(na1.D());
	//   49  122:aload_0         
	//   50  123:getfield        #63  <Field mu c>
	//   51  126:aload           13
	//   52  128:invokeinterface #233 <Method lp$b na.D()>
	//   53  133:invokeinterface #236 <Method nv mu.b(lp$b)>
	//   54  138:astore          14
			this.f.b(((mn) (c)), ((mv) (na1)));
	//   55  140:aload_0         
	//   56  141:getfield        #245 <Field nk$d f>
	//   57  144:aload_0         
	//   58  145:getfield        #63  <Field mu c>
	//   59  148:aload           13
	//   60  150:invokevirtual   #250 <Method void nk$d.b(mn, mv)>
			float f1 = na1.e();
	//   61  153:aload           13
	//   62  155:invokeinterface #334 <Method float na.e()>
	//   63  160:fstore_3        
			float f2 = na1.b();
	//   64  161:aload           13
	//   65  163:invokeinterface #336 <Method float na.b()>
	//   66  168:fstore          4
			boolean flag;
			if(na1.P() && f2 < f1 && f2 > 0.0F)
	//*  67  170:aload           13
	//*  68  172:invokeinterface #339 <Method boolean na.P()>
	//*  69  177:ifeq            200
	//*  70  180:fload           4
	//*  71  182:fload_3         
	//*  72  183:fcmpg           
	//*  73  184:ifge            200
	//*  74  187:fload           4
	//*  75  189:fconst_0        
	//*  76  190:fcmpl           
	//*  77  191:ifle            200
				flag = true;
	//   78  194:iconst_1        
	//   79  195:istore          9
			else
	//*  80  197:goto            203
				flag = false;
	//   81  200:iconst_0        
	//   82  201:istore          9
			boolean flag1;
			if(flag && na1.K() == 0x112233)
	//*  83  203:iload           9
	//*  84  205:ifeq            227
	//*  85  208:aload           13
	//*  86  210:invokeinterface #332 <Method int na.K()>
	//*  87  215:ldc2            #340 <Int 0x112233>
	//*  88  218:icmpne          227
				flag1 = true;
	//   89  221:iconst_1        
	//   90  222:istore          10
			else
	//*  91  224:goto            230
				flag1 = false;
	//   92  227:iconst_0        
	//   93  228:istore          10
			b b1;
			if(u.containsKey(((Object) (na1))))
	//*  94  230:aload_0         
	//*  95  231:getfield        #59  <Field HashMap u>
	//*  96  234:aload           13
	//*  97  236:invokevirtual   #344 <Method boolean HashMap.containsKey(Object)>
	//*  98  239:ifeq            259
			{
				b1 = (b)u.get(((Object) (na1)));
	//   99  242:aload_0         
	//  100  243:getfield        #59  <Field HashMap u>
	//  101  246:aload           13
	//  102  248:invokevirtual   #347 <Method Object HashMap.get(Object)>
	//  103  251:checkcast       #8   <Class nm$b>
	//  104  254:astore          11
			} else
	//* 105  256:goto            282
			{
				b1 = new b();
	//  106  259:new             #8   <Class nm$b>
	//  107  262:dup             
	//  108  263:aload_0         
	//  109  264:aconst_null     
	//  110  265:invokespecial   #350 <Method void nm$b(nm, nm$2)>
	//  111  268:astore          11
				u.put(((Object) (na1)), ((Object) (b1)));
	//  112  270:aload_0         
	//  113  271:getfield        #59  <Field HashMap u>
	//  114  274:aload           13
	//  115  276:aload           11
	//  116  278:invokevirtual   #354 <Method Object HashMap.put(Object, Object)>
	//  117  281:pop             
			}
			if(b1.d(na1))
	//* 118  282:aload           11
	//* 119  284:aload           13
	//* 120  286:invokevirtual   #357 <Method boolean nm$b.d(na)>
	//* 121  289:ifeq            303
				b1.d(na1, flag, flag1);
	//  122  292:aload           11
	//  123  294:aload           13
	//  124  296:iload           9
	//  125  298:iload           10
	//  126  300:invokevirtual   #360 <Method void nm$b.d(na, boolean, boolean)>
			int k = this.f.a;
	//  127  303:aload_0         
	//  128  304:getfield        #245 <Field nk$d f>
	//  129  307:getfield        #267 <Field int nk$d.a>
	//  130  310:istore          7
			int l = this.f.c;
	//  131  312:aload_0         
	//  132  313:getfield        #245 <Field nk$d f>
	//  133  316:getfield        #265 <Field int nk$d.c>
	//  134  319:istore          8
			for(int j = this.f.c; j <= k + l; j++)
	//* 135  321:aload_0         
	//* 136  322:getfield        #245 <Field nk$d f>
	//* 137  325:getfield        #265 <Field int nk$d.c>
	//* 138  328:istore          6
	//* 139  330:iload           6
	//* 140  332:iload           7
	//* 141  334:iload           8
	//* 142  336:iadd            
	//* 143  337:icmpgt          492
			{
				Object obj = ((Object) (na1.f(j)));
	//  144  340:aload           13
	//  145  342:iload           6
	//  146  344:invokeinterface #120 <Method Entry na.f(int)>
	//  147  349:astore          15
				if(obj == null)
	//* 148  351:aload           15
	//* 149  353:ifnonnull       359
					break;
	//  150  356:goto            492
				r[0] = ((Entry) (obj)).getX();
	//  151  359:aload_0         
	//  152  360:getfield        #61  <Field float[] r>
	//  153  363:iconst_0        
	//  154  364:aload           15
	//  155  366:invokevirtual   #125 <Method float Entry.getX()>
	//  156  369:fastore         
				r[1] = ((Entry) (obj)).getY() * f;
	//  157  370:aload_0         
	//  158  371:getfield        #61  <Field float[] r>
	//  159  374:iconst_1        
	//  160  375:aload           15
	//  161  377:invokevirtual   #132 <Method float Entry.getY()>
	//  162  380:fload_2         
	//  163  381:fmul            
	//  164  382:fastore         
				nv1.e(r);
	//  165  383:aload           14
	//  166  385:aload_0         
	//  167  386:getfield        #61  <Field float[] r>
	//  168  389:invokevirtual   #274 <Method void nv.e(float[])>
				if(!this.l.k(r[0]))
	//* 169  392:aload_0         
	//* 170  393:getfield        #143 <Field oa l>
	//* 171  396:aload_0         
	//* 172  397:getfield        #61  <Field float[] r>
	//* 173  400:iconst_0        
	//* 174  401:faload          
	//* 175  402:invokevirtual   #277 <Method boolean oa.k(float)>
	//* 176  405:ifne            411
					break;
	//  177  408:goto            492
				if(!this.l.i(r[0]) || !this.l.g(r[1]))
	//* 178  411:aload_0         
	//* 179  412:getfield        #143 <Field oa l>
	//* 180  415:aload_0         
	//* 181  416:getfield        #61  <Field float[] r>
	//* 182  419:iconst_0        
	//* 183  420:faload          
	//* 184  421:invokevirtual   #279 <Method boolean oa.i(float)>
	//* 185  424:ifeq            483
	//* 186  427:aload_0         
	//* 187  428:getfield        #143 <Field oa l>
	//* 188  431:aload_0         
	//* 189  432:getfield        #61  <Field float[] r>
	//* 190  435:iconst_1        
	//* 191  436:faload          
	//* 192  437:invokevirtual   #362 <Method boolean oa.g(float)>
	//* 193  440:ifne            446
					continue;
	//  194  443:goto            483
				obj = ((Object) (b1.e(j)));
	//  195  446:aload           11
	//  196  448:iload           6
	//  197  450:invokevirtual   #365 <Method Bitmap nm$b.e(int)>
	//  198  453:astore          15
				if(obj != null)
	//* 199  455:aload           15
	//* 200  457:ifnull          483
					canvas.drawBitmap(((Bitmap) (obj)), r[0] - f1, r[1] - f1, ((Paint) (null)));
	//  201  460:aload_1         
	//  202  461:aload           15
	//  203  463:aload_0         
	//  204  464:getfield        #61  <Field float[] r>
	//  205  467:iconst_0        
	//  206  468:faload          
	//  207  469:fload_3         
	//  208  470:fsub            
	//  209  471:aload_0         
	//  210  472:getfield        #61  <Field float[] r>
	//  211  475:iconst_1        
	//  212  476:faload          
	//  213  477:fload_3         
	//  214  478:fsub            
	//  215  479:aconst_null     
	//  216  480:invokevirtual   #223 <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
			}

	//  217  483:iload           6
	//  218  485:iconst_1        
	//  219  486:iadd            
	//  220  487:istore          6
		}

	//  221  489:goto            330
	//  222  492:iload           5
	//  223  494:iconst_1        
	//  224  495:iadd            
	//  225  496:istore          5
	//* 226  498:goto            49
	//  227  501:return          
	}

	protected void b(na na1)
	{
		Math.max(0.0F, Math.min(1.0F, this.i.b()));
	//    0    0:fconst_0        
	//    1    1:fconst_1        
	//    2    2:aload_0         
	//    3    3:getfield        #100 <Field la i>
	//    4    6:invokevirtual   #367 <Method float la.b()>
	//    5    9:invokestatic    #371 <Method float Math.min(float, float)>
	//    6   12:invokestatic    #373 <Method float Math.max(float, float)>
	//    7   15:pop             
		float f = this.i.d();
	//    8   16:aload_0         
	//    9   17:getfield        #100 <Field la i>
	//   10   20:invokevirtual   #105 <Method float la.d()>
	//   11   23:fstore_2        
		nv nv1 = c.b(na1.D());
	//   12   24:aload_0         
	//   13   25:getfield        #63  <Field mu c>
	//   14   28:aload_1         
	//   15   29:invokeinterface #233 <Method lp$b na.D()>
	//   16   34:invokeinterface #236 <Method nv mu.b(lp$b)>
	//   17   39:astore          18
		this.f.b(((mn) (c)), ((mv) (na1)));
	//   18   41:aload_0         
	//   19   42:getfield        #245 <Field nk$d f>
	//   20   45:aload_0         
	//   21   46:getfield        #63  <Field mu c>
	//   22   49:aload_1         
	//   23   50:invokevirtual   #250 <Method void nk$d.b(mn, mv)>
		float f1 = na1.d();
	//   24   53:aload_1         
	//   25   54:invokeinterface #374 <Method float na.d()>
	//   26   59:fstore_3        
		p.reset();
	//   27   60:aload_0         
	//   28   61:getfield        #48  <Field Path p>
	//   29   64:invokevirtual   #116 <Method void Path.reset()>
		if(this.f.a >= 1)
	//*  30   67:aload_0         
	//*  31   68:getfield        #245 <Field nk$d f>
	//*  32   71:getfield        #267 <Field int nk$d.a>
	//*  33   74:iconst_1        
	//*  34   75:icmplt          410
		{
			int i = this.f.c + 1;
	//   35   78:aload_0         
	//   36   79:getfield        #245 <Field nk$d f>
	//   37   82:getfield        #265 <Field int nk$d.c>
	//   38   85:iconst_1        
	//   39   86:iadd            
	//   40   87:istore          12
			int j = this.f.c;
	//   41   89:aload_0         
	//   42   90:getfield        #245 <Field nk$d f>
	//   43   93:getfield        #265 <Field int nk$d.c>
	//   44   96:istore          13
			j = this.f.a;
	//   45   98:aload_0         
	//   46   99:getfield        #245 <Field nk$d f>
	//   47  102:getfield        #267 <Field int nk$d.a>
	//   48  105:istore          13
			Entry entry2 = na1.f(Math.max(i - 2, 0));
	//   49  107:aload_1         
	//   50  108:iload           12
	//   51  110:iconst_2        
	//   52  111:isub            
	//   53  112:iconst_0        
	//   54  113:invokestatic    #296 <Method int Math.max(int, int)>
	//   55  116:invokeinterface #120 <Method Entry na.f(int)>
	//   56  121:astore          16
			Entry entry1 = na1.f(Math.max(i - 1, 0));
	//   57  123:aload_1         
	//   58  124:iload           12
	//   59  126:iconst_1        
	//   60  127:isub            
	//   61  128:iconst_0        
	//   62  129:invokestatic    #296 <Method int Math.max(int, int)>
	//   63  132:invokeinterface #120 <Method Entry na.f(int)>
	//   64  137:astore          15
			Entry entry = entry1;
	//   65  139:aload           15
	//   66  141:astore          14
			j = -1;
	//   67  143:iconst_m1       
	//   68  144:istore          13
			if(entry1 == null)
	//*  69  146:aload           15
	//*  70  148:ifnonnull       152
				return;
	//   71  151:return          
			p.moveTo(entry1.getX(), entry1.getY() * f);
	//   72  152:aload_0         
	//   73  153:getfield        #48  <Field Path p>
	//   74  156:aload           15
	//   75  158:invokevirtual   #125 <Method float Entry.getX()>
	//   76  161:aload           15
	//   77  163:invokevirtual   #132 <Method float Entry.getY()>
	//   78  166:fload_2         
	//   79  167:fmul            
	//   80  168:invokevirtual   #129 <Method void Path.moveTo(float, float)>
			i = this.f.c + 1;
	//   81  171:aload_0         
	//   82  172:getfield        #245 <Field nk$d f>
	//   83  175:getfield        #265 <Field int nk$d.c>
	//   84  178:iconst_1        
	//   85  179:iadd            
	//   86  180:istore          12
			do
			{
				Entry entry3 = entry2;
	//   87  182:aload           16
	//   88  184:astore          17
				if(i > this.f.a + this.f.c)
					break;
	//   89  186:iload           12
	//   90  188:aload_0         
	//   91  189:getfield        #245 <Field nk$d f>
	//   92  192:getfield        #267 <Field int nk$d.a>
	//   93  195:aload_0         
	//   94  196:getfield        #245 <Field nk$d f>
	//   95  199:getfield        #265 <Field int nk$d.c>
	//   96  202:iadd            
	//   97  203:icmpgt          410
				entry2 = entry1;
	//   98  206:aload           15
	//   99  208:astore          16
				if(j == i)
	//* 100  210:iload           13
	//* 101  212:iload           12
	//* 102  214:icmpne          224
					entry1 = entry;
	//  103  217:aload           14
	//  104  219:astore          15
				else
	//* 105  221:goto            234
					entry1 = na1.f(i);
	//  106  224:aload_1         
	//  107  225:iload           12
	//  108  227:invokeinterface #120 <Method Entry na.f(int)>
	//  109  232:astore          15
				if(i + 1 < na1.C())
	//* 110  234:iload           12
	//* 111  236:iconst_1        
	//* 112  237:iadd            
	//* 113  238:aload_1         
	//* 114  239:invokeinterface #226 <Method int na.C()>
	//* 115  244:icmpge          256
					j = i + 1;
	//  116  247:iload           12
	//  117  249:iconst_1        
	//  118  250:iadd            
	//  119  251:istore          13
				else
	//* 120  253:goto            260
					j = i;
	//  121  256:iload           12
	//  122  258:istore          13
				entry = na1.f(j);
	//  123  260:aload_1         
	//  124  261:iload           13
	//  125  263:invokeinterface #120 <Method Entry na.f(int)>
	//  126  268:astore          14
				float f2 = entry1.getX();
	//  127  270:aload           15
	//  128  272:invokevirtual   #125 <Method float Entry.getX()>
	//  129  275:fstore          4
				float f3 = entry3.getX();
	//  130  277:aload           17
	//  131  279:invokevirtual   #125 <Method float Entry.getX()>
	//  132  282:fstore          5
				float f4 = entry1.getY();
	//  133  284:aload           15
	//  134  286:invokevirtual   #132 <Method float Entry.getY()>
	//  135  289:fstore          6
				float f5 = entry3.getY();
	//  136  291:aload           17
	//  137  293:invokevirtual   #132 <Method float Entry.getY()>
	//  138  296:fstore          7
				float f6 = entry.getX();
	//  139  298:aload           14
	//  140  300:invokevirtual   #125 <Method float Entry.getX()>
	//  141  303:fstore          8
				float f7 = entry2.getX();
	//  142  305:aload           16
	//  143  307:invokevirtual   #125 <Method float Entry.getX()>
	//  144  310:fstore          9
				float f8 = entry.getY();
	//  145  312:aload           14
	//  146  314:invokevirtual   #132 <Method float Entry.getY()>
	//  147  317:fstore          10
				float f9 = entry2.getY();
	//  148  319:aload           16
	//  149  321:invokevirtual   #132 <Method float Entry.getY()>
	//  150  324:fstore          11
				p.cubicTo(entry2.getX() + (f2 - f3) * f1, (entry2.getY() + (f4 - f5) * f1) * f, entry1.getX() - (f6 - f7) * f1, (entry1.getY() - (f8 - f9) * f1) * f, entry1.getX(), entry1.getY() * f);
	//  151  326:aload_0         
	//  152  327:getfield        #48  <Field Path p>
	//  153  330:aload           16
	//  154  332:invokevirtual   #125 <Method float Entry.getX()>
	//  155  335:fload           4
	//  156  337:fload           5
	//  157  339:fsub            
	//  158  340:fload_3         
	//  159  341:fmul            
	//  160  342:fadd            
	//  161  343:aload           16
	//  162  345:invokevirtual   #132 <Method float Entry.getY()>
	//  163  348:fload           6
	//  164  350:fload           7
	//  165  352:fsub            
	//  166  353:fload_3         
	//  167  354:fmul            
	//  168  355:fadd            
	//  169  356:fload_2         
	//  170  357:fmul            
	//  171  358:aload           15
	//  172  360:invokevirtual   #125 <Method float Entry.getX()>
	//  173  363:fload           8
	//  174  365:fload           9
	//  175  367:fsub            
	//  176  368:fload_3         
	//  177  369:fmul            
	//  178  370:fsub            
	//  179  371:aload           15
	//  180  373:invokevirtual   #132 <Method float Entry.getY()>
	//  181  376:fload           10
	//  182  378:fload           11
	//  183  380:fsub            
	//  184  381:fload_3         
	//  185  382:fmul            
	//  186  383:fsub            
	//  187  384:fload_2         
	//  188  385:fmul            
	//  189  386:aload           15
	//  190  388:invokevirtual   #125 <Method float Entry.getX()>
	//  191  391:aload           15
	//  192  393:invokevirtual   #132 <Method float Entry.getY()>
	//  193  396:fload_2         
	//  194  397:fmul            
	//  195  398:invokevirtual   #378 <Method void Path.cubicTo(float, float, float, float, float, float)>
				i++;
	//  196  401:iload           12
	//  197  403:iconst_1        
	//  198  404:iadd            
	//  199  405:istore          12
			} while(true);
	//  200  407:goto            182
		}
		if(na1.V())
	//* 201  410:aload_1         
	//* 202  411:invokeinterface #253 <Method boolean na.V()>
	//* 203  416:ifeq            456
		{
			o.reset();
	//  204  419:aload_0         
	//  205  420:getfield        #50  <Field Path o>
	//  206  423:invokevirtual   #116 <Method void Path.reset()>
			o.addPath(p);
	//  207  426:aload_0         
	//  208  427:getfield        #50  <Field Path o>
	//  209  430:aload_0         
	//  210  431:getfield        #48  <Field Path p>
	//  211  434:invokevirtual   #381 <Method void Path.addPath(Path)>
			e(a, na1, o, nv1, this.f);
	//  212  437:aload_0         
	//  213  438:aload_0         
	//  214  439:getfield        #181 <Field Canvas a>
	//  215  442:aload_1         
	//  216  443:aload_0         
	//  217  444:getfield        #50  <Field Path o>
	//  218  447:aload           18
	//  219  449:aload_0         
	//  220  450:getfield        #245 <Field nk$d f>
	//  221  453:invokevirtual   #384 <Method void e(Canvas, na, Path, nv, nk$d)>
		}
		h.setColor(na1.m());
	//  222  456:aload_0         
	//  223  457:getfield        #219 <Field Paint h>
	//  224  460:aload_1         
	//  225  461:invokeinterface #298 <Method int na.m()>
	//  226  466:invokevirtual   #83  <Method void Paint.setColor(int)>
		h.setStyle(android.graphics.Paint.Style.STROKE);
	//  227  469:aload_0         
	//  228  470:getfield        #219 <Field Paint h>
	//  229  473:getstatic       #239 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  230  476:invokevirtual   #80  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		nv1.a(p);
	//  231  479:aload           18
	//  232  481:aload_0         
	//  233  482:getfield        #48  <Field Path p>
	//  234  485:invokevirtual   #307 <Method void nv.a(Path)>
		a.drawPath(p, h);
	//  235  488:aload_0         
	//  236  489:getfield        #181 <Field Canvas a>
	//  237  492:aload_0         
	//  238  493:getfield        #48  <Field Path p>
	//  239  496:aload_0         
	//  240  497:getfield        #219 <Field Paint h>
	//  241  500:invokevirtual   #388 <Method void Canvas.drawPath(Path, Paint)>
		h.setPathEffect(((android.graphics.PathEffect) (null)));
	//  242  503:aload_0         
	//  243  504:getfield        #219 <Field Paint h>
	//  244  507:aconst_null     
	//  245  508:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  246  511:pop             
	//  247  512:return          
	}

	protected void c(Canvas canvas, na na1)
	{
		if(na1.C() < 1)
	//*   0    0:aload_2         
	//*   1    1:invokeinterface #226 <Method int na.C()>
	//*   2    6:iconst_1        
	//*   3    7:icmpge          11
			return;
	//    4   10:return          
		h.setStrokeWidth(na1.X());
	//    5   11:aload_0         
	//    6   12:getfield        #219 <Field Paint h>
	//    7   15:aload_2         
	//    8   16:invokeinterface #391 <Method float na.X()>
	//    9   21:invokevirtual   #395 <Method void Paint.setStrokeWidth(float)>
		h.setPathEffect(((android.graphics.PathEffect) (na1.h())));
	//   10   24:aload_0         
	//   11   25:getfield        #219 <Field Paint h>
	//   12   28:aload_2         
	//   13   29:invokeinterface #398 <Method android.graphics.DashPathEffect na.h()>
	//   14   34:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   15   37:pop             
		static class _cls2
		{

			static final int e[];

			static 
			{
				e = new int[ly.c.values().length];
			//    0    0:invokestatic    #18  <Method ly$c[] ly$c.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] e>
				try
				{
					e[ly.c.b.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] e>
			//    5   12:getstatic       #24  <Field ly$c ly$c.b>
			//    6   15:invokevirtual   #28  <Method int ly$c.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:goto            24
				catch(NoSuchFieldError nosuchfielderror) { }
			//   10   23:astore_0        
				try
				{
					e[ly.c.c.ordinal()] = 2;
			//   11   24:getstatic       #20  <Field int[] e>
			//   12   27:getstatic       #31  <Field ly$c ly$c.c>
			//   13   30:invokevirtual   #28  <Method int ly$c.ordinal()>
			//   14   33:iconst_2        
			//   15   34:iastore         
				}
			//*  16   35:goto            39
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   38:astore_0        
				try
				{
					e[ly.c.a.ordinal()] = 3;
			//   18   39:getstatic       #20  <Field int[] e>
			//   19   42:getstatic       #34  <Field ly$c ly$c.a>
			//   20   45:invokevirtual   #28  <Method int ly$c.ordinal()>
			//   21   48:iconst_3        
			//   22   49:iastore         
				}
			//*  23   50:goto            54
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   53:astore_0        
				try
				{
					e[ly.c.d.ordinal()] = 4;
			//   25   54:getstatic       #20  <Field int[] e>
			//   26   57:getstatic       #37  <Field ly$c ly$c.d>
			//   27   60:invokevirtual   #28  <Method int ly$c.ordinal()>
			//   28   63:iconst_4        
			//   29   64:iastore         
			//   30   65:return          
				}
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls2.e[na1.a().ordinal()])
	//*  16   38:getstatic       #401 <Field int[] nm$2.e>
	//*  17   41:aload_2         
	//*  18   42:invokeinterface #108 <Method ly$c na.a()>
	//*  19   47:invokevirtual   #404 <Method int ly$c.ordinal()>
	//*  20   50:iaload          
		{
	//*  21   51:tableswitch     1 4: default 80
	//	               1 80
	//	               2 80
	//	               3 89
	//	               4 97
		case 1: // '\001'
		case 2: // '\002'
		default:
			a(canvas, na1);
	//   22   80:aload_0         
	//   23   81:aload_1         
	//   24   82:aload_2         
	//   25   83:invokevirtual   #406 <Method void a(Canvas, na)>
			break;

	//*  26   86:goto            102
		case 3: // '\003'
			b(na1);
	//   27   89:aload_0         
	//   28   90:aload_2         
	//   29   91:invokevirtual   #408 <Method void b(na)>
			break;

	//*  30   94:goto            102
		case 4: // '\004'
			c(na1);
	//   31   97:aload_0         
	//   32   98:aload_2         
	//   33   99:invokevirtual   #410 <Method void c(na)>
			break;
		}
		h.setPathEffect(((android.graphics.PathEffect) (null)));
	//   34  102:aload_0         
	//   35  103:getfield        #219 <Field Paint h>
	//   36  106:aconst_null     
	//   37  107:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   38  110:pop             
	//   39  111:return          
	}

	protected void c(na na1)
	{
		float f = this.i.d();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field la i>
	//    2    4:invokevirtual   #105 <Method float la.d()>
	//    3    7:fstore_2        
		nv nv1 = c.b(na1.D());
	//    4    8:aload_0         
	//    5    9:getfield        #63  <Field mu c>
	//    6   12:aload_1         
	//    7   13:invokeinterface #233 <Method lp$b na.D()>
	//    8   18:invokeinterface #236 <Method nv mu.b(lp$b)>
	//    9   23:astore          7
		this.f.b(((mn) (c)), ((mv) (na1)));
	//   10   25:aload_0         
	//   11   26:getfield        #245 <Field nk$d f>
	//   12   29:aload_0         
	//   13   30:getfield        #63  <Field mu c>
	//   14   33:aload_1         
	//   15   34:invokevirtual   #250 <Method void nk$d.b(mn, mv)>
		p.reset();
	//   16   37:aload_0         
	//   17   38:getfield        #48  <Field Path p>
	//   18   41:invokevirtual   #116 <Method void Path.reset()>
		if(this.f.a >= 1)
	//*  19   44:aload_0         
	//*  20   45:getfield        #245 <Field nk$d f>
	//*  21   48:getfield        #267 <Field int nk$d.a>
	//*  22   51:iconst_1        
	//*  23   52:icmplt          198
		{
			Entry entry = na1.f(this.f.c);
	//   24   55:aload_1         
	//   25   56:aload_0         
	//   26   57:getfield        #245 <Field nk$d f>
	//   27   60:getfield        #265 <Field int nk$d.c>
	//   28   63:invokeinterface #120 <Method Entry na.f(int)>
	//   29   68:astore          5
			p.moveTo(entry.getX(), entry.getY() * f);
	//   30   70:aload_0         
	//   31   71:getfield        #48  <Field Path p>
	//   32   74:aload           5
	//   33   76:invokevirtual   #125 <Method float Entry.getX()>
	//   34   79:aload           5
	//   35   81:invokevirtual   #132 <Method float Entry.getY()>
	//   36   84:fload_2         
	//   37   85:fmul            
	//   38   86:invokevirtual   #129 <Method void Path.moveTo(float, float)>
			for(int i = this.f.c + 1; i <= this.f.a + this.f.c;)
	//*  39   89:aload_0         
	//*  40   90:getfield        #245 <Field nk$d f>
	//*  41   93:getfield        #265 <Field int nk$d.c>
	//*  42   96:iconst_1        
	//*  43   97:iadd            
	//*  44   98:istore          4
	//*  45  100:iload           4
	//*  46  102:aload_0         
	//*  47  103:getfield        #245 <Field nk$d f>
	//*  48  106:getfield        #267 <Field int nk$d.a>
	//*  49  109:aload_0         
	//*  50  110:getfield        #245 <Field nk$d f>
	//*  51  113:getfield        #265 <Field int nk$d.c>
	//*  52  116:iadd            
	//*  53  117:icmpgt          198
			{
				Entry entry1 = na1.f(i);
	//   54  120:aload_1         
	//   55  121:iload           4
	//   56  123:invokeinterface #120 <Method Entry na.f(int)>
	//   57  128:astore          6
				float f1 = entry.getX() + (entry1.getX() - entry.getX()) / 2.0F;
	//   58  130:aload           5
	//   59  132:invokevirtual   #125 <Method float Entry.getX()>
	//   60  135:aload           6
	//   61  137:invokevirtual   #125 <Method float Entry.getX()>
	//   62  140:aload           5
	//   63  142:invokevirtual   #125 <Method float Entry.getX()>
	//   64  145:fsub            
	//   65  146:fconst_2        
	//   66  147:fdiv            
	//   67  148:fadd            
	//   68  149:fstore_3        
				p.cubicTo(f1, entry.getY() * f, f1, entry1.getY() * f, entry1.getX(), entry1.getY() * f);
	//   69  150:aload_0         
	//   70  151:getfield        #48  <Field Path p>
	//   71  154:fload_3         
	//   72  155:aload           5
	//   73  157:invokevirtual   #132 <Method float Entry.getY()>
	//   74  160:fload_2         
	//   75  161:fmul            
	//   76  162:fload_3         
	//   77  163:aload           6
	//   78  165:invokevirtual   #132 <Method float Entry.getY()>
	//   79  168:fload_2         
	//   80  169:fmul            
	//   81  170:aload           6
	//   82  172:invokevirtual   #125 <Method float Entry.getX()>
	//   83  175:aload           6
	//   84  177:invokevirtual   #132 <Method float Entry.getY()>
	//   85  180:fload_2         
	//   86  181:fmul            
	//   87  182:invokevirtual   #378 <Method void Path.cubicTo(float, float, float, float, float, float)>
				i++;
	//   88  185:iload           4
	//   89  187:iconst_1        
	//   90  188:iadd            
	//   91  189:istore          4
				entry = entry1;
	//   92  191:aload           6
	//   93  193:astore          5
			}

		}
	//*  94  195:goto            100
		if(na1.V())
	//*  95  198:aload_1         
	//*  96  199:invokeinterface #253 <Method boolean na.V()>
	//*  97  204:ifeq            244
		{
			o.reset();
	//   98  207:aload_0         
	//   99  208:getfield        #50  <Field Path o>
	//  100  211:invokevirtual   #116 <Method void Path.reset()>
			o.addPath(p);
	//  101  214:aload_0         
	//  102  215:getfield        #50  <Field Path o>
	//  103  218:aload_0         
	//  104  219:getfield        #48  <Field Path p>
	//  105  222:invokevirtual   #381 <Method void Path.addPath(Path)>
			e(a, na1, o, nv1, this.f);
	//  106  225:aload_0         
	//  107  226:aload_0         
	//  108  227:getfield        #181 <Field Canvas a>
	//  109  230:aload_1         
	//  110  231:aload_0         
	//  111  232:getfield        #50  <Field Path o>
	//  112  235:aload           7
	//  113  237:aload_0         
	//  114  238:getfield        #245 <Field nk$d f>
	//  115  241:invokevirtual   #384 <Method void e(Canvas, na, Path, nv, nk$d)>
		}
		h.setColor(na1.m());
	//  116  244:aload_0         
	//  117  245:getfield        #219 <Field Paint h>
	//  118  248:aload_1         
	//  119  249:invokeinterface #298 <Method int na.m()>
	//  120  254:invokevirtual   #83  <Method void Paint.setColor(int)>
		h.setStyle(android.graphics.Paint.Style.STROKE);
	//  121  257:aload_0         
	//  122  258:getfield        #219 <Field Paint h>
	//  123  261:getstatic       #239 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//  124  264:invokevirtual   #80  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		nv1.a(p);
	//  125  267:aload           7
	//  126  269:aload_0         
	//  127  270:getfield        #48  <Field Path p>
	//  128  273:invokevirtual   #307 <Method void nv.a(Path)>
		a.drawPath(p, h);
	//  129  276:aload_0         
	//  130  277:getfield        #181 <Field Canvas a>
	//  131  280:aload_0         
	//  132  281:getfield        #48  <Field Path p>
	//  133  284:aload_0         
	//  134  285:getfield        #219 <Field Paint h>
	//  135  288:invokevirtual   #388 <Method void Canvas.drawPath(Path, Paint)>
		h.setPathEffect(((android.graphics.PathEffect) (null)));
	//  136  291:aload_0         
	//  137  292:getfield        #219 <Field Paint h>
	//  138  295:aconst_null     
	//  139  296:invokevirtual   #302 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  140  299:pop             
	//  141  300:return          
	}

	public void d()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field Canvas a>
	//*   2    4:ifnull          20
		{
			a.setBitmap(((Bitmap) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #181 <Field Canvas a>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #413 <Method void Canvas.setBitmap(Bitmap)>
			a = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #181 <Field Canvas a>
		}
		if(e != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #152 <Field WeakReference e>
	//*  12   24:ifnull          52
		{
			((Bitmap)e.get()).recycle();
	//   13   27:aload_0         
	//   14   28:getfield        #152 <Field WeakReference e>
	//   15   31:invokevirtual   #158 <Method Object WeakReference.get()>
	//   16   34:checkcast       #160 <Class Bitmap>
	//   17   37:invokevirtual   #416 <Method void Bitmap.recycle()>
			e.clear();
	//   18   40:aload_0         
	//   19   41:getfield        #152 <Field WeakReference e>
	//   20   44:invokevirtual   #419 <Method void WeakReference.clear()>
			e = null;
	//   21   47:aload_0         
	//   22   48:aconst_null     
	//   23   49:putfield        #152 <Field WeakReference e>
		}
	//   24   52:return          
	}

	public void d(Canvas canvas)
	{
		b(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #421 <Method void b(Canvas)>
	//    3    5:return          
	}

	public void d(Canvas canvas, mh amh[])
	{
		lx lx1 = c.getLineData();
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field mu c>
	//    2    4:invokeinterface #190 <Method lx mu.getLineData()>
	//    3    9:astore          5
		int j = amh.length;
	//    4   11:aload_2         
	//    5   12:arraylength     
	//    6   13:istore          4
		for(int i = 0; i < j; i++)
	//*   7   15:iconst_0        
	//*   8   16:istore_3        
	//*   9   17:iload_3         
	//*  10   18:iload           4
	//*  11   20:icmpge          176
		{
			mh mh1 = amh[i];
	//   12   23:aload_2         
	//   13   24:iload_3         
	//   14   25:aaload          
	//   15   26:astore          6
			na na1 = (na)lx1.a(mh1.g());
	//   16   28:aload           5
	//   17   30:aload           6
	//   18   32:invokevirtual   #426 <Method int mh.g()>
	//   19   35:invokevirtual   #429 <Method mz lx.a(int)>
	//   20   38:checkcast       #87  <Class na>
	//   21   41:astore          7
			if(na1 == null || !na1.n())
	//*  22   43:aload           7
	//*  23   45:ifnull          169
	//*  24   48:aload           7
	//*  25   50:invokeinterface #431 <Method boolean na.n()>
	//*  26   55:ifne            61
				continue;
	//   27   58:goto            169
			Object obj = ((Object) (na1.e(mh1.b(), mh1.d())));
	//   28   61:aload           7
	//   29   63:aload           6
	//   30   65:invokevirtual   #432 <Method float mh.b()>
	//   31   68:aload           6
	//   32   70:invokevirtual   #433 <Method float mh.d()>
	//   33   73:invokeinterface #436 <Method Entry na.e(float, float)>
	//   34   78:astore          8
			if(d(((Entry) (obj)), ((mv) (na1))))
	//*  35   80:aload_0         
	//*  36   81:aload           8
	//*  37   83:aload           7
	//*  38   85:invokevirtual   #439 <Method boolean d(Entry, mv)>
	//*  39   88:ifne            94
	//*  40   91:goto            169
			{
				obj = ((Object) (c.b(na1.D()).d(((Entry) (obj)).getX(), ((Entry) (obj)).getY() * this.i.d())));
	//   41   94:aload_0         
	//   42   95:getfield        #63  <Field mu c>
	//   43   98:aload           7
	//   44  100:invokeinterface #233 <Method lp$b na.D()>
	//   45  105:invokeinterface #236 <Method nv mu.b(lp$b)>
	//   46  110:aload           8
	//   47  112:invokevirtual   #125 <Method float Entry.getX()>
	//   48  115:aload           8
	//   49  117:invokevirtual   #132 <Method float Entry.getY()>
	//   50  120:aload_0         
	//   51  121:getfield        #100 <Field la i>
	//   52  124:invokevirtual   #105 <Method float la.d()>
	//   53  127:fmul            
	//   54  128:invokevirtual   #442 <Method nw nv.d(float, float)>
	//   55  131:astore          8
				mh1.e((float)((nw) (obj)).b, (float)((nw) (obj)).c);
	//   56  133:aload           6
	//   57  135:aload           8
	//   58  137:getfield        #446 <Field double nw.b>
	//   59  140:d2f             
	//   60  141:aload           8
	//   61  143:getfield        #448 <Field double nw.c>
	//   62  146:d2f             
	//   63  147:invokevirtual   #450 <Method void mh.e(float, float)>
				a(canvas, (float)((nw) (obj)).b, (float)((nw) (obj)).c, ((mw) (na1)));
	//   64  150:aload_0         
	//   65  151:aload_1         
	//   66  152:aload           8
	//   67  154:getfield        #446 <Field double nw.b>
	//   68  157:d2f             
	//   69  158:aload           8
	//   70  160:getfield        #448 <Field double nw.c>
	//   71  163:d2f             
	//   72  164:aload           7
	//   73  166:invokevirtual   #453 <Method void a(Canvas, float, float, mw)>
			}
		}

	//   74  169:iload_3         
	//   75  170:iconst_1        
	//   76  171:iadd            
	//   77  172:istore_3        
	//*  78  173:goto            17
	//   79  176:return          
	}

	public void e()
	{
	//    0    0:return          
	}

	public void e(Canvas canvas)
	{
		if(c(((mr) (c))))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:getfield        #63  <Field mu c>
	//*   3    5:invokevirtual   #456 <Method boolean c(mr)>
	//*   4    8:ifeq            425
		{
			List list = c.getLineData().h();
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field mu c>
	//    7   15:invokeinterface #190 <Method lx mu.getLineData()>
	//    8   20:invokevirtual   #196 <Method List lx.h()>
	//    9   23:astore          7
			for(int i = 0; i < list.size(); i++)
	//*  10   25:iconst_0        
	//*  11   26:istore          4
	//*  12   28:iload           4
	//*  13   30:aload           7
	//*  14   32:invokeinterface #262 <Method int List.size()>
	//*  15   37:icmpge          425
			{
				na na1 = (na)list.get(i);
	//   16   40:aload           7
	//   17   42:iload           4
	//   18   44:invokeinterface #326 <Method Object List.get(int)>
	//   19   49:checkcast       #87  <Class na>
	//   20   52:astore          8
				if(!c(((mz) (na1))))
	//*  21   54:aload_0         
	//*  22   55:aload           8
	//*  23   57:invokevirtual   #459 <Method boolean c(mz)>
	//*  24   60:ifne            66
					continue;
	//   25   63:goto            416
				e(((mz) (na1)));
	//   26   66:aload_0         
	//   27   67:aload           8
	//   28   69:invokevirtual   #462 <Method void e(mz)>
				nv nv1 = c.b(na1.D());
	//   29   72:aload_0         
	//   30   73:getfield        #63  <Field mu c>
	//   31   76:aload           8
	//   32   78:invokeinterface #233 <Method lp$b na.D()>
	//   33   83:invokeinterface #236 <Method nv mu.b(lp$b)>
	//   34   88:astore          9
				int k = (int)(na1.e() * 1.75F);
	//   35   90:aload           8
	//   36   92:invokeinterface #334 <Method float na.e()>
	//   37   97:ldc2            #463 <Float 1.75F>
	//   38  100:fmul            
	//   39  101:f2i             
	//   40  102:istore          6
				int j = k;
	//   41  104:iload           6
	//   42  106:istore          5
				if(!na1.M())
	//*  43  108:aload           8
	//*  44  110:invokeinterface #329 <Method boolean na.M()>
	//*  45  115:ifne            124
					j = k / 2;
	//   46  118:iload           6
	//   47  120:iconst_2        
	//   48  121:idiv            
	//   49  122:istore          5
				this.f.b(((mn) (c)), ((mv) (na1)));
	//   50  124:aload_0         
	//   51  125:getfield        #245 <Field nk$d f>
	//   52  128:aload_0         
	//   53  129:getfield        #63  <Field mu c>
	//   54  132:aload           8
	//   55  134:invokevirtual   #250 <Method void nk$d.b(mn, mv)>
				float af[] = nv1.a(na1, this.i.b(), this.i.d(), this.f.c, this.f.d);
	//   56  137:aload           9
	//   57  139:aload           8
	//   58  141:aload_0         
	//   59  142:getfield        #100 <Field la i>
	//   60  145:invokevirtual   #367 <Method float la.b()>
	//   61  148:aload_0         
	//   62  149:getfield        #100 <Field la i>
	//   63  152:invokevirtual   #105 <Method float la.d()>
	//   64  155:aload_0         
	//   65  156:getfield        #245 <Field nk$d f>
	//   66  159:getfield        #265 <Field int nk$d.c>
	//   67  162:aload_0         
	//   68  163:getfield        #245 <Field nk$d f>
	//   69  166:getfield        #269 <Field int nk$d.d>
	//   70  169:invokevirtual   #466 <Method float[] nv.a(na, float, float, int, int)>
	//   71  172:astore          9
				nz nz1 = nz.b(na1.z());
	//   72  174:aload           8
	//   73  176:invokeinterface #470 <Method nz na.z()>
	//   74  181:invokestatic    #475 <Method nz nz.b(nz)>
	//   75  184:astore          10
				nz1.e = oc.b(nz1.e);
	//   76  186:aload           10
	//   77  188:aload           10
	//   78  190:getfield        #478 <Field float nz.e>
	//   79  193:invokestatic    #483 <Method float oc.b(float)>
	//   80  196:putfield        #478 <Field float nz.e>
				nz1.c = oc.b(nz1.c);
	//   81  199:aload           10
	//   82  201:aload           10
	//   83  203:getfield        #485 <Field float nz.c>
	//   84  206:invokestatic    #483 <Method float oc.b(float)>
	//   85  209:putfield        #485 <Field float nz.c>
				for(int l = 0; l < af.length; l += 2)
	//*  86  212:iconst_0        
	//*  87  213:istore          6
	//*  88  215:iload           6
	//*  89  217:aload           9
	//*  90  219:arraylength     
	//*  91  220:icmpge          411
				{
					float f = af[l];
	//   92  223:aload           9
	//   93  225:iload           6
	//   94  227:faload          
	//   95  228:fstore_2        
					float f1 = af[l + 1];
	//   96  229:aload           9
	//   97  231:iload           6
	//   98  233:iconst_1        
	//   99  234:iadd            
	//  100  235:faload          
	//  101  236:fstore_3        
					if(!this.l.k(f))
	//* 102  237:aload_0         
	//* 103  238:getfield        #143 <Field oa l>
	//* 104  241:fload_2         
	//* 105  242:invokevirtual   #277 <Method boolean oa.k(float)>
	//* 106  245:ifne            251
						break;
	//  107  248:goto            411
					if(!this.l.i(f) || !this.l.g(f1))
	//* 108  251:aload_0         
	//* 109  252:getfield        #143 <Field oa l>
	//* 110  255:fload_2         
	//* 111  256:invokevirtual   #279 <Method boolean oa.i(float)>
	//* 112  259:ifeq            402
	//* 113  262:aload_0         
	//* 114  263:getfield        #143 <Field oa l>
	//* 115  266:fload_3         
	//* 116  267:invokevirtual   #362 <Method boolean oa.g(float)>
	//* 117  270:ifne            276
						continue;
	//  118  273:goto            402
					Object obj = ((Object) (na1.f(l / 2 + this.f.c)));
	//  119  276:aload           8
	//  120  278:iload           6
	//  121  280:iconst_2        
	//  122  281:idiv            
	//  123  282:aload_0         
	//  124  283:getfield        #245 <Field nk$d f>
	//  125  286:getfield        #265 <Field int nk$d.c>
	//  126  289:iadd            
	//  127  290:invokeinterface #120 <Method Entry na.f(int)>
	//  128  295:astore          11
					if(na1.v())
	//* 129  297:aload           8
	//* 130  299:invokeinterface #488 <Method boolean na.v()>
	//* 131  304:ifeq            345
						d(canvas, na1.l(), ((Entry) (obj)).getY(), ((Entry) (obj)), i, f, f1 - (float)j, na1.b(l / 2));
	//  132  307:aload_0         
	//  133  308:aload_1         
	//  134  309:aload           8
	//  135  311:invokeinterface #491 <Method ml na.l()>
	//  136  316:aload           11
	//  137  318:invokevirtual   #132 <Method float Entry.getY()>
	//  138  321:aload           11
	//  139  323:iload           4
	//  140  325:fload_2         
	//  141  326:fload_3         
	//  142  327:iload           5
	//  143  329:i2f             
	//  144  330:fsub            
	//  145  331:aload           8
	//  146  333:iload           6
	//  147  335:iconst_2        
	//  148  336:idiv            
	//  149  337:invokeinterface #493 <Method int na.b(int)>
	//  150  342:invokevirtual   #496 <Method void d(Canvas, ml, float, Entry, int, float, float, int)>
					if(((Entry) (obj)).getIcon() != null && na1.x())
	//* 151  345:aload           11
	//* 152  347:invokevirtual   #499 <Method Drawable Entry.getIcon()>
	//* 153  350:ifnull          402
	//* 154  353:aload           8
	//* 155  355:invokeinterface #502 <Method boolean na.x()>
	//* 156  360:ifeq            402
					{
						obj = ((Object) (((Entry) (obj)).getIcon()));
	//  157  363:aload           11
	//  158  365:invokevirtual   #499 <Method Drawable Entry.getIcon()>
	//  159  368:astore          11
						oc.d(canvas, ((Drawable) (obj)), (int)(nz1.e + f), (int)(nz1.c + f1), ((Drawable) (obj)).getIntrinsicWidth(), ((Drawable) (obj)).getIntrinsicHeight());
	//  160  370:aload_1         
	//  161  371:aload           11
	//  162  373:aload           10
	//  163  375:getfield        #478 <Field float nz.e>
	//  164  378:fload_2         
	//  165  379:fadd            
	//  166  380:f2i             
	//  167  381:aload           10
	//  168  383:getfield        #485 <Field float nz.c>
	//  169  386:fload_3         
	//  170  387:fadd            
	//  171  388:f2i             
	//  172  389:aload           11
	//  173  391:invokevirtual   #507 <Method int Drawable.getIntrinsicWidth()>
	//  174  394:aload           11
	//  175  396:invokevirtual   #510 <Method int Drawable.getIntrinsicHeight()>
	//  176  399:invokestatic    #513 <Method void oc.d(Canvas, Drawable, int, int, int, int)>
					}
				}

	//  177  402:iload           6
	//  178  404:iconst_2        
	//  179  405:iadd            
	//  180  406:istore          6
	//* 181  408:goto            215
				nz.c(nz1);
	//  182  411:aload           10
	//  183  413:invokestatic    #516 <Method void nz.c(nz)>
			}

	//  184  416:iload           4
	//  185  418:iconst_1        
	//  186  419:iadd            
	//  187  420:istore          4
		}
	//* 188  422:goto            28
	//  189  425:return          
	}

	protected void e(Canvas canvas, na na1, Path path, nv nv1, nk.d d1)
	{
		float f = na1.R().e(na1, c);
	//    0    0:aload_2         
	//    1    1:invokeinterface #91  <Method mj na.R()>
	//    2    6:aload_2         
	//    3    7:aload_0         
	//    4    8:getfield        #63  <Field mu c>
	//    5   11:invokeinterface #96  <Method float mj.e(na, mu)>
	//    6   16:fstore          6
		path.lineTo(na1.f(d1.c + d1.a).getX(), f);
	//    7   18:aload_3         
	//    8   19:aload_2         
	//    9   20:aload           5
	//   10   22:getfield        #265 <Field int nk$d.c>
	//   11   25:aload           5
	//   12   27:getfield        #267 <Field int nk$d.a>
	//   13   30:iadd            
	//   14   31:invokeinterface #120 <Method Entry na.f(int)>
	//   15   36:invokevirtual   #125 <Method float Entry.getX()>
	//   16   39:fload           6
	//   17   41:invokevirtual   #135 <Method void Path.lineTo(float, float)>
		path.lineTo(na1.f(d1.c).getX(), f);
	//   18   44:aload_3         
	//   19   45:aload_2         
	//   20   46:aload           5
	//   21   48:getfield        #265 <Field int nk$d.c>
	//   22   51:invokeinterface #120 <Method Entry na.f(int)>
	//   23   56:invokevirtual   #125 <Method float Entry.getX()>
	//   24   59:fload           6
	//   25   61:invokevirtual   #135 <Method void Path.lineTo(float, float)>
		path.close();
	//   26   64:aload_3         
	//   27   65:invokevirtual   #138 <Method void Path.close()>
		nv1.a(path);
	//   28   68:aload           4
	//   29   70:aload_3         
	//   30   71:invokevirtual   #307 <Method void nv.a(Path)>
		nv1 = ((nv) (na1.Q()));
	//   31   74:aload_2         
	//   32   75:invokeinterface #311 <Method Drawable na.Q()>
	//   33   80:astore          4
		if(nv1 != null)
	//*  34   82:aload           4
	//*  35   84:ifnull          96
		{
			d(canvas, path, ((Drawable) (nv1)));
	//   36   87:aload_0         
	//   37   88:aload_1         
	//   38   89:aload_3         
	//   39   90:aload           4
	//   40   92:invokevirtual   #314 <Method void d(Canvas, Path, Drawable)>
			return;
	//   41   95:return          
		} else
		{
			b(canvas, path, na1.O(), na1.S());
	//   42   96:aload_0         
	//   43   97:aload_1         
	//   44   98:aload_3         
	//   45   99:aload_2         
	//   46  100:invokeinterface #317 <Method int na.O()>
	//   47  105:aload_2         
	//   48  106:invokeinterface #320 <Method int na.S()>
	//   49  111:invokevirtual   #323 <Method void b(Canvas, Path, int, int)>
			return;
	//   50  114:return          
		}
	}

	protected Canvas a;
	protected Paint b;
	protected mu c;
	protected android.graphics.Bitmap.Config d;
	protected WeakReference e;
	protected Path m;
	protected Path o;
	protected Path p;
	private float q[];
	private float r[];
	private HashMap u;
}
