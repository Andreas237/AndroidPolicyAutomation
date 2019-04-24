// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.animation;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Handler;
import android.view.animation.*;

// Referenced classes of package com.autonavi.amap.mapcore.animation:
//			GLTransformation

public class GLAnimation
	implements Cloneable
{

	public GLAnimation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void Object()>
		mEnded = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #69  <Field boolean mEnded>
		mStarted = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #71  <Field boolean mStarted>
		mCycleFlip = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #73  <Field boolean mCycleFlip>
		mInitialized = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #75  <Field boolean mInitialized>
		mFillBefore = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #77  <Field boolean mFillBefore>
		mFillAfter = false;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #79  <Field boolean mFillAfter>
		mFillEnabled = false;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #81  <Field boolean mFillEnabled>
		mStartTime = -1L;
	//   23   39:aload_0         
	//   24   40:ldc2w           #82  <Long -1L>
	//   25   43:putfield        #85  <Field long mStartTime>
		mDuration = 500L;
	//   26   46:aload_0         
	//   27   47:ldc2w           #86  <Long 500L>
	//   28   50:putfield        #89  <Field long mDuration>
		mRepeatCount = 0;
	//   29   53:aload_0         
	//   30   54:iconst_0        
	//   31   55:putfield        #91  <Field int mRepeatCount>
		mRepeated = 0;
	//   32   58:aload_0         
	//   33   59:iconst_0        
	//   34   60:putfield        #93  <Field int mRepeated>
		mRepeatMode = 1;
	//   35   63:aload_0         
	//   36   64:iconst_1        
	//   37   65:putfield        #95  <Field int mRepeatMode>
		mScaleFactor = 1.0F;
	//   38   68:aload_0         
	//   39   69:fconst_1        
	//   40   70:putfield        #97  <Field float mScaleFactor>
		mDetachWallpaper = false;
	//   41   73:aload_0         
	//   42   74:iconst_0        
	//   43   75:putfield        #99  <Field boolean mDetachWallpaper>
		mMore = true;
	//   44   78:aload_0         
	//   45   79:iconst_1        
	//   46   80:putfield        #101 <Field boolean mMore>
		mOneMoreTime = true;
	//   47   83:aload_0         
	//   48   84:iconst_1        
	//   49   85:putfield        #103 <Field boolean mOneMoreTime>
		mPreviousRegion = new RectF();
	//   50   88:aload_0         
	//   51   89:new             #105 <Class RectF>
	//   52   92:dup             
	//   53   93:invokespecial   #106 <Method void RectF()>
	//   54   96:putfield        #108 <Field RectF mPreviousRegion>
		mRegion = new RectF();
	//   55   99:aload_0         
	//   56  100:new             #105 <Class RectF>
	//   57  103:dup             
	//   58  104:invokespecial   #106 <Method void RectF()>
	//   59  107:putfield        #110 <Field RectF mRegion>
		mPreviousTransformation = new GLTransformation();
	//   60  110:aload_0         
	//   61  111:new             #112 <Class GLTransformation>
	//   62  114:dup             
	//   63  115:invokespecial   #113 <Method void GLTransformation()>
	//   64  118:putfield        #115 <Field GLTransformation mPreviousTransformation>
		try
		{
			ensureInterpolator();
	//   65  121:aload_0         
	//   66  122:invokevirtual   #118 <Method void ensureInterpolator()>
			return;
	//   67  125:return          
		}
		catch(Throwable throwable)
	//*  68  126:astore_1        
		{
			throwable.printStackTrace();
	//   69  127:aload_1         
	//   70  128:invokevirtual   #121 <Method void Throwable.printStackTrace()>
		}
	//   71  131:return          
	}

	private void fireAnimationEnd()
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//*   2    4:ifnull          36
		{
			if(mListenerHandler == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #127 <Field Handler mListenerHandler>
	//*   5   11:ifnonnull       24
			{
				mListener.onAnimationEnd();
	//    6   14:aload_0         
	//    7   15:getfield        #125 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//    8   18:invokeinterface #132 <Method void com.amap.api.maps.model.animation.Animation$AnimationListener.onAnimationEnd()>
				return;
	//    9   23:return          
			}
			mListenerHandler.postAtFrontOfQueue(mOnEnd);
	//   10   24:aload_0         
	//   11   25:getfield        #127 <Field Handler mListenerHandler>
	//   12   28:aload_0         
	//   13   29:getfield        #134 <Field Runnable mOnEnd>
	//   14   32:invokevirtual   #140 <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   15   35:pop             
		}
	//   16   36:return          
	}

	private void fireAnimationRepeat()
	{
	//    0    0:return          
	}

	private void fireAnimationStart()
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//*   2    4:ifnull          36
		{
			if(mListenerHandler == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #127 <Field Handler mListenerHandler>
	//*   5   11:ifnonnull       24
			{
				mListener.onAnimationStart();
	//    6   14:aload_0         
	//    7   15:getfield        #125 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//    8   18:invokeinterface #145 <Method void com.amap.api.maps.model.animation.Animation$AnimationListener.onAnimationStart()>
				return;
	//    9   23:return          
			}
			mListenerHandler.postAtFrontOfQueue(mOnStart);
	//   10   24:aload_0         
	//   11   25:getfield        #127 <Field Handler mListenerHandler>
	//   12   28:aload_0         
	//   13   29:getfield        #147 <Field Runnable mOnStart>
	//   14   32:invokevirtual   #140 <Method boolean Handler.postAtFrontOfQueue(Runnable)>
	//   15   35:pop             
		}
	//   16   36:return          
	}

	protected void applyTransformation(float f, GLTransformation gltransformation)
	{
	//    0    0:return          
	}

	public void cancel()
	{
		if(mStarted && !mEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mStarted>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field boolean mEnded>
	//*   5   11:ifne            23
		{
			fireAnimationEnd();
	//    6   14:aload_0         
	//    7   15:invokespecial   #152 <Method void fireAnimationEnd()>
			mEnded = true;
	//    8   18:aload_0         
	//    9   19:iconst_1        
	//   10   20:putfield        #69  <Field boolean mEnded>
		}
		mStartTime = 0x0L;
	//   11   23:aload_0         
	//   12   24:ldc2w           #153 <Long 0x0L>
	//   13   27:putfield        #85  <Field long mStartTime>
		mOneMoreTime = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #103 <Field boolean mOneMoreTime>
		mMore = false;
	//   17   35:aload_0         
	//   18   36:iconst_0        
	//   19   37:putfield        #101 <Field boolean mMore>
	//   20   40:return          
	}

	public GLAnimation clone()
		throws CloneNotSupportedException
	{
		GLAnimation glanimation = (GLAnimation)super.clone();
	//    0    0:aload_0         
	//    1    1:invokespecial   #161 <Method Object Object.clone()>
	//    2    4:checkcast       #2   <Class GLAnimation>
	//    3    7:astore_1        
		glanimation.mPreviousRegion = new RectF();
	//    4    8:aload_1         
	//    5    9:new             #105 <Class RectF>
	//    6   12:dup             
	//    7   13:invokespecial   #106 <Method void RectF()>
	//    8   16:putfield        #108 <Field RectF mPreviousRegion>
		glanimation.mRegion = new RectF();
	//    9   19:aload_1         
	//   10   20:new             #105 <Class RectF>
	//   11   23:dup             
	//   12   24:invokespecial   #106 <Method void RectF()>
	//   13   27:putfield        #110 <Field RectF mRegion>
		glanimation.mPreviousTransformation = new GLTransformation();
	//   14   30:aload_1         
	//   15   31:new             #112 <Class GLTransformation>
	//   16   34:dup             
	//   17   35:invokespecial   #113 <Method void GLTransformation()>
	//   18   38:putfield        #115 <Field GLTransformation mPreviousTransformation>
		return glanimation;
	//   19   41:aload_1         
	//   20   42:areturn         
	}

	public volatile Object clone()
		throws CloneNotSupportedException
	{
		return ((Object) (clone()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #164 <Method GLAnimation clone()>
	//    2    4:areturn         
	}

	public long computeDurationHint()
	{
		return (getStartOffset() + getDuration()) * (long)(getRepeatCount() + 1);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method long getStartOffset()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #172 <Method long getDuration()>
	//    4    8:ladd            
	//    5    9:aload_0         
	//    6   10:invokevirtual   #176 <Method int getRepeatCount()>
	//    7   13:iconst_1        
	//    8   14:iadd            
	//    9   15:i2l             
	//   10   16:lmul            
	//   11   17:lreturn         
	}

	public void detach()
	{
		if(mStarted && !mEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field boolean mStarted>
	//*   2    4:ifeq            23
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field boolean mEnded>
	//*   5   11:ifne            23
		{
			mEnded = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #69  <Field boolean mEnded>
			fireAnimationEnd();
	//    9   19:aload_0         
	//   10   20:invokespecial   #152 <Method void fireAnimationEnd()>
		}
	//   11   23:return          
	}

	protected void ensureInterpolator()
	{
		if(mInterpolator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field Interpolator mInterpolator>
	//*   2    4:ifnonnull       18
			mInterpolator = ((Interpolator) (new AccelerateDecelerateInterpolator()));
	//    3    7:aload_0         
	//    4    8:new             #181 <Class AccelerateDecelerateInterpolator>
	//    5   11:dup             
	//    6   12:invokespecial   #182 <Method void AccelerateDecelerateInterpolator()>
	//    7   15:putfield        #179 <Field Interpolator mInterpolator>
	//    8   18:return          
	}

	public int getBackgroundColor()
	{
		return mBackgroundColor;
	//    0    0:aload_0         
	//    1    1:getfield        #185 <Field int mBackgroundColor>
	//    2    4:ireturn         
	}

	public boolean getDetachWallpaper()
	{
		return mDetachWallpaper;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field boolean mDetachWallpaper>
	//    2    4:ireturn         
	}

	public long getDuration()
	{
		return mDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field long mDuration>
	//    2    4:lreturn         
	}

	public boolean getFillAfter()
	{
		return mFillAfter;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field boolean mFillAfter>
	//    2    4:ireturn         
	}

	public boolean getFillBefore()
	{
		return mFillBefore;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean mFillBefore>
	//    2    4:ireturn         
	}

	public Interpolator getInterpolator()
	{
		return mInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field Interpolator mInterpolator>
	//    2    4:areturn         
	}

	public void getInvalidateRegion(int i, int j, int k, int l, RectF rectf, Transformation transformation)
	{
		RectF rectf1 = mRegion;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field RectF mRegion>
	//    2    4:astore          7
		RectF rectf2 = mPreviousRegion;
	//    3    6:aload_0         
	//    4    7:getfield        #108 <Field RectF mPreviousRegion>
	//    5   10:astore          8
		rectf.set(i, j, k, l);
	//    6   12:aload           5
	//    7   14:iload_1         
	//    8   15:i2f             
	//    9   16:iload_2         
	//   10   17:i2f             
	//   11   18:iload_3         
	//   12   19:i2f             
	//   13   20:iload           4
	//   14   22:i2f             
	//   15   23:invokevirtual   #197 <Method void RectF.set(float, float, float, float)>
		transformation.getMatrix().mapRect(rectf);
	//   16   26:aload           6
	//   17   28:invokevirtual   #203 <Method Matrix Transformation.getMatrix()>
	//   18   31:aload           5
	//   19   33:invokevirtual   #209 <Method boolean Matrix.mapRect(RectF)>
	//   20   36:pop             
		rectf.inset(-1F, -1F);
	//   21   37:aload           5
	//   22   39:ldc1            #210 <Float -1F>
	//   23   41:ldc1            #210 <Float -1F>
	//   24   43:invokevirtual   #214 <Method void RectF.inset(float, float)>
		rectf1.set(rectf);
	//   25   46:aload           7
	//   26   48:aload           5
	//   27   50:invokevirtual   #217 <Method void RectF.set(RectF)>
		rectf.union(rectf2);
	//   28   53:aload           5
	//   29   55:aload           8
	//   30   57:invokevirtual   #220 <Method void RectF.union(RectF)>
		rectf2.set(rectf1);
	//   31   60:aload           8
	//   32   62:aload           7
	//   33   64:invokevirtual   #217 <Method void RectF.set(RectF)>
	//   34   67:return          
	}

	public int getRepeatCount()
	{
		return mRepeatCount;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int mRepeatCount>
	//    2    4:ireturn         
	}

	public int getRepeatMode()
	{
		return mRepeatMode;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field int mRepeatMode>
	//    2    4:ireturn         
	}

	protected float getScaleFactor()
	{
		return mScaleFactor;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field float mScaleFactor>
	//    2    4:freturn         
	}

	public long getStartOffset()
	{
		return mStartOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field long mStartOffset>
	//    2    4:lreturn         
	}

	public long getStartTime()
	{
		return mStartTime;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field long mStartTime>
	//    2    4:lreturn         
	}

	public boolean getTransformation(long l, GLTransformation gltransformation)
	{
		if(mStartTime == -1L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field long mStartTime>
	//*   2    4:ldc2w           #82  <Long -1L>
	//*   3    7:lcmp            
	//*   4    8:ifne            16
			mStartTime = l;
	//    5   11:aload_0         
	//    6   12:lload_1         
	//    7   13:putfield        #85  <Field long mStartTime>
		long l1 = getStartOffset();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #169 <Method long getStartOffset()>
	//   10   20:lstore          8
		long l2 = mDuration;
	//   11   22:aload_0         
	//   12   23:getfield        #89  <Field long mDuration>
	//   13   26:lstore          10
		float f;
		if(l2 != 0L)
	//*  14   28:lload           10
	//*  15   30:lconst_0        
	//*  16   31:lcmp            
	//*  17   32:ifeq            54
			f = (float)(l - (mStartTime + l1)) / (float)l2;
	//   18   35:lload_1         
	//   19   36:aload_0         
	//   20   37:getfield        #85  <Field long mStartTime>
	//   21   40:lload           8
	//   22   42:ladd            
	//   23   43:lsub            
	//   24   44:l2f             
	//   25   45:lload           10
	//   26   47:l2f             
	//   27   48:fdiv            
	//   28   49:fstore          4
		else
	//*  29   51:goto            72
		if(l < mStartTime)
	//*  30   54:lload_1         
	//*  31   55:aload_0         
	//*  32   56:getfield        #85  <Field long mStartTime>
	//*  33   59:lcmp            
	//*  34   60:ifge            69
			f = 0.0F;
	//   35   63:fconst_0        
	//   36   64:fstore          4
		else
	//*  37   66:goto            72
			f = 1.0F;
	//   38   69:fconst_1        
	//   39   70:fstore          4
		boolean flag;
		if(f >= 1.0F)
	//*  40   72:fload           4
	//*  41   74:fconst_1        
	//*  42   75:fcmpl           
	//*  43   76:iflt            85
			flag = true;
	//   44   79:iconst_1        
	//   45   80:istore          6
		else
	//*  46   82:goto            88
			flag = false;
	//   47   85:iconst_0        
	//   48   86:istore          6
		boolean flag2;
		if(!flag)
	//*  49   88:iload           6
	//*  50   90:ifne            99
			flag2 = true;
	//   51   93:iconst_1        
	//   52   94:istore          12
		else
	//*  53   96:goto            102
			flag2 = false;
	//   54   99:iconst_0        
	//   55  100:istore          12
		mMore = flag2;
	//   56  102:aload_0         
	//   57  103:iload           12
	//   58  105:putfield        #101 <Field boolean mMore>
		float f2 = f;
	//   59  108:fload           4
	//   60  110:fstore          5
		if(!mFillEnabled)
	//*  61  112:aload_0         
	//*  62  113:getfield        #81  <Field boolean mFillEnabled>
	//*  63  116:ifne            131
			f2 = Math.max(Math.min(f, 1.0F), 0.0F);
	//   64  119:fload           4
	//   65  121:fconst_1        
	//   66  122:invokestatic    #234 <Method float Math.min(float, float)>
	//   67  125:fconst_0        
	//   68  126:invokestatic    #237 <Method float Math.max(float, float)>
	//   69  129:fstore          5
		boolean flag1;
		if((f2 >= 0.0F || mFillBefore) && (f2 <= 1.0F || mFillAfter))
	//*  70  131:fload           5
	//*  71  133:fconst_0        
	//*  72  134:fcmpl           
	//*  73  135:ifge            145
	//*  74  138:aload_0         
	//*  75  139:getfield        #77  <Field boolean mFillBefore>
	//*  76  142:ifeq            165
	//*  77  145:fload           5
	//*  78  147:fconst_1        
	//*  79  148:fcmpg           
	//*  80  149:ifle            159
	//*  81  152:aload_0         
	//*  82  153:getfield        #79  <Field boolean mFillAfter>
	//*  83  156:ifeq            165
			flag1 = true;
	//   84  159:iconst_1        
	//   85  160:istore          7
		else
	//*  86  162:goto            168
			flag1 = false;
	//   87  165:iconst_0        
	//   88  166:istore          7
		if(flag1)
	//*  89  168:iload           7
	//*  90  170:ifeq            255
		{
			if(!mStarted)
	//*  91  173:aload_0         
	//*  92  174:getfield        #71  <Field boolean mStarted>
	//*  93  177:ifne            199
			{
				try
				{
					fireAnimationStart();
	//   94  180:aload_0         
	//   95  181:invokespecial   #239 <Method void fireAnimationStart()>
				}
	//*  96  184:goto            194
				catch(Throwable throwable)
	//*  97  187:astore          13
				{
					throwable.printStackTrace();
	//   98  189:aload           13
	//   99  191:invokevirtual   #121 <Method void Throwable.printStackTrace()>
				}
				mStarted = true;
	//  100  194:aload_0         
	//  101  195:iconst_1        
	//  102  196:putfield        #71  <Field boolean mStarted>
			}
			float f1 = f2;
	//  103  199:fload           5
	//  104  201:fstore          4
			if(mFillEnabled)
	//* 105  203:aload_0         
	//* 106  204:getfield        #81  <Field boolean mFillEnabled>
	//* 107  207:ifeq            222
				f1 = Math.max(Math.min(f2, 1.0F), 0.0F);
	//  108  210:fload           5
	//  109  212:fconst_1        
	//  110  213:invokestatic    #234 <Method float Math.min(float, float)>
	//  111  216:fconst_0        
	//  112  217:invokestatic    #237 <Method float Math.max(float, float)>
	//  113  220:fstore          4
			f2 = f1;
	//  114  222:fload           4
	//  115  224:fstore          5
			if(mCycleFlip)
	//* 116  226:aload_0         
	//* 117  227:getfield        #73  <Field boolean mCycleFlip>
	//* 118  230:ifeq            239
				f2 = 1.0F - f1;
	//  119  233:fconst_1        
	//  120  234:fload           4
	//  121  236:fsub            
	//  122  237:fstore          5
			applyTransformation(mInterpolator.getInterpolation(f2), gltransformation);
	//  123  239:aload_0         
	//  124  240:aload_0         
	//  125  241:getfield        #179 <Field Interpolator mInterpolator>
	//  126  244:fload           5
	//  127  246:invokeinterface #245 <Method float Interpolator.getInterpolation(float)>
	//  128  251:aload_3         
	//  129  252:invokevirtual   #247 <Method void applyTransformation(float, GLTransformation)>
		}
		if(flag)
	//* 130  255:iload           6
	//* 131  257:ifeq            353
			if(mRepeatCount == mRepeated)
	//* 132  260:aload_0         
	//* 133  261:getfield        #91  <Field int mRepeatCount>
	//* 134  264:aload_0         
	//* 135  265:getfield        #93  <Field int mRepeated>
	//* 136  268:icmpne          290
			{
				if(!mEnded)
	//* 137  271:aload_0         
	//* 138  272:getfield        #69  <Field boolean mEnded>
	//* 139  275:ifne            353
				{
					mEnded = true;
	//  140  278:aload_0         
	//  141  279:iconst_1        
	//  142  280:putfield        #69  <Field boolean mEnded>
					fireAnimationEnd();
	//  143  283:aload_0         
	//  144  284:invokespecial   #152 <Method void fireAnimationEnd()>
				}
			} else
	//* 145  287:goto            353
			{
				if(mRepeatCount > 0)
	//* 146  290:aload_0         
	//* 147  291:getfield        #91  <Field int mRepeatCount>
	//* 148  294:ifle            307
					mRepeated = mRepeated + 1;
	//  149  297:aload_0         
	//  150  298:aload_0         
	//  151  299:getfield        #93  <Field int mRepeated>
	//  152  302:iconst_1        
	//  153  303:iadd            
	//  154  304:putfield        #93  <Field int mRepeated>
				if(mRepeatMode == 2)
	//* 155  307:aload_0         
	//* 156  308:getfield        #95  <Field int mRepeatMode>
	//* 157  311:iconst_2        
	//* 158  312:icmpne          337
				{
					boolean flag3;
					if(!mCycleFlip)
	//* 159  315:aload_0         
	//* 160  316:getfield        #73  <Field boolean mCycleFlip>
	//* 161  319:ifne            328
						flag3 = true;
	//  162  322:iconst_1        
	//  163  323:istore          12
					else
	//* 164  325:goto            331
						flag3 = false;
	//  165  328:iconst_0        
	//  166  329:istore          12
					mCycleFlip = flag3;
	//  167  331:aload_0         
	//  168  332:iload           12
	//  169  334:putfield        #73  <Field boolean mCycleFlip>
				}
				mStartTime = -1L;
	//  170  337:aload_0         
	//  171  338:ldc2w           #82  <Long -1L>
	//  172  341:putfield        #85  <Field long mStartTime>
				mMore = true;
	//  173  344:aload_0         
	//  174  345:iconst_1        
	//  175  346:putfield        #101 <Field boolean mMore>
				fireAnimationRepeat();
	//  176  349:aload_0         
	//  177  350:invokespecial   #249 <Method void fireAnimationRepeat()>
			}
		if(!mMore && mOneMoreTime)
	//* 178  353:aload_0         
	//* 179  354:getfield        #101 <Field boolean mMore>
	//* 180  357:ifne            374
	//* 181  360:aload_0         
	//* 182  361:getfield        #103 <Field boolean mOneMoreTime>
	//* 183  364:ifeq            374
		{
			mOneMoreTime = false;
	//  184  367:aload_0         
	//  185  368:iconst_0        
	//  186  369:putfield        #103 <Field boolean mOneMoreTime>
			return true;
	//  187  372:iconst_1        
	//  188  373:ireturn         
		} else
		{
			return mMore;
	//  189  374:aload_0         
	//  190  375:getfield        #101 <Field boolean mMore>
	//  191  378:ireturn         
		}
	}

	public boolean getTransformation(long l, GLTransformation gltransformation, float f)
	{
		mScaleFactor = f;
	//    0    0:aload_0         
	//    1    1:fload           4
	//    2    3:putfield        #97  <Field float mScaleFactor>
		return getTransformation(l, gltransformation);
	//    3    6:aload_0         
	//    4    7:lload_1         
	//    5    8:aload_3         
	//    6    9:invokevirtual   #252 <Method boolean getTransformation(long, GLTransformation)>
	//    7   12:ireturn         
	}

	public int getZAdjustment()
	{
		return mZAdjustment;
	//    0    0:aload_0         
	//    1    1:getfield        #255 <Field int mZAdjustment>
	//    2    4:ireturn         
	}

	public boolean hasAlpha()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean hasEnded()
	{
		return mEnded;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field boolean mEnded>
	//    2    4:ireturn         
	}

	protected boolean hasStarted()
	{
		return mStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean mStarted>
	//    2    4:ireturn         
	}

	public void initialize(int i, int j, int k, int l)
	{
		reset();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #263 <Method void reset()>
		mInitialized = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #75  <Field boolean mInitialized>
	//    5    9:return          
	}

	public void initializeInvalidateRegion(int i, int j, int k, int l)
	{
		RectF rectf = mPreviousRegion;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field RectF mPreviousRegion>
	//    2    4:astore          5
		rectf.set(i, j, k, l);
	//    3    6:aload           5
	//    4    8:iload_1         
	//    5    9:i2f             
	//    6   10:iload_2         
	//    7   11:i2f             
	//    8   12:iload_3         
	//    9   13:i2f             
	//   10   14:iload           4
	//   11   16:i2f             
	//   12   17:invokevirtual   #197 <Method void RectF.set(float, float, float, float)>
		rectf.inset(-1F, -1F);
	//   13   20:aload           5
	//   14   22:ldc1            #210 <Float -1F>
	//   15   24:ldc1            #210 <Float -1F>
	//   16   26:invokevirtual   #214 <Method void RectF.inset(float, float)>
		if(mFillBefore)
	//*  17   29:aload_0         
	//*  18   30:getfield        #77  <Field boolean mFillBefore>
	//*  19   33:ifeq            58
		{
			GLTransformation gltransformation = mPreviousTransformation;
	//   20   36:aload_0         
	//   21   37:getfield        #115 <Field GLTransformation mPreviousTransformation>
	//   22   40:astore          5
			applyTransformation(mInterpolator.getInterpolation(0.0F), gltransformation);
	//   23   42:aload_0         
	//   24   43:aload_0         
	//   25   44:getfield        #179 <Field Interpolator mInterpolator>
	//   26   47:fconst_0        
	//   27   48:invokeinterface #245 <Method float Interpolator.getInterpolation(float)>
	//   28   53:aload           5
	//   29   55:invokevirtual   #247 <Method void applyTransformation(float, GLTransformation)>
		}
	//   30   58:return          
	}

	public boolean isFillEnabled()
	{
		return mFillEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field boolean mFillEnabled>
	//    2    4:ireturn         
	}

	public boolean isInitialized()
	{
		return mInitialized;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field boolean mInitialized>
	//    2    4:ireturn         
	}

	public void reset()
	{
		mPreviousRegion.setEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field RectF mPreviousRegion>
	//    2    4:invokevirtual   #269 <Method void RectF.setEmpty()>
		mPreviousTransformation.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #115 <Field GLTransformation mPreviousTransformation>
	//    5   11:invokevirtual   #272 <Method void GLTransformation.clear()>
		mInitialized = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #75  <Field boolean mInitialized>
		mCycleFlip = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #73  <Field boolean mCycleFlip>
		mRepeated = 0;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #93  <Field int mRepeated>
		mMore = true;
	//   15   29:aload_0         
	//   16   30:iconst_1        
	//   17   31:putfield        #101 <Field boolean mMore>
		mOneMoreTime = true;
	//   18   34:aload_0         
	//   19   35:iconst_1        
	//   20   36:putfield        #103 <Field boolean mOneMoreTime>
		mListenerHandler = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #127 <Field Handler mListenerHandler>
	//   24   44:return          
	}

	protected float resolveSize(int i, float f, int j, int k)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 2: default 28
	//	               0 30
	//	               1 32
	//	               2 37
		default:
			return f;
	//    2   28:fload_2         
	//    3   29:freturn         

		case 0: // '\0'
			return f;
	//    4   30:fload_2         
	//    5   31:freturn         

		case 1: // '\001'
			return (float)j * f;
	//    6   32:iload_3         
	//    7   33:i2f             
	//    8   34:fload_2         
	//    9   35:fmul            
	//   10   36:freturn         

		case 2: // '\002'
			return (float)k * f;
	//   11   37:iload           4
	//   12   39:i2f             
	//   13   40:fload_2         
	//   14   41:fmul            
	//   15   42:freturn         
		}
	}

	public void restrictDuration(long l)
	{
		if(mStartOffset > l)
	//*   0    0:aload_0         
	//*   1    1:getfield        #225 <Field long mStartOffset>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifle            25
		{
			mStartOffset = l;
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:putfield        #225 <Field long mStartOffset>
			mDuration = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #89  <Field long mDuration>
			mRepeatCount = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #91  <Field int mRepeatCount>
			return;
	//   14   24:return          
		}
		long l2 = mDuration + mStartOffset;
	//   15   25:aload_0         
	//   16   26:getfield        #89  <Field long mDuration>
	//   17   29:aload_0         
	//   18   30:getfield        #225 <Field long mStartOffset>
	//   19   33:ladd            
	//   20   34:lstore          5
		long l1 = l2;
	//   21   36:lload           5
	//   22   38:lstore_3        
		if(l2 > l)
	//*  23   39:lload           5
	//*  24   41:lload_1         
	//*  25   42:lcmp            
	//*  26   43:ifle            58
		{
			mDuration = l - mStartOffset;
	//   27   46:aload_0         
	//   28   47:lload_1         
	//   29   48:aload_0         
	//   30   49:getfield        #225 <Field long mStartOffset>
	//   31   52:lsub            
	//   32   53:putfield        #89  <Field long mDuration>
			l1 = l;
	//   33   56:lload_1         
	//   34   57:lstore_3        
		}
		if(mDuration <= 0L)
	//*  35   58:aload_0         
	//*  36   59:getfield        #89  <Field long mDuration>
	//*  37   62:lconst_0        
	//*  38   63:lcmp            
	//*  39   64:ifgt            78
		{
			mDuration = 0L;
	//   40   67:aload_0         
	//   41   68:lconst_0        
	//   42   69:putfield        #89  <Field long mDuration>
			mRepeatCount = 0;
	//   43   72:aload_0         
	//   44   73:iconst_0        
	//   45   74:putfield        #91  <Field int mRepeatCount>
			return;
	//   46   77:return          
		}
		if(mRepeatCount < 0 || (long)mRepeatCount > l || (long)mRepeatCount * l1 > l)
	//*  47   78:aload_0         
	//*  48   79:getfield        #91  <Field int mRepeatCount>
	//*  49   82:iflt            107
	//*  50   85:aload_0         
	//*  51   86:getfield        #91  <Field int mRepeatCount>
	//*  52   89:i2l             
	//*  53   90:lload_1         
	//*  54   91:lcmp            
	//*  55   92:ifgt            107
	//*  56   95:aload_0         
	//*  57   96:getfield        #91  <Field int mRepeatCount>
	//*  58   99:i2l             
	//*  59  100:lload_3         
	//*  60  101:lmul            
	//*  61  102:lload_1         
	//*  62  103:lcmp            
	//*  63  104:ifle            129
		{
			mRepeatCount = (int)(l / l1) - 1;
	//   64  107:aload_0         
	//   65  108:lload_1         
	//   66  109:lload_3         
	//   67  110:ldiv            
	//   68  111:l2i             
	//   69  112:iconst_1        
	//   70  113:isub            
	//   71  114:putfield        #91  <Field int mRepeatCount>
			if(mRepeatCount < 0)
	//*  72  117:aload_0         
	//*  73  118:getfield        #91  <Field int mRepeatCount>
	//*  74  121:ifge            129
				mRepeatCount = 0;
	//   75  124:aload_0         
	//   76  125:iconst_0        
	//   77  126:putfield        #91  <Field int mRepeatCount>
		}
	//   78  129:return          
	}

	public void scaleCurrentDuration(float f)
	{
		mDuration = (long)((float)mDuration * f);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #89  <Field long mDuration>
	//    3    5:l2f             
	//    4    6:fload_1         
	//    5    7:fmul            
	//    6    8:f2l             
	//    7    9:putfield        #89  <Field long mDuration>
		mStartOffset = (long)((float)mStartOffset * f);
	//    8   12:aload_0         
	//    9   13:aload_0         
	//   10   14:getfield        #225 <Field long mStartOffset>
	//   11   17:l2f             
	//   12   18:fload_1         
	//   13   19:fmul            
	//   14   20:f2l             
	//   15   21:putfield        #225 <Field long mStartOffset>
	//   16   24:return          
	}

	public void setAnimationListener(com.amap.api.maps.model.animation.Animation.AnimationListener animationlistener)
	{
		mListener = animationlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #125 <Field com.amap.api.maps.model.animation.Animation$AnimationListener mListener>
	//    3    5:return          
	}

	public void setBackgroundColor(int i)
	{
		mBackgroundColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #185 <Field int mBackgroundColor>
	//    3    5:return          
	}

	public void setDetachWallpaper(boolean flag)
	{
		mDetachWallpaper = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #99  <Field boolean mDetachWallpaper>
	//    3    5:return          
	}

	public void setDuration(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(l < 0L)
	//*   2    2:lload_1         
	//*   3    3:lconst_0        
	//*   4    4:lcmp            
	//*   5    5:ifge            10
			l1 = 0L;
	//    6    8:lconst_0        
	//    7    9:lstore_3        
		mDuration = l1;
	//    8   10:aload_0         
	//    9   11:lload_3         
	//   10   12:putfield        #89  <Field long mDuration>
	//   11   15:return          
	}

	public void setFillAfter(boolean flag)
	{
		mFillAfter = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #79  <Field boolean mFillAfter>
	//    3    5:return          
	}

	public void setFillBefore(boolean flag)
	{
		mFillBefore = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean mFillBefore>
	//    3    5:return          
	}

	public void setFillEnabled(boolean flag)
	{
		mFillEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #81  <Field boolean mFillEnabled>
	//    3    5:return          
	}

	public void setInterpolator(Context context, int i)
	{
		setInterpolator(AnimationUtils.loadInterpolator(context, i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #296 <Method Interpolator AnimationUtils.loadInterpolator(Context, int)>
	//    4    6:invokevirtual   #299 <Method void setInterpolator(Interpolator)>
	//    5    9:return          
	}

	public void setInterpolator(Interpolator interpolator)
	{
		mInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #179 <Field Interpolator mInterpolator>
	//    3    5:return          
	}

	public void setListenerHandler(Handler handler)
	{
		if(mListenerHandler == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field Handler mListenerHandler>
	//*   2    4:ifnonnull       31
		{
			mOnStart = new Runnable() {

				public void run()
				{
					if(mListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field GLAnimation this$0>
				//*   2    4:getfield        #28  <Field com.amap.api.maps.model.animation.Animation$AnimationListener GLAnimation.mListener>
				//*   3    7:ifnull          28
						try
						{
							mListener.onAnimationStart();
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field GLAnimation this$0>
				//    6   14:getfield        #28  <Field com.amap.api.maps.model.animation.Animation$AnimationListener GLAnimation.mListener>
				//    7   17:invokeinterface #33  <Method void com.amap.api.maps.model.animation.Animation$AnimationListener.onAnimationStart()>
							return;
				//    8   22:return          
						}
						catch(Throwable throwable)
				//*   9   23:astore_1        
						{
							throwable.printStackTrace();
				//   10   24:aload_1         
				//   11   25:invokevirtual   #36  <Method void Throwable.printStackTrace()>
						}
				//   12   28:return          
				}

				final GLAnimation this$0;

			
			{
				this$0 = GLAnimation.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GLAnimation this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    3    7:aload_0         
	//    4    8:new             #8   <Class GLAnimation$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #304 <Method void GLAnimation$1(GLAnimation)>
	//    8   16:putfield        #147 <Field Runnable mOnStart>
			mOnEnd = new Runnable() {

				public void run()
				{
					if(mListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field GLAnimation this$0>
				//*   2    4:getfield        #28  <Field com.amap.api.maps.model.animation.Animation$AnimationListener GLAnimation.mListener>
				//*   3    7:ifnull          28
						try
						{
							mListener.onAnimationEnd();
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field GLAnimation this$0>
				//    6   14:getfield        #28  <Field com.amap.api.maps.model.animation.Animation$AnimationListener GLAnimation.mListener>
				//    7   17:invokeinterface #33  <Method void com.amap.api.maps.model.animation.Animation$AnimationListener.onAnimationEnd()>
							return;
				//    8   22:return          
						}
						catch(Throwable throwable)
				//*   9   23:astore_1        
						{
							throwable.printStackTrace();
				//   10   24:aload_1         
				//   11   25:invokevirtual   #36  <Method void Throwable.printStackTrace()>
						}
				//   12   28:return          
				}

				final GLAnimation this$0;

			
			{
				this$0 = GLAnimation.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field GLAnimation this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//    9   19:aload_0         
	//   10   20:new             #10  <Class GLAnimation$2>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #305 <Method void GLAnimation$2(GLAnimation)>
	//   14   28:putfield        #134 <Field Runnable mOnEnd>
		}
		mListenerHandler = handler;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:putfield        #127 <Field Handler mListenerHandler>
	//   18   36:return          
	}

	public void setRepeatCount(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            8
			j = -1;
	//    4    6:iconst_m1       
	//    5    7:istore_2        
		mRepeatCount = j;
	//    6    8:aload_0         
	//    7    9:iload_2         
	//    8   10:putfield        #91  <Field int mRepeatCount>
	//    9   13:return          
	}

	public void setRepeatMode(int i)
	{
		mRepeatMode = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #95  <Field int mRepeatMode>
	//    3    5:return          
	}

	public void setStartOffset(long l)
	{
		mStartOffset = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #225 <Field long mStartOffset>
	//    3    5:return          
	}

	public void setStartTime(long l)
	{
		mStartTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #85  <Field long mStartTime>
		mEnded = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #69  <Field boolean mEnded>
		mStarted = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #71  <Field boolean mStarted>
		mCycleFlip = false;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #73  <Field boolean mCycleFlip>
		mRepeated = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #93  <Field int mRepeated>
		mMore = true;
	//   15   25:aload_0         
	//   16   26:iconst_1        
	//   17   27:putfield        #101 <Field boolean mMore>
	//   18   30:return          
	}

	public void setZAdjustment(int i)
	{
		mZAdjustment = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #255 <Field int mZAdjustment>
	//    3    5:return          
	}

	public void start()
	{
		setStartTime(-1L);
	//    0    0:aload_0         
	//    1    1:ldc2w           #82  <Long -1L>
	//    2    4:invokevirtual   #313 <Method void setStartTime(long)>
	//    3    7:return          
	}

	public void startNow()
	{
		setStartTime(AnimationUtils.currentAnimationTimeMillis());
	//    0    0:aload_0         
	//    1    1:invokestatic    #317 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//    2    4:invokevirtual   #313 <Method void setStartTime(long)>
	//    3    7:return          
	}

	public boolean willChangeBounds()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean willChangeTransformationMatrix()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public static final int ABSOLUTE = 0;
	public static final int INFINITE = -1;
	public static final int RELATIVE_TO_PARENT = 2;
	public static final int RELATIVE_TO_SELF = 1;
	public static final int RESTART = 1;
	public static final int REVERSE = 2;
	public static final int START_ON_FIRST_FRAME = -1;
	public static final int ZORDER_BOTTOM = -1;
	public static final int ZORDER_NORMAL = 0;
	public static final int ZORDER_TOP = 1;
	private int mBackgroundColor;
	boolean mCycleFlip;
	private boolean mDetachWallpaper;
	long mDuration;
	boolean mEnded;
	boolean mFillAfter;
	boolean mFillBefore;
	boolean mFillEnabled;
	boolean mInitialized;
	Interpolator mInterpolator;
	com.amap.api.maps.model.animation.Animation.AnimationListener mListener;
	private Handler mListenerHandler;
	private boolean mMore;
	private Runnable mOnEnd;
	private Runnable mOnStart;
	private boolean mOneMoreTime;
	RectF mPreviousRegion;
	GLTransformation mPreviousTransformation;
	RectF mRegion;
	int mRepeatCount;
	int mRepeatMode;
	int mRepeated;
	private float mScaleFactor;
	long mStartOffset;
	long mStartTime;
	boolean mStarted;
	private int mZAdjustment;
}
