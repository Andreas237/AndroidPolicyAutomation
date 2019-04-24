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
		//*   1    3:ifeq            15
			{
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    2    6:aload_0         
		//    3    7:aload_1         
		//    4    8:aload_2         
		//    5    9:invokespecial   #188 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			} else
		//*   6   12:goto            73
			{
				AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
		//    7   15:aload_2         
		//    8   16:invokestatic    #192 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
		//    9   19:astore_3        
				super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:aload_3         
		//   13   23:invokespecial   #188 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
				accessibilitynodeinfocompat.setSource(view);
		//   14   26:aload_2         
		//   15   27:aload_1         
		//   16   28:invokevirtual   #195 <Method void AccessibilityNodeInfoCompat.setSource(View)>
				android.view.ViewParent viewparent = ViewCompat.getParentForAccessibility(view);
		//   17   31:aload_1         
		//   18   32:invokestatic    #201 <Method android.view.ViewParent ViewCompat.getParentForAccessibility(View)>
		//   19   35:astore          4
				if(viewparent instanceof View)
		//*  20   37:aload           4
		//*  21   39:instanceof      #203 <Class View>
		//*  22   42:ifeq            54
					accessibilitynodeinfocompat.setParent((View)viewparent);
		//   23   45:aload_2         
		//   24   46:aload           4
		//   25   48:checkcast       #203 <Class View>
		//   26   51:invokevirtual   #206 <Method void AccessibilityNodeInfoCompat.setParent(View)>
				copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
		//   27   54:aload_0         
		//   28   55:aload_2         
		//   29   56:aload_3         
		//   30   57:invokespecial   #208 <Method void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompat)>
				accessibilitynodeinfocompat1.recycle();
		//   31   60:aload_3         
		//   32   61:invokevirtual   #211 <Method void AccessibilityNodeInfoCompat.recycle()>
				addChildrenForAccessibility(accessibilitynodeinfocompat, (ViewGroup)view);
		//   33   64:aload_0         
		//   34   65:aload_2         
		//   35   66:aload_1         
		//   36   67:checkcast       #28  <Class ViewGroup>
		//   37   70:invokespecial   #213 <Method void addChildrenForAccessibility(AccessibilityNodeInfoCompat, ViewGroup)>
			}
			accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/widget/DrawerLayout)).getName())));
		//   38   73:aload_2         
		//   39   74:ldc1            #6   <Class DrawerLayout>
		//   40   76:invokevirtual   #179 <Method String Class.getName()>
		//   41   79:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
			accessibilitynodeinfocompat.setFocusable(false);
		//   42   82:aload_2         
		//   43   83:iconst_0        
		//   44   84:invokevirtual   #107 <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
			accessibilitynodeinfocompat.setFocused(false);
		//   45   87:aload_2         
		//   46   88:iconst_0        
		//   47   89:invokevirtual   #113 <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
			accessibilitynodeinfocompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS);
		//   48   92:aload_2         
		//   49   93:getstatic       #219 <Field android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat.ACTION_FOCUS>
		//   50   96:invokevirtual   #223 <Method boolean AccessibilityNodeInfoCompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat)>
		//   51   99:pop             
			accessibilitynodeinfocompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS);
		//   52  100:aload_2         
		//   53  101:getstatic       #226 <Field android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat.ACTION_CLEAR_FOCUS>
		//   54  104:invokevirtual   #223 <Method boolean AccessibilityNodeInfoCompat.removeAction(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat)>
		//   55  107:pop             
		//   56  108:return          
		}

		public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
		{
			if(!DrawerLayout.CAN_HIDE_DESCENDANTS && !DrawerLayout.includeChildForAccessibility(view))
		//*   0    0:getstatic       #186 <Field boolean DrawerLayout.CAN_HIDE_DESCENDANTS>
		//*   1    3:ifne            18
		//*   2    6:aload_2         
		//*   3    7:invokestatic    #40  <Method boolean DrawerLayout.includeChildForAccessibility(View)>
		//*   4   10:ifeq            16
		//*   5   13:goto            18
				return false;
		//    6   16:iconst_0        
		//    7   17:ireturn         
			else
				return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
		//    8   18:aload_0         
		//    9   19:aload_1         
		//   10   20:aload_2         
		//   11   21:aload_3         
		//   12   22:invokespecial   #230 <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
		//   13   25:ireturn         
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
		//    3    3:invokespecial   #34  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			gravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #26  <Field int gravity>
			context = ((Context) (context.obtainStyledAttributes(attributeset, DrawerLayout.LAYOUT_ATTRS)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #38  <Field int[] DrawerLayout.LAYOUT_ATTRS>
		//   10   16:invokevirtual   #44  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			gravity = ((TypedArray) (context)).getInt(0, 0);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:iconst_0        
		//   15   23:iconst_0        
		//   16   24:invokevirtual   #50  <Method int TypedArray.getInt(int, int)>
		//   17   27:putfield        #26  <Field int gravity>
			((TypedArray) (context)).recycle();
		//   18   30:aload_1         
		//   19   31:invokevirtual   #54  <Method void TypedArray.recycle()>
		//   20   34:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
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
		//    2    2:invokespecial   #62  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
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
		//    2    2:invokespecial   #59  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
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
		//    3    3:invokespecial   #55  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(openDrawerGravity);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field int openDrawerGravity>
		//    7   11:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeLeft);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #41  <Field int lockModeLeft>
		//   11   19:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeRight);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #43  <Field int lockModeRight>
		//   15   27:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeStart);
		//   16   30:aload_1         
		//   17   31:aload_0         
		//   18   32:getfield        #45  <Field int lockModeStart>
		//   19   35:invokevirtual   #59  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeEnd);
		//   20   38:aload_1         
		//   21   39:aload_0         
		//   22   40:getfield        #47  <Field int lockModeEnd>
		//   23   43:invokevirtual   #59  <Method void Parcel.writeInt(int)>
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
		//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
			openDrawerGravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #33  <Field int openDrawerGravity>
			openDrawerGravity = parcel.readInt();
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #39  <Method int Parcel.readInt()>
		//   10   16:putfield        #33  <Field int openDrawerGravity>
			lockModeLeft = parcel.readInt();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #39  <Method int Parcel.readInt()>
		//   14   24:putfield        #41  <Field int lockModeLeft>
			lockModeRight = parcel.readInt();
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #39  <Method int Parcel.readInt()>
		//   18   32:putfield        #43  <Field int lockModeRight>
			lockModeStart = parcel.readInt();
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokevirtual   #39  <Method int Parcel.readInt()>
		//   22   40:putfield        #45  <Field int lockModeStart>
			lockModeEnd = parcel.readInt();
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #39  <Method int Parcel.readInt()>
		//   26   48:putfield        #47  <Field int lockModeEnd>
		//   27   51:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #51  <Method void AbsSavedState(Parcelable)>
			openDrawerGravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #33  <Field int openDrawerGravity>
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
			int i = mAbsGravity;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field int mAbsGravity>
		//    2    4:istore_2        
			byte byte0 = 3;
		//    3    5:iconst_3        
		//    4    6:istore_1        
			if(i == 3)
		//*   5    7:iload_2         
		//*   6    8:iconst_3        
		//*   7    9:icmpne          14
				byte0 = 5;
		//    8   12:iconst_5        
		//    9   13:istore_1        
			View view = findDrawerWithGravity(((int) (byte0)));
		//   10   14:aload_0         
		//   11   15:getfield        #21  <Field DrawerLayout this$0>
		//   12   18:iload_1         
		//   13   19:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   14   22:astore_3        
			if(view != null)
		//*  15   23:aload_3         
		//*  16   24:ifnull          35
				closeDrawer(view);
		//   17   27:aload_0         
		//   18   28:getfield        #21  <Field DrawerLayout this$0>
		//   19   31:aload_3         
		//   20   32:invokevirtual   #41  <Method void DrawerLayout.closeDrawer(View)>
		//   21   35:return          
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
		//*   4    4:icmpne          19
				view = findDrawerWithGravity(3);
		//    5    7:aload_0         
		//    6    8:getfield        #21  <Field DrawerLayout this$0>
		//    7   11:iconst_3        
		//    8   12:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//    9   15:astore_3        
			else
		//*  10   16:goto            28
				view = findDrawerWithGravity(5);
		//   11   19:aload_0         
		//   12   20:getfield        #21  <Field DrawerLayout this$0>
		//   13   23:iconst_5        
		//   14   24:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   15   27:astore_3        
			if(view != null && getDrawerLockMode(view) == 0)
		//*  16   28:aload_3         
		//*  17   29:ifnull          52
		//*  18   32:aload_0         
		//*  19   33:getfield        #21  <Field DrawerLayout this$0>
		//*  20   36:aload_3         
		//*  21   37:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
		//*  22   40:ifne            52
				mDragger.captureChildView(view, j);
		//   23   43:aload_0         
		//   24   44:getfield        #80  <Field ViewDragHelper mDragger>
		//   25   47:aload_3         
		//   26   48:iload_2         
		//   27   49:invokevirtual   #86  <Method void ViewDragHelper.captureChildView(View, int)>
		//   28   52:return          
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
		//*   8   14:ifeq            29
				f = (float)(i + j) / (float)j;
		//    9   17:iload_2         
		//   10   18:iload_3         
		//   11   19:iadd            
		//   12   20:i2f             
		//   13   21:iload_3         
		//   14   22:i2f             
		//   15   23:fdiv            
		//   16   24:fstore          6
			else
		//*  17   26:goto            44
				f = (float)(getWidth() - i) / (float)j;
		//   18   29:aload_0         
		//   19   30:getfield        #21  <Field DrawerLayout this$0>
		//   20   33:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   21   36:iload_2         
		//   22   37:isub            
		//   23   38:i2f             
		//   24   39:iload_3         
		//   25   40:i2f             
		//   26   41:fdiv            
		//   27   42:fstore          6
			setDrawerViewOffset(view, f);
		//   28   44:aload_0         
		//   29   45:getfield        #21  <Field DrawerLayout this$0>
		//   30   48:aload_1         
		//   31   49:fload           6
		//   32   51:invokevirtual   #124 <Method void DrawerLayout.setDrawerViewOffset(View, float)>
			if(f == 0.0F)
		//*  33   54:fload           6
		//*  34   56:fconst_0        
		//*  35   57:fcmpl           
		//*  36   58:ifne            66
				i = 4;
		//   37   61:iconst_4        
		//   38   62:istore_2        
			else
		//*  39   63:goto            68
				i = 0;
		//   40   66:iconst_0        
		//   41   67:istore_2        
			view.setVisibility(i);
		//   42   68:aload_1         
		//   43   69:iload_2         
		//   44   70:invokevirtual   #127 <Method void View.setVisibility(int)>
			invalidate();
		//   45   73:aload_0         
		//   46   74:getfield        #21  <Field DrawerLayout this$0>
		//   47   77:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
		//   48   80:return          
		}

		public void onViewReleased(View view, float f, float f1)
		{
			int i;
label0:
			{
				f1 = getDrawerViewOffset(view);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #136 <Method float DrawerLayout.getDrawerViewOffset(View)>
		//    4    8:fstore_3        
				int k = view.getWidth();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #53  <Method int View.getWidth()>
		//    7   13:istore          6
				if(checkDrawerViewAbsoluteGravity(view, 3))
		//*   8   15:aload_0         
		//*   9   16:getfield        #21  <Field DrawerLayout this$0>
		//*  10   19:aload_1         
		//*  11   20:iconst_3        
		//*  12   21:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//*  13   24:ifeq            63
				{
					if(f <= 0.0F && (f != 0.0F || f1 <= 0.5F))
		//*  14   27:fload_2         
		//*  15   28:fconst_0        
		//*  16   29:fcmpl           
		//*  17   30:ifgt            57
		//*  18   33:fload_2         
		//*  19   34:fconst_0        
		//*  20   35:fcmpl           
		//*  21   36:ifne            49
		//*  22   39:fload_3         
		//*  23   40:ldc1            #137 <Float 0.5F>
		//*  24   42:fcmpl           
		//*  25   43:ifle            49
		//*  26   46:goto            57
						i = -k;
		//   27   49:iload           6
		//   28   51:ineg            
		//   29   52:istore          4
					else
		//*  30   54:goto            106
						i = 0;
		//   31   57:iconst_0        
		//   32   58:istore          4
					break label0;
		//   33   60:goto            106
				}
				int j = getWidth();
		//   34   63:aload_0         
		//   35   64:getfield        #21  <Field DrawerLayout this$0>
		//   36   67:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   37   70:istore          5
				if(f >= 0.0F)
		//*  38   72:fload_2         
		//*  39   73:fconst_0        
		//*  40   74:fcmpg           
		//*  41   75:iflt            99
				{
					i = j;
		//   42   78:iload           5
		//   43   80:istore          4
					if(f != 0.0F)
						break label0;
		//   44   82:fload_2         
		//   45   83:fconst_0        
		//   46   84:fcmpl           
		//   47   85:ifne            106
					i = j;
		//   48   88:iload           5
		//   49   90:istore          4
					if(f1 <= 0.5F)
						break label0;
		//   50   92:fload_3         
		//   51   93:ldc1            #137 <Float 0.5F>
		//   52   95:fcmpl           
		//   53   96:ifle            106
				}
				i = j - k;
		//   54   99:iload           5
		//   55  101:iload           6
		//   56  103:isub            
		//   57  104:istore          4
			}
			mDragger.settleCapturedViewAt(i, view.getTop());
		//   58  106:aload_0         
		//   59  107:getfield        #80  <Field ViewDragHelper mDragger>
		//   60  110:iload           4
		//   61  112:aload_1         
		//   62  113:invokevirtual   #67  <Method int View.getTop()>
		//   63  116:invokevirtual   #141 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//   64  119:pop             
			invalidate();
		//   65  120:aload_0         
		//   66  121:getfield        #21  <Field DrawerLayout this$0>
		//   67  124:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
		//   68  127:return          
		}

		void peekDrawer()
		{
			int k = mDragger.getEdgeSize();
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field ViewDragHelper mDragger>
		//    2    4:invokevirtual   #145 <Method int ViewDragHelper.getEdgeSize()>
		//    3    7:istore_3        
			int i = mAbsGravity;
		//    4    8:aload_0         
		//    5    9:getfield        #31  <Field int mAbsGravity>
		//    6   12:istore_1        
			int j = 0;
		//    7   13:iconst_0        
		//    8   14:istore_2        
			boolean flag;
			if(i == 3)
		//*   9   15:iload_1         
		//*  10   16:iconst_3        
		//*  11   17:icmpne          25
				flag = true;
		//   12   20:iconst_1        
		//   13   21:istore_1        
			else
		//*  14   22:goto            27
				flag = false;
		//   15   25:iconst_0        
		//   16   26:istore_1        
			View view;
			if(flag)
		//*  17   27:iload_1         
		//*  18   28:ifeq            60
			{
				view = findDrawerWithGravity(3);
		//   19   31:aload_0         
		//   20   32:getfield        #21  <Field DrawerLayout this$0>
		//   21   35:iconst_3        
		//   22   36:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   23   39:astore          4
				if(view != null)
		//*  24   41:aload           4
		//*  25   43:ifnull          53
					j = -view.getWidth();
		//   26   46:aload           4
		//   27   48:invokevirtual   #53  <Method int View.getWidth()>
		//   28   51:ineg            
		//   29   52:istore_2        
				j += k;
		//   30   53:iload_2         
		//   31   54:iload_3         
		//   32   55:iadd            
		//   33   56:istore_2        
			} else
		//*  34   57:goto            80
			{
				view = findDrawerWithGravity(5);
		//   35   60:aload_0         
		//   36   61:getfield        #21  <Field DrawerLayout this$0>
		//   37   64:iconst_5        
		//   38   65:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   39   68:astore          4
				j = getWidth() - k;
		//   40   70:aload_0         
		//   41   71:getfield        #21  <Field DrawerLayout this$0>
		//   42   74:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   43   77:iload_3         
		//   44   78:isub            
		//   45   79:istore_2        
			}
			if(view != null && (flag && view.getLeft() < j || !flag && view.getLeft() > j) && getDrawerLockMode(view) == 0)
		//*  46   80:aload           4
		//*  47   82:ifnull          173
		//*  48   85:iload_1         
		//*  49   86:ifeq            98
		//*  50   89:aload           4
		//*  51   91:invokevirtual   #148 <Method int View.getLeft()>
		//*  52   94:iload_2         
		//*  53   95:icmplt          111
		//*  54   98:iload_1         
		//*  55   99:ifne            173
		//*  56  102:aload           4
		//*  57  104:invokevirtual   #148 <Method int View.getLeft()>
		//*  58  107:iload_2         
		//*  59  108:icmple          173
		//*  60  111:aload_0         
		//*  61  112:getfield        #21  <Field DrawerLayout this$0>
		//*  62  115:aload           4
		//*  63  117:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
		//*  64  120:ifne            173
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   65  123:aload           4
		//   66  125:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   67  128:checkcast       #102 <Class DrawerLayout$LayoutParams>
		//   68  131:astore          5
				mDragger.smoothSlideViewTo(view, j, view.getTop());
		//   69  133:aload_0         
		//   70  134:getfield        #80  <Field ViewDragHelper mDragger>
		//   71  137:aload           4
		//   72  139:iload_2         
		//   73  140:aload           4
		//   74  142:invokevirtual   #67  <Method int View.getTop()>
		//   75  145:invokevirtual   #152 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
		//   76  148:pop             
				layoutparams.isPeeking = true;
		//   77  149:aload           5
		//   78  151:iconst_1        
		//   79  152:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
				invalidate();
		//   80  155:aload_0         
		//   81  156:getfield        #21  <Field DrawerLayout this$0>
		//   82  159:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
				closeOtherDrawer();
		//   83  162:aload_0         
		//   84  163:invokespecial   #108 <Method void closeOtherDrawer()>
				cancelChildViewTouch();
		//   85  166:aload_0         
		//   86  167:getfield        #21  <Field DrawerLayout this$0>
		//   87  170:invokevirtual   #155 <Method void DrawerLayout.cancelChildViewTouch()>
			}
		//   88  173:return          
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
	//    3    3:invokespecial   #149 <Method void DrawerLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public DrawerLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #153 <Method void DrawerLayout(Context, AttributeSet, int)>
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
	//    4    4:invokespecial   #154 <Method void ViewGroup(Context, AttributeSet, int)>
		mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
	//    5    7:aload_0         
	//    6    8:new             #11  <Class DrawerLayout$ChildAccessibilityDelegate>
	//    7   11:dup             
	//    8   12:invokespecial   #156 <Method void DrawerLayout$ChildAccessibilityDelegate()>
	//    9   15:putfield        #158 <Field DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate>
		mScrimColor = 0x99000000;
	//   10   18:aload_0         
	//   11   19:ldc1            #49  <Int 0x99000000>
	//   12   21:putfield        #160 <Field int mScrimColor>
		mScrimPaint = new Paint();
	//   13   24:aload_0         
	//   14   25:new             #162 <Class Paint>
	//   15   28:dup             
	//   16   29:invokespecial   #163 <Method void Paint()>
	//   17   32:putfield        #165 <Field Paint mScrimPaint>
		mFirstLayout = true;
	//   18   35:aload_0         
	//   19   36:iconst_1        
	//   20   37:putfield        #167 <Field boolean mFirstLayout>
		mLockModeLeft = 3;
	//   21   40:aload_0         
	//   22   41:iconst_3        
	//   23   42:putfield        #169 <Field int mLockModeLeft>
		mLockModeRight = 3;
	//   24   45:aload_0         
	//   25   46:iconst_3        
	//   26   47:putfield        #171 <Field int mLockModeRight>
		mLockModeStart = 3;
	//   27   50:aload_0         
	//   28   51:iconst_3        
	//   29   52:putfield        #173 <Field int mLockModeStart>
		mLockModeEnd = 3;
	//   30   55:aload_0         
	//   31   56:iconst_3        
	//   32   57:putfield        #175 <Field int mLockModeEnd>
		mShadowStart = null;
	//   33   60:aload_0         
	//   34   61:aconst_null     
	//   35   62:putfield        #177 <Field Drawable mShadowStart>
		mShadowEnd = null;
	//   36   65:aload_0         
	//   37   66:aconst_null     
	//   38   67:putfield        #179 <Field Drawable mShadowEnd>
		mShadowLeft = null;
	//   39   70:aload_0         
	//   40   71:aconst_null     
	//   41   72:putfield        #181 <Field Drawable mShadowLeft>
		mShadowRight = null;
	//   42   75:aload_0         
	//   43   76:aconst_null     
	//   44   77:putfield        #183 <Field Drawable mShadowRight>
		setDescendantFocusability(0x40000);
	//   45   80:aload_0         
	//   46   81:ldc1            #184 <Int 0x40000>
	//   47   83:invokevirtual   #188 <Method void setDescendantFocusability(int)>
		f = getResources().getDisplayMetrics().density;
	//   48   86:aload_0         
	//   49   87:invokevirtual   #192 <Method Resources getResources()>
	//   50   90:invokevirtual   #198 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   51   93:getfield        #203 <Field float DisplayMetrics.density>
	//   52   96:fstore          4
		mMinDrawerMargin = (int)(64F * f + 0.5F);
	//   53   98:aload_0         
	//   54   99:ldc1            #204 <Float 64F>
	//   55  101:fload           4
	//   56  103:fmul            
	//   57  104:ldc1            #205 <Float 0.5F>
	//   58  106:fadd            
	//   59  107:f2i             
	//   60  108:putfield        #207 <Field int mMinDrawerMargin>
		float f1 = 400F * f;
	//   61  111:ldc1            #208 <Float 400F>
	//   62  113:fload           4
	//   63  115:fmul            
	//   64  116:fstore          5
		mLeftCallback = new ViewDragCallback(3);
	//   65  118:aload_0         
	//   66  119:new             #37  <Class DrawerLayout$ViewDragCallback>
	//   67  122:dup             
	//   68  123:aload_0         
	//   69  124:iconst_3        
	//   70  125:invokespecial   #211 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
	//   71  128:putfield        #213 <Field DrawerLayout$ViewDragCallback mLeftCallback>
		mRightCallback = new ViewDragCallback(5);
	//   72  131:aload_0         
	//   73  132:new             #37  <Class DrawerLayout$ViewDragCallback>
	//   74  135:dup             
	//   75  136:aload_0         
	//   76  137:iconst_5        
	//   77  138:invokespecial   #211 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
	//   78  141:putfield        #215 <Field DrawerLayout$ViewDragCallback mRightCallback>
		mLeftDragger = ViewDragHelper.create(((ViewGroup) (this)), 1.0F, ((ViewDragHelper.Callback) (mLeftCallback)));
	//   79  144:aload_0         
	//   80  145:aload_0         
	//   81  146:fconst_1        
	//   82  147:aload_0         
	//   83  148:getfield        #213 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   84  151:invokestatic    #221 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//   85  154:putfield        #223 <Field ViewDragHelper mLeftDragger>
		mLeftDragger.setEdgeTrackingEnabled(1);
	//   86  157:aload_0         
	//   87  158:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   88  161:iconst_1        
	//   89  162:invokevirtual   #226 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		mLeftDragger.setMinVelocity(f1);
	//   90  165:aload_0         
	//   91  166:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   92  169:fload           5
	//   93  171:invokevirtual   #230 <Method void ViewDragHelper.setMinVelocity(float)>
		mLeftCallback.setDragger(mLeftDragger);
	//   94  174:aload_0         
	//   95  175:getfield        #213 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   96  178:aload_0         
	//   97  179:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   98  182:invokevirtual   #234 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
		mRightDragger = ViewDragHelper.create(((ViewGroup) (this)), 1.0F, ((ViewDragHelper.Callback) (mRightCallback)));
	//   99  185:aload_0         
	//  100  186:aload_0         
	//  101  187:fconst_1        
	//  102  188:aload_0         
	//  103  189:getfield        #215 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//  104  192:invokestatic    #221 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//  105  195:putfield        #236 <Field ViewDragHelper mRightDragger>
		mRightDragger.setEdgeTrackingEnabled(2);
	//  106  198:aload_0         
	//  107  199:getfield        #236 <Field ViewDragHelper mRightDragger>
	//  108  202:iconst_2        
	//  109  203:invokevirtual   #226 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		mRightDragger.setMinVelocity(f1);
	//  110  206:aload_0         
	//  111  207:getfield        #236 <Field ViewDragHelper mRightDragger>
	//  112  210:fload           5
	//  113  212:invokevirtual   #230 <Method void ViewDragHelper.setMinVelocity(float)>
		mRightCallback.setDragger(mRightDragger);
	//  114  215:aload_0         
	//  115  216:getfield        #215 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//  116  219:aload_0         
	//  117  220:getfield        #236 <Field ViewDragHelper mRightDragger>
	//  118  223:invokevirtual   #234 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
		setFocusableInTouchMode(true);
	//  119  226:aload_0         
	//  120  227:iconst_1        
	//  121  228:invokevirtual   #240 <Method void setFocusableInTouchMode(boolean)>
		ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//  122  231:aload_0         
	//  123  232:iconst_1        
	//  124  233:invokestatic    #246 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new AccessibilityDelegate())));
	//  125  236:aload_0         
	//  126  237:new             #8   <Class DrawerLayout$AccessibilityDelegate>
	//  127  240:dup             
	//  128  241:aload_0         
	//  129  242:invokespecial   #249 <Method void DrawerLayout$AccessibilityDelegate(DrawerLayout)>
	//  130  245:invokestatic    #253 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		setMotionEventSplittingEnabled(false);
	//  131  248:aload_0         
	//  132  249:iconst_0        
	//  133  250:invokevirtual   #256 <Method void setMotionEventSplittingEnabled(boolean)>
		if(!ViewCompat.getFitsSystemWindows(((View) (this))))
			break MISSING_BLOCK_LABEL_323;
	//  134  253:aload_0         
	//  135  254:invokestatic    #260 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//  136  257:ifeq            323
		if(android.os.Build.VERSION.SDK_INT < 21)
			break MISSING_BLOCK_LABEL_318;
	//  137  260:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//  138  263:bipush          21
	//  139  265:icmplt          318
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
			//*   5    9:ifle            17
					flag = true;
			//    6   12:iconst_1        
			//    7   13:istore_3        
				else
			//*   8   14:goto            19
					flag = false;
			//    9   17:iconst_0        
			//   10   18:istore_3        
				((DrawerLayout) (view)).setChildInsets(((Object) (windowinsets)), flag);
			//   11   19:aload_1         
			//   12   20:aload_2         
			//   13   21:iload_3         
			//   14   22:invokevirtual   #35  <Method void DrawerLayout.setChildInsets(Object, boolean)>
				return windowinsets.consumeSystemWindowInsets();
			//   15   25:aload_2         
			//   16   26:invokevirtual   #39  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
			//   17   29:areturn         
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
	//  144  274:invokespecial   #261 <Method void DrawerLayout$1(DrawerLayout)>
	//  145  277:invokevirtual   #265 <Method void setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
		setSystemUiVisibility(1280);
	//  146  280:aload_0         
	//  147  281:sipush          1280
	//  148  284:invokevirtual   #268 <Method void setSystemUiVisibility(int)>
		context = ((Context) (context.obtainStyledAttributes(THEME_ATTRS)));
	//  149  287:aload_1         
	//  150  288:getstatic       #130 <Field int[] THEME_ATTRS>
	//  151  291:invokevirtual   #274 <Method TypedArray Context.obtainStyledAttributes(int[])>
	//  152  294:astore_1        
		mStatusBarBackground = ((TypedArray) (context)).getDrawable(0);
	//  153  295:aload_0         
	//  154  296:aload_1         
	//  155  297:iconst_0        
	//  156  298:invokevirtual   #280 <Method Drawable TypedArray.getDrawable(int)>
	//  157  301:putfield        #282 <Field Drawable mStatusBarBackground>
		((TypedArray) (context)).recycle();
	//  158  304:aload_1         
	//  159  305:invokevirtual   #285 <Method void TypedArray.recycle()>
		break MISSING_BLOCK_LABEL_323;
	//  160  308:goto            323
		attributeset;
	//  161  311:astore_2        
		((TypedArray) (context)).recycle();
	//  162  312:aload_1         
	//  163  313:invokevirtual   #285 <Method void TypedArray.recycle()>
		throw attributeset;
	//  164  316:aload_2         
	//  165  317:athrow          
		mStatusBarBackground = null;
	//  166  318:aload_0         
	//  167  319:aconst_null     
	//  168  320:putfield        #282 <Field Drawable mStatusBarBackground>
		mDrawerElevation = 10F * f;
	//  169  323:aload_0         
	//  170  324:ldc2            #286 <Float 10F>
	//  171  327:fload           4
	//  172  329:fmul            
	//  173  330:putfield        #288 <Field float mDrawerElevation>
		mNonDrawerViews = new ArrayList();
	//  174  333:aload_0         
	//  175  334:new             #290 <Class ArrayList>
	//  176  337:dup             
	//  177  338:invokespecial   #291 <Method void ArrayList()>
	//  178  341:putfield        #293 <Field ArrayList mNonDrawerViews>
		return;
	//  179  344:return          
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
	//    5    7:ldc2            #297 <String "LEFT">
	//    6   10:areturn         
		if((i & 5) == 5)
	//*   7   11:iload_0         
	//*   8   12:iconst_5        
	//*   9   13:iand            
	//*  10   14:iconst_5        
	//*  11   15:icmpne          22
			return "RIGHT";
	//   12   18:ldc2            #299 <String "RIGHT">
	//   13   21:areturn         
		else
			return Integer.toHexString(i);
	//   14   22:iload_0         
	//   15   23:invokestatic    #304 <Method String Integer.toHexString(int)>
	//   16   26:areturn         
	}

	private static boolean hasOpaqueBackground(View view)
	{
		view = ((View) (view.getBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #311 <Method Drawable View.getBackground()>
	//    2    4:astore_0        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_1        
		if(view != null)
	//*   5    7:aload_0         
	//*   6    8:ifnull          23
		{
			if(((Drawable) (view)).getOpacity() == -1)
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #317 <Method int Drawable.getOpacity()>
	//*   9   15:iconst_m1       
	//*  10   16:icmpne          21
				flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_1        
			return flag;
	//   13   21:iload_1         
	//   14   22:ireturn         
		} else
		{
			return false;
	//   15   23:iconst_0        
	//   16   24:ireturn         
		}
	}

	private boolean hasPeekingDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method int getChildCount()>
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
	//*  10   14:invokevirtual   #326 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//*  13   23:getfield        #333 <Field boolean DrawerLayout$LayoutParams.isPeeking>
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
	//    1    1:invokevirtual   #338 <Method View findVisibleDrawer()>
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
	//    1    1:invokestatic    #343 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    2    4:iconst_4        
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:invokestatic    #343 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    6   12:iconst_2        
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private boolean mirror(Drawable drawable, int i)
	{
		if(drawable != null && DrawableCompat.isAutoMirrored(drawable))
	//*   0    0:aload_1         
	//*   1    1:ifnull          22
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #351 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
	//*   4    8:ifne            14
	//*   5   11:goto            22
		{
			DrawableCompat.setLayoutDirection(drawable, i);
	//    6   14:aload_1         
	//    7   15:iload_2         
	//    8   16:invokestatic    #354 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
	//    9   19:pop             
			return true;
	//   10   20:iconst_1        
	//   11   21:ireturn         
		} else
		{
			return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
		}
	}

	private Drawable resolveLeftShadow()
	{
		int i = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(mShadowStart != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #177 <Field Drawable mShadowStart>
	//*   7   13:ifnull          53
			{
				mirror(mShadowStart, i);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #177 <Field Drawable mShadowStart>
	//   11   21:iload_1         
	//   12   22:invokespecial   #360 <Method boolean mirror(Drawable, int)>
	//   13   25:pop             
				return mShadowStart;
	//   14   26:aload_0         
	//   15   27:getfield        #177 <Field Drawable mShadowStart>
	//   16   30:areturn         
			}
		} else
		if(mShadowEnd != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #179 <Field Drawable mShadowEnd>
	//*  19   35:ifnull          53
		{
			mirror(mShadowEnd, i);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #179 <Field Drawable mShadowEnd>
	//   23   43:iload_1         
	//   24   44:invokespecial   #360 <Method boolean mirror(Drawable, int)>
	//   25   47:pop             
			return mShadowEnd;
	//   26   48:aload_0         
	//   27   49:getfield        #179 <Field Drawable mShadowEnd>
	//   28   52:areturn         
		}
		return mShadowLeft;
	//   29   53:aload_0         
	//   30   54:getfield        #181 <Field Drawable mShadowLeft>
	//   31   57:areturn         
	}

	private Drawable resolveRightShadow()
	{
		int i = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(mShadowEnd != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #179 <Field Drawable mShadowEnd>
	//*   7   13:ifnull          53
			{
				mirror(mShadowEnd, i);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #179 <Field Drawable mShadowEnd>
	//   11   21:iload_1         
	//   12   22:invokespecial   #360 <Method boolean mirror(Drawable, int)>
	//   13   25:pop             
				return mShadowEnd;
	//   14   26:aload_0         
	//   15   27:getfield        #179 <Field Drawable mShadowEnd>
	//   16   30:areturn         
			}
		} else
		if(mShadowStart != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #177 <Field Drawable mShadowStart>
	//*  19   35:ifnull          53
		{
			mirror(mShadowStart, i);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #177 <Field Drawable mShadowStart>
	//   23   43:iload_1         
	//   24   44:invokespecial   #360 <Method boolean mirror(Drawable, int)>
	//   25   47:pop             
			return mShadowStart;
	//   26   48:aload_0         
	//   27   49:getfield        #177 <Field Drawable mShadowStart>
	//   28   52:areturn         
		}
		return mShadowRight;
	//   29   53:aload_0         
	//   30   54:getfield        #183 <Field Drawable mShadowRight>
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
	//    5    9:invokespecial   #364 <Method Drawable resolveLeftShadow()>
	//    6   12:putfield        #366 <Field Drawable mShadowLeftResolved>
			mShadowRightResolved = resolveRightShadow();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #368 <Method Drawable resolveRightShadow()>
	//   10   20:putfield        #370 <Field Drawable mShadowRightResolved>
			return;
	//   11   23:return          
		}
	}

	private void updateChildrenImportantForAccessibility(View view, boolean flag)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method int getChildCount()>
	//    2    4:istore          4
		for(int i = 0; i < j; i++)
	//*   3    6:iconst_0        
	//*   4    7:istore_3        
	//*   5    8:iload_3         
	//*   6    9:iload           4
	//*   7   11:icmpge          66
		{
			View view1 = getChildAt(i);
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:invokevirtual   #326 <Method View getChildAt(int)>
	//   11   19:astore          5
			if(!flag && !isDrawerView(view1) || flag && view1 == view)
	//*  12   21:iload_2         
	//*  13   22:ifne            34
	//*  14   25:aload_0         
	//*  15   26:aload           5
	//*  16   28:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*  17   31:ifeq            44
	//*  18   34:iload_2         
	//*  19   35:ifeq            53
	//*  20   38:aload           5
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       53
				ViewCompat.setImportantForAccessibility(view1, 1);
	//   23   44:aload           5
	//   24   46:iconst_1        
	//   25   47:invokestatic    #246 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			else
	//*  26   50:goto            59
				ViewCompat.setImportantForAccessibility(view1, 4);
	//   27   53:aload           5
	//   28   55:iconst_4        
	//   29   56:invokestatic    #246 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		}

	//   30   59:iload_3         
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:istore_3        
	//*  34   63:goto            8
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
	//*   4    6:getfield        #379 <Field List mListeners>
	//*   5    9:ifnonnull       23
			mListeners = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #290 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #291 <Method void ArrayList()>
	//   10   20:putfield        #379 <Field List mListeners>
		mListeners.add(((Object) (drawerlistener)));
	//   11   23:aload_0         
	//   12   24:getfield        #379 <Field List mListeners>
	//   13   27:aload_1         
	//   14   28:invokeinterface #385 <Method boolean List.add(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		if(getDescendantFocusability() == 0x60000)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #390 <Method int getDescendantFocusability()>
	//*   2    4:ldc2            #391 <Int 0x60000>
	//*   3    7:icmpne          11
			return;
	//    4   10:return          
		int k1 = getChildCount();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #322 <Method int getChildCount()>
	//    7   15:istore          7
		boolean flag = false;
	//    8   17:iconst_0        
	//    9   18:istore          6
		int k = 0;
	//   10   20:iconst_0        
	//   11   21:istore          4
		int i1 = k;
	//   12   23:iload           4
	//   13   25:istore          5
		for(; k < k1; k++)
	//*  14   27:iload           4
	//*  15   29:iload           7
	//*  16   31:icmpge          93
		{
			View view = getChildAt(k);
	//   17   34:aload_0         
	//   18   35:iload           4
	//   19   37:invokevirtual   #326 <Method View getChildAt(int)>
	//   20   40:astore          8
			if(isDrawerView(view))
	//*  21   42:aload_0         
	//*  22   43:aload           8
	//*  23   45:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*  24   48:ifeq            74
			{
				if(isDrawerOpen(view))
	//*  25   51:aload_0         
	//*  26   52:aload           8
	//*  27   54:invokevirtual   #394 <Method boolean isDrawerOpen(View)>
	//*  28   57:ifeq            84
				{
					view.addFocusables(arraylist, i, j);
	//   29   60:aload           8
	//   30   62:aload_1         
	//   31   63:iload_2         
	//   32   64:iload_3         
	//   33   65:invokevirtual   #396 <Method void View.addFocusables(ArrayList, int, int)>
					i1 = 1;
	//   34   68:iconst_1        
	//   35   69:istore          5
				}
			} else
	//*  36   71:goto            84
			{
				mNonDrawerViews.add(((Object) (view)));
	//   37   74:aload_0         
	//   38   75:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   39   78:aload           8
	//   40   80:invokevirtual   #397 <Method boolean ArrayList.add(Object)>
	//   41   83:pop             
			}
		}

	//   42   84:iload           4
	//   43   86:iconst_1        
	//   44   87:iadd            
	//   45   88:istore          4
	//*  46   90:goto            27
		if(i1 == 0)
	//*  47   93:iload           5
	//*  48   95:ifne            157
		{
			int j1 = mNonDrawerViews.size();
	//   49   98:aload_0         
	//   50   99:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   51  102:invokevirtual   #400 <Method int ArrayList.size()>
	//   52  105:istore          5
			for(int l = ((int) (flag)); l < j1; l++)
	//*  53  107:iload           6
	//*  54  109:istore          4
	//*  55  111:iload           4
	//*  56  113:iload           5
	//*  57  115:icmpge          157
			{
				View view1 = (View)mNonDrawerViews.get(l);
	//   58  118:aload_0         
	//   59  119:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   60  122:iload           4
	//   61  124:invokevirtual   #404 <Method Object ArrayList.get(int)>
	//   62  127:checkcast       #307 <Class View>
	//   63  130:astore          8
				if(view1.getVisibility() == 0)
	//*  64  132:aload           8
	//*  65  134:invokevirtual   #407 <Method int View.getVisibility()>
	//*  66  137:ifne            148
					view1.addFocusables(arraylist, i, j);
	//   67  140:aload           8
	//   68  142:aload_1         
	//   69  143:iload_2         
	//   70  144:iload_3         
	//   71  145:invokevirtual   #396 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   72  148:iload           4
	//   73  150:iconst_1        
	//   74  151:iadd            
	//   75  152:istore          4
		}
	//*  76  154:goto            111
		mNonDrawerViews.clear();
	//   77  157:aload_0         
	//   78  158:getfield        #293 <Field ArrayList mNonDrawerViews>
	//   79  161:invokevirtual   #410 <Method void ArrayList.clear()>
	//   80  164:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #416 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(findOpenDrawer() == null && !isDrawerView(view))
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #419 <Method View findOpenDrawer()>
	//*   7   11:ifnonnull       33
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*  11   19:ifeq            25
	//*  12   22:goto            33
			ViewCompat.setImportantForAccessibility(view, 1);
	//   13   25:aload_1         
	//   14   26:iconst_1        
	//   15   27:invokestatic    #246 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		else
	//*  16   30:goto            38
			ViewCompat.setImportantForAccessibility(view, 4);
	//   17   33:aload_1         
	//   18   34:iconst_4        
	//   19   35:invokestatic    #246 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		if(!CAN_HIDE_DESCENDANTS)
	//*  20   38:getstatic       #140 <Field boolean CAN_HIDE_DESCENDANTS>
	//*  21   41:ifne            52
			ViewCompat.setAccessibilityDelegate(view, ((AccessibilityDelegateCompat) (mChildAccessibilityDelegate)));
	//   22   44:aload_1         
	//   23   45:aload_0         
	//   24   46:getfield        #158 <Field DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate>
	//   25   49:invokestatic    #253 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   26   52:return          
	}

	void cancelChildViewTouch()
	{
		if(!mChildrenCanceledTouch)
	//*   0    0:aload_0         
	//*   1    1:getfield        #422 <Field boolean mChildrenCanceledTouch>
	//*   2    4:ifne            62
		{
			long l = SystemClock.uptimeMillis();
	//    3    7:invokestatic    #428 <Method long SystemClock.uptimeMillis()>
	//    4   10:lstore_3        
			MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//    5   11:lload_3         
	//    6   12:lload_3         
	//    7   13:iconst_3        
	//    8   14:fconst_0        
	//    9   15:fconst_0        
	//   10   16:iconst_0        
	//   11   17:invokestatic    #434 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   12   20:astore          5
			int j = getChildCount();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #322 <Method int getChildCount()>
	//   15   26:istore_2        
			for(int i = 0; i < j; i++)
	//*  16   27:iconst_0        
	//*  17   28:istore_1        
	//*  18   29:iload_1         
	//*  19   30:iload_2         
	//*  20   31:icmpge          52
				getChildAt(i).dispatchTouchEvent(motionevent);
	//   21   34:aload_0         
	//   22   35:iload_1         
	//   23   36:invokevirtual   #326 <Method View getChildAt(int)>
	//   24   39:aload           5
	//   25   41:invokevirtual   #438 <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//   26   44:pop             

	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_1        
	//*  31   49:goto            29
			motionevent.recycle();
	//   32   52:aload           5
	//   33   54:invokevirtual   #439 <Method void MotionEvent.recycle()>
			mChildrenCanceledTouch = true;
	//   34   57:aload_0         
	//   35   58:iconst_1        
	//   36   59:putfield        #422 <Field boolean mChildrenCanceledTouch>
		}
	//   37   62:return          
	}

	boolean checkDrawerViewAbsoluteGravity(View view, int i)
	{
		return (getDrawerViewAbsoluteGravity(view) & i) == i;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #444 <Method int getDrawerViewAbsoluteGravity(View)>
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
	//    5    9:invokespecial   #448 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    3    3:invokevirtual   #452 <Method void closeDrawer(int, boolean)>
	//    4    6:return          
	}

	public void closeDrawer(int i, boolean flag)
	{
		Object obj = ((Object) (findDrawerWithGravity(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #455 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       47
		{
			obj = ((Object) (new StringBuilder()));
	//    6   10:new             #457 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #458 <Method void StringBuilder()>
	//    9   17:astore_3        
			((StringBuilder) (obj)).append("No drawer view found with gravity ");
	//   10   18:aload_3         
	//   11   19:ldc2            #460 <String "No drawer view found with gravity ">
	//   12   22:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			((StringBuilder) (obj)).append(gravityToString(i));
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokestatic    #466 <Method String gravityToString(int)>
	//   17   31:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   19   35:new             #468 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			closeDrawer(((View) (obj)), flag);
	//   25   47:aload_0         
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:invokevirtual   #477 <Method void closeDrawer(View, boolean)>
			return;
	//   29   53:return          
		}
	}

	public void closeDrawer(View view)
	{
		closeDrawer(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #477 <Method void closeDrawer(View, boolean)>
	//    4    6:return          
	}

	public void closeDrawer(View view, boolean flag)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #457 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #458 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("View ");
	//    8   16:aload_3         
	//    9   17:ldc2            #480 <String "View ">
	//   10   20:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   16   30:aload_3         
	//   17   31:ldc2            #485 <String " is not a sliding drawer">
	//   18   34:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #468 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_3         
	//   23   43:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   54:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   29   57:astore_3        
		if(mFirstLayout)
	//*  30   58:aload_0         
	//*  31   59:getfield        #167 <Field boolean mFirstLayout>
	//*  32   62:ifeq            78
		{
			layoutparams.onScreen = 0.0F;
	//   33   65:aload_3         
	//   34   66:fconst_0        
	//   35   67:putfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
			layoutparams.openState = 0;
	//   36   70:aload_3         
	//   37   71:iconst_0        
	//   38   72:putfield        #491 <Field int DrawerLayout$LayoutParams.openState>
		} else
	//*  39   75:goto            163
		if(flag)
	//*  40   78:iload_2         
	//*  41   79:ifeq            142
		{
			layoutparams.openState = layoutparams.openState | 4;
	//   42   82:aload_3         
	//   43   83:aload_3         
	//   44   84:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
	//   45   87:iconst_4        
	//   46   88:ior             
	//   47   89:putfield        #491 <Field int DrawerLayout$LayoutParams.openState>
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  48   92:aload_0         
	//*  49   93:aload_1         
	//*  50   94:iconst_3        
	//*  51   95:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  52   98:ifeq            122
				mLeftDragger.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
	//   53  101:aload_0         
	//   54  102:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   55  105:aload_1         
	//   56  106:aload_1         
	//   57  107:invokevirtual   #496 <Method int View.getWidth()>
	//   58  110:ineg            
	//   59  111:aload_1         
	//   60  112:invokevirtual   #499 <Method int View.getTop()>
	//   61  115:invokevirtual   #503 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   62  118:pop             
			else
	//*  63  119:goto            163
				mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
	//   64  122:aload_0         
	//   65  123:getfield        #236 <Field ViewDragHelper mRightDragger>
	//   66  126:aload_1         
	//   67  127:aload_0         
	//   68  128:invokevirtual   #504 <Method int getWidth()>
	//   69  131:aload_1         
	//   70  132:invokevirtual   #499 <Method int View.getTop()>
	//   71  135:invokevirtual   #503 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   72  138:pop             
		} else
	//*  73  139:goto            163
		{
			moveDrawerToOffset(view, 0.0F);
	//   74  142:aload_0         
	//   75  143:aload_1         
	//   76  144:fconst_0        
	//   77  145:invokevirtual   #508 <Method void moveDrawerToOffset(View, float)>
			updateDrawerState(layoutparams.gravity, 0, view);
	//   78  148:aload_0         
	//   79  149:aload_3         
	//   80  150:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//   81  153:iconst_0        
	//   82  154:aload_1         
	//   83  155:invokevirtual   #515 <Method void updateDrawerState(int, int, View)>
			view.setVisibility(4);
	//   84  158:aload_1         
	//   85  159:iconst_4        
	//   86  160:invokevirtual   #518 <Method void View.setVisibility(int)>
		}
		invalidate();
	//   87  163:aload_0         
	//   88  164:invokevirtual   #521 <Method void invalidate()>
	//   89  167:return          
	}

	public void closeDrawers()
	{
		closeDrawers(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #524 <Method void closeDrawers(boolean)>
	//    3    5:return          
	}

	void closeDrawers(boolean flag)
	{
		int l = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method int getChildCount()>
	//    2    4:istore          5
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i;
		int k;
		for(i = j; j < l; i = k)
	//*   5    8:iload_3         
	//*   6    9:istore_2        
	//*   7   10:iload_3         
	//*   8   11:iload           5
	//*   9   13:icmpge          143
		{
			View view = getChildAt(j);
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #326 <Method View getChildAt(int)>
	//   13   21:astore          6
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   14   23:aload           6
	//   15   25:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   28:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   17   31:astore          7
			k = i;
	//   18   33:iload_2         
	//   19   34:istore          4
			if(isDrawerView(view))
	//*  20   36:aload_0         
	//*  21   37:aload           6
	//*  22   39:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*  23   42:ifeq            133
				if(flag && !layoutparams.isPeeking)
	//*  24   45:iload_1         
	//*  25   46:ifeq            63
	//*  26   49:aload           7
	//*  27   51:getfield        #333 <Field boolean DrawerLayout$LayoutParams.isPeeking>
	//*  28   54:ifne            63
				{
					k = i;
	//   29   57:iload_2         
	//   30   58:istore          4
				} else
	//*  31   60:goto            133
				{
					k = view.getWidth();
	//   32   63:aload           6
	//   33   65:invokevirtual   #496 <Method int View.getWidth()>
	//   34   68:istore          4
					if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  35   70:aload_0         
	//*  36   71:aload           6
	//*  37   73:iconst_3        
	//*  38   74:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  39   77:ifeq            103
						i |= ((int) (mLeftDragger.smoothSlideViewTo(view, -k, view.getTop())));
	//   40   80:iload_2         
	//   41   81:aload_0         
	//   42   82:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   43   85:aload           6
	//   44   87:iload           4
	//   45   89:ineg            
	//   46   90:aload           6
	//   47   92:invokevirtual   #499 <Method int View.getTop()>
	//   48   95:invokevirtual   #503 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   49   98:ior             
	//   50   99:istore_2        
					else
	//*  51  100:goto            124
						i |= ((int) (mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop())));
	//   52  103:iload_2         
	//   53  104:aload_0         
	//   54  105:getfield        #236 <Field ViewDragHelper mRightDragger>
	//   55  108:aload           6
	//   56  110:aload_0         
	//   57  111:invokevirtual   #504 <Method int getWidth()>
	//   58  114:aload           6
	//   59  116:invokevirtual   #499 <Method int View.getTop()>
	//   60  119:invokevirtual   #503 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   61  122:ior             
	//   62  123:istore_2        
					layoutparams.isPeeking = false;
	//   63  124:aload           7
	//   64  126:iconst_0        
	//   65  127:putfield        #333 <Field boolean DrawerLayout$LayoutParams.isPeeking>
					k = i;
	//   66  130:iload_2         
	//   67  131:istore          4
				}
			j++;
	//   68  133:iload_3         
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:istore_3        
		}

	//   72  137:iload           4
	//   73  139:istore_2        
	//*  74  140:goto            10
		mLeftCallback.removeCallbacks();
	//   75  143:aload_0         
	//   76  144:getfield        #213 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   77  147:invokevirtual   #527 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		mRightCallback.removeCallbacks();
	//   78  150:aload_0         
	//   79  151:getfield        #215 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   80  154:invokevirtual   #527 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		if(i != 0)
	//*  81  157:iload_2         
	//*  82  158:ifeq            165
			invalidate();
	//   83  161:aload_0         
	//   84  162:invokevirtual   #521 <Method void invalidate()>
	//   85  165:return          
	}

	public void computeScroll()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #322 <Method int getChildCount()>
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
	//   13   17:invokevirtual   #326 <Method View getChildAt(int)>
	//   14   20:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   15   23:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   16   26:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//   17   29:invokestatic    #534 <Method float Math.max(float, float)>
	//   18   32:fstore_1        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            9
		mScrimOpacity = f;
	//   24   40:aload_0         
	//   25   41:fload_1         
	//   26   42:putfield        #536 <Field float mScrimOpacity>
		boolean flag = mLeftDragger.continueSettling(true);
	//   27   45:aload_0         
	//   28   46:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   29   49:iconst_1        
	//   30   50:invokevirtual   #540 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//   31   53:istore          4
		boolean flag1 = mRightDragger.continueSettling(true);
	//   32   55:aload_0         
	//   33   56:getfield        #236 <Field ViewDragHelper mRightDragger>
	//   34   59:iconst_1        
	//   35   60:invokevirtual   #540 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//   36   63:istore          5
		if(flag || flag1)
	//*  37   65:iload           4
	//*  38   67:ifne            75
	//*  39   70:iload           5
	//*  40   72:ifeq            79
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   41   75:aload_0         
	//   42   76:invokestatic    #543 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   43   79:return          
	}

	void dispatchOnDrawerClosed(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.openState & 1) == 1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:iconst_1        
	//*   9   15:icmpne          100
		{
			layoutparams.openState = 0;
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:putfield        #491 <Field int DrawerLayout$LayoutParams.openState>
			if(mListeners != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #379 <Field List mListeners>
	//*  15   27:ifnull          72
			{
				for(int i = mListeners.size() - 1; i >= 0; i--)
	//*  16   30:aload_0         
	//*  17   31:getfield        #379 <Field List mListeners>
	//*  18   34:invokeinterface #545 <Method int List.size()>
	//*  19   39:iconst_1        
	//*  20   40:isub            
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iflt            72
					((DrawerListener)mListeners.get(i)).onDrawerClosed(view);
	//   24   46:aload_0         
	//   25   47:getfield        #379 <Field List mListeners>
	//   26   50:iload_2         
	//   27   51:invokeinterface #546 <Method Object List.get(int)>
	//   28   56:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//   29   59:aload_1         
	//   30   60:invokeinterface #549 <Method void DrawerLayout$DrawerListener.onDrawerClosed(View)>

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
	//   39   75:invokespecial   #551 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  40   78:aload_0         
	//*  41   79:invokevirtual   #554 <Method boolean hasWindowFocus()>
	//*  42   82:ifeq            100
			{
				view = getRootView();
	//   43   85:aload_0         
	//   44   86:invokevirtual   #557 <Method View getRootView()>
	//   45   89:astore_1        
				if(view != null)
	//*  46   90:aload_1         
	//*  47   91:ifnull          100
					view.sendAccessibilityEvent(32);
	//   48   94:aload_1         
	//   49   95:bipush          32
	//   50   97:invokevirtual   #560 <Method void View.sendAccessibilityEvent(int)>
			}
		}
	//   51  100:return          
	}

	void dispatchOnDrawerOpened(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.openState & 1) == 0)
	//*   4    8:aload_3         
	//*   5    9:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:ifne            90
		{
			layoutparams.openState = 1;
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:putfield        #491 <Field int DrawerLayout$LayoutParams.openState>
			if(mListeners != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #379 <Field List mListeners>
	//*  14   26:ifnull          71
			{
				for(int i = mListeners.size() - 1; i >= 0; i--)
	//*  15   29:aload_0         
	//*  16   30:getfield        #379 <Field List mListeners>
	//*  17   33:invokeinterface #545 <Method int List.size()>
	//*  18   38:iconst_1        
	//*  19   39:isub            
	//*  20   40:istore_2        
	//*  21   41:iload_2         
	//*  22   42:iflt            71
					((DrawerListener)mListeners.get(i)).onDrawerOpened(view);
	//   23   45:aload_0         
	//   24   46:getfield        #379 <Field List mListeners>
	//   25   49:iload_2         
	//   26   50:invokeinterface #546 <Method Object List.get(int)>
	//   27   55:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//   28   58:aload_1         
	//   29   59:invokeinterface #564 <Method void DrawerLayout$DrawerListener.onDrawerOpened(View)>

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
	//   38   74:invokespecial   #551 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  39   77:aload_0         
	//*  40   78:invokevirtual   #554 <Method boolean hasWindowFocus()>
	//*  41   81:ifeq            90
				sendAccessibilityEvent(32);
	//   42   84:aload_0         
	//   43   85:bipush          32
	//   44   87:invokevirtual   #565 <Method void sendAccessibilityEvent(int)>
		}
	//   45   90:return          
	}

	void dispatchOnDrawerSlide(View view, float f)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #379 <Field List mListeners>
	//*   2    4:ifnull          50
		{
			for(int i = mListeners.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #379 <Field List mListeners>
	//*   5   11:invokeinterface #545 <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_3        
	//*   9   19:iload_3         
	//*  10   20:iflt            50
				((DrawerListener)mListeners.get(i)).onDrawerSlide(view, f);
	//   11   23:aload_0         
	//   12   24:getfield        #379 <Field List mListeners>
	//   13   27:iload_3         
	//   14   28:invokeinterface #546 <Method Object List.get(int)>
	//   15   33:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//   16   36:aload_1         
	//   17   37:fload_2         
	//   18   38:invokeinterface #569 <Method void DrawerLayout$DrawerListener.onDrawerSlide(View, float)>

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
		int k4 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #574 <Method int getHeight()>
	//    2    4:istore          13
		boolean flag = isContentView(view);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #577 <Method boolean isContentView(View)>
	//    6   11:istore          15
		int i = getWidth();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #504 <Method int getWidth()>
	//    9   17:istore          6
		int j4 = canvas.save();
	//   10   19:aload_1         
	//   11   20:invokevirtual   #582 <Method int Canvas.save()>
	//   12   23:istore          12
		int i1;
		if(flag)
	//*  13   25:iload           15
	//*  14   27:ifeq            249
		{
			int l4 = getChildCount();
	//   15   30:aload_0         
	//   16   31:invokevirtual   #322 <Method int getChildCount()>
	//   17   34:istore          14
			int l1 = 0;
	//   18   36:iconst_0        
	//   19   37:istore          8
			i1 = l1;
	//   20   39:iload           8
	//   21   41:istore          7
			while(l1 < l4) 
	//*  22   43:iload           8
	//*  23   45:iload           14
	//*  24   47:icmpge          232
			{
				View view1 = getChildAt(l1);
	//   25   50:aload_0         
	//   26   51:iload           8
	//   27   53:invokevirtual   #326 <Method View getChildAt(int)>
	//   28   56:astore          17
				int l2 = i1;
	//   29   58:iload           7
	//   30   60:istore          9
				int k3 = i;
	//   31   62:iload           6
	//   32   64:istore          10
				if(view1 != view)
	//*  33   66:aload           17
	//*  34   68:aload_2         
	//*  35   69:if_acmpeq       215
				{
					l2 = i1;
	//   36   72:iload           7
	//   37   74:istore          9
					k3 = i;
	//   38   76:iload           6
	//   39   78:istore          10
					if(view1.getVisibility() == 0)
	//*  40   80:aload           17
	//*  41   82:invokevirtual   #407 <Method int View.getVisibility()>
	//*  42   85:ifne            215
					{
						l2 = i1;
	//   43   88:iload           7
	//   44   90:istore          9
						k3 = i;
	//   45   92:iload           6
	//   46   94:istore          10
						if(hasOpaqueBackground(view1))
	//*  47   96:aload           17
	//*  48   98:invokestatic    #584 <Method boolean hasOpaqueBackground(View)>
	//*  49  101:ifeq            215
						{
							l2 = i1;
	//   50  104:iload           7
	//   51  106:istore          9
							k3 = i;
	//   52  108:iload           6
	//   53  110:istore          10
							if(isDrawerView(view1))
	//*  54  112:aload_0         
	//*  55  113:aload           17
	//*  56  115:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*  57  118:ifeq            215
								if(view1.getHeight() < k4)
	//*  58  121:aload           17
	//*  59  123:invokevirtual   #585 <Method int View.getHeight()>
	//*  60  126:iload           13
	//*  61  128:icmpge          142
								{
									l2 = i1;
	//   62  131:iload           7
	//   63  133:istore          9
									k3 = i;
	//   64  135:iload           6
	//   65  137:istore          10
								} else
	//*  66  139:goto            215
								if(checkDrawerViewAbsoluteGravity(view1, 3))
	//*  67  142:aload_0         
	//*  68  143:aload           17
	//*  69  145:iconst_3        
	//*  70  146:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  71  149:ifeq            185
								{
									int l3 = view1.getRight();
	//   72  152:aload           17
	//   73  154:invokevirtual   #588 <Method int View.getRight()>
	//   74  157:istore          11
									l2 = i1;
	//   75  159:iload           7
	//   76  161:istore          9
									k3 = i;
	//   77  163:iload           6
	//   78  165:istore          10
									if(l3 > i1)
	//*  79  167:iload           11
	//*  80  169:iload           7
	//*  81  171:icmple          215
									{
										l2 = l3;
	//   82  174:iload           11
	//   83  176:istore          9
										k3 = i;
	//   84  178:iload           6
	//   85  180:istore          10
									}
								} else
	//*  86  182:goto            215
								{
									int i4 = view1.getLeft();
	//   87  185:aload           17
	//   88  187:invokevirtual   #591 <Method int View.getLeft()>
	//   89  190:istore          11
									l2 = i1;
	//   90  192:iload           7
	//   91  194:istore          9
									k3 = i;
	//   92  196:iload           6
	//   93  198:istore          10
									if(i4 < i)
	//*  94  200:iload           11
	//*  95  202:iload           6
	//*  96  204:icmpge          215
									{
										k3 = i4;
	//   97  207:iload           11
	//   98  209:istore          10
										l2 = i1;
	//   99  211:iload           7
	//  100  213:istore          9
									}
								}
						}
					}
				}
				l1++;
	//  101  215:iload           8
	//  102  217:iconst_1        
	//  103  218:iadd            
	//  104  219:istore          8
				i1 = l2;
	//  105  221:iload           9
	//  106  223:istore          7
				i = k3;
	//  107  225:iload           10
	//  108  227:istore          6
			}
	//* 109  229:goto            43
			canvas.clipRect(i1, 0, i, getHeight());
	//  110  232:aload_1         
	//  111  233:iload           7
	//  112  235:iconst_0        
	//  113  236:iload           6
	//  114  238:aload_0         
	//  115  239:invokevirtual   #574 <Method int getHeight()>
	//  116  242:invokevirtual   #595 <Method boolean Canvas.clipRect(int, int, int, int)>
	//  117  245:pop             
		} else
	//* 118  246:goto            252
		{
			i1 = 0;
	//  119  249:iconst_0        
	//  120  250:istore          7
		}
		boolean flag1 = super.drawChild(canvas, view, l);
	//  121  252:aload_0         
	//  122  253:aload_1         
	//  123  254:aload_2         
	//  124  255:lload_3         
	//  125  256:invokespecial   #597 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//  126  259:istore          16
		canvas.restoreToCount(j4);
	//  127  261:aload_1         
	//  128  262:iload           12
	//  129  264:invokevirtual   #600 <Method void Canvas.restoreToCount(int)>
		if(mScrimOpacity > 0.0F && flag)
	//* 130  267:aload_0         
	//* 131  268:getfield        #536 <Field float mScrimOpacity>
	//* 132  271:fconst_0        
	//* 133  272:fcmpl           
	//* 134  273:ifle            349
	//* 135  276:iload           15
	//* 136  278:ifeq            349
		{
			int i2 = (int)((float)((mScrimColor & 0xff000000) >>> 24) * mScrimOpacity);
	//  137  281:aload_0         
	//  138  282:getfield        #160 <Field int mScrimColor>
	//  139  285:ldc2            #601 <Int 0xff000000>
	//  140  288:iand            
	//  141  289:bipush          24
	//  142  291:iushr           
	//  143  292:i2f             
	//  144  293:aload_0         
	//  145  294:getfield        #536 <Field float mScrimOpacity>
	//  146  297:fmul            
	//  147  298:f2i             
	//  148  299:istore          8
			int i3 = mScrimColor;
	//  149  301:aload_0         
	//  150  302:getfield        #160 <Field int mScrimColor>
	//  151  305:istore          9
			mScrimPaint.setColor(i2 << 24 | i3 & 0xffffff);
	//  152  307:aload_0         
	//  153  308:getfield        #165 <Field Paint mScrimPaint>
	//  154  311:iload           8
	//  155  313:bipush          24
	//  156  315:ishl            
	//  157  316:iload           9
	//  158  318:ldc2            #602 <Int 0xffffff>
	//  159  321:iand            
	//  160  322:ior             
	//  161  323:invokevirtual   #605 <Method void Paint.setColor(int)>
			canvas.drawRect(i1, 0.0F, i, getHeight(), mScrimPaint);
	//  162  326:aload_1         
	//  163  327:iload           7
	//  164  329:i2f             
	//  165  330:fconst_0        
	//  166  331:iload           6
	//  167  333:i2f             
	//  168  334:aload_0         
	//  169  335:invokevirtual   #574 <Method int getHeight()>
	//  170  338:i2f             
	//  171  339:aload_0         
	//  172  340:getfield        #165 <Field Paint mScrimPaint>
	//  173  343:invokevirtual   #609 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			return flag1;
	//  174  346:iload           16
	//  175  348:ireturn         
		}
		if(mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3))
	//* 176  349:aload_0         
	//* 177  350:getfield        #366 <Field Drawable mShadowLeftResolved>
	//* 178  353:ifnull          453
	//* 179  356:aload_0         
	//* 180  357:aload_2         
	//* 181  358:iconst_3        
	//* 182  359:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 183  362:ifeq            453
		{
			int j = mShadowLeftResolved.getIntrinsicWidth();
	//  184  365:aload_0         
	//  185  366:getfield        #366 <Field Drawable mShadowLeftResolved>
	//  186  369:invokevirtual   #612 <Method int Drawable.getIntrinsicWidth()>
	//  187  372:istore          6
			int j1 = view.getRight();
	//  188  374:aload_2         
	//  189  375:invokevirtual   #588 <Method int View.getRight()>
	//  190  378:istore          7
			int j2 = mLeftDragger.getEdgeSize();
	//  191  380:aload_0         
	//  192  381:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//  193  384:invokevirtual   #615 <Method int ViewDragHelper.getEdgeSize()>
	//  194  387:istore          8
			float f = Math.max(0.0F, Math.min((float)j1 / (float)j2, 1.0F));
	//  195  389:fconst_0        
	//  196  390:iload           7
	//  197  392:i2f             
	//  198  393:iload           8
	//  199  395:i2f             
	//  200  396:fdiv            
	//  201  397:fconst_1        
	//  202  398:invokestatic    #618 <Method float Math.min(float, float)>
	//  203  401:invokestatic    #534 <Method float Math.max(float, float)>
	//  204  404:fstore          5
			mShadowLeftResolved.setBounds(j1, view.getTop(), j + j1, view.getBottom());
	//  205  406:aload_0         
	//  206  407:getfield        #366 <Field Drawable mShadowLeftResolved>
	//  207  410:iload           7
	//  208  412:aload_2         
	//  209  413:invokevirtual   #499 <Method int View.getTop()>
	//  210  416:iload           6
	//  211  418:iload           7
	//  212  420:iadd            
	//  213  421:aload_2         
	//  214  422:invokevirtual   #621 <Method int View.getBottom()>
	//  215  425:invokevirtual   #625 <Method void Drawable.setBounds(int, int, int, int)>
			mShadowLeftResolved.setAlpha((int)(255F * f));
	//  216  428:aload_0         
	//  217  429:getfield        #366 <Field Drawable mShadowLeftResolved>
	//  218  432:ldc2            #626 <Float 255F>
	//  219  435:fload           5
	//  220  437:fmul            
	//  221  438:f2i             
	//  222  439:invokevirtual   #629 <Method void Drawable.setAlpha(int)>
			mShadowLeftResolved.draw(canvas);
	//  223  442:aload_0         
	//  224  443:getfield        #366 <Field Drawable mShadowLeftResolved>
	//  225  446:aload_1         
	//  226  447:invokevirtual   #633 <Method void Drawable.draw(Canvas)>
			return flag1;
	//  227  450:iload           16
	//  228  452:ireturn         
		}
		if(mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5))
	//* 229  453:aload_0         
	//* 230  454:getfield        #370 <Field Drawable mShadowRightResolved>
	//* 231  457:ifnull          563
	//* 232  460:aload_0         
	//* 233  461:aload_2         
	//* 234  462:iconst_5        
	//* 235  463:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 236  466:ifeq            563
		{
			int k = mShadowRightResolved.getIntrinsicWidth();
	//  237  469:aload_0         
	//  238  470:getfield        #370 <Field Drawable mShadowRightResolved>
	//  239  473:invokevirtual   #612 <Method int Drawable.getIntrinsicWidth()>
	//  240  476:istore          6
			int k1 = view.getLeft();
	//  241  478:aload_2         
	//  242  479:invokevirtual   #591 <Method int View.getLeft()>
	//  243  482:istore          7
			int k2 = getWidth();
	//  244  484:aload_0         
	//  245  485:invokevirtual   #504 <Method int getWidth()>
	//  246  488:istore          8
			int j3 = mRightDragger.getEdgeSize();
	//  247  490:aload_0         
	//  248  491:getfield        #236 <Field ViewDragHelper mRightDragger>
	//  249  494:invokevirtual   #615 <Method int ViewDragHelper.getEdgeSize()>
	//  250  497:istore          9
			float f1 = Math.max(0.0F, Math.min((float)(k2 - k1) / (float)j3, 1.0F));
	//  251  499:fconst_0        
	//  252  500:iload           8
	//  253  502:iload           7
	//  254  504:isub            
	//  255  505:i2f             
	//  256  506:iload           9
	//  257  508:i2f             
	//  258  509:fdiv            
	//  259  510:fconst_1        
	//  260  511:invokestatic    #618 <Method float Math.min(float, float)>
	//  261  514:invokestatic    #534 <Method float Math.max(float, float)>
	//  262  517:fstore          5
			mShadowRightResolved.setBounds(k1 - k, view.getTop(), k1, view.getBottom());
	//  263  519:aload_0         
	//  264  520:getfield        #370 <Field Drawable mShadowRightResolved>
	//  265  523:iload           7
	//  266  525:iload           6
	//  267  527:isub            
	//  268  528:aload_2         
	//  269  529:invokevirtual   #499 <Method int View.getTop()>
	//  270  532:iload           7
	//  271  534:aload_2         
	//  272  535:invokevirtual   #621 <Method int View.getBottom()>
	//  273  538:invokevirtual   #625 <Method void Drawable.setBounds(int, int, int, int)>
			mShadowRightResolved.setAlpha((int)(255F * f1));
	//  274  541:aload_0         
	//  275  542:getfield        #370 <Field Drawable mShadowRightResolved>
	//  276  545:ldc2            #626 <Float 255F>
	//  277  548:fload           5
	//  278  550:fmul            
	//  279  551:f2i             
	//  280  552:invokevirtual   #629 <Method void Drawable.setAlpha(int)>
			mShadowRightResolved.draw(canvas);
	//  281  555:aload_0         
	//  282  556:getfield        #370 <Field Drawable mShadowRightResolved>
	//  283  559:aload_1         
	//  284  560:invokevirtual   #633 <Method void Drawable.draw(Canvas)>
		}
		return flag1;
	//  285  563:iload           16
	//  286  565:ireturn         
	}

	View findDrawerWithGravity(int i)
	{
		int j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #639 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_2        
		int k = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #322 <Method int getChildCount()>
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
	//   15   23:invokevirtual   #326 <Method View getChildAt(int)>
	//   16   26:astore          4
			if((getDrawerViewAbsoluteGravity(view) & 7) == (j & 7))
	//*  17   28:aload_0         
	//*  18   29:aload           4
	//*  19   31:invokevirtual   #444 <Method int getDrawerViewAbsoluteGravity(View)>
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
	//    1    1:invokevirtual   #322 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #326 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if((((LayoutParams)view.getLayoutParams()).openState & 1) == 1)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  14   22:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//*  15   25:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
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
	//    1    1:invokevirtual   #322 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #326 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(isDrawerView(view) && isDrawerVisible(view))
	//*  12   18:aload_0         
	//*  13   19:aload_3         
	//*  14   20:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*  15   23:ifeq            36
	//*  16   26:aload_0         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #642 <Method boolean isDrawerVisible(View)>
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
	//    4    6:invokespecial   #646 <Method void DrawerLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #20  <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #652 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #653 <Method void DrawerLayout$LayoutParams(Context, AttributeSet)>
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
	//    7   15:invokespecial   #657 <Method void DrawerLayout$LayoutParams(DrawerLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #659 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//   12   26:new             #20  <Class DrawerLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #659 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #662 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   18   38:new             #20  <Class DrawerLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #665 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public float getDrawerElevation()
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            11
			return mDrawerElevation;
	//    2    6:aload_0         
	//    3    7:getfield        #288 <Field float mDrawerElevation>
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
	//    1    1:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_2        
		if(i != 3)
	//*   3    5:iload_1         
	//*   4    6:iconst_3        
	//*   5    7:icmpeq          143
		{
			if(i != 5)
	//*   6   10:iload_1         
	//*   7   11:iconst_5        
	//*   8   12:icmpeq          106
			{
				if(i != 0x800003)
	//*   9   15:iload_1         
	//*  10   16:ldc2            #670 <Int 0x800003>
	//*  11   19:icmpeq          69
				{
					if(i == 0x800005)
	//*  12   22:iload_1         
	//*  13   23:ldc2            #671 <Int 0x800005>
	//*  14   26:icmpeq          32
	//*  15   29:goto            180
					{
						if(mLockModeEnd != 3)
	//*  16   32:aload_0         
	//*  17   33:getfield        #175 <Field int mLockModeEnd>
	//*  18   36:iconst_3        
	//*  19   37:icmpeq          45
							return mLockModeEnd;
	//   20   40:aload_0         
	//   21   41:getfield        #175 <Field int mLockModeEnd>
	//   22   44:ireturn         
						if(j == 0)
	//*  23   45:iload_2         
	//*  24   46:ifne            57
							i = mLockModeRight;
	//   25   49:aload_0         
	//   26   50:getfield        #171 <Field int mLockModeRight>
	//   27   53:istore_1        
						else
	//*  28   54:goto            62
							i = mLockModeLeft;
	//   29   57:aload_0         
	//   30   58:getfield        #169 <Field int mLockModeLeft>
	//   31   61:istore_1        
						if(i != 3)
	//*  32   62:iload_1         
	//*  33   63:iconst_3        
	//*  34   64:icmpeq          180
							return i;
	//   35   67:iload_1         
	//   36   68:ireturn         
					}
				} else
				{
					if(mLockModeStart != 3)
	//*  37   69:aload_0         
	//*  38   70:getfield        #173 <Field int mLockModeStart>
	//*  39   73:iconst_3        
	//*  40   74:icmpeq          82
						return mLockModeStart;
	//   41   77:aload_0         
	//   42   78:getfield        #173 <Field int mLockModeStart>
	//   43   81:ireturn         
					if(j == 0)
	//*  44   82:iload_2         
	//*  45   83:ifne            94
						i = mLockModeLeft;
	//   46   86:aload_0         
	//   47   87:getfield        #169 <Field int mLockModeLeft>
	//   48   90:istore_1        
					else
	//*  49   91:goto            99
						i = mLockModeRight;
	//   50   94:aload_0         
	//   51   95:getfield        #171 <Field int mLockModeRight>
	//   52   98:istore_1        
					if(i != 3)
	//*  53   99:iload_1         
	//*  54  100:iconst_3        
	//*  55  101:icmpeq          180
						return i;
	//   56  104:iload_1         
	//   57  105:ireturn         
				}
			} else
			{
				if(mLockModeRight != 3)
	//*  58  106:aload_0         
	//*  59  107:getfield        #171 <Field int mLockModeRight>
	//*  60  110:iconst_3        
	//*  61  111:icmpeq          119
					return mLockModeRight;
	//   62  114:aload_0         
	//   63  115:getfield        #171 <Field int mLockModeRight>
	//   64  118:ireturn         
				if(j == 0)
	//*  65  119:iload_2         
	//*  66  120:ifne            131
					i = mLockModeEnd;
	//   67  123:aload_0         
	//   68  124:getfield        #175 <Field int mLockModeEnd>
	//   69  127:istore_1        
				else
	//*  70  128:goto            136
					i = mLockModeStart;
	//   71  131:aload_0         
	//   72  132:getfield        #173 <Field int mLockModeStart>
	//   73  135:istore_1        
				if(i != 3)
	//*  74  136:iload_1         
	//*  75  137:iconst_3        
	//*  76  138:icmpeq          180
					return i;
	//   77  141:iload_1         
	//   78  142:ireturn         
			}
		} else
		{
			if(mLockModeLeft != 3)
	//*  79  143:aload_0         
	//*  80  144:getfield        #169 <Field int mLockModeLeft>
	//*  81  147:iconst_3        
	//*  82  148:icmpeq          156
				return mLockModeLeft;
	//   83  151:aload_0         
	//   84  152:getfield        #169 <Field int mLockModeLeft>
	//   85  155:ireturn         
			if(j == 0)
	//*  86  156:iload_2         
	//*  87  157:ifne            168
				i = mLockModeStart;
	//   88  160:aload_0         
	//   89  161:getfield        #173 <Field int mLockModeStart>
	//   90  164:istore_1        
			else
	//*  91  165:goto            173
				i = mLockModeEnd;
	//   92  168:aload_0         
	//   93  169:getfield        #175 <Field int mLockModeEnd>
	//   94  172:istore_1        
			if(i != 3)
	//*  95  173:iload_1         
	//*  96  174:iconst_3        
	//*  97  175:icmpeq          180
				return i;
	//   98  178:iload_1         
	//   99  179:ireturn         
		}
		return 0;
	//  100  180:iconst_0        
	//  101  181:ireturn         
	}

	public int getDrawerLockMode(View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #457 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #458 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("View ");
	//    8   16:aload_2         
	//    9   17:ldc2            #480 <String "View ">
	//   10   20:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a drawer");
	//   16   30:aload_2         
	//   17   31:ldc2            #673 <String " is not a drawer">
	//   18   34:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #468 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_2         
	//   23   43:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		} else
		{
			return getDrawerLockMode(((LayoutParams)view.getLayoutParams()).gravity);
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   29   55:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   30   58:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//   31   61:invokevirtual   #675 <Method int getDrawerLockMode(int)>
	//   32   64:ireturn         
		}
	}

	public CharSequence getDrawerTitle(int i)
	{
		i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #639 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_1        
		if(i == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          19
			return mTitleLeft;
	//    8   14:aload_0         
	//    9   15:getfield        #679 <Field CharSequence mTitleLeft>
	//   10   18:areturn         
		if(i == 5)
	//*  11   19:iload_1         
	//*  12   20:iconst_5        
	//*  13   21:icmpne          29
			return mTitleRight;
	//   14   24:aload_0         
	//   15   25:getfield        #681 <Field CharSequence mTitleRight>
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
	//    1    1:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_0         
	//    5   11:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #639 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    7   17:ireturn         
	}

	float getDrawerViewOffset(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).onScreen;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//    4   10:freturn         
	}

	public Drawable getStatusBarBackgroundDrawable()
	{
		return mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field Drawable mStatusBarBackground>
	//    2    4:areturn         
	}

	boolean isContentView(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).gravity == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
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
	//    2    2:invokevirtual   #455 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return isDrawerOpen(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #394 <Method boolean isDrawerOpen(View)>
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
	//*   2    2:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #457 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #458 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("View ");
	//    8   16:aload_2         
	//    9   17:ldc2            #480 <String "View ">
	//   10   20:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a drawer");
	//   16   30:aload_2         
	//   17   31:ldc2            #673 <String " is not a drawer">
	//   18   34:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #468 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_2         
	//   23   43:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
		return (((LayoutParams)view.getLayoutParams()).openState & 1) == 1;
	//   26   50:aload_1         
	//   27   51:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   54:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   29   57:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
	//   30   60:iconst_1        
	//   31   61:iand            
	//   32   62:iconst_1        
	//   33   63:icmpne          68
	//   34   66:iconst_1        
	//   35   67:ireturn         
	//   36   68:iconst_0        
	//   37   69:ireturn         
	}

	boolean isDrawerView(View view)
	{
		int i = GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).gravity, ViewCompat.getLayoutDirection(view));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_1         
	//    5   11:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #639 <Method int GravityCompat.getAbsoluteGravity(int, int)>
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
	//    2    2:invokevirtual   #455 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return isDrawerVisible(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #642 <Method boolean isDrawerVisible(View)>
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
	//*   2    2:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #457 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #458 <Method void StringBuilder()>
	//    7   15:astore_2        
			stringbuilder.append("View ");
	//    8   16:aload_2         
	//    9   17:ldc2            #480 <String "View ">
	//   10   20:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a drawer");
	//   16   30:aload_2         
	//   17   31:ldc2            #673 <String " is not a drawer">
	//   18   34:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #468 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_2         
	//   23   43:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
		return ((LayoutParams)view.getLayoutParams()).onScreen > 0.0F;
	//   26   50:aload_1         
	//   27   51:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   54:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   29   57:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//   30   60:fconst_0        
	//   31   61:fcmpl           
	//   32   62:ifle            67
	//   33   65:iconst_1        
	//   34   66:ireturn         
	//   35   67:iconst_0        
	//   36   68:ireturn         
	}

	void moveDrawerToOffset(View view, float f)
	{
		float f1 = getDrawerViewOffset(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #688 <Method float getDrawerViewOffset(View)>
	//    3    5:fstore_3        
		float f2 = view.getWidth();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #496 <Method int View.getWidth()>
	//    6   10:i2f             
	//    7   11:fstore          4
		int i = (int)(f1 * f2);
	//    8   13:fload_3         
	//    9   14:fload           4
	//   10   16:fmul            
	//   11   17:f2i             
	//   12   18:istore          5
		i = (int)(f2 * f) - i;
	//   13   20:fload           4
	//   14   22:fload_2         
	//   15   23:fmul            
	//   16   24:f2i             
	//   17   25:iload           5
	//   18   27:isub            
	//   19   28:istore          5
		if(!checkDrawerViewAbsoluteGravity(view, 3))
	//*  20   30:aload_0         
	//*  21   31:aload_1         
	//*  22   32:iconst_3        
	//*  23   33:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  24   36:ifeq            42
	//*  25   39:goto            47
			i = -i;
	//   26   42:iload           5
	//   27   44:ineg            
	//   28   45:istore          5
		view.offsetLeftAndRight(i);
	//   29   47:aload_1         
	//   30   48:iload           5
	//   31   50:invokevirtual   #691 <Method void View.offsetLeftAndRight(int)>
		setDrawerViewOffset(view, f);
	//   32   53:aload_0         
	//   33   54:aload_1         
	//   34   55:fload_2         
	//   35   56:invokevirtual   #694 <Method void setDrawerViewOffset(View, float)>
	//   36   59:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #697 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #167 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #700 <Method void ViewGroup.onDetachedFromWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #167 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #703 <Method void ViewGroup.onDraw(Canvas)>
		if(mDrawStatusBarBackground && mStatusBarBackground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #705 <Field boolean mDrawStatusBarBackground>
	//*   5    9:ifeq            76
	//*   6   12:aload_0         
	//*   7   13:getfield        #282 <Field Drawable mStatusBarBackground>
	//*   8   16:ifnull          76
		{
			int i;
			if(android.os.Build.VERSION.SDK_INT >= 21 && mLastInsets != null)
	//*   9   19:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   22:bipush          21
	//*  11   24:icmplt          48
	//*  12   27:aload_0         
	//*  13   28:getfield        #707 <Field Object mLastInsets>
	//*  14   31:ifnull          48
				i = ((WindowInsets)mLastInsets).getSystemWindowInsetTop();
	//   15   34:aload_0         
	//   16   35:getfield        #707 <Field Object mLastInsets>
	//   17   38:checkcast       #709 <Class WindowInsets>
	//   18   41:invokevirtual   #712 <Method int WindowInsets.getSystemWindowInsetTop()>
	//   19   44:istore_2        
			else
	//*  20   45:goto            50
				i = 0;
	//   21   48:iconst_0        
	//   22   49:istore_2        
			if(i > 0)
	//*  23   50:iload_2         
	//*  24   51:ifle            76
			{
				mStatusBarBackground.setBounds(0, 0, getWidth(), i);
	//   25   54:aload_0         
	//   26   55:getfield        #282 <Field Drawable mStatusBarBackground>
	//   27   58:iconst_0        
	//   28   59:iconst_0        
	//   29   60:aload_0         
	//   30   61:invokevirtual   #504 <Method int getWidth()>
	//   31   64:iload_2         
	//   32   65:invokevirtual   #625 <Method void Drawable.setBounds(int, int, int, int)>
				mStatusBarBackground.draw(canvas);
	//   33   68:aload_0         
	//   34   69:getfield        #282 <Field Drawable mStatusBarBackground>
	//   35   72:aload_1         
	//   36   73:invokevirtual   #633 <Method void Drawable.draw(Canvas)>
			}
		}
	//   37   76:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i;
		boolean flag2;
		boolean flag3;
		boolean flag4;
		i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #716 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		flag3 = mLeftDragger.shouldInterceptTouchEvent(motionevent);
	//    3    6:aload_0         
	//    4    7:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #719 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//    7   14:istore          7
		flag4 = mRightDragger.shouldInterceptTouchEvent(motionevent);
	//    8   16:aload_0         
	//    9   17:getfield        #236 <Field ViewDragHelper mRightDragger>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #719 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//   12   24:istore          8
		flag2 = true;
	//   13   26:iconst_1        
	//   14   27:istore          6
		i;
	//   15   29:iload           4
		JVM INSTR tableswitch 0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91;
	//   16   31:tableswitch     0 3: default 60
	//	               0 109
	//	               1 91
	//	               2 63
	//	               3 91
		   goto _L1 _L2 _L3 _L4 _L3
_L1:
		break; /* Loop/switch isn't completed */
	//   17   60:goto            184
_L4:
		if(mLeftDragger.checkTouchSlop(3))
	//*  18   63:aload_0         
	//*  19   64:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//*  20   67:iconst_3        
	//*  21   68:invokevirtual   #722 <Method boolean ViewDragHelper.checkTouchSlop(int)>
	//*  22   71:ifeq            184
		{
			mLeftCallback.removeCallbacks();
	//   23   74:aload_0         
	//   24   75:getfield        #213 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   25   78:invokevirtual   #527 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
			mRightCallback.removeCallbacks();
	//   26   81:aload_0         
	//   27   82:getfield        #215 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   28   85:invokevirtual   #527 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		}
		break; /* Loop/switch isn't completed */
	//   29   88:goto            184
_L3:
		closeDrawers(true);
	//   30   91:aload_0         
	//   31   92:iconst_1        
	//   32   93:invokevirtual   #524 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//   33   96:aload_0         
	//   34   97:iconst_0        
	//   35   98:putfield        #724 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//   36  101:aload_0         
	//   37  102:iconst_0        
	//   38  103:putfield        #422 <Field boolean mChildrenCanceledTouch>
		break; /* Loop/switch isn't completed */
	//   39  106:goto            184
_L2:
		float f;
		float f1;
		f = motionevent.getX();
	//   40  109:aload_1         
	//   41  110:invokevirtual   #727 <Method float MotionEvent.getX()>
	//   42  113:fstore_2        
		f1 = motionevent.getY();
	//   43  114:aload_1         
	//   44  115:invokevirtual   #730 <Method float MotionEvent.getY()>
	//   45  118:fstore_3        
		mInitialMotionX = f;
	//   46  119:aload_0         
	//   47  120:fload_2         
	//   48  121:putfield        #732 <Field float mInitialMotionX>
		mInitialMotionY = f1;
	//   49  124:aload_0         
	//   50  125:fload_3         
	//   51  126:putfield        #734 <Field float mInitialMotionY>
		if(mScrimOpacity <= 0.0F) goto _L6; else goto _L5
	//   52  129:aload_0         
	//   53  130:getfield        #536 <Field float mScrimOpacity>
	//   54  133:fconst_0        
	//   55  134:fcmpl           
	//   56  135:ifle            168
_L5:
		motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f, (int)f1)));
	//   57  138:aload_0         
	//   58  139:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   59  142:fload_2         
	//   60  143:f2i             
	//   61  144:fload_3         
	//   62  145:f2i             
	//   63  146:invokevirtual   #738 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   64  149:astore_1        
		if(motionevent == null || !isContentView(((View) (motionevent)))) goto _L6; else goto _L7
	//   65  150:aload_1         
	//   66  151:ifnull          168
	//   67  154:aload_0         
	//   68  155:aload_1         
	//   69  156:invokevirtual   #577 <Method boolean isContentView(View)>
	//   70  159:ifeq            168
_L7:
		boolean flag = true;
	//   71  162:iconst_1        
	//   72  163:istore          4
		  goto _L8
	//*  73  165:goto            171
_L6:
		flag = false;
	//   74  168:iconst_0        
	//   75  169:istore          4
_L8:
		mDisallowInterceptRequested = false;
	//   76  171:aload_0         
	//   77  172:iconst_0        
	//   78  173:putfield        #724 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//   79  176:aload_0         
	//   80  177:iconst_0        
	//   81  178:putfield        #422 <Field boolean mChildrenCanceledTouch>
		break MISSING_BLOCK_LABEL_187;
	//   82  181:goto            187
		flag = false;
	//   83  184:iconst_0        
	//   84  185:istore          4
		boolean flag1 = flag2;
	//   85  187:iload           6
	//   86  189:istore          5
		if(!(flag3 | flag4))
	//*  87  191:iload           7
	//*  88  193:iload           8
	//*  89  195:ior             
	//*  90  196:ifne            231
		{
			flag1 = flag2;
	//   91  199:iload           6
	//   92  201:istore          5
			if(!flag)
	//*  93  203:iload           4
	//*  94  205:ifne            231
			{
				flag1 = flag2;
	//   95  208:iload           6
	//   96  210:istore          5
				if(!hasPeekingDrawer())
	//*  97  212:aload_0         
	//*  98  213:invokespecial   #740 <Method boolean hasPeekingDrawer()>
	//*  99  216:ifne            231
				{
					if(mChildrenCanceledTouch)
	//* 100  219:aload_0         
	//* 101  220:getfield        #422 <Field boolean mChildrenCanceledTouch>
	//* 102  223:ifeq            228
						return true;
	//  103  226:iconst_1        
	//  104  227:ireturn         
					flag1 = false;
	//  105  228:iconst_0        
	//  106  229:istore          5
				}
			}
		}
		return flag1;
	//  107  231:iload           5
	//  108  233:ireturn         
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4 && hasVisibleDrawer())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          18
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #744 <Method boolean hasVisibleDrawer()>
	//*   5    9:ifeq            18
		{
			keyevent.startTracking();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #749 <Method void KeyEvent.startTracking()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #751 <Method boolean ViewGroup.onKeyDown(int, KeyEvent)>
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
	//    4    6:invokevirtual   #338 <Method View findVisibleDrawer()>
	//    5    9:astore_2        
			if(keyevent != null && getDrawerLockMode(((View) (keyevent))) == 0)
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
	//*   8   14:aload_0         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #754 <Method int getDrawerLockMode(View)>
	//*  11   19:ifne            26
				closeDrawers();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #756 <Method void closeDrawers()>
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
	//   23   37:invokespecial   #758 <Method boolean ViewGroup.onKeyUp(int, KeyEvent)>
	//   24   40:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		mInLayout = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #762 <Field boolean mInLayout>
		int k1 = k - i;
	//    3    5:iload           4
	//    4    7:iload_2         
	//    5    8:isub            
	//    6    9:istore          10
		int l1 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #322 <Method int getChildCount()>
	//    9   15:istore          11
		for(k = 0; k < l1; k++)
	//*  10   17:iconst_0        
	//*  11   18:istore          4
	//*  12   20:iload           4
	//*  13   22:iload           11
	//*  14   24:icmpge          442
		{
			View view = getChildAt(k);
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:invokevirtual   #326 <Method View getChildAt(int)>
	//   18   33:astore          15
			if(view.getVisibility() == 8)
	//*  19   35:aload           15
	//*  20   37:invokevirtual   #407 <Method int View.getVisibility()>
	//*  21   40:bipush          8
	//*  22   42:icmpne          48
				continue;
	//   23   45:goto            433
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   48:aload           15
	//   25   50:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   53:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   27   56:astore          16
			if(isContentView(view))
	//*  28   58:aload_0         
	//*  29   59:aload           15
	//*  30   61:invokevirtual   #577 <Method boolean isContentView(View)>
	//*  31   64:ifeq            107
			{
				view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
	//   32   67:aload           15
	//   33   69:aload           16
	//   34   71:getfield        #765 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   35   74:aload           16
	//   36   76:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//   37   79:aload           16
	//   38   81:getfield        #765 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   39   84:aload           15
	//   40   86:invokevirtual   #771 <Method int View.getMeasuredWidth()>
	//   41   89:iadd            
	//   42   90:aload           16
	//   43   92:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//   44   95:aload           15
	//   45   97:invokevirtual   #774 <Method int View.getMeasuredHeight()>
	//   46  100:iadd            
	//   47  101:invokevirtual   #777 <Method void View.layout(int, int, int, int)>
				continue;
	//   48  104:goto            433
			}
			int i2 = view.getMeasuredWidth();
	//   49  107:aload           15
	//   50  109:invokevirtual   #771 <Method int View.getMeasuredWidth()>
	//   51  112:istore          12
			int j2 = view.getMeasuredHeight();
	//   52  114:aload           15
	//   53  116:invokevirtual   #774 <Method int View.getMeasuredHeight()>
	//   54  119:istore          13
			float f;
			int i1;
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  55  121:aload_0         
	//*  56  122:aload           15
	//*  57  124:iconst_3        
	//*  58  125:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  59  128:ifeq            167
			{
				i = -i2;
	//   60  131:iload           12
	//   61  133:ineg            
	//   62  134:istore_2        
				f = i2;
	//   63  135:iload           12
	//   64  137:i2f             
	//   65  138:fstore          6
				i1 = i + (int)(layoutparams.onScreen * f);
	//   66  140:iload_2         
	//   67  141:aload           16
	//   68  143:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//   69  146:fload           6
	//   70  148:fmul            
	//   71  149:f2i             
	//   72  150:iadd            
	//   73  151:istore          7
				f = (float)(i2 + i1) / f;
	//   74  153:iload           12
	//   75  155:iload           7
	//   76  157:iadd            
	//   77  158:i2f             
	//   78  159:fload           6
	//   79  161:fdiv            
	//   80  162:fstore          6
			} else
	//*  81  164:goto            197
			{
				f = i2;
	//   82  167:iload           12
	//   83  169:i2f             
	//   84  170:fstore          6
				i1 = k1 - (int)(layoutparams.onScreen * f);
	//   85  172:iload           10
	//   86  174:aload           16
	//   87  176:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//   88  179:fload           6
	//   89  181:fmul            
	//   90  182:f2i             
	//   91  183:isub            
	//   92  184:istore          7
				f = (float)(k1 - i1) / f;
	//   93  186:iload           10
	//   94  188:iload           7
	//   95  190:isub            
	//   96  191:i2f             
	//   97  192:fload           6
	//   98  194:fdiv            
	//   99  195:fstore          6
			}
			boolean flag1;
			if(f != layoutparams.onScreen)
	//* 100  197:fload           6
	//* 101  199:aload           16
	//* 102  201:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//* 103  204:fcmpl           
	//* 104  205:ifeq            214
				flag1 = true;
	//  105  208:iconst_1        
	//  106  209:istore          8
			else
	//* 107  211:goto            217
				flag1 = false;
	//  108  214:iconst_0        
	//  109  215:istore          8
			i = layoutparams.gravity & 0x70;
	//  110  217:aload           16
	//  111  219:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//  112  222:bipush          112
	//  113  224:iand            
	//  114  225:istore_2        
			if(i != 16)
	//* 115  226:iload_2         
	//* 116  227:bipush          16
	//* 117  229:icmpeq          306
			{
				if(i != 80)
	//* 118  232:iload_2         
	//* 119  233:bipush          80
	//* 120  235:icmpeq          266
				{
					view.layout(i1, layoutparams.topMargin, i2 + i1, layoutparams.topMargin + j2);
	//  121  238:aload           15
	//  122  240:iload           7
	//  123  242:aload           16
	//  124  244:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//  125  247:iload           12
	//  126  249:iload           7
	//  127  251:iadd            
	//  128  252:aload           16
	//  129  254:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//  130  257:iload           13
	//  131  259:iadd            
	//  132  260:invokevirtual   #777 <Method void View.layout(int, int, int, int)>
				} else
	//* 133  263:goto            388
				{
					i = l - j;
	//  134  266:iload           5
	//  135  268:iload_3         
	//  136  269:isub            
	//  137  270:istore_2        
					view.layout(i1, i - layoutparams.bottomMargin - view.getMeasuredHeight(), i2 + i1, i - layoutparams.bottomMargin);
	//  138  271:aload           15
	//  139  273:iload           7
	//  140  275:iload_2         
	//  141  276:aload           16
	//  142  278:getfield        #780 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  143  281:isub            
	//  144  282:aload           15
	//  145  284:invokevirtual   #774 <Method int View.getMeasuredHeight()>
	//  146  287:isub            
	//  147  288:iload           12
	//  148  290:iload           7
	//  149  292:iadd            
	//  150  293:iload_2         
	//  151  294:aload           16
	//  152  296:getfield        #780 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  153  299:isub            
	//  154  300:invokevirtual   #777 <Method void View.layout(int, int, int, int)>
				}
			} else
	//* 155  303:goto            388
			{
				int k2 = l - j;
	//  156  306:iload           5
	//  157  308:iload_3         
	//  158  309:isub            
	//  159  310:istore          14
				int j1 = (k2 - j2) / 2;
	//  160  312:iload           14
	//  161  314:iload           13
	//  162  316:isub            
	//  163  317:iconst_2        
	//  164  318:idiv            
	//  165  319:istore          9
				if(j1 < layoutparams.topMargin)
	//* 166  321:iload           9
	//* 167  323:aload           16
	//* 168  325:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 169  328:icmpge          340
				{
					i = layoutparams.topMargin;
	//  170  331:aload           16
	//  171  333:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//  172  336:istore_2        
				} else
	//* 173  337:goto            371
				{
					i = j1;
	//  174  340:iload           9
	//  175  342:istore_2        
					if(j1 + j2 > k2 - layoutparams.bottomMargin)
	//* 176  343:iload           9
	//* 177  345:iload           13
	//* 178  347:iadd            
	//* 179  348:iload           14
	//* 180  350:aload           16
	//* 181  352:getfield        #780 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 182  355:isub            
	//* 183  356:icmple          371
						i = k2 - layoutparams.bottomMargin - j2;
	//  184  359:iload           14
	//  185  361:aload           16
	//  186  363:getfield        #780 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  187  366:isub            
	//  188  367:iload           13
	//  189  369:isub            
	//  190  370:istore_2        
				}
				view.layout(i1, i, i2 + i1, j2 + i);
	//  191  371:aload           15
	//  192  373:iload           7
	//  193  375:iload_2         
	//  194  376:iload           12
	//  195  378:iload           7
	//  196  380:iadd            
	//  197  381:iload           13
	//  198  383:iload_2         
	//  199  384:iadd            
	//  200  385:invokevirtual   #777 <Method void View.layout(int, int, int, int)>
			}
			if(flag1)
	//* 201  388:iload           8
	//* 202  390:ifeq            401
				setDrawerViewOffset(view, f);
	//  203  393:aload_0         
	//  204  394:aload           15
	//  205  396:fload           6
	//  206  398:invokevirtual   #694 <Method void setDrawerViewOffset(View, float)>
			if(layoutparams.onScreen > 0.0F)
	//* 207  401:aload           16
	//* 208  403:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//* 209  406:fconst_0        
	//* 210  407:fcmpl           
	//* 211  408:ifle            416
				i = 0;
	//  212  411:iconst_0        
	//  213  412:istore_2        
			else
	//* 214  413:goto            418
				i = 4;
	//  215  416:iconst_4        
	//  216  417:istore_2        
			if(view.getVisibility() != i)
	//* 217  418:aload           15
	//* 218  420:invokevirtual   #407 <Method int View.getVisibility()>
	//* 219  423:iload_2         
	//* 220  424:icmpeq          433
				view.setVisibility(i);
	//  221  427:aload           15
	//  222  429:iload_2         
	//  223  430:invokevirtual   #518 <Method void View.setVisibility(int)>
		}

	//  224  433:iload           4
	//  225  435:iconst_1        
	//  226  436:iadd            
	//  227  437:istore          4
	//* 228  439:goto            20
		mInLayout = false;
	//  229  442:aload_0         
	//  230  443:iconst_0        
	//  231  444:putfield        #762 <Field boolean mInLayout>
		mFirstLayout = false;
	//  232  447:aload_0         
	//  233  448:iconst_0        
	//  234  449:putfield        #167 <Field boolean mFirstLayout>
	//  235  452:return          
	}

	protected void onMeasure(int i, int j)
	{
label0:
		{
			int k1;
			int l1;
label1:
			{
				int j2 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #786 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          8
				int i2 = android.view.View.MeasureSpec.getMode(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #786 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          7
				int k = android.view.View.MeasureSpec.getSize(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #789 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore_3        
				int i1 = android.view.View.MeasureSpec.getSize(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #789 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   21:istore          4
				if(j2 == 0x40000000)
	//*  12   23:iload           8
	//*  13   25:ldc2            #790 <Int 0x40000000>
	//*  14   28:icmpne          46
				{
					k1 = k;
	//   15   31:iload_3         
	//   16   32:istore          5
					l1 = i1;
	//   17   34:iload           4
	//   18   36:istore          6
					if(i2 == 0x40000000)
						break label1;
	//   19   38:iload           7
	//   20   40:ldc2            #790 <Int 0x40000000>
	//   21   43:icmpeq          111
				}
				if(!isInEditMode())
					break label0;
	//   22   46:aload_0         
	//   23   47:invokevirtual   #793 <Method boolean isInEditMode()>
	//   24   50:ifeq            805
				if(j2 != 0x80000000 && j2 == 0)
	//*  25   53:iload           8
	//*  26   55:ldc2            #794 <Int 0x80000000>
	//*  27   58:icmpne          64
	//*  28   61:goto            73
	//*  29   64:iload           8
	//*  30   66:ifne            73
					k = 300;
	//   31   69:sipush          300
	//   32   72:istore_3        
				if(i2 == 0x80000000)
	//*  33   73:iload           7
	//*  34   75:ldc2            #794 <Int 0x80000000>
	//*  35   78:icmpne          91
				{
					k1 = k;
	//   36   81:iload_3         
	//   37   82:istore          5
					l1 = i1;
	//   38   84:iload           4
	//   39   86:istore          6
				} else
	//*  40   88:goto            111
				{
					k1 = k;
	//   41   91:iload_3         
	//   42   92:istore          5
					l1 = i1;
	//   43   94:iload           4
	//   44   96:istore          6
					if(i2 == 0)
	//*  45   98:iload           7
	//*  46  100:ifne            111
					{
						l1 = 300;
	//   47  103:sipush          300
	//   48  106:istore          6
						k1 = k;
	//   49  108:iload_3         
	//   50  109:istore          5
					}
				}
			}
label2:
			{
				setMeasuredDimension(k1, l1);
	//   51  111:aload_0         
	//   52  112:iload           5
	//   53  114:iload           6
	//   54  116:invokevirtual   #797 <Method void setMeasuredDimension(int, int)>
				boolean flag;
				if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  55  119:aload_0         
	//*  56  120:getfield        #707 <Field Object mLastInsets>
	//*  57  123:ifnull          139
	//*  58  126:aload_0         
	//*  59  127:invokestatic    #260 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  60  130:ifeq            139
					flag = true;
	//   61  133:iconst_1        
	//   62  134:istore          7
				else
	//*  63  136:goto            142
					flag = false;
	//   64  139:iconst_0        
	//   65  140:istore          7
				int i3 = ViewCompat.getLayoutDirection(((View) (this)));
	//   66  142:aload_0         
	//   67  143:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//   68  146:istore          10
				int j3 = getChildCount();
	//   69  148:aload_0         
	//   70  149:invokevirtual   #322 <Method int getChildCount()>
	//   71  152:istore          11
				int k2 = 0;
	//   72  154:iconst_0        
	//   73  155:istore          8
				int j1 = k2;
	//   74  157:iload           8
	//   75  159:istore          4
				int l = j1;
	//   76  161:iload           4
	//   77  163:istore_3        
				View view;
				do
				{
					if(k2 >= j3)
						break label2;
	//   78  164:iload           8
	//   79  166:iload           11
	//   80  168:icmpge          804
					view = getChildAt(k2);
	//   81  171:aload_0         
	//   82  172:iload           8
	//   83  174:invokevirtual   #326 <Method View getChildAt(int)>
	//   84  177:astore          15
					if(view.getVisibility() != 8)
	//*  85  179:aload           15
	//*  86  181:invokevirtual   #407 <Method int View.getVisibility()>
	//*  87  184:bipush          8
	//*  88  186:icmpne          192
	//*  89  189:goto            496
					{
						LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   90  192:aload           15
	//   91  194:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   92  197:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   93  200:astore          16
						if(flag)
	//*  94  202:iload           7
	//*  95  204:ifeq            442
						{
							int l2 = GravityCompat.getAbsoluteGravity(layoutparams.gravity, i3);
	//   96  207:aload           16
	//   97  209:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//   98  212:iload           10
	//   99  214:invokestatic    #639 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  100  217:istore          9
							if(ViewCompat.getFitsSystemWindows(view))
	//* 101  219:aload           15
	//* 102  221:invokestatic    #260 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 103  224:ifeq            320
							{
								if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 104  227:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//* 105  230:bipush          21
	//* 106  232:icmplt          442
								{
									WindowInsets windowinsets2 = (WindowInsets)mLastInsets;
	//  107  235:aload_0         
	//  108  236:getfield        #707 <Field Object mLastInsets>
	//  109  239:checkcast       #709 <Class WindowInsets>
	//  110  242:astore          14
									WindowInsets windowinsets;
									if(l2 == 3)
	//* 111  244:iload           9
	//* 112  246:iconst_3        
	//* 113  247:icmpne          276
									{
										windowinsets = windowinsets2.replaceSystemWindowInsets(windowinsets2.getSystemWindowInsetLeft(), windowinsets2.getSystemWindowInsetTop(), 0, windowinsets2.getSystemWindowInsetBottom());
	//  114  250:aload           14
	//  115  252:aload           14
	//  116  254:invokevirtual   #800 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  117  257:aload           14
	//  118  259:invokevirtual   #712 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  119  262:iconst_0        
	//  120  263:aload           14
	//  121  265:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  122  268:invokevirtual   #807 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  123  271:astore          13
									} else
	//* 124  273:goto            309
									{
										windowinsets = windowinsets2;
	//  125  276:aload           14
	//  126  278:astore          13
										if(l2 == 5)
	//* 127  280:iload           9
	//* 128  282:iconst_5        
	//* 129  283:icmpne          309
											windowinsets = windowinsets2.replaceSystemWindowInsets(0, windowinsets2.getSystemWindowInsetTop(), windowinsets2.getSystemWindowInsetRight(), windowinsets2.getSystemWindowInsetBottom());
	//  130  286:aload           14
	//  131  288:iconst_0        
	//  132  289:aload           14
	//  133  291:invokevirtual   #712 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  134  294:aload           14
	//  135  296:invokevirtual   #810 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  136  299:aload           14
	//  137  301:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  138  304:invokevirtual   #807 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  139  307:astore          13
									}
									view.dispatchApplyWindowInsets(windowinsets);
	//  140  309:aload           15
	//  141  311:aload           13
	//  142  313:invokevirtual   #814 <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//  143  316:pop             
								}
							} else
	//* 144  317:goto            442
							if(android.os.Build.VERSION.SDK_INT >= 21)
	//* 145  320:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//* 146  323:bipush          21
	//* 147  325:icmplt          442
							{
								WindowInsets windowinsets3 = (WindowInsets)mLastInsets;
	//  148  328:aload_0         
	//  149  329:getfield        #707 <Field Object mLastInsets>
	//  150  332:checkcast       #709 <Class WindowInsets>
	//  151  335:astore          14
								WindowInsets windowinsets1;
								if(l2 == 3)
	//* 152  337:iload           9
	//* 153  339:iconst_3        
	//* 154  340:icmpne          369
								{
									windowinsets1 = windowinsets3.replaceSystemWindowInsets(windowinsets3.getSystemWindowInsetLeft(), windowinsets3.getSystemWindowInsetTop(), 0, windowinsets3.getSystemWindowInsetBottom());
	//  155  343:aload           14
	//  156  345:aload           14
	//  157  347:invokevirtual   #800 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  158  350:aload           14
	//  159  352:invokevirtual   #712 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  160  355:iconst_0        
	//  161  356:aload           14
	//  162  358:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  163  361:invokevirtual   #807 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  164  364:astore          13
								} else
	//* 165  366:goto            402
								{
									windowinsets1 = windowinsets3;
	//  166  369:aload           14
	//  167  371:astore          13
									if(l2 == 5)
	//* 168  373:iload           9
	//* 169  375:iconst_5        
	//* 170  376:icmpne          402
										windowinsets1 = windowinsets3.replaceSystemWindowInsets(0, windowinsets3.getSystemWindowInsetTop(), windowinsets3.getSystemWindowInsetRight(), windowinsets3.getSystemWindowInsetBottom());
	//  171  379:aload           14
	//  172  381:iconst_0        
	//  173  382:aload           14
	//  174  384:invokevirtual   #712 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  175  387:aload           14
	//  176  389:invokevirtual   #810 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  177  392:aload           14
	//  178  394:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  179  397:invokevirtual   #807 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//  180  400:astore          13
								}
								layoutparams.leftMargin = windowinsets1.getSystemWindowInsetLeft();
	//  181  402:aload           16
	//  182  404:aload           13
	//  183  406:invokevirtual   #800 <Method int WindowInsets.getSystemWindowInsetLeft()>
	//  184  409:putfield        #765 <Field int DrawerLayout$LayoutParams.leftMargin>
								layoutparams.topMargin = windowinsets1.getSystemWindowInsetTop();
	//  185  412:aload           16
	//  186  414:aload           13
	//  187  416:invokevirtual   #712 <Method int WindowInsets.getSystemWindowInsetTop()>
	//  188  419:putfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
								layoutparams.rightMargin = windowinsets1.getSystemWindowInsetRight();
	//  189  422:aload           16
	//  190  424:aload           13
	//  191  426:invokevirtual   #810 <Method int WindowInsets.getSystemWindowInsetRight()>
	//  192  429:putfield        #817 <Field int DrawerLayout$LayoutParams.rightMargin>
								layoutparams.bottomMargin = windowinsets1.getSystemWindowInsetBottom();
	//  193  432:aload           16
	//  194  434:aload           13
	//  195  436:invokevirtual   #803 <Method int WindowInsets.getSystemWindowInsetBottom()>
	//  196  439:putfield        #780 <Field int DrawerLayout$LayoutParams.bottomMargin>
							}
						}
						if(isContentView(view))
	//* 197  442:aload_0         
	//* 198  443:aload           15
	//* 199  445:invokevirtual   #577 <Method boolean isContentView(View)>
	//* 200  448:ifeq            499
						{
							view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
	//  201  451:aload           15
	//  202  453:iload           5
	//  203  455:aload           16
	//  204  457:getfield        #765 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  205  460:isub            
	//  206  461:aload           16
	//  207  463:getfield        #817 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  208  466:isub            
	//  209  467:ldc2            #790 <Int 0x40000000>
	//  210  470:invokestatic    #820 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  211  473:iload           6
	//  212  475:aload           16
	//  213  477:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//  214  480:isub            
	//  215  481:aload           16
	//  216  483:getfield        #780 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  217  486:isub            
	//  218  487:ldc2            #790 <Int 0x40000000>
	//  219  490:invokestatic    #820 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  220  493:invokevirtual   #823 <Method void View.measure(int, int)>
						} else
	//* 221  496:goto            721
						{
							if(!isDrawerView(view))
								break;
	//  222  499:aload_0         
	//  223  500:aload           15
	//  224  502:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//  225  505:ifeq            730
							if(SET_DRAWER_SHADOW_FROM_ELEVATION && ViewCompat.getElevation(view) != mDrawerElevation)
	//* 226  508:getstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//* 227  511:ifeq            536
	//* 228  514:aload           15
	//* 229  516:invokestatic    #826 <Method float ViewCompat.getElevation(View)>
	//* 230  519:aload_0         
	//* 231  520:getfield        #288 <Field float mDrawerElevation>
	//* 232  523:fcmpl           
	//* 233  524:ifeq            536
								ViewCompat.setElevation(view, mDrawerElevation);
	//  234  527:aload           15
	//  235  529:aload_0         
	//  236  530:getfield        #288 <Field float mDrawerElevation>
	//  237  533:invokestatic    #829 <Method void ViewCompat.setElevation(View, float)>
							int k3 = getDrawerViewAbsoluteGravity(view) & 7;
	//  238  536:aload_0         
	//  239  537:aload           15
	//  240  539:invokevirtual   #444 <Method int getDrawerViewAbsoluteGravity(View)>
	//  241  542:bipush          7
	//  242  544:iand            
	//  243  545:istore          12
							boolean flag1;
							if(k3 == 3)
	//* 244  547:iload           12
	//* 245  549:iconst_3        
	//* 246  550:icmpne          559
								flag1 = true;
	//  247  553:iconst_1        
	//  248  554:istore          9
							else
	//* 249  556:goto            562
								flag1 = false;
	//  250  559:iconst_0        
	//  251  560:istore          9
							if(flag1 && j1 != 0 || !flag1 && l != 0)
	//* 252  562:iload           9
	//* 253  564:ifeq            572
	//* 254  567:iload           4
	//* 255  569:ifne            581
	//* 256  572:iload           9
	//* 257  574:ifne            658
	//* 258  577:iload_3         
	//* 259  578:ifeq            658
							{
								StringBuilder stringbuilder = new StringBuilder();
	//  260  581:new             #457 <Class StringBuilder>
	//  261  584:dup             
	//  262  585:invokespecial   #458 <Method void StringBuilder()>
	//  263  588:astore          13
								stringbuilder.append("Child drawer has absolute gravity ");
	//  264  590:aload           13
	//  265  592:ldc2            #831 <String "Child drawer has absolute gravity ">
	//  266  595:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  267  598:pop             
								stringbuilder.append(gravityToString(k3));
	//  268  599:aload           13
	//  269  601:iload           12
	//  270  603:invokestatic    #466 <Method String gravityToString(int)>
	//  271  606:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  272  609:pop             
								stringbuilder.append(" but this ");
	//  273  610:aload           13
	//  274  612:ldc2            #833 <String " but this ">
	//  275  615:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  276  618:pop             
								stringbuilder.append("DrawerLayout");
	//  277  619:aload           13
	//  278  621:ldc1            #73  <String "DrawerLayout">
	//  279  623:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  280  626:pop             
								stringbuilder.append(" already has a ");
	//  281  627:aload           13
	//  282  629:ldc2            #835 <String " already has a ">
	//  283  632:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  284  635:pop             
								stringbuilder.append("drawer view along that edge");
	//  285  636:aload           13
	//  286  638:ldc2            #837 <String "drawer view along that edge">
	//  287  641:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  288  644:pop             
								throw new IllegalStateException(stringbuilder.toString());
	//  289  645:new             #839 <Class IllegalStateException>
	//  290  648:dup             
	//  291  649:aload           13
	//  292  651:invokevirtual   #472 <Method String StringBuilder.toString()>
	//  293  654:invokespecial   #840 <Method void IllegalStateException(String)>
	//  294  657:athrow          
							}
							if(flag1)
	//* 295  658:iload           9
	//* 296  660:ifeq            669
								j1 = 1;
	//  297  663:iconst_1        
	//  298  664:istore          4
							else
	//* 299  666:goto            671
								l = 1;
	//  300  669:iconst_1        
	//  301  670:istore_3        
							view.measure(getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
	//  302  671:aload           15
	//  303  673:iload_1         
	//  304  674:aload_0         
	//  305  675:getfield        #207 <Field int mMinDrawerMargin>
	//  306  678:aload           16
	//  307  680:getfield        #765 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  308  683:iadd            
	//  309  684:aload           16
	//  310  686:getfield        #817 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  311  689:iadd            
	//  312  690:aload           16
	//  313  692:getfield        #843 <Field int DrawerLayout$LayoutParams.width>
	//  314  695:invokestatic    #847 <Method int getChildMeasureSpec(int, int, int)>
	//  315  698:iload_2         
	//  316  699:aload           16
	//  317  701:getfield        #768 <Field int DrawerLayout$LayoutParams.topMargin>
	//  318  704:aload           16
	//  319  706:getfield        #780 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  320  709:iadd            
	//  321  710:aload           16
	//  322  712:getfield        #850 <Field int DrawerLayout$LayoutParams.height>
	//  323  715:invokestatic    #847 <Method int getChildMeasureSpec(int, int, int)>
	//  324  718:invokevirtual   #823 <Method void View.measure(int, int)>
						}
					}
					k2++;
	//  325  721:iload           8
	//  326  723:iconst_1        
	//  327  724:iadd            
	//  328  725:istore          8
				} while(true);
	//  329  727:goto            164
				StringBuilder stringbuilder1 = new StringBuilder();
	//  330  730:new             #457 <Class StringBuilder>
	//  331  733:dup             
	//  332  734:invokespecial   #458 <Method void StringBuilder()>
	//  333  737:astore          13
				stringbuilder1.append("Child ");
	//  334  739:aload           13
	//  335  741:ldc2            #852 <String "Child ">
	//  336  744:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  337  747:pop             
				stringbuilder1.append(((Object) (view)));
	//  338  748:aload           13
	//  339  750:aload           15
	//  340  752:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//  341  755:pop             
				stringbuilder1.append(" at index ");
	//  342  756:aload           13
	//  343  758:ldc2            #854 <String " at index ">
	//  344  761:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  345  764:pop             
				stringbuilder1.append(k2);
	//  346  765:aload           13
	//  347  767:iload           8
	//  348  769:invokevirtual   #857 <Method StringBuilder StringBuilder.append(int)>
	//  349  772:pop             
				stringbuilder1.append(" does not have a valid layout_gravity - must be Gravity.LEFT, ");
	//  350  773:aload           13
	//  351  775:ldc2            #859 <String " does not have a valid layout_gravity - must be Gravity.LEFT, ">
	//  352  778:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  353  781:pop             
				stringbuilder1.append("Gravity.RIGHT or Gravity.NO_GRAVITY");
	//  354  782:aload           13
	//  355  784:ldc2            #861 <String "Gravity.RIGHT or Gravity.NO_GRAVITY">
	//  356  787:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//  357  790:pop             
				throw new IllegalStateException(stringbuilder1.toString());
	//  358  791:new             #839 <Class IllegalStateException>
	//  359  794:dup             
	//  360  795:aload           13
	//  361  797:invokevirtual   #472 <Method String StringBuilder.toString()>
	//  362  800:invokespecial   #840 <Method void IllegalStateException(String)>
	//  363  803:athrow          
			}
			return;
	//  364  804:return          
		}
		throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
	//  365  805:new             #468 <Class IllegalArgumentException>
	//  366  808:dup             
	//  367  809:ldc2            #863 <String "DrawerLayout must be measured with MeasureSpec.EXACTLY.">
	//  368  812:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//  369  815:athrow          
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
	//    5    9:invokespecial   #867 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #26  <Class DrawerLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #871 <Method Parcelable DrawerLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #867 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).openDrawerGravity != 0)
	//*  14   26:aload_1         
	//*  15   27:getfield        #874 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//*  16   30:ifeq            51
		{
			View view = findDrawerWithGravity(((SavedState) (parcelable)).openDrawerGravity);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #874 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//   20   38:invokevirtual   #455 <Method View findDrawerWithGravity(int)>
	//   21   41:astore_2        
			if(view != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          51
				openDrawer(view);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #877 <Method void openDrawer(View)>
		}
		if(((SavedState) (parcelable)).lockModeLeft != 3)
	//*  27   51:aload_1         
	//*  28   52:getfield        #880 <Field int DrawerLayout$SavedState.lockModeLeft>
	//*  29   55:iconst_3        
	//*  30   56:icmpeq          68
			setDrawerLockMode(((SavedState) (parcelable)).lockModeLeft, 3);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #880 <Field int DrawerLayout$SavedState.lockModeLeft>
	//   34   64:iconst_3        
	//   35   65:invokevirtual   #883 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeRight != 3)
	//*  36   68:aload_1         
	//*  37   69:getfield        #886 <Field int DrawerLayout$SavedState.lockModeRight>
	//*  38   72:iconst_3        
	//*  39   73:icmpeq          85
			setDrawerLockMode(((SavedState) (parcelable)).lockModeRight, 5);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getfield        #886 <Field int DrawerLayout$SavedState.lockModeRight>
	//   43   81:iconst_5        
	//   44   82:invokevirtual   #883 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeStart != 3)
	//*  45   85:aload_1         
	//*  46   86:getfield        #889 <Field int DrawerLayout$SavedState.lockModeStart>
	//*  47   89:iconst_3        
	//*  48   90:icmpeq          104
			setDrawerLockMode(((SavedState) (parcelable)).lockModeStart, 0x800003);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #889 <Field int DrawerLayout$SavedState.lockModeStart>
	//   52   98:ldc2            #670 <Int 0x800003>
	//   53  101:invokevirtual   #883 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeEnd != 3)
	//*  54  104:aload_1         
	//*  55  105:getfield        #892 <Field int DrawerLayout$SavedState.lockModeEnd>
	//*  56  108:iconst_3        
	//*  57  109:icmpeq          123
			setDrawerLockMode(((SavedState) (parcelable)).lockModeEnd, 0x800005);
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:getfield        #892 <Field int DrawerLayout$SavedState.lockModeEnd>
	//   61  117:ldc2            #671 <Int 0x800005>
	//   62  120:invokevirtual   #883 <Method void setDrawerLockMode(int, int)>
	//   63  123:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		resolveShadowDrawables();
	//    0    0:aload_0         
	//    1    1:invokespecial   #895 <Method void resolveShadowDrawables()>
	//    2    4:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate;
label0:
		{
			savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #26  <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #898 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #900 <Method void DrawerLayout$SavedState(Parcelable)>
	//    5   11:astore          5
			int k = getChildCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #322 <Method int getChildCount()>
	//    8   17:istore          4
			int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
			LayoutParams layoutparams;
			do
			{
				if(i >= k)
					break label0;
	//   11   21:iload_1         
	//   12   22:iload           4
	//   13   24:icmpge          102
				layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #326 <Method View getChildAt(int)>
	//   17   32:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   35:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   19   38:astore          6
				int j = layoutparams.openState;
	//   20   40:aload           6
	//   21   42:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
	//   22   45:istore_2        
				boolean flag1 = true;
	//   23   46:iconst_1        
	//   24   47:istore_3        
				boolean flag;
				if(j == 1)
	//*  25   48:iload_2         
	//*  26   49:iconst_1        
	//*  27   50:icmpne          58
					flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_2        
				else
	//*  30   55:goto            60
					flag = false;
	//   31   58:iconst_0        
	//   32   59:istore_2        
				if(layoutparams.openState != 2)
	//*  33   60:aload           6
	//*  34   62:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
	//*  35   65:iconst_2        
	//*  36   66:icmpne          72
	//*  37   69:goto            74
					flag1 = false;
	//   38   72:iconst_0        
	//   39   73:istore_3        
				if(flag || flag1)
	//*  40   74:iload_2         
	//*  41   75:ifne            92
	//*  42   78:iload_3         
	//*  43   79:ifeq            85
					break;
	//   44   82:goto            92
				i++;
	//   45   85:iload_1         
	//   46   86:iconst_1        
	//   47   87:iadd            
	//   48   88:istore_1        
			} while(true);
	//   49   89:goto            21
			savedstate.openDrawerGravity = layoutparams.gravity;
	//   50   92:aload           5
	//   51   94:aload           6
	//   52   96:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//   53   99:putfield        #874 <Field int DrawerLayout$SavedState.openDrawerGravity>
		}
		savedstate.lockModeLeft = mLockModeLeft;
	//   54  102:aload           5
	//   55  104:aload_0         
	//   56  105:getfield        #169 <Field int mLockModeLeft>
	//   57  108:putfield        #880 <Field int DrawerLayout$SavedState.lockModeLeft>
		savedstate.lockModeRight = mLockModeRight;
	//   58  111:aload           5
	//   59  113:aload_0         
	//   60  114:getfield        #171 <Field int mLockModeRight>
	//   61  117:putfield        #886 <Field int DrawerLayout$SavedState.lockModeRight>
		savedstate.lockModeStart = mLockModeStart;
	//   62  120:aload           5
	//   63  122:aload_0         
	//   64  123:getfield        #173 <Field int mLockModeStart>
	//   65  126:putfield        #889 <Field int DrawerLayout$SavedState.lockModeStart>
		savedstate.lockModeEnd = mLockModeEnd;
	//   66  129:aload           5
	//   67  131:aload_0         
	//   68  132:getfield        #175 <Field int mLockModeEnd>
	//   69  135:putfield        #892 <Field int DrawerLayout$SavedState.lockModeEnd>
		return ((Parcelable) (savedstate));
	//   70  138:aload           5
	//   71  140:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i;
		mLeftDragger.processTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #905 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		mRightDragger.processTouchEvent(motionevent);
	//    4    8:aload_0         
	//    5    9:getfield        #236 <Field ViewDragHelper mRightDragger>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #905 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		i = motionevent.getAction() & 0xff;
	//    8   16:aload_1         
	//    9   17:invokevirtual   #908 <Method int MotionEvent.getAction()>
	//   10   20:sipush          255
	//   11   23:iand            
	//   12   24:istore          4
		if(i == 3) goto _L2; else goto _L1
	//   13   26:iload           4
	//   14   28:iconst_3        
	//   15   29:icmpeq          207
_L1:
		i;
	//   16   32:iload           4
		JVM INSTR tableswitch 0 1: default 56
	//	               0 175
	//	               1 58;
	//   17   34:tableswitch     0 1: default 56
	//	               0 175
	//	               1 58
		   goto _L3 _L4 _L5
_L3:
		return true;
	//   18   56:iconst_1        
	//   19   57:ireturn         
_L5:
		float f;
		float f2;
		f2 = motionevent.getX();
	//   20   58:aload_1         
	//   21   59:invokevirtual   #727 <Method float MotionEvent.getX()>
	//   22   62:fstore_3        
		f = motionevent.getY();
	//   23   63:aload_1         
	//   24   64:invokevirtual   #730 <Method float MotionEvent.getY()>
	//   25   67:fstore_2        
		motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f2, (int)f)));
	//   26   68:aload_0         
	//   27   69:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   28   72:fload_3         
	//   29   73:f2i             
	//   30   74:fload_2         
	//   31   75:f2i             
	//   32   76:invokevirtual   #738 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   33   79:astore_1        
		if(motionevent == null || !isContentView(((View) (motionevent)))) goto _L7; else goto _L6
	//   34   80:aload_1         
	//   35   81:ifnull          159
	//   36   84:aload_0         
	//   37   85:aload_1         
	//   38   86:invokevirtual   #577 <Method boolean isContentView(View)>
	//   39   89:ifeq            159
_L6:
		f2 -= mInitialMotionX;
	//   40   92:fload_3         
	//   41   93:aload_0         
	//   42   94:getfield        #732 <Field float mInitialMotionX>
	//   43   97:fsub            
	//   44   98:fstore_3        
		f -= mInitialMotionY;
	//   45   99:fload_2         
	//   46  100:aload_0         
	//   47  101:getfield        #734 <Field float mInitialMotionY>
	//   48  104:fsub            
	//   49  105:fstore_2        
		i = mLeftDragger.getTouchSlop();
	//   50  106:aload_0         
	//   51  107:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   52  110:invokevirtual   #911 <Method int ViewDragHelper.getTouchSlop()>
	//   53  113:istore          4
		if(f2 * f2 + f * f >= (float)(i * i)) goto _L7; else goto _L8
	//   54  115:fload_3         
	//   55  116:fload_3         
	//   56  117:fmul            
	//   57  118:fload_2         
	//   58  119:fload_2         
	//   59  120:fmul            
	//   60  121:fadd            
	//   61  122:iload           4
	//   62  124:iload           4
	//   63  126:imul            
	//   64  127:i2f             
	//   65  128:fcmpg           
	//   66  129:ifge            159
_L8:
		motionevent = ((MotionEvent) (findOpenDrawer()));
	//   67  132:aload_0         
	//   68  133:invokevirtual   #419 <Method View findOpenDrawer()>
	//   69  136:astore_1        
		if(motionevent != null && getDrawerLockMode(((View) (motionevent))) != 2) goto _L9; else goto _L7
	//   70  137:aload_1         
	//   71  138:ifnull          159
	//   72  141:aload_0         
	//   73  142:aload_1         
	//   74  143:invokevirtual   #754 <Method int getDrawerLockMode(View)>
	//   75  146:iconst_2        
	//   76  147:icmpne          153
	//*  77  150:goto            159
_L9:
		boolean flag = false;
	//   78  153:iconst_0        
	//   79  154:istore          5
		  goto _L10
	//*  80  156:goto            162
_L7:
		flag = true;
	//   81  159:iconst_1        
	//   82  160:istore          5
_L10:
		closeDrawers(flag);
	//   83  162:aload_0         
	//   84  163:iload           5
	//   85  165:invokevirtual   #524 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//   86  168:aload_0         
	//   87  169:iconst_0        
	//   88  170:putfield        #724 <Field boolean mDisallowInterceptRequested>
		return true;
	//   89  173:iconst_1        
	//   90  174:ireturn         
_L4:
		float f1 = motionevent.getX();
	//   91  175:aload_1         
	//   92  176:invokevirtual   #727 <Method float MotionEvent.getX()>
	//   93  179:fstore_2        
		float f3 = motionevent.getY();
	//   94  180:aload_1         
	//   95  181:invokevirtual   #730 <Method float MotionEvent.getY()>
	//   96  184:fstore_3        
		mInitialMotionX = f1;
	//   97  185:aload_0         
	//   98  186:fload_2         
	//   99  187:putfield        #732 <Field float mInitialMotionX>
		mInitialMotionY = f3;
	//  100  190:aload_0         
	//  101  191:fload_3         
	//  102  192:putfield        #734 <Field float mInitialMotionY>
		mDisallowInterceptRequested = false;
	//  103  195:aload_0         
	//  104  196:iconst_0        
	//  105  197:putfield        #724 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//  106  200:aload_0         
	//  107  201:iconst_0        
	//  108  202:putfield        #422 <Field boolean mChildrenCanceledTouch>
		return true;
	//  109  205:iconst_1        
	//  110  206:ireturn         
_L2:
		closeDrawers(true);
	//  111  207:aload_0         
	//  112  208:iconst_1        
	//  113  209:invokevirtual   #524 <Method void closeDrawers(boolean)>
		mDisallowInterceptRequested = false;
	//  114  212:aload_0         
	//  115  213:iconst_0        
	//  116  214:putfield        #724 <Field boolean mDisallowInterceptRequested>
		mChildrenCanceledTouch = false;
	//  117  217:aload_0         
	//  118  218:iconst_0        
	//  119  219:putfield        #422 <Field boolean mChildrenCanceledTouch>
		return true;
	//  120  222:iconst_1        
	//  121  223:ireturn         
	}

	public void openDrawer(int i)
	{
		openDrawer(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #913 <Method void openDrawer(int, boolean)>
	//    4    6:return          
	}

	public void openDrawer(int i, boolean flag)
	{
		Object obj = ((Object) (findDrawerWithGravity(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #455 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_3        
		if(obj == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       47
		{
			obj = ((Object) (new StringBuilder()));
	//    6   10:new             #457 <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #458 <Method void StringBuilder()>
	//    9   17:astore_3        
			((StringBuilder) (obj)).append("No drawer view found with gravity ");
	//   10   18:aload_3         
	//   11   19:ldc2            #460 <String "No drawer view found with gravity ">
	//   12   22:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			((StringBuilder) (obj)).append(gravityToString(i));
	//   14   26:aload_3         
	//   15   27:iload_1         
	//   16   28:invokestatic    #466 <Method String gravityToString(int)>
	//   17   31:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
			throw new IllegalArgumentException(((StringBuilder) (obj)).toString());
	//   19   35:new             #468 <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:aload_3         
	//   22   40:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   23   43:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   24   46:athrow          
		} else
		{
			openDrawer(((View) (obj)), flag);
	//   25   47:aload_0         
	//   26   48:aload_3         
	//   27   49:iload_2         
	//   28   50:invokevirtual   #915 <Method void openDrawer(View, boolean)>
			return;
	//   29   53:return          
		}
	}

	public void openDrawer(View view)
	{
		openDrawer(view, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #915 <Method void openDrawer(View, boolean)>
	//    4    6:return          
	}

	public void openDrawer(View view, boolean flag)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            50
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #457 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #458 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("View ");
	//    8   16:aload_3         
	//    9   17:ldc2            #480 <String "View ">
	//   10   20:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_3         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a sliding drawer");
	//   16   30:aload_3         
	//   17   31:ldc2            #485 <String " is not a sliding drawer">
	//   18   34:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   20   38:new             #468 <Class IllegalArgumentException>
	//   21   41:dup             
	//   22   42:aload_3         
	//   23   43:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   24   46:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   25   49:athrow          
		}
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   26   50:aload_1         
	//   27   51:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   28   54:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   29   57:astore_3        
		if(mFirstLayout)
	//*  30   58:aload_0         
	//*  31   59:getfield        #167 <Field boolean mFirstLayout>
	//*  32   62:ifeq            84
		{
			layoutparams.onScreen = 1.0F;
	//   33   65:aload_3         
	//   34   66:fconst_1        
	//   35   67:putfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
			layoutparams.openState = 1;
	//   36   70:aload_3         
	//   37   71:iconst_1        
	//   38   72:putfield        #491 <Field int DrawerLayout$LayoutParams.openState>
			updateChildrenImportantForAccessibility(view, true);
	//   39   75:aload_0         
	//   40   76:aload_1         
	//   41   77:iconst_1        
	//   42   78:invokespecial   #551 <Method void updateChildrenImportantForAccessibility(View, boolean)>
		} else
	//*  43   81:goto            170
		if(flag)
	//*  44   84:iload_2         
	//*  45   85:ifeq            149
		{
			layoutparams.openState = layoutparams.openState | 2;
	//   46   88:aload_3         
	//   47   89:aload_3         
	//   48   90:getfield        #491 <Field int DrawerLayout$LayoutParams.openState>
	//   49   93:iconst_2        
	//   50   94:ior             
	//   51   95:putfield        #491 <Field int DrawerLayout$LayoutParams.openState>
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  52   98:aload_0         
	//*  53   99:aload_1         
	//*  54  100:iconst_3        
	//*  55  101:invokevirtual   #493 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  56  104:ifeq            124
				mLeftDragger.smoothSlideViewTo(view, 0, view.getTop());
	//   57  107:aload_0         
	//   58  108:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   59  111:aload_1         
	//   60  112:iconst_0        
	//   61  113:aload_1         
	//   62  114:invokevirtual   #499 <Method int View.getTop()>
	//   63  117:invokevirtual   #503 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   64  120:pop             
			else
	//*  65  121:goto            170
				mRightDragger.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
	//   66  124:aload_0         
	//   67  125:getfield        #236 <Field ViewDragHelper mRightDragger>
	//   68  128:aload_1         
	//   69  129:aload_0         
	//   70  130:invokevirtual   #504 <Method int getWidth()>
	//   71  133:aload_1         
	//   72  134:invokevirtual   #496 <Method int View.getWidth()>
	//   73  137:isub            
	//   74  138:aload_1         
	//   75  139:invokevirtual   #499 <Method int View.getTop()>
	//   76  142:invokevirtual   #503 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   77  145:pop             
		} else
	//*  78  146:goto            170
		{
			moveDrawerToOffset(view, 1.0F);
	//   79  149:aload_0         
	//   80  150:aload_1         
	//   81  151:fconst_1        
	//   82  152:invokevirtual   #508 <Method void moveDrawerToOffset(View, float)>
			updateDrawerState(layoutparams.gravity, 0, view);
	//   83  155:aload_0         
	//   84  156:aload_3         
	//   85  157:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//   86  160:iconst_0        
	//   87  161:aload_1         
	//   88  162:invokevirtual   #515 <Method void updateDrawerState(int, int, View)>
			view.setVisibility(0);
	//   89  165:aload_1         
	//   90  166:iconst_0        
	//   91  167:invokevirtual   #518 <Method void View.setVisibility(int)>
		}
		invalidate();
	//   92  170:aload_0         
	//   93  171:invokevirtual   #521 <Method void invalidate()>
	//   94  174:return          
	}

	public void removeDrawerListener(DrawerListener drawerlistener)
	{
		if(drawerlistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		if(mListeners == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #379 <Field List mListeners>
	//*   5    9:ifnonnull       13
		{
			return;
	//    6   12:return          
		} else
		{
			mListeners.remove(((Object) (drawerlistener)));
	//    7   13:aload_0         
	//    8   14:getfield        #379 <Field List mListeners>
	//    9   17:aload_1         
	//   10   18:invokeinterface #919 <Method boolean List.remove(Object)>
	//   11   23:pop             
			return;
	//   12   24:return          
		}
	}

	public void requestDisallowInterceptTouchEvent(boolean flag)
	{
		super.requestDisallowInterceptTouchEvent(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #922 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		mDisallowInterceptRequested = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #724 <Field boolean mDisallowInterceptRequested>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            19
			closeDrawers(true);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #524 <Method void closeDrawers(boolean)>
	//   11   19:return          
	}

	public void requestLayout()
	{
		if(!mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #762 <Field boolean mInLayout>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #925 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setChildInsets(Object obj, boolean flag)
	{
		mLastInsets = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #707 <Field Object mLastInsets>
		mDrawStatusBarBackground = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #705 <Field boolean mDrawStatusBarBackground>
		if(!flag && getBackground() == null)
	//*   6   10:iload_2         
	//*   7   11:ifne            26
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #932 <Method Drawable getBackground()>
	//*  10   18:ifnonnull       26
			flag = true;
	//   11   21:iconst_1        
	//   12   22:istore_2        
		else
	//*  13   23:goto            28
			flag = false;
	//   14   26:iconst_0        
	//   15   27:istore_2        
		setWillNotDraw(flag);
	//   16   28:aload_0         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #935 <Method void setWillNotDraw(boolean)>
		requestLayout();
	//   19   33:aload_0         
	//   20   34:invokevirtual   #936 <Method void requestLayout()>
	//   21   37:return          
	}

	public void setDrawerElevation(float f)
	{
		mDrawerElevation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #288 <Field float mDrawerElevation>
		for(int i = 0; i < getChildCount(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #322 <Method int getChildCount()>
	//*   8   12:icmpge          44
		{
			View view = getChildAt(i);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #326 <Method View getChildAt(int)>
	//   12   20:astore_3        
			if(isDrawerView(view))
	//*  13   21:aload_0         
	//*  14   22:aload_3         
	//*  15   23:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*  16   26:ifeq            37
				ViewCompat.setElevation(view, mDrawerElevation);
	//   17   29:aload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #288 <Field float mDrawerElevation>
	//   20   34:invokestatic    #829 <Method void ViewCompat.setElevation(View, float)>
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
	//*   1    1:getfield        #941 <Field DrawerLayout$DrawerListener mListener>
	//*   2    4:ifnull          15
			removeDrawerListener(mListener);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #941 <Field DrawerLayout$DrawerListener mListener>
	//    6   12:invokevirtual   #943 <Method void removeDrawerListener(DrawerLayout$DrawerListener)>
		if(drawerlistener != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			addDrawerListener(drawerlistener);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #945 <Method void addDrawerListener(DrawerLayout$DrawerListener)>
		mListener = drawerlistener;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #941 <Field DrawerLayout$DrawerListener mListener>
	//   15   29:return          
	}

	public void setDrawerLockMode(int i)
	{
		setDrawerLockMode(i, 3);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #883 <Method void setDrawerLockMode(int, int)>
		setDrawerLockMode(i, 5);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_5        
	//    7    9:invokevirtual   #883 <Method void setDrawerLockMode(int, int)>
	//    8   12:return          
	}

	public void setDrawerLockMode(int i, int j)
	{
		int k = GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #639 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_3        
		if(j != 3)
	//*   5    9:iload_2         
	//*   6   10:iconst_3        
	//*   7   11:icmpeq          60
		{
			if(j != 5)
	//*   8   14:iload_2         
	//*   9   15:iconst_5        
	//*  10   16:icmpeq          52
			{
				if(j != 0x800003)
	//*  11   19:iload_2         
	//*  12   20:ldc2            #670 <Int 0x800003>
	//*  13   23:icmpeq          44
				{
					if(j == 0x800005)
	//*  14   26:iload_2         
	//*  15   27:ldc2            #671 <Int 0x800005>
	//*  16   30:icmpeq          36
	//*  17   33:goto            65
						mLockModeEnd = i;
	//   18   36:aload_0         
	//   19   37:iload_1         
	//   20   38:putfield        #175 <Field int mLockModeEnd>
				} else
	//*  21   41:goto            65
				{
					mLockModeStart = i;
	//   22   44:aload_0         
	//   23   45:iload_1         
	//   24   46:putfield        #173 <Field int mLockModeStart>
				}
			} else
	//*  25   49:goto            65
			{
				mLockModeRight = i;
	//   26   52:aload_0         
	//   27   53:iload_1         
	//   28   54:putfield        #171 <Field int mLockModeRight>
			}
		} else
	//*  29   57:goto            65
		{
			mLockModeLeft = i;
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:putfield        #169 <Field int mLockModeLeft>
		}
		if(i != 0)
	//*  33   65:iload_1         
	//*  34   66:ifeq            94
		{
			ViewDragHelper viewdraghelper;
			if(k == 3)
	//*  35   69:iload_3         
	//*  36   70:iconst_3        
	//*  37   71:icmpne          83
				viewdraghelper = mLeftDragger;
	//   38   74:aload_0         
	//   39   75:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//   40   78:astore          4
			else
	//*  41   80:goto            89
				viewdraghelper = mRightDragger;
	//   42   83:aload_0         
	//   43   84:getfield        #236 <Field ViewDragHelper mRightDragger>
	//   44   87:astore          4
			viewdraghelper.cancel();
	//   45   89:aload           4
	//   46   91:invokevirtual   #949 <Method void ViewDragHelper.cancel()>
		}
		switch(i)
	//*  47   94:iload_1         
		{
	//*  48   95:tableswitch     1 2: default 116
	//	               1 136
	//	               2 117
		default:
			return;
	//   49  116:return          

		case 2: // '\002'
			View view = findDrawerWithGravity(k);
	//   50  117:aload_0         
	//   51  118:iload_3         
	//   52  119:invokevirtual   #455 <Method View findDrawerWithGravity(int)>
	//   53  122:astore          4
			if(view != null)
	//*  54  124:aload           4
	//*  55  126:ifnull          154
			{
				openDrawer(view);
	//   56  129:aload_0         
	//   57  130:aload           4
	//   58  132:invokevirtual   #877 <Method void openDrawer(View)>
				return;
	//   59  135:return          
			}
			break;

		case 1: // '\001'
			View view1 = findDrawerWithGravity(k);
	//   60  136:aload_0         
	//   61  137:iload_3         
	//   62  138:invokevirtual   #455 <Method View findDrawerWithGravity(int)>
	//   63  141:astore          4
			if(view1 != null)
	//*  64  143:aload           4
	//*  65  145:ifnull          154
				closeDrawer(view1);
	//   66  148:aload_0         
	//   67  149:aload           4
	//   68  151:invokevirtual   #951 <Method void closeDrawer(View)>
			break;
		}
	//   69  154:return          
	}

	public void setDrawerLockMode(int i, View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #375 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            58
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #457 <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #458 <Method void StringBuilder()>
	//    7   15:astore_3        
			stringbuilder.append("View ");
	//    8   16:aload_3         
	//    9   17:ldc2            #480 <String "View ">
	//   10   20:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
			stringbuilder.append(((Object) (view)));
	//   12   24:aload_3         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #483 <Method StringBuilder StringBuilder.append(Object)>
	//   15   29:pop             
			stringbuilder.append(" is not a ");
	//   16   30:aload_3         
	//   17   31:ldc2            #954 <String " is not a ">
	//   18   34:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append("drawer with appropriate layout_gravity");
	//   20   38:aload_3         
	//   21   39:ldc2            #956 <String "drawer with appropriate layout_gravity">
	//   22   42:invokevirtual   #464 <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   24   46:new             #468 <Class IllegalArgumentException>
	//   25   49:dup             
	//   26   50:aload_3         
	//   27   51:invokevirtual   #472 <Method String StringBuilder.toString()>
	//   28   54:invokespecial   #475 <Method void IllegalArgumentException(String)>
	//   29   57:athrow          
		} else
		{
			setDrawerLockMode(i, ((LayoutParams)view.getLayoutParams()).gravity);
	//   30   58:aload_0         
	//   31   59:iload_1         
	//   32   60:aload_2         
	//   33   61:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   34   64:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   35   67:getfield        #511 <Field int DrawerLayout$LayoutParams.gravity>
	//   36   70:invokevirtual   #883 <Method void setDrawerLockMode(int, int)>
			return;
	//   37   73:return          
		}
	}

	public void setDrawerShadow(int i, int j)
	{
		setDrawerShadow(ContextCompat.getDrawable(getContext(), i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #652 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #963 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #966 <Method void setDrawerShadow(Drawable, int)>
	//    7   13:return          
	}

	public void setDrawerShadow(Drawable drawable, int i)
	{
label0:
		{
			if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            7
				return;
	//    2    6:return          
			if((i & 0x800003) == 0x800003)
	//*   3    7:iload_2         
	//*   4    8:ldc2            #670 <Int 0x800003>
	//*   5   11:iand            
	//*   6   12:ldc2            #670 <Int 0x800003>
	//*   7   15:icmpne          26
				mShadowStart = drawable;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #177 <Field Drawable mShadowStart>
			else
	//*  11   23:goto            72
			if((i & 0x800005) == 0x800005)
	//*  12   26:iload_2         
	//*  13   27:ldc2            #671 <Int 0x800005>
	//*  14   30:iand            
	//*  15   31:ldc2            #671 <Int 0x800005>
	//*  16   34:icmpne          45
				mShadowEnd = drawable;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #179 <Field Drawable mShadowEnd>
			else
	//*  20   42:goto            72
			if((i & 3) == 3)
	//*  21   45:iload_2         
	//*  22   46:iconst_3        
	//*  23   47:iand            
	//*  24   48:iconst_3        
	//*  25   49:icmpne          60
			{
				mShadowLeft = drawable;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #181 <Field Drawable mShadowLeft>
			} else
	//*  29   57:goto            72
			{
				if((i & 5) != 5)
					break label0;
	//   30   60:iload_2         
	//   31   61:iconst_5        
	//   32   62:iand            
	//   33   63:iconst_5        
	//   34   64:icmpne          81
				mShadowRight = drawable;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:putfield        #183 <Field Drawable mShadowRight>
			}
			resolveShadowDrawables();
	//   38   72:aload_0         
	//   39   73:invokespecial   #895 <Method void resolveShadowDrawables()>
			invalidate();
	//   40   76:aload_0         
	//   41   77:invokevirtual   #521 <Method void invalidate()>
			return;
	//   42   80:return          
		}
	//   43   81:return          
	}

	public void setDrawerTitle(int i, CharSequence charsequence)
	{
		i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #358 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #639 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_1        
		if(i == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          20
		{
			mTitleLeft = charsequence;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #679 <Field CharSequence mTitleLeft>
			return;
	//   11   19:return          
		}
		if(i == 5)
	//*  12   20:iload_1         
	//*  13   21:iconst_5        
	//*  14   22:icmpne          30
			mTitleRight = charsequence;
	//   15   25:aload_0         
	//   16   26:aload_2         
	//   17   27:putfield        #681 <Field CharSequence mTitleRight>
	//   18   30:return          
	}

	void setDrawerViewOffset(View view, float f)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if(f == layoutparams.onScreen)
	//*   4    8:fload_2         
	//*   5    9:aload_3         
	//*   6   10:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
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
	//   12   20:putfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
			dispatchOnDrawerSlide(view, f);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #970 <Method void dispatchOnDrawerSlide(View, float)>
			return;
	//   17   29:return          
		}
	}

	public void setScrimColor(int i)
	{
		mScrimColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #160 <Field int mScrimColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #521 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackground(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = ContextCompat.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #652 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #963 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		mStatusBarBackground = drawable;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #282 <Field Drawable mStatusBarBackground>
		invalidate();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #521 <Method void invalidate()>
	//   15   27:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		mStatusBarBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #282 <Field Drawable mStatusBarBackground>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #521 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackgroundColor(int i)
	{
		mStatusBarBackground = ((Drawable) (new ColorDrawable(i)));
	//    0    0:aload_0         
	//    1    1:new             #977 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #979 <Method void ColorDrawable(int)>
	//    5    9:putfield        #282 <Field Drawable mStatusBarBackground>
		invalidate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #521 <Method void invalidate()>
	//    8   16:return          
	}

	void updateDrawerState(int i, int j, View view)
	{
		int k = mLeftDragger.getViewDragState();
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field ViewDragHelper mLeftDragger>
	//    2    4:invokevirtual   #982 <Method int ViewDragHelper.getViewDragState()>
	//    3    7:istore          5
		int l = mRightDragger.getViewDragState();
	//    4    9:aload_0         
	//    5   10:getfield        #236 <Field ViewDragHelper mRightDragger>
	//    6   13:invokevirtual   #982 <Method int ViewDragHelper.getViewDragState()>
	//    7   16:istore          6
		byte byte0 = 2;
	//    8   18:iconst_2        
	//    9   19:istore          4
		if(k != 1 && l != 1)
	//*  10   21:iload           5
	//*  11   23:iconst_1        
	//*  12   24:icmpeq          62
	//*  13   27:iload           6
	//*  14   29:iconst_1        
	//*  15   30:icmpne          36
	//*  16   33:goto            62
		{
			i = ((int) (byte0));
	//   17   36:iload           4
	//   18   38:istore_1        
			if(k != 2)
	//*  19   39:iload           5
	//*  20   41:iconst_2        
	//*  21   42:icmpeq          64
				if(l == 2)
	//*  22   45:iload           6
	//*  23   47:iconst_2        
	//*  24   48:icmpne          57
					i = ((int) (byte0));
	//   25   51:iload           4
	//   26   53:istore_1        
				else
	//*  27   54:goto            64
					i = 0;
	//   28   57:iconst_0        
	//   29   58:istore_1        
		} else
	//*  30   59:goto            64
		{
			i = 1;
	//   31   62:iconst_1        
	//   32   63:istore_1        
		}
		if(view != null && j == 0)
	//*  33   64:aload_3         
	//*  34   65:ifnull          114
	//*  35   68:iload_2         
	//*  36   69:ifne            114
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   37   72:aload_3         
	//   38   73:invokevirtual   #330 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   39   76:checkcast       #20  <Class DrawerLayout$LayoutParams>
	//   40   79:astore          7
			if(layoutparams.onScreen == 0.0F)
	//*  41   81:aload           7
	//*  42   83:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  43   86:fconst_0        
	//*  44   87:fcmpl           
	//*  45   88:ifne            99
				dispatchOnDrawerClosed(view);
	//   46   91:aload_0         
	//   47   92:aload_3         
	//   48   93:invokevirtual   #984 <Method void dispatchOnDrawerClosed(View)>
			else
	//*  49   96:goto            114
			if(layoutparams.onScreen == 1.0F)
	//*  50   99:aload           7
	//*  51  101:getfield        #488 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  52  104:fconst_1        
	//*  53  105:fcmpl           
	//*  54  106:ifne            114
				dispatchOnDrawerOpened(view);
	//   55  109:aload_0         
	//   56  110:aload_3         
	//   57  111:invokevirtual   #986 <Method void dispatchOnDrawerOpened(View)>
		}
		if(i != mDrawerState)
	//*  58  114:iload_1         
	//*  59  115:aload_0         
	//*  60  116:getfield        #988 <Field int mDrawerState>
	//*  61  119:icmpeq          176
		{
			mDrawerState = i;
	//   62  122:aload_0         
	//   63  123:iload_1         
	//   64  124:putfield        #988 <Field int mDrawerState>
			if(mListeners != null)
	//*  65  127:aload_0         
	//*  66  128:getfield        #379 <Field List mListeners>
	//*  67  131:ifnull          176
				for(j = mListeners.size() - 1; j >= 0; j--)
	//*  68  134:aload_0         
	//*  69  135:getfield        #379 <Field List mListeners>
	//*  70  138:invokeinterface #545 <Method int List.size()>
	//*  71  143:iconst_1        
	//*  72  144:isub            
	//*  73  145:istore_2        
	//*  74  146:iload_2         
	//*  75  147:iflt            176
					((DrawerListener)mListeners.get(j)).onDrawerStateChanged(i);
	//   76  150:aload_0         
	//   77  151:getfield        #379 <Field List mListeners>
	//   78  154:iload_2         
	//   79  155:invokeinterface #546 <Method Object List.get(int)>
	//   80  160:checkcast       #14  <Class DrawerLayout$DrawerListener>
	//   81  163:iload_1         
	//   82  164:invokeinterface #991 <Method void DrawerLayout$DrawerListener.onDrawerStateChanged(int)>

	//   83  169:iload_2         
	//   84  170:iconst_1        
	//   85  171:isub            
	//   86  172:istore_2        
		}
	//*  87  173:goto            146
	//   88  176:return          
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
	//*  18   29:icmplt          37
			flag = true;
	//   19   32:iconst_1        
	//   20   33:istore_0        
		else
	//*  21   34:goto            39
			flag = false;
	//   22   37:iconst_0        
	//   23   38:istore_0        
		CAN_HIDE_DESCENDANTS = flag;
	//   24   39:iload_0         
	//   25   40:putstatic       #140 <Field boolean CAN_HIDE_DESCENDANTS>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  26   43:getstatic       #138 <Field int android.os.Build$VERSION.SDK_INT>
	//*  27   46:bipush          21
	//*  28   48:icmplt          56
			flag = flag1;
	//   29   51:iload_1         
	//   30   52:istore_0        
		else
	//*  31   53:goto            58
			flag = false;
	//   32   56:iconst_0        
	//   33   57:istore_0        
		SET_DRAWER_SHADOW_FROM_ELEVATION = flag;
	//   34   58:iload_0         
	//   35   59:putstatic       #142 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*  36   62:return          
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
