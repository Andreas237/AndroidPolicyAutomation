// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v4.view.ba;
import android.support.v7.widget.ActionBarContainer;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			WindowDecorActionBar

class WindowDecorActionBar$3
	implements ba
{

	public void onAnimationUpdate(View view)
	{
		((View)mContainerView.getParent()).invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field WindowDecorActionBar this$0>
	//    2    4:getfield        #24  <Field ActionBarContainer WindowDecorActionBar.mContainerView>
	//    3    7:invokevirtual   #30  <Method android.view.ViewParent ActionBarContainer.getParent()>
	//    4   10:checkcast       #32  <Class View>
	//    5   13:invokevirtual   #35  <Method void View.invalidate()>
	//    6   16:return          
	}

	final WindowDecorActionBar this$0;

	WindowDecorActionBar$3()
	{
		this$0 = WindowDecorActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field WindowDecorActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
