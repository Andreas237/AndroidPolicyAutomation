// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityRecordCompatIcs, AccessibilityRecordCompatIcsMr1, AccessibilityRecordCompatJellyBean

public class AccessibilityRecordCompat
{
	static class AccessibilityRecordIcsImpl extends AccessibilityRecordStubImpl
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

		AccessibilityRecordIcsImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityRecordCompat$AccessibilityRecordStubImpl()>
		//    2    4:return          
		}
	}

	static class AccessibilityRecordIcsMr1Impl extends AccessibilityRecordIcsImpl
	{

		public int getMaxScrollX(Object obj)
		{
			return AccessibilityRecordCompatIcsMr1.getMaxScrollX(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method int AccessibilityRecordCompatIcsMr1.getMaxScrollX(Object)>
		//    2    4:ireturn         
		}

		public int getMaxScrollY(Object obj)
		{
			return AccessibilityRecordCompatIcsMr1.getMaxScrollY(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #21  <Method int AccessibilityRecordCompatIcsMr1.getMaxScrollY(Object)>
		//    2    4:ireturn         
		}

		public void setMaxScrollX(Object obj, int i)
		{
			AccessibilityRecordCompatIcsMr1.setMaxScrollX(obj, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #25  <Method void AccessibilityRecordCompatIcsMr1.setMaxScrollX(Object, int)>
		//    3    5:return          
		}

		public void setMaxScrollY(Object obj, int i)
		{
			AccessibilityRecordCompatIcsMr1.setMaxScrollY(obj, i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokestatic    #28  <Method void AccessibilityRecordCompatIcsMr1.setMaxScrollY(Object, int)>
		//    3    5:return          
		}

		AccessibilityRecordIcsMr1Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityRecordCompat$AccessibilityRecordIcsImpl()>
		//    2    4:return          
		}
	}

	static interface AccessibilityRecordImpl
	{

		public abstract int getAddedCount(Object obj);

		public abstract CharSequence getBeforeText(Object obj);

		public abstract CharSequence getClassName(Object obj);

		public abstract CharSequence getContentDescription(Object obj);

		public abstract int getCurrentItemIndex(Object obj);

		public abstract int getFromIndex(Object obj);

		public abstract int getItemCount(Object obj);

		public abstract int getMaxScrollX(Object obj);

		public abstract int getMaxScrollY(Object obj);

		public abstract Parcelable getParcelableData(Object obj);

		public abstract int getRemovedCount(Object obj);

		public abstract int getScrollX(Object obj);

		public abstract int getScrollY(Object obj);

		public abstract AccessibilityNodeInfoCompat getSource(Object obj);

		public abstract List getText(Object obj);

		public abstract int getToIndex(Object obj);

		public abstract int getWindowId(Object obj);

		public abstract boolean isChecked(Object obj);

		public abstract boolean isEnabled(Object obj);

		public abstract boolean isFullScreen(Object obj);

		public abstract boolean isPassword(Object obj);

		public abstract boolean isScrollable(Object obj);

		public abstract Object obtain();

		public abstract Object obtain(Object obj);

		public abstract void recycle(Object obj);

		public abstract void setAddedCount(Object obj, int i);

		public abstract void setBeforeText(Object obj, CharSequence charsequence);

		public abstract void setChecked(Object obj, boolean flag);

		public abstract void setClassName(Object obj, CharSequence charsequence);

		public abstract void setContentDescription(Object obj, CharSequence charsequence);

		public abstract void setCurrentItemIndex(Object obj, int i);

		public abstract void setEnabled(Object obj, boolean flag);

		public abstract void setFromIndex(Object obj, int i);

		public abstract void setFullScreen(Object obj, boolean flag);

		public abstract void setItemCount(Object obj, int i);

		public abstract void setMaxScrollX(Object obj, int i);

		public abstract void setMaxScrollY(Object obj, int i);

		public abstract void setParcelableData(Object obj, Parcelable parcelable);

		public abstract void setPassword(Object obj, boolean flag);

		public abstract void setRemovedCount(Object obj, int i);

		public abstract void setScrollX(Object obj, int i);

		public abstract void setScrollY(Object obj, int i);

		public abstract void setScrollable(Object obj, boolean flag);

		public abstract void setSource(Object obj, View view);

		public abstract void setSource(Object obj, View view, int i);

		public abstract void setToIndex(Object obj, int i);
	}

	static class AccessibilityRecordJellyBeanImpl extends AccessibilityRecordIcsMr1Impl
	{

		public void setSource(Object obj, View view, int i)
		{
			AccessibilityRecordCompatJellyBean.setSource(obj, view, i);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:iload_3         
		//    3    3:invokestatic    #18  <Method void AccessibilityRecordCompatJellyBean.setSource(Object, View, int)>
		//    4    6:return          
		}

		AccessibilityRecordJellyBeanImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void AccessibilityRecordCompat$AccessibilityRecordIcsMr1Impl()>
		//    2    4:return          
		}
	}

	static class AccessibilityRecordStubImpl
		implements AccessibilityRecordImpl
	{

		public int getAddedCount(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public CharSequence getBeforeText(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public CharSequence getClassName(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public CharSequence getContentDescription(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getCurrentItemIndex(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getFromIndex(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getItemCount(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getMaxScrollX(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getMaxScrollY(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Parcelable getParcelableData(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getRemovedCount(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getScrollX(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getScrollY(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public AccessibilityNodeInfoCompat getSource(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public List getText(Object obj)
		{
			return Collections.emptyList();
		//    0    0:invokestatic    #40  <Method List Collections.emptyList()>
		//    1    3:areturn         
		}

		public int getToIndex(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getWindowId(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isChecked(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isEnabled(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isFullScreen(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isPassword(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isScrollable(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public Object obtain()
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object obtain(Object obj)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void recycle(Object obj)
		{
		//    0    0:return          
		}

		public void setAddedCount(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setBeforeText(Object obj, CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void setChecked(Object obj, boolean flag)
		{
		//    0    0:return          
		}

		public void setClassName(Object obj, CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void setContentDescription(Object obj, CharSequence charsequence)
		{
		//    0    0:return          
		}

		public void setCurrentItemIndex(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setEnabled(Object obj, boolean flag)
		{
		//    0    0:return          
		}

		public void setFromIndex(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setFullScreen(Object obj, boolean flag)
		{
		//    0    0:return          
		}

		public void setItemCount(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setMaxScrollX(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setMaxScrollY(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setParcelableData(Object obj, Parcelable parcelable)
		{
		//    0    0:return          
		}

		public void setPassword(Object obj, boolean flag)
		{
		//    0    0:return          
		}

		public void setRemovedCount(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setScrollX(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setScrollY(Object obj, int i)
		{
		//    0    0:return          
		}

		public void setScrollable(Object obj, boolean flag)
		{
		//    0    0:return          
		}

		public void setSource(Object obj, View view)
		{
		//    0    0:return          
		}

		public void setSource(Object obj, View view, int i)
		{
		//    0    0:return          
		}

		public void setToIndex(Object obj, int i)
		{
		//    0    0:return          
		}

		AccessibilityRecordStubImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	public AccessibilityRecordCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		mRecord = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field Object mRecord>
	//    5    9:return          
	}

	public static AccessibilityRecordCompat obtain()
	{
		return new AccessibilityRecordCompat(IMPL.obtain());
	//    0    0:new             #2   <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    3    7:invokeinterface #51  <Method Object AccessibilityRecordCompat$AccessibilityRecordImpl.obtain()>
	//    4   12:invokespecial   #53  <Method void AccessibilityRecordCompat(Object)>
	//    5   15:areturn         
	}

	public static AccessibilityRecordCompat obtain(AccessibilityRecordCompat accessibilityrecordcompat)
	{
		return new AccessibilityRecordCompat(IMPL.obtain(accessibilityrecordcompat.mRecord));
	//    0    0:new             #2   <Class AccessibilityRecordCompat>
	//    1    3:dup             
	//    2    4:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    3    7:aload_0         
	//    4    8:getfield        #45  <Field Object mRecord>
	//    5   11:invokeinterface #57  <Method Object AccessibilityRecordCompat$AccessibilityRecordImpl.obtain(Object)>
	//    6   16:invokespecial   #53  <Method void AccessibilityRecordCompat(Object)>
	//    7   19:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(((Object)this).getClass() != obj.getClass())
	//*   9   13:aload_0         
	//*  10   14:invokevirtual   #63  <Method Class Object.getClass()>
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #63  <Method Class Object.getClass()>
	//*  13   21:if_acmpeq       26
			return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
		obj = ((Object) ((AccessibilityRecordCompat)obj));
	//   16   26:aload_1         
	//   17   27:checkcast       #2   <Class AccessibilityRecordCompat>
	//   18   30:astore_1        
		if(mRecord == null)
	//*  19   31:aload_0         
	//*  20   32:getfield        #45  <Field Object mRecord>
	//*  21   35:ifnonnull       47
		{
			if(((AccessibilityRecordCompat) (obj)).mRecord != null)
	//*  22   38:aload_1         
	//*  23   39:getfield        #45  <Field Object mRecord>
	//*  24   42:ifnull          63
				return false;
	//   25   45:iconst_0        
	//   26   46:ireturn         
		} else
		if(!mRecord.equals(((AccessibilityRecordCompat) (obj)).mRecord))
	//*  27   47:aload_0         
	//*  28   48:getfield        #45  <Field Object mRecord>
	//*  29   51:aload_1         
	//*  30   52:getfield        #45  <Field Object mRecord>
	//*  31   55:invokevirtual   #65  <Method boolean Object.equals(Object)>
	//*  32   58:ifne            63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		return true;
	//   35   63:iconst_1        
	//   36   64:ireturn         
	}

	public int getAddedCount()
	{
		return IMPL.getAddedCount(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #70  <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getAddedCount(Object)>
	//    4   12:ireturn         
	}

	public CharSequence getBeforeText()
	{
		return IMPL.getBeforeText(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #75  <Method CharSequence AccessibilityRecordCompat$AccessibilityRecordImpl.getBeforeText(Object)>
	//    4   12:areturn         
	}

	public CharSequence getClassName()
	{
		return IMPL.getClassName(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #78  <Method CharSequence AccessibilityRecordCompat$AccessibilityRecordImpl.getClassName(Object)>
	//    4   12:areturn         
	}

	public CharSequence getContentDescription()
	{
		return IMPL.getContentDescription(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #81  <Method CharSequence AccessibilityRecordCompat$AccessibilityRecordImpl.getContentDescription(Object)>
	//    4   12:areturn         
	}

	public int getCurrentItemIndex()
	{
		return IMPL.getCurrentItemIndex(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #84  <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getCurrentItemIndex(Object)>
	//    4   12:ireturn         
	}

	public int getFromIndex()
	{
		return IMPL.getFromIndex(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #87  <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getFromIndex(Object)>
	//    4   12:ireturn         
	}

	public Object getImpl()
	{
		return mRecord;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object mRecord>
	//    2    4:areturn         
	}

	public int getItemCount()
	{
		return IMPL.getItemCount(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #91  <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getItemCount(Object)>
	//    4   12:ireturn         
	}

	public int getMaxScrollX()
	{
		return IMPL.getMaxScrollX(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #94  <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getMaxScrollX(Object)>
	//    4   12:ireturn         
	}

	public int getMaxScrollY()
	{
		return IMPL.getMaxScrollY(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #97  <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getMaxScrollY(Object)>
	//    4   12:ireturn         
	}

	public Parcelable getParcelableData()
	{
		return IMPL.getParcelableData(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #102 <Method Parcelable AccessibilityRecordCompat$AccessibilityRecordImpl.getParcelableData(Object)>
	//    4   12:areturn         
	}

	public int getRemovedCount()
	{
		return IMPL.getRemovedCount(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #105 <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getRemovedCount(Object)>
	//    4   12:ireturn         
	}

	public int getScrollX()
	{
		return IMPL.getScrollX(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #108 <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getScrollX(Object)>
	//    4   12:ireturn         
	}

	public int getScrollY()
	{
		return IMPL.getScrollY(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #111 <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getScrollY(Object)>
	//    4   12:ireturn         
	}

	public AccessibilityNodeInfoCompat getSource()
	{
		return IMPL.getSource(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #116 <Method AccessibilityNodeInfoCompat AccessibilityRecordCompat$AccessibilityRecordImpl.getSource(Object)>
	//    4   12:areturn         
	}

	public List getText()
	{
		return IMPL.getText(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #121 <Method List AccessibilityRecordCompat$AccessibilityRecordImpl.getText(Object)>
	//    4   12:areturn         
	}

	public int getToIndex()
	{
		return IMPL.getToIndex(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #126 <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getToIndex(Object)>
	//    4   12:ireturn         
	}

	public int getWindowId()
	{
		return IMPL.getWindowId(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #129 <Method int AccessibilityRecordCompat$AccessibilityRecordImpl.getWindowId(Object)>
	//    4   12:ireturn         
	}

	public int hashCode()
	{
		if(mRecord == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object mRecord>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mRecord.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field Object mRecord>
	//    7   13:invokevirtual   #132 <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isChecked()
	{
		return IMPL.isChecked(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #136 <Method boolean AccessibilityRecordCompat$AccessibilityRecordImpl.isChecked(Object)>
	//    4   12:ireturn         
	}

	public boolean isEnabled()
	{
		return IMPL.isEnabled(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #139 <Method boolean AccessibilityRecordCompat$AccessibilityRecordImpl.isEnabled(Object)>
	//    4   12:ireturn         
	}

	public boolean isFullScreen()
	{
		return IMPL.isFullScreen(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #142 <Method boolean AccessibilityRecordCompat$AccessibilityRecordImpl.isFullScreen(Object)>
	//    4   12:ireturn         
	}

	public boolean isPassword()
	{
		return IMPL.isPassword(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #145 <Method boolean AccessibilityRecordCompat$AccessibilityRecordImpl.isPassword(Object)>
	//    4   12:ireturn         
	}

	public boolean isScrollable()
	{
		return IMPL.isScrollable(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #148 <Method boolean AccessibilityRecordCompat$AccessibilityRecordImpl.isScrollable(Object)>
	//    4   12:ireturn         
	}

	public void recycle()
	{
		IMPL.recycle(mRecord);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:invokeinterface #151 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.recycle(Object)>
	//    4   12:return          
	}

	public void setAddedCount(int i)
	{
		IMPL.setAddedCount(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #156 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setAddedCount(Object, int)>
	//    5   13:return          
	}

	public void setBeforeText(CharSequence charsequence)
	{
		IMPL.setBeforeText(mRecord, charsequence);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:aload_1         
	//    4    8:invokeinterface #161 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setBeforeText(Object, CharSequence)>
	//    5   13:return          
	}

	public void setChecked(boolean flag)
	{
		IMPL.setChecked(mRecord, flag);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #166 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setChecked(Object, boolean)>
	//    5   13:return          
	}

	public void setClassName(CharSequence charsequence)
	{
		IMPL.setClassName(mRecord, charsequence);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:aload_1         
	//    4    8:invokeinterface #169 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setClassName(Object, CharSequence)>
	//    5   13:return          
	}

	public void setContentDescription(CharSequence charsequence)
	{
		IMPL.setContentDescription(mRecord, charsequence);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:aload_1         
	//    4    8:invokeinterface #172 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setContentDescription(Object, CharSequence)>
	//    5   13:return          
	}

	public void setCurrentItemIndex(int i)
	{
		IMPL.setCurrentItemIndex(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #175 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setCurrentItemIndex(Object, int)>
	//    5   13:return          
	}

	public void setEnabled(boolean flag)
	{
		IMPL.setEnabled(mRecord, flag);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #178 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setEnabled(Object, boolean)>
	//    5   13:return          
	}

	public void setFromIndex(int i)
	{
		IMPL.setFromIndex(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #181 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setFromIndex(Object, int)>
	//    5   13:return          
	}

	public void setFullScreen(boolean flag)
	{
		IMPL.setFullScreen(mRecord, flag);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #184 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setFullScreen(Object, boolean)>
	//    5   13:return          
	}

	public void setItemCount(int i)
	{
		IMPL.setItemCount(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #187 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setItemCount(Object, int)>
	//    5   13:return          
	}

	public void setMaxScrollX(int i)
	{
		IMPL.setMaxScrollX(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #190 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setMaxScrollX(Object, int)>
	//    5   13:return          
	}

	public void setMaxScrollY(int i)
	{
		IMPL.setMaxScrollY(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #193 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setMaxScrollY(Object, int)>
	//    5   13:return          
	}

	public void setParcelableData(Parcelable parcelable)
	{
		IMPL.setParcelableData(mRecord, parcelable);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:aload_1         
	//    4    8:invokeinterface #198 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setParcelableData(Object, Parcelable)>
	//    5   13:return          
	}

	public void setPassword(boolean flag)
	{
		IMPL.setPassword(mRecord, flag);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #201 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setPassword(Object, boolean)>
	//    5   13:return          
	}

	public void setRemovedCount(int i)
	{
		IMPL.setRemovedCount(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #204 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setRemovedCount(Object, int)>
	//    5   13:return          
	}

	public void setScrollX(int i)
	{
		IMPL.setScrollX(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #207 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setScrollX(Object, int)>
	//    5   13:return          
	}

	public void setScrollY(int i)
	{
		IMPL.setScrollY(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #210 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setScrollY(Object, int)>
	//    5   13:return          
	}

	public void setScrollable(boolean flag)
	{
		IMPL.setScrollable(mRecord, flag);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #213 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setScrollable(Object, boolean)>
	//    5   13:return          
	}

	public void setSource(View view)
	{
		IMPL.setSource(mRecord, view);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:aload_1         
	//    4    8:invokeinterface #218 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setSource(Object, View)>
	//    5   13:return          
	}

	public void setSource(View view, int i)
	{
		IMPL.setSource(mRecord, view, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:invokeinterface #222 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setSource(Object, View, int)>
	//    6   14:return          
	}

	public void setToIndex(int i)
	{
		IMPL.setToIndex(mRecord, i);
	//    0    0:getstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #45  <Field Object mRecord>
	//    3    7:iload_1         
	//    4    8:invokeinterface #225 <Method void AccessibilityRecordCompat$AccessibilityRecordImpl.setToIndex(Object, int)>
	//    5   13:return          
	}

	private static final AccessibilityRecordImpl IMPL;
	private final Object mRecord;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          19
			IMPL = ((AccessibilityRecordImpl) (new AccessibilityRecordJellyBeanImpl()));
	//    3    8:new             #15  <Class AccessibilityRecordCompat$AccessibilityRecordJellyBeanImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #34  <Method void AccessibilityRecordCompat$AccessibilityRecordJellyBeanImpl()>
	//    6   15:putstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 15)
	//*   8   19:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          15
	//*  10   24:icmplt          38
			IMPL = ((AccessibilityRecordImpl) (new AccessibilityRecordIcsMr1Impl()));
	//   11   27:new             #9   <Class AccessibilityRecordCompat$AccessibilityRecordIcsMr1Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #37  <Method void AccessibilityRecordCompat$AccessibilityRecordIcsMr1Impl()>
	//   14   34:putstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//   15   37:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*  16   38:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          14
	//*  18   43:icmplt          57
			IMPL = ((AccessibilityRecordImpl) (new AccessibilityRecordIcsImpl()));
	//   19   46:new             #6   <Class AccessibilityRecordCompat$AccessibilityRecordIcsImpl>
	//   20   49:dup             
	//   21   50:invokespecial   #38  <Method void AccessibilityRecordCompat$AccessibilityRecordIcsImpl()>
	//   22   53:putstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//   23   56:return          
		else
			IMPL = ((AccessibilityRecordImpl) (new AccessibilityRecordStubImpl()));
	//   24   57:new             #18  <Class AccessibilityRecordCompat$AccessibilityRecordStubImpl>
	//   25   60:dup             
	//   26   61:invokespecial   #39  <Method void AccessibilityRecordCompat$AccessibilityRecordStubImpl()>
	//   27   64:putstatic       #36  <Field AccessibilityRecordCompat$AccessibilityRecordImpl IMPL>
	//*  28   67:return          
	}
}
