// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$1
	implements OnApplyWindowInsetsListener
{

	public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
	{
		view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), windowinsetscompat.getSystemWindowInsetBottom());
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method int View.getPaddingLeft()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method int View.getPaddingTop()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #34  <Method int View.getPaddingRight()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #39  <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//    9   17:invokevirtual   #43  <Method void View.setPadding(int, int, int, int)>
		return windowinsetscompat;
	//   10   20:aload_2         
	//   11   21:areturn         
	}

	final BaseTransientBottomBar a;

	BaseTransientBottomBar$1(BaseTransientBottomBar basetransientbottombar)
	{
		a = basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BaseTransientBottomBar a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
