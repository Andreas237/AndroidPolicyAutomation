// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.support.v4.app.*;

// Referenced classes of package com.pactforcure.app.ui:
//			DashboardActivity

public static class DashboardActivity$DashboardTabsAdapter extends FragmentPagerAdapter
{

	public int getCount()
	{
		return 2;
	//    0    0:iconst_2        
	//    1    1:ireturn         
	}

	public Fragment getItem(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 26
	//	               1 34
		default:
			return null;
	//    2   24:aconst_null     
	//    3   25:areturn         

		case 0: // '\0'
			return activity.surveyTasksFragment;
	//    4   26:aload_0         
	//    5   27:getfield        #16  <Field DashboardActivity activity>
	//    6   30:getfield        #25  <Field Fragment DashboardActivity.surveyTasksFragment>
	//    7   33:areturn         

		case 1: // '\001'
			return activity.resourcesFragment;
	//    8   34:aload_0         
	//    9   35:getfield        #16  <Field DashboardActivity activity>
	//   10   38:getfield        #28  <Field Fragment DashboardActivity.resourcesFragment>
	//   11   41:areturn         
		}
	}

	private final DashboardActivity activity;

	public DashboardActivity$DashboardTabsAdapter(DashboardActivity dashboardactivity, FragmentManager fragmentmanager)
	{
		super(fragmentmanager);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #14  <Method void FragmentPagerAdapter(FragmentManager)>
		activity = dashboardactivity;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #16  <Field DashboardActivity activity>
	//    6   10:return          
	}
}
