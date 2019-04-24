// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

class AccessibilityNodeInfoCompatIcs
{

	AccessibilityNodeInfoCompatIcs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public static void addAction(Object obj, int i)
	{
		((AccessibilityNodeInfo)obj).addAction(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #19  <Method void AccessibilityNodeInfo.addAction(int)>
	//    4    8:return          
	}

	public static void addChild(Object obj, View view)
	{
		((AccessibilityNodeInfo)obj).addChild(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method void AccessibilityNodeInfo.addChild(View)>
	//    4    8:return          
	}

	public static List findAccessibilityNodeInfosByText(Object obj, String s)
	{
		return (List)((AccessibilityNodeInfo)obj).findAccessibilityNodeInfosByText(s);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method List AccessibilityNodeInfo.findAccessibilityNodeInfosByText(String)>
	//    4    8:checkcast       #31  <Class List>
	//    5   11:areturn         
	}

	public static int getActions(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getActions();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #38  <Method int AccessibilityNodeInfo.getActions()>
	//    3    7:ireturn         
	}

	public static void getBoundsInParent(Object obj, Rect rect)
	{
		((AccessibilityNodeInfo)obj).getBoundsInParent(rect);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #43  <Method void AccessibilityNodeInfo.getBoundsInParent(Rect)>
	//    4    8:return          
	}

	public static void getBoundsInScreen(Object obj, Rect rect)
	{
		((AccessibilityNodeInfo)obj).getBoundsInScreen(rect);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method void AccessibilityNodeInfo.getBoundsInScreen(Rect)>
	//    4    8:return          
	}

	public static Object getChild(Object obj, int i)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getChild(i)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #51  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getChild(int)>
	//    4    8:areturn         
	}

	public static int getChildCount(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getChildCount();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #54  <Method int AccessibilityNodeInfo.getChildCount()>
	//    3    7:ireturn         
	}

	public static CharSequence getClassName(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getClassName();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #59  <Method CharSequence AccessibilityNodeInfo.getClassName()>
	//    3    7:areturn         
	}

	public static CharSequence getContentDescription(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getContentDescription();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #62  <Method CharSequence AccessibilityNodeInfo.getContentDescription()>
	//    3    7:areturn         
	}

	public static CharSequence getPackageName(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getPackageName();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #65  <Method CharSequence AccessibilityNodeInfo.getPackageName()>
	//    3    7:areturn         
	}

	public static Object getParent(Object obj)
	{
		return ((Object) (((AccessibilityNodeInfo)obj).getParent()));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #70  <Method AccessibilityNodeInfo AccessibilityNodeInfo.getParent()>
	//    3    7:areturn         
	}

	public static CharSequence getText(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getText();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #73  <Method CharSequence AccessibilityNodeInfo.getText()>
	//    3    7:areturn         
	}

	public static int getWindowId(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).getWindowId();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #76  <Method int AccessibilityNodeInfo.getWindowId()>
	//    3    7:ireturn         
	}

