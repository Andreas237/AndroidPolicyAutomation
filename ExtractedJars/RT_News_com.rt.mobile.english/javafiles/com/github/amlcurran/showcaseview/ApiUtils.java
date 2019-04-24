// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.view.View;

public class ApiUtils
{

	public ApiUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public boolean isCompatWith(int i)
	{
		return android.os.Build.VERSION.SDK_INT >= i;
	//    0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:iload_1         
	//    2    4:icmplt          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean isCompatWithHoneycomb()
	{
		return isCompatWith(11);
	//    0    0:aload_0         
	//    1    1:bipush          11
	//    2    3:invokevirtual   #21  <Method boolean isCompatWith(int)>
	//    3    6:ireturn         
	}

	public void setFitsSystemWindowsCompat(View view)
	{
		if(isCompatWith(14))
	//*   0    0:aload_0         
	//*   1    1:bipush          14
	//*   2    3:invokevirtual   #21  <Method boolean isCompatWith(int)>
	//*   3    6:ifeq            14
			view.setFitsSystemWindows(true);
	//    4    9:aload_1         
	//    5   10:iconst_1        
	//    6   11:invokevirtual   #32  <Method void View.setFitsSystemWindows(boolean)>
	//    7   14:return          
	}
}
