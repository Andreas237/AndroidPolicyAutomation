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
	//*   5    9:ifle            17
			flag = true;
	//    6   12:iconst_1        
	//    7   13:istore_3        
		else
	//*   8   14:goto            19
			flag = false;
	//    9   17:iconst_0        
	//   10   18:istore_3        
		((DrawerLayout) (view)).a(((Object) (windowinsets)), flag);
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:iload_3         
	//   14   22:invokevirtual   #34  <Method void DrawerLayout.a(Object, boolean)>
		return windowinsets.consumeSystemWindowInsets();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #38  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
	//   17   29:areturn         
	}

	final DrawerLayout a;

	DrawerLayout$1(DrawerLayout drawerlayout)
	{
		a = drawerlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field DrawerLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
