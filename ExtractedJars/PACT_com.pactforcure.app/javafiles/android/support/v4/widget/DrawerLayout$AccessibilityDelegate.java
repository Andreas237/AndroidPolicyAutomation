// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayout

class DrawerLayout$AccessibilityDelegate extends AccessibilityDelegateCompat
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
		accessibilitynodeinfocompat.removeAction(android.support.v4.view.accessibility.bilityActionCompat.ACTION_FOCUS);
		accessibilitynodeinfocompat.removeAction(android.support.v4.view.accessibility.bilityActionCompat.ACTION_CLEAR_FOCUS);
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

	DrawerLayout$AccessibilityDelegate()
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
