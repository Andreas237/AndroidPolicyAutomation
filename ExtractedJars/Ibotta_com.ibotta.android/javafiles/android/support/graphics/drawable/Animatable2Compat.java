// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public interface Animatable2Compat
	extends Animatable
{
	public static abstract class AnimationCallback
	{

		android.graphics.drawable.Animatable2.AnimationCallback getPlatformCallback()
		{
			if(mPlatformCallback == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #23  <Field android.graphics.drawable.Animatable2$AnimationCallback mPlatformCallback>
		//*   2    4:ifnonnull       19
				mPlatformCallback = ((android.graphics.drawable.Animatable2.AnimationCallback) (new android.graphics.drawable.Animatable2.AnimationCallback() {

					public void onAnimationEnd(Drawable drawable)
					{
						AnimationCallback.this.onAnimationEnd(drawable);
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field Animatable2Compat$AnimationCallback this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #26  <Method void Animatable2Compat$AnimationCallback.onAnimationEnd(Drawable)>
					//    4    8:return          
					}

					public void onAnimationStart(Drawable drawable)
					{
						AnimationCallback.this.onAnimationStart(drawable);
					//    0    0:aload_0         
					//    1    1:getfield        #18  <Field Animatable2Compat$AnimationCallback this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #29  <Method void Animatable2Compat$AnimationCallback.onAnimationStart(Drawable)>
					//    4    8:return          
					}

					final AnimationCallback this$0;

			
			{
				this$0 = AnimationCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field Animatable2Compat$AnimationCallback this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void android.graphics.drawable.Animatable2$AnimationCallback()>
			//    5    9:return          
			}
				}
));
		//    3    7:aload_0         
		//    4    8:new             #9   <Class Animatable2Compat$AnimationCallback$1>
		//    5   11:dup             
		//    6   12:aload_0         
		//    7   13:invokespecial   #26  <Method void Animatable2Compat$AnimationCallback$1(Animatable2Compat$AnimationCallback)>
		//    8   16:putfield        #23  <Field android.graphics.drawable.Animatable2$AnimationCallback mPlatformCallback>
			return mPlatformCallback;
		//    9   19:aload_0         
		//   10   20:getfield        #23  <Field android.graphics.drawable.Animatable2$AnimationCallback mPlatformCallback>
		//   11   23:areturn         
		}

		public void onAnimationEnd(Drawable drawable)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Drawable drawable)
		{
		//    0    0:return          
		}

		android.graphics.drawable.Animatable2.AnimationCallback mPlatformCallback;

		public AnimationCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void Object()>
		//    2    4:return          
		}
	}


	public abstract void clearAnimationCallbacks();

	public abstract void registerAnimationCallback(AnimationCallback animationcallback);

	public abstract boolean unregisterAnimationCallback(AnimationCallback animationcallback);
}
