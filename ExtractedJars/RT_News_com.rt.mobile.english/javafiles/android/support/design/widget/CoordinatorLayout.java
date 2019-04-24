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
import android.support.v4.widget.DirectedAcyclicGraph;
import android.support.v4.widget.ViewGroupUtils;
import android.text.TextUtils;
import android.util.*;
import android.view.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.*;

public class CoordinatorLayout extends ViewGroup
	implements NestedScrollingParent2
{
	public static interface AttachedBehavior
	{

		public abstract Behavior getBehavior();
	}

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
				StringBuilder stringbuilder = new StringBuilder();
		//   82  159:new             #168 <Class StringBuilder>
		//   83  162:dup             
		//   84  163:invokespecial   #169 <Method void StringBuilder()>
		//   85  166:astore_3        
				stringbuilder.append("Could not find CoordinatorLayout descendant view with id ");
		//   86  167:aload_3         
		//   87  168:ldc1            #171 <String "Could not find CoordinatorLayout descendant view with id ">
		//   88  170:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   89  173:pop             
				stringbuilder.append(coordinatorlayout.getResources().getResourceName(mAnchorId));
		//   90  174:aload_3         
		//   91  175:aload_2         
		//   92  176:invokevirtual   #179 <Method Resources CoordinatorLayout.getResources()>
		//   93  179:aload_0         
		//   94  180:getfield        #45  <Field int mAnchorId>
		//   95  183:invokevirtual   #184 <Method String Resources.getResourceName(int)>
		//   96  186:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//   97  189:pop             
				stringbuilder.append(" to anchor view ");
		//   98  190:aload_3         
		//   99  191:ldc1            #186 <String " to anchor view ">
		//  100  193:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
		//  101  196:pop             
				stringbuilder.append(((Object) (view)));
		//  102  197:aload_3         
		//  103  198:aload_1         
		//  104  199:invokevirtual   #189 <Method StringBuilder StringBuilder.append(Object)>
		//  105  202:pop             
				throw new IllegalStateException(stringbuilder.toString());
		//  106  203:new             #150 <Class IllegalStateException>
		//  107  206:dup             
		//  108  207:aload_3         
		//  109  208:invokevirtual   #193 <Method String StringBuilder.toString()>
		//  110  211:invokespecial   #155 <Method void IllegalStateException(String)>
		//  111  214:athrow          
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
			for(ViewParent viewparent = mAnchorView.getParent(); viewparent != coordinatorlayout;)
		//*  11   22:aload_0         
		//*  12   23:getfield        #142 <Field View mAnchorView>
		//*  13   26:invokevirtual   #161 <Method ViewParent View.getParent()>
		//*  14   29:astore_3        
		//*  15   30:aload_3         
		//*  16   31:aload_2         
		//*  17   32:if_acmpeq       82
				if(viewparent != null && viewparent != view)
		//*  18   35:aload_3         
		//*  19   36:ifnull          70
		//*  20   39:aload_3         
		//*  21   40:aload_1         
		//*  22   41:if_acmpne       47
		//*  23   44:goto            70
				{
					if(viewparent instanceof View)
		//*  24   47:aload_3         
		//*  25   48:instanceof      #157 <Class View>
		//*  26   51:ifeq            60
						view1 = (View)viewparent;
		//   27   54:aload_3         
		//   28   55:checkcast       #157 <Class View>
		//   29   58:astore          4
					viewparent = viewparent.getParent();
		//   30   60:aload_3         
		//   31   61:invokeinterface #166 <Method ViewParent ViewParent.getParent()>
		//   32   66:astore_3        
				} else
		//*  33   67:goto            30
				{
					mAnchorDirectChild = null;
		//   34   70:aload_0         
		//   35   71:aconst_null     
		//   36   72:putfield        #148 <Field View mAnchorDirectChild>
					mAnchorView = null;
		//   37   75:aload_0         
		//   38   76:aconst_null     
		//   39   77:putfield        #142 <Field View mAnchorView>
					return false;
		//   40   80:iconst_0        
		//   41   81:ireturn         
				}

			mAnchorDirectChild = view1;
		//   42   82:aload_0         
		//   43   83:aload           4
		//   44   85:putfield        #148 <Field View mAnchorDirectChild>
			return true;
		//   45   88:iconst_1        
		//   46   89:ireturn         
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
		//    3    5:if_acmpeq       45
		//    4    8:aload_0         
		//    5    9:aload_3         
		//    6   10:aload_1         
		//    7   11:invokestatic    #219 <Method int ViewCompat.getLayoutDirection(View)>
		//    8   14:invokespecial   #221 <Method boolean shouldDodge(View, int)>
		//    9   17:ifne            45
		//   10   20:aload_0         
		//   11   21:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//   12   24:ifnull          43
		//   13   27:aload_0         
		//   14   28:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//   15   31:aload_1         
		//   16   32:aload_2         
		//   17   33:aload_3         
		//   18   34:invokevirtual   #224 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
		//   19   37:ifeq            43
		//   20   40:goto            45
		//   21   43:iconst_0        
		//   22   44:ireturn         
		//   23   45:iconst_1        
		//   24   46:ireturn         
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
		//*  10   19:ifnull          35
				flag = mBehavior.blocksInteractionBelow(coordinatorlayout, view);
		//   11   22:aload_0         
		//   12   23:getfield        #119 <Field CoordinatorLayout$Behavior mBehavior>
		//   13   26:aload_1         
		//   14   27:aload_2         
		//   15   28:invokevirtual   #250 <Method boolean CoordinatorLayout$Behavior.blocksInteractionBelow(CoordinatorLayout, View)>
		//   16   31:istore_3        
			else
		//*  17   32:goto            37
				flag = false;
		//   18   35:iconst_0        
		//   19   36:istore_3        
			flag |= flag1;
		//   20   37:iload_3         
		//   21   38:iload           4
		//   22   40:ior             
		//   23   41:istore_3        
			mDidBlockInteraction = flag;
		//   24   42:aload_0         
		//   25   43:iload_3         
		//   26   44:putfield        #227 <Field boolean mDidBlockInteraction>
			return flag;
		//   27   47:iload_3         
		//   28   48:ireturn         
		}

		boolean isNestedScrollAccepted(int i)
		{
			switch(i)
		//*   0    0:iload_1         
			{
		//*   1    1:tableswitch     0 1: default 24
		//		               0 31
		//		               1 26
			default:
				return false;
		//    2   24:iconst_0        
		//    3   25:ireturn         

			case 1: // '\001'
				return mDidAcceptNestedScrollNonTouch;
		//    4   26:aload_0         
		//    5   27:getfield        #253 <Field boolean mDidAcceptNestedScrollNonTouch>
		//    6   30:ireturn         

			case 0: // '\0'
				return mDidAcceptNestedScrollTouch;
		//    7   31:aload_0         
		//    8   32:getfield        #255 <Field boolean mDidAcceptNestedScrollTouch>
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
		//		               0 31
		//		               1 25
			default:
				return;
		//    2   24:return          

			case 1: // '\001'
				mDidAcceptNestedScrollNonTouch = flag;
		//    3   25:aload_0         
		//    4   26:iload_2         
		//    5   27:putfield        #253 <Field boolean mDidAcceptNestedScrollNonTouch>
				return;
		//    6   30:return          

			case 0: // '\0'
				mDidAcceptNestedScrollTouch = flag;
		//    7   31:aload_0         
		//    8   32:iload_2         
		//    9   33:putfield        #255 <Field boolean mDidAcceptNestedScrollTouch>
				return;
		//   10   36:return          
			}
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
			TypedArray typedarray = context.obtainStyledAttributes(attributeset, android.support.coreui.R.styleable.CoordinatorLayout_Layout);
		//   30   52:aload_1         
		//   31   53:aload_2         
		//   32   54:getstatic       #66  <Field int[] android.support.coreui.R$styleable.CoordinatorLayout_Layout>
		//   33   57:invokevirtual   #72  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   34   60:astore_3        
			gravity = typedarray.getInteger(android.support.coreui.R.styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
		//   35   61:aload_0         
		//   36   62:aload_3         
		//   37   63:getstatic       #75  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_android_layout_gravity>
		//   38   66:iconst_0        
		//   39   67:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
		//   40   70:putfield        #39  <Field int gravity>
			mAnchorId = typedarray.getResourceId(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_anchor, -1);
		//   41   73:aload_0         
		//   42   74:aload_3         
		//   43   75:getstatic       #84  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_anchor>
		//   44   78:iconst_m1       
		//   45   79:invokevirtual   #87  <Method int TypedArray.getResourceId(int, int)>
		//   46   82:putfield        #45  <Field int mAnchorId>
			anchorGravity = typedarray.getInteger(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
		//   47   85:aload_0         
		//   48   86:aload_3         
		//   49   87:getstatic       #90  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_anchorGravity>
		//   50   90:iconst_0        
		//   51   91:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
		//   52   94:putfield        #41  <Field int anchorGravity>
			keyline = typedarray.getInteger(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_keyline, -1);
		//   53   97:aload_0         
		//   54   98:aload_3         
		//   55   99:getstatic       #93  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_keyline>
		//   56  102:iconst_m1       
		//   57  103:invokevirtual   #81  <Method int TypedArray.getInteger(int, int)>
		//   58  106:putfield        #43  <Field int keyline>
			insetEdge = typedarray.getInt(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
		//   59  109:aload_0         
		//   60  110:aload_3         
		//   61  111:getstatic       #96  <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_insetEdge>
		//   62  114:iconst_0        
		//   63  115:invokevirtual   #99  <Method int TypedArray.getInt(int, int)>
		//   64  118:putfield        #47  <Field int insetEdge>
			dodgeInsetEdges = typedarray.getInt(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
		//   65  121:aload_0         
		//   66  122:aload_3         
		//   67  123:getstatic       #102 <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges>
		//   68  126:iconst_0        
		//   69  127:invokevirtual   #99  <Method int TypedArray.getInt(int, int)>
		//   70  130:putfield        #49  <Field int dodgeInsetEdges>
			mBehaviorResolved = typedarray.hasValue(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_behavior);
		//   71  133:aload_0         
		//   72  134:aload_3         
		//   73  135:getstatic       #105 <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_behavior>
		//   74  138:invokevirtual   #109 <Method boolean TypedArray.hasValue(int)>
		//   75  141:putfield        #37  <Field boolean mBehaviorResolved>
			if(mBehaviorResolved)
		//*  76  144:aload_0         
		//*  77  145:getfield        #37  <Field boolean mBehaviorResolved>
		//*  78  148:ifeq            167
				mBehavior = CoordinatorLayout.parseBehavior(context, attributeset, typedarray.getString(android.support.coreui.R.styleable.CoordinatorLayout_Layout_layout_behavior));
		//   79  151:aload_0         
		//   80  152:aload_1         
		//   81  153:aload_2         
		//   82  154:aload_3         
		//   83  155:getstatic       #105 <Field int android.support.coreui.R$styleable.CoordinatorLayout_Layout_layout_behavior>
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
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #58  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			SparseArray sparsearray = behaviorStates;
		//    4    6:aload_0         
		//    5    7:getfield        #47  <Field SparseArray behaviorStates>
		//    6   10:astore          5
			int k = 0;
		//    7   12:iconst_0        
		//    8   13:istore          4
			int j;
			if(sparsearray != null)
		//*   9   15:aload           5
		//*  10   17:ifnull          31
				j = behaviorStates.size();
		//   11   20:aload_0         
		//   12   21:getfield        #47  <Field SparseArray behaviorStates>
		//   13   24:invokevirtual   #61  <Method int SparseArray.size()>
		//   14   27:istore_3        
			else
		//*  15   28:goto            33
				j = 0;
		//   16   31:iconst_0        
		//   17   32:istore_3        
			parcel.writeInt(j);
		//   18   33:aload_1         
		//   19   34:iload_3         
		//   20   35:invokevirtual   #64  <Method void Parcel.writeInt(int)>
			int ai[] = new int[j];
		//   21   38:iload_3         
		//   22   39:newarray        int[]
		//   23   41:astore          5
			Parcelable aparcelable[] = new Parcelable[j];
		//   24   43:iload_3         
		//   25   44:anewarray       Parcelable[]
		//   26   47:astore          6
			for(; k < j; k++)
		//*  27   49:iload           4
		//*  28   51:iload_3         
		//*  29   52:icmpge          95
			{
				ai[k] = behaviorStates.keyAt(k);
		//   30   55:aload           5
		//   31   57:iload           4
		//   32   59:aload_0         
		//   33   60:getfield        #47  <Field SparseArray behaviorStates>
		//   34   63:iload           4
		//   35   65:invokevirtual   #70  <Method int SparseArray.keyAt(int)>
		//   36   68:iastore         
				aparcelable[k] = (Parcelable)behaviorStates.valueAt(k);
		//   37   69:aload           6
		//   38   71:iload           4
		//   39   73:aload_0         
		//   40   74:getfield        #47  <Field SparseArray behaviorStates>
		//   41   77:iload           4
		//   42   79:invokevirtual   #74  <Method Object SparseArray.valueAt(int)>
		//   43   82:checkcast       #66  <Class Parcelable>
		//   44   85:aastore         
			}

		//   45   86:iload           4
		//   46   88:iconst_1        
		//   47   89:iadd            
		//   48   90:istore          4
		//*  49   92:goto            49
			parcel.writeIntArray(ai);
		//   50   95:aload_1         
		//   51   96:aload           5
		//   52   98:invokevirtual   #77  <Method void Parcel.writeIntArray(int[])>
			parcel.writeParcelableArray(aparcelable, i);
		//   53  101:aload_1         
		//   54  102:aload           6
		//   55  104:iload_2         
		//   56  105:invokevirtual   #81  <Method void Parcel.writeParcelableArray(Parcelable[], int)>
		//   57  108:return          
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
	//    3    3:invokespecial   #145 <Method void CoordinatorLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.coreui.R.attr.coordinatorLayoutStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #150 <Field int android.support.coreui.R$attr.coordinatorLayoutStyle>
	//    4    6:invokespecial   #153 <Method void CoordinatorLayout(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public CoordinatorLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #154 <Method void ViewGroup(Context, AttributeSet, int)>
		mDependencySortedChildren = ((List) (new ArrayList()));
	//    5    7:aload_0         
	//    6    8:new             #156 <Class ArrayList>
	//    7   11:dup             
	//    8   12:invokespecial   #157 <Method void ArrayList()>
	//    9   15:putfield        #159 <Field List mDependencySortedChildren>
		mChildDag = new DirectedAcyclicGraph();
	//   10   18:aload_0         
	//   11   19:new             #161 <Class DirectedAcyclicGraph>
	//   12   22:dup             
	//   13   23:invokespecial   #162 <Method void DirectedAcyclicGraph()>
	//   14   26:putfield        #164 <Field DirectedAcyclicGraph mChildDag>
		mTempList1 = ((List) (new ArrayList()));
	//   15   29:aload_0         
	//   16   30:new             #156 <Class ArrayList>
	//   17   33:dup             
	//   18   34:invokespecial   #157 <Method void ArrayList()>
	//   19   37:putfield        #166 <Field List mTempList1>
		mTempDependenciesList = ((List) (new ArrayList()));
	//   20   40:aload_0         
	//   21   41:new             #156 <Class ArrayList>
	//   22   44:dup             
	//   23   45:invokespecial   #157 <Method void ArrayList()>
	//   24   48:putfield        #168 <Field List mTempDependenciesList>
		mTempIntPair = new int[2];
	//   25   51:aload_0         
	//   26   52:iconst_2        
	//   27   53:newarray        int[]
	//   28   55:putfield        #170 <Field int[] mTempIntPair>
		mNestedScrollingParentHelper = new NestedScrollingParentHelper(((ViewGroup) (this)));
	//   29   58:aload_0         
	//   30   59:new             #172 <Class NestedScrollingParentHelper>
	//   31   62:dup             
	//   32   63:aload_0         
	//   33   64:invokespecial   #175 <Method void NestedScrollingParentHelper(ViewGroup)>
	//   34   67:putfield        #177 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
		boolean flag = false;
	//   35   70:iconst_0        
	//   36   71:istore          5
		if(i == 0)
	//*  37   73:iload_3         
	//*  38   74:ifne            93
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.coreui.R.styleable.CoordinatorLayout, 0, android.support.coreui.R.style.Widget_Support_CoordinatorLayout)));
	//   39   77:aload_1         
	//   40   78:aload_2         
	//   41   79:getstatic       #181 <Field int[] android.support.coreui.R$styleable.CoordinatorLayout>
	//   42   82:iconst_0        
	//   43   83:getstatic       #186 <Field int android.support.coreui.R$style.Widget_Support_CoordinatorLayout>
	//   44   86:invokevirtual   #190 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   45   89:astore_2        
		else
	//*  46   90:goto            104
			attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, android.support.coreui.R.styleable.CoordinatorLayout, i, 0)));
	//   47   93:aload_1         
	//   48   94:aload_2         
	//   49   95:getstatic       #181 <Field int[] android.support.coreui.R$styleable.CoordinatorLayout>
	//   50   98:iload_3         
	//   51   99:iconst_0        
	//   52  100:invokevirtual   #190 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   53  103:astore_2        
		i = ((TypedArray) (attributeset)).getResourceId(android.support.coreui.R.styleable.CoordinatorLayout_keylines, 0);
	//   54  104:aload_2         
	//   55  105:getstatic       #193 <Field int android.support.coreui.R$styleable.CoordinatorLayout_keylines>
	//   56  108:iconst_0        
	//   57  109:invokevirtual   #199 <Method int TypedArray.getResourceId(int, int)>
	//   58  112:istore_3        
		if(i != 0)
	//*  59  113:iload_3         
	//*  60  114:ifeq            180
		{
			context = ((Context) (context.getResources()));
	//   61  117:aload_1         
	//   62  118:invokevirtual   #203 <Method Resources Context.getResources()>
	//   63  121:astore_1        
			mKeylines = ((Resources) (context)).getIntArray(i);
	//   64  122:aload_0         
	//   65  123:aload_1         
	//   66  124:iload_3         
	//   67  125:invokevirtual   #209 <Method int[] Resources.getIntArray(int)>
	//   68  128:putfield        #211 <Field int[] mKeylines>
			float f = ((Resources) (context)).getDisplayMetrics().density;
	//   69  131:aload_1         
	//   70  132:invokevirtual   #215 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   71  135:getfield        #221 <Field float DisplayMetrics.density>
	//   72  138:fstore          4
			int j = mKeylines.length;
	//   73  140:aload_0         
	//   74  141:getfield        #211 <Field int[] mKeylines>
	//   75  144:arraylength     
	//   76  145:istore          6
			for(i = ((int) (flag)); i < j; i++)
	//*  77  147:iload           5
	//*  78  149:istore_3        
	//*  79  150:iload_3         
	//*  80  151:iload           6
	//*  81  153:icmpge          180
				mKeylines[i] = (int)((float)mKeylines[i] * f);
	//   82  156:aload_0         
	//   83  157:getfield        #211 <Field int[] mKeylines>
	//   84  160:iload_3         
	//   85  161:aload_0         
	//   86  162:getfield        #211 <Field int[] mKeylines>
	//   87  165:iload_3         
	//   88  166:iaload          
	//   89  167:i2f             
	//   90  168:fload           4
	//   91  170:fmul            
	//   92  171:f2i             
	//   93  172:iastore         

	//   94  173:iload_3         
	//   95  174:iconst_1        
	//   96  175:iadd            
	//   97  176:istore_3        
		}
	//*  98  177:goto            150
		mStatusBarBackground = ((TypedArray) (attributeset)).getDrawable(android.support.coreui.R.styleable.CoordinatorLayout_statusBarBackground);
	//   99  180:aload_0         
	//  100  181:aload_2         
	//  101  182:getstatic       #224 <Field int android.support.coreui.R$styleable.CoordinatorLayout_statusBarBackground>
	//  102  185:invokevirtual   #228 <Method Drawable TypedArray.getDrawable(int)>
	//  103  188:putfield        #230 <Field Drawable mStatusBarBackground>
		((TypedArray) (attributeset)).recycle();
	//  104  191:aload_2         
	//  105  192:invokevirtual   #233 <Method void TypedArray.recycle()>
		setupForInsets();
	//  106  195:aload_0         
	//  107  196:invokespecial   #236 <Method void setupForInsets()>
		super.setOnHierarchyChangeListener(((android.view.ViewGroup.OnHierarchyChangeListener) (new HierarchyChangeListener())));
	//  108  199:aload_0         
	//  109  200:new             #22  <Class CoordinatorLayout$HierarchyChangeListener>
	//  110  203:dup             
	//  111  204:aload_0         
	//  112  205:invokespecial   #239 <Method void CoordinatorLayout$HierarchyChangeListener(CoordinatorLayout)>
	//  113  208:invokespecial   #243 <Method void ViewGroup.setOnHierarchyChangeListener(android.view.ViewGroup$OnHierarchyChangeListener)>
	//  114  211:return          
	}

	private static Rect acquireTempRect()
	{
		Rect rect1 = (Rect)sRectPool.acquire();
	//    0    0:getstatic       #140 <Field android.support.v4.util.Pools$Pool sRectPool>
	//    1    3:invokeinterface #252 <Method Object android.support.v4.util.Pools$Pool.acquire()>
	//    2    8:checkcast       #254 <Class Rect>
	//    3   11:astore_1        
		Rect rect = rect1;
	//    4   12:aload_1         
	//    5   13:astore_0        
		if(rect1 == null)
	//*   6   14:aload_1         
	//*   7   15:ifnonnull       26
			rect = new Rect();
	//    8   18:new             #254 <Class Rect>
	//    9   21:dup             
	//   10   22:invokespecial   #255 <Method void Rect()>
	//   11   25:astore_0        
		return rect;
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	private void constrainChildRect(LayoutParams layoutparams, Rect rect, int i, int j)
	{
		int l = getWidth();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #262 <Method int getWidth()>
	//    2    4:istore          6
		int k = getHeight();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #265 <Method int getHeight()>
	//    5   10:istore          5
		l = Math.max(getPaddingLeft() + layoutparams.leftMargin, Math.min(rect.left, l - getPaddingRight() - i - layoutparams.rightMargin));
	//    6   12:aload_0         
	//    7   13:invokevirtual   #268 <Method int getPaddingLeft()>
	//    8   16:aload_1         
	//    9   17:getfield        #271 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   10   20:iadd            
	//   11   21:aload_2         
	//   12   22:getfield        #274 <Field int Rect.left>
	//   13   25:iload           6
	//   14   27:aload_0         
	//   15   28:invokevirtual   #277 <Method int getPaddingRight()>
	//   16   31:isub            
	//   17   32:iload_3         
	//   18   33:isub            
	//   19   34:aload_1         
	//   20   35:getfield        #280 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   21   38:isub            
	//   22   39:invokestatic    #285 <Method int Math.min(int, int)>
	//   23   42:invokestatic    #288 <Method int Math.max(int, int)>
	//   24   45:istore          6
		k = Math.max(getPaddingTop() + layoutparams.topMargin, Math.min(rect.top, k - getPaddingBottom() - j - layoutparams.bottomMargin));
	//   25   47:aload_0         
	//   26   48:invokevirtual   #291 <Method int getPaddingTop()>
	//   27   51:aload_1         
	//   28   52:getfield        #294 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   29   55:iadd            
	//   30   56:aload_2         
	//   31   57:getfield        #297 <Field int Rect.top>
	//   32   60:iload           5
	//   33   62:aload_0         
	//   34   63:invokevirtual   #300 <Method int getPaddingBottom()>
	//   35   66:isub            
	//   36   67:iload           4
	//   37   69:isub            
	//   38   70:aload_1         
	//   39   71:getfield        #303 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//   40   74:isub            
	//   41   75:invokestatic    #285 <Method int Math.min(int, int)>
	//   42   78:invokestatic    #288 <Method int Math.max(int, int)>
	//   43   81:istore          5
		rect.set(l, k, i + l, j + k);
	//   44   83:aload_2         
	//   45   84:iload           6
	//   46   86:iload           5
	//   47   88:iload_3         
	//   48   89:iload           6
	//   49   91:iadd            
	//   50   92:iload           4
	//   51   94:iload           5
	//   52   96:iadd            
	//   53   97:invokevirtual   #307 <Method void Rect.set(int, int, int, int)>
	//   54  100:return          
	}

	private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat windowinsetscompat)
	{
		if(windowinsetscompat.isConsumed())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #315 <Method boolean WindowInsetsCompat.isConsumed()>
	//*   2    4:ifeq            9
			return windowinsetscompat;
	//    3    7:aload_1         
	//    4    8:areturn         
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore_2        
		int j = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #318 <Method int getChildCount()>
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
	//   17   26:invokevirtual   #322 <Method View getChildAt(int)>
	//   18   29:astore          5
			windowinsetscompat = windowinsetscompat1;
	//   19   31:aload           4
	//   20   33:astore_1        
			if(ViewCompat.getFitsSystemWindows(view))
	//*  21   34:aload           5
	//*  22   36:invokestatic    #328 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  23   39:ifeq            89
			{
				Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//   24   42:aload           5
	//   25   44:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   47:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   27   50:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
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
	//   37   70:invokevirtual   #342 <Method WindowInsetsCompat CoordinatorLayout$Behavior.onApplyWindowInsets(CoordinatorLayout, View, WindowInsetsCompat)>
	//   38   73:astore          4
					windowinsetscompat = windowinsetscompat1;
	//   39   75:aload           4
	//   40   77:astore_1        
					if(windowinsetscompat1.isConsumed())
	//*  41   78:aload           4
	//*  42   80:invokevirtual   #315 <Method boolean WindowInsetsCompat.isConsumed()>
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
		int l = GravityCompat.getAbsoluteGravity(resolveAnchoredChildGravity(layoutparams.gravity), i);
	//    0    0:aload           5
	//    1    2:getfield        #347 <Field int CoordinatorLayout$LayoutParams.gravity>
	//    2    5:invokestatic    #351 <Method int resolveAnchoredChildGravity(int)>
	//    3    8:iload_2         
	//    4    9:invokestatic    #356 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    5   12:istore          8
		i = GravityCompat.getAbsoluteGravity(resolveGravity(layoutparams.anchorGravity), i);
	//    6   14:aload           5
	//    7   16:getfield        #359 <Field int CoordinatorLayout$LayoutParams.anchorGravity>
	//    8   19:invokestatic    #362 <Method int resolveGravity(int)>
	//    9   22:iload_2         
	//   10   23:invokestatic    #356 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   11   26:istore_2        
		int k1 = l & 7;
	//   12   27:iload           8
	//   13   29:bipush          7
	//   14   31:iand            
	//   15   32:istore          11
		int j1 = l & 0x70;
	//   16   34:iload           8
	//   17   36:bipush          112
	//   18   38:iand            
	//   19   39:istore          10
		int i1 = i & 7;
	//   20   41:iload_2         
	//   21   42:bipush          7
	//   22   44:iand            
	//   23   45:istore          9
		l = i & 0x70;
	//   24   47:iload_2         
	//   25   48:bipush          112
	//   26   50:iand            
	//   27   51:istore          8
		if(i1 != 1)
	//*  28   53:iload           9
	//*  29   55:iconst_1        
	//*  30   56:icmpeq          81
		{
			if(i1 != 5)
	//*  31   59:iload           9
	//*  32   61:iconst_5        
	//*  33   62:icmpeq          73
				i = rect.left;
	//   34   65:aload_3         
	//   35   66:getfield        #274 <Field int Rect.left>
	//   36   69:istore_2        
			else
	//*  37   70:goto            93
				i = rect.right;
	//   38   73:aload_3         
	//   39   74:getfield        #365 <Field int Rect.right>
	//   40   77:istore_2        
		} else
	//*  41   78:goto            93
		{
			i = rect.left + rect.width() / 2;
	//   42   81:aload_3         
	//   43   82:getfield        #274 <Field int Rect.left>
	//   44   85:aload_3         
	//   45   86:invokevirtual   #368 <Method int Rect.width()>
	//   46   89:iconst_2        
	//   47   90:idiv            
	//   48   91:iadd            
	//   49   92:istore_2        
		}
		if(l != 16)
	//*  50   93:iload           8
	//*  51   95:bipush          16
	//*  52   97:icmpeq          125
		{
			if(l != 80)
	//*  53  100:iload           8
	//*  54  102:bipush          80
	//*  55  104:icmpeq          116
				l = rect.top;
	//   56  107:aload_3         
	//   57  108:getfield        #297 <Field int Rect.top>
	//   58  111:istore          8
			else
	//*  59  113:goto            138
				l = rect.bottom;
	//   60  116:aload_3         
	//   61  117:getfield        #371 <Field int Rect.bottom>
	//   62  120:istore          8
		} else
	//*  63  122:goto            138
		{
			l = rect.top + rect.height() / 2;
	//   64  125:aload_3         
	//   65  126:getfield        #297 <Field int Rect.top>
	//   66  129:aload_3         
	//   67  130:invokevirtual   #374 <Method int Rect.height()>
	//   68  133:iconst_2        
	//   69  134:idiv            
	//   70  135:iadd            
	//   71  136:istore          8
		}
		if(k1 != 1)
	//*  72  138:iload           11
	//*  73  140:iconst_1        
	//*  74  141:icmpeq          162
		{
			i1 = i;
	//   75  144:iload_2         
	//   76  145:istore          9
			if(k1 != 5)
	//*  77  147:iload           11
	//*  78  149:iconst_5        
	//*  79  150:icmpeq          170
				i1 = i - j;
	//   80  153:iload_2         
	//   81  154:iload           6
	//   82  156:isub            
	//   83  157:istore          9
		} else
	//*  84  159:goto            170
		{
			i1 = i - j / 2;
	//   85  162:iload_2         
	//   86  163:iload           6
	//   87  165:iconst_2        
	//   88  166:idiv            
	//   89  167:isub            
	//   90  168:istore          9
		}
		if(j1 != 16)
	//*  91  170:iload           10
	//*  92  172:bipush          16
	//*  93  174:icmpeq          196
		{
			i = l;
	//   94  177:iload           8
	//   95  179:istore_2        
			if(j1 != 80)
	//*  96  180:iload           10
	//*  97  182:bipush          80
	//*  98  184:icmpeq          204
				i = l - k;
	//   99  187:iload           8
	//  100  189:iload           7
	//  101  191:isub            
	//  102  192:istore_2        
		} else
	//* 103  193:goto            204
		{
			i = l - k / 2;
	//  104  196:iload           8
	//  105  198:iload           7
	//  106  200:iconst_2        
	//  107  201:idiv            
	//  108  202:isub            
	//  109  203:istore_2        
		}
		rect1.set(i1, i, j + i1, k + i);
	//  110  204:aload           4
	//  111  206:iload           9
	//  112  208:iload_2         
	//  113  209:iload           6
	//  114  211:iload           9
	//  115  213:iadd            
	//  116  214:iload           7
	//  117  216:iload_2         
	//  118  217:iadd            
	//  119  218:invokevirtual   #307 <Method void Rect.set(int, int, int, int)>
	//  120  221:return          
	}

	private int getKeyline(int i)
	{
		if(mKeylines == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #211 <Field int[] mKeylines>
	//*   2    4:ifnonnull       55
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    3    7:new             #377 <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #378 <Method void StringBuilder()>
	//    6   14:astore_2        
			stringbuilder.append("No keylines defined for ");
	//    7   15:aload_2         
	//    8   16:ldc2            #380 <String "No keylines defined for ">
	//    9   19:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   10   22:pop             
			stringbuilder.append(((Object) (this)));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #387 <Method StringBuilder StringBuilder.append(Object)>
	//   14   28:pop             
			stringbuilder.append(" - attempted index lookup ");
	//   15   29:aload_2         
	//   16   30:ldc2            #389 <String " - attempted index lookup ">
	//   17   33:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			stringbuilder.append(i);
	//   19   37:aload_2         
	//   20   38:iload_1         
	//   21   39:invokevirtual   #392 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
			Log.e("CoordinatorLayout", stringbuilder.toString());
	//   23   43:ldc1            #51  <String "CoordinatorLayout">
	//   24   45:aload_2         
	//   25   46:invokevirtual   #395 <Method String StringBuilder.toString()>
	//   26   49:invokestatic    #401 <Method int Log.e(String, String)>
	//   27   52:pop             
			return 0;
	//   28   53:iconst_0        
	//   29   54:ireturn         
		}
		if(i >= 0 && i < mKeylines.length)
	//*  30   55:iload_1         
	//*  31   56:iflt            78
	//*  32   59:iload_1         
	//*  33   60:aload_0         
	//*  34   61:getfield        #211 <Field int[] mKeylines>
	//*  35   64:arraylength     
	//*  36   65:icmplt          71
	//*  37   68:goto            78
		{
			return mKeylines[i];
	//   38   71:aload_0         
	//   39   72:getfield        #211 <Field int[] mKeylines>
	//   40   75:iload_1         
	//   41   76:iaload          
	//   42   77:ireturn         
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   43   78:new             #377 <Class StringBuilder>
	//   44   81:dup             
	//   45   82:invokespecial   #378 <Method void StringBuilder()>
	//   46   85:astore_2        
			stringbuilder1.append("Keyline index ");
	//   47   86:aload_2         
	//   48   87:ldc2            #403 <String "Keyline index ">
	//   49   90:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   50   93:pop             
			stringbuilder1.append(i);
	//   51   94:aload_2         
	//   52   95:iload_1         
	//   53   96:invokevirtual   #392 <Method StringBuilder StringBuilder.append(int)>
	//   54   99:pop             
			stringbuilder1.append(" out of range for ");
	//   55  100:aload_2         
	//   56  101:ldc2            #405 <String " out of range for ">
	//   57  104:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   58  107:pop             
			stringbuilder1.append(((Object) (this)));
	//   59  108:aload_2         
	//   60  109:aload_0         
	//   61  110:invokevirtual   #387 <Method StringBuilder StringBuilder.append(Object)>
	//   62  113:pop             
			Log.e("CoordinatorLayout", stringbuilder1.toString());
	//   63  114:ldc1            #51  <String "CoordinatorLayout">
	//   64  116:aload_2         
	//   65  117:invokevirtual   #395 <Method String StringBuilder.toString()>
	//   66  120:invokestatic    #401 <Method int Log.e(String, String)>
	//   67  123:pop             
			return 0;
	//   68  124:iconst_0        
	//   69  125:ireturn         
		}
	}

	private void getTopSortedChildren(List list)
	{
		list.clear();
	//    0    0:aload_1         
	//    1    1:invokeinterface #412 <Method void List.clear()>
		boolean flag = isChildrenDrawingOrderEnabled();
	//    2    6:aload_0         
	//    3    7:invokevirtual   #415 <Method boolean isChildrenDrawingOrderEnabled()>
	//    4   10:istore          5
		int k = getChildCount();
	//    5   12:aload_0         
	//    6   13:invokevirtual   #318 <Method int getChildCount()>
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
	//   19   36:invokevirtual   #418 <Method int getChildDrawingOrder(int, int)>
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
	//   27   48:invokevirtual   #322 <Method View getChildAt(int)>
	//   28   51:invokeinterface #422 <Method boolean List.add(Object)>
	//   29   56:pop             
		}

	//   30   57:iload_2         
	//   31   58:iconst_1        
	//   32   59:isub            
	//   33   60:istore_2        
	//*  34   61:goto            23
		if(TOP_SORTED_CHILDREN_COMPARATOR != null)
	//*  35   64:getstatic       #122 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//*  36   67:ifnull          77
			Collections.sort(list, TOP_SORTED_CHILDREN_COMPARATOR);
	//   37   70:aload_1         
	//   38   71:getstatic       #122 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//   39   74:invokestatic    #428 <Method void Collections.sort(List, Comparator)>
	//   40   77:return          
	}

	private boolean hasDependencies(View view)
	{
		return mChildDag.hasOutgoingEdges(((Object) (view)));
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #434 <Method boolean DirectedAcyclicGraph.hasOutgoingEdges(Object)>
	//    4    8:ireturn         
	}

	private void layoutChild(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		Rect rect = acquireTempRect();
	//    4    8:invokestatic    #438 <Method Rect acquireTempRect()>
	//    5   11:astore          4
		rect.set(getPaddingLeft() + layoutparams.leftMargin, getPaddingTop() + layoutparams.topMargin, getWidth() - getPaddingRight() - layoutparams.rightMargin, getHeight() - getPaddingBottom() - layoutparams.bottomMargin);
	//    6   13:aload           4
	//    7   15:aload_0         
	//    8   16:invokevirtual   #268 <Method int getPaddingLeft()>
	//    9   19:aload_3         
	//   10   20:getfield        #271 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   11   23:iadd            
	//   12   24:aload_0         
	//   13   25:invokevirtual   #291 <Method int getPaddingTop()>
	//   14   28:aload_3         
	//   15   29:getfield        #294 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   16   32:iadd            
	//   17   33:aload_0         
	//   18   34:invokevirtual   #262 <Method int getWidth()>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #277 <Method int getPaddingRight()>
	//   21   41:isub            
	//   22   42:aload_3         
	//   23   43:getfield        #280 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   24   46:isub            
	//   25   47:aload_0         
	//   26   48:invokevirtual   #265 <Method int getHeight()>
	//   27   51:aload_0         
	//   28   52:invokevirtual   #300 <Method int getPaddingBottom()>
	//   29   55:isub            
	//   30   56:aload_3         
	//   31   57:getfield        #303 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//   32   60:isub            
	//   33   61:invokevirtual   #307 <Method void Rect.set(int, int, int, int)>
		if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))) && !ViewCompat.getFitsSystemWindows(view))
	//*  34   64:aload_0         
	//*  35   65:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//*  36   68:ifnull          157
	//*  37   71:aload_0         
	//*  38   72:invokestatic    #328 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  39   75:ifeq            157
	//*  40   78:aload_1         
	//*  41   79:invokestatic    #328 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  42   82:ifne            157
		{
			rect.left = rect.left + mLastInsets.getSystemWindowInsetLeft();
	//   43   85:aload           4
	//   44   87:aload           4
	//   45   89:getfield        #274 <Field int Rect.left>
	//   46   92:aload_0         
	//   47   93:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//   48   96:invokevirtual   #443 <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//   49   99:iadd            
	//   50  100:putfield        #274 <Field int Rect.left>
			rect.top = rect.top + mLastInsets.getSystemWindowInsetTop();
	//   51  103:aload           4
	//   52  105:aload           4
	//   53  107:getfield        #297 <Field int Rect.top>
	//   54  110:aload_0         
	//   55  111:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//   56  114:invokevirtual   #446 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//   57  117:iadd            
	//   58  118:putfield        #297 <Field int Rect.top>
			rect.right = rect.right - mLastInsets.getSystemWindowInsetRight();
	//   59  121:aload           4
	//   60  123:aload           4
	//   61  125:getfield        #365 <Field int Rect.right>
	//   62  128:aload_0         
	//   63  129:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//   64  132:invokevirtual   #449 <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//   65  135:isub            
	//   66  136:putfield        #365 <Field int Rect.right>
			rect.bottom = rect.bottom - mLastInsets.getSystemWindowInsetBottom();
	//   67  139:aload           4
	//   68  141:aload           4
	//   69  143:getfield        #371 <Field int Rect.bottom>
	//   70  146:aload_0         
	//   71  147:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//   72  150:invokevirtual   #452 <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//   73  153:isub            
	//   74  154:putfield        #371 <Field int Rect.bottom>
		}
		Rect rect1 = acquireTempRect();
	//   75  157:invokestatic    #438 <Method Rect acquireTempRect()>
	//   76  160:astore          5
		GravityCompat.apply(resolveGravity(layoutparams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect1, i);
	//   77  162:aload_3         
	//   78  163:getfield        #347 <Field int CoordinatorLayout$LayoutParams.gravity>
	//   79  166:invokestatic    #362 <Method int resolveGravity(int)>
	//   80  169:aload_1         
	//   81  170:invokevirtual   #455 <Method int View.getMeasuredWidth()>
	//   82  173:aload_1         
	//   83  174:invokevirtual   #458 <Method int View.getMeasuredHeight()>
	//   84  177:aload           4
	//   85  179:aload           5
	//   86  181:iload_2         
	//   87  182:invokestatic    #462 <Method void GravityCompat.apply(int, int, int, Rect, Rect, int)>
		view.layout(rect1.left, rect1.top, rect1.right, rect1.bottom);
	//   88  185:aload_1         
	//   89  186:aload           5
	//   90  188:getfield        #274 <Field int Rect.left>
	//   91  191:aload           5
	//   92  193:getfield        #297 <Field int Rect.top>
	//   93  196:aload           5
	//   94  198:getfield        #365 <Field int Rect.right>
	//   95  201:aload           5
	//   96  203:getfield        #371 <Field int Rect.bottom>
	//   97  206:invokevirtual   #465 <Method void View.layout(int, int, int, int)>
		releaseTempRect(rect);
	//   98  209:aload           4
	//   99  211:invokestatic    #469 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect1);
	//  100  214:aload           5
	//  101  216:invokestatic    #469 <Method void releaseTempRect(Rect)>
	//  102  219:return          
	}

	private void layoutChildWithAnchor(View view, View view1, int i)
	{
		Object obj;
		Rect rect;
		obj = ((Object) ((LayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          4
		obj = ((Object) (acquireTempRect()));
	//    4    9:invokestatic    #438 <Method Rect acquireTempRect()>
	//    5   12:astore          4
		rect = acquireTempRect();
	//    6   14:invokestatic    #438 <Method Rect acquireTempRect()>
	//    7   17:astore          5
		getDescendantRect(view1, ((Rect) (obj)));
	//    8   19:aload_0         
	//    9   20:aload_2         
	//   10   21:aload           4
	//   11   23:invokevirtual   #475 <Method void getDescendantRect(View, Rect)>
		getDesiredAnchoredChildRect(view, i, ((Rect) (obj)), rect);
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:iload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokevirtual   #479 <Method void getDesiredAnchoredChildRect(View, int, Rect, Rect)>
		view.layout(rect.left, rect.top, rect.right, rect.bottom);
	//   18   36:aload_1         
	//   19   37:aload           5
	//   20   39:getfield        #274 <Field int Rect.left>
	//   21   42:aload           5
	//   22   44:getfield        #297 <Field int Rect.top>
	//   23   47:aload           5
	//   24   49:getfield        #365 <Field int Rect.right>
	//   25   52:aload           5
	//   26   54:getfield        #371 <Field int Rect.bottom>
	//   27   57:invokevirtual   #465 <Method void View.layout(int, int, int, int)>
		releaseTempRect(((Rect) (obj)));
	//   28   60:aload           4
	//   29   62:invokestatic    #469 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect);
	//   30   65:aload           5
	//   31   67:invokestatic    #469 <Method void releaseTempRect(Rect)>
		return;
	//   32   70:return          
		view;
	//   33   71:astore_1        
		releaseTempRect(((Rect) (obj)));
	//   34   72:aload           4
	//   35   74:invokestatic    #469 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect);
	//   36   77:aload           5
	//   37   79:invokestatic    #469 <Method void releaseTempRect(Rect)>
		throw view;
	//   38   82:aload_1         
	//   39   83:athrow          
	}

	private void layoutChildWithKeyline(View view, int i, int j)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          11
		int k = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), j);
	//    4    9:aload           11
	//    5   11:getfield        #347 <Field int CoordinatorLayout$LayoutParams.gravity>
	//    6   14:invokestatic    #484 <Method int resolveKeylineGravity(int)>
	//    7   17:iload_3         
	//    8   18:invokestatic    #356 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    9   21:istore          4
		int i2 = k & 7;
	//   10   23:iload           4
	//   11   25:bipush          7
	//   12   27:iand            
	//   13   28:istore          10
		int l1 = k & 0x70;
	//   14   30:iload           4
	//   15   32:bipush          112
	//   16   34:iand            
	//   17   35:istore          9
		int k1 = getWidth();
	//   18   37:aload_0         
	//   19   38:invokevirtual   #262 <Method int getWidth()>
	//   20   41:istore          8
		int j1 = getHeight();
	//   21   43:aload_0         
	//   22   44:invokevirtual   #265 <Method int getHeight()>
	//   23   47:istore          7
		int l = view.getMeasuredWidth();
	//   24   49:aload_1         
	//   25   50:invokevirtual   #455 <Method int View.getMeasuredWidth()>
	//   26   53:istore          5
		int i1 = view.getMeasuredHeight();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #458 <Method int View.getMeasuredHeight()>
	//   29   59:istore          6
		k = i;
	//   30   61:iload_2         
	//   31   62:istore          4
		if(j == 1)
	//*  32   64:iload_3         
	//*  33   65:iconst_1        
	//*  34   66:icmpne          75
			k = k1 - i;
	//   35   69:iload           8
	//   36   71:iload_2         
	//   37   72:isub            
	//   38   73:istore          4
		i = getKeyline(k) - l;
	//   39   75:aload_0         
	//   40   76:iload           4
	//   41   78:invokespecial   #486 <Method int getKeyline(int)>
	//   42   81:iload           5
	//   43   83:isub            
	//   44   84:istore_2        
		j = 0;
	//   45   85:iconst_0        
	//   46   86:istore_3        
		if(i2 != 1)
	//*  47   87:iload           10
	//*  48   89:iconst_1        
	//*  49   90:icmpeq          110
		{
			if(i2 == 5)
	//*  50   93:iload           10
	//*  51   95:iconst_5        
	//*  52   96:icmpeq          102
	//*  53   99:goto            117
				i += l;
	//   54  102:iload_2         
	//   55  103:iload           5
	//   56  105:iadd            
	//   57  106:istore_2        
		} else
	//*  58  107:goto            117
		{
			i += l / 2;
	//   59  110:iload_2         
	//   60  111:iload           5
	//   61  113:iconst_2        
	//   62  114:idiv            
	//   63  115:iadd            
	//   64  116:istore_2        
		}
		if(l1 != 16)
	//*  65  117:iload           9
	//*  66  119:bipush          16
	//*  67  121:icmpeq          142
		{
			if(l1 == 80)
	//*  68  124:iload           9
	//*  69  126:bipush          80
	//*  70  128:icmpeq          134
	//*  71  131:goto            149
				j = 0 + i1;
	//   72  134:iconst_0        
	//   73  135:iload           6
	//   74  137:iadd            
	//   75  138:istore_3        
		} else
	//*  76  139:goto            149
		{
			j = 0 + i1 / 2;
	//   77  142:iconst_0        
	//   78  143:iload           6
	//   79  145:iconst_2        
	//   80  146:idiv            
	//   81  147:iadd            
	//   82  148:istore_3        
		}
		i = Math.max(getPaddingLeft() + layoutparams.leftMargin, Math.min(i, k1 - getPaddingRight() - l - layoutparams.rightMargin));
	//   83  149:aload_0         
	//   84  150:invokevirtual   #268 <Method int getPaddingLeft()>
	//   85  153:aload           11
	//   86  155:getfield        #271 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//   87  158:iadd            
	//   88  159:iload_2         
	//   89  160:iload           8
	//   90  162:aload_0         
	//   91  163:invokevirtual   #277 <Method int getPaddingRight()>
	//   92  166:isub            
	//   93  167:iload           5
	//   94  169:isub            
	//   95  170:aload           11
	//   96  172:getfield        #280 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//   97  175:isub            
	//   98  176:invokestatic    #285 <Method int Math.min(int, int)>
	//   99  179:invokestatic    #288 <Method int Math.max(int, int)>
	//  100  182:istore_2        
		j = Math.max(getPaddingTop() + layoutparams.topMargin, Math.min(j, j1 - getPaddingBottom() - i1 - layoutparams.bottomMargin));
	//  101  183:aload_0         
	//  102  184:invokevirtual   #291 <Method int getPaddingTop()>
	//  103  187:aload           11
	//  104  189:getfield        #294 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//  105  192:iadd            
	//  106  193:iload_3         
	//  107  194:iload           7
	//  108  196:aload_0         
	//  109  197:invokevirtual   #300 <Method int getPaddingBottom()>
	//  110  200:isub            
	//  111  201:iload           6
	//  112  203:isub            
	//  113  204:aload           11
	//  114  206:getfield        #303 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//  115  209:isub            
	//  116  210:invokestatic    #285 <Method int Math.min(int, int)>
	//  117  213:invokestatic    #288 <Method int Math.max(int, int)>
	//  118  216:istore_3        
		view.layout(i, j, l + i, i1 + j);
	//  119  217:aload_1         
	//  120  218:iload_2         
	//  121  219:iload_3         
	//  122  220:iload           5
	//  123  222:iload_2         
	//  124  223:iadd            
	//  125  224:iload           6
	//  126  226:iload_3         
	//  127  227:iadd            
	//  128  228:invokevirtual   #465 <Method void View.layout(int, int, int, int)>
	//  129  231:return          
	}

	private void offsetChildByInset(View view, Rect rect, int i)
	{
label0:
		{
			int l;
			Rect rect1;
			LayoutParams layoutparams;
label1:
			{
				if(!ViewCompat.isLaidOut(view))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #491 <Method boolean ViewCompat.isLaidOut(View)>
	//*   2    4:ifne            8
					return;
	//    3    7:return          
				if(view.getWidth() <= 0)
					break label0;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #492 <Method int View.getWidth()>
	//    6   12:ifle            450
				if(view.getHeight() <= 0)
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #493 <Method int View.getHeight()>
	//*   9   19:ifgt            23
					return;
	//   10   22:return          
				layoutparams = (LayoutParams)view.getLayoutParams();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   13   27:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   14   30:astore          9
				Behavior behavior = layoutparams.getBehavior();
	//   15   32:aload           9
	//   16   34:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   17   37:astore          10
				rect1 = acquireTempRect();
	//   18   39:invokestatic    #438 <Method Rect acquireTempRect()>
	//   19   42:astore          7
				Rect rect2 = acquireTempRect();
	//   20   44:invokestatic    #438 <Method Rect acquireTempRect()>
	//   21   47:astore          8
				rect2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   22   49:aload           8
	//   23   51:aload_1         
	//   24   52:invokevirtual   #496 <Method int View.getLeft()>
	//   25   55:aload_1         
	//   26   56:invokevirtual   #499 <Method int View.getTop()>
	//   27   59:aload_1         
	//   28   60:invokevirtual   #502 <Method int View.getRight()>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #505 <Method int View.getBottom()>
	//   31   67:invokevirtual   #307 <Method void Rect.set(int, int, int, int)>
				if(behavior != null && behavior.getInsetDodgeRect(this, view, rect1))
	//*  32   70:aload           10
	//*  33   72:ifnull          153
	//*  34   75:aload           10
	//*  35   77:aload_0         
	//*  36   78:aload_1         
	//*  37   79:aload           7
	//*  38   81:invokevirtual   #509 <Method boolean CoordinatorLayout$Behavior.getInsetDodgeRect(CoordinatorLayout, View, Rect)>
	//*  39   84:ifeq            153
				{
					if(!rect2.contains(rect1))
	//*  40   87:aload           8
	//*  41   89:aload           7
	//*  42   91:invokevirtual   #513 <Method boolean Rect.contains(Rect)>
	//*  43   94:ifne            160
					{
						view = ((View) (new StringBuilder()));
	//   44   97:new             #377 <Class StringBuilder>
	//   45  100:dup             
	//   46  101:invokespecial   #378 <Method void StringBuilder()>
	//   47  104:astore_1        
						((StringBuilder) (view)).append("Rect should be within the child's bounds. Rect:");
	//   48  105:aload_1         
	//   49  106:ldc2            #515 <String "Rect should be within the child's bounds. Rect:">
	//   50  109:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   51  112:pop             
						((StringBuilder) (view)).append(rect1.toShortString());
	//   52  113:aload_1         
	//   53  114:aload           7
	//   54  116:invokevirtual   #518 <Method String Rect.toShortString()>
	//   55  119:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   56  122:pop             
						((StringBuilder) (view)).append(" | Bounds:");
	//   57  123:aload_1         
	//   58  124:ldc2            #520 <String " | Bounds:">
	//   59  127:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   60  130:pop             
						((StringBuilder) (view)).append(rect2.toShortString());
	//   61  131:aload_1         
	//   62  132:aload           8
	//   63  134:invokevirtual   #518 <Method String Rect.toShortString()>
	//   64  137:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   65  140:pop             
						throw new IllegalArgumentException(((StringBuilder) (view)).toString());
	//   66  141:new             #522 <Class IllegalArgumentException>
	//   67  144:dup             
	//   68  145:aload_1         
	//   69  146:invokevirtual   #395 <Method String StringBuilder.toString()>
	//   70  149:invokespecial   #525 <Method void IllegalArgumentException(String)>
	//   71  152:athrow          
					}
				} else
				{
					rect1.set(rect2);
	//   72  153:aload           7
	//   73  155:aload           8
	//   74  157:invokevirtual   #527 <Method void Rect.set(Rect)>
				}
				releaseTempRect(rect2);
	//   75  160:aload           8
	//   76  162:invokestatic    #469 <Method void releaseTempRect(Rect)>
				if(rect1.isEmpty())
	//*  77  165:aload           7
	//*  78  167:invokevirtual   #530 <Method boolean Rect.isEmpty()>
	//*  79  170:ifeq            179
				{
					releaseTempRect(rect1);
	//   80  173:aload           7
	//   81  175:invokestatic    #469 <Method void releaseTempRect(Rect)>
					return;
	//   82  178:return          
				}
				l = GravityCompat.getAbsoluteGravity(layoutparams.dodgeInsetEdges, i);
	//   83  179:aload           9
	//   84  181:getfield        #533 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//   85  184:iload_3         
	//   86  185:invokestatic    #356 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   87  188:istore          5
				if((l & 0x30) == 48)
	//*  88  190:iload           5
	//*  89  192:bipush          48
	//*  90  194:iand            
	//*  91  195:bipush          48
	//*  92  197:icmpne          242
				{
					i = rect1.top - layoutparams.topMargin - layoutparams.mInsetOffsetY;
	//   93  200:aload           7
	//   94  202:getfield        #297 <Field int Rect.top>
	//   95  205:aload           9
	//   96  207:getfield        #294 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//   97  210:isub            
	//   98  211:aload           9
	//   99  213:getfield        #536 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//  100  216:isub            
	//  101  217:istore_3        
					if(i < rect.top)
	//* 102  218:iload_3         
	//* 103  219:aload_2         
	//* 104  220:getfield        #297 <Field int Rect.top>
	//* 105  223:icmpge          242
					{
						setInsetOffsetY(view, rect.top - i);
	//  106  226:aload_0         
	//  107  227:aload_1         
	//  108  228:aload_2         
	//  109  229:getfield        #297 <Field int Rect.top>
	//  110  232:iload_3         
	//  111  233:isub            
	//  112  234:invokespecial   #539 <Method void setInsetOffsetY(View, int)>
						i = 1;
	//  113  237:iconst_1        
	//  114  238:istore_3        
						break label1;
	//  115  239:goto            244
					}
				}
				i = 0;
	//  116  242:iconst_0        
	//  117  243:istore_3        
			}
label2:
			{
				int j = i;
	//  118  244:iload_3         
	//  119  245:istore          4
				if((l & 0x50) == 80)
	//* 120  247:iload           5
	//* 121  249:bipush          80
	//* 122  251:iand            
	//* 123  252:bipush          80
	//* 124  254:icmpne          308
				{
					int j1 = (getHeight() - rect1.bottom - layoutparams.bottomMargin) + layoutparams.mInsetOffsetY;
	//  125  257:aload_0         
	//  126  258:invokevirtual   #265 <Method int getHeight()>
	//  127  261:aload           7
	//  128  263:getfield        #371 <Field int Rect.bottom>
	//  129  266:isub            
	//  130  267:aload           9
	//  131  269:getfield        #303 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//  132  272:isub            
	//  133  273:aload           9
	//  134  275:getfield        #536 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//  135  278:iadd            
	//  136  279:istore          6
					j = i;
	//  137  281:iload_3         
	//  138  282:istore          4
					if(j1 < rect.bottom)
	//* 139  284:iload           6
	//* 140  286:aload_2         
	//* 141  287:getfield        #371 <Field int Rect.bottom>
	//* 142  290:icmpge          308
					{
						setInsetOffsetY(view, j1 - rect.bottom);
	//  143  293:aload_0         
	//  144  294:aload_1         
	//  145  295:iload           6
	//  146  297:aload_2         
	//  147  298:getfield        #371 <Field int Rect.bottom>
	//  148  301:isub            
	//  149  302:invokespecial   #539 <Method void setInsetOffsetY(View, int)>
						j = 1;
	//  150  305:iconst_1        
	//  151  306:istore          4
					}
				}
				if(j == 0)
	//* 152  308:iload           4
	//* 153  310:ifne            319
					setInsetOffsetY(view, 0);
	//  154  313:aload_0         
	//  155  314:aload_1         
	//  156  315:iconst_0        
	//  157  316:invokespecial   #539 <Method void setInsetOffsetY(View, int)>
				if((l & 3) == 3)
	//* 158  319:iload           5
	//* 159  321:iconst_3        
	//* 160  322:iand            
	//* 161  323:iconst_3        
	//* 162  324:icmpne          369
				{
					i = rect1.left - layoutparams.leftMargin - layoutparams.mInsetOffsetX;
	//  163  327:aload           7
	//  164  329:getfield        #274 <Field int Rect.left>
	//  165  332:aload           9
	//  166  334:getfield        #271 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//  167  337:isub            
	//  168  338:aload           9
	//  169  340:getfield        #542 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//  170  343:isub            
	//  171  344:istore_3        
					if(i < rect.left)
	//* 172  345:iload_3         
	//* 173  346:aload_2         
	//* 174  347:getfield        #274 <Field int Rect.left>
	//* 175  350:icmpge          369
					{
						setInsetOffsetX(view, rect.left - i);
	//  176  353:aload_0         
	//  177  354:aload_1         
	//  178  355:aload_2         
	//  179  356:getfield        #274 <Field int Rect.left>
	//  180  359:iload_3         
	//  181  360:isub            
	//  182  361:invokespecial   #545 <Method void setInsetOffsetX(View, int)>
						i = 1;
	//  183  364:iconst_1        
	//  184  365:istore_3        
						break label2;
	//  185  366:goto            371
					}
				}
				i = 0;
	//  186  369:iconst_0        
	//  187  370:istore_3        
			}
			int k = i;
	//  188  371:iload_3         
	//  189  372:istore          4
			if((l & 5) == 5)
	//* 190  374:iload           5
	//* 191  376:iconst_5        
	//* 192  377:iand            
	//* 193  378:iconst_5        
	//* 194  379:icmpne          433
			{
				int i1 = (getWidth() - rect1.right - layoutparams.rightMargin) + layoutparams.mInsetOffsetX;
	//  195  382:aload_0         
	//  196  383:invokevirtual   #262 <Method int getWidth()>
	//  197  386:aload           7
	//  198  388:getfield        #365 <Field int Rect.right>
	//  199  391:isub            
	//  200  392:aload           9
	//  201  394:getfield        #280 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//  202  397:isub            
	//  203  398:aload           9
	//  204  400:getfield        #542 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//  205  403:iadd            
	//  206  404:istore          5
				k = i;
	//  207  406:iload_3         
	//  208  407:istore          4
				if(i1 < rect.right)
	//* 209  409:iload           5
	//* 210  411:aload_2         
	//* 211  412:getfield        #365 <Field int Rect.right>
	//* 212  415:icmpge          433
				{
					setInsetOffsetX(view, i1 - rect.right);
	//  213  418:aload_0         
	//  214  419:aload_1         
	//  215  420:iload           5
	//  216  422:aload_2         
	//  217  423:getfield        #365 <Field int Rect.right>
	//  218  426:isub            
	//  219  427:invokespecial   #545 <Method void setInsetOffsetX(View, int)>
					k = 1;
	//  220  430:iconst_1        
	//  221  431:istore          4
				}
			}
			if(k == 0)
	//* 222  433:iload           4
	//* 223  435:ifne            444
				setInsetOffsetX(view, 0);
	//  224  438:aload_0         
	//  225  439:aload_1         
	//  226  440:iconst_0        
	//  227  441:invokespecial   #545 <Method void setInsetOffsetX(View, int)>
			releaseTempRect(rect1);
	//  228  444:aload           7
	//  229  446:invokestatic    #469 <Method void releaseTempRect(Rect)>
			return;
	//  230  449:return          
		}
	//  231  450:return          
	}

	static Behavior parseBehavior(Context context, AttributeSet attributeset, String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #554 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		Object obj;
		if(s.startsWith("."))
	//*   5    9:aload_2         
	//*   6   10:ldc2            #556 <String ".">
	//*   7   13:invokevirtual   #562 <Method boolean String.startsWith(String)>
	//*   8   16:ifeq            50
		{
			obj = ((Object) (new StringBuilder()));
	//    9   19:new             #377 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #378 <Method void StringBuilder()>
	//   12   26:astore_3        
			((StringBuilder) (obj)).append(context.getPackageName());
	//   13   27:aload_3         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #565 <Method String Context.getPackageName()>
	//   16   32:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
			((StringBuilder) (obj)).append(s);
	//   18   36:aload_3         
	//   19   37:aload_2         
	//   20   38:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   22   42:aload_3         
	//   23   43:invokevirtual   #395 <Method String StringBuilder.toString()>
	//   24   46:astore_3        
		} else
	//*  25   47:goto            109
		if(s.indexOf('.') >= 0)
	//*  26   50:aload_2         
	//*  27   51:bipush          46
	//*  28   53:invokevirtual   #568 <Method int String.indexOf(int)>
	//*  29   56:iflt            64
		{
			obj = ((Object) (s));
	//   30   59:aload_2         
	//   31   60:astore_3        
		} else
	//*  32   61:goto            109
		{
			obj = ((Object) (s));
	//   33   64:aload_2         
	//   34   65:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (WIDGET_PACKAGE_NAME))))
	//*  35   66:getstatic       #112 <Field String WIDGET_PACKAGE_NAME>
	//*  36   69:invokestatic    #554 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   72:ifne            109
			{
				obj = ((Object) (new StringBuilder()));
	//   38   75:new             #377 <Class StringBuilder>
	//   39   78:dup             
	//   40   79:invokespecial   #378 <Method void StringBuilder()>
	//   41   82:astore_3        
				((StringBuilder) (obj)).append(WIDGET_PACKAGE_NAME);
	//   42   83:aload_3         
	//   43   84:getstatic       #112 <Field String WIDGET_PACKAGE_NAME>
	//   44   87:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
				((StringBuilder) (obj)).append('.');
	//   46   91:aload_3         
	//   47   92:bipush          46
	//   48   94:invokevirtual   #571 <Method StringBuilder StringBuilder.append(char)>
	//   49   97:pop             
				((StringBuilder) (obj)).append(s);
	//   50   98:aload_3         
	//   51   99:aload_2         
	//   52  100:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   53  103:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   54  104:aload_3         
	//   55  105:invokevirtual   #395 <Method String StringBuilder.toString()>
	//   56  108:astore_3        
			}
		}
		Object obj1;
		Constructor constructor;
		try
		{
			obj1 = ((Object) ((Map)sConstructors.get()));
	//   57  109:getstatic       #133 <Field ThreadLocal sConstructors>
	//   58  112:invokevirtual   #574 <Method Object ThreadLocal.get()>
	//   59  115:checkcast       #576 <Class Map>
	//   60  118:astore          4
		}
	//*  61  120:aload           4
	//*  62  122:astore_2        
	//*  63  123:aload           4
	//*  64  125:ifnonnull       143
	//*  65  128:new             #578 <Class HashMap>
	//*  66  131:dup             
	//*  67  132:invokespecial   #579 <Method void HashMap()>
	//*  68  135:astore_2        
	//*  69  136:getstatic       #133 <Field ThreadLocal sConstructors>
	//*  70  139:aload_2         
	//*  71  140:invokevirtual   #582 <Method void ThreadLocal.set(Object)>
	//*  72  143:aload_2         
	//*  73  144:aload_3         
	//*  74  145:invokeinterface #585 <Method Object Map.get(Object)>
	//*  75  150:checkcast       #587 <Class Constructor>
	//*  76  153:astore          5
	//*  77  155:aload           5
	//*  78  157:astore          4
	//*  79  159:aload           5
	//*  80  161:ifnonnull       196
	//*  81  164:aload_0         
	//*  82  165:invokevirtual   #591 <Method ClassLoader Context.getClassLoader()>
	//*  83  168:aload_3         
	//*  84  169:invokevirtual   #597 <Method Class ClassLoader.loadClass(String)>
	//*  85  172:getstatic       #128 <Field Class[] CONSTRUCTOR_PARAMS>
	//*  86  175:invokevirtual   #601 <Method Constructor Class.getConstructor(Class[])>
	//*  87  178:astore          4
	//*  88  180:aload           4
	//*  89  182:iconst_1        
	//*  90  183:invokevirtual   #605 <Method void Constructor.setAccessible(boolean)>
	//*  91  186:aload_2         
	//*  92  187:aload_3         
	//*  93  188:aload           4
	//*  94  190:invokeinterface #609 <Method Object Map.put(Object, Object)>
	//*  95  195:pop             
	//*  96  196:aload           4
	//*  97  198:iconst_2        
	//*  98  199:anewarray       Object[]
	//*  99  202:dup             
	//* 100  203:iconst_0        
	//* 101  204:aload_0         
	//* 102  205:aastore         
	//* 103  206:dup             
	//* 104  207:iconst_1        
	//* 105  208:aload_1         
	//* 106  209:aastore         
	//* 107  210:invokevirtual   #615 <Method Object Constructor.newInstance(Object[])>
	//* 108  213:checkcast       #13  <Class CoordinatorLayout$Behavior>
	//* 109  216:astore_0        
	//* 110  217:aload_0         
	//* 111  218:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//* 112  219:astore_0        
		{
			attributeset = ((AttributeSet) (new StringBuilder()));
	//  113  220:new             #377 <Class StringBuilder>
	//  114  223:dup             
	//  115  224:invokespecial   #378 <Method void StringBuilder()>
	//  116  227:astore_1        
			((StringBuilder) (attributeset)).append("Could not inflate Behavior subclass ");
	//  117  228:aload_1         
	//  118  229:ldc2            #617 <String "Could not inflate Behavior subclass ">
	//  119  232:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//  120  235:pop             
			((StringBuilder) (attributeset)).append(((String) (obj)));
	//  121  236:aload_1         
	//  122  237:aload_3         
	//  123  238:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//  124  241:pop             
			throw new RuntimeException(((StringBuilder) (attributeset)).toString(), ((Throwable) (context)));
	//  125  242:new             #619 <Class RuntimeException>
	//  126  245:dup             
	//  127  246:aload_1         
	//  128  247:invokevirtual   #395 <Method String StringBuilder.toString()>
	//  129  250:aload_0         
	//  130  251:invokespecial   #622 <Method void RuntimeException(String, Throwable)>
	//  131  254:athrow          
		}
		s = ((String) (obj1));
		if(obj1 != null)
			break MISSING_BLOCK_LABEL_143;
		s = ((String) (new HashMap()));
		sConstructors.set(((Object) (s)));
		constructor = (Constructor)((Map) (s)).get(obj);
		obj1 = ((Object) (constructor));
		if(constructor != null)
			break MISSING_BLOCK_LABEL_196;
		obj1 = ((Object) (context.getClassLoader().loadClass(((String) (obj))).getConstructor(CONSTRUCTOR_PARAMS)));
		((Constructor) (obj1)).setAccessible(true);
		((Map) (s)).put(obj, obj1);
		context = ((Context) ((Behavior)((Constructor) (obj1)).newInstance(new Object[] {
			context, attributeset
		})));
		return ((Behavior) (context));
	}

	private boolean performIntercept(MotionEvent motionevent, int i)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #619 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #626 <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:296)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #629 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void prepareChildren()
	{
		mDependencySortedChildren.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field List mDependencySortedChildren>
	//    2    4:invokeinterface #412 <Method void List.clear()>
		mChildDag.clear();
	//    3    9:aload_0         
	//    4   10:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//    5   13:invokevirtual   #631 <Method void DirectedAcyclicGraph.clear()>
		int k = getChildCount();
	//    6   16:aload_0         
	//    7   17:invokevirtual   #318 <Method int getChildCount()>
	//    8   20:istore_3        
		for(int i = 0; i < k; i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_1        
	//*  11   23:iload_1         
	//*  12   24:iload_3         
	//*  13   25:icmpge          142
		{
			View view = getChildAt(i);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokevirtual   #322 <Method View getChildAt(int)>
	//   17   33:astore          4
			LayoutParams layoutparams = getResolvedLayoutParams(view);
	//   18   35:aload_0         
	//   19   36:aload           4
	//   20   38:invokevirtual   #635 <Method CoordinatorLayout$LayoutParams getResolvedLayoutParams(View)>
	//   21   41:astore          5
			layoutparams.findAnchorView(this, view);
	//   22   43:aload           5
	//   23   45:aload_0         
	//   24   46:aload           4
	//   25   48:invokevirtual   #639 <Method View CoordinatorLayout$LayoutParams.findAnchorView(CoordinatorLayout, View)>
	//   26   51:pop             
			mChildDag.addNode(((Object) (view)));
	//   27   52:aload_0         
	//   28   53:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//   29   56:aload           4
	//   30   58:invokevirtual   #642 <Method void DirectedAcyclicGraph.addNode(Object)>
			for(int j = 0; j < k; j++)
	//*  31   61:iconst_0        
	//*  32   62:istore_2        
	//*  33   63:iload_2         
	//*  34   64:iload_3         
	//*  35   65:icmpge          135
			{
				if(j == i)
	//*  36   68:iload_2         
	//*  37   69:iload_1         
	//*  38   70:icmpne          76
					continue;
	//   39   73:goto            128
				View view1 = getChildAt(j);
	//   40   76:aload_0         
	//   41   77:iload_2         
	//   42   78:invokevirtual   #322 <Method View getChildAt(int)>
	//   43   81:astore          6
				if(!layoutparams.dependsOn(this, view, view1))
					continue;
	//   44   83:aload           5
	//   45   85:aload_0         
	//   46   86:aload           4
	//   47   88:aload           6
	//   48   90:invokevirtual   #646 <Method boolean CoordinatorLayout$LayoutParams.dependsOn(CoordinatorLayout, View, View)>
	//   49   93:ifeq            128
				if(!mChildDag.contains(((Object) (view1))))
	//*  50   96:aload_0         
	//*  51   97:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//*  52  100:aload           6
	//*  53  102:invokevirtual   #648 <Method boolean DirectedAcyclicGraph.contains(Object)>
	//*  54  105:ifne            117
					mChildDag.addNode(((Object) (view1)));
	//   55  108:aload_0         
	//   56  109:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//   57  112:aload           6
	//   58  114:invokevirtual   #642 <Method void DirectedAcyclicGraph.addNode(Object)>
				mChildDag.addEdge(((Object) (view1)), ((Object) (view)));
	//   59  117:aload_0         
	//   60  118:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//   61  121:aload           6
	//   62  123:aload           4
	//   63  125:invokevirtual   #652 <Method void DirectedAcyclicGraph.addEdge(Object, Object)>
			}

	//   64  128:iload_2         
	//   65  129:iconst_1        
	//   66  130:iadd            
	//   67  131:istore_2        
		}

	//   68  132:goto            63
	//   69  135:iload_1         
	//   70  136:iconst_1        
	//   71  137:iadd            
	//   72  138:istore_1        
	//*  73  139:goto            23
		mDependencySortedChildren.addAll(((java.util.Collection) (mChildDag.getSortedList())));
	//   74  142:aload_0         
	//   75  143:getfield        #159 <Field List mDependencySortedChildren>
	//   76  146:aload_0         
	//   77  147:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//   78  150:invokevirtual   #656 <Method ArrayList DirectedAcyclicGraph.getSortedList()>
	//   79  153:invokeinterface #660 <Method boolean List.addAll(java.util.Collection)>
	//   80  158:pop             
		Collections.reverse(mDependencySortedChildren);
	//   81  159:aload_0         
	//   82  160:getfield        #159 <Field List mDependencySortedChildren>
	//   83  163:invokestatic    #663 <Method void Collections.reverse(List)>
	//   84  166:return          
	}

	private static void releaseTempRect(Rect rect)
	{
		rect.setEmpty();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #666 <Method void Rect.setEmpty()>
		sRectPool.release(((Object) (rect)));
	//    2    4:getstatic       #140 <Field android.support.v4.util.Pools$Pool sRectPool>
	//    3    7:aload_0         
	//    4    8:invokeinterface #669 <Method boolean android.support.v4.util.Pools$Pool.release(Object)>
	//    5   13:pop             
	//    6   14:return          
	}

	private void resetTouchBehaviors(boolean flag)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method int getChildCount()>
	//    2    4:istore_3        
		for(int i = 0; i < k; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          96
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:invokevirtual   #322 <Method View getChildAt(int)>
	//   11   17:astore          6
			Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//   12   19:aload           6
	//   13   21:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   14   24:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   15   27:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   16   30:astore          7
			if(behavior == null)
				continue;
	//   17   32:aload           7
	//   18   34:ifnull          89
			long l = SystemClock.uptimeMillis();
	//   19   37:invokestatic    #677 <Method long SystemClock.uptimeMillis()>
	//   20   40:lstore          4
			MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   21   42:lload           4
	//   22   44:lload           4
	//   23   46:iconst_3        
	//   24   47:fconst_0        
	//   25   48:fconst_0        
	//   26   49:iconst_0        
	//   27   50:invokestatic    #683 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   28   53:astore          8
			if(flag)
	//*  29   55:iload_1         
	//*  30   56:ifeq            73
				behavior.onInterceptTouchEvent(this, view, motionevent);
	//   31   59:aload           7
	//   32   61:aload_0         
	//   33   62:aload           6
	//   34   64:aload           8
	//   35   66:invokevirtual   #687 <Method boolean CoordinatorLayout$Behavior.onInterceptTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   36   69:pop             
			else
	//*  37   70:goto            84
				behavior.onTouchEvent(this, view, motionevent);
	//   38   73:aload           7
	//   39   75:aload_0         
	//   40   76:aload           6
	//   41   78:aload           8
	//   42   80:invokevirtual   #690 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   43   83:pop             
			motionevent.recycle();
	//   44   84:aload           8
	//   45   86:invokevirtual   #691 <Method void MotionEvent.recycle()>
		}

	//   46   89:iload_2         
	//   47   90:iconst_1        
	//   48   91:iadd            
	//   49   92:istore_2        
	//*  50   93:goto            7
		for(int j = 0; j < k; j++)
	//*  51   96:iconst_0        
	//*  52   97:istore_2        
	//*  53   98:iload_2         
	//*  54   99:iload_3         
	//*  55  100:icmpge          124
			((LayoutParams)getChildAt(j).getLayoutParams()).resetTouchBehaviorTracking();
	//   56  103:aload_0         
	//   57  104:iload_2         
	//   58  105:invokevirtual   #322 <Method View getChildAt(int)>
	//   59  108:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   60  111:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   61  114:invokevirtual   #694 <Method void CoordinatorLayout$LayoutParams.resetTouchBehaviorTracking()>

	//   62  117:iload_2         
	//   63  118:iconst_1        
	//   64  119:iadd            
	//   65  120:istore_2        
	//*  66  121:goto            98
		mBehaviorTouchView = null;
	//   67  124:aload_0         
	//   68  125:aconst_null     
	//   69  126:putfield        #696 <Field View mBehaviorTouchView>
		mDisallowInterceptReset = false;
	//   70  129:aload_0         
	//   71  130:iconst_0        
	//   72  131:putfield        #698 <Field boolean mDisallowInterceptReset>
	//   73  134:return          
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
	//    7   10:ldc2            #699 <Int 0x800003>
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
		int j = i;
	//    0    0:iload_0         
	//    1    1:istore_1        
		if(i == 0)
	//*   2    2:iload_0         
	//*   3    3:ifne            10
			j = 0x800035;
	//    4    6:ldc2            #700 <Int 0x800035>
	//    5    9:istore_1        
		return j;
	//    6   10:iload_1         
	//    7   11:ireturn         
	}

	private void setInsetOffsetX(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.mInsetOffsetX != i)
	//*   4    8:aload_3         
	//*   5    9:getfield        #542 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ViewCompat.offsetLeftAndRight(view, i - layoutparams.mInsetOffsetX);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #542 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
	//   12   22:isub            
	//   13   23:invokestatic    #703 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			layoutparams.mInsetOffsetX = i;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #542 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetX>
		}
	//   17   31:return          
	}

	private void setInsetOffsetY(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.mInsetOffsetY != i)
	//*   4    8:aload_3         
	//*   5    9:getfield        #536 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//*   6   12:iload_2         
	//*   7   13:icmpeq          31
		{
			ViewCompat.offsetTopAndBottom(view, i - layoutparams.mInsetOffsetY);
	//    8   16:aload_1         
	//    9   17:iload_2         
	//   10   18:aload_3         
	//   11   19:getfield        #536 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
	//   12   22:isub            
	//   13   23:invokestatic    #706 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			layoutparams.mInsetOffsetY = i;
	//   14   26:aload_3         
	//   15   27:iload_2         
	//   16   28:putfield        #536 <Field int CoordinatorLayout$LayoutParams.mInsetOffsetY>
		}
	//   17   31:return          
	}

	private void setupForInsets()
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #117 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          9
			return;
	//    3    8:return          
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//*   4    9:aload_0         
	//*   5   10:invokestatic    #328 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*   6   13:ifeq            51
		{
			if(mApplyWindowInsetsListener == null)
	//*   7   16:aload_0         
	//*   8   17:getfield        #708 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
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
	//   14   29:invokespecial   #709 <Method void CoordinatorLayout$1(CoordinatorLayout)>
	//   15   32:putfield        #708 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
			ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), mApplyWindowInsetsListener);
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:getfield        #708 <Field OnApplyWindowInsetsListener mApplyWindowInsetsListener>
	//   19   40:invokestatic    #713 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			setSystemUiVisibility(1280);
	//   20   43:aload_0         
	//   21   44:sipush          1280
	//   22   47:invokevirtual   #716 <Method void setSystemUiVisibility(int)>
			return;
	//   23   50:return          
		} else
		{
			ViewCompat.setOnApplyWindowInsetsListener(((View) (this)), ((OnApplyWindowInsetsListener) (null)));
	//   24   51:aload_0         
	//   25   52:aconst_null     
	//   26   53:invokestatic    #713 <Method void ViewCompat.setOnApplyWindowInsetsListener(View, OnApplyWindowInsetsListener)>
			return;
	//   27   56:return          
		}
	}

	void addPreDrawListener()
	{
		if(mIsAttachedToWindow)
	//*   0    0:aload_0         
	//*   1    1:getfield        #719 <Field boolean mIsAttachedToWindow>
	//*   2    4:ifeq            37
		{
			if(mOnPreDrawListener == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*   5   11:ifnonnull       26
				mOnPreDrawListener = new OnPreDrawListener();
	//    6   14:aload_0         
	//    7   15:new             #28  <Class CoordinatorLayout$OnPreDrawListener>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #722 <Method void CoordinatorLayout$OnPreDrawListener(CoordinatorLayout)>
	//   11   23:putfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   12   26:aload_0         
	//   13   27:invokevirtual   #726 <Method ViewTreeObserver getViewTreeObserver()>
	//   14   30:aload_0         
	//   15   31:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   16   34:invokevirtual   #732 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		mNeedsPreDrawListener = true;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #734 <Field boolean mNeedsPreDrawListener>
	//   20   42:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #25  <Class CoordinatorLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #738 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    1    1:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #744 <Method List DirectedAcyclicGraph.getIncomingEdges(Object)>
	//    4    8:astore_3        
		if(list != null && !list.isEmpty())
	//*   5    9:aload_3         
	//*   6   10:ifnull          81
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #745 <Method boolean List.isEmpty()>
	//*   9   19:ifne            81
		{
			for(int i = 0; i < list.size(); i++)
	//*  10   22:iconst_0        
	//*  11   23:istore_2        
	//*  12   24:iload_2         
	//*  13   25:aload_3         
	//*  14   26:invokeinterface #748 <Method int List.size()>
	//*  15   31:icmpge          81
			{
				View view1 = (View)list.get(i);
	//   16   34:aload_3         
	//   17   35:iload_2         
	//   18   36:invokeinterface #751 <Method Object List.get(int)>
	//   19   41:checkcast       #330 <Class View>
	//   20   44:astore          4
				Behavior behavior = ((LayoutParams)view1.getLayoutParams()).getBehavior();
	//   21   46:aload           4
	//   22   48:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   51:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   24   54:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   25   57:astore          5
				if(behavior != null)
	//*  26   59:aload           5
	//*  27   61:ifnull          74
					behavior.onDependentViewChanged(this, view1, view);
	//   28   64:aload           5
	//   29   66:aload_0         
	//   30   67:aload           4
	//   31   69:aload_1         
	//   32   70:invokevirtual   #754 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
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
		boolean flag1;
		Rect rect;
		int i = view.getVisibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #759 <Method int View.getVisibility()>
	//    2    4:istore_3        
		flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          6
		if(i != 0 || view1.getVisibility() != 0)
			break MISSING_BLOCK_LABEL_176;
	//    5    8:iload_3         
	//    6    9:ifne            176
	//    7   12:aload_2         
	//    8   13:invokevirtual   #759 <Method int View.getVisibility()>
	//    9   16:ifne            176
		rect = acquireTempRect();
	//   10   19:invokestatic    #438 <Method Rect acquireTempRect()>
	//   11   22:astore          7
		if(view.getParent() != this)
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #763 <Method ViewParent View.getParent()>
	//*  14   28:aload_0         
	//*  15   29:if_acmpeq       38
			flag = true;
	//   16   32:iconst_1        
	//   17   33:istore          5
		else
	//*  18   35:goto            41
			flag = false;
	//   19   38:iconst_0        
	//   20   39:istore          5
		getChildRect(view, flag, rect);
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:iload           5
	//   24   45:aload           7
	//   25   47:invokevirtual   #767 <Method void getChildRect(View, boolean, Rect)>
		view = ((View) (acquireTempRect()));
	//   26   50:invokestatic    #438 <Method Rect acquireTempRect()>
	//   27   53:astore_1        
		if(view1.getParent() != this)
	//*  28   54:aload_2         
	//*  29   55:invokevirtual   #763 <Method ViewParent View.getParent()>
	//*  30   58:aload_0         
	//*  31   59:if_acmpeq       68
			flag = true;
	//   32   62:iconst_1        
	//   33   63:istore          5
		else
	//*  34   65:goto            71
			flag = false;
	//   35   68:iconst_0        
	//   36   69:istore          5
		getChildRect(view1, flag, ((Rect) (view)));
	//   37   71:aload_0         
	//   38   72:aload_2         
	//   39   73:iload           5
	//   40   75:aload_1         
	//   41   76:invokevirtual   #767 <Method void getChildRect(View, boolean, Rect)>
		flag = flag1;
	//   42   79:iload           6
	//   43   81:istore          5
		if(rect.left > ((Rect) (view)).right)
			break MISSING_BLOCK_LABEL_152;
	//   44   83:aload           7
	//   45   85:getfield        #274 <Field int Rect.left>
	//   46   88:aload_1         
	//   47   89:getfield        #365 <Field int Rect.right>
	//   48   92:icmpgt          152
		flag = flag1;
	//   49   95:iload           6
	//   50   97:istore          5
		if(rect.top > ((Rect) (view)).bottom)
			break MISSING_BLOCK_LABEL_152;
	//   51   99:aload           7
	//   52  101:getfield        #297 <Field int Rect.top>
	//   53  104:aload_1         
	//   54  105:getfield        #371 <Field int Rect.bottom>
	//   55  108:icmpgt          152
		flag = flag1;
	//   56  111:iload           6
	//   57  113:istore          5
		int j;
		int k;
		if(rect.right < ((Rect) (view)).left)
			break MISSING_BLOCK_LABEL_152;
	//   58  115:aload           7
	//   59  117:getfield        #365 <Field int Rect.right>
	//   60  120:aload_1         
	//   61  121:getfield        #274 <Field int Rect.left>
	//   62  124:icmplt          152
		j = rect.bottom;
	//   63  127:aload           7
	//   64  129:getfield        #371 <Field int Rect.bottom>
	//   65  132:istore_3        
		k = ((Rect) (view)).top;
	//   66  133:aload_1         
	//   67  134:getfield        #297 <Field int Rect.top>
	//   68  137:istore          4
		flag = flag1;
	//   69  139:iload           6
	//   70  141:istore          5
		if(j >= k)
	//*  71  143:iload_3         
	//*  72  144:iload           4
	//*  73  146:icmplt          152
			flag = true;
	//   74  149:iconst_1        
	//   75  150:istore          5
		releaseTempRect(rect);
	//   76  152:aload           7
	//   77  154:invokestatic    #469 <Method void releaseTempRect(Rect)>
		releaseTempRect(((Rect) (view)));
	//   78  157:aload_1         
	//   79  158:invokestatic    #469 <Method void releaseTempRect(Rect)>
		return flag;
	//   80  161:iload           5
	//   81  163:ireturn         
		view1;
	//   82  164:astore_2        
		releaseTempRect(rect);
	//   83  165:aload           7
	//   84  167:invokestatic    #469 <Method void releaseTempRect(Rect)>
		releaseTempRect(((Rect) (view)));
	//   85  170:aload_1         
	//   86  171:invokestatic    #469 <Method void releaseTempRect(Rect)>
		throw view1;
	//   87  174:aload_2         
	//   88  175:athrow          
		return false;
	//   89  176:iconst_0        
	//   90  177:ireturn         
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          7
		if(layoutparams.mBehavior != null)
	//*   4    9:aload           7
	//*   5   11:getfield        #773 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//*   6   14:ifnull          179
		{
			float f = layoutparams.mBehavior.getScrimOpacity(this, view);
	//    7   17:aload           7
	//    8   19:getfield        #773 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//    9   22:aload_0         
	//   10   23:aload_2         
	//   11   24:invokevirtual   #777 <Method float CoordinatorLayout$Behavior.getScrimOpacity(CoordinatorLayout, View)>
	//   12   27:fstore          5
			if(f > 0.0F)
	//*  13   29:fload           5
	//*  14   31:fconst_0        
	//*  15   32:fcmpl           
	//*  16   33:ifle            179
			{
				if(mScrimPaint == null)
	//*  17   36:aload_0         
	//*  18   37:getfield        #779 <Field Paint mScrimPaint>
	//*  19   40:ifnonnull       54
					mScrimPaint = new Paint();
	//   20   43:aload_0         
	//   21   44:new             #781 <Class Paint>
	//   22   47:dup             
	//   23   48:invokespecial   #782 <Method void Paint()>
	//   24   51:putfield        #779 <Field Paint mScrimPaint>
				mScrimPaint.setColor(layoutparams.mBehavior.getScrimColor(this, view));
	//   25   54:aload_0         
	//   26   55:getfield        #779 <Field Paint mScrimPaint>
	//   27   58:aload           7
	//   28   60:getfield        #773 <Field CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.mBehavior>
	//   29   63:aload_0         
	//   30   64:aload_2         
	//   31   65:invokevirtual   #786 <Method int CoordinatorLayout$Behavior.getScrimColor(CoordinatorLayout, View)>
	//   32   68:invokevirtual   #789 <Method void Paint.setColor(int)>
				mScrimPaint.setAlpha(MathUtils.clamp(Math.round(255F * f), 0, 255));
	//   33   71:aload_0         
	//   34   72:getfield        #779 <Field Paint mScrimPaint>
	//   35   75:ldc2            #790 <Float 255F>
	//   36   78:fload           5
	//   37   80:fmul            
	//   38   81:invokestatic    #794 <Method int Math.round(float)>
	//   39   84:iconst_0        
	//   40   85:sipush          255
	//   41   88:invokestatic    #800 <Method int MathUtils.clamp(int, int, int)>
	//   42   91:invokevirtual   #803 <Method void Paint.setAlpha(int)>
				int i = canvas.save();
	//   43   94:aload_1         
	//   44   95:invokevirtual   #808 <Method int Canvas.save()>
	//   45   98:istore          6
				if(view.isOpaque())
	//*  46  100:aload_2         
	//*  47  101:invokevirtual   #811 <Method boolean View.isOpaque()>
	//*  48  104:ifeq            135
					canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), android.graphics.Region.Op.DIFFERENCE);
	//   49  107:aload_1         
	//   50  108:aload_2         
	//   51  109:invokevirtual   #496 <Method int View.getLeft()>
	//   52  112:i2f             
	//   53  113:aload_2         
	//   54  114:invokevirtual   #499 <Method int View.getTop()>
	//   55  117:i2f             
	//   56  118:aload_2         
	//   57  119:invokevirtual   #502 <Method int View.getRight()>
	//   58  122:i2f             
	//   59  123:aload_2         
	//   60  124:invokevirtual   #505 <Method int View.getBottom()>
	//   61  127:i2f             
	//   62  128:getstatic       #817 <Field android.graphics.Region$Op android.graphics.Region$Op.DIFFERENCE>
	//   63  131:invokevirtual   #821 <Method boolean Canvas.clipRect(float, float, float, float, android.graphics.Region$Op)>
	//   64  134:pop             
				canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), mScrimPaint);
	//   65  135:aload_1         
	//   66  136:aload_0         
	//   67  137:invokevirtual   #268 <Method int getPaddingLeft()>
	//   68  140:i2f             
	//   69  141:aload_0         
	//   70  142:invokevirtual   #291 <Method int getPaddingTop()>
	//   71  145:i2f             
	//   72  146:aload_0         
	//   73  147:invokevirtual   #262 <Method int getWidth()>
	//   74  150:aload_0         
	//   75  151:invokevirtual   #277 <Method int getPaddingRight()>
	//   76  154:isub            
	//   77  155:i2f             
	//   78  156:aload_0         
	//   79  157:invokevirtual   #265 <Method int getHeight()>
	//   80  160:aload_0         
	//   81  161:invokevirtual   #300 <Method int getPaddingBottom()>
	//   82  164:isub            
	//   83  165:i2f             
	//   84  166:aload_0         
	//   85  167:getfield        #779 <Field Paint mScrimPaint>
	//   86  170:invokevirtual   #825 <Method void Canvas.drawRect(float, float, float, float, Paint)>
				canvas.restoreToCount(i);
	//   87  173:aload_1         
	//   88  174:iload           6
	//   89  176:invokevirtual   #828 <Method void Canvas.restoreToCount(int)>
			}
		}
		return super.drawChild(canvas, view, l);
	//   90  179:aload_0         
	//   91  180:aload_1         
	//   92  181:aload_2         
	//   93  182:lload_3         
	//   94  183:invokespecial   #830 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//   95  186:ireturn         
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #833 <Method void ViewGroup.drawableStateChanged()>
		int ai[] = getDrawableState();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #837 <Method int[] getDrawableState()>
	//    4    8:astore_3        
		Drawable drawable = mStatusBarBackground;
	//    5    9:aload_0         
	//    6   10:getfield        #230 <Field Drawable mStatusBarBackground>
	//    7   13:astore          4
		boolean flag1 = false;
	//    8   15:iconst_0        
	//    9   16:istore_2        
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
	//*  17   28:invokevirtual   #842 <Method boolean Drawable.isStateful()>
	//*  18   31:ifeq            43
				flag = false | drawable.setState(ai);
	//   19   34:iconst_0        
	//   20   35:aload           4
	//   21   37:aload_3         
	//   22   38:invokevirtual   #846 <Method boolean Drawable.setState(int[])>
	//   23   41:ior             
	//   24   42:istore_1        
		}
		if(flag)
	//*  25   43:iload_1         
	//*  26   44:ifeq            51
			invalidate();
	//   27   47:aload_0         
	//   28   48:invokevirtual   #849 <Method void invalidate()>
	//   29   51:return          
	}

	void ensurePreDrawListener()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method int getChildCount()>
	//    2    4:istore_2        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
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
	//*  15   21:invokevirtual   #322 <Method View getChildAt(int)>
	//*  16   24:invokespecial   #852 <Method boolean hasDependencies(View)>
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
	//*  28   44:getfield        #734 <Field boolean mNeedsPreDrawListener>
	//*  29   47:icmpeq          63
		{
			if(flag)
	//*  30   50:iload_3         
	//*  31   51:ifeq            59
			{
				addPreDrawListener();
	//   32   54:aload_0         
	//   33   55:invokevirtual   #854 <Method void addPreDrawListener()>
				return;
	//   34   58:return          
			}
			removePreDrawListener();
	//   35   59:aload_0         
	//   36   60:invokevirtual   #857 <Method void removePreDrawListener()>
		}
	//   37   63:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-2, -2);
	//    0    0:new             #25  <Class CoordinatorLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #862 <Method void CoordinatorLayout$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #864 <Method CoordinatorLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #25  <Class CoordinatorLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #870 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #871 <Method void CoordinatorLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #25  <Class CoordinatorLayout$LayoutParams>
	//*   2    4:ifeq            19
			return new LayoutParams((LayoutParams)layoutparams);
	//    3    7:new             #25  <Class CoordinatorLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    7   15:invokespecial   #875 <Method void CoordinatorLayout$LayoutParams(CoordinatorLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #877 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   12   26:new             #25  <Class CoordinatorLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #877 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #880 <Method void CoordinatorLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return new LayoutParams(layoutparams);
	//   18   38:new             #25  <Class CoordinatorLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #883 <Method void CoordinatorLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #886 <Method CoordinatorLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #889 <Method CoordinatorLayout$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	void getChildRect(View view, boolean flag, Rect rect)
	{
		if(!view.isLayoutRequested() && view.getVisibility() != 8)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #892 <Method boolean View.isLayoutRequested()>
	//*   2    4:ifne            51
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #759 <Method int View.getVisibility()>
	//*   5   11:bipush          8
	//*   6   13:icmpne          19
	//*   7   16:goto            51
		{
			if(flag)
	//*   8   19:iload_2         
	//*   9   20:ifeq            30
			{
				getDescendantRect(view, rect);
	//   10   23:aload_0         
	//   11   24:aload_1         
	//   12   25:aload_3         
	//   13   26:invokevirtual   #475 <Method void getDescendantRect(View, Rect)>
				return;
	//   14   29:return          
			} else
			{
				rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//   15   30:aload_3         
	//   16   31:aload_1         
	//   17   32:invokevirtual   #496 <Method int View.getLeft()>
	//   18   35:aload_1         
	//   19   36:invokevirtual   #499 <Method int View.getTop()>
	//   20   39:aload_1         
	//   21   40:invokevirtual   #502 <Method int View.getRight()>
	//   22   43:aload_1         
	//   23   44:invokevirtual   #505 <Method int View.getBottom()>
	//   24   47:invokevirtual   #307 <Method void Rect.set(int, int, int, int)>
				return;
	//   25   50:return          
			}
		} else
		{
			rect.setEmpty();
	//   26   51:aload_3         
	//   27   52:invokevirtual   #666 <Method void Rect.setEmpty()>
			return;
	//   28   55:return          
		}
	}

	public List getDependencies(View view)
	{
		view = ((View) (mChildDag.getOutgoingEdges(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #897 <Method List DirectedAcyclicGraph.getOutgoingEdges(Object)>
	//    4    8:astore_1        
		mTempDependenciesList.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #168 <Field List mTempDependenciesList>
	//    7   13:invokeinterface #412 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			mTempDependenciesList.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #168 <Field List mTempDependenciesList>
	//   12   26:aload_1         
	//   13   27:invokeinterface #660 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return mTempDependenciesList;
	//   15   33:aload_0         
	//   16   34:getfield        #168 <Field List mTempDependenciesList>
	//   17   37:areturn         
	}

	final List getDependencySortedChildren()
	{
		prepareChildren();
	//    0    0:aload_0         
	//    1    1:invokespecial   #903 <Method void prepareChildren()>
		return Collections.unmodifiableList(mDependencySortedChildren);
	//    2    4:aload_0         
	//    3    5:getfield        #159 <Field List mDependencySortedChildren>
	//    4    8:invokestatic    #907 <Method List Collections.unmodifiableList(List)>
	//    5   11:areturn         
	}

	public List getDependents(View view)
	{
		view = ((View) (mChildDag.getIncomingEdges(((Object) (view)))));
	//    0    0:aload_0         
	//    1    1:getfield        #164 <Field DirectedAcyclicGraph mChildDag>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #744 <Method List DirectedAcyclicGraph.getIncomingEdges(Object)>
	//    4    8:astore_1        
		mTempDependenciesList.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #168 <Field List mTempDependenciesList>
	//    7   13:invokeinterface #412 <Method void List.clear()>
		if(view != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          33
			mTempDependenciesList.addAll(((java.util.Collection) (view)));
	//   10   22:aload_0         
	//   11   23:getfield        #168 <Field List mTempDependenciesList>
	//   12   26:aload_1         
	//   13   27:invokeinterface #660 <Method boolean List.addAll(java.util.Collection)>
	//   14   32:pop             
		return mTempDependenciesList;
	//   15   33:aload_0         
	//   16   34:getfield        #168 <Field List mTempDependenciesList>
	//   17   37:areturn         
	}

	void getDescendantRect(View view, Rect rect)
	{
		ViewGroupUtils.getDescendantRect(((ViewGroup) (this)), view, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #914 <Method void ViewGroupUtils.getDescendantRect(ViewGroup, View, Rect)>
	//    4    6:return          
	}

	void getDesiredAnchoredChildRect(View view, int i, Rect rect, Rect rect1)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          7
		int j = view.getMeasuredWidth();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #455 <Method int View.getMeasuredWidth()>
	//    6   13:istore          5
		int k = view.getMeasuredHeight();
	//    7   15:aload_1         
	//    8   16:invokevirtual   #458 <Method int View.getMeasuredHeight()>
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
	//   18   33:invokespecial   #916 <Method void getDesiredAnchoredChildRectWithoutConstraints(View, int, Rect, Rect, CoordinatorLayout$LayoutParams, int, int)>
		constrainChildRect(layoutparams, rect1, j, k);
	//   19   36:aload_0         
	//   20   37:aload           7
	//   21   39:aload           4
	//   22   41:iload           5
	//   23   43:iload           6
	//   24   45:invokespecial   #918 <Method void constrainChildRect(CoordinatorLayout$LayoutParams, Rect, int, int)>
	//   25   48:return          
	}

	void getLastChildRect(View view, Rect rect)
	{
		rect.set(((LayoutParams)view.getLayoutParams()).getLastChildRect());
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    5:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    4    8:invokevirtual   #921 <Method Rect CoordinatorLayout$LayoutParams.getLastChildRect()>
	//    5   11:invokevirtual   #527 <Method void Rect.set(Rect)>
	//    6   14:return          
	}

	public final WindowInsetsCompat getLastWindowInsets()
	{
		return mLastInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//    2    4:areturn         
	}

	public int getNestedScrollAxes()
	{
		return mNestedScrollingParentHelper.getNestedScrollAxes();
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:invokevirtual   #930 <Method int NestedScrollingParentHelper.getNestedScrollAxes()>
	//    3    7:ireturn         
	}

	LayoutParams getResolvedLayoutParams(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          4
		if(!layoutparams.mBehaviorResolved)
	//*   4    9:aload           4
	//*   5   11:getfield        #933 <Field boolean CoordinatorLayout$LayoutParams.mBehaviorResolved>
	//*   6   14:ifne            198
		{
			if(view instanceof AttachedBehavior)
	//*   7   17:aload_1         
	//*   8   18:instanceof      #10  <Class CoordinatorLayout$AttachedBehavior>
	//*   9   21:ifeq            62
			{
				view = ((View) (((AttachedBehavior)view).getBehavior()));
	//   10   24:aload_1         
	//   11   25:checkcast       #10  <Class CoordinatorLayout$AttachedBehavior>
	//   12   28:invokeinterface #934 <Method CoordinatorLayout$Behavior CoordinatorLayout$AttachedBehavior.getBehavior()>
	//   13   33:astore_1        
				if(view == null)
	//*  14   34:aload_1         
	//*  15   35:ifnonnull       47
					Log.e("CoordinatorLayout", "Attached behavior class is null");
	//   16   38:ldc1            #51  <String "CoordinatorLayout">
	//   17   40:ldc2            #936 <String "Attached behavior class is null">
	//   18   43:invokestatic    #401 <Method int Log.e(String, String)>
	//   19   46:pop             
				layoutparams.setBehavior(((Behavior) (view)));
	//   20   47:aload           4
	//   21   49:aload_1         
	//   22   50:invokevirtual   #940 <Method void CoordinatorLayout$LayoutParams.setBehavior(CoordinatorLayout$Behavior)>
				layoutparams.mBehaviorResolved = true;
	//   23   53:aload           4
	//   24   55:iconst_1        
	//   25   56:putfield        #933 <Field boolean CoordinatorLayout$LayoutParams.mBehaviorResolved>
				return layoutparams;
	//   26   59:aload           4
	//   27   61:areturn         
			}
			Class class1 = ((Object) (view)).getClass();
	//   28   62:aload_1         
	//   29   63:invokevirtual   #944 <Method Class Object.getClass()>
	//   30   66:astore_2        
			view = null;
	//   31   67:aconst_null     
	//   32   68:astore_1        
			do
			{
				if(class1 == null)
					break;
	//   33   69:aload_2         
	//   34   70:ifnull          99
				DefaultBehavior defaultbehavior = (DefaultBehavior)class1.getAnnotation(android/support/design/widget/CoordinatorLayout$DefaultBehavior);
	//   35   73:aload_2         
	//   36   74:ldc1            #16  <Class CoordinatorLayout$DefaultBehavior>
	//   37   76:invokevirtual   #948 <Method Annotation Class.getAnnotation(Class)>
	//   38   79:checkcast       #16  <Class CoordinatorLayout$DefaultBehavior>
	//   39   82:astore_3        
				view = ((View) (defaultbehavior));
	//   40   83:aload_3         
	//   41   84:astore_1        
				if(defaultbehavior != null)
					break;
	//   42   85:aload_3         
	//   43   86:ifnonnull       99
				class1 = class1.getSuperclass();
	//   44   89:aload_2         
	//   45   90:invokevirtual   #951 <Method Class Class.getSuperclass()>
	//   46   93:astore_2        
				view = ((View) (defaultbehavior));
	//   47   94:aload_3         
	//   48   95:astore_1        
			} while(true);
	//   49   96:goto            69
			if(view != null)
	//*  50   99:aload_1         
	//*  51  100:ifnull          192
				try
				{
					layoutparams.setBehavior((Behavior)((DefaultBehavior) (view)).value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
	//   52  103:aload           4
	//   53  105:aload_1         
	//   54  106:invokeinterface #953 <Method Class CoordinatorLayout$DefaultBehavior.value()>
	//   55  111:iconst_0        
	//   56  112:anewarray       Class[]
	//   57  115:invokevirtual   #956 <Method Constructor Class.getDeclaredConstructor(Class[])>
	//   58  118:iconst_0        
	//   59  119:anewarray       Object[]
	//   60  122:invokevirtual   #615 <Method Object Constructor.newInstance(Object[])>
	//   61  125:checkcast       #13  <Class CoordinatorLayout$Behavior>
	//   62  128:invokevirtual   #940 <Method void CoordinatorLayout$LayoutParams.setBehavior(CoordinatorLayout$Behavior)>
				}
	//*  63  131:goto            192
				catch(Exception exception)
	//*  64  134:astore_2        
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   65  135:new             #377 <Class StringBuilder>
	//   66  138:dup             
	//   67  139:invokespecial   #378 <Method void StringBuilder()>
	//   68  142:astore_3        
					stringbuilder.append("Default behavior class ");
	//   69  143:aload_3         
	//   70  144:ldc2            #958 <String "Default behavior class ">
	//   71  147:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   72  150:pop             
					stringbuilder.append(((DefaultBehavior) (view)).value().getName());
	//   73  151:aload_3         
	//   74  152:aload_1         
	//   75  153:invokeinterface #953 <Method Class CoordinatorLayout$DefaultBehavior.value()>
	//   76  158:invokevirtual   #959 <Method String Class.getName()>
	//   77  161:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   78  164:pop             
					stringbuilder.append(" could not be instantiated. Did you forget");
	//   79  165:aload_3         
	//   80  166:ldc2            #961 <String " could not be instantiated. Did you forget">
	//   81  169:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   82  172:pop             
					stringbuilder.append(" a default constructor?");
	//   83  173:aload_3         
	//   84  174:ldc2            #963 <String " a default constructor?">
	//   85  177:invokevirtual   #384 <Method StringBuilder StringBuilder.append(String)>
	//   86  180:pop             
					Log.e("CoordinatorLayout", stringbuilder.toString(), ((Throwable) (exception)));
	//   87  181:ldc1            #51  <String "CoordinatorLayout">
	//   88  183:aload_3         
	//   89  184:invokevirtual   #395 <Method String StringBuilder.toString()>
	//   90  187:aload_2         
	//   91  188:invokestatic    #966 <Method int Log.e(String, String, Throwable)>
	//   92  191:pop             
				}
			layoutparams.mBehaviorResolved = true;
	//   93  192:aload           4
	//   94  194:iconst_1        
	//   95  195:putfield        #933 <Field boolean CoordinatorLayout$LayoutParams.mBehaviorResolved>
		}
		return layoutparams;
	//   96  198:aload           4
	//   97  200:areturn         
	}

	public Drawable getStatusBarBackground()
	{
		return mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field Drawable mStatusBarBackground>
	//    2    4:areturn         
	}

	protected int getSuggestedMinimumHeight()
	{
		return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
	//    0    0:aload_0         
	//    1    1:invokespecial   #972 <Method int ViewGroup.getSuggestedMinimumHeight()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #291 <Method int getPaddingTop()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #300 <Method int getPaddingBottom()>
	//    6   12:iadd            
	//    7   13:invokestatic    #288 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	protected int getSuggestedMinimumWidth()
	{
		return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
	//    0    0:aload_0         
	//    1    1:invokespecial   #975 <Method int ViewGroup.getSuggestedMinimumWidth()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #268 <Method int getPaddingLeft()>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #277 <Method int getPaddingRight()>
	//    6   12:iadd            
	//    7   13:invokestatic    #288 <Method int Math.max(int, int)>
	//    8   16:ireturn         
	}

	public boolean isPointInChildBounds(View view, int i, int j)
	{
		Rect rect;
		rect = acquireTempRect();
	//    0    0:invokestatic    #438 <Method Rect acquireTempRect()>
	//    1    3:astore          5
		getDescendantRect(view, rect);
	//    2    5:aload_0         
	//    3    6:aload_1         
	//    4    7:aload           5
	//    5    9:invokevirtual   #475 <Method void getDescendantRect(View, Rect)>
		boolean flag = rect.contains(i, j);
	//    6   12:aload           5
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokevirtual   #980 <Method boolean Rect.contains(int, int)>
	//   10   19:istore          4
		releaseTempRect(rect);
	//   11   21:aload           5
	//   12   23:invokestatic    #469 <Method void releaseTempRect(Rect)>
		return flag;
	//   13   26:iload           4
	//   14   28:ireturn         
		view;
	//   15   29:astore_1        
		releaseTempRect(rect);
	//   16   30:aload           5
	//   17   32:invokestatic    #469 <Method void releaseTempRect(Rect)>
		throw view;
	//   18   35:aload_1         
	//   19   36:athrow          
	}

	void offsetChildToAnchor(View view, int i)
	{
label0:
		{
			int k;
			int l;
			LayoutParams layoutparams;
			Rect rect;
			Rect rect1;
			Rect rect2;
label1:
			{
				layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore          6
				if(layoutparams.mAnchorView == null)
					break label0;
	//    4    9:aload           6
	//    5   11:getfield        #984 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//    6   14:ifnull          212
				rect = acquireTempRect();
	//    7   17:invokestatic    #438 <Method Rect acquireTempRect()>
	//    8   20:astore          7
				rect1 = acquireTempRect();
	//    9   22:invokestatic    #438 <Method Rect acquireTempRect()>
	//   10   25:astore          8
				rect2 = acquireTempRect();
	//   11   27:invokestatic    #438 <Method Rect acquireTempRect()>
	//   12   30:astore          9
				getDescendantRect(layoutparams.mAnchorView, rect);
	//   13   32:aload_0         
	//   14   33:aload           6
	//   15   35:getfield        #984 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   16   38:aload           7
	//   17   40:invokevirtual   #475 <Method void getDescendantRect(View, Rect)>
				boolean flag = false;
	//   18   43:iconst_0        
	//   19   44:istore_3        
				getChildRect(view, false, rect1);
	//   20   45:aload_0         
	//   21   46:aload_1         
	//   22   47:iconst_0        
	//   23   48:aload           8
	//   24   50:invokevirtual   #767 <Method void getChildRect(View, boolean, Rect)>
				k = view.getMeasuredWidth();
	//   25   53:aload_1         
	//   26   54:invokevirtual   #455 <Method int View.getMeasuredWidth()>
	//   27   57:istore          4
				l = view.getMeasuredHeight();
	//   28   59:aload_1         
	//   29   60:invokevirtual   #458 <Method int View.getMeasuredHeight()>
	//   30   63:istore          5
				getDesiredAnchoredChildRectWithoutConstraints(view, i, rect, rect2, layoutparams, k, l);
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:iload_2         
	//   34   68:aload           7
	//   35   70:aload           9
	//   36   72:aload           6
	//   37   74:iload           4
	//   38   76:iload           5
	//   39   78:invokespecial   #916 <Method void getDesiredAnchoredChildRectWithoutConstraints(View, int, Rect, Rect, CoordinatorLayout$LayoutParams, int, int)>
				if(rect2.left == rect1.left)
	//*  40   81:aload           9
	//*  41   83:getfield        #274 <Field int Rect.left>
	//*  42   86:aload           8
	//*  43   88:getfield        #274 <Field int Rect.left>
	//*  44   91:icmpne          109
				{
					i = ((int) (flag));
	//   45   94:iload_3         
	//   46   95:istore_2        
					if(rect2.top == rect1.top)
						break label1;
	//   47   96:aload           9
	//   48   98:getfield        #297 <Field int Rect.top>
	//   49  101:aload           8
	//   50  103:getfield        #297 <Field int Rect.top>
	//   51  106:icmpeq          111
				}
				i = 1;
	//   52  109:iconst_1        
	//   53  110:istore_2        
			}
			constrainChildRect(layoutparams, rect2, k, l);
	//   54  111:aload_0         
	//   55  112:aload           6
	//   56  114:aload           9
	//   57  116:iload           4
	//   58  118:iload           5
	//   59  120:invokespecial   #918 <Method void constrainChildRect(CoordinatorLayout$LayoutParams, Rect, int, int)>
			int j = rect2.left - rect1.left;
	//   60  123:aload           9
	//   61  125:getfield        #274 <Field int Rect.left>
	//   62  128:aload           8
	//   63  130:getfield        #274 <Field int Rect.left>
	//   64  133:isub            
	//   65  134:istore_3        
			k = rect2.top - rect1.top;
	//   66  135:aload           9
	//   67  137:getfield        #297 <Field int Rect.top>
	//   68  140:aload           8
	//   69  142:getfield        #297 <Field int Rect.top>
	//   70  145:isub            
	//   71  146:istore          4
			if(j != 0)
	//*  72  148:iload_3         
	//*  73  149:ifeq            157
				ViewCompat.offsetLeftAndRight(view, j);
	//   74  152:aload_1         
	//   75  153:iload_3         
	//   76  154:invokestatic    #703 <Method void ViewCompat.offsetLeftAndRight(View, int)>
			if(k != 0)
	//*  77  157:iload           4
	//*  78  159:ifeq            168
				ViewCompat.offsetTopAndBottom(view, k);
	//   79  162:aload_1         
	//   80  163:iload           4
	//   81  165:invokestatic    #706 <Method void ViewCompat.offsetTopAndBottom(View, int)>
			if(i != 0)
	//*  82  168:iload_2         
	//*  83  169:ifeq            197
			{
				Behavior behavior = layoutparams.getBehavior();
	//   84  172:aload           6
	//   85  174:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   86  177:astore          10
				if(behavior != null)
	//*  87  179:aload           10
	//*  88  181:ifnull          197
					behavior.onDependentViewChanged(this, view, layoutparams.mAnchorView);
	//   89  184:aload           10
	//   90  186:aload_0         
	//   91  187:aload_1         
	//   92  188:aload           6
	//   93  190:getfield        #984 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   94  193:invokevirtual   #754 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
	//   95  196:pop             
			}
			releaseTempRect(rect);
	//   96  197:aload           7
	//   97  199:invokestatic    #469 <Method void releaseTempRect(Rect)>
			releaseTempRect(rect1);
	//   98  202:aload           8
	//   99  204:invokestatic    #469 <Method void releaseTempRect(Rect)>
			releaseTempRect(rect2);
	//  100  207:aload           9
	//  101  209:invokestatic    #469 <Method void releaseTempRect(Rect)>
		}
	//  102  212:return          
	}

	public void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #987 <Method void ViewGroup.onAttachedToWindow()>
		resetTouchBehaviors(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #989 <Method void resetTouchBehaviors(boolean)>
		if(mNeedsPreDrawListener)
	//*   5    9:aload_0         
	//*   6   10:getfield        #734 <Field boolean mNeedsPreDrawListener>
	//*   7   13:ifeq            46
		{
			if(mOnPreDrawListener == null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*  10   20:ifnonnull       35
				mOnPreDrawListener = new OnPreDrawListener();
	//   11   23:aload_0         
	//   12   24:new             #28  <Class CoordinatorLayout$OnPreDrawListener>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #722 <Method void CoordinatorLayout$OnPreDrawListener(CoordinatorLayout)>
	//   16   32:putfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
			getViewTreeObserver().addOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   17   35:aload_0         
	//   18   36:invokevirtual   #726 <Method ViewTreeObserver getViewTreeObserver()>
	//   19   39:aload_0         
	//   20   40:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   21   43:invokevirtual   #732 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		}
		if(mLastInsets == null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  22   46:aload_0         
	//*  23   47:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//*  24   50:ifnonnull       64
	//*  25   53:aload_0         
	//*  26   54:invokestatic    #328 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  27   57:ifeq            64
			ViewCompat.requestApplyInsets(((View) (this)));
	//   28   60:aload_0         
	//   29   61:invokestatic    #992 <Method void ViewCompat.requestApplyInsets(View)>
		mIsAttachedToWindow = true;
	//   30   64:aload_0         
	//   31   65:iconst_1        
	//   32   66:putfield        #719 <Field boolean mIsAttachedToWindow>
	//   33   69:return          
	}

	final void onChildViewsChanged(int i)
	{
		int j1 = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #997 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore          4
		int k1 = mDependencySortedChildren.size();
	//    3    6:aload_0         
	//    4    7:getfield        #159 <Field List mDependencySortedChildren>
	//    5   10:invokeinterface #748 <Method int List.size()>
	//    6   15:istore          5
		Rect rect = acquireTempRect();
	//    7   17:invokestatic    #438 <Method Rect acquireTempRect()>
	//    8   20:astore          8
		Rect rect1 = acquireTempRect();
	//    9   22:invokestatic    #438 <Method Rect acquireTempRect()>
	//   10   25:astore          9
		Rect rect2 = acquireTempRect();
	//   11   27:invokestatic    #438 <Method Rect acquireTempRect()>
	//   12   30:astore          10
		for(int j = 0; j < k1; j++)
	//*  13   32:iconst_0        
	//*  14   33:istore_2        
	//*  15   34:iload_2         
	//*  16   35:iload           5
	//*  17   37:icmpge          493
		{
			View view = (View)mDependencySortedChildren.get(j);
	//   18   40:aload_0         
	//   19   41:getfield        #159 <Field List mDependencySortedChildren>
	//   20   44:iload_2         
	//   21   45:invokeinterface #751 <Method Object List.get(int)>
	//   22   50:checkcast       #330 <Class View>
	//   23   53:astore          11
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   55:aload           11
	//   25   57:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   60:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   27   63:astore          12
			if(i == 0 && view.getVisibility() == 8)
	//*  28   65:iload_1         
	//*  29   66:ifne            82
	//*  30   69:aload           11
	//*  31   71:invokevirtual   #759 <Method int View.getVisibility()>
	//*  32   74:bipush          8
	//*  33   76:icmpne          82
				continue;
	//   34   79:goto            486
			for(int k = 0; k < j; k++)
	//*  35   82:iconst_0        
	//*  36   83:istore_3        
	//*  37   84:iload_3         
	//*  38   85:iload_2         
	//*  39   86:icmpge          129
			{
				View view2 = (View)mDependencySortedChildren.get(k);
	//   40   89:aload_0         
	//   41   90:getfield        #159 <Field List mDependencySortedChildren>
	//   42   93:iload_3         
	//   43   94:invokeinterface #751 <Method Object List.get(int)>
	//   44   99:checkcast       #330 <Class View>
	//   45  102:astore          13
				if(layoutparams.mAnchorDirectChild == view2)
	//*  46  104:aload           12
	//*  47  106:getfield        #1000 <Field View CoordinatorLayout$LayoutParams.mAnchorDirectChild>
	//*  48  109:aload           13
	//*  49  111:if_acmpne       122
					offsetChildToAnchor(view, j1);
	//   50  114:aload_0         
	//   51  115:aload           11
	//   52  117:iload           4
	//   53  119:invokevirtual   #1002 <Method void offsetChildToAnchor(View, int)>
			}

	//   54  122:iload_3         
	//   55  123:iconst_1        
	//   56  124:iadd            
	//   57  125:istore_3        
	//*  58  126:goto            84
			getChildRect(view, true, rect1);
	//   59  129:aload_0         
	//   60  130:aload           11
	//   61  132:iconst_1        
	//   62  133:aload           9
	//   63  135:invokevirtual   #767 <Method void getChildRect(View, boolean, Rect)>
			if(layoutparams.insetEdge != 0 && !rect1.isEmpty())
	//*  64  138:aload           12
	//*  65  140:getfield        #1005 <Field int CoordinatorLayout$LayoutParams.insetEdge>
	//*  66  143:ifeq            294
	//*  67  146:aload           9
	//*  68  148:invokevirtual   #530 <Method boolean Rect.isEmpty()>
	//*  69  151:ifne            294
			{
				int l = GravityCompat.getAbsoluteGravity(layoutparams.insetEdge, j1);
	//   70  154:aload           12
	//   71  156:getfield        #1005 <Field int CoordinatorLayout$LayoutParams.insetEdge>
	//   72  159:iload           4
	//   73  161:invokestatic    #356 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   74  164:istore_3        
				int l1 = l & 0x70;
	//   75  165:iload_3         
	//   76  166:bipush          112
	//   77  168:iand            
	//   78  169:istore          6
				if(l1 != 48)
	//*  79  171:iload           6
	//*  80  173:bipush          48
	//*  81  175:icmpeq          214
				{
					if(l1 == 80)
	//*  82  178:iload           6
	//*  83  180:bipush          80
	//*  84  182:icmpeq          188
	//*  85  185:goto            232
						rect.bottom = Math.max(rect.bottom, getHeight() - rect1.top);
	//   86  188:aload           8
	//   87  190:aload           8
	//   88  192:getfield        #371 <Field int Rect.bottom>
	//   89  195:aload_0         
	//   90  196:invokevirtual   #265 <Method int getHeight()>
	//   91  199:aload           9
	//   92  201:getfield        #297 <Field int Rect.top>
	//   93  204:isub            
	//   94  205:invokestatic    #288 <Method int Math.max(int, int)>
	//   95  208:putfield        #371 <Field int Rect.bottom>
				} else
	//*  96  211:goto            232
				{
					rect.top = Math.max(rect.top, rect1.bottom);
	//   97  214:aload           8
	//   98  216:aload           8
	//   99  218:getfield        #297 <Field int Rect.top>
	//  100  221:aload           9
	//  101  223:getfield        #371 <Field int Rect.bottom>
	//  102  226:invokestatic    #288 <Method int Math.max(int, int)>
	//  103  229:putfield        #297 <Field int Rect.top>
				}
				l &= 7;
	//  104  232:iload_3         
	//  105  233:bipush          7
	//  106  235:iand            
	//  107  236:istore_3        
				if(l != 3)
	//* 108  237:iload_3         
	//* 109  238:iconst_3        
	//* 110  239:icmpeq          276
				{
					if(l == 5)
	//* 111  242:iload_3         
	//* 112  243:iconst_5        
	//* 113  244:icmpeq          250
	//* 114  247:goto            294
						rect.right = Math.max(rect.right, getWidth() - rect1.left);
	//  115  250:aload           8
	//  116  252:aload           8
	//  117  254:getfield        #365 <Field int Rect.right>
	//  118  257:aload_0         
	//  119  258:invokevirtual   #262 <Method int getWidth()>
	//  120  261:aload           9
	//  121  263:getfield        #274 <Field int Rect.left>
	//  122  266:isub            
	//  123  267:invokestatic    #288 <Method int Math.max(int, int)>
	//  124  270:putfield        #365 <Field int Rect.right>
				} else
	//* 125  273:goto            294
				{
					rect.left = Math.max(rect.left, rect1.right);
	//  126  276:aload           8
	//  127  278:aload           8
	//  128  280:getfield        #274 <Field int Rect.left>
	//  129  283:aload           9
	//  130  285:getfield        #365 <Field int Rect.right>
	//  131  288:invokestatic    #288 <Method int Math.max(int, int)>
	//  132  291:putfield        #274 <Field int Rect.left>
				}
			}
			if(layoutparams.dodgeInsetEdges != 0 && view.getVisibility() == 0)
	//* 133  294:aload           12
	//* 134  296:getfield        #533 <Field int CoordinatorLayout$LayoutParams.dodgeInsetEdges>
	//* 135  299:ifeq            320
	//* 136  302:aload           11
	//* 137  304:invokevirtual   #759 <Method int View.getVisibility()>
	//* 138  307:ifne            320
				offsetChildByInset(view, rect, j1);
	//  139  310:aload_0         
	//  140  311:aload           11
	//  141  313:aload           8
	//  142  315:iload           4
	//  143  317:invokespecial   #1007 <Method void offsetChildByInset(View, Rect, int)>
			if(i != 2)
	//* 144  320:iload_1         
	//* 145  321:iconst_2        
	//* 146  322:icmpeq          354
			{
				getLastChildRect(view, rect2);
	//  147  325:aload_0         
	//  148  326:aload           11
	//  149  328:aload           10
	//  150  330:invokevirtual   #1009 <Method void getLastChildRect(View, Rect)>
				if(rect2.equals(((Object) (rect1))))
	//* 151  333:aload           10
	//* 152  335:aload           9
	//* 153  337:invokevirtual   #1012 <Method boolean Rect.equals(Object)>
	//* 154  340:ifeq            346
					continue;
	//  155  343:goto            486
				recordLastChildRect(view, rect1);
	//  156  346:aload_0         
	//  157  347:aload           11
	//  158  349:aload           9
	//  159  351:invokevirtual   #1015 <Method void recordLastChildRect(View, Rect)>
			}
			for(int i1 = j + 1; i1 < k1; i1++)
	//* 160  354:iload_2         
	//* 161  355:iconst_1        
	//* 162  356:iadd            
	//* 163  357:istore_3        
	//* 164  358:iload_3         
	//* 165  359:iload           5
	//* 166  361:icmpge          486
			{
				View view1 = (View)mDependencySortedChildren.get(i1);
	//  167  364:aload_0         
	//  168  365:getfield        #159 <Field List mDependencySortedChildren>
	//  169  368:iload_3         
	//  170  369:invokeinterface #751 <Method Object List.get(int)>
	//  171  374:checkcast       #330 <Class View>
	//  172  377:astore          12
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//  173  379:aload           12
	//  174  381:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  175  384:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//  176  387:astore          13
				Behavior behavior = layoutparams1.getBehavior();
	//  177  389:aload           13
	//  178  391:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//  179  394:astore          14
				if(behavior == null || !behavior.layoutDependsOn(this, view1, view))
					continue;
	//  180  396:aload           14
	//  181  398:ifnull          479
	//  182  401:aload           14
	//  183  403:aload_0         
	//  184  404:aload           12
	//  185  406:aload           11
	//  186  408:invokevirtual   #1018 <Method boolean CoordinatorLayout$Behavior.layoutDependsOn(CoordinatorLayout, View, View)>
	//  187  411:ifeq            479
				if(i == 0 && layoutparams1.getChangedAfterNestedScroll())
	//* 188  414:iload_1         
	//* 189  415:ifne            434
	//* 190  418:aload           13
	//* 191  420:invokevirtual   #1021 <Method boolean CoordinatorLayout$LayoutParams.getChangedAfterNestedScroll()>
	//* 192  423:ifeq            434
				{
					layoutparams1.resetChangedAfterNestedScroll();
	//  193  426:aload           13
	//  194  428:invokevirtual   #1024 <Method void CoordinatorLayout$LayoutParams.resetChangedAfterNestedScroll()>
					continue;
	//  195  431:goto            479
				}
				boolean flag;
				if(i != 2)
	//* 196  434:iload_1         
	//* 197  435:iconst_2        
	//* 198  436:icmpeq          454
				{
					flag = behavior.onDependentViewChanged(this, view1, view);
	//  199  439:aload           14
	//  200  441:aload_0         
	//  201  442:aload           12
	//  202  444:aload           11
	//  203  446:invokevirtual   #754 <Method boolean CoordinatorLayout$Behavior.onDependentViewChanged(CoordinatorLayout, View, View)>
	//  204  449:istore          7
				} else
	//* 205  451:goto            467
				{
					behavior.onDependentViewRemoved(this, view1, view);
	//  206  454:aload           14
	//  207  456:aload_0         
	//  208  457:aload           12
	//  209  459:aload           11
	//  210  461:invokevirtual   #1028 <Method void CoordinatorLayout$Behavior.onDependentViewRemoved(CoordinatorLayout, View, View)>
					flag = true;
	//  211  464:iconst_1        
	//  212  465:istore          7
				}
				if(i == 1)
	//* 213  467:iload_1         
	//* 214  468:iconst_1        
	//* 215  469:icmpne          479
					layoutparams1.setChangedAfterNestedScroll(flag);
	//  216  472:aload           13
	//  217  474:iload           7
	//  218  476:invokevirtual   #1031 <Method void CoordinatorLayout$LayoutParams.setChangedAfterNestedScroll(boolean)>
			}

	//  219  479:iload_3         
	//  220  480:iconst_1        
	//  221  481:iadd            
	//  222  482:istore_3        
		}

	//  223  483:goto            358
	//  224  486:iload_2         
	//  225  487:iconst_1        
	//  226  488:iadd            
	//  227  489:istore_2        
	//* 228  490:goto            34
		releaseTempRect(rect);
	//  229  493:aload           8
	//  230  495:invokestatic    #469 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect1);
	//  231  498:aload           9
	//  232  500:invokestatic    #469 <Method void releaseTempRect(Rect)>
		releaseTempRect(rect2);
	//  233  503:aload           10
	//  234  505:invokestatic    #469 <Method void releaseTempRect(Rect)>
	//  235  508:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #1034 <Method void ViewGroup.onDetachedFromWindow()>
		resetTouchBehaviors(false);
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:invokespecial   #989 <Method void resetTouchBehaviors(boolean)>
		if(mNeedsPreDrawListener && mOnPreDrawListener != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #734 <Field boolean mNeedsPreDrawListener>
	//*   7   13:ifeq            34
	//*   8   16:aload_0         
	//*   9   17:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*  10   20:ifnull          34
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//   11   23:aload_0         
	//   12   24:invokevirtual   #726 <Method ViewTreeObserver getViewTreeObserver()>
	//   13   27:aload_0         
	//   14   28:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   15   31:invokevirtual   #1037 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		if(mNestedScrollingTarget != null)
	//*  16   34:aload_0         
	//*  17   35:getfield        #1039 <Field View mNestedScrollingTarget>
	//*  18   38:ifnull          49
			onStopNestedScroll(mNestedScrollingTarget);
	//   19   41:aload_0         
	//   20   42:aload_0         
	//   21   43:getfield        #1039 <Field View mNestedScrollingTarget>
	//   22   46:invokevirtual   #1042 <Method void onStopNestedScroll(View)>
		mIsAttachedToWindow = false;
	//   23   49:aload_0         
	//   24   50:iconst_0        
	//   25   51:putfield        #719 <Field boolean mIsAttachedToWindow>
	//   26   54:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1046 <Method void ViewGroup.onDraw(Canvas)>
		if(mDrawStatusBarBackground && mStatusBarBackground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #1048 <Field boolean mDrawStatusBarBackground>
	//*   5    9:ifeq            65
	//*   6   12:aload_0         
	//*   7   13:getfield        #230 <Field Drawable mStatusBarBackground>
	//*   8   16:ifnull          65
		{
			int i;
			if(mLastInsets != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//*  11   23:ifnull          37
				i = mLastInsets.getSystemWindowInsetTop();
	//   12   26:aload_0         
	//   13   27:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//   14   30:invokevirtual   #446 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
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
	//   22   44:getfield        #230 <Field Drawable mStatusBarBackground>
	//   23   47:iconst_0        
	//   24   48:iconst_0        
	//   25   49:aload_0         
	//   26   50:invokevirtual   #262 <Method int getWidth()>
	//   27   53:iload_2         
	//   28   54:invokevirtual   #1051 <Method void Drawable.setBounds(int, int, int, int)>
				mStatusBarBackground.draw(canvas);
	//   29   57:aload_0         
	//   30   58:getfield        #230 <Field Drawable mStatusBarBackground>
	//   31   61:aload_1         
	//   32   62:invokevirtual   #1054 <Method void Drawable.draw(Canvas)>
			}
		}
	//   33   65:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1058 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			resetTouchBehaviors(true);
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:invokespecial   #989 <Method void resetTouchBehaviors(boolean)>
		boolean flag = performIntercept(motionevent, 0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:invokespecial   #1060 <Method boolean performIntercept(MotionEvent, int)>
	//   12   20:istore_3        
		if(i == 1 || i == 3)
	//*  13   21:iload_2         
	//*  14   22:iconst_1        
	//*  15   23:icmpeq          31
	//*  16   26:iload_2         
	//*  17   27:iconst_3        
	//*  18   28:icmpne          36
			resetTouchBehaviors(true);
	//   19   31:aload_0         
	//   20   32:iconst_1        
	//   21   33:invokespecial   #989 <Method void resetTouchBehaviors(boolean)>
		return flag;
	//   22   36:iload_3         
	//   23   37:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #997 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_3        
		k = mDependencySortedChildren.size();
	//    3    5:aload_0         
	//    4    6:getfield        #159 <Field List mDependencySortedChildren>
	//    5    9:invokeinterface #748 <Method int List.size()>
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
	//   13   25:getfield        #159 <Field List mDependencySortedChildren>
	//   14   28:iload_2         
	//   15   29:invokeinterface #751 <Method Object List.get(int)>
	//   16   34:checkcast       #330 <Class View>
	//   17   37:astore          6
			if(view.getVisibility() == 8)
	//*  18   39:aload           6
	//*  19   41:invokevirtual   #759 <Method int View.getVisibility()>
	//*  20   44:bipush          8
	//*  21   46:icmpne          52
				continue;
	//   22   49:goto            89
			Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//   23   52:aload           6
	//   24   54:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   57:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   26   60:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   27   63:astore          7
			if(behavior == null || !behavior.onLayoutChild(this, view, j))
	//*  28   65:aload           7
	//*  29   67:ifnull          82
	//*  30   70:aload           7
	//*  31   72:aload_0         
	//*  32   73:aload           6
	//*  33   75:iload_3         
	//*  34   76:invokevirtual   #1066 <Method boolean CoordinatorLayout$Behavior.onLayoutChild(CoordinatorLayout, View, int)>
	//*  35   79:ifne            89
				onLayoutChild(view, j);
	//   36   82:aload_0         
	//   37   83:aload           6
	//   38   85:iload_3         
	//   39   86:invokevirtual   #1068 <Method void onLayoutChild(View, int)>
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
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:astore_3        
		if(layoutparams.checkAnchorChanged())
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #1071 <Method boolean CoordinatorLayout$LayoutParams.checkAnchorChanged()>
	//*   6   12:ifeq            26
			throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
	//    7   15:new             #1073 <Class IllegalStateException>
	//    8   18:dup             
	//    9   19:ldc2            #1075 <String "An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.">
	//   10   22:invokespecial   #1076 <Method void IllegalStateException(String)>
	//   11   25:athrow          
		if(layoutparams.mAnchorView != null)
	//*  12   26:aload_3         
	//*  13   27:getfield        #984 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//*  14   30:ifnull          44
		{
			layoutChildWithAnchor(view, layoutparams.mAnchorView, i);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:aload_3         
	//   18   36:getfield        #984 <Field View CoordinatorLayout$LayoutParams.mAnchorView>
	//   19   39:iload_2         
	//   20   40:invokespecial   #1078 <Method void layoutChildWithAnchor(View, View, int)>
			return;
	//   21   43:return          
		}
		if(layoutparams.keyline >= 0)
	//*  22   44:aload_3         
	//*  23   45:getfield        #1081 <Field int CoordinatorLayout$LayoutParams.keyline>
	//*  24   48:iflt            62
		{
			layoutChildWithKeyline(view, layoutparams.keyline, i);
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:aload_3         
	//   28   54:getfield        #1081 <Field int CoordinatorLayout$LayoutParams.keyline>
	//   29   57:iload_2         
	//   30   58:invokespecial   #1083 <Method void layoutChildWithKeyline(View, int, int)>
			return;
	//   31   61:return          
		} else
		{
			layoutChild(view, i);
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:iload_2         
	//   35   65:invokespecial   #1085 <Method void layoutChild(View, int)>
			return;
	//   36   68:return          
		}
	}

	protected void onMeasure(int i, int j)
	{
		prepareChildren();
	//    0    0:aload_0         
	//    1    1:invokespecial   #903 <Method void prepareChildren()>
		ensurePreDrawListener();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #1088 <Method void ensurePreDrawListener()>
		int l2 = getPaddingLeft();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #268 <Method int getPaddingLeft()>
	//    6   12:istore          13
		int i3 = getPaddingTop();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #291 <Method int getPaddingTop()>
	//    9   18:istore          14
		int j3 = getPaddingRight();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #277 <Method int getPaddingRight()>
	//   12   24:istore          15
		int k3 = getPaddingBottom();
	//   13   26:aload_0         
	//   14   27:invokevirtual   #300 <Method int getPaddingBottom()>
	//   15   30:istore          16
		int l3 = ViewCompat.getLayoutDirection(((View) (this)));
	//   16   32:aload_0         
	//   17   33:invokestatic    #997 <Method int ViewCompat.getLayoutDirection(View)>
	//   18   36:istore          17
		boolean flag;
		if(l3 == 1)
	//*  19   38:iload           17
	//*  20   40:iconst_1        
	//*  21   41:icmpne          50
			flag = true;
	//   22   44:iconst_1        
	//   23   45:istore          6
		else
	//*  24   47:goto            53
			flag = false;
	//   25   50:iconst_0        
	//   26   51:istore          6
		int i4 = android.view.View.MeasureSpec.getMode(i);
	//   27   53:iload_1         
	//   28   54:invokestatic    #1093 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   29   57:istore          18
		int j4 = android.view.View.MeasureSpec.getSize(i);
	//   30   59:iload_1         
	//   31   60:invokestatic    #1096 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   32   63:istore          19
		int k4 = android.view.View.MeasureSpec.getMode(j);
	//   33   65:iload_2         
	//   34   66:invokestatic    #1093 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   35   69:istore          20
		int l4 = android.view.View.MeasureSpec.getSize(j);
	//   36   71:iload_2         
	//   37   72:invokestatic    #1096 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   38   75:istore          21
		int l1 = getSuggestedMinimumWidth();
	//   39   77:aload_0         
	//   40   78:invokevirtual   #1097 <Method int getSuggestedMinimumWidth()>
	//   41   81:istore          10
		int l = getSuggestedMinimumHeight();
	//   42   83:aload_0         
	//   43   84:invokevirtual   #1098 <Method int getSuggestedMinimumHeight()>
	//   44   87:istore          4
		boolean flag1;
		if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  45   89:aload_0         
	//*  46   90:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//*  47   93:ifnull          109
	//*  48   96:aload_0         
	//*  49   97:invokestatic    #328 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  50  100:ifeq            109
			flag1 = true;
	//   51  103:iconst_1        
	//   52  104:istore          7
		else
	//*  53  106:goto            112
			flag1 = false;
	//   54  109:iconst_0        
	//   55  110:istore          7
		int j1 = mDependencySortedChildren.size();
	//   56  112:aload_0         
	//   57  113:getfield        #159 <Field List mDependencySortedChildren>
	//   58  116:invokeinterface #748 <Method int List.size()>
	//   59  121:istore          8
		int i1 = 0;
	//   60  123:iconst_0        
	//   61  124:istore          5
		for(int k1 = 0; k1 < j1; k1++)
	//*  62  126:iconst_0        
	//*  63  127:istore          9
	//*  64  129:iload           9
	//*  65  131:iload           8
	//*  66  133:icmpge          516
		{
			int k;
			View view;
			LayoutParams layoutparams;
label0:
			{
				view = (View)mDependencySortedChildren.get(k1);
	//   67  136:aload_0         
	//   68  137:getfield        #159 <Field List mDependencySortedChildren>
	//   69  140:iload           9
	//   70  142:invokeinterface #751 <Method Object List.get(int)>
	//   71  147:checkcast       #330 <Class View>
	//   72  150:astore          24
				if(view.getVisibility() == 8)
	//*  73  152:aload           24
	//*  74  154:invokevirtual   #759 <Method int View.getVisibility()>
	//*  75  157:bipush          8
	//*  76  159:icmpne          165
					continue;
	//   77  162:goto            507
				layoutparams = (LayoutParams)view.getLayoutParams();
	//   78  165:aload           24
	//   79  167:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   80  170:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   81  173:astore          25
				if(layoutparams.keyline >= 0 && i4 != 0)
	//*  82  175:aload           25
	//*  83  177:getfield        #1081 <Field int CoordinatorLayout$LayoutParams.keyline>
	//*  84  180:iflt            287
	//*  85  183:iload           18
	//*  86  185:ifeq            287
				{
					k = getKeyline(layoutparams.keyline);
	//   87  188:aload_0         
	//   88  189:aload           25
	//   89  191:getfield        #1081 <Field int CoordinatorLayout$LayoutParams.keyline>
	//   90  194:invokespecial   #486 <Method int getKeyline(int)>
	//   91  197:istore_3        
					int i2 = GravityCompat.getAbsoluteGravity(resolveKeylineGravity(layoutparams.gravity), l3) & 7;
	//   92  198:aload           25
	//   93  200:getfield        #347 <Field int CoordinatorLayout$LayoutParams.gravity>
	//   94  203:invokestatic    #484 <Method int resolveKeylineGravity(int)>
	//   95  206:iload           17
	//   96  208:invokestatic    #356 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//   97  211:bipush          7
	//   98  213:iand            
	//   99  214:istore          11
					if(i2 == 3 && !flag || i2 == 5 && flag)
	//* 100  216:iload           11
	//* 101  218:iconst_3        
	//* 102  219:icmpne          227
	//* 103  222:iload           6
	//* 104  224:ifeq            238
	//* 105  227:iload           11
	//* 106  229:iconst_5        
	//* 107  230:icmpne          253
	//* 108  233:iload           6
	//* 109  235:ifeq            253
					{
						k = Math.max(0, j4 - j3 - k);
	//  110  238:iconst_0        
	//  111  239:iload           19
	//  112  241:iload           15
	//  113  243:isub            
	//  114  244:iload_3         
	//  115  245:isub            
	//  116  246:invokestatic    #288 <Method int Math.max(int, int)>
	//  117  249:istore_3        
						break label0;
	//  118  250:goto            289
					}
					if(i2 == 5 && !flag || i2 == 3 && flag)
	//* 119  253:iload           11
	//* 120  255:iconst_5        
	//* 121  256:icmpne          264
	//* 122  259:iload           6
	//* 123  261:ifeq            275
	//* 124  264:iload           11
	//* 125  266:iconst_3        
	//* 126  267:icmpne          287
	//* 127  270:iload           6
	//* 128  272:ifeq            287
					{
						k = Math.max(0, k - l2);
	//  129  275:iconst_0        
	//  130  276:iload_3         
	//  131  277:iload           13
	//  132  279:isub            
	//  133  280:invokestatic    #288 <Method int Math.max(int, int)>
	//  134  283:istore_3        
						break label0;
	//  135  284:goto            289
					}
				}
				k = 0;
	//  136  287:iconst_0        
	//  137  288:istore_3        
			}
			int j2 = i1;
	//  138  289:iload           5
	//  139  291:istore          11
			int k2 = l;
	//  140  293:iload           4
	//  141  295:istore          12
			if(flag1 && !ViewCompat.getFitsSystemWindows(view))
	//* 142  297:iload           7
	//* 143  299:ifeq            379
	//* 144  302:aload           24
	//* 145  304:invokestatic    #328 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 146  307:ifne            379
			{
				l = mLastInsets.getSystemWindowInsetLeft();
	//  147  310:aload_0         
	//  148  311:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//  149  314:invokevirtual   #443 <Method int WindowInsetsCompat.getSystemWindowInsetLeft()>
	//  150  317:istore          4
				int j5 = mLastInsets.getSystemWindowInsetRight();
	//  151  319:aload_0         
	//  152  320:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//  153  323:invokevirtual   #449 <Method int WindowInsetsCompat.getSystemWindowInsetRight()>
	//  154  326:istore          23
				i1 = mLastInsets.getSystemWindowInsetTop();
	//  155  328:aload_0         
	//  156  329:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//  157  332:invokevirtual   #446 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//  158  335:istore          5
				int i5 = mLastInsets.getSystemWindowInsetBottom();
	//  159  337:aload_0         
	//  160  338:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//  161  341:invokevirtual   #452 <Method int WindowInsetsCompat.getSystemWindowInsetBottom()>
	//  162  344:istore          22
				l = android.view.View.MeasureSpec.makeMeasureSpec(j4 - (l + j5), i4);
	//  163  346:iload           19
	//  164  348:iload           4
	//  165  350:iload           23
	//  166  352:iadd            
	//  167  353:isub            
	//  168  354:iload           18
	//  169  356:invokestatic    #1101 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  170  359:istore          4
				i1 = android.view.View.MeasureSpec.makeMeasureSpec(l4 - (i1 + i5), k4);
	//  171  361:iload           21
	//  172  363:iload           5
	//  173  365:iload           22
	//  174  367:iadd            
	//  175  368:isub            
	//  176  369:iload           20
	//  177  371:invokestatic    #1101 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  178  374:istore          5
			} else
	//* 179  376:goto            385
			{
				l = i;
	//  180  379:iload_1         
	//  181  380:istore          4
				i1 = j;
	//  182  382:iload_2         
	//  183  383:istore          5
			}
			Behavior behavior = layoutparams.getBehavior();
	//  184  385:aload           25
	//  185  387:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//  186  390:astore          26
			if(behavior == null || !behavior.onMeasureChild(this, view, l, k, i1, 0))
	//* 187  392:aload           26
	//* 188  394:ifnull          420
	//* 189  397:aload           26
	//* 190  399:aload_0         
	//* 191  400:aload           24
	//* 192  402:iload           4
	//* 193  404:iload_3         
	//* 194  405:iload           5
	//* 195  407:iconst_0        
	//* 196  408:invokevirtual   #1105 <Method boolean CoordinatorLayout$Behavior.onMeasureChild(CoordinatorLayout, View, int, int, int, int)>
	//* 197  411:ifne            417
	//* 198  414:goto            420
	//* 199  417:goto            435
				onMeasureChild(view, l, k, i1, 0);
	//  200  420:aload_0         
	//  201  421:aload           24
	//  202  423:iload           4
	//  203  425:iload_3         
	//  204  426:iload           5
	//  205  428:iconst_0        
	//  206  429:invokevirtual   #1108 <Method void onMeasureChild(View, int, int, int, int)>
	//* 207  432:goto            417
			l1 = Math.max(l1, l2 + j3 + view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin);
	//  208  435:iload           10
	//  209  437:iload           13
	//  210  439:iload           15
	//  211  441:iadd            
	//  212  442:aload           24
	//  213  444:invokevirtual   #455 <Method int View.getMeasuredWidth()>
	//  214  447:iadd            
	//  215  448:aload           25
	//  216  450:getfield        #271 <Field int CoordinatorLayout$LayoutParams.leftMargin>
	//  217  453:iadd            
	//  218  454:aload           25
	//  219  456:getfield        #280 <Field int CoordinatorLayout$LayoutParams.rightMargin>
	//  220  459:iadd            
	//  221  460:invokestatic    #288 <Method int Math.max(int, int)>
	//  222  463:istore          10
			l = Math.max(k2, i3 + k3 + view.getMeasuredHeight() + layoutparams.topMargin + layoutparams.bottomMargin);
	//  223  465:iload           12
	//  224  467:iload           14
	//  225  469:iload           16
	//  226  471:iadd            
	//  227  472:aload           24
	//  228  474:invokevirtual   #458 <Method int View.getMeasuredHeight()>
	//  229  477:iadd            
	//  230  478:aload           25
	//  231  480:getfield        #294 <Field int CoordinatorLayout$LayoutParams.topMargin>
	//  232  483:iadd            
	//  233  484:aload           25
	//  234  486:getfield        #303 <Field int CoordinatorLayout$LayoutParams.bottomMargin>
	//  235  489:iadd            
	//  236  490:invokestatic    #288 <Method int Math.max(int, int)>
	//  237  493:istore          4
			i1 = View.combineMeasuredStates(j2, view.getMeasuredState());
	//  238  495:iload           11
	//  239  497:aload           24
	//  240  499:invokevirtual   #1111 <Method int View.getMeasuredState()>
	//  241  502:invokestatic    #1114 <Method int View.combineMeasuredStates(int, int)>
	//  242  505:istore          5
		}

	//  243  507:iload           9
	//  244  509:iconst_1        
	//  245  510:iadd            
	//  246  511:istore          9
	//* 247  513:goto            129
		setMeasuredDimension(View.resolveSizeAndState(l1, i, 0xff000000 & i1), View.resolveSizeAndState(l, j, i1 << 16));
	//  248  516:aload_0         
	//  249  517:iload           10
	//  250  519:iload_1         
	//  251  520:ldc2            #1115 <Int 0xff000000>
	//  252  523:iload           5
	//  253  525:iand            
	//  254  526:invokestatic    #1118 <Method int View.resolveSizeAndState(int, int, int)>
	//  255  529:iload           4
	//  256  531:iload_2         
	//  257  532:iload           5
	//  258  534:bipush          16
	//  259  536:ishl            
	//  260  537:invokestatic    #1118 <Method int View.resolveSizeAndState(int, int, int)>
	//  261  540:invokevirtual   #1121 <Method void setMeasuredDimension(int, int)>
	//  262  543:return          
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
	//    6    8:invokevirtual   #1124 <Method void measureChildWithMargins(View, int, int, int, int)>
	//    7   11:return          
	}

	public boolean onNestedFling(View view, float f, float f1, boolean flag)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #619 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1128 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #629 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public boolean onNestedPreFling(View view, float f, float f1)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #619 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1128 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #629 <Method void Runtime(String)>
	//    4   10:athrow          
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
	//    6    7:invokevirtual   #1135 <Method void onNestedPreScroll(View, int, int, int[], int)>
	//    7   10:return          
	}

	public void onNestedPreScroll(View view, int i, int j, int ai[], int k)
	{
		int i2 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method int getChildCount()>
	//    2    4:istore          12
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore          10
		boolean flag = flag1;
	//    5    9:iload           10
	//    6   11:istore          6
		int i1 = ((int) (flag));
	//    7   13:iload           6
	//    8   15:istore          7
		int k1 = i1;
	//    9   17:iload           7
	//   10   19:istore          9
		int j1 = ((int) (flag));
	//   11   21:iload           6
	//   12   23:istore          8
		boolean flag2 = flag1;
	//   13   25:iload           10
	//   14   27:istore          11
		while(j1 < i2) 
	//*  15   29:iload           8
	//*  16   31:iload           12
	//*  17   33:icmpge          245
		{
			View view1 = getChildAt(j1);
	//   18   36:aload_0         
	//   19   37:iload           8
	//   20   39:invokevirtual   #322 <Method View getChildAt(int)>
	//   21   42:astore          13
			int l;
			int l1;
			if(view1.getVisibility() == 8)
	//*  22   44:aload           13
	//*  23   46:invokevirtual   #759 <Method int View.getVisibility()>
	//*  24   49:bipush          8
	//*  25   51:icmpne          65
			{
				l1 = i1;
	//   26   54:iload           7
	//   27   56:istore          10
				l = k1;
	//   28   58:iload           9
	//   29   60:istore          6
			} else
	//*  30   62:goto            228
			{
				Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   31   65:aload           13
	//   32   67:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   33   70:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   34   73:astore          14
				if(!((LayoutParams) (obj)).isNestedScrollAccepted(k))
	//*  35   75:aload           14
	//*  36   77:iload           5
	//*  37   79:invokevirtual   #1139 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  38   82:ifne            96
				{
					l1 = i1;
	//   39   85:iload           7
	//   40   87:istore          10
					l = k1;
	//   41   89:iload           9
	//   42   91:istore          6
				} else
	//*  43   93:goto            228
				{
					obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   44   96:aload           14
	//   45   98:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   46  101:astore          14
					l1 = i1;
	//   47  103:iload           7
	//   48  105:istore          10
					l = k1;
	//   49  107:iload           9
	//   50  109:istore          6
					if(obj != null)
	//*  51  111:aload           14
	//*  52  113:ifnull          228
					{
						int ai1[] = mTempIntPair;
	//   53  116:aload_0         
	//   54  117:getfield        #170 <Field int[] mTempIntPair>
	//   55  120:astore          15
						mTempIntPair[1] = 0;
	//   56  122:aload_0         
	//   57  123:getfield        #170 <Field int[] mTempIntPair>
	//   58  126:iconst_1        
	//   59  127:iconst_0        
	//   60  128:iastore         
						ai1[0] = 0;
	//   61  129:aload           15
	//   62  131:iconst_0        
	//   63  132:iconst_0        
	//   64  133:iastore         
						((Behavior) (obj)).onNestedPreScroll(this, view1, view, i, j, mTempIntPair, k);
	//   65  134:aload           14
	//   66  136:aload_0         
	//   67  137:aload           13
	//   68  139:aload_1         
	//   69  140:iload_2         
	//   70  141:iload_3         
	//   71  142:aload_0         
	//   72  143:getfield        #170 <Field int[] mTempIntPair>
	//   73  146:iload           5
	//   74  148:invokevirtual   #1142 <Method void CoordinatorLayout$Behavior.onNestedPreScroll(CoordinatorLayout, View, View, int, int, int[], int)>
						if(i > 0)
	//*  75  151:iload_2         
	//*  76  152:ifle            171
							l = Math.max(i1, mTempIntPair[0]);
	//   77  155:iload           7
	//   78  157:aload_0         
	//   79  158:getfield        #170 <Field int[] mTempIntPair>
	//   80  161:iconst_0        
	//   81  162:iaload          
	//   82  163:invokestatic    #288 <Method int Math.max(int, int)>
	//   83  166:istore          6
						else
	//*  84  168:goto            184
							l = Math.min(i1, mTempIntPair[0]);
	//   85  171:iload           7
	//   86  173:aload_0         
	//   87  174:getfield        #170 <Field int[] mTempIntPair>
	//   88  177:iconst_0        
	//   89  178:iaload          
	//   90  179:invokestatic    #285 <Method int Math.min(int, int)>
	//   91  182:istore          6
						if(j > 0)
	//*  92  184:iload_3         
	//*  93  185:ifle            204
							i1 = Math.max(k1, mTempIntPair[1]);
	//   94  188:iload           9
	//   95  190:aload_0         
	//   96  191:getfield        #170 <Field int[] mTempIntPair>
	//   97  194:iconst_1        
	//   98  195:iaload          
	//   99  196:invokestatic    #288 <Method int Math.max(int, int)>
	//  100  199:istore          7
						else
	//* 101  201:goto            217
							i1 = Math.min(k1, mTempIntPair[1]);
	//  102  204:iload           9
	//  103  206:aload_0         
	//  104  207:getfield        #170 <Field int[] mTempIntPair>
	//  105  210:iconst_1        
	//  106  211:iaload          
	//  107  212:invokestatic    #285 <Method int Math.min(int, int)>
	//  108  215:istore          7
						l1 = l;
	//  109  217:iload           6
	//  110  219:istore          10
						l = i1;
	//  111  221:iload           7
	//  112  223:istore          6
						flag2 = true;
	//  113  225:iconst_1        
	//  114  226:istore          11
					}
				}
			}
			j1++;
	//  115  228:iload           8
	//  116  230:iconst_1        
	//  117  231:iadd            
	//  118  232:istore          8
			i1 = l1;
	//  119  234:iload           10
	//  120  236:istore          7
			k1 = l;
	//  121  238:iload           6
	//  122  240:istore          9
		}
	//* 123  242:goto            29
		ai[0] = i1;
	//  124  245:aload           4
	//  125  247:iconst_0        
	//  126  248:iload           7
	//  127  250:iastore         
		ai[1] = k1;
	//  128  251:aload           4
	//  129  253:iconst_1        
	//  130  254:iload           9
	//  131  256:iastore         
		if(flag2)
	//* 132  257:iload           11
	//* 133  259:ifeq            267
			onChildViewsChanged(1);
	//  134  262:aload_0         
	//  135  263:iconst_1        
	//  136  264:invokevirtual   #1144 <Method void onChildViewsChanged(int)>
	//  137  267:return          
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
	//    7    9:invokevirtual   #1148 <Method void onNestedScroll(View, int, int, int, int, int)>
	//    8   12:return          
	}

	public void onNestedScroll(View view, int i, int j, int k, int l, int i1)
	{
		int k1 = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #318 <Method int getChildCount()>
	//    2    4:istore          9
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          8
		for(int j1 = 0; j1 < k1; j1++)
	//*   5    9:iconst_0        
	//*   6   10:istore          7
	//*   7   12:iload           7
	//*   8   14:iload           9
	//*   9   16:icmpge          104
		{
			View view1 = getChildAt(j1);
	//   10   19:aload_0         
	//   11   20:iload           7
	//   12   22:invokevirtual   #322 <Method View getChildAt(int)>
	//   13   25:astore          10
			if(view1.getVisibility() == 8)
	//*  14   27:aload           10
	//*  15   29:invokevirtual   #759 <Method int View.getVisibility()>
	//*  16   32:bipush          8
	//*  17   34:icmpne          40
				continue;
	//   18   37:goto            95
			Object obj = ((Object) ((LayoutParams)view1.getLayoutParams()));
	//   19   40:aload           10
	//   20   42:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   45:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   22   48:astore          11
			if(!((LayoutParams) (obj)).isNestedScrollAccepted(i1))
	//*  23   50:aload           11
	//*  24   52:iload           6
	//*  25   54:invokevirtual   #1139 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  26   57:ifne            63
				continue;
	//   27   60:goto            95
			obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   28   63:aload           11
	//   29   65:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   30   68:astore          11
			if(obj != null)
	//*  31   70:aload           11
	//*  32   72:ifnull          95
			{
				((Behavior) (obj)).onNestedScroll(this, view1, view, i, j, k, l, i1);
	//   33   75:aload           11
	//   34   77:aload_0         
	//   35   78:aload           10
	//   36   80:aload_1         
	//   37   81:iload_2         
	//   38   82:iload_3         
	//   39   83:iload           4
	//   40   85:iload           5
	//   41   87:iload           6
	//   42   89:invokevirtual   #1151 <Method void CoordinatorLayout$Behavior.onNestedScroll(CoordinatorLayout, View, View, int, int, int, int, int)>
				flag = true;
	//   43   92:iconst_1        
	//   44   93:istore          8
			}
		}

	//   45   95:iload           7
	//   46   97:iconst_1        
	//   47   98:iadd            
	//   48   99:istore          7
	//*  49  101:goto            12
		if(flag)
	//*  50  104:iload           8
	//*  51  106:ifeq            114
			onChildViewsChanged(1);
	//   52  109:aload_0         
	//   53  110:iconst_1        
	//   54  111:invokevirtual   #1144 <Method void onChildViewsChanged(int)>
	//   55  114:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i)
	{
		onNestedScrollAccepted(view, view1, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #1155 <Method void onNestedScrollAccepted(View, View, int, int)>
	//    6    8:return          
	}

	public void onNestedScrollAccepted(View view, View view1, int i, int j)
	{
		mNestedScrollingParentHelper.onNestedScrollAccepted(view, view1, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #1156 <Method void NestedScrollingParentHelper.onNestedScrollAccepted(View, View, int, int)>
		mNestedScrollingTarget = view1;
	//    7   12:aload_0         
	//    8   13:aload_2         
	//    9   14:putfield        #1039 <Field View mNestedScrollingTarget>
		int l = getChildCount();
	//   10   17:aload_0         
	//   11   18:invokevirtual   #318 <Method int getChildCount()>
	//   12   21:istore          6
		for(int k = 0; k < l; k++)
	//*  13   23:iconst_0        
	//*  14   24:istore          5
	//*  15   26:iload           5
	//*  16   28:iload           6
	//*  17   30:icmpge          98
		{
			View view2 = getChildAt(k);
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:invokevirtual   #322 <Method View getChildAt(int)>
	//   21   39:astore          7
			Object obj = ((Object) ((LayoutParams)view2.getLayoutParams()));
	//   22   41:aload           7
	//   23   43:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   46:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   25   49:astore          8
			if(!((LayoutParams) (obj)).isNestedScrollAccepted(j))
	//*  26   51:aload           8
	//*  27   53:iload           4
	//*  28   55:invokevirtual   #1139 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  29   58:ifne            64
				continue;
	//   30   61:goto            89
			obj = ((Object) (((LayoutParams) (obj)).getBehavior()));
	//   31   64:aload           8
	//   32   66:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   33   69:astore          8
			if(obj != null)
	//*  34   71:aload           8
	//*  35   73:ifnull          89
				((Behavior) (obj)).onNestedScrollAccepted(this, view2, view, view1, i, j);
	//   36   76:aload           8
	//   37   78:aload_0         
	//   38   79:aload           7
	//   39   81:aload_1         
	//   40   82:aload_2         
	//   41   83:iload_3         
	//   42   84:iload           4
	//   43   86:invokevirtual   #1159 <Method void CoordinatorLayout$Behavior.onNestedScrollAccepted(CoordinatorLayout, View, View, View, int, int)>
		}

	//   44   89:iload           5
	//   45   91:iconst_1        
	//   46   92:iadd            
	//   47   93:istore          5
	//*  48   95:goto            26
	//   49   98:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #31  <Class CoordinatorLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #1163 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #31  <Class CoordinatorLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #1167 <Method Parcelable CoordinatorLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #1163 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		parcelable = ((Parcelable) (((SavedState) (parcelable)).behaviorStates));
	//   14   26:aload_1         
	//   15   27:getfield        #1171 <Field SparseArray CoordinatorLayout$SavedState.behaviorStates>
	//   16   30:astore_1        
		int i = 0;
	//   17   31:iconst_0        
	//   18   32:istore_2        
		for(int j = getChildCount(); i < j; i++)
	//*  19   33:aload_0         
	//*  20   34:invokevirtual   #318 <Method int getChildCount()>
	//*  21   37:istore_3        
	//*  22   38:iload_2         
	//*  23   39:iload_3         
	//*  24   40:icmpge          112
		{
			View view = getChildAt(i);
	//   25   43:aload_0         
	//   26   44:iload_2         
	//   27   45:invokevirtual   #322 <Method View getChildAt(int)>
	//   28   48:astore          5
			int k = view.getId();
	//   29   50:aload           5
	//   30   52:invokevirtual   #1174 <Method int View.getId()>
	//   31   55:istore          4
			Behavior behavior = getResolvedLayoutParams(view).getBehavior();
	//   32   57:aload_0         
	//   33   58:aload           5
	//   34   60:invokevirtual   #635 <Method CoordinatorLayout$LayoutParams getResolvedLayoutParams(View)>
	//   35   63:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
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
	//   44   82:invokevirtual   #1177 <Method Object SparseArray.get(int)>
	//   45   85:checkcast       #1179 <Class Parcelable>
	//   46   88:astore          7
			if(parcelable1 != null)
	//*  47   90:aload           7
	//*  48   92:ifnull          105
				behavior.onRestoreInstanceState(this, view, parcelable1);
	//   49   95:aload           6
	//   50   97:aload_0         
	//   51   98:aload           5
	//   52  100:aload           7
	//   53  102:invokevirtual   #1182 <Method void CoordinatorLayout$Behavior.onRestoreInstanceState(CoordinatorLayout, View, Parcelable)>
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
	//    0    0:new             #31  <Class CoordinatorLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #1185 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #1187 <Method void CoordinatorLayout$SavedState(Parcelable)>
	//    5   11:astore          4
		SparseArray sparsearray = new SparseArray();
	//    6   13:new             #1176 <Class SparseArray>
	//    7   16:dup             
	//    8   17:invokespecial   #1188 <Method void SparseArray()>
	//    9   20:astore          5
		int j = getChildCount();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #318 <Method int getChildCount()>
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
	//   20   36:invokevirtual   #322 <Method View getChildAt(int)>
	//   21   39:astore          6
			int k = ((View) (obj)).getId();
	//   22   41:aload           6
	//   23   43:invokevirtual   #1174 <Method int View.getId()>
	//   24   46:istore_3        
			Behavior behavior = ((LayoutParams)((View) (obj)).getLayoutParams()).getBehavior();
	//   25   47:aload           6
	//   26   49:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   27   52:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   28   55:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
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
	//   38   75:invokevirtual   #1191 <Method Parcelable CoordinatorLayout$Behavior.onSaveInstanceState(CoordinatorLayout, View)>
	//   39   78:astore          6
			if(obj != null)
	//*  40   80:aload           6
	//*  41   82:ifnull          93
				sparsearray.append(k, obj);
	//   42   85:aload           5
	//   43   87:iload_3         
	//   44   88:aload           6
	//   45   90:invokevirtual   #1194 <Method void SparseArray.append(int, Object)>
		}

	//   46   93:iload_1         
	//   47   94:iconst_1        
	//   48   95:iadd            
	//   49   96:istore_1        
	//*  50   97:goto            29
		savedstate.behaviorStates = sparsearray;
	//   51  100:aload           4
	//   52  102:aload           5
	//   53  104:putfield        #1171 <Field SparseArray CoordinatorLayout$SavedState.behaviorStates>
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
	//    5    5:invokevirtual   #1199 <Method boolean onStartNestedScroll(View, View, int, int)>
	//    6    8:ireturn         
	}

	public boolean onStartNestedScroll(View view, View view1, int i, int j)
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #619 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #1128 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #629 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	public void onStopNestedScroll(View view)
	{
		onStopNestedScroll(view, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #1201 <Method void onStopNestedScroll(View, int)>
	//    4    6:return          
	}

	public void onStopNestedScroll(View view, int i)
	{
		mNestedScrollingParentHelper.onStopNestedScroll(view, i);
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field NestedScrollingParentHelper mNestedScrollingParentHelper>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #1202 <Method void NestedScrollingParentHelper.onStopNestedScroll(View, int)>
		int k = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #318 <Method int getChildCount()>
	//    7   13:istore          4
		for(int j = 0; j < k; j++)
	//*   8   15:iconst_0        
	//*   9   16:istore_3        
	//*  10   17:iload_3         
	//*  11   18:iload           4
	//*  12   20:icmpge          92
		{
			View view1 = getChildAt(j);
	//   13   23:aload_0         
	//   14   24:iload_3         
	//   15   25:invokevirtual   #322 <Method View getChildAt(int)>
	//   16   28:astore          5
			LayoutParams layoutparams = (LayoutParams)view1.getLayoutParams();
	//   17   30:aload           5
	//   18   32:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   35:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   20   38:astore          6
			if(!layoutparams.isNestedScrollAccepted(i))
	//*  21   40:aload           6
	//*  22   42:iload_2         
	//*  23   43:invokevirtual   #1139 <Method boolean CoordinatorLayout$LayoutParams.isNestedScrollAccepted(int)>
	//*  24   46:ifne            52
				continue;
	//   25   49:goto            85
			Behavior behavior = layoutparams.getBehavior();
	//   26   52:aload           6
	//   27   54:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   28   57:astore          7
			if(behavior != null)
	//*  29   59:aload           7
	//*  30   61:ifnull          74
				behavior.onStopNestedScroll(this, view1, view, i);
	//   31   64:aload           7
	//   32   66:aload_0         
	//   33   67:aload           5
	//   34   69:aload_1         
	//   35   70:iload_2         
	//   36   71:invokevirtual   #1205 <Method void CoordinatorLayout$Behavior.onStopNestedScroll(CoordinatorLayout, View, View, int)>
			layoutparams.resetNestedScroll(i);
	//   37   74:aload           6
	//   38   76:iload_2         
	//   39   77:invokevirtual   #1208 <Method void CoordinatorLayout$LayoutParams.resetNestedScroll(int)>
			layoutparams.resetChangedAfterNestedScroll();
	//   40   80:aload           6
	//   41   82:invokevirtual   #1024 <Method void CoordinatorLayout$LayoutParams.resetChangedAfterNestedScroll()>
		}

	//   42   85:iload_3         
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore_3        
	//*  46   89:goto            17
		mNestedScrollingTarget = null;
	//   47   92:aload_0         
	//   48   93:aconst_null     
	//   49   94:putfield        #1039 <Field View mNestedScrollingTarget>
	//   50   97:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #1058 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(mBehaviorTouchView != null) goto _L2; else goto _L1
	//    3    5:aload_0         
	//    4    6:getfield        #696 <Field View mBehaviorTouchView>
	//    5    9:ifnonnull       42
_L1:
		boolean flag;
		boolean flag1;
		flag = performIntercept(motionevent, 1);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:invokespecial   #1060 <Method boolean performIntercept(MotionEvent, int)>
	//   10   18:istore_3        
		flag1 = flag;
	//   11   19:iload_3         
	//   12   20:istore          4
		if(!flag) goto _L4; else goto _L3
	//   13   22:iload_3         
	//   14   23:ifeq            29
	//*  15   26:goto            44
_L4:
		boolean flag2 = false;
	//   16   29:iconst_0        
	//   17   30:istore          5
		flag = flag1;
	//   18   32:iload           4
	//   19   34:istore_3        
		flag1 = flag2;
	//   20   35:iload           5
	//   21   37:istore          4
		break; /* Loop/switch isn't completed */
	//   22   39:goto            80
_L2:
		flag = false;
	//   23   42:iconst_0        
	//   24   43:istore_3        
_L3:
		Behavior behavior = ((LayoutParams)mBehaviorTouchView.getLayoutParams()).getBehavior();
	//   25   44:aload_0         
	//   26   45:getfield        #696 <Field View mBehaviorTouchView>
	//   27   48:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   51:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//   29   54:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//   30   57:astore          8
		flag1 = flag;
	//   31   59:iload_3         
	//   32   60:istore          4
		if(behavior == null)
			continue; /* Loop/switch isn't completed */
	//   33   62:aload           8
	//   34   64:ifnull          29
		flag1 = behavior.onTouchEvent(this, mBehaviorTouchView, motionevent);
	//   35   67:aload           8
	//   36   69:aload_0         
	//   37   70:aload_0         
	//   38   71:getfield        #696 <Field View mBehaviorTouchView>
	//   39   74:aload_1         
	//   40   75:invokevirtual   #690 <Method boolean CoordinatorLayout$Behavior.onTouchEvent(CoordinatorLayout, View, MotionEvent)>
	//   41   78:istore          4
		break; /* Loop/switch isn't completed */
		if(true) goto _L4; else goto _L5
_L5:
		View view = mBehaviorTouchView;
	//   42   80:aload_0         
	//   43   81:getfield        #696 <Field View mBehaviorTouchView>
	//   44   84:astore          9
		Object obj = null;
	//   45   86:aconst_null     
	//   46   87:astore          8
		boolean flag3;
		if(view == null)
	//*  47   89:aload           9
	//*  48   91:ifnonnull       110
		{
			flag3 = flag1 | super.onTouchEvent(motionevent);
	//   49   94:iload           4
	//   50   96:aload_0         
	//   51   97:aload_1         
	//   52   98:invokespecial   #1210 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   53  101:ior             
	//   54  102:istore          5
			motionevent = ((MotionEvent) (obj));
	//   55  104:aload           8
	//   56  106:astore_1        
		} else
	//*  57  107:goto            148
		{
			flag3 = flag1;
	//   58  110:iload           4
	//   59  112:istore          5
			motionevent = ((MotionEvent) (obj));
	//   60  114:aload           8
	//   61  116:astore_1        
			if(flag)
	//*  62  117:iload_3         
	//*  63  118:ifeq            148
			{
				long l = SystemClock.uptimeMillis();
	//   64  121:invokestatic    #677 <Method long SystemClock.uptimeMillis()>
	//   65  124:lstore          6
				motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//   66  126:lload           6
	//   67  128:lload           6
	//   68  130:iconst_3        
	//   69  131:fconst_0        
	//   70  132:fconst_0        
	//   71  133:iconst_0        
	//   72  134:invokestatic    #683 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   73  137:astore_1        
				super.onTouchEvent(motionevent);
	//   74  138:aload_0         
	//   75  139:aload_1         
	//   76  140:invokespecial   #1210 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   77  143:pop             
				flag3 = flag1;
	//   78  144:iload           4
	//   79  146:istore          5
			}
		}
		if(motionevent != null)
	//*  80  148:aload_1         
	//*  81  149:ifnull          156
			motionevent.recycle();
	//   82  152:aload_1         
	//   83  153:invokevirtual   #691 <Method void MotionEvent.recycle()>
		if(i == 1 || i == 3)
	//*  84  156:iload_2         
	//*  85  157:iconst_1        
	//*  86  158:icmpeq          166
	//*  87  161:iload_2         
	//*  88  162:iconst_3        
	//*  89  163:icmpne          171
			resetTouchBehaviors(false);
	//   90  166:aload_0         
	//   91  167:iconst_0        
	//   92  168:invokespecial   #989 <Method void resetTouchBehaviors(boolean)>
		return flag3;
	//   93  171:iload           5
	//   94  173:ireturn         
	}

	void recordLastChildRect(View view, Rect rect)
	{
		((LayoutParams)view.getLayoutParams()).setLastChildRect(rect);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:aload_2         
	//    4    8:invokevirtual   #1213 <Method void CoordinatorLayout$LayoutParams.setLastChildRect(Rect)>
	//    5   11:return          
	}

	void removePreDrawListener()
	{
		if(mIsAttachedToWindow && mOnPreDrawListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #719 <Field boolean mIsAttachedToWindow>
	//*   2    4:ifeq            25
	//*   3    7:aload_0         
	//*   4    8:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//*   5   11:ifnull          25
			getViewTreeObserver().removeOnPreDrawListener(((android.view.ViewTreeObserver.OnPreDrawListener) (mOnPreDrawListener)));
	//    6   14:aload_0         
	//    7   15:invokevirtual   #726 <Method ViewTreeObserver getViewTreeObserver()>
	//    8   18:aload_0         
	//    9   19:getfield        #721 <Field CoordinatorLayout$OnPreDrawListener mOnPreDrawListener>
	//   10   22:invokevirtual   #1037 <Method void ViewTreeObserver.removeOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		mNeedsPreDrawListener = false;
	//   11   25:aload_0         
	//   12   26:iconst_0        
	//   13   27:putfield        #734 <Field boolean mNeedsPreDrawListener>
	//   14   30:return          
	}

	public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
	{
		Behavior behavior = ((LayoutParams)view.getLayoutParams()).getBehavior();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #334 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #25  <Class CoordinatorLayout$LayoutParams>
	//    3    7:invokevirtual   #338 <Method CoordinatorLayout$Behavior CoordinatorLayout$LayoutParams.getBehavior()>
	//    4   10:astore          4
		if(behavior != null && behavior.onRequestChildRectangleOnScreen(this, view, rect, flag))
	//*   5   12:aload           4
	//*   6   14:ifnull          31
	//*   7   17:aload           4
	//*   8   19:aload_0         
	//*   9   20:aload_1         
	//*  10   21:aload_2         
	//*  11   22:iload_3         
	//*  12   23:invokevirtual   #1219 <Method boolean CoordinatorLayout$Behavior.onRequestChildRectangleOnScreen(CoordinatorLayout, View, Rect, boolean)>
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
	//   20   35:invokespecial   #1221 <Method boolean ViewGroup.requestChildRectangleOnScreen(View, Rect, boolean)>
	//   21   38:ireturn         
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1224 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		if(flag && !mDisallowInterceptReset)
	//*   3    5:iload_1         
	//*   4    6:ifeq            26
	//*   5    9:aload_0         
	//*   6   10:getfield        #698 <Field boolean mDisallowInterceptReset>
	//*   7   13:ifne            26
		{
			resetTouchBehaviors(false);
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:invokespecial   #989 <Method void resetTouchBehaviors(boolean)>
			mDisallowInterceptReset = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #698 <Field boolean mDisallowInterceptReset>
		}
	//   14   26:return          
	}

	public void setFitsSystemWindows(boolean flag)
	{
		super.setFitsSystemWindows(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1227 <Method void ViewGroup.setFitsSystemWindows(boolean)>
		setupForInsets();
	//    3    5:aload_0         
	//    4    6:invokespecial   #236 <Method void setupForInsets()>
	//    5    9:return          
	}

	public void setOnHierarchyChangeListener(android.view.ViewGroup.OnHierarchyChangeListener onhierarchychangelistener)
	{
		mOnHierarchyChangeListener = onhierarchychangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #1229 <Field android.view.ViewGroup$OnHierarchyChangeListener mOnHierarchyChangeListener>
	//    3    5:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		if(mStatusBarBackground != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #230 <Field Drawable mStatusBarBackground>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       122
		{
			Drawable drawable2 = mStatusBarBackground;
	//    4    8:aload_0         
	//    5    9:getfield        #230 <Field Drawable mStatusBarBackground>
	//    6   12:astore          4
			Drawable drawable1 = null;
	//    7   14:aconst_null     
	//    8   15:astore_3        
			if(drawable2 != null)
	//*   9   16:aload           4
	//*  10   18:ifnull          29
				mStatusBarBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (null)));
	//   11   21:aload_0         
	//   12   22:getfield        #230 <Field Drawable mStatusBarBackground>
	//   13   25:aconst_null     
	//   14   26:invokevirtual   #1235 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			if(drawable != null)
	//*  15   29:aload_1         
	//*  16   30:ifnull          38
				drawable1 = drawable.mutate();
	//   17   33:aload_1         
	//   18   34:invokevirtual   #1238 <Method Drawable Drawable.mutate()>
	//   19   37:astore_3        
			mStatusBarBackground = drawable1;
	//   20   38:aload_0         
	//   21   39:aload_3         
	//   22   40:putfield        #230 <Field Drawable mStatusBarBackground>
			if(mStatusBarBackground != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #230 <Field Drawable mStatusBarBackground>
	//*  25   47:ifnull          118
			{
				if(mStatusBarBackground.isStateful())
	//*  26   50:aload_0         
	//*  27   51:getfield        #230 <Field Drawable mStatusBarBackground>
	//*  28   54:invokevirtual   #842 <Method boolean Drawable.isStateful()>
	//*  29   57:ifeq            72
					mStatusBarBackground.setState(getDrawableState());
	//   30   60:aload_0         
	//   31   61:getfield        #230 <Field Drawable mStatusBarBackground>
	//   32   64:aload_0         
	//   33   65:invokevirtual   #837 <Method int[] getDrawableState()>
	//   34   68:invokevirtual   #846 <Method boolean Drawable.setState(int[])>
	//   35   71:pop             
				DrawableCompat.setLayoutDirection(mStatusBarBackground, ViewCompat.getLayoutDirection(((View) (this))));
	//   36   72:aload_0         
	//   37   73:getfield        #230 <Field Drawable mStatusBarBackground>
	//   38   76:aload_0         
	//   39   77:invokestatic    #997 <Method int ViewCompat.getLayoutDirection(View)>
	//   40   80:invokestatic    #1244 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   41   83:pop             
				drawable = mStatusBarBackground;
	//   42   84:aload_0         
	//   43   85:getfield        #230 <Field Drawable mStatusBarBackground>
	//   44   88:astore_1        
				boolean flag;
				if(getVisibility() == 0)
	//*  45   89:aload_0         
	//*  46   90:invokevirtual   #1245 <Method int getVisibility()>
	//*  47   93:ifne            101
					flag = true;
	//   48   96:iconst_1        
	//   49   97:istore_2        
				else
	//*  50   98:goto            103
					flag = false;
	//   51  101:iconst_0        
	//   52  102:istore_2        
				drawable.setVisible(flag, false);
	//   53  103:aload_1         
	//   54  104:iload_2         
	//   55  105:iconst_0        
	//   56  106:invokevirtual   #1249 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   57  109:pop             
				mStatusBarBackground.setCallback(((android.graphics.drawable.Drawable.Callback) (this)));
	//   58  110:aload_0         
	//   59  111:getfield        #230 <Field Drawable mStatusBarBackground>
	//   60  114:aload_0         
	//   61  115:invokevirtual   #1235 <Method void Drawable.setCallback(android.graphics.drawable.Drawable$Callback)>
			}
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   62  118:aload_0         
	//   63  119:invokestatic    #1252 <Method void ViewCompat.postInvalidateOnAnimation(View)>
		}
	//   64  122:return          
	}

	public void setStatusBarBackgroundColor(int i)
	{
		setStatusBarBackground(((Drawable) (new ColorDrawable(i))));
	//    0    0:aload_0         
	//    1    1:new             #1256 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #1257 <Method void ColorDrawable(int)>
	//    5    9:invokevirtual   #1259 <Method void setStatusBarBackground(Drawable)>
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
	//    3    5:invokevirtual   #870 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #1266 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setStatusBarBackground(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1259 <Method void setStatusBarBackground(Drawable)>
	//   13   23:return          
	}

	public void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #1269 <Method void ViewGroup.setVisibility(int)>
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
	//*  11   17:getfield        #230 <Field Drawable mStatusBarBackground>
	//*  12   20:ifnull          44
	//*  13   23:aload_0         
	//*  14   24:getfield        #230 <Field Drawable mStatusBarBackground>
	//*  15   27:invokevirtual   #1272 <Method boolean Drawable.isVisible()>
	//*  16   30:iload_2         
	//*  17   31:icmpeq          44
			mStatusBarBackground.setVisible(flag, false);
	//   18   34:aload_0         
	//   19   35:getfield        #230 <Field Drawable mStatusBarBackground>
	//   20   38:iload_2         
	//   21   39:iconst_0        
	//   22   40:invokevirtual   #1249 <Method boolean Drawable.setVisible(boolean, boolean)>
	//   23   43:pop             
	//   24   44:return          
	}

	final WindowInsetsCompat setWindowInsets(WindowInsetsCompat windowinsetscompat)
	{
		WindowInsetsCompat windowinsetscompat1 = windowinsetscompat;
	//    0    0:aload_1         
	//    1    1:astore          4
		if(!ObjectsCompat.equals(((Object) (mLastInsets)), ((Object) (windowinsetscompat))))
	//*   2    3:aload_0         
	//*   3    4:getfield        #440 <Field WindowInsetsCompat mLastInsets>
	//*   4    7:aload_1         
	//*   5    8:invokestatic    #1278 <Method boolean ObjectsCompat.equals(Object, Object)>
	//*   6   11:ifne            80
		{
			mLastInsets = windowinsetscompat;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #440 <Field WindowInsetsCompat mLastInsets>
			boolean flag1 = false;
	//   10   19:iconst_0        
	//   11   20:istore_3        
			boolean flag;
			if(windowinsetscompat != null && windowinsetscompat.getSystemWindowInsetTop() > 0)
	//*  12   21:aload_1         
	//*  13   22:ifnull          37
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #446 <Method int WindowInsetsCompat.getSystemWindowInsetTop()>
	//*  16   29:ifle            37
				flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_2        
			else
	//*  19   34:goto            39
				flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_2        
			mDrawStatusBarBackground = flag;
	//   22   39:aload_0         
	//   23   40:iload_2         
	//   24   41:putfield        #1048 <Field boolean mDrawStatusBarBackground>
			flag = flag1;
	//   25   44:iload_3         
	//   26   45:istore_2        
			if(!mDrawStatusBarBackground)
	//*  27   46:aload_0         
	//*  28   47:getfield        #1048 <Field boolean mDrawStatusBarBackground>
	//*  29   50:ifne            64
			{
				flag = flag1;
	//   30   53:iload_3         
	//   31   54:istore_2        
				if(getBackground() == null)
	//*  32   55:aload_0         
	//*  33   56:invokevirtual   #1281 <Method Drawable getBackground()>
	//*  34   59:ifnonnull       64
					flag = true;
	//   35   62:iconst_1        
	//   36   63:istore_2        
			}
			setWillNotDraw(flag);
	//   37   64:aload_0         
	//   38   65:iload_2         
	//   39   66:invokevirtual   #1284 <Method void setWillNotDraw(boolean)>
			windowinsetscompat1 = dispatchApplyWindowInsetsToBehaviors(windowinsetscompat);
	//   40   69:aload_0         
	//   41   70:aload_1         
	//   42   71:invokespecial   #1286 <Method WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat)>
	//   43   74:astore          4
			requestLayout();
	//   44   76:aload_0         
	//   45   77:invokevirtual   #1289 <Method void requestLayout()>
		}
		return windowinsetscompat1;
	//   46   80:aload           4
	//   47   82:areturn         
	}

	protected boolean verifyDrawable(Drawable drawable)
	{
		return super.verifyDrawable(drawable) || drawable == mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #1293 <Method boolean ViewGroup.verifyDrawable(Drawable)>
	//    3    5:ifne            21
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #230 <Field Drawable mStatusBarBackground>
	//    7   13:if_acmpne       19
	//    8   16:goto            21
	//    9   19:iconst_0        
	//   10   20:ireturn         
	//   11   21:iconst_1        
	//   12   22:ireturn         
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
	//    1    2:invokevirtual   #104 <Method Package Class.getPackage()>
	//    2    5:astore_0        
		if(obj != null)
	//*   3    6:aload_0         
	//*   4    7:ifnull          18
			obj = ((Object) (((Package) (obj)).getName()));
	//    5   10:aload_0         
	//    6   11:invokevirtual   #110 <Method String Package.getName()>
	//    7   14:astore_0        
		else
	//*   8   15:goto            20
			obj = null;
	//    9   18:aconst_null     
	//   10   19:astore_0        
		WIDGET_PACKAGE_NAME = ((String) (obj));
	//   11   20:aload_0         
	//   12   21:putstatic       #112 <Field String WIDGET_PACKAGE_NAME>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  13   24:getstatic       #117 <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   27:bipush          21
	//*  15   29:icmplt          45
			TOP_SORTED_CHILDREN_COMPARATOR = ((Comparator) (new ViewElevationComparator()));
	//   16   32:new             #36  <Class CoordinatorLayout$ViewElevationComparator>
	//   17   35:dup             
	//   18   36:invokespecial   #120 <Method void CoordinatorLayout$ViewElevationComparator()>
	//   19   39:putstatic       #122 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
		else
	//*  20   42:goto            49
			TOP_SORTED_CHILDREN_COMPARATOR = null;
	//   21   45:aconst_null     
	//   22   46:putstatic       #122 <Field Comparator TOP_SORTED_CHILDREN_COMPARATOR>
	//   23   49:iconst_2        
	//   24   50:anewarray       Class[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:ldc1            #124 <Class Context>
	//   28   57:aastore         
	//   29   58:dup             
	//   30   59:iconst_1        
	//   31   60:ldc1            #126 <Class AttributeSet>
	//   32   62:aastore         
	//   33   63:putstatic       #128 <Field Class[] CONSTRUCTOR_PARAMS>
	//   34   66:new             #130 <Class ThreadLocal>
	//   35   69:dup             
	//   36   70:invokespecial   #131 <Method void ThreadLocal()>
	//   37   73:putstatic       #133 <Field ThreadLocal sConstructors>
	//   38   76:new             #135 <Class android.support.v4.util.Pools$SynchronizedPool>
	//   39   79:dup             
	//   40   80:bipush          12
	//   41   82:invokespecial   #138 <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//   42   85:putstatic       #140 <Field android.support.v4.util.Pools$Pool sRectPool>
	//*  43   88:return          
	}
}
