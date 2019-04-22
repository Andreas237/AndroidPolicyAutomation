// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.*;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.ViewCompat;
import android.view.MotionEvent;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class FastScroller extends RecyclerView.ItemDecoration
	implements RecyclerView.OnItemTouchListener
{
	private class AnimatorListener extends AnimatorListenerAdapter
	{

		public void onAnimationCancel(Animator animator)
		{
			mCanceled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #20  <Field boolean mCanceled>
		//    3    5:return          
		}

		public void onAnimationEnd(Animator animator)
		{
			if(mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #20  <Field boolean mCanceled>
		//*   2    4:ifeq            13
			{
				mCanceled = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #20  <Field boolean mCanceled>
				return;
		//    6   12:return          
			}
			if(((Float)mShowHideAnimator.getAnimatedValue()).floatValue() == 0.0F)
		//*   7   13:aload_0         
		//*   8   14:getfield        #15  <Field FastScroller this$0>
		//*   9   17:getfield        #28  <Field ValueAnimator FastScroller.mShowHideAnimator>
		//*  10   20:invokevirtual   #34  <Method Object ValueAnimator.getAnimatedValue()>
		//*  11   23:checkcast       #36  <Class Float>
		//*  12   26:invokevirtual   #40  <Method float Float.floatValue()>
		//*  13   29:fconst_0        
		//*  14   30:fcmpl           
		//*  15   31:ifne            50
			{
				animator = ((Animator) (FastScroller.this));
		//   16   34:aload_0         
		//   17   35:getfield        #15  <Field FastScroller this$0>
		//   18   38:astore_1        
				animator.mAnimationState = 0;
		//   19   39:aload_1         
		//   20   40:iconst_0        
		//   21   41:putfield        #44  <Field int FastScroller.mAnimationState>
				((FastScroller) (animator)).setState(0);
		//   22   44:aload_1         
		//   23   45:iconst_0        
		//   24   46:invokevirtual   #48  <Method void FastScroller.setState(int)>
				return;
		//   25   49:return          
			} else
			{
				animator = ((Animator) (FastScroller.this));
		//   26   50:aload_0         
		//   27   51:getfield        #15  <Field FastScroller this$0>
		//   28   54:astore_1        
				animator.mAnimationState = 2;
		//   29   55:aload_1         
		//   30   56:iconst_2        
		//   31   57:putfield        #44  <Field int FastScroller.mAnimationState>
				((FastScroller) (animator)).requestRedraw();
		//   32   60:aload_1         
		//   33   61:invokevirtual   #51  <Method void FastScroller.requestRedraw()>
				return;
		//   34   64:return          
			}
		}

		private boolean mCanceled;
		final FastScroller this$0;

		AnimatorListener()
		{
			this$0 = FastScroller.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field FastScroller this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			mCanceled = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #20  <Field boolean mCanceled>
		//    8   14:return          
		}
	}

	private class AnimatorUpdater
		implements android.animation.ValueAnimator.AnimatorUpdateListener
	{

		public void onAnimationUpdate(ValueAnimator valueanimator)
		{
			int i = (int)(((Float)valueanimator.getAnimatedValue()).floatValue() * 255F);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method Object ValueAnimator.getAnimatedValue()>
		//    2    4:checkcast       #29  <Class Float>
		//    3    7:invokevirtual   #33  <Method float Float.floatValue()>
		//    4   10:ldc1            #34  <Float 255F>
		//    5   12:fmul            
		//    6   13:f2i             
		//    7   14:istore_2        
			mVerticalThumbDrawable.setAlpha(i);
		//    8   15:aload_0         
		//    9   16:getfield        #15  <Field FastScroller this$0>
		//   10   19:getfield        #38  <Field StateListDrawable FastScroller.mVerticalThumbDrawable>
		//   11   22:iload_2         
		//   12   23:invokevirtual   #44  <Method void StateListDrawable.setAlpha(int)>
			mVerticalTrackDrawable.setAlpha(i);
		//   13   26:aload_0         
		//   14   27:getfield        #15  <Field FastScroller this$0>
		//   15   30:getfield        #48  <Field Drawable FastScroller.mVerticalTrackDrawable>
		//   16   33:iload_2         
		//   17   34:invokevirtual   #51  <Method void Drawable.setAlpha(int)>
			requestRedraw();
		//   18   37:aload_0         
		//   19   38:getfield        #15  <Field FastScroller this$0>
		//   20   41:invokevirtual   #54  <Method void FastScroller.requestRedraw()>
		//   21   44:return          
		}

		final FastScroller this$0;

		AnimatorUpdater()
		{
			this$0 = FastScroller.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field FastScroller this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	FastScroller(RecyclerView recyclerview, StateListDrawable statelistdrawable, Drawable drawable, StateListDrawable statelistdrawable1, Drawable drawable1, int i, int j, 
			int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void RecyclerView$ItemDecoration()>
		mRecyclerViewWidth = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #72  <Field int mRecyclerViewWidth>
		mRecyclerViewHeight = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #74  <Field int mRecyclerViewHeight>
		mNeedVerticalScrollbar = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #76  <Field boolean mNeedVerticalScrollbar>
		mNeedHorizontalScrollbar = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #78  <Field boolean mNeedHorizontalScrollbar>
		mState = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #80  <Field int mState>
		mDragState = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #82  <Field int mDragState>
	//   20   34:aload_0         
	//   21   35:iconst_2        
	//   22   36:newarray        int[]
	//   23   38:putfield        #84  <Field int[] mVerticalRange>
	//   24   41:aload_0         
	//   25   42:iconst_2        
	//   26   43:newarray        int[]
	//   27   45:putfield        #86  <Field int[] mHorizontalRange>
	//   28   48:aload_0         
	//   29   49:iconst_2        
	//   30   50:newarray        float[]
	//   31   52:dup             
	//   32   53:iconst_0        
	//   33   54:fconst_0        
	//   34   55:fastore         
	//   35   56:dup             
	//   36   57:iconst_1        
	//   37   58:fconst_1        
	//   38   59:fastore         
	//   39   60:invokestatic    #92  <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   40   63:putfield        #94  <Field ValueAnimator mShowHideAnimator>
		mAnimationState = 0;
	//   41   66:aload_0         
	//   42   67:iconst_0        
	//   43   68:putfield        #96  <Field int mAnimationState>
	//   44   71:aload_0         
	//   45   72:new             #8   <Class FastScroller$1>
	//   46   75:dup             
	//   47   76:aload_0         
	//   48   77:invokespecial   #99  <Method void FastScroller$1(FastScroller)>
	//   49   80:putfield        #101 <Field Runnable mHideRunnable>
	//   50   83:aload_0         
	//   51   84:new             #10  <Class FastScroller$2>
	//   52   87:dup             
	//   53   88:aload_0         
	//   54   89:invokespecial   #102 <Method void FastScroller$2(FastScroller)>
	//   55   92:putfield        #104 <Field RecyclerView$OnScrollListener mOnScrollListener>
		mVerticalThumbDrawable = statelistdrawable;
	//   56   95:aload_0         
	//   57   96:aload_2         
	//   58   97:putfield        #106 <Field StateListDrawable mVerticalThumbDrawable>
		mVerticalTrackDrawable = drawable;
	//   59  100:aload_0         
	//   60  101:aload_3         
	//   61  102:putfield        #108 <Field Drawable mVerticalTrackDrawable>
		mHorizontalThumbDrawable = statelistdrawable1;
	//   62  105:aload_0         
	//   63  106:aload           4
	//   64  108:putfield        #110 <Field StateListDrawable mHorizontalThumbDrawable>
		mHorizontalTrackDrawable = drawable1;
	//   65  111:aload_0         
	//   66  112:aload           5
	//   67  114:putfield        #112 <Field Drawable mHorizontalTrackDrawable>
		mVerticalThumbWidth = Math.max(i, statelistdrawable.getIntrinsicWidth());
	//   68  117:aload_0         
	//   69  118:iload           6
	//   70  120:aload_2         
	//   71  121:invokevirtual   #118 <Method int StateListDrawable.getIntrinsicWidth()>
	//   72  124:invokestatic    #124 <Method int Math.max(int, int)>
	//   73  127:putfield        #126 <Field int mVerticalThumbWidth>
		mVerticalTrackWidth = Math.max(i, drawable.getIntrinsicWidth());
	//   74  130:aload_0         
	//   75  131:iload           6
	//   76  133:aload_3         
	//   77  134:invokevirtual   #129 <Method int Drawable.getIntrinsicWidth()>
	//   78  137:invokestatic    #124 <Method int Math.max(int, int)>
	//   79  140:putfield        #131 <Field int mVerticalTrackWidth>
		mHorizontalThumbHeight = Math.max(i, statelistdrawable1.getIntrinsicWidth());
	//   80  143:aload_0         
	//   81  144:iload           6
	//   82  146:aload           4
	//   83  148:invokevirtual   #118 <Method int StateListDrawable.getIntrinsicWidth()>
	//   84  151:invokestatic    #124 <Method int Math.max(int, int)>
	//   85  154:putfield        #133 <Field int mHorizontalThumbHeight>
		mHorizontalTrackHeight = Math.max(i, drawable1.getIntrinsicWidth());
	//   86  157:aload_0         
	//   87  158:iload           6
	//   88  160:aload           5
	//   89  162:invokevirtual   #129 <Method int Drawable.getIntrinsicWidth()>
	//   90  165:invokestatic    #124 <Method int Math.max(int, int)>
	//   91  168:putfield        #135 <Field int mHorizontalTrackHeight>
		mScrollbarMinimumRange = j;
	//   92  171:aload_0         
	//   93  172:iload           7
	//   94  174:putfield        #137 <Field int mScrollbarMinimumRange>
		mMargin = k;
	//   95  177:aload_0         
	//   96  178:iload           8
	//   97  180:putfield        #139 <Field int mMargin>
		mVerticalThumbDrawable.setAlpha(255);
	//   98  183:aload_0         
	//   99  184:getfield        #106 <Field StateListDrawable mVerticalThumbDrawable>
	//  100  187:sipush          255
	//  101  190:invokevirtual   #143 <Method void StateListDrawable.setAlpha(int)>
		mVerticalTrackDrawable.setAlpha(255);
	//  102  193:aload_0         
	//  103  194:getfield        #108 <Field Drawable mVerticalTrackDrawable>
	//  104  197:sipush          255
	//  105  200:invokevirtual   #144 <Method void Drawable.setAlpha(int)>
		mShowHideAnimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListener())));
	//  106  203:aload_0         
	//  107  204:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//  108  207:new             #12  <Class FastScroller$AnimatorListener>
	//  109  210:dup             
	//  110  211:aload_0         
	//  111  212:invokespecial   #145 <Method void FastScroller$AnimatorListener(FastScroller)>
	//  112  215:invokevirtual   #149 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		mShowHideAnimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new AnimatorUpdater())));
	//  113  218:aload_0         
	//  114  219:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//  115  222:new             #15  <Class FastScroller$AnimatorUpdater>
	//  116  225:dup             
	//  117  226:aload_0         
	//  118  227:invokespecial   #150 <Method void FastScroller$AnimatorUpdater(FastScroller)>
	//  119  230:invokevirtual   #154 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		attachToRecyclerView(recyclerview);
	//  120  233:aload_0         
	//  121  234:aload_1         
	//  122  235:invokevirtual   #158 <Method void attachToRecyclerView(RecyclerView)>
	//  123  238:return          
	}

	private void cancelHide()
	{
		mRecyclerView.removeCallbacks(mHideRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:getfield        #101 <Field Runnable mHideRunnable>
	//    4    8:invokevirtual   #167 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void destroyCallbacks()
	{
		mRecyclerView.removeItemDecoration(((RecyclerView.ItemDecoration) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #172 <Method void RecyclerView.removeItemDecoration(RecyclerView$ItemDecoration)>
		mRecyclerView.removeOnItemTouchListener(((RecyclerView.OnItemTouchListener) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #161 <Field RecyclerView mRecyclerView>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #176 <Method void RecyclerView.removeOnItemTouchListener(RecyclerView$OnItemTouchListener)>
		mRecyclerView.removeOnScrollListener(mOnScrollListener);
	//    8   16:aload_0         
	//    9   17:getfield        #161 <Field RecyclerView mRecyclerView>
	//   10   20:aload_0         
	//   11   21:getfield        #104 <Field RecyclerView$OnScrollListener mOnScrollListener>
	//   12   24:invokevirtual   #180 <Method void RecyclerView.removeOnScrollListener(RecyclerView$OnScrollListener)>
		cancelHide();
	//   13   27:aload_0         
	//   14   28:invokespecial   #182 <Method void cancelHide()>
	//   15   31:return          
	}

	private void drawHorizontalScrollbar(Canvas canvas)
	{
		int j = mRecyclerViewHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field int mRecyclerViewHeight>
	//    2    4:istore_3        
		int i = mHorizontalThumbHeight;
	//    3    5:aload_0         
	//    4    6:getfield        #133 <Field int mHorizontalThumbHeight>
	//    5    9:istore_2        
		j -= i;
	//    6   10:iload_3         
	//    7   11:iload_2         
	//    8   12:isub            
	//    9   13:istore_3        
		int l = mHorizontalThumbCenterX;
	//   10   14:aload_0         
	//   11   15:getfield        #186 <Field int mHorizontalThumbCenterX>
	//   12   18:istore          5
		int k = mHorizontalThumbWidth;
	//   13   20:aload_0         
	//   14   21:getfield        #188 <Field int mHorizontalThumbWidth>
	//   15   24:istore          4
		l -= k / 2;
	//   16   26:iload           5
	//   17   28:iload           4
	//   18   30:iconst_2        
	//   19   31:idiv            
	//   20   32:isub            
	//   21   33:istore          5
		mHorizontalThumbDrawable.setBounds(0, 0, k, i);
	//   22   35:aload_0         
	//   23   36:getfield        #110 <Field StateListDrawable mHorizontalThumbDrawable>
	//   24   39:iconst_0        
	//   25   40:iconst_0        
	//   26   41:iload           4
	//   27   43:iload_2         
	//   28   44:invokevirtual   #192 <Method void StateListDrawable.setBounds(int, int, int, int)>
		mHorizontalTrackDrawable.setBounds(0, 0, mRecyclerViewWidth, mHorizontalTrackHeight);
	//   29   47:aload_0         
	//   30   48:getfield        #112 <Field Drawable mHorizontalTrackDrawable>
	//   31   51:iconst_0        
	//   32   52:iconst_0        
	//   33   53:aload_0         
	//   34   54:getfield        #72  <Field int mRecyclerViewWidth>
	//   35   57:aload_0         
	//   36   58:getfield        #135 <Field int mHorizontalTrackHeight>
	//   37   61:invokevirtual   #193 <Method void Drawable.setBounds(int, int, int, int)>
		canvas.translate(0.0F, j);
	//   38   64:aload_1         
	//   39   65:fconst_0        
	//   40   66:iload_3         
	//   41   67:i2f             
	//   42   68:invokevirtual   #199 <Method void Canvas.translate(float, float)>
		mHorizontalTrackDrawable.draw(canvas);
	//   43   71:aload_0         
	//   44   72:getfield        #112 <Field Drawable mHorizontalTrackDrawable>
	//   45   75:aload_1         
	//   46   76:invokevirtual   #202 <Method void Drawable.draw(Canvas)>
		canvas.translate(l, 0.0F);
	//   47   79:aload_1         
	//   48   80:iload           5
	//   49   82:i2f             
	//   50   83:fconst_0        
	//   51   84:invokevirtual   #199 <Method void Canvas.translate(float, float)>
		mHorizontalThumbDrawable.draw(canvas);
	//   52   87:aload_0         
	//   53   88:getfield        #110 <Field StateListDrawable mHorizontalThumbDrawable>
	//   54   91:aload_1         
	//   55   92:invokevirtual   #203 <Method void StateListDrawable.draw(Canvas)>
		canvas.translate(-l, -j);
	//   56   95:aload_1         
	//   57   96:iload           5
	//   58   98:ineg            
	//   59   99:i2f             
	//   60  100:iload_3         
	//   61  101:ineg            
	//   62  102:i2f             
	//   63  103:invokevirtual   #199 <Method void Canvas.translate(float, float)>
	//   64  106:return          
	}

	private void drawVerticalScrollbar(Canvas canvas)
	{
		int j = mRecyclerViewWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int mRecyclerViewWidth>
	//    2    4:istore_3        
		int i = mVerticalThumbWidth;
	//    3    5:aload_0         
	//    4    6:getfield        #126 <Field int mVerticalThumbWidth>
	//    5    9:istore_2        
		j -= i;
	//    6   10:iload_3         
	//    7   11:iload_2         
	//    8   12:isub            
	//    9   13:istore_3        
		int l = mVerticalThumbCenterY;
	//   10   14:aload_0         
	//   11   15:getfield        #206 <Field int mVerticalThumbCenterY>
	//   12   18:istore          5
		int k = mVerticalThumbHeight;
	//   13   20:aload_0         
	//   14   21:getfield        #208 <Field int mVerticalThumbHeight>
	//   15   24:istore          4
		l -= k / 2;
	//   16   26:iload           5
	//   17   28:iload           4
	//   18   30:iconst_2        
	//   19   31:idiv            
	//   20   32:isub            
	//   21   33:istore          5
		mVerticalThumbDrawable.setBounds(0, 0, i, k);
	//   22   35:aload_0         
	//   23   36:getfield        #106 <Field StateListDrawable mVerticalThumbDrawable>
	//   24   39:iconst_0        
	//   25   40:iconst_0        
	//   26   41:iload_2         
	//   27   42:iload           4
	//   28   44:invokevirtual   #192 <Method void StateListDrawable.setBounds(int, int, int, int)>
		mVerticalTrackDrawable.setBounds(0, 0, mVerticalTrackWidth, mRecyclerViewHeight);
	//   29   47:aload_0         
	//   30   48:getfield        #108 <Field Drawable mVerticalTrackDrawable>
	//   31   51:iconst_0        
	//   32   52:iconst_0        
	//   33   53:aload_0         
	//   34   54:getfield        #131 <Field int mVerticalTrackWidth>
	//   35   57:aload_0         
	//   36   58:getfield        #74  <Field int mRecyclerViewHeight>
	//   37   61:invokevirtual   #193 <Method void Drawable.setBounds(int, int, int, int)>
		if(isLayoutRTL())
	//*  38   64:aload_0         
	//*  39   65:invokespecial   #212 <Method boolean isLayoutRTL()>
	//*  40   68:ifeq            127
		{
			mVerticalTrackDrawable.draw(canvas);
	//   41   71:aload_0         
	//   42   72:getfield        #108 <Field Drawable mVerticalTrackDrawable>
	//   43   75:aload_1         
	//   44   76:invokevirtual   #202 <Method void Drawable.draw(Canvas)>
			canvas.translate(mVerticalThumbWidth, l);
	//   45   79:aload_1         
	//   46   80:aload_0         
	//   47   81:getfield        #126 <Field int mVerticalThumbWidth>
	//   48   84:i2f             
	//   49   85:iload           5
	//   50   87:i2f             
	//   51   88:invokevirtual   #199 <Method void Canvas.translate(float, float)>
			canvas.scale(-1F, 1.0F);
	//   52   91:aload_1         
	//   53   92:ldc1            #213 <Float -1F>
	//   54   94:fconst_1        
	//   55   95:invokevirtual   #216 <Method void Canvas.scale(float, float)>
			mVerticalThumbDrawable.draw(canvas);
	//   56   98:aload_0         
	//   57   99:getfield        #106 <Field StateListDrawable mVerticalThumbDrawable>
	//   58  102:aload_1         
	//   59  103:invokevirtual   #203 <Method void StateListDrawable.draw(Canvas)>
			canvas.scale(1.0F, 1.0F);
	//   60  106:aload_1         
	//   61  107:fconst_1        
	//   62  108:fconst_1        
	//   63  109:invokevirtual   #216 <Method void Canvas.scale(float, float)>
			canvas.translate(-mVerticalThumbWidth, -l);
	//   64  112:aload_1         
	//   65  113:aload_0         
	//   66  114:getfield        #126 <Field int mVerticalThumbWidth>
	//   67  117:ineg            
	//   68  118:i2f             
	//   69  119:iload           5
	//   70  121:ineg            
	//   71  122:i2f             
	//   72  123:invokevirtual   #199 <Method void Canvas.translate(float, float)>
			return;
	//   73  126:return          
		} else
		{
			canvas.translate(j, 0.0F);
	//   74  127:aload_1         
	//   75  128:iload_3         
	//   76  129:i2f             
	//   77  130:fconst_0        
	//   78  131:invokevirtual   #199 <Method void Canvas.translate(float, float)>
			mVerticalTrackDrawable.draw(canvas);
	//   79  134:aload_0         
	//   80  135:getfield        #108 <Field Drawable mVerticalTrackDrawable>
	//   81  138:aload_1         
	//   82  139:invokevirtual   #202 <Method void Drawable.draw(Canvas)>
			canvas.translate(0.0F, l);
	//   83  142:aload_1         
	//   84  143:fconst_0        
	//   85  144:iload           5
	//   86  146:i2f             
	//   87  147:invokevirtual   #199 <Method void Canvas.translate(float, float)>
			mVerticalThumbDrawable.draw(canvas);
	//   88  150:aload_0         
	//   89  151:getfield        #106 <Field StateListDrawable mVerticalThumbDrawable>
	//   90  154:aload_1         
	//   91  155:invokevirtual   #203 <Method void StateListDrawable.draw(Canvas)>
			canvas.translate(-j, -l);
	//   92  158:aload_1         
	//   93  159:iload_3         
	//   94  160:ineg            
	//   95  161:i2f             
	//   96  162:iload           5
	//   97  164:ineg            
	//   98  165:i2f             
	//   99  166:invokevirtual   #199 <Method void Canvas.translate(float, float)>
			return;
	//  100  169:return          
		}
	}

	private int[] getHorizontalRange()
	{
		int ai[] = mHorizontalRange;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field int[] mHorizontalRange>
	//    2    4:astore_2        
		int i = mMargin;
	//    3    5:aload_0         
	//    4    6:getfield        #139 <Field int mMargin>
	//    5    9:istore_1        
		ai[0] = i;
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:iload_1         
	//    9   13:iastore         
		ai[1] = mRecyclerViewWidth - i;
	//   10   14:aload_2         
	//   11   15:iconst_1        
	//   12   16:aload_0         
	//   13   17:getfield        #72  <Field int mRecyclerViewWidth>
	//   14   20:iload_1         
	//   15   21:isub            
	//   16   22:iastore         
		return ai;
	//   17   23:aload_2         
	//   18   24:areturn         
	}

	private int[] getVerticalRange()
	{
		int ai[] = mVerticalRange;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int[] mVerticalRange>
	//    2    4:astore_2        
		int i = mMargin;
	//    3    5:aload_0         
	//    4    6:getfield        #139 <Field int mMargin>
	//    5    9:istore_1        
		ai[0] = i;
	//    6   10:aload_2         
	//    7   11:iconst_0        
	//    8   12:iload_1         
	//    9   13:iastore         
		ai[1] = mRecyclerViewHeight - i;
	//   10   14:aload_2         
	//   11   15:iconst_1        
	//   12   16:aload_0         
	//   13   17:getfield        #74  <Field int mRecyclerViewHeight>
	//   14   20:iload_1         
	//   15   21:isub            
	//   16   22:iastore         
		return ai;
	//   17   23:aload_2         
	//   18   24:areturn         
	}

	private void horizontalScrollTo(float f)
	{
		int ai[] = getHorizontalRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method int[] getHorizontalRange()>
	//    2    4:astore_3        
		f = Math.max(ai[0], Math.min(ai[1], f));
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:iaload          
	//    6    8:i2f             
	//    7    9:aload_3         
	//    8   10:iconst_1        
	//    9   11:iaload          
	//   10   12:i2f             
	//   11   13:fload_1         
	//   12   14:invokestatic    #227 <Method float Math.min(float, float)>
	//   13   17:invokestatic    #229 <Method float Math.max(float, float)>
	//   14   20:fstore_1        
		if(Math.abs((float)mHorizontalThumbCenterX - f) < 2.0F)
	//*  15   21:aload_0         
	//*  16   22:getfield        #186 <Field int mHorizontalThumbCenterX>
	//*  17   25:i2f             
	//*  18   26:fload_1         
	//*  19   27:fsub            
	//*  20   28:invokestatic    #233 <Method float Math.abs(float)>
	//*  21   31:fconst_2        
	//*  22   32:fcmpg           
	//*  23   33:ifge            37
			return;
	//   24   36:return          
		int i = scrollTo(mHorizontalDragX, f, ai, mRecyclerView.computeHorizontalScrollRange(), mRecyclerView.computeHorizontalScrollOffset(), mRecyclerViewWidth);
	//   25   37:aload_0         
	//   26   38:aload_0         
	//   27   39:getfield        #235 <Field float mHorizontalDragX>
	//   28   42:fload_1         
	//   29   43:aload_3         
	//   30   44:aload_0         
	//   31   45:getfield        #161 <Field RecyclerView mRecyclerView>
	//   32   48:invokevirtual   #238 <Method int RecyclerView.computeHorizontalScrollRange()>
	//   33   51:aload_0         
	//   34   52:getfield        #161 <Field RecyclerView mRecyclerView>
	//   35   55:invokevirtual   #241 <Method int RecyclerView.computeHorizontalScrollOffset()>
	//   36   58:aload_0         
	//   37   59:getfield        #72  <Field int mRecyclerViewWidth>
	//   38   62:invokespecial   #245 <Method int scrollTo(float, float, int[], int, int, int)>
	//   39   65:istore_2        
		if(i != 0)
	//*  40   66:iload_2         
	//*  41   67:ifeq            79
			mRecyclerView.scrollBy(i, 0);
	//   42   70:aload_0         
	//   43   71:getfield        #161 <Field RecyclerView mRecyclerView>
	//   44   74:iload_2         
	//   45   75:iconst_0        
	//   46   76:invokevirtual   #249 <Method void RecyclerView.scrollBy(int, int)>
		mHorizontalDragX = f;
	//   47   79:aload_0         
	//   48   80:fload_1         
	//   49   81:putfield        #235 <Field float mHorizontalDragX>
	//   50   84:return          
	}

	private boolean isLayoutRTL()
	{
		return ViewCompat.getLayoutDirection(((android.view.View) (mRecyclerView))) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #255 <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//    3    7:iconst_1        
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void resetHideDelay(int i)
	{
		cancelHide();
	//    0    0:aload_0         
	//    1    1:invokespecial   #182 <Method void cancelHide()>
		mRecyclerView.postDelayed(mHideRunnable, i);
	//    2    4:aload_0         
	//    3    5:getfield        #161 <Field RecyclerView mRecyclerView>
	//    4    8:aload_0         
	//    5    9:getfield        #101 <Field Runnable mHideRunnable>
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:invokevirtual   #260 <Method boolean RecyclerView.postDelayed(Runnable, long)>
	//    9   17:pop             
	//   10   18:return          
	}

	private int scrollTo(float f, float f1, int ai[], int i, int j, int k)
	{
		int l = ai[1] - ai[0];
	//    0    0:aload_3         
	//    1    1:iconst_1        
	//    2    2:iaload          
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:iaload          
	//    6    6:isub            
	//    7    7:istore          7
		if(l == 0)
	//*   8    9:iload           7
	//*   9   11:ifne            16
			return 0;
	//   10   14:iconst_0        
	//   11   15:ireturn         
		f = (f1 - f) / (float)l;
	//   12   16:fload_2         
	//   13   17:fload_1         
	//   14   18:fsub            
	//   15   19:iload           7
	//   16   21:i2f             
	//   17   22:fdiv            
	//   18   23:fstore_1        
		i -= k;
	//   19   24:iload           4
	//   20   26:iload           6
	//   21   28:isub            
	//   22   29:istore          4
		k = (int)(f * (float)i);
	//   23   31:fload_1         
	//   24   32:iload           4
	//   25   34:i2f             
	//   26   35:fmul            
	//   27   36:f2i             
	//   28   37:istore          6
		j += k;
	//   29   39:iload           5
	//   30   41:iload           6
	//   31   43:iadd            
	//   32   44:istore          5
		if(j < i && j >= 0)
	//*  33   46:iload           5
	//*  34   48:iload           4
	//*  35   50:icmpge          61
	//*  36   53:iload           5
	//*  37   55:iflt            61
			return k;
	//   38   58:iload           6
	//   39   60:ireturn         
		else
			return 0;
	//   40   61:iconst_0        
	//   41   62:ireturn         
	}

	private void setupCallbacks()
	{
		mRecyclerView.addItemDecoration(((RecyclerView.ItemDecoration) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #264 <Method void RecyclerView.addItemDecoration(RecyclerView$ItemDecoration)>
		mRecyclerView.addOnItemTouchListener(((RecyclerView.OnItemTouchListener) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #161 <Field RecyclerView mRecyclerView>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #267 <Method void RecyclerView.addOnItemTouchListener(RecyclerView$OnItemTouchListener)>
		mRecyclerView.addOnScrollListener(mOnScrollListener);
	//    8   16:aload_0         
	//    9   17:getfield        #161 <Field RecyclerView mRecyclerView>
	//   10   20:aload_0         
	//   11   21:getfield        #104 <Field RecyclerView$OnScrollListener mOnScrollListener>
	//   12   24:invokevirtual   #270 <Method void RecyclerView.addOnScrollListener(RecyclerView$OnScrollListener)>
	//   13   27:return          
	}

	private void verticalScrollTo(float f)
	{
		int ai[] = getVerticalRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #273 <Method int[] getVerticalRange()>
	//    2    4:astore_3        
		f = Math.max(ai[0], Math.min(ai[1], f));
	//    3    5:aload_3         
	//    4    6:iconst_0        
	//    5    7:iaload          
	//    6    8:i2f             
	//    7    9:aload_3         
	//    8   10:iconst_1        
	//    9   11:iaload          
	//   10   12:i2f             
	//   11   13:fload_1         
	//   12   14:invokestatic    #227 <Method float Math.min(float, float)>
	//   13   17:invokestatic    #229 <Method float Math.max(float, float)>
	//   14   20:fstore_1        
		if(Math.abs((float)mVerticalThumbCenterY - f) < 2.0F)
	//*  15   21:aload_0         
	//*  16   22:getfield        #206 <Field int mVerticalThumbCenterY>
	//*  17   25:i2f             
	//*  18   26:fload_1         
	//*  19   27:fsub            
	//*  20   28:invokestatic    #233 <Method float Math.abs(float)>
	//*  21   31:fconst_2        
	//*  22   32:fcmpg           
	//*  23   33:ifge            37
			return;
	//   24   36:return          
		int i = scrollTo(mVerticalDragY, f, ai, mRecyclerView.computeVerticalScrollRange(), mRecyclerView.computeVerticalScrollOffset(), mRecyclerViewHeight);
	//   25   37:aload_0         
	//   26   38:aload_0         
	//   27   39:getfield        #275 <Field float mVerticalDragY>
	//   28   42:fload_1         
	//   29   43:aload_3         
	//   30   44:aload_0         
	//   31   45:getfield        #161 <Field RecyclerView mRecyclerView>
	//   32   48:invokevirtual   #278 <Method int RecyclerView.computeVerticalScrollRange()>
	//   33   51:aload_0         
	//   34   52:getfield        #161 <Field RecyclerView mRecyclerView>
	//   35   55:invokevirtual   #281 <Method int RecyclerView.computeVerticalScrollOffset()>
	//   36   58:aload_0         
	//   37   59:getfield        #74  <Field int mRecyclerViewHeight>
	//   38   62:invokespecial   #245 <Method int scrollTo(float, float, int[], int, int, int)>
	//   39   65:istore_2        
		if(i != 0)
	//*  40   66:iload_2         
	//*  41   67:ifeq            79
			mRecyclerView.scrollBy(0, i);
	//   42   70:aload_0         
	//   43   71:getfield        #161 <Field RecyclerView mRecyclerView>
	//   44   74:iconst_0        
	//   45   75:iload_2         
	//   46   76:invokevirtual   #249 <Method void RecyclerView.scrollBy(int, int)>
		mVerticalDragY = f;
	//   47   79:aload_0         
	//   48   80:fload_1         
	//   49   81:putfield        #275 <Field float mVerticalDragY>
	//   50   84:return          
	}

	public void attachToRecyclerView(RecyclerView recyclerview)
	{
		RecyclerView recyclerview1 = mRecyclerView;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field RecyclerView mRecyclerView>
	//    2    4:astore_2        
		if(recyclerview1 == recyclerview)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpne       11
			return;
	//    6   10:return          
		if(recyclerview1 != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          19
			destroyCallbacks();
	//    9   15:aload_0         
	//   10   16:invokespecial   #284 <Method void destroyCallbacks()>
		mRecyclerView = recyclerview;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #161 <Field RecyclerView mRecyclerView>
		if(mRecyclerView != null)
	//*  14   24:aload_0         
	//*  15   25:getfield        #161 <Field RecyclerView mRecyclerView>
	//*  16   28:ifnull          35
			setupCallbacks();
	//   17   31:aload_0         
	//   18   32:invokespecial   #286 <Method void setupCallbacks()>
	//   19   35:return          
	}

	void hide(int i)
	{
		switch(mAnimationState)
	//*   0    0:aload_0         
	//*   1    1:getfield        #96  <Field int mAnimationState>
		{
	//*   2    4:tableswitch     1 2: default 28
	//	               1 29
	//	               2 36
		default:
			return;
	//    3   28:return          

		case 1: // '\001'
			mShowHideAnimator.cancel();
	//    4   29:aload_0         
	//    5   30:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//    6   33:invokevirtual   #291 <Method void ValueAnimator.cancel()>
			// fall through

		case 2: // '\002'
			mAnimationState = 3;
	//    7   36:aload_0         
	//    8   37:iconst_3        
	//    9   38:putfield        #96  <Field int mAnimationState>
			break;
		}
		ValueAnimator valueanimator = mShowHideAnimator;
	//   10   41:aload_0         
	//   11   42:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   12   45:astore_2        
		valueanimator.setFloatValues(new float[] {
			((Float)valueanimator.getAnimatedValue()).floatValue(), 0.0F
		});
	//   13   46:aload_2         
	//   14   47:iconst_2        
	//   15   48:newarray        float[]
	//   16   50:dup             
	//   17   51:iconst_0        
	//   18   52:aload_2         
	//   19   53:invokevirtual   #295 <Method Object ValueAnimator.getAnimatedValue()>
	//   20   56:checkcast       #297 <Class Float>
	//   21   59:invokevirtual   #301 <Method float Float.floatValue()>
	//   22   62:fastore         
	//   23   63:dup             
	//   24   64:iconst_1        
	//   25   65:fconst_0        
	//   26   66:fastore         
	//   27   67:invokevirtual   #305 <Method void ValueAnimator.setFloatValues(float[])>
		mShowHideAnimator.setDuration(i);
	//   28   70:aload_0         
	//   29   71:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   30   74:iload_1         
	//   31   75:i2l             
	//   32   76:invokevirtual   #309 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   33   79:pop             
		mShowHideAnimator.start();
	//   34   80:aload_0         
	//   35   81:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   36   84:invokevirtual   #312 <Method void ValueAnimator.start()>
	//   37   87:return          
	}

	boolean isPointInsideHorizontalThumb(float f, float f1)
	{
		if(f1 >= (float)(mRecyclerViewHeight - mHorizontalThumbHeight))
	//*   0    0:fload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #74  <Field int mRecyclerViewHeight>
	//*   3    5:aload_0         
	//*   4    6:getfield        #133 <Field int mHorizontalThumbHeight>
	//*   5    9:isub            
	//*   6   10:i2f             
	//*   7   11:fcmpl           
	//*   8   12:iflt            52
		{
			int i = mHorizontalThumbCenterX;
	//    9   15:aload_0         
	//   10   16:getfield        #186 <Field int mHorizontalThumbCenterX>
	//   11   19:istore_3        
			int j = mHorizontalThumbWidth;
	//   12   20:aload_0         
	//   13   21:getfield        #188 <Field int mHorizontalThumbWidth>
	//   14   24:istore          4
			if(f >= (float)(i - j / 2) && f <= (float)(i + j / 2))
	//*  15   26:fload_1         
	//*  16   27:iload_3         
	//*  17   28:iload           4
	//*  18   30:iconst_2        
	//*  19   31:idiv            
	//*  20   32:isub            
	//*  21   33:i2f             
	//*  22   34:fcmpl           
	//*  23   35:iflt            52
	//*  24   38:fload_1         
	//*  25   39:iload_3         
	//*  26   40:iload           4
	//*  27   42:iconst_2        
	//*  28   43:idiv            
	//*  29   44:iadd            
	//*  30   45:i2f             
	//*  31   46:fcmpg           
	//*  32   47:ifgt            52
				return true;
	//   33   50:iconst_1        
	//   34   51:ireturn         
		}
		return false;
	//   35   52:iconst_0        
	//   36   53:ireturn         
	}

	boolean isPointInsideVerticalThumb(float f, float f1)
	{
		if(isLayoutRTL() ? f <= (float)(mVerticalThumbWidth / 2) : f >= (float)(mRecyclerViewWidth - mVerticalThumbWidth))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #212 <Method boolean isLayoutRTL()>
	//*   2    4:ifeq            22
	//*   3    7:fload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #126 <Field int mVerticalThumbWidth>
	//*   6   12:iconst_2        
	//*   7   13:idiv            
	//*   8   14:i2f             
	//*   9   15:fcmpg           
	//*  10   16:ifgt            74
	//*  11   19:goto            37
	//*  12   22:fload_1         
	//*  13   23:aload_0         
	//*  14   24:getfield        #72  <Field int mRecyclerViewWidth>
	//*  15   27:aload_0         
	//*  16   28:getfield        #126 <Field int mVerticalThumbWidth>
	//*  17   31:isub            
	//*  18   32:i2f             
	//*  19   33:fcmpl           
	//*  20   34:iflt            74
		{
			int i = mVerticalThumbCenterY;
	//   21   37:aload_0         
	//   22   38:getfield        #206 <Field int mVerticalThumbCenterY>
	//   23   41:istore_3        
			int j = mVerticalThumbHeight;
	//   24   42:aload_0         
	//   25   43:getfield        #208 <Field int mVerticalThumbHeight>
	//   26   46:istore          4
			if(f1 >= (float)(i - j / 2) && f1 <= (float)(i + j / 2))
	//*  27   48:fload_2         
	//*  28   49:iload_3         
	//*  29   50:iload           4
	//*  30   52:iconst_2        
	//*  31   53:idiv            
	//*  32   54:isub            
	//*  33   55:i2f             
	//*  34   56:fcmpl           
	//*  35   57:iflt            74
	//*  36   60:fload_2         
	//*  37   61:iload_3         
	//*  38   62:iload           4
	//*  39   64:iconst_2        
	//*  40   65:idiv            
	//*  41   66:iadd            
	//*  42   67:i2f             
	//*  43   68:fcmpg           
	//*  44   69:ifgt            74
				return true;
	//   45   72:iconst_1        
	//   46   73:ireturn         
		}
		return false;
	//   47   74:iconst_0        
	//   48   75:ireturn         
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, RecyclerView.State state)
	{
		if(mRecyclerViewWidth == mRecyclerView.getWidth() && mRecyclerViewHeight == mRecyclerView.getHeight())
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field int mRecyclerViewWidth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #161 <Field RecyclerView mRecyclerView>
	//*   4    8:invokevirtual   #321 <Method int RecyclerView.getWidth()>
	//*   5   11:icmpne          63
	//*   6   14:aload_0         
	//*   7   15:getfield        #74  <Field int mRecyclerViewHeight>
	//*   8   18:aload_0         
	//*   9   19:getfield        #161 <Field RecyclerView mRecyclerView>
	//*  10   22:invokevirtual   #324 <Method int RecyclerView.getHeight()>
	//*  11   25:icmpeq          31
	//*  12   28:goto            63
		{
			if(mAnimationState != 0)
	//*  13   31:aload_0         
	//*  14   32:getfield        #96  <Field int mAnimationState>
	//*  15   35:ifeq            62
			{
				if(mNeedVerticalScrollbar)
	//*  16   38:aload_0         
	//*  17   39:getfield        #76  <Field boolean mNeedVerticalScrollbar>
	//*  18   42:ifeq            50
					drawVerticalScrollbar(canvas);
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:invokespecial   #326 <Method void drawVerticalScrollbar(Canvas)>
				if(mNeedHorizontalScrollbar)
	//*  22   50:aload_0         
	//*  23   51:getfield        #78  <Field boolean mNeedHorizontalScrollbar>
	//*  24   54:ifeq            62
					drawHorizontalScrollbar(canvas);
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:invokespecial   #328 <Method void drawHorizontalScrollbar(Canvas)>
			}
			return;
	//   28   62:return          
		} else
		{
			mRecyclerViewWidth = mRecyclerView.getWidth();
	//   29   63:aload_0         
	//   30   64:aload_0         
	//   31   65:getfield        #161 <Field RecyclerView mRecyclerView>
	//   32   68:invokevirtual   #321 <Method int RecyclerView.getWidth()>
	//   33   71:putfield        #72  <Field int mRecyclerViewWidth>
			mRecyclerViewHeight = mRecyclerView.getHeight();
	//   34   74:aload_0         
	//   35   75:aload_0         
	//   36   76:getfield        #161 <Field RecyclerView mRecyclerView>
	//   37   79:invokevirtual   #324 <Method int RecyclerView.getHeight()>
	//   38   82:putfield        #74  <Field int mRecyclerViewHeight>
			setState(0);
	//   39   85:aload_0         
	//   40   86:iconst_0        
	//   41   87:invokevirtual   #331 <Method void setState(int)>
			return;
	//   42   90:return          
		}
	}

	public boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
	{
		boolean flag;
label0:
		{
			int i = mState;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int mState>
	//    2    4:istore_3        
			boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
			if(i == 1)
	//*   5    8:iload_3         
	//*   6    9:iconst_1        
	//*   7   10:icmpne          116
			{
				boolean flag2 = isPointInsideVerticalThumb(motionevent.getX(), motionevent.getY());
	//    8   13:aload_0         
	//    9   14:aload_2         
	//   10   15:invokevirtual   #339 <Method float MotionEvent.getX()>
	//   11   18:aload_2         
	//   12   19:invokevirtual   #342 <Method float MotionEvent.getY()>
	//   13   22:invokevirtual   #344 <Method boolean isPointInsideVerticalThumb(float, float)>
	//   14   25:istore          6
				boolean flag3 = isPointInsideHorizontalThumb(motionevent.getX(), motionevent.getY());
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #339 <Method float MotionEvent.getX()>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #342 <Method float MotionEvent.getY()>
	//   20   36:invokevirtual   #346 <Method boolean isPointInsideHorizontalThumb(float, float)>
	//   21   39:istore          7
				flag = flag1;
	//   22   41:iload           5
	//   23   43:istore          4
				if(motionevent.getAction() != 0)
					break label0;
	//   24   45:aload_2         
	//   25   46:invokevirtual   #349 <Method int MotionEvent.getAction()>
	//   26   49:ifne            128
				if(!flag2)
	//*  27   52:iload           6
	//*  28   54:ifne            66
				{
					flag = flag1;
	//   29   57:iload           5
	//   30   59:istore          4
					if(!flag3)
						break label0;
	//   31   61:iload           7
	//   32   63:ifeq            128
				}
				if(flag3)
	//*  33   66:iload           7
	//*  34   68:ifeq            89
				{
					mDragState = 1;
	//   35   71:aload_0         
	//   36   72:iconst_1        
	//   37   73:putfield        #82  <Field int mDragState>
					mHorizontalDragX = (int)motionevent.getX();
	//   38   76:aload_0         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #339 <Method float MotionEvent.getX()>
	//   41   81:f2i             
	//   42   82:i2f             
	//   43   83:putfield        #235 <Field float mHorizontalDragX>
				} else
	//*  44   86:goto            109
				if(flag2)
	//*  45   89:iload           6
	//*  46   91:ifeq            109
				{
					mDragState = 2;
	//   47   94:aload_0         
	//   48   95:iconst_2        
	//   49   96:putfield        #82  <Field int mDragState>
					mVerticalDragY = (int)motionevent.getY();
	//   50   99:aload_0         
	//   51  100:aload_2         
	//   52  101:invokevirtual   #342 <Method float MotionEvent.getY()>
	//   53  104:f2i             
	//   54  105:i2f             
	//   55  106:putfield        #275 <Field float mVerticalDragY>
				}
				setState(2);
	//   56  109:aload_0         
	//   57  110:iconst_2        
	//   58  111:invokevirtual   #331 <Method void setState(int)>
				return true;
	//   59  114:iconst_1        
	//   60  115:ireturn         
			}
			flag = flag1;
	//   61  116:iload           5
	//   62  118:istore          4
			if(i == 2)
	//*  63  120:iload_3         
	//*  64  121:iconst_2        
	//*  65  122:icmpne          128
				flag = true;
	//   66  125:iconst_1        
	//   67  126:istore          4
		}
		return flag;
	//   68  128:iload           4
	//   69  130:ireturn         
	}

	public void onRequestDisallowInterceptTouchEvent(boolean flag)
	{
	//    0    0:return          
	}

	public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
	{
		if(mState == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #80  <Field int mState>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(motionevent.getAction() == 0)
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #349 <Method int MotionEvent.getAction()>
	//*   6   12:ifne            99
		{
			boolean flag = isPointInsideVerticalThumb(motionevent.getX(), motionevent.getY());
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #339 <Method float MotionEvent.getX()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #342 <Method float MotionEvent.getY()>
	//   12   24:invokevirtual   #344 <Method boolean isPointInsideVerticalThumb(float, float)>
	//   13   27:istore_3        
			boolean flag1 = isPointInsideHorizontalThumb(motionevent.getX(), motionevent.getY());
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #339 <Method float MotionEvent.getX()>
	//   17   33:aload_2         
	//   18   34:invokevirtual   #342 <Method float MotionEvent.getY()>
	//   19   37:invokevirtual   #346 <Method boolean isPointInsideHorizontalThumb(float, float)>
	//   20   40:istore          4
			if(flag || flag1)
	//*  21   42:iload_3         
	//*  22   43:ifne            51
	//*  23   46:iload           4
	//*  24   48:ifeq            188
			{
				if(flag1)
	//*  25   51:iload           4
	//*  26   53:ifeq            74
				{
					mDragState = 1;
	//   27   56:aload_0         
	//   28   57:iconst_1        
	//   29   58:putfield        #82  <Field int mDragState>
					mHorizontalDragX = (int)motionevent.getX();
	//   30   61:aload_0         
	//   31   62:aload_2         
	//   32   63:invokevirtual   #339 <Method float MotionEvent.getX()>
	//   33   66:f2i             
	//   34   67:i2f             
	//   35   68:putfield        #235 <Field float mHorizontalDragX>
				} else
	//*  36   71:goto            93
				if(flag)
	//*  37   74:iload_3         
	//*  38   75:ifeq            93
				{
					mDragState = 2;
	//   39   78:aload_0         
	//   40   79:iconst_2        
	//   41   80:putfield        #82  <Field int mDragState>
					mVerticalDragY = (int)motionevent.getY();
	//   42   83:aload_0         
	//   43   84:aload_2         
	//   44   85:invokevirtual   #342 <Method float MotionEvent.getY()>
	//   45   88:f2i             
	//   46   89:i2f             
	//   47   90:putfield        #275 <Field float mVerticalDragY>
				}
				setState(2);
	//   48   93:aload_0         
	//   49   94:iconst_2        
	//   50   95:invokevirtual   #331 <Method void setState(int)>
				return;
	//   51   98:return          
			}
		} else
		{
			if(motionevent.getAction() == 1 && mState == 2)
	//*  52   99:aload_2         
	//*  53  100:invokevirtual   #349 <Method int MotionEvent.getAction()>
	//*  54  103:iconst_1        
	//*  55  104:icmpne          136
	//*  56  107:aload_0         
	//*  57  108:getfield        #80  <Field int mState>
	//*  58  111:iconst_2        
	//*  59  112:icmpne          136
			{
				mVerticalDragY = 0.0F;
	//   60  115:aload_0         
	//   61  116:fconst_0        
	//   62  117:putfield        #275 <Field float mVerticalDragY>
				mHorizontalDragX = 0.0F;
	//   63  120:aload_0         
	//   64  121:fconst_0        
	//   65  122:putfield        #235 <Field float mHorizontalDragX>
				setState(1);
	//   66  125:aload_0         
	//   67  126:iconst_1        
	//   68  127:invokevirtual   #331 <Method void setState(int)>
				mDragState = 0;
	//   69  130:aload_0         
	//   70  131:iconst_0        
	//   71  132:putfield        #82  <Field int mDragState>
				return;
	//   72  135:return          
			}
			if(motionevent.getAction() == 2 && mState == 2)
	//*  73  136:aload_2         
	//*  74  137:invokevirtual   #349 <Method int MotionEvent.getAction()>
	//*  75  140:iconst_2        
	//*  76  141:icmpne          188
	//*  77  144:aload_0         
	//*  78  145:getfield        #80  <Field int mState>
	//*  79  148:iconst_2        
	//*  80  149:icmpne          188
			{
				show();
	//   81  152:aload_0         
	//   82  153:invokevirtual   #356 <Method void show()>
				if(mDragState == 1)
	//*  83  156:aload_0         
	//*  84  157:getfield        #82  <Field int mDragState>
	//*  85  160:iconst_1        
	//*  86  161:icmpne          172
					horizontalScrollTo(motionevent.getX());
	//   87  164:aload_0         
	//   88  165:aload_2         
	//   89  166:invokevirtual   #339 <Method float MotionEvent.getX()>
	//   90  169:invokespecial   #358 <Method void horizontalScrollTo(float)>
				if(mDragState == 2)
	//*  91  172:aload_0         
	//*  92  173:getfield        #82  <Field int mDragState>
	//*  93  176:iconst_2        
	//*  94  177:icmpne          188
					verticalScrollTo(motionevent.getY());
	//   95  180:aload_0         
	//   96  181:aload_2         
	//   97  182:invokevirtual   #342 <Method float MotionEvent.getY()>
	//   98  185:invokespecial   #360 <Method void verticalScrollTo(float)>
			}
		}
	//   99  188:return          
	}

	void requestRedraw()
	{
		mRecyclerView.invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #364 <Method void RecyclerView.invalidate()>
	//    3    7:return          
	}

	void setState(int i)
	{
		if(i == 2 && mState != 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          28
	//*   3    5:aload_0         
	//*   4    6:getfield        #80  <Field int mState>
	//*   5    9:iconst_2        
	//*   6   10:icmpeq          28
		{
			mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
	//    7   13:aload_0         
	//    8   14:getfield        #106 <Field StateListDrawable mVerticalThumbDrawable>
	//    9   17:getstatic       #63  <Field int[] PRESSED_STATE_SET>
	//   10   20:invokevirtual   #367 <Method boolean StateListDrawable.setState(int[])>
	//   11   23:pop             
			cancelHide();
	//   12   24:aload_0         
	//   13   25:invokespecial   #182 <Method void cancelHide()>
		}
		if(i == 0)
	//*  14   28:iload_1         
	//*  15   29:ifne            39
			requestRedraw();
	//   16   32:aload_0         
	//   17   33:invokevirtual   #369 <Method void requestRedraw()>
		else
	//*  18   36:goto            43
			show();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #356 <Method void show()>
		if(mState == 2 && i != 2)
	//*  21   43:aload_0         
	//*  22   44:getfield        #80  <Field int mState>
	//*  23   47:iconst_2        
	//*  24   48:icmpne          77
	//*  25   51:iload_1         
	//*  26   52:iconst_2        
	//*  27   53:icmpeq          77
		{
			mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
	//   28   56:aload_0         
	//   29   57:getfield        #106 <Field StateListDrawable mVerticalThumbDrawable>
	//   30   60:getstatic       #65  <Field int[] EMPTY_STATE_SET>
	//   31   63:invokevirtual   #367 <Method boolean StateListDrawable.setState(int[])>
	//   32   66:pop             
			resetHideDelay(1200);
	//   33   67:aload_0         
	//   34   68:sipush          1200
	//   35   71:invokespecial   #371 <Method void resetHideDelay(int)>
		} else
	//*  36   74:goto            89
		if(i == 1)
	//*  37   77:iload_1         
	//*  38   78:iconst_1        
	//*  39   79:icmpne          89
			resetHideDelay(1500);
	//   40   82:aload_0         
	//   41   83:sipush          1500
	//   42   86:invokespecial   #371 <Method void resetHideDelay(int)>
		mState = i;
	//   43   89:aload_0         
	//   44   90:iload_1         
	//   45   91:putfield        #80  <Field int mState>
	//   46   94:return          
	}

	public void show()
	{
		int i = mAnimationState;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field int mAnimationState>
	//    2    4:istore_1        
		if(i != 0)
	//*   3    5:iload_1         
	//*   4    6:ifeq            22
		{
			if(i != 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpeq          15
				return;
	//    8   14:return          
			mShowHideAnimator.cancel();
	//    9   15:aload_0         
	//   10   16:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   11   19:invokevirtual   #291 <Method void ValueAnimator.cancel()>
		}
		mAnimationState = 1;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #96  <Field int mAnimationState>
		ValueAnimator valueanimator = mShowHideAnimator;
	//   15   27:aload_0         
	//   16   28:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   17   31:astore_2        
		valueanimator.setFloatValues(new float[] {
			((Float)valueanimator.getAnimatedValue()).floatValue(), 1.0F
		});
	//   18   32:aload_2         
	//   19   33:iconst_2        
	//   20   34:newarray        float[]
	//   21   36:dup             
	//   22   37:iconst_0        
	//   23   38:aload_2         
	//   24   39:invokevirtual   #295 <Method Object ValueAnimator.getAnimatedValue()>
	//   25   42:checkcast       #297 <Class Float>
	//   26   45:invokevirtual   #301 <Method float Float.floatValue()>
	//   27   48:fastore         
	//   28   49:dup             
	//   29   50:iconst_1        
	//   30   51:fconst_1        
	//   31   52:fastore         
	//   32   53:invokevirtual   #305 <Method void ValueAnimator.setFloatValues(float[])>
		mShowHideAnimator.setDuration(500L);
	//   33   56:aload_0         
	//   34   57:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   35   60:ldc2w           #372 <Long 500L>
	//   36   63:invokevirtual   #309 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   37   66:pop             
		mShowHideAnimator.setStartDelay(0L);
	//   38   67:aload_0         
	//   39   68:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   40   71:lconst_0        
	//   41   72:invokevirtual   #377 <Method void ValueAnimator.setStartDelay(long)>
		mShowHideAnimator.start();
	//   42   75:aload_0         
	//   43   76:getfield        #94  <Field ValueAnimator mShowHideAnimator>
	//   44   79:invokevirtual   #312 <Method void ValueAnimator.start()>
	//   45   82:return          
	}

	void updateScrollPosition(int i, int j)
	{
		int k = mRecyclerView.computeVerticalScrollRange();
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #278 <Method int RecyclerView.computeVerticalScrollRange()>
	//    3    7:istore          5
		int l = mRecyclerViewHeight;
	//    4    9:aload_0         
	//    5   10:getfield        #74  <Field int mRecyclerViewHeight>
	//    6   13:istore          6
		boolean flag;
		if(k - l > 0 && l >= mScrollbarMinimumRange)
	//*   7   15:iload           5
	//*   8   17:iload           6
	//*   9   19:isub            
	//*  10   20:ifle            38
	//*  11   23:iload           6
	//*  12   25:aload_0         
	//*  13   26:getfield        #137 <Field int mScrollbarMinimumRange>
	//*  14   29:icmplt          38
			flag = true;
	//   15   32:iconst_1        
	//   16   33:istore          9
		else
	//*  17   35:goto            41
			flag = false;
	//   18   38:iconst_0        
	//   19   39:istore          9
		mNeedVerticalScrollbar = flag;
	//   20   41:aload_0         
	//   21   42:iload           9
	//   22   44:putfield        #76  <Field boolean mNeedVerticalScrollbar>
		int i1 = mRecyclerView.computeHorizontalScrollRange();
	//   23   47:aload_0         
	//   24   48:getfield        #161 <Field RecyclerView mRecyclerView>
	//   25   51:invokevirtual   #238 <Method int RecyclerView.computeHorizontalScrollRange()>
	//   26   54:istore          7
		int j1 = mRecyclerViewWidth;
	//   27   56:aload_0         
	//   28   57:getfield        #72  <Field int mRecyclerViewWidth>
	//   29   60:istore          8
		if(i1 - j1 > 0 && j1 >= mScrollbarMinimumRange)
	//*  30   62:iload           7
	//*  31   64:iload           8
	//*  32   66:isub            
	//*  33   67:ifle            85
	//*  34   70:iload           8
	//*  35   72:aload_0         
	//*  36   73:getfield        #137 <Field int mScrollbarMinimumRange>
	//*  37   76:icmplt          85
			flag = true;
	//   38   79:iconst_1        
	//   39   80:istore          9
		else
	//*  40   82:goto            88
			flag = false;
	//   41   85:iconst_0        
	//   42   86:istore          9
		mNeedHorizontalScrollbar = flag;
	//   43   88:aload_0         
	//   44   89:iload           9
	//   45   91:putfield        #78  <Field boolean mNeedHorizontalScrollbar>
		if(!mNeedVerticalScrollbar && !mNeedHorizontalScrollbar)
	//*  46   94:aload_0         
	//*  47   95:getfield        #76  <Field boolean mNeedVerticalScrollbar>
	//*  48   98:ifne            121
	//*  49  101:aload_0         
	//*  50  102:getfield        #78  <Field boolean mNeedHorizontalScrollbar>
	//*  51  105:ifne            121
		{
			if(mState != 0)
	//*  52  108:aload_0         
	//*  53  109:getfield        #80  <Field int mState>
	//*  54  112:ifeq            120
				setState(0);
	//   55  115:aload_0         
	//   56  116:iconst_0        
	//   57  117:invokevirtual   #331 <Method void setState(int)>
			return;
	//   58  120:return          
		}
		if(mNeedVerticalScrollbar)
	//*  59  121:aload_0         
	//*  60  122:getfield        #76  <Field boolean mNeedVerticalScrollbar>
	//*  61  125:ifeq            171
		{
			float f = j;
	//   62  128:iload_2         
	//   63  129:i2f             
	//   64  130:fstore_3        
			float f2 = l;
	//   65  131:iload           6
	//   66  133:i2f             
	//   67  134:fstore          4
			mVerticalThumbCenterY = (int)((f2 * (f + f2 / 2.0F)) / (float)k);
	//   68  136:aload_0         
	//   69  137:fload           4
	//   70  139:fload_3         
	//   71  140:fload           4
	//   72  142:fconst_2        
	//   73  143:fdiv            
	//   74  144:fadd            
	//   75  145:fmul            
	//   76  146:iload           5
	//   77  148:i2f             
	//   78  149:fdiv            
	//   79  150:f2i             
	//   80  151:putfield        #206 <Field int mVerticalThumbCenterY>
			mVerticalThumbHeight = Math.min(l, (l * l) / k);
	//   81  154:aload_0         
	//   82  155:iload           6
	//   83  157:iload           6
	//   84  159:iload           6
	//   85  161:imul            
	//   86  162:iload           5
	//   87  164:idiv            
	//   88  165:invokestatic    #380 <Method int Math.min(int, int)>
	//   89  168:putfield        #208 <Field int mVerticalThumbHeight>
		}
		if(mNeedHorizontalScrollbar)
	//*  90  171:aload_0         
	//*  91  172:getfield        #78  <Field boolean mNeedHorizontalScrollbar>
	//*  92  175:ifeq            221
		{
			float f1 = i;
	//   93  178:iload_1         
	//   94  179:i2f             
	//   95  180:fstore_3        
			float f3 = j1;
	//   96  181:iload           8
	//   97  183:i2f             
	//   98  184:fstore          4
			mHorizontalThumbCenterX = (int)((f3 * (f1 + f3 / 2.0F)) / (float)i1);
	//   99  186:aload_0         
	//  100  187:fload           4
	//  101  189:fload_3         
	//  102  190:fload           4
	//  103  192:fconst_2        
	//  104  193:fdiv            
	//  105  194:fadd            
	//  106  195:fmul            
	//  107  196:iload           7
	//  108  198:i2f             
	//  109  199:fdiv            
	//  110  200:f2i             
	//  111  201:putfield        #186 <Field int mHorizontalThumbCenterX>
			mHorizontalThumbWidth = Math.min(j1, (j1 * j1) / i1);
	//  112  204:aload_0         
	//  113  205:iload           8
	//  114  207:iload           8
	//  115  209:iload           8
	//  116  211:imul            
	//  117  212:iload           7
	//  118  214:idiv            
	//  119  215:invokestatic    #380 <Method int Math.min(int, int)>
	//  120  218:putfield        #188 <Field int mHorizontalThumbWidth>
		}
		i = mState;
	//  121  221:aload_0         
	//  122  222:getfield        #80  <Field int mState>
	//  123  225:istore_1        
		if(i == 0 || i == 1)
	//* 124  226:iload_1         
	//* 125  227:ifeq            235
	//* 126  230:iload_1         
	//* 127  231:iconst_1        
	//* 128  232:icmpne          240
			setState(1);
	//  129  235:aload_0         
	//  130  236:iconst_1        
	//  131  237:invokevirtual   #331 <Method void setState(int)>
	//  132  240:return          
	}

	private static final int EMPTY_STATE_SET[] = new int[0];
	private static final int PRESSED_STATE_SET[] = {
		0x10100a7
	};
	int mAnimationState;
	private int mDragState;
	private final Runnable mHideRunnable = new Runnable() {

		public void run()
		{
			hide(500);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field FastScroller this$0>
		//    2    4:sipush          500
		//    3    7:invokevirtual   #23  <Method void FastScroller.hide(int)>
		//    4   10:return          
		}

		final FastScroller this$0;

			
			{
				this$0 = FastScroller.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field FastScroller this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	float mHorizontalDragX;
	private final int mHorizontalRange[] = new int[2];
	int mHorizontalThumbCenterX;
	private final StateListDrawable mHorizontalThumbDrawable;
	private final int mHorizontalThumbHeight;
	int mHorizontalThumbWidth;
	private final Drawable mHorizontalTrackDrawable;
	private final int mHorizontalTrackHeight;
	private final int mMargin;
	private boolean mNeedHorizontalScrollbar;
	private boolean mNeedVerticalScrollbar;
	private final RecyclerView.OnScrollListener mOnScrollListener = new RecyclerView.OnScrollListener() {

		public void onScrolled(RecyclerView recyclerview1, int l, int i1)
		{
			updateScrollPosition(recyclerview1.computeHorizontalScrollOffset(), recyclerview1.computeVerticalScrollOffset());
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field FastScroller this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #24  <Method int RecyclerView.computeHorizontalScrollOffset()>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #27  <Method int RecyclerView.computeVerticalScrollOffset()>
		//    6   12:invokevirtual   #31  <Method void FastScroller.updateScrollPosition(int, int)>
		//    7   15:return          
		}

		final FastScroller this$0;

			
			{
				this$0 = FastScroller.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field FastScroller this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void RecyclerView$OnScrollListener()>
			//    5    9:return          
			}
	}
;
	private RecyclerView mRecyclerView;
	private int mRecyclerViewHeight;
	private int mRecyclerViewWidth;
	private final int mScrollbarMinimumRange;
	final ValueAnimator mShowHideAnimator = ValueAnimator.ofFloat(new float[] {
		0.0F, 1.0F
	});
	private int mState;
	float mVerticalDragY;
	private final int mVerticalRange[] = new int[2];
	int mVerticalThumbCenterY;
	final StateListDrawable mVerticalThumbDrawable;
	int mVerticalThumbHeight;
	private final int mVerticalThumbWidth;
	final Drawable mVerticalTrackDrawable;
	private final int mVerticalTrackWidth;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #61  <Int 0x10100a7>
	//    5    7:iastore         
	//    6    8:putstatic       #63  <Field int[] PRESSED_STATE_SET>
	//    7   11:iconst_0        
	//    8   12:newarray        int[]
	//    9   14:putstatic       #65  <Field int[] EMPTY_STATE_SET>
	//*  10   17:return          
	}
}
