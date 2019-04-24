// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			ListPopupWindowCompatKitKat

public final class ListPopupWindowCompat
{
	static class BaseListPopupWindowImpl
		implements ListPopupWindowImpl
	{

		public android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		BaseListPopupWindowImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class KitKatListPopupWindowImpl extends BaseListPopupWindowImpl
	{

		public android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
		{
			return ListPopupWindowCompatKitKat.createDragToOpenListener(obj, view);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #18  <Method android.view.View$OnTouchListener ListPopupWindowCompatKitKat.createDragToOpenListener(Object, View)>
		//    3    5:areturn         
		}

		KitKatListPopupWindowImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void ListPopupWindowCompat$BaseListPopupWindowImpl()>
		//    2    4:return          
		}
	}

	static interface ListPopupWindowImpl
	{

		public abstract android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view);
	}


	private ListPopupWindowCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static android.view.View.OnTouchListener createDragToOpenListener(Object obj, View view)
	{
		return IMPL.createDragToOpenListener(obj, view);
	//    0    0:getstatic       #28  <Field ListPopupWindowCompat$ListPopupWindowImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #35  <Method android.view.View$OnTouchListener ListPopupWindowCompat$ListPopupWindowImpl.createDragToOpenListener(Object, View)>
	//    4   10:areturn         
	}

	static final ListPopupWindowImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((ListPopupWindowImpl) (new KitKatListPopupWindowImpl()));
	//    3    8:new             #9   <Class ListPopupWindowCompat$KitKatListPopupWindowImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #26  <Method void ListPopupWindowCompat$KitKatListPopupWindowImpl()>
	//    6   15:putstatic       #28  <Field ListPopupWindowCompat$ListPopupWindowImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((ListPopupWindowImpl) (new BaseListPopupWindowImpl()));
	//    8   19:new             #6   <Class ListPopupWindowCompat$BaseListPopupWindowImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #29  <Method void ListPopupWindowCompat$BaseListPopupWindowImpl()>
	//   11   26:putstatic       #28  <Field ListPopupWindowCompat$ListPopupWindowImpl IMPL>
	//*  12   29:return          
	}
}
