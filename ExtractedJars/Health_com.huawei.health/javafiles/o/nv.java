// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.*;
import com.github.mikephil.charting.data.Entry;

// Referenced classes of package o:
//			oa, na, nw

public class nv
{

	public nv(oa oa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		d = new Matrix();
	//    2    4:aload_0         
	//    3    5:new             #25  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void Matrix()>
	//    6   12:putfield        #28  <Field Matrix d>
		c = new Matrix();
	//    7   15:aload_0         
	//    8   16:new             #25  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #26  <Method void Matrix()>
	//   11   23:putfield        #30  <Field Matrix c>
		b = new float[1];
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:newarray        float[]
	//   15   30:putfield        #32  <Field float[] b>
		e = new float[1];
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:newarray        float[]
	//   19   37:putfield        #34  <Field float[] e>
		i = new float[1];
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:newarray        float[]
	//   23   44:putfield        #36  <Field float[] i>
		h = new float[1];
	//   24   47:aload_0         
	//   25   48:iconst_1        
	//   26   49:newarray        float[]
	//   27   51:putfield        #38  <Field float[] h>
		k = new Matrix();
	//   28   54:aload_0         
	//   29   55:new             #25  <Class Matrix>
	//   30   58:dup             
	//   31   59:invokespecial   #26  <Method void Matrix()>
	//   32   62:putfield        #40  <Field Matrix k>
		g = new float[2];
	//   33   65:aload_0         
	//   34   66:iconst_2        
	//   35   67:newarray        float[]
	//   36   69:putfield        #42  <Field float[] g>
		f = new Matrix();
	//   37   72:aload_0         
	//   38   73:new             #25  <Class Matrix>
	//   39   76:dup             
	//   40   77:invokespecial   #26  <Method void Matrix()>
	//   41   80:putfield        #44  <Field Matrix f>
		l = new Matrix();
	//   42   83:aload_0         
	//   43   84:new             #25  <Class Matrix>
	//   44   87:dup             
	//   45   88:invokespecial   #26  <Method void Matrix()>
	//   46   91:putfield        #46  <Field Matrix l>
		a = oa1;
	//   47   94:aload_0         
	//   48   95:aload_1         
	//   49   96:putfield        #48  <Field oa a>
	//   50   99:return          
	}

	public void a(Path path)
	{
		path.transform(d);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #28  <Field Matrix d>
	//    3    5:invokevirtual   #56  <Method void Path.transform(Matrix)>
		path.transform(a.p());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field oa a>
	//    7   13:invokevirtual   #62  <Method Matrix oa.p()>
	//    8   16:invokevirtual   #56  <Method void Path.transform(Matrix)>
		path.transform(c);
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #30  <Field Matrix c>
	//   12   24:invokevirtual   #56  <Method void Path.transform(Matrix)>
	//   13   27:return          
	}

