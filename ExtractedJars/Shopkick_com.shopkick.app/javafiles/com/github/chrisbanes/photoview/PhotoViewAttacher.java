// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import android.view.*;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;

// Referenced classes of package com.github.chrisbanes.photoview:
//			OnGestureListener, CustomGestureDetector, OnMatrixChangedListener, OnScaleChangedListener, 
//			Util, OnOutsidePhotoTapListener, OnPhotoTapListener, OnSingleFlingListener, 
//			Compat

public class PhotoViewAttacher
	implements android.view.View.OnTouchListener, OnGestureListener, android.view.View.OnLayoutChangeListener
{
	private class AnimatedZoomRunnable
		implements Runnable
	{

		private float interpolate()
		{
			float f = Math.min(1.0F, ((float)(System.currentTimeMillis() - mStartTime) * 1.0F) / (float)mZoomDuration);
		//    0    0:fconst_1        
		//    1    1:invokestatic    #35  <Method long System.currentTimeMillis()>
		//    2    4:aload_0         
		//    3    5:getfield        #37  <Field long mStartTime>
		//    4    8:lsub            
		//    5    9:l2f             
		//    6   10:fconst_1        
		//    7   11:fmul            
		//    8   12:aload_0         
		//    9   13:getfield        #22  <Field PhotoViewAttacher this$0>
		//   10   16:invokestatic    #48  <Method int PhotoViewAttacher.access$800(PhotoViewAttacher)>
		//   11   19:i2f             
		//   12   20:fdiv            
		//   13   21:invokestatic    #54  <Method float Math.min(float, float)>
		//   14   24:fstore_1        
			return mInterpolator.getInterpolation(f);
		//   15   25:aload_0         
		//   16   26:getfield        #22  <Field PhotoViewAttacher this$0>
		//   17   29:invokestatic    #58  <Method Interpolator PhotoViewAttacher.access$900(PhotoViewAttacher)>
		//   18   32:fload_1         
		//   19   33:invokeinterface #64  <Method float Interpolator.getInterpolation(float)>
		//   20   38:freturn         
		}

		public void run()
		{
			float f = interpolate();
		//    0    0:aload_0         
		//    1    1:invokespecial   #67  <Method float interpolate()>
		//    2    4:fstore_1        
			float f1 = mZoomStart;
		//    3    5:aload_0         
		//    4    6:getfield        #39  <Field float mZoomStart>
		//    5    9:fstore_2        
			f1 = (f1 + (mZoomEnd - f1) * f) / getScale();
		//    6   10:fload_2         
		//    7   11:aload_0         
		//    8   12:getfield        #41  <Field float mZoomEnd>
		//    9   15:fload_2         
		//   10   16:fsub            
		//   11   17:fload_1         
		//   12   18:fmul            
		//   13   19:fadd            
		//   14   20:aload_0         
		//   15   21:getfield        #22  <Field PhotoViewAttacher this$0>
		//   16   24:invokevirtual   #70  <Method float PhotoViewAttacher.getScale()>
		//   17   27:fdiv            
		//   18   28:fstore_2        
			onScale(f1, mFocalX, mFocalY);
		//   19   29:aload_0         
		//   20   30:getfield        #22  <Field PhotoViewAttacher this$0>
		//   21   33:fload_2         
		//   22   34:aload_0         
		//   23   35:getfield        #27  <Field float mFocalX>
		//   24   38:aload_0         
		//   25   39:getfield        #29  <Field float mFocalY>
		//   26   42:invokevirtual   #74  <Method void PhotoViewAttacher.onScale(float, float, float)>
			if(f < 1.0F)
		//*  27   45:fload_1         
		//*  28   46:fconst_1        
		//*  29   47:fcmpg           
		//*  30   48:ifge            62
				Compat.postOnAnimation(((View) (mImageView)), ((Runnable) (this)));
		//   31   51:aload_0         
		//   32   52:getfield        #22  <Field PhotoViewAttacher this$0>
		//   33   55:invokestatic    #78  <Method ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
		//   34   58:aload_0         
		//   35   59:invokestatic    #84  <Method void Compat.postOnAnimation(View, Runnable)>
		//   36   62:return          
		}

		private final float mFocalX;
		private final float mFocalY;
		private final long mStartTime = System.currentTimeMillis();
		private final float mZoomEnd;
		private final float mZoomStart;
		final PhotoViewAttacher this$0;

		public AnimatedZoomRunnable(float f, float f1, float f2, float f3)
		{
			this$0 = PhotoViewAttacher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #22  <Field PhotoViewAttacher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #25  <Method void Object()>
			mFocalX = f2;
		//    5    9:aload_0         
		//    6   10:fload           4
		//    7   12:putfield        #27  <Field float mFocalX>
			mFocalY = f3;
		//    8   15:aload_0         
		//    9   16:fload           5
		//   10   18:putfield        #29  <Field float mFocalY>
		//   11   21:aload_0         
		//   12   22:invokestatic    #35  <Method long System.currentTimeMillis()>
		//   13   25:putfield        #37  <Field long mStartTime>
			mZoomStart = f;
		//   14   28:aload_0         
		//   15   29:fload_2         
		//   16   30:putfield        #39  <Field float mZoomStart>
			mZoomEnd = f1;
		//   17   33:aload_0         
		//   18   34:fload_3         
		//   19   35:putfield        #41  <Field float mZoomEnd>
		//   20   38:return          
		}
	}

	private class FlingRunnable
		implements Runnable
	{

		public void cancelFling()
		{
			mScroller.forceFinished(true);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field OverScroller mScroller>
		//    2    4:iconst_1        
		//    3    5:invokevirtual   #36  <Method void OverScroller.forceFinished(boolean)>
		//    4    8:return          
		}

		public void fling(int i, int j, int k, int l)
		{
			RectF rectf = getDisplayRect();
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field PhotoViewAttacher this$0>
		//    2    4:invokevirtual   #42  <Method RectF PhotoViewAttacher.getDisplayRect()>
		//    3    7:astore          10
			if(rectf == null)
		//*   4    9:aload           10
		//*   5   11:ifnonnull       15
				return;
		//    6   14:return          
			int k1 = Math.round(-rectf.left);
		//    7   15:aload           10
		//    8   17:getfield        #48  <Field float RectF.left>
		//    9   20:fneg            
		//   10   21:invokestatic    #54  <Method int Math.round(float)>
		//   11   24:istore          8
			float f = i;
		//   12   26:iload_1         
		//   13   27:i2f             
		//   14   28:fstore          5
			int i1;
			int j1;
			if(f < rectf.width())
		//*  15   30:fload           5
		//*  16   32:aload           10
		//*  17   34:invokevirtual   #58  <Method float RectF.width()>
		//*  18   37:fcmpg           
		//*  19   38:ifge            60
			{
				j1 = Math.round(rectf.width() - f);
		//   20   41:aload           10
		//   21   43:invokevirtual   #58  <Method float RectF.width()>
		//   22   46:fload           5
		//   23   48:fsub            
		//   24   49:invokestatic    #54  <Method int Math.round(float)>
		//   25   52:istore          7
				i1 = 0;
		//   26   54:iconst_0        
		//   27   55:istore          6
			} else
		//*  28   57:goto            69
			{
				i = k1;
		//   29   60:iload           8
		//   30   62:istore_1        
				j1 = i;
		//   31   63:iload_1         
		//   32   64:istore          7
				i1 = i;
		//   33   66:iload_1         
		//   34   67:istore          6
			}
			int l1 = Math.round(-rectf.top);
		//   35   69:aload           10
		//   36   71:getfield        #61  <Field float RectF.top>
		//   37   74:fneg            
		//   38   75:invokestatic    #54  <Method int Math.round(float)>
		//   39   78:istore          9
			f = j;
		//   40   80:iload_2         
		//   41   81:i2f             
		//   42   82:fstore          5
			if(f < rectf.height())
		//*  43   84:fload           5
		//*  44   86:aload           10
		//*  45   88:invokevirtual   #64  <Method float RectF.height()>
		//*  46   91:fcmpg           
		//*  47   92:ifge            112
			{
				j = Math.round(rectf.height() - f);
		//   48   95:aload           10
		//   49   97:invokevirtual   #64  <Method float RectF.height()>
		//   50  100:fload           5
		//   51  102:fsub            
		//   52  103:invokestatic    #54  <Method int Math.round(float)>
		//   53  106:istore_2        
				i = 0;
		//   54  107:iconst_0        
		//   55  108:istore_1        
			} else
		//*  56  109:goto            117
			{
				i = l1;
		//   57  112:iload           9
		//   58  114:istore_1        
				j = i;
		//   59  115:iload_1         
		//   60  116:istore_2        
			}
			mCurrentX = k1;
		//   61  117:aload_0         
		//   62  118:iload           8
		//   63  120:putfield        #66  <Field int mCurrentX>
			mCurrentY = l1;
		//   64  123:aload_0         
		//   65  124:iload           9
		//   66  126:putfield        #68  <Field int mCurrentY>
			if(k1 != j1 || l1 != j)
		//*  67  129:iload           8
		//*  68  131:iload           7
		//*  69  133:icmpne          142
		//*  70  136:iload           9
		//*  71  138:iload_2         
		//*  72  139:icmpeq          164
				mScroller.fling(k1, l1, k, l, i1, j1, i, j, 0, 0);
		//   73  142:aload_0         
		//   74  143:getfield        #30  <Field OverScroller mScroller>
		//   75  146:iload           8
		//   76  148:iload           9
		//   77  150:iload_3         
		//   78  151:iload           4
		//   79  153:iload           6
		//   80  155:iload           7
		//   81  157:iload_1         
		//   82  158:iload_2         
		//   83  159:iconst_0        
		//   84  160:iconst_0        
		//   85  161:invokevirtual   #71  <Method void OverScroller.fling(int, int, int, int, int, int, int, int, int, int)>
		//   86  164:return          
		}

		public void run()
		{
			if(mScroller.isFinished())
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field OverScroller mScroller>
		//*   2    4:invokevirtual   #76  <Method boolean OverScroller.isFinished()>
		//*   3    7:ifeq            11
				return;
		//    4   10:return          
			if(mScroller.computeScrollOffset())
		//*   5   11:aload_0         
		//*   6   12:getfield        #30  <Field OverScroller mScroller>
		//*   7   15:invokevirtual   #79  <Method boolean OverScroller.computeScrollOffset()>
		//*   8   18:ifeq            96
			{
				int i = mScroller.getCurrX();
		//    9   21:aload_0         
		//   10   22:getfield        #30  <Field OverScroller mScroller>
		//   11   25:invokevirtual   #83  <Method int OverScroller.getCurrX()>
		//   12   28:istore_1        
				int j = mScroller.getCurrY();
		//   13   29:aload_0         
		//   14   30:getfield        #30  <Field OverScroller mScroller>
		//   15   33:invokevirtual   #86  <Method int OverScroller.getCurrY()>
		//   16   36:istore_2        
				mSuppMatrix.postTranslate(mCurrentX - i, mCurrentY - j);
		//   17   37:aload_0         
		//   18   38:getfield        #20  <Field PhotoViewAttacher this$0>
		//   19   41:invokestatic    #90  <Method Matrix PhotoViewAttacher.access$1000(PhotoViewAttacher)>
		//   20   44:aload_0         
		//   21   45:getfield        #66  <Field int mCurrentX>
		//   22   48:iload_1         
		//   23   49:isub            
		//   24   50:i2f             
		//   25   51:aload_0         
		//   26   52:getfield        #68  <Field int mCurrentY>
		//   27   55:iload_2         
		//   28   56:isub            
		//   29   57:i2f             
		//   30   58:invokevirtual   #96  <Method boolean Matrix.postTranslate(float, float)>
		//   31   61:pop             
				PhotoViewAttacher photoviewattacher = PhotoViewAttacher.this;
		//   32   62:aload_0         
		//   33   63:getfield        #20  <Field PhotoViewAttacher this$0>
		//   34   66:astore_3        
				photoviewattacher.setImageViewMatrix(photoviewattacher.getDrawMatrix());
		//   35   67:aload_3         
		//   36   68:aload_3         
		//   37   69:invokestatic    #99  <Method Matrix PhotoViewAttacher.access$1100(PhotoViewAttacher)>
		//   38   72:invokestatic    #103 <Method void PhotoViewAttacher.access$1200(PhotoViewAttacher, Matrix)>
				mCurrentX = i;
		//   39   75:aload_0         
		//   40   76:iload_1         
		//   41   77:putfield        #66  <Field int mCurrentX>
				mCurrentY = j;
		//   42   80:aload_0         
		//   43   81:iload_2         
		//   44   82:putfield        #68  <Field int mCurrentY>
				Compat.postOnAnimation(((View) (mImageView)), ((Runnable) (this)));
		//   45   85:aload_0         
		//   46   86:getfield        #20  <Field PhotoViewAttacher this$0>
		//   47   89:invokestatic    #107 <Method ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
		//   48   92:aload_0         
		//   49   93:invokestatic    #113 <Method void Compat.postOnAnimation(View, Runnable)>
			}
		//   50   96:return          
		}

		private int mCurrentX;
		private int mCurrentY;
		private final OverScroller mScroller;
		final PhotoViewAttacher this$0;

		public FlingRunnable(Context context)
		{
			this$0 = PhotoViewAttacher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #20  <Field PhotoViewAttacher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #23  <Method void Object()>
			mScroller = new OverScroller(context);
		//    5    9:aload_0         
		//    6   10:new             #25  <Class OverScroller>
		//    7   13:dup             
		//    8   14:aload_2         
		//    9   15:invokespecial   #28  <Method void OverScroller(Context)>
		//   10   18:putfield        #30  <Field OverScroller mScroller>
		//   11   21:return          
		}
	}


	public PhotoViewAttacher(ImageView imageview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
		mInterpolator = ((Interpolator) (new AccelerateDecelerateInterpolator()));
	//    2    4:aload_0         
	//    3    5:new             #94  <Class AccelerateDecelerateInterpolator>
	//    4    8:dup             
	//    5    9:invokespecial   #95  <Method void AccelerateDecelerateInterpolator()>
	//    6   12:putfield        #97  <Field Interpolator mInterpolator>
		mZoomDuration = DEFAULT_ZOOM_DURATION;
	//    7   15:aload_0         
	//    8   16:getstatic       #99  <Field int DEFAULT_ZOOM_DURATION>
	//    9   19:putfield        #101 <Field int mZoomDuration>
		mMinScale = DEFAULT_MIN_SCALE;
	//   10   22:aload_0         
	//   11   23:getstatic       #103 <Field float DEFAULT_MIN_SCALE>
	//   12   26:putfield        #105 <Field float mMinScale>
		mMidScale = DEFAULT_MID_SCALE;
	//   13   29:aload_0         
	//   14   30:getstatic       #107 <Field float DEFAULT_MID_SCALE>
	//   15   33:putfield        #109 <Field float mMidScale>
		mMaxScale = DEFAULT_MAX_SCALE;
	//   16   36:aload_0         
	//   17   37:getstatic       #111 <Field float DEFAULT_MAX_SCALE>
	//   18   40:putfield        #113 <Field float mMaxScale>
		mAllowParentInterceptOnEdge = true;
	//   19   43:aload_0         
	//   20   44:iconst_1        
	//   21   45:putfield        #115 <Field boolean mAllowParentInterceptOnEdge>
		mBlockParentIntercept = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #117 <Field boolean mBlockParentIntercept>
	//   25   53:aload_0         
	//   26   54:new             #119 <Class Matrix>
	//   27   57:dup             
	//   28   58:invokespecial   #120 <Method void Matrix()>
	//   29   61:putfield        #122 <Field Matrix mBaseMatrix>
	//   30   64:aload_0         
	//   31   65:new             #119 <Class Matrix>
	//   32   68:dup             
	//   33   69:invokespecial   #120 <Method void Matrix()>
	//   34   72:putfield        #124 <Field Matrix mDrawMatrix>
	//   35   75:aload_0         
	//   36   76:new             #119 <Class Matrix>
	//   37   79:dup             
	//   38   80:invokespecial   #120 <Method void Matrix()>
	//   39   83:putfield        #126 <Field Matrix mSuppMatrix>
	//   40   86:aload_0         
	//   41   87:new             #128 <Class RectF>
	//   42   90:dup             
	//   43   91:invokespecial   #129 <Method void RectF()>
	//   44   94:putfield        #131 <Field RectF mDisplayRect>
	//   45   97:aload_0         
	//   46   98:bipush          9
	//   47  100:newarray        float[]
	//   48  102:putfield        #133 <Field float[] mMatrixValues>
		mScrollEdge = 2;
	//   49  105:aload_0         
	//   50  106:iconst_2        
	//   51  107:putfield        #135 <Field int mScrollEdge>
		mZoomEnabled = true;
	//   52  110:aload_0         
	//   53  111:iconst_1        
	//   54  112:putfield        #137 <Field boolean mZoomEnabled>
		mScaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
	//   55  115:aload_0         
	//   56  116:getstatic       #142 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
	//   57  119:putfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
		mImageView = imageview;
	//   58  122:aload_0         
	//   59  123:aload_1         
	//   60  124:putfield        #146 <Field ImageView mImageView>
		imageview.setOnTouchListener(((android.view.View.OnTouchListener) (this)));
	//   61  127:aload_1         
	//   62  128:aload_0         
	//   63  129:invokevirtual   #152 <Method void ImageView.setOnTouchListener(android.view.View$OnTouchListener)>
		imageview.addOnLayoutChangeListener(((android.view.View.OnLayoutChangeListener) (this)));
	//   64  132:aload_1         
	//   65  133:aload_0         
	//   66  134:invokevirtual   #156 <Method void ImageView.addOnLayoutChangeListener(android.view.View$OnLayoutChangeListener)>
		if(imageview.isInEditMode())
	//*  67  137:aload_1         
	//*  68  138:invokevirtual   #160 <Method boolean ImageView.isInEditMode()>
	//*  69  141:ifeq            145
		{
			return;
	//   70  144:return          
		} else
		{
			mBaseRotation = 0.0F;
	//   71  145:aload_0         
	//   72  146:fconst_0        
	//   73  147:putfield        #162 <Field float mBaseRotation>
			mScaleDragDetector = new CustomGestureDetector(imageview.getContext(), ((OnGestureListener) (this)));
	//   74  150:aload_0         
	//   75  151:new             #164 <Class CustomGestureDetector>
	//   76  154:dup             
	//   77  155:aload_1         
	//   78  156:invokevirtual   #168 <Method Context ImageView.getContext()>
	//   79  159:aload_0         
	//   80  160:invokespecial   #171 <Method void CustomGestureDetector(Context, OnGestureListener)>
	//   81  163:putfield        #173 <Field CustomGestureDetector mScaleDragDetector>
			mGestureDetector = new GestureDetector(imageview.getContext(), ((android.view.GestureDetector.OnGestureListener) (new android.view.GestureDetector.SimpleOnGestureListener() {

				public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
				{
					if(mSingleFlingListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #14  <Field PhotoViewAttacher this$0>
				//*   2    4:invokestatic    #24  <Method OnSingleFlingListener PhotoViewAttacher.access$200(PhotoViewAttacher)>
				//*   3    7:ifnull          68
					{
						if(getScale() > PhotoViewAttacher.DEFAULT_MIN_SCALE)
				//*   4   10:aload_0         
				//*   5   11:getfield        #14  <Field PhotoViewAttacher this$0>
				//*   6   14:invokevirtual   #28  <Method float PhotoViewAttacher.getScale()>
				//*   7   17:invokestatic    #31  <Method float PhotoViewAttacher.access$300()>
				//*   8   20:fcmpl           
				//*   9   21:ifle            26
							return false;
				//   10   24:iconst_0        
				//   11   25:ireturn         
						if(MotionEventCompat.getPointerCount(motionevent) <= PhotoViewAttacher.SINGLE_TOUCH)
				//*  12   26:aload_1         
				//*  13   27:invokestatic    #37  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
				//*  14   30:invokestatic    #41  <Method int PhotoViewAttacher.access$400()>
				//*  15   33:icmpgt          66
						{
							if(MotionEventCompat.getPointerCount(motionevent1) > PhotoViewAttacher.SINGLE_TOUCH)
				//*  16   36:aload_2         
				//*  17   37:invokestatic    #37  <Method int MotionEventCompat.getPointerCount(MotionEvent)>
				//*  18   40:invokestatic    #41  <Method int PhotoViewAttacher.access$400()>
				//*  19   43:icmple          48
								return false;
				//   20   46:iconst_0        
				//   21   47:ireturn         
							else
								return mSingleFlingListener.onFling(motionevent, motionevent1, f, f1);
				//   22   48:aload_0         
				//   23   49:getfield        #14  <Field PhotoViewAttacher this$0>
				//   24   52:invokestatic    #24  <Method OnSingleFlingListener PhotoViewAttacher.access$200(PhotoViewAttacher)>
				//   25   55:aload_1         
				//   26   56:aload_2         
				//   27   57:fload_3         
				//   28   58:fload           4
				//   29   60:invokeinterface #45  <Method boolean OnSingleFlingListener.onFling(MotionEvent, MotionEvent, float, float)>
				//   30   65:ireturn         
						} else
						{
							return false;
				//   31   66:iconst_0        
				//   32   67:ireturn         
						}
					} else
					{
						return false;
				//   33   68:iconst_0        
				//   34   69:ireturn         
					}
				}

				public void onLongPress(MotionEvent motionevent)
				{
					if(mLongClickListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #14  <Field PhotoViewAttacher this$0>
				//*   2    4:invokestatic    #51  <Method android.view.View$OnLongClickListener PhotoViewAttacher.access$000(PhotoViewAttacher)>
				//*   3    7:ifnull          30
						mLongClickListener.onLongClick(((View) (mImageView)));
				//    4   10:aload_0         
				//    5   11:getfield        #14  <Field PhotoViewAttacher this$0>
				//    6   14:invokestatic    #51  <Method android.view.View$OnLongClickListener PhotoViewAttacher.access$000(PhotoViewAttacher)>
				//    7   17:aload_0         
				//    8   18:getfield        #14  <Field PhotoViewAttacher this$0>
				//    9   21:invokestatic    #55  <Method ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
				//   10   24:invokeinterface #61  <Method boolean android.view.View$OnLongClickListener.onLongClick(View)>
				//   11   29:pop             
				//   12   30:return          
				}

				final PhotoViewAttacher this$0;

			
			{
				this$0 = PhotoViewAttacher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field PhotoViewAttacher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void android.view.GestureDetector$SimpleOnGestureListener()>
			//    5    9:return          
			}
			}
)));
	//   82  166:aload_0         
	//   83  167:new             #175 <Class GestureDetector>
	//   84  170:dup             
	//   85  171:aload_1         
	//   86  172:invokevirtual   #168 <Method Context ImageView.getContext()>
	//   87  175:new             #12  <Class PhotoViewAttacher$1>
	//   88  178:dup             
	//   89  179:aload_0         
	//   90  180:invokespecial   #178 <Method void PhotoViewAttacher$1(PhotoViewAttacher)>
	//   91  183:invokespecial   #181 <Method void GestureDetector(Context, android.view.GestureDetector$OnGestureListener)>
	//   92  186:putfield        #183 <Field GestureDetector mGestureDetector>
			mGestureDetector.setOnDoubleTapListener(new android.view.GestureDetector.OnDoubleTapListener() {

				public boolean onDoubleTap(MotionEvent motionevent)
				{
					float f;
					float f1;
					float f2;
					f = getScale();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field PhotoViewAttacher this$0>
				//    2    4:invokevirtual   #28  <Method float PhotoViewAttacher.getScale()>
				//    3    7:fstore_2        
					f1 = motionevent.getX();
				//    4    8:aload_1         
				//    5    9:invokevirtual   #33  <Method float MotionEvent.getX()>
				//    6   12:fstore_3        
					f2 = motionevent.getY();
				//    7   13:aload_1         
				//    8   14:invokevirtual   #36  <Method float MotionEvent.getY()>
				//    9   17:fstore          4
					if(f >= getMediumScale())
						break MISSING_BLOCK_LABEL_51;
				//   10   19:fload_2         
				//   11   20:aload_0         
				//   12   21:getfield        #16  <Field PhotoViewAttacher this$0>
				//   13   24:invokevirtual   #39  <Method float PhotoViewAttacher.getMediumScale()>
				//   14   27:fcmpg           
				//   15   28:ifge            51
					setScale(getMediumScale(), f1, f2, true);
				//   16   31:aload_0         
				//   17   32:getfield        #16  <Field PhotoViewAttacher this$0>
				//   18   35:aload_0         
				//   19   36:getfield        #16  <Field PhotoViewAttacher this$0>
				//   20   39:invokevirtual   #39  <Method float PhotoViewAttacher.getMediumScale()>
				//   21   42:fload_3         
				//   22   43:fload           4
				//   23   45:iconst_1        
				//   24   46:invokevirtual   #43  <Method void PhotoViewAttacher.setScale(float, float, float, boolean)>
					return true;
				//   25   49:iconst_1        
				//   26   50:ireturn         
					if(f < getMediumScale() || f >= getMaximumScale())
						break MISSING_BLOCK_LABEL_95;
				//   27   51:fload_2         
				//   28   52:aload_0         
				//   29   53:getfield        #16  <Field PhotoViewAttacher this$0>
				//   30   56:invokevirtual   #39  <Method float PhotoViewAttacher.getMediumScale()>
				//   31   59:fcmpl           
				//   32   60:iflt            95
				//   33   63:fload_2         
				//   34   64:aload_0         
				//   35   65:getfield        #16  <Field PhotoViewAttacher this$0>
				//   36   68:invokevirtual   #46  <Method float PhotoViewAttacher.getMaximumScale()>
				//   37   71:fcmpg           
				//   38   72:ifge            95
					setScale(getMaximumScale(), f1, f2, true);
				//   39   75:aload_0         
				//   40   76:getfield        #16  <Field PhotoViewAttacher this$0>
				//   41   79:aload_0         
				//   42   80:getfield        #16  <Field PhotoViewAttacher this$0>
				//   43   83:invokevirtual   #46  <Method float PhotoViewAttacher.getMaximumScale()>
				//   44   86:fload_3         
				//   45   87:fload           4
				//   46   89:iconst_1        
				//   47   90:invokevirtual   #43  <Method void PhotoViewAttacher.setScale(float, float, float, boolean)>
					return true;
				//   48   93:iconst_1        
				//   49   94:ireturn         
					try
					{
						setScale(getMinimumScale(), f1, f2, true);
				//   50   95:aload_0         
				//   51   96:getfield        #16  <Field PhotoViewAttacher this$0>
				//   52   99:aload_0         
				//   53  100:getfield        #16  <Field PhotoViewAttacher this$0>
				//   54  103:invokevirtual   #49  <Method float PhotoViewAttacher.getMinimumScale()>
				//   55  106:fload_3         
				//   56  107:fload           4
				//   57  109:iconst_1        
				//   58  110:invokevirtual   #43  <Method void PhotoViewAttacher.setScale(float, float, float, boolean)>
					}
				//*  59  113:iconst_1        
				//*  60  114:ireturn         
					// Misplaced declaration of an exception variable
					catch(MotionEvent motionevent)
				//*  61  115:astore_1        
					{
						return true;
				//   62  116:iconst_1        
				//   63  117:ireturn         
					}
					return true;
				}

				public boolean onDoubleTapEvent(MotionEvent motionevent)
				{
					return false;
				//    0    0:iconst_0        
				//    1    1:ireturn         
				}

				public boolean onSingleTapConfirmed(MotionEvent motionevent)
				{
					if(mOnClickListener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #16  <Field PhotoViewAttacher this$0>
				//*   2    4:invokestatic    #55  <Method android.view.View$OnClickListener PhotoViewAttacher.access$500(PhotoViewAttacher)>
				//*   3    7:ifnull          29
						mOnClickListener.onClick(((View) (mImageView)));
				//    4   10:aload_0         
				//    5   11:getfield        #16  <Field PhotoViewAttacher this$0>
				//    6   14:invokestatic    #55  <Method android.view.View$OnClickListener PhotoViewAttacher.access$500(PhotoViewAttacher)>
				//    7   17:aload_0         
				//    8   18:getfield        #16  <Field PhotoViewAttacher this$0>
				//    9   21:invokestatic    #59  <Method ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
				//   10   24:invokeinterface #65  <Method void android.view.View$OnClickListener.onClick(View)>
					RectF rectf = getDisplayRect();
				//   11   29:aload_0         
				//   12   30:getfield        #16  <Field PhotoViewAttacher this$0>
				//   13   33:invokevirtual   #69  <Method RectF PhotoViewAttacher.getDisplayRect()>
				//   14   36:astore          4
					if(rectf != null)
				//*  15   38:aload           4
				//*  16   40:ifnull          153
					{
						float f1 = motionevent.getX();
				//   17   43:aload_1         
				//   18   44:invokevirtual   #33  <Method float MotionEvent.getX()>
				//   19   47:fstore_3        
						float f = motionevent.getY();
				//   20   48:aload_1         
				//   21   49:invokevirtual   #36  <Method float MotionEvent.getY()>
				//   22   52:fstore_2        
						if(rectf.contains(f1, f))
				//*  23   53:aload           4
				//*  24   55:fload_3         
				//*  25   56:fload_2         
				//*  26   57:invokevirtual   #75  <Method boolean RectF.contains(float, float)>
				//*  27   60:ifeq            124
						{
							f1 = (f1 - rectf.left) / rectf.width();
				//   28   63:fload_3         
				//   29   64:aload           4
				//   30   66:getfield        #79  <Field float RectF.left>
				//   31   69:fsub            
				//   32   70:aload           4
				//   33   72:invokevirtual   #82  <Method float RectF.width()>
				//   34   75:fdiv            
				//   35   76:fstore_3        
							f = (f - rectf.top) / rectf.height();
				//   36   77:fload_2         
				//   37   78:aload           4
				//   38   80:getfield        #85  <Field float RectF.top>
				//   39   83:fsub            
				//   40   84:aload           4
				//   41   86:invokevirtual   #88  <Method float RectF.height()>
				//   42   89:fdiv            
				//   43   90:fstore_2        
							if(mPhotoTapListener != null)
				//*  44   91:aload_0         
				//*  45   92:getfield        #16  <Field PhotoViewAttacher this$0>
				//*  46   95:invokestatic    #92  <Method OnPhotoTapListener PhotoViewAttacher.access$600(PhotoViewAttacher)>
				//*  47   98:ifnull          122
								mPhotoTapListener.onPhotoTap(mImageView, f1, f);
				//   48  101:aload_0         
				//   49  102:getfield        #16  <Field PhotoViewAttacher this$0>
				//   50  105:invokestatic    #92  <Method OnPhotoTapListener PhotoViewAttacher.access$600(PhotoViewAttacher)>
				//   51  108:aload_0         
				//   52  109:getfield        #16  <Field PhotoViewAttacher this$0>
				//   53  112:invokestatic    #59  <Method ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
				//   54  115:fload_3         
				//   55  116:fload_2         
				//   56  117:invokeinterface #98  <Method void OnPhotoTapListener.onPhotoTap(ImageView, float, float)>
							return true;
				//   57  122:iconst_1        
				//   58  123:ireturn         
						}
						if(mOutsidePhotoTapListener != null)
				//*  59  124:aload_0         
				//*  60  125:getfield        #16  <Field PhotoViewAttacher this$0>
				//*  61  128:invokestatic    #102 <Method OnOutsidePhotoTapListener PhotoViewAttacher.access$700(PhotoViewAttacher)>
				//*  62  131:ifnull          153
							mOutsidePhotoTapListener.onOutsidePhotoTap(mImageView);
				//   63  134:aload_0         
				//   64  135:getfield        #16  <Field PhotoViewAttacher this$0>
				//   65  138:invokestatic    #102 <Method OnOutsidePhotoTapListener PhotoViewAttacher.access$700(PhotoViewAttacher)>
				//   66  141:aload_0         
				//   67  142:getfield        #16  <Field PhotoViewAttacher this$0>
				//   68  145:invokestatic    #59  <Method ImageView PhotoViewAttacher.access$100(PhotoViewAttacher)>
				//   69  148:invokeinterface #107 <Method void OnOutsidePhotoTapListener.onOutsidePhotoTap(ImageView)>
					}
					return false;
				//   70  153:iconst_0        
				//   71  154:ireturn         
				}

				final PhotoViewAttacher this$0;

			
			{
				this$0 = PhotoViewAttacher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PhotoViewAttacher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   93  189:aload_0         
	//   94  190:getfield        #183 <Field GestureDetector mGestureDetector>
	//   95  193:new             #14  <Class PhotoViewAttacher$2>
	//   96  196:dup             
	//   97  197:aload_0         
	//   98  198:invokespecial   #184 <Method void PhotoViewAttacher$2(PhotoViewAttacher)>
	//   99  201:invokevirtual   #188 <Method void GestureDetector.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
			return;
	//  100  204:return          
		}
	}

	private void cancelFling()
	{
		FlingRunnable flingrunnable = mCurrentFlingRunnable;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field PhotoViewAttacher$FlingRunnable mCurrentFlingRunnable>
	//    2    4:astore_1        
		if(flingrunnable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          18
		{
			flingrunnable.cancelFling();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #238 <Method void PhotoViewAttacher$FlingRunnable.cancelFling()>
			mCurrentFlingRunnable = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #236 <Field PhotoViewAttacher$FlingRunnable mCurrentFlingRunnable>
		}
	//   10   18:return          
	}

	private void checkAndDisplayMatrix()
	{
		if(checkMatrixBounds())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #242 <Method boolean checkMatrixBounds()>
	//*   2    4:ifeq            15
			setImageViewMatrix(getDrawMatrix());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #201 <Method Matrix getDrawMatrix()>
	//    6   12:invokespecial   #207 <Method void setImageViewMatrix(Matrix)>
	//    7   15:return          
	}

	private boolean checkMatrixBounds()
	{
		RectF rectf = getDisplayRect(getDrawMatrix());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #201 <Method Matrix getDrawMatrix()>
	//    3    5:invokespecial   #246 <Method RectF getDisplayRect(Matrix)>
	//    4    8:astore          5
		if(rectf == null)
	//*   5   10:aload           5
	//*   6   12:ifnonnull       17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		float f = rectf.height();
	//    9   17:aload           5
	//   10   19:invokevirtual   #249 <Method float RectF.height()>
	//   11   22:fstore_1        
		float f2 = rectf.width();
	//   12   23:aload           5
	//   13   25:invokevirtual   #252 <Method float RectF.width()>
	//   14   28:fstore_3        
		float f3 = getImageViewHeight(mImageView);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field ImageView mImageView>
	//   18   34:invokespecial   #256 <Method int getImageViewHeight(ImageView)>
	//   19   37:i2f             
	//   20   38:fstore          4
		float f1 = 0.0F;
	//   21   40:fconst_0        
	//   22   41:fstore_2        
		static class _cls3
		{

			static final int $SwitchMap$android$widget$ImageView$ScaleType[];

			static 
			{
				$SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
			//    0    0:invokestatic    #18  <Method android.widget.ImageView$ScaleType[] android.widget.ImageView$ScaleType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//    5   12:getstatic       #24  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_CENTER>
			//    6   15:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  10   23:getstatic       #31  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_START>
			//*  11   26:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  15   34:getstatic       #34  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_END>
			//*  16   37:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$android$widget$ImageView$ScaleType>
			//*  20   45:getstatic       #37  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.FIT_XY>
			//*  21   48:invokevirtual   #28  <Method int android.widget.ImageView$ScaleType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_START.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_END.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		if(f <= f3)
	//*  23   42:fload_1         
	//*  24   43:fload           4
	//*  25   45:fcmpg           
	//*  26   46:ifgt            124
			switch(_cls3..SwitchMap.android.widget.ImageView.ScaleType[mScaleType.ordinal()])
	//*  27   49:getstatic       #260 <Field int[] PhotoViewAttacher$3.$SwitchMap$android$widget$ImageView$ScaleType>
	//*  28   52:aload_0         
	//*  29   53:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//*  30   56:invokevirtual   #263 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  31   59:iaload          
			{
	//*  32   60:tableswitch     2 3: default 84
	//	               2 114
	//	               3 100
			default:
				f = (f3 - f) / 2.0F - rectf.top;
	//   33   84:fload           4
	//   34   86:fload_1         
	//   35   87:fsub            
	//   36   88:fconst_2        
	//   37   89:fdiv            
	//   38   90:aload           5
	//   39   92:getfield        #266 <Field float RectF.top>
	//   40   95:fsub            
	//   41   96:fstore_1        
				break;

	//*  42   97:goto            169
			case 3: // '\003'
				f = f3 - f - rectf.top;
	//   43  100:fload           4
	//   44  102:fload_1         
	//   45  103:fsub            
	//   46  104:aload           5
	//   47  106:getfield        #266 <Field float RectF.top>
	//   48  109:fsub            
	//   49  110:fstore_1        
				break;

	//*  50  111:goto            169
			case 2: // '\002'
				f = -rectf.top;
	//   51  114:aload           5
	//   52  116:getfield        #266 <Field float RectF.top>
	//   53  119:fneg            
	//   54  120:fstore_1        
				break;
			}
		else
	//*  55  121:goto            169
		if(rectf.top > 0.0F)
	//*  56  124:aload           5
	//*  57  126:getfield        #266 <Field float RectF.top>
	//*  58  129:fconst_0        
	//*  59  130:fcmpl           
	//*  60  131:ifle            144
			f = -rectf.top;
	//   61  134:aload           5
	//   62  136:getfield        #266 <Field float RectF.top>
	//   63  139:fneg            
	//   64  140:fstore_1        
		else
	//*  65  141:goto            169
		if(rectf.bottom < f3)
	//*  66  144:aload           5
	//*  67  146:getfield        #269 <Field float RectF.bottom>
	//*  68  149:fload           4
	//*  69  151:fcmpg           
	//*  70  152:ifge            167
			f = f3 - rectf.bottom;
	//   71  155:fload           4
	//   72  157:aload           5
	//   73  159:getfield        #269 <Field float RectF.bottom>
	//   74  162:fsub            
	//   75  163:fstore_1        
		else
	//*  76  164:goto            169
			f = 0.0F;
	//   77  167:fconst_0        
	//   78  168:fstore_1        
		f3 = getImageViewWidth(mImageView);
	//   79  169:aload_0         
	//   80  170:aload_0         
	//   81  171:getfield        #146 <Field ImageView mImageView>
	//   82  174:invokespecial   #272 <Method int getImageViewWidth(ImageView)>
	//   83  177:i2f             
	//   84  178:fstore          4
		if(f2 <= f3)
	//*  85  180:fload_3         
	//*  86  181:fload           4
	//*  87  183:fcmpg           
	//*  88  184:ifgt            265
		{
			switch(_cls3..SwitchMap.android.widget.ImageView.ScaleType[mScaleType.ordinal()])
	//*  89  187:getstatic       #260 <Field int[] PhotoViewAttacher$3.$SwitchMap$android$widget$ImageView$ScaleType>
	//*  90  190:aload_0         
	//*  91  191:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//*  92  194:invokevirtual   #263 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//*  93  197:iaload          
			{
	//*  94  198:tableswitch     2 3: default 220
	//	               2 250
	//	               3 236
			default:
				f1 = (f3 - f2) / 2.0F - rectf.left;
	//   95  220:fload           4
	//   96  222:fload_3         
	//   97  223:fsub            
	//   98  224:fconst_2        
	//   99  225:fdiv            
	//  100  226:aload           5
	//  101  228:getfield        #275 <Field float RectF.left>
	//  102  231:fsub            
	//  103  232:fstore_2        
				break;

	//* 104  233:goto            257
			case 3: // '\003'
				f1 = f3 - f2 - rectf.left;
	//  105  236:fload           4
	//  106  238:fload_3         
	//  107  239:fsub            
	//  108  240:aload           5
	//  109  242:getfield        #275 <Field float RectF.left>
	//  110  245:fsub            
	//  111  246:fstore_2        
				break;

	//* 112  247:goto            257
			case 2: // '\002'
				f1 = -rectf.left;
	//  113  250:aload           5
	//  114  252:getfield        #275 <Field float RectF.left>
	//  115  255:fneg            
	//  116  256:fstore_2        
				break;
			}
			mScrollEdge = 2;
	//  117  257:aload_0         
	//  118  258:iconst_2        
	//  119  259:putfield        #135 <Field int mScrollEdge>
		} else
	//* 120  262:goto            323
		if(rectf.left > 0.0F)
	//* 121  265:aload           5
	//* 122  267:getfield        #275 <Field float RectF.left>
	//* 123  270:fconst_0        
	//* 124  271:fcmpl           
	//* 125  272:ifle            290
		{
			mScrollEdge = 0;
	//  126  275:aload_0         
	//  127  276:iconst_0        
	//  128  277:putfield        #135 <Field int mScrollEdge>
			f1 = -rectf.left;
	//  129  280:aload           5
	//  130  282:getfield        #275 <Field float RectF.left>
	//  131  285:fneg            
	//  132  286:fstore_2        
		} else
	//* 133  287:goto            323
		if(rectf.right < f3)
	//* 134  290:aload           5
	//* 135  292:getfield        #278 <Field float RectF.right>
	//* 136  295:fload           4
	//* 137  297:fcmpg           
	//* 138  298:ifge            318
		{
			f1 = f3 - rectf.right;
	//  139  301:fload           4
	//  140  303:aload           5
	//  141  305:getfield        #278 <Field float RectF.right>
	//  142  308:fsub            
	//  143  309:fstore_2        
			mScrollEdge = 1;
	//  144  310:aload_0         
	//  145  311:iconst_1        
	//  146  312:putfield        #135 <Field int mScrollEdge>
		} else
	//* 147  315:goto            323
		{
			mScrollEdge = -1;
	//  148  318:aload_0         
	//  149  319:iconst_m1       
	//  150  320:putfield        #135 <Field int mScrollEdge>
		}
		mSuppMatrix.postTranslate(f1, f);
	//  151  323:aload_0         
	//  152  324:getfield        #126 <Field Matrix mSuppMatrix>
	//  153  327:fload_2         
	//  154  328:fload_1         
	//  155  329:invokevirtual   #282 <Method boolean Matrix.postTranslate(float, float)>
	//  156  332:pop             
		return true;
	//  157  333:iconst_1        
	//  158  334:ireturn         
	}

	private RectF getDisplayRect(Matrix matrix)
	{
		Drawable drawable = mImageView.getDrawable();
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ImageView mImageView>
	//    2    4:invokevirtual   #286 <Method Drawable ImageView.getDrawable()>
	//    3    7:astore_2        
		if(drawable != null)
	//*   4    8:aload_2         
	//*   5    9:ifnull          45
		{
			mDisplayRect.set(0.0F, 0.0F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
	//    6   12:aload_0         
	//    7   13:getfield        #131 <Field RectF mDisplayRect>
	//    8   16:fconst_0        
	//    9   17:fconst_0        
	//   10   18:aload_2         
	//   11   19:invokevirtual   #291 <Method int Drawable.getIntrinsicWidth()>
	//   12   22:i2f             
	//   13   23:aload_2         
	//   14   24:invokevirtual   #294 <Method int Drawable.getIntrinsicHeight()>
	//   15   27:i2f             
	//   16   28:invokevirtual   #298 <Method void RectF.set(float, float, float, float)>
			matrix.mapRect(mDisplayRect);
	//   17   31:aload_1         
	//   18   32:aload_0         
	//   19   33:getfield        #131 <Field RectF mDisplayRect>
	//   20   36:invokevirtual   #302 <Method boolean Matrix.mapRect(RectF)>
	//   21   39:pop             
			return mDisplayRect;
	//   22   40:aload_0         
	//   23   41:getfield        #131 <Field RectF mDisplayRect>
	//   24   44:areturn         
		} else
		{
			return null;
	//   25   45:aconst_null     
	//   26   46:areturn         
		}
	}

	private Matrix getDrawMatrix()
	{
		mDrawMatrix.set(mBaseMatrix);
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Matrix mDrawMatrix>
	//    2    4:aload_0         
	//    3    5:getfield        #122 <Field Matrix mBaseMatrix>
	//    4    8:invokevirtual   #304 <Method void Matrix.set(Matrix)>
		mDrawMatrix.postConcat(mSuppMatrix);
	//    5   11:aload_0         
	//    6   12:getfield        #124 <Field Matrix mDrawMatrix>
	//    7   15:aload_0         
	//    8   16:getfield        #126 <Field Matrix mSuppMatrix>
	//    9   19:invokevirtual   #308 <Method boolean Matrix.postConcat(Matrix)>
	//   10   22:pop             
		return mDrawMatrix;
	//   11   23:aload_0         
	//   12   24:getfield        #124 <Field Matrix mDrawMatrix>
	//   13   27:areturn         
	}

	private int getImageViewHeight(ImageView imageview)
	{
		return imageview.getHeight() - imageview.getPaddingTop() - imageview.getPaddingBottom();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #311 <Method int ImageView.getHeight()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #314 <Method int ImageView.getPaddingTop()>
	//    4    8:isub            
	//    5    9:aload_1         
	//    6   10:invokevirtual   #317 <Method int ImageView.getPaddingBottom()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	private int getImageViewWidth(ImageView imageview)
	{
		return imageview.getWidth() - imageview.getPaddingLeft() - imageview.getPaddingRight();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #320 <Method int ImageView.getWidth()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #323 <Method int ImageView.getPaddingLeft()>
	//    4    8:isub            
	//    5    9:aload_1         
	//    6   10:invokevirtual   #326 <Method int ImageView.getPaddingRight()>
	//    7   13:isub            
	//    8   14:ireturn         
	}

	private float getValue(Matrix matrix, int i)
	{
		matrix.getValues(mMatrixValues);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #133 <Field float[] mMatrixValues>
	//    3    5:invokevirtual   #332 <Method void Matrix.getValues(float[])>
		return mMatrixValues[i];
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field float[] mMatrixValues>
	//    6   12:iload_2         
	//    7   13:faload          
	//    8   14:freturn         
	}

	private void resetMatrix()
	{
		mSuppMatrix.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Matrix mSuppMatrix>
	//    2    4:invokevirtual   #336 <Method void Matrix.reset()>
		setRotationBy(mBaseRotation);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #162 <Field float mBaseRotation>
	//    6   12:invokevirtual   #340 <Method void setRotationBy(float)>
		setImageViewMatrix(getDrawMatrix());
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #201 <Method Matrix getDrawMatrix()>
	//   10   20:invokespecial   #207 <Method void setImageViewMatrix(Matrix)>
		checkMatrixBounds();
	//   11   23:aload_0         
	//   12   24:invokespecial   #242 <Method boolean checkMatrixBounds()>
	//   13   27:pop             
	//   14   28:return          
	}

	private void setImageViewMatrix(Matrix matrix)
	{
		mImageView.setImageMatrix(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ImageView mImageView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #343 <Method void ImageView.setImageMatrix(Matrix)>
		if(mMatrixChangeListener != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #345 <Field OnMatrixChangedListener mMatrixChangeListener>
	//*   6   12:ifnull          35
		{
			matrix = ((Matrix) (getDisplayRect(matrix)));
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:invokespecial   #246 <Method RectF getDisplayRect(Matrix)>
	//   10   20:astore_1        
			if(matrix != null)
	//*  11   21:aload_1         
	//*  12   22:ifnull          35
				mMatrixChangeListener.onMatrixChanged(((RectF) (matrix)));
	//   13   25:aload_0         
	//   14   26:getfield        #345 <Field OnMatrixChangedListener mMatrixChangeListener>
	//   15   29:aload_1         
	//   16   30:invokeinterface #351 <Method void OnMatrixChangedListener.onMatrixChanged(RectF)>
		}
	//   17   35:return          
	}

	private void updateBaseMatrix(Drawable drawable)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		float f = getImageViewWidth(mImageView);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #146 <Field ImageView mImageView>
	//    6   10:invokespecial   #272 <Method int getImageViewWidth(ImageView)>
	//    7   13:i2f             
	//    8   14:fstore_2        
		float f1 = getImageViewHeight(mImageView);
	//    9   15:aload_0         
	//   10   16:aload_0         
	//   11   17:getfield        #146 <Field ImageView mImageView>
	//   12   20:invokespecial   #256 <Method int getImageViewHeight(ImageView)>
	//   13   23:i2f             
	//   14   24:fstore_3        
		int i = drawable.getIntrinsicWidth();
	//   15   25:aload_1         
	//   16   26:invokevirtual   #291 <Method int Drawable.getIntrinsicWidth()>
	//   17   29:istore          8
		int j = drawable.getIntrinsicHeight();
	//   18   31:aload_1         
	//   19   32:invokevirtual   #294 <Method int Drawable.getIntrinsicHeight()>
	//   20   35:istore          9
		mBaseMatrix.reset();
	//   21   37:aload_0         
	//   22   38:getfield        #122 <Field Matrix mBaseMatrix>
	//   23   41:invokevirtual   #336 <Method void Matrix.reset()>
		float f2 = i;
	//   24   44:iload           8
	//   25   46:i2f             
	//   26   47:fstore          4
		float f4 = f / f2;
	//   27   49:fload_2         
	//   28   50:fload           4
	//   29   52:fdiv            
	//   30   53:fstore          6
		float f3 = j;
	//   31   55:iload           9
	//   32   57:i2f             
	//   33   58:fstore          5
		float f5 = f1 / f3;
	//   34   60:fload_3         
	//   35   61:fload           5
	//   36   63:fdiv            
	//   37   64:fstore          7
		if(mScaleType == android.widget.ImageView.ScaleType.CENTER)
	//*  38   66:aload_0         
	//*  39   67:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//*  40   70:getstatic       #356 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER>
	//*  41   73:if_acmpne       99
			mBaseMatrix.postTranslate((f - f2) / 2.0F, (f1 - f3) / 2.0F);
	//   42   76:aload_0         
	//   43   77:getfield        #122 <Field Matrix mBaseMatrix>
	//   44   80:fload_2         
	//   45   81:fload           4
	//   46   83:fsub            
	//   47   84:fconst_2        
	//   48   85:fdiv            
	//   49   86:fload_3         
	//   50   87:fload           5
	//   51   89:fsub            
	//   52   90:fconst_2        
	//   53   91:fdiv            
	//   54   92:invokevirtual   #282 <Method boolean Matrix.postTranslate(float, float)>
	//   55   95:pop             
		else
	//*  56   96:goto            384
		if(mScaleType == android.widget.ImageView.ScaleType.CENTER_CROP)
	//*  57   99:aload_0         
	//*  58  100:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//*  59  103:getstatic       #359 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_CROP>
	//*  60  106:if_acmpne       159
		{
			f4 = Math.max(f4, f5);
	//   61  109:fload           6
	//   62  111:fload           7
	//   63  113:invokestatic    #365 <Method float Math.max(float, float)>
	//   64  116:fstore          6
			mBaseMatrix.postScale(f4, f4);
	//   65  118:aload_0         
	//   66  119:getfield        #122 <Field Matrix mBaseMatrix>
	//   67  122:fload           6
	//   68  124:fload           6
	//   69  126:invokevirtual   #368 <Method boolean Matrix.postScale(float, float)>
	//   70  129:pop             
			mBaseMatrix.postTranslate((f - f2 * f4) / 2.0F, (f1 - f3 * f4) / 2.0F);
	//   71  130:aload_0         
	//   72  131:getfield        #122 <Field Matrix mBaseMatrix>
	//   73  134:fload_2         
	//   74  135:fload           4
	//   75  137:fload           6
	//   76  139:fmul            
	//   77  140:fsub            
	//   78  141:fconst_2        
	//   79  142:fdiv            
	//   80  143:fload_3         
	//   81  144:fload           5
	//   82  146:fload           6
	//   83  148:fmul            
	//   84  149:fsub            
	//   85  150:fconst_2        
	//   86  151:fdiv            
	//   87  152:invokevirtual   #282 <Method boolean Matrix.postTranslate(float, float)>
	//   88  155:pop             
		} else
	//*  89  156:goto            384
		if(mScaleType == android.widget.ImageView.ScaleType.CENTER_INSIDE)
	//*  90  159:aload_0         
	//*  91  160:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//*  92  163:getstatic       #371 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.CENTER_INSIDE>
	//*  93  166:if_acmpne       223
		{
			f4 = Math.min(1.0F, Math.min(f4, f5));
	//   94  169:fconst_1        
	//   95  170:fload           6
	//   96  172:fload           7
	//   97  174:invokestatic    #374 <Method float Math.min(float, float)>
	//   98  177:invokestatic    #374 <Method float Math.min(float, float)>
	//   99  180:fstore          6
			mBaseMatrix.postScale(f4, f4);
	//  100  182:aload_0         
	//  101  183:getfield        #122 <Field Matrix mBaseMatrix>
	//  102  186:fload           6
	//  103  188:fload           6
	//  104  190:invokevirtual   #368 <Method boolean Matrix.postScale(float, float)>
	//  105  193:pop             
			mBaseMatrix.postTranslate((f - f2 * f4) / 2.0F, (f1 - f3 * f4) / 2.0F);
	//  106  194:aload_0         
	//  107  195:getfield        #122 <Field Matrix mBaseMatrix>
	//  108  198:fload_2         
	//  109  199:fload           4
	//  110  201:fload           6
	//  111  203:fmul            
	//  112  204:fsub            
	//  113  205:fconst_2        
	//  114  206:fdiv            
	//  115  207:fload_3         
	//  116  208:fload           5
	//  117  210:fload           6
	//  118  212:fmul            
	//  119  213:fsub            
	//  120  214:fconst_2        
	//  121  215:fdiv            
	//  122  216:invokevirtual   #282 <Method boolean Matrix.postTranslate(float, float)>
	//  123  219:pop             
		} else
	//* 124  220:goto            384
		{
			drawable = ((Drawable) (new RectF(0.0F, 0.0F, f2, f3)));
	//  125  223:new             #128 <Class RectF>
	//  126  226:dup             
	//  127  227:fconst_0        
	//  128  228:fconst_0        
	//  129  229:fload           4
	//  130  231:fload           5
	//  131  233:invokespecial   #376 <Method void RectF(float, float, float, float)>
	//  132  236:astore_1        
			RectF rectf = new RectF(0.0F, 0.0F, f, f1);
	//  133  237:new             #128 <Class RectF>
	//  134  240:dup             
	//  135  241:fconst_0        
	//  136  242:fconst_0        
	//  137  243:fload_2         
	//  138  244:fload_3         
	//  139  245:invokespecial   #376 <Method void RectF(float, float, float, float)>
	//  140  248:astore          10
			if((int)mBaseRotation % 180 != 0)
	//* 141  250:aload_0         
	//* 142  251:getfield        #162 <Field float mBaseRotation>
	//* 143  254:f2i             
	//* 144  255:sipush          180
	//* 145  258:irem            
	//* 146  259:ifeq            276
				drawable = ((Drawable) (new RectF(0.0F, 0.0F, f3, f2)));
	//  147  262:new             #128 <Class RectF>
	//  148  265:dup             
	//  149  266:fconst_0        
	//  150  267:fconst_0        
	//  151  268:fload           5
	//  152  270:fload           4
	//  153  272:invokespecial   #376 <Method void RectF(float, float, float, float)>
	//  154  275:astore_1        
			switch(_cls3..SwitchMap.android.widget.ImageView.ScaleType[mScaleType.ordinal()])
	//* 155  276:getstatic       #260 <Field int[] PhotoViewAttacher$3.$SwitchMap$android$widget$ImageView$ScaleType>
	//* 156  279:aload_0         
	//* 157  280:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//* 158  283:invokevirtual   #263 <Method int android.widget.ImageView$ScaleType.ordinal()>
	//* 159  286:iaload          
			{
	//* 160  287:tableswitch     1 4: default 316
	//	               1 370
	//	               2 353
	//	               3 336
	//	               4 319
	//* 161  316:goto            384
			case 4: // '\004'
				mBaseMatrix.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.FILL);
	//  162  319:aload_0         
	//  163  320:getfield        #122 <Field Matrix mBaseMatrix>
	//  164  323:aload_1         
	//  165  324:aload           10
	//  166  326:getstatic       #382 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.FILL>
	//  167  329:invokevirtual   #386 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  168  332:pop             
				break;

	//* 169  333:goto            384
			case 3: // '\003'
				mBaseMatrix.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.END);
	//  170  336:aload_0         
	//  171  337:getfield        #122 <Field Matrix mBaseMatrix>
	//  172  340:aload_1         
	//  173  341:aload           10
	//  174  343:getstatic       #389 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.END>
	//  175  346:invokevirtual   #386 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  176  349:pop             
				break;

	//* 177  350:goto            384
			case 2: // '\002'
				mBaseMatrix.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.START);
	//  178  353:aload_0         
	//  179  354:getfield        #122 <Field Matrix mBaseMatrix>
	//  180  357:aload_1         
	//  181  358:aload           10
	//  182  360:getstatic       #392 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.START>
	//  183  363:invokevirtual   #386 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  184  366:pop             
				break;

	//* 185  367:goto            384
			case 1: // '\001'
				mBaseMatrix.setRectToRect(((RectF) (drawable)), rectf, android.graphics.Matrix.ScaleToFit.CENTER);
	//  186  370:aload_0         
	//  187  371:getfield        #122 <Field Matrix mBaseMatrix>
	//  188  374:aload_1         
	//  189  375:aload           10
	//  190  377:getstatic       #394 <Field android.graphics.Matrix$ScaleToFit android.graphics.Matrix$ScaleToFit.CENTER>
	//  191  380:invokevirtual   #386 <Method boolean Matrix.setRectToRect(RectF, RectF, android.graphics.Matrix$ScaleToFit)>
	//  192  383:pop             
				break;
			}
		}
		resetMatrix();
	//  193  384:aload_0         
	//  194  385:invokespecial   #396 <Method void resetMatrix()>
	//  195  388:return          
	}

	public void getDisplayMatrix(Matrix matrix)
	{
		matrix.set(getDrawMatrix());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokespecial   #201 <Method Matrix getDrawMatrix()>
	//    3    5:invokevirtual   #304 <Method void Matrix.set(Matrix)>
	//    4    8:return          
	}

	public RectF getDisplayRect()
	{
		checkMatrixBounds();
	//    0    0:aload_0         
	//    1    1:invokespecial   #242 <Method boolean checkMatrixBounds()>
	//    2    4:pop             
		return getDisplayRect(getDrawMatrix());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #201 <Method Matrix getDrawMatrix()>
	//    6   10:invokespecial   #246 <Method RectF getDisplayRect(Matrix)>
	//    7   13:areturn         
	}

	public Matrix getImageMatrix()
	{
		return mDrawMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #124 <Field Matrix mDrawMatrix>
	//    2    4:areturn         
	}

	public float getMaximumScale()
	{
		return mMaxScale;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field float mMaxScale>
	//    2    4:freturn         
	}

	public float getMediumScale()
	{
		return mMidScale;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field float mMidScale>
	//    2    4:freturn         
	}

	public float getMinimumScale()
	{
		return mMinScale;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field float mMinScale>
	//    2    4:freturn         
	}

	public float getScale()
	{
		return (float)Math.sqrt((float)Math.pow(getValue(mSuppMatrix, 0), 2D) + (float)Math.pow(getValue(mSuppMatrix, 3), 2D));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #126 <Field Matrix mSuppMatrix>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #405 <Method float getValue(Matrix, int)>
	//    5    9:f2d             
	//    6   10:ldc2w           #406 <Double 2D>
	//    7   13:invokestatic    #411 <Method double Math.pow(double, double)>
	//    8   16:d2f             
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #126 <Field Matrix mSuppMatrix>
	//   12   22:iconst_3        
	//   13   23:invokespecial   #405 <Method float getValue(Matrix, int)>
	//   14   26:f2d             
	//   15   27:ldc2w           #406 <Double 2D>
	//   16   30:invokestatic    #411 <Method double Math.pow(double, double)>
	//   17   33:d2f             
	//   18   34:fadd            
	//   19   35:f2d             
	//   20   36:invokestatic    #415 <Method double Math.sqrt(double)>
	//   21   39:d2f             
	//   22   40:freturn         
	}

	public android.widget.ImageView.ScaleType getScaleType()
	{
		return mScaleType;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//    2    4:areturn         
	}

	public void getSuppMatrix(Matrix matrix)
	{
		matrix.set(mSuppMatrix);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #126 <Field Matrix mSuppMatrix>
	//    3    5:invokevirtual   #304 <Method void Matrix.set(Matrix)>
	//    4    8:return          
	}

	public boolean isZoomEnabled()
	{
		return mZoomEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field boolean mZoomEnabled>
	//    2    4:ireturn         
	}

	public void onDrag(float f, float f1)
	{
		if(mScaleDragDetector.isScaling())
	//*   0    0:aload_0         
	//*   1    1:getfield        #173 <Field CustomGestureDetector mScaleDragDetector>
	//*   2    4:invokevirtual   #424 <Method boolean CustomGestureDetector.isScaling()>
	//*   3    7:ifeq            11
			return;
	//    4   10:return          
		mSuppMatrix.postTranslate(f, f1);
	//    5   11:aload_0         
	//    6   12:getfield        #126 <Field Matrix mSuppMatrix>
	//    7   15:fload_1         
	//    8   16:fload_2         
	//    9   17:invokevirtual   #282 <Method boolean Matrix.postTranslate(float, float)>
	//   10   20:pop             
		checkAndDisplayMatrix();
	//   11   21:aload_0         
	//   12   22:invokespecial   #426 <Method void checkAndDisplayMatrix()>
		ViewParent viewparent = mImageView.getParent();
	//   13   25:aload_0         
	//   14   26:getfield        #146 <Field ImageView mImageView>
	//   15   29:invokevirtual   #430 <Method ViewParent ImageView.getParent()>
	//   16   32:astore          4
		if(mAllowParentInterceptOnEdge && !mScaleDragDetector.isScaling() && !mBlockParentIntercept)
	//*  17   34:aload_0         
	//*  18   35:getfield        #115 <Field boolean mAllowParentInterceptOnEdge>
	//*  19   38:ifeq            108
	//*  20   41:aload_0         
	//*  21   42:getfield        #173 <Field CustomGestureDetector mScaleDragDetector>
	//*  22   45:invokevirtual   #424 <Method boolean CustomGestureDetector.isScaling()>
	//*  23   48:ifne            108
	//*  24   51:aload_0         
	//*  25   52:getfield        #117 <Field boolean mBlockParentIntercept>
	//*  26   55:ifne            108
		{
			int i = mScrollEdge;
	//   27   58:aload_0         
	//   28   59:getfield        #135 <Field int mScrollEdge>
	//   29   62:istore_3        
			if((i == 2 || i == 0 && f >= 1.0F || mScrollEdge == 1 && f <= -1F) && viewparent != null)
	//*  30   63:iload_3         
	//*  31   64:iconst_2        
	//*  32   65:icmpeq          94
	//*  33   68:iload_3         
	//*  34   69:ifne            78
	//*  35   72:fload_1         
	//*  36   73:fconst_1        
	//*  37   74:fcmpl           
	//*  38   75:ifge            94
	//*  39   78:aload_0         
	//*  40   79:getfield        #135 <Field int mScrollEdge>
	//*  41   82:iconst_1        
	//*  42   83:icmpne          121
	//*  43   86:fload_1         
	//*  44   87:ldc2            #431 <Float -1F>
	//*  45   90:fcmpg           
	//*  46   91:ifgt            121
	//*  47   94:aload           4
	//*  48   96:ifnull          121
			{
				viewparent.requestDisallowInterceptTouchEvent(false);
	//   49   99:aload           4
	//   50  101:iconst_0        
	//   51  102:invokeinterface #437 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
				return;
	//   52  107:return          
			}
		} else
		if(viewparent != null)
	//*  53  108:aload           4
	//*  54  110:ifnull          121
			viewparent.requestDisallowInterceptTouchEvent(true);
	//   55  113:aload           4
	//   56  115:iconst_1        
	//   57  116:invokeinterface #437 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
	//   58  121:return          
	}

	public void onFling(float f, float f1, float f2, float f3)
	{
		mCurrentFlingRunnable = new FlingRunnable(mImageView.getContext());
	//    0    0:aload_0         
	//    1    1:new             #21  <Class PhotoViewAttacher$FlingRunnable>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #146 <Field ImageView mImageView>
	//    6   10:invokevirtual   #168 <Method Context ImageView.getContext()>
	//    7   13:invokespecial   #441 <Method void PhotoViewAttacher$FlingRunnable(PhotoViewAttacher, Context)>
	//    8   16:putfield        #236 <Field PhotoViewAttacher$FlingRunnable mCurrentFlingRunnable>
		mCurrentFlingRunnable.fling(getImageViewWidth(mImageView), getImageViewHeight(mImageView), (int)f2, (int)f3);
	//    9   19:aload_0         
	//   10   20:getfield        #236 <Field PhotoViewAttacher$FlingRunnable mCurrentFlingRunnable>
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:getfield        #146 <Field ImageView mImageView>
	//   14   28:invokespecial   #272 <Method int getImageViewWidth(ImageView)>
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #146 <Field ImageView mImageView>
	//   18   36:invokespecial   #256 <Method int getImageViewHeight(ImageView)>
	//   19   39:fload_3         
	//   20   40:f2i             
	//   21   41:fload           4
	//   22   43:f2i             
	//   23   44:invokevirtual   #445 <Method void PhotoViewAttacher$FlingRunnable.fling(int, int, int, int)>
		mImageView.post(((Runnable) (mCurrentFlingRunnable)));
	//   24   47:aload_0         
	//   25   48:getfield        #146 <Field ImageView mImageView>
	//   26   51:aload_0         
	//   27   52:getfield        #236 <Field PhotoViewAttacher$FlingRunnable mCurrentFlingRunnable>
	//   28   55:invokevirtual   #449 <Method boolean ImageView.post(Runnable)>
	//   29   58:pop             
	//   30   59:return          
	}

	public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
			int k1, int l1)
	{
		updateBaseMatrix(mImageView.getDrawable());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #146 <Field ImageView mImageView>
	//    3    5:invokevirtual   #286 <Method Drawable ImageView.getDrawable()>
	//    4    8:invokespecial   #453 <Method void updateBaseMatrix(Drawable)>
	//    5   11:return          
	}

	public void onScale(float f, float f1, float f2)
	{
		if((getScale() < mMaxScale || f < 1.0F) && (getScale() > mMinScale || f > 1.0F))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #457 <Method float getScale()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #113 <Field float mMaxScale>
	//*   4    8:fcmpg           
	//*   5    9:iflt            18
	//*   6   12:fload_1         
	//*   7   13:fconst_1        
	//*   8   14:fcmpg           
	//*   9   15:ifge            73
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #457 <Method float getScale()>
	//*  12   22:aload_0         
	//*  13   23:getfield        #105 <Field float mMinScale>
	//*  14   26:fcmpl           
	//*  15   27:ifgt            36
	//*  16   30:fload_1         
	//*  17   31:fconst_1        
	//*  18   32:fcmpl           
	//*  19   33:ifle            73
		{
			OnScaleChangedListener onscalechangedlistener = mScaleChangeListener;
	//   20   36:aload_0         
	//   21   37:getfield        #459 <Field OnScaleChangedListener mScaleChangeListener>
	//   22   40:astore          4
			if(onscalechangedlistener != null)
	//*  23   42:aload           4
	//*  24   44:ifnull          57
				onscalechangedlistener.onScaleChange(f, f1, f2);
	//   25   47:aload           4
	//   26   49:fload_1         
	//   27   50:fload_2         
	//   28   51:fload_3         
	//   29   52:invokeinterface #464 <Method void OnScaleChangedListener.onScaleChange(float, float, float)>
			mSuppMatrix.postScale(f, f, f1, f2);
	//   30   57:aload_0         
	//   31   58:getfield        #126 <Field Matrix mSuppMatrix>
	//   32   61:fload_1         
	//   33   62:fload_1         
	//   34   63:fload_2         
	//   35   64:fload_3         
	//   36   65:invokevirtual   #467 <Method boolean Matrix.postScale(float, float, float, float)>
	//   37   68:pop             
			checkAndDisplayMatrix();
	//   38   69:aload_0         
	//   39   70:invokespecial   #426 <Method void checkAndDisplayMatrix()>
		}
	//   40   73:return          
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		int i;
		boolean flag2;
		boolean flag3;
		boolean flag6 = mZoomEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field boolean mZoomEnabled>
	//    2    4:istore          8
		boolean flag4 = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		flag3 = false;
	//    5    9:iconst_0        
	//    6   10:istore          6
		flag2 = flag4;
	//    7   12:iload           7
	//    8   14:istore          5
		if(!flag6)
			break MISSING_BLOCK_LABEL_302;
	//    9   16:iload           8
	//   10   18:ifeq            302
		flag2 = flag4;
	//   11   21:iload           7
	//   12   23:istore          5
		if(!Util.hasDrawable((ImageView)view))
			break MISSING_BLOCK_LABEL_302;
	//   13   25:aload_1         
	//   14   26:checkcast       #148 <Class ImageView>
	//   15   29:invokestatic    #475 <Method boolean Util.hasDrawable(ImageView)>
	//   16   32:ifeq            302
		i = motionevent.getAction();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #480 <Method int MotionEvent.getAction()>
	//   19   39:istore_3        
		if(i == 3) goto _L2; else goto _L1
	//   20   40:iload_3         
	//   21   41:iconst_3        
	//   22   42:icmpeq          94
_L1:
		i;
	//   23   45:iload_3         
		JVM INSTR tableswitch 0 1: default 68
	//	               0 71
	//	               1 94;
	//   24   46:tableswitch     0 1: default 68
	//	               0 71
	//	               1 94
		   goto _L3 _L4 _L2
	//*  25   68:goto            154
_L4:
		view = ((View) (view.getParent()));
	//   26   71:aload_1         
	//   27   72:invokevirtual   #483 <Method ViewParent View.getParent()>
	//   28   75:astore_1        
		if(view != null)
	//*  29   76:aload_1         
	//*  30   77:ifnull          87
			((ViewParent) (view)).requestDisallowInterceptTouchEvent(true);
	//   31   80:aload_1         
	//   32   81:iconst_1        
	//   33   82:invokeinterface #437 <Method void ViewParent.requestDisallowInterceptTouchEvent(boolean)>
		cancelFling();
	//   34   87:aload_0         
	//   35   88:invokespecial   #484 <Method void cancelFling()>
		  goto _L3
	//*  36   91:goto            154
_L2:
		if(getScale() >= mMinScale) goto _L3; else goto _L5
	//   37   94:aload_0         
	//   38   95:invokevirtual   #457 <Method float getScale()>
	//   39   98:aload_0         
	//   40   99:getfield        #105 <Field float mMinScale>
	//   41  102:fcmpg           
	//   42  103:ifge            154
_L5:
		RectF rectf = getDisplayRect();
	//   43  106:aload_0         
	//   44  107:invokevirtual   #486 <Method RectF getDisplayRect()>
	//   45  110:astore          9
		if(rectf == null) goto _L3; else goto _L6
	//   46  112:aload           9
	//   47  114:ifnull          154
_L6:
		view.post(((Runnable) (new AnimatedZoomRunnable(getScale(), mMinScale, rectf.centerX(), rectf.centerY()))));
	//   48  117:aload_1         
	//   49  118:new             #18  <Class PhotoViewAttacher$AnimatedZoomRunnable>
	//   50  121:dup             
	//   51  122:aload_0         
	//   52  123:aload_0         
	//   53  124:invokevirtual   #457 <Method float getScale()>
	//   54  127:aload_0         
	//   55  128:getfield        #105 <Field float mMinScale>
	//   56  131:aload           9
	//   57  133:invokevirtual   #489 <Method float RectF.centerX()>
	//   58  136:aload           9
	//   59  138:invokevirtual   #492 <Method float RectF.centerY()>
	//   60  141:invokespecial   #495 <Method void PhotoViewAttacher$AnimatedZoomRunnable(PhotoViewAttacher, float, float, float, float)>
	//   61  144:invokevirtual   #496 <Method boolean View.post(Runnable)>
	//   62  147:pop             
		flag2 = true;
	//   63  148:iconst_1        
	//   64  149:istore          5
		  goto _L7
	//*  65  151:goto            157
_L3:
		flag2 = false;
	//   66  154:iconst_0        
	//   67  155:istore          5
_L7:
		view = ((View) (mScaleDragDetector));
	//   68  157:aload_0         
	//   69  158:getfield        #173 <Field CustomGestureDetector mScaleDragDetector>
	//   70  161:astore_1        
		if(view != null)
	//*  71  162:aload_1         
	//*  72  163:ifnull          270
		{
			flag2 = ((CustomGestureDetector) (view)).isScaling();
	//   73  166:aload_1         
	//   74  167:invokevirtual   #424 <Method boolean CustomGestureDetector.isScaling()>
	//   75  170:istore          5
			boolean flag7 = mScaleDragDetector.isDragging();
	//   76  172:aload_0         
	//   77  173:getfield        #173 <Field CustomGestureDetector mScaleDragDetector>
	//   78  176:invokevirtual   #499 <Method boolean CustomGestureDetector.isDragging()>
	//   79  179:istore          8
			boolean flag5 = mScaleDragDetector.onTouchEvent(motionevent);
	//   80  181:aload_0         
	//   81  182:getfield        #173 <Field CustomGestureDetector mScaleDragDetector>
	//   82  185:aload_2         
	//   83  186:invokevirtual   #503 <Method boolean CustomGestureDetector.onTouchEvent(MotionEvent)>
	//   84  189:istore          7
			boolean flag;
			if(!flag2 && !mScaleDragDetector.isScaling())
	//*  85  191:iload           5
	//*  86  193:ifne            211
	//*  87  196:aload_0         
	//*  88  197:getfield        #173 <Field CustomGestureDetector mScaleDragDetector>
	//*  89  200:invokevirtual   #424 <Method boolean CustomGestureDetector.isScaling()>
	//*  90  203:ifne            211
				flag = true;
	//   91  206:iconst_1        
	//   92  207:istore_3        
			else
	//*  93  208:goto            213
				flag = false;
	//   94  211:iconst_0        
	//   95  212:istore_3        
			boolean flag1;
			if(!flag7 && !mScaleDragDetector.isDragging())
	//*  96  213:iload           8
	//*  97  215:ifne            234
	//*  98  218:aload_0         
	//*  99  219:getfield        #173 <Field CustomGestureDetector mScaleDragDetector>
	//* 100  222:invokevirtual   #499 <Method boolean CustomGestureDetector.isDragging()>
	//* 101  225:ifne            234
				flag1 = true;
	//  102  228:iconst_1        
	//  103  229:istore          4
			else
	//* 104  231:goto            237
				flag1 = false;
	//  105  234:iconst_0        
	//  106  235:istore          4
			flag2 = flag3;
	//  107  237:iload           6
	//  108  239:istore          5
			if(flag)
	//* 109  241:iload_3         
	//* 110  242:ifeq            257
			{
				flag2 = flag3;
	//  111  245:iload           6
	//  112  247:istore          5
				if(flag1)
	//* 113  249:iload           4
	//* 114  251:ifeq            257
					flag2 = true;
	//  115  254:iconst_1        
	//  116  255:istore          5
			}
			mBlockParentIntercept = flag2;
	//  117  257:aload_0         
	//  118  258:iload           5
	//  119  260:putfield        #117 <Field boolean mBlockParentIntercept>
			flag3 = flag5;
	//  120  263:iload           7
	//  121  265:istore          6
		} else
	//* 122  267:goto            274
		{
			flag3 = flag2;
	//  123  270:iload           5
	//  124  272:istore          6
		}
		view = ((View) (mGestureDetector));
	//  125  274:aload_0         
	//  126  275:getfield        #183 <Field GestureDetector mGestureDetector>
	//  127  278:astore_1        
		flag2 = flag3;
	//  128  279:iload           6
	//  129  281:istore          5
		if(view != null)
	//* 130  283:aload_1         
	//* 131  284:ifnull          302
		{
			flag2 = flag3;
	//  132  287:iload           6
	//  133  289:istore          5
			if(((GestureDetector) (view)).onTouchEvent(motionevent))
	//* 134  291:aload_1         
	//* 135  292:aload_2         
	//* 136  293:invokevirtual   #504 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//* 137  296:ifeq            302
				flag2 = true;
	//  138  299:iconst_1        
	//  139  300:istore          5
		}
		return flag2;
	//  140  302:iload           5
	//  141  304:ireturn         
	}

	public void setAllowParentInterceptOnEdge(boolean flag)
	{
		mAllowParentInterceptOnEdge = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #115 <Field boolean mAllowParentInterceptOnEdge>
	//    3    5:return          
	}

	public void setBaseRotation(float f)
	{
		mBaseRotation = f % 360F;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:ldc2            #507 <Float 360F>
	//    3    5:frem            
	//    4    6:putfield        #162 <Field float mBaseRotation>
		update();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #510 <Method void update()>
		setRotationBy(mBaseRotation);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #162 <Field float mBaseRotation>
	//   10   18:invokevirtual   #340 <Method void setRotationBy(float)>
		checkAndDisplayMatrix();
	//   11   21:aload_0         
	//   12   22:invokespecial   #426 <Method void checkAndDisplayMatrix()>
	//   13   25:return          
	}

	public boolean setDisplayMatrix(Matrix matrix)
	{
		if(matrix != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          39
		{
			if(mImageView.getDrawable() == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #146 <Field ImageView mImageView>
	//*   4    8:invokevirtual   #286 <Method Drawable ImageView.getDrawable()>
	//*   5   11:ifnonnull       16
			{
				return false;
	//    6   14:iconst_0        
	//    7   15:ireturn         
			} else
			{
				mSuppMatrix.set(matrix);
	//    8   16:aload_0         
	//    9   17:getfield        #126 <Field Matrix mSuppMatrix>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #304 <Method void Matrix.set(Matrix)>
				setImageViewMatrix(getDrawMatrix());
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:invokespecial   #201 <Method Matrix getDrawMatrix()>
	//   15   29:invokespecial   #207 <Method void setImageViewMatrix(Matrix)>
				checkMatrixBounds();
	//   16   32:aload_0         
	//   17   33:invokespecial   #242 <Method boolean checkMatrixBounds()>
	//   18   36:pop             
				return true;
	//   19   37:iconst_1        
	//   20   38:ireturn         
			}
		} else
		{
			throw new IllegalArgumentException("Matrix cannot be null");
	//   21   39:new             #513 <Class IllegalArgumentException>
	//   22   42:dup             
	//   23   43:ldc2            #515 <String "Matrix cannot be null">
	//   24   46:invokespecial   #518 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
	}

	public void setMaximumScale(float f)
	{
		Util.checkZoomLevels(mMinScale, mMidScale, f);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field float mMinScale>
	//    2    4:aload_0         
	//    3    5:getfield        #109 <Field float mMidScale>
	//    4    8:fload_1         
	//    5    9:invokestatic    #522 <Method void Util.checkZoomLevels(float, float, float)>
		mMaxScale = f;
	//    6   12:aload_0         
	//    7   13:fload_1         
	//    8   14:putfield        #113 <Field float mMaxScale>
	//    9   17:return          
	}

	public void setMediumScale(float f)
	{
		Util.checkZoomLevels(mMinScale, f, mMaxScale);
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field float mMinScale>
	//    2    4:fload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #113 <Field float mMaxScale>
	//    5    9:invokestatic    #522 <Method void Util.checkZoomLevels(float, float, float)>
		mMidScale = f;
	//    6   12:aload_0         
	//    7   13:fload_1         
	//    8   14:putfield        #109 <Field float mMidScale>
	//    9   17:return          
	}

	public void setMinimumScale(float f)
	{
		Util.checkZoomLevels(f, mMidScale, mMaxScale);
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #109 <Field float mMidScale>
	//    3    5:aload_0         
	//    4    6:getfield        #113 <Field float mMaxScale>
	//    5    9:invokestatic    #522 <Method void Util.checkZoomLevels(float, float, float)>
		mMinScale = f;
	//    6   12:aload_0         
	//    7   13:fload_1         
	//    8   14:putfield        #105 <Field float mMinScale>
	//    9   17:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		mOnClickListener = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #221 <Field android.view.View$OnClickListener mOnClickListener>
	//    3    5:return          
	}

	public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
	{
		mGestureDetector.setOnDoubleTapListener(ondoubletaplistener);
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field GestureDetector mGestureDetector>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method void GestureDetector.setOnDoubleTapListener(android.view.GestureDetector$OnDoubleTapListener)>
	//    4    8:return          
	}

	public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
	{
		mLongClickListener = onlongclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #192 <Field android.view.View$OnLongClickListener mLongClickListener>
	//    3    5:return          
	}

	public void setOnMatrixChangeListener(OnMatrixChangedListener onmatrixchangedlistener)
	{
		mMatrixChangeListener = onmatrixchangedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #345 <Field OnMatrixChangedListener mMatrixChangeListener>
	//    3    5:return          
	}

	public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onoutsidephototaplistener)
	{
		mOutsidePhotoTapListener = onoutsidephototaplistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #229 <Field OnOutsidePhotoTapListener mOutsidePhotoTapListener>
	//    3    5:return          
	}

	public void setOnPhotoTapListener(OnPhotoTapListener onphototaplistener)
	{
		mPhotoTapListener = onphototaplistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #225 <Field OnPhotoTapListener mPhotoTapListener>
	//    3    5:return          
	}

	public void setOnScaleChangeListener(OnScaleChangedListener onscalechangedlistener)
	{
		mScaleChangeListener = onscalechangedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #459 <Field OnScaleChangedListener mScaleChangeListener>
	//    3    5:return          
	}

	public void setOnSingleFlingListener(OnSingleFlingListener onsingleflinglistener)
	{
		mSingleFlingListener = onsingleflinglistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #211 <Field OnSingleFlingListener mSingleFlingListener>
	//    3    5:return          
	}

	public void setRotationBy(float f)
	{
		mSuppMatrix.postRotate(f % 360F);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Matrix mSuppMatrix>
	//    2    4:fload_1         
	//    3    5:ldc2            #507 <Float 360F>
	//    4    8:frem            
	//    5    9:invokevirtual   #542 <Method boolean Matrix.postRotate(float)>
	//    6   12:pop             
		checkAndDisplayMatrix();
	//    7   13:aload_0         
	//    8   14:invokespecial   #426 <Method void checkAndDisplayMatrix()>
	//    9   17:return          
	}

	public void setRotationTo(float f)
	{
		mSuppMatrix.setRotate(f % 360F);
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Matrix mSuppMatrix>
	//    2    4:fload_1         
	//    3    5:ldc2            #507 <Float 360F>
	//    4    8:frem            
	//    5    9:invokevirtual   #546 <Method void Matrix.setRotate(float)>
		checkAndDisplayMatrix();
	//    6   12:aload_0         
	//    7   13:invokespecial   #426 <Method void checkAndDisplayMatrix()>
	//    8   16:return          
	}

	public void setScale(float f)
	{
		setScale(f, false);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #550 <Method void setScale(float, boolean)>
	//    4    6:return          
	}

	public void setScale(float f, float f1, float f2, boolean flag)
	{
		if(f >= mMinScale && f <= mMaxScale)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #105 <Field float mMinScale>
	//*   3    5:fcmpg           
	//*   4    6:iflt            63
	//*   5    9:fload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #113 <Field float mMaxScale>
	//*   8   14:fcmpl           
	//*   9   15:ifgt            63
		{
			if(flag)
	//*  10   18:iload           4
	//*  11   20:ifeq            47
			{
				mImageView.post(((Runnable) (new AnimatedZoomRunnable(getScale(), f, f1, f2))));
	//   12   23:aload_0         
	//   13   24:getfield        #146 <Field ImageView mImageView>
	//   14   27:new             #18  <Class PhotoViewAttacher$AnimatedZoomRunnable>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:aload_0         
	//   18   33:invokevirtual   #457 <Method float getScale()>
	//   19   36:fload_1         
	//   20   37:fload_2         
	//   21   38:fload_3         
	//   22   39:invokespecial   #495 <Method void PhotoViewAttacher$AnimatedZoomRunnable(PhotoViewAttacher, float, float, float, float)>
	//   23   42:invokevirtual   #449 <Method boolean ImageView.post(Runnable)>
	//   24   45:pop             
				return;
	//   25   46:return          
			} else
			{
				mSuppMatrix.setScale(f, f, f1, f2);
	//   26   47:aload_0         
	//   27   48:getfield        #126 <Field Matrix mSuppMatrix>
	//   28   51:fload_1         
	//   29   52:fload_1         
	//   30   53:fload_2         
	//   31   54:fload_3         
	//   32   55:invokevirtual   #553 <Method void Matrix.setScale(float, float, float, float)>
				checkAndDisplayMatrix();
	//   33   58:aload_0         
	//   34   59:invokespecial   #426 <Method void checkAndDisplayMatrix()>
				return;
	//   35   62:return          
			}
		} else
		{
			throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
	//   36   63:new             #513 <Class IllegalArgumentException>
	//   37   66:dup             
	//   38   67:ldc2            #555 <String "Scale must be within the range of minScale and maxScale">
	//   39   70:invokespecial   #518 <Method void IllegalArgumentException(String)>
	//   40   73:athrow          
		}
	}

	public void setScale(float f, boolean flag)
	{
		setScale(f, mImageView.getRight() / 2, mImageView.getBottom() / 2, flag);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #146 <Field ImageView mImageView>
	//    4    6:invokevirtual   #558 <Method int ImageView.getRight()>
	//    5    9:iconst_2        
	//    6   10:idiv            
	//    7   11:i2f             
	//    8   12:aload_0         
	//    9   13:getfield        #146 <Field ImageView mImageView>
	//   10   16:invokevirtual   #561 <Method int ImageView.getBottom()>
	//   11   19:iconst_2        
	//   12   20:idiv            
	//   13   21:i2f             
	//   14   22:iload_2         
	//   15   23:invokevirtual   #563 <Method void setScale(float, float, float, boolean)>
	//   16   26:return          
	}

	public void setScaleLevels(float f, float f1, float f2)
	{
		Util.checkZoomLevels(f, f1, f2);
	//    0    0:fload_1         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokestatic    #522 <Method void Util.checkZoomLevels(float, float, float)>
		mMinScale = f;
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:putfield        #105 <Field float mMinScale>
		mMidScale = f1;
	//    7   11:aload_0         
	//    8   12:fload_2         
	//    9   13:putfield        #109 <Field float mMidScale>
		mMaxScale = f2;
	//   10   16:aload_0         
	//   11   17:fload_3         
	//   12   18:putfield        #113 <Field float mMaxScale>
	//   13   21:return          
	}

	public void setScaleType(android.widget.ImageView.ScaleType scaletype)
	{
		if(Util.isSupportedScaleType(scaletype) && scaletype != mScaleType)
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #570 <Method boolean Util.isSupportedScaleType(android.widget.ImageView$ScaleType)>
	//*   2    4:ifeq            24
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
	//*   6   12:if_acmpeq       24
		{
			mScaleType = scaletype;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #144 <Field android.widget.ImageView$ScaleType mScaleType>
			update();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #510 <Method void update()>
		}
	//   12   24:return          
	}

	public void setZoomInterpolator(Interpolator interpolator)
	{
		mInterpolator = interpolator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field Interpolator mInterpolator>
	//    3    5:return          
	}

	public void setZoomTransitionDuration(int i)
	{
		mZoomDuration = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #101 <Field int mZoomDuration>
	//    3    5:return          
	}

	public void setZoomable(boolean flag)
	{
		mZoomEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #137 <Field boolean mZoomEnabled>
		update();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #510 <Method void update()>
	//    5    9:return          
	}

	public void update()
	{
		if(mZoomEnabled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field boolean mZoomEnabled>
	//*   2    4:ifeq            19
		{
			updateBaseMatrix(mImageView.getDrawable());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #146 <Field ImageView mImageView>
	//    6   12:invokevirtual   #286 <Method Drawable ImageView.getDrawable()>
	//    7   15:invokespecial   #453 <Method void updateBaseMatrix(Drawable)>
			return;
	//    8   18:return          
		} else
		{
			resetMatrix();
	//    9   19:aload_0         
	//   10   20:invokespecial   #396 <Method void resetMatrix()>
			return;
	//   11   23:return          
		}
	}

	private static float DEFAULT_MAX_SCALE = 3F;
	private static float DEFAULT_MID_SCALE = 1.75F;
	private static float DEFAULT_MIN_SCALE = 1F;
	private static int DEFAULT_ZOOM_DURATION = 200;
	private static final int EDGE_BOTH = 2;
	private static final int EDGE_LEFT = 0;
	private static final int EDGE_NONE = -1;
	private static final int EDGE_RIGHT = 1;
	private static int SINGLE_TOUCH = 1;
	private boolean mAllowParentInterceptOnEdge;
	private final Matrix mBaseMatrix = new Matrix();
	private float mBaseRotation;
	private boolean mBlockParentIntercept;
	private FlingRunnable mCurrentFlingRunnable;
	private final RectF mDisplayRect = new RectF();
	private final Matrix mDrawMatrix = new Matrix();
	private GestureDetector mGestureDetector;
	private ImageView mImageView;
	private Interpolator mInterpolator;
	private android.view.View.OnLongClickListener mLongClickListener;
	private OnMatrixChangedListener mMatrixChangeListener;
	private final float mMatrixValues[] = new float[9];
	private float mMaxScale;
	private float mMidScale;
	private float mMinScale;
	private android.view.View.OnClickListener mOnClickListener;
	private OnOutsidePhotoTapListener mOutsidePhotoTapListener;
	private OnPhotoTapListener mPhotoTapListener;
	private OnScaleChangedListener mScaleChangeListener;
	private CustomGestureDetector mScaleDragDetector;
	private android.widget.ImageView.ScaleType mScaleType;
	private int mScrollEdge;
	private OnSingleFlingListener mSingleFlingListener;
	private final Matrix mSuppMatrix = new Matrix();
	private int mZoomDuration;
	private boolean mZoomEnabled;

	static 
	{
	//    0    0:return          
	}


/*
	static android.view.View.OnLongClickListener access$000(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mLongClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #192 <Field android.view.View$OnLongClickListener mLongClickListener>
	//    2    4:areturn         
	}

*/


/*
	static ImageView access$100(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mImageView;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field ImageView mImageView>
	//    2    4:areturn         
	}

*/


/*
	static Matrix access$1000(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mSuppMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field Matrix mSuppMatrix>
	//    2    4:areturn         
	}

*/


/*
	static Matrix access$1100(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.getDrawMatrix();
	//    0    0:aload_0         
	//    1    1:invokespecial   #201 <Method Matrix getDrawMatrix()>
	//    2    4:areturn         
	}

*/


/*
	static void access$1200(PhotoViewAttacher photoviewattacher, Matrix matrix)
	{
		photoviewattacher.setImageViewMatrix(matrix);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #207 <Method void setImageViewMatrix(Matrix)>
		return;
	//    3    5:return          
	}

*/


/*
	static OnSingleFlingListener access$200(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mSingleFlingListener;
	//    0    0:aload_0         
	//    1    1:getfield        #211 <Field OnSingleFlingListener mSingleFlingListener>
	//    2    4:areturn         
	}

*/


/*
	static float access$300()
	{
		return DEFAULT_MIN_SCALE;
	//    0    0:getstatic       #103 <Field float DEFAULT_MIN_SCALE>
	//    1    3:freturn         
	}

*/


/*
	static int access$400()
	{
		return SINGLE_TOUCH;
	//    0    0:getstatic       #217 <Field int SINGLE_TOUCH>
	//    1    3:ireturn         
	}

*/


/*
	static android.view.View.OnClickListener access$500(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mOnClickListener;
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field android.view.View$OnClickListener mOnClickListener>
	//    2    4:areturn         
	}

*/


/*
	static OnPhotoTapListener access$600(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mPhotoTapListener;
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field OnPhotoTapListener mPhotoTapListener>
	//    2    4:areturn         
	}

*/


/*
	static OnOutsidePhotoTapListener access$700(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mOutsidePhotoTapListener;
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field OnOutsidePhotoTapListener mOutsidePhotoTapListener>
	//    2    4:areturn         
	}

*/


/*
	static int access$800(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mZoomDuration;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int mZoomDuration>
	//    2    4:ireturn         
	}

*/


/*
	static Interpolator access$900(PhotoViewAttacher photoviewattacher)
	{
		return photoviewattacher.mInterpolator;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field Interpolator mInterpolator>
	//    2    4:areturn         
	}

*/
}
