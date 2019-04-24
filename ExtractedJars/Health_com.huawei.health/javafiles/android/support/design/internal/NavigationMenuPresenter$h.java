// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.view.LayoutInflater;
import android.view.ViewGroup;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter

static class NavigationMenuPresenter$h extends NavigationMenuPresenter$i
{

	public NavigationMenuPresenter$h(LayoutInflater layoutinflater, ViewGroup viewgroup)
	{
		super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item_separator, viewgroup, false));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item_separator>
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #21  <Method android.view.View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$i(android.view.View)>
	//    7   13:return          
	}
}
