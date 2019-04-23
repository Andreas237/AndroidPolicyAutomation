// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			FragmentTabHost

static class FragmentTabHost$DummyTabFactory
	implements android.widget.TabHost.TabContentFactory
{

	public View createTabContent(String s)
	{
		s = ((String) (new View(mContext)));
	//    0    0:new             #23  <Class View>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field Context mContext>
	//    4    8:invokespecial   #25  <Method void View(Context)>
	//    5   11:astore_1        
		((View) (s)).setMinimumWidth(0);
	//    6   12:aload_1         
	//    7   13:iconst_0        
	//    8   14:invokevirtual   #29  <Method void View.setMinimumWidth(int)>
		((View) (s)).setMinimumHeight(0);
	//    9   17:aload_1         
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #32  <Method void View.setMinimumHeight(int)>
		return ((View) (s));
	//   12   22:aload_1         
	//   13   23:areturn         
	}

	private final Context mContext;

	public FragmentTabHost$DummyTabFactory(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Context mContext>
	//    5    9:return          
	}
}
