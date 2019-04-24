// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.app:
//			OverlayListView

public static class OverlayListView$OverlayObject
{
	public static interface OnAnimationEndListener
	{

		public abstract void onAnimationEnd();
	}


	public BitmapDrawable getBitmapDrawable()
	{
		return mBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field BitmapDrawable mBitmap>
	//    2    4:areturn         
	}

	public boolean isAnimationStarted()
	{
		return mIsAnimationStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field boolean mIsAnimationStarted>
	//    2    4:ireturn         
	}

	public OverlayListView$OverlayObject setAlphaAnimation(float f, float f1)
	{
		mStartAlpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #40  <Field float mStartAlpha>
		mEndAlpha = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #42  <Field float mEndAlpha>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public OverlayListView$OverlayObject setAnimationEndListener(OnAnimationEndListener onanimationendlistener)
	{
		mListener = onanimationendlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OverlayListView$OverlayObject setDuration(long l)
	{
		mDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #80  <Field long mDuration>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OverlayListView$OverlayObject setInterpolator(Interpolator interpolator)
	{
		mInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field Interpolator mInterpolator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OverlayListView$OverlayObject setTranslateYAnimation(int i)
	{
		mDeltaY = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field int mDeltaY>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void startAnimation(long l)
	{
		mStartTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #92  <Field long mStartTime>
		mIsAnimationStarted = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #70  <Field boolean mIsAnimationStarted>
	//    6   10:return          
	}

	public void stopAnimation()
	{
		mIsAnimationStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #70  <Field boolean mIsAnimationStarted>
		mIsAnimationEnded = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #95  <Field boolean mIsAnimationEnded>
		if(mListener != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
	//*   8   14:ifnull          26
			mListener.onAnimationEnd();
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
	//   11   21:invokeinterface #98  <Method void OverlayListView$OverlayObject$OnAnimationEndListener.onAnimationEnd()>
	//   12   26:return          
	}

	public boolean update(long l)
	{
		if(mIsAnimationEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field boolean mIsAnimationEnded>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		float f = Math.max(0.0F, Math.min(1.0F, (float)(l - mStartTime) / (float)mDuration));
	//    5    9:fconst_0        
	//    6   10:fconst_1        
	//    7   11:lload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #92  <Field long mStartTime>
	//   10   16:lsub            
	//   11   17:l2f             
	//   12   18:aload_0         
	//   13   19:getfield        #80  <Field long mDuration>
	//   14   22:l2f             
	//   15   23:fdiv            
	//   16   24:invokestatic    #106 <Method float Math.min(float, float)>
	//   17   27:invokestatic    #109 <Method float Math.max(float, float)>
	//   18   30:fstore_3        
		if(!mIsAnimationStarted)
	//*  19   31:aload_0         
	//*  20   32:getfield        #70  <Field boolean mIsAnimationStarted>
	//*  21   35:ifne            40
			f = 0.0F;
	//   22   38:fconst_0        
	//   23   39:fstore_3        
		float f1;
		if(mInterpolator == null)
	//*  24   40:aload_0         
	//*  25   41:getfield        #84  <Field Interpolator mInterpolator>
	//*  26   44:ifnonnull       53
			f1 = f;
	//   27   47:fload_3         
	//   28   48:fstore          4
		else
	//*  29   50:goto            65
			f1 = mInterpolator.getInterpolation(f);
	//   30   53:aload_0         
	//   31   54:getfield        #84  <Field Interpolator mInterpolator>
	//   32   57:fload_3         
	//   33   58:invokeinterface #115 <Method float Interpolator.getInterpolation(float)>
	//   34   63:fstore          4
		int i = (int)((float)mDeltaY * f1);
	//   35   65:aload_0         
	//   36   66:getfield        #88  <Field int mDeltaY>
	//   37   69:i2f             
	//   38   70:fload           4
	//   39   72:fmul            
	//   40   73:f2i             
	//   41   74:istore          5
		mCurrentBounds.top = mStartRect.top + i;
	//   42   76:aload_0         
	//   43   77:getfield        #53  <Field Rect mCurrentBounds>
	//   44   80:aload_0         
	//   45   81:getfield        #46  <Field Rect mStartRect>
	//   46   84:getfield        #118 <Field int Rect.top>
	//   47   87:iload           5
	//   48   89:iadd            
	//   49   90:putfield        #118 <Field int Rect.top>
		mCurrentBounds.bottom = mStartRect.bottom + i;
	//   50   93:aload_0         
	//   51   94:getfield        #53  <Field Rect mCurrentBounds>
	//   52   97:aload_0         
	//   53   98:getfield        #46  <Field Rect mStartRect>
	//   54  101:getfield        #121 <Field int Rect.bottom>
	//   55  104:iload           5
	//   56  106:iadd            
	//   57  107:putfield        #121 <Field int Rect.bottom>
		mCurrentAlpha = mStartAlpha + (mEndAlpha - mStartAlpha) * f1;
	//   58  110:aload_0         
	//   59  111:aload_0         
	//   60  112:getfield        #40  <Field float mStartAlpha>
	//   61  115:aload_0         
	//   62  116:getfield        #42  <Field float mEndAlpha>
	//   63  119:aload_0         
	//   64  120:getfield        #40  <Field float mStartAlpha>
	//   65  123:fsub            
	//   66  124:fload           4
	//   67  126:fmul            
	//   68  127:fadd            
	//   69  128:putfield        #38  <Field float mCurrentAlpha>
		if(mBitmap != null && mCurrentBounds != null)
	//*  70  131:aload_0         
	//*  71  132:getfield        #44  <Field BitmapDrawable mBitmap>
	//*  72  135:ifnull          171
	//*  73  138:aload_0         
	//*  74  139:getfield        #53  <Field Rect mCurrentBounds>
	//*  75  142:ifnull          171
		{
			mBitmap.setAlpha((int)(mCurrentAlpha * 255F));
	//   76  145:aload_0         
	//   77  146:getfield        #44  <Field BitmapDrawable mBitmap>
	//   78  149:aload_0         
	//   79  150:getfield        #38  <Field float mCurrentAlpha>
	//   80  153:ldc1            #54  <Float 255F>
	//   81  155:fmul            
	//   82  156:f2i             
	//   83  157:invokevirtual   #60  <Method void BitmapDrawable.setAlpha(int)>
			mBitmap.setBounds(mCurrentBounds);
	//   84  160:aload_0         
	//   85  161:getfield        #44  <Field BitmapDrawable mBitmap>
	//   86  164:aload_0         
	//   87  165:getfield        #53  <Field Rect mCurrentBounds>
	//   88  168:invokevirtual   #63  <Method void BitmapDrawable.setBounds(Rect)>
		}
		if(mIsAnimationStarted && f >= 1.0F)
	//*  89  171:aload_0         
	//*  90  172:getfield        #70  <Field boolean mIsAnimationStarted>
	//*  91  175:ifeq            205
	//*  92  178:fload_3         
	//*  93  179:fconst_1        
	//*  94  180:fcmpl           
	//*  95  181:iflt            205
		{
			mIsAnimationEnded = true;
	//   96  184:aload_0         
	//   97  185:iconst_1        
	//   98  186:putfield        #95  <Field boolean mIsAnimationEnded>
			if(mListener != null)
	//*  99  189:aload_0         
	//* 100  190:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
	//* 101  193:ifnull          205
				mListener.onAnimationEnd();
	//  102  196:aload_0         
	//  103  197:getfield        #76  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
	//  104  200:invokeinterface #98  <Method void OverlayListView$OverlayObject$OnAnimationEndListener.onAnimationEnd()>
		}
		return mIsAnimationEnded ^ true;
	//  105  205:aload_0         
	//  106  206:getfield        #95  <Field boolean mIsAnimationEnded>
	//  107  209:iconst_1        
	//  108  210:ixor            
	//  109  211:ireturn         
	}

	private BitmapDrawable mBitmap;
	private float mCurrentAlpha;
	private Rect mCurrentBounds;
	private int mDeltaY;
	private long mDuration;
	private float mEndAlpha;
	private Interpolator mInterpolator;
	private boolean mIsAnimationEnded;
	private boolean mIsAnimationStarted;
	private OnAnimationEndListener mListener;
	private float mStartAlpha;
	private Rect mStartRect;
	private long mStartTime;

	public OverlayListView$OverlayObject(BitmapDrawable bitmapdrawable, Rect rect)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mCurrentAlpha = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #38  <Field float mCurrentAlpha>
		mStartAlpha = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #40  <Field float mStartAlpha>
		mEndAlpha = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #42  <Field float mEndAlpha>
		mBitmap = bitmapdrawable;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #44  <Field BitmapDrawable mBitmap>
		mStartRect = rect;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #46  <Field Rect mStartRect>
		mCurrentBounds = new Rect(rect);
	//   17   29:aload_0         
	//   18   30:new             #48  <Class Rect>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:invokespecial   #51  <Method void Rect(Rect)>
	//   22   38:putfield        #53  <Field Rect mCurrentBounds>
		if(mBitmap != null && mCurrentBounds != null)
	//*  23   41:aload_0         
	//*  24   42:getfield        #44  <Field BitmapDrawable mBitmap>
	//*  25   45:ifnull          81
	//*  26   48:aload_0         
	//*  27   49:getfield        #53  <Field Rect mCurrentBounds>
	//*  28   52:ifnull          81
		{
			mBitmap.setAlpha((int)(mCurrentAlpha * 255F));
	//   29   55:aload_0         
	//   30   56:getfield        #44  <Field BitmapDrawable mBitmap>
	//   31   59:aload_0         
	//   32   60:getfield        #38  <Field float mCurrentAlpha>
	//   33   63:ldc1            #54  <Float 255F>
	//   34   65:fmul            
	//   35   66:f2i             
	//   36   67:invokevirtual   #60  <Method void BitmapDrawable.setAlpha(int)>
			mBitmap.setBounds(mCurrentBounds);
	//   37   70:aload_0         
	//   38   71:getfield        #44  <Field BitmapDrawable mBitmap>
	//   39   74:aload_0         
	//   40   75:getfield        #53  <Field Rect mCurrentBounds>
	//   41   78:invokevirtual   #63  <Method void BitmapDrawable.setBounds(Rect)>
		}
	//   42   81:return          
	}
}
