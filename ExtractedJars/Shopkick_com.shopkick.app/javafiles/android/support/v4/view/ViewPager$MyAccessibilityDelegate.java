// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
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
		accessibilityevent.setScrollable(canScroll());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokespecial   #47  <Method boolean canScroll()>
	//   11   20:invokevirtual   #51  <Method void AccessibilityEvent.setScrollable(boolean)>
		if(accessibilityevent.getEventType() == 4096 && mAdapter != null)
	//*  12   23:aload_2         
	//*  13   24:invokevirtual   #54  <Method int AccessibilityEvent.getEventType()>
	//*  14   27:sipush          4096
	//*  15   30:icmpne          79
	//*  16   33:aload_0         
	//*  17   34:getfield        #13  <Field ViewPager this$0>
	//*  18   37:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
	//*  19   40:ifnull          79
		{
			accessibilityevent.setItemCount(mAdapter.getCount());
	//   20   43:aload_2         
	//   21   44:aload_0         
	//   22   45:getfield        #13  <Field ViewPager this$0>
	//   23   48:getfield        #23  <Field PagerAdapter ViewPager.mAdapter>
	//   24   51:invokevirtual   #29  <Method int PagerAdapter.getCount()>
	//   25   54:invokevirtual   #58  <Method void AccessibilityEvent.setItemCount(int)>
			accessibilityevent.setFromIndex(mCurItem);
	//   26   57:aload_2         
	//   27   58:aload_0         
	//   28   59:getfield        #13  <Field ViewPager this$0>
	//   29   62:getfield        #62  <Field int ViewPager.mCurItem>
	//   30   65:invokevirtual   #65  <Method void AccessibilityEvent.setFromIndex(int)>
			accessibilityevent.setToIndex(mCurItem);
	//   31   68:aload_2         
	//   32   69:aload_0         
	//   33   70:getfield        #13  <Field ViewPager this$0>
	//   34   73:getfield        #62  <Field int ViewPager.mCurItem>
	//   35   76:invokevirtual   #68  <Method void AccessibilityEvent.setToIndex(int)>
		}
	//   36   79:return          
	}

	public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
	{
		super.onInitializeAccessibilityNodeInfo(view, accessibilitynodeinfocompat);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #72  <Method void AccessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(View, AccessibilityNodeInfoCompat)>
		accessibilitynodeinfocompat.setClassName(((CharSequence) (((Class) (android/support/v4/view/ViewPager)).getName())));
	//    4    6:aload_2         
	//    5    7:ldc1            #6   <Class ViewPager>
	//    6    9:invokevirtual   #39  <Method String Class.getName()>
	//    7   12:invokevirtual   #75  <Method void AccessibilityNodeInfoCompat.setClassName(CharSequence)>
		accessibilitynodeinfocompat.setScrollable(canScroll());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokespecial   #47  <Method boolean canScroll()>
	//   11   20:invokevirtual   #76  <Method void AccessibilityNodeInfoCompat.setScrollable(boolean)>
		if(canScrollHorizontally(1))
	//*  12   23:aload_0         
	//*  13   24:getfield        #13  <Field ViewPager this$0>
	//*  14   27:iconst_1        
	//*  15   28:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  16   31:ifeq            41
			accessibilitynodeinfocompat.addAction(4096);
	//   17   34:aload_2         
	//   18   35:sipush          4096
	//   19   38:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.addAction(int)>
		if(canScrollHorizontally(-1))
	//*  20   41:aload_0         
	//*  21   42:getfield        #13  <Field ViewPager this$0>
	//*  22   45:iconst_m1       
	//*  23   46:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  24   49:ifeq            59
			accessibilitynodeinfocompat.addAction(8192);
	//   25   52:aload_2         
	//   26   53:sipush          8192
	//   27   56:invokevirtual   #83  <Method void AccessibilityNodeInfoCompat.addAction(int)>
	//   28   59:return          
	}

	public boolean performAccessibilityAction(View view, int i, Bundle bundle)
	{
		if(super.performAccessibilityAction(view, i, bundle))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:iload_2         
	//*   3    3:aload_3         
	//*   4    4:invokespecial   #87  <Method boolean AccessibilityDelegateCompat.performAccessibilityAction(View, int, Bundle)>
	//*   5    7:ifeq            12
			return true;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(i != 4096)
	//*   8   12:iload_2         
	//*   9   13:sipush          4096
	//*  10   16:icmpeq          58
		{
			if(i != 8192)
	//*  11   19:iload_2         
	//*  12   20:sipush          8192
	//*  13   23:icmpeq          28
				return false;
	//   14   26:iconst_0        
	//   15   27:ireturn         
			if(canScrollHorizontally(-1))
	//*  16   28:aload_0         
	//*  17   29:getfield        #13  <Field ViewPager this$0>
	//*  18   32:iconst_m1       
	//*  19   33:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  20   36:ifeq            56
			{
				view = ((View) (ViewPager.this));
	//   21   39:aload_0         
	//   22   40:getfield        #13  <Field ViewPager this$0>
	//   23   43:astore_1        
				((ViewPager) (view)).setCurrentItem(((ViewPager) (view)).mCurItem - 1);
	//   24   44:aload_1         
	//   25   45:aload_1         
	//   26   46:getfield        #62  <Field int ViewPager.mCurItem>
	//   27   49:iconst_1        
	//   28   50:isub            
	//   29   51:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
				return true;
	//   30   54:iconst_1        
	//   31   55:ireturn         
			} else
			{
				return false;
	//   32   56:iconst_0        
	//   33   57:ireturn         
			}
		}
		if(canScrollHorizontally(1))
	//*  34   58:aload_0         
	//*  35   59:getfield        #13  <Field ViewPager this$0>
	//*  36   62:iconst_1        
	//*  37   63:invokevirtual   #80  <Method boolean ViewPager.canScrollHorizontally(int)>
	//*  38   66:ifeq            86
		{
			view = ((View) (ViewPager.this));
	//   39   69:aload_0         
	//   40   70:getfield        #13  <Field ViewPager this$0>
	//   41   73:astore_1        
			((ViewPager) (view)).setCurrentItem(((ViewPager) (view)).mCurItem + 1);
	//   42   74:aload_1         
	//   43   75:aload_1         
	//   44   76:getfield        #62  <Field int ViewPager.mCurItem>
	//   45   79:iconst_1        
	//   46   80:iadd            
	//   47   81:invokevirtual   #90  <Method void ViewPager.setCurrentItem(int)>
			return true;
	//   48   84:iconst_1        
	//   49   85:ireturn         
		} else
		{
			return false;
	//   50   86:iconst_0        
	//   51   87:ireturn         
		}
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
