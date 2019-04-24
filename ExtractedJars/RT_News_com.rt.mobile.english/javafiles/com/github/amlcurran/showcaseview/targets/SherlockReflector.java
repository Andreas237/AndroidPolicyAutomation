// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			Reflector

class SherlockReflector
	implements Reflector
{

	public SherlockReflector(Activity activity)
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
	//    4    9:astore_2        
		if(view != null)
	//*   5   10:aload_2         
	//*   6   11:ifnull          16
			return view;
	//    7   14:aload_2         
	//    8   15:areturn         
		int i = mActivity.getResources().getIdentifier("abs__home", "id", mActivity.getPackageName());
	//    9   16:aload_0         
	//   10   17:getfield        #15  <Field Activity mActivity>
	//   11   20:invokevirtual   #41  <Method Resources Activity.getResources()>
	//   12   23:ldc1            #43  <String "abs__home">
	//   13   25:ldc1            #45  <String "id">
	//   14   27:aload_0         
	//   15   28:getfield        #15  <Field Activity mActivity>
	//   16   31:invokevirtual   #49  <Method String Activity.getPackageName()>
	//   17   34:invokevirtual   #55  <Method int Resources.getIdentifier(String, String, String)>
	//   18   37:istore_1        
		view = mActivity.findViewById(i);
	//   19   38:aload_0         
	//   20   39:getfield        #15  <Field Activity mActivity>
	//   21   42:iload_1         
	//   22   43:invokevirtual   #37  <Method View Activity.findViewById(int)>
	//   23   46:astore_2        
		if(view == null)
	//*  24   47:aload_2         
	//*  25   48:ifnonnull       61
			throw new RuntimeException("insertShowcaseViewWithType cannot be used when the theme has no ActionBar");
	//   26   51:new             #57  <Class RuntimeException>
	//   27   54:dup             
	//   28   55:ldc1            #59  <String "insertShowcaseViewWithType cannot be used when the theme has no ActionBar">
	//   29   57:invokespecial   #62  <Method void RuntimeException(String)>
	//   30   60:athrow          
		else
			return view;
	//   31   61:aload_2         
	//   32   62:areturn         
	}

	public void showcaseActionItem(int i)
	{
	//    0    0:return          
	}

	private Activity mActivity;
}
