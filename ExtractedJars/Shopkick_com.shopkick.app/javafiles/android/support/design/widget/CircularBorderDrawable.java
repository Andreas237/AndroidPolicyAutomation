// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.ColorUtils;

public class CircularBorderDrawable extends Drawable
{
	private class CircularBorderState extends android.graphics.drawable.Drawable.ConstantState
	{

		public int getChangingConfigurations()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Drawable newDrawable()
		{
			return ((Drawable) (CircularBorderDrawable.this));
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field CircularBorderDrawable this$0>
		//    2    4:areturn         
		}

		final CircularBorderDrawable this$0;

		private CircularBorderState()
		{
			this$0 = CircularBorderDrawable.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field CircularBorderDrawable this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void android.graphics.drawable.Drawable$ConstantState()>
		//    5    9:return          
		}

	}


	public CircularBorderDrawable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #49  <Method void Drawable()>
	//    2    4:aload_0         
	//    3    5:new             #51  <Class Rect>
	//    4    8:dup             
	//    5    9:invokespecial   #52  <Method void Rect()>
	//    6   12:putfield        #54  <Field Rect rect>
	//    7   15:aload_0         
	//    8   16:new             #56  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #57  <Method void RectF()>
	//   11   23:putfield        #59  <Field RectF rectF>
	//   12   26:aload_0         
	//   13   27:new             #8   <Class CircularBorderDrawable$CircularBorderState>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:aconst_null     
	//   17   33:invokespecial   #62  <Method void CircularBorderDrawable$CircularBorderState(CircularBorderDrawable, CircularBorderDrawable$1)>
	//   18   36:putfield        #64  <Field CircularBorderDrawable$CircularBorderState state>
		invalidateShader = true;
	//   19   39:aload_0         
	//   20   40:iconst_1        
	//   21   41:putfield        #66  <Field boolean invalidateShader>
	//   22   44:aload_0         
	//   23   45:new             #68  <Class Paint>
	//   24   48:dup             
	//   25   49:iconst_1        
	//   26   50:invokespecial   #71  <Method void Paint(int)>
	//   27   53:putfield        #73  <Field Paint paint>
		paint.setStyle(android.graphics.Paint.Style.STROKE);
	//   28   56:aload_0         
	//   29   57:getfield        #73  <Field Paint paint>
	//   30   60:getstatic       #79  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   31   63:invokevirtual   #83  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   32   66:return          
	}

	private Shader createGradientShader()
	{
		Object obj = ((Object) (rect));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field Rect rect>
	//    2    4:astore          10
		copyBounds(((Rect) (obj)));
	//    3    6:aload_0         
	//    4    7:aload           10
	//    5    9:invokevirtual   #90  <Method void copyBounds(Rect)>
		float f = borderWidth / (float)((Rect) (obj)).height();
	//    6   12:aload_0         
	//    7   13:getfield        #92  <Field float borderWidth>
	//    8   16:aload           10
	//    9   18:invokevirtual   #96  <Method int Rect.height()>
	//   10   21:i2f             
	//   11   22:fdiv            
	//   12   23:fstore_1        
		int i = ColorUtils.compositeColors(topOuterStrokeColor, currentBorderTintColor);
	//   13   24:aload_0         
	//   14   25:getfield        #98  <Field int topOuterStrokeColor>
	//   15   28:aload_0         
	//   16   29:getfield        #100 <Field int currentBorderTintColor>
	//   17   32:invokestatic    #106 <Method int ColorUtils.compositeColors(int, int)>
	//   18   35:istore          4
		int j = ColorUtils.compositeColors(topInnerStrokeColor, currentBorderTintColor);
	//   19   37:aload_0         
	//   20   38:getfield        #108 <Field int topInnerStrokeColor>
	//   21   41:aload_0         
	//   22   42:getfield        #100 <Field int currentBorderTintColor>
	//   23   45:invokestatic    #106 <Method int ColorUtils.compositeColors(int, int)>
	//   24   48:istore          5
		int k = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(topInnerStrokeColor, 0), currentBorderTintColor);
	//   25   50:aload_0         
	//   26   51:getfield        #108 <Field int topInnerStrokeColor>
	//   27   54:iconst_0        
	//   28   55:invokestatic    #111 <Method int ColorUtils.setAlphaComponent(int, int)>
	//   29   58:aload_0         
	//   30   59:getfield        #100 <Field int currentBorderTintColor>
	//   31   62:invokestatic    #106 <Method int ColorUtils.compositeColors(int, int)>
	//   32   65:istore          6
		int l = ColorUtils.compositeColors(ColorUtils.setAlphaComponent(bottomInnerStrokeColor, 0), currentBorderTintColor);
	//   33   67:aload_0         
	//   34   68:getfield        #113 <Field int bottomInnerStrokeColor>
	//   35   71:iconst_0        
	//   36   72:invokestatic    #111 <Method int ColorUtils.setAlphaComponent(int, int)>
	//   37   75:aload_0         
	//   38   76:getfield        #100 <Field int currentBorderTintColor>
	//   39   79:invokestatic    #106 <Method int ColorUtils.compositeColors(int, int)>
	//   40   82:istore          7
		int i1 = ColorUtils.compositeColors(bottomInnerStrokeColor, currentBorderTintColor);
	//   41   84:aload_0         
	//   42   85:getfield        #113 <Field int bottomInnerStrokeColor>
	//   43   88:aload_0         
	//   44   89:getfield        #100 <Field int currentBorderTintColor>
	//   45   92:invokestatic    #106 <Method int ColorUtils.compositeColors(int, int)>
	//   46   95:istore          8
		int j1 = ColorUtils.compositeColors(bottomOuterStrokeColor, currentBorderTintColor);
	//   47   97:aload_0         
	//   48   98:getfield        #115 <Field int bottomOuterStrokeColor>
	//   49  101:aload_0         
	//   50  102:getfield        #100 <Field int currentBorderTintColor>
	//   51  105:invokestatic    #106 <Method int ColorUtils.compositeColors(int, int)>
	//   52  108:istore          9
		float f1 = ((Rect) (obj)).top;
	//   53  110:aload           10
	//   54  112:getfield        #118 <Field int Rect.top>
	//   55  115:i2f             
	//   56  116:fstore_2        
		float f2 = ((Rect) (obj)).bottom;
	//   57  117:aload           10
	//   58  119:getfield        #121 <Field int Rect.bottom>
	//   59  122:i2f             
	//   60  123:fstore_3        
		obj = ((Object) (android.graphics.Shader.TileMode.CLAMP));
	//   61  124:getstatic       #127 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   62  127:astore          10
		return ((Shader) (new LinearGradient(0.0F, f1, 0.0F, f2, new int[] {
			i, j, k, l, i1, j1
		}, new float[] {
			0.0F, f, 0.5F, 0.5F, 1.0F - f, 1.0F
		}, ((android.graphics.Shader.TileMode) (obj)))));
	//   63  129:new             #129 <Class LinearGradient>
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
	//  107  185:ldc1            #130 <Float 0.5F>
	//  108  187:fastore         
	//  109  188:dup             
	//  110  189:iconst_3        
	//  111  190:ldc1            #130 <Float 0.5F>
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
	//  124  205:invokespecial   #133 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  125  208:areturn         
	}

	public void draw(Canvas canvas)
	{
		if(invalidateShader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field boolean invalidateShader>
	//*   2    4:ifeq            24
		{
			paint.setShader(createGradientShader());
	//    3    7:aload_0         
	//    4    8:getfield        #73  <Field Paint paint>
	//    5   11:aload_0         
	//    6   12:invokespecial   #137 <Method Shader createGradientShader()>
	//    7   15:invokevirtual   #141 <Method Shader Paint.setShader(Shader)>
	//    8   18:pop             
			invalidateShader = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #66  <Field boolean invalidateShader>
		}
		float f = paint.getStrokeWidth() / 2.0F;
	//   12   24:aload_0         
	//   13   25:getfield        #73  <Field Paint paint>
	//   14   28:invokevirtual   #145 <Method float Paint.getStrokeWidth()>
	//   15   31:fconst_2        
	//   16   32:fdiv            
	//   17   33:fstore_2        
		RectF rectf = rectF;
	//   18   34:aload_0         
	//   19   35:getfield        #59  <Field RectF rectF>
	//   20   38:astore_3        
		copyBounds(rect);
	//   21   39:aload_0         
	//   22   40:aload_0         
	//   23   41:getfield        #54  <Field Rect rect>
	//   24   44:invokevirtual   #90  <Method void copyBounds(Rect)>
		rectf.set(rect);
	//   25   47:aload_3         
	//   26   48:aload_0         
	//   27   49:getfield        #54  <Field Rect rect>
	//   28   52:invokevirtual   #148 <Method void RectF.set(Rect)>
		rectf.left = rectf.left + f;
	//   29   55:aload_3         
	//   30   56:aload_3         
	//   31   57:getfield        #151 <Field float RectF.left>
	//   32   60:fload_2         
	//   33   61:fadd            
	//   34   62:putfield        #151 <Field float RectF.left>
		rectf.top = rectf.top + f;
	//   35   65:aload_3         
	//   36   66:aload_3         
	//   37   67:getfield        #153 <Field float RectF.top>
	//   38   70:fload_2         
	//   39   71:fadd            
	//   40   72:putfield        #153 <Field float RectF.top>
		rectf.right = rectf.right - f;
	//   41   75:aload_3         
	//   42   76:aload_3         
	//   43   77:getfield        #156 <Field float RectF.right>
	//   44   80:fload_2         
	//   45   81:fsub            
	//   46   82:putfield        #156 <Field float RectF.right>
		rectf.bottom = rectf.bottom - f;
	//   47   85:aload_3         
	//   48   86:aload_3         
	//   49   87:getfield        #158 <Field float RectF.bottom>
	//   50   90:fload_2         
	//   51   91:fsub            
	//   52   92:putfield        #158 <Field float RectF.bottom>
		canvas.save();
	//   53   95:aload_1         
	//   54   96:invokevirtual   #163 <Method int Canvas.save()>
	//   55   99:pop             
		canvas.rotate(rotation, rectf.centerX(), rectf.centerY());
	//   56  100:aload_1         
	//   57  101:aload_0         
	//   58  102:getfield        #165 <Field float rotation>
	//   59  105:aload_3         
	//   60  106:invokevirtual   #168 <Method float RectF.centerX()>
	//   61  109:aload_3         
	//   62  110:invokevirtual   #171 <Method float RectF.centerY()>
	//   63  113:invokevirtual   #175 <Method void Canvas.rotate(float, float, float)>
		canvas.drawOval(rectf, paint);
	//   64  116:aload_1         
	//   65  117:aload_3         
	//   66  118:aload_0         
	//   67  119:getfield        #73  <Field Paint paint>
	//   68  122:invokevirtual   #179 <Method void Canvas.drawOval(RectF, Paint)>
		canvas.restore();
	//   69  125:aload_1         
	//   70  126:invokevirtual   #182 <Method void Canvas.restore()>
	//   71  129:return          
	}

	public android.graphics.drawable.Drawable.ConstantState getConstantState()
	{
		return ((android.graphics.drawable.Drawable.ConstantState) (state));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field CircularBorderDrawable$CircularBorderState state>
	//    2    4:areturn         
	}

	public int getOpacity()
	{
		return borderWidth <= 0.0F ? -2 : -3;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field float borderWidth>
	//    2    4:fconst_0        
	//    3    5:fcmpl           
	//    4    6:ifle            12
	//    5    9:bipush          -3
	//    6   11:ireturn         
	//    7   12:bipush          -2
	//    8   14:ireturn         
	}

	public boolean getPadding(Rect rect1)
	{
		int i = Math.round(borderWidth);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field float borderWidth>
	//    2    4:invokestatic    #195 <Method int Math.round(float)>
	//    3    7:istore_2        
		rect1.set(i, i, i, i);
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_2         
	//    7   11:iload_2         
	//    8   12:iload_2         
	//    9   13:invokevirtual   #198 <Method void Rect.set(int, int, int, int)>
		return true;
	//   10   16:iconst_1        
	//   11   17:ireturn         
	}

	public boolean isStateful()
	{
		ColorStateList colorstatelist = borderTint;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field ColorStateList borderTint>
	//    2    4:astore_1        
		return colorstatelist != null && colorstatelist.isStateful() || super.isStateful();
	//    3    5:aload_1         
	//    4    6:ifnull          16
	//    5    9:aload_1         
	//    6   10:invokevirtual   #206 <Method boolean ColorStateList.isStateful()>
	//    7   13:ifne            23
	//    8   16:aload_0         
	//    9   17:invokespecial   #207 <Method boolean Drawable.isStateful()>
	//   10   20:ifeq            25
	//   11   23:iconst_1        
	//   12   24:ireturn         
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	protected void onBoundsChange(Rect rect1)
	{
		invalidateShader = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #66  <Field boolean invalidateShader>
	//    3    5:return          
	}

	protected boolean onStateChange(int ai[])
	{
		ColorStateList colorstatelist = borderTint;
	//    0    0:aload_0         
	//    1    1:getfield        #202 <Field ColorStateList borderTint>
	//    2    4:astore_3        
		if(colorstatelist != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          37
		{
			int i = colorstatelist.getColorForState(ai, currentBorderTintColor);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #100 <Field int currentBorderTintColor>
	//    9   15:invokevirtual   #214 <Method int ColorStateList.getColorForState(int[], int)>
	//   10   18:istore_2        
			if(i != currentBorderTintColor)
	//*  11   19:iload_2         
	//*  12   20:aload_0         
	//*  13   21:getfield        #100 <Field int currentBorderTintColor>
	//*  14   24:icmpeq          37
			{
				invalidateShader = true;
	//   15   27:aload_0         
	//   16   28:iconst_1        
	//   17   29:putfield        #66  <Field boolean invalidateShader>
				currentBorderTintColor = i;
	//   18   32:aload_0         
	//   19   33:iload_2         
	//   20   34:putfield        #100 <Field int currentBorderTintColor>
			}
		}
		if(invalidateShader)
	//*  21   37:aload_0         
	//*  22   38:getfield        #66  <Field boolean invalidateShader>
	//*  23   41:ifeq            48
			invalidateSelf();
	//   24   44:aload_0         
	//   25   45:invokevirtual   #217 <Method void invalidateSelf()>
		return invalidateShader;
	//   26   48:aload_0         
	//   27   49:getfield        #66  <Field boolean invalidateShader>
	//   28   52:ireturn         
	}

	public void setAlpha(int i)
	{
		paint.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Paint paint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #225 <Method void Paint.setAlpha(int)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #217 <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setBorderTint(ColorStateList colorstatelist)
	{
		if(colorstatelist != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
			currentBorderTintColor = colorstatelist.getColorForState(getState(), currentBorderTintColor);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #232 <Method int[] getState()>
	//    6   10:aload_0         
	//    7   11:getfield        #100 <Field int currentBorderTintColor>
	//    8   14:invokevirtual   #214 <Method int ColorStateList.getColorForState(int[], int)>
	//    9   17:putfield        #100 <Field int currentBorderTintColor>
		borderTint = colorstatelist;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #202 <Field ColorStateList borderTint>
		invalidateShader = true;
	//   13   25:aload_0         
	//   14   26:iconst_1        
	//   15   27:putfield        #66  <Field boolean invalidateShader>
		invalidateSelf();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #217 <Method void invalidateSelf()>
	//   18   34:return          
	}

	public void setBorderWidth(float f)
	{
		if(borderWidth != f)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field float borderWidth>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            34
		{
			borderWidth = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #92  <Field float borderWidth>
			paint.setStrokeWidth(f * 1.3333F);
	//    8   14:aload_0         
	//    9   15:getfield        #73  <Field Paint paint>
	//   10   18:fload_1         
	//   11   19:ldc1            #16  <Float 1.3333F>
	//   12   21:fmul            
	//   13   22:invokevirtual   #237 <Method void Paint.setStrokeWidth(float)>
			invalidateShader = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #66  <Field boolean invalidateShader>
			invalidateSelf();
	//   17   30:aload_0         
	//   18   31:invokevirtual   #217 <Method void invalidateSelf()>
		}
	//   19   34:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		paint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field Paint paint>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #242 <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #217 <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setGradientColors(int i, int j, int k, int l)
	{
		topOuterStrokeColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #98  <Field int topOuterStrokeColor>
		topInnerStrokeColor = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #108 <Field int topInnerStrokeColor>
		bottomOuterStrokeColor = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #115 <Field int bottomOuterStrokeColor>
		bottomInnerStrokeColor = l;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #113 <Field int bottomInnerStrokeColor>
	//   12   21:return          
	}

	public final void setRotation(float f)
	{
		if(f != rotation)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #165 <Field float rotation>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            18
		{
			rotation = f;
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:putfield        #165 <Field float rotation>
			invalidateSelf();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #217 <Method void invalidateSelf()>
		}
	//   10   18:return          
	}

	private static final float DRAW_STROKE_WIDTH_MULTIPLE = 1.3333F;
	private ColorStateList borderTint;
	float borderWidth;
	private int bottomInnerStrokeColor;
	private int bottomOuterStrokeColor;
	private int currentBorderTintColor;
	private boolean invalidateShader;
	final Paint paint = new Paint(1);
	final Rect rect = new Rect();
	final RectF rectF = new RectF();
	private float rotation;
	final CircularBorderState state = new CircularBorderState();
	private int topInnerStrokeColor;
	private int topOuterStrokeColor;
}
