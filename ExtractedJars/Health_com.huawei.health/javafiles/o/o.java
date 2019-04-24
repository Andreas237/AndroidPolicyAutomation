// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;

class o extends Drawable
{

	public o()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #29  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void Rect()>
	//    6   12:putfield        #32  <Field Rect a>
	//    7   15:aload_0         
	//    8   16:new             #34  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #35  <Method void RectF()>
	//   11   23:putfield        #37  <Field RectF d>
		p = true;
	//   12   26:aload_0         
	//   13   27:iconst_1        
	//   14   28:putfield        #39  <Field boolean p>
	//   15   31:aload_0         
	//   16   32:new             #41  <Class Paint>
	//   17   35:dup             
	//   18   36:iconst_1        
	//   19   37:invokespecial   #44  <Method void Paint(int)>
	//   20   40:putfield        #46  <Field Paint c>
		c.setStyle(android.graphics.Paint.Style.STROKE);
	//   21   43:aload_0         
	//   22   44:getfield        #46  <Field Paint c>
	//   23   47:getstatic       #52  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   24   50:invokevirtual   #56  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   25   53:return          
	}

	private Shader d()
	{
		Object obj = ((Object) (a));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Rect a>
	//    2    4:astore          10
		copyBounds(((Rect) (obj)));
	//    3    6:aload_0         
	//    4    7:aload           10
	//    5    9:invokevirtual   #62  <Method void copyBounds(Rect)>
		float f1 = e / (float)((Rect) (obj)).height();
	//    6   12:aload_0         
	//    7   13:getfield        #64  <Field float e>
	//    8   16:aload           10
	//    9   18:invokevirtual   #68  <Method int Rect.height()>
	//   10   21:i2f             
	//   11   22:fdiv            
	//   12   23:fstore_1        
		int j = ColorUtils.compositeColors(b, k);
	//   13   24:aload_0         
	//   14   25:getfield        #70  <Field int b>
	//   15   28:aload_0         
	//   16   29:getfield        #72  <Field int k>
	//   17   32:invokestatic    #78  <Method int ColorUtils.compositeColors(int, int)>
	//   18   35:istore          4
		int l = ColorUtils.compositeColors(i, k);
	//   19   37:aload_0         
	//   20   38:getfield        #80  <Field int i>
	//   21   41:aload_0         
	//   22   42:getfield        #72  <Field int k>
	//   23   45:invokestatic    #78  <Method int ColorUtils.compositeColors(int, int)>
	//   24   48:istore          5
		int i1 = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(i, 0), k);
	//   25   50:aload_0         
	//   26   51:getfield        #80  <Field int i>
	//   27   54:iconst_0        
	//   28   55:invokestatic    #83  <Method int ColorUtils.setAlphaComponent(int, int)>
	//   29   58:aload_0         
	//   30   59:getfield        #72  <Field int k>
	//   31   62:invokestatic    #78  <Method int ColorUtils.compositeColors(int, int)>
	//   32   65:istore          6
		int j1 = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(h, 0), k);
	//   33   67:aload_0         
	//   34   68:getfield        #85  <Field int h>
	//   35   71:iconst_0        
	//   36   72:invokestatic    #83  <Method int ColorUtils.setAlphaComponent(int, int)>
	//   37   75:aload_0         
	//   38   76:getfield        #72  <Field int k>
	//   39   79:invokestatic    #78  <Method int ColorUtils.compositeColors(int, int)>
	//   40   82:istore          7
		int k1 = ColorUtils.compositeColors(h, k);
	//   41   84:aload_0         
	//   42   85:getfield        #85  <Field int h>
	//   43   88:aload_0         
	//   44   89:getfield        #72  <Field int k>
	//   45   92:invokestatic    #78  <Method int ColorUtils.compositeColors(int, int)>
	//   46   95:istore          8
		int l1 = ColorUtils.compositeColors(g, k);
	//   47   97:aload_0         
	//   48   98:getfield        #87  <Field int g>
	//   49  101:aload_0         
	//   50  102:getfield        #72  <Field int k>
	//   51  105:invokestatic    #78  <Method int ColorUtils.compositeColors(int, int)>
	//   52  108:istore          9
		float f2 = ((Rect) (obj)).top;
	//   53  110:aload           10
	//   54  112:getfield        #90  <Field int Rect.top>
	//   55  115:i2f             
	//   56  116:fstore_2        
		float f3 = ((Rect) (obj)).bottom;
	//   57  117:aload           10
	//   58  119:getfield        #93  <Field int Rect.bottom>
	//   59  122:i2f             
	//   60  123:fstore_3        
		obj = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//   61  124:getstatic       #99  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   62  127:astore          10
		return ((Shader) (new LinearGradient(0.0F, f2, 0.0F, f3, new int[] {
			j, l, i1, j1, k1, l1
		}, new float[] {
			0.0F, f1, 0.5F, 0.5F, 1.0F - f1, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj)))));
	//   63  129:new             #101 <Class LinearGradient>
	//   64  132:dup             
	//   65  133:fconst_0        
	//   66  134:fload_2         
	//   67  135:fconst_0        
	//   68  136:fload_3         
	//   69  137:bipush          6
	//   70  139:newarray        int[]
	//   71  141:dup             
	//   72  142:iconst_0        
	//   73  143:iload           4
	//   74  145:iastore         
	//   75  146:dup             
	//   76  147:iconst_1        
	//   77  148:iload           5
	//   78  150:iastore         
	//   79  151:dup             
	//   80  152:iconst_2        
	//   81  153:iload           6
	//   82  155:iastore         
	//   83  156:dup             
	//   84  157:iconst_3        
	//   85  158:iload           7
	//   86  160:iastore         
	//   87  161:dup             
	//   88  162:iconst_4        
	//   89  163:iload           8
	//   90  165:iastore         
	//   91  166:dup             
	//   92  167:iconst_5        
	//   93  168:iload           9
	//   94  170:iastore         
	//   95  171:bipush          6
	//   96  173:newarray        float[]
	//   97  175:dup             
	//   98  176:iconst_0        
	//   99  177:fconst_0        
	//  100  178:fastore         
	//  101  179:dup             
	//  102  180:iconst_1        
	//  103  181:fload_1         
	//  104  182:fastore         
	//  105  183:dup             
	//  106  184:iconst_2        
	//  107  185:ldc1            #102 <Float 0.5F>
	//  108  187:fastore         
	//  109  188:dup             
	//  110  189:iconst_3        
	//  111  190:ldc1            #102 <Float 0.5F>
	//  112  192:fastore         
	//  113  193:dup             
	//  114  194:iconst_4        
	//  115  195:fconst_1        
	//  116  196:fload_1         
	//  117  197:fsub            
	//  118  198:fastore         
	//  119  199:dup             
	//  120  200:iconst_5        
	//  121  201:fconst_1        
	//  122  202:fastore         
	//  123  203:aload           10
	//  124  205:invokespecial   #105 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  125  208:areturn         
	}

	void c(float f1)
	{
		if(e != f1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field float e>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            34
		{
			e = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #64  <Field float e>
			c.setStrokeWidth(1.3333F * f1);
	//    8   14:aload_0         
	//    9   15:getfield        #46  <Field Paint c>
	//   10   18:ldc1            #107 <Float 1.3333F>
	//   11   20:fload_1         
	//   12   21:fmul            
	//   13   22:invokevirtual   #110 <Method void Paint.setStrokeWidth(float)>
			p = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #39  <Field boolean p>
			invalidateSelf();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #113 <Method void invalidateSelf()>
		}
	//   19   34:return          
	}

	final void d(float f1)
	{
		if(f1 != n)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #115 <Field float n>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			n = f1;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #115 <Field float n>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #113 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	void d(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
			k = colorstatelist.getColorForState(getState(), k);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #120 <Method int[] getState()>
	//    6   10:aload_0         
	//    7   11:getfield        #72  <Field int k>
	//    8   14:invokevirtual   #126 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   17:putfield        #72  <Field int k>
		f = colorstatelist;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #128 <Field ColorStateList f>
		p = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #39  <Field boolean p>
		invalidateSelf();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #113 <Method void invalidateSelf()>
	//   18   34:return          
	}

	public void draw(Canvas canvas)
	{
		if(p)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field boolean p>
	//*   2    4:ifeq            24
		{
			c.setShader(d());
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field Paint c>
	//    5   11:aload_0         
	//    6   12:invokespecial   #132 <Method Shader d()>
	//    7   15:invokevirtual   #136 <Method Shader Paint.setShader(Shader)>
	//    8   18:pop             
			p = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #39  <Field boolean p>
		}
		float f1 = c.getStrokeWidth() / 2.0F;
	//   12   24:aload_0         
	//   13   25:getfield        #46  <Field Paint c>
	//   14   28:invokevirtual   #140 <Method float Paint.getStrokeWidth()>
	//   15   31:fconst_2        
	//   16   32:fdiv            
	//   17   33:fstore_2        
		RectF rectf = d;
	//   18   34:aload_0         
	//   19   35:getfield        #37  <Field RectF d>
	//   20   38:astore_3        
		copyBounds(a);
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #32  <Field Rect a>
	//   24   44:invokevirtual   #62  <Method void copyBounds(Rect)>
		rectf.set(a);
	//   25   47:aload_3         
	//   26   48:aload_0         
	//   27   49:getfield        #32  <Field Rect a>
	//   28   52:invokevirtual   #143 <Method void RectF.set(Rect)>
		rectf.left = rectf.left + f1;
	//   29   55:aload_3         
	//   30   56:aload_3         
	//   31   57:getfield        #146 <Field float RectF.left>
	//   32   60:fload_2         
	//   33   61:fadd            
	//   34   62:putfield        #146 <Field float RectF.left>
		rectf.top = rectf.top + f1;
	//   35   65:aload_3         
	//   36   66:aload_3         
	//   37   67:getfield        #148 <Field float RectF.top>
	//   38   70:fload_2         
	//   39   71:fadd            
	//   40   72:putfield        #148 <Field float RectF.top>
		rectf.right = rectf.right - f1;
	//   41   75:aload_3         
	//   42   76:aload_3         
	//   43   77:getfield        #151 <Field float RectF.right>
	//   44   80:fload_2         
	//   45   81:fsub            
	//   46   82:putfield        #151 <Field float RectF.right>
		rectf.bottom = rectf.bottom - f1;
	//   47   85:aload_3         
	//   48   86:aload_3         
	//   49   87:getfield        #153 <Field float RectF.bottom>
	//   50   90:fload_2         
	//   51   91:fsub            
	//   52   92:putfield        #153 <Field float RectF.bottom>
		canvas.save();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #158 <Method int Canvas.save()>
	//   55   99:pop             
		canvas.rotate(n, rectf.centerX(), rectf.centerY());
	//   56  100:aload_1         
	//   57  101:aload_0         
	//   58  102:getfield        #115 <Field float n>
	//   59  105:aload_3         
	//   60  106:invokevirtual   #161 <Method float RectF.centerX()>
	//   61  109:aload_3         
	//   62  110:invokevirtual   #164 <Method float RectF.centerY()>
	//   63  113:invokevirtual   #168 <Method void Canvas.rotate(float, float, float)>
		canvas.drawOval(rectf, c);
	//   64  116:aload_1         
	//   65  117:aload_3         
	//   66  118:aload_0         
	//   67  119:getfield        #46  <Field Paint c>
	//   68  122:invokevirtual   #172 <Method void Canvas.drawOval(RectF, Paint)>
		canvas.restore();
	//   69  125:aload_1         
	//   70  126:invokevirtual   #175 <Method void Canvas.restore()>
	//   71  129:return          
	}

	void e(int j, int l, int i1, int j1)
	{
		b = j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int b>
		i = l;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #80  <Field int i>
		g = i1;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #87  <Field int g>
		h = j1;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #85  <Field int h>
	//   12   21:return          
	}

	public int getOpacity()
	{
		return e <= 0.0F ? -2 : -3;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field float e>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            12
	//    5    9:bipush          -3
	//    6   11:ireturn         
	//    7   12:bipush          -2
	//    8   14:ireturn         
	}

	public boolean getPadding(Rect rect)
	{
		int j = Math.round(e);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field float e>
	//    2    4:invokestatic    #185 <Method int Math.round(float)>
	//    3    7:istore_2        
		rect.set(j, j, j, j);
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_2         
	//    7   11:iload_2         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #187 <Method void Rect.set(int, int, int, int)>
		return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
	}

	public boolean isStateful()
	{
		return f != null && f.isStateful() || super.isStateful();
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field ColorStateList f>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field ColorStateList f>
	//    5   11:invokevirtual   #191 <Method boolean ColorStateList.isStateful()>
	//    6   14:ifne            24
	//    7   17:aload_0         
	//    8   18:invokespecial   #192 <Method boolean Drawable.isStateful()>
	//    9   21:ifeq            26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	protected void onBoundsChange(Rect rect)
	{
		p = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #39  <Field boolean p>
	//    3    5:return          
	}

	protected boolean onStateChange(int ai[])
	{
		if(f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field ColorStateList f>
	//*   2    4:ifnull          38
		{
			int j = f.getColorForState(ai, k);
	//    3    7:aload_0         
	//    4    8:getfield        #128 <Field ColorStateList f>
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #72  <Field int k>
	//    8   16:invokevirtual   #126 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   19:istore_2        
			if(j != k)
	//*  10   20:iload_2         
	//*  11   21:aload_0         
	//*  12   22:getfield        #72  <Field int k>
	//*  13   25:icmpeq          38
			{
				p = true;
	//   14   28:aload_0         
	//   15   29:iconst_1        
	//   16   30:putfield        #39  <Field boolean p>
				k = j;
	//   17   33:aload_0         
	//   18   34:iload_2         
	//   19   35:putfield        #72  <Field int k>
			}
		}
		if(p)
	//*  20   38:aload_0         
	//*  21   39:getfield        #39  <Field boolean p>
	//*  22   42:ifeq            49
			invalidateSelf();
	//   23   45:aload_0         
	//   24   46:invokevirtual   #113 <Method void invalidateSelf()>
		return p;
	//   25   49:aload_0         
	//   26   50:getfield        #39  <Field boolean p>
	//   27   53:ireturn         
	}

	public void setAlpha(int j)
	{
		c.setAlpha(j);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Paint c>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #198 <Method void Paint.setAlpha(int)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #113 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		c.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field Paint c>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #203 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #113 <Method void invalidateSelf()>
	//    7   13:return          
	}

	final Rect a = new Rect();
	private int b;
	final Paint c = new Paint(1);
	final RectF d = new RectF();
	float e;
	private ColorStateList f;
	private int g;
	private int h;
	private int i;
	private int k;
	private float n;
	private boolean p;
}
