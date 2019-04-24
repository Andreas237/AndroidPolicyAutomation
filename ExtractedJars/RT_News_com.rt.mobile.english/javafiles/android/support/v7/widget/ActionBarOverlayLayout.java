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
	implements DecorContentParent, NestedScrollingParent
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
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #148 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    3    7:astore_1        
		boolean flag4;
		if(flag && ((LayoutParams) (view)).leftMargin != rect.left)
	//*   4    8:iload_3         
	//*   5    9:ifeq            37
	//*   6   12:aload_1         
	//*   7   13:getfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//*   8   16:aload_2         
	//*   9   17:getfield        #154 <Field int Rect.left>
	//*  10   20:icmpeq          37
		{
			view.leftMargin = rect.left;
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:getfield        #154 <Field int Rect.left>
	//   14   28:putfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
			flag4 = true;
	//   15   31:iconst_1        
	//   16   32:istore          7
		} else
	//*  17   34:goto            40
		{
			flag4 = false;
	//   18   37:iconst_0        
	//   19   38:istore          7
		}
		flag = flag4;
	//   20   40:iload           7
	//   21   42:istore_3        
		if(flag1)
	//*  22   43:iload           4
	//*  23   45:ifeq            72
		{
			flag = flag4;
	//   24   48:iload           7
	//   25   50:istore_3        
			if(((LayoutParams) (view)).topMargin != rect.top)
	//*  26   51:aload_1         
	//*  27   52:getfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//*  28   55:aload_2         
	//*  29   56:getfield        #160 <Field int Rect.top>
	//*  30   59:icmpeq          72
			{
				view.topMargin = rect.top;
	//   31   62:aload_1         
	//   32   63:aload_2         
	//   33   64:getfield        #160 <Field int Rect.top>
	//   34   67:putfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
				flag = true;
	//   35   70:iconst_1        
	//   36   71:istore_3        
			}
		}
		flag1 = flag;
	//   37   72:iload_3         
	//   38   73:istore          4
		if(flag3)
	//*  39   75:iload           6
	//*  40   77:ifeq            105
		{
			flag1 = flag;
	//   41   80:iload_3         
	//   42   81:istore          4
			if(((LayoutParams) (view)).rightMargin != rect.right)
	//*  43   83:aload_1         
	//*  44   84:getfield        #163 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//*  45   87:aload_2         
	//*  46   88:getfield        #166 <Field int Rect.right>
	//*  47   91:icmpeq          105
			{
				view.rightMargin = rect.right;
	//   48   94:aload_1         
	//   49   95:aload_2         
	//   50   96:getfield        #166 <Field int Rect.right>
	//   51   99:putfield        #163 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
				flag1 = true;
	//   52  102:iconst_1        
	//   53  103:istore          4
			}
		}
		flag = flag1;
	//   54  105:iload           4
	//   55  107:istore_3        
		if(flag2)
	//*  56  108:iload           5
	//*  57  110:ifeq            137
		{
			flag = flag1;
	//   58  113:iload           4
	//   59  115:istore_3        
			if(((LayoutParams) (view)).bottomMargin != rect.bottom)
	//*  60  116:aload_1         
	//*  61  117:getfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//*  62  120:aload_2         
	//*  63  121:getfield        #172 <Field int Rect.bottom>
	//*  64  124:icmpeq          137
			{
				view.bottomMargin = rect.bottom;
	//   65  127:aload_1         
	//   66  128:aload_2         
	//   67  129:getfield        #172 <Field int Rect.bottom>
	//   68  132:putfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
				flag = true;
	//   69  135:iconst_1        
	//   70  136:istore_3        
			}
		}
		return flag;
	//   71  137:iload_3         
	//   72  138:ireturn         
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
		{
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #178 <Class Toolbar>
	//   11   23:invokevirtual   #182 <Method DecorToolbar Toolbar.getWrapper()>
	//   12   26:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   13   27:new             #184 <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #185 <Method void StringBuilder()>
	//   16   34:astore_2        
			stringbuilder.append("Can't make a decor toolbar out of ");
	//   17   35:aload_2         
	//   18   36:ldc1            #187 <String "Can't make a decor toolbar out of ">
	//   19   38:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
			stringbuilder.append(((Object) (view)).getClass().getSimpleName());
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:invokevirtual   #197 <Method Class Object.getClass()>
	//   24   47:invokevirtual   #203 <Method String Class.getSimpleName()>
	//   25   50:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   27   54:new             #205 <Class IllegalStateException>
	//   28   57:dup             
	//   29   58:aload_2         
	//   30   59:invokevirtual   #208 <Method String StringBuilder.toString()>
	//   31   62:invokespecial   #211 <Method void IllegalStateException(String)>
	//   32   65:athrow          
		}
	}

	private void init(Context context)
	{
		TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(ATTRS);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #215 <Method Context getContext()>
	//    2    4:invokevirtual   #221 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    3    7:getstatic       #81  <Field int[] ATTRS>
	//    4   10:invokevirtual   #227 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int[])>
	//    5   13:astore          4
		boolean flag1 = false;
	//    6   15:iconst_0        
	//    7   16:istore_3        
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
	//*  21   42:ifnonnull       50
			flag = true;
	//   22   45:iconst_1        
	//   23   46:istore_2        
		else
	//*  24   47:goto            52
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore_2        
		setWillNotDraw(flag);
	//   27   52:aload_0         
	//   28   53:iload_2         
	//   29   54:invokevirtual   #245 <Method void setWillNotDraw(boolean)>
		typedarray.recycle();
	//   30   57:aload           4
	//   31   59:invokevirtual   #248 <Method void TypedArray.recycle()>
		flag = flag1;
	//   32   62:iload_3         
	//   33   63:istore_2        
		if(context.getApplicationInfo().targetSdkVersion < 19)
	//*  34   64:aload_1         
	//*  35   65:invokevirtual   #252 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  36   68:getfield        #257 <Field int ApplicationInfo.targetSdkVersion>
	//*  37   71:bipush          19
	//*  38   73:icmpge          78
			flag = true;
	//   39   76:iconst_1        
	//   40   77:istore_2        
		mIgnoreWindowContentOverlay = flag;
	//   41   78:aload_0         
	//   42   79:iload_2         
	//   43   80:putfield        #259 <Field boolean mIgnoreWindowContentOverlay>
		mFlingEstimator = new OverScroller(context);
	//   44   83:aload_0         
	//   45   84:new             #261 <Class OverScroller>
	//   46   87:dup             
	//   47   88:aload_1         
	//   48   89:invokespecial   #263 <Method void OverScroller(Context)>
	//   49   92:putfield        #265 <Field OverScroller mFlingEstimator>
	//   50   95:return          
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
		mFlingEstimator.fling(0, 0, 0, (int)f1, 0, 0, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #265 <Field OverScroller mFlingEstimator>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:fload_2         
	//    6    8:f2i             
	//    7    9:iconst_0        
	//    8   10:iconst_0        
	//    9   11:ldc2            #277 <Int 0x80000000>
	//   10   14:ldc2            #278 <Int 0x7fffffff>
	//   11   17:invokevirtual   #282 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		return mFlingEstimator.getFinalY() > mActionBarTop.getHeight();
	//   12   20:aload_0         
	//   13   21:getfield        #265 <Field OverScroller mFlingEstimator>
	//   14   24:invokevirtual   #286 <Method int OverScroller.getFinalY()>
	//   15   27:aload_0         
	//   16   28:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   17   31:invokevirtual   #293 <Method int ActionBarContainer.getHeight()>
	//   18   34:icmple          39
	//   19   37:iconst_1        
	//   20   38:ireturn         
	//   21   39:iconst_0        
	//   22   40:ireturn         
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
	//*   5    9:ifnull          86
	//*   6   12:aload_0         
	//*   7   13:getfield        #259 <Field boolean mIgnoreWindowContentOverlay>
	//*   8   16:ifne            86
		{
			int i;
			if(mActionBarTop.getVisibility() == 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  11   23:invokevirtual   #315 <Method int ActionBarContainer.getVisibility()>
	//*  12   26:ifne            54
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
	//*  25   51:goto            56
				i = 0;
	//   26   54:iconst_0        
	//   27   55:istore_2        
			mWindowContentOverlay.setBounds(0, i, getWidth(), mWindowContentOverlay.getIntrinsicHeight() + i);
	//   28   56:aload_0         
	//   29   57:getfield        #241 <Field Drawable mWindowContentOverlay>
	//   30   60:iconst_0        
	//   31   61:iload_2         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #326 <Method int getWidth()>
	//   34   66:aload_0         
	//   35   67:getfield        #241 <Field Drawable mWindowContentOverlay>
	//   36   70:invokevirtual   #331 <Method int Drawable.getIntrinsicHeight()>
	//   37   73:iload_2         
	//   38   74:iadd            
	//   39   75:invokevirtual   #335 <Method void Drawable.setBounds(int, int, int, int)>
			mWindowContentOverlay.draw(canvas);
	//   40   78:aload_0         
	//   41   79:getfield        #241 <Field Drawable mWindowContentOverlay>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #336 <Method void Drawable.draw(Canvas)>
		}
	//   44   86:return          
	}

	protected boolean fitSystemWindows(Rect rect)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method void pullChildren()>
		ViewCompat.getWindowSystemUiVisibility(((View) (this)));
	//    2    4:aload_0         
	//    3    5:invokestatic    #344 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//    4    8:pop             
		boolean flag = applyInsets(((View) (mActionBarTop)), rect, true, true, false, true);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//    8   14:aload_1         
	//    9   15:iconst_1        
	//   10   16:iconst_1        
	//   11   17:iconst_0        
	//   12   18:iconst_1        
	//   13   19:invokespecial   #346 <Method boolean applyInsets(View, Rect, boolean, boolean, boolean, boolean)>
	//   14   22:istore_2        
		mBaseInnerInsets.set(rect);
	//   15   23:aload_0         
	//   16   24:getfield        #102 <Field Rect mBaseInnerInsets>
	//   17   27:aload_1         
	//   18   28:invokevirtual   #350 <Method void Rect.set(Rect)>
		ViewUtils.computeFitSystemWindows(((View) (this)), mBaseInnerInsets, mBaseContentInsets);
	//   19   31:aload_0         
	//   20   32:aload_0         
	//   21   33:getfield        #102 <Field Rect mBaseInnerInsets>
	//   22   36:aload_0         
	//   23   37:getfield        #96  <Field Rect mBaseContentInsets>
	//   24   40:invokestatic    #356 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
		if(!mLastBaseInnerInsets.equals(((Object) (mBaseInnerInsets))))
	//*  25   43:aload_0         
	//*  26   44:getfield        #104 <Field Rect mLastBaseInnerInsets>
	//*  27   47:aload_0         
	//*  28   48:getfield        #102 <Field Rect mBaseInnerInsets>
	//*  29   51:invokevirtual   #360 <Method boolean Rect.equals(Object)>
	//*  30   54:ifne            70
		{
			mLastBaseInnerInsets.set(mBaseInnerInsets);
	//   31   57:aload_0         
	//   32   58:getfield        #104 <Field Rect mLastBaseInnerInsets>
	//   33   61:aload_0         
	//   34   62:getfield        #102 <Field Rect mBaseInnerInsets>
	//   35   65:invokevirtual   #350 <Method void Rect.set(Rect)>
			flag = true;
	//   36   68:iconst_1        
	//   37   69:istore_2        
		}
		if(!mLastBaseContentInsets.equals(((Object) (mBaseContentInsets))))
	//*  38   70:aload_0         
	//*  39   71:getfield        #98  <Field Rect mLastBaseContentInsets>
	//*  40   74:aload_0         
	//*  41   75:getfield        #96  <Field Rect mBaseContentInsets>
	//*  42   78:invokevirtual   #360 <Method boolean Rect.equals(Object)>
	//*  43   81:ifne            97
		{
			mLastBaseContentInsets.set(mBaseContentInsets);
	//   44   84:aload_0         
	//   45   85:getfield        #98  <Field Rect mLastBaseContentInsets>
	//   46   88:aload_0         
	//   47   89:getfield        #96  <Field Rect mBaseContentInsets>
	//   48   92:invokevirtual   #350 <Method void Rect.set(Rect)>
			flag = true;
	//   49   95:iconst_1        
	//   50   96:istore_2        
		}
		if(flag)
	//*  51   97:iload_2         
	//*  52   98:ifeq            105
			requestLayout();
	//   53  101:aload_0         
	//   54  102:invokevirtual   #363 <Method void requestLayout()>
		return true;
	//   55  105:iconst_1        
	//   56  106:ireturn         
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
		if(i != 2)
	//*   2    4:iload_1         
	//*   3    5:iconst_2        
	//*   4    6:icmpeq          37
		{
			if(i != 5)
	//*   5    9:iload_1         
	//*   6   10:iconst_5        
	//*   7   11:icmpeq          27
			{
				if(i != 109)
	//*   8   14:iload_1         
	//*   9   15:bipush          109
	//*  10   17:icmpeq          21
				{
					return;
	//   11   20:return          
				} else
				{
					setOverlayMode(true);
	//   12   21:aload_0         
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #413 <Method void setOverlayMode(boolean)>
					return;
	//   15   26:return          
				}
			} else
			{
				mDecorToolbar.initIndeterminateProgress();
	//   16   27:aload_0         
	//   17   28:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//   18   31:invokeinterface #416 <Method void DecorToolbar.initIndeterminateProgress()>
				return;
	//   19   36:return          
			}
		} else
		{
			mDecorToolbar.initProgress();
	//   20   37:aload_0         
	//   21   38:getfield        #300 <Field DecorToolbar mDecorToolbar>
	//   22   41:invokeinterface #419 <Method void DecorToolbar.initProgress()>
			return;
	//   23   46:return          
		}
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
		int l1 = Math.max(0, mActionBarTop.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
	//   27   53:iconst_0        
	//   28   54:aload_0         
	//   29   55:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   30   58:invokevirtual   #486 <Method int ActionBarContainer.getMeasuredHeight()>
	//   31   61:aload           9
	//   32   63:getfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//   33   66:iadd            
	//   34   67:aload           9
	//   35   69:getfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//   36   72:iadd            
	//   37   73:invokestatic    #485 <Method int Math.max(int, int)>
	//   38   76:istore          7
		int k1 = View.combineMeasuredStates(0, mActionBarTop.getMeasuredState());
	//   39   78:iconst_0        
	//   40   79:aload_0         
	//   41   80:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   42   83:invokevirtual   #489 <Method int ActionBarContainer.getMeasuredState()>
	//   43   86:invokestatic    #492 <Method int View.combineMeasuredStates(int, int)>
	//   44   89:istore          6
		boolean flag;
		if((ViewCompat.getWindowSystemUiVisibility(((View) (this))) & 0x100) != 0)
	//*  45   91:aload_0         
	//*  46   92:invokestatic    #344 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//*  47   95:sipush          256
	//*  48   98:iand            
	//*  49   99:ifeq            108
			flag = true;
	//   50  102:iconst_1        
	//   51  103:istore          4
		else
	//*  52  105:goto            111
			flag = false;
	//   53  108:iconst_0        
	//   54  109:istore          4
		int k;
		if(flag)
	//*  55  111:iload           4
	//*  56  113:ifeq            156
		{
			int i1 = mActionBarHeight;
	//   57  116:aload_0         
	//   58  117:getfield        #235 <Field int mActionBarHeight>
	//   59  120:istore          5
			k = i1;
	//   60  122:iload           5
	//   61  124:istore_3        
			if(mHasNonEmbeddedTabs)
	//*  62  125:aload_0         
	//*  63  126:getfield        #494 <Field boolean mHasNonEmbeddedTabs>
	//*  64  129:ifeq            181
			{
				k = i1;
	//   65  132:iload           5
	//   66  134:istore_3        
				if(mActionBarTop.getTabContainer() != null)
	//*  67  135:aload_0         
	//*  68  136:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  69  139:invokevirtual   #498 <Method View ActionBarContainer.getTabContainer()>
	//*  70  142:ifnull          181
					k = i1 + mActionBarHeight;
	//   71  145:iload           5
	//   72  147:aload_0         
	//   73  148:getfield        #235 <Field int mActionBarHeight>
	//   74  151:iadd            
	//   75  152:istore_3        
			}
		} else
	//*  76  153:goto            181
		if(mActionBarTop.getVisibility() != 8)
	//*  77  156:aload_0         
	//*  78  157:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  79  160:invokevirtual   #315 <Method int ActionBarContainer.getVisibility()>
	//*  80  163:bipush          8
	//*  81  165:icmpeq          179
			k = mActionBarTop.getMeasuredHeight();
	//   82  168:aload_0         
	//   83  169:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//   84  172:invokevirtual   #486 <Method int ActionBarContainer.getMeasuredHeight()>
	//   85  175:istore_3        
		else
	//*  86  176:goto            181
			k = 0;
	//   87  179:iconst_0        
	//   88  180:istore_3        
		mContentInsets.set(mBaseContentInsets);
	//   89  181:aload_0         
	//   90  182:getfield        #100 <Field Rect mContentInsets>
	//   91  185:aload_0         
	//   92  186:getfield        #96  <Field Rect mBaseContentInsets>
	//   93  189:invokevirtual   #350 <Method void Rect.set(Rect)>
		mInnerInsets.set(mBaseInnerInsets);
	//   94  192:aload_0         
	//   95  193:getfield        #106 <Field Rect mInnerInsets>
	//   96  196:aload_0         
	//   97  197:getfield        #102 <Field Rect mBaseInnerInsets>
	//   98  200:invokevirtual   #350 <Method void Rect.set(Rect)>
		if(!mOverlayMode && !flag)
	//*  99  203:aload_0         
	//* 100  204:getfield        #425 <Field boolean mOverlayMode>
	//* 101  207:ifne            254
	//* 102  210:iload           4
	//* 103  212:ifne            254
		{
			obj = ((Object) (mContentInsets));
	//  104  215:aload_0         
	//  105  216:getfield        #100 <Field Rect mContentInsets>
	//  106  219:astore          9
			obj.top = ((Rect) (obj)).top + k;
	//  107  221:aload           9
	//  108  223:aload           9
	//  109  225:getfield        #160 <Field int Rect.top>
	//  110  228:iload_3         
	//  111  229:iadd            
	//  112  230:putfield        #160 <Field int Rect.top>
			obj = ((Object) (mContentInsets));
	//  113  233:aload_0         
	//  114  234:getfield        #100 <Field Rect mContentInsets>
	//  115  237:astore          9
			obj.bottom = ((Rect) (obj)).bottom + 0;
	//  116  239:aload           9
	//  117  241:aload           9
	//  118  243:getfield        #172 <Field int Rect.bottom>
	//  119  246:iconst_0        
	//  120  247:iadd            
	//  121  248:putfield        #172 <Field int Rect.bottom>
		} else
	//* 122  251:goto            290
		{
			obj = ((Object) (mInnerInsets));
	//  123  254:aload_0         
	//  124  255:getfield        #106 <Field Rect mInnerInsets>
	//  125  258:astore          9
			obj.top = ((Rect) (obj)).top + k;
	//  126  260:aload           9
	//  127  262:aload           9
	//  128  264:getfield        #160 <Field int Rect.top>
	//  129  267:iload_3         
	//  130  268:iadd            
	//  131  269:putfield        #160 <Field int Rect.top>
			obj = ((Object) (mInnerInsets));
	//  132  272:aload_0         
	//  133  273:getfield        #106 <Field Rect mInnerInsets>
	//  134  276:astore          9
			obj.bottom = ((Rect) (obj)).bottom + 0;
	//  135  278:aload           9
	//  136  280:aload           9
	//  137  282:getfield        #172 <Field int Rect.bottom>
	//  138  285:iconst_0        
	//  139  286:iadd            
	//  140  287:putfield        #172 <Field int Rect.bottom>
		}
		applyInsets(((View) (mContent)), mContentInsets, true, true, true, true);
	//  141  290:aload_0         
	//  142  291:aload_0         
	//  143  292:getfield        #500 <Field ContentFrameLayout mContent>
	//  144  295:aload_0         
	//  145  296:getfield        #100 <Field Rect mContentInsets>
	//  146  299:iconst_1        
	//  147  300:iconst_1        
	//  148  301:iconst_1        
	//  149  302:iconst_1        
	//  150  303:invokespecial   #346 <Method boolean applyInsets(View, Rect, boolean, boolean, boolean, boolean)>
	//  151  306:pop             
		if(!mLastInnerInsets.equals(((Object) (mInnerInsets))))
	//* 152  307:aload_0         
	//* 153  308:getfield        #108 <Field Rect mLastInnerInsets>
	//* 154  311:aload_0         
	//* 155  312:getfield        #106 <Field Rect mInnerInsets>
	//* 156  315:invokevirtual   #360 <Method boolean Rect.equals(Object)>
	//* 157  318:ifne            343
		{
			mLastInnerInsets.set(mInnerInsets);
	//  158  321:aload_0         
	//  159  322:getfield        #108 <Field Rect mLastInnerInsets>
	//  160  325:aload_0         
	//  161  326:getfield        #106 <Field Rect mInnerInsets>
	//  162  329:invokevirtual   #350 <Method void Rect.set(Rect)>
			mContent.dispatchFitSystemWindows(mInnerInsets);
	//  163  332:aload_0         
	//  164  333:getfield        #500 <Field ContentFrameLayout mContent>
	//  165  336:aload_0         
	//  166  337:getfield        #106 <Field Rect mInnerInsets>
	//  167  340:invokevirtual   #505 <Method void ContentFrameLayout.dispatchFitSystemWindows(Rect)>
		}
		measureChildWithMargins(((View) (mContent)), i, 0, j, 0);
	//  168  343:aload_0         
	//  169  344:aload_0         
	//  170  345:getfield        #500 <Field ContentFrameLayout mContent>
	//  171  348:iload_1         
	//  172  349:iconst_0        
	//  173  350:iload_2         
	//  174  351:iconst_0        
	//  175  352:invokevirtual   #478 <Method void measureChildWithMargins(View, int, int, int, int)>
		obj = ((Object) ((LayoutParams)mContent.getLayoutParams()));
	//  176  355:aload_0         
	//  177  356:getfield        #500 <Field ContentFrameLayout mContent>
	//  178  359:invokevirtual   #506 <Method android.view.ViewGroup$LayoutParams ContentFrameLayout.getLayoutParams()>
	//  179  362:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//  180  365:astore          9
		k = Math.max(i2, mContent.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
	//  181  367:iload           8
	//  182  369:aload_0         
	//  183  370:getfield        #500 <Field ContentFrameLayout mContent>
	//  184  373:invokevirtual   #507 <Method int ContentFrameLayout.getMeasuredWidth()>
	//  185  376:aload           9
	//  186  378:getfield        #151 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//  187  381:iadd            
	//  188  382:aload           9
	//  189  384:getfield        #163 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//  190  387:iadd            
	//  191  388:invokestatic    #485 <Method int Math.max(int, int)>
	//  192  391:istore_3        
		int l = Math.max(l1, mContent.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
	//  193  392:iload           7
	//  194  394:aload_0         
	//  195  395:getfield        #500 <Field ContentFrameLayout mContent>
	//  196  398:invokevirtual   #508 <Method int ContentFrameLayout.getMeasuredHeight()>
	//  197  401:aload           9
	//  198  403:getfield        #157 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//  199  406:iadd            
	//  200  407:aload           9
	//  201  409:getfield        #169 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//  202  412:iadd            
	//  203  413:invokestatic    #485 <Method int Math.max(int, int)>
	//  204  416:istore          4
		int j1 = View.combineMeasuredStates(k1, mContent.getMeasuredState());
	//  205  418:iload           6
	//  206  420:aload_0         
	//  207  421:getfield        #500 <Field ContentFrameLayout mContent>
	//  208  424:invokevirtual   #509 <Method int ContentFrameLayout.getMeasuredState()>
	//  209  427:invokestatic    #492 <Method int View.combineMeasuredStates(int, int)>
	//  210  430:istore          5
		k1 = getPaddingLeft();
	//  211  432:aload_0         
	//  212  433:invokevirtual   #450 <Method int getPaddingLeft()>
	//  213  436:istore          6
		l1 = getPaddingRight();
	//  214  438:aload_0         
	//  215  439:invokevirtual   #453 <Method int getPaddingRight()>
	//  216  442:istore          7
		l = Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
	//  217  444:iload           4
	//  218  446:aload_0         
	//  219  447:invokevirtual   #456 <Method int getPaddingTop()>
	//  220  450:aload_0         
	//  221  451:invokevirtual   #459 <Method int getPaddingBottom()>
	//  222  454:iadd            
	//  223  455:iadd            
	//  224  456:aload_0         
	//  225  457:invokevirtual   #512 <Method int getSuggestedMinimumHeight()>
	//  226  460:invokestatic    #485 <Method int Math.max(int, int)>
	//  227  463:istore          4
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k + (k1 + l1), getSuggestedMinimumWidth()), i, j1), View.resolveSizeAndState(l, j, j1 << 16));
	//  228  465:aload_0         
	//  229  466:iload_3         
	//  230  467:iload           6
	//  231  469:iload           7
	//  232  471:iadd            
	//  233  472:iadd            
	//  234  473:aload_0         
	//  235  474:invokevirtual   #515 <Method int getSuggestedMinimumWidth()>
	//  236  477:invokestatic    #485 <Method int Math.max(int, int)>
	//  237  480:iload_1         
	//  238  481:iload           5
	//  239  483:invokestatic    #519 <Method int View.resolveSizeAndState(int, int, int)>
	//  240  486:iload           4
	//  241  488:iload_2         
	//  242  489:iload           5
	//  243  491:bipush          16
	//  244  493:ishl            
	//  245  494:invokestatic    #519 <Method int View.resolveSizeAndState(int, int, int)>
	//  246  497:invokevirtual   #522 <Method void setMeasuredDimension(int, int)>
	//  247  500:return          
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		if(mHideOnContentScroll && flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #422 <Field boolean mHideOnContentScroll>
	//*   2    4:ifeq            42
	//*   3    7:iload           4
	//*   4    9:ifne            15
	//*   5   12:goto            42
		{
			if(shouldHideActionBarOnFling(f, f1))
	//*   6   15:aload_0         
	//*   7   16:fload_2         
	//*   8   17:fload_3         
	//*   9   18:invokespecial   #526 <Method boolean shouldHideActionBarOnFling(float, float)>
	//*  10   21:ifeq            31
				addActionBarHideOffset();
	//   11   24:aload_0         
	//   12   25:invokespecial   #528 <Method void addActionBarHideOffset()>
			else
	//*  13   28:goto            35
				removeActionBarHideOffset();
	//   14   31:aload_0         
	//   15   32:invokespecial   #530 <Method void removeActionBarHideOffset()>
			mAnimatingForFling = true;
	//   16   35:aload_0         
	//   17   36:iconst_1        
	//   18   37:putfield        #532 <Field boolean mAnimatingForFling>
			return true;
	//   19   40:iconst_1        
	//   20   41:ireturn         
		} else
		{
			return false;
	//   21   42:iconst_0        
	//   22   43:ireturn         
		}
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
		if((i & 2) != 0 && mActionBarTop.getVisibility() == 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_2        
	//*   2    2:iand            
	//*   3    3:ifeq            24
	//*   4    6:aload_0         
	//*   5    7:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*   6   10:invokevirtual   #315 <Method int ActionBarContainer.getVisibility()>
	//*   7   13:ifeq            19
	//*   8   16:goto            24
			return mHideOnContentScroll;
	//    9   19:aload_0         
	//   10   20:getfield        #422 <Field boolean mHideOnContentScroll>
	//   11   23:ireturn         
		else
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		if(mHideOnContentScroll && !mAnimatingForFling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #422 <Field boolean mHideOnContentScroll>
	//*   2    4:ifeq            39
	//*   3    7:aload_0         
	//*   4    8:getfield        #532 <Field boolean mAnimatingForFling>
	//*   5   11:ifne            39
			if(mHideOnContentScrollReference <= mActionBarTop.getHeight())
	//*   6   14:aload_0         
	//*   7   15:getfield        #539 <Field int mHideOnContentScrollReference>
	//*   8   18:aload_0         
	//*   9   19:getfield        #288 <Field ActionBarContainer mActionBarTop>
	//*  10   22:invokevirtual   #293 <Method int ActionBarContainer.getHeight()>
	//*  11   25:icmpgt          35
				postRemoveActionBarHideOffset();
	//   12   28:aload_0         
	//   13   29:invokespecial   #558 <Method void postRemoveActionBarHideOffset()>
			else
	//*  14   32:goto            39
				postAddActionBarHideOffset();
	//   15   35:aload_0         
	//   16   36:invokespecial   #560 <Method void postAddActionBarHideOffset()>
		if(mActionBarVisibilityCallback != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  19   43:ifnull          55
			mActionBarVisibilityCallback.onContentScrollStopped();
	//   20   46:aload_0         
	//   21   47:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   22   50:invokeinterface #563 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onContentScrollStopped()>
	//   23   55:return          
	}

	public void onWindowSystemUiVisibilityChanged(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #569 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			super.onWindowSystemUiVisibilityChanged(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #571 <Method void ViewGroup.onWindowSystemUiVisibilityChanged(int)>
		pullChildren();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #298 <Method void pullChildren()>
		int j = mLastSystemUiVisibility;
	//    8   17:aload_0         
	//    9   18:getfield        #573 <Field int mLastSystemUiVisibility>
	//   10   21:istore          4
		mLastSystemUiVisibility = i;
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:putfield        #573 <Field int mLastSystemUiVisibility>
		boolean flag1 = false;
	//   14   28:iconst_0        
	//   15   29:istore_3        
		boolean flag;
		if((i & 4) == 0)
	//*  16   30:iload_1         
	//*  17   31:iconst_4        
	//*  18   32:iand            
	//*  19   33:ifne            41
			flag = true;
	//   20   36:iconst_1        
	//   21   37:istore_2        
		else
	//*  22   38:goto            43
			flag = false;
	//   23   41:iconst_0        
	//   24   42:istore_2        
		if((i & 0x100) != 0)
	//*  25   43:iload_1         
	//*  26   44:sipush          256
	//*  27   47:iand            
	//*  28   48:ifeq            53
			flag1 = true;
	//   29   51:iconst_1        
	//   30   52:istore_3        
		if(mActionBarVisibilityCallback != null)
	//*  31   53:aload_0         
	//*  32   54:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  33   57:ifnull          104
		{
			mActionBarVisibilityCallback.enableContentAnimations(flag1 ^ true);
	//   34   60:aload_0         
	//   35   61:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   36   64:iload_3         
	//   37   65:iconst_1        
	//   38   66:ixor            
	//   39   67:invokeinterface #576 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.enableContentAnimations(boolean)>
			if(!flag && flag1)
	//*  40   72:iload_2         
	//*  41   73:ifne            95
	//*  42   76:iload_3         
	//*  43   77:ifne            83
	//*  44   80:goto            95
				mActionBarVisibilityCallback.hideForSystem();
	//   45   83:aload_0         
	//   46   84:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   47   87:invokeinterface #579 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.hideForSystem()>
			else
	//*  48   92:goto            104
				mActionBarVisibilityCallback.showForSystem();
	//   49   95:aload_0         
	//   50   96:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   51   99:invokeinterface #582 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.showForSystem()>
		}
		if(((j ^ i) & 0x100) != 0 && mActionBarVisibilityCallback != null)
	//*  52  104:iload           4
	//*  53  106:iload_1         
	//*  54  107:ixor            
	//*  55  108:sipush          256
	//*  56  111:iand            
	//*  57  112:ifeq            126
	//*  58  115:aload_0         
	//*  59  116:getfield        #550 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  60  119:ifnull          126
			ViewCompat.requestApplyInsets(((View) (this)));
	//   61  122:aload_0         
	//   62  123:invokestatic    #439 <Method void ViewCompat.requestApplyInsets(View)>
	//   63  126:return          
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
	//*   4    6:ifeq            29
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #215 <Method Context getContext()>
	//*   7   13:invokevirtual   #252 <Method ApplicationInfo Context.getApplicationInfo()>
	//*   8   16:getfield        #257 <Field int ApplicationInfo.targetSdkVersion>
	//*   9   19:bipush          19
	//*  10   21:icmpge          29
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_1        
		else
	//*  13   26:goto            31
			flag = false;
	//   14   29:iconst_0        
	//   15   30:istore_1        
		mIgnoreWindowContentOverlay = flag;
	//   16   31:aload_0         
	//   17   32:iload_1         
	//   18   33:putfield        #259 <Field boolean mIgnoreWindowContentOverlay>
	//   19   36:return          
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
