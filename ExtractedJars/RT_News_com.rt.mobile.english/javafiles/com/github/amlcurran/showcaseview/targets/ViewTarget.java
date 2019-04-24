// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.app.Activity;
import android.graphics.Point;
import android.view.View;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			Target

public class ViewTarget
	implements Target
{

	public ViewTarget(int i, Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mView = activity.findViewById(i);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:iload_1         
	//    5    7:invokevirtual   #19  <Method View Activity.findViewById(int)>
	//    6   10:putfield        #21  <Field View mView>
	//    7   13:return          
	}

	public ViewTarget(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mView = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field View mView>
	//    5    9:return          
	}

	public Point getPoint()
	{
		int ai[] = new int[2];
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:astore_1        
		mView.getLocationInWindow(ai);
	//    3    4:aload_0         
	//    4    5:getfield        #21  <Field View mView>
	//    5    8:aload_1         
	//    6    9:invokevirtual   #31  <Method void View.getLocationInWindow(int[])>
		return new Point(ai[0] + mView.getWidth() / 2, ai[1] + mView.getHeight() / 2);
	//    7   12:new             #33  <Class Point>
	//    8   15:dup             
	//    9   16:aload_1         
	//   10   17:iconst_0        
	//   11   18:iaload          
	//   12   19:aload_0         
	//   13   20:getfield        #21  <Field View mView>
	//   14   23:invokevirtual   #37  <Method int View.getWidth()>
	//   15   26:iconst_2        
	//   16   27:idiv            
	//   17   28:iadd            
	//   18   29:aload_1         
	//   19   30:iconst_1        
	//   20   31:iaload          
	//   21   32:aload_0         
	//   22   33:getfield        #21  <Field View mView>
	//   23   36:invokevirtual   #40  <Method int View.getHeight()>
	//   24   39:iconst_2        
	//   25   40:idiv            
	//   26   41:iadd            
	//   27   42:invokespecial   #43  <Method void Point(int, int)>
	//   28   45:areturn         
	}

	private final View mView;
}
