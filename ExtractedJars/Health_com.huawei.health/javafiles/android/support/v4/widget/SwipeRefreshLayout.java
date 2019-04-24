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

// Referenced classes of package android.support.v4.widget:
//			CircleImageView, MaterialProgressDrawable

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
	//    3    3:invokespecial   #137 <Method void SwipeRefreshLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public SwipeRefreshLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #138 <Method void ViewGroup(Context, AttributeSet)>
		mRefreshing = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #140 <Field boolean mRefreshing>
		mTotalDragDistance = -1F;
	//    7   11:aload_0         
	//    8   12:ldc1            #141 <Float -1F>
	//    9   14:putfield        #143 <Field float mTotalDragDistance>
		mParentScrollConsumed = new int[2];
	//   10   17:aload_0         
	//   11   18:iconst_2        
	//   12   19:newarray        int[]
	//   13   21:putfield        #145 <Field int[] mParentScrollConsumed>
		mParentOffsetInWindow = new int[2];
	//   14   24:aload_0         
	//   15   25:iconst_2        
	//   16   26:newarray        int[]
	//   17   28:putfield        #147 <Field int[] mParentOffsetInWindow>
		mActivePointerId = -1;
	//   18   31:aload_0         
	//   19   32:iconst_m1       
	//   20   33:putfield        #149 <Field int mActivePointerId>
		mCircleViewIndex = -1;
	//   21   36:aload_0         
	//   22   37:iconst_m1       
	//   23   38:putfield        #151 <Field int mCircleViewIndex>
	//   24   41:aload_0         
	//   25   42:new             #10  <Class SwipeRefreshLayout$1>
	//   26   45:dup             
	//   27   46:aload_0         
	//   28   47:invokespecial   #154 <Method void SwipeRefreshLayout$1(SwipeRefreshLayout)>
	//   29   50:putfield        #156 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
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
			//   47   93:getfield        #56  <Field MaterialProgressDrawable SwipeRefreshLayout.mProgress>
			//   48   96:fconst_1        
			//   49   97:fload_1         
			//   50   98:fsub            
			//   51   99:invokevirtual   #62  <Method void MaterialProgressDrawable.setArrowScale(float)>
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
	//   34   59:invokespecial   #157 <Method void SwipeRefreshLayout$6(SwipeRefreshLayout)>
	//   35   62:putfield        #159 <Field Animation mAnimateToCorrectPosition>
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
	//   40   71:invokespecial   #160 <Method void SwipeRefreshLayout$7(SwipeRefreshLayout)>
	//   41   74:putfield        #162 <Field Animation mAnimateToStartPosition>
		mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
	//   42   77:aload_0         
	//   43   78:aload_1         
	//   44   79:invokestatic    #168 <Method ViewConfiguration ViewConfiguration.get(Context)>
	//   45   82:invokevirtual   #172 <Method int ViewConfiguration.getScaledTouchSlop()>
	//   46   85:putfield        #174 <Field int mTouchSlop>
		mMediumAnimationDuration = getResources().getInteger(0x10e0001);
	//   47   88:aload_0         
	//   48   89:aload_0         
	//   49   90:invokevirtual   #178 <Method Resources getResources()>
	//   50   93:ldc1            #179 <Int 0x10e0001>
	//   51   95:invokevirtual   #185 <Method int Resources.getInteger(int)>
	//   52   98:putfield        #187 <Field int mMediumAnimationDuration>
		setWillNotDraw(false);
	//   53  101:aload_0         
	//   54  102:iconst_0        
	//   55  103:invokevirtual   #191 <Method void setWillNotDraw(boolean)>
		mDecelerateInterpolator = new DecelerateInterpolator(2.0F);
	//   56  106:aload_0         
	//   57  107:new             #193 <Class DecelerateInterpolator>
	//   58  110:dup             
	//   59  111:fconst_2        
	//   60  112:invokespecial   #196 <Method void DecelerateInterpolator(float)>
	//   61  115:putfield        #198 <Field DecelerateInterpolator mDecelerateInterpolator>
		DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
	//   62  118:aload_0         
	//   63  119:invokevirtual   #178 <Method Resources getResources()>
	//   64  122:invokevirtual   #202 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   65  125:astore          4
		mCircleDiameter = (int)(displaymetrics.density * 40F);
	//   66  127:aload_0         
	//   67  128:aload           4
	//   68  130:getfield        #207 <Field float DisplayMetrics.density>
	//   69  133:ldc1            #208 <Float 40F>
	//   70  135:fmul            
	//   71  136:f2i             
	//   72  137:putfield        #210 <Field int mCircleDiameter>
		createProgressView();
	//   73  140:aload_0         
	//   74  141:invokespecial   #213 <Method void createProgressView()>
		ViewCompat.setChildrenDrawingOrderEnabled(((ViewGroup) (this)), true);
	//   75  144:aload_0         
	//   76  145:iconst_1        
	//   77  146:invokestatic    #219 <Method void ViewCompat.setChildrenDrawingOrderEnabled(ViewGroup, boolean)>
		mSpinnerOffsetEnd = (int)(displaymetrics.density * 64F);
	//   78  149:aload_0         
	//   79  150:aload           4
	//   80  152:getfield        #207 <Field float DisplayMetrics.density>
	//   81  155:ldc1            #220 <Float 64F>
	//   82  157:fmul            
	//   83  158:f2i             
	//   84  159:putfield        #222 <Field int mSpinnerOffsetEnd>
		mTotalDragDistance = mSpinnerOffsetEnd;
	//   85  162:aload_0         
	//   86  163:aload_0         
	//   87  164:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   88  167:i2f             
	//   89  168:putfield        #143 <Field float mTotalDragDistance>
		mNestedScrollingParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   90  171:aload_0         
	//   91  172:new             #224 <Class NestedScrollingParentHelper>
	//   92  175:dup             
	//   93  176:aload_0         
	//   94  177:invokespecial   #227 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   95  180:putfield        #229 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
		mNestedScrollingChildHelper = new NestedScrollingChildHelper(((View) (this)));
	//   96  183:aload_0         
	//   97  184:new             #231 <Class NestedScrollingChildHelper>
	//   98  187:dup             
	//   99  188:aload_0         
	//  100  189:invokespecial   #234 <Method void NestedScrollingChildHelper(View)>
	//  101  192:putfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
		setNestedScrollingEnabled(true);
	//  102  195:aload_0         
	//  103  196:iconst_1        
	//  104  197:invokevirtual   #239 <Method void setNestedScrollingEnabled(boolean)>
		int i = -mCircleDiameter;
	//  105  200:aload_0         
	//  106  201:getfield        #210 <Field int mCircleDiameter>
	//  107  204:ineg            
	//  108  205:istore_3        
		mCurrentTargetOffsetTop = i;
	//  109  206:aload_0         
	//  110  207:iload_3         
	//  111  208:putfield        #241 <Field int mCurrentTargetOffsetTop>
		mOriginalOffsetTop = i;
	//  112  211:aload_0         
	//  113  212:iload_3         
	//  114  213:putfield        #243 <Field int mOriginalOffsetTop>
		moveToStart(1.0F);
	//  115  216:aload_0         
	//  116  217:fconst_1        
	//  117  218:invokevirtual   #246 <Method void moveToStart(float)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, LAYOUT_ATTRS)));
	//  118  221:aload_1         
	//  119  222:aload_2         
	//  120  223:getstatic       #131 <Field int[] LAYOUT_ATTRS>
	//  121  226:invokevirtual   #252 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//  122  229:astore_1        
		setEnabled(((TypedArray) (context)).getBoolean(0, true));
	//  123  230:aload_0         
	//  124  231:aload_1         
	//  125  232:iconst_0        
	//  126  233:iconst_1        
	//  127  234:invokevirtual   #258 <Method boolean TypedArray.getBoolean(int, boolean)>
	//  128  237:invokevirtual   #261 <Method void setEnabled(boolean)>
		((TypedArray) (context)).recycle();
	//  129  240:aload_1         
	//  130  241:invokevirtual   #264 <Method void TypedArray.recycle()>
	//  131  244:return          
	}

	private void animateOffsetToCorrectPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		mFrom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #268 <Field int mFrom>
		mAnimateToCorrectPosition.reset();
	//    3    5:aload_0         
	//    4    6:getfield        #159 <Field Animation mAnimateToCorrectPosition>
	//    5    9:invokevirtual   #273 <Method void Animation.reset()>
		mAnimateToCorrectPosition.setDuration(200L);
	//    6   12:aload_0         
	//    7   13:getfield        #159 <Field Animation mAnimateToCorrectPosition>
	//    8   16:ldc2w           #274 <Long 200L>
	//    9   19:invokevirtual   #279 <Method void Animation.setDuration(long)>
		mAnimateToCorrectPosition.setInterpolator(((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   10   22:aload_0         
	//   11   23:getfield        #159 <Field Animation mAnimateToCorrectPosition>
	//   12   26:aload_0         
	//   13   27:getfield        #198 <Field DecelerateInterpolator mDecelerateInterpolator>
	//   14   30:invokevirtual   #283 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  15   33:aload_2         
	//*  16   34:ifnull          45
			mCircleView.setAnimationListener(animationlistener);
	//   17   37:aload_0         
	//   18   38:getfield        #285 <Field CircleImageView mCircleView>
	//   19   41:aload_2         
	//   20   42:invokevirtual   #291 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   21   45:aload_0         
	//   22   46:getfield        #285 <Field CircleImageView mCircleView>
	//   23   49:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mAnimateToCorrectPosition);
	//   24   52:aload_0         
	//   25   53:getfield        #285 <Field CircleImageView mCircleView>
	//   26   56:aload_0         
	//   27   57:getfield        #159 <Field Animation mAnimateToCorrectPosition>
	//   28   60:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   29   63:return          
	}

	private void animateOffsetToStartPosition(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		if(mScale)
	//*   0    0:aload_0         
	//*   1    1:getfield        #301 <Field boolean mScale>
	//*   2    4:ifeq            14
		{
			startScaleDownReturnToStartAnimation(i, animationlistener);
	//    3    7:aload_0         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #304 <Method void startScaleDownReturnToStartAnimation(int, android.view.animation.Animation$AnimationListener)>
			return;
	//    7   13:return          
		}
		mFrom = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #268 <Field int mFrom>
		mAnimateToStartPosition.reset();
	//   11   19:aload_0         
	//   12   20:getfield        #162 <Field Animation mAnimateToStartPosition>
	//   13   23:invokevirtual   #273 <Method void Animation.reset()>
		mAnimateToStartPosition.setDuration(200L);
	//   14   26:aload_0         
	//   15   27:getfield        #162 <Field Animation mAnimateToStartPosition>
	//   16   30:ldc2w           #274 <Long 200L>
	//   17   33:invokevirtual   #279 <Method void Animation.setDuration(long)>
		mAnimateToStartPosition.setInterpolator(((android.view.animation.Interpolator) (mDecelerateInterpolator)));
	//   18   36:aload_0         
	//   19   37:getfield        #162 <Field Animation mAnimateToStartPosition>
	//   20   40:aload_0         
	//   21   41:getfield        #198 <Field DecelerateInterpolator mDecelerateInterpolator>
	//   22   44:invokevirtual   #283 <Method void Animation.setInterpolator(android.view.animation.Interpolator)>
		if(animationlistener != null)
	//*  23   47:aload_2         
	//*  24   48:ifnull          59
			mCircleView.setAnimationListener(animationlistener);
	//   25   51:aload_0         
	//   26   52:getfield        #285 <Field CircleImageView mCircleView>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #291 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   29   59:aload_0         
	//   30   60:getfield        #285 <Field CircleImageView mCircleView>
	//   31   63:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mAnimateToStartPosition);
	//   32   66:aload_0         
	//   33   67:getfield        #285 <Field CircleImageView mCircleView>
	//   34   70:aload_0         
	//   35   71:getfield        #162 <Field Animation mAnimateToStartPosition>
	//   36   74:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   37   77:return          
	}

	private void createProgressView()
	{
		mCircleView = new CircleImageView(getContext(), 0xfffafafa);
	//    0    0:aload_0         
	//    1    1:new             #287 <Class CircleImageView>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokevirtual   #308 <Method Context getContext()>
	//    5    9:ldc1            #38  <Int 0xfffafafa>
	//    6   11:invokespecial   #311 <Method void CircleImageView(Context, int)>
	//    7   14:putfield        #285 <Field CircleImageView mCircleView>
		mProgress = new MaterialProgressDrawable(getContext(), ((View) (this)));
	//    8   17:aload_0         
	//    9   18:new             #313 <Class MaterialProgressDrawable>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokevirtual   #308 <Method Context getContext()>
	//   13   26:aload_0         
	//   14   27:invokespecial   #316 <Method void MaterialProgressDrawable(Context, View)>
	//   15   30:putfield        #318 <Field MaterialProgressDrawable mProgress>
		mProgress.setBackgroundColor(0xfffafafa);
	//   16   33:aload_0         
	//   17   34:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//   18   37:ldc1            #38  <Int 0xfffafafa>
	//   19   39:invokevirtual   #322 <Method void MaterialProgressDrawable.setBackgroundColor(int)>
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//   20   42:aload_0         
	//   21   43:getfield        #285 <Field CircleImageView mCircleView>
	//   22   46:aload_0         
	//   23   47:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//   24   50:invokevirtual   #326 <Method void CircleImageView.setImageDrawable(Drawable)>
		mCircleView.setVisibility(8);
	//   25   53:aload_0         
	//   26   54:getfield        #285 <Field CircleImageView mCircleView>
	//   27   57:bipush          8
	//   28   59:invokevirtual   #329 <Method void CircleImageView.setVisibility(int)>
		addView(((View) (mCircleView)));
	//   29   62:aload_0         
	//   30   63:aload_0         
	//   31   64:getfield        #285 <Field CircleImageView mCircleView>
	//   32   67:invokevirtual   #332 <Method void addView(View)>
	//   33   70:return          
	}

	private void ensureTarget()
	{
		if(mTarget == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #335 <Field View mTarget>
	//*   2    4:ifnonnull       47
		{
			for(int i = 0; i < getChildCount(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_1        
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #338 <Method int getChildCount()>
	//*   8   14:icmpge          47
			{
				View view = getChildAt(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #342 <Method View getChildAt(int)>
	//   12   22:astore_2        
				if(!((Object) (view)).equals(((Object) (mCircleView))))
	//*  13   23:aload_2         
	//*  14   24:aload_0         
	//*  15   25:getfield        #285 <Field CircleImageView mCircleView>
	//*  16   28:invokevirtual   #348 <Method boolean Object.equals(Object)>
	//*  17   31:ifne            40
				{
					mTarget = view;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #335 <Field View mTarget>
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
	//*   2    2:getfield        #143 <Field float mTotalDragDistance>
	//*   3    5:fcmpl           
	//*   4    6:ifle            16
		{
			setRefreshing(true, true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:iconst_1        
	//    8   12:invokespecial   #353 <Method void setRefreshing(boolean, boolean)>
			return;
	//    9   15:return          
		}
		mRefreshing = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #140 <Field boolean mRefreshing>
		mProgress.setStartEndTrim(0.0F, 0.0F);
	//   13   21:aload_0         
	//   14   22:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//   15   25:fconst_0        
	//   16   26:fconst_0        
	//   17   27:invokevirtual   #357 <Method void MaterialProgressDrawable.setStartEndTrim(float, float)>
		android.view.animation.Animation.AnimationListener animationlistener = null;
	//   18   30:aconst_null     
	//   19   31:astore_2        
		if(!mScale)
	//*  20   32:aload_0         
	//*  21   33:getfield        #301 <Field boolean mScale>
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
	//   26   44:invokespecial   #358 <Method void SwipeRefreshLayout$5(SwipeRefreshLayout)>
	//   27   47:astore_2        
		animateOffsetToStartPosition(mCurrentTargetOffsetTop, animationlistener);
	//   28   48:aload_0         
	//   29   49:aload_0         
	//   30   50:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   31   53:aload_2         
	//   32   54:invokespecial   #360 <Method void animateOffsetToStartPosition(int, android.view.animation.Animation$AnimationListener)>
		mProgress.showArrow(false);
	//   33   57:aload_0         
	//   34   58:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//   35   61:iconst_0        
	//   36   62:invokevirtual   #363 <Method void MaterialProgressDrawable.showArrow(boolean)>
	//   37   65:return          
	}

	private boolean isAnimationRunning(Animation animation)
	{
		return animation != null && animation.hasStarted() && !animation.hasEnded();
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokevirtual   #369 <Method boolean Animation.hasStarted()>
	//    4    8:ifeq            20
	//    5   11:aload_1         
	//    6   12:invokevirtual   #372 <Method boolean Animation.hasEnded()>
	//    7   15:ifne            20
	//    8   18:iconst_1        
	//    9   19:ireturn         
	//   10   20:iconst_0        
	//   11   21:ireturn         
	}

	private void moveSpinner(float f)
	{
		mProgress.showArrow(true);
	//    0    0:aload_0         
	//    1    1:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #363 <Method void MaterialProgressDrawable.showArrow(boolean)>
		float f2 = Math.min(1.0F, Math.abs(f / mTotalDragDistance));
	//    4    8:fconst_1        
	//    5    9:fload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #143 <Field float mTotalDragDistance>
	//    8   14:fdiv            
	//    9   15:invokestatic    #382 <Method float Math.abs(float)>
	//   10   18:invokestatic    #386 <Method float Math.min(float, float)>
	//   11   21:fstore_3        
		float f3 = ((float)Math.max((double)f2 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
	//   12   22:fload_3         
	//   13   23:f2d             
	//   14   24:ldc2w           #387 <Double 0.40000000000000002D>
	//   15   27:dsub            
	//   16   28:dconst_0        
	//   17   29:invokestatic    #392 <Method double Math.max(double, double)>
	//   18   32:d2f             
	//   19   33:ldc2            #393 <Float 5F>
	//   20   36:fmul            
	//   21   37:ldc2            #394 <Float 3F>
	//   22   40:fdiv            
	//   23   41:fstore          4
		float f4 = Math.abs(f);
	//   24   43:fload_1         
	//   25   44:invokestatic    #382 <Method float Math.abs(float)>
	//   26   47:fstore          5
		float f5 = mTotalDragDistance;
	//   27   49:aload_0         
	//   28   50:getfield        #143 <Field float mTotalDragDistance>
	//   29   53:fstore          6
		float f1;
		if(mUsingCustomStart)
	//*  30   55:aload_0         
	//*  31   56:getfield        #396 <Field boolean mUsingCustomStart>
	//*  32   59:ifeq            76
			f1 = mSpinnerOffsetEnd - mOriginalOffsetTop;
	//   33   62:aload_0         
	//   34   63:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   35   66:aload_0         
	//   36   67:getfield        #243 <Field int mOriginalOffsetTop>
	//   37   70:isub            
	//   38   71:i2f             
	//   39   72:fstore_2        
		else
	//*  40   73:goto            82
			f1 = mSpinnerOffsetEnd;
	//   41   76:aload_0         
	//   42   77:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   43   80:i2f             
	//   44   81:fstore_2        
		f4 = Math.max(0.0F, Math.min(f4 - f5, 2.0F * f1) / f1);
	//   45   82:fconst_0        
	//   46   83:fload           5
	//   47   85:fload           6
	//   48   87:fsub            
	//   49   88:fconst_2        
	//   50   89:fload_2         
	//   51   90:fmul            
	//   52   91:invokestatic    #386 <Method float Math.min(float, float)>
	//   53   94:fload_2         
	//   54   95:fdiv            
	//   55   96:invokestatic    #398 <Method float Math.max(float, float)>
	//   56   99:fstore          5
		f4 = (float)((double)(f4 / 4F) - Math.pow(f4 / 4F, 2D)) * 2.0F;
	//   57  101:fload           5
	//   58  103:ldc2            #399 <Float 4F>
	//   59  106:fdiv            
	//   60  107:f2d             
	//   61  108:fload           5
	//   62  110:ldc2            #399 <Float 4F>
	//   63  113:fdiv            
	//   64  114:f2d             
	//   65  115:ldc2w           #400 <Double 2D>
	//   66  118:invokestatic    #404 <Method double Math.pow(double, double)>
	//   67  121:dsub            
	//   68  122:d2f             
	//   69  123:fconst_2        
	//   70  124:fmul            
	//   71  125:fstore          5
		int i = mOriginalOffsetTop;
	//   72  127:aload_0         
	//   73  128:getfield        #243 <Field int mOriginalOffsetTop>
	//   74  131:istore          7
		int j = (int)(f1 * f2 + f1 * f4 * 2.0F);
	//   75  133:fload_2         
	//   76  134:fload_3         
	//   77  135:fmul            
	//   78  136:fload_2         
	//   79  137:fload           5
	//   80  139:fmul            
	//   81  140:fconst_2        
	//   82  141:fmul            
	//   83  142:fadd            
	//   84  143:f2i             
	//   85  144:istore          8
		if(mCircleView.getVisibility() != 0)
	//*  86  146:aload_0         
	//*  87  147:getfield        #285 <Field CircleImageView mCircleView>
	//*  88  150:invokevirtual   #407 <Method int CircleImageView.getVisibility()>
	//*  89  153:ifeq            164
			mCircleView.setVisibility(0);
	//   90  156:aload_0         
	//   91  157:getfield        #285 <Field CircleImageView mCircleView>
	//   92  160:iconst_0        
	//   93  161:invokevirtual   #329 <Method void CircleImageView.setVisibility(int)>
		if(!mScale)
	//*  94  164:aload_0         
	//*  95  165:getfield        #301 <Field boolean mScale>
	//*  96  168:ifne            187
		{
			mCircleView.setScaleX(1.0F);
	//   97  171:aload_0         
	//   98  172:getfield        #285 <Field CircleImageView mCircleView>
	//   99  175:fconst_1        
	//  100  176:invokevirtual   #410 <Method void CircleImageView.setScaleX(float)>
			mCircleView.setScaleY(1.0F);
	//  101  179:aload_0         
	//  102  180:getfield        #285 <Field CircleImageView mCircleView>
	//  103  183:fconst_1        
	//  104  184:invokevirtual   #413 <Method void CircleImageView.setScaleY(float)>
		}
		if(mScale)
	//* 105  187:aload_0         
	//* 106  188:getfield        #301 <Field boolean mScale>
	//* 107  191:ifeq            208
			setAnimationProgress(Math.min(1.0F, f / mTotalDragDistance));
	//  108  194:aload_0         
	//  109  195:fconst_1        
	//  110  196:fload_1         
	//  111  197:aload_0         
	//  112  198:getfield        #143 <Field float mTotalDragDistance>
	//  113  201:fdiv            
	//  114  202:invokestatic    #386 <Method float Math.min(float, float)>
	//  115  205:invokevirtual   #416 <Method void setAnimationProgress(float)>
		if(f < mTotalDragDistance)
	//* 116  208:fload_1         
	//* 117  209:aload_0         
	//* 118  210:getfield        #143 <Field float mTotalDragDistance>
	//* 119  213:fcmpg           
	//* 120  214:ifge            247
		{
			if(mProgress.getAlpha() > 76 && !isAnimationRunning(mAlphaStartAnimation))
	//* 121  217:aload_0         
	//* 122  218:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//* 123  221:invokevirtual   #419 <Method int MaterialProgressDrawable.getAlpha()>
	//* 124  224:bipush          76
	//* 125  226:icmple          275
	//* 126  229:aload_0         
	//* 127  230:aload_0         
	//* 128  231:getfield        #421 <Field Animation mAlphaStartAnimation>
	//* 129  234:invokespecial   #423 <Method boolean isAnimationRunning(Animation)>
	//* 130  237:ifne            275
				startProgressAlphaStartAnimation();
	//  131  240:aload_0         
	//  132  241:invokespecial   #426 <Method void startProgressAlphaStartAnimation()>
		} else
	//* 133  244:goto            275
		if(mProgress.getAlpha() < 255 && !isAnimationRunning(mAlphaMaxAnimation))
	//* 134  247:aload_0         
	//* 135  248:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//* 136  251:invokevirtual   #419 <Method int MaterialProgressDrawable.getAlpha()>
	//* 137  254:sipush          255
	//* 138  257:icmpge          275
	//* 139  260:aload_0         
	//* 140  261:aload_0         
	//* 141  262:getfield        #428 <Field Animation mAlphaMaxAnimation>
	//* 142  265:invokespecial   #423 <Method boolean isAnimationRunning(Animation)>
	//* 143  268:ifne            275
			startProgressAlphaMaxAnimation();
	//  144  271:aload_0         
	//  145  272:invokespecial   #431 <Method void startProgressAlphaMaxAnimation()>
		mProgress.setStartEndTrim(0.0F, Math.min(0.8F, f3 * 0.8F));
	//  146  275:aload_0         
	//  147  276:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//  148  279:fconst_0        
	//  149  280:ldc1            #64  <Float 0.8F>
	//  150  282:fload           4
	//  151  284:ldc1            #64  <Float 0.8F>
	//  152  286:fmul            
	//  153  287:invokestatic    #386 <Method float Math.min(float, float)>
	//  154  290:invokevirtual   #357 <Method void MaterialProgressDrawable.setStartEndTrim(float, float)>
		mProgress.setArrowScale(Math.min(1.0F, f3));
	//  155  293:aload_0         
	//  156  294:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//  157  297:fconst_1        
	//  158  298:fload           4
	//  159  300:invokestatic    #386 <Method float Math.min(float, float)>
	//  160  303:invokevirtual   #434 <Method void MaterialProgressDrawable.setArrowScale(float)>
		mProgress.setProgressRotation(((0.4F * f3 - 0.25F) + 2.0F * f4) * 0.5F);
	//  161  306:aload_0         
	//  162  307:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//  163  310:ldc2            #435 <Float 0.4F>
	//  164  313:fload           4
	//  165  315:fmul            
	//  166  316:ldc2            #436 <Float 0.25F>
	//  167  319:fsub            
	//  168  320:fconst_2        
	//  169  321:fload           5
	//  170  323:fmul            
	//  171  324:fadd            
	//  172  325:ldc1            #52  <Float 0.5F>
	//  173  327:fmul            
	//  174  328:invokevirtual   #439 <Method void MaterialProgressDrawable.setProgressRotation(float)>
		setTargetOffsetTopAndBottom((i + j) - mCurrentTargetOffsetTop);
	//  175  331:aload_0         
	//  176  332:iload           7
	//  177  334:iload           8
	//  178  336:iadd            
	//  179  337:aload_0         
	//  180  338:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//  181  341:isub            
	//  182  342:invokevirtual   #442 <Method void setTargetOffsetTopAndBottom(int)>
	//  183  345:return          
	}

	private void onSecondaryPointerUp(MotionEvent motionevent)
	{
		int i = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #450 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #453 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #149 <Field int mActivePointerId>
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
	//   19   31:invokevirtual   #453 <Method int MotionEvent.getPointerId(int)>
	//   20   34:putfield        #149 <Field int mActivePointerId>
		}
	//   21   37:return          
	}

	private void setColorViewAlpha(int i)
	{
		mCircleView.getBackground().setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #458 <Method Drawable CircleImageView.getBackground()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #463 <Method void Drawable.setAlpha(int)>
		mProgress.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #464 <Method void MaterialProgressDrawable.setAlpha(int)>
	//    9   19:return          
	}

	private void setRefreshing(boolean flag, boolean flag1)
	{
		if(mRefreshing != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field boolean mRefreshing>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          50
		{
			mNotify = flag1;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #466 <Field boolean mNotify>
			ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #468 <Method void ensureTarget()>
			mRefreshing = flag;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #140 <Field boolean mRefreshing>
			if(mRefreshing)
	//*  12   22:aload_0         
	//*  13   23:getfield        #140 <Field boolean mRefreshing>
	//*  14   26:ifeq            42
			{
				animateOffsetToCorrectPosition(mCurrentTargetOffsetTop, mRefreshListener);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   18   34:aload_0         
	//   19   35:getfield        #156 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   20   38:invokespecial   #470 <Method void animateOffsetToCorrectPosition(int, android.view.animation.Animation$AnimationListener)>
				return;
	//   21   41:return          
			}
			startScaleDownAnimation(mRefreshListener);
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #156 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   25   47:invokevirtual   #473 <Method void startScaleDownAnimation(android.view.animation.Animation$AnimationListener)>
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
			//    2    4:getfield        #32  <Field MaterialProgressDrawable SwipeRefreshLayout.mProgress>
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
			//   16   26:invokevirtual   #38  <Method void MaterialProgressDrawable.setAlpha(int)>
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
	//    5    7:invokespecial   #478 <Method void SwipeRefreshLayout$4(SwipeRefreshLayout, int, int)>
	//    6   10:astore_3        
		((Animation) (animation)).setDuration(300L);
	//    7   11:aload_3         
	//    8   12:ldc2w           #479 <Long 300L>
	//    9   15:invokevirtual   #279 <Method void Animation.setDuration(long)>
		mCircleView.setAnimationListener(((android.view.animation.Animation.AnimationListener) (null)));
	//   10   18:aload_0         
	//   11   19:getfield        #285 <Field CircleImageView mCircleView>
	//   12   22:aconst_null     
	//   13   23:invokevirtual   #291 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   14   26:aload_0         
	//   15   27:getfield        #285 <Field CircleImageView mCircleView>
	//   16   30:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(((Animation) (animation)));
	//   17   33:aload_0         
	//   18   34:getfield        #285 <Field CircleImageView mCircleView>
	//   19   37:aload_3         
	//   20   38:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
		return ((Animation) (animation));
	//   21   41:aload_3         
	//   22   42:areturn         
	}

	private void startDragging(float f)
	{
		if(f - mInitialDownY > (float)mTouchSlop && !mIsBeingDragged)
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #483 <Field float mInitialDownY>
	//*   3    5:fsub            
	//*   4    6:aload_0         
	//*   5    7:getfield        #174 <Field int mTouchSlop>
	//*   6   10:i2f             
	//*   7   11:fcmpl           
	//*   8   12:ifle            50
	//*   9   15:aload_0         
	//*  10   16:getfield        #485 <Field boolean mIsBeingDragged>
	//*  11   19:ifne            50
		{
			mInitialMotionY = mInitialDownY + (float)mTouchSlop;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #483 <Field float mInitialDownY>
	//   15   27:aload_0         
	//   16   28:getfield        #174 <Field int mTouchSlop>
	//   17   31:i2f             
	//   18   32:fadd            
	//   19   33:putfield        #487 <Field float mInitialMotionY>
			mIsBeingDragged = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #485 <Field boolean mIsBeingDragged>
			mProgress.setAlpha(76);
	//   23   41:aload_0         
	//   24   42:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//   25   45:bipush          76
	//   26   47:invokevirtual   #464 <Method void MaterialProgressDrawable.setAlpha(int)>
		}
	//   27   50:return          
	}

	private void startProgressAlphaMaxAnimation()
	{
		mAlphaMaxAnimation = startAlphaAnimation(mProgress.getAlpha(), 255);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    4    6:invokevirtual   #419 <Method int MaterialProgressDrawable.getAlpha()>
	//    5    9:sipush          255
	//    6   12:invokespecial   #489 <Method Animation startAlphaAnimation(int, int)>
	//    7   15:putfield        #428 <Field Animation mAlphaMaxAnimation>
	//    8   18:return          
	}

	private void startProgressAlphaStartAnimation()
	{
		mAlphaStartAnimation = startAlphaAnimation(mProgress.getAlpha(), 76);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    4    6:invokevirtual   #419 <Method int MaterialProgressDrawable.getAlpha()>
	//    5    9:bipush          76
	//    6   11:invokespecial   #489 <Method Animation startAlphaAnimation(int, int)>
	//    7   14:putfield        #421 <Field Animation mAlphaStartAnimation>
	//    8   17:return          
	}

	private void startScaleDownReturnToStartAnimation(int i, android.view.animation.Animation.AnimationListener animationlistener)
	{
		mFrom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #268 <Field int mFrom>
		mStartingScale = mCircleView.getScaleX();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #285 <Field CircleImageView mCircleView>
	//    6   10:invokevirtual   #493 <Method float CircleImageView.getScaleX()>
	//    7   13:putfield        #495 <Field float mStartingScale>
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
	//   12   22:invokespecial   #496 <Method void SwipeRefreshLayout$8(SwipeRefreshLayout)>
	//   13   25:putfield        #498 <Field Animation mScaleDownToStartAnimation>
		mScaleDownToStartAnimation.setDuration(150L);
	//   14   28:aload_0         
	//   15   29:getfield        #498 <Field Animation mScaleDownToStartAnimation>
	//   16   32:ldc2w           #499 <Long 150L>
	//   17   35:invokevirtual   #279 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  18   38:aload_2         
	//*  19   39:ifnull          50
			mCircleView.setAnimationListener(animationlistener);
	//   20   42:aload_0         
	//   21   43:getfield        #285 <Field CircleImageView mCircleView>
	//   22   46:aload_2         
	//   23   47:invokevirtual   #291 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   24   50:aload_0         
	//   25   51:getfield        #285 <Field CircleImageView mCircleView>
	//   26   54:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleDownToStartAnimation);
	//   27   57:aload_0         
	//   28   58:getfield        #285 <Field CircleImageView mCircleView>
	//   29   61:aload_0         
	//   30   62:getfield        #498 <Field Animation mScaleDownToStartAnimation>
	//   31   65:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   32   68:return          
	}

	private void startScaleUpAnimation(android.view.animation.Animation.AnimationListener animationlistener)
	{
		mCircleView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #329 <Method void CircleImageView.setVisibility(int)>
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   4    8:getstatic       #506 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          11
	//*   6   13:icmplt          26
			mProgress.setAlpha(255);
	//    7   16:aload_0         
	//    8   17:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    9   20:sipush          255
	//   10   23:invokevirtual   #464 <Method void MaterialProgressDrawable.setAlpha(int)>
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
	//   11   26:aload_0         
	//   12   27:new             #12  <Class SwipeRefreshLayout$2>
	//   13   30:dup             
	//   14   31:aload_0         
	//   15   32:invokespecial   #507 <Method void SwipeRefreshLayout$2(SwipeRefreshLayout)>
	//   16   35:putfield        #509 <Field Animation mScaleAnimation>
		mScaleAnimation.setDuration(mMediumAnimationDuration);
	//   17   38:aload_0         
	//   18   39:getfield        #509 <Field Animation mScaleAnimation>
	//   19   42:aload_0         
	//   20   43:getfield        #187 <Field int mMediumAnimationDuration>
	//   21   46:i2l             
	//   22   47:invokevirtual   #279 <Method void Animation.setDuration(long)>
		if(animationlistener != null)
	//*  23   50:aload_1         
	//*  24   51:ifnull          62
			mCircleView.setAnimationListener(animationlistener);
	//   25   54:aload_0         
	//   26   55:getfield        #285 <Field CircleImageView mCircleView>
	//   27   58:aload_1         
	//   28   59:invokevirtual   #291 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   29   62:aload_0         
	//   30   63:getfield        #285 <Field CircleImageView mCircleView>
	//   31   66:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleAnimation);
	//   32   69:aload_0         
	//   33   70:getfield        #285 <Field CircleImageView mCircleView>
	//   34   73:aload_0         
	//   35   74:getfield        #509 <Field Animation mScaleAnimation>
	//   36   77:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   37   80:return          
	}

	public boolean canChildScrollUp()
	{
		if(mChildScrollUpCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #512 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//*   2    4:ifnull          22
			return mChildScrollUpCallback.canChildScrollUp(this, mTarget);
	//    3    7:aload_0         
	//    4    8:getfield        #512 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #335 <Field View mTarget>
	//    8   16:invokeinterface #515 <Method boolean SwipeRefreshLayout$OnChildScrollUpCallback.canChildScrollUp(SwipeRefreshLayout, View)>
	//    9   21:ireturn         
		else
			return ViewCompat.canScrollVertically(mTarget, -1);
	//   10   22:aload_0         
	//   11   23:getfield        #335 <Field View mTarget>
	//   12   26:iconst_m1       
	//   13   27:invokestatic    #519 <Method boolean ViewCompat.canScrollVertically(View, int)>
	//   14   30:ireturn         
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		return mNestedScrollingChildHelper.dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #523 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mNestedScrollingChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #527 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
	//    5    9:ireturn         
	}

	public boolean dispatchNestedPreScroll(int i, int j, int ai[], int ai1[])
	{
		return mNestedScrollingChildHelper.dispatchNestedPreScroll(i, j, ai, ai1);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #531 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[])>
	//    7   12:ireturn         
	}

	public boolean dispatchNestedScroll(int i, int j, int k, int l, int ai[])
	{
		return mNestedScrollingChildHelper.dispatchNestedScroll(i, j, k, l, ai);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:aload           5
	//    7   11:invokevirtual   #535 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	protected int getChildDrawingOrder(int i, int j)
	{
		if(mCircleViewIndex < 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field int mCircleViewIndex>
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
	//   11   17:getfield        #151 <Field int mCircleViewIndex>
	//   12   20:ireturn         
		if(j >= mCircleViewIndex)
	//*  13   21:iload_2         
	//*  14   22:aload_0         
	//*  15   23:getfield        #151 <Field int mCircleViewIndex>
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
	//    1    1:getfield        #229 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:invokevirtual   #540 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	public int getProgressCircleDiameter()
	{
		return mCircleDiameter;
	//    0    0:aload_0         
	//    1    1:getfield        #210 <Field int mCircleDiameter>
	//    2    4:ireturn         
	}

	public int getProgressViewEndOffset()
	{
		return mSpinnerOffsetEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field int mSpinnerOffsetEnd>
	//    2    4:ireturn         
	}

	public int getProgressViewStartOffset()
	{
		return mOriginalOffsetTop;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field int mOriginalOffsetTop>
	//    2    4:ireturn         
	}

	public boolean hasNestedScrollingParent()
	{
		return mNestedScrollingChildHelper.hasNestedScrollingParent();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #546 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent()>
	//    3    7:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mNestedScrollingChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #549 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
	//    3    7:ireturn         
	}

	public boolean isRefreshing()
	{
		return mRefreshing;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field boolean mRefreshing>
	//    2    4:ireturn         
	}

	void moveToStart(float f)
	{
		setTargetOffsetTopAndBottom((mFrom + (int)((float)(mOriginalOffsetTop - mFrom) * f)) - mCircleView.getTop());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #268 <Field int mFrom>
	//    3    5:aload_0         
	//    4    6:getfield        #243 <Field int mOriginalOffsetTop>
	//    5    9:aload_0         
	//    6   10:getfield        #268 <Field int mFrom>
	//    7   13:isub            
	//    8   14:i2f             
	//    9   15:fload_1         
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:iadd            
	//   13   19:aload_0         
	//   14   20:getfield        #285 <Field CircleImageView mCircleView>
	//   15   23:invokevirtual   #553 <Method int CircleImageView.getTop()>
	//   16   26:isub            
	//   17   27:invokevirtual   #442 <Method void setTargetOffsetTopAndBottom(int)>
	//   18   30:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #556 <Method void ViewGroup.onDetachedFromWindow()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #557 <Method void reset()>
	//    4    8:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		ensureTarget();
	//    0    0:aload_0         
	//    1    1:invokespecial   #468 <Method void ensureTarget()>
		int i = motionevent.getActionMasked();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #562 <Method int MotionEvent.getActionMasked()>
	//    4    8:istore_2        
		if(mReturningToStart && i == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #564 <Field boolean mReturningToStart>
	//*   7   13:ifeq            25
	//*   8   16:iload_2         
	//*   9   17:ifne            25
			mReturningToStart = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #564 <Field boolean mReturningToStart>
		if(!isEnabled() || mReturningToStart || canChildScrollUp() || mRefreshing || mNestedScrollInProgress)
	//*  13   25:aload_0         
	//*  14   26:invokevirtual   #567 <Method boolean isEnabled()>
	//*  15   29:ifeq            60
	//*  16   32:aload_0         
	//*  17   33:getfield        #564 <Field boolean mReturningToStart>
	//*  18   36:ifne            60
	//*  19   39:aload_0         
	//*  20   40:invokevirtual   #569 <Method boolean canChildScrollUp()>
	//*  21   43:ifne            60
	//*  22   46:aload_0         
	//*  23   47:getfield        #140 <Field boolean mRefreshing>
	//*  24   50:ifne            60
	//*  25   53:aload_0         
	//*  26   54:getfield        #571 <Field boolean mNestedScrollInProgress>
	//*  27   57:ifeq            62
			return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
		switch(i)
	//*  30   62:iload_2         
		{
		case 4: // '\004'
		case 5: // '\005'
		default:
			break;

	//*  31   63:tableswitch     0 6: default 104
	//	               0 107
	//	               1 219
	//	               2 164
	//	               3 219
	//	               4 229
	//	               5 229
	//	               6 211
	//*  32  104:goto            229
		case 0: // '\0'
			setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCircleView.getTop());
	//   33  107:aload_0         
	//   34  108:aload_0         
	//   35  109:getfield        #243 <Field int mOriginalOffsetTop>
	//   36  112:aload_0         
	//   37  113:getfield        #285 <Field CircleImageView mCircleView>
	//   38  116:invokevirtual   #553 <Method int CircleImageView.getTop()>
	//   39  119:isub            
	//   40  120:invokevirtual   #442 <Method void setTargetOffsetTopAndBottom(int)>
			mActivePointerId = motionevent.getPointerId(0);
	//   41  123:aload_0         
	//   42  124:aload_1         
	//   43  125:iconst_0        
	//   44  126:invokevirtual   #453 <Method int MotionEvent.getPointerId(int)>
	//   45  129:putfield        #149 <Field int mActivePointerId>
			mIsBeingDragged = false;
	//   46  132:aload_0         
	//   47  133:iconst_0        
	//   48  134:putfield        #485 <Field boolean mIsBeingDragged>
			int j = motionevent.findPointerIndex(mActivePointerId);
	//   49  137:aload_1         
	//   50  138:aload_0         
	//   51  139:getfield        #149 <Field int mActivePointerId>
	//   52  142:invokevirtual   #574 <Method int MotionEvent.findPointerIndex(int)>
	//   53  145:istore_2        
			if(j < 0)
	//*  54  146:iload_2         
	//*  55  147:ifge            152
				return false;
	//   56  150:iconst_0        
	//   57  151:ireturn         
			mInitialDownY = motionevent.getY(j);
	//   58  152:aload_0         
	//   59  153:aload_1         
	//   60  154:iload_2         
	//   61  155:invokevirtual   #578 <Method float MotionEvent.getY(int)>
	//   62  158:putfield        #483 <Field float mInitialDownY>
			break;
	//   63  161:goto            229

		case 2: // '\002'
			if(mActivePointerId == -1)
	//*  64  164:aload_0         
	//*  65  165:getfield        #149 <Field int mActivePointerId>
	//*  66  168:iconst_m1       
	//*  67  169:icmpne          184
			{
				Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
	//   68  172:getstatic       #128 <Field String LOG_TAG>
	//   69  175:ldc2            #580 <String "Got ACTION_MOVE event but don't have an active pointer id.">
	//   70  178:invokestatic    #586 <Method int Log.e(String, String)>
	//   71  181:pop             
				return false;
	//   72  182:iconst_0        
	//   73  183:ireturn         
			}
			int k = motionevent.findPointerIndex(mActivePointerId);
	//   74  184:aload_1         
	//   75  185:aload_0         
	//   76  186:getfield        #149 <Field int mActivePointerId>
	//   77  189:invokevirtual   #574 <Method int MotionEvent.findPointerIndex(int)>
	//   78  192:istore_2        
			if(k < 0)
	//*  79  193:iload_2         
	//*  80  194:ifge            199
				return false;
	//   81  197:iconst_0        
	//   82  198:ireturn         
			startDragging(motionevent.getY(k));
	//   83  199:aload_0         
	//   84  200:aload_1         
	//   85  201:iload_2         
	//   86  202:invokevirtual   #578 <Method float MotionEvent.getY(int)>
	//   87  205:invokespecial   #588 <Method void startDragging(float)>
			break;

	//*  88  208:goto            229
		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//   89  211:aload_0         
	//   90  212:aload_1         
	//   91  213:invokespecial   #590 <Method void onSecondaryPointerUp(MotionEvent)>
			break;

	//*  92  216:goto            229
		case 1: // '\001'
		case 3: // '\003'
			mIsBeingDragged = false;
	//   93  219:aload_0         
	//   94  220:iconst_0        
	//   95  221:putfield        #485 <Field boolean mIsBeingDragged>
			mActivePointerId = -1;
	//   96  224:aload_0         
	//   97  225:iconst_m1       
	//   98  226:putfield        #149 <Field int mActivePointerId>
			break;
		}
		return mIsBeingDragged;
	//   99  229:aload_0         
	//  100  230:getfield        #485 <Field boolean mIsBeingDragged>
	//  101  233:ireturn         
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
	//*   7   11:invokevirtual   #338 <Method int getChildCount()>
	//*   8   14:ifne            18
			return;
	//    9   17:return          
		if(mTarget == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #335 <Field View mTarget>
	//*  12   22:ifnonnull       29
			ensureTarget();
	//   13   25:aload_0         
	//   14   26:invokespecial   #468 <Method void ensureTarget()>
		if(mTarget == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #335 <Field View mTarget>
	//*  17   33:ifnonnull       37
		{
			return;
	//   18   36:return          
		} else
		{
			View view = mTarget;
	//   19   37:aload_0         
	//   20   38:getfield        #335 <Field View mTarget>
	//   21   41:astore          6
			k = getPaddingLeft();
	//   22   43:aload_0         
	//   23   44:invokevirtual   #601 <Method int getPaddingLeft()>
	//   24   47:istore          4
			l = getPaddingTop();
	//   25   49:aload_0         
	//   26   50:invokevirtual   #604 <Method int getPaddingTop()>
	//   27   53:istore          5
			view.layout(k, l, k + (i - getPaddingLeft() - getPaddingRight()), l + (j - getPaddingTop() - getPaddingBottom()));
	//   28   55:aload           6
	//   29   57:iload           4
	//   30   59:iload           5
	//   31   61:iload           4
	//   32   63:iload_2         
	//   33   64:aload_0         
	//   34   65:invokevirtual   #601 <Method int getPaddingLeft()>
	//   35   68:isub            
	//   36   69:aload_0         
	//   37   70:invokevirtual   #607 <Method int getPaddingRight()>
	//   38   73:isub            
	//   39   74:iadd            
	//   40   75:iload           5
	//   41   77:iload_3         
	//   42   78:aload_0         
	//   43   79:invokevirtual   #604 <Method int getPaddingTop()>
	//   44   82:isub            
	//   45   83:aload_0         
	//   46   84:invokevirtual   #610 <Method int getPaddingBottom()>
	//   47   87:isub            
	//   48   88:iadd            
	//   49   89:invokevirtual   #616 <Method void View.layout(int, int, int, int)>
			j = mCircleView.getMeasuredWidth();
	//   50   92:aload_0         
	//   51   93:getfield        #285 <Field CircleImageView mCircleView>
	//   52   96:invokevirtual   #617 <Method int CircleImageView.getMeasuredWidth()>
	//   53   99:istore_3        
			k = mCircleView.getMeasuredHeight();
	//   54  100:aload_0         
	//   55  101:getfield        #285 <Field CircleImageView mCircleView>
	//   56  104:invokevirtual   #618 <Method int CircleImageView.getMeasuredHeight()>
	//   57  107:istore          4
			mCircleView.layout(i / 2 - j / 2, mCurrentTargetOffsetTop, i / 2 + j / 2, mCurrentTargetOffsetTop + k);
	//   58  109:aload_0         
	//   59  110:getfield        #285 <Field CircleImageView mCircleView>
	//   60  113:iload_2         
	//   61  114:iconst_2        
	//   62  115:idiv            
	//   63  116:iload_3         
	//   64  117:iconst_2        
	//   65  118:idiv            
	//   66  119:isub            
	//   67  120:aload_0         
	//   68  121:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   69  124:iload_2         
	//   70  125:iconst_2        
	//   71  126:idiv            
	//   72  127:iload_3         
	//   73  128:iconst_2        
	//   74  129:idiv            
	//   75  130:iadd            
	//   76  131:aload_0         
	//   77  132:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   78  135:iload           4
	//   79  137:iadd            
	//   80  138:invokevirtual   #619 <Method void CircleImageView.layout(int, int, int, int)>
			return;
	//   81  141:return          
		}
	}

	public void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #623 <Method void ViewGroup.onMeasure(int, int)>
		if(mTarget == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #335 <Field View mTarget>
	//*   6   10:ifnonnull       17
			ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #468 <Method void ensureTarget()>
		if(mTarget == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #335 <Field View mTarget>
	//*  11   21:ifnonnull       25
			return;
	//   12   24:return          
		mTarget.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   13   25:aload_0         
	//   14   26:getfield        #335 <Field View mTarget>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #595 <Method int getMeasuredWidth()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #601 <Method int getPaddingLeft()>
	//   19   37:isub            
	//   20   38:aload_0         
	//   21   39:invokevirtual   #607 <Method int getPaddingRight()>
	//   22   42:isub            
	//   23   43:ldc2            #624 <Int 0x40000000>
	//   24   46:invokestatic    #629 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #598 <Method int getMeasuredHeight()>
	//   27   53:aload_0         
	//   28   54:invokevirtual   #604 <Method int getPaddingTop()>
	//   29   57:isub            
	//   30   58:aload_0         
	//   31   59:invokevirtual   #610 <Method int getPaddingBottom()>
	//   32   62:isub            
	//   33   63:ldc2            #624 <Int 0x40000000>
	//   34   66:invokestatic    #629 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   35   69:invokevirtual   #632 <Method void View.measure(int, int)>
		mCircleView.measure(android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000));
	//   36   72:aload_0         
	//   37   73:getfield        #285 <Field CircleImageView mCircleView>
	//   38   76:aload_0         
	//   39   77:getfield        #210 <Field int mCircleDiameter>
	//   40   80:ldc2            #624 <Int 0x40000000>
	//   41   83:invokestatic    #629 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   42   86:aload_0         
	//   43   87:getfield        #210 <Field int mCircleDiameter>
	//   44   90:ldc2            #624 <Int 0x40000000>
	//   45   93:invokestatic    #629 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   46   96:invokevirtual   #633 <Method void CircleImageView.measure(int, int)>
		mCircleViewIndex = -1;
	//   47   99:aload_0         
	//   48  100:iconst_m1       
	//   49  101:putfield        #151 <Field int mCircleViewIndex>
		for(i = 0; i < getChildCount(); i++)
	//*  50  104:iconst_0        
	//*  51  105:istore_1        
	//*  52  106:iload_1         
	//*  53  107:aload_0         
	//*  54  108:invokevirtual   #338 <Method int getChildCount()>
	//*  55  111:icmpge          139
			if(getChildAt(i) == mCircleView)
	//*  56  114:aload_0         
	//*  57  115:iload_1         
	//*  58  116:invokevirtual   #342 <Method View getChildAt(int)>
	//*  59  119:aload_0         
	//*  60  120:getfield        #285 <Field CircleImageView mCircleView>
	//*  61  123:if_acmpne       132
			{
				mCircleViewIndex = i;
	//   62  126:aload_0         
	//   63  127:iload_1         
	//   64  128:putfield        #151 <Field int mCircleViewIndex>
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
	//    4    5:invokevirtual   #636 <Method boolean dispatchNestedFling(float, float, boolean)>
	//    5    8:ireturn         
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		return dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #639 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		if(j > 0 && mTotalUnconsumed > 0.0F)
	//*   0    0:iload_3         
	//*   1    1:ifle            66
	//*   2    4:aload_0         
	//*   3    5:getfield        #643 <Field float mTotalUnconsumed>
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifle            66
		{
			if((float)j > mTotalUnconsumed)
	//*   7   13:iload_3         
	//*   8   14:i2f             
	//*   9   15:aload_0         
	//*  10   16:getfield        #643 <Field float mTotalUnconsumed>
	//*  11   19:fcmpl           
	//*  12   20:ifle            42
			{
				ai[1] = j - (int)mTotalUnconsumed;
	//   13   23:aload           4
	//   14   25:iconst_1        
	//   15   26:iload_3         
	//   16   27:aload_0         
	//   17   28:getfield        #643 <Field float mTotalUnconsumed>
	//   18   31:f2i             
	//   19   32:isub            
	//   20   33:iastore         
				mTotalUnconsumed = 0.0F;
	//   21   34:aload_0         
	//   22   35:fconst_0        
	//   23   36:putfield        #643 <Field float mTotalUnconsumed>
			} else
	//*  24   39:goto            58
			{
				mTotalUnconsumed = mTotalUnconsumed - (float)j;
	//   25   42:aload_0         
	//   26   43:aload_0         
	//   27   44:getfield        #643 <Field float mTotalUnconsumed>
	//   28   47:iload_3         
	//   29   48:i2f             
	//   30   49:fsub            
	//   31   50:putfield        #643 <Field float mTotalUnconsumed>
				ai[1] = j;
	//   32   53:aload           4
	//   33   55:iconst_1        
	//   34   56:iload_3         
	//   35   57:iastore         
			}
			moveSpinner(mTotalUnconsumed);
	//   36   58:aload_0         
	//   37   59:aload_0         
	//   38   60:getfield        #643 <Field float mTotalUnconsumed>
	//   39   63:invokespecial   #645 <Method void moveSpinner(float)>
		}
		if(mUsingCustomStart && j > 0 && mTotalUnconsumed == 0.0F && Math.abs(j - ai[1]) > 0)
	//*  40   66:aload_0         
	//*  41   67:getfield        #396 <Field boolean mUsingCustomStart>
	//*  42   70:ifeq            107
	//*  43   73:iload_3         
	//*  44   74:ifle            107
	//*  45   77:aload_0         
	//*  46   78:getfield        #643 <Field float mTotalUnconsumed>
	//*  47   81:fconst_0        
	//*  48   82:fcmpl           
	//*  49   83:ifne            107
	//*  50   86:iload_3         
	//*  51   87:aload           4
	//*  52   89:iconst_1        
	//*  53   90:iaload          
	//*  54   91:isub            
	//*  55   92:invokestatic    #647 <Method int Math.abs(int)>
	//*  56   95:ifle            107
			mCircleView.setVisibility(8);
	//   57   98:aload_0         
	//   58   99:getfield        #285 <Field CircleImageView mCircleView>
	//   59  102:bipush          8
	//   60  104:invokevirtual   #329 <Method void CircleImageView.setVisibility(int)>
		view = ((View) (mParentScrollConsumed));
	//   61  107:aload_0         
	//   62  108:getfield        #145 <Field int[] mParentScrollConsumed>
	//   63  111:astore_1        
		if(dispatchNestedPreScroll(i - ai[0], j - ai[1], ((int []) (view)), ((int []) (null))))
	//*  64  112:aload_0         
	//*  65  113:iload_2         
	//*  66  114:aload           4
	//*  67  116:iconst_0        
	//*  68  117:iaload          
	//*  69  118:isub            
	//*  70  119:iload_3         
	//*  71  120:aload           4
	//*  72  122:iconst_1        
	//*  73  123:iaload          
	//*  74  124:isub            
	//*  75  125:aload_1         
	//*  76  126:aconst_null     
	//*  77  127:invokevirtual   #648 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//*  78  130:ifeq            157
		{
			ai[0] = ai[0] + view[0];
	//   79  133:aload           4
	//   80  135:iconst_0        
	//   81  136:aload           4
	//   82  138:iconst_0        
	//   83  139:iaload          
	//   84  140:aload_1         
	//   85  141:iconst_0        
	//   86  142:iaload          
	//   87  143:iadd            
	//   88  144:iastore         
			ai[1] = ai[1] + view[1];
	//   89  145:aload           4
	//   90  147:iconst_1        
	//   91  148:aload           4
	//   92  150:iconst_1        
	//   93  151:iaload          
	//   94  152:aload_1         
	//   95  153:iconst_1        
	//   96  154:iaload          
	//   97  155:iadd            
	//   98  156:iastore         
		}
	//   99  157:return          
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
	//    6    8:getfield        #147 <Field int[] mParentOffsetInWindow>
	//    7   11:invokevirtual   #651 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:pop             
		i = l + mParentOffsetInWindow[1];
	//    9   15:iload           5
	//   10   17:aload_0         
	//   11   18:getfield        #147 <Field int[] mParentOffsetInWindow>
	//   12   21:iconst_1        
	//   13   22:iaload          
	//   14   23:iadd            
	//   15   24:istore_2        
		if(i < 0 && !canChildScrollUp())
	//*  16   25:iload_2         
	//*  17   26:ifge            58
	//*  18   29:aload_0         
	//*  19   30:invokevirtual   #569 <Method boolean canChildScrollUp()>
	//*  20   33:ifne            58
		{
			mTotalUnconsumed = mTotalUnconsumed + (float)Math.abs(i);
	//   21   36:aload_0         
	//   22   37:aload_0         
	//   23   38:getfield        #643 <Field float mTotalUnconsumed>
	//   24   41:iload_2         
	//   25   42:invokestatic    #647 <Method int Math.abs(int)>
	//   26   45:i2f             
	//   27   46:fadd            
	//   28   47:putfield        #643 <Field float mTotalUnconsumed>
			moveSpinner(mTotalUnconsumed);
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #643 <Field float mTotalUnconsumed>
	//   32   55:invokespecial   #645 <Method void moveSpinner(float)>
		}
	//   33   58:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mNestedScrollingParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #655 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		startNestedScroll(i & 2);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:iconst_2        
	//    9   13:iand            
	//   10   14:invokevirtual   #659 <Method boolean startNestedScroll(int)>
	//   11   17:pop             
		mTotalUnconsumed = 0.0F;
	//   12   18:aload_0         
	//   13   19:fconst_0        
	//   14   20:putfield        #643 <Field float mTotalUnconsumed>
		mNestedScrollInProgress = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #571 <Field boolean mNestedScrollInProgress>
	//   18   28:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		return isEnabled() && !mReturningToStart && !mRefreshing && (i & 2) != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #567 <Method boolean isEnabled()>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #564 <Field boolean mReturningToStart>
	//    5   11:ifne            29
	//    6   14:aload_0         
	//    7   15:getfield        #140 <Field boolean mRefreshing>
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
	//    1    1:getfield        #229 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #664 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		mNestedScrollInProgress = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #571 <Field boolean mNestedScrollInProgress>
		if(mTotalUnconsumed > 0.0F)
	//*   7   13:aload_0         
	//*   8   14:getfield        #643 <Field float mTotalUnconsumed>
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifle            35
		{
			finishSpinner(mTotalUnconsumed);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #643 <Field float mTotalUnconsumed>
	//   15   27:invokespecial   #666 <Method void finishSpinner(float)>
			mTotalUnconsumed = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #643 <Field float mTotalUnconsumed>
		}
		stopNestedScroll();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #669 <Method void stopNestedScroll()>
	//   21   39:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #562 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(mReturningToStart && i == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #564 <Field boolean mReturningToStart>
	//*   5   10:ifeq            23
	//*   6   13:iload           4
	//*   7   15:ifne            23
			mReturningToStart = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #564 <Field boolean mReturningToStart>
		if(!isEnabled() || mReturningToStart || canChildScrollUp() || mRefreshing || mNestedScrollInProgress)
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #567 <Method boolean isEnabled()>
	//*  13   27:ifeq            58
	//*  14   30:aload_0         
	//*  15   31:getfield        #564 <Field boolean mReturningToStart>
	//*  16   34:ifne            58
	//*  17   37:aload_0         
	//*  18   38:invokevirtual   #569 <Method boolean canChildScrollUp()>
	//*  19   41:ifne            58
	//*  20   44:aload_0         
	//*  21   45:getfield        #140 <Field boolean mRefreshing>
	//*  22   48:ifne            58
	//*  23   51:aload_0         
	//*  24   52:getfield        #571 <Field boolean mNestedScrollInProgress>
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
	//	               0 107
	//	               1 243
	//	               2 124
	//	               3 311
	//	               4 313
	//	               5 199
	//	               6 235
	//*  30  104:goto            313
		case 0: // '\0'
			mActivePointerId = motionevent.getPointerId(0);
	//   31  107:aload_0         
	//   32  108:aload_1         
	//   33  109:iconst_0        
	//   34  110:invokevirtual   #453 <Method int MotionEvent.getPointerId(int)>
	//   35  113:putfield        #149 <Field int mActivePointerId>
			mIsBeingDragged = false;
	//   36  116:aload_0         
	//   37  117:iconst_0        
	//   38  118:putfield        #485 <Field boolean mIsBeingDragged>
			break;
	//   39  121:goto            313

		case 2: // '\002'
			int j = motionevent.findPointerIndex(mActivePointerId);
	//   40  124:aload_1         
	//   41  125:aload_0         
	//   42  126:getfield        #149 <Field int mActivePointerId>
	//   43  129:invokevirtual   #574 <Method int MotionEvent.findPointerIndex(int)>
	//   44  132:istore          4
			if(j < 0)
	//*  45  134:iload           4
	//*  46  136:ifge            151
			{
				Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
	//   47  139:getstatic       #128 <Field String LOG_TAG>
	//   48  142:ldc2            #672 <String "Got ACTION_MOVE event but have an invalid active pointer id.">
	//   49  145:invokestatic    #586 <Method int Log.e(String, String)>
	//   50  148:pop             
				return false;
	//   51  149:iconst_0        
	//   52  150:ireturn         
			}
			float f = motionevent.getY(j);
	//   53  151:aload_1         
	//   54  152:iload           4
	//   55  154:invokevirtual   #578 <Method float MotionEvent.getY(int)>
	//   56  157:fstore_2        
			startDragging(f);
	//   57  158:aload_0         
	//   58  159:fload_2         
	//   59  160:invokespecial   #588 <Method void startDragging(float)>
			if(!mIsBeingDragged)
				break;
	//   60  163:aload_0         
	//   61  164:getfield        #485 <Field boolean mIsBeingDragged>
	//   62  167:ifeq            313
			f = (f - mInitialMotionY) * 0.5F;
	//   63  170:fload_2         
	//   64  171:aload_0         
	//   65  172:getfield        #487 <Field float mInitialMotionY>
	//   66  175:fsub            
	//   67  176:ldc1            #52  <Float 0.5F>
	//   68  178:fmul            
	//   69  179:fstore_2        
			if(f > 0.0F)
	//*  70  180:fload_2         
	//*  71  181:fconst_0        
	//*  72  182:fcmpl           
	//*  73  183:ifle            194
				moveSpinner(f);
	//   74  186:aload_0         
	//   75  187:fload_2         
	//   76  188:invokespecial   #645 <Method void moveSpinner(float)>
			else
	//*  77  191:goto            196
				return false;
	//   78  194:iconst_0        
	//   79  195:ireturn         
			break;
	//   80  196:goto            313

		case 5: // '\005'
			int k = motionevent.getActionIndex();
	//   81  199:aload_1         
	//   82  200:invokevirtual   #450 <Method int MotionEvent.getActionIndex()>
	//   83  203:istore          4
			if(k < 0)
	//*  84  205:iload           4
	//*  85  207:ifge            222
			{
				Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
	//   86  210:getstatic       #128 <Field String LOG_TAG>
	//   87  213:ldc2            #674 <String "Got ACTION_POINTER_DOWN event but have an invalid action index.">
	//   88  216:invokestatic    #586 <Method int Log.e(String, String)>
	//   89  219:pop             
				return false;
	//   90  220:iconst_0        
	//   91  221:ireturn         
			}
			mActivePointerId = motionevent.getPointerId(k);
	//   92  222:aload_0         
	//   93  223:aload_1         
	//   94  224:iload           4
	//   95  226:invokevirtual   #453 <Method int MotionEvent.getPointerId(int)>
	//   96  229:putfield        #149 <Field int mActivePointerId>
			break;
	//   97  232:goto            313

		case 6: // '\006'
			onSecondaryPointerUp(motionevent);
	//   98  235:aload_0         
	//   99  236:aload_1         
	//  100  237:invokespecial   #590 <Method void onSecondaryPointerUp(MotionEvent)>
			break;
	//  101  240:goto            313

		case 1: // '\001'
			int l = motionevent.findPointerIndex(mActivePointerId);
	//  102  243:aload_1         
	//  103  244:aload_0         
	//  104  245:getfield        #149 <Field int mActivePointerId>
	//  105  248:invokevirtual   #574 <Method int MotionEvent.findPointerIndex(int)>
	//  106  251:istore          4
			if(l < 0)
	//* 107  253:iload           4
	//* 108  255:ifge            270
			{
				Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
	//  109  258:getstatic       #128 <Field String LOG_TAG>
	//  110  261:ldc2            #676 <String "Got ACTION_UP event but don't have an active pointer id.">
	//  111  264:invokestatic    #586 <Method int Log.e(String, String)>
	//  112  267:pop             
				return false;
	//  113  268:iconst_0        
	//  114  269:ireturn         
			}
			if(mIsBeingDragged)
	//* 115  270:aload_0         
	//* 116  271:getfield        #485 <Field boolean mIsBeingDragged>
	//* 117  274:ifeq            304
			{
				float f1 = motionevent.getY(l);
	//  118  277:aload_1         
	//  119  278:iload           4
	//  120  280:invokevirtual   #578 <Method float MotionEvent.getY(int)>
	//  121  283:fstore_2        
				float f2 = mInitialMotionY;
	//  122  284:aload_0         
	//  123  285:getfield        #487 <Field float mInitialMotionY>
	//  124  288:fstore_3        
				mIsBeingDragged = false;
	//  125  289:aload_0         
	//  126  290:iconst_0        
	//  127  291:putfield        #485 <Field boolean mIsBeingDragged>
				finishSpinner((f1 - f2) * 0.5F);
	//  128  294:aload_0         
	//  129  295:fload_2         
	//  130  296:fload_3         
	//  131  297:fsub            
	//  132  298:ldc1            #52  <Float 0.5F>
	//  133  300:fmul            
	//  134  301:invokespecial   #666 <Method void finishSpinner(float)>
			}
			mActivePointerId = -1;
	//  135  304:aload_0         
	//  136  305:iconst_m1       
	//  137  306:putfield        #149 <Field int mActivePointerId>
			return false;
	//  138  309:iconst_0        
	//  139  310:ireturn         

		case 3: // '\003'
			return false;
	//  140  311:iconst_0        
	//  141  312:ireturn         
		}
		return true;
	//  142  313:iconst_1        
	//  143  314:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21 || !(mTarget instanceof AbsListView))
	//*   0    0:getstatic       #506 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          18
	//*   3    8:aload_0         
	//*   4    9:getfield        #335 <Field View mTarget>
	//*   5   12:instanceof      #679 <Class AbsListView>
	//*   6   15:ifne            41
		{
			if(mTarget != null && !ViewCompat.isNestedScrollingEnabled(mTarget))
	//*   7   18:aload_0         
	//*   8   19:getfield        #335 <Field View mTarget>
	//*   9   22:ifnull          36
	//*  10   25:aload_0         
	//*  11   26:getfield        #335 <Field View mTarget>
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
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mProgress.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    5   11:invokevirtual   #687 <Method void MaterialProgressDrawable.stop()>
		mCircleView.setVisibility(8);
	//    6   14:aload_0         
	//    7   15:getfield        #285 <Field CircleImageView mCircleView>
	//    8   18:bipush          8
	//    9   20:invokevirtual   #329 <Method void CircleImageView.setVisibility(int)>
		setColorViewAlpha(255);
	//   10   23:aload_0         
	//   11   24:sipush          255
	//   12   27:invokespecial   #689 <Method void setColorViewAlpha(int)>
		if(mScale)
	//*  13   30:aload_0         
	//*  14   31:getfield        #301 <Field boolean mScale>
	//*  15   34:ifeq            45
			setAnimationProgress(0.0F);
	//   16   37:aload_0         
	//   17   38:fconst_0        
	//   18   39:invokevirtual   #416 <Method void setAnimationProgress(float)>
		else
	//*  19   42:goto            58
			setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCurrentTargetOffsetTop);
	//   20   45:aload_0         
	//   21   46:aload_0         
	//   22   47:getfield        #243 <Field int mOriginalOffsetTop>
	//   23   50:aload_0         
	//   24   51:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   25   54:isub            
	//   26   55:invokevirtual   #442 <Method void setTargetOffsetTopAndBottom(int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//   27   58:aload_0         
	//   28   59:aload_0         
	//   29   60:getfield        #285 <Field CircleImageView mCircleView>
	//   30   63:invokevirtual   #553 <Method int CircleImageView.getTop()>
	//   31   66:putfield        #241 <Field int mCurrentTargetOffsetTop>
	//   32   69:return          
	}

	void setAnimationProgress(float f)
	{
		mCircleView.setScaleX(f);
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #410 <Method void CircleImageView.setScaleX(float)>
		mCircleView.setScaleY(f);
	//    4    8:aload_0         
	//    5    9:getfield        #285 <Field CircleImageView mCircleView>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #413 <Method void CircleImageView.setScaleY(float)>
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
	//    1    1:invokespecial   #468 <Method void ensureTarget()>
		mProgress.setColorSchemeColors(ai);
	//    2    4:aload_0         
	//    3    5:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #701 <Method void MaterialProgressDrawable.setColorSchemeColors(int[])>
	//    6   12:return          
	}

	public transient void setColorSchemeResources(int ai[])
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #308 <Method Context getContext()>
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
	//   19   26:invokestatic    #708 <Method int ContextCompat.getColor(Context, int)>
	//   20   29:iastore         

	//   21   30:iload_2         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_2        
	//*  25   34:goto            13
		setColorSchemeColors(ai1);
	//   26   37:aload_0         
	//   27   38:aload           4
	//   28   40:invokevirtual   #709 <Method void setColorSchemeColors(int[])>
	//   29   43:return          
	}

	public void setDistanceToTriggerSync(int i)
	{
		mTotalDragDistance = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2f             
	//    3    3:putfield        #143 <Field float mTotalDragDistance>
	//    4    6:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #711 <Method void ViewGroup.setEnabled(boolean)>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #557 <Method void reset()>
	//    7   13:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mNestedScrollingChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #712 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnChildScrollUpCallback(OnChildScrollUpCallback onchildscrollupcallback)
	{
		mChildScrollUpCallback = onchildscrollupcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #512 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//    3    5:return          
	}

	public void setOnRefreshListener(OnRefreshListener onrefreshlistener)
	{
		mListener = onrefreshlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #719 <Field SwipeRefreshLayout$OnRefreshListener mListener>
	//    3    5:return          
	}

	public void setProgressBackgroundColor(int i)
	{
		setProgressBackgroundColorSchemeResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #723 <Method void setProgressBackgroundColorSchemeResource(int)>
	//    3    5:return          
	}

	public void setProgressBackgroundColorSchemeColor(int i)
	{
		mCircleView.setBackgroundColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #725 <Method void CircleImageView.setBackgroundColor(int)>
		mProgress.setBackgroundColor(i);
	//    4    8:aload_0         
	//    5    9:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//    6   12:iload_1         
	//    7   13:invokevirtual   #322 <Method void MaterialProgressDrawable.setBackgroundColor(int)>
	//    8   16:return          
	}

	public void setProgressBackgroundColorSchemeResource(int i)
	{
		setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #308 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #708 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #727 <Method void setProgressBackgroundColorSchemeColor(int)>
	//    6   12:return          
	}

	public void setProgressViewEndTarget(boolean flag, int i)
	{
		mSpinnerOffsetEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #222 <Field int mSpinnerOffsetEnd>
		mScale = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #301 <Field boolean mScale>
		mCircleView.invalidate();
	//    6   10:aload_0         
	//    7   11:getfield        #285 <Field CircleImageView mCircleView>
	//    8   14:invokevirtual   #732 <Method void CircleImageView.invalidate()>
	//    9   17:return          
	}

	public void setProgressViewOffset(boolean flag, int i, int j)
	{
		mScale = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #301 <Field boolean mScale>
		mOriginalOffsetTop = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #243 <Field int mOriginalOffsetTop>
		mSpinnerOffsetEnd = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #222 <Field int mSpinnerOffsetEnd>
		mUsingCustomStart = true;
	//    9   15:aload_0         
	//   10   16:iconst_1        
	//   11   17:putfield        #396 <Field boolean mUsingCustomStart>
		reset();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #557 <Method void reset()>
		mRefreshing = false;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #140 <Field boolean mRefreshing>
	//   17   29:return          
	}

	public void setRefreshing(boolean flag)
	{
		if(flag && mRefreshing != flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            66
	//*   2    4:aload_0         
	//*   3    5:getfield        #140 <Field boolean mRefreshing>
	//*   4    8:iload_1         
	//*   5    9:icmpeq          66
		{
			mRefreshing = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #140 <Field boolean mRefreshing>
			int i;
			if(!mUsingCustomStart)
	//*   9   17:aload_0         
	//*  10   18:getfield        #396 <Field boolean mUsingCustomStart>
	//*  11   21:ifne            37
				i = mSpinnerOffsetEnd + mOriginalOffsetTop;
	//   12   24:aload_0         
	//   13   25:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   14   28:aload_0         
	//   15   29:getfield        #243 <Field int mOriginalOffsetTop>
	//   16   32:iadd            
	//   17   33:istore_2        
			else
	//*  18   34:goto            42
				i = mSpinnerOffsetEnd;
	//   19   37:aload_0         
	//   20   38:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   21   41:istore_2        
			setTargetOffsetTopAndBottom(i - mCurrentTargetOffsetTop);
	//   22   42:aload_0         
	//   23   43:iload_2         
	//   24   44:aload_0         
	//   25   45:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   26   48:isub            
	//   27   49:invokevirtual   #442 <Method void setTargetOffsetTopAndBottom(int)>
			mNotify = false;
	//   28   52:aload_0         
	//   29   53:iconst_0        
	//   30   54:putfield        #466 <Field boolean mNotify>
			startScaleUpAnimation(mRefreshListener);
	//   31   57:aload_0         
	//   32   58:aload_0         
	//   33   59:getfield        #156 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   34   62:invokespecial   #736 <Method void startScaleUpAnimation(android.view.animation.Animation$AnimationListener)>
			return;
	//   35   65:return          
		} else
		{
			setRefreshing(flag, false);
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:iconst_0        
	//   39   69:invokespecial   #353 <Method void setRefreshing(boolean, boolean)>
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
	//    7   11:invokevirtual   #178 <Method Resources getResources()>
	//    8   14:invokevirtual   #202 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    9   17:astore_2        
		if(i == 0)
	//*  10   18:iload_1         
	//*  11   19:ifne            38
			mCircleDiameter = (int)(displaymetrics.density * 56F);
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:getfield        #207 <Field float DisplayMetrics.density>
	//   15   27:ldc2            #738 <Float 56F>
	//   16   30:fmul            
	//   17   31:f2i             
	//   18   32:putfield        #210 <Field int mCircleDiameter>
		else
	//*  19   35:goto            50
			mCircleDiameter = (int)(displaymetrics.density * 40F);
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:getfield        #207 <Field float DisplayMetrics.density>
	//   23   43:ldc1            #208 <Float 40F>
	//   24   45:fmul            
	//   25   46:f2i             
	//   26   47:putfield        #210 <Field int mCircleDiameter>
		mCircleView.setImageDrawable(((Drawable) (null)));
	//   27   50:aload_0         
	//   28   51:getfield        #285 <Field CircleImageView mCircleView>
	//   29   54:aconst_null     
	//   30   55:invokevirtual   #326 <Method void CircleImageView.setImageDrawable(Drawable)>
		mProgress.updateSizes(i);
	//   31   58:aload_0         
	//   32   59:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//   33   62:iload_1         
	//   34   63:invokevirtual   #741 <Method void MaterialProgressDrawable.updateSizes(int)>
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//   35   66:aload_0         
	//   36   67:getfield        #285 <Field CircleImageView mCircleView>
	//   37   70:aload_0         
	//   38   71:getfield        #318 <Field MaterialProgressDrawable mProgress>
	//   39   74:invokevirtual   #326 <Method void CircleImageView.setImageDrawable(Drawable)>
	//   40   77:return          
	}

	void setTargetOffsetTopAndBottom(int i)
	{
		mCircleView.bringToFront();
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #744 <Method void CircleImageView.bringToFront()>
		ViewCompat.offsetTopAndBottom(((View) (mCircleView)), i);
	//    3    7:aload_0         
	//    4    8:getfield        #285 <Field CircleImageView mCircleView>
	//    5   11:iload_1         
	//    6   12:invokestatic    #748 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #285 <Field CircleImageView mCircleView>
	//   10   20:invokevirtual   #553 <Method int CircleImageView.getTop()>
	//   11   23:putfield        #241 <Field int mCurrentTargetOffsetTop>
	//   12   26:return          
	}

	public boolean startNestedScroll(int i)
	{
		return mNestedScrollingChildHelper.startNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #749 <Method boolean NestedScrollingChildHelper.startNestedScroll(int)>
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
	//    4    6:invokespecial   #750 <Method void SwipeRefreshLayout$3(SwipeRefreshLayout)>
	//    5    9:putfield        #752 <Field Animation mScaleDownAnimation>
		mScaleDownAnimation.setDuration(150L);
	//    6   12:aload_0         
	//    7   13:getfield        #752 <Field Animation mScaleDownAnimation>
	//    8   16:ldc2w           #499 <Long 150L>
	//    9   19:invokevirtual   #279 <Method void Animation.setDuration(long)>
		mCircleView.setAnimationListener(animationlistener);
	//   10   22:aload_0         
	//   11   23:getfield        #285 <Field CircleImageView mCircleView>
	//   12   26:aload_1         
	//   13   27:invokevirtual   #291 <Method void CircleImageView.setAnimationListener(android.view.animation.Animation$AnimationListener)>
		mCircleView.clearAnimation();
	//   14   30:aload_0         
	//   15   31:getfield        #285 <Field CircleImageView mCircleView>
	//   16   34:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mCircleView.startAnimation(mScaleDownAnimation);
	//   17   37:aload_0         
	//   18   38:getfield        #285 <Field CircleImageView mCircleView>
	//   19   41:aload_0         
	//   20   42:getfield        #752 <Field Animation mScaleDownAnimation>
	//   21   45:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   22   48:return          
	}

	public void stopNestedScroll()
	{
		mNestedScrollingChildHelper.stopNestedScroll();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #753 <Method void NestedScrollingChildHelper.stopNestedScroll()>
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
	private static final String LOG_TAG = ((Class) (android/support/v4/widget/SwipeRefreshLayout)).getSimpleName();
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
	MaterialProgressDrawable mProgress;
	private android.view.animation.Animation.AnimationListener mRefreshListener = new android.view.animation.Animation.AnimationListener() {

		public void onAnimationEnd(Animation animation)
		{
			if(mRefreshing)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field SwipeRefreshLayout this$0>
		//*   2    4:getfield        #27  <Field boolean SwipeRefreshLayout.mRefreshing>
		//*   3    7:ifeq            83
			{
				mProgress.setAlpha(255);
		//    4   10:aload_0         
		//    5   11:getfield        #14  <Field SwipeRefreshLayout this$0>
		//    6   14:getfield        #31  <Field MaterialProgressDrawable SwipeRefreshLayout.mProgress>
		//    7   17:sipush          255
		//    8   20:invokevirtual   #37  <Method void MaterialProgressDrawable.setAlpha(int)>
				mProgress.start();
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   11   27:getfield        #31  <Field MaterialProgressDrawable SwipeRefreshLayout.mProgress>
		//   12   30:invokevirtual   #40  <Method void MaterialProgressDrawable.start()>
				if(mNotify && mListener != null)
		//*  13   33:aload_0         
		//*  14   34:getfield        #14  <Field SwipeRefreshLayout this$0>
		//*  15   37:getfield        #43  <Field boolean SwipeRefreshLayout.mNotify>
		//*  16   40:ifeq            65
		//*  17   43:aload_0         
		//*  18   44:getfield        #14  <Field SwipeRefreshLayout this$0>
		//*  19   47:getfield        #47  <Field SwipeRefreshLayout$OnRefreshListener SwipeRefreshLayout.mListener>
		//*  20   50:ifnull          65
					mListener.onRefresh();
		//   21   53:aload_0         
		//   22   54:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   23   57:getfield        #47  <Field SwipeRefreshLayout$OnRefreshListener SwipeRefreshLayout.mListener>
		//   24   60:invokeinterface #52  <Method void SwipeRefreshLayout$OnRefreshListener.onRefresh()>
				mCurrentTargetOffsetTop = mCircleView.getTop();
		//   25   65:aload_0         
		//   26   66:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   27   69:aload_0         
		//   28   70:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   29   73:getfield        #56  <Field CircleImageView SwipeRefreshLayout.mCircleView>
		//   30   76:invokevirtual   #62  <Method int CircleImageView.getTop()>
		//   31   79:putfield        #66  <Field int SwipeRefreshLayout.mCurrentTargetOffsetTop>
				return;
		//   32   82:return          
			} else
			{
				reset();
		//   33   83:aload_0         
		//   34   84:getfield        #14  <Field SwipeRefreshLayout this$0>
		//   35   87:invokevirtual   #69  <Method void SwipeRefreshLayout.reset()>
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
	//    0    0:ldc1            #2   <Class SwipeRefreshLayout>
	//    1    2:invokevirtual   #126 <Method String Class.getSimpleName()>
	//    2    5:putstatic       #128 <Field String LOG_TAG>
	//    3    8:iconst_1        
	//    4    9:newarray        int[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #129 <Int 0x101000e>
	//    8   15:iastore         
	//    9   16:putstatic       #131 <Field int[] LAYOUT_ATTRS>
	//*  10   19:return          
	}
}
