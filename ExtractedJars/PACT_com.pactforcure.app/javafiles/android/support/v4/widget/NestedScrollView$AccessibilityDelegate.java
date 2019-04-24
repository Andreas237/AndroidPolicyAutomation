// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.os.Bundle;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
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
		boolean flag;
		if(((NestedScrollView) (view)).getScrollRange() > 0)
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
	//*  13   24:ifle            67
			flag = true;
	//   14   27:iconst_1        
	//   15   28:istore_3        
		else
	//*  16   29:aload_2         
	//*  17   30:iload_3         
	//*  18   31:invokevirtual   #38  <Method void AccessibilityEvent.setScrollable(boolean)>
	//*  19   34:aload_2         
	//*  20   35:aload_1         
	//*  21   36:invokevirtual   #41  <Method int NestedScrollView.getScrollX()>
	//*  22   39:invokevirtual   #45  <Method void AccessibilityEvent.setScrollX(int)>
	//*  23   42:aload_2         
	//*  24   43:aload_1         
	//*  25   44:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//*  26   47:invokevirtual   #51  <Method void AccessibilityEvent.setScrollY(int)>
	//*  27   50:aload_2         
	//*  28   51:aload_1         
	//*  29   52:invokevirtual   #41  <Method int NestedScrollView.getScrollX()>
	//*  30   55:invokestatic    #57  <Method void AccessibilityRecordCompat.setMaxScrollX(android.view.accessibility.AccessibilityRecord, int)>
	//*  31   58:aload_2         
	//*  32   59:aload_1         
	//*  33   60:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
	//*  34   63:invokestatic    #60  <Method void AccessibilityRecordCompat.setMaxScrollY(android.view.accessibility.AccessibilityRecord, int)>
	//*  35   66:return          
			flag = false;
	//   36   67:iconst_0        
	//   37   68:istore_3        
		accessibilityevent.setScrollable(flag);
		accessibilityevent.setScrollX(((NestedScrollView) (view)).getScrollX());
		accessibilityevent.setScrollY(((NestedScrollView) (view)).getScrollY());
		AccessibilityRecordCompat.setMaxScrollX(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollX());
		AccessibilityRecordCompat.setMaxScrollY(((android.view.accessibility.AccessibilityRecord) (accessibilityevent)), ((NestedScrollView) (view)).getScrollRange());
	//*  38   69:goto            29
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #64  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		view = ((View) ((NestedScrollView)view));
	//    4    6:aload_1         
	//    5    7:checkcast       #6   <Class NestedScrollView>
	//    6   10:astore_1        
		accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/widget/ScrollView)).getName())));
	//    7   11:aload_2         
	//    8   12:ldc1            #18  <Class ScrollView>
	//    9   14:invokevirtual   #24  <Method String Class.getName()>
	//   10   17:invokevirtual   #67  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		if(((NestedScrollView) (view)).isEnabled())
	//*  11   20:aload_1         
	//*  12   21:invokevirtual   #71  <Method boolean NestedScrollView.isEnabled()>
	//*  13   24:ifeq            70
		{
			int i = ((NestedScrollView) (view)).getScrollRange();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
	//   16   31:istore_3        
			if(i > 0)
	//*  17   32:iload_3         
	//*  18   33:ifle            70
			{
				accessibilitynodeinfocompat.setScrollable(true);
	//   19   36:aload_2         
	//   20   37:iconst_1        
	//   21   38:invokevirtual   #72  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
				if(((NestedScrollView) (view)).getScrollY() > 0)
	//*  22   41:aload_1         
	//*  23   42:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//*  24   45:ifle            55
					accessibilitynodeinfocompat.addAction(8192);
	//   25   48:aload_2         
	//   26   49:sipush          8192
	//   27   52:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.addAction(int)>
				if(((NestedScrollView) (view)).getScrollY() < i)
	//*  28   55:aload_1         
	//*  29   56:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//*  30   59:iload_3         
	//*  31   60:icmpge          70
					accessibilitynodeinfocompat.addAction(4096);
	//   32   63:aload_2         
	//   33   64:sipush          4096
	//   34   67:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.addAction(int)>
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
	//*   4    4:invokespecial   #79  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
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
	//*  12   18:invokevirtual   #71  <Method boolean NestedScrollView.isEnabled()>
	//*  13   21:ifne            26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		switch(i)
	//*  16   26:iload_2         
		{
	//*  17   27:lookupswitch    2: default 52
	//	               4096: 54
	//	               8192: 109
		default:
			return false;
	//   18   52:iconst_0        
	//   19   53:ireturn         

		case 4096: 
			i = ((NestedScrollView) (view)).getHeight();
	//   20   54:aload_1         
	//   21   55:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
	//   22   58:istore_2        
			int j = ((NestedScrollView) (view)).getPaddingBottom();
	//   23   59:aload_1         
	//   24   60:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
	//   25   63:istore          4
			int l = ((NestedScrollView) (view)).getPaddingTop();
	//   26   65:aload_1         
	//   27   66:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
	//   28   69:istore          5
			i = Math.min(((NestedScrollView) (view)).getScrollY() + (i - j - l), ((NestedScrollView) (view)).getScrollRange());
	//   29   71:aload_1         
	//   30   72:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//   31   75:iload_2         
	//   32   76:iload           4
	//   33   78:isub            
	//   34   79:iload           5
	//   35   81:isub            
	//   36   82:iadd            
	//   37   83:aload_1         
	//   38   84:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
	//   39   87:invokestatic    #94  <Method int Math.min(int, int)>
	//   40   90:istore_2        
			if(i != ((NestedScrollView) (view)).getScrollY())
	//*  41   91:iload_2         
	//*  42   92:aload_1         
	//*  43   93:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//*  44   96:icmpeq          107
			{
				((NestedScrollView) (view)).smoothScrollTo(0, i);
	//   45   99:aload_1         
	//   46  100:iconst_0        
	//   47  101:iload_2         
	//   48  102:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
				return true;
	//   49  105:iconst_1        
	//   50  106:ireturn         
			} else
			{
				return false;
	//   51  107:iconst_0        
	//   52  108:ireturn         
			}

		case 8192: 
			i = ((NestedScrollView) (view)).getHeight();
	//   53  109:aload_1         
	//   54  110:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
	//   55  113:istore_2        
			int k = ((NestedScrollView) (view)).getPaddingBottom();
	//   56  114:aload_1         
	//   57  115:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
	//   58  118:istore          4
			int i1 = ((NestedScrollView) (view)).getPaddingTop();
	//   59  120:aload_1         
	//   60  121:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
	//   61  124:istore          5
			i = Math.max(((NestedScrollView) (view)).getScrollY() - (i - k - i1), 0);
	//   62  126:aload_1         
	//   63  127:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//   64  130:iload_2         
	//   65  131:iload           4
	//   66  133:isub            
	//   67  134:iload           5
	//   68  136:isub            
	//   69  137:isub            
	//   70  138:iconst_0        
	//   71  139:invokestatic    #101 <Method int Math.max(int, int)>
	//   72  142:istore_2        
			break;
		}
		if(i != ((NestedScrollView) (view)).getScrollY())
	//*  73  143:iload_2         
	//*  74  144:aload_1         
	//*  75  145:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//*  76  148:icmpeq          159
		{
			((NestedScrollView) (view)).smoothScrollTo(0, i);
	//   77  151:aload_1         
	//   78  152:iconst_0        
	//   79  153:iload_2         
	//   80  154:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
			return true;
	//   81  157:iconst_1        
	//   82  158:ireturn         
		} else
		{
			return false;
	//   83  159:iconst_0        
	//   84  160:ireturn         
		}
	}

	NestedScrollView$AccessibilityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityDelegateCompat()>
	//    2    4:return          
	}
}
