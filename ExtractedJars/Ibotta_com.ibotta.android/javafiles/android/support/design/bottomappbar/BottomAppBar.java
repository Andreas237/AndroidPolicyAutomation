// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.animation.*;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.animation.AnimationUtils;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.shape.MaterialShapeDrawable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package android.support.design.bottomappbar:
//			BottomAppBarTopEdgeTreatment

public class BottomAppBar extends Toolbar
	implements android.support.design.widget.CoordinatorLayout.AttachedBehavior
{
	public static class Behavior extends HideBottomViewOnScrollBehavior
	{

		private boolean updateFabPositionAndVisibility(FloatingActionButton floatingactionbutton, BottomAppBar bottomappbar)
		{
			((android.support.design.widget.CoordinatorLayout.LayoutParams)floatingactionbutton.getLayoutParams()).anchorGravity = 17;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #31  <Method android.view.ViewGroup$LayoutParams FloatingActionButton.getLayoutParams()>
		//    2    4:checkcast       #33  <Class android.support.design.widget.CoordinatorLayout$LayoutParams>
		//    3    7:bipush          17
		//    4    9:putfield        #37  <Field int android.support.design.widget.CoordinatorLayout$LayoutParams.anchorGravity>
			bottomappbar.addFabAnimationListeners(floatingactionbutton);
		//    5   12:aload_2         
		//    6   13:aload_1         
		//    7   14:invokestatic    #41  <Method void BottomAppBar.access$1000(BottomAppBar, FloatingActionButton)>
			return true;
		//    8   17:iconst_1        
		//    9   18:ireturn         
		}

		public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, int i)
		{
			FloatingActionButton floatingactionbutton = bottomappbar.findDependentFab();
		//    0    0:aload_2         
		//    1    1:invokestatic    #47  <Method FloatingActionButton BottomAppBar.access$1100(BottomAppBar)>
		//    2    4:astore          4
			if(floatingactionbutton != null)
		//*   3    6:aload           4
		//*   4    8:ifnull          39
			{
				updateFabPositionAndVisibility(floatingactionbutton, bottomappbar);
		//    5   11:aload_0         
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokespecial   #49  <Method boolean updateFabPositionAndVisibility(FloatingActionButton, BottomAppBar)>
		//    9   18:pop             
				floatingactionbutton.getMeasuredContentRect(fabContentRect);
		//   10   19:aload           4
		//   11   21:aload_0         
		//   12   22:getfield        #19  <Field Rect fabContentRect>
		//   13   25:invokevirtual   #53  <Method void FloatingActionButton.getMeasuredContentRect(Rect)>
				bottomappbar.setFabDiameter(fabContentRect.height());
		//   14   28:aload_2         
		//   15   29:aload_0         
		//   16   30:getfield        #19  <Field Rect fabContentRect>
		//   17   33:invokevirtual   #57  <Method int Rect.height()>
		//   18   36:invokevirtual   #61  <Method void BottomAppBar.setFabDiameter(int)>
			}
			if(!bottomappbar.isAnimationRunning())
		//*  19   39:aload_2         
		//*  20   40:invokestatic    #65  <Method boolean BottomAppBar.access$1200(BottomAppBar)>
		//*  21   43:ifne            50
				bottomappbar.setCutoutState();
		//   22   46:aload_2         
		//   23   47:invokestatic    #69  <Method void BottomAppBar.access$1300(BottomAppBar)>
			coordinatorlayout.onLayoutChild(((View) (bottomappbar)), i);
		//   24   50:aload_1         
		//   25   51:aload_2         
		//   26   52:iload_3         
		//   27   53:invokevirtual   #74  <Method void CoordinatorLayout.onLayoutChild(View, int)>
			return super.onLayoutChild(coordinatorlayout, ((View) (bottomappbar)), i);
		//   28   56:aload_0         
		//   29   57:aload_1         
		//   30   58:aload_2         
		//   31   59:iload_3         
		//   32   60:invokespecial   #77  <Method boolean HideBottomViewOnScrollBehavior.onLayoutChild(CoordinatorLayout, View, int)>
		//   33   63:ireturn         
		}

		public volatile boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
		{
			return onLayoutChild(coordinatorlayout, (BottomAppBar)view, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class BottomAppBar>
		//    4    6:iload_3         
		//    5    7:invokevirtual   #79  <Method boolean onLayoutChild(CoordinatorLayout, BottomAppBar, int)>
		//    6   10:ireturn         
		}

		public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, BottomAppBar bottomappbar, View view, View view1, int i, int j)
		{
			return bottomappbar.getHideOnScroll() && super.onStartNestedScroll(coordinatorlayout, ((View) (bottomappbar)), view, view1, i, j);
		//    0    0:aload_2         
		//    1    1:invokevirtual   #86  <Method boolean BottomAppBar.getHideOnScroll()>
		//    2    4:ifeq            25
		//    3    7:aload_0         
		//    4    8:aload_1         
		//    5    9:aload_2         
		//    6   10:aload_3         
		//    7   11:aload           4
		//    8   13:iload           5
		//    9   15:iload           6
		//   10   17:invokespecial   #89  <Method boolean HideBottomViewOnScrollBehavior.onStartNestedScroll(CoordinatorLayout, View, View, View, int, int)>
		//   11   20:ifeq            25
		//   12   23:iconst_1        
		//   13   24:ireturn         
		//   14   25:iconst_0        
		//   15   26:ireturn         
		}

		public volatile boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
		{
			return onStartNestedScroll(coordinatorlayout, (BottomAppBar)view, view1, view2, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #7   <Class BottomAppBar>
		//    4    6:aload_3         
		//    5    7:aload           4
		//    6    9:iload           5
		//    7   11:iload           6
		//    8   13:invokevirtual   #92  <Method boolean onStartNestedScroll(CoordinatorLayout, BottomAppBar, View, View, int, int)>
		//    9   16:ireturn         
		}

		protected void slideDown(BottomAppBar bottomappbar)
		{
			super.slideDown(((View) (bottomappbar)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #96  <Method void HideBottomViewOnScrollBehavior.slideDown(View)>
			bottomappbar = ((BottomAppBar) (bottomappbar.findDependentFab()));
		//    3    5:aload_1         
		//    4    6:invokestatic    #47  <Method FloatingActionButton BottomAppBar.access$1100(BottomAppBar)>
		//    5    9:astore_1        
			if(bottomappbar != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          69
			{
				((FloatingActionButton) (bottomappbar)).getContentRect(fabContentRect);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #19  <Field Rect fabContentRect>
		//   11   19:invokevirtual   #100 <Method boolean FloatingActionButton.getContentRect(Rect)>
		//   12   22:pop             
				float f = ((FloatingActionButton) (bottomappbar)).getMeasuredHeight() - fabContentRect.height();
		//   13   23:aload_1         
		//   14   24:invokevirtual   #103 <Method int FloatingActionButton.getMeasuredHeight()>
		//   15   27:aload_0         
		//   16   28:getfield        #19  <Field Rect fabContentRect>
		//   17   31:invokevirtual   #57  <Method int Rect.height()>
		//   18   34:isub            
		//   19   35:i2f             
		//   20   36:fstore_2        
				((FloatingActionButton) (bottomappbar)).clearAnimation();
		//   21   37:aload_1         
		//   22   38:invokevirtual   #106 <Method void FloatingActionButton.clearAnimation()>
				((FloatingActionButton) (bottomappbar)).animate().translationY((float)(-((FloatingActionButton) (bottomappbar)).getPaddingBottom()) + f).setInterpolator(AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR).setDuration(175L);
		//   23   41:aload_1         
		//   24   42:invokevirtual   #110 <Method ViewPropertyAnimator FloatingActionButton.animate()>
		//   25   45:aload_1         
		//   26   46:invokevirtual   #113 <Method int FloatingActionButton.getPaddingBottom()>
		//   27   49:ineg            
		//   28   50:i2f             
		//   29   51:fload_2         
		//   30   52:fadd            
		//   31   53:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
		//   32   56:getstatic       #125 <Field android.animation.TimeInterpolator AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR>
		//   33   59:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
		//   34   62:ldc2w           #130 <Long 175L>
		//   35   65:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
		//   36   68:pop             
			}
		//   37   69:return          
		}

		protected volatile void slideDown(View view)
		{
			slideDown((BottomAppBar)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class BottomAppBar>
		//    3    5:invokevirtual   #137 <Method void slideDown(BottomAppBar)>
		//    4    8:return          
		}

		protected void slideUp(BottomAppBar bottomappbar)
		{
			super.slideUp(((View) (bottomappbar)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #140 <Method void HideBottomViewOnScrollBehavior.slideUp(View)>
			FloatingActionButton floatingactionbutton = bottomappbar.findDependentFab();
		//    3    5:aload_1         
		//    4    6:invokestatic    #47  <Method FloatingActionButton BottomAppBar.access$1100(BottomAppBar)>
		//    5    9:astore_2        
			if(floatingactionbutton != null)
		//*   6   10:aload_2         
		//*   7   11:ifnull          42
			{
				floatingactionbutton.clearAnimation();
		//    8   14:aload_2         
		//    9   15:invokevirtual   #106 <Method void FloatingActionButton.clearAnimation()>
				floatingactionbutton.animate().translationY(bottomappbar.getFabTranslationY()).setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR).setDuration(225L);
		//   10   18:aload_2         
		//   11   19:invokevirtual   #110 <Method ViewPropertyAnimator FloatingActionButton.animate()>
		//   12   22:aload_1         
		//   13   23:invokestatic    #144 <Method float BottomAppBar.access$1400(BottomAppBar)>
		//   14   26:invokevirtual   #119 <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
		//   15   29:getstatic       #147 <Field android.animation.TimeInterpolator AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR>
		//   16   32:invokevirtual   #129 <Method ViewPropertyAnimator ViewPropertyAnimator.setInterpolator(android.animation.TimeInterpolator)>
		//   17   35:ldc2w           #148 <Long 225L>
		//   18   38:invokevirtual   #135 <Method ViewPropertyAnimator ViewPropertyAnimator.setDuration(long)>
		//   19   41:pop             
			}
		//   20   42:return          
		}

		protected volatile void slideUp(View view)
		{
			slideUp((BottomAppBar)view);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #7   <Class BottomAppBar>
		//    3    5:invokevirtual   #151 <Method void slideUp(BottomAppBar)>
		//    4    8:return          
		}

		private final Rect fabContentRect;

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void HideBottomViewOnScrollBehavior()>
			fabContentRect = new Rect();
		//    2    4:aload_0         
		//    3    5:new             #16  <Class Rect>
		//    4    8:dup             
		//    5    9:invokespecial   #17  <Method void Rect()>
		//    6   12:putfield        #19  <Field Rect fabContentRect>
		//    7   15:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void HideBottomViewOnScrollBehavior(Context, AttributeSet)>
			fabContentRect = new Rect();
		//    4    6:aload_0         
		//    5    7:new             #16  <Class Rect>
		//    6   10:dup             
		//    7   11:invokespecial   #17  <Method void Rect()>
		//    8   14:putfield        #19  <Field Rect fabContentRect>
		//    9   17:return          
		}
	}

	public static interface FabAlignmentMode
		extends Annotation
	{
	}

	static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #45  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #47  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #52  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class BottomAppBar$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void BottomAppBar$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomAppBar$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void BottomAppBar$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method BottomAppBar$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method BottomAppBar$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method BottomAppBar$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int fabAlignmentMode;
		boolean fabAttached;

		static 
		{
		//    0    0:new             #9   <Class BottomAppBar$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void BottomAppBar$SavedState$1()>
		//    3    7:putstatic       #23  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #27  <Method void AbsSavedState(Parcel, ClassLoader)>
			fabAlignmentMode = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #33  <Method int Parcel.readInt()>
		//    7   11:putfield        #35  <Field int fabAlignmentMode>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #33  <Method int Parcel.readInt()>
		//*  10   18:ifeq            26
				flag = true;
		//   11   21:iconst_1        
		//   12   22:istore_3        
			else
		//*  13   23:goto            28
				flag = false;
		//   14   26:iconst_0        
		//   15   27:istore_3        
			fabAttached = flag;
		//   16   28:aload_0         
		//   17   29:iload_3         
		//   18   30:putfield        #37  <Field boolean fabAttached>
		//   19   33:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #40  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	private void addFabAnimationListeners(FloatingActionButton floatingactionbutton)
	{
		removeFabAnimationListeners(floatingactionbutton);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void removeFabAnimationListeners(FloatingActionButton)>
		floatingactionbutton.addOnHideAnimationListener(((android.animation.Animator.AnimatorListener) (fabAnimationListener)));
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #100 <Field AnimatorListenerAdapter fabAnimationListener>
	//    6   10:invokevirtual   #106 <Method void FloatingActionButton.addOnHideAnimationListener(android.animation.Animator$AnimatorListener)>
		floatingactionbutton.addOnShowAnimationListener(((android.animation.Animator.AnimatorListener) (fabAnimationListener)));
	//    7   13:aload_1         
	//    8   14:aload_0         
	//    9   15:getfield        #100 <Field AnimatorListenerAdapter fabAnimationListener>
	//   10   18:invokevirtual   #109 <Method void FloatingActionButton.addOnShowAnimationListener(android.animation.Animator$AnimatorListener)>
	//   11   21:return          
	}

	private void cancelAnimations()
	{
		Animator animator = attachAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Animator attachAnimator>
	//    2    4:astore_1        
		if(animator != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			animator.cancel();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #118 <Method void Animator.cancel()>
		animator = menuAnimator;
	//    7   13:aload_0         
	//    8   14:getfield        #88  <Field Animator menuAnimator>
	//    9   17:astore_1        
		if(animator != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          26
			animator.cancel();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #118 <Method void Animator.cancel()>
		animator = modeAnimator;
	//   14   26:aload_0         
	//   15   27:getfield        #46  <Field Animator modeAnimator>
	//   16   30:astore_1        
		if(animator != null)
	//*  17   31:aload_1         
	//*  18   32:ifnull          39
			animator.cancel();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #118 <Method void Animator.cancel()>
	//   21   39:return          
	}

	private void createCradleTranslationAnimation(int i, List list)
	{
		if(!fabAttached)
	//*   0    0:aload_0         
	//*   1    1:getfield        #122 <Field boolean fabAttached>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			ValueAnimator valueanimator = ValueAnimator.ofFloat(new float[] {
				topEdgeTreatment.getHorizontalOffset(), (float)getFabTranslationX(i)
			});
	//    4    8:iconst_2        
	//    5    9:newarray        float[]
	//    6   11:dup             
	//    7   12:iconst_0        
	//    8   13:aload_0         
	//    9   14:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//   10   17:invokevirtual   #127 <Method float BottomAppBarTopEdgeTreatment.getHorizontalOffset()>
	//   11   20:fastore         
	//   12   21:dup             
	//   13   22:iconst_1        
	//   14   23:aload_0         
	//   15   24:iload_1         
	//   16   25:invokespecial   #131 <Method int getFabTranslationX(int)>
	//   17   28:i2f             
	//   18   29:fastore         
	//   19   30:invokestatic    #137 <Method ValueAnimator ValueAnimator.ofFloat(float[])>
	//   20   33:astore_3        
			valueanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator1)
				{
					topEdgeTreatment.setHorizontalOffset(((Float)valueanimator1.getAnimatedValue()).floatValue());
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field BottomAppBar this$0>
				//    2    4:invokestatic    #27  <Method BottomAppBarTopEdgeTreatment BottomAppBar.access$100(BottomAppBar)>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
				//    5   11:checkcast       #35  <Class Float>
				//    6   14:invokevirtual   #39  <Method float Float.floatValue()>
				//    7   17:invokevirtual   #45  <Method void BottomAppBarTopEdgeTreatment.setHorizontalOffset(float)>
					materialShapeDrawable.invalidateSelf();
				//    8   20:aload_0         
				//    9   21:getfield        #17  <Field BottomAppBar this$0>
				//   10   24:invokestatic    #49  <Method MaterialShapeDrawable BottomAppBar.access$200(BottomAppBar)>
				//   11   27:invokevirtual   #54  <Method void MaterialShapeDrawable.invalidateSelf()>
				//   12   30:return          
				}

				final BottomAppBar this$0;

			
			{
				this$0 = BottomAppBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BottomAppBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   21   34:aload_3         
	//   22   35:new             #10  <Class BottomAppBar$2>
	//   23   38:dup             
	//   24   39:aload_0         
	//   25   40:invokespecial   #140 <Method void BottomAppBar$2(BottomAppBar)>
	//   26   43:invokevirtual   #144 <Method void ValueAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			valueanimator.setDuration(300L);
	//   27   46:aload_3         
	//   28   47:ldc2w           #145 <Long 300L>
	//   29   50:invokevirtual   #150 <Method ValueAnimator ValueAnimator.setDuration(long)>
	//   30   53:pop             
			list.add(((Object) (valueanimator)));
	//   31   54:aload_2         
	//   32   55:aload_3         
	//   33   56:invokeinterface #156 <Method boolean List.add(Object)>
	//   34   61:pop             
			return;
	//   35   62:return          
		}
	}

	private void createFabTranslationXAnimation(int i, List list)
	{
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (findDependentFab())), "translationX", new float[] {
			(float)getFabTranslationX(i)
		});
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method FloatingActionButton findDependentFab()>
	//    2    4:ldc1            #161 <String "translationX">
	//    3    6:iconst_1        
	//    4    7:newarray        float[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokespecial   #131 <Method int getFabTranslationX(int)>
	//   10   16:i2f             
	//   11   17:fastore         
	//   12   18:invokestatic    #166 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   13   21:astore_3        
		objectanimator.setDuration(300L);
	//   14   22:aload_3         
	//   15   23:ldc2w           #145 <Long 300L>
	//   16   26:invokevirtual   #169 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   17   29:pop             
		list.add(((Object) (objectanimator)));
	//   18   30:aload_2         
	//   19   31:aload_3         
	//   20   32:invokeinterface #156 <Method boolean List.add(Object)>
	//   21   37:pop             
	//   22   38:return          
	}

	private void createMenuViewTranslationAnimation(final int targetMode, final boolean targetAttached, List list)
	{
		final ActionMenuView actionMenuView = getActionMenuView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #175 <Method ActionMenuView getActionMenuView()>
	//    2    4:astore          6
		if(actionMenuView == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (actionMenuView)), "alpha", new float[] {
			1.0F
		});
	//    6   12:aload           6
	//    7   14:ldc1            #177 <String "alpha">
	//    8   16:iconst_1        
	//    9   17:newarray        float[]
	//   10   19:dup             
	//   11   20:iconst_0        
	//   12   21:fconst_1        
	//   13   22:fastore         
	//   14   23:invokestatic    #166 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   15   26:astore          4
		if(!fabAttached && (!targetAttached || !isVisibleFab()) || fabAlignmentMode != 1 && targetMode != 1)
	//*  16   28:aload_0         
	//*  17   29:getfield        #122 <Field boolean fabAttached>
	//*  18   32:ifne            46
	//*  19   35:iload_2         
	//*  20   36:ifeq            62
	//*  21   39:aload_0         
	//*  22   40:invokespecial   #180 <Method boolean isVisibleFab()>
	//*  23   43:ifeq            62
	//*  24   46:aload_0         
	//*  25   47:getfield        #182 <Field int fabAlignmentMode>
	//*  26   50:iconst_1        
	//*  27   51:icmpeq          82
	//*  28   54:iload_1         
	//*  29   55:iconst_1        
	//*  30   56:icmpne          62
	//*  31   59:goto            82
		{
			if(actionMenuView.getAlpha() < 1.0F)
	//*  32   62:aload           6
	//*  33   64:invokevirtual   #187 <Method float ActionMenuView.getAlpha()>
	//*  34   67:fconst_1        
	//*  35   68:fcmpg           
	//*  36   69:ifge            161
			{
				list.add(((Object) (objectanimator)));
	//   37   72:aload_3         
	//   38   73:aload           4
	//   39   75:invokeinterface #156 <Method boolean List.add(Object)>
	//   40   80:pop             
				return;
	//   41   81:return          
			}
		} else
		{
			ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(((Object) (actionMenuView)), "alpha", new float[] {
				0.0F
			});
	//   42   82:aload           6
	//   43   84:ldc1            #177 <String "alpha">
	//   44   86:iconst_1        
	//   45   87:newarray        float[]
	//   46   89:dup             
	//   47   90:iconst_0        
	//   48   91:fconst_0        
	//   49   92:fastore         
	//   50   93:invokestatic    #166 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   51   96:astore          5
			((Animator) (objectanimator1)).addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationCancel(Animator animator)
				{
					cancelled = true;
				//    0    0:aload_0         
				//    1    1:iconst_1        
				//    2    2:putfield        #36  <Field boolean cancelled>
				//    3    5:return          
				}

				public void onAnimationEnd(Animator animator)
				{
					if(!cancelled)
				//*   0    0:aload_0         
				//*   1    1:getfield        #36  <Field boolean cancelled>
				//*   2    4:ifne            26
						translateActionMenuView(actionMenuView, targetMode, targetAttached);
				//    3    7:aload_0         
				//    4    8:getfield        #22  <Field BottomAppBar this$0>
				//    5   11:aload_0         
				//    6   12:getfield        #24  <Field ActionMenuView val$actionMenuView>
				//    7   15:aload_0         
				//    8   16:getfield        #26  <Field int val$targetMode>
				//    9   19:aload_0         
				//   10   20:getfield        #28  <Field boolean val$targetAttached>
				//   11   23:invokestatic    #40  <Method void BottomAppBar.access$400(BottomAppBar, ActionMenuView, int, boolean)>
				//   12   26:return          
				}

				public boolean cancelled;
				final BottomAppBar this$0;
				final ActionMenuView val$actionMenuView;
				final boolean val$targetAttached;
				final int val$targetMode;

			
			{
				this$0 = BottomAppBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field BottomAppBar this$0>
				actionMenuView = actionmenuview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field ActionMenuView val$actionMenuView>
				targetMode = i;
			//    6   10:aload_0         
			//    7   11:iload_3         
			//    8   12:putfield        #26  <Field int val$targetMode>
				targetAttached = flag;
			//    9   15:aload_0         
			//   10   16:iload           4
			//   11   18:putfield        #28  <Field boolean val$targetAttached>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void AnimatorListenerAdapter()>
			//   14   25:return          
			}
			}
)));
	//   52   98:aload           5
	//   53  100:new             #14  <Class BottomAppBar$4>
	//   54  103:dup             
	//   55  104:aload_0         
	//   56  105:aload           6
	//   57  107:iload_1         
	//   58  108:iload_2         
	//   59  109:invokespecial   #189 <Method void BottomAppBar$4(BottomAppBar, ActionMenuView, int, boolean)>
	//   60  112:invokevirtual   #192 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			actionMenuView = ((ActionMenuView) (new AnimatorSet()));
	//   61  115:new             #194 <Class AnimatorSet>
	//   62  118:dup             
	//   63  119:invokespecial   #196 <Method void AnimatorSet()>
	//   64  122:astore          6
			((AnimatorSet) (actionMenuView)).setDuration(150L);
	//   65  124:aload           6
	//   66  126:ldc2w           #197 <Long 150L>
	//   67  129:invokevirtual   #201 <Method AnimatorSet AnimatorSet.setDuration(long)>
	//   68  132:pop             
			((AnimatorSet) (actionMenuView)).playSequentially(new Animator[] {
				objectanimator1, objectanimator
			});
	//   69  133:aload           6
	//   70  135:iconst_2        
	//   71  136:anewarray       Animator[]
	//   72  139:dup             
	//   73  140:iconst_0        
	//   74  141:aload           5
	//   75  143:aastore         
	//   76  144:dup             
	//   77  145:iconst_1        
	//   78  146:aload           4
	//   79  148:aastore         
	//   80  149:invokevirtual   #205 <Method void AnimatorSet.playSequentially(Animator[])>
			list.add(((Object) (actionMenuView)));
	//   81  152:aload_3         
	//   82  153:aload           6
	//   83  155:invokeinterface #156 <Method boolean List.add(Object)>
	//   84  160:pop             
		}
	//   85  161:return          
	}

	private FloatingActionButton findDependentFab()
	{
		if(!(getParent() instanceof CoordinatorLayout))
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #210 <Method android.view.ViewParent getParent()>
	//*   2    4:instanceof      #212 <Class CoordinatorLayout>
	//*   3    7:ifne            12
			return null;
	//    4   10:aconst_null     
	//    5   11:areturn         
		for(Iterator iterator = ((CoordinatorLayout)getParent()).getDependents(((View) (this))).iterator(); iterator.hasNext();)
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #210 <Method android.view.ViewParent getParent()>
	//*   8   16:checkcast       #212 <Class CoordinatorLayout>
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #216 <Method List CoordinatorLayout.getDependents(View)>
	//*  11   23:invokeinterface #220 <Method Iterator List.iterator()>
	//*  12   28:astore_1        
	//*  13   29:aload_1         
	//*  14   30:invokeinterface #225 <Method boolean Iterator.hasNext()>
	//*  15   35:ifeq            60
		{
			View view = (View)iterator.next();
	//   16   38:aload_1         
	//   17   39:invokeinterface #229 <Method Object Iterator.next()>
	//   18   44:checkcast       #231 <Class View>
	//   19   47:astore_2        
			if(view instanceof FloatingActionButton)
	//*  20   48:aload_2         
	//*  21   49:instanceof      #102 <Class FloatingActionButton>
	//*  22   52:ifeq            29
				return (FloatingActionButton)view;
	//   23   55:aload_2         
	//   24   56:checkcast       #102 <Class FloatingActionButton>
	//   25   59:areturn         
		}

		return null;
	//   26   60:aconst_null     
	//   27   61:areturn         
	}

	private ActionMenuView getActionMenuView()
	{
		for(int i = 0; i < getChildCount(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:aload_0         
	//*   4    4:invokevirtual   #236 <Method int getChildCount()>
	//*   5    7:icmpge          35
		{
			View view = getChildAt(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:invokevirtual   #240 <Method View getChildAt(int)>
	//    9   15:astore_2        
			if(view instanceof ActionMenuView)
	//*  10   16:aload_2         
	//*  11   17:instanceof      #184 <Class ActionMenuView>
	//*  12   20:ifeq            28
				return (ActionMenuView)view;
	//   13   23:aload_2         
	//   14   24:checkcast       #184 <Class ActionMenuView>
	//   15   27:areturn         
		}

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            2
		return null;
	//   21   35:aconst_null     
	//   22   36:areturn         
	}

	private float getFabTranslationX()
	{
		return (float)getFabTranslationX(fabAlignmentMode);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #182 <Field int fabAlignmentMode>
	//    3    5:invokespecial   #131 <Method int getFabTranslationX(int)>
	//    4    8:i2f             
	//    5    9:freturn         
	}

	private int getFabTranslationX(int i)
	{
		int j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #246 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_2        
		int k = 0;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		boolean flag1 = true;
	//    5    7:iconst_1        
	//    6    8:istore          4
		boolean flag;
		if(j == 1)
	//*   7   10:iload_2         
	//*   8   11:iconst_1        
	//*   9   12:icmpne          20
			flag = true;
	//   10   15:iconst_1        
	//   11   16:istore_2        
		else
	//*  12   17:goto            22
			flag = false;
	//   13   20:iconst_0        
	//   14   21:istore_2        
		if(i == 1)
	//*  15   22:iload_1         
	//*  16   23:iconst_1        
	//*  17   24:icmpne          56
		{
			k = getMeasuredWidth() / 2;
	//   18   27:aload_0         
	//   19   28:invokevirtual   #249 <Method int getMeasuredWidth()>
	//   20   31:iconst_2        
	//   21   32:idiv            
	//   22   33:istore_3        
			int l = fabOffsetEndMode;
	//   23   34:aload_0         
	//   24   35:getfield        #251 <Field int fabOffsetEndMode>
	//   25   38:istore          5
			i = ((int) (flag1));
	//   26   40:iload           4
	//   27   42:istore_1        
			if(flag)
	//*  28   43:iload_2         
	//*  29   44:ifeq            49
				i = -1;
	//   30   47:iconst_m1       
	//   31   48:istore_1        
			k = (k - l) * i;
	//   32   49:iload_3         
	//   33   50:iload           5
	//   34   52:isub            
	//   35   53:iload_1         
	//   36   54:imul            
	//   37   55:istore_3        
		}
		return k;
	//   38   56:iload_3         
	//   39   57:ireturn         
	}

	private float getFabTranslationY()
	{
		return getFabTranslationY(fabAttached);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #122 <Field boolean fabAttached>
	//    3    5:invokespecial   #254 <Method float getFabTranslationY(boolean)>
	//    4    8:freturn         
	}

	private float getFabTranslationY(boolean flag)
	{
		FloatingActionButton floatingactionbutton = findDependentFab();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method FloatingActionButton findDependentFab()>
	//    2    4:astore          7
		if(floatingactionbutton == null)
	//*   3    6:aload           7
	//*   4    8:ifnonnull       13
			return 0.0F;
	//    5   11:fconst_0        
	//    6   12:freturn         
		Rect rect = new Rect();
	//    7   13:new             #256 <Class Rect>
	//    8   16:dup             
	//    9   17:invokespecial   #257 <Method void Rect()>
	//   10   20:astore          8
		floatingactionbutton.getContentRect(rect);
	//   11   22:aload           7
	//   12   24:aload           8
	//   13   26:invokevirtual   #261 <Method boolean FloatingActionButton.getContentRect(Rect)>
	//   14   29:pop             
		float f1 = rect.height();
	//   15   30:aload           8
	//   16   32:invokevirtual   #264 <Method int Rect.height()>
	//   17   35:i2f             
	//   18   36:fstore_3        
		float f = f1;
	//   19   37:fload_3         
	//   20   38:fstore_2        
		if(f1 == 0.0F)
	//*  21   39:fload_3         
	//*  22   40:fconst_0        
	//*  23   41:fcmpl           
	//*  24   42:ifne            52
			f = floatingactionbutton.getMeasuredHeight();
	//   25   45:aload           7
	//   26   47:invokevirtual   #267 <Method int FloatingActionButton.getMeasuredHeight()>
	//   27   50:i2f             
	//   28   51:fstore_2        
		f1 = floatingactionbutton.getHeight() - rect.bottom;
	//   29   52:aload           7
	//   30   54:invokevirtual   #270 <Method int FloatingActionButton.getHeight()>
	//   31   57:aload           8
	//   32   59:getfield        #273 <Field int Rect.bottom>
	//   33   62:isub            
	//   34   63:i2f             
	//   35   64:fstore_3        
		float f4 = floatingactionbutton.getHeight() - rect.height();
	//   36   65:aload           7
	//   37   67:invokevirtual   #270 <Method int FloatingActionButton.getHeight()>
	//   38   70:aload           8
	//   39   72:invokevirtual   #264 <Method int Rect.height()>
	//   40   75:isub            
	//   41   76:i2f             
	//   42   77:fstore          6
		float f2 = -getCradleVerticalOffset();
	//   43   79:aload_0         
	//   44   80:invokevirtual   #276 <Method float getCradleVerticalOffset()>
	//   45   83:fneg            
	//   46   84:fstore          4
		float f3 = f / 2.0F;
	//   47   86:fload_2         
	//   48   87:fconst_2        
	//   49   88:fdiv            
	//   50   89:fstore          5
		f = f4 - (float)floatingactionbutton.getPaddingBottom();
	//   51   91:fload           6
	//   52   93:aload           7
	//   53   95:invokevirtual   #279 <Method int FloatingActionButton.getPaddingBottom()>
	//   54   98:i2f             
	//   55   99:fsub            
	//   56  100:fstore_2        
		f4 = -getMeasuredHeight();
	//   57  101:aload_0         
	//   58  102:invokevirtual   #280 <Method int getMeasuredHeight()>
	//   59  105:ineg            
	//   60  106:i2f             
	//   61  107:fstore          6
		if(flag)
	//*  62  109:iload_1         
	//*  63  110:ifeq            121
			f = f2 + f3 + f1;
	//   64  113:fload           4
	//   65  115:fload           5
	//   66  117:fadd            
	//   67  118:fload_3         
	//   68  119:fadd            
	//   69  120:fstore_2        
		return f4 + f;
	//   70  121:fload           6
	//   71  123:fload_2         
	//   72  124:fadd            
	//   73  125:freturn         
	}

	private boolean isAnimationRunning()
	{
label0:
		{
			Animator animator = attachAnimator;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field Animator attachAnimator>
	//    2    4:astore_1        
			if(animator == null || !animator.isRunning())
	//*   3    5:aload_1         
	//*   4    6:ifnull          16
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #283 <Method boolean Animator.isRunning()>
	//*   7   13:ifne            48
			{
				Animator animator1 = menuAnimator;
	//    8   16:aload_0         
	//    9   17:getfield        #88  <Field Animator menuAnimator>
	//   10   20:astore_1        
				if(animator1 == null || !animator1.isRunning())
	//*  11   21:aload_1         
	//*  12   22:ifnull          32
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #283 <Method boolean Animator.isRunning()>
	//*  15   29:ifne            48
				{
					Animator animator2 = modeAnimator;
	//   16   32:aload_0         
	//   17   33:getfield        #46  <Field Animator modeAnimator>
	//   18   36:astore_1        
					if(animator2 == null || !animator2.isRunning())
						break label0;
	//   19   37:aload_1         
	//   20   38:ifnull          50
	//   21   41:aload_1         
	//   22   42:invokevirtual   #283 <Method boolean Animator.isRunning()>
	//   23   45:ifeq            50
				}
			}
			return true;
	//   24   48:iconst_1        
	//   25   49:ireturn         
		}
		return false;
	//   26   50:iconst_0        
	//   27   51:ireturn         
	}

	private boolean isVisibleFab()
	{
		FloatingActionButton floatingactionbutton = findDependentFab();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method FloatingActionButton findDependentFab()>
	//    2    4:astore_1        
		return floatingactionbutton != null && floatingactionbutton.isOrWillBeShown();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #286 <Method boolean FloatingActionButton.isOrWillBeShown()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private void maybeAnimateMenuView(int i, boolean flag)
	{
		if(!ViewCompat.isLaidOut(((View) (this))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #292 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj = ((Object) (menuAnimator));
	//    4    8:aload_0         
	//    5    9:getfield        #88  <Field Animator menuAnimator>
	//    6   12:astore_3        
		if(obj != null)
	//*   7   13:aload_3         
	//*   8   14:ifnull          21
			((Animator) (obj)).cancel();
	//    9   17:aload_3         
	//   10   18:invokevirtual   #118 <Method void Animator.cancel()>
		obj = ((Object) (new ArrayList()));
	//   11   21:new             #294 <Class ArrayList>
	//   12   24:dup             
	//   13   25:invokespecial   #295 <Method void ArrayList()>
	//   14   28:astore_3        
		if(!isVisibleFab())
	//*  15   29:aload_0         
	//*  16   30:invokespecial   #180 <Method boolean isVisibleFab()>
	//*  17   33:ifne            40
		{
			i = 0;
	//   18   36:iconst_0        
	//   19   37:istore_1        
			flag = false;
	//   20   38:iconst_0        
	//   21   39:istore_2        
		}
		createMenuViewTranslationAnimation(i, flag, ((List) (obj)));
	//   22   40:aload_0         
	//   23   41:iload_1         
	//   24   42:iload_2         
	//   25   43:aload_3         
	//   26   44:invokespecial   #297 <Method void createMenuViewTranslationAnimation(int, boolean, List)>
		AnimatorSet animatorset = new AnimatorSet();
	//   27   47:new             #194 <Class AnimatorSet>
	//   28   50:dup             
	//   29   51:invokespecial   #196 <Method void AnimatorSet()>
	//   30   54:astore          4
		animatorset.playTogether(((java.util.Collection) (obj)));
	//   31   56:aload           4
	//   32   58:aload_3         
	//   33   59:invokevirtual   #301 <Method void AnimatorSet.playTogether(java.util.Collection)>
		menuAnimator = ((Animator) (animatorset));
	//   34   62:aload_0         
	//   35   63:aload           4
	//   36   65:putfield        #88  <Field Animator menuAnimator>
		menuAnimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator)
			{
				menuAnimator = null;
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field BottomAppBar this$0>
			//    2    4:aconst_null     
			//    3    5:invokestatic    #25  <Method Animator BottomAppBar.access$302(BottomAppBar, Animator)>
			//    4    8:pop             
			//    5    9:return          
			}

			final BottomAppBar this$0;

			
			{
				this$0 = BottomAppBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BottomAppBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
		}
)));
	//   37   68:aload_0         
	//   38   69:getfield        #88  <Field Animator menuAnimator>
	//   39   72:new             #12  <Class BottomAppBar$3>
	//   40   75:dup             
	//   41   76:aload_0         
	//   42   77:invokespecial   #302 <Method void BottomAppBar$3(BottomAppBar)>
	//   43   80:invokevirtual   #192 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
		menuAnimator.start();
	//   44   83:aload_0         
	//   45   84:getfield        #88  <Field Animator menuAnimator>
	//   46   87:invokevirtual   #305 <Method void Animator.start()>
	//   47   90:return          
	}

	private void maybeAnimateModeChange(int i)
	{
		if(fabAlignmentMode != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #182 <Field int fabAlignmentMode>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          90
		{
			if(!ViewCompat.isLaidOut(((View) (this))))
	//*   4    8:aload_0         
	//*   5    9:invokestatic    #292 <Method boolean ViewCompat.isLaidOut(View)>
	//*   6   12:ifne            16
				return;
	//    7   15:return          
			Object obj = ((Object) (modeAnimator));
	//    8   16:aload_0         
	//    9   17:getfield        #46  <Field Animator modeAnimator>
	//   10   20:astore_2        
			if(obj != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          29
				((Animator) (obj)).cancel();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #118 <Method void Animator.cancel()>
			obj = ((Object) (new ArrayList()));
	//   15   29:new             #294 <Class ArrayList>
	//   16   32:dup             
	//   17   33:invokespecial   #295 <Method void ArrayList()>
	//   18   36:astore_2        
			createCradleTranslationAnimation(i, ((List) (obj)));
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:aload_2         
	//   22   40:invokespecial   #309 <Method void createCradleTranslationAnimation(int, List)>
			createFabTranslationXAnimation(i, ((List) (obj)));
	//   23   43:aload_0         
	//   24   44:iload_1         
	//   25   45:aload_2         
	//   26   46:invokespecial   #311 <Method void createFabTranslationXAnimation(int, List)>
			AnimatorSet animatorset = new AnimatorSet();
	//   27   49:new             #194 <Class AnimatorSet>
	//   28   52:dup             
	//   29   53:invokespecial   #196 <Method void AnimatorSet()>
	//   30   56:astore_3        
			animatorset.playTogether(((java.util.Collection) (obj)));
	//   31   57:aload_3         
	//   32   58:aload_2         
	//   33   59:invokevirtual   #301 <Method void AnimatorSet.playTogether(java.util.Collection)>
			modeAnimator = ((Animator) (animatorset));
	//   34   62:aload_0         
	//   35   63:aload_3         
	//   36   64:putfield        #46  <Field Animator modeAnimator>
			modeAnimator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

				public void onAnimationEnd(Animator animator)
				{
					modeAnimator = null;
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field BottomAppBar this$0>
				//    2    4:aconst_null     
				//    3    5:invokestatic    #25  <Method Animator BottomAppBar.access$002(BottomAppBar, Animator)>
				//    4    8:pop             
				//    5    9:return          
				}

				final BottomAppBar this$0;

			
			{
				this$0 = BottomAppBar.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field BottomAppBar this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
			}
)));
	//   37   67:aload_0         
	//   38   68:getfield        #46  <Field Animator modeAnimator>
	//   39   71:new             #8   <Class BottomAppBar$1>
	//   40   74:dup             
	//   41   75:aload_0         
	//   42   76:invokespecial   #312 <Method void BottomAppBar$1(BottomAppBar)>
	//   43   79:invokevirtual   #192 <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
			modeAnimator.start();
	//   44   82:aload_0         
	//   45   83:getfield        #46  <Field Animator modeAnimator>
	//   46   86:invokevirtual   #305 <Method void Animator.start()>
			return;
	//   47   89:return          
		} else
		{
			return;
	//   48   90:return          
		}
	}

	private void removeFabAnimationListeners(FloatingActionButton floatingactionbutton)
	{
		floatingactionbutton.removeOnHideAnimationListener(((android.animation.Animator.AnimatorListener) (fabAnimationListener)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #100 <Field AnimatorListenerAdapter fabAnimationListener>
	//    3    5:invokevirtual   #315 <Method void FloatingActionButton.removeOnHideAnimationListener(android.animation.Animator$AnimatorListener)>
		floatingactionbutton.removeOnShowAnimationListener(((android.animation.Animator.AnimatorListener) (fabAnimationListener)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #100 <Field AnimatorListenerAdapter fabAnimationListener>
	//    7   13:invokevirtual   #318 <Method void FloatingActionButton.removeOnShowAnimationListener(android.animation.Animator$AnimatorListener)>
	//    8   16:return          
	}

	private void setCutoutState()
	{
		topEdgeTreatment.setHorizontalOffset(getFabTranslationX());
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    2    4:aload_0         
	//    3    5:invokespecial   #320 <Method float getFabTranslationX()>
	//    4    8:invokevirtual   #324 <Method void BottomAppBarTopEdgeTreatment.setHorizontalOffset(float)>
		Object obj = ((Object) (findDependentFab()));
	//    5   11:aload_0         
	//    6   12:invokespecial   #63  <Method FloatingActionButton findDependentFab()>
	//    7   15:astore_2        
		MaterialShapeDrawable materialshapedrawable = materialShapeDrawable;
	//    8   16:aload_0         
	//    9   17:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//   10   20:astore_3        
		float f;
		if(fabAttached && isVisibleFab())
	//*  11   21:aload_0         
	//*  12   22:getfield        #122 <Field boolean fabAttached>
	//*  13   25:ifeq            40
	//*  14   28:aload_0         
	//*  15   29:invokespecial   #180 <Method boolean isVisibleFab()>
	//*  16   32:ifeq            40
			f = 1.0F;
	//   17   35:fconst_1        
	//   18   36:fstore_1        
		else
	//*  19   37:goto            42
			f = 0.0F;
	//   20   40:fconst_0        
	//   21   41:fstore_1        
		materialshapedrawable.setInterpolation(f);
	//   22   42:aload_3         
	//   23   43:fload_1         
	//   24   44:invokevirtual   #329 <Method void MaterialShapeDrawable.setInterpolation(float)>
		if(obj != null)
	//*  25   47:aload_2         
	//*  26   48:ifnull          67
		{
			((FloatingActionButton) (obj)).setTranslationY(getFabTranslationY());
	//   27   51:aload_2         
	//   28   52:aload_0         
	//   29   53:invokespecial   #81  <Method float getFabTranslationY()>
	//   30   56:invokevirtual   #332 <Method void FloatingActionButton.setTranslationY(float)>
			((FloatingActionButton) (obj)).setTranslationX(getFabTranslationX());
	//   31   59:aload_2         
	//   32   60:aload_0         
	//   33   61:invokespecial   #320 <Method float getFabTranslationX()>
	//   34   64:invokevirtual   #335 <Method void FloatingActionButton.setTranslationX(float)>
		}
		obj = ((Object) (getActionMenuView()));
	//   35   67:aload_0         
	//   36   68:invokespecial   #175 <Method ActionMenuView getActionMenuView()>
	//   37   71:astore_2        
		if(obj != null)
	//*  38   72:aload_2         
	//*  39   73:ifnull          109
		{
			((ActionMenuView) (obj)).setAlpha(1.0F);
	//   40   76:aload_2         
	//   41   77:fconst_1        
	//   42   78:invokevirtual   #338 <Method void ActionMenuView.setAlpha(float)>
			if(!isVisibleFab())
	//*  43   81:aload_0         
	//*  44   82:invokespecial   #180 <Method boolean isVisibleFab()>
	//*  45   85:ifne            96
			{
				translateActionMenuView(((ActionMenuView) (obj)), 0, false);
	//   46   88:aload_0         
	//   47   89:aload_2         
	//   48   90:iconst_0        
	//   49   91:iconst_0        
	//   50   92:invokespecial   #94  <Method void translateActionMenuView(ActionMenuView, int, boolean)>
				return;
	//   51   95:return          
			}
			translateActionMenuView(((ActionMenuView) (obj)), fabAlignmentMode, fabAttached);
	//   52   96:aload_0         
	//   53   97:aload_2         
	//   54   98:aload_0         
	//   55   99:getfield        #182 <Field int fabAlignmentMode>
	//   56  102:aload_0         
	//   57  103:getfield        #122 <Field boolean fabAttached>
	//   58  106:invokespecial   #94  <Method void translateActionMenuView(ActionMenuView, int, boolean)>
		}
	//   59  109:return          
	}

	private void translateActionMenuView(ActionMenuView actionmenuview, int i, boolean flag)
	{
		boolean flag1;
		if(ViewCompat.getLayoutDirection(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #246 <Method int ViewCompat.getLayoutDirection(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
			flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore          5
		else
	//*   6   11:goto            17
			flag1 = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		int l = 0;
	//    9   17:iconst_0        
	//   10   18:istore          7
		int k;
		int i1;
		for(k = 0; l < getChildCount(); k = i1)
	//*  11   20:iconst_0        
	//*  12   21:istore          6
	//*  13   23:iload           7
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #236 <Method int getChildCount()>
	//*  16   29:icmpge          134
		{
			View view = getChildAt(l);
	//   17   32:aload_0         
	//   18   33:iload           7
	//   19   35:invokevirtual   #240 <Method View getChildAt(int)>
	//   20   38:astore          10
			boolean flag2;
			if((view.getLayoutParams() instanceof android.support.v7.widget.Toolbar.LayoutParams) && (((android.support.v7.widget.Toolbar.LayoutParams)view.getLayoutParams()).gravity & 0x800007) == 0x800003)
	//*  21   40:aload           10
	//*  22   42:invokevirtual   #342 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  23   45:instanceof      #344 <Class android.support.v7.widget.Toolbar$LayoutParams>
	//*  24   48:ifeq            78
	//*  25   51:aload           10
	//*  26   53:invokevirtual   #342 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  27   56:checkcast       #344 <Class android.support.v7.widget.Toolbar$LayoutParams>
	//*  28   59:getfield        #347 <Field int android.support.v7.widget.Toolbar$LayoutParams.gravity>
	//*  29   62:ldc2            #348 <Int 0x800007>
	//*  30   65:iand            
	//*  31   66:ldc2            #349 <Int 0x800003>
	//*  32   69:icmpne          78
				flag2 = true;
	//   33   72:iconst_1        
	//   34   73:istore          9
			else
	//*  35   75:goto            81
				flag2 = false;
	//   36   78:iconst_0        
	//   37   79:istore          9
			i1 = k;
	//   38   81:iload           6
	//   39   83:istore          8
			if(flag2)
	//*  40   85:iload           9
	//*  41   87:ifeq            121
			{
				if(flag1)
	//*  42   90:iload           5
	//*  43   92:ifeq            105
					i1 = view.getLeft();
	//   44   95:aload           10
	//   45   97:invokevirtual   #352 <Method int View.getLeft()>
	//   46  100:istore          8
				else
	//*  47  102:goto            112
					i1 = view.getRight();
	//   48  105:aload           10
	//   49  107:invokevirtual   #355 <Method int View.getRight()>
	//   50  110:istore          8
				i1 = Math.max(k, i1);
	//   51  112:iload           6
	//   52  114:iload           8
	//   53  116:invokestatic    #361 <Method int Math.max(int, int)>
	//   54  119:istore          8
			}
			l++;
	//   55  121:iload           7
	//   56  123:iconst_1        
	//   57  124:iadd            
	//   58  125:istore          7
		}

	//   59  127:iload           8
	//   60  129:istore          6
	//*  61  131:goto            23
		int j;
		if(flag1)
	//*  62  134:iload           5
	//*  63  136:ifeq            148
			j = actionmenuview.getRight();
	//   64  139:aload_1         
	//   65  140:invokevirtual   #362 <Method int ActionMenuView.getRight()>
	//   66  143:istore          5
		else
	//*  67  145:goto            154
			j = actionmenuview.getLeft();
	//   68  148:aload_1         
	//   69  149:invokevirtual   #363 <Method int ActionMenuView.getLeft()>
	//   70  152:istore          5
		float f;
		if(i == 1 && flag)
	//*  71  154:iload_2         
	//*  72  155:iconst_1        
	//*  73  156:icmpne          174
	//*  74  159:iload_3         
	//*  75  160:ifeq            174
			f = k - j;
	//   76  163:iload           6
	//   77  165:iload           5
	//   78  167:isub            
	//   79  168:i2f             
	//   80  169:fstore          4
		else
	//*  81  171:goto            177
			f = 0.0F;
	//   82  174:fconst_0        
	//   83  175:fstore          4
		actionmenuview.setTranslationX(f);
	//   84  177:aload_1         
	//   85  178:fload           4
	//   86  180:invokevirtual   #364 <Method void ActionMenuView.setTranslationX(float)>
	//   87  183:return          
	}

	public ColorStateList getBackgroundTint()
	{
		return materialShapeDrawable.getTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//    2    4:invokevirtual   #369 <Method ColorStateList MaterialShapeDrawable.getTintList()>
	//    3    7:areturn         
	}

	public android.support.design.widget.CoordinatorLayout.Behavior getBehavior()
	{
		return ((android.support.design.widget.CoordinatorLayout.Behavior) (new Behavior()));
	//    0    0:new             #16  <Class BottomAppBar$Behavior>
	//    1    3:dup             
	//    2    4:invokespecial   #372 <Method void BottomAppBar$Behavior()>
	//    3    7:areturn         
	}

	public float getCradleVerticalOffset()
	{
		return topEdgeTreatment.getCradleVerticalOffset();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    2    4:invokevirtual   #375 <Method float BottomAppBarTopEdgeTreatment.getCradleVerticalOffset()>
	//    3    7:freturn         
	}

	public int getFabAlignmentMode()
	{
		return fabAlignmentMode;
	//    0    0:aload_0         
	//    1    1:getfield        #182 <Field int fabAlignmentMode>
	//    2    4:ireturn         
	}

	public float getFabCradleMargin()
	{
		return topEdgeTreatment.getFabCradleMargin();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    2    4:invokevirtual   #379 <Method float BottomAppBarTopEdgeTreatment.getFabCradleMargin()>
	//    3    7:freturn         
	}

	public float getFabCradleRoundedCornerRadius()
	{
		return topEdgeTreatment.getFabCradleRoundedCornerRadius();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    2    4:invokevirtual   #382 <Method float BottomAppBarTopEdgeTreatment.getFabCradleRoundedCornerRadius()>
	//    3    7:freturn         
	}

	public boolean getHideOnScroll()
	{
		return hideOnScroll;
	//    0    0:aload_0         
	//    1    1:getfield        #385 <Field boolean hideOnScroll>
	//    2    4:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		super.onLayout(flag, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #389 <Method void Toolbar.onLayout(boolean, int, int, int, int)>
		cancelAnimations();
	//    7   11:aload_0         
	//    8   12:invokespecial   #391 <Method void cancelAnimations()>
		setCutoutState();
	//    9   15:aload_0         
	//   10   16:invokespecial   #75  <Method void setCutoutState()>
	//   11   19:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class BottomAppBar$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #395 <Method void Toolbar.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #22  <Class BottomAppBar$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #399 <Method Parcelable BottomAppBar$SavedState.getSuperState()>
	//   13   23:invokespecial   #395 <Method void Toolbar.onRestoreInstanceState(Parcelable)>
			fabAlignmentMode = ((SavedState) (parcelable)).fabAlignmentMode;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #400 <Field int BottomAppBar$SavedState.fabAlignmentMode>
	//   17   31:putfield        #182 <Field int fabAlignmentMode>
			fabAttached = ((SavedState) (parcelable)).fabAttached;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #401 <Field boolean BottomAppBar$SavedState.fabAttached>
	//   21   39:putfield        #122 <Field boolean fabAttached>
			return;
	//   22   42:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #22  <Class BottomAppBar$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #404 <Method Parcelable Toolbar.onSaveInstanceState()>
	//    4    8:invokespecial   #406 <Method void BottomAppBar$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.fabAlignmentMode = fabAlignmentMode;
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #182 <Field int fabAlignmentMode>
	//    9   17:putfield        #400 <Field int BottomAppBar$SavedState.fabAlignmentMode>
		savedstate.fabAttached = fabAttached;
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #122 <Field boolean fabAttached>
	//   13   25:putfield        #401 <Field boolean BottomAppBar$SavedState.fabAttached>
		return ((Parcelable) (savedstate));
	//   14   28:aload_1         
	//   15   29:areturn         
	}

	public void setBackgroundTint(ColorStateList colorstatelist)
	{
		DrawableCompat.setTintList(((android.graphics.drawable.Drawable) (materialShapeDrawable)), colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//    2    4:aload_1         
	//    3    5:invokestatic    #414 <Method void DrawableCompat.setTintList(android.graphics.drawable.Drawable, ColorStateList)>
	//    4    8:return          
	}

	public void setCradleVerticalOffset(float f)
	{
		if(f != getCradleVerticalOffset())
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #276 <Method float getCradleVerticalOffset()>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            24
		{
			topEdgeTreatment.setCradleVerticalOffset(f);
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    7   13:fload_1         
	//    8   14:invokevirtual   #417 <Method void BottomAppBarTopEdgeTreatment.setCradleVerticalOffset(float)>
			materialShapeDrawable.invalidateSelf();
	//    9   17:aload_0         
	//   10   18:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//   11   21:invokevirtual   #420 <Method void MaterialShapeDrawable.invalidateSelf()>
		}
	//   12   24:return          
	}

	public void setFabAlignmentMode(int i)
	{
		maybeAnimateModeChange(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #423 <Method void maybeAnimateModeChange(int)>
		maybeAnimateMenuView(i, fabAttached);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_0         
	//    6    8:getfield        #122 <Field boolean fabAttached>
	//    7   11:invokespecial   #425 <Method void maybeAnimateMenuView(int, boolean)>
		fabAlignmentMode = i;
	//    8   14:aload_0         
	//    9   15:iload_1         
	//   10   16:putfield        #182 <Field int fabAlignmentMode>
	//   11   19:return          
	}

	public void setFabCradleMargin(float f)
	{
		if(f != getFabCradleMargin())
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #427 <Method float getFabCradleMargin()>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            24
		{
			topEdgeTreatment.setFabCradleMargin(f);
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    7   13:fload_1         
	//    8   14:invokevirtual   #429 <Method void BottomAppBarTopEdgeTreatment.setFabCradleMargin(float)>
			materialShapeDrawable.invalidateSelf();
	//    9   17:aload_0         
	//   10   18:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//   11   21:invokevirtual   #420 <Method void MaterialShapeDrawable.invalidateSelf()>
		}
	//   12   24:return          
	}

	public void setFabCradleRoundedCornerRadius(float f)
	{
		if(f != getFabCradleRoundedCornerRadius())
	//*   0    0:fload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #431 <Method float getFabCradleRoundedCornerRadius()>
	//*   3    5:fcmpl           
	//*   4    6:ifeq            24
		{
			topEdgeTreatment.setFabCradleRoundedCornerRadius(f);
	//    5    9:aload_0         
	//    6   10:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    7   13:fload_1         
	//    8   14:invokevirtual   #433 <Method void BottomAppBarTopEdgeTreatment.setFabCradleRoundedCornerRadius(float)>
			materialShapeDrawable.invalidateSelf();
	//    9   17:aload_0         
	//   10   18:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//   11   21:invokevirtual   #420 <Method void MaterialShapeDrawable.invalidateSelf()>
		}
	//   12   24:return          
	}

	void setFabDiameter(int i)
	{
		float f = i;
	//    0    0:iload_1         
	//    1    1:i2f             
	//    2    2:fstore_2        
		if(f != topEdgeTreatment.getFabDiameter())
	//*   3    3:fload_2         
	//*   4    4:aload_0         
	//*   5    5:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//*   6    8:invokevirtual   #438 <Method float BottomAppBarTopEdgeTreatment.getFabDiameter()>
	//*   7   11:fcmpl           
	//*   8   12:ifeq            30
		{
			topEdgeTreatment.setFabDiameter(f);
	//    9   15:aload_0         
	//   10   16:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//   11   19:fload_2         
	//   12   20:invokevirtual   #440 <Method void BottomAppBarTopEdgeTreatment.setFabDiameter(float)>
			materialShapeDrawable.invalidateSelf();
	//   13   23:aload_0         
	//   14   24:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//   15   27:invokevirtual   #420 <Method void MaterialShapeDrawable.invalidateSelf()>
		}
	//   16   30:return          
	}

	public void setHideOnScroll(boolean flag)
	{
		hideOnScroll = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #385 <Field boolean hideOnScroll>
	//    3    5:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setTitle(CharSequence charsequence)
	{
	//    0    0:return          
	}

	private Animator attachAnimator;
	private int fabAlignmentMode;
	AnimatorListenerAdapter fabAnimationListener;
	private boolean fabAttached;
	private final int fabOffsetEndMode;
	private boolean hideOnScroll;
	private final MaterialShapeDrawable materialShapeDrawable;
	private Animator menuAnimator;
	private Animator modeAnimator;
	private final BottomAppBarTopEdgeTreatment topEdgeTreatment;


/*
	static Animator access$002(BottomAppBar bottomappbar, Animator animator)
	{
		bottomappbar.modeAnimator = animator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #46  <Field Animator modeAnimator>
		return animator;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static BottomAppBarTopEdgeTreatment access$100(BottomAppBar bottomappbar)
	{
		return bottomappbar.topEdgeTreatment;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field BottomAppBarTopEdgeTreatment topEdgeTreatment>
	//    2    4:areturn         
	}

*/


/*
	static void access$1000(BottomAppBar bottomappbar, FloatingActionButton floatingactionbutton)
	{
		bottomappbar.addFabAnimationListeners(floatingactionbutton);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #57  <Method void addFabAnimationListeners(FloatingActionButton)>
		return;
	//    3    5:return          
	}

*/


/*
	static FloatingActionButton access$1100(BottomAppBar bottomappbar)
	{
		return bottomappbar.findDependentFab();
	//    0    0:aload_0         
	//    1    1:invokespecial   #63  <Method FloatingActionButton findDependentFab()>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$1200(BottomAppBar bottomappbar)
	{
		return bottomappbar.isAnimationRunning();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method boolean isAnimationRunning()>
	//    2    4:ireturn         
	}

*/


/*
	static void access$1300(BottomAppBar bottomappbar)
	{
		bottomappbar.setCutoutState();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void setCutoutState()>
		return;
	//    2    4:return          
	}

*/


/*
	static float access$1400(BottomAppBar bottomappbar)
	{
		return bottomappbar.getFabTranslationY();
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method float getFabTranslationY()>
	//    2    4:freturn         
	}

*/


/*
	static MaterialShapeDrawable access$200(BottomAppBar bottomappbar)
	{
		return bottomappbar.materialShapeDrawable;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field MaterialShapeDrawable materialShapeDrawable>
	//    2    4:areturn         
	}

*/


/*
	static Animator access$302(BottomAppBar bottomappbar, Animator animator)
	{
		bottomappbar.menuAnimator = animator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field Animator menuAnimator>
		return animator;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static void access$400(BottomAppBar bottomappbar, ActionMenuView actionmenuview, int i, boolean flag)
	{
		bottomappbar.translateActionMenuView(actionmenuview, i, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #94  <Method void translateActionMenuView(ActionMenuView, int, boolean)>
		return;
	//    5    7:return          
	}

*/
}
