// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.graphics.Rect;
import android.support.v4.view.*;
import android.view.View;

// Referenced classes of package android.support.design.internal:
//			ScrimInsetsFrameLayout

class ScrimInsetsFrameLayout$1
	implements OnApplyWindowInsetsListener
{

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		if(mInsets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//*   2    4:getfield        #26  <Field Rect ScrimInsetsFrameLayout.mInsets>
	//*   3    7:ifnonnull       24
			mInsets = new Rect();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//    6   14:new             #28  <Class Rect>
	//    7   17:dup             
	//    8   18:invokespecial   #29  <Method void Rect()>
	//    9   21:putfield        #26  <Field Rect ScrimInsetsFrameLayout.mInsets>
		mInsets.set(windowinsetscompat.getSystemWindowInsetLeft(), windowinsetscompat.getSystemWindowInsetTop(), windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//   12   28:getfield        #26  <Field Rect ScrimInsetsFrameLayout.mInsets>
	//   13   31:aload_2         
	//   14   32:invokevirtual   #35  <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//   15   35:aload_2         
	//   16   36:invokevirtual   #38  <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   17   39:aload_2         
	//   18   40:invokevirtual   #41  <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//   19   43:aload_2         
	//   20   44:invokevirtual   #44  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//   21   47:invokevirtual   #48  <Method void Rect.set(int, int, int, int)>
		onInsetsChanged(windowinsetscompat);
	//   22   50:aload_0         
	//   23   51:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//   24   54:aload_2         
	//   25   55:invokevirtual   #52  <Method void ScrimInsetsFrameLayout.onInsetsChanged(WindowInsetsCompat)>
		view = ((View) (ScrimInsetsFrameLayout.this));
	//   26   58:aload_0         
	//   27   59:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//   28   62:astore_1        
		boolean flag;
		if(!windowinsetscompat.hasSystemWindowInsets() || mInsetForeground == null)
	//*  29   63:aload_2         
	//*  30   64:invokevirtual   #56  <Method boolean WindowInsetsCompat.hasSystemWindowInsets()>
	//*  31   67:ifeq            80
	//*  32   70:aload_0         
	//*  33   71:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//*  34   74:getfield        #60  <Field android.graphics.drawable.Drawable ScrimInsetsFrameLayout.mInsetForeground>
	//*  35   77:ifnonnull       99
			flag = true;
	//   36   80:iconst_1        
	//   37   81:istore_3        
		else
	//*  38   82:aload_1         
	//*  39   83:iload_3         
	//*  40   84:invokevirtual   #64  <Method void ScrimInsetsFrameLayout.setWillNotDraw(boolean)>
	//*  41   87:aload_0         
	//*  42   88:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//*  43   91:invokestatic    #70  <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//*  44   94:aload_2         
	//*  45   95:invokevirtual   #74  <Method WindowInsetsCompat WindowInsetsCompat.consumeSystemWindowInsets()>
	//*  46   98:areturn         
			flag = false;
	//   47   99:iconst_0        
	//   48  100:istore_3        
		((ScrimInsetsFrameLayout) (view)).setWillNotDraw(flag);
		ViewCompat.postInvalidateOnAnimation(((View) (ScrimInsetsFrameLayout.this)));
		return windowinsetscompat.consumeSystemWindowInsets();
	//*  49  101:goto            82
	}

	final ScrimInsetsFrameLayout this$0;

	ScrimInsetsFrameLayout$1()
	{
		this$0 = ScrimInsetsFrameLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ScrimInsetsFrameLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
