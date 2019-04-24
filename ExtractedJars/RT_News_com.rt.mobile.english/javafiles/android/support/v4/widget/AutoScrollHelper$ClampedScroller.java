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
