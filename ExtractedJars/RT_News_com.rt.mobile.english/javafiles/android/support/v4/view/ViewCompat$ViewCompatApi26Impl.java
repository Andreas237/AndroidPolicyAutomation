// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import java.util.Collection;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

static class ViewCompat$ViewCompatApi26Impl extends ViewCompat$ViewCompatApi24Impl
{

	public void addKeyboardNavigationClusters(View view, Collection collection, int i)
	{
		view.addKeyboardNavigationClusters(collection, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #23  <Method void View.addKeyboardNavigationClusters(Collection, int)>
	//    4    6:return          
	}

	public int getImportantForAutofill(View view)
	{
		return view.getImportantForAutofill();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method int View.getImportantForAutofill()>
	//    2    4:ireturn         
	}

	public int getNextClusterForwardId(View view)
	{
		return view.getNextClusterForwardId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #34  <Method int View.getNextClusterForwardId()>
	//    2    4:ireturn         
	}

	public boolean hasExplicitFocusable(View view)
	{
		return view.hasExplicitFocusable();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method boolean View.hasExplicitFocusable()>
	//    2    4:ireturn         
	}

	public boolean isFocusedByDefault(View view)
	{
		return view.isFocusedByDefault();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method boolean View.isFocusedByDefault()>
	//    2    4:ireturn         
	}

	public boolean isImportantForAutofill(View view)
	{
		return view.isImportantForAutofill();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #45  <Method boolean View.isImportantForAutofill()>
	//    2    4:ireturn         
	}

	public boolean isKeyboardNavigationCluster(View view)
	{
		return view.isKeyboardNavigationCluster();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method boolean View.isKeyboardNavigationCluster()>
	//    2    4:ireturn         
	}

	public View keyboardNavigationClusterSearch(View view, View view1, int i)
	{
		return view.keyboardNavigationClusterSearch(view1, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokevirtual   #53  <Method View View.keyboardNavigationClusterSearch(View, int)>
	//    4    6:areturn         
	}

	public boolean restoreDefaultFocus(View view)
	{
		return view.restoreDefaultFocus();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #56  <Method boolean View.restoreDefaultFocus()>
	//    2    4:ireturn         
	}

	public transient void setAutofillHints(View view, String as[])
	{
		view.setAutofillHints(as);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #62  <Method void View.setAutofillHints(String[])>
	//    3    5:return          
	}

	public void setFocusedByDefault(View view, boolean flag)
	{
		view.setFocusedByDefault(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #67  <Method void View.setFocusedByDefault(boolean)>
	//    3    5:return          
	}

	public void setImportantForAutofill(View view, int i)
	{
		view.setImportantForAutofill(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #72  <Method void View.setImportantForAutofill(int)>
	//    3    5:return          
	}

	public void setKeyboardNavigationCluster(View view, boolean flag)
	{
		view.setKeyboardNavigationCluster(flag);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #75  <Method void View.setKeyboardNavigationCluster(boolean)>
	//    3    5:return          
	}

	public void setNextClusterForwardId(View view, int i)
	{
		view.setNextClusterForwardId(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #78  <Method void View.setNextClusterForwardId(int)>
	//    3    5:return          
	}

	public void setTooltipText(View view, CharSequence charsequence)
	{
		view.setTooltipText(charsequence);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #83  <Method void View.setTooltipText(CharSequence)>
	//    3    5:return          
	}

	ViewCompat$ViewCompatApi26Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewCompat$ViewCompatApi24Impl()>
	//    2    4:return          
	}
}
