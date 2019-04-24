// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

class AccessibilityNodeInfoCompatApi21
{
	static class CollectionInfo
	{

		public static int getSelectionMode(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo)obj).getSelectionMode();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionInfo>
		//    2    4:invokevirtual   #19  <Method int android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.getSelectionMode()>
		//    3    7:ireturn         
		}

		CollectionInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class CollectionItemInfo
	{

		public static boolean isSelected(Object obj)
		{
			return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo)obj).isSelected();
		//    0    0:aload_0         
		//    1    1:checkcast       #16  <Class android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo>
		//    2    4:invokevirtual   #19  <Method boolean android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.isSelected()>
		//    3    7:ireturn         
		}

		CollectionItemInfo()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	AccessibilityNodeInfoCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	static void addAction(Object obj, Object obj1)
	{
		((AccessibilityNodeInfo)obj).addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:checkcast       #24  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    4    8:invokevirtual   #27  <Method void AccessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    5   11:return          
	}

	static int getAccessibilityActionId(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getId();
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    2    4:invokevirtual   #33  <Method int android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getId()>
	//    3    7:ireturn         
	}

	static CharSequence getAccessibilityActionLabel(Object obj)
	{
		return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj).getLabel();
	//    0    0:aload_0         
	//    1    1:checkcast       #24  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    2    4:invokevirtual   #39  <Method CharSequence android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction.getLabel()>
	//    3    7:areturn         
	}

	static List getActionList(Object obj)
	{
		return (List)((AccessibilityNodeInfo)obj).getActionList();
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #44  <Method List AccessibilityNodeInfo.getActionList()>
	//    3    7:checkcast       #46  <Class List>
	//    4   10:areturn         
	}

	public static CharSequence getError(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getError();
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #51  <Method CharSequence AccessibilityNodeInfo.getError()>
	//    3    7:areturn         
	}

	public static int getMaxTextLength(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getMaxTextLength();
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #54  <Method int AccessibilityNodeInfo.getMaxTextLength()>
	//    3    7:ireturn         
	}

	public static Object getWindow(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getWindow()));
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #59  <Method android.view.accessibility.AccessibilityWindowInfo AccessibilityNodeInfo.getWindow()>
	//    3    7:areturn         
	}

	static Object newAccessibilityAction(int i, CharSequence charsequence)
	{
		return ((Object) (new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charsequence)));
	//    0    0:new             #24  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #64  <Method void android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction(int, CharSequence)>
	//    5    9:areturn         
	}

	public static Object obtainCollectionInfo(int i, int j, boolean flag, int k)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, j, flag, k)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokestatic    #72  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionInfo android.view.accessibility.AccessibilityNodeInfo$CollectionInfo.obtain(int, int, boolean, int)>
	//    5    7:areturn         
	}

	public static Object obtainCollectionItemInfo(int i, int j, int k, int l, boolean flag, boolean flag1)
	{
		return ((Object) (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, j, k, l, flag, flag1)));
	//    0    0:iload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokestatic    #79  <Method android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo.obtain(int, int, int, int, boolean, boolean)>
	//    7   11:areturn         
	}

	public static boolean removeAction(Object obj, Object obj1)
	{
		return ((AccessibilityNodeInfo)obj).removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction)obj1);
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:checkcast       #24  <Class android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction>
	//    4    8:invokevirtual   #84  <Method boolean AccessibilityNodeInfo.removeAction(android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction)>
	//    5   11:ireturn         
	}

	public static boolean removeChild(Object obj, View view)
	{
		return ((AccessibilityNodeInfo)obj).removeChild(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #89  <Method boolean AccessibilityNodeInfo.removeChild(View)>
	//    4    8:ireturn         
	}

	public static boolean removeChild(Object obj, View view, int i)
	{
		return ((AccessibilityNodeInfo)obj).removeChild(view, i);
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #93  <Method boolean AccessibilityNodeInfo.removeChild(View, int)>
	//    5    9:ireturn         
	}

	public static void setError(Object obj, CharSequence charsequence)
	{
		((AccessibilityNodeInfo)obj).setError(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #98  <Method void AccessibilityNodeInfo.setError(CharSequence)>
	//    4    8:return          
	}

	public static void setMaxTextLength(Object obj, int i)
	{
		((AccessibilityNodeInfo)obj).setMaxTextLength(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #22  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #103 <Method void AccessibilityNodeInfo.setMaxTextLength(int)>
	//    4    8:return          
	}
}