	public float[] a(na na1, float f1, float f2, int j, int i1)
	{
		int j1 = ((int)((float)(i1 - j) * f1) + 1) * 2;
	//    0    0:iload           5
	//    1    2:iload           4
	//    2    4:isub            
	//    3    5:i2f             
	//    4    6:fload_2         
	//    5    7:fmul            
	//    6    8:f2i             
	//    7    9:iconst_1        
	//    8   10:iadd            
	//    9   11:iconst_2        
	//   10   12:imul            
	//   11   13:istore          6
		if(i.length != j1)
	//*  12   15:aload_0         
	//*  13   16:getfield        #36  <Field float[] i>
	//*  14   19:arraylength     
	//*  15   20:iload           6
	//*  16   22:icmpeq          33
			i = new float[j1];
	//   17   25:aload_0         
	//   18   26:iload           6
	//   19   28:newarray        float[]
	//   20   30:putfield        #36  <Field float[] i>
		float af[] = i;
	//   21   33:aload_0         
	//   22   34:getfield        #36  <Field float[] i>
	//   23   37:astore          7
		for(i1 = 0; i1 < j1; i1 += 2)
	//*  24   39:iconst_0        
	//*  25   40:istore          5
	//*  26   42:iload           5
	//*  27   44:iload           6
	//*  28   46:icmpge          119
		{
			Entry entry = na1.f(i1 / 2 + j);
	//   29   49:aload_1         
	//   30   50:iload           5
	//   31   52:iconst_2        
	//   32   53:idiv            
	//   33   54:iload           4
	//   34   56:iadd            
	//   35   57:invokeinterface #68  <Method Entry na.f(int)>
	//   36   62:astore          8
			if(entry != null)
	//*  37   64:aload           8
	//*  38   66:ifnull          96
			{
				af[i1] = entry.getX();
	//   39   69:aload           7
	//   40   71:iload           5
	//   41   73:aload           8
	//   42   75:invokevirtual   #74  <Method float Entry.getX()>
	//   43   78:fastore         
				af[i1 + 1] = entry.getY() * f2;
	//   44   79:aload           7
	//   45   81:iload           5
	//   46   83:iconst_1        
	//   47   84:iadd            
	//   48   85:aload           8
	//   49   87:invokevirtual   #77  <Method float Entry.getY()>
	//   50   90:fload_3         
	//   51   91:fmul            
	//   52   92:fastore         
			} else
	//*  53   93:goto            110
			{
				af[i1] = 0.0F;
	//   54   96:aload           7
	//   55   98:iload           5
	//   56  100:fconst_0        
	//   57  101:fastore         
				af[i1 + 1] = 0.0F;
	//   58  102:aload           7
	//   59  104:iload           5
	//   60  106:iconst_1        
	//   61  107:iadd            
	//   62  108:fconst_0        
	//   63  109:fastore         
			}
		}

	//   64  110:iload           5
	//   65  112:iconst_2        
	//   66  113:iadd            
	//   67  114:istore          5
	//*  68  116:goto            42
		c().mapPoints(af);
	//   69  119:aload_0         
	//   70  120:invokevirtual   #79  <Method Matrix c()>
	//   71  123:aload           7
	//   72  125:invokevirtual   #83  <Method void Matrix.mapPoints(float[])>
		return af;
	//   73  128:aload           7
	//   74  130:areturn         
	}

	public nw b(float f1, float f2)
	{
		nw nw1 = nw.a(0.0D, 0.0D);
	//    0    0:dconst_0        
	//    1    1:dconst_0        
	//    2    2:invokestatic    #89  <Method nw nw.a(double, double)>
	//    3    5:astore_3        
		b(f1, f2, nw1);
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:fload_2         
	//    7    9:aload_3         
	//    8   10:invokevirtual   #92  <Method void b(float, float, nw)>
		return nw1;
	//    9   13:aload_3         
	//   10   14:areturn         
	}

	public void b(float f1, float f2, nw nw1)
	{
		g[0] = f1;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float[] g>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:fastore         
		g[1] = f2;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field float[] g>
	//    7   11:iconst_1        
	//    8   12:fload_2         
	//    9   13:fastore         
		d(g);
	//   10   14:aload_0         
	//   11   15:aload_0         
	//   12   16:getfield        #42  <Field float[] g>
	//   13   19:invokevirtual   #94  <Method void d(float[])>
		nw1.b = g[0];
	//   14   22:aload_3         
	//   15   23:aload_0         
	//   16   24:getfield        #42  <Field float[] g>
	//   17   27:iconst_0        
	//   18   28:faload          
	//   19   29:f2d             
	//   20   30:putfield        #97  <Field double nw.b>
		nw1.c = g[1];
	//   21   33:aload_3         
	//   22   34:aload_0         
	//   23   35:getfield        #42  <Field float[] g>
	//   24   38:iconst_1        
	//   25   39:faload          
	//   26   40:f2d             
	//   27   41:putfield        #99  <Field double nw.c>
	//   28   44:return          
	}

