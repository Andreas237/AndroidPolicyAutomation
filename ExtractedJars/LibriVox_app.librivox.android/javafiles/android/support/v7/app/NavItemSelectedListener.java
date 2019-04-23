// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.view.View;
import android.widget.AdapterView;

class NavItemSelectedListener
	implements android.widget.AdapterView.OnItemSelectedListener
{

	public NavItemSelectedListener(ActionBar.OnNavigationListener onnavigationlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		mListener = onnavigationlistener;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field ActionBar$OnNavigationListener mListener>
	//    5    9:return          
	}

	public void onItemSelected(AdapterView adapterview, View view, int i, long l)
	{
		adapterview = ((AdapterView) (mListener));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ActionBar$OnNavigationListener mListener>
	//    2    4:astore_1        
		if(adapterview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
			((ActionBar.OnNavigationListener) (adapterview)).onNavigationItemSelected(i, l);
	//    5    9:aload_1         
	//    6   10:iload_3         
	//    7   11:lload           4
	//    8   13:invokeinterface #24  <Method boolean ActionBar$OnNavigationListener.onNavigationItemSelected(int, long)>
	//    9   18:pop             
	//   10   19:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	private final ActionBar.OnNavigationListener mListener;
}
