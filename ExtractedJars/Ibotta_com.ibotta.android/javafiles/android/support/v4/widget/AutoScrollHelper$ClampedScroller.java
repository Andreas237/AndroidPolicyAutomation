// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.AnimationUtils;

// Referenced classes of package android.support.v4.widget:
//			AutoScrollHelper

private static class AutoScrollHelper$ClampedScroller
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

	AutoScrollHelper$ClampedScroller()
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
