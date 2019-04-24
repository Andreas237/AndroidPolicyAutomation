// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityRecordCompat, AccessibilityRecordCompatIcs, AccessibilityNodeInfoCompat

static class AccessibilityRecordCompat$AccessibilityRecordIcsImpl extends 
{

	public int getAddedCount(Object obj)
	{
		return AccessibilityRecordCompatIcs.getAddedCount(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #18  <Method int AccessibilityRecordCompatIcs.getAddedCount(Object)>
	//    2    4:ireturn         
	}

	public CharSequence getBeforeText(Object obj)
	{
		return AccessibilityRecordCompatIcs.getBeforeText(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #22  <Method CharSequence AccessibilityRecordCompatIcs.getBeforeText(Object)>
	//    2    4:areturn         
	}

	public CharSequence getClassName(Object obj)
	{
		return AccessibilityRecordCompatIcs.getClassName(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #25  <Method CharSequence AccessibilityRecordCompatIcs.getClassName(Object)>
	//    2    4:areturn         
	}

	public CharSequence getContentDescription(Object obj)
	{
		return AccessibilityRecordCompatIcs.getContentDescription(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #28  <Method CharSequence AccessibilityRecordCompatIcs.getContentDescription(Object)>
	//    2    4:areturn         
	}

	public int getCurrentItemIndex(Object obj)
	{
		return AccessibilityRecordCompatIcs.getCurrentItemIndex(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #31  <Method int AccessibilityRecordCompatIcs.getCurrentItemIndex(Object)>
	//    2    4:ireturn         
	}

	public int getFromIndex(Object obj)
	{
		return AccessibilityRecordCompatIcs.getFromIndex(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #34  <Method int AccessibilityRecordCompatIcs.getFromIndex(Object)>
	//    2    4:ireturn         
	}

	public int getItemCount(Object obj)
	{
		return AccessibilityRecordCompatIcs.getItemCount(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #37  <Method int AccessibilityRecordCompatIcs.getItemCount(Object)>
	//    2    4:ireturn         
	}

	public Parcelable getParcelableData(Object obj)
	{
		return AccessibilityRecordCompatIcs.getParcelableData(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #41  <Method Parcelable AccessibilityRecordCompatIcs.getParcelableData(Object)>
	//    2    4:areturn         
	}

	public int getRemovedCount(Object obj)
	{
		return AccessibilityRecordCompatIcs.getRemovedCount(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #44  <Method int AccessibilityRecordCompatIcs.getRemovedCount(Object)>
	//    2    4:ireturn         
	}

	public int getScrollX(Object obj)
	{
		return AccessibilityRecordCompatIcs.getScrollX(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #47  <Method int AccessibilityRecordCompatIcs.getScrollX(Object)>
	//    2    4:ireturn         
	}

	public int getScrollY(Object obj)
	{
		return AccessibilityRecordCompatIcs.getScrollY(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method int AccessibilityRecordCompatIcs.getScrollY(Object)>
	//    2    4:ireturn         
	}

	public AccessibilityNodeInfoCompat getSource(Object obj)
	{
		return AccessibilityNodeInfoCompat.wrapNonNullInstance(AccessibilityRecordCompatIcs.getSource(obj));
	//    0    0:aload_1         
	//    1    1:invokestatic    #55  <Method Object AccessibilityRecordCompatIcs.getSource(Object)>
	//    2    4:invokestatic    #60  <Method AccessibilityNodeInfoCompat AccessibilityNodeInfoCompat.wrapNonNullInstance(Object)>
	//    3    7:areturn         
	}

	public List getText(Object obj)
	{
		return AccessibilityRecordCompatIcs.getText(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #64  <Method List AccessibilityRecordCompatIcs.getText(Object)>
	//    2    4:areturn         
	}

	public int getToIndex(Object obj)
	{
		return AccessibilityRecordCompatIcs.getToIndex(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #69  <Method int AccessibilityRecordCompatIcs.getToIndex(Object)>
	//    2    4:ireturn         
	}

	public int getWindowId(Object obj)
	{
		return AccessibilityRecordCompatIcs.getWindowId(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #72  <Method int AccessibilityRecordCompatIcs.getWindowId(Object)>
	//    2    4:ireturn         
	}

	public boolean isChecked(Object obj)
	{
		return AccessibilityRecordCompatIcs.isChecked(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #76  <Method boolean AccessibilityRecordCompatIcs.isChecked(Object)>
	//    2    4:ireturn         
	}

	public boolean isEnabled(Object obj)
	{
		return AccessibilityRecordCompatIcs.isEnabled(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #79  <Method boolean AccessibilityRecordCompatIcs.isEnabled(Object)>
	//    2    4:ireturn         
	}

	public boolean isFullScreen(Object obj)
	{
		return AccessibilityRecordCompatIcs.isFullScreen(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #82  <Method boolean AccessibilityRecordCompatIcs.isFullScreen(Object)>
	//    2    4:ireturn         
	}

	public boolean isPassword(Object obj)
	{
		return AccessibilityRecordCompatIcs.isPassword(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #85  <Method boolean AccessibilityRecordCompatIcs.isPassword(Object)>
	//    2    4:ireturn         
	}

	public boolean isScrollable(Object obj)
	{
		return AccessibilityRecordCompatIcs.isScrollable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method boolean AccessibilityRecordCompatIcs.isScrollable(Object)>
	//    2    4:ireturn         
	}

	public Object obtain()
	{
		return AccessibilityRecordCompatIcs.obtain();
	//    0    0:invokestatic    #92  <Method Object AccessibilityRecordCompatIcs.obtain()>
	//    1    3:areturn         
	}

	public Object obtain(Object obj)
	{
		return AccessibilityRecordCompatIcs.obtain(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #94  <Method Object AccessibilityRecordCompatIcs.obtain(Object)>
	//    2    4:areturn         
	}

	public void recycle(Object obj)
	{
		AccessibilityRecordCompatIcs.recycle(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #98  <Method void AccessibilityRecordCompatIcs.recycle(Object)>
	//    2    4:return          
	}

	public void setAddedCount(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setAddedCount(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #102 <Method void AccessibilityRecordCompatIcs.setAddedCount(Object, int)>
	//    3    5:return          
	}

	public void setBeforeText(Object obj, CharSequence charsequence)
	{
		AccessibilityRecordCompatIcs.setBeforeText(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #106 <Method void AccessibilityRecordCompatIcs.setBeforeText(Object, CharSequence)>
	//    3    5:return          
	}

	public void setChecked(Object obj, boolean flag)
	{
		AccessibilityRecordCompatIcs.setChecked(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #110 <Method void AccessibilityRecordCompatIcs.setChecked(Object, boolean)>
	//    3    5:return          
	}

	public void setClassName(Object obj, CharSequence charsequence)
	{
		AccessibilityRecordCompatIcs.setClassName(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #113 <Method void AccessibilityRecordCompatIcs.setClassName(Object, CharSequence)>
	//    3    5:return          
	}

	public void setContentDescription(Object obj, CharSequence charsequence)
	{
		AccessibilityRecordCompatIcs.setContentDescription(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #116 <Method void AccessibilityRecordCompatIcs.setContentDescription(Object, CharSequence)>
	//    3    5:return          
	}

	public void setCurrentItemIndex(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setCurrentItemIndex(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #119 <Method void AccessibilityRecordCompatIcs.setCurrentItemIndex(Object, int)>
	//    3    5:return          
	}

	public void setEnabled(Object obj, boolean flag)
	{
		AccessibilityRecordCompatIcs.setEnabled(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #122 <Method void AccessibilityRecordCompatIcs.setEnabled(Object, boolean)>
	//    3    5:return          
	}

	public void setFromIndex(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setFromIndex(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #125 <Method void AccessibilityRecordCompatIcs.setFromIndex(Object, int)>
	//    3    5:return          
	}

	public void setFullScreen(Object obj, boolean flag)
	{
		AccessibilityRecordCompatIcs.setFullScreen(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #128 <Method void AccessibilityRecordCompatIcs.setFullScreen(Object, boolean)>
	//    3    5:return          
	}

	public void setItemCount(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setItemCount(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #131 <Method void AccessibilityRecordCompatIcs.setItemCount(Object, int)>
	//    3    5:return          
	}

	public void setParcelableData(Object obj, Parcelable parcelable)
	{
		AccessibilityRecordCompatIcs.setParcelableData(obj, parcelable);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #135 <Method void AccessibilityRecordCompatIcs.setParcelableData(Object, Parcelable)>
	//    3    5:return          
	}

	public void setPassword(Object obj, boolean flag)
	{
		AccessibilityRecordCompatIcs.setPassword(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #138 <Method void AccessibilityRecordCompatIcs.setPassword(Object, boolean)>
	//    3    5:return          
	}

	public void setRemovedCount(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setRemovedCount(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #141 <Method void AccessibilityRecordCompatIcs.setRemovedCount(Object, int)>
	//    3    5:return          
	}

	public void setScrollX(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setScrollX(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #144 <Method void AccessibilityRecordCompatIcs.setScrollX(Object, int)>
	//    3    5:return          
	}

	public void setScrollY(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setScrollY(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #147 <Method void AccessibilityRecordCompatIcs.setScrollY(Object, int)>
	//    3    5:return          
	}

	public void setScrollable(Object obj, boolean flag)
	{
		AccessibilityRecordCompatIcs.setScrollable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #150 <Method void AccessibilityRecordCompatIcs.setScrollable(Object, boolean)>
	//    3    5:return          
	}

	public void setSource(Object obj, View view)
	{
		AccessibilityRecordCompatIcs.setSource(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #154 <Method void AccessibilityRecordCompatIcs.setSource(Object, View)>
	//    3    5:return          
	}

	public void setToIndex(Object obj, int i)
	{
		AccessibilityRecordCompatIcs.setToIndex(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #157 <Method void AccessibilityRecordCompatIcs.setToIndex(Object, int)>
	//    3    5:return          
	}

	AccessibilityRecordCompat$AccessibilityRecordIcsImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityRecordCompat$AccessibilityRecordStubImpl()>
	//    2    4:return          
	}
}
