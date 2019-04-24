// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.lang.annotation.Annotation;
import java.util.List;

// Referenced classes of package android.support.design.widget:
//			VisibilityAwareImageButton, ThemeUtils, ViewUtils, FloatingActionButtonImpl, 
//			FloatingActionButtonLollipop, BottomSheetBehavior, CoordinatorLayout, ViewGroupUtils, 
//			AppBarLayout, ShadowViewDelegate

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
				CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams();
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
				if(floatingactionbutton.getRight() >= coordinatorlayout.getWidth() - layoutparams.rightMargin)
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
				if(floatingactionbutton.getLeft() <= layoutparams.leftMargin)
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
				if(floatingactionbutton.getBottom() >= coordinatorlayout.getHeight() - layoutparams.bottomMargin)
					j = rect.bottom;
				else
		//*  61  128:goto            64
				if(floatingactionbutton.getTop() <= layoutparams.topMargin)
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
			for(CoordinatorLayout.LayoutParams layoutparams = (CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams(); !mAutoHideEnabled || layoutparams.getAnchorId() != view.getId() || floatingactionbutton.getUserSetVisibility() != 0;)
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
			setPadding(mImagePadding + i, mImagePadding + j, mImagePadding + k, mImagePadding + l);
		//    8   15:aload_0         
		//    9   16:getfield        #15  <Field FloatingActionButton this$0>
		//   10   19:aload_0         
		//   11   20:getfield        #15  <Field FloatingActionButton this$0>
		//   12   23:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   13   26:iload_1         
		//   14   27:iadd            
		//   15   28:aload_0         
		//   16   29:getfield        #15  <Field FloatingActionButton this$0>
		//   17   32:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   18   35:iload_2         
		//   19   36:iadd            
		//   20   37:aload_0         
		//   21   38:getfield        #15  <Field FloatingActionButton this$0>
		//   22   41:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   23   44:iload_3         
		//   24   45:iadd            
		//   25   46:aload_0         
		//   26   47:getfield        #15  <Field FloatingActionButton this$0>
		//   27   50:getfield        #52  <Field int FloatingActionButton.mImagePadding>
		//   28   53:iload           4
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
	//    3    3:invokespecial   #57  <Method void FloatingActionButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public FloatingActionButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #61  <Method void FloatingActionButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public FloatingActionButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #62  <Method void VisibilityAwareImageButton(Context, AttributeSet, int)>
		mShadowPadding = new Rect();
	//    5    7:aload_0         
	//    6    8:new             #64  <Class Rect>
	//    7   11:dup             
	//    8   12:invokespecial   #67  <Method void Rect()>
	//    9   15:putfield        #69  <Field Rect mShadowPadding>
		mTouchArea = new Rect();
	//   10   18:aload_0         
	//   11   19:new             #64  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #67  <Method void Rect()>
	//   14   26:putfield        #71  <Field Rect mTouchArea>
		ThemeUtils.checkAppCompatTheme(context);
	//   15   29:aload_1         
	//   16   30:invokestatic    #76  <Method void ThemeUtils.checkAppCompatTheme(Context)>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.FloatingActionButton, i, android.support.design.R.style.Widget_Design_FloatingActionButton)));
	//   17   33:aload_1         
	//   18   34:aload_2         
	//   19   35:getstatic       #81  <Field int[] android.support.design.R$styleable.FloatingActionButton>
	//   20   38:iload_3         
	//   21   39:getstatic       #86  <Field int android.support.design.R$style.Widget_Design_FloatingActionButton>
	//   22   42:invokevirtual   #92  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   23   45:astore_1        
		mBackgroundTint = ((TypedArray) (context)).getColorStateList(android.support.design.R.styleable.FloatingActionButton_backgroundTint);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getstatic       #95  <Field int android.support.design.R$styleable.FloatingActionButton_backgroundTint>
	//   27   51:invokevirtual   #101 <Method ColorStateList TypedArray.getColorStateList(int)>
	//   28   54:putfield        #103 <Field ColorStateList mBackgroundTint>
		mBackgroundTintMode = ViewUtils.parseTintMode(((TypedArray) (context)).getInt(android.support.design.R.styleable.FloatingActionButton_backgroundTintMode, -1), ((android.graphics.PorterDuff.Mode) (null)));
	//   29   57:aload_0         
	//   30   58:aload_1         
	//   31   59:getstatic       #106 <Field int android.support.design.R$styleable.FloatingActionButton_backgroundTintMode>
	//   32   62:iconst_m1       
	//   33   63:invokevirtual   #110 <Method int TypedArray.getInt(int, int)>
	//   34   66:aconst_null     
	//   35   67:invokestatic    #116 <Method android.graphics.PorterDuff$Mode ViewUtils.parseTintMode(int, android.graphics.PorterDuff$Mode)>
	//   36   70:putfield        #118 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
		mRippleColor = ((TypedArray) (context)).getColor(android.support.design.R.styleable.FloatingActionButton_rippleColor, 0);
	//   37   73:aload_0         
	//   38   74:aload_1         
	//   39   75:getstatic       #121 <Field int android.support.design.R$styleable.FloatingActionButton_rippleColor>
	//   40   78:iconst_0        
	//   41   79:invokevirtual   #124 <Method int TypedArray.getColor(int, int)>
	//   42   82:putfield        #126 <Field int mRippleColor>
		mSize = ((TypedArray) (context)).getInt(android.support.design.R.styleable.FloatingActionButton_fabSize, -1);
	//   43   85:aload_0         
	//   44   86:aload_1         
	//   45   87:getstatic       #129 <Field int android.support.design.R$styleable.FloatingActionButton_fabSize>
	//   46   90:iconst_m1       
	//   47   91:invokevirtual   #110 <Method int TypedArray.getInt(int, int)>
	//   48   94:putfield        #131 <Field int mSize>
		mBorderWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.design.R.styleable.FloatingActionButton_borderWidth, 0);
	//   49   97:aload_0         
	//   50   98:aload_1         
	//   51   99:getstatic       #134 <Field int android.support.design.R$styleable.FloatingActionButton_borderWidth>
	//   52  102:iconst_0        
	//   53  103:invokevirtual   #137 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   54  106:putfield        #139 <Field int mBorderWidth>
		float f = ((TypedArray) (context)).getDimension(android.support.design.R.styleable.FloatingActionButton_elevation, 0.0F);
	//   55  109:aload_1         
	//   56  110:getstatic       #142 <Field int android.support.design.R$styleable.FloatingActionButton_elevation>
	//   57  113:fconst_0        
	//   58  114:invokevirtual   #146 <Method float TypedArray.getDimension(int, float)>
	//   59  117:fstore          4
		float f1 = ((TypedArray) (context)).getDimension(android.support.design.R.styleable.FloatingActionButton_pressedTranslationZ, 0.0F);
	//   60  119:aload_1         
	//   61  120:getstatic       #149 <Field int android.support.design.R$styleable.FloatingActionButton_pressedTranslationZ>
	//   62  123:fconst_0        
	//   63  124:invokevirtual   #146 <Method float TypedArray.getDimension(int, float)>
	//   64  127:fstore          5
		mCompatPadding = ((TypedArray) (context)).getBoolean(android.support.design.R.styleable.FloatingActionButton_useCompatPadding, false);
	//   65  129:aload_0         
	//   66  130:aload_1         
	//   67  131:getstatic       #152 <Field int android.support.design.R$styleable.FloatingActionButton_useCompatPadding>
	//   68  134:iconst_0        
	//   69  135:invokevirtual   #156 <Method boolean TypedArray.getBoolean(int, boolean)>
	//   70  138:putfield        #158 <Field boolean mCompatPadding>
		((TypedArray) (context)).recycle();
	//   71  141:aload_1         
	//   72  142:invokevirtual   #161 <Method void TypedArray.recycle()>
		mImageHelper = new AppCompatImageHelper(((android.widget.ImageView) (this)));
	//   73  145:aload_0         
	//   74  146:new             #163 <Class AppCompatImageHelper>
	//   75  149:dup             
	//   76  150:aload_0         
	//   77  151:invokespecial   #166 <Method void AppCompatImageHelper(android.widget.ImageView)>
	//   78  154:putfield        #168 <Field AppCompatImageHelper mImageHelper>
		mImageHelper.loadFromAttributes(attributeset, i);
	//   79  157:aload_0         
	//   80  158:getfield        #168 <Field AppCompatImageHelper mImageHelper>
	//   81  161:aload_2         
	//   82  162:iload_3         
	//   83  163:invokevirtual   #172 <Method void AppCompatImageHelper.loadFromAttributes(AttributeSet, int)>
		mMaxImageSize = (int)getResources().getDimension(android.support.design.R.dimen.design_fab_image_size);
	//   84  166:aload_0         
	//   85  167:aload_0         
	//   86  168:invokevirtual   #176 <Method Resources getResources()>
	//   87  171:getstatic       #181 <Field int android.support.design.R$dimen.design_fab_image_size>
	//   88  174:invokevirtual   #186 <Method float Resources.getDimension(int)>
	//   89  177:f2i             
	//   90  178:putfield        #188 <Field int mMaxImageSize>
		getImpl().setBackgroundDrawable(mBackgroundTint, mBackgroundTintMode, mRippleColor, mBorderWidth);
	//   91  181:aload_0         
	//   92  182:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//   93  185:aload_0         
	//   94  186:getfield        #103 <Field ColorStateList mBackgroundTint>
	//   95  189:aload_0         
	//   96  190:getfield        #118 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
	//   97  193:aload_0         
	//   98  194:getfield        #126 <Field int mRippleColor>
	//   99  197:aload_0         
	//  100  198:getfield        #139 <Field int mBorderWidth>
	//  101  201:invokevirtual   #198 <Method void FloatingActionButtonImpl.setBackgroundDrawable(ColorStateList, android.graphics.PorterDuff$Mode, int, int)>
		getImpl().setElevation(f);
	//  102  204:aload_0         
	//  103  205:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//  104  208:fload           4
	//  105  210:invokevirtual   #202 <Method void FloatingActionButtonImpl.setElevation(float)>
		getImpl().setPressedTranslationZ(f1);
	//  106  213:aload_0         
	//  107  214:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//  108  217:fload           5
	//  109  219:invokevirtual   #205 <Method void FloatingActionButtonImpl.setPressedTranslationZ(float)>
	//  110  222:return          
	}

	private FloatingActionButtonImpl createImpl()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #216 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          25
			return ((FloatingActionButtonImpl) (new FloatingActionButtonLollipop(((VisibilityAwareImageButton) (this)), ((ShadowViewDelegate) (new ShadowDelegateImpl())))));
	//    3    8:new             #218 <Class FloatingActionButtonLollipop>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:new             #14  <Class FloatingActionButton$ShadowDelegateImpl>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokespecial   #221 <Method void FloatingActionButton$ShadowDelegateImpl(FloatingActionButton)>
	//   10   21:invokespecial   #224 <Method void FloatingActionButtonLollipop(VisibilityAwareImageButton, ShadowViewDelegate)>
	//   11   24:areturn         
		else
			return new FloatingActionButtonImpl(((VisibilityAwareImageButton) (this)), ((ShadowViewDelegate) (new ShadowDelegateImpl())));
	//   12   25:new             #194 <Class FloatingActionButtonImpl>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:new             #14  <Class FloatingActionButton$ShadowDelegateImpl>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:invokespecial   #221 <Method void FloatingActionButton$ShadowDelegateImpl(FloatingActionButton)>
	//   19   38:invokespecial   #225 <Method void FloatingActionButtonImpl(VisibilityAwareImageButton, ShadowViewDelegate)>
	//   20   41:areturn         
	}

	private FloatingActionButtonImpl getImpl()
	{
		if(mImpl == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field FloatingActionButtonImpl mImpl>
	//*   2    4:ifnonnull       15
			mImpl = createImpl();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #229 <Method FloatingActionButtonImpl createImpl()>
	//    6   12:putfield        #227 <Field FloatingActionButtonImpl mImpl>
		return mImpl;
	//    7   15:aload_0         
	//    8   16:getfield        #227 <Field FloatingActionButtonImpl mImpl>
	//    9   19:areturn         
	}

	private int getSizeDimension(int i)
	{
		Resources resources = getResources();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method Resources getResources()>
	//    2    4:astore_2        
		switch(i)
	//*   3    5:iload_1         
		{
	//*   4    6:tableswitch     -1 1: default 32
	//	               -1 40
	//	               0 32
	//	               1 75
		case 0: // '\0'
		default:
			return resources.getDimensionPixelSize(android.support.design.R.dimen.design_fab_size_normal);
	//    5   32:aload_2         
	//    6   33:getstatic       #234 <Field int android.support.design.R$dimen.design_fab_size_normal>
	//    7   36:invokevirtual   #236 <Method int Resources.getDimensionPixelSize(int)>
	//    8   39:ireturn         

		case -1: 
			if(Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470)
	//*   9   40:aload_2         
	//*  10   41:invokevirtual   #240 <Method Configuration Resources.getConfiguration()>
	//*  11   44:getfield        #245 <Field int Configuration.screenWidthDp>
	//*  12   47:aload_2         
	//*  13   48:invokevirtual   #240 <Method Configuration Resources.getConfiguration()>
	//*  14   51:getfield        #248 <Field int Configuration.screenHeightDp>
	//*  15   54:invokestatic    #253 <Method int Math.max(int, int)>
	//*  16   57:sipush          470
	//*  17   60:icmpge          69
				return getSizeDimension(1);
	//   18   63:aload_0         
	//   19   64:iconst_1        
	//   20   65:invokespecial   #255 <Method int getSizeDimension(int)>
	//   21   68:ireturn         
			else
				return getSizeDimension(0);
	//   22   69:aload_0         
	//   23   70:iconst_0        
	//   24   71:invokespecial   #255 <Method int getSizeDimension(int)>
	//   25   74:ireturn         

		case 1: // '\001'
			return resources.getDimensionPixelSize(android.support.design.R.dimen.design_fab_size_mini);
	//   26   75:aload_2         
	//   27   76:getstatic       #258 <Field int android.support.design.R$dimen.design_fab_size_mini>
	//   28   79:invokevirtual   #236 <Method int Resources.getDimensionPixelSize(int)>
	//   29   82:ireturn         
		}
	}

	private static int resolveAdjustedSize(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(j);
	//    0    0:iload_1         
	//    1    1:invokestatic    #264 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_2        
		j = android.view.View.MeasureSpec.getSize(j);
	//    3    5:iload_1         
	//    4    6:invokestatic    #267 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5    9:istore_1        
		switch(k)
	//*   6   10:iload_2         
		{
	//*   7   11:lookupswitch    3: default 44
	//	               -2147483648: 48
	//	               0: 46
	//	               1073741824: 54
		default:
			return i;
	//    8   44:iload_0         
	//    9   45:ireturn         

		case 0: // '\0'
			return i;
	//   10   46:iload_0         
	//   11   47:ireturn         

		case -2147483648: 
			return Math.min(i, j);
	//   12   48:iload_0         
	//   13   49:iload_1         
	//   14   50:invokestatic    #270 <Method int Math.min(int, int)>
	//   15   53:ireturn         

		case 1073741824: 
			return j;
	//   16   54:iload_1         
	//   17   55:ireturn         
		}
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
	//    8   12:invokespecial   #276 <Method void FloatingActionButton$1(FloatingActionButton, FloatingActionButton$OnVisibilityChangedListener)>
	//    9   15:areturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #281 <Method void VisibilityAwareImageButton.drawableStateChanged()>
		getImpl().onDrawableStateChanged(getDrawableState());
	//    2    4:aload_0         
	//    3    5:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #285 <Method int[] getDrawableState()>
	//    6   12:invokevirtual   #289 <Method void FloatingActionButtonImpl.onDrawableStateChanged(int[])>
	//    7   15:return          
	}

	public ColorStateList getBackgroundTintList()
	{
		return mBackgroundTint;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field ColorStateList mBackgroundTint>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getBackgroundTintMode()
	{
		return mBackgroundTintMode;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
	//    2    4:areturn         
	}

	public float getCompatElevation()
	{
		return getImpl().getElevation();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #298 <Method float FloatingActionButtonImpl.getElevation()>
	//    3    7:freturn         
	}

	public Drawable getContentBackground()
	{
		return getImpl().getContentBackground();
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:invokevirtual   #303 <Method Drawable FloatingActionButtonImpl.getContentBackground()>
	//    3    7:areturn         
	}

	public boolean getContentRect(Rect rect)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(ViewCompat.isLaidOut(((View) (this))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #311 <Method boolean ViewCompat.isLaidOut(View)>
	//*   4    6:ifeq            89
		{
			rect.set(0, 0, getWidth(), getHeight());
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:iconst_0        
	//    8   12:aload_0         
	//    9   13:invokevirtual   #315 <Method int getWidth()>
	//   10   16:aload_0         
	//   11   17:invokevirtual   #318 <Method int getHeight()>
	//   12   20:invokevirtual   #322 <Method void Rect.set(int, int, int, int)>
			rect.left = rect.left + mShadowPadding.left;
	//   13   23:aload_1         
	//   14   24:aload_1         
	//   15   25:getfield        #325 <Field int Rect.left>
	//   16   28:aload_0         
	//   17   29:getfield        #69  <Field Rect mShadowPadding>
	//   18   32:getfield        #325 <Field int Rect.left>
	//   19   35:iadd            
	//   20   36:putfield        #325 <Field int Rect.left>
			rect.top = rect.top + mShadowPadding.top;
	//   21   39:aload_1         
	//   22   40:aload_1         
	//   23   41:getfield        #328 <Field int Rect.top>
	//   24   44:aload_0         
	//   25   45:getfield        #69  <Field Rect mShadowPadding>
	//   26   48:getfield        #328 <Field int Rect.top>
	//   27   51:iadd            
	//   28   52:putfield        #328 <Field int Rect.top>
			rect.right = rect.right - mShadowPadding.right;
	//   29   55:aload_1         
	//   30   56:aload_1         
	//   31   57:getfield        #331 <Field int Rect.right>
	//   32   60:aload_0         
	//   33   61:getfield        #69  <Field Rect mShadowPadding>
	//   34   64:getfield        #331 <Field int Rect.right>
	//   35   67:isub            
	//   36   68:putfield        #331 <Field int Rect.right>
			rect.bottom = rect.bottom - mShadowPadding.bottom;
	//   37   71:aload_1         
	//   38   72:aload_1         
	//   39   73:getfield        #334 <Field int Rect.bottom>
	//   40   76:aload_0         
	//   41   77:getfield        #69  <Field Rect mShadowPadding>
	//   42   80:getfield        #334 <Field int Rect.bottom>
	//   43   83:isub            
	//   44   84:putfield        #334 <Field int Rect.bottom>
			flag = true;
	//   45   87:iconst_1        
	//   46   88:istore_2        
		}
		return flag;
	//   47   89:iload_2         
	//   48   90:ireturn         
	}

	public int getRippleColor()
	{
		return mRippleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #126 <Field int mRippleColor>
	//    2    4:ireturn         
	}

	public int getSize()
	{
		return mSize;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field int mSize>
	//    2    4:ireturn         
	}

	int getSizeDimension()
	{
		return getSizeDimension(mSize);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #131 <Field int mSize>
	//    3    5:invokespecial   #255 <Method int getSizeDimension(int)>
	//    4    8:ireturn         
	}

	public boolean getUseCompatPadding()
	{
		return mCompatPadding;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field boolean mCompatPadding>
	//    2    4:ireturn         
	}

	public void hide()
	{
		hide(((OnVisibilityChangedListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #342 <Method void hide(FloatingActionButton$OnVisibilityChangedListener)>
	//    3    5:return          
	}

	public void hide(OnVisibilityChangedListener onvisibilitychangedlistener)
	{
		hide(onvisibilitychangedlistener, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #345 <Method void hide(FloatingActionButton$OnVisibilityChangedListener, boolean)>
	//    4    6:return          
	}

	void hide(OnVisibilityChangedListener onvisibilitychangedlistener, boolean flag)
	{
		getImpl().hide(wrapOnVisibilityChangedListener(onvisibilitychangedlistener), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #347 <Method FloatingActionButtonImpl$InternalVisibilityChangedListener wrapOnVisibilityChangedListener(FloatingActionButton$OnVisibilityChangedListener)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #350 <Method void FloatingActionButtonImpl.hide(FloatingActionButtonImpl$InternalVisibilityChangedListener, boolean)>
	//    7   13:return          
	}

	public void jumpDrawablesToCurrentState()
	{
		super.jumpDrawablesToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #353 <Method void VisibilityAwareImageButton.jumpDrawablesToCurrentState()>
		getImpl().jumpDrawableToCurrentState();
	//    2    4:aload_0         
	//    3    5:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #356 <Method void FloatingActionButtonImpl.jumpDrawableToCurrentState()>
	//    5   11:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #359 <Method void VisibilityAwareImageButton.onAttachedToWindow()>
		getImpl().onAttachedToWindow();
	//    2    4:aload_0         
	//    3    5:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #360 <Method void FloatingActionButtonImpl.onAttachedToWindow()>
	//    5   11:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method void VisibilityAwareImageButton.onDetachedFromWindow()>
		getImpl().onDetachedFromWindow();
	//    2    4:aload_0         
	//    3    5:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    4    8:invokevirtual   #364 <Method void FloatingActionButtonImpl.onDetachedFromWindow()>
	//    5   11:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = getSizeDimension();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #368 <Method int getSizeDimension()>
	//    2    4:istore_3        
		mImagePadding = (k - mMaxImageSize) / 2;
	//    3    5:aload_0         
	//    4    6:iload_3         
	//    5    7:aload_0         
	//    6    8:getfield        #188 <Field int mMaxImageSize>
	//    7   11:isub            
	//    8   12:iconst_2        
	//    9   13:idiv            
	//   10   14:putfield        #370 <Field int mImagePadding>
		getImpl().updatePadding();
	//   11   17:aload_0         
	//   12   18:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//   13   21:invokevirtual   #373 <Method void FloatingActionButtonImpl.updatePadding()>
		i = Math.min(resolveAdjustedSize(k, i), resolveAdjustedSize(k, j));
	//   14   24:iload_3         
	//   15   25:iload_1         
	//   16   26:invokestatic    #375 <Method int resolveAdjustedSize(int, int)>
	//   17   29:iload_3         
	//   18   30:iload_2         
	//   19   31:invokestatic    #375 <Method int resolveAdjustedSize(int, int)>
	//   20   34:invokestatic    #270 <Method int Math.min(int, int)>
	//   21   37:istore_1        
		setMeasuredDimension(mShadowPadding.left + i + mShadowPadding.right, mShadowPadding.top + i + mShadowPadding.bottom);
	//   22   38:aload_0         
	//   23   39:aload_0         
	//   24   40:getfield        #69  <Field Rect mShadowPadding>
	//   25   43:getfield        #325 <Field int Rect.left>
	//   26   46:iload_1         
	//   27   47:iadd            
	//   28   48:aload_0         
	//   29   49:getfield        #69  <Field Rect mShadowPadding>
	//   30   52:getfield        #331 <Field int Rect.right>
	//   31   55:iadd            
	//   32   56:aload_0         
	//   33   57:getfield        #69  <Field Rect mShadowPadding>
	//   34   60:getfield        #328 <Field int Rect.top>
	//   35   63:iload_1         
	//   36   64:iadd            
	//   37   65:aload_0         
	//   38   66:getfield        #69  <Field Rect mShadowPadding>
	//   39   69:getfield        #334 <Field int Rect.bottom>
	//   40   72:iadd            
	//   41   73:invokevirtual   #378 <Method void setMeasuredDimension(int, int)>
	//   42   76:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		motionevent.getAction();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #385 <Method int MotionEvent.getAction()>
		JVM INSTR tableswitch 0 0: default 24
	//	               0 30;
	//    2    4:tableswitch     0 0: default 24
	//	               0 30
		   goto _L1 _L2
_L1:
		return super.onTouchEvent(motionevent);
	//    3   24:aload_0         
	//    4   25:aload_1         
	//    5   26:invokespecial   #387 <Method boolean VisibilityAwareImageButton.onTouchEvent(MotionEvent)>
	//    6   29:ireturn         
_L2:
		if(getContentRect(mTouchArea) && !mTouchArea.contains((int)motionevent.getX(), (int)motionevent.getY()))
	//*   7   30:aload_0         
	//*   8   31:aload_0         
	//*   9   32:getfield        #71  <Field Rect mTouchArea>
	//*  10   35:invokevirtual   #389 <Method boolean getContentRect(Rect)>
	//*  11   38:ifeq            24
	//*  12   41:aload_0         
	//*  13   42:getfield        #71  <Field Rect mTouchArea>
	//*  14   45:aload_1         
	//*  15   46:invokevirtual   #392 <Method float MotionEvent.getX()>
	//*  16   49:f2i             
	//*  17   50:aload_1         
	//*  18   51:invokevirtual   #395 <Method float MotionEvent.getY()>
	//*  19   54:f2i             
	//*  20   55:invokevirtual   #399 <Method boolean Rect.contains(int, int)>
	//*  21   58:ifne            24
			return false;
	//   22   61:iconst_0        
	//   23   62:ireturn         
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void setBackgroundColor(int i)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc1            #28  <String "FloatingActionButton">
	//    1    2:ldc2            #403 <String "Setting a custom background is not supported.">
	//    2    5:invokestatic    #409 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc1            #28  <String "FloatingActionButton">
	//    1    2:ldc2            #403 <String "Setting a custom background is not supported.">
	//    2    5:invokestatic    #409 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void setBackgroundResource(int i)
	{
		Log.i("FloatingActionButton", "Setting a custom background is not supported.");
	//    0    0:ldc1            #28  <String "FloatingActionButton">
	//    1    2:ldc2            #403 <String "Setting a custom background is not supported.">
	//    2    5:invokestatic    #409 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void setBackgroundTintList(ColorStateList colorstatelist)
	{
		if(mBackgroundTint != colorstatelist)
	//*   0    0:aload_0         
	//*   1    1:getfield        #103 <Field ColorStateList mBackgroundTint>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			mBackgroundTint = colorstatelist;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #103 <Field ColorStateList mBackgroundTint>
			getImpl().setBackgroundTintList(colorstatelist);
	//    7   13:aload_0         
	//    8   14:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #414 <Method void FloatingActionButtonImpl.setBackgroundTintList(ColorStateList)>
		}
	//   11   21:return          
	}

	public void setBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(mBackgroundTintMode != mode)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       21
		{
			mBackgroundTintMode = mode;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #118 <Field android.graphics.PorterDuff$Mode mBackgroundTintMode>
			getImpl().setBackgroundTintMode(mode);
	//    7   13:aload_0         
	//    8   14:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #418 <Method void FloatingActionButtonImpl.setBackgroundTintMode(android.graphics.PorterDuff$Mode)>
		}
	//   11   21:return          
	}

	public void setCompatElevation(float f)
	{
		getImpl().setElevation(f);
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #202 <Method void FloatingActionButtonImpl.setElevation(float)>
	//    4    8:return          
	}

	public void setImageResource(int i)
	{
		mImageHelper.setImageResource(i);
	//    0    0:aload_0         
	//    1    1:getfield        #168 <Field AppCompatImageHelper mImageHelper>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #423 <Method void AppCompatImageHelper.setImageResource(int)>
	//    4    8:return          
	}

	public void setRippleColor(int i)
	{
		if(mRippleColor != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #126 <Field int mRippleColor>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          21
		{
			mRippleColor = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #126 <Field int mRippleColor>
			getImpl().setRippleColor(i);
	//    7   13:aload_0         
	//    8   14:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:iload_1         
	//   10   18:invokevirtual   #426 <Method void FloatingActionButtonImpl.setRippleColor(int)>
		}
	//   11   21:return          
	}

	public void setSize(int i)
	{
		if(i != mSize)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #131 <Field int mSize>
	//*   3    5:icmpeq          17
		{
			mSize = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #131 <Field int mSize>
			requestLayout();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #430 <Method void requestLayout()>
		}
	//    9   17:return          
	}

	public void setUseCompatPadding(boolean flag)
	{
		if(mCompatPadding != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #158 <Field boolean mCompatPadding>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          20
		{
			mCompatPadding = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #158 <Field boolean mCompatPadding>
			getImpl().onCompatShadowChanged();
	//    7   13:aload_0         
	//    8   14:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    9   17:invokevirtual   #435 <Method void FloatingActionButtonImpl.onCompatShadowChanged()>
		}
	//   10   20:return          
	}

	public volatile void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #438 <Method void VisibilityAwareImageButton.setVisibility(int)>
	//    3    5:return          
	}

	public void show()
	{
		show(((OnVisibilityChangedListener) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #441 <Method void show(FloatingActionButton$OnVisibilityChangedListener)>
	//    3    5:return          
	}

	public void show(OnVisibilityChangedListener onvisibilitychangedlistener)
	{
		show(onvisibilitychangedlistener, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #443 <Method void show(FloatingActionButton$OnVisibilityChangedListener, boolean)>
	//    4    6:return          
	}

	void show(OnVisibilityChangedListener onvisibilitychangedlistener, boolean flag)
	{
		getImpl().show(wrapOnVisibilityChangedListener(onvisibilitychangedlistener), flag);
	//    0    0:aload_0         
	//    1    1:invokespecial   #192 <Method FloatingActionButtonImpl getImpl()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #347 <Method FloatingActionButtonImpl$InternalVisibilityChangedListener wrapOnVisibilityChangedListener(FloatingActionButton$OnVisibilityChangedListener)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #445 <Method void FloatingActionButtonImpl.show(FloatingActionButtonImpl$InternalVisibilityChangedListener, boolean)>
	//    7   13:return          
	}

	private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
	private static final String LOG_TAG = "FloatingActionButton";
	public static final int SIZE_AUTO = -1;
	public static final int SIZE_MINI = 1;
	public static final int SIZE_NORMAL = 0;
	private ColorStateList mBackgroundTint;
	private android.graphics.PorterDuff.Mode mBackgroundTintMode;
	private int mBorderWidth;
	boolean mCompatPadding;
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
	//    2    2:invokespecial   #210 <Method void VisibilityAwareImageButton.setBackgroundDrawable(Drawable)>
		return;
	//    3    5:return          
	}

*/
}
