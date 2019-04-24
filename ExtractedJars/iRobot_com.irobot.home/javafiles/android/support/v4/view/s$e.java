// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//			s

static class s$e extends s$d
{

	public void a(View view, int i)
	{
		view.setImportantForAccessibility(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #20  <Method void View.setImportantForAccessibility(int)>
	//    3    5:return          
	}

	public void b(View view, int i)
	{
		view.setAccessibilityLiveRegion(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #24  <Method void View.setAccessibilityLiveRegion(int)>
	//    3    5:return          
	}

	public boolean r(View view)
	{
		return view.isLaidOut();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method boolean View.isLaidOut()>
	//    2    4:ireturn         
	}

	public boolean s(View view)
	{
		return view.isAttachedToWindow();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method boolean View.isAttachedToWindow()>
	//    2    4:ireturn         
	}

	s$e()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void s$d()>
	//    2    4:return          
	}
}
