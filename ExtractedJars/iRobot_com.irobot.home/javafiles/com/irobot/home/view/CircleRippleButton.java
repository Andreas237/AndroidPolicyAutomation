// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;

public class CircleRippleButton extends AppCompatImageView
{

	public CircleRippleButton(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void AppCompatImageView(Context)>
		b = 0xff000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #22  <Int 0xff000000>
	//    5    8:putfield        #24  <Field int b>
		a(context, ((AttributeSet) (null)));
	//    6   11:aload_0         
	//    7   12:aload_1         
	//    8   13:aconst_null     
	//    9   14:invokespecial   #27  <Method void a(Context, AttributeSet)>
	//   10   17:return          
	}

	public CircleRippleButton(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #30  <Method void AppCompatImageView(Context, AttributeSet)>
		b = 0xff000000;
	//    4    6:aload_0         
	//    5    7:ldc1            #22  <Int 0xff000000>
	//    6    9:putfield        #24  <Field int b>
		a(context, attributeset);
	//    7   12:aload_0         
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:invokespecial   #27  <Method void a(Context, AttributeSet)>
	//   11   18:return          
	}

	public CircleRippleButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #33  <Method void AppCompatImageView(Context, AttributeSet, int)>
		b = 0xff000000;
	//    5    7:aload_0         
	//    6    8:ldc1            #22  <Int 0xff000000>
	//    7   10:putfield        #24  <Field int b>
		a(context, attributeset);
	//    8   13:aload_0         
	//    9   14:aload_1         
	//   10   15:aload_2         
	//   11   16:invokespecial   #27  <Method void a(Context, AttributeSet)>
	//   12   19:return          
	}

	private void a()
	{
		c.setFloatValues(new float[] {
			g, 0.0F
		});
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ObjectAnimator c>
	//    2    4:iconst_2        
	//    3    5:newarray        float[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #38  <Field float g>
	//    8   13:fastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:fconst_0        
	//   12   17:fastore         
	//   13   18:invokevirtual   #44  <Method void ObjectAnimator.setFloatValues(float[])>
		c.start();
	//   14   21:aload_0         
	//   15   22:getfield        #36  <Field ObjectAnimator c>
	//   16   25:invokevirtual   #47  <Method void ObjectAnimator.start()>
	//   17   28:return          
	}

	private void a(Context context, AttributeSet attributeset)
	{
		setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
	//    0    0:aload_0         
	//    1    1:getstatic       #53  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//    2    4:invokevirtual   #57  <Method void setScaleType(android.widget.ImageView$ScaleType)>
		setFocusable(true);
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #61  <Method void setFocusable(boolean)>
		setClickable(true);
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokevirtual   #64  <Method void setClickable(boolean)>
		a = new Paint(1);
	//    9   17:aload_0         
	//   10   18:new             #66  <Class Paint>
	//   11   21:dup             
	//   12   22:iconst_1        
	//   13   23:invokespecial   #69  <Method void Paint(int)>
	//   14   26:putfield        #71  <Field Paint a>
		a.setStyle(android.graphics.Paint.Style.FILL);
	//   15   29:aload_0         
	//   16   30:getfield        #71  <Field Paint a>
	//   17   33:getstatic       #77  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   18   36:invokevirtual   #81  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		int i = 0xff000000;
	//   19   39:ldc1            #22  <Int 0xff000000>
	//   20   41:istore_3        
		if(attributeset != null)
	//*  21   42:aload_2         
	//*  22   43:ifnull          77
		{
			context = ((Context) (context.obtainStyledAttributes(attributeset, com.irobot.home.g.a.CircleRippleButton)));
	//   23   46:aload_1         
	//   24   47:aload_2         
	//   25   48:getstatic       #87  <Field int[] com.irobot.home.g$a.CircleRippleButton>
	//   26   51:invokevirtual   #93  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   27   54:astore_1        
			i = ((TypedArray) (context)).getColor(1, 0xff000000);
	//   28   55:aload_1         
	//   29   56:iconst_1        
	//   30   57:ldc1            #22  <Int 0xff000000>
	//   31   59:invokevirtual   #99  <Method int TypedArray.getColor(int, int)>
	//   32   62:istore_3        
			h = ((TypedArray) (context)).getBoolean(0, false);
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:iconst_0        
	//   36   66:iconst_0        
	//   37   67:invokevirtual   #103 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   38   70:putfield        #105 <Field boolean h>
			((TypedArray) (context)).recycle();
	//   39   73:aload_1         
	//   40   74:invokevirtual   #108 <Method void TypedArray.recycle()>
		}
		setHighlightColor(i);
	//   41   77:aload_0         
	//   42   78:iload_3         
	//   43   79:invokevirtual   #111 <Method void setHighlightColor(int)>
		i = getResources().getInteger(0x7f0a0006);
	//   44   82:aload_0         
	//   45   83:invokevirtual   #115 <Method Resources getResources()>
	//   46   86:ldc1            #116 <Int 0x7f0a0006>
	//   47   88:invokevirtual   #122 <Method int Resources.getInteger(int)>
	//   48   91:istore_3        
		c = ObjectAnimator.ofFloat(((Object) (this)), "animationProgress", new float[] {
			0.0F, (float)f
		});
	//   49   92:aload_0         
	//   50   93:aload_0         
	//   51   94:ldc1            #124 <String "animationProgress">
	//   52   96:iconst_2        
	//   53   97:newarray        float[]
	//   54   99:dup             
	//   55  100:iconst_0        
	//   56  101:fconst_0        
	//   57  102:fastore         
	//   58  103:dup             
	//   59  104:iconst_1        
	//   60  105:aload_0         
	//   61  106:getfield        #126 <Field int f>
	//   62  109:i2f             
	//   63  110:fastore         
	//   64  111:invokestatic    #130 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   65  114:putfield        #36  <Field ObjectAnimator c>
		c.setDuration(i);
	//   66  117:aload_0         
	//   67  118:getfield        #36  <Field ObjectAnimator c>
	//   68  121:iload_3         
	//   69  122:i2l             
	//   70  123:invokevirtual   #134 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   71  126:pop             
	//   72  127:return          
	}

	private void b()
	{
		c.setFloatValues(new float[] {
			g, (float)f
		});
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field ObjectAnimator c>
	//    2    4:iconst_2        
	//    3    5:newarray        float[]
	//    4    7:dup             
	//    5    8:iconst_0        
	//    6    9:aload_0         
	//    7   10:getfield        #38  <Field float g>
	//    8   13:fastore         
	//    9   14:dup             
	//   10   15:iconst_1        
	//   11   16:aload_0         
	//   12   17:getfield        #126 <Field int f>
	//   13   20:i2f             
	//   14   21:fastore         
	//   15   22:invokevirtual   #44  <Method void ObjectAnimator.setFloatValues(float[])>
		c.start();
	//   16   25:aload_0         
	//   17   26:getfield        #36  <Field ObjectAnimator c>
	//   18   29:invokevirtual   #47  <Method void ObjectAnimator.start()>
	//   19   32:return          
	}

	public float getAnimationProgress()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field float g>
	//    2    4:freturn         
	}

	protected void onDraw(Canvas canvas)
	{
		canvas.drawCircle(e, d, g, a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #140 <Field int e>
	//    3    5:i2f             
	//    4    6:aload_0         
	//    5    7:getfield        #142 <Field int d>
	//    6   10:i2f             
	//    7   11:aload_0         
	//    8   12:getfield        #38  <Field float g>
	//    9   15:aload_0         
	//   10   16:getfield        #71  <Field Paint a>
	//   11   19:invokevirtual   #148 <Method void Canvas.drawCircle(float, float, float, Paint)>
		super.onDraw(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #150 <Method void AppCompatImageView.onDraw(Canvas)>
	//   15   27:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #154 <Method void AppCompatImageView.onMeasure(int, int)>
		if(h)
	//*   4    6:aload_0         
	//*   5    7:getfield        #105 <Field boolean h>
	//*   6   10:ifeq            24
		{
			i = getMeasuredWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #158 <Method int getMeasuredWidth()>
	//    9   17:istore_1        
			setMeasuredDimension(i, i);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #161 <Method void setMeasuredDimension(int, int)>
		}
	//   14   24:return          
	}

	protected void onSizeChanged(int i, int j, int k, int l)
	{
		super.onSizeChanged(i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #165 <Method void AppCompatImageView.onSizeChanged(int, int, int, int)>
		e = i / 2;
	//    6    9:aload_0         
	//    7   10:iload_1         
	//    8   11:iconst_2        
	//    9   12:idiv            
	//   10   13:putfield        #140 <Field int e>
		d = j / 2;
	//   11   16:aload_0         
	//   12   17:iload_2         
	//   13   18:iconst_2        
	//   14   19:idiv            
	//   15   20:putfield        #142 <Field int d>
		f = Math.min(i, j) / 2;
	//   16   23:aload_0         
	//   17   24:iload_1         
	//   18   25:iload_2         
	//   19   26:invokestatic    #170 <Method int Math.min(int, int)>
	//   20   29:iconst_2        
	//   21   30:idiv            
	//   22   31:putfield        #126 <Field int f>
		c.setFloatValues(new float[] {
			0.0F, (float)f
		});
	//   23   34:aload_0         
	//   24   35:getfield        #36  <Field ObjectAnimator c>
	//   25   38:iconst_2        
	//   26   39:newarray        float[]
	//   27   41:dup             
	//   28   42:iconst_0        
	//   29   43:fconst_0        
	//   30   44:fastore         
	//   31   45:dup             
	//   32   46:iconst_1        
	//   33   47:aload_0         
	//   34   48:getfield        #126 <Field int f>
	//   35   51:i2f             
	//   36   52:fastore         
	//   37   53:invokevirtual   #44  <Method void ObjectAnimator.setFloatValues(float[])>
	//   38   56:return          
	}

	public void setAnimationProgress(float f1)
	{
		g = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #38  <Field float g>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #175 <Method void invalidate()>
	//    5    9:return          
	}

	public void setHighlightColor(int i)
	{
		b = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field int b>
		a.setColor(b);
	//    3    5:aload_0         
	//    4    6:getfield        #71  <Field Paint a>
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field int b>
	//    7   13:invokevirtual   #178 <Method void Paint.setColor(int)>
		invalidate();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #175 <Method void invalidate()>
	//   10   20:return          
	}

	public void setPressed(boolean flag)
	{
		super.setPressed(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #181 <Method void AppCompatImageView.setPressed(boolean)>
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            14
		{
			b();
	//    5    9:aload_0         
	//    6   10:invokespecial   #183 <Method void b()>
			return;
	//    7   13:return          
		} else
		{
			a();
	//    8   14:aload_0         
	//    9   15:invokespecial   #185 <Method void a()>
			return;
	//   10   18:return          
		}
	}

	private Paint a;
	private int b;
	private ObjectAnimator c;
	private int d;
	private int e;
	private int f;
	private float g;
	private boolean h;
}