	public static boolean isCheckable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isCheckable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #81  <Method boolean AccessibilityNodeInfo.isCheckable()>
	//    3    7:ireturn         
	}

	public static boolean isChecked(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isChecked();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #84  <Method boolean AccessibilityNodeInfo.isChecked()>
	//    3    7:ireturn         
	}

	public static boolean isClickable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isClickable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #87  <Method boolean AccessibilityNodeInfo.isClickable()>
	//    3    7:ireturn         
	}

	public static boolean isEnabled(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isEnabled();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #90  <Method boolean AccessibilityNodeInfo.isEnabled()>
	//    3    7:ireturn         
	}

	public static boolean isFocusable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isFocusable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #93  <Method boolean AccessibilityNodeInfo.isFocusable()>
	//    3    7:ireturn         
	}

	public static boolean isFocused(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isFocused();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #96  <Method boolean AccessibilityNodeInfo.isFocused()>
	//    3    7:ireturn         
	}

	public static boolean isLongClickable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isLongClickable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #99  <Method boolean AccessibilityNodeInfo.isLongClickable()>
	//    3    7:ireturn         
	}

	public static boolean isPassword(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isPassword();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #102 <Method boolean AccessibilityNodeInfo.isPassword()>
	//    3    7:ireturn         
	}

	public static boolean isScrollable(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isScrollable();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #105 <Method boolean AccessibilityNodeInfo.isScrollable()>
	//    3    7:ireturn         
	}

	public static boolean isSelected(Object obj)
	{
		return ((AccessibilityNodeInfo)obj).isSelected();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #108 <Method boolean AccessibilityNodeInfo.isSelected()>
	//    3    7:ireturn         
	}

	public static Object obtain()
	{
		return ((Object) (AccessibilityNodeInfo.obtain()));
	//    0    0:invokestatic    #112 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain()>
	//    1    3:areturn         
	}

	public static Object obtain(View view)
	{
		return ((Object) (AccessibilityNodeInfo.obtain(view)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #116 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(View)>
	//    2    4:areturn         
	}

	public static Object obtain(Object obj)
	{
		return ((Object) (AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)obj)));
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokestatic    #119 <Method AccessibilityNodeInfo AccessibilityNodeInfo.obtain(AccessibilityNodeInfo)>
	//    3    7:areturn         
	}

	public static boolean performAction(Object obj, int i)
	{
		return ((AccessibilityNodeInfo)obj).performAction(i);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #124 <Method boolean AccessibilityNodeInfo.performAction(int)>
	//    4    8:ireturn         
	}

	public static void recycle(Object obj)
	{
		((AccessibilityNodeInfo)obj).recycle();
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:invokevirtual   #128 <Method void AccessibilityNodeInfo.recycle()>
	//    3    7:return          
	}

	public static void setBoundsInParent(Object obj, Rect rect)
	{
		((AccessibilityNodeInfo)obj).setBoundsInParent(rect);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #131 <Method void AccessibilityNodeInfo.setBoundsInParent(Rect)>
	//    4    8:return          
	}

	public static void setBoundsInScreen(Object obj, Rect rect)
	{
		((AccessibilityNodeInfo)obj).setBoundsInScreen(rect);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #134 <Method void AccessibilityNodeInfo.setBoundsInScreen(Rect)>
	//    4    8:return          
	}

	public static void setCheckable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setCheckable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #139 <Method void AccessibilityNodeInfo.setCheckable(boolean)>
	//    4    8:return          
	}

	public static void setChecked(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setChecked(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #142 <Method void AccessibilityNodeInfo.setChecked(boolean)>
	//    4    8:return          
	}

	public static void setClassName(Object obj, CharSequence charsequence)
	{
		((AccessibilityNodeInfo)obj).setClassName(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #147 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    4    8:return          
	}

	public static void setClickable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setClickable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #150 <Method void AccessibilityNodeInfo.setClickable(boolean)>
	//    4    8:return          
	}

	public static void setContentDescription(Object obj, CharSequence charsequence)
	{
		((AccessibilityNodeInfo)obj).setContentDescription(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #153 <Method void AccessibilityNodeInfo.setContentDescription(CharSequence)>
	//    4    8:return          
	}

	public static void setEnabled(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #156 <Method void AccessibilityNodeInfo.setEnabled(boolean)>
	//    4    8:return          
	}

	public static void setFocusable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setFocusable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #159 <Method void AccessibilityNodeInfo.setFocusable(boolean)>
	//    4    8:return          
	}

	public static void setFocused(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setFocused(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #162 <Method void AccessibilityNodeInfo.setFocused(boolean)>
	//    4    8:return          
	}

	public static void setLongClickable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setLongClickable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #165 <Method void AccessibilityNodeInfo.setLongClickable(boolean)>
	//    4    8:return          
	}

	public static void setPackageName(Object obj, CharSequence charsequence)
	{
		((AccessibilityNodeInfo)obj).setPackageName(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #168 <Method void AccessibilityNodeInfo.setPackageName(CharSequence)>
	//    4    8:return          
	}

	public static void setParent(Object obj, View view)
	{
		((AccessibilityNodeInfo)obj).setParent(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #171 <Method void AccessibilityNodeInfo.setParent(View)>
	//    4    8:return          
	}

	public static void setPassword(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setPassword(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #174 <Method void AccessibilityNodeInfo.setPassword(boolean)>
	//    4    8:return          
	}

	public static void setScrollable(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setScrollable(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #177 <Method void AccessibilityNodeInfo.setScrollable(boolean)>
	//    4    8:return          
	}

	public static void setSelected(Object obj, boolean flag)
	{
		((AccessibilityNodeInfo)obj).setSelected(flag);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #180 <Method void AccessibilityNodeInfo.setSelected(boolean)>
	//    4    8:return          
	}

	public static void setSource(Object obj, View view)
	{
		((AccessibilityNodeInfo)obj).setSource(view);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method void AccessibilityNodeInfo.setSource(View)>
	//    4    8:return          
	}

	public static void setText(Object obj, CharSequence charsequence)
	{
		((AccessibilityNodeInfo)obj).setText(charsequence);
	//    0    0:aload_0         
	//    1    1:checkcast       #16  <Class AccessibilityNodeInfo>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #186 <Method void AccessibilityNodeInfo.setText(CharSequence)>
	//    4    8:return          
	}
}
