// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.graphics.Point;
import android.view.View;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			ShowcaseView

interface AnimationFactory
{
	public static interface AnimationEndListener
	{

		public abstract void onAnimationEnd();
	}

	public static interface AnimationStartListener
	{

		public abstract void onAnimationStart();
	}


	public abstract void animateTargetToPoint(ShowcaseView showcaseview, Point point);

	public abstract void fadeInView(View view, long l, AnimationStartListener animationstartlistener);

	public abstract void fadeOutView(View view, long l, AnimationEndListener animationendlistener);
}
