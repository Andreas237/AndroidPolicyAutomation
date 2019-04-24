// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;

class AccessibilityRecordCompatIcs
{

	AccessibilityRecordCompatIcs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static int getAddedCount(Object obj)
	{
		return ((AccessibilityRecord)obj).getAddedCount();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #19  <Method int AccessibilityRecord.getAddedCount()>
	//    3    7:ireturn         
	}

	public static CharSequence getBeforeText(Object obj)
	{
		return ((AccessibilityRecord)obj).getBeforeText();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #24  <Method CharSequence AccessibilityRecord.getBeforeText()>
	//    3    7:areturn         
	}

	public static CharSequence getClassName(Object obj)
	{
		return ((AccessibilityRecord)obj).getClassName();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #27  <Method CharSequence AccessibilityRecord.getClassName()>
	//    3    7:areturn         
	}

	public static CharSequence getContentDescription(Object obj)
	{
		return ((AccessibilityRecord)obj).getContentDescription();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #30  <Method CharSequence AccessibilityRecord.getContentDescription()>
	//    3    7:areturn         
	}

	public static int getCurrentItemIndex(Object obj)
	{
		return ((AccessibilityRecord)obj).getCurrentItemIndex();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #33  <Method int AccessibilityRecord.getCurrentItemIndex()>
	//    3    7:ireturn         
	}

	public static int getFromIndex(Object obj)
	{
		return ((AccessibilityRecord)obj).getFromIndex();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #36  <Method int AccessibilityRecord.getFromIndex()>
	//    3    7:ireturn         
	}

	public static int getItemCount(Object obj)
	{
		return ((AccessibilityRecord)obj).getItemCount();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #39  <Method int AccessibilityRecord.getItemCount()>
	//    3    7:ireturn         
	}

	public static Parcelable getParcelableData(Object obj)
	{
		return ((AccessibilityRecord)obj).getParcelableData();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #44  <Method Parcelable AccessibilityRecord.getParcelableData()>
	//    3    7:areturn         
	}

	public static int getRemovedCount(Object obj)
	{
		return ((AccessibilityRecord)obj).getRemovedCount();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #47  <Method int AccessibilityRecord.getRemovedCount()>
	//    3    7:ireturn         
	}

	public static int getScrollX(Object obj)
	{
		return ((AccessibilityRecord)obj).getScrollX();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #50  <Method int AccessibilityRecord.getScrollX()>
	//    3    7:ireturn         
	}

	public static int getScrollY(Object obj)
	{
		return ((AccessibilityRecord)obj).getScrollY();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #53  <Method int AccessibilityRecord.getScrollY()>
	//    3    7:ireturn         
	}

