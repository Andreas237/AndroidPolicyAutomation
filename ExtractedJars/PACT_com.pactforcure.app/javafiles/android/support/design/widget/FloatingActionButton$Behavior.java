// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			FloatingActionButton, BottomSheetBehavior, CoordinatorLayout, ViewGroupUtils, 
//			AppBarLayout

public static class FloatingActionButton$Behavior extends CoordinatorLayout.Behavior
{

	private static boolean isBottomSheet(View view)
	{
		view = ((View) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_0        
		if(view instanceof )
	//*   3    5:aload_0         
	//*   4    6:instanceof      #62  <Class CoordinatorLayout$LayoutParams>
	//*   5    9:ifeq            23
			return (()view).getBehavior() instanceof BottomSheetBehavior;
	//    6   12:aload_0         
	//    7   13:checkcast       #62  <Class CoordinatorLayout$LayoutParams>
	//    8   16:invokevirtual   #66  <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    9   19:instanceof      #68  <Class BottomSheetBehavior>
	//   10   22:ireturn         
		else
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	private void offsetIfNeeded(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton)
	{
		Rect rect = floatingactionbutton.mShadowPadding;
	//    0    0:aload_2         
	//    1    1:getfield        #74  <Field Rect FloatingActionButton.mShadowPadding>
	//    2    4:astore          5
		if(rect != null && rect.centerX() > 0 && rect.centerY() > 0)
	//*   3    6:aload           5
	//*   4    8:ifnull          108
	//*   5   11:aload           5
	//*   6   13:invokevirtual   #80  <Method int Rect.centerX()>
	//*   7   16:ifle            108
	//*   8   19:aload           5
	//*   9   21:invokevirtual   #83  <Method int Rect.centerY()>
	//*  10   24:ifle            108
		{
			  = ()floatingactionbutton.getLayoutParams();
	//   11   27:aload_2         
	//   12   28:invokevirtual   #84  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//   13   31:checkcast       #62  <Class CoordinatorLayout$LayoutParams>
	//   14   34:astore          6
			int j = 0;
	//   15   36:iconst_0        
	//   16   37:istore          4
			int i = 0;
	//   17   39:iconst_0        
	//   18   40:istore_3        
			if(floatingactionbutton.getRight() >= coordinatorlayout.getWidth() - .rightMargin)
	//*  19   41:aload_2         
	//*  20   42:invokevirtual   #87  <Method int FloatingActionButton.getRight()>
	//*  21   45:aload_1         
	//*  22   46:invokevirtual   #92  <Method int CoordinatorLayout.getWidth()>
	//*  23   49:aload           6
	//*  24   51:getfield        #95  <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//*  25   54:isub            
	//*  26   55:icmplt          109
				i = rect.right;
	//   27   58:aload           5
	//   28   60:getfield        #98  <Field int Rect.right>
	//   29   63:istore_3        
			else
	//*  30   64:aload_2         
	//*  31   65:invokevirtual   #101 <Method int FloatingActionButton.getBottom()>
	//*  32   68:aload_1         
	//*  33   69:invokevirtual   #104 <Method int CoordinatorLayout.getHeight()>
	//*  34   72:aload           6
	//*  35   74:getfield        #107 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//*  36   77:isub            
	//*  37   78:icmplt          131
	//*  38   81:aload           5
	//*  39   83:getfield        #110 <Field int Rect.bottom>
	//*  40   86:istore          4
	//*  41   88:iload           4
	//*  42   90:ifeq            99
	//*  43   93:aload_2         
	//*  44   94:iload           4
	//*  45   96:invokestatic    #116 <Method void ViewCompat.offsetTopAndBottom(View, int)>
	//*  46   99:iload_3         
	//*  47  100:ifeq            108
	//*  48  103:aload_2         
	//*  49  104:iload_3         
	//*  50  105:invokestatic    #119 <Method void ViewCompat.offsetLeftAndRight(View, int)>
	//*  51  108:return          
			if(floatingactionbutton.getLeft() <= .leftMargin)
	//*  52  109:aload_2         
	//*  53  110:invokevirtual   #122 <Method int FloatingActionButton.getLeft()>
	//*  54  113:aload           6
	//*  55  115:getfield        #125 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//*  56  118:icmpgt          64
				i = -rect.left;
	//   57  121:aload           5
	//   58  123:getfield        #128 <Field int Rect.left>
	//   59  126:ineg            
	//   60  127:istore_3        
			if(floatingactionbutton.getBottom() >= coordinatorlayout.getHeight() - .bottomMargin)
				j = rect.bottom;
			else
	//*  61  128:goto            64
			if(floatingactionbutton.getTop() <= .topMargin)
	//*  62  131:aload_2         
	//*  63  132:invokevirtual   #131 <Method int FloatingActionButton.getTop()>
	//*  64  135:aload           6
	//*  65  137:getfield        #134 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//*  66  140:icmpgt          88
				j = -rect.top;
	//   67  143:aload           5
	//   68  145:getfield        #137 <Field int Rect.top>
	//   69  148:ineg            
	//   70  149:istore          4
			if(j != 0)
				ViewCompat.offsetTopAndBottom(((View) (floatingactionbutton)), j);
			if(i != 0)
				ViewCompat.offsetLeftAndRight(((View) (floatingactionbutton)), i);
		}
	//*  71  151:goto            88
	}

	private boolean shouldUpdateVisibility(View view, FloatingActionButton floatingactionbutton)
	{
		for(  = ()floatingactionbutton.getLayoutParams(); !mAutoHideEnabled || .getAnchorId() != view.getId() || floatingactionbutton.getUserSetVisibility() != 0;)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #84  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//*   2    4:checkcast       #62  <Class CoordinatorLayout$LayoutParams>
	//*   3    7:astore_3        
	//*   4    8:aload_0         
	//*   5    9:getfield        #22  <Field boolean mAutoHideEnabled>
	//*   6   12:ifne            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         

	//    9   17:aload_3         
	//   10   18:invokevirtual   #142 <Method int CoordinatorLayout$LayoutParams.getAnchorId()>
	//   11   21:aload_1         
	//   12   22:invokevirtual   #145 <Method int View.getId()>
	//   13   25:icmpne          15
	//   14   28:aload_2         
	//   15   29:invokevirtual   #148 <Method int FloatingActionButton.getUserSetVisibility()>
	//   16   32:ifne            15
		return true;
	//   17   35:iconst_1        
	//   18   36:ireturn         
	}

	private boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout coordinatorlayout, AppBarLayout appbarlayout, FloatingActionButton floatingactionbutton)
	{
		if(!shouldUpdateVisibility(((View) (appbarlayout)), floatingactionbutton))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:aload_3         
	//*   3    3:invokespecial   #152 <Method boolean shouldUpdateVisibility(View, FloatingActionButton)>
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		if(mTmpRect == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #154 <Field Rect mTmpRect>
	//*   9   15:ifnonnull       29
			mTmpRect = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #76  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #155 <Method void Rect()>
	//   14   26:putfield        #154 <Field Rect mTmpRect>
		Rect rect = mTmpRect;
	//   15   29:aload_0         
	//   16   30:getfield        #154 <Field Rect mTmpRect>
	//   17   33:astore          4
		ViewGroupUtils.getDescendantRect(((android.view.ViewGroup) (coordinatorlayout)), ((View) (appbarlayout)), rect);
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:aload           4
	//   21   39:invokestatic    #161 <Method void ViewGroupUtils.getDescendantRect(android.view.ViewGroup, View, Rect)>
		if(rect.bottom <= appbarlayout.getMinimumHeightForVisibleOverlappingContent())
	//*  22   42:aload           4
	//*  23   44:getfield        #110 <Field int Rect.bottom>
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #166 <Method int AppBarLayout.getMinimumHeightForVisibleOverlappingContent()>
	//*  26   51:icmpgt          65
			floatingactionbutton.hide(mInternalAutoHideListener, false);
	//   27   54:aload_3         
	//   28   55:aload_0         
	//   29   56:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
	//   30   59:iconst_0        
	//   31   60:invokevirtual   #172 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		else
	//*  32   63:iconst_1        
	//*  33   64:ireturn         
			floatingactionbutton.show(mInternalAutoHideListener, false);
	//   34   65:aload_3         
	//   35   66:aload_0         
	//   36   67:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
	//   37   70:iconst_0        
	//   38   71:invokevirtual   #175 <Method void FloatingActionButton.show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		return true;
	//*  39   74:goto            63
	}

	private boolean updateFabVisibilityForBottomSheet(View view, FloatingActionButton floatingactionbutton)
	{
		if(!shouldUpdateVisibility(view, floatingactionbutton))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #152 <Method boolean shouldUpdateVisibility(View, FloatingActionButton)>
	//*   4    6:ifne            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		  = ()floatingactionbutton.getLayoutParams();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #84  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//    9   15:checkcast       #62  <Class CoordinatorLayout$LayoutParams>
	//   10   18:astore_3        
		if(view.getTop() < floatingactionbutton.getHeight() / 2 + .topMargin)
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #177 <Method int View.getTop()>
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #178 <Method int FloatingActionButton.getHeight()>
	//*  15   27:iconst_2        
	//*  16   28:idiv            
	//*  17   29:aload_3         
	//*  18   30:getfield        #134 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//*  19   33:iadd            
	//*  20   34:icmpge          48
			floatingactionbutton.hide(mInternalAutoHideListener, false);
	//   21   37:aload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #172 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		else
	//*  26   46:iconst_1        
	//*  27   47:ireturn         
			floatingactionbutton.show(mInternalAutoHideListener, false);
	//   28   48:aload_2         
	//   29   49:aload_0         
	//   30   50:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
	//   31   53:iconst_0        
	//   32   54:invokevirtual   #175 <Method void FloatingActionButton.show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		return true;
	//*  33   57:goto            46
	}

	public boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, Rect rect)
	{
		coordinatorlayout = ((CoordinatorLayout) (floatingactionbutton.mShadowPadding));
	//    0    0:aload_2         
	//    1    1:getfield        #74  <Field Rect FloatingActionButton.mShadowPadding>
	//    2    4:astore_1        
		rect.set(floatingactionbutton.getLeft() + ((Rect) (coordinatorlayout)).left, floatingactionbutton.getTop() + ((Rect) (coordinatorlayout)).top, floatingactionbutton.getRight() - ((Rect) (coordinatorlayout)).right, floatingactionbutton.getBottom() - ((Rect) (coordinatorlayout)).bottom);
	//    3    5:aload_3         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #122 <Method int FloatingActionButton.getLeft()>
	//    6   10:aload_1         
	//    7   11:getfield        #128 <Field int Rect.left>
	//    8   14:iadd            
	//    9   15:aload_2         
	//   10   16:invokevirtual   #131 <Method int FloatingActionButton.getTop()>
	//   11   19:aload_1         
	//   12   20:getfield        #137 <Field int Rect.top>
	//   13   23:iadd            
	//   14   24:aload_2         
	//   15   25:invokevirtual   #87  <Method int FloatingActionButton.getRight()>
	//   16   28:aload_1         
	//   17   29:getfield        #98  <Field int Rect.right>
	//   18   32:isub            
	//   19   33:aload_2         
	//   20   34:invokevirtual   #101 <Method int FloatingActionButton.getBottom()>
	//   21   37:aload_1         
	//   22   38:getfield        #110 <Field int Rect.bottom>
	//   23   41:isub            
	//   24   42:invokevirtual   #184 <Method void Rect.set(int, int, int, int)>
		return true;
	//   25   45:iconst_1        
	//   26   46:ireturn         
	}

	public volatile boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, View view, Rect rect)
	{
		return getInsetDodgeRect(coordinatorlayout, (FloatingActionButton)view, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class FloatingActionButton>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #187 <Method boolean getInsetDodgeRect(CoordinatorLayout, FloatingActionButton, Rect)>
	//    6   10:ireturn         
	}

	public boolean isAutoHideEnabled()
	{
		return mAutoHideEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean mAutoHideEnabled>
	//    2    4:ireturn         
	}

	public void onAttachedToLayoutParams( )
	{
		if(.dodgeInsetEdges == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #194 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//*   2    4:ifne            13
			.dodgeInsetEdges = 80;
	//    3    7:aload_1         
	//    4    8:bipush          80
	//    5   10:putfield        #194 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//    6   13:return          
	}

	public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
	{
		if(!(view instanceof AppBarLayout)) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:instanceof      #163 <Class AppBarLayout>
	//    2    4:ifeq            20
_L1:
		updateFabVisibilityForAppBarLayout(coordinatorlayout, (AppBarLayout)view, floatingactionbutton);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:checkcast       #163 <Class AppBarLayout>
	//    7   13:aload_2         
	//    8   14:invokespecial   #198 <Method boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
	//    9   17:pop             
_L4:
		return false;
	//   10   18:iconst_0        
	//   11   19:ireturn         
_L2:
		if(isBottomSheet(view))
	//*  12   20:aload_3         
	//*  13   21:invokestatic    #200 <Method boolean isBottomSheet(View)>
	//*  14   24:ifeq            18
			updateFabVisibilityForBottomSheet(view, floatingactionbutton);
	//   15   27:aload_0         
	//   16   28:aload_3         
	//   17   29:aload_2         
	//   18   30:invokespecial   #202 <Method boolean updateFabVisibilityForBottomSheet(View, FloatingActionButton)>
	//   19   33:pop             
		if(true) goto _L4; else goto _L3
	//   20   34:goto            18
_L3:
	}

	public volatile boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
	{
		return onDependentViewChanged(coordinatorlayout, (FloatingActionButton)view, view1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class FloatingActionButton>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #205 <Method boolean onDependentViewChanged(CoordinatorLayout, FloatingActionButton, View)>
	//    6   10:ireturn         
	}

	public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i)
	{
		List list = coordinatorlayout.getDependencies(((View) (floatingactionbutton)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #211 <Method List CoordinatorLayout.getDependencies(View)>
	//    3    5:astore          6
		int j = 0;
	//    4    7:iconst_0        
	//    5    8:istore          4
		int k = list.size();
	//    6   10:aload           6
	//    7   12:invokeinterface #216 <Method int List.size()>
	//    8   17:istore          5
		do
		{
label0:
			{
				if(j < k)
	//*   9   19:iload           4
	//*  10   21:iload           5
	//*  11   23:icmpge          62
				{
					View view = (View)list.get(j);
	//   12   26:aload           6
	//   13   28:iload           4
	//   14   30:invokeinterface #220 <Method Object List.get(int)>
	//   15   35:checkcast       #56  <Class View>
	//   16   38:astore          7
					if((view instanceof AppBarLayout) ? !updateFabVisibilityForAppBarLayout(coordinatorlayout, (AppBarLayout)view, floatingactionbutton) : !isBottomSheet(view) || !updateFabVisibilityForBottomSheet(view, floatingactionbutton))
						break label0;
	//   17   40:aload           7
	//   18   42:instanceof      #163 <Class AppBarLayout>
	//   19   45:ifeq            76
	//   20   48:aload_0         
	//   21   49:aload_1         
	//   22   50:aload           7
	//   23   52:checkcast       #163 <Class AppBarLayout>
	//   24   55:aload_2         
	//   25   56:invokespecial   #198 <Method boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
	//   26   59:ifeq            94
	//   27   62:aload_1         
	//   28   63:aload_2         
	//   29   64:iload_3         
	//   30   65:invokevirtual   #222 <Method void CoordinatorLayout.onLayoutChild(View, int)>
	//   31   68:aload_0         
	//   32   69:aload_1         
	//   33   70:aload_2         
	//   34   71:invokespecial   #224 <Method void offsetIfNeeded(CoordinatorLayout, FloatingActionButton)>
	//   35   74:iconst_1        
	//   36   75:ireturn         
	//   37   76:aload           7
	//   38   78:invokestatic    #200 <Method boolean isBottomSheet(View)>
	//   39   81:ifeq            94
	//   40   84:aload_0         
	//   41   85:aload           7
	//   42   87:aload_2         
	//   43   88:invokespecial   #202 <Method boolean updateFabVisibilityForBottomSheet(View, FloatingActionButton)>
	//   44   91:ifne            62
				}
				coordinatorlayout.onLayoutChild(((View) (floatingactionbutton)), i);
				offsetIfNeeded(coordinatorlayout, floatingactionbutton);
				return true;
			}
			j++;
	//   45   94:iload           4
	//   46   96:iconst_1        
	//   47   97:iadd            
	//   48   98:istore          4
		} while(true);
	//   49  100:goto            19
	}

	public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
	{
		return onLayoutChild(coordinatorlayout, (FloatingActionButton)view, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #7   <Class FloatingActionButton>
	//    4    6:iload_3         
	//    5    7:invokevirtual   #227 <Method boolean onLayoutChild(CoordinatorLayout, FloatingActionButton, int)>
	//    6   10:ireturn         
	}

	public void setAutoHideEnabled(boolean flag)
	{
		mAutoHideEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean mAutoHideEnabled>
	//    3    5:return          
	}

	void setInternalAutoHideListener(ityChangedListener itychangedlistener)
	{
		mInternalAutoHideListener = itychangedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
	//    3    5:return          
	}

	private static final boolean AUTO_HIDE_DEFAULT = true;
	private boolean mAutoHideEnabled;
	private ityChangedListener mInternalAutoHideListener;
	private Rect mTmpRect;

	public FloatingActionButton$Behavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void CoordinatorLayout$Behavior()>
		mAutoHideEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #22  <Field boolean mAutoHideEnabled>
	//    5    9:return          
	}

	public FloatingActionButton$Behavior(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #26  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.FloatingActionButton_Behavior_Layout)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #32  <Field int[] android.support.design.R$styleable.FloatingActionButton_Behavior_Layout>
	//    7   11:invokevirtual   #38  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    8   14:astore_1        
		mAutoHideEnabled = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #42  <Field int android.support.design.R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide>
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #48  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   14   24:putfield        #22  <Field boolean mAutoHideEnabled>
		((TypedArray) (context)).recycle();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #51  <Method void TypedArray.recycle()>
	//   17   31:return          
	}
}
