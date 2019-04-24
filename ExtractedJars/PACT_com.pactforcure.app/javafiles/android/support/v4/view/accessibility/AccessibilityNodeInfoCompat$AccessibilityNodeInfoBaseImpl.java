// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl
{

	public void addAction(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
	//    0    0:return          
	}

	public void addChild(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
	//    0    0:return          
	}

	public boolean canOpenPopup(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public List findAccessibilityNodeInfosByViewId(AccessibilityNodeInfo accessibilitynodeinfo, String s)
	{
		return Collections.emptyList();
	//    0    0:invokestatic    #26  <Method List Collections.emptyList()>
	//    1    3:areturn         
	}

	public Object findFocus(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object focusSearch(AccessibilityNodeInfo accessibilitynodeinfo, int i)
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

	public List getActionList(AccessibilityNodeInfo accessibilitynodeinfo)
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

	public Object getCollectionInfo(AccessibilityNodeInfo accessibilitynodeinfo)
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

	public Object getCollectionItemInfo(AccessibilityNodeInfo accessibilitynodeinfo)
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

	public int getDrawingOrder(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public CharSequence getError(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Bundle getExtras(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return new Bundle();
	//    0    0:new             #65  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void Bundle()>
	//    3    7:areturn         
	}

	public int getInputType(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getLabelFor(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getLabeledBy(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getLiveRegion(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getMaxTextLength(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public int getMovementGranularities(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Object getRangeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public CharSequence getRoleDescription(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int getTextSelectionEnd(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public int getTextSelectionStart(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return -1;
	//    0    0:iconst_m1       
	//    1    1:ireturn         
	}

	public Object getTraversalAfter(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getTraversalBefore(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String getViewIdResourceName(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Object getWindow(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isAccessibilityFocused(AccessibilityNodeInfo accessibilitynodeinfo)
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

	public boolean isContentInvalid(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isContextClickable(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isDismissable(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isEditable(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isImportantForAccessibility(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isMultiLine(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isVisibleToUser(AccessibilityNodeInfo accessibilitynodeinfo)
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

	public AccessibilityNodeInfo obtain(View view, int i)
	{
		return null;
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

	public boolean performAction(AccessibilityNodeInfo accessibilitynodeinfo, int i, Bundle bundle)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean refresh(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean removeAction(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean removeChild(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean removeChild(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setAccessibilityFocused(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setCanOpenPopup(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setCollectionInfo(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
	//    0    0:return          
	}

	public void setCollectionItemInfo(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
	//    0    0:return          
	}

	public void setContentInvalid(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setContextClickable(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setDismissable(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setDrawingOrder(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
	//    0    0:return          
	}

	public void setEditable(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setError(AccessibilityNodeInfo accessibilitynodeinfo, CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setImportantForAccessibility(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setInputType(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
	//    0    0:return          
	}

	public void setLabelFor(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
	//    0    0:return          
	}

	public void setLabelFor(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
	//    0    0:return          
	}

	public void setLabeledBy(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
	//    0    0:return          
	}

	public void setLabeledBy(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
	//    0    0:return          
	}

	public void setLiveRegion(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
	//    0    0:return          
	}

	public void setMaxTextLength(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
	//    0    0:return          
	}

	public void setMovementGranularities(AccessibilityNodeInfo accessibilitynodeinfo, int i)
	{
	//    0    0:return          
	}

	public void setMultiLine(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	public void setParent(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
	//    0    0:return          
	}

	public void setRangeInfo(AccessibilityNodeInfo accessibilitynodeinfo, Object obj)
	{
	//    0    0:return          
	}

	public void setRoleDescription(AccessibilityNodeInfo accessibilitynodeinfo, CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void setSource(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
	//    0    0:return          
	}

	public void setTextSelection(AccessibilityNodeInfo accessibilitynodeinfo, int i, int j)
	{
	//    0    0:return          
	}

	public void setTraversalAfter(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
	//    0    0:return          
	}

	public void setTraversalAfter(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
	//    0    0:return          
	}

	public void setTraversalBefore(AccessibilityNodeInfo accessibilitynodeinfo, View view)
	{
	//    0    0:return          
	}

	public void setTraversalBefore(AccessibilityNodeInfo accessibilitynodeinfo, View view, int i)
	{
	//    0    0:return          
	}

	public void setViewIdResourceName(AccessibilityNodeInfo accessibilitynodeinfo, String s)
	{
	//    0    0:return          
	}

	public void setVisibleToUser(AccessibilityNodeInfo accessibilitynodeinfo, boolean flag)
	{
	//    0    0:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
