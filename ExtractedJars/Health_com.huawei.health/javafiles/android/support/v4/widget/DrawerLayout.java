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
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.*;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayoutImpl, ViewDragHelper, DrawerLayoutCompatApi21

public class DrawerLayout extends ViewGroup
	implements DrawerLayoutImpl
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

	final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat
	{

		public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
		{
			super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
			if(!DrawerLayout.includeChildForAccessibility(view))
		//*   4    6:aload_1         
		//*   5    7:invokestatic    #25  <Method boolean DrawerLayout.includeChildForAccessibility(View)>
		//*   6   10:ifne            18
				accessibilitynodeinfocompat.setParent(((View) (null)));
		//    7   13:aload_2         
		//    8   14:aconst_null     
		//    9   15:invokevirtual   #31  <Method void AccessibilityNodeInfoCompat.setParent(View)>
		//   10   18:return          
		}

		final DrawerLayout this$0;

		ChildAccessibilityDelegate()
		{
			this$0 = DrawerLayout.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field DrawerLayout this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void AccessibilityDelegateCompat()>
		//    5    9:return          
		}
	}

	static interface DrawerLayoutCompatImpl
	{

		public abstract void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i);

		public abstract void configureApplyInsets(View view);

		public abstract void dispatchChildInsets(View view, Object obj, int i);

		public abstract Drawable getDefaultStatusBarBackground(Context context);

		public abstract int getTopInset(Object obj);
	}

	static class DrawerLayoutCompatImplApi21
		implements DrawerLayoutCompatImpl
	{

		public void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
		{
			DrawerLayoutCompatApi21.applyMarginInsets(marginlayoutparams, obj, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #20  <Method void DrawerLayoutCompatApi21.applyMarginInsets(android.view.ViewGroup$MarginLayoutParams, Object, int)>
		//    4    6:return          
		}

		public void configureApplyInsets(View view)
		{
			DrawerLayoutCompatApi21.configureApplyInsets(view);
		//    0    0:aload_1         
		//    1    1:invokestatic    #24  <Method void DrawerLayoutCompatApi21.configureApplyInsets(View)>
		//    2    4:return          
		}

		public void dispatchChildInsets(View view, Object obj, int i)
		{
			DrawerLayoutCompatApi21.dispatchChildInsets(view, obj, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #28  <Method void DrawerLayoutCompatApi21.dispatchChildInsets(View, Object, int)>
		//    4    6:return          
		}

		public Drawable getDefaultStatusBarBackground(Context context)
		{
			return DrawerLayoutCompatApi21.getDefaultStatusBarBackground(context);
		//    0    0:aload_1         
		//    1    1:invokestatic    #32  <Method Drawable DrawerLayoutCompatApi21.getDefaultStatusBarBackground(Context)>
		//    2    4:areturn         
		}

		public int getTopInset(Object obj)
		{
			return DrawerLayoutCompatApi21.getTopInset(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #36  <Method int DrawerLayoutCompatApi21.getTopInset(Object)>
		//    2    4:ireturn         
		}

		DrawerLayoutCompatImplApi21()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class DrawerLayoutCompatImplBase
		implements DrawerLayoutCompatImpl
	{

		public void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
		{
		//    0    0:return          
		}

		public void configureApplyInsets(View view)
		{
		//    0    0:return          
		}

		public void dispatchChildInsets(View view, Object obj, int i)
		{
		//    0    0:return          
		}

		public Drawable getDefaultStatusBarBackground(Context context)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getTopInset(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		DrawerLayoutCompatImplBase()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
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

	protected static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #58  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeInt(openDrawerGravity);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #37  <Field int openDrawerGravity>
		//    7   11:invokevirtual   #62  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeLeft);
		//    8   14:aload_1         
		//    9   15:aload_0         
		//   10   16:getfield        #45  <Field int lockModeLeft>
		//   11   19:invokevirtual   #62  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeRight);
		//   12   22:aload_1         
		//   13   23:aload_0         
		//   14   24:getfield        #47  <Field int lockModeRight>
		//   15   27:invokevirtual   #62  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeStart);
		//   16   30:aload_1         
		//   17   31:aload_0         
		//   18   32:getfield        #49  <Field int lockModeStart>
		//   19   35:invokevirtual   #62  <Method void Parcel.writeInt(int)>
			parcel.writeInt(lockModeEnd);
		//   20   38:aload_1         
		//   21   39:aload_0         
		//   22   40:getfield        #51  <Field int lockModeEnd>
		//   23   43:invokevirtual   #62  <Method void Parcel.writeInt(int)>
		//   24   46:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

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

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #25  <Method DrawerLayout$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #30  <Method DrawerLayout$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
);
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
		//    3    7:invokestatic    #29  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #31  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #35  <Method void AbsSavedState(Parcel, ClassLoader)>
			openDrawerGravity = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #37  <Field int openDrawerGravity>
			openDrawerGravity = parcel.readInt();
		//    7   11:aload_0         
		//    8   12:aload_1         
		//    9   13:invokevirtual   #43  <Method int Parcel.readInt()>
		//   10   16:putfield        #37  <Field int openDrawerGravity>
			lockModeLeft = parcel.readInt();
		//   11   19:aload_0         
		//   12   20:aload_1         
		//   13   21:invokevirtual   #43  <Method int Parcel.readInt()>
		//   14   24:putfield        #45  <Field int lockModeLeft>
			lockModeRight = parcel.readInt();
		//   15   27:aload_0         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #43  <Method int Parcel.readInt()>
		//   18   32:putfield        #47  <Field int lockModeRight>
			lockModeStart = parcel.readInt();
		//   19   35:aload_0         
		//   20   36:aload_1         
		//   21   37:invokevirtual   #43  <Method int Parcel.readInt()>
		//   22   40:putfield        #49  <Field int lockModeStart>
			lockModeEnd = parcel.readInt();
		//   23   43:aload_0         
		//   24   44:aload_1         
		//   25   45:invokevirtual   #43  <Method int Parcel.readInt()>
		//   26   48:putfield        #51  <Field int lockModeEnd>
		//   27   51:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #54  <Method void AbsSavedState(Parcelable)>
			openDrawerGravity = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #37  <Field int openDrawerGravity>
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

	class ViewDragCallback extends ViewDragHelper.Callback
	{

		private void closeOtherDrawer()
		{
			byte byte0;
			if(mAbsGravity == 3)
		//*   0    0:aload_0         
		//*   1    1:getfield        #31  <Field int mAbsGravity>
		//*   2    4:iconst_3        
		//*   3    5:icmpne          13
				byte0 = 5;
		//    4    8:iconst_5        
		//    5    9:istore_1        
			else
		//*   6   10:goto            15
				byte0 = 3;
		//    7   13:iconst_3        
		//    8   14:istore_1        
			View view = findDrawerWithGravity(((int) (byte0)));
		//    9   15:aload_0         
		//   10   16:getfield        #21  <Field DrawerLayout this$0>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   13   23:astore_2        
			if(view != null)
		//*  14   24:aload_2         
		//*  15   25:ifnull          36
				closeDrawer(view);
		//   16   28:aload_0         
		//   17   29:getfield        #21  <Field DrawerLayout this$0>
		//   18   32:aload_2         
		//   19   33:invokevirtual   #41  <Method void DrawerLayout.closeDrawer(View)>
		//   20   36:return          
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
			f1 = getDrawerViewOffset(view);
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field DrawerLayout this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #136 <Method float DrawerLayout.getDrawerViewOffset(View)>
		//    4    8:fstore_3        
			int j = view.getWidth();
		//    5    9:aload_1         
		//    6   10:invokevirtual   #53  <Method int View.getWidth()>
		//    7   13:istore          5
			int i;
			if(checkDrawerViewAbsoluteGravity(view, 3))
		//*   8   15:aload_0         
		//*   9   16:getfield        #21  <Field DrawerLayout this$0>
		//*  10   19:aload_1         
		//*  11   20:iconst_3        
		//*  12   21:invokevirtual   #47  <Method boolean DrawerLayout.checkDrawerViewAbsoluteGravity(View, int)>
		//*  13   24:ifeq            60
			{
				if(f > 0.0F || f == 0.0F && f1 > 0.5F)
		//*  14   27:fload_2         
		//*  15   28:fconst_0        
		//*  16   29:fcmpl           
		//*  17   30:ifgt            46
		//*  18   33:fload_2         
		//*  19   34:fconst_0        
		//*  20   35:fcmpl           
		//*  21   36:ifne            52
		//*  22   39:fload_3         
		//*  23   40:ldc1            #137 <Float 0.5F>
		//*  24   42:fcmpl           
		//*  25   43:ifle            52
					i = 0;
		//   26   46:iconst_0        
		//   27   47:istore          4
				else
		//*  28   49:goto            57
					i = -j;
		//   29   52:iload           5
		//   30   54:ineg            
		//   31   55:istore          4
			} else
		//*  32   57:goto            98
			{
				i = getWidth();
		//   33   60:aload_0         
		//   34   61:getfield        #21  <Field DrawerLayout this$0>
		//   35   64:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   36   67:istore          4
				if(f < 0.0F || f == 0.0F && f1 > 0.5F)
		//*  37   69:fload_2         
		//*  38   70:fconst_0        
		//*  39   71:fcmpg           
		//*  40   72:iflt            88
		//*  41   75:fload_2         
		//*  42   76:fconst_0        
		//*  43   77:fcmpl           
		//*  44   78:ifne            98
		//*  45   81:fload_3         
		//*  46   82:ldc1            #137 <Float 0.5F>
		//*  47   84:fcmpl           
		//*  48   85:ifle            98
					i -= j;
		//   49   88:iload           4
		//   50   90:iload           5
		//   51   92:isub            
		//   52   93:istore          4
			}
		//*  53   95:goto            98
			mDragger.settleCapturedViewAt(i, view.getTop());
		//   54   98:aload_0         
		//   55   99:getfield        #80  <Field ViewDragHelper mDragger>
		//   56  102:iload           4
		//   57  104:aload_1         
		//   58  105:invokevirtual   #67  <Method int View.getTop()>
		//   59  108:invokevirtual   #141 <Method boolean ViewDragHelper.settleCapturedViewAt(int, int)>
		//   60  111:pop             
			invalidate();
		//   61  112:aload_0         
		//   62  113:getfield        #21  <Field DrawerLayout this$0>
		//   63  116:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
		//   64  119:return          
		}

		void peekDrawer()
		{
			int j = mDragger.getEdgeSize();
		//    0    0:aload_0         
		//    1    1:getfield        #80  <Field ViewDragHelper mDragger>
		//    2    4:invokevirtual   #145 <Method int ViewDragHelper.getEdgeSize()>
		//    3    7:istore_3        
			boolean flag;
			if(mAbsGravity == 3)
		//*   4    8:aload_0         
		//*   5    9:getfield        #31  <Field int mAbsGravity>
		//*   6   12:iconst_3        
		//*   7   13:icmpne          21
				flag = true;
		//    8   16:iconst_1        
		//    9   17:istore_1        
			else
		//*  10   18:goto            23
				flag = false;
		//   11   21:iconst_0        
		//   12   22:istore_1        
			int i;
			View view;
			if(flag)
		//*  13   23:iload_1         
		//*  14   24:ifeq            61
			{
				view = findDrawerWithGravity(3);
		//   15   27:aload_0         
		//   16   28:getfield        #21  <Field DrawerLayout this$0>
		//   17   31:iconst_3        
		//   18   32:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   19   35:astore          4
				if(view != null)
		//*  20   37:aload           4
		//*  21   39:ifnull          52
					i = -view.getWidth();
		//   22   42:aload           4
		//   23   44:invokevirtual   #53  <Method int View.getWidth()>
		//   24   47:ineg            
		//   25   48:istore_2        
				else
		//*  26   49:goto            54
					i = 0;
		//   27   52:iconst_0        
		//   28   53:istore_2        
				i += j;
		//   29   54:iload_2         
		//   30   55:iload_3         
		//   31   56:iadd            
		//   32   57:istore_2        
			} else
		//*  33   58:goto            81
			{
				view = findDrawerWithGravity(5);
		//   34   61:aload_0         
		//   35   62:getfield        #21  <Field DrawerLayout this$0>
		//   36   65:iconst_5        
		//   37   66:invokevirtual   #37  <Method View DrawerLayout.findDrawerWithGravity(int)>
		//   38   69:astore          4
				i = getWidth() - j;
		//   39   71:aload_0         
		//   40   72:getfield        #21  <Field DrawerLayout this$0>
		//   41   75:invokevirtual   #63  <Method int DrawerLayout.getWidth()>
		//   42   78:iload_3         
		//   43   79:isub            
		//   44   80:istore_2        
			}
			if(view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && getDrawerLockMode(view) == 0)
		//*  45   81:aload           4
		//*  46   83:ifnull          174
		//*  47   86:iload_1         
		//*  48   87:ifeq            99
		//*  49   90:aload           4
		//*  50   92:invokevirtual   #148 <Method int View.getLeft()>
		//*  51   95:iload_2         
		//*  52   96:icmplt          112
		//*  53   99:iload_1         
		//*  54  100:ifne            174
		//*  55  103:aload           4
		//*  56  105:invokevirtual   #148 <Method int View.getLeft()>
		//*  57  108:iload_2         
		//*  58  109:icmple          174
		//*  59  112:aload_0         
		//*  60  113:getfield        #21  <Field DrawerLayout this$0>
		//*  61  116:aload           4
		//*  62  118:invokevirtual   #78  <Method int DrawerLayout.getDrawerLockMode(View)>
		//*  63  121:ifne            174
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
		//   64  124:aload           4
		//   65  126:invokevirtual   #100 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
		//   66  129:checkcast       #102 <Class DrawerLayout$LayoutParams>
		//   67  132:astore          5
				mDragger.smoothSlideViewTo(view, i, view.getTop());
		//   68  134:aload_0         
		//   69  135:getfield        #80  <Field ViewDragHelper mDragger>
		//   70  138:aload           4
		//   71  140:iload_2         
		//   72  141:aload           4
		//   73  143:invokevirtual   #67  <Method int View.getTop()>
		//   74  146:invokevirtual   #152 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
		//   75  149:pop             
				layoutparams.isPeeking = true;
		//   76  150:aload           5
		//   77  152:iconst_1        
		//   78  153:putfield        #106 <Field boolean DrawerLayout$LayoutParams.isPeeking>
				invalidate();
		//   79  156:aload_0         
		//   80  157:getfield        #21  <Field DrawerLayout this$0>
		//   81  160:invokevirtual   #130 <Method void DrawerLayout.invalidate()>
				closeOtherDrawer();
		//   82  163:aload_0         
		//   83  164:invokespecial   #108 <Method void closeOtherDrawer()>
				cancelChildViewTouch();
		//   84  167:aload_0         
		//   85  168:getfield        #21  <Field DrawerLayout this$0>
		//   86  171:invokevirtual   #155 <Method void DrawerLayout.cancelChildViewTouch()>
			}
		//   87  174:return          
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
	//    3    3:invokespecial   #151 <Method void DrawerLayout(Context, AttributeSet)>
	//    4    6:return          
	}

	public DrawerLayout(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #154 <Method void DrawerLayout(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public DrawerLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #155 <Method void ViewGroup(Context, AttributeSet, int)>
		mChildAccessibilityDelegate = new ChildAccessibilityDelegate();
	//    5    7:aload_0         
	//    6    8:new             #11  <Class DrawerLayout$ChildAccessibilityDelegate>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #158 <Method void DrawerLayout$ChildAccessibilityDelegate(DrawerLayout)>
	//   10   16:putfield        #160 <Field DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate>
		mScrimColor = 0x99000000;
	//   11   19:aload_0         
	//   12   20:ldc1            #49  <Int 0x99000000>
	//   13   22:putfield        #162 <Field int mScrimColor>
		mScrimPaint = new Paint();
	//   14   25:aload_0         
	//   15   26:new             #164 <Class Paint>
	//   16   29:dup             
	//   17   30:invokespecial   #165 <Method void Paint()>
	//   18   33:putfield        #167 <Field Paint mScrimPaint>
		mFirstLayout = true;
	//   19   36:aload_0         
	//   20   37:iconst_1        
	//   21   38:putfield        #169 <Field boolean mFirstLayout>
		mLockModeLeft = 3;
	//   22   41:aload_0         
	//   23   42:iconst_3        
	//   24   43:putfield        #171 <Field int mLockModeLeft>
		mLockModeRight = 3;
	//   25   46:aload_0         
	//   26   47:iconst_3        
	//   27   48:putfield        #173 <Field int mLockModeRight>
		mLockModeStart = 3;
	//   28   51:aload_0         
	//   29   52:iconst_3        
	//   30   53:putfield        #175 <Field int mLockModeStart>
		mLockModeEnd = 3;
	//   31   56:aload_0         
	//   32   57:iconst_3        
	//   33   58:putfield        #177 <Field int mLockModeEnd>
		mShadowStart = null;
	//   34   61:aload_0         
	//   35   62:aconst_null     
	//   36   63:putfield        #179 <Field Drawable mShadowStart>
		mShadowEnd = null;
	//   37   66:aload_0         
	//   38   67:aconst_null     
	//   39   68:putfield        #181 <Field Drawable mShadowEnd>
		mShadowLeft = null;
	//   40   71:aload_0         
	//   41   72:aconst_null     
	//   42   73:putfield        #183 <Field Drawable mShadowLeft>
		mShadowRight = null;
	//   43   76:aload_0         
	//   44   77:aconst_null     
	//   45   78:putfield        #185 <Field Drawable mShadowRight>
		setDescendantFocusability(0x40000);
	//   46   81:aload_0         
	//   47   82:ldc1            #186 <Int 0x40000>
	//   48   84:invokevirtual   #190 <Method void setDescendantFocusability(int)>
		float f = getResources().getDisplayMetrics().density;
	//   49   87:aload_0         
	//   50   88:invokevirtual   #194 <Method Resources getResources()>
	//   51   91:invokevirtual   #200 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   52   94:getfield        #205 <Field float DisplayMetrics.density>
	//   53   97:fstore          4
		mMinDrawerMargin = (int)(64F * f + 0.5F);
	//   54   99:aload_0         
	//   55  100:ldc1            #206 <Float 64F>
	//   56  102:fload           4
	//   57  104:fmul            
	//   58  105:ldc1            #207 <Float 0.5F>
	//   59  107:fadd            
	//   60  108:f2i             
	//   61  109:putfield        #209 <Field int mMinDrawerMargin>
		float f1 = 400F * f;
	//   62  112:ldc1            #210 <Float 400F>
	//   63  114:fload           4
	//   64  116:fmul            
	//   65  117:fstore          5
		mLeftCallback = new ViewDragCallback(3);
	//   66  119:aload_0         
	//   67  120:new             #37  <Class DrawerLayout$ViewDragCallback>
	//   68  123:dup             
	//   69  124:aload_0         
	//   70  125:iconst_3        
	//   71  126:invokespecial   #213 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
	//   72  129:putfield        #215 <Field DrawerLayout$ViewDragCallback mLeftCallback>
		mRightCallback = new ViewDragCallback(5);
	//   73  132:aload_0         
	//   74  133:new             #37  <Class DrawerLayout$ViewDragCallback>
	//   75  136:dup             
	//   76  137:aload_0         
	//   77  138:iconst_5        
	//   78  139:invokespecial   #213 <Method void DrawerLayout$ViewDragCallback(DrawerLayout, int)>
	//   79  142:putfield        #217 <Field DrawerLayout$ViewDragCallback mRightCallback>
		mLeftDragger = ViewDragHelper.create(((ViewGroup) (this)), 1.0F, ((ViewDragHelper.Callback) (mLeftCallback)));
	//   80  145:aload_0         
	//   81  146:aload_0         
	//   82  147:fconst_1        
	//   83  148:aload_0         
	//   84  149:getfield        #215 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   85  152:invokestatic    #223 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//   86  155:putfield        #225 <Field ViewDragHelper mLeftDragger>
		mLeftDragger.setEdgeTrackingEnabled(1);
	//   87  158:aload_0         
	//   88  159:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   89  162:iconst_1        
	//   90  163:invokevirtual   #228 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		mLeftDragger.setMinVelocity(f1);
	//   91  166:aload_0         
	//   92  167:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   93  170:fload           5
	//   94  172:invokevirtual   #232 <Method void ViewDragHelper.setMinVelocity(float)>
		mLeftCallback.setDragger(mLeftDragger);
	//   95  175:aload_0         
	//   96  176:getfield        #215 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   97  179:aload_0         
	//   98  180:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   99  183:invokevirtual   #236 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
		mRightDragger = ViewDragHelper.create(((ViewGroup) (this)), 1.0F, ((ViewDragHelper.Callback) (mRightCallback)));
	//  100  186:aload_0         
	//  101  187:aload_0         
	//  102  188:fconst_1        
	//  103  189:aload_0         
	//  104  190:getfield        #217 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//  105  193:invokestatic    #223 <Method ViewDragHelper ViewDragHelper.create(ViewGroup, float, ViewDragHelper$Callback)>
	//  106  196:putfield        #238 <Field ViewDragHelper mRightDragger>
		mRightDragger.setEdgeTrackingEnabled(2);
	//  107  199:aload_0         
	//  108  200:getfield        #238 <Field ViewDragHelper mRightDragger>
	//  109  203:iconst_2        
	//  110  204:invokevirtual   #228 <Method void ViewDragHelper.setEdgeTrackingEnabled(int)>
		mRightDragger.setMinVelocity(f1);
	//  111  207:aload_0         
	//  112  208:getfield        #238 <Field ViewDragHelper mRightDragger>
	//  113  211:fload           5
	//  114  213:invokevirtual   #232 <Method void ViewDragHelper.setMinVelocity(float)>
		mRightCallback.setDragger(mRightDragger);
	//  115  216:aload_0         
	//  116  217:getfield        #217 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//  117  220:aload_0         
	//  118  221:getfield        #238 <Field ViewDragHelper mRightDragger>
	//  119  224:invokevirtual   #236 <Method void DrawerLayout$ViewDragCallback.setDragger(ViewDragHelper)>
		setFocusableInTouchMode(true);
	//  120  227:aload_0         
	//  121  228:iconst_1        
	//  122  229:invokevirtual   #242 <Method void setFocusableInTouchMode(boolean)>
		ViewCompat.setImportantForAccessibility(((View) (this)), 1);
	//  123  232:aload_0         
	//  124  233:iconst_1        
	//  125  234:invokestatic    #248 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		ViewCompat.setAccessibilityDelegate(((View) (this)), ((AccessibilityDelegateCompat) (new AccessibilityDelegate())));
	//  126  237:aload_0         
	//  127  238:new             #8   <Class DrawerLayout$AccessibilityDelegate>
	//  128  241:dup             
	//  129  242:aload_0         
	//  130  243:invokespecial   #249 <Method void DrawerLayout$AccessibilityDelegate(DrawerLayout)>
	//  131  246:invokestatic    #253 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
		ViewGroupCompat.setMotionEventSplittingEnabled(((ViewGroup) (this)), false);
	//  132  249:aload_0         
	//  133  250:iconst_0        
	//  134  251:invokestatic    #259 <Method void ViewGroupCompat.setMotionEventSplittingEnabled(ViewGroup, boolean)>
		if(ViewCompat.getFitsSystemWindows(((View) (this))))
	//* 135  254:aload_0         
	//* 136  255:invokestatic    #263 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 137  258:ifeq            283
		{
			IMPL.configureApplyInsets(((View) (this)));
	//  138  261:getstatic       #145 <Field DrawerLayout$DrawerLayoutCompatImpl IMPL>
	//  139  264:aload_0         
	//  140  265:invokeinterface #267 <Method void DrawerLayout$DrawerLayoutCompatImpl.configureApplyInsets(View)>
			mStatusBarBackground = IMPL.getDefaultStatusBarBackground(context);
	//  141  270:aload_0         
	//  142  271:getstatic       #145 <Field DrawerLayout$DrawerLayoutCompatImpl IMPL>
	//  143  274:aload_1         
	//  144  275:invokeinterface #271 <Method Drawable DrawerLayout$DrawerLayoutCompatImpl.getDefaultStatusBarBackground(Context)>
	//  145  280:putfield        #273 <Field Drawable mStatusBarBackground>
		}
		mDrawerElevation = 10F * f;
	//  146  283:aload_0         
	//  147  284:ldc2            #274 <Float 10F>
	//  148  287:fload           4
	//  149  289:fmul            
	//  150  290:putfield        #276 <Field float mDrawerElevation>
		mNonDrawerViews = new ArrayList();
	//  151  293:aload_0         
	//  152  294:new             #278 <Class ArrayList>
	//  153  297:dup             
	//  154  298:invokespecial   #279 <Method void ArrayList()>
	//  155  301:putfield        #281 <Field ArrayList mNonDrawerViews>
	//  156  304:return          
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
	//    5    7:ldc2            #285 <String "LEFT">
	//    6   10:areturn         
		if((i & 5) == 5)
	//*   7   11:iload_0         
	//*   8   12:iconst_5        
	//*   9   13:iand            
	//*  10   14:iconst_5        
	//*  11   15:icmpne          22
			return "RIGHT";
	//   12   18:ldc2            #287 <String "RIGHT">
	//   13   21:areturn         
		else
			return Integer.toHexString(i);
	//   14   22:iload_0         
	//   15   23:invokestatic    #292 <Method String Integer.toHexString(int)>
	//   16   26:areturn         
	}

	private static boolean hasOpaqueBackground(View view)
	{
		view = ((View) (view.getBackground()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #299 <Method Drawable View.getBackground()>
	//    2    4:astore_0        
		if(view != null)
	//*   3    5:aload_0         
	//*   4    6:ifnull          21
			return ((Drawable) (view)).getOpacity() == -1;
	//    5    9:aload_0         
	//    6   10:invokevirtual   #305 <Method int Drawable.getOpacity()>
	//    7   13:iconst_m1       
	//    8   14:icmpne          19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
		else
			return false;
	//   13   21:iconst_0        
	//   14   22:ireturn         
	}

	private boolean hasPeekingDrawer()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #310 <Method int getChildCount()>
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
	//*  10   14:invokevirtual   #314 <Method View getChildAt(int)>
	//*  11   17:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  12   20:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//*  13   23:getfield        #321 <Field boolean DrawerLayout$LayoutParams.isPeeking>
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
	//    1    1:invokevirtual   #326 <Method View findVisibleDrawer()>
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
	//    1    1:invokestatic    #331 <Method int ViewCompat.getImportantForAccessibility(View)>
	//    2    4:iconst_4        
	//    3    5:icmpeq          18
	//    4    8:aload_0         
	//    5    9:invokestatic    #331 <Method int ViewCompat.getImportantForAccessibility(View)>
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
	//*   3    5:invokestatic    #339 <Method boolean DrawableCompat.isAutoMirrored(Drawable)>
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
	//    9   15:invokestatic    #342 <Method boolean DrawableCompat.setLayoutDirection(Drawable, int)>
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
	//    1    1:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(mShadowStart != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #179 <Field Drawable mShadowStart>
	//*   7   13:ifnull          53
			{
				mirror(mShadowStart, i);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #179 <Field Drawable mShadowStart>
	//   11   21:iload_1         
	//   12   22:invokespecial   #348 <Method boolean mirror(Drawable, int)>
	//   13   25:pop             
				return mShadowStart;
	//   14   26:aload_0         
	//   15   27:getfield        #179 <Field Drawable mShadowStart>
	//   16   30:areturn         
			}
		} else
		if(mShadowEnd != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #181 <Field Drawable mShadowEnd>
	//*  19   35:ifnull          53
		{
			mirror(mShadowEnd, i);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #181 <Field Drawable mShadowEnd>
	//   23   43:iload_1         
	//   24   44:invokespecial   #348 <Method boolean mirror(Drawable, int)>
	//   25   47:pop             
			return mShadowEnd;
	//   26   48:aload_0         
	//   27   49:getfield        #181 <Field Drawable mShadowEnd>
	//   28   52:areturn         
		}
		return mShadowLeft;
	//   29   53:aload_0         
	//   30   54:getfield        #183 <Field Drawable mShadowLeft>
	//   31   57:areturn         
	}

	private Drawable resolveRightShadow()
	{
		int i = ViewCompat.getLayoutDirection(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_1        
		if(i == 0)
	//*   3    5:iload_1         
	//*   4    6:ifne            31
		{
			if(mShadowEnd != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #181 <Field Drawable mShadowEnd>
	//*   7   13:ifnull          53
			{
				mirror(mShadowEnd, i);
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #181 <Field Drawable mShadowEnd>
	//   11   21:iload_1         
	//   12   22:invokespecial   #348 <Method boolean mirror(Drawable, int)>
	//   13   25:pop             
				return mShadowEnd;
	//   14   26:aload_0         
	//   15   27:getfield        #181 <Field Drawable mShadowEnd>
	//   16   30:areturn         
			}
		} else
		if(mShadowStart != null)
	//*  17   31:aload_0         
	//*  18   32:getfield        #179 <Field Drawable mShadowStart>
	//*  19   35:ifnull          53
		{
			mirror(mShadowStart, i);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #179 <Field Drawable mShadowStart>
	//   23   43:iload_1         
	//   24   44:invokespecial   #348 <Method boolean mirror(Drawable, int)>
	//   25   47:pop             
			return mShadowStart;
	//   26   48:aload_0         
	//   27   49:getfield        #179 <Field Drawable mShadowStart>
	//   28   52:areturn         
		}
		return mShadowRight;
	//   29   53:aload_0         
	//   30   54:getfield        #185 <Field Drawable mShadowRight>
	//   31   57:areturn         
	}

	private void resolveShadowDrawables()
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #140 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            7
		{
			return;
	//    2    6:return          
		} else
		{
			mShadowLeftResolved = resolveLeftShadow();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #352 <Method Drawable resolveLeftShadow()>
	//    6   12:putfield        #354 <Field Drawable mShadowLeftResolved>
			mShadowRightResolved = resolveRightShadow();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokespecial   #356 <Method Drawable resolveRightShadow()>
	//   10   20:putfield        #358 <Field Drawable mShadowRightResolved>
			return;
	//   11   23:return          
		}
	}

	private void updateChildrenImportantForAccessibility(View view, boolean flag)
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #310 <Method int getChildCount()>
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
	//   10   16:invokevirtual   #314 <Method View getChildAt(int)>
	//   11   19:astore          5
			if(!flag && !isDrawerView(view1) || flag && view1 == view)
	//*  12   21:iload_2         
	//*  13   22:ifne            34
	//*  14   25:aload_0         
	//*  15   26:aload           5
	//*  16   28:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*  17   31:ifeq            44
	//*  18   34:iload_2         
	//*  19   35:ifeq            53
	//*  20   38:aload           5
	//*  21   40:aload_1         
	//*  22   41:if_acmpne       53
				ViewCompat.setImportantForAccessibility(view1, 1);
	//   23   44:aload           5
	//   24   46:iconst_1        
	//   25   47:invokestatic    #248 <Method void ViewCompat.setImportantForAccessibility(View, int)>
			else
	//*  26   50:goto            59
				ViewCompat.setImportantForAccessibility(view1, 4);
	//   27   53:aload           5
	//   28   55:iconst_4        
	//   29   56:invokestatic    #248 <Method void ViewCompat.setImportantForAccessibility(View, int)>
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
	//*   4    6:getfield        #368 <Field List mListeners>
	//*   5    9:ifnonnull       23
			mListeners = ((List) (new ArrayList()));
	//    6   12:aload_0         
	//    7   13:new             #278 <Class ArrayList>
	//    8   16:dup             
	//    9   17:invokespecial   #279 <Method void ArrayList()>
	//   10   20:putfield        #368 <Field List mListeners>
		mListeners.add(((Object) (drawerlistener)));
	//   11   23:aload_0         
	//   12   24:getfield        #368 <Field List mListeners>
	//   13   27:aload_1         
	//   14   28:invokeinterface #374 <Method boolean List.add(Object)>
	//   15   33:pop             
	//   16   34:return          
	}

	public void addFocusables(ArrayList arraylist, int i, int j)
	{
		if(getDescendantFocusability() == 0x60000)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #380 <Method int getDescendantFocusability()>
	//*   2    4:ldc2            #381 <Int 0x60000>
	//*   3    7:icmpne          11
			return;
	//    4   10:return          
		int j1 = getChildCount();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #310 <Method int getChildCount()>
	//    7   15:istore          6
		boolean flag = false;
	//    8   17:iconst_0        
	//    9   18:istore          5
		for(int k = 0; k < j1; k++)
	//*  10   20:iconst_0        
	//*  11   21:istore          4
	//*  12   23:iload           4
	//*  13   25:iload           6
	//*  14   27:icmpge          89
		{
			View view = getChildAt(k);
	//   15   30:aload_0         
	//   16   31:iload           4
	//   17   33:invokevirtual   #314 <Method View getChildAt(int)>
	//   18   36:astore          7
			if(isDrawerView(view))
	//*  19   38:aload_0         
	//*  20   39:aload           7
	//*  21   41:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*  22   44:ifeq            70
			{
				if(isDrawerOpen(view))
	//*  23   47:aload_0         
	//*  24   48:aload           7
	//*  25   50:invokevirtual   #384 <Method boolean isDrawerOpen(View)>
	//*  26   53:ifeq            80
				{
					flag = true;
	//   27   56:iconst_1        
	//   28   57:istore          5
					view.addFocusables(arraylist, i, j);
	//   29   59:aload           7
	//   30   61:aload_1         
	//   31   62:iload_2         
	//   32   63:iload_3         
	//   33   64:invokevirtual   #386 <Method void View.addFocusables(ArrayList, int, int)>
				}
			} else
	//*  34   67:goto            80
			{
				mNonDrawerViews.add(((Object) (view)));
	//   35   70:aload_0         
	//   36   71:getfield        #281 <Field ArrayList mNonDrawerViews>
	//   37   74:aload           7
	//   38   76:invokevirtual   #387 <Method boolean ArrayList.add(Object)>
	//   39   79:pop             
			}
		}

	//   40   80:iload           4
	//   41   82:iconst_1        
	//   42   83:iadd            
	//   43   84:istore          4
	//*  44   86:goto            23
		if(!flag)
	//*  45   89:iload           5
	//*  46   91:ifne            152
		{
			int i1 = mNonDrawerViews.size();
	//   47   94:aload_0         
	//   48   95:getfield        #281 <Field ArrayList mNonDrawerViews>
	//   49   98:invokevirtual   #390 <Method int ArrayList.size()>
	//   50  101:istore          5
			for(int l = 0; l < i1; l++)
	//*  51  103:iconst_0        
	//*  52  104:istore          4
	//*  53  106:iload           4
	//*  54  108:iload           5
	//*  55  110:icmpge          152
			{
				View view1 = (View)mNonDrawerViews.get(l);
	//   56  113:aload_0         
	//   57  114:getfield        #281 <Field ArrayList mNonDrawerViews>
	//   58  117:iload           4
	//   59  119:invokevirtual   #394 <Method Object ArrayList.get(int)>
	//   60  122:checkcast       #295 <Class View>
	//   61  125:astore          7
				if(view1.getVisibility() == 0)
	//*  62  127:aload           7
	//*  63  129:invokevirtual   #397 <Method int View.getVisibility()>
	//*  64  132:ifne            143
					view1.addFocusables(arraylist, i, j);
	//   65  135:aload           7
	//   66  137:aload_1         
	//   67  138:iload_2         
	//   68  139:iload_3         
	//   69  140:invokevirtual   #386 <Method void View.addFocusables(ArrayList, int, int)>
			}

	//   70  143:iload           4
	//   71  145:iconst_1        
	//   72  146:iadd            
	//   73  147:istore          4
		}
	//*  74  149:goto            106
		mNonDrawerViews.clear();
	//   75  152:aload_0         
	//   76  153:getfield        #281 <Field ArrayList mNonDrawerViews>
	//   77  156:invokevirtual   #400 <Method void ArrayList.clear()>
	//   78  159:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #406 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(findOpenDrawer() != null || isDrawerView(view))
	//*   5    7:aload_0         
	//*   6    8:invokevirtual   #409 <Method View findOpenDrawer()>
	//*   7   11:ifnonnull       22
	//*   8   14:aload_0         
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*  11   19:ifeq            30
			ViewCompat.setImportantForAccessibility(view, 4);
	//   12   22:aload_1         
	//   13   23:iconst_4        
	//   14   24:invokestatic    #248 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		else
	//*  15   27:goto            35
			ViewCompat.setImportantForAccessibility(view, 1);
	//   16   30:aload_1         
	//   17   31:iconst_1        
	//   18   32:invokestatic    #248 <Method void ViewCompat.setImportantForAccessibility(View, int)>
		if(!CAN_HIDE_DESCENDANTS)
	//*  19   35:getstatic       #138 <Field boolean CAN_HIDE_DESCENDANTS>
	//*  20   38:ifne            49
			ViewCompat.setAccessibilityDelegate(view, ((AccessibilityDelegateCompat) (mChildAccessibilityDelegate)));
	//   21   41:aload_1         
	//   22   42:aload_0         
	//   23   43:getfield        #160 <Field DrawerLayout$ChildAccessibilityDelegate mChildAccessibilityDelegate>
	//   24   46:invokestatic    #253 <Method void ViewCompat.setAccessibilityDelegate(View, AccessibilityDelegateCompat)>
	//   25   49:return          
	}

	void cancelChildViewTouch()
	{
		if(!mChildrenCanceledTouch)
	//*   0    0:aload_0         
	//*   1    1:getfield        #412 <Field boolean mChildrenCanceledTouch>
	//*   2    4:ifne            62
		{
			long l = SystemClock.uptimeMillis();
	//    3    7:invokestatic    #418 <Method long SystemClock.uptimeMillis()>
	//    4   10:lstore_3        
			MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
	//    5   11:lload_3         
	//    6   12:lload_3         
	//    7   13:iconst_3        
	//    8   14:fconst_0        
	//    9   15:fconst_0        
	//   10   16:iconst_0        
	//   11   17:invokestatic    #424 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   12   20:astore          5
			int j = getChildCount();
	//   13   22:aload_0         
	//   14   23:invokevirtual   #310 <Method int getChildCount()>
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
	//   23   36:invokevirtual   #314 <Method View getChildAt(int)>
	//   24   39:aload           5
	//   25   41:invokevirtual   #428 <Method boolean View.dispatchTouchEvent(MotionEvent)>
	//   26   44:pop             

	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_1        
	//*  31   49:goto            29
			motionevent.recycle();
	//   32   52:aload           5
	//   33   54:invokevirtual   #431 <Method void MotionEvent.recycle()>
			mChildrenCanceledTouch = true;
	//   34   57:aload_0         
	//   35   58:iconst_1        
	//   36   59:putfield        #412 <Field boolean mChildrenCanceledTouch>
		}
	//   37   62:return          
	}

	boolean checkDrawerViewAbsoluteGravity(View view, int i)
	{
		return (getDrawerViewAbsoluteGravity(view) & i) == i;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #436 <Method int getDrawerViewAbsoluteGravity(View)>
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
	//    1    1:instanceof      #26  <Class DrawerLayout$LayoutParams>
	//    2    4:ifeq            17
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #440 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
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
	//    3    3:invokevirtual   #444 <Method void closeDrawer(int, boolean)>
	//    4    6:return          
	}

	public void closeDrawer(int i, boolean flag)
	{
		View view = findDrawerWithGravity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #447 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_3        
		if(view == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       41
		{
			throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(gravityToString(i)).toString());
	//    6   10:new             #449 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #451 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #452 <Method void StringBuilder()>
	//   11   21:ldc2            #454 <String "No drawer view found with gravity ">
	//   12   24:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_1         
	//   14   28:invokestatic    #460 <Method String gravityToString(int)>
	//   15   31:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   17   37:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		} else
		{
			closeDrawer(view, flag);
	//   19   41:aload_0         
	//   20   42:aload_3         
	//   21   43:iload_2         
	//   22   44:invokevirtual   #469 <Method void closeDrawer(View, boolean)>
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
	//    3    3:invokevirtual   #469 <Method void closeDrawer(View, boolean)>
	//    4    6:return          
	}

	public void closeDrawer(View view, boolean flag)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a sliding drawer").toString());
	//    4    8:new             #449 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #451 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #452 <Method void StringBuilder()>
	//    9   19:ldc2            #471 <String "View ">
	//   10   22:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #476 <String " is not a sliding drawer">
	//   14   32:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   42:aload_1         
	//   19   43:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   21   49:astore_3        
		if(mFirstLayout)
	//*  22   50:aload_0         
	//*  23   51:getfield        #169 <Field boolean mFirstLayout>
	//*  24   54:ifeq            70
		{
			layoutparams.onScreen = 0.0F;
	//   25   57:aload_3         
	//   26   58:fconst_0        
	//   27   59:putfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
			layoutparams.openState = 0;
	//   28   62:aload_3         
	//   29   63:iconst_0        
	//   30   64:putfield        #482 <Field int DrawerLayout$LayoutParams.openState>
		} else
	//*  31   67:goto            155
		if(flag)
	//*  32   70:iload_2         
	//*  33   71:ifeq            134
		{
			layoutparams.openState = layoutparams.openState | 4;
	//   34   74:aload_3         
	//   35   75:aload_3         
	//   36   76:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
	//   37   79:iconst_4        
	//   38   80:ior             
	//   39   81:putfield        #482 <Field int DrawerLayout$LayoutParams.openState>
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  40   84:aload_0         
	//*  41   85:aload_1         
	//*  42   86:iconst_3        
	//*  43   87:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  44   90:ifeq            114
				mLeftDragger.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
	//   45   93:aload_0         
	//   46   94:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   47   97:aload_1         
	//   48   98:aload_1         
	//   49   99:invokevirtual   #487 <Method int View.getWidth()>
	//   50  102:ineg            
	//   51  103:aload_1         
	//   52  104:invokevirtual   #490 <Method int View.getTop()>
	//   53  107:invokevirtual   #494 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   54  110:pop             
			else
	//*  55  111:goto            155
				mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop());
	//   56  114:aload_0         
	//   57  115:getfield        #238 <Field ViewDragHelper mRightDragger>
	//   58  118:aload_1         
	//   59  119:aload_0         
	//   60  120:invokevirtual   #495 <Method int getWidth()>
	//   61  123:aload_1         
	//   62  124:invokevirtual   #490 <Method int View.getTop()>
	//   63  127:invokevirtual   #494 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   64  130:pop             
		} else
	//*  65  131:goto            155
		{
			moveDrawerToOffset(view, 0.0F);
	//   66  134:aload_0         
	//   67  135:aload_1         
	//   68  136:fconst_0        
	//   69  137:invokevirtual   #499 <Method void moveDrawerToOffset(View, float)>
			updateDrawerState(layoutparams.gravity, 0, view);
	//   70  140:aload_0         
	//   71  141:aload_3         
	//   72  142:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//   73  145:iconst_0        
	//   74  146:aload_1         
	//   75  147:invokevirtual   #506 <Method void updateDrawerState(int, int, View)>
			view.setVisibility(4);
	//   76  150:aload_1         
	//   77  151:iconst_4        
	//   78  152:invokevirtual   #509 <Method void View.setVisibility(int)>
		}
		invalidate();
	//   79  155:aload_0         
	//   80  156:invokevirtual   #512 <Method void invalidate()>
	//   81  159:return          
	}

	public void closeDrawers()
	{
		closeDrawers(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #515 <Method void closeDrawers(boolean)>
	//    3    5:return          
	}

	void closeDrawers(boolean flag)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int l = getChildCount();
	//    2    2:aload_0         
	//    3    3:invokevirtual   #310 <Method int getChildCount()>
	//    4    6:istore          5
		for(int j = 0; j < l;)
	//*   5    8:iconst_0        
	//*   6    9:istore_3        
	//*   7   10:iload_3         
	//*   8   11:iload           5
	//*   9   13:icmpge          143
		{
			View view = getChildAt(j);
	//   10   16:aload_0         
	//   11   17:iload_3         
	//   12   18:invokevirtual   #314 <Method View getChildAt(int)>
	//   13   21:astore          6
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   14   23:aload           6
	//   15   25:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   16   28:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   17   31:astore          7
			int k = i;
	//   18   33:iload_2         
	//   19   34:istore          4
			if(isDrawerView(view))
	//*  20   36:aload_0         
	//*  21   37:aload           6
	//*  22   39:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*  23   42:ifeq            133
				if(flag && !layoutparams.isPeeking)
	//*  24   45:iload_1         
	//*  25   46:ifeq            63
	//*  26   49:aload           7
	//*  27   51:getfield        #321 <Field boolean DrawerLayout$LayoutParams.isPeeking>
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
	//   33   65:invokevirtual   #487 <Method int View.getWidth()>
	//   34   68:istore          4
					if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  35   70:aload_0         
	//*  36   71:aload           6
	//*  37   73:iconst_3        
	//*  38   74:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  39   77:ifeq            103
						i |= ((int) (mLeftDragger.smoothSlideViewTo(view, -k, view.getTop())));
	//   40   80:iload_2         
	//   41   81:aload_0         
	//   42   82:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   43   85:aload           6
	//   44   87:iload           4
	//   45   89:ineg            
	//   46   90:aload           6
	//   47   92:invokevirtual   #490 <Method int View.getTop()>
	//   48   95:invokevirtual   #494 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   49   98:ior             
	//   50   99:istore_2        
					else
	//*  51  100:goto            124
						i |= ((int) (mRightDragger.smoothSlideViewTo(view, getWidth(), view.getTop())));
	//   52  103:iload_2         
	//   53  104:aload_0         
	//   54  105:getfield        #238 <Field ViewDragHelper mRightDragger>
	//   55  108:aload           6
	//   56  110:aload_0         
	//   57  111:invokevirtual   #495 <Method int getWidth()>
	//   58  114:aload           6
	//   59  116:invokevirtual   #490 <Method int View.getTop()>
	//   60  119:invokevirtual   #494 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   61  122:ior             
	//   62  123:istore_2        
					layoutparams.isPeeking = false;
	//   63  124:aload           7
	//   64  126:iconst_0        
	//   65  127:putfield        #321 <Field boolean DrawerLayout$LayoutParams.isPeeking>
					k = i;
	//   66  130:iload_2         
	//   67  131:istore          4
				}
			j++;
	//   68  133:iload_3         
	//   69  134:iconst_1        
	//   70  135:iadd            
	//   71  136:istore_3        
			i = k;
	//   72  137:iload           4
	//   73  139:istore_2        
		}

	//*  74  140:goto            10
		mLeftCallback.removeCallbacks();
	//   75  143:aload_0         
	//   76  144:getfield        #215 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   77  147:invokevirtual   #518 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		mRightCallback.removeCallbacks();
	//   78  150:aload_0         
	//   79  151:getfield        #217 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   80  154:invokevirtual   #518 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
		if(i != 0)
	//*  81  157:iload_2         
	//*  82  158:ifeq            165
			invalidate();
	//   83  161:aload_0         
	//   84  162:invokevirtual   #512 <Method void invalidate()>
	//   85  165:return          
	}

	public void computeScroll()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #310 <Method int getChildCount()>
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
	//   13   17:invokevirtual   #314 <Method View getChildAt(int)>
	//   14   20:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   15   23:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   16   26:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//   17   29:invokestatic    #525 <Method float Math.max(float, float)>
	//   18   32:fstore_1        

	//   19   33:iload_2         
	//   20   34:iconst_1        
	//   21   35:iadd            
	//   22   36:istore_2        
	//*  23   37:goto            9
		mScrimOpacity = f;
	//   24   40:aload_0         
	//   25   41:fload_1         
	//   26   42:putfield        #527 <Field float mScrimOpacity>
		if(mLeftDragger.continueSettling(true) | mRightDragger.continueSettling(true))
	//*  27   45:aload_0         
	//*  28   46:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//*  29   49:iconst_1        
	//*  30   50:invokevirtual   #531 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*  31   53:aload_0         
	//*  32   54:getfield        #238 <Field ViewDragHelper mRightDragger>
	//*  33   57:iconst_1        
	//*  34   58:invokevirtual   #531 <Method boolean ViewDragHelper.continueSettling(boolean)>
	//*  35   61:ior             
	//*  36   62:ifeq            69
			ViewCompat.postInvalidateOnAnimation(((View) (this)));
	//   37   65:aload_0         
	//   38   66:invokestatic    #534 <Method void ViewCompat.postInvalidateOnAnimation(View)>
	//   39   69:return          
	}

	void dispatchOnDrawerClosed(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.openState & 1) == 1)
	//*   4    8:aload_3         
	//*   5    9:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:iconst_1        
	//*   9   15:icmpne          100
		{
			layoutparams.openState = 0;
	//   10   18:aload_3         
	//   11   19:iconst_0        
	//   12   20:putfield        #482 <Field int DrawerLayout$LayoutParams.openState>
			if(mListeners != null)
	//*  13   23:aload_0         
	//*  14   24:getfield        #368 <Field List mListeners>
	//*  15   27:ifnull          72
			{
				for(int i = mListeners.size() - 1; i >= 0; i--)
	//*  16   30:aload_0         
	//*  17   31:getfield        #368 <Field List mListeners>
	//*  18   34:invokeinterface #536 <Method int List.size()>
	//*  19   39:iconst_1        
	//*  20   40:isub            
	//*  21   41:istore_2        
	//*  22   42:iload_2         
	//*  23   43:iflt            72
					((DrawerListener)mListeners.get(i)).onDrawerClosed(view);
	//   24   46:aload_0         
	//   25   47:getfield        #368 <Field List mListeners>
	//   26   50:iload_2         
	//   27   51:invokeinterface #537 <Method Object List.get(int)>
	//   28   56:checkcast       #23  <Class DrawerLayout$DrawerListener>
	//   29   59:aload_1         
	//   30   60:invokeinterface #540 <Method void DrawerLayout$DrawerListener.onDrawerClosed(View)>

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
	//   39   75:invokespecial   #542 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  40   78:aload_0         
	//*  41   79:invokevirtual   #545 <Method boolean hasWindowFocus()>
	//*  42   82:ifeq            100
			{
				view = getRootView();
	//   43   85:aload_0         
	//   44   86:invokevirtual   #548 <Method View getRootView()>
	//   45   89:astore_1        
				if(view != null)
	//*  46   90:aload_1         
	//*  47   91:ifnull          100
					view.sendAccessibilityEvent(32);
	//   48   94:aload_1         
	//   49   95:bipush          32
	//   50   97:invokevirtual   #551 <Method void View.sendAccessibilityEvent(int)>
			}
		}
	//   51  100:return          
	}

	void dispatchOnDrawerOpened(View view)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if((layoutparams.openState & 1) == 0)
	//*   4    8:aload_3         
	//*   5    9:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
	//*   6   12:iconst_1        
	//*   7   13:iand            
	//*   8   14:ifne            90
		{
			layoutparams.openState = 1;
	//    9   17:aload_3         
	//   10   18:iconst_1        
	//   11   19:putfield        #482 <Field int DrawerLayout$LayoutParams.openState>
			if(mListeners != null)
	//*  12   22:aload_0         
	//*  13   23:getfield        #368 <Field List mListeners>
	//*  14   26:ifnull          71
			{
				for(int i = mListeners.size() - 1; i >= 0; i--)
	//*  15   29:aload_0         
	//*  16   30:getfield        #368 <Field List mListeners>
	//*  17   33:invokeinterface #536 <Method int List.size()>
	//*  18   38:iconst_1        
	//*  19   39:isub            
	//*  20   40:istore_2        
	//*  21   41:iload_2         
	//*  22   42:iflt            71
					((DrawerListener)mListeners.get(i)).onDrawerOpened(view);
	//   23   45:aload_0         
	//   24   46:getfield        #368 <Field List mListeners>
	//   25   49:iload_2         
	//   26   50:invokeinterface #537 <Method Object List.get(int)>
	//   27   55:checkcast       #23  <Class DrawerLayout$DrawerListener>
	//   28   58:aload_1         
	//   29   59:invokeinterface #555 <Method void DrawerLayout$DrawerListener.onDrawerOpened(View)>

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
	//   38   74:invokespecial   #542 <Method void updateChildrenImportantForAccessibility(View, boolean)>
			if(hasWindowFocus())
	//*  39   77:aload_0         
	//*  40   78:invokevirtual   #545 <Method boolean hasWindowFocus()>
	//*  41   81:ifeq            90
				sendAccessibilityEvent(32);
	//   42   84:aload_0         
	//   43   85:bipush          32
	//   44   87:invokevirtual   #556 <Method void sendAccessibilityEvent(int)>
		}
	//   45   90:return          
	}

	void dispatchOnDrawerSlide(View view, float f)
	{
		if(mListeners != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #368 <Field List mListeners>
	//*   2    4:ifnull          50
		{
			for(int i = mListeners.size() - 1; i >= 0; i--)
	//*   3    7:aload_0         
	//*   4    8:getfield        #368 <Field List mListeners>
	//*   5   11:invokeinterface #536 <Method int List.size()>
	//*   6   16:iconst_1        
	//*   7   17:isub            
	//*   8   18:istore_3        
	//*   9   19:iload_3         
	//*  10   20:iflt            50
				((DrawerListener)mListeners.get(i)).onDrawerSlide(view, f);
	//   11   23:aload_0         
	//   12   24:getfield        #368 <Field List mListeners>
	//   13   27:iload_3         
	//   14   28:invokeinterface #537 <Method Object List.get(int)>
	//   15   33:checkcast       #23  <Class DrawerLayout$DrawerListener>
	//   16   36:aload_1         
	//   17   37:fload_2         
	//   18   38:invokeinterface #560 <Method void DrawerLayout$DrawerListener.onDrawerSlide(View, float)>

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
		int i4 = getHeight();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #565 <Method int getHeight()>
	//    2    4:istore          12
		boolean flag1 = isContentView(view);
	//    3    6:aload_0         
	//    4    7:aload_2         
	//    5    8:invokevirtual   #568 <Method boolean isContentView(View)>
	//    6   11:istore          15
		int i = 0;
	//    7   13:iconst_0        
	//    8   14:istore          6
		boolean flag = false;
	//    9   16:iconst_0        
	//   10   17:istore          10
		int i1 = getWidth();
	//   11   19:aload_0         
	//   12   20:invokevirtual   #495 <Method int getWidth()>
	//   13   23:istore          7
		int j4 = canvas.save();
	//   14   25:aload_1         
	//   15   26:invokevirtual   #573 <Method int Canvas.save()>
	//   16   29:istore          13
		int i2 = i1;
	//   17   31:iload           7
	//   18   33:istore          8
		if(flag1)
	//*  19   35:iload           15
	//*  20   37:ifeq            256
		{
			int k4 = getChildCount();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #310 <Method int getChildCount()>
	//   23   44:istore          14
			int l2 = 0;
	//   24   46:iconst_0        
	//   25   47:istore          9
			i = ((int) (flag));
	//   26   49:iload           10
	//   27   51:istore          6
			while(l2 < k4) 
	//*  28   53:iload           9
	//*  29   55:iload           14
	//*  30   57:icmpge          238
			{
				View view1 = getChildAt(l2);
	//   31   60:aload_0         
	//   32   61:iload           9
	//   33   63:invokevirtual   #314 <Method View getChildAt(int)>
	//   34   66:astore          17
				i2 = i;
	//   35   68:iload           6
	//   36   70:istore          8
				int k3 = i1;
	//   37   72:iload           7
	//   38   74:istore          10
				if(view1 != view)
	//*  39   76:aload           17
	//*  40   78:aload_2         
	//*  41   79:if_acmpeq       221
				{
					i2 = i;
	//   42   82:iload           6
	//   43   84:istore          8
					k3 = i1;
	//   44   86:iload           7
	//   45   88:istore          10
					if(view1.getVisibility() == 0)
	//*  46   90:aload           17
	//*  47   92:invokevirtual   #397 <Method int View.getVisibility()>
	//*  48   95:ifne            221
					{
						i2 = i;
	//   49   98:iload           6
	//   50  100:istore          8
						k3 = i1;
	//   51  102:iload           7
	//   52  104:istore          10
						if(hasOpaqueBackground(view1))
	//*  53  106:aload           17
	//*  54  108:invokestatic    #575 <Method boolean hasOpaqueBackground(View)>
	//*  55  111:ifeq            221
						{
							i2 = i;
	//   56  114:iload           6
	//   57  116:istore          8
							k3 = i1;
	//   58  118:iload           7
	//   59  120:istore          10
							if(isDrawerView(view1))
	//*  60  122:aload_0         
	//*  61  123:aload           17
	//*  62  125:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*  63  128:ifeq            221
								if(view1.getHeight() < i4)
	//*  64  131:aload           17
	//*  65  133:invokevirtual   #576 <Method int View.getHeight()>
	//*  66  136:iload           12
	//*  67  138:icmpge          152
								{
									i2 = i;
	//   68  141:iload           6
	//   69  143:istore          8
									k3 = i1;
	//   70  145:iload           7
	//   71  147:istore          10
								} else
	//*  72  149:goto            221
								if(checkDrawerViewAbsoluteGravity(view1, 3))
	//*  73  152:aload_0         
	//*  74  153:aload           17
	//*  75  155:iconst_3        
	//*  76  156:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  77  159:ifeq            191
								{
									k3 = view1.getRight();
	//   78  162:aload           17
	//   79  164:invokevirtual   #579 <Method int View.getRight()>
	//   80  167:istore          10
									i2 = i;
	//   81  169:iload           6
	//   82  171:istore          8
									if(k3 > i)
	//*  83  173:iload           10
	//*  84  175:iload           6
	//*  85  177:icmple          184
										i2 = k3;
	//   86  180:iload           10
	//   87  182:istore          8
									k3 = i1;
	//   88  184:iload           7
	//   89  186:istore          10
								} else
	//*  90  188:goto            221
								{
									int l3 = view1.getLeft();
	//   91  191:aload           17
	//   92  193:invokevirtual   #582 <Method int View.getLeft()>
	//   93  196:istore          11
									i2 = i;
	//   94  198:iload           6
	//   95  200:istore          8
									k3 = i1;
	//   96  202:iload           7
	//   97  204:istore          10
									if(l3 < i1)
	//*  98  206:iload           11
	//*  99  208:iload           7
	//* 100  210:icmpge          221
									{
										k3 = l3;
	//  101  213:iload           11
	//  102  215:istore          10
										i2 = i;
	//  103  217:iload           6
	//  104  219:istore          8
									}
								}
						}
					}
				}
				l2++;
	//  105  221:iload           9
	//  106  223:iconst_1        
	//  107  224:iadd            
	//  108  225:istore          9
				i = i2;
	//  109  227:iload           8
	//  110  229:istore          6
				i1 = k3;
	//  111  231:iload           10
	//  112  233:istore          7
			}
	//* 113  235:goto            53
			canvas.clipRect(i, 0, i1, getHeight());
	//  114  238:aload_1         
	//  115  239:iload           6
	//  116  241:iconst_0        
	//  117  242:iload           7
	//  118  244:aload_0         
	//  119  245:invokevirtual   #565 <Method int getHeight()>
	//  120  248:invokevirtual   #586 <Method boolean Canvas.clipRect(int, int, int, int)>
	//  121  251:pop             
			i2 = i1;
	//  122  252:iload           7
	//  123  254:istore          8
		}
		boolean flag2 = super.drawChild(canvas, view, l);
	//  124  256:aload_0         
	//  125  257:aload_1         
	//  126  258:aload_2         
	//  127  259:lload_3         
	//  128  260:invokespecial   #588 <Method boolean ViewGroup.drawChild(Canvas, View, long)>
	//  129  263:istore          16
		canvas.restoreToCount(j4);
	//  130  265:aload_1         
	//  131  266:iload           13
	//  132  268:invokevirtual   #591 <Method void Canvas.restoreToCount(int)>
		if(mScrimOpacity > 0.0F && flag1)
	//* 133  271:aload_0         
	//* 134  272:getfield        #527 <Field float mScrimOpacity>
	//* 135  275:fconst_0        
	//* 136  276:fcmpl           
	//* 137  277:ifle            353
	//* 138  280:iload           15
	//* 139  282:ifeq            353
		{
			int j1 = (int)((float)((mScrimColor & 0xff000000) >>> 24) * mScrimOpacity);
	//  140  285:aload_0         
	//  141  286:getfield        #162 <Field int mScrimColor>
	//  142  289:ldc2            #592 <Int 0xff000000>
	//  143  292:iand            
	//  144  293:bipush          24
	//  145  295:iushr           
	//  146  296:i2f             
	//  147  297:aload_0         
	//  148  298:getfield        #527 <Field float mScrimOpacity>
	//  149  301:fmul            
	//  150  302:f2i             
	//  151  303:istore          7
			int i3 = mScrimColor;
	//  152  305:aload_0         
	//  153  306:getfield        #162 <Field int mScrimColor>
	//  154  309:istore          9
			mScrimPaint.setColor(j1 << 24 | i3 & 0xffffff);
	//  155  311:aload_0         
	//  156  312:getfield        #167 <Field Paint mScrimPaint>
	//  157  315:iload           7
	//  158  317:bipush          24
	//  159  319:ishl            
	//  160  320:iload           9
	//  161  322:ldc2            #593 <Int 0xffffff>
	//  162  325:iand            
	//  163  326:ior             
	//  164  327:invokevirtual   #596 <Method void Paint.setColor(int)>
			canvas.drawRect(i, 0.0F, i2, getHeight(), mScrimPaint);
	//  165  330:aload_1         
	//  166  331:iload           6
	//  167  333:i2f             
	//  168  334:fconst_0        
	//  169  335:iload           8
	//  170  337:i2f             
	//  171  338:aload_0         
	//  172  339:invokevirtual   #565 <Method int getHeight()>
	//  173  342:i2f             
	//  174  343:aload_0         
	//  175  344:getfield        #167 <Field Paint mScrimPaint>
	//  176  347:invokevirtual   #600 <Method void Canvas.drawRect(float, float, float, float, Paint)>
			return flag2;
	//  177  350:iload           16
	//  178  352:ireturn         
		}
		if(mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3))
	//* 179  353:aload_0         
	//* 180  354:getfield        #354 <Field Drawable mShadowLeftResolved>
	//* 181  357:ifnull          457
	//* 182  360:aload_0         
	//* 183  361:aload_2         
	//* 184  362:iconst_3        
	//* 185  363:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 186  366:ifeq            457
		{
			int j = mShadowLeftResolved.getIntrinsicWidth();
	//  187  369:aload_0         
	//  188  370:getfield        #354 <Field Drawable mShadowLeftResolved>
	//  189  373:invokevirtual   #603 <Method int Drawable.getIntrinsicWidth()>
	//  190  376:istore          6
			int k1 = view.getRight();
	//  191  378:aload_2         
	//  192  379:invokevirtual   #579 <Method int View.getRight()>
	//  193  382:istore          7
			int j2 = mLeftDragger.getEdgeSize();
	//  194  384:aload_0         
	//  195  385:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//  196  388:invokevirtual   #606 <Method int ViewDragHelper.getEdgeSize()>
	//  197  391:istore          8
			float f = Math.max(0.0F, Math.min((float)k1 / (float)j2, 1.0F));
	//  198  393:fconst_0        
	//  199  394:iload           7
	//  200  396:i2f             
	//  201  397:iload           8
	//  202  399:i2f             
	//  203  400:fdiv            
	//  204  401:fconst_1        
	//  205  402:invokestatic    #609 <Method float Math.min(float, float)>
	//  206  405:invokestatic    #525 <Method float Math.max(float, float)>
	//  207  408:fstore          5
			mShadowLeftResolved.setBounds(k1, view.getTop(), k1 + j, view.getBottom());
	//  208  410:aload_0         
	//  209  411:getfield        #354 <Field Drawable mShadowLeftResolved>
	//  210  414:iload           7
	//  211  416:aload_2         
	//  212  417:invokevirtual   #490 <Method int View.getTop()>
	//  213  420:iload           7
	//  214  422:iload           6
	//  215  424:iadd            
	//  216  425:aload_2         
	//  217  426:invokevirtual   #612 <Method int View.getBottom()>
	//  218  429:invokevirtual   #616 <Method void Drawable.setBounds(int, int, int, int)>
			mShadowLeftResolved.setAlpha((int)(255F * f));
	//  219  432:aload_0         
	//  220  433:getfield        #354 <Field Drawable mShadowLeftResolved>
	//  221  436:ldc2            #617 <Float 255F>
	//  222  439:fload           5
	//  223  441:fmul            
	//  224  442:f2i             
	//  225  443:invokevirtual   #620 <Method void Drawable.setAlpha(int)>
			mShadowLeftResolved.draw(canvas);
	//  226  446:aload_0         
	//  227  447:getfield        #354 <Field Drawable mShadowLeftResolved>
	//  228  450:aload_1         
	//  229  451:invokevirtual   #624 <Method void Drawable.draw(Canvas)>
			return flag2;
	//  230  454:iload           16
	//  231  456:ireturn         
		}
		if(mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5))
	//* 232  457:aload_0         
	//* 233  458:getfield        #358 <Field Drawable mShadowRightResolved>
	//* 234  461:ifnull          567
	//* 235  464:aload_0         
	//* 236  465:aload_2         
	//* 237  466:iconst_5        
	//* 238  467:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//* 239  470:ifeq            567
		{
			int k = mShadowRightResolved.getIntrinsicWidth();
	//  240  473:aload_0         
	//  241  474:getfield        #358 <Field Drawable mShadowRightResolved>
	//  242  477:invokevirtual   #603 <Method int Drawable.getIntrinsicWidth()>
	//  243  480:istore          6
			int l1 = view.getLeft();
	//  244  482:aload_2         
	//  245  483:invokevirtual   #582 <Method int View.getLeft()>
	//  246  486:istore          7
			int k2 = getWidth();
	//  247  488:aload_0         
	//  248  489:invokevirtual   #495 <Method int getWidth()>
	//  249  492:istore          8
			int j3 = mRightDragger.getEdgeSize();
	//  250  494:aload_0         
	//  251  495:getfield        #238 <Field ViewDragHelper mRightDragger>
	//  252  498:invokevirtual   #606 <Method int ViewDragHelper.getEdgeSize()>
	//  253  501:istore          9
			float f1 = Math.max(0.0F, Math.min((float)(k2 - l1) / (float)j3, 1.0F));
	//  254  503:fconst_0        
	//  255  504:iload           8
	//  256  506:iload           7
	//  257  508:isub            
	//  258  509:i2f             
	//  259  510:iload           9
	//  260  512:i2f             
	//  261  513:fdiv            
	//  262  514:fconst_1        
	//  263  515:invokestatic    #609 <Method float Math.min(float, float)>
	//  264  518:invokestatic    #525 <Method float Math.max(float, float)>
	//  265  521:fstore          5
			mShadowRightResolved.setBounds(l1 - k, view.getTop(), l1, view.getBottom());
	//  266  523:aload_0         
	//  267  524:getfield        #358 <Field Drawable mShadowRightResolved>
	//  268  527:iload           7
	//  269  529:iload           6
	//  270  531:isub            
	//  271  532:aload_2         
	//  272  533:invokevirtual   #490 <Method int View.getTop()>
	//  273  536:iload           7
	//  274  538:aload_2         
	//  275  539:invokevirtual   #612 <Method int View.getBottom()>
	//  276  542:invokevirtual   #616 <Method void Drawable.setBounds(int, int, int, int)>
			mShadowRightResolved.setAlpha((int)(255F * f1));
	//  277  545:aload_0         
	//  278  546:getfield        #358 <Field Drawable mShadowRightResolved>
	//  279  549:ldc2            #617 <Float 255F>
	//  280  552:fload           5
	//  281  554:fmul            
	//  282  555:f2i             
	//  283  556:invokevirtual   #620 <Method void Drawable.setAlpha(int)>
			mShadowRightResolved.draw(canvas);
	//  284  559:aload_0         
	//  285  560:getfield        #358 <Field Drawable mShadowRightResolved>
	//  286  563:aload_1         
	//  287  564:invokevirtual   #624 <Method void Drawable.draw(Canvas)>
		}
		return flag2;
	//  288  567:iload           16
	//  289  569:ireturn         
	}

	View findDrawerWithGravity(int i)
	{
		int j = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #630 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_2        
		int k = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #310 <Method int getChildCount()>
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
	//   15   23:invokevirtual   #314 <Method View getChildAt(int)>
	//   16   26:astore          4
			if((getDrawerViewAbsoluteGravity(view) & 7) == (j & 7))
	//*  17   28:aload_0         
	//*  18   29:aload           4
	//*  19   31:invokevirtual   #436 <Method int getDrawerViewAbsoluteGravity(View)>
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
	//    1    1:invokevirtual   #310 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #314 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if((((LayoutParams)view.getLayoutParams()).openState & 1) == 1)
	//*  12   18:aload_3         
	//*  13   19:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  14   22:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//*  15   25:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
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
	//    1    1:invokevirtual   #310 <Method int getChildCount()>
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
	//   10   14:invokevirtual   #314 <Method View getChildAt(int)>
	//   11   17:astore_3        
			if(isDrawerView(view) && isDrawerVisible(view))
	//*  12   18:aload_0         
	//*  13   19:aload_3         
	//*  14   20:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*  15   23:ifeq            36
	//*  16   26:aload_0         
	//*  17   27:aload_3         
	//*  18   28:invokevirtual   #633 <Method boolean isDrawerVisible(View)>
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
	//    0    0:new             #26  <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:iconst_m1       
	//    4    6:invokespecial   #637 <Method void DrawerLayout$LayoutParams(int, int)>
	//    5    9:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(getContext(), attributeset)));
	//    0    0:new             #26  <Class DrawerLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #643 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #644 <Method void DrawerLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #26  <Class DrawerLayout$LayoutParams>
	//*   2    4:ifeq            19
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((LayoutParams)layoutparams)));
	//    3    7:new             #26  <Class DrawerLayout$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    7   15:invokespecial   #648 <Method void DrawerLayout$LayoutParams(DrawerLayout$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #650 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  11   23:ifeq            38
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams)));
	//   12   26:new             #26  <Class DrawerLayout$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #650 <Class android.view.ViewGroup$MarginLayoutParams>
	//   16   34:invokespecial   #653 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   17   37:areturn         
		else
			return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//   18   38:new             #26  <Class DrawerLayout$LayoutParams>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #656 <Method void DrawerLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   22   46:areturn         
	}

	public float getDrawerElevation()
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #140 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            11
			return mDrawerElevation;
	//    2    6:aload_0         
	//    3    7:getfield        #276 <Field float mDrawerElevation>
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
	//    1    1:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    2    4:istore_2        
		switch(i)
	//*   3    5:iload_1         
		{
		default:
			break;

	//*   4    6:lookupswitch    4: default 48
	//	               3: 51
	//	               5: 88
	//	               8388611: 125
	//	               8388613: 162
	//*   5   48:goto            199
		case 3: // '\003'
			if(mLockModeLeft != 3)
	//*   6   51:aload_0         
	//*   7   52:getfield        #171 <Field int mLockModeLeft>
	//*   8   55:iconst_3        
	//*   9   56:icmpeq          64
				return mLockModeLeft;
	//   10   59:aload_0         
	//   11   60:getfield        #171 <Field int mLockModeLeft>
	//   12   63:ireturn         
			if(j == 0)
	//*  13   64:iload_2         
	//*  14   65:ifne            76
				i = mLockModeStart;
	//   15   68:aload_0         
	//   16   69:getfield        #175 <Field int mLockModeStart>
	//   17   72:istore_1        
			else
	//*  18   73:goto            81
				i = mLockModeEnd;
	//   19   76:aload_0         
	//   20   77:getfield        #177 <Field int mLockModeEnd>
	//   21   80:istore_1        
			if(i != 3)
	//*  22   81:iload_1         
	//*  23   82:iconst_3        
	//*  24   83:icmpeq          199
				return i;
	//   25   86:iload_1         
	//   26   87:ireturn         
			break;

		case 5: // '\005'
			if(mLockModeRight != 3)
	//*  27   88:aload_0         
	//*  28   89:getfield        #173 <Field int mLockModeRight>
	//*  29   92:iconst_3        
	//*  30   93:icmpeq          101
				return mLockModeRight;
	//   31   96:aload_0         
	//   32   97:getfield        #173 <Field int mLockModeRight>
	//   33  100:ireturn         
			if(j == 0)
	//*  34  101:iload_2         
	//*  35  102:ifne            113
				i = mLockModeEnd;
	//   36  105:aload_0         
	//   37  106:getfield        #177 <Field int mLockModeEnd>
	//   38  109:istore_1        
			else
	//*  39  110:goto            118
				i = mLockModeStart;
	//   40  113:aload_0         
	//   41  114:getfield        #175 <Field int mLockModeStart>
	//   42  117:istore_1        
			if(i != 3)
	//*  43  118:iload_1         
	//*  44  119:iconst_3        
	//*  45  120:icmpeq          199
				return i;
	//   46  123:iload_1         
	//   47  124:ireturn         
			break;

		case 8388611: 
			if(mLockModeStart != 3)
	//*  48  125:aload_0         
	//*  49  126:getfield        #175 <Field int mLockModeStart>
	//*  50  129:iconst_3        
	//*  51  130:icmpeq          138
				return mLockModeStart;
	//   52  133:aload_0         
	//   53  134:getfield        #175 <Field int mLockModeStart>
	//   54  137:ireturn         
			if(j == 0)
	//*  55  138:iload_2         
	//*  56  139:ifne            150
				i = mLockModeLeft;
	//   57  142:aload_0         
	//   58  143:getfield        #171 <Field int mLockModeLeft>
	//   59  146:istore_1        
			else
	//*  60  147:goto            155
				i = mLockModeRight;
	//   61  150:aload_0         
	//   62  151:getfield        #173 <Field int mLockModeRight>
	//   63  154:istore_1        
			if(i != 3)
	//*  64  155:iload_1         
	//*  65  156:iconst_3        
	//*  66  157:icmpeq          199
				return i;
	//   67  160:iload_1         
	//   68  161:ireturn         
			break;

		case 8388613: 
			if(mLockModeEnd != 3)
	//*  69  162:aload_0         
	//*  70  163:getfield        #177 <Field int mLockModeEnd>
	//*  71  166:iconst_3        
	//*  72  167:icmpeq          175
				return mLockModeEnd;
	//   73  170:aload_0         
	//   74  171:getfield        #177 <Field int mLockModeEnd>
	//   75  174:ireturn         
			if(j == 0)
	//*  76  175:iload_2         
	//*  77  176:ifne            187
				i = mLockModeRight;
	//   78  179:aload_0         
	//   79  180:getfield        #173 <Field int mLockModeRight>
	//   80  183:istore_1        
			else
	//*  81  184:goto            192
				i = mLockModeLeft;
	//   82  187:aload_0         
	//   83  188:getfield        #171 <Field int mLockModeLeft>
	//   84  191:istore_1        
			if(i != 3)
	//*  85  192:iload_1         
	//*  86  193:iconst_3        
	//*  87  194:icmpeq          199
				return i;
	//   88  197:iload_1         
	//   89  198:ireturn         
			break;
		}
		return 0;
	//   90  199:iconst_0        
	//   91  200:ireturn         
	}

	public int getDrawerLockMode(View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a drawer").toString());
	//    4    8:new             #449 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #451 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #452 <Method void StringBuilder()>
	//    9   19:ldc2            #471 <String "View ">
	//   10   22:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #662 <String " is not a drawer">
	//   14   32:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		else
			return getDrawerLockMode(((LayoutParams)view.getLayoutParams()).gravity);
	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   21   47:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   22   50:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//   23   53:invokevirtual   #664 <Method int getDrawerLockMode(int)>
	//   24   56:ireturn         
	}

	public CharSequence getDrawerTitle(int i)
	{
		i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #630 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_1        
		if(i == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          19
			return mTitleLeft;
	//    8   14:aload_0         
	//    9   15:getfield        #668 <Field CharSequence mTitleLeft>
	//   10   18:areturn         
		if(i == 5)
	//*  11   19:iload_1         
	//*  12   20:iconst_5        
	//*  13   21:icmpne          29
			return mTitleRight;
	//   14   24:aload_0         
	//   15   25:getfield        #670 <Field CharSequence mTitleRight>
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
	//    1    1:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_0         
	//    5   11:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #630 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    7   17:ireturn         
	}

	float getDrawerViewOffset(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).onScreen;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//    4   10:freturn         
	}

	public Drawable getStatusBarBackgroundDrawable()
	{
		return mStatusBarBackground;
	//    0    0:aload_0         
	//    1    1:getfield        #273 <Field Drawable mStatusBarBackground>
	//    2    4:areturn         
	}

	boolean isContentView(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).gravity == 0;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
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
	//    2    2:invokevirtual   #447 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return isDrawerOpen(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #384 <Method boolean isDrawerOpen(View)>
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
	//*   2    2:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a drawer").toString());
	//    4    8:new             #449 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #451 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #452 <Method void StringBuilder()>
	//    9   19:ldc2            #471 <String "View ">
	//   10   22:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #662 <String " is not a drawer">
	//   14   32:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		return (((LayoutParams)view.getLayoutParams()).openState & 1) == 1;
	//   18   42:aload_1         
	//   19   43:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   21   49:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
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
	//    1    1:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    3    7:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//    4   10:aload_1         
	//    5   11:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    6   14:invokestatic    #630 <Method int GravityCompat.getAbsoluteGravity(int, int)>
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
	//    2    2:invokevirtual   #447 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_2        
		if(view != null)
	//*   4    6:aload_2         
	//*   5    7:ifnull          16
			return isDrawerVisible(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #633 <Method boolean isDrawerVisible(View)>
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
	//*   2    2:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a drawer").toString());
	//    4    8:new             #449 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #451 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #452 <Method void StringBuilder()>
	//    9   19:ldc2            #471 <String "View ">
	//   10   22:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #662 <String " is not a drawer">
	//   14   32:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		return ((LayoutParams)view.getLayoutParams()).onScreen > 0.0F;
	//   18   42:aload_1         
	//   19   43:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   21   49:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
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
	//    2    2:invokevirtual   #677 <Method float getDrawerViewOffset(View)>
	//    3    5:fstore_3        
		int i = view.getWidth();
	//    4    6:aload_1         
	//    5    7:invokevirtual   #487 <Method int View.getWidth()>
	//    6   10:istore          4
		int j = (int)((float)i * f1);
	//    7   12:iload           4
	//    8   14:i2f             
	//    9   15:fload_3         
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
	//*  24   34:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  25   37:ifeq            43
	//*  26   40:goto            48
			i = -i;
	//   27   43:iload           4
	//   28   45:ineg            
	//   29   46:istore          4
		view.offsetLeftAndRight(i);
	//   30   48:aload_1         
	//   31   49:iload           4
	//   32   51:invokevirtual   #680 <Method void View.offsetLeftAndRight(int)>
		setDrawerViewOffset(view, f);
	//   33   54:aload_0         
	//   34   55:aload_1         
	//   35   56:fload_2         
	//   36   57:invokevirtual   #683 <Method void setDrawerViewOffset(View, float)>
	//   37   60:return          
	}

	protected void onAttachedToWindow()
	{
		super.onAttachedToWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #686 <Method void ViewGroup.onAttachedToWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #169 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #689 <Method void ViewGroup.onDetachedFromWindow()>
		mFirstLayout = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #169 <Field boolean mFirstLayout>
	//    5    9:return          
	}

	public void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #692 <Method void ViewGroup.onDraw(Canvas)>
		if(mDrawStatusBarBackground && mStatusBarBackground != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #694 <Field boolean mDrawStatusBarBackground>
	//*   5    9:ifeq            58
	//*   6   12:aload_0         
	//*   7   13:getfield        #273 <Field Drawable mStatusBarBackground>
	//*   8   16:ifnull          58
		{
			int i = IMPL.getTopInset(mLastInsets);
	//    9   19:getstatic       #145 <Field DrawerLayout$DrawerLayoutCompatImpl IMPL>
	//   10   22:aload_0         
	//   11   23:getfield        #696 <Field Object mLastInsets>
	//   12   26:invokeinterface #700 <Method int DrawerLayout$DrawerLayoutCompatImpl.getTopInset(Object)>
	//   13   31:istore_2        
			if(i > 0)
	//*  14   32:iload_2         
	//*  15   33:ifle            58
			{
				mStatusBarBackground.setBounds(0, 0, getWidth(), i);
	//   16   36:aload_0         
	//   17   37:getfield        #273 <Field Drawable mStatusBarBackground>
	//   18   40:iconst_0        
	//   19   41:iconst_0        
	//   20   42:aload_0         
	//   21   43:invokevirtual   #495 <Method int getWidth()>
	//   22   46:iload_2         
	//   23   47:invokevirtual   #616 <Method void Drawable.setBounds(int, int, int, int)>
				mStatusBarBackground.draw(canvas);
	//   24   50:aload_0         
	//   25   51:getfield        #273 <Field Drawable mStatusBarBackground>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #624 <Method void Drawable.draw(Canvas)>
			}
		}
	//   28   58:return          
	}

	public boolean onInterceptTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #704 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore          4
		boolean flag3 = mLeftDragger.shouldInterceptTouchEvent(motionevent);
	//    3    6:aload_0         
	//    4    7:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #707 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//    7   14:istore          7
		boolean flag4 = mRightDragger.shouldInterceptTouchEvent(motionevent);
	//    8   16:aload_0         
	//    9   17:getfield        #238 <Field ViewDragHelper mRightDragger>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #707 <Method boolean ViewDragHelper.shouldInterceptTouchEvent(MotionEvent)>
	//   12   24:istore          8
		boolean flag2 = false;
	//   13   26:iconst_0        
	//   14   27:istore          6
		boolean flag1 = false;
	//   15   29:iconst_0        
	//   16   30:istore          5
		boolean flag;
		switch(i)
	//*  17   32:iload           4
		{
	//*  18   34:tableswitch     0 3: default 64
	//	               0 71
	//	               1 188
	//	               2 152
	//	               3 188
		default:
			flag = flag2;
	//   19   64:iload           6
	//   20   66:istore          4
			break;

	//*  21   68:goto            207
		case 0: // '\0'
			float f = motionevent.getX();
	//   22   71:aload_1         
	//   23   72:invokevirtual   #710 <Method float MotionEvent.getX()>
	//   24   75:fstore_2        
			float f1 = motionevent.getY();
	//   25   76:aload_1         
	//   26   77:invokevirtual   #713 <Method float MotionEvent.getY()>
	//   27   80:fstore_3        
			mInitialMotionX = f;
	//   28   81:aload_0         
	//   29   82:fload_2         
	//   30   83:putfield        #715 <Field float mInitialMotionX>
			mInitialMotionY = f1;
	//   31   86:aload_0         
	//   32   87:fload_3         
	//   33   88:putfield        #717 <Field float mInitialMotionY>
			flag = flag1;
	//   34   91:iload           5
	//   35   93:istore          4
			if(mScrimOpacity > 0.0F)
	//*  36   95:aload_0         
	//*  37   96:getfield        #527 <Field float mScrimOpacity>
	//*  38   99:fconst_0        
	//*  39  100:fcmpl           
	//*  40  101:ifle            139
			{
				motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f, (int)f1)));
	//   41  104:aload_0         
	//   42  105:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   43  108:fload_2         
	//   44  109:f2i             
	//   45  110:fload_3         
	//   46  111:f2i             
	//   47  112:invokevirtual   #721 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   48  115:astore_1        
				flag = flag1;
	//   49  116:iload           5
	//   50  118:istore          4
				if(motionevent != null)
	//*  51  120:aload_1         
	//*  52  121:ifnull          139
				{
					flag = flag1;
	//   53  124:iload           5
	//   54  126:istore          4
					if(isContentView(((View) (motionevent))))
	//*  55  128:aload_0         
	//*  56  129:aload_1         
	//*  57  130:invokevirtual   #568 <Method boolean isContentView(View)>
	//*  58  133:ifeq            139
						flag = true;
	//   59  136:iconst_1        
	//   60  137:istore          4
				}
			}
			mDisallowInterceptRequested = false;
	//   61  139:aload_0         
	//   62  140:iconst_0        
	//   63  141:putfield        #723 <Field boolean mDisallowInterceptRequested>
			mChildrenCanceledTouch = false;
	//   64  144:aload_0         
	//   65  145:iconst_0        
	//   66  146:putfield        #412 <Field boolean mChildrenCanceledTouch>
			break;

	//*  67  149:goto            207
		case 2: // '\002'
			flag = flag2;
	//   68  152:iload           6
	//   69  154:istore          4
			if(mLeftDragger.checkTouchSlop(3))
	//*  70  156:aload_0         
	//*  71  157:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//*  72  160:iconst_3        
	//*  73  161:invokevirtual   #726 <Method boolean ViewDragHelper.checkTouchSlop(int)>
	//*  74  164:ifeq            207
			{
				mLeftCallback.removeCallbacks();
	//   75  167:aload_0         
	//   76  168:getfield        #215 <Field DrawerLayout$ViewDragCallback mLeftCallback>
	//   77  171:invokevirtual   #518 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
				mRightCallback.removeCallbacks();
	//   78  174:aload_0         
	//   79  175:getfield        #217 <Field DrawerLayout$ViewDragCallback mRightCallback>
	//   80  178:invokevirtual   #518 <Method void DrawerLayout$ViewDragCallback.removeCallbacks()>
				flag = flag2;
	//   81  181:iload           6
	//   82  183:istore          4
			}
			break;

	//*  83  185:goto            207
		case 1: // '\001'
		case 3: // '\003'
			closeDrawers(true);
	//   84  188:aload_0         
	//   85  189:iconst_1        
	//   86  190:invokevirtual   #515 <Method void closeDrawers(boolean)>
			mDisallowInterceptRequested = false;
	//   87  193:aload_0         
	//   88  194:iconst_0        
	//   89  195:putfield        #723 <Field boolean mDisallowInterceptRequested>
			mChildrenCanceledTouch = false;
	//   90  198:aload_0         
	//   91  199:iconst_0        
	//   92  200:putfield        #412 <Field boolean mChildrenCanceledTouch>
			flag = flag2;
	//   93  203:iload           6
	//   94  205:istore          4
			break;
		}
		return flag3 | flag4 || flag || hasPeekingDrawer() || mChildrenCanceledTouch;
	//   95  207:iload           7
	//   96  209:iload           8
	//   97  211:ior             
	//   98  212:ifne            234
	//   99  215:iload           4
	//  100  217:ifne            234
	//  101  220:aload_0         
	//  102  221:invokespecial   #728 <Method boolean hasPeekingDrawer()>
	//  103  224:ifne            234
	//  104  227:aload_0         
	//  105  228:getfield        #412 <Field boolean mChildrenCanceledTouch>
	//  106  231:ifeq            236
	//  107  234:iconst_1        
	//  108  235:ireturn         
	//  109  236:iconst_0        
	//  110  237:ireturn         
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(i == 4 && hasVisibleDrawer())
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          18
	//*   3    5:aload_0         
	//*   4    6:invokespecial   #732 <Method boolean hasVisibleDrawer()>
	//*   5    9:ifeq            18
		{
			keyevent.startTracking();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #737 <Method void KeyEvent.startTracking()>
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		} else
		{
			return super.onKeyDown(i, keyevent);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #739 <Method boolean ViewGroup.onKeyDown(int, KeyEvent)>
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
	//    4    6:invokevirtual   #326 <Method View findVisibleDrawer()>
	//    5    9:astore_2        
			if(keyevent != null && getDrawerLockMode(((View) (keyevent))) == 0)
	//*   6   10:aload_2         
	//*   7   11:ifnull          26
	//*   8   14:aload_0         
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #742 <Method int getDrawerLockMode(View)>
	//*  11   19:ifne            26
				closeDrawers();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #744 <Method void closeDrawers()>
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
	//   23   37:invokespecial   #746 <Method boolean ViewGroup.onKeyUp(int, KeyEvent)>
	//   24   40:ireturn         
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		mInLayout = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #750 <Field boolean mInLayout>
		int k1 = k - i;
	//    3    5:iload           4
	//    4    7:iload_2         
	//    5    8:isub            
	//    6    9:istore          10
		int l1 = getChildCount();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #310 <Method int getChildCount()>
	//    9   15:istore          11
		for(k = 0; k < l1; k++)
	//*  10   17:iconst_0        
	//*  11   18:istore          4
	//*  12   20:iload           4
	//*  13   22:iload           11
	//*  14   24:icmpge          456
		{
			View view = getChildAt(k);
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:invokevirtual   #314 <Method View getChildAt(int)>
	//   18   33:astore          15
			if(view.getVisibility() == 8)
	//*  19   35:aload           15
	//*  20   37:invokevirtual   #397 <Method int View.getVisibility()>
	//*  21   40:bipush          8
	//*  22   42:icmpne          48
				continue;
	//   23   45:goto            447
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   24   48:aload           15
	//   25   50:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   26   53:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   27   56:astore          16
			if(isContentView(view))
	//*  28   58:aload_0         
	//*  29   59:aload           15
	//*  30   61:invokevirtual   #568 <Method boolean isContentView(View)>
	//*  31   64:ifeq            107
			{
				view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
	//   32   67:aload           15
	//   33   69:aload           16
	//   34   71:getfield        #753 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   35   74:aload           16
	//   36   76:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//   37   79:aload           16
	//   38   81:getfield        #753 <Field int DrawerLayout$LayoutParams.leftMargin>
	//   39   84:aload           15
	//   40   86:invokevirtual   #759 <Method int View.getMeasuredWidth()>
	//   41   89:iadd            
	//   42   90:aload           16
	//   43   92:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//   44   95:aload           15
	//   45   97:invokevirtual   #762 <Method int View.getMeasuredHeight()>
	//   46  100:iadd            
	//   47  101:invokevirtual   #765 <Method void View.layout(int, int, int, int)>
				continue;
	//   48  104:goto            447
			}
			int i2 = view.getMeasuredWidth();
	//   49  107:aload           15
	//   50  109:invokevirtual   #759 <Method int View.getMeasuredWidth()>
	//   51  112:istore          12
			int j2 = view.getMeasuredHeight();
	//   52  114:aload           15
	//   53  116:invokevirtual   #762 <Method int View.getMeasuredHeight()>
	//   54  119:istore          13
			float f;
			int i1;
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  55  121:aload_0         
	//*  56  122:aload           15
	//*  57  124:iconst_3        
	//*  58  125:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  59  128:ifeq            162
			{
				i1 = -i2 + (int)((float)i2 * layoutparams.onScreen);
	//   60  131:iload           12
	//   61  133:ineg            
	//   62  134:iload           12
	//   63  136:i2f             
	//   64  137:aload           16
	//   65  139:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//   66  142:fmul            
	//   67  143:f2i             
	//   68  144:iadd            
	//   69  145:istore          7
				f = (float)(i2 + i1) / (float)i2;
	//   70  147:iload           12
	//   71  149:iload           7
	//   72  151:iadd            
	//   73  152:i2f             
	//   74  153:iload           12
	//   75  155:i2f             
	//   76  156:fdiv            
	//   77  157:fstore          6
			} else
	//*  78  159:goto            189
			{
				i1 = k1 - (int)((float)i2 * layoutparams.onScreen);
	//   79  162:iload           10
	//   80  164:iload           12
	//   81  166:i2f             
	//   82  167:aload           16
	//   83  169:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//   84  172:fmul            
	//   85  173:f2i             
	//   86  174:isub            
	//   87  175:istore          7
				f = (float)(k1 - i1) / (float)i2;
	//   88  177:iload           10
	//   89  179:iload           7
	//   90  181:isub            
	//   91  182:i2f             
	//   92  183:iload           12
	//   93  185:i2f             
	//   94  186:fdiv            
	//   95  187:fstore          6
			}
			boolean flag1;
			if(f != layoutparams.onScreen)
	//*  96  189:fload           6
	//*  97  191:aload           16
	//*  98  193:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  99  196:fcmpl           
	//* 100  197:ifeq            206
				flag1 = true;
	//  101  200:iconst_1        
	//  102  201:istore          8
			else
	//* 103  203:goto            209
				flag1 = false;
	//  104  206:iconst_0        
	//  105  207:istore          8
			switch(layoutparams.gravity & 0x70)
	//* 106  209:aload           16
	//* 107  211:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//* 108  214:bipush          112
	//* 109  216:iand            
			{
	//* 110  217:lookupswitch    3: default 252
	//	               16: 320
	//	               48: 252
	//	               80: 280
			case 48: // '0'
			default:
				view.layout(i1, layoutparams.topMargin, i1 + i2, layoutparams.topMargin + j2);
	//  111  252:aload           15
	//  112  254:iload           7
	//  113  256:aload           16
	//  114  258:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//  115  261:iload           7
	//  116  263:iload           12
	//  117  265:iadd            
	//  118  266:aload           16
	//  119  268:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//  120  271:iload           13
	//  121  273:iadd            
	//  122  274:invokevirtual   #765 <Method void View.layout(int, int, int, int)>
				break;

	//* 123  277:goto            402
			case 80: // 'P'
				i = l - j;
	//  124  280:iload           5
	//  125  282:iload_3         
	//  126  283:isub            
	//  127  284:istore_2        
				view.layout(i1, i - layoutparams.bottomMargin - view.getMeasuredHeight(), i1 + i2, i - layoutparams.bottomMargin);
	//  128  285:aload           15
	//  129  287:iload           7
	//  130  289:iload_2         
	//  131  290:aload           16
	//  132  292:getfield        #768 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  133  295:isub            
	//  134  296:aload           15
	//  135  298:invokevirtual   #762 <Method int View.getMeasuredHeight()>
	//  136  301:isub            
	//  137  302:iload           7
	//  138  304:iload           12
	//  139  306:iadd            
	//  140  307:iload_2         
	//  141  308:aload           16
	//  142  310:getfield        #768 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  143  313:isub            
	//  144  314:invokevirtual   #765 <Method void View.layout(int, int, int, int)>
				break;

	//* 145  317:goto            402
			case 16: // '\020'
				int k2 = l - j;
	//  146  320:iload           5
	//  147  322:iload_3         
	//  148  323:isub            
	//  149  324:istore          14
				int j1 = (k2 - j2) / 2;
	//  150  326:iload           14
	//  151  328:iload           13
	//  152  330:isub            
	//  153  331:iconst_2        
	//  154  332:idiv            
	//  155  333:istore          9
				if(j1 < layoutparams.topMargin)
	//* 156  335:iload           9
	//* 157  337:aload           16
	//* 158  339:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//* 159  342:icmpge          354
				{
					i = layoutparams.topMargin;
	//  160  345:aload           16
	//  161  347:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//  162  350:istore_2        
				} else
	//* 163  351:goto            385
				{
					i = j1;
	//  164  354:iload           9
	//  165  356:istore_2        
					if(j1 + j2 > k2 - layoutparams.bottomMargin)
	//* 166  357:iload           9
	//* 167  359:iload           13
	//* 168  361:iadd            
	//* 169  362:iload           14
	//* 170  364:aload           16
	//* 171  366:getfield        #768 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//* 172  369:isub            
	//* 173  370:icmple          385
						i = k2 - layoutparams.bottomMargin - j2;
	//  174  373:iload           14
	//  175  375:aload           16
	//  176  377:getfield        #768 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  177  380:isub            
	//  178  381:iload           13
	//  179  383:isub            
	//  180  384:istore_2        
				}
				view.layout(i1, i, i1 + i2, i + j2);
	//  181  385:aload           15
	//  182  387:iload           7
	//  183  389:iload_2         
	//  184  390:iload           7
	//  185  392:iload           12
	//  186  394:iadd            
	//  187  395:iload_2         
	//  188  396:iload           13
	//  189  398:iadd            
	//  190  399:invokevirtual   #765 <Method void View.layout(int, int, int, int)>
				break;
			}
			if(flag1)
	//* 191  402:iload           8
	//* 192  404:ifeq            415
				setDrawerViewOffset(view, f);
	//  193  407:aload_0         
	//  194  408:aload           15
	//  195  410:fload           6
	//  196  412:invokevirtual   #683 <Method void setDrawerViewOffset(View, float)>
			if(layoutparams.onScreen > 0.0F)
	//* 197  415:aload           16
	//* 198  417:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//* 199  420:fconst_0        
	//* 200  421:fcmpl           
	//* 201  422:ifle            430
				i = 0;
	//  202  425:iconst_0        
	//  203  426:istore_2        
			else
	//* 204  427:goto            432
				i = 4;
	//  205  430:iconst_4        
	//  206  431:istore_2        
			if(view.getVisibility() != i)
	//* 207  432:aload           15
	//* 208  434:invokevirtual   #397 <Method int View.getVisibility()>
	//* 209  437:iload_2         
	//* 210  438:icmpeq          447
				view.setVisibility(i);
	//  211  441:aload           15
	//  212  443:iload_2         
	//  213  444:invokevirtual   #509 <Method void View.setVisibility(int)>
		}

	//  214  447:iload           4
	//  215  449:iconst_1        
	//  216  450:iadd            
	//  217  451:istore          4
	//* 218  453:goto            20
		mInLayout = false;
	//  219  456:aload_0         
	//  220  457:iconst_0        
	//  221  458:putfield        #750 <Field boolean mInLayout>
		mFirstLayout = false;
	//  222  461:aload_0         
	//  223  462:iconst_0        
	//  224  463:putfield        #169 <Field boolean mFirstLayout>
	//  225  466:return          
	}

	protected void onMeasure(int i, int j)
	{
		int i1;
		int j1;
label0:
		{
			int l1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #774 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          8
			int k1 = android.view.View.MeasureSpec.getMode(j);
	//    3    6:iload_2         
	//    4    7:invokestatic    #774 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    5   10:istore          7
			int k = android.view.View.MeasureSpec.getSize(i);
	//    6   12:iload_1         
	//    7   13:invokestatic    #777 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    8   16:istore_3        
			int l = android.view.View.MeasureSpec.getSize(j);
	//    9   17:iload_2         
	//   10   18:invokestatic    #777 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   21:istore          4
			if(l1 == 0x40000000)
	//*  12   23:iload           8
	//*  13   25:ldc2            #778 <Int 0x40000000>
	//*  14   28:icmpne          46
			{
				i1 = k;
	//   15   31:iload_3         
	//   16   32:istore          5
				j1 = l;
	//   17   34:iload           4
	//   18   36:istore          6
				if(k1 == 0x40000000)
					break label0;
	//   19   38:iload           7
	//   20   40:ldc2            #778 <Int 0x40000000>
	//   21   43:icmpeq          125
			}
			if(isInEditMode())
	//*  22   46:aload_0         
	//*  23   47:invokevirtual   #781 <Method boolean isInEditMode()>
	//*  24   50:ifeq            114
			{
				if(l1 != 0x80000000 && l1 == 0)
	//*  25   53:iload           8
	//*  26   55:ldc2            #782 <Int 0x80000000>
	//*  27   58:icmpne          64
	//*  28   61:goto            73
	//*  29   64:iload           8
	//*  30   66:ifne            73
					k = 300;
	//   31   69:sipush          300
	//   32   72:istore_3        
				if(k1 == 0x80000000)
	//*  33   73:iload           7
	//*  34   75:ldc2            #782 <Int 0x80000000>
	//*  35   78:icmpne          91
				{
					i1 = k;
	//   36   81:iload_3         
	//   37   82:istore          5
					j1 = l;
	//   38   84:iload           4
	//   39   86:istore          6
				} else
	//*  40   88:goto            125
				{
					i1 = k;
	//   41   91:iload_3         
	//   42   92:istore          5
					j1 = l;
	//   43   94:iload           4
	//   44   96:istore          6
					if(k1 == 0)
	//*  45   98:iload           7
	//*  46  100:ifne            125
					{
						j1 = 300;
	//   47  103:sipush          300
	//   48  106:istore          6
						i1 = k;
	//   49  108:iload_3         
	//   50  109:istore          5
					}
				}
			} else
	//*  51  111:goto            125
			{
				throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
	//   52  114:new             #449 <Class IllegalArgumentException>
	//   53  117:dup             
	//   54  118:ldc2            #784 <String "DrawerLayout must be measured with MeasureSpec.EXACTLY.">
	//   55  121:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   56  124:athrow          
			}
		}
		setMeasuredDimension(i1, j1);
	//   57  125:aload_0         
	//   58  126:iload           5
	//   59  128:iload           6
	//   60  130:invokevirtual   #787 <Method void setMeasuredDimension(int, int)>
		boolean flag2;
		if(mLastInsets != null && ViewCompat.getFitsSystemWindows(((View) (this))))
	//*  61  133:aload_0         
	//*  62  134:getfield        #696 <Field Object mLastInsets>
	//*  63  137:ifnull          153
	//*  64  140:aload_0         
	//*  65  141:invokestatic    #263 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//*  66  144:ifeq            153
			flag2 = true;
	//   67  147:iconst_1        
	//   68  148:istore          7
		else
	//*  69  150:goto            156
			flag2 = false;
	//   70  153:iconst_0        
	//   71  154:istore          7
		int k2 = ViewCompat.getLayoutDirection(((View) (this)));
	//   72  156:aload_0         
	//   73  157:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//   74  160:istore          10
		boolean flag1 = false;
	//   75  162:iconst_0        
	//   76  163:istore          4
		boolean flag = false;
	//   77  165:iconst_0        
	//   78  166:istore_3        
		int l2 = getChildCount();
	//   79  167:aload_0         
	//   80  168:invokevirtual   #310 <Method int getChildCount()>
	//   81  171:istore          11
		for(int i2 = 0; i2 < l2; i2++)
	//*  82  173:iconst_0        
	//*  83  174:istore          8
	//*  84  176:iload           8
	//*  85  178:iload           11
	//*  86  180:icmpge          595
		{
			View view = getChildAt(i2);
	//   87  183:aload_0         
	//   88  184:iload           8
	//   89  186:invokevirtual   #314 <Method View getChildAt(int)>
	//   90  189:astore          13
			if(view.getVisibility() == 8)
	//*  91  191:aload           13
	//*  92  193:invokevirtual   #397 <Method int View.getVisibility()>
	//*  93  196:bipush          8
	//*  94  198:icmpne          204
				continue;
	//   95  201:goto            586
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   96  204:aload           13
	//   97  206:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   98  209:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   99  212:astore          14
			if(flag2)
	//* 100  214:iload           7
	//* 101  216:ifeq            274
			{
				int j2 = GravityCompat.getAbsoluteGravity(layoutparams.gravity, k2);
	//  102  219:aload           14
	//  103  221:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//  104  224:iload           10
	//  105  226:invokestatic    #630 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//  106  229:istore          9
				if(ViewCompat.getFitsSystemWindows(view))
	//* 107  231:aload           13
	//* 108  233:invokestatic    #263 <Method boolean ViewCompat.getFitsSystemWindows(View)>
	//* 109  236:ifeq            258
					IMPL.dispatchChildInsets(view, mLastInsets, j2);
	//  110  239:getstatic       #145 <Field DrawerLayout$DrawerLayoutCompatImpl IMPL>
	//  111  242:aload           13
	//  112  244:aload_0         
	//  113  245:getfield        #696 <Field Object mLastInsets>
	//  114  248:iload           9
	//  115  250:invokeinterface #791 <Method void DrawerLayout$DrawerLayoutCompatImpl.dispatchChildInsets(View, Object, int)>
				else
	//* 116  255:goto            274
					IMPL.applyMarginInsets(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)), mLastInsets, j2);
	//  117  258:getstatic       #145 <Field DrawerLayout$DrawerLayoutCompatImpl IMPL>
	//  118  261:aload           14
	//  119  263:aload_0         
	//  120  264:getfield        #696 <Field Object mLastInsets>
	//  121  267:iload           9
	//  122  269:invokeinterface #795 <Method void DrawerLayout$DrawerLayoutCompatImpl.applyMarginInsets(android.view.ViewGroup$MarginLayoutParams, Object, int)>
			}
			if(isContentView(view))
	//* 123  274:aload_0         
	//* 124  275:aload           13
	//* 125  277:invokevirtual   #568 <Method boolean isContentView(View)>
	//* 126  280:ifeq            331
			{
				view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(j1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
	//  127  283:aload           13
	//  128  285:iload           5
	//  129  287:aload           14
	//  130  289:getfield        #753 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  131  292:isub            
	//  132  293:aload           14
	//  133  295:getfield        #798 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  134  298:isub            
	//  135  299:ldc2            #778 <Int 0x40000000>
	//  136  302:invokestatic    #801 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  137  305:iload           6
	//  138  307:aload           14
	//  139  309:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//  140  312:isub            
	//  141  313:aload           14
	//  142  315:getfield        #768 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  143  318:isub            
	//  144  319:ldc2            #778 <Int 0x40000000>
	//  145  322:invokestatic    #801 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  146  325:invokevirtual   #804 <Method void View.measure(int, int)>
				continue;
	//  147  328:goto            586
			}
			if(isDrawerView(view))
	//* 148  331:aload_0         
	//* 149  332:aload           13
	//* 150  334:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//* 151  337:ifeq            534
			{
				if(SET_DRAWER_SHADOW_FROM_ELEVATION && ViewCompat.getElevation(view) != mDrawerElevation)
	//* 152  340:getstatic       #140 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//* 153  343:ifeq            368
	//* 154  346:aload           13
	//* 155  348:invokestatic    #807 <Method float ViewCompat.getElevation(View)>
	//* 156  351:aload_0         
	//* 157  352:getfield        #276 <Field float mDrawerElevation>
	//* 158  355:fcmpl           
	//* 159  356:ifeq            368
					ViewCompat.setElevation(view, mDrawerElevation);
	//  160  359:aload           13
	//  161  361:aload_0         
	//  162  362:getfield        #276 <Field float mDrawerElevation>
	//  163  365:invokestatic    #810 <Method void ViewCompat.setElevation(View, float)>
				int i3 = getDrawerViewAbsoluteGravity(view) & 7;
	//  164  368:aload_0         
	//  165  369:aload           13
	//  166  371:invokevirtual   #436 <Method int getDrawerViewAbsoluteGravity(View)>
	//  167  374:bipush          7
	//  168  376:iand            
	//  169  377:istore          12
				boolean flag3;
				if(i3 == 3)
	//* 170  379:iload           12
	//* 171  381:iconst_3        
	//* 172  382:icmpne          391
					flag3 = true;
	//  173  385:iconst_1        
	//  174  386:istore          9
				else
	//* 175  388:goto            394
					flag3 = false;
	//  176  391:iconst_0        
	//  177  392:istore          9
				if(flag3 && flag1 || !flag3 && flag)
	//* 178  394:iload           9
	//* 179  396:ifeq            404
	//* 180  399:iload           4
	//* 181  401:ifne            413
	//* 182  404:iload           9
	//* 183  406:ifne            468
	//* 184  409:iload_3         
	//* 185  410:ifeq            468
					throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(gravityToString(i3)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
	//  186  413:new             #812 <Class IllegalStateException>
	//  187  416:dup             
	//  188  417:new             #451 <Class StringBuilder>
	//  189  420:dup             
	//  190  421:invokespecial   #452 <Method void StringBuilder()>
	//  191  424:ldc2            #814 <String "Child drawer has absolute gravity ">
	//  192  427:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  193  430:iload           12
	//  194  432:invokestatic    #460 <Method String gravityToString(int)>
	//  195  435:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  196  438:ldc2            #816 <String " but this ">
	//  197  441:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  198  444:ldc1            #75  <String "DrawerLayout">
	//  199  446:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  200  449:ldc2            #818 <String " already has a ">
	//  201  452:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  202  455:ldc2            #820 <String "drawer view along that edge">
	//  203  458:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  204  461:invokevirtual   #464 <Method String StringBuilder.toString()>
	//  205  464:invokespecial   #821 <Method void IllegalStateException(String)>
	//  206  467:athrow          
				if(flag3)
	//* 207  468:iload           9
	//* 208  470:ifeq            479
					flag1 = true;
	//  209  473:iconst_1        
	//  210  474:istore          4
				else
	//* 211  476:goto            481
					flag = true;
	//  212  479:iconst_1        
	//  213  480:istore_3        
				view.measure(getChildMeasureSpec(i, mMinDrawerMargin + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
	//  214  481:aload           13
	//  215  483:iload_1         
	//  216  484:aload_0         
	//  217  485:getfield        #209 <Field int mMinDrawerMargin>
	//  218  488:aload           14
	//  219  490:getfield        #753 <Field int DrawerLayout$LayoutParams.leftMargin>
	//  220  493:iadd            
	//  221  494:aload           14
	//  222  496:getfield        #798 <Field int DrawerLayout$LayoutParams.rightMargin>
	//  223  499:iadd            
	//  224  500:aload           14
	//  225  502:getfield        #824 <Field int DrawerLayout$LayoutParams.width>
	//  226  505:invokestatic    #828 <Method int getChildMeasureSpec(int, int, int)>
	//  227  508:iload_2         
	//  228  509:aload           14
	//  229  511:getfield        #756 <Field int DrawerLayout$LayoutParams.topMargin>
	//  230  514:aload           14
	//  231  516:getfield        #768 <Field int DrawerLayout$LayoutParams.bottomMargin>
	//  232  519:iadd            
	//  233  520:aload           14
	//  234  522:getfield        #831 <Field int DrawerLayout$LayoutParams.height>
	//  235  525:invokestatic    #828 <Method int getChildMeasureSpec(int, int, int)>
	//  236  528:invokevirtual   #804 <Method void View.measure(int, int)>
			} else
	//* 237  531:goto            586
			{
				throw new IllegalStateException((new StringBuilder()).append("Child ").append(((Object) (view))).append(" at index ").append(i2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
	//  238  534:new             #812 <Class IllegalStateException>
	//  239  537:dup             
	//  240  538:new             #451 <Class StringBuilder>
	//  241  541:dup             
	//  242  542:invokespecial   #452 <Method void StringBuilder()>
	//  243  545:ldc2            #833 <String "Child ">
	//  244  548:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  245  551:aload           13
	//  246  553:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
	//  247  556:ldc2            #835 <String " at index ">
	//  248  559:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  249  562:iload           8
	//  250  564:invokevirtual   #838 <Method StringBuilder StringBuilder.append(int)>
	//  251  567:ldc2            #840 <String " does not have a valid layout_gravity - must be Gravity.LEFT, ">
	//  252  570:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  253  573:ldc2            #842 <String "Gravity.RIGHT or Gravity.NO_GRAVITY">
	//  254  576:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//  255  579:invokevirtual   #464 <Method String StringBuilder.toString()>
	//  256  582:invokespecial   #821 <Method void IllegalStateException(String)>
	//  257  585:athrow          
			}
		}

	//  258  586:iload           8
	//  259  588:iconst_1        
	//  260  589:iadd            
	//  261  590:istore          8
	//* 262  592:goto            176
	//  263  595:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #29  <Class DrawerLayout$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #846 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #29  <Class DrawerLayout$SavedState>
	//    9   17:astore_1        
		super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #850 <Method Parcelable DrawerLayout$SavedState.getSuperState()>
	//   13   23:invokespecial   #846 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		if(((SavedState) (parcelable)).openDrawerGravity != 0)
	//*  14   26:aload_1         
	//*  15   27:getfield        #853 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//*  16   30:ifeq            51
		{
			View view = findDrawerWithGravity(((SavedState) (parcelable)).openDrawerGravity);
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:getfield        #853 <Field int DrawerLayout$SavedState.openDrawerGravity>
	//   20   38:invokevirtual   #447 <Method View findDrawerWithGravity(int)>
	//   21   41:astore_2        
			if(view != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          51
				openDrawer(view);
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #856 <Method void openDrawer(View)>
		}
		if(((SavedState) (parcelable)).lockModeLeft != 3)
	//*  27   51:aload_1         
	//*  28   52:getfield        #859 <Field int DrawerLayout$SavedState.lockModeLeft>
	//*  29   55:iconst_3        
	//*  30   56:icmpeq          68
			setDrawerLockMode(((SavedState) (parcelable)).lockModeLeft, 3);
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:getfield        #859 <Field int DrawerLayout$SavedState.lockModeLeft>
	//   34   64:iconst_3        
	//   35   65:invokevirtual   #862 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeRight != 3)
	//*  36   68:aload_1         
	//*  37   69:getfield        #865 <Field int DrawerLayout$SavedState.lockModeRight>
	//*  38   72:iconst_3        
	//*  39   73:icmpeq          85
			setDrawerLockMode(((SavedState) (parcelable)).lockModeRight, 5);
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:getfield        #865 <Field int DrawerLayout$SavedState.lockModeRight>
	//   43   81:iconst_5        
	//   44   82:invokevirtual   #862 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeStart != 3)
	//*  45   85:aload_1         
	//*  46   86:getfield        #868 <Field int DrawerLayout$SavedState.lockModeStart>
	//*  47   89:iconst_3        
	//*  48   90:icmpeq          104
			setDrawerLockMode(((SavedState) (parcelable)).lockModeStart, 0x800003);
	//   49   93:aload_0         
	//   50   94:aload_1         
	//   51   95:getfield        #868 <Field int DrawerLayout$SavedState.lockModeStart>
	//   52   98:ldc2            #869 <Int 0x800003>
	//   53  101:invokevirtual   #862 <Method void setDrawerLockMode(int, int)>
		if(((SavedState) (parcelable)).lockModeEnd != 3)
	//*  54  104:aload_1         
	//*  55  105:getfield        #872 <Field int DrawerLayout$SavedState.lockModeEnd>
	//*  56  108:iconst_3        
	//*  57  109:icmpeq          123
			setDrawerLockMode(((SavedState) (parcelable)).lockModeEnd, 0x800005);
	//   58  112:aload_0         
	//   59  113:aload_1         
	//   60  114:getfield        #872 <Field int DrawerLayout$SavedState.lockModeEnd>
	//   61  117:ldc2            #873 <Int 0x800005>
	//   62  120:invokevirtual   #862 <Method void setDrawerLockMode(int, int)>
	//   63  123:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		resolveShadowDrawables();
	//    0    0:aload_0         
	//    1    1:invokespecial   #876 <Method void resolveShadowDrawables()>
	//    2    4:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #29  <Class DrawerLayout$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #879 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #881 <Method void DrawerLayout$SavedState(Parcelable)>
	//    5   11:astore          5
		int j = getChildCount();
	//    6   13:aload_0         
	//    7   14:invokevirtual   #310 <Method int getChildCount()>
	//    8   17:istore          4
		int i = 0;
	//    9   19:iconst_0        
	//   10   20:istore_1        
		do
		{
			if(i >= j)
				break;
	//   11   21:iload_1         
	//   12   22:iload           4
	//   13   24:icmpge          100
			LayoutParams layoutparams = (LayoutParams)getChildAt(i).getLayoutParams();
	//   14   27:aload_0         
	//   15   28:iload_1         
	//   16   29:invokevirtual   #314 <Method View getChildAt(int)>
	//   17   32:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   35:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   19   38:astore          6
			boolean flag;
			if(layoutparams.openState == 1)
	//*  20   40:aload           6
	//*  21   42:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
	//*  22   45:iconst_1        
	//*  23   46:icmpne          54
				flag = true;
	//   24   49:iconst_1        
	//   25   50:istore_2        
			else
	//*  26   51:goto            56
				flag = false;
	//   27   54:iconst_0        
	//   28   55:istore_2        
			boolean flag1;
			if(layoutparams.openState == 2)
	//*  29   56:aload           6
	//*  30   58:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
	//*  31   61:iconst_2        
	//*  32   62:icmpne          70
				flag1 = true;
	//   33   65:iconst_1        
	//   34   66:istore_3        
			else
	//*  35   67:goto            72
				flag1 = false;
	//   36   70:iconst_0        
	//   37   71:istore_3        
			if(flag || flag1)
	//*  38   72:iload_2         
	//*  39   73:ifne            80
	//*  40   76:iload_3         
	//*  41   77:ifeq            93
			{
				savedstate.openDrawerGravity = layoutparams.gravity;
	//   42   80:aload           5
	//   43   82:aload           6
	//   44   84:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//   45   87:putfield        #853 <Field int DrawerLayout$SavedState.openDrawerGravity>
				break;
	//   46   90:goto            100
			}
			i++;
	//   47   93:iload_1         
	//   48   94:iconst_1        
	//   49   95:iadd            
	//   50   96:istore_1        
		} while(true);
	//   51   97:goto            21
		savedstate.lockModeLeft = mLockModeLeft;
	//   52  100:aload           5
	//   53  102:aload_0         
	//   54  103:getfield        #171 <Field int mLockModeLeft>
	//   55  106:putfield        #859 <Field int DrawerLayout$SavedState.lockModeLeft>
		savedstate.lockModeRight = mLockModeRight;
	//   56  109:aload           5
	//   57  111:aload_0         
	//   58  112:getfield        #173 <Field int mLockModeRight>
	//   59  115:putfield        #865 <Field int DrawerLayout$SavedState.lockModeRight>
		savedstate.lockModeStart = mLockModeStart;
	//   60  118:aload           5
	//   61  120:aload_0         
	//   62  121:getfield        #175 <Field int mLockModeStart>
	//   63  124:putfield        #868 <Field int DrawerLayout$SavedState.lockModeStart>
		savedstate.lockModeEnd = mLockModeEnd;
	//   64  127:aload           5
	//   65  129:aload_0         
	//   66  130:getfield        #177 <Field int mLockModeEnd>
	//   67  133:putfield        #872 <Field int DrawerLayout$SavedState.lockModeEnd>
		return ((Parcelable) (savedstate));
	//   68  136:aload           5
	//   69  138:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		mLeftDragger.processTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #886 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		mRightDragger.processTouchEvent(motionevent);
	//    4    8:aload_0         
	//    5    9:getfield        #238 <Field ViewDragHelper mRightDragger>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #886 <Method void ViewDragHelper.processTouchEvent(MotionEvent)>
		switch(motionevent.getAction() & 0xff)
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #889 <Method int MotionEvent.getAction()>
	//*  10   20:sipush          255
	//*  11   23:iand            
		{
	//*  12   24:tableswitch     0 3: default 56
	//	               0 58
	//	               1 90
	//	               2 238
	//	               3 223
		default:
			return true;
	//   13   56:iconst_1        
	//   14   57:ireturn         

		case 0: // '\0'
			float f = motionevent.getX();
	//   15   58:aload_1         
	//   16   59:invokevirtual   #710 <Method float MotionEvent.getX()>
	//   17   62:fstore_2        
			float f2 = motionevent.getY();
	//   18   63:aload_1         
	//   19   64:invokevirtual   #713 <Method float MotionEvent.getY()>
	//   20   67:fstore_3        
			mInitialMotionX = f;
	//   21   68:aload_0         
	//   22   69:fload_2         
	//   23   70:putfield        #715 <Field float mInitialMotionX>
			mInitialMotionY = f2;
	//   24   73:aload_0         
	//   25   74:fload_3         
	//   26   75:putfield        #717 <Field float mInitialMotionY>
			mDisallowInterceptRequested = false;
	//   27   78:aload_0         
	//   28   79:iconst_0        
	//   29   80:putfield        #723 <Field boolean mDisallowInterceptRequested>
			mChildrenCanceledTouch = false;
	//   30   83:aload_0         
	//   31   84:iconst_0        
	//   32   85:putfield        #412 <Field boolean mChildrenCanceledTouch>
			return true;
	//   33   88:iconst_1        
	//   34   89:ireturn         

		case 1: // '\001'
			float f3 = motionevent.getX();
	//   35   90:aload_1         
	//   36   91:invokevirtual   #710 <Method float MotionEvent.getX()>
	//   37   94:fstore_3        
			float f1 = motionevent.getY();
	//   38   95:aload_1         
	//   39   96:invokevirtual   #713 <Method float MotionEvent.getY()>
	//   40   99:fstore_2        
			boolean flag1 = true;
	//   41  100:iconst_1        
	//   42  101:istore          6
			motionevent = ((MotionEvent) (mLeftDragger.findTopChildUnder((int)f3, (int)f1)));
	//   43  103:aload_0         
	//   44  104:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   45  107:fload_3         
	//   46  108:f2i             
	//   47  109:fload_2         
	//   48  110:f2i             
	//   49  111:invokevirtual   #721 <Method View ViewDragHelper.findTopChildUnder(int, int)>
	//   50  114:astore_1        
			boolean flag = flag1;
	//   51  115:iload           6
	//   52  117:istore          5
			if(motionevent != null)
	//*  53  119:aload_1         
	//*  54  120:ifnull          210
			{
				flag = flag1;
	//   55  123:iload           6
	//   56  125:istore          5
				if(isContentView(((View) (motionevent))))
	//*  57  127:aload_0         
	//*  58  128:aload_1         
	//*  59  129:invokevirtual   #568 <Method boolean isContentView(View)>
	//*  60  132:ifeq            210
				{
					f3 -= mInitialMotionX;
	//   61  135:fload_3         
	//   62  136:aload_0         
	//   63  137:getfield        #715 <Field float mInitialMotionX>
	//   64  140:fsub            
	//   65  141:fstore_3        
					f1 -= mInitialMotionY;
	//   66  142:fload_2         
	//   67  143:aload_0         
	//   68  144:getfield        #717 <Field float mInitialMotionY>
	//   69  147:fsub            
	//   70  148:fstore_2        
					int i = mLeftDragger.getTouchSlop();
	//   71  149:aload_0         
	//   72  150:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   73  153:invokevirtual   #892 <Method int ViewDragHelper.getTouchSlop()>
	//   74  156:istore          4
					flag = flag1;
	//   75  158:iload           6
	//   76  160:istore          5
					if(f3 * f3 + f1 * f1 < (float)(i * i))
	//*  77  162:fload_3         
	//*  78  163:fload_3         
	//*  79  164:fmul            
	//*  80  165:fload_2         
	//*  81  166:fload_2         
	//*  82  167:fmul            
	//*  83  168:fadd            
	//*  84  169:iload           4
	//*  85  171:iload           4
	//*  86  173:imul            
	//*  87  174:i2f             
	//*  88  175:fcmpg           
	//*  89  176:ifge            210
					{
						motionevent = ((MotionEvent) (findOpenDrawer()));
	//   90  179:aload_0         
	//   91  180:invokevirtual   #409 <Method View findOpenDrawer()>
	//   92  183:astore_1        
						flag = flag1;
	//   93  184:iload           6
	//   94  186:istore          5
						if(motionevent != null)
	//*  95  188:aload_1         
	//*  96  189:ifnull          210
							if(getDrawerLockMode(((View) (motionevent))) == 2)
	//*  97  192:aload_0         
	//*  98  193:aload_1         
	//*  99  194:invokevirtual   #742 <Method int getDrawerLockMode(View)>
	//* 100  197:iconst_2        
	//* 101  198:icmpne          207
								flag = true;
	//  102  201:iconst_1        
	//  103  202:istore          5
							else
	//* 104  204:goto            210
								flag = false;
	//  105  207:iconst_0        
	//  106  208:istore          5
					}
				}
			}
			closeDrawers(flag);
	//  107  210:aload_0         
	//  108  211:iload           5
	//  109  213:invokevirtual   #515 <Method void closeDrawers(boolean)>
			mDisallowInterceptRequested = false;
	//  110  216:aload_0         
	//  111  217:iconst_0        
	//  112  218:putfield        #723 <Field boolean mDisallowInterceptRequested>
			return true;
	//  113  221:iconst_1        
	//  114  222:ireturn         

		case 3: // '\003'
			closeDrawers(true);
	//  115  223:aload_0         
	//  116  224:iconst_1        
	//  117  225:invokevirtual   #515 <Method void closeDrawers(boolean)>
			mDisallowInterceptRequested = false;
	//  118  228:aload_0         
	//  119  229:iconst_0        
	//  120  230:putfield        #723 <Field boolean mDisallowInterceptRequested>
			mChildrenCanceledTouch = false;
	//  121  233:aload_0         
	//  122  234:iconst_0        
	//  123  235:putfield        #412 <Field boolean mChildrenCanceledTouch>
			// fall through

		case 2: // '\002'
			return true;
	//  124  238:iconst_1        
	//  125  239:ireturn         
		}
	}

	public void openDrawer(int i)
	{
		openDrawer(i, true);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #894 <Method void openDrawer(int, boolean)>
	//    4    6:return          
	}

	public void openDrawer(int i, boolean flag)
	{
		View view = findDrawerWithGravity(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #447 <Method View findDrawerWithGravity(int)>
	//    3    5:astore_3        
		if(view == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       41
		{
			throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(gravityToString(i)).toString());
	//    6   10:new             #449 <Class IllegalArgumentException>
	//    7   13:dup             
	//    8   14:new             #451 <Class StringBuilder>
	//    9   17:dup             
	//   10   18:invokespecial   #452 <Method void StringBuilder()>
	//   11   21:ldc2            #454 <String "No drawer view found with gravity ">
	//   12   24:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:iload_1         
	//   14   28:invokestatic    #460 <Method String gravityToString(int)>
	//   15   31:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   16   34:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   17   37:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		} else
		{
			openDrawer(view, flag);
	//   19   41:aload_0         
	//   20   42:aload_3         
	//   21   43:iload_2         
	//   22   44:invokevirtual   #896 <Method void openDrawer(View, boolean)>
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
	//    3    3:invokevirtual   #896 <Method void openDrawer(View, boolean)>
	//    4    6:return          
	}

	public void openDrawer(View view, boolean flag)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            42
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a sliding drawer").toString());
	//    4    8:new             #449 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #451 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #452 <Method void StringBuilder()>
	//    9   19:ldc2            #471 <String "View ">
	//   10   22:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_1         
	//   12   26:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #476 <String " is not a sliding drawer">
	//   14   32:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   16   38:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   17   41:athrow          
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   18   42:aload_1         
	//   19   43:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   20   46:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   21   49:astore_3        
		if(mFirstLayout)
	//*  22   50:aload_0         
	//*  23   51:getfield        #169 <Field boolean mFirstLayout>
	//*  24   54:ifeq            76
		{
			layoutparams.onScreen = 1.0F;
	//   25   57:aload_3         
	//   26   58:fconst_1        
	//   27   59:putfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
			layoutparams.openState = 1;
	//   28   62:aload_3         
	//   29   63:iconst_1        
	//   30   64:putfield        #482 <Field int DrawerLayout$LayoutParams.openState>
			updateChildrenImportantForAccessibility(view, true);
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:iconst_1        
	//   34   70:invokespecial   #542 <Method void updateChildrenImportantForAccessibility(View, boolean)>
		} else
	//*  35   73:goto            162
		if(flag)
	//*  36   76:iload_2         
	//*  37   77:ifeq            141
		{
			layoutparams.openState = layoutparams.openState | 2;
	//   38   80:aload_3         
	//   39   81:aload_3         
	//   40   82:getfield        #482 <Field int DrawerLayout$LayoutParams.openState>
	//   41   85:iconst_2        
	//   42   86:ior             
	//   43   87:putfield        #482 <Field int DrawerLayout$LayoutParams.openState>
			if(checkDrawerViewAbsoluteGravity(view, 3))
	//*  44   90:aload_0         
	//*  45   91:aload_1         
	//*  46   92:iconst_3        
	//*  47   93:invokevirtual   #484 <Method boolean checkDrawerViewAbsoluteGravity(View, int)>
	//*  48   96:ifeq            116
				mLeftDragger.smoothSlideViewTo(view, 0, view.getTop());
	//   49   99:aload_0         
	//   50  100:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   51  103:aload_1         
	//   52  104:iconst_0        
	//   53  105:aload_1         
	//   54  106:invokevirtual   #490 <Method int View.getTop()>
	//   55  109:invokevirtual   #494 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   56  112:pop             
			else
	//*  57  113:goto            162
				mRightDragger.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
	//   58  116:aload_0         
	//   59  117:getfield        #238 <Field ViewDragHelper mRightDragger>
	//   60  120:aload_1         
	//   61  121:aload_0         
	//   62  122:invokevirtual   #495 <Method int getWidth()>
	//   63  125:aload_1         
	//   64  126:invokevirtual   #487 <Method int View.getWidth()>
	//   65  129:isub            
	//   66  130:aload_1         
	//   67  131:invokevirtual   #490 <Method int View.getTop()>
	//   68  134:invokevirtual   #494 <Method boolean ViewDragHelper.smoothSlideViewTo(View, int, int)>
	//   69  137:pop             
		} else
	//*  70  138:goto            162
		{
			moveDrawerToOffset(view, 1.0F);
	//   71  141:aload_0         
	//   72  142:aload_1         
	//   73  143:fconst_1        
	//   74  144:invokevirtual   #499 <Method void moveDrawerToOffset(View, float)>
			updateDrawerState(layoutparams.gravity, 0, view);
	//   75  147:aload_0         
	//   76  148:aload_3         
	//   77  149:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//   78  152:iconst_0        
	//   79  153:aload_1         
	//   80  154:invokevirtual   #506 <Method void updateDrawerState(int, int, View)>
			view.setVisibility(0);
	//   81  157:aload_1         
	//   82  158:iconst_0        
	//   83  159:invokevirtual   #509 <Method void View.setVisibility(int)>
		}
		invalidate();
	//   84  162:aload_0         
	//   85  163:invokevirtual   #512 <Method void invalidate()>
	//   86  166:return          
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
	//*   4    6:getfield        #368 <Field List mListeners>
	//*   5    9:ifnonnull       13
		{
			return;
	//    6   12:return          
		} else
		{
			mListeners.remove(((Object) (drawerlistener)));
	//    7   13:aload_0         
	//    8   14:getfield        #368 <Field List mListeners>
	//    9   17:aload_1         
	//   10   18:invokeinterface #900 <Method boolean List.remove(Object)>
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
	//    2    2:invokespecial   #903 <Method void ViewGroup.requestDisallowInterceptTouchEvent(boolean)>
		mDisallowInterceptRequested = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #723 <Field boolean mDisallowInterceptRequested>
		if(flag)
	//*   6   10:iload_1         
	//*   7   11:ifeq            19
			closeDrawers(true);
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:invokevirtual   #515 <Method void closeDrawers(boolean)>
	//   11   19:return          
	}

	public void requestLayout()
	{
		if(!mInLayout)
	//*   0    0:aload_0         
	//*   1    1:getfield        #750 <Field boolean mInLayout>
	//*   2    4:ifne            11
			super.requestLayout();
	//    3    7:aload_0         
	//    4    8:invokespecial   #906 <Method void ViewGroup.requestLayout()>
	//    5   11:return          
	}

	public void setChildInsets(Object obj, boolean flag)
	{
		mLastInsets = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #696 <Field Object mLastInsets>
		mDrawStatusBarBackground = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #694 <Field boolean mDrawStatusBarBackground>
		if(!flag && getBackground() == null)
	//*   6   10:iload_2         
	//*   7   11:ifne            26
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #909 <Method Drawable getBackground()>
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
	//   18   30:invokevirtual   #912 <Method void setWillNotDraw(boolean)>
		requestLayout();
	//   19   33:aload_0         
	//   20   34:invokevirtual   #913 <Method void requestLayout()>
	//   21   37:return          
	}

	public void setDrawerElevation(float f)
	{
		mDrawerElevation = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #276 <Field float mDrawerElevation>
		for(int i = 0; i < getChildCount(); i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:aload_0         
	//*   7    9:invokevirtual   #310 <Method int getChildCount()>
	//*   8   12:icmpge          44
		{
			View view = getChildAt(i);
	//    9   15:aload_0         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #314 <Method View getChildAt(int)>
	//   12   20:astore_3        
			if(isDrawerView(view))
	//*  13   21:aload_0         
	//*  14   22:aload_3         
	//*  15   23:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*  16   26:ifeq            37
				ViewCompat.setElevation(view, mDrawerElevation);
	//   17   29:aload_3         
	//   18   30:aload_0         
	//   19   31:getfield        #276 <Field float mDrawerElevation>
	//   20   34:invokestatic    #810 <Method void ViewCompat.setElevation(View, float)>
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
	//*   1    1:getfield        #918 <Field DrawerLayout$DrawerListener mListener>
	//*   2    4:ifnull          15
			removeDrawerListener(mListener);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #918 <Field DrawerLayout$DrawerListener mListener>
	//    6   12:invokevirtual   #920 <Method void removeDrawerListener(DrawerLayout$DrawerListener)>
		if(drawerlistener != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			addDrawerListener(drawerlistener);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #922 <Method void addDrawerListener(DrawerLayout$DrawerListener)>
		mListener = drawerlistener;
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:putfield        #918 <Field DrawerLayout$DrawerListener mListener>
	//   15   29:return          
	}

	public void setDrawerLockMode(int i)
	{
		setDrawerLockMode(i, 3);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #862 <Method void setDrawerLockMode(int, int)>
		setDrawerLockMode(i, 5);
	//    4    6:aload_0         
	//    5    7:iload_1         
	//    6    8:iconst_5        
	//    7    9:invokevirtual   #862 <Method void setDrawerLockMode(int, int)>
	//    8   12:return          
	}

	public void setDrawerLockMode(int i, int j)
	{
		int k = GravityCompat.getAbsoluteGravity(j, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_2         
	//    1    1:aload_0         
	//    2    2:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #630 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_3        
		switch(j)
	//*   5    9:iload_2         
		{
	//*   6   10:lookupswitch    4: default 52
	//	               3: 55
	//	               5: 63
	//	               8388611: 71
	//	               8388613: 79
	//*   7   52:goto            84
		case 3: // '\003'
			mLockModeLeft = i;
	//    8   55:aload_0         
	//    9   56:iload_1         
	//   10   57:putfield        #171 <Field int mLockModeLeft>
			break;

	//*  11   60:goto            84
		case 5: // '\005'
			mLockModeRight = i;
	//   12   63:aload_0         
	//   13   64:iload_1         
	//   14   65:putfield        #173 <Field int mLockModeRight>
			break;

	//*  15   68:goto            84
		case 8388611: 
			mLockModeStart = i;
	//   16   71:aload_0         
	//   17   72:iload_1         
	//   18   73:putfield        #175 <Field int mLockModeStart>
			break;

	//*  19   76:goto            84
		case 8388613: 
			mLockModeEnd = i;
	//   20   79:aload_0         
	//   21   80:iload_1         
	//   22   81:putfield        #177 <Field int mLockModeEnd>
			break;
		}
		if(i != 0)
	//*  23   84:iload_1         
	//*  24   85:ifeq            113
		{
			ViewDragHelper viewdraghelper;
			if(k == 3)
	//*  25   88:iload_3         
	//*  26   89:iconst_3        
	//*  27   90:icmpne          102
				viewdraghelper = mLeftDragger;
	//   28   93:aload_0         
	//   29   94:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//   30   97:astore          4
			else
	//*  31   99:goto            108
				viewdraghelper = mRightDragger;
	//   32  102:aload_0         
	//   33  103:getfield        #238 <Field ViewDragHelper mRightDragger>
	//   34  106:astore          4
			viewdraghelper.cancel();
	//   35  108:aload           4
	//   36  110:invokevirtual   #926 <Method void ViewDragHelper.cancel()>
		}
		switch(i)
	//*  37  113:iload_1         
		{
	//*  38  114:lookupswitch    2: default 140
	//	               1: 160
	//	               2: 141
		default:
			return;
	//   39  140:return          

		case 2: // '\002'
			View view = findDrawerWithGravity(k);
	//   40  141:aload_0         
	//   41  142:iload_3         
	//   42  143:invokevirtual   #447 <Method View findDrawerWithGravity(int)>
	//   43  146:astore          4
			if(view != null)
	//*  44  148:aload           4
	//*  45  150:ifnull          178
			{
				openDrawer(view);
	//   46  153:aload_0         
	//   47  154:aload           4
	//   48  156:invokevirtual   #856 <Method void openDrawer(View)>
				return;
	//   49  159:return          
			}
			break;

		case 1: // '\001'
			View view1 = findDrawerWithGravity(k);
	//   50  160:aload_0         
	//   51  161:iload_3         
	//   52  162:invokevirtual   #447 <Method View findDrawerWithGravity(int)>
	//   53  165:astore          4
			if(view1 != null)
	//*  54  167:aload           4
	//*  55  169:ifnull          178
				closeDrawer(view1);
	//   56  172:aload_0         
	//   57  173:aload           4
	//   58  175:invokevirtual   #928 <Method void closeDrawer(View)>
			break;
		}
	//   59  178:return          
	}

	public void setDrawerLockMode(int i, View view)
	{
		if(!isDrawerView(view))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #363 <Method boolean isDrawerView(View)>
	//*   3    5:ifne            48
		{
			throw new IllegalArgumentException((new StringBuilder()).append("View ").append(((Object) (view))).append(" is not a ").append("drawer with appropriate layout_gravity").toString());
	//    4    8:new             #449 <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:new             #451 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #452 <Method void StringBuilder()>
	//    9   19:ldc2            #471 <String "View ">
	//   10   22:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #474 <Method StringBuilder StringBuilder.append(Object)>
	//   13   29:ldc2            #931 <String " is not a ">
	//   14   32:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc2            #933 <String "drawer with appropriate layout_gravity">
	//   16   38:invokevirtual   #458 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   18   44:invokespecial   #467 <Method void IllegalArgumentException(String)>
	//   19   47:athrow          
		} else
		{
			setDrawerLockMode(i, ((LayoutParams)view.getLayoutParams()).gravity);
	//   20   48:aload_0         
	//   21   49:iload_1         
	//   22   50:aload_2         
	//   23   51:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   24   54:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   25   57:getfield        #502 <Field int DrawerLayout$LayoutParams.gravity>
	//   26   60:invokevirtual   #862 <Method void setDrawerLockMode(int, int)>
			return;
	//   27   63:return          
		}
	}

	public void setDrawerShadow(int i, int j)
	{
		setDrawerShadow(ContextCompat.getDrawable(getContext(), i), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #643 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #941 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:iload_2         
	//    6   10:invokevirtual   #944 <Method void setDrawerShadow(Drawable, int)>
	//    7   13:return          
	}

	public void setDrawerShadow(Drawable drawable, int i)
	{
		if(SET_DRAWER_SHADOW_FROM_ELEVATION)
	//*   0    0:getstatic       #140 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
	//*   1    3:ifeq            7
			return;
	//    2    6:return          
		if((0x800003 & i) == 0x800003)
	//*   3    7:ldc2            #869 <Int 0x800003>
	//*   4   10:iload_2         
	//*   5   11:iand            
	//*   6   12:ldc2            #869 <Int 0x800003>
	//*   7   15:icmpne          26
			mShadowStart = drawable;
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:putfield        #179 <Field Drawable mShadowStart>
		else
	//*  11   23:goto            76
		if((0x800005 & i) == 0x800005)
	//*  12   26:ldc2            #873 <Int 0x800005>
	//*  13   29:iload_2         
	//*  14   30:iand            
	//*  15   31:ldc2            #873 <Int 0x800005>
	//*  16   34:icmpne          45
			mShadowEnd = drawable;
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:putfield        #181 <Field Drawable mShadowEnd>
		else
	//*  20   42:goto            76
		if((i & 3) == 3)
	//*  21   45:iload_2         
	//*  22   46:iconst_3        
	//*  23   47:iand            
	//*  24   48:iconst_3        
	//*  25   49:icmpne          60
			mShadowLeft = drawable;
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:putfield        #183 <Field Drawable mShadowLeft>
		else
	//*  29   57:goto            76
		if((i & 5) == 5)
	//*  30   60:iload_2         
	//*  31   61:iconst_5        
	//*  32   62:iand            
	//*  33   63:iconst_5        
	//*  34   64:icmpne          75
			mShadowRight = drawable;
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:putfield        #185 <Field Drawable mShadowRight>
		else
	//*  38   72:goto            76
			return;
	//   39   75:return          
		resolveShadowDrawables();
	//   40   76:aload_0         
	//   41   77:invokespecial   #876 <Method void resolveShadowDrawables()>
		invalidate();
	//   42   80:aload_0         
	//   43   81:invokevirtual   #512 <Method void invalidate()>
	//   44   84:return          
	}

	public void setDrawerTitle(int i, CharSequence charsequence)
	{
		i = GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(((View) (this))));
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:invokestatic    #346 <Method int ViewCompat.getLayoutDirection(View)>
	//    3    5:invokestatic    #630 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//    4    8:istore_1        
		if(i == 3)
	//*   5    9:iload_1         
	//*   6   10:iconst_3        
	//*   7   11:icmpne          20
		{
			mTitleLeft = charsequence;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #668 <Field CharSequence mTitleLeft>
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
	//   17   27:putfield        #670 <Field CharSequence mTitleRight>
	//   18   30:return          
	}

	void setDrawerViewOffset(View view, float f)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//    3    7:astore_3        
		if(f == layoutparams.onScreen)
	//*   4    8:fload_2         
	//*   5    9:aload_3         
	//*   6   10:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
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
	//   12   20:putfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
			dispatchOnDrawerSlide(view, f);
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:fload_2         
	//   16   26:invokevirtual   #948 <Method void dispatchOnDrawerSlide(View, float)>
			return;
	//   17   29:return          
		}
	}

	public void setScrimColor(int i)
	{
		mScrimColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #162 <Field int mScrimColor>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #512 <Method void invalidate()>
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
	//    3    5:invokevirtual   #643 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #941 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		mStatusBarBackground = drawable;
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:putfield        #273 <Field Drawable mStatusBarBackground>
		invalidate();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #512 <Method void invalidate()>
	//   15   27:return          
	}

	public void setStatusBarBackground(Drawable drawable)
	{
		mStatusBarBackground = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #273 <Field Drawable mStatusBarBackground>
		invalidate();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #512 <Method void invalidate()>
	//    5    9:return          
	}

	public void setStatusBarBackgroundColor(int i)
	{
		mStatusBarBackground = ((Drawable) (new ColorDrawable(i)));
	//    0    0:aload_0         
	//    1    1:new             #955 <Class ColorDrawable>
	//    2    4:dup             
	//    3    5:iload_1         
	//    4    6:invokespecial   #957 <Method void ColorDrawable(int)>
	//    5    9:putfield        #273 <Field Drawable mStatusBarBackground>
		invalidate();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #512 <Method void invalidate()>
	//    8   16:return          
	}

	void updateDrawerState(int i, int j, View view)
	{
		i = mLeftDragger.getViewDragState();
	//    0    0:aload_0         
	//    1    1:getfield        #225 <Field ViewDragHelper mLeftDragger>
	//    2    4:invokevirtual   #960 <Method int ViewDragHelper.getViewDragState()>
	//    3    7:istore_1        
		int k = mRightDragger.getViewDragState();
	//    4    8:aload_0         
	//    5    9:getfield        #238 <Field ViewDragHelper mRightDragger>
	//    6   12:invokevirtual   #960 <Method int ViewDragHelper.getViewDragState()>
	//    7   15:istore          4
		if(i == 1 || k == 1)
	//*   8   17:iload_1         
	//*   9   18:iconst_1        
	//*  10   19:icmpeq          28
	//*  11   22:iload           4
	//*  12   24:iconst_1        
	//*  13   25:icmpne          33
			i = 1;
	//   14   28:iconst_1        
	//   15   29:istore_1        
		else
	//*  16   30:goto            51
		if(i == 2 || k == 2)
	//*  17   33:iload_1         
	//*  18   34:iconst_2        
	//*  19   35:icmpeq          44
	//*  20   38:iload           4
	//*  21   40:iconst_2        
	//*  22   41:icmpne          49
			i = 2;
	//   23   44:iconst_2        
	//   24   45:istore_1        
		else
	//*  25   46:goto            51
			i = 0;
	//   26   49:iconst_0        
	//   27   50:istore_1        
		if(view != null && j == 0)
	//*  28   51:aload_3         
	//*  29   52:ifnull          101
	//*  30   55:iload_2         
	//*  31   56:ifne            101
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   32   59:aload_3         
	//   33   60:invokevirtual   #318 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   34   63:checkcast       #26  <Class DrawerLayout$LayoutParams>
	//   35   66:astore          5
			if(layoutparams.onScreen == 0.0F)
	//*  36   68:aload           5
	//*  37   70:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  38   73:fconst_0        
	//*  39   74:fcmpl           
	//*  40   75:ifne            86
				dispatchOnDrawerClosed(view);
	//   41   78:aload_0         
	//   42   79:aload_3         
	//   43   80:invokevirtual   #962 <Method void dispatchOnDrawerClosed(View)>
			else
	//*  44   83:goto            101
			if(layoutparams.onScreen == 1.0F)
	//*  45   86:aload           5
	//*  46   88:getfield        #479 <Field float DrawerLayout$LayoutParams.onScreen>
	//*  47   91:fconst_1        
	//*  48   92:fcmpl           
	//*  49   93:ifne            101
				dispatchOnDrawerOpened(view);
	//   50   96:aload_0         
	//   51   97:aload_3         
	//   52   98:invokevirtual   #964 <Method void dispatchOnDrawerOpened(View)>
		}
		if(i != mDrawerState)
	//*  53  101:iload_1         
	//*  54  102:aload_0         
	//*  55  103:getfield        #966 <Field int mDrawerState>
	//*  56  106:icmpeq          163
		{
			mDrawerState = i;
	//   57  109:aload_0         
	//   58  110:iload_1         
	//   59  111:putfield        #966 <Field int mDrawerState>
			if(mListeners != null)
	//*  60  114:aload_0         
	//*  61  115:getfield        #368 <Field List mListeners>
	//*  62  118:ifnull          163
				for(j = mListeners.size() - 1; j >= 0; j--)
	//*  63  121:aload_0         
	//*  64  122:getfield        #368 <Field List mListeners>
	//*  65  125:invokeinterface #536 <Method int List.size()>
	//*  66  130:iconst_1        
	//*  67  131:isub            
	//*  68  132:istore_2        
	//*  69  133:iload_2         
	//*  70  134:iflt            163
					((DrawerListener)mListeners.get(j)).onDrawerStateChanged(i);
	//   71  137:aload_0         
	//   72  138:getfield        #368 <Field List mListeners>
	//   73  141:iload_2         
	//   74  142:invokeinterface #537 <Method Object List.get(int)>
	//   75  147:checkcast       #23  <Class DrawerLayout$DrawerListener>
	//   76  150:iload_1         
	//   77  151:invokeinterface #969 <Method void DrawerLayout$DrawerListener.onDrawerStateChanged(int)>

	//   78  156:iload_2         
	//   79  157:iconst_1        
	//   80  158:isub            
	//   81  159:istore_2        
		}
	//*  82  160:goto            133
	//   83  163:return          
	}

	private static final boolean ALLOW_EDGE_LOCK = false;
	static final boolean CAN_HIDE_DESCENDANTS;
	private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
	private static final int DEFAULT_SCRIM_COLOR = 0x99000000;
	private static final int DRAWER_ELEVATION = 10;
	static final DrawerLayoutCompatImpl IMPL;
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
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #129 <Int 0x10100b3>
	//    5    7:iastore         
	//    6    8:putstatic       #131 <Field int[] LAYOUT_ATTRS>
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   7   11:getstatic       #136 <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   14:bipush          19
	//*   9   16:icmplt          24
			flag = true;
	//   10   19:iconst_1        
	//   11   20:istore_0        
		else
	//*  12   21:goto            26
			flag = false;
	//   13   24:iconst_0        
	//   14   25:istore_0        
		CAN_HIDE_DESCENDANTS = flag;
	//   15   26:iload_0         
	//   16   27:putstatic       #138 <Field boolean CAN_HIDE_DESCENDANTS>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  17   30:getstatic       #136 <Field int android.os.Build$VERSION.SDK_INT>
	//*  18   33:bipush          21
	//*  19   35:icmplt          43
			flag = true;
	//   20   38:iconst_1        
	//   21   39:istore_0        
		else
	//*  22   40:goto            45
			flag = false;
	//   23   43:iconst_0        
	//   24   44:istore_0        
		SET_DRAWER_SHADOW_FROM_ELEVATION = flag;
	//   25   45:iload_0         
	//   26   46:putstatic       #140 <Field boolean SET_DRAWER_SHADOW_FROM_ELEVATION>
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*  27   49:getstatic       #136 <Field int android.os.Build$VERSION.SDK_INT>
	//*  28   52:bipush          21
	//*  29   54:icmplt          68
			IMPL = ((DrawerLayoutCompatImpl) (new DrawerLayoutCompatImplApi21()));
	//   30   57:new             #17  <Class DrawerLayout$DrawerLayoutCompatImplApi21>
	//   31   60:dup             
	//   32   61:invokespecial   #143 <Method void DrawerLayout$DrawerLayoutCompatImplApi21()>
	//   33   64:putstatic       #145 <Field DrawerLayout$DrawerLayoutCompatImpl IMPL>
	//   34   67:return          
		else
			IMPL = ((DrawerLayoutCompatImpl) (new DrawerLayoutCompatImplBase()));
	//   35   68:new             #20  <Class DrawerLayout$DrawerLayoutCompatImplBase>
	//   36   71:dup             
	//   37   72:invokespecial   #146 <Method void DrawerLayout$DrawerLayoutCompatImplBase()>
	//   38   75:putstatic       #145 <Field DrawerLayout$DrawerLayoutCompatImpl IMPL>
	//*  39   78:return          
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
