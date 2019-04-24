// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayoutCompatApi21, DrawerLayoutImpl

static class DrawerLayoutCompatApi21$InsetsListener
	implements android.view.View.OnApplyWindowInsetsListener
{

	public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
	{
		view = ((View) ((DrawerLayoutImpl)view));
	//    0    0:aload_1         
	//    1    1:checkcast       #18  <Class DrawerLayoutImpl>
	//    2    4:astore_1        
		boolean flag;
		if(windowinsets.getSystemWindowInsetTop() > 0)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #24  <Method int WindowInsets.getSystemWindowInsetTop()>
	//*   5    9:ifle            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		((DrawerLayoutImpl) (view)).setChildInsets(((Object) (windowinsets)), flag);
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:iload_3         
	//   14   22:invokeinterface #28  <Method void DrawerLayoutImpl.setChildInsets(Object, boolean)>
		return windowinsets.consumeSystemWindowInsets();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #32  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
	//   17   31:areturn         
	}

	DrawerLayoutCompatApi21$InsetsListener()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
