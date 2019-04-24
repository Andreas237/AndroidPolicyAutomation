// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.interfaces;

import com.autonavi.amap.mapcore.animation.GLAnimation;

public interface IAnimation
{

	public abstract void setAnimation(GLAnimation glanimation);

	public abstract void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener animationlistener);

	public abstract boolean startAnimation();
}
