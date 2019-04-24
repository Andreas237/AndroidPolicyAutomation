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
		if(mStopTime < 0L || l < mStopTime)
	//*   7   11:aload_0         
	//*   8   12:getfield        #33  <Field long mStopTime>
	//*   9   15:lconst_0        
	//*  10   16:lcmp            
	//*  11   17:iflt            29
	//*  12   20:lload_1         
	//*  13   21:aload_0         
	//*  14   22:getfield        #33  <Field long mStopTime>
	//*  15   25:lcmp            
	//*  16   26:ifge            51
		{
			return AutoScrollHelper.constrain((float)(l - mStartTime) / (float)mRampUpDuration, 0.0F, 1.0F) * 0.5F;
	//   17   29:lload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #29  <Field long mStartTime>
	//   20   34:lsub            
	//   21   35:l2f             
	//   22   36:aload_0         
	//   23   37:getfield        #44  <Field int mRampUpDuration>
	//   24   40:i2f             
	//   25   41:fdiv            
	//   26   42:fconst_0        
	//   27   43:fconst_1        
	//   28   44:invokestatic    #48  <Method float AutoScrollHelper.constrain(float, float, float)>
	//   29   47:ldc1            #49  <Float 0.5F>
	//   30   49:fmul            
	//   31   50:freturn         
		} else
		{
			long l1 = mStopTime;
	//   32   51:aload_0         
	//   33   52:getfield        #33  <Field long mStopTime>
	//   34   55:lstore          5
			float f = mStopValue;
	//   35   57:aload_0         
	//   36   58:getfield        #51  <Field float mStopValue>
	//   37   61:fstore_3        
			float f1 = mStopValue;
	//   38   62:aload_0         
	//   39   63:getfield        #51  <Field float mStopValue>
	//   40   66:fstore          4
			return AutoScrollHelper.constrain((float)(l - l1) / (float)mEffectiveRampDown, 0.0F, 1.0F) * f1 + (1.0F - f);
	//   41   68:lload_1         
	//   42   69:lload           5
	//   43   71:lsub            
	//   44   72:l2f             
	//   45   73:aload_0         
	//   46   74:getfield        #53  <Field int mEffectiveRampDown>
	//   47   77:i2f             
	//   48   78:fdiv            
	//   49   79:fconst_0        
	//   50   80:fconst_1        
	//   51   81:invokestatic    #48  <Method float AutoScrollHelper.constrain(float, float, float)>
	//   52   84:fload           4
	//   53   86:fmul            
	//   54   87:fconst_1        
	//   55   88:fload_3         
	//   56   89:fsub            
	//   57   90:fadd            
	//   58   91:freturn         
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
			long l1 = l - mDeltaTime;
	//   18   33:lload_2         
	//   19   34:aload_0         
	//   20   35:getfield        #35  <Field long mDeltaTime>
	//   21   38:lsub            
	//   22   39:lstore          4
			mDeltaTime = l;
	//   23   41:aload_0         
	//   24   42:lload_2         
	//   25   43:putfield        #35  <Field long mDeltaTime>
			mDeltaX = (int)((float)l1 * f * mTargetVelocityX);
	//   26   46:aload_0         
	//   27   47:lload           4
	//   28   49:l2f             
	//   29   50:fload_1         
	//   30   51:fmul            
	//   31   52:aload_0         
	//   32   53:getfield        #77  <Field float mTargetVelocityX>
	//   33   56:fmul            
	//   34   57:f2i             
	//   35   58:putfield        #37  <Field int mDeltaX>
			mDeltaY = (int)((float)l1 * f * mTargetVelocityY);
	//   36   61:aload_0         
	//   37   62:lload           4
	//   38   64:l2f             
	//   39   65:fload_1         
	//   40   66:fmul            
	//   41   67:aload_0         
	//   42   68:getfield        #79  <Field float mTargetVelocityY>
	//   43   71:fmul            
	//   44   72:f2i             
	//   45   73:putfield        #39  <Field int mDeltaY>
			return;
	//   46   76:return          
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
	//    9   17:getfield        #53  <Field int mEffectiveRampDown>
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
	//   12   20:putfield        #53  <Field int mEffectiveRampDown>
		mStopValue = getValueAt(l);
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:lload_1         
	//   16   26:invokespecial   #73  <Method float getValueAt(long)>
	//   17   29:putfield        #51  <Field float mStopValue>
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
	//    2    2:putfield        #44  <Field int mRampUpDuration>
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
	//   11   23:ldc1            #49  <Float 0.5F>
	//   12   25:putfield        #51  <Field float mStopValue>
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
