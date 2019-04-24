// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.*;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			ViewDragHelper

public class DrawerLayout extends ViewGroup
{
	class AccessibilityDelegate extends AccessibilityDelegateCompat
	{

		private void addChildrenForAccessibility(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
		{
			int j = viewgroup.getChildCount();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #32  <Method int ViewGroup.getChildCount()>
		//    2    4:istore          4
			for(int i = 0; i < j; i++)
		//*   3    6:iconst_0        
		//*   4    7:istore_3        
		//*   5    8:iload_3         
		//*   6    9:iload           4
		//*   7   11:icmpge          42
			{
				View view = viewgroup.getChildAt(i);
		//    8   14:aload_2         
		//    9   15:iload_3         
		//   10   16:invokevirtual   #36  <Method View ViewGroup.getChildAt(int)>
		//   11   19:astore          5
				if(DrawerLayout.includeChildForAccessibility(view))
		//*  12   21:aload           5
		//*  13   23:invokestatic    #40  <Method boolean DrawerLayout.includeChildForAccessibility(View)>
		//*  14   26:ifeq            35
					accessibilitynodeinfocompat.addChild(view);
		//   15   29:aload_1         
		//   16   30:aload           5
		//   17   32:invokevirtual   #46  <Method void AccessibilityNodeInfoCompat.addChild(View)>
			}

		//   18   35:iload_3         
		//   19   36:iconst_1        
		//   20   37:iadd            
		//   21   38:istore_3        
		//*  22   39:goto            8
		//   23   42:return          
		}

		private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
		{
			Rect rect = mTmpRect;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field Rect mTmpRect>
		//    2    4:astore_3        
			accessibilitynodeinfocompat1.getBoundsInParent(rect);
		//    3    5:aload_2         
		//    4    6:aload_3         
		//    5    7:invokevirtual   #52  <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
			accessibilitynodeinfocompat.setBoundsInParent(rect);
		//    6   10:aload_1         
		//    7   11:aload_3         
		//    8   12:invokevirtual   #55  <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
			accessibilitynodeinfocompat1.getBoundsInScreen(rect);
		//    9   15:aload_2         
		//   10   16:aload_3         
		//   11   17:invokevirtual   #58  <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
			accessibilitynodeinfocompat.setBoundsInScreen(rect);
		//   12   20:aload_1         
		//   13   21:aload_3         
		//   14   22:invokevirtual   #61  <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
			accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
		//   15   25:aload_1         
		//   16   26:aload_2         
		//   17   27:invokevirtual   #65  <Method boolean AccessibilityNodeInfoCompat.isVisibleToUser()>
		//   18   30:invokevirtual   #69  <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
			accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
		//   19   33:aload_1         
		//   20   34:aload_2         
		//   21   35:invokevirtual   #73  <Method CharSequence AccessibilityNodeInfoCompat.getPackageName()>
		//   22   38:invokevirtual   #77  <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
			accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
		//   23   41:aload_1         
		//   24   42:aload_2         
		//   25   43:invokevirtual   #80  <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
		//   26   46:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
		//   27   49:aload_1         
		//   28   50:aload_2         
		//   29   51:invokevirtual   #86  <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
		//   30   54:invokevirtual   #89  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
			accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
		//   31   57:aload_1         
		//   32   58:aload_2         
		//   33   59:invokevirtual   #92  <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
		//   34   62:invokevirtual   #95  <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
			accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
		//   35   65:aload_1         
		//   36   66:aload_2         
		//   37   67:invokevirtual   #98  <Method boolean AccessibilityNodeInfoCompat.isClickable()>
		//   38   70:invokevirtual   #101 <Method void AccessibilityNodeInfoCompat.setClickable(boolean)>
			accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
		//   39   73:aload_1         
		//   40   74:aload_2         
		//   41   75:invokevirtual   #104 <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
		//   42   78:invokevirtual   #107 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
			accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
		//   43   81:aload_1         
		//   44   82:aload_2         
		//   45   83:invokevirtual   #110 <Method boolean AccessibilityNodeInfoCompat.isFocused()>
		//   46   86:invokevirtual   #113 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
			accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
		//   47   89:aload_1         
		//   48   90:aload_2         
		//   49   91:invokevirtual   #116 <Method boolean AccessibilityNodeInfoCompat.isAccessibilityFocused()>
		//   50   94:invokevirtual   #119 <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
			accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
		//   51   97:aload_1         
		//   52   98:aload_2         
		//   53   99:invokevirtual   #122 <Method boolean AccessibilityNodeInfoCompat.isSelected()>
		//   54  102:invokevirtual   #125 <Method void AccessibilityNodeInfoCompat.setSelected(boolean)>
			accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
		//   55  105:aload_1         
		//   56  106:aload_2         
		//   57  107:invokevirtual   #128 <Method boolean AccessibilityNodeInfoCompat.isLongClickable()>
		//   58  110:invokevirtual   #131 <Method void AccessibilityNodeInfoCompat.setLongClickable(boolean)>
			accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
		//   59  113:aload_1         
		//   60  114:aload_2         
		//   61  115:invokevirtual   #134 <Method int AccessibilityNodeInfoCompat.getActions()>
		//   62  118:invokevirtual   #138 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		//   63  121:return          
		}

		public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			if(accessibilityevent.getEventType() == 32)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #145 <Method int AccessibilityEvent.getEventType()>
		//*   2    4:bipush          32
		//*   3    6:icmpne          58
			{
				view = ((View) (accessibilityevent.getText()));
		//    4    9:aload_2         
		//    5   10:invokevirtual   #149 <Method List AccessibilityEvent.getText()>
		//    6   13:astore_1        
				accessibilityevent = ((AccessibilityEvent) (findVisibleDrawer()));
		//    7   14:aload_0         
		//    8   15:getfield        #15  <Field DrawerLayout this$0>
		//    9   18:invokevirtual   #153 <Method View DrawerLayout.findVisibleDrawer()>
		//   10   21:astore_2        
				if(accessibilityevent != null)
		//*  11   22:aload_2         
		//*  12   23:ifnull          56
				{
					int i = getDrawerViewAbsoluteGravity(((View) (accessibilityevent)));
		//   13   26:aload_0         
		//   14   27:getfield        #15  <Field DrawerLayout this$0>
		//   15   30:aload_2         
		//   16   31:invokevirtual   #157 <Method int DrawerLayout.getDrawerViewAbsoluteGravity(View)>
		//   17   34:istore_3        
					accessibilityevent = ((AccessibilityEvent) (getDrawerTitle(i)));
		//   18   35:aload_0         
		//   19   36:getfield        #15  <Field DrawerLayout this$0>
		//   20   39:iload_3         
		//   21   40:invokevirtual   #161 <Method CharSequence DrawerLayout.getDrawerTitle(int)>
		//   22   43:astore_2        
					if(accessibilityevent != null)
		//*  23   44:aload_2         
		//*  24   45:ifnull          56
						((List) (view)).add(((Object) (accessibilityevent)));
		//   25   48:aload_1         
		//   26   49:aload_2         
		//   27   50:invokeinterface #167 <Method boolean List.add(Object)>
		//   28   55:pop             
				}
				return true;
		//   29   56:iconst_1        
		//   30   57:ireturn         
			} else
			{
				return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
		//   31   58:aload_0         
		//   32   59:aload_1         
		//   33   60:aload_2         
		//   34   61:invokespecial   #169 <Method boolean AccessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(View, AccessibilityEvent)>
		//   35   64:ireturn         
			}
		}

