// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.TabHost;

public class TabHostBindingAdapter
{

	public TabHostBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public static int getCurrentTab(TabHost tabhost)
	{
		return tabhost.getCurrentTab();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #21  <Method int TabHost.getCurrentTab()>
	//    2    4:ireturn         
	}

	public static String getCurrentTabTag(TabHost tabhost)
	{
		return tabhost.getCurrentTabTag();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #27  <Method String TabHost.getCurrentTabTag()>
	//    2    4:areturn         
	}

	public static void setCurrentTab(TabHost tabhost, int i)
	{
		if(tabhost.getCurrentTab() != i)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method int TabHost.getCurrentTab()>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          13
			tabhost.setCurrentTab(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #34  <Method void TabHost.setCurrentTab(int)>
	//    7   13:return          
	}

	public static void setCurrentTabTag(TabHost tabhost, String s)
	{
		if(tabhost.getCurrentTabTag() != s)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #27  <Method String TabHost.getCurrentTabTag()>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       13
			tabhost.setCurrentTabByTag(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #40  <Method void TabHost.setCurrentTabByTag(String)>
	//    7   13:return          
	}

	public static void setListeners(TabHost tabhost, android.widget.TabHost.OnTabChangeListener ontabchangelistener, InverseBindingListener inversebindinglistener)
	{
		if(inversebindinglistener == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			tabhost.setOnTabChangedListener(ontabchangelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #50  <Method void TabHost.setOnTabChangedListener(android.widget.TabHost$OnTabChangeListener)>
			return;
	//    5    9:return          
		} else
		{
			tabhost.setOnTabChangedListener(new android.widget.TabHost.OnTabChangeListener(ontabchangelistener, inversebindinglistener) {

				public void onTabChanged(String s)
				{
					if(listener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field android.widget.TabHost$OnTabChangeListener val$listener>
				//*   2    4:ifnull          17
						listener.onTabChanged(s);
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field android.widget.TabHost$OnTabChangeListener val$listener>
				//    5   11:aload_1         
				//    6   12:invokeinterface #29  <Method void android.widget.TabHost$OnTabChangeListener.onTabChanged(String)>
					attrChange.onChange();
				//    7   17:aload_0         
				//    8   18:getfield        #21  <Field InverseBindingListener val$attrChange>
				//    9   21:invokeinterface #34  <Method void InverseBindingListener.onChange()>
				//   10   26:return          
				}

				final InverseBindingListener val$attrChange;
				final android.widget.TabHost.OnTabChangeListener val$listener;

			
			{
				listener = ontabchangelistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field android.widget.TabHost$OnTabChangeListener val$listener>
				attrChange = inversebindinglistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field InverseBindingListener val$attrChange>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:aload_0         
	//    7   11:new             #6   <Class TabHostBindingAdapter$1>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #53  <Method void TabHostBindingAdapter$1(android.widget.TabHost$OnTabChangeListener, InverseBindingListener)>
	//   12   20:invokevirtual   #50  <Method void TabHost.setOnTabChangedListener(android.widget.TabHost$OnTabChangeListener)>
			return;
	//   13   23:return          
		}
	}
}
