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
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

class FastScroller extends RecyclerView.ItemDecoration
	implements RecyclerView.OnItemTouchListener
{
	private static interface AnimationState
		extends Annotation
	{
	}

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
		//*   9   17:invokestatic    #31  <Method ValueAnimator FastScroller.access$200(FastScroller)>
		//*  10   20:invokevirtual   #37  <Method Object ValueAnimator.getAnimatedValue()>
		//*  11   23:checkcast       #39  <Class Float>
		//*  12   26:invokevirtual   #43  <Method float Float.floatValue()>
		//*  13   29:fconst_0        
		//*  14   30:fcmpl           
		//*  15   31:ifne            52
			{
				mAnimationState = 0;
		//   16   34:aload_0         
		//   17   35:getfield        #15  <Field FastScroller this$0>
		//   18   38:iconst_0        
		//   19   39:invokestatic    #47  <Method int FastScroller.access$302(FastScroller, int)>
		//   20   42:pop             
				setState(0);
		//   21   43:aload_0         
		//   22   44:getfield        #15  <Field FastScroller this$0>
		//   23   47:iconst_0        
		//   24   48:invokestatic    #51  <Method void FastScroller.access$400(FastScroller, int)>
				return;
		//   25   51:return          
			} else
			{
				mAnimationState = 2;
		//   26   52:aload_0         
		//   27   53:getfield        #15  <Field FastScroller this$0>
		//   28   56:iconst_2        
		//   29   57:invokestatic    #47  <Method int FastScroller.access$302(FastScroller, int)>
		//   30   60:pop             
				requestRedraw();
		//   31   61:aload_0         
		//   32   62:getfield        #15  <Field FastScroller this$0>
		//   33   65:invokestatic    #54  <Method void FastScroller.access$500(FastScroller)>
				return;
		//   34   68:return          
			}
		}

		private boolean mCanceled;
		final FastScroller this$0;

		private AnimatorListener()
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
			int i = (int)(255F * ((Float)valueanimator.getAnimatedValue()).floatValue());
		//    0    0:ldc1            #25  <Float 255F>
		//    1    2:aload_1         
		//    2    3:invokevirtual   #31  <Method Object ValueAnimator.getAnimatedValue()>
		//    3    6:checkcast       #33  <Class Float>
		//    4    9:invokevirtual   #37  <Method float Float.floatValue()>
		//    5   12:fmul            
		//    6   13:f2i             
		//    7   14:istore_2        
			mVerticalThumbDrawable.setAlpha(i);
		//    8   15:aload_0         
		//    9   16:getfield        #15  <Field FastScroller this$0>
		//   10   19:invokestatic    #41  <Method StateListDrawable FastScroller.access$600(FastScroller)>
		//   11   22:iload_2         
		//   12   23:invokevirtual   #47  <Method void StateListDrawable.setAlpha(int)>
			mVerticalTrackDrawable.setAlpha(i);
		//   13   26:aload_0         
		//   14   27:getfield        #15  <Field FastScroller this$0>
		//   15   30:invokestatic    #51  <Method Drawable FastScroller.access$700(FastScroller)>
		//   16   33:iload_2         
		//   17   34:invokevirtual   #54  <Method void Drawable.setAlpha(int)>
			requestRedraw();
		//   18   37:aload_0         
		//   19   38:getfield        #15  <Field FastScroller this$0>
		//   20   41:invokestatic    #57  <Method void FastScroller.access$500(FastScroller)>
		//   21   44:return          
		}

		final FastScroller this$0;

		private AnimatorUpdater()
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

	private static interface DragState
		extends Annotation
	{
	}

	private static interface State
		extends Annotation
	{
	}


	FastScroller(RecyclerView recyclerview, StateListDrawable statelistdrawable, Drawable drawable, StateListDrawable statelistdrawable1, Drawable drawable1, int i, int j, 
			int k)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #102 <Method void RecyclerView$ItemDecoration()>
		mRecyclerViewWidth = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #104 <Field int mRecyclerViewWidth>
		mRecyclerViewHeight = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #106 <Field int mRecyclerViewHeight>
		mNeedVerticalScrollbar = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #108 <Field boolean mNeedVerticalScrollbar>
		mNeedHorizontalScrollbar = false;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #110 <Field boolean mNeedHorizontalScrollbar>
		mState = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #112 <Field int mState>
		mDragState = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #114 <Field int mDragState>
	//   20   34:aload_0         
	//   21   35:iconst_2        
	//   22   36:newarray        int[]
	//   23   38:putfield        #116 <Field int[] mVerticalRange>
	//   24   41:aload_0         
	//   25   42:iconst_2        
	//   26   43:newarray        int[]
	//   27   45:putfield        #118 <Field int[] mHorizontalRange>
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
	//   39   60:invokestatic    #124 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   40   63:putfield        #126 <Field ValueAnimator mShowHideAnimator>
		mAnimationState = 0;
	//   41   66:aload_0         
	//   42   67:iconst_0        
	//   43   68:putfield        #128 <Field int mAnimationState>
	//   44   71:aload_0         
	//   45   72:new             #8   <Class FastScroller$1>
	//   46   75:dup             
	//   47   76:aload_0         
	//   48   77:invokespecial   #131 <Method void FastScroller$1(FastScroller)>
	//   49   80:putfield        #133 <Field Runnable mHideRunnable>
	//   50   83:aload_0         
	//   51   84:new             #10  <Class FastScroller$2>
	//   52   87:dup             
	//   53   88:aload_0         
	//   54   89:invokespecial   #134 <Method void FastScroller$2(FastScroller)>
	//   55   92:putfield        #136 <Field RecyclerView$OnScrollListener mOnScrollListener>
		mVerticalThumbDrawable = statelistdrawable;
	//   56   95:aload_0         
	//   57   96:aload_2         
	//   58   97:putfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
		mVerticalTrackDrawable = drawable;
	//   59  100:aload_0         
	//   60  101:aload_3         
	//   61  102:putfield        #140 <Field Drawable mVerticalTrackDrawable>
		mHorizontalThumbDrawable = statelistdrawable1;
	//   62  105:aload_0         
	//   63  106:aload           4
	//   64  108:putfield        #142 <Field StateListDrawable mHorizontalThumbDrawable>
		mHorizontalTrackDrawable = drawable1;
	//   65  111:aload_0         
	//   66  112:aload           5
	//   67  114:putfield        #144 <Field Drawable mHorizontalTrackDrawable>
		mVerticalThumbWidth = Math.max(i, statelistdrawable.getIntrinsicWidth());
	//   68  117:aload_0         
	//   69  118:iload           6
	//   70  120:aload_2         
	//   71  121:invokevirtual   #150 <Method int StateListDrawable.getIntrinsicWidth()>
	//   72  124:invokestatic    #156 <Method int Math.max(int, int)>
	//   73  127:putfield        #158 <Field int mVerticalThumbWidth>
		mVerticalTrackWidth = Math.max(i, drawable.getIntrinsicWidth());
	//   74  130:aload_0         
	//   75  131:iload           6
	//   76  133:aload_3         
	//   77  134:invokevirtual   #161 <Method int Drawable.getIntrinsicWidth()>
	//   78  137:invokestatic    #156 <Method int Math.max(int, int)>
	//   79  140:putfield        #163 <Field int mVerticalTrackWidth>
		mHorizontalThumbHeight = Math.max(i, statelistdrawable1.getIntrinsicWidth());
	//   80  143:aload_0         
	//   81  144:iload           6
	//   82  146:aload           4
	//   83  148:invokevirtual   #150 <Method int StateListDrawable.getIntrinsicWidth()>
	//   84  151:invokestatic    #156 <Method int Math.max(int, int)>
	//   85  154:putfield        #165 <Field int mHorizontalThumbHeight>
		mHorizontalTrackHeight = Math.max(i, drawable1.getIntrinsicWidth());
	//   86  157:aload_0         
	//   87  158:iload           6
	//   88  160:aload           5
	//   89  162:invokevirtual   #161 <Method int Drawable.getIntrinsicWidth()>
	//   90  165:invokestatic    #156 <Method int Math.max(int, int)>
	//   91  168:putfield        #167 <Field int mHorizontalTrackHeight>
		mScrollbarMinimumRange = j;
	//   92  171:aload_0         
	//   93  172:iload           7
	//   94  174:putfield        #169 <Field int mScrollbarMinimumRange>
		mMargin = k;
	//   95  177:aload_0         
	//   96  178:iload           8
	//   97  180:putfield        #171 <Field int mMargin>
		mVerticalThumbDrawable.setAlpha(255);
	//   98  183:aload_0         
	//   99  184:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//  100  187:sipush          255
	//  101  190:invokevirtual   #175 <Method void StateListDrawable.setAlpha(int)>
		mVerticalTrackDrawable.setAlpha(255);
	//  102  193:aload_0         
	//  103  194:getfield        #140 <Field Drawable mVerticalTrackDrawable>
	//  104  197:sipush          255
	//  105  200:invokevirtual   #176 <Method void Drawable.setAlpha(int)>
		mShowHideAnimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListener())));
	//  106  203:aload_0         
	//  107  204:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//  108  207:new             #15  <Class FastScroller$AnimatorListener>
	//  109  210:dup             
	//  110  211:aload_0         
	//  111  212:aconst_null     
	//  112  213:invokespecial   #179 <Method void FastScroller$AnimatorListener(FastScroller, FastScroller$1)>
	//  113  216:invokevirtual   #183 <Method void ValueAnimator.addListener(android.animation.Animator$AnimatorListener)>
		mShowHideAnimator.addUpdateListener(((android.animation.ValueAnimator.AnimatorUpdateListener) (new AnimatorUpdater())));
	//  114  219:aload_0         
	//  115  220:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//  116  223:new             #18  <Class FastScroller$AnimatorUpdater>
	//  117  226:dup             
	//  118  227:aload_0         
	//  119  228:aconst_null     
	//  120  229:invokespecial   #184 <Method void FastScroller$AnimatorUpdater(FastScroller, FastScroller$1)>
	//  121  232:invokevirtual   #188 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
		attachToRecyclerView(recyclerview);
	//  122  235:aload_0         
	//  123  236:aload_1         
	//  124  237:invokevirtual   #192 <Method void attachToRecyclerView(RecyclerView)>
	//  125  240:return          
	}

	private void cancelHide()
	{
		mRecyclerView.removeCallbacks(mHideRunnable);
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:getfield        #133 <Field Runnable mHideRunnable>
	//    4    8:invokevirtual   #218 <Method boolean RecyclerView.removeCallbacks(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void destroyCallbacks()
	{
		mRecyclerView.removeItemDecoration(((RecyclerView.ItemDecoration) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #223 <Method void RecyclerView.removeItemDecoration(RecyclerView$ItemDecoration)>
		mRecyclerView.removeOnItemTouchListener(((RecyclerView.OnItemTouchListener) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #212 <Field RecyclerView mRecyclerView>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #227 <Method void RecyclerView.removeOnItemTouchListener(RecyclerView$OnItemTouchListener)>
		mRecyclerView.removeOnScrollListener(mOnScrollListener);
	//    8   16:aload_0         
	//    9   17:getfield        #212 <Field RecyclerView mRecyclerView>
	//   10   20:aload_0         
	//   11   21:getfield        #136 <Field RecyclerView$OnScrollListener mOnScrollListener>
	//   12   24:invokevirtual   #231 <Method void RecyclerView.removeOnScrollListener(RecyclerView$OnScrollListener)>
		cancelHide();
	//   13   27:aload_0         
	//   14   28:invokespecial   #233 <Method void cancelHide()>
	//   15   31:return          
	}

	private void drawHorizontalScrollbar(Canvas canvas)
	{
		int i = mRecyclerViewHeight - mHorizontalThumbHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field int mRecyclerViewHeight>
	//    2    4:aload_0         
	//    3    5:getfield        #165 <Field int mHorizontalThumbHeight>
	//    4    8:isub            
	//    5    9:istore_2        
		int j = mHorizontalThumbCenterX - mHorizontalThumbWidth / 2;
	//    6   10:aload_0         
	//    7   11:getfield        #237 <Field int mHorizontalThumbCenterX>
	//    8   14:aload_0         
	//    9   15:getfield        #239 <Field int mHorizontalThumbWidth>
	//   10   18:iconst_2        
	//   11   19:idiv            
	//   12   20:isub            
	//   13   21:istore_3        
		mHorizontalThumbDrawable.setBounds(0, 0, mHorizontalThumbWidth, mHorizontalThumbHeight);
	//   14   22:aload_0         
	//   15   23:getfield        #142 <Field StateListDrawable mHorizontalThumbDrawable>
	//   16   26:iconst_0        
	//   17   27:iconst_0        
	//   18   28:aload_0         
	//   19   29:getfield        #239 <Field int mHorizontalThumbWidth>
	//   20   32:aload_0         
	//   21   33:getfield        #165 <Field int mHorizontalThumbHeight>
	//   22   36:invokevirtual   #243 <Method void StateListDrawable.setBounds(int, int, int, int)>
		mHorizontalTrackDrawable.setBounds(0, 0, mRecyclerViewWidth, mHorizontalTrackHeight);
	//   23   39:aload_0         
	//   24   40:getfield        #144 <Field Drawable mHorizontalTrackDrawable>
	//   25   43:iconst_0        
	//   26   44:iconst_0        
	//   27   45:aload_0         
	//   28   46:getfield        #104 <Field int mRecyclerViewWidth>
	//   29   49:aload_0         
	//   30   50:getfield        #167 <Field int mHorizontalTrackHeight>
	//   31   53:invokevirtual   #244 <Method void Drawable.setBounds(int, int, int, int)>
		canvas.translate(0.0F, i);
	//   32   56:aload_1         
	//   33   57:fconst_0        
	//   34   58:iload_2         
	//   35   59:i2f             
	//   36   60:invokevirtual   #250 <Method void Canvas.translate(float, float)>
		mHorizontalTrackDrawable.draw(canvas);
	//   37   63:aload_0         
	//   38   64:getfield        #144 <Field Drawable mHorizontalTrackDrawable>
	//   39   67:aload_1         
	//   40   68:invokevirtual   #253 <Method void Drawable.draw(Canvas)>
		canvas.translate(j, 0.0F);
	//   41   71:aload_1         
	//   42   72:iload_3         
	//   43   73:i2f             
	//   44   74:fconst_0        
	//   45   75:invokevirtual   #250 <Method void Canvas.translate(float, float)>
		mHorizontalThumbDrawable.draw(canvas);
	//   46   78:aload_0         
	//   47   79:getfield        #142 <Field StateListDrawable mHorizontalThumbDrawable>
	//   48   82:aload_1         
	//   49   83:invokevirtual   #254 <Method void StateListDrawable.draw(Canvas)>
		canvas.translate(-j, -i);
	//   50   86:aload_1         
	//   51   87:iload_3         
	//   52   88:ineg            
	//   53   89:i2f             
	//   54   90:iload_2         
	//   55   91:ineg            
	//   56   92:i2f             
	//   57   93:invokevirtual   #250 <Method void Canvas.translate(float, float)>
	//   58   96:return          
	}

	private void drawVerticalScrollbar(Canvas canvas)
	{
		int i = mRecyclerViewWidth - mVerticalThumbWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #104 <Field int mRecyclerViewWidth>
	//    2    4:aload_0         
	//    3    5:getfield        #158 <Field int mVerticalThumbWidth>
	//    4    8:isub            
	//    5    9:istore_2        
		int j = mVerticalThumbCenterY - mVerticalThumbHeight / 2;
	//    6   10:aload_0         
	//    7   11:getfield        #257 <Field int mVerticalThumbCenterY>
	//    8   14:aload_0         
	//    9   15:getfield        #259 <Field int mVerticalThumbHeight>
	//   10   18:iconst_2        
	//   11   19:idiv            
	//   12   20:isub            
	//   13   21:istore_3        
		mVerticalThumbDrawable.setBounds(0, 0, mVerticalThumbWidth, mVerticalThumbHeight);
	//   14   22:aload_0         
	//   15   23:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//   16   26:iconst_0        
	//   17   27:iconst_0        
	//   18   28:aload_0         
	//   19   29:getfield        #158 <Field int mVerticalThumbWidth>
	//   20   32:aload_0         
	//   21   33:getfield        #259 <Field int mVerticalThumbHeight>
	//   22   36:invokevirtual   #243 <Method void StateListDrawable.setBounds(int, int, int, int)>
		mVerticalTrackDrawable.setBounds(0, 0, mVerticalTrackWidth, mRecyclerViewHeight);
	//   23   39:aload_0         
	//   24   40:getfield        #140 <Field Drawable mVerticalTrackDrawable>
	//   25   43:iconst_0        
	//   26   44:iconst_0        
	//   27   45:aload_0         
	//   28   46:getfield        #163 <Field int mVerticalTrackWidth>
	//   29   49:aload_0         
	//   30   50:getfield        #106 <Field int mRecyclerViewHeight>
	//   31   53:invokevirtual   #244 <Method void Drawable.setBounds(int, int, int, int)>
		if(isLayoutRTL())
	//*  32   56:aload_0         
	//*  33   57:invokespecial   #263 <Method boolean isLayoutRTL()>
	//*  34   60:ifeq            118
		{
			mVerticalTrackDrawable.draw(canvas);
	//   35   63:aload_0         
	//   36   64:getfield        #140 <Field Drawable mVerticalTrackDrawable>
	//   37   67:aload_1         
	//   38   68:invokevirtual   #253 <Method void Drawable.draw(Canvas)>
			canvas.translate(mVerticalThumbWidth, j);
	//   39   71:aload_1         
	//   40   72:aload_0         
	//   41   73:getfield        #158 <Field int mVerticalThumbWidth>
	//   42   76:i2f             
	//   43   77:iload_3         
	//   44   78:i2f             
	//   45   79:invokevirtual   #250 <Method void Canvas.translate(float, float)>
			canvas.scale(-1F, 1.0F);
	//   46   82:aload_1         
	//   47   83:ldc2            #264 <Float -1F>
	//   48   86:fconst_1        
	//   49   87:invokevirtual   #267 <Method void Canvas.scale(float, float)>
			mVerticalThumbDrawable.draw(canvas);
	//   50   90:aload_0         
	//   51   91:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//   52   94:aload_1         
	//   53   95:invokevirtual   #254 <Method void StateListDrawable.draw(Canvas)>
			canvas.scale(1.0F, 1.0F);
	//   54   98:aload_1         
	//   55   99:fconst_1        
	//   56  100:fconst_1        
	//   57  101:invokevirtual   #267 <Method void Canvas.scale(float, float)>
			canvas.translate(-mVerticalThumbWidth, -j);
	//   58  104:aload_1         
	//   59  105:aload_0         
	//   60  106:getfield        #158 <Field int mVerticalThumbWidth>
	//   61  109:ineg            
	//   62  110:i2f             
	//   63  111:iload_3         
	//   64  112:ineg            
	//   65  113:i2f             
	//   66  114:invokevirtual   #250 <Method void Canvas.translate(float, float)>
			return;
	//   67  117:return          
		} else
		{
			canvas.translate(i, 0.0F);
	//   68  118:aload_1         
	//   69  119:iload_2         
	//   70  120:i2f             
	//   71  121:fconst_0        
	//   72  122:invokevirtual   #250 <Method void Canvas.translate(float, float)>
			mVerticalTrackDrawable.draw(canvas);
	//   73  125:aload_0         
	//   74  126:getfield        #140 <Field Drawable mVerticalTrackDrawable>
	//   75  129:aload_1         
	//   76  130:invokevirtual   #253 <Method void Drawable.draw(Canvas)>
			canvas.translate(0.0F, j);
	//   77  133:aload_1         
	//   78  134:fconst_0        
	//   79  135:iload_3         
	//   80  136:i2f             
	//   81  137:invokevirtual   #250 <Method void Canvas.translate(float, float)>
			mVerticalThumbDrawable.draw(canvas);
	//   82  140:aload_0         
	//   83  141:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//   84  144:aload_1         
	//   85  145:invokevirtual   #254 <Method void StateListDrawable.draw(Canvas)>
			canvas.translate(-i, -j);
	//   86  148:aload_1         
	//   87  149:iload_2         
	//   88  150:ineg            
	//   89  151:i2f             
	//   90  152:iload_3         
	//   91  153:ineg            
	//   92  154:i2f             
	//   93  155:invokevirtual   #250 <Method void Canvas.translate(float, float)>
			return;
	//   94  158:return          
		}
	}

	private int[] getHorizontalRange()
	{
		mHorizontalRange[0] = mMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field int[] mHorizontalRange>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #171 <Field int mMargin>
	//    5    9:iastore         
		mHorizontalRange[1] = mRecyclerViewWidth - mMargin;
	//    6   10:aload_0         
	//    7   11:getfield        #118 <Field int[] mHorizontalRange>
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #104 <Field int mRecyclerViewWidth>
	//   11   19:aload_0         
	//   12   20:getfield        #171 <Field int mMargin>
	//   13   23:isub            
	//   14   24:iastore         
		return mHorizontalRange;
	//   15   25:aload_0         
	//   16   26:getfield        #118 <Field int[] mHorizontalRange>
	//   17   29:areturn         
	}

	private int[] getVerticalRange()
	{
		mVerticalRange[0] = mMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int[] mVerticalRange>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #171 <Field int mMargin>
	//    5    9:iastore         
		mVerticalRange[1] = mRecyclerViewHeight - mMargin;
	//    6   10:aload_0         
	//    7   11:getfield        #116 <Field int[] mVerticalRange>
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #106 <Field int mRecyclerViewHeight>
	//   11   19:aload_0         
	//   12   20:getfield        #171 <Field int mMargin>
	//   13   23:isub            
	//   14   24:iastore         
		return mVerticalRange;
	//   15   25:aload_0         
	//   16   26:getfield        #116 <Field int[] mVerticalRange>
	//   17   29:areturn         
	}

	private void horizontalScrollTo(float f)
	{
		int ai[] = getHorizontalRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #274 <Method int[] getHorizontalRange()>
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
	//   12   14:invokestatic    #278 <Method float Math.min(float, float)>
	//   13   17:invokestatic    #280 <Method float Math.max(float, float)>
	//   14   20:fstore_1        
		if(Math.abs((float)mHorizontalThumbCenterX - f) < 2.0F)
	//*  15   21:aload_0         
	//*  16   22:getfield        #237 <Field int mHorizontalThumbCenterX>
	//*  17   25:i2f             
	//*  18   26:fload_1         
	//*  19   27:fsub            
	//*  20   28:invokestatic    #284 <Method float Math.abs(float)>
	//*  21   31:fconst_2        
	//*  22   32:fcmpg           
	//*  23   33:ifge            37
			return;
	//   24   36:return          
		int i = scrollTo(mHorizontalDragX, f, ai, mRecyclerView.computeHorizontalScrollRange(), mRecyclerView.computeHorizontalScrollOffset(), mRecyclerViewWidth);
	//   25   37:aload_0         
	//   26   38:aload_0         
	//   27   39:getfield        #286 <Field float mHorizontalDragX>
	//   28   42:fload_1         
	//   29   43:aload_3         
	//   30   44:aload_0         
	//   31   45:getfield        #212 <Field RecyclerView mRecyclerView>
	//   32   48:invokevirtual   #289 <Method int RecyclerView.computeHorizontalScrollRange()>
	//   33   51:aload_0         
	//   34   52:getfield        #212 <Field RecyclerView mRecyclerView>
	//   35   55:invokevirtual   #292 <Method int RecyclerView.computeHorizontalScrollOffset()>
	//   36   58:aload_0         
	//   37   59:getfield        #104 <Field int mRecyclerViewWidth>
	//   38   62:invokespecial   #296 <Method int scrollTo(float, float, int[], int, int, int)>
	//   39   65:istore_2        
		if(i != 0)
	//*  40   66:iload_2         
	//*  41   67:ifeq            79
			mRecyclerView.scrollBy(i, 0);
	//   42   70:aload_0         
	//   43   71:getfield        #212 <Field RecyclerView mRecyclerView>
	//   44   74:iload_2         
	//   45   75:iconst_0        
	//   46   76:invokevirtual   #300 <Method void RecyclerView.scrollBy(int, int)>
		mHorizontalDragX = f;
	//   47   79:aload_0         
	//   48   80:fload_1         
	//   49   81:putfield        #286 <Field float mHorizontalDragX>
	//   50   84:return          
	}

	private boolean isLayoutRTL()
	{
		return ViewCompat.getLayoutDirection(((android.view.View) (mRecyclerView))) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field RecyclerView mRecyclerView>
	//    2    4:invokestatic    #306 <Method int ViewCompat.getLayoutDirection(android.view.View)>
	//    3    7:iconst_1        
	//    4    8:icmpne          13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	private void requestRedraw()
	{
		mRecyclerView.invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #309 <Method void RecyclerView.invalidate()>
	//    3    7:return          
	}

	private void resetHideDelay(int i)
	{
		cancelHide();
	//    0    0:aload_0         
	//    1    1:invokespecial   #233 <Method void cancelHide()>
		mRecyclerView.postDelayed(mHideRunnable, i);
	//    2    4:aload_0         
	//    3    5:getfield        #212 <Field RecyclerView mRecyclerView>
	//    4    8:aload_0         
	//    5    9:getfield        #133 <Field Runnable mHideRunnable>
	//    6   12:iload_1         
	//    7   13:i2l             
	//    8   14:invokevirtual   #314 <Method boolean RecyclerView.postDelayed(Runnable, long)>
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

	private void setState(int i)
	{
		if(i == 2 && mState != 2)
	//*   0    0:iload_1         
	//*   1    1:iconst_2        
	//*   2    2:icmpne          28
	//*   3    5:aload_0         
	//*   4    6:getfield        #112 <Field int mState>
	//*   5    9:iconst_2        
	//*   6   10:icmpeq          28
		{
			mVerticalThumbDrawable.setState(PRESSED_STATE_SET);
	//    7   13:aload_0         
	//    8   14:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//    9   17:getstatic       #95  <Field int[] PRESSED_STATE_SET>
	//   10   20:invokevirtual   #317 <Method boolean StateListDrawable.setState(int[])>
	//   11   23:pop             
			cancelHide();
	//   12   24:aload_0         
	//   13   25:invokespecial   #233 <Method void cancelHide()>
		}
		if(i == 0)
	//*  14   28:iload_1         
	//*  15   29:ifne            39
			requestRedraw();
	//   16   32:aload_0         
	//   17   33:invokespecial   #205 <Method void requestRedraw()>
		else
	//*  18   36:goto            43
			show();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #320 <Method void show()>
		if(mState == 2 && i != 2)
	//*  21   43:aload_0         
	//*  22   44:getfield        #112 <Field int mState>
	//*  23   47:iconst_2        
	//*  24   48:icmpne          77
	//*  25   51:iload_1         
	//*  26   52:iconst_2        
	//*  27   53:icmpeq          77
		{
			mVerticalThumbDrawable.setState(EMPTY_STATE_SET);
	//   28   56:aload_0         
	//   29   57:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//   30   60:getstatic       #97  <Field int[] EMPTY_STATE_SET>
	//   31   63:invokevirtual   #317 <Method boolean StateListDrawable.setState(int[])>
	//   32   66:pop             
			resetHideDelay(1200);
	//   33   67:aload_0         
	//   34   68:sipush          1200
	//   35   71:invokespecial   #322 <Method void resetHideDelay(int)>
		} else
	//*  36   74:goto            89
		if(i == 1)
	//*  37   77:iload_1         
	//*  38   78:iconst_1        
	//*  39   79:icmpne          89
			resetHideDelay(1500);
	//   40   82:aload_0         
	//   41   83:sipush          1500
	//   42   86:invokespecial   #322 <Method void resetHideDelay(int)>
		mState = i;
	//   43   89:aload_0         
	//   44   90:iload_1         
	//   45   91:putfield        #112 <Field int mState>
	//   46   94:return          
	}

	private void setupCallbacks()
	{
		mRecyclerView.addItemDecoration(((RecyclerView.ItemDecoration) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field RecyclerView mRecyclerView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #326 <Method void RecyclerView.addItemDecoration(RecyclerView$ItemDecoration)>
		mRecyclerView.addOnItemTouchListener(((RecyclerView.OnItemTouchListener) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #212 <Field RecyclerView mRecyclerView>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #329 <Method void RecyclerView.addOnItemTouchListener(RecyclerView$OnItemTouchListener)>
		mRecyclerView.addOnScrollListener(mOnScrollListener);
	//    8   16:aload_0         
	//    9   17:getfield        #212 <Field RecyclerView mRecyclerView>
	//   10   20:aload_0         
	//   11   21:getfield        #136 <Field RecyclerView$OnScrollListener mOnScrollListener>
	//   12   24:invokevirtual   #332 <Method void RecyclerView.addOnScrollListener(RecyclerView$OnScrollListener)>
	//   13   27:return          
	}

	private void verticalScrollTo(float f)
	{
		int ai[] = getVerticalRange();
	//    0    0:aload_0         
	//    1    1:invokespecial   #335 <Method int[] getVerticalRange()>
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
	//   12   14:invokestatic    #278 <Method float Math.min(float, float)>
	//   13   17:invokestatic    #280 <Method float Math.max(float, float)>
	//   14   20:fstore_1        
		if(Math.abs((float)mVerticalThumbCenterY - f) < 2.0F)
	//*  15   21:aload_0         
	//*  16   22:getfield        #257 <Field int mVerticalThumbCenterY>
	//*  17   25:i2f             
	//*  18   26:fload_1         
	//*  19   27:fsub            
	//*  20   28:invokestatic    #284 <Method float Math.abs(float)>
	//*  21   31:fconst_2        
	//*  22   32:fcmpg           
	//*  23   33:ifge            37
			return;
	//   24   36:return          
		int i = scrollTo(mVerticalDragY, f, ai, mRecyclerView.computeVerticalScrollRange(), mRecyclerView.computeVerticalScrollOffset(), mRecyclerViewHeight);
	//   25   37:aload_0         
	//   26   38:aload_0         
	//   27   39:getfield        #337 <Field float mVerticalDragY>
	//   28   42:fload_1         
	//   29   43:aload_3         
	//   30   44:aload_0         
	//   31   45:getfield        #212 <Field RecyclerView mRecyclerView>
	//   32   48:invokevirtual   #340 <Method int RecyclerView.computeVerticalScrollRange()>
	//   33   51:aload_0         
	//   34   52:getfield        #212 <Field RecyclerView mRecyclerView>
	//   35   55:invokevirtual   #343 <Method int RecyclerView.computeVerticalScrollOffset()>
	//   36   58:aload_0         
	//   37   59:getfield        #106 <Field int mRecyclerViewHeight>
	//   38   62:invokespecial   #296 <Method int scrollTo(float, float, int[], int, int, int)>
	//   39   65:istore_2        
		if(i != 0)
	//*  40   66:iload_2         
	//*  41   67:ifeq            79
			mRecyclerView.scrollBy(0, i);
	//   42   70:aload_0         
	//   43   71:getfield        #212 <Field RecyclerView mRecyclerView>
	//   44   74:iconst_0        
	//   45   75:iload_2         
	//   46   76:invokevirtual   #300 <Method void RecyclerView.scrollBy(int, int)>
		mVerticalDragY = f;
	//   47   79:aload_0         
	//   48   80:fload_1         
	//   49   81:putfield        #337 <Field float mVerticalDragY>
	//   50   84:return          
	}

	public void attachToRecyclerView(RecyclerView recyclerview)
	{
		if(mRecyclerView == recyclerview)
	//*   0    0:aload_0         
	//*   1    1:getfield        #212 <Field RecyclerView mRecyclerView>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       9
			return;
	//    4    8:return          
		if(mRecyclerView != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #212 <Field RecyclerView mRecyclerView>
	//*   7   13:ifnull          20
			destroyCallbacks();
	//    8   16:aload_0         
	//    9   17:invokespecial   #346 <Method void destroyCallbacks()>
		mRecyclerView = recyclerview;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #212 <Field RecyclerView mRecyclerView>
		if(mRecyclerView != null)
	//*  13   25:aload_0         
	//*  14   26:getfield        #212 <Field RecyclerView mRecyclerView>
	//*  15   29:ifnull          36
			setupCallbacks();
	//   16   32:aload_0         
	//   17   33:invokespecial   #348 <Method void setupCallbacks()>
	//   18   36:return          
	}

	Drawable getHorizontalThumbDrawable()
	{
		return ((Drawable) (mHorizontalThumbDrawable));
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field StateListDrawable mHorizontalThumbDrawable>
	//    2    4:areturn         
	}

	Drawable getHorizontalTrackDrawable()
	{
		return mHorizontalTrackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field Drawable mHorizontalTrackDrawable>
	//    2    4:areturn         
	}

	Drawable getVerticalThumbDrawable()
	{
		return ((Drawable) (mVerticalThumbDrawable));
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//    2    4:areturn         
	}

	Drawable getVerticalTrackDrawable()
	{
		return mVerticalTrackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field Drawable mVerticalTrackDrawable>
	//    2    4:areturn         
	}

	public void hide()
	{
		hide(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #358 <Method void hide(int)>
	//    3    5:return          
	}

	void hide(int i)
	{
		switch(mAnimationState)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field int mAnimationState>
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
	//    5   30:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//    6   33:invokevirtual   #361 <Method void ValueAnimator.cancel()>
			// fall through

		case 2: // '\002'
			mAnimationState = 3;
	//    7   36:aload_0         
	//    8   37:iconst_3        
	//    9   38:putfield        #128 <Field int mAnimationState>
			break;
		}
		mShowHideAnimator.setFloatValues(new float[] {
			((Float)mShowHideAnimator.getAnimatedValue()).floatValue(), 0.0F
		});
	//   10   41:aload_0         
	//   11   42:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   12   45:iconst_2        
	//   13   46:newarray        float[]
	//   14   48:dup             
	//   15   49:iconst_0        
	//   16   50:aload_0         
	//   17   51:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   18   54:invokevirtual   #365 <Method Object ValueAnimator.getAnimatedValue()>
	//   19   57:checkcast       #367 <Class Float>
	//   20   60:invokevirtual   #371 <Method float Float.floatValue()>
	//   21   63:fastore         
	//   22   64:dup             
	//   23   65:iconst_1        
	//   24   66:fconst_0        
	//   25   67:fastore         
	//   26   68:invokevirtual   #375 <Method void ValueAnimator.setFloatValues(float[])>
		mShowHideAnimator.setDuration(i);
	//   27   71:aload_0         
	//   28   72:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   29   75:iload_1         
	//   30   76:i2l             
	//   31   77:invokevirtual   #379 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   32   80:pop             
		mShowHideAnimator.start();
	//   33   81:aload_0         
	//   34   82:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   35   85:invokevirtual   #382 <Method void ValueAnimator.start()>
	//   36   88:return          
	}

	public boolean isDragging()
	{
		return mState == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int mState>
	//    2    4:iconst_2        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	boolean isHidden()
	{
		return mState == 0;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int mState>
	//    2    4:ifne            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	boolean isPointInsideHorizontalThumb(float f, float f1)
	{
		return f1 >= (float)(mRecyclerViewHeight - mHorizontalThumbHeight) && f >= (float)(mHorizontalThumbCenterX - mHorizontalThumbWidth / 2) && f <= (float)(mHorizontalThumbCenterX + mHorizontalThumbWidth / 2);
	//    0    0:fload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #106 <Field int mRecyclerViewHeight>
	//    3    5:aload_0         
	//    4    6:getfield        #165 <Field int mHorizontalThumbHeight>
	//    5    9:isub            
	//    6   10:i2f             
	//    7   11:fcmpl           
	//    8   12:iflt            51
	//    9   15:fload_1         
	//   10   16:aload_0         
	//   11   17:getfield        #237 <Field int mHorizontalThumbCenterX>
	//   12   20:aload_0         
	//   13   21:getfield        #239 <Field int mHorizontalThumbWidth>
	//   14   24:iconst_2        
	//   15   25:idiv            
	//   16   26:isub            
	//   17   27:i2f             
	//   18   28:fcmpl           
	//   19   29:iflt            51
	//   20   32:fload_1         
	//   21   33:aload_0         
	//   22   34:getfield        #237 <Field int mHorizontalThumbCenterX>
	//   23   37:aload_0         
	//   24   38:getfield        #239 <Field int mHorizontalThumbWidth>
	//   25   41:iconst_2        
	//   26   42:idiv            
	//   27   43:iadd            
	//   28   44:i2f             
	//   29   45:fcmpg           
	//   30   46:ifgt            51
	//   31   49:iconst_1        
	//   32   50:ireturn         
	//   33   51:iconst_0        
	//   34   52:ireturn         
	}

	boolean isPointInsideVerticalThumb(float f, float f1)
	{
		return (isLayoutRTL() ? f <= (float)(mVerticalThumbWidth / 2) : f >= (float)(mRecyclerViewWidth - mVerticalThumbWidth)) && (f1 >= (float)(mVerticalThumbCenterY - mVerticalThumbHeight / 2) && f1 <= (float)(mVerticalThumbCenterY + mVerticalThumbHeight / 2));
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method boolean isLayoutRTL()>
	//    2    4:ifeq            22
	//    3    7:fload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #158 <Field int mVerticalThumbWidth>
	//    6   12:iconst_2        
	//    7   13:idiv            
	//    8   14:i2f             
	//    9   15:fcmpg           
	//   10   16:ifgt            73
	//   11   19:goto            37
	//   12   22:fload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #104 <Field int mRecyclerViewWidth>
	//   15   27:aload_0         
	//   16   28:getfield        #158 <Field int mVerticalThumbWidth>
	//   17   31:isub            
	//   18   32:i2f             
	//   19   33:fcmpl           
	//   20   34:iflt            73
	//   21   37:fload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #257 <Field int mVerticalThumbCenterY>
	//   24   42:aload_0         
	//   25   43:getfield        #259 <Field int mVerticalThumbHeight>
	//   26   46:iconst_2        
	//   27   47:idiv            
	//   28   48:isub            
	//   29   49:i2f             
	//   30   50:fcmpl           
	//   31   51:iflt            73
	//   32   54:fload_2         
	//   33   55:aload_0         
	//   34   56:getfield        #257 <Field int mVerticalThumbCenterY>
	//   35   59:aload_0         
	//   36   60:getfield        #259 <Field int mVerticalThumbHeight>
	//   37   63:iconst_2        
	//   38   64:idiv            
	//   39   65:iadd            
	//   40   66:i2f             
	//   41   67:fcmpg           
	//   42   68:ifgt            73
	//   43   71:iconst_1        
	//   44   72:ireturn         
	//   45   73:iconst_0        
	//   46   74:ireturn         
	}

	boolean isVisible()
	{
		return mState == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field int mState>
	//    2    4:iconst_1        
	//    3    5:icmpne          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, RecyclerView.State state)
	{
		if(mRecyclerViewWidth == mRecyclerView.getWidth() && mRecyclerViewHeight == mRecyclerView.getHeight())
	//*   0    0:aload_0         
	//*   1    1:getfield        #104 <Field int mRecyclerViewWidth>
	//*   2    4:aload_0         
	//*   3    5:getfield        #212 <Field RecyclerView mRecyclerView>
	//*   4    8:invokevirtual   #393 <Method int RecyclerView.getWidth()>
	//*   5   11:icmpne          63
	//*   6   14:aload_0         
	//*   7   15:getfield        #106 <Field int mRecyclerViewHeight>
	//*   8   18:aload_0         
	//*   9   19:getfield        #212 <Field RecyclerView mRecyclerView>
	//*  10   22:invokevirtual   #396 <Method int RecyclerView.getHeight()>
	//*  11   25:icmpeq          31
	//*  12   28:goto            63
		{
			if(mAnimationState != 0)
	//*  13   31:aload_0         
	//*  14   32:getfield        #128 <Field int mAnimationState>
	//*  15   35:ifeq            62
			{
				if(mNeedVerticalScrollbar)
	//*  16   38:aload_0         
	//*  17   39:getfield        #108 <Field boolean mNeedVerticalScrollbar>
	//*  18   42:ifeq            50
					drawVerticalScrollbar(canvas);
	//   19   45:aload_0         
	//   20   46:aload_1         
	//   21   47:invokespecial   #398 <Method void drawVerticalScrollbar(Canvas)>
				if(mNeedHorizontalScrollbar)
	//*  22   50:aload_0         
	//*  23   51:getfield        #110 <Field boolean mNeedHorizontalScrollbar>
	//*  24   54:ifeq            62
					drawHorizontalScrollbar(canvas);
	//   25   57:aload_0         
	//   26   58:aload_1         
	//   27   59:invokespecial   #400 <Method void drawHorizontalScrollbar(Canvas)>
			}
			return;
	//   28   62:return          
		} else
		{
			mRecyclerViewWidth = mRecyclerView.getWidth();
	//   29   63:aload_0         
	//   30   64:aload_0         
	//   31   65:getfield        #212 <Field RecyclerView mRecyclerView>
	//   32   68:invokevirtual   #393 <Method int RecyclerView.getWidth()>
	//   33   71:putfield        #104 <Field int mRecyclerViewWidth>
			mRecyclerViewHeight = mRecyclerView.getHeight();
	//   34   74:aload_0         
	//   35   75:aload_0         
	//   36   76:getfield        #212 <Field RecyclerView mRecyclerView>
	//   37   79:invokevirtual   #396 <Method int RecyclerView.getHeight()>
	//   38   82:putfield        #106 <Field int mRecyclerViewHeight>
			setState(0);
	//   39   85:aload_0         
	//   40   86:iconst_0        
	//   41   87:invokespecial   #201 <Method void setState(int)>
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
	//    1    1:getfield        #112 <Field int mState>
	//    2    4:istore_3        
			boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          5
			if(i == 1)
	//*   5    8:iload_3         
	//*   6    9:iconst_1        
	//*   7   10:icmpne          117
			{
				boolean flag2 = isPointInsideVerticalThumb(motionevent.getX(), motionevent.getY());
	//    8   13:aload_0         
	//    9   14:aload_2         
	//   10   15:invokevirtual   #407 <Method float MotionEvent.getX()>
	//   11   18:aload_2         
	//   12   19:invokevirtual   #410 <Method float MotionEvent.getY()>
	//   13   22:invokevirtual   #412 <Method boolean isPointInsideVerticalThumb(float, float)>
	//   14   25:istore          6
				boolean flag3 = isPointInsideHorizontalThumb(motionevent.getX(), motionevent.getY());
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #407 <Method float MotionEvent.getX()>
	//   18   32:aload_2         
	//   19   33:invokevirtual   #410 <Method float MotionEvent.getY()>
	//   20   36:invokevirtual   #414 <Method boolean isPointInsideHorizontalThumb(float, float)>
	//   21   39:istore          7
				flag = flag1;
	//   22   41:iload           5
	//   23   43:istore          4
				if(motionevent.getAction() != 0)
					break label0;
	//   24   45:aload_2         
	//   25   46:invokevirtual   #417 <Method int MotionEvent.getAction()>
	//   26   49:ifne            132
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
	//   32   63:ifeq            132
				}
				if(flag3)
	//*  33   66:iload           7
	//*  34   68:ifeq            89
				{
					mDragState = 1;
	//   35   71:aload_0         
	//   36   72:iconst_1        
	//   37   73:putfield        #114 <Field int mDragState>
					mHorizontalDragX = (int)motionevent.getX();
	//   38   76:aload_0         
	//   39   77:aload_2         
	//   40   78:invokevirtual   #407 <Method float MotionEvent.getX()>
	//   41   81:f2i             
	//   42   82:i2f             
	//   43   83:putfield        #286 <Field float mHorizontalDragX>
				} else
	//*  44   86:goto            109
				if(flag2)
	//*  45   89:iload           6
	//*  46   91:ifeq            109
				{
					mDragState = 2;
	//   47   94:aload_0         
	//   48   95:iconst_2        
	//   49   96:putfield        #114 <Field int mDragState>
					mVerticalDragY = (int)motionevent.getY();
	//   50   99:aload_0         
	//   51  100:aload_2         
	//   52  101:invokevirtual   #410 <Method float MotionEvent.getY()>
	//   53  104:f2i             
	//   54  105:i2f             
	//   55  106:putfield        #337 <Field float mVerticalDragY>
				}
				setState(2);
	//   56  109:aload_0         
	//   57  110:iconst_2        
	//   58  111:invokespecial   #201 <Method void setState(int)>
			} else
	//*  59  114:goto            129
			{
				flag = flag1;
	//   60  117:iload           5
	//   61  119:istore          4
				if(mState != 2)
					break label0;
	//   62  121:aload_0         
	//   63  122:getfield        #112 <Field int mState>
	//   64  125:iconst_2        
	//   65  126:icmpne          132
			}
			flag = true;
	//   66  129:iconst_1        
	//   67  130:istore          4
		}
		return flag;
	//   68  132:iload           4
	//   69  134:ireturn         
	}

	public void onRequestDisallowInterceptTouchEvent(boolean flag)
	{
	//    0    0:return          
	}

	public void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
	{
		if(mState == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #112 <Field int mState>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(motionevent.getAction() == 0)
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #417 <Method int MotionEvent.getAction()>
	//*   6   12:ifne            99
		{
			boolean flag = isPointInsideVerticalThumb(motionevent.getX(), motionevent.getY());
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #407 <Method float MotionEvent.getX()>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #410 <Method float MotionEvent.getY()>
	//   12   24:invokevirtual   #412 <Method boolean isPointInsideVerticalThumb(float, float)>
	//   13   27:istore_3        
			boolean flag1 = isPointInsideHorizontalThumb(motionevent.getX(), motionevent.getY());
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:invokevirtual   #407 <Method float MotionEvent.getX()>
	//   17   33:aload_2         
	//   18   34:invokevirtual   #410 <Method float MotionEvent.getY()>
	//   19   37:invokevirtual   #414 <Method boolean isPointInsideHorizontalThumb(float, float)>
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
	//   29   58:putfield        #114 <Field int mDragState>
					mHorizontalDragX = (int)motionevent.getX();
	//   30   61:aload_0         
	//   31   62:aload_2         
	//   32   63:invokevirtual   #407 <Method float MotionEvent.getX()>
	//   33   66:f2i             
	//   34   67:i2f             
	//   35   68:putfield        #286 <Field float mHorizontalDragX>
				} else
	//*  36   71:goto            93
				if(flag)
	//*  37   74:iload_3         
	//*  38   75:ifeq            93
				{
					mDragState = 2;
	//   39   78:aload_0         
	//   40   79:iconst_2        
	//   41   80:putfield        #114 <Field int mDragState>
					mVerticalDragY = (int)motionevent.getY();
	//   42   83:aload_0         
	//   43   84:aload_2         
	//   44   85:invokevirtual   #410 <Method float MotionEvent.getY()>
	//   45   88:f2i             
	//   46   89:i2f             
	//   47   90:putfield        #337 <Field float mVerticalDragY>
				}
				setState(2);
	//   48   93:aload_0         
	//   49   94:iconst_2        
	//   50   95:invokespecial   #201 <Method void setState(int)>
				return;
	//   51   98:return          
			}
		} else
		{
			if(motionevent.getAction() == 1 && mState == 2)
	//*  52   99:aload_2         
	//*  53  100:invokevirtual   #417 <Method int MotionEvent.getAction()>
	//*  54  103:iconst_1        
	//*  55  104:icmpne          136
	//*  56  107:aload_0         
	//*  57  108:getfield        #112 <Field int mState>
	//*  58  111:iconst_2        
	//*  59  112:icmpne          136
			{
				mVerticalDragY = 0.0F;
	//   60  115:aload_0         
	//   61  116:fconst_0        
	//   62  117:putfield        #337 <Field float mVerticalDragY>
				mHorizontalDragX = 0.0F;
	//   63  120:aload_0         
	//   64  121:fconst_0        
	//   65  122:putfield        #286 <Field float mHorizontalDragX>
				setState(1);
	//   66  125:aload_0         
	//   67  126:iconst_1        
	//   68  127:invokespecial   #201 <Method void setState(int)>
				mDragState = 0;
	//   69  130:aload_0         
	//   70  131:iconst_0        
	//   71  132:putfield        #114 <Field int mDragState>
				return;
	//   72  135:return          
			}
			if(motionevent.getAction() == 2 && mState == 2)
	//*  73  136:aload_2         
	//*  74  137:invokevirtual   #417 <Method int MotionEvent.getAction()>
	//*  75  140:iconst_2        
	//*  76  141:icmpne          188
	//*  77  144:aload_0         
	//*  78  145:getfield        #112 <Field int mState>
	//*  79  148:iconst_2        
	//*  80  149:icmpne          188
			{
				show();
	//   81  152:aload_0         
	//   82  153:invokevirtual   #320 <Method void show()>
				if(mDragState == 1)
	//*  83  156:aload_0         
	//*  84  157:getfield        #114 <Field int mDragState>
	//*  85  160:iconst_1        
	//*  86  161:icmpne          172
					horizontalScrollTo(motionevent.getX());
	//   87  164:aload_0         
	//   88  165:aload_2         
	//   89  166:invokevirtual   #407 <Method float MotionEvent.getX()>
	//   90  169:invokespecial   #423 <Method void horizontalScrollTo(float)>
				if(mDragState == 2)
	//*  91  172:aload_0         
	//*  92  173:getfield        #114 <Field int mDragState>
	//*  93  176:iconst_2        
	//*  94  177:icmpne          188
					verticalScrollTo(motionevent.getY());
	//   95  180:aload_0         
	//   96  181:aload_2         
	//   97  182:invokevirtual   #410 <Method float MotionEvent.getY()>
	//   98  185:invokespecial   #425 <Method void verticalScrollTo(float)>
			}
		}
	//   99  188:return          
	}

	public void show()
	{
		int i = mAnimationState;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int mAnimationState>
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
	//   10   16:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   11   19:invokevirtual   #361 <Method void ValueAnimator.cancel()>
		}
		mAnimationState = 1;
	//   12   22:aload_0         
	//   13   23:iconst_1        
	//   14   24:putfield        #128 <Field int mAnimationState>
		mShowHideAnimator.setFloatValues(new float[] {
			((Float)mShowHideAnimator.getAnimatedValue()).floatValue(), 1.0F
		});
	//   15   27:aload_0         
	//   16   28:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   17   31:iconst_2        
	//   18   32:newarray        float[]
	//   19   34:dup             
	//   20   35:iconst_0        
	//   21   36:aload_0         
	//   22   37:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   23   40:invokevirtual   #365 <Method Object ValueAnimator.getAnimatedValue()>
	//   24   43:checkcast       #367 <Class Float>
	//   25   46:invokevirtual   #371 <Method float Float.floatValue()>
	//   26   49:fastore         
	//   27   50:dup             
	//   28   51:iconst_1        
	//   29   52:fconst_1        
	//   30   53:fastore         
	//   31   54:invokevirtual   #375 <Method void ValueAnimator.setFloatValues(float[])>
		mShowHideAnimator.setDuration(500L);
	//   32   57:aload_0         
	//   33   58:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   34   61:ldc2w           #426 <Long 500L>
	//   35   64:invokevirtual   #379 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   36   67:pop             
		mShowHideAnimator.setStartDelay(0L);
	//   37   68:aload_0         
	//   38   69:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   39   72:lconst_0        
	//   40   73:invokevirtual   #431 <Method void ValueAnimator.setStartDelay(long)>
		mShowHideAnimator.start();
	//   41   76:aload_0         
	//   42   77:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//   43   80:invokevirtual   #382 <Method void ValueAnimator.start()>
	//   44   83:return          
	}

	void updateScrollPosition(int i, int j)
	{
		int k = mRecyclerView.computeVerticalScrollRange();
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field RecyclerView mRecyclerView>
	//    2    4:invokevirtual   #340 <Method int RecyclerView.computeVerticalScrollRange()>
	//    3    7:istore          5
		int l = mRecyclerViewHeight;
	//    4    9:aload_0         
	//    5   10:getfield        #106 <Field int mRecyclerViewHeight>
	//    6   13:istore          6
		boolean flag;
		if(k - l > 0 && mRecyclerViewHeight >= mScrollbarMinimumRange)
	//*   7   15:iload           5
	//*   8   17:iload           6
	//*   9   19:isub            
	//*  10   20:ifle            40
	//*  11   23:aload_0         
	//*  12   24:getfield        #106 <Field int mRecyclerViewHeight>
	//*  13   27:aload_0         
	//*  14   28:getfield        #169 <Field int mScrollbarMinimumRange>
	//*  15   31:icmplt          40
			flag = true;
	//   16   34:iconst_1        
	//   17   35:istore          9
		else
	//*  18   37:goto            43
			flag = false;
	//   19   40:iconst_0        
	//   20   41:istore          9
		mNeedVerticalScrollbar = flag;
	//   21   43:aload_0         
	//   22   44:iload           9
	//   23   46:putfield        #108 <Field boolean mNeedVerticalScrollbar>
		int i1 = mRecyclerView.computeHorizontalScrollRange();
	//   24   49:aload_0         
	//   25   50:getfield        #212 <Field RecyclerView mRecyclerView>
	//   26   53:invokevirtual   #289 <Method int RecyclerView.computeHorizontalScrollRange()>
	//   27   56:istore          7
		int j1 = mRecyclerViewWidth;
	//   28   58:aload_0         
	//   29   59:getfield        #104 <Field int mRecyclerViewWidth>
	//   30   62:istore          8
		if(i1 - j1 > 0 && mRecyclerViewWidth >= mScrollbarMinimumRange)
	//*  31   64:iload           7
	//*  32   66:iload           8
	//*  33   68:isub            
	//*  34   69:ifle            89
	//*  35   72:aload_0         
	//*  36   73:getfield        #104 <Field int mRecyclerViewWidth>
	//*  37   76:aload_0         
	//*  38   77:getfield        #169 <Field int mScrollbarMinimumRange>
	//*  39   80:icmplt          89
			flag = true;
	//   40   83:iconst_1        
	//   41   84:istore          9
		else
	//*  42   86:goto            92
			flag = false;
	//   43   89:iconst_0        
	//   44   90:istore          9
		mNeedHorizontalScrollbar = flag;
	//   45   92:aload_0         
	//   46   93:iload           9
	//   47   95:putfield        #110 <Field boolean mNeedHorizontalScrollbar>
		if(!mNeedVerticalScrollbar && !mNeedHorizontalScrollbar)
	//*  48   98:aload_0         
	//*  49   99:getfield        #108 <Field boolean mNeedVerticalScrollbar>
	//*  50  102:ifne            125
	//*  51  105:aload_0         
	//*  52  106:getfield        #110 <Field boolean mNeedHorizontalScrollbar>
	//*  53  109:ifne            125
		{
			if(mState != 0)
	//*  54  112:aload_0         
	//*  55  113:getfield        #112 <Field int mState>
	//*  56  116:ifeq            124
				setState(0);
	//   57  119:aload_0         
	//   58  120:iconst_0        
	//   59  121:invokespecial   #201 <Method void setState(int)>
			return;
	//   60  124:return          
		}
		if(mNeedVerticalScrollbar)
	//*  61  125:aload_0         
	//*  62  126:getfield        #108 <Field boolean mNeedVerticalScrollbar>
	//*  63  129:ifeq            175
		{
			float f = j;
	//   64  132:iload_2         
	//   65  133:i2f             
	//   66  134:fstore_3        
			float f2 = l;
	//   67  135:iload           6
	//   68  137:i2f             
	//   69  138:fstore          4
			mVerticalThumbCenterY = (int)((f2 * (f + f2 / 2.0F)) / (float)k);
	//   70  140:aload_0         
	//   71  141:fload           4
	//   72  143:fload_3         
	//   73  144:fload           4
	//   74  146:fconst_2        
	//   75  147:fdiv            
	//   76  148:fadd            
	//   77  149:fmul            
	//   78  150:iload           5
	//   79  152:i2f             
	//   80  153:fdiv            
	//   81  154:f2i             
	//   82  155:putfield        #257 <Field int mVerticalThumbCenterY>
			mVerticalThumbHeight = Math.min(l, (l * l) / k);
	//   83  158:aload_0         
	//   84  159:iload           6
	//   85  161:iload           6
	//   86  163:iload           6
	//   87  165:imul            
	//   88  166:iload           5
	//   89  168:idiv            
	//   90  169:invokestatic    #434 <Method int Math.min(int, int)>
	//   91  172:putfield        #259 <Field int mVerticalThumbHeight>
		}
		if(mNeedHorizontalScrollbar)
	//*  92  175:aload_0         
	//*  93  176:getfield        #110 <Field boolean mNeedHorizontalScrollbar>
	//*  94  179:ifeq            225
		{
			float f1 = i;
	//   95  182:iload_1         
	//   96  183:i2f             
	//   97  184:fstore_3        
			float f3 = j1;
	//   98  185:iload           8
	//   99  187:i2f             
	//  100  188:fstore          4
			mHorizontalThumbCenterX = (int)((f3 * (f1 + f3 / 2.0F)) / (float)i1);
	//  101  190:aload_0         
	//  102  191:fload           4
	//  103  193:fload_3         
	//  104  194:fload           4
	//  105  196:fconst_2        
	//  106  197:fdiv            
	//  107  198:fadd            
	//  108  199:fmul            
	//  109  200:iload           7
	//  110  202:i2f             
	//  111  203:fdiv            
	//  112  204:f2i             
	//  113  205:putfield        #237 <Field int mHorizontalThumbCenterX>
			mHorizontalThumbWidth = Math.min(j1, (j1 * j1) / i1);
	//  114  208:aload_0         
	//  115  209:iload           8
	//  116  211:iload           8
	//  117  213:iload           8
	//  118  215:imul            
	//  119  216:iload           7
	//  120  218:idiv            
	//  121  219:invokestatic    #434 <Method int Math.min(int, int)>
	//  122  222:putfield        #239 <Field int mHorizontalThumbWidth>
		}
		if(mState == 0 || mState == 1)
	//* 123  225:aload_0         
	//* 124  226:getfield        #112 <Field int mState>
	//* 125  229:ifeq            240
	//* 126  232:aload_0         
	//* 127  233:getfield        #112 <Field int mState>
	//* 128  236:iconst_1        
	//* 129  237:icmpne          245
			setState(1);
	//  130  240:aload_0         
	//  131  241:iconst_1        
	//  132  242:invokespecial   #201 <Method void setState(int)>
	//  133  245:return          
	}

	private static final int ANIMATION_STATE_FADING_IN = 1;
	private static final int ANIMATION_STATE_FADING_OUT = 3;
	private static final int ANIMATION_STATE_IN = 2;
	private static final int ANIMATION_STATE_OUT = 0;
	private static final int DRAG_NONE = 0;
	private static final int DRAG_X = 1;
	private static final int DRAG_Y = 2;
	private static final int EMPTY_STATE_SET[] = new int[0];
	private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
	private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
	private static final int HIDE_DURATION_MS = 500;
	private static final int PRESSED_STATE_SET[] = {
		0x10100a7
	};
	private static final int SCROLLBAR_FULL_OPAQUE = 255;
	private static final int SHOW_DURATION_MS = 500;
	private static final int STATE_DRAGGING = 2;
	private static final int STATE_HIDDEN = 0;
	private static final int STATE_VISIBLE = 1;
	private int mAnimationState;
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
	private final ValueAnimator mShowHideAnimator = ValueAnimator.ofFloat(new float[] {
		0.0F, 1.0F
	});
	private int mState;
	float mVerticalDragY;
	private final int mVerticalRange[] = new int[2];
	int mVerticalThumbCenterY;
	private final StateListDrawable mVerticalThumbDrawable;
	int mVerticalThumbHeight;
	private final int mVerticalThumbWidth;
	private final Drawable mVerticalTrackDrawable;
	private final int mVerticalTrackWidth;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #93  <Int 0x10100a7>
	//    5    7:iastore         
	//    6    8:putstatic       #95  <Field int[] PRESSED_STATE_SET>
	//    7   11:iconst_0        
	//    8   12:newarray        int[]
	//    9   14:putstatic       #97  <Field int[] EMPTY_STATE_SET>
	//*  10   17:return          
	}


/*
	static ValueAnimator access$200(FastScroller fastscroller)
	{
		return fastscroller.mShowHideAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field ValueAnimator mShowHideAnimator>
	//    2    4:areturn         
	}

*/


/*
	static int access$302(FastScroller fastscroller, int i)
	{
		fastscroller.mAnimationState = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #128 <Field int mAnimationState>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static void access$400(FastScroller fastscroller, int i)
	{
		fastscroller.setState(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #201 <Method void setState(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$500(FastScroller fastscroller)
	{
		fastscroller.requestRedraw();
	//    0    0:aload_0         
	//    1    1:invokespecial   #205 <Method void requestRedraw()>
		return;
	//    2    4:return          
	}

*/


/*
	static StateListDrawable access$600(FastScroller fastscroller)
	{
		return fastscroller.mVerticalThumbDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field StateListDrawable mVerticalThumbDrawable>
	//    2    4:areturn         
	}

*/


/*
	static Drawable access$700(FastScroller fastscroller)
	{
		return fastscroller.mVerticalTrackDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field Drawable mVerticalTrackDrawable>
	//    2    4:areturn         
	}

*/
}
