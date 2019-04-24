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
import android.support.v4.math.MathUtils;
import android.support.v4.util.ObjectsCompat;
import android.support.v4.view.*;
import android.text.TextUtils;
import android.util.*;
import android.view.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.*;

// Referenced classes of package android.support.design.widget:
//			DirectedAcyclicGraph, ThemeUtils, ViewGroupUtils

public class CoordinatorLayout extends ViewGroup
	implements NestedScrollingParent2
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

		public void onNestedPreScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int ai[], int k)
		{
			if(k == 0)
		//*   0    0:iload           7
		//*   1    2:ifne            18
				onNestedPreScroll(coordinatorlayout, view, view1, i, j, ai);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:iload           4
		//    7   11:iload           5
		//    8   13:aload           6
		//    9   15:invokevirtual   #93  <Method void onNestedPreScroll(CoordinatorLayout, View, View, int, int, int[])>
		//   10   18:return          
		}

		public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l)
		{
		//    0    0:return          
		}

		public void onNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i, int j, int k, int l, 
				int i1)
		{
			if(i1 == 0)
		//*   0    0:iload           8
		//*   1    2:ifne            20
				onNestedScroll(coordinatorlayout, view, view1, i, j, k, l);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:iload           4
		//    7   11:iload           5
		//    8   13:iload           6
		//    9   15:iload           7
		//   10   17:invokevirtual   #100 <Method void onNestedScroll(CoordinatorLayout, View, View, int, int, int, int)>
		//   11   20:return          
		}

		public void onNestedScrollAccepted(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
		{
		//    0    0:return          
		}

		public void onNestedScrollAccepted(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
		{
			if(j == 0)
		//*   0    0:iload           6
		//*   1    2:ifne            16
				onNestedScrollAccepted(coordinatorlayout, view, view1, view2, i);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:aload           4
		//    7   11:iload           5
		//    8   13:invokevirtual   #107 <Method void onNestedScrollAccepted(CoordinatorLayout, View, View, View, int)>
		//    9   16:return          
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
		//    0    0:getstatic       #122 <Field android.view.AbsSavedState android.view.View$BaseSavedState.EMPTY_STATE>
		//    1    3:areturn         
		}

		public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean onStartNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, View view2, int i, int j)
		{
			if(j == 0)
		//*   0    0:iload           6
		//*   1    2:ifne            17
				return onStartNestedScroll(coordinatorlayout, view, view1, view2, i);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:aload           4
		//    7   11:iload           5
		//    8   13:invokevirtual   #129 <Method boolean onStartNestedScroll(CoordinatorLayout, View, View, View, int)>
		//    9   16:ireturn         
			else
				return false;
		//   10   17:iconst_0        
		//   11   18:ireturn         
		}

		public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1)
		{
		//    0    0:return          
		}

		public void onStopNestedScroll(CoordinatorLayout coordinatorlayout, View view, View view1, int i)
		{
			if(i == 0)
		//*   0    0:iload           4
		//*   1    2:ifne            12
				onStopNestedScroll(coordinatorlayout, view, view1);
		//    2    5:aload_0         
		//    3    6:aload_1         
		//    4    7:aload_2         
		//    5    8:aload_3         
		//    6    9:invokevirtual   #134 <Method void onStopNestedScroll(CoordinatorLayout, View, View)>
		//    7   12:return          
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

	private class HierarchyChangeListener
		implements android.view.ViewGroup.OnHierarchyChangeListener
	{

		public void onChildViewAdded(View view, View view1)
		{
			if(mOnHierarchyChangeListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #15  <Field CoordinatorLayout this$0>
		//*   2    4:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//*   3    7:ifnull          24
				mOnHierarchyChangeListener.onChildViewAdded(view, view1);
		//    4   10:aload_0         
		//    5   11:getfield        #15  <Field CoordinatorLayout this$0>
		//    6   14:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//    7   17:aload_1         
		//    8   18:aload_2         
		//    9   19:invokeinterface #27  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewAdded(View, View)>
		//   10   24:return          
		}

		public void onChildViewRemoved(View view, View view1)
		{
			onChildViewsChanged(2);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CoordinatorLayout this$0>
		//    2    4:iconst_2        
		//    3    5:invokevirtual   #32  <Method void CoordinatorLayout.onChildViewsChanged(int)>
			if(mOnHierarchyChangeListener != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #15  <Field CoordinatorLayout this$0>
		//*   6   12:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//*   7   15:ifnull          32
				mOnHierarchyChangeListener.onChildViewRemoved(view, view1);
		//    8   18:aload_0         
		//    9   19:getfield        #15  <Field CoordinatorLayout this$0>
		//   10   22:getfield        #25  <Field android.view.ViewGroup$OnHierarchyChangeListener CoordinatorLayout.mOnHierarchyChangeListener>
		//   11   25:aload_1         
		//   12   26:aload_2         
		//   13   27:invokeinterface #34  <Method void android.view.ViewGroup$OnHierarchyChangeListener.onChildViewRemoved(View, View)>
		//   14   32:return          
		}

		final CoordinatorLayout this$0;

		HierarchyChangeListener()
		{
			this$0 = CoordinatorLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CoordinatorLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		private void resolveAnchorView(View view, CoordinatorLayout coordinatorlayout)
		{
			mAnchorView = coordinatorlayout.findViewById(mAnchorId);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:aload_0         
		//    3    3:getfield        #45  <Field int mAnchorId>
		//    4    6:invokevirtual   #140 <Method View CoordinatorLayout.findViewById(int)>
		//    5    9:putfield        #142 <Field View mAnchorView>
			if(mAnchorView != null)
		//*   6   12:aload_0         
		//*   7   13:getfield        #142 <Field View mAnchorView>
		//*   8   16:ifnull          141
			{
				if(mAnchorView == coordinatorlayout)
		//*   9   19:aload_0         
		//*  10   20:getfield        #142 <Field View mAnchorView>
		//*  11   23:aload_2         
		//*  12   24:if_acmpne       55
					if(coordinatorlayout.isInEditMode())
		//*  13   27:aload_2         
		//*  14   28:invokevirtual   #146 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  15   31:ifeq            45
					{
						mAnchorDirectChild = null;
		//   16   34:aload_0         
		//   17   35:aconst_null     
		//   18   36:putfield        #148 <Field View mAnchorDirectChild>
						mAnchorView = null;
		//   19   39:aload_0         
		//   20   40:aconst_null     
		//   21   41:putfield        #142 <Field View mAnchorView>
						return;
		//   22   44:return          
					} else
					{
						throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
		//   23   45:new             #150 <Class IllegalStateException>
		//   24   48:dup             
		//   25   49:ldc1            #152 <String "View can not be anchored to the the parent CoordinatorLayout">
		//   26   51:invokespecial   #155 <Method void IllegalStateException(String)>
		//   27   54:athrow          
					}
				View view1 = mAnchorView;
		//   28   55:aload_0         
		//   29   56:getfield        #142 <Field View mAnchorView>
		//   30   59:astore          4
				for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout && viewparent != null; viewparent = viewparent.getParent())
		//*  31   61:aload_0         
		//*  32   62:getfield        #142 <Field View mAnchorView>
		//*  33   65:invokevirtual   #161 <Method ViewParent View.getParent()>
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
		//*  44   84:invokevirtual   #146 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  45   87:ifeq            101
						{
							mAnchorDirectChild = null;
		//   46   90:aload_0         
		//   47   91:aconst_null     
		//   48   92:putfield        #148 <Field View mAnchorDirectChild>
							mAnchorView = null;
		//   49   95:aload_0         
		//   50   96:aconst_null     
		//   51   97:putfield        #142 <Field View mAnchorView>
							return;
		//   52  100:return          
						} else
						{
							throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
		//   53  101:new             #150 <Class IllegalStateException>
		//   54  104:dup             
		//   55  105:ldc1            #163 <String "Anchor must not be a descendant of the anchored view">
		//   56  107:invokespecial   #155 <Method void IllegalStateException(String)>
		//   57  110:athrow          
						}
					if(viewparent instanceof View)
		//*  58  111:aload_3         
		//*  59  112:instanceof      #157 <Class View>
		//*  60  115:ifeq            124
						view1 = (View)viewparent;
		//   61  118:aload_3         
		//   62  119:checkcast       #157 <Class View>
		//   63  122:astore          4
				}

		//   64  124:aload_3         
		//   65  125:invokeinterface #166 <Method ViewParent ViewParent.getParent()>
		//   66  130:astore_3        
		//*  67  131:goto            69
				mAnchorDirectChild = view1;
		//   68  134:aload_0         
		//   69  135:aload           4
		//   70  137:putfield        #148 <Field View mAnchorDirectChild>
				return;
		//   71  140:return          
			}
			if(coordinatorlayout.isInEditMode())
		//*  72  141:aload_2         
		//*  73  142:invokevirtual   #146 <Method boolean CoordinatorLayout.isInEditMode()>
		//*  74  145:ifeq            159
			{
				mAnchorDirectChild = null;
		//   75  148:aload_0         
		//   76  149:aconst_null     
		//   77  150:putfield        #148 <Field View mAnchorDirectChild>
				mAnchorView = null;
		//   78  153:aload_0         
		//   79  154:aconst_null     
		//   80  155:putfield        #142 <Field View mAnchorView>
				return;
		//   81  158:return          
			} else
			{
				throw new IllegalStateException((new StringBuilder()).append("Could not find CoordinatorLayout descendant view with id ").append(coordinatorlayout.getResources().getResourceName(mAnchorId)).append(" to anchor view ").append(((Object) (view))).toString());
		//   82  159:new             #150 <Class IllegalStateException>
		//   83  162:dup             
		//   84  163:new             #168 <Class StringBuilder>
		//   85  166:dup             
		//   86  167:invokespecial   #169 <Method void StringBuilder()>
		//   87  170:ldc1            #171 <String "Could not find CoordinatorLayout descendant view with id ">
		//   88  172:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   89  175:aload_2         
		//   90  176:invokevirtual   #179 <Method Resources CoordinatorLayout.getResources()>
		//   91  179:aload_0         
		//   92  180:getfield        #45  <Field int mAnchorId>
		//   93  183:invokevirtual   #184 <Method String Resources.getResourceName(int)>
		//   94  186:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   95  189:ldc1            #186 <String " to anchor view ">
		//   96  191:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   97  194:aload_1         
		//   98  195:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
		//   99  198:invokevirtual   #193 <Method String StringBuilder.toString()>
		//  100  201:invokespecial   #155 <Method void IllegalStateException(String)>
		//  101  204:athrow          
			}
		}

		private boolean shouldDodge(View view, int i)
		{
			int j = GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).insetEdge, i);
		//    0    0:aload_1         
		//    1    1:invokevirtual   #199 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #2   <Class CoordinatorLayout$LayoutParams>
		//    3    7:getfield        #47  <Field int insetEdge>
		//    4   10:iload_2         
		//    5   11:invokestatic    #204 <Method int GravityCompat.getAbsoluteGravity(int, int)>
		//    6   14:istore_3        
			return j != 0 && (GravityCompat.getAbsoluteGravity(dodgeInsetEdges, i) & j) == j;
		//    7   15:iload_3         
		//    8   16:ifeq            35
		//    9   19:aload_0         
		//   10   20:getfield        #49  <Field int dodgeInsetEdges>
		//   11   23:iload_2         
		//   12   24:invokestatic    #204 <Method int GravityCompat.getAbsoluteGravity(int, int)>
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
		//*   1    1:getfield        #142 <Field View mAnchorView>
		//*   2    4:invokevirtual   #210 <Method int View.getId()>
		//*   3    7:aload_0         
		//*   4    8:getfield        #45  <Field int mAnchorId>
		//*   5   11:icmpeq          16
				return false;
		//    6   14:iconst_0        
		//    7   15:ireturn         
			View view1 = mAnchorView;
		//    8   16:aload_0         
		//    9   17:getfield        #142 <Field View mAnchorView>
		//   10   20:astore          4
			for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout; viewparent = viewparent.getParent())
		//*  11   22:aload_0         
		//*  12   23:getfield        #142 <Field View mAnchorView>
		//*  13   26:invokevirtual   #161 <Method ViewParent View.getParent()>
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
		//   25   46:putfield        #148 <Field View mAnchorDirectChild>
					mAnchorView = null;
		//   26   49:aload_0         
		//   27   50:aconst_null     
		//   28   51:putfield        #142 <Field View mAnchorView>
					return false;
		//   29   54:iconst_0        
		//   30   55:ireturn         
				}
				if(viewparent instanceof View)
		//*  31   56:aload_3         
		//*  32   57:instanceof      #157 <Class View>
		//*  33   60:ifeq            69
					view1 = (View)viewparent;
		//   34   63:aload_3         
		//   35   64:checkcast       #157 <Class View>
		//   36   67:astore          4
			}

		//   37   69:aload_3         
		//   38   70:invokeinterface #166 <Method ViewParent ViewParent.getParent()>
		//   39   75:astore_3        
		//*  40   76:goto            30
			mAnchorDirectChild = view1;
		//   41   79:aload_0         
		//   42   80:aload           4
		//   43   82:putfield        #148 <Field View mAnchorDirectChild>
			return true;
		//   44   85:iconst_1        
		//   45   86:ireturn         
		}

		boolean checkAnchorChanged()
		{
			return mAnchorView == null && mAnchorId != -1;
		//    0    0:aload_0         
		//    1    1:getfield        #142 <Field View mAnchorView>
		//    2    4:ifnonnull       17
		//    3    7:aload_0         
		//    4    8:getfield        #45  <Field int mAnchorId>
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
		//    2    2:getfield        #148 <Field View mAnchorDirectChild>
		//    3    5:if_acmpeq       40
		//    4    8:aload_0         
		//    5    9:aload_3         
		//    6   10:aload_1         
		//    7   11:invokestatic    #219 <Method int ViewCompat.getLayoutDirection(View)>
		//    8   14:invokespecial   #221 <Method boolean shouldDodge(View, int)>
		//    9   17:ifne            40
		//   10   20:aload_0         
		//   11   21:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//   12   24:ifnull          42
		//   13   27:aload_0         
		//   14   28:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//   15   31:aload_1         
		//   16   32:aload_2         
		//   17   33:aload_3         
		//   18   34:invokevirtual   #224 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
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
		//*   1    1:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//*   2    4:ifnonnull       12
				mDidBlockInteraction = false;
		//    3    7:aload_0         
		//    4    8:iconst_0        
		//    5    9:putfield        #227 <Field boolean mDidBlockInteraction>
			return mDidBlockInteraction;
		//    6   12:aload_0         
		//    7   13:getfield        #227 <Field boolean mDidBlockInteraction>
		//    8   16:ireturn         
		}

		View findAnchorView(CoordinatorLayout coordinatorlayout, View view)
		{
			if(mAnchorId == -1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #45  <Field int mAnchorId>
		//*   2    4:iconst_m1       
		//*   3    5:icmpne          20
			{
				mAnchorDirectChild = null;
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:putfield        #148 <Field View mAnchorDirectChild>
				mAnchorView = null;
		//    7   13:aload_0         
		//    8   14:aconst_null     
		//    9   15:putfield        #142 <Field View mAnchorView>
				return null;
		//   10   18:aconst_null     
		//   11   19:areturn         
			}
			if(mAnchorView == null || !verifyAnchorView(view, coordinatorlayout))
		//*  12   20:aload_0         
		//*  13   21:getfield        #142 <Field View mAnchorView>
		//*  14   24:ifnull          36
		//*  15   27:aload_0         
		//*  16   28:aload_2         
		//*  17   29:aload_1         
		//*  18   30:invokespecial   #231 <Method boolean verifyAnchorView(View, CoordinatorLayout)>
		//*  19   33:ifne            42
				resolveAnchorView(view, coordinatorlayout);
		//   20   36:aload_0         
		//   21   37:aload_2         
		//   22   38:aload_1         
		//   23   39:invokespecial   #233 <Method void resolveAnchorView(View, CoordinatorLayout)>
			return mAnchorView;
		//   24   42:aload_0         
		//   25   43:getfield        #142 <Field View mAnchorView>
		//   26   46:areturn         
		}

		public int getAnchorId()
		{
			return mAnchorId;
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field int mAnchorId>
		//    2    4:ireturn         
		}

		public Behavior getBehavior()
		{
			return mBehavior;
		//    0    0:aload_0         
		//    1    1:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//    2    4:areturn         
		}

		boolean getChangedAfterNestedScroll()
		{
			return mDidChangeAfterNestedScroll;
		//    0    0:aload_0         
		//    1    1:getfield        #242 <Field boolean mDidChangeAfterNestedScroll>
		//    2    4:ireturn         
		}

		Rect getLastChildRect()
		{
			return mLastChildRect;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Rect mLastChildRect>
		//    2    4:areturn         
		}

		void invalidateAnchor()
		{
			mAnchorDirectChild = null;
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:putfield        #148 <Field View mAnchorDirectChild>
			mAnchorView = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #142 <Field View mAnchorView>
		//    6   10:return          
		}

		boolean isBlockingInteractionBelow(CoordinatorLayout coordinatorlayout, View view)
		{
			if(mDidBlockInteraction)
		//*   0    0:aload_0         
		//*   1    1:getfield        #227 <Field boolean mDidBlockInteraction>
		//*   2    4:ifeq            9
				return true;
		//    3    7:iconst_1        
		//    4    8:ireturn         
			boolean flag1 = mDidBlockInteraction;
		//    5    9:aload_0         
		//    6   10:getfield        #227 <Field boolean mDidBlockInteraction>
		//    7   13:istore          4
			boolean flag;
			if(mBehavior != null)
		//*   8   15:aload_0         
		//*   9   16:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//*  10   19:ifnull          44
				flag = mBehavior.blocksInteractionBelow(coordinatorlayout, view);
		//   11   22:aload_0         
		//   12   23:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:invokevirtual   #250 <Method boolean CoordinatorLayout$Behavior.blocksInteractionBelow(CoordinatorLayout, View)>
		//   16   31:istore_3        
			else
		//*  17   32:iload_3         
		//*  18   33:iload           4
		//*  19   35:ior             
		//*  20   36:istore_3        
		//*  21   37:aload_0         
		//*  22   38:iload_3         
		//*  23   39:putfield        #227 <Field boolean mDidBlockInteraction>
		//*  24   42:iload_3         
		//*  25   43:ireturn         
				flag = false;
		//   26   44:iconst_0        
		//   27   45:istore_3        
			flag |= flag1;
			mDidBlockInteraction = flag;
			return flag;
		//*  28   46:goto            32
		}

		boolean isNestedScrollAccepted(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 26
		//		               1 31
			default:
				return false;
		//    2   24:iconst_0        
		//    3   25:ireturn         

			case 0: // '\0'
				return mDidAcceptNestedScrollTouch;
		//    4   26:aload_0         
		//    5   27:getfield        #253 <Field boolean mDidAcceptNestedScrollTouch>
		//    6   30:ireturn         

			case 1: // '\001'
				return mDidAcceptNestedScrollNonTouch;
		//    7   31:aload_0         
		//    8   32:getfield        #255 <Field boolean mDidAcceptNestedScrollNonTouch>
		//    9   35:ireturn         
			}
		}

		void resetChangedAfterNestedScroll()
		{
			mDidChangeAfterNestedScroll = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #242 <Field boolean mDidChangeAfterNestedScroll>
		//    3    5:return          
		}

		void resetNestedScroll(int i)
		{
			setNestedScrollAccepted(i, false);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #262 <Method void setNestedScrollAccepted(int, boolean)>
		//    4    6:return          
		}

		void resetTouchBehaviorTracking()
		{
			mDidBlockInteraction = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #227 <Field boolean mDidBlockInteraction>
		//    3    5:return          
		}

		public void setAnchorId(int i)
		{
			invalidateAnchor();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #266 <Method void invalidateAnchor()>
			mAnchorId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #45  <Field int mAnchorId>
		//    5    9:return          
		}

		public void setBehavior(Behavior behavior)
		{
			if(mBehavior != behavior)
		//*   0    0:aload_0         
		//*   1    1:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//*   2    4:aload_1         
		//*   3    5:if_acmpeq       46
			{
				if(mBehavior != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//*   6   12:ifnull          22
					mBehavior.onDetachedFromLayoutParams();
		//    7   15:aload_0         
		//    8   16:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//    9   19:invokevirtual   #272 <Method void CoordinatorLayout$Behavior.onDetachedFromLayoutParams()>
				mBehavior = behavior;
		//   10   22:aload_0         
		//   11   23:aload_1         
		//   12   24:putfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
				mBehaviorTag = null;
		//   13   27:aload_0         
		//   14   28:aconst_null     
		//   15   29:putfield        #274 <Field Object mBehaviorTag>
				mBehaviorResolved = true;
		//   16   32:aload_0         
		//   17   33:iconst_1        
		//   18   34:putfield        #37  <Field boolean mBehaviorResolved>
				if(behavior != null)
		//*  19   37:aload_1         
		//*  20   38:ifnull          46
					behavior.onAttachedToLayoutParams(this);
		//   21   41:aload_1         
		//   22   42:aload_0         
		//   23   43:invokevirtual   #128 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
			}
		//   24   46:return          
		}

		void setChangedAfterNestedScroll(boolean flag)
		{
			mDidChangeAfterNestedScroll = flag;
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:putfield        #242 <Field boolean mDidChangeAfterNestedScroll>
		//    3    5:return          
		}

		void setLastChildRect(Rect rect)
		{
			mLastChildRect.set(rect);
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field Rect mLastChildRect>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #281 <Method void Rect.set(Rect)>
		//    4    8:return          
		}

		void setNestedScrollAccepted(int i, boolean flag)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 25
		//		               1 31
			default:
				return;
		//    2   24:return          

			case 0: // '\0'
				mDidAcceptNestedScrollTouch = flag;
		//    3   25:aload_0         
		//    4   26:iload_2         
		//    5   27:putfield        #253 <Field boolean mDidAcceptNestedScrollTouch>
				return;
		//    6   30:return          

			case 1: // '\001'
				mDidAcceptNestedScrollNonTouch = flag;
		//    7   31:aload_0         
		//    8   32:iload_2         
		//    9   33:putfield        #255 <Field boolean mDidAcceptNestedScrollNonTouch>
				break;
			}
		//   10   36:return          
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
		private boolean mDidAcceptNestedScrollNonTouch;
		private boolean mDidAcceptNestedScrollTouch;
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
		//    3    3:invokespecial   #35  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			mBehaviorResolved = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #37  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #39  <Field int gravity>
			anchorGravity = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #41  <Field int anchorGravity>
			keyline = -1;
		//   13   21:aload_0         
		//   14   22:iconst_m1       
		//   15   23:putfield        #43  <Field int keyline>
			mAnchorId = -1;
		//   16   26:aload_0         
		//   17   27:iconst_m1       
		//   18   28:putfield        #45  <Field int mAnchorId>
			insetEdge = 0;
		//   19   31:aload_0         
		//   20   32:iconst_0        
		//   21   33:putfield        #47  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   22   36:aload_0         
		//   23   37:iconst_0        
		//   24   38:putfield        #49  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   25   41:aload_0         
		//   26   42:new             #51  <Class Rect>
		//   27   45:dup             
		//   28   46:invokespecial   #54  <Method void Rect()>
		//   29   49:putfield        #56  <Field Rect mLastChildRect>
		//   30   52:return          
		}

		LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #60  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			mBehaviorResolved = false;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #37  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    7   11:aload_0         
		//    8   12:iconst_0        
		//    9   13:putfield        #39  <Field int gravity>
			anchorGravity = 0;
		//   10   16:aload_0         
		//   11   17:iconst_0        
		//   12   18:putfield        #41  <Field int anchorGravity>
			keyline = -1;
		//   13   21:aload_0         
		//   14   22:iconst_m1       
		//   15   23:putfield        #43  <Field int keyline>
			mAnchorId = -1;
		//   16   26:aload_0         
		//   17   27:iconst_m1       
		//   18   28:putfield        #45  <Field int mAnchorId>
			insetEdge = 0;
		//   19   31:aload_0         
		//   20   32:iconst_0        
		//   21   33:putfield        #47  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   22   36:aload_0         
		//   23   37:iconst_0        
		//   24   38:putfield        #49  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   25   41:aload_0         
		//   26   42:new             #51  <Class Rect>
		//   27   45:dup             
		//   28   46:invokespecial   #54  <Method void Rect()>
		//   29   49:putfield        #56  <Field Rect mLastChildRect>
			TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CoordinatorLayout_Layout);
		//   30   52:aload_1         
		//   31   53:aload_2         
		//   32   54:getstatic       #66  <Field int[] android.support.design.R$styleable.CoordinatorLayout_Layout>
		//   33   57:invokevirtual   #72  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   34   60:astore_3        
			gravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
		//   35   61:aload_0         
		//   36   62:aload_3         
		//   37   63:getstatic       #75  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_android_layout_gravity>
		//   38   66:iconst_0        
		//   39   67:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
		//   40   70:putfield        #39  <Field int gravity>
			mAnchorId = typedarray.getResourceId(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
		//   41   73:aload_0         
		//   42   74:aload_3         
		//   43   75:getstatic       #84  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_anchor>
		//   44   78:iconst_m1       
		//   45   79:invokevirtual   #87  <Method int TypedArray.getResourceId(int, int)>
		//   46   82:putfield        #45  <Field int mAnchorId>
			anchorGravity = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
		//   47   85:aload_0         
		//   48   86:aload_3         
		//   49   87:getstatic       #90  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_anchorGravity>
		//   50   90:iconst_0        
		//   51   91:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
		//   52   94:putfield        #41  <Field int anchorGravity>
			keyline = typedarray.getInteger(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
		//   53   97:aload_0         
		//   54   98:aload_3         
		//   55   99:getstatic       #93  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_keyline>
		//   56  102:iconst_m1       
		//   57  103:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
		//   58  106:putfield        #43  <Field int keyline>
			insetEdge = typedarray.getInt(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
		//   59  109:aload_0         
		//   60  110:aload_3         
		//   61  111:getstatic       #96  <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_insetEdge>
		//   62  114:iconst_0        
		//   63  115:invokevirtual   #99  <Method int TypedArray.getInt(int, int)>
		//   64  118:putfield        #47  <Field int insetEdge>
			dodgeInsetEdges = typedarray.getInt(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
		//   65  121:aload_0         
		//   66  122:aload_3         
		//   67  123:getstatic       #102 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
		//   68  126:iconst_0        
		//   69  127:invokevirtual   #99  <Method int TypedArray.getInt(int, int)>
		//   70  130:putfield        #49  <Field int dodgeInsetEdges>
			mBehaviorResolved = typedarray.hasValue(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_behavior);
		//   71  133:aload_0         
		//   72  134:aload_3         
		//   73  135:getstatic       #105 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_behavior>
		//   74  138:invokevirtual   #109 <Method boolean TypedArray.hasValue(int)>
		//   75  141:putfield        #37  <Field boolean mBehaviorResolved>
			if(mBehaviorResolved)
		//*  76  144:aload_0         
		//*  77  145:getfield        #37  <Field boolean mBehaviorResolved>
		//*  78  148:ifeq            167
				mBehavior = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.design.R.styleable.CoordinatorLayout_Layout_layout_behavior));
		//   79  151:aload_0         
		//   80  152:aload_1         
		//   81  153:aload_2         
		//   82  154:aload_3         
		//   83  155:getstatic       #105 <Field int android.support.design.R$styleable.CoordinatorLayout_Layout_layout_behavior>
		//   84  158:invokevirtual   #113 <Method String TypedArray.getString(int)>
		//   85  161:invokestatic    #117 <Method CoordinatorLayout$Behavior CoordinatorLayout.parseBehavior(Context, AttributeSet, String)>
		//   86  164:putfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
			typedarray.recycle();
		//   87  167:aload_3         
		//   88  168:invokevirtual   #122 <Method void TypedArray.recycle()>
			if(mBehavior != null)
		//*  89  171:aload_0         
		//*  90  172:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//*  91  175:ifnull          186
				mBehavior.onAttachedToLayoutParams(this);
		//   92  178:aload_0         
		//   93  179:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//   94  182:aload_0         
		//   95  183:invokevirtual   #128 <Method void CoordinatorLayout$Behavior.onAttachedToLayoutParams(CoordinatorLayout$LayoutParams)>
		//   96  186:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #131 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mBehaviorResolved = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #37  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #39  <Field int gravity>
			anchorGravity = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #41  <Field int anchorGravity>
			keyline = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #43  <Field int keyline>
			mAnchorId = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #45  <Field int mAnchorId>
			insetEdge = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #47  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #49  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #51  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #54  <Method void Rect()>
		//   28   48:putfield        #56  <Field Rect mLastChildRect>
		//   29   51:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #134 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			mBehaviorResolved = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #37  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #39  <Field int gravity>
			anchorGravity = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #41  <Field int anchorGravity>
			keyline = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #43  <Field int keyline>
			mAnchorId = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #45  <Field int mAnchorId>
			insetEdge = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #47  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #49  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #51  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #54  <Method void Rect()>
		//   28   48:putfield        #56  <Field Rect mLastChildRect>
		//   29   51:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #131 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			mBehaviorResolved = false;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #37  <Field boolean mBehaviorResolved>
			gravity = 0;
		//    6   10:aload_0         
		//    7   11:iconst_0        
		//    8   12:putfield        #39  <Field int gravity>
			anchorGravity = 0;
		//    9   15:aload_0         
		//   10   16:iconst_0        
		//   11   17:putfield        #41  <Field int anchorGravity>
			keyline = -1;
		//   12   20:aload_0         
		//   13   21:iconst_m1       
		//   14   22:putfield        #43  <Field int keyline>
			mAnchorId = -1;
		//   15   25:aload_0         
		//   16   26:iconst_m1       
		//   17   27:putfield        #45  <Field int mAnchorId>
			insetEdge = 0;
		//   18   30:aload_0         
		//   19   31:iconst_0        
		//   20   32:putfield        #47  <Field int insetEdge>
			dodgeInsetEdges = 0;
		//   21   35:aload_0         
		//   22   36:iconst_0        
		//   23   37:putfield        #49  <Field int dodgeInsetEdges>
			mLastChildRect = new Rect();
		//   24   40:aload_0         
		//   25   41:new             #51  <Class Rect>
		//   26   44:dup             
		//   27   45:invokespecial   #54  <Method void Rect()>
		//   28   48:putfield        #56  <Field Rect mLastChildRect>
		//   29   51:return          
		}
	}

	class OnPreDrawListener
		implements android.view.ViewTreeObserver.OnPreDrawListener
	{

		public boolean onPreDraw()
		{
			onChildViewsChanged(0);
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field CoordinatorLayout this$0>
		//    2    4:iconst_0        
		//    3    5:invokevirtual   #25  <Method void CoordinatorLayout.onChildViewsChanged(int)>
			return true;
		//    4    8:iconst_1        
		//    5    9:ireturn         
		}

		final CoordinatorLayout this$0;

		OnPreDrawListener()
		{
			this$0 = CoordinatorLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field CoordinatorLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			int k = 0;
		//    0    0:iconst_0        
		//    1    1:istore          4
			super.writeToParcel(parcel, i);
		//    2    3:aload_0         
		//    3    4:aload_1         
		//    4    5:iload_2         
		//    5    6:invokespecial   #58  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			int j;
			int ai[];
			Parcelable aparcelable[];
			if(behaviorStates != null)
		//*   6    9:aload_0         
		//*   7   10:getfield        #47  <Field SparseArray behaviorStates>
		//*   8   13:ifnull          86
				j = behaviorStates.size();
		//    9   16:aload_0         
		//   10   17:getfield        #47  <Field SparseArray behaviorStates>
		//   11   20:invokevirtual   #61  <Method int SparseArray.size()>
		//   12   23:istore_3        
			else
		//*  13   24:aload_1         
		//*  14   25:iload_3         
		//*  15   26:invokevirtual   #64  <Method void Parcel.writeInt(int)>
		//*  16   29:iload_3         
		//*  17   30:newarray        int[]
		//*  18   32:astore          5
		//*  19   34:iload_3         
		//*  20   35:anewarray       Parcelable[]
		//*  21   38:astore          6
		//*  22   40:iload           4
		//*  23   42:iload_3         
		//*  24   43:icmpge          91
		//*  25   46:aload           5
		//*  26   48:iload           4
		//*  27   50:aload_0         
		//*  28   51:getfield        #47  <Field SparseArray behaviorStates>
		//*  29   54:iload           4
		//*  30   56:invokevirtual   #70  <Method int SparseArray.keyAt(int)>
		//*  31   59:iastore         
		//*  32   60:aload           6
		//*  33   62:iload           4
		//*  34   64:aload_0         
		//*  35   65:getfield        #47  <Field SparseArray behaviorStates>
		//*  36   68:iload           4
		//*  37   70:invokevirtual   #74  <Method Object SparseArray.valueAt(int)>
		//*  38   73:checkcast       #66  <Class Parcelable>
		//*  39   76:aastore         
		//*  40   77:iload           4
		//*  41   79:iconst_1        
		//*  42   80:iadd            
		//*  43   81:istore          4
		//*  44   83:goto            40
				j = 0;
		//   45   86:iconst_0        
		//   46   87:istore_3        
			parcel.writeInt(j);
			ai = new int[j];
			aparcelable = new Parcelable[j];
			for(; k < j; k++)
			{
				ai[k] = behaviorStates.keyAt(k);
				aparcelable[k] = (Parcelable)behaviorStates.valueAt(k);
			}

		//*  47   88:goto            24
			parcel.writeIntArray(ai);
		//   48   91:aload_1         
		//   49   92:aload           5
		//   50   94:invokevirtual   #77  <Method void Parcel.writeIntArray(int[])>
			parcel.writeParcelableArray(aparcelable, i);
		//   51   97:aload_1         
		//   52   98:aload           6
		//   53  100:iload_2         
		//   54  101:invokevirtual   #81  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		//   55  104:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class CoordinatorLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void CoordinatorLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method CoordinatorLayout$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method CoordinatorLayout$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method CoordinatorLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		SparseArray behaviorStates;

		static 
		{
		//    0    0:new             #9   <Class CoordinatorLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void CoordinatorLayout$SavedState$1()>
		//    3    7:putstatic       #22  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #26  <Method void AbsSavedState(Parcel, ClassLoader)>
			int j = parcel.readInt();
		//    4    6:aload_1         
		//    5    7:invokevirtual   #32  <Method int Parcel.readInt()>
		//    6   10:istore          4
			int ai[] = new int[j];
		//    7   12:iload           4
		//    8   14:newarray        int[]
		//    9   16:astore          5
			parcel.readIntArray(ai);
		//   10   18:aload_1         
		//   11   19:aload           5
		//   12   21:invokevirtual   #36  <Method void Parcel.readIntArray(int[])>
			parcel = ((Parcel) (parcel.readParcelableArray(classloader)));
		//   13   24:aload_1         
		//   14   25:aload_2         
		//   15   26:invokevirtual   #40  <Method Parcelable[] Parcel.readParcelableArray(ClassLoader)>
		//   16   29:astore_1        
			behaviorStates = new SparseArray(j);
		//   17   30:aload_0         
		//   18   31:new             #42  <Class SparseArray>
		//   19   34:dup             
		//   20   35:iload           4
		//   21   37:invokespecial   #45  <Method void SparseArray(int)>
		//   22   40:putfield        #47  <Field SparseArray behaviorStates>
			for(int i = 0; i < j; i++)
		//*  23   43:iconst_0        
		//*  24   44:istore_3        
		//*  25   45:iload_3         
		//*  26   46:iload           4
		//*  27   48:icmpge          72
				behaviorStates.append(ai[i], ((Object) (parcel[i])));
		//   28   51:aload_0         
		//   29   52:getfield        #47  <Field SparseArray behaviorStates>
		//   30   55:aload           5
		//   31   57:iload_3         
		//   32   58:iaload          
		//   33   59:aload_1         
		//   34   60:iload_3         
		//   35   61:aaload          
		//   36   62:invokevirtual   #51  <Method void SparseArray.append(int, Object)>

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
		//    2    2:invokespecial   #54  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

	static class ViewElevationComparator
		implements Comparator
	{

		public int compare(View view, View view1)
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

		public volatile int compare(Object obj, Object obj1)
		{
			return compare((View)obj, (View)obj1);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #26  <Class View>
		//    3    5:aload_2         
		//    4    6:checkcast       #26  <Class View>
		//    5    9:invokevirtual   #28  <Method int compare(View, View)>
		//    6   12:ireturn         
		}

		ViewElevationComparator()
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
	//    3    3:invokespecial   #142 <Method void CoordinatorLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #145 <Method void CoordinatorLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		super(context, attributeset, i);
	//    2    3:aload_0         
	//    3    4:aload_1         
	//    4    5:aload_2         
	//    5    6:iload_3         
	//    6    7:invokespecial   #146 <Method void ViewGroup(Context, AttributeSet, int)>
		mDependencySortedChildren = ((List) (new ArrayList()));
	//    7   10:aload_0         
	//    8   11:new             #148 <Class ArrayList>
	//    9   14:dup             
	//   10   15:invokespecial   #149 <Method void ArrayList()>
	//   11   18:putfield        #151 <Field List mDependencySortedChildren>
		mChildDag = new DirectedAcyclicGraph();
	//   12   21:aload_0         
	//   13   22:new             #153 <Class DirectedAcyclicGraph>
	//   14   25:dup             
	//   15   26:invokespecial   #154 <Method void DirectedAcyclicGraph()>
	//   16   29:putfield        #156 <Field DirectedAcyclicGraph mChildDag>
		mTempList1 = ((List) (new ArrayList()));
	//   17   32:aload_0         
	//   18   33:new             #148 <Class ArrayList>
	//   19   36:dup             
	//   20   37:invokespecial   #149 <Method void ArrayList()>
	//   21   40:putfield        #158 <Field List mTempList1>
		mTempDependenciesList = ((List) (new ArrayList()));
	//   22   43:aload_0         
	//   23   44:new             #148 <Class ArrayList>
	//   24   47:dup             
	//   25   48:invokespecial   #149 <Method void ArrayList()>
	//   26   51:putfield        #160 <Field List mTempDependenciesList>
		mTempIntPair = new int[2];
	//   27   54:aload_0         
	//   28   55:iconst_2        
	//   29   56:newarray        int[]
	//   30   58:putfield        #162 <Field int[] mTempIntPair>
		mNestedScrollingParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   31   61:aload_0         
	//   32   62:new             #164 <Class NestedScrollingParentHelper>
	//   33   65:dup             
	//   34   66:aload_0         
	//   35   67:invokespecial   #167 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   36   70:putfield        #169 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
		ThemeUtils.checkAppCompatTheme(context);
	//   37   73:aload_1         
	//   38   74:invokestatic    #174 <Method void ThemeUtils.checkAppCompatTheme(Context)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.design.R.styleable.CoordinatorLayout, i, android.support.design.R.style.Widget_Design_CoordinatorLayout)));
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:getstatic       #178 <Field int[] android.support.design.R$styleable.CoordinatorLayout>
	//   42   82:iload_3         
	//   43   83:getstatic       #183 <Field int android.support.design.R$style.Widget_Design_CoordinatorLayout>
	//   44   86:invokevirtual   #187 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   45   89:astore_2        
		i = ((TypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.CoordinatorLayout_keylines, 0);
	//   46   90:aload_2         
	//   47   91:getstatic       #190 <Field int android.support.design.R$styleable.CoordinatorLayout_keylines>
	//   48   94:iconst_0        
	//   49   95:invokevirtual   #196 <Method int TypedArray.getResourceId(int, int)>
	//   50   98:istore_3        
		if(i != 0)
	//*  51   99:iload_3         
	//*  52  100:ifeq            166
		{
			context = ((Context) (context.getResources()));
	//   53  103:aload_1         
	//   54  104:invokevirtual   #200 <Method Resources Context.getResources()>
	//   55  107:astore_1        
			mKeylines = ((Resources) (context)).getIntArray(i);
	//   56  108:aload_0         
	//   57  109:aload_1         
	//   58  110:iload_3         
	//   59  111:invokevirtual   #206 <Method int[] Resources.getIntArray(int)>
	//   60  114:putfield        #208 <Field int[] mKeylines>
			float f = ((Resources) (context)).getDisplayMetrics().density;
	//   61  117:aload_1         
	//   62  118:invokevirtual   #212 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   63  121:getfield        #218 <Field float DisplayMetrics.density>
	//   64  124:fstore          4
			int j = mKeylines.length;
	//   65  126:aload_0         
	//   66  127:getfield        #208 <Field int[] mKeylines>
	//   67  130:arraylength     
	//   68  131:istore          6
			for(i = ((int) (flag)); i < j; i++)
	//*  69  133:iload           5
	//*  70  135:istore_3        
	//*  71  136:iload_3         
	//*  72  137:iload           6
	//*  73  139:icmpge          166
				mKeylines[i] = (int)((float)mKeylines[i] * f);
	//   74  142:aload_0         
	//   75  143:getfield        #208 <Field int[] mKeylines>
	//   76  146:iload_3         
	//   77  147:aload_0         
	//   78  148:getfield        #208 <Field int[] mKeylines>
	//   79  151:iload_3         
	//   80  152:iaload          
	//   81  153:i2f             
	//   82  154:fload           4
	//   83  156:fmul            
	//   84  157:f2i             
	//   85  158:iastore         

	//   86  159:iload_3         
	//   87  160:iconst_1        
	//   88  161:iadd            
	//   89  162:istore_3        
		}
	//*  90  163:goto            136
		mStatusBarBackground = ((TypedArray) (attributeset)).getDrawable(android.support.design.R.styleable.CoordinatorLayout_statusBarBackground);
	//   91  166:aload_0         
	//   92  167:aload_2         
	//   93  168:getstatic       #221 <Field int android.support.design.R$styleable.CoordinatorLayout_statusBarBackground>
	//   94  171:invokevirtual   #225 <Method Drawable TypedArray.getDrawable(int)>
	//   95  174:putfield        #227 <Field Drawable mStatusBarBackground>
		((TypedArray) (attributeset)).recycle();
	//   96  177:aload_2         
	//   97  178:invokevirtual   #230 <Method void TypedArray.recycle()>
		setupForInsets();
	//   98  181:aload_0         
	//   99  182:invokespecial   #233 <Method void setupForInsets()>
		super.setOnHierarchyChangeListener(((android.view.ViewGroup.OnHierarchyChangeListener) (new HierarchyChangeListener())));
	//  100  185:aload_0         
	//  101  186:new             #19  <Class CoordinatorLayout$HierarchyChangeListener>
	//  102  189:dup             
	//  103  190:aload_0         
	//  104  191:invokespecial   #236 <Method void CoordinatorLayout$HierarchyChangeListener(CoordinatorLayout)>
	//  105  194:invokespecial   #240 <Method void ViewGroup.setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener)>
	//  106  197:return          
	}

	private static Rect acquireTempRect()
	{
		Rect rect1 = (Rect)sRectPool.acquire();
	//    0    0:getstatic       #137 <Field android.support.v4.util.Pools$Pool sRectPool>
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
		int i;
		int j;
		if(windowinsetscompat.isConsumed())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #312 <Method boolean WindowInsetsCompat.isConsumed()>
	//*   2    4:ifeq            9
			return windowinsetscompat;
	//    3    7:aload_1         
	//    4    8:areturn         
		j = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #315 <Method int getChildCount()>
	//    7   13:istore_3        
		i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_2        
_L3:
		if(i >= j) goto _L2; else goto _L1
	//   10   16:iload_2         
	//   11   17:iload_3         
	//   12   18:icmpge          86
_L1:
		Object obj;
		obj = ((Object) (getChildAt(i)));
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:invokevirtual   #319 <Method View getChildAt(int)>
	//   16   26:astore          4
		if(!ViewCompat.getFitsSystemWindows(((View) (obj))))
			continue; /* Loop/switch isn't completed */
	//   17   28:aload           4
	//   18   30:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//   19   33:ifeq            79
		Behavior behavior = ((LayoutParams)((View) (obj)).getLayoutParams()).getBehavior();
	//   20   36:aload           4
	//   21   38:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   22   41:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   23   44:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   24   47:astore          5
		if(behavior == null)
			continue; /* Loop/switch isn't completed */
	//   25   49:aload           5
	//   26   51:ifnull          79
		obj = ((Object) (behavior.onApplyWindowInsets(this, ((View) (obj)), windowinsetscompat)));
	//   27   54:aload           5
	//   28   56:aload_0         
	//   29   57:aload           4
	//   30   59:aload_1         
	//   31   60:invokevirtual   #339 <Method WindowInsetsCompat CoordinatorLayout$Behavior.onApplyWindowInsets(CoordinatorLayout, View, WindowInsetsCompat)>
	//   32   63:astore          4
		windowinsetscompat = ((WindowInsetsCompat) (obj));
	//   33   65:aload           4
	//   34   67:astore_1        
		if(!((WindowInsetsCompat) (obj)).isConsumed())
			continue; /* Loop/switch isn't completed */
	//   35   68:aload           4
	//   36   70:invokevirtual   #312 <Method boolean WindowInsetsCompat.isConsumed()>
	//   37   73:ifeq            79
_L4:
		return ((WindowInsetsCompat) (obj));
	//   38   76:aload           4
	//   39   78:areturn         
		i++;
	//   40   79:iload_2         
	//   41   80:iconst_1        
	//   42   81:iadd            
	//   43   82:istore_2        
		  goto _L3
	//*  44   83:goto            16
_L2:
		obj = ((Object) (windowinsetscompat));
	//   45   86:aload_1         
	//   46   87:astore          4
		  goto _L4
	//*  47   89:goto            76
	}

	private void getDesiredAnchoredChildRectWithoutConstraints(View view, int i, Rect rect, Rect rect1, LayoutParams layoutparams, int j, int k)
	{
		int l;
		int j1;
		j1 = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutparams.gravity), i);
	//    0    0:aload           5
	//    1    2:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//    2    5:invokestatic    #348 <Method int resolveAnchoredChildGravity(int)>
	//    3    8:iload_2         
	//    4    9:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    5   12:istore          10
		l = GravityCompat.getAbsoluteGravity(resolveGravity(layoutparams.anchorGravity), i);
	//    6   14:aload           5
	//    7   16:getfield        #356 <Field int CoordinatorLayout$LayoutParams.anchorGravity>
	//    8   19:invokestatic    #359 <Method int resolveGravity(int)>
	//    9   22:iload_2         
	//   10   23:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   11   26:istore          8
		l & 7;
	//   12   28:iload           8
	//   13   30:bipush          7
	//   14   32:iand            
		JVM INSTR lookupswitch 2: default 60
	//	               1: 208
	//	               5: 200;
	//   15   33:lookupswitch    2: default 60
	//	               1: 208
	//	               5: 200
		   goto _L1 _L2 _L3
_L1:
		i = rect.left;
	//   16   60:aload_3         
	//   17   61:getfield        #271 <Field int Rect.left>
	//   18   64:istore_2        
_L13:
		l & 0x70;
	//   19   65:iload           8
	//   20   67:bipush          112
	//   21   69:iand            
		JVM INSTR lookupswitch 2: default 96
	//	               16: 234
	//	               80: 225;
	//   22   70:lookupswitch    2: default 96
	//	               16: 234
	//	               80: 225
		   goto _L4 _L5 _L6
_L4:
		l = rect.top;
	//   23   96:aload_3         
	//   24   97:getfield        #294 <Field int Rect.top>
	//   25  100:istore          8
_L14:
		int i1 = i;
	//   26  102:iload_2         
	//   27  103:istore          9
		j1 & 7;
	//   28  105:iload           10
	//   29  107:bipush          7
	//   30  109:iand            
		JVM INSTR lookupswitch 2: default 136
	//	               1: 250
	//	               5: 142;
	//   31  110:lookupswitch    2: default 136
	//	               1: 250
	//	               5: 142
		   goto _L7 _L8 _L9
_L9:
		break; /* Loop/switch isn't completed */
_L7:
		i1 = i - j;
	//   32  136:iload_2         
	//   33  137:iload           6
	//   34  139:isub            
	//   35  140:istore          9
_L15:
		i = l;
	//   36  142:iload           8
	//   37  144:istore_2        
		j1 & 0x70;
	//   38  145:iload           10
	//   39  147:bipush          112
	//   40  149:iand            
		JVM INSTR lookupswitch 2: default 176
	//	               16: 261
	//	               80: 182;
	//   41  150:lookupswitch    2: default 176
	//	               16: 261
	//	               80: 182
		   goto _L10 _L11 _L12
_L12:
		break; /* Loop/switch isn't completed */
_L10:
		i = l - k;
	//   42  176:iload           8
	//   43  178:iload           7
	//   44  180:isub            
	//   45  181:istore_2        
_L16:
		rect1.set(i1, i, i1 + j, i + k);
	//   46  182:aload           4
	//   47  184:iload           9
	//   48  186:iload_2         
	//   49  187:iload           9
	//   50  189:iload           6
	//   51  191:iadd            
	//   52  192:iload_2         
	//   53  193:iload           7
	//   54  195:iadd            
	//   55  196:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
		return;
	//   56  199:return          
_L3:
		i = rect.right;
	//   57  200:aload_3         
	//   58  201:getfield        #362 <Field int Rect.right>
	//   59  204:istore_2        
		  goto _L13
	//*  60  205:goto            65
_L2:
		i = rect.left;
	//   61  208:aload_3         
	//   62  209:getfield        #271 <Field int Rect.left>
	//   63  212:istore_2        
		i = rect.width() / 2 + i;
	//   64  213:aload_3         
	//   65  214:invokevirtual   #365 <Method int Rect.width()>
	//   66  217:iconst_2        
	//   67  218:idiv            
	//   68  219:iload_2         
	//   69  220:iadd            
	//   70  221:istore_2        
		  goto _L13
	//*  71  222:goto            65
_L6:
		l = rect.bottom;
	//   72  225:aload_3         
	//   73  226:getfield        #368 <Field int Rect.bottom>
	//   74  229:istore          8
		  goto _L14
	//*  75  231:goto            102
_L5:
		l = rect.top + rect.height() / 2;
	//   76  234:aload_3         
	//   77  235:getfield        #294 <Field int Rect.top>
	//   78  238:aload_3         
	//   79  239:invokevirtual   #371 <Method int Rect.height()>
	//   80  242:iconst_2        
	//   81  243:idiv            
	//   82  244:iadd            
	//   83  245:istore          8
		  goto _L14
	//*  84  247:goto            102
_L8:
		i1 = i - j / 2;
	//   85  250:iload_2         
	//   86  251:iload           6
	//   87  253:iconst_2        
	//   88  254:idiv            
	//   89  255:isub            
	//   90  256:istore          9
		  goto _L15
	//*  91  258:goto            142
_L11:
		i = l - k / 2;
	//   92  261:iload           8
	//   93  263:iload           7
	//   94  265:iconst_2        
	//   95  266:idiv            
	//   96  267:isub            
	//   97  268:istore_2        
		  goto _L16
	//*  98  269:goto            182
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
	//   16   39:invokestatic    #398 <Method int Log.e(String, String)>
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
	//   31   67:ldc2            #400 <String "Keyline index ">
	//   32   70:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:iload_1         
	//   34   74:invokevirtual   #389 <Method StringBuilder StringBuilder.append(int)>
	//   35   77:ldc2            #402 <String " out of range for ">
	//   36   80:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   37   83:aload_0         
	//   38   84:invokevirtual   #384 <Method StringBuilder StringBuilder.append(Object)>
	//   39   87:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   40   90:invokestatic    #398 <Method int Log.e(String, String)>
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
	//    1    1:invokeinterface #409 <Method void List.clear()>
		boolean flag = isChildrenDrawingOrderEnabled();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #412 <Method boolean isChildrenDrawingOrderEnabled()>
	//    4   10:istore          5
		int k = getChildCount();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #315 <Method int getChildCount()>
	//    7   16:istore          4
		int i = k - 1;
	//    8   18:iload           4
	//    9   20:iconst_1        
	//   10   21:isub            
	//   11   22:istore_2        
		while(i >= 0) 
	//*  12   23:iload_2         
	//*  13   24:iflt            64
		{
			int j;
			if(flag)
	//*  14   27:iload           5
	//*  15   29:ifeq            59
				j = getChildDrawingOrder(k, i);
	//   16   32:aload_0         
	//   17   33:iload           4
	//   18   35:iload_2         
	//   19   36:invokevirtual   #415 <Method int getChildDrawingOrder(int, int)>
	//   20   39:istore_3        
			else
	//*  21   40:aload_1         
	//*  22   41:aload_0         
	//*  23   42:iload_3         
	//*  24   43:invokevirtual   #319 <Method View getChildAt(int)>
	//*  25   46:invokeinterface #419 <Method boolean List.add(Object)>
	//*  26   51:pop             
	//*  27   52:iload_2         
	//*  28   53:iconst_1        
	//*  29   54:isub            
	//*  30   55:istore_2        
	//*  31   56:goto            23
				j = i;
	//   32   59:iload_2         
	//   33   60:istore_3        
			list.add(((Object) (getChildAt(j))));
			i--;
		}
	//*  34   61:goto            40
		if(TOP_SORTED_CHILDREN_COMPARATOR != null)
	//*  35   64:getstatic       #119 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//*  36   67:ifnull          77
			Collections.sort(list, TOP_SORTED_CHILDREN_COMPARATOR);
	//   37   70:aload_1         
	//   38   71:getstatic       #119 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//   39   74:invokestatic    #425 <Method void Collections.sort(List, Comparator)>
	//   40   77:return          
	}

	private boolean hasDependencies(View view)
	{
		return mChildDag.hasOutgoingEdges(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #431 <Method boolean DirectedAcyclicGraph.hasOutgoingEdges(Object)>
	//    4    8:ireturn         
	}

	private void layoutChild(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		Rect rect = acquireTempRect();
	//    4    8:invokestatic    #435 <Method Rect acquireTempRect()>
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
	//*  35   65:getfield        #437 <Field WindowInsetsCompat mLastInsets>
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
	//   47   93:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//   48   96:invokevirtual   #440 <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//   49   99:iadd            
	//   50  100:putfield        #271 <Field int Rect.left>
			rect.top = rect.top + mLastInsets.getSystemWindowInsetTop();
	//   51  103:aload           4
	//   52  105:aload           4
	//   53  107:getfield        #294 <Field int Rect.top>
	//   54  110:aload_0         
	//   55  111:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//   56  114:invokevirtual   #443 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   57  117:iadd            
	//   58  118:putfield        #294 <Field int Rect.top>
			rect.right = rect.right - mLastInsets.getSystemWindowInsetRight();
	//   59  121:aload           4
	//   60  123:aload           4
	//   61  125:getfield        #362 <Field int Rect.right>
	//   62  128:aload_0         
	//   63  129:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//   64  132:invokevirtual   #446 <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//   65  135:isub            
	//   66  136:putfield        #362 <Field int Rect.right>
			rect.bottom = rect.bottom - mLastInsets.getSystemWindowInsetBottom();
	//   67  139:aload           4
	//   68  141:aload           4
	//   69  143:getfield        #368 <Field int Rect.bottom>
	//   70  146:aload_0         
	//   71  147:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//   72  150:invokevirtual   #449 <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//   73  153:isub            
	//   74  154:putfield        #368 <Field int Rect.bottom>
		}
		Rect rect1 = acquireTempRect();
	//   75  157:invokestatic    #435 <Method Rect acquireTempRect()>
	//   76  160:astore          5
		GravityCompat.apply(resolveGravity(layoutparams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect1, i);
	//   77  162:aload_3         
	//   78  163:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//   79  166:invokestatic    #359 <Method int resolveGravity(int)>
	//   80  169:aload_1         
	//   81  170:invokevirtual   #452 <Method int View.getMeasuredWidth()>
	//   82  173:aload_1         
	//   83  174:invokevirtual   #455 <Method int View.getMeasuredHeight()>
	//   84  177:aload           4
	//   85  179:aload           5
	//   86  181:iload_2         
	//   87  182:invokestatic    #459 <Method void GravityCompat.apply(int, int, int, Rect, Rect, int)>
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
	//   97  206:invokevirtual   #462 <Method void View.layout(int, int, int, int)>
		releaseTempRect(rect);
	//   98  209:aload           4
	//   99  211:invokestatic    #466 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect1);
	//  100  214:aload           5
	//  101  216:invokestatic    #466 <Method void releaseTempRect(Rect)>
	//  102  219:return          
	}

	private void layoutChildWithAnchor(View view, View view1, int i)
	{
		Object obj;
		Rect rect;
		obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          4
		obj = ((Object) (acquireTempRect()));
	//    4    9:invokestatic    #435 <Method Rect acquireTempRect()>
	//    5   12:astore          4
		rect = acquireTempRect();
	//    6   14:invokestatic    #435 <Method Rect acquireTempRect()>
	//    7   17:astore          5
		getDescendantRect(view1, ((Rect) (obj)));
	//    8   19:aload_0         
	//    9   20:aload_2         
	//   10   21:aload           4
	//   11   23:invokevirtual   #472 <Method void getDescendantRect(View, Rect)>
		getDesiredAnchoredChildRect(view, i, ((Rect) (obj)), rect);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:iload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokevirtual   #476 <Method void getDesiredAnchoredChildRect(View, int, Rect, Rect)>
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
	//   27   57:invokevirtual   #462 <Method void View.layout(int, int, int, int)>
		releaseTempRect(((Rect) (obj)));
	//   28   60:aload           4
	//   29   62:invokestatic    #466 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect);
	//   30   65:aload           5
	//   31   67:invokestatic    #466 <Method void releaseTempRect(Rect)>
		return;
	//   32   70:return          
		view;
	//   33   71:astore_1        
		releaseTempRect(((Rect) (obj)));
	//   34   72:aload           4
	//   35   74:invokestatic    #466 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect);
	//   36   77:aload           5
	//   37   79:invokestatic    #466 <Method void releaseTempRect(Rect)>
		throw view;
	//   38   82:aload_1         
	//   39   83:athrow          
	}

	private void layoutChildWithKeyline(View view, int i, int j)
	{
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		LayoutParams layoutparams;
		layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          10
		l1 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), j);
	//    4    9:aload           10
	//    5   11:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//    6   14:invokestatic    #481 <Method int resolveKeylineGravity(int)>
	//    7   17:iload_3         
	//    8   18:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    9   21:istore          9
		k1 = getWidth();
	//   10   23:aload_0         
	//   11   24:invokevirtual   #259 <Method int getWidth()>
	//   12   27:istore          8
		j1 = getHeight();
	//   13   29:aload_0         
	//   14   30:invokevirtual   #262 <Method int getHeight()>
	//   15   33:istore          7
		l = view.getMeasuredWidth();
	//   16   35:aload_1         
	//   17   36:invokevirtual   #452 <Method int View.getMeasuredWidth()>
	//   18   39:istore          5
		i1 = view.getMeasuredHeight();
	//   19   41:aload_1         
	//   20   42:invokevirtual   #455 <Method int View.getMeasuredHeight()>
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
	//   33   64:invokespecial   #483 <Method int getKeyline(int)>
	//   34   67:iload           5
	//   35   69:isub            
	//   36   70:istore_2        
		j = 0;
	//   37   71:iconst_0        
	//   38   72:istore_3        
		l1 & 7;
	//   39   73:iload           9
	//   40   75:bipush          7
	//   41   77:iand            
		JVM INSTR lookupswitch 2: default 104
	//	               1: 227
	//	               5: 219;
	//   42   78:lookupswitch    2: default 104
	//	               1: 227
	//	               5: 219
		   goto _L1 _L2 _L3
_L1:
		l1 & 0x70;
	//   43  104:iload           9
	//   44  106:bipush          112
	//   45  108:iand            
		JVM INSTR lookupswitch 2: default 136
	//	               16: 245
	//	               80: 237;
	//   46  109:lookupswitch    2: default 136
	//	               16: 245
	//	               80: 237
		   goto _L4 _L5 _L6
_L4:
		i = Math.max(getPaddingLeft() + layoutparams.leftMargin, Math.min(i, k1 - getPaddingRight() - l - layoutparams.rightMargin));
	//   47  136:aload_0         
	//   48  137:invokevirtual   #265 <Method int getPaddingLeft()>
	//   49  140:aload           10
	//   50  142:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   51  145:iadd            
	//   52  146:iload_2         
	//   53  147:iload           8
	//   54  149:aload_0         
	//   55  150:invokevirtual   #274 <Method int getPaddingRight()>
	//   56  153:isub            
	//   57  154:iload           5
	//   58  156:isub            
	//   59  157:aload           10
	//   60  159:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   61  162:isub            
	//   62  163:invokestatic    #282 <Method int Math.min(int, int)>
	//   63  166:invokestatic    #285 <Method int Math.max(int, int)>
	//   64  169:istore_2        
		j = Math.max(getPaddingTop() + layoutparams.topMargin, Math.min(j, j1 - getPaddingBottom() - i1 - layoutparams.bottomMargin));
	//   65  170:aload_0         
	//   66  171:invokevirtual   #288 <Method int getPaddingTop()>
	//   67  174:aload           10
	//   68  176:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   69  179:iadd            
	//   70  180:iload_3         
	//   71  181:iload           7
	//   72  183:aload_0         
	//   73  184:invokevirtual   #297 <Method int getPaddingBottom()>
	//   74  187:isub            
	//   75  188:iload           6
	//   76  190:isub            
	//   77  191:aload           10
	//   78  193:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//   79  196:isub            
	//   80  197:invokestatic    #282 <Method int Math.min(int, int)>
	//   81  200:invokestatic    #285 <Method int Math.max(int, int)>
	//   82  203:istore_3        
		view.layout(i, j, i + l, j + i1);
	//   83  204:aload_1         
	//   84  205:iload_2         
	//   85  206:iload_3         
	//   86  207:iload_2         
	//   87  208:iload           5
	//   88  210:iadd            
	//   89  211:iload_3         
	//   90  212:iload           6
	//   91  214:iadd            
	//   92  215:invokevirtual   #462 <Method void View.layout(int, int, int, int)>
		return;
	//   93  218:return          
_L3:
		i += l;
	//   94  219:iload_2         
	//   95  220:iload           5
	//   96  222:iadd            
	//   97  223:istore_2        
		  goto _L1
	//*  98  224:goto            104
_L2:
		i += l / 2;
	//   99  227:iload_2         
	//  100  228:iload           5
	//  101  230:iconst_2        
	//  102  231:idiv            
	//  103  232:iadd            
	//  104  233:istore_2        
		  goto _L1
	//* 105  234:goto            104
_L6:
		j = 0 + i1;
	//  106  237:iconst_0        
	//  107  238:iload           6
	//  108  240:iadd            
	//  109  241:istore_3        
		  goto _L4
	//* 110  242:goto            136
_L5:
		j = 0 + i1 / 2;
	//  111  245:iconst_0        
	//  112  246:iload           6
	//  113  248:iconst_2        
	//  114  249:idiv            
	//  115  250:iadd            
	//  116  251:istore_3        
		  goto _L4
	//* 117  252:goto            136
	}

	private void offsetChildByInset(View view, Rect rect, int i)
	{
		int l;
		LayoutParams layoutparams;
		Rect rect1;
		while(!ViewCompat.isLaidOut(view) || view.getWidth() <= 0 || view.getHeight() <= 0) 
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #488 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
	//    4    8:aload_1         
	//    5    9:invokevirtual   #489 <Method int View.getWidth()>
	//    6   12:ifle            7
	//    7   15:aload_1         
	//    8   16:invokevirtual   #490 <Method int View.getHeight()>
	//    9   19:ifle            7
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   10   22:aload_1         
	//   11   23:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   26:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   13   29:astore          7
		Behavior behavior = layoutparams.getBehavior();
	//   14   31:aload           7
	//   15   33:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   16   36:astore          8
		rect1 = acquireTempRect();
	//   17   38:invokestatic    #435 <Method Rect acquireTempRect()>
	//   18   41:astore          9
		Rect rect2 = acquireTempRect();
	//   19   43:invokestatic    #435 <Method Rect acquireTempRect()>
	//   20   46:astore          10
		rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   21   48:aload           10
	//   22   50:aload_1         
	//   23   51:invokevirtual   #493 <Method int View.getLeft()>
	//   24   54:aload_1         
	//   25   55:invokevirtual   #496 <Method int View.getTop()>
	//   26   58:aload_1         
	//   27   59:invokevirtual   #499 <Method int View.getRight()>
	//   28   62:aload_1         
	//   29   63:invokevirtual   #502 <Method int View.getBottom()>
	//   30   66:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
		if(behavior != null && behavior.getInsetDodgeRect(this, view, rect1))
	//*  31   69:aload           8
	//*  32   71:ifnull          142
	//*  33   74:aload           8
	//*  34   76:aload_0         
	//*  35   77:aload_1         
	//*  36   78:aload           9
	//*  37   80:invokevirtual   #506 <Method boolean CoordinatorLayout$Behavior.getInsetDodgeRect(CoordinatorLayout, View, Rect)>
	//*  38   83:ifeq            142
		{
			if(!rect2.contains(rect1))
	//*  39   86:aload           10
	//*  40   88:aload           9
	//*  41   90:invokevirtual   #510 <Method boolean Rect.contains(Rect)>
	//*  42   93:ifne            149
				throw new IllegalArgumentException((new StringBuilder()).append("Rect should be within the child's bounds. Rect:").append(rect1.toShortString()).append(" | Bounds:").append(rect2.toShortString()).toString());
	//   43   96:new             #512 <Class IllegalArgumentException>
	//   44   99:dup             
	//   45  100:new             #374 <Class StringBuilder>
	//   46  103:dup             
	//   47  104:invokespecial   #375 <Method void StringBuilder()>
	//   48  107:ldc2            #514 <String "Rect should be within the child's bounds. Rect:">
	//   49  110:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   50  113:aload           9
	//   51  115:invokevirtual   #517 <Method String Rect.toShortString()>
	//   52  118:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   53  121:ldc2            #519 <String " | Bounds:">
	//   54  124:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   55  127:aload           10
	//   56  129:invokevirtual   #517 <Method String Rect.toShortString()>
	//   57  132:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   58  135:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   59  138:invokespecial   #522 <Method void IllegalArgumentException(String)>
	//   60  141:athrow          
		} else
		{
			rect1.set(rect2);
	//   61  142:aload           9
	//   62  144:aload           10
	//   63  146:invokevirtual   #524 <Method void Rect.set(Rect)>
		}
		releaseTempRect(rect2);
	//   64  149:aload           10
	//   65  151:invokestatic    #466 <Method void releaseTempRect(Rect)>
		if(rect1.isEmpty())
	//*  66  154:aload           9
	//*  67  156:invokevirtual   #527 <Method boolean Rect.isEmpty()>
	//*  68  159:ifeq            168
		{
			releaseTempRect(rect1);
	//   69  162:aload           9
	//   70  164:invokestatic    #466 <Method void releaseTempRect(Rect)>
			return;
	//   71  167:return          
		}
		l = GravityCompat.getAbsoluteGravity(layoutparams.dodgeInsetEdges, i);
	//   72  168:aload           7
	//   73  170:getfield        #530 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//   74  173:iload_3         
	//   75  174:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   76  177:istore          5
		if((l & 0x30) != 48) goto _L2; else goto _L1
	//   77  179:iload           5
	//   78  181:bipush          48
	//   79  183:iand            
	//   80  184:bipush          48
	//   81  186:icmpne          441
_L1:
		i = rect1.top - layoutparams.topMargin - layoutparams.mInsetOffsetY;
	//   82  189:aload           9
	//   83  191:getfield        #294 <Field int Rect.top>
	//   84  194:aload           7
	//   85  196:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   86  199:isub            
	//   87  200:aload           7
	//   88  202:getfield        #533 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//   89  205:isub            
	//   90  206:istore_3        
		if(i >= rect.top) goto _L2; else goto _L3
	//   91  207:iload_3         
	//   92  208:aload_2         
	//   93  209:getfield        #294 <Field int Rect.top>
	//   94  212:icmpge          441
_L3:
		setInsetOffsetY(view, rect.top - i);
	//   95  215:aload_0         
	//   96  216:aload_1         
	//   97  217:aload_2         
	//   98  218:getfield        #294 <Field int Rect.top>
	//   99  221:iload_3         
	//  100  222:isub            
	//  101  223:invokespecial   #536 <Method void setInsetOffsetY(View, int)>
		i = 1;
	//  102  226:iconst_1        
	//  103  227:istore_3        
_L9:
		int j = i;
	//  104  228:iload_3         
	//  105  229:istore          4
		if((l & 0x50) == 80)
	//* 106  231:iload           5
	//* 107  233:bipush          80
	//* 108  235:iand            
	//* 109  236:bipush          80
	//* 110  238:icmpne          292
		{
			int j1 = (getHeight() - rect1.bottom - layoutparams.bottomMargin) + layoutparams.mInsetOffsetY;
	//  111  241:aload_0         
	//  112  242:invokevirtual   #262 <Method int getHeight()>
	//  113  245:aload           9
	//  114  247:getfield        #368 <Field int Rect.bottom>
	//  115  250:isub            
	//  116  251:aload           7
	//  117  253:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//  118  256:isub            
	//  119  257:aload           7
	//  120  259:getfield        #533 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//  121  262:iadd            
	//  122  263:istore          6
			j = i;
	//  123  265:iload_3         
	//  124  266:istore          4
			if(j1 < rect.bottom)
	//* 125  268:iload           6
	//* 126  270:aload_2         
	//* 127  271:getfield        #368 <Field int Rect.bottom>
	//* 128  274:icmpge          292
			{
				setInsetOffsetY(view, j1 - rect.bottom);
	//  129  277:aload_0         
	//  130  278:aload_1         
	//  131  279:iload           6
	//  132  281:aload_2         
	//  133  282:getfield        #368 <Field int Rect.bottom>
	//  134  285:isub            
	//  135  286:invokespecial   #536 <Method void setInsetOffsetY(View, int)>
				j = 1;
	//  136  289:iconst_1        
	//  137  290:istore          4
			}
		}
		if(j == 0)
	//* 138  292:iload           4
	//* 139  294:ifne            303
			setInsetOffsetY(view, 0);
	//  140  297:aload_0         
	//  141  298:aload_1         
	//  142  299:iconst_0        
	//  143  300:invokespecial   #536 <Method void setInsetOffsetY(View, int)>
		if((l & 3) != 3) goto _L5; else goto _L4
	//  144  303:iload           5
	//  145  305:iconst_3        
	//  146  306:iand            
	//  147  307:iconst_3        
	//  148  308:icmpne          436
_L4:
		i = rect1.left - layoutparams.leftMargin - layoutparams.mInsetOffsetX;
	//  149  311:aload           9
	//  150  313:getfield        #271 <Field int Rect.left>
	//  151  316:aload           7
	//  152  318:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//  153  321:isub            
	//  154  322:aload           7
	//  155  324:getfield        #539 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//  156  327:isub            
	//  157  328:istore_3        
		if(i >= rect.left) goto _L5; else goto _L6
	//  158  329:iload_3         
	//  159  330:aload_2         
	//  160  331:getfield        #271 <Field int Rect.left>
	//  161  334:icmpge          436
_L6:
		setInsetOffsetX(view, rect.left - i);
	//  162  337:aload_0         
	//  163  338:aload_1         
	//  164  339:aload_2         
	//  165  340:getfield        #271 <Field int Rect.left>
	//  166  343:iload_3         
	//  167  344:isub            
	//  168  345:invokespecial   #542 <Method void setInsetOffsetX(View, int)>
		i = 1;
	//  169  348:iconst_1        
	//  170  349:istore_3        
_L7:
		if((l & 5) == 5)
	//* 171  350:iload           5
	//* 172  352:iconst_5        
	//* 173  353:iand            
	//* 174  354:iconst_5        
	//* 175  355:icmpne          433
		{
			int k = getWidth();
	//  176  358:aload_0         
	//  177  359:invokevirtual   #259 <Method int getWidth()>
	//  178  362:istore          4
			int i1 = rect1.right;
	//  179  364:aload           9
	//  180  366:getfield        #362 <Field int Rect.right>
	//  181  369:istore          5
			int k1 = layoutparams.rightMargin;
	//  182  371:aload           7
	//  183  373:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//  184  376:istore          6
			k = layoutparams.mInsetOffsetX + (k - i1 - k1);
	//  185  378:aload           7
	//  186  380:getfield        #539 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//  187  383:iload           4
	//  188  385:iload           5
	//  189  387:isub            
	//  190  388:iload           6
	//  191  390:isub            
	//  192  391:iadd            
	//  193  392:istore          4
			if(k < rect.right)
	//* 194  394:iload           4
	//* 195  396:aload_2         
	//* 196  397:getfield        #362 <Field int Rect.right>
	//* 197  400:icmpge          433
			{
				setInsetOffsetX(view, k - rect.right);
	//  198  403:aload_0         
	//  199  404:aload_1         
	//  200  405:iload           4
	//  201  407:aload_2         
	//  202  408:getfield        #362 <Field int Rect.right>
	//  203  411:isub            
	//  204  412:invokespecial   #542 <Method void setInsetOffsetX(View, int)>
				i = 1;
	//  205  415:iconst_1        
	//  206  416:istore_3        
			}
		}
		if(i == 0)
	//* 207  417:iload_3         
	//* 208  418:ifne            427
			setInsetOffsetX(view, 0);
	//  209  421:aload_0         
	//  210  422:aload_1         
	//  211  423:iconst_0        
	//  212  424:invokespecial   #542 <Method void setInsetOffsetX(View, int)>
		releaseTempRect(rect1);
	//  213  427:aload           9
	//  214  429:invokestatic    #466 <Method void releaseTempRect(Rect)>
		return;
	//  215  432:return          
	//* 216  433:goto            417
_L5:
		i = 0;
	//  217  436:iconst_0        
	//  218  437:istore_3        
		if(true) goto _L7; else goto _L2
	//  219  438:goto            350
_L2:
		i = 0;
	//  220  441:iconst_0        
	//  221  442:istore_3        
		if(true) goto _L9; else goto _L8
	//  222  443:goto            228
_L8:
	}

	static Behavior parseBehavior(Context context, AttributeSet attributeset, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #551 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		String s1;
		Constructor constructor;
		Constructor constructor1;
		if(s.startsWith("."))
	//*   5    9:aload_2         
	//*   6   10:ldc2            #553 <String ".">
	//*   7   13:invokevirtual   #559 <Method boolean String.startsWith(String)>
	//*   8   16:ifeq            147
		{
			s1 = (new StringBuilder()).append(context.getPackageName()).append(s).toString();
	//    9   19:new             #374 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #375 <Method void StringBuilder()>
	//   12   26:aload_0         
	//   13   27:invokevirtual   #562 <Method String Context.getPackageName()>
	//   14   30:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   18   40:astore_3        
		} else
	//*  19   41:getstatic       #130 <Field ThreadLocal sConstructors>
	//*  20   44:invokevirtual   #565 <Method Object ThreadLocal.get()>
	//*  21   47:checkcast       #567 <Class Map>
	//*  22   50:astore_2        
	//*  23   51:aload_2         
	//*  24   52:ifnonnull       228
	//*  25   55:new             #569 <Class HashMap>
	//*  26   58:dup             
	//*  27   59:invokespecial   #570 <Method void HashMap()>
	//*  28   62:astore_2        
	//*  29   63:getstatic       #130 <Field ThreadLocal sConstructors>
	//*  30   66:aload_2         
	//*  31   67:invokevirtual   #573 <Method void ThreadLocal.set(Object)>
	//*  32   70:aload_2         
	//*  33   71:aload_3         
	//*  34   72:invokeinterface #576 <Method Object Map.get(Object)>
	//*  35   77:checkcast       #578 <Class Constructor>
	//*  36   80:astore          5
	//*  37   82:aload           5
	//*  38   84:astore          4
	//*  39   86:aload           5
	//*  40   88:ifnonnull       124
	//*  41   91:aload_3         
	//*  42   92:iconst_1        
	//*  43   93:aload_0         
	//*  44   94:invokevirtual   #582 <Method ClassLoader Context.getClassLoader()>
	//*  45   97:invokestatic    #586 <Method Class Class.forName(String, boolean, ClassLoader)>
	//*  46  100:getstatic       #125 <Field Class[] CONSTRUCTOR_PARAMS>
	//*  47  103:invokevirtual   #590 <Method Constructor Class.getConstructor(Class[])>
	//*  48  106:astore          4
	//*  49  108:aload           4
	//*  50  110:iconst_1        
	//*  51  111:invokevirtual   #594 <Method void Constructor.setAccessible(boolean)>
	//*  52  114:aload_2         
	//*  53  115:aload_3         
	//*  54  116:aload           4
	//*  55  118:invokeinterface #598 <Method Object Map.put(Object, Object)>
	//*  56  123:pop             
	//*  57  124:aload           4
	//*  58  126:iconst_2        
	//*  59  127:anewarray       Object[]
	//*  60  130:dup             
	//*  61  131:iconst_0        
	//*  62  132:aload_0         
	//*  63  133:aastore         
	//*  64  134:dup             
	//*  65  135:iconst_1        
	//*  66  136:aload_1         
	//*  67  137:aastore         
	//*  68  138:invokevirtual   #604 <Method Object Constructor.newInstance(Object[])>
	//*  69  141:checkcast       #10  <Class CoordinatorLayout$Behavior>
	//*  70  144:astore_0        
	//*  71  145:aload_0         
	//*  72  146:areturn         
		{
			s1 = s;
	//   73  147:aload_2         
	//   74  148:astore_3        
			if(s.indexOf('.') < 0)
	//*  75  149:aload_2         
	//*  76  150:bipush          46
	//*  77  152:invokevirtual   #607 <Method int String.indexOf(int)>
	//*  78  155:ifge            41
			{
				s1 = s;
	//   79  158:aload_2         
	//   80  159:astore_3        
				if(!TextUtils.isEmpty(((CharSequence) (WIDGET_PACKAGE_NAME))))
	//*  81  160:getstatic       #109 <Field String WIDGET_PACKAGE_NAME>
	//*  82  163:invokestatic    #551 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  83  166:ifne            41
					s1 = (new StringBuilder()).append(WIDGET_PACKAGE_NAME).append('.').append(s).toString();
	//   84  169:new             #374 <Class StringBuilder>
	//   85  172:dup             
	//   86  173:invokespecial   #375 <Method void StringBuilder()>
	//   87  176:getstatic       #109 <Field String WIDGET_PACKAGE_NAME>
	//   88  179:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   89  182:bipush          46
	//   90  184:invokevirtual   #610 <Method StringBuilder StringBuilder.append(char)>
	//   91  187:aload_2         
	//   92  188:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   93  191:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   94  194:astore_3        
			}
		}
		try
		{
			s = ((String) ((Map)sConstructors.get()));
		}
	//*  95  195:goto            41
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  96  198:astore_0        
		{
			throw new RuntimeException((new StringBuilder()).append("Could not inflate Behavior subclass ").append(s1).toString(), ((Throwable) (context)));
	//   97  199:new             #612 <Class RuntimeException>
	//   98  202:dup             
	//   99  203:new             #374 <Class StringBuilder>
	//  100  206:dup             
	//  101  207:invokespecial   #375 <Method void StringBuilder()>
	//  102  210:ldc2            #614 <String "Could not inflate Behavior subclass ">
	//  103  213:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//  104  216:aload_3         
	//  105  217:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//  106  220:invokevirtual   #392 <Method String StringBuilder.toString()>
	//  107  223:aload_0         
	//  108  224:invokespecial   #617 <Method void RuntimeException(String, Throwable)>
	//  109  227:athrow          
		}
		if(s != null)
			break MISSING_BLOCK_LABEL_70;
		s = ((String) (new HashMap()));
		sConstructors.set(((Object) (s)));
		constructor1 = (Constructor)((Map) (s)).get(((Object) (s1)));
		constructor = constructor1;
		if(constructor1 != null)
			break MISSING_BLOCK_LABEL_124;
		constructor = Class.forName(s1, true, context.getClassLoader()).getConstructor(CONSTRUCTOR_PARAMS);
		constructor.setAccessible(true);
		((Map) (s)).put(((Object) (s1)), ((Object) (constructor)));
		context = ((Context) ((Behavior)constructor.newInstance(new Object[] {
			context, attributeset
		})));
		return ((Behavior) (context));
	//* 110  228:goto            70
	}

	private boolean performIntercept(MotionEvent motionevent, int i)
	{
		boolean flag;
		int j;
		int k;
		int l;
		boolean flag1;
		MotionEvent motionevent1;
		List list;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		flag = false;
	//    2    3:iconst_0        
	//    3    4:istore_3        
		motionevent1 = null;
	//    4    5:aconst_null     
	//    5    6:astore          12
		k = motionevent.getActionMasked();
	//    6    8:aload_1         
	//    7    9:invokevirtual   #624 <Method int MotionEvent.getActionMasked()>
	//    8   12:istore          5
		list = mTempList1;
	//    9   14:aload_0         
	//   10   15:getfield        #158 <Field List mTempList1>
	//   11   18:astore          13
		getTopSortedChildren(list);
	//   12   20:aload_0         
	//   13   21:aload           13
	//   14   23:invokespecial   #626 <Method void getTopSortedChildren(List)>
		l = list.size();
	//   15   26:aload           13
	//   16   28:invokeinterface #629 <Method int List.size()>
	//   17   33:istore          6
		j = 0;
	//   18   35:iconst_0        
	//   19   36:istore          4
_L9:
		if(j >= l) goto _L2; else goto _L1
	//   20   38:iload           4
	//   21   40:iload           6
	//   22   42:icmpge          333
_L1:
		View view;
		Behavior behavior;
		LayoutParams layoutparams;
		view = (View)list.get(j);
	//   23   45:aload           13
	//   24   47:iload           4
	//   25   49:invokeinterface #632 <Method Object List.get(int)>
	//   26   54:checkcast       #327 <Class View>
	//   27   57:astore          14
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   28   59:aload           14
	//   29   61:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   64:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   31   67:astore          16
		behavior = layoutparams.getBehavior();
	//   32   69:aload           16
	//   33   71:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   34   74:astore          15
		if(!flag1 && !flag || k == 0) goto _L4; else goto _L3
	//   35   76:iload           7
	//   36   78:ifne            85
	//   37   81:iload_3         
	//   38   82:ifeq            177
	//   39   85:iload           5
	//   40   87:ifeq            177
_L3:
		if(behavior == null) goto _L6; else goto _L5
	//   41   90:aload           15
	//   42   92:ifnull          330
_L5:
		if(motionevent1 == null)
	//*  43   95:aload           12
	//*  44   97:ifnonnull       327
		{
			long l1 = SystemClock.uptimeMillis();
	//   45  100:invokestatic    #638 <Method long SystemClock.uptimeMillis()>
	//   46  103:lstore          10
			motionevent1 = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
	//   47  105:lload           10
	//   48  107:lload           10
	//   49  109:iconst_3        
	//   50  110:fconst_0        
	//   51  111:fconst_0        
	//   52  112:iconst_0        
	//   53  113:invokestatic    #642 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   54  116:astore          12
		}
		i;
	//   55  118:iload_2         
		JVM INSTR tableswitch 0 1: default 140
	//	               0 149
	//	               1 163;
	//   56  119:tableswitch     0 1: default 140
	//	               0 149
	//	               1 163
		   goto _L6 _L7 _L8
_L6:
		j++;
	//   57  140:iload           4
	//   58  142:iconst_1        
	//   59  143:iadd            
	//   60  144:istore          4
		  goto _L9
	//*  61  146:goto            38
_L7:
		behavior.onInterceptTouchEvent(this, view, motionevent1);
	//   62  149:aload           15
	//   63  151:aload_0         
	//   64  152:aload           14
	//   65  154:aload           12
	//   66  156:invokevirtual   #646 <Method boolean CoordinatorLayout$Behavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   67  159:pop             
		  goto _L6
	//*  68  160:goto            140
_L8:
		behavior.onTouchEvent(this, view, motionevent1);
	//   69  163:aload           15
	//   70  165:aload_0         
	//   71  166:aload           14
	//   72  168:aload           12
	//   73  170:invokevirtual   #649 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   74  173:pop             
		  goto _L6
	//*  75  174:goto            140
_L4:
		boolean flag2 = flag1;
	//   76  177:iload           7
	//   77  179:istore          8
		if(flag1) goto _L11; else goto _L10
	//   78  181:iload           7
	//   79  183:ifne            239
_L10:
		flag2 = flag1;
	//   80  186:iload           7
	//   81  188:istore          8
		if(behavior == null) goto _L11; else goto _L12
	//   82  190:aload           15
	//   83  192:ifnull          239
_L12:
		i;
	//   84  195:iload_2         
		JVM INSTR tableswitch 0 1: default 220
	//	               0 291
	//	               1 305;
	//   85  196:tableswitch     0 1: default 220
	//	               0 291
	//	               1 305
		   goto _L13 _L14 _L15
_L13:
		break; /* Loop/switch isn't completed */
_L15:
		break MISSING_BLOCK_LABEL_305;
_L16:
		flag2 = flag1;
	//   86  220:iload           7
	//   87  222:istore          8
		if(flag1)
	//*  88  224:iload           7
	//*  89  226:ifeq            239
		{
			mBehaviorTouchView = view;
	//   90  229:aload_0         
	//   91  230:aload           14
	//   92  232:putfield        #651 <Field View mBehaviorTouchView>
			flag2 = flag1;
	//   93  235:iload           7
	//   94  237:istore          8
		}
_L11:
		flag1 = flag2;
	//   95  239:iload           8
	//   96  241:istore          7
		flag2 = layoutparams.didBlockInteraction();
	//   97  243:aload           16
	//   98  245:invokevirtual   #654 <Method boolean CoordinatorLayout$LayoutParams.didBlockInteraction()>
	//   99  248:istore          8
		boolean flag3 = layoutparams.isBlockingInteractionBelow(this, view);
	//  100  250:aload           16
	//  101  252:aload_0         
	//  102  253:aload           14
	//  103  255:invokevirtual   #658 <Method boolean CoordinatorLayout$LayoutParams.isBlockingInteractionBelow(CoordinatorLayout, View)>
	//  104  258:istore          9
		if(flag3 && !flag2)
	//* 105  260:iload           9
	//* 106  262:ifeq            319
	//* 107  265:iload           8
	//* 108  267:ifne            319
			flag = true;
	//  109  270:iconst_1        
	//  110  271:istore_3        
		else
	//* 111  272:iload           9
	//* 112  274:ifeq            324
	//* 113  277:iload_3         
	//* 114  278:ifne            324
	//* 115  281:aload           13
	//* 116  283:invokeinterface #409 <Method void List.clear()>
	//* 117  288:iload           7
	//* 118  290:ireturn         
	//* 119  291:aload           15
	//* 120  293:aload_0         
	//* 121  294:aload           14
	//* 122  296:aload_1         
	//* 123  297:invokevirtual   #646 <Method boolean CoordinatorLayout$Behavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//* 124  300:istore          7
	//* 125  302:goto            220
	//* 126  305:aload           15
	//* 127  307:aload_0         
	//* 128  308:aload           14
	//* 129  310:aload_1         
	//* 130  311:invokevirtual   #649 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//* 131  314:istore          7
	//* 132  316:goto            220
			flag = false;
	//  133  319:iconst_0        
	//  134  320:istore_3        
		if(!flag3 || flag) goto _L6; else goto _L2
_L2:
		list.clear();
		return flag1;
_L14:
		flag1 = behavior.onInterceptTouchEvent(this, view, motionevent);
		  goto _L16
		flag1 = behavior.onTouchEvent(this, view, motionevent);
		  goto _L16
	//* 135  321:goto            272
	//* 136  324:goto            140
	//* 137  327:goto            118
	//* 138  330:goto            140
	//* 139  333:goto            281
	}

	private void prepareChildren()
	{
		mDependencySortedChildren.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field List mDependencySortedChildren>
	//    2    4:invokeinterface #409 <Method void List.clear()>
		mChildDag.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//    5   13:invokevirtual   #660 <Method void DirectedAcyclicGraph.clear()>
		int k = getChildCount();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #315 <Method int getChildCount()>
	//    8   20:istore_3        
		int i = 0;
	//    9   21:iconst_0        
	//   10   22:istore_1        
		do
		{
			if(i >= k)
				break;
	//   11   23:iload_1         
	//   12   24:iload_3         
	//   13   25:icmpge          142
			View view = getChildAt(i);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #319 <Method View getChildAt(int)>
	//   17   33:astore          4
			LayoutParams layoutparams = getResolvedLayoutParams(view);
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:invokevirtual   #664 <Method CoordinatorLayout$LayoutParams getResolvedLayoutParams(View)>
	//   21   41:astore          5
			layoutparams.findAnchorView(this, view);
	//   22   43:aload           5
	//   23   45:aload_0         
	//   24   46:aload           4
	//   25   48:invokevirtual   #668 <Method View CoordinatorLayout$LayoutParams.findAnchorView(CoordinatorLayout, View)>
	//   26   51:pop             
			mChildDag.addNode(((Object) (view)));
	//   27   52:aload_0         
	//   28   53:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//   29   56:aload           4
	//   30   58:invokevirtual   #671 <Method void DirectedAcyclicGraph.addNode(Object)>
			int j = 0;
	//   31   61:iconst_0        
	//   32   62:istore_2        
			while(j < k) 
	//*  33   63:iload_2         
	//*  34   64:iload_3         
	//*  35   65:icmpge          135
			{
				if(j != i)
	//*  36   68:iload_2         
	//*  37   69:iload_1         
	//*  38   70:icmpne          80
	//*  39   73:iload_2         
	//*  40   74:iconst_1        
	//*  41   75:iadd            
	//*  42   76:istore_2        
	//*  43   77:goto            63
				{
					View view1 = getChildAt(j);
	//   44   80:aload_0         
	//   45   81:iload_2         
	//   46   82:invokevirtual   #319 <Method View getChildAt(int)>
	//   47   85:astore          6
					if(layoutparams.dependsOn(this, view, view1))
	//*  48   87:aload           5
	//*  49   89:aload_0         
	//*  50   90:aload           4
	//*  51   92:aload           6
	//*  52   94:invokevirtual   #675 <Method boolean CoordinatorLayout$LayoutParams.dependsOn(CoordinatorLayout, View, View)>
	//*  53   97:ifeq            73
					{
						if(!mChildDag.contains(((Object) (view1))))
	//*  54  100:aload_0         
	//*  55  101:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//*  56  104:aload           6
	//*  57  106:invokevirtual   #677 <Method boolean DirectedAcyclicGraph.contains(Object)>
	//*  58  109:ifne            121
							mChildDag.addNode(((Object) (view1)));
	//   59  112:aload_0         
	//   60  113:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//   61  116:aload           6
	//   62  118:invokevirtual   #671 <Method void DirectedAcyclicGraph.addNode(Object)>
						mChildDag.addEdge(((Object) (view1)), ((Object) (view)));
	//   63  121:aload_0         
	//   64  122:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//   65  125:aload           6
	//   66  127:aload           4
	//   67  129:invokevirtual   #681 <Method void DirectedAcyclicGraph.addEdge(Object, Object)>
					}
				}
				j++;
			}
	//*  68  132:goto            73
			i++;
	//   69  135:iload_1         
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:istore_1        
		} while(true);
	//   73  139:goto            23
		mDependencySortedChildren.addAll(((java.util.Collection) (mChildDag.getSortedList())));
	//   74  142:aload_0         
	//   75  143:getfield        #151 <Field List mDependencySortedChildren>
	//   76  146:aload_0         
	//   77  147:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//   78  150:invokevirtual   #685 <Method ArrayList DirectedAcyclicGraph.getSortedList()>
	//   79  153:invokeinterface #689 <Method boolean List.addAll(java.util.Collection)>
	//   80  158:pop             
		Collections.reverse(mDependencySortedChildren);
	//   81  159:aload_0         
	//   82  160:getfield        #151 <Field List mDependencySortedChildren>
	//   83  163:invokestatic    #692 <Method void Collections.reverse(List)>
	//   84  166:return          
	}

	private static void releaseTempRect(Rect rect)
	{
		rect.setEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #695 <Method void Rect.setEmpty()>
		sRectPool.release(((Object) (rect)));
	//    2    4:getstatic       #137 <Field android.support.v4.util.Pools$Pool sRectPool>
	//    3    7:aload_0         
	//    4    8:invokeinterface #698 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private void resetTouchBehaviors()
	{
		if(mBehaviorTouchView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #651 <Field View mBehaviorTouchView>
	//*   2    4:ifnull          65
		{
			Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
	//    3    7:aload_0         
	//    4    8:getfield        #651 <Field View mBehaviorTouchView>
	//    5   11:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    6   14:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    7   17:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    8   20:astore          5
			if(behavior != null)
	//*   9   22:aload           5
	//*  10   24:ifnull          60
			{
				long l = SystemClock.uptimeMillis();
	//   11   27:invokestatic    #638 <Method long SystemClock.uptimeMillis()>
	//   12   30:lstore_3        
				MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   13   31:lload_3         
	//   14   32:lload_3         
	//   15   33:iconst_3        
	//   16   34:fconst_0        
	//   17   35:fconst_0        
	//   18   36:iconst_0        
	//   19   37:invokestatic    #642 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   20   40:astore          6
				behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
	//   21   42:aload           5
	//   22   44:aload_0         
	//   23   45:aload_0         
	//   24   46:getfield        #651 <Field View mBehaviorTouchView>
	//   25   49:aload           6
	//   26   51:invokevirtual   #649 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   27   54:pop             
				motionevent.recycle();
	//   28   55:aload           6
	//   29   57:invokevirtual   #701 <Method void MotionEvent.recycle()>
			}
			mBehaviorTouchView = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #651 <Field View mBehaviorTouchView>
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
	//   45   85:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   46   88:invokevirtual   #704 <Method void CoordinatorLayout$LayoutParams.resetTouchBehaviorTracking()>

	//   47   91:iload_1         
	//   48   92:iconst_1        
	//   49   93:iadd            
	//   50   94:istore_1        
	//*  51   95:goto            72
		mDisallowInterceptReset = false;
	//   52   98:aload_0         
	//   53   99:iconst_0        
	//   54  100:putfield        #706 <Field boolean mDisallowInterceptReset>
	//   55  103:return          
	}

	private static int resolveAnchoredChildGravity(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            9
			j = 17;
	//    4    6:bipush          17
	//    5    8:istore_1        
		return j;
	//    6    9:iload_1         
	//    7   10:ireturn         
	}

	private static int resolveGravity(int i)
	{
		if((i & 7) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          7
	//*   2    3:iand            
	//*   3    4:ifne            29
			i = 0x800003 | i;
	//    4    7:ldc2            #707 <Int 0x800003>
	//    5   10:iload_0         
	//    6   11:ior             
	//    7   12:istore_0        
		int j = i;
	//    8   13:iload_0         
	//    9   14:istore_1        
		if((i & 0x70) == 0)
	//*  10   15:iload_0         
	//*  11   16:bipush          112
	//*  12   18:iand            
	//*  13   19:ifne            27
			j = i | 0x30;
	//   14   22:iload_0         
	//   15   23:bipush          48
	//   16   25:ior             
	//   17   26:istore_1        
		return j;
	//   18   27:iload_1         
	//   19   28:ireturn         
	//*  20   29:goto            13
	}

	private static int resolveKeylineGravity(int i)
	{
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            10
			j = 0x800035;
	//    4    6:ldc2            #708 <Int 0x800035>
	//    5    9:istore_1        
		return j;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	private void setInsetOffsetX(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.mInsetOffsetX != i)
	//*   4    8:aload_3         
	//*   5    9:getfield        #539 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ViewCompat.offsetLeftAndRight(view, i - layoutparams.mInsetOffsetX);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #539 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//   12   22:isub            
	//   13   23:invokestatic    #711 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			layoutparams.mInsetOffsetX = i;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #539 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
		}
	//   17   31:return          
	}

	private void setInsetOffsetY(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.mInsetOffsetY != i)
	//*   4    8:aload_3         
	//*   5    9:getfield        #533 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ViewCompat.offsetTopAndBottom(view, i - layoutparams.mInsetOffsetY);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #533 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//   12   22:isub            
	//   13   23:invokestatic    #714 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			layoutparams.mInsetOffsetY = i;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #533 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
		}
	//   17   31:return          
	}

	private void setupForInsets()
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #114 <Field int android.os.Build$VERSION.SDK_INT>
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
	//*   8   17:getfield        #716 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
	//*   9   20:ifnonnull       35
				mApplyWindowInsetsListener = new OnApplyWindowInsetsListener() {

					public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowinsetscompat)
					{
						return setWindowInsets(windowinsetscompat);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field CoordinatorLayout this$0>
					//    2    4:aload_2         
					//    3    5:invokevirtual   #26  <Method WindowInsetsCompat CoordinatorLayout.setWindowInsets(WindowInsetsCompat)>
					//    4    8:areturn         
					}

					final CoordinatorLayout this$0;

			
			{
				this$0 = CoordinatorLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field CoordinatorLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
;
	//   10   23:aload_0         
	//   11   24:new             #8   <Class CoordinatorLayout$1>
	//   12   27:dup             
	//   13   28:aload_0         
	//   14   29:invokespecial   #717 <Method void CoordinatorLayout$1(CoordinatorLayout)>
	//   15   32:putfield        #716 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
			ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), mApplyWindowInsetsListener);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #716 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
	//   19   40:invokestatic    #721 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			setSystemUiVisibility(1280);
	//   20   43:aload_0         
	//   21   44:sipush          1280
	//   22   47:invokevirtual   #724 <Method void setSystemUiVisibility(int)>
			return;
	//   23   50:return          
		} else
		{
			ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), ((OnApplyWindowInsetsListener) (null)));
	//   24   51:aload_0         
	//   25   52:aconst_null     
	//   26   53:invokestatic    #721 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			return;
	//   27   56:return          
		}
	}

	void addPreDrawListener()
	{
		if(mIsAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #727 <Field boolean mIsAttachedToWindow>
	//*   2    4:ifeq            37
		{
			if(mOnPreDrawListener == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*   5   11:ifnonnull       26
				mOnPreDrawListener = new OnPreDrawListener();
	//    6   14:aload_0         
	//    7   15:new             #25  <Class CoordinatorLayout$OnPreDrawListener>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #730 <Method void CoordinatorLayout$OnPreDrawListener(CoordinatorLayout)>
	//   11   23:putfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #734 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   30:aload_0         
	//   15   31:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   16   34:invokevirtual   #740 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		mNeedsPreDrawListener = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #742 <Field boolean mNeedsPreDrawListener>
	//   20   42:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #22  <Class CoordinatorLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #746 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void dispatchDependentViewsChanged(View view)
	{
		List list = mChildDag.getIncomingEdges(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #752 <Method List DirectedAcyclicGraph.getIncomingEdges(Object)>
	//    4    8:astore_3        
		if(list != null && !list.isEmpty())
	//*   5    9:aload_3         
	//*   6   10:ifnull          81
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #753 <Method boolean List.isEmpty()>
	//*   9   19:ifne            81
		{
			for(int i = 0; i < list.size(); i++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_3         
	//*  14   26:invokeinterface #629 <Method int List.size()>
	//*  15   31:icmpge          81
			{
				View view1 = (View)list.get(i);
	//   16   34:aload_3         
	//   17   35:iload_2         
	//   18   36:invokeinterface #632 <Method Object List.get(int)>
	//   19   41:checkcast       #327 <Class View>
	//   20   44:astore          4
				Behavior behavior = ((LayoutParams)view1.getLayoutParams()).getBehavior();
	//   21   46:aload           4
	//   22   48:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   51:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
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
	//   32   70:invokevirtual   #756 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
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
		boolean flag;
		Rect rect;
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore          6
		if(view.getVisibility() != 0 || view1.getVisibility() != 0)
			break MISSING_BLOCK_LABEL_165;
	//    2    3:aload_1         
	//    3    4:invokevirtual   #761 <Method int View.getVisibility()>
	//    4    7:ifne            165
	//    5   10:aload_2         
	//    6   11:invokevirtual   #761 <Method int View.getVisibility()>
	//    7   14:ifne            165
		rect = acquireTempRect();
	//    8   17:invokestatic    #435 <Method Rect acquireTempRect()>
	//    9   20:astore          7
		int i;
		int j;
		if(view.getParent() != this)
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #765 <Method ViewParent View.getParent()>
	//*  12   26:aload_0         
	//*  13   27:if_acmpeq       135
			flag = true;
	//   14   30:iconst_1        
	//   15   31:istore          5
		else
	//*  16   33:aload_0         
	//*  17   34:aload_1         
	//*  18   35:iload           5
	//*  19   37:aload           7
	//*  20   39:invokevirtual   #769 <Method void getChildRect(View, boolean, Rect)>
	//*  21   42:invokestatic    #435 <Method Rect acquireTempRect()>
	//*  22   45:astore_1        
	//*  23   46:aload_2         
	//*  24   47:invokevirtual   #765 <Method ViewParent View.getParent()>
	//*  25   50:aload_0         
	//*  26   51:if_acmpeq       141
	//*  27   54:iconst_1        
	//*  28   55:istore          5
	//*  29   57:aload_0         
	//*  30   58:aload_2         
	//*  31   59:iload           5
	//*  32   61:aload_1         
	//*  33   62:invokevirtual   #769 <Method void getChildRect(View, boolean, Rect)>
	//*  34   65:aload           7
	//*  35   67:getfield        #271 <Field int Rect.left>
	//*  36   70:aload_1         
	//*  37   71:getfield        #362 <Field int Rect.right>
	//*  38   74:icmpgt          147
	//*  39   77:aload           7
	//*  40   79:getfield        #294 <Field int Rect.top>
	//*  41   82:aload_1         
	//*  42   83:getfield        #368 <Field int Rect.bottom>
	//*  43   86:icmpgt          147
	//*  44   89:aload           7
	//*  45   91:getfield        #362 <Field int Rect.right>
	//*  46   94:aload_1         
	//*  47   95:getfield        #271 <Field int Rect.left>
	//*  48   98:icmplt          147
	//*  49  101:aload           7
	//*  50  103:getfield        #368 <Field int Rect.bottom>
	//*  51  106:istore_3        
	//*  52  107:aload_1         
	//*  53  108:getfield        #294 <Field int Rect.top>
	//*  54  111:istore          4
	//*  55  113:iload_3         
	//*  56  114:iload           4
	//*  57  116:icmplt          147
	//*  58  119:iload           6
	//*  59  121:istore          5
	//*  60  123:aload           7
	//*  61  125:invokestatic    #466 <Method void releaseTempRect(Rect)>
	//*  62  128:aload_1         
	//*  63  129:invokestatic    #466 <Method void releaseTempRect(Rect)>
	//*  64  132:iload           5
	//*  65  134:ireturn         
			flag = false;
	//   66  135:iconst_0        
	//   67  136:istore          5
		getChildRect(view, flag, rect);
		view = ((View) (acquireTempRect()));
		if(view1.getParent() != this)
			flag = true;
		else
	//*  68  138:goto            33
			flag = false;
	//   69  141:iconst_0        
	//   70  142:istore          5
		getChildRect(view1, flag, ((Rect) (view)));
		if(rect.left > ((Rect) (view)).right || rect.top > ((Rect) (view)).bottom || rect.right < ((Rect) (view)).left) goto _L2; else goto _L1
_L1:
		i = rect.bottom;
		j = ((Rect) (view)).top;
		if(i < j) goto _L2; else goto _L3
_L3:
		flag = flag1;
_L5:
		releaseTempRect(rect);
		releaseTempRect(((Rect) (view)));
		return flag;
	//*  71  144:goto            57
_L2:
		flag = false;
	//   72  147:iconst_0        
	//   73  148:istore          5
		if(true) goto _L5; else goto _L4
	//   74  150:goto            123
_L4:
		view1;
	//   75  153:astore_2        
		releaseTempRect(rect);
	//   76  154:aload           7
	//   77  156:invokestatic    #466 <Method void releaseTempRect(Rect)>
		releaseTempRect(((Rect) (view)));
	//   78  159:aload_1         
	//   79  160:invokestatic    #466 <Method void releaseTempRect(Rect)>
		throw view1;
	//   80  163:aload_2         
	//   81  164:athrow          
		return false;
	//   82  165:iconst_0        
	//   83  166:ireturn         
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          7
		if(layoutparams.mBehavior != null)
	//*   4    9:aload           7
	//*   5   11:getfield        #775 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//*   6   14:ifnull          179
		{
			float f = layoutparams.mBehavior.getScrimOpacity(this, view);
	//    7   17:aload           7
	//    8   19:getfield        #775 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//    9   22:aload_0         
	//   10   23:aload_2         
	//   11   24:invokevirtual   #779 <Method float CoordinatorLayout$Behavior.getScrimOpacity(CoordinatorLayout, View)>
	//   12   27:fstore          5
			if(f > 0.0F)
	//*  13   29:fload           5
	//*  14   31:fconst_0        
	//*  15   32:fcmpl           
	//*  16   33:ifle            179
			{
				if(mScrimPaint == null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #781 <Field Paint mScrimPaint>
	//*  19   40:ifnonnull       54
					mScrimPaint = new Paint();
	//   20   43:aload_0         
	//   21   44:new             #783 <Class Paint>
	//   22   47:dup             
	//   23   48:invokespecial   #784 <Method void Paint()>
	//   24   51:putfield        #781 <Field Paint mScrimPaint>
				mScrimPaint.setColor(layoutparams.mBehavior.getScrimColor(this, view));
	//   25   54:aload_0         
	//   26   55:getfield        #781 <Field Paint mScrimPaint>
	//   27   58:aload           7
	//   28   60:getfield        #775 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:invokevirtual   #788 <Method int CoordinatorLayout$Behavior.getScrimColor(CoordinatorLayout, View)>
	//   32   68:invokevirtual   #791 <Method void Paint.setColor(int)>
				mScrimPaint.setAlpha(MathUtils.clamp(Math.round(f * 255F), 0, 255));
	//   33   71:aload_0         
	//   34   72:getfield        #781 <Field Paint mScrimPaint>
	//   35   75:fload           5
	//   36   77:ldc2            #792 <Float 255F>
	//   37   80:fmul            
	//   38   81:invokestatic    #796 <Method int Math.round(float)>
	//   39   84:iconst_0        
	//   40   85:sipush          255
	//   41   88:invokestatic    #802 <Method int MathUtils.clamp(int, int, int)>
	//   42   91:invokevirtual   #805 <Method void Paint.setAlpha(int)>
				int i = canvas.save();
	//   43   94:aload_1         
	//   44   95:invokevirtual   #810 <Method int Canvas.save()>
	//   45   98:istore          6
				if(view.isOpaque())
	//*  46  100:aload_2         
	//*  47  101:invokevirtual   #813 <Method boolean View.isOpaque()>
	//*  48  104:ifeq            135
					canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
	//   49  107:aload_1         
	//   50  108:aload_2         
	//   51  109:invokevirtual   #493 <Method int View.getLeft()>
	//   52  112:i2f             
	//   53  113:aload_2         
	//   54  114:invokevirtual   #496 <Method int View.getTop()>
	//   55  117:i2f             
	//   56  118:aload_2         
	//   57  119:invokevirtual   #499 <Method int View.getRight()>
	//   58  122:i2f             
	//   59  123:aload_2         
	//   60  124:invokevirtual   #502 <Method int View.getBottom()>
	//   61  127:i2f             
	//   62  128:getstatic       #819 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   63  131:invokevirtual   #823 <Method boolean Canvas.clipRect(float, float, float, float, android.graphics.Region$Op)>
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
	//   85  167:getfield        #781 <Field Paint mScrimPaint>
	//   86  170:invokevirtual   #827 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				canvas.restoreToCount(i);
	//   87  173:aload_1         
	//   88  174:iload           6
	//   89  176:invokevirtual   #830 <Method void Canvas.restoreToCount(int)>
			}
		}
		return super.drawChild(canvas, view, l);
	//   90  179:aload_0         
	//   91  180:aload_1         
	//   92  181:aload_2         
	//   93  182:lload_3         
	//   94  183:invokespecial   #832 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   95  186:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #835 <Method void ViewGroup.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #839 <Method int[] getDrawableState()>
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
	//*  17   28:invokevirtual   #844 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #848 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		if(flag)
	//*  25   43:iload_1         
	//*  26   44:ifeq            51
			invalidate();
	//   27   47:aload_0         
	//   28   48:invokevirtual   #851 <Method void invalidate()>
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
label0:
		do
		{
label1:
			{
				boolean flag = flag1;
	//    7   10:iload           4
	//    8   12:istore_3        
				if(i < j)
	//*   9   13:iload_1         
	//*  10   14:iload_2         
	//*  11   15:icmpge          32
				{
					if(!hasDependencies(getChildAt(i)))
						break label1;
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:iload_1         
	//   15   21:invokevirtual   #319 <Method View getChildAt(int)>
	//   16   24:invokespecial   #854 <Method boolean hasDependencies(View)>
	//   17   27:ifeq            49
					flag = true;
	//   18   30:iconst_1        
	//   19   31:istore_3        
				}
				if(flag != mNeedsPreDrawListener)
	//*  20   32:iload_3         
	//*  21   33:aload_0         
	//*  22   34:getfield        #742 <Field boolean mNeedsPreDrawListener>
	//*  23   37:icmpeq          48
				{
					if(!flag)
						break label0;
	//   24   40:iload_3         
	//   25   41:ifeq            56
					addPreDrawListener();
	//   26   44:aload_0         
	//   27   45:invokevirtual   #856 <Method void addPreDrawListener()>
				}
				return;
	//   28   48:return          
			}
			i++;
	//   29   49:iload_1         
	//   30   50:iconst_1        
	//   31   51:iadd            
	//   32   52:istore_1        
		} while(true);
	//   33   53:goto            10
		removePreDrawListener();
	//   34   56:aload_0         
	//   35   57:invokevirtual   #859 <Method void removePreDrawListener()>
	//   36   60:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-2, -2);
	//    0    0:new             #22  <Class CoordinatorLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #864 <Method void CoordinatorLayout$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #866 <Method CoordinatorLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #22  <Class CoordinatorLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #872 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #873 <Method void CoordinatorLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #22  <Class CoordinatorLayout$LayoutParams>
	//*   2    4:ifeq            19
			return new LayoutParams((LayoutParams)layoutparams);
	//    3    7:new             #22  <Class CoordinatorLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    7   15:invokespecial   #877 <Method void CoordinatorLayout$LayoutParams(CoordinatorLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #879 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   12   26:new             #22  <Class CoordinatorLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #879 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #882 <Method void CoordinatorLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new LayoutParams(layoutparams);
	//   18   38:new             #22  <Class CoordinatorLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #885 <Method void CoordinatorLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #888 <Method CoordinatorLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #891 <Method CoordinatorLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	void getChildRect(View view, boolean flag, Rect rect)
	{
		if(view.isLayoutRequested() || view.getVisibility() == 8)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #894 <Method boolean View.isLayoutRequested()>
	//*   2    4:ifne            16
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #761 <Method int View.getVisibility()>
	//*   5   11:bipush          8
	//*   6   13:icmpne          21
		{
			rect.setEmpty();
	//    7   16:aload_3         
	//    8   17:invokevirtual   #695 <Method void Rect.setEmpty()>
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
	//   15   28:invokevirtual   #472 <Method void getDescendantRect(View, Rect)>
			return;
	//   16   31:return          
		} else
		{
			rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   17   32:aload_3         
	//   18   33:aload_1         
	//   19   34:invokevirtual   #493 <Method int View.getLeft()>
	//   20   37:aload_1         
	//   21   38:invokevirtual   #496 <Method int View.getTop()>
	//   22   41:aload_1         
	//   23   42:invokevirtual   #499 <Method int View.getRight()>
	//   24   45:aload_1         
	//   25   46:invokevirtual   #502 <Method int View.getBottom()>
	//   26   49:invokevirtual   #304 <Method void Rect.set(int, int, int, int)>
			return;
	//   27   52:return          
		}
	}

	public List getDependencies(View view)
	{
		view = ((View) (mChildDag.getOutgoingEdges(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #899 <Method List DirectedAcyclicGraph.getOutgoingEdges(Object)>
	//    4    8:astore_1        
		mTempDependenciesList.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #160 <Field List mTempDependenciesList>
	//    7   13:invokeinterface #409 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			mTempDependenciesList.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #160 <Field List mTempDependenciesList>
	//   12   26:aload_1         
	//   13   27:invokeinterface #689 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return mTempDependenciesList;
	//   15   33:aload_0         
	//   16   34:getfield        #160 <Field List mTempDependenciesList>
	//   17   37:areturn         
	}

	final List getDependencySortedChildren()
	{
		prepareChildren();
	//    0    0:aload_0         
	//    1    1:invokespecial   #905 <Method void prepareChildren()>
		return Collections.unmodifiableList(mDependencySortedChildren);
	//    2    4:aload_0         
	//    3    5:getfield        #151 <Field List mDependencySortedChildren>
	//    4    8:invokestatic    #909 <Method List Collections.unmodifiableList(List)>
	//    5   11:areturn         
	}

	public List getDependents(View view)
	{
		view = ((View) (mChildDag.getIncomingEdges(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #156 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #752 <Method List DirectedAcyclicGraph.getIncomingEdges(Object)>
	//    4    8:astore_1        
		mTempDependenciesList.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #160 <Field List mTempDependenciesList>
	//    7   13:invokeinterface #409 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			mTempDependenciesList.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #160 <Field List mTempDependenciesList>
	//   12   26:aload_1         
	//   13   27:invokeinterface #689 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return mTempDependenciesList;
	//   15   33:aload_0         
	//   16   34:getfield        #160 <Field List mTempDependenciesList>
	//   17   37:areturn         
	}

	void getDescendantRect(View view, Rect rect)
	{
		ViewGroupUtils.getDescendantRect(((ViewGroup) (this)), view, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #916 <Method void ViewGroupUtils.getDescendantRect(ViewGroup, View, Rect)>
	//    4    6:return          
	}

	void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          7
		int j = view.getMeasuredWidth();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #452 <Method int View.getMeasuredWidth()>
	//    6   13:istore          5
		int k = view.getMeasuredHeight();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #455 <Method int View.getMeasuredHeight()>
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
	//   18   33:invokespecial   #918 <Method void getDesiredAnchoredChildRectWithoutConstraints(View, int, Rect, Rect, CoordinatorLayout$LayoutParams, int, int)>
		constrainChildRect(layoutparams, rect1, j, k);
	//   19   36:aload_0         
	//   20   37:aload           7
	//   21   39:aload           4
	//   22   41:iload           5
	//   23   43:iload           6
	//   24   45:invokespecial   #920 <Method void constrainChildRect(CoordinatorLayout$LayoutParams, Rect, int, int)>
	//   25   48:return          
	}

	void getLastChildRect(View view, Rect rect)
	{
		rect.set(((LayoutParams)view.getLayoutParams()).getLastChildRect());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    5:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    4    8:invokevirtual   #923 <Method Rect CoordinatorLayout$LayoutParams.getLastChildRect()>
	//    5   11:invokevirtual   #524 <Method void Rect.set(Rect)>
	//    6   14:return          
	}

	final WindowInsetsCompat getLastWindowInsets()
	{
		return mLastInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//    2    4:areturn         
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollingParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:invokevirtual   #928 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	LayoutParams getResolvedLayoutParams(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          4
		if(!layoutparams.mBehaviorResolved)
	//*   4    9:aload           4
	//*   5   11:getfield        #931 <Field boolean CoordinatorLayout$LayoutParams.mBehaviorResolved>
	//*   6   14:ifne            92
		{
			Class class1 = ((Object) (view)).getClass();
	//    7   17:aload_1         
	//    8   18:invokevirtual   #935 <Method Class Object.getClass()>
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
	//   18   33:invokevirtual   #939 <Method Annotation Class.getAnnotation(Class)>
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
	//   26   47:invokevirtual   #942 <Method Class Class.getSuperclass()>
	//   27   50:astore_2        
			} while(true);
	//   28   51:goto            24
			if(view1 != null)
	//*  29   54:aload_3         
	//*  30   55:ifnull          86
				try
				{
					layoutparams.setBehavior((Behavior)((DefaultBehavior) (view1)).value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
	//   31   58:aload           4
	//   32   60:aload_3         
	//   33   61:invokeinterface #945 <Method Class CoordinatorLayout$DefaultBehavior.value()>
	//   34   66:iconst_0        
	//   35   67:anewarray       Class[]
	//   36   70:invokevirtual   #948 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   37   73:iconst_0        
	//   38   74:anewarray       Object[]
	//   39   77:invokevirtual   #604 <Method Object Constructor.newInstance(Object[])>
	//   40   80:checkcast       #10  <Class CoordinatorLayout$Behavior>
	//   41   83:invokevirtual   #952 <Method void CoordinatorLayout$LayoutParams.setBehavior(CoordinatorLayout$Behavior)>
				}
	//*  42   86:aload           4
	//*  43   88:iconst_1        
	//*  44   89:putfield        #931 <Field boolean CoordinatorLayout$LayoutParams.mBehaviorResolved>
	//*  45   92:aload           4
	//*  46   94:areturn         
				// Misplaced declaration of an exception variable
				catch(View view)
	//*  47   95:astore_1        
				{
					Log.e("CoordinatorLayout", (new StringBuilder()).append("Default behavior class ").append(((DefaultBehavior) (view1)).value().getName()).append(" could not be instantiated. Did you forget a default constructor?").toString(), ((Throwable) (view)));
	//   48   96:ldc1            #48  <String "CoordinatorLayout">
	//   49   98:new             #374 <Class StringBuilder>
	//   50  101:dup             
	//   51  102:invokespecial   #375 <Method void StringBuilder()>
	//   52  105:ldc2            #954 <String "Default behavior class ">
	//   53  108:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   54  111:aload_3         
	//   55  112:invokeinterface #945 <Method Class CoordinatorLayout$DefaultBehavior.value()>
	//   56  117:invokevirtual   #955 <Method String Class.getName()>
	//   57  120:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   58  123:ldc2            #957 <String " could not be instantiated. Did you forget a default constructor?">
	//   59  126:invokevirtual   #381 <Method StringBuilder StringBuilder.append(String)>
	//   60  129:invokevirtual   #392 <Method String StringBuilder.toString()>
	//   61  132:aload_1         
	//   62  133:invokestatic    #960 <Method int Log.e(String, String, Throwable)>
	//   63  136:pop             
				}
			layoutparams.mBehaviorResolved = true;
		}
		return layoutparams;
	//*  64  137:goto            86
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
	//    1    1:invokespecial   #966 <Method int ViewGroup.getSuggestedMinimumHeight()>
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
	//    1    1:invokespecial   #969 <Method int ViewGroup.getSuggestedMinimumWidth()>
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
	//    0    0:invokestatic    #435 <Method Rect acquireTempRect()>
	//    1    3:astore          5
		getDescendantRect(view, rect);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload           5
	//    5    9:invokevirtual   #472 <Method void getDescendantRect(View, Rect)>
		boolean flag = rect.contains(i, j);
	//    6   12:aload           5
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #974 <Method boolean Rect.contains(int, int)>
	//   10   19:istore          4
		releaseTempRect(rect);
	//   11   21:aload           5
	//   12   23:invokestatic    #466 <Method void releaseTempRect(Rect)>
		return flag;
	//   13   26:iload           4
	//   14   28:ireturn         
		view;
	//   15   29:astore_1        
		releaseTempRect(rect);
	//   16   30:aload           5
	//   17   32:invokestatic    #466 <Method void releaseTempRect(Rect)>
		throw view;
	//   18   35:aload_1         
	//   19   36:athrow          
	}

	void offsetChildToAnchor(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          5
		if(layoutparams.mAnchorView != null)
	//*   4    9:aload           5
	//*   5   11:getfield        #978 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//*   6   14:ifnull          205
		{
			Rect rect = acquireTempRect();
	//    7   17:invokestatic    #435 <Method Rect acquireTempRect()>
	//    8   20:astore          6
			Rect rect1 = acquireTempRect();
	//    9   22:invokestatic    #435 <Method Rect acquireTempRect()>
	//   10   25:astore          7
			Rect rect2 = acquireTempRect();
	//   11   27:invokestatic    #435 <Method Rect acquireTempRect()>
	//   12   30:astore          8
			getDescendantRect(layoutparams.mAnchorView, rect);
	//   13   32:aload_0         
	//   14   33:aload           5
	//   15   35:getfield        #978 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   16   38:aload           6
	//   17   40:invokevirtual   #472 <Method void getDescendantRect(View, Rect)>
			getChildRect(view, false, rect1);
	//   18   43:aload_0         
	//   19   44:aload_1         
	//   20   45:iconst_0        
	//   21   46:aload           7
	//   22   48:invokevirtual   #769 <Method void getChildRect(View, boolean, Rect)>
			int j = view.getMeasuredWidth();
	//   23   51:aload_1         
	//   24   52:invokevirtual   #452 <Method int View.getMeasuredWidth()>
	//   25   55:istore_3        
			int k = view.getMeasuredHeight();
	//   26   56:aload_1         
	//   27   57:invokevirtual   #455 <Method int View.getMeasuredHeight()>
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
	//   37   74:invokespecial   #918 <Method void getDesiredAnchoredChildRectWithoutConstraints(View, int, Rect, Rect, CoordinatorLayout$LayoutParams, int, int)>
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
	//*  47  100:icmpeq          206
				i = 1;
	//   48  103:iconst_1        
	//   49  104:istore_2        
			else
	//*  50  105:aload_0         
	//*  51  106:aload           5
	//*  52  108:aload           8
	//*  53  110:iload_3         
	//*  54  111:iload           4
	//*  55  113:invokespecial   #920 <Method void constrainChildRect(CoordinatorLayout$LayoutParams, Rect, int, int)>
	//*  56  116:aload           8
	//*  57  118:getfield        #271 <Field int Rect.left>
	//*  58  121:aload           7
	//*  59  123:getfield        #271 <Field int Rect.left>
	//*  60  126:isub            
	//*  61  127:istore_3        
	//*  62  128:aload           8
	//*  63  130:getfield        #294 <Field int Rect.top>
	//*  64  133:aload           7
	//*  65  135:getfield        #294 <Field int Rect.top>
	//*  66  138:isub            
	//*  67  139:istore          4
	//*  68  141:iload_3         
	//*  69  142:ifeq            150
	//*  70  145:aload_1         
	//*  71  146:iload_3         
	//*  72  147:invokestatic    #711 <Method void ViewCompat.offsetLeftAndRight(View, int)>
	//*  73  150:iload           4
	//*  74  152:ifeq            161
	//*  75  155:aload_1         
	//*  76  156:iload           4
	//*  77  158:invokestatic    #714 <Method void ViewCompat.offsetTopAndBottom(View, int)>
	//*  78  161:iload_2         
	//*  79  162:ifeq            190
	//*  80  165:aload           5
	//*  81  167:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//*  82  170:astore          9
	//*  83  172:aload           9
	//*  84  174:ifnull          190
	//*  85  177:aload           9
	//*  86  179:aload_0         
	//*  87  180:aload_1         
	//*  88  181:aload           5
	//*  89  183:getfield        #978 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//*  90  186:invokevirtual   #756 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
	//*  91  189:pop             
	//*  92  190:aload           6
	//*  93  192:invokestatic    #466 <Method void releaseTempRect(Rect)>
	//*  94  195:aload           7
	//*  95  197:invokestatic    #466 <Method void releaseTempRect(Rect)>
	//*  96  200:aload           8
	//*  97  202:invokestatic    #466 <Method void releaseTempRect(Rect)>
	//*  98  205:return          
				i = 0;
	//   99  206:iconst_0        
	//  100  207:istore_2        
			constrainChildRect(layoutparams, rect2, j, k);
			j = rect2.left - rect1.left;
			k = rect2.top - rect1.top;
			if(j != 0)
				ViewCompat.offsetLeftAndRight(view, j);
			if(k != 0)
				ViewCompat.offsetTopAndBottom(view, k);
			if(i != 0)
			{
				Behavior behavior = layoutparams.getBehavior();
				if(behavior != null)
					behavior.onDependentViewChanged(this, view, layoutparams.mAnchorView);
			}
			releaseTempRect(rect);
			releaseTempRect(rect1);
			releaseTempRect(rect2);
		}
	//* 101  208:goto            105
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #981 <Method void ViewGroup.onAttachedToWindow()>
		resetTouchBehaviors();
	//    2    4:aload_0         
	//    3    5:invokespecial   #983 <Method void resetTouchBehaviors()>
		if(mNeedsPreDrawListener)
	//*   4    8:aload_0         
	//*   5    9:getfield        #742 <Field boolean mNeedsPreDrawListener>
	//*   6   12:ifeq            45
		{
			if(mOnPreDrawListener == null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*   9   19:ifnonnull       34
				mOnPreDrawListener = new OnPreDrawListener();
	//   10   22:aload_0         
	//   11   23:new             #25  <Class CoordinatorLayout$OnPreDrawListener>
	//   12   26:dup             
	//   13   27:aload_0         
	//   14   28:invokespecial   #730 <Method void CoordinatorLayout$OnPreDrawListener(CoordinatorLayout)>
	//   15   31:putfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   16   34:aload_0         
	//   17   35:invokevirtual   #734 <Method ViewTreeObserver getViewTreeObserver()>
	//   18   38:aload_0         
	//   19   39:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   20   42:invokevirtual   #740 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		if(mLastInsets == null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  21   45:aload_0         
	//*  22   46:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//*  23   49:ifnonnull       63
	//*  24   52:aload_0         
	//*  25   53:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  26   56:ifeq            63
			ViewCompat.requestApplyInsets(((View) (this)));
	//   27   59:aload_0         
	//   28   60:invokestatic    #986 <Method void ViewCompat.requestApplyInsets(View)>
		mIsAttachedToWindow = true;
	//   29   63:aload_0         
	//   30   64:iconst_1        
	//   31   65:putfield        #727 <Field boolean mIsAttachedToWindow>
	//   32   68:return          
	}

	final void onChildViewsChanged(int i)
	{
		int j;
		int i1;
		int j1;
		Rect rect;
		Rect rect1;
		Rect rect2;
		i1 = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #991 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore          4
		j1 = mDependencySortedChildren.size();
	//    3    6:aload_0         
	//    4    7:getfield        #151 <Field List mDependencySortedChildren>
	//    5   10:invokeinterface #629 <Method int List.size()>
	//    6   15:istore          5
		rect = acquireTempRect();
	//    7   17:invokestatic    #435 <Method Rect acquireTempRect()>
	//    8   20:astore          7
		rect1 = acquireTempRect();
	//    9   22:invokestatic    #435 <Method Rect acquireTempRect()>
	//   10   25:astore          8
		rect2 = acquireTempRect();
	//   11   27:invokestatic    #435 <Method Rect acquireTempRect()>
	//   12   30:astore          9
		j = 0;
	//   13   32:iconst_0        
	//   14   33:istore_2        
_L5:
		if(j >= j1) goto _L2; else goto _L1
	//   15   34:iload_2         
	//   16   35:iload           5
	//   17   37:icmpge          531
_L1:
		View view;
		Object obj;
		view = (View)mDependencySortedChildren.get(j);
	//   18   40:aload_0         
	//   19   41:getfield        #151 <Field List mDependencySortedChildren>
	//   20   44:iload_2         
	//   21   45:invokeinterface #632 <Method Object List.get(int)>
	//   22   50:checkcast       #327 <Class View>
	//   23   53:astore          10
		obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//   24   55:aload           10
	//   25   57:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   60:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   27   63:astore          11
		if(i != 0 || view.getVisibility() != 8) goto _L4; else goto _L3
	//   28   65:iload_1         
	//   29   66:ifne            86
	//   30   69:aload           10
	//   31   71:invokevirtual   #761 <Method int View.getVisibility()>
	//   32   74:bipush          8
	//   33   76:icmpne          86
_L3:
		j++;
	//   34   79:iload_2         
	//   35   80:iconst_1        
	//   36   81:iadd            
	//   37   82:istore_2        
		  goto _L5
	//*  38   83:goto            34
_L4:
		for(int k = 0; k < j; k++)
	//*  39   86:iconst_0        
	//*  40   87:istore_3        
	//*  41   88:iload_3         
	//*  42   89:iload_2         
	//*  43   90:icmpge          133
		{
			View view1 = (View)mDependencySortedChildren.get(k);
	//   44   93:aload_0         
	//   45   94:getfield        #151 <Field List mDependencySortedChildren>
	//   46   97:iload_3         
	//   47   98:invokeinterface #632 <Method Object List.get(int)>
	//   48  103:checkcast       #327 <Class View>
	//   49  106:astore          12
			if(((LayoutParams) (obj)).mAnchorDirectChild == view1)
	//*  50  108:aload           11
	//*  51  110:getfield        #994 <Field View CoordinatorLayout$LayoutParams.mAnchorDirectChild>
	//*  52  113:aload           12
	//*  53  115:if_acmpne       126
				offsetChildToAnchor(view, i1);
	//   54  118:aload_0         
	//   55  119:aload           10
	//   56  121:iload           4
	//   57  123:invokevirtual   #996 <Method void offsetChildToAnchor(View, int)>
		}

	//   58  126:iload_3         
	//   59  127:iconst_1        
	//   60  128:iadd            
	//   61  129:istore_3        
	//*  62  130:goto            88
		getChildRect(view, true, rect1);
	//   63  133:aload_0         
	//   64  134:aload           10
	//   65  136:iconst_1        
	//   66  137:aload           8
	//   67  139:invokevirtual   #769 <Method void getChildRect(View, boolean, Rect)>
		if(((LayoutParams) (obj)).insetEdge == 0 || rect1.isEmpty()) goto _L7; else goto _L6
	//   68  142:aload           11
	//   69  144:getfield        #999 <Field int CoordinatorLayout$LayoutParams.insetEdge>
	//   70  147:ifeq            232
	//   71  150:aload           8
	//   72  152:invokevirtual   #527 <Method boolean Rect.isEmpty()>
	//   73  155:ifne            232
_L6:
		int l = GravityCompat.getAbsoluteGravity(((LayoutParams) (obj)).insetEdge, i1);
	//   74  158:aload           11
	//   75  160:getfield        #999 <Field int CoordinatorLayout$LayoutParams.insetEdge>
	//   76  163:iload           4
	//   77  165:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   78  168:istore_3        
		l & 0x70;
	//   79  169:iload_3         
	//   80  170:bipush          112
	//   81  172:iand            
		JVM INSTR lookupswitch 2: default 200
	//	               48: 373
	//	               80: 394;
	//   82  173:lookupswitch    2: default 200
	//	               48: 373
	//	               80: 394
		   goto _L8 _L9 _L10
_L8:
		l & 7;
	//   83  200:iload_3         
	//   84  201:bipush          7
	//   85  203:iand            
		JVM INSTR tableswitch 3 5: default 232
	//	               3 420
	//	               4 232
	//	               5 441;
	//   86  204:tableswitch     3 5: default 232
	//	               3 420
	//	               4 232
	//	               5 441
		   goto _L7 _L11 _L7 _L12
_L7:
		if(((LayoutParams) (obj)).dodgeInsetEdges != 0 && view.getVisibility() == 0)
	//*  87  232:aload           11
	//*  88  234:getfield        #530 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//*  89  237:ifeq            258
	//*  90  240:aload           10
	//*  91  242:invokevirtual   #761 <Method int View.getVisibility()>
	//*  92  245:ifne            258
			offsetChildByInset(view, rect, i1);
	//   93  248:aload_0         
	//   94  249:aload           10
	//   95  251:aload           7
	//   96  253:iload           4
	//   97  255:invokespecial   #1001 <Method void offsetChildByInset(View, Rect, int)>
		if(i == 2) goto _L14; else goto _L13
	//   98  258:iload_1         
	//   99  259:iconst_2        
	//  100  260:icmpeq          289
_L13:
		getLastChildRect(view, rect2);
	//  101  263:aload_0         
	//  102  264:aload           10
	//  103  266:aload           9
	//  104  268:invokevirtual   #1003 <Method void getLastChildRect(View, Rect)>
		if(rect2.equals(((Object) (rect1)))) goto _L3; else goto _L15
	//  105  271:aload           9
	//  106  273:aload           8
	//  107  275:invokevirtual   #1006 <Method boolean Rect.equals(Object)>
	//  108  278:ifne            79
_L15:
		recordLastChildRect(view, rect1);
	//  109  281:aload_0         
	//  110  282:aload           10
	//  111  284:aload           8
	//  112  286:invokevirtual   #1009 <Method void recordLastChildRect(View, Rect)>
_L14:
		l = j + 1;
	//  113  289:iload_2         
	//  114  290:iconst_1        
	//  115  291:iadd            
	//  116  292:istore_3        
_L21:
		if(l >= j1) goto _L3; else goto _L16
	//  117  293:iload_3         
	//  118  294:iload           5
	//  119  296:icmpge          79
_L16:
		LayoutParams layoutparams;
		Behavior behavior;
		obj = ((Object) ((View)mDependencySortedChildren.get(l)));
	//  120  299:aload_0         
	//  121  300:getfield        #151 <Field List mDependencySortedChildren>
	//  122  303:iload_3         
	//  123  304:invokeinterface #632 <Method Object List.get(int)>
	//  124  309:checkcast       #327 <Class View>
	//  125  312:astore          11
		layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
	//  126  314:aload           11
	//  127  316:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  128  319:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//  129  322:astore          12
		behavior = layoutparams.getBehavior();
	//  130  324:aload           12
	//  131  326:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//  132  329:astore          13
		if(behavior == null || !behavior.layoutDependsOn(this, ((View) (obj)), view)) goto _L18; else goto _L17
	//  133  331:aload           13
	//  134  333:ifnull          366
	//  135  336:aload           13
	//  136  338:aload_0         
	//  137  339:aload           11
	//  138  341:aload           10
	//  139  343:invokevirtual   #1012 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
	//  140  346:ifeq            366
_L17:
		if(i != 0 || !layoutparams.getChangedAfterNestedScroll()) goto _L20; else goto _L19
	//  141  349:iload_1         
	//  142  350:ifne            467
	//  143  353:aload           12
	//  144  355:invokevirtual   #1015 <Method boolean CoordinatorLayout$LayoutParams.getChangedAfterNestedScroll()>
	//  145  358:ifeq            467
_L19:
		layoutparams.resetChangedAfterNestedScroll();
	//  146  361:aload           12
	//  147  363:invokevirtual   #1018 <Method void CoordinatorLayout$LayoutParams.resetChangedAfterNestedScroll()>
_L18:
		l++;
	//  148  366:iload_3         
	//  149  367:iconst_1        
	//  150  368:iadd            
	//  151  369:istore_3        
		  goto _L21
	//* 152  370:goto            293
_L9:
		rect.top = Math.max(rect.top, rect1.bottom);
	//  153  373:aload           7
	//  154  375:aload           7
	//  155  377:getfield        #294 <Field int Rect.top>
	//  156  380:aload           8
	//  157  382:getfield        #368 <Field int Rect.bottom>
	//  158  385:invokestatic    #285 <Method int Math.max(int, int)>
	//  159  388:putfield        #294 <Field int Rect.top>
		  goto _L8
	//* 160  391:goto            200
_L10:
		rect.bottom = Math.max(rect.bottom, getHeight() - rect1.top);
	//  161  394:aload           7
	//  162  396:aload           7
	//  163  398:getfield        #368 <Field int Rect.bottom>
	//  164  401:aload_0         
	//  165  402:invokevirtual   #262 <Method int getHeight()>
	//  166  405:aload           8
	//  167  407:getfield        #294 <Field int Rect.top>
	//  168  410:isub            
	//  169  411:invokestatic    #285 <Method int Math.max(int, int)>
	//  170  414:putfield        #368 <Field int Rect.bottom>
		  goto _L8
	//* 171  417:goto            200
_L11:
		rect.left = Math.max(rect.left, rect1.right);
	//  172  420:aload           7
	//  173  422:aload           7
	//  174  424:getfield        #271 <Field int Rect.left>
	//  175  427:aload           8
	//  176  429:getfield        #362 <Field int Rect.right>
	//  177  432:invokestatic    #285 <Method int Math.max(int, int)>
	//  178  435:putfield        #271 <Field int Rect.left>
		  goto _L7
	//* 179  438:goto            232
_L12:
		rect.right = Math.max(rect.right, getWidth() - rect1.left);
	//  180  441:aload           7
	//  181  443:aload           7
	//  182  445:getfield        #362 <Field int Rect.right>
	//  183  448:aload_0         
	//  184  449:invokevirtual   #259 <Method int getWidth()>
	//  185  452:aload           8
	//  186  454:getfield        #271 <Field int Rect.left>
	//  187  457:isub            
	//  188  458:invokestatic    #285 <Method int Math.max(int, int)>
	//  189  461:putfield        #362 <Field int Rect.right>
		  goto _L7
	//* 190  464:goto            232
_L20:
		i;
	//  191  467:iload_1         
		JVM INSTR tableswitch 2 2: default 488
	//	               2 515;
	//  192  468:tableswitch     2 2: default 488
	//	               2 515
		   goto _L22 _L23
_L22:
		boolean flag = behavior.onDependentViewChanged(this, ((View) (obj)), view);
	//  193  488:aload           13
	//  194  490:aload_0         
	//  195  491:aload           11
	//  196  493:aload           10
	//  197  495:invokevirtual   #756 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
	//  198  498:istore          6
_L24:
		if(i == 1)
	//* 199  500:iload_1         
	//* 200  501:iconst_1        
	//* 201  502:icmpne          366
			layoutparams.setChangedAfterNestedScroll(flag);
	//  202  505:aload           12
	//  203  507:iload           6
	//  204  509:invokevirtual   #1021 <Method void CoordinatorLayout$LayoutParams.setChangedAfterNestedScroll(boolean)>
		  goto _L18
	//* 205  512:goto            366
_L23:
		behavior.onDependentViewRemoved(this, ((View) (obj)), view);
	//  206  515:aload           13
	//  207  517:aload_0         
	//  208  518:aload           11
	//  209  520:aload           10
	//  210  522:invokevirtual   #1025 <Method void CoordinatorLayout$Behavior.onDependentViewRemoved(CoordinatorLayout, View, View)>
		flag = true;
	//  211  525:iconst_1        
	//  212  526:istore          6
		  goto _L24
	//* 213  528:goto            500
_L2:
		releaseTempRect(rect);
	//  214  531:aload           7
	//  215  533:invokestatic    #466 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect1);
	//  216  536:aload           8
	//  217  538:invokestatic    #466 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect2);
	//  218  541:aload           9
	//  219  543:invokestatic    #466 <Method void releaseTempRect(Rect)>
		return;
	//  220  546:return          
		  goto _L8
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1028 <Method void ViewGroup.onDetachedFromWindow()>
		resetTouchBehaviors();
	//    2    4:aload_0         
	//    3    5:invokespecial   #983 <Method void resetTouchBehaviors()>
		if(mNeedsPreDrawListener && mOnPreDrawListener != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #742 <Field boolean mNeedsPreDrawListener>
	//*   6   12:ifeq            33
	//*   7   15:aload_0         
	//*   8   16:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*   9   19:ifnull          33
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #734 <Method ViewTreeObserver getViewTreeObserver()>
	//   12   26:aload_0         
	//   13   27:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   14   30:invokevirtual   #1031 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		if(mNestedScrollingTarget != null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #1033 <Field View mNestedScrollingTarget>
	//*  17   37:ifnull          48
			onStopNestedScroll(mNestedScrollingTarget);
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getfield        #1033 <Field View mNestedScrollingTarget>
	//   21   45:invokevirtual   #1036 <Method void onStopNestedScroll(View)>
		mIsAttachedToWindow = false;
	//   22   48:aload_0         
	//   23   49:iconst_0        
	//   24   50:putfield        #727 <Field boolean mIsAttachedToWindow>
	//   25   53:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1040 <Method void ViewGroup.onDraw(Canvas)>
		if(mDrawStatusBarBackground && mStatusBarBackground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #1042 <Field boolean mDrawStatusBarBackground>
	//*   5    9:ifeq            60
	//*   6   12:aload_0         
	//*   7   13:getfield        #227 <Field Drawable mStatusBarBackground>
	//*   8   16:ifnull          60
		{
			int i;
			if(mLastInsets != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//*  11   23:ifnull          61
				i = mLastInsets.getSystemWindowInsetTop();
	//   12   26:aload_0         
	//   13   27:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//   14   30:invokevirtual   #443 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   15   33:istore_2        
			else
	//*  16   34:iload_2         
	//*  17   35:ifle            60
	//*  18   38:aload_0         
	//*  19   39:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  20   42:iconst_0        
	//*  21   43:iconst_0        
	//*  22   44:aload_0         
	//*  23   45:invokevirtual   #259 <Method int getWidth()>
	//*  24   48:iload_2         
	//*  25   49:invokevirtual   #1045 <Method void Drawable.setBounds(int, int, int, int)>
	//*  26   52:aload_0         
	//*  27   53:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  28   56:aload_1         
	//*  29   57:invokevirtual   #1048 <Method void Drawable.draw(Canvas)>
	//*  30   60:return          
				i = 0;
	//   31   61:iconst_0        
	//   32   62:istore_2        
			if(i > 0)
			{
				mStatusBarBackground.setBounds(0, 0, getWidth(), i);
				mStatusBarBackground.draw(canvas);
			}
		}
	//*  33   63:goto            34
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #624 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            13
			resetTouchBehaviors();
	//    5    9:aload_0         
	//    6   10:invokespecial   #983 <Method void resetTouchBehaviors()>
		boolean flag = performIntercept(motionevent, 0);
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:iconst_0        
	//   10   16:invokespecial   #1051 <Method boolean performIntercept(MotionEvent, int)>
	//   11   19:istore_3        
		if(false)
	//*  12   20:iconst_0        
	//*  13   21:ifeq            32
			throw new NullPointerException();
	//   14   24:new             #1053 <Class NullPointerException>
	//   15   27:dup             
	//   16   28:invokespecial   #1054 <Method void NullPointerException()>
	//   17   31:athrow          
		if(i == 1 || i == 3)
	//*  18   32:iload_2         
	//*  19   33:iconst_1        
	//*  20   34:icmpeq          42
	//*  21   37:iload_2         
	//*  22   38:iconst_3        
	//*  23   39:icmpne          46
			resetTouchBehaviors();
	//   24   42:aload_0         
	//   25   43:invokespecial   #983 <Method void resetTouchBehaviors()>
		return flag;
	//   26   46:iload_3         
	//   27   47:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #991 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_3        
		k = mDependencySortedChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #151 <Field List mDependencySortedChildren>
	//    5    9:invokeinterface #629 <Method int List.size()>
	//    6   14:istore          4
		i = 0;
	//    7   16:iconst_0        
	//    8   17:istore_2        
		while(i < k) 
	//*   9   18:iload_2         
	//*  10   19:iload           4
	//*  11   21:icmpge          96
		{
			View view = (View)mDependencySortedChildren.get(i);
	//   12   24:aload_0         
	//   13   25:getfield        #151 <Field List mDependencySortedChildren>
	//   14   28:iload_2         
	//   15   29:invokeinterface #632 <Method Object List.get(int)>
	//   16   34:checkcast       #327 <Class View>
	//   17   37:astore          6
			if(view.getVisibility() != 8)
	//*  18   39:aload           6
	//*  19   41:invokevirtual   #761 <Method int View.getVisibility()>
	//*  20   44:bipush          8
	//*  21   46:icmpne          56
	//*  22   49:iload_2         
	//*  23   50:iconst_1        
	//*  24   51:iadd            
	//*  25   52:istore_2        
	//*  26   53:goto            18
			{
				Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//   27   56:aload           6
	//   28   58:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   61:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   30   64:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   31   67:astore          7
				if(behavior == null || !behavior.onLayoutChild(this, view, j))
	//*  32   69:aload           7
	//*  33   71:ifnull          86
	//*  34   74:aload           7
	//*  35   76:aload_0         
	//*  36   77:aload           6
	//*  37   79:iload_3         
	//*  38   80:invokevirtual   #1060 <Method boolean CoordinatorLayout$Behavior.onLayoutChild(CoordinatorLayout, View, int)>
	//*  39   83:ifne            49
					onLayoutChild(view, j);
	//   40   86:aload_0         
	//   41   87:aload           6
	//   42   89:iload_3         
	//   43   90:invokevirtual   #1062 <Method void onLayoutChild(View, int)>
			}
			i++;
		}
	//*  44   93:goto            49
	//   45   96:return          
	}

	public void onLayoutChild(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.checkAnchorChanged())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #1065 <Method boolean CoordinatorLayout$LayoutParams.checkAnchorChanged()>
	//*   6   12:ifeq            26
			throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
	//    7   15:new             #1067 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc2            #1069 <String "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.">
	//   10   22:invokespecial   #1070 <Method void IllegalStateException(String)>
	//   11   25:athrow          
		if(layoutparams.mAnchorView != null)
	//*  12   26:aload_3         
	//*  13   27:getfield        #978 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//*  14   30:ifnull          44
		{
			layoutChildWithAnchor(view, layoutparams.mAnchorView, i);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:aload_3         
	//   18   36:getfield        #978 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   19   39:iload_2         
	//   20   40:invokespecial   #1072 <Method void layoutChildWithAnchor(View, View, int)>
			return;
	//   21   43:return          
		}
		if(layoutparams.keyline >= 0)
	//*  22   44:aload_3         
	//*  23   45:getfield        #1075 <Field int CoordinatorLayout$LayoutParams.keyline>
	//*  24   48:iflt            62
		{
			layoutChildWithKeyline(view, layoutparams.keyline, i);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:aload_3         
	//   28   54:getfield        #1075 <Field int CoordinatorLayout$LayoutParams.keyline>
	//   29   57:iload_2         
	//   30   58:invokespecial   #1077 <Method void layoutChildWithKeyline(View, int, int)>
			return;
	//   31   61:return          
		} else
		{
			layoutChild(view, i);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:iload_2         
	//   35   65:invokespecial   #1079 <Method void layoutChild(View, int)>
			return;
	//   36   68:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		int k;
		int l;
		int i1;
		boolean flag;
		boolean flag1;
		int k2;
		int l2;
		int i3;
		int j3;
		int k3;
		int l3;
		int i4;
		int j4;
		int k4;
		View view;
		prepareChildren();
	//    0    0:aload_0         
	//    1    1:invokespecial   #905 <Method void prepareChildren()>
		ensurePreDrawListener();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1082 <Method void ensurePreDrawListener()>
		k2 = getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #265 <Method int getPaddingLeft()>
	//    6   12:istore          12
		l2 = getPaddingTop();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #288 <Method int getPaddingTop()>
	//    9   18:istore          13
		i3 = getPaddingRight();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #274 <Method int getPaddingRight()>
	//   12   24:istore          14
		j3 = getPaddingBottom();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #297 <Method int getPaddingBottom()>
	//   15   30:istore          15
		k3 = ViewCompat.getLayoutDirection(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #991 <Method int ViewCompat.getLayoutDirection(View)>
	//   18   36:istore          16
		int j1;
		int l1;
		int l4;
		if(k3 == 1)
	//*  19   38:iload           16
	//*  20   40:iconst_1        
	//*  21   41:icmpne          178
			flag = true;
	//   22   44:iconst_1        
	//   23   45:istore          7
		else
	//*  24   47:iload_1         
	//*  25   48:invokestatic    #1087 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  26   51:istore          17
	//*  27   53:iload_1         
	//*  28   54:invokestatic    #1090 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  29   57:istore          18
	//*  30   59:iload_2         
	//*  31   60:invokestatic    #1087 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  32   63:istore          19
	//*  33   65:iload_2         
	//*  34   66:invokestatic    #1090 <Method int android.view.View$MeasureSpec.getSize(int)>
	//*  35   69:istore          20
	//*  36   71:aload_0         
	//*  37   72:invokevirtual   #1091 <Method int getSuggestedMinimumWidth()>
	//*  38   75:istore          5
	//*  39   77:aload_0         
	//*  40   78:invokevirtual   #1092 <Method int getSuggestedMinimumHeight()>
	//*  41   81:istore          4
	//*  42   83:iconst_0        
	//*  43   84:istore_3        
	//*  44   85:aload_0         
	//*  45   86:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//*  46   89:ifnull          184
	//*  47   92:aload_0         
	//*  48   93:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  49   96:ifeq            184
	//*  50   99:iconst_1        
	//*  51  100:istore          8
	//*  52  102:aload_0         
	//*  53  103:getfield        #151 <Field List mDependencySortedChildren>
	//*  54  106:invokeinterface #629 <Method int List.size()>
	//*  55  111:istore          21
	//*  56  113:iconst_0        
	//*  57  114:istore          9
	//*  58  116:iload           9
	//*  59  118:iload           21
	//*  60  120:icmpge          536
	//*  61  123:aload_0         
	//*  62  124:getfield        #151 <Field List mDependencySortedChildren>
	//*  63  127:iload           9
	//*  64  129:invokeinterface #632 <Method Object List.get(int)>
	//*  65  134:checkcast       #327 <Class View>
	//*  66  137:astore          24
	//*  67  139:aload           24
	//*  68  141:invokevirtual   #761 <Method int View.getVisibility()>
	//*  69  144:bipush          8
	//*  70  146:icmpne          190
	//*  71  149:iload_3         
	//*  72  150:istore          6
	//*  73  152:iload           5
	//*  74  154:istore_3        
	//*  75  155:iload           6
	//*  76  157:istore          5
	//*  77  159:iload           9
	//*  78  161:iconst_1        
	//*  79  162:iadd            
	//*  80  163:istore          9
	//*  81  165:iload_3         
	//*  82  166:istore          6
	//*  83  168:iload           5
	//*  84  170:istore_3        
	//*  85  171:iload           6
	//*  86  173:istore          5
	//*  87  175:goto            116
			flag = false;
	//   88  178:iconst_0        
	//   89  179:istore          7
		l3 = android.view.View.MeasureSpec.getMode(i);
		i4 = android.view.View.MeasureSpec.getSize(i);
		j4 = android.view.View.MeasureSpec.getMode(j);
		k4 = android.view.View.MeasureSpec.getSize(j);
		i1 = getSuggestedMinimumWidth();
		l = getSuggestedMinimumHeight();
		k = 0;
		if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))))
			flag1 = true;
		else
	//*  90  181:goto            47
			flag1 = false;
	//   91  184:iconst_0        
	//   92  185:istore          8
		l4 = mDependencySortedChildren.size();
		l1 = 0;
		if(l1 >= l4)
			break MISSING_BLOCK_LABEL_536;
		view = (View)mDependencySortedChildren.get(l1);
		if(view.getVisibility() != 8)
			break; /* Loop/switch isn't completed */
		j1 = k;
		k = i1;
		i1 = j1;
_L8:
		l1++;
		j1 = k;
		k = i1;
		i1 = j1;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_116;
	//*  93  187:goto            102
_L1:
		int k1;
		int i2;
		LayoutParams layoutparams;
		layoutparams = (LayoutParams)view.getLayoutParams();
	//   94  190:aload           24
	//   95  192:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   96  195:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   97  198:astore          25
		i2 = 0;
	//   98  200:iconst_0        
	//   99  201:istore          10
		k1 = i2;
	//  100  203:iload           10
	//  101  205:istore          6
		if(layoutparams.keyline < 0) goto _L4; else goto _L3
	//  102  207:aload           25
	//  103  209:getfield        #1075 <Field int CoordinatorLayout$LayoutParams.keyline>
	//  104  212:iflt            289
_L3:
		k1 = i2;
	//  105  215:iload           10
	//  106  217:istore          6
		if(l3 == 0) goto _L4; else goto _L5
	//  107  219:iload           17
	//  108  221:ifeq            289
_L5:
		int j2;
		int i5;
		j2 = getKeyline(layoutparams.keyline);
	//  109  224:aload_0         
	//  110  225:aload           25
	//  111  227:getfield        #1075 <Field int CoordinatorLayout$LayoutParams.keyline>
	//  112  230:invokespecial   #483 <Method int getKeyline(int)>
	//  113  233:istore          11
		i5 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), k3) & 7;
	//  114  235:aload           25
	//  115  237:getfield        #344 <Field int CoordinatorLayout$LayoutParams.gravity>
	//  116  240:invokestatic    #481 <Method int resolveKeylineGravity(int)>
	//  117  243:iload           16
	//  118  245:invokestatic    #353 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  119  248:bipush          7
	//  120  250:iand            
	//  121  251:istore          22
		if((i5 != 3 || flag) && (i5 != 5 || !flag)) goto _L7; else goto _L6
	//  122  253:iload           22
	//  123  255:iconst_3        
	//  124  256:icmpne          264
	//  125  259:iload           7
	//  126  261:ifeq            275
	//  127  264:iload           22
	//  128  266:iconst_5        
	//  129  267:icmpne          492
	//  130  270:iload           7
	//  131  272:ifeq            492
_L6:
		k1 = Math.max(0, i4 - i3 - j2);
	//  132  275:iconst_0        
	//  133  276:iload           18
	//  134  278:iload           14
	//  135  280:isub            
	//  136  281:iload           11
	//  137  283:isub            
	//  138  284:invokestatic    #285 <Method int Math.max(int, int)>
	//  139  287:istore          6
_L4:
		Behavior behavior;
		if(flag1 && !ViewCompat.getFitsSystemWindows(view))
	//* 140  289:iload           8
	//* 141  291:ifeq            562
	//* 142  294:aload           24
	//* 143  296:invokestatic    #325 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 144  299:ifne            562
		{
			i2 = mLastInsets.getSystemWindowInsetLeft();
	//  145  302:aload_0         
	//  146  303:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//  147  306:invokevirtual   #440 <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//  148  309:istore          10
			int j5 = mLastInsets.getSystemWindowInsetRight();
	//  149  311:aload_0         
	//  150  312:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//  151  315:invokevirtual   #446 <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//  152  318:istore          23
			j2 = mLastInsets.getSystemWindowInsetTop();
	//  153  320:aload_0         
	//  154  321:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//  155  324:invokevirtual   #443 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//  156  327:istore          11
			i5 = mLastInsets.getSystemWindowInsetBottom();
	//  157  329:aload_0         
	//  158  330:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//  159  333:invokevirtual   #449 <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//  160  336:istore          22
			i2 = android.view.View.MeasureSpec.makeMeasureSpec(i4 - (i2 + j5), l3);
	//  161  338:iload           18
	//  162  340:iload           10
	//  163  342:iload           23
	//  164  344:iadd            
	//  165  345:isub            
	//  166  346:iload           17
	//  167  348:invokestatic    #1095 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  168  351:istore          10
			j2 = android.view.View.MeasureSpec.makeMeasureSpec(k4 - (j2 + i5), j4);
	//  169  353:iload           20
	//  170  355:iload           11
	//  171  357:iload           22
	//  172  359:iadd            
	//  173  360:isub            
	//  174  361:iload           19
	//  175  363:invokestatic    #1095 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  176  366:istore          11
		} else
	//* 177  368:aload           25
	//* 178  370:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//* 179  373:astore          26
	//* 180  375:aload           26
	//* 181  377:ifnull          398
	//* 182  380:aload           26
	//* 183  382:aload_0         
	//* 184  383:aload           24
	//* 185  385:iload           10
	//* 186  387:iload           6
	//* 187  389:iload           11
	//* 188  391:iconst_0        
	//* 189  392:invokevirtual   #1099 <Method boolean CoordinatorLayout$Behavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
	//* 190  395:ifne            411
	//* 191  398:aload_0         
	//* 192  399:aload           24
	//* 193  401:iload           10
	//* 194  403:iload           6
	//* 195  405:iload           11
	//* 196  407:iconst_0        
	//* 197  408:invokevirtual   #1102 <Method void onMeasureChild(View, int, int, int, int)>
	//* 198  411:iload           5
	//* 199  413:aload           24
	//* 200  415:invokevirtual   #452 <Method int View.getMeasuredWidth()>
	//* 201  418:iload           12
	//* 202  420:iload           14
	//* 203  422:iadd            
	//* 204  423:iadd            
	//* 205  424:aload           25
	//* 206  426:getfield        #268 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//* 207  429:iadd            
	//* 208  430:aload           25
	//* 209  432:getfield        #277 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//* 210  435:iadd            
	//* 211  436:invokestatic    #285 <Method int Math.max(int, int)>
	//* 212  439:istore          5
	//* 213  441:iload           4
	//* 214  443:aload           24
	//* 215  445:invokevirtual   #455 <Method int View.getMeasuredHeight()>
	//* 216  448:iload           13
	//* 217  450:iload           15
	//* 218  452:iadd            
	//* 219  453:iadd            
	//* 220  454:aload           25
	//* 221  456:getfield        #291 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//* 222  459:iadd            
	//* 223  460:aload           25
	//* 224  462:getfield        #300 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//* 225  465:iadd            
	//* 226  466:invokestatic    #285 <Method int Math.max(int, int)>
	//* 227  469:istore          4
	//* 228  471:iload_3         
	//* 229  472:aload           24
	//* 230  474:invokevirtual   #1105 <Method int View.getMeasuredState()>
	//* 231  477:invokestatic    #1108 <Method int View.combineMeasuredStates(int, int)>
	//* 232  480:istore          6
	//* 233  482:iload           5
	//* 234  484:istore_3        
	//* 235  485:iload           6
	//* 236  487:istore          5
	//* 237  489:goto            159
	//* 238  492:iload           22
	//* 239  494:iconst_5        
	//* 240  495:icmpne          503
	//* 241  498:iload           7
	//* 242  500:ifeq            522
	//* 243  503:iload           10
	//* 244  505:istore          6
	//* 245  507:iload           22
	//* 246  509:iconst_3        
	//* 247  510:icmpne          289
	//* 248  513:iload           10
	//* 249  515:istore          6
	//* 250  517:iload           7
	//* 251  519:ifeq            289
	//* 252  522:iconst_0        
	//* 253  523:iload           11
	//* 254  525:iload           12
	//* 255  527:isub            
	//* 256  528:invokestatic    #285 <Method int Math.max(int, int)>
	//* 257  531:istore          6
	//* 258  533:goto            289
	//* 259  536:aload_0         
	//* 260  537:iload           5
	//* 261  539:iload_1         
	//* 262  540:ldc2            #1109 <Int 0xff000000>
	//* 263  543:iload_3         
	//* 264  544:iand            
	//* 265  545:invokestatic    #1112 <Method int View.resolveSizeAndState(int, int, int)>
	//* 266  548:iload           4
	//* 267  550:iload_2         
	//* 268  551:iload_3         
	//* 269  552:bipush          16
	//* 270  554:ishl            
	//* 271  555:invokestatic    #1112 <Method int View.resolveSizeAndState(int, int, int)>
	//* 272  558:invokevirtual   #1115 <Method void setMeasuredDimension(int, int)>
	//* 273  561:return          
		{
			j2 = j;
	//  274  562:iload_2         
	//  275  563:istore          11
			i2 = i;
	//  276  565:iload_1         
	//  277  566:istore          10
		}
		behavior = layoutparams.getBehavior();
		if(behavior == null || !behavior.onMeasureChild(this, view, i2, k1, j2, 0))
			onMeasureChild(view, i2, k1, j2, 0);
		i1 = Math.max(i1, view.getMeasuredWidth() + (k2 + i3) + layoutparams.leftMargin + layoutparams.rightMargin);
		l = Math.max(l, view.getMeasuredHeight() + (l2 + j3) + layoutparams.topMargin + layoutparams.bottomMargin);
		k1 = View.combineMeasuredStates(k, view.getMeasuredState());
		k = i1;
		i1 = k1;
		if(true) goto _L8; else goto _L7
	//  278  568:goto            368
_L7:
		if(i5 == 5 && !flag) goto _L10; else goto _L9
_L9:
		k1 = i2;
		if(i5 != 3) goto _L4; else goto _L11
_L11:
		k1 = i2;
		if(!flag) goto _L4; else goto _L10
_L10:
		k1 = Math.max(0, j2 - k2);
		  goto _L4
		setMeasuredDimension(View.resolveSizeAndState(i1, i, 0xff000000 & k), View.resolveSizeAndState(l, j, k << 16));
		return;
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
	//    6    8:invokevirtual   #1118 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   11:return          
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #315 <Method int getChildCount()>
	//    2    4:istore          6
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		boolean flag1 = false;
	//    5    9:iconst_0        
	//    6   10:istore          7
		while(i < j) 
	//*   7   12:iload           5
	//*   8   14:iload           6
	//*   9   16:icmpge          101
		{
			View view1 = getChildAt(i);
	//   10   19:aload_0         
	//   11   20:iload           5
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          8
			if(view1.getVisibility() != 8)
	//*  14   27:aload           8
	//*  15   29:invokevirtual   #761 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          46
	//*  18   37:iload           5
	//*  19   39:iconst_1        
	//*  20   40:iadd            
	//*  21   41:istore          5
	//*  22   43:goto            12
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   23   46:aload           8
	//   24   48:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   51:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   26   54:astore          9
				if(((LayoutParams) (obj)).isNestedScrollAccepted(0))
	//*  27   56:aload           9
	//*  28   58:iconst_0        
	//*  29   59:invokevirtual   #1124 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  30   62:ifne            68
	//*  31   65:goto            37
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   32   68:aload           9
	//   33   70:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   34   73:astore          9
					if(obj != null)
	//*  35   75:aload           9
	//*  36   77:ifnull          114
						flag1 = ((Behavior) (obj)).onNestedFling(this, view1, view, f, f1, flag) | flag1;
	//   37   80:aload           9
	//   38   82:aload_0         
	//   39   83:aload           8
	//   40   85:aload_1         
	//   41   86:fload_2         
	//   42   87:fload_3         
	//   43   88:iload           4
	//   44   90:invokevirtual   #1127 <Method boolean CoordinatorLayout$Behavior.onNestedFling(CoordinatorLayout, View, View, float, float, boolean)>
	//   45   93:iload           7
	//   46   95:ior             
	//   47   96:istore          7
				}
			}
			i++;
		}
	//*  48   98:goto            37
		if(flag1)
	//*  49  101:iload           7
	//*  50  103:ifeq            111
			onChildViewsChanged(1);
	//   51  106:aload_0         
	//   52  107:iconst_1        
	//   53  108:invokevirtual   #1129 <Method void onChildViewsChanged(int)>
		return flag1;
	//   54  111:iload           7
	//   55  113:ireturn         
	//*  56  114:goto            37
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #315 <Method int getChildCount()>
	//    2    4:istore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		boolean flag = false;
	//    5    9:iconst_0        
	//    6   10:istore          6
		while(i < j) 
	//*   7   12:iload           4
	//*   8   14:iload           5
	//*   9   16:icmpge          99
		{
			View view1 = getChildAt(i);
	//   10   19:aload_0         
	//   11   20:iload           4
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          7
			if(view1.getVisibility() != 8)
	//*  14   27:aload           7
	//*  15   29:invokevirtual   #761 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          46
	//*  18   37:iload           4
	//*  19   39:iconst_1        
	//*  20   40:iadd            
	//*  21   41:istore          4
	//*  22   43:goto            12
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   23   46:aload           7
	//   24   48:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   51:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   26   54:astore          8
				if(((LayoutParams) (obj)).isNestedScrollAccepted(0))
	//*  27   56:aload           8
	//*  28   58:iconst_0        
	//*  29   59:invokevirtual   #1124 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  30   62:ifne            68
	//*  31   65:goto            37
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   32   68:aload           8
	//   33   70:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   34   73:astore          8
					if(obj != null)
	//*  35   75:aload           8
	//*  36   77:ifnull          102
						flag = ((Behavior) (obj)).onNestedPreFling(this, view1, view, f, f1) | flag;
	//   37   80:aload           8
	//   38   82:aload_0         
	//   39   83:aload           7
	//   40   85:aload_1         
	//   41   86:fload_2         
	//   42   87:fload_3         
	//   43   88:invokevirtual   #1134 <Method boolean CoordinatorLayout$Behavior.onNestedPreFling(CoordinatorLayout, View, View, float, float)>
	//   44   91:iload           6
	//   45   93:ior             
	//   46   94:istore          6
				}
			}
			i++;
		}
	//*  47   96:goto            37
		return flag;
	//   48   99:iload           6
	//   49  101:ireturn         
	//*  50  102:goto            37
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[])
	{
		onNestedPreScroll(view, i, j, ai, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aload           4
	//    5    6:iconst_0        
	//    6    7:invokevirtual   #1139 <Method void onNestedPreScroll(View, int, int, int[], int)>
	//    7   10:return          
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[], int k)
	{
		int i1 = 0;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int l = 0;
	//    2    3:iconst_0        
	//    3    4:istore          6
		int j1 = 0;
	//    4    6:iconst_0        
	//    5    7:istore          8
		int l2 = getChildCount();
	//    6    9:aload_0         
	//    7   10:invokevirtual   #315 <Method int getChildCount()>
	//    8   13:istore          11
		int k1 = 0;
	//    9   15:iconst_0        
	//   10   16:istore          9
		while(k1 < l2) 
	//*  11   18:iload           9
	//*  12   20:iload           11
	//*  13   22:icmpge          250
		{
			View view1 = getChildAt(k1);
	//   14   25:aload_0         
	//   15   26:iload           9
	//   16   28:invokevirtual   #319 <Method View getChildAt(int)>
	//   17   31:astore          12
			int i2;
			if(view1.getVisibility() == 8)
	//*  18   33:aload           12
	//*  19   35:invokevirtual   #761 <Method int View.getVisibility()>
	//*  20   38:bipush          8
	//*  21   40:icmpne          88
			{
				int l1 = j1;
	//   22   43:iload           8
	//   23   45:istore          10
				j1 = i1;
	//   24   47:iload           7
	//   25   49:istore          8
				i1 = l;
	//   26   51:iload           6
	//   27   53:istore          7
				l = l1;
	//   28   55:iload           10
	//   29   57:istore          6
			} else
	//*  30   59:iload           9
	//*  31   61:iconst_1        
	//*  32   62:iadd            
	//*  33   63:istore          10
	//*  34   65:iload           8
	//*  35   67:istore          9
	//*  36   69:iload           6
	//*  37   71:istore          8
	//*  38   73:iload           7
	//*  39   75:istore          6
	//*  40   77:iload           9
	//*  41   79:istore          7
	//*  42   81:iload           10
	//*  43   83:istore          9
	//*  44   85:goto            18
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   45   88:aload           12
	//   46   90:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   47   93:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   48   96:astore          13
				if(!((LayoutParams) (obj)).isNestedScrollAccepted(k))
	//*  49   98:aload           13
	//*  50  100:iload           5
	//*  51  102:invokevirtual   #1124 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  52  105:ifne            127
				{
					int j2 = j1;
	//   53  108:iload           8
	//   54  110:istore          10
					j1 = i1;
	//   55  112:iload           7
	//   56  114:istore          8
					i1 = l;
	//   57  116:iload           6
	//   58  118:istore          7
					l = j2;
	//   59  120:iload           10
	//   60  122:istore          6
				} else
	//*  61  124:goto            59
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   62  127:aload           13
	//   63  129:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   64  132:astore          13
					if(obj != null)
	//*  65  134:aload           13
	//*  66  136:ifnull          273
					{
						int ai1[] = mTempIntPair;
	//   67  139:aload_0         
	//   68  140:getfield        #162 <Field int[] mTempIntPair>
	//   69  143:astore          14
						mTempIntPair[1] = 0;
	//   70  145:aload_0         
	//   71  146:getfield        #162 <Field int[] mTempIntPair>
	//   72  149:iconst_1        
	//   73  150:iconst_0        
	//   74  151:iastore         
						ai1[0] = 0;
	//   75  152:aload           14
	//   76  154:iconst_0        
	//   77  155:iconst_0        
	//   78  156:iastore         
						((Behavior) (obj)).onNestedPreScroll(this, view1, view, i, j, mTempIntPair, k);
	//   79  157:aload           13
	//   80  159:aload_0         
	//   81  160:aload           12
	//   82  162:aload_1         
	//   83  163:iload_2         
	//   84  164:iload_3         
	//   85  165:aload_0         
	//   86  166:getfield        #162 <Field int[] mTempIntPair>
	//   87  169:iload           5
	//   88  171:invokevirtual   #1142 <Method void CoordinatorLayout$Behavior.onNestedPreScroll(CoordinatorLayout, View, View, int, int, int[], int)>
						if(i > 0)
	//*  89  174:iload_2         
	//*  90  175:ifle            218
							j1 = Math.max(i1, mTempIntPair[0]);
	//   91  178:iload           7
	//   92  180:aload_0         
	//   93  181:getfield        #162 <Field int[] mTempIntPair>
	//   94  184:iconst_0        
	//   95  185:iaload          
	//   96  186:invokestatic    #285 <Method int Math.max(int, int)>
	//   97  189:istore          8
						else
	//*  98  191:iload_3         
	//*  99  192:ifle            234
	//* 100  195:iload           6
	//* 101  197:aload_0         
	//* 102  198:getfield        #162 <Field int[] mTempIntPair>
	//* 103  201:iconst_1        
	//* 104  202:iaload          
	//* 105  203:invokestatic    #285 <Method int Math.max(int, int)>
	//* 106  206:istore          6
	//* 107  208:iload           6
	//* 108  210:istore          7
	//* 109  212:iconst_1        
	//* 110  213:istore          6
	//* 111  215:goto            59
							j1 = Math.min(i1, mTempIntPair[0]);
	//  112  218:iload           7
	//  113  220:aload_0         
	//  114  221:getfield        #162 <Field int[] mTempIntPair>
	//  115  224:iconst_0        
	//  116  225:iaload          
	//  117  226:invokestatic    #282 <Method int Math.min(int, int)>
	//  118  229:istore          8
						if(j > 0)
							l = Math.max(l, mTempIntPair[1]);
						else
	//* 119  231:goto            191
							l = Math.min(l, mTempIntPair[1]);
	//  120  234:iload           6
	//  121  236:aload_0         
	//  122  237:getfield        #162 <Field int[] mTempIntPair>
	//  123  240:iconst_1        
	//  124  241:iaload          
	//  125  242:invokestatic    #282 <Method int Math.min(int, int)>
	//  126  245:istore          6
						i1 = l;
						l = 1;
					} else
	//* 127  247:goto            208
	//* 128  250:aload           4
	//* 129  252:iconst_0        
	//* 130  253:iload           7
	//* 131  255:iastore         
	//* 132  256:aload           4
	//* 133  258:iconst_1        
	//* 134  259:iload           6
	//* 135  261:iastore         
	//* 136  262:iload           8
	//* 137  264:ifeq            272
	//* 138  267:aload_0         
	//* 139  268:iconst_1        
	//* 140  269:invokevirtual   #1129 <Method void onChildViewsChanged(int)>
	//* 141  272:return          
					{
						int k2 = j1;
	//  142  273:iload           8
	//  143  275:istore          10
						j1 = i1;
	//  144  277:iload           7
	//  145  279:istore          8
						i1 = l;
	//  146  281:iload           6
	//  147  283:istore          7
						l = k2;
	//  148  285:iload           10
	//  149  287:istore          6
					}
				}
			}
			i2 = k1 + 1;
			k1 = j1;
			j1 = l;
			l = i1;
			i1 = k1;
			k1 = i2;
		}
		ai[0] = i1;
		ai[1] = l;
		if(j1 != 0)
			onChildViewsChanged(1);
	//* 150  289:goto            59
	}

	public void onNestedScroll(View view, int i, int j, int k, int l)
	{
		onNestedScroll(view, i, j, k, l, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #1146 <Method void onNestedScroll(View, int, int, int, int, int)>
	//    8   12:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l, int i1)
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #315 <Method int getChildCount()>
	//    2    4:istore          9
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          7
		int j1 = 0;
	//    5    9:iconst_0        
	//    6   10:istore          8
		while(j1 < k1) 
	//*   7   12:iload           8
	//*   8   14:iload           9
	//*   9   16:icmpge          104
		{
			View view1 = getChildAt(j1);
	//   10   19:aload_0         
	//   11   20:iload           8
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          10
			if(view1.getVisibility() != 8)
	//*  14   27:aload           10
	//*  15   29:invokevirtual   #761 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          46
	//*  18   37:iload           8
	//*  19   39:iconst_1        
	//*  20   40:iadd            
	//*  21   41:istore          8
	//*  22   43:goto            12
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   23   46:aload           10
	//   24   48:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   51:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   26   54:astore          11
				if(((LayoutParams) (obj)).isNestedScrollAccepted(i1))
	//*  27   56:aload           11
	//*  28   58:iload           6
	//*  29   60:invokevirtual   #1124 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  30   63:ifne            69
	//*  31   66:goto            37
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   32   69:aload           11
	//   33   71:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   34   74:astore          11
					if(obj != null)
	//*  35   76:aload           11
	//*  36   78:ifnull          115
					{
						((Behavior) (obj)).onNestedScroll(this, view1, view, i, j, k, l, i1);
	//   37   81:aload           11
	//   38   83:aload_0         
	//   39   84:aload           10
	//   40   86:aload_1         
	//   41   87:iload_2         
	//   42   88:iload_3         
	//   43   89:iload           4
	//   44   91:iload           5
	//   45   93:iload           6
	//   46   95:invokevirtual   #1149 <Method void CoordinatorLayout$Behavior.onNestedScroll(CoordinatorLayout, View, View, int, int, int, int, int)>
						flag = true;
	//   47   98:iconst_1        
	//   48   99:istore          7
					}
				}
			}
			j1++;
		}
	//*  49  101:goto            37
		if(flag)
	//*  50  104:iload           7
	//*  51  106:ifeq            114
			onChildViewsChanged(1);
	//   52  109:aload_0         
	//   53  110:iconst_1        
	//   54  111:invokevirtual   #1129 <Method void onChildViewsChanged(int)>
	//   55  114:return          
	//*  56  115:goto            37
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		onNestedScrollAccepted(view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1153 <Method void onNestedScrollAccepted(View, View, int, int)>
	//    6    8:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i, int j)
	{
		mNestedScrollingParentHelper.onNestedScrollAccepted(view, view1, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #1154 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int, int)>
		mNestedScrollingTarget = view1;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #1033 <Field View mNestedScrollingTarget>
		int l = getChildCount();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #315 <Method int getChildCount()>
	//   12   21:istore          6
		int k = 0;
	//   13   23:iconst_0        
	//   14   24:istore          5
		while(k < l) 
	//*  15   26:iload           5
	//*  16   28:iload           6
	//*  17   30:icmpge          98
		{
			View view2 = getChildAt(k);
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:invokevirtual   #319 <Method View getChildAt(int)>
	//   21   39:astore          7
			Object obj = ((Object) ((LayoutParams)view2.getLayoutParams()));
	//   22   41:aload           7
	//   23   43:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   46:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   25   49:astore          8
			if(((LayoutParams) (obj)).isNestedScrollAccepted(j))
	//*  26   51:aload           8
	//*  27   53:iload           4
	//*  28   55:invokevirtual   #1124 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  29   58:ifne            70
	//*  30   61:iload           5
	//*  31   63:iconst_1        
	//*  32   64:iadd            
	//*  33   65:istore          5
	//*  34   67:goto            26
			{
				obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   35   70:aload           8
	//   36   72:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   37   75:astore          8
				if(obj != null)
	//*  38   77:aload           8
	//*  39   79:ifnull          61
					((Behavior) (obj)).onNestedScrollAccepted(this, view2, view, view1, i, j);
	//   40   82:aload           8
	//   41   84:aload_0         
	//   42   85:aload           7
	//   43   87:aload_1         
	//   44   88:aload_2         
	//   45   89:iload_3         
	//   46   90:iload           4
	//   47   92:invokevirtual   #1157 <Method void CoordinatorLayout$Behavior.onNestedScrollAccepted(CoordinatorLayout, View, View, View, int, int)>
			}
			k++;
		}
	//*  48   95:goto            61
	//   49   98:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #28  <Class CoordinatorLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1161 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		} else
	//*   6   12:return          
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #28  <Class CoordinatorLayout$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1165 <Method Parcelable CoordinatorLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #1161 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			parcelable = ((Parcelable) (((SavedState) (parcelable)).behaviorStates));
	//   14   26:aload_1         
	//   15   27:getfield        #1169 <Field SparseArray CoordinatorLayout$SavedState.behaviorStates>
	//   16   30:astore_1        
			int j = getChildCount();
	//   17   31:aload_0         
	//   18   32:invokevirtual   #315 <Method int getChildCount()>
	//   19   35:istore_3        
			int i = 0;
	//   20   36:iconst_0        
	//   21   37:istore_2        
			while(i < j) 
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          12
			{
				View view = getChildAt(i);
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:invokevirtual   #319 <Method View getChildAt(int)>
	//   28   48:astore          5
				int k = view.getId();
	//   29   50:aload           5
	//   30   52:invokevirtual   #1172 <Method int View.getId()>
	//   31   55:istore          4
				Behavior behavior = getResolvedLayoutParams(view).getBehavior();
	//   32   57:aload_0         
	//   33   58:aload           5
	//   34   60:invokevirtual   #664 <Method CoordinatorLayout$LayoutParams getResolvedLayoutParams(View)>
	//   35   63:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   36   66:astore          6
				if(k != -1 && behavior != null)
	//*  37   68:iload           4
	//*  38   70:iconst_m1       
	//*  39   71:icmpeq          105
	//*  40   74:aload           6
	//*  41   76:ifnull          105
				{
					Parcelable parcelable1 = (Parcelable)((SparseArray) (parcelable)).get(k);
	//   42   79:aload_1         
	//   43   80:iload           4
	//   44   82:invokevirtual   #1175 <Method Object SparseArray.get(int)>
	//   45   85:checkcast       #1177 <Class Parcelable>
	//   46   88:astore          7
					if(parcelable1 != null)
	//*  47   90:aload           7
	//*  48   92:ifnull          105
						behavior.onRestoreInstanceState(this, view, parcelable1);
	//   49   95:aload           6
	//   50   97:aload_0         
	//   51   98:aload           5
	//   52  100:aload           7
	//   53  102:invokevirtual   #1180 <Method void CoordinatorLayout$Behavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
				}
				i++;
	//   54  105:iload_2         
	//   55  106:iconst_1        
	//   56  107:iadd            
	//   57  108:istore_2        
			}
		}
	//*  58  109:goto            38
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #28  <Class CoordinatorLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1183 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1185 <Method void CoordinatorLayout$SavedState(Parcelable)>
	//    5   11:astore          4
		SparseArray sparsearray = new SparseArray();
	//    6   13:new             #1174 <Class SparseArray>
	//    7   16:dup             
	//    8   17:invokespecial   #1186 <Method void SparseArray()>
	//    9   20:astore          5
		int j = getChildCount();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #315 <Method int getChildCount()>
	//   12   26:istore_2        
		for(int i = 0; i < j; i++)
	//*  13   27:iconst_0        
	//*  14   28:istore_1        
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
	//   23   43:invokevirtual   #1172 <Method int View.getId()>
	//   24   46:istore_3        
			Behavior behavior = ((LayoutParams)((View) (obj)).getLayoutParams()).getBehavior();
	//   25   47:aload           6
	//   26   49:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   52:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
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
	//   38   75:invokevirtual   #1189 <Method Parcelable CoordinatorLayout$Behavior.onSaveInstanceState(CoordinatorLayout, View)>
	//   39   78:astore          6
			if(obj != null)
	//*  40   80:aload           6
	//*  41   82:ifnull          93
				sparsearray.append(k, obj);
	//   42   85:aload           5
	//   43   87:iload_3         
	//   44   88:aload           6
	//   45   90:invokevirtual   #1192 <Method void SparseArray.append(int, Object)>
		}

	//   46   93:iload_1         
	//   47   94:iconst_1        
	//   48   95:iadd            
	//   49   96:istore_1        
	//*  50   97:goto            29
		savedstate.behaviorStates = sparsearray;
	//   51  100:aload           4
	//   52  102:aload           5
	//   53  104:putfield        #1169 <Field SparseArray CoordinatorLayout$SavedState.behaviorStates>
		return ((Parcelable) (savedstate));
	//   54  107:aload           4
	//   55  109:areturn         
	}

	public boolean onStartNestedScroll(View view, View view1, int i)
	{
		return onStartNestedScroll(view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1197 <Method boolean onStartNestedScroll(View, View, int, int)>
	//    6    8:ireturn         
	}

	public boolean onStartNestedScroll(View view, View view1, int i, int j)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          7
		int l = getChildCount();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #315 <Method int getChildCount()>
	//    4    7:istore          6
		int k = 0;
	//    5    9:iconst_0        
	//    6   10:istore          5
		while(k < l) 
	//*   7   12:iload           5
	//*   8   14:iload           6
	//*   9   16:icmpge          113
		{
			View view2 = getChildAt(k);
	//   10   19:aload_0         
	//   11   20:iload           5
	//   12   22:invokevirtual   #319 <Method View getChildAt(int)>
	//   13   25:astore          9
			if(view2.getVisibility() != 8)
	//*  14   27:aload           9
	//*  15   29:invokevirtual   #761 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          46
	//*  18   37:iload           5
	//*  19   39:iconst_1        
	//*  20   40:iadd            
	//*  21   41:istore          5
	//*  22   43:goto            12
			{
				LayoutParams layoutparams = (LayoutParams)view2.getLayoutParams();
	//   23   46:aload           9
	//   24   48:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   51:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   26   54:astore          10
				Behavior behavior = layoutparams.getBehavior();
	//   27   56:aload           10
	//   28   58:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   29   61:astore          11
				if(behavior != null)
	//*  30   63:aload           11
	//*  31   65:ifnull          102
				{
					boolean flag1 = behavior.onStartNestedScroll(this, view2, view, view1, i, j);
	//   32   68:aload           11
	//   33   70:aload_0         
	//   34   71:aload           9
	//   35   73:aload_1         
	//   36   74:aload_2         
	//   37   75:iload_3         
	//   38   76:iload           4
	//   39   78:invokevirtual   #1200 <Method boolean CoordinatorLayout$Behavior.onStartNestedScroll(CoordinatorLayout, View, View, View, int, int)>
	//   40   81:istore          8
					flag |= flag1;
	//   41   83:iload           7
	//   42   85:iload           8
	//   43   87:ior             
	//   44   88:istore          7
					layoutparams.setNestedScrollAccepted(j, flag1);
	//   45   90:aload           10
	//   46   92:iload           4
	//   47   94:iload           8
	//   48   96:invokevirtual   #1204 <Method void CoordinatorLayout$LayoutParams.setNestedScrollAccepted(int, boolean)>
				} else
	//*  49   99:goto            37
				{
					layoutparams.setNestedScrollAccepted(j, false);
	//   50  102:aload           10
	//   51  104:iload           4
	//   52  106:iconst_0        
	//   53  107:invokevirtual   #1204 <Method void CoordinatorLayout$LayoutParams.setNestedScrollAccepted(int, boolean)>
				}
			}
			k++;
		}
	//*  54  110:goto            37
		return flag;
	//   55  113:iload           7
	//   56  115:ireturn         
	}

	public void onStopNestedScroll(View view)
	{
		onStopNestedScroll(view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #1206 <Method void onStopNestedScroll(View, int)>
	//    4    6:return          
	}

	public void onStopNestedScroll(View view, int i)
	{
		mNestedScrollingParentHelper.onStopNestedScroll(view, i);
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1207 <Method void NestedScrollingParentHelper.onStopNestedScroll(View, int)>
		int k = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #315 <Method int getChildCount()>
	//    7   13:istore          4
		int j = 0;
	//    8   15:iconst_0        
	//    9   16:istore_3        
		while(j < k) 
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:icmpge          92
		{
			View view1 = getChildAt(j);
	//   13   23:aload_0         
	//   14   24:iload_3         
	//   15   25:invokevirtual   #319 <Method View getChildAt(int)>
	//   16   28:astore          5
			LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   17   30:aload           5
	//   18   32:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   20   38:astore          6
			if(layoutparams.isNestedScrollAccepted(i))
	//*  21   40:aload           6
	//*  22   42:iload_2         
	//*  23   43:invokevirtual   #1124 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  24   46:ifne            56
	//*  25   49:iload_3         
	//*  26   50:iconst_1        
	//*  27   51:iadd            
	//*  28   52:istore_3        
	//*  29   53:goto            17
			{
				Behavior behavior = layoutparams.getBehavior();
	//   30   56:aload           6
	//   31   58:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   32   61:astore          7
				if(behavior != null)
	//*  33   63:aload           7
	//*  34   65:ifnull          78
					behavior.onStopNestedScroll(this, view1, view, i);
	//   35   68:aload           7
	//   36   70:aload_0         
	//   37   71:aload           5
	//   38   73:aload_1         
	//   39   74:iload_2         
	//   40   75:invokevirtual   #1210 <Method void CoordinatorLayout$Behavior.onStopNestedScroll(CoordinatorLayout, View, View, int)>
				layoutparams.resetNestedScroll(i);
	//   41   78:aload           6
	//   42   80:iload_2         
	//   43   81:invokevirtual   #1213 <Method void CoordinatorLayout$LayoutParams.resetNestedScroll(int)>
				layoutparams.resetChangedAfterNestedScroll();
	//   44   84:aload           6
	//   45   86:invokevirtual   #1018 <Method void CoordinatorLayout$LayoutParams.resetChangedAfterNestedScroll()>
			}
			j++;
		}
	//*  46   89:goto            49
		mNestedScrollingTarget = null;
	//   47   92:aload_0         
	//   48   93:aconst_null     
	//   49   94:putfield        #1033 <Field View mNestedScrollingTarget>
	//   50   97:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i;
		Object obj;
		obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		i = motionevent.getActionMasked();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #624 <Method int MotionEvent.getActionMasked()>
	//    4    7:istore_2        
		if(mBehaviorTouchView != null) goto _L2; else goto _L1
	//    5    8:aload_0         
	//    6    9:getfield        #651 <Field View mBehaviorTouchView>
	//    7   12:ifnonnull       172
_L1:
		boolean flag1 = performIntercept(motionevent, 1);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:iconst_1        
	//   11   18:invokespecial   #1051 <Method boolean performIntercept(MotionEvent, int)>
	//   12   21:istore          4
		if(!flag1) goto _L4; else goto _L3
	//   13   23:iload           4
	//   14   25:ifeq            167
_L3:
		boolean flag;
		Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
	//   15   28:aload_0         
	//   16   29:getfield        #651 <Field View mBehaviorTouchView>
	//   17   32:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   35:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//   19   38:invokevirtual   #335 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   20   41:astore          9
		boolean flag2;
		long l;
		if(behavior != null)
	//*  21   43:aload           9
	//*  22   45:ifnull          162
			flag = behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
	//   23   48:aload           9
	//   24   50:aload_0         
	//   25   51:aload_0         
	//   26   52:getfield        #651 <Field View mBehaviorTouchView>
	//   27   55:aload_1         
	//   28   56:invokevirtual   #649 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   29   59:istore_3        
		else
	//*  30   60:aload_0         
	//*  31   61:getfield        #651 <Field View mBehaviorTouchView>
	//*  32   64:ifnonnull       113
	//*  33   67:iload_3         
	//*  34   68:aload_0         
	//*  35   69:aload_1         
	//*  36   70:invokespecial   #1215 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//*  37   73:ior             
	//*  38   74:istore          5
	//*  39   76:aload           8
	//*  40   78:astore_1        
	//*  41   79:iload           5
	//*  42   81:ifne            88
	//*  43   84:iload_2         
	//*  44   85:ifne            88
	//*  45   88:aload_1         
	//*  46   89:ifnull          96
	//*  47   92:aload_1         
	//*  48   93:invokevirtual   #701 <Method void MotionEvent.recycle()>
	//*  49   96:iload_2         
	//*  50   97:iconst_1        
	//*  51   98:icmpeq          106
	//*  52  101:iload_2         
	//*  53  102:iconst_3        
	//*  54  103:icmpne          110
	//*  55  106:aload_0         
	//*  56  107:invokespecial   #983 <Method void resetTouchBehaviors()>
	//*  57  110:iload           5
	//*  58  112:ireturn         
	//*  59  113:aload           8
	//*  60  115:astore_1        
	//*  61  116:iload_3         
	//*  62  117:istore          5
	//*  63  119:iload           4
	//*  64  121:ifeq            79
	//*  65  124:iconst_0        
	//*  66  125:ifne            157
	//*  67  128:invokestatic    #638 <Method long SystemClock.uptimeMillis()>
	//*  68  131:lstore          6
	//*  69  133:lload           6
	//*  70  135:lload           6
	//*  71  137:iconst_3        
	//*  72  138:fconst_0        
	//*  73  139:fconst_0        
	//*  74  140:iconst_0        
	//*  75  141:invokestatic    #642 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//*  76  144:astore_1        
	//*  77  145:aload_0         
	//*  78  146:aload_1         
	//*  79  147:invokespecial   #1215 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//*  80  150:pop             
	//*  81  151:iload_3         
	//*  82  152:istore          5
	//*  83  154:goto            79
	//*  84  157:aconst_null     
	//*  85  158:astore_1        
	//*  86  159:goto            145
			flag = false;
	//   87  162:iconst_0        
	//   88  163:istore_3        
_L8:
		if(mBehaviorTouchView != null) goto _L6; else goto _L5
_L5:
		flag2 = flag | super.onTouchEvent(motionevent);
		motionevent = ((MotionEvent) (obj));
_L7:
		if(!flag2)
			if(i != 0);
		if(motionevent != null)
			motionevent.recycle();
		if(i == 1 || i == 3)
			resetTouchBehaviors();
		return flag2;
_L6:
		motionevent = ((MotionEvent) (obj));
		flag2 = flag;
		if(flag1)
		{
			if(true)
			{
				l = SystemClock.uptimeMillis();
				motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
			} else
			{
				motionevent = null;
			}
			super.onTouchEvent(motionevent);
			flag2 = flag;
		}
		if(true) goto _L7; else goto _L4
	//*  89  164:goto            60
_L4:
		flag = false;
	//   90  167:iconst_0        
	//   91  168:istore_3        
		if(true) goto _L8; else goto _L2
	//   92  169:goto            60
_L2:
		flag1 = false;
	//   93  172:iconst_0        
	//   94  173:istore          4
		if(true) goto _L3; else goto _L9
	//   95  175:goto            28
_L9:
	}

	void recordLastChildRect(View view, Rect rect)
	{
		((LayoutParams)view.getLayoutParams()).setLastChildRect(rect);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #1218 <Method void CoordinatorLayout$LayoutParams.setLastChildRect(Rect)>
	//    5   11:return          
	}

	void removePreDrawListener()
	{
		if(mIsAttachedToWindow && mOnPreDrawListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #727 <Field boolean mIsAttachedToWindow>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*   5   11:ifnull          25
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #734 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:aload_0         
	//    9   19:getfield        #729 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   10   22:invokevirtual   #1031 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mNeedsPreDrawListener = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #742 <Field boolean mNeedsPreDrawListener>
	//   14   30:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #22  <Class CoordinatorLayout$LayoutParams>
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
	//*  12   23:invokevirtual   #1224 <Method boolean CoordinatorLayout$Behavior.onRequestChildRectangleOnScreen(CoordinatorLayout, View, Rect, boolean)>
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
	//   20   35:invokespecial   #1226 <Method boolean ViewGroup.requestChildRectangleOnScreen(View, Rect, boolean)>
	//   21   38:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1229 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		if(flag && !mDisallowInterceptReset)
	//*   3    5:iload_1         
	//*   4    6:ifeq            25
	//*   5    9:aload_0         
	//*   6   10:getfield        #706 <Field boolean mDisallowInterceptReset>
	//*   7   13:ifne            25
		{
			resetTouchBehaviors();
	//    8   16:aload_0         
	//    9   17:invokespecial   #983 <Method void resetTouchBehaviors()>
			mDisallowInterceptReset = true;
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:putfield        #706 <Field boolean mDisallowInterceptReset>
		}
	//   13   25:return          
	}

	public void setFitsSystemWindows(boolean flag)
	{
		super.setFitsSystemWindows(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1232 <Method void ViewGroup.setFitsSystemWindows(boolean)>
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
	//    2    2:putfield        #1234 <Field android.view.ViewGroup$OnHierarchyChangeListener mOnHierarchyChangeListener>
	//    3    5:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		Drawable drawable1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(mStatusBarBackground != drawable)
	//*   2    2:aload_0         
	//*   3    3:getfield        #227 <Field Drawable mStatusBarBackground>
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       113
		{
			if(mStatusBarBackground != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #227 <Field Drawable mStatusBarBackground>
	//*   8   14:ifnull          25
				mStatusBarBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//    9   17:aload_0         
	//   10   18:getfield        #227 <Field Drawable mStatusBarBackground>
	//   11   21:aconst_null     
	//   12   22:invokevirtual   #1240 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          34
				drawable1 = drawable.mutate();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #1243 <Method Drawable Drawable.mutate()>
	//   17   33:astore_3        
			mStatusBarBackground = drawable1;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:putfield        #227 <Field Drawable mStatusBarBackground>
			if(mStatusBarBackground != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  23   43:ifnull          109
			{
				if(mStatusBarBackground.isStateful())
	//*  24   46:aload_0         
	//*  25   47:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  26   50:invokevirtual   #844 <Method boolean Drawable.isStateful()>
	//*  27   53:ifeq            68
					mStatusBarBackground.setState(getDrawableState());
	//   28   56:aload_0         
	//   29   57:getfield        #227 <Field Drawable mStatusBarBackground>
	//   30   60:aload_0         
	//   31   61:invokevirtual   #839 <Method int[] getDrawableState()>
	//   32   64:invokevirtual   #848 <Method boolean Drawable.setState(int[])>
	//   33   67:pop             
				DrawableCompat.setLayoutDirection(mStatusBarBackground, ViewCompat.getLayoutDirection(((View) (this))));
	//   34   68:aload_0         
	//   35   69:getfield        #227 <Field Drawable mStatusBarBackground>
	//   36   72:aload_0         
	//   37   73:invokestatic    #991 <Method int ViewCompat.getLayoutDirection(View)>
	//   38   76:invokestatic    #1249 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   39   79:pop             
				drawable = mStatusBarBackground;
	//   40   80:aload_0         
	//   41   81:getfield        #227 <Field Drawable mStatusBarBackground>
	//   42   84:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  43   85:aload_0         
	//*  44   86:invokevirtual   #1250 <Method int getVisibility()>
	//*  45   89:ifne            114
					flag = true;
	//   46   92:iconst_1        
	//   47   93:istore_2        
				else
	//*  48   94:aload_1         
	//*  49   95:iload_2         
	//*  50   96:iconst_0        
	//*  51   97:invokevirtual   #1254 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  52  100:pop             
	//*  53  101:aload_0         
	//*  54  102:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  55  105:aload_0         
	//*  56  106:invokevirtual   #1240 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
	//*  57  109:aload_0         
	//*  58  110:invokestatic    #1257 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//*  59  113:return          
					flag = false;
	//   60  114:iconst_0        
	//   61  115:istore_2        
				drawable.setVisible(flag, false);
				mStatusBarBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
		}
	//*  62  116:goto            94
	}

	public void setStatusBarBackgroundColor(int i)
	{
		setStatusBarBackground(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #1261 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1262 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #1264 <Method void setStatusBarBackground(Drawable)>
	//    6   12:return          
	}

	public void setStatusBarBackgroundResource(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			drawable = ContextCompat.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #872 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1271 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #1264 <Method void setStatusBarBackground(Drawable)>
	//*  10   18:return          
			drawable = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		setStatusBarBackground(drawable);
	//*  13   21:goto            13
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1274 <Method void ViewGroup.setVisibility(int)>
		boolean flag;
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            40
			flag = true;
	//    5    9:iconst_1        
	//    6   10:istore_2        
		else
	//*   7   11:aload_0         
	//*   8   12:getfield        #227 <Field Drawable mStatusBarBackground>
	//*   9   15:ifnull          39
	//*  10   18:aload_0         
	//*  11   19:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  12   22:invokevirtual   #1277 <Method boolean Drawable.isVisible()>
	//*  13   25:iload_2         
	//*  14   26:icmpeq          39
	//*  15   29:aload_0         
	//*  16   30:getfield        #227 <Field Drawable mStatusBarBackground>
	//*  17   33:iload_2         
	//*  18   34:iconst_0        
	//*  19   35:invokevirtual   #1254 <Method boolean Drawable.setVisible(boolean, boolean)>
	//*  20   38:pop             
	//*  21   39:return          
			flag = false;
	//   22   40:iconst_0        
	//   23   41:istore_2        
		if(mStatusBarBackground != null && mStatusBarBackground.isVisible() != flag)
			mStatusBarBackground.setVisible(flag, false);
	//*  24   42:goto            11
	}

	final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowinsetscompat)
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		WindowInsetsCompat windowinsetscompat1 = windowinsetscompat;
	//    2    2:aload_1         
	//    3    3:astore          4
		if(!ObjectsCompat.equals(((Object) (mLastInsets)), ((Object) (windowinsetscompat))))
	//*   4    5:aload_0         
	//*   5    6:getfield        #437 <Field WindowInsetsCompat mLastInsets>
	//*   6    9:aload_1         
	//*   7   10:invokestatic    #1283 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*   8   13:ifne            71
		{
			mLastInsets = windowinsetscompat;
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:putfield        #437 <Field WindowInsetsCompat mLastInsets>
			boolean flag;
			if(windowinsetscompat != null && windowinsetscompat.getSystemWindowInsetTop() > 0)
	//*  12   21:aload_1         
	//*  13   22:ifnull          74
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #443 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//*  16   29:ifle            74
				flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_2        
			else
	//*  19   34:aload_0         
	//*  20   35:iload_2         
	//*  21   36:putfield        #1042 <Field boolean mDrawStatusBarBackground>
	//*  22   39:aload_0         
	//*  23   40:getfield        #1042 <Field boolean mDrawStatusBarBackground>
	//*  24   43:ifne            79
	//*  25   46:aload_0         
	//*  26   47:invokevirtual   #1286 <Method Drawable getBackground()>
	//*  27   50:ifnonnull       79
	//*  28   53:iload_3         
	//*  29   54:istore_2        
	//*  30   55:aload_0         
	//*  31   56:iload_2         
	//*  32   57:invokevirtual   #1289 <Method void setWillNotDraw(boolean)>
	//*  33   60:aload_0         
	//*  34   61:aload_1         
	//*  35   62:invokespecial   #1291 <Method WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat)>
	//*  36   65:astore          4
	//*  37   67:aload_0         
	//*  38   68:invokevirtual   #1294 <Method void requestLayout()>
	//*  39   71:aload           4
	//*  40   73:areturn         
				flag = false;
	//   41   74:iconst_0        
	//   42   75:istore_2        
			mDrawStatusBarBackground = flag;
			if(!mDrawStatusBarBackground && getBackground() == null)
				flag = flag1;
			else
	//*  43   76:goto            34
				flag = false;
	//   44   79:iconst_0        
	//   45   80:istore_2        
			setWillNotDraw(flag);
			windowinsetscompat1 = dispatchApplyWindowInsetsToBehaviors(windowinsetscompat);
			requestLayout();
		}
		return windowinsetscompat1;
	//*  46   81:goto            55
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1298 <Method boolean ViewGroup.verifyDrawable(Drawable)>
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
	private final DirectedAcyclicGraph mChildDag;
	private final List mDependencySortedChildren;
	private boolean mDisallowInterceptReset;
	private boolean mDrawStatusBarBackground;
	private boolean mIsAttachedToWindow;
	private int mKeylines[];
	private WindowInsetsCompat mLastInsets;
	private boolean mNeedsPreDrawListener;
	private final NestedScrollingParentHelper mNestedScrollingParentHelper;
	private View mNestedScrollingTarget;
	android.view.ViewGroup.OnHierarchyChangeListener mOnHierarchyChangeListener;
	private OnPreDrawListener mOnPreDrawListener;
	private Paint mScrimPaint;
	private Drawable mStatusBarBackground;
	private final List mTempDependenciesList;
	private final int mTempIntPair[];
	private final List mTempList1;

	static 
	{
		Object obj = ((Object) (((Class) (android/support/design/widget/CoordinatorLayout)).getPackage()));
	//    0    0:ldc1            #2   <Class CoordinatorLayout>
	//    1    2:invokevirtual   #101 <Method Package Class.getPackage()>
	//    2    5:astore_0        
		if(obj != null)
	//*   3    6:aload_0         
	//*   4    7:ifnull          77
			obj = ((Object) (((Package) (obj)).getName()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #107 <Method String Package.getName()>
	//    7   14:astore_0        
		else
	//*   8   15:aload_0         
	//*   9   16:putstatic       #109 <Field String WIDGET_PACKAGE_NAME>
	//*  10   19:getstatic       #114 <Field int android.os.Build$VERSION.SDK_INT>
	//*  11   22:bipush          21
	//*  12   24:icmplt          82
	//*  13   27:new             #33  <Class CoordinatorLayout$ViewElevationComparator>
	//*  14   30:dup             
	//*  15   31:invokespecial   #117 <Method void CoordinatorLayout$ViewElevationComparator()>
	//*  16   34:putstatic       #119 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//*  17   37:iconst_2        
	//*  18   38:anewarray       Class[]
	//*  19   41:dup             
	//*  20   42:iconst_0        
	//*  21   43:ldc1            #121 <Class Context>
	//*  22   45:aastore         
	//*  23   46:dup             
	//*  24   47:iconst_1        
	//*  25   48:ldc1            #123 <Class AttributeSet>
	//*  26   50:aastore         
	//*  27   51:putstatic       #125 <Field Class[] CONSTRUCTOR_PARAMS>
	//*  28   54:new             #127 <Class ThreadLocal>
	//*  29   57:dup             
	//*  30   58:invokespecial   #128 <Method void ThreadLocal()>
	//*  31   61:putstatic       #130 <Field ThreadLocal sConstructors>
	//*  32   64:new             #132 <Class android.support.v4.util.Pools$SynchronizedPool>
	//*  33   67:dup             
	//*  34   68:bipush          12
	//*  35   70:invokespecial   #135 <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//*  36   73:putstatic       #137 <Field android.support.v4.util.Pools$Pool sRectPool>
	//*  37   76:return          
			obj = null;
	//   38   77:aconst_null     
	//   39   78:astore_0        
		WIDGET_PACKAGE_NAME = ((String) (obj));
		if(android.os.Build.VERSION.SDK_INT >= 21)
			TOP_SORTED_CHILDREN_COMPARATOR = ((Comparator) (new ViewElevationComparator()));
		else
	//*  40   79:goto            15
			TOP_SORTED_CHILDREN_COMPARATOR = null;
	//   41   82:aconst_null     
	//   42   83:putstatic       #119 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//*  43   86:goto            37
	}
}
