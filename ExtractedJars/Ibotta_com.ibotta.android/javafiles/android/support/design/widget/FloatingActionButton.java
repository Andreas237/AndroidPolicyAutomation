// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.animation.MotionSpec;
import android.support.design.expandable.ExpandableTransformationWidget;
import android.support.design.expandable.ExpandableWidgetHelper;
import android.support.design.stateful.ExtendableSavedState;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.SimpleArrayMap;
import android.support.v4.view.TintableBackgroundView;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.TintableImageSourceView;
import android.support.v7.widget.AppCompatDrawableManager;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			VisibilityAwareImageButton, FloatingActionButtonImplLollipop, FloatingActionButtonImpl, BottomSheetBehavior, 
//			CoordinatorLayout, DescendantOffsetUtils, AppBarLayout, ShadowViewDelegate

public class FloatingActionButton extends VisibilityAwareImageButton
	implements ExpandableTransformationWidget, TintableBackgroundView, TintableImageSourceView
{
	protected static class BaseBehavior extends CoordinatorLayout.Behavior
	{

		private static boolean isBottomSheet(View view)
		{
			view = ((View) (view.getLayoutParams()));
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:astore_0        
			if(view instanceof CoordinatorLayout.LayoutParams)
		//*   3    5:aload_0         
		//*   4    6:instanceof      #60  <Class CoordinatorLayout$LayoutParams>
		//*   5    9:ifeq            23
				return ((CoordinatorLayout.LayoutParams)view).getBehavior() instanceof BottomSheetBehavior;
		//    6   12:aload_0         
		//    7   13:checkcast       #60  <Class CoordinatorLayout$LayoutParams>
		//    8   16:invokevirtual   #64  <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
		//    9   19:instanceof      #66  <Class BottomSheetBehavior>
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
		//    1    1:getfield        #72  <Field Rect FloatingActionButton.shadowPadding>
		//    2    4:astore          7
			if(rect != null && rect.centerX() > 0 && rect.centerY() > 0)
		//*   3    6:aload           7
		//*   4    8:ifnull          166
		//*   5   11:aload           7
		//*   6   13:invokevirtual   #78  <Method int Rect.centerX()>
		//*   7   16:ifle            166
		//*   8   19:aload           7
		//*   9   21:invokevirtual   #81  <Method int Rect.centerY()>
		//*  10   24:ifle            166
			{
				CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
		//   11   27:aload_2         
		//   12   28:invokevirtual   #82  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//   13   31:checkcast       #60  <Class CoordinatorLayout$LayoutParams>
		//   14   34:astore          8
				int i = floatingactionbutton.getRight();
		//   15   36:aload_2         
		//   16   37:invokevirtual   #85  <Method int FloatingActionButton.getRight()>
		//   17   40:istore_3        
				int k = coordinatorlayout.getWidth();
		//   18   41:aload_1         
		//   19   42:invokevirtual   #90  <Method int CoordinatorLayout.getWidth()>
		//   20   45:istore          5
				int l = layoutparams.rightMargin;
		//   21   47:aload           8
		//   22   49:getfield        #93  <Field int CoordinatorLayout$LayoutParams.rightMargin>
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
		//   32   68:getfield        #96  <Field int Rect.right>
		//   33   71:istore_3        
				else
		//*  34   72:goto            99
				if(floatingactionbutton.getLeft() <= layoutparams.leftMargin)
		//*  35   75:aload_2         
		//*  36   76:invokevirtual   #99  <Method int FloatingActionButton.getLeft()>
		//*  37   79:aload           8
		//*  38   81:getfield        #102 <Field int CoordinatorLayout$LayoutParams.leftMargin>
		//*  39   84:icmpgt          97
					i = -rect.left;
		//   40   87:aload           7
		//   41   89:getfield        #105 <Field int Rect.left>
		//   42   92:ineg            
		//   43   93:istore_3        
				else
		//*  44   94:goto            99
					i = 0;
		//   45   97:iconst_0        
		//   46   98:istore_3        
				if(floatingactionbutton.getBottom() >= coordinatorlayout.getHeight() - layoutparams.bottomMargin)
		//*  47   99:aload_2         
		//*  48  100:invokevirtual   #108 <Method int FloatingActionButton.getBottom()>
		//*  49  103:aload_1         
		//*  50  104:invokevirtual   #111 <Method int CoordinatorLayout.getHeight()>
		//*  51  107:aload           8
		//*  52  109:getfield        #114 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
		//*  53  112:isub            
		//*  54  113:icmplt          126
					j = rect.bottom;
		//   55  116:aload           7
		//   56  118:getfield        #117 <Field int Rect.bottom>
		//   57  121:istore          4
				else
		//*  58  123:goto            146
				if(floatingactionbutton.getTop() <= layoutparams.topMargin)
		//*  59  126:aload_2         
		//*  60  127:invokevirtual   #120 <Method int FloatingActionButton.getTop()>
		//*  61  130:aload           8
		//*  62  132:getfield        #123 <Field int CoordinatorLayout$LayoutParams.topMargin>
		//*  63  135:icmpgt          146
					j = -rect.top;
		//   64  138:aload           7
		//   65  140:getfield        #126 <Field int Rect.top>
		//   66  143:ineg            
		//   67  144:istore          4
				if(j != 0)
		//*  68  146:iload           4
		//*  69  148:ifeq            157
					ViewCompat.offsetTopAndBottom(((View) (floatingactionbutton)), j);
		//   70  151:aload_2         
		//   71  152:iload           4
		//   72  154:invokestatic    #132 <Method void ViewCompat.offsetTopAndBottom(View, int)>
				if(i != 0)
		//*  73  157:iload_3         
		//*  74  158:ifeq            166
					ViewCompat.offsetLeftAndRight(((View) (floatingactionbutton)), i);
		//   75  161:aload_2         
		//   76  162:iload_3         
		//   77  163:invokestatic    #135 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			}
		//   78  166:return          
		}

		private boolean shouldUpdateVisibility(View view, FloatingActionButton floatingactionbutton)
		{
			CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #82  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//    2    4:checkcast       #60  <Class CoordinatorLayout$LayoutParams>
		//    3    7:astore_3        
			if(!autoHideEnabled)
		//*   4    8:aload_0         
		//*   5    9:getfield        #20  <Field boolean autoHideEnabled>
		//*   6   12:ifne            17
				return false;
		//    7   15:iconst_0        
		//    8   16:ireturn         
			if(layoutparams.getAnchorId() != view.getId())
		//*   9   17:aload_3         
		//*  10   18:invokevirtual   #140 <Method int CoordinatorLayout$LayoutParams.getAnchorId()>
		//*  11   21:aload_1         
		//*  12   22:invokevirtual   #143 <Method int View.getId()>
		//*  13   25:icmpeq          30
				return false;
		//   14   28:iconst_0        
		//   15   29:ireturn         
			return floatingactionbutton.getUserSetVisibility() == 0;
		//   16   30:aload_2         
		//   17   31:invokevirtual   #146 <Method int FloatingActionButton.getUserSetVisibility()>
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
		//*   3    3:invokespecial   #150 <Method boolean shouldUpdateVisibility(View, FloatingActionButton)>
		//*   4    6:ifne            11
				return false;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			if(tmpRect == null)
		//*   7   11:aload_0         
		//*   8   12:getfield        #152 <Field Rect tmpRect>
		//*   9   15:ifnonnull       29
				tmpRect = new Rect();
		//   10   18:aload_0         
		//   11   19:new             #74  <Class Rect>
		//   12   22:dup             
		//   13   23:invokespecial   #153 <Method void Rect()>
		//   14   26:putfield        #152 <Field Rect tmpRect>
			Rect rect = tmpRect;
		//   15   29:aload_0         
		//   16   30:getfield        #152 <Field Rect tmpRect>
		//   17   33:astore          4
			DescendantOffsetUtils.getDescendantRect(((android.view.ViewGroup) (coordinatorlayout)), ((View) (appbarlayout)), rect);
		//   18   35:aload_1         
		//   19   36:aload_2         
		//   20   37:aload           4
		//   21   39:invokestatic    #159 <Method void DescendantOffsetUtils.getDescendantRect(android.view.ViewGroup, View, Rect)>
			if(rect.bottom <= appbarlayout.getMinimumHeightForVisibleOverlappingContent())
		//*  22   42:aload           4
		//*  23   44:getfield        #117 <Field int Rect.bottom>
		//*  24   47:aload_2         
		//*  25   48:invokevirtual   #164 <Method int AppBarLayout.getMinimumHeightForVisibleOverlappingContent()>
		//*  26   51:icmpgt          66
				floatingactionbutton.hide(internalAutoHideListener, false);
		//   27   54:aload_3         
		//   28   55:aload_0         
		//   29   56:getfield        #166 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
		//   30   59:iconst_0        
		//   31   60:invokevirtual   #170 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
			else
		//*  32   63:goto            75
				floatingactionbutton.show(internalAutoHideListener, false);
		//   33   66:aload_3         
		//   34   67:aload_0         
		//   35   68:getfield        #166 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
		//   36   71:iconst_0        
		//   37   72:invokevirtual   #173 <Method void FloatingActionButton.show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
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
		//*   3    3:invokespecial   #150 <Method boolean shouldUpdateVisibility(View, FloatingActionButton)>
		//*   4    6:ifne            11
				return false;
		//    5    9:iconst_0        
		//    6   10:ireturn         
			CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
		//    7   11:aload_2         
		//    8   12:invokevirtual   #82  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//    9   15:checkcast       #60  <Class CoordinatorLayout$LayoutParams>
		//   10   18:astore_3        
			if(view.getTop() < floatingactionbutton.getHeight() / 2 + layoutparams.topMargin)
		//*  11   19:aload_1         
		//*  12   20:invokevirtual   #175 <Method int View.getTop()>
		//*  13   23:aload_2         
		//*  14   24:invokevirtual   #176 <Method int FloatingActionButton.getHeight()>
		//*  15   27:iconst_2        
		//*  16   28:idiv            
		//*  17   29:aload_3         
		//*  18   30:getfield        #123 <Field int CoordinatorLayout$LayoutParams.topMargin>
		//*  19   33:iadd            
		//*  20   34:icmpge          49
				floatingactionbutton.hide(internalAutoHideListener, false);
		//   21   37:aload_2         
		//   22   38:aload_0         
		//   23   39:getfield        #166 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
		//   24   42:iconst_0        
		//   25   43:invokevirtual   #170 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
			else
		//*  26   46:goto            58
				floatingactionbutton.show(internalAutoHideListener, false);
		//   27   49:aload_2         
		//   28   50:aload_0         
		//   29   51:getfield        #166 <Field FloatingActionButton$OnVisibilityChangedListener internalAutoHideListener>
		//   30   54:iconst_0        
		//   31   55:invokevirtual   #173 <Method void FloatingActionButton.show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
			return true;
		//   32   58:iconst_1        
		//   33   59:ireturn         
		}

		public boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, Rect rect)
		{
			coordinatorlayout = ((CoordinatorLayout) (floatingactionbutton.shadowPadding));
		//    0    0:aload_2         
		//    1    1:getfield        #72  <Field Rect FloatingActionButton.shadowPadding>
		//    2    4:astore_1        
			rect.set(floatingactionbutton.getLeft() + ((Rect) (coordinatorlayout)).left, floatingactionbutton.getTop() + ((Rect) (coordinatorlayout)).top, floatingactionbutton.getRight() - ((Rect) (coordinatorlayout)).right, floatingactionbutton.getBottom() - ((Rect) (coordinatorlayout)).bottom);
		//    3    5:aload_3         
		//    4    6:aload_2         
		//    5    7:invokevirtual   #99  <Method int FloatingActionButton.getLeft()>
		//    6   10:aload_1         
		//    7   11:getfield        #105 <Field int Rect.left>
		//    8   14:iadd            
		//    9   15:aload_2         
		//   10   16:invokevirtual   #120 <Method int FloatingActionButton.getTop()>
		//   11   19:aload_1         
		//   12   20:getfield        #126 <Field int Rect.top>
		//   13   23:iadd            
		//   14   24:aload_2         
		//   15   25:invokevirtual   #85  <Method int FloatingActionButton.getRight()>
		//   16   28:aload_1         
		//   17   29:getfield        #96  <Field int Rect.right>
		//   18   32:isub            
		//   19   33:aload_2         
		//   20   34:invokevirtual   #108 <Method int FloatingActionButton.getBottom()>
		//   21   37:aload_1         
		//   22   38:getfield        #117 <Field int Rect.bottom>
		//   23   41:isub            
		//   24   42:invokevirtual   #182 <Method void Rect.set(int, int, int, int)>
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
		//    5    7:invokevirtual   #185 <Method boolean getInsetDodgeRect(CoordinatorLayout, FloatingActionButton, Rect)>
		//    6   10:ireturn         
		}

		public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutparams)
		{
			if(layoutparams.dodgeInsetEdges == 0)
		//*   0    0:aload_1         
		//*   1    1:getfield        #190 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
		//*   2    4:ifne            13
				layoutparams.dodgeInsetEdges = 80;
		//    3    7:aload_1         
		//    4    8:bipush          80
		//    5   10:putfield        #190 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
		//    6   13:return          
		}

		public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
		{
			if(view instanceof AppBarLayout)
		//*   0    0:aload_3         
		//*   1    1:instanceof      #161 <Class AppBarLayout>
		//*   2    4:ifeq            21
				updateFabVisibilityForAppBarLayout(coordinatorlayout, (AppBarLayout)view, floatingactionbutton);
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_3         
		//    6   10:checkcast       #161 <Class AppBarLayout>
		//    7   13:aload_2         
		//    8   14:invokespecial   #194 <Method boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
		//    9   17:pop             
			else
		//*  10   18:goto            35
			if(isBottomSheet(view))
		//*  11   21:aload_3         
		//*  12   22:invokestatic    #196 <Method boolean isBottomSheet(View)>
		//*  13   25:ifeq            35
				updateFabVisibilityForBottomSheet(view, floatingactionbutton);
		//   14   28:aload_0         
		//   15   29:aload_3         
		//   16   30:aload_2         
		//   17   31:invokespecial   #198 <Method boolean updateFabVisibilityForBottomSheet(View, FloatingActionButton)>
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
		//    5    7:invokevirtual   #201 <Method boolean onDependentViewChanged(CoordinatorLayout, FloatingActionButton, View)>
		//    6   10:ireturn         
		}

		public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i)
		{
			List list = coordinatorlayout.getDependencies(((View) (floatingactionbutton)));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #207 <Method List CoordinatorLayout.getDependencies(View)>
		//    3    5:astore          6
			int k = list.size();
		//    4    7:aload           6
		//    5    9:invokeinterface #212 <Method int List.size()>
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
		//   14   30:invokeinterface #216 <Method Object List.get(int)>
		//   15   35:checkcast       #54  <Class View>
		//   16   38:astore          7
				if((view instanceof AppBarLayout) ? updateFabVisibilityForAppBarLayout(coordinatorlayout, (AppBarLayout)view, floatingactionbutton) : isBottomSheet(view) && updateFabVisibilityForBottomSheet(view, floatingactionbutton))
		//*  17   40:aload           7
		//*  18   42:instanceof      #161 <Class AppBarLayout>
		//*  19   45:ifeq            65
		//*  20   48:aload_0         
		//*  21   49:aload_1         
		//*  22   50:aload           7
		//*  23   52:checkcast       #161 <Class AppBarLayout>
		//*  24   55:aload_2         
		//*  25   56:invokespecial   #194 <Method boolean updateFabVisibilityForAppBarLayout(CoordinatorLayout, AppBarLayout, FloatingActionButton)>
		//*  26   59:ifeq            86
		//*  27   62:goto            95
		//*  28   65:aload           7
		//*  29   67:invokestatic    #196 <Method boolean isBottomSheet(View)>
		//*  30   70:ifeq            86
		//*  31   73:aload_0         
		//*  32   74:aload           7
		//*  33   76:aload_2         
		//*  34   77:invokespecial   #198 <Method boolean updateFabVisibilityForBottomSheet(View, FloatingActionButton)>
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
		//   45   98:invokevirtual   #218 <Method void CoordinatorLayout.onLayoutChild(View, int)>
			offsetIfNeeded(coordinatorlayout, floatingactionbutton);
		//   46  101:aload_0         
		//   47  102:aload_1         
		//   48  103:aload_2         
		//   49  104:invokespecial   #220 <Method void offsetIfNeeded(CoordinatorLayout, FloatingActionButton)>
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
		//    5    7:invokevirtual   #223 <Method boolean onLayoutChild(CoordinatorLayout, FloatingActionButton, int)>
		//    6   10:ireturn         
		}

		private boolean autoHideEnabled;
		private OnVisibilityChangedListener internalAutoHideListener;
		private Rect tmpRect;

		public BaseBehavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void CoordinatorLayout$Behavior()>
			autoHideEnabled = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #20  <Field boolean autoHideEnabled>
		//    5    9:return          
		}

		public BaseBehavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #24  <Method void CoordinatorLayout$Behavior(Context, AttributeSet)>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.FloatingActionButton_Behavior_Layout)));
		//    4    6:aload_1         
		//    5    7:aload_2         
		//    6    8:getstatic       #30  <Field int[] android.support.design.R$styleable.FloatingActionButton_Behavior_Layout>
		//    7   11:invokevirtual   #36  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//    8   14:astore_1        
			autoHideEnabled = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
		//    9   15:aload_0         
		//   10   16:aload_1         
		//   11   17:getstatic       #40  <Field int android.support.design.R$styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide>
		//   12   20:iconst_1        
		//   13   21:invokevirtual   #46  <Method boolean TypedArray.getBoolean(int, boolean)>
		//   14   24:putfield        #20  <Field boolean autoHideEnabled>
			((TypedArray) (context)).recycle();
		//   15   27:aload_1         
		//   16   28:invokevirtual   #49  <Method void TypedArray.recycle()>
		//   17   31:return          
		}
	}

	public static class Behavior extends BaseBehavior
	{

		public volatile boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, Rect rect)
		{
			return super.getInsetDodgeRect(coordinatorlayout, floatingactionbutton, rect);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #21  <Method boolean FloatingActionButton$BaseBehavior.getInsetDodgeRect(CoordinatorLayout, FloatingActionButton, Rect)>
		//    5    7:ireturn         
		}

		public volatile void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutparams)
		{
			super.onAttachedToLayoutParams(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void FloatingActionButton$BaseBehavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
		//    3    5:return          
		}

		public volatile boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, View view)
		{
			return super.onDependentViewChanged(coordinatorlayout, floatingactionbutton, view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #30  <Method boolean FloatingActionButton$BaseBehavior.onDependentViewChanged(CoordinatorLayout, FloatingActionButton, View)>
		//    5    7:ireturn         
		}

		public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, FloatingActionButton floatingactionbutton, int i)
		{
			return super.onLayoutChild(coordinatorlayout, floatingactionbutton, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:iload_3         
		//    4    4:invokespecial   #34  <Method boolean FloatingActionButton$BaseBehavior.onLayoutChild(CoordinatorLayout, FloatingActionButton, int)>
		//    5    7:ireturn         
		}

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void FloatingActionButton$BaseBehavior()>
		//    2    4:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #16  <Method void FloatingActionButton$BaseBehavior(Context, AttributeSet)>
		//    4    6:return          
		}
	}

	public static abstract class OnVisibilityChangedListener
	{

		public void onHidden(FloatingActionButton floatingactionbutton)
		{
		//    0    0:return          
		}

		public void onShown(FloatingActionButton floatingactionbutton)
		{
		//    0    0:return          
		}
	}

	private class ShadowDelegateImpl
		implements ShadowViewDelegate
	{

		public float getRadius()
		{
			return (float)getSizeDimension() / 2.0F;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton this$0>
		//    2    4:invokevirtual   #25  <Method int FloatingActionButton.getSizeDimension()>
		//    3    7:i2f             
		//    4    8:fconst_2        
		//    5    9:fdiv            
		//    6   10:freturn         
		}

		public boolean isCompatPaddingEnabled()
		{
			return compatPadding;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton this$0>
		//    2    4:getfield        #31  <Field boolean FloatingActionButton.compatPadding>
		//    3    7:ireturn         
		}

		public void setBackgroundDrawable(Drawable drawable)
		{
			VisibilityAwareImageButton.this.setBackgroundDrawable(drawable);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #37  <Method void FloatingActionButton.access$101(FloatingActionButton, Drawable)>
		//    4    8:return          
		}

		public void setShadowPadding(int i, int j, int k, int l)
		{
			shadowPadding.set(i, j, k, l);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton this$0>
		//    2    4:getfield        #43  <Field Rect FloatingActionButton.shadowPadding>
		//    3    7:iload_1         
		//    4    8:iload_2         
		//    5    9:iload_3         
		//    6   10:iload           4
		//    7   12:invokevirtual   #48  <Method void Rect.set(int, int, int, int)>
			FloatingActionButton floatingactionbutton = FloatingActionButton.this;
		//    8   15:aload_0         
		//    9   16:getfield        #15  <Field FloatingActionButton this$0>
		//   10   19:astore          5
			floatingactionbutton.setPadding(i + floatingactionbutton.imagePadding, j + imagePadding, k + imagePadding, l + imagePadding);
		//   11   21:aload           5
		//   12   23:iload_1         
		//   13   24:aload           5
		//   14   26:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
		//   15   29:iadd            
		//   16   30:iload_2         
		//   17   31:aload_0         
		//   18   32:getfield        #15  <Field FloatingActionButton this$0>
		//   19   35:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
		//   20   38:iadd            
		//   21   39:iload_3         
		//   22   40:aload_0         
		//   23   41:getfield        #15  <Field FloatingActionButton this$0>
		//   24   44:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
		//   25   47:iadd            
		//   26   48:iload           4
		//   27   50:aload_0         
		//   28   51:getfield        #15  <Field FloatingActionButton this$0>
		//   29   54:invokestatic    #52  <Method int FloatingActionButton.access$000(FloatingActionButton)>
		//   30   57:iadd            
		//   31   58:invokevirtual   #55  <Method void FloatingActionButton.setPadding(int, int, int, int)>
		//   32   61:return          
		}

		final FloatingActionButton this$0;

		ShadowDelegateImpl()
		{
			this$0 = FloatingActionButton.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field FloatingActionButton this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface Size
		extends Annotation
	{
	}


	private FloatingActionButtonImpl createImpl()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #72  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          25
			return ((FloatingActionButtonImpl) (new FloatingActionButtonImplLollipop(((VisibilityAwareImageButton) (this)), ((ShadowViewDelegate) (new ShadowDelegateImpl())))));
	//    3    8:new             #74  <Class FloatingActionButtonImplLollipop>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:new             #23  <Class FloatingActionButton$ShadowDelegateImpl>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #78  <Method void FloatingActionButton$ShadowDelegateImpl(FloatingActionButton)>
	//   10   21:invokespecial   #81  <Method void FloatingActionButtonImplLollipop(VisibilityAwareImageButton, ShadowViewDelegate)>
	//   11   24:areturn         
		else
			return new FloatingActionButtonImpl(((VisibilityAwareImageButton) (this)), ((ShadowViewDelegate) (new ShadowDelegateImpl())));
	//   12   25:new             #83  <Class FloatingActionButtonImpl>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:new             #23  <Class FloatingActionButton$ShadowDelegateImpl>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:invokespecial   #78  <Method void FloatingActionButton$ShadowDelegateImpl(FloatingActionButton)>
	//   19   38:invokespecial   #84  <Method void FloatingActionButtonImpl(VisibilityAwareImageButton, ShadowViewDelegate)>
	//   20   41:areturn         
	}

	private FloatingActionButtonImpl getImpl()
	{
		if(impl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #87  <Field FloatingActionButtonImpl impl>
	//*   2    4:ifnonnull       15
			impl = createImpl();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #89  <Method FloatingActionButtonImpl createImpl()>
	//    6   12:putfield        #87  <Field FloatingActionButtonImpl impl>
		return impl;
	//    7   15:aload_0         
	//    8   16:getfield        #87  <Field FloatingActionButtonImpl impl>
	//    9   19:areturn         
	}

	private int getSizeDimension(int i)
	{
		int j = customSize;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int customSize>
	//    2    4:istore_2        
		if(j != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            11
			return j;
	//    5    9:iload_2         
	//    6   10:ireturn         
		Resources resources = getResources();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #97  <Method Resources getResources()>
	//    9   15:astore_3        
		if(i != -1)
	//*  10   16:iload_1         
	//*  11   17:iconst_m1       
	//*  12   18:icmpeq          42
			if(i != 1)
	//*  13   21:iload_1         
	//*  14   22:iconst_1        
	//*  15   23:icmpeq          34
				return resources.getDimensionPixelSize(android.support.design.R.dimen.design_fab_size_normal);
	//   16   26:aload_3         
	//   17   27:getstatic       #102 <Field int android.support.design.R$dimen.design_fab_size_normal>
	//   18   30:invokevirtual   #107 <Method int Resources.getDimensionPixelSize(int)>
	//   19   33:ireturn         
			else
				return resources.getDimensionPixelSize(android.support.design.R.dimen.design_fab_size_mini);
	//   20   34:aload_3         
	//   21   35:getstatic       #110 <Field int android.support.design.R$dimen.design_fab_size_mini>
	//   22   38:invokevirtual   #107 <Method int Resources.getDimensionPixelSize(int)>
	//   23   41:ireturn         
		if(Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470)
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #114 <Method Configuration Resources.getConfiguration()>
	//*  26   46:getfield        #119 <Field int Configuration.screenWidthDp>
	//*  27   49:aload_3         
	//*  28   50:invokevirtual   #114 <Method Configuration Resources.getConfiguration()>
	//*  29   53:getfield        #122 <Field int Configuration.screenHeightDp>
	//*  30   56:invokestatic    #128 <Method int Math.max(int, int)>
	//*  31   59:sipush          470
	//*  32   62:icmpge          71
			return getSizeDimension(1);
	//   33   65:aload_0         
	//   34   66:iconst_1        
	//   35   67:invokespecial   #130 <Method int getSizeDimension(int)>
	//   36   70:ireturn         
		else
			return getSizeDimension(0);
	//   37   71:aload_0         
	//   38   72:iconst_0        
	//   39   73:invokespecial   #130 <Method int getSizeDimension(int)>
	//   40   76:ireturn         
	}

	private void offsetRectWithShadow(Rect rect)
	{
		rect.left = rect.left + shadowPadding.left;
	//    0    0:aload_1         
	//    1    1:aload_1         
	//    2    2:getfield        #138 <Field int Rect.left>
	//    3    5:aload_0         
	//    4    6:getfield        #140 <Field Rect shadowPadding>
	//    5    9:getfield        #138 <Field int Rect.left>
	//    6   12:iadd            
	//    7   13:putfield        #138 <Field int Rect.left>
		rect.top = rect.top + shadowPadding.top;
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #143 <Field int Rect.top>
	//   11   21:aload_0         
	//   12   22:getfield        #140 <Field Rect shadowPadding>
	//   13   25:getfield        #143 <Field int Rect.top>
	//   14   28:iadd            
	//   15   29:putfield        #143 <Field int Rect.top>
		rect.right = rect.right - shadowPadding.right;
	//   16   32:aload_1         
	//   17   33:aload_1         
	//   18   34:getfield        #146 <Field int Rect.right>
	//   19   37:aload_0         
	//   20   38:getfield        #140 <Field Rect shadowPadding>
	//   21   41:getfield        #146 <Field int Rect.right>
	//   22   44:isub            
	//   23   45:putfield        #146 <Field int Rect.right>
		rect.bottom = rect.bottom - shadowPadding.bottom;
	//   24   48:aload_1         
	//   25   49:aload_1         
	//   26   50:getfield        #149 <Field int Rect.bottom>
	//   27   53:aload_0         
	//   28   54:getfield        #140 <Field Rect shadowPadding>
	//   29   57:getfield        #149 <Field int Rect.bottom>
	//   30   60:isub            
	//   31   61:putfield        #149 <Field int Rect.bottom>
	//   32   64:return          
	}

	private void onApplySupportImageTint()
	{
		Drawable drawable = getDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method Drawable getDrawable()>
	//    2    4:astore          4
		if(drawable == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		Object obj = ((Object) (imageTint));
	//    6   12:aload_0         
	//    7   13:getfield        #158 <Field ColorStateList imageTint>
	//    8   16:astore_2        
		if(obj == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       27
		{
			DrawableCompat.clearColorFilter(drawable);
	//   11   21:aload           4
	//   12   23:invokestatic    #163 <Method void DrawableCompat.clearColorFilter(Drawable)>
			return;
	//   13   26:return          
		}
		int i = ((ColorStateList) (obj)).getColorForState(getDrawableState(), 0);
	//   14   27:aload_2         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #167 <Method int[] getDrawableState()>
	//   17   32:iconst_0        
	//   18   33:invokevirtual   #173 <Method int ColorStateList.getColorForState(int[], int)>
	//   19   36:istore_1        
		android.graphics.PorterDuff.Mode mode = imageMode;
	//   20   37:aload_0         
	//   21   38:getfield        #175 <Field android.graphics.PorterDuff$Mode imageMode>
	//   22   41:astore_3        
		obj = ((Object) (mode));
	//   23   42:aload_3         
	//   24   43:astore_2        
		if(mode == null)
	//*  25   44:aload_3         
	//*  26   45:ifnonnull       52
			obj = ((Object) (android.graphics.PorterDuff.Mode.SRC_IN));
	//   27   48:getstatic       #180 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   28   51:astore_2        
		drawable.mutate().setColorFilter(((android.graphics.ColorFilter) (AppCompatDrawableManager.getPorterDuffColorFilter(i, ((android.graphics.PorterDuff.Mode) (obj))))));
	//   29   52:aload           4
	//   30   54:invokevirtual   #185 <Method Drawable Drawable.mutate()>
	//   31   57:iload_1         
	//   32   58:aload_2         
	//   33   59:invokestatic    #191 <Method android.graphics.PorterDuffColorFilter AppCompatDrawableManager.getPorterDuffColorFilter(int, android.graphics.PorterDuff$Mode)>
	//   34   62:invokevirtual   #195 <Method void Drawable.setColorFilter(android.graphics.ColorFilter)>
	//   35   65:return          
	}

	private static int resolveAdjustedSize(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #201 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		j = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #204 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		if(k != 0x80000000)
	//*   6   10:iload_2         
	//*   7   11:ldc1            #205 <Int 0x80000000>
	//*   8   13:icmpeq          36
		{
			if(k != 0)
	//*   9   16:iload_2         
	//*  10   17:ifeq            42
				if(k == 0x40000000)
	//*  11   20:iload_2         
	//*  12   21:ldc1            #206 <Int 0x40000000>
	//*  13   23:icmpne          28
					return j;
	//   14   26:iload_1         
	//   15   27:ireturn         
				else
					throw new IllegalArgumentException();
	//   16   28:new             #208 <Class IllegalArgumentException>
	//   17   31:dup             
	//   18   32:invokespecial   #210 <Method void IllegalArgumentException()>
	//   19   35:athrow          
		} else
		{
			i = Math.min(i, j);
	//   20   36:iload_0         
	//   21   37:iload_1         
	//   22   38:invokestatic    #213 <Method int Math.min(int, int)>
	//   23   41:istore_0        
		}
		return i;
	//   24   42:iload_0         
	//   25   43:ireturn         
	}

	private FloatingActionButtonImpl.InternalVisibilityChangedListener wrapOnVisibilityChangedListener(final OnVisibilityChangedListener listener)
	{
		if(listener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new FloatingActionButtonImpl.InternalVisibilityChangedListener() {

				public void onHidden()
				{
					listener.onHidden(FloatingActionButton.this);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field FloatingActionButton this$0>
				//    4    8:invokevirtual   #31  <Method void FloatingActionButton$OnVisibilityChangedListener.onHidden(FloatingActionButton)>
				//    5   11:return          
				}

				public void onShown()
				{
					listener.onShown(FloatingActionButton.this);
				//    0    0:aload_0         
				//    1    1:getfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener val$listener>
				//    2    4:aload_0         
				//    3    5:getfield        #19  <Field FloatingActionButton this$0>
				//    4    8:invokevirtual   #34  <Method void FloatingActionButton$OnVisibilityChangedListener.onShown(FloatingActionButton)>
				//    5   11:return          
				}

				final FloatingActionButton this$0;
				final OnVisibilityChangedListener val$listener;

			
			{
				this$0 = FloatingActionButton.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field FloatingActionButton this$0>
				listener = onvisibilitychangedlistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FloatingActionButton$OnVisibilityChangedListener val$listener>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
;
	//    4    6:new             #12  <Class FloatingActionButton$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #218 <Method void FloatingActionButton$1(FloatingActionButton, FloatingActionButton$OnVisibilityChangedListener)>
	//    9   15:areturn         
	}

	public void addOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().addOnHideAnimationListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #225 <Method void FloatingActionButtonImpl.addOnHideAnimationListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void addOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().addOnShowAnimationListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #228 <Method void FloatingActionButtonImpl.addOnShowAnimationListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #231 <Method void VisibilityAwareImageButton.drawableStateChanged()>
		getImpl().onDrawableStateChanged(getDrawableState());
	//    2    4:aload_0         
	//    3    5:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #167 <Method int[] getDrawableState()>
	//    6   12:invokevirtual   #235 <Method void FloatingActionButtonImpl.onDrawableStateChanged(int[])>
	//    7   15:return          
	}

	public ColorStateList getBackgroundTintList()
	{
		return backgroundTint;
	//    0    0:aload_0         
	//    1    1:getfield        #239 <Field ColorStateList backgroundTint>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode()
	{
		return backgroundTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #243 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//    2    4:areturn         
	}

	public float getCompatElevation()
	{
		return getImpl().getElevation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #248 <Method float FloatingActionButtonImpl.getElevation()>
	//    3    7:freturn         
	}

	public float getCompatHoveredFocusedTranslationZ()
	{
		return getImpl().getHoveredFocusedTranslationZ();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #252 <Method float FloatingActionButtonImpl.getHoveredFocusedTranslationZ()>
	//    3    7:freturn         
	}

	public float getCompatPressedTranslationZ()
	{
		return getImpl().getPressedTranslationZ();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #256 <Method float FloatingActionButtonImpl.getPressedTranslationZ()>
	//    3    7:freturn         
	}

	public Drawable getContentBackground()
	{
		return getImpl().getContentBackground();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #259 <Method Drawable FloatingActionButtonImpl.getContentBackground()>
	//    3    7:areturn         
	}

	public boolean getContentRect(Rect rect)
	{
		if(ViewCompat.isLaidOut(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #268 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            28
		{
			rect.set(0, 0, getWidth(), getHeight());
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #272 <Method int getWidth()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #275 <Method int getHeight()>
	//   10   18:invokevirtual   #279 <Method void Rect.set(int, int, int, int)>
			offsetRectWithShadow(rect);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #281 <Method void offsetRectWithShadow(Rect)>
			return true;
	//   14   26:iconst_1        
	//   15   27:ireturn         
		} else
		{
			return false;
	//   16   28:iconst_0        
	//   17   29:ireturn         
		}
	}

	public int getCustomSize()
	{
		return customSize;
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field int customSize>
	//    2    4:ireturn         
	}

	public int getExpandedComponentIdHint()
	{
		return expandableWidgetHelper.getExpandedComponentIdHint();
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field ExpandableWidgetHelper expandableWidgetHelper>
	//    2    4:invokevirtual   #291 <Method int ExpandableWidgetHelper.getExpandedComponentIdHint()>
	//    3    7:ireturn         
	}

	public MotionSpec getHideMotionSpec()
	{
		return getImpl().getHideMotionSpec();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #295 <Method MotionSpec FloatingActionButtonImpl.getHideMotionSpec()>
	//    3    7:areturn         
	}

	public void getMeasuredContentRect(Rect rect)
	{
		rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:aload_0         
	//    4    4:invokevirtual   #299 <Method int getMeasuredWidth()>
	//    5    7:aload_0         
	//    6    8:invokevirtual   #302 <Method int getMeasuredHeight()>
	//    7   11:invokevirtual   #279 <Method void Rect.set(int, int, int, int)>
		offsetRectWithShadow(rect);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #281 <Method void offsetRectWithShadow(Rect)>
	//   11   19:return          
	}

	public int getRippleColor()
	{
		ColorStateList colorstatelist = rippleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #306 <Field ColorStateList rippleColor>
	//    2    4:astore_1        
		if(colorstatelist != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return colorstatelist.getDefaultColor();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #309 <Method int ColorStateList.getDefaultColor()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public ColorStateList getRippleColorStateList()
	{
		return rippleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #306 <Field ColorStateList rippleColor>
	//    2    4:areturn         
	}

	public MotionSpec getShowMotionSpec()
	{
		return getImpl().getShowMotionSpec();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #313 <Method MotionSpec FloatingActionButtonImpl.getShowMotionSpec()>
	//    3    7:areturn         
	}

	public int getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #315 <Field int size>
	//    2    4:ireturn         
	}

	int getSizeDimension()
	{
		return getSizeDimension(size);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #315 <Field int size>
	//    3    5:invokespecial   #130 <Method int getSizeDimension(int)>
	//    4    8:ireturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		return getBackgroundTintList();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method ColorStateList getBackgroundTintList()>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		return getBackgroundTintMode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #321 <Method android.graphics.PorterDuff$Mode getBackgroundTintMode()>
	//    2    4:areturn         
	}

	public ColorStateList getSupportImageTintList()
	{
		return imageTint;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field ColorStateList imageTint>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportImageTintMode()
	{
		return imageMode;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field android.graphics.PorterDuff$Mode imageMode>
	//    2    4:areturn         
	}

	public boolean getUseCompatPadding()
	{
		return compatPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #327 <Field boolean compatPadding>
	//    2    4:ireturn         
	}

	void hide(OnVisibilityChangedListener onvisibilitychangedlistener, boolean flag)
	{
		getImpl().hide(wrapOnVisibilityChangedListener(onvisibilitychangedlistener), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #331 <Method FloatingActionButtonImpl$InternalVisibilityChangedListener wrapOnVisibilityChangedListener(FloatingActionButton$OnVisibilityChangedListener)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #334 <Method void FloatingActionButtonImpl.hide(FloatingActionButtonImpl$InternalVisibilityChangedListener, boolean)>
	//    7   13:return          
	}

	public boolean isExpanded()
	{
		return expandableWidgetHelper.isExpanded();
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field ExpandableWidgetHelper expandableWidgetHelper>
	//    2    4:invokevirtual   #337 <Method boolean ExpandableWidgetHelper.isExpanded()>
	//    3    7:ireturn         
	}

	public boolean isOrWillBeShown()
	{
		return getImpl().isOrWillBeShown();
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #340 <Method boolean FloatingActionButtonImpl.isOrWillBeShown()>
	//    3    7:ireturn         
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #343 <Method void VisibilityAwareImageButton.jumpDrawablesToCurrentState()>
		getImpl().jumpDrawableToCurrentState();
	//    2    4:aload_0         
	//    3    5:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #346 <Method void FloatingActionButtonImpl.jumpDrawableToCurrentState()>
	//    5   11:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #349 <Method void VisibilityAwareImageButton.onAttachedToWindow()>
		getImpl().onAttachedToWindow();
	//    2    4:aload_0         
	//    3    5:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #350 <Method void FloatingActionButtonImpl.onAttachedToWindow()>
	//    5   11:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #353 <Method void VisibilityAwareImageButton.onDetachedFromWindow()>
		getImpl().onDetachedFromWindow();
	//    2    4:aload_0         
	//    3    5:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #354 <Method void FloatingActionButtonImpl.onDetachedFromWindow()>
	//    5   11:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = getSizeDimension();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #358 <Method int getSizeDimension()>
	//    2    4:istore_3        
		imagePadding = (k - maxImageSize) / 2;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #360 <Field int maxImageSize>
	//    7   11:isub            
	//    8   12:iconst_2        
	//    9   13:idiv            
	//   10   14:putfield        #58  <Field int imagePadding>
		getImpl().updatePadding();
	//   11   17:aload_0         
	//   12   18:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//   13   21:invokevirtual   #363 <Method void FloatingActionButtonImpl.updatePadding()>
		i = Math.min(resolveAdjustedSize(k, i), resolveAdjustedSize(k, j));
	//   14   24:iload_3         
	//   15   25:iload_1         
	//   16   26:invokestatic    #365 <Method int resolveAdjustedSize(int, int)>
	//   17   29:iload_3         
	//   18   30:iload_2         
	//   19   31:invokestatic    #365 <Method int resolveAdjustedSize(int, int)>
	//   20   34:invokestatic    #213 <Method int Math.min(int, int)>
	//   21   37:istore_1        
		setMeasuredDimension(shadowPadding.left + i + shadowPadding.right, i + shadowPadding.top + shadowPadding.bottom);
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:getfield        #140 <Field Rect shadowPadding>
	//   25   43:getfield        #138 <Field int Rect.left>
	//   26   46:iload_1         
	//   27   47:iadd            
	//   28   48:aload_0         
	//   29   49:getfield        #140 <Field Rect shadowPadding>
	//   30   52:getfield        #146 <Field int Rect.right>
	//   31   55:iadd            
	//   32   56:iload_1         
	//   33   57:aload_0         
	//   34   58:getfield        #140 <Field Rect shadowPadding>
	//   35   61:getfield        #143 <Field int Rect.top>
	//   36   64:iadd            
	//   37   65:aload_0         
	//   38   66:getfield        #140 <Field Rect shadowPadding>
	//   39   69:getfield        #149 <Field int Rect.bottom>
	//   40   72:iadd            
	//   41   73:invokevirtual   #368 <Method void setMeasuredDimension(int, int)>
	//   42   76:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof ExtendableSavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #372 <Class ExtendableSavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #374 <Method void VisibilityAwareImageButton.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((ExtendableSavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #372 <Class ExtendableSavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((ExtendableSavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #378 <Method Parcelable ExtendableSavedState.getSuperState()>
	//   13   23:invokespecial   #374 <Method void VisibilityAwareImageButton.onRestoreInstanceState(Parcelable)>
			expandableWidgetHelper.onRestoreInstanceState((Bundle)((ExtendableSavedState) (parcelable)).extendableStates.get("expandableWidgetHelper"));
	//   14   26:aload_0         
	//   15   27:getfield        #287 <Field ExpandableWidgetHelper expandableWidgetHelper>
	//   16   30:aload_1         
	//   17   31:getfield        #382 <Field SimpleArrayMap ExtendableSavedState.extendableStates>
	//   18   34:ldc2            #383 <String "expandableWidgetHelper">
	//   19   37:invokevirtual   #389 <Method Object SimpleArrayMap.get(Object)>
	//   20   40:checkcast       #391 <Class Bundle>
	//   21   43:invokevirtual   #394 <Method void ExpandableWidgetHelper.onRestoreInstanceState(Bundle)>
			return;
	//   22   46:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		ExtendableSavedState extendablesavedstate = new ExtendableSavedState(super.onSaveInstanceState());
	//    0    0:new             #372 <Class ExtendableSavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #397 <Method Parcelable VisibilityAwareImageButton.onSaveInstanceState()>
	//    4    8:invokespecial   #399 <Method void ExtendableSavedState(Parcelable)>
	//    5   11:astore_1        
		extendablesavedstate.extendableStates.put("expandableWidgetHelper", ((Object) (expandableWidgetHelper.onSaveInstanceState())));
	//    6   12:aload_1         
	//    7   13:getfield        #382 <Field SimpleArrayMap ExtendableSavedState.extendableStates>
	//    8   16:ldc2            #383 <String "expandableWidgetHelper">
	//    9   19:aload_0         
	//   10   20:getfield        #287 <Field ExpandableWidgetHelper expandableWidgetHelper>
	//   11   23:invokevirtual   #402 <Method Bundle ExpandableWidgetHelper.onSaveInstanceState()>
	//   12   26:invokevirtual   #406 <Method Object SimpleArrayMap.put(Object, Object)>
	//   13   29:pop             
		return ((Parcelable) (extendablesavedstate));
	//   14   30:aload_1         
	//   15   31:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0 && getContentRect(touchArea) && !touchArea.contains((int)motionevent.getX(), (int)motionevent.getY()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #413 <Method int MotionEvent.getAction()>
	//*   2    4:ifne            40
	//*   3    7:aload_0         
	//*   4    8:aload_0         
	//*   5    9:getfield        #415 <Field Rect touchArea>
	//*   6   12:invokevirtual   #417 <Method boolean getContentRect(Rect)>
	//*   7   15:ifeq            40
	//*   8   18:aload_0         
	//*   9   19:getfield        #415 <Field Rect touchArea>
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #420 <Method float MotionEvent.getX()>
	//*  12   26:f2i             
	//*  13   27:aload_1         
	//*  14   28:invokevirtual   #423 <Method float MotionEvent.getY()>
	//*  15   31:f2i             
	//*  16   32:invokevirtual   #427 <Method boolean Rect.contains(int, int)>
	//*  17   35:ifne            40
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokespecial   #429 <Method boolean VisibilityAwareImageButton.onTouchEvent(MotionEvent)>
	//   23   45:ireturn         
	}

	public void removeOnHideAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().removeOnHideAnimationListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #432 <Method void FloatingActionButtonImpl.removeOnHideAnimationListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void removeOnShowAnimationListener(android.animation.Animator.AnimatorListener animatorlistener)
	{
		getImpl().removeOnShowAnimationListener(animatorlistener);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #435 <Method void FloatingActionButtonImpl.removeOnShowAnimationListener(android.animation.Animator$AnimatorListener)>
	//    4    8:return          
	}

	public void setBackgroundColor(int i)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #439 <String "FloatingActionButton">
	//    1    3:ldc2            #441 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #447 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #439 <String "FloatingActionButton">
	//    1    3:ldc2            #441 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #447 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundResource(int i)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc2            #439 <String "FloatingActionButton">
	//    1    3:ldc2            #441 <String "Setting a custom background is not supported.">
	//    2    6:invokestatic    #447 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void setBackgroundTintList(ColorStateList colorstatelist)
	{
		if(backgroundTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #239 <Field ColorStateList backgroundTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			backgroundTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #239 <Field ColorStateList backgroundTint>
			getImpl().setBackgroundTintList(colorstatelist);
	//    7   13:aload_0         
	//    8   14:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #452 <Method void FloatingActionButtonImpl.setBackgroundTintList(ColorStateList)>
		}
	//   11   21:return          
	}

	public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(backgroundTintMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #243 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			backgroundTintMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #243 <Field android.graphics.PorterDuff$Mode backgroundTintMode>
			getImpl().setBackgroundTintMode(mode);
	//    7   13:aload_0         
	//    8   14:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #456 <Method void FloatingActionButtonImpl.setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
		}
	//   11   21:return          
	}

	public void setCompatElevation(float f)
	{
		getImpl().setElevation(f);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #461 <Method void FloatingActionButtonImpl.setElevation(float)>
	//    4    8:return          
	}

	public void setCompatElevationResource(int i)
	{
		setCompatElevation(getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #97  <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #467 <Method float Resources.getDimension(int)>
	//    5    9:invokevirtual   #469 <Method void setCompatElevation(float)>
	//    6   12:return          
	}

	public void setCompatHoveredFocusedTranslationZ(float f)
	{
		getImpl().setHoveredFocusedTranslationZ(f);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #473 <Method void FloatingActionButtonImpl.setHoveredFocusedTranslationZ(float)>
	//    4    8:return          
	}

	public void setCompatHoveredFocusedTranslationZResource(int i)
	{
		setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #97  <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #467 <Method float Resources.getDimension(int)>
	//    5    9:invokevirtual   #476 <Method void setCompatHoveredFocusedTranslationZ(float)>
	//    6   12:return          
	}

	public void setCompatPressedTranslationZ(float f)
	{
		getImpl().setPressedTranslationZ(f);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #480 <Method void FloatingActionButtonImpl.setPressedTranslationZ(float)>
	//    4    8:return          
	}

	public void setCompatPressedTranslationZResource(int i)
	{
		setCompatPressedTranslationZ(getResources().getDimension(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #97  <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #467 <Method float Resources.getDimension(int)>
	//    5    9:invokevirtual   #483 <Method void setCompatPressedTranslationZ(float)>
	//    6   12:return          
	}

	public void setCustomSize(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			customSize = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #93  <Field int customSize>
			return;
	//    5    9:return          
		} else
		{
			throw new IllegalArgumentException("Custom size must be non-negative");
	//    6   10:new             #208 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:ldc2            #486 <String "Custom size must be non-negative">
	//    9   17:invokespecial   #489 <Method void IllegalArgumentException(String)>
	//   10   20:athrow          
		}
	}

	public boolean setExpanded(boolean flag)
	{
		return expandableWidgetHelper.setExpanded(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field ExpandableWidgetHelper expandableWidgetHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #493 <Method boolean ExpandableWidgetHelper.setExpanded(boolean)>
	//    4    8:ireturn         
	}

	public void setExpandedComponentIdHint(int i)
	{
		expandableWidgetHelper.setExpandedComponentIdHint(i);
	//    0    0:aload_0         
	//    1    1:getfield        #287 <Field ExpandableWidgetHelper expandableWidgetHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #497 <Method void ExpandableWidgetHelper.setExpandedComponentIdHint(int)>
	//    4    8:return          
	}

	public void setHideMotionSpec(MotionSpec motionspec)
	{
		getImpl().setHideMotionSpec(motionspec);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #501 <Method void FloatingActionButtonImpl.setHideMotionSpec(MotionSpec)>
	//    4    8:return          
	}

	public void setHideMotionSpecResource(int i)
	{
		setHideMotionSpec(MotionSpec.createFromResource(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #507 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #513 <Method MotionSpec MotionSpec.createFromResource(Context, int)>
	//    5    9:invokevirtual   #514 <Method void setHideMotionSpec(MotionSpec)>
	//    6   12:return          
	}

	public void setImageDrawable(Drawable drawable)
	{
		super.setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #517 <Method void VisibilityAwareImageButton.setImageDrawable(Drawable)>
		getImpl().updateImageMatrixScale();
	//    3    5:aload_0         
	//    4    6:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    5    9:invokevirtual   #520 <Method void FloatingActionButtonImpl.updateImageMatrixScale()>
	//    6   12:return          
	}

	public void setImageResource(int i)
	{
		imageHelper.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:getfield        #524 <Field AppCompatImageHelper imageHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #528 <Method void AppCompatImageHelper.setImageResource(int)>
	//    4    8:return          
	}

	public void setRippleColor(int i)
	{
		setRippleColor(ColorStateList.valueOf(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #533 <Method ColorStateList ColorStateList.valueOf(int)>
	//    3    5:invokevirtual   #535 <Method void setRippleColor(ColorStateList)>
	//    4    8:return          
	}

	public void setRippleColor(ColorStateList colorstatelist)
	{
		if(rippleColor != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #306 <Field ColorStateList rippleColor>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       24
		{
			rippleColor = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #306 <Field ColorStateList rippleColor>
			getImpl().setRippleColor(rippleColor);
	//    7   13:aload_0         
	//    8   14:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:aload_0         
	//   10   18:getfield        #306 <Field ColorStateList rippleColor>
	//   11   21:invokevirtual   #536 <Method void FloatingActionButtonImpl.setRippleColor(ColorStateList)>
		}
	//   12   24:return          
	}

	public void setShowMotionSpec(MotionSpec motionspec)
	{
		getImpl().setShowMotionSpec(motionspec);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #539 <Method void FloatingActionButtonImpl.setShowMotionSpec(MotionSpec)>
	//    4    8:return          
	}

	public void setShowMotionSpecResource(int i)
	{
		setShowMotionSpec(MotionSpec.createFromResource(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #507 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #513 <Method MotionSpec MotionSpec.createFromResource(Context, int)>
	//    5    9:invokevirtual   #541 <Method void setShowMotionSpec(MotionSpec)>
	//    6   12:return          
	}

	public void setSize(int i)
	{
		customSize = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #93  <Field int customSize>
		if(i != size)
	//*   3    5:iload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #315 <Field int size>
	//*   6   10:icmpeq          22
		{
			size = i;
	//    7   13:aload_0         
	//    8   14:iload_1         
	//    9   15:putfield        #315 <Field int size>
			requestLayout();
	//   10   18:aload_0         
	//   11   19:invokevirtual   #545 <Method void requestLayout()>
		}
	//   12   22:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		setBackgroundTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #547 <Method void setBackgroundTintList(ColorStateList)>
	//    3    5:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		setBackgroundTintMode(mode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #549 <Method void setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
	//    3    5:return          
	}

	public void setSupportImageTintList(ColorStateList colorstatelist)
	{
		if(imageTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field ColorStateList imageTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			imageTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #158 <Field ColorStateList imageTint>
			onApplySupportImageTint();
	//    7   13:aload_0         
	//    8   14:invokespecial   #552 <Method void onApplySupportImageTint()>
		}
	//    9   17:return          
	}

	public void setSupportImageTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(imageMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field android.graphics.PorterDuff$Mode imageMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			imageMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #175 <Field android.graphics.PorterDuff$Mode imageMode>
			onApplySupportImageTint();
	//    7   13:aload_0         
	//    8   14:invokespecial   #552 <Method void onApplySupportImageTint()>
		}
	//    9   17:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(compatPadding != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #327 <Field boolean compatPadding>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          20
		{
			compatPadding = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #327 <Field boolean compatPadding>
			getImpl().onCompatShadowChanged();
	//    7   13:aload_0         
	//    8   14:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:invokevirtual   #558 <Method void FloatingActionButtonImpl.onCompatShadowChanged()>
		}
	//   10   20:return          
	}

	void show(OnVisibilityChangedListener onvisibilitychangedlistener, boolean flag)
	{
		getImpl().show(wrapOnVisibilityChangedListener(onvisibilitychangedlistener), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #223 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #331 <Method FloatingActionButtonImpl$InternalVisibilityChangedListener wrapOnVisibilityChangedListener(FloatingActionButton$OnVisibilityChangedListener)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #561 <Method void FloatingActionButtonImpl.show(FloatingActionButtonImpl$InternalVisibilityChangedListener, boolean)>
	//    7   13:return          
	}

	private ColorStateList backgroundTint;
	private android.graphics.PorterDuff.Mode backgroundTintMode;
	boolean compatPadding;
	private int customSize;
	private final ExpandableWidgetHelper expandableWidgetHelper;
	private final AppCompatImageHelper imageHelper;
	private android.graphics.PorterDuff.Mode imageMode;
	private int imagePadding;
	private ColorStateList imageTint;
	private FloatingActionButtonImpl impl;
	private int maxImageSize;
	private ColorStateList rippleColor;
	final Rect shadowPadding;
	private int size;
	private final Rect touchArea;


/*
	static int access$000(FloatingActionButton floatingactionbutton)
	{
		return floatingactionbutton.imagePadding;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field int imagePadding>
	//    2    4:ireturn         
	}

*/


/*
	static void access$101(FloatingActionButton floatingactionbutton, Drawable drawable)
	{
		((VisibilityAwareImageButton) (floatingactionbutton)).VisibilityAwareImageButton.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void VisibilityAwareImageButton.setBackgroundDrawable(Drawable)>
		return;
	//    3    5:return          
	}

*/
}
