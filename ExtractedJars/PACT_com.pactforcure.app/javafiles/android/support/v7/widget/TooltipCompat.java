// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			TooltipCompatHandler

public class TooltipCompat
{
	private static class Api26ViewCompatImpl
		implements ViewCompatImpl
	{

		public void setTooltipText(View view, CharSequence charsequence)
		{
			view.setTooltipText(charsequence);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #28  <Method void View.setTooltipText(CharSequence)>
		//    3    5:return          
		}

		private Api26ViewCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
		//    2    4:return          
		}

	}

	private static class BaseViewCompatImpl
		implements ViewCompatImpl
	{

		public void setTooltipText(View view, CharSequence charsequence)
		{
			TooltipCompatHandler.setTooltipText(view, charsequence);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokestatic    #24  <Method void TooltipCompatHandler.setTooltipText(View, CharSequence)>
		//    3    5:return          
		}

		private BaseViewCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}

	}

	private static interface ViewCompatImpl
	{

		public abstract void setTooltipText(View view, CharSequence charsequence);
	}


	private TooltipCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
	//    2    4:return          
	}

	public static void setTooltipText(View view, CharSequence charsequence)
	{
		IMPL.setTooltipText(view, charsequence);
	//    0    0:getstatic       #31  <Field TooltipCompat$ViewCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #41  <Method void TooltipCompat$ViewCompatImpl.setTooltipText(View, CharSequence)>
	//    4   10:return          
	}

	private static final ViewCompatImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          20
			IMPL = ((ViewCompatImpl) (new Api26ViewCompatImpl()));
	//    3    8:new             #8   <Class TooltipCompat$Api26ViewCompatImpl>
	//    4   11:dup             
	//    5   12:aconst_null     
	//    6   13:invokespecial   #29  <Method void TooltipCompat$Api26ViewCompatImpl(TooltipCompat$1)>
	//    7   16:putstatic       #31  <Field TooltipCompat$ViewCompatImpl IMPL>
	//    8   19:return          
		else
			IMPL = ((ViewCompatImpl) (new BaseViewCompatImpl()));
	//    9   20:new             #11  <Class TooltipCompat$BaseViewCompatImpl>
	//   10   23:dup             
	//   11   24:aconst_null     
	//   12   25:invokespecial   #32  <Method void TooltipCompat$BaseViewCompatImpl(TooltipCompat$1)>
	//   13   28:putstatic       #31  <Field TooltipCompat$ViewCompatImpl IMPL>
	//*  14   31:return          
	}
}
