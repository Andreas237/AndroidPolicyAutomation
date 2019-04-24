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
				int k;
				int l;
				if(!mUsingCustomStart)
			//*   0    0:aload_0         
			//*   1    1:getfield        #12  <Field SwipeRefreshLayout this$0>
			//*   2    4:getfield        #22  <Field boolean SwipeRefreshLayout.mUsingCustomStart>
			//*   3    7:ifne            92
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
			//*  13   29:aload_0         
			//*  14   30:getfield        #12  <Field SwipeRefreshLayout this$0>
			//*  15   33:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
			//*  16   36:istore          4
			//*  17   38:iload_3         
			//*  18   39:aload_0         
			//*  19   40:getfield        #12  <Field SwipeRefreshLayout this$0>
			//*  20   43:getfield        #38  <Field int SwipeRefreshLayout.mFrom>
			//*  21   46:isub            
			//*  22   47:i2f             
			//*  23   48:fload_1         
			//*  24   49:fmul            
			//*  25   50:f2i             
			//*  26   51:istore_3        
			//*  27   52:aload_0         
			//*  28   53:getfield        #12  <Field SwipeRefreshLayout this$0>
			//*  29   56:getfield        #42  <Field CircleImageView SwipeRefreshLayout.mCircleView>
			//*  30   59:invokevirtual   #48  <Method int CircleImageView.getTop()>
			//*  31   62:istore          5
			//*  32   64:aload_0         
			//*  33   65:getfield        #12  <Field SwipeRefreshLayout this$0>
			//*  34   68:iload           4
			//*  35   70:iload_3         
			//*  36   71:iadd            
			//*  37   72:iload           5
			//*  38   74:isub            
			//*  39   75:invokevirtual   #52  <Method void SwipeRefreshLayout.setTargetOffsetTopAndBottom(int)>
			//*  40   78:aload_0         
			//*  41   79:getfield        #12  <Field SwipeRefreshLayout this$0>
			//*  42   82:getfield        #56  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
			//*  43   85:fconst_1        
			//*  44   86:fload_1         
			//*  45   87:fsub            
			//*  46   88:invokevirtual   #62  <Method void CircularProgressDrawable.setArrowScale(float)>
			//*  47   91:return          
					j = mSpinnerOffsetEnd;
			//   48   92:aload_0         
			//   49   93:getfield        #12  <Field SwipeRefreshLayout this$0>
			//   50   96:getfield        #26  <Field int SwipeRefreshLayout.mSpinnerOffsetEnd>
			//   51   99:istore_3        
				k = mFrom;
				j = (int)((float)(j - mFrom) * f);
				l = mCircleView.getTop();
				setTargetOffsetTopAndBottom((k + j) - l);
				mProgress.setArrowScale(1.0F - f);
			//*  52  100:goto            29
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
		mCircleDiameter = (int)(40F * displaymetrics.density);
	//   66  127:aload_0         
	//   67  128:ldc1            #203 <Float 40F>
	//   68  130:aload           4
	//   69  132:getfield        #208 <Field float DisplayMetrics.density>
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
		mSpinnerOffsetEnd = (int)(64F * displaymetrics.density);
	//   78  149:aload_0         
	//   79  150:ldc1            #220 <Float 64F>
	//   80  152:aload           4
	//   81  154:getfield        #208 <Field float DisplayMetrics.density>
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
		mProgress = new CircularProgressDrawable(getContext());
	//    8   17:aload_0         
	//    9   18:new             #313 <Class CircularProgressDrawable>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:invokevirtual   #308 <Method Context getContext()>
	//   13   26:invokespecial   #315 <Method void CircularProgressDrawable(Context)>
	//   14   29:putfield        #317 <Field CircularProgressDrawable mProgress>
		mProgress.setStyle(1);
	//   15   32:aload_0         
	//   16   33:getfield        #317 <Field CircularProgressDrawable mProgress>
	//   17   36:iconst_1        
	//   18   37:invokevirtual   #321 <Method void CircularProgressDrawable.setStyle(int)>
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//   19   40:aload_0         
	//   20   41:getfield        #285 <Field CircleImageView mCircleView>
	//   21   44:aload_0         
	//   22   45:getfield        #317 <Field CircularProgressDrawable mProgress>
	//   23   48:invokevirtual   #325 <Method void CircleImageView.setImageDrawable(Drawable)>
		mCircleView.setVisibility(8);
	//   24   51:aload_0         
	//   25   52:getfield        #285 <Field CircleImageView mCircleView>
	//   26   55:bipush          8
	//   27   57:invokevirtual   #328 <Method void CircleImageView.setVisibility(int)>
		addView(((View) (mCircleView)));
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #285 <Field CircleImageView mCircleView>
	//   31   65:invokevirtual   #331 <Method void addView(View)>
	//   32   68:return          
	}

	private void ensureTarget()
	{
		if(mTarget != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #334 <Field View mTarget>
	//    2    4:ifnonnull       39
_L1:
		int i = 0;
	//    3    7:iconst_0        
	//    4    8:istore_1        
_L7:
		if(i >= getChildCount()) goto _L2; else goto _L3
	//    5    9:iload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #337 <Method int getChildCount()>
	//    8   14:icmpge          39
_L3:
		View view = getChildAt(i);
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:invokevirtual   #341 <Method View getChildAt(int)>
	//   12   22:astore_2        
		if(((Object) (view)).equals(((Object) (mCircleView)))) goto _L5; else goto _L4
	//   13   23:aload_2         
	//   14   24:aload_0         
	//   15   25:getfield        #285 <Field CircleImageView mCircleView>
	//   16   28:invokevirtual   #347 <Method boolean Object.equals(Object)>
	//   17   31:ifne            40
_L4:
		mTarget = view;
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:putfield        #334 <Field View mTarget>
_L2:
		return;
	//   21   39:return          
_L5:
		i++;
	//   22   40:iload_1         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_1        
		if(true) goto _L7; else goto _L6
	//   26   44:goto            9
_L6:
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
	//    8   12:invokespecial   #352 <Method void setRefreshing(boolean, boolean)>
			return;
	//    9   15:return          
		}
		mRefreshing = false;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #140 <Field boolean mRefreshing>
		mProgress.setStartEndTrim(0.0F, 0.0F);
	//   13   21:aload_0         
	//   14   22:getfield        #317 <Field CircularProgressDrawable mProgress>
	//   15   25:fconst_0        
	//   16   26:fconst_0        
	//   17   27:invokevirtual   #356 <Method void CircularProgressDrawable.setStartEndTrim(float, float)>
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
	//   26   44:invokespecial   #357 <Method void SwipeRefreshLayout$5(SwipeRefreshLayout)>
	//   27   47:astore_2        
		animateOffsetToStartPosition(mCurrentTargetOffsetTop, animationlistener);
	//   28   48:aload_0         
	//   29   49:aload_0         
	//   30   50:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   31   53:aload_2         
	//   32   54:invokespecial   #359 <Method void animateOffsetToStartPosition(int, android.view.animation.Animation$AnimationListener)>
		mProgress.setArrowEnabled(false);
	//   33   57:aload_0         
	//   34   58:getfield        #317 <Field CircularProgressDrawable mProgress>
	//   35   61:iconst_0        
	//   36   62:invokevirtual   #362 <Method void CircularProgressDrawable.setArrowEnabled(boolean)>
	//   37   65:return          
	}

	private boolean isAnimationRunning(Animation animation)
	{
		return animation != null && animation.hasStarted() && !animation.hasEnded();
	//    0    0:aload_1         
	//    1    1:ifnull          20
	//    2    4:aload_1         
	//    3    5:invokevirtual   #368 <Method boolean Animation.hasStarted()>
	//    4    8:ifeq            20
	//    5   11:aload_1         
	//    6   12:invokevirtual   #371 <Method boolean Animation.hasEnded()>
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
	//    1    1:getfield        #317 <Field CircularProgressDrawable mProgress>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #362 <Method void CircularProgressDrawable.setArrowEnabled(boolean)>
		float f2 = Math.min(1.0F, Math.abs(f / mTotalDragDistance));
	//    4    8:fconst_1        
	//    5    9:fload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #143 <Field float mTotalDragDistance>
	//    8   14:fdiv            
	//    9   15:invokestatic    #378 <Method float Math.abs(float)>
	//   10   18:invokestatic    #382 <Method float Math.min(float, float)>
	//   11   21:fstore_3        
		float f3 = ((float)Math.max((double)f2 - 0.40000000000000002D, 0.0D) * 5F) / 3F;
	//   12   22:fload_3         
	//   13   23:f2d             
	//   14   24:ldc2w           #383 <Double 0.40000000000000002D>
	//   15   27:dsub            
	//   16   28:dconst_0        
	//   17   29:invokestatic    #388 <Method double Math.max(double, double)>
	//   18   32:d2f             
	//   19   33:ldc2            #389 <Float 5F>
	//   20   36:fmul            
	//   21   37:ldc2            #390 <Float 3F>
	//   22   40:fdiv            
	//   23   41:fstore          4
		float f4 = Math.abs(f);
	//   24   43:fload_1         
	//   25   44:invokestatic    #378 <Method float Math.abs(float)>
	//   26   47:fstore          5
		float f5 = mTotalDragDistance;
	//   27   49:aload_0         
	//   28   50:getfield        #143 <Field float mTotalDragDistance>
	//   29   53:fstore          6
		float f1;
		int i;
		int j;
		if(mUsingCustomStart)
	//*  30   55:aload_0         
	//*  31   56:getfield        #392 <Field boolean mUsingCustomStart>
	//*  32   59:ifeq            306
			f1 = mSpinnerOffsetEnd - mOriginalOffsetTop;
	//   33   62:aload_0         
	//   34   63:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   35   66:aload_0         
	//   36   67:getfield        #243 <Field int mOriginalOffsetTop>
	//   37   70:isub            
	//   38   71:i2f             
	//   39   72:fstore_2        
		else
	//*  40   73:fconst_0        
	//*  41   74:fload           5
	//*  42   76:fload           6
	//*  43   78:fsub            
	//*  44   79:fconst_2        
	//*  45   80:fload_2         
	//*  46   81:fmul            
	//*  47   82:invokestatic    #382 <Method float Math.min(float, float)>
	//*  48   85:fload_2         
	//*  49   86:fdiv            
	//*  50   87:invokestatic    #394 <Method float Math.max(float, float)>
	//*  51   90:fstore          5
	//*  52   92:fload           5
	//*  53   94:ldc2            #395 <Float 4F>
	//*  54   97:fdiv            
	//*  55   98:f2d             
	//*  56   99:fload           5
	//*  57  101:ldc2            #395 <Float 4F>
	//*  58  104:fdiv            
	//*  59  105:f2d             
	//*  60  106:ldc2w           #396 <Double 2D>
	//*  61  109:invokestatic    #400 <Method double Math.pow(double, double)>
	//*  62  112:dsub            
	//*  63  113:d2f             
	//*  64  114:fconst_2        
	//*  65  115:fmul            
	//*  66  116:fstore          5
	//*  67  118:aload_0         
	//*  68  119:getfield        #243 <Field int mOriginalOffsetTop>
	//*  69  122:istore          7
	//*  70  124:fload_2         
	//*  71  125:fload_3         
	//*  72  126:fmul            
	//*  73  127:fload_2         
	//*  74  128:fload           5
	//*  75  130:fmul            
	//*  76  131:fconst_2        
	//*  77  132:fmul            
	//*  78  133:fadd            
	//*  79  134:f2i             
	//*  80  135:istore          8
	//*  81  137:aload_0         
	//*  82  138:getfield        #285 <Field CircleImageView mCircleView>
	//*  83  141:invokevirtual   #403 <Method int CircleImageView.getVisibility()>
	//*  84  144:ifeq            155
	//*  85  147:aload_0         
	//*  86  148:getfield        #285 <Field CircleImageView mCircleView>
	//*  87  151:iconst_0        
	//*  88  152:invokevirtual   #328 <Method void CircleImageView.setVisibility(int)>
	//*  89  155:aload_0         
	//*  90  156:getfield        #301 <Field boolean mScale>
	//*  91  159:ifne            178
	//*  92  162:aload_0         
	//*  93  163:getfield        #285 <Field CircleImageView mCircleView>
	//*  94  166:fconst_1        
	//*  95  167:invokevirtual   #406 <Method void CircleImageView.setScaleX(float)>
	//*  96  170:aload_0         
	//*  97  171:getfield        #285 <Field CircleImageView mCircleView>
	//*  98  174:fconst_1        
	//*  99  175:invokevirtual   #409 <Method void CircleImageView.setScaleY(float)>
	//* 100  178:aload_0         
	//* 101  179:getfield        #301 <Field boolean mScale>
	//* 102  182:ifeq            199
	//* 103  185:aload_0         
	//* 104  186:fconst_1        
	//* 105  187:fload_1         
	//* 106  188:aload_0         
	//* 107  189:getfield        #143 <Field float mTotalDragDistance>
	//* 108  192:fdiv            
	//* 109  193:invokestatic    #382 <Method float Math.min(float, float)>
	//* 110  196:invokevirtual   #412 <Method void setAnimationProgress(float)>
	//* 111  199:fload_1         
	//* 112  200:aload_0         
	//* 113  201:getfield        #143 <Field float mTotalDragDistance>
	//* 114  204:fcmpg           
	//* 115  205:ifge            315
	//* 116  208:aload_0         
	//* 117  209:getfield        #317 <Field CircularProgressDrawable mProgress>
	//* 118  212:invokevirtual   #415 <Method int CircularProgressDrawable.getAlpha()>
	//* 119  215:bipush          76
	//* 120  217:icmple          235
	//* 121  220:aload_0         
	//* 122  221:aload_0         
	//* 123  222:getfield        #417 <Field Animation mAlphaStartAnimation>
	//* 124  225:invokespecial   #419 <Method boolean isAnimationRunning(Animation)>
	//* 125  228:ifne            235
	//* 126  231:aload_0         
	//* 127  232:invokespecial   #422 <Method void startProgressAlphaStartAnimation()>
	//* 128  235:aload_0         
	//* 129  236:getfield        #317 <Field CircularProgressDrawable mProgress>
	//* 130  239:fconst_0        
	//* 131  240:ldc1            #64  <Float 0.8F>
	//* 132  242:fload           4
	//* 133  244:ldc1            #64  <Float 0.8F>
	//* 134  246:fmul            
	//* 135  247:invokestatic    #382 <Method float Math.min(float, float)>
	//* 136  250:invokevirtual   #356 <Method void CircularProgressDrawable.setStartEndTrim(float, float)>
	//* 137  253:aload_0         
	//* 138  254:getfield        #317 <Field CircularProgressDrawable mProgress>
	//* 139  257:fconst_1        
	//* 140  258:fload           4
	//* 141  260:invokestatic    #382 <Method float Math.min(float, float)>
	//* 142  263:invokevirtual   #425 <Method void CircularProgressDrawable.setArrowScale(float)>
	//* 143  266:aload_0         
	//* 144  267:getfield        #317 <Field CircularProgressDrawable mProgress>
	//* 145  270:ldc2            #426 <Float -0.25F>
	//* 146  273:ldc2            #427 <Float 0.4F>
	//* 147  276:fload           4
	//* 148  278:fmul            
	//* 149  279:fadd            
	//* 150  280:fconst_2        
	//* 151  281:fload           5
	//* 152  283:fmul            
	//* 153  284:fadd            
	//* 154  285:ldc1            #52  <Float 0.5F>
	//* 155  287:fmul            
	//* 156  288:invokevirtual   #430 <Method void CircularProgressDrawable.setProgressRotation(float)>
	//* 157  291:aload_0         
	//* 158  292:iload           7
	//* 159  294:iload           8
	//* 160  296:iadd            
	//* 161  297:aload_0         
	//* 162  298:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//* 163  301:isub            
	//* 164  302:invokevirtual   #433 <Method void setTargetOffsetTopAndBottom(int)>
	//* 165  305:return          
			f1 = mSpinnerOffsetEnd;
	//  166  306:aload_0         
	//  167  307:getfield        #222 <Field int mSpinnerOffsetEnd>
	//  168  310:i2f             
	//  169  311:fstore_2        
		f4 = Math.max(0.0F, Math.min(f4 - f5, 2.0F * f1) / f1);
		f4 = (float)((double)(f4 / 4F) - Math.pow(f4 / 4F, 2D)) * 2.0F;
		i = mOriginalOffsetTop;
		j = (int)(f1 * f2 + f1 * f4 * 2.0F);
		if(mCircleView.getVisibility() != 0)
			mCircleView.setVisibility(0);
		if(!mScale)
		{
			mCircleView.setScaleX(1.0F);
			mCircleView.setScaleY(1.0F);
		}
		if(mScale)
			setAnimationProgress(Math.min(1.0F, f / mTotalDragDistance));
		if(f >= mTotalDragDistance) goto _L2; else goto _L1
_L1:
		if(mProgress.getAlpha() > 76 && !isAnimationRunning(mAlphaStartAnimation))
			startProgressAlphaStartAnimation();
_L4:
		mProgress.setStartEndTrim(0.0F, Math.min(0.8F, f3 * 0.8F));
		mProgress.setArrowScale(Math.min(1.0F, f3));
		mProgress.setProgressRotation((-0.25F + 0.4F * f3 + 2.0F * f4) * 0.5F);
		setTargetOffsetTopAndBottom((i + j) - mCurrentTargetOffsetTop);
		return;
	//* 170  312:goto            73
_L2:
		if(mProgress.getAlpha() < 255 && !isAnimationRunning(mAlphaMaxAnimation))
	//* 171  315:aload_0         
	//* 172  316:getfield        #317 <Field CircularProgressDrawable mProgress>
	//* 173  319:invokevirtual   #415 <Method int CircularProgressDrawable.getAlpha()>
	//* 174  322:sipush          255
	//* 175  325:icmpge          235
	//* 176  328:aload_0         
	//* 177  329:aload_0         
	//* 178  330:getfield        #435 <Field Animation mAlphaMaxAnimation>
	//* 179  333:invokespecial   #419 <Method boolean isAnimationRunning(Animation)>
	//* 180  336:ifne            235
			startProgressAlphaMaxAnimation();
	//  181  339:aload_0         
	//  182  340:invokespecial   #438 <Method void startProgressAlphaMaxAnimation()>
		if(true) goto _L4; else goto _L3
	//  183  343:goto            235
_L3:
	}

	private void onSecondaryPointerUp(MotionEvent motionevent)
	{
		int i = motionevent.getActionIndex();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #445 <Method int MotionEvent.getActionIndex()>
	//    2    4:istore_2        
		if(motionevent.getPointerId(i) == mActivePointerId)
	//*   3    5:aload_1         
	//*   4    6:iload_2         
	//*   5    7:invokevirtual   #448 <Method int MotionEvent.getPointerId(int)>
	//*   6   10:aload_0         
	//*   7   11:getfield        #149 <Field int mActivePointerId>
	//*   8   14:icmpne          32
		{
			if(i == 0)
	//*   9   17:iload_2         
	//*  10   18:ifne            33
				i = 1;
	//   11   21:iconst_1        
	//   12   22:istore_2        
			else
	//*  13   23:aload_0         
	//*  14   24:aload_1         
	//*  15   25:iload_2         
	//*  16   26:invokevirtual   #448 <Method int MotionEvent.getPointerId(int)>
	//*  17   29:putfield        #149 <Field int mActivePointerId>
	//*  18   32:return          
				i = 0;
	//   19   33:iconst_0        
	//   20   34:istore_2        
			mActivePointerId = motionevent.getPointerId(i);
		}
	//*  21   35:goto            23
	}

	private void setColorViewAlpha(int i)
	{
		mCircleView.getBackground().setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #453 <Method Drawable CircleImageView.getBackground()>
	//    3    7:iload_1         
	//    4    8:invokevirtual   #458 <Method void Drawable.setAlpha(int)>
		mProgress.setAlpha(i);
	//    5   11:aload_0         
	//    6   12:getfield        #317 <Field CircularProgressDrawable mProgress>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #459 <Method void CircularProgressDrawable.setAlpha(int)>
	//    9   19:return          
	}

	private void setRefreshing(boolean flag, boolean flag1)
	{
label0:
		{
			if(mRefreshing != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field boolean mRefreshing>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          41
			{
				mNotify = flag1;
	//    4    8:aload_0         
	//    5    9:iload_2         
	//    6   10:putfield        #461 <Field boolean mNotify>
				ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #463 <Method void ensureTarget()>
				mRefreshing = flag;
	//    9   17:aload_0         
	//   10   18:iload_1         
	//   11   19:putfield        #140 <Field boolean mRefreshing>
				if(!mRefreshing)
					break label0;
	//   12   22:aload_0         
	//   13   23:getfield        #140 <Field boolean mRefreshing>
	//   14   26:ifeq            42
				animateOffsetToCorrectPosition(mCurrentTargetOffsetTop, mRefreshListener);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   18   34:aload_0         
	//   19   35:getfield        #156 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   20   38:invokespecial   #465 <Method void animateOffsetToCorrectPosition(int, android.view.animation.Animation$AnimationListener)>
			}
			return;
	//   21   41:return          
		}
		startScaleDownAnimation(mRefreshListener);
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #156 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//   25   47:invokevirtual   #468 <Method void startScaleDownAnimation(android.view.animation.Animation$AnimationListener)>
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
	//    5    7:invokespecial   #473 <Method void SwipeRefreshLayout$4(SwipeRefreshLayout, int, int)>
	//    6   10:astore_3        
		((Animation) (animation)).setDuration(300L);
	//    7   11:aload_3         
	//    8   12:ldc2w           #474 <Long 300L>
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
	//*   2    2:getfield        #478 <Field float mInitialDownY>
	//*   3    5:fsub            
	//*   4    6:aload_0         
	//*   5    7:getfield        #174 <Field int mTouchSlop>
	//*   6   10:i2f             
	//*   7   11:fcmpl           
	//*   8   12:ifle            50
	//*   9   15:aload_0         
	//*  10   16:getfield        #480 <Field boolean mIsBeingDragged>
	//*  11   19:ifne            50
		{
			mInitialMotionY = mInitialDownY + (float)mTouchSlop;
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #478 <Field float mInitialDownY>
	//   15   27:aload_0         
	//   16   28:getfield        #174 <Field int mTouchSlop>
	//   17   31:i2f             
	//   18   32:fadd            
	//   19   33:putfield        #482 <Field float mInitialMotionY>
			mIsBeingDragged = true;
	//   20   36:aload_0         
	//   21   37:iconst_1        
	//   22   38:putfield        #480 <Field boolean mIsBeingDragged>
			mProgress.setAlpha(76);
	//   23   41:aload_0         
	//   24   42:getfield        #317 <Field CircularProgressDrawable mProgress>
	//   25   45:bipush          76
	//   26   47:invokevirtual   #459 <Method void CircularProgressDrawable.setAlpha(int)>
		}
	//   27   50:return          
	}

	private void startProgressAlphaMaxAnimation()
	{
		mAlphaMaxAnimation = startAlphaAnimation(mProgress.getAlpha(), 255);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #317 <Field CircularProgressDrawable mProgress>
	//    4    6:invokevirtual   #415 <Method int CircularProgressDrawable.getAlpha()>
	//    5    9:sipush          255
	//    6   12:invokespecial   #484 <Method Animation startAlphaAnimation(int, int)>
	//    7   15:putfield        #435 <Field Animation mAlphaMaxAnimation>
	//    8   18:return          
	}

	private void startProgressAlphaStartAnimation()
	{
		mAlphaStartAnimation = startAlphaAnimation(mProgress.getAlpha(), 76);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #317 <Field CircularProgressDrawable mProgress>
	//    4    6:invokevirtual   #415 <Method int CircularProgressDrawable.getAlpha()>
	//    5    9:bipush          76
	//    6   11:invokespecial   #484 <Method Animation startAlphaAnimation(int, int)>
	//    7   14:putfield        #417 <Field Animation mAlphaStartAnimation>
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
	//    6   10:invokevirtual   #488 <Method float CircleImageView.getScaleX()>
	//    7   13:putfield        #490 <Field float mStartingScale>
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
	//   12   22:invokespecial   #491 <Method void SwipeRefreshLayout$8(SwipeRefreshLayout)>
	//   13   25:putfield        #493 <Field Animation mScaleDownToStartAnimation>
		mScaleDownToStartAnimation.setDuration(150L);
	//   14   28:aload_0         
	//   15   29:getfield        #493 <Field Animation mScaleDownToStartAnimation>
	//   16   32:ldc2w           #494 <Long 150L>
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
	//   30   62:getfield        #493 <Field Animation mScaleDownToStartAnimation>
	//   31   65:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   32   68:return          
	}

	private void startScaleUpAnimation(android.view.animation.Animation.AnimationListener animationlistener)
	{
		mCircleView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #328 <Method void CircleImageView.setVisibility(int)>
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   4    8:getstatic       #501 <Field int android.os.Build$VERSION.SDK_INT>
	//*   5   11:bipush          11
	//*   6   13:icmplt          26
			mProgress.setAlpha(255);
	//    7   16:aload_0         
	//    8   17:getfield        #317 <Field CircularProgressDrawable mProgress>
	//    9   20:sipush          255
	//   10   23:invokevirtual   #459 <Method void CircularProgressDrawable.setAlpha(int)>
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
	//   15   32:invokespecial   #502 <Method void SwipeRefreshLayout$2(SwipeRefreshLayout)>
	//   16   35:putfield        #504 <Field Animation mScaleAnimation>
		mScaleAnimation.setDuration(mMediumAnimationDuration);
	//   17   38:aload_0         
	//   18   39:getfield        #504 <Field Animation mScaleAnimation>
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
	//   35   74:getfield        #504 <Field Animation mScaleAnimation>
	//   36   77:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   37   80:return          
	}

	public boolean canChildScrollUp()
	{
		if(mChildScrollUpCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #507 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//*   2    4:ifnull          22
			return mChildScrollUpCallback.canChildScrollUp(this, mTarget);
	//    3    7:aload_0         
	//    4    8:getfield        #507 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:getfield        #334 <Field View mTarget>
	//    8   16:invokeinterface #510 <Method boolean SwipeRefreshLayout$OnChildScrollUpCallback.canChildScrollUp(SwipeRefreshLayout, View)>
	//    9   21:ireturn         
		if(mTarget instanceof ListView)
	//*  10   22:aload_0         
	//*  11   23:getfield        #334 <Field View mTarget>
	//*  12   26:instanceof      #512 <Class ListView>
	//*  13   29:ifeq            44
			return ListViewCompat.canScrollList((ListView)mTarget, -1);
	//   14   32:aload_0         
	//   15   33:getfield        #334 <Field View mTarget>
	//   16   36:checkcast       #512 <Class ListView>
	//   17   39:iconst_m1       
	//   18   40:invokestatic    #518 <Method boolean ListViewCompat.canScrollList(ListView, int)>
	//   19   43:ireturn         
		else
			return mTarget.canScrollVertically(-1);
	//   20   44:aload_0         
	//   21   45:getfield        #334 <Field View mTarget>
	//   22   48:iconst_m1       
	//   23   49:invokevirtual   #524 <Method boolean View.canScrollVertically(int)>
	//   24   52:ireturn         
	}

	public boolean dispatchNestedFling(float f, float f1, boolean flag)
	{
		return mNestedScrollingChildHelper.dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #528 <Method boolean NestedScrollingChildHelper.dispatchNestedFling(float, float, boolean)>
	//    6   10:ireturn         
	}

	public boolean dispatchNestedPreFling(float f, float f1)
	{
		return mNestedScrollingChildHelper.dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #532 <Method boolean NestedScrollingChildHelper.dispatchNestedPreFling(float, float)>
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
	//    6    9:invokevirtual   #536 <Method boolean NestedScrollingChildHelper.dispatchNestedPreScroll(int, int, int[], int[])>
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
	//    7   11:invokevirtual   #540 <Method boolean NestedScrollingChildHelper.dispatchNestedScroll(int, int, int, int, int[])>
	//    8   14:ireturn         
	}

	protected int getChildDrawingOrder(int i, int j)
	{
		if(mCircleViewIndex >= 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field int mCircleViewIndex>
	//*   2    4:ifge            9
	//*   3    7:iload_2         
	//*   4    8:ireturn         
		{
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
	//*  16   26:icmplt          7
				return j + 1;
	//   17   29:iload_2         
	//   18   30:iconst_1        
	//   19   31:iadd            
	//   20   32:ireturn         
		}
		return j;
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollingParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #229 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:invokevirtual   #545 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
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
	//    2    4:invokevirtual   #551 <Method boolean NestedScrollingChildHelper.hasNestedScrollingParent()>
	//    3    7:ireturn         
	}

	public boolean isNestedScrollingEnabled()
	{
		return mNestedScrollingChildHelper.isNestedScrollingEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #554 <Method boolean NestedScrollingChildHelper.isNestedScrollingEnabled()>
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
	//   15   23:invokevirtual   #558 <Method int CircleImageView.getTop()>
	//   16   26:isub            
	//   17   27:invokevirtual   #433 <Method void setTargetOffsetTopAndBottom(int)>
	//   18   30:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #561 <Method void ViewGroup.onDetachedFromWindow()>
		reset();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #562 <Method void reset()>
	//    4    8:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i;
		ensureTarget();
	//    0    0:aload_0         
	//    1    1:invokespecial   #463 <Method void ensureTarget()>
		i = motionevent.getActionMasked();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #567 <Method int MotionEvent.getActionMasked()>
	//    4    8:istore_2        
		if(mReturningToStart && i == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #569 <Field boolean mReturningToStart>
	//*   7   13:ifeq            25
	//*   8   16:iload_2         
	//*   9   17:ifne            25
			mReturningToStart = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #569 <Field boolean mReturningToStart>
		if(isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing && !mNestedScrollInProgress) goto _L2; else goto _L1
	//   13   25:aload_0         
	//   14   26:invokevirtual   #572 <Method boolean isEnabled()>
	//   15   29:ifeq            60
	//   16   32:aload_0         
	//   17   33:getfield        #569 <Field boolean mReturningToStart>
	//   18   36:ifne            60
	//   19   39:aload_0         
	//   20   40:invokevirtual   #574 <Method boolean canChildScrollUp()>
	//   21   43:ifne            60
	//   22   46:aload_0         
	//   23   47:getfield        #140 <Field boolean mRefreshing>
	//   24   50:ifne            60
	//   25   53:aload_0         
	//   26   54:getfield        #576 <Field boolean mNestedScrollInProgress>
	//   27   57:ifeq            62
_L1:
		return false;
	//   28   60:iconst_0        
	//   29   61:ireturn         
_L2:
		i;
	//   30   62:iload_2         
		JVM INSTR tableswitch 0 6: default 104
	//	               0 109
	//	               1 217
	//	               2 164
	//	               3 217
	//	               4 104
	//	               5 104
	//	               6 209;
	//   31   63:tableswitch     0 6: default 104
	//	               0 109
	//	               1 217
	//	               2 164
	//	               3 217
	//	               4 104
	//	               5 104
	//	               6 209
		   goto _L3 _L4 _L5 _L6 _L5 _L3 _L3 _L7
_L3:
		break; /* Loop/switch isn't completed */
_L5:
		break MISSING_BLOCK_LABEL_217;
_L9:
		return mIsBeingDragged;
	//   32  104:aload_0         
	//   33  105:getfield        #480 <Field boolean mIsBeingDragged>
	//   34  108:ireturn         
_L4:
		setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCircleView.getTop());
	//   35  109:aload_0         
	//   36  110:aload_0         
	//   37  111:getfield        #243 <Field int mOriginalOffsetTop>
	//   38  114:aload_0         
	//   39  115:getfield        #285 <Field CircleImageView mCircleView>
	//   40  118:invokevirtual   #558 <Method int CircleImageView.getTop()>
	//   41  121:isub            
	//   42  122:invokevirtual   #433 <Method void setTargetOffsetTopAndBottom(int)>
		mActivePointerId = motionevent.getPointerId(0);
	//   43  125:aload_0         
	//   44  126:aload_1         
	//   45  127:iconst_0        
	//   46  128:invokevirtual   #448 <Method int MotionEvent.getPointerId(int)>
	//   47  131:putfield        #149 <Field int mActivePointerId>
		mIsBeingDragged = false;
	//   48  134:aload_0         
	//   49  135:iconst_0        
	//   50  136:putfield        #480 <Field boolean mIsBeingDragged>
		i = motionevent.findPointerIndex(mActivePointerId);
	//   51  139:aload_1         
	//   52  140:aload_0         
	//   53  141:getfield        #149 <Field int mActivePointerId>
	//   54  144:invokevirtual   #579 <Method int MotionEvent.findPointerIndex(int)>
	//   55  147:istore_2        
		if(i < 0) goto _L1; else goto _L8
	//   56  148:iload_2         
	//   57  149:iflt            60
_L8:
		mInitialDownY = motionevent.getY(i);
	//   58  152:aload_0         
	//   59  153:aload_1         
	//   60  154:iload_2         
	//   61  155:invokevirtual   #583 <Method float MotionEvent.getY(int)>
	//   62  158:putfield        #478 <Field float mInitialDownY>
		  goto _L9
	//*  63  161:goto            104
_L6:
		if(mActivePointerId == -1)
	//*  64  164:aload_0         
	//*  65  165:getfield        #149 <Field int mActivePointerId>
	//*  66  168:iconst_m1       
	//*  67  169:icmpne          184
		{
			Log.e(LOG_TAG, "Got ACTION_MOVE event but don't have an active pointer id.");
	//   68  172:getstatic       #128 <Field String LOG_TAG>
	//   69  175:ldc2            #585 <String "Got ACTION_MOVE event but don't have an active pointer id.">
	//   70  178:invokestatic    #591 <Method int Log.e(String, String)>
	//   71  181:pop             
			return false;
	//   72  182:iconst_0        
	//   73  183:ireturn         
		}
		i = motionevent.findPointerIndex(mActivePointerId);
	//   74  184:aload_1         
	//   75  185:aload_0         
	//   76  186:getfield        #149 <Field int mActivePointerId>
	//   77  189:invokevirtual   #579 <Method int MotionEvent.findPointerIndex(int)>
	//   78  192:istore_2        
		if(i < 0) goto _L1; else goto _L10
	//   79  193:iload_2         
	//   80  194:iflt            60
_L10:
		startDragging(motionevent.getY(i));
	//   81  197:aload_0         
	//   82  198:aload_1         
	//   83  199:iload_2         
	//   84  200:invokevirtual   #583 <Method float MotionEvent.getY(int)>
	//   85  203:invokespecial   #593 <Method void startDragging(float)>
		  goto _L9
	//*  86  206:goto            104
_L7:
		onSecondaryPointerUp(motionevent);
	//   87  209:aload_0         
	//   88  210:aload_1         
	//   89  211:invokespecial   #595 <Method void onSecondaryPointerUp(MotionEvent)>
		  goto _L9
	//*  90  214:goto            104
		mIsBeingDragged = false;
	//   91  217:aload_0         
	//   92  218:iconst_0        
	//   93  219:putfield        #480 <Field boolean mIsBeingDragged>
		mActivePointerId = -1;
	//   94  222:aload_0         
	//   95  223:iconst_m1       
	//   96  224:putfield        #149 <Field int mActivePointerId>
		  goto _L9
	//*  97  227:goto            104
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		i = getMeasuredWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #600 <Method int getMeasuredWidth()>
	//    2    4:istore_2        
		j = getMeasuredHeight();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #603 <Method int getMeasuredHeight()>
	//    5    9:istore_3        
		if(getChildCount() != 0)
	//*   6   10:aload_0         
	//*   7   11:invokevirtual   #337 <Method int getChildCount()>
	//*   8   14:ifne            18
	//*   9   17:return          
		{
			if(mTarget == null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #334 <Field View mTarget>
	//*  12   22:ifnonnull       29
				ensureTarget();
	//   13   25:aload_0         
	//   14   26:invokespecial   #463 <Method void ensureTarget()>
			if(mTarget != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #334 <Field View mTarget>
	//*  17   33:ifnull          17
			{
				View view = mTarget;
	//   18   36:aload_0         
	//   19   37:getfield        #334 <Field View mTarget>
	//   20   40:astore          6
				k = getPaddingLeft();
	//   21   42:aload_0         
	//   22   43:invokevirtual   #606 <Method int getPaddingLeft()>
	//   23   46:istore          4
				l = getPaddingTop();
	//   24   48:aload_0         
	//   25   49:invokevirtual   #609 <Method int getPaddingTop()>
	//   26   52:istore          5
				view.layout(k, l, k + (i - getPaddingLeft() - getPaddingRight()), l + (j - getPaddingTop() - getPaddingBottom()));
	//   27   54:aload           6
	//   28   56:iload           4
	//   29   58:iload           5
	//   30   60:iload           4
	//   31   62:iload_2         
	//   32   63:aload_0         
	//   33   64:invokevirtual   #606 <Method int getPaddingLeft()>
	//   34   67:isub            
	//   35   68:aload_0         
	//   36   69:invokevirtual   #612 <Method int getPaddingRight()>
	//   37   72:isub            
	//   38   73:iadd            
	//   39   74:iload           5
	//   40   76:iload_3         
	//   41   77:aload_0         
	//   42   78:invokevirtual   #609 <Method int getPaddingTop()>
	//   43   81:isub            
	//   44   82:aload_0         
	//   45   83:invokevirtual   #615 <Method int getPaddingBottom()>
	//   46   86:isub            
	//   47   87:iadd            
	//   48   88:invokevirtual   #619 <Method void View.layout(int, int, int, int)>
				j = mCircleView.getMeasuredWidth();
	//   49   91:aload_0         
	//   50   92:getfield        #285 <Field CircleImageView mCircleView>
	//   51   95:invokevirtual   #620 <Method int CircleImageView.getMeasuredWidth()>
	//   52   98:istore_3        
				k = mCircleView.getMeasuredHeight();
	//   53   99:aload_0         
	//   54  100:getfield        #285 <Field CircleImageView mCircleView>
	//   55  103:invokevirtual   #621 <Method int CircleImageView.getMeasuredHeight()>
	//   56  106:istore          4
				mCircleView.layout(i / 2 - j / 2, mCurrentTargetOffsetTop, i / 2 + j / 2, mCurrentTargetOffsetTop + k);
	//   57  108:aload_0         
	//   58  109:getfield        #285 <Field CircleImageView mCircleView>
	//   59  112:iload_2         
	//   60  113:iconst_2        
	//   61  114:idiv            
	//   62  115:iload_3         
	//   63  116:iconst_2        
	//   64  117:idiv            
	//   65  118:isub            
	//   66  119:aload_0         
	//   67  120:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   68  123:iload_2         
	//   69  124:iconst_2        
	//   70  125:idiv            
	//   71  126:iload_3         
	//   72  127:iconst_2        
	//   73  128:idiv            
	//   74  129:iadd            
	//   75  130:aload_0         
	//   76  131:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   77  134:iload           4
	//   78  136:iadd            
	//   79  137:invokevirtual   #622 <Method void CircleImageView.layout(int, int, int, int)>
				return;
	//   80  140:return          
			}
		}
	}

	public void onMeasure(int i, int j)
	{
		super.onMeasure(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #626 <Method void ViewGroup.onMeasure(int, int)>
		if(mTarget == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #334 <Field View mTarget>
	//*   6   10:ifnonnull       17
			ensureTarget();
	//    7   13:aload_0         
	//    8   14:invokespecial   #463 <Method void ensureTarget()>
		if(mTarget != null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #334 <Field View mTarget>
	//*  11   21:ifnonnull       25
	//*  12   24:return          
		{
			mTarget.measure(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 0x40000000));
	//   13   25:aload_0         
	//   14   26:getfield        #334 <Field View mTarget>
	//   15   29:aload_0         
	//   16   30:invokevirtual   #600 <Method int getMeasuredWidth()>
	//   17   33:aload_0         
	//   18   34:invokevirtual   #606 <Method int getPaddingLeft()>
	//   19   37:isub            
	//   20   38:aload_0         
	//   21   39:invokevirtual   #612 <Method int getPaddingRight()>
	//   22   42:isub            
	//   23   43:ldc2            #627 <Int 0x40000000>
	//   24   46:invokestatic    #632 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #603 <Method int getMeasuredHeight()>
	//   27   53:aload_0         
	//   28   54:invokevirtual   #609 <Method int getPaddingTop()>
	//   29   57:isub            
	//   30   58:aload_0         
	//   31   59:invokevirtual   #615 <Method int getPaddingBottom()>
	//   32   62:isub            
	//   33   63:ldc2            #627 <Int 0x40000000>
	//   34   66:invokestatic    #632 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   35   69:invokevirtual   #635 <Method void View.measure(int, int)>
			mCircleView.measure(android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(mCircleDiameter, 0x40000000));
	//   36   72:aload_0         
	//   37   73:getfield        #285 <Field CircleImageView mCircleView>
	//   38   76:aload_0         
	//   39   77:getfield        #210 <Field int mCircleDiameter>
	//   40   80:ldc2            #627 <Int 0x40000000>
	//   41   83:invokestatic    #632 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   42   86:aload_0         
	//   43   87:getfield        #210 <Field int mCircleDiameter>
	//   44   90:ldc2            #627 <Int 0x40000000>
	//   45   93:invokestatic    #632 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   46   96:invokevirtual   #636 <Method void CircleImageView.measure(int, int)>
			mCircleViewIndex = -1;
	//   47   99:aload_0         
	//   48  100:iconst_m1       
	//   49  101:putfield        #151 <Field int mCircleViewIndex>
			i = 0;
	//   50  104:iconst_0        
	//   51  105:istore_1        
			while(i < getChildCount()) 
	//*  52  106:iload_1         
	//*  53  107:aload_0         
	//*  54  108:invokevirtual   #337 <Method int getChildCount()>
	//*  55  111:icmpge          24
			{
				if(getChildAt(i) == mCircleView)
	//*  56  114:aload_0         
	//*  57  115:iload_1         
	//*  58  116:invokevirtual   #341 <Method View getChildAt(int)>
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
				i++;
	//   66  132:iload_1         
	//   67  133:iconst_1        
	//   68  134:iadd            
	//   69  135:istore_1        
			}
		}
	//*  70  136:goto            106
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		return dispatchNestedFling(f, f1, flag);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:iload           4
	//    4    5:invokevirtual   #639 <Method boolean dispatchNestedFling(float, float, boolean)>
	//    5    8:ireturn         
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		return dispatchNestedPreFling(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_2         
	//    2    2:fload_3         
	//    3    3:invokevirtual   #642 <Method boolean dispatchNestedPreFling(float, float)>
	//    4    6:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		if(j > 0 && mTotalUnconsumed > 0.0F)
	//*   0    0:iload_3         
	//*   1    1:ifle            47
	//*   2    4:aload_0         
	//*   3    5:getfield        #646 <Field float mTotalUnconsumed>
	//*   4    8:fconst_0        
	//*   5    9:fcmpl           
	//*   6   10:ifle            47
		{
			if((float)j > mTotalUnconsumed)
	//*   7   13:iload_3         
	//*   8   14:i2f             
	//*   9   15:aload_0         
	//*  10   16:getfield        #646 <Field float mTotalUnconsumed>
	//*  11   19:fcmpl           
	//*  12   20:ifle            139
			{
				ai[1] = j - (int)mTotalUnconsumed;
	//   13   23:aload           4
	//   14   25:iconst_1        
	//   15   26:iload_3         
	//   16   27:aload_0         
	//   17   28:getfield        #646 <Field float mTotalUnconsumed>
	//   18   31:f2i             
	//   19   32:isub            
	//   20   33:iastore         
				mTotalUnconsumed = 0.0F;
	//   21   34:aload_0         
	//   22   35:fconst_0        
	//   23   36:putfield        #646 <Field float mTotalUnconsumed>
			} else
	//*  24   39:aload_0         
	//*  25   40:aload_0         
	//*  26   41:getfield        #646 <Field float mTotalUnconsumed>
	//*  27   44:invokespecial   #648 <Method void moveSpinner(float)>
	//*  28   47:aload_0         
	//*  29   48:getfield        #392 <Field boolean mUsingCustomStart>
	//*  30   51:ifeq            88
	//*  31   54:iload_3         
	//*  32   55:ifle            88
	//*  33   58:aload_0         
	//*  34   59:getfield        #646 <Field float mTotalUnconsumed>
	//*  35   62:fconst_0        
	//*  36   63:fcmpl           
	//*  37   64:ifne            88
	//*  38   67:iload_3         
	//*  39   68:aload           4
	//*  40   70:iconst_1        
	//*  41   71:iaload          
	//*  42   72:isub            
	//*  43   73:invokestatic    #650 <Method int Math.abs(int)>
	//*  44   76:ifle            88
	//*  45   79:aload_0         
	//*  46   80:getfield        #285 <Field CircleImageView mCircleView>
	//*  47   83:bipush          8
	//*  48   85:invokevirtual   #328 <Method void CircleImageView.setVisibility(int)>
	//*  49   88:aload_0         
	//*  50   89:getfield        #145 <Field int[] mParentScrollConsumed>
	//*  51   92:astore_1        
	//*  52   93:aload_0         
	//*  53   94:iload_2         
	//*  54   95:aload           4
	//*  55   97:iconst_0        
	//*  56   98:iaload          
	//*  57   99:isub            
	//*  58  100:iload_3         
	//*  59  101:aload           4
	//*  60  103:iconst_1        
	//*  61  104:iaload          
	//*  62  105:isub            
	//*  63  106:aload_1         
	//*  64  107:aconst_null     
	//*  65  108:invokevirtual   #651 <Method boolean dispatchNestedPreScroll(int, int, int[], int[])>
	//*  66  111:ifeq            138
	//*  67  114:aload           4
	//*  68  116:iconst_0        
	//*  69  117:aload           4
	//*  70  119:iconst_0        
	//*  71  120:iaload          
	//*  72  121:aload_1         
	//*  73  122:iconst_0        
	//*  74  123:iaload          
	//*  75  124:iadd            
	//*  76  125:iastore         
	//*  77  126:aload           4
	//*  78  128:iconst_1        
	//*  79  129:aload           4
	//*  80  131:iconst_1        
	//*  81  132:iaload          
	//*  82  133:aload_1         
	//*  83  134:iconst_1        
	//*  84  135:iaload          
	//*  85  136:iadd            
	//*  86  137:iastore         
	//*  87  138:return          
			{
				mTotalUnconsumed = mTotalUnconsumed - (float)j;
	//   88  139:aload_0         
	//   89  140:aload_0         
	//   90  141:getfield        #646 <Field float mTotalUnconsumed>
	//   91  144:iload_3         
	//   92  145:i2f             
	//   93  146:fsub            
	//   94  147:putfield        #646 <Field float mTotalUnconsumed>
				ai[1] = j;
	//   95  150:aload           4
	//   96  152:iconst_1        
	//   97  153:iload_3         
	//   98  154:iastore         
			}
			moveSpinner(mTotalUnconsumed);
		}
		if(mUsingCustomStart && j > 0 && mTotalUnconsumed == 0.0F && Math.abs(j - ai[1]) > 0)
			mCircleView.setVisibility(8);
		view = ((View) (mParentScrollConsumed));
		if(dispatchNestedPreScroll(i - ai[0], j - ai[1], ((int []) (view)), ((int []) (null))))
		{
			ai[0] = ai[0] + view[0];
			ai[1] = ai[1] + view[1];
		}
	//*  99  155:goto            39
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
	//    7   11:invokevirtual   #654 <Method boolean dispatchNestedScroll(int, int, int, int, int[])>
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
	//*  19   30:invokevirtual   #574 <Method boolean canChildScrollUp()>
	//*  20   33:ifne            58
		{
			mTotalUnconsumed = mTotalUnconsumed + (float)Math.abs(i);
	//   21   36:aload_0         
	//   22   37:aload_0         
	//   23   38:getfield        #646 <Field float mTotalUnconsumed>
	//   24   41:iload_2         
	//   25   42:invokestatic    #650 <Method int Math.abs(int)>
	//   26   45:i2f             
	//   27   46:fadd            
	//   28   47:putfield        #646 <Field float mTotalUnconsumed>
			moveSpinner(mTotalUnconsumed);
	//   29   50:aload_0         
	//   30   51:aload_0         
	//   31   52:getfield        #646 <Field float mTotalUnconsumed>
	//   32   55:invokespecial   #648 <Method void moveSpinner(float)>
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
	//    5    7:invokevirtual   #658 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		startNestedScroll(i & 2);
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:iconst_2        
	//    9   13:iand            
	//   10   14:invokevirtual   #661 <Method boolean startNestedScroll(int)>
	//   11   17:pop             
		mTotalUnconsumed = 0.0F;
	//   12   18:aload_0         
	//   13   19:fconst_0        
	//   14   20:putfield        #646 <Field float mTotalUnconsumed>
		mNestedScrollInProgress = true;
	//   15   23:aload_0         
	//   16   24:iconst_1        
	//   17   25:putfield        #576 <Field boolean mNestedScrollInProgress>
	//   18   28:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		return isEnabled() && !mReturningToStart && !mRefreshing && (i & 2) != 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #572 <Method boolean isEnabled()>
	//    2    4:ifeq            29
	//    3    7:aload_0         
	//    4    8:getfield        #569 <Field boolean mReturningToStart>
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
	//    3    5:invokevirtual   #666 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		mNestedScrollInProgress = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #576 <Field boolean mNestedScrollInProgress>
		if(mTotalUnconsumed > 0.0F)
	//*   7   13:aload_0         
	//*   8   14:getfield        #646 <Field float mTotalUnconsumed>
	//*   9   17:fconst_0        
	//*  10   18:fcmpl           
	//*  11   19:ifle            35
		{
			finishSpinner(mTotalUnconsumed);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #646 <Field float mTotalUnconsumed>
	//   15   27:invokespecial   #668 <Method void finishSpinner(float)>
			mTotalUnconsumed = 0.0F;
	//   16   30:aload_0         
	//   17   31:fconst_0        
	//   18   32:putfield        #646 <Field float mTotalUnconsumed>
		}
		stopNestedScroll();
	//   19   35:aload_0         
	//   20   36:invokevirtual   #671 <Method void stopNestedScroll()>
	//   21   39:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i;
		i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #567 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		if(mReturningToStart && i == 0)
	//*   3    6:aload_0         
	//*   4    7:getfield        #569 <Field boolean mReturningToStart>
	//*   5   10:ifeq            23
	//*   6   13:iload           4
	//*   7   15:ifne            23
			mReturningToStart = false;
	//    8   18:aload_0         
	//    9   19:iconst_0        
	//   10   20:putfield        #569 <Field boolean mReturningToStart>
		if(isEnabled() && !mReturningToStart && !canChildScrollUp() && !mRefreshing && !mNestedScrollInProgress) goto _L2; else goto _L1
	//   11   23:aload_0         
	//   12   24:invokevirtual   #572 <Method boolean isEnabled()>
	//   13   27:ifeq            58
	//   14   30:aload_0         
	//   15   31:getfield        #569 <Field boolean mReturningToStart>
	//   16   34:ifne            58
	//   17   37:aload_0         
	//   18   38:invokevirtual   #574 <Method boolean canChildScrollUp()>
	//   19   41:ifne            58
	//   20   44:aload_0         
	//   21   45:getfield        #140 <Field boolean mRefreshing>
	//   22   48:ifne            58
	//   23   51:aload_0         
	//   24   52:getfield        #576 <Field boolean mNestedScrollInProgress>
	//   25   55:ifeq            60
_L1:
		return false;
	//   26   58:iconst_0        
	//   27   59:ireturn         
_L2:
		i;
	//   28   60:iload           4
		JVM INSTR tableswitch 0 6: default 104
	//	               0 106
	//	               1 237
	//	               2 123
	//	               3 58
	//	               4 104
	//	               5 193
	//	               6 229;
	//   29   62:tableswitch     0 6: default 104
	//	               0 106
	//	               1 237
	//	               2 123
	//	               3 58
	//	               4 104
	//	               5 193
	//	               6 229
		   goto _L3 _L4 _L5 _L6 _L1 _L3 _L7 _L8
_L8:
		break MISSING_BLOCK_LABEL_229;
_L3:
		break; /* Loop/switch isn't completed */
_L5:
		break MISSING_BLOCK_LABEL_237;
_L9:
		return true;
	//   30  104:iconst_1        
	//   31  105:ireturn         
_L4:
		mActivePointerId = motionevent.getPointerId(0);
	//   32  106:aload_0         
	//   33  107:aload_1         
	//   34  108:iconst_0        
	//   35  109:invokevirtual   #448 <Method int MotionEvent.getPointerId(int)>
	//   36  112:putfield        #149 <Field int mActivePointerId>
		mIsBeingDragged = false;
	//   37  115:aload_0         
	//   38  116:iconst_0        
	//   39  117:putfield        #480 <Field boolean mIsBeingDragged>
		  goto _L9
	//*  40  120:goto            104
_L6:
		float f;
		int j = motionevent.findPointerIndex(mActivePointerId);
	//   41  123:aload_1         
	//   42  124:aload_0         
	//   43  125:getfield        #149 <Field int mActivePointerId>
	//   44  128:invokevirtual   #579 <Method int MotionEvent.findPointerIndex(int)>
	//   45  131:istore          4
		if(j < 0)
	//*  46  133:iload           4
	//*  47  135:ifge            150
		{
			Log.e(LOG_TAG, "Got ACTION_MOVE event but have an invalid active pointer id.");
	//   48  138:getstatic       #128 <Field String LOG_TAG>
	//   49  141:ldc2            #674 <String "Got ACTION_MOVE event but have an invalid active pointer id.">
	//   50  144:invokestatic    #591 <Method int Log.e(String, String)>
	//   51  147:pop             
			return false;
	//   52  148:iconst_0        
	//   53  149:ireturn         
		}
		f = motionevent.getY(j);
	//   54  150:aload_1         
	//   55  151:iload           4
	//   56  153:invokevirtual   #583 <Method float MotionEvent.getY(int)>
	//   57  156:fstore_2        
		startDragging(f);
	//   58  157:aload_0         
	//   59  158:fload_2         
	//   60  159:invokespecial   #593 <Method void startDragging(float)>
		if(!mIsBeingDragged) goto _L9; else goto _L10
	//   61  162:aload_0         
	//   62  163:getfield        #480 <Field boolean mIsBeingDragged>
	//   63  166:ifeq            104
_L10:
		f = (f - mInitialMotionY) * 0.5F;
	//   64  169:fload_2         
	//   65  170:aload_0         
	//   66  171:getfield        #482 <Field float mInitialMotionY>
	//   67  174:fsub            
	//   68  175:ldc1            #52  <Float 0.5F>
	//   69  177:fmul            
	//   70  178:fstore_2        
		if(f <= 0.0F) goto _L1; else goto _L11
	//   71  179:fload_2         
	//   72  180:fconst_0        
	//   73  181:fcmpl           
	//   74  182:ifle            58
_L11:
		moveSpinner(f);
	//   75  185:aload_0         
	//   76  186:fload_2         
	//   77  187:invokespecial   #648 <Method void moveSpinner(float)>
		  goto _L9
	//*  78  190:goto            104
_L7:
		int k = motionevent.getActionIndex();
	//   79  193:aload_1         
	//   80  194:invokevirtual   #445 <Method int MotionEvent.getActionIndex()>
	//   81  197:istore          4
		if(k < 0)
	//*  82  199:iload           4
	//*  83  201:ifge            216
		{
			Log.e(LOG_TAG, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
	//   84  204:getstatic       #128 <Field String LOG_TAG>
	//   85  207:ldc2            #676 <String "Got ACTION_POINTER_DOWN event but have an invalid action index.">
	//   86  210:invokestatic    #591 <Method int Log.e(String, String)>
	//   87  213:pop             
			return false;
	//   88  214:iconst_0        
	//   89  215:ireturn         
		}
		mActivePointerId = motionevent.getPointerId(k);
	//   90  216:aload_0         
	//   91  217:aload_1         
	//   92  218:iload           4
	//   93  220:invokevirtual   #448 <Method int MotionEvent.getPointerId(int)>
	//   94  223:putfield        #149 <Field int mActivePointerId>
		  goto _L9
	//*  95  226:goto            104
		onSecondaryPointerUp(motionevent);
	//   96  229:aload_0         
	//   97  230:aload_1         
	//   98  231:invokespecial   #595 <Method void onSecondaryPointerUp(MotionEvent)>
		  goto _L9
	//*  99  234:goto            104
		int l = motionevent.findPointerIndex(mActivePointerId);
	//  100  237:aload_1         
	//  101  238:aload_0         
	//  102  239:getfield        #149 <Field int mActivePointerId>
	//  103  242:invokevirtual   #579 <Method int MotionEvent.findPointerIndex(int)>
	//  104  245:istore          4
		if(l < 0)
	//* 105  247:iload           4
	//* 106  249:ifge            264
		{
			Log.e(LOG_TAG, "Got ACTION_UP event but don't have an active pointer id.");
	//  107  252:getstatic       #128 <Field String LOG_TAG>
	//  108  255:ldc2            #678 <String "Got ACTION_UP event but don't have an active pointer id.">
	//  109  258:invokestatic    #591 <Method int Log.e(String, String)>
	//  110  261:pop             
			return false;
	//  111  262:iconst_0        
	//  112  263:ireturn         
		}
		if(mIsBeingDragged)
	//* 113  264:aload_0         
	//* 114  265:getfield        #480 <Field boolean mIsBeingDragged>
	//* 115  268:ifeq            298
		{
			float f1 = motionevent.getY(l);
	//  116  271:aload_1         
	//  117  272:iload           4
	//  118  274:invokevirtual   #583 <Method float MotionEvent.getY(int)>
	//  119  277:fstore_2        
			float f2 = mInitialMotionY;
	//  120  278:aload_0         
	//  121  279:getfield        #482 <Field float mInitialMotionY>
	//  122  282:fstore_3        
			mIsBeingDragged = false;
	//  123  283:aload_0         
	//  124  284:iconst_0        
	//  125  285:putfield        #480 <Field boolean mIsBeingDragged>
			finishSpinner((f1 - f2) * 0.5F);
	//  126  288:aload_0         
	//  127  289:fload_2         
	//  128  290:fload_3         
	//  129  291:fsub            
	//  130  292:ldc1            #52  <Float 0.5F>
	//  131  294:fmul            
	//  132  295:invokespecial   #668 <Method void finishSpinner(float)>
		}
		mActivePointerId = -1;
	//  133  298:aload_0         
	//  134  299:iconst_m1       
	//  135  300:putfield        #149 <Field int mActivePointerId>
		return false;
	//  136  303:iconst_0        
	//  137  304:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT < 21 && (mTarget instanceof AbsListView) || mTarget != null && !ViewCompat.isNestedScrollingEnabled(mTarget))
	//*   0    0:getstatic       #501 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          18
	//*   3    8:aload_0         
	//*   4    9:getfield        #334 <Field View mTarget>
	//*   5   12:instanceof      #681 <Class AbsListView>
	//*   6   15:ifne            35
	//*   7   18:aload_0         
	//*   8   19:getfield        #334 <Field View mTarget>
	//*   9   22:ifnull          36
	//*  10   25:aload_0         
	//*  11   26:getfield        #334 <Field View mTarget>
	//*  12   29:invokestatic    #684 <Method boolean ViewCompat.isNestedScrollingEnabled(View)>
	//*  13   32:ifne            36
		{
			return;
	//   14   35:return          
		} else
		{
			super.requestDisallowInterceptTouchEvent(flag);
	//   15   36:aload_0         
	//   16   37:iload_1         
	//   17   38:invokespecial   #686 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
			return;
	//   18   41:return          
		}
	}

	void reset()
	{
		mCircleView.clearAnimation();
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #294 <Method void CircleImageView.clearAnimation()>
		mProgress.stop();
	//    3    7:aload_0         
	//    4    8:getfield        #317 <Field CircularProgressDrawable mProgress>
	//    5   11:invokevirtual   #689 <Method void CircularProgressDrawable.stop()>
		mCircleView.setVisibility(8);
	//    6   14:aload_0         
	//    7   15:getfield        #285 <Field CircleImageView mCircleView>
	//    8   18:bipush          8
	//    9   20:invokevirtual   #328 <Method void CircleImageView.setVisibility(int)>
		setColorViewAlpha(255);
	//   10   23:aload_0         
	//   11   24:sipush          255
	//   12   27:invokespecial   #691 <Method void setColorViewAlpha(int)>
		if(mScale)
	//*  13   30:aload_0         
	//*  14   31:getfield        #301 <Field boolean mScale>
	//*  15   34:ifeq            54
			setAnimationProgress(0.0F);
	//   16   37:aload_0         
	//   17   38:fconst_0        
	//   18   39:invokevirtual   #412 <Method void setAnimationProgress(float)>
		else
	//*  19   42:aload_0         
	//*  20   43:aload_0         
	//*  21   44:getfield        #285 <Field CircleImageView mCircleView>
	//*  22   47:invokevirtual   #558 <Method int CircleImageView.getTop()>
	//*  23   50:putfield        #241 <Field int mCurrentTargetOffsetTop>
	//*  24   53:return          
			setTargetOffsetTopAndBottom(mOriginalOffsetTop - mCurrentTargetOffsetTop);
	//   25   54:aload_0         
	//   26   55:aload_0         
	//   27   56:getfield        #243 <Field int mOriginalOffsetTop>
	//   28   59:aload_0         
	//   29   60:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//   30   63:isub            
	//   31   64:invokevirtual   #433 <Method void setTargetOffsetTopAndBottom(int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//*  32   67:goto            42
	}

	void setAnimationProgress(float f)
	{
		mCircleView.setScaleX(f);
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #406 <Method void CircleImageView.setScaleX(float)>
		mCircleView.setScaleY(f);
	//    4    8:aload_0         
	//    5    9:getfield        #285 <Field CircleImageView mCircleView>
	//    6   12:fload_1         
	//    7   13:invokevirtual   #409 <Method void CircleImageView.setScaleY(float)>
	//    8   16:return          
	}

	public transient void setColorScheme(int ai[])
	{
		setColorSchemeResources(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #698 <Method void setColorSchemeResources(int[])>
	//    3    5:return          
	}

	public transient void setColorSchemeColors(int ai[])
	{
		ensureTarget();
	//    0    0:aload_0         
	//    1    1:invokespecial   #463 <Method void ensureTarget()>
		mProgress.setColorSchemeColors(ai);
	//    2    4:aload_0         
	//    3    5:getfield        #317 <Field CircularProgressDrawable mProgress>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #704 <Method void CircularProgressDrawable.setColorSchemeColors(int[])>
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
	//   19   26:invokestatic    #710 <Method int ContextCompat.getColor(Context, int)>
	//   20   29:iastore         

	//   21   30:iload_2         
	//   22   31:iconst_1        
	//   23   32:iadd            
	//   24   33:istore_2        
	//*  25   34:goto            13
		setColorSchemeColors(ai1);
	//   26   37:aload_0         
	//   27   38:aload           4
	//   28   40:invokevirtual   #711 <Method void setColorSchemeColors(int[])>
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
	//    2    2:invokespecial   #713 <Method void ViewGroup.setEnabled(boolean)>
		if(!flag)
	//*   3    5:iload_1         
	//*   4    6:ifne            13
			reset();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #562 <Method void reset()>
	//    7   13:return          
	}

	public void setNestedScrollingEnabled(boolean flag)
	{
		mNestedScrollingChildHelper.setNestedScrollingEnabled(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #714 <Method void NestedScrollingChildHelper.setNestedScrollingEnabled(boolean)>
	//    4    8:return          
	}

	public void setOnChildScrollUpCallback(OnChildScrollUpCallback onchildscrollupcallback)
	{
		mChildScrollUpCallback = onchildscrollupcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #507 <Field SwipeRefreshLayout$OnChildScrollUpCallback mChildScrollUpCallback>
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
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #729 <Method void CircleImageView.setBackgroundColor(int)>
	//    4    8:return          
	}

	public void setProgressBackgroundColorSchemeResource(int i)
	{
		setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #308 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #710 <Method int ContextCompat.getColor(Context, int)>
	//    5    9:invokevirtual   #731 <Method void setProgressBackgroundColorSchemeColor(int)>
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
	//    8   14:invokevirtual   #736 <Method void CircleImageView.invalidate()>
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
	//   11   17:putfield        #392 <Field boolean mUsingCustomStart>
		reset();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #562 <Method void reset()>
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
	//*  10   18:getfield        #392 <Field boolean mUsingCustomStart>
	//*  11   21:ifne            58
				i = mSpinnerOffsetEnd + mOriginalOffsetTop;
	//   12   24:aload_0         
	//   13   25:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   14   28:aload_0         
	//   15   29:getfield        #243 <Field int mOriginalOffsetTop>
	//   16   32:iadd            
	//   17   33:istore_2        
			else
	//*  18   34:aload_0         
	//*  19   35:iload_2         
	//*  20   36:aload_0         
	//*  21   37:getfield        #241 <Field int mCurrentTargetOffsetTop>
	//*  22   40:isub            
	//*  23   41:invokevirtual   #433 <Method void setTargetOffsetTopAndBottom(int)>
	//*  24   44:aload_0         
	//*  25   45:iconst_0        
	//*  26   46:putfield        #461 <Field boolean mNotify>
	//*  27   49:aload_0         
	//*  28   50:aload_0         
	//*  29   51:getfield        #156 <Field android.view.animation.Animation$AnimationListener mRefreshListener>
	//*  30   54:invokespecial   #740 <Method void startScaleUpAnimation(android.view.animation.Animation$AnimationListener)>
	//*  31   57:return          
				i = mSpinnerOffsetEnd;
	//   32   58:aload_0         
	//   33   59:getfield        #222 <Field int mSpinnerOffsetEnd>
	//   34   62:istore_2        
			setTargetOffsetTopAndBottom(i - mCurrentTargetOffsetTop);
			mNotify = false;
			startScaleUpAnimation(mRefreshListener);
			return;
		} else
	//*  35   63:goto            34
		{
			setRefreshing(flag, false);
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:iconst_0        
	//   39   69:invokespecial   #352 <Method void setRefreshing(boolean, boolean)>
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
	//*  11   19:ifne            63
			mCircleDiameter = (int)(56F * displaymetrics.density);
	//   12   22:aload_0         
	//   13   23:ldc2            #742 <Float 56F>
	//   14   26:aload_2         
	//   15   27:getfield        #208 <Field float DisplayMetrics.density>
	//   16   30:fmul            
	//   17   31:f2i             
	//   18   32:putfield        #210 <Field int mCircleDiameter>
		else
	//*  19   35:aload_0         
	//*  20   36:getfield        #285 <Field CircleImageView mCircleView>
	//*  21   39:aconst_null     
	//*  22   40:invokevirtual   #325 <Method void CircleImageView.setImageDrawable(Drawable)>
	//*  23   43:aload_0         
	//*  24   44:getfield        #317 <Field CircularProgressDrawable mProgress>
	//*  25   47:iload_1         
	//*  26   48:invokevirtual   #321 <Method void CircularProgressDrawable.setStyle(int)>
	//*  27   51:aload_0         
	//*  28   52:getfield        #285 <Field CircleImageView mCircleView>
	//*  29   55:aload_0         
	//*  30   56:getfield        #317 <Field CircularProgressDrawable mProgress>
	//*  31   59:invokevirtual   #325 <Method void CircleImageView.setImageDrawable(Drawable)>
	//*  32   62:return          
			mCircleDiameter = (int)(40F * displaymetrics.density);
	//   33   63:aload_0         
	//   34   64:ldc1            #203 <Float 40F>
	//   35   66:aload_2         
	//   36   67:getfield        #208 <Field float DisplayMetrics.density>
	//   37   70:fmul            
	//   38   71:f2i             
	//   39   72:putfield        #210 <Field int mCircleDiameter>
		mCircleView.setImageDrawable(((Drawable) (null)));
		mProgress.setStyle(i);
		mCircleView.setImageDrawable(((Drawable) (mProgress)));
	//*  40   75:goto            35
	}

	void setTargetOffsetTopAndBottom(int i)
	{
		mCircleView.bringToFront();
	//    0    0:aload_0         
	//    1    1:getfield        #285 <Field CircleImageView mCircleView>
	//    2    4:invokevirtual   #745 <Method void CircleImageView.bringToFront()>
		ViewCompat.offsetTopAndBottom(((View) (mCircleView)), i);
	//    3    7:aload_0         
	//    4    8:getfield        #285 <Field CircleImageView mCircleView>
	//    5   11:iload_1         
	//    6   12:invokestatic    #749 <Method void ViewCompat.offsetTopAndBottom(View, int)>
		mCurrentTargetOffsetTop = mCircleView.getTop();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #285 <Field CircleImageView mCircleView>
	//   10   20:invokevirtual   #558 <Method int CircleImageView.getTop()>
	//   11   23:putfield        #241 <Field int mCurrentTargetOffsetTop>
	//   12   26:return          
	}

	public boolean startNestedScroll(int i)
	{
		return mNestedScrollingChildHelper.startNestedScroll(i);
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #750 <Method boolean NestedScrollingChildHelper.startNestedScroll(int)>
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
	//    4    6:invokespecial   #751 <Method void SwipeRefreshLayout$3(SwipeRefreshLayout)>
	//    5    9:putfield        #753 <Field Animation mScaleDownAnimation>
		mScaleDownAnimation.setDuration(150L);
	//    6   12:aload_0         
	//    7   13:getfield        #753 <Field Animation mScaleDownAnimation>
	//    8   16:ldc2w           #494 <Long 150L>
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
	//   20   42:getfield        #753 <Field Animation mScaleDownAnimation>
	//   21   45:invokevirtual   #298 <Method void CircleImageView.startAnimation(Animation)>
	//   22   48:return          
	}

	public void stopNestedScroll()
	{
		mNestedScrollingChildHelper.stopNestedScroll();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field NestedScrollingChildHelper mNestedScrollingChildHelper>
	//    2    4:invokevirtual   #754 <Method void NestedScrollingChildHelper.stopNestedScroll()>
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
