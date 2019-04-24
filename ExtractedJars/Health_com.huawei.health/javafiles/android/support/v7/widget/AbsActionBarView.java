// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.*;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter, ActionMenuView

abstract class AbsActionBarView extends ViewGroup
{
	protected class VisibilityAnimListener
		implements ViewPropertyAnimatorListener
	{

		public void onAnimationCancel(View view)
		{
			mCanceled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #24  <Field boolean mCanceled>
		//    3    5:return          
		}

		public void onAnimationEnd(View view)
		{
			if(mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #24  <Field boolean mCanceled>
		//*   2    4:ifeq            8
			{
				return;
		//    3    7:return          
			} else
			{
				mVisibilityAnim = null;
		//    4    8:aload_0         
		//    5    9:getfield        #19  <Field AbsActionBarView this$0>
		//    6   12:aconst_null     
		//    7   13:putfield        #32  <Field ViewPropertyAnimatorCompat AbsActionBarView.mVisibilityAnim>
				setVisibility(mFinalVisibility);
		//    8   16:aload_0         
		//    9   17:getfield        #19  <Field AbsActionBarView this$0>
		//   10   20:aload_0         
		//   11   21:getfield        #34  <Field int mFinalVisibility>
		//   12   24:invokestatic    #38  <Method void AbsActionBarView.access$101(AbsActionBarView, int)>
				return;
		//   13   27:return          
			}
		}

		public void onAnimationStart(View view)
		{
			setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field AbsActionBarView this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #42  <Method void AbsActionBarView.access$001(AbsActionBarView, int)>
			mCanceled = false;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #24  <Field boolean mCanceled>
		//    7   13:return          
		}

		public VisibilityAnimListener withFinalVisibility(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, int i)
		{
			mVisibilityAnim = viewpropertyanimatorcompat;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field AbsActionBarView this$0>
		//    2    4:aload_1         
		//    3    5:putfield        #32  <Field ViewPropertyAnimatorCompat AbsActionBarView.mVisibilityAnim>
			mFinalVisibility = i;
		//    4    8:aload_0         
		//    5    9:iload_2         
		//    6   10:putfield        #34  <Field int mFinalVisibility>
			return this;
		//    7   13:aload_0         
		//    8   14:areturn         
		}

		private boolean mCanceled;
		int mFinalVisibility;
		final AbsActionBarView this$0;

		protected VisibilityAnimListener()
		{
			this$0 = AbsActionBarView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field AbsActionBarView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			mCanceled = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #24  <Field boolean mCanceled>
		//    8   14:return          
		}
	}


	AbsActionBarView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #31  <Method void AbsActionBarView(Context, AttributeSet)>
	//    4    6:return          
	}

