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
		if(mListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field ActionBar$OnNavigationListener mListener>
	//*   2    4:ifnull          20
			mListener.onNavigationItemSelected(i, l);
	//    3    7:aload_0         
	//    4    8:getfield        #15  <Field ActionBar$OnNavigationListener mListener>
	//    5   11:iload_3         
	//    6   12:lload           4
	//    7   14:invokeinterface #24  <Method boolean ActionBar$OnNavigationListener.onNavigationItemSelected(int, long)>
	//    8   19:pop             
	//    9   20:return          
	}

	public void onNothingSelected(AdapterView adapterview)
	{
	//    0    0:return          
	}

	private final ActionBar.OnNavigationListener mListener;
}
