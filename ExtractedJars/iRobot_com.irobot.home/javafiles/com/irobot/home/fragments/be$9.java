// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.irobot.home.view.CustomSquaredImageButton;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$9
	implements android.view.reeObserver.OnGlobalLayoutListener
{

	public void onGlobalLayout()
	{
		a.l.getViewTreeObserver().removeOnGlobalLayoutListener(((android.view.reeObserver.OnGlobalLayoutListener) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field be a>
	//    2    4:getfield        #25  <Field CustomSquaredImageButton be.l>
	//    3    7:invokevirtual   #31  <Method ViewTreeObserver CustomSquaredImageButton.getViewTreeObserver()>
	//    4   10:aload_0         
	//    5   11:invokevirtual   #37  <Method void ViewTreeObserver.removeOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		a.y.setPivotX((float)a.l.getWidth() * 0.8F);
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field be a>
	//    8   18:getfield        #41  <Field RelativeLayout be.y>
	//    9   21:aload_0         
	//   10   22:getfield        #17  <Field be a>
	//   11   25:getfield        #25  <Field CustomSquaredImageButton be.l>
	//   12   28:invokevirtual   #45  <Method int CustomSquaredImageButton.getWidth()>
	//   13   31:i2f             
	//   14   32:ldc1            #46  <Float 0.8F>
	//   15   34:fmul            
	//   16   35:invokevirtual   #52  <Method void RelativeLayout.setPivotX(float)>
		a.y.setPivotY((float)a.l.getHeight() * 0.1F);
	//   17   38:aload_0         
	//   18   39:getfield        #17  <Field be a>
	//   19   42:getfield        #41  <Field RelativeLayout be.y>
	//   20   45:aload_0         
	//   21   46:getfield        #17  <Field be a>
	//   22   49:getfield        #25  <Field CustomSquaredImageButton be.l>
	//   23   52:invokevirtual   #55  <Method int CustomSquaredImageButton.getHeight()>
	//   24   55:i2f             
	//   25   56:ldc1            #56  <Float 0.1F>
	//   26   58:fmul            
	//   27   59:invokevirtual   #59  <Method void RelativeLayout.setPivotY(float)>
	//   28   62:return          
	}

	final be a;

	be$9(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
