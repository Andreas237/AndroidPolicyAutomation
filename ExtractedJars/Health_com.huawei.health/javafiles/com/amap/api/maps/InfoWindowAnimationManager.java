// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import com.amap.api.maps.model.animation.Animation;
import com.autonavi.amap.mapcore.interfaces.IInfoWindowManager;

public class InfoWindowAnimationManager
{

	public InfoWindowAnimationManager(IInfoWindowManager iinfowindowmanager)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #13  <Field IInfoWindowManager a>
		a = iinfowindowmanager;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #13  <Field IInfoWindowManager a>
	//    8   14:return          
	}

	public void setInfoWindowAnimation(Animation animation, com.amap.api.maps.model.animation.Animation.AnimationListener animationlistener)
	{
		a.setInfoWindowAnimation(animation, animationlistener);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #20  <Method void IInfoWindowManager.setInfoWindowAnimation(Animation, com.amap.api.maps.model.animation.Animation$AnimationListener)>
	//    5   11:return          
	}

	public void setInfoWindowAppearAnimation(Animation animation)
	{
		a.setInfoWindowAppearAnimation(animation);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #24  <Method void IInfoWindowManager.setInfoWindowAppearAnimation(Animation)>
	//    4   10:return          
	}

	public void setInfoWindowBackColor(int i)
	{
		a.setInfoWindowBackColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #28  <Method void IInfoWindowManager.setInfoWindowBackColor(int)>
	//    4   10:return          
	}

	public void setInfoWindowBackEnable(boolean flag)
	{
		a.setInfoWindowBackEnable(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:iload_1         
	//    3    5:invokeinterface #32  <Method void IInfoWindowManager.setInfoWindowBackEnable(boolean)>
	//    4   10:return          
	}

	public void setInfoWindowBackScale(float f, float f1)
	{
		a.setInfoWindowBackScale(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokeinterface #36  <Method void IInfoWindowManager.setInfoWindowBackScale(float, float)>
	//    5   11:return          
	}

	public void setInfoWindowDisappearAnimation(Animation animation)
	{
		a.setInfoWindowDisappearAnimation(animation);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #39  <Method void IInfoWindowManager.setInfoWindowDisappearAnimation(Animation)>
	//    4   10:return          
	}

	public void setInfoWindowMovingAnimation(Animation animation)
	{
		a.setInfoWindowMovingAnimation(animation);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:aload_1         
	//    3    5:invokeinterface #42  <Method void IInfoWindowManager.setInfoWindowMovingAnimation(Animation)>
	//    4   10:return          
	}

	public void startAnimation()
	{
		a.startAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field IInfoWindowManager a>
	//    2    4:invokeinterface #45  <Method void IInfoWindowManager.startAnimation()>
	//    3    9:return          
	}

	IInfoWindowManager a;
}
