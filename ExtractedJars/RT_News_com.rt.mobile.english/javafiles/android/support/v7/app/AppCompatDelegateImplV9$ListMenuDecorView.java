// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ContentFrameLayout;
import android.view.KeyEvent;
import android.view.MotionEvent;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegateImplV9

private class AppCompatDelegateImplV9$ListMenuDecorView extends ContentFrameLayout
{

	private boolean isOutOfBounds(int i, int j)
	{
		return i < -5 || j < -5 || i > getWidth() + 5 || j > getHeight() + 5;
	//    0    0:iload_1         
	//    1    1:bipush          -5
	//    2    3:icmplt          37
	//    3    6:iload_2         
	//    4    7:bipush          -5
	//    5    9:icmplt          37
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #23  <Method int getWidth()>
	//    9   17:iconst_5        
	//   10   18:iadd            
	//   11   19:icmpgt          37
	//   12   22:iload_2         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #26  <Method int getHeight()>
	//   15   27:iconst_5        
	//   16   28:iadd            
	//   17   29:icmple          35
	//   18   32:goto            37
	//   19   35:iconst_0        
	//   20   36:ireturn         
	//   21   37:iconst_1        
	//   22   38:ireturn         
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		return AppCompatDelegateImplV9.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field AppCompatDelegateImplV9 this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method boolean AppCompatDelegateImplV9.dispatchKeyEvent(KeyEvent)>
	//    4    8:ifne            24
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokespecial   #31  <Method boolean ContentFrameLayout.dispatchKeyEvent(KeyEvent)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0 && isOutOfBounds((int)motionevent.getX(), (int)motionevent.getY()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #38  <Method int MotionEvent.getAction()>
	//*   2    4:ifne            34
	//*   3    7:aload_0         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #42  <Method float MotionEvent.getX()>
	//*   6   12:f2i             
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #45  <Method float MotionEvent.getY()>
	//*   9   17:f2i             
	//*  10   18:invokespecial   #47  <Method boolean isOutOfBounds(int, int)>
	//*  11   21:ifeq            34
		{
			closePanel(0);
	//   12   24:aload_0         
	//   13   25:getfield        #13  <Field AppCompatDelegateImplV9 this$0>
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #51  <Method void AppCompatDelegateImplV9.closePanel(int)>
			return true;
	//   16   32:iconst_1        
	//   17   33:ireturn         
		} else
		{
			return super.onInterceptTouchEvent(motionevent);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokespecial   #53  <Method boolean ContentFrameLayout.onInterceptTouchEvent(MotionEvent)>
	//   21   39:ireturn         
		}
	}

	public void setBackgroundResource(int i)
	{
		setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #58  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #64  <Method android.graphics.drawable.Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #68  <Method void setBackgroundDrawable(android.graphics.drawable.Drawable)>
	//    6   12:return          
	}

	final AppCompatDelegateImplV9 this$0;

	public AppCompatDelegateImplV9$ListMenuDecorView(Context context)
	{
		this$0 = AppCompatDelegateImplV9.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field AppCompatDelegateImplV9 this$0>
		super(context);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void ContentFrameLayout(Context)>
	//    6   10:return          
	}
}
