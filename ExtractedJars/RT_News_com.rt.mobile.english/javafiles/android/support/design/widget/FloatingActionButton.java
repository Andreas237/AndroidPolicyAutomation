// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewGroupUtils;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			VisibilityAwareImageButton, ThemeUtils, ViewUtils, FloatingActionButtonImpl, 
//			FloatingActionButtonLollipop, BottomSheetBehavior, CoordinatorLayout, AppBarLayout, 
//			ShadowViewDelegate

public class FloatingActionButton extends VisibilityAwareImageButton
{
	public static class Behavior extends CoordinatorLayout.Behavior
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
			Rect rect = floatingactionbutton.mShadowPadding;
		//    0    0:aload_2         
		//    1    1:getfield        #74  <Field Rect FloatingActionButton.mShadowPadding>
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
			if(!mAutoHideEnabled)
		//*   4    8:aload_0         
		//*   5    9:getfield        #22  <Field boolean mAutoHideEnabled>
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
		//*  23   44:getfield        #119 <Field int Rect.bottom>
		//*  24   47:aload_2         
		//*  25   48:invokevirtual   #166 <Method int AppBarLayout.getMinimumHeightForVisibleOverlappingContent()>
		//*  26   51:icmpgt          66
				floatingactionbutton.hide(mInternalAutoHideListener, false);
		//   27   54:aload_3         
		//   28   55:aload_0         
		//   29   56:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
		//   30   59:iconst_0        
		//   31   60:invokevirtual   #172 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
			else
		//*  32   63:goto            75
				floatingactionbutton.show(mInternalAutoHideListener, false);
		//   33   66:aload_3         
		//   34   67:aload_0         
		//   35   68:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
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
				floatingactionbutton.hide(mInternalAutoHideListener, false);
		//   21   37:aload_2         
		//   22   38:aload_0         
		//   23   39:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
		//   24   42:iconst_0        
		//   25   43:invokevirtual   #172 <Method void FloatingActionButton.hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
			else
		//*  26   46:goto            58
				floatingactionbutton.show(mInternalAutoHideListener, false);
		//   27   49:aload_2         
		//   28   50:aload_0         
		//   29   51:getfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
		//   30   54:iconst_0        
		//   31   55:invokevirtual   #175 <Method void FloatingActionButton.show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
			return true;
		//   32   58:iconst_1        
		//   33   59:ireturn         
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
			return mAutoHideEnabled;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field boolean mAutoHideEnabled>
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
			mAutoHideEnabled = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #22  <Field boolean mAutoHideEnabled>
		//    3    5:return          
		}

		void setInternalAutoHideListener(OnVisibilityChangedListener onvisibilitychangedlistener)
		{
			mInternalAutoHideListener = onvisibilitychangedlistener;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #168 <Field FloatingActionButton$OnVisibilityChangedListener mInternalAutoHideListener>
		//    3    5:return          
		}

		private static final boolean AUTO_HIDE_DEFAULT = true;
		private boolean mAutoHideEnabled;
		private OnVisibilityChangedListener mInternalAutoHideListener;
		private Rect mTmpRect;

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void CoordinatorLayout$Behavior()>
			mAutoHideEnabled = true;
		//    2    4:aload_0         
		//    3    5:iconst_1        
		//    4    6:putfield        #22  <Field boolean mAutoHideEnabled>
		//    5    9:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
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

		public OnVisibilityChangedListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
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
			return mCompatPadding;
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton this$0>
		//    2    4:getfield        #31  <Field boolean FloatingActionButton.mCompatPadding>
		//    3    7:ireturn         
		}

		public void setBackgroundDrawable(Drawable drawable)
		{
			VisibilityAwareImageButton.this.setBackgroundDrawable(drawable);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton this$0>
		//    2    4:aload_1         
		//    3    5:invokestatic    #37  <Method void FloatingActionButton.access$001(FloatingActionButton, Drawable)>
		//    4    8:return          
		}

		public void setShadowPadding(int i, int j, int k, int l)
		{
			mShadowPadding.set(i, j, k, l);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field FloatingActionButton this$0>
		//    2    4:getfield        #43  <Field Rect FloatingActionButton.mShadowPadding>
		//    3    7:iload_1         
		//    4    8:iload_2         
		//    5    9:iload_3         
		//    6   10:iload           4
		//    7   12:invokevirtual   #48  <Method void Rect.set(int, int, int, int)>
			setPadding(i + mImagePadding, j + mImagePadding, k + mImagePadding, l + mImagePadding);
		//    8   15:aload_0         
		//    9   16:getfield        #15  <Field FloatingActionButton this$0>
		//   10   19:iload_1         
		//   11   20:aload_0         
		//   12   21:getfield        #15  <Field FloatingActionButton this$0>
		//   13   24:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   14   27:iadd            
		//   15   28:iload_2         
		//   16   29:aload_0         
		//   17   30:getfield        #15  <Field FloatingActionButton this$0>
		//   18   33:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   19   36:iadd            
		//   20   37:iload_3         
		//   21   38:aload_0         
		//   22   39:getfield        #15  <Field FloatingActionButton this$0>
		//   23   42:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   24   45:iadd            
		//   25   46:iload           4
		//   26   48:aload_0         
		//   27   49:getfield        #15  <Field FloatingActionButton this$0>
		//   28   52:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   29   55:iadd            
		//   30   56:invokevirtual   #55  <Method void FloatingActionButton.setPadding(int, int, int, int)>
		//   31   59:return          
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


	public FloatingActionButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #59  <Method void FloatingActionButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public FloatingActionButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #63  <Method void FloatingActionButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public FloatingActionButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #64  <Method void VisibilityAwareImageButton(Context, AttributeSet, int)>
		mShadowPadding = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #66  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #69  <Method void Rect()>
	//    9   15:putfield        #71  <Field Rect mShadowPadding>
		mTouchArea = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #66  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #69  <Method void Rect()>
	//   14   26:putfield        #73  <Field Rect mTouchArea>
		ThemeUtils.checkAppCompatTheme(context);
	//   15   29:aload_1         
	//   16   30:invokestatic    #78  <Method void ThemeUtils.checkAppCompatTheme(Context)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.FloatingActionButton, i, android.support.design.R.style.Widget_Design_FloatingActionButton)));
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:getstatic       #83  <Field int[] android.support.design.R$styleable.FloatingActionButton>
	//   20   38:iload_3         
	//   21   39:getstatic       #88  <Field int android.support.design.R$style.Widget_Design_FloatingActionButton>
	//   22   42:invokevirtual   #94  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   23   45:astore_1        
		mBackgroundTint = ((TypedArray) (context)).getColorStateList(android.support.design.R.styleable.FloatingActionButton_backgroundTint);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getstatic       #97  <Field int android.support.design.R$styleable.FloatingActionButton_backgroundTint>
	//   27   51:invokevirtual   #103 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   28   54:putfield        #105 <Field ColorStateList mBackgroundTint>
		mBackgroundTintMode = ViewUtils.parseTintMode(((TypedArray) (context)).getInt(android.support.design.R.styleable.FloatingActionButton_backgroundTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:getstatic       #108 <Field int android.support.design.R$styleable.FloatingActionButton_backgroundTintMode>
	//   32   62:iconst_m1       
	//   33   63:invokevirtual   #112 <Method int TypedArray.getInt(int, int)>
	//   34   66:aconst_null     
	//   35   67:invokestatic    #118 <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   36   70:putfield        #120 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
		mRippleColor = ((TypedArray) (context)).getColor(android.support.design.R.styleable.FloatingActionButton_rippleColor, 0);
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:getstatic       #123 <Field int android.support.design.R$styleable.FloatingActionButton_rippleColor>
	//   40   78:iconst_0        
	//   41   79:invokevirtual   #126 <Method int TypedArray.getColor(int, int)>
	//   42   82:putfield        #128 <Field int mRippleColor>
		mSize = ((TypedArray) (context)).getInt(android.support.design.R.styleable.FloatingActionButton_fabSize, -1);
	//   43   85:aload_0         
	//   44   86:aload_1         
	//   45   87:getstatic       #131 <Field int android.support.design.R$styleable.FloatingActionButton_fabSize>
	//   46   90:iconst_m1       
	//   47   91:invokevirtual   #112 <Method int TypedArray.getInt(int, int)>
	//   48   94:putfield        #133 <Field int mSize>
		mCustomSize = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.FloatingActionButton_fabCustomSize, 0);
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:getstatic       #136 <Field int android.support.design.R$styleable.FloatingActionButton_fabCustomSize>
	//   52  102:iconst_0        
	//   53  103:invokevirtual   #139 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   54  106:putfield        #141 <Field int mCustomSize>
		mBorderWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.FloatingActionButton_borderWidth, 0);
	//   55  109:aload_0         
	//   56  110:aload_1         
	//   57  111:getstatic       #144 <Field int android.support.design.R$styleable.FloatingActionButton_borderWidth>
	//   58  114:iconst_0        
	//   59  115:invokevirtual   #139 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   60  118:putfield        #146 <Field int mBorderWidth>
		float f = ((TypedArray) (context)).getDimension(android.support.design.R.styleable.FloatingActionButton_elevation, 0.0F);
	//   61  121:aload_1         
	//   62  122:getstatic       #149 <Field int android.support.design.R$styleable.FloatingActionButton_elevation>
	//   63  125:fconst_0        
	//   64  126:invokevirtual   #153 <Method float TypedArray.getDimension(int, float)>
	//   65  129:fstore          4
		float f1 = ((TypedArray) (context)).getDimension(android.support.design.R.styleable.FloatingActionButton_pressedTranslationZ, 0.0F);
	//   66  131:aload_1         
	//   67  132:getstatic       #156 <Field int android.support.design.R$styleable.FloatingActionButton_pressedTranslationZ>
	//   68  135:fconst_0        
	//   69  136:invokevirtual   #153 <Method float TypedArray.getDimension(int, float)>
	//   70  139:fstore          5
		mCompatPadding = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.FloatingActionButton_useCompatPadding, false);
	//   71  141:aload_0         
	//   72  142:aload_1         
	//   73  143:getstatic       #159 <Field int android.support.design.R$styleable.FloatingActionButton_useCompatPadding>
	//   74  146:iconst_0        
	//   75  147:invokevirtual   #163 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   76  150:putfield        #165 <Field boolean mCompatPadding>
		((TypedArray) (context)).recycle();
	//   77  153:aload_1         
	//   78  154:invokevirtual   #168 <Method void TypedArray.recycle()>
		mImageHelper = new AppCompatImageHelper(((android.widget.ImageView) (this)));
	//   79  157:aload_0         
	//   80  158:new             #170 <Class AppCompatImageHelper>
	//   81  161:dup             
	//   82  162:aload_0         
	//   83  163:invokespecial   #173 <Method void AppCompatImageHelper(android.widget.ImageView)>
	//   84  166:putfield        #175 <Field AppCompatImageHelper mImageHelper>
		mImageHelper.loadFromAttributes(attributeset, i);
	//   85  169:aload_0         
	//   86  170:getfield        #175 <Field AppCompatImageHelper mImageHelper>
	//   87  173:aload_2         
	//   88  174:iload_3         
	//   89  175:invokevirtual   #179 <Method void AppCompatImageHelper.loadFromAttributes(AttributeSet, int)>
		mMaxImageSize = (int)getResources().getDimension(android.support.design.R.dimen.design_fab_image_size);
	//   90  178:aload_0         
	//   91  179:aload_0         
	//   92  180:invokevirtual   #183 <Method Resources getResources()>
	//   93  183:getstatic       #188 <Field int android.support.design.R$dimen.design_fab_image_size>
	//   94  186:invokevirtual   #193 <Method float Resources.getDimension(int)>
	//   95  189:f2i             
	//   96  190:putfield        #195 <Field int mMaxImageSize>
		getImpl().setBackgroundDrawable(mBackgroundTint, mBackgroundTintMode, mRippleColor, mBorderWidth);
	//   97  193:aload_0         
	//   98  194:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//   99  197:aload_0         
	//  100  198:getfield        #105 <Field ColorStateList mBackgroundTint>
	//  101  201:aload_0         
	//  102  202:getfield        #120 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
	//  103  205:aload_0         
	//  104  206:getfield        #128 <Field int mRippleColor>
	//  105  209:aload_0         
	//  106  210:getfield        #146 <Field int mBorderWidth>
	//  107  213:invokevirtual   #205 <Method void FloatingActionButtonImpl.setBackgroundDrawable(ColorStateList, android.graphics.PorterDuff$Mode, int, int)>
		getImpl().setElevation(f);
	//  108  216:aload_0         
	//  109  217:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//  110  220:fload           4
	//  111  222:invokevirtual   #209 <Method void FloatingActionButtonImpl.setElevation(float)>
		getImpl().setPressedTranslationZ(f1);
	//  112  225:aload_0         
	//  113  226:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//  114  229:fload           5
	//  115  231:invokevirtual   #212 <Method void FloatingActionButtonImpl.setPressedTranslationZ(float)>
	//  116  234:return          
	}

	private FloatingActionButtonImpl createImpl()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #223 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          25
			return ((FloatingActionButtonImpl) (new FloatingActionButtonLollipop(((VisibilityAwareImageButton) (this)), ((ShadowViewDelegate) (new ShadowDelegateImpl())))));
	//    3    8:new             #225 <Class FloatingActionButtonLollipop>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:new             #14  <Class FloatingActionButton$ShadowDelegateImpl>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #228 <Method void FloatingActionButton$ShadowDelegateImpl(FloatingActionButton)>
	//   10   21:invokespecial   #231 <Method void FloatingActionButtonLollipop(VisibilityAwareImageButton, ShadowViewDelegate)>
	//   11   24:areturn         
		else
			return new FloatingActionButtonImpl(((VisibilityAwareImageButton) (this)), ((ShadowViewDelegate) (new ShadowDelegateImpl())));
	//   12   25:new             #201 <Class FloatingActionButtonImpl>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:new             #14  <Class FloatingActionButton$ShadowDelegateImpl>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:invokespecial   #228 <Method void FloatingActionButton$ShadowDelegateImpl(FloatingActionButton)>
	//   19   38:invokespecial   #232 <Method void FloatingActionButtonImpl(VisibilityAwareImageButton, ShadowViewDelegate)>
	//   20   41:areturn         
	}

	private FloatingActionButtonImpl getImpl()
	{
		if(mImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #234 <Field FloatingActionButtonImpl mImpl>
	//*   2    4:ifnonnull       15
			mImpl = createImpl();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #236 <Method FloatingActionButtonImpl createImpl()>
	//    6   12:putfield        #234 <Field FloatingActionButtonImpl mImpl>
		return mImpl;
	//    7   15:aload_0         
	//    8   16:getfield        #234 <Field FloatingActionButtonImpl mImpl>
	//    9   19:areturn         
	}

	private int getSizeDimension(int i)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #183 <Method Resources getResources()>
	//    2    4:astore_2        
		if(mCustomSize != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #141 <Field int mCustomSize>
	//*   5    9:ifeq            17
			return mCustomSize;
	//    6   12:aload_0         
	//    7   13:getfield        #141 <Field int mCustomSize>
	//    8   16:ireturn         
		if(i != -1)
	//*   9   17:iload_1         
	//*  10   18:iconst_m1       
	//*  11   19:icmpeq          43
			if(i != 1)
	//*  12   22:iload_1         
	//*  13   23:iconst_1        
	//*  14   24:icmpeq          35
				return resources.getDimensionPixelSize(android.support.design.R.dimen.design_fab_size_normal);
	//   15   27:aload_2         
	//   16   28:getstatic       #241 <Field int android.support.design.R$dimen.design_fab_size_normal>
	//   17   31:invokevirtual   #243 <Method int Resources.getDimensionPixelSize(int)>
	//   18   34:ireturn         
			else
				return resources.getDimensionPixelSize(android.support.design.R.dimen.design_fab_size_mini);
	//   19   35:aload_2         
	//   20   36:getstatic       #246 <Field int android.support.design.R$dimen.design_fab_size_mini>
	//   21   39:invokevirtual   #243 <Method int Resources.getDimensionPixelSize(int)>
	//   22   42:ireturn         
		if(Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470)
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #250 <Method Configuration Resources.getConfiguration()>
	//*  25   47:getfield        #255 <Field int Configuration.screenWidthDp>
	//*  26   50:aload_2         
	//*  27   51:invokevirtual   #250 <Method Configuration Resources.getConfiguration()>
	//*  28   54:getfield        #258 <Field int Configuration.screenHeightDp>
	//*  29   57:invokestatic    #263 <Method int Math.max(int, int)>
	//*  30   60:sipush          470
	//*  31   63:icmpge          72
			return getSizeDimension(1);
	//   32   66:aload_0         
	//   33   67:iconst_1        
	//   34   68:invokespecial   #265 <Method int getSizeDimension(int)>
	//   35   71:ireturn         
		else
			return getSizeDimension(0);
	//   36   72:aload_0         
	//   37   73:iconst_0        
	//   38   74:invokespecial   #265 <Method int getSizeDimension(int)>
	//   39   77:ireturn         
	}

	private static int resolveAdjustedSize(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #271 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		int l = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #274 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_3        
		if(k != 0x80000000)
	//*   6   10:iload_2         
	//*   7   11:ldc2            #275 <Int 0x80000000>
	//*   8   14:icmpeq          34
		{
			j = i;
	//    9   17:iload_0         
	//   10   18:istore_1        
			if(k != 0)
	//*  11   19:iload_2         
	//*  12   20:ifeq            40
				if(k != 0x40000000)
	//*  13   23:iload_2         
	//*  14   24:ldc2            #276 <Int 0x40000000>
	//*  15   27:icmpeq          32
					return i;
	//   16   30:iload_0         
	//   17   31:ireturn         
				else
					return l;
	//   18   32:iload_3         
	//   19   33:ireturn         
		} else
		{
			j = Math.min(i, l);
	//   20   34:iload_0         
	//   21   35:iload_3         
	//   22   36:invokestatic    #279 <Method int Math.min(int, int)>
	//   23   39:istore_1        
		}
		return j;
	//   24   40:iload_1         
	//   25   41:ireturn         
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
	//    4    6:new             #6   <Class FloatingActionButton$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #285 <Method void FloatingActionButton$1(FloatingActionButton, FloatingActionButton$OnVisibilityChangedListener)>
	//    9   15:areturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #290 <Method void VisibilityAwareImageButton.drawableStateChanged()>
		getImpl().onDrawableStateChanged(getDrawableState());
	//    2    4:aload_0         
	//    3    5:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #294 <Method int[] getDrawableState()>
	//    6   12:invokevirtual   #298 <Method void FloatingActionButtonImpl.onDrawableStateChanged(int[])>
	//    7   15:return          
	}

	public ColorStateList getBackgroundTintList()
	{
		return mBackgroundTint;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field ColorStateList mBackgroundTint>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode()
	{
		return mBackgroundTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
	//    2    4:areturn         
	}

	public float getCompatElevation()
	{
		return getImpl().getElevation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #307 <Method float FloatingActionButtonImpl.getElevation()>
	//    3    7:freturn         
	}

	public Drawable getContentBackground()
	{
		return getImpl().getContentBackground();
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #312 <Method Drawable FloatingActionButtonImpl.getContentBackground()>
	//    3    7:areturn         
	}

	public boolean getContentRect(Rect rect)
	{
		if(ViewCompat.isLaidOut(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #320 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifeq            87
		{
			rect.set(0, 0, getWidth(), getHeight());
	//    3    7:aload_1         
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #324 <Method int getWidth()>
	//    8   14:aload_0         
	//    9   15:invokevirtual   #327 <Method int getHeight()>
	//   10   18:invokevirtual   #331 <Method void Rect.set(int, int, int, int)>
			rect.left = rect.left + mShadowPadding.left;
	//   11   21:aload_1         
	//   12   22:aload_1         
	//   13   23:getfield        #334 <Field int Rect.left>
	//   14   26:aload_0         
	//   15   27:getfield        #71  <Field Rect mShadowPadding>
	//   16   30:getfield        #334 <Field int Rect.left>
	//   17   33:iadd            
	//   18   34:putfield        #334 <Field int Rect.left>
			rect.top = rect.top + mShadowPadding.top;
	//   19   37:aload_1         
	//   20   38:aload_1         
	//   21   39:getfield        #337 <Field int Rect.top>
	//   22   42:aload_0         
	//   23   43:getfield        #71  <Field Rect mShadowPadding>
	//   24   46:getfield        #337 <Field int Rect.top>
	//   25   49:iadd            
	//   26   50:putfield        #337 <Field int Rect.top>
			rect.right = rect.right - mShadowPadding.right;
	//   27   53:aload_1         
	//   28   54:aload_1         
	//   29   55:getfield        #340 <Field int Rect.right>
	//   30   58:aload_0         
	//   31   59:getfield        #71  <Field Rect mShadowPadding>
	//   32   62:getfield        #340 <Field int Rect.right>
	//   33   65:isub            
	//   34   66:putfield        #340 <Field int Rect.right>
			rect.bottom = rect.bottom - mShadowPadding.bottom;
	//   35   69:aload_1         
	//   36   70:aload_1         
	//   37   71:getfield        #343 <Field int Rect.bottom>
	//   38   74:aload_0         
	//   39   75:getfield        #71  <Field Rect mShadowPadding>
	//   40   78:getfield        #343 <Field int Rect.bottom>
	//   41   81:isub            
	//   42   82:putfield        #343 <Field int Rect.bottom>
			return true;
	//   43   85:iconst_1        
	//   44   86:ireturn         
		} else
		{
			return false;
	//   45   87:iconst_0        
	//   46   88:ireturn         
		}
	}

	public int getCustomSize()
	{
		return mCustomSize;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field int mCustomSize>
	//    2    4:ireturn         
	}

	public int getRippleColor()
	{
		return mRippleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field int mRippleColor>
	//    2    4:ireturn         
	}

	public int getSize()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field int mSize>
	//    2    4:ireturn         
	}

	int getSizeDimension()
	{
		return getSizeDimension(mSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #133 <Field int mSize>
	//    3    5:invokespecial   #265 <Method int getSizeDimension(int)>
	//    4    8:ireturn         
	}

	public boolean getUseCompatPadding()
	{
		return mCompatPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field boolean mCompatPadding>
	//    2    4:ireturn         
	}

	public void hide()
	{
		hide(((OnVisibilityChangedListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #352 <Method void hide(FloatingActionButton$OnVisibilityChangedListener)>
	//    3    5:return          
	}

	public void hide(OnVisibilityChangedListener onvisibilitychangedlistener)
	{
		hide(onvisibilitychangedlistener, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #355 <Method void hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
	//    4    6:return          
	}

	void hide(OnVisibilityChangedListener onvisibilitychangedlistener, boolean flag)
	{
		getImpl().hide(wrapOnVisibilityChangedListener(onvisibilitychangedlistener), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #357 <Method FloatingActionButtonImpl$InternalVisibilityChangedListener wrapOnVisibilityChangedListener(FloatingActionButton$OnVisibilityChangedListener)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #360 <Method void FloatingActionButtonImpl.hide(FloatingActionButtonImpl$InternalVisibilityChangedListener, boolean)>
	//    7   13:return          
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method void VisibilityAwareImageButton.jumpDrawablesToCurrentState()>
		getImpl().jumpDrawableToCurrentState();
	//    2    4:aload_0         
	//    3    5:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #366 <Method void FloatingActionButtonImpl.jumpDrawableToCurrentState()>
	//    5   11:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #369 <Method void VisibilityAwareImageButton.onAttachedToWindow()>
		getImpl().onAttachedToWindow();
	//    2    4:aload_0         
	//    3    5:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #370 <Method void FloatingActionButtonImpl.onAttachedToWindow()>
	//    5   11:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #373 <Method void VisibilityAwareImageButton.onDetachedFromWindow()>
		getImpl().onDetachedFromWindow();
	//    2    4:aload_0         
	//    3    5:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #374 <Method void FloatingActionButtonImpl.onDetachedFromWindow()>
	//    5   11:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = getSizeDimension();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #378 <Method int getSizeDimension()>
	//    2    4:istore_3        
		mImagePadding = (k - mMaxImageSize) / 2;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #195 <Field int mMaxImageSize>
	//    7   11:isub            
	//    8   12:iconst_2        
	//    9   13:idiv            
	//   10   14:putfield        #380 <Field int mImagePadding>
		getImpl().updatePadding();
	//   11   17:aload_0         
	//   12   18:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//   13   21:invokevirtual   #383 <Method void FloatingActionButtonImpl.updatePadding()>
		i = Math.min(resolveAdjustedSize(k, i), resolveAdjustedSize(k, j));
	//   14   24:iload_3         
	//   15   25:iload_1         
	//   16   26:invokestatic    #385 <Method int resolveAdjustedSize(int, int)>
	//   17   29:iload_3         
	//   18   30:iload_2         
	//   19   31:invokestatic    #385 <Method int resolveAdjustedSize(int, int)>
	//   20   34:invokestatic    #279 <Method int Math.min(int, int)>
	//   21   37:istore_1        
		setMeasuredDimension(mShadowPadding.left + i + mShadowPadding.right, i + mShadowPadding.top + mShadowPadding.bottom);
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:getfield        #71  <Field Rect mShadowPadding>
	//   25   43:getfield        #334 <Field int Rect.left>
	//   26   46:iload_1         
	//   27   47:iadd            
	//   28   48:aload_0         
	//   29   49:getfield        #71  <Field Rect mShadowPadding>
	//   30   52:getfield        #340 <Field int Rect.right>
	//   31   55:iadd            
	//   32   56:iload_1         
	//   33   57:aload_0         
	//   34   58:getfield        #71  <Field Rect mShadowPadding>
	//   35   61:getfield        #337 <Field int Rect.top>
	//   36   64:iadd            
	//   37   65:aload_0         
	//   38   66:getfield        #71  <Field Rect mShadowPadding>
	//   39   69:getfield        #343 <Field int Rect.bottom>
	//   40   72:iadd            
	//   41   73:invokevirtual   #388 <Method void setMeasuredDimension(int, int)>
	//   42   76:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(motionevent.getAction() == 0 && getContentRect(mTouchArea) && !mTouchArea.contains((int)motionevent.getX(), (int)motionevent.getY()))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #395 <Method int MotionEvent.getAction()>
	//*   2    4:ifeq            10
	//*   3    7:goto            43
	//*   4   10:aload_0         
	//*   5   11:aload_0         
	//*   6   12:getfield        #73  <Field Rect mTouchArea>
	//*   7   15:invokevirtual   #397 <Method boolean getContentRect(Rect)>
	//*   8   18:ifeq            43
	//*   9   21:aload_0         
	//*  10   22:getfield        #73  <Field Rect mTouchArea>
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #400 <Method float MotionEvent.getX()>
	//*  13   29:f2i             
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #403 <Method float MotionEvent.getY()>
	//*  16   34:f2i             
	//*  17   35:invokevirtual   #407 <Method boolean Rect.contains(int, int)>
	//*  18   38:ifne            43
			return false;
	//   19   41:iconst_0        
	//   20   42:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:invokespecial   #409 <Method boolean VisibilityAwareImageButton.onTouchEvent(MotionEvent)>
	//   24   48:ireturn         
	}

	public void setBackgroundColor(int i)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc1            #28  <String "FloatingActionButton">
	//    1    2:ldc2            #413 <String "Setting a custom background is not supported.">
	//    2    5:invokestatic    #419 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc1            #28  <String "FloatingActionButton">
	//    1    2:ldc2            #413 <String "Setting a custom background is not supported.">
	//    2    5:invokestatic    #419 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void setBackgroundResource(int i)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc1            #28  <String "FloatingActionButton">
	//    1    2:ldc2            #413 <String "Setting a custom background is not supported.">
	//    2    5:invokestatic    #419 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void setBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field ColorStateList mBackgroundTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			mBackgroundTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #105 <Field ColorStateList mBackgroundTint>
			getImpl().setBackgroundTintList(colorstatelist);
	//    7   13:aload_0         
	//    8   14:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #424 <Method void FloatingActionButtonImpl.setBackgroundTintList(ColorStateList)>
		}
	//   11   21:return          
	}

	public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #120 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			mBackgroundTintMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #120 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
			getImpl().setBackgroundTintMode(mode);
	//    7   13:aload_0         
	//    8   14:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #428 <Method void FloatingActionButtonImpl.setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
		}
	//   11   21:return          
	}

	public void setCompatElevation(float f)
	{
		getImpl().setElevation(f);
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #209 <Method void FloatingActionButtonImpl.setElevation(float)>
	//    4    8:return          
	}

	public void setCustomSize(int i)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            15
		{
			throw new IllegalArgumentException("Custom size should be non-negative.");
	//    2    4:new             #432 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #434 <String "Custom size should be non-negative.">
	//    5   11:invokespecial   #437 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			mCustomSize = i;
	//    7   15:aload_0         
	//    8   16:iload_1         
	//    9   17:putfield        #141 <Field int mCustomSize>
			return;
	//   10   20:return          
		}
	}

	public void setImageResource(int i)
	{
		mImageHelper.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field AppCompatImageHelper mImageHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #441 <Method void AppCompatImageHelper.setImageResource(int)>
	//    4    8:return          
	}

	public void setRippleColor(int i)
	{
		if(mRippleColor != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field int mRippleColor>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          21
		{
			mRippleColor = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #128 <Field int mRippleColor>
			getImpl().setRippleColor(i);
	//    7   13:aload_0         
	//    8   14:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #444 <Method void FloatingActionButtonImpl.setRippleColor(int)>
		}
	//   11   21:return          
	}

	public void setSize(int i)
	{
		if(i != mSize)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #133 <Field int mSize>
	//*   3    5:icmpeq          17
		{
			mSize = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #133 <Field int mSize>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #448 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(mCompatPadding != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field boolean mCompatPadding>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          20
		{
			mCompatPadding = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #165 <Field boolean mCompatPadding>
			getImpl().onCompatShadowChanged();
	//    7   13:aload_0         
	//    8   14:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:invokevirtual   #453 <Method void FloatingActionButtonImpl.onCompatShadowChanged()>
		}
	//   10   20:return          
	}

	public volatile void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #456 <Method void VisibilityAwareImageButton.setVisibility(int)>
	//    3    5:return          
	}

	public void show()
	{
		show(((OnVisibilityChangedListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #459 <Method void show(FloatingActionButton$OnVisibilityChangedListener)>
	//    3    5:return          
	}

	public void show(OnVisibilityChangedListener onvisibilitychangedlistener)
	{
		show(onvisibilitychangedlistener, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #461 <Method void show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
	//    4    6:return          
	}

	void show(OnVisibilityChangedListener onvisibilitychangedlistener, boolean flag)
	{
		getImpl().show(wrapOnVisibilityChangedListener(onvisibilitychangedlistener), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #199 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #357 <Method FloatingActionButtonImpl$InternalVisibilityChangedListener wrapOnVisibilityChangedListener(FloatingActionButton$OnVisibilityChangedListener)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #463 <Method void FloatingActionButtonImpl.show(FloatingActionButtonImpl$InternalVisibilityChangedListener, boolean)>
	//    7   13:return          
	}

	private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
	private static final String LOG_TAG = "FloatingActionButton";
	public static final int NO_CUSTOM_SIZE = 0;
	public static final int SIZE_AUTO = -1;
	public static final int SIZE_MINI = 1;
	public static final int SIZE_NORMAL = 0;
	private ColorStateList mBackgroundTint;
	private android.graphics.PorterDuff.Mode mBackgroundTintMode;
	private int mBorderWidth;
	boolean mCompatPadding;
	private int mCustomSize;
	private AppCompatImageHelper mImageHelper;
	int mImagePadding;
	private FloatingActionButtonImpl mImpl;
	private int mMaxImageSize;
	private int mRippleColor;
	final Rect mShadowPadding;
	private int mSize;
	private final Rect mTouchArea;


/*
	static void access$001(FloatingActionButton floatingactionbutton, Drawable drawable)
	{
		((VisibilityAwareImageButton) (floatingactionbutton)).VisibilityAwareImageButton.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #217 <Method void VisibilityAwareImageButton.setBackgroundDrawable(Drawable)>
		return;
	//    3    5:return          
	}

*/
}
