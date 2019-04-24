// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view.accessibility;

import android.graphics.Rect;
import android.view.View;
import java.util.List;

// Referenced classes of package android.support.v4.view.accessibility:
//			AccessibilityNodeInfoCompat, AccessibilityNodeInfoCompatIcs

static class AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl extends 
{

	public void addAction(Object obj, int i)
	{
		AccessibilityNodeInfoCompatIcs.addAction(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #18  <Method void AccessibilityNodeInfoCompatIcs.addAction(Object, int)>
	//    3    5:return          
	}

	public void addChild(Object obj, View view)
	{
		AccessibilityNodeInfoCompatIcs.addChild(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #22  <Method void AccessibilityNodeInfoCompatIcs.addChild(Object, View)>
	//    3    5:return          
	}

	public List findAccessibilityNodeInfosByText(Object obj, String s)
	{
		return AccessibilityNodeInfoCompatIcs.findAccessibilityNodeInfosByText(obj, s);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #26  <Method List AccessibilityNodeInfoCompatIcs.findAccessibilityNodeInfosByText(Object, String)>
	//    3    5:areturn         
	}

	public int getActions(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getActions(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #32  <Method int AccessibilityNodeInfoCompatIcs.getActions(Object)>
	//    2    4:ireturn         
	}

	public void getBoundsInParent(Object obj, Rect rect)
	{
		AccessibilityNodeInfoCompatIcs.getBoundsInParent(obj, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #36  <Method void AccessibilityNodeInfoCompatIcs.getBoundsInParent(Object, Rect)>
	//    3    5:return          
	}

	public void getBoundsInScreen(Object obj, Rect rect)
	{
		AccessibilityNodeInfoCompatIcs.getBoundsInScreen(obj, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #39  <Method void AccessibilityNodeInfoCompatIcs.getBoundsInScreen(Object, Rect)>
	//    3    5:return          
	}

	public Object getChild(Object obj, int i)
	{
		return AccessibilityNodeInfoCompatIcs.getChild(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #43  <Method Object AccessibilityNodeInfoCompatIcs.getChild(Object, int)>
	//    3    5:areturn         
	}

	public int getChildCount(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getChildCount(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #46  <Method int AccessibilityNodeInfoCompatIcs.getChildCount(Object)>
	//    2    4:ireturn         
	}

	public CharSequence getClassName(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getClassName(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #50  <Method CharSequence AccessibilityNodeInfoCompatIcs.getClassName(Object)>
	//    2    4:areturn         
	}

	public CharSequence getContentDescription(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getContentDescription(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method CharSequence AccessibilityNodeInfoCompatIcs.getContentDescription(Object)>
	//    2    4:areturn         
	}

	public CharSequence getPackageName(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getPackageName(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #56  <Method CharSequence AccessibilityNodeInfoCompatIcs.getPackageName(Object)>
	//    2    4:areturn         
	}

	public Object getParent(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getParent(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method Object AccessibilityNodeInfoCompatIcs.getParent(Object)>
	//    2    4:areturn         
	}

	public CharSequence getText(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getText(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #63  <Method CharSequence AccessibilityNodeInfoCompatIcs.getText(Object)>
	//    2    4:areturn         
	}

	public int getWindowId(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.getWindowId(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #66  <Method int AccessibilityNodeInfoCompatIcs.getWindowId(Object)>
	//    2    4:ireturn         
	}

	public boolean isCheckable(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isCheckable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #70  <Method boolean AccessibilityNodeInfoCompatIcs.isCheckable(Object)>
	//    2    4:ireturn         
	}

	public boolean isChecked(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isChecked(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #73  <Method boolean AccessibilityNodeInfoCompatIcs.isChecked(Object)>
	//    2    4:ireturn         
	}

	public boolean isClickable(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isClickable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #76  <Method boolean AccessibilityNodeInfoCompatIcs.isClickable(Object)>
	//    2    4:ireturn         
	}

	public boolean isEnabled(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isEnabled(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #79  <Method boolean AccessibilityNodeInfoCompatIcs.isEnabled(Object)>
	//    2    4:ireturn         
	}

	public boolean isFocusable(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isFocusable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #82  <Method boolean AccessibilityNodeInfoCompatIcs.isFocusable(Object)>
	//    2    4:ireturn         
	}

	public boolean isFocused(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isFocused(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #85  <Method boolean AccessibilityNodeInfoCompatIcs.isFocused(Object)>
	//    2    4:ireturn         
	}

	public boolean isLongClickable(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isLongClickable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method boolean AccessibilityNodeInfoCompatIcs.isLongClickable(Object)>
	//    2    4:ireturn         
	}

	public boolean isPassword(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isPassword(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #91  <Method boolean AccessibilityNodeInfoCompatIcs.isPassword(Object)>
	//    2    4:ireturn         
	}

	public boolean isScrollable(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isScrollable(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #94  <Method boolean AccessibilityNodeInfoCompatIcs.isScrollable(Object)>
	//    2    4:ireturn         
	}

	public boolean isSelected(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.isSelected(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #97  <Method boolean AccessibilityNodeInfoCompatIcs.isSelected(Object)>
	//    2    4:ireturn         
	}

	public Object obtain()
	{
		return AccessibilityNodeInfoCompatIcs.obtain();
	//    0    0:invokestatic    #101 <Method Object AccessibilityNodeInfoCompatIcs.obtain()>
	//    1    3:areturn         
	}

	public Object obtain(View view)
	{
		return AccessibilityNodeInfoCompatIcs.obtain(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #104 <Method Object AccessibilityNodeInfoCompatIcs.obtain(View)>
	//    2    4:areturn         
	}

	public Object obtain(Object obj)
	{
		return AccessibilityNodeInfoCompatIcs.obtain(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #106 <Method Object AccessibilityNodeInfoCompatIcs.obtain(Object)>
	//    2    4:areturn         
	}

	public boolean performAction(Object obj, int i)
	{
		return AccessibilityNodeInfoCompatIcs.performAction(obj, i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #110 <Method boolean AccessibilityNodeInfoCompatIcs.performAction(Object, int)>
	//    3    5:ireturn         
	}

	public void recycle(Object obj)
	{
		AccessibilityNodeInfoCompatIcs.recycle(obj);
	//    0    0:aload_1         
	//    1    1:invokestatic    #114 <Method void AccessibilityNodeInfoCompatIcs.recycle(Object)>
	//    2    4:return          
	}

	public void setBoundsInParent(Object obj, Rect rect)
	{
		AccessibilityNodeInfoCompatIcs.setBoundsInParent(obj, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #117 <Method void AccessibilityNodeInfoCompatIcs.setBoundsInParent(Object, Rect)>
	//    3    5:return          
	}

	public void setBoundsInScreen(Object obj, Rect rect)
	{
		AccessibilityNodeInfoCompatIcs.setBoundsInScreen(obj, rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #120 <Method void AccessibilityNodeInfoCompatIcs.setBoundsInScreen(Object, Rect)>
	//    3    5:return          
	}

	public void setCheckable(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setCheckable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #124 <Method void AccessibilityNodeInfoCompatIcs.setCheckable(Object, boolean)>
	//    3    5:return          
	}

	public void setChecked(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setChecked(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #127 <Method void AccessibilityNodeInfoCompatIcs.setChecked(Object, boolean)>
	//    3    5:return          
	}

	public void setClassName(Object obj, CharSequence charsequence)
	{
		AccessibilityNodeInfoCompatIcs.setClassName(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #131 <Method void AccessibilityNodeInfoCompatIcs.setClassName(Object, CharSequence)>
	//    3    5:return          
	}

	public void setClickable(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setClickable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #134 <Method void AccessibilityNodeInfoCompatIcs.setClickable(Object, boolean)>
	//    3    5:return          
	}

	public void setContentDescription(Object obj, CharSequence charsequence)
	{
		AccessibilityNodeInfoCompatIcs.setContentDescription(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #137 <Method void AccessibilityNodeInfoCompatIcs.setContentDescription(Object, CharSequence)>
	//    3    5:return          
	}

	public void setEnabled(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setEnabled(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #140 <Method void AccessibilityNodeInfoCompatIcs.setEnabled(Object, boolean)>
	//    3    5:return          
	}

	public void setFocusable(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setFocusable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #143 <Method void AccessibilityNodeInfoCompatIcs.setFocusable(Object, boolean)>
	//    3    5:return          
	}

	public void setFocused(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setFocused(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #146 <Method void AccessibilityNodeInfoCompatIcs.setFocused(Object, boolean)>
	//    3    5:return          
	}

	public void setLongClickable(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setLongClickable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #149 <Method void AccessibilityNodeInfoCompatIcs.setLongClickable(Object, boolean)>
	//    3    5:return          
	}

	public void setPackageName(Object obj, CharSequence charsequence)
	{
		AccessibilityNodeInfoCompatIcs.setPackageName(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #152 <Method void AccessibilityNodeInfoCompatIcs.setPackageName(Object, CharSequence)>
	//    3    5:return          
	}

	public void setParent(Object obj, View view)
	{
		AccessibilityNodeInfoCompatIcs.setParent(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #155 <Method void AccessibilityNodeInfoCompatIcs.setParent(Object, View)>
	//    3    5:return          
	}

	public void setPassword(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setPassword(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #158 <Method void AccessibilityNodeInfoCompatIcs.setPassword(Object, boolean)>
	//    3    5:return          
	}

	public void setScrollable(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setScrollable(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #161 <Method void AccessibilityNodeInfoCompatIcs.setScrollable(Object, boolean)>
	//    3    5:return          
	}

	public void setSelected(Object obj, boolean flag)
	{
		AccessibilityNodeInfoCompatIcs.setSelected(obj, flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokestatic    #164 <Method void AccessibilityNodeInfoCompatIcs.setSelected(Object, boolean)>
	//    3    5:return          
	}

	public void setSource(Object obj, View view)
	{
		AccessibilityNodeInfoCompatIcs.setSource(obj, view);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #167 <Method void AccessibilityNodeInfoCompatIcs.setSource(Object, View)>
	//    3    5:return          
	}

	public void setText(Object obj, CharSequence charsequence)
	{
		AccessibilityNodeInfoCompatIcs.setText(obj, charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #170 <Method void AccessibilityNodeInfoCompatIcs.setText(Object, CharSequence)>
	//    3    5:return          
	}

	AccessibilityNodeInfoCompat$AccessibilityNodeInfoIcsImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AccessibilityNodeInfoCompat$AccessibilityNodeInfoStubImpl()>
	//    2    4:return          
	}
}
