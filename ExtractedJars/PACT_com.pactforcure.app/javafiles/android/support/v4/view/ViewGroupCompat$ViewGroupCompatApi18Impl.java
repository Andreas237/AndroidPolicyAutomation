// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.ViewGroup;

// Referenced classes of package android.support.v4.view:
//			ViewGroupCompat

static class ViewGroupCompat$ViewGroupCompatApi18Impl extends ViewGroupCompat.ViewGroupCompatBaseImpl
{

	public int getLayoutMode(ViewGroup viewgroup)
	{
		return viewgroup.getLayoutMode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int ViewGroup.getLayoutMode()>
	//    2    4:ireturn         
	}

	public void setLayoutMode(ViewGroup viewgroup, int i)
	{
		viewgroup.setLayoutMode(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #27  <Method void ViewGroup.setLayoutMode(int)>
	//    3    5:return          
	}

	ViewGroupCompat$ViewGroupCompatApi18Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewGroupCompat$ViewGroupCompatBaseImpl()>
	//    2    4:return          
	}
}
