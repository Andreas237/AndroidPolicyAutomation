// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.graphics.drawable;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

// Referenced classes of package android.support.v7.graphics.drawable:
//			AnimatedStateListDrawableCompat

private static class AnimatedStateListDrawableCompat$AnimationDrawableTransition extends AnimatedStateListDrawableCompat.Transition
{

	public boolean canReverse()
	{
		return mHasReversibleFlag;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field boolean mHasReversibleFlag>
	//    2    4:ireturn         
	}

	public void reverse()
	{
		mAnim.reverse();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ObjectAnimator mAnim>
	//    2    4:invokevirtual   #67  <Method void ObjectAnimator.reverse()>
	//    3    7:return          
	}

	public void start()
	{
		mAnim.start();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ObjectAnimator mAnim>
	//    2    4:invokevirtual   #70  <Method void ObjectAnimator.start()>
	//    3    7:return          
	}

	public void stop()
	{
		mAnim.cancel();
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field ObjectAnimator mAnim>
	//    2    4:invokevirtual   #74  <Method void ObjectAnimator.cancel()>
	//    3    7:return          
	}

	private final ObjectAnimator mAnim;
	private final boolean mHasReversibleFlag;

	AnimatedStateListDrawableCompat$AnimationDrawableTransition(AnimationDrawable animationdrawable, boolean flag, boolean flag1)
	{
		super(((AnimatedStateListDrawableCompat._cls1) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #16  <Method void AnimatedStateListDrawableCompat$Transition(AnimatedStateListDrawableCompat$1)>
		int j = animationdrawable.getNumberOfFrames();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #22  <Method int AnimationDrawable.getNumberOfFrames()>
	//    5    9:istore          5
		int i;
		if(flag)
	//*   6   11:iload_2         
	//*   7   12:ifeq            24
			i = j - 1;
	//    8   15:iload           5
	//    9   17:iconst_1        
	//   10   18:isub            
	//   11   19:istore          4
		else
	//*  12   21:goto            27
			i = 0;
	//   13   24:iconst_0        
	//   14   25:istore          4
		if(flag)
	//*  15   27:iload_2         
	//*  16   28:ifeq            37
			j = 0;
	//   17   31:iconst_0        
	//   18   32:istore          5
		else
	//*  19   34:goto            43
			j--;
	//   20   37:iload           5
	//   21   39:iconst_1        
	//   22   40:isub            
	//   23   41:istore          5
		AnimatedStateListDrawableCompat.FrameInterpolator frameinterpolator = new AnimatedStateListDrawableCompat.FrameInterpolator(animationdrawable, flag);
	//   24   43:new             #24  <Class AnimatedStateListDrawableCompat$FrameInterpolator>
	//   25   46:dup             
	//   26   47:aload_1         
	//   27   48:iload_2         
	//   28   49:invokespecial   #27  <Method void AnimatedStateListDrawableCompat$FrameInterpolator(AnimationDrawable, boolean)>
	//   29   52:astore          6
		animationdrawable = ((AnimationDrawable) (ObjectAnimator.ofInt(((Object) (animationdrawable)), "currentIndex", new int[] {
			i, j
		})));
	//   30   54:aload_1         
	//   31   55:ldc1            #29  <String "currentIndex">
	//   32   57:iconst_2        
	//   33   58:newarray        int[]
	//   34   60:dup             
	//   35   61:iconst_0        
	//   36   62:iload           4
	//   37   64:iastore         
	//   38   65:dup             
	//   39   66:iconst_1        
	//   40   67:iload           5
	//   41   69:iastore         
	//   42   70:invokestatic    #35  <Method ObjectAnimator ObjectAnimator.ofInt(Object, String, int[])>
	//   43   73:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*  44   74:getstatic       #41  <Field int android.os.Build$VERSION.SDK_INT>
	//*  45   77:bipush          18
	//*  46   79:icmplt          87
			((ObjectAnimator) (animationdrawable)).setAutoCancel(true);
	//   47   82:aload_1         
	//   48   83:iconst_1        
	//   49   84:invokevirtual   #45  <Method void ObjectAnimator.setAutoCancel(boolean)>
		((ObjectAnimator) (animationdrawable)).setDuration(frameinterpolator.getTotalDuration());
	//   50   87:aload_1         
	//   51   88:aload           6
	//   52   90:invokevirtual   #48  <Method int AnimatedStateListDrawableCompat$FrameInterpolator.getTotalDuration()>
	//   53   93:i2l             
	//   54   94:invokevirtual   #52  <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   55   97:pop             
		((ObjectAnimator) (animationdrawable)).setInterpolator(((android.animation.TimeInterpolator) (frameinterpolator)));
	//   56   98:aload_1         
	//   57   99:aload           6
	//   58  101:invokevirtual   #56  <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
		mHasReversibleFlag = flag1;
	//   59  104:aload_0         
	//   60  105:iload_3         
	//   61  106:putfield        #58  <Field boolean mHasReversibleFlag>
		mAnim = ((ObjectAnimator) (animationdrawable));
	//   62  109:aload_0         
	//   63  110:aload_1         
	//   64  111:putfield        #60  <Field ObjectAnimator mAnim>
	//   65  114:return          
	}
}
