// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.graphics.*;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

class CutoutDrawable extends GradientDrawable
{

	CutoutDrawable()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void GradientDrawable()>
	//    2    4:aload_0         
	//    3    5:new             #16  <Class Paint>
	//    4    8:dup             
	//    5    9:iconst_1        
	//    6   10:invokespecial   #19  <Method void Paint(int)>
	//    7   13:putfield        #21  <Field Paint cutoutPaint>
		setPaintStyles();
	//    8   16:aload_0         
	//    9   17:invokespecial   #24  <Method void setPaintStyles()>
	//   10   20:aload_0         
	//   11   21:new             #26  <Class RectF>
	//   12   24:dup             
	//   13   25:invokespecial   #27  <Method void RectF()>
	//   14   28:putfield        #29  <Field RectF cutoutBounds>
	//   15   31:return          
	}

	private void postDraw(Canvas canvas)
	{
		if(!useHardwareLayer(getCallback()))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #37  <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//*   3    5:invokespecial   #41  <Method boolean useHardwareLayer(android.graphics.drawable.Drawable$Callback)>
	//*   4    8:ifne            19
			canvas.restoreToCount(savedLayer);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field int savedLayer>
	//    8   16:invokevirtual   #48  <Method void Canvas.restoreToCount(int)>
	//    9   19:return          
	}

	private void preDraw(Canvas canvas)
	{
		android.graphics.drawable.Drawable.Callback callback = getCallback();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method android.graphics.drawable.Drawable$Callback getCallback()>
	//    2    4:astore_2        
		if(useHardwareLayer(callback))
	//*   3    5:aload_0         
	//*   4    6:aload_2         
	//*   5    7:invokespecial   #41  <Method boolean useHardwareLayer(android.graphics.drawable.Drawable$Callback)>
	//*   6   10:ifeq            23
		{
			((View)callback).setLayerType(2, ((Paint) (null)));
	//    7   13:aload_2         
	//    8   14:checkcast       #52  <Class View>
	//    9   17:iconst_2        
	//   10   18:aconst_null     
	//   11   19:invokevirtual   #56  <Method void View.setLayerType(int, Paint)>
			return;
	//   12   22:return          
		} else
		{
			saveCanvasLayer(canvas);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokespecial   #59  <Method void saveCanvasLayer(Canvas)>
			return;
	//   16   28:return          
		}
	}

	private void saveCanvasLayer(Canvas canvas)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #64  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          30
		{
			savedLayer = canvas.saveLayer(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), ((Paint) (null)));
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:fconst_0        
	//    6   11:fconst_0        
	//    7   12:aload_1         
	//    8   13:invokevirtual   #68  <Method int Canvas.getWidth()>
	//    9   16:i2f             
	//   10   17:aload_1         
	//   11   18:invokevirtual   #71  <Method int Canvas.getHeight()>
	//   12   21:i2f             
	//   13   22:aconst_null     
	//   14   23:invokevirtual   #75  <Method int Canvas.saveLayer(float, float, float, float, Paint)>
	//   15   26:putfield        #43  <Field int savedLayer>
			return;
	//   16   29:return          
		} else
		{
			savedLayer = canvas.saveLayer(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight(), ((Paint) (null)), 31);
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:fconst_0        
	//   20   33:fconst_0        
	//   21   34:aload_1         
	//   22   35:invokevirtual   #68  <Method int Canvas.getWidth()>
	//   23   38:i2f             
	//   24   39:aload_1         
	//   25   40:invokevirtual   #71  <Method int Canvas.getHeight()>
	//   26   43:i2f             
	//   27   44:aconst_null     
	//   28   45:bipush          31
	//   29   47:invokevirtual   #78  <Method int Canvas.saveLayer(float, float, float, float, Paint, int)>
	//   30   50:putfield        #43  <Field int savedLayer>
			return;
	//   31   53:return          
		}
	}

	private void setPaintStyles()
	{
		cutoutPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Paint cutoutPaint>
	//    2    4:getstatic       #84  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL_AND_STROKE>
	//    3    7:invokevirtual   #88  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		cutoutPaint.setColor(-1);
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Paint cutoutPaint>
	//    6   14:iconst_m1       
	//    7   15:invokevirtual   #91  <Method void Paint.setColor(int)>
		cutoutPaint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT))));
	//    8   18:aload_0         
	//    9   19:getfield        #21  <Field Paint cutoutPaint>
	//   10   22:new             #93  <Class PorterDuffXfermode>
	//   11   25:dup             
	//   12   26:getstatic       #99  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_OUT>
	//   13   29:invokespecial   #102 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   14   32:invokevirtual   #106 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   15   35:pop             
	//   16   36:return          
	}

	private boolean useHardwareLayer(android.graphics.drawable.Drawable.Callback callback)
	{
		return callback instanceof View;
	//    0    0:aload_1         
	//    1    1:instanceof      #52  <Class View>
	//    2    4:ireturn         
	}

	public void draw(Canvas canvas)
	{
		preDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #109 <Method void preDraw(Canvas)>
		super.draw(canvas);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #111 <Method void GradientDrawable.draw(Canvas)>
		canvas.drawRect(cutoutBounds, cutoutPaint);
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:getfield        #29  <Field RectF cutoutBounds>
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field Paint cutoutPaint>
	//   11   19:invokevirtual   #115 <Method void Canvas.drawRect(RectF, Paint)>
		postDraw(canvas);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokespecial   #117 <Method void postDraw(Canvas)>
	//   15   27:return          
	}

	boolean hasCutout()
	{
		return cutoutBounds.isEmpty() ^ true;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field RectF cutoutBounds>
	//    2    4:invokevirtual   #122 <Method boolean RectF.isEmpty()>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	void removeCutout()
	{
		setCutout(0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:fconst_0        
	//    3    3:fconst_0        
	//    4    4:fconst_0        
	//    5    5:invokevirtual   #127 <Method void setCutout(float, float, float, float)>
	//    6    8:return          
	}

	void setCutout(float f, float f1, float f2, float f3)
	{
		if(f != cutoutBounds.left || f1 != cutoutBounds.top || f2 != cutoutBounds.right || f3 != cutoutBounds.bottom)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #29  <Field RectF cutoutBounds>
	//*   3    5:getfield        #131 <Field float RectF.left>
	//*   4    8:fcmpl           
	//*   5    9:ifne            49
	//*   6   12:fload_2         
	//*   7   13:aload_0         
	//*   8   14:getfield        #29  <Field RectF cutoutBounds>
	//*   9   17:getfield        #134 <Field float RectF.top>
	//*  10   20:fcmpl           
	//*  11   21:ifne            49
	//*  12   24:fload_3         
	//*  13   25:aload_0         
	//*  14   26:getfield        #29  <Field RectF cutoutBounds>
	//*  15   29:getfield        #137 <Field float RectF.right>
	//*  16   32:fcmpl           
	//*  17   33:ifne            49
	//*  18   36:fload           4
	//*  19   38:aload_0         
	//*  20   39:getfield        #29  <Field RectF cutoutBounds>
	//*  21   42:getfield        #140 <Field float RectF.bottom>
	//*  22   45:fcmpl           
	//*  23   46:ifeq            65
		{
			cutoutBounds.set(f, f1, f2, f3);
	//   24   49:aload_0         
	//   25   50:getfield        #29  <Field RectF cutoutBounds>
	//   26   53:fload_1         
	//   27   54:fload_2         
	//   28   55:fload_3         
	//   29   56:fload           4
	//   30   58:invokevirtual   #143 <Method void RectF.set(float, float, float, float)>
			invalidateSelf();
	//   31   61:aload_0         
	//   32   62:invokevirtual   #146 <Method void invalidateSelf()>
		}
	//   33   65:return          
	}

	void setCutout(RectF rectf)
	{
		setCutout(rectf.left, rectf.top, rectf.right, rectf.bottom);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #131 <Field float RectF.left>
	//    3    5:aload_1         
	//    4    6:getfield        #134 <Field float RectF.top>
	//    5    9:aload_1         
	//    6   10:getfield        #137 <Field float RectF.right>
	//    7   13:aload_1         
	//    8   14:getfield        #140 <Field float RectF.bottom>
	//    9   17:invokevirtual   #127 <Method void setCutout(float, float, float, float)>
	//   10   20:return          
	}

	private final RectF cutoutBounds = new RectF();
	private final Paint cutoutPaint = new Paint(1);
	private int savedLayer;
}
