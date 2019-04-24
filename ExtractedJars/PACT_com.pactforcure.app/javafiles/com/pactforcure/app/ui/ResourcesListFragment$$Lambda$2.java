// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			ResourcesListFragment

final class ResourcesListFragment$$Lambda$2
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(ResourcesListFragment resourceslistfragment)
	{
		return ((android.view.View.OnClickListener) (new ResourcesListFragment$$Lambda$2(resourceslistfragment)));
	//    0    0:new             #2   <Class ResourcesListFragment$$Lambda$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void ResourcesListFragment$$Lambda$2(ResourcesListFragment)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		ResourcesListFragment.lambda$onCreateView$28(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ResourcesListFragment arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void ResourcesListFragment.lambda$onCreateView$28(ResourcesListFragment, View)>
	//    4    8:return          
	}

	private final ResourcesListFragment arg$1;

	private ResourcesListFragment$$Lambda$2(ResourcesListFragment resourceslistfragment)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = resourceslistfragment;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ResourcesListFragment arg$1>
	//    5    9:return          
	}
}
