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
		if(insets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//*   2    4:getfield        #26  <Field Rect ScrimInsetsFrameLayout.insets>
	//*   3    7:ifnonnull       24
			insets = new Rect();
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//    6   14:new             #28  <Class Rect>
	//    7   17:dup             
	//    8   18:invokespecial   #29  <Method void Rect()>
	//    9   21:putfield        #26  <Field Rect ScrimInsetsFrameLayout.insets>
		insets.set(windowinsetscompat.getSystemWindowInsetLeft(), windowinsetscompat.getSystemWindowInsetTop(), windowinsetscompat.getSystemWindowInsetRight(), windowinsetscompat.getSystemWindowInsetBottom());
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//   12   28:getfield        #26  <Field Rect ScrimInsetsFrameLayout.insets>
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
		if(windowinsetscompat.hasSystemWindowInsets() && insetForeground != null)
	//*  29   63:aload_2         
	//*  30   64:invokevirtual   #56  <Method boolean WindowInsetsCompat.hasSystemWindowInsets()>
	//*  31   67:ifeq            88
	//*  32   70:aload_0         
	//*  33   71:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//*  34   74:getfield        #60  <Field android.graphics.drawable.Drawable ScrimInsetsFrameLayout.insetForeground>
	//*  35   77:ifnonnull       83
	//*  36   80:goto            88
			flag = false;
	//   37   83:iconst_0        
	//   38   84:istore_3        
		else
	//*  39   85:goto            90
			flag = true;
	//   40   88:iconst_1        
	//   41   89:istore_3        
		((ScrimInsetsFrameLayout) (view)).setWillNotDraw(flag);
	//   42   90:aload_1         
	//   43   91:iload_3         
	//   44   92:invokevirtual   #64  <Method void ScrimInsetsFrameLayout.setWillNotDraw(boolean)>
		ViewCompat.postInvalidateOnAnimation(((View) (ScrimInsetsFrameLayout.this)));
	//   45   95:aload_0         
	//   46   96:getfield        #16  <Field ScrimInsetsFrameLayout this$0>
	//   47   99:invokestatic    #70  <Method void ViewCompat.postInvalidateOnAnimation(View)>
		return windowinsetscompat.consumeSystemWindowInsets();
	//   48  102:aload_2         
	//   49  103:invokevirtual   #74  <Method WindowInsetsCompat WindowInsetsCompat.consumeSystemWindowInsets()>
	//   50  106:areturn         
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
