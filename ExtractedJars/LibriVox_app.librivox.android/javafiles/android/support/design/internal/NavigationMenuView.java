// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class NavigationMenuView extends RecyclerView
	implements MenuView
{

	public NavigationMenuView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #11  <Method void NavigationMenuView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NavigationMenuView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #13  <Method void RecyclerView(Context, AttributeSet, int)>
		setLayoutManager(((android.support.v7.widget.RecyclerView.LayoutManager) (new LinearLayoutManager(context, 1, false))));
	//    5    7:aload_0         
	//    6    8:new             #15  <Class LinearLayoutManager>
	//    7   11:dup             
	//    8   12:aload_1         
	//    9   13:iconst_1        
	//   10   14:iconst_0        
	//   11   15:invokespecial   #18  <Method void LinearLayoutManager(Context, int, boolean)>
	//   12   18:invokevirtual   #22  <Method void setLayoutManager(android.support.v7.widget.RecyclerView$LayoutManager)>
	//   13   21:return          
	}

	public int getWindowAnimations()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void initialize(MenuBuilder menubuilder)
	{
	//    0    0:return          
	}
}
