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
	implements NestedScrollingParent, NestedScrollingChild
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
	//    3    3:invokespecial   #132 <Method void SwipeRefreshLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwipeRefreshLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #135 <Method void ViewGroup(Context, AttributeSet)>
		mRefreshing = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #137 <Field boolean mRefreshing>
		mTotalDragDistance = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #138 <Float -1F>
	//    9   14:putfield        #140 <Field float mTotalDragDistance>
		mParentScrollConsumed = new int[2];
	//   10   17:aload_0         
	//   11   18:iconst_2        
	//   12   19:newarray        int[]
	//   13   21:putfield        #142 <Field int[] mParentScrollConsumed>
		mParentOffsetInWindow = new int[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:newarray        int[]
	//   17   28:putfield        #144 <Field int[] mParentOffsetInWindow>
		mActivePointerId = -1;
	//   18   31:aload_0         
	//   19   32:iconst_m1       
	//   20   33:putfield        #146 <Field int mActivePointerId>
		mCircleViewIndex = -1;
	//   21   36:aload_0         
	//   22   37:iconst_m1       
	//   23   38:putfield        #148 <Field int mCircleViewIndex>
	//   24   41:aload_0         
	//   25   42:new             #10  <Class SwipeRefreshLayout$1>
	//   26   45:dup             
	//   27   46:aload_0         
	//   28   47:invokespecial   #151 <Method void SwipeRefreshLayout$1(SwipeRefreshLayout)>
	//   29   50:putfield        #153 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
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
	//   34   59:invokespecial   #154 <Method void SwipeRefreshLayout$6(SwipeRefreshLayout)>
	//   35   62:putfield        #156 <Field Animation mAnimateToCorrectPosition>
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
	//   40   71:invokespecial   #157 <Method void SwipeRefreshLayout$7(SwipeRefreshLayout)>
	//   41   74:putfield        #159 <Field Animation mAnimateToStartPosition>
		mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:invokestatic    #165 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   45   82:invokevirtual   #169 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   46   85:putfield        #171 <Field int mTouchSlop>
		mMediumAnimationDuration = getResources().getInteger(0x10e0001);
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:invokevirtual   #175 <Method Resources getResources()>
	//   50   93:ldc1            #176 <Int 0x10e0001>
	//   51   95:invokevirtual   #182 <Method int Resources.getInteger(int)>
	//   52   98:putfield        #184 <Field int mMediumAnimationDuration>
		setWillNotDraw(false);
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:invokevirtual   #188 <Method void setWillNotDraw(boolean)>
		mDecelerateInterpolator = new DecelerateInterpolator(2.0F);
	//   56  106:aload_0         
	//   57  107:new             #190 <Class DecelerateInterpolator>
	//   58  110:dup             
	//   59  111:fconst_2        
	//   60  112:invokespecial   #193 <Method void DecelerateInterpolator(float)>
	//   61  115:putfield        #195 <Field DecelerateInterpolator mDecelerateInterpolator>
		DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//   62  118:aload_0         
	//   63  119:invokevirtual   #175 <Method Resources getResources()>
	//   64  122:invokevirtual   #199 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   65  125:astore          4
		mCircleDiameter = (int)(40F * displaymetrics.density);
	//   66  127:aload_0         
	//   67  128:ldc1            #200 <Float 40F>
	//   68  130:aload           4
	//   69  132:getfield        #205 <Field float DisplayMetrics.density>
	//   70  135:fmul            
	//   71  136:f2i             
	//   72  137:putfield        #207 <Field int mCircleDiameter>
		createProgressView();
	//   73  140:aload_0         
	//   74  141:invokespecial   #210 <Method void createProgressView()>
		setChildrenDrawingOrderEnabled(true);
	//   75  144:aload_0         
	//   76  145:iconst_1        
	//   77  146:invokevirtual   #213 <Method void setChildrenDrawingOrderEnabled(boolean)>
		mSpinnerOffsetEnd = (int)(64F * displaymetrics.density);
	//   78  149:aload_0         
	//   79  150:ldc1            #214 <Float 64F>
	//   80  152:aload           4
	//   81  154:getfield        #205 <Field float DisplayMetrics.density>
	//   82  157:fmul            
	//   83  158:f2i             
	//   84  159:putfield        #216 <Field int mSpinnerOffsetEnd>
		mTotalDragDistance = mSpinnerOffsetEnd;
	//   85  162:aload_0         
	//   86  163:aload_0         
	//   87  164:getfield        #216 <Field int mSpinnerOffsetEnd>
	//   88  167:i2f             
	//   89  168:putfield        #140 <Field float mTotalDragDistance>
		mNestedScrollingParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   90  171:aload_0         
	//   91  172:new             #218 <Class NestedScrollingParentHelper>
	//   92  175:dup             
	//   93  176:aload_0         
	//   94  177:invokespecial   #221 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   95  180:putfield        #223 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
		mNestedScrollingChildHelper = new NestedScrollingChildHelper(((View) (this)));
	//   96  183:aload_0         
	//   97  184:new             #225 <Class NestedScrollingChildHelper>
	//   98  187:dup             
	//   99  188:aload_0         
	//  100  189:invokespecial   #228 <Method void NestedScrollingChildHelper(View)>
	//  101  192:putfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
		setNestedScrollingEnabled(true);
	//  102  195:aload_0         
	//  103  196:iconst_1        
	//  104  197:invokevirtual   #233 <Method void setNestedScrollingEnabled(boolean)>
		int i = -mCircleDiameter;
	//  105  200:aload_0         
	//  106  201:getfield        #207 <Field int mCircleDiameter>
	//  107  204:ineg            
	//  108  205:istore_3        
		mCurrentTargetOffsetTop = i;
	//  109  206:aload_0         
	//  110  207:iload_3         
	//  111  208:putfield        #235 <Field int mCurrentTargetOffsetTop>
		mOriginalOffsetTop = i;
	//  112  211:aload_0         
	//  113  212:iload_3         
	//  114  213:putfield        #237 <Field int mOriginalOffsetTop>
		moveToStart(1.0F);
	//  115  216:aload_0         
	//  116  217:fconst_1        
	//  117  218:invokevirtual   #240 <Method void moveToStart(float)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, LAYOUT_ATTRS)));
	//  118  221:aload_1         
	//  119  222:aload_2         
	//  120  223:getstatic       #125 <Field int[] LAYOUT_ATTRS>
	//  121  226:invokevirtual   #246 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//  122  229:astore_1        
		setEnabled(((TypedArray) (context)).getBoolean(0, true));
	//  123  230:aload_0         
	//  124  231:aload_1         
	//  125  232:iconst_0        
	//  126  233:iconst_1        
	//  127  234:invokevirtual   #252 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  128  237:invokevirtual   #255 <Method void setEnabled(boolean)>
		((TypedArray) (context)).recycle();
	//  129  240:aload_1         
	//  130  241:invokevirtual   #258 <Method void TypedArray.recycle()>
	//  131  244:return          
	}

	private void animateOffsetToCorrectPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		mFrom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #262 <Field int mFrom>
		mAnimateToCorrectPosition.reset();
	//    3    5:aload_0         
	//    4    6:getfield        #156 <Field Animation mAnimateToCorrectPosition>
	//    5    9:invokevirtual   #267 <Method void Animation.reset()>
		mAnimateToCorrectPosition.setDuration(200L);
	//    6   12:aload_0         
	//    7   13:getfield        #156 <Field Animation mAnimateToCorrectPosition>
	//    8   16:ldc2w           #268 <Long 200L>
	//    9   19:invokevirtual   #273 <Method void Animation.setDuration(long)>
		mAnimateToCorrectPosition.setInterpolator(((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   10   22:aload_0         
	//   11   23:getfield        #156 <Field Animation mAnimateToCorrectPosition>
	//   12   26:aload_0         
	//   13   27:getfield        #195 <Field DecelerateInterpolator mDecelerateInterpolator>
	//   14   30:invokevirtual   #277 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  15   33:aload_2         
	//*  16   34:ifnull          45
			mCircleView.setAnimationListener(animationlistener);
	//   17   37:aload_0         
	//   18   38:getfield        #279 <Field CircleImageView mCircleView>
	//   19   41:aload_2         
	//   20   42:invokevirtual   #285 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   21   45:aload_0         
	//   22   46:getfield        #279 <Field CircleImageView mCircleView>
	//   23   49:invokevirtual   #288 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mAnimateToCorrectPosition);
	//   24   52:aload_0         
	//   25   53:getfield        #279 <Field CircleImageView mCircleView>
	//   26   56:aload_0         
	//   27   57:getfield        #156 <Field Animation mAnimateToCorrectPosition>
	//   28   60:invokevirtual   #292 <Method void CircleImageView.startAnimation(Animation)>
	//   29   63:return          
	}

	private void animateOffsetToStartPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		if(mScale)
	//*   0    0:aload_0         
	//*   1    1:getfield        #295 <Field boolean mScale>
	//*   2    4:ifeq            14
		{
			startScaleDownReturnToStartAnimation(i, animationlistener);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #298 <Method void startScaleDownReturnToStartAnimation(int, android.view.animation.Animation$AnimationListener)>
			return;
	//    7   13:return          
		}
		mFrom = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #262 <Field int mFrom>
		mAnimateToStartPosition.reset();
	//   11   19:aload_0         
	//   12   20:getfield        #159 <Field Animation mAnimateToStartPosition>
	//   13   23:invokevirtual   #267 <Method void Animation.reset()>
		mAnimateToStartPosition.setDuration(200L);
	//   14   26:aload_0         
	//   15   27:getfield        #159 <Field Animation mAnimateToStartPosition>
	//   16   30:ldc2w           #268 <Long 200L>
	//   17   33:invokevirtual   #273 <Method void Animation.setDuration(long)>
		mAnimateToStartPosition.setInterpolator(((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   18   36:aload_0         
	//   19   37:getfield        #159 <Field Animation mAnimateToStartPosition>
	//   20   40:aload_0         
	//   21   41:getfield        #195 <Field DecelerateInterpolator mDecelerateInterpolator>
	//   22   44:invokevirtual   #277 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          59
			mCircleView.setAnimationListener(animationlistener);
	//   25   51:aload_0         
	//   26   52:getfield        #279 <Field CircleImageView mCircleView>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #285 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   29   59:aload_0         
	//   30   60:getfield        #279 <Field CircleImageView mCircleView>
	//   31   63:invokevirtual   #288 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mAnimateToStartPosition);
	//   32   66:aload_0         
	//   33   67:getfield        #279 <Field CircleImageView mCircleView>
	//   34   70:aload_0         
	//   35   71:getfield        #159 <Field Animation mAnimateToStartPosition>
	//   36   74:invokevirtual   #292 <Method void CircleImageView.startAnimation(Animation)>
	//   37   77:return          
	}

	private void createProgressView()
	{
		mCircleView = new CircleImageView(getContext(), 0xfffafafa);
	//    0    0:aload_0         
	//    1    1:new             #281 <Class CircleImageView>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #302 <Method Context getContext()>
	//    5    9:ldc1            #38  <Int 0xfffafafa>
	//    6   11:invokespecial   #305 <Method void CircleImageView(Context, int)>
	//    7   14:putfield        #279 <Field CircleImageView mCircleView>
		mProgress = new CircularProgressDrawable(getContext());
	//    8   17:aload_0         
	//    9   18:new             #307 <Class CircularProgressDrawable>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokevirtual   #302 <Method Context getContext()>
	//   13   26:invokespecial   #309 <Method void CircularProgressDrawable(Context)>
	//   14   29:putfield        #311 <Field CircularProgressDrawable mProgress>
		mProgress.setStyle(1);
	//   15   32:aload_0         
	//   16   33:getfield        #311 <Field CircularProgressDrawable mProgress>
	//   17   36:iconst_1        
	//   18   37:invokevirtual   #315 <Method void CircularProgressDrawable.setStyle(int)>
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//   19   40:aload_0         
	//   20   41:getfield        #279 <Field CircleImageView mCircleView>
	//   21   44:aload_0         
	//   22   45:getfield        #311 <Field CircularProgressDrawable mProgress>
	//   23   48:invokevirtual   #319 <Method void CircleImageView.setImageDrawable(Drawable)>
		mCircleView.setVisibility(8);
	//   24   51:aload_0         
	//   25   52:getfield        #279 <Field CircleImageView mCircleView>
	//   26   55:bipush          8
	//   27   57:invokevirtual   #322 <Method void CircleImageView.setVisibility(int)>
		addView(((View) (mCircleView)));
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #279 <Field CircleImageView mCircleView>
	//   31   65:invokevirtual   #325 <Method void addView(View)>
	//   32   68:return          
	}

	private void ensureTarget()
	{
		if(mTarget == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field View mTarget>
	//*   2    4:ifnonnull       47
		{
			for(int i = 0; i < getChildCount(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #331 <Method int getChildCount()>
	//*   8   14:icmpge          47
			{
				View view = getChildAt(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #335 <Method View getChildAt(int)>
	//   12   22:astore_2        
				if(!((Object) (view)).equals(((Object) (mCircleView))))
	//*  13   23:aload_2         
	//*  14   24:aload_0         
	//*  15   25:getfield        #279 <Field CircleImageView mCircleView>
	//*  16   28:invokevirtual   #341 <Method boolean Object.equals(Object)>
	//*  17   31:ifne            40
				{
					mTarget = view;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #328 <Field View mTarget>
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
	//*   2    2:getfield        #140 <Field float mTotalDragDistance>
	//*   3    5:fcmpl           
	//*   4    6:ifle            16
		{
			setRefreshing(true, true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:iconst_1        
	//    8   12:invokespecial   #346 <Method void setRefreshing(boolean, boolean)>
			return;
	//    9   15:return          
		}
		mRefreshing = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #137 <Field boolean mRefreshing>
		mProgress.setStartEndTrim(0.0F, 0.0F);
	//   13   21:aload_0         
	//   14   22:getfield        #311 <Field CircularProgressDrawable mProgress>
	//   15   25:fconst_0        
	//   16   26:fconst_0        
	//   17   27:invokevirtual   #350 <Method void CircularProgressDrawable.setStartEndTrim(float, float)>
		android.view.animation.Animation.AnimationListener animationlistener = null;
	//   18   30:aconst_null     
	//   19   31:astore_2        
		if(!mScale)
	//*  20   32:aload_0         
	//*  21   33:getfield        #295 <Field boolean mScale>
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
	//   26   44:invokespecial   #351 <Method void SwipeRefreshLayout$5(SwipeRefreshLayout)>
	//   27   47:astore_2        
		animateOffsetToStartPosition(mCurrentTargetOffsetTop, animationlistener);
	//   28   48:aload_0         
	//   29   49:aload_0         
	//   30   50:getfield        #235 <Field int mCurrentTargetOffsetTop>
	//   31   53:aload_2         
	//   32   54:invokespecial   #353 <Method void animateOffsetToStartPosition(int, android.view.animation.Animation$AnimationListener)>
		mProgress.setArrowEnabled(false);
	//   33   57:aload_0         
	//   34   58:getfield        #311 <Field CircularProgressDrawable mProgress>
	//   35   61:iconst_0        
	//   36   62:invokevirtual   #356 <Method void CircularProgressDrawable.setArrowEnabled(boolean)>
	//   37   65:return          
	}

	private boolean isAnimationRunning(Animation animation)
	{
		return animation != null && animation.hasStarted() && !animation.hasEnded();
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokevirtual   #362 <Method boolean Animation.hasStarted()>
	//    4    8:ifeq            20
	//    5   11:aload_1         
	//    6   12:invokevirtual   #365 <Method boolean Animation.hasEnded()>
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
	//    1    1:getfield        #311 <Field CircularProgressDrawable mProgress>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #356 <Method void CircularProgressDrawable.setArrowEnabled(boolean)>
		float f1 = Math.min(1.0F, Math.abs(f / mTotalDragDistance));
	//    4    8:fconst_1        
	//    5    9:fload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #140 <Field float mTotalDragDistance>
	//    8   14:fdiv            
	//    9   15:invokestatic    #372 <Method float Math.abs(float)>
	//   10   18:invokestatic    #376 <Method float Math.min(float, float)>
	//   11   21:fstore          4
		float f2 = ((float)Math.max((double)f1 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
	//   12   23:fload           4
	//   13   25:f2d             
	//   14   26:ldc2w           #377 <Double 0.40000000000000002D>
	//   15   29:dsub            
	//   16   30:dconst_0        
	//   17   31:invokestatic    #382 <Method double Math.max(double, double)>
	//   18   34:d2f             
	//   19   35:ldc2            #383 <Float 5F>
	//   20   38:fmul            
	//   21   39:ldc2            #384 <Float 3F>
	//   22   42:fdiv            
	//   23   43:fstore          5
		float f4 = Math.abs(f);
	//   24   45:fload_1         
	//   25   46:invokestatic    #372 <Method float Math.abs(float)>
	//   26   49:fstore          7
		float f5 = mTotalDragDistance;
	//   27   51:aload_0         
	//   28   52:getfield        #140 <Field float mTotalDragDistance>
	//   29   55:fstore          8
		float f3;
		int i;
		if(mUsingCustomStart)
	//*  30   57:aload_0         
	//*  31   58:getfield        #386 <Field boolean mUsingCustomStart>
	//*  32   61:ifeq            83
			i = mSpinnerOffsetEnd - mOriginalOffsetTop;
	//   33   64:aload_0         
	//   34   65:getfield        #216 <Field int mSpinnerOffsetEnd>
	//   35   68:aload_0         
	//   36   69:getfield        #237 <Field int mOriginalOffsetTop>
	//   37   72:isub            
	//   38   73:istore          9
		else
	//*  39   75:iload           9
	//*  40   77:i2f             
	//*  41   78:fstore          6
	//*  42   80:goto            92
			i = mSpinnerOffsetEnd;
	//   43   83:aload_0         
	//   44   84:getfield        #216 <Field int mSpinnerOffsetEnd>
	//   45   87:istore          9
		f3 = i;
	//*  46   89:goto            75
		double d = Math.max(0.0F, Math.min(f4 - f5, f3 * 2.0F) / f3) / 4F;
	//   47   92:fconst_0        
	//   48   93:fload           7
	//   49   95:fload           8
	//   50   97:fsub            
	//   51   98:fload           6
	//   52  100:fconst_2        
	//   53  101:fmul            
	//   54  102:invokestatic    #376 <Method float Math.min(float, float)>
	//   55  105:fload           6
	//   56  107:fdiv            
	//   57  108:invokestatic    #388 <Method float Math.max(float, float)>
	//   58  111:ldc2            #389 <Float 4F>
	//   59  114:fdiv            
	//   60  115:f2d             
	//   61  116:dstore_2        
		f4 = (float)(d - Math.pow(d, 2D)) * 2.0F;
	//   62  117:dload_2         
	//   63  118:dload_2         
	//   64  119:ldc2w           #390 <Double 2D>
	//   65  122:invokestatic    #394 <Method double Math.pow(double, double)>
	//   66  125:dsub            
	//   67  126:d2f             
	//   68  127:fconst_2        
	//   69  128:fmul            
	//   70  129:fstore          7
		i = mOriginalOffsetTop;
	//   71  131:aload_0         
	//   72  132:getfield        #237 <Field int mOriginalOffsetTop>
	//   73  135:istore          9
		int j = (int)(f3 * f1 + f3 * f4 * 2.0F);
	//   74  137:fload           6
	//   75  139:fload           4
	//   76  141:fmul            
	//   77  142:fload           6
	//   78  144:fload           7
	//   79  146:fmul            
	//   80  147:fconst_2        
	//   81  148:fmul            
	//   82  149:fadd            
	//   83  150:f2i             
	//   84  151:istore          10
		if(mCircleView.getVisibility() != 0)
	//*  85  153:aload_0         
	//*  86  154:getfield        #279 <Field CircleImageView mCircleView>
	//*  87  157:invokevirtual   #397 <Method int CircleImageView.getVisibility()>
	//*  88  160:ifeq            171
			mCircleView.setVisibility(0);
	//   89  163:aload_0         
	//   90  164:getfield        #279 <Field CircleImageView mCircleView>
	//   91  167:iconst_0        
	//   92  168:invokevirtual   #322 <Method void CircleImageView.setVisibility(int)>
		if(!mScale)
	//*  93  171:aload_0         
	//*  94  172:getfield        #295 <Field boolean mScale>
	//*  95  175:ifne            194
		{
			mCircleView.setScaleX(1.0F);
	//   96  178:aload_0         
	//   97  179:getfield        #279 <Field CircleImageView mCircleView>
	//   98  182:fconst_1        
	//   99  183:invokevirtual   #400 <Method void CircleImageView.setScaleX(float)>
			mCircleView.setScaleY(1.0F);
	//  100  186:aload_0         
	//  101  187:getfield        #279 <Field CircleImageView mCircleView>
	//  102  190:fconst_1        
	//  103  191:invokevirtual   #403 <Method void CircleImageView.setScaleY(float)>
		}
		if(mScale)
	//* 104  194:aload_0         
	//* 105  195:getfield        #295 <Field boolean mScale>
	//* 106  198:ifeq            215
			setAnimationProgress(Math.min(1.0F, f / mTotalDragDistance));
	//  107  201:aload_0         
	//  108  202:fconst_1        
	//  109  203:fload_1         
	//  110  204:aload_0         
	//  111  205:getfield        #140 <Field float mTotalDragDistance>
	//  112  208:fdiv            
	//  113  209:invokestatic    #376 <Method float Math.min(float, float)>
	//  114  212:invokevirtual   #406 <Method void setAnimationProgress(float)>
		if(f < mTotalDragDistance)
	//* 115  215:fload_1         
	//* 116  216:aload_0         
	//* 117  217:getfield        #140 <Field float mTotalDragDistance>
	//* 118  220:fcmpg           
	//* 119  221:ifge            254
		{
			if(mProgress.getAlpha() > 76 && !isAnimationRunning(mAlphaStartAnimation))
	//* 120  224:aload_0         
	//* 121  225:getfield        #311 <Field CircularProgressDrawable mProgress>
	//* 122  228:invokevirtual   #409 <Method int CircularProgressDrawable.getAlpha()>
	//* 123  231:bipush          76
	//* 124  233:icmple          282
	//* 125  236:aload_0         
	//* 126  237:aload_0         
	//* 127  238:getfield        #411 <Field Animation mAlphaStartAnimation>
	//* 128  241:invokespecial   #413 <Method boolean isAnimationRunning(Animation)>
	//* 129  244:ifne            282
				startProgressAlphaStartAnimation();
	//  130  247:aload_0         
	//  131  248:invokespecial   #416 <Method void startProgressAlphaStartAnimation()>
		} else
	//* 132  251:goto            282
		if(mProgress.getAlpha() < 255 && !isAnimationRunning(mAlphaMaxAnimation))
	//* 133  254:aload_0         
	//* 134  255:getfield        #311 <Field CircularProgressDrawable mProgress>
	//* 135  258:invokevirtual   #409 <Method int CircularProgressDrawable.getAlpha()>
	//* 136  261:sipush          255
	//* 137  264:icmpge          282
	//* 138  267:aload_0         
	//* 139  268:aload_0         
	//* 140  269:getfield        #418 <Field Animation mAlphaMaxAnimation>
	//* 141  272:invokespecial   #413 <Method boolean isAnimationRunning(Animation)>
	//* 142  275:ifne            282
			startProgressAlphaMaxAnimation();
	//  143  278:aload_0         
	//  144  279:invokespecial   #421 <Method void startProgressAlphaMaxAnimation()>
		mProgress.setStartEndTrim(0.0F, Math.min(0.8F, f2 * 0.8F));
	//  145  282:aload_0         
	//  146  283:getfield        #311 <Field CircularProgressDrawable mProgress>
	//  147  286:fconst_0        
	//  148  287:ldc1            #66  <Float 0.8F>
	//  149  289:fload           5
	//  150  291:ldc1            #66  <Float 0.8F>
	//  151  293:fmul            
	//  152  294:invokestatic    #376 <Method float Math.min(float, float)>
	//  153  297:invokevirtual   #350 <Method void CircularProgressDrawable.setStartEndTrim(float, float)>
		mProgress.setArrowScale(Math.min(1.0F, f2));
	//  154  300:aload_0         
	//  155  301:getfield        #311 <Field CircularProgressDrawable mProgress>
	//  156  304:fconst_1        
	//  157  305:fload           5
	//  158  307:invokestatic    #376 <Method float Math.min(float, float)>
	//  159  310:invokevirtual   #424 <Method void CircularProgressDrawable.setArrowScale(float)>
		mProgress.setProgressRotation((-0.25F + 0.4F * f2 + f4 * 2.0F) * 0.5F);
	//  160  313:aload_0         
	//  161  314:getfield        #311 <Field CircularProgressDrawable mProgress>
	//  162  317:ldc2            #425 <Float -0.25F>
	//  163  320:ldc2            #426 <Float 0.4F>
	//  164  323:fload           5
	//  165  325:fmul            
	//  166  326:fadd            
	//  167  327:fload           7
	//  168  329:fconst_2        
	//  169  330:fmul            
	//  170  331:fadd            
	//  171  332:ldc1            #52  <Float 0.5F>
	//  172  334:fmul            
	//  173  335:invokevirtual   #429 <Method void CircularProgressDrawable.setProgressRotation(float)>
		setTargetOffsetTopAndBottom((i + j) - mCurrentTargetOffsetTop);
	//  174  338:aload_0         
	//  175  339:iload           9
	//  176  341:iload           10
	//  177  343:iadd            
	//  178  344:aload_0         
	//  179  345:getfield        #235 <Field int mCurrentTargetOffsetTop>
	//  180  348:isub            
	//  181  349:invokevirtual   #432 <Method void setTargetOffsetTopAndBottom(int)>
	//  182  352:return          
	}

	private void onSecondaryPointerUp(MotionEvent motionevent)
	{
		int i = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #439 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #442 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #146 <Field int mActivePointerId>
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
	//   19   31:invokevirtual   #442 <Method int MotionEvent.getPointerId(int)>
	//   20   34:putfield        #146 <Field int mActivePointerId>
		}
	//   21   37:return          
	}

	private void setColorViewAlpha(int i)
	{
		mCircleView.getBackground().setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #447 <Method Drawable CircleImageView.getBackground()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #452 <Method void Drawable.setAlpha(int)>
		mProgress.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #311 <Field CircularProgressDrawable mProgress>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #453 <Method void CircularProgressDrawable.setAlpha(int)>
	//    9   19:return          
	}

	private void setRefreshing(boolean flag, boolean flag1)
	{
		if(mRefreshing != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field boolean mRefreshing>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			mNotify = flag1;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #455 <Field boolean mNotify>
			ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #457 <Method void ensureTarget()>
			mRefreshing = flag;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #137 <Field boolean mRefreshing>
			if(mRefreshing)
	//*  12   22:aload_0         
	//*  13   23:getfield        #137 <Field boolean mRefreshing>
	//*  14   26:ifeq            42
			{
				animateOffsetToCorrectPosition(mCurrentTargetOffsetTop, mRefreshListener);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #235 <Field int mCurrentTargetOffsetTop>
	//   18   34:aload_0         
	//   19   35:getfield        #153 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   20   38:invokespecial   #459 <Method void animateOffsetToCorrectPosition(int, android.view.animation.Animation$AnimationListener)>
				return;
	//   21   41:return          
			}
			startScaleDownAnimation(mRefreshListener);
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #153 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   25   47:invokevirtual   #462 <Method void startScaleDownAnimation(android.view.animation.Animation$AnimationListener)>
		}
	//   26   50:return          
	}

	private Animation startAlphaAnimation(final int startingAlpha, final int endingAlpha)
	{
		Animation animation = new Animation() {

			public void applyTransformation(float f, Transformation transformation)
			{
				mProgress.setAlpha((int)((float)startingAlpha + (float)(endingAlpha - startingAlpha) * f));
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field SwipeRefreshLayout this$0>
			//    2    4:getfield        #32  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
			//    3    7:aload_0         
			//    4    8:getfield        #20  <Field int val$startingAlpha>
			//    5   11:i2f             
			//    6   12:aload_0         
			//    7   13:getfield        #22  <Field int val$endingAlpha>
			//    8   16:aload_0         
			//    9   17:getfield        #20  <Field int val$startingAlpha>
			//   10   20:isub            
			//   11   21:i2f             
			//   12   22:fload_1         
			//   13   23:fmul            
			//   14   24:fadd            
			//   15   25:f2i             
			//   16   26:invokevirtual   #38  <Method void CircularProgressDrawable.setAlpha(int)>
			//   17   29:return          
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
	//    5    7:invokespecial   #467 <Method void SwipeRefreshLayout$4(SwipeRefreshLayout, int, int)>
	//    6   10:astore_3        
		((Animation) (animation)).setDuration(300L);
	//    7   11:aload_3         
	//    8   12:ldc2w           #468 <Long 300L>
	//    9   15:invokevirtual   #273 <Method void Animation.setDuration(long)>
		mCircleView.setAnimationListener(((android.view.animation.Animation.AnimationListener) (null)));
	//   10   18:aload_0         
	//   11   19:getfield        #279 <Field CircleImageView mCircleView>
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #285 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   14   26:aload_0         
	//   15   27:getfield        #279 <Field CircleImageView mCircleView>
	//   16   30:invokevirtual   #288 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(((Animation) (animation)));
	//   17   33:aload_0         
	//   18   34:getfield        #279 <Field CircleImageView mCircleView>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #292 <Method void CircleImageView.startAnimation(Animation)>
		return ((Animation) (animation));
	//   21   41:aload_3         
	//   22   42:areturn         
	}

	private void startDragging(float f)
	{
		if(f - mInitialDownY > (float)mTouchSlop && !mIsBeingDragged)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #472 <Field float mInitialDownY>
	//*   3    5:fsub            
	//*   4    6:aload_0         
	//*   5    7:getfield        #171 <Field int mTouchSlop>
	//*   6   10:i2f             
	//*   7   11:fcmpl           
	//*   8   12:ifle            50
	//*   9   15:aload_0         
	//*  10   16:getfield        #474 <Field boolean mIsBeingDragged>
	//*  11   19:ifne            50
		{
			mInitialMotionY = mInitialDownY + (float)mTouchSlop;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #472 <Field float mInitialDownY>
	//   15   27:aload_0         
	//   16   28:getfield        #171 <Field int mTouchSlop>
	//   17   31:i2f             
	//   18   32:fadd            
	//   19   33:putfield        #476 <Field float mInitialMotionY>
			mIsBeingDragged = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #474 <Field boolean mIsBeingDragged>
			mProgress.setAlpha(76);
	//   23   41:aload_0         
	//   24   42:getfield        #311 <Field CircularProgressDrawable mProgress>
	//   25   45:bipush          76
	//   26   47:invokevirtual   #453 <Method void CircularProgressDrawable.setAlpha(int)>
		}
	//   27   50:return          
	}

	private void startProgressAlphaMaxAnimation()
	{
		mAlphaMaxAnimation = startAlphaAnimation(mProgress.getAlpha(), 255);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #311 <Field CircularProgressDrawable mProgress>
	//    4    6:invokevirtual   #409 <Method int CircularProgressDrawable.getAlpha()>
	//    5    9:sipush          255
	//    6   12:invokespecial   #478 <Method Animation startAlphaAnimation(int, int)>
	//    7   15:putfield        #418 <Field Animation mAlphaMaxAnimation>
	//    8   18:return          
	}

	private void startProgressAlphaStartAnimation()
	{
		mAlphaStartAnimation = startAlphaAnimation(mProgress.getAlpha(), 76);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #311 <Field CircularProgressDrawable mProgress>
	//    4    6:invokevirtual   #409 <Method int CircularProgressDrawable.getAlpha()>
	//    5    9:bipush          76
	//    6   11:invokespecial   #478 <Method Animation startAlphaAnimation(int, int)>
	//    7   14:putfield        #411 <Field Animation mAlphaStartAnimation>
	//    8   17:return          
	}

	private void startScaleDownReturnToStartAnimation(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		mFrom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #262 <Field int mFrom>
		mStartingScale = mCircleView.getScaleX();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #279 <Field CircleImageView mCircleView>
	//    6   10:invokevirtual   #482 <Method float CircleImageView.getScaleX()>
	//    7   13:putfield        #484 <Field float mStartingScale>
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
	//   12   22:invokespecial   #485 <Method void SwipeRefreshLayout$8(SwipeRefreshLayout)>
	//   13   25:putfield        #487 <Field Animation mScaleDownToStartAnimation>
		mScaleDownToStartAnimation.setDuration(150L);
	//   14   28:aload_0         
	//   15   29:getfield        #487 <Field Animation mScaleDownToStartAnimation>
	//   16   32:ldc2w           #488 <Long 150L>
	//   17   35:invokevirtual   #273 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          50
			mCircleView.setAnimationListener(animationlistener);
	//   20   42:aload_0         
	//   21   43:getfield        #279 <Field CircleImageView mCircleView>
	//   22   46:aload_2         
	//   23   47:invokevirtual   #285 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   24   50:aload_0         
	//   25   51:getfield        #279 <Field CircleImageView mCircleView>
	//   26   54:invokevirtual   #288 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleDownToStartAnimation);
	//   27   57:aload_0         
	//   28   58:getfield        #279 <Field CircleImageView mCircleView>
	//   29   61:aload_0         
	//   30   62:getfield        #487 <Field Animation mScaleDownToStartAnimation>
	//   31   65:invokevirtual   #292 <Method void CircleImageView.startAnimation(Animation)>
	//   32   68:return          
	}

	private void startScaleUpAnimation(android.view.animation.Animation.AnimationListener animationlistener)
	{
		mCircleView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field CircleImageView mCircleView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #322 <Method void CircleImageView.setVisibility(int)>
		mProgress.setAlpha(255);
	//    4    8:aload_0         
	//    5    9:getfield        #311 <Field CircularProgressDrawable mProgress>
	//    6   12:sipush          255
	//    7   15:invokevirtual   #453 <Method void CircularProgressDrawable.setAlpha(int)>
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
	//   12   24:invokespecial   #491 <Method void SwipeRefreshLayout$2(SwipeRefreshLayout)>
	//   13   27:putfield        #493 <Field Animation mScaleAnimation>
		mScaleAnimation.setDuration(mMediumAnimationDuration);
	//   14   30:aload_0         
	//   15   31:getfield        #493 <Field Animation mScaleAnimation>
	//   16   34:aload_0         
	//   17   35:getfield        #184 <Field int mMediumAnimationDuration>
	//   18   38:i2l             
	//   19   39:invokevirtual   #273 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  20   42:aload_1         
	//*  21   43:ifnull          54
			mCircleView.setAnimationListener(animationlistener);
	//   22   46:aload_0         
	//   23   47:getfield        #279 <Field CircleImageView mCircleView>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #285 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   26   54:aload_0         
	//   27   55:getfield        #279 <Field CircleImageView mCircleView>
	//   28   58:invokevirtual   #288 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleAnimation);
	//   29   61:aload_0         
	//   30   62:getfield        #279 <Field CircleImageView mCircleView>
	//   31   65:aload_0         
	//   32   66:getfield        #493 <Field Animation mScaleAnimation>
	//   33   69:invokevirtual   #292 <Method void CircleImageView.startAnimation(Animation)>
	//   34   72:return          
	}

	public boolean canChildScrollUp()
	{
		if(mChildScrollUpCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #496 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//*   2    4:ifnull          22
			return mChildScrollUpCallback.canChildScrollUp(this, mTarget);
	//    3    7:aload_0         
	//    4    8:getfield        #496 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #328 <Field View mTarget>
	//    8   16:invokeinterface #499 <Method boolean SwipeRefreshLayout$OnChildScrollUpCallback.canChildScrollUp(SwipeRefreshLayout, View)>
	//    9   21:ireturn         
		if(mTarget instanceof ListView)
	//*  10   22:aload_0         
	//*  11   23:getfield        #328 <Field View mTarget>
	//*  12   26:instanceof      #501 <Class ListView>
	//*  13   29:ifeq            44
			return ListViewCompat.canScrollList((ListView)mTarget, -1);
	//   14   32:aload_0         
	//   15   33:getfield        #328 <Field View mTarget>
	//   16   36:checkcast       #501 <Class ListView>
	//   17   39:iconst_m1       
	//   18   40:invokestatic    #507 <Method boolean ListViewCompat.canScrollList(ListView, int)>
	//   19   43:ireturn         
		else
			return mTarget.canScrollVertically(-1);
	//   20   44:aload_0         
	//   21   45:getfield        #328 <Field View mTarget>
	//   22   48:iconst_m1       
	//   23   49:invokevirtual   #513 <Method boolean View.canScrollVertically(int)>
	//   24   52:ireturn         
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		return mNestedScrollingChildHelper.dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #517 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mNestedScrollingChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #521 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return mNestedScrollingChildHelper.dispatchNestedPreScroll(i, j, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #525 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return mNestedScrollingChildHelper.dispatchNestedScroll(i, j, k, l, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #529 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	protected int getChildDrawingOrder(int i, int j)
	{
		if(mCircleViewIndex < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field int mCircleViewIndex>
	//*   2    4:ifge            9
			return j;
	//    3    7:iload_2         
	//    4    8:ireturn         
		if(j == i - 1)
	//*   5    9:iload_2         
	//*   6   10:iload_1         
	//*   7   11:iconst_1        
	//*   8   12:isub            
	//*   9   13:icmpne          21
			return mCircleViewIndex;
	//   10   16:aload_0         
	//   11   17:getfield        #148 <Field int mCircleViewIndex>
	//   12   20:ireturn         
		if(j >= mCircleViewIndex)
	//*  13   21:iload_2         
	//*  14   22:aload_0         
	//*  15   23:getfield        #148 <Field int mCircleViewIndex>
	//*  16   26:icmplt          33
			return j + 1;
	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:ireturn         
		else
			return j;
	//   21   33:iload_2         
	//   22   34:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollingParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:invokevirtual   #534 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	public int getProgressCircleDiameter()
	{
		return mCircleDiameter;
	//    0    0:aload_0         
	//    1    1:getfield        #207 <Field int mCircleDiameter>
	//    2    4:ireturn         
	}

	public int getProgressViewEndOffset()
	{
		return mSpinnerOffsetEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #216 <Field int mSpinnerOffsetEnd>
	//    2    4:ireturn         
	}

	public int getProgressViewStartOffset()
	{
		return mOriginalOffsetTop;
	//    0    0:aload_0         
	//    1    1:getfield        #237 <Field int mOriginalOffsetTop>
	//    2    4:ireturn         
	}

	public boolean hasNestedScrollingParent()
	{
		return mNestedScrollingChildHelper.hasNestedScrollingParent();
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #540 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent()>
	//    3    7:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mNestedScrollingChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #543 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
	//    3    7:ireturn         
	}

	public boolean isRefreshing()
	{
		return mRefreshing;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field boolean mRefreshing>
	//    2    4:ireturn         
	}

	void moveToStart(float f)
	{
		setTargetOffsetTopAndBottom((mFrom + (int)((float)(mOriginalOffsetTop - mFrom) * f)) - mCircleView.getTop());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #262 <Field int mFrom>
	//    3    5:aload_0         
	//    4    6:getfield        #237 <Field int mOriginalOffsetTop>
	//    5    9:aload_0         
	//    6   10:getfield        #262 <Field int mFrom>
	//    7   13:isub            
	//    8   14:i2f             
	//    9   15:fload_1         
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:iadd            
	//   13   19:aload_0         
	//   14   20:getfield        #279 <Field CircleImageView mCircleView>
	//   15   23:invokevirtual   #547 <Method int CircleImageView.getTop()>
	//   16   26:isub            
	//   17   27:invokevirtual   #432 <Method void setTargetOffsetTopAndBottom(int)>
	//   18   30:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #550 <Method void ViewGroup.onDetachedFromWindow()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #551 <Method void reset()>
	//    4    8:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		ensureTarget();
	//    0    0:aload_0         
	//    1    1:invokespecial   #457 <Method void ensureTarget()>
		int i = motionevent.getActionMasked();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #556 <Method int MotionEvent.getActionMasked()>
	//    4    8:istore_2        
		if(mReturningToStart && i == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #558 <Field boolean mReturningToStart>
	//*   7   13:ifeq            25
	//*   8   16:iload_2         
	//*   9   17:ifne            25
			mReturningToStart = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #558 <Field boolean mReturningToStart>
		if(isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #561 <Method boolean isEnabled()>
	//*  15   29:ifeq            230
	//*  16   32:aload_0         
	//*  17   33:getfield        #558 <Field boolean mReturningToStart>
	//*  18   36:ifne            230
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #563 <Method boolean canChildScrollUp()>
	//*  21   43:ifne            230
	//*  22   46:aload_0         
	//*  23   47:getfield        #137 <Field boolean mRefreshing>
	//*  24   50:ifne            230
		{
			if(mNestedScrollInProgress)
	//*  25   53:aload_0         
	//*  26   54:getfield        #565 <Field boolean mNestedScrollInProgress>
	//*  27   57:ifeq            62
				return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
			if(i != 6)
	//*  30   62:iload_2         
	//*  31   63:bipush          6
	//*  32   65:icmpeq          220
				switch(i)
	//*  33   68:iload_2         
				{
	//*  34   69:tableswitch     0 3: default 100
	//	               0 163
	//	               1 150
	//	               2 103
	//	               3 150
	//*  35  100:goto            225
				case 2: // '\002'
					if(mActivePointerId == -1)
	//*  36  103:aload_0         
	//*  37  104:getfield        #146 <Field int mActivePointerId>
	//*  38  107:iconst_m1       
	//*  39  108:icmpne          123
					{
						Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
	//   40  111:getstatic       #567 <Field String LOG_TAG>
	//   41  114:ldc2            #569 <String "Got ACTION_MOVE event but don't have an active pointer id.">
	//   42  117:invokestatic    #575 <Method int Log.e(String, String)>
	//   43  120:pop             
						return false;
	//   44  121:iconst_0        
	//   45  122:ireturn         
					}
					int j = motionevent.findPointerIndex(mActivePointerId);
	//   46  123:aload_1         
	//   47  124:aload_0         
	//   48  125:getfield        #146 <Field int mActivePointerId>
	//   49  128:invokevirtual   #578 <Method int MotionEvent.findPointerIndex(int)>
	//   50  131:istore_2        
					if(j < 0)
	//*  51  132:iload_2         
	//*  52  133:ifge            138
						return false;
	//   53  136:iconst_0        
	//   54  137:ireturn         
					startDragging(motionevent.getY(j));
	//   55  138:aload_0         
	//   56  139:aload_1         
	//   57  140:iload_2         
	//   58  141:invokevirtual   #582 <Method float MotionEvent.getY(int)>
	//   59  144:invokespecial   #584 <Method void startDragging(float)>
					break;

	//*  60  147:goto            225
				case 1: // '\001'
				case 3: // '\003'
					mIsBeingDragged = false;
	//   61  150:aload_0         
	//   62  151:iconst_0        
	//   63  152:putfield        #474 <Field boolean mIsBeingDragged>
					mActivePointerId = -1;
	//   64  155:aload_0         
	//   65  156:iconst_m1       
	//   66  157:putfield        #146 <Field int mActivePointerId>
					break;

	//*  67  160:goto            225
				case 0: // '\0'
					setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCircleView.getTop());
	//   68  163:aload_0         
	//   69  164:aload_0         
	//   70  165:getfield        #237 <Field int mOriginalOffsetTop>
	//   71  168:aload_0         
	//   72  169:getfield        #279 <Field CircleImageView mCircleView>
	//   73  172:invokevirtual   #547 <Method int CircleImageView.getTop()>
	//   74  175:isub            
	//   75  176:invokevirtual   #432 <Method void setTargetOffsetTopAndBottom(int)>
					mActivePointerId = motionevent.getPointerId(0);
	//   76  179:aload_0         
	//   77  180:aload_1         
	//   78  181:iconst_0        
	//   79  182:invokevirtual   #442 <Method int MotionEvent.getPointerId(int)>
	//   80  185:putfield        #146 <Field int mActivePointerId>
					mIsBeingDragged = false;
	//   81  188:aload_0         
	//   82  189:iconst_0        
	//   83  190:putfield        #474 <Field boolean mIsBeingDragged>
					int k = motionevent.findPointerIndex(mActivePointerId);
	//   84  193:aload_1         
	//   85  194:aload_0         
	//   86  195:getfield        #146 <Field int mActivePointerId>
	//   87  198:invokevirtual   #578 <Method int MotionEvent.findPointerIndex(int)>
	//   88  201:istore_2        
					if(k < 0)
	//*  89  202:iload_2         
	//*  90  203:ifge            208
						return false;
	//   91  206:iconst_0        
	//   92  207:ireturn         
					mInitialDownY = motionevent.getY(k);
	//   93  208:aload_0         
	//   94  209:aload_1         
	//   95  210:iload_2         
	//   96  211:invokevirtual   #582 <Method float MotionEvent.getY(int)>
	//   97  214:putfield        #472 <Field float mInitialDownY>
					break;
				}
			else
	//*  98  217:goto            225
				onSecondaryPointerUp(motionevent);
	//   99  220:aload_0         
	//  100  221:aload_1         
	//  101  222:invokespecial   #586 <Method void onSecondaryPointerUp(MotionEvent)>
			return mIsBeingDragged;
	//  102  225:aload_0         
	//  103  226:getfield        #474 <Field boolean mIsBeingDragged>
	//  104  229:ireturn         
		} else
		{
			return false;
	//  105  230:iconst_0        
	//  106  231:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		i = getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #591 <Method int getMeasuredWidth()>
	//    2    4:istore_2        
		j = getMeasuredHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #594 <Method int getMeasuredHeight()>
	//    5    9:istore_3        
		if(getChildCount() == 0)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #331 <Method int getChildCount()>
	//*   8   14:ifne            18
			return;
	//    9   17:return          
		if(mTarget == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #328 <Field View mTarget>
	//*  12   22:ifnonnull       29
			ensureTarget();
	//   13   25:aload_0         
	//   14   26:invokespecial   #457 <Method void ensureTarget()>
		if(mTarget == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #328 <Field View mTarget>
	//*  17   33:ifnonnull       37
		{
			return;
	//   18   36:return          
		} else
		{
			Object obj = ((Object) (mTarget));
	//   19   37:aload_0         
	//   20   38:getfield        #328 <Field View mTarget>
	//   21   41:astore          6
			k = getPaddingLeft();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #597 <Method int getPaddingLeft()>
	//   24   47:istore          4
			l = getPaddingTop();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #600 <Method int getPaddingTop()>
	//   27   53:istore          5
			((View) (obj)).layout(k, l, (i - getPaddingLeft() - getPaddingRight()) + k, (j - getPaddingTop() - getPaddingBottom()) + l);
	//   28   55:aload           6
	//   29   57:iload           4
	//   30   59:iload           5
	//   31   61:iload_2         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #597 <Method int getPaddingLeft()>
	//   34   66:isub            
	//   35   67:aload_0         
	//   36   68:invokevirtual   #603 <Method int getPaddingRight()>
	//   37   71:isub            
	//   38   72:iload           4
	//   39   74:iadd            
	//   40   75:iload_3         
	//   41   76:aload_0         
	//   42   77:invokevirtual   #600 <Method int getPaddingTop()>
	//   43   80:isub            
	//   44   81:aload_0         
	//   45   82:invokevirtual   #606 <Method int getPaddingBottom()>
	//   46   85:isub            
	//   47   86:iload           5
	//   48   88:iadd            
	//   49   89:invokevirtual   #610 <Method void View.layout(int, int, int, int)>
			k = mCircleView.getMeasuredWidth();
	//   50   92:aload_0         
	//   51   93:getfield        #279 <Field CircleImageView mCircleView>
	//   52   96:invokevirtual   #611 <Method int CircleImageView.getMeasuredWidth()>
	//   53   99:istore          4
			j = mCircleView.getMeasuredHeight();
	//   54  101:aload_0         
	//   55  102:getfield        #279 <Field CircleImageView mCircleView>
	//   56  105:invokevirtual   #612 <Method int CircleImageView.getMeasuredHeight()>
	//   57  108:istore_3        
			obj = ((Object) (mCircleView));
	//   58  109:aload_0         
	//   59  110:getfield        #279 <Field CircleImageView mCircleView>
	//   60  113:astore          6
			i /= 2;
	//   61  115:iload_2         
	//   62  116:iconst_2        
	//   63  117:idiv            
	//   64  118:istore_2        
			k /= 2;
	//   65  119:iload           4
	//   66  121:iconst_2        
	//   67  122:idiv            
	//   68  123:istore          4
			((CircleImageView) (obj)).layout(i - k, mCurrentTargetOffsetTop, i + k, mCurrentTargetOffsetTop + j);
	//   69  125:aload           6
	//   70  127:iload_2         
	//   71  128:iload           4
	//   72  130:isub            
	//   73  131:aload_0         
	//   74  132:getfield        #235 <Field int mCurrentTargetOffsetTop>
	//   75  135:iload_2         
	//   76  136:iload           4
	//   77  138:iadd            
	//   78  139:aload_0         
	//   79  140:getfield        #235 <Field int mCurrentTargetOffsetTop>
	//   80  143:iload_3         
	//   81  144:iadd            
	//   82  145:invokevirtual   #613 <Method void CircleImageView.layout(int, int, int, int)>
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
	//    3    3:invokespecial   #617 <Method void ViewGroup.onMeasure(int, int)>
		if(mTarget == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #328 <Field View mTarget>
	//*   6   10:ifnonnull       17
			ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #457 <Method void ensureTarget()>
		if(mTarget == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #328 <Field View mTarget>
	//*  11   21:ifnonnull       25
			return;
	//   12   24:return          
		mTarget.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   13   25:aload_0         
	//   14   26:getfield        #328 <Field View mTarget>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #591 <Method int getMeasuredWidth()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #597 <Method int getPaddingLeft()>
	//   19   37:isub            
	//   20   38:aload_0         
	//   21   39:invokevirtual   #603 <Method int getPaddingRight()>
	//   22   42:isub            
	//   23   43:ldc2            #618 <Int 0x40000000>
	//   24   46:invokestatic    #623 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #594 <Method int getMeasuredHeight()>
	//   27   53:aload_0         
	//   28   54:invokevirtual   #600 <Method int getPaddingTop()>
	//   29   57:isub            
	//   30   58:aload_0         
	//   31   59:invokevirtual   #606 <Method int getPaddingBottom()>
	//   32   62:isub            
	//   33   63:ldc2            #618 <Int 0x40000000>
	//   34   66:invokestatic    #623 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   35   69:invokevirtual   #626 <Method void View.measure(int, int)>
		mCircleView.measure(android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000));
	//   36   72:aload_0         
	//   37   73:getfield        #279 <Field CircleImageView mCircleView>
	//   38   76:aload_0         
	//   39   77:getfield        #207 <Field int mCircleDiameter>
	//   40   80:ldc2            #618 <Int 0x40000000>
	//   41   83:invokestatic    #623 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   42   86:aload_0         
	//   43   87:getfield        #207 <Field int mCircleDiameter>
	//   44   90:ldc2            #618 <Int 0x40000000>
	//   45   93:invokestatic    #623 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   46   96:invokevirtual   #627 <Method void CircleImageView.measure(int, int)>
		mCircleViewIndex = -1;
	//   47   99:aload_0         
	//   48  100:iconst_m1       
	//   49  101:putfield        #148 <Field int mCircleViewIndex>
		for(i = 0; i < getChildCount(); i++)
	//*  50  104:iconst_0        
	//*  51  105:istore_1        
	//*  52  106:iload_1         
	//*  53  107:aload_0         
	//*  54  108:invokevirtual   #331 <Method int getChildCount()>
	//*  55  111:icmpge          139
			if(getChildAt(i) == mCircleView)
	//*  56  114:aload_0         
	//*  57  115:iload_1         
	//*  58  116:invokevirtual   #335 <Method View getChildAt(int)>
	//*  59  119:aload_0         
	//*  60  120:getfield        #279 <Field CircleImageView mCircleView>
	//*  61  123:if_acmpne       132
			{
				mCircleViewIndex = i;
	//   62  126:aload_0         
	//   63  127:iload_1         
	//   64  128:putfield        #148 <Field int mCircleViewIndex>
				return;
	//   65  131:return          
			}

	//   66  132:iload_1         
	//   67  133:iconst_1        
	//   68  134:iadd            
	//   69  135:istore_1        
	//*  70  136:goto            106
	//   71  139:return          
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		return dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:iload           4
	//    4    5:invokevirtual   #630 <Method boolean dispatchNestedFling(float, float, boolean)>
	//    5    8:ireturn         
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		return dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #633 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		if(j > 0 && mTotalUnconsumed > 0.0F)
	//*   0    0:iload_3         
	//*   1    1:ifle            70
	//*   2    4:aload_0         
	//*   3    5:getfield        #637 <Field float mTotalUnconsumed>
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifle            70
		{
			float f = j;
	//    7   13:iload_3         
	//    8   14:i2f             
	//    9   15:fstore          5
			if(f > mTotalUnconsumed)
	//*  10   17:fload           5
	//*  11   19:aload_0         
	//*  12   20:getfield        #637 <Field float mTotalUnconsumed>
	//*  13   23:fcmpl           
	//*  14   24:ifle            46
			{
				ai[1] = j - (int)mTotalUnconsumed;
	//   15   27:aload           4
	//   16   29:iconst_1        
	//   17   30:iload_3         
	//   18   31:aload_0         
	//   19   32:getfield        #637 <Field float mTotalUnconsumed>
	//   20   35:f2i             
	//   21   36:isub            
	//   22   37:iastore         
				mTotalUnconsumed = 0.0F;
	//   23   38:aload_0         
	//   24   39:fconst_0        
	//   25   40:putfield        #637 <Field float mTotalUnconsumed>
			} else
	//*  26   43:goto            62
			{
				mTotalUnconsumed = mTotalUnconsumed - f;
	//   27   46:aload_0         
	//   28   47:aload_0         
	//   29   48:getfield        #637 <Field float mTotalUnconsumed>
	//   30   51:fload           5
	//   31   53:fsub            
	//   32   54:putfield        #637 <Field float mTotalUnconsumed>
				ai[1] = j;
	//   33   57:aload           4
	//   34   59:iconst_1        
	//   35   60:iload_3         
	//   36   61:iastore         
			}
			moveSpinner(mTotalUnconsumed);
	//   37   62:aload_0         
	//   38   63:aload_0         
	//   39   64:getfield        #637 <Field float mTotalUnconsumed>
	//   40   67:invokespecial   #639 <Method void moveSpinner(float)>
		}
		if(mUsingCustomStart && j > 0 && mTotalUnconsumed == 0.0F && Math.abs(j - ai[1]) > 0)
	//*  41   70:aload_0         
	//*  42   71:getfield        #386 <Field boolean mUsingCustomStart>
	//*  43   74:ifeq            111
	//*  44   77:iload_3         
	//*  45   78:ifle            111
	//*  46   81:aload_0         
	//*  47   82:getfield        #637 <Field float mTotalUnconsumed>
	//*  48   85:fconst_0        
	//*  49   86:fcmpl           
	//*  50   87:ifne            111
	//*  51   90:iload_3         
	//*  52   91:aload           4
	//*  53   93:iconst_1        
	//*  54   94:iaload          
	//*  55   95:isub            
	//*  56   96:invokestatic    #641 <Method int Math.abs(int)>
	//*  57   99:ifle            111
			mCircleView.setVisibility(8);
	//   58  102:aload_0         
	//   59  103:getfield        #279 <Field CircleImageView mCircleView>
	//   60  106:bipush          8
	//   61  108:invokevirtual   #322 <Method void CircleImageView.setVisibility(int)>
		view = ((View) (mParentScrollConsumed));
	//   62  111:aload_0         
	//   63  112:getfield        #142 <Field int[] mParentScrollConsumed>
	//   64  115:astore_1        
		if(dispatchNestedPreScroll(i - ai[0], j - ai[1], ((int []) (view)), ((int []) (null))))
	//*  65  116:aload_0         
	//*  66  117:iload_2         
	//*  67  118:aload           4
	//*  68  120:iconst_0        
	//*  69  121:iaload          
	//*  70  122:isub            
	//*  71  123:iload_3         
	//*  72  124:aload           4
	//*  73  126:iconst_1        
	//*  74  127:iaload          
	//*  75  128:isub            
	//*  76  129:aload_1         
	//*  77  130:aconst_null     
	//*  78  131:invokevirtual   #642 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//*  79  134:ifeq            161
		{
			ai[0] = ai[0] + view[0];
	//   80  137:aload           4
	//   81  139:iconst_0        
	//   82  140:aload           4
	//   83  142:iconst_0        
	//   84  143:iaload          
	//   85  144:aload_1         
	//   86  145:iconst_0        
	//   87  146:iaload          
	//   88  147:iadd            
	//   89  148:iastore         
			ai[1] = ai[1] + view[1];
	//   90  149:aload           4
	//   91  151:iconst_1        
	//   92  152:aload           4
	//   93  154:iconst_1        
	//   94  155:iaload          
	//   95  156:aload_1         
	//   96  157:iconst_1        
	//   97  158:iaload          
	//   98  159:iadd            
	//   99  160:iastore         
		}
	//  100  161:return          
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
	//    6    8:getfield        #144 <Field int[] mParentOffsetInWindow>
	//    7   11:invokevirtual   #645 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:pop             
		i = l + mParentOffsetInWindow[1];
	//    9   15:iload           5
	//   10   17:aload_0         
	//   11   18:getfield        #144 <Field int[] mParentOffsetInWindow>
	//   12   21:iconst_1        
	//   13   22:iaload          
	//   14   23:iadd            
	//   15   24:istore_2        
		if(i < 0 && !canChildScrollUp())
	//*  16   25:iload_2         
	//*  17   26:ifge            58
	//*  18   29:aload_0         
	//*  19   30:invokevirtual   #563 <Method boolean canChildScrollUp()>
	//*  20   33:ifne            58
		{
			mTotalUnconsumed = mTotalUnconsumed + (float)Math.abs(i);
	//   21   36:aload_0         
	//   22   37:aload_0         
	//   23   38:getfield        #637 <Field float mTotalUnconsumed>
	//   24   41:iload_2         
	//   25   42:invokestatic    #641 <Method int Math.abs(int)>
	//   26   45:i2f             
	//   27   46:fadd            
	//   28   47:putfield        #637 <Field float mTotalUnconsumed>
			moveSpinner(mTotalUnconsumed);
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #637 <Field float mTotalUnconsumed>
	//   32   55:invokespecial   #639 <Method void moveSpinner(float)>
		}
	//   33   58:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mNestedScrollingParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #649 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		startNestedScroll(i & 2);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:iconst_2        
	//    9   13:iand            
	//   10   14:invokevirtual   #652 <Method boolean startNestedScroll(int)>
	//   11   17:pop             
		mTotalUnconsumed = 0.0F;
	//   12   18:aload_0         
	//   13   19:fconst_0        
	//   14   20:putfield        #637 <Field float mTotalUnconsumed>
		mNestedScrollInProgress = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #565 <Field boolean mNestedScrollInProgress>
	//   18   28:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		return isEnabled() && !mReturningToStart && !mRefreshing && (i & 2) != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #561 <Method boolean isEnabled()>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #558 <Field boolean mReturningToStart>
	//    5   11:ifne            29
	//    6   14:aload_0         
	//    7   15:getfield        #137 <Field boolean mRefreshing>
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
	//    1    1:getfield        #223 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #657 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		mNestedScrollInProgress = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #565 <Field boolean mNestedScrollInProgress>
		if(mTotalUnconsumed > 0.0F)
	//*   7   13:aload_0         
	//*   8   14:getfield        #637 <Field float mTotalUnconsumed>
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifle            35
		{
			finishSpinner(mTotalUnconsumed);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #637 <Field float mTotalUnconsumed>
	//   15   27:invokespecial   #659 <Method void finishSpinner(float)>
			mTotalUnconsumed = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #637 <Field float mTotalUnconsumed>
		}
		stopNestedScroll();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #662 <Method void stopNestedScroll()>
	//   21   39:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #556 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(mReturningToStart && i == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #558 <Field boolean mReturningToStart>
	//*   5   10:ifeq            23
	//*   6   13:iload           4
	//*   7   15:ifne            23
			mReturningToStart = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #558 <Field boolean mReturningToStart>
		if(isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing)
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #561 <Method boolean isEnabled()>
	//*  13   27:ifeq            309
	//*  14   30:aload_0         
	//*  15   31:getfield        #558 <Field boolean mReturningToStart>
	//*  16   34:ifne            309
	//*  17   37:aload_0         
	//*  18   38:invokevirtual   #563 <Method boolean canChildScrollUp()>
	//*  19   41:ifne            309
	//*  20   44:aload_0         
	//*  21   45:getfield        #137 <Field boolean mRefreshing>
	//*  22   48:ifne            309
		{
			if(mNestedScrollInProgress)
	//*  23   51:aload_0         
	//*  24   52:getfield        #565 <Field boolean mNestedScrollInProgress>
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
	//   33  109:invokespecial   #586 <Method void onSecondaryPointerUp(MotionEvent)>
				break;
	//   34  112:goto            307

			case 5: // '\005'
				int j = motionevent.getActionIndex();
	//   35  115:aload_1         
	//   36  116:invokevirtual   #439 <Method int MotionEvent.getActionIndex()>
	//   37  119:istore          4
				if(j < 0)
	//*  38  121:iload           4
	//*  39  123:ifge            138
				{
					Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
	//   40  126:getstatic       #567 <Field String LOG_TAG>
	//   41  129:ldc2            #665 <String "Got ACTION_POINTER_DOWN event but have an invalid action index.">
	//   42  132:invokestatic    #575 <Method int Log.e(String, String)>
	//   43  135:pop             
					return false;
	//   44  136:iconst_0        
	//   45  137:ireturn         
				}
				mActivePointerId = motionevent.getPointerId(j);
	//   46  138:aload_0         
	//   47  139:aload_1         
	//   48  140:iload           4
	//   49  142:invokevirtual   #442 <Method int MotionEvent.getPointerId(int)>
	//   50  145:putfield        #146 <Field int mActivePointerId>
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
	//   56  155:getfield        #146 <Field int mActivePointerId>
	//   57  158:invokevirtual   #578 <Method int MotionEvent.findPointerIndex(int)>
	//   58  161:istore          4
				if(k < 0)
	//*  59  163:iload           4
	//*  60  165:ifge            180
				{
					Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
	//   61  168:getstatic       #567 <Field String LOG_TAG>
	//   62  171:ldc2            #667 <String "Got ACTION_MOVE event but have an invalid active pointer id.">
	//   63  174:invokestatic    #575 <Method int Log.e(String, String)>
	//   64  177:pop             
					return false;
	//   65  178:iconst_0        
	//   66  179:ireturn         
				}
				float f = motionevent.getY(k);
	//   67  180:aload_1         
	//   68  181:iload           4
	//   69  183:invokevirtual   #582 <Method float MotionEvent.getY(int)>
	//   70  186:fstore_2        
				startDragging(f);
	//   71  187:aload_0         
	//   72  188:fload_2         
	//   73  189:invokespecial   #584 <Method void startDragging(float)>
				if(!mIsBeingDragged)
					break;
	//   74  192:aload_0         
	//   75  193:getfield        #474 <Field boolean mIsBeingDragged>
	//   76  196:ifeq            307
				f = (f - mInitialMotionY) * 0.5F;
	//   77  199:fload_2         
	//   78  200:aload_0         
	//   79  201:getfield        #476 <Field float mInitialMotionY>
	//   80  204:fsub            
	//   81  205:ldc1            #52  <Float 0.5F>
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
	//   90  217:invokespecial   #639 <Method void moveSpinner(float)>
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
	//   96  227:getfield        #146 <Field int mActivePointerId>
	//   97  230:invokevirtual   #578 <Method int MotionEvent.findPointerIndex(int)>
	//   98  233:istore          4
				if(l < 0)
	//*  99  235:iload           4
	//* 100  237:ifge            252
				{
					Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
	//  101  240:getstatic       #567 <Field String LOG_TAG>
	//  102  243:ldc2            #669 <String "Got ACTION_UP event but don't have an active pointer id.">
	//  103  246:invokestatic    #575 <Method int Log.e(String, String)>
	//  104  249:pop             
					return false;
	//  105  250:iconst_0        
	//  106  251:ireturn         
				}
				if(mIsBeingDragged)
	//* 107  252:aload_0         
	//* 108  253:getfield        #474 <Field boolean mIsBeingDragged>
	//* 109  256:ifeq            286
				{
					float f1 = motionevent.getY(l);
	//  110  259:aload_1         
	//  111  260:iload           4
	//  112  262:invokevirtual   #582 <Method float MotionEvent.getY(int)>
	//  113  265:fstore_2        
					float f2 = mInitialMotionY;
	//  114  266:aload_0         
	//  115  267:getfield        #476 <Field float mInitialMotionY>
	//  116  270:fstore_3        
					mIsBeingDragged = false;
	//  117  271:aload_0         
	//  118  272:iconst_0        
	//  119  273:putfield        #474 <Field boolean mIsBeingDragged>
					finishSpinner((f1 - f2) * 0.5F);
	//  120  276:aload_0         
	//  121  277:fload_2         
	//  122  278:fload_3         
	//  123  279:fsub            
	//  124  280:ldc1            #52  <Float 0.5F>
	//  125  282:fmul            
	//  126  283:invokespecial   #659 <Method void finishSpinner(float)>
				}
				mActivePointerId = -1;
	//  127  286:aload_0         
	//  128  287:iconst_m1       
	//  129  288:putfield        #146 <Field int mActivePointerId>
				return false;
	//  130  291:iconst_0        
	//  131  292:ireturn         

			case 0: // '\0'
				mActivePointerId = motionevent.getPointerId(0);
	//  132  293:aload_0         
	//  133  294:aload_1         
	//  134  295:iconst_0        
	//  135  296:invokevirtual   #442 <Method int MotionEvent.getPointerId(int)>
	//  136  299:putfield        #146 <Field int mActivePointerId>
				mIsBeingDragged = false;
	//  137  302:aload_0         
	//  138  303:iconst_0        
	//  139  304:putfield        #474 <Field boolean mIsBeingDragged>
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
	//*   0    0:getstatic       #675 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          18
	//*   3    8:aload_0         
	//*   4    9:getfield        #328 <Field View mTarget>
	//*   5   12:instanceof      #677 <Class AbsListView>
	//*   6   15:ifne            41
		{
			if(mTarget != null && !ViewCompat.isNestedScrollingEnabled(mTarget))
	//*   7   18:aload_0         
	//*   8   19:getfield        #328 <Field View mTarget>
	//*   9   22:ifnull          36
	//*  10   25:aload_0         
	//*  11   26:getfield        #328 <Field View mTarget>
	//*  12   29:invokestatic    #682 <Method boolean ViewCompat.isNestedScrollingEnabled(View)>
	//*  13   32:ifne            36
				return;
	//   14   35:return          
			super.requestDisallowInterceptTouchEvent(flag);
	//   15   36:aload_0         
	//   16   37:iload_1         
	//   17   38:invokespecial   #684 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		}
	//   18   41:return          
	}

	void reset()
	{
		mCircleView.clearAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #288 <Method void CircleImageView.clearAnimation()>
		mProgress.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #311 <Field CircularProgressDrawable mProgress>
	//    5   11:invokevirtual   #687 <Method void CircularProgressDrawable.stop()>
		mCircleView.setVisibility(8);
	//    6   14:aload_0         
	//    7   15:getfield        #279 <Field CircleImageView mCircleView>
	//    8   18:bipush          8
	//    9   20:invokevirtual   #322 <Method void CircleImageView.setVisibility(int)>
		setColorViewAlpha(255);
	//   10   23:aload_0         
	//   11   24:sipush          255
	//   12   27:invokespecial   #689 <Method void setColorViewAlpha(int)>
		if(mScale)
	//*  13   30:aload_0         
	//*  14   31:getfield        #295 <Field boolean mScale>
	//*  15   34:ifeq            45
			setAnimationProgress(0.0F);
	//   16   37:aload_0         
	//   17   38:fconst_0        
	//   18   39:invokevirtual   #406 <Method void setAnimationProgress(float)>
		else
	//*  19   42:goto            58
			setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCurrentTargetOffsetTop);
	//   20   45:aload_0         
	//   21   46:aload_0         
	//   22   47:getfield        #237 <Field int mOriginalOffsetTop>
	//   23   50:aload_0         
	//   24   51:getfield        #235 <Field int mCurrentTargetOffsetTop>
	//   25   54:isub            
	//   26   55:invokevirtual   #432 <Method void setTargetOffsetTopAndBottom(int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//   27   58:aload_0         
	//   28   59:aload_0         
	//   29   60:getfield        #279 <Field CircleImageView mCircleView>
	//   30   63:invokevirtual   #547 <Method int CircleImageView.getTop()>
	//   31   66:putfield        #235 <Field int mCurrentTargetOffsetTop>
	//   32   69:return          
	}

	void setAnimationProgress(float f)
	{
		mCircleView.setScaleX(f);
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field CircleImageView mCircleView>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #400 <Method void CircleImageView.setScaleX(float)>
		mCircleView.setScaleY(f);
	//    4    8:aload_0         
	//    5    9:getfield        #279 <Field CircleImageView mCircleView>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #403 <Method void CircleImageView.setScaleY(float)>
	//    8   16:return          
	}

	public transient void setColorScheme(int ai[])
	{
		setColorSchemeResources(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #696 <Method void setColorSchemeResources(int[])>
	//    3    5:return          
	}

	public transient void setColorSchemeColors(int ai[])
	{
		ensureTarget();
	//    0    0:aload_0         
	//    1    1:invokespecial   #457 <Method void ensureTarget()>
		mProgress.setColorSchemeColors(ai);
	//    2    4:aload_0         
	//    3    5:getfield        #311 <Field CircularProgressDrawable mProgress>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #701 <Method void CircularProgressDrawable.setColorSchemeColors(int[])>
	//    6   12:return          
	}

	public transient void setColorSchemeResources(int ai[])
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #302 <Method Context getContext()>
	//    2    4:astore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		int ai1[] = new int[ai.length];
	//    5    7:aload_1         
	//    6    8:arraylength     
	//    7    9:newarray        int[]
	//    8   11:astore          4
		for(; i < ai.length; i++)
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
	//   19   26:invokestatic    #707 <Method int ContextCompat.getColor(Context, int)>
	//   20   29:iastore         

	//   21   30:iload_2         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_2        
	//*  25   34:goto            13
		setColorSchemeColors(ai1);
	//   26   37:aload_0         
	//   27   38:aload           4
	//   28   40:invokevirtual   #708 <Method void setColorSchemeColors(int[])>
	//   29   43:return          
	}

	public void setDistanceToTriggerSync(int i)
	{
		mTotalDragDistance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:putfield        #140 <Field float mTotalDragDistance>
	//    4    6:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #710 <Method void ViewGroup.setEnabled(boolean)>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #551 <Method void reset()>
	//    7   13:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mNestedScrollingChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #711 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnChildScrollUpCallback(OnChildScrollUpCallback onchildscrollupcallback)
	{
		mChildScrollUpCallback = onchildscrollupcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #496 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//    3    5:return          
	}

	public void setOnRefreshListener(OnRefreshListener onrefreshlistener)
	{
		mListener = onrefreshlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #717 <Field SwipeRefreshLayout$OnRefreshListener mListener>
	//    3    5:return          
	}

	public void setProgressBackgroundColor(int i)
	{
		setProgressBackgroundColorSchemeResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #721 <Method void setProgressBackgroundColorSchemeResource(int)>
	//    3    5:return          
	}

	public void setProgressBackgroundColorSchemeColor(int i)
	{
		mCircleView.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field CircleImageView mCircleView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #725 <Method void CircleImageView.setBackgroundColor(int)>
	//    4    8:return          
	}

	public void setProgressBackgroundColorSchemeResource(int i)
	{
		setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #302 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #707 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #727 <Method void setProgressBackgroundColorSchemeColor(int)>
	//    6   12:return          
	}

	public void setProgressViewEndTarget(boolean flag, int i)
	{
		mSpinnerOffsetEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #216 <Field int mSpinnerOffsetEnd>
		mScale = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #295 <Field boolean mScale>
		mCircleView.invalidate();
	//    6   10:aload_0         
	//    7   11:getfield        #279 <Field CircleImageView mCircleView>
	//    8   14:invokevirtual   #732 <Method void CircleImageView.invalidate()>
	//    9   17:return          
	}

	public void setProgressViewOffset(boolean flag, int i, int j)
	{
		mScale = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #295 <Field boolean mScale>
		mOriginalOffsetTop = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #237 <Field int mOriginalOffsetTop>
		mSpinnerOffsetEnd = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #216 <Field int mSpinnerOffsetEnd>
		mUsingCustomStart = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #386 <Field boolean mUsingCustomStart>
		reset();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #551 <Method void reset()>
		mRefreshing = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #137 <Field boolean mRefreshing>
	//   17   29:return          
	}

	public void setRefreshing(boolean flag)
	{
		if(flag && mRefreshing != flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            66
	//*   2    4:aload_0         
	//*   3    5:getfield        #137 <Field boolean mRefreshing>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          66
		{
			mRefreshing = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #137 <Field boolean mRefreshing>
			int i;
			if(!mUsingCustomStart)
	//*   9   17:aload_0         
	//*  10   18:getfield        #386 <Field boolean mUsingCustomStart>
	//*  11   21:ifne            37
				i = mSpinnerOffsetEnd + mOriginalOffsetTop;
	//   12   24:aload_0         
	//   13   25:getfield        #216 <Field int mSpinnerOffsetEnd>
	//   14   28:aload_0         
	//   15   29:getfield        #237 <Field int mOriginalOffsetTop>
	//   16   32:iadd            
	//   17   33:istore_2        
			else
	//*  18   34:goto            42
				i = mSpinnerOffsetEnd;
	//   19   37:aload_0         
	//   20   38:getfield        #216 <Field int mSpinnerOffsetEnd>
	//   21   41:istore_2        
			setTargetOffsetTopAndBottom(i - mCurrentTargetOffsetTop);
	//   22   42:aload_0         
	//   23   43:iload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #235 <Field int mCurrentTargetOffsetTop>
	//   26   48:isub            
	//   27   49:invokevirtual   #432 <Method void setTargetOffsetTopAndBottom(int)>
			mNotify = false;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #455 <Field boolean mNotify>
			startScaleUpAnimation(mRefreshListener);
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #153 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   34   62:invokespecial   #736 <Method void startScaleUpAnimation(android.view.animation.Animation$AnimationListener)>
			return;
	//   35   65:return          
		} else
		{
			setRefreshing(flag, false);
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:iconst_0        
	//   39   69:invokespecial   #346 <Method void setRefreshing(boolean, boolean)>
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
	//    7   11:invokevirtual   #175 <Method Resources getResources()>
	//    8   14:invokevirtual   #199 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    9   17:astore_2        
		if(i == 0)
	//*  10   18:iload_1         
	//*  11   19:ifne            38
			mCircleDiameter = (int)(56F * displaymetrics.density);
	//   12   22:aload_0         
	//   13   23:ldc2            #738 <Float 56F>
	//   14   26:aload_2         
	//   15   27:getfield        #205 <Field float DisplayMetrics.density>
	//   16   30:fmul            
	//   17   31:f2i             
	//   18   32:putfield        #207 <Field int mCircleDiameter>
		else
	//*  19   35:goto            50
			mCircleDiameter = (int)(40F * displaymetrics.density);
	//   20   38:aload_0         
	//   21   39:ldc1            #200 <Float 40F>
	//   22   41:aload_2         
	//   23   42:getfield        #205 <Field float DisplayMetrics.density>
	//   24   45:fmul            
	//   25   46:f2i             
	//   26   47:putfield        #207 <Field int mCircleDiameter>
		mCircleView.setImageDrawable(((Drawable) (null)));
	//   27   50:aload_0         
	//   28   51:getfield        #279 <Field CircleImageView mCircleView>
	//   29   54:aconst_null     
	//   30   55:invokevirtual   #319 <Method void CircleImageView.setImageDrawable(Drawable)>
		mProgress.setStyle(i);
	//   31   58:aload_0         
	//   32   59:getfield        #311 <Field CircularProgressDrawable mProgress>
	//   33   62:iload_1         
	//   34   63:invokevirtual   #315 <Method void CircularProgressDrawable.setStyle(int)>
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//   35   66:aload_0         
	//   36   67:getfield        #279 <Field CircleImageView mCircleView>
	//   37   70:aload_0         
	//   38   71:getfield        #311 <Field CircularProgressDrawable mProgress>
	//   39   74:invokevirtual   #319 <Method void CircleImageView.setImageDrawable(Drawable)>
	//   40   77:return          
	}

	void setTargetOffsetTopAndBottom(int i)
	{
		mCircleView.bringToFront();
	//    0    0:aload_0         
	//    1    1:getfield        #279 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #741 <Method void CircleImageView.bringToFront()>
		ViewCompat.offsetTopAndBottom(((View) (mCircleView)), i);
	//    3    7:aload_0         
	//    4    8:getfield        #279 <Field CircleImageView mCircleView>
	//    5   11:iload_1         
	//    6   12:invokestatic    #745 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #279 <Field CircleImageView mCircleView>
	//   10   20:invokevirtual   #547 <Method int CircleImageView.getTop()>
	//   11   23:putfield        #235 <Field int mCurrentTargetOffsetTop>
	//   12   26:return          
	}

	public boolean startNestedScroll(int i)
	{
		return mNestedScrollingChildHelper.startNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #746 <Method boolean NestedScrollingChildHelper.startNestedScroll(int)>
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
	//    4    6:invokespecial   #747 <Method void SwipeRefreshLayout$3(SwipeRefreshLayout)>
	//    5    9:putfield        #749 <Field Animation mScaleDownAnimation>
		mScaleDownAnimation.setDuration(150L);
	//    6   12:aload_0         
	//    7   13:getfield        #749 <Field Animation mScaleDownAnimation>
	//    8   16:ldc2w           #488 <Long 150L>
	//    9   19:invokevirtual   #273 <Method void Animation.setDuration(long)>
		mCircleView.setAnimationListener(animationlistener);
	//   10   22:aload_0         
	//   11   23:getfield        #279 <Field CircleImageView mCircleView>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #285 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   14   30:aload_0         
	//   15   31:getfield        #279 <Field CircleImageView mCircleView>
	//   16   34:invokevirtual   #288 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleDownAnimation);
	//   17   37:aload_0         
	//   18   38:getfield        #279 <Field CircleImageView mCircleView>
	//   19   41:aload_0         
	//   20   42:getfield        #749 <Field Animation mScaleDownAnimation>
	//   21   45:invokevirtual   #292 <Method void CircleImageView.startAnimation(Animation)>
	//   22   48:return          
	}

	public void stopNestedScroll()
	{
		mNestedScrollingChildHelper.stopNestedScroll();
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #750 <Method void NestedScrollingChildHelper.stopNestedScroll()>
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
		//*   3    7:ifeq            83
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
				mCurrentTargetOffsetTop = mCircleView.getTop();
		//   25   65:aload_0         
		//   26   66:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   27   69:aload_0         
		//   28   70:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   29   73:getfield        #53  <Field CircleImageView SwipeRefreshLayout.mCircleView>
		//   30   76:invokevirtual   #59  <Method int CircleImageView.getTop()>
		//   31   79:putfield        #63  <Field int SwipeRefreshLayout.mCurrentTargetOffsetTop>
				return;
		//   32   82:return          
			} else
			{
				reset();
		//   33   83:aload_0         
		//   34   84:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   35   87:invokevirtual   #66  <Method void SwipeRefreshLayout.reset()>
				return;
		//   36   90:return          
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
	//    4    5:ldc1            #123 <Int 0x101000e>
	//    5    7:iastore         
	//    6    8:putstatic       #125 <Field int[] LAYOUT_ATTRS>
	//*   7   11:return          
	}
}