	public void b(RectF rectf)
	{
		d.mapRect(rectf);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Matrix d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//    4    8:pop             
		a.p().mapRect(rectf);
	//    5    9:aload_0         
	//    6   10:getfield        #48  <Field oa a>
	//    7   13:invokevirtual   #62  <Method Matrix oa.p()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   10   20:pop             
		c.mapRect(rectf);
	//   11   21:aload_0         
	//   12   22:getfield        #30  <Field Matrix c>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   15   29:pop             
	//   16   30:return          
	}

	public Matrix c()
	{
		f.set(d);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Matrix f>
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field Matrix d>
	//    4    8:invokevirtual   #107 <Method void Matrix.set(Matrix)>
		f.postConcat(a.b);
	//    5   11:aload_0         
	//    6   12:getfield        #44  <Field Matrix f>
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field oa a>
	//    9   19:getfield        #109 <Field Matrix oa.b>
	//   10   22:invokevirtual   #113 <Method boolean Matrix.postConcat(Matrix)>
	//   11   25:pop             
		f.postConcat(c);
	//   12   26:aload_0         
	//   13   27:getfield        #44  <Field Matrix f>
	//   14   30:aload_0         
	//   15   31:getfield        #30  <Field Matrix c>
	//   16   34:invokevirtual   #113 <Method boolean Matrix.postConcat(Matrix)>
	//   17   37:pop             
		return f;
	//   18   38:aload_0         
	//   19   39:getfield        #44  <Field Matrix f>
	//   20   42:areturn         
	}

	public nw d(float f1, float f2)
	{
		g[0] = f1;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field float[] g>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:fastore         
		g[1] = f2;
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field float[] g>
	//    7   11:iconst_1        
	//    8   12:fload_2         
	//    9   13:fastore         
		e(g);
	//   10   14:aload_0         
	//   11   15:aload_0         
	//   12   16:getfield        #42  <Field float[] g>
	//   13   19:invokevirtual   #115 <Method void e(float[])>
		return nw.a(g[0], g[1]);
	//   14   22:aload_0         
	//   15   23:getfield        #42  <Field float[] g>
	//   16   26:iconst_0        
	//   17   27:faload          
	//   18   28:f2d             
	//   19   29:aload_0         
	//   20   30:getfield        #42  <Field float[] g>
	//   21   33:iconst_1        
	//   22   34:faload          
	//   23   35:f2d             
	//   24   36:invokestatic    #89  <Method nw nw.a(double, double)>
	//   25   39:areturn         
	}

	public void d(RectF rectf, float f1)
	{
		rectf.top = rectf.top * f1;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #122 <Field float RectF.top>
	//    3    5:fload_2         
	//    4    6:fmul            
	//    5    7:putfield        #122 <Field float RectF.top>
		rectf.bottom = rectf.bottom * f1;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #125 <Field float RectF.bottom>
	//    9   15:fload_2         
	//   10   16:fmul            
	//   11   17:putfield        #125 <Field float RectF.bottom>
		d.mapRect(rectf);
	//   12   20:aload_0         
	//   13   21:getfield        #28  <Field Matrix d>
	//   14   24:aload_1         
	//   15   25:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   16   28:pop             
		a.p().mapRect(rectf);
	//   17   29:aload_0         
	//   18   30:getfield        #48  <Field oa a>
	//   19   33:invokevirtual   #62  <Method Matrix oa.p()>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   22   40:pop             
		c.mapRect(rectf);
	//   23   41:aload_0         
	//   24   42:getfield        #30  <Field Matrix c>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   27   49:pop             
	//   28   50:return          
	}

