// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.irobot.home.util.o;

public class CustomViewPager extends ViewPager
{

	public CustomViewPager(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #20  <Method void ViewPager(Context, AttributeSet)>
		g = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #22  <Field int g>
		e = true;
	//    7   11:aload_0         
	//    8   12:iconst_1        
	//    9   13:putfield        #24  <Field boolean e>
	//   10   16:return          
	}

	public void d(int i)
	{
		g = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field int g>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #28  <Method void requestLayout()>
	//    5    9:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean e>
	//*   2    4:ifeq            13
			return super.onInterceptTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #32  <Method boolean ViewPager.onInterceptTouchEvent(MotionEvent)>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	protected void onMeasure(int i, int j)
	{
		int k;
		k = j;
	//    0    0:iload_2         
	//    1    1:istore_3        
		if(!f)
			break MISSING_BLOCK_LABEL_65;
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field boolean f>
	//    4    6:ifeq            65
		View view = getChildAt(g);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #22  <Field int g>
	//    8   14:invokevirtual   #42  <Method View getChildAt(int)>
	//    9   17:astore          4
		k = j;
	//   10   19:iload_2         
	//   11   20:istore_3        
		if(view != null)
	//*  12   21:aload           4
	//*  13   23:ifnull          65
			try
			{
				view.measure(i, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
	//   14   26:aload           4
	//   15   28:iload_1         
	//   16   29:iconst_0        
	//   17   30:iconst_0        
	//   18   31:invokestatic    #48  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   19   34:invokevirtual   #53  <Method void View.measure(int, int)>
				k = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000);
	//   20   37:aload           4
	//   21   39:invokevirtual   #57  <Method int View.getMeasuredHeight()>
	//   22   42:ldc1            #58  <Int 0x40000000>
	//   23   44:invokestatic    #48  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   24   47:istore_3        
			}
	//*  25   48:goto            65
			catch(Exception exception)
	//*  26   51:astore          4
			{
				o.a(d, "Encountered error while measuring.", ((Throwable) (exception)));
	//   27   53:getstatic       #60  <Field String d>
	//   28   56:ldc1            #62  <String "Encountered error while measuring.">
	//   29   58:aload           4
	//   30   60:invokestatic    #68  <Method void o.a(String, String, Throwable)>
				k = j;
	//   31   63:iload_2         
	//   32   64:istore_3        
			}
		super.onMeasure(i, k);
	//   33   65:aload_0         
	//   34   66:iload_1         
	//   35   67:iload_3         
	//   36   68:invokespecial   #70  <Method void ViewPager.onMeasure(int, int)>
		return;
	//   37   71:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean e>
	//*   2    4:ifeq            13
			return super.onTouchEvent(motionevent);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #73  <Method boolean ViewPager.onTouchEvent(MotionEvent)>
	//    6   12:ireturn         
		else
			return false;
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public void setPagingEnabled(boolean flag)
	{
		e = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean e>
	//    3    5:return          
	}

	public void setWrapToSizeToChildren(boolean flag)
	{
		f = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean f>
	//    3    5:return          
	}

	private static final String d = "CustomViewPager";
	private boolean e;
	private boolean f;
	private int g;

	static 
	{
	//    0    0:return          
	}
}
