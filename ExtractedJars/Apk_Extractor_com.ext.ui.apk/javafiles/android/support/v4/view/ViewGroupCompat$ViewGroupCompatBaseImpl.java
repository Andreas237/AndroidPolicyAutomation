// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//			ViewGroupCompat, NestedScrollingParent

static class ViewGroupCompat$ViewGroupCompatBaseImpl
{

	public int getLayoutMode(ViewGroup viewgroup)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getNestedScrollAxes(ViewGroup viewgroup)
	{
		if(viewgroup instanceof NestedScrollingParent)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #17  <Class NestedScrollingParent>
	//*   2    4:ifeq            17
			return ((NestedScrollingParent)viewgroup).getNestedScrollAxes();
	//    3    7:aload_1         
	//    4    8:checkcast       #17  <Class NestedScrollingParent>
	//    5   11:invokeinterface #20  <Method int NestedScrollingParent.getNestedScrollAxes()>
	//    6   16:ireturn         
		else
			return 0;
	//    7   17:iconst_0        
	//    8   18:ireturn         
	}

	public boolean isTransitionGroup(ViewGroup viewgroup)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setLayoutMode(ViewGroup viewgroup, int i)
	{
	//    0    0:return          
	}

	public void setTransitionGroup(ViewGroup viewgroup, boolean flag)
	{
	//    0    0:return          
	}

	ViewGroupCompat$ViewGroupCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