	public void d(float af[])
	{
		Matrix matrix = k;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Matrix k>
	//    2    4:astore_2        
		matrix.reset();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #128 <Method void Matrix.reset()>
		c.invert(matrix);
	//    5    9:aload_0         
	//    6   10:getfield        #30  <Field Matrix c>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #131 <Method boolean Matrix.invert(Matrix)>
	//    9   17:pop             
		matrix.mapPoints(af);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #83  <Method void Matrix.mapPoints(float[])>
		a.p().invert(matrix);
	//   13   23:aload_0         
	//   14   24:getfield        #48  <Field oa a>
	//   15   27:invokevirtual   #62  <Method Matrix oa.p()>
	//   16   30:aload_2         
	//   17   31:invokevirtual   #131 <Method boolean Matrix.invert(Matrix)>
	//   18   34:pop             
		matrix.mapPoints(af);
	//   19   35:aload_2         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #83  <Method void Matrix.mapPoints(float[])>
		d.invert(matrix);
	//   22   40:aload_0         
	//   23   41:getfield        #28  <Field Matrix d>
	//   24   44:aload_2         
	//   25   45:invokevirtual   #131 <Method boolean Matrix.invert(Matrix)>
	//   26   48:pop             
		matrix.mapPoints(af);
	//   27   49:aload_2         
	//   28   50:aload_1         
	//   29   51:invokevirtual   #83  <Method void Matrix.mapPoints(float[])>
	//   30   54:return          
	}

	public void e(float f1, float f2, float f3, float f4)
	{
		float f6 = a.g() / f2;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field oa a>
	//    2    4:invokevirtual   #134 <Method float oa.g()>
	//    3    7:fload_2         
	//    4    8:fdiv            
	//    5    9:fstore          6
		float f5 = a.k() / f3;
	//    6   11:aload_0         
	//    7   12:getfield        #48  <Field oa a>
	//    8   15:invokevirtual   #136 <Method float oa.k()>
	//    9   18:fload_3         
	//   10   19:fdiv            
	//   11   20:fstore          5
		f2 = f6;
	//   12   22:fload           6
	//   13   24:fstore_2        
		if(Float.isInfinite(f6))
	//*  14   25:fload           6
	//*  15   27:invokestatic    #142 <Method boolean Float.isInfinite(float)>
	//*  16   30:ifeq            35
			f2 = 0.0F;
	//   17   33:fconst_0        
	//   18   34:fstore_2        
		f3 = f5;
	//   19   35:fload           5
	//   20   37:fstore_3        
		if(Float.isInfinite(f5))
	//*  21   38:fload           5
	//*  22   40:invokestatic    #142 <Method boolean Float.isInfinite(float)>
	//*  23   43:ifeq            48
			f3 = 0.0F;
	//   24   46:fconst_0        
	//   25   47:fstore_3        
		d.reset();
	//   26   48:aload_0         
	//   27   49:getfield        #28  <Field Matrix d>
	//   28   52:invokevirtual   #128 <Method void Matrix.reset()>
		d.postTranslate(-f1, -f4);
	//   29   55:aload_0         
	//   30   56:getfield        #28  <Field Matrix d>
	//   31   59:fload_1         
	//   32   60:fneg            
	//   33   61:fload           4
	//   34   63:fneg            
	//   35   64:invokevirtual   #146 <Method boolean Matrix.postTranslate(float, float)>
	//   36   67:pop             
		d.postScale(f2, -f3);
	//   37   68:aload_0         
	//   38   69:getfield        #28  <Field Matrix d>
	//   39   72:fload_2         
	//   40   73:fload_3         
	//   41   74:fneg            
	//   42   75:invokevirtual   #149 <Method boolean Matrix.postScale(float, float)>
	//   43   78:pop             
	//   44   79:return          
	}

