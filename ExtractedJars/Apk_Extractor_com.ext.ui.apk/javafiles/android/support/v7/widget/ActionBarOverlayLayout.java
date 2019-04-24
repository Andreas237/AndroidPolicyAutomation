// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.*;
import android.widget.OverScroller;

// Referenced classes of package android.support.v7.widget:
//			DecorContentParent, DecorToolbar, Toolbar, ActionBarContainer, 
//			ViewUtils, ContentFrameLayout

public class ActionBarOverlayLayout extends ViewGroup
	implements NestedScrollingParent, DecorContentParent
{
	public static interface ActionBarVisibilityCallback
	{

		public abstract void enableContentAnimations(boolean flag);

		public abstract void hideForSystem();

		public abstract void onContentScrollStarted();

		public abstract void onContentScrollStopped();

		public abstract void onWindowVisibilityChanged(int i);

		public abstract void showForSystem();
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #11  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		//    4    6:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		//    4    6:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #18  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		//    3    5:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #21  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
		//    3    5:return          
		}
	}


	public ActionBarOverlayLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #87  <Method void ActionBarOverlayLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #88  <Method void ViewGroup(Context, AttributeSet)>
		mWindowVisibility = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #90  <Field int mWindowVisibility>
		mBaseContentInsets = new Rect();
	//    7   11:aload_0         
	//    8   12:new             #92  <Class Rect>
	//    9   15:dup             
	//   10   16:invokespecial   #94  <Method void Rect()>
	//   11   19:putfield        #96  <Field Rect mBaseContentInsets>
		mLastBaseContentInsets = new Rect();
	//   12   22:aload_0         
	//   13   23:new             #92  <Class Rect>
	//   14   26:dup             
	//   15   27:invokespecial   #94  <Method void Rect()>
	//   16   30:putfield        #98  <Field Rect mLastBaseContentInsets>
		mContentInsets = new Rect();
	//   17   33:aload_0         
	//   18   34:new             #92  <Class Rect>
	//   19   37:dup             
	//   20   38:invokespecial   #94  <Method void Rect()>
	//   21   41:putfield        #100 <Field Rect mContentInsets>
		mBaseInnerInsets = new Rect();
	//   22   44:aload_0         
	//   23   45:new             #92  <Class Rect>
	//   24   48:dup             
	//   25   49:invokespecial   #94  <Method void Rect()>
	//   26   52:putfield        #102 <Field Rect mBaseInnerInsets>
		mLastBaseInnerInsets = new Rect();
	//   27   55:aload_0         
	//   28   56:new             #92  <Class Rect>
	//   29   59:dup             
	//   30   60:invokespecial   #94  <Method void Rect()>
	//   31   63:putfield        #104 <Field Rect mLastBaseInnerInsets>
		mInnerInsets = new Rect();
	//   32   66:aload_0         
	//   33   67:new             #92  <Class Rect>
	//   34   70:dup             
	//   35   71:invokespecial   #94  <Method void Rect()>
	//   36   74:putfield        #106 <Field Rect mInnerInsets>
		mLastInnerInsets = new Rect();
	//   37   77:aload_0         
	//   38   78:new             #92  <Class Rect>
	//   39   81:dup             
	//   40   82:invokespecial   #94  <Method void Rect()>
	//   41   85:putfield        #108 <Field Rect mLastInnerInsets>
		ACTION_BAR_ANIMATE_DELAY = 600;
	//   42   88:aload_0         
	//   43   89:sipush          600
	//   44   92:putfield        #110 <Field int ACTION_BAR_ANIMATE_DELAY>
		mTopAnimatorListener = ((AnimatorListenerAdapter) (new AnimatorListenerAdapter() {

			public void onAnimationCancel(Animator animator)
			{
				mCurrentActionBarTopAnimator = null;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field ActionBarOverlayLayout this$0>
			//    2    4:aconst_null     
			//    3    5:putfield        #22  <Field ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
				mAnimatingForFling = false;
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field ActionBarOverlayLayout this$0>
			//    6   12:iconst_0        
			//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.mAnimatingForFling>
			//    8   16:return          
			}

			public void onAnimationEnd(Animator animator)
			{
				mCurrentActionBarTopAnimator = null;
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field ActionBarOverlayLayout this$0>
			//    2    4:aconst_null     
			//    3    5:putfield        #22  <Field ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
				mAnimatingForFling = false;
			//    4    8:aload_0         
			//    5    9:getfield        #12  <Field ActionBarOverlayLayout this$0>
			//    6   12:iconst_0        
			//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.mAnimatingForFling>
			//    8   16:return          
			}

			final ActionBarOverlayLayout this$0;

			
			{
				this$0 = ActionBarOverlayLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field ActionBarOverlayLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
));
	//   45   95:aload_0         
	//   46   96:new             #10  <Class ActionBarOverlayLayout$1>
	//   47   99:dup             
	//   48  100:aload_0         
	//   49  101:invokespecial   #113 <Method void ActionBarOverlayLayout$1(ActionBarOverlayLayout)>
	//   50  104:putfield        #115 <Field AnimatorListenerAdapter mTopAnimatorListener>
		mRemoveActionBarHideOffset = new Runnable() {

			public void run()
			{
				haltActionBarHideOffsetAnimations();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//    2    4:invokevirtual   #22  <Method void ActionBarOverlayLayout.haltActionBarHideOffsetAnimations()>
				mCurrentActionBarTopAnimator = mActionBarTop.animate().translationY(0.0F).setListener(((android.animation.Animator.AnimatorListener) (mTopAnimatorListener)));
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//    7   15:getfield        #26  <Field ActionBarContainer ActionBarOverlayLayout.mActionBarTop>
			//    8   18:invokevirtual   #32  <Method ViewPropertyAnimator ActionBarContainer.animate()>
			//    9   21:fconst_0        
			//   10   22:invokevirtual   #38  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
			//   11   25:aload_0         
			//   12   26:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//   13   29:getfield        #42  <Field AnimatorListenerAdapter ActionBarOverlayLayout.mTopAnimatorListener>
			//   14   32:invokevirtual   #46  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
			//   15   35:putfield        #50  <Field ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
			//   16   38:return          
			}

			final ActionBarOverlayLayout this$0;

			
			{
				this$0 = ActionBarOverlayLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActionBarOverlayLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   51  107:aload_0         
	//   52  108:new             #12  <Class ActionBarOverlayLayout$2>
	//   53  111:dup             
	//   54  112:aload_0         
	//   55  113:invokespecial   #116 <Method void ActionBarOverlayLayout$2(ActionBarOverlayLayout)>
	//   56  116:putfield        #118 <Field Runnable mRemoveActionBarHideOffset>
		mAddActionBarHideOffset = new Runnable() {

			public void run()
			{
				haltActionBarHideOffsetAnimations();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//    2    4:invokevirtual   #22  <Method void ActionBarOverlayLayout.haltActionBarHideOffsetAnimations()>
				mCurrentActionBarTopAnimator = mActionBarTop.animate().translationY(-mActionBarTop.getHeight()).setListener(((android.animation.Animator.AnimatorListener) (mTopAnimatorListener)));
			//    3    7:aload_0         
			//    4    8:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//    5   11:aload_0         
			//    6   12:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//    7   15:getfield        #26  <Field ActionBarContainer ActionBarOverlayLayout.mActionBarTop>
			//    8   18:invokevirtual   #32  <Method ViewPropertyAnimator ActionBarContainer.animate()>
			//    9   21:aload_0         
			//   10   22:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//   11   25:getfield        #26  <Field ActionBarContainer ActionBarOverlayLayout.mActionBarTop>
			//   12   28:invokevirtual   #36  <Method int ActionBarContainer.getHeight()>
			//   13   31:ineg            
			//   14   32:i2f             
			//   15   33:invokevirtual   #42  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
			//   16   36:aload_0         
			//   17   37:getfield        #14  <Field ActionBarOverlayLayout this$0>
			//   18   40:getfield        #46  <Field AnimatorListenerAdapter ActionBarOverlayLayout.mTopAnimatorListener>
			//   19   43:invokevirtual   #50  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
			//   20   46:putfield        #54  <Field ViewPropertyAnimator ActionBarOverlayLayout.mCurrentActionBarTopAnimator>
			//   21   49:return          
			}

			final ActionBarOverlayLayout this$0;

			
			{
				this$0 = ActionBarOverlayLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field ActionBarOverlayLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//   57  119:aload_0         
	//   58  120:new             #14  <Class ActionBarOverlayLayout$3>
	//   59  123:dup             
	//   60  124:aload_0         
	//   61  125:invokespecial   #119 <Method void ActionBarOverlayLayout$3(ActionBarOverlayLayout)>
	//   62  128:putfield        #121 <Field Runnable mAddActionBarHideOffset>
		init(context);
	//   63  131:aload_0         
	//   64  132:aload_1         
	//   65  133:invokespecial   #124 <Method void init(Context)>
		mParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   66  136:aload_0         
	//   67  137:new             #126 <Class NestedScrollingParentHelper>
	//   68  140:dup             
	//   69  141:aload_0         
	//   70  142:invokespecial   #129 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   71  145:putfield        #131 <Field NestedScrollingParentHelper mParentHelper>
	//   72  148:return          
	}

	private void addActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
		mAddActionBarHideOffset.run();
	//    2    4:aload_0         
	//    3    5:getfield        #121 <Field Runnable mAddActionBarHideOffset>
	//    4    8:invokeinterface #140 <Method void Runnable.run()>
	//    5   13:return          
	}

	private boolean applyInsets(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		boolean flag5 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    2    3:aload_1         
	//    3    4:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    7:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    5   10:astore_1        
		boolean flag4 = flag5;
	//    6   11:iload           8
	//    7   13:istore          7
		if(flag)
	//*   8   15:iload_3         
	//*   9   16:ifeq            45
		{
			flag4 = flag5;
	//   10   19:iload           8
	//   11   21:istore          7
			if(((LayoutParams) (view)).leftMargin != rect.left)
	//*  12   23:aload_1         
	//*  13   24:getfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//*  14   27:aload_2         
	//*  15   28:getfield        #154 <Field int Rect.left>
	//*  16   31:icmpeq          45
			{
				view.leftMargin = rect.left;
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:getfield        #154 <Field int Rect.left>
	//   20   39:putfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
				flag4 = true;
	//   21   42:iconst_1        
	//   22   43:istore          7
			}
		}
		flag = flag4;
	//   23   45:iload           7
	//   24   47:istore_3        
		if(flag1)
	//*  25   48:iload           4
	//*  26   50:ifeq            77
		{
			flag = flag4;
	//   27   53:iload           7
	//   28   55:istore_3        
			if(((LayoutParams) (view)).topMargin != rect.top)
	//*  29   56:aload_1         
	//*  30   57:getfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//*  31   60:aload_2         
	//*  32   61:getfield        #160 <Field int Rect.top>
	//*  33   64:icmpeq          77
			{
				view.topMargin = rect.top;
	//   34   67:aload_1         
	//   35   68:aload_2         
	//   36   69:getfield        #160 <Field int Rect.top>
	//   37   72:putfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
				flag = true;
	//   38   75:iconst_1        
	//   39   76:istore_3        
			}
		}
		flag1 = flag;
	//   40   77:iload_3         
	//   41   78:istore          4
		if(flag3)
	//*  42   80:iload           6
	//*  43   82:ifeq            110
		{
			flag1 = flag;
	//   44   85:iload_3         
	//   45   86:istore          4
			if(((LayoutParams) (view)).rightMargin != rect.right)
	//*  46   88:aload_1         
	//*  47   89:getfield        #163 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//*  48   92:aload_2         
	//*  49   93:getfield        #166 <Field int Rect.right>
	//*  50   96:icmpeq          110
			{
				view.rightMargin = rect.right;
	//   51   99:aload_1         
	//   52  100:aload_2         
	//   53  101:getfield        #166 <Field int Rect.right>
	//   54  104:putfield        #163 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
				flag1 = true;
	//   55  107:iconst_1        
	//   56  108:istore          4
			}
		}
		if(flag2 && ((LayoutParams) (view)).bottomMargin != rect.bottom)
	//*  57  110:iload           5
	//*  58  112:ifeq            136
	//*  59  115:aload_1         
	//*  60  116:getfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//*  61  119:aload_2         
	//*  62  120:getfield        #172 <Field int Rect.bottom>
	//*  63  123:icmpeq          136
		{
			view.bottomMargin = rect.bottom;
	//   64  126:aload_1         
	//   65  127:aload_2         
	//   66  128:getfield        #172 <Field int Rect.bottom>
	//   67  131:putfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
			return true;
	//   68  134:iconst_1        
	//   69  135:ireturn         
		} else
		{
			return flag1;
	//   70  136:iload           4
	//   71  138:ireturn         
		}
	}

	private DecorToolbar getDecorToolbar(View view)
	{
		if(view instanceof DecorToolbar)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #176 <Class DecorToolbar>
	//*   2    4:ifeq            12
			return (DecorToolbar)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #176 <Class DecorToolbar>
	//    5   11:areturn         
		if(view instanceof Toolbar)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #178 <Class Toolbar>
	//*   8   16:ifeq            27
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #178 <Class Toolbar>
	//   11   23:invokevirtual   #182 <Method DecorToolbar Toolbar.getWrapper()>
	//   12   26:areturn         
		else
			throw new IllegalStateException((new StringBuilder()).append("Can't make a decor toolbar out of ").append(((Object) (view)).getClass().getSimpleName()).toString());
	//   13   27:new             #184 <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:new             #186 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #187 <Method void StringBuilder()>
	//   18   38:ldc1            #189 <String "Can't make a decor toolbar out of ">
	//   19   40:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:aload_1         
	//   21   44:invokevirtual   #199 <Method Class Object.getClass()>
	//   22   47:invokevirtual   #205 <Method String Class.getSimpleName()>
	//   23   50:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:invokevirtual   #208 <Method String StringBuilder.toString()>
	//   25   56:invokespecial   #211 <Method void IllegalStateException(String)>
	//   26   59:athrow          
	}

	private void init(Context context)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(ATTRS);
	//    2    2:aload_0         
	//    3    3:invokevirtual   #215 <Method Context getContext()>
	//    4    6:invokevirtual   #221 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    5    9:getstatic       #81  <Field int[] ATTRS>
	//    6   12:invokevirtual   #227 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int[])>
	//    7   15:astore          4
		mActionBarHeight = typedarray.getDimensionPixelSize(0, 0);
	//    8   17:aload_0         
	//    9   18:aload           4
	//   10   20:iconst_0        
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #233 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   13   25:putfield        #235 <Field int mActionBarHeight>
		mWindowContentOverlay = typedarray.getDrawable(1);
	//   14   28:aload_0         
	//   15   29:aload           4
	//   16   31:iconst_1        
	//   17   32:invokevirtual   #239 <Method Drawable TypedArray.getDrawable(int)>
	//   18   35:putfield        #241 <Field Drawable mWindowContentOverlay>
		boolean flag;
		if(mWindowContentOverlay == null)
	//*  19   38:aload_0         
	//*  20   39:getfield        #241 <Field Drawable mWindowContentOverlay>
	//*  21   42:ifnonnull       89
			flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_2        
		else
	//*  24   47:aload_0         
	//*  25   48:iload_2         
	//*  26   49:invokevirtual   #245 <Method void setWillNotDraw(boolean)>
	//*  27   52:aload           4
	//*  28   54:invokevirtual   #248 <Method void TypedArray.recycle()>
	//*  29   57:aload_1         
	//*  30   58:invokevirtual   #252 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  31   61:getfield        #257 <Field int ApplicationInfo.targetSdkVersion>
	//*  32   64:bipush          19
	//*  33   66:icmpge          94
	//*  34   69:iload_3         
	//*  35   70:istore_2        
	//*  36   71:aload_0         
	//*  37   72:iload_2         
	//*  38   73:putfield        #259 <Field boolean mIgnoreWindowContentOverlay>
	//*  39   76:aload_0         
	//*  40   77:new             #261 <Class OverScroller>
	//*  41   80:dup             
	//*  42   81:aload_1         
	//*  43   82:invokespecial   #263 <Method void OverScroller(Context)>
	//*  44   85:putfield        #265 <Field OverScroller mFlingEstimator>
	//*  45   88:return          
			flag = false;
	//   46   89:iconst_0        
	//   47   90:istore_2        
		setWillNotDraw(flag);
		typedarray.recycle();
		if(context.getApplicationInfo().targetSdkVersion < 19)
			flag = flag1;
		else
	//*  48   91:goto            47
			flag = false;
	//   49   94:iconst_0        
	//   50   95:istore_2        
		mIgnoreWindowContentOverlay = flag;
		mFlingEstimator = new OverScroller(context);
	//*  51   96:goto            71
	}

	private void postAddActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
		postDelayed(mAddActionBarHideOffset, 600L);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #121 <Field Runnable mAddActionBarHideOffset>
	//    5    9:ldc2w           #267 <Long 600L>
	//    6   12:invokevirtual   #272 <Method boolean postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void postRemoveActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
		postDelayed(mRemoveActionBarHideOffset, 600L);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #118 <Field Runnable mRemoveActionBarHideOffset>
	//    5    9:ldc2w           #267 <Long 600L>
	//    6   12:invokevirtual   #272 <Method boolean postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void removeActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
		mRemoveActionBarHideOffset.run();
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field Runnable mRemoveActionBarHideOffset>
	//    4    8:invokeinterface #140 <Method void Runnable.run()>
	//    5   13:return          
	}

	private boolean shouldHideActionBarOnFling(float f, float f1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		mFlingEstimator.fling(0, 0, 0, (int)f1, 0, 0, 0x80000000, 0x7fffffff);
	//    2    2:aload_0         
	//    3    3:getfield        #265 <Field OverScroller mFlingEstimator>
	//    4    6:iconst_0        
	//    5    7:iconst_0        
	//    6    8:iconst_0        
	//    7    9:fload_2         
	//    8   10:f2i             
	//    9   11:iconst_0        
	//   10   12:iconst_0        
	//   11   13:ldc2            #277 <Int 0x80000000>
	//   12   16:ldc2            #278 <Int 0x7fffffff>
	//   13   19:invokevirtual   #282 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		if(mFlingEstimator.getFinalY() > mActionBarTop.getHeight())
	//*  14   22:aload_0         
	//*  15   23:getfield        #265 <Field OverScroller mFlingEstimator>
	//*  16   26:invokevirtual   #286 <Method int OverScroller.getFinalY()>
	//*  17   29:aload_0         
	//*  18   30:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  19   33:invokevirtual   #293 <Method int ActionBarContainer.getHeight()>
	//*  20   36:icmple          41
			flag = true;
	//   21   39:iconst_1        
	//   22   40:istore_3        
		return flag;
	//   23   41:iload_3         
	//   24   42:ireturn         
	}

	public boolean canShowOverflowMenu()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.canShowOverflowMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #302 <Method boolean DecorToolbar.canShowOverflowMenu()>
	//    5   13:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    2    4:ireturn         
	}

	public void dismissPopups()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.dismissPopupMenus();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #308 <Method void DecorToolbar.dismissPopupMenus()>
	//    5   13:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #312 <Method void ViewGroup.draw(Canvas)>
		if(mWindowContentOverlay != null && !mIgnoreWindowContentOverlay)
	//*   3    5:aload_0         
	//*   4    6:getfield        #241 <Field Drawable mWindowContentOverlay>
	//*   5    9:ifnull          81
	//*   6   12:aload_0         
	//*   7   13:getfield        #259 <Field boolean mIgnoreWindowContentOverlay>
	//*   8   16:ifne            81
		{
			int i;
			if(mActionBarTop.getVisibility() == 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  11   23:invokevirtual   #315 <Method int ActionBarContainer.getVisibility()>
	//*  12   26:ifne            82
				i = (int)((float)mActionBarTop.getBottom() + mActionBarTop.getTranslationY() + 0.5F);
	//   13   29:aload_0         
	//   14   30:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   15   33:invokevirtual   #318 <Method int ActionBarContainer.getBottom()>
	//   16   36:i2f             
	//   17   37:aload_0         
	//   18   38:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   19   41:invokevirtual   #322 <Method float ActionBarContainer.getTranslationY()>
	//   20   44:fadd            
	//   21   45:ldc2            #323 <Float 0.5F>
	//   22   48:fadd            
	//   23   49:f2i             
	//   24   50:istore_2        
			else
	//*  25   51:aload_0         
	//*  26   52:getfield        #241 <Field Drawable mWindowContentOverlay>
	//*  27   55:iconst_0        
	//*  28   56:iload_2         
	//*  29   57:aload_0         
	//*  30   58:invokevirtual   #326 <Method int getWidth()>
	//*  31   61:aload_0         
	//*  32   62:getfield        #241 <Field Drawable mWindowContentOverlay>
	//*  33   65:invokevirtual   #331 <Method int Drawable.getIntrinsicHeight()>
	//*  34   68:iload_2         
	//*  35   69:iadd            
	//*  36   70:invokevirtual   #335 <Method void Drawable.setBounds(int, int, int, int)>
	//*  37   73:aload_0         
	//*  38   74:getfield        #241 <Field Drawable mWindowContentOverlay>
	//*  39   77:aload_1         
	//*  40   78:invokevirtual   #336 <Method void Drawable.draw(Canvas)>
	//*  41   81:return          
				i = 0;
	//   42   82:iconst_0        
	//   43   83:istore_2        
			mWindowContentOverlay.setBounds(0, i, getWidth(), mWindowContentOverlay.getIntrinsicHeight() + i);
			mWindowContentOverlay.draw(canvas);
		}
	//*  44   84:goto            51
	}

	protected boolean fitSystemWindows(Rect rect)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		if((ViewCompat.getWindowSystemUiVisibility(((View) (this))) & 0x100) == 0);
	//    2    4:aload_0         
	//    3    5:invokestatic    #344 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//    4    8:sipush          256
	//    5   11:iand            
	//    6   12:ifeq            15
		boolean flag = applyInsets(((View) (mActionBarTop)), rect, true, true, false, true);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   10   20:aload_1         
	//   11   21:iconst_1        
	//   12   22:iconst_1        
	//   13   23:iconst_0        
	//   14   24:iconst_1        
	//   15   25:invokespecial   #346 <Method boolean applyInsets(View, Rect, boolean, boolean, boolean, boolean)>
	//   16   28:istore_2        
		mBaseInnerInsets.set(rect);
	//   17   29:aload_0         
	//   18   30:getfield        #102 <Field Rect mBaseInnerInsets>
	//   19   33:aload_1         
	//   20   34:invokevirtual   #350 <Method void Rect.set(Rect)>
		ViewUtils.computeFitSystemWindows(((View) (this)), mBaseInnerInsets, mBaseContentInsets);
	//   21   37:aload_0         
	//   22   38:aload_0         
	//   23   39:getfield        #102 <Field Rect mBaseInnerInsets>
	//   24   42:aload_0         
	//   25   43:getfield        #96  <Field Rect mBaseContentInsets>
	//   26   46:invokestatic    #356 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
		if(!mLastBaseInnerInsets.equals(((Object) (mBaseInnerInsets))))
	//*  27   49:aload_0         
	//*  28   50:getfield        #104 <Field Rect mLastBaseInnerInsets>
	//*  29   53:aload_0         
	//*  30   54:getfield        #102 <Field Rect mBaseInnerInsets>
	//*  31   57:invokevirtual   #360 <Method boolean Rect.equals(Object)>
	//*  32   60:ifne            76
		{
			mLastBaseInnerInsets.set(mBaseInnerInsets);
	//   33   63:aload_0         
	//   34   64:getfield        #104 <Field Rect mLastBaseInnerInsets>
	//   35   67:aload_0         
	//   36   68:getfield        #102 <Field Rect mBaseInnerInsets>
	//   37   71:invokevirtual   #350 <Method void Rect.set(Rect)>
			flag = true;
	//   38   74:iconst_1        
	//   39   75:istore_2        
		}
		if(!mLastBaseContentInsets.equals(((Object) (mBaseContentInsets))))
	//*  40   76:aload_0         
	//*  41   77:getfield        #98  <Field Rect mLastBaseContentInsets>
	//*  42   80:aload_0         
	//*  43   81:getfield        #96  <Field Rect mBaseContentInsets>
	//*  44   84:invokevirtual   #360 <Method boolean Rect.equals(Object)>
	//*  45   87:ifne            103
		{
			mLastBaseContentInsets.set(mBaseContentInsets);
	//   46   90:aload_0         
	//   47   91:getfield        #98  <Field Rect mLastBaseContentInsets>
	//   48   94:aload_0         
	//   49   95:getfield        #96  <Field Rect mBaseContentInsets>
	//   50   98:invokevirtual   #350 <Method void Rect.set(Rect)>
			flag = true;
	//   51  101:iconst_1        
	//   52  102:istore_2        
		}
		if(flag)
	//*  53  103:iload_2         
	//*  54  104:ifeq            111
			requestLayout();
	//   55  107:aload_0         
	//   56  108:invokevirtual   #363 <Method void requestLayout()>
		return true;
	//   57  111:iconst_1        
	//   58  112:ireturn         
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-1, -1);
	//    0    0:new             #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #368 <Method void ActionBarOverlayLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #370 <Method ActionBarOverlayLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #215 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #373 <Method void ActionBarOverlayLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #376 <Method ActionBarOverlayLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #380 <Method void ActionBarOverlayLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getActionBarHideOffset()
	{
		if(mActionBarTop != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*   2    4:ifnull          17
			return -(int)mActionBarTop.getTranslationY();
	//    3    7:aload_0         
	//    4    8:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//    5   11:invokevirtual   #322 <Method float ActionBarContainer.getTranslationY()>
	//    6   14:f2i             
	//    7   15:ineg            
	//    8   16:ireturn         
		else
			return 0;
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public int getNestedScrollAxes()
	{
		return mParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:invokevirtual   #384 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	public CharSequence getTitle()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.getTitle();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #388 <Method CharSequence DecorToolbar.getTitle()>
	//    5   13:areturn         
	}

	void haltActionBarHideOffsetAnimations()
	{
		removeCallbacks(mRemoveActionBarHideOffset);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #118 <Field Runnable mRemoveActionBarHideOffset>
	//    3    5:invokevirtual   #392 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		removeCallbacks(mAddActionBarHideOffset);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #121 <Field Runnable mAddActionBarHideOffset>
	//    8   14:invokevirtual   #392 <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
		if(mCurrentActionBarTopAnimator != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #394 <Field ViewPropertyAnimator mCurrentActionBarTopAnimator>
	//*  12   22:ifnull          32
			mCurrentActionBarTopAnimator.cancel();
	//   13   25:aload_0         
	//   14   26:getfield        #394 <Field ViewPropertyAnimator mCurrentActionBarTopAnimator>
	//   15   29:invokevirtual   #399 <Method void ViewPropertyAnimator.cancel()>
	//   16   32:return          
	}

	public boolean hasIcon()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.hasIcon();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #402 <Method boolean DecorToolbar.hasIcon()>
	//    5   13:ireturn         
	}

	public boolean hasLogo()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.hasLogo();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #405 <Method boolean DecorToolbar.hasLogo()>
	//    5   13:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.hideOverflowMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #408 <Method boolean DecorToolbar.hideOverflowMenu()>
	//    5   13:ireturn         
	}

	public void initFeature(int i)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		switch(i)
	//*   2    4:iload_1         
		{
	//*   3    5:lookupswitch    3: default 40
	//	               2: 41
	//	               5: 51
	//	               109: 61
		default:
			return;
	//    4   40:return          

		case 2: // '\002'
			mDecorToolbar.initProgress();
	//    5   41:aload_0         
	//    6   42:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    7   45:invokeinterface #413 <Method void DecorToolbar.initProgress()>
			return;
	//    8   50:return          

		case 5: // '\005'
			mDecorToolbar.initIndeterminateProgress();
	//    9   51:aload_0         
	//   10   52:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//   11   55:invokeinterface #416 <Method void DecorToolbar.initIndeterminateProgress()>
			return;
	//   12   60:return          

		case 109: // 'm'
			setOverlayMode(true);
	//   13   61:aload_0         
	//   14   62:iconst_1        
	//   15   63:invokevirtual   #419 <Method void setOverlayMode(boolean)>
			break;
		}
	//   16   66:return          
	}

	public boolean isHideOnContentScrollEnabled()
	{
		return mHideOnContentScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #422 <Field boolean mHideOnContentScroll>
	//    2    4:ireturn         
	}

	public boolean isInOverlayMode()
	{
		return mOverlayMode;
	//    0    0:aload_0         
	//    1    1:getfield        #425 <Field boolean mOverlayMode>
	//    2    4:ireturn         
	}

	public boolean isOverflowMenuShowPending()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.isOverflowMenuShowPending();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #428 <Method boolean DecorToolbar.isOverflowMenuShowPending()>
	//    5   13:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.isOverflowMenuShowing();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #431 <Method boolean DecorToolbar.isOverflowMenuShowing()>
	//    5   13:ireturn         
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #435 <Method void ViewGroup.onConfigurationChanged(Configuration)>
		init(getContext());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #215 <Method Context getContext()>
	//    6   10:invokespecial   #124 <Method void init(Context)>
		ViewCompat.requestApplyInsets(((View) (this)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #439 <Method void ViewCompat.requestApplyInsets(View)>
	//    9   17:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #442 <Method void ViewGroup.onDetachedFromWindow()>
		haltActionBarHideOffsetAnimations();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
	//    4    8:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #447 <Method int getChildCount()>
	//    2    4:istore_3        
		k = getPaddingLeft();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #450 <Method int getPaddingLeft()>
	//    5    9:istore          4
		getPaddingRight();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #453 <Method int getPaddingRight()>
	//    8   15:pop             
		l = getPaddingTop();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #456 <Method int getPaddingTop()>
	//   11   20:istore          5
		getPaddingBottom();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #459 <Method int getPaddingBottom()>
	//   14   26:pop             
		for(i = 0; i < j; i++)
	//*  15   27:iconst_0        
	//*  16   28:istore_2        
	//*  17   29:iload_2         
	//*  18   30:iload_3         
	//*  19   31:icmpge          121
		{
			View view = getChildAt(i);
	//   20   34:aload_0         
	//   21   35:iload_2         
	//   22   36:invokevirtual   #463 <Method View getChildAt(int)>
	//   23   39:astore          10
			if(view.getVisibility() != 8)
	//*  24   41:aload           10
	//*  25   43:invokevirtual   #464 <Method int View.getVisibility()>
	//*  26   46:bipush          8
	//*  27   48:icmpeq          114
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   28   51:aload           10
	//   29   53:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   56:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//   31   59:astore          11
				int i1 = view.getMeasuredWidth();
	//   32   61:aload           10
	//   33   63:invokevirtual   #467 <Method int View.getMeasuredWidth()>
	//   34   66:istore          6
				int j1 = view.getMeasuredHeight();
	//   35   68:aload           10
	//   36   70:invokevirtual   #470 <Method int View.getMeasuredHeight()>
	//   37   73:istore          7
				int k1 = layoutparams.leftMargin + k;
	//   38   75:aload           11
	//   39   77:getfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//   40   80:iload           4
	//   41   82:iadd            
	//   42   83:istore          8
				int l1 = layoutparams.topMargin + l;
	//   43   85:aload           11
	//   44   87:getfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//   45   90:iload           5
	//   46   92:iadd            
	//   47   93:istore          9
				view.layout(k1, l1, i1 + k1, j1 + l1);
	//   48   95:aload           10
	//   49   97:iload           8
	//   50   99:iload           9
	//   51  101:iload           6
	//   52  103:iload           8
	//   53  105:iadd            
	//   54  106:iload           7
	//   55  108:iload           9
	//   56  110:iadd            
	//   57  111:invokevirtual   #473 <Method void View.layout(int, int, int, int)>
			}
		}

	//   58  114:iload_2         
	//   59  115:iconst_1        
	//   60  116:iadd            
	//   61  117:istore_2        
	//*  62  118:goto            29
	//   63  121:return          
	}

	protected void onMeasure(int i, int j)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		measureChildWithMargins(((View) (mActionBarTop)), i, 0, j, 0);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//    5    9:iload_1         
	//    6   10:iconst_0        
	//    7   11:iload_2         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #478 <Method void measureChildWithMargins(View, int, int, int, int)>
		Object obj = ((Object) ((LayoutParams)mActionBarTop.getLayoutParams()));
	//   10   16:aload_0         
	//   11   17:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   12   20:invokevirtual   #479 <Method android.view.ViewGroup$LayoutParams ActionBarContainer.getLayoutParams()>
	//   13   23:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//   14   26:astore          9
		int i2 = Math.max(0, mActionBarTop.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
	//   15   28:iconst_0        
	//   16   29:aload_0         
	//   17   30:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   18   33:invokevirtual   #480 <Method int ActionBarContainer.getMeasuredWidth()>
	//   19   36:aload           9
	//   20   38:getfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//   21   41:iadd            
	//   22   42:aload           9
	//   23   44:getfield        #163 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//   24   47:iadd            
	//   25   48:invokestatic    #485 <Method int Math.max(int, int)>
	//   26   51:istore          8
		int k = mActionBarTop.getMeasuredHeight();
	//   27   53:aload_0         
	//   28   54:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   29   57:invokevirtual   #486 <Method int ActionBarContainer.getMeasuredHeight()>
	//   30   60:istore_3        
		int l = ((LayoutParams) (obj)).topMargin;
	//   31   61:aload           9
	//   32   63:getfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//   33   66:istore          4
		int l1 = Math.max(0, ((LayoutParams) (obj)).bottomMargin + (k + l));
	//   34   68:iconst_0        
	//   35   69:aload           9
	//   36   71:getfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//   37   74:iload_3         
	//   38   75:iload           4
	//   39   77:iadd            
	//   40   78:iadd            
	//   41   79:invokestatic    #485 <Method int Math.max(int, int)>
	//   42   82:istore          7
		int k1 = View.combineMeasuredStates(0, mActionBarTop.getMeasuredState());
	//   43   84:iconst_0        
	//   44   85:aload_0         
	//   45   86:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   46   89:invokevirtual   #489 <Method int ActionBarContainer.getMeasuredState()>
	//   47   92:invokestatic    #492 <Method int View.combineMeasuredStates(int, int)>
	//   48   95:istore          6
		int j1;
		if((ViewCompat.getWindowSystemUiVisibility(((View) (this))) & 0x100) != 0)
	//*  49   97:aload_0         
	//*  50   98:invokestatic    #344 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//*  51  101:sipush          256
	//*  52  104:iand            
	//*  53  105:ifeq            442
			l = 1;
	//   54  108:iconst_1        
	//   55  109:istore          4
		else
	//*  56  111:iload           4
	//*  57  113:ifeq            448
	//*  58  116:aload_0         
	//*  59  117:getfield        #235 <Field int mActionBarHeight>
	//*  60  120:istore          5
	//*  61  122:iload           5
	//*  62  124:istore_3        
	//*  63  125:aload_0         
	//*  64  126:getfield        #494 <Field boolean mHasNonEmbeddedTabs>
	//*  65  129:ifeq            153
	//*  66  132:iload           5
	//*  67  134:istore_3        
	//*  68  135:aload_0         
	//*  69  136:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  70  139:invokevirtual   #498 <Method View ActionBarContainer.getTabContainer()>
	//*  71  142:ifnull          153
	//*  72  145:iload           5
	//*  73  147:aload_0         
	//*  74  148:getfield        #235 <Field int mActionBarHeight>
	//*  75  151:iadd            
	//*  76  152:istore_3        
	//*  77  153:aload_0         
	//*  78  154:getfield        #100 <Field Rect mContentInsets>
	//*  79  157:aload_0         
	//*  80  158:getfield        #96  <Field Rect mBaseContentInsets>
	//*  81  161:invokevirtual   #350 <Method void Rect.set(Rect)>
	//*  82  164:aload_0         
	//*  83  165:getfield        #106 <Field Rect mInnerInsets>
	//*  84  168:aload_0         
	//*  85  169:getfield        #102 <Field Rect mBaseInnerInsets>
	//*  86  172:invokevirtual   #350 <Method void Rect.set(Rect)>
	//*  87  175:aload_0         
	//*  88  176:getfield        #425 <Field boolean mOverlayMode>
	//*  89  179:ifne            471
	//*  90  182:iload           4
	//*  91  184:ifne            471
	//*  92  187:aload_0         
	//*  93  188:getfield        #100 <Field Rect mContentInsets>
	//*  94  191:astore          9
	//*  95  193:aload           9
	//*  96  195:iload_3         
	//*  97  196:aload           9
	//*  98  198:getfield        #160 <Field int Rect.top>
	//*  99  201:iadd            
	//* 100  202:putfield        #160 <Field int Rect.top>
	//* 101  205:aload_0         
	//* 102  206:getfield        #100 <Field Rect mContentInsets>
	//* 103  209:astore          9
	//* 104  211:aload           9
	//* 105  213:aload           9
	//* 106  215:getfield        #172 <Field int Rect.bottom>
	//* 107  218:iconst_0        
	//* 108  219:iadd            
	//* 109  220:putfield        #172 <Field int Rect.bottom>
	//* 110  223:aload_0         
	//* 111  224:aload_0         
	//* 112  225:getfield        #500 <Field ContentFrameLayout mContent>
	//* 113  228:aload_0         
	//* 114  229:getfield        #100 <Field Rect mContentInsets>
	//* 115  232:iconst_1        
	//* 116  233:iconst_1        
	//* 117  234:iconst_1        
	//* 118  235:iconst_1        
	//* 119  236:invokespecial   #346 <Method boolean applyInsets(View, Rect, boolean, boolean, boolean, boolean)>
	//* 120  239:pop             
	//* 121  240:aload_0         
	//* 122  241:getfield        #108 <Field Rect mLastInnerInsets>
	//* 123  244:aload_0         
	//* 124  245:getfield        #106 <Field Rect mInnerInsets>
	//* 125  248:invokevirtual   #360 <Method boolean Rect.equals(Object)>
	//* 126  251:ifne            276
	//* 127  254:aload_0         
	//* 128  255:getfield        #108 <Field Rect mLastInnerInsets>
	//* 129  258:aload_0         
	//* 130  259:getfield        #106 <Field Rect mInnerInsets>
	//* 131  262:invokevirtual   #350 <Method void Rect.set(Rect)>
	//* 132  265:aload_0         
	//* 133  266:getfield        #500 <Field ContentFrameLayout mContent>
	//* 134  269:aload_0         
	//* 135  270:getfield        #106 <Field Rect mInnerInsets>
	//* 136  273:invokevirtual   #505 <Method void ContentFrameLayout.dispatchFitSystemWindows(Rect)>
	//* 137  276:aload_0         
	//* 138  277:aload_0         
	//* 139  278:getfield        #500 <Field ContentFrameLayout mContent>
	//* 140  281:iload_1         
	//* 141  282:iconst_0        
	//* 142  283:iload_2         
	//* 143  284:iconst_0        
	//* 144  285:invokevirtual   #478 <Method void measureChildWithMargins(View, int, int, int, int)>
	//* 145  288:aload_0         
	//* 146  289:getfield        #500 <Field ContentFrameLayout mContent>
	//* 147  292:invokevirtual   #506 <Method android.view.ViewGroup$LayoutParams ContentFrameLayout.getLayoutParams()>
	//* 148  295:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//* 149  298:astore          9
	//* 150  300:iload           8
	//* 151  302:aload_0         
	//* 152  303:getfield        #500 <Field ContentFrameLayout mContent>
	//* 153  306:invokevirtual   #507 <Method int ContentFrameLayout.getMeasuredWidth()>
	//* 154  309:aload           9
	//* 155  311:getfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//* 156  314:iadd            
	//* 157  315:aload           9
	//* 158  317:getfield        #163 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//* 159  320:iadd            
	//* 160  321:invokestatic    #485 <Method int Math.max(int, int)>
	//* 161  324:istore_3        
	//* 162  325:aload_0         
	//* 163  326:getfield        #500 <Field ContentFrameLayout mContent>
	//* 164  329:invokevirtual   #508 <Method int ContentFrameLayout.getMeasuredHeight()>
	//* 165  332:istore          4
	//* 166  334:aload           9
	//* 167  336:getfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//* 168  339:istore          5
	//* 169  341:iload           7
	//* 170  343:aload           9
	//* 171  345:getfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//* 172  348:iload           4
	//* 173  350:iload           5
	//* 174  352:iadd            
	//* 175  353:iadd            
	//* 176  354:invokestatic    #485 <Method int Math.max(int, int)>
	//* 177  357:istore          4
	//* 178  359:iload           6
	//* 179  361:aload_0         
	//* 180  362:getfield        #500 <Field ContentFrameLayout mContent>
	//* 181  365:invokevirtual   #509 <Method int ContentFrameLayout.getMeasuredState()>
	//* 182  368:invokestatic    #492 <Method int View.combineMeasuredStates(int, int)>
	//* 183  371:istore          5
	//* 184  373:aload_0         
	//* 185  374:invokevirtual   #450 <Method int getPaddingLeft()>
	//* 186  377:istore          6
	//* 187  379:aload_0         
	//* 188  380:invokevirtual   #453 <Method int getPaddingRight()>
	//* 189  383:istore          7
	//* 190  385:iload           4
	//* 191  387:aload_0         
	//* 192  388:invokevirtual   #456 <Method int getPaddingTop()>
	//* 193  391:aload_0         
	//* 194  392:invokevirtual   #459 <Method int getPaddingBottom()>
	//* 195  395:iadd            
	//* 196  396:iadd            
	//* 197  397:aload_0         
	//* 198  398:invokevirtual   #512 <Method int getSuggestedMinimumHeight()>
	//* 199  401:invokestatic    #485 <Method int Math.max(int, int)>
	//* 200  404:istore          4
	//* 201  406:aload_0         
	//* 202  407:iload_3         
	//* 203  408:iload           6
	//* 204  410:iload           7
	//* 205  412:iadd            
	//* 206  413:iadd            
	//* 207  414:aload_0         
	//* 208  415:invokevirtual   #515 <Method int getSuggestedMinimumWidth()>
	//* 209  418:invokestatic    #485 <Method int Math.max(int, int)>
	//* 210  421:iload_1         
	//* 211  422:iload           5
	//* 212  424:invokestatic    #519 <Method int View.resolveSizeAndState(int, int, int)>
	//* 213  427:iload           4
	//* 214  429:iload_2         
	//* 215  430:iload           5
	//* 216  432:bipush          16
	//* 217  434:ishl            
	//* 218  435:invokestatic    #519 <Method int View.resolveSizeAndState(int, int, int)>
	//* 219  438:invokevirtual   #522 <Method void setMeasuredDimension(int, int)>
	//* 220  441:return          
			l = 0;
	//  221  442:iconst_0        
	//  222  443:istore          4
		if(l != 0)
		{
			int i1 = mActionBarHeight;
			k = i1;
			if(mHasNonEmbeddedTabs)
			{
				k = i1;
				if(mActionBarTop.getTabContainer() != null)
					k = i1 + mActionBarHeight;
			}
		} else
	//* 223  445:goto            111
		if(mActionBarTop.getVisibility() != 8)
	//* 224  448:aload_0         
	//* 225  449:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//* 226  452:invokevirtual   #315 <Method int ActionBarContainer.getVisibility()>
	//* 227  455:bipush          8
	//* 228  457:icmpeq          510
			k = mActionBarTop.getMeasuredHeight();
	//  229  460:aload_0         
	//  230  461:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//  231  464:invokevirtual   #486 <Method int ActionBarContainer.getMeasuredHeight()>
	//  232  467:istore_3        
		else
	//* 233  468:goto            153
	//* 234  471:aload_0         
	//* 235  472:getfield        #106 <Field Rect mInnerInsets>
	//* 236  475:astore          9
	//* 237  477:aload           9
	//* 238  479:iload_3         
	//* 239  480:aload           9
	//* 240  482:getfield        #160 <Field int Rect.top>
	//* 241  485:iadd            
	//* 242  486:putfield        #160 <Field int Rect.top>
	//* 243  489:aload_0         
	//* 244  490:getfield        #106 <Field Rect mInnerInsets>
	//* 245  493:astore          9
	//* 246  495:aload           9
	//* 247  497:aload           9
	//* 248  499:getfield        #172 <Field int Rect.bottom>
	//* 249  502:iconst_0        
	//* 250  503:iadd            
	//* 251  504:putfield        #172 <Field int Rect.bottom>
	//* 252  507:goto            223
			k = 0;
	//  253  510:iconst_0        
	//  254  511:istore_3        
		mContentInsets.set(mBaseContentInsets);
		mInnerInsets.set(mBaseInnerInsets);
		if(!mOverlayMode && l == 0)
		{
			obj = ((Object) (mContentInsets));
			obj.top = k + ((Rect) (obj)).top;
			obj = ((Object) (mContentInsets));
			obj.bottom = ((Rect) (obj)).bottom + 0;
		} else
		{
			Rect rect = mInnerInsets;
			rect.top = k + rect.top;
			rect = mInnerInsets;
			rect.bottom = rect.bottom + 0;
		}
		applyInsets(((View) (mContent)), mContentInsets, true, true, true, true);
		if(!mLastInnerInsets.equals(((Object) (mInnerInsets))))
		{
			mLastInnerInsets.set(mInnerInsets);
			mContent.dispatchFitSystemWindows(mInnerInsets);
		}
		measureChildWithMargins(((View) (mContent)), i, 0, j, 0);
		obj = ((Object) ((LayoutParams)mContent.getLayoutParams()));
		k = Math.max(i2, mContent.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
		l = mContent.getMeasuredHeight();
		j1 = ((LayoutParams) (obj)).topMargin;
		l = Math.max(l1, ((LayoutParams) (obj)).bottomMargin + (l + j1));
		j1 = View.combineMeasuredStates(k1, mContent.getMeasuredState());
		k1 = getPaddingLeft();
		l1 = getPaddingRight();
		l = Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k + (k1 + l1), getSuggestedMinimumWidth()), i, j1), View.resolveSizeAndState(l, j, j1 << 16));
	//* 255  512:goto            153
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		if(!mHideOnContentScroll || !flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #422 <Field boolean mHideOnContentScroll>
	//*   2    4:ifeq            12
	//*   3    7:iload           4
	//*   4    9:ifne            14
			return false;
	//    5   12:iconst_0        
	//    6   13:ireturn         
		if(shouldHideActionBarOnFling(f, f1))
	//*   7   14:aload_0         
	//*   8   15:fload_2         
	//*   9   16:fload_3         
	//*  10   17:invokespecial   #526 <Method boolean shouldHideActionBarOnFling(float, float)>
	//*  11   20:ifeq            34
			addActionBarHideOffset();
	//   12   23:aload_0         
	//   13   24:invokespecial   #528 <Method void addActionBarHideOffset()>
		else
	//*  14   27:aload_0         
	//*  15   28:iconst_1        
	//*  16   29:putfield        #530 <Field boolean mAnimatingForFling>
	//*  17   32:iconst_1        
	//*  18   33:ireturn         
			removeActionBarHideOffset();
	//   19   34:aload_0         
	//   20   35:invokespecial   #532 <Method void removeActionBarHideOffset()>
		mAnimatingForFling = true;
		return true;
	//*  21   38:goto            27
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
	//    0    0:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		mHideOnContentScrollReference = mHideOnContentScrollReference + j;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #539 <Field int mHideOnContentScrollReference>
	//    3    5:iload_3         
	//    4    6:iadd            
	//    5    7:putfield        #539 <Field int mHideOnContentScrollReference>
		setActionBarHideOffset(mHideOnContentScrollReference);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #539 <Field int mHideOnContentScrollReference>
	//    9   15:invokevirtual   #542 <Method void setActionBarHideOffset(int)>
	//   10   18:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #546 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		mHideOnContentScrollReference = getActionBarHideOffset();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #548 <Method int getActionBarHideOffset()>
	//    9   15:putfield        #539 <Field int mHideOnContentScrollReference>
		haltActionBarHideOffsetAnimations();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
		if(mActionBarVisibilityCallback != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  14   26:ifnull          38
			mActionBarVisibilityCallback.onContentScrollStarted();
	//   15   29:aload_0         
	//   16   30:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   17   33:invokeinterface #553 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onContentScrollStarted()>
	//   18   38:return          
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		if((i & 2) == 0 || mActionBarTop.getVisibility() != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            16
	//*   4    6:aload_0         
	//*   5    7:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*   6   10:invokevirtual   #315 <Method int ActionBarContainer.getVisibility()>
	//*   7   13:ifeq            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		else
			return mHideOnContentScroll;
	//   10   18:aload_0         
	//   11   19:getfield        #422 <Field boolean mHideOnContentScroll>
	//   12   22:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		if(mHideOnContentScroll && !mAnimatingForFling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #422 <Field boolean mHideOnContentScroll>
	//*   2    4:ifeq            32
	//*   3    7:aload_0         
	//*   4    8:getfield        #530 <Field boolean mAnimatingForFling>
	//*   5   11:ifne            32
			if(mHideOnContentScrollReference <= mActionBarTop.getHeight())
	//*   6   14:aload_0         
	//*   7   15:getfield        #539 <Field int mHideOnContentScrollReference>
	//*   8   18:aload_0         
	//*   9   19:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  10   22:invokevirtual   #293 <Method int ActionBarContainer.getHeight()>
	//*  11   25:icmpgt          49
				postRemoveActionBarHideOffset();
	//   12   28:aload_0         
	//   13   29:invokespecial   #558 <Method void postRemoveActionBarHideOffset()>
			else
	//*  14   32:aload_0         
	//*  15   33:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  16   36:ifnull          48
	//*  17   39:aload_0         
	//*  18   40:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  19   43:invokeinterface #561 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onContentScrollStopped()>
	//*  20   48:return          
				postAddActionBarHideOffset();
	//   21   49:aload_0         
	//   22   50:invokespecial   #563 <Method void postAddActionBarHideOffset()>
		if(mActionBarVisibilityCallback != null)
			mActionBarVisibilityCallback.onContentScrollStopped();
	//*  23   53:goto            32
	}

	public void onWindowSystemUiVisibilityChanged(int i)
	{
		boolean flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore          5
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   2    3:getstatic       #569 <Field int android.os.Build$VERSION.SDK_INT>
	//*   3    6:bipush          16
	//*   4    8:icmplt          16
			super.onWindowSystemUiVisibilityChanged(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #571 <Method void ViewGroup.onWindowSystemUiVisibilityChanged(int)>
		pullChildren();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #298 <Method void pullChildren()>
		int j = mLastSystemUiVisibility;
	//   10   20:aload_0         
	//   11   21:getfield        #573 <Field int mLastSystemUiVisibility>
	//   12   24:istore          4
		mLastSystemUiVisibility = i;
	//   13   26:aload_0         
	//   14   27:iload_1         
	//   15   28:putfield        #573 <Field int mLastSystemUiVisibility>
		boolean flag;
		boolean flag1;
		if((i & 4) == 0)
	//*  16   31:iload_1         
	//*  17   32:iconst_4        
	//*  18   33:iand            
	//*  19   34:ifne            115
			flag = true;
	//   20   37:iconst_1        
	//   21   38:istore_2        
		else
	//*  22   39:iload_1         
	//*  23   40:sipush          256
	//*  24   43:iand            
	//*  25   44:ifeq            120
	//*  26   47:iconst_1        
	//*  27   48:istore_3        
	//*  28   49:aload_0         
	//*  29   50:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  30   53:ifnull          92
	//*  31   56:aload_0         
	//*  32   57:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  33   60:astore          6
	//*  34   62:iload_3         
	//*  35   63:ifne            125
	//*  36   66:aload           6
	//*  37   68:iload           5
	//*  38   70:invokeinterface #576 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.enableContentAnimations(boolean)>
	//*  39   75:iload_2         
	//*  40   76:ifne            83
	//*  41   79:iload_3         
	//*  42   80:ifne            131
	//*  43   83:aload_0         
	//*  44   84:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  45   87:invokeinterface #579 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.showForSystem()>
	//*  46   92:iload           4
	//*  47   94:iload_1         
	//*  48   95:ixor            
	//*  49   96:sipush          256
	//*  50   99:iand            
	//*  51  100:ifeq            114
	//*  52  103:aload_0         
	//*  53  104:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  54  107:ifnull          114
	//*  55  110:aload_0         
	//*  56  111:invokestatic    #439 <Method void ViewCompat.requestApplyInsets(View)>
	//*  57  114:return          
			flag = false;
	//   58  115:iconst_0        
	//   59  116:istore_2        
		if((i & 0x100) != 0)
			flag1 = true;
		else
	//*  60  117:goto            39
			flag1 = false;
	//   61  120:iconst_0        
	//   62  121:istore_3        
		if(mActionBarVisibilityCallback != null)
		{
			ActionBarVisibilityCallback actionbarvisibilitycallback = mActionBarVisibilityCallback;
			if(flag1)
	//*  63  122:goto            49
				flag2 = false;
	//   64  125:iconst_0        
	//   65  126:istore          5
			actionbarvisibilitycallback.enableContentAnimations(flag2);
			if(flag || !flag1)
				mActionBarVisibilityCallback.showForSystem();
			else
	//*  66  128:goto            66
				mActionBarVisibilityCallback.hideForSystem();
	//   67  131:aload_0         
	//   68  132:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   69  135:invokeinterface #582 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.hideForSystem()>
		}
		if(((j ^ i) & 0x100) != 0 && mActionBarVisibilityCallback != null)
			ViewCompat.requestApplyInsets(((View) (this)));
	//*  70  140:goto            92
	}

	protected void onWindowVisibilityChanged(int i)
	{
		super.onWindowVisibilityChanged(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #585 <Method void ViewGroup.onWindowVisibilityChanged(int)>
		mWindowVisibility = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #90  <Field int mWindowVisibility>
		if(mActionBarVisibilityCallback != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*   8   14:ifnull          27
			mActionBarVisibilityCallback.onWindowVisibilityChanged(i);
	//    9   17:aload_0         
	//   10   18:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   11   21:iload_1         
	//   12   22:invokeinterface #586 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onWindowVisibilityChanged(int)>
	//   13   27:return          
	}

	void pullChildren()
	{
		if(mContent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #500 <Field ContentFrameLayout mContent>
	//*   2    4:ifnonnull       50
		{
			mContent = (ContentFrameLayout)findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #591 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
	//    6   12:invokevirtual   #594 <Method View findViewById(int)>
	//    7   15:checkcast       #502 <Class ContentFrameLayout>
	//    8   18:putfield        #500 <Field ContentFrameLayout mContent>
			mActionBarTop = (ActionBarContainer)findViewById(android.support.v7.appcompat.R.id.action_bar_container);
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getstatic       #597 <Field int android.support.v7.appcompat.R$id.action_bar_container>
	//   12   26:invokevirtual   #594 <Method View findViewById(int)>
	//   13   29:checkcast       #290 <Class ActionBarContainer>
	//   14   32:putfield        #288 <Field ActionBarContainer mActionBarTop>
			mDecorToolbar = getDecorToolbar(findViewById(android.support.v7.appcompat.R.id.action_bar));
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getstatic       #600 <Field int android.support.v7.appcompat.R$id.action_bar>
	//   19   41:invokevirtual   #594 <Method View findViewById(int)>
	//   20   44:invokespecial   #602 <Method DecorToolbar getDecorToolbar(View)>
	//   21   47:putfield        #300 <Field DecorToolbar mDecorToolbar>
		}
	//   22   50:return          
	}

	public void restoreToolbarHierarchyState(SparseArray sparsearray)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.restoreHierarchyState(sparsearray);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #607 <Method void DecorToolbar.restoreHierarchyState(SparseArray)>
	//    6   14:return          
	}

	public void saveToolbarHierarchyState(SparseArray sparsearray)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.saveHierarchyState(sparsearray);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #613 <Method void DecorToolbar.saveHierarchyState(SparseArray)>
	//    6   14:return          
	}

	public void setActionBarHideOffset(int i)
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
		i = Math.max(0, Math.min(i, mActionBarTop.getHeight()));
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//    6   10:invokevirtual   #293 <Method int ActionBarContainer.getHeight()>
	//    7   13:invokestatic    #616 <Method int Math.min(int, int)>
	//    8   16:invokestatic    #485 <Method int Math.max(int, int)>
	//    9   19:istore_1        
		mActionBarTop.setTranslationY(-i);
	//   10   20:aload_0         
	//   11   21:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   12   24:iload_1         
	//   13   25:ineg            
	//   14   26:i2f             
	//   15   27:invokevirtual   #620 <Method void ActionBarContainer.setTranslationY(float)>
	//   16   30:return          
	}

	public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionbarvisibilitycallback)
	{
		mActionBarVisibilityCallback = actionbarvisibilitycallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
		if(getWindowToken() != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #626 <Method android.os.IBinder getWindowToken()>
	//*   5    9:ifnull          44
		{
			mActionBarVisibilityCallback.onWindowVisibilityChanged(mWindowVisibility);
	//    6   12:aload_0         
	//    7   13:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//    8   16:aload_0         
	//    9   17:getfield        #90  <Field int mWindowVisibility>
	//   10   20:invokeinterface #586 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onWindowVisibilityChanged(int)>
			if(mLastSystemUiVisibility != 0)
	//*  11   25:aload_0         
	//*  12   26:getfield        #573 <Field int mLastSystemUiVisibility>
	//*  13   29:ifeq            44
			{
				onWindowSystemUiVisibilityChanged(mLastSystemUiVisibility);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #573 <Field int mLastSystemUiVisibility>
	//   17   37:invokevirtual   #627 <Method void onWindowSystemUiVisibilityChanged(int)>
				ViewCompat.requestApplyInsets(((View) (this)));
	//   18   40:aload_0         
	//   19   41:invokestatic    #439 <Method void ViewCompat.requestApplyInsets(View)>
			}
		}
	//   20   44:return          
	}

	public void setHasNonEmbeddedTabs(boolean flag)
	{
		mHasNonEmbeddedTabs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #494 <Field boolean mHasNonEmbeddedTabs>
	//    3    5:return          
	}

	public void setHideOnContentScrollEnabled(boolean flag)
	{
		if(flag != mHideOnContentScroll)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #422 <Field boolean mHideOnContentScroll>
	//*   3    5:icmpeq          26
		{
			mHideOnContentScroll = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #422 <Field boolean mHideOnContentScroll>
			if(!flag)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				haltActionBarHideOffsetAnimations();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #135 <Method void haltActionBarHideOffsetAnimations()>
				setActionBarHideOffset(0);
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #542 <Method void setActionBarHideOffset(int)>
			}
		}
	//   14   26:return          
	}

	public void setIcon(int i)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.setIcon(i);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:iload_1         
	//    5    9:invokeinterface #632 <Method void DecorToolbar.setIcon(int)>
	//    6   14:return          
	}

	public void setIcon(Drawable drawable)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.setIcon(drawable);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #635 <Method void DecorToolbar.setIcon(Drawable)>
	//    6   14:return          
	}

	public void setLogo(int i)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.setLogo(i);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:iload_1         
	//    5    9:invokeinterface #638 <Method void DecorToolbar.setLogo(int)>
	//    6   14:return          
	}

	public void setMenu(Menu menu, android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.setMenu(menu, callback);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #642 <Method void DecorToolbar.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
	//    7   15:return          
	}

	public void setMenuPrepared()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.setMenuPrepared();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #645 <Method void DecorToolbar.setMenuPrepared()>
	//    5   13:return          
	}

	public void setOverlayMode(boolean flag)
	{
		mOverlayMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #425 <Field boolean mOverlayMode>
		if(flag && getContext().getApplicationInfo().targetSdkVersion < 19)
	//*   3    5:iload_1         
	//*   4    6:ifeq            32
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #215 <Method Context getContext()>
	//*   7   13:invokevirtual   #252 <Method ApplicationInfo Context.getApplicationInfo()>
	//*   8   16:getfield        #257 <Field int ApplicationInfo.targetSdkVersion>
	//*   9   19:bipush          19
	//*  10   21:icmpge          32
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_1        
		else
	//*  13   26:aload_0         
	//*  14   27:iload_1         
	//*  15   28:putfield        #259 <Field boolean mIgnoreWindowContentOverlay>
	//*  16   31:return          
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_1        
		mIgnoreWindowContentOverlay = flag;
	//*  19   34:goto            26
	}

	public void setShowingForActionMode(boolean flag)
	{
	//    0    0:return          
	}

	public void setUiOptions(int i)
	{
	//    0    0:return          
	}

	public void setWindowCallback(android.view.Window.Callback callback)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.setWindowCallback(callback);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #651 <Method void DecorToolbar.setWindowCallback(android.view.Window$Callback)>
	//    6   14:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		mDecorToolbar.setWindowTitle(charsequence);
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #655 <Method void DecorToolbar.setWindowTitle(CharSequence)>
	//    6   14:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean showOverflowMenu()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		return mDecorToolbar.showOverflowMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #659 <Method boolean DecorToolbar.showOverflowMenu()>
	//    5   13:ireturn         
	}

	static final int ATTRS[];
	private static final String TAG = "ActionBarOverlayLayout";
	private final int ACTION_BAR_ANIMATE_DELAY;
	private int mActionBarHeight;
	ActionBarContainer mActionBarTop;
	private ActionBarVisibilityCallback mActionBarVisibilityCallback;
	private final Runnable mAddActionBarHideOffset;
	boolean mAnimatingForFling;
	private final Rect mBaseContentInsets;
	private final Rect mBaseInnerInsets;
	private ContentFrameLayout mContent;
	private final Rect mContentInsets;
	ViewPropertyAnimator mCurrentActionBarTopAnimator;
	private DecorToolbar mDecorToolbar;
	private OverScroller mFlingEstimator;
	private boolean mHasNonEmbeddedTabs;
	private boolean mHideOnContentScroll;
	private int mHideOnContentScrollReference;
	private boolean mIgnoreWindowContentOverlay;
	private final Rect mInnerInsets;
	private final Rect mLastBaseContentInsets;
	private final Rect mLastBaseInnerInsets;
	private final Rect mLastInnerInsets;
	private int mLastSystemUiVisibility;
	private boolean mOverlayMode;
	private final NestedScrollingParentHelper mParentHelper;
	private final Runnable mRemoveActionBarHideOffset;
	final AnimatorListenerAdapter mTopAnimatorListener;
	private Drawable mWindowContentOverlay;
	private int mWindowVisibility;

	static 
	{
		ATTRS = (new int[] {
			android.support.v7.appcompat.R.attr.actionBarSize, 0x1010059
		});
	//    0    0:iconst_2        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:getstatic       #78  <Field int android.support.v7.appcompat.R$attr.actionBarSize>
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #79  <Int 0x1010059>
	//    9   13:iastore         
	//   10   14:putstatic       #81  <Field int[] ATTRS>
	//*  11   17:return          
	}
}
