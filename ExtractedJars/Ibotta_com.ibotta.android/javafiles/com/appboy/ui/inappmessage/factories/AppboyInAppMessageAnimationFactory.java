// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.factories;

import android.content.res.Resources;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.appboy.enums.inappmessage.SlideFrom;
import com.appboy.models.IInAppMessage;
import com.appboy.models.InAppMessageSlideup;
import com.appboy.ui.inappmessage.IInAppMessageAnimationFactory;
import com.appboy.ui.support.AnimationUtils;

public class AppboyInAppMessageAnimationFactory
	implements IInAppMessageAnimationFactory
{

	public AppboyInAppMessageAnimationFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:invokestatic    #18  <Method Resources Resources.getSystem()>
	//    4    8:ldc1            #19  <Int 0x10e0000>
	//    5   10:invokevirtual   #23  <Method int Resources.getInteger(int)>
	//    6   13:putfield        #25  <Field int mShortAnimationDurationMillis>
	//    7   16:return          
	}

	public Animation getClosingAnimation(IInAppMessage iinappmessage)
	{
		if(iinappmessage instanceof InAppMessageSlideup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #30  <Class InAppMessageSlideup>
	//*   2    4:ifeq            45
		{
			if(((InAppMessageSlideup)iinappmessage).getSlideFrom() == SlideFrom.TOP)
	//*   3    7:aload_1         
	//*   4    8:checkcast       #30  <Class InAppMessageSlideup>
	//*   5   11:invokevirtual   #34  <Method SlideFrom InAppMessageSlideup.getSlideFrom()>
	//*   6   14:getstatic       #40  <Field SlideFrom SlideFrom.TOP>
	//*   7   17:if_acmpne       33
				return AnimationUtils.createVerticalAnimation(0.0F, -1F, mShortAnimationDurationMillis, false);
	//    8   20:fconst_0        
	//    9   21:ldc1            #41  <Float -1F>
	//   10   23:aload_0         
	//   11   24:getfield        #25  <Field int mShortAnimationDurationMillis>
	//   12   27:i2l             
	//   13   28:iconst_0        
	//   14   29:invokestatic    #47  <Method Animation AnimationUtils.createVerticalAnimation(float, float, long, boolean)>
	//   15   32:areturn         
			else
				return AnimationUtils.createVerticalAnimation(0.0F, 1.0F, mShortAnimationDurationMillis, false);
	//   16   33:fconst_0        
	//   17   34:fconst_1        
	//   18   35:aload_0         
	//   19   36:getfield        #25  <Field int mShortAnimationDurationMillis>
	//   20   39:i2l             
	//   21   40:iconst_0        
	//   22   41:invokestatic    #47  <Method Animation AnimationUtils.createVerticalAnimation(float, float, long, boolean)>
	//   23   44:areturn         
		} else
		{
			return AnimationUtils.setAnimationParams(((Animation) (new AlphaAnimation(1.0F, 0.0F))), mShortAnimationDurationMillis, false);
	//   24   45:new             #49  <Class AlphaAnimation>
	//   25   48:dup             
	//   26   49:fconst_1        
	//   27   50:fconst_0        
	//   28   51:invokespecial   #52  <Method void AlphaAnimation(float, float)>
	//   29   54:aload_0         
	//   30   55:getfield        #25  <Field int mShortAnimationDurationMillis>
	//   31   58:i2l             
	//   32   59:iconst_0        
	//   33   60:invokestatic    #56  <Method Animation AnimationUtils.setAnimationParams(Animation, long, boolean)>
	//   34   63:areturn         
		}
	}

	public Animation getOpeningAnimation(IInAppMessage iinappmessage)
	{
		if(iinappmessage instanceof InAppMessageSlideup)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #30  <Class InAppMessageSlideup>
	//*   2    4:ifeq            45
		{
			if(((InAppMessageSlideup)iinappmessage).getSlideFrom() == SlideFrom.TOP)
	//*   3    7:aload_1         
	//*   4    8:checkcast       #30  <Class InAppMessageSlideup>
	//*   5   11:invokevirtual   #34  <Method SlideFrom InAppMessageSlideup.getSlideFrom()>
	//*   6   14:getstatic       #40  <Field SlideFrom SlideFrom.TOP>
	//*   7   17:if_acmpne       33
				return AnimationUtils.createVerticalAnimation(-1F, 0.0F, mShortAnimationDurationMillis, false);
	//    8   20:ldc1            #41  <Float -1F>
	//    9   22:fconst_0        
	//   10   23:aload_0         
	//   11   24:getfield        #25  <Field int mShortAnimationDurationMillis>
	//   12   27:i2l             
	//   13   28:iconst_0        
	//   14   29:invokestatic    #47  <Method Animation AnimationUtils.createVerticalAnimation(float, float, long, boolean)>
	//   15   32:areturn         
			else
				return AnimationUtils.createVerticalAnimation(1.0F, 0.0F, mShortAnimationDurationMillis, false);
	//   16   33:fconst_1        
	//   17   34:fconst_0        
	//   18   35:aload_0         
	//   19   36:getfield        #25  <Field int mShortAnimationDurationMillis>
	//   20   39:i2l             
	//   21   40:iconst_0        
	//   22   41:invokestatic    #47  <Method Animation AnimationUtils.createVerticalAnimation(float, float, long, boolean)>
	//   23   44:areturn         
		} else
		{
			return AnimationUtils.setAnimationParams(((Animation) (new AlphaAnimation(0.0F, 1.0F))), mShortAnimationDurationMillis, true);
	//   24   45:new             #49  <Class AlphaAnimation>
	//   25   48:dup             
	//   26   49:fconst_0        
	//   27   50:fconst_1        
	//   28   51:invokespecial   #52  <Method void AlphaAnimation(float, float)>
	//   29   54:aload_0         
	//   30   55:getfield        #25  <Field int mShortAnimationDurationMillis>
	//   31   58:i2l             
	//   32   59:iconst_1        
	//   33   60:invokestatic    #56  <Method Animation AnimationUtils.setAnimationParams(Animation, long, boolean)>
	//   34   63:areturn         
		}
	}

	private final int mShortAnimationDurationMillis = Resources.getSystem().getInteger(0x10e0000);
}
