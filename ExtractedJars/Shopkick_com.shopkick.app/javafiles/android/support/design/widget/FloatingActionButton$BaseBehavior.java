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
//			FloatingActionButton, BottomSheetBehavior, CoordinatorLayout, DescendantOffsetUtils, 
//			AppBarLayout

protected static class FloatingActionButton$BaseBehavior extends CoordinatorLayout.Behavior
{

	private static boolean isBottomSheet(View view)
	{
		view = ((View) (view.getLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #60  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_0        
		if(view instanceof CoordinatorLayout.LayoutParams)
	//*   3    5:aload_0         
	//*   4    6:instanceof      #62  <Class CoordinatorLayout$LayoutParams>
	//*   5    9:ifeq            23
			return ((CoordinatorLayout.LayoutParams)view).getBehavior() instanceof BottomSheetBehavior;
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
		Rect rect = floatingactionbutton.shadowPadding;
	//    0    0:aload_2         
	//    1    1:getfield        #74  <Field Rect FloatingActionButton.shadowPadding>
	//    2    4:astore          7
		if(rect != null && rect.centerX() > 0 && rect.centerY() > 0)
	//*   3    6:aload           7
	//*   4    8:ifnull          166
	//*   5   11:aload           7
	//*   6   13:invokevirtual   #80  <Method int Rect.centerX()>
	//*   7   16:ifle            166
	//*   8   19:aload           7
	//*   9   21:invokevirtual   #83  <Method int Rect.centerY()>
	//*  10   24:ifle            166
		{
			CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
	//   11   27:aload_2         
	//   12   28:invokevirtual   #84  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//   13   31:checkcast       #62  <Class CoordinatorLayout$LayoutParams>
	//   14   34:astore          8
			int i = floatingactionbutton.getRight();
	//   15   36:aload_2         
	//   16   37:invokevirtual   #87  <Method int FloatingActionButton.getRight()>
	//   17   40:istore_3        
			int k = coordinatorlayout.getWidth();
	//   18   41:aload_1         
	//   19   42:invokevirtual   #92  <Method int CoordinatorLayout.getWidth()>
	//   20   45:istore          5
			int l = layoutparams.rightMargin;
	//   21   47:aload           8
	//   22   49:getfield        #95  <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   23   52:istore          6
			int j = 0;
	//   24   54:iconst_0        
	//   25   55:istore          4
			if(i >= k - l)
	//*  26   57:iload_3         
	//*  27   58:iload           5
	//*  28   60:iload           6
	//*  29   62:isub            
	//*  30   63:icmplt          75
				i = rect.right;
	//   31   66:aload           7
	//   32   68:getfield        #98  <Field int Rect.right>
	//   33   71:istore_3        
			else
	//*  34   72:goto            99
			if(floatingactionbutton.getLeft() <= layoutparams.leftMargin)
	//*  35   75:aload_2         
	//*  36   76:invokevirtual   #101 <Method int FloatingActionButton.getLeft()>
	//*  37   79:aload           8
	//*  38   81:getfield        #104 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//*  39   84:icmpgt          97
				i = -rect.left;
	//   40   87:aload           7
	//   41   89:getfield        #107 <Field int Rect.left>
	//   42   92:ineg            
	//   43   93:istore_3        
			else
	//*  44   94:goto            99
				i = 0;
	//   45   97:iconst_0        
	//   46   98:istore_3        
			if(floatingactionbutton.getBottom() >= coordinatorlayout.getHeight() - layoutparams.bottomMargin)
	//*  47   99:aload_2         
	//*  48  100:invokevirtual   #110 <Method int FloatingActionButton.getBottom()>
	//*  49  103:aload_1         
	//*  50  104:invokevirtual   #113 <Method int CoordinatorLayout.getHeight()>
	//*  51  107:aload           8
	//*  52  109:getfield        #116 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//*  53  112:isub            
	//*  54  113:icmplt          126
				j = rect.bottom;
	//   55  116:aload           7
	//   56  118:getfield        #119 <Field int Rect.bottom>
	//   57  121:istore          4
			else
	//*  58  123:goto            146
			if(floatingactionbutton.getTop() <= layoutparams.topMargin)
	//*  59  126:aload_2         
	//*  60  127:invokevirtual   #122 <Method int FloatingActionButton.getTop()>
	//*  61  130:aload           8
	//*  62  132:getfield        #125 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//*  63  135:icmpgt          146
				j = -rect.top;
	//   64  138:aload           7
	//   65  140:getfield        #128 <Field int Rect.top>
	//   66  143:ineg            
	//   67  144:istore          4
			if(j != 0)
	//*  68  146:iload           4
	//*  69  148:ifeq            157
				ViewCompat.offsetTopAndBottom(((View) (floatingactionbutton)), j);
	//   70  151:aload_2         
	//   71  152:iload           4
	//   72  154:invokestatic    #134 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			if(i != 0)
	//*  73  157:iload_3         
	//*  74  158:ifeq            166
				ViewCompat.offsetLeftAndRight(((View) (floatingactionbutton)), i);
	//   75  161:aload_2         
	//   76  162:iload_3         
	//   77  163:invokestatic    #137 <Method void ViewCompat.offsetLeftAndRight(View, int)>
		}
	//   78  166:return          
	}

	private boolean shouldUpdateVisibility(View view, FloatingActionButton floatingactionbutton)
	{
		CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #84  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//    2    4:checkcast       #62  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(!autoHideEnabled)
	//*   4    8:aload_0         
	//*   5    9:getfield        #22  <Field boolean autoHideEnabled>
	//*   6   12:ifne            17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(layoutparams.getAnchorId() != view.getId())
	//*   9   17:aload_3         
	//*  10   18:invokevirtual   #142 <Method int CoordinatorLayout$LayoutParams.getAnchorId()>
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #145 <Method int View.getId()>
	//*  13   25:icmpeq          30
			return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
		return floatingactionbutton.getUserSetVisibility() == 0;
	//   16   30:aload_2         
	//   17   31:invokevirtual   #148 <Method int FloatingActionButton.getUserSetVisibility()>
	//   18   34:ifeq            39
	//   19   37:iconst_0        
	//   20   38:ireturn         
	//   21   39:iconst_1        
	//   22   40:ireturn         
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
		if(tmpRect == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #154 <Field Rect tmpRect>
	//*   9   15:ifnonnull       29
			tmpRect = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #76  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #155 <Method void Rect()>
	//   14   26:putfield        #154 <Field Rect tmpRect>
		Rect rect = tmpRect;
	//   15   29:aload_0         
	//   16   30:getfield        #154 <Field Rect tmpRect>
	//   17   33:astore          4
		DescendantOffsetUtils.getDescendantRect(((android.view.ViewGroup) (coordinatorlayout)), ((View) (appbarlayout)), rect);
	//   18   35:aload_1         
	//   19   36:aload_2         
	//   20   37:aload           4
	//   21   39:invokestatic    #161 <Method void DescendantOffsetUtils.getDescendantRect(android.view.ViewGroup, View, Rect)>
		if(rect.bottom <= appbarlayout.getMinimumHeightForVisibleOverlappingContent())
	//*  22   42:aload           4
	//*  23   44:getfield        #119 <Field int Rect.bottom>
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #166 <Method int AppBarLayout.getMinimumHeightForVisibleOverlappingContent()>
	//*  26   51:icmpgt          66
			floatingactionbutton.hide(internalAutoHideListener, false);
	//   27   54:aload_3         
	//   28   55:aload_0         
	//   29   56:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
	//   30   59:iconst_0        
	//   31   60:invokevirtual   #172 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		else
	//*  32   63:goto            75
			floatingactionbutton.show(internalAutoHideListener, false);
	//   33   66:aload_3         
	//   34   67:aload_0         
	//   35   68:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
	//   36   71:iconst_0        
	//   37   72:invokevirtual   #175 <Method void FloatingActionButton.show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		return true;
	//   38   75:iconst_1        
	//   39   76:ireturn         
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
		CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #84  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
	//    9   15:checkcast       #62  <Class CoordinatorLayout$LayoutParams>
	//   10   18:astore_3        
		if(view.getTop() < floatingactionbutton.getHeight() / 2 + layoutparams.topMargin)
	//*  11   19:aload_1         
	//*  12   20:invokevirtual   #177 <Method int View.getTop()>
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #178 <Method int FloatingActionButton.getHeight()>
	//*  15   27:iconst_2        
	//*  16   28:idiv            
	//*  17   29:aload_3         
	//*  18   30:getfield        #125 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//*  19   33:iadd            
	//*  20   34:icmpge          49
			floatingactionbutton.hide(internalAutoHideListener, false);
	//   21   37:aload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
	//   24   42:iconst_0        
	//   25   43:invokevirtual   #172 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		else
	//*  26   46:goto            58
			floatingactionbutton.show(internalAutoHideListener, false);
	//   27   49:aload_2         
	//   28   50:aload_0         
	//   29   51:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
	//   30   54:iconst_0        
	//   31   55:invokevirtual   #175 <Method void FloatingActionButton.show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
		return true;
	//   32   58:iconst_1        
	//   33   59:ireturn         
	}

	public boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, Rect rect)
	{
		coordinatorlayout = ((CoordinatorLayout) (floatingactionbutton.shadowPadding));
	//    0    0:aload_2         
	//    1    1:getfield        #74  <Field Rect FloatingActionButton.shadowPadding>
	//    2    4:astore_1        
		rect.set(floatingactionbutton.getLeft() + ((Rect) (coordinatorlayout)).left, floatingactionbutton.getTop() + ((Rect) (coordinatorlayout)).top, floatingactionbutton.getRight() - ((Rect) (coordinatorlayout)).right, floatingactionbutton.getBottom() - ((Rect) (coordinatorlayout)).bottom);
	//    3    5:aload_3         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #101 <Method int FloatingActionButton.getLeft()>
	//    6   10:aload_1         
	//    7   11:getfield        #107 <Field int Rect.left>
	//    8   14:iadd            
	//    9   15:aload_2         
	//   10   16:invokevirtual   #122 <Method int FloatingActionButton.getTop()>
	//   11   19:aload_1         
	//   12   20:getfield        #128 <Field int Rect.top>
	//   13   23:iadd            
	//   14   24:aload_2         
	//   15   25:invokevirtual   #87  <Method int FloatingActionButton.getRight()>
	//   16   28:aload_1         
	//   17   29:getfield        #98  <Field int Rect.right>
	//   18   32:isub            
	//   19   33:aload_2         
	//   20   34:invokevirtual   #110 <Method int FloatingActionButton.getBottom()>
	//   21   37:aload_1         
	//   22   38:getfield        #119 <Field int Rect.bottom>
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
		return autoHideEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field boolean autoHideEnabled>
	//    2    4:ireturn         
	}

	public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutparams)
	{
		if(layoutparams.dodgeInsetEdges == 0)
	//*   0    0:aload_1         
	//*   1    1:getfield        #194 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//*   2    4:ifne            13
			layoutparams.dodgeInsetEdges = 80;
	//    3    7:aload_1         
	//    4    8:bipush          80
	//    5   10:putfield        #194 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//    6   13:return          
	}

	public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
	{
		if(view instanceof AppBarLayout)
	//*   0    0:aload_3         
	//*   1    1:instanceof      #163 <Class AppBarLayout>
	//*   2    4:ifeq            21
			updateFabVisibilityForAppBarLayout(coordinatorlayout, (AppBarLayout)view, floatingactionbutton);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_3         
	//    6   10:checkcast       #163 <Class AppBarLayout>
	//    7   13:aload_2         
	//    8   14:invokespecial   #198 <Method boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
	//    9   17:pop             
		else
	//*  10   18:goto            35
		if(isBottomSheet(view))
	//*  11   21:aload_3         
	//*  12   22:invokestatic    #200 <Method boolean isBottomSheet(View)>
	//*  13   25:ifeq            35
			updateFabVisibilityForBottomSheet(view, floatingactionbutton);
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:aload_2         
	//   17   31:invokespecial   #202 <Method boolean updateFabVisibilityForBottomSheet(View, FloatingActionButton)>
	//   18   34:pop             
		return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
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
		int k = list.size();
	//    4    7:aload           6
	//    5    9:invokeinterface #216 <Method int List.size()>
	//    6   14:istore          5
		int j = 0;
	//    7   16:iconst_0        
	//    8   17:istore          4
		do
		{
			if(j >= k)
				break;
	//    9   19:iload           4
	//   10   21:iload           5
	//   11   23:icmpge          95
			View view = (View)list.get(j);
	//   12   26:aload           6
	//   13   28:iload           4
	//   14   30:invokeinterface #220 <Method Object List.get(int)>
	//   15   35:checkcast       #56  <Class View>
	//   16   38:astore          7
			if((view instanceof AppBarLayout) ? updateFabVisibilityForAppBarLayout(coordinatorlayout, (AppBarLayout)view, floatingactionbutton) : isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, floatingactionbutton))
	//*  17   40:aload           7
	//*  18   42:instanceof      #163 <Class AppBarLayout>
	//*  19   45:ifeq            65
	//*  20   48:aload_0         
	//*  21   49:aload_1         
	//*  22   50:aload           7
	//*  23   52:checkcast       #163 <Class AppBarLayout>
	//*  24   55:aload_2         
	//*  25   56:invokespecial   #198 <Method boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
	//*  26   59:ifeq            86
	//*  27   62:goto            95
	//*  28   65:aload           7
	//*  29   67:invokestatic    #200 <Method boolean isBottomSheet(View)>
	//*  30   70:ifeq            86
	//*  31   73:aload_0         
	//*  32   74:aload           7
	//*  33   76:aload_2         
	//*  34   77:invokespecial   #202 <Method boolean updateFabVisibilityForBottomSheet(View, FloatingActionButton)>
	//*  35   80:ifeq            86
				break;
	//   36   83:goto            95
			j++;
	//   37   86:iload           4
	//   38   88:iconst_1        
	//   39   89:iadd            
	//   40   90:istore          4
		} while(true);
	//   41   92:goto            19
		coordinatorlayout.onLayoutChild(((View) (floatingactionbutton)), i);
	//   42   95:aload_1         
	//   43   96:aload_2         
	//   44   97:iload_3         
	//   45   98:invokevirtual   #222 <Method void CoordinatorLayout.onLayoutChild(View, int)>
		offsetIfNeeded(coordinatorlayout, floatingactionbutton);
	//   46  101:aload_0         
	//   47  102:aload_1         
	//   48  103:aload_2         
	//   49  104:invokespecial   #224 <Method void offsetIfNeeded(CoordinatorLayout, FloatingActionButton)>
		return true;
	//   50  107:iconst_1        
	//   51  108:ireturn         
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
		autoHideEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #22  <Field boolean autoHideEnabled>
	//    3    5:return          
	}

	public void setInternalAutoHideListener(hangedListener hangedlistener)
	{
		internalAutoHideListener = hangedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
	//    3    5:return          
	}

	private static final boolean AUTO_HIDE_DEFAULT = true;
	private boolean autoHideEnabled;
	private hangedListener internalAutoHideListener;
	private Rect tmpRect;

	public FloatingActionButton$BaseBehavior()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void CoordinatorLayout$Behavior()>
		autoHideEnabled = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #22  <Field boolean autoHideEnabled>
	//    5    9:return          
	}

	public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeset)
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
		autoHideEnabled = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #42  <Field int android.support.design.R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide>
	//   12   20:iconst_1        
	//   13   21:invokevirtual   #48  <Method boolean TypedArray.getBoolean(int, boolean)>
	//   14   24:putfield        #22  <Field boolean autoHideEnabled>
		((TypedArray) (context)).recycle();
	//   15   27:aload_1         
	//   16   28:invokevirtual   #51  <Method void TypedArray.recycle()>
	//   17   31:return          
	}
}
