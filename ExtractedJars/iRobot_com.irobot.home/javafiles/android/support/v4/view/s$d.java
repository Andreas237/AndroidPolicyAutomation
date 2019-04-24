// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			s

static class s$d extends s$c
{

	public void a(View view, Rect rect)
	{
		view.setClipBounds(rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method void View.setClipBounds(Rect)>
	//    3    5:return          
	}

	public Rect q(View view)
	{
		return view.getClipBounds();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Rect View.getClipBounds()>
	//    2    4:areturn         
	}

	s$d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void s$c()>
	//    2    4:return          
	}
}
