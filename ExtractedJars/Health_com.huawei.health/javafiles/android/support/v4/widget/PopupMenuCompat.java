// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//			PopupMenuCompatKitKat

public final class PopupMenuCompat
{
	static class BasePopupMenuImpl
		implements PopupMenuImpl
	{

		public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		BasePopupMenuImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static class KitKatPopupMenuImpl extends BasePopupMenuImpl
	{

		public android.view.View.OnTouchListener getDragToOpenListener(Object obj)
		{
			return PopupMenuCompatKitKat.getDragToOpenListener(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #18  <Method android.view.View$OnTouchListener PopupMenuCompatKitKat.getDragToOpenListener(Object)>
		//    2    4:areturn         
		}

		KitKatPopupMenuImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void PopupMenuCompat$BasePopupMenuImpl()>
		//    2    4:return          
		}
	}

	static interface PopupMenuImpl
	{

		public abstract android.view.View.OnTouchListener getDragToOpenListener(Object obj);
	}


	private PopupMenuCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static android.view.View.OnTouchListener getDragToOpenListener(Object obj)
	{
		return IMPL.getDragToOpenListener(obj);
	//    0    0:getstatic       #28  <Field PopupMenuCompat$PopupMenuImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #35  <Method android.view.View$OnTouchListener PopupMenuCompat$PopupMenuImpl.getDragToOpenListener(Object)>
	//    3    9:areturn         
	}

	static final PopupMenuImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #23  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          19
			IMPL = ((PopupMenuImpl) (new KitKatPopupMenuImpl()));
	//    3    8:new             #9   <Class PopupMenuCompat$KitKatPopupMenuImpl>
	//    4   11:dup             
	//    5   12:invokespecial   #26  <Method void PopupMenuCompat$KitKatPopupMenuImpl()>
	//    6   15:putstatic       #28  <Field PopupMenuCompat$PopupMenuImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((PopupMenuImpl) (new BasePopupMenuImpl()));
	//    8   19:new             #6   <Class PopupMenuCompat$BasePopupMenuImpl>
	//    9   22:dup             
	//   10   23:invokespecial   #29  <Method void PopupMenuCompat$BasePopupMenuImpl()>
	//   11   26:putstatic       #28  <Field PopupMenuCompat$PopupMenuImpl IMPL>
	//*  12   29:return          
	}
}
