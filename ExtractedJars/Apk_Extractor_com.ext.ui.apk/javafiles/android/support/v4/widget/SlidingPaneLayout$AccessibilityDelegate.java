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

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

class SlidingPaneLayout$AccessibilityDelegate extends AccessibilityDelegateCompat
{

	private void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
	{
		Rect rect = mTmpRect;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Rect mTmpRect>
	//    2    4:astore_3        
		accessibilitynodeinfocompat1.getBoundsInParent(rect);
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #32  <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
		accessibilitynodeinfocompat.setBoundsInParent(rect);
	//    6   10:aload_1         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #35  <Method void AccessibilityNodeInfoCompat.setBoundsInParent(Rect)>
		accessibilitynodeinfocompat1.getBoundsInScreen(rect);
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokevirtual   #38  <Method void AccessibilityNodeInfoCompat.getBoundsInScreen(Rect)>
		accessibilitynodeinfocompat.setBoundsInScreen(rect);
	//   12   20:aload_1         
	//   13   21:aload_3         
	//   14   22:invokevirtual   #41  <Method void AccessibilityNodeInfoCompat.setBoundsInScreen(Rect)>
		accessibilitynodeinfocompat.setVisibleToUser(accessibilitynodeinfocompat1.isVisibleToUser());
	//   15   25:aload_1         
	//   16   26:aload_2         
	//   17   27:invokevirtual   #45  <Method boolean AccessibilityNodeInfoCompat.isVisibleToUser()>
	//   18   30:invokevirtual   #49  <Method void AccessibilityNodeInfoCompat.setVisibleToUser(boolean)>
		accessibilitynodeinfocompat.setPackageName(accessibilitynodeinfocompat1.getPackageName());
	//   19   33:aload_1         
	//   20   34:aload_2         
	//   21   35:invokevirtual   #53  <Method CharSequence AccessibilityNodeInfoCompat.getPackageName()>
	//   22   38:invokevirtual   #57  <Method void AccessibilityNodeInfoCompat.setPackageName(CharSequence)>
		accessibilitynodeinfocompat.setClassName(accessibilitynodeinfocompat1.getClassName());
	//   23   41:aload_1         
	//   24   42:aload_2         
	//   25   43:invokevirtual   #60  <Method CharSequence AccessibilityNodeInfoCompat.getClassName()>
	//   26   46:invokevirtual   #63  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setContentDescription(accessibilitynodeinfocompat1.getContentDescription());
	//   27   49:aload_1         
	//   28   50:aload_2         
	//   29   51:invokevirtual   #66  <Method CharSequence AccessibilityNodeInfoCompat.getContentDescription()>
	//   30   54:invokevirtual   #69  <Method void AccessibilityNodeInfoCompat.setContentDescription(CharSequence)>
		accessibilitynodeinfocompat.setEnabled(accessibilitynodeinfocompat1.isEnabled());
	//   31   57:aload_1         
	//   32   58:aload_2         
	//   33   59:invokevirtual   #72  <Method boolean AccessibilityNodeInfoCompat.isEnabled()>
	//   34   62:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.setEnabled(boolean)>
		accessibilitynodeinfocompat.setClickable(accessibilitynodeinfocompat1.isClickable());
	//   35   65:aload_1         
	//   36   66:aload_2         
	//   37   67:invokevirtual   #78  <Method boolean AccessibilityNodeInfoCompat.isClickable()>
	//   38   70:invokevirtual   #81  <Method void AccessibilityNodeInfoCompat.setClickable(boolean)>
		accessibilitynodeinfocompat.setFocusable(accessibilitynodeinfocompat1.isFocusable());
	//   39   73:aload_1         
	//   40   74:aload_2         
	//   41   75:invokevirtual   #84  <Method boolean AccessibilityNodeInfoCompat.isFocusable()>
	//   42   78:invokevirtual   #87  <Method void AccessibilityNodeInfoCompat.setFocusable(boolean)>
		accessibilitynodeinfocompat.setFocused(accessibilitynodeinfocompat1.isFocused());
	//   43   81:aload_1         
	//   44   82:aload_2         
	//   45   83:invokevirtual   #90  <Method boolean AccessibilityNodeInfoCompat.isFocused()>
	//   46   86:invokevirtual   #93  <Method void AccessibilityNodeInfoCompat.setFocused(boolean)>
		accessibilitynodeinfocompat.setAccessibilityFocused(accessibilitynodeinfocompat1.isAccessibilityFocused());
	//   47   89:aload_1         
	//   48   90:aload_2         
	//   49   91:invokevirtual   #96  <Method boolean AccessibilityNodeInfoCompat.isAccessibilityFocused()>
	//   50   94:invokevirtual   #99  <Method void AccessibilityNodeInfoCompat.setAccessibilityFocused(boolean)>
		accessibilitynodeinfocompat.setSelected(accessibilitynodeinfocompat1.isSelected());
	//   51   97:aload_1         
	//   52   98:aload_2         
	//   53   99:invokevirtual   #102 <Method boolean AccessibilityNodeInfoCompat.isSelected()>
	//   54  102:invokevirtual   #105 <Method void AccessibilityNodeInfoCompat.setSelected(boolean)>
		accessibilitynodeinfocompat.setLongClickable(accessibilitynodeinfocompat1.isLongClickable());
	//   55  105:aload_1         
	//   56  106:aload_2         
	//   57  107:invokevirtual   #108 <Method boolean AccessibilityNodeInfoCompat.isLongClickable()>
	//   58  110:invokevirtual   #111 <Method void AccessibilityNodeInfoCompat.setLongClickable(boolean)>
		accessibilitynodeinfocompat.addAction(accessibilitynodeinfocompat1.getActions());
	//   59  113:aload_1         
	//   60  114:aload_2         
	//   61  115:invokevirtual   #115 <Method int AccessibilityNodeInfoCompat.getActions()>
	//   62  118:invokevirtual   #119 <Method void AccessibilityNodeInfoCompat.addAction(int)>
		accessibilitynodeinfocompat.setMovementGranularities(accessibilitynodeinfocompat1.getMovementGranularities());
	//   63  121:aload_1         
	//   64  122:aload_2         
	//   65  123:invokevirtual   #122 <Method int AccessibilityNodeInfoCompat.getMovementGranularities()>
	//   66  126:invokevirtual   #125 <Method void AccessibilityNodeInfoCompat.setMovementGranularities(int)>
	//   67  129:return          
	}

