// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.view.View;

// Referenced classes of package o:
//			au, ax, ba, bb, 
//			aw

public class av
{

	av()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static bb a(View view)
	{
		return c.a(view);
	//    0    0:getstatic       #21  <Field ba c>
	//    1    3:aload_0         
	//    2    4:invokeinterface #33  <Method bb ba.a(View)>
	//    3    9:areturn         
	}

	public static aw e(View view)
	{
		return c.d(view);
	//    0    0:getstatic       #21  <Field ba c>
	//    1    3:aload_0         
	//    2    4:invokeinterface #39  <Method aw ba.d(View)>
	//    3    9:areturn         
	}

	private static final ba c;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 18)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          18
	//*   2    5:icmplt          19
			c = ((ba) (new au()));
	//    3    8:new             #16  <Class au>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void au()>
	//    6   15:putstatic       #21  <Field ba c>
	//    7   18:return          
		else
			c = ((ba) (new ax()));
	//    8   19:new             #23  <Class ax>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void ax()>
	//   11   26:putstatic       #21  <Field ba c>
	//*  12   29:return          
	}
}