	public static Object getSource(Object obj)
	{
		return ((Object) (((AccessibilityRecord)obj).getSource()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #58  <Method android.view.accessibility.AccessibilityNodeInfo AccessibilityRecord.getSource()>
	//    3    7:areturn         
	}

	public static List getText(Object obj)
	{
		return ((AccessibilityRecord)obj).getText();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #63  <Method List AccessibilityRecord.getText()>
	//    3    7:areturn         
	}

	public static int getToIndex(Object obj)
	{
		return ((AccessibilityRecord)obj).getToIndex();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #68  <Method int AccessibilityRecord.getToIndex()>
	//    3    7:ireturn         
	}

	public static int getWindowId(Object obj)
	{
		return ((AccessibilityRecord)obj).getWindowId();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #71  <Method int AccessibilityRecord.getWindowId()>
	//    3    7:ireturn         
	}

	public static boolean isChecked(Object obj)
	{
		return ((AccessibilityRecord)obj).isChecked();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #76  <Method boolean AccessibilityRecord.isChecked()>
	//    3    7:ireturn         
	}

	public static boolean isEnabled(Object obj)
	{
		return ((AccessibilityRecord)obj).isEnabled();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #79  <Method boolean AccessibilityRecord.isEnabled()>
	//    3    7:ireturn         
	}

	public static boolean isFullScreen(Object obj)
	{
		return ((AccessibilityRecord)obj).isFullScreen();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #82  <Method boolean AccessibilityRecord.isFullScreen()>
	//    3    7:ireturn         
	}

	public static boolean isPassword(Object obj)
	{
		return ((AccessibilityRecord)obj).isPassword();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #85  <Method boolean AccessibilityRecord.isPassword()>
	//    3    7:ireturn         
	}

	public static boolean isScrollable(Object obj)
	{
		return ((AccessibilityRecord)obj).isScrollable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #88  <Method boolean AccessibilityRecord.isScrollable()>
	//    3    7:ireturn         
	}

	public static Object obtain()
	{
		return ((Object) (AccessibilityRecord.obtain()));
	//    0    0:invokestatic    #93  <Method AccessibilityRecord AccessibilityRecord.obtain()>
	//    1    3:areturn         
	}

	public static Object obtain(Object obj)
	{
		return ((Object) (AccessibilityRecord.obtain((AccessibilityRecord)obj)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokestatic    #96  <Method AccessibilityRecord AccessibilityRecord.obtain(AccessibilityRecord)>
	//    3    7:areturn         
	}

	public static void recycle(Object obj)
	{
		((AccessibilityRecord)obj).recycle();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:invokevirtual   #100 <Method void AccessibilityRecord.recycle()>
	//    3    7:return          
	}

	public static void setAddedCount(Object obj, int i)
	{
		((AccessibilityRecord)obj).setAddedCount(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #105 <Method void AccessibilityRecord.setAddedCount(int)>
	//    4    8:return          
	}

	public static void setBeforeText(Object obj, CharSequence charsequence)
	{
		((AccessibilityRecord)obj).setBeforeText(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method void AccessibilityRecord.setBeforeText(CharSequence)>
	//    4    8:return          
	}

	public static void setChecked(Object obj, boolean flag)
	{
		((AccessibilityRecord)obj).setChecked(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #115 <Method void AccessibilityRecord.setChecked(boolean)>
	//    4    8:return          
	}

	public static void setClassName(Object obj, CharSequence charsequence)
	{
		((AccessibilityRecord)obj).setClassName(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #118 <Method void AccessibilityRecord.setClassName(CharSequence)>
	//    4    8:return          
	}

	public static void setContentDescription(Object obj, CharSequence charsequence)
	{
		((AccessibilityRecord)obj).setContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #121 <Method void AccessibilityRecord.setContentDescription(CharSequence)>
	//    4    8:return          
	}

	public static void setCurrentItemIndex(Object obj, int i)
	{
		((AccessibilityRecord)obj).setCurrentItemIndex(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #124 <Method void AccessibilityRecord.setCurrentItemIndex(int)>
	//    4    8:return          
	}

	public static void setEnabled(Object obj, boolean flag)
	{
		((AccessibilityRecord)obj).setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #127 <Method void AccessibilityRecord.setEnabled(boolean)>
	//    4    8:return          
	}

	public static void setFromIndex(Object obj, int i)
	{
		((AccessibilityRecord)obj).setFromIndex(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #130 <Method void AccessibilityRecord.setFromIndex(int)>
	//    4    8:return          
	}

	public static void setFullScreen(Object obj, boolean flag)
	{
		((AccessibilityRecord)obj).setFullScreen(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #133 <Method void AccessibilityRecord.setFullScreen(boolean)>
	//    4    8:return          
	}

	public static void setItemCount(Object obj, int i)
	{
		((AccessibilityRecord)obj).setItemCount(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #136 <Method void AccessibilityRecord.setItemCount(int)>
	//    4    8:return          
	}

	public static void setParcelableData(Object obj, Parcelable parcelable)
	{
		((AccessibilityRecord)obj).setParcelableData(parcelable);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #141 <Method void AccessibilityRecord.setParcelableData(Parcelable)>
	//    4    8:return          
	}

	public static void setPassword(Object obj, boolean flag)
	{
		((AccessibilityRecord)obj).setPassword(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #144 <Method void AccessibilityRecord.setPassword(boolean)>
	//    4    8:return          
	}

	public static void setRemovedCount(Object obj, int i)
	{
		((AccessibilityRecord)obj).setRemovedCount(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #147 <Method void AccessibilityRecord.setRemovedCount(int)>
	//    4    8:return          
	}

	public static void setScrollX(Object obj, int i)
	{
		((AccessibilityRecord)obj).setScrollX(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #150 <Method void AccessibilityRecord.setScrollX(int)>
	//    4    8:return          
	}

	public static void setScrollY(Object obj, int i)
	{
		((AccessibilityRecord)obj).setScrollY(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #153 <Method void AccessibilityRecord.setScrollY(int)>
	//    4    8:return          
	}

	public static void setScrollable(Object obj, boolean flag)
	{
		((AccessibilityRecord)obj).setScrollable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #156 <Method void AccessibilityRecord.setScrollable(boolean)>
	//    4    8:return          
	}

	public static void setSource(Object obj, View view)
	{
		((AccessibilityRecord)obj).setSource(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #161 <Method void AccessibilityRecord.setSource(View)>
	//    4    8:return          
	}

	public static void setToIndex(Object obj, int i)
	{
		((AccessibilityRecord)obj).setToIndex(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityRecord>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #164 <Method void AccessibilityRecord.setToIndex(int)>
	//    4    8:return          
	}
}
