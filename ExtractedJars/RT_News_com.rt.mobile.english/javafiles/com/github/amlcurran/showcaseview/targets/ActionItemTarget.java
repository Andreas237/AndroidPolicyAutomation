// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview.targets;

import android.app.Activity;
import android.graphics.Point;

// Referenced classes of package com.github.amlcurran.showcaseview.targets:
//			Target, ViewTarget, ActionBarViewWrapper, ReflectorFactory, 
//			Reflector

public class ActionItemTarget
	implements Target
{

	public ActionItemTarget(Activity activity, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mActivity = activity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Activity mActivity>
		mItemId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int mItemId>
	//    8   14:return          
	}

	public Point getPoint()
	{
		setUp();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method void setUp()>
		return (new ViewTarget(mActionBarWrapper.getActionItem(mItemId))).getPoint();
	//    2    4:new             #29  <Class ViewTarget>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #31  <Field ActionBarViewWrapper mActionBarWrapper>
	//    6   12:aload_0         
	//    7   13:getfield        #21  <Field int mItemId>
	//    8   16:invokevirtual   #37  <Method android.view.View ActionBarViewWrapper.getActionItem(int)>
	//    9   19:invokespecial   #40  <Method void ViewTarget(android.view.View)>
	//   10   22:invokevirtual   #42  <Method Point ViewTarget.getPoint()>
	//   11   25:areturn         
	}

	protected void setUp()
	{
		mActionBarWrapper = new ActionBarViewWrapper(ReflectorFactory.getReflectorForActivity(mActivity).getActionBarView());
	//    0    0:aload_0         
	//    1    1:new             #33  <Class ActionBarViewWrapper>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field Activity mActivity>
	//    5    9:invokestatic    #48  <Method Reflector ReflectorFactory.getReflectorForActivity(Activity)>
	//    6   12:invokeinterface #54  <Method android.view.ViewParent Reflector.getActionBarView()>
	//    7   17:invokespecial   #57  <Method void ActionBarViewWrapper(android.view.ViewParent)>
	//    8   20:putfield        #31  <Field ActionBarViewWrapper mActionBarWrapper>
	//    9   23:return          
	}

	ActionBarViewWrapper mActionBarWrapper;
	private final Activity mActivity;
	private final int mItemId;
}