		public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
		{
			super.onInitializeAccessibilityEvent(view, accessibilityevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #173 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
			accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/widget/DrawerLayout)).getName())));
		//    4    6:aload_2         
		//    5    7:ldc1            #6   <Class DrawerLayout>
		//    6    9:invokevirtual   #179 <Method String Class.getName()>
		//    7   12:invokevirtual   #180 <Method void AccessibilityEvent.setClassName(CharSequence)>
		//    8   15:return          
		}

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			if(DrawerLayout.CAN_HIDE_DESCENDANTS)
		//*   0    0:getstatic       #186 <Field boolean DrawerLayout.CAN_HIDE_DESCENDANTS>
		//*   1    3:ifeq            48
			{
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    2    6:aload_0         
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:invokespecial   #188 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			} else
		//*   6   12:aload_2         
		//*   7   13:ldc1            #6   <Class DrawerLayout>
		//*   8   15:invokevirtual   #179 <Method String Class.getName()>
		//*   9   18:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		//*  10   21:aload_2         
		//*  11   22:iconst_0        
		//*  12   23:invokevirtual   #107 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
		//*  13   26:aload_2         
		//*  14   27:iconst_0        
		//*  15   28:invokevirtual   #113 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
		//*  16   31:aload_2         
		//*  17   32:getstatic       #194 <Field android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat.ACTION_FOCUS>
		//*  18   35:invokevirtual   #198 <Method boolean AccessibilityNodeInfoCompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat)>
		//*  19   38:pop             
		//*  20   39:aload_2         
		//*  21   40:getstatic       #201 <Field android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat.ACTION_CLEAR_FOCUS>
		//*  22   43:invokevirtual   #198 <Method boolean AccessibilityNodeInfoCompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat)>
		//*  23   46:pop             
		//*  24   47:return          
			{
				AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
		//   25   48:aload_2         
		//   26   49:invokestatic    #205 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
		//   27   52:astore_3        
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
		//   28   53:aload_0         
		//   29   54:aload_1         
		//   30   55:aload_3         
		//   31   56:invokespecial   #188 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				accessibilitynodeinfocompat.setSource(view);
		//   32   59:aload_2         
		//   33   60:aload_1         
		//   34   61:invokevirtual   #208 <Method void AccessibilityNodeInfoCompat.setSource(View)>
				android.view.ViewParent viewparent = ViewCompat.getParentForAccessibility(view);
		//   35   64:aload_1         
		//   36   65:invokestatic    #214 <Method android.view.ViewParent ViewCompat.getParentForAccessibility(View)>
		//   37   68:astore          4
				if(viewparent instanceof View)
		//*  38   70:aload           4
		//*  39   72:instanceof      #216 <Class View>
		//*  40   75:ifeq            87
					accessibilitynodeinfocompat.setParent((View)viewparent);
		//   41   78:aload_2         
		//   42   79:aload           4
		//   43   81:checkcast       #216 <Class View>
		//   44   84:invokevirtual   #219 <Method void AccessibilityNodeInfoCompat.setParent(View)>
				copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
		//   45   87:aload_0         
		//   46   88:aload_2         
		//   47   89:aload_3         
		//   48   90:invokespecial   #221 <Method void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompat)>
				accessibilitynodeinfocompat1.recycle();
		//   49   93:aload_3         
		//   50   94:invokevirtual   #224 <Method void AccessibilityNodeInfoCompat.recycle()>
				addChildrenForAccessibility(accessibilitynodeinfocompat, (ViewGroup)view);
		//   51   97:aload_0         
		//   52   98:aload_2         
		//   53   99:aload_1         
		//   54  100:checkcast       #28  <Class ViewGroup>
		//   55  103:invokespecial   #226 <Method void addChildrenForAccessibility(AccessibilityNodeInfoCompat, ViewGroup)>
			}
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/widget/DrawerLayout)).getName())));
			accessibilitynodeinfocompat.setFocusable(false);
			accessibilitynodeinfocompat.setFocused(false);
			accessibilitynodeinfocompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
			accessibilitynodeinfocompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
		//*  56  106:goto            12
		}

		public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
		{
			if(DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view))
		//*   0    0:getstatic       #186 <Field boolean DrawerLayout.CAN_HIDE_DESCENDANTS>
		//*   1    3:ifne            13
		//*   2    6:aload_2         
		//*   3    7:invokestatic    #40  <Method boolean DrawerLayout.includeChildForAccessibility(View)>
		//*   4   10:ifeq            21
				return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
		//    5   13:aload_0         
		//    6   14:aload_1         
		//    7   15:aload_2         
		//    8   16:aload_3         
		//    9   17:invokespecial   #230 <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
		//   10   20:ireturn         
			else
				return false;
		//   11   21:iconst_0        
		//   12   22:ireturn         
		}

		private final Rect mTmpRect = new Rect();
		final DrawerLayout this$0;

		AccessibilityDelegate()
		{
			this$0 = DrawerLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field DrawerLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void AccessibilityDelegateCompat()>
		//    5    9:aload_0         
		//    6   10:new             #20  <Class Rect>
		//    7   13:dup             
		//    8   14:invokespecial   #21  <Method void Rect()>
		//    9   17:putfield        #23  <Field Rect mTmpRect>
		//   10   20:return          
		}
	}

	static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat
	{

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #16  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			if(!DrawerLayout.includeChildForAccessibility(view))
		//*   4    6:aload_1         
		//*   5    7:invokestatic    #20  <Method boolean DrawerLayout.includeChildForAccessibility(View)>
		//*   6   10:ifne            18
				accessibilitynodeinfocompat.setParent(((View) (null)));
		//    7   13:aload_2         
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #26  <Method void AccessibilityNodeInfoCompat.setParent(View)>
		//   10   18:return          
		}

		ChildAccessibilityDelegate()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityDelegateCompat()>
		//    2    4:return          
		}
	}

	public static interface DrawerListener
	{

		public abstract void onDrawerClosed(View view);

		public abstract void onDrawerOpened(View view);

		public abstract void onDrawerSlide(View view, float f);

		public abstract void onDrawerStateChanged(int i);
	}

	private static interface EdgeGravity
		extends Annotation
	{
	}

	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		private static final int FLAG_IS_CLOSING = 4;
		private static final int FLAG_IS_OPENED = 1;
		private static final int FLAG_IS_OPENING = 2;
		public int gravity;
		boolean isPeeking;
		float onScreen;
		int openState;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #24  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #26  <Field int gravity>
		//    7   11:return          
		}

		public LayoutParams(int i, int j, int k)
		{
			this(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void DrawerLayout$LayoutParams(int, int)>
			gravity = k;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #26  <Field int gravity>
		//    7   11:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #32  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #26  <Field int gravity>
			context = ((Context) (context.obtainStyledAttributes(attributeset, DrawerLayout.LAYOUT_ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #36  <Field int[] DrawerLayout.LAYOUT_ATTRS>
		//   10   16:invokevirtual   #42  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			gravity = ((TypedArray) (context)).getInt(0, 0);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:iconst_0        
		//   16   24:invokevirtual   #48  <Method int TypedArray.getInt(int, int)>
		//   17   27:putfield        #26  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #52  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #56  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #26  <Field int gravity>
			gravity = layoutparams.gravity;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #26  <Field int gravity>
		//    9   15:putfield        #26  <Field int gravity>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #26  <Field int gravity>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(marginlayoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #56  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			gravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #26  <Field int gravity>
		//    6   10:return          
		}
	}

	private static interface LockMode
		extends Annotation
	{
	}

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #52  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(openDrawerGravity);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #31  <Field int openDrawerGravity>
		//    7   11:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeLeft);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #39  <Field int lockModeLeft>
		//   11   19:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeRight);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #41  <Field int lockModeRight>
		//   15   27:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeStart);
		//   16   30:aload_1         
		//   17   31:aload_0         
		//   18   32:getfield        #43  <Field int lockModeStart>
		//   19   35:invokevirtual   #56  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeEnd);
		//   20   38:aload_1         
		//   21   39:aload_0         
		//   22   40:getfield        #45  <Field int lockModeEnd>
		//   23   43:invokevirtual   #56  <Method void Parcel.writeInt(int)>
		//   24   46:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class DrawerLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class DrawerLayout$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void DrawerLayout$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method DrawerLayout$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method DrawerLayout$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method DrawerLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		int lockModeEnd;
		int lockModeLeft;
		int lockModeRight;
		int lockModeStart;
		int openDrawerGravity;

		static 
		{
		//    0    0:new             #9   <Class DrawerLayout$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #23  <Method void DrawerLayout$SavedState$1()>
		//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #29  <Method void AbsSavedState(Parcel, ClassLoader)>
			openDrawerGravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #31  <Field int openDrawerGravity>
			openDrawerGravity = parcel.readInt();
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #37  <Method int Parcel.readInt()>
		//   10   16:putfield        #31  <Field int openDrawerGravity>
			lockModeLeft = parcel.readInt();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #37  <Method int Parcel.readInt()>
		//   14   24:putfield        #39  <Field int lockModeLeft>
			lockModeRight = parcel.readInt();
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #37  <Method int Parcel.readInt()>
		//   18   32:putfield        #41  <Field int lockModeRight>
			lockModeStart = parcel.readInt();
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokevirtual   #37  <Method int Parcel.readInt()>
		//   22   40:putfield        #43  <Field int lockModeStart>
			lockModeEnd = parcel.readInt();
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #37  <Method int Parcel.readInt()>
		//   26   48:putfield        #45  <Field int lockModeEnd>
		//   27   51:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #48  <Method void AbsSavedState(Parcelable)>
			openDrawerGravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #31  <Field int openDrawerGravity>
		//    6   10:return          
		}
	}

	public static abstract class SimpleDrawerListener
		implements DrawerListener
	{

		public void onDrawerClosed(View view)
		{
		//    0    0:return          
		}

		public void onDrawerOpened(View view)
		{
		//    0    0:return          
		}

		public void onDrawerSlide(View view, float f)
		{
		//    0    0:return          
		}

		public void onDrawerStateChanged(int i)
		{
		//    0    0:return          
		}

		public SimpleDrawerListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	private static interface State
		extends Annotation
	{
	}

	private class ViewDragCallback extends ViewDragHelper.Callback
	{

		private void closeOtherDrawer()
		{
			byte byte0 = 3;
		//    0    0:iconst_3        
		//    1    1:istore_1        
			if(mAbsGravity == 3)
		//*   2    2:aload_0         
		//*   3    3:getfield        #31  <Field int mAbsGravity>
		//*   4    6:iconst_3        
		//*   5    7:icmpne          12
				byte0 = 5;
		//    6   10:iconst_5        
		//    7   11:istore_1        
			View view = findDrawerWithGravity(((int) (byte0)));
		//    8   12:aload_0         
		//    9   13:getfield        #21  <Field DrawerLayout this$0>
		//   10   16:iload_1         
		//   11   17:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   12   20:astore_2        
			if(view != null)
		//*  13   21:aload_2         
		//*  14   22:ifnull          33
				closeDrawer(view);
		//   15   25:aload_0         
		//   16   26:getfield        #21  <Field DrawerLayout this$0>
		//   17   29:aload_2         
		//   18   30:invokevirtual   #41  <Method void DrawerLayout.closeDrawer(View)>
		//   19   33:return          
		}

		public int clampViewPositionHorizontal(View view, int i, int j)
		{
			if(checkDrawerViewAbsoluteGravity(view, 3))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field DrawerLayout this$0>
		//*   2    4:aload_1         
		//*   3    5:iconst_3        
		//*   4    6:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//*   5    9:ifeq            26
			{
				return Math.max(-view.getWidth(), Math.min(i, 0));
		//    6   12:aload_1         
		//    7   13:invokevirtual   #53  <Method int View.getWidth()>
		//    8   16:ineg            
		//    9   17:iload_2         
		//   10   18:iconst_0        
		//   11   19:invokestatic    #59  <Method int Math.min(int, int)>
		//   12   22:invokestatic    #62  <Method int Math.max(int, int)>
		//   13   25:ireturn         
			} else
			{
				j = getWidth();
		//   14   26:aload_0         
		//   15   27:getfield        #21  <Field DrawerLayout this$0>
		//   16   30:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   17   33:istore_3        
				return Math.max(j - view.getWidth(), Math.min(i, j));
		//   18   34:iload_3         
		//   19   35:aload_1         
		//   20   36:invokevirtual   #53  <Method int View.getWidth()>
		//   21   39:isub            
		//   22   40:iload_2         
		//   23   41:iload_3         
		//   24   42:invokestatic    #59  <Method int Math.min(int, int)>
		//   25   45:invokestatic    #62  <Method int Math.max(int, int)>
		//   26   48:ireturn         
			}
		}

		public int clampViewPositionVertical(View view, int i, int j)
		{
			return view.getTop();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #67  <Method int View.getTop()>
		//    2    4:ireturn         
		}

		public int getViewHorizontalDragRange(View view)
		{
			if(isDrawerView(view))
		//*   0    0:aload_0         
		//*   1    1:getfield        #21  <Field DrawerLayout this$0>
		//*   2    4:aload_1         
		//*   3    5:invokevirtual   #73  <Method boolean DrawerLayout.isDrawerView(View)>
		//*   4    8:ifeq            16
				return view.getWidth();
		//    5   11:aload_1         
		//    6   12:invokevirtual   #53  <Method int View.getWidth()>
		//    7   15:ireturn         
			else
				return 0;
		//    8   16:iconst_0        
		//    9   17:ireturn         
		}

		public void onEdgeDragStarted(int i, int j)
		{
			View view;
			if((i & 1) == 1)
		//*   0    0:iload_1         
		//*   1    1:iconst_1        
		//*   2    2:iand            
		//*   3    3:iconst_1        
		//*   4    4:icmpne          41
				view = findDrawerWithGravity(3);
		//    5    7:aload_0         
		//    6    8:getfield        #21  <Field DrawerLayout this$0>
		//    7   11:iconst_3        
		//    8   12:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//    9   15:astore_3        
			else
		//*  10   16:aload_3         
		//*  11   17:ifnull          40
		//*  12   20:aload_0         
		//*  13   21:getfield        #21  <Field DrawerLayout this$0>
		//*  14   24:aload_3         
		//*  15   25:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
		//*  16   28:ifne            40
		//*  17   31:aload_0         
		//*  18   32:getfield        #80  <Field ViewDragHelper mDragger>
		//*  19   35:aload_3         
		//*  20   36:iload_2         
		//*  21   37:invokevirtual   #86  <Method void ViewDragHelper.captureChildView(View, int)>
		//*  22   40:return          
				view = findDrawerWithGravity(5);
		//   23   41:aload_0         
		//   24   42:getfield        #21  <Field DrawerLayout this$0>
		//   25   45:iconst_5        
		//   26   46:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   27   49:astore_3        
			if(view != null && getDrawerLockMode(view) == 0)
				mDragger.captureChildView(view, j);
		//*  28   50:goto            16
		}

		public boolean onEdgeLock(int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void onEdgeTouched(int i, int j)
		{
			postDelayed(mPeekRunnable, 160L);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field Runnable mPeekRunnable>
		//    4    8:ldc2w           #90  <Long 160L>
		//    5   11:invokevirtual   #95  <Method boolean DrawerLayout.postDelayed(Runnable, long)>
		//    6   14:pop             
		//    7   15:return          
		}

		public void onViewCaptured(View view, int i)
		{
			((LayoutParams)view.getLayoutParams()).isPeeking = false;
		//    0    0:aload_1         
		//    1    1:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//    2    4:checkcast       #102 <Class DrawerLayout$LayoutParams>
		//    3    7:iconst_0        
		//    4    8:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
			closeOtherDrawer();
		//    5   11:aload_0         
		//    6   12:invokespecial   #108 <Method void closeOtherDrawer()>
		//    7   15:return          
		}

		public void onViewDragStateChanged(int i)
		{
			updateDrawerState(mAbsGravity, i, mDragger.getCapturedView());
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #31  <Field int mAbsGravity>
		//    4    8:iload_1         
		//    5    9:aload_0         
		//    6   10:getfield        #80  <Field ViewDragHelper mDragger>
		//    7   13:invokevirtual   #114 <Method View ViewDragHelper.getCapturedView()>
		//    8   16:invokevirtual   #118 <Method void DrawerLayout.updateDrawerState(int, int, View)>
		//    9   19:return          
		}

		public void onViewPositionChanged(View view, int i, int j, int k, int l)
		{
			j = view.getWidth();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #53  <Method int View.getWidth()>
		//    2    4:istore_3        
			float f;
			if(checkDrawerViewAbsoluteGravity(view, 3))
		//*   3    5:aload_0         
		//*   4    6:getfield        #21  <Field DrawerLayout this$0>
		//*   5    9:aload_1         
		//*   6   10:iconst_3        
		//*   7   11:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//*   8   14:ifeq            58
				f = (float)(j + i) / (float)j;
		//    9   17:iload_3         
		//   10   18:iload_2         
		//   11   19:iadd            
		//   12   20:i2f             
		//   13   21:iload_3         
		//   14   22:i2f             
		//   15   23:fdiv            
		//   16   24:fstore          6
			else
		//*  17   26:aload_0         
		//*  18   27:getfield        #21  <Field DrawerLayout this$0>
		//*  19   30:aload_1         
		//*  20   31:fload           6
		//*  21   33:invokevirtual   #124 <Method void DrawerLayout.setDrawerViewOffset(View, float)>
		//*  22   36:fload           6
		//*  23   38:fconst_0        
		//*  24   39:fcmpl           
		//*  25   40:ifne            76
		//*  26   43:iconst_4        
		//*  27   44:istore_2        
		//*  28   45:aload_1         
		//*  29   46:iload_2         
		//*  30   47:invokevirtual   #127 <Method void View.setVisibility(int)>
		//*  31   50:aload_0         
		//*  32   51:getfield        #21  <Field DrawerLayout this$0>
		//*  33   54:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
		//*  34   57:return          
				f = (float)(getWidth() - i) / (float)j;
		//   35   58:aload_0         
		//   36   59:getfield        #21  <Field DrawerLayout this$0>
		//   37   62:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   38   65:iload_2         
		//   39   66:isub            
		//   40   67:i2f             
		//   41   68:iload_3         
		//   42   69:i2f             
		//   43   70:fdiv            
		//   44   71:fstore          6
			setDrawerViewOffset(view, f);
			if(f == 0.0F)
				i = 4;
			else
		//*  45   73:goto            26
				i = 0;
		//   46   76:iconst_0        
		//   47   77:istore_2        
			view.setVisibility(i);
			invalidate();
		//*  48   78:goto            45
		}

		public void onViewReleased(View view, float f, float f1)
		{
			int k;
			f1 = getDrawerViewOffset(view);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #136 <Method float DrawerLayout.getDrawerViewOffset(View)>
		//    4    8:fstore_3        
			k = view.getWidth();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #53  <Method int View.getWidth()>
		//    7   13:istore          6
			if(!checkDrawerViewAbsoluteGravity(view, 3)) goto _L2; else goto _L1
		//    8   15:aload_0         
		//    9   16:getfield        #21  <Field DrawerLayout this$0>
		//   10   19:aload_1         
		//   11   20:iconst_3        
		//   12   21:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//   13   24:ifeq            79
_L1:
			int i;
			if(f > 0.0F || f == 0.0F && f1 > 0.5F)
		//*  14   27:fload_2         
		//*  15   28:fconst_0        
		//*  16   29:fcmpl           
		//*  17   30:ifgt            46
		//*  18   33:fload_2         
		//*  19   34:fconst_0        
		//*  20   35:fcmpl           
		//*  21   36:ifne            71
		//*  22   39:fload_3         
		//*  23   40:ldc1            #137 <Float 0.5F>
		//*  24   42:fcmpl           
		//*  25   43:ifle            71
				i = 0;
		//   26   46:iconst_0        
		//   27   47:istore          4
			else
		//*  28   49:aload_0         
		//*  29   50:getfield        #80  <Field ViewDragHelper mDragger>
		//*  30   53:iload           4
		//*  31   55:aload_1         
		//*  32   56:invokevirtual   #67  <Method int View.getTop()>
		//*  33   59:invokevirtual   #141 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//*  34   62:pop             
		//*  35   63:aload_0         
		//*  36   64:getfield        #21  <Field DrawerLayout this$0>
		//*  37   67:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
		//*  38   70:return          
				i = -k;
		//   39   71:iload           6
		//   40   73:ineg            
		//   41   74:istore          4
_L4:
			mDragger.settleCapturedViewAt(i, view.getTop());
			invalidate();
			return;
		//*  42   76:goto            49
_L2:
			int j = getWidth();
		//   43   79:aload_0         
		//   44   80:getfield        #21  <Field DrawerLayout this$0>
		//   45   83:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   46   86:istore          5
			if(f >= 0.0F)
		//*  47   88:fload_2         
		//*  48   89:fconst_0        
		//*  49   90:fcmpg           
		//*  50   91:iflt            115
			{
				i = j;
		//   51   94:iload           5
		//   52   96:istore          4
				if(f != 0.0F)
					continue; /* Loop/switch isn't completed */
		//   53   98:fload_2         
		//   54   99:fconst_0        
		//   55  100:fcmpl           
		//   56  101:ifne            49
				i = j;
		//   57  104:iload           5
		//   58  106:istore          4
				if(f1 <= 0.5F)
					continue; /* Loop/switch isn't completed */
		//   59  108:fload_3         
		//   60  109:ldc1            #137 <Float 0.5F>
		//   61  111:fcmpl           
		//   62  112:ifle            49
			}
			i = j - k;
		//   63  115:iload           5
		//   64  117:iload           6
		//   65  119:isub            
		//   66  120:istore          4
			if(true) goto _L4; else goto _L3
		//   67  122:goto            49
_L3:
		}

		void peekDrawer()
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			int j = mDragger.getEdgeSize();
		//    2    2:aload_0         
		//    3    3:getfield        #80  <Field ViewDragHelper mDragger>
		//    4    6:invokevirtual   #145 <Method int ViewDragHelper.getEdgeSize()>
		//    5    9:istore_3        
			boolean flag;
			View view;
			if(mAbsGravity == 3)
		//*   6   10:aload_0         
		//*   7   11:getfield        #31  <Field int mAbsGravity>
		//*   8   14:iconst_3        
		//*   9   15:icmpne          144
				flag = true;
		//   10   18:iconst_1        
		//   11   19:istore_1        
			else
		//*  12   20:iload_1         
		//*  13   21:ifeq            149
		//*  14   24:aload_0         
		//*  15   25:getfield        #21  <Field DrawerLayout this$0>
		//*  16   28:iconst_3        
		//*  17   29:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//*  18   32:astore          4
		//*  19   34:aload           4
		//*  20   36:ifnull          46
		//*  21   39:aload           4
		//*  22   41:invokevirtual   #53  <Method int View.getWidth()>
		//*  23   44:ineg            
		//*  24   45:istore_2        
		//*  25   46:iload_2         
		//*  26   47:iload_3         
		//*  27   48:iadd            
		//*  28   49:istore_2        
		//*  29   50:aload           4
		//*  30   52:ifnull          143
		//*  31   55:iload_1         
		//*  32   56:ifeq            68
		//*  33   59:aload           4
		//*  34   61:invokevirtual   #148 <Method int View.getLeft()>
		//*  35   64:iload_2         
		//*  36   65:icmplt          81
		//*  37   68:iload_1         
		//*  38   69:ifne            143
		//*  39   72:aload           4
		//*  40   74:invokevirtual   #148 <Method int View.getLeft()>
		//*  41   77:iload_2         
		//*  42   78:icmple          143
		//*  43   81:aload_0         
		//*  44   82:getfield        #21  <Field DrawerLayout this$0>
		//*  45   85:aload           4
		//*  46   87:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
		//*  47   90:ifne            143
		//*  48   93:aload           4
		//*  49   95:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//*  50   98:checkcast       #102 <Class DrawerLayout$LayoutParams>
		//*  51  101:astore          5
		//*  52  103:aload_0         
		//*  53  104:getfield        #80  <Field ViewDragHelper mDragger>
		//*  54  107:aload           4
		//*  55  109:iload_2         
		//*  56  110:aload           4
		//*  57  112:invokevirtual   #67  <Method int View.getTop()>
		//*  58  115:invokevirtual   #152 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
		//*  59  118:pop             
		//*  60  119:aload           5
		//*  61  121:iconst_1        
		//*  62  122:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
		//*  63  125:aload_0         
		//*  64  126:getfield        #21  <Field DrawerLayout this$0>
		//*  65  129:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
		//*  66  132:aload_0         
		//*  67  133:invokespecial   #108 <Method void closeOtherDrawer()>
		//*  68  136:aload_0         
		//*  69  137:getfield        #21  <Field DrawerLayout this$0>
		//*  70  140:invokevirtual   #155 <Method void DrawerLayout.cancelChildViewTouch()>
		//*  71  143:return          
				flag = false;
		//   72  144:iconst_0        
		//   73  145:istore_1        
			if(flag)
			{
				view = findDrawerWithGravity(3);
				if(view != null)
					i = -view.getWidth();
				i += j;
			} else
		//*  74  146:goto            20
			{
				view = findDrawerWithGravity(5);
		//   75  149:aload_0         
		//   76  150:getfield        #21  <Field DrawerLayout this$0>
		//   77  153:iconst_5        
		//   78  154:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   79  157:astore          4
				i = getWidth();
		//   80  159:aload_0         
		//   81  160:getfield        #21  <Field DrawerLayout this$0>
		//   82  163:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   83  166:istore_2        
				i -= j;
		//   84  167:iload_2         
		//   85  168:iload_3         
		//   86  169:isub            
		//   87  170:istore_2        
			}
			if(view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && getDrawerLockMode(view) == 0)
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
				mDragger.smoothSlideViewTo(view, i, view.getTop());
				layoutparams.isPeeking = true;
				invalidate();
				closeOtherDrawer();
				cancelChildViewTouch();
			}
		//*  88  171:goto            50
		}

		public void removeCallbacks()
		{
			DrawerLayout.this.removeCallbacks(mPeekRunnable);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_0         
		//    3    5:getfield        #29  <Field Runnable mPeekRunnable>
		//    4    8:invokevirtual   #159 <Method boolean DrawerLayout.removeCallbacks(Runnable)>
		//    5   11:pop             
		//    6   12:return          
		}

		public void setDragger(ViewDragHelper viewdraghelper)
		{
			mDragger = viewdraghelper;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #80  <Field ViewDragHelper mDragger>
		//    3    5:return          
		}

		public boolean tryCaptureView(View view, int i)
		{
			return isDrawerView(view) && checkDrawerViewAbsoluteGravity(view, mAbsGravity) && getDrawerLockMode(view) == 0;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #73  <Method boolean DrawerLayout.isDrawerView(View)>
		//    4    8:ifeq            39
		//    5   11:aload_0         
		//    6   12:getfield        #21  <Field DrawerLayout this$0>
		//    7   15:aload_1         
		//    8   16:aload_0         
		//    9   17:getfield        #31  <Field int mAbsGravity>
		//   10   20:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//   11   23:ifeq            39
		//   12   26:aload_0         
		//   13   27:getfield        #21  <Field DrawerLayout this$0>
		//   14   30:aload_1         
		//   15   31:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
		//   16   34:ifne            39
		//   17   37:iconst_1        
		//   18   38:ireturn         
		//   19   39:iconst_0        
		//   20   40:ireturn         
		}

		private final int mAbsGravity;
		private ViewDragHelper mDragger;
		private final Runnable mPeekRunnable = new _cls1();
		final DrawerLayout this$0;

		ViewDragCallback(int i)
		{
			this$0 = DrawerLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #21  <Field DrawerLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #24  <Method void ViewDragHelper$Callback()>
		//    5    9:aload_0         
		//    6   10:new             #9   <Class DrawerLayout$ViewDragCallback$1>
		//    7   13:dup             
		//    8   14:aload_0         
		//    9   15:invokespecial   #27  <Method void DrawerLayout$ViewDragCallback$1(DrawerLayout$ViewDragCallback)>
		//   10   18:putfield        #29  <Field Runnable mPeekRunnable>
			mAbsGravity = i;
		//   11   21:aload_0         
		//   12   22:iload_2         
		//   13   23:putfield        #31  <Field int mAbsGravity>
		//   14   26:return          
		}
	}


	public DrawerLayout(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #148 <Method void DrawerLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public DrawerLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #151 <Method void DrawerLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public DrawerLayout(Context context, AttributeSet attributeset, int i)
	{
		float f;
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #152 <Method void ViewGroup(Context, AttributeSet, int)>
		mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
	//    5    7:aload_0         
	//    6    8:new             #11  <Class DrawerLayout$ChildAccessibilityDelegate>
	//    7   11:dup             
	//    8   12:invokespecial   #154 <Method void DrawerLayout$ChildAccessibilityDelegate()>
	//    9   15:putfield        #156 <Field DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate>
		mScrimColor = 0x99000000;
	//   10   18:aload_0         
	//   11   19:ldc1            #49  <Int 0x99000000>
	//   12   21:putfield        #158 <Field int mScrimColor>
		mScrimPaint = new Paint();
	//   13   24:aload_0         
	//   14   25:new             #160 <Class Paint>
	//   15   28:dup             
	//   16   29:invokespecial   #161 <Method void Paint()>
	//   17   32:putfield        #163 <Field Paint mScrimPaint>
		mFirstLayout = true;
	//   18   35:aload_0         
	//   19   36:iconst_1        
	//   20   37:putfield        #165 <Field boolean mFirstLayout>
		mLockModeLeft = 3;
	//   21   40:aload_0         
	//   22   41:iconst_3        
	//   23   42:putfield        #167 <Field int mLockModeLeft>
		mLockModeRight = 3;
	//   24   45:aload_0         
	//   25   46:iconst_3        
	//   26   47:putfield        #169 <Field int mLockModeRight>
		mLockModeStart = 3;
	//   27   50:aload_0         
	//   28   51:iconst_3        
	//   29   52:putfield        #171 <Field int mLockModeStart>
		mLockModeEnd = 3;
	//   30   55:aload_0         
	//   31   56:iconst_3        
	//   32   57:putfield        #173 <Field int mLockModeEnd>
		mShadowStart = null;
	//   33   60:aload_0         
	//   34   61:aconst_null     
	//   35   62:putfield        #175 <Field Drawable mShadowStart>
		mShadowEnd = null;
	//   36   65:aload_0         
	//   37   66:aconst_null     
	//   38   67:putfield        #177 <Field Drawable mShadowEnd>
		mShadowLeft = null;
	//   39   70:aload_0         
	//   40   71:aconst_null     
	//   41   72:putfield        #179 <Field Drawable mShadowLeft>
		mShadowRight = null;
	//   42   75:aload_0         
	//   43   76:aconst_null     
	//   44   77:putfield        #181 <Field Drawable mShadowRight>
		setDescendantFocusability(0x40000);
	//   45   80:aload_0         
	//   46   81:ldc1            #182 <Int 0x40000>
	//   47   83:invokevirtual   #186 <Method void setDescendantFocusability(int)>
		f = getResources().getDisplayMetrics().density;
	//   48   86:aload_0         
	//   49   87:invokevirtual   #190 <Method Resources getResources()>
	//   50   90:invokevirtual   #196 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   51   93:getfield        #201 <Field float DisplayMetrics.density>
	//   52   96:fstore          4
		mMinDrawerMargin = (int)(64F * f + 0.5F);
	//   53   98:aload_0         
	//   54   99:ldc1            #202 <Float 64F>
	//   55  101:fload           4
	//   56  103:fmul            
	//   57  104:ldc1            #203 <Float 0.5F>
	//   58  106:fadd            
	//   59  107:f2i             
	//   60  108:putfield        #205 <Field int mMinDrawerMargin>
		float f1 = 400F * f;
	//   61  111:ldc1            #206 <Float 400F>
	//   62  113:fload           4
	//   63  115:fmul            
	//   64  116:fstore          5
		mLeftCallback = new ViewDragCallback(3);
	//   65  118:aload_0         
	//   66  119:new             #37  <Class DrawerLayout$ViewDragCallback>
	//   67  122:dup             
	//   68  123:aload_0         
	//   69  124:iconst_3        
	//   70  125:invokespecial   #209 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
	//   71  128:putfield        #211 <Field DrawerLayout$ViewDragCallback mLeftCallback>
		mRightCallback = new ViewDragCallback(5);
	//   72  131:aload_0         
	//   73  132:new             #37  <Class DrawerLayout$ViewDragCallback>
	//   74  135:dup             
	//   75  136:aload_0         
	//   76  137:iconst_5        
	//   77  138:invokespecial   #209 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
	//   78  141:putfield        #213 <Field DrawerLayout$ViewDragCallback mRightCallback>
		mLeftDragger = ViewDragHelper.create(((ViewGroup) (this)), 1.0F, ((ViewDragHelper.Callback) (mLeftCallback)));
	//   79  144:aload_0         
	//   80  145:aload_0         
	//   81  146:fconst_1        
	//   82  147:aload_0         
	//   83  148:getfield        #211 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   84  151:invokestatic    #219 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//   85  154:putfield        #221 <Field ViewDragHelper mLeftDragger>
		mLeftDragger.setEdgeTrackingEnabled(1);
	//   86  157:aload_0         
	//   87  158:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   88  161:iconst_1        
	//   89  162:invokevirtual   #224 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		mLeftDragger.setMinVelocity(f1);
	//   90  165:aload_0         
	//   91  166:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   92  169:fload           5
	//   93  171:invokevirtual   #228 <Method void ViewDragHelper.setMinVelocity(float)>
		mLeftCallback.setDragger(mLeftDragger);
	//   94  174:aload_0         
	//   95  175:getfield        #211 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   96  178:aload_0         
	//   97  179:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   98  182:invokevirtual   #232 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
		mRightDragger = ViewDragHelper.create(((ViewGroup) (this)), 1.0F, ((ViewDragHelper.Callback) (mRightCallback)));
	//   99  185:aload_0         
	//  100  186:aload_0         
	//  101  187:fconst_1        
	//  102  188:aload_0         
	//  103  189:getfield        #213 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//  104  192:invokestatic    #219 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//  105  195:putfield        #234 <Field ViewDragHelper mRightDragger>
		mRightDragger.setEdgeTrackingEnabled(2);
	//  106  198:aload_0         
	//  107  199:getfield        #234 <Field ViewDragHelper mRightDragger>
	//  108  202:iconst_2        
	//  109  203:invokevirtual   #224 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		mRightDragger.setMinVelocity(f1);
	//  110  206:aload_0         
	//  111  207:getfield        #234 <Field ViewDragHelper mRightDragger>
	//  112  210:fload           5
	//  113  212:invokevirtual   #228 <Method void ViewDragHelper.setMinVelocity(float)>
		mRightCallback.setDragger(mRightDragger);
	//  114  215:aload_0         
	//  115  216:getfield        #213 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//  116  219:aload_0         
	//  117  220:getfield        #234 <Field ViewDragHelper mRightDragger>
	//  118  223:invokevirtual   #232 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
		setFocusableInTouchMode(true);
	//  119  226:aload_0         
	//  120  227:iconst_1        
	//  121  228:invokevirtual   #238 <Method void setFocusableInTouchMode(boolean)>
		ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//  122  231:aload_0         
	//  123  232:iconst_1        
	//  124  233:invokestatic    #244 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new AccessibilityDelegate())));
	//  125  236:aload_0         
	//  126  237:new             #8   <Class DrawerLayout$AccessibilityDelegate>
	//  127  240:dup             
	//  128  241:aload_0         
	//  129  242:invokespecial   #247 <Method void DrawerLayout$AccessibilityDelegate(DrawerLayout)>
	//  130  245:invokestatic    #251 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		ViewGroupCompat.setMotionEventSplittingEnabled(((ViewGroup) (this)), false);
	//  131  248:aload_0         
	//  132  249:iconst_0        
	//  133  250:invokestatic    #257 <Method void ViewGroupCompat.setMotionEventSplittingEnabled(ViewGroup, boolean)>
		if(!ViewCompat.getFitsSystemWindows(((View) (this)))) goto _L2; else goto _L1
	//  134  253:aload_0         
	//  135  254:invokestatic    #261 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//  136  257:ifeq            308
_L1:
		if(android.os.Build.VERSION.SDK_INT < 21) goto _L4; else goto _L3
	//  137  260:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//  138  263:bipush          21
	//  139  265:icmplt          337
_L3:
		setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() {

			public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
			{
				view = ((View) ((DrawerLayout)view));
			//    0    0:aload_1         
			//    1    1:checkcast       #8   <Class DrawerLayout>
			//    2    4:astore_1        
				boolean flag;
				if(windowinsets.getSystemWindowInsetTop() > 0)
			//*   3    5:aload_2         
			//*   4    6:invokevirtual   #31  <Method int WindowInsets.getSystemWindowInsetTop()>
			//*   5    9:ifle            25
					flag = true;
			//    6   12:iconst_1        
			//    7   13:istore_3        
				else
			//*   8   14:aload_1         
			//*   9   15:aload_2         
			//*  10   16:iload_3         
			//*  11   17:invokevirtual   #35  <Method void DrawerLayout.setChildInsets(Object, boolean)>
			//*  12   20:aload_2         
			//*  13   21:invokevirtual   #39  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
			//*  14   24:areturn         
					flag = false;
			//   15   25:iconst_0        
			//   16   26:istore_3        
				((DrawerLayout) (view)).setChildInsets(((Object) (windowinsets)), flag);
				return windowinsets.consumeSystemWindowInsets();
			//*  17   27:goto            14
			}

			final DrawerLayout this$0;

			
			{
				this$0 = DrawerLayout.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field DrawerLayout this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  140  268:aload_0         
	//  141  269:new             #6   <Class DrawerLayout$1>
	//  142  272:dup             
	//  143  273:aload_0         
	//  144  274:invokespecial   #262 <Method void DrawerLayout$1(DrawerLayout)>
	//  145  277:invokevirtual   #266 <Method void setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
		setSystemUiVisibility(1280);
	//  146  280:aload_0         
	//  147  281:sipush          1280
	//  148  284:invokevirtual   #269 <Method void setSystemUiVisibility(int)>
		context = ((Context) (context.obtainStyledAttributes(THEME_ATTRS)));
	//  149  287:aload_1         
	//  150  288:getstatic       #130 <Field int[] THEME_ATTRS>
	//  151  291:invokevirtual   #275 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//  152  294:astore_1        
		mStatusBarBackground = ((TypedArray) (context)).getDrawable(0);
	//  153  295:aload_0         
	//  154  296:aload_1         
	//  155  297:iconst_0        
	//  156  298:invokevirtual   #281 <Method Drawable TypedArray.getDrawable(int)>
	//  157  301:putfield        #283 <Field Drawable mStatusBarBackground>
		((TypedArray) (context)).recycle();
	//  158  304:aload_1         
	//  159  305:invokevirtual   #286 <Method void TypedArray.recycle()>
_L2:
		mDrawerElevation = f * 10F;
	//  160  308:aload_0         
	//  161  309:fload           4
	//  162  311:ldc2            #287 <Float 10F>
	//  163  314:fmul            
	//  164  315:putfield        #289 <Field float mDrawerElevation>
		mNonDrawerViews = new ArrayList();
	//  165  318:aload_0         
	//  166  319:new             #291 <Class ArrayList>
	//  167  322:dup             
	//  168  323:invokespecial   #292 <Method void ArrayList()>
	//  169  326:putfield        #294 <Field ArrayList mNonDrawerViews>
		return;
	//  170  329:return          
		attributeset;
	//  171  330:astore_2        
		((TypedArray) (context)).recycle();
	//  172  331:aload_1         
	//  173  332:invokevirtual   #286 <Method void TypedArray.recycle()>
		throw attributeset;
	//  174  335:aload_2         
	//  175  336:athrow          
_L4:
		mStatusBarBackground = null;
	//  176  337:aload_0         
	//  177  338:aconst_null     
	//  178  339:putfield        #283 <Field Drawable mStatusBarBackground>
		if(true) goto _L2; else goto _L5
	//  179  342:goto            308
_L5:
	}

	static String gravityToString(int i)
	{
		if((i & 3) == 3)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iand            
	//*   3    3:iconst_3        
	//*   4    4:icmpne          11
			return "LEFT";
	//    5    7:ldc2            #298 <String "LEFT">
	//    6   10:areturn         
		if((i & 5) == 5)
	//*   7   11:iload_0         
	//*   8   12:iconst_5        
	//*   9   13:iand            
	//*  10   14:iconst_5        
	//*  11   15:icmpne          22
			return "RIGHT";
	//   12   18:ldc2            #300 <String "RIGHT">
	//   13   21:areturn         
		else
			return Integer.toHexString(i);
	//   14   22:iload_0         
	//   15   23:invokestatic    #305 <Method String Integer.toHexString(int)>
	//   16   26:areturn         
	}

	private static boolean hasOpaqueBackground(View view)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		view = ((View) (view.getBackground()));
	//    2    2:aload_0         
	//    3    3:invokevirtual   #312 <Method Drawable View.getBackground()>
	//    4    6:astore_0        
		boolean flag = flag1;
	//    5    7:iload_2         
	//    6    8:istore_1        
		if(view != null)
	//*   7    9:aload_0         
	//*   8   10:ifnull          25
		{
			flag = flag1;
	//    9   13:iload_2         
	//   10   14:istore_1        
			if(((Drawable) (view)).getOpacity() == -1)
	//*  11   15:aload_0         
	//*  12   16:invokevirtual   #318 <Method int Drawable.getOpacity()>
	//*  13   19:iconst_m1       
	//*  14   20:icmpne          25
				flag = true;
	//   15   23:iconst_1        
	//   16   24:istore_1        
		}
		return flag;
	//   17   25:iload_1         
	//   18   26:ireturn         
	}

	private boolean hasPeekingDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          38
			if(((LayoutParams)getChildAt(i).getLayoutParams()).isPeeking)
	//*   8   12:aload_0         
	//*   9   13:iload_1         
	//*  10   14:invokevirtual   #327 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//*  13   23:getfield        #334 <Field boolean DrawerLayout$LayoutParams.isPeeking>
	//*  14   26:ifeq            31
				return true;
	//   15   29:iconst_1        
	//   16   30:ireturn         

	//   17   31:iload_1         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_1        
	//*  21   35:goto            7
		return false;
	//   22   38:iconst_0        
	//   23   39:ireturn         
	}

	private boolean hasVisibleDrawer()
	{
		return findVisibleDrawer() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #339 <Method View findVisibleDrawer()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	static boolean includeChildForAccessibility(View view)
	{
		return ViewCompat.getImportantForAccessibility(view) != 4 && ViewCompat.getImportantForAccessibility(view) != 2;
	//    0    0:aload_0         
	//    1    1:invokestatic    #344 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    2    4:iconst_4        
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:invokestatic    #344 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    6   12:iconst_2        
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private boolean mirror(Drawable drawable, int i)
	{
		if(drawable == null || !DrawableCompat.isAutoMirrored(drawable))
	//*   0    0:aload_1         
	//*   1    1:ifnull          11
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #352 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//*   4    8:ifne            13
		{
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		} else
		{
			DrawableCompat.setLayoutDirection(drawable, i);
	//    7   13:aload_1         
	//    8   14:iload_2         
	//    9   15:invokestatic    #355 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//   10   18:pop             
			return true;
	//   11   19:iconst_1        
	//   12   20:ireturn         
		}
	}

	private Drawable resolveLeftShadow()
	{
		int i = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(mShadowStart != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #175 <Field Drawable mShadowStart>
	//*   7   13:ifnull          53
			{
				mirror(mShadowStart, i);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #175 <Field Drawable mShadowStart>
	//   11   21:iload_1         
	//   12   22:invokespecial   #361 <Method boolean mirror(Drawable, int)>
	//   13   25:pop             
				return mShadowStart;
	//   14   26:aload_0         
	//   15   27:getfield        #175 <Field Drawable mShadowStart>
	//   16   30:areturn         
			}
		} else
		if(mShadowEnd != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #177 <Field Drawable mShadowEnd>
	//*  19   35:ifnull          53
		{
			mirror(mShadowEnd, i);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #177 <Field Drawable mShadowEnd>
	//   23   43:iload_1         
	//   24   44:invokespecial   #361 <Method boolean mirror(Drawable, int)>
	//   25   47:pop             
			return mShadowEnd;
	//   26   48:aload_0         
	//   27   49:getfield        #177 <Field Drawable mShadowEnd>
	//   28   52:areturn         
		}
		return mShadowLeft;
	//   29   53:aload_0         
	//   30   54:getfield        #179 <Field Drawable mShadowLeft>
	//   31   57:areturn         
	}

	private Drawable resolveRightShadow()
	{
		int i = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(mShadowEnd != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #177 <Field Drawable mShadowEnd>
	//*   7   13:ifnull          53
			{
				mirror(mShadowEnd, i);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #177 <Field Drawable mShadowEnd>
	//   11   21:iload_1         
	//   12   22:invokespecial   #361 <Method boolean mirror(Drawable, int)>
	//   13   25:pop             
				return mShadowEnd;
	//   14   26:aload_0         
	//   15   27:getfield        #177 <Field Drawable mShadowEnd>
	//   16   30:areturn         
			}
		} else
		if(mShadowStart != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #175 <Field Drawable mShadowStart>
	//*  19   35:ifnull          53
		{
			mirror(mShadowStart, i);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #175 <Field Drawable mShadowStart>
	//   23   43:iload_1         
	//   24   44:invokespecial   #361 <Method boolean mirror(Drawable, int)>
	//   25   47:pop             
			return mShadowStart;
	//   26   48:aload_0         
	//   27   49:getfield        #175 <Field Drawable mShadowStart>
	//   28   52:areturn         
		}
		return mShadowRight;
	//   29   53:aload_0         
	//   30   54:getfield        #181 <Field Drawable mShadowRight>
	//   31   57:areturn         
	}

	private void resolveShadowDrawables()
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			mShadowLeftResolved = resolveLeftShadow();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #365 <Method Drawable resolveLeftShadow()>
	//    6   12:putfield        #367 <Field Drawable mShadowLeftResolved>
			mShadowRightResolved = resolveRightShadow();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #369 <Method Drawable resolveRightShadow()>
	//   10   20:putfield        #371 <Field Drawable mShadowRightResolved>
			return;
	//   11   23:return          
		}
	}

	private void updateChildrenImportantForAccessibility(View view, boolean flag)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getChildCount()>
	//    2    4:istore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		while(i < j) 
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          66
		{
			View view1 = getChildAt(i);
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #327 <Method View getChildAt(int)>
	//   11   19:astore          5
			if(!flag && !isDrawerView(view1) || flag && view1 == view)
	//*  12   21:iload_2         
	//*  13   22:ifne            34
	//*  14   25:aload_0         
	//*  15   26:aload           5
	//*  16   28:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*  17   31:ifeq            44
	//*  18   34:iload_2         
	//*  19   35:ifeq            57
	//*  20   38:aload           5
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       57
				ViewCompat.setImportantForAccessibility(view1, 1);
	//   23   44:aload           5
	//   24   46:iconst_1        
	//   25   47:invokestatic    #244 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			else
	//*  26   50:iload_3         
	//*  27   51:iconst_1        
	//*  28   52:iadd            
	//*  29   53:istore_3        
	//*  30   54:goto            8
				ViewCompat.setImportantForAccessibility(view1, 4);
	//   31   57:aload           5
	//   32   59:iconst_4        
	//   33   60:invokestatic    #244 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			i++;
		}
	//*  34   63:goto            50
	//   35   66:return          
	}

	public void addDrawerListener(DrawerListener drawerlistener)
	{
		if(drawerlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mListeners == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #381 <Field List mListeners>
	//*   5    9:ifnonnull       23
			mListeners = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #291 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #292 <Method void ArrayList()>
	//   10   20:putfield        #381 <Field List mListeners>
		mListeners.add(((Object) (drawerlistener)));
	//   11   23:aload_0         
	//   12   24:getfield        #381 <Field List mListeners>
	//   13   27:aload_1         
	//   14   28:invokeinterface #387 <Method boolean List.add(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		if(getDescendantFocusability() == 0x60000)
	//*   2    3:aload_0         
	//*   3    4:invokevirtual   #393 <Method int getDescendantFocusability()>
	//*   4    7:ldc2            #394 <Int 0x60000>
	//*   5   10:icmpne          14
			return;
	//    6   13:return          
		int j1 = getChildCount();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #323 <Method int getChildCount()>
	//    9   18:istore          7
		int k = 0;
	//   10   20:iconst_0        
	//   11   21:istore          4
		boolean flag = false;
	//   12   23:iconst_0        
	//   13   24:istore          5
		while(k < j1) 
	//*  14   26:iload           4
	//*  15   28:iload           7
	//*  16   30:icmpge          92
		{
			View view = getChildAt(k);
	//   17   33:aload_0         
	//   18   34:iload           4
	//   19   36:invokevirtual   #327 <Method View getChildAt(int)>
	//   20   39:astore          8
			if(isDrawerView(view))
	//*  21   41:aload_0         
	//*  22   42:aload           8
	//*  23   44:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*  24   47:ifeq            79
			{
				if(isDrawerOpen(view))
	//*  25   50:aload_0         
	//*  26   51:aload           8
	//*  27   53:invokevirtual   #397 <Method boolean isDrawerOpen(View)>
	//*  28   56:ifeq            70
				{
					flag = true;
	//   29   59:iconst_1        
	//   30   60:istore          5
					view.addFocusables(arraylist, i, j);
	//   31   62:aload           8
	//   32   64:aload_1         
	//   33   65:iload_2         
	//   34   66:iload_3         
	//   35   67:invokevirtual   #399 <Method void View.addFocusables(ArrayList, int, int)>
				}
			} else
	//*  36   70:iload           4
	//*  37   72:iconst_1        
	//*  38   73:iadd            
	//*  39   74:istore          4
	//*  40   76:goto            26
			{
				mNonDrawerViews.add(((Object) (view)));
	//   41   79:aload_0         
	//   42   80:getfield        #294 <Field ArrayList mNonDrawerViews>
	//   43   83:aload           8
	//   44   85:invokevirtual   #400 <Method boolean ArrayList.add(Object)>
	//   45   88:pop             
			}
			k++;
		}
	//*  46   89:goto            70
		if(!flag)
	//*  47   92:iload           5
	//*  48   94:ifne            156
		{
			int i1 = mNonDrawerViews.size();
	//   49   97:aload_0         
	//   50   98:getfield        #294 <Field ArrayList mNonDrawerViews>
	//   51  101:invokevirtual   #403 <Method int ArrayList.size()>
	//   52  104:istore          5
			for(int l = ((int) (flag1)); l < i1; l++)
	//*  53  106:iload           6
	//*  54  108:istore          4
	//*  55  110:iload           4
	//*  56  112:iload           5
	//*  57  114:icmpge          156
			{
				View view1 = (View)mNonDrawerViews.get(l);
	//   58  117:aload_0         
	//   59  118:getfield        #294 <Field ArrayList mNonDrawerViews>
	//   60  121:iload           4
	//   61  123:invokevirtual   #407 <Method Object ArrayList.get(int)>
	//   62  126:checkcast       #308 <Class View>
	//   63  129:astore          8
				if(view1.getVisibility() == 0)
	//*  64  131:aload           8
	//*  65  133:invokevirtual   #410 <Method int View.getVisibility()>
	//*  66  136:ifne            147
					view1.addFocusables(arraylist, i, j);
	//   67  139:aload           8
	//   68  141:aload_1         
	//   69  142:iload_2         
	//   70  143:iload_3         
	//   71  144:invokevirtual   #399 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   72  147:iload           4
	//   73  149:iconst_1        
	//   74  150:iadd            
	//   75  151:istore          4
		}
	//*  76  153:goto            110
		mNonDrawerViews.clear();
	//   77  156:aload_0         
	//   78  157:getfield        #294 <Field ArrayList mNonDrawerViews>
	//   79  160:invokevirtual   #413 <Method void ArrayList.clear()>
	//   80  163:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #419 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(findOpenDrawer() != null || isDrawerView(view))
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #422 <Method View findOpenDrawer()>
	//*   7   11:ifnonnull       22
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*  11   19:ifeq            42
			ViewCompat.setImportantForAccessibility(view, 4);
	//   12   22:aload_1         
	//   13   23:iconst_4        
	//   14   24:invokestatic    #244 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		else
	//*  15   27:getstatic       #140 <Field boolean CAN_HIDE_DESCENDANTS>
	//*  16   30:ifne            41
	//*  17   33:aload_1         
	//*  18   34:aload_0         
	//*  19   35:getfield        #156 <Field DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate>
	//*  20   38:invokestatic    #251 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//*  21   41:return          
			ViewCompat.setImportantForAccessibility(view, 1);
	//   22   42:aload_1         
	//   23   43:iconst_1        
	//   24   44:invokestatic    #244 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		if(!CAN_HIDE_DESCENDANTS)
			ViewCompat.setAccessibilityDelegate(view, ((AccessibilityDelegateCompat) (mChildAccessibilityDelegate)));
	//*  25   47:goto            27
	}

	void cancelChildViewTouch()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		if(!mChildrenCanceledTouch)
	//*   2    2:aload_0         
	//*   3    3:getfield        #425 <Field boolean mChildrenCanceledTouch>
	//*   4    6:ifne            62
		{
			long l = SystemClock.uptimeMillis();
	//    5    9:invokestatic    #431 <Method long SystemClock.uptimeMillis()>
	//    6   12:lstore_3        
			MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//    7   13:lload_3         
	//    8   14:lload_3         
	//    9   15:iconst_3        
	//   10   16:fconst_0        
	//   11   17:fconst_0        
	//   12   18:iconst_0        
	//   13   19:invokestatic    #437 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   14   22:astore          5
			for(int j = getChildCount(); i < j; i++)
	//*  15   24:aload_0         
	//*  16   25:invokevirtual   #323 <Method int getChildCount()>
	//*  17   28:istore_2        
	//*  18   29:iload_1         
	//*  19   30:iload_2         
	//*  20   31:icmpge          52
				getChildAt(i).dispatchTouchEvent(motionevent);
	//   21   34:aload_0         
	//   22   35:iload_1         
	//   23   36:invokevirtual   #327 <Method View getChildAt(int)>
	//   24   39:aload           5
	//   25   41:invokevirtual   #441 <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//   26   44:pop             

	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_1        
	//*  31   49:goto            29
			motionevent.recycle();
	//   32   52:aload           5
	//   33   54:invokevirtual   #442 <Method void MotionEvent.recycle()>
			mChildrenCanceledTouch = true;
	//   34   57:aload_0         
	//   35   58:iconst_1        
	//   36   59:putfield        #425 <Field boolean mChildrenCanceledTouch>
		}
	//   37   62:return          
	}

	boolean checkDrawerViewAbsoluteGravity(View view, int i)
	{
		return (getDrawerViewAbsoluteGravity(view) & i) == i;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #447 <Method int getDrawerViewAbsoluteGravity(View)>
	//    3    5:iload_2         
	//    4    6:iand            
	//    5    7:iload_2         
	//    6    8:icmpne          13
	//    7   11:iconst_1        
	//    8   12:ireturn         
	//    9   13:iconst_0        
	//   10   14:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
	//    0    0:aload_1         
	//    1    1:instanceof      #20  <Class DrawerLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #451 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void closeDrawer(int i)
	{
		closeDrawer(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #455 <Method void closeDrawer(int, boolean)>
	//    4    6:return          
	}

	public void closeDrawer(int i, boolean flag)
	{
		View view = findDrawerWithGravity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #458 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_3        
		if(view == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       41
		{
			throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(gravityToString(i)).toString());
	//    6   10:new             #460 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #462 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #463 <Method void StringBuilder()>
	//   11   21:ldc2            #465 <String "No drawer view found with gravity ">
	//   12   24:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_1         
	//   14   28:invokestatic    #471 <Method String gravityToString(int)>
	//   15   31:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   17   37:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		} else
		{
			closeDrawer(view, flag);
	//   19   41:aload_0         
	//   20   42:aload_3         
	//   21   43:iload_2         
	//   22   44:invokevirtual   #480 <Method void closeDrawer(View, boolean)>
			return;
	//   23   47:return          
		}
	}

	public void closeDrawer(View view)
	{
		closeDrawer(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #480 <Method void closeDrawer(View, boolean)>
	//    4    6:return          
	}

	public void closeDrawer(View view, boolean flag)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a sliding drawer").toString());
	//    4    8:new             #460 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #462 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #463 <Method void StringBuilder()>
	//    9   19:ldc2            #483 <String "View ">
	//   10   22:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #486 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #488 <String " is not a sliding drawer">
	//   14   32:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   42:aload_1         
	//   19   43:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   21   49:astore_3        
		if(mFirstLayout)
	//*  22   50:aload_0         
	//*  23   51:getfield        #165 <Field boolean mFirstLayout>
	//*  24   54:ifeq            72
		{
			layoutparams.onScreen = 0.0F;
	//   25   57:aload_3         
	//   26   58:fconst_0        
	//   27   59:putfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
			layoutparams.openState = 0;
	//   28   62:aload_3         
	//   29   63:iconst_0        
	//   30   64:putfield        #494 <Field int DrawerLayout$LayoutParams.openState>
		} else
	//*  31   67:aload_0         
	//*  32   68:invokevirtual   #497 <Method void invalidate()>
	//*  33   71:return          
		if(flag)
	//*  34   72:iload_2         
	//*  35   73:ifeq            136
		{
			layoutparams.openState = layoutparams.openState | 4;
	//   36   76:aload_3         
	//   37   77:aload_3         
	//   38   78:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//   39   81:iconst_4        
	//   40   82:ior             
	//   41   83:putfield        #494 <Field int DrawerLayout$LayoutParams.openState>
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  42   86:aload_0         
	//*  43   87:aload_1         
	//*  44   88:iconst_3        
	//*  45   89:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  46   92:ifeq            116
				mLeftDragger.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
	//   47   95:aload_0         
	//   48   96:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   49   99:aload_1         
	//   50  100:aload_1         
	//   51  101:invokevirtual   #502 <Method int View.getWidth()>
	//   52  104:ineg            
	//   53  105:aload_1         
	//   54  106:invokevirtual   #505 <Method int View.getTop()>
	//   55  109:invokevirtual   #509 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   56  112:pop             
			else
	//*  57  113:goto            67
				mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
	//   58  116:aload_0         
	//   59  117:getfield        #234 <Field ViewDragHelper mRightDragger>
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:invokevirtual   #510 <Method int getWidth()>
	//   63  125:aload_1         
	//   64  126:invokevirtual   #505 <Method int View.getTop()>
	//   65  129:invokevirtual   #509 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   66  132:pop             
		} else
	//*  67  133:goto            67
		{
			moveDrawerToOffset(view, 0.0F);
	//   68  136:aload_0         
	//   69  137:aload_1         
	//   70  138:fconst_0        
	//   71  139:invokevirtual   #514 <Method void moveDrawerToOffset(View, float)>
			updateDrawerState(layoutparams.gravity, 0, view);
	//   72  142:aload_0         
	//   73  143:aload_3         
	//   74  144:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//   75  147:iconst_0        
	//   76  148:aload_1         
	//   77  149:invokevirtual   #521 <Method void updateDrawerState(int, int, View)>
			view.setVisibility(4);
	//   78  152:aload_1         
	//   79  153:iconst_4        
	//   80  154:invokevirtual   #524 <Method void View.setVisibility(int)>
		}
		invalidate();
	//*  81  157:goto            67
	}

	public void closeDrawers()
	{
		closeDrawers(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #527 <Method void closeDrawers(boolean)>
	//    3    5:return          
	}

	void closeDrawers(boolean flag)
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getChildCount()>
	//    2    4:istore          5
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag1 = false;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		while(i < k) 
	//*   7   10:iload_3         
	//*   8   11:iload           5
	//*   9   13:icmpge          143
		{
			View view = getChildAt(i);
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #327 <Method View getChildAt(int)>
	//   13   21:astore          6
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   14   23:aload           6
	//   15   25:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   28:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   17   31:astore          7
			int j = ((int) (flag1));
	//   18   33:iload_2         
	//   19   34:istore          4
			if(isDrawerView(view))
	//*  20   36:aload_0         
	//*  21   37:aload           6
	//*  22   39:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*  23   42:ifeq            60
				if(flag && !layoutparams.isPeeking)
	//*  24   45:iload_1         
	//*  25   46:ifeq            70
	//*  26   49:aload           7
	//*  27   51:getfield        #334 <Field boolean DrawerLayout$LayoutParams.isPeeking>
	//*  28   54:ifne            70
				{
					j = ((int) (flag1));
	//   29   57:iload_2         
	//   30   58:istore          4
				} else
	//*  31   60:iload_3         
	//*  32   61:iconst_1        
	//*  33   62:iadd            
	//*  34   63:istore_3        
	//*  35   64:iload           4
	//*  36   66:istore_2        
	//*  37   67:goto            10
				{
					j = view.getWidth();
	//   38   70:aload           6
	//   39   72:invokevirtual   #502 <Method int View.getWidth()>
	//   40   75:istore          4
					if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  41   77:aload_0         
	//*  42   78:aload           6
	//*  43   80:iconst_3        
	//*  44   81:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  45   84:ifeq            119
						flag1 |= mLeftDragger.smoothSlideViewTo(view, -j, view.getTop());
	//   46   87:iload_2         
	//   47   88:aload_0         
	//   48   89:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   49   92:aload           6
	//   50   94:iload           4
	//   51   96:ineg            
	//   52   97:aload           6
	//   53   99:invokevirtual   #505 <Method int View.getTop()>
	//   54  102:invokevirtual   #509 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   55  105:ior             
	//   56  106:istore_2        
					else
	//*  57  107:aload           7
	//*  58  109:iconst_0        
	//*  59  110:putfield        #334 <Field boolean DrawerLayout$LayoutParams.isPeeking>
	//*  60  113:iload_2         
	//*  61  114:istore          4
	//*  62  116:goto            60
						flag1 |= mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
	//   63  119:iload_2         
	//   64  120:aload_0         
	//   65  121:getfield        #234 <Field ViewDragHelper mRightDragger>
	//   66  124:aload           6
	//   67  126:aload_0         
	//   68  127:invokevirtual   #510 <Method int getWidth()>
	//   69  130:aload           6
	//   70  132:invokevirtual   #505 <Method int View.getTop()>
	//   71  135:invokevirtual   #509 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   72  138:ior             
	//   73  139:istore_2        
					layoutparams.isPeeking = false;
					j = ((int) (flag1));
				}
			i++;
			flag1 = ((boolean) (j));
		}
	//*  74  140:goto            107
		mLeftCallback.removeCallbacks();
	//   75  143:aload_0         
	//   76  144:getfield        #211 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   77  147:invokevirtual   #530 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		mRightCallback.removeCallbacks();
	//   78  150:aload_0         
	//   79  151:getfield        #213 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   80  154:invokevirtual   #530 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		if(flag1)
	//*  81  157:iload_2         
	//*  82  158:ifeq            165
			invalidate();
	//   83  161:aload_0         
	//   84  162:invokevirtual   #497 <Method void invalidate()>
	//   85  165:return          
	}

	public void computeScroll()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getChildCount()>
	//    2    4:istore_3        
		float f = 0.0F;
	//    3    5:fconst_0        
	//    4    6:fstore_1        
		for(int i = 0; i < j; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_2        
	//*   7    9:iload_2         
	//*   8   10:iload_3         
	//*   9   11:icmpge          40
			f = Math.max(f, ((LayoutParams)getChildAt(i).getLayoutParams()).onScreen);
	//   10   14:fload_1         
	//   11   15:aload_0         
	//   12   16:iload_2         
	//   13   17:invokevirtual   #327 <Method View getChildAt(int)>
	//   14   20:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   15   23:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   16   26:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//   17   29:invokestatic    #537 <Method float Math.max(float, float)>
	//   18   32:fstore_1        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            9
		mScrimOpacity = f;
	//   24   40:aload_0         
	//   25   41:fload_1         
	//   26   42:putfield        #539 <Field float mScrimOpacity>
		boolean flag = mLeftDragger.continueSettling(true);
	//   27   45:aload_0         
	//   28   46:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #543 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//   31   53:istore          4
		boolean flag1 = mRightDragger.continueSettling(true);
	//   32   55:aload_0         
	//   33   56:getfield        #234 <Field ViewDragHelper mRightDragger>
	//   34   59:iconst_1        
	//   35   60:invokevirtual   #543 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//   36   63:istore          5
		if(flag || flag1)
	//*  37   65:iload           4
	//*  38   67:ifne            75
	//*  39   70:iload           5
	//*  40   72:ifeq            79
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   41   75:aload_0         
	//   42   76:invokestatic    #546 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   43   79:return          
	}

	void dispatchOnDrawerClosed(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.openState & 1) == 1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:iconst_1        
	//*   9   15:icmpne          100
		{
			layoutparams.openState = 0;
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:putfield        #494 <Field int DrawerLayout$LayoutParams.openState>
			if(mListeners != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #381 <Field List mListeners>
	//*  15   27:ifnull          72
			{
				for(int i = mListeners.size() - 1; i >= 0; i--)
	//*  16   30:aload_0         
	//*  17   31:getfield        #381 <Field List mListeners>
	//*  18   34:invokeinterface #548 <Method int List.size()>
	//*  19   39:iconst_1        
	//*  20   40:isub            
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iflt            72
					((DrawerListener)mListeners.get(i)).onDrawerClosed(view);
	//   24   46:aload_0         
	//   25   47:getfield        #381 <Field List mListeners>
	//   26   50:iload_2         
	//   27   51:invokeinterface #549 <Method Object List.get(int)>
	//   28   56:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//   29   59:aload_1         
	//   30   60:invokeinterface #552 <Method void DrawerLayout$DrawerListener.onDrawerClosed(View)>

	//   31   65:iload_2         
	//   32   66:iconst_1        
	//   33   67:isub            
	//   34   68:istore_2        
			}
	//*  35   69:goto            42
			updateChildrenImportantForAccessibility(view, false);
	//   36   72:aload_0         
	//   37   73:aload_1         
	//   38   74:iconst_0        
	//   39   75:invokespecial   #554 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  40   78:aload_0         
	//*  41   79:invokevirtual   #557 <Method boolean hasWindowFocus()>
	//*  42   82:ifeq            100
			{
				view = getRootView();
	//   43   85:aload_0         
	//   44   86:invokevirtual   #560 <Method View getRootView()>
	//   45   89:astore_1        
				if(view != null)
	//*  46   90:aload_1         
	//*  47   91:ifnull          100
					view.sendAccessibilityEvent(32);
	//   48   94:aload_1         
	//   49   95:bipush          32
	//   50   97:invokevirtual   #563 <Method void View.sendAccessibilityEvent(int)>
			}
		}
	//   51  100:return          
	}

	void dispatchOnDrawerOpened(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.openState & 1) == 0)
	//*   4    8:aload_3         
	//*   5    9:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:ifne            90
		{
			layoutparams.openState = 1;
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:putfield        #494 <Field int DrawerLayout$LayoutParams.openState>
			if(mListeners != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #381 <Field List mListeners>
	//*  14   26:ifnull          71
			{
				for(int i = mListeners.size() - 1; i >= 0; i--)
	//*  15   29:aload_0         
	//*  16   30:getfield        #381 <Field List mListeners>
	//*  17   33:invokeinterface #548 <Method int List.size()>
	//*  18   38:iconst_1        
	//*  19   39:isub            
	//*  20   40:istore_2        
	//*  21   41:iload_2         
	//*  22   42:iflt            71
					((DrawerListener)mListeners.get(i)).onDrawerOpened(view);
	//   23   45:aload_0         
	//   24   46:getfield        #381 <Field List mListeners>
	//   25   49:iload_2         
	//   26   50:invokeinterface #549 <Method Object List.get(int)>
	//   27   55:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//   28   58:aload_1         
	//   29   59:invokeinterface #567 <Method void DrawerLayout$DrawerListener.onDrawerOpened(View)>

	//   30   64:iload_2         
	//   31   65:iconst_1        
	//   32   66:isub            
	//   33   67:istore_2        
			}
	//*  34   68:goto            41
			updateChildrenImportantForAccessibility(view, true);
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:iconst_1        
	//   38   74:invokespecial   #554 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  39   77:aload_0         
	//*  40   78:invokevirtual   #557 <Method boolean hasWindowFocus()>
	//*  41   81:ifeq            90
				sendAccessibilityEvent(32);
	//   42   84:aload_0         
	//   43   85:bipush          32
	//   44   87:invokevirtual   #568 <Method void sendAccessibilityEvent(int)>
		}
	//   45   90:return          
	}

	void dispatchOnDrawerSlide(View view, float f)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #381 <Field List mListeners>
	//*   2    4:ifnull          50
		{
			for(int i = mListeners.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #381 <Field List mListeners>
	//*   5   11:invokeinterface #548 <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_3        
	//*   9   19:iload_3         
	//*  10   20:iflt            50
				((DrawerListener)mListeners.get(i)).onDrawerSlide(view, f);
	//   11   23:aload_0         
	//   12   24:getfield        #381 <Field List mListeners>
	//   13   27:iload_3         
	//   14   28:invokeinterface #549 <Method Object List.get(int)>
	//   15   33:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//   16   36:aload_1         
	//   17   37:fload_2         
	//   18   38:invokeinterface #572 <Method void DrawerLayout$DrawerListener.onDrawerSlide(View, float)>

	//   19   43:iload_3         
	//   20   44:iconst_1        
	//   21   45:isub            
	//   22   46:istore_3        
		}
	//*  23   47:goto            19
	//   24   50:return          
	}

	protected boolean drawChild(Canvas canvas, View view, long l)
	{
		int i;
		int j;
		int k;
		int i1;
		int i2;
		int j2;
		int k2;
		boolean flag1;
		i2 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #577 <Method int getHeight()>
	//    2    4:istore          12
		flag1 = isContentView(view);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #580 <Method boolean isContentView(View)>
	//    6   11:istore          15
		k = 0;
	//    7   13:iconst_0        
	//    8   14:istore          8
		boolean flag = false;
	//    9   16:iconst_0        
	//   10   17:istore          10
		i = getWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #510 <Method int getWidth()>
	//   13   23:istore          6
		j2 = canvas.save();
	//   14   25:aload_1         
	//   15   26:invokevirtual   #585 <Method int Canvas.save()>
	//   16   29:istore          13
		j = i;
	//   17   31:iload           6
	//   18   33:istore          7
		if(!flag1)
			break MISSING_BLOCK_LABEL_220;
	//   19   35:iload           15
	//   20   37:ifeq            220
		k2 = getChildCount();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #323 <Method int getChildCount()>
	//   23   44:istore          14
		i1 = 0;
	//   24   46:iconst_0        
	//   25   47:istore          9
		k = ((int) (flag));
	//   26   49:iload           10
	//   27   51:istore          8
_L2:
		if(i1 >= k2)
			break MISSING_BLOCK_LABEL_202;
	//   28   53:iload           9
	//   29   55:iload           14
	//   30   57:icmpge          202
		View view1 = getChildAt(i1);
	//   31   60:aload_0         
	//   32   61:iload           9
	//   33   63:invokevirtual   #327 <Method View getChildAt(int)>
	//   34   66:astore          17
		if(view1 == view || view1.getVisibility() != 0 || !hasOpaqueBackground(view1) || !isDrawerView(view1))
			break; /* Loop/switch isn't completed */
	//   35   68:aload           17
	//   36   70:aload_2         
	//   37   71:if_acmpeq       191
	//   38   74:aload           17
	//   39   76:invokevirtual   #410 <Method int View.getVisibility()>
	//   40   79:ifne            191
	//   41   82:aload           17
	//   42   84:invokestatic    #587 <Method boolean hasOpaqueBackground(View)>
	//   43   87:ifeq            191
	//   44   90:aload_0         
	//   45   91:aload           17
	//   46   93:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//   47   96:ifeq            191
		int k1;
		if(view1.getHeight() < i2)
	//*  48   99:aload           17
	//*  49  101:invokevirtual   #588 <Method int View.getHeight()>
	//*  50  104:iload           12
	//*  51  106:icmpge          134
		{
			k1 = k;
	//   52  109:iload           8
	//   53  111:istore          10
			j = i;
	//   54  113:iload           6
	//   55  115:istore          7
		} else
	//*  56  117:iload           9
	//*  57  119:iconst_1        
	//*  58  120:iadd            
	//*  59  121:istore          9
	//*  60  123:iload           7
	//*  61  125:istore          6
	//*  62  127:iload           10
	//*  63  129:istore          8
	//*  64  131:goto            53
		{
label0:
			{
				if(!checkDrawerViewAbsoluteGravity(view1, 3))
					break label0;
	//   65  134:aload_0         
	//   66  135:aload           17
	//   67  137:iconst_3        
	//   68  138:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//   69  141:ifeq            169
				j = view1.getRight();
	//   70  144:aload           17
	//   71  146:invokevirtual   #591 <Method int View.getRight()>
	//   72  149:istore          7
				float f;
				int j1;
				int l1;
				boolean flag2;
				if(j <= k)
	//*  73  151:iload           7
	//*  74  153:iload           8
	//*  75  155:icmple          534
	//*  76  158:iload           7
	//*  77  160:istore          10
	//*  78  162:iload           6
	//*  79  164:istore          7
	//*  80  166:goto            117
	//*  81  169:aload           17
	//*  82  171:invokevirtual   #594 <Method int View.getLeft()>
	//*  83  174:istore          11
	//*  84  176:iload           11
	//*  85  178:istore          7
	//*  86  180:iload           8
	//*  87  182:istore          10
	//*  88  184:iload           11
	//*  89  186:iload           6
	//*  90  188:icmplt          117
	//*  91  191:iload           6
	//*  92  193:istore          7
	//*  93  195:iload           8
	//*  94  197:istore          10
	//*  95  199:goto            117
	//*  96  202:aload_1         
	//*  97  203:iload           8
	//*  98  205:iconst_0        
	//*  99  206:iload           6
	//* 100  208:aload_0         
	//* 101  209:invokevirtual   #577 <Method int getHeight()>
	//* 102  212:invokevirtual   #598 <Method boolean Canvas.clipRect(int, int, int, int)>
	//* 103  215:pop             
	//* 104  216:iload           6
	//* 105  218:istore          7
	//* 106  220:aload_0         
	//* 107  221:aload_1         
	//* 108  222:aload_2         
	//* 109  223:lload_3         
	//* 110  224:invokespecial   #600 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//* 111  227:istore          16
	//* 112  229:aload_1         
	//* 113  230:iload           13
	//* 114  232:invokevirtual   #603 <Method void Canvas.restoreToCount(int)>
	//* 115  235:aload_0         
	//* 116  236:getfield        #539 <Field float mScrimOpacity>
	//* 117  239:fconst_0        
	//* 118  240:fcmpl           
	//* 119  241:ifle            317
	//* 120  244:iload           15
	//* 121  246:ifeq            317
	//* 122  249:aload_0         
	//* 123  250:getfield        #158 <Field int mScrimColor>
	//* 124  253:ldc2            #604 <Int 0xff000000>
	//* 125  256:iand            
	//* 126  257:bipush          24
	//* 127  259:iushr           
	//* 128  260:i2f             
	//* 129  261:aload_0         
	//* 130  262:getfield        #539 <Field float mScrimOpacity>
	//* 131  265:fmul            
	//* 132  266:f2i             
	//* 133  267:istore          6
	//* 134  269:aload_0         
	//* 135  270:getfield        #158 <Field int mScrimColor>
	//* 136  273:istore          9
	//* 137  275:aload_0         
	//* 138  276:getfield        #163 <Field Paint mScrimPaint>
	//* 139  279:iload           6
	//* 140  281:bipush          24
	//* 141  283:ishl            
	//* 142  284:iload           9
	//* 143  286:ldc2            #605 <Int 0xffffff>
	//* 144  289:iand            
	//* 145  290:ior             
	//* 146  291:invokevirtual   #608 <Method void Paint.setColor(int)>
	//* 147  294:aload_1         
	//* 148  295:iload           8
	//* 149  297:i2f             
	//* 150  298:fconst_0        
	//* 151  299:iload           7
	//* 152  301:i2f             
	//* 153  302:aload_0         
	//* 154  303:invokevirtual   #577 <Method int getHeight()>
	//* 155  306:i2f             
	//* 156  307:aload_0         
	//* 157  308:getfield        #163 <Field Paint mScrimPaint>
	//* 158  311:invokevirtual   #612 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//* 159  314:iload           16
	//* 160  316:ireturn         
	//* 161  317:aload_0         
	//* 162  318:getfield        #367 <Field Drawable mShadowLeftResolved>
	//* 163  321:ifnull          421
	//* 164  324:aload_0         
	//* 165  325:aload_2         
	//* 166  326:iconst_3        
	//* 167  327:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 168  330:ifeq            421
	//* 169  333:aload_0         
	//* 170  334:getfield        #367 <Field Drawable mShadowLeftResolved>
	//* 171  337:invokevirtual   #615 <Method int Drawable.getIntrinsicWidth()>
	//* 172  340:istore          6
	//* 173  342:aload_2         
	//* 174  343:invokevirtual   #591 <Method int View.getRight()>
	//* 175  346:istore          7
	//* 176  348:aload_0         
	//* 177  349:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//* 178  352:invokevirtual   #618 <Method int ViewDragHelper.getEdgeSize()>
	//* 179  355:istore          8
	//* 180  357:fconst_0        
	//* 181  358:iload           7
	//* 182  360:i2f             
	//* 183  361:iload           8
	//* 184  363:i2f             
	//* 185  364:fdiv            
	//* 186  365:fconst_1        
	//* 187  366:invokestatic    #621 <Method float Math.min(float, float)>
	//* 188  369:invokestatic    #537 <Method float Math.max(float, float)>
	//* 189  372:fstore          5
	//* 190  374:aload_0         
	//* 191  375:getfield        #367 <Field Drawable mShadowLeftResolved>
	//* 192  378:iload           7
	//* 193  380:aload_2         
	//* 194  381:invokevirtual   #505 <Method int View.getTop()>
	//* 195  384:iload           6
	//* 196  386:iload           7
	//* 197  388:iadd            
	//* 198  389:aload_2         
	//* 199  390:invokevirtual   #624 <Method int View.getBottom()>
	//* 200  393:invokevirtual   #628 <Method void Drawable.setBounds(int, int, int, int)>
	//* 201  396:aload_0         
	//* 202  397:getfield        #367 <Field Drawable mShadowLeftResolved>
	//* 203  400:ldc2            #629 <Float 255F>
	//* 204  403:fload           5
	//* 205  405:fmul            
	//* 206  406:f2i             
	//* 207  407:invokevirtual   #632 <Method void Drawable.setAlpha(int)>
	//* 208  410:aload_0         
	//* 209  411:getfield        #367 <Field Drawable mShadowLeftResolved>
	//* 210  414:aload_1         
	//* 211  415:invokevirtual   #636 <Method void Drawable.draw(Canvas)>
	//* 212  418:iload           16
	//* 213  420:ireturn         
	//* 214  421:aload_0         
	//* 215  422:getfield        #371 <Field Drawable mShadowRightResolved>
	//* 216  425:ifnull          314
	//* 217  428:aload_0         
	//* 218  429:aload_2         
	//* 219  430:iconst_5        
	//* 220  431:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 221  434:ifeq            314
	//* 222  437:aload_0         
	//* 223  438:getfield        #371 <Field Drawable mShadowRightResolved>
	//* 224  441:invokevirtual   #615 <Method int Drawable.getIntrinsicWidth()>
	//* 225  444:istore          6
	//* 226  446:aload_2         
	//* 227  447:invokevirtual   #594 <Method int View.getLeft()>
	//* 228  450:istore          7
	//* 229  452:aload_0         
	//* 230  453:invokevirtual   #510 <Method int getWidth()>
	//* 231  456:istore          8
	//* 232  458:aload_0         
	//* 233  459:getfield        #234 <Field ViewDragHelper mRightDragger>
	//* 234  462:invokevirtual   #618 <Method int ViewDragHelper.getEdgeSize()>
	//* 235  465:istore          9
	//* 236  467:fconst_0        
	//* 237  468:iload           8
	//* 238  470:iload           7
	//* 239  472:isub            
	//* 240  473:i2f             
	//* 241  474:iload           9
	//* 242  476:i2f             
	//* 243  477:fdiv            
	//* 244  478:fconst_1        
	//* 245  479:invokestatic    #621 <Method float Math.min(float, float)>
	//* 246  482:invokestatic    #537 <Method float Math.max(float, float)>
	//* 247  485:fstore          5
	//* 248  487:aload_0         
	//* 249  488:getfield        #371 <Field Drawable mShadowRightResolved>
	//* 250  491:iload           7
	//* 251  493:iload           6
	//* 252  495:isub            
	//* 253  496:aload_2         
	//* 254  497:invokevirtual   #505 <Method int View.getTop()>
	//* 255  500:iload           7
	//* 256  502:aload_2         
	//* 257  503:invokevirtual   #624 <Method int View.getBottom()>
	//* 258  506:invokevirtual   #628 <Method void Drawable.setBounds(int, int, int, int)>
	//* 259  509:aload_0         
	//* 260  510:getfield        #371 <Field Drawable mShadowRightResolved>
	//* 261  513:ldc2            #629 <Float 255F>
	//* 262  516:fload           5
	//* 263  518:fmul            
	//* 264  519:f2i             
	//* 265  520:invokevirtual   #632 <Method void Drawable.setAlpha(int)>
	//* 266  523:aload_0         
	//* 267  524:getfield        #371 <Field Drawable mShadowRightResolved>
	//* 268  527:aload_1         
	//* 269  528:invokevirtual   #636 <Method void Drawable.draw(Canvas)>
	//* 270  531:iload           16
	//* 271  533:ireturn         
					j = k;
	//  272  534:iload           8
	//  273  536:istore          7
				k1 = j;
				j = i;
			}
		}
_L3:
		i1++;
		i = j;
		k = k1;
		if(true) goto _L2; else goto _L1
		l1 = view1.getLeft();
		j = l1;
		k1 = k;
		if(l1 < i) goto _L3; else goto _L1
_L1:
		j = i;
		k1 = k;
		  goto _L3
		canvas.clipRect(k, 0, i, getHeight());
		j = i;
		flag2 = super.drawChild(canvas, view, l);
		canvas.restoreToCount(j2);
		if(mScrimOpacity > 0.0F && flag1)
		{
			i = (int)((float)((mScrimColor & 0xff000000) >>> 24) * mScrimOpacity);
			j1 = mScrimColor;
			mScrimPaint.setColor(i << 24 | j1 & 0xffffff);
			canvas.drawRect(k, 0.0F, j, getHeight(), mScrimPaint);
		} else
		{
			if(mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3))
			{
				i = mShadowLeftResolved.getIntrinsicWidth();
				j = view.getRight();
				k = mLeftDragger.getEdgeSize();
				f = Math.max(0.0F, Math.min((float)j / (float)k, 1.0F));
				mShadowLeftResolved.setBounds(j, view.getTop(), i + j, view.getBottom());
				mShadowLeftResolved.setAlpha((int)(255F * f));
				mShadowLeftResolved.draw(canvas);
				return flag2;
			}
			if(mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5))
			{
				i = mShadowRightResolved.getIntrinsicWidth();
				j = view.getLeft();
				k = getWidth();
				j1 = mRightDragger.getEdgeSize();
				f = Math.max(0.0F, Math.min((float)(k - j) / (float)j1, 1.0F));
				mShadowRightResolved.setBounds(j - i, view.getTop(), j, view.getBottom());
				mShadowRightResolved.setAlpha((int)(255F * f));
				mShadowRightResolved.draw(canvas);
				return flag2;
			}
		}
		return flag2;
	//* 274  538:goto            158
	}

	View findDrawerWithGravity(int i)
	{
		int j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #642 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_2        
		int k = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #323 <Method int getChildCount()>
	//    7   13:istore_3        
		for(i = 0; i < k; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_3         
	//*  12   18:icmpge          54
		{
			View view = getChildAt(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #327 <Method View getChildAt(int)>
	//   16   26:astore          4
			if((getDrawerViewAbsoluteGravity(view) & 7) == (j & 7))
	//*  17   28:aload_0         
	//*  18   29:aload           4
	//*  19   31:invokevirtual   #447 <Method int getDrawerViewAbsoluteGravity(View)>
	//*  20   34:bipush          7
	//*  21   36:iand            
	//*  22   37:iload_2         
	//*  23   38:bipush          7
	//*  24   40:iand            
	//*  25   41:icmpne          47
				return view;
	//   26   44:aload           4
	//   27   46:areturn         
		}

	//   28   47:iload_1         
	//   29   48:iconst_1        
	//   30   49:iadd            
	//   31   50:istore_1        
	//*  32   51:goto            16
		return null;
	//   33   54:aconst_null     
	//   34   55:areturn         
	}

	View findOpenDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #327 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if((((LayoutParams)view.getLayoutParams()).openState & 1) == 1)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  14   22:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//*  15   25:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//*  16   28:iconst_1        
	//*  17   29:iand            
	//*  18   30:iconst_1        
	//*  19   31:icmpne          36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	View findVisibleDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #323 <Method int getChildCount()>
	//    2    4:istore_2        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iload_2         
	//*   7    9:icmpge          43
		{
			View view = getChildAt(i);
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:invokevirtual   #327 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(isDrawerView(view) && isDrawerVisible(view))
	//*  12   18:aload_0         
	//*  13   19:aload_3         
	//*  14   20:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*  15   23:ifeq            36
	//*  16   26:aload_0         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #645 <Method boolean isDrawerVisible(View)>
	//*  19   31:ifeq            36
				return view;
	//   20   34:aload_3         
	//   21   35:areturn         
		}

	//   22   36:iload_1         
	//   23   37:iconst_1        
	//   24   38:iadd            
	//   25   39:istore_1        
	//*  26   40:goto            7
		return null;
	//   27   43:aconst_null     
	//   28   44:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(-1, -1)));
	//    0    0:new             #20  <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #649 <Method void DrawerLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #20  <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #655 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #656 <Method void DrawerLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #20  <Class DrawerLayout$LayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((LayoutParams)layoutparams)));
	//    3    7:new             #20  <Class DrawerLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    7   15:invokespecial   #660 <Method void DrawerLayout$LayoutParams(DrawerLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #662 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//   12   26:new             #20  <Class DrawerLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #662 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #665 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   18   38:new             #20  <Class DrawerLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #668 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public float getDrawerElevation()
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            11
			return mDrawerElevation;
	//    2    6:aload_0         
	//    3    7:getfield        #289 <Field float mDrawerElevation>
	//    4   10:freturn         
		else
			return 0.0F;
	//    5   11:fconst_0        
	//    6   12:freturn         
	}

	public int getDrawerLockMode(int i)
	{
		int j = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_2        
		i;
	//    3    5:iload_1         
		JVM INSTR lookupswitch 4: default 48
	//	               3: 50
	//	               5: 87
	//	               8388611: 124
	//	               8388613: 161;
	//    4    6:lookupswitch    4: default 48
	//	               3: 50
	//	               5: 87
	//	               8388611: 124
	//	               8388613: 161
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		return 0;
	//    5   48:iconst_0        
	//    6   49:ireturn         
_L2:
		if(mLockModeLeft != 3)
	//*   7   50:aload_0         
	//*   8   51:getfield        #167 <Field int mLockModeLeft>
	//*   9   54:iconst_3        
	//*  10   55:icmpeq          63
			return mLockModeLeft;
	//   11   58:aload_0         
	//   12   59:getfield        #167 <Field int mLockModeLeft>
	//   13   62:ireturn         
		if(j == 0)
	//*  14   63:iload_2         
	//*  15   64:ifne            79
			i = mLockModeStart;
	//   16   67:aload_0         
	//   17   68:getfield        #171 <Field int mLockModeStart>
	//   18   71:istore_1        
		else
	//*  19   72:iload_1         
	//*  20   73:iconst_3        
	//*  21   74:icmpeq          48
	//*  22   77:iload_1         
	//*  23   78:ireturn         
			i = mLockModeEnd;
	//   24   79:aload_0         
	//   25   80:getfield        #173 <Field int mLockModeEnd>
	//   26   83:istore_1        
		if(i != 3)
			return i;
		continue; /* Loop/switch isn't completed */
	//   27   84:goto            72
_L3:
		if(mLockModeRight != 3)
	//*  28   87:aload_0         
	//*  29   88:getfield        #169 <Field int mLockModeRight>
	//*  30   91:iconst_3        
	//*  31   92:icmpeq          100
			return mLockModeRight;
	//   32   95:aload_0         
	//   33   96:getfield        #169 <Field int mLockModeRight>
	//   34   99:ireturn         
		if(j == 0)
	//*  35  100:iload_2         
	//*  36  101:ifne            116
			i = mLockModeEnd;
	//   37  104:aload_0         
	//   38  105:getfield        #173 <Field int mLockModeEnd>
	//   39  108:istore_1        
		else
	//*  40  109:iload_1         
	//*  41  110:iconst_3        
	//*  42  111:icmpeq          48
	//*  43  114:iload_1         
	//*  44  115:ireturn         
			i = mLockModeStart;
	//   45  116:aload_0         
	//   46  117:getfield        #171 <Field int mLockModeStart>
	//   47  120:istore_1        
		if(i != 3)
			return i;
		if(true) goto _L1; else goto _L4
	//   48  121:goto            109
_L4:
		if(mLockModeStart != 3)
	//*  49  124:aload_0         
	//*  50  125:getfield        #171 <Field int mLockModeStart>
	//*  51  128:iconst_3        
	//*  52  129:icmpeq          137
			return mLockModeStart;
	//   53  132:aload_0         
	//   54  133:getfield        #171 <Field int mLockModeStart>
	//   55  136:ireturn         
		if(j == 0)
	//*  56  137:iload_2         
	//*  57  138:ifne            153
			i = mLockModeLeft;
	//   58  141:aload_0         
	//   59  142:getfield        #167 <Field int mLockModeLeft>
	//   60  145:istore_1        
		else
	//*  61  146:iload_1         
	//*  62  147:iconst_3        
	//*  63  148:icmpeq          48
	//*  64  151:iload_1         
	//*  65  152:ireturn         
			i = mLockModeRight;
	//   66  153:aload_0         
	//   67  154:getfield        #169 <Field int mLockModeRight>
	//   68  157:istore_1        
		if(i != 3)
			return i;
		if(true)
			continue; /* Loop/switch isn't completed */
	//   69  158:goto            146
_L5:
		if(mLockModeEnd != 3)
	//*  70  161:aload_0         
	//*  71  162:getfield        #173 <Field int mLockModeEnd>
	//*  72  165:iconst_3        
	//*  73  166:icmpeq          174
			return mLockModeEnd;
	//   74  169:aload_0         
	//   75  170:getfield        #173 <Field int mLockModeEnd>
	//   76  173:ireturn         
		if(j == 0)
	//*  77  174:iload_2         
	//*  78  175:ifne            190
			i = mLockModeRight;
	//   79  178:aload_0         
	//   80  179:getfield        #169 <Field int mLockModeRight>
	//   81  182:istore_1        
		else
	//*  82  183:iload_1         
	//*  83  184:iconst_3        
	//*  84  185:icmpeq          48
	//*  85  188:iload_1         
	//*  86  189:ireturn         
			i = mLockModeLeft;
	//   87  190:aload_0         
	//   88  191:getfield        #167 <Field int mLockModeLeft>
	//   89  194:istore_1        
		if(i != 3)
			return i;
		if(true) goto _L1; else goto _L6
	//   90  195:goto            183
_L6:
	}

	public int getDrawerLockMode(View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a drawer").toString());
	//    4    8:new             #460 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #462 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #463 <Method void StringBuilder()>
	//    9   19:ldc2            #483 <String "View ">
	//   10   22:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #486 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #674 <String " is not a drawer">
	//   14   32:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		else
			return getDrawerLockMode(((LayoutParams)view.getLayoutParams()).gravity);
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   47:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   22   50:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//   23   53:invokevirtual   #676 <Method int getDrawerLockMode(int)>
	//   24   56:ireturn         
	}

	public CharSequence getDrawerTitle(int i)
	{
		i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #642 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_1        
		if(i == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          19
			return mTitleLeft;
	//    8   14:aload_0         
	//    9   15:getfield        #680 <Field CharSequence mTitleLeft>
	//   10   18:areturn         
		if(i == 5)
	//*  11   19:iload_1         
	//*  12   20:iconst_5        
	//*  13   21:icmpne          29
			return mTitleRight;
	//   14   24:aload_0         
	//   15   25:getfield        #682 <Field CharSequence mTitleRight>
	//   16   28:areturn         
		else
			return null;
	//   17   29:aconst_null     
	//   18   30:areturn         
	}

	int getDrawerViewAbsoluteGravity(View view)
	{
		return GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_0         
	//    5   11:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #642 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    7   17:ireturn         
	}

	float getDrawerViewOffset(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).onScreen;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//    4   10:freturn         
	}

	public Drawable getStatusBarBackgroundDrawable()
	{
		return mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #283 <Field Drawable mStatusBarBackground>
	//    2    4:areturn         
	}

	boolean isContentView(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).gravity == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public boolean isDrawerOpen(int i)
	{
		View view = findDrawerWithGravity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #458 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return isDrawerOpen(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #397 <Method boolean isDrawerOpen(View)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public boolean isDrawerOpen(View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a drawer").toString());
	//    4    8:new             #460 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #462 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #463 <Method void StringBuilder()>
	//    9   19:ldc2            #483 <String "View ">
	//   10   22:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #486 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #674 <String " is not a drawer">
	//   14   32:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		return (((LayoutParams)view.getLayoutParams()).openState & 1) == 1;
	//   18   42:aload_1         
	//   19   43:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   21   49:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//   22   52:iconst_1        
	//   23   53:iand            
	//   24   54:iconst_1        
	//   25   55:icmpne          60
	//   26   58:iconst_1        
	//   27   59:ireturn         
	//   28   60:iconst_0        
	//   29   61:ireturn         
	}

	boolean isDrawerView(View view)
	{
		int i = GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_1         
	//    5   11:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #642 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    7   17:istore_2        
		if((i & 3) != 0)
	//*   8   18:iload_2         
	//*   9   19:iconst_3        
	//*  10   20:iand            
	//*  11   21:ifeq            26
			return true;
	//   12   24:iconst_1        
	//   13   25:ireturn         
		return (i & 5) != 0;
	//   14   26:iload_2         
	//   15   27:iconst_5        
	//   16   28:iand            
	//   17   29:ifeq            34
	//   18   32:iconst_1        
	//   19   33:ireturn         
	//   20   34:iconst_0        
	//   21   35:ireturn         
	}

	public boolean isDrawerVisible(int i)
	{
		View view = findDrawerWithGravity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #458 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return isDrawerVisible(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #645 <Method boolean isDrawerVisible(View)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public boolean isDrawerVisible(View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a drawer").toString());
	//    4    8:new             #460 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #462 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #463 <Method void StringBuilder()>
	//    9   19:ldc2            #483 <String "View ">
	//   10   22:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #486 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #674 <String " is not a drawer">
	//   14   32:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		return ((LayoutParams)view.getLayoutParams()).onScreen > 0.0F;
	//   18   42:aload_1         
	//   19   43:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   21   49:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//   22   52:fconst_0        
	//   23   53:fcmpl           
	//   24   54:ifle            59
	//   25   57:iconst_1        
	//   26   58:ireturn         
	//   27   59:iconst_0        
	//   28   60:ireturn         
	}

	void moveDrawerToOffset(View view, float f)
	{
		float f1 = getDrawerViewOffset(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #689 <Method float getDrawerViewOffset(View)>
	//    3    5:fstore_3        
		int i = view.getWidth();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #502 <Method int View.getWidth()>
	//    6   10:istore          4
		int j = (int)(f1 * (float)i);
	//    7   12:fload_3         
	//    8   13:iload           4
	//    9   15:i2f             
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:istore          5
		i = (int)((float)i * f) - j;
	//   13   20:iload           4
	//   14   22:i2f             
	//   15   23:fload_2         
	//   16   24:fmul            
	//   17   25:f2i             
	//   18   26:iload           5
	//   19   28:isub            
	//   20   29:istore          4
		if(!checkDrawerViewAbsoluteGravity(view, 3))
	//*  21   31:aload_0         
	//*  22   32:aload_1         
	//*  23   33:iconst_3        
	//*  24   34:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  25   37:ifeq            53
	//*  26   40:aload_1         
	//*  27   41:iload           4
	//*  28   43:invokevirtual   #692 <Method void View.offsetLeftAndRight(int)>
	//*  29   46:aload_0         
	//*  30   47:aload_1         
	//*  31   48:fload_2         
	//*  32   49:invokevirtual   #695 <Method void setDrawerViewOffset(View, float)>
	//*  33   52:return          
			i = -i;
	//   34   53:iload           4
	//   35   55:ineg            
	//   36   56:istore          4
		view.offsetLeftAndRight(i);
		setDrawerViewOffset(view, f);
	//*  37   58:goto            40
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #698 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #165 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #701 <Method void ViewGroup.onDetachedFromWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #165 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #704 <Method void ViewGroup.onDraw(Canvas)>
		if(mDrawStatusBarBackground && mStatusBarBackground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #706 <Field boolean mDrawStatusBarBackground>
	//*   5    9:ifeq            71
	//*   6   12:aload_0         
	//*   7   13:getfield        #283 <Field Drawable mStatusBarBackground>
	//*   8   16:ifnull          71
		{
			int i;
			if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   9   19:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          21
	//*  11   24:icmplt          77
			{
				if(mLastInsets != null)
	//*  12   27:aload_0         
	//*  13   28:getfield        #708 <Field Object mLastInsets>
	//*  14   31:ifnull          72
					i = ((WindowInsets)mLastInsets).getSystemWindowInsetTop();
	//   15   34:aload_0         
	//   16   35:getfield        #708 <Field Object mLastInsets>
	//   17   38:checkcast       #710 <Class WindowInsets>
	//   18   41:invokevirtual   #713 <Method int WindowInsets.getSystemWindowInsetTop()>
	//   19   44:istore_2        
				else
	//*  20   45:iload_2         
	//*  21   46:ifle            71
	//*  22   49:aload_0         
	//*  23   50:getfield        #283 <Field Drawable mStatusBarBackground>
	//*  24   53:iconst_0        
	//*  25   54:iconst_0        
	//*  26   55:aload_0         
	//*  27   56:invokevirtual   #510 <Method int getWidth()>
	//*  28   59:iload_2         
	//*  29   60:invokevirtual   #628 <Method void Drawable.setBounds(int, int, int, int)>
	//*  30   63:aload_0         
	//*  31   64:getfield        #283 <Field Drawable mStatusBarBackground>
	//*  32   67:aload_1         
	//*  33   68:invokevirtual   #636 <Method void Drawable.draw(Canvas)>
	//*  34   71:return          
					i = 0;
	//   35   72:iconst_0        
	//   36   73:istore_2        
			} else
	//*  37   74:goto            45
			{
				i = 0;
	//   38   77:iconst_0        
	//   39   78:istore_2        
			}
			if(i > 0)
			{
				mStatusBarBackground.setBounds(0, 0, getWidth(), i);
				mStatusBarBackground.draw(canvas);
			}
		}
	//*  40   79:goto            45
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i;
		boolean flag1;
		boolean flag2;
		boolean flag3;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          5
		i = motionevent.getActionMasked();
	//    2    3:aload_1         
	//    3    4:invokevirtual   #717 <Method int MotionEvent.getActionMasked()>
	//    4    7:istore          4
		flag2 = mLeftDragger.shouldInterceptTouchEvent(motionevent);
	//    5    9:aload_0         
	//    6   10:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #720 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//    9   17:istore          6
		flag3 = mRightDragger.shouldInterceptTouchEvent(motionevent);
	//   10   19:aload_0         
	//   11   20:getfield        #234 <Field ViewDragHelper mRightDragger>
	//   12   23:aload_1         
	//   13   24:invokevirtual   #720 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//   14   27:istore          7
		i;
	//   15   29:iload           4
		JVM INSTR tableswitch 0 3: default 60
	//	               0 96
	//	               1 196
	//	               2 165
	//	               3 196;
	//   16   31:tableswitch     0 3: default 60
	//	               0 96
	//	               1 196
	//	               2 165
	//	               3 196
		   goto _L1 _L2 _L3 _L4 _L3
_L1:
		boolean flag = false;
	//   17   60:iconst_0        
	//   18   61:istore          4
_L8:
		if(flag2 | flag3 || flag || hasPeekingDrawer() || mChildrenCanceledTouch)
	//*  19   63:iload           6
	//*  20   65:iload           7
	//*  21   67:ior             
	//*  22   68:ifne            90
	//*  23   71:iload           4
	//*  24   73:ifne            90
	//*  25   76:aload_0         
	//*  26   77:invokespecial   #722 <Method boolean hasPeekingDrawer()>
	//*  27   80:ifne            90
	//*  28   83:aload_0         
	//*  29   84:getfield        #425 <Field boolean mChildrenCanceledTouch>
	//*  30   87:ifeq            93
			flag1 = true;
	//   31   90:iconst_1        
	//   32   91:istore          5
		return flag1;
	//   33   93:iload           5
	//   34   95:ireturn         
_L2:
		float f;
		float f1;
		f = motionevent.getX();
	//   35   96:aload_1         
	//   36   97:invokevirtual   #725 <Method float MotionEvent.getX()>
	//   37  100:fstore_2        
		f1 = motionevent.getY();
	//   38  101:aload_1         
	//   39  102:invokevirtual   #728 <Method float MotionEvent.getY()>
	//   40  105:fstore_3        
		mInitialMotionX = f;
	//   41  106:aload_0         
	//   42  107:fload_2         
	//   43  108:putfield        #730 <Field float mInitialMotionX>
		mInitialMotionY = f1;
	//   44  111:aload_0         
	//   45  112:fload_3         
	//   46  113:putfield        #732 <Field float mInitialMotionY>
		if(mScrimOpacity <= 0.0F) goto _L6; else goto _L5
	//   47  116:aload_0         
	//   48  117:getfield        #539 <Field float mScrimOpacity>
	//   49  120:fconst_0        
	//   50  121:fcmpl           
	//   51  122:ifle            214
_L5:
		motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f, (int)f1)));
	//   52  125:aload_0         
	//   53  126:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   54  129:fload_2         
	//   55  130:f2i             
	//   56  131:fload_3         
	//   57  132:f2i             
	//   58  133:invokevirtual   #736 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   59  136:astore_1        
		if(motionevent == null || !isContentView(((View) (motionevent)))) goto _L6; else goto _L7
	//   60  137:aload_1         
	//   61  138:ifnull          214
	//   62  141:aload_0         
	//   63  142:aload_1         
	//   64  143:invokevirtual   #580 <Method boolean isContentView(View)>
	//   65  146:ifeq            214
_L7:
		flag = true;
	//   66  149:iconst_1        
	//   67  150:istore          4
_L10:
		mDisallowInterceptRequested = false;
	//   68  152:aload_0         
	//   69  153:iconst_0        
	//   70  154:putfield        #738 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//   71  157:aload_0         
	//   72  158:iconst_0        
	//   73  159:putfield        #425 <Field boolean mChildrenCanceledTouch>
		  goto _L8
	//*  74  162:goto            63
_L4:
		if(!mLeftDragger.checkTouchSlop(3)) goto _L1; else goto _L9
	//   75  165:aload_0         
	//   76  166:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   77  169:iconst_3        
	//   78  170:invokevirtual   #741 <Method boolean ViewDragHelper.checkTouchSlop(int)>
	//   79  173:ifeq            60
_L9:
		mLeftCallback.removeCallbacks();
	//   80  176:aload_0         
	//   81  177:getfield        #211 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   82  180:invokevirtual   #530 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		mRightCallback.removeCallbacks();
	//   83  183:aload_0         
	//   84  184:getfield        #213 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   85  187:invokevirtual   #530 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		flag = false;
	//   86  190:iconst_0        
	//   87  191:istore          4
		  goto _L8
	//*  88  193:goto            63
_L3:
		closeDrawers(true);
	//   89  196:aload_0         
	//   90  197:iconst_1        
	//   91  198:invokevirtual   #527 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//   92  201:aload_0         
	//   93  202:iconst_0        
	//   94  203:putfield        #738 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//   95  206:aload_0         
	//   96  207:iconst_0        
	//   97  208:putfield        #425 <Field boolean mChildrenCanceledTouch>
		  goto _L1
	//*  98  211:goto            60
_L6:
		flag = false;
	//   99  214:iconst_0        
	//  100  215:istore          4
		  goto _L10
	//* 101  217:goto            152
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4 && hasVisibleDrawer())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          18
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #745 <Method boolean hasVisibleDrawer()>
	//*   5    9:ifeq            18
		{
			keyevent.startTracking();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #750 <Method void KeyEvent.startTracking()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #752 <Method boolean ViewGroup.onKeyDown(int, KeyEvent)>
	//   14   24:ireturn         
		}
	}

	public boolean onKeyUp(int i, KeyEvent keyevent)
	{
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          34
		{
			keyevent = ((KeyEvent) (findVisibleDrawer()));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #339 <Method View findVisibleDrawer()>
	//    5    9:astore_2        
			if(keyevent != null && getDrawerLockMode(((View) (keyevent))) == 0)
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
	//*   8   14:aload_0         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #755 <Method int getDrawerLockMode(View)>
	//*  11   19:ifne            26
				closeDrawers();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #757 <Method void closeDrawers()>
			return keyevent != null;
	//   14   26:aload_2         
	//   15   27:ifnull          32
	//   16   30:iconst_1        
	//   17   31:ireturn         
	//   18   32:iconst_0        
	//   19   33:ireturn         
		} else
		{
			return super.onKeyUp(i, keyevent);
	//   20   34:aload_0         
	//   21   35:iload_1         
	//   22   36:aload_2         
	//   23   37:invokespecial   #759 <Method boolean ViewGroup.onKeyUp(int, KeyEvent)>
	//   24   40:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		int k1;
		int l1;
		mInLayout = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #763 <Field boolean mInLayout>
		k1 = k - i;
	//    3    5:iload           4
	//    4    7:iload_2         
	//    5    8:isub            
	//    6    9:istore          10
		l1 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #323 <Method int getChildCount()>
	//    9   15:istore          11
		k = 0;
	//   10   17:iconst_0        
	//   11   18:istore          4
_L2:
		View view;
		if(k >= l1)
			break MISSING_BLOCK_LABEL_450;
	//   12   20:iload           4
	//   13   22:iload           11
	//   14   24:icmpge          450
		view = getChildAt(k);
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:invokevirtual   #327 <Method View getChildAt(int)>
	//   18   33:astore          15
		if(view.getVisibility() != 8)
			break; /* Loop/switch isn't completed */
	//   19   35:aload           15
	//   20   37:invokevirtual   #410 <Method int View.getVisibility()>
	//   21   40:bipush          8
	//   22   42:icmpne          54
_L3:
		k++;
	//   23   45:iload           4
	//   24   47:iconst_1        
	//   25   48:iadd            
	//   26   49:istore          4
		if(true) goto _L2; else goto _L1
	//   27   51:goto            20
_L1:
		LayoutParams layoutparams;
label0:
		{
			layoutparams = (LayoutParams)view.getLayoutParams();
	//   28   54:aload           15
	//   29   56:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   30   59:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   31   62:astore          16
			if(!isContentView(view))
				break label0;
	//   32   64:aload_0         
	//   33   65:aload           15
	//   34   67:invokevirtual   #580 <Method boolean isContentView(View)>
	//   35   70:ifeq            113
			view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
	//   36   73:aload           15
	//   37   75:aload           16
	//   38   77:getfield        #766 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   39   80:aload           16
	//   40   82:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//   41   85:aload           16
	//   42   87:getfield        #766 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   43   90:aload           15
	//   44   92:invokevirtual   #772 <Method int View.getMeasuredWidth()>
	//   45   95:iadd            
	//   46   96:aload           16
	//   47   98:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//   48  101:aload           15
	//   49  103:invokevirtual   #775 <Method int View.getMeasuredHeight()>
	//   50  106:iadd            
	//   51  107:invokevirtual   #778 <Method void View.layout(int, int, int, int)>
		}
		  goto _L3
	//*  52  110:goto            45
		int i1;
		int i2;
		int j2;
		i2 = view.getMeasuredWidth();
	//   53  113:aload           15
	//   54  115:invokevirtual   #772 <Method int View.getMeasuredWidth()>
	//   55  118:istore          12
		j2 = view.getMeasuredHeight();
	//   56  120:aload           15
	//   57  122:invokevirtual   #775 <Method int View.getMeasuredHeight()>
	//   58  125:istore          13
		float f;
		boolean flag1;
		if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  59  127:aload_0         
	//*  60  128:aload           15
	//*  61  130:iconst_3        
	//*  62  131:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  63  134:ifeq            284
		{
			i = -i2;
	//   64  137:iload           12
	//   65  139:ineg            
	//   66  140:istore_2        
			i1 = (int)((float)i2 * layoutparams.onScreen) + i;
	//   67  141:iload           12
	//   68  143:i2f             
	//   69  144:aload           16
	//   70  146:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//   71  149:fmul            
	//   72  150:f2i             
	//   73  151:iload_2         
	//   74  152:iadd            
	//   75  153:istore          7
			f = (float)(i2 + i1) / (float)i2;
	//   76  155:iload           12
	//   77  157:iload           7
	//   78  159:iadd            
	//   79  160:i2f             
	//   80  161:iload           12
	//   81  163:i2f             
	//   82  164:fdiv            
	//   83  165:fstore          6
		} else
	//*  84  167:fload           6
	//*  85  169:aload           16
	//*  86  171:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  87  174:fcmpl           
	//*  88  175:ifeq            314
	//*  89  178:iconst_1        
	//*  90  179:istore          8
	//*  91  181:aload           16
	//*  92  183:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//*  93  186:bipush          112
	//*  94  188:iand            
	//*  95  189:lookupswitch    2: default 216
	//	               16: 360
	//	               80: 320
	//*  96  216:aload           15
	//*  97  218:iload           7
	//*  98  220:aload           16
	//*  99  222:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 100  225:iload           12
	//* 101  227:iload           7
	//* 102  229:iadd            
	//* 103  230:iload           13
	//* 104  232:aload           16
	//* 105  234:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 106  237:iadd            
	//* 107  238:invokevirtual   #778 <Method void View.layout(int, int, int, int)>
	//* 108  241:iload           8
	//* 109  243:ifeq            254
	//* 110  246:aload_0         
	//* 111  247:aload           15
	//* 112  249:fload           6
	//* 113  251:invokevirtual   #695 <Method void setDrawerViewOffset(View, float)>
	//* 114  254:aload           16
	//* 115  256:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//* 116  259:fconst_0        
	//* 117  260:fcmpl           
	//* 118  261:ifle            445
	//* 119  264:iconst_0        
	//* 120  265:istore_2        
	//* 121  266:aload           15
	//* 122  268:invokevirtual   #410 <Method int View.getVisibility()>
	//* 123  271:iload_2         
	//* 124  272:icmpeq          45
	//* 125  275:aload           15
	//* 126  277:iload_2         
	//* 127  278:invokevirtual   #524 <Method void View.setVisibility(int)>
	//* 128  281:goto            45
		{
			i1 = k1 - (int)((float)i2 * layoutparams.onScreen);
	//  129  284:iload           10
	//  130  286:iload           12
	//  131  288:i2f             
	//  132  289:aload           16
	//  133  291:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//  134  294:fmul            
	//  135  295:f2i             
	//  136  296:isub            
	//  137  297:istore          7
			f = (float)(k1 - i1) / (float)i2;
	//  138  299:iload           10
	//  139  301:iload           7
	//  140  303:isub            
	//  141  304:i2f             
	//  142  305:iload           12
	//  143  307:i2f             
	//  144  308:fdiv            
	//  145  309:fstore          6
		}
		if(f != layoutparams.onScreen)
			flag1 = true;
		else
	//* 146  311:goto            167
			flag1 = false;
	//  147  314:iconst_0        
	//  148  315:istore          8
		layoutparams.gravity & 0x70;
		JVM INSTR lookupswitch 2: default 216
	//	               16: 360
	//	               80: 320;
		   goto _L4 _L5 _L6
_L5:
		break MISSING_BLOCK_LABEL_360;
_L4:
		view.layout(i1, layoutparams.topMargin, i2 + i1, j2 + layoutparams.topMargin);
_L7:
		if(flag1)
			setDrawerViewOffset(view, f);
		int j1;
		int k2;
		if(layoutparams.onScreen > 0.0F)
			i = 0;
		else
	//* 149  317:goto            181
	//* 150  320:iload           5
	//* 151  322:iload_3         
	//* 152  323:isub            
	//* 153  324:istore_2        
	//* 154  325:aload           15
	//* 155  327:iload           7
	//* 156  329:iload_2         
	//* 157  330:aload           16
	//* 158  332:getfield        #781 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 159  335:isub            
	//* 160  336:aload           15
	//* 161  338:invokevirtual   #775 <Method int View.getMeasuredHeight()>
	//* 162  341:isub            
	//* 163  342:iload           12
	//* 164  344:iload           7
	//* 165  346:iadd            
	//* 166  347:iload_2         
	//* 167  348:aload           16
	//* 168  350:getfield        #781 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 169  353:isub            
	//* 170  354:invokevirtual   #778 <Method void View.layout(int, int, int, int)>
	//* 171  357:goto            241
	//* 172  360:iload           5
	//* 173  362:iload_3         
	//* 174  363:isub            
	//* 175  364:istore          14
	//* 176  366:iload           14
	//* 177  368:iload           13
	//* 178  370:isub            
	//* 179  371:iconst_2        
	//* 180  372:idiv            
	//* 181  373:istore          9
	//* 182  375:iload           9
	//* 183  377:aload           16
	//* 184  379:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 185  382:icmpge          411
	//* 186  385:aload           16
	//* 187  387:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 188  390:istore_2        
	//* 189  391:aload           15
	//* 190  393:iload           7
	//* 191  395:iload_2         
	//* 192  396:iload           12
	//* 193  398:iload           7
	//* 194  400:iadd            
	//* 195  401:iload           13
	//* 196  403:iload_2         
	//* 197  404:iadd            
	//* 198  405:invokevirtual   #778 <Method void View.layout(int, int, int, int)>
	//* 199  408:goto            241
	//* 200  411:iload           9
	//* 201  413:istore_2        
	//* 202  414:iload           9
	//* 203  416:iload           13
	//* 204  418:iadd            
	//* 205  419:iload           14
	//* 206  421:aload           16
	//* 207  423:getfield        #781 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 208  426:isub            
	//* 209  427:icmple          391
	//* 210  430:iload           14
	//* 211  432:aload           16
	//* 212  434:getfield        #781 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 213  437:isub            
	//* 214  438:iload           13
	//* 215  440:isub            
	//* 216  441:istore_2        
	//* 217  442:goto            391
			i = 4;
	//  218  445:iconst_4        
	//  219  446:istore_2        
		if(view.getVisibility() != i)
			view.setVisibility(i);
		  goto _L3
_L6:
		i = l - j;
		view.layout(i1, i - layoutparams.bottomMargin - view.getMeasuredHeight(), i2 + i1, i - layoutparams.bottomMargin);
		  goto _L7
		k2 = l - j;
		j1 = (k2 - j2) / 2;
		if(j1 < layoutparams.topMargin)
		{
			i = layoutparams.topMargin;
		} else
		{
			i = j1;
			if(j1 + j2 > k2 - layoutparams.bottomMargin)
				i = k2 - layoutparams.bottomMargin - j2;
		}
		view.layout(i1, i, i2 + i1, j2 + i);
		  goto _L7
	//* 220  447:goto            266
		mInLayout = false;
	//  221  450:aload_0         
	//  222  451:iconst_0        
	//  223  452:putfield        #763 <Field boolean mInLayout>
		mFirstLayout = false;
	//  224  455:aload_0         
	//  225  456:iconst_0        
	//  226  457:putfield        #165 <Field boolean mFirstLayout>
		return;
	//  227  460:return          
		  goto _L3
	}

	protected void onMeasure(int i, int j)
	{
		int k;
		int l;
		int i1;
		int j1;
		int k1;
		int l1;
		int j2;
label0:
		{
			k1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #787 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          7
			j1 = android.view.View.MeasureSpec.getMode(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #787 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          6
			k = android.view.View.MeasureSpec.getSize(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #790 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore_3        
			i1 = android.view.View.MeasureSpec.getSize(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #790 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   21:istore          5
			if(k1 == 0x40000000)
	//*  12   23:iload           7
	//*  13   25:ldc2            #791 <Int 0x40000000>
	//*  14   28:icmpne          42
			{
				l = k;
	//   15   31:iload_3         
	//   16   32:istore          4
				if(j1 == 0x40000000)
					break MISSING_BLOCK_LABEL_793;
	//   17   34:iload           6
	//   18   36:ldc2            #791 <Int 0x40000000>
	//   19   39:icmpeq          793
			}
			if(isInEditMode())
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #794 <Method boolean isInEditMode()>
	//*  22   46:ifeq            184
			{
				int k2;
				if(k1 != 0x80000000 && k1 == 0)
	//*  23   49:iload           7
	//*  24   51:ldc2            #795 <Int 0x80000000>
	//*  25   54:icmpne          150
	//*  26   57:iload           6
	//*  27   59:ldc2            #795 <Int 0x80000000>
	//*  28   62:icmpne          162
	//*  29   65:iload_3         
	//*  30   66:istore          4
	//*  31   68:iload           5
	//*  32   70:istore_3        
	//*  33   71:aload_0         
	//*  34   72:iload           4
	//*  35   74:iload_3         
	//*  36   75:invokevirtual   #798 <Method void setMeasuredDimension(int, int)>
	//*  37   78:aload_0         
	//*  38   79:getfield        #708 <Field Object mLastInsets>
	//*  39   82:ifnull          195
	//*  40   85:aload_0         
	//*  41   86:invokestatic    #261 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  42   89:ifeq            195
	//*  43   92:iconst_1        
	//*  44   93:istore          7
	//*  45   95:aload_0         
	//*  46   96:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//*  47   99:istore          10
	//*  48  101:iconst_0        
	//*  49  102:istore          5
	//*  50  104:iconst_0        
	//*  51  105:istore          6
	//*  52  107:aload_0         
	//*  53  108:invokevirtual   #323 <Method int getChildCount()>
	//*  54  111:istore          11
	//*  55  113:iconst_0        
	//*  56  114:istore          8
	//*  57  116:iload           8
	//*  58  118:iload           11
	//*  59  120:icmpge          792
	//*  60  123:aload_0         
	//*  61  124:iload           8
	//*  62  126:invokevirtual   #327 <Method View getChildAt(int)>
	//*  63  129:astore          15
	//*  64  131:aload           15
	//*  65  133:invokevirtual   #410 <Method int View.getVisibility()>
	//*  66  136:bipush          8
	//*  67  138:icmpne          201
	//*  68  141:iload           8
	//*  69  143:iconst_1        
	//*  70  144:iadd            
	//*  71  145:istore          8
	//*  72  147:goto            116
	//*  73  150:iload           7
	//*  74  152:ifne            57
					k = 300;
	//   75  155:sipush          300
	//   76  158:istore_3        
				if(j1 == 0x80000000)
				{
					l = k;
					k = i1;
				} else
	//*  77  159:goto            57
				{
					l = k;
	//   78  162:iload_3         
	//   79  163:istore          4
					if(j1 != 0)
						break MISSING_BLOCK_LABEL_793;
	//   80  165:iload           6
	//   81  167:ifne            793
					i1 = 300;
	//   82  170:sipush          300
	//   83  173:istore          5
					l = k;
	//   84  175:iload_3         
	//   85  176:istore          4
					k = i1;
	//   86  178:iload           5
	//   87  180:istore_3        
				}
				break label0;
	//   88  181:goto            71
			} else
			{
				throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
	//   89  184:new             #460 <Class IllegalArgumentException>
	//   90  187:dup             
	//   91  188:ldc2            #800 <String "DrawerLayout must be measured with MeasureSpec.EXACTLY.">
	//   92  191:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   93  194:athrow          
			}
		}
_L2:
		setMeasuredDimension(l, k);
		if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))))
			k1 = 1;
		else
			k1 = 0;
	//   94  195:iconst_0        
	//   95  196:istore          7
		j2 = ViewCompat.getLayoutDirection(((View) (this)));
		i1 = 0;
		j1 = 0;
		k2 = getChildCount();
		l1 = 0;
		while(l1 < k2) 
		{
			View view = getChildAt(l1);
			if(view.getVisibility() != 8)
	//*  96  198:goto            95
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   97  201:aload           15
	//   98  203:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   99  206:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//  100  209:astore          16
				if(k1 != 0)
	//* 101  211:iload           7
	//* 102  213:ifeq            290
				{
					int i2 = GravityCompat.getAbsoluteGravity(layoutparams.gravity, j2);
	//  103  216:aload           16
	//  104  218:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//  105  221:iload           10
	//  106  223:invokestatic    #642 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  107  226:istore          9
					if(ViewCompat.getFitsSystemWindows(view))
	//* 108  228:aload           15
	//* 109  230:invokestatic    #261 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 110  233:ifeq            382
					{
						if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 111  236:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//* 112  239:bipush          21
	//* 113  241:icmplt          290
						{
							WindowInsets windowinsets2 = (WindowInsets)mLastInsets;
	//  114  244:aload_0         
	//  115  245:getfield        #708 <Field Object mLastInsets>
	//  116  248:checkcast       #710 <Class WindowInsets>
	//  117  251:astore          14
							WindowInsets windowinsets;
							if(i2 == 3)
	//* 118  253:iload           9
	//* 119  255:iconst_3        
	//* 120  256:icmpne          346
							{
								windowinsets = windowinsets2.replaceSystemWindowInsets(windowinsets2.getSystemWindowInsetLeft(), windowinsets2.getSystemWindowInsetTop(), 0, windowinsets2.getSystemWindowInsetBottom());
	//  121  259:aload           14
	//  122  261:aload           14
	//  123  263:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  124  266:aload           14
	//  125  268:invokevirtual   #713 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  126  271:iconst_0        
	//  127  272:aload           14
	//  128  274:invokevirtual   #806 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  129  277:invokevirtual   #810 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  130  280:astore          13
							} else
	//* 131  282:aload           15
	//* 132  284:aload           13
	//* 133  286:invokevirtual   #814 <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//* 134  289:pop             
	//* 135  290:aload_0         
	//* 136  291:aload           15
	//* 137  293:invokevirtual   #580 <Method boolean isContentView(View)>
	//* 138  296:ifeq            507
	//* 139  299:aload           15
	//* 140  301:iload           4
	//* 141  303:aload           16
	//* 142  305:getfield        #766 <Field int DrawerLayout$LayoutParams.leftMargin>
	//* 143  308:isub            
	//* 144  309:aload           16
	//* 145  311:getfield        #817 <Field int DrawerLayout$LayoutParams.rightMargin>
	//* 146  314:isub            
	//* 147  315:ldc2            #791 <Int 0x40000000>
	//* 148  318:invokestatic    #820 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 149  321:iload_3         
	//* 150  322:aload           16
	//* 151  324:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 152  327:isub            
	//* 153  328:aload           16
	//* 154  330:getfield        #781 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 155  333:isub            
	//* 156  334:ldc2            #791 <Int 0x40000000>
	//* 157  337:invokestatic    #820 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 158  340:invokevirtual   #823 <Method void View.measure(int, int)>
	//* 159  343:goto            141
							{
								windowinsets = windowinsets2;
	//  160  346:aload           14
	//  161  348:astore          13
								if(i2 == 5)
	//* 162  350:iload           9
	//* 163  352:iconst_5        
	//* 164  353:icmpne          282
									windowinsets = windowinsets2.replaceSystemWindowInsets(0, windowinsets2.getSystemWindowInsetTop(), windowinsets2.getSystemWindowInsetRight(), windowinsets2.getSystemWindowInsetBottom());
	//  165  356:aload           14
	//  166  358:iconst_0        
	//  167  359:aload           14
	//  168  361:invokevirtual   #713 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  169  364:aload           14
	//  170  366:invokevirtual   #826 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  171  369:aload           14
	//  172  371:invokevirtual   #806 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  173  374:invokevirtual   #810 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  174  377:astore          13
							}
							view.dispatchApplyWindowInsets(windowinsets);
						}
					} else
	//* 175  379:goto            282
					if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 176  382:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//* 177  385:bipush          21
	//* 178  387:icmplt          290
					{
						WindowInsets windowinsets3 = (WindowInsets)mLastInsets;
	//  179  390:aload_0         
	//  180  391:getfield        #708 <Field Object mLastInsets>
	//  181  394:checkcast       #710 <Class WindowInsets>
	//  182  397:astore          14
						WindowInsets windowinsets1;
						if(i2 == 3)
	//* 183  399:iload           9
	//* 184  401:iconst_3        
	//* 185  402:icmpne          471
						{
							windowinsets1 = windowinsets3.replaceSystemWindowInsets(windowinsets3.getSystemWindowInsetLeft(), windowinsets3.getSystemWindowInsetTop(), 0, windowinsets3.getSystemWindowInsetBottom());
	//  186  405:aload           14
	//  187  407:aload           14
	//  188  409:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  189  412:aload           14
	//  190  414:invokevirtual   #713 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  191  417:iconst_0        
	//  192  418:aload           14
	//  193  420:invokevirtual   #806 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  194  423:invokevirtual   #810 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  195  426:astore          13
						} else
	//* 196  428:aload           16
	//* 197  430:aload           13
	//* 198  432:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//* 199  435:putfield        #766 <Field int DrawerLayout$LayoutParams.leftMargin>
	//* 200  438:aload           16
	//* 201  440:aload           13
	//* 202  442:invokevirtual   #713 <Method int WindowInsets.getSystemWindowInsetTop()>
	//* 203  445:putfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 204  448:aload           16
	//* 205  450:aload           13
	//* 206  452:invokevirtual   #826 <Method int WindowInsets.getSystemWindowInsetRight()>
	//* 207  455:putfield        #817 <Field int DrawerLayout$LayoutParams.rightMargin>
	//* 208  458:aload           16
	//* 209  460:aload           13
	//* 210  462:invokevirtual   #806 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//* 211  465:putfield        #781 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 212  468:goto            290
						{
							windowinsets1 = windowinsets3;
	//  213  471:aload           14
	//  214  473:astore          13
							if(i2 == 5)
	//* 215  475:iload           9
	//* 216  477:iconst_5        
	//* 217  478:icmpne          428
								windowinsets1 = windowinsets3.replaceSystemWindowInsets(0, windowinsets3.getSystemWindowInsetTop(), windowinsets3.getSystemWindowInsetRight(), windowinsets3.getSystemWindowInsetBottom());
	//  218  481:aload           14
	//  219  483:iconst_0        
	//  220  484:aload           14
	//  221  486:invokevirtual   #713 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  222  489:aload           14
	//  223  491:invokevirtual   #826 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  224  494:aload           14
	//  225  496:invokevirtual   #806 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  226  499:invokevirtual   #810 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  227  502:astore          13
						}
						layoutparams.leftMargin = windowinsets1.getSystemWindowInsetLeft();
						layoutparams.topMargin = windowinsets1.getSystemWindowInsetTop();
						layoutparams.rightMargin = windowinsets1.getSystemWindowInsetRight();
						layoutparams.bottomMargin = windowinsets1.getSystemWindowInsetBottom();
					}
				}
				if(isContentView(view))
					view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
				else
	//* 228  504:goto            428
				if(isDrawerView(view))
	//* 229  507:aload_0         
	//* 230  508:aload           15
	//* 231  510:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//* 232  513:ifeq            740
				{
					if(SET_DRAWER_SHADOW_FROM_ELEVATION && ViewCompat.getElevation(view) != mDrawerElevation)
	//* 233  516:getstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//* 234  519:ifeq            544
	//* 235  522:aload           15
	//* 236  524:invokestatic    #829 <Method float ViewCompat.getElevation(View)>
	//* 237  527:aload_0         
	//* 238  528:getfield        #289 <Field float mDrawerElevation>
	//* 239  531:fcmpl           
	//* 240  532:ifeq            544
						ViewCompat.setElevation(view, mDrawerElevation);
	//  241  535:aload           15
	//  242  537:aload_0         
	//  243  538:getfield        #289 <Field float mDrawerElevation>
	//  244  541:invokestatic    #832 <Method void ViewCompat.setElevation(View, float)>
					int l2 = getDrawerViewAbsoluteGravity(view) & 7;
	//  245  544:aload_0         
	//  246  545:aload           15
	//  247  547:invokevirtual   #447 <Method int getDrawerViewAbsoluteGravity(View)>
	//  248  550:bipush          7
	//  249  552:iand            
	//  250  553:istore          12
					boolean flag;
					if(l2 == 3)
	//* 251  555:iload           12
	//* 252  557:iconst_3        
	//* 253  558:icmpne          639
						flag = true;
	//  254  561:iconst_1        
	//  255  562:istore          9
					else
	//* 256  564:iload           9
	//* 257  566:ifeq            574
	//* 258  569:iload           5
	//* 259  571:ifne            584
	//* 260  574:iload           9
	//* 261  576:ifne            645
	//* 262  579:iload           6
	//* 263  581:ifeq            645
	//* 264  584:new             #834 <Class IllegalStateException>
	//* 265  587:dup             
	//* 266  588:new             #462 <Class StringBuilder>
	//* 267  591:dup             
	//* 268  592:invokespecial   #463 <Method void StringBuilder()>
	//* 269  595:ldc2            #836 <String "Child drawer has absolute gravity ">
	//* 270  598:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//* 271  601:iload           12
	//* 272  603:invokestatic    #471 <Method String gravityToString(int)>
	//* 273  606:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//* 274  609:ldc2            #838 <String " but this ">
	//* 275  612:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//* 276  615:ldc1            #73  <String "DrawerLayout">
	//* 277  617:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//* 278  620:ldc2            #840 <String " already has a ">
	//* 279  623:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//* 280  626:ldc2            #842 <String "drawer view along that edge">
	//* 281  629:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//* 282  632:invokevirtual   #475 <Method String StringBuilder.toString()>
	//* 283  635:invokespecial   #843 <Method void IllegalStateException(String)>
	//* 284  638:athrow          
						flag = false;
	//  285  639:iconst_0        
	//  286  640:istore          9
					if(flag && i1 != 0 || !flag && j1 != 0)
						throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(gravityToString(l2)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
	//* 287  642:goto            564
					if(flag)
	//* 288  645:iload           9
	//* 289  647:ifeq            726
					{
						flag = true;
	//  290  650:iconst_1        
	//  291  651:istore          9
						i1 = j1;
	//  292  653:iload           6
	//  293  655:istore          5
						j1 = ((int) (flag));
	//  294  657:iload           9
	//  295  659:istore          6
					} else
	//* 296  661:aload           15
	//* 297  663:iload_1         
	//* 298  664:aload_0         
	//* 299  665:getfield        #205 <Field int mMinDrawerMargin>
	//* 300  668:aload           16
	//* 301  670:getfield        #766 <Field int DrawerLayout$LayoutParams.leftMargin>
	//* 302  673:iadd            
	//* 303  674:aload           16
	//* 304  676:getfield        #817 <Field int DrawerLayout$LayoutParams.rightMargin>
	//* 305  679:iadd            
	//* 306  680:aload           16
	//* 307  682:getfield        #846 <Field int DrawerLayout$LayoutParams.width>
	//* 308  685:invokestatic    #850 <Method int getChildMeasureSpec(int, int, int)>
	//* 309  688:iload_2         
	//* 310  689:aload           16
	//* 311  691:getfield        #769 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 312  694:aload           16
	//* 313  696:getfield        #781 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 314  699:iadd            
	//* 315  700:aload           16
	//* 316  702:getfield        #853 <Field int DrawerLayout$LayoutParams.height>
	//* 317  705:invokestatic    #850 <Method int getChildMeasureSpec(int, int, int)>
	//* 318  708:invokevirtual   #823 <Method void View.measure(int, int)>
	//* 319  711:iload           6
	//* 320  713:istore          9
	//* 321  715:iload           5
	//* 322  717:istore          6
	//* 323  719:iload           9
	//* 324  721:istore          5
	//* 325  723:goto            141
					{
						boolean flag1 = true;
	//  326  726:iconst_1        
	//  327  727:istore          9
						j1 = i1;
	//  328  729:iload           5
	//  329  731:istore          6
						i1 = ((int) (flag1));
	//  330  733:iload           9
	//  331  735:istore          5
					}
					view.measure(getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
					flag = ((boolean) (j1));
					j1 = i1;
					i1 = ((int) (flag));
				} else
	//* 332  737:goto            661
				{
					throw new IllegalStateException((new StringBuilder()).append("Child ").append(((Object) (view))).append(" at index ").append(l1).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
	//  333  740:new             #834 <Class IllegalStateException>
	//  334  743:dup             
	//  335  744:new             #462 <Class StringBuilder>
	//  336  747:dup             
	//  337  748:invokespecial   #463 <Method void StringBuilder()>
	//  338  751:ldc2            #855 <String "Child ">
	//  339  754:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//  340  757:aload           15
	//  341  759:invokevirtual   #486 <Method StringBuilder StringBuilder.append(Object)>
	//  342  762:ldc2            #857 <String " at index ">
	//  343  765:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//  344  768:iload           8
	//  345  770:invokevirtual   #860 <Method StringBuilder StringBuilder.append(int)>
	//  346  773:ldc2            #862 <String " does not have a valid layout_gravity - must be Gravity.LEFT, ">
	//  347  776:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//  348  779:ldc2            #864 <String "Gravity.RIGHT or Gravity.NO_GRAVITY">
	//  349  782:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//  350  785:invokevirtual   #475 <Method String StringBuilder.toString()>
	//  351  788:invokespecial   #843 <Method void IllegalStateException(String)>
	//  352  791:athrow          
				}
			}
			l1++;
		}
		return;
	//  353  792:return          
		k = i1;
	//  354  793:iload           5
	//  355  795:istore_3        
		if(true) goto _L2; else goto _L1
	//  356  796:goto            71
_L1:
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #26  <Class DrawerLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #868 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		} else
	//*   6   12:return          
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #26  <Class DrawerLayout$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #872 <Method Parcelable DrawerLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #868 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			if(((SavedState) (parcelable)).openDrawerGravity != 0)
	//*  14   26:aload_1         
	//*  15   27:getfield        #875 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//*  16   30:ifeq            51
			{
				View view = findDrawerWithGravity(((SavedState) (parcelable)).openDrawerGravity);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #875 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//   20   38:invokevirtual   #458 <Method View findDrawerWithGravity(int)>
	//   21   41:astore_2        
				if(view != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          51
					openDrawer(view);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #878 <Method void openDrawer(View)>
			}
			if(((SavedState) (parcelable)).lockModeLeft != 3)
	//*  27   51:aload_1         
	//*  28   52:getfield        #881 <Field int DrawerLayout$SavedState.lockModeLeft>
	//*  29   55:iconst_3        
	//*  30   56:icmpeq          68
				setDrawerLockMode(((SavedState) (parcelable)).lockModeLeft, 3);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #881 <Field int DrawerLayout$SavedState.lockModeLeft>
	//   34   64:iconst_3        
	//   35   65:invokevirtual   #884 <Method void setDrawerLockMode(int, int)>
			if(((SavedState) (parcelable)).lockModeRight != 3)
	//*  36   68:aload_1         
	//*  37   69:getfield        #887 <Field int DrawerLayout$SavedState.lockModeRight>
	//*  38   72:iconst_3        
	//*  39   73:icmpeq          85
				setDrawerLockMode(((SavedState) (parcelable)).lockModeRight, 5);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getfield        #887 <Field int DrawerLayout$SavedState.lockModeRight>
	//   43   81:iconst_5        
	//   44   82:invokevirtual   #884 <Method void setDrawerLockMode(int, int)>
			if(((SavedState) (parcelable)).lockModeStart != 3)
	//*  45   85:aload_1         
	//*  46   86:getfield        #890 <Field int DrawerLayout$SavedState.lockModeStart>
	//*  47   89:iconst_3        
	//*  48   90:icmpeq          104
				setDrawerLockMode(((SavedState) (parcelable)).lockModeStart, 0x800003);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #890 <Field int DrawerLayout$SavedState.lockModeStart>
	//   52   98:ldc2            #891 <Int 0x800003>
	//   53  101:invokevirtual   #884 <Method void setDrawerLockMode(int, int)>
			if(((SavedState) (parcelable)).lockModeEnd != 3)
	//*  54  104:aload_1         
	//*  55  105:getfield        #894 <Field int DrawerLayout$SavedState.lockModeEnd>
	//*  56  108:iconst_3        
	//*  57  109:icmpeq          12
			{
				setDrawerLockMode(((SavedState) (parcelable)).lockModeEnd, 0x800005);
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:getfield        #894 <Field int DrawerLayout$SavedState.lockModeEnd>
	//   61  117:ldc2            #895 <Int 0x800005>
	//   62  120:invokevirtual   #884 <Method void setDrawerLockMode(int, int)>
				return;
	//   63  123:return          
			}
		}
	}

	public void onRtlPropertiesChanged(int i)
	{
		resolveShadowDrawables();
	//    0    0:aload_0         
	//    1    1:invokespecial   #898 <Method void resolveShadowDrawables()>
	//    2    4:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #26  <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #901 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #903 <Method void DrawerLayout$SavedState(Parcelable)>
	//    5   11:astore          5
		int j = getChildCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #323 <Method int getChildCount()>
	//    8   17:istore          4
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		do
		{
label0:
			{
				if(i < j)
	//*  11   21:iload_1         
	//*  12   22:iload           4
	//*  13   24:icmpge          80
				{
					LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #327 <Method View getChildAt(int)>
	//   17   32:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   35:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   19   38:astore          6
					boolean flag;
					boolean flag1;
					if(layoutparams.openState == 1)
	//*  20   40:aload           6
	//*  21   42:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//*  22   45:iconst_1        
	//*  23   46:icmpne          119
						flag = true;
	//   24   49:iconst_1        
	//   25   50:istore_2        
					else
	//*  26   51:aload           6
	//*  27   53:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//*  28   56:iconst_2        
	//*  29   57:icmpne          124
	//*  30   60:iconst_1        
	//*  31   61:istore_3        
	//*  32   62:iload_2         
	//*  33   63:ifne            70
	//*  34   66:iload_3         
	//*  35   67:ifeq            129
	//*  36   70:aload           5
	//*  37   72:aload           6
	//*  38   74:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//*  39   77:putfield        #875 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//*  40   80:aload           5
	//*  41   82:aload_0         
	//*  42   83:getfield        #167 <Field int mLockModeLeft>
	//*  43   86:putfield        #881 <Field int DrawerLayout$SavedState.lockModeLeft>
	//*  44   89:aload           5
	//*  45   91:aload_0         
	//*  46   92:getfield        #169 <Field int mLockModeRight>
	//*  47   95:putfield        #887 <Field int DrawerLayout$SavedState.lockModeRight>
	//*  48   98:aload           5
	//*  49  100:aload_0         
	//*  50  101:getfield        #171 <Field int mLockModeStart>
	//*  51  104:putfield        #890 <Field int DrawerLayout$SavedState.lockModeStart>
	//*  52  107:aload           5
	//*  53  109:aload_0         
	//*  54  110:getfield        #173 <Field int mLockModeEnd>
	//*  55  113:putfield        #894 <Field int DrawerLayout$SavedState.lockModeEnd>
	//*  56  116:aload           5
	//*  57  118:areturn         
						flag = false;
	//   58  119:iconst_0        
	//   59  120:istore_2        
					if(layoutparams.openState == 2)
						flag1 = true;
					else
	//*  60  121:goto            51
						flag1 = false;
	//   61  124:iconst_0        
	//   62  125:istore_3        
					if(!flag && !flag1)
						break label0;
					savedstate.openDrawerGravity = layoutparams.gravity;
				}
				savedstate.lockModeLeft = mLockModeLeft;
				savedstate.lockModeRight = mLockModeRight;
				savedstate.lockModeStart = mLockModeStart;
				savedstate.lockModeEnd = mLockModeEnd;
				return ((Parcelable) (savedstate));
			}
	//*  63  126:goto            62
			i++;
	//   64  129:iload_1         
	//   65  130:iconst_1        
	//   66  131:iadd            
	//   67  132:istore_1        
		} while(true);
	//   68  133:goto            21
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		mLeftDragger.processTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #908 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		mRightDragger.processTouchEvent(motionevent);
	//    4    8:aload_0         
	//    5    9:getfield        #234 <Field ViewDragHelper mRightDragger>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #908 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		motionevent.getAction() & 0xff;
	//    8   16:aload_1         
	//    9   17:invokevirtual   #911 <Method int MotionEvent.getAction()>
	//   10   20:sipush          255
	//   11   23:iand            
		JVM INSTR tableswitch 0 3: default 56
	//	               0 58
	//	               1 90
	//	               2 56
	//	               3 204;
	//   12   24:tableswitch     0 3: default 56
	//	               0 58
	//	               1 90
	//	               2 56
	//	               3 204
		   goto _L1 _L2 _L3 _L1 _L4
_L1:
		return true;
	//   13   56:iconst_1        
	//   14   57:ireturn         
_L2:
		float f = motionevent.getX();
	//   15   58:aload_1         
	//   16   59:invokevirtual   #725 <Method float MotionEvent.getX()>
	//   17   62:fstore_2        
		float f2 = motionevent.getY();
	//   18   63:aload_1         
	//   19   64:invokevirtual   #728 <Method float MotionEvent.getY()>
	//   20   67:fstore_3        
		mInitialMotionX = f;
	//   21   68:aload_0         
	//   22   69:fload_2         
	//   23   70:putfield        #730 <Field float mInitialMotionX>
		mInitialMotionY = f2;
	//   24   73:aload_0         
	//   25   74:fload_3         
	//   26   75:putfield        #732 <Field float mInitialMotionY>
		mDisallowInterceptRequested = false;
	//   27   78:aload_0         
	//   28   79:iconst_0        
	//   29   80:putfield        #738 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//   30   83:aload_0         
	//   31   84:iconst_0        
	//   32   85:putfield        #425 <Field boolean mChildrenCanceledTouch>
		return true;
	//   33   88:iconst_1        
	//   34   89:ireturn         
_L3:
		float f1;
		float f3;
		f3 = motionevent.getX();
	//   35   90:aload_1         
	//   36   91:invokevirtual   #725 <Method float MotionEvent.getX()>
	//   37   94:fstore_3        
		f1 = motionevent.getY();
	//   38   95:aload_1         
	//   39   96:invokevirtual   #728 <Method float MotionEvent.getY()>
	//   40   99:fstore_2        
		motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f3, (int)f1)));
	//   41  100:aload_0         
	//   42  101:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   43  104:fload_3         
	//   44  105:f2i             
	//   45  106:fload_2         
	//   46  107:f2i             
	//   47  108:invokevirtual   #736 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   48  111:astore_1        
		if(motionevent == null || !isContentView(((View) (motionevent)))) goto _L6; else goto _L5
	//   49  112:aload_1         
	//   50  113:ifnull          221
	//   51  116:aload_0         
	//   52  117:aload_1         
	//   53  118:invokevirtual   #580 <Method boolean isContentView(View)>
	//   54  121:ifeq            221
_L5:
		int i;
		f3 -= mInitialMotionX;
	//   55  124:fload_3         
	//   56  125:aload_0         
	//   57  126:getfield        #730 <Field float mInitialMotionX>
	//   58  129:fsub            
	//   59  130:fstore_3        
		f1 -= mInitialMotionY;
	//   60  131:fload_2         
	//   61  132:aload_0         
	//   62  133:getfield        #732 <Field float mInitialMotionY>
	//   63  136:fsub            
	//   64  137:fstore_2        
		i = mLeftDragger.getTouchSlop();
	//   65  138:aload_0         
	//   66  139:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   67  142:invokevirtual   #914 <Method int ViewDragHelper.getTouchSlop()>
	//   68  145:istore          4
		if(f3 * f3 + f1 * f1 >= (float)(i * i)) goto _L6; else goto _L7
	//   69  147:fload_3         
	//   70  148:fload_3         
	//   71  149:fmul            
	//   72  150:fload_2         
	//   73  151:fload_2         
	//   74  152:fmul            
	//   75  153:fadd            
	//   76  154:iload           4
	//   77  156:iload           4
	//   78  158:imul            
	//   79  159:i2f             
	//   80  160:fcmpg           
	//   81  161:ifge            221
_L7:
		motionevent = ((MotionEvent) (findOpenDrawer()));
	//   82  164:aload_0         
	//   83  165:invokevirtual   #422 <Method View findOpenDrawer()>
	//   84  168:astore_1        
		if(motionevent == null) goto _L6; else goto _L8
	//   85  169:aload_1         
	//   86  170:ifnull          221
_L8:
		boolean flag;
		if(getDrawerLockMode(((View) (motionevent))) == 2)
	//*  87  173:aload_0         
	//*  88  174:aload_1         
	//*  89  175:invokevirtual   #755 <Method int getDrawerLockMode(View)>
	//*  90  178:iconst_2        
	//*  91  179:icmpne          198
			flag = true;
	//   92  182:iconst_1        
	//   93  183:istore          5
		else
	//*  94  185:aload_0         
	//*  95  186:iload           5
	//*  96  188:invokevirtual   #527 <Method void closeDrawers(boolean)>
	//*  97  191:aload_0         
	//*  98  192:iconst_0        
	//*  99  193:putfield        #738 <Field boolean mDisallowInterceptRequested>
	//* 100  196:iconst_1        
	//* 101  197:ireturn         
			flag = false;
	//  102  198:iconst_0        
	//  103  199:istore          5
_L10:
		closeDrawers(flag);
		mDisallowInterceptRequested = false;
		return true;
	//* 104  201:goto            185
_L4:
		closeDrawers(true);
	//  105  204:aload_0         
	//  106  205:iconst_1        
	//  107  206:invokevirtual   #527 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//  108  209:aload_0         
	//  109  210:iconst_0        
	//  110  211:putfield        #738 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//  111  214:aload_0         
	//  112  215:iconst_0        
	//  113  216:putfield        #425 <Field boolean mChildrenCanceledTouch>
		return true;
	//  114  219:iconst_1        
	//  115  220:ireturn         
_L6:
		flag = true;
	//  116  221:iconst_1        
	//  117  222:istore          5
		if(true) goto _L10; else goto _L9
	//  118  224:goto            185
_L9:
	}

	public void openDrawer(int i)
	{
		openDrawer(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #916 <Method void openDrawer(int, boolean)>
	//    4    6:return          
	}

	public void openDrawer(int i, boolean flag)
	{
		View view = findDrawerWithGravity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #458 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_3        
		if(view == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       41
		{
			throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(gravityToString(i)).toString());
	//    6   10:new             #460 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #462 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #463 <Method void StringBuilder()>
	//   11   21:ldc2            #465 <String "No drawer view found with gravity ">
	//   12   24:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_1         
	//   14   28:invokestatic    #471 <Method String gravityToString(int)>
	//   15   31:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   17   37:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		} else
		{
			openDrawer(view, flag);
	//   19   41:aload_0         
	//   20   42:aload_3         
	//   21   43:iload_2         
	//   22   44:invokevirtual   #918 <Method void openDrawer(View, boolean)>
			return;
	//   23   47:return          
		}
	}

	public void openDrawer(View view)
	{
		openDrawer(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #918 <Method void openDrawer(View, boolean)>
	//    4    6:return          
	}

	public void openDrawer(View view, boolean flag)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a sliding drawer").toString());
	//    4    8:new             #460 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #462 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #463 <Method void StringBuilder()>
	//    9   19:ldc2            #483 <String "View ">
	//   10   22:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #486 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #488 <String " is not a sliding drawer">
	//   14   32:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   42:aload_1         
	//   19   43:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   21   49:astore_3        
		if(mFirstLayout)
	//*  22   50:aload_0         
	//*  23   51:getfield        #165 <Field boolean mFirstLayout>
	//*  24   54:ifeq            78
		{
			layoutparams.onScreen = 1.0F;
	//   25   57:aload_3         
	//   26   58:fconst_1        
	//   27   59:putfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
			layoutparams.openState = 1;
	//   28   62:aload_3         
	//   29   63:iconst_1        
	//   30   64:putfield        #494 <Field int DrawerLayout$LayoutParams.openState>
			updateChildrenImportantForAccessibility(view, true);
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:iconst_1        
	//   34   70:invokespecial   #554 <Method void updateChildrenImportantForAccessibility(View, boolean)>
		} else
	//*  35   73:aload_0         
	//*  36   74:invokevirtual   #497 <Method void invalidate()>
	//*  37   77:return          
		if(flag)
	//*  38   78:iload_2         
	//*  39   79:ifeq            143
		{
			layoutparams.openState = layoutparams.openState | 2;
	//   40   82:aload_3         
	//   41   83:aload_3         
	//   42   84:getfield        #494 <Field int DrawerLayout$LayoutParams.openState>
	//   43   87:iconst_2        
	//   44   88:ior             
	//   45   89:putfield        #494 <Field int DrawerLayout$LayoutParams.openState>
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  46   92:aload_0         
	//*  47   93:aload_1         
	//*  48   94:iconst_3        
	//*  49   95:invokevirtual   #499 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  50   98:ifeq            118
				mLeftDragger.smoothSlideViewTo(view, 0, view.getTop());
	//   51  101:aload_0         
	//   52  102:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   53  105:aload_1         
	//   54  106:iconst_0        
	//   55  107:aload_1         
	//   56  108:invokevirtual   #505 <Method int View.getTop()>
	//   57  111:invokevirtual   #509 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   58  114:pop             
			else
	//*  59  115:goto            73
				mRightDragger.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
	//   60  118:aload_0         
	//   61  119:getfield        #234 <Field ViewDragHelper mRightDragger>
	//   62  122:aload_1         
	//   63  123:aload_0         
	//   64  124:invokevirtual   #510 <Method int getWidth()>
	//   65  127:aload_1         
	//   66  128:invokevirtual   #502 <Method int View.getWidth()>
	//   67  131:isub            
	//   68  132:aload_1         
	//   69  133:invokevirtual   #505 <Method int View.getTop()>
	//   70  136:invokevirtual   #509 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   71  139:pop             
		} else
	//*  72  140:goto            73
		{
			moveDrawerToOffset(view, 1.0F);
	//   73  143:aload_0         
	//   74  144:aload_1         
	//   75  145:fconst_1        
	//   76  146:invokevirtual   #514 <Method void moveDrawerToOffset(View, float)>
			updateDrawerState(layoutparams.gravity, 0, view);
	//   77  149:aload_0         
	//   78  150:aload_3         
	//   79  151:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//   80  154:iconst_0        
	//   81  155:aload_1         
	//   82  156:invokevirtual   #521 <Method void updateDrawerState(int, int, View)>
			view.setVisibility(0);
	//   83  159:aload_1         
	//   84  160:iconst_0        
	//   85  161:invokevirtual   #524 <Method void View.setVisibility(int)>
		}
		invalidate();
	//*  86  164:goto            73
	}

	public void removeDrawerListener(DrawerListener drawerlistener)
	{
		while(drawerlistener == null || mListeners == null) 
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
	//    3    5:aload_0         
	//    4    6:getfield        #381 <Field List mListeners>
	//    5    9:ifnull          4
		mListeners.remove(((Object) (drawerlistener)));
	//    6   12:aload_0         
	//    7   13:getfield        #381 <Field List mListeners>
	//    8   16:aload_1         
	//    9   17:invokeinterface #922 <Method boolean List.remove(Object)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #925 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		mDisallowInterceptRequested = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #738 <Field boolean mDisallowInterceptRequested>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            19
			closeDrawers(true);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #527 <Method void closeDrawers(boolean)>
	//   11   19:return          
	}

	public void requestLayout()
	{
		if(!mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #763 <Field boolean mInLayout>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #928 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setChildInsets(Object obj, boolean flag)
	{
		mLastInsets = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #708 <Field Object mLastInsets>
		mDrawStatusBarBackground = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #706 <Field boolean mDrawStatusBarBackground>
		if(!flag && getBackground() == null)
	//*   6   10:iload_2         
	//*   7   11:ifne            33
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #935 <Method Drawable getBackground()>
	//*  10   18:ifnonnull       33
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:aload_0         
	//*  14   24:iload_2         
	//*  15   25:invokevirtual   #938 <Method void setWillNotDraw(boolean)>
	//*  16   28:aload_0         
	//*  17   29:invokevirtual   #939 <Method void requestLayout()>
	//*  18   32:return          
			flag = false;
	//   19   33:iconst_0        
	//   20   34:istore_2        
		setWillNotDraw(flag);
		requestLayout();
	//*  21   35:goto            23
	}

	public void setDrawerElevation(float f)
	{
		mDrawerElevation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #289 <Field float mDrawerElevation>
		for(int i = 0; i < getChildCount(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #323 <Method int getChildCount()>
	//*   8   12:icmpge          44
		{
			View view = getChildAt(i);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #327 <Method View getChildAt(int)>
	//   12   20:astore_3        
			if(isDrawerView(view))
	//*  13   21:aload_0         
	//*  14   22:aload_3         
	//*  15   23:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*  16   26:ifeq            37
				ViewCompat.setElevation(view, mDrawerElevation);
	//   17   29:aload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #289 <Field float mDrawerElevation>
	//   20   34:invokestatic    #832 <Method void ViewCompat.setElevation(View, float)>
		}

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            7
	//   26   44:return          
	}

	public void setDrawerListener(DrawerListener drawerlistener)
	{
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #944 <Field DrawerLayout$DrawerListener mListener>
	//*   2    4:ifnull          15
			removeDrawerListener(mListener);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #944 <Field DrawerLayout$DrawerListener mListener>
	//    6   12:invokevirtual   #946 <Method void removeDrawerListener(DrawerLayout$DrawerListener)>
		if(drawerlistener != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			addDrawerListener(drawerlistener);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #948 <Method void addDrawerListener(DrawerLayout$DrawerListener)>
		mListener = drawerlistener;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #944 <Field DrawerLayout$DrawerListener mListener>
	//   15   29:return          
	}

	public void setDrawerLockMode(int i)
	{
		setDrawerLockMode(i, 3);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #884 <Method void setDrawerLockMode(int, int)>
		setDrawerLockMode(i, 5);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_5        
	//    7    9:invokevirtual   #884 <Method void setDrawerLockMode(int, int)>
	//    8   12:return          
	}

	public void setDrawerLockMode(int i, int j)
	{
		int k = GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #642 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_3        
		j;
	//    5    9:iload_2         
		JVM INSTR lookupswitch 4: default 52
	//	               3: 97
	//	               5: 105
	//	               8388611: 113
	//	               8388613: 121;
	//    6   10:lookupswitch    4: default 52
	//	               3: 97
	//	               5: 105
	//	               8388611: 113
	//	               8388613: 121
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		if(i != 0)
	//*   7   52:iload_1         
	//*   8   53:ifeq            72
		{
			ViewDragHelper viewdraghelper;
			if(k == 3)
	//*   9   56:iload_3         
	//*  10   57:iconst_3        
	//*  11   58:icmpne          129
				viewdraghelper = mLeftDragger;
	//   12   61:aload_0         
	//   13   62:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//   14   65:astore          4
			else
	//*  15   67:aload           4
	//*  16   69:invokevirtual   #952 <Method void ViewDragHelper.cancel()>
	//*  17   72:iload_1         
	//*  18   73:tableswitch     1 2: default 96
	//	               1 157
	//	               2 138
	//*  19   96:return          
	//*  20   97:aload_0         
	//*  21   98:iload_1         
	//*  22   99:putfield        #167 <Field int mLockModeLeft>
	//*  23  102:goto            52
	//*  24  105:aload_0         
	//*  25  106:iload_1         
	//*  26  107:putfield        #169 <Field int mLockModeRight>
	//*  27  110:goto            52
	//*  28  113:aload_0         
	//*  29  114:iload_1         
	//*  30  115:putfield        #171 <Field int mLockModeStart>
	//*  31  118:goto            52
	//*  32  121:aload_0         
	//*  33  122:iload_1         
	//*  34  123:putfield        #173 <Field int mLockModeEnd>
	//*  35  126:goto            52
				viewdraghelper = mRightDragger;
	//   36  129:aload_0         
	//   37  130:getfield        #234 <Field ViewDragHelper mRightDragger>
	//   38  133:astore          4
			viewdraghelper.cancel();
		}
		i;
		JVM INSTR tableswitch 1 2: default 96
	//	               1 157
	//	               2 138;
		   goto _L6 _L7 _L8
_L6:
		break; /* Loop/switch isn't completed */
_L7:
		break MISSING_BLOCK_LABEL_164;
_L9:
		return;
_L2:
		mLockModeLeft = i;
		  goto _L1
_L3:
		mLockModeRight = i;
		  goto _L1
_L4:
		mLockModeStart = i;
		  goto _L1
_L5:
		View view;
		mLockModeEnd = i;
		  goto _L1
	//*  39  135:goto            67
	//*  40  138:aload_0         
	//*  41  139:iload_3         
	//*  42  140:invokevirtual   #458 <Method View findDrawerWithGravity(int)>
	//*  43  143:astore          4
_L8:
		if((view = findDrawerWithGravity(k)) != null)
	//*  44  145:aload           4
	//*  45  147:ifnull          96
		{
			openDrawer(view);
	//   46  150:aload_0         
	//   47  151:aload           4
	//   48  153:invokevirtual   #878 <Method void openDrawer(View)>
			return;
	//   49  156:return          
		}
		  goto _L9
	//*  50  157:aload_0         
	//*  51  158:iload_3         
	//*  52  159:invokevirtual   #458 <Method View findDrawerWithGravity(int)>
	//*  53  162:astore          4
		if((view = findDrawerWithGravity(k)) != null)
	//*  54  164:aload           4
	//*  55  166:ifnull          96
		{
			closeDrawer(view);
	//   56  169:aload_0         
	//   57  170:aload           4
	//   58  172:invokevirtual   #954 <Method void closeDrawer(View)>
			return;
	//   59  175:return          
		}
		  goto _L9
	}

	public void setDrawerLockMode(int i, View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #376 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a ").append("drawer with appropriate layout_gravity").toString());
	//    4    8:new             #460 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #462 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #463 <Method void StringBuilder()>
	//    9   19:ldc2            #483 <String "View ">
	//   10   22:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #486 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #957 <String " is not a ">
	//   14   32:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc2            #959 <String "drawer with appropriate layout_gravity">
	//   16   38:invokevirtual   #469 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #475 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #478 <Method void IllegalArgumentException(String)>
	//   19   47:athrow          
		} else
		{
			setDrawerLockMode(i, ((LayoutParams)view.getLayoutParams()).gravity);
	//   20   48:aload_0         
	//   21   49:iload_1         
	//   22   50:aload_2         
	//   23   51:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   54:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   25   57:getfield        #517 <Field int DrawerLayout$LayoutParams.gravity>
	//   26   60:invokevirtual   #884 <Method void setDrawerLockMode(int, int)>
			return;
	//   27   63:return          
		}
	}

	public void setDrawerShadow(int i, int j)
	{
		setDrawerShadow(ContextCompat.getDrawable(getContext(), i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #655 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #966 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #969 <Method void setDrawerShadow(Drawable, int)>
	//    7   13:return          
	}

	public void setDrawerShadow(Drawable drawable, int i)
	{
		if(!SET_DRAWER_SHADOW_FROM_ELEVATION) goto _L2; else goto _L1
	//    0    0:getstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//    1    3:ifeq            7
_L1:
		return;
	//    2    6:return          
_L2:
		if((i & 0x800003) == 0x800003)
	//*   3    7:iload_2         
	//*   4    8:ldc2            #891 <Int 0x800003>
	//*   5   11:iand            
	//*   6   12:ldc2            #891 <Int 0x800003>
	//*   7   15:icmpne          32
			mShadowStart = drawable;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #175 <Field Drawable mShadowStart>
		else
	//*  11   23:aload_0         
	//*  12   24:invokespecial   #898 <Method void resolveShadowDrawables()>
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #497 <Method void invalidate()>
	//*  15   31:return          
		if((i & 0x800005) == 0x800005)
	//*  16   32:iload_2         
	//*  17   33:ldc2            #895 <Int 0x800005>
	//*  18   36:iand            
	//*  19   37:ldc2            #895 <Int 0x800005>
	//*  20   40:icmpne          51
		{
			mShadowEnd = drawable;
	//   21   43:aload_0         
	//   22   44:aload_1         
	//   23   45:putfield        #177 <Field Drawable mShadowEnd>
		} else
	//*  24   48:goto            23
		{
			if((i & 3) != 3)
				continue; /* Loop/switch isn't completed */
	//   25   51:iload_2         
	//   26   52:iconst_3        
	//   27   53:iand            
	//   28   54:iconst_3        
	//   29   55:icmpne          66
			mShadowLeft = drawable;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:putfield        #179 <Field Drawable mShadowLeft>
		}
_L4:
		resolveShadowDrawables();
		invalidate();
		return;
	//*  33   63:goto            23
		if((i & 5) != 5) goto _L1; else goto _L3
	//   34   66:iload_2         
	//   35   67:iconst_5        
	//   36   68:iand            
	//   37   69:iconst_5        
	//   38   70:icmpne          6
_L3:
		mShadowRight = drawable;
	//   39   73:aload_0         
	//   40   74:aload_1         
	//   41   75:putfield        #181 <Field Drawable mShadowRight>
		  goto _L4
		if(true) goto _L1; else goto _L5
_L5:
	//*  42   78:goto            23
	}

	public void setDrawerTitle(int i, CharSequence charsequence)
	{
		i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #359 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #642 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_1        
		if(i == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          20
			mTitleLeft = charsequence;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #680 <Field CharSequence mTitleLeft>
		else
	//*  11   19:return          
		if(i == 5)
	//*  12   20:iload_1         
	//*  13   21:iconst_5        
	//*  14   22:icmpne          19
		{
			mTitleRight = charsequence;
	//   15   25:aload_0         
	//   16   26:aload_2         
	//   17   27:putfield        #682 <Field CharSequence mTitleRight>
			return;
	//   18   30:return          
		}
	}

	void setDrawerViewOffset(View view, float f)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if(f == layoutparams.onScreen)
	//*   4    8:fload_2         
	//*   5    9:aload_3         
	//*   6   10:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//*   7   13:fcmpl           
	//*   8   14:ifne            18
		{
			return;
	//    9   17:return          
		} else
		{
			layoutparams.onScreen = f;
	//   10   18:aload_3         
	//   11   19:fload_2         
	//   12   20:putfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
			dispatchOnDrawerSlide(view, f);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #973 <Method void dispatchOnDrawerSlide(View, float)>
			return;
	//   17   29:return          
		}
	}

	public void setScrimColor(int i)
	{
		mScrimColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #158 <Field int mScrimColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #497 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackground(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            23
			drawable = ContextCompat.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #655 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #966 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:putfield        #283 <Field Drawable mStatusBarBackground>
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #497 <Method void invalidate()>
	//*  12   22:return          
			drawable = null;
	//   13   23:aconst_null     
	//   14   24:astore_2        
		mStatusBarBackground = drawable;
		invalidate();
	//*  15   25:goto            13
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		mStatusBarBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #283 <Field Drawable mStatusBarBackground>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #497 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackgroundColor(int i)
	{
		mStatusBarBackground = ((Drawable) (new ColorDrawable(i)));
	//    0    0:aload_0         
	//    1    1:new             #980 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #982 <Method void ColorDrawable(int)>
	//    5    9:putfield        #283 <Field Drawable mStatusBarBackground>
		invalidate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #497 <Method void invalidate()>
	//    8   16:return          
	}

	void updateDrawerState(int i, int j, View view)
	{
		LayoutParams layoutparams;
		i = mLeftDragger.getViewDragState();
	//    0    0:aload_0         
	//    1    1:getfield        #221 <Field ViewDragHelper mLeftDragger>
	//    2    4:invokevirtual   #985 <Method int ViewDragHelper.getViewDragState()>
	//    3    7:istore_1        
		int k = mRightDragger.getViewDragState();
	//    4    8:aload_0         
	//    5    9:getfield        #234 <Field ViewDragHelper mRightDragger>
	//    6   12:invokevirtual   #985 <Method int ViewDragHelper.getViewDragState()>
	//    7   15:istore          4
		if(i == 1 || k == 1)
	//*   8   17:iload_1         
	//*   9   18:iconst_1        
	//*  10   19:icmpeq          28
	//*  11   22:iload           4
	//*  12   24:iconst_1        
	//*  13   25:icmpne          124
			i = 1;
	//   14   28:iconst_1        
	//   15   29:istore_1        
		else
	//*  16   30:aload_3         
	//*  17   31:ifnull          62
	//*  18   34:iload_2         
	//*  19   35:ifne            62
	//*  20   38:aload_3         
	//*  21   39:invokevirtual   #331 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  22   42:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//*  23   45:astore          5
	//*  24   47:aload           5
	//*  25   49:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  26   52:fconst_0        
	//*  27   53:fcmpl           
	//*  28   54:ifne            145
	//*  29   57:aload_0         
	//*  30   58:aload_3         
	//*  31   59:invokevirtual   #987 <Method void dispatchOnDrawerClosed(View)>
	//*  32   62:iload_1         
	//*  33   63:aload_0         
	//*  34   64:getfield        #989 <Field int mDrawerState>
	//*  35   67:icmpeq          163
	//*  36   70:aload_0         
	//*  37   71:iload_1         
	//*  38   72:putfield        #989 <Field int mDrawerState>
	//*  39   75:aload_0         
	//*  40   76:getfield        #381 <Field List mListeners>
	//*  41   79:ifnull          163
	//*  42   82:aload_0         
	//*  43   83:getfield        #381 <Field List mListeners>
	//*  44   86:invokeinterface #548 <Method int List.size()>
	//*  45   91:iconst_1        
	//*  46   92:isub            
	//*  47   93:istore_2        
	//*  48   94:iload_2         
	//*  49   95:iflt            163
	//*  50   98:aload_0         
	//*  51   99:getfield        #381 <Field List mListeners>
	//*  52  102:iload_2         
	//*  53  103:invokeinterface #549 <Method Object List.get(int)>
	//*  54  108:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//*  55  111:iload_1         
	//*  56  112:invokeinterface #992 <Method void DrawerLayout$DrawerListener.onDrawerStateChanged(int)>
	//*  57  117:iload_2         
	//*  58  118:iconst_1        
	//*  59  119:isub            
	//*  60  120:istore_2        
	//*  61  121:goto            94
		if(i == 2 || k == 2)
	//*  62  124:iload_1         
	//*  63  125:iconst_2        
	//*  64  126:icmpeq          135
	//*  65  129:iload           4
	//*  66  131:iconst_2        
	//*  67  132:icmpne          140
			i = 2;
	//   68  135:iconst_2        
	//   69  136:istore_1        
		else
	//*  70  137:goto            30
			i = 0;
	//   71  140:iconst_0        
	//   72  141:istore_1        
		if(view == null || j != 0) goto _L2; else goto _L1
_L1:
		layoutparams = (LayoutParams)view.getLayoutParams();
		if(layoutparams.onScreen != 0.0F) goto _L4; else goto _L3
_L3:
		dispatchOnDrawerClosed(view);
_L2:
		if(i != mDrawerState)
		{
			mDrawerState = i;
			if(mListeners != null)
				for(j = mListeners.size() - 1; j >= 0; j--)
					((DrawerListener)mListeners.get(j)).onDrawerStateChanged(i);

		}
		break; /* Loop/switch isn't completed */
	//*  73  142:goto            30
_L4:
		if(layoutparams.onScreen == 1.0F)
	//*  74  145:aload           5
	//*  75  147:getfield        #491 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  76  150:fconst_1        
	//*  77  151:fcmpl           
	//*  78  152:ifne            62
			dispatchOnDrawerOpened(view);
	//   79  155:aload_0         
	//   80  156:aload_3         
	//   81  157:invokevirtual   #994 <Method void dispatchOnDrawerOpened(View)>
		if(true) goto _L2; else goto _L5
	//   82  160:goto            62
_L5:
	//   83  163:return          
	}

	private static final boolean ALLOW_EDGE_LOCK = false;
	static final boolean CAN_HIDE_DESCENDANTS;
	private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
	private static final int DEFAULT_SCRIM_COLOR = 0x99000000;
	private static final int DRAWER_ELEVATION = 10;
	static final int LAYOUT_ATTRS[] = {
		0x10100b3
	};
	public static final int LOCK_MODE_LOCKED_CLOSED = 1;
	public static final int LOCK_MODE_LOCKED_OPEN = 2;
	public static final int LOCK_MODE_UNDEFINED = 3;
	public static final int LOCK_MODE_UNLOCKED = 0;
	private static final int MIN_DRAWER_MARGIN = 64;
	private static final int MIN_FLING_VELOCITY = 400;
	private static final int PEEK_DELAY = 160;
	private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
	public static final int STATE_DRAGGING = 1;
	public static final int STATE_IDLE = 0;
	public static final int STATE_SETTLING = 2;
	private static final String TAG = "DrawerLayout";
	private static final int THEME_ATTRS[] = {
		0x1010434
	};
	private static final float TOUCH_SLOP_SENSITIVITY = 1F;
	private final ChildAccessibilityDelegate mChildAccessibilityDelegate;
	private boolean mChildrenCanceledTouch;
	private boolean mDisallowInterceptRequested;
	private boolean mDrawStatusBarBackground;
	private float mDrawerElevation;
	private int mDrawerState;
	private boolean mFirstLayout;
	private boolean mInLayout;
	private float mInitialMotionX;
	private float mInitialMotionY;
	private Object mLastInsets;
	private final ViewDragCallback mLeftCallback;
	private final ViewDragHelper mLeftDragger;
	private DrawerListener mListener;
	private List mListeners;
	private int mLockModeEnd;
	private int mLockModeLeft;
	private int mLockModeRight;
	private int mLockModeStart;
	private int mMinDrawerMargin;
	private final ArrayList mNonDrawerViews;
	private final ViewDragCallback mRightCallback;
	private final ViewDragHelper mRightDragger;
	private int mScrimColor;
	private float mScrimOpacity;
	private Paint mScrimPaint;
	private Drawable mShadowEnd;
	private Drawable mShadowLeft;
	private Drawable mShadowLeftResolved;
	private Drawable mShadowRight;
	private Drawable mShadowRightResolved;
	private Drawable mShadowStart;
	private Drawable mStatusBarBackground;
	private CharSequence mTitleLeft;
	private CharSequence mTitleRight;

	static 
	{
		boolean flag1 = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
	//    2    2:iconst_1        
	//    3    3:newarray        int[]
	//    4    5:dup             
	//    5    6:iconst_0        
	//    6    7:ldc1            #128 <Int 0x1010434>
	//    7    9:iastore         
	//    8   10:putstatic       #130 <Field int[] THEME_ATTRS>
	//    9   13:iconst_1        
	//   10   14:newarray        int[]
	//   11   16:dup             
	//   12   17:iconst_0        
	//   13   18:ldc1            #131 <Int 0x10100b3>
	//   14   20:iastore         
	//   15   21:putstatic       #133 <Field int[] LAYOUT_ATTRS>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   24:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   27:bipush          19
	//*  18   29:icmplt          53
			flag = true;
	//   19   32:iconst_1        
	//   20   33:istore_0        
		else
	//*  21   34:iload_0         
	//*  22   35:putstatic       #140 <Field boolean CAN_HIDE_DESCENDANTS>
	//*  23   38:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*  24   41:bipush          21
	//*  25   43:icmplt          58
	//*  26   46:iload_1         
	//*  27   47:istore_0        
	//*  28   48:iload_0         
	//*  29   49:putstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*  30   52:return          
			flag = false;
	//   31   53:iconst_0        
	//   32   54:istore_0        
		CAN_HIDE_DESCENDANTS = flag;
		if(android.os.Build.VERSION.SDK_INT >= 21)
			flag = flag1;
		else
	//*  33   55:goto            34
			flag = false;
	//   34   58:iconst_0        
	//   35   59:istore_0        
		SET_DRAWER_SHADOW_FROM_ELEVATION = flag;
	//*  36   60:goto            48
	}

	// Unreferenced inner class android/support/v4/widget/DrawerLayout$ViewDragCallback$1

/* anonymous class */
	class ViewDragCallback._cls1
		implements Runnable
	{

		public void run()
		{
			peekDrawer();
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field DrawerLayout$ViewDragCallback this$1>
		//    2    4:invokevirtual   #25  <Method void DrawerLayout$ViewDragCallback.peekDrawer()>
		//    3    7:return          
		}

		final ViewDragCallback this$1;

			
			{
				this$1 = ViewDragCallback.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field DrawerLayout$ViewDragCallback this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
	}

}
