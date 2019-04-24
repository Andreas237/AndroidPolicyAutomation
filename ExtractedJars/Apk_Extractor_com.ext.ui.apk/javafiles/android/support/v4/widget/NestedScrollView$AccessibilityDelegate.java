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
	//	               8192: 99
		default:
			return false;
	//   18   52:iconst_0        
	//   19   53:ireturn         

		case 4096: 
			i = Math.min((((NestedScrollView) (view)).getHeight() - ((NestedScrollView) (view)).getPaddingBottom() - ((NestedScrollView) (view)).getPaddingTop()) + ((NestedScrollView) (view)).getScrollY(), ((NestedScrollView) (view)).getScrollRange());
	//   20   54:aload_1         
	//   21   55:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
	//   22   58:aload_1         
	//   23   59:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
	//   24   62:isub            
	//   25   63:aload_1         
	//   26   64:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
	//   27   67:isub            
	//   28   68:aload_1         
	//   29   69:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//   30   72:iadd            
	//   31   73:aload_1         
	//   32   74:invokevirtual   #34  <Method int NestedScrollView.getScrollRange()>
	//   33   77:invokestatic    #94  <Method int Math.min(int, int)>
	//   34   80:istore_2        
			if(i != ((NestedScrollView) (view)).getScrollY())
	//*  35   81:iload_2         
	//*  36   82:aload_1         
	//*  37   83:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//*  38   86:icmpeq          97
			{
				((NestedScrollView) (view)).smoothScrollTo(0, i);
	//   39   89:aload_1         
	//   40   90:iconst_0        
	//   41   91:iload_2         
	//   42   92:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
				return true;
	//   43   95:iconst_1        
	//   44   96:ireturn         
			} else
			{
				return false;
	//   45   97:iconst_0        
	//   46   98:ireturn         
			}

		case 8192: 
			i = ((NestedScrollView) (view)).getHeight();
	//   47   99:aload_1         
	//   48  100:invokevirtual   #82  <Method int NestedScrollView.getHeight()>
	//   49  103:istore_2        
			int j = ((NestedScrollView) (view)).getPaddingBottom();
	//   50  104:aload_1         
	//   51  105:invokevirtual   #85  <Method int NestedScrollView.getPaddingBottom()>
	//   52  108:istore          4
			int k = ((NestedScrollView) (view)).getPaddingTop();
	//   53  110:aload_1         
	//   54  111:invokevirtual   #88  <Method int NestedScrollView.getPaddingTop()>
	//   55  114:istore          5
			i = Math.max(((NestedScrollView) (view)).getScrollY() - (i - j - k), 0);
	//   56  116:aload_1         
	//   57  117:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//   58  120:iload_2         
	//   59  121:iload           4
	//   60  123:isub            
	//   61  124:iload           5
	//   62  126:isub            
	//   63  127:isub            
	//   64  128:iconst_0        
	//   65  129:invokestatic    #101 <Method int Math.max(int, int)>
	//   66  132:istore_2        
			break;
		}
		if(i != ((NestedScrollView) (view)).getScrollY())
	//*  67  133:iload_2         
	//*  68  134:aload_1         
	//*  69  135:invokevirtual   #48  <Method int NestedScrollView.getScrollY()>
	//*  70  138:icmpeq          149
		{
			((NestedScrollView) (view)).smoothScrollTo(0, i);
	//   71  141:aload_1         
	//   72  142:iconst_0        
	//   73  143:iload_2         
	//   74  144:invokevirtual   #98  <Method void NestedScrollView.smoothScrollTo(int, int)>
			return true;
	//   75  147:iconst_1        
	//   76  148:ireturn         
		} else
		{
			return false;
	//   77  149:iconst_0        
	//   78  150:ireturn         
		}
	}

	NestedScrollView$AccessibilityDelegate()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityDelegateCompat()>
	//    2    4:return          
	}
}
