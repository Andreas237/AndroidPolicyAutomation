// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.circularreveal;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

// Referenced classes of package android.support.design.circularreveal:
//			CircularRevealWidget, CircularRevealHelper

public class CircularRevealFrameLayout extends FrameLayout
	implements CircularRevealWidget
{

	public void actualDraw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void FrameLayout.draw(Canvas)>
	//    3    5:return          
	}

	public boolean actualIsOpaque()
	{
		return super.isOpaque();
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method boolean FrameLayout.isOpaque()>
	//    2    4:ireturn         
	}

	public void buildCircularRevealCache()
	{
		helper.buildCircularRevealCache();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:invokevirtual   #27  <Method void CircularRevealHelper.buildCircularRevealCache()>
	//    3    7:return          
	}

	public void destroyCircularRevealCache()
	{
		helper.destroyCircularRevealCache();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:invokevirtual   #30  <Method void CircularRevealHelper.destroyCircularRevealCache()>
	//    3    7:return          
	}

	public void draw(Canvas canvas)
	{
		CircularRevealHelper circularrevealhelper = helper;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:astore_2        
		if(circularrevealhelper != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			circularrevealhelper.draw(canvas);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #34  <Method void CircularRevealHelper.draw(Canvas)>
			return;
	//    8   14:return          
		} else
		{
			super.draw(canvas);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokespecial   #13  <Method void FrameLayout.draw(Canvas)>
			return;
	//   12   20:return          
		}
	}

	public Drawable getCircularRevealOverlayDrawable()
	{
		return helper.getCircularRevealOverlayDrawable();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:invokevirtual   #40  <Method Drawable CircularRevealHelper.getCircularRevealOverlayDrawable()>
	//    3    7:areturn         
	}

	public int getCircularRevealScrimColor()
	{
		return helper.getCircularRevealScrimColor();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:invokevirtual   #44  <Method int CircularRevealHelper.getCircularRevealScrimColor()>
	//    3    7:ireturn         
	}

	public CircularRevealWidget.RevealInfo getRevealInfo()
	{
		return helper.getRevealInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:invokevirtual   #48  <Method CircularRevealWidget$RevealInfo CircularRevealHelper.getRevealInfo()>
	//    3    7:areturn         
	}

	public boolean isOpaque()
	{
		CircularRevealHelper circularrevealhelper = helper;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:astore_1        
		if(circularrevealhelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return circularrevealhelper.isOpaque();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #49  <Method boolean CircularRevealHelper.isOpaque()>
	//    7   13:ireturn         
		else
			return super.isOpaque();
	//    8   14:aload_0         
	//    9   15:invokespecial   #19  <Method boolean FrameLayout.isOpaque()>
	//   10   18:ireturn         
	}

	public void setCircularRevealOverlayDrawable(Drawable drawable)
	{
		helper.setCircularRevealOverlayDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #53  <Method void CircularRevealHelper.setCircularRevealOverlayDrawable(Drawable)>
	//    4    8:return          
	}

	public void setCircularRevealScrimColor(int i)
	{
		helper.setCircularRevealScrimColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #59  <Method void CircularRevealHelper.setCircularRevealScrimColor(int)>
	//    4    8:return          
	}

	public void setRevealInfo(CircularRevealWidget.RevealInfo revealinfo)
	{
		helper.setRevealInfo(revealinfo);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field CircularRevealHelper helper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #63  <Method void CircularRevealHelper.setRevealInfo(CircularRevealWidget$RevealInfo)>
	//    4    8:return          
	}

	private final CircularRevealHelper helper;
}
