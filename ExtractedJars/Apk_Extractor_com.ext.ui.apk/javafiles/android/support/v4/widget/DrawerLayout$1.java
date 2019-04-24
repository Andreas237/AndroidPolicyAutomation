// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

class DrawerLayout$1
	implements android.view.dowInsetsListener
{

	public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
	{
		view = ((View) ((DrawerLayout)view));
	//    0    0:aload_1         
	//    1    1:checkcast       #8   <Class DrawerLayout>
	//    2    4:astore_1        
		boolean flag;
		if(windowinsets.getSystemWindowInsetTop() > 0)
	//*   3    5:aload_2         
	//*   4    6:invokevirtual   #31  <Method int WindowInsets.getSystemWindowInsetTop()>
	//*   5    9:ifle            25
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:aload_1         
	//*   9   15:aload_2         
	//*  10   16:iload_3         
	//*  11   17:invokevirtual   #35  <Method void DrawerLayout.setChildInsets(Object, boolean)>
	//*  12   20:aload_2         
	//*  13   21:invokevirtual   #39  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
	//*  14   24:areturn         
			flag = false;
	//   15   25:iconst_0        
	//   16   26:istore_3        
		((DrawerLayout) (view)).setChildInsets(((Object) (windowinsets)), flag);
		return windowinsets.consumeSystemWindowInsets();
	//*  17   27:goto            14
	}

	final DrawerLayout this$0;

	DrawerLayout$1()
	{
		this$0 = DrawerLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DrawerLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
