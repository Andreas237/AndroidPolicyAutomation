// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Interpolator;

public class OverlayListView$OverlayObject
{

	public BitmapDrawable getBitmapDrawable()
	{
		return mBitmap;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field BitmapDrawable mBitmap>
	//    2    4:areturn         
	}

	public boolean isAnimationStarted()
	{
		return mIsAnimationStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field boolean mIsAnimationStarted>
	//    2    4:ireturn         
	}

	public OverlayListView$OverlayObject setAlphaAnimation(float f, float f1)
	{
		mStartAlpha = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #34  <Field float mStartAlpha>
		mEndAlpha = f1;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #36  <Field float mEndAlpha>
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public OverlayListView$OverlayObject setAnimationEndListener(OnAnimationEndListener onanimationendlistener)
	{
		mListener = onanimationendlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #70  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OverlayListView$OverlayObject setDuration(long l)
	{
		mDuration = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #74  <Field long mDuration>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OverlayListView$OverlayObject setInterpolator(Interpolator interpolator)
	{
		mInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #78  <Field Interpolator mInterpolator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public OverlayListView$OverlayObject setTranslateYAnimation(int i)
	{
		mDeltaY = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #82  <Field int mDeltaY>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void startAnimation(long l)
	{
		mStartTime = l;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:putfield        #86  <Field long mStartTime>
		mIsAnimationStarted = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #64  <Field boolean mIsAnimationStarted>
	//    6   10:return          
	}

	public void stopAnimation()
	{
		mIsAnimationStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #64  <Field boolean mIsAnimationStarted>
		mIsAnimationEnded = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #89  <Field boolean mIsAnimationEnded>
		OnAnimationEndListener onanimationendlistener = mListener;
	//    6   10:aload_0         
	//    7   11:getfield        #70  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
	//    8   14:astore_1        
		class OnAnimationEndListener
		{

			public abstract void onAnimationEnd();
		}

		if(onanimationendlistener != null)
	//*   9   15:aload_1         
	//*  10   16:ifnull          25
			onanimationendlistener.onAnimationEnd();
	//   11   19:aload_1         
	//   12   20:invokeinterface #94  <Method void OverlayListView$OverlayObject$OnAnimationEndListener.onAnimationEnd()>
	//   13   25:return          
	}

	public boolean update(long l)
	{
		if(mIsAnimationEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field boolean mIsAnimationEnded>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		float f = Math.max(0.0F, Math.min(1.0F, (float)(l - mStartTime) / (float)mDuration));
	//    5    9:fconst_0        
	//    6   10:fconst_1        
	//    7   11:lload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #86  <Field long mStartTime>
	//   10   16:lsub            
	//   11   17:l2f             
	//   12   18:aload_0         
	//   13   19:getfield        #74  <Field long mDuration>
	//   14   22:l2f             
	//   15   23:fdiv            
	//   16   24:invokestatic    #102 <Method float Math.min(float, float)>
	//   17   27:invokestatic    #105 <Method float Math.max(float, float)>
	//   18   30:fstore_3        
		if(!mIsAnimationStarted)
	//*  19   31:aload_0         
	//*  20   32:getfield        #64  <Field boolean mIsAnimationStarted>
	//*  21   35:ifne            40
			f = 0.0F;
	//   22   38:fconst_0        
	//   23   39:fstore_3        
		Object obj = ((Object) (mInterpolator));
	//   24   40:aload_0         
	//   25   41:getfield        #78  <Field Interpolator mInterpolator>
	//   26   44:astore          7
		float f1;
		if(obj == null)
	//*  27   46:aload           7
	//*  28   48:ifnonnull       57
			f1 = f;
	//   29   51:fload_3         
	//   30   52:fstore          4
		else
	//*  31   54:goto            67
			f1 = ((Interpolator) (obj)).getInterpolation(f);
	//   32   57:aload           7
	//   33   59:fload_3         
	//   34   60:invokeinterface #111 <Method float Interpolator.getInterpolation(float)>
	//   35   65:fstore          4
		int i = (int)((float)mDeltaY * f1);
	//   36   67:aload_0         
	//   37   68:getfield        #82  <Field int mDeltaY>
	//   38   71:i2f             
	//   39   72:fload           4
	//   40   74:fmul            
	//   41   75:f2i             
	//   42   76:istore          6
		mCurrentBounds.top = mStartRect.top + i;
	//   43   78:aload_0         
	//   44   79:getfield        #47  <Field Rect mCurrentBounds>
	//   45   82:aload_0         
	//   46   83:getfield        #40  <Field Rect mStartRect>
	//   47   86:getfield        #114 <Field int Rect.top>
	//   48   89:iload           6
	//   49   91:iadd            
	//   50   92:putfield        #114 <Field int Rect.top>
		mCurrentBounds.bottom = mStartRect.bottom + i;
	//   51   95:aload_0         
	//   52   96:getfield        #47  <Field Rect mCurrentBounds>
	//   53   99:aload_0         
	//   54  100:getfield        #40  <Field Rect mStartRect>
	//   55  103:getfield        #117 <Field int Rect.bottom>
	//   56  106:iload           6
	//   57  108:iadd            
	//   58  109:putfield        #117 <Field int Rect.bottom>
		float f2 = mStartAlpha;
	//   59  112:aload_0         
	//   60  113:getfield        #34  <Field float mStartAlpha>
	//   61  116:fstore          5
		mCurrentAlpha = f2 + (mEndAlpha - f2) * f1;
	//   62  118:aload_0         
	//   63  119:fload           5
	//   64  121:aload_0         
	//   65  122:getfield        #36  <Field float mEndAlpha>
	//   66  125:fload           5
	//   67  127:fsub            
	//   68  128:fload           4
	//   69  130:fmul            
	//   70  131:fadd            
	//   71  132:putfield        #32  <Field float mCurrentAlpha>
		obj = ((Object) (mBitmap));
	//   72  135:aload_0         
	//   73  136:getfield        #38  <Field BitmapDrawable mBitmap>
	//   74  139:astore          7
		if(obj != null && mCurrentBounds != null)
	//*  75  141:aload           7
	//*  76  143:ifnull          177
	//*  77  146:aload_0         
	//*  78  147:getfield        #47  <Field Rect mCurrentBounds>
	//*  79  150:ifnull          177
		{
			((BitmapDrawable) (obj)).setAlpha((int)(mCurrentAlpha * 255F));
	//   80  153:aload           7
	//   81  155:aload_0         
	//   82  156:getfield        #32  <Field float mCurrentAlpha>
	//   83  159:ldc1            #48  <Float 255F>
	//   84  161:fmul            
	//   85  162:f2i             
	//   86  163:invokevirtual   #54  <Method void BitmapDrawable.setAlpha(int)>
			mBitmap.setBounds(mCurrentBounds);
	//   87  166:aload_0         
	//   88  167:getfield        #38  <Field BitmapDrawable mBitmap>
	//   89  170:aload_0         
	//   90  171:getfield        #47  <Field Rect mCurrentBounds>
	//   91  174:invokevirtual   #57  <Method void BitmapDrawable.setBounds(Rect)>
		}
		if(mIsAnimationStarted && f >= 1.0F)
	//*  92  177:aload_0         
	//*  93  178:getfield        #64  <Field boolean mIsAnimationStarted>
	//*  94  181:ifeq            213
	//*  95  184:fload_3         
	//*  96  185:fconst_1        
	//*  97  186:fcmpl           
	//*  98  187:iflt            213
		{
			mIsAnimationEnded = true;
	//   99  190:aload_0         
	//  100  191:iconst_1        
	//  101  192:putfield        #89  <Field boolean mIsAnimationEnded>
			OnAnimationEndListener onanimationendlistener = mListener;
	//  102  195:aload_0         
	//  103  196:getfield        #70  <Field OverlayListView$OverlayObject$OnAnimationEndListener mListener>
	//  104  199:astore          7
			if(onanimationendlistener != null)
	//* 105  201:aload           7
	//* 106  203:ifnull          213
				onanimationendlistener.onAnimationEnd();
	//  107  206:aload           7
	//  108  208:invokeinterface #94  <Method void OverlayListView$OverlayObject$OnAnimationEndListener.onAnimationEnd()>
		}
		return mIsAnimationEnded ^ true;
	//  109  213:aload_0         
	//  110  214:getfield        #89  <Field boolean mIsAnimationEnded>
	//  111  217:iconst_1        
	//  112  218:ixor            
	//  113  219:ireturn         
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
	//    1    1:invokespecial   #30  <Method void Object()>
		mCurrentAlpha = 1.0F;
	//    2    4:aload_0         
	//    3    5:fconst_1        
	//    4    6:putfield        #32  <Field float mCurrentAlpha>
		mStartAlpha = 1.0F;
	//    5    9:aload_0         
	//    6   10:fconst_1        
	//    7   11:putfield        #34  <Field float mStartAlpha>
		mEndAlpha = 1.0F;
	//    8   14:aload_0         
	//    9   15:fconst_1        
	//   10   16:putfield        #36  <Field float mEndAlpha>
		mBitmap = bitmapdrawable;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #38  <Field BitmapDrawable mBitmap>
		mStartRect = rect;
	//   14   24:aload_0         
	//   15   25:aload_2         
	//   16   26:putfield        #40  <Field Rect mStartRect>
		mCurrentBounds = new Rect(rect);
	//   17   29:aload_0         
	//   18   30:new             #42  <Class Rect>
	//   19   33:dup             
	//   20   34:aload_2         
	//   21   35:invokespecial   #45  <Method void Rect(Rect)>
	//   22   38:putfield        #47  <Field Rect mCurrentBounds>
		bitmapdrawable = mBitmap;
	//   23   41:aload_0         
	//   24   42:getfield        #38  <Field BitmapDrawable mBitmap>
	//   25   45:astore_1        
		if(bitmapdrawable != null && mCurrentBounds != null)
	//*  26   46:aload_1         
	//*  27   47:ifnull          80
	//*  28   50:aload_0         
	//*  29   51:getfield        #47  <Field Rect mCurrentBounds>
	//*  30   54:ifnull          80
		{
			bitmapdrawable.setAlpha((int)(mCurrentAlpha * 255F));
	//   31   57:aload_1         
	//   32   58:aload_0         
	//   33   59:getfield        #32  <Field float mCurrentAlpha>
	//   34   62:ldc1            #48  <Float 255F>
	//   35   64:fmul            
	//   36   65:f2i             
	//   37   66:invokevirtual   #54  <Method void BitmapDrawable.setAlpha(int)>
			mBitmap.setBounds(mCurrentBounds);
	//   38   69:aload_0         
	//   39   70:getfield        #38  <Field BitmapDrawable mBitmap>
	//   40   73:aload_0         
	//   41   74:getfield        #47  <Field Rect mCurrentBounds>
	//   42   77:invokevirtual   #57  <Method void BitmapDrawable.setBounds(Rect)>
		}
	//   43   80:return          
	}
}
