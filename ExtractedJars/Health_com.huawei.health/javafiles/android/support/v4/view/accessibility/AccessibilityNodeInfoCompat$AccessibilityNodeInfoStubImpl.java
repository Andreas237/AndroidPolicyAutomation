// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoStubImpl
	implements AccessibilityNodeInfoCompat.AccessibilityNodeInfoImpl
{

	public void addAction(Object obj, int i)
	{
	//    0    0:return          
	}

	public void addAction(Object obj, Object obj1)
	{
	//    0    0:return          
	}

	public void addChild(Object obj, View view)
	{
	//    0    0:return          
	}

	public void addChild(Object obj, View view, int i)
	{
	//    0    0:return          
	}

	public boolean canOpenPopup(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List findAccessibilityNodeInfosByText(Object obj, String s)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #30  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public List findAccessibilityNodeInfosByViewId(Object obj, String s)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #30  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public Object findFocus(Object obj, int i)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object focusSearch(Object obj, int i)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getAccessibilityActionId(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CharSequence getAccessibilityActionLabel(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionContextClick()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public List getActionList(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionScrollDown()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionScrollLeft()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionScrollRight()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionScrollToPosition()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionScrollUp()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionSetProgress()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getActionShowOnScreen()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getActions(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void getBoundsInParent(Object obj, Rect rect)
	{
	//    0    0:return          
	}

	public void getBoundsInScreen(Object obj, Rect rect)
	{
	//    0    0:return          
	}

	public Object getChild(Object obj, int i)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getChildCount(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CharSequence getClassName(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getCollectionInfo(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getCollectionInfoColumnCount(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getCollectionInfoRowCount(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getCollectionInfoSelectionMode(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getCollectionItemColumnIndex(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getCollectionItemColumnSpan(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getCollectionItemInfo(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getCollectionItemRowIndex(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getCollectionItemRowSpan(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CharSequence getContentDescription(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getDrawingOrder(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CharSequence getError(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Bundle getExtras(Object obj)
	{
		return new Bundle();
	//    0    0:new             #76  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void Bundle()>
	//    3    7:areturn         
	}

	public int getInputType(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getLabelFor(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getLabeledBy(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getLiveRegion(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getMaxTextLength(Object obj)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public int getMovementGranularities(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CharSequence getPackageName(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getParent(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getRangeInfo(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public CharSequence getRoleDescription(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public CharSequence getText(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getTextSelectionEnd(Object obj)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public int getTextSelectionStart(Object obj)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public Object getTraversalAfter(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getTraversalBefore(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getViewIdResourceName(Object obj)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getWindow(Object obj)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getWindowId(Object obj)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isAccessibilityFocused(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isCheckable(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isChecked(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isClickable(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isCollectionInfoHierarchical(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isCollectionItemHeading(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isCollectionItemSelected(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isContentInvalid(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isContextClickable(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isDismissable(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isEditable(Object obj)
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

	public boolean isFocusable(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isFocused(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isImportantForAccessibility(Object obj)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isLongClickable(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isMultiLine(Object obj)
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

	public boolean isSelected(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisibleToUser(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object newAccessibilityAction(int i, CharSequence charsequence)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object obtain()
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object obtain(View view)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object obtain(View view, int i)
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

	public Object obtainCollectionInfo(int i, int j, boolean flag)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object obtainCollectionInfo(int i, int j, boolean flag, int k)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object obtainRangeInfo(int i, float f, float f1, float f2)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean performAction(Object obj, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean performAction(Object obj, int i, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void recycle(Object obj)
	{
	//    0    0:return          
	}

	public boolean refresh(Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean removeAction(Object obj, Object obj1)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean removeChild(Object obj, View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean removeChild(Object obj, View view, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setAccessibilityFocused(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setBoundsInParent(Object obj, Rect rect)
	{
	//    0    0:return          
	}

	public void setBoundsInScreen(Object obj, Rect rect)
	{
	//    0    0:return          
	}

	public void setCanOpenPopup(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setCheckable(Object obj, boolean flag)
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

	public void setClickable(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setCollectionInfo(Object obj, Object obj1)
	{
	//    0    0:return          
	}

	public void setCollectionItemInfo(Object obj, Object obj1)
	{
	//    0    0:return          
	}

	public void setContentDescription(Object obj, CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setContentInvalid(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setContextClickable(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setDismissable(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setDrawingOrder(Object obj, int i)
	{
	//    0    0:return          
	}

	public void setEditable(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setEnabled(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setError(Object obj, CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setFocusable(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setFocused(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setImportantForAccessibility(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setInputType(Object obj, int i)
	{
	//    0    0:return          
	}

	public void setLabelFor(Object obj, View view)
	{
	//    0    0:return          
	}

	public void setLabelFor(Object obj, View view, int i)
	{
	//    0    0:return          
	}

	public void setLabeledBy(Object obj, View view)
	{
	//    0    0:return          
	}

	public void setLabeledBy(Object obj, View view, int i)
	{
	//    0    0:return          
	}

	public void setLiveRegion(Object obj, int i)
	{
	//    0    0:return          
	}

	public void setLongClickable(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setMaxTextLength(Object obj, int i)
	{
	//    0    0:return          
	}

	public void setMovementGranularities(Object obj, int i)
	{
	//    0    0:return          
	}

	public void setMultiLine(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setPackageName(Object obj, CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setParent(Object obj, View view)
	{
	//    0    0:return          
	}

	public void setParent(Object obj, View view, int i)
	{
	//    0    0:return          
	}

	public void setPassword(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setRangeInfo(Object obj, Object obj1)
	{
	//    0    0:return          
	}

	public void setRoleDescription(Object obj, CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setScrollable(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	public void setSelected(Object obj, boolean flag)
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

	public void setText(Object obj, CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setTextSelection(Object obj, int i, int j)
	{
	//    0    0:return          
	}

	public void setTraversalAfter(Object obj, View view)
	{
	//    0    0:return          
	}

	public void setTraversalAfter(Object obj, View view, int i)
	{
	//    0    0:return          
	}

	public void setTraversalBefore(Object obj, View view)
	{
	//    0    0:return          
	}

	public void setTraversalBefore(Object obj, View view, int i)
	{
	//    0    0:return          
	}

	public void setViewIdResourceName(Object obj, String s)
	{
	//    0    0:return          
	}

	public void setVisibleToUser(Object obj, boolean flag)
	{
	//    0    0:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoStubImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