	public boolean filter(View view)
	{
		return isDimmed(view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field SlidingPaneLayout this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method boolean SlidingPaneLayout.isDimmed(View)>
	//    4    8:ireturn         
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #134 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class SlidingPaneLayout>
	//    6    9:invokevirtual   #140 <Method String Class.getName()>
	//    7   12:invokevirtual   #143 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    8   15:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.obtain(accessibilitynodeinfocompat);
	//    0    0:aload_2         
	//    1    1:invokestatic    #149 <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.obtain(AccessibilityNodeInfoCompat)>
	//    2    4:astore          5
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload           5
	//    6   10:invokespecial   #151 <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		copyNodeInfoNoChildren(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:aload           5
	//   10   17:invokespecial   #153 <Method void copyNodeInfoNoChildren(AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat1.recycle();
	//   11   20:aload           5
	//   12   22:invokevirtual   #156 <Method void AccessibilityNodeInfoCompat.recycle()>
		accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/widget/SlidingPaneLayout)).getName())));
	//   13   25:aload_2         
	//   14   26:ldc1            #6   <Class SlidingPaneLayout>
	//   15   28:invokevirtual   #140 <Method String Class.getName()>
	//   16   31:invokevirtual   #63  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setSource(view);
	//   17   34:aload_2         
	//   18   35:aload_1         
	//   19   36:invokevirtual   #160 <Method void AccessibilityNodeInfoCompat.setSource(View)>
		view = ((View) (ViewCompat.getParentForAccessibility(view)));
	//   20   39:aload_1         
	//   21   40:invokestatic    #166 <Method android.view.ViewParent ViewCompat.getParentForAccessibility(View)>
	//   22   43:astore_1        
		if(view instanceof View)
	//*  23   44:aload_1         
	//*  24   45:instanceof      #168 <Class View>
	//*  25   48:ifeq            59
			accessibilitynodeinfocompat.setParent((View)view);
	//   26   51:aload_2         
	//   27   52:aload_1         
	//   28   53:checkcast       #168 <Class View>
	//   29   56:invokevirtual   #171 <Method void AccessibilityNodeInfoCompat.setParent(View)>
		int j = getChildCount();
	//   30   59:aload_0         
	//   31   60:getfield        #15  <Field SlidingPaneLayout this$0>
	//   32   63:invokevirtual   #174 <Method int SlidingPaneLayout.getChildCount()>
	//   33   66:istore          4
		for(int i = 0; i < j; i++)
	//*  34   68:iconst_0        
	//*  35   69:istore_3        
	//*  36   70:iload_3         
	//*  37   71:iload           4
	//*  38   73:icmpge          117
		{
			view = getChildAt(i);
	//   39   76:aload_0         
	//   40   77:getfield        #15  <Field SlidingPaneLayout this$0>
	//   41   80:iload_3         
	//   42   81:invokevirtual   #178 <Method View SlidingPaneLayout.getChildAt(int)>
	//   43   84:astore_1        
			if(!filter(view) && view.getVisibility() == 0)
	//*  44   85:aload_0         
	//*  45   86:aload_1         
	//*  46   87:invokevirtual   #180 <Method boolean filter(View)>
	//*  47   90:ifne            110
	//*  48   93:aload_1         
	//*  49   94:invokevirtual   #183 <Method int View.getVisibility()>
	//*  50   97:ifne            110
			{
				ViewCompat.setImportantForAccessibility(view, 1);
	//   51  100:aload_1         
	//   52  101:iconst_1        
	//   53  102:invokestatic    #187 <Method void ViewCompat.setImportantForAccessibility(View, int)>
				accessibilitynodeinfocompat.addChild(view);
	//   54  105:aload_2         
	//   55  106:aload_1         
	//   56  107:invokevirtual   #190 <Method void AccessibilityNodeInfoCompat.addChild(View)>
			}
		}

	//   57  110:iload_3         
	//   58  111:iconst_1        
	//   59  112:iadd            
	//   60  113:istore_3        
	//*  61  114:goto            70
	//   62  117:return          
	}

	public boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
	{
		if(!filter(view))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #180 <Method boolean filter(View)>
	//*   3    5:ifne            16
			return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:aload_3         
	//    8   12:invokespecial   #194 <Method boolean AccessibilityDelegateCompat.onRequestSendAccessibilityEvent(ViewGroup, View, AccessibilityEvent)>
	//    9   15:ireturn         
		else
			return false;
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	private final Rect mTmpRect = new Rect();
	final SlidingPaneLayout this$0;

	SlidingPaneLayout$AccessibilityDelegate()
	{
		this$0 = SlidingPaneLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field SlidingPaneLayout this$0>
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
