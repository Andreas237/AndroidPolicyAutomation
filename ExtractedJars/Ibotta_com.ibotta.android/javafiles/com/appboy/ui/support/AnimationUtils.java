// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.support;

import android.view.animation.*;

public class AnimationUtils
{

	public AnimationUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static Animation createHorizontalAnimation(float f, float f1, long l, boolean flag)
	{
		return setAnimationParams(((Animation) (new TranslateAnimation(1, f, 1, f1, 2, 0.0F, 2, 0.0F))), l, flag);
	//    0    0:new             #27  <Class TranslateAnimation>
	//    1    3:dup             
	//    2    4:iconst_1        
	//    3    5:fload_0         
	//    4    6:iconst_1        
	//    5    7:fload_1         
	//    6    8:iconst_2        
	//    7    9:fconst_0        
	//    8   10:iconst_2        
	//    9   11:fconst_0        
	//   10   12:invokespecial   #30  <Method void TranslateAnimation(int, float, int, float, int, float, int, float)>
	//   11   15:lload_2         
	//   12   16:iload           4
	//   13   18:invokestatic    #34  <Method Animation setAnimationParams(Animation, long, boolean)>
	//   14   21:areturn         
	}

	public static Animation createVerticalAnimation(float f, float f1, long l, boolean flag)
	{
		return setAnimationParams(((Animation) (new TranslateAnimation(2, 0.0F, 2, 0.0F, 1, f, 1, f1))), l, flag);
	//    0    0:new             #27  <Class TranslateAnimation>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:fconst_0        
	//    4    6:iconst_2        
	//    5    7:fconst_0        
	//    6    8:iconst_1        
	//    7    9:fload_0         
	//    8   10:iconst_1        
	//    9   11:fload_1         
	//   10   12:invokespecial   #30  <Method void TranslateAnimation(int, float, int, float, int, float, int, float)>
	//   11   15:lload_2         
	//   12   16:iload           4
	//   13   18:invokestatic    #34  <Method Animation setAnimationParams(Animation, long, boolean)>
	//   14   21:areturn         
	}

	public static Animation setAnimationParams(Animation animation, long l, boolean flag)
	{
		animation.setDuration(l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #41  <Method void Animation.setDuration(long)>
		if(flag)
	//*   3    5:iload_3         
	//*   4    6:ifeq            18
		{
			animation.setInterpolator(sAccelerateInterpolator);
	//    5    9:aload_0         
	//    6   10:getstatic       #16  <Field Interpolator sAccelerateInterpolator>
	//    7   13:invokevirtual   #45  <Method void Animation.setInterpolator(Interpolator)>
			return animation;
	//    8   16:aload_0         
	//    9   17:areturn         
		} else
		{
			animation.setInterpolator(sDecelerateInterpolator);
	//   10   18:aload_0         
	//   11   19:getstatic       #21  <Field Interpolator sDecelerateInterpolator>
	//   12   22:invokevirtual   #45  <Method void Animation.setInterpolator(Interpolator)>
			return animation;
	//   13   25:aload_0         
	//   14   26:areturn         
		}
	}

	private static Interpolator sAccelerateInterpolator = new AccelerateInterpolator();
	private static Interpolator sDecelerateInterpolator = new DecelerateInterpolator();

	static 
	{
	//    0    0:new             #11  <Class AccelerateInterpolator>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void AccelerateInterpolator()>
	//    3    7:putstatic       #16  <Field Interpolator sAccelerateInterpolator>
	//    4   10:new             #18  <Class DecelerateInterpolator>
	//    5   13:dup             
	//    6   14:invokespecial   #19  <Method void DecelerateInterpolator()>
	//    7   17:putstatic       #21  <Field Interpolator sDecelerateInterpolator>
	//*   8   20:return          
	}
}
