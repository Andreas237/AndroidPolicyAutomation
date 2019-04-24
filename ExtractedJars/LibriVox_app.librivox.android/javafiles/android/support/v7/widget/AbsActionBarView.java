// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.ac;
import android.support.v4.view.au;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;

// Referenced classes of package android.support.v7.widget:
//			ActionMenuPresenter, ActionMenuView

abstract class AbsActionBarView extends ViewGroup
{

	AbsActionBarView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #26  <Method void AbsActionBarView(Context, AttributeSet)>
	//    4    6:return          
	}

	AbsActionBarView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #30  <Method void AbsActionBarView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	AbsActionBarView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #31  <Method void ViewGroup(Context, AttributeSet, int)>
		mVisAnimListener = new VisibilityAnimListener();
	//    5    7:aload_0         
	//    6    8:new             #33  <Class AbsActionBarView$VisibilityAnimListener>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #36  <Method void AbsActionBarView$VisibilityAnimListener(AbsActionBarView)>
	//   10   16:putfield        #38  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
		attributeset = ((AttributeSet) (new TypedValue()));
	//   11   19:new             #40  <Class TypedValue>
	//   12   22:dup             
	//   13   23:invokespecial   #43  <Method void TypedValue()>
	//   14   26:astore_2        
		if(context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.actionBarPopupTheme, ((TypedValue) (attributeset)), true) && ((TypedValue) (attributeset)).resourceId != 0)
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #49  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  17   31:getstatic       #54  <Field int android.support.v7.appcompat.R$attr.actionBarPopupTheme>
	//*  18   34:aload_2         
	//*  19   35:iconst_1        
	//*  20   36:invokevirtual   #60  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  21   39:ifeq            66
	//*  22   42:aload_2         
	//*  23   43:getfield        #63  <Field int TypedValue.resourceId>
	//*  24   46:ifeq            66
		{
			mPopupContext = ((Context) (new ContextThemeWrapper(context, ((TypedValue) (attributeset)).resourceId)));
	//   25   49:aload_0         
	//   26   50:new             #65  <Class ContextThemeWrapper>
	//   27   53:dup             
	//   28   54:aload_1         
	//   29   55:aload_2         
	//   30   56:getfield        #63  <Field int TypedValue.resourceId>
	//   31   59:invokespecial   #68  <Method void ContextThemeWrapper(Context, int)>
	//   32   62:putfield        #70  <Field Context mPopupContext>
			return;
	//   33   65:return          
		} else
		{
			mPopupContext = context;
	//   34   66:aload_0         
	//   35   67:aload_1         
	//   36   68:putfield        #70  <Field Context mPopupContext>
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
		setupAnimatorToVisibility(i, 200L).c();
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2w           #81  <Long 200L>
	//    3    5:invokevirtual   #86  <Method au setupAnimatorToVisibility(int, long)>
	//    4    8:invokevirtual   #91  <Method void au.c()>
	//    5   11:return          
	}

	public boolean canShowOverflowMenu()
	{
		return isOverflowReserved() && getVisibility() == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #96  <Method boolean isOverflowReserved()>
	//    2    4:ifeq            16
	//    3    7:aload_0         
	//    4    8:invokevirtual   #100 <Method int getVisibility()>
	//    5   11:ifne            16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public void dismissPopupMenus()
	{
		ActionMenuPresenter actionmenupresenter = mActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ActionMenuPresenter mActionMenuPresenter>
	//    2    4:astore_1        
		if(actionmenupresenter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			actionmenupresenter.dismissPopupMenus();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #107 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
	//    7   13:pop             
	//    8   14:return          
	}

	public int getAnimatedVisibility()
	{
		if(mVisibilityAnim != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field au mVisibilityAnim>
	//*   2    4:ifnull          15
			return mVisAnimListener.mFinalVisibility;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
	//    5   11:getfield        #113 <Field int AbsActionBarView$VisibilityAnimListener.mFinalVisibility>
	//    6   14:ireturn         
		else
			return getVisibility();
	//    7   15:aload_0         
	//    8   16:invokevirtual   #100 <Method int getVisibility()>
	//    9   19:ireturn         
	}

	public int getContentHeight()
	{
		return mContentHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field int mContentHeight>
	//    2    4:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		ActionMenuPresenter actionmenupresenter = mActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ActionMenuPresenter mActionMenuPresenter>
	//    2    4:astore_1        
		if(actionmenupresenter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return actionmenupresenter.hideOverflowMenu();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #119 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean isOverflowMenuShowPending()
	{
		ActionMenuPresenter actionmenupresenter = mActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ActionMenuPresenter mActionMenuPresenter>
	//    2    4:astore_1        
		if(actionmenupresenter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return actionmenupresenter.isOverflowMenuShowPending();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #122 <Method boolean ActionMenuPresenter.isOverflowMenuShowPending()>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		ActionMenuPresenter actionmenupresenter = mActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ActionMenuPresenter mActionMenuPresenter>
	//    2    4:astore_1        
		if(actionmenupresenter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return actionmenupresenter.isOverflowMenuShowing();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #125 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean isOverflowReserved()
	{
		ActionMenuPresenter actionmenupresenter = mActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ActionMenuPresenter mActionMenuPresenter>
	//    2    4:astore_1        
		return actionmenupresenter != null && actionmenupresenter.isOverflowReserved();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #126 <Method boolean ActionMenuPresenter.isOverflowReserved()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	protected int measureChildView(View view, int i, int j, int k)
	{
		view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:ldc1            #129 <Int 0x80000000>
	//    3    4:invokestatic    #135 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//    4    7:iload_3         
	//    5    8:invokevirtual   #141 <Method void View.measure(int, int)>
		return Math.max(0, i - view.getMeasuredWidth() - k);
	//    6   11:iconst_0        
	//    7   12:iload_2         
	//    8   13:aload_1         
	//    9   14:invokevirtual   #144 <Method int View.getMeasuredWidth()>
	//   10   17:isub            
	//   11   18:iload           4
	//   12   20:isub            
	//   13   21:invokestatic    #149 <Method int Math.max(int, int)>
	//   14   24:ireturn         
	}

	protected void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #153 <Method void ViewGroup.onConfigurationChanged(Configuration)>
		Object obj = ((Object) (getContext().obtainStyledAttributes(((AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #157 <Method Context getContext()>
	//    5    9:aconst_null     
	//    6   10:getstatic       #163 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//    7   13:getstatic       #166 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #170 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   10   20:astore_2        
		setContentHeight(((TypedArray) (obj)).getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0));
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:getstatic       #173 <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//   14   26:iconst_0        
	//   15   27:invokevirtual   #178 <Method int TypedArray.getLayoutDimension(int, int)>
	//   16   30:invokevirtual   #181 <Method void setContentHeight(int)>
		((TypedArray) (obj)).recycle();
	//   17   33:aload_2         
	//   18   34:invokevirtual   #184 <Method void TypedArray.recycle()>
		obj = ((Object) (mActionMenuPresenter));
	//   19   37:aload_0         
	//   20   38:getfield        #103 <Field ActionMenuPresenter mActionMenuPresenter>
	//   21   41:astore_2        
		if(obj != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          51
			((ActionMenuPresenter) (obj)).onConfigurationChanged(configuration);
	//   24   46:aload_2         
	//   25   47:aload_1         
	//   26   48:invokevirtual   #185 <Method void ActionMenuPresenter.onConfigurationChanged(Configuration)>
	//   27   51:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #192 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 9)
	//*   3    5:iload_2         
	//*   4    6:bipush          9
	//*   5    8:icmpne          16
			mEatingHover = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #194 <Field boolean mEatingHover>
		if(!mEatingHover)
	//*   9   16:aload_0         
	//*  10   17:getfield        #194 <Field boolean mEatingHover>
	//*  11   20:ifne            44
		{
			boolean flag = super.onHoverEvent(motionevent);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #196 <Method boolean ViewGroup.onHoverEvent(MotionEvent)>
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
	//   23   41:putfield        #194 <Field boolean mEatingHover>
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
	//   32   57:putfield        #194 <Field boolean mEatingHover>
		return true;
	//   33   60:iconst_1        
	//   34   61:ireturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #192 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			mEatingTouch = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #199 <Field boolean mEatingTouch>
		if(!mEatingTouch)
	//*   8   14:aload_0         
	//*   9   15:getfield        #199 <Field boolean mEatingTouch>
	//*  10   18:ifne            40
		{
			boolean flag = super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #201 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   14   26:istore_3        
			if(i == 0 && !flag)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
	//*  17   31:iload_3         
	//*  18   32:ifne            40
				mEatingTouch = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #199 <Field boolean mEatingTouch>
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
	//   30   52:putfield        #199 <Field boolean mEatingTouch>
		return true;
	//   31   55:iconst_1        
	//   32   56:ireturn         
	}

	protected int positionChild(View view, int i, int j, int k, boolean flag)
	{
		int l = view.getMeasuredWidth();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #144 <Method int View.getMeasuredWidth()>
	//    2    4:istore          6
		int i1 = view.getMeasuredHeight();
	//    3    6:aload_1         
	//    4    7:invokevirtual   #206 <Method int View.getMeasuredHeight()>
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
			view.layout(i - l, j, i, i1 + j);
	//   16   27:aload_1         
	//   17   28:iload_2         
	//   18   29:iload           6
	//   19   31:isub            
	//   20   32:iload_3         
	//   21   33:iload_2         
	//   22   34:iload           7
	//   23   36:iload_3         
	//   24   37:iadd            
	//   25   38:invokevirtual   #210 <Method void View.layout(int, int, int, int)>
		else
	//*  26   41:goto            58
			view.layout(i, j, i + l, i1 + j);
	//   27   44:aload_1         
	//   28   45:iload_2         
	//   29   46:iload_3         
	//   30   47:iload_2         
	//   31   48:iload           6
	//   32   50:iadd            
	//   33   51:iload           7
	//   34   53:iload_3         
	//   35   54:iadd            
	//   36   55:invokevirtual   #210 <Method void View.layout(int, int, int, int)>
		i = l;
	//   37   58:iload           6
	//   38   60:istore_2        
		if(flag)
	//*  39   61:iload           5
	//*  40   63:ifeq            70
			i = -l;
	//   41   66:iload           6
	//   42   68:ineg            
	//   43   69:istore_2        
		return i;
	//   44   70:iload_2         
	//   45   71:ireturn         
	}

	public void postShowOverflowMenu()
	{
		post(((Runnable) (new _cls1())));
	//    0    0:aload_0         
	//    1    1:new             #213 <Class AbsActionBarView$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #214 <Method void AbsActionBarView$1(AbsActionBarView)>
	//    5    9:invokevirtual   #218 <Method boolean post(Runnable)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void setContentHeight(int i)
	{
		mContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #116 <Field int mContentHeight>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #221 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setVisibility(int i)
	{
		if(i != getVisibility())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #100 <Method int getVisibility()>
	//*   3    5:icmpeq          26
		{
			au au1 = mVisibilityAnim;
	//    4    8:aload_0         
	//    5    9:getfield        #110 <Field au mVisibilityAnim>
	//    6   12:astore_2        
			if(au1 != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          21
				au1.b();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #224 <Method void au.b()>
			super.setVisibility(i);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:invokespecial   #76  <Method void ViewGroup.setVisibility(int)>
		}
	//   14   26:return          
	}

	public au setupAnimatorToVisibility(int i, long l)
	{
		au au1 = mVisibilityAnim;
	//    0    0:aload_0         
	//    1    1:getfield        #110 <Field au mVisibilityAnim>
	//    2    4:astore          4
		if(au1 != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          16
			au1.b();
	//    5   11:aload           4
	//    6   13:invokevirtual   #224 <Method void au.b()>
		if(i == 0)
	//*   7   16:iload_1         
	//*   8   17:ifne            68
		{
			if(getVisibility() != 0)
	//*   9   20:aload_0         
	//*  10   21:invokevirtual   #100 <Method int getVisibility()>
	//*  11   24:ifeq            32
				setAlpha(0.0F);
	//   12   27:aload_0         
	//   13   28:fconst_0        
	//   14   29:invokevirtual   #228 <Method void setAlpha(float)>
			au au2 = ac.l(((View) (this))).a(1.0F);
	//   15   32:aload_0         
	//   16   33:invokestatic    #234 <Method au ac.l(View)>
	//   17   36:fconst_1        
	//   18   37:invokevirtual   #238 <Method au au.a(float)>
	//   19   40:astore          4
			au2.a(l);
	//   20   42:aload           4
	//   21   44:lload_2         
	//   22   45:invokevirtual   #241 <Method au au.a(long)>
	//   23   48:pop             
			au2.a(((ay) (mVisAnimListener.withFinalVisibility(au2, i))));
	//   24   49:aload           4
	//   25   51:aload_0         
	//   26   52:getfield        #38  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
	//   27   55:aload           4
	//   28   57:iload_1         
	//   29   58:invokevirtual   #245 <Method AbsActionBarView$VisibilityAnimListener AbsActionBarView$VisibilityAnimListener.withFinalVisibility(au, int)>
	//   30   61:invokevirtual   #248 <Method au au.a(ay)>
	//   31   64:pop             
			return au2;
	//   32   65:aload           4
	//   33   67:areturn         
		} else
		{
			au au3 = ac.l(((View) (this))).a(0.0F);
	//   34   68:aload_0         
	//   35   69:invokestatic    #234 <Method au ac.l(View)>
	//   36   72:fconst_0        
	//   37   73:invokevirtual   #238 <Method au au.a(float)>
	//   38   76:astore          4
			au3.a(l);
	//   39   78:aload           4
	//   40   80:lload_2         
	//   41   81:invokevirtual   #241 <Method au au.a(long)>
	//   42   84:pop             
			au3.a(((ay) (mVisAnimListener.withFinalVisibility(au3, i))));
	//   43   85:aload           4
	//   44   87:aload_0         
	//   45   88:getfield        #38  <Field AbsActionBarView$VisibilityAnimListener mVisAnimListener>
	//   46   91:aload           4
	//   47   93:iload_1         
	//   48   94:invokevirtual   #245 <Method AbsActionBarView$VisibilityAnimListener AbsActionBarView$VisibilityAnimListener.withFinalVisibility(au, int)>
	//   49   97:invokevirtual   #248 <Method au au.a(ay)>
	//   50  100:pop             
			return au3;
	//   51  101:aload           4
	//   52  103:areturn         
		}
	}

	public boolean showOverflowMenu()
	{
		ActionMenuPresenter actionmenupresenter = mActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ActionMenuPresenter mActionMenuPresenter>
	//    2    4:astore_1        
		if(actionmenupresenter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return actionmenupresenter.showOverflowMenu();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #251 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//    7   13:ireturn         
		else
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	private static final int FADE_DURATION = 200;
	protected ActionMenuPresenter mActionMenuPresenter;
	protected int mContentHeight;
	private boolean mEatingHover;
	private boolean mEatingTouch;
	protected ActionMenuView mMenuView;
	protected final Context mPopupContext;
	protected final VisibilityAnimListener mVisAnimListener;
	protected au mVisibilityAnim;


/*
	static void access$001(AbsActionBarView absactionbarview, int i)
	{
		((ViewGroup) (absactionbarview)).ViewGroup.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #76  <Method void ViewGroup.setVisibility(int)>
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
	//    2    2:invokespecial   #76  <Method void ViewGroup.setVisibility(int)>
		return;
	//    3    5:return          
	}

*/

	private class VisibilityAnimListener
		implements ay
	{

		public void onAnimationCancel(View view)
		{
			mCanceled = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #21  <Field boolean mCanceled>
		//    3    5:return          
		}

		public void onAnimationEnd(View view)
		{
			if(mCanceled)
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field boolean mCanceled>
		//*   2    4:ifeq            8
			{
				return;
		//    3    7:return          
			} else
			{
				view = ((View) (AbsActionBarView.this));
		//    4    8:aload_0         
		//    5    9:getfield        #16  <Field AbsActionBarView this$0>
		//    6   12:astore_1        
				view.mVisibilityAnim = null;
		//    7   13:aload_1         
		//    8   14:aconst_null     
		//    9   15:putfield        #31  <Field au AbsActionBarView.mVisibilityAnim>
				((ViewGroup) (view)).setVisibility(mFinalVisibility);
		//   10   18:aload_1         
		//   11   19:aload_0         
		//   12   20:getfield        #33  <Field int mFinalVisibility>
		//   13   23:invokestatic    #37  <Method void AbsActionBarView.access$101(AbsActionBarView, int)>
				return;
		//   14   26:return          
			}
		}

		public void onAnimationStart(View view)
		{
			setVisibility(0);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field AbsActionBarView this$0>
		//    2    4:iconst_0        
		//    3    5:invokestatic    #41  <Method void AbsActionBarView.access$001(AbsActionBarView, int)>
			mCanceled = false;
		//    4    8:aload_0         
		//    5    9:iconst_0        
		//    6   10:putfield        #21  <Field boolean mCanceled>
		//    7   13:return          
		}

		public VisibilityAnimListener withFinalVisibility(au au1, int i)
		{
			mVisibilityAnim = au1;
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field AbsActionBarView this$0>
		//    2    4:aload_1         
		//    3    5:putfield        #31  <Field au AbsActionBarView.mVisibilityAnim>
			mFinalVisibility = i;
		//    4    8:aload_0         
		//    5    9:iload_2         
		//    6   10:putfield        #33  <Field int mFinalVisibility>
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
		//    2    2:putfield        #16  <Field AbsActionBarView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
			mCanceled = false;
		//    5    9:aload_0         
		//    6   10:iconst_0        
		//    7   11:putfield        #21  <Field boolean mCanceled>
		//    8   14:return          
		}
	}


	private class _cls1
		implements Runnable
	{

		public void run()
		{
			showOverflowMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field AbsActionBarView this$0>
		//    2    4:invokevirtual   #23  <Method boolean AbsActionBarView.showOverflowMenu()>
		//    3    7:pop             
		//    4    8:return          
		}

		final AbsActionBarView this$0;

		_cls1()
		{
			this$0 = AbsActionBarView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field AbsActionBarView this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}

}