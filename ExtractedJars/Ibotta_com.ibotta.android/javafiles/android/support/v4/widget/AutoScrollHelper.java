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
			long l1 = mStopTime;
		//    7   11:aload_0         
		//    8   12:getfield        #33  <Field long mStopTime>
		//    9   15:lstore          4
			if(l1 >= 0L && l >= l1)
		//*  10   17:lload           4
		//*  11   19:lconst_0        
		//*  12   20:lcmp            
		//*  13   21:iflt            62
		//*  14   24:lload_1         
		//*  15   25:lload           4
		//*  16   27:lcmp            
		//*  17   28:ifge            34
		//*  18   31:goto            62
			{
				float f = mStopValue;
		//   19   34:aload_0         
		//   20   35:getfield        #44  <Field float mStopValue>
		//   21   38:fstore_3        
				return (1.0F - f) + f * AutoScrollHelper.constrain((float)(l - l1) / (float)mEffectiveRampDown, 0.0F, 1.0F);
		//   22   39:fconst_1        
		//   23   40:fload_3         
		//   24   41:fsub            
		//   25   42:fload_3         
		//   26   43:lload_1         
		//   27   44:lload           4
		//   28   46:lsub            
		//   29   47:l2f             
		//   30   48:aload_0         
		//   31   49:getfield        #46  <Field int mEffectiveRampDown>
		//   32   52:i2f             
		//   33   53:fdiv            
		//   34   54:fconst_0        
		//   35   55:fconst_1        
		//   36   56:invokestatic    #50  <Method float AutoScrollHelper.constrain(float, float, float)>
		//   37   59:fmul            
		//   38   60:fadd            
		//   39   61:freturn         
			} else
			{
				return AutoScrollHelper.constrain((float)(l - mStartTime) / (float)mRampUpDuration, 0.0F, 1.0F) * 0.5F;
		//   40   62:lload_1         
		//   41   63:aload_0         
		//   42   64:getfield        #29  <Field long mStartTime>
		//   43   67:lsub            
		//   44   68:l2f             
		//   45   69:aload_0         
		//   46   70:getfield        #52  <Field int mRampUpDuration>
		//   47   73:i2f             
		//   48   74:fdiv            
		//   49   75:fconst_0        
		//   50   76:fconst_1        
		//   51   77:invokestatic    #50  <Method float AutoScrollHelper.constrain(float, float, float)>
		//   52   80:ldc1            #53  <Float 0.5F>
		//   53   82:fmul            
		//   54   83:freturn         
			}
		}

		private float interpolateValue(float f)
		{
			return -4F * f * f + f * 4F;
		//    0    0:ldc1            #56  <Float -4F>
		//    1    2:fload_1         
		//    2    3:fmul            
		//    3    4:fload_1         
		//    4    5:fmul            
		//    5    6:fload_1         
		//    6    7:ldc1            #57  <Float 4F>
		//    7    9:fmul            
		//    8   10:fadd            
		//    9   11:freturn         
		}

		public void computeScrollDelta()
		{
			if(mDeltaTime != 0L)
		//*   0    0:aload_0         
		//*   1    1:getfield        #35  <Field long mDeltaTime>
		//*   2    4:lconst_0        
		//*   3    5:lcmp            
		//*   4    6:ifeq            65
			{
				long l = AnimationUtils.currentAnimationTimeMillis();
		//    5    9:invokestatic    #64  <Method long AnimationUtils.currentAnimationTimeMillis()>
		//    6   12:lstore_2        
				float f = interpolateValue(getValueAt(l));
		//    7   13:aload_0         
		//    8   14:aload_0         
		//    9   15:lload_2         
		//   10   16:invokespecial   #66  <Method float getValueAt(long)>
		//   11   19:invokespecial   #68  <Method float interpolateValue(float)>
		//   12   22:fstore_1        
				long l1 = mDeltaTime;
		//   13   23:aload_0         
		//   14   24:getfield        #35  <Field long mDeltaTime>
		//   15   27:lstore          4
				mDeltaTime = l;
		//   16   29:aload_0         
		//   17   30:lload_2         
		//   18   31:putfield        #35  <Field long mDeltaTime>
				f = (float)(l - l1) * f;
		//   19   34:lload_2         
		//   20   35:lload           4
		//   21   37:lsub            
		//   22   38:l2f             
		//   23   39:fload_1         
		//   24   40:fmul            
		//   25   41:fstore_1        
				mDeltaX = (int)(mTargetVelocityX * f);
		//   26   42:aload_0         
		//   27   43:aload_0         
		//   28   44:getfield        #70  <Field float mTargetVelocityX>
		//   29   47:fload_1         
		//   30   48:fmul            
		//   31   49:f2i             
		//   32   50:putfield        #37  <Field int mDeltaX>
				mDeltaY = (int)(f * mTargetVelocityY);
		//   33   53:aload_0         
		//   34   54:fload_1         
		//   35   55:aload_0         
		//   36   56:getfield        #72  <Field float mTargetVelocityY>
		//   37   59:fmul            
		//   38   60:f2i             
		//   39   61:putfield        #39  <Field int mDeltaY>
				return;
		//   40   64:return          
			} else
			{
				throw new RuntimeException("Cannot compute scroll delta before calling start()");
		//   41   65:new             #74  <Class RuntimeException>
		//   42   68:dup             
		//   43   69:ldc1            #76  <String "Cannot compute scroll delta before calling start()">
		//   44   71:invokespecial   #79  <Method void RuntimeException(String)>
		//   45   74:athrow          
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
			float f = mTargetVelocityX;
		//    0    0:aload_0         
		//    1    1:getfield        #70  <Field float mTargetVelocityX>
		//    2    4:fstore_1        
			return (int)(f / Math.abs(f));
		//    3    5:fload_1         
		//    4    6:fload_1         
		//    5    7:invokestatic    #88  <Method float Math.abs(float)>
		//    6   10:fdiv            
		//    7   11:f2i             
		//    8   12:ireturn         
		}

		public int getVerticalDirection()
		{
			float f = mTargetVelocityY;
		//    0    0:aload_0         
		//    1    1:getfield        #72  <Field float mTargetVelocityY>
		//    2    4:fstore_1        
			return (int)(f / Math.abs(f));
		//    3    5:fload_1         
		//    4    6:fload_1         
		//    5    7:invokestatic    #88  <Method float Math.abs(float)>
		//    6   10:fdiv            
		//    7   11:f2i             
		//    8   12:ireturn         
		}

		public boolean isFinished()
		{
			return mStopTime > 0L && AnimationUtils.currentAnimationTimeMillis() > mStopTime + (long)mEffectiveRampDown;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field long mStopTime>
		//    2    4:lconst_0        
		//    3    5:lcmp            
		//    4    6:ifle            28
		//    5    9:invokestatic    #64  <Method long AnimationUtils.currentAnimationTimeMillis()>
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
		//    0    0:invokestatic    #64  <Method long AnimationUtils.currentAnimationTimeMillis()>
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
		//   16   26:invokespecial   #66  <Method float getValueAt(long)>
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
		//    2    2:putfield        #52  <Field int mRampUpDuration>
		//    3    5:return          
		}

		public void setTargetVelocity(float f, float f1)
		{
			mTargetVelocityX = f;
		//    0    0:aload_0         
		//    1    1:fload_1         
		//    2    2:putfield        #70  <Field float mTargetVelocityX>
			mTargetVelocityY = f1;
		//    3    5:aload_0         
		//    4    6:fload_2         
		//    5    7:putfield        #72  <Field float mTargetVelocityY>
		//    6   10:return          
		}

		public void start()
		{
			mStartTime = AnimationUtils.currentAnimationTimeMillis();
		//    0    0:aload_0         
		//    1    1:invokestatic    #64  <Method long AnimationUtils.currentAnimationTimeMillis()>
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
		//   11   23:ldc1            #53  <Float 0.5F>
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
		//*   8   18:ifeq            38
			{
				AutoScrollHelper autoscrollhelper = AutoScrollHelper.this;
		//    9   21:aload_0         
		//   10   22:getfield        #15  <Field AutoScrollHelper this$0>
		//   11   25:astore_3        
				autoscrollhelper.mNeedsReset = false;
		//   12   26:aload_3         
		//   13   27:iconst_0        
		//   14   28:putfield        #27  <Field boolean AutoScrollHelper.mNeedsReset>
				autoscrollhelper.mScroller.start();
		//   15   31:aload_3         
		//   16   32:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
		//   17   35:invokevirtual   #36  <Method void AutoScrollHelper$ClampedScroller.start()>
			}
			ClampedScroller clampedscroller = mScroller;
		//   18   38:aload_0         
		//   19   39:getfield        #15  <Field AutoScrollHelper this$0>
		//   20   42:getfield        #31  <Field AutoScrollHelper$ClampedScroller AutoScrollHelper.mScroller>
		//   21   45:astore_3        
			if(!clampedscroller.isFinished() && shouldAnimate())
		//*  22   46:aload_3         
		//*  23   47:invokevirtual   #40  <Method boolean AutoScrollHelper$ClampedScroller.isFinished()>
		//*  24   50:ifne            128
		//*  25   53:aload_0         
		//*  26   54:getfield        #15  <Field AutoScrollHelper this$0>
		//*  27   57:invokevirtual   #43  <Method boolean AutoScrollHelper.shouldAnimate()>
		//*  28   60:ifne            66
		//*  29   63:goto            128
			{
				if(mNeedsCancel)
		//*  30   66:aload_0         
		//*  31   67:getfield        #15  <Field AutoScrollHelper this$0>
		//*  32   70:getfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
		//*  33   73:ifeq            93
				{
					AutoScrollHelper autoscrollhelper1 = AutoScrollHelper.this;
		//   34   76:aload_0         
		//   35   77:getfield        #15  <Field AutoScrollHelper this$0>
		//   36   80:astore          4
					autoscrollhelper1.mNeedsCancel = false;
		//   37   82:aload           4
		//   38   84:iconst_0        
		//   39   85:putfield        #46  <Field boolean AutoScrollHelper.mNeedsCancel>
					autoscrollhelper1.cancelTargetTouch();
		//   40   88:aload           4
		//   41   90:invokevirtual   #49  <Method void AutoScrollHelper.cancelTargetTouch()>
				}
				clampedscroller.computeScrollDelta();
		//   42   93:aload_3         
		//   43   94:invokevirtual   #52  <Method void AutoScrollHelper$ClampedScroller.computeScrollDelta()>
				int i = clampedscroller.getDeltaX();
		//   44   97:aload_3         
		//   45   98:invokevirtual   #56  <Method int AutoScrollHelper$ClampedScroller.getDeltaX()>
		//   46  101:istore_1        
				int j = clampedscroller.getDeltaY();
		//   47  102:aload_3         
		//   48  103:invokevirtual   #59  <Method int AutoScrollHelper$ClampedScroller.getDeltaY()>
		//   49  106:istore_2        
				scrollTargetBy(i, j);
		//   50  107:aload_0         
		//   51  108:getfield        #15  <Field AutoScrollHelper this$0>
		//   52  111:iload_1         
		//   53  112:iload_2         
		//   54  113:invokevirtual   #63  <Method void AutoScrollHelper.scrollTargetBy(int, int)>
				ViewCompat.postOnAnimation(mTarget, ((Runnable) (this)));
		//   55  116:aload_0         
		//   56  117:getfield        #15  <Field AutoScrollHelper this$0>
		//   57  120:getfield        #67  <Field View AutoScrollHelper.mTarget>
		//   58  123:aload_0         
		//   59  124:invokestatic    #73  <Method void ViewCompat.postOnAnimation(View, Runnable)>
				return;
		//   60  127:return          
			} else
			{
				mAnimating = false;
		//   61  128:aload_0         
		//   62  129:getfield        #15  <Field AutoScrollHelper this$0>
		//   63  132:iconst_0        
		//   64  133:putfield        #24  <Field boolean AutoScrollHelper.mAnimating>
				return;
		//   65  136:return          
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
	//    1    1:invokespecial   #53  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class AutoScrollHelper$ClampedScroller>
	//    4    8:dup             
	//    5    9:invokespecial   #54  <Method void AutoScrollHelper$ClampedScroller()>
	//    6   12:putfield        #56  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    7   15:aload_0         
	//    8   16:new             #58  <Class AccelerateInterpolator>
	//    9   19:dup             
	//   10   20:invokespecial   #59  <Method void AccelerateInterpolator()>
	//   11   23:putfield        #61  <Field Interpolator mEdgeInterpolator>
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
	//   23   38:putfield        #63  <Field float[] mRelativeEdges>
	//   24   41:aload_0         
	//   25   42:iconst_2        
	//   26   43:newarray        float[]
	//   27   45:dup             
	//   28   46:iconst_0        
	//   29   47:ldc1            #64  <Float 3.402823E+38F>
	//   30   49:fastore         
	//   31   50:dup             
	//   32   51:iconst_1        
	//   33   52:ldc1            #64  <Float 3.402823E+38F>
	//   34   54:fastore         
	//   35   55:putfield        #66  <Field float[] mMaximumEdges>
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
	//   47   70:putfield        #68  <Field float[] mRelativeVelocity>
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
	//   59   85:putfield        #70  <Field float[] mMinimumVelocity>
	//   60   88:aload_0         
	//   61   89:iconst_2        
	//   62   90:newarray        float[]
	//   63   92:dup             
	//   64   93:iconst_0        
	//   65   94:ldc1            #64  <Float 3.402823E+38F>
	//   66   96:fastore         
	//   67   97:dup             
	//   68   98:iconst_1        
	//   69   99:ldc1            #64  <Float 3.402823E+38F>
	//   70  101:fastore         
	//   71  102:putfield        #72  <Field float[] mMaximumVelocity>
		mTarget = view;
	//   72  105:aload_0         
	//   73  106:aload_1         
	//   74  107:putfield        #74  <Field View mTarget>
		view = ((View) (Resources.getSystem().getDisplayMetrics()));
	//   75  110:invokestatic    #80  <Method Resources Resources.getSystem()>
	//   76  113:invokevirtual   #84  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   77  116:astore_1        
		int i = (int)(((DisplayMetrics) (view)).density * 1575F + 0.5F);
	//   78  117:aload_1         
	//   79  118:getfield        #90  <Field float DisplayMetrics.density>
	//   80  121:ldc1            #91  <Float 1575F>
	//   81  123:fmul            
	//   82  124:ldc1            #92  <Float 0.5F>
	//   83  126:fadd            
	//   84  127:f2i             
	//   85  128:istore_3        
		int j = (int)(((DisplayMetrics) (view)).density * 315F + 0.5F);
	//   86  129:aload_1         
	//   87  130:getfield        #90  <Field float DisplayMetrics.density>
	//   88  133:ldc1            #93  <Float 315F>
	//   89  135:fmul            
	//   90  136:ldc1            #92  <Float 0.5F>
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
	//  100  148:invokevirtual   #97  <Method AutoScrollHelper setMaximumVelocity(float, float)>
	//  101  151:pop             
		f = j;
	//  102  152:iload           4
	//  103  154:i2f             
	//  104  155:fstore_2        
		setMinimumVelocity(f, f);
	//  105  156:aload_0         
	//  106  157:fload_2         
	//  107  158:fload_2         
	//  108  159:invokevirtual   #100 <Method AutoScrollHelper setMinimumVelocity(float, float)>
	//  109  162:pop             
		setEdgeType(1);
	//  110  163:aload_0         
	//  111  164:iconst_1        
	//  112  165:invokevirtual   #104 <Method AutoScrollHelper setEdgeType(int)>
	//  113  168:pop             
		setMaximumEdges(3.402823E+38F, 3.402823E+38F);
	//  114  169:aload_0         
	//  115  170:ldc1            #64  <Float 3.402823E+38F>
	//  116  172:ldc1            #64  <Float 3.402823E+38F>
	//  117  174:invokevirtual   #107 <Method AutoScrollHelper setMaximumEdges(float, float)>
	//  118  177:pop             
		setRelativeEdges(0.2F, 0.2F);
	//  119  178:aload_0         
	//  120  179:ldc1            #108 <Float 0.2F>
	//  121  181:ldc1            #108 <Float 0.2F>
	//  122  183:invokevirtual   #111 <Method AutoScrollHelper setRelativeEdges(float, float)>
	//  123  186:pop             
		setRelativeVelocity(1.0F, 1.0F);
	//  124  187:aload_0         
	//  125  188:fconst_1        
	//  126  189:fconst_1        
	//  127  190:invokevirtual   #114 <Method AutoScrollHelper setRelativeVelocity(float, float)>
	//  128  193:pop             
		setActivationDelay(DEFAULT_ACTIVATION_DELAY);
	//  129  194:aload_0         
	//  130  195:getstatic       #47  <Field int DEFAULT_ACTIVATION_DELAY>
	//  131  198:invokevirtual   #117 <Method AutoScrollHelper setActivationDelay(int)>
	//  132  201:pop             
		setRampUpDuration(500);
	//  133  202:aload_0         
	//  134  203:sipush          500
	//  135  206:invokevirtual   #120 <Method AutoScrollHelper setRampUpDuration(int)>
	//  136  209:pop             
		setRampDownDuration(500);
	//  137  210:aload_0         
	//  138  211:sipush          500
	//  139  214:invokevirtual   #123 <Method AutoScrollHelper setRampDownDuration(int)>
	//  140  217:pop             
	//  141  218:return          
	}

	private float computeTargetVelocity(int i, float f, float f1, float f2)
	{
		f = getEdgeValue(mRelativeEdges[i], f1, mMaximumEdges[i], f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field float[] mRelativeEdges>
	//    3    5:iload_1         
	//    4    6:faload          
	//    5    7:fload_3         
	//    6    8:aload_0         
	//    7    9:getfield        #66  <Field float[] mMaximumEdges>
	//    8   12:iload_1         
	//    9   13:faload          
	//   10   14:fload_2         
	//   11   15:invokespecial   #130 <Method float getEdgeValue(float, float, float, float)>
	//   12   18:fstore_2        
		int j = f != 0.0F;
	//   13   19:fload_2         
	//   14   20:fconst_0        
	//   15   21:fcmpl           
	//   16   22:istore          7
		if(j == 0)
	//*  17   24:iload           7
	//*  18   26:ifne            31
			return 0.0F;
	//   19   29:fconst_0        
	//   20   30:freturn         
		float f4 = mRelativeVelocity[i];
	//   21   31:aload_0         
	//   22   32:getfield        #68  <Field float[] mRelativeVelocity>
	//   23   35:iload_1         
	//   24   36:faload          
	//   25   37:fstore          6
		f1 = mMinimumVelocity[i];
	//   26   39:aload_0         
	//   27   40:getfield        #70  <Field float[] mMinimumVelocity>
	//   28   43:iload_1         
	//   29   44:faload          
	//   30   45:fstore_3        
		float f3 = mMaximumVelocity[i];
	//   31   46:aload_0         
	//   32   47:getfield        #72  <Field float[] mMaximumVelocity>
	//   33   50:iload_1         
	//   34   51:faload          
	//   35   52:fstore          5
		f2 = f4 * f2;
	//   36   54:fload           6
	//   37   56:fload           4
	//   38   58:fmul            
	//   39   59:fstore          4
		if(j > 0)
	//*  40   61:iload           7
	//*  41   63:ifle            77
			return constrain(f * f2, f1, f3);
	//   42   66:fload_2         
	//   43   67:fload           4
	//   44   69:fmul            
	//   45   70:fload_3         
	//   46   71:fload           5
	//   47   73:invokestatic    #134 <Method float constrain(float, float, float)>
	//   48   76:freturn         
		else
			return -constrain(-f * f2, f1, f3);
	//   49   77:fload_2         
	//   50   78:fneg            
	//   51   79:fload           4
	//   52   81:fmul            
	//   53   82:fload_3         
	//   54   83:fload           5
	//   55   85:invokestatic    #134 <Method float constrain(float, float, float)>
	//   56   88:fneg            
	//   57   89:freturn         
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
		int i = mEdgeType;
	//    6    8:aload_0         
	//    7    9:getfield        #139 <Field int mEdgeType>
	//    8   12:istore_3        
		switch(i)
	//*   9   13:iload_3         
		{
	//*  10   14:tableswitch     0 2: default 40
	//	               0 53
	//	               1 53
	//	               2 42
		default:
			return 0.0F;
	//   11   40:fconst_0        
	//   12   41:freturn         

		case 2: // '\002'
			if(f < 0.0F)
	//*  13   42:fload_1         
	//*  14   43:fconst_0        
	//*  15   44:fcmpg           
	//*  16   45:ifge            85
				return f / -f1;
	//   17   48:fload_1         
	//   18   49:fload_2         
	//   19   50:fneg            
	//   20   51:fdiv            
	//   21   52:freturn         
			break;

		case 0: // '\0'
		case 1: // '\001'
			if(f >= f1)
				break;
	//   22   53:fload_1         
	//   23   54:fload_2         
	//   24   55:fcmpg           
	//   25   56:ifge            85
			if(f >= 0.0F)
	//*  26   59:fload_1         
	//*  27   60:fconst_0        
	//*  28   61:fcmpl           
	//*  29   62:iflt            71
				return 1.0F - f / f1;
	//   30   65:fconst_1        
	//   31   66:fload_1         
	//   32   67:fload_2         
	//   33   68:fdiv            
	//   34   69:fsub            
	//   35   70:freturn         
			if(mAnimating && i == 1)
	//*  36   71:aload_0         
	//*  37   72:getfield        #141 <Field boolean mAnimating>
	//*  38   75:ifeq            85
	//*  39   78:iload_3         
	//*  40   79:iconst_1        
	//*  41   80:icmpne          85
				return 1.0F;
	//   42   83:fconst_1        
	//   43   84:freturn         
			break;
		}
		return 0.0F;
	//   44   85:fconst_0        
	//   45   86:freturn         
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
	//    5    5:invokestatic    #134 <Method float constrain(float, float, float)>
	//    6    8:fstore_1        
			f2 = constrainEdgeValue(f3, f);
	//    7    9:aload_0         
	//    8   10:fload           4
	//    9   12:fload_1         
	//   10   13:invokespecial   #143 <Method float constrainEdgeValue(float, float)>
	//   11   16:fstore_3        
			f = constrainEdgeValue(f1 - f3, f) - f2;
	//   12   17:aload_0         
	//   13   18:fload_2         
	//   14   19:fload           4
	//   15   21:fsub            
	//   16   22:fload_1         
	//   17   23:invokespecial   #143 <Method float constrainEdgeValue(float, float)>
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
	//   26   36:getfield        #61  <Field Interpolator mEdgeInterpolator>
	//   27   39:fload_1         
	//   28   40:fneg            
	//   29   41:invokeinterface #149 <Method float Interpolator.getInterpolation(float)>
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
	//   38   58:getfield        #61  <Field Interpolator mEdgeInterpolator>
	//   39   61:fload_1         
	//   40   62:invokeinterface #149 <Method float Interpolator.getInterpolation(float)>
	//   41   67:fstore_1        
			}
			return constrain(f, -1F, 1.0F);
	//   42   68:fload_1         
	//   43   69:ldc1            #150 <Float -1F>
	//   44   71:fconst_1        
	//   45   72:invokestatic    #134 <Method float constrain(float, float, float)>
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
	//*   1    1:getfield        #153 <Field boolean mNeedsReset>
	//*   2    4:ifeq            13
		{
			mAnimating = false;
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:putfield        #141 <Field boolean mAnimating>
			return;
	//    6   12:return          
		} else
		{
			mScroller.requestStop();
	//    7   13:aload_0         
	//    8   14:getfield        #56  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    9   17:invokevirtual   #155 <Method void AutoScrollHelper$ClampedScroller.requestStop()>
			return;
	//   10   20:return          
		}
	}

	private void startAnimating()
	{
label0:
		{
			if(mRunnable == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field Runnable mRunnable>
	//*   2    4:ifnonnull       19
				mRunnable = ((Runnable) (new ScrollAnimationRunnable()));
	//    3    7:aload_0         
	//    4    8:new             #11  <Class AutoScrollHelper$ScrollAnimationRunnable>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #161 <Method void AutoScrollHelper$ScrollAnimationRunnable(AutoScrollHelper)>
	//    8   16:putfield        #158 <Field Runnable mRunnable>
			mAnimating = true;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:putfield        #141 <Field boolean mAnimating>
			mNeedsReset = true;
	//   12   24:aload_0         
	//   13   25:iconst_1        
	//   14   26:putfield        #153 <Field boolean mNeedsReset>
			if(!mAlreadyDelayed)
	//*  15   29:aload_0         
	//*  16   30:getfield        #163 <Field boolean mAlreadyDelayed>
	//*  17   33:ifne            61
			{
				int i = mActivationDelay;
	//   18   36:aload_0         
	//   19   37:getfield        #165 <Field int mActivationDelay>
	//   20   40:istore_1        
				if(i > 0)
	//*  21   41:iload_1         
	//*  22   42:ifle            61
				{
					ViewCompat.postOnAnimationDelayed(mTarget, mRunnable, i);
	//   23   45:aload_0         
	//   24   46:getfield        #74  <Field View mTarget>
	//   25   49:aload_0         
	//   26   50:getfield        #158 <Field Runnable mRunnable>
	//   27   53:iload_1         
	//   28   54:i2l             
	//   29   55:invokestatic    #171 <Method void ViewCompat.postOnAnimationDelayed(View, Runnable, long)>
					break label0;
	//   30   58:goto            70
				}
			}
			mRunnable.run();
	//   31   61:aload_0         
	//   32   62:getfield        #158 <Field Runnable mRunnable>
	//   33   65:invokeinterface #176 <Method void Runnable.run()>
		}
		mAlreadyDelayed = true;
	//   34   70:aload_0         
	//   35   71:iconst_1        
	//   36   72:putfield        #163 <Field boolean mAlreadyDelayed>
	//   37   75:return          
	}

	public abstract boolean canTargetScrollHorizontally(int i);

	public abstract boolean canTargetScrollVertically(int i);

	void cancelTargetTouch()
	{
		long l = SystemClock.uptimeMillis();
	//    0    0:invokestatic    #186 <Method long SystemClock.uptimeMillis()>
	//    1    3:lstore_1        
		MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//    2    4:lload_1         
	//    3    5:lload_1         
	//    4    6:iconst_3        
	//    5    7:fconst_0        
	//    6    8:fconst_0        
	//    7    9:iconst_0        
	//    8   10:invokestatic    #192 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//    9   13:astore_3        
		mTarget.onTouchEvent(motionevent);
	//   10   14:aload_0         
	//   11   15:getfield        #74  <Field View mTarget>
	//   12   18:aload_3         
	//   13   19:invokevirtual   #198 <Method boolean View.onTouchEvent(MotionEvent)>
	//   14   22:pop             
		motionevent.recycle();
	//   15   23:aload_3         
	//   16   24:invokevirtual   #201 <Method void MotionEvent.recycle()>
	//   17   27:return          
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		boolean flag = mEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field boolean mEnabled>
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
	//*  10   17:invokevirtual   #208 <Method int MotionEvent.getActionMasked()>
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
	//   14   56:invokespecial   #209 <Method void requestStop()>
			break;
	//   15   59:goto            147

		case 0: // '\0'
			mNeedsCancel = true;
	//   16   62:aload_0         
	//   17   63:iconst_1        
	//   18   64:putfield        #211 <Field boolean mNeedsCancel>
			mAlreadyDelayed = false;
	//   19   67:aload_0         
	//   20   68:iconst_0        
	//   21   69:putfield        #163 <Field boolean mAlreadyDelayed>
			// fall through

		case 2: // '\002'
			float f = computeTargetVelocity(0, motionevent.getX(), view.getWidth(), mTarget.getWidth());
	//   22   72:aload_0         
	//   23   73:iconst_0        
	//   24   74:aload_2         
	//   25   75:invokevirtual   #215 <Method float MotionEvent.getX()>
	//   26   78:aload_1         
	//   27   79:invokevirtual   #218 <Method int View.getWidth()>
	//   28   82:i2f             
	//   29   83:aload_0         
	//   30   84:getfield        #74  <Field View mTarget>
	//   31   87:invokevirtual   #218 <Method int View.getWidth()>
	//   32   90:i2f             
	//   33   91:invokespecial   #220 <Method float computeTargetVelocity(int, float, float, float)>
	//   34   94:fstore_3        
			float f1 = computeTargetVelocity(1, motionevent.getY(), view.getHeight(), mTarget.getHeight());
	//   35   95:aload_0         
	//   36   96:iconst_1        
	//   37   97:aload_2         
	//   38   98:invokevirtual   #223 <Method float MotionEvent.getY()>
	//   39  101:aload_1         
	//   40  102:invokevirtual   #226 <Method int View.getHeight()>
	//   41  105:i2f             
	//   42  106:aload_0         
	//   43  107:getfield        #74  <Field View mTarget>
	//   44  110:invokevirtual   #226 <Method int View.getHeight()>
	//   45  113:i2f             
	//   46  114:invokespecial   #220 <Method float computeTargetVelocity(int, float, float, float)>
	//   47  117:fstore          4
			mScroller.setTargetVelocity(f, f1);
	//   48  119:aload_0         
	//   49  120:getfield        #56  <Field AutoScrollHelper$ClampedScroller mScroller>
	//   50  123:fload_3         
	//   51  124:fload           4
	//   52  126:invokevirtual   #230 <Method void AutoScrollHelper$ClampedScroller.setTargetVelocity(float, float)>
			if(!mAnimating && shouldAnimate())
	//*  53  129:aload_0         
	//*  54  130:getfield        #141 <Field boolean mAnimating>
	//*  55  133:ifne            147
	//*  56  136:aload_0         
	//*  57  137:invokevirtual   #234 <Method boolean shouldAnimate()>
	//*  58  140:ifeq            147
				startAnimating();
	//   59  143:aload_0         
	//   60  144:invokespecial   #236 <Method void startAnimating()>
			break;
		}
		flag = flag1;
	//   61  147:iload           6
	//   62  149:istore          5
		if(mExclusive)
	//*  63  151:aload_0         
	//*  64  152:getfield        #238 <Field boolean mExclusive>
	//*  65  155:ifeq            172
		{
			flag = flag1;
	//   66  158:iload           6
	//   67  160:istore          5
			if(mAnimating)
	//*  68  162:aload_0         
	//*  69  163:getfield        #141 <Field boolean mAnimating>
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
	//    2    2:putfield        #165 <Field int mActivationDelay>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AutoScrollHelper setEdgeType(int i)
	{
		mEdgeType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #139 <Field int mEdgeType>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public AutoScrollHelper setEnabled(boolean flag)
	{
		if(mEnabled && !flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #205 <Field boolean mEnabled>
	//*   2    4:ifeq            15
	//*   3    7:iload_1         
	//*   4    8:ifne            15
			requestStop();
	//    5   11:aload_0         
	//    6   12:invokespecial   #209 <Method void requestStop()>
		mEnabled = flag;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #205 <Field boolean mEnabled>
		return this;
	//   10   20:aload_0         
	//   11   21:areturn         
	}

	public AutoScrollHelper setMaximumEdges(float f, float f1)
	{
		float af[] = mMaximumEdges;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field float[] mMaximumEdges>
	//    2    4:astore_3        
		af[0] = f;
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:fload_1         
	//    6    8:fastore         
		af[1] = f1;
	//    7    9:aload_3         
	//    8   10:iconst_1        
	//    9   11:fload_2         
	//   10   12:fastore         
		return this;
	//   11   13:aload_0         
	//   12   14:areturn         
	}

	public AutoScrollHelper setMaximumVelocity(float f, float f1)
	{
		float af[] = mMaximumVelocity;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field float[] mMaximumVelocity>
	//    2    4:astore_3        
		af[0] = f / 1000F;
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:fload_1         
	//    6    8:ldc1            #244 <Float 1000F>
	//    7   10:fdiv            
	//    8   11:fastore         
		af[1] = f1 / 1000F;
	//    9   12:aload_3         
	//   10   13:iconst_1        
	//   11   14:fload_2         
	//   12   15:ldc1            #244 <Float 1000F>
	//   13   17:fdiv            
	//   14   18:fastore         
		return this;
	//   15   19:aload_0         
	//   16   20:areturn         
	}

	public AutoScrollHelper setMinimumVelocity(float f, float f1)
	{
		float af[] = mMinimumVelocity;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field float[] mMinimumVelocity>
	//    2    4:astore_3        
		af[0] = f / 1000F;
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:fload_1         
	//    6    8:ldc1            #244 <Float 1000F>
	//    7   10:fdiv            
	//    8   11:fastore         
		af[1] = f1 / 1000F;
	//    9   12:aload_3         
	//   10   13:iconst_1        
	//   11   14:fload_2         
	//   12   15:ldc1            #244 <Float 1000F>
	//   13   17:fdiv            
	//   14   18:fastore         
		return this;
	//   15   19:aload_0         
	//   16   20:areturn         
	}

	public AutoScrollHelper setRampDownDuration(int i)
	{
		mScroller.setRampDownDuration(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #247 <Method void AutoScrollHelper$ClampedScroller.setRampDownDuration(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AutoScrollHelper setRampUpDuration(int i)
	{
		mScroller.setRampUpDuration(i);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #249 <Method void AutoScrollHelper$ClampedScroller.setRampUpDuration(int)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public AutoScrollHelper setRelativeEdges(float f, float f1)
	{
		float af[] = mRelativeEdges;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field float[] mRelativeEdges>
	//    2    4:astore_3        
		af[0] = f;
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:fload_1         
	//    6    8:fastore         
		af[1] = f1;
	//    7    9:aload_3         
	//    8   10:iconst_1        
	//    9   11:fload_2         
	//   10   12:fastore         
		return this;
	//   11   13:aload_0         
	//   12   14:areturn         
	}

	public AutoScrollHelper setRelativeVelocity(float f, float f1)
	{
		float af[] = mRelativeVelocity;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field float[] mRelativeVelocity>
	//    2    4:astore_3        
		af[0] = f / 1000F;
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:fload_1         
	//    6    8:ldc1            #244 <Float 1000F>
	//    7   10:fdiv            
	//    8   11:fastore         
		af[1] = f1 / 1000F;
	//    9   12:aload_3         
	//   10   13:iconst_1        
	//   11   14:fload_2         
	//   12   15:ldc1            #244 <Float 1000F>
	//   13   17:fdiv            
	//   14   18:fastore         
		return this;
	//   15   19:aload_0         
	//   16   20:areturn         
	}

	boolean shouldAnimate()
	{
		ClampedScroller clampedscroller = mScroller;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field AutoScrollHelper$ClampedScroller mScroller>
	//    2    4:astore_3        
		int i = clampedscroller.getVerticalDirection();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #252 <Method int AutoScrollHelper$ClampedScroller.getVerticalDirection()>
	//    5    9:istore_1        
		int j = clampedscroller.getHorizontalDirection();
	//    6   10:aload_3         
	//    7   11:invokevirtual   #255 <Method int AutoScrollHelper$ClampedScroller.getHorizontalDirection()>
	//    8   14:istore_2        
		return i != 0 && canTargetScrollVertically(i) || j != 0 && canTargetScrollHorizontally(j);
	//    9   15:iload_1         
	//   10   16:ifeq            27
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #257 <Method boolean canTargetScrollVertically(int)>
	//   14   24:ifne            39
	//   15   27:iload_2         
	//   16   28:ifeq            41
	//   17   31:aload_0         
	//   18   32:iload_2         
	//   19   33:invokevirtual   #259 <Method boolean canTargetScrollHorizontally(int)>
	//   20   36:ifeq            41
	//   21   39:iconst_1        
	//   22   40:ireturn         
	//   23   41:iconst_0        
	//   24   42:ireturn         
	}

	private static final int DEFAULT_ACTIVATION_DELAY = ViewConfiguration.getTapTimeout();
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
	//    0    0:invokestatic    #45  <Method int ViewConfiguration.getTapTimeout()>
	//    1    3:putstatic       #47  <Field int DEFAULT_ACTIVATION_DELAY>
	//*   2    6:return          
	}
}
