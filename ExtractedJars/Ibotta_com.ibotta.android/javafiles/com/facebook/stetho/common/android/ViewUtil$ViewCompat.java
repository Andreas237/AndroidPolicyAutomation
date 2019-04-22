// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.view.View;

// Referenced classes of package com.facebook.stetho.common.android:
//			ViewUtil

private static class ViewUtil$ViewCompat
{
	private static class ViewCompatHoneycomb extends ViewUtil.ViewCompat
	{

		public float getAlpha(View view)
		{
			return view.getAlpha();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #25  <Method float View.getAlpha()>
		//    2    4:freturn         
		}

		private ViewCompatHoneycomb()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void ViewUtil$ViewCompat()>
		//    2    4:return          
		}

		ViewCompatHoneycomb(ViewUtil._cls1 _pcls1)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void ViewUtil$ViewCompat$ViewCompatHoneycomb()>
		//    2    4:return          
		}
	}


	public static ViewUtil$ViewCompat getInstance()
	{
		return sInstance;
	//    0    0:getstatic       #26  <Field ViewUtil$ViewCompat sInstance>
	//    1    3:areturn         
	}

	public float getAlpha(View view)
	{
		return 1.0F;
	//    0    0:fconst_1        
	//    1    1:freturn         
	}

	private static final ViewUtil$ViewCompat sInstance;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #20  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          20
			sInstance = ((ViewUtil$ViewCompat) (new ViewCompatHoneycomb(((ViewUtil._cls1) (null)))));
	//    3    8:new             #9   <Class ViewUtil$ViewCompat$ViewCompatHoneycomb>
	//    4   11:dup             
	//    5   12:aconst_null     
	//    6   13:invokespecial   #24  <Method void ViewUtil$ViewCompat$ViewCompatHoneycomb(ViewUtil$1)>
	//    7   16:putstatic       #26  <Field ViewUtil$ViewCompat sInstance>
	//    8   19:return          
		else
			sInstance = new ViewUtil$ViewCompat();
	//    9   20:new             #2   <Class ViewUtil$ViewCompat>
	//   10   23:dup             
	//   11   24:invokespecial   #28  <Method void ViewUtil$ViewCompat()>
	//   12   27:putstatic       #26  <Field ViewUtil$ViewCompat sInstance>
	//*  13   30:return          
	}

	protected ViewUtil$ViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
	//    2    4:return          
	}
}
