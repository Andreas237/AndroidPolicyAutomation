// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			Reflector

class ActionBarReflector
	implements Reflector
{

	public ActionBarReflector(Activity activity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Activity mActivity>
	//    5    9:return          
	}

	public ViewParent getActionBarView()
	{
		return getHomeButton().getParent().getParent();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #22  <Method View getHomeButton()>
	//    2    4:invokevirtual   #27  <Method ViewParent View.getParent()>
	//    3    7:invokeinterface #30  <Method ViewParent ViewParent.getParent()>
	//    4   12:areturn         
	}

	public View getHomeButton()
	{
		View view = mActivity.findViewById(0x102002c);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Activity mActivity>
	//    2    4:ldc1            #31  <Int 0x102002c>
	//    3    6:invokevirtual   #37  <Method View Activity.findViewById(int)>
	//    4    9:astore_1        
		if(view == null)
	//*   5   10:aload_1         
	//*   6   11:ifnonnull       24
			throw new RuntimeException("insertShowcaseViewWithType cannot be used when the theme has no ActionBar");
	//    7   14:new             #39  <Class RuntimeException>
	//    8   17:dup             
	//    9   18:ldc1            #41  <String "insertShowcaseViewWithType cannot be used when the theme has no ActionBar">
	//   10   20:invokespecial   #44  <Method void RuntimeException(String)>
	//   11   23:athrow          
		else
			return view;
	//   12   24:aload_1         
	//   13   25:areturn         
	}

	public void showcaseActionItem(int i)
	{
	//    0    0:return          
	}

	private Activity mActivity;
}
