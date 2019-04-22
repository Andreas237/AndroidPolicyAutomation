// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.*;
import android.util.*;
import android.view.*;
import android.view.animation.*;
import android.widget.AbsListView;
import android.widget.ListView;

// Referenced classes of package android.support.v4.widget:
//			CircleImageView, CircularProgressDrawable, ListViewCompat

public class SwipeRefreshLayout extends ViewGroup
	implements NestedScrollingChild, NestedScrollingParent
{
	public static interface OnChildScrollUpCallback
	{

		public abstract boolean canChildScrollUp(SwipeRefreshLayout swiperefreshlayout, View view);
	}

	public static interface OnRefreshListener
	{

		public abstract void onRefresh();
	}


	public SwipeRefreshLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #134 <Method void SwipeRefreshLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwipeRefreshLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #137 <Method void ViewGroup(Context, AttributeSet)>
		mRefreshing = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #139 <Field boolean mRefreshing>
		mTotalDragDistance = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #140 <Float -1F>
	//    9   14:putfield        #142 <Field float mTotalDragDistance>
		mParentScrollConsumed = new int[2];
	//   10   17:aload_0         
	//   11   18:iconst_2        
	//   12   19:newarray        int[]
	//   13   21:putfield        #144 <Field int[] mParentScrollConsumed>
		mParentOffsetInWindow = new int[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:newarray        int[]
	//   17   28:putfield        #146 <Field int[] mParentOffsetInWindow>
		mActivePointerId = -1;
	//   18   31:aload_0         
	//   19   32:iconst_m1       
	//   20   33:putfield        #148 <Field int mActivePointerId>
		mCircleViewIndex = -1;
	//   21   36:aload_0         
	//   22   37:iconst_m1       
	//   23   38:putfield        #150 <Field int mCircleViewIndex>
	//   24   41:aload_0         
	//   25   42:new             #10  <Class SwipeRefreshLayout$1>
	//   26   45:dup             
	//   27   46:aload_0         
	//   28   47:invokespecial   #153 <Method void SwipeRefreshLayout$1(SwipeRefreshLayout)>
	//   29   50:putfield        #155 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
		mAnimateToCorrectPosition = ((Animation) (new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				int j;
				if(!mUsingCustomStart)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field SwipeRefreshLayout this$0>
			//*   2    4:getfield        #22  <Field boolean SwipeRefreshLayout.mUsingCustomStart>
			//*   3    7:ifne            32
					j = mSpinnerOffsetEnd - Math.abs(mOriginalOffsetTop);
			//    4   10:aload_0         
			//    5   11:getfield        #12  <Field SwipeRefreshLayout this$0>
			//    6   14:getfield        #26  <Field int SwipeRefreshLayout.mSpinnerOffsetEnd>
			//    7   17:aload_0         
			//    8   18:getfield        #12  <Field SwipeRefreshLayout this$0>
			//    9   21:getfield        #29  <Field int SwipeRefreshLayout.mOriginalOffsetTop>
			//   10   24:invokestatic    #35  <Method int Math.abs(int)>
			//   11   27:isub            
			//   12   28:istore_3        
				else
			//*  13   29:goto            40
					j = mSpinnerOffsetEnd;
			//   14   32:aload_0         
			//   15   33:getfield        #12  <Field SwipeRefreshLayout this$0>
			//   16   36:getfield        #26  <Field int SwipeRefreshLayout.mSpinnerOffsetEnd>
			//   17   39:istore_3        
				int k = mFrom;
			//   18   40:aload_0         
			//   19   41:getfield        #12  <Field SwipeRefreshLayout this$0>
			//   20   44:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
			//   21   47:istore          4
				j = (int)((float)(j - mFrom) * f);
			//   22   49:iload_3         
			//   23   50:aload_0         
			//   24   51:getfield        #12  <Field SwipeRefreshLayout this$0>
			//   25   54:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
			//   26   57:isub            
			//   27   58:i2f             
			//   28   59:fload_1         
			//   29   60:fmul            
			//   30   61:f2i             
			//   31   62:istore_3        
				int l = mCircleView.getTop();
			//   32   63:aload_0         
			//   33   64:getfield        #12  <Field SwipeRefreshLayout this$0>
			//   34   67:getfield        #42  <Field CircleImageView SwipeRefreshLayout.mCircleView>
			//   35   70:invokevirtual   #48  <Method int CircleImageView.getTop()>
			//   36   73:istore          5
				setTargetOffsetTopAndBottom((k + j) - l);
			//   37   75:aload_0         
			//   38   76:getfield        #12  <Field SwipeRefreshLayout this$0>
			//   39   79:iload           4
			//   40   81:iload_3         
			//   41   82:iadd            
			//   42   83:iload           5
			//   43   85:isub            
			//   44   86:invokevirtual   #52  <Method void SwipeRefreshLayout.setTargetOffsetTopAndBottom(int)>
				mProgress.setArrowScale(1.0F - f);
			//   45   89:aload_0         
			//   46   90:getfield        #12  <Field SwipeRefreshLayout this$0>
			//   47   93:getfield        #56  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
			//   48   96:fconst_1        
			//   49   97:fload_1         
			//   50   98:fsub            
			//   51   99:invokevirtual   #62  <Method void CircularProgressDrawable.setArrowScale(float)>
			//   52  102:return          
			}

			final SwipeRefreshLayout this$0;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SwipeRefreshLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//   30   53:aload_0         
	//   31   54:new             #20  <Class SwipeRefreshLayout$6>
	//   32   57:dup             
	//   33   58:aload_0         
	//   34   59:invokespecial   #156 <Method void SwipeRefreshLayout$6(SwipeRefreshLayout)>
	//   35   62:putfield        #158 <Field Animation mAnimateToCorrectPosition>
		mAnimateToStartPosition = ((Animation) (new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				moveToStart(f);
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field SwipeRefreshLayout this$0>
			//    2    4:fload_1         
			//    3    5:invokevirtual   #22  <Method void SwipeRefreshLayout.moveToStart(float)>
			//    4    8:return          
			}

			final SwipeRefreshLayout this$0;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field SwipeRefreshLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//   36   65:aload_0         
	//   37   66:new             #22  <Class SwipeRefreshLayout$7>
	//   38   69:dup             
	//   39   70:aload_0         
	//   40   71:invokespecial   #159 <Method void SwipeRefreshLayout$7(SwipeRefreshLayout)>
	//   41   74:putfield        #161 <Field Animation mAnimateToStartPosition>
		mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:invokestatic    #167 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   45   82:invokevirtual   #171 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   46   85:putfield        #173 <Field int mTouchSlop>
		mMediumAnimationDuration = getResources().getInteger(0x10e0001);
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:invokevirtual   #177 <Method Resources getResources()>
	//   50   93:ldc1            #178 <Int 0x10e0001>
	//   51   95:invokevirtual   #184 <Method int Resources.getInteger(int)>
	//   52   98:putfield        #186 <Field int mMediumAnimationDuration>
		setWillNotDraw(false);
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:invokevirtual   #190 <Method void setWillNotDraw(boolean)>
		mDecelerateInterpolator = new DecelerateInterpolator(2.0F);
	//   56  106:aload_0         
	//   57  107:new             #192 <Class DecelerateInterpolator>
	//   58  110:dup             
	//   59  111:fconst_2        
	//   60  112:invokespecial   #195 <Method void DecelerateInterpolator(float)>
	//   61  115:putfield        #197 <Field DecelerateInterpolator mDecelerateInterpolator>
		DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//   62  118:aload_0         
	//   63  119:invokevirtual   #177 <Method Resources getResources()>
	//   64  122:invokevirtual   #201 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   65  125:astore          4
		mCircleDiameter = (int)(displaymetrics.density * 40F);
	//   66  127:aload_0         
	//   67  128:aload           4
	//   68  130:getfield        #206 <Field float DisplayMetrics.density>
	//   69  133:ldc1            #207 <Float 40F>
	//   70  135:fmul            
	//   71  136:f2i             
	//   72  137:putfield        #209 <Field int mCircleDiameter>
		createProgressView();
	//   73  140:aload_0         
	//   74  141:invokespecial   #212 <Method void createProgressView()>
		setChildrenDrawingOrderEnabled(true);
	//   75  144:aload_0         
	//   76  145:iconst_1        
	//   77  146:invokevirtual   #215 <Method void setChildrenDrawingOrderEnabled(boolean)>
		mSpinnerOffsetEnd = (int)(displaymetrics.density * 64F);
	//   78  149:aload_0         
	//   79  150:aload           4
	//   80  152:getfield        #206 <Field float DisplayMetrics.density>
	//   81  155:ldc1            #216 <Float 64F>
	//   82  157:fmul            
	//   83  158:f2i             
	//   84  159:putfield        #218 <Field int mSpinnerOffsetEnd>
		mTotalDragDistance = mSpinnerOffsetEnd;
	//   85  162:aload_0         
	//   86  163:aload_0         
	//   87  164:getfield        #218 <Field int mSpinnerOffsetEnd>
	//   88  167:i2f             
	//   89  168:putfield        #142 <Field float mTotalDragDistance>
		mNestedScrollingParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   90  171:aload_0         
	//   91  172:new             #220 <Class NestedScrollingParentHelper>
	//   92  175:dup             
	//   93  176:aload_0         
	//   94  177:invokespecial   #223 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   95  180:putfield        #225 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
		mNestedScrollingChildHelper = new NestedScrollingChildHelper(((View) (this)));
	//   96  183:aload_0         
	//   97  184:new             #227 <Class NestedScrollingChildHelper>
	//   98  187:dup             
	//   99  188:aload_0         
	//  100  189:invokespecial   #230 <Method void NestedScrollingChildHelper(View)>
	//  101  192:putfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
		setNestedScrollingEnabled(true);
	//  102  195:aload_0         
	//  103  196:iconst_1        
	//  104  197:invokevirtual   #235 <Method void setNestedScrollingEnabled(boolean)>
		int i = -mCircleDiameter;
	//  105  200:aload_0         
	//  106  201:getfield        #209 <Field int mCircleDiameter>
	//  107  204:ineg            
	//  108  205:istore_3        
		mCurrentTargetOffsetTop = i;
	//  109  206:aload_0         
	//  110  207:iload_3         
	//  111  208:putfield        #237 <Field int mCurrentTargetOffsetTop>
		mOriginalOffsetTop = i;
	//  112  211:aload_0         
	//  113  212:iload_3         
	//  114  213:putfield        #239 <Field int mOriginalOffsetTop>
		moveToStart(1.0F);
	//  115  216:aload_0         
	//  116  217:fconst_1        
	//  117  218:invokevirtual   #242 <Method void moveToStart(float)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, LAYOUT_ATTRS)));
	//  118  221:aload_1         
	//  119  222:aload_2         
	//  120  223:getstatic       #127 <Field int[] LAYOUT_ATTRS>
	//  121  226:invokevirtual   #248 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//  122  229:astore_1        
		setEnabled(((TypedArray) (context)).getBoolean(0, true));
	//  123  230:aload_0         
	//  124  231:aload_1         
	//  125  232:iconst_0        
	//  126  233:iconst_1        
	//  127  234:invokevirtual   #254 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  128  237:invokevirtual   #257 <Method void setEnabled(boolean)>
		((TypedArray) (context)).recycle();
	//  129  240:aload_1         
	//  130  241:invokevirtual   #260 <Method void TypedArray.recycle()>
	//  131  244:return          
	}

	private void animateOffsetToCorrectPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		mFrom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #264 <Field int mFrom>
		mAnimateToCorrectPosition.reset();
	//    3    5:aload_0         
	//    4    6:getfield        #158 <Field Animation mAnimateToCorrectPosition>
	//    5    9:invokevirtual   #269 <Method void Animation.reset()>
		mAnimateToCorrectPosition.setDuration(200L);
	//    6   12:aload_0         
	//    7   13:getfield        #158 <Field Animation mAnimateToCorrectPosition>
	//    8   16:ldc2w           #270 <Long 200L>
	//    9   19:invokevirtual   #275 <Method void Animation.setDuration(long)>
		mAnimateToCorrectPosition.setInterpolator(((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   10   22:aload_0         
	//   11   23:getfield        #158 <Field Animation mAnimateToCorrectPosition>
	//   12   26:aload_0         
	//   13   27:getfield        #197 <Field DecelerateInterpolator mDecelerateInterpolator>
	//   14   30:invokevirtual   #279 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  15   33:aload_2         
	//*  16   34:ifnull          45
			mCircleView.setAnimationListener(animationlistener);
	//   17   37:aload_0         
	//   18   38:getfield        #281 <Field CircleImageView mCircleView>
	//   19   41:aload_2         
	//   20   42:invokevirtual   #287 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   21   45:aload_0         
	//   22   46:getfield        #281 <Field CircleImageView mCircleView>
	//   23   49:invokevirtual   #290 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mAnimateToCorrectPosition);
	//   24   52:aload_0         
	//   25   53:getfield        #281 <Field CircleImageView mCircleView>
	//   26   56:aload_0         
	//   27   57:getfield        #158 <Field Animation mAnimateToCorrectPosition>
	//   28   60:invokevirtual   #294 <Method void CircleImageView.startAnimation(Animation)>
	//   29   63:return          
	}

	private void animateOffsetToStartPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		if(mScale)
	//*   0    0:aload_0         
	//*   1    1:getfield        #297 <Field boolean mScale>
	//*   2    4:ifeq            14
		{
			startScaleDownReturnToStartAnimation(i, animationlistener);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #300 <Method void startScaleDownReturnToStartAnimation(int, android.view.animation.Animation$AnimationListener)>
			return;
	//    7   13:return          
		}
		mFrom = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #264 <Field int mFrom>
		mAnimateToStartPosition.reset();
	//   11   19:aload_0         
	//   12   20:getfield        #161 <Field Animation mAnimateToStartPosition>
	//   13   23:invokevirtual   #269 <Method void Animation.reset()>
		mAnimateToStartPosition.setDuration(200L);
	//   14   26:aload_0         
	//   15   27:getfield        #161 <Field Animation mAnimateToStartPosition>
	//   16   30:ldc2w           #270 <Long 200L>
	//   17   33:invokevirtual   #275 <Method void Animation.setDuration(long)>
		mAnimateToStartPosition.setInterpolator(((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   18   36:aload_0         
	//   19   37:getfield        #161 <Field Animation mAnimateToStartPosition>
	//   20   40:aload_0         
	//   21   41:getfield        #197 <Field DecelerateInterpolator mDecelerateInterpolator>
	//   22   44:invokevirtual   #279 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          59
			mCircleView.setAnimationListener(animationlistener);
	//   25   51:aload_0         
	//   26   52:getfield        #281 <Field CircleImageView mCircleView>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #287 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   29   59:aload_0         
	//   30   60:getfield        #281 <Field CircleImageView mCircleView>
	//   31   63:invokevirtual   #290 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mAnimateToStartPosition);
	//   32   66:aload_0         
	//   33   67:getfield        #281 <Field CircleImageView mCircleView>
	//   34   70:aload_0         
	//   35   71:getfield        #161 <Field Animation mAnimateToStartPosition>
	//   36   74:invokevirtual   #294 <Method void CircleImageView.startAnimation(Animation)>
	//   37   77:return          
	}

	private void createProgressView()
	{
		mCircleView = new CircleImageView(getContext(), 0xfffafafa);
	//    0    0:aload_0         
	//    1    1:new             #283 <Class CircleImageView>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #304 <Method Context getContext()>
	//    5    9:ldc1            #38  <Int 0xfffafafa>
	//    6   11:invokespecial   #307 <Method void CircleImageView(Context, int)>
	//    7   14:putfield        #281 <Field CircleImageView mCircleView>
		mProgress = new CircularProgressDrawable(getContext());
	//    8   17:aload_0         
	//    9   18:new             #309 <Class CircularProgressDrawable>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokevirtual   #304 <Method Context getContext()>
	//   13   26:invokespecial   #311 <Method void CircularProgressDrawable(Context)>
	//   14   29:putfield        #313 <Field CircularProgressDrawable mProgress>
		mProgress.setStyle(1);
	//   15   32:aload_0         
	//   16   33:getfield        #313 <Field CircularProgressDrawable mProgress>
	//   17   36:iconst_1        
	//   18   37:invokevirtual   #317 <Method void CircularProgressDrawable.setStyle(int)>
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//   19   40:aload_0         
	//   20   41:getfield        #281 <Field CircleImageView mCircleView>
	//   21   44:aload_0         
	//   22   45:getfield        #313 <Field CircularProgressDrawable mProgress>
	//   23   48:invokevirtual   #321 <Method void CircleImageView.setImageDrawable(Drawable)>
		mCircleView.setVisibility(8);
	//   24   51:aload_0         
	//   25   52:getfield        #281 <Field CircleImageView mCircleView>
	//   26   55:bipush          8
	//   27   57:invokevirtual   #324 <Method void CircleImageView.setVisibility(int)>
		addView(((View) (mCircleView)));
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #281 <Field CircleImageView mCircleView>
	//   31   65:invokevirtual   #327 <Method void addView(View)>
	//   32   68:return          
	}

	private void ensureTarget()
	{
		if(mTarget == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #330 <Field View mTarget>
	//*   2    4:ifnonnull       47
		{
			for(int i = 0; i < getChildCount(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #333 <Method int getChildCount()>
	//*   8   14:icmpge          47
			{
				View view = getChildAt(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #337 <Method View getChildAt(int)>
	//   12   22:astore_2        
				if(!((Object) (view)).equals(((Object) (mCircleView))))
	//*  13   23:aload_2         
	//*  14   24:aload_0         
	//*  15   25:getfield        #281 <Field CircleImageView mCircleView>
	//*  16   28:invokevirtual   #343 <Method boolean Object.equals(Object)>
	//*  17   31:ifne            40
				{
					mTarget = view;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #330 <Field View mTarget>
					return;
	//   21   39:return          
				}
			}

	//   22   40:iload_1         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
		}
	//*  26   44:goto            9
	//   27   47:return          
	}

	private void finishSpinner(float f)
	{
		if(f > mTotalDragDistance)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #142 <Field float mTotalDragDistance>
	//*   3    5:fcmpl           
	//*   4    6:ifle            16
		{
			setRefreshing(true, true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:iconst_1        
	//    8   12:invokespecial   #348 <Method void setRefreshing(boolean, boolean)>
			return;
	//    9   15:return          
		}
		mRefreshing = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #139 <Field boolean mRefreshing>
		mProgress.setStartEndTrim(0.0F, 0.0F);
	//   13   21:aload_0         
	//   14   22:getfield        #313 <Field CircularProgressDrawable mProgress>
	//   15   25:fconst_0        
	//   16   26:fconst_0        
	//   17   27:invokevirtual   #352 <Method void CircularProgressDrawable.setStartEndTrim(float, float)>
		android.view.animation.Animation.AnimationListener animationlistener = null;
	//   18   30:aconst_null     
	//   19   31:astore_2        
		if(!mScale)
	//*  20   32:aload_0         
	//*  21   33:getfield        #297 <Field boolean mScale>
	//*  22   36:ifne            48
			animationlistener = new android.view.animation.Animation.AnimationListener() {

				public void onAnimationEnd(Animation animation)
				{
					if(!mScale)
				//*   0    0:aload_0         
				//*   1    1:getfield        #17  <Field SwipeRefreshLayout this$0>
				//*   2    4:getfield        #27  <Field boolean SwipeRefreshLayout.mScale>
				//*   3    7:ifne            18
						startScaleDownAnimation(((android.view.animation.Animation.AnimationListener) (null)));
				//    4   10:aload_0         
				//    5   11:getfield        #17  <Field SwipeRefreshLayout this$0>
				//    6   14:aconst_null     
				//    7   15:invokevirtual   #31  <Method void SwipeRefreshLayout.startScaleDownAnimation(android.view.animation.Animation$AnimationListener)>
				//    8   18:return          
				}

				public void onAnimationRepeat(Animation animation)
				{
				//    0    0:return          
				}

				public void onAnimationStart(Animation animation)
				{
				//    0    0:return          
				}

				final SwipeRefreshLayout this$0;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SwipeRefreshLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
;
	//   23   39:new             #18  <Class SwipeRefreshLayout$5>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:invokespecial   #353 <Method void SwipeRefreshLayout$5(SwipeRefreshLayout)>
	//   27   47:astore_2        
		animateOffsetToStartPosition(mCurrentTargetOffsetTop, animationlistener);
	//   28   48:aload_0         
	//   29   49:aload_0         
	//   30   50:getfield        #237 <Field int mCurrentTargetOffsetTop>
	//   31   53:aload_2         
	//   32   54:invokespecial   #355 <Method void animateOffsetToStartPosition(int, android.view.animation.Animation$AnimationListener)>
		mProgress.setArrowEnabled(false);
	//   33   57:aload_0         
	//   34   58:getfield        #313 <Field CircularProgressDrawable mProgress>
	//   35   61:iconst_0        
	//   36   62:invokevirtual   #358 <Method void CircularProgressDrawable.setArrowEnabled(boolean)>
	//   37   65:return          
	}

	private boolean isAnimationRunning(Animation animation)
	{
		return animation != null && animation.hasStarted() && !animation.hasEnded();
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokevirtual   #364 <Method boolean Animation.hasStarted()>
	//    4    8:ifeq            20
	//    5   11:aload_1         
	//    6   12:invokevirtual   #367 <Method boolean Animation.hasEnded()>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private void moveSpinner(float f)
	{
		mProgress.setArrowEnabled(true);
	//    0    0:aload_0         
	//    1    1:getfield        #313 <Field CircularProgressDrawable mProgress>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #358 <Method void CircularProgressDrawable.setArrowEnabled(boolean)>
		float f1 = Math.min(1.0F, Math.abs(f / mTotalDragDistance));
	//    4    8:fconst_1        
	//    5    9:fload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #142 <Field float mTotalDragDistance>
	//    8   14:fdiv            
	//    9   15:invokestatic    #374 <Method float Math.abs(float)>
	//   10   18:invokestatic    #378 <Method float Math.min(float, float)>
	//   11   21:fstore          4
		float f2 = ((float)Math.max((double)f1 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
	//   12   23:fload           4
	//   13   25:f2d             
	//   14   26:ldc2w           #379 <Double 0.40000000000000002D>
	//   15   29:dsub            
	//   16   30:dconst_0        
	//   17   31:invokestatic    #384 <Method double Math.max(double, double)>
	//   18   34:d2f             
	//   19   35:ldc2            #385 <Float 5F>
	//   20   38:fmul            
	//   21   39:ldc2            #386 <Float 3F>
	//   22   42:fdiv            
	//   23   43:fstore          5
		float f4 = Math.abs(f);
	//   24   45:fload_1         
	//   25   46:invokestatic    #374 <Method float Math.abs(float)>
	//   26   49:fstore          7
		float f5 = mTotalDragDistance;
	//   27   51:aload_0         
	//   28   52:getfield        #142 <Field float mTotalDragDistance>
	//   29   55:fstore          8
		int i = mCustomSlingshotDistance;
	//   30   57:aload_0         
	//   31   58:getfield        #388 <Field int mCustomSlingshotDistance>
	//   32   61:istore          9
		float f3;
		if(i <= 0)
	//*  33   63:iload           9
	//*  34   65:ifle            76
	//*  35   68:iload           9
	//*  36   70:i2f             
	//*  37   71:fstore          6
	//*  38   73:goto            106
			if(mUsingCustomStart)
	//*  39   76:aload_0         
	//*  40   77:getfield        #390 <Field boolean mUsingCustomStart>
	//*  41   80:ifeq            97
				i = mSpinnerOffsetEnd - mOriginalOffsetTop;
	//   42   83:aload_0         
	//   43   84:getfield        #218 <Field int mSpinnerOffsetEnd>
	//   44   87:aload_0         
	//   45   88:getfield        #239 <Field int mOriginalOffsetTop>
	//   46   91:isub            
	//   47   92:istore          9
			else
	//*  48   94:goto            68
				i = mSpinnerOffsetEnd;
	//   49   97:aload_0         
	//   50   98:getfield        #218 <Field int mSpinnerOffsetEnd>
	//   51  101:istore          9
		f3 = i;
	//*  52  103:goto            68
		double d = Math.max(0.0F, Math.min(f4 - f5, f3 * 2.0F) / f3) / 4F;
	//   53  106:fconst_0        
	//   54  107:fload           7
	//   55  109:fload           8
	//   56  111:fsub            
	//   57  112:fload           6
	//   58  114:fconst_2        
	//   59  115:fmul            
	//   60  116:invokestatic    #378 <Method float Math.min(float, float)>
	//   61  119:fload           6
	//   62  121:fdiv            
	//   63  122:invokestatic    #392 <Method float Math.max(float, float)>
	//   64  125:ldc2            #393 <Float 4F>
	//   65  128:fdiv            
	//   66  129:f2d             
	//   67  130:dstore_2        
		f4 = (float)(d - Math.pow(d, 2D)) * 2.0F;
	//   68  131:dload_2         
	//   69  132:dload_2         
	//   70  133:ldc2w           #394 <Double 2D>
	//   71  136:invokestatic    #398 <Method double Math.pow(double, double)>
	//   72  139:dsub            
	//   73  140:d2f             
	//   74  141:fconst_2        
	//   75  142:fmul            
	//   76  143:fstore          7
		i = mOriginalOffsetTop;
	//   77  145:aload_0         
	//   78  146:getfield        #239 <Field int mOriginalOffsetTop>
	//   79  149:istore          9
		int j = (int)(f3 * f1 + f3 * f4 * 2.0F);
	//   80  151:fload           6
	//   81  153:fload           4
	//   82  155:fmul            
	//   83  156:fload           6
	//   84  158:fload           7
	//   85  160:fmul            
	//   86  161:fconst_2        
	//   87  162:fmul            
	//   88  163:fadd            
	//   89  164:f2i             
	//   90  165:istore          10
		if(mCircleView.getVisibility() != 0)
	//*  91  167:aload_0         
	//*  92  168:getfield        #281 <Field CircleImageView mCircleView>
	//*  93  171:invokevirtual   #401 <Method int CircleImageView.getVisibility()>
	//*  94  174:ifeq            185
			mCircleView.setVisibility(0);
	//   95  177:aload_0         
	//   96  178:getfield        #281 <Field CircleImageView mCircleView>
	//   97  181:iconst_0        
	//   98  182:invokevirtual   #324 <Method void CircleImageView.setVisibility(int)>
		if(!mScale)
	//*  99  185:aload_0         
	//* 100  186:getfield        #297 <Field boolean mScale>
	//* 101  189:ifne            208
		{
			mCircleView.setScaleX(1.0F);
	//  102  192:aload_0         
	//  103  193:getfield        #281 <Field CircleImageView mCircleView>
	//  104  196:fconst_1        
	//  105  197:invokevirtual   #404 <Method void CircleImageView.setScaleX(float)>
			mCircleView.setScaleY(1.0F);
	//  106  200:aload_0         
	//  107  201:getfield        #281 <Field CircleImageView mCircleView>
	//  108  204:fconst_1        
	//  109  205:invokevirtual   #407 <Method void CircleImageView.setScaleY(float)>
		}
		if(mScale)
	//* 110  208:aload_0         
	//* 111  209:getfield        #297 <Field boolean mScale>
	//* 112  212:ifeq            229
			setAnimationProgress(Math.min(1.0F, f / mTotalDragDistance));
	//  113  215:aload_0         
	//  114  216:fconst_1        
	//  115  217:fload_1         
	//  116  218:aload_0         
	//  117  219:getfield        #142 <Field float mTotalDragDistance>
	//  118  222:fdiv            
	//  119  223:invokestatic    #378 <Method float Math.min(float, float)>
	//  120  226:invokevirtual   #410 <Method void setAnimationProgress(float)>
		if(f < mTotalDragDistance)
	//* 121  229:fload_1         
	//* 122  230:aload_0         
	//* 123  231:getfield        #142 <Field float mTotalDragDistance>
	//* 124  234:fcmpg           
	//* 125  235:ifge            268
		{
			if(mProgress.getAlpha() > 76 && !isAnimationRunning(mAlphaStartAnimation))
	//* 126  238:aload_0         
	//* 127  239:getfield        #313 <Field CircularProgressDrawable mProgress>
	//* 128  242:invokevirtual   #413 <Method int CircularProgressDrawable.getAlpha()>
	//* 129  245:bipush          76
	//* 130  247:icmple          296
	//* 131  250:aload_0         
	//* 132  251:aload_0         
	//* 133  252:getfield        #415 <Field Animation mAlphaStartAnimation>
	//* 134  255:invokespecial   #417 <Method boolean isAnimationRunning(Animation)>
	//* 135  258:ifne            296
				startProgressAlphaStartAnimation();
	//  136  261:aload_0         
	//  137  262:invokespecial   #420 <Method void startProgressAlphaStartAnimation()>
		} else
	//* 138  265:goto            296
		if(mProgress.getAlpha() < 255 && !isAnimationRunning(mAlphaMaxAnimation))
	//* 139  268:aload_0         
	//* 140  269:getfield        #313 <Field CircularProgressDrawable mProgress>
	//* 141  272:invokevirtual   #413 <Method int CircularProgressDrawable.getAlpha()>
	//* 142  275:sipush          255
	//* 143  278:icmpge          296
	//* 144  281:aload_0         
	//* 145  282:aload_0         
	//* 146  283:getfield        #422 <Field Animation mAlphaMaxAnimation>
	//* 147  286:invokespecial   #417 <Method boolean isAnimationRunning(Animation)>
	//* 148  289:ifne            296
			startProgressAlphaMaxAnimation();
	//  149  292:aload_0         
	//  150  293:invokespecial   #425 <Method void startProgressAlphaMaxAnimation()>
		mProgress.setStartEndTrim(0.0F, Math.min(0.8F, f2 * 0.8F));
	//  151  296:aload_0         
	//  152  297:getfield        #313 <Field CircularProgressDrawable mProgress>
	//  153  300:fconst_0        
	//  154  301:ldc1            #67  <Float 0.8F>
	//  155  303:fload           5
	//  156  305:ldc1            #67  <Float 0.8F>
	//  157  307:fmul            
	//  158  308:invokestatic    #378 <Method float Math.min(float, float)>
	//  159  311:invokevirtual   #352 <Method void CircularProgressDrawable.setStartEndTrim(float, float)>
		mProgress.setArrowScale(Math.min(1.0F, f2));
	//  160  314:aload_0         
	//  161  315:getfield        #313 <Field CircularProgressDrawable mProgress>
	//  162  318:fconst_1        
	//  163  319:fload           5
	//  164  321:invokestatic    #378 <Method float Math.min(float, float)>
	//  165  324:invokevirtual   #428 <Method void CircularProgressDrawable.setArrowScale(float)>
		mProgress.setProgressRotation(((f2 * 0.4F - 0.25F) + f4 * 2.0F) * 0.5F);
	//  166  327:aload_0         
	//  167  328:getfield        #313 <Field CircularProgressDrawable mProgress>
	//  168  331:fload           5
	//  169  333:ldc2            #429 <Float 0.4F>
	//  170  336:fmul            
	//  171  337:ldc2            #430 <Float 0.25F>
	//  172  340:fsub            
	//  173  341:fload           7
	//  174  343:fconst_2        
	//  175  344:fmul            
	//  176  345:fadd            
	//  177  346:ldc1            #54  <Float 0.5F>
	//  178  348:fmul            
	//  179  349:invokevirtual   #433 <Method void CircularProgressDrawable.setProgressRotation(float)>
		setTargetOffsetTopAndBottom((i + j) - mCurrentTargetOffsetTop);
	//  180  352:aload_0         
	//  181  353:iload           9
	//  182  355:iload           10
	//  183  357:iadd            
	//  184  358:aload_0         
	//  185  359:getfield        #237 <Field int mCurrentTargetOffsetTop>
	//  186  362:isub            
	//  187  363:invokevirtual   #436 <Method void setTargetOffsetTopAndBottom(int)>
	//  188  366:return          
	}

	private void onSecondaryPointerUp(MotionEvent motionevent)
	{
		int i = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #443 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #446 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #148 <Field int mActivePointerId>
	//*   8   14:icmpne          37
		{
			if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            26
				i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:goto            28
				i = 0;
	//   14   26:iconst_0        
	//   15   27:istore_2        
			mActivePointerId = motionevent.getPointerId(i);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:iload_2         
	//   19   31:invokevirtual   #446 <Method int MotionEvent.getPointerId(int)>
	//   20   34:putfield        #148 <Field int mActivePointerId>
		}
	//   21   37:return          
	}

	private void setColorViewAlpha(int i)
	{
		mCircleView.getBackground().setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #451 <Method Drawable CircleImageView.getBackground()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #456 <Method void Drawable.setAlpha(int)>
		mProgress.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #313 <Field CircularProgressDrawable mProgress>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #457 <Method void CircularProgressDrawable.setAlpha(int)>
	//    9   19:return          
	}

	private void setRefreshing(boolean flag, boolean flag1)
	{
		if(mRefreshing != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #139 <Field boolean mRefreshing>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			mNotify = flag1;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #459 <Field boolean mNotify>
			ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #461 <Method void ensureTarget()>
			mRefreshing = flag;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #139 <Field boolean mRefreshing>
			if(mRefreshing)
	//*  12   22:aload_0         
	//*  13   23:getfield        #139 <Field boolean mRefreshing>
	//*  14   26:ifeq            42
			{
				animateOffsetToCorrectPosition(mCurrentTargetOffsetTop, mRefreshListener);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #237 <Field int mCurrentTargetOffsetTop>
	//   18   34:aload_0         
	//   19   35:getfield        #155 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   20   38:invokespecial   #463 <Method void animateOffsetToCorrectPosition(int, android.view.animation.Animation$AnimationListener)>
				return;
	//   21   41:return          
			}
			startScaleDownAnimation(mRefreshListener);
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #155 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   25   47:invokevirtual   #466 <Method void startScaleDownAnimation(android.view.animation.Animation$AnimationListener)>
		}
	//   26   50:return          
	}

	private Animation startAlphaAnimation(final int startingAlpha, final int endingAlpha)
	{
		Animation animation = new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				transformation = ((Transformation) (mProgress));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SwipeRefreshLayout this$0>
			//    2    4:getfield        #32  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
			//    3    7:astore_2        
				int i = startingAlpha;
			//    4    8:aload_0         
			//    5    9:getfield        #20  <Field int val$startingAlpha>
			//    6   12:istore_3        
				((CircularProgressDrawable) (transformation)).setAlpha((int)((float)i + (float)(endingAlpha - i) * f));
			//    7   13:aload_2         
			//    8   14:iload_3         
			//    9   15:i2f             
			//   10   16:aload_0         
			//   11   17:getfield        #22  <Field int val$endingAlpha>
			//   12   20:iload_3         
			//   13   21:isub            
			//   14   22:i2f             
			//   15   23:fload_1         
			//   16   24:fmul            
			//   17   25:fadd            
			//   18   26:f2i             
			//   19   27:invokevirtual   #38  <Method void CircularProgressDrawable.setAlpha(int)>
			//   20   30:return          
			}

			final SwipeRefreshLayout this$0;
			final int val$endingAlpha;
			final int val$startingAlpha;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field SwipeRefreshLayout this$0>
				startingAlpha = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #20  <Field int val$startingAlpha>
				endingAlpha = j;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #22  <Field int val$endingAlpha>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #25  <Method void Animation()>
			//   11   19:return          
			}
		}
;
	//    0    0:new             #16  <Class SwipeRefreshLayout$4>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokespecial   #471 <Method void SwipeRefreshLayout$4(SwipeRefreshLayout, int, int)>
	//    6   10:astore_3        
		((Animation) (animation)).setDuration(300L);
	//    7   11:aload_3         
	//    8   12:ldc2w           #472 <Long 300L>
	//    9   15:invokevirtual   #275 <Method void Animation.setDuration(long)>
		mCircleView.setAnimationListener(((android.view.animation.Animation.AnimationListener) (null)));
	//   10   18:aload_0         
	//   11   19:getfield        #281 <Field CircleImageView mCircleView>
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #287 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   14   26:aload_0         
	//   15   27:getfield        #281 <Field CircleImageView mCircleView>
	//   16   30:invokevirtual   #290 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(((Animation) (animation)));
	//   17   33:aload_0         
	//   18   34:getfield        #281 <Field CircleImageView mCircleView>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #294 <Method void CircleImageView.startAnimation(Animation)>
		return ((Animation) (animation));
	//   21   41:aload_3         
	//   22   42:areturn         
	}

	private void startDragging(float f)
	{
		float f1 = mInitialDownY;
	//    0    0:aload_0         
	//    1    1:getfield        #476 <Field float mInitialDownY>
	//    2    4:fstore_2        
		int i = mTouchSlop;
	//    3    5:aload_0         
	//    4    6:getfield        #173 <Field int mTouchSlop>
	//    5    9:istore_3        
		if(f - f1 > (float)i && !mIsBeingDragged)
	//*   6   10:fload_1         
	//*   7   11:fload_2         
	//*   8   12:fsub            
	//*   9   13:iload_3         
	//*  10   14:i2f             
	//*  11   15:fcmpl           
	//*  12   16:ifle            48
	//*  13   19:aload_0         
	//*  14   20:getfield        #478 <Field boolean mIsBeingDragged>
	//*  15   23:ifne            48
		{
			mInitialMotionY = f1 + (float)i;
	//   16   26:aload_0         
	//   17   27:fload_2         
	//   18   28:iload_3         
	//   19   29:i2f             
	//   20   30:fadd            
	//   21   31:putfield        #480 <Field float mInitialMotionY>
			mIsBeingDragged = true;
	//   22   34:aload_0         
	//   23   35:iconst_1        
	//   24   36:putfield        #478 <Field boolean mIsBeingDragged>
			mProgress.setAlpha(76);
	//   25   39:aload_0         
	//   26   40:getfield        #313 <Field CircularProgressDrawable mProgress>
	//   27   43:bipush          76
	//   28   45:invokevirtual   #457 <Method void CircularProgressDrawable.setAlpha(int)>
		}
	//   29   48:return          
	}

	private void startProgressAlphaMaxAnimation()
	{
		mAlphaMaxAnimation = startAlphaAnimation(mProgress.getAlpha(), 255);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #313 <Field CircularProgressDrawable mProgress>
	//    4    6:invokevirtual   #413 <Method int CircularProgressDrawable.getAlpha()>
	//    5    9:sipush          255
	//    6   12:invokespecial   #482 <Method Animation startAlphaAnimation(int, int)>
	//    7   15:putfield        #422 <Field Animation mAlphaMaxAnimation>
	//    8   18:return          
	}

	private void startProgressAlphaStartAnimation()
	{
		mAlphaStartAnimation = startAlphaAnimation(mProgress.getAlpha(), 76);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #313 <Field CircularProgressDrawable mProgress>
	//    4    6:invokevirtual   #413 <Method int CircularProgressDrawable.getAlpha()>
	//    5    9:bipush          76
	//    6   11:invokespecial   #482 <Method Animation startAlphaAnimation(int, int)>
	//    7   14:putfield        #415 <Field Animation mAlphaStartAnimation>
	//    8   17:return          
	}

	private void startScaleDownReturnToStartAnimation(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		mFrom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #264 <Field int mFrom>
		mStartingScale = mCircleView.getScaleX();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #281 <Field CircleImageView mCircleView>
	//    6   10:invokevirtual   #486 <Method float CircleImageView.getScaleX()>
	//    7   13:putfield        #488 <Field float mStartingScale>
		mScaleDownToStartAnimation = ((Animation) (new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				float f1 = mStartingScale;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SwipeRefreshLayout this$0>
			//    2    4:getfield        #25  <Field float SwipeRefreshLayout.mStartingScale>
			//    3    7:fstore_3        
				float f2 = -mStartingScale;
			//    4    8:aload_0         
			//    5    9:getfield        #15  <Field SwipeRefreshLayout this$0>
			//    6   12:getfield        #25  <Field float SwipeRefreshLayout.mStartingScale>
			//    7   15:fneg            
			//    8   16:fstore          4
				setAnimationProgress(f1 + f2 * f);
			//    9   18:aload_0         
			//   10   19:getfield        #15  <Field SwipeRefreshLayout this$0>
			//   11   22:fload_3         
			//   12   23:fload           4
			//   13   25:fload_1         
			//   14   26:fmul            
			//   15   27:fadd            
			//   16   28:invokevirtual   #29  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
				moveToStart(f);
			//   17   31:aload_0         
			//   18   32:getfield        #15  <Field SwipeRefreshLayout this$0>
			//   19   35:fload_1         
			//   20   36:invokevirtual   #32  <Method void SwipeRefreshLayout.moveToStart(float)>
			//   21   39:return          
			}

			final SwipeRefreshLayout this$0;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeRefreshLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//    8   16:aload_0         
	//    9   17:new             #24  <Class SwipeRefreshLayout$8>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #489 <Method void SwipeRefreshLayout$8(SwipeRefreshLayout)>
	//   13   25:putfield        #491 <Field Animation mScaleDownToStartAnimation>
		mScaleDownToStartAnimation.setDuration(150L);
	//   14   28:aload_0         
	//   15   29:getfield        #491 <Field Animation mScaleDownToStartAnimation>
	//   16   32:ldc2w           #492 <Long 150L>
	//   17   35:invokevirtual   #275 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          50
			mCircleView.setAnimationListener(animationlistener);
	//   20   42:aload_0         
	//   21   43:getfield        #281 <Field CircleImageView mCircleView>
	//   22   46:aload_2         
	//   23   47:invokevirtual   #287 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   24   50:aload_0         
	//   25   51:getfield        #281 <Field CircleImageView mCircleView>
	//   26   54:invokevirtual   #290 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleDownToStartAnimation);
	//   27   57:aload_0         
	//   28   58:getfield        #281 <Field CircleImageView mCircleView>
	//   29   61:aload_0         
	//   30   62:getfield        #491 <Field Animation mScaleDownToStartAnimation>
	//   31   65:invokevirtual   #294 <Method void CircleImageView.startAnimation(Animation)>
	//   32   68:return          
	}

	private void startScaleUpAnimation(android.view.animation.Animation.AnimationListener animationlistener)
	{
		mCircleView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field CircleImageView mCircleView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #324 <Method void CircleImageView.setVisibility(int)>
		mProgress.setAlpha(255);
	//    4    8:aload_0         
	//    5    9:getfield        #313 <Field CircularProgressDrawable mProgress>
	//    6   12:sipush          255
	//    7   15:invokevirtual   #457 <Method void CircularProgressDrawable.setAlpha(int)>
		mScaleAnimation = ((Animation) (new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				setAnimationProgress(f);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SwipeRefreshLayout this$0>
			//    2    4:fload_1         
			//    3    5:invokevirtual   #25  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
			//    4    8:return          
			}

			final SwipeRefreshLayout this$0;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeRefreshLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//    8   18:aload_0         
	//    9   19:new             #12  <Class SwipeRefreshLayout$2>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:invokespecial   #495 <Method void SwipeRefreshLayout$2(SwipeRefreshLayout)>
	//   13   27:putfield        #497 <Field Animation mScaleAnimation>
		mScaleAnimation.setDuration(mMediumAnimationDuration);
	//   14   30:aload_0         
	//   15   31:getfield        #497 <Field Animation mScaleAnimation>
	//   16   34:aload_0         
	//   17   35:getfield        #186 <Field int mMediumAnimationDuration>
	//   18   38:i2l             
	//   19   39:invokevirtual   #275 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  20   42:aload_1         
	//*  21   43:ifnull          54
			mCircleView.setAnimationListener(animationlistener);
	//   22   46:aload_0         
	//   23   47:getfield        #281 <Field CircleImageView mCircleView>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #287 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   26   54:aload_0         
	//   27   55:getfield        #281 <Field CircleImageView mCircleView>
	//   28   58:invokevirtual   #290 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleAnimation);
	//   29   61:aload_0         
	//   30   62:getfield        #281 <Field CircleImageView mCircleView>
	//   31   65:aload_0         
	//   32   66:getfield        #497 <Field Animation mScaleAnimation>
	//   33   69:invokevirtual   #294 <Method void CircleImageView.startAnimation(Animation)>
	//   34   72:return          
	}

	public boolean canChildScrollUp()
	{
		Object obj = ((Object) (mChildScrollUpCallback));
	//    0    0:aload_0         
	//    1    1:getfield        #500 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
			return ((OnChildScrollUpCallback) (obj)).canChildScrollUp(this, mTarget);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #330 <Field View mTarget>
	//    9   15:invokeinterface #503 <Method boolean SwipeRefreshLayout$OnChildScrollUpCallback.canChildScrollUp(SwipeRefreshLayout, View)>
	//   10   20:ireturn         
		obj = ((Object) (mTarget));
	//   11   21:aload_0         
	//   12   22:getfield        #330 <Field View mTarget>
	//   13   25:astore_1        
		if(obj instanceof ListView)
	//*  14   26:aload_1         
	//*  15   27:instanceof      #505 <Class ListView>
	//*  16   30:ifeq            42
			return ListViewCompat.canScrollList((ListView)obj, -1);
	//   17   33:aload_1         
	//   18   34:checkcast       #505 <Class ListView>
	//   19   37:iconst_m1       
	//   20   38:invokestatic    #511 <Method boolean ListViewCompat.canScrollList(ListView, int)>
	//   21   41:ireturn         
		else
			return ((View) (obj)).canScrollVertically(-1);
	//   22   42:aload_1         
	//   23   43:iconst_m1       
	//   24   44:invokevirtual   #517 <Method boolean View.canScrollVertically(int)>
	//   25   47:ireturn         
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		return mNestedScrollingChildHelper.dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #521 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mNestedScrollingChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #525 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return mNestedScrollingChildHelper.dispatchNestedPreScroll(i, j, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #529 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return mNestedScrollingChildHelper.dispatchNestedScroll(i, j, k, l, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #533 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	protected int getChildDrawingOrder(int i, int j)
	{
		int k = mCircleViewIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #150 <Field int mCircleViewIndex>
	//    2    4:istore_3        
		if(k < 0)
	//*   3    5:iload_3         
	//*   4    6:ifge            11
			return j;
	//    5    9:iload_2         
	//    6   10:ireturn         
		if(j == i - 1)
	//*   7   11:iload_2         
	//*   8   12:iload_1         
	//*   9   13:iconst_1        
	//*  10   14:isub            
	//*  11   15:icmpne          20
			return k;
	//   12   18:iload_3         
	//   13   19:ireturn         
		if(j >= k)
	//*  14   20:iload_2         
	//*  15   21:iload_3         
	//*  16   22:icmplt          29
			return j + 1;
	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:ireturn         
		else
			return j;
	//   21   29:iload_2         
	//   22   30:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollingParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:invokevirtual   #538 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	public int getProgressCircleDiameter()
	{
		return mCircleDiameter;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field int mCircleDiameter>
	//    2    4:ireturn         
	}

	public int getProgressViewEndOffset()
	{
		return mSpinnerOffsetEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #218 <Field int mSpinnerOffsetEnd>
	//    2    4:ireturn         
	}

	public int getProgressViewStartOffset()
	{
		return mOriginalOffsetTop;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field int mOriginalOffsetTop>
	//    2    4:ireturn         
	}

	public boolean hasNestedScrollingParent()
	{
		return mNestedScrollingChildHelper.hasNestedScrollingParent();
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #544 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent()>
	//    3    7:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mNestedScrollingChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #547 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
	//    3    7:ireturn         
	}

	public boolean isRefreshing()
	{
		return mRefreshing;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field boolean mRefreshing>
	//    2    4:ireturn         
	}

	void moveToStart(float f)
	{
		int i = mFrom;
	//    0    0:aload_0         
	//    1    1:getfield        #264 <Field int mFrom>
	//    2    4:istore_2        
		setTargetOffsetTopAndBottom((i + (int)((float)(mOriginalOffsetTop - i) * f)) - mCircleView.getTop());
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:aload_0         
	//    6    8:getfield        #239 <Field int mOriginalOffsetTop>
	//    7   11:iload_2         
	//    8   12:isub            
	//    9   13:i2f             
	//   10   14:fload_1         
	//   11   15:fmul            
	//   12   16:f2i             
	//   13   17:iadd            
	//   14   18:aload_0         
	//   15   19:getfield        #281 <Field CircleImageView mCircleView>
	//   16   22:invokevirtual   #551 <Method int CircleImageView.getTop()>
	//   17   25:isub            
	//   18   26:invokevirtual   #436 <Method void setTargetOffsetTopAndBottom(int)>
	//   19   29:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #554 <Method void ViewGroup.onDetachedFromWindow()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #555 <Method void reset()>
	//    4    8:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		ensureTarget();
	//    0    0:aload_0         
	//    1    1:invokespecial   #461 <Method void ensureTarget()>
		int i = motionevent.getActionMasked();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #560 <Method int MotionEvent.getActionMasked()>
	//    4    8:istore_2        
		if(mReturningToStart && i == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #562 <Field boolean mReturningToStart>
	//*   7   13:ifeq            25
	//*   8   16:iload_2         
	//*   9   17:ifne            25
			mReturningToStart = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #562 <Field boolean mReturningToStart>
		if(isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #565 <Method boolean isEnabled()>
	//*  15   29:ifeq            229
	//*  16   32:aload_0         
	//*  17   33:getfield        #562 <Field boolean mReturningToStart>
	//*  18   36:ifne            229
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #567 <Method boolean canChildScrollUp()>
	//*  21   43:ifne            229
	//*  22   46:aload_0         
	//*  23   47:getfield        #139 <Field boolean mRefreshing>
	//*  24   50:ifne            229
		{
			if(mNestedScrollInProgress)
	//*  25   53:aload_0         
	//*  26   54:getfield        #569 <Field boolean mNestedScrollInProgress>
	//*  27   57:ifeq            62
				return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
			if(i != 6)
	//*  30   62:iload_2         
	//*  31   63:bipush          6
	//*  32   65:icmpeq          219
				switch(i)
	//*  33   68:iload_2         
				{
	//*  34   69:tableswitch     0 3: default 100
	//	               0 162
	//	               1 149
	//	               2 103
	//	               3 149
	//*  35  100:goto            224
				case 2: // '\002'
					int j = mActivePointerId;
	//   36  103:aload_0         
	//   37  104:getfield        #148 <Field int mActivePointerId>
	//   38  107:istore_2        
					if(j == -1)
	//*  39  108:iload_2         
	//*  40  109:iconst_m1       
	//*  41  110:icmpne          125
					{
						Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
	//   42  113:getstatic       #571 <Field String LOG_TAG>
	//   43  116:ldc2            #573 <String "Got ACTION_MOVE event but don't have an active pointer id.">
	//   44  119:invokestatic    #579 <Method int Log.e(String, String)>
	//   45  122:pop             
						return false;
	//   46  123:iconst_0        
	//   47  124:ireturn         
					}
					j = motionevent.findPointerIndex(j);
	//   48  125:aload_1         
	//   49  126:iload_2         
	//   50  127:invokevirtual   #582 <Method int MotionEvent.findPointerIndex(int)>
	//   51  130:istore_2        
					if(j < 0)
	//*  52  131:iload_2         
	//*  53  132:ifge            137
						return false;
	//   54  135:iconst_0        
	//   55  136:ireturn         
					startDragging(motionevent.getY(j));
	//   56  137:aload_0         
	//   57  138:aload_1         
	//   58  139:iload_2         
	//   59  140:invokevirtual   #586 <Method float MotionEvent.getY(int)>
	//   60  143:invokespecial   #588 <Method void startDragging(float)>
					break;

	//*  61  146:goto            224
				case 1: // '\001'
				case 3: // '\003'
					mIsBeingDragged = false;
	//   62  149:aload_0         
	//   63  150:iconst_0        
	//   64  151:putfield        #478 <Field boolean mIsBeingDragged>
					mActivePointerId = -1;
	//   65  154:aload_0         
	//   66  155:iconst_m1       
	//   67  156:putfield        #148 <Field int mActivePointerId>
					break;

	//*  68  159:goto            224
				case 0: // '\0'
					setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCircleView.getTop());
	//   69  162:aload_0         
	//   70  163:aload_0         
	//   71  164:getfield        #239 <Field int mOriginalOffsetTop>
	//   72  167:aload_0         
	//   73  168:getfield        #281 <Field CircleImageView mCircleView>
	//   74  171:invokevirtual   #551 <Method int CircleImageView.getTop()>
	//   75  174:isub            
	//   76  175:invokevirtual   #436 <Method void setTargetOffsetTopAndBottom(int)>
					mActivePointerId = motionevent.getPointerId(0);
	//   77  178:aload_0         
	//   78  179:aload_1         
	//   79  180:iconst_0        
	//   80  181:invokevirtual   #446 <Method int MotionEvent.getPointerId(int)>
	//   81  184:putfield        #148 <Field int mActivePointerId>
					mIsBeingDragged = false;
	//   82  187:aload_0         
	//   83  188:iconst_0        
	//   84  189:putfield        #478 <Field boolean mIsBeingDragged>
					int k = motionevent.findPointerIndex(mActivePointerId);
	//   85  192:aload_1         
	//   86  193:aload_0         
	//   87  194:getfield        #148 <Field int mActivePointerId>
	//   88  197:invokevirtual   #582 <Method int MotionEvent.findPointerIndex(int)>
	//   89  200:istore_2        
					if(k < 0)
	//*  90  201:iload_2         
	//*  91  202:ifge            207
						return false;
	//   92  205:iconst_0        
	//   93  206:ireturn         
					mInitialDownY = motionevent.getY(k);
	//   94  207:aload_0         
	//   95  208:aload_1         
	//   96  209:iload_2         
	//   97  210:invokevirtual   #586 <Method float MotionEvent.getY(int)>
	//   98  213:putfield        #476 <Field float mInitialDownY>
					break;
				}
			else
	//*  99  216:goto            224
				onSecondaryPointerUp(motionevent);
	//  100  219:aload_0         
	//  101  220:aload_1         
	//  102  221:invokespecial   #590 <Method void onSecondaryPointerUp(MotionEvent)>
			return mIsBeingDragged;
	//  103  224:aload_0         
	//  104  225:getfield        #478 <Field boolean mIsBeingDragged>
	//  105  228:ireturn         
		} else
		{
			return false;
	//  106  229:iconst_0        
	//  107  230:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		i = getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #595 <Method int getMeasuredWidth()>
	//    2    4:istore_2        
		j = getMeasuredHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #598 <Method int getMeasuredHeight()>
	//    5    9:istore_3        
		if(getChildCount() == 0)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #333 <Method int getChildCount()>
	//*   8   14:ifne            18
			return;
	//    9   17:return          
		if(mTarget == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #330 <Field View mTarget>
	//*  12   22:ifnonnull       29
			ensureTarget();
	//   13   25:aload_0         
	//   14   26:invokespecial   #461 <Method void ensureTarget()>
		Object obj = ((Object) (mTarget));
	//   15   29:aload_0         
	//   16   30:getfield        #330 <Field View mTarget>
	//   17   33:astore          6
		if(obj == null)
	//*  18   35:aload           6
	//*  19   37:ifnonnull       41
		{
			return;
	//   20   40:return          
		} else
		{
			k = getPaddingLeft();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #601 <Method int getPaddingLeft()>
	//   23   45:istore          4
			l = getPaddingTop();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #604 <Method int getPaddingTop()>
	//   26   51:istore          5
			((View) (obj)).layout(k, l, (i - getPaddingLeft() - getPaddingRight()) + k, (j - getPaddingTop() - getPaddingBottom()) + l);
	//   27   53:aload           6
	//   28   55:iload           4
	//   29   57:iload           5
	//   30   59:iload_2         
	//   31   60:aload_0         
	//   32   61:invokevirtual   #601 <Method int getPaddingLeft()>
	//   33   64:isub            
	//   34   65:aload_0         
	//   35   66:invokevirtual   #607 <Method int getPaddingRight()>
	//   36   69:isub            
	//   37   70:iload           4
	//   38   72:iadd            
	//   39   73:iload_3         
	//   40   74:aload_0         
	//   41   75:invokevirtual   #604 <Method int getPaddingTop()>
	//   42   78:isub            
	//   43   79:aload_0         
	//   44   80:invokevirtual   #610 <Method int getPaddingBottom()>
	//   45   83:isub            
	//   46   84:iload           5
	//   47   86:iadd            
	//   48   87:invokevirtual   #614 <Method void View.layout(int, int, int, int)>
			k = mCircleView.getMeasuredWidth();
	//   49   90:aload_0         
	//   50   91:getfield        #281 <Field CircleImageView mCircleView>
	//   51   94:invokevirtual   #615 <Method int CircleImageView.getMeasuredWidth()>
	//   52   97:istore          4
			j = mCircleView.getMeasuredHeight();
	//   53   99:aload_0         
	//   54  100:getfield        #281 <Field CircleImageView mCircleView>
	//   55  103:invokevirtual   #616 <Method int CircleImageView.getMeasuredHeight()>
	//   56  106:istore_3        
			obj = ((Object) (mCircleView));
	//   57  107:aload_0         
	//   58  108:getfield        #281 <Field CircleImageView mCircleView>
	//   59  111:astore          6
			i /= 2;
	//   60  113:iload_2         
	//   61  114:iconst_2        
	//   62  115:idiv            
	//   63  116:istore_2        
			k /= 2;
	//   64  117:iload           4
	//   65  119:iconst_2        
	//   66  120:idiv            
	//   67  121:istore          4
			l = mCurrentTargetOffsetTop;
	//   68  123:aload_0         
	//   69  124:getfield        #237 <Field int mCurrentTargetOffsetTop>
	//   70  127:istore          5
			((CircleImageView) (obj)).layout(i - k, l, i + k, j + l);
	//   71  129:aload           6
	//   72  131:iload_2         
	//   73  132:iload           4
	//   74  134:isub            
	//   75  135:iload           5
	//   76  137:iload_2         
	//   77  138:iload           4
	//   78  140:iadd            
	//   79  141:iload_3         
	//   80  142:iload           5
	//   81  144:iadd            
	//   82  145:invokevirtual   #617 <Method void CircleImageView.layout(int, int, int, int)>
			return;
	//   83  148:return          
		}
	}

	public void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #621 <Method void ViewGroup.onMeasure(int, int)>
		if(mTarget == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #330 <Field View mTarget>
	//*   6   10:ifnonnull       17
			ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #461 <Method void ensureTarget()>
		View view = mTarget;
	//    9   17:aload_0         
	//   10   18:getfield        #330 <Field View mTarget>
	//   11   21:astore_3        
		if(view == null)
	//*  12   22:aload_3         
	//*  13   23:ifnonnull       27
			return;
	//   14   26:return          
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   15   27:aload_3         
	//   16   28:aload_0         
	//   17   29:invokevirtual   #595 <Method int getMeasuredWidth()>
	//   18   32:aload_0         
	//   19   33:invokevirtual   #601 <Method int getPaddingLeft()>
	//   20   36:isub            
	//   21   37:aload_0         
	//   22   38:invokevirtual   #607 <Method int getPaddingRight()>
	//   23   41:isub            
	//   24   42:ldc2            #622 <Int 0x40000000>
	//   25   45:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   26   48:aload_0         
	//   27   49:invokevirtual   #598 <Method int getMeasuredHeight()>
	//   28   52:aload_0         
	//   29   53:invokevirtual   #604 <Method int getPaddingTop()>
	//   30   56:isub            
	//   31   57:aload_0         
	//   32   58:invokevirtual   #610 <Method int getPaddingBottom()>
	//   33   61:isub            
	//   34   62:ldc2            #622 <Int 0x40000000>
	//   35   65:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   36   68:invokevirtual   #630 <Method void View.measure(int, int)>
		mCircleView.measure(android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000));
	//   37   71:aload_0         
	//   38   72:getfield        #281 <Field CircleImageView mCircleView>
	//   39   75:aload_0         
	//   40   76:getfield        #209 <Field int mCircleDiameter>
	//   41   79:ldc2            #622 <Int 0x40000000>
	//   42   82:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   43   85:aload_0         
	//   44   86:getfield        #209 <Field int mCircleDiameter>
	//   45   89:ldc2            #622 <Int 0x40000000>
	//   46   92:invokestatic    #627 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   47   95:invokevirtual   #631 <Method void CircleImageView.measure(int, int)>
		mCircleViewIndex = -1;
	//   48   98:aload_0         
	//   49   99:iconst_m1       
	//   50  100:putfield        #150 <Field int mCircleViewIndex>
		for(i = 0; i < getChildCount(); i++)
	//*  51  103:iconst_0        
	//*  52  104:istore_1        
	//*  53  105:iload_1         
	//*  54  106:aload_0         
	//*  55  107:invokevirtual   #333 <Method int getChildCount()>
	//*  56  110:icmpge          138
			if(getChildAt(i) == mCircleView)
	//*  57  113:aload_0         
	//*  58  114:iload_1         
	//*  59  115:invokevirtual   #337 <Method View getChildAt(int)>
	//*  60  118:aload_0         
	//*  61  119:getfield        #281 <Field CircleImageView mCircleView>
	//*  62  122:if_acmpne       131
			{
				mCircleViewIndex = i;
	//   63  125:aload_0         
	//   64  126:iload_1         
	//   65  127:putfield        #150 <Field int mCircleViewIndex>
				return;
	//   66  130:return          
			}

	//   67  131:iload_1         
	//   68  132:iconst_1        
	//   69  133:iadd            
	//   70  134:istore_1        
	//*  71  135:goto            105
	//   72  138:return          
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		return dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:iload           4
	//    4    5:invokevirtual   #634 <Method boolean dispatchNestedFling(float, float, boolean)>
	//    5    8:ireturn         
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		return dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #637 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		if(j > 0)
	//*   0    0:iload_3         
	//*   1    1:ifle            68
		{
			float f = mTotalUnconsumed;
	//    2    4:aload_0         
	//    3    5:getfield        #641 <Field float mTotalUnconsumed>
	//    4    8:fstore          5
			if(f > 0.0F)
	//*   5   10:fload           5
	//*   6   12:fconst_0        
	//*   7   13:fcmpl           
	//*   8   14:ifle            68
			{
				float f1 = j;
	//    9   17:iload_3         
	//   10   18:i2f             
	//   11   19:fstore          6
				if(f1 > f)
	//*  12   21:fload           6
	//*  13   23:fload           5
	//*  14   25:fcmpl           
	//*  15   26:ifle            46
				{
					ai[1] = j - (int)f;
	//   16   29:aload           4
	//   17   31:iconst_1        
	//   18   32:iload_3         
	//   19   33:fload           5
	//   20   35:f2i             
	//   21   36:isub            
	//   22   37:iastore         
					mTotalUnconsumed = 0.0F;
	//   23   38:aload_0         
	//   24   39:fconst_0        
	//   25   40:putfield        #641 <Field float mTotalUnconsumed>
				} else
	//*  26   43:goto            60
				{
					mTotalUnconsumed = f - f1;
	//   27   46:aload_0         
	//   28   47:fload           5
	//   29   49:fload           6
	//   30   51:fsub            
	//   31   52:putfield        #641 <Field float mTotalUnconsumed>
					ai[1] = j;
	//   32   55:aload           4
	//   33   57:iconst_1        
	//   34   58:iload_3         
	//   35   59:iastore         
				}
				moveSpinner(mTotalUnconsumed);
	//   36   60:aload_0         
	//   37   61:aload_0         
	//   38   62:getfield        #641 <Field float mTotalUnconsumed>
	//   39   65:invokespecial   #643 <Method void moveSpinner(float)>
			}
		}
		if(mUsingCustomStart && j > 0 && mTotalUnconsumed == 0.0F && Math.abs(j - ai[1]) > 0)
	//*  40   68:aload_0         
	//*  41   69:getfield        #390 <Field boolean mUsingCustomStart>
	//*  42   72:ifeq            109
	//*  43   75:iload_3         
	//*  44   76:ifle            109
	//*  45   79:aload_0         
	//*  46   80:getfield        #641 <Field float mTotalUnconsumed>
	//*  47   83:fconst_0        
	//*  48   84:fcmpl           
	//*  49   85:ifne            109
	//*  50   88:iload_3         
	//*  51   89:aload           4
	//*  52   91:iconst_1        
	//*  53   92:iaload          
	//*  54   93:isub            
	//*  55   94:invokestatic    #645 <Method int Math.abs(int)>
	//*  56   97:ifle            109
			mCircleView.setVisibility(8);
	//   57  100:aload_0         
	//   58  101:getfield        #281 <Field CircleImageView mCircleView>
	//   59  104:bipush          8
	//   60  106:invokevirtual   #324 <Method void CircleImageView.setVisibility(int)>
		view = ((View) (mParentScrollConsumed));
	//   61  109:aload_0         
	//   62  110:getfield        #144 <Field int[] mParentScrollConsumed>
	//   63  113:astore_1        
		if(dispatchNestedPreScroll(i - ai[0], j - ai[1], ((int []) (view)), ((int []) (null))))
	//*  64  114:aload_0         
	//*  65  115:iload_2         
	//*  66  116:aload           4
	//*  67  118:iconst_0        
	//*  68  119:iaload          
	//*  69  120:isub            
	//*  70  121:iload_3         
	//*  71  122:aload           4
	//*  72  124:iconst_1        
	//*  73  125:iaload          
	//*  74  126:isub            
	//*  75  127:aload_1         
	//*  76  128:aconst_null     
	//*  77  129:invokevirtual   #646 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//*  78  132:ifeq            159
		{
			ai[0] = ai[0] + view[0];
	//   79  135:aload           4
	//   80  137:iconst_0        
	//   81  138:aload           4
	//   82  140:iconst_0        
	//   83  141:iaload          
	//   84  142:aload_1         
	//   85  143:iconst_0        
	//   86  144:iaload          
	//   87  145:iadd            
	//   88  146:iastore         
			ai[1] = ai[1] + view[1];
	//   89  147:aload           4
	//   90  149:iconst_1        
	//   91  150:aload           4
	//   92  152:iconst_1        
	//   93  153:iaload          
	//   94  154:aload_1         
	//   95  155:iconst_1        
	//   96  156:iaload          
	//   97  157:iadd            
	//   98  158:iastore         
		}
	//   99  159:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		dispatchNestedScroll(i, j, k, l, mParentOffsetInWindow);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:aload_0         
	//    6    8:getfield        #146 <Field int[] mParentOffsetInWindow>
	//    7   11:invokevirtual   #649 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:pop             
		i = l + mParentOffsetInWindow[1];
	//    9   15:iload           5
	//   10   17:aload_0         
	//   11   18:getfield        #146 <Field int[] mParentOffsetInWindow>
	//   12   21:iconst_1        
	//   13   22:iaload          
	//   14   23:iadd            
	//   15   24:istore_2        
		if(i < 0 && !canChildScrollUp())
	//*  16   25:iload_2         
	//*  17   26:ifge            58
	//*  18   29:aload_0         
	//*  19   30:invokevirtual   #567 <Method boolean canChildScrollUp()>
	//*  20   33:ifne            58
		{
			mTotalUnconsumed = mTotalUnconsumed + (float)Math.abs(i);
	//   21   36:aload_0         
	//   22   37:aload_0         
	//   23   38:getfield        #641 <Field float mTotalUnconsumed>
	//   24   41:iload_2         
	//   25   42:invokestatic    #645 <Method int Math.abs(int)>
	//   26   45:i2f             
	//   27   46:fadd            
	//   28   47:putfield        #641 <Field float mTotalUnconsumed>
			moveSpinner(mTotalUnconsumed);
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #641 <Field float mTotalUnconsumed>
	//   32   55:invokespecial   #643 <Method void moveSpinner(float)>
		}
	//   33   58:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mNestedScrollingParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #653 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		startNestedScroll(i & 2);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:iconst_2        
	//    9   13:iand            
	//   10   14:invokevirtual   #656 <Method boolean startNestedScroll(int)>
	//   11   17:pop             
		mTotalUnconsumed = 0.0F;
	//   12   18:aload_0         
	//   13   19:fconst_0        
	//   14   20:putfield        #641 <Field float mTotalUnconsumed>
		mNestedScrollInProgress = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #569 <Field boolean mNestedScrollInProgress>
	//   18   28:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		return isEnabled() && !mReturningToStart && !mRefreshing && (i & 2) != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #565 <Method boolean isEnabled()>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #562 <Field boolean mReturningToStart>
	//    5   11:ifne            29
	//    6   14:aload_0         
	//    7   15:getfield        #139 <Field boolean mRefreshing>
	//    8   18:ifne            29
	//    9   21:iload_3         
	//   10   22:iconst_2        
	//   11   23:iand            
	//   12   24:ifeq            29
	//   13   27:iconst_1        
	//   14   28:ireturn         
	//   15   29:iconst_0        
	//   16   30:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		mNestedScrollingParentHelper.onStopNestedScroll(view);
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #661 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		mNestedScrollInProgress = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #569 <Field boolean mNestedScrollInProgress>
		float f = mTotalUnconsumed;
	//    7   13:aload_0         
	//    8   14:getfield        #641 <Field float mTotalUnconsumed>
	//    9   17:fstore_2        
		if(f > 0.0F)
	//*  10   18:fload_2         
	//*  11   19:fconst_0        
	//*  12   20:fcmpl           
	//*  13   21:ifle            34
		{
			finishSpinner(f);
	//   14   24:aload_0         
	//   15   25:fload_2         
	//   16   26:invokespecial   #663 <Method void finishSpinner(float)>
			mTotalUnconsumed = 0.0F;
	//   17   29:aload_0         
	//   18   30:fconst_0        
	//   19   31:putfield        #641 <Field float mTotalUnconsumed>
		}
		stopNestedScroll();
	//   20   34:aload_0         
	//   21   35:invokevirtual   #666 <Method void stopNestedScroll()>
	//   22   38:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #560 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(mReturningToStart && i == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #562 <Field boolean mReturningToStart>
	//*   5   10:ifeq            23
	//*   6   13:iload           4
	//*   7   15:ifne            23
			mReturningToStart = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #562 <Field boolean mReturningToStart>
		if(isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing)
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #565 <Method boolean isEnabled()>
	//*  13   27:ifeq            309
	//*  14   30:aload_0         
	//*  15   31:getfield        #562 <Field boolean mReturningToStart>
	//*  16   34:ifne            309
	//*  17   37:aload_0         
	//*  18   38:invokevirtual   #567 <Method boolean canChildScrollUp()>
	//*  19   41:ifne            309
	//*  20   44:aload_0         
	//*  21   45:getfield        #139 <Field boolean mRefreshing>
	//*  22   48:ifne            309
		{
			if(mNestedScrollInProgress)
	//*  23   51:aload_0         
	//*  24   52:getfield        #569 <Field boolean mNestedScrollInProgress>
	//*  25   55:ifeq            60
				return false;
	//   26   58:iconst_0        
	//   27   59:ireturn         
			switch(i)
	//*  28   60:iload           4
			{
			case 4: // '\004'
			default:
				break;

	//*  29   62:tableswitch     0 6: default 104
	//	               0 293
	//	               1 225
	//	               2 153
	//	               3 151
	//	               4 104
	//	               5 115
	//	               6 107
	//*  30  104:goto            307
			case 6: // '\006'
				onSecondaryPointerUp(motionevent);
	//   31  107:aload_0         
	//   32  108:aload_1         
	//   33  109:invokespecial   #590 <Method void onSecondaryPointerUp(MotionEvent)>
				break;
	//   34  112:goto            307

			case 5: // '\005'
				int j = motionevent.getActionIndex();
	//   35  115:aload_1         
	//   36  116:invokevirtual   #443 <Method int MotionEvent.getActionIndex()>
	//   37  119:istore          4
				if(j < 0)
	//*  38  121:iload           4
	//*  39  123:ifge            138
				{
					Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
	//   40  126:getstatic       #571 <Field String LOG_TAG>
	//   41  129:ldc2            #669 <String "Got ACTION_POINTER_DOWN event but have an invalid action index.">
	//   42  132:invokestatic    #579 <Method int Log.e(String, String)>
	//   43  135:pop             
					return false;
	//   44  136:iconst_0        
	//   45  137:ireturn         
				}
				mActivePointerId = motionevent.getPointerId(j);
	//   46  138:aload_0         
	//   47  139:aload_1         
	//   48  140:iload           4
	//   49  142:invokevirtual   #446 <Method int MotionEvent.getPointerId(int)>
	//   50  145:putfield        #148 <Field int mActivePointerId>
				break;
	//   51  148:goto            307

			case 3: // '\003'
				return false;
	//   52  151:iconst_0        
	//   53  152:ireturn         

			case 2: // '\002'
				int k = motionevent.findPointerIndex(mActivePointerId);
	//   54  153:aload_1         
	//   55  154:aload_0         
	//   56  155:getfield        #148 <Field int mActivePointerId>
	//   57  158:invokevirtual   #582 <Method int MotionEvent.findPointerIndex(int)>
	//   58  161:istore          4
				if(k < 0)
	//*  59  163:iload           4
	//*  60  165:ifge            180
				{
					Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
	//   61  168:getstatic       #571 <Field String LOG_TAG>
	//   62  171:ldc2            #671 <String "Got ACTION_MOVE event but have an invalid active pointer id.">
	//   63  174:invokestatic    #579 <Method int Log.e(String, String)>
	//   64  177:pop             
					return false;
	//   65  178:iconst_0        
	//   66  179:ireturn         
				}
				float f = motionevent.getY(k);
	//   67  180:aload_1         
	//   68  181:iload           4
	//   69  183:invokevirtual   #586 <Method float MotionEvent.getY(int)>
	//   70  186:fstore_2        
				startDragging(f);
	//   71  187:aload_0         
	//   72  188:fload_2         
	//   73  189:invokespecial   #588 <Method void startDragging(float)>
				if(!mIsBeingDragged)
					break;
	//   74  192:aload_0         
	//   75  193:getfield        #478 <Field boolean mIsBeingDragged>
	//   76  196:ifeq            307
				f = (f - mInitialMotionY) * 0.5F;
	//   77  199:fload_2         
	//   78  200:aload_0         
	//   79  201:getfield        #480 <Field float mInitialMotionY>
	//   80  204:fsub            
	//   81  205:ldc1            #54  <Float 0.5F>
	//   82  207:fmul            
	//   83  208:fstore_2        
				if(f > 0.0F)
	//*  84  209:fload_2         
	//*  85  210:fconst_0        
	//*  86  211:fcmpl           
	//*  87  212:ifle            223
					moveSpinner(f);
	//   88  215:aload_0         
	//   89  216:fload_2         
	//   90  217:invokespecial   #643 <Method void moveSpinner(float)>
				else
	//*  91  220:goto            307
					return false;
	//   92  223:iconst_0        
	//   93  224:ireturn         
				break;

			case 1: // '\001'
				int l = motionevent.findPointerIndex(mActivePointerId);
	//   94  225:aload_1         
	//   95  226:aload_0         
	//   96  227:getfield        #148 <Field int mActivePointerId>
	//   97  230:invokevirtual   #582 <Method int MotionEvent.findPointerIndex(int)>
	//   98  233:istore          4
				if(l < 0)
	//*  99  235:iload           4
	//* 100  237:ifge            252
				{
					Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
	//  101  240:getstatic       #571 <Field String LOG_TAG>
	//  102  243:ldc2            #673 <String "Got ACTION_UP event but don't have an active pointer id.">
	//  103  246:invokestatic    #579 <Method int Log.e(String, String)>
	//  104  249:pop             
					return false;
	//  105  250:iconst_0        
	//  106  251:ireturn         
				}
				if(mIsBeingDragged)
	//* 107  252:aload_0         
	//* 108  253:getfield        #478 <Field boolean mIsBeingDragged>
	//* 109  256:ifeq            286
				{
					float f1 = motionevent.getY(l);
	//  110  259:aload_1         
	//  111  260:iload           4
	//  112  262:invokevirtual   #586 <Method float MotionEvent.getY(int)>
	//  113  265:fstore_2        
					float f2 = mInitialMotionY;
	//  114  266:aload_0         
	//  115  267:getfield        #480 <Field float mInitialMotionY>
	//  116  270:fstore_3        
					mIsBeingDragged = false;
	//  117  271:aload_0         
	//  118  272:iconst_0        
	//  119  273:putfield        #478 <Field boolean mIsBeingDragged>
					finishSpinner((f1 - f2) * 0.5F);
	//  120  276:aload_0         
	//  121  277:fload_2         
	//  122  278:fload_3         
	//  123  279:fsub            
	//  124  280:ldc1            #54  <Float 0.5F>
	//  125  282:fmul            
	//  126  283:invokespecial   #663 <Method void finishSpinner(float)>
				}
				mActivePointerId = -1;
	//  127  286:aload_0         
	//  128  287:iconst_m1       
	//  129  288:putfield        #148 <Field int mActivePointerId>
				return false;
	//  130  291:iconst_0        
	//  131  292:ireturn         

			case 0: // '\0'
				mActivePointerId = motionevent.getPointerId(0);
	//  132  293:aload_0         
	//  133  294:aload_1         
	//  134  295:iconst_0        
	//  135  296:invokevirtual   #446 <Method int MotionEvent.getPointerId(int)>
	//  136  299:putfield        #148 <Field int mActivePointerId>
				mIsBeingDragged = false;
	//  137  302:aload_0         
	//  138  303:iconst_0        
	//  139  304:putfield        #478 <Field boolean mIsBeingDragged>
				break;
			}
			return true;
	//  140  307:iconst_1        
	//  141  308:ireturn         
		} else
		{
			return false;
	//  142  309:iconst_0        
	//  143  310:ireturn         
		}
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 || !(mTarget instanceof AbsListView))
	//*   0    0:getstatic       #679 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          18
	//*   3    8:aload_0         
	//*   4    9:getfield        #330 <Field View mTarget>
	//*   5   12:instanceof      #681 <Class AbsListView>
	//*   6   15:ifne            40
		{
			View view = mTarget;
	//    7   18:aload_0         
	//    8   19:getfield        #330 <Field View mTarget>
	//    9   22:astore_2        
			if(view != null && !ViewCompat.isNestedScrollingEnabled(view))
	//*  10   23:aload_2         
	//*  11   24:ifnull          35
	//*  12   27:aload_2         
	//*  13   28:invokestatic    #686 <Method boolean ViewCompat.isNestedScrollingEnabled(View)>
	//*  14   31:ifne            35
				return;
	//   15   34:return          
			super.requestDisallowInterceptTouchEvent(flag);
	//   16   35:aload_0         
	//   17   36:iload_1         
	//   18   37:invokespecial   #688 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		}
	//   19   40:return          
	}

	void reset()
	{
		mCircleView.clearAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #290 <Method void CircleImageView.clearAnimation()>
		mProgress.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #313 <Field CircularProgressDrawable mProgress>
	//    5   11:invokevirtual   #691 <Method void CircularProgressDrawable.stop()>
		mCircleView.setVisibility(8);
	//    6   14:aload_0         
	//    7   15:getfield        #281 <Field CircleImageView mCircleView>
	//    8   18:bipush          8
	//    9   20:invokevirtual   #324 <Method void CircleImageView.setVisibility(int)>
		setColorViewAlpha(255);
	//   10   23:aload_0         
	//   11   24:sipush          255
	//   12   27:invokespecial   #693 <Method void setColorViewAlpha(int)>
		if(mScale)
	//*  13   30:aload_0         
	//*  14   31:getfield        #297 <Field boolean mScale>
	//*  15   34:ifeq            45
			setAnimationProgress(0.0F);
	//   16   37:aload_0         
	//   17   38:fconst_0        
	//   18   39:invokevirtual   #410 <Method void setAnimationProgress(float)>
		else
	//*  19   42:goto            58
			setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCurrentTargetOffsetTop);
	//   20   45:aload_0         
	//   21   46:aload_0         
	//   22   47:getfield        #239 <Field int mOriginalOffsetTop>
	//   23   50:aload_0         
	//   24   51:getfield        #237 <Field int mCurrentTargetOffsetTop>
	//   25   54:isub            
	//   26   55:invokevirtual   #436 <Method void setTargetOffsetTopAndBottom(int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//   27   58:aload_0         
	//   28   59:aload_0         
	//   29   60:getfield        #281 <Field CircleImageView mCircleView>
	//   30   63:invokevirtual   #551 <Method int CircleImageView.getTop()>
	//   31   66:putfield        #237 <Field int mCurrentTargetOffsetTop>
	//   32   69:return          
	}

	void setAnimationProgress(float f)
	{
		mCircleView.setScaleX(f);
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field CircleImageView mCircleView>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #404 <Method void CircleImageView.setScaleX(float)>
		mCircleView.setScaleY(f);
	//    4    8:aload_0         
	//    5    9:getfield        #281 <Field CircleImageView mCircleView>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #407 <Method void CircleImageView.setScaleY(float)>
	//    8   16:return          
	}

	public transient void setColorScheme(int ai[])
	{
		setColorSchemeResources(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #700 <Method void setColorSchemeResources(int[])>
	//    3    5:return          
	}

	public transient void setColorSchemeColors(int ai[])
	{
		ensureTarget();
	//    0    0:aload_0         
	//    1    1:invokespecial   #461 <Method void ensureTarget()>
		mProgress.setColorSchemeColors(ai);
	//    2    4:aload_0         
	//    3    5:getfield        #313 <Field CircularProgressDrawable mProgress>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #705 <Method void CircularProgressDrawable.setColorSchemeColors(int[])>
	//    6   12:return          
	}

	public transient void setColorSchemeResources(int ai[])
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #304 <Method Context getContext()>
	//    2    4:astore_3        
		int ai1[] = new int[ai.length];
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:newarray        int[]
	//    6    9:astore          4
		for(int i = 0; i < ai.length; i++)
	//*   7   11:iconst_0        
	//*   8   12:istore_2        
	//*   9   13:iload_2         
	//*  10   14:aload_1         
	//*  11   15:arraylength     
	//*  12   16:icmpge          37
			ai1[i] = ContextCompat.getColor(context, ai[i]);
	//   13   19:aload           4
	//   14   21:iload_2         
	//   15   22:aload_3         
	//   16   23:aload_1         
	//   17   24:iload_2         
	//   18   25:iaload          
	//   19   26:invokestatic    #711 <Method int ContextCompat.getColor(Context, int)>
	//   20   29:iastore         

	//   21   30:iload_2         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_2        
	//*  25   34:goto            13
		setColorSchemeColors(ai1);
	//   26   37:aload_0         
	//   27   38:aload           4
	//   28   40:invokevirtual   #712 <Method void setColorSchemeColors(int[])>
	//   29   43:return          
	}

	public void setDistanceToTriggerSync(int i)
	{
		mTotalDragDistance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:putfield        #142 <Field float mTotalDragDistance>
	//    4    6:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #714 <Method void ViewGroup.setEnabled(boolean)>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #555 <Method void reset()>
	//    7   13:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mNestedScrollingChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #715 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnChildScrollUpCallback(OnChildScrollUpCallback onchildscrollupcallback)
	{
		mChildScrollUpCallback = onchildscrollupcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #500 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//    3    5:return          
	}

	public void setOnRefreshListener(OnRefreshListener onrefreshlistener)
	{
		mListener = onrefreshlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #721 <Field SwipeRefreshLayout$OnRefreshListener mListener>
	//    3    5:return          
	}

	public void setProgressBackgroundColor(int i)
	{
		setProgressBackgroundColorSchemeResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #725 <Method void setProgressBackgroundColorSchemeResource(int)>
	//    3    5:return          
	}

	public void setProgressBackgroundColorSchemeColor(int i)
	{
		mCircleView.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field CircleImageView mCircleView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #729 <Method void CircleImageView.setBackgroundColor(int)>
	//    4    8:return          
	}

	public void setProgressBackgroundColorSchemeResource(int i)
	{
		setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #304 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #711 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #731 <Method void setProgressBackgroundColorSchemeColor(int)>
	//    6   12:return          
	}

	public void setProgressViewEndTarget(boolean flag, int i)
	{
		mSpinnerOffsetEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #218 <Field int mSpinnerOffsetEnd>
		mScale = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #297 <Field boolean mScale>
		mCircleView.invalidate();
	//    6   10:aload_0         
	//    7   11:getfield        #281 <Field CircleImageView mCircleView>
	//    8   14:invokevirtual   #736 <Method void CircleImageView.invalidate()>
	//    9   17:return          
	}

	public void setProgressViewOffset(boolean flag, int i, int j)
	{
		mScale = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #297 <Field boolean mScale>
		mOriginalOffsetTop = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #239 <Field int mOriginalOffsetTop>
		mSpinnerOffsetEnd = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #218 <Field int mSpinnerOffsetEnd>
		mUsingCustomStart = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #390 <Field boolean mUsingCustomStart>
		reset();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #555 <Method void reset()>
		mRefreshing = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #139 <Field boolean mRefreshing>
	//   17   29:return          
	}

	public void setRefreshing(boolean flag)
	{
		if(flag && mRefreshing != flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            66
	//*   2    4:aload_0         
	//*   3    5:getfield        #139 <Field boolean mRefreshing>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          66
		{
			mRefreshing = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #139 <Field boolean mRefreshing>
			int i;
			if(!mUsingCustomStart)
	//*   9   17:aload_0         
	//*  10   18:getfield        #390 <Field boolean mUsingCustomStart>
	//*  11   21:ifne            37
				i = mSpinnerOffsetEnd + mOriginalOffsetTop;
	//   12   24:aload_0         
	//   13   25:getfield        #218 <Field int mSpinnerOffsetEnd>
	//   14   28:aload_0         
	//   15   29:getfield        #239 <Field int mOriginalOffsetTop>
	//   16   32:iadd            
	//   17   33:istore_2        
			else
	//*  18   34:goto            42
				i = mSpinnerOffsetEnd;
	//   19   37:aload_0         
	//   20   38:getfield        #218 <Field int mSpinnerOffsetEnd>
	//   21   41:istore_2        
			setTargetOffsetTopAndBottom(i - mCurrentTargetOffsetTop);
	//   22   42:aload_0         
	//   23   43:iload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #237 <Field int mCurrentTargetOffsetTop>
	//   26   48:isub            
	//   27   49:invokevirtual   #436 <Method void setTargetOffsetTopAndBottom(int)>
			mNotify = false;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #459 <Field boolean mNotify>
			startScaleUpAnimation(mRefreshListener);
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #155 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   34   62:invokespecial   #740 <Method void startScaleUpAnimation(android.view.animation.Animation$AnimationListener)>
			return;
	//   35   65:return          
		} else
		{
			setRefreshing(flag, false);
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:iconst_0        
	//   39   69:invokespecial   #348 <Method void setRefreshing(boolean, boolean)>
			return;
	//   40   72:return          
		}
	}

	public void setSize(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            10
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          10
			return;
	//    5    9:return          
		DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #177 <Method Resources getResources()>
	//    8   14:invokevirtual   #201 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    9   17:astore_2        
		if(i == 0)
	//*  10   18:iload_1         
	//*  11   19:ifne            38
			mCircleDiameter = (int)(displaymetrics.density * 56F);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:getfield        #206 <Field float DisplayMetrics.density>
	//   15   27:ldc2            #742 <Float 56F>
	//   16   30:fmul            
	//   17   31:f2i             
	//   18   32:putfield        #209 <Field int mCircleDiameter>
		else
	//*  19   35:goto            50
			mCircleDiameter = (int)(displaymetrics.density * 40F);
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:getfield        #206 <Field float DisplayMetrics.density>
	//   23   43:ldc1            #207 <Float 40F>
	//   24   45:fmul            
	//   25   46:f2i             
	//   26   47:putfield        #209 <Field int mCircleDiameter>
		mCircleView.setImageDrawable(((Drawable) (null)));
	//   27   50:aload_0         
	//   28   51:getfield        #281 <Field CircleImageView mCircleView>
	//   29   54:aconst_null     
	//   30   55:invokevirtual   #321 <Method void CircleImageView.setImageDrawable(Drawable)>
		mProgress.setStyle(i);
	//   31   58:aload_0         
	//   32   59:getfield        #313 <Field CircularProgressDrawable mProgress>
	//   33   62:iload_1         
	//   34   63:invokevirtual   #317 <Method void CircularProgressDrawable.setStyle(int)>
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//   35   66:aload_0         
	//   36   67:getfield        #281 <Field CircleImageView mCircleView>
	//   37   70:aload_0         
	//   38   71:getfield        #313 <Field CircularProgressDrawable mProgress>
	//   39   74:invokevirtual   #321 <Method void CircleImageView.setImageDrawable(Drawable)>
	//   40   77:return          
	}

	public void setSlingshotDistance(int i)
	{
		mCustomSlingshotDistance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #388 <Field int mCustomSlingshotDistance>
	//    3    5:return          
	}

	void setTargetOffsetTopAndBottom(int i)
	{
		mCircleView.bringToFront();
	//    0    0:aload_0         
	//    1    1:getfield        #281 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #747 <Method void CircleImageView.bringToFront()>
		ViewCompat.offsetTopAndBottom(((View) (mCircleView)), i);
	//    3    7:aload_0         
	//    4    8:getfield        #281 <Field CircleImageView mCircleView>
	//    5   11:iload_1         
	//    6   12:invokestatic    #751 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #281 <Field CircleImageView mCircleView>
	//   10   20:invokevirtual   #551 <Method int CircleImageView.getTop()>
	//   11   23:putfield        #237 <Field int mCurrentTargetOffsetTop>
	//   12   26:return          
	}

	public boolean startNestedScroll(int i)
	{
		return mNestedScrollingChildHelper.startNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #752 <Method boolean NestedScrollingChildHelper.startNestedScroll(int)>
	//    4    8:ireturn         
	}

	void startScaleDownAnimation(android.view.animation.Animation.AnimationListener animationlistener)
	{
		mScaleDownAnimation = ((Animation) (new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				setAnimationProgress(1.0F - f);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SwipeRefreshLayout this$0>
			//    2    4:fconst_1        
			//    3    5:fload_1         
			//    4    6:fsub            
			//    5    7:invokevirtual   #25  <Method void SwipeRefreshLayout.setAnimationProgress(float)>
			//    6   10:return          
			}

			final SwipeRefreshLayout this$0;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SwipeRefreshLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Animation()>
			//    5    9:return          
			}
		}
));
	//    0    0:aload_0         
	//    1    1:new             #14  <Class SwipeRefreshLayout$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #753 <Method void SwipeRefreshLayout$3(SwipeRefreshLayout)>
	//    5    9:putfield        #755 <Field Animation mScaleDownAnimation>
		mScaleDownAnimation.setDuration(150L);
	//    6   12:aload_0         
	//    7   13:getfield        #755 <Field Animation mScaleDownAnimation>
	//    8   16:ldc2w           #492 <Long 150L>
	//    9   19:invokevirtual   #275 <Method void Animation.setDuration(long)>
		mCircleView.setAnimationListener(animationlistener);
	//   10   22:aload_0         
	//   11   23:getfield        #281 <Field CircleImageView mCircleView>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #287 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   14   30:aload_0         
	//   15   31:getfield        #281 <Field CircleImageView mCircleView>
	//   16   34:invokevirtual   #290 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleDownAnimation);
	//   17   37:aload_0         
	//   18   38:getfield        #281 <Field CircleImageView mCircleView>
	//   19   41:aload_0         
	//   20   42:getfield        #755 <Field Animation mScaleDownAnimation>
	//   21   45:invokevirtual   #294 <Method void CircleImageView.startAnimation(Animation)>
	//   22   48:return          
	}

	public void stopNestedScroll()
	{
		mNestedScrollingChildHelper.stopNestedScroll();
	//    0    0:aload_0         
	//    1    1:getfield        #232 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #756 <Method void NestedScrollingChildHelper.stopNestedScroll()>
	//    3    7:return          
	}

	private static final int ALPHA_ANIMATION_DURATION = 300;
	private static final int ANIMATE_TO_START_DURATION = 200;
	private static final int ANIMATE_TO_TRIGGER_DURATION = 200;
	private static final int CIRCLE_BG_LIGHT = 0xfffafafa;
	static final int CIRCLE_DIAMETER = 40;
	static final int CIRCLE_DIAMETER_LARGE = 56;
	private static final float DECELERATE_INTERPOLATION_FACTOR = 2F;
	public static final int DEFAULT = 1;
	private static final int DEFAULT_CIRCLE_TARGET = 64;
	public static final int DEFAULT_SLINGSHOT_DISTANCE = -1;
	private static final float DRAG_RATE = 0.5F;
	private static final int INVALID_POINTER = -1;
	public static final int LARGE = 0;
	private static final int LAYOUT_ATTRS[] = {
		0x101000e
	};
	private static final String LOG_TAG = "SwipeRefreshLayout";
	private static final int MAX_ALPHA = 255;
	private static final float MAX_PROGRESS_ANGLE = 0.8F;
	private static final int SCALE_DOWN_DURATION = 150;
	private static final int STARTING_PROGRESS_ALPHA = 76;
	private int mActivePointerId;
	private Animation mAlphaMaxAnimation;
	private Animation mAlphaStartAnimation;
	private final Animation mAnimateToCorrectPosition;
	private final Animation mAnimateToStartPosition;
	private OnChildScrollUpCallback mChildScrollUpCallback;
	private int mCircleDiameter;
	CircleImageView mCircleView;
	private int mCircleViewIndex;
	int mCurrentTargetOffsetTop;
	int mCustomSlingshotDistance;
	private final DecelerateInterpolator mDecelerateInterpolator;
	protected int mFrom;
	private float mInitialDownY;
	private float mInitialMotionY;
	private boolean mIsBeingDragged;
	OnRefreshListener mListener;
	private int mMediumAnimationDuration;
	private boolean mNestedScrollInProgress;
	private final NestedScrollingChildHelper mNestedScrollingChildHelper;
	private final NestedScrollingParentHelper mNestedScrollingParentHelper;
	boolean mNotify;
	protected int mOriginalOffsetTop;
	private final int mParentOffsetInWindow[];
	private final int mParentScrollConsumed[];
	CircularProgressDrawable mProgress;
	private android.view.animation.Animation.AnimationListener mRefreshListener = new android.view.animation.Animation.AnimationListener() {

		public void onAnimationEnd(Animation animation)
		{
			if(mRefreshing)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SwipeRefreshLayout this$0>
		//*   2    4:getfield        #24  <Field boolean SwipeRefreshLayout.mRefreshing>
		//*   3    7:ifeq            82
			{
				mProgress.setAlpha(255);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field SwipeRefreshLayout this$0>
		//    6   14:getfield        #28  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
		//    7   17:sipush          255
		//    8   20:invokevirtual   #34  <Method void CircularProgressDrawable.setAlpha(int)>
				mProgress.start();
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   11   27:getfield        #28  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
		//   12   30:invokevirtual   #37  <Method void CircularProgressDrawable.start()>
				if(mNotify && mListener != null)
		//*  13   33:aload_0         
		//*  14   34:getfield        #14  <Field SwipeRefreshLayout this$0>
		//*  15   37:getfield        #40  <Field boolean SwipeRefreshLayout.mNotify>
		//*  16   40:ifeq            65
		//*  17   43:aload_0         
		//*  18   44:getfield        #14  <Field SwipeRefreshLayout this$0>
		//*  19   47:getfield        #44  <Field SwipeRefreshLayout$OnRefreshListener SwipeRefreshLayout.mListener>
		//*  20   50:ifnull          65
					mListener.onRefresh();
		//   21   53:aload_0         
		//   22   54:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   23   57:getfield        #44  <Field SwipeRefreshLayout$OnRefreshListener SwipeRefreshLayout.mListener>
		//   24   60:invokeinterface #49  <Method void SwipeRefreshLayout$OnRefreshListener.onRefresh()>
				animation = ((Animation) (SwipeRefreshLayout.this));
		//   25   65:aload_0         
		//   26   66:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   27   69:astore_1        
				animation.mCurrentTargetOffsetTop = ((SwipeRefreshLayout) (animation)).mCircleView.getTop();
		//   28   70:aload_1         
		//   29   71:aload_1         
		//   30   72:getfield        #53  <Field CircleImageView SwipeRefreshLayout.mCircleView>
		//   31   75:invokevirtual   #59  <Method int CircleImageView.getTop()>
		//   32   78:putfield        #63  <Field int SwipeRefreshLayout.mCurrentTargetOffsetTop>
				return;
		//   33   81:return          
			} else
			{
				reset();
		//   34   82:aload_0         
		//   35   83:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   36   86:invokevirtual   #66  <Method void SwipeRefreshLayout.reset()>
				return;
		//   37   89:return          
			}
		}

		public void onAnimationRepeat(Animation animation)
		{
		//    0    0:return          
		}

		public void onAnimationStart(Animation animation)
		{
		//    0    0:return          
		}

		final SwipeRefreshLayout this$0;

			
			{
				this$0 = SwipeRefreshLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SwipeRefreshLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	boolean mRefreshing;
	private boolean mReturningToStart;
	boolean mScale;
	private Animation mScaleAnimation;
	private Animation mScaleDownAnimation;
	private Animation mScaleDownToStartAnimation;
	int mSpinnerOffsetEnd;
	float mStartingScale;
	private View mTarget;
	private float mTotalDragDistance;
	private float mTotalUnconsumed;
	private int mTouchSlop;
	boolean mUsingCustomStart;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #125 <Int 0x101000e>
	//    5    7:iastore         
	//    6    8:putstatic       #127 <Field int[] LAYOUT_ATTRS>
	//*   7   11:return          
	}
}