	public void e(RectF rectf, float f1)
	{
		rectf.left = rectf.left * f1;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #152 <Field float RectF.left>
	//    3    5:fload_2         
	//    4    6:fmul            
	//    5    7:putfield        #152 <Field float RectF.left>
		rectf.right = rectf.right * f1;
	//    6   10:aload_1         
	//    7   11:aload_1         
	//    8   12:getfield        #155 <Field float RectF.right>
	//    9   15:fload_2         
	//   10   16:fmul            
	//   11   17:putfield        #155 <Field float RectF.right>
		d.mapRect(rectf);
	//   12   20:aload_0         
	//   13   21:getfield        #28  <Field Matrix d>
	//   14   24:aload_1         
	//   15   25:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   16   28:pop             
		a.p().mapRect(rectf);
	//   17   29:aload_0         
	//   18   30:getfield        #48  <Field oa a>
	//   19   33:invokevirtual   #62  <Method Matrix oa.p()>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   22   40:pop             
		c.mapRect(rectf);
	//   23   41:aload_0         
	//   24   42:getfield        #30  <Field Matrix c>
	//   25   45:aload_1         
	//   26   46:invokevirtual   #104 <Method boolean Matrix.mapRect(RectF)>
	//   27   49:pop             
	//   28   50:return          
	}

	public void e(boolean flag)
	{
		c.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Matrix c>
	//    2    4:invokevirtual   #128 <Method void Matrix.reset()>
		if(!flag)
	//*   3    7:iload_1         
	//*   4    8:ifne            42
		{
			c.postTranslate(a.a(), a.n() - a.d());
	//    5   11:aload_0         
	//    6   12:getfield        #30  <Field Matrix c>
	//    7   15:aload_0         
	//    8   16:getfield        #48  <Field oa a>
	//    9   19:invokevirtual   #158 <Method float oa.a()>
	//   10   22:aload_0         
	//   11   23:getfield        #48  <Field oa a>
	//   12   26:invokevirtual   #161 <Method float oa.n()>
	//   13   29:aload_0         
	//   14   30:getfield        #48  <Field oa a>
	//   15   33:invokevirtual   #163 <Method float oa.d()>
	//   16   36:fsub            
	//   17   37:invokevirtual   #146 <Method boolean Matrix.postTranslate(float, float)>
	//   18   40:pop             
			return;
	//   19   41:return          
		} else
		{
			c.setTranslate(a.a(), -a.c());
	//   20   42:aload_0         
	//   21   43:getfield        #30  <Field Matrix c>
	//   22   46:aload_0         
	//   23   47:getfield        #48  <Field oa a>
	//   24   50:invokevirtual   #158 <Method float oa.a()>
	//   25   53:aload_0         
	//   26   54:getfield        #48  <Field oa a>
	//   27   57:invokevirtual   #165 <Method float oa.c()>
	//   28   60:fneg            
	//   29   61:invokevirtual   #169 <Method void Matrix.setTranslate(float, float)>
			c.postScale(1.0F, -1F);
	//   30   64:aload_0         
	//   31   65:getfield        #30  <Field Matrix c>
	//   32   68:fconst_1        
	//   33   69:ldc1            #170 <Float -1F>
	//   34   71:invokevirtual   #149 <Method boolean Matrix.postScale(float, float)>
	//   35   74:pop             
			return;
	//   36   75:return          
		}
	}

	public void e(float af[])
	{
		d.mapPoints(af);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Matrix d>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #83  <Method void Matrix.mapPoints(float[])>
		a.p().mapPoints(af);
	//    4    8:aload_0         
	//    5    9:getfield        #48  <Field oa a>
	//    6   12:invokevirtual   #62  <Method Matrix oa.p()>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #83  <Method void Matrix.mapPoints(float[])>
		c.mapPoints(af);
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field Matrix c>
	//   11   23:aload_1         
	//   12   24:invokevirtual   #83  <Method void Matrix.mapPoints(float[])>
	//   13   27:return          
	}

	protected oa a;
	protected float b[];
	protected Matrix c;
	protected Matrix d;
	protected float e[];
	private Matrix f;
	float g[];
	protected float h[];
	protected float i[];
	protected Matrix k;
	private Matrix l;
}
