// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.TypedValue;

public class CircleButton extends AppCompatImageView
{

	public CircleButton(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void AppCompatImageView(Context)>
		i = 0xff000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #24  <Int 0xff000000>
	//    5    8:putfield        #26  <Field int i>
		a(context, ((AttributeSet) (null)));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aconst_null     
	//    9   14:invokespecial   #29  <Method void a(Context, AttributeSet)>
	//   10   17:return          
	}

	public CircleButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void AppCompatImageView(Context, AttributeSet)>
		i = 0xff000000;
	//    4    6:aload_0         
	//    5    7:ldc1            #24  <Int 0xff000000>
	//    6    9:putfield        #26  <Field int i>
		a(context, attributeset);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:invokespecial   #29  <Method void a(Context, AttributeSet)>
	//   11   18:return          
	}

	public CircleButton(Context context, AttributeSet attributeset, int l)
	{
		super(context, attributeset, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #35  <Method void AppCompatImageView(Context, AttributeSet, int)>
		i = 0xff000000;
	//    5    7:aload_0         
	//    6    8:ldc1            #24  <Int 0xff000000>
	//    7   10:putfield        #26  <Field int i>
		a(context, attributeset);
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:aload_2         
	//   11   16:invokespecial   #29  <Method void a(Context, AttributeSet)>
	//   12   19:return          
	}

	private int a(int l, int i1)
	{
		return Color.argb(Math.min(255, Color.alpha(l)), Math.min(255, Color.red(l) + i1), Math.min(255, Color.green(l) + i1), Math.min(255, Color.blue(l) + i1));
	//    0    0:sipush          255
	//    1    3:iload_1         
	//    2    4:invokestatic    #42  <Method int Color.alpha(int)>
	//    3    7:invokestatic    #47  <Method int Math.min(int, int)>
	//    4   10:sipush          255
	//    5   13:iload_1         
	//    6   14:invokestatic    #50  <Method int Color.red(int)>
	//    7   17:iload_2         
	//    8   18:iadd            
	//    9   19:invokestatic    #47  <Method int Math.min(int, int)>
	//   10   22:sipush          255
	//   11   25:iload_1         
	//   12   26:invokestatic    #53  <Method int Color.green(int)>
	//   13   29:iload_2         
	//   14   30:iadd            
	//   15   31:invokestatic    #47  <Method int Math.min(int, int)>
	//   16   34:sipush          255
	//   17   37:iload_1         
	//   18   38:invokestatic    #56  <Method int Color.blue(int)>
	//   19   41:iload_2         
	//   20   42:iadd            
	//   21   43:invokestatic    #47  <Method int Math.min(int, int)>
	//   22   46:invokestatic    #60  <Method int Color.argb(int, int, int, int)>
	//   23   49:ireturn         
	}

	private void a()
	{
		k.setFloatValues(new float[] {
			(float)h, 0.0F
		});
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ObjectAnimator k>
	//    2    4:iconst_2        
	//    3    5:newarray        float[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #65  <Field int h>
	//    8   13:i2f             
	//    9   14:fastore         
	//   10   15:dup             
	//   11   16:iconst_1        
	//   12   17:fconst_0        
	//   13   18:fastore         
	//   14   19:invokevirtual   #71  <Method void ObjectAnimator.setFloatValues(float[])>
		k.start();
	//   15   22:aload_0         
	//   16   23:getfield        #63  <Field ObjectAnimator k>
	//   17   26:invokevirtual   #74  <Method void ObjectAnimator.start()>
	//   18   29:return          
	}

	private void a(Context context, AttributeSet attributeset)
	{
		setFocusable(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #78  <Method void setFocusable(boolean)>
		setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
	//    3    5:aload_0         
	//    4    6:getstatic       #84  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//    5    9:invokevirtual   #88  <Method void setScaleType(android.widget.ImageView$ScaleType)>
		setClickable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #91  <Method void setClickable(boolean)>
		e = new Paint(1);
	//    9   17:aload_0         
	//   10   18:new             #93  <Class Paint>
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:invokespecial   #96  <Method void Paint(int)>
	//   14   26:putfield        #98  <Field Paint e>
		e.setStyle(android.graphics.Paint.Style.FILL);
	//   15   29:aload_0         
	//   16   30:getfield        #98  <Field Paint e>
	//   17   33:getstatic       #104 <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   18   36:invokevirtual   #108 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		f = new Paint(1);
	//   19   39:aload_0         
	//   20   40:new             #93  <Class Paint>
	//   21   43:dup             
	//   22   44:iconst_1        
	//   23   45:invokespecial   #96  <Method void Paint(int)>
	//   24   48:putfield        #110 <Field Paint f>
		f.setStyle(android.graphics.Paint.Style.STROKE);
	//   25   51:aload_0         
	//   26   52:getfield        #110 <Field Paint f>
	//   27   55:getstatic       #113 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   28   58:invokevirtual   #108 <Method void Paint.setStyle(android.graphics.Paint$Style)>
		h = (int)TypedValue.applyDimension(1, 8F, getResources().getDisplayMetrics());
	//   29   61:aload_0         
	//   30   62:iconst_1        
	//   31   63:ldc1            #114 <Float 8F>
	//   32   65:aload_0         
	//   33   66:invokevirtual   #118 <Method Resources getResources()>
	//   34   69:invokevirtual   #124 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   35   72:invokestatic    #130 <Method float TypedValue.applyDimension(int, float, android.util.DisplayMetrics)>
	//   36   75:f2i             
	//   37   76:putfield        #65  <Field int h>
		int l = 0xff000000;
	//   38   79:ldc1            #24  <Int 0xff000000>
	//   39   81:istore_3        
		if(attributeset != null)
	//*  40   82:aload_2         
	//*  41   83:ifnull          122
		{
			context = ((Context) (context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.CircleButton)));
	//   42   86:aload_1         
	//   43   87:aload_2         
	//   44   88:getstatic       #136 <Field int[] com.irobot.home.g$a.CircleButton>
	//   45   91:invokevirtual   #142 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   46   94:astore_1        
			l = ((TypedArray) (context)).getColor(0, 0xff000000);
	//   47   95:aload_1         
	//   48   96:iconst_0        
	//   49   97:ldc1            #24  <Int 0xff000000>
	//   50   99:invokevirtual   #147 <Method int TypedArray.getColor(int, int)>
	//   51  102:istore_3        
			h = (int)((TypedArray) (context)).getDimension(1, h);
	//   52  103:aload_0         
	//   53  104:aload_1         
	//   54  105:iconst_1        
	//   55  106:aload_0         
	//   56  107:getfield        #65  <Field int h>
	//   57  110:i2f             
	//   58  111:invokevirtual   #151 <Method float TypedArray.getDimension(int, float)>
	//   59  114:f2i             
	//   60  115:putfield        #65  <Field int h>
			((TypedArray) (context)).recycle();
	//   61  118:aload_1         
	//   62  119:invokevirtual   #154 <Method void TypedArray.recycle()>
		}
		setColor(l);
	//   63  122:aload_0         
	//   64  123:iload_3         
	//   65  124:invokevirtual   #157 <Method void setColor(int)>
		f.setStrokeWidth(h);
	//   66  127:aload_0         
	//   67  128:getfield        #110 <Field Paint f>
	//   68  131:aload_0         
	//   69  132:getfield        #65  <Field int h>
	//   70  135:i2f             
	//   71  136:invokevirtual   #161 <Method void Paint.setStrokeWidth(float)>
		l = getResources().getInteger(0x10e0000);
	//   72  139:aload_0         
	//   73  140:invokevirtual   #118 <Method Resources getResources()>
	//   74  143:ldc1            #162 <Int 0x10e0000>
	//   75  145:invokevirtual   #165 <Method int Resources.getInteger(int)>
	//   76  148:istore_3        
		k = ObjectAnimator.ofFloat(((Object) (this)), "animationProgress", new float[] {
			0.0F, 0.0F
		});
	//   77  149:aload_0         
	//   78  150:aload_0         
	//   79  151:ldc1            #167 <String "animationProgress">
	//   80  153:iconst_2        
	//   81  154:newarray        float[]
	//   82  156:dup             
	//   83  157:iconst_0        
	//   84  158:fconst_0        
	//   85  159:fastore         
	//   86  160:dup             
	//   87  161:iconst_1        
	//   88  162:fconst_0        
	//   89  163:fastore         
	//   90  164:invokestatic    #171 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   91  167:putfield        #63  <Field ObjectAnimator k>
		k.setDuration(l);
	//   92  170:aload_0         
	//   93  171:getfield        #63  <Field ObjectAnimator k>
	//   94  174:iload_3         
	//   95  175:i2l             
	//   96  176:invokevirtual   #175 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   97  179:pop             
	//   98  180:return          
	}

	private void b()
	{
		k.setFloatValues(new float[] {
			g, (float)h
		});
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field ObjectAnimator k>
	//    2    4:iconst_2        
	//    3    5:newarray        float[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #177 <Field float g>
	//    8   13:fastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:aload_0         
	//   12   17:getfield        #65  <Field int h>
	//   13   20:i2f             
	//   14   21:fastore         
	//   15   22:invokevirtual   #71  <Method void ObjectAnimator.setFloatValues(float[])>
		k.start();
	//   16   25:aload_0         
	//   17   26:getfield        #63  <Field ObjectAnimator k>
	//   18   29:invokevirtual   #74  <Method void ObjectAnimator.start()>
	//   19   32:return          
	}

	public float getAnimationProgress()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field float g>
	//    2    4:freturn         
	}

	public int getButtonRadius()
	{
		return c - h;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field int c>
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field int h>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public int getPressedHighlightWidth()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field int h>
	//    2    4:ireturn         
	}

	protected void onDraw(Canvas canvas)
	{
		canvas.drawCircle(b, a, (float)d + g, f);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #188 <Field int b>
	//    3    5:i2f             
	//    4    6:aload_0         
	//    5    7:getfield        #190 <Field int a>
	//    6   10:i2f             
	//    7   11:aload_0         
	//    8   12:getfield        #192 <Field int d>
	//    9   15:i2f             
	//   10   16:aload_0         
	//   11   17:getfield        #177 <Field float g>
	//   12   20:fadd            
	//   13   21:aload_0         
	//   14   22:getfield        #110 <Field Paint f>
	//   15   25:invokevirtual   #198 <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.drawCircle(b, a, c - h, e);
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #188 <Field int b>
	//   19   33:i2f             
	//   20   34:aload_0         
	//   21   35:getfield        #190 <Field int a>
	//   22   38:i2f             
	//   23   39:aload_0         
	//   24   40:getfield        #183 <Field int c>
	//   25   43:aload_0         
	//   26   44:getfield        #65  <Field int h>
	//   27   47:isub            
	//   28   48:i2f             
	//   29   49:aload_0         
	//   30   50:getfield        #98  <Field Paint e>
	//   31   53:invokevirtual   #198 <Method void Canvas.drawCircle(float, float, float, Paint)>
		super.onDraw(canvas);
	//   32   56:aload_0         
	//   33   57:aload_1         
	//   34   58:invokespecial   #200 <Method void AppCompatImageView.onDraw(Canvas)>
	//   35   61:return          
	}

	protected void onSizeChanged(int l, int i1, int j1, int k1)
	{
		super.onSizeChanged(l, i1, j1, k1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #204 <Method void AppCompatImageView.onSizeChanged(int, int, int, int)>
		b = l / 2;
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iconst_2        
	//    9   12:idiv            
	//   10   13:putfield        #188 <Field int b>
		a = i1 / 2;
	//   11   16:aload_0         
	//   12   17:iload_2         
	//   13   18:iconst_2        
	//   14   19:idiv            
	//   15   20:putfield        #190 <Field int a>
		c = Math.min(l, i1) / 2;
	//   16   23:aload_0         
	//   17   24:iload_1         
	//   18   25:iload_2         
	//   19   26:invokestatic    #47  <Method int Math.min(int, int)>
	//   20   29:iconst_2        
	//   21   30:idiv            
	//   22   31:putfield        #183 <Field int c>
		d = c - h - h / 2;
	//   23   34:aload_0         
	//   24   35:aload_0         
	//   25   36:getfield        #183 <Field int c>
	//   26   39:aload_0         
	//   27   40:getfield        #65  <Field int h>
	//   28   43:isub            
	//   29   44:aload_0         
	//   30   45:getfield        #65  <Field int h>
	//   31   48:iconst_2        
	//   32   49:idiv            
	//   33   50:isub            
	//   34   51:putfield        #192 <Field int d>
	//   35   54:return          
	}

	public void setAnimationProgress(float f1)
	{
		g = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #177 <Field float g>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #208 <Method void invalidate()>
	//    5    9:return          
	}

	public void setColor(int l)
	{
		i = l;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field int i>
		j = a(l, 10);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:bipush          10
	//    7   10:invokespecial   #210 <Method int a(int, int)>
	//    8   13:putfield        #212 <Field int j>
		e.setColor(i);
	//    9   16:aload_0         
	//   10   17:getfield        #98  <Field Paint e>
	//   11   20:aload_0         
	//   12   21:getfield        #26  <Field int i>
	//   13   24:invokevirtual   #213 <Method void Paint.setColor(int)>
		f.setColor(i);
	//   14   27:aload_0         
	//   15   28:getfield        #110 <Field Paint f>
	//   16   31:aload_0         
	//   17   32:getfield        #26  <Field int i>
	//   18   35:invokevirtual   #213 <Method void Paint.setColor(int)>
		f.setAlpha(75);
	//   19   38:aload_0         
	//   20   39:getfield        #110 <Field Paint f>
	//   21   42:bipush          75
	//   22   44:invokevirtual   #216 <Method void Paint.setAlpha(int)>
		invalidate();
	//   23   47:aload_0         
	//   24   48:invokevirtual   #208 <Method void invalidate()>
	//   25   51:return          
	}

	public void setPressed(boolean flag)
	{
		super.setPressed(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #219 <Method void AppCompatImageView.setPressed(boolean)>
		if(e != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #98  <Field Paint e>
	//*   5    9:ifnull          39
		{
			Paint paint = e;
	//    6   12:aload_0         
	//    7   13:getfield        #98  <Field Paint e>
	//    8   16:astore_3        
			int l;
			if(flag)
	//*   9   17:iload_1         
	//*  10   18:ifeq            29
				l = j;
	//   11   21:aload_0         
	//   12   22:getfield        #212 <Field int j>
	//   13   25:istore_2        
			else
	//*  14   26:goto            34
				l = i;
	//   15   29:aload_0         
	//   16   30:getfield        #26  <Field int i>
	//   17   33:istore_2        
			paint.setColor(l);
	//   18   34:aload_3         
	//   19   35:iload_2         
	//   20   36:invokevirtual   #213 <Method void Paint.setColor(int)>
		}
		if(flag)
	//*  21   39:iload_1         
	//*  22   40:ifeq            48
		{
			b();
	//   23   43:aload_0         
	//   24   44:invokespecial   #221 <Method void b()>
			return;
	//   25   47:return          
		} else
		{
			a();
	//   26   48:aload_0         
	//   27   49:invokespecial   #223 <Method void a()>
			return;
	//   28   52:return          
		}
	}

	private int a;
	private int b;
	private int c;
	private int d;
	private Paint e;
	private Paint f;
	private float g;
	private int h;
	private int i;
	private int j;
	private ObjectAnimator k;
}
