// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static class RecyclerView$e$c
{

	public RecyclerView$e$c a(RecyclerView.u u)
	{
		return a(u, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #23  <Method RecyclerView$e$c a(RecyclerView$u, int)>
	//    4    6:areturn         
	}

	public RecyclerView$e$c a(RecyclerView.u u, int i)
	{
		u = ((RecyclerView.u) (u.a));
	//    0    0:aload_1         
	//    1    1:getfield        #28  <Field View RecyclerView$u.a>
	//    2    4:astore_1        
		a = ((View) (u)).getLeft();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #34  <Method int View.getLeft()>
	//    6   10:putfield        #36  <Field int a>
		b = ((View) (u)).getTop();
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #39  <Method int View.getTop()>
	//   10   18:putfield        #41  <Field int b>
		c = ((View) (u)).getRight();
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #44  <Method int View.getRight()>
	//   14   26:putfield        #46  <Field int c>
		d = ((View) (u)).getBottom();
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #49  <Method int View.getBottom()>
	//   18   34:putfield        #51  <Field int d>
		return this;
	//   19   37:aload_0         
	//   20   38:areturn         
	}

	public int a;
	public int b;
	public int c;
	public int d;

	public RecyclerView$e$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}
