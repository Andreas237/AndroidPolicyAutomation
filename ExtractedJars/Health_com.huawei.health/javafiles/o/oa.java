// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

// Referenced classes of package o:
//			nz, oc

public class oa
{

	public oa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #31  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #32  <Method void Matrix()>
	//    6   12:putfield        #34  <Field Matrix b>
		e = new RectF();
	//    7   15:aload_0         
	//    8   16:new             #36  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void RectF()>
	//   11   23:putfield        #39  <Field RectF e>
		a = 0.0F;
	//   12   26:aload_0         
	//   13   27:fconst_0        
	//   14   28:putfield        #41  <Field float a>
		c = 0.0F;
	//   15   31:aload_0         
	//   16   32:fconst_0        
	//   17   33:putfield        #43  <Field float c>
		g = 1.0F;
	//   18   36:aload_0         
	//   19   37:fconst_1        
	//   20   38:putfield        #45  <Field float g>
		h = 3.402823E+38F;
	//   21   41:aload_0         
	//   22   42:ldc1            #46  <Float 3.402823E+38F>
	//   23   44:putfield        #48  <Field float h>
		k = 1.0F;
	//   24   47:aload_0         
	//   25   48:fconst_1        
	//   26   49:putfield        #50  <Field float k>
		n = 3.402823E+38F;
	//   27   52:aload_0         
	//   28   53:ldc1            #46  <Float 3.402823E+38F>
	//   29   55:putfield        #52  <Field float n>
		m = 1.0F;
	//   30   58:aload_0         
	//   31   59:fconst_1        
	//   32   60:putfield        #54  <Field float m>
		p = 1.0F;
	//   33   63:aload_0         
	//   34   64:fconst_1        
	//   35   65:putfield        #56  <Field float p>
		l = 0.0F;
	//   36   68:aload_0         
	//   37   69:fconst_0        
	//   38   70:putfield        #58  <Field float l>
		o = 0.0F;
	//   39   73:aload_0         
	//   40   74:fconst_0        
	//   41   75:putfield        #60  <Field float o>
		s = 0.0F;
	//   42   78:aload_0         
	//   43   79:fconst_0        
	//   44   80:putfield        #62  <Field float s>
		r = 0.0F;
	//   45   83:aload_0         
	//   46   84:fconst_0        
	//   47   85:putfield        #64  <Field float r>
		d = new float[9];
	//   48   88:aload_0         
	//   49   89:bipush          9
	//   50   91:newarray        float[]
	//   51   93:putfield        #66  <Field float[] d>
		f = new Matrix();
	//   52   96:aload_0         
	//   53   97:new             #31  <Class Matrix>
	//   54  100:dup             
	//   55  101:invokespecial   #32  <Method void Matrix()>
	//   56  104:putfield        #68  <Field Matrix f>
	//   57  107:aload_0         
	//   58  108:bipush          9
	//   59  110:newarray        float[]
	//   60  112:putfield        #70  <Field float[] i>
	//   61  115:return          
	}

	public float a()
	{
		return e.left;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #75  <Field float RectF.left>
	//    3    7:freturn         
	}

	public void a(float f1)
	{
		float f2 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f1 == 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpl           
	//*   5    5:ifne            11
			f2 = 3.402823E+38F;
	//    6    8:ldc1            #46  <Float 3.402823E+38F>
	//    7   10:fstore_2        
		h = f2;
	//    8   11:aload_0         
	//    9   12:fload_2         
	//   10   13:putfield        #48  <Field float h>
		c(b, e);
	//   11   16:aload_0         
	//   12   17:aload_0         
	//   13   18:getfield        #34  <Field Matrix b>
	//   14   21:aload_0         
	//   15   22:getfield        #39  <Field RectF e>
	//   16   25:invokevirtual   #79  <Method void c(Matrix, RectF)>
	//   17   28:return          
	}

	public void a(float f1, float f2)
	{
		float f3 = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #82  <Method float a()>
	//    2    4:fstore_3        
		float f4 = c();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #84  <Method float c()>
	//    5    9:fstore          4
		float f5 = b();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #86  <Method float b()>
	//    8   15:fstore          5
		float f6 = d();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #88  <Method float d()>
	//   11   21:fstore          6
		c = f2;
	//   12   23:aload_0         
	//   13   24:fload_2         
	//   14   25:putfield        #43  <Field float c>
		a = f1;
	//   15   28:aload_0         
	//   16   29:fload_1         
	//   17   30:putfield        #41  <Field float a>
		a(f3, f4, f5, f6);
	//   18   33:aload_0         
	//   19   34:fload_3         
	//   20   35:fload           4
	//   21   37:fload           5
	//   22   39:fload           6
	//   23   41:invokevirtual   #91  <Method void a(float, float, float, float)>
	//   24   44:return          
	}

	public void a(float f1, float f2, float f3, float f4)
	{
		e.set(f1, f2, a - f3, c - f4);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:aload_0         
	//    5    7:getfield        #41  <Field float a>
	//    6   10:fload_3         
	//    7   11:fsub            
	//    8   12:aload_0         
	//    9   13:getfield        #43  <Field float c>
	//   10   16:fload           4
	//   11   18:fsub            
	//   12   19:invokevirtual   #94  <Method void RectF.set(float, float, float, float)>
	//   13   22:return          
	}

	public void a(float f1, float f2, float f3, float f4, Matrix matrix)
	{
		matrix.reset();
	//    0    0:aload           5
	//    1    2:invokevirtual   #98  <Method void Matrix.reset()>
		matrix.set(b);
	//    2    5:aload           5
	//    3    7:aload_0         
	//    4    8:getfield        #34  <Field Matrix b>
	//    5   11:invokevirtual   #101 <Method void Matrix.set(Matrix)>
		matrix.postScale(f1, f2, f3, f4);
	//    6   14:aload           5
	//    7   16:fload_1         
	//    8   17:fload_2         
	//    9   18:fload_3         
	//   10   19:fload           4
	//   11   21:invokevirtual   #105 <Method boolean Matrix.postScale(float, float, float, float)>
	//   12   24:pop             
	//   13   25:return          
	}

	public float b()
	{
		return a - e.right;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float a>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field RectF e>
	//    4    8:getfield        #108 <Field float RectF.right>
	//    5   11:fsub            
	//    6   12:freturn         
	}

	public void b(float f1)
	{
		float f2 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f1 < 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f2 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_2        
		g = f2;
	//    8   10:aload_0         
	//    9   11:fload_2         
	//   10   12:putfield        #45  <Field float g>
		c(b, e);
	//   11   15:aload_0         
	//   12   16:aload_0         
	//   13   17:getfield        #34  <Field Matrix b>
	//   14   20:aload_0         
	//   15   21:getfield        #39  <Field RectF e>
	//   16   24:invokevirtual   #79  <Method void c(Matrix, RectF)>
	//   17   27:return          
	}

	public void b(float f1, float f2)
	{
		float f3 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_3        
		if(f1 < 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f3 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_3        
		f1 = f2;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f2 == 0.0F)
	//*  10   12:fload_2         
	//*  11   13:fconst_0        
	//*  12   14:fcmpl           
	//*  13   15:ifne            21
			f1 = 3.402823E+38F;
	//   14   18:ldc1            #46  <Float 3.402823E+38F>
	//   15   20:fstore_1        
		g = f3;
	//   16   21:aload_0         
	//   17   22:fload_3         
	//   18   23:putfield        #45  <Field float g>
		h = f1;
	//   19   26:aload_0         
	//   20   27:fload_1         
	//   21   28:putfield        #48  <Field float h>
		c(b, e);
	//   22   31:aload_0         
	//   23   32:aload_0         
	//   24   33:getfield        #34  <Field Matrix b>
	//   25   36:aload_0         
	//   26   37:getfield        #39  <Field RectF e>
	//   27   40:invokevirtual   #79  <Method void c(Matrix, RectF)>
	//   28   43:return          
	}

	public float c()
	{
		return e.top;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #111 <Field float RectF.top>
	//    3    7:freturn         
	}

	public void c(Matrix matrix, RectF rectf)
	{
		matrix.getValues(i);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field float[] i>
	//    3    5:invokevirtual   #115 <Method void Matrix.getValues(float[])>
		float f4 = i[2];
	//    4    8:aload_0         
	//    5    9:getfield        #70  <Field float[] i>
	//    6   12:iconst_2        
	//    7   13:faload          
	//    8   14:fstore          6
		float f1 = i[0];
	//    9   16:aload_0         
	//   10   17:getfield        #70  <Field float[] i>
	//   11   20:iconst_0        
	//   12   21:faload          
	//   13   22:fstore_3        
		float f3 = i[5];
	//   14   23:aload_0         
	//   15   24:getfield        #70  <Field float[] i>
	//   16   27:iconst_5        
	//   17   28:faload          
	//   18   29:fstore          5
		float f2 = i[4];
	//   19   31:aload_0         
	//   20   32:getfield        #70  <Field float[] i>
	//   21   35:iconst_4        
	//   22   36:faload          
	//   23   37:fstore          4
		m = Math.min(Math.max(k, f1), n);
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #50  <Field float k>
	//   27   44:fload_3         
	//   28   45:invokestatic    #121 <Method float Math.max(float, float)>
	//   29   48:aload_0         
	//   30   49:getfield        #52  <Field float n>
	//   31   52:invokestatic    #124 <Method float Math.min(float, float)>
	//   32   55:putfield        #54  <Field float m>
		p = Math.min(Math.max(g, f2), h);
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #45  <Field float g>
	//   36   63:fload           4
	//   37   65:invokestatic    #121 <Method float Math.max(float, float)>
	//   38   68:aload_0         
	//   39   69:getfield        #48  <Field float h>
	//   40   72:invokestatic    #124 <Method float Math.min(float, float)>
	//   41   75:putfield        #56  <Field float p>
		f2 = 0.0F;
	//   42   78:fconst_0        
	//   43   79:fstore          4
		f1 = 0.0F;
	//   44   81:fconst_0        
	//   45   82:fstore_3        
		if(rectf != null)
	//*  46   83:aload_2         
	//*  47   84:ifnull          98
		{
			f2 = rectf.width();
	//   48   87:aload_2         
	//   49   88:invokevirtual   #127 <Method float RectF.width()>
	//   50   91:fstore          4
			f1 = rectf.height();
	//   51   93:aload_2         
	//   52   94:invokevirtual   #130 <Method float RectF.height()>
	//   53   97:fstore_3        
		}
		l = Math.min(Math.max(f4, -f2 * (m - 1.0F) - s), s);
	//   54   98:aload_0         
	//   55   99:fload           6
	//   56  101:fload           4
	//   57  103:fneg            
	//   58  104:aload_0         
	//   59  105:getfield        #54  <Field float m>
	//   60  108:fconst_1        
	//   61  109:fsub            
	//   62  110:fmul            
	//   63  111:aload_0         
	//   64  112:getfield        #62  <Field float s>
	//   65  115:fsub            
	//   66  116:invokestatic    #121 <Method float Math.max(float, float)>
	//   67  119:aload_0         
	//   68  120:getfield        #62  <Field float s>
	//   69  123:invokestatic    #124 <Method float Math.min(float, float)>
	//   70  126:putfield        #58  <Field float l>
		f2 = p;
	//   71  129:aload_0         
	//   72  130:getfield        #56  <Field float p>
	//   73  133:fstore          4
		o = Math.max(Math.min(f3, r + f1 * (f2 - 1.0F)), -r);
	//   74  135:aload_0         
	//   75  136:fload           5
	//   76  138:aload_0         
	//   77  139:getfield        #64  <Field float r>
	//   78  142:fload_3         
	//   79  143:fload           4
	//   80  145:fconst_1        
	//   81  146:fsub            
	//   82  147:fmul            
	//   83  148:fadd            
	//   84  149:invokestatic    #124 <Method float Math.min(float, float)>
	//   85  152:aload_0         
	//   86  153:getfield        #64  <Field float r>
	//   87  156:fneg            
	//   88  157:invokestatic    #121 <Method float Math.max(float, float)>
	//   89  160:putfield        #60  <Field float o>
		i[2] = l;
	//   90  163:aload_0         
	//   91  164:getfield        #70  <Field float[] i>
	//   92  167:iconst_2        
	//   93  168:aload_0         
	//   94  169:getfield        #58  <Field float l>
	//   95  172:fastore         
		i[0] = m;
	//   96  173:aload_0         
	//   97  174:getfield        #70  <Field float[] i>
	//   98  177:iconst_0        
	//   99  178:aload_0         
	//  100  179:getfield        #54  <Field float m>
	//  101  182:fastore         
		i[5] = o;
	//  102  183:aload_0         
	//  103  184:getfield        #70  <Field float[] i>
	//  104  187:iconst_5        
	//  105  188:aload_0         
	//  106  189:getfield        #60  <Field float o>
	//  107  192:fastore         
		i[4] = p;
	//  108  193:aload_0         
	//  109  194:getfield        #70  <Field float[] i>
	//  110  197:iconst_4        
	//  111  198:aload_0         
	//  112  199:getfield        #56  <Field float p>
	//  113  202:fastore         
		matrix.setValues(i);
	//  114  203:aload_1         
	//  115  204:aload_0         
	//  116  205:getfield        #70  <Field float[] i>
	//  117  208:invokevirtual   #133 <Method void Matrix.setValues(float[])>
	//  118  211:return          
	}

	public boolean c(float f1)
	{
		return i(f1) && k(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #136 <Method boolean i(float)>
	//    3    5:ifeq            18
	//    4    8:aload_0         
	//    5    9:fload_1         
	//    6   10:invokevirtual   #138 <Method boolean k(float)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public float d()
	{
		return c - e.bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float c>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field RectF e>
	//    4    8:getfield        #141 <Field float RectF.bottom>
	//    5   11:fsub            
	//    6   12:freturn         
	}

	public Matrix d(Matrix matrix, View view, boolean flag)
	{
		b.set(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Matrix b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #101 <Method void Matrix.set(Matrix)>
		c(b, e);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #34  <Field Matrix b>
	//    7   13:aload_0         
	//    8   14:getfield        #39  <Field RectF e>
	//    9   17:invokevirtual   #79  <Method void c(Matrix, RectF)>
		if(flag)
	//*  10   20:iload_3         
	//*  11   21:ifeq            28
			view.invalidate();
	//   12   24:aload_2         
	//   13   25:invokevirtual   #147 <Method void View.invalidate()>
		matrix.set(b);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #34  <Field Matrix b>
	//   17   33:invokevirtual   #101 <Method void Matrix.set(Matrix)>
		return matrix;
	//   18   36:aload_1         
	//   19   37:areturn         
	}

	public void d(float f1)
	{
		float f2 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f1 == 0.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_0        
	//*   4    4:fcmpl           
	//*   5    5:ifne            11
			f2 = 3.402823E+38F;
	//    6    8:ldc1            #46  <Float 3.402823E+38F>
	//    7   10:fstore_2        
		n = f2;
	//    8   11:aload_0         
	//    9   12:fload_2         
	//   10   13:putfield        #52  <Field float n>
		c(b, e);
	//   11   16:aload_0         
	//   12   17:aload_0         
	//   13   18:getfield        #34  <Field Matrix b>
	//   14   21:aload_0         
	//   15   22:getfield        #39  <Field RectF e>
	//   16   25:invokevirtual   #79  <Method void c(Matrix, RectF)>
	//   17   28:return          
	}

	public boolean d(float f1, float f2)
	{
		return c(f1) && g(f2);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #150 <Method boolean c(float)>
	//    3    5:ifeq            18
	//    4    8:aload_0         
	//    5    9:fload_2         
	//    6   10:invokevirtual   #152 <Method boolean g(float)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public float e()
	{
		return e.top;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #111 <Field float RectF.top>
	//    3    7:freturn         
	}

	public void e(float f1)
	{
		float f2 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_2        
		if(f1 < 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f2 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_2        
		k = f2;
	//    8   10:aload_0         
	//    9   11:fload_2         
	//   10   12:putfield        #50  <Field float k>
		c(b, e);
	//   11   15:aload_0         
	//   12   16:aload_0         
	//   13   17:getfield        #34  <Field Matrix b>
	//   14   20:aload_0         
	//   15   21:getfield        #39  <Field RectF e>
	//   16   24:invokevirtual   #79  <Method void c(Matrix, RectF)>
	//   17   27:return          
	}

	public void e(float f1, float f2)
	{
		float f3 = f1;
	//    0    0:fload_1         
	//    1    1:fstore_3        
		if(f1 < 1.0F)
	//*   2    2:fload_1         
	//*   3    3:fconst_1        
	//*   4    4:fcmpg           
	//*   5    5:ifge            10
			f3 = 1.0F;
	//    6    8:fconst_1        
	//    7    9:fstore_3        
		f1 = f2;
	//    8   10:fload_2         
	//    9   11:fstore_1        
		if(f2 == 0.0F)
	//*  10   12:fload_2         
	//*  11   13:fconst_0        
	//*  12   14:fcmpl           
	//*  13   15:ifne            21
			f1 = 3.402823E+38F;
	//   14   18:ldc1            #46  <Float 3.402823E+38F>
	//   15   20:fstore_1        
		k = f3;
	//   16   21:aload_0         
	//   17   22:fload_3         
	//   18   23:putfield        #50  <Field float k>
		n = f1;
	//   19   26:aload_0         
	//   20   27:fload_1         
	//   21   28:putfield        #52  <Field float n>
		c(b, e);
	//   22   31:aload_0         
	//   23   32:aload_0         
	//   24   33:getfield        #34  <Field Matrix b>
	//   25   36:aload_0         
	//   26   37:getfield        #39  <Field RectF e>
	//   27   40:invokevirtual   #79  <Method void c(Matrix, RectF)>
	//   28   43:return          
	}

	public void e(float af[], View view)
	{
		Matrix matrix = f;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Matrix f>
	//    2    4:astore          7
		matrix.reset();
	//    3    6:aload           7
	//    4    8:invokevirtual   #98  <Method void Matrix.reset()>
		matrix.set(b);
	//    5   11:aload           7
	//    6   13:aload_0         
	//    7   14:getfield        #34  <Field Matrix b>
	//    8   17:invokevirtual   #101 <Method void Matrix.set(Matrix)>
		float f1 = af[0];
	//    9   20:aload_1         
	//   10   21:iconst_0        
	//   11   22:faload          
	//   12   23:fstore_3        
		float f2 = a();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #82  <Method float a()>
	//   15   28:fstore          4
		float f3 = af[1];
	//   16   30:aload_1         
	//   17   31:iconst_1        
	//   18   32:faload          
	//   19   33:fstore          5
		float f4 = c();
	//   20   35:aload_0         
	//   21   36:invokevirtual   #84  <Method float c()>
	//   22   39:fstore          6
		matrix.postTranslate(-(f1 - f2), -(f3 - f4));
	//   23   41:aload           7
	//   24   43:fload_3         
	//   25   44:fload           4
	//   26   46:fsub            
	//   27   47:fneg            
	//   28   48:fload           5
	//   29   50:fload           6
	//   30   52:fsub            
	//   31   53:fneg            
	//   32   54:invokevirtual   #156 <Method boolean Matrix.postTranslate(float, float)>
	//   33   57:pop             
		d(matrix, view, true);
	//   34   58:aload_0         
	//   35   59:aload           7
	//   36   61:aload_2         
	//   37   62:iconst_1        
	//   38   63:invokevirtual   #158 <Method Matrix d(Matrix, View, boolean)>
	//   39   66:pop             
	//   40   67:return          
	}

	public float f()
	{
		return e.left;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #75  <Field float RectF.left>
	//    3    7:freturn         
	}

	public boolean f(float f1)
	{
		return e.top <= f1;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #111 <Field float RectF.top>
	//    3    7:fload_1         
	//    4    8:fcmpg           
	//    5    9:ifgt            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public float g()
	{
		return e.width();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:invokevirtual   #127 <Method float RectF.width()>
	//    3    7:freturn         
	}

	public boolean g(float f1)
	{
		return f(f1) && h(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #160 <Method boolean f(float)>
	//    3    5:ifeq            18
	//    4    8:aload_0         
	//    5    9:fload_1         
	//    6   10:invokevirtual   #162 <Method boolean h(float)>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public float h()
	{
		return e.right;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #108 <Field float RectF.right>
	//    3    7:freturn         
	}

	public boolean h(float f1)
	{
		f1 = (float)(int)(100F * f1) / 100F;
	//    0    0:ldc1            #163 <Float 100F>
	//    1    2:fload_1         
	//    2    3:fmul            
	//    3    4:f2i             
	//    4    5:i2f             
	//    5    6:ldc1            #163 <Float 100F>
	//    6    8:fdiv            
	//    7    9:fstore_1        
		return e.bottom >= f1;
	//    8   10:aload_0         
	//    9   11:getfield        #39  <Field RectF e>
	//   10   14:getfield        #141 <Field float RectF.bottom>
	//   11   17:fload_1         
	//   12   18:fcmpl           
	//   13   19:iflt            24
	//   14   22:iconst_1        
	//   15   23:ireturn         
	//   16   24:iconst_0        
	//   17   25:ireturn         
	}

	public float i()
	{
		return e.bottom;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #141 <Field float RectF.bottom>
	//    3    7:freturn         
	}

	public boolean i(float f1)
	{
		return e.left <= 1.0F + f1;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:getfield        #75  <Field float RectF.left>
	//    3    7:fconst_1        
	//    4    8:fload_1         
	//    5    9:fadd            
	//    6   10:fcmpg           
	//    7   11:ifgt            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public float k()
	{
		return e.height();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:invokevirtual   #130 <Method float RectF.height()>
	//    3    7:freturn         
	}

	public boolean k(float f1)
	{
		f1 = (float)(int)(100F * f1) / 100F;
	//    0    0:ldc1            #163 <Float 100F>
	//    1    2:fload_1         
	//    2    3:fmul            
	//    3    4:f2i             
	//    4    5:i2f             
	//    5    6:ldc1            #163 <Float 100F>
	//    6    8:fdiv            
	//    7    9:fstore_1        
		return e.right >= f1 - 1.0F;
	//    8   10:aload_0         
	//    9   11:getfield        #39  <Field RectF e>
	//   10   14:getfield        #108 <Field float RectF.right>
	//   11   17:fload_1         
	//   12   18:fconst_1        
	//   13   19:fsub            
	//   14   20:fcmpl           
	//   15   21:iflt            26
	//   16   24:iconst_1        
	//   17   25:ireturn         
	//   18   26:iconst_0        
	//   19   27:ireturn         
	}

	public nz l()
	{
		return nz.d(e.centerX(), e.centerY());
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:invokevirtual   #167 <Method float RectF.centerX()>
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field RectF e>
	//    5   11:invokevirtual   #170 <Method float RectF.centerY()>
	//    6   14:invokestatic    #175 <Method nz nz.d(float, float)>
	//    7   17:areturn         
	}

	public void l(float f1)
	{
		s = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #180 <Method float oc.b(float)>
	//    3    5:putfield        #62  <Field float s>
	//    4    8:return          
	}

	public RectF m()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field RectF e>
	//    2    4:areturn         
	}

	public float n()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field float c>
	//    2    4:freturn         
	}

	public float o()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field float a>
	//    2    4:freturn         
	}

	public void o(float f1)
	{
		r = oc.b(f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #180 <Method float oc.b(float)>
	//    3    5:putfield        #64  <Field float r>
	//    4    8:return          
	}

	public Matrix p()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Matrix b>
	//    2    4:areturn         
	}

	public boolean q()
	{
		return m <= k && k <= 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float m>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field float k>
	//    4    8:fcmpl           
	//    5    9:ifgt            23
	//    6   12:aload_0         
	//    7   13:getfield        #50  <Field float k>
	//    8   16:fconst_1        
	//    9   17:fcmpl           
	//   10   18:ifgt            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public boolean r()
	{
		return q() && s();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #186 <Method boolean q()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #188 <Method boolean s()>
	//    5   11:ifeq            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public boolean s()
	{
		return p <= g && g <= 1.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field float p>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field float g>
	//    4    8:fcmpl           
	//    5    9:ifgt            23
	//    6   12:aload_0         
	//    7   13:getfield        #45  <Field float g>
	//    8   16:fconst_1        
	//    9   17:fcmpl           
	//   10   18:ifgt            23
	//   11   21:iconst_1        
	//   12   22:ireturn         
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public float t()
	{
		return p;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field float p>
	//    2    4:freturn         
	}

	public float u()
	{
		return m;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float m>
	//    2    4:freturn         
	}

	public boolean v()
	{
		return s <= 0.0F && r <= 0.0F;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field float s>
	//    2    4:fconst_0        
	//    3    5:fcmpg           
	//    4    6:ifgt            20
	//    5    9:aload_0         
	//    6   10:getfield        #64  <Field float r>
	//    7   13:fconst_0        
	//    8   14:fcmpg           
	//    9   15:ifgt            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public boolean w()
	{
		return m > k;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float m>
	//    2    4:aload_0         
	//    3    5:getfield        #50  <Field float k>
	//    4    8:fcmpl           
	//    5    9:ifle            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean x()
	{
		return p < h;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field float p>
	//    2    4:aload_0         
	//    3    5:getfield        #48  <Field float h>
	//    4    8:fcmpg           
	//    5    9:ifge            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean y()
	{
		return m < n;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field float m>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field float n>
	//    4    8:fcmpg           
	//    5    9:ifge            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean z()
	{
		return p > g;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field float p>
	//    2    4:aload_0         
	//    3    5:getfield        #45  <Field float g>
	//    4    8:fcmpl           
	//    5    9:ifle            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	protected float a;
	protected final Matrix b = new Matrix();
	protected float c;
	protected float d[];
	protected RectF e;
	protected Matrix f;
	private float g;
	private float h;
	protected final float i[] = new float[9];
	private float k;
	private float l;
	private float m;
	private float n;
	private float o;
	private float p;
	private float r;
	private float s;
}
