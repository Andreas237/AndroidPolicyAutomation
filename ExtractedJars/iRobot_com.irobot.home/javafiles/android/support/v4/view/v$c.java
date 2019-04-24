// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//			v, l

static class v$c
{

	public void a(ViewParent viewparent, View view)
	{
		if(viewparent instanceof l)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class l>
	//*   2    4:ifeq            17
			((l)viewparent).onStopNestedScroll(view);
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class l>
	//    5   11:aload_2         
	//    6   12:invokeinterface #20  <Method void l.onStopNestedScroll(View)>
	//    7   17:return          
	}

	public void a(ViewParent viewparent, View view, int i, int j, int k, int i1)
	{
		if(viewparent instanceof l)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class l>
	//*   2    4:ifeq            24
			((l)viewparent).onNestedScroll(view, i, j, k, i1);
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class l>
	//    5   11:aload_2         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:iload           5
	//    9   17:iload           6
	//   10   19:invokeinterface #25  <Method void l.onNestedScroll(View, int, int, int, int)>
	//   11   24:return          
	}

	public void a(ViewParent viewparent, View view, int i, int j, int ai[])
	{
		if(viewparent instanceof l)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class l>
	//*   2    4:ifeq            22
			((l)viewparent).onNestedPreScroll(view, i, j, ai);
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class l>
	//    5   11:aload_2         
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:aload           5
	//    9   17:invokeinterface #30  <Method void l.onNestedPreScroll(View, int, int, int[])>
	//   10   22:return          
	}

	public boolean a(ViewParent viewparent, View view, float f, float f1)
	{
		if(viewparent instanceof l)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class l>
	//*   2    4:ifeq            21
			return ((l)viewparent).onNestedPreFling(view, f, f1);
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class l>
	//    5   11:aload_2         
	//    6   12:fload_3         
	//    7   13:fload           4
	//    8   15:invokeinterface #35  <Method boolean l.onNestedPreFling(View, float, float)>
	//    9   20:ireturn         
		else
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public boolean a(ViewParent viewparent, View view, float f, float f1, boolean flag)
	{
		if(viewparent instanceof l)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class l>
	//*   2    4:ifeq            23
			return ((l)viewparent).onNestedFling(view, f, f1, flag);
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class l>
	//    5   11:aload_2         
	//    6   12:fload_3         
	//    7   13:fload           4
	//    8   15:iload           5
	//    9   17:invokeinterface #40  <Method boolean l.onNestedFling(View, float, float, boolean)>
	//   10   22:ireturn         
		else
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public boolean a(ViewParent viewparent, View view, View view1, int i)
	{
		if(viewparent instanceof l)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class l>
	//*   2    4:ifeq            21
			return ((l)viewparent).onStartNestedScroll(view, view1, i);
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class l>
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:iload           4
	//    8   15:invokeinterface #45  <Method boolean l.onStartNestedScroll(View, View, int)>
	//    9   20:ireturn         
		else
			return false;
	//   10   21:iconst_0        
	//   11   22:ireturn         
	}

	public void b(ViewParent viewparent, View view, View view1, int i)
	{
		if(viewparent instanceof l)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #16  <Class l>
	//*   2    4:ifeq            20
			((l)viewparent).onNestedScrollAccepted(view, view1, i);
	//    3    7:aload_1         
	//    4    8:checkcast       #16  <Class l>
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:iload           4
	//    8   15:invokeinterface #51  <Method void l.onNestedScrollAccepted(View, View, int)>
	//    9   20:return          
	}

	v$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
