// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import com.amap.api.maps.model.animation.Animation;

public interface IInfoWindowManager
{

	public abstract void setInfoWindowAnimation(Animation animation, com.amap.api.maps.model.animation.Animation.AnimationListener animationlistener);

	public abstract void setInfoWindowAppearAnimation(Animation animation);

	public abstract void setInfoWindowBackColor(int i);

	public abstract void setInfoWindowBackEnable(boolean flag);

	public abstract void setInfoWindowBackScale(float f, float f1);

	public abstract void setInfoWindowDisappearAnimation(Animation animation);

	public abstract void setInfoWindowMovingAnimation(Animation animation);

	public abstract void startAnimation();
}
