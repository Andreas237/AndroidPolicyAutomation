// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity, i

class DeveloperActivity$7
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int j)
	{
		a.a(b, true, ((android.os.Parcelable) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field i a>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field String b>
	//    4    8:iconst_1        
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #35  <Method void i.a(String, boolean, android.os.Parcelable)>
	//    7   13:return          
	}

	final i a;
	final String b;
	final DeveloperActivity c;

	DeveloperActivity$7(DeveloperActivity developeractivity, i j, String s)
	{
		c = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field DeveloperActivity c>
		a = j;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field i a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