	AbsActionBarView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #35  <Method void AbsActionBarView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	AbsActionBarView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #36  <Method void ViewGroup(Context, AttributeSet, int)>
		mVisAnimListener = new VisibilityAnimListener();
	//    5    7:aload_0         
	//    6    8:new             #8   <Class AbsActionBarView$VisibilityAnimListener>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #39  <Method void AbsActionBarView$VisibilityAnimListener(AbsActionBarView)>
	//   10   16:putfield        #41  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
		attributeset = ((AttributeSet) (new TypedValue()));
	//   11   19:new             #43  <Class TypedValue>
	//   12   22:dup             
	//   13   23:invokespecial   #46  <Method void TypedValue()>
	//   14   26:astore_2        
		if(context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, ((TypedValue) (attributeset)), true) && ((TypedValue) (attributeset)).resourceId != 0)
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #52  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  17   31:getstatic       #57  <Field int android.support.v7.appcompat.R$attr.actionBarPopupTheme>
	//*  18   34:aload_2         
	//*  19   35:iconst_1        
	//*  20   36:invokevirtual   #63  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  21   39:ifeq            66
	//*  22   42:aload_2         
	//*  23   43:getfield        #66  <Field int TypedValue.resourceId>
	//*  24   46:ifeq            66
		{
			mPopupContext = ((Context) (new ContextThemeWrapper(context, ((TypedValue) (attributeset)).resourceId)));
	//   25   49:aload_0         
	//   26   50:new             #68  <Class ContextThemeWrapper>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:aload_2         
	//   30   56:getfield        #66  <Field int TypedValue.resourceId>
	//   31   59:invokespecial   #71  <Method void ContextThemeWrapper(Context, int)>
	//   32   62:putfield        #73  <Field Context mPopupContext>
			return;
	//   33   65:return          
		} else
		{
			mPopupContext = context;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:putfield        #73  <Field Context mPopupContext>
			return;
	//   37   71:return          
		}
	}

	protected static int next(int i, int j, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            8
			return i - j;
	//    2    4:iload_0         
	//    3    5:iload_1         
	//    4    6:isub            
	//    5    7:ireturn         
		else
			return i + j;
	//    6    8:iload_0         
	//    7    9:iload_1         
	//    8   10:iadd            
	//    9   11:ireturn         
	}

	public void animateToVisibility(int i)
	{
		setupAnimatorToVisibility(i, 200L).start();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2w           #84  <Long 200L>
	//    3    5:invokevirtual   #89  <Method ViewPropertyAnimatorCompat setupAnimatorToVisibility(int, long)>
	//    4    8:invokevirtual   #94  <Method void ViewPropertyAnimatorCompat.start()>
	//    5   11:return          
	}

	public boolean canShowOverflowMenu()
	{
		return isOverflowReserved() && getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #99  <Method boolean isOverflowReserved()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #103 <Method int getVisibility()>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void dismissPopupMenus()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			mActionMenuPresenter.dismissPopupMenus();
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #110 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
	//    6   14:pop             
	//    7   15:return          
	}

	public int getAnimatedVisibility()
	{
		if(mVisibilityAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field ViewPropertyAnimatorCompat mVisibilityAnim>
	//*   2    4:ifnull          15
			return mVisAnimListener.mFinalVisibility;
	//    3    7:aload_0         
	//    4    8:getfield        #41  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
	//    5   11:getfield        #116 <Field int AbsActionBarView$VisibilityAnimListener.mFinalVisibility>
	//    6   14:ireturn         
		else
			return getVisibility();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #103 <Method int getVisibility()>
	//    9   19:ireturn         
	}

	public int getContentHeight()
	{
		return mContentHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field int mContentHeight>
	//    2    4:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.hideOverflowMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #122 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isOverflowMenuShowPending()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.isOverflowMenuShowPending();
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #125 <Method boolean ActionMenuPresenter.isOverflowMenuShowPending()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.isOverflowMenuShowing();
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #128 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isOverflowReserved()
	{
		return mActionMenuPresenter != null && mActionMenuPresenter.isOverflowReserved();
	//    0    0:aload_0         
	//    1    1:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #129 <Method boolean ActionMenuPresenter.isOverflowReserved()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected int measureChildView(View view, int i, int j, int k)
	{
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:ldc1            #132 <Int 0x80000000>
	//    3    4:invokestatic    #138 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    7:iload_3         
	//    5    8:invokevirtual   #144 <Method void View.measure(int, int)>
		return Math.max(0, i - view.getMeasuredWidth() - k);
	//    6   11:iconst_0        
	//    7   12:iload_2         
	//    8   13:aload_1         
	//    9   14:invokevirtual   #147 <Method int View.getMeasuredWidth()>
	//   10   17:isub            
	//   11   18:iload           4
	//   12   20:isub            
	//   13   21:invokestatic    #152 <Method int Math.max(int, int)>
	//   14   24:ireturn         
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method void ViewGroup.onConfigurationChanged(Configuration)>
		TypedArray typedarray = getContext().obtainStyledAttributes(((AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #160 <Method Context getContext()>
	//    5    9:aconst_null     
	//    6   10:getstatic       #166 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//    7   13:getstatic       #169 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #173 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   20:astore_2        
		setContentHeight(typedarray.getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0));
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:getstatic       #176 <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #181 <Method int TypedArray.getLayoutDimension(int, int)>
	//   16   30:invokevirtual   #184 <Method void setContentHeight(int)>
		typedarray.recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #187 <Method void TypedArray.recycle()>
		if(mActionMenuPresenter != null)
	//*  19   37:aload_0         
	//*  20   38:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//*  21   41:ifnull          52
			mActionMenuPresenter.onConfigurationChanged(configuration);
	//   22   44:aload_0         
	//   23   45:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #188 <Method void ActionMenuPresenter.onConfigurationChanged(Configuration)>
	//   26   52:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #195 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 9)
	//*   3    5:iload_2         
	//*   4    6:bipush          9
	//*   5    8:icmpne          16
			mEatingHover = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #197 <Field boolean mEatingHover>
		if(!mEatingHover)
	//*   9   16:aload_0         
	//*  10   17:getfield        #197 <Field boolean mEatingHover>
	//*  11   20:ifne            44
		{
			boolean flag = super.onHoverEvent(motionevent);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #199 <Method boolean ViewGroup.onHoverEvent(MotionEvent)>
	//   15   28:istore_3        
			if(i == 9 && !flag)
	//*  16   29:iload_2         
	//*  17   30:bipush          9
	//*  18   32:icmpne          44
	//*  19   35:iload_3         
	//*  20   36:ifne            44
				mEatingHover = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #197 <Field boolean mEatingHover>
		}
		if(i == 10 || i == 3)
	//*  24   44:iload_2         
	//*  25   45:bipush          10
	//*  26   47:icmpeq          55
	//*  27   50:iload_2         
	//*  28   51:iconst_3        
	//*  29   52:icmpne          60
			mEatingHover = false;
	//   30   55:aload_0         
	//   31   56:iconst_0        
	//   32   57:putfield        #197 <Field boolean mEatingHover>
		return true;
	//   33   60:iconst_1        
	//   34   61:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #195 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			mEatingTouch = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #202 <Field boolean mEatingTouch>
		if(!mEatingTouch)
	//*   8   14:aload_0         
	//*   9   15:getfield        #202 <Field boolean mEatingTouch>
	//*  10   18:ifne            40
		{
			boolean flag = super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #204 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   14   26:istore_3        
			if(i == 0 && !flag)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
	//*  17   31:iload_3         
	//*  18   32:ifne            40
				mEatingTouch = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #202 <Field boolean mEatingTouch>
		}
		if(i == 1 || i == 3)
	//*  22   40:iload_2         
	//*  23   41:iconst_1        
	//*  24   42:icmpeq          50
	//*  25   45:iload_2         
	//*  26   46:iconst_3        
	//*  27   47:icmpne          55
			mEatingTouch = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #202 <Field boolean mEatingTouch>
		return true;
	//   31   55:iconst_1        
	//   32   56:ireturn         
	}

	protected int positionChild(View view, int i, int j, int k, boolean flag)
	{
		int l = view.getMeasuredWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #147 <Method int View.getMeasuredWidth()>
	//    2    4:istore          6
		int i1 = view.getMeasuredHeight();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #209 <Method int View.getMeasuredHeight()>
	//    5   10:istore          7
		j += (k - i1) / 2;
	//    6   12:iload_3         
	//    7   13:iload           4
	//    8   15:iload           7
	//    9   17:isub            
	//   10   18:iconst_2        
	//   11   19:idiv            
	//   12   20:iadd            
	//   13   21:istore_3        
		if(flag)
	//*  14   22:iload           5
	//*  15   24:ifeq            44
			view.layout(i - l, j, i, j + i1);
	//   16   27:aload_1         
	//   17   28:iload_2         
	//   18   29:iload           6
	//   19   31:isub            
	//   20   32:iload_3         
	//   21   33:iload_2         
	//   22   34:iload_3         
	//   23   35:iload           7
	//   24   37:iadd            
	//   25   38:invokevirtual   #213 <Method void View.layout(int, int, int, int)>
		else
	//*  26   41:goto            58
			view.layout(i, j, i + l, j + i1);
	//   27   44:aload_1         
	//   28   45:iload_2         
	//   29   46:iload_3         
	//   30   47:iload_2         
	//   31   48:iload           6
	//   32   50:iadd            
	//   33   51:iload_3         
	//   34   52:iload           7
	//   35   54:iadd            
	//   36   55:invokevirtual   #213 <Method void View.layout(int, int, int, int)>
		if(flag)
	//*  37   58:iload           5
	//*  38   60:ifeq            67
			return -l;
	//   39   63:iload           6
	//   40   65:ineg            
	//   41   66:ireturn         
		else
			return l;
	//   42   67:iload           6
	//   43   69:ireturn         
	}

	public void postShowOverflowMenu()
	{
		post(new Runnable() {

			public void run()
			{
				showOverflowMenu();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AbsActionBarView this$0>
			//    2    4:invokevirtual   #25  <Method boolean AbsActionBarView.showOverflowMenu()>
			//    3    7:pop             
			//    4    8:return          
			}

			final AbsActionBarView this$0;

			
			{
				this$0 = AbsActionBarView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AbsActionBarView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #6   <Class AbsActionBarView$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #215 <Method void AbsActionBarView$1(AbsActionBarView)>
	//    5    9:invokevirtual   #219 <Method boolean post(Runnable)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setContentHeight(int i)
	{
		mContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #119 <Field int mContentHeight>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #222 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setVisibility(int i)
	{
		if(i != getVisibility())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #103 <Method int getVisibility()>
	//*   3    5:icmpeq          27
		{
			if(mVisibilityAnim != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #113 <Field ViewPropertyAnimatorCompat mVisibilityAnim>
	//*   6   12:ifnull          22
				mVisibilityAnim.cancel();
	//    7   15:aload_0         
	//    8   16:getfield        #113 <Field ViewPropertyAnimatorCompat mVisibilityAnim>
	//    9   19:invokevirtual   #225 <Method void ViewPropertyAnimatorCompat.cancel()>
			super.setVisibility(i);
	//   10   22:aload_0         
	//   11   23:iload_1         
	//   12   24:invokespecial   #79  <Method void ViewGroup.setVisibility(int)>
		}
	//   13   27:return          
	}

	public ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long l)
	{
		if(mVisibilityAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field ViewPropertyAnimatorCompat mVisibilityAnim>
	//*   2    4:ifnull          14
			mVisibilityAnim.cancel();
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field ViewPropertyAnimatorCompat mVisibilityAnim>
	//    5   11:invokevirtual   #225 <Method void ViewPropertyAnimatorCompat.cancel()>
		if(i == 0)
	//*   6   14:iload_1         
	//*   7   15:ifne            66
		{
			if(getVisibility() != 0)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #103 <Method int getVisibility()>
	//*  10   22:ifeq            30
				setAlpha(0.0F);
	//   11   25:aload_0         
	//   12   26:fconst_0        
	//   13   27:invokevirtual   #229 <Method void setAlpha(float)>
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (this))).alpha(1.0F);
	//   14   30:aload_0         
	//   15   31:invokestatic    #235 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   16   34:fconst_1        
	//   17   35:invokevirtual   #239 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//   18   38:astore          4
			viewpropertyanimatorcompat.setDuration(l);
	//   19   40:aload           4
	//   20   42:lload_2         
	//   21   43:invokevirtual   #243 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setDuration(long)>
	//   22   46:pop             
			viewpropertyanimatorcompat.setListener(((ViewPropertyAnimatorListener) (mVisAnimListener.withFinalVisibility(viewpropertyanimatorcompat, i))));
	//   23   47:aload           4
	//   24   49:aload_0         
	//   25   50:getfield        #41  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
	//   26   53:aload           4
	//   27   55:iload_1         
	//   28   56:invokevirtual   #247 <Method AbsActionBarView$VisibilityAnimListener AbsActionBarView$VisibilityAnimListener.withFinalVisibility(ViewPropertyAnimatorCompat, int)>
	//   29   59:invokevirtual   #251 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(ViewPropertyAnimatorListener)>
	//   30   62:pop             
			return viewpropertyanimatorcompat;
	//   31   63:aload           4
	//   32   65:areturn         
		} else
		{
			ViewPropertyAnimatorCompat viewpropertyanimatorcompat1 = ViewCompat.animate(((View) (this))).alpha(0.0F);
	//   33   66:aload_0         
	//   34   67:invokestatic    #235 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//   35   70:fconst_0        
	//   36   71:invokevirtual   #239 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//   37   74:astore          4
			viewpropertyanimatorcompat1.setDuration(l);
	//   38   76:aload           4
	//   39   78:lload_2         
	//   40   79:invokevirtual   #243 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setDuration(long)>
	//   41   82:pop             
			viewpropertyanimatorcompat1.setListener(((ViewPropertyAnimatorListener) (mVisAnimListener.withFinalVisibility(viewpropertyanimatorcompat1, i))));
	//   42   83:aload           4
	//   43   85:aload_0         
	//   44   86:getfield        #41  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
	//   45   89:aload           4
	//   46   91:iload_1         
	//   47   92:invokevirtual   #247 <Method AbsActionBarView$VisibilityAnimListener AbsActionBarView$VisibilityAnimListener.withFinalVisibility(ViewPropertyAnimatorCompat, int)>
	//   48   95:invokevirtual   #251 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(ViewPropertyAnimatorListener)>
	//   49   98:pop             
			return viewpropertyanimatorcompat1;
	//   50   99:aload           4
	//   51  101:areturn         
		}
	}

	public boolean showOverflowMenu()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.showOverflowMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #106 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #254 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private static final int FADE_DURATION = 200;
	protected ActionMenuPresenter mActionMenuPresenter;
	protected int mContentHeight;
	private boolean mEatingHover;
	private boolean mEatingTouch;
	protected ActionMenuView mMenuView;
	protected final Context mPopupContext;
	protected final VisibilityAnimListener mVisAnimListener;
	protected ViewPropertyAnimatorCompat mVisibilityAnim;


/*
	static void access$001(AbsActionBarView absactionbarview, int i)
	{
		((ViewGroup) (absactionbarview)).ViewGroup.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #79  <Method void ViewGroup.setVisibility(int)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$101(AbsActionBarView absactionbarview, int i)
	{
		((ViewGroup) (absactionbarview)).ViewGroup.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #79  <Method void ViewGroup.setVisibility(int)>
		return;
	//    3    5:return          
	}

*/
}
