// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.*;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

// Referenced classes of package android.support.v4.widget:
//			NestedScrollView

static class NestedScrollView$AccessibilityDelegate extends AccessibilityDelegateCompat
{

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		view = ((View) ((NestedScrollView)view));
	//    4    6:aload_1         
	//    5    7:checkcast       #6   <Class NestedScrollView>
	//    6   10:astore_1        
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
	//    7   11:aload_2         
	//    8   12:ldc1            #18  <Class ScrollView>
	//    9   14:invokevirtual   #24  <Method String Class.getName()>
	//   10   17:invokevirtual   #30  <Method void AccessibilityEvent.setClassName(CharSequence)>
		accessibilityevent = ((AccessibilityEvent) (AccessibilityEventCompat.asRecord(accessibilityevent)));
	//   11   20:aload_2         
	//   12   21:invokestatic    #36  <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
	//   13   24:astore_2        
		boolean flag;
		if(((NestedScrollView) (view)).getScrollRange() > 0)
	//*  14   25:aload_1         
	//*  15   26:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
	//*  16   29:ifle            37
			flag = true;
	//   17   32:iconst_1        
	//   18   33:istore_3        
		else
	//*  19   34:goto            39
			flag = false;
	//   20   37:iconst_0        
	//   21   38:istore_3        
		((AccessibilityRecordCompat) (accessibilityevent)).setScrollable(flag);
	//   22   39:aload_2         
	//   23   40:iload_3         
	//   24   41:invokevirtual   #46  <Method void AccessibilityRecordCompat.setScrollable(boolean)>
		((AccessibilityRecordCompat) (accessibilityevent)).setScrollX(((NestedScrollView) (view)).getScrollX());
	//   25   44:aload_2         
	//   26   45:aload_1         
	//   27   46:invokevirtual   #49  <Method int NestedScrollView.getScrollX()>
	//   28   49:invokevirtual   #53  <Method void AccessibilityRecordCompat.setScrollX(int)>
		((AccessibilityRecordCompat) (accessibilityevent)).setScrollY(((NestedScrollView) (view)).getScrollY());
	//   29   52:aload_2         
	//   30   53:aload_1         
	//   31   54:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
	//   32   57:invokevirtual   #59  <Method void AccessibilityRecordCompat.setScrollY(int)>
		((AccessibilityRecordCompat) (accessibilityevent)).setMaxScrollX(((NestedScrollView) (view)).getScrollX());
	//   33   60:aload_2         
	//   34   61:aload_1         
	//   35   62:invokevirtual   #49  <Method int NestedScrollView.getScrollX()>
	//   36   65:invokevirtual   #62  <Method void AccessibilityRecordCompat.setMaxScrollX(int)>
		((AccessibilityRecordCompat) (accessibilityevent)).setMaxScrollY(((NestedScrollView) (view)).getScrollRange());
	//   37   68:aload_2         
	//   38   69:aload_1         
	//   39   70:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
	//   40   73:invokevirtual   #65  <Method void AccessibilityRecordCompat.setMaxScrollY(int)>
	//   41   76:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #69  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		view = ((View) ((NestedScrollView)view));
	//    4    6:aload_1         
	//    5    7:checkcast       #6   <Class NestedScrollView>
	//    6   10:astore_1        
		accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
	//    7   11:aload_2         
	//    8   12:ldc1            #18  <Class ScrollView>
	//    9   14:invokevirtual   #24  <Method String Class.getName()>
	//   10   17:invokevirtual   #72  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		if(((NestedScrollView) (view)).isEnabled())
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #76  <Method boolean NestedScrollView.isEnabled()>
	//*  13   24:ifeq            70
		{
			int i = ((NestedScrollView) (view)).getScrollRange();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
	//   16   31:istore_3        
			if(i > 0)
	//*  17   32:iload_3         
	//*  18   33:ifle            70
			{
				accessibilitynodeinfocompat.setScrollable(true);
	//   19   36:aload_2         
	//   20   37:iconst_1        
	//   21   38:invokevirtual   #77  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
				if(((NestedScrollView) (view)).getScrollY() > 0)
	//*  22   41:aload_1         
	//*  23   42:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
	//*  24   45:ifle            55
					accessibilitynodeinfocompat.addAction(8192);
	//   25   48:aload_2         
	//   26   49:sipush          8192
	//   27   52:invokevirtual   #80  <Method void AccessibilityNodeInfoCompat.addAction(int)>
				if(((NestedScrollView) (view)).getScrollY() < i)
	//*  28   55:aload_1         
	//*  29   56:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
	//*  30   59:iload_3         
	//*  31   60:icmpge          70
					accessibilitynodeinfocompat.addAction(4096);
	//   32   63:aload_2         
	//   33   64:sipush          4096
	//   34   67:invokevirtual   #80  <Method void AccessibilityNodeInfoCompat.addAction(int)>
			}
		}
	//   35   70:return          
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(super.performAccessibilityAction(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #84  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		view = ((View) ((NestedScrollView)view));
	//    8   12:aload_1         
	//    9   13:checkcast       #6   <Class NestedScrollView>
	//   10   16:astore_1        
		if(!((NestedScrollView) (view)).isEnabled())
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #76  <Method boolean NestedScrollView.isEnabled()>
	//*  13   21:ifne            26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		switch(i)
	//*  16   26:iload_2         
		{
	//*  17   27:lookupswitch    2: default 52
	//	               4096: 55
	//	               8192: 110
	//*  18   52:goto            162
		case 4096: 
			i = ((NestedScrollView) (view)).getHeight();
	//   19   55:aload_1         
	//   20   56:invokevirtual   #87  <Method int NestedScrollView.getHeight()>
	//   21   59:istore_2        
			int j = ((NestedScrollView) (view)).getPaddingBottom();
	//   22   60:aload_1         
	//   23   61:invokevirtual   #90  <Method int NestedScrollView.getPaddingBottom()>
	//   24   64:istore          4
			int l = ((NestedScrollView) (view)).getPaddingTop();
	//   25   66:aload_1         
	//   26   67:invokevirtual   #93  <Method int NestedScrollView.getPaddingTop()>
	//   27   70:istore          5
			i = Math.min(((NestedScrollView) (view)).getScrollY() + (i - j - l), ((NestedScrollView) (view)).getScrollRange());
	//   28   72:aload_1         
	//   29   73:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
	//   30   76:iload_2         
	//   31   77:iload           4
	//   32   79:isub            
	//   33   80:iload           5
	//   34   82:isub            
	//   35   83:iadd            
	//   36   84:aload_1         
	//   37   85:invokevirtual   #40  <Method int NestedScrollView.getScrollRange()>
	//   38   88:invokestatic    #99  <Method int Math.min(int, int)>
	//   39   91:istore_2        
			if(i != ((NestedScrollView) (view)).getScrollY())
	//*  40   92:iload_2         
	//*  41   93:aload_1         
	//*  42   94:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
	//*  43   97:icmpeq          108
			{
				((NestedScrollView) (view)).smoothScrollTo(0, i);
	//   44  100:aload_1         
	//   45  101:iconst_0        
	//   46  102:iload_2         
	//   47  103:invokevirtual   #103 <Method void NestedScrollView.smoothScrollTo(int, int)>
				return true;
	//   48  106:iconst_1        
	//   49  107:ireturn         
			} else
			{
				return false;
	//   50  108:iconst_0        
	//   51  109:ireturn         
			}

		case 8192: 
			i = ((NestedScrollView) (view)).getHeight();
	//   52  110:aload_1         
	//   53  111:invokevirtual   #87  <Method int NestedScrollView.getHeight()>
	//   54  114:istore_2        
			int k = ((NestedScrollView) (view)).getPaddingBottom();
	//   55  115:aload_1         
	//   56  116:invokevirtual   #90  <Method int NestedScrollView.getPaddingBottom()>
	//   57  119:istore          4
			int i1 = ((NestedScrollView) (view)).getPaddingTop();
	//   58  121:aload_1         
	//   59  122:invokevirtual   #93  <Method int NestedScrollView.getPaddingTop()>
	//   60  125:istore          5
			i = Math.max(((NestedScrollView) (view)).getScrollY() - (i - k - i1), 0);
	//   61  127:aload_1         
	//   62  128:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
	//   63  131:iload_2         
	//   64  132:iload           4
	//   65  134:isub            
	//   66  135:iload           5
	//   67  137:isub            
	//   68  138:isub            
	//   69  139:iconst_0        
	//   70  140:invokestatic    #106 <Method int Math.max(int, int)>
	//   71  143:istore_2        
			if(i != ((NestedScrollView) (view)).getScrollY())
	//*  72  144:iload_2         
	//*  73  145:aload_1         
	//*  74  146:invokevirtual   #56  <Method int NestedScrollView.getScrollY()>
	//*  75  149:icmpeq          160
			{
				((NestedScrollView) (view)).smoothScrollTo(0, i);
	//   76  152:aload_1         
	//   77  153:iconst_0        
	//   78  154:iload_2         
	//   79  155:invokevirtual   #103 <Method void NestedScrollView.smoothScrollTo(int, int)>
				return true;
	//   80  158:iconst_1        
	//   81  159:ireturn         
			} else
			{
				return false;
	//   82  160:iconst_0        
	//   83  161:ireturn         
			}
		}
		return false;
	//   84  162:iconst_0        
	//   85  163:ireturn         
	}

	NestedScrollView$AccessibilityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityDelegateCompat()>
	//    2    4:return          
	}
}
