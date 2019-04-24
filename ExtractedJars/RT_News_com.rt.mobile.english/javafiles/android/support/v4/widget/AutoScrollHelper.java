// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.animation.*;

public abstract class AutoScrollHelper
	implements android.view.View.OnTouchListener
{
	private static class ClampedScroller
	{

		private float getValueAt(long l)
		{
			if(l < mStartTime)
		//*   0    0:lload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #29  <Field long mStartTime>
		//*   3    5:lcmp            
		//*   4    6:ifge            11
				return 0.0F;
		//    5    9:fconst_0        
		//    6   10:freturn         
			if(mStopTime >= 0L && l >= mStopTime)
		//*   7   11:aload_0         
		//*   8   12:getfield        #33  <Field long mStopTime>
		//*   9   15:lconst_0        
		//*  10   16:lcmp            
		//*  11   17:iflt            65
		//*  12   20:lload_1         
		//*  13   21:aload_0         
		//*  14   22:getfield        #33  <Field long mStopTime>
		//*  15   25:lcmp            
		//*  16   26:ifge            32
		//*  17   29:goto            65
			{
				long l1 = mStopTime;
		//   18   32:aload_0         
		//   19   33:getfield        #33  <Field long mStopTime>
		//   20   36:lstore_3        
				return (1.0F - mStopValue) + mStopValue * AutoScrollHelper.constrain((float)(l - l1) / (float)mEffectiveRampDown, 0.0F, 1.0F);
		//   21   37:fconst_1        
		//   22   38:aload_0         
		//   23   39:getfield        #44  <Field float mStopValue>
		//   24   42:fsub            
		//   25   43:aload_0         
		//   26   44:getfield        #44  <Field float mStopValue>
		//   27   47:lload_1         
		//   28   48:lload_3         
		//   29   49:lsub            
		//   30   50:l2f             
		//   31   51:aload_0         
		//   32   52:getfield        #46  <Field int mEffectiveRampDown>
		//   33   55:i2f             
		//   34   56:fdiv            
		//   35   57:fconst_0        
		//   36   58:fconst_1        
		//   37   59:invokestatic    #50  <Method float AutoScrollHelper.constrain(float, float, float)>
		//   38   62:fmul            
		//   39   63:fadd            
		//   40   64:freturn         
			} else
			{
				return 0.5F * AutoScrollHelper.constrain((float)(l - mStartTime) / (float)mRampUpDuration, 0.0F, 1.0F);
		//   41   65:ldc1            #51  <Float 0.5F>
		//   42   67:lload_1         
		//   43   68:aload_0         
		//   44   69:getfield        #29  <Field long mStartTime>
		//   45   72:lsub            
		//   46   73:l2f             
		//   47   74:aload_0         
		//   48   75:getfield        #53  <Field int mRampUpDuration>
		//   49   78:i2f             
		//   50   79:fdiv            
		//   51   80:fconst_0        
		//   52   81:fconst_1        
		//   53   82:invokestatic    #50  <Method float AutoScrollHelper.constrain(float, float, float)>
		//   54   85:fmul            
		//   55   86:freturn         
			}
		}

		private float interpolateValue(float f)
		{
			return -4F * f * f + 4F * f;
		//    0    0:ldc1            #56  <Float -4F>
		//    1    2:fload_1         
		//    2    3:fmul            
		//    3    4:fload_1         
		//    4    5:fmul            
		//    5    6:ldc1            #57  <Float 4F>
		//    6    8:fload_1         
		//    7    9:fmul            
		//    8   10:fadd            
		//    9   11:freturn         
		}

		public void computeScrollDelta()
		{
			if(mDeltaTime == 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field long mDeltaTime>
		//*   2    4:lconst_0        
		//*   3    5:lcmp            
		//*   4    6:ifne            19
			{
				throw new RuntimeException("Cannot compute scroll delta before calling start()");
		//    5    9:new             #60  <Class RuntimeException>
		//    6   12:dup             
		//    7   13:ldc1            #62  <String "Cannot compute scroll delta before calling start()">
		//    8   15:invokespecial   #65  <Method void RuntimeException(String)>
		//    9   18:athrow          
			} else
			{
				long l = AnimationUtils.currentAnimationTimeMillis();
		//   10   19:invokestatic    #71  <Method long AnimationUtils.currentAnimationTimeMillis()>
		//   11   22:lstore_2        
				float f = interpolateValue(getValueAt(l));
		//   12   23:aload_0         
		//   13   24:aload_0         
		//   14   25:lload_2         
		//   15   26:invokespecial   #73  <Method float getValueAt(long)>
		//   16   29:invokespecial   #75  <Method float interpolateValue(float)>
		//   17   32:fstore_1        
				long l1 = mDeltaTime;
		//   18   33:aload_0         
		//   19   34:getfield        #35  <Field long mDeltaTime>
		//   20   37:lstore          4
				mDeltaTime = l;
		//   21   39:aload_0         
		//   22   40:lload_2         
		//   23   41:putfield        #35  <Field long mDeltaTime>
				f = (float)(l - l1) * f;
		//   24   44:lload_2         
		//   25   45:lload           4
		//   26   47:lsub            
		//   27   48:l2f             
		//   28   49:fload_1         
		//   29   50:fmul            
		//   30   51:fstore_1        
				mDeltaX = (int)(mTargetVelocityX * f);
		//   31   52:aload_0         
		//   32   53:aload_0         
		//   33   54:getfield        #77  <Field float mTargetVelocityX>
		//   34   57:fload_1         
		//   35   58:fmul            
		//   36   59:f2i             
		//   37   60:putfield        #37  <Field int mDeltaX>
				mDeltaY = (int)(f * mTargetVelocityY);
		//   38   63:aload_0         
		//   39   64:fload_1         
		//   40   65:aload_0         
		//   41   66:getfield        #79  <Field float mTargetVelocityY>
		//   42   69:fmul            
		//   43   70:f2i             
		//   44   71:putfield        #39  <Field int mDeltaY>
				return;
		//   45   74:return          
			}
		}

		public int getDeltaX()
		{
			return mDeltaX;
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field int mDeltaX>
		//    2    4:ireturn         
		}

		public int getDeltaY()
		{
			return mDeltaY;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field int mDeltaY>
		//    2    4:ireturn         
		}

		public int getHorizontalDirection()
		{
			return (int)(mTargetVelocityX / Math.abs(mTargetVelocityX));
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field float mTargetVelocityX>
		//    2    4:aload_0         
		//    3    5:getfield        #77  <Field float mTargetVelocityX>
		//    4    8:invokestatic    #88  <Method float Math.abs(float)>
		//    5   11:fdiv            
		//    6   12:f2i             
		//    7   13:ireturn         
		}

		public int getVerticalDirection()
		{
			return (int)(mTargetVelocityY / Math.abs(mTargetVelocityY));
		//    0    0:aload_0         
		//    1    1:getfield        #79  <Field float mTargetVelocityY>
		//    2    4:aload_0         
		//    3    5:getfield        #79  <Field float mTargetVelocityY>
		//    4    8:invokestatic    #88  <Method float Math.abs(float)>
		//    5   11:fdiv            
		//    6   12:f2i             
		//    7   13:ireturn         
		}

		public boolean isFinished()
		{
			return mStopTime > 0L && AnimationUtils.currentAnimationTimeMillis() > mStopTime + (long)mEffectiveRampDown;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field long mStopTime>
		//    2    4:lconst_0        
		//    3    5:lcmp            
		//    4    6:ifle            28
		//    5    9:invokestatic    #71  <Method long AnimationUtils.currentAnimationTimeMillis()>
		//    6   12:aload_0         
		//    7   13:getfield        #33  <Field long mStopTime>
		//    8   16:aload_0         
		//    9   17:getfield        #46  <Field int mEffectiveRampDown>
		//   10   20:i2l             
		//   11   21:ladd            
		//   12   22:lcmp            
		//   13   23:ifle            28
		//   14   26:iconst_1        
		//   15   27:ireturn         
		//   16   28:iconst_0        
		//   17   29:ireturn         
		}

		public void requestStop()
		{
			long l = AnimationUtils.currentAnimationTimeMillis();
		//    0    0:invokestatic    #71  <Method long AnimationUtils.currentAnimationTimeMillis()>
		//    1    3:lstore_1        
			mEffectiveRampDown = AutoScrollHelper.constrain((int)(l - mStartTime), 0, mRampDownDuration);
		//    2    4:aload_0         
		//    3    5:lload_1         
		//    4    6:aload_0         
		//    5    7:getfield        #29  <Field long mStartTime>
		//    6   10:lsub            
		//    7   11:l2i             
		//    8   12:iconst_0        
		//    9   13:aload_0         
		//   10   14:getfield        #94  <Field int mRampDownDuration>
		//   11   17:invokestatic    #97  <Method int AutoScrollHelper.constrain(int, int, int)>
		//   12   20:putfield        #46  <Field int mEffectiveRampDown>
			mStopValue = getValueAt(l);
		//   13   23:aload_0         
		//   14   24:aload_0         
		//   15   25:lload_1         
		//   16   26:invokespecial   #73  <Method float getValueAt(long)>
		//   17   29:putfield        #44  <Field float mStopValue>
			mStopTime = l;
		//   18   32:aload_0         
		//   19   33:lload_1         
		//   20   34:putfield        #33  <Field long mStopTime>
		//   21   37:return          
		}

		public void setRampDownDuration(int i)
		{
			mRampDownDuration = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #94  <Field int mRampDownDuration>
		//    3    5:return          
		}

		public void setRampUpDuration(int i)
		{
			mRampUpDuration = i;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #53  <Field int mRampUpDuration>
		//    3    5:return          
		}

		public void setTargetVelocity(float f, float f1)
		{
			mTargetVelocityX = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #77  <Field float mTargetVelocityX>
			mTargetVelocityY = f1;
		//    3    5:aload_0         
		//    4    6:fload_2         
		//    5    7:putfield        #79  <Field float mTargetVelocityY>
		//    6   10:return          
		}

		public void start()
		{
			mStartTime = AnimationUtils.currentAnimationTimeMillis();
		//    0    0:aload_0         
		//    1    1:invokestatic    #71  <Method long AnimationUtils.currentAnimationTimeMillis()>
		//    2    4:putfield        #29  <Field long mStartTime>
			mStopTime = -1L;
		//    3    7:aload_0         
		//    4    8:ldc2w           #30  <Long -1L>
		//    5   11:putfield        #33  <Field long mStopTime>
			mDeltaTime = mStartTime;
		//    6   14:aload_0         
		//    7   15:aload_0         
		//    8   16:getfield        #29  <Field long mStartTime>
		//    9   19:putfield        #35  <Field long mDeltaTime>
			mStopValue = 0.5F;
		//   10   22:aload_0         
		//   11   23:ldc1            #51  <Float 0.5F>
		//   12   25:putfield        #44  <Field float mStopValue>
			mDeltaX = 0;
		//   13   28:aload_0         
		//   14   29:iconst_0        
		//   15   30:putfield        #37  <Field int mDeltaX>
			mDeltaY = 0;
		//   16   33:aload_0         
		//   17   34:iconst_0        
		//   18   35:putfield        #39  <Field int mDeltaY>
		//   19   38:return          
		}

		private long mDeltaTime;
		private int mDeltaX;
		private int mDeltaY;
		private int mEffectiveRampDown;
		private int mRampDownDuration;
		private int mRampUpDuration;
		private long mStartTime;
		private long mStopTime;
		private float mStopValue;
		private float mTargetVelocityX;
		private float mTargetVelocityY;

		ClampedScroller()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void Object()>
			mStartTime = 0x0L;
		//    2    4:aload_0         
		//    3    5:ldc2w           #26  <Long 0x0L>
		//    4    8:putfield        #29  <Field long mStartTime>
			mStopTime = -1L;
		//    5   11:aload_0         
		//    6   12:ldc2w           #30  <Long -1L>
		//    7   15:putfield        #33  <Field long mStopTime>
			mDeltaTime = 0L;
		//    8   18:aload_0         
		//    9   19:lconst_0        
		//   10   20:putfield        #35  <Field long mDeltaTime>
			mDeltaX = 0;
		//   11   23:aload_0         
		//   12   24:iconst_0        
		//   13   25:putfield        #37  <Field int mDeltaX>
			mDeltaY = 0;
		//   14   28:aload_0         
		//   15   29:iconst_0        
		//   16   30:putfield        #39  <Field int mDeltaY>
		//   17   33:return          
		}
	}

	private class ScrollAnimationRunnable
		implements Runnable
	{

		public void run()
		{
			if(!mAnimating)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field AutoScrollHelper this$0>
		//*   2    4:getfield        #24  <Field boolean AutoScrollHelper.mAnimating>
		//*   3    7:ifne            11
				return;
		//    4   10:return          
			if(mNeedsReset)
		//*   5   11:aload_0         
		//*   6   12:getfield        #15  <Field AutoScrollHelper this$0>
		//*   7   15:getfield        #27  <Field boolean AutoScrollHelper.mNeedsReset>
		//*   8   18:ifeq            39
			{
				mNeedsReset = false;
		//    9   21:aload_0         
		//   10   22:getfield        #15  <Field AutoScrollHelper this$0>
		//   11   25:iconst_0        
		//   12   26:putfield        #27  <Field boolean AutoScrollHelper.mNeedsReset>
				mScroller.start();
		//   13   29:aload_0         
		//   14   30:getfield        #15  <Field AutoScrollHelper this$0>
		//   15   33:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
		//   16   36:invokevirtual   #36  <Method void AutoScrollHelper$ClampedScroller.start()>
			}
			ClampedScroller clampedscroller = mScroller;
		//   17   39:aload_0         
		//   18   40:getfield        #15  <Field AutoScrollHelper this$0>
		//   19   43:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
		//   20   46:astore_3        
			if(!clampedscroller.isFinished() && shouldAnimate())
		//*  21   47:aload_3         
		//*  22   48:invokevirtual   #40  <Method boolean AutoScrollHelper$ClampedScroller.isFinished()>
		//*  23   51:ifne            127
		//*  24   54:aload_0         
		//*  25   55:getfield        #15  <Field AutoScrollHelper this$0>
		//*  26   58:invokevirtual   #43  <Method boolean AutoScrollHelper.shouldAnimate()>
		//*  27   61:ifne            67
		//*  28   64:goto            127
			{
				if(mNeedsCancel)
		//*  29   67:aload_0         
		//*  30   68:getfield        #15  <Field AutoScrollHelper this$0>
		//*  31   71:getfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
		//*  32   74:ifeq            92
				{
					mNeedsCancel = false;
		//   33   77:aload_0         
		//   34   78:getfield        #15  <Field AutoScrollHelper this$0>
		//   35   81:iconst_0        
		//   36   82:putfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
					cancelTargetTouch();
		//   37   85:aload_0         
		//   38   86:getfield        #15  <Field AutoScrollHelper this$0>
		//   39   89:invokevirtual   #49  <Method void AutoScrollHelper.cancelTargetTouch()>
				}
				clampedscroller.computeScrollDelta();
		//   40   92:aload_3         
		//   41   93:invokevirtual   #52  <Method void AutoScrollHelper$ClampedScroller.computeScrollDelta()>
				int i = clampedscroller.getDeltaX();
		//   42   96:aload_3         
		//   43   97:invokevirtual   #56  <Method int AutoScrollHelper$ClampedScroller.getDeltaX()>
		//   44  100:istore_1        
				int j = clampedscroller.getDeltaY();
		//   45  101:aload_3         
		//   46  102:invokevirtual   #59  <Method int AutoScrollHelper$ClampedScroller.getDeltaY()>
		//   47  105:istore_2        
				scrollTargetBy(i, j);
		//   48  106:aload_0         
		//   49  107:getfield        #15  <Field AutoScrollHelper this$0>
		//   50  110:iload_1         
		//   51  111:iload_2         
		//   52  112:invokevirtual   #63  <Method void AutoScrollHelper.scrollTargetBy(int, int)>
				ViewCompat.postOnAnimation(mTarget, ((Runnable) (this)));
		//   53  115:aload_0         
		//   54  116:getfield        #15  <Field AutoScrollHelper this$0>
		//   55  119:getfield        #67  <Field View AutoScrollHelper.mTarget>
		//   56  122:aload_0         
		//   57  123:invokestatic    #73  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
		//   58  126:return          
			} else
			{
				mAnimating = false;
		//   59  127:aload_0         
		//   60  128:getfield        #15  <Field AutoScrollHelper this$0>
		//   61  131:iconst_0        
		//   62  132:putfield        #24  <Field boolean AutoScrollHelper.mAnimating>
				return;
		//   63  135:return          
			}
		}

		final AutoScrollHelper this$0;

		ScrollAnimationRunnable()
		{
			this$0 = AutoScrollHelper.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field AutoScrollHelper this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public AutoScrollHelper(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #80  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class AutoScrollHelper$ClampedScroller>
	//    4    8:dup             
	//    5    9:invokespecial   #81  <Method void AutoScrollHelper$ClampedScroller()>
	//    6   12:putfield        #83  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    7   15:aload_0         
	//    8   16:new             #85  <Class AccelerateInterpolator>
	//    9   19:dup             
	//   10   20:invokespecial   #86  <Method void AccelerateInterpolator()>
	//   11   23:putfield        #88  <Field Interpolator mEdgeInterpolator>
	//   12   26:aload_0         
	//   13   27:iconst_2        
	//   14   28:newarray        float[]
	//   15   30:dup             
	//   16   31:iconst_0        
	//   17   32:fconst_0        
	//   18   33:fastore         
	//   19   34:dup             
	//   20   35:iconst_1        
	//   21   36:fconst_0        
	//   22   37:fastore         
	//   23   38:putfield        #90  <Field float[] mRelativeEdges>
	//   24   41:aload_0         
	//   25   42:iconst_2        
	//   26   43:newarray        float[]
	//   27   45:dup             
	//   28   46:iconst_0        
	//   29   47:ldc1            #19  <Float 3.402823E+38F>
	//   30   49:fastore         
	//   31   50:dup             
	//   32   51:iconst_1        
	//   33   52:ldc1            #19  <Float 3.402823E+38F>
	//   34   54:fastore         
	//   35   55:putfield        #92  <Field float[] mMaximumEdges>
	//   36   58:aload_0         
	//   37   59:iconst_2        
	//   38   60:newarray        float[]
	//   39   62:dup             
	//   40   63:iconst_0        
	//   41   64:fconst_0        
	//   42   65:fastore         
	//   43   66:dup             
	//   44   67:iconst_1        
	//   45   68:fconst_0        
	//   46   69:fastore         
	//   47   70:putfield        #94  <Field float[] mRelativeVelocity>
	//   48   73:aload_0         
	//   49   74:iconst_2        
	//   50   75:newarray        float[]
	//   51   77:dup             
	//   52   78:iconst_0        
	//   53   79:fconst_0        
	//   54   80:fastore         
	//   55   81:dup             
	//   56   82:iconst_1        
	//   57   83:fconst_0        
	//   58   84:fastore         
	//   59   85:putfield        #96  <Field float[] mMinimumVelocity>
	//   60   88:aload_0         
	//   61   89:iconst_2        
	//   62   90:newarray        float[]
	//   63   92:dup             
	//   64   93:iconst_0        
	//   65   94:ldc1            #19  <Float 3.402823E+38F>
	//   66   96:fastore         
	//   67   97:dup             
	//   68   98:iconst_1        
	//   69   99:ldc1            #19  <Float 3.402823E+38F>
	//   70  101:fastore         
	//   71  102:putfield        #98  <Field float[] mMaximumVelocity>
		mTarget = view;
	//   72  105:aload_0         
	//   73  106:aload_1         
	//   74  107:putfield        #100 <Field View mTarget>
		view = ((View) (Resources.getSystem().getDisplayMetrics()));
	//   75  110:invokestatic    #106 <Method Resources Resources.getSystem()>
	//   76  113:invokevirtual   #110 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   77  116:astore_1        
		int i = (int)(1575F * ((DisplayMetrics) (view)).density + 0.5F);
	//   78  117:ldc1            #111 <Float 1575F>
	//   79  119:aload_1         
	//   80  120:getfield        #116 <Field float DisplayMetrics.density>
	//   81  123:fmul            
	//   82  124:ldc1            #117 <Float 0.5F>
	//   83  126:fadd            
	//   84  127:f2i             
	//   85  128:istore_3        
		int j = (int)(315F * ((DisplayMetrics) (view)).density + 0.5F);
	//   86  129:ldc1            #118 <Float 315F>
	//   87  131:aload_1         
	//   88  132:getfield        #116 <Field float DisplayMetrics.density>
	//   89  135:fmul            
	//   90  136:ldc1            #117 <Float 0.5F>
	//   91  138:fadd            
	//   92  139:f2i             
	//   93  140:istore          4
		float f = i;
	//   94  142:iload_3         
	//   95  143:i2f             
	//   96  144:fstore_2        
		setMaximumVelocity(f, f);
	//   97  145:aload_0         
	//   98  146:fload_2         
	//   99  147:fload_2         
	//  100  148:invokevirtual   #122 <Method AutoScrollHelper setMaximumVelocity(float, float)>
	//  101  151:pop             
		f = j;
	//  102  152:iload           4
	//  103  154:i2f             
	//  104  155:fstore_2        
		setMinimumVelocity(f, f);
	//  105  156:aload_0         
	//  106  157:fload_2         
	//  107  158:fload_2         
	//  108  159:invokevirtual   #125 <Method AutoScrollHelper setMinimumVelocity(float, float)>
	//  109  162:pop             
		setEdgeType(1);
	//  110  163:aload_0         
	//  111  164:iconst_1        
	//  112  165:invokevirtual   #129 <Method AutoScrollHelper setEdgeType(int)>
	//  113  168:pop             
		setMaximumEdges(3.402823E+38F, 3.402823E+38F);
	//  114  169:aload_0         
	//  115  170:ldc1            #19  <Float 3.402823E+38F>
	//  116  172:ldc1            #19  <Float 3.402823E+38F>
	//  117  174:invokevirtual   #132 <Method AutoScrollHelper setMaximumEdges(float, float)>
	//  118  177:pop             
		setRelativeEdges(0.2F, 0.2F);
	//  119  178:aload_0         
	//  120  179:ldc1            #28  <Float 0.2F>
	//  121  181:ldc1            #28  <Float 0.2F>
	//  122  183:invokevirtual   #135 <Method AutoScrollHelper setRelativeEdges(float, float)>
	//  123  186:pop             
		setRelativeVelocity(1.0F, 1.0F);
	//  124  187:aload_0         
	//  125  188:fconst_1        
	//  126  189:fconst_1        
	//  127  190:invokevirtual   #138 <Method AutoScrollHelper setRelativeVelocity(float, float)>
	//  128  193:pop             
		setActivationDelay(DEFAULT_ACTIVATION_DELAY);
	//  129  194:aload_0         
	//  130  195:getstatic       #74  <Field int DEFAULT_ACTIVATION_DELAY>
	//  131  198:invokevirtual   #141 <Method AutoScrollHelper setActivationDelay(int)>
	//  132  201:pop             
		setRampUpDuration(500);
	//  133  202:aload_0         
	//  134  203:sipush          500
	//  135  206:invokevirtual   #144 <Method AutoScrollHelper setRampUpDuration(int)>
	//  136  209:pop             
		setRampDownDuration(500);
	//  137  210:aload_0         
	//  138  211:sipush          500
	//  139  214:invokevirtual   #147 <Method AutoScrollHelper setRampDownDuration(int)>
	//  140  217:pop             
	//  141  218:return          
	}

	private float computeTargetVelocity(int i, float f, float f1, float f2)
	{
		f = getEdgeValue(mRelativeEdges[i], f1, mMaximumEdges[i], f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #90  <Field float[] mRelativeEdges>
	//    3    5:iload_1         
	//    4    6:faload          
	//    5    7:fload_3         
	//    6    8:aload_0         
	//    7    9:getfield        #92  <Field float[] mMaximumEdges>
	//    8   12:iload_1         
	//    9   13:faload          
	//   10   14:fload_2         
	//   11   15:invokespecial   #154 <Method float getEdgeValue(float, float, float, float)>
	//   12   18:fstore_2        
		if(f == 0.0F)
	//*  13   19:fload_2         
	//*  14   20:fconst_0        
	//*  15   21:fcmpl           
	//*  16   22:ifne            27
			return 0.0F;
	//   17   25:fconst_0        
	//   18   26:freturn         
		float f4 = mRelativeVelocity[i];
	//   19   27:aload_0         
	//   20   28:getfield        #94  <Field float[] mRelativeVelocity>
	//   21   31:iload_1         
	//   22   32:faload          
	//   23   33:fstore          6
		f1 = mMinimumVelocity[i];
	//   24   35:aload_0         
	//   25   36:getfield        #96  <Field float[] mMinimumVelocity>
	//   26   39:iload_1         
	//   27   40:faload          
	//   28   41:fstore_3        
		float f3 = mMaximumVelocity[i];
	//   29   42:aload_0         
	//   30   43:getfield        #98  <Field float[] mMaximumVelocity>
	//   31   46:iload_1         
	//   32   47:faload          
	//   33   48:fstore          5
		f2 = f4 * f2;
	//   34   50:fload           6
	//   35   52:fload           4
	//   36   54:fmul            
	//   37   55:fstore          4
		if(f > 0.0F)
	//*  38   57:fload_2         
	//*  39   58:fconst_0        
	//*  40   59:fcmpl           
	//*  41   60:ifle            74
			return constrain(f * f2, f1, f3);
	//   42   63:fload_2         
	//   43   64:fload           4
	//   44   66:fmul            
	//   45   67:fload_3         
	//   46   68:fload           5
	//   47   70:invokestatic    #158 <Method float constrain(float, float, float)>
	//   48   73:freturn         
		else
			return -constrain(-f * f2, f1, f3);
	//   49   74:fload_2         
	//   50   75:fneg            
	//   51   76:fload           4
	//   52   78:fmul            
	//   53   79:fload_3         
	//   54   80:fload           5
	//   55   82:invokestatic    #158 <Method float constrain(float, float, float)>
	//   56   85:fneg            
	//   57   86:freturn         
	}

	static float constrain(float f, float f1, float f2)
	{
		if(f > f2)
	//*   0    0:fload_0         
	//*   1    1:fload_2         
	//*   2    2:fcmpl           
	//*   3    3:ifle            8
			return f2;
	//    4    6:fload_2         
	//    5    7:freturn         
		if(f < f1)
	//*   6    8:fload_0         
	//*   7    9:fload_1         
	//*   8   10:fcmpg           
	//*   9   11:ifge            16
			return f1;
	//   10   14:fload_1         
	//   11   15:freturn         
		else
			return f;
	//   12   16:fload_0         
	//   13   17:freturn         
	}

	static int constrain(int i, int j, int k)
	{
		if(i > k)
	//*   0    0:iload_0         
	//*   1    1:iload_2         
	//*   2    2:icmple          7
			return k;
	//    3    5:iload_2         
	//    4    6:ireturn         
		if(i < j)
	//*   5    7:iload_0         
	//*   6    8:iload_1         
	//*   7    9:icmpge          14
			return j;
	//    8   12:iload_1         
	//    9   13:ireturn         
		else
			return i;
	//   10   14:iload_0         
	//   11   15:ireturn         
	}

	private float constrainEdgeValue(float f, float f1)
	{
		if(f1 == 0.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            8
			return 0.0F;
	//    4    6:fconst_0        
	//    5    7:freturn         
		switch(mEdgeType)
	//*   6    8:aload_0         
	//*   7    9:getfield        #163 <Field int mEdgeType>
		{
	//*   8   12:tableswitch     0 2: default 40
	//	               0 53
	//	               1 53
	//	               2 42
		default:
			return 0.0F;
	//    9   40:fconst_0        
	//   10   41:freturn         

		case 2: // '\002'
			if(f < 0.0F)
	//*  11   42:fload_1         
	//*  12   43:fconst_0        
	//*  13   44:fcmpg           
	//*  14   45:ifge            88
				return f / -f1;
	//   15   48:fload_1         
	//   16   49:fload_2         
	//   17   50:fneg            
	//   18   51:fdiv            
	//   19   52:freturn         
			break;

		case 0: // '\0'
		case 1: // '\001'
			if(f >= f1)
				break;
	//   20   53:fload_1         
	//   21   54:fload_2         
	//   22   55:fcmpg           
	//   23   56:ifge            88
			if(f >= 0.0F)
	//*  24   59:fload_1         
	//*  25   60:fconst_0        
	//*  26   61:fcmpl           
	//*  27   62:iflt            71
				return 1.0F - f / f1;
	//   28   65:fconst_1        
	//   29   66:fload_1         
	//   30   67:fload_2         
	//   31   68:fdiv            
	//   32   69:fsub            
	//   33   70:freturn         
			if(mAnimating && mEdgeType == 1)
	//*  34   71:aload_0         
	//*  35   72:getfield        #165 <Field boolean mAnimating>
	//*  36   75:ifeq            88
	//*  37   78:aload_0         
	//*  38   79:getfield        #163 <Field int mEdgeType>
	//*  39   82:iconst_1        
	//*  40   83:icmpne          88
				return 1.0F;
	//   41   86:fconst_1        
	//   42   87:freturn         
			break;
		}
		return 0.0F;
	//   43   88:fconst_0        
	//   44   89:freturn         
	}

	private float getEdgeValue(float f, float f1, float f2, float f3)
	{
label0:
		{
			f = constrain(f * f1, 0.0F, f2);
	//    0    0:fload_1         
	//    1    1:fload_2         
	//    2    2:fmul            
	//    3    3:fconst_0        
	//    4    4:fload_3         
	//    5    5:invokestatic    #158 <Method float constrain(float, float, float)>
	//    6    8:fstore_1        
			f2 = constrainEdgeValue(f3, f);
	//    7    9:aload_0         
	//    8   10:fload           4
	//    9   12:fload_1         
	//   10   13:invokespecial   #167 <Method float constrainEdgeValue(float, float)>
	//   11   16:fstore_3        
			f = constrainEdgeValue(f1 - f3, f) - f2;
	//   12   17:aload_0         
	//   13   18:fload_2         
	//   14   19:fload           4
	//   15   21:fsub            
	//   16   22:fload_1         
	//   17   23:invokespecial   #167 <Method float constrainEdgeValue(float, float)>
	//   18   26:fload_3         
	//   19   27:fsub            
	//   20   28:fstore_1        
			if(f < 0.0F)
	//*  21   29:fload_1         
	//*  22   30:fconst_0        
	//*  23   31:fcmpg           
	//*  24   32:ifge            51
			{
				f = -mEdgeInterpolator.getInterpolation(-f);
	//   25   35:aload_0         
	//   26   36:getfield        #88  <Field Interpolator mEdgeInterpolator>
	//   27   39:fload_1         
	//   28   40:fneg            
	//   29   41:invokeinterface #173 <Method float Interpolator.getInterpolation(float)>
	//   30   46:fneg            
	//   31   47:fstore_1        
			} else
	//*  32   48:goto            68
			{
				if(f <= 0.0F)
					break label0;
	//   33   51:fload_1         
	//   34   52:fconst_0        
	//   35   53:fcmpl           
	//   36   54:ifle            76
				f = mEdgeInterpolator.getInterpolation(f);
	//   37   57:aload_0         
	//   38   58:getfield        #88  <Field Interpolator mEdgeInterpolator>
	//   39   61:fload_1         
	//   40   62:invokeinterface #173 <Method float Interpolator.getInterpolation(float)>
	//   41   67:fstore_1        
			}
			return constrain(f, -1F, 1.0F);
	//   42   68:fload_1         
	//   43   69:ldc1            #174 <Float -1F>
	//   44   71:fconst_1        
	//   45   72:invokestatic    #158 <Method float constrain(float, float, float)>
	//   46   75:freturn         
		}
		return 0.0F;
	//   47   76:fconst_0        
	//   48   77:freturn         
	}

	private void requestStop()
	{
		if(mNeedsReset)
	//*   0    0:aload_0         
	//*   1    1:getfield        #177 <Field boolean mNeedsReset>
	//*   2    4:ifeq            13
		{
			mAnimating = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #165 <Field boolean mAnimating>
			return;
	//    6   12:return          
		} else
		{
			mScroller.requestStop();
	//    7   13:aload_0         
	//    8   14:getfield        #83  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    9   17:invokevirtual   #179 <Method void AutoScrollHelper$ClampedScroller.requestStop()>
			return;
	//   10   20:return          
		}
	}

	private void startAnimating()
	{
		if(mRunnable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field Runnable mRunnable>
	//*   2    4:ifnonnull       19
			mRunnable = ((Runnable) (new ScrollAnimationRunnable()));
	//    3    7:aload_0         
	//    4    8:new             #11  <Class AutoScrollHelper$ScrollAnimationRunnable>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #185 <Method void AutoScrollHelper$ScrollAnimationRunnable(AutoScrollHelper)>
	//    8   16:putfield        #182 <Field Runnable mRunnable>
		mAnimating = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #165 <Field boolean mAnimating>
		mNeedsReset = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #177 <Field boolean mNeedsReset>
		if(!mAlreadyDelayed && mActivationDelay > 0)
	//*  15   29:aload_0         
	//*  16   30:getfield        #187 <Field boolean mAlreadyDelayed>
	//*  17   33:ifne            62
	//*  18   36:aload_0         
	//*  19   37:getfield        #189 <Field int mActivationDelay>
	//*  20   40:ifle            62
			ViewCompat.postOnAnimationDelayed(mTarget, mRunnable, mActivationDelay);
	//   21   43:aload_0         
	//   22   44:getfield        #100 <Field View mTarget>
	//   23   47:aload_0         
	//   24   48:getfield        #182 <Field Runnable mRunnable>
	//   25   51:aload_0         
	//   26   52:getfield        #189 <Field int mActivationDelay>
	//   27   55:i2l             
	//   28   56:invokestatic    #195 <Method void ViewCompat.postOnAnimationDelayed(View, Runnable, long)>
		else
	//*  29   59:goto            71
			mRunnable.run();
	//   30   62:aload_0         
	//   31   63:getfield        #182 <Field Runnable mRunnable>
	//   32   66:invokeinterface #200 <Method void Runnable.run()>
		mAlreadyDelayed = true;
	//   33   71:aload_0         
	//   34   72:iconst_1        
	//   35   73:putfield        #187 <Field boolean mAlreadyDelayed>
	//   36   76:return          
	}

	public abstract boolean canTargetScrollHorizontally(int i);

	public abstract boolean canTargetScrollVertically(int i);

	void cancelTargetTouch()
	{
		long l = SystemClock.uptimeMillis();
	//    0    0:invokestatic    #210 <Method long SystemClock.uptimeMillis()>
	//    1    3:lstore_1        
		MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//    2    4:lload_1         
	//    3    5:lload_1         
	//    4    6:iconst_3        
	//    5    7:fconst_0        
	//    6    8:fconst_0        
	//    7    9:iconst_0        
	//    8   10:invokestatic    #216 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//    9   13:astore_3        
		mTarget.onTouchEvent(motionevent);
	//   10   14:aload_0         
	//   11   15:getfield        #100 <Field View mTarget>
	//   12   18:aload_3         
	//   13   19:invokevirtual   #222 <Method boolean View.onTouchEvent(MotionEvent)>
	//   14   22:pop             
		motionevent.recycle();
	//   15   23:aload_3         
	//   16   24:invokevirtual   #225 <Method void MotionEvent.recycle()>
	//   17   27:return          
	}

	public boolean isEnabled()
	{
		return mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field boolean mEnabled>
	//    2    4:ireturn         
	}

	public boolean isExclusive()
	{
		return mExclusive;
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field boolean mExclusive>
	//    2    4:ireturn         
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag = mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field boolean mEnabled>
	//    2    4:istore          5
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          6
		if(!flag)
	//*   5    9:iload           5
	//*   6   11:ifne            16
			return false;
	//    7   14:iconst_0        
	//    8   15:ireturn         
		switch(motionevent.getActionMasked())
	//*   9   16:aload_2         
	//*  10   17:invokevirtual   #237 <Method int MotionEvent.getActionMasked()>
		{
		default:
			break;

	//*  11   20:tableswitch     0 3: default 52
	//	               0 62
	//	               1 55
	//	               2 72
	//	               3 55
	//*  12   52:goto            147
		case 1: // '\001'
		case 3: // '\003'
			requestStop();
	//   13   55:aload_0         
	//   14   56:invokespecial   #238 <Method void requestStop()>
			break;
	//   15   59:goto            147

		case 0: // '\0'
			mNeedsCancel = true;
	//   16   62:aload_0         
	//   17   63:iconst_1        
	//   18   64:putfield        #240 <Field boolean mNeedsCancel>
			mAlreadyDelayed = false;
	//   19   67:aload_0         
	//   20   68:iconst_0        
	//   21   69:putfield        #187 <Field boolean mAlreadyDelayed>
			// fall through

		case 2: // '\002'
			float f = computeTargetVelocity(0, motionevent.getX(), view.getWidth(), mTarget.getWidth());
	//   22   72:aload_0         
	//   23   73:iconst_0        
	//   24   74:aload_2         
	//   25   75:invokevirtual   #244 <Method float MotionEvent.getX()>
	//   26   78:aload_1         
	//   27   79:invokevirtual   #247 <Method int View.getWidth()>
	//   28   82:i2f             
	//   29   83:aload_0         
	//   30   84:getfield        #100 <Field View mTarget>
	//   31   87:invokevirtual   #247 <Method int View.getWidth()>
	//   32   90:i2f             
	//   33   91:invokespecial   #249 <Method float computeTargetVelocity(int, float, float, float)>
	//   34   94:fstore_3        
			float f1 = computeTargetVelocity(1, motionevent.getY(), view.getHeight(), mTarget.getHeight());
	//   35   95:aload_0         
	//   36   96:iconst_1        
	//   37   97:aload_2         
	//   38   98:invokevirtual   #252 <Method float MotionEvent.getY()>
	//   39  101:aload_1         
	//   40  102:invokevirtual   #255 <Method int View.getHeight()>
	//   41  105:i2f             
	//   42  106:aload_0         
	//   43  107:getfield        #100 <Field View mTarget>
	//   44  110:invokevirtual   #255 <Method int View.getHeight()>
	//   45  113:i2f             
	//   46  114:invokespecial   #249 <Method float computeTargetVelocity(int, float, float, float)>
	//   47  117:fstore          4
			mScroller.setTargetVelocity(f, f1);
	//   48  119:aload_0         
	//   49  120:getfield        #83  <Field AutoScrollHelper$ClampedScroller mScroller>
	//   50  123:fload_3         
	//   51  124:fload           4
	//   52  126:invokevirtual   #259 <Method void AutoScrollHelper$ClampedScroller.setTargetVelocity(float, float)>
			if(!mAnimating && shouldAnimate())
	//*  53  129:aload_0         
	//*  54  130:getfield        #165 <Field boolean mAnimating>
	//*  55  133:ifne            147
	//*  56  136:aload_0         
	//*  57  137:invokevirtual   #262 <Method boolean shouldAnimate()>
	//*  58  140:ifeq            147
				startAnimating();
	//   59  143:aload_0         
	//   60  144:invokespecial   #264 <Method void startAnimating()>
			break;
		}
		flag = flag1;
	//   61  147:iload           6
	//   62  149:istore          5
		if(mExclusive)
	//*  63  151:aload_0         
	//*  64  152:getfield        #232 <Field boolean mExclusive>
	//*  65  155:ifeq            172
		{
			flag = flag1;
	//   66  158:iload           6
	//   67  160:istore          5
			if(mAnimating)
	//*  68  162:aload_0         
	//*  69  163:getfield        #165 <Field boolean mAnimating>
	//*  70  166:ifeq            172
				flag = true;
	//   71  169:iconst_1        
	//   72  170:istore          5
		}
		return flag;
	//   73  172:iload           5
	//   74  174:ireturn         
	}

	public abstract void scrollTargetBy(int i, int j);

	public AutoScrollHelper setActivationDelay(int i)
	{
		mActivationDelay = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #189 <Field int mActivationDelay>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AutoScrollHelper setEdgeType(int i)
	{
		mEdgeType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #163 <Field int mEdgeType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AutoScrollHelper setEnabled(boolean flag)
	{
		if(mEnabled && !flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field boolean mEnabled>
	//*   2    4:ifeq            15
	//*   3    7:iload_1         
	//*   4    8:ifne            15
			requestStop();
	//    5   11:aload_0         
	//    6   12:invokespecial   #238 <Method void requestStop()>
		mEnabled = flag;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #229 <Field boolean mEnabled>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public AutoScrollHelper setExclusive(boolean flag)
	{
		mExclusive = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #232 <Field boolean mExclusive>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AutoScrollHelper setMaximumEdges(float f, float f1)
	{
		mMaximumEdges[0] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field float[] mMaximumEdges>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:fastore         
		mMaximumEdges[1] = f1;
	//    5    7:aload_0         
	//    6    8:getfield        #92  <Field float[] mMaximumEdges>
	//    7   11:iconst_1        
	//    8   12:fload_2         
	//    9   13:fastore         
		return this;
	//   10   14:aload_0         
	//   11   15:areturn         
	}

	public AutoScrollHelper setMaximumVelocity(float f, float f1)
	{
		mMaximumVelocity[0] = f / 1000F;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field float[] mMaximumVelocity>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:ldc2            #271 <Float 1000F>
	//    5    9:fdiv            
	//    6   10:fastore         
		mMaximumVelocity[1] = f1 / 1000F;
	//    7   11:aload_0         
	//    8   12:getfield        #98  <Field float[] mMaximumVelocity>
	//    9   15:iconst_1        
	//   10   16:fload_2         
	//   11   17:ldc2            #271 <Float 1000F>
	//   12   20:fdiv            
	//   13   21:fastore         
		return this;
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	public AutoScrollHelper setMinimumVelocity(float f, float f1)
	{
		mMinimumVelocity[0] = f / 1000F;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field float[] mMinimumVelocity>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:ldc2            #271 <Float 1000F>
	//    5    9:fdiv            
	//    6   10:fastore         
		mMinimumVelocity[1] = f1 / 1000F;
	//    7   11:aload_0         
	//    8   12:getfield        #96  <Field float[] mMinimumVelocity>
	//    9   15:iconst_1        
	//   10   16:fload_2         
	//   11   17:ldc2            #271 <Float 1000F>
	//   12   20:fdiv            
	//   13   21:fastore         
		return this;
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	public AutoScrollHelper setRampDownDuration(int i)
	{
		mScroller.setRampDownDuration(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #274 <Method void AutoScrollHelper$ClampedScroller.setRampDownDuration(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AutoScrollHelper setRampUpDuration(int i)
	{
		mScroller.setRampUpDuration(i);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #276 <Method void AutoScrollHelper$ClampedScroller.setRampUpDuration(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AutoScrollHelper setRelativeEdges(float f, float f1)
	{
		mRelativeEdges[0] = f;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field float[] mRelativeEdges>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:fastore         
		mRelativeEdges[1] = f1;
	//    5    7:aload_0         
	//    6    8:getfield        #90  <Field float[] mRelativeEdges>
	//    7   11:iconst_1        
	//    8   12:fload_2         
	//    9   13:fastore         
		return this;
	//   10   14:aload_0         
	//   11   15:areturn         
	}

	public AutoScrollHelper setRelativeVelocity(float f, float f1)
	{
		mRelativeVelocity[0] = f / 1000F;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field float[] mRelativeVelocity>
	//    2    4:iconst_0        
	//    3    5:fload_1         
	//    4    6:ldc2            #271 <Float 1000F>
	//    5    9:fdiv            
	//    6   10:fastore         
		mRelativeVelocity[1] = f1 / 1000F;
	//    7   11:aload_0         
	//    8   12:getfield        #94  <Field float[] mRelativeVelocity>
	//    9   15:iconst_1        
	//   10   16:fload_2         
	//   11   17:ldc2            #271 <Float 1000F>
	//   12   20:fdiv            
	//   13   21:fastore         
		return this;
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	boolean shouldAnimate()
	{
		ClampedScroller clampedscroller = mScroller;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    2    4:astore_3        
		int i = clampedscroller.getVerticalDirection();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #279 <Method int AutoScrollHelper$ClampedScroller.getVerticalDirection()>
	//    5    9:istore_1        
		int j = clampedscroller.getHorizontalDirection();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #282 <Method int AutoScrollHelper$ClampedScroller.getHorizontalDirection()>
	//    8   14:istore_2        
		return i != 0 && canTargetScrollVertically(i) || j != 0 && canTargetScrollHorizontally(j);
	//    9   15:iload_1         
	//   10   16:ifeq            27
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #284 <Method boolean canTargetScrollVertically(int)>
	//   14   24:ifne            39
	//   15   27:iload_2         
	//   16   28:ifeq            41
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #286 <Method boolean canTargetScrollHorizontally(int)>
	//   20   36:ifeq            41
	//   21   39:iconst_1        
	//   22   40:ireturn         
	//   23   41:iconst_0        
	//   24   42:ireturn         
	}

	private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
	private static final int DEFAULT_EDGE_TYPE = 1;
	private static final float DEFAULT_MAXIMUM_EDGE = 3.402823E+38F;
	private static final int DEFAULT_MAXIMUM_VELOCITY_DIPS = 1575;
	private static final int DEFAULT_MINIMUM_VELOCITY_DIPS = 315;
	private static final int DEFAULT_RAMP_DOWN_DURATION = 500;
	private static final int DEFAULT_RAMP_UP_DURATION = 500;
	private static final float DEFAULT_RELATIVE_EDGE = 0.2F;
	private static final float DEFAULT_RELATIVE_VELOCITY = 1F;
	public static final int EDGE_TYPE_INSIDE = 0;
	public static final int EDGE_TYPE_INSIDE_EXTEND = 1;
	public static final int EDGE_TYPE_OUTSIDE = 2;
	private static final int HORIZONTAL = 0;
	public static final float NO_MAX = 3.402823E+38F;
	public static final float NO_MIN = 0F;
	public static final float RELATIVE_UNSPECIFIED = 0F;
	private static final int VERTICAL = 1;
	private int mActivationDelay;
	private boolean mAlreadyDelayed;
	boolean mAnimating;
	private final Interpolator mEdgeInterpolator = new AccelerateInterpolator();
	private int mEdgeType;
	private boolean mEnabled;
	private boolean mExclusive;
	private float mMaximumEdges[] = {
		3.402823E+38F, 3.402823E+38F
	};
	private float mMaximumVelocity[] = {
		3.402823E+38F, 3.402823E+38F
	};
	private float mMinimumVelocity[] = {
		0.0F, 0.0F
	};
	boolean mNeedsCancel;
	boolean mNeedsReset;
	private float mRelativeEdges[] = {
		0.0F, 0.0F
	};
	private float mRelativeVelocity[] = {
		0.0F, 0.0F
	};
	private Runnable mRunnable;
	final ClampedScroller mScroller = new ClampedScroller();
	final View mTarget;

	static 
	{
	//    0    0:invokestatic    #72  <Method int ViewConfiguration.getTapTimeout()>
	//    1    3:putstatic       #74  <Field int DEFAULT_ACTIVATION_DELAY>
	//*   2    6:return          
	}
}
