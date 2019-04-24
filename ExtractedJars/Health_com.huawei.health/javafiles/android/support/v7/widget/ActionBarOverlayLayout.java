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
	//    3    3:invokespecial   #86  <Method void ActionBarOverlayLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #87  <Method void ViewGroup(Context, AttributeSet)>
		mWindowVisibility = 0;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #89  <Field int mWindowVisibility>
		mBaseContentInsets = new Rect();
	//    7   11:aload_0         
	//    8   12:new             #91  <Class Rect>
	//    9   15:dup             
	//   10   16:invokespecial   #93  <Method void Rect()>
	//   11   19:putfield        #95  <Field Rect mBaseContentInsets>
		mLastBaseContentInsets = new Rect();
	//   12   22:aload_0         
	//   13   23:new             #91  <Class Rect>
	//   14   26:dup             
	//   15   27:invokespecial   #93  <Method void Rect()>
	//   16   30:putfield        #97  <Field Rect mLastBaseContentInsets>
		mContentInsets = new Rect();
	//   17   33:aload_0         
	//   18   34:new             #91  <Class Rect>
	//   19   37:dup             
	//   20   38:invokespecial   #93  <Method void Rect()>
	//   21   41:putfield        #99  <Field Rect mContentInsets>
		mBaseInnerInsets = new Rect();
	//   22   44:aload_0         
	//   23   45:new             #91  <Class Rect>
	//   24   48:dup             
	//   25   49:invokespecial   #93  <Method void Rect()>
	//   26   52:putfield        #101 <Field Rect mBaseInnerInsets>
		mInnerInsets = new Rect();
	//   27   55:aload_0         
	//   28   56:new             #91  <Class Rect>
	//   29   59:dup             
	//   30   60:invokespecial   #93  <Method void Rect()>
	//   31   63:putfield        #103 <Field Rect mInnerInsets>
		mLastInnerInsets = new Rect();
	//   32   66:aload_0         
	//   33   67:new             #91  <Class Rect>
	//   34   70:dup             
	//   35   71:invokespecial   #93  <Method void Rect()>
	//   36   74:putfield        #105 <Field Rect mLastInnerInsets>
		ACTION_BAR_ANIMATE_DELAY = 600;
	//   37   77:aload_0         
	//   38   78:sipush          600
	//   39   81:putfield        #107 <Field int ACTION_BAR_ANIMATE_DELAY>
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
	//   40   84:aload_0         
	//   41   85:new             #10  <Class ActionBarOverlayLayout$1>
	//   42   88:dup             
	//   43   89:aload_0         
	//   44   90:invokespecial   #110 <Method void ActionBarOverlayLayout$1(ActionBarOverlayLayout)>
	//   45   93:putfield        #112 <Field AnimatorListenerAdapter mTopAnimatorListener>
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
	//   46   96:aload_0         
	//   47   97:new             #12  <Class ActionBarOverlayLayout$2>
	//   48  100:dup             
	//   49  101:aload_0         
	//   50  102:invokespecial   #113 <Method void ActionBarOverlayLayout$2(ActionBarOverlayLayout)>
	//   51  105:putfield        #115 <Field Runnable mRemoveActionBarHideOffset>
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
	//   52  108:aload_0         
	//   53  109:new             #14  <Class ActionBarOverlayLayout$3>
	//   54  112:dup             
	//   55  113:aload_0         
	//   56  114:invokespecial   #116 <Method void ActionBarOverlayLayout$3(ActionBarOverlayLayout)>
	//   57  117:putfield        #118 <Field Runnable mAddActionBarHideOffset>
		init(context);
	//   58  120:aload_0         
	//   59  121:aload_1         
	//   60  122:invokespecial   #121 <Method void init(Context)>
		mParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   61  125:aload_0         
	//   62  126:new             #123 <Class NestedScrollingParentHelper>
	//   63  129:dup             
	//   64  130:aload_0         
	//   65  131:invokespecial   #126 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   66  134:putfield        #128 <Field NestedScrollingParentHelper mParentHelper>
	//   67  137:return          
	}

	private void addActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
		mAddActionBarHideOffset.run();
	//    2    4:aload_0         
	//    3    5:getfield        #118 <Field Runnable mAddActionBarHideOffset>
	//    4    8:invokeinterface #137 <Method void Runnable.run()>
	//    5   13:return          
	}

	private boolean applyInsets(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
	{
		boolean flag5 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		view = ((View) ((LayoutParams)view.getLayoutParams()));
	//    2    3:aload_1         
	//    3    4:invokevirtual   #145 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
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
	//*  13   24:getfield        #148 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//*  14   27:aload_2         
	//*  15   28:getfield        #151 <Field int Rect.left>
	//*  16   31:icmpeq          45
			{
				flag4 = true;
	//   17   34:iconst_1        
	//   18   35:istore          7
				view.leftMargin = rect.left;
	//   19   37:aload_1         
	//   20   38:aload_2         
	//   21   39:getfield        #151 <Field int Rect.left>
	//   22   42:putfield        #148 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
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
	//*  30   57:getfield        #154 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//*  31   60:aload_2         
	//*  32   61:getfield        #157 <Field int Rect.top>
	//*  33   64:icmpeq          77
			{
				flag = true;
	//   34   67:iconst_1        
	//   35   68:istore_3        
				view.topMargin = rect.top;
	//   36   69:aload_1         
	//   37   70:aload_2         
	//   38   71:getfield        #157 <Field int Rect.top>
	//   39   74:putfield        #154 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
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
	//*  47   89:getfield        #160 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//*  48   92:aload_2         
	//*  49   93:getfield        #163 <Field int Rect.right>
	//*  50   96:icmpeq          110
			{
				flag1 = true;
	//   51   99:iconst_1        
	//   52  100:istore          4
				view.rightMargin = rect.right;
	//   53  102:aload_1         
	//   54  103:aload_2         
	//   55  104:getfield        #163 <Field int Rect.right>
	//   56  107:putfield        #160 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
			}
		}
		flag = flag1;
	//   57  110:iload           4
	//   58  112:istore_3        
		if(flag2)
	//*  59  113:iload           5
	//*  60  115:ifeq            142
		{
			flag = flag1;
	//   61  118:iload           4
	//   62  120:istore_3        
			if(((LayoutParams) (view)).bottomMargin != rect.bottom)
	//*  63  121:aload_1         
	//*  64  122:getfield        #166 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//*  65  125:aload_2         
	//*  66  126:getfield        #169 <Field int Rect.bottom>
	//*  67  129:icmpeq          142
			{
				flag = true;
	//   68  132:iconst_1        
	//   69  133:istore_3        
				view.bottomMargin = rect.bottom;
	//   70  134:aload_1         
	//   71  135:aload_2         
	//   72  136:getfield        #169 <Field int Rect.bottom>
	//   73  139:putfield        #166 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
			}
		}
		return flag;
	//   74  142:iload_3         
	//   75  143:ireturn         
	}

	private DecorToolbar getDecorToolbar(View view)
	{
		if(view instanceof DecorToolbar)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #173 <Class DecorToolbar>
	//*   2    4:ifeq            12
			return (DecorToolbar)view;
	//    3    7:aload_1         
	//    4    8:checkcast       #173 <Class DecorToolbar>
	//    5   11:areturn         
		if(view instanceof Toolbar)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #175 <Class Toolbar>
	//*   8   16:ifeq            27
			return ((Toolbar)view).getWrapper();
	//    9   19:aload_1         
	//   10   20:checkcast       #175 <Class Toolbar>
	//   11   23:invokevirtual   #179 <Method DecorToolbar Toolbar.getWrapper()>
	//   12   26:areturn         
		else
			throw new IllegalStateException((new StringBuilder()).append("Can't make a decor toolbar out of ").append(((Object) (view)).getClass().getSimpleName()).toString());
	//   13   27:new             #181 <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:new             #183 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #184 <Method void StringBuilder()>
	//   18   38:ldc1            #186 <String "Can't make a decor toolbar out of ">
	//   19   40:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:aload_1         
	//   21   44:invokevirtual   #196 <Method Class Object.getClass()>
	//   22   47:invokevirtual   #202 <Method String Class.getSimpleName()>
	//   23   50:invokevirtual   #190 <Method StringBuilder StringBuilder.append(String)>
	//   24   53:invokevirtual   #205 <Method String StringBuilder.toString()>
	//   25   56:invokespecial   #208 <Method void IllegalStateException(String)>
	//   26   59:athrow          
	}

	private void init(Context context)
	{
		TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(ATTRS);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #212 <Method Context getContext()>
	//    2    4:invokevirtual   #218 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    3    7:getstatic       #80  <Field int[] ATTRS>
	//    4   10:invokevirtual   #224 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(int[])>
	//    5   13:astore_3        
		mActionBarHeight = typedarray.getDimensionPixelSize(0, 0);
	//    6   14:aload_0         
	//    7   15:aload_3         
	//    8   16:iconst_0        
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #230 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   11   21:putfield        #232 <Field int mActionBarHeight>
		mWindowContentOverlay = typedarray.getDrawable(1);
	//   12   24:aload_0         
	//   13   25:aload_3         
	//   14   26:iconst_1        
	//   15   27:invokevirtual   #236 <Method Drawable TypedArray.getDrawable(int)>
	//   16   30:putfield        #238 <Field Drawable mWindowContentOverlay>
		boolean flag;
		if(mWindowContentOverlay == null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #238 <Field Drawable mWindowContentOverlay>
	//*  19   37:ifnonnull       45
			flag = true;
	//   20   40:iconst_1        
	//   21   41:istore_2        
		else
	//*  22   42:goto            47
			flag = false;
	//   23   45:iconst_0        
	//   24   46:istore_2        
		setWillNotDraw(flag);
	//   25   47:aload_0         
	//   26   48:iload_2         
	//   27   49:invokevirtual   #242 <Method void setWillNotDraw(boolean)>
		typedarray.recycle();
	//   28   52:aload_3         
	//   29   53:invokevirtual   #245 <Method void TypedArray.recycle()>
		if(context.getApplicationInfo().targetSdkVersion < 19)
	//*  30   56:aload_1         
	//*  31   57:invokevirtual   #249 <Method ApplicationInfo Context.getApplicationInfo()>
	//*  32   60:getfield        #254 <Field int ApplicationInfo.targetSdkVersion>
	//*  33   63:bipush          19
	//*  34   65:icmpge          73
			flag = true;
	//   35   68:iconst_1        
	//   36   69:istore_2        
		else
	//*  37   70:goto            75
			flag = false;
	//   38   73:iconst_0        
	//   39   74:istore_2        
		mIgnoreWindowContentOverlay = flag;
	//   40   75:aload_0         
	//   41   76:iload_2         
	//   42   77:putfield        #256 <Field boolean mIgnoreWindowContentOverlay>
		mFlingEstimator = new OverScroller(context);
	//   43   80:aload_0         
	//   44   81:new             #258 <Class OverScroller>
	//   45   84:dup             
	//   46   85:aload_1         
	//   47   86:invokespecial   #260 <Method void OverScroller(Context)>
	//   48   89:putfield        #262 <Field OverScroller mFlingEstimator>
	//   49   92:return          
	}

	private void postAddActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
		postDelayed(mAddActionBarHideOffset, 600L);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #118 <Field Runnable mAddActionBarHideOffset>
	//    5    9:ldc2w           #264 <Long 600L>
	//    6   12:invokevirtual   #269 <Method boolean postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void postRemoveActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
		postDelayed(mRemoveActionBarHideOffset, 600L);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #115 <Field Runnable mRemoveActionBarHideOffset>
	//    5    9:ldc2w           #264 <Long 600L>
	//    6   12:invokevirtual   #269 <Method boolean postDelayed(Runnable, long)>
	//    7   15:pop             
	//    8   16:return          
	}

	private void removeActionBarHideOffset()
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
		mRemoveActionBarHideOffset.run();
	//    2    4:aload_0         
	//    3    5:getfield        #115 <Field Runnable mRemoveActionBarHideOffset>
	//    4    8:invokeinterface #137 <Method void Runnable.run()>
	//    5   13:return          
	}

	private boolean shouldHideActionBarOnFling(float f, float f1)
	{
		mFlingEstimator.fling(0, 0, 0, (int)f1, 0, 0, 0x80000000, 0x7fffffff);
	//    0    0:aload_0         
	//    1    1:getfield        #262 <Field OverScroller mFlingEstimator>
	//    2    4:iconst_0        
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:fload_2         
	//    6    8:f2i             
	//    7    9:iconst_0        
	//    8   10:iconst_0        
	//    9   11:ldc2            #274 <Int 0x80000000>
	//   10   14:ldc2            #275 <Int 0x7fffffff>
	//   11   17:invokevirtual   #279 <Method void OverScroller.fling(int, int, int, int, int, int, int, int)>
		return mFlingEstimator.getFinalY() > mActionBarTop.getHeight();
	//   12   20:aload_0         
	//   13   21:getfield        #262 <Field OverScroller mFlingEstimator>
	//   14   24:invokevirtual   #283 <Method int OverScroller.getFinalY()>
	//   15   27:aload_0         
	//   16   28:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   17   31:invokevirtual   #290 <Method int ActionBarContainer.getHeight()>
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
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.canShowOverflowMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #299 <Method boolean DecorToolbar.canShowOverflowMenu()>
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
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.dismissPopupMenus();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #305 <Method void DecorToolbar.dismissPopupMenus()>
	//    5   13:return          
	}

	public void draw(Canvas canvas)
	{
		super.draw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #309 <Method void ViewGroup.draw(Canvas)>
		if(mWindowContentOverlay != null && !mIgnoreWindowContentOverlay)
	//*   3    5:aload_0         
	//*   4    6:getfield        #238 <Field Drawable mWindowContentOverlay>
	//*   5    9:ifnull          86
	//*   6   12:aload_0         
	//*   7   13:getfield        #256 <Field boolean mIgnoreWindowContentOverlay>
	//*   8   16:ifne            86
		{
			int i;
			if(mActionBarTop.getVisibility() == 0)
	//*   9   19:aload_0         
	//*  10   20:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//*  11   23:invokevirtual   #312 <Method int ActionBarContainer.getVisibility()>
	//*  12   26:ifne            54
				i = (int)((float)mActionBarTop.getBottom() + mActionBarTop.getTranslationY() + 0.5F);
	//   13   29:aload_0         
	//   14   30:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   15   33:invokevirtual   #315 <Method int ActionBarContainer.getBottom()>
	//   16   36:i2f             
	//   17   37:aload_0         
	//   18   38:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   19   41:invokevirtual   #319 <Method float ActionBarContainer.getTranslationY()>
	//   20   44:fadd            
	//   21   45:ldc2            #320 <Float 0.5F>
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
	//   29   57:getfield        #238 <Field Drawable mWindowContentOverlay>
	//   30   60:iconst_0        
	//   31   61:iload_2         
	//   32   62:aload_0         
	//   33   63:invokevirtual   #323 <Method int getWidth()>
	//   34   66:aload_0         
	//   35   67:getfield        #238 <Field Drawable mWindowContentOverlay>
	//   36   70:invokevirtual   #328 <Method int Drawable.getIntrinsicHeight()>
	//   37   73:iload_2         
	//   38   74:iadd            
	//   39   75:invokevirtual   #332 <Method void Drawable.setBounds(int, int, int, int)>
			mWindowContentOverlay.draw(canvas);
	//   40   78:aload_0         
	//   41   79:getfield        #238 <Field Drawable mWindowContentOverlay>
	//   42   82:aload_1         
	//   43   83:invokevirtual   #333 <Method void Drawable.draw(Canvas)>
		}
	//   44   86:return          
	}

	protected boolean fitSystemWindows(Rect rect)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		if((ViewCompat.getWindowSystemUiVisibility(((View) (this))) & 0x100) == 0);
	//    2    4:aload_0         
	//    3    5:invokestatic    #341 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//    4    8:sipush          256
	//    5   11:iand            
	//    6   12:ifeq            18
	//*   7   15:goto            18
		boolean flag = applyInsets(((View) (mActionBarTop)), rect, true, true, false, true);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   11   23:aload_1         
	//   12   24:iconst_1        
	//   13   25:iconst_1        
	//   14   26:iconst_0        
	//   15   27:iconst_1        
	//   16   28:invokespecial   #343 <Method boolean applyInsets(View, Rect, boolean, boolean, boolean, boolean)>
	//   17   31:istore_2        
		mBaseInnerInsets.set(rect);
	//   18   32:aload_0         
	//   19   33:getfield        #101 <Field Rect mBaseInnerInsets>
	//   20   36:aload_1         
	//   21   37:invokevirtual   #347 <Method void Rect.set(Rect)>
		ViewUtils.computeFitSystemWindows(((View) (this)), mBaseInnerInsets, mBaseContentInsets);
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #101 <Field Rect mBaseInnerInsets>
	//   25   45:aload_0         
	//   26   46:getfield        #95  <Field Rect mBaseContentInsets>
	//   27   49:invokestatic    #353 <Method void ViewUtils.computeFitSystemWindows(View, Rect, Rect)>
		if(!mLastBaseContentInsets.equals(((Object) (mBaseContentInsets))))
	//*  28   52:aload_0         
	//*  29   53:getfield        #97  <Field Rect mLastBaseContentInsets>
	//*  30   56:aload_0         
	//*  31   57:getfield        #95  <Field Rect mBaseContentInsets>
	//*  32   60:invokevirtual   #357 <Method boolean Rect.equals(Object)>
	//*  33   63:ifne            79
		{
			flag = true;
	//   34   66:iconst_1        
	//   35   67:istore_2        
			mLastBaseContentInsets.set(mBaseContentInsets);
	//   36   68:aload_0         
	//   37   69:getfield        #97  <Field Rect mLastBaseContentInsets>
	//   38   72:aload_0         
	//   39   73:getfield        #95  <Field Rect mBaseContentInsets>
	//   40   76:invokevirtual   #347 <Method void Rect.set(Rect)>
		}
		if(flag)
	//*  41   79:iload_2         
	//*  42   80:ifeq            87
			requestLayout();
	//   43   83:aload_0         
	//   44   84:invokevirtual   #360 <Method void requestLayout()>
		return true;
	//   45   87:iconst_1        
	//   46   88:ireturn         
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-1, -1);
	//    0    0:new             #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #365 <Method void ActionBarOverlayLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #367 <Method ActionBarOverlayLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #212 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #370 <Method void ActionBarOverlayLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #373 <Method ActionBarOverlayLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #19  <Class ActionBarOverlayLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #377 <Method void ActionBarOverlayLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public int getActionBarHideOffset()
	{
		if(mActionBarTop != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//*   2    4:ifnull          17
			return -(int)mActionBarTop.getTranslationY();
	//    3    7:aload_0         
	//    4    8:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//    5   11:invokevirtual   #319 <Method float ActionBarContainer.getTranslationY()>
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
	//    1    1:getfield        #128 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:invokevirtual   #381 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	public CharSequence getTitle()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.getTitle();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #385 <Method CharSequence DecorToolbar.getTitle()>
	//    5   13:areturn         
	}

	void haltActionBarHideOffsetAnimations()
	{
		removeCallbacks(mRemoveActionBarHideOffset);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #115 <Field Runnable mRemoveActionBarHideOffset>
	//    3    5:invokevirtual   #389 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		removeCallbacks(mAddActionBarHideOffset);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #118 <Field Runnable mAddActionBarHideOffset>
	//    8   14:invokevirtual   #389 <Method boolean removeCallbacks(Runnable)>
	//    9   17:pop             
		if(mCurrentActionBarTopAnimator != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #391 <Field ViewPropertyAnimator mCurrentActionBarTopAnimator>
	//*  12   22:ifnull          32
			mCurrentActionBarTopAnimator.cancel();
	//   13   25:aload_0         
	//   14   26:getfield        #391 <Field ViewPropertyAnimator mCurrentActionBarTopAnimator>
	//   15   29:invokevirtual   #396 <Method void ViewPropertyAnimator.cancel()>
	//   16   32:return          
	}

	public boolean hasIcon()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.hasIcon();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #399 <Method boolean DecorToolbar.hasIcon()>
	//    5   13:ireturn         
	}

	public boolean hasLogo()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.hasLogo();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #402 <Method boolean DecorToolbar.hasLogo()>
	//    5   13:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.hideOverflowMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #405 <Method boolean DecorToolbar.hideOverflowMenu()>
	//    5   13:ireturn         
	}

	public void initFeature(int i)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
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
	//    6   42:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    7   45:invokeinterface #410 <Method void DecorToolbar.initProgress()>
			return;
	//    8   50:return          

		case 5: // '\005'
			mDecorToolbar.initIndeterminateProgress();
	//    9   51:aload_0         
	//   10   52:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//   11   55:invokeinterface #413 <Method void DecorToolbar.initIndeterminateProgress()>
			return;
	//   12   60:return          

		case 109: // 'm'
			setOverlayMode(true);
	//   13   61:aload_0         
	//   14   62:iconst_1        
	//   15   63:invokevirtual   #416 <Method void setOverlayMode(boolean)>
			break;
		}
	//   16   66:return          
	}

	public boolean isHideOnContentScrollEnabled()
	{
		return mHideOnContentScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #419 <Field boolean mHideOnContentScroll>
	//    2    4:ireturn         
	}

	public boolean isInOverlayMode()
	{
		return mOverlayMode;
	//    0    0:aload_0         
	//    1    1:getfield        #422 <Field boolean mOverlayMode>
	//    2    4:ireturn         
	}

	public boolean isOverflowMenuShowPending()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.isOverflowMenuShowPending();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #425 <Method boolean DecorToolbar.isOverflowMenuShowPending()>
	//    5   13:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.isOverflowMenuShowing();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #428 <Method boolean DecorToolbar.isOverflowMenuShowing()>
	//    5   13:ireturn         
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #432 <Method void ViewGroup.onConfigurationChanged(Configuration)>
		init(getContext());
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #212 <Method Context getContext()>
	//    6   10:invokespecial   #121 <Method void init(Context)>
		ViewCompat.requestApplyInsets(((View) (this)));
	//    7   13:aload_0         
	//    8   14:invokestatic    #436 <Method void ViewCompat.requestApplyInsets(View)>
	//    9   17:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #439 <Method void ViewGroup.onDetachedFromWindow()>
		haltActionBarHideOffsetAnimations();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
	//    4    8:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #444 <Method int getChildCount()>
	//    2    4:istore_3        
		k = getPaddingLeft();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #447 <Method int getPaddingLeft()>
	//    5    9:istore          4
		getPaddingRight();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #450 <Method int getPaddingRight()>
	//    8   15:pop             
		l = getPaddingTop();
	//    9   16:aload_0         
	//   10   17:invokevirtual   #453 <Method int getPaddingTop()>
	//   11   20:istore          5
		getPaddingBottom();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #456 <Method int getPaddingBottom()>
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
	//   22   36:invokevirtual   #460 <Method View getChildAt(int)>
	//   23   39:astore          10
			if(view.getVisibility() != 8)
	//*  24   41:aload           10
	//*  25   43:invokevirtual   #461 <Method int View.getVisibility()>
	//*  26   46:bipush          8
	//*  27   48:icmpeq          114
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   28   51:aload           10
	//   29   53:invokevirtual   #145 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   56:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//   31   59:astore          11
				int i1 = view.getMeasuredWidth();
	//   32   61:aload           10
	//   33   63:invokevirtual   #464 <Method int View.getMeasuredWidth()>
	//   34   66:istore          6
				int j1 = view.getMeasuredHeight();
	//   35   68:aload           10
	//   36   70:invokevirtual   #467 <Method int View.getMeasuredHeight()>
	//   37   73:istore          7
				int k1 = k + layoutparams.leftMargin;
	//   38   75:iload           4
	//   39   77:aload           11
	//   40   79:getfield        #148 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//   41   82:iadd            
	//   42   83:istore          8
				int l1 = l + layoutparams.topMargin;
	//   43   85:iload           5
	//   44   87:aload           11
	//   45   89:getfield        #154 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//   46   92:iadd            
	//   47   93:istore          9
				view.layout(k1, l1, k1 + i1, l1 + j1);
	//   48   95:aload           10
	//   49   97:iload           8
	//   50   99:iload           9
	//   51  101:iload           8
	//   52  103:iload           6
	//   53  105:iadd            
	//   54  106:iload           9
	//   55  108:iload           7
	//   56  110:iadd            
	//   57  111:invokevirtual   #470 <Method void View.layout(int, int, int, int)>
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
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		int k = 0;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		measureChildWithMargins(((View) (mActionBarTop)), i, 0, j, 0);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//    7   11:iload_1         
	//    8   12:iconst_0        
	//    9   13:iload_2         
	//   10   14:iconst_0        
	//   11   15:invokevirtual   #475 <Method void measureChildWithMargins(View, int, int, int, int)>
		Object obj = ((Object) ((LayoutParams)mActionBarTop.getLayoutParams()));
	//   12   18:aload_0         
	//   13   19:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   14   22:invokevirtual   #476 <Method android.view.ViewGroup$LayoutParams ActionBarContainer.getLayoutParams()>
	//   15   25:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//   16   28:astore          9
		int i2 = Math.max(0, mActionBarTop.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
	//   17   30:iconst_0        
	//   18   31:aload_0         
	//   19   32:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   20   35:invokevirtual   #477 <Method int ActionBarContainer.getMeasuredWidth()>
	//   21   38:aload           9
	//   22   40:getfield        #148 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//   23   43:iadd            
	//   24   44:aload           9
	//   25   46:getfield        #160 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//   26   49:iadd            
	//   27   50:invokestatic    #482 <Method int Math.max(int, int)>
	//   28   53:istore          8
		int l1 = Math.max(0, mActionBarTop.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
	//   29   55:iconst_0        
	//   30   56:aload_0         
	//   31   57:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   32   60:invokevirtual   #483 <Method int ActionBarContainer.getMeasuredHeight()>
	//   33   63:aload           9
	//   34   65:getfield        #154 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//   35   68:iadd            
	//   36   69:aload           9
	//   37   71:getfield        #166 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//   38   74:iadd            
	//   39   75:invokestatic    #482 <Method int Math.max(int, int)>
	//   40   78:istore          7
		int k1 = View.combineMeasuredStates(0, mActionBarTop.getMeasuredState());
	//   41   80:iconst_0        
	//   42   81:aload_0         
	//   43   82:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   44   85:invokevirtual   #486 <Method int ActionBarContainer.getMeasuredState()>
	//   45   88:invokestatic    #489 <Method int View.combineMeasuredStates(int, int)>
	//   46   91:istore          6
		boolean flag;
		if((ViewCompat.getWindowSystemUiVisibility(((View) (this))) & 0x100) != 0)
	//*  47   93:aload_0         
	//*  48   94:invokestatic    #341 <Method int ViewCompat.getWindowSystemUiVisibility(View)>
	//*  49   97:sipush          256
	//*  50  100:iand            
	//*  51  101:ifeq            110
			flag = true;
	//   52  104:iconst_1        
	//   53  105:istore          4
		else
	//*  54  107:goto            113
			flag = false;
	//   55  110:iconst_0        
	//   56  111:istore          4
		if(flag)
	//*  57  113:iload           4
	//*  58  115:ifeq            158
		{
			int i1 = mActionBarHeight;
	//   59  118:aload_0         
	//   60  119:getfield        #232 <Field int mActionBarHeight>
	//   61  122:istore          5
			k = i1;
	//   62  124:iload           5
	//   63  126:istore_3        
			if(mHasNonEmbeddedTabs)
	//*  64  127:aload_0         
	//*  65  128:getfield        #491 <Field boolean mHasNonEmbeddedTabs>
	//*  66  131:ifeq            178
			{
				k = i1;
	//   67  134:iload           5
	//   68  136:istore_3        
				if(mActionBarTop.getTabContainer() != null)
	//*  69  137:aload_0         
	//*  70  138:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//*  71  141:invokevirtual   #495 <Method View ActionBarContainer.getTabContainer()>
	//*  72  144:ifnull          155
					k = i1 + mActionBarHeight;
	//   73  147:iload           5
	//   74  149:aload_0         
	//   75  150:getfield        #232 <Field int mActionBarHeight>
	//   76  153:iadd            
	//   77  154:istore_3        
			}
		} else
	//*  78  155:goto            178
		if(mActionBarTop.getVisibility() != 8)
	//*  79  158:aload_0         
	//*  80  159:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//*  81  162:invokevirtual   #312 <Method int ActionBarContainer.getVisibility()>
	//*  82  165:bipush          8
	//*  83  167:icmpeq          178
			k = mActionBarTop.getMeasuredHeight();
	//   84  170:aload_0         
	//   85  171:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   86  174:invokevirtual   #483 <Method int ActionBarContainer.getMeasuredHeight()>
	//   87  177:istore_3        
		mContentInsets.set(mBaseContentInsets);
	//   88  178:aload_0         
	//   89  179:getfield        #99  <Field Rect mContentInsets>
	//   90  182:aload_0         
	//   91  183:getfield        #95  <Field Rect mBaseContentInsets>
	//   92  186:invokevirtual   #347 <Method void Rect.set(Rect)>
		mInnerInsets.set(mBaseInnerInsets);
	//   93  189:aload_0         
	//   94  190:getfield        #103 <Field Rect mInnerInsets>
	//   95  193:aload_0         
	//   96  194:getfield        #101 <Field Rect mBaseInnerInsets>
	//   97  197:invokevirtual   #347 <Method void Rect.set(Rect)>
		if(!mOverlayMode && !flag)
	//*  98  200:aload_0         
	//*  99  201:getfield        #422 <Field boolean mOverlayMode>
	//* 100  204:ifne            251
	//* 101  207:iload           4
	//* 102  209:ifne            251
		{
			obj = ((Object) (mContentInsets));
	//  103  212:aload_0         
	//  104  213:getfield        #99  <Field Rect mContentInsets>
	//  105  216:astore          9
			obj.top = ((Rect) (obj)).top + k;
	//  106  218:aload           9
	//  107  220:aload           9
	//  108  222:getfield        #157 <Field int Rect.top>
	//  109  225:iload_3         
	//  110  226:iadd            
	//  111  227:putfield        #157 <Field int Rect.top>
			obj = ((Object) (mContentInsets));
	//  112  230:aload_0         
	//  113  231:getfield        #99  <Field Rect mContentInsets>
	//  114  234:astore          9
			obj.bottom = ((Rect) (obj)).bottom + 0;
	//  115  236:aload           9
	//  116  238:aload           9
	//  117  240:getfield        #169 <Field int Rect.bottom>
	//  118  243:iconst_0        
	//  119  244:iadd            
	//  120  245:putfield        #169 <Field int Rect.bottom>
		} else
	//* 121  248:goto            287
		{
			obj = ((Object) (mInnerInsets));
	//  122  251:aload_0         
	//  123  252:getfield        #103 <Field Rect mInnerInsets>
	//  124  255:astore          9
			obj.top = ((Rect) (obj)).top + k;
	//  125  257:aload           9
	//  126  259:aload           9
	//  127  261:getfield        #157 <Field int Rect.top>
	//  128  264:iload_3         
	//  129  265:iadd            
	//  130  266:putfield        #157 <Field int Rect.top>
			obj = ((Object) (mInnerInsets));
	//  131  269:aload_0         
	//  132  270:getfield        #103 <Field Rect mInnerInsets>
	//  133  273:astore          9
			obj.bottom = ((Rect) (obj)).bottom + 0;
	//  134  275:aload           9
	//  135  277:aload           9
	//  136  279:getfield        #169 <Field int Rect.bottom>
	//  137  282:iconst_0        
	//  138  283:iadd            
	//  139  284:putfield        #169 <Field int Rect.bottom>
		}
		applyInsets(((View) (mContent)), mContentInsets, true, true, true, true);
	//  140  287:aload_0         
	//  141  288:aload_0         
	//  142  289:getfield        #497 <Field ContentFrameLayout mContent>
	//  143  292:aload_0         
	//  144  293:getfield        #99  <Field Rect mContentInsets>
	//  145  296:iconst_1        
	//  146  297:iconst_1        
	//  147  298:iconst_1        
	//  148  299:iconst_1        
	//  149  300:invokespecial   #343 <Method boolean applyInsets(View, Rect, boolean, boolean, boolean, boolean)>
	//  150  303:pop             
		if(!mLastInnerInsets.equals(((Object) (mInnerInsets))))
	//* 151  304:aload_0         
	//* 152  305:getfield        #105 <Field Rect mLastInnerInsets>
	//* 153  308:aload_0         
	//* 154  309:getfield        #103 <Field Rect mInnerInsets>
	//* 155  312:invokevirtual   #357 <Method boolean Rect.equals(Object)>
	//* 156  315:ifne            340
		{
			mLastInnerInsets.set(mInnerInsets);
	//  157  318:aload_0         
	//  158  319:getfield        #105 <Field Rect mLastInnerInsets>
	//  159  322:aload_0         
	//  160  323:getfield        #103 <Field Rect mInnerInsets>
	//  161  326:invokevirtual   #347 <Method void Rect.set(Rect)>
			mContent.dispatchFitSystemWindows(mInnerInsets);
	//  162  329:aload_0         
	//  163  330:getfield        #497 <Field ContentFrameLayout mContent>
	//  164  333:aload_0         
	//  165  334:getfield        #103 <Field Rect mInnerInsets>
	//  166  337:invokevirtual   #502 <Method void ContentFrameLayout.dispatchFitSystemWindows(Rect)>
		}
		measureChildWithMargins(((View) (mContent)), i, 0, j, 0);
	//  167  340:aload_0         
	//  168  341:aload_0         
	//  169  342:getfield        #497 <Field ContentFrameLayout mContent>
	//  170  345:iload_1         
	//  171  346:iconst_0        
	//  172  347:iload_2         
	//  173  348:iconst_0        
	//  174  349:invokevirtual   #475 <Method void measureChildWithMargins(View, int, int, int, int)>
		obj = ((Object) ((LayoutParams)mContent.getLayoutParams()));
	//  175  352:aload_0         
	//  176  353:getfield        #497 <Field ContentFrameLayout mContent>
	//  177  356:invokevirtual   #503 <Method android.view.ViewGroup$LayoutParams ContentFrameLayout.getLayoutParams()>
	//  178  359:checkcast       #19  <Class ActionBarOverlayLayout$LayoutParams>
	//  179  362:astore          9
		k = Math.max(i2, mContent.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
	//  180  364:iload           8
	//  181  366:aload_0         
	//  182  367:getfield        #497 <Field ContentFrameLayout mContent>
	//  183  370:invokevirtual   #504 <Method int ContentFrameLayout.getMeasuredWidth()>
	//  184  373:aload           9
	//  185  375:getfield        #148 <Field int ActionBarOverlayLayout$LayoutParams.leftMargin>
	//  186  378:iadd            
	//  187  379:aload           9
	//  188  381:getfield        #160 <Field int ActionBarOverlayLayout$LayoutParams.rightMargin>
	//  189  384:iadd            
	//  190  385:invokestatic    #482 <Method int Math.max(int, int)>
	//  191  388:istore_3        
		int l = Math.max(l1, mContent.getMeasuredHeight() + ((LayoutParams) (obj)).topMargin + ((LayoutParams) (obj)).bottomMargin);
	//  192  389:iload           7
	//  193  391:aload_0         
	//  194  392:getfield        #497 <Field ContentFrameLayout mContent>
	//  195  395:invokevirtual   #505 <Method int ContentFrameLayout.getMeasuredHeight()>
	//  196  398:aload           9
	//  197  400:getfield        #154 <Field int ActionBarOverlayLayout$LayoutParams.topMargin>
	//  198  403:iadd            
	//  199  404:aload           9
	//  200  406:getfield        #166 <Field int ActionBarOverlayLayout$LayoutParams.bottomMargin>
	//  201  409:iadd            
	//  202  410:invokestatic    #482 <Method int Math.max(int, int)>
	//  203  413:istore          4
		int j1 = View.combineMeasuredStates(k1, mContent.getMeasuredState());
	//  204  415:iload           6
	//  205  417:aload_0         
	//  206  418:getfield        #497 <Field ContentFrameLayout mContent>
	//  207  421:invokevirtual   #506 <Method int ContentFrameLayout.getMeasuredState()>
	//  208  424:invokestatic    #489 <Method int View.combineMeasuredStates(int, int)>
	//  209  427:istore          5
		k1 = getPaddingLeft();
	//  210  429:aload_0         
	//  211  430:invokevirtual   #447 <Method int getPaddingLeft()>
	//  212  433:istore          6
		l1 = getPaddingRight();
	//  213  435:aload_0         
	//  214  436:invokevirtual   #450 <Method int getPaddingRight()>
	//  215  439:istore          7
		l = Math.max(l + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
	//  216  441:iload           4
	//  217  443:aload_0         
	//  218  444:invokevirtual   #453 <Method int getPaddingTop()>
	//  219  447:aload_0         
	//  220  448:invokevirtual   #456 <Method int getPaddingBottom()>
	//  221  451:iadd            
	//  222  452:iadd            
	//  223  453:aload_0         
	//  224  454:invokevirtual   #509 <Method int getSuggestedMinimumHeight()>
	//  225  457:invokestatic    #482 <Method int Math.max(int, int)>
	//  226  460:istore          4
		setMeasuredDimension(View.resolveSizeAndState(Math.max(k + (k1 + l1), getSuggestedMinimumWidth()), i, j1), View.resolveSizeAndState(l, j, j1 << 16));
	//  227  462:aload_0         
	//  228  463:iload_3         
	//  229  464:iload           6
	//  230  466:iload           7
	//  231  468:iadd            
	//  232  469:iadd            
	//  233  470:aload_0         
	//  234  471:invokevirtual   #512 <Method int getSuggestedMinimumWidth()>
	//  235  474:invokestatic    #482 <Method int Math.max(int, int)>
	//  236  477:iload_1         
	//  237  478:iload           5
	//  238  480:invokestatic    #516 <Method int View.resolveSizeAndState(int, int, int)>
	//  239  483:iload           4
	//  240  485:iload_2         
	//  241  486:iload           5
	//  242  488:bipush          16
	//  243  490:ishl            
	//  244  491:invokestatic    #516 <Method int View.resolveSizeAndState(int, int, int)>
	//  245  494:invokevirtual   #519 <Method void setMeasuredDimension(int, int)>
	//  246  497:return          
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		if(!mHideOnContentScroll || !flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #419 <Field boolean mHideOnContentScroll>
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
	//*  10   17:invokespecial   #523 <Method boolean shouldHideActionBarOnFling(float, float)>
	//*  11   20:ifeq            30
			addActionBarHideOffset();
	//   12   23:aload_0         
	//   13   24:invokespecial   #525 <Method void addActionBarHideOffset()>
		else
	//*  14   27:goto            34
			removeActionBarHideOffset();
	//   15   30:aload_0         
	//   16   31:invokespecial   #527 <Method void removeActionBarHideOffset()>
		mAnimatingForFling = true;
	//   17   34:aload_0         
	//   18   35:iconst_1        
	//   19   36:putfield        #529 <Field boolean mAnimatingForFling>
		return true;
	//   20   39:iconst_1        
	//   21   40:ireturn         
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
	//    2    2:getfield        #536 <Field int mHideOnContentScrollReference>
	//    3    5:iload_3         
	//    4    6:iadd            
	//    5    7:putfield        #536 <Field int mHideOnContentScrollReference>
		setActionBarHideOffset(mHideOnContentScrollReference);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:getfield        #536 <Field int mHideOnContentScrollReference>
	//    9   15:invokevirtual   #539 <Method void setActionBarHideOffset(int)>
	//   10   18:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field NestedScrollingParentHelper mParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #543 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		mHideOnContentScrollReference = getActionBarHideOffset();
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #545 <Method int getActionBarHideOffset()>
	//    9   15:putfield        #536 <Field int mHideOnContentScrollReference>
		haltActionBarHideOffsetAnimations();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
		if(mActionBarVisibilityCallback != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  14   26:ifnull          38
			mActionBarVisibilityCallback.onContentScrollStarted();
	//   15   29:aload_0         
	//   16   30:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   17   33:invokeinterface #550 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onContentScrollStarted()>
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
	//*   5    7:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//*   6   10:invokevirtual   #312 <Method int ActionBarContainer.getVisibility()>
	//*   7   13:ifeq            18
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		else
			return mHideOnContentScroll;
	//   10   18:aload_0         
	//   11   19:getfield        #419 <Field boolean mHideOnContentScroll>
	//   12   22:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		if(mHideOnContentScroll && !mAnimatingForFling)
	//*   0    0:aload_0         
	//*   1    1:getfield        #419 <Field boolean mHideOnContentScroll>
	//*   2    4:ifeq            39
	//*   3    7:aload_0         
	//*   4    8:getfield        #529 <Field boolean mAnimatingForFling>
	//*   5   11:ifne            39
			if(mHideOnContentScrollReference <= mActionBarTop.getHeight())
	//*   6   14:aload_0         
	//*   7   15:getfield        #536 <Field int mHideOnContentScrollReference>
	//*   8   18:aload_0         
	//*   9   19:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//*  10   22:invokevirtual   #290 <Method int ActionBarContainer.getHeight()>
	//*  11   25:icmpgt          35
				postRemoveActionBarHideOffset();
	//   12   28:aload_0         
	//   13   29:invokespecial   #555 <Method void postRemoveActionBarHideOffset()>
			else
	//*  14   32:goto            39
				postAddActionBarHideOffset();
	//   15   35:aload_0         
	//   16   36:invokespecial   #557 <Method void postAddActionBarHideOffset()>
		if(mActionBarVisibilityCallback != null)
	//*  17   39:aload_0         
	//*  18   40:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  19   43:ifnull          55
			mActionBarVisibilityCallback.onContentScrollStopped();
	//   20   46:aload_0         
	//   21   47:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   22   50:invokeinterface #560 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onContentScrollStopped()>
	//   23   55:return          
	}

	public void onWindowSystemUiVisibilityChanged(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #566 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          13
			super.onWindowSystemUiVisibilityChanged(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #568 <Method void ViewGroup.onWindowSystemUiVisibilityChanged(int)>
		pullChildren();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #295 <Method void pullChildren()>
		int j = mLastSystemUiVisibility;
	//    8   17:aload_0         
	//    9   18:getfield        #570 <Field int mLastSystemUiVisibility>
	//   10   21:istore          4
		mLastSystemUiVisibility = i;
	//   11   23:aload_0         
	//   12   24:iload_1         
	//   13   25:putfield        #570 <Field int mLastSystemUiVisibility>
		boolean flag;
		if((i & 4) == 0)
	//*  14   28:iload_1         
	//*  15   29:iconst_4        
	//*  16   30:iand            
	//*  17   31:ifne            39
			flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_2        
		else
	//*  20   36:goto            41
			flag = false;
	//   21   39:iconst_0        
	//   22   40:istore_2        
		boolean flag1;
		if((i & 0x100) != 0)
	//*  23   41:iload_1         
	//*  24   42:sipush          256
	//*  25   45:iand            
	//*  26   46:ifeq            54
			flag1 = true;
	//   27   49:iconst_1        
	//   28   50:istore_3        
		else
	//*  29   51:goto            56
			flag1 = false;
	//   30   54:iconst_0        
	//   31   55:istore_3        
		if(mActionBarVisibilityCallback != null)
	//*  32   56:aload_0         
	//*  33   57:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  34   60:ifnull          120
		{
			ActionBarVisibilityCallback actionbarvisibilitycallback = mActionBarVisibilityCallback;
	//   35   63:aload_0         
	//   36   64:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   37   67:astore          6
			boolean flag2;
			if(!flag1)
	//*  38   69:iload_3         
	//*  39   70:ifne            79
				flag2 = true;
	//   40   73:iconst_1        
	//   41   74:istore          5
			else
	//*  42   76:goto            82
				flag2 = false;
	//   43   79:iconst_0        
	//   44   80:istore          5
			actionbarvisibilitycallback.enableContentAnimations(flag2);
	//   45   82:aload           6
	//   46   84:iload           5
	//   47   86:invokeinterface #573 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.enableContentAnimations(boolean)>
			if(flag || !flag1)
	//*  48   91:iload_2         
	//*  49   92:ifne            99
	//*  50   95:iload_3         
	//*  51   96:ifne            111
				mActionBarVisibilityCallback.showForSystem();
	//   52   99:aload_0         
	//   53  100:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   54  103:invokeinterface #576 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.showForSystem()>
			else
	//*  55  108:goto            120
				mActionBarVisibilityCallback.hideForSystem();
	//   56  111:aload_0         
	//   57  112:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   58  115:invokeinterface #579 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.hideForSystem()>
		}
		if(((j ^ i) & 0x100) != 0 && mActionBarVisibilityCallback != null)
	//*  59  120:iload           4
	//*  60  122:iload_1         
	//*  61  123:ixor            
	//*  62  124:sipush          256
	//*  63  127:iand            
	//*  64  128:ifeq            142
	//*  65  131:aload_0         
	//*  66  132:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*  67  135:ifnull          142
			ViewCompat.requestApplyInsets(((View) (this)));
	//   68  138:aload_0         
	//   69  139:invokestatic    #436 <Method void ViewCompat.requestApplyInsets(View)>
	//   70  142:return          
	}

	protected void onWindowVisibilityChanged(int i)
	{
		super.onWindowVisibilityChanged(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #582 <Method void ViewGroup.onWindowVisibilityChanged(int)>
		mWindowVisibility = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #89  <Field int mWindowVisibility>
		if(mActionBarVisibilityCallback != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//*   8   14:ifnull          27
			mActionBarVisibilityCallback.onWindowVisibilityChanged(i);
	//    9   17:aload_0         
	//   10   18:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//   11   21:iload_1         
	//   12   22:invokeinterface #583 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onWindowVisibilityChanged(int)>
	//   13   27:return          
	}

	void pullChildren()
	{
		if(mContent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #497 <Field ContentFrameLayout mContent>
	//*   2    4:ifnonnull       50
		{
			mContent = (ContentFrameLayout)findViewById(android.support.v7.appcompat.R.id.action_bar_activity_content);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #588 <Field int android.support.v7.appcompat.R$id.action_bar_activity_content>
	//    6   12:invokevirtual   #591 <Method View findViewById(int)>
	//    7   15:checkcast       #499 <Class ContentFrameLayout>
	//    8   18:putfield        #497 <Field ContentFrameLayout mContent>
			mActionBarTop = (ActionBarContainer)findViewById(android.support.v7.appcompat.R.id.action_bar_container);
	//    9   21:aload_0         
	//   10   22:aload_0         
	//   11   23:getstatic       #594 <Field int android.support.v7.appcompat.R$id.action_bar_container>
	//   12   26:invokevirtual   #591 <Method View findViewById(int)>
	//   13   29:checkcast       #287 <Class ActionBarContainer>
	//   14   32:putfield        #285 <Field ActionBarContainer mActionBarTop>
			mDecorToolbar = getDecorToolbar(findViewById(android.support.v7.appcompat.R.id.action_bar));
	//   15   35:aload_0         
	//   16   36:aload_0         
	//   17   37:aload_0         
	//   18   38:getstatic       #597 <Field int android.support.v7.appcompat.R$id.action_bar>
	//   19   41:invokevirtual   #591 <Method View findViewById(int)>
	//   20   44:invokespecial   #599 <Method DecorToolbar getDecorToolbar(View)>
	//   21   47:putfield        #297 <Field DecorToolbar mDecorToolbar>
		}
	//   22   50:return          
	}

	public void restoreToolbarHierarchyState(SparseArray sparsearray)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.restoreHierarchyState(sparsearray);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #604 <Method void DecorToolbar.restoreHierarchyState(SparseArray)>
	//    6   14:return          
	}

	public void saveToolbarHierarchyState(SparseArray sparsearray)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.saveHierarchyState(sparsearray);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #610 <Method void DecorToolbar.saveHierarchyState(SparseArray)>
	//    6   14:return          
	}

	public void setActionBarHideOffset(int i)
	{
		haltActionBarHideOffsetAnimations();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
		i = Math.max(0, Math.min(i, mActionBarTop.getHeight()));
	//    2    4:iconst_0        
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//    6   10:invokevirtual   #290 <Method int ActionBarContainer.getHeight()>
	//    7   13:invokestatic    #613 <Method int Math.min(int, int)>
	//    8   16:invokestatic    #482 <Method int Math.max(int, int)>
	//    9   19:istore_1        
		mActionBarTop.setTranslationY(-i);
	//   10   20:aload_0         
	//   11   21:getfield        #285 <Field ActionBarContainer mActionBarTop>
	//   12   24:iload_1         
	//   13   25:ineg            
	//   14   26:i2f             
	//   15   27:invokevirtual   #617 <Method void ActionBarContainer.setTranslationY(float)>
	//   16   30:return          
	}

	public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionbarvisibilitycallback)
	{
		mActionBarVisibilityCallback = actionbarvisibilitycallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
		if(getWindowToken() != null)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #623 <Method android.os.IBinder getWindowToken()>
	//*   5    9:ifnull          44
		{
			mActionBarVisibilityCallback.onWindowVisibilityChanged(mWindowVisibility);
	//    6   12:aload_0         
	//    7   13:getfield        #547 <Field ActionBarOverlayLayout$ActionBarVisibilityCallback mActionBarVisibilityCallback>
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field int mWindowVisibility>
	//   10   20:invokeinterface #583 <Method void ActionBarOverlayLayout$ActionBarVisibilityCallback.onWindowVisibilityChanged(int)>
			if(mLastSystemUiVisibility != 0)
	//*  11   25:aload_0         
	//*  12   26:getfield        #570 <Field int mLastSystemUiVisibility>
	//*  13   29:ifeq            44
			{
				onWindowSystemUiVisibilityChanged(mLastSystemUiVisibility);
	//   14   32:aload_0         
	//   15   33:aload_0         
	//   16   34:getfield        #570 <Field int mLastSystemUiVisibility>
	//   17   37:invokevirtual   #624 <Method void onWindowSystemUiVisibilityChanged(int)>
				ViewCompat.requestApplyInsets(((View) (this)));
	//   18   40:aload_0         
	//   19   41:invokestatic    #436 <Method void ViewCompat.requestApplyInsets(View)>
			}
		}
	//   20   44:return          
	}

	public void setHasNonEmbeddedTabs(boolean flag)
	{
		mHasNonEmbeddedTabs = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #491 <Field boolean mHasNonEmbeddedTabs>
	//    3    5:return          
	}

	public void setHideOnContentScrollEnabled(boolean flag)
	{
		if(flag != mHideOnContentScroll)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #419 <Field boolean mHideOnContentScroll>
	//*   3    5:icmpeq          26
		{
			mHideOnContentScroll = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #419 <Field boolean mHideOnContentScroll>
			if(!flag)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				haltActionBarHideOffsetAnimations();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #132 <Method void haltActionBarHideOffsetAnimations()>
				setActionBarHideOffset(0);
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #539 <Method void setActionBarHideOffset(int)>
			}
		}
	//   14   26:return          
	}

	public void setIcon(int i)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.setIcon(i);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:iload_1         
	//    5    9:invokeinterface #629 <Method void DecorToolbar.setIcon(int)>
	//    6   14:return          
	}

	public void setIcon(Drawable drawable)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.setIcon(drawable);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #632 <Method void DecorToolbar.setIcon(Drawable)>
	//    6   14:return          
	}

	public void setLogo(int i)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.setLogo(i);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:iload_1         
	//    5    9:invokeinterface #635 <Method void DecorToolbar.setLogo(int)>
	//    6   14:return          
	}

	public void setMenu(Menu menu, android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.setMenu(menu, callback);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #639 <Method void DecorToolbar.setMenu(Menu, android.support.v7.view.menu.MenuPresenter$Callback)>
	//    7   15:return          
	}

	public void setMenuPrepared()
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.setMenuPrepared();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #642 <Method void DecorToolbar.setMenuPrepared()>
	//    5   13:return          
	}

	public void setOverlayMode(boolean flag)
	{
		mOverlayMode = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #422 <Field boolean mOverlayMode>
		if(flag && getContext().getApplicationInfo().targetSdkVersion < 19)
	//*   3    5:iload_1         
	//*   4    6:ifeq            29
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #212 <Method Context getContext()>
	//*   7   13:invokevirtual   #249 <Method ApplicationInfo Context.getApplicationInfo()>
	//*   8   16:getfield        #254 <Field int ApplicationInfo.targetSdkVersion>
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
	//   18   33:putfield        #256 <Field boolean mIgnoreWindowContentOverlay>
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
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.setWindowCallback(callback);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #648 <Method void DecorToolbar.setWindowCallback(android.view.Window$Callback)>
	//    6   14:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		pullChildren();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		mDecorToolbar.setWindowTitle(charsequence);
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:aload_1         
	//    5    9:invokeinterface #652 <Method void DecorToolbar.setWindowTitle(CharSequence)>
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
	//    1    1:invokevirtual   #295 <Method void pullChildren()>
		return mDecorToolbar.showOverflowMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #297 <Field DecorToolbar mDecorToolbar>
	//    4    8:invokeinterface #656 <Method boolean DecorToolbar.showOverflowMenu()>
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
	//    4    5:getstatic       #77  <Field int android.support.v7.appcompat.R$attr.actionBarSize>
	//    5    8:iastore         
	//    6    9:dup             
	//    7   10:iconst_1        
	//    8   11:ldc1            #78  <Int 0x1010059>
	//    9   13:iastore         
	//   10   14:putstatic       #80  <Field int[] ATTRS>
	//*  11   17:return          
	}
}
