// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.*;
import android.text.TextUtils;
import android.util.*;
import android.view.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.*;
import o.*;

public class CoordinatorLayout extends ViewGroup
	implements NestedScrollingParent
{
	public static abstract class Behavior
	{

		public static Object getTag(View view)
		{
			return ((LayoutParams)view.getLayoutParams()).mBehaviorTag;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #22  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #24  <Class CoordinatorLayout$LayoutParams>
		//    3    7:getfield        #28  <Field Object CoordinatorLayout$LayoutParams.mBehaviorTag>
		//    4   10:areturn         
		}

		public static void setTag(View view, Object obj)
		{
			((LayoutParams)view.getLayoutParams()).mBehaviorTag = obj;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #22  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #24  <Class CoordinatorLayout$LayoutParams>
		//    3    7:aload_1         
		//    4    8:putfield        #28  <Field Object CoordinatorLayout$LayoutParams.mBehaviorTag>
		//    5   11:return          
		}

		public boolean blocksInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
		{
			return getScrimOpacity(coordinatorlayout, view) > 0.0F;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #36  <Method float getScrimOpacity(CoordinatorLayout, View)>
		//    4    6:fconst_0        
		//    5    7:fcmpl           
		//    6    8:ifle            13
		//    7   11:iconst_1        
		//    8   12:ireturn         
		//    9   13:iconst_0        
		//   10   14:ireturn         
		}

		public boolean getInsetDodgeRect(CoordinatorLayout coordinatorlayout, View view, Rect rect)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getScrimColor(CoordinatorLayout coordinatorlayout, View view)
		{
			return 0xff000000;
		//    0    0:ldc1            #47  <Int 0xff000000>
		//    1    2:ireturn         
		}

		public float getScrimOpacity(CoordinatorLayout coordinatorlayout, View view)
		{
			return 0.0F;
		//    0    0:fconst_0        
		//    1    1:freturn         
		}

		public boolean layoutDependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public WindowInsetsCompat onApplyWindowInsets(CoordinatorLayout coordinatorlayout, View view, WindowInsetsCompat windowinsetscompat)
		{
			return windowinsetscompat;
		//    0    0:aload_3         
		//    1    1:areturn         
		}

		public void onAttachedToLayoutParams(LayoutParams layoutparams)
		{
		//    0    0:return          
		}

		public boolean onDependentViewChanged(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onDependentViewRemoved(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
		//    0    0:return          
		}

		public void onDetachedFromLayoutParams()
		{
		//    0    0:return          
		}

		public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean onLayoutChild(CoordinatorLayout coordinatorlayout, View view, int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean onMeasureChild(CoordinatorLayout coordinatorlayout, View view, int i, int j, int k, int l)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean onNestedFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1, boolean flag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean onNestedPreFling(CoordinatorLayout coordinatorlayout, View view, View view1, float f, float f1)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[])
		{
		//    0    0:return          
		}

		public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
		{
		//    0    0:return          
		}

		public void onNestedScrollAccepted(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
		{
		//    0    0:return          
		}

		public boolean onRequestChildRectangleOnScreen(CoordinatorLayout coordinatorlayout, View view, Rect rect, boolean flag)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onRestoreInstanceState(CoordinatorLayout coordinatorlayout, View view, Parcelable parcelable)
		{
		//    0    0:return          
		}

		public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorlayout, View view)
		{
			return ((Parcelable) (android.view.View.BaseSavedState.EMPTY_STATE));
		//    0    0:getstatic       #108 <Field android.view.AbsSavedState android.view.View$BaseSavedState.EMPTY_STATE>
		//    1    3:areturn         
		}

		public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
		//    0    0:return          
		}

		public boolean onTouchEvent(CoordinatorLayout coordinatorlayout, View view, MotionEvent motionevent)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Behavior()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}

		public Behavior(Context context, AttributeSet attributeset)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}

	public static interface DefaultBehavior
		extends Annotation
	{

		public abstract Class value();
	}

	public static interface DispatchChangeEvent
		extends Annotation
	{
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		private void resolveAnchorView(View view, CoordinatorLayout coordinatorlayout)
		{
			mAnchorView = coordinatorlayout.findViewById(mAnchorId);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_0         
		//    3    3:getfield        #44  <Field int mAnchorId>
		//    4    6:invokevirtual   #139 <Method View CoordinatorLayout.findViewById(int)>
		//    5    9:putfield        #141 <Field View mAnchorView>
			if(mAnchorView != null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #141 <Field View mAnchorView>
		//*   8   16:ifnull          141
			{
				if(mAnchorView == coordinatorlayout)
		//*   9   19:aload_0         
		//*  10   20:getfield        #141 <Field View mAnchorView>
		//*  11   23:aload_2         
		//*  12   24:if_acmpne       55
					if(coordinatorlayout.isInEditMode())
		//*  13   27:aload_2         
		//*  14   28:invokevirtual   #145 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  15   31:ifeq            45
					{
						mAnchorDirectChild = null;
		//   16   34:aload_0         
		//   17   35:aconst_null     
		//   18   36:putfield        #147 <Field View mAnchorDirectChild>
						mAnchorView = null;
		//   19   39:aload_0         
		//   20   40:aconst_null     
		//   21   41:putfield        #141 <Field View mAnchorView>
						return;
		//   22   44:return          
					} else
					{
						throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
		//   23   45:new             #149 <Class IllegalStateException>
		//   24   48:dup             
		//   25   49:ldc1            #151 <String "View can not be anchored to the the parent CoordinatorLayout">
		//   26   51:invokespecial   #154 <Method void IllegalStateException(String)>
		//   27   54:athrow          
					}
				View view1 = mAnchorView;
		//   28   55:aload_0         
		//   29   56:getfield        #141 <Field View mAnchorView>
		//   30   59:astore          4
				for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
		//*  31   61:aload_0         
		//*  32   62:getfield        #141 <Field View mAnchorView>
		//*  33   65:invokevirtual   #160 <Method ViewParent View.getParent()>
		//*  34   68:astore_3        
		//*  35   69:aload_3         
		//*  36   70:aload_2         
		//*  37   71:if_acmpeq       134
		//*  38   74:aload_3         
		//*  39   75:ifnull          134
				{
					if(viewparent == view)
		//*  40   78:aload_3         
		//*  41   79:aload_1         
		//*  42   80:if_acmpne       111
						if(coordinatorlayout.isInEditMode())
		//*  43   83:aload_2         
		//*  44   84:invokevirtual   #145 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  45   87:ifeq            101
						{
							mAnchorDirectChild = null;
		//   46   90:aload_0         
		//   47   91:aconst_null     
		//   48   92:putfield        #147 <Field View mAnchorDirectChild>
							mAnchorView = null;
		//   49   95:aload_0         
		//   50   96:aconst_null     
		//   51   97:putfield        #141 <Field View mAnchorView>
							return;
		//   52  100:return          
						} else
						{
							throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
		//   53  101:new             #149 <Class IllegalStateException>
		//   54  104:dup             
		//   55  105:ldc1            #162 <String "Anchor must not be a descendant of the anchored view">
		//   56  107:invokespecial   #154 <Method void IllegalStateException(String)>
		//   57  110:athrow          
						}
					if(viewparent instanceof View)
		//*  58  111:aload_3         
		//*  59  112:instanceof      #156 <Class View>
		//*  60  115:ifeq            124
						view1 = (View)viewparent;
		//   61  118:aload_3         
		//   62  119:checkcast       #156 <Class View>
		//   63  122:astore          4
				}

		//   64  124:aload_3         
		//   65  125:invokeinterface #165 <Method ViewParent ViewParent.getParent()>
		//   66  130:astore_3        
		//*  67  131:goto            69
				mAnchorDirectChild = view1;
		//   68  134:aload_0         
		//   69  135:aload           4
		//   70  137:putfield        #147 <Field View mAnchorDirectChild>
				return;
		//   71  140:return          
			}
			if(coordinatorlayout.isInEditMode())
		//*  72  141:aload_2         
		//*  73  142:invokevirtual   #145 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  74  145:ifeq            159
			{
				mAnchorDirectChild = null;
		//   75  148:aload_0         
		//   76  149:aconst_null     
		//   77  150:putfield        #147 <Field View mAnchorDirectChild>
				mAnchorView = null;
		//   78  153:aload_0         
		//   79  154:aconst_null     
		//   80  155:putfield        #141 <Field View mAnchorView>
				return;
		//   81  158:return          
			} else
			{
				throw new IllegalStateException((new StringBuilder()).append("Could not find CoordinatorLayout descendant view with id ").append(coordinatorlayout.getResources().getResourceName(mAnchorId)).append(" to anchor view ").append(((Object) (view))).toString());
		//   82  159:new             #149 <Class IllegalStateException>
		//   83  162:dup             
		//   84  163:new             #167 <Class StringBuilder>
		//   85  166:dup             
		//   86  167:invokespecial   #168 <Method void StringBuilder()>
		//   87  170:ldc1            #170 <String "Could not find CoordinatorLayout descendant view with id ">
		//   88  172:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
		//   89  175:aload_2         
		//   90  176:invokevirtual   #178 <Method Resources CoordinatorLayout.getResources()>
		//   91  179:aload_0         
		//   92  180:getfield        #44  <Field int mAnchorId>
		//   93  183:invokevirtual   #183 <Method String Resources.getResourceName(int)>
		//   94  186:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
		//   95  189:ldc1            #185 <String " to anchor view ">
		//   96  191:invokevirtual   #174 <Method StringBuilder StringBuilder.append(String)>
		//   97  194:aload_1         
		//   98  195:invokevirtual   #188 <Method StringBuilder StringBuilder.append(Object)>
		//   99  198:invokevirtual   #192 <Method String StringBuilder.toString()>
		//  100  201:invokespecial   #154 <Method void IllegalStateException(String)>
		//  101  204:athrow          
			}
		}

		private boolean shouldDodge(View view, int i)
		{
			int j = GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).insetEdge, i);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #198 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #2   <Class CoordinatorLayout$LayoutParams>
		//    3    7:getfield        #46  <Field int insetEdge>
		//    4   10:iload_2         
		//    5   11:invokestatic    #203 <Method int GravityCompat.getAbsoluteGravity(int, int)>
		//    6   14:istore_3        
			return j != 0 && (GravityCompat.getAbsoluteGravity(dodgeInsetEdges, i) & j) == j;
		//    7   15:iload_3         
		//    8   16:ifeq            35
		//    9   19:aload_0         
		//   10   20:getfield        #48  <Field int dodgeInsetEdges>
		//   11   23:iload_2         
		//   12   24:invokestatic    #203 <Method int GravityCompat.getAbsoluteGravity(int, int)>
		//   13   27:iload_3         
		//   14   28:iand            
		//   15   29:iload_3         
		//   16   30:icmpne          35
		//   17   33:iconst_1        
		//   18   34:ireturn         
		//   19   35:iconst_0        
		//   20   36:ireturn         
		}

		private boolean verifyAnchorView(View view, CoordinatorLayout coordinatorlayout)
		{
			if(mAnchorView.getId() != mAnchorId)
		//*   0    0:aload_0         
		//*   1    1:getfield        #141 <Field View mAnchorView>
		//*   2    4:invokevirtual   #209 <Method int View.getId()>
		//*   3    7:aload_0         
		//*   4    8:getfield        #44  <Field int mAnchorId>
		//*   5   11:icmpeq          16
				return false;
		//    6   14:iconst_0        
		//    7   15:ireturn         
			View view1 = mAnchorView;
		//    8   16:aload_0         
		//    9   17:getfield        #141 <Field View mAnchorView>
		//   10   20:astore          4
			for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout; viewparent = viewparent.getParent())
		//*  11   22:aload_0         
		//*  12   23:getfield        #141 <Field View mAnchorView>
		//*  13   26:invokevirtual   #160 <Method ViewParent View.getParent()>
		//*  14   29:astore_3        
		//*  15   30:aload_3         
		//*  16   31:aload_2         
		//*  17   32:if_acmpeq       79
			{
				if(viewparent == null || viewparent == view)
		//*  18   35:aload_3         
		//*  19   36:ifnull          44
		//*  20   39:aload_3         
		//*  21   40:aload_1         
		//*  22   41:if_acmpne       56
				{
					mAnchorDirectChild = null;
		//   23   44:aload_0         
		//   24   45:aconst_null     
		//   25   46:putfield        #147 <Field View mAnchorDirectChild>
					mAnchorView = null;
		//   26   49:aload_0         
		//   27   50:aconst_null     
		//   28   51:putfield        #141 <Field View mAnchorView>
					return false;
		//   29   54:iconst_0        
		//   30   55:ireturn         
				}
				if(viewparent instanceof View)
		//*  31   56:aload_3         
		//*  32   57:instanceof      #156 <Class View>
		//*  33   60:ifeq            69
					view1 = (View)viewparent;
		//   34   63:aload_3         
		//   35   64:checkcast       #156 <Class View>
		//   36   67:astore          4
			}

		//   37   69:aload_3         
		//   38   70:invokeinterface #165 <Method ViewParent ViewParent.getParent()>
		//   39   75:astore_3        
		//*  40   76:goto            30
			mAnchorDirectChild = view1;
		//   41   79:aload_0         
		//   42   80:aload           4
		//   43   82:putfield        #147 <Field View mAnchorDirectChild>
			return true;
		//   44   85:iconst_1        
		//   45   86:ireturn         
		}

		void acceptNestedScroll(boolean flag)
		{
			mDidAcceptNestedScroll = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #213 <Field boolean mDidAcceptNestedScroll>
		//    3    5:return          
		}

		boolean checkAnchorChanged()
		{
			return mAnchorView == null && mAnchorId != -1;
		//    0    0:aload_0         
		//    1    1:getfield        #141 <Field View mAnchorView>
		//    2    4:ifnonnull       17
		//    3    7:aload_0         
		//    4    8:getfield        #44  <Field int mAnchorId>
		//    5   11:iconst_m1       
		//    6   12:icmpeq          17
		//    7   15:iconst_1        
		//    8   16:ireturn         
		//    9   17:iconst_0        
		//   10   18:ireturn         
		}

		boolean dependsOn(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
			return view1 == mAnchorDirectChild || shouldDodge(view1, ViewCompat.getLayoutDirection(((View) (coordinatorlayout)))) || mBehavior != null && mBehavior.layoutDependsOn(coordinatorlayout, view, view1);
		//    0    0:aload_3         
		//    1    1:aload_0         
		//    2    2:getfield        #147 <Field View mAnchorDirectChild>
		//    3    5:if_acmpeq       40
		//    4    8:aload_0         
		//    5    9:aload_3         
		//    6   10:aload_1         
		//    7   11:invokestatic    #222 <Method int ViewCompat.getLayoutDirection(View)>
		//    8   14:invokespecial   #224 <Method boolean shouldDodge(View, int)>
		//    9   17:ifne            40
		//   10   20:aload_0         
		//   11   21:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//   12   24:ifnull          42
		//   13   27:aload_0         
		//   14   28:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//   15   31:aload_1         
		//   16   32:aload_2         
		//   17   33:aload_3         
		//   18   34:invokevirtual   #227 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
		//   19   37:ifeq            42
		//   20   40:iconst_1        
		//   21   41:ireturn         
		//   22   42:iconst_0        
		//   23   43:ireturn         
		}

		boolean didBlockInteraction()
		{
			if(mBehavior == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//*   2    4:ifnonnull       12
				mDidBlockInteraction = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #230 <Field boolean mDidBlockInteraction>
			return mDidBlockInteraction;
		//    6   12:aload_0         
		//    7   13:getfield        #230 <Field boolean mDidBlockInteraction>
		//    8   16:ireturn         
		}

		View findAnchorView(CoordinatorLayout coordinatorlayout, View view)
		{
			if(mAnchorId == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #44  <Field int mAnchorId>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          20
			{
				mAnchorDirectChild = null;
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:putfield        #147 <Field View mAnchorDirectChild>
				mAnchorView = null;
		//    7   13:aload_0         
		//    8   14:aconst_null     
		//    9   15:putfield        #141 <Field View mAnchorView>
				return null;
		//   10   18:aconst_null     
		//   11   19:areturn         
			}
			if(mAnchorView == null || !verifyAnchorView(view, coordinatorlayout))
		//*  12   20:aload_0         
		//*  13   21:getfield        #141 <Field View mAnchorView>
		//*  14   24:ifnull          36
		//*  15   27:aload_0         
		//*  16   28:aload_2         
		//*  17   29:aload_1         
		//*  18   30:invokespecial   #234 <Method boolean verifyAnchorView(View, CoordinatorLayout)>
		//*  19   33:ifne            42
				resolveAnchorView(view, coordinatorlayout);
		//   20   36:aload_0         
		//   21   37:aload_2         
		//   22   38:aload_1         
		//   23   39:invokespecial   #236 <Method void resolveAnchorView(View, CoordinatorLayout)>
			return mAnchorView;
		//   24   42:aload_0         
		//   25   43:getfield        #141 <Field View mAnchorView>
		//   26   46:areturn         
		}

		public int getAnchorId()
		{
			return mAnchorId;
		//    0    0:aload_0         
		//    1    1:getfield        #44  <Field int mAnchorId>
		//    2    4:ireturn         
		}

		public Behavior getBehavior()
		{
			return mBehavior;
		//    0    0:aload_0         
		//    1    1:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//    2    4:areturn         
		}

		boolean getChangedAfterNestedScroll()
		{
			return mDidChangeAfterNestedScroll;
		//    0    0:aload_0         
		//    1    1:getfield        #245 <Field boolean mDidChangeAfterNestedScroll>
		//    2    4:ireturn         
		}

		Rect getLastChildRect()
		{
			return mLastChildRect;
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Rect mLastChildRect>
		//    2    4:areturn         
		}

		void invalidateAnchor()
		{
			mAnchorDirectChild = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #147 <Field View mAnchorDirectChild>
			mAnchorView = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #141 <Field View mAnchorView>
		//    6   10:return          
		}

		boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
		{
			if(mDidBlockInteraction)
		//*   0    0:aload_0         
		//*   1    1:getfield        #230 <Field boolean mDidBlockInteraction>
		//*   2    4:ifeq            9
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			boolean flag1 = mDidBlockInteraction;
		//    5    9:aload_0         
		//    6   10:getfield        #230 <Field boolean mDidBlockInteraction>
		//    7   13:istore          4
			boolean flag;
			if(mBehavior != null)
		//*   8   15:aload_0         
		//*   9   16:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//*  10   19:ifnull          35
				flag = mBehavior.blocksInteractionBelow(coordinatorlayout, view);
		//   11   22:aload_0         
		//   12   23:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:invokevirtual   #253 <Method boolean CoordinatorLayout$Behavior.blocksInteractionBelow(CoordinatorLayout, View)>
		//   16   31:istore_3        
			else
		//*  17   32:goto            37
				flag = false;
		//   18   35:iconst_0        
		//   19   36:istore_3        
			flag = flag1 | flag;
		//   20   37:iload           4
		//   21   39:iload_3         
		//   22   40:ior             
		//   23   41:istore_3        
			mDidBlockInteraction = flag;
		//   24   42:aload_0         
		//   25   43:iload_3         
		//   26   44:putfield        #230 <Field boolean mDidBlockInteraction>
			return flag;
		//   27   47:iload_3         
		//   28   48:ireturn         
		}

		boolean isNestedScrollAccepted()
		{
			return mDidAcceptNestedScroll;
		//    0    0:aload_0         
		//    1    1:getfield        #213 <Field boolean mDidAcceptNestedScroll>
		//    2    4:ireturn         
		}

		void resetChangedAfterNestedScroll()
		{
			mDidChangeAfterNestedScroll = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #245 <Field boolean mDidChangeAfterNestedScroll>
		//    3    5:return          
		}

		void resetNestedScroll()
		{
			mDidAcceptNestedScroll = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #213 <Field boolean mDidAcceptNestedScroll>
		//    3    5:return          
		}

		void resetTouchBehaviorTracking()
		{
			mDidBlockInteraction = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #230 <Field boolean mDidBlockInteraction>
		//    3    5:return          
		}

		public void setAnchorId(int i)
		{
			invalidateAnchor();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #261 <Method void invalidateAnchor()>
			mAnchorId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #44  <Field int mAnchorId>
		//    5    9:return          
		}

		public void setBehavior(Behavior behavior)
		{
			if(mBehavior != behavior)
		//*   0    0:aload_0         
		//*   1    1:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       46
			{
				if(mBehavior != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//*   6   12:ifnull          22
					mBehavior.onDetachedFromLayoutParams();
		//    7   15:aload_0         
		//    8   16:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//    9   19:invokevirtual   #267 <Method void CoordinatorLayout$Behavior.onDetachedFromLayoutParams()>
				mBehavior = behavior;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
				mBehaviorTag = null;
		//   13   27:aload_0         
		//   14   28:aconst_null     
		//   15   29:putfield        #269 <Field Object mBehaviorTag>
				mBehaviorResolved = true;
		//   16   32:aload_0         
		//   17   33:iconst_1        
		//   18   34:putfield        #36  <Field boolean mBehaviorResolved>
				if(behavior != null)
		//*  19   37:aload_1         
		//*  20   38:ifnull          46
					behavior.onAttachedToLayoutParams(this);
		//   21   41:aload_1         
		//   22   42:aload_0         
		//   23   43:invokevirtual   #127 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
			}
		//   24   46:return          
		}

		void setChangedAfterNestedScroll(boolean flag)
		{
			mDidChangeAfterNestedScroll = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #245 <Field boolean mDidChangeAfterNestedScroll>
		//    3    5:return          
		}

		void setLastChildRect(Rect rect)
		{
			mLastChildRect.set(rect);
		//    0    0:aload_0         
		//    1    1:getfield        #55  <Field Rect mLastChildRect>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #275 <Method void Rect.set(Rect)>
		//    4    8:return          
		}

		public int anchorGravity;
		public int dodgeInsetEdges;
		public int gravity;
		public int insetEdge;
		public int keyline;
		View mAnchorDirectChild;
		int mAnchorId;
		View mAnchorView;
		Behavior mBehavior;
		boolean mBehaviorResolved;
		Object mBehaviorTag;
		private boolean mDidAcceptNestedScroll;
		private boolean mDidBlockInteraction;
		private boolean mDidChangeAfterNestedScroll;
		int mInsetOffsetX;
		int mInsetOffsetY;
		final Rect mLastChildRect;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #34  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			mBehaviorResolved = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #36  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #38  <Field int gravity>
			anchorGravity = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #40  <Field int anchorGravity>
			keyline = -1;
		//   13   21:aload_0         
		//   14   22:iconst_m1       
		//   15   23:putfield        #42  <Field int keyline>
			mAnchorId = -1;
		//   16   26:aload_0         
		//   17   27:iconst_m1       
		//   18   28:putfield        #44  <Field int mAnchorId>
			insetEdge = 0;
		//   19   31:aload_0         
		//   20   32:iconst_0        
		//   21   33:putfield        #46  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   22   36:aload_0         
		//   23   37:iconst_0        
		//   24   38:putfield        #48  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   25   41:aload_0         
		//   26   42:new             #50  <Class Rect>
		//   27   45:dup             
		//   28   46:invokespecial   #53  <Method void Rect()>
		//   29   49:putfield        #55  <Field Rect mLastChildRect>
		//   30   52:return          
		}

		LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			mBehaviorResolved = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #36  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #38  <Field int gravity>
			anchorGravity = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #40  <Field int anchorGravity>
			keyline = -1;
		//   13   21:aload_0         
		//   14   22:iconst_m1       
		//   15   23:putfield        #42  <Field int keyline>
			mAnchorId = -1;
		//   16   26:aload_0         
		//   17   27:iconst_m1       
		//   18   28:putfield        #44  <Field int mAnchorId>
			insetEdge = 0;
		//   19   31:aload_0         
		//   20   32:iconst_0        
		//   21   33:putfield        #46  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   22   36:aload_0         
		//   23   37:iconst_0        
		//   24   38:putfield        #48  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   25   41:aload_0         
		//   26   42:new             #50  <Class Rect>
		//   27   45:dup             
		//   28   46:invokespecial   #53  <Method void Rect()>
		//   29   49:putfield        #55  <Field Rect mLastChildRect>
			TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CoordinatorLayout_Layout);
		//   30   52:aload_1         
		//   31   53:aload_2         
		//   32   54:getstatic       #65  <Field int[] android.support.design.R$styleable.CoordinatorLayout_Layout>
		//   33   57:invokevirtual   #71  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   34   60:astore_3        
			gravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
		//   35   61:aload_0         
		//   36   62:aload_3         
		//   37   63:getstatic       #74  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_android_layout_gravity>
		//   38   66:iconst_0        
		//   39   67:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
		//   40   70:putfield        #38  <Field int gravity>
			mAnchorId = typedarray.getResourceId(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
		//   41   73:aload_0         
		//   42   74:aload_3         
		//   43   75:getstatic       #83  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_anchor>
		//   44   78:iconst_m1       
		//   45   79:invokevirtual   #86  <Method int TypedArray.getResourceId(int, int)>
		//   46   82:putfield        #44  <Field int mAnchorId>
			anchorGravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
		//   47   85:aload_0         
		//   48   86:aload_3         
		//   49   87:getstatic       #89  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_anchorGravity>
		//   50   90:iconst_0        
		//   51   91:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
		//   52   94:putfield        #40  <Field int anchorGravity>
			keyline = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
		//   53   97:aload_0         
		//   54   98:aload_3         
		//   55   99:getstatic       #92  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_keyline>
		//   56  102:iconst_m1       
		//   57  103:invokevirtual   #80  <Method int TypedArray.getInteger(int, int)>
		//   58  106:putfield        #42  <Field int keyline>
			insetEdge = typedarray.getInt(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
		//   59  109:aload_0         
		//   60  110:aload_3         
		//   61  111:getstatic       #95  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_insetEdge>
		//   62  114:iconst_0        
		//   63  115:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
		//   64  118:putfield        #46  <Field int insetEdge>
			dodgeInsetEdges = typedarray.getInt(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
		//   65  121:aload_0         
		//   66  122:aload_3         
		//   67  123:getstatic       #101 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
		//   68  126:iconst_0        
		//   69  127:invokevirtual   #98  <Method int TypedArray.getInt(int, int)>
		//   70  130:putfield        #48  <Field int dodgeInsetEdges>
			mBehaviorResolved = typedarray.hasValue(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_behavior);
		//   71  133:aload_0         
		//   72  134:aload_3         
		//   73  135:getstatic       #104 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_behavior>
		//   74  138:invokevirtual   #108 <Method boolean TypedArray.hasValue(int)>
		//   75  141:putfield        #36  <Field boolean mBehaviorResolved>
			if(mBehaviorResolved)
		//*  76  144:aload_0         
		//*  77  145:getfield        #36  <Field boolean mBehaviorResolved>
		//*  78  148:ifeq            167
				mBehavior = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_behavior));
		//   79  151:aload_0         
		//   80  152:aload_1         
		//   81  153:aload_2         
		//   82  154:aload_3         
		//   83  155:getstatic       #104 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_behavior>
		//   84  158:invokevirtual   #112 <Method String TypedArray.getString(int)>
		//   85  161:invokestatic    #116 <Method CoordinatorLayout$Behavior CoordinatorLayout.parseBehavior(Context, AttributeSet, String)>
		//   86  164:putfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
			typedarray.recycle();
		//   87  167:aload_3         
		//   88  168:invokevirtual   #121 <Method void TypedArray.recycle()>
			if(mBehavior != null)
		//*  89  171:aload_0         
		//*  90  172:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//*  91  175:ifnull          186
				mBehavior.onAttachedToLayoutParams(this);
		//   92  178:aload_0         
		//   93  179:getfield        #118 <Field CoordinatorLayout$Behavior mBehavior>
		//   94  182:aload_0         
		//   95  183:invokevirtual   #127 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
		//   96  186:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #130 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mBehaviorResolved = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #36  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #38  <Field int gravity>
			anchorGravity = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #40  <Field int anchorGravity>
			keyline = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #42  <Field int keyline>
			mAnchorId = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #44  <Field int mAnchorId>
			insetEdge = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #46  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #48  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #50  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #53  <Method void Rect()>
		//   28   48:putfield        #55  <Field Rect mLastChildRect>
		//   29   51:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #133 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			mBehaviorResolved = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #36  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #38  <Field int gravity>
			anchorGravity = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #40  <Field int anchorGravity>
			keyline = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #42  <Field int keyline>
			mAnchorId = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #44  <Field int mAnchorId>
			insetEdge = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #46  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #48  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #50  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #53  <Method void Rect()>
		//   28   48:putfield        #55  <Field Rect mLastChildRect>
		//   29   51:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #130 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mBehaviorResolved = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #36  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #38  <Field int gravity>
			anchorGravity = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #40  <Field int anchorGravity>
			keyline = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #42  <Field int keyline>
			mAnchorId = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #44  <Field int mAnchorId>
			insetEdge = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #46  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #48  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #50  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #53  <Method void Rect()>
		//   28   48:putfield        #55  <Field Rect mLastChildRect>
		//   29   51:return          
		}
	}

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #64  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			int j;
			if(behaviorStates != null)
		//*   4    6:aload_0         
		//*   5    7:getfield        #53  <Field SparseArray behaviorStates>
		//*   6   10:ifnull          24
				j = behaviorStates.size();
		//    7   13:aload_0         
		//    8   14:getfield        #53  <Field SparseArray behaviorStates>
		//    9   17:invokevirtual   #67  <Method int SparseArray.size()>
		//   10   20:istore_3        
			else
		//*  11   21:goto            26
				j = 0;
		//   12   24:iconst_0        
		//   13   25:istore_3        
			parcel.writeInt(j);
		//   14   26:aload_1         
		//   15   27:iload_3         
		//   16   28:invokevirtual   #70  <Method void Parcel.writeInt(int)>
			int ai[] = new int[j];
		//   17   31:iload_3         
		//   18   32:newarray        int[]
		//   19   34:astore          5
			Parcelable aparcelable[] = new Parcelable[j];
		//   20   36:iload_3         
		//   21   37:anewarray       Parcelable[]
		//   22   40:astore          6
			for(int k = 0; k < j; k++)
		//*  23   42:iconst_0        
		//*  24   43:istore          4
		//*  25   45:iload           4
		//*  26   47:iload_3         
		//*  27   48:icmpge          91
			{
				ai[k] = behaviorStates.keyAt(k);
		//   28   51:aload           5
		//   29   53:iload           4
		//   30   55:aload_0         
		//   31   56:getfield        #53  <Field SparseArray behaviorStates>
		//   32   59:iload           4
		//   33   61:invokevirtual   #76  <Method int SparseArray.keyAt(int)>
		//   34   64:iastore         
				aparcelable[k] = (Parcelable)behaviorStates.valueAt(k);
		//   35   65:aload           6
		//   36   67:iload           4
		//   37   69:aload_0         
		//   38   70:getfield        #53  <Field SparseArray behaviorStates>
		//   39   73:iload           4
		//   40   75:invokevirtual   #80  <Method Object SparseArray.valueAt(int)>
		//   41   78:checkcast       #72  <Class Parcelable>
		//   42   81:aastore         
			}

		//   43   82:iload           4
		//   44   84:iconst_1        
		//   45   85:iadd            
		//   46   86:istore          4
		//*  47   88:goto            45
			parcel.writeIntArray(ai);
		//   48   91:aload_1         
		//   49   92:aload           5
		//   50   94:invokevirtual   #83  <Method void Parcel.writeIntArray(int[])>
			parcel.writeParcelableArray(aparcelable, i);
		//   51   97:aload_1         
		//   52   98:aload           6
		//   53  100:iload_2         
		//   54  101:invokevirtual   #87  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		//   55  104:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (e(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #23  <Method CoordinatorLayout$SavedState e(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState e(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #26  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState[] e(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (e(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #31  <Method CoordinatorLayout$SavedState[] e(int)>
			//    3    5:areturn         
			}

		}
);
		SparseArray behaviorStates;

		static 
		{
		//    0    0:new             #9   <Class CoordinatorLayout$SavedState$4>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void CoordinatorLayout$SavedState$4()>
		//    3    7:invokestatic    #26  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #32  <Method void AbsSavedState(Parcel, ClassLoader)>
			int j = parcel.readInt();
		//    4    6:aload_1         
		//    5    7:invokevirtual   #38  <Method int Parcel.readInt()>
		//    6   10:istore          4
			int ai[] = new int[j];
		//    7   12:iload           4
		//    8   14:newarray        int[]
		//    9   16:astore          5
			parcel.readIntArray(ai);
		//   10   18:aload_1         
		//   11   19:aload           5
		//   12   21:invokevirtual   #42  <Method void Parcel.readIntArray(int[])>
			parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
		//   13   24:aload_1         
		//   14   25:aload_2         
		//   15   26:invokevirtual   #46  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
		//   16   29:astore_1        
			behaviorStates = new SparseArray(j);
		//   17   30:aload_0         
		//   18   31:new             #48  <Class SparseArray>
		//   19   34:dup             
		//   20   35:iload           4
		//   21   37:invokespecial   #51  <Method void SparseArray(int)>
		//   22   40:putfield        #53  <Field SparseArray behaviorStates>
			for(int i = 0; i < j; i++)
		//*  23   43:iconst_0        
		//*  24   44:istore_3        
		//*  25   45:iload_3         
		//*  26   46:iload           4
		//*  27   48:icmpge          72
				behaviorStates.append(ai[i], ((Object) (parcel[i])));
		//   28   51:aload_0         
		//   29   52:getfield        #53  <Field SparseArray behaviorStates>
		//   30   55:aload           5
		//   31   57:iload_3         
		//   32   58:iaload          
		//   33   59:aload_1         
		//   34   60:iload_3         
		//   35   61:aaload          
		//   36   62:invokevirtual   #57  <Method void SparseArray.append(int, Object)>

		//   37   65:iload_3         
		//   38   66:iconst_1        
		//   39   67:iadd            
		//   40   68:istore_3        
		//*  41   69:goto            45
		//   42   72:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #60  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	class a
		implements android.view.ViewGroup.OnHierarchyChangeListener
	{

		public void onChildViewAdded(View view, View view1)
		{
			if(c.mOnHierarchyChangeListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field CoordinatorLayout c>
		//*   2    4:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//*   3    7:ifnull          24
				c.mOnHierarchyChangeListener.onChildViewAdded(view, view1);
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field CoordinatorLayout c>
		//    6   14:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//    7   17:aload_1         
		//    8   18:aload_2         
		//    9   19:invokeinterface #27  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewAdded(View, View)>
		//   10   24:return          
		}

		public void onChildViewRemoved(View view, View view1)
		{
			c.onChildViewsChanged(2);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CoordinatorLayout c>
		//    2    4:iconst_2        
		//    3    5:invokevirtual   #32  <Method void CoordinatorLayout.onChildViewsChanged(int)>
			if(c.mOnHierarchyChangeListener != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field CoordinatorLayout c>
		//*   6   12:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//*   7   15:ifnull          32
				c.mOnHierarchyChangeListener.onChildViewRemoved(view, view1);
		//    8   18:aload_0         
		//    9   19:getfield        #15  <Field CoordinatorLayout c>
		//   10   22:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//   11   25:aload_1         
		//   12   26:aload_2         
		//   13   27:invokeinterface #34  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewRemoved(View, View)>
		//   14   32:return          
		}

		final CoordinatorLayout c;

		a()
		{
			c = CoordinatorLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CoordinatorLayout c>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	class b
		implements android.view.ViewTreeObserver.OnPreDrawListener
	{

		public boolean onPreDraw()
		{
			c.onChildViewsChanged(0);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CoordinatorLayout c>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #25  <Method void CoordinatorLayout.onChildViewsChanged(int)>
			return true;
		//    4    8:iconst_1        
		//    5    9:ireturn         
		}

		final CoordinatorLayout c;

		b()
		{
			c = CoordinatorLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CoordinatorLayout c>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	static class e
		implements Comparator
	{

		public int b(View view, View view1)
		{
			float f = ViewCompat.getZ(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #23  <Method float ViewCompat.getZ(View)>
		//    2    4:fstore_3        
			float f1 = ViewCompat.getZ(view1);
		//    3    5:aload_2         
		//    4    6:invokestatic    #23  <Method float ViewCompat.getZ(View)>
		//    5    9:fstore          4
			if(f > f1)
		//*   6   11:fload_3         
		//*   7   12:fload           4
		//*   8   14:fcmpl           
		//*   9   15:ifle            20
				return -1;
		//   10   18:iconst_m1       
		//   11   19:ireturn         
			return f >= f1 ? 0 : 1;
		//   12   20:fload_3         
		//   13   21:fload           4
		//   14   23:fcmpg           
		//   15   24:ifge            29
		//   16   27:iconst_1        
		//   17   28:ireturn         
		//   18   29:iconst_0        
		//   19   30:ireturn         
		}

		public int compare(Object obj, Object obj1)
		{
			return b((View)obj, (View)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #27  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #27  <Class View>
		//    5    9:invokevirtual   #29  <Method int b(View, View)>
		//    6   12:ireturn         
		}

		e()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public CoordinatorLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #143 <Method void CoordinatorLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #146 <Method void CoordinatorLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #147 <Method void ViewGroup(Context, AttributeSet, int)>
		mDependencySortedChildren = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #149 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #150 <Method void ArrayList()>
	//    9   15:putfield        #152 <Field List mDependencySortedChildren>
		mChildDag = new m();
	//   10   18:aload_0         
	//   11   19:new             #154 <Class m>
	//   12   22:dup             
	//   13   23:invokespecial   #155 <Method void m()>
	//   14   26:putfield        #157 <Field m mChildDag>
		mTempList1 = ((List) (new ArrayList()));
	//   15   29:aload_0         
	//   16   30:new             #149 <Class ArrayList>
	//   17   33:dup             
	//   18   34:invokespecial   #150 <Method void ArrayList()>
	//   19   37:putfield        #159 <Field List mTempList1>
		mTempDependenciesList = ((List) (new ArrayList()));
	//   20   40:aload_0         
	//   21   41:new             #149 <Class ArrayList>
	//   22   44:dup             
	//   23   45:invokespecial   #150 <Method void ArrayList()>
	//   24   48:putfield        #161 <Field List mTempDependenciesList>
		mTempIntPair = new int[2];
	//   25   51:aload_0         
	//   26   52:iconst_2        
	//   27   53:newarray        int[]
	//   28   55:putfield        #163 <Field int[] mTempIntPair>
		mNestedScrollingParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   29   58:aload_0         
	//   30   59:new             #165 <Class NestedScrollingParentHelper>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:invokespecial   #168 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   34   67:putfield        #170 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
		aa.b(context);
	//   35   70:aload_1         
	//   36   71:invokestatic    #174 <Method void aa.b(Context)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CoordinatorLayout, i, android.support.design.R.style.Widget_Design_CoordinatorLayout)));
	//   37   74:aload_1         
	//   38   75:aload_2         
	//   39   76:getstatic       #178 <Field int[] android.support.design.R$styleable.CoordinatorLayout>
	//   40   79:iload_3         
	//   41   80:getstatic       #183 <Field int android.support.design.R$style.Widget_Design_CoordinatorLayout>
	//   42   83:invokevirtual   #187 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   43   86:astore_2        
		i = ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.CoordinatorLayout_keylines, 0);
	//   44   87:aload_2         
	//   45   88:getstatic       #190 <Field int android.support.design.R$styleable.CoordinatorLayout_keylines>
	//   46   91:iconst_0        
	//   47   92:invokevirtual   #196 <Method int TypedArray.getResourceId(int, int)>
	//   48   95:istore_3        
		if(i != 0)
	//*  49   96:iload_3         
	//*  50   97:ifeq            161
		{
			context = ((Context) (context.getResources()));
	//   51  100:aload_1         
	//   52  101:invokevirtual   #200 <Method Resources Context.getResources()>
	//   53  104:astore_1        
			mKeylines = ((Resources) (context)).getIntArray(i);
	//   54  105:aload_0         
	//   55  106:aload_1         
	//   56  107:iload_3         
	//   57  108:invokevirtual   #206 <Method int[] Resources.getIntArray(int)>
	//   58  111:putfield        #208 <Field int[] mKeylines>
			float f = ((Resources) (context)).getDisplayMetrics().density;
	//   59  114:aload_1         
	//   60  115:invokevirtual   #212 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   61  118:getfield        #218 <Field float DisplayMetrics.density>
	//   62  121:fstore          4
			int j = mKeylines.length;
	//   63  123:aload_0         
	//   64  124:getfield        #208 <Field int[] mKeylines>
	//   65  127:arraylength     
	//   66  128:istore          5
			for(i = 0; i < j; i++)
	//*  67  130:iconst_0        
	//*  68  131:istore_3        
	//*  69  132:iload_3         
	//*  70  133:iload           5
	//*  71  135:icmpge          161
			{
				context = ((Context) (mKeylines));
	//   72  138:aload_0         
	//   73  139:getfield        #208 <Field int[] mKeylines>
	//   74  142:astore_1        
				context[i] = (int)((float)context[i] * f);
	//   75  143:aload_1         
	//   76  144:iload_3         
	//   77  145:aload_1         
	//   78  146:iload_3         
	//   79  147:iaload          
	//   80  148:i2f             
	//   81  149:fload           4
	//   82  151:fmul            
	//   83  152:f2i             
	//   84  153:iastore         
			}

	//   85  154:iload_3         
	//   86  155:iconst_1        
	//   87  156:iadd            
	//   88  157:istore_3        
		}
	//*  89  158:goto            132
		mStatusBarBackground = ((TypedArray) (attributeset)).getDrawable(android.support.design.R.styleable.CoordinatorLayout_statusBarBackground);
	//   90  161:aload_0         
	//   91  162:aload_2         
	//   92  163:getstatic       #221 <Field int android.support.design.R$styleable.CoordinatorLayout_statusBarBackground>
	//   93  166:invokevirtual   #225 <Method Drawable TypedArray.getDrawable(int)>
	//   94  169:putfield        #227 <Field Drawable mStatusBarBackground>
		((TypedArray) (attributeset)).recycle();
	//   95  172:aload_2         
	//   96  173:invokevirtual   #230 <Method void TypedArray.recycle()>
		setupForInsets();
	//   97  176:aload_0         
	//   98  177:invokespecial   #233 <Method void setupForInsets()>
		super.setOnHierarchyChangeListener(((android.view.ViewGroup.OnHierarchyChangeListener) (new a())));
	//   99  180:aload_0         
	//  100  181:new             #27  <Class CoordinatorLayout$a>
	//  101  184:dup             
	//  102  185:aload_0         
	//  103  186:invokespecial   #236 <Method void CoordinatorLayout$a(CoordinatorLayout)>
	//  104  189:invokespecial   #240 <Method void ViewGroup.setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener)>
	//  105  192:return          
	}

	private static Rect acquireTempRect()
	{
		Rect rect1 = (Rect)sRectPool.acquire();
	//    0    0:getstatic       #138 <Field android.support.v4.util.Pools$Pool sRectPool>
	//    1    3:invokeinterface #249 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #251 <Class Rect>
	//    3   11:astore_1        
		Rect rect = rect1;
	//    4   12:aload_1         
	//    5   13:astore_0        
		if(rect1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       26
			rect = new Rect();
	//    8   18:new             #251 <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #252 <Method void Rect()>
	//   11   25:astore_0        
		return rect;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	private void constrainChildRect(LayoutParams layoutparams, Rect rect, int i, int j)
	{
		int l = getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #259 <Method int getWidth()>
	//    2    4:istore          6
		int k = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #262 <Method int getHeight()>
	//    5   10:istore          5
		l = Math.max(getPaddingLeft() + layoutparams.leftMargin, Math.min(rect.left, l - getPaddingRight() - i - layoutparams.rightMargin));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #265 <Method int getPaddingLeft()>
	//    8   16:aload_1         
	//    9   17:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #271 <Field int Rect.left>
	//   13   25:iload           6
	//   14   27:aload_0         
	//   15   28:invokevirtual   #274 <Method int getPaddingRight()>
	//   16   31:isub            
	//   17   32:iload_3         
	//   18   33:isub            
	//   19   34:aload_1         
	//   20   35:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   21   38:isub            
	//   22   39:invokestatic    #282 <Method int Math.min(int, int)>
	//   23   42:invokestatic    #285 <Method int Math.max(int, int)>
	//   24   45:istore          6
		k = Math.max(getPaddingTop() + layoutparams.topMargin, Math.min(rect.top, k - getPaddingBottom() - j - layoutparams.bottomMargin));
	//   25   47:aload_0         
	//   26   48:invokevirtual   #288 <Method int getPaddingTop()>
	//   27   51:aload_1         
	//   28   52:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   29   55:iadd            
	//   30   56:aload_2         
	//   31   57:getfield        #294 <Field int Rect.top>
	//   32   60:iload           5
	//   33   62:aload_0         
	//   34   63:invokevirtual   #297 <Method int getPaddingBottom()>
	//   35   66:isub            
	//   36   67:iload           4
	//   37   69:isub            
	//   38   70:aload_1         
	//   39   71:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//   40   74:isub            
	//   41   75:invokestatic    #282 <Method int Math.min(int, int)>
	//   42   78:invokestatic    #285 <Method int Math.max(int, int)>
	//   43   81:istore          5
		rect.set(l, k, l + i, k + j);
	//   44   83:aload_2         
	//   45   84:iload           6
	//   46   86:iload           5
	//   47   88:iload           6
	//   48   90:iload_3         
	//   49   91:iadd            
	//   50   92:iload           5
	//   51   94:iload           4
	//   52   96:iadd            
	//   53   97:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
	//   54  100:return          
	}

	private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat windowinsetscompat)
	{
		if(windowinsetscompat.isConsumed())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #312 <Method boolean WindowInsetsCompat.isConsumed()>
	//*   2    4:ifeq            9
			return windowinsetscompat;
	//    3    7:aload_1         
	//    4    8:areturn         
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int j = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #315 <Method int getChildCount()>
	//    9   15:istore_3        
		WindowInsetsCompat windowinsetscompat1;
		for(windowinsetscompat1 = windowinsetscompat; i < j; windowinsetscompat1 = windowinsetscompat)
	//*  10   16:aload_1         
	//*  11   17:astore          4
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmpge          99
		{
			View view = getChildAt(i);
	//   15   24:aload_0         
	//   16   25:iload_2         
	//   17   26:invokevirtual   #319 <Method View getChildAt(int)>
	//   18   29:astore          5
			windowinsetscompat = windowinsetscompat1;
	//   19   31:aload           4
	//   20   33:astore_1        
			if(ViewCompat.getFitsSystemWindows(view))
	//*  21   34:aload           5
	//*  22   36:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  23   39:ifeq            89
			{
				Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//   24   42:aload           5
	//   25   44:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   47:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   27   50:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   28   53:astore          6
				windowinsetscompat = windowinsetscompat1;
	//   29   55:aload           4
	//   30   57:astore_1        
				if(behavior != null)
	//*  31   58:aload           6
	//*  32   60:ifnull          89
				{
					windowinsetscompat1 = behavior.onApplyWindowInsets(this, view, windowinsetscompat1);
	//   33   63:aload           6
	//   34   65:aload_0         
	//   35   66:aload           5
	//   36   68:aload           4
	//   37   70:invokevirtual   #339 <Method WindowInsetsCompat CoordinatorLayout$Behavior.onApplyWindowInsets(CoordinatorLayout, View, WindowInsetsCompat)>
	//   38   73:astore          4
					windowinsetscompat = windowinsetscompat1;
	//   39   75:aload           4
	//   40   77:astore_1        
					if(windowinsetscompat1.isConsumed())
	//*  41   78:aload           4
	//*  42   80:invokevirtual   #312 <Method boolean WindowInsetsCompat.isConsumed()>
	//*  43   83:ifeq            89
						return windowinsetscompat1;
	//   44   86:aload           4
	//   45   88:areturn         
				}
			}
			i++;
	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
		}

	//   50   93:aload_1         
	//   51   94:astore          4
	//*  52   96:goto            19
		return windowinsetscompat1;
	//   53   99:aload           4
	//   54  101:areturn         
	}

	private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect1, LayoutParams layoutparams, int j, int k)
	{
		int i1 = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutparams.gravity), i);
	//    0    0:aload           5
	//    1    2:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//    2    5:invokestatic    #348 <Method int resolveAnchoredChildGravity(int)>
	//    3    8:iload_2         
	//    4    9:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    5   12:istore          9
		int l = GravityCompat.getAbsoluteGravity(resolveGravity(layoutparams.anchorGravity), i);
	//    6   14:aload           5
	//    7   16:getfield        #356 <Field int CoordinatorLayout$LayoutParams.anchorGravity>
	//    8   19:invokestatic    #359 <Method int resolveGravity(int)>
	//    9   22:iload_2         
	//   10   23:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   11   26:istore          8
		switch(l & 7)
	//*  12   28:iload           8
	//*  13   30:bipush          7
	//*  14   32:iand            
		{
	//*  15   33:tableswitch     1 5: default 68
	//	               1 84
	//	               2 68
	//	               3 68
	//	               4 68
	//	               5 76
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		default:
			i = rect.left;
	//   16   68:aload_3         
	//   17   69:getfield        #271 <Field int Rect.left>
	//   18   72:istore_2        
			break;

	//*  19   73:goto            96
		case 5: // '\005'
			i = rect.right;
	//   20   76:aload_3         
	//   21   77:getfield        #362 <Field int Rect.right>
	//   22   80:istore_2        
			break;

	//*  23   81:goto            96
		case 1: // '\001'
			i = rect.left + rect.width() / 2;
	//   24   84:aload_3         
	//   25   85:getfield        #271 <Field int Rect.left>
	//   26   88:aload_3         
	//   27   89:invokevirtual   #365 <Method int Rect.width()>
	//   28   92:iconst_2        
	//   29   93:idiv            
	//   30   94:iadd            
	//   31   95:istore_2        
			break;
		}
		switch(l & 0x70)
	//*  32   96:iload           8
	//*  33   98:bipush          112
	//*  34  100:iand            
		{
	//*  35  101:lookupswitch    3: default 136
	//	               16: 154
	//	               48: 136
	//	               80: 145
		case 48: // '0'
		default:
			l = rect.top;
	//   36  136:aload_3         
	//   37  137:getfield        #294 <Field int Rect.top>
	//   38  140:istore          8
			break;

	//*  39  142:goto            167
		case 80: // 'P'
			l = rect.bottom;
	//   40  145:aload_3         
	//   41  146:getfield        #368 <Field int Rect.bottom>
	//   42  149:istore          8
			break;

	//*  43  151:goto            167
		case 16: // '\020'
			l = rect.top + rect.height() / 2;
	//   44  154:aload_3         
	//   45  155:getfield        #294 <Field int Rect.top>
	//   46  158:aload_3         
	//   47  159:invokevirtual   #371 <Method int Rect.height()>
	//   48  162:iconst_2        
	//   49  163:idiv            
	//   50  164:iadd            
	//   51  165:istore          8
			break;
		}
		switch(i1 & 7)
	//*  52  167:iload           9
	//*  53  169:bipush          7
	//*  54  171:iand            
		{
	//*  55  172:tableswitch     1 5: default 208
	//	               1 219
	//	               2 208
	//	               3 208
	//	               4 208
	//	               5 216
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		default:
			i -= j;
	//   56  208:iload_2         
	//   57  209:iload           6
	//   58  211:isub            
	//   59  212:istore_2        
			break;

	//*  60  213:goto            226
	//*  61  216:goto            226
		case 1: // '\001'
			i -= j / 2;
	//   62  219:iload_2         
	//   63  220:iload           6
	//   64  222:iconst_2        
	//   65  223:idiv            
	//   66  224:isub            
	//   67  225:istore_2        
			break;

		case 5: // '\005'
			break;
		}
		switch(i1 & 0x70)
	//*  68  226:iload           9
	//*  69  228:bipush          112
	//*  70  230:iand            
		{
	//*  71  231:lookupswitch    3: default 264
	//	               16: 277
	//	               48: 264
	//	               80: 274
		case 48: // '0'
		default:
			l -= k;
	//   72  264:iload           8
	//   73  266:iload           7
	//   74  268:isub            
	//   75  269:istore          8
			break;

	//*  76  271:goto            286
	//*  77  274:goto            286
		case 16: // '\020'
			l -= k / 2;
	//   78  277:iload           8
	//   79  279:iload           7
	//   80  281:iconst_2        
	//   81  282:idiv            
	//   82  283:isub            
	//   83  284:istore          8
			break;

		case 80: // 'P'
			break;
		}
		rect1.set(i, l, i + j, l + k);
	//   84  286:aload           4
	//   85  288:iload_2         
	//   86  289:iload           8
	//   87  291:iload_2         
	//   88  292:iload           6
	//   89  294:iadd            
	//   90  295:iload           8
	//   91  297:iload           7
	//   92  299:iadd            
	//   93  300:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
	//   94  303:return          
	}

	private int getKeyline(int i)
	{
		if(mKeylines == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #208 <Field int[] mKeylines>
	//*   2    4:ifnonnull       45
		{
			Log.e("CoordinatorLayout", (new StringBuilder()).append("No keylines defined for ").append(((Object) (this))).append(" - attempted index lookup ").append(i).toString());
	//    3    7:ldc1            #48  <String "CoordinatorLayout">
	//    4    9:new             #374 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #375 <Method void StringBuilder()>
	//    7   16:ldc2            #377 <String "No keylines defined for ">
	//    8   19:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #384 <Method StringBuilder StringBuilder.append(Object)>
	//   11   26:ldc2            #386 <String " - attempted index lookup ">
	//   12   29:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   13   32:iload_1         
	//   14   33:invokevirtual   #389 <Method StringBuilder StringBuilder.append(int)>
	//   15   36:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   16   39:invokestatic    #397 <Method int Log.e(String, String)>
	//   17   42:pop             
			return 0;
	//   18   43:iconst_0        
	//   19   44:ireturn         
		}
		if(i < 0 || i >= mKeylines.length)
	//*  20   45:iload_1         
	//*  21   46:iflt            58
	//*  22   49:iload_1         
	//*  23   50:aload_0         
	//*  24   51:getfield        #208 <Field int[] mKeylines>
	//*  25   54:arraylength     
	//*  26   55:icmplt          96
		{
			Log.e("CoordinatorLayout", (new StringBuilder()).append("Keyline index ").append(i).append(" out of range for ").append(((Object) (this))).toString());
	//   27   58:ldc1            #48  <String "CoordinatorLayout">
	//   28   60:new             #374 <Class StringBuilder>
	//   29   63:dup             
	//   30   64:invokespecial   #375 <Method void StringBuilder()>
	//   31   67:ldc2            #399 <String "Keyline index ">
	//   32   70:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:iload_1         
	//   34   74:invokevirtual   #389 <Method StringBuilder StringBuilder.append(int)>
	//   35   77:ldc2            #401 <String " out of range for ">
	//   36   80:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   37   83:aload_0         
	//   38   84:invokevirtual   #384 <Method StringBuilder StringBuilder.append(Object)>
	//   39   87:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   40   90:invokestatic    #397 <Method int Log.e(String, String)>
	//   41   93:pop             
			return 0;
	//   42   94:iconst_0        
	//   43   95:ireturn         
		} else
		{
			return mKeylines[i];
	//   44   96:aload_0         
	//   45   97:getfield        #208 <Field int[] mKeylines>
	//   46  100:iload_1         
	//   47  101:iaload          
	//   48  102:ireturn         
		}
	}

	private void getTopSortedChildren(List list)
	{
		list.clear();
	//    0    0:aload_1         
	//    1    1:invokeinterface #408 <Method void List.clear()>
		boolean flag = isChildrenDrawingOrderEnabled();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #411 <Method boolean isChildrenDrawingOrderEnabled()>
	//    4   10:istore          5
		int k = getChildCount();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #315 <Method int getChildCount()>
	//    7   16:istore          4
		for(int i = k - 1; i >= 0; i--)
	//*   8   18:iload           4
	//*   9   20:iconst_1        
	//*  10   21:isub            
	//*  11   22:istore_2        
	//*  12   23:iload_2         
	//*  13   24:iflt            64
		{
			int j;
			if(flag)
	//*  14   27:iload           5
	//*  15   29:ifeq            43
				j = getChildDrawingOrder(k, i);
	//   16   32:aload_0         
	//   17   33:iload           4
	//   18   35:iload_2         
	//   19   36:invokevirtual   #414 <Method int getChildDrawingOrder(int, int)>
	//   20   39:istore_3        
			else
	//*  21   40:goto            45
				j = i;
	//   22   43:iload_2         
	//   23   44:istore_3        
			list.add(((Object) (getChildAt(j))));
	//   24   45:aload_1         
	//   25   46:aload_0         
	//   26   47:iload_3         
	//   27   48:invokevirtual   #319 <Method View getChildAt(int)>
	//   28   51:invokeinterface #418 <Method boolean List.add(Object)>
	//   29   56:pop             
		}

	//   30   57:iload_2         
	//   31   58:iconst_1        
	//   32   59:isub            
	//   33   60:istore_2        
	//*  34   61:goto            23
		if(TOP_SORTED_CHILDREN_COMPARATOR != null)
	//*  35   64:getstatic       #120 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//*  36   67:ifnull          77
			Collections.sort(list, TOP_SORTED_CHILDREN_COMPARATOR);
	//   37   70:aload_1         
	//   38   71:getstatic       #120 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//   39   74:invokestatic    #424 <Method void Collections.sort(List, Comparator)>
	//   40   77:return          
	}

	private boolean hasDependencies(View view)
	{
		return mChildDag.e(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field m mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #429 <Method boolean m.e(Object)>
	//    4    8:ireturn         
	}

	private void layoutChild(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		Rect rect = acquireTempRect();
	//    4    8:invokestatic    #433 <Method Rect acquireTempRect()>
	//    5   11:astore          4
		rect.set(getPaddingLeft() + layoutparams.leftMargin, getPaddingTop() + layoutparams.topMargin, getWidth() - getPaddingRight() - layoutparams.rightMargin, getHeight() - getPaddingBottom() - layoutparams.bottomMargin);
	//    6   13:aload           4
	//    7   15:aload_0         
	//    8   16:invokevirtual   #265 <Method int getPaddingLeft()>
	//    9   19:aload_3         
	//   10   20:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   11   23:iadd            
	//   12   24:aload_0         
	//   13   25:invokevirtual   #288 <Method int getPaddingTop()>
	//   14   28:aload_3         
	//   15   29:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   16   32:iadd            
	//   17   33:aload_0         
	//   18   34:invokevirtual   #259 <Method int getWidth()>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #274 <Method int getPaddingRight()>
	//   21   41:isub            
	//   22   42:aload_3         
	//   23   43:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   24   46:isub            
	//   25   47:aload_0         
	//   26   48:invokevirtual   #262 <Method int getHeight()>
	//   27   51:aload_0         
	//   28   52:invokevirtual   #297 <Method int getPaddingBottom()>
	//   29   55:isub            
	//   30   56:aload_3         
	//   31   57:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//   32   60:isub            
	//   33   61:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
		if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))) && !ViewCompat.getFitsSystemWindows(view))
	//*  34   64:aload_0         
	//*  35   65:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//*  36   68:ifnull          157
	//*  37   71:aload_0         
	//*  38   72:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  39   75:ifeq            157
	//*  40   78:aload_1         
	//*  41   79:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  42   82:ifne            157
		{
			rect.left = rect.left + mLastInsets.getSystemWindowInsetLeft();
	//   43   85:aload           4
	//   44   87:aload           4
	//   45   89:getfield        #271 <Field int Rect.left>
	//   46   92:aload_0         
	//   47   93:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//   48   96:invokevirtual   #438 <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//   49   99:iadd            
	//   50  100:putfield        #271 <Field int Rect.left>
			rect.top = rect.top + mLastInsets.getSystemWindowInsetTop();
	//   51  103:aload           4
	//   52  105:aload           4
	//   53  107:getfield        #294 <Field int Rect.top>
	//   54  110:aload_0         
	//   55  111:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//   56  114:invokevirtual   #441 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   57  117:iadd            
	//   58  118:putfield        #294 <Field int Rect.top>
			rect.right = rect.right - mLastInsets.getSystemWindowInsetRight();
	//   59  121:aload           4
	//   60  123:aload           4
	//   61  125:getfield        #362 <Field int Rect.right>
	//   62  128:aload_0         
	//   63  129:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//   64  132:invokevirtual   #444 <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//   65  135:isub            
	//   66  136:putfield        #362 <Field int Rect.right>
			rect.bottom = rect.bottom - mLastInsets.getSystemWindowInsetBottom();
	//   67  139:aload           4
	//   68  141:aload           4
	//   69  143:getfield        #368 <Field int Rect.bottom>
	//   70  146:aload_0         
	//   71  147:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//   72  150:invokevirtual   #447 <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//   73  153:isub            
	//   74  154:putfield        #368 <Field int Rect.bottom>
		}
		Rect rect1 = acquireTempRect();
	//   75  157:invokestatic    #433 <Method Rect acquireTempRect()>
	//   76  160:astore          5
		GravityCompat.apply(resolveGravity(layoutparams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect1, i);
	//   77  162:aload_3         
	//   78  163:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//   79  166:invokestatic    #359 <Method int resolveGravity(int)>
	//   80  169:aload_1         
	//   81  170:invokevirtual   #450 <Method int View.getMeasuredWidth()>
	//   82  173:aload_1         
	//   83  174:invokevirtual   #453 <Method int View.getMeasuredHeight()>
	//   84  177:aload           4
	//   85  179:aload           5
	//   86  181:iload_2         
	//   87  182:invokestatic    #457 <Method void GravityCompat.apply(int, int, int, Rect, Rect, int)>
		view.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
	//   88  185:aload_1         
	//   89  186:aload           5
	//   90  188:getfield        #271 <Field int Rect.left>
	//   91  191:aload           5
	//   92  193:getfield        #294 <Field int Rect.top>
	//   93  196:aload           5
	//   94  198:getfield        #362 <Field int Rect.right>
	//   95  201:aload           5
	//   96  203:getfield        #368 <Field int Rect.bottom>
	//   97  206:invokevirtual   #460 <Method void View.layout(int, int, int, int)>
		releaseTempRect(rect);
	//   98  209:aload           4
	//   99  211:invokestatic    #464 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect1);
	//  100  214:aload           5
	//  101  216:invokestatic    #464 <Method void releaseTempRect(Rect)>
	//  102  219:return          
	}

	private void layoutChildWithAnchor(View view, View view1, int i)
	{
		Object obj;
		Rect rect;
		obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          4
		obj = ((Object) (acquireTempRect()));
	//    4    9:invokestatic    #433 <Method Rect acquireTempRect()>
	//    5   12:astore          4
		rect = acquireTempRect();
	//    6   14:invokestatic    #433 <Method Rect acquireTempRect()>
	//    7   17:astore          5
		getDescendantRect(view1, ((Rect) (obj)));
	//    8   19:aload_0         
	//    9   20:aload_2         
	//   10   21:aload           4
	//   11   23:invokevirtual   #470 <Method void getDescendantRect(View, Rect)>
		getDesiredAnchoredChildRect(view, i, ((Rect) (obj)), rect);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:iload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokevirtual   #474 <Method void getDesiredAnchoredChildRect(View, int, Rect, Rect)>
		view.layout(rect.left, rect.top, rect.right, rect.bottom);
	//   18   36:aload_1         
	//   19   37:aload           5
	//   20   39:getfield        #271 <Field int Rect.left>
	//   21   42:aload           5
	//   22   44:getfield        #294 <Field int Rect.top>
	//   23   47:aload           5
	//   24   49:getfield        #362 <Field int Rect.right>
	//   25   52:aload           5
	//   26   54:getfield        #368 <Field int Rect.bottom>
	//   27   57:invokevirtual   #460 <Method void View.layout(int, int, int, int)>
		releaseTempRect(((Rect) (obj)));
	//   28   60:aload           4
	//   29   62:invokestatic    #464 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect);
	//   30   65:aload           5
	//   31   67:invokestatic    #464 <Method void releaseTempRect(Rect)>
		return;
	//   32   70:return          
		view;
	//   33   71:astore_1        
		releaseTempRect(((Rect) (obj)));
	//   34   72:aload           4
	//   35   74:invokestatic    #464 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect);
	//   36   77:aload           5
	//   37   79:invokestatic    #464 <Method void releaseTempRect(Rect)>
		throw view;
	//   38   82:aload_1         
	//   39   83:athrow          
	}

	private void layoutChildWithKeyline(View view, int i, int j)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          10
		int l1 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), j);
	//    4    9:aload           10
	//    5   11:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//    6   14:invokestatic    #479 <Method int resolveKeylineGravity(int)>
	//    7   17:iload_3         
	//    8   18:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    9   21:istore          9
		int k1 = getWidth();
	//   10   23:aload_0         
	//   11   24:invokevirtual   #259 <Method int getWidth()>
	//   12   27:istore          8
		int j1 = getHeight();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #262 <Method int getHeight()>
	//   15   33:istore          7
		int l = view.getMeasuredWidth();
	//   16   35:aload_1         
	//   17   36:invokevirtual   #450 <Method int View.getMeasuredWidth()>
	//   18   39:istore          5
		int i1 = view.getMeasuredHeight();
	//   19   41:aload_1         
	//   20   42:invokevirtual   #453 <Method int View.getMeasuredHeight()>
	//   21   45:istore          6
		int k = i;
	//   22   47:iload_2         
	//   23   48:istore          4
		if(j == 1)
	//*  24   50:iload_3         
	//*  25   51:iconst_1        
	//*  26   52:icmpne          61
			k = k1 - i;
	//   27   55:iload           8
	//   28   57:iload_2         
	//   29   58:isub            
	//   30   59:istore          4
		i = getKeyline(k) - l;
	//   31   61:aload_0         
	//   32   62:iload           4
	//   33   64:invokespecial   #481 <Method int getKeyline(int)>
	//   34   67:iload           5
	//   35   69:isub            
	//   36   70:istore_2        
		j = 0;
	//   37   71:iconst_0        
	//   38   72:istore_3        
		switch(l1 & 7)
	//*  39   73:iload           9
	//*  40   75:bipush          7
	//*  41   77:iand            
		{
	//*  42   78:tableswitch     1 5: default 112
	//	               1 123
	//	               2 112
	//	               3 112
	//	               4 112
	//	               5 115
	//*  43  112:goto            130
		case 5: // '\005'
			i += l;
	//   44  115:iload_2         
	//   45  116:iload           5
	//   46  118:iadd            
	//   47  119:istore_2        
			break;

	//*  48  120:goto            130
		case 1: // '\001'
			i += l / 2;
	//   49  123:iload_2         
	//   50  124:iload           5
	//   51  126:iconst_2        
	//   52  127:idiv            
	//   53  128:iadd            
	//   54  129:istore_2        
			break;
		}
		switch(l1 & 0x70)
	//*  55  130:iload           9
	//*  56  132:bipush          112
	//*  57  134:iand            
		{
	//*  58  135:lookupswitch    3: default 168
	//	               16: 179
	//	               48: 168
	//	               80: 171
	//*  59  168:goto            186
		case 80: // 'P'
			j = i1 + 0;
	//   60  171:iload           6
	//   61  173:iconst_0        
	//   62  174:iadd            
	//   63  175:istore_3        
			break;

	//*  64  176:goto            186
		case 16: // '\020'
			j = i1 / 2 + 0;
	//   65  179:iload           6
	//   66  181:iconst_2        
	//   67  182:idiv            
	//   68  183:iconst_0        
	//   69  184:iadd            
	//   70  185:istore_3        
			break;
		}
		i = Math.max(getPaddingLeft() + layoutparams.leftMargin, Math.min(i, k1 - getPaddingRight() - l - layoutparams.rightMargin));
	//   71  186:aload_0         
	//   72  187:invokevirtual   #265 <Method int getPaddingLeft()>
	//   73  190:aload           10
	//   74  192:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   75  195:iadd            
	//   76  196:iload_2         
	//   77  197:iload           8
	//   78  199:aload_0         
	//   79  200:invokevirtual   #274 <Method int getPaddingRight()>
	//   80  203:isub            
	//   81  204:iload           5
	//   82  206:isub            
	//   83  207:aload           10
	//   84  209:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   85  212:isub            
	//   86  213:invokestatic    #282 <Method int Math.min(int, int)>
	//   87  216:invokestatic    #285 <Method int Math.max(int, int)>
	//   88  219:istore_2        
		j = Math.max(getPaddingTop() + layoutparams.topMargin, Math.min(j, j1 - getPaddingBottom() - i1 - layoutparams.bottomMargin));
	//   89  220:aload_0         
	//   90  221:invokevirtual   #288 <Method int getPaddingTop()>
	//   91  224:aload           10
	//   92  226:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   93  229:iadd            
	//   94  230:iload_3         
	//   95  231:iload           7
	//   96  233:aload_0         
	//   97  234:invokevirtual   #297 <Method int getPaddingBottom()>
	//   98  237:isub            
	//   99  238:iload           6
	//  100  240:isub            
	//  101  241:aload           10
	//  102  243:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//  103  246:isub            
	//  104  247:invokestatic    #282 <Method int Math.min(int, int)>
	//  105  250:invokestatic    #285 <Method int Math.max(int, int)>
	//  106  253:istore_3        
		view.layout(i, j, i + l, j + i1);
	//  107  254:aload_1         
	//  108  255:iload_2         
	//  109  256:iload_3         
	//  110  257:iload_2         
	//  111  258:iload           5
	//  112  260:iadd            
	//  113  261:iload_3         
	//  114  262:iload           6
	//  115  264:iadd            
	//  116  265:invokevirtual   #460 <Method void View.layout(int, int, int, int)>
	//  117  268:return          
	}

	private void offsetChildByInset(View view, Rect rect, int i)
	{
		if(!ViewCompat.isLaidOut(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #486 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(view.getWidth() <= 0 || view.getHeight() <= 0)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #487 <Method int View.getWidth()>
	//*   6   12:ifle            22
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #488 <Method int View.getHeight()>
	//*   9   19:ifgt            23
			return;
	//   10   22:return          
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   27:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   14   30:astore          7
		Behavior behavior = layoutparams.getBehavior();
	//   15   32:aload           7
	//   16   34:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   17   37:astore          8
		Rect rect1 = acquireTempRect();
	//   18   39:invokestatic    #433 <Method Rect acquireTempRect()>
	//   19   42:astore          9
		Rect rect2 = acquireTempRect();
	//   20   44:invokestatic    #433 <Method Rect acquireTempRect()>
	//   21   47:astore          10
		rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   22   49:aload           10
	//   23   51:aload_1         
	//   24   52:invokevirtual   #491 <Method int View.getLeft()>
	//   25   55:aload_1         
	//   26   56:invokevirtual   #494 <Method int View.getTop()>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #497 <Method int View.getRight()>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #500 <Method int View.getBottom()>
	//   31   67:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
		if(behavior != null && behavior.getInsetDodgeRect(this, view, rect1))
	//*  32   70:aload           8
	//*  33   72:ifnull          143
	//*  34   75:aload           8
	//*  35   77:aload_0         
	//*  36   78:aload_1         
	//*  37   79:aload           9
	//*  38   81:invokevirtual   #504 <Method boolean CoordinatorLayout$Behavior.getInsetDodgeRect(CoordinatorLayout, View, Rect)>
	//*  39   84:ifeq            143
		{
			if(!rect2.contains(rect1))
	//*  40   87:aload           10
	//*  41   89:aload           9
	//*  42   91:invokevirtual   #508 <Method boolean Rect.contains(Rect)>
	//*  43   94:ifne            150
				throw new IllegalArgumentException((new StringBuilder()).append("Rect should be within the child's bounds. Rect:").append(rect1.toShortString()).append(" | Bounds:").append(rect2.toShortString()).toString());
	//   44   97:new             #510 <Class IllegalArgumentException>
	//   45  100:dup             
	//   46  101:new             #374 <Class StringBuilder>
	//   47  104:dup             
	//   48  105:invokespecial   #375 <Method void StringBuilder()>
	//   49  108:ldc2            #512 <String "Rect should be within the child's bounds. Rect:">
	//   50  111:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   51  114:aload           9
	//   52  116:invokevirtual   #515 <Method String Rect.toShortString()>
	//   53  119:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   54  122:ldc2            #517 <String " | Bounds:">
	//   55  125:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   56  128:aload           10
	//   57  130:invokevirtual   #515 <Method String Rect.toShortString()>
	//   58  133:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   59  136:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   60  139:invokespecial   #520 <Method void IllegalArgumentException(String)>
	//   61  142:athrow          
		} else
		{
			rect1.set(rect2);
	//   62  143:aload           9
	//   63  145:aload           10
	//   64  147:invokevirtual   #522 <Method void Rect.set(Rect)>
		}
		releaseTempRect(rect2);
	//   65  150:aload           10
	//   66  152:invokestatic    #464 <Method void releaseTempRect(Rect)>
		if(rect1.isEmpty())
	//*  67  155:aload           9
	//*  68  157:invokevirtual   #525 <Method boolean Rect.isEmpty()>
	//*  69  160:ifeq            169
		{
			releaseTempRect(rect1);
	//   70  163:aload           9
	//   71  165:invokestatic    #464 <Method void releaseTempRect(Rect)>
			return;
	//   72  168:return          
		}
		int k = GravityCompat.getAbsoluteGravity(layoutparams.dodgeInsetEdges, i);
	//   73  169:aload           7
	//   74  171:getfield        #528 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//   75  174:iload_3         
	//   76  175:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   77  178:istore          5
		int j = 0;
	//   78  180:iconst_0        
	//   79  181:istore          4
		i = j;
	//   80  183:iload           4
	//   81  185:istore_3        
		if((k & 0x30) == 48)
	//*  82  186:iload           5
	//*  83  188:bipush          48
	//*  84  190:iand            
	//*  85  191:bipush          48
	//*  86  193:icmpne          241
		{
			int i1 = rect1.top - layoutparams.topMargin - layoutparams.mInsetOffsetY;
	//   87  196:aload           9
	//   88  198:getfield        #294 <Field int Rect.top>
	//   89  201:aload           7
	//   90  203:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   91  206:isub            
	//   92  207:aload           7
	//   93  209:getfield        #531 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//   94  212:isub            
	//   95  213:istore          6
			i = j;
	//   96  215:iload           4
	//   97  217:istore_3        
			if(i1 < rect.top)
	//*  98  218:iload           6
	//*  99  220:aload_2         
	//* 100  221:getfield        #294 <Field int Rect.top>
	//* 101  224:icmpge          241
			{
				setInsetOffsetY(view, rect.top - i1);
	//  102  227:aload_0         
	//  103  228:aload_1         
	//  104  229:aload_2         
	//  105  230:getfield        #294 <Field int Rect.top>
	//  106  233:iload           6
	//  107  235:isub            
	//  108  236:invokespecial   #534 <Method void setInsetOffsetY(View, int)>
				i = 1;
	//  109  239:iconst_1        
	//  110  240:istore_3        
			}
		}
		j = i;
	//  111  241:iload_3         
	//  112  242:istore          4
		if((k & 0x50) == 80)
	//* 113  244:iload           5
	//* 114  246:bipush          80
	//* 115  248:iand            
	//* 116  249:bipush          80
	//* 117  251:icmpne          305
		{
			int j1 = (getHeight() - rect1.bottom - layoutparams.bottomMargin) + layoutparams.mInsetOffsetY;
	//  118  254:aload_0         
	//  119  255:invokevirtual   #262 <Method int getHeight()>
	//  120  258:aload           9
	//  121  260:getfield        #368 <Field int Rect.bottom>
	//  122  263:isub            
	//  123  264:aload           7
	//  124  266:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//  125  269:isub            
	//  126  270:aload           7
	//  127  272:getfield        #531 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//  128  275:iadd            
	//  129  276:istore          6
			j = i;
	//  130  278:iload_3         
	//  131  279:istore          4
			if(j1 < rect.bottom)
	//* 132  281:iload           6
	//* 133  283:aload_2         
	//* 134  284:getfield        #368 <Field int Rect.bottom>
	//* 135  287:icmpge          305
			{
				setInsetOffsetY(view, j1 - rect.bottom);
	//  136  290:aload_0         
	//  137  291:aload_1         
	//  138  292:iload           6
	//  139  294:aload_2         
	//  140  295:getfield        #368 <Field int Rect.bottom>
	//  141  298:isub            
	//  142  299:invokespecial   #534 <Method void setInsetOffsetY(View, int)>
				j = 1;
	//  143  302:iconst_1        
	//  144  303:istore          4
			}
		}
		if(j == 0)
	//* 145  305:iload           4
	//* 146  307:ifne            316
			setInsetOffsetY(view, 0);
	//  147  310:aload_0         
	//  148  311:aload_1         
	//  149  312:iconst_0        
	//  150  313:invokespecial   #534 <Method void setInsetOffsetY(View, int)>
		j = 0;
	//  151  316:iconst_0        
	//  152  317:istore          4
		i = j;
	//  153  319:iload           4
	//  154  321:istore_3        
		if((k & 3) == 3)
	//* 155  322:iload           5
	//* 156  324:iconst_3        
	//* 157  325:iand            
	//* 158  326:iconst_3        
	//* 159  327:icmpne          375
		{
			int k1 = rect1.left - layoutparams.leftMargin - layoutparams.mInsetOffsetX;
	//  160  330:aload           9
	//  161  332:getfield        #271 <Field int Rect.left>
	//  162  335:aload           7
	//  163  337:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//  164  340:isub            
	//  165  341:aload           7
	//  166  343:getfield        #537 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//  167  346:isub            
	//  168  347:istore          6
			i = j;
	//  169  349:iload           4
	//  170  351:istore_3        
			if(k1 < rect.left)
	//* 171  352:iload           6
	//* 172  354:aload_2         
	//* 173  355:getfield        #271 <Field int Rect.left>
	//* 174  358:icmpge          375
			{
				setInsetOffsetX(view, rect.left - k1);
	//  175  361:aload_0         
	//  176  362:aload_1         
	//  177  363:aload_2         
	//  178  364:getfield        #271 <Field int Rect.left>
	//  179  367:iload           6
	//  180  369:isub            
	//  181  370:invokespecial   #540 <Method void setInsetOffsetX(View, int)>
				i = 1;
	//  182  373:iconst_1        
	//  183  374:istore_3        
			}
		}
		j = i;
	//  184  375:iload_3         
	//  185  376:istore          4
		if((k & 5) == 5)
	//* 186  378:iload           5
	//* 187  380:iconst_5        
	//* 188  381:iand            
	//* 189  382:iconst_5        
	//* 190  383:icmpne          437
		{
			int l = (getWidth() - rect1.right - layoutparams.rightMargin) + layoutparams.mInsetOffsetX;
	//  191  386:aload_0         
	//  192  387:invokevirtual   #259 <Method int getWidth()>
	//  193  390:aload           9
	//  194  392:getfield        #362 <Field int Rect.right>
	//  195  395:isub            
	//  196  396:aload           7
	//  197  398:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//  198  401:isub            
	//  199  402:aload           7
	//  200  404:getfield        #537 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//  201  407:iadd            
	//  202  408:istore          5
			j = i;
	//  203  410:iload_3         
	//  204  411:istore          4
			if(l < rect.right)
	//* 205  413:iload           5
	//* 206  415:aload_2         
	//* 207  416:getfield        #362 <Field int Rect.right>
	//* 208  419:icmpge          437
			{
				setInsetOffsetX(view, l - rect.right);
	//  209  422:aload_0         
	//  210  423:aload_1         
	//  211  424:iload           5
	//  212  426:aload_2         
	//  213  427:getfield        #362 <Field int Rect.right>
	//  214  430:isub            
	//  215  431:invokespecial   #540 <Method void setInsetOffsetX(View, int)>
				j = 1;
	//  216  434:iconst_1        
	//  217  435:istore          4
			}
		}
		if(j == 0)
	//* 218  437:iload           4
	//* 219  439:ifne            448
			setInsetOffsetX(view, 0);
	//  220  442:aload_0         
	//  221  443:aload_1         
	//  222  444:iconst_0        
	//  223  445:invokespecial   #540 <Method void setInsetOffsetX(View, int)>
		releaseTempRect(rect1);
	//  224  448:aload           9
	//  225  450:invokestatic    #464 <Method void releaseTempRect(Rect)>
	//  226  453:return          
	}

	static Behavior parseBehavior(Context context, AttributeSet attributeset, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #549 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		if(s.startsWith("."))
	//*   5    9:aload_2         
	//*   6   10:ldc2            #551 <String ".">
	//*   7   13:invokevirtual   #557 <Method boolean String.startsWith(String)>
	//*   8   16:ifeq            44
			s = (new StringBuilder()).append(context.getPackageName()).append(s).toString();
	//    9   19:new             #374 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #375 <Method void StringBuilder()>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #560 <Method String Context.getPackageName()>
	//   14   30:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   18   40:astore_2        
		else
	//*  19   41:goto            94
		if(s.indexOf('.') < 0 && !TextUtils.isEmpty(((CharSequence) (WIDGET_PACKAGE_NAME))))
	//*  20   44:aload_2         
	//*  21   45:bipush          46
	//*  22   47:invokevirtual   #563 <Method int String.indexOf(int)>
	//*  23   50:iflt            56
	//*  24   53:goto            94
	//*  25   56:getstatic       #110 <Field String WIDGET_PACKAGE_NAME>
	//*  26   59:invokestatic    #549 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  27   62:ifne            94
			s = (new StringBuilder()).append(WIDGET_PACKAGE_NAME).append('.').append(s).toString();
	//   28   65:new             #374 <Class StringBuilder>
	//   29   68:dup             
	//   30   69:invokespecial   #375 <Method void StringBuilder()>
	//   31   72:getstatic       #110 <Field String WIDGET_PACKAGE_NAME>
	//   32   75:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   33   78:bipush          46
	//   34   80:invokevirtual   #566 <Method StringBuilder StringBuilder.append(char)>
	//   35   83:aload_2         
	//   36   84:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   37   87:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   38   90:astore_2        
	//*  39   91:goto            94
		Object obj;
		Object obj1;
		Constructor constructor;
		try
		{
			obj1 = ((Object) ((Map)sConstructors.get()));
	//   40   94:getstatic       #131 <Field ThreadLocal sConstructors>
	//   41   97:invokevirtual   #569 <Method Object ThreadLocal.get()>
	//   42  100:checkcast       #571 <Class Map>
	//   43  103:astore          4
		}
	//*  44  105:aload           4
	//*  45  107:astore_3        
	//*  46  108:aload           4
	//*  47  110:ifnonnull       128
	//*  48  113:new             #573 <Class HashMap>
	//*  49  116:dup             
	//*  50  117:invokespecial   #574 <Method void HashMap()>
	//*  51  120:astore_3        
	//*  52  121:getstatic       #131 <Field ThreadLocal sConstructors>
	//*  53  124:aload_3         
	//*  54  125:invokevirtual   #577 <Method void ThreadLocal.set(Object)>
	//*  55  128:aload_3         
	//*  56  129:aload_2         
	//*  57  130:invokeinterface #580 <Method Object Map.get(Object)>
	//*  58  135:checkcast       #582 <Class Constructor>
	//*  59  138:astore          5
	//*  60  140:aload           5
	//*  61  142:astore          4
	//*  62  144:aload           5
	//*  63  146:ifnonnull       182
	//*  64  149:aload_2         
	//*  65  150:iconst_1        
	//*  66  151:aload_0         
	//*  67  152:invokevirtual   #586 <Method ClassLoader Context.getClassLoader()>
	//*  68  155:invokestatic    #590 <Method Class Class.forName(String, boolean, ClassLoader)>
	//*  69  158:getstatic       #126 <Field Class[] CONSTRUCTOR_PARAMS>
	//*  70  161:invokevirtual   #594 <Method Constructor Class.getConstructor(Class[])>
	//*  71  164:astore          4
	//*  72  166:aload           4
	//*  73  168:iconst_1        
	//*  74  169:invokevirtual   #598 <Method void Constructor.setAccessible(boolean)>
	//*  75  172:aload_3         
	//*  76  173:aload_2         
	//*  77  174:aload           4
	//*  78  176:invokeinterface #602 <Method Object Map.put(Object, Object)>
	//*  79  181:pop             
	//*  80  182:aload           4
	//*  81  184:iconst_2        
	//*  82  185:anewarray       Object[]
	//*  83  188:dup             
	//*  84  189:iconst_0        
	//*  85  190:aload_0         
	//*  86  191:aastore         
	//*  87  192:dup             
	//*  88  193:iconst_1        
	//*  89  194:aload_1         
	//*  90  195:aastore         
	//*  91  196:invokevirtual   #608 <Method Object Constructor.newInstance(Object[])>
	//*  92  199:checkcast       #10  <Class CoordinatorLayout$Behavior>
	//*  93  202:astore_0        
	//*  94  203:aload_0         
	//*  95  204:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  96  205:astore_0        
		{
			throw new RuntimeException((new StringBuilder()).append("Could not inflate Behavior subclass ").append(s).toString(), ((Throwable) (context)));
	//   97  206:new             #610 <Class RuntimeException>
	//   98  209:dup             
	//   99  210:new             #374 <Class StringBuilder>
	//  100  213:dup             
	//  101  214:invokespecial   #375 <Method void StringBuilder()>
	//  102  217:ldc2            #612 <String "Could not inflate Behavior subclass ">
	//  103  220:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//  104  223:aload_2         
	//  105  224:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//  106  227:invokevirtual   #392 <Method String StringBuilder.toString()>
	//  107  230:aload_0         
	//  108  231:invokespecial   #615 <Method void RuntimeException(String, Throwable)>
	//  109  234:athrow          
		}
		obj = obj1;
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_128;
		obj = ((Object) (new HashMap()));
		sConstructors.set(obj);
		constructor = (Constructor)((Map) (obj)).get(((Object) (s)));
		obj1 = ((Object) (constructor));
		if(constructor != null)
			break MISSING_BLOCK_LABEL_182;
		obj1 = ((Object) (Class.forName(s, true, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS)));
		((Constructor) (obj1)).setAccessible(true);
		((Map) (obj)).put(((Object) (s)), obj1);
		context = ((Context) ((Behavior)((Constructor) (obj1)).newInstance(new Object[] {
			context, attributeset
		})));
		return ((Behavior) (context));
	}

	private boolean performIntercept(MotionEvent motionevent, int i)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          8
		boolean flag = false;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		Object obj = null;
	//    4    5:aconst_null     
	//    5    6:astore          13
		int k = motionevent.getActionMasked();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #622 <Method int MotionEvent.getActionMasked()>
	//    8   12:istore          6
		List list = mTempList1;
	//    9   14:aload_0         
	//   10   15:getfield        #159 <Field List mTempList1>
	//   11   18:astore          15
		getTopSortedChildren(list);
	//   12   20:aload_0         
	//   13   21:aload           15
	//   14   23:invokespecial   #624 <Method void getTopSortedChildren(List)>
		int l = list.size();
	//   15   26:aload           15
	//   16   28:invokeinterface #627 <Method int List.size()>
	//   17   33:istore          7
		int j = 0;
	//   18   35:iconst_0        
	//   19   36:istore          4
		boolean flag3;
		do
		{
			flag3 = flag2;
	//   20   38:iload           8
	//   21   40:istore          9
			if(j >= l)
				break;
	//   22   42:iload           4
	//   23   44:iload           7
	//   24   46:icmpge          383
			View view = (View)list.get(j);
	//   25   49:aload           15
	//   26   51:iload           4
	//   27   53:invokeinterface #630 <Method Object List.get(int)>
	//   28   58:checkcast       #327 <Class View>
	//   29   61:astore          16
			Object obj1 = ((Object) ((LayoutParams)view.getLayoutParams()));
	//   30   63:aload           16
	//   31   65:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   68:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   33   71:astore          14
			Behavior behavior = ((LayoutParams) (obj1)).getBehavior();
	//   34   73:aload           14
	//   35   75:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   36   78:astore          17
			boolean flag1;
			boolean flag4;
			if((flag2 || flag) && k != 0)
	//*  37   80:iload           8
	//*  38   82:ifne            89
	//*  39   85:iload_3         
	//*  40   86:ifeq            202
	//*  41   89:iload           6
	//*  42   91:ifeq            202
			{
				flag4 = flag2;
	//   43   94:iload           8
	//   44   96:istore          10
				flag1 = flag;
	//   45   98:iload_3         
	//   46   99:istore          5
				obj1 = obj;
	//   47  101:aload           13
	//   48  103:astore          14
				if(behavior != null)
	//*  49  105:aload           17
	//*  50  107:ifnull          363
				{
					obj1 = obj;
	//   51  110:aload           13
	//   52  112:astore          14
					if(obj == null)
	//*  53  114:aload           13
	//*  54  116:ifnonnull       137
					{
						long l1 = SystemClock.uptimeMillis();
	//   55  119:invokestatic    #636 <Method long SystemClock.uptimeMillis()>
	//   56  122:lstore          11
						obj1 = ((Object) (MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0)));
	//   57  124:lload           11
	//   58  126:lload           11
	//   59  128:iconst_3        
	//   60  129:fconst_0        
	//   61  130:fconst_0        
	//   62  131:iconst_0        
	//   63  132:invokestatic    #640 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   64  135:astore          14
					}
					switch(i)
	//*  65  137:iload_2         
					{
	//*  66  138:lookupswitch    2: default 164
	//	               0: 167
	//	               1: 181
	//*  67  164:goto            192
					case 0: // '\0'
						behavior.onInterceptTouchEvent(this, view, ((MotionEvent) (obj1)));
	//   68  167:aload           17
	//   69  169:aload_0         
	//   70  170:aload           16
	//   71  172:aload           14
	//   72  174:invokevirtual   #644 <Method boolean CoordinatorLayout$Behavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   73  177:pop             
						break;

	//*  74  178:goto            192
					case 1: // '\001'
						behavior.onTouchEvent(this, view, ((MotionEvent) (obj1)));
	//   75  181:aload           17
	//   76  183:aload_0         
	//   77  184:aload           16
	//   78  186:aload           14
	//   79  188:invokevirtual   #647 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   80  191:pop             
						break;
					}
					flag4 = flag2;
	//   81  192:iload           8
	//   82  194:istore          10
					flag1 = flag;
	//   83  196:iload_3         
	//   84  197:istore          5
				}
			} else
	//*  85  199:goto            363
			{
				flag3 = flag2;
	//   86  202:iload           8
	//   87  204:istore          9
				if(!flag2)
	//*  88  206:iload           8
	//*  89  208:ifne            295
				{
					flag3 = flag2;
	//   90  211:iload           8
	//   91  213:istore          9
					if(behavior != null)
	//*  92  215:aload           17
	//*  93  217:ifnull          295
					{
						switch(i)
	//*  94  220:iload_2         
						{
	//*  95  221:lookupswitch    2: default 248
	//	               0: 251
	//	               1: 265
	//*  96  248:goto            276
						case 0: // '\0'
							flag2 = behavior.onInterceptTouchEvent(this, view, motionevent);
	//   97  251:aload           17
	//   98  253:aload_0         
	//   99  254:aload           16
	//  100  256:aload_1         
	//  101  257:invokevirtual   #644 <Method boolean CoordinatorLayout$Behavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//  102  260:istore          8
							break;

	//* 103  262:goto            276
						case 1: // '\001'
							flag2 = behavior.onTouchEvent(this, view, motionevent);
	//  104  265:aload           17
	//  105  267:aload_0         
	//  106  268:aload           16
	//  107  270:aload_1         
	//  108  271:invokevirtual   #647 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//  109  274:istore          8
							break;
						}
						flag3 = flag2;
	//  110  276:iload           8
	//  111  278:istore          9
						if(flag2)
	//* 112  280:iload           8
	//* 113  282:ifeq            295
						{
							mBehaviorTouchView = view;
	//  114  285:aload_0         
	//  115  286:aload           16
	//  116  288:putfield        #649 <Field View mBehaviorTouchView>
							flag3 = flag2;
	//  117  291:iload           8
	//  118  293:istore          9
						}
					}
				}
				flag4 = ((LayoutParams) (obj1)).didBlockInteraction();
	//  119  295:aload           14
	//  120  297:invokevirtual   #652 <Method boolean CoordinatorLayout$LayoutParams.didBlockInteraction()>
	//  121  300:istore          10
				flag2 = ((LayoutParams) (obj1)).isBlockingInteractionBelow(this, view);
	//  122  302:aload           14
	//  123  304:aload_0         
	//  124  305:aload           16
	//  125  307:invokevirtual   #656 <Method boolean CoordinatorLayout$LayoutParams.isBlockingInteractionBelow(CoordinatorLayout, View)>
	//  126  310:istore          8
				if(flag2 && !flag4)
	//* 127  312:iload           8
	//* 128  314:ifeq            327
	//* 129  317:iload           10
	//* 130  319:ifne            327
					flag = true;
	//  131  322:iconst_1        
	//  132  323:istore_3        
				else
	//* 133  324:goto            329
					flag = false;
	//  134  327:iconst_0        
	//  135  328:istore_3        
				flag4 = flag3;
	//  136  329:iload           9
	//  137  331:istore          10
				flag1 = flag;
	//  138  333:iload_3         
	//  139  334:istore          5
				obj1 = obj;
	//  140  336:aload           13
	//  141  338:astore          14
				if(flag2)
	//* 142  340:iload           8
	//* 143  342:ifeq            363
				{
					flag4 = flag3;
	//  144  345:iload           9
	//  145  347:istore          10
					flag1 = flag;
	//  146  349:iload_3         
	//  147  350:istore          5
					obj1 = obj;
	//  148  352:aload           13
	//  149  354:astore          14
					if(!flag)
	//* 150  356:iload_3         
	//* 151  357:ifne            363
						break;
	//  152  360:goto            383
				}
			}
			j++;
	//  153  363:iload           4
	//  154  365:iconst_1        
	//  155  366:iadd            
	//  156  367:istore          4
			flag2 = flag4;
	//  157  369:iload           10
	//  158  371:istore          8
			flag = flag1;
	//  159  373:iload           5
	//  160  375:istore_3        
			obj = obj1;
	//  161  376:aload           14
	//  162  378:astore          13
		} while(true);
	//  163  380:goto            38
		list.clear();
	//  164  383:aload           15
	//  165  385:invokeinterface #408 <Method void List.clear()>
		return flag3;
	//  166  390:iload           9
	//  167  392:ireturn         
	}

	private void prepareChildren()
	{
		mDependencySortedChildren.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field List mDependencySortedChildren>
	//    2    4:invokeinterface #408 <Method void List.clear()>
		mChildDag.a();
	//    3    9:aload_0         
	//    4   10:getfield        #157 <Field m mChildDag>
	//    5   13:invokevirtual   #659 <Method void m.a()>
		int i = 0;
	//    6   16:iconst_0        
	//    7   17:istore_1        
		for(int k = getChildCount(); i < k; i++)
	//*   8   18:aload_0         
	//*   9   19:invokevirtual   #315 <Method int getChildCount()>
	//*  10   22:istore_3        
	//*  11   23:iload_1         
	//*  12   24:iload_3         
	//*  13   25:icmpge          142
		{
			View view = getChildAt(i);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #319 <Method View getChildAt(int)>
	//   17   33:astore          4
			getResolvedLayoutParams(view).findAnchorView(this, view);
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:invokevirtual   #663 <Method CoordinatorLayout$LayoutParams getResolvedLayoutParams(View)>
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:invokevirtual   #667 <Method View CoordinatorLayout$LayoutParams.findAnchorView(CoordinatorLayout, View)>
	//   24   47:pop             
			mChildDag.d(((Object) (view)));
	//   25   48:aload_0         
	//   26   49:getfield        #157 <Field m mChildDag>
	//   27   52:aload           4
	//   28   54:invokevirtual   #670 <Method void m.d(Object)>
			for(int j = 0; j < k; j++)
	//*  29   57:iconst_0        
	//*  30   58:istore_2        
	//*  31   59:iload_2         
	//*  32   60:iload_3         
	//*  33   61:icmpge          135
			{
				if(j == i)
	//*  34   64:iload_2         
	//*  35   65:iload_1         
	//*  36   66:icmpne          72
					continue;
	//   37   69:goto            128
				View view1 = getChildAt(j);
	//   38   72:aload_0         
	//   39   73:iload_2         
	//   40   74:invokevirtual   #319 <Method View getChildAt(int)>
	//   41   77:astore          5
				if(!getResolvedLayoutParams(view1).dependsOn(this, view1, view))
					continue;
	//   42   79:aload_0         
	//   43   80:aload           5
	//   44   82:invokevirtual   #663 <Method CoordinatorLayout$LayoutParams getResolvedLayoutParams(View)>
	//   45   85:aload_0         
	//   46   86:aload           5
	//   47   88:aload           4
	//   48   90:invokevirtual   #674 <Method boolean CoordinatorLayout$LayoutParams.dependsOn(CoordinatorLayout, View, View)>
	//   49   93:ifeq            128
				if(!mChildDag.b(((Object) (view1))))
	//*  50   96:aload_0         
	//*  51   97:getfield        #157 <Field m mChildDag>
	//*  52  100:aload           5
	//*  53  102:invokevirtual   #676 <Method boolean m.b(Object)>
	//*  54  105:ifne            117
					mChildDag.d(((Object) (view1)));
	//   55  108:aload_0         
	//   56  109:getfield        #157 <Field m mChildDag>
	//   57  112:aload           5
	//   58  114:invokevirtual   #670 <Method void m.d(Object)>
				mChildDag.b(((Object) (view)), ((Object) (view1)));
	//   59  117:aload_0         
	//   60  118:getfield        #157 <Field m mChildDag>
	//   61  121:aload           4
	//   62  123:aload           5
	//   63  125:invokevirtual   #679 <Method void m.b(Object, Object)>
			}

	//   64  128:iload_2         
	//   65  129:iconst_1        
	//   66  130:iadd            
	//   67  131:istore_2        
		}

	//   68  132:goto            59
	//   69  135:iload_1         
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:istore_1        
	//*  73  139:goto            23
		mDependencySortedChildren.addAll(((java.util.Collection) (mChildDag.d())));
	//   74  142:aload_0         
	//   75  143:getfield        #152 <Field List mDependencySortedChildren>
	//   76  146:aload_0         
	//   77  147:getfield        #157 <Field m mChildDag>
	//   78  150:invokevirtual   #682 <Method ArrayList m.d()>
	//   79  153:invokeinterface #686 <Method boolean List.addAll(java.util.Collection)>
	//   80  158:pop             
		Collections.reverse(mDependencySortedChildren);
	//   81  159:aload_0         
	//   82  160:getfield        #152 <Field List mDependencySortedChildren>
	//   83  163:invokestatic    #689 <Method void Collections.reverse(List)>
	//   84  166:return          
	}

	private static void releaseTempRect(Rect rect)
	{
		rect.setEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #692 <Method void Rect.setEmpty()>
		sRectPool.release(((Object) (rect)));
	//    2    4:getstatic       #138 <Field android.support.v4.util.Pools$Pool sRectPool>
	//    3    7:aload_0         
	//    4    8:invokeinterface #695 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private void resetTouchBehaviors()
	{
		if(mBehaviorTouchView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #649 <Field View mBehaviorTouchView>
	//*   2    4:ifnull          65
		{
			Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
	//    3    7:aload_0         
	//    4    8:getfield        #649 <Field View mBehaviorTouchView>
	//    5   11:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   14:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    7   17:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    8   20:astore          5
			if(behavior != null)
	//*   9   22:aload           5
	//*  10   24:ifnull          60
			{
				long l = SystemClock.uptimeMillis();
	//   11   27:invokestatic    #636 <Method long SystemClock.uptimeMillis()>
	//   12   30:lstore_3        
				MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   13   31:lload_3         
	//   14   32:lload_3         
	//   15   33:iconst_3        
	//   16   34:fconst_0        
	//   17   35:fconst_0        
	//   18   36:iconst_0        
	//   19   37:invokestatic    #640 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   20   40:astore          6
				behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
	//   21   42:aload           5
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #649 <Field View mBehaviorTouchView>
	//   25   49:aload           6
	//   26   51:invokevirtual   #647 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   27   54:pop             
				motionevent.recycle();
	//   28   55:aload           6
	//   29   57:invokevirtual   #698 <Method void MotionEvent.recycle()>
			}
			mBehaviorTouchView = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #649 <Field View mBehaviorTouchView>
		}
		int j = getChildCount();
	//   33   65:aload_0         
	//   34   66:invokevirtual   #315 <Method int getChildCount()>
	//   35   69:istore_2        
		for(int i = 0; i < j; i++)
	//*  36   70:iconst_0        
	//*  37   71:istore_1        
	//*  38   72:iload_1         
	//*  39   73:iload_2         
	//*  40   74:icmpge          98
			((LayoutParams)getChildAt(i).getLayoutParams()).resetTouchBehaviorTracking();
	//   41   77:aload_0         
	//   42   78:iload_1         
	//   43   79:invokevirtual   #319 <Method View getChildAt(int)>
	//   44   82:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   45   85:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   46   88:invokevirtual   #701 <Method void CoordinatorLayout$LayoutParams.resetTouchBehaviorTracking()>

	//   47   91:iload_1         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore_1        
	//*  51   95:goto            72
		mDisallowInterceptReset = false;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #703 <Field boolean mDisallowInterceptReset>
	//   55  103:return          
	}

	private static int resolveAnchoredChildGravity(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            7
			return 17;
	//    2    4:bipush          17
	//    3    6:ireturn         
		else
			return i;
	//    4    7:iload_0         
	//    5    8:ireturn         
	}

	private static int resolveGravity(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if((i & 7) == 0)
	//*   2    2:iload_0         
	//*   3    3:bipush          7
	//*   4    5:iand            
	//*   5    6:ifne            15
			j = i | 0x800003;
	//    6    9:iload_0         
	//    7   10:ldc2            #704 <Int 0x800003>
	//    8   13:ior             
	//    9   14:istore_1        
		i = j;
	//   10   15:iload_1         
	//   11   16:istore_0        
		if((j & 0x70) == 0)
	//*  12   17:iload_1         
	//*  13   18:bipush          112
	//*  14   20:iand            
	//*  15   21:ifne            29
			i = j | 0x30;
	//   16   24:iload_1         
	//   17   25:bipush          48
	//   18   27:ior             
	//   19   28:istore_0        
		return i;
	//   20   29:iload_0         
	//   21   30:ireturn         
	}

	private static int resolveKeylineGravity(int i)
	{
		if(i == 0)
	//*   0    0:iload_0         
	//*   1    1:ifne            8
			return 0x800035;
	//    2    4:ldc2            #705 <Int 0x800035>
	//    3    7:ireturn         
		else
			return i;
	//    4    8:iload_0         
	//    5    9:ireturn         
	}

	private void setInsetOffsetX(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.mInsetOffsetX != i)
	//*   4    8:aload_3         
	//*   5    9:getfield        #537 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ViewCompat.offsetLeftAndRight(view, i - layoutparams.mInsetOffsetX);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #537 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//   12   22:isub            
	//   13   23:invokestatic    #708 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			layoutparams.mInsetOffsetX = i;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #537 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
		}
	//   17   31:return          
	}

	private void setInsetOffsetY(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.mInsetOffsetY != i)
	//*   4    8:aload_3         
	//*   5    9:getfield        #531 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ViewCompat.offsetTopAndBottom(view, i - layoutparams.mInsetOffsetY);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #531 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//   12   22:isub            
	//   13   23:invokestatic    #711 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			layoutparams.mInsetOffsetY = i;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #531 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
		}
	//   17   31:return          
	}

	private void setupForInsets()
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   4    9:aload_0         
	//*   5   10:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   6   13:ifeq            51
		{
			if(mApplyWindowInsetsListener == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #713 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
	//*   9   20:ifnonnull       35
				mApplyWindowInsetsListener = new OnApplyWindowInsetsListener() {

					public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
					{
						return c.setWindowInsets(windowinsetscompat);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field CoordinatorLayout c>
					//    2    4:aload_2         
					//    3    5:invokevirtual   #26  <Method WindowInsetsCompat CoordinatorLayout.setWindowInsets(WindowInsetsCompat)>
					//    4    8:areturn         
					}

					final CoordinatorLayout c;

			
			{
				c = CoordinatorLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CoordinatorLayout c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   10   23:aload_0         
	//   11   24:new             #8   <Class CoordinatorLayout$5>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:invokespecial   #714 <Method void CoordinatorLayout$5(CoordinatorLayout)>
	//   15   32:putfield        #713 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
			ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), mApplyWindowInsetsListener);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #713 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
	//   19   40:invokestatic    #718 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			setSystemUiVisibility(1280);
	//   20   43:aload_0         
	//   21   44:sipush          1280
	//   22   47:invokevirtual   #721 <Method void setSystemUiVisibility(int)>
			return;
	//   23   50:return          
		} else
		{
			ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), ((OnApplyWindowInsetsListener) (null)));
	//   24   51:aload_0         
	//   25   52:aconst_null     
	//   26   53:invokestatic    #718 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			return;
	//   27   56:return          
		}
	}

	void addPreDrawListener()
	{
		if(mIsAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #724 <Field boolean mIsAttachedToWindow>
	//*   2    4:ifeq            37
		{
			if(mOnPreDrawListener == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//*   5   11:ifnonnull       26
				mOnPreDrawListener = new b();
	//    6   14:aload_0         
	//    7   15:new             #30  <Class CoordinatorLayout$b>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #727 <Method void CoordinatorLayout$b(CoordinatorLayout)>
	//   11   23:putfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #731 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   30:aload_0         
	//   15   31:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//   16   34:invokevirtual   #737 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		mNeedsPreDrawListener = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #739 <Field boolean mNeedsPreDrawListener>
	//   20   42:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #19  <Class CoordinatorLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #743 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void dispatchDependentViewsChanged(View view)
	{
		List list = mChildDag.c(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field m mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #749 <Method List m.c(Object)>
	//    4    8:astore_3        
		if(list != null && !list.isEmpty())
	//*   5    9:aload_3         
	//*   6   10:ifnull          81
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #750 <Method boolean List.isEmpty()>
	//*   9   19:ifne            81
		{
			for(int i = 0; i < list.size(); i++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_3         
	//*  14   26:invokeinterface #627 <Method int List.size()>
	//*  15   31:icmpge          81
			{
				View view1 = (View)list.get(i);
	//   16   34:aload_3         
	//   17   35:iload_2         
	//   18   36:invokeinterface #630 <Method Object List.get(int)>
	//   19   41:checkcast       #327 <Class View>
	//   20   44:astore          4
				Behavior behavior = ((LayoutParams)view1.getLayoutParams()).getBehavior();
	//   21   46:aload           4
	//   22   48:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   51:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   24   54:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   25   57:astore          5
				if(behavior != null)
	//*  26   59:aload           5
	//*  27   61:ifnull          74
					behavior.onDependentViewChanged(this, view1, view);
	//   28   64:aload           5
	//   29   66:aload_0         
	//   30   67:aload           4
	//   31   69:aload_1         
	//   32   70:invokevirtual   #753 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
	//   33   73:pop             
			}

	//   34   74:iload_2         
	//   35   75:iconst_1        
	//   36   76:iadd            
	//   37   77:istore_2        
		}
	//*  38   78:goto            24
	//   39   81:return          
	}

	public boolean doViewsOverlap(View view, View view1)
	{
		Rect rect;
		if(view.getVisibility() != 0 || view1.getVisibility() != 0)
			break MISSING_BLOCK_LABEL_161;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #758 <Method int View.getVisibility()>
	//    2    4:ifne            161
	//    3    7:aload_2         
	//    4    8:invokevirtual   #758 <Method int View.getVisibility()>
	//    5   11:ifne            161
		rect = acquireTempRect();
	//    6   14:invokestatic    #433 <Method Rect acquireTempRect()>
	//    7   17:astore          6
		boolean flag;
		if(view.getParent() != this)
	//*   8   19:aload_1         
	//*   9   20:invokevirtual   #762 <Method ViewParent View.getParent()>
	//*  10   23:aload_0         
	//*  11   24:if_acmpeq       33
			flag = true;
	//   12   27:iconst_1        
	//   13   28:istore          5
		else
	//*  14   30:goto            36
			flag = false;
	//   15   33:iconst_0        
	//   16   34:istore          5
		getChildRect(view, flag, rect);
	//   17   36:aload_0         
	//   18   37:aload_1         
	//   19   38:iload           5
	//   20   40:aload           6
	//   21   42:invokevirtual   #766 <Method void getChildRect(View, boolean, Rect)>
		view = ((View) (acquireTempRect()));
	//   22   45:invokestatic    #433 <Method Rect acquireTempRect()>
	//   23   48:astore_1        
		if(view1.getParent() != this)
	//*  24   49:aload_2         
	//*  25   50:invokevirtual   #762 <Method ViewParent View.getParent()>
	//*  26   53:aload_0         
	//*  27   54:if_acmpeq       63
			flag = true;
	//   28   57:iconst_1        
	//   29   58:istore          5
		else
	//*  30   60:goto            66
			flag = false;
	//   31   63:iconst_0        
	//   32   64:istore          5
		getChildRect(view1, flag, ((Rect) (view)));
	//   33   66:aload_0         
	//   34   67:aload_2         
	//   35   68:iload           5
	//   36   70:aload_1         
	//   37   71:invokevirtual   #766 <Method void getChildRect(View, boolean, Rect)>
		int i;
		int j;
		if(rect.left > ((Rect) (view)).right || rect.top > ((Rect) (view)).bottom || rect.right < ((Rect) (view)).left)
			break MISSING_BLOCK_LABEL_134;
	//   38   74:aload           6
	//   39   76:getfield        #271 <Field int Rect.left>
	//   40   79:aload_1         
	//   41   80:getfield        #362 <Field int Rect.right>
	//   42   83:icmpgt          134
	//   43   86:aload           6
	//   44   88:getfield        #294 <Field int Rect.top>
	//   45   91:aload_1         
	//   46   92:getfield        #368 <Field int Rect.bottom>
	//   47   95:icmpgt          134
	//   48   98:aload           6
	//   49  100:getfield        #362 <Field int Rect.right>
	//   50  103:aload_1         
	//   51  104:getfield        #271 <Field int Rect.left>
	//   52  107:icmplt          134
		i = rect.bottom;
	//   53  110:aload           6
	//   54  112:getfield        #368 <Field int Rect.bottom>
	//   55  115:istore_3        
		j = ((Rect) (view)).top;
	//   56  116:aload_1         
	//   57  117:getfield        #294 <Field int Rect.top>
	//   58  120:istore          4
		boolean flag1;
		if(i >= j)
	//*  59  122:iload_3         
	//*  60  123:iload           4
	//*  61  125:icmplt          134
		{
			flag1 = true;
	//   62  128:iconst_1        
	//   63  129:istore          5
			break MISSING_BLOCK_LABEL_137;
	//   64  131:goto            137
		}
		flag1 = false;
	//   65  134:iconst_0        
	//   66  135:istore          5
		releaseTempRect(rect);
	//   67  137:aload           6
	//   68  139:invokestatic    #464 <Method void releaseTempRect(Rect)>
		releaseTempRect(((Rect) (view)));
	//   69  142:aload_1         
	//   70  143:invokestatic    #464 <Method void releaseTempRect(Rect)>
		return flag1;
	//   71  146:iload           5
	//   72  148:ireturn         
		view1;
	//   73  149:astore_2        
		releaseTempRect(rect);
	//   74  150:aload           6
	//   75  152:invokestatic    #464 <Method void releaseTempRect(Rect)>
		releaseTempRect(((Rect) (view)));
	//   76  155:aload_1         
	//   77  156:invokestatic    #464 <Method void releaseTempRect(Rect)>
		throw view1;
	//   78  159:aload_2         
	//   79  160:athrow          
		return false;
	//   80  161:iconst_0        
	//   81  162:ireturn         
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          7
		if(layoutparams.mBehavior != null)
	//*   4    9:aload           7
	//*   5   11:getfield        #772 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//*   6   14:ifnull          179
		{
			float f = layoutparams.mBehavior.getScrimOpacity(this, view);
	//    7   17:aload           7
	//    8   19:getfield        #772 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//    9   22:aload_0         
	//   10   23:aload_2         
	//   11   24:invokevirtual   #776 <Method float CoordinatorLayout$Behavior.getScrimOpacity(CoordinatorLayout, View)>
	//   12   27:fstore          5
			if(f > 0.0F)
	//*  13   29:fload           5
	//*  14   31:fconst_0        
	//*  15   32:fcmpl           
	//*  16   33:ifle            179
			{
				if(mScrimPaint == null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #778 <Field Paint mScrimPaint>
	//*  19   40:ifnonnull       54
					mScrimPaint = new Paint();
	//   20   43:aload_0         
	//   21   44:new             #780 <Class Paint>
	//   22   47:dup             
	//   23   48:invokespecial   #781 <Method void Paint()>
	//   24   51:putfield        #778 <Field Paint mScrimPaint>
				mScrimPaint.setColor(layoutparams.mBehavior.getScrimColor(this, view));
	//   25   54:aload_0         
	//   26   55:getfield        #778 <Field Paint mScrimPaint>
	//   27   58:aload           7
	//   28   60:getfield        #772 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:invokevirtual   #785 <Method int CoordinatorLayout$Behavior.getScrimColor(CoordinatorLayout, View)>
	//   32   68:invokevirtual   #788 <Method void Paint.setColor(int)>
				mScrimPaint.setAlpha(w.b(Math.round(255F * f), 0, 255));
	//   33   71:aload_0         
	//   34   72:getfield        #778 <Field Paint mScrimPaint>
	//   35   75:ldc2            #789 <Float 255F>
	//   36   78:fload           5
	//   37   80:fmul            
	//   38   81:invokestatic    #793 <Method int Math.round(float)>
	//   39   84:iconst_0        
	//   40   85:sipush          255
	//   41   88:invokestatic    #798 <Method int w.b(int, int, int)>
	//   42   91:invokevirtual   #801 <Method void Paint.setAlpha(int)>
				int i = canvas.save();
	//   43   94:aload_1         
	//   44   95:invokevirtual   #806 <Method int Canvas.save()>
	//   45   98:istore          6
				if(view.isOpaque())
	//*  46  100:aload_2         
	//*  47  101:invokevirtual   #809 <Method boolean View.isOpaque()>
	//*  48  104:ifeq            135
					canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
	//   49  107:aload_1         
	//   50  108:aload_2         
	//   51  109:invokevirtual   #491 <Method int View.getLeft()>
	//   52  112:i2f             
	//   53  113:aload_2         
	//   54  114:invokevirtual   #494 <Method int View.getTop()>
	//   55  117:i2f             
	//   56  118:aload_2         
	//   57  119:invokevirtual   #497 <Method int View.getRight()>
	//   58  122:i2f             
	//   59  123:aload_2         
	//   60  124:invokevirtual   #500 <Method int View.getBottom()>
	//   61  127:i2f             
	//   62  128:getstatic       #815 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   63  131:invokevirtual   #819 <Method boolean Canvas.clipRect(float, float, float, float, android.graphics.Region$Op)>
	//   64  134:pop             
				canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), mScrimPaint);
	//   65  135:aload_1         
	//   66  136:aload_0         
	//   67  137:invokevirtual   #265 <Method int getPaddingLeft()>
	//   68  140:i2f             
	//   69  141:aload_0         
	//   70  142:invokevirtual   #288 <Method int getPaddingTop()>
	//   71  145:i2f             
	//   72  146:aload_0         
	//   73  147:invokevirtual   #259 <Method int getWidth()>
	//   74  150:aload_0         
	//   75  151:invokevirtual   #274 <Method int getPaddingRight()>
	//   76  154:isub            
	//   77  155:i2f             
	//   78  156:aload_0         
	//   79  157:invokevirtual   #262 <Method int getHeight()>
	//   80  160:aload_0         
	//   81  161:invokevirtual   #297 <Method int getPaddingBottom()>
	//   82  164:isub            
	//   83  165:i2f             
	//   84  166:aload_0         
	//   85  167:getfield        #778 <Field Paint mScrimPaint>
	//   86  170:invokevirtual   #823 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				canvas.restoreToCount(i);
	//   87  173:aload_1         
	//   88  174:iload           6
	//   89  176:invokevirtual   #826 <Method void Canvas.restoreToCount(int)>
			}
		}
		return super.drawChild(canvas, view, l);
	//   90  179:aload_0         
	//   91  180:aload_1         
	//   92  181:aload_2         
	//   93  182:lload_3         
	//   94  183:invokespecial   #828 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   95  186:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #831 <Method void ViewGroup.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #835 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		Drawable drawable = mStatusBarBackground;
	//    7   11:aload_0         
	//    8   12:getfield        #227 <Field Drawable mStatusBarBackground>
	//    9   15:astore          4
		boolean flag = flag1;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if(drawable != null)
	//*  12   19:aload           4
	//*  13   21:ifnull          43
		{
			flag = flag1;
	//   14   24:iload_2         
	//   15   25:istore_1        
			if(drawable.isStateful())
	//*  16   26:aload           4
	//*  17   28:invokevirtual   #840 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = drawable.setState(ai) | false;
	//   19   34:aload           4
	//   20   36:aload_3         
	//   21   37:invokevirtual   #844 <Method boolean Drawable.setState(int[])>
	//   22   40:iconst_0        
	//   23   41:ior             
	//   24   42:istore_1        
		}
		if(flag)
	//*  25   43:iload_1         
	//*  26   44:ifeq            51
			invalidate();
	//   27   47:aload_0         
	//   28   48:invokevirtual   #847 <Method void invalidate()>
	//   29   51:return          
	}

	void ensurePreDrawListener()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int j = getChildCount();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #315 <Method int getChildCount()>
	//    4    7:istore_2        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
			if(i >= j)
				break;
	//    9   13:iload_1         
	//   10   14:iload_2         
	//   11   15:icmpge          42
			if(hasDependencies(getChildAt(i)))
	//*  12   18:aload_0         
	//*  13   19:aload_0         
	//*  14   20:iload_1         
	//*  15   21:invokevirtual   #319 <Method View getChildAt(int)>
	//*  16   24:invokespecial   #850 <Method boolean hasDependencies(View)>
	//*  17   27:ifeq            35
			{
				flag = true;
	//   18   30:iconst_1        
	//   19   31:istore_3        
				break;
	//   20   32:goto            42
			}
			i++;
	//   21   35:iload_1         
	//   22   36:iconst_1        
	//   23   37:iadd            
	//   24   38:istore_1        
		} while(true);
	//   25   39:goto            10
		if(flag != mNeedsPreDrawListener)
	//*  26   42:iload_3         
	//*  27   43:aload_0         
	//*  28   44:getfield        #739 <Field boolean mNeedsPreDrawListener>
	//*  29   47:icmpeq          63
		{
			if(flag)
	//*  30   50:iload_3         
	//*  31   51:ifeq            59
			{
				addPreDrawListener();
	//   32   54:aload_0         
	//   33   55:invokevirtual   #852 <Method void addPreDrawListener()>
				return;
	//   34   58:return          
			}
			removePreDrawListener();
	//   35   59:aload_0         
	//   36   60:invokevirtual   #855 <Method void removePreDrawListener()>
		}
	//   37   63:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-2, -2);
	//    0    0:new             #19  <Class CoordinatorLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #860 <Method void CoordinatorLayout$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #862 <Method CoordinatorLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #19  <Class CoordinatorLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #868 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #869 <Method void CoordinatorLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #19  <Class CoordinatorLayout$LayoutParams>
	//*   2    4:ifeq            19
			return new LayoutParams((LayoutParams)layoutparams);
	//    3    7:new             #19  <Class CoordinatorLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    7   15:invokespecial   #873 <Method void CoordinatorLayout$LayoutParams(CoordinatorLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #875 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   12   26:new             #19  <Class CoordinatorLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #875 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #878 <Method void CoordinatorLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new LayoutParams(layoutparams);
	//   18   38:new             #19  <Class CoordinatorLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #881 <Method void CoordinatorLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #884 <Method CoordinatorLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #887 <Method CoordinatorLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	void getChildRect(View view, boolean flag, Rect rect)
	{
		if(view.isLayoutRequested() || view.getVisibility() == 8)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #890 <Method boolean View.isLayoutRequested()>
	//*   2    4:ifne            16
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #758 <Method int View.getVisibility()>
	//*   5   11:bipush          8
	//*   6   13:icmpne          21
		{
			rect.setEmpty();
	//    7   16:aload_3         
	//    8   17:invokevirtual   #692 <Method void Rect.setEmpty()>
			return;
	//    9   20:return          
		}
		if(flag)
	//*  10   21:iload_2         
	//*  11   22:ifeq            32
		{
			getDescendantRect(view, rect);
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:aload_3         
	//   15   28:invokevirtual   #470 <Method void getDescendantRect(View, Rect)>
			return;
	//   16   31:return          
		} else
		{
			rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   17   32:aload_3         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #491 <Method int View.getLeft()>
	//   20   37:aload_1         
	//   21   38:invokevirtual   #494 <Method int View.getTop()>
	//   22   41:aload_1         
	//   23   42:invokevirtual   #497 <Method int View.getRight()>
	//   24   45:aload_1         
	//   25   46:invokevirtual   #500 <Method int View.getBottom()>
	//   26   49:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
			return;
	//   27   52:return          
		}
	}

	public List getDependencies(View view)
	{
		view = ((View) (mChildDag.a(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field m mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #894 <Method List m.a(Object)>
	//    4    8:astore_1        
		mTempDependenciesList.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field List mTempDependenciesList>
	//    7   13:invokeinterface #408 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			mTempDependenciesList.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #161 <Field List mTempDependenciesList>
	//   12   26:aload_1         
	//   13   27:invokeinterface #686 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return mTempDependenciesList;
	//   15   33:aload_0         
	//   16   34:getfield        #161 <Field List mTempDependenciesList>
	//   17   37:areturn         
	}

	final List getDependencySortedChildren()
	{
		prepareChildren();
	//    0    0:aload_0         
	//    1    1:invokespecial   #900 <Method void prepareChildren()>
		return Collections.unmodifiableList(mDependencySortedChildren);
	//    2    4:aload_0         
	//    3    5:getfield        #152 <Field List mDependencySortedChildren>
	//    4    8:invokestatic    #904 <Method List Collections.unmodifiableList(List)>
	//    5   11:areturn         
	}

	public List getDependents(View view)
	{
		view = ((View) (mChildDag.c(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field m mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #749 <Method List m.c(Object)>
	//    4    8:astore_1        
		mTempDependenciesList.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #161 <Field List mTempDependenciesList>
	//    7   13:invokeinterface #408 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			mTempDependenciesList.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #161 <Field List mTempDependenciesList>
	//   12   26:aload_1         
	//   13   27:invokeinterface #686 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return mTempDependenciesList;
	//   15   33:aload_0         
	//   16   34:getfield        #161 <Field List mTempDependenciesList>
	//   17   37:areturn         
	}

	void getDescendantRect(View view, Rect rect)
	{
		ac.e(((ViewGroup) (this)), view, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #911 <Method void ac.e(ViewGroup, View, Rect)>
	//    4    6:return          
	}

	void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          7
		int j = view.getMeasuredWidth();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #450 <Method int View.getMeasuredWidth()>
	//    6   13:istore          5
		int k = view.getMeasuredHeight();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #453 <Method int View.getMeasuredHeight()>
	//    9   19:istore          6
		getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect1, layoutparams, j, k);
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:aload_3         
	//   14   25:aload           4
	//   15   27:aload           7
	//   16   29:iload           5
	//   17   31:iload           6
	//   18   33:invokespecial   #913 <Method void getDesiredAnchoredChildRectWithoutConstraints(View, int, Rect, Rect, CoordinatorLayout$LayoutParams, int, int)>
		constrainChildRect(layoutparams, rect1, j, k);
	//   19   36:aload_0         
	//   20   37:aload           7
	//   21   39:aload           4
	//   22   41:iload           5
	//   23   43:iload           6
	//   24   45:invokespecial   #915 <Method void constrainChildRect(CoordinatorLayout$LayoutParams, Rect, int, int)>
	//   25   48:return          
	}

	void getLastChildRect(View view, Rect rect)
	{
		rect.set(((LayoutParams)view.getLayoutParams()).getLastChildRect());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    5:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    4    8:invokevirtual   #918 <Method Rect CoordinatorLayout$LayoutParams.getLastChildRect()>
	//    5   11:invokevirtual   #522 <Method void Rect.set(Rect)>
	//    6   14:return          
	}

	public final WindowInsetsCompat getLastWindowInsets()
	{
		return mLastInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//    2    4:areturn         
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollingParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:invokevirtual   #923 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	LayoutParams getResolvedLayoutParams(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          4
		if(!layoutparams.mBehaviorResolved)
	//*   4    9:aload           4
	//*   5   11:getfield        #926 <Field boolean CoordinatorLayout$LayoutParams.mBehaviorResolved>
	//*   6   14:ifne            126
		{
			Class class1 = ((Object) (view)).getClass();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #930 <Method Class Object.getClass()>
	//    9   21:astore_2        
			view = null;
	//   10   22:aconst_null     
	//   11   23:astore_1        
			View view1;
			do
			{
				view1 = view;
	//   12   24:aload_1         
	//   13   25:astore_3        
				if(class1 == null)
					break;
	//   14   26:aload_2         
	//   15   27:ifnull          54
				view = ((View) ((DefaultBehavior)class1.getAnnotation(android/support/design/widget/CoordinatorLayout$DefaultBehavior)));
	//   16   30:aload_2         
	//   17   31:ldc1            #13  <Class CoordinatorLayout$DefaultBehavior>
	//   18   33:invokevirtual   #934 <Method Annotation Class.getAnnotation(Class)>
	//   19   36:checkcast       #13  <Class CoordinatorLayout$DefaultBehavior>
	//   20   39:astore_1        
				view1 = view;
	//   21   40:aload_1         
	//   22   41:astore_3        
				if(view != null)
					break;
	//   23   42:aload_1         
	//   24   43:ifnonnull       54
				class1 = class1.getSuperclass();
	//   25   46:aload_2         
	//   26   47:invokevirtual   #937 <Method Class Class.getSuperclass()>
	//   27   50:astore_2        
			} while(true);
	//   28   51:goto            24
			if(view1 != null)
	//*  29   54:aload_3         
	//*  30   55:ifnull          120
				try
				{
					layoutparams.setBehavior((Behavior)((DefaultBehavior) (view1)).value().newInstance());
	//   31   58:aload           4
	//   32   60:aload_3         
	//   33   61:invokeinterface #940 <Method Class CoordinatorLayout$DefaultBehavior.value()>
	//   34   66:invokevirtual   #942 <Method Object Class.newInstance()>
	//   35   69:checkcast       #10  <Class CoordinatorLayout$Behavior>
	//   36   72:invokevirtual   #946 <Method void CoordinatorLayout$LayoutParams.setBehavior(CoordinatorLayout$Behavior)>
				}
	//*  37   75:goto            120
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  38   78:astore_1        
				{
					Log.e("CoordinatorLayout", (new StringBuilder()).append("Default behavior class ").append(((DefaultBehavior) (view1)).value().getName()).append(" could not be instantiated. Did you forget a default constructor?").toString(), ((Throwable) (view)));
	//   39   79:ldc1            #48  <String "CoordinatorLayout">
	//   40   81:new             #374 <Class StringBuilder>
	//   41   84:dup             
	//   42   85:invokespecial   #375 <Method void StringBuilder()>
	//   43   88:ldc2            #948 <String "Default behavior class ">
	//   44   91:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   45   94:aload_3         
	//   46   95:invokeinterface #940 <Method Class CoordinatorLayout$DefaultBehavior.value()>
	//   47  100:invokevirtual   #949 <Method String Class.getName()>
	//   48  103:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   49  106:ldc2            #951 <String " could not be instantiated. Did you forget a default constructor?">
	//   50  109:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   51  112:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   52  115:aload_1         
	//   53  116:invokestatic    #954 <Method int Log.e(String, String, Throwable)>
	//   54  119:pop             
				}
			layoutparams.mBehaviorResolved = true;
	//   55  120:aload           4
	//   56  122:iconst_1        
	//   57  123:putfield        #926 <Field boolean CoordinatorLayout$LayoutParams.mBehaviorResolved>
		}
		return layoutparams;
	//   58  126:aload           4
	//   59  128:areturn         
	}

	public Drawable getStatusBarBackground()
	{
		return mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field Drawable mStatusBarBackground>
	//    2    4:areturn         
	}

	protected int getSuggestedMinimumHeight()
	{
		return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:invokespecial   #960 <Method int ViewGroup.getSuggestedMinimumHeight()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #288 <Method int getPaddingTop()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #297 <Method int getPaddingBottom()>
	//    6   12:iadd            
	//    7   13:invokestatic    #285 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	protected int getSuggestedMinimumWidth()
	{
		return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
	//    0    0:aload_0         
	//    1    1:invokespecial   #963 <Method int ViewGroup.getSuggestedMinimumWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #265 <Method int getPaddingLeft()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #274 <Method int getPaddingRight()>
	//    6   12:iadd            
	//    7   13:invokestatic    #285 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	public boolean isPointInChildBounds(View view, int i, int j)
	{
		Rect rect;
		rect = acquireTempRect();
	//    0    0:invokestatic    #433 <Method Rect acquireTempRect()>
	//    1    3:astore          5
		getDescendantRect(view, rect);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload           5
	//    5    9:invokevirtual   #470 <Method void getDescendantRect(View, Rect)>
		boolean flag = rect.contains(i, j);
	//    6   12:aload           5
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #968 <Method boolean Rect.contains(int, int)>
	//   10   19:istore          4
		releaseTempRect(rect);
	//   11   21:aload           5
	//   12   23:invokestatic    #464 <Method void releaseTempRect(Rect)>
		return flag;
	//   13   26:iload           4
	//   14   28:ireturn         
		view;
	//   15   29:astore_1        
		releaseTempRect(rect);
	//   16   30:aload           5
	//   17   32:invokestatic    #464 <Method void releaseTempRect(Rect)>
		throw view;
	//   18   35:aload_1         
	//   19   36:athrow          
	}

	void offsetChildToAnchor(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          5
		if(layoutparams.mAnchorView != null)
	//*   4    9:aload           5
	//*   5   11:getfield        #972 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//*   6   14:ifnull          210
		{
			Rect rect = acquireTempRect();
	//    7   17:invokestatic    #433 <Method Rect acquireTempRect()>
	//    8   20:astore          6
			Rect rect1 = acquireTempRect();
	//    9   22:invokestatic    #433 <Method Rect acquireTempRect()>
	//   10   25:astore          7
			Rect rect2 = acquireTempRect();
	//   11   27:invokestatic    #433 <Method Rect acquireTempRect()>
	//   12   30:astore          8
			getDescendantRect(layoutparams.mAnchorView, rect);
	//   13   32:aload_0         
	//   14   33:aload           5
	//   15   35:getfield        #972 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   16   38:aload           6
	//   17   40:invokevirtual   #470 <Method void getDescendantRect(View, Rect)>
			getChildRect(view, false, rect1);
	//   18   43:aload_0         
	//   19   44:aload_1         
	//   20   45:iconst_0        
	//   21   46:aload           7
	//   22   48:invokevirtual   #766 <Method void getChildRect(View, boolean, Rect)>
			int j = view.getMeasuredWidth();
	//   23   51:aload_1         
	//   24   52:invokevirtual   #450 <Method int View.getMeasuredWidth()>
	//   25   55:istore_3        
			int k = view.getMeasuredHeight();
	//   26   56:aload_1         
	//   27   57:invokevirtual   #453 <Method int View.getMeasuredHeight()>
	//   28   60:istore          4
			getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, layoutparams, j, k);
	//   29   62:aload_0         
	//   30   63:aload_1         
	//   31   64:iload_2         
	//   32   65:aload           6
	//   33   67:aload           8
	//   34   69:aload           5
	//   35   71:iload_3         
	//   36   72:iload           4
	//   37   74:invokespecial   #913 <Method void getDesiredAnchoredChildRectWithoutConstraints(View, int, Rect, Rect, CoordinatorLayout$LayoutParams, int, int)>
			if(rect2.left != rect1.left || rect2.top != rect1.top)
	//*  38   77:aload           8
	//*  39   79:getfield        #271 <Field int Rect.left>
	//*  40   82:aload           7
	//*  41   84:getfield        #271 <Field int Rect.left>
	//*  42   87:icmpne          103
	//*  43   90:aload           8
	//*  44   92:getfield        #294 <Field int Rect.top>
	//*  45   95:aload           7
	//*  46   97:getfield        #294 <Field int Rect.top>
	//*  47  100:icmpeq          108
				i = 1;
	//   48  103:iconst_1        
	//   49  104:istore_2        
			else
	//*  50  105:goto            110
				i = 0;
	//   51  108:iconst_0        
	//   52  109:istore_2        
			constrainChildRect(layoutparams, rect2, j, k);
	//   53  110:aload_0         
	//   54  111:aload           5
	//   55  113:aload           8
	//   56  115:iload_3         
	//   57  116:iload           4
	//   58  118:invokespecial   #915 <Method void constrainChildRect(CoordinatorLayout$LayoutParams, Rect, int, int)>
			j = rect2.left - rect1.left;
	//   59  121:aload           8
	//   60  123:getfield        #271 <Field int Rect.left>
	//   61  126:aload           7
	//   62  128:getfield        #271 <Field int Rect.left>
	//   63  131:isub            
	//   64  132:istore_3        
			k = rect2.top - rect1.top;
	//   65  133:aload           8
	//   66  135:getfield        #294 <Field int Rect.top>
	//   67  138:aload           7
	//   68  140:getfield        #294 <Field int Rect.top>
	//   69  143:isub            
	//   70  144:istore          4
			if(j != 0)
	//*  71  146:iload_3         
	//*  72  147:ifeq            155
				ViewCompat.offsetLeftAndRight(view, j);
	//   73  150:aload_1         
	//   74  151:iload_3         
	//   75  152:invokestatic    #708 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			if(k != 0)
	//*  76  155:iload           4
	//*  77  157:ifeq            166
				ViewCompat.offsetTopAndBottom(view, k);
	//   78  160:aload_1         
	//   79  161:iload           4
	//   80  163:invokestatic    #711 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			if(i != 0)
	//*  81  166:iload_2         
	//*  82  167:ifeq            195
			{
				Behavior behavior = layoutparams.getBehavior();
	//   83  170:aload           5
	//   84  172:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   85  175:astore          9
				if(behavior != null)
	//*  86  177:aload           9
	//*  87  179:ifnull          195
					behavior.onDependentViewChanged(this, view, layoutparams.mAnchorView);
	//   88  182:aload           9
	//   89  184:aload_0         
	//   90  185:aload_1         
	//   91  186:aload           5
	//   92  188:getfield        #972 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   93  191:invokevirtual   #753 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
	//   94  194:pop             
			}
			releaseTempRect(rect);
	//   95  195:aload           6
	//   96  197:invokestatic    #464 <Method void releaseTempRect(Rect)>
			releaseTempRect(rect1);
	//   97  200:aload           7
	//   98  202:invokestatic    #464 <Method void releaseTempRect(Rect)>
			releaseTempRect(rect2);
	//   99  205:aload           8
	//  100  207:invokestatic    #464 <Method void releaseTempRect(Rect)>
		}
	//  101  210:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #975 <Method void ViewGroup.onAttachedToWindow()>
		resetTouchBehaviors();
	//    2    4:aload_0         
	//    3    5:invokespecial   #977 <Method void resetTouchBehaviors()>
		if(mNeedsPreDrawListener)
	//*   4    8:aload_0         
	//*   5    9:getfield        #739 <Field boolean mNeedsPreDrawListener>
	//*   6   12:ifeq            45
		{
			if(mOnPreDrawListener == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//*   9   19:ifnonnull       34
				mOnPreDrawListener = new b();
	//   10   22:aload_0         
	//   11   23:new             #30  <Class CoordinatorLayout$b>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #727 <Method void CoordinatorLayout$b(CoordinatorLayout)>
	//   15   31:putfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   16   34:aload_0         
	//   17   35:invokevirtual   #731 <Method ViewTreeObserver getViewTreeObserver()>
	//   18   38:aload_0         
	//   19   39:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//   20   42:invokevirtual   #737 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		if(mLastInsets == null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  21   45:aload_0         
	//*  22   46:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//*  23   49:ifnonnull       63
	//*  24   52:aload_0         
	//*  25   53:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  26   56:ifeq            63
			ViewCompat.requestApplyInsets(((View) (this)));
	//   27   59:aload_0         
	//   28   60:invokestatic    #980 <Method void ViewCompat.requestApplyInsets(View)>
		mIsAttachedToWindow = true;
	//   29   63:aload_0         
	//   30   64:iconst_1        
	//   31   65:putfield        #724 <Field boolean mIsAttachedToWindow>
	//   32   68:return          
	}

	final void onChildViewsChanged(int i)
	{
		int j1 = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #985 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore          4
		int k1 = mDependencySortedChildren.size();
	//    3    6:aload_0         
	//    4    7:getfield        #152 <Field List mDependencySortedChildren>
	//    5   10:invokeinterface #627 <Method int List.size()>
	//    6   15:istore          5
		Rect rect = acquireTempRect();
	//    7   17:invokestatic    #433 <Method Rect acquireTempRect()>
	//    8   20:astore          7
		Rect rect1 = acquireTempRect();
	//    9   22:invokestatic    #433 <Method Rect acquireTempRect()>
	//   10   25:astore          8
		Rect rect2 = acquireTempRect();
	//   11   27:invokestatic    #433 <Method Rect acquireTempRect()>
	//   12   30:astore          9
		for(int j = 0; j < k1; j++)
	//*  13   32:iconst_0        
	//*  14   33:istore_2        
	//*  15   34:iload_2         
	//*  16   35:iload           5
	//*  17   37:icmpge          537
		{
			View view = (View)mDependencySortedChildren.get(j);
	//   18   40:aload_0         
	//   19   41:getfield        #152 <Field List mDependencySortedChildren>
	//   20   44:iload_2         
	//   21   45:invokeinterface #630 <Method Object List.get(int)>
	//   22   50:checkcast       #327 <Class View>
	//   23   53:astore          10
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   55:aload           10
	//   25   57:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   60:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   27   63:astore          11
			if(i == 0 && view.getVisibility() == 8)
	//*  28   65:iload_1         
	//*  29   66:ifne            82
	//*  30   69:aload           10
	//*  31   71:invokevirtual   #758 <Method int View.getVisibility()>
	//*  32   74:bipush          8
	//*  33   76:icmpne          82
				continue;
	//   34   79:goto            530
			for(int k = 0; k < j; k++)
	//*  35   82:iconst_0        
	//*  36   83:istore_3        
	//*  37   84:iload_3         
	//*  38   85:iload_2         
	//*  39   86:icmpge          129
			{
				View view2 = (View)mDependencySortedChildren.get(k);
	//   40   89:aload_0         
	//   41   90:getfield        #152 <Field List mDependencySortedChildren>
	//   42   93:iload_3         
	//   43   94:invokeinterface #630 <Method Object List.get(int)>
	//   44   99:checkcast       #327 <Class View>
	//   45  102:astore          12
				if(layoutparams.mAnchorDirectChild == view2)
	//*  46  104:aload           11
	//*  47  106:getfield        #988 <Field View CoordinatorLayout$LayoutParams.mAnchorDirectChild>
	//*  48  109:aload           12
	//*  49  111:if_acmpne       122
					offsetChildToAnchor(view, j1);
	//   50  114:aload_0         
	//   51  115:aload           10
	//   52  117:iload           4
	//   53  119:invokevirtual   #990 <Method void offsetChildToAnchor(View, int)>
			}

	//   54  122:iload_3         
	//   55  123:iconst_1        
	//   56  124:iadd            
	//   57  125:istore_3        
	//*  58  126:goto            84
			getChildRect(view, true, rect1);
	//   59  129:aload_0         
	//   60  130:aload           10
	//   61  132:iconst_1        
	//   62  133:aload           8
	//   63  135:invokevirtual   #766 <Method void getChildRect(View, boolean, Rect)>
			if(layoutparams.insetEdge != 0 && !rect1.isEmpty())
	//*  64  138:aload           11
	//*  65  140:getfield        #993 <Field int CoordinatorLayout$LayoutParams.insetEdge>
	//*  66  143:ifeq            319
	//*  67  146:aload           8
	//*  68  148:invokevirtual   #525 <Method boolean Rect.isEmpty()>
	//*  69  151:ifne            319
			{
				int l = GravityCompat.getAbsoluteGravity(layoutparams.insetEdge, j1);
	//   70  154:aload           11
	//   71  156:getfield        #993 <Field int CoordinatorLayout$LayoutParams.insetEdge>
	//   72  159:iload           4
	//   73  161:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   74  164:istore_3        
				switch(l & 0x70)
	//*  75  165:iload_3         
	//*  76  166:bipush          112
	//*  77  168:iand            
				{
	//*  78  169:lookupswitch    2: default 196
	//	               48: 199
	//	               80: 220
	//*  79  196:goto            243
				case 48: // '0'
					rect.top = Math.max(rect.top, rect1.bottom);
	//   80  199:aload           7
	//   81  201:aload           7
	//   82  203:getfield        #294 <Field int Rect.top>
	//   83  206:aload           8
	//   84  208:getfield        #368 <Field int Rect.bottom>
	//   85  211:invokestatic    #285 <Method int Math.max(int, int)>
	//   86  214:putfield        #294 <Field int Rect.top>
					break;

	//*  87  217:goto            243
				case 80: // 'P'
					rect.bottom = Math.max(rect.bottom, getHeight() - rect1.top);
	//   88  220:aload           7
	//   89  222:aload           7
	//   90  224:getfield        #368 <Field int Rect.bottom>
	//   91  227:aload_0         
	//   92  228:invokevirtual   #262 <Method int getHeight()>
	//   93  231:aload           8
	//   94  233:getfield        #294 <Field int Rect.top>
	//   95  236:isub            
	//   96  237:invokestatic    #285 <Method int Math.max(int, int)>
	//   97  240:putfield        #368 <Field int Rect.bottom>
					break;
				}
				switch(l & 7)
	//*  98  243:iload_3         
	//*  99  244:bipush          7
	//* 100  246:iand            
				{
	//* 101  247:lookupswitch    2: default 272
	//	               3: 275
	//	               5: 296
	//* 102  272:goto            319
				case 3: // '\003'
					rect.left = Math.max(rect.left, rect1.right);
	//  103  275:aload           7
	//  104  277:aload           7
	//  105  279:getfield        #271 <Field int Rect.left>
	//  106  282:aload           8
	//  107  284:getfield        #362 <Field int Rect.right>
	//  108  287:invokestatic    #285 <Method int Math.max(int, int)>
	//  109  290:putfield        #271 <Field int Rect.left>
					break;

	//* 110  293:goto            319
				case 5: // '\005'
					rect.right = Math.max(rect.right, getWidth() - rect1.left);
	//  111  296:aload           7
	//  112  298:aload           7
	//  113  300:getfield        #362 <Field int Rect.right>
	//  114  303:aload_0         
	//  115  304:invokevirtual   #259 <Method int getWidth()>
	//  116  307:aload           8
	//  117  309:getfield        #271 <Field int Rect.left>
	//  118  312:isub            
	//  119  313:invokestatic    #285 <Method int Math.max(int, int)>
	//  120  316:putfield        #362 <Field int Rect.right>
					break;
				}
			}
			if(layoutparams.dodgeInsetEdges != 0 && view.getVisibility() == 0)
	//* 121  319:aload           11
	//* 122  321:getfield        #528 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//* 123  324:ifeq            345
	//* 124  327:aload           10
	//* 125  329:invokevirtual   #758 <Method int View.getVisibility()>
	//* 126  332:ifne            345
				offsetChildByInset(view, rect, j1);
	//  127  335:aload_0         
	//  128  336:aload           10
	//  129  338:aload           7
	//  130  340:iload           4
	//  131  342:invokespecial   #995 <Method void offsetChildByInset(View, Rect, int)>
			if(i != 2)
	//* 132  345:iload_1         
	//* 133  346:iconst_2        
	//* 134  347:icmpeq          379
			{
				getLastChildRect(view, rect2);
	//  135  350:aload_0         
	//  136  351:aload           10
	//  137  353:aload           9
	//  138  355:invokevirtual   #997 <Method void getLastChildRect(View, Rect)>
				if(rect2.equals(((Object) (rect1))))
	//* 139  358:aload           9
	//* 140  360:aload           8
	//* 141  362:invokevirtual   #1000 <Method boolean Rect.equals(Object)>
	//* 142  365:ifeq            371
					continue;
	//  143  368:goto            530
				recordLastChildRect(view, rect1);
	//  144  371:aload_0         
	//  145  372:aload           10
	//  146  374:aload           8
	//  147  376:invokevirtual   #1003 <Method void recordLastChildRect(View, Rect)>
			}
			for(int i1 = j + 1; i1 < k1; i1++)
	//* 148  379:iload_2         
	//* 149  380:iconst_1        
	//* 150  381:iadd            
	//* 151  382:istore_3        
	//* 152  383:iload_3         
	//* 153  384:iload           5
	//* 154  386:icmpge          530
			{
				View view1 = (View)mDependencySortedChildren.get(i1);
	//  155  389:aload_0         
	//  156  390:getfield        #152 <Field List mDependencySortedChildren>
	//  157  393:iload_3         
	//  158  394:invokeinterface #630 <Method Object List.get(int)>
	//  159  399:checkcast       #327 <Class View>
	//  160  402:astore          11
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  161  404:aload           11
	//  162  406:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  163  409:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//  164  412:astore          12
				Behavior behavior = layoutparams1.getBehavior();
	//  165  414:aload           12
	//  166  416:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//  167  419:astore          13
				if(behavior == null || !behavior.layoutDependsOn(this, view1, view))
					continue;
	//  168  421:aload           13
	//  169  423:ifnull          523
	//  170  426:aload           13
	//  171  428:aload_0         
	//  172  429:aload           11
	//  173  431:aload           10
	//  174  433:invokevirtual   #1006 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
	//  175  436:ifeq            523
				if(i == 0 && layoutparams1.getChangedAfterNestedScroll())
	//* 176  439:iload_1         
	//* 177  440:ifne            459
	//* 178  443:aload           12
	//* 179  445:invokevirtual   #1009 <Method boolean CoordinatorLayout$LayoutParams.getChangedAfterNestedScroll()>
	//* 180  448:ifeq            459
				{
					layoutparams1.resetChangedAfterNestedScroll();
	//  181  451:aload           12
	//  182  453:invokevirtual   #1012 <Method void CoordinatorLayout$LayoutParams.resetChangedAfterNestedScroll()>
					continue;
	//  183  456:goto            523
				}
				boolean flag;
				switch(i)
	//* 184  459:iload_1         
				{
	//* 185  460:lookupswitch    1: default 480
	//	               2: 483
	//* 186  480:goto            499
				case 2: // '\002'
					behavior.onDependentViewRemoved(this, view1, view);
	//  187  483:aload           13
	//  188  485:aload_0         
	//  189  486:aload           11
	//  190  488:aload           10
	//  191  490:invokevirtual   #1016 <Method void CoordinatorLayout$Behavior.onDependentViewRemoved(CoordinatorLayout, View, View)>
					flag = true;
	//  192  493:iconst_1        
	//  193  494:istore          6
					break;

	//* 194  496:goto            511
				default:
					flag = behavior.onDependentViewChanged(this, view1, view);
	//  195  499:aload           13
	//  196  501:aload_0         
	//  197  502:aload           11
	//  198  504:aload           10
	//  199  506:invokevirtual   #753 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
	//  200  509:istore          6
					break;
				}
				if(i == 1)
	//* 201  511:iload_1         
	//* 202  512:iconst_1        
	//* 203  513:icmpne          523
					layoutparams1.setChangedAfterNestedScroll(flag);
	//  204  516:aload           12
	//  205  518:iload           6
	//  206  520:invokevirtual   #1019 <Method void CoordinatorLayout$LayoutParams.setChangedAfterNestedScroll(boolean)>
			}

	//  207  523:iload_3         
	//  208  524:iconst_1        
	//  209  525:iadd            
	//  210  526:istore_3        
		}

	//  211  527:goto            383
	//  212  530:iload_2         
	//  213  531:iconst_1        
	//  214  532:iadd            
	//  215  533:istore_2        
	//* 216  534:goto            34
		releaseTempRect(rect);
	//  217  537:aload           7
	//  218  539:invokestatic    #464 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect1);
	//  219  542:aload           8
	//  220  544:invokestatic    #464 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect2);
	//  221  547:aload           9
	//  222  549:invokestatic    #464 <Method void releaseTempRect(Rect)>
	//  223  552:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1022 <Method void ViewGroup.onDetachedFromWindow()>
		resetTouchBehaviors();
	//    2    4:aload_0         
	//    3    5:invokespecial   #977 <Method void resetTouchBehaviors()>
		if(mNeedsPreDrawListener && mOnPreDrawListener != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #739 <Field boolean mNeedsPreDrawListener>
	//*   6   12:ifeq            33
	//*   7   15:aload_0         
	//*   8   16:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//*   9   19:ifnull          33
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #731 <Method ViewTreeObserver getViewTreeObserver()>
	//   12   26:aload_0         
	//   13   27:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//   14   30:invokevirtual   #1025 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		if(mNestedScrollingTarget != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #1027 <Field View mNestedScrollingTarget>
	//*  17   37:ifnull          48
			onStopNestedScroll(mNestedScrollingTarget);
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #1027 <Field View mNestedScrollingTarget>
	//   21   45:invokevirtual   #1030 <Method void onStopNestedScroll(View)>
		mIsAttachedToWindow = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #724 <Field boolean mIsAttachedToWindow>
	//   25   53:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1034 <Method void ViewGroup.onDraw(Canvas)>
		if(mDrawStatusBarBackground && mStatusBarBackground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #1036 <Field boolean mDrawStatusBarBackground>
	//*   5    9:ifeq            65
	//*   6   12:aload_0         
	//*   7   13:getfield        #227 <Field Drawable mStatusBarBackground>
	//*   8   16:ifnull          65
		{
			int i;
			if(mLastInsets != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//*  11   23:ifnull          37
				i = mLastInsets.getSystemWindowInsetTop();
	//   12   26:aload_0         
	//   13   27:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//   14   30:invokevirtual   #441 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   15   33:istore_2        
			else
	//*  16   34:goto            39
				i = 0;
	//   17   37:iconst_0        
	//   18   38:istore_2        
			if(i > 0)
	//*  19   39:iload_2         
	//*  20   40:ifle            65
			{
				mStatusBarBackground.setBounds(0, 0, getWidth(), i);
	//   21   43:aload_0         
	//   22   44:getfield        #227 <Field Drawable mStatusBarBackground>
	//   23   47:iconst_0        
	//   24   48:iconst_0        
	//   25   49:aload_0         
	//   26   50:invokevirtual   #259 <Method int getWidth()>
	//   27   53:iload_2         
	//   28   54:invokevirtual   #1039 <Method void Drawable.setBounds(int, int, int, int)>
				mStatusBarBackground.draw(canvas);
	//   29   57:aload_0         
	//   30   58:getfield        #227 <Field Drawable mStatusBarBackground>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #1042 <Method void Drawable.draw(Canvas)>
			}
		}
	//   33   65:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #622 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            13
			resetTouchBehaviors();
	//    5    9:aload_0         
	//    6   10:invokespecial   #977 <Method void resetTouchBehaviors()>
		boolean flag = performIntercept(motionevent, 0);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokespecial   #1045 <Method boolean performIntercept(MotionEvent, int)>
	//   11   19:istore_3        
		if(i == 1 || i == 3)
	//*  12   20:iload_2         
	//*  13   21:iconst_1        
	//*  14   22:icmpeq          30
	//*  15   25:iload_2         
	//*  16   26:iconst_3        
	//*  17   27:icmpne          34
			resetTouchBehaviors();
	//   18   30:aload_0         
	//   19   31:invokespecial   #977 <Method void resetTouchBehaviors()>
		return flag;
	//   20   34:iload_3         
	//   21   35:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #985 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_3        
		k = mDependencySortedChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #152 <Field List mDependencySortedChildren>
	//    5    9:invokeinterface #627 <Method int List.size()>
	//    6   14:istore          4
		for(i = 0; i < k; i++)
	//*   7   16:iconst_0        
	//*   8   17:istore_2        
	//*   9   18:iload_2         
	//*  10   19:iload           4
	//*  11   21:icmpge          96
		{
			View view = (View)mDependencySortedChildren.get(i);
	//   12   24:aload_0         
	//   13   25:getfield        #152 <Field List mDependencySortedChildren>
	//   14   28:iload_2         
	//   15   29:invokeinterface #630 <Method Object List.get(int)>
	//   16   34:checkcast       #327 <Class View>
	//   17   37:astore          6
			if(view.getVisibility() == 8)
	//*  18   39:aload           6
	//*  19   41:invokevirtual   #758 <Method int View.getVisibility()>
	//*  20   44:bipush          8
	//*  21   46:icmpne          52
				continue;
	//   22   49:goto            89
			Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//   23   52:aload           6
	//   24   54:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   57:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   26   60:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   27   63:astore          7
			if(behavior == null || !behavior.onLayoutChild(this, view, j))
	//*  28   65:aload           7
	//*  29   67:ifnull          82
	//*  30   70:aload           7
	//*  31   72:aload_0         
	//*  32   73:aload           6
	//*  33   75:iload_3         
	//*  34   76:invokevirtual   #1051 <Method boolean CoordinatorLayout$Behavior.onLayoutChild(CoordinatorLayout, View, int)>
	//*  35   79:ifne            89
				onLayoutChild(view, j);
	//   36   82:aload_0         
	//   37   83:aload           6
	//   38   85:iload_3         
	//   39   86:invokevirtual   #1053 <Method void onLayoutChild(View, int)>
		}

	//   40   89:iload_2         
	//   41   90:iconst_1        
	//   42   91:iadd            
	//   43   92:istore_2        
	//*  44   93:goto            18
	//   45   96:return          
	}

	public void onLayoutChild(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.checkAnchorChanged())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #1056 <Method boolean CoordinatorLayout$LayoutParams.checkAnchorChanged()>
	//*   6   12:ifeq            26
			throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
	//    7   15:new             #1058 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc2            #1060 <String "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.">
	//   10   22:invokespecial   #1061 <Method void IllegalStateException(String)>
	//   11   25:athrow          
		if(layoutparams.mAnchorView != null)
	//*  12   26:aload_3         
	//*  13   27:getfield        #972 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//*  14   30:ifnull          44
		{
			layoutChildWithAnchor(view, layoutparams.mAnchorView, i);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:aload_3         
	//   18   36:getfield        #972 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   19   39:iload_2         
	//   20   40:invokespecial   #1063 <Method void layoutChildWithAnchor(View, View, int)>
			return;
	//   21   43:return          
		}
		if(layoutparams.keyline >= 0)
	//*  22   44:aload_3         
	//*  23   45:getfield        #1066 <Field int CoordinatorLayout$LayoutParams.keyline>
	//*  24   48:iflt            62
		{
			layoutChildWithKeyline(view, layoutparams.keyline, i);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:aload_3         
	//   28   54:getfield        #1066 <Field int CoordinatorLayout$LayoutParams.keyline>
	//   29   57:iload_2         
	//   30   58:invokespecial   #1068 <Method void layoutChildWithKeyline(View, int, int)>
			return;
	//   31   61:return          
		} else
		{
			layoutChild(view, i);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:iload_2         
	//   35   65:invokespecial   #1070 <Method void layoutChild(View, int)>
			return;
	//   36   68:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		prepareChildren();
	//    0    0:aload_0         
	//    1    1:invokespecial   #900 <Method void prepareChildren()>
		ensurePreDrawListener();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1073 <Method void ensurePreDrawListener()>
		int l3 = getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #265 <Method int getPaddingLeft()>
	//    6   12:istore          14
		int i4 = getPaddingTop();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #288 <Method int getPaddingTop()>
	//    9   18:istore          15
		int j4 = getPaddingRight();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #274 <Method int getPaddingRight()>
	//   12   24:istore          16
		int k4 = getPaddingBottom();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #297 <Method int getPaddingBottom()>
	//   15   30:istore          17
		int l4 = ViewCompat.getLayoutDirection(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #985 <Method int ViewCompat.getLayoutDirection(View)>
	//   18   36:istore          18
		boolean flag;
		if(l4 == 1)
	//*  19   38:iload           18
	//*  20   40:iconst_1        
	//*  21   41:icmpne          50
			flag = true;
	//   22   44:iconst_1        
	//   23   45:istore          4
		else
	//*  24   47:goto            53
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore          4
		int i5 = android.view.View.MeasureSpec.getMode(i);
	//   27   53:iload_1         
	//   28   54:invokestatic    #1078 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   29   57:istore          19
		int j5 = android.view.View.MeasureSpec.getSize(i);
	//   30   59:iload_1         
	//   31   60:invokestatic    #1081 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   32   63:istore          20
		int k5 = android.view.View.MeasureSpec.getMode(j);
	//   33   65:iload_2         
	//   34   66:invokestatic    #1078 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   35   69:istore          21
		int l5 = android.view.View.MeasureSpec.getSize(j);
	//   36   71:iload_2         
	//   37   72:invokestatic    #1081 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   38   75:istore          22
		int k1 = getSuggestedMinimumWidth();
	//   39   77:aload_0         
	//   40   78:invokevirtual   #1082 <Method int getSuggestedMinimumWidth()>
	//   41   81:istore          9
		int j1 = getSuggestedMinimumHeight();
	//   42   83:aload_0         
	//   43   84:invokevirtual   #1083 <Method int getSuggestedMinimumHeight()>
	//   44   87:istore          8
		int i1 = 0;
	//   45   89:iconst_0        
	//   46   90:istore          7
		boolean flag1;
		if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  47   92:aload_0         
	//*  48   93:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//*  49   96:ifnull          112
	//*  50   99:aload_0         
	//*  51  100:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  52  103:ifeq            112
			flag1 = true;
	//   53  106:iconst_1        
	//   54  107:istore          5
		else
	//*  55  109:goto            115
			flag1 = false;
	//   56  112:iconst_0        
	//   57  113:istore          5
		int i6 = mDependencySortedChildren.size();
	//   58  115:aload_0         
	//   59  116:getfield        #152 <Field List mDependencySortedChildren>
	//   60  119:invokeinterface #627 <Method int List.size()>
	//   61  124:istore          23
		for(int l = 0; l < i6; l++)
	//*  62  126:iconst_0        
	//*  63  127:istore          6
	//*  64  129:iload           6
	//*  65  131:iload           23
	//*  66  133:icmpge          525
		{
			int k;
			View view;
			LayoutParams layoutparams;
label0:
			{
				view = (View)mDependencySortedChildren.get(l);
	//   67  136:aload_0         
	//   68  137:getfield        #152 <Field List mDependencySortedChildren>
	//   69  140:iload           6
	//   70  142:invokeinterface #630 <Method Object List.get(int)>
	//   71  147:checkcast       #327 <Class View>
	//   72  150:astore          24
				if(view.getVisibility() == 8)
	//*  73  152:aload           24
	//*  74  154:invokevirtual   #758 <Method int View.getVisibility()>
	//*  75  157:bipush          8
	//*  76  159:icmpne          165
					continue;
	//   77  162:goto            516
				layoutparams = (LayoutParams)view.getLayoutParams();
	//   78  165:aload           24
	//   79  167:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   80  170:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   81  173:astore          25
				boolean flag2 = false;
	//   82  175:iconst_0        
	//   83  176:istore          10
				k = ((int) (flag2));
	//   84  178:iload           10
	//   85  180:istore_3        
				if(layoutparams.keyline < 0)
					break label0;
	//   86  181:aload           25
	//   87  183:getfield        #1066 <Field int CoordinatorLayout$LayoutParams.keyline>
	//   88  186:iflt            302
				k = ((int) (flag2));
	//   89  189:iload           10
	//   90  191:istore_3        
				if(i5 == 0)
					break label0;
	//   91  192:iload           19
	//   92  194:ifeq            302
				int i2 = getKeyline(layoutparams.keyline);
	//   93  197:aload_0         
	//   94  198:aload           25
	//   95  200:getfield        #1066 <Field int CoordinatorLayout$LayoutParams.keyline>
	//   96  203:invokespecial   #481 <Method int getKeyline(int)>
	//   97  206:istore          11
				int l2 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), l4) & 7;
	//   98  208:aload           25
	//   99  210:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//  100  213:invokestatic    #479 <Method int resolveKeylineGravity(int)>
	//  101  216:iload           18
	//  102  218:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  103  221:bipush          7
	//  104  223:iand            
	//  105  224:istore          12
				if(l2 == 3 && !flag || l2 == 5 && flag)
	//* 106  226:iload           12
	//* 107  228:iconst_3        
	//* 108  229:icmpne          237
	//* 109  232:iload           4
	//* 110  234:ifeq            248
	//* 111  237:iload           12
	//* 112  239:iconst_5        
	//* 113  240:icmpne          264
	//* 114  243:iload           4
	//* 115  245:ifeq            264
				{
					k = Math.max(0, j5 - j4 - i2);
	//  116  248:iconst_0        
	//  117  249:iload           20
	//  118  251:iload           16
	//  119  253:isub            
	//  120  254:iload           11
	//  121  256:isub            
	//  122  257:invokestatic    #285 <Method int Math.max(int, int)>
	//  123  260:istore_3        
					break label0;
	//  124  261:goto            302
				}
				if(l2 != 5 || flag)
	//* 125  264:iload           12
	//* 126  266:iconst_5        
	//* 127  267:icmpne          275
	//* 128  270:iload           4
	//* 129  272:ifeq            292
				{
					k = ((int) (flag2));
	//  130  275:iload           10
	//  131  277:istore_3        
					if(l2 != 3)
						break label0;
	//  132  278:iload           12
	//  133  280:iconst_3        
	//  134  281:icmpne          302
					k = ((int) (flag2));
	//  135  284:iload           10
	//  136  286:istore_3        
					if(!flag)
						break label0;
	//  137  287:iload           4
	//  138  289:ifeq            302
				}
				k = Math.max(0, i2 - l3);
	//  139  292:iconst_0        
	//  140  293:iload           11
	//  141  295:iload           14
	//  142  297:isub            
	//  143  298:invokestatic    #285 <Method int Math.max(int, int)>
	//  144  301:istore_3        
			}
			int j2 = i;
	//  145  302:iload_1         
	//  146  303:istore          11
			int i3 = j;
	//  147  305:iload_2         
	//  148  306:istore          12
			int k3 = j2;
	//  149  308:iload           11
	//  150  310:istore          13
			int l1 = i3;
	//  151  312:iload           12
	//  152  314:istore          10
			if(flag1)
	//* 153  316:iload           5
	//* 154  318:ifeq            403
			{
				k3 = j2;
	//  155  321:iload           11
	//  156  323:istore          13
				l1 = i3;
	//  157  325:iload           12
	//  158  327:istore          10
				if(!ViewCompat.getFitsSystemWindows(view))
	//* 159  329:aload           24
	//* 160  331:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 161  334:ifne            403
				{
					int j3 = mLastInsets.getSystemWindowInsetLeft();
	//  162  337:aload_0         
	//  163  338:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//  164  341:invokevirtual   #438 <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//  165  344:istore          12
					k3 = mLastInsets.getSystemWindowInsetRight();
	//  166  346:aload_0         
	//  167  347:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//  168  350:invokevirtual   #444 <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//  169  353:istore          13
					l1 = mLastInsets.getSystemWindowInsetTop();
	//  170  355:aload_0         
	//  171  356:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//  172  359:invokevirtual   #441 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//  173  362:istore          10
					int k2 = mLastInsets.getSystemWindowInsetBottom();
	//  174  364:aload_0         
	//  175  365:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//  176  368:invokevirtual   #447 <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//  177  371:istore          11
					k3 = android.view.View.MeasureSpec.makeMeasureSpec(j5 - (j3 + k3), i5);
	//  178  373:iload           20
	//  179  375:iload           12
	//  180  377:iload           13
	//  181  379:iadd            
	//  182  380:isub            
	//  183  381:iload           19
	//  184  383:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  185  386:istore          13
					l1 = android.view.View.MeasureSpec.makeMeasureSpec(l5 - (l1 + k2), k5);
	//  186  388:iload           22
	//  187  390:iload           10
	//  188  392:iload           11
	//  189  394:iadd            
	//  190  395:isub            
	//  191  396:iload           21
	//  192  398:invokestatic    #1086 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  193  401:istore          10
				}
			}
			Behavior behavior = layoutparams.getBehavior();
	//  194  403:aload           25
	//  195  405:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//  196  408:astore          26
			if(behavior == null || !behavior.onMeasureChild(this, view, k3, k, l1, 0))
	//* 197  410:aload           26
	//* 198  412:ifnull          432
	//* 199  415:aload           26
	//* 200  417:aload_0         
	//* 201  418:aload           24
	//* 202  420:iload           13
	//* 203  422:iload_3         
	//* 204  423:iload           10
	//* 205  425:iconst_0        
	//* 206  426:invokevirtual   #1090 <Method boolean CoordinatorLayout$Behavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
	//* 207  429:ifne            444
				onMeasureChild(view, k3, k, l1, 0);
	//  208  432:aload_0         
	//  209  433:aload           24
	//  210  435:iload           13
	//  211  437:iload_3         
	//  212  438:iload           10
	//  213  440:iconst_0        
	//  214  441:invokevirtual   #1093 <Method void onMeasureChild(View, int, int, int, int)>
			k1 = Math.max(k1, view.getMeasuredWidth() + (l3 + j4) + layoutparams.leftMargin + layoutparams.rightMargin);
	//  215  444:iload           9
	//  216  446:aload           24
	//  217  448:invokevirtual   #450 <Method int View.getMeasuredWidth()>
	//  218  451:iload           14
	//  219  453:iload           16
	//  220  455:iadd            
	//  221  456:iadd            
	//  222  457:aload           25
	//  223  459:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//  224  462:iadd            
	//  225  463:aload           25
	//  226  465:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//  227  468:iadd            
	//  228  469:invokestatic    #285 <Method int Math.max(int, int)>
	//  229  472:istore          9
			j1 = Math.max(j1, view.getMeasuredHeight() + (i4 + k4) + layoutparams.topMargin + layoutparams.bottomMargin);
	//  230  474:iload           8
	//  231  476:aload           24
	//  232  478:invokevirtual   #453 <Method int View.getMeasuredHeight()>
	//  233  481:iload           15
	//  234  483:iload           17
	//  235  485:iadd            
	//  236  486:iadd            
	//  237  487:aload           25
	//  238  489:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//  239  492:iadd            
	//  240  493:aload           25
	//  241  495:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//  242  498:iadd            
	//  243  499:invokestatic    #285 <Method int Math.max(int, int)>
	//  244  502:istore          8
			i1 = View.combineMeasuredStates(i1, view.getMeasuredState());
	//  245  504:iload           7
	//  246  506:aload           24
	//  247  508:invokevirtual   #1096 <Method int View.getMeasuredState()>
	//  248  511:invokestatic    #1099 <Method int View.combineMeasuredStates(int, int)>
	//  249  514:istore          7
		}

	//  250  516:iload           6
	//  251  518:iconst_1        
	//  252  519:iadd            
	//  253  520:istore          6
	//* 254  522:goto            129
		setMeasuredDimension(View.resolveSizeAndState(k1, i, 0xff000000 & i1), View.resolveSizeAndState(j1, j, i1 << 16));
	//  255  525:aload_0         
	//  256  526:iload           9
	//  257  528:iload_1         
	//  258  529:ldc2            #1100 <Int 0xff000000>
	//  259  532:iload           7
	//  260  534:iand            
	//  261  535:invokestatic    #1103 <Method int View.resolveSizeAndState(int, int, int)>
	//  262  538:iload           8
	//  263  540:iload_2         
	//  264  541:iload           7
	//  265  543:bipush          16
	//  266  545:ishl            
	//  267  546:invokestatic    #1103 <Method int View.resolveSizeAndState(int, int, int)>
	//  268  549:invokevirtual   #1106 <Method void setMeasuredDimension(int, int)>
	//  269  552:return          
	}

	public void onMeasureChild(View view, int i, int j, int k, int l)
	{
		measureChildWithMargins(view, i, j, k, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokevirtual   #1109 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   11:return          
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int j = getChildCount();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #315 <Method int getChildCount()>
	//    4    7:istore          6
		for(int i = 0; i < j;)
	//*   5    9:iconst_0        
	//*   6   10:istore          5
	//*   7   12:iload           5
	//*   8   14:iload           6
	//*   9   16:icmpge          116
		{
			View view1 = getChildAt(i);
	//   10   19:aload_0         
	//   11   20:iload           5
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          9
			boolean flag2;
			if(view1.getVisibility() == 8)
	//*  14   27:aload           9
	//*  15   29:invokevirtual   #758 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          44
			{
				flag2 = flag1;
	//   18   37:iload           7
	//   19   39:istore          8
			} else
	//*  20   41:goto            103
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   21   44:aload           9
	//   22   46:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   49:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   24   52:astore          10
				if(!((LayoutParams) (obj)).isNestedScrollAccepted())
	//*  25   54:aload           10
	//*  26   56:invokevirtual   #1114 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted()>
	//*  27   59:ifne            69
				{
					flag2 = flag1;
	//   28   62:iload           7
	//   29   64:istore          8
				} else
	//*  30   66:goto            103
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   31   69:aload           10
	//   32   71:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   33   74:astore          10
					flag2 = flag1;
	//   34   76:iload           7
	//   35   78:istore          8
					if(obj != null)
	//*  36   80:aload           10
	//*  37   82:ifnull          103
						flag2 = flag1 | ((Behavior) (obj)).onNestedFling(this, view1, view, f, f1, flag);
	//   38   85:iload           7
	//   39   87:aload           10
	//   40   89:aload_0         
	//   41   90:aload           9
	//   42   92:aload_1         
	//   43   93:fload_2         
	//   44   94:fload_3         
	//   45   95:iload           4
	//   46   97:invokevirtual   #1117 <Method boolean CoordinatorLayout$Behavior.onNestedFling(CoordinatorLayout, View, View, float, float, boolean)>
	//   47  100:ior             
	//   48  101:istore          8
				}
			}
			i++;
	//   49  103:iload           5
	//   50  105:iconst_1        
	//   51  106:iadd            
	//   52  107:istore          5
			flag1 = flag2;
	//   53  109:iload           8
	//   54  111:istore          7
		}

	//*  55  113:goto            12
		if(flag1)
	//*  56  116:iload           7
	//*  57  118:ifeq            126
			onChildViewsChanged(1);
	//   58  121:aload_0         
	//   59  122:iconst_1        
	//   60  123:invokevirtual   #1119 <Method void onChildViewsChanged(int)>
		return flag1;
	//   61  126:iload           7
	//   62  128:ireturn         
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int j = getChildCount();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #315 <Method int getChildCount()>
	//    4    7:istore          5
		for(int i = 0; i < j;)
	//*   5    9:iconst_0        
	//*   6   10:istore          4
	//*   7   12:iload           4
	//*   8   14:iload           5
	//*   9   16:icmpge          114
		{
			View view1 = getChildAt(i);
	//   10   19:aload_0         
	//   11   20:iload           4
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          8
			boolean flag1;
			if(view1.getVisibility() == 8)
	//*  14   27:aload           8
	//*  15   29:invokevirtual   #758 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          44
			{
				flag1 = flag;
	//   18   37:iload           6
	//   19   39:istore          7
			} else
	//*  20   41:goto            101
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   21   44:aload           8
	//   22   46:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   49:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   24   52:astore          9
				if(!((LayoutParams) (obj)).isNestedScrollAccepted())
	//*  25   54:aload           9
	//*  26   56:invokevirtual   #1114 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted()>
	//*  27   59:ifne            69
				{
					flag1 = flag;
	//   28   62:iload           6
	//   29   64:istore          7
				} else
	//*  30   66:goto            101
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   31   69:aload           9
	//   32   71:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   33   74:astore          9
					flag1 = flag;
	//   34   76:iload           6
	//   35   78:istore          7
					if(obj != null)
	//*  36   80:aload           9
	//*  37   82:ifnull          101
						flag1 = flag | ((Behavior) (obj)).onNestedPreFling(this, view1, view, f, f1);
	//   38   85:iload           6
	//   39   87:aload           9
	//   40   89:aload_0         
	//   41   90:aload           8
	//   42   92:aload_1         
	//   43   93:fload_2         
	//   44   94:fload_3         
	//   45   95:invokevirtual   #1124 <Method boolean CoordinatorLayout$Behavior.onNestedPreFling(CoordinatorLayout, View, View, float, float)>
	//   46   98:ior             
	//   47   99:istore          7
				}
			}
			i++;
	//   48  101:iload           4
	//   49  103:iconst_1        
	//   50  104:iadd            
	//   51  105:istore          4
			flag = flag1;
	//   52  107:iload           7
	//   53  109:istore          6
		}

	//*  54  111:goto            12
		return flag;
	//   55  114:iload           6
	//   56  116:ireturn         
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		int l1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          10
		int l = 0;
	//    2    3:iconst_0        
	//    3    4:istore          6
		int k = 0;
	//    4    6:iconst_0        
	//    5    7:istore          5
		int j2 = getChildCount();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #315 <Method int getChildCount()>
	//    8   13:istore          12
		for(int i1 = 0; i1 < j2;)
	//*   9   15:iconst_0        
	//*  10   16:istore          7
	//*  11   18:iload           7
	//*  12   20:iload           12
	//*  13   22:icmpge          246
		{
			View view1 = getChildAt(i1);
	//   14   25:aload_0         
	//   15   26:iload           7
	//   16   28:invokevirtual   #319 <Method View getChildAt(int)>
	//   17   31:astore          13
			int j1;
			int k1;
			int i2;
			if(view1.getVisibility() == 8)
	//*  18   33:aload           13
	//*  19   35:invokevirtual   #758 <Method int View.getVisibility()>
	//*  20   38:bipush          8
	//*  21   40:icmpne          58
			{
				i2 = l1;
	//   22   43:iload           10
	//   23   45:istore          11
				j1 = l;
	//   24   47:iload           6
	//   25   49:istore          8
				k1 = k;
	//   26   51:iload           5
	//   27   53:istore          9
			} else
	//*  28   55:goto            225
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   29   58:aload           13
	//   30   60:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   31   63:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   32   66:astore          14
				if(!((LayoutParams) (obj)).isNestedScrollAccepted())
	//*  33   68:aload           14
	//*  34   70:invokevirtual   #1114 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted()>
	//*  35   73:ifne            91
				{
					i2 = l1;
	//   36   76:iload           10
	//   37   78:istore          11
					j1 = l;
	//   38   80:iload           6
	//   39   82:istore          8
					k1 = k;
	//   40   84:iload           5
	//   41   86:istore          9
				} else
	//*  42   88:goto            225
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   43   91:aload           14
	//   44   93:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   45   96:astore          14
					i2 = l1;
	//   46   98:iload           10
	//   47  100:istore          11
					j1 = l;
	//   48  102:iload           6
	//   49  104:istore          8
					k1 = k;
	//   50  106:iload           5
	//   51  108:istore          9
					if(obj != null)
	//*  52  110:aload           14
	//*  53  112:ifnull          225
					{
						int ai1[] = mTempIntPair;
	//   54  115:aload_0         
	//   55  116:getfield        #163 <Field int[] mTempIntPair>
	//   56  119:astore          15
						mTempIntPair[1] = 0;
	//   57  121:aload_0         
	//   58  122:getfield        #163 <Field int[] mTempIntPair>
	//   59  125:iconst_1        
	//   60  126:iconst_0        
	//   61  127:iastore         
						ai1[0] = 0;
	//   62  128:aload           15
	//   63  130:iconst_0        
	//   64  131:iconst_0        
	//   65  132:iastore         
						((Behavior) (obj)).onNestedPreScroll(this, view1, view, i, j, mTempIntPair);
	//   66  133:aload           14
	//   67  135:aload_0         
	//   68  136:aload           13
	//   69  138:aload_1         
	//   70  139:iload_2         
	//   71  140:iload_3         
	//   72  141:aload_0         
	//   73  142:getfield        #163 <Field int[] mTempIntPair>
	//   74  145:invokevirtual   #1129 <Method void CoordinatorLayout$Behavior.onNestedPreScroll(CoordinatorLayout, View, View, int, int, int[])>
						if(i > 0)
	//*  75  148:iload_2         
	//*  76  149:ifle            168
							k = Math.max(l1, mTempIntPair[0]);
	//   77  152:iload           10
	//   78  154:aload_0         
	//   79  155:getfield        #163 <Field int[] mTempIntPair>
	//   80  158:iconst_0        
	//   81  159:iaload          
	//   82  160:invokestatic    #285 <Method int Math.max(int, int)>
	//   83  163:istore          5
						else
	//*  84  165:goto            181
							k = Math.min(l1, mTempIntPair[0]);
	//   85  168:iload           10
	//   86  170:aload_0         
	//   87  171:getfield        #163 <Field int[] mTempIntPair>
	//   88  174:iconst_0        
	//   89  175:iaload          
	//   90  176:invokestatic    #282 <Method int Math.min(int, int)>
	//   91  179:istore          5
						if(j > 0)
	//*  92  181:iload_3         
	//*  93  182:ifle            201
							l = Math.max(l, mTempIntPair[1]);
	//   94  185:iload           6
	//   95  187:aload_0         
	//   96  188:getfield        #163 <Field int[] mTempIntPair>
	//   97  191:iconst_1        
	//   98  192:iaload          
	//   99  193:invokestatic    #285 <Method int Math.max(int, int)>
	//  100  196:istore          6
						else
	//* 101  198:goto            214
							l = Math.min(l, mTempIntPair[1]);
	//  102  201:iload           6
	//  103  203:aload_0         
	//  104  204:getfield        #163 <Field int[] mTempIntPair>
	//  105  207:iconst_1        
	//  106  208:iaload          
	//  107  209:invokestatic    #282 <Method int Math.min(int, int)>
	//  108  212:istore          6
						k1 = 1;
	//  109  214:iconst_1        
	//  110  215:istore          9
						j1 = l;
	//  111  217:iload           6
	//  112  219:istore          8
						i2 = k;
	//  113  221:iload           5
	//  114  223:istore          11
					}
				}
			}
			i1++;
	//  115  225:iload           7
	//  116  227:iconst_1        
	//  117  228:iadd            
	//  118  229:istore          7
			l1 = i2;
	//  119  231:iload           11
	//  120  233:istore          10
			l = j1;
	//  121  235:iload           8
	//  122  237:istore          6
			k = k1;
	//  123  239:iload           9
	//  124  241:istore          5
		}

	//* 125  243:goto            18
		ai[0] = l1;
	//  126  246:aload           4
	//  127  248:iconst_0        
	//  128  249:iload           10
	//  129  251:iastore         
		ai[1] = l;
	//  130  252:aload           4
	//  131  254:iconst_1        
	//  132  255:iload           6
	//  133  257:iastore         
		if(k != 0)
	//* 134  258:iload           5
	//* 135  260:ifeq            268
			onChildViewsChanged(1);
	//  136  263:aload_0         
	//  137  264:iconst_1        
	//  138  265:invokevirtual   #1119 <Method void onChildViewsChanged(int)>
	//  139  268:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		int j1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #315 <Method int getChildCount()>
	//    2    4:istore          8
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		for(int i1 = 0; i1 < j1; i1++)
	//*   5    9:iconst_0        
	//*   6   10:istore          6
	//*   7   12:iload           6
	//*   8   14:iload           8
	//*   9   16:icmpge          100
		{
			View view1 = getChildAt(i1);
	//   10   19:aload_0         
	//   11   20:iload           6
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          9
			if(view1.getVisibility() == 8)
	//*  14   27:aload           9
	//*  15   29:invokevirtual   #758 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          40
				continue;
	//   18   37:goto            91
			Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   19   40:aload           9
	//   20   42:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   22   48:astore          10
			if(!((LayoutParams) (obj)).isNestedScrollAccepted())
	//*  23   50:aload           10
	//*  24   52:invokevirtual   #1114 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted()>
	//*  25   55:ifne            61
				continue;
	//   26   58:goto            91
			obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   27   61:aload           10
	//   28   63:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   29   66:astore          10
			if(obj != null)
	//*  30   68:aload           10
	//*  31   70:ifnull          91
			{
				((Behavior) (obj)).onNestedScroll(this, view1, view, i, j, k, l);
	//   32   73:aload           10
	//   33   75:aload_0         
	//   34   76:aload           9
	//   35   78:aload_1         
	//   36   79:iload_2         
	//   37   80:iload_3         
	//   38   81:iload           4
	//   39   83:iload           5
	//   40   85:invokevirtual   #1133 <Method void CoordinatorLayout$Behavior.onNestedScroll(CoordinatorLayout, View, View, int, int, int, int)>
				flag = true;
	//   41   88:iconst_1        
	//   42   89:istore          7
			}
		}

	//   43   91:iload           6
	//   44   93:iconst_1        
	//   45   94:iadd            
	//   46   95:istore          6
	//*  47   97:goto            12
		if(flag)
	//*  48  100:iload           7
	//*  49  102:ifeq            110
			onChildViewsChanged(1);
	//   50  105:aload_0         
	//   51  106:iconst_1        
	//   52  107:invokevirtual   #1119 <Method void onChildViewsChanged(int)>
	//   53  110:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		mNestedScrollingParentHelper.onNestedScrollAccepted(view, view1, i);
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #1136 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int)>
		mNestedScrollingDirectChild = view;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #1138 <Field View mNestedScrollingDirectChild>
		mNestedScrollingTarget = view1;
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:putfield        #1027 <Field View mNestedScrollingTarget>
		int k = getChildCount();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #315 <Method int getChildCount()>
	//   14   24:istore          5
		for(int j = 0; j < k; j++)
	//*  15   26:iconst_0        
	//*  16   27:istore          4
	//*  17   29:iload           4
	//*  18   31:iload           5
	//*  19   33:icmpge          97
		{
			View view2 = getChildAt(j);
	//   20   36:aload_0         
	//   21   37:iload           4
	//   22   39:invokevirtual   #319 <Method View getChildAt(int)>
	//   23   42:astore          6
			Object obj = ((Object) ((LayoutParams)view2.getLayoutParams()));
	//   24   44:aload           6
	//   25   46:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   49:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   27   52:astore          7
			if(!((LayoutParams) (obj)).isNestedScrollAccepted())
	//*  28   54:aload           7
	//*  29   56:invokevirtual   #1114 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted()>
	//*  30   59:ifne            65
				continue;
	//   31   62:goto            88
			obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   32   65:aload           7
	//   33   67:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   34   70:astore          7
			if(obj != null)
	//*  35   72:aload           7
	//*  36   74:ifnull          88
				((Behavior) (obj)).onNestedScrollAccepted(this, view2, view, view1, i);
	//   37   77:aload           7
	//   38   79:aload_0         
	//   39   80:aload           6
	//   40   82:aload_1         
	//   41   83:aload_2         
	//   42   84:iload_3         
	//   43   85:invokevirtual   #1141 <Method void CoordinatorLayout$Behavior.onNestedScrollAccepted(CoordinatorLayout, View, View, View, int)>
		}

	//   44   88:iload           4
	//   45   90:iconst_1        
	//   46   91:iadd            
	//   47   92:istore          4
	//*  48   94:goto            29
	//   49   97:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class CoordinatorLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1145 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #22  <Class CoordinatorLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1149 <Method Parcelable CoordinatorLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #1145 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		parcelable = ((Parcelable) (((SavedState) (parcelable)).behaviorStates));
	//   14   26:aload_1         
	//   15   27:getfield        #1153 <Field SparseArray CoordinatorLayout$SavedState.behaviorStates>
	//   16   30:astore_1        
		int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
		for(int j = getChildCount(); i < j; i++)
	//*  19   33:aload_0         
	//*  20   34:invokevirtual   #315 <Method int getChildCount()>
	//*  21   37:istore_3        
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          112
		{
			View view = getChildAt(i);
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:invokevirtual   #319 <Method View getChildAt(int)>
	//   28   48:astore          5
			int k = view.getId();
	//   29   50:aload           5
	//   30   52:invokevirtual   #1156 <Method int View.getId()>
	//   31   55:istore          4
			Behavior behavior = getResolvedLayoutParams(view).getBehavior();
	//   32   57:aload_0         
	//   33   58:aload           5
	//   34   60:invokevirtual   #663 <Method CoordinatorLayout$LayoutParams getResolvedLayoutParams(View)>
	//   35   63:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   36   66:astore          6
			if(k == -1 || behavior == null)
				continue;
	//   37   68:iload           4
	//   38   70:iconst_m1       
	//   39   71:icmpeq          105
	//   40   74:aload           6
	//   41   76:ifnull          105
			Parcelable parcelable1 = (Parcelable)((SparseArray) (parcelable)).get(k);
	//   42   79:aload_1         
	//   43   80:iload           4
	//   44   82:invokevirtual   #1159 <Method Object SparseArray.get(int)>
	//   45   85:checkcast       #1161 <Class Parcelable>
	//   46   88:astore          7
			if(parcelable1 != null)
	//*  47   90:aload           7
	//*  48   92:ifnull          105
				behavior.onRestoreInstanceState(this, view, parcelable1);
	//   49   95:aload           6
	//   50   97:aload_0         
	//   51   98:aload           5
	//   52  100:aload           7
	//   53  102:invokevirtual   #1164 <Method void CoordinatorLayout$Behavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
		}

	//   54  105:iload_2         
	//   55  106:iconst_1        
	//   56  107:iadd            
	//   57  108:istore_2        
	//*  58  109:goto            38
	//   59  112:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #22  <Class CoordinatorLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1167 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1169 <Method void CoordinatorLayout$SavedState(Parcelable)>
	//    5   11:astore          4
		SparseArray sparsearray = new SparseArray();
	//    6   13:new             #1158 <Class SparseArray>
	//    7   16:dup             
	//    8   17:invokespecial   #1170 <Method void SparseArray()>
	//    9   20:astore          5
		int i = 0;
	//   10   22:iconst_0        
	//   11   23:istore_1        
		for(int j = getChildCount(); i < j; i++)
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #315 <Method int getChildCount()>
	//*  14   28:istore_2        
	//*  15   29:iload_1         
	//*  16   30:iload_2         
	//*  17   31:icmpge          100
		{
			Object obj = ((Object) (getChildAt(i)));
	//   18   34:aload_0         
	//   19   35:iload_1         
	//   20   36:invokevirtual   #319 <Method View getChildAt(int)>
	//   21   39:astore          6
			int k = ((View) (obj)).getId();
	//   22   41:aload           6
	//   23   43:invokevirtual   #1156 <Method int View.getId()>
	//   24   46:istore_3        
			Behavior behavior = ((LayoutParams)((View) (obj)).getLayoutParams()).getBehavior();
	//   25   47:aload           6
	//   26   49:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   52:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   28   55:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   29   58:astore          7
			if(k == -1 || behavior == null)
				continue;
	//   30   60:iload_3         
	//   31   61:iconst_m1       
	//   32   62:icmpeq          93
	//   33   65:aload           7
	//   34   67:ifnull          93
			obj = ((Object) (behavior.onSaveInstanceState(this, ((View) (obj)))));
	//   35   70:aload           7
	//   36   72:aload_0         
	//   37   73:aload           6
	//   38   75:invokevirtual   #1173 <Method Parcelable CoordinatorLayout$Behavior.onSaveInstanceState(CoordinatorLayout, View)>
	//   39   78:astore          6
			if(obj != null)
	//*  40   80:aload           6
	//*  41   82:ifnull          93
				sparsearray.append(k, obj);
	//   42   85:aload           5
	//   43   87:iload_3         
	//   44   88:aload           6
	//   45   90:invokevirtual   #1176 <Method void SparseArray.append(int, Object)>
		}

	//   46   93:iload_1         
	//   47   94:iconst_1        
	//   48   95:iadd            
	//   49   96:istore_1        
	//*  50   97:goto            29
		savedstate.behaviorStates = sparsearray;
	//   51  100:aload           4
	//   52  102:aload           5
	//   53  104:putfield        #1153 <Field SparseArray CoordinatorLayout$SavedState.behaviorStates>
		return ((Parcelable) (savedstate));
	//   54  107:aload           4
	//   55  109:areturn         
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		int k = getChildCount();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #315 <Method int getChildCount()>
	//    4    7:istore          5
		for(int j = 0; j < k; j++)
	//*   5    9:iconst_0        
	//*   6   10:istore          4
	//*   7   12:iload           4
	//*   8   14:iload           5
	//*   9   16:icmpge          107
		{
			View view2 = getChildAt(j);
	//   10   19:aload_0         
	//   11   20:iload           4
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          8
			if(view2.getVisibility() == 8)
	//*  14   27:aload           8
	//*  15   29:invokevirtual   #758 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          40
				continue;
	//   18   37:goto            98
			LayoutParams layoutparams = (LayoutParams)view2.getLayoutParams();
	//   19   40:aload           8
	//   20   42:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   22   48:astore          9
			Behavior behavior = layoutparams.getBehavior();
	//   23   50:aload           9
	//   24   52:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   25   55:astore          10
			if(behavior != null)
	//*  26   57:aload           10
	//*  27   59:ifnull          92
			{
				boolean flag1 = behavior.onStartNestedScroll(this, view2, view, view1, i);
	//   28   62:aload           10
	//   29   64:aload_0         
	//   30   65:aload           8
	//   31   67:aload_1         
	//   32   68:aload_2         
	//   33   69:iload_3         
	//   34   70:invokevirtual   #1181 <Method boolean CoordinatorLayout$Behavior.onStartNestedScroll(CoordinatorLayout, View, View, View, int)>
	//   35   73:istore          7
				flag |= flag1;
	//   36   75:iload           6
	//   37   77:iload           7
	//   38   79:ior             
	//   39   80:istore          6
				layoutparams.acceptNestedScroll(flag1);
	//   40   82:aload           9
	//   41   84:iload           7
	//   42   86:invokevirtual   #1184 <Method void CoordinatorLayout$LayoutParams.acceptNestedScroll(boolean)>
			} else
	//*  43   89:goto            98
			{
				layoutparams.acceptNestedScroll(false);
	//   44   92:aload           9
	//   45   94:iconst_0        
	//   46   95:invokevirtual   #1184 <Method void CoordinatorLayout$LayoutParams.acceptNestedScroll(boolean)>
			}
		}

	//   47   98:iload           4
	//   48  100:iconst_1        
	//   49  101:iadd            
	//   50  102:istore          4
	//*  51  104:goto            12
		return flag;
	//   52  107:iload           6
	//   53  109:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		mNestedScrollingParentHelper.onStopNestedScroll(view);
	//    0    0:aload_0         
	//    1    1:getfield        #170 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1185 <Method void NestedScrollingParentHelper.onStopNestedScroll(View)>
		int j = getChildCount();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #315 <Method int getChildCount()>
	//    6   12:istore_3        
		for(int i = 0; i < j; i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_2        
	//*   9   15:iload_2         
	//*  10   16:iload_3         
	//*  11   17:icmpge          86
		{
			View view1 = getChildAt(i);
	//   12   20:aload_0         
	//   13   21:iload_2         
	//   14   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   15   25:astore          4
			LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   16   27:aload           4
	//   17   29:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   32:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   19   35:astore          5
			if(!layoutparams.isNestedScrollAccepted())
	//*  20   37:aload           5
	//*  21   39:invokevirtual   #1114 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted()>
	//*  22   42:ifne            48
				continue;
	//   23   45:goto            79
			Behavior behavior = layoutparams.getBehavior();
	//   24   48:aload           5
	//   25   50:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   26   53:astore          6
			if(behavior != null)
	//*  27   55:aload           6
	//*  28   57:ifnull          69
				behavior.onStopNestedScroll(this, view1, view);
	//   29   60:aload           6
	//   30   62:aload_0         
	//   31   63:aload           4
	//   32   65:aload_1         
	//   33   66:invokevirtual   #1187 <Method void CoordinatorLayout$Behavior.onStopNestedScroll(CoordinatorLayout, View, View)>
			layoutparams.resetNestedScroll();
	//   34   69:aload           5
	//   35   71:invokevirtual   #1190 <Method void CoordinatorLayout$LayoutParams.resetNestedScroll()>
			layoutparams.resetChangedAfterNestedScroll();
	//   36   74:aload           5
	//   37   76:invokevirtual   #1012 <Method void CoordinatorLayout$LayoutParams.resetChangedAfterNestedScroll()>
		}

	//   38   79:iload_2         
	//   39   80:iconst_1        
	//   40   81:iadd            
	//   41   82:istore_2        
	//*  42   83:goto            15
		mNestedScrollingDirectChild = null;
	//   43   86:aload_0         
	//   44   87:aconst_null     
	//   45   88:putfield        #1138 <Field View mNestedScrollingDirectChild>
		mNestedScrollingTarget = null;
	//   46   91:aload_0         
	//   47   92:aconst_null     
	//   48   93:putfield        #1027 <Field View mNestedScrollingTarget>
	//   49   96:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i;
		boolean flag;
		boolean flag3;
		Object obj;
		Object obj1;
label0:
		{
			boolean flag4 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
			boolean flag1 = false;
	//    2    3:iconst_0        
	//    3    4:istore          4
			obj1 = null;
	//    4    6:aconst_null     
	//    5    7:astore          11
			obj = null;
	//    6    9:aconst_null     
	//    7   10:astore          10
			i = motionevent.getActionMasked();
	//    8   12:aload_1         
	//    9   13:invokevirtual   #622 <Method int MotionEvent.getActionMasked()>
	//   10   16:istore_2        
			if(mBehaviorTouchView == null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #649 <Field View mBehaviorTouchView>
	//*  13   21:ifnonnull       48
			{
				boolean flag5 = performIntercept(motionevent, 1);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:iconst_1        
	//   17   27:invokespecial   #1045 <Method boolean performIntercept(MotionEvent, int)>
	//   18   30:istore          7
				flag1 = flag5;
	//   19   32:iload           7
	//   20   34:istore          4
				flag = flag4;
	//   21   36:iload           6
	//   22   38:istore_3        
				flag3 = flag1;
	//   23   39:iload           4
	//   24   41:istore          5
				if(!flag5)
					break label0;
	//   25   43:iload           7
	//   26   45:ifeq            91
			}
			Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
	//   27   48:aload_0         
	//   28   49:getfield        #649 <Field View mBehaviorTouchView>
	//   29   52:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   55:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//   31   58:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   32   61:astore          12
			flag = flag4;
	//   33   63:iload           6
	//   34   65:istore_3        
			flag3 = flag1;
	//   35   66:iload           4
	//   36   68:istore          5
			if(behavior != null)
	//*  37   70:aload           12
	//*  38   72:ifnull          91
			{
				flag = behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
	//   39   75:aload           12
	//   40   77:aload_0         
	//   41   78:aload_0         
	//   42   79:getfield        #649 <Field View mBehaviorTouchView>
	//   43   82:aload_1         
	//   44   83:invokevirtual   #647 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   45   86:istore_3        
				flag3 = flag1;
	//   46   87:iload           4
	//   47   89:istore          5
			}
		}
		boolean flag2;
		if(mBehaviorTouchView == null)
	//*  48   91:aload_0         
	//*  49   92:getfield        #649 <Field View mBehaviorTouchView>
	//*  50   95:ifnonnull       113
		{
			flag2 = flag | super.onTouchEvent(motionevent);
	//   51   98:iload_3         
	//   52   99:aload_0         
	//   53  100:aload_1         
	//   54  101:invokespecial   #1192 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   55  104:ior             
	//   56  105:istore          4
			motionevent = ((MotionEvent) (obj1));
	//   57  107:aload           11
	//   58  109:astore_1        
		} else
	//*  59  110:goto            157
		{
			flag2 = flag;
	//   60  113:iload_3         
	//   61  114:istore          4
			motionevent = ((MotionEvent) (obj1));
	//   62  116:aload           11
	//   63  118:astore_1        
			if(flag3)
	//*  64  119:iload           5
	//*  65  121:ifeq            157
			{
				motionevent = ((MotionEvent) (obj));
	//   66  124:aload           10
	//   67  126:astore_1        
				if(true)
	//*  68  127:iconst_0        
	//*  69  128:ifne            148
				{
					long l = SystemClock.uptimeMillis();
	//   70  131:invokestatic    #636 <Method long SystemClock.uptimeMillis()>
	//   71  134:lstore          8
					motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   72  136:lload           8
	//   73  138:lload           8
	//   74  140:iconst_3        
	//   75  141:fconst_0        
	//   76  142:fconst_0        
	//   77  143:iconst_0        
	//   78  144:invokestatic    #640 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   79  147:astore_1        
				}
				super.onTouchEvent(motionevent);
	//   80  148:aload_0         
	//   81  149:aload_1         
	//   82  150:invokespecial   #1192 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   83  153:pop             
				flag2 = flag;
	//   84  154:iload_3         
	//   85  155:istore          4
			}
		}
		if(flag2);
	//   86  157:iload           4
	//   87  159:ifne            162
		if(motionevent != null)
	//*  88  162:aload_1         
	//*  89  163:ifnull          170
			motionevent.recycle();
	//   90  166:aload_1         
	//   91  167:invokevirtual   #698 <Method void MotionEvent.recycle()>
		if(i == 1 || i == 3)
	//*  92  170:iload_2         
	//*  93  171:iconst_1        
	//*  94  172:icmpeq          180
	//*  95  175:iload_2         
	//*  96  176:iconst_3        
	//*  97  177:icmpne          184
			resetTouchBehaviors();
	//   98  180:aload_0         
	//   99  181:invokespecial   #977 <Method void resetTouchBehaviors()>
		return flag2;
	//  100  184:iload           4
	//  101  186:ireturn         
	}

	void recordLastChildRect(View view, Rect rect)
	{
		((LayoutParams)view.getLayoutParams()).setLastChildRect(rect);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #1195 <Method void CoordinatorLayout$LayoutParams.setLastChildRect(Rect)>
	//    5   11:return          
	}

	void removePreDrawListener()
	{
		if(mIsAttachedToWindow && mOnPreDrawListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #724 <Field boolean mIsAttachedToWindow>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//*   5   11:ifnull          25
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #731 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:aload_0         
	//    9   19:getfield        #726 <Field CoordinatorLayout$b mOnPreDrawListener>
	//   10   22:invokevirtual   #1025 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mNeedsPreDrawListener = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #739 <Field boolean mNeedsPreDrawListener>
	//   14   30:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #19  <Class CoordinatorLayout$LayoutParams>
	//    3    7:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    4   10:astore          4
		if(behavior != null && behavior.onRequestChildRectangleOnScreen(this, view, rect, flag))
	//*   5   12:aload           4
	//*   6   14:ifnull          31
	//*   7   17:aload           4
	//*   8   19:aload_0         
	//*   9   20:aload_1         
	//*  10   21:aload_2         
	//*  11   22:iload_3         
	//*  12   23:invokevirtual   #1201 <Method boolean CoordinatorLayout$Behavior.onRequestChildRectangleOnScreen(CoordinatorLayout, View, Rect, boolean)>
	//*  13   26:ifeq            31
			return true;
	//   14   29:iconst_1        
	//   15   30:ireturn         
		else
			return super.requestChildRectangleOnScreen(view, rect, flag);
	//   16   31:aload_0         
	//   17   32:aload_1         
	//   18   33:aload_2         
	//   19   34:iload_3         
	//   20   35:invokespecial   #1203 <Method boolean ViewGroup.requestChildRectangleOnScreen(View, Rect, boolean)>
	//   21   38:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1206 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		if(flag && !mDisallowInterceptReset)
	//*   3    5:iload_1         
	//*   4    6:ifeq            25
	//*   5    9:aload_0         
	//*   6   10:getfield        #703 <Field boolean mDisallowInterceptReset>
	//*   7   13:ifne            25
		{
			resetTouchBehaviors();
	//    8   16:aload_0         
	//    9   17:invokespecial   #977 <Method void resetTouchBehaviors()>
			mDisallowInterceptReset = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #703 <Field boolean mDisallowInterceptReset>
		}
	//   13   25:return          
	}

	public void setFitsSystemWindows(boolean flag)
	{
		super.setFitsSystemWindows(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1209 <Method void ViewGroup.setFitsSystemWindows(boolean)>
		setupForInsets();
	//    3    5:aload_0         
	//    4    6:invokespecial   #233 <Method void setupForInsets()>
	//    5    9:return          
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
	{
		mOnHierarchyChangeListener = onhierarchychangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1211 <Field android.view.ViewGroup$OnHierarchyChangeListener mOnHierarchyChangeListener>
	//    3    5:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		if(mStatusBarBackground != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field Drawable mStatusBarBackground>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       121
		{
			if(mStatusBarBackground != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #227 <Field Drawable mStatusBarBackground>
	//*   6   12:ifnull          23
				mStatusBarBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    7   15:aload_0         
	//    8   16:getfield        #227 <Field Drawable mStatusBarBackground>
	//    9   19:aconst_null     
	//   10   20:invokevirtual   #1217 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  11   23:aload_1         
	//*  12   24:ifnull          35
				drawable = drawable.mutate();
	//   13   27:aload_1         
	//   14   28:invokevirtual   #1220 <Method Drawable Drawable.mutate()>
	//   15   31:astore_1        
			else
	//*  16   32:goto            37
				drawable = null;
	//   17   35:aconst_null     
	//   18   36:astore_1        
			mStatusBarBackground = drawable;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #227 <Field Drawable mStatusBarBackground>
			if(mStatusBarBackground != null)
	//*  22   42:aload_0         
	//*  23   43:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  24   46:ifnull          117
			{
				if(mStatusBarBackground.isStateful())
	//*  25   49:aload_0         
	//*  26   50:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  27   53:invokevirtual   #840 <Method boolean Drawable.isStateful()>
	//*  28   56:ifeq            71
					mStatusBarBackground.setState(getDrawableState());
	//   29   59:aload_0         
	//   30   60:getfield        #227 <Field Drawable mStatusBarBackground>
	//   31   63:aload_0         
	//   32   64:invokevirtual   #835 <Method int[] getDrawableState()>
	//   33   67:invokevirtual   #844 <Method boolean Drawable.setState(int[])>
	//   34   70:pop             
				DrawableCompat.setLayoutDirection(mStatusBarBackground, ViewCompat.getLayoutDirection(((View) (this))));
	//   35   71:aload_0         
	//   36   72:getfield        #227 <Field Drawable mStatusBarBackground>
	//   37   75:aload_0         
	//   38   76:invokestatic    #985 <Method int ViewCompat.getLayoutDirection(View)>
	//   39   79:invokestatic    #1226 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   40   82:pop             
				drawable = mStatusBarBackground;
	//   41   83:aload_0         
	//   42   84:getfield        #227 <Field Drawable mStatusBarBackground>
	//   43   87:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  44   88:aload_0         
	//*  45   89:invokevirtual   #1227 <Method int getVisibility()>
	//*  46   92:ifne            100
					flag = true;
	//   47   95:iconst_1        
	//   48   96:istore_2        
				else
	//*  49   97:goto            102
					flag = false;
	//   50  100:iconst_0        
	//   51  101:istore_2        
				drawable.setVisible(flag, false);
	//   52  102:aload_1         
	//   53  103:iload_2         
	//   54  104:iconst_0        
	//   55  105:invokevirtual   #1231 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   56  108:pop             
				mStatusBarBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   57  109:aload_0         
	//   58  110:getfield        #227 <Field Drawable mStatusBarBackground>
	//   59  113:aload_0         
	//   60  114:invokevirtual   #1217 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   61  117:aload_0         
	//   62  118:invokestatic    #1234 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   63  121:return          
	}

	public void setStatusBarBackgroundColor(int i)
	{
		setStatusBarBackground(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #1238 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1239 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #1241 <Method void setStatusBarBackground(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarBackgroundResource(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = ContextCompat.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #868 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1248 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setStatusBarBackground(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1241 <Method void setStatusBarBackground(Drawable)>
	//   13   23:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1251 <Method void ViewGroup.setVisibility(int)>
		boolean flag;
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            14
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:goto            16
			flag = false;
	//    8   14:iconst_0        
	//    9   15:istore_2        
		if(mStatusBarBackground != null && mStatusBarBackground.isVisible() != flag)
	//*  10   16:aload_0         
	//*  11   17:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  12   20:ifnull          44
	//*  13   23:aload_0         
	//*  14   24:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  15   27:invokevirtual   #1254 <Method boolean Drawable.isVisible()>
	//*  16   30:iload_2         
	//*  17   31:icmpeq          44
			mStatusBarBackground.setVisible(flag, false);
	//   18   34:aload_0         
	//   19   35:getfield        #227 <Field Drawable mStatusBarBackground>
	//   20   38:iload_2         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #1231 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   23   43:pop             
	//   24   44:return          
	}

	final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1 = windowinsetscompat;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(!ad.a(((Object) (mLastInsets)), ((Object) (windowinsetscompat))))
	//*   2    2:aload_0         
	//*   3    3:getfield        #435 <Field WindowInsetsCompat mLastInsets>
	//*   4    6:aload_1         
	//*   5    7:invokestatic    #1260 <Method boolean ad.a(Object, Object)>
	//*   6   10:ifne            77
		{
			mLastInsets = windowinsetscompat;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:putfield        #435 <Field WindowInsetsCompat mLastInsets>
			boolean flag;
			if(windowinsetscompat != null && windowinsetscompat.getSystemWindowInsetTop() > 0)
	//*  10   18:aload_1         
	//*  11   19:ifnull          34
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #441 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//*  14   26:ifle            34
				flag = true;
	//   15   29:iconst_1        
	//   16   30:istore_2        
			else
	//*  17   31:goto            36
				flag = false;
	//   18   34:iconst_0        
	//   19   35:istore_2        
			mDrawStatusBarBackground = flag;
	//   20   36:aload_0         
	//   21   37:iload_2         
	//   22   38:putfield        #1036 <Field boolean mDrawStatusBarBackground>
			if(!mDrawStatusBarBackground && getBackground() == null)
	//*  23   41:aload_0         
	//*  24   42:getfield        #1036 <Field boolean mDrawStatusBarBackground>
	//*  25   45:ifne            60
	//*  26   48:aload_0         
	//*  27   49:invokevirtual   #1263 <Method Drawable getBackground()>
	//*  28   52:ifnonnull       60
				flag = true;
	//   29   55:iconst_1        
	//   30   56:istore_2        
			else
	//*  31   57:goto            62
				flag = false;
	//   32   60:iconst_0        
	//   33   61:istore_2        
			setWillNotDraw(flag);
	//   34   62:aload_0         
	//   35   63:iload_2         
	//   36   64:invokevirtual   #1266 <Method void setWillNotDraw(boolean)>
			windowinsetscompat1 = dispatchApplyWindowInsetsToBehaviors(windowinsetscompat);
	//   37   67:aload_0         
	//   38   68:aload_1         
	//   39   69:invokespecial   #1268 <Method WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat)>
	//   40   72:astore_3        
			requestLayout();
	//   41   73:aload_0         
	//   42   74:invokevirtual   #1271 <Method void requestLayout()>
		}
		return windowinsetscompat1;
	//   43   77:aload_3         
	//   44   78:areturn         
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1275 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            16
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #227 <Field Drawable mStatusBarBackground>
	//    7   13:if_acmpne       18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	static final Class CONSTRUCTOR_PARAMS[] = {
		android/content/Context, android/util/AttributeSet
	};
	static final int EVENT_NESTED_SCROLL = 1;
	static final int EVENT_PRE_DRAW = 0;
	static final int EVENT_VIEW_REMOVED = 2;
	static final String TAG = "CoordinatorLayout";
	static final Comparator TOP_SORTED_CHILDREN_COMPARATOR;
	private static final int TYPE_ON_INTERCEPT = 0;
	private static final int TYPE_ON_TOUCH = 1;
	static final String WIDGET_PACKAGE_NAME;
	static final ThreadLocal sConstructors = new ThreadLocal();
	private static final android.support.v4.util.Pools.Pool sRectPool = new android.support.v4.util.Pools.SynchronizedPool(12);
	private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
	private View mBehaviorTouchView;
	private final m mChildDag;
	private final List mDependencySortedChildren;
	private boolean mDisallowInterceptReset;
	private boolean mDrawStatusBarBackground;
	private boolean mIsAttachedToWindow;
	private int mKeylines[];
	private WindowInsetsCompat mLastInsets;
	private boolean mNeedsPreDrawListener;
	private View mNestedScrollingDirectChild;
	private final NestedScrollingParentHelper mNestedScrollingParentHelper;
	private View mNestedScrollingTarget;
	android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
	private b mOnPreDrawListener;
	private Paint mScrimPaint;
	private Drawable mStatusBarBackground;
	private final List mTempDependenciesList;
	private final int mTempIntPair[];
	private final List mTempList1;

	static 
	{
		Object obj = ((Object) (((Class) (android/support/design/widget/CoordinatorLayout)).getPackage()));
	//    0    0:ldc1            #2   <Class CoordinatorLayout>
	//    1    2:invokevirtual   #102 <Method Package Class.getPackage()>
	//    2    5:astore_0        
		if(obj != null)
	//*   3    6:aload_0         
	//*   4    7:ifnull          18
			obj = ((Object) (((Package) (obj)).getName()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #108 <Method String Package.getName()>
	//    7   14:astore_0        
		else
	//*   8   15:goto            20
			obj = null;
	//    9   18:aconst_null     
	//   10   19:astore_0        
		WIDGET_PACKAGE_NAME = ((String) (obj));
	//   11   20:aload_0         
	//   12   21:putstatic       #110 <Field String WIDGET_PACKAGE_NAME>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  13   24:getstatic       #115 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   27:bipush          21
	//*  15   29:icmplt          45
			TOP_SORTED_CHILDREN_COMPARATOR = ((Comparator) (new e()));
	//   16   32:new             #33  <Class CoordinatorLayout$e>
	//   17   35:dup             
	//   18   36:invokespecial   #118 <Method void CoordinatorLayout$e()>
	//   19   39:putstatic       #120 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
		else
	//*  20   42:goto            49
			TOP_SORTED_CHILDREN_COMPARATOR = null;
	//   21   45:aconst_null     
	//   22   46:putstatic       #120 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//   23   49:iconst_2        
	//   24   50:anewarray       Class[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:ldc1            #122 <Class Context>
	//   28   57:aastore         
	//   29   58:dup             
	//   30   59:iconst_1        
	//   31   60:ldc1            #124 <Class AttributeSet>
	//   32   62:aastore         
	//   33   63:putstatic       #126 <Field Class[] CONSTRUCTOR_PARAMS>
	//   34   66:new             #128 <Class ThreadLocal>
	//   35   69:dup             
	//   36   70:invokespecial   #129 <Method void ThreadLocal()>
	//   37   73:putstatic       #131 <Field ThreadLocal sConstructors>
	//   38   76:new             #133 <Class android.support.v4.util.Pools$SynchronizedPool>
	//   39   79:dup             
	//   40   80:bipush          12
	//   41   82:invokespecial   #136 <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//   42   85:putstatic       #138 <Field android.support.v4.util.Pools$Pool sRectPool>
	//*  43   88:return          
	}
}
