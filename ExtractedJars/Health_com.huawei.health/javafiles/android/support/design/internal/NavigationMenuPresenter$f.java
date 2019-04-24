// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.view.*;

// Referenced classes of package android.support.design.internal:
//			NavigationMenuPresenter

static class NavigationMenuPresenter$f extends NavigationMenuPresenter$i
{

	public NavigationMenuPresenter$f(LayoutInflater layoutinflater, ViewGroup viewgroup, android.view.View.OnClickListener onclicklistener)
	{
		super(layoutinflater.inflate(android.support.design.R.layout.design_navigation_item, viewgroup, false));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #15  <Field int android.support.design.R$layout.design_navigation_item>
	//    3    5:aload_2         
	//    4    6:iconst_0        
	//    5    7:invokevirtual   #21  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//    6   10:invokespecial   #24  <Method void NavigationMenuPresenter$i(View)>
		itemView.setOnClickListener(onclicklistener);
	//    7   13:aload_0         
	//    8   14:getfield        #28  <Field View itemView>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #34  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   11   21:return          
	}
}
