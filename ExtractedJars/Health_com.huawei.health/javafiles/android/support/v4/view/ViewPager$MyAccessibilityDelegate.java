// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.view:
//			AccessibilityDelegateCompat, ViewPager, PagerAdapter

class ViewPager$MyAccessibilityDelegate extends AccessibilityDelegateCompat
{

	private boolean canScroll()
	{
		return mAdapter != null && mAdapter.getCount() > 1;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field ViewPager this$0>
	//    2    4:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
	//    3    7:ifnull          26
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field ViewPager this$0>
	//    6   14:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
	//    7   17:invokevirtual   #29  <Method int PagerAdapter.getCount()>
	//    8   20:iconst_1        
	//    9   21:icmple          26
	//   10   24:iconst_1        
	//   11   25:ireturn         
	//   12   26:iconst_0        
	//   13   27:ireturn         
	}

	public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(view, accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityEvent(View, AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class ViewPager>
	//    6    9:invokevirtual   #39  <Method String Class.getName()>
	//    7   12:invokevirtual   #45  <Method void AccessibilityEvent.setClassName(CharSequence)>
		view = ((View) (AccessibilityEventCompat.asRecord(accessibilityevent)));
	//    8   15:aload_2         
	//    9   16:invokestatic    #51  <Method AccessibilityRecordCompat AccessibilityEventCompat.asRecord(AccessibilityEvent)>
	//   10   19:astore_1        
		((AccessibilityRecordCompat) (view)).setScrollable(canScroll());
	//   11   20:aload_1         
	//   12   21:aload_0         
	//   13   22:invokespecial   #53  <Method boolean canScroll()>
	//   14   25:invokevirtual   #59  <Method void AccessibilityRecordCompat.setScrollable(boolean)>
		if(accessibilityevent.getEventType() == 4096 && mAdapter != null)
	//*  15   28:aload_2         
	//*  16   29:invokevirtual   #62  <Method int AccessibilityEvent.getEventType()>
	//*  17   32:sipush          4096
	//*  18   35:icmpne          84
	//*  19   38:aload_0         
	//*  20   39:getfield        #13  <Field ViewPager this$0>
	//*  21   42:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
	//*  22   45:ifnull          84
		{
			((AccessibilityRecordCompat) (view)).setItemCount(mAdapter.getCount());
	//   23   48:aload_1         
	//   24   49:aload_0         
	//   25   50:getfield        #13  <Field ViewPager this$0>
	//   26   53:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
	//   27   56:invokevirtual   #29  <Method int PagerAdapter.getCount()>
	//   28   59:invokevirtual   #66  <Method void AccessibilityRecordCompat.setItemCount(int)>
			((AccessibilityRecordCompat) (view)).setFromIndex(mCurItem);
	//   29   62:aload_1         
	//   30   63:aload_0         
	//   31   64:getfield        #13  <Field ViewPager this$0>
	//   32   67:getfield        #70  <Field int ViewPager.mCurItem>
	//   33   70:invokevirtual   #73  <Method void AccessibilityRecordCompat.setFromIndex(int)>
			((AccessibilityRecordCompat) (view)).setToIndex(mCurItem);
	//   34   73:aload_1         
	//   35   74:aload_0         
	//   36   75:getfield        #13  <Field ViewPager this$0>
	//   37   78:getfield        #70  <Field int ViewPager.mCurItem>
	//   38   81:invokevirtual   #76  <Method void AccessibilityRecordCompat.setToIndex(int)>
		}
	//   39   84:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #80  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class ViewPager>
	//    6    9:invokevirtual   #39  <Method String Class.getName()>
	//    7   12:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setScrollable(canScroll());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokespecial   #53  <Method boolean canScroll()>
	//   11   20:invokevirtual   #84  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		if(canScrollHorizontally(1))
	//*  12   23:aload_0         
	//*  13   24:getfield        #13  <Field ViewPager this$0>
	//*  14   27:iconst_1        
	//*  15   28:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  16   31:ifeq            41
			accessibilitynodeinfocompat.addAction(4096);
	//   17   34:aload_2         
	//   18   35:sipush          4096
	//   19   38:invokevirtual   #91  <Method void AccessibilityNodeInfoCompat.addAction(int)>
		if(canScrollHorizontally(-1))
	//*  20   41:aload_0         
	//*  21   42:getfield        #13  <Field ViewPager this$0>
	//*  22   45:iconst_m1       
	//*  23   46:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  24   49:ifeq            59
			accessibilitynodeinfocompat.addAction(8192);
	//   25   52:aload_2         
	//   26   53:sipush          8192
	//   27   56:invokevirtual   #91  <Method void AccessibilityNodeInfoCompat.addAction(int)>
	//   28   59:return          
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(super.performAccessibilityAction(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #95  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		switch(i)
	//*   8   12:iload_2         
		{
	//*   9   13:lookupswitch    2: default 40
	//	               4096: 43
	//	               8192: 74
	//*  10   40:goto            105
		case 4096: 
			if(canScrollHorizontally(1))
	//*  11   43:aload_0         
	//*  12   44:getfield        #13  <Field ViewPager this$0>
	//*  13   47:iconst_1        
	//*  14   48:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  15   51:ifeq            72
			{
				setCurrentItem(mCurItem + 1);
	//   16   54:aload_0         
	//   17   55:getfield        #13  <Field ViewPager this$0>
	//   18   58:aload_0         
	//   19   59:getfield        #13  <Field ViewPager this$0>
	//   20   62:getfield        #70  <Field int ViewPager.mCurItem>
	//   21   65:iconst_1        
	//   22   66:iadd            
	//   23   67:invokevirtual   #98  <Method void ViewPager.setCurrentItem(int)>
				return true;
	//   24   70:iconst_1        
	//   25   71:ireturn         
			} else
			{
				return false;
	//   26   72:iconst_0        
	//   27   73:ireturn         
			}

		case 8192: 
			if(canScrollHorizontally(-1))
	//*  28   74:aload_0         
	//*  29   75:getfield        #13  <Field ViewPager this$0>
	//*  30   78:iconst_m1       
	//*  31   79:invokevirtual   #88  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  32   82:ifeq            103
			{
				setCurrentItem(mCurItem - 1);
	//   33   85:aload_0         
	//   34   86:getfield        #13  <Field ViewPager this$0>
	//   35   89:aload_0         
	//   36   90:getfield        #13  <Field ViewPager this$0>
	//   37   93:getfield        #70  <Field int ViewPager.mCurItem>
	//   38   96:iconst_1        
	//   39   97:isub            
	//   40   98:invokevirtual   #98  <Method void ViewPager.setCurrentItem(int)>
				return true;
	//   41  101:iconst_1        
	//   42  102:ireturn         
			} else
			{
				return false;
	//   43  103:iconst_0        
	//   44  104:ireturn         
			}
		}
		return false;
	//   45  105:iconst_0        
	//   46  106:ireturn         
	}

	final ViewPager this$0;

	ViewPager$MyAccessibilityDelegate()
	{
		this$0 = ViewPager.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field ViewPager this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void AccessibilityDelegateCompat()>
	//    5    9:return          
	}
}
