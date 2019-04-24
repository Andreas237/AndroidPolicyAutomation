// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.graphics.Bitmap;

// Referenced classes of package com.irobot.home:
//			AboutAppTableViewActivity_

class AboutAppTableViewActivity_$2
	implements Runnable
{

	public void run()
	{
		AboutAppTableViewActivity_.a(d, a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field AboutAppTableViewActivity_ d>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field Bitmap a>
	//    4    8:aload_0         
	//    5    9:getfield        #25  <Field String b>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field String c>
	//    8   16:invokestatic    #34  <Method void AboutAppTableViewActivity_.a(AboutAppTableViewActivity_, Bitmap, String, String)>
	//    9   19:return          
	}

	final Bitmap a;
	final String b;
	final String c;
	final AboutAppTableViewActivity_ d;

	AboutAppTableViewActivity_$2(AboutAppTableViewActivity_ aboutapptableviewactivity_, Bitmap bitmap, String s, String s1)
	{
		d = aboutapptableviewactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field AboutAppTableViewActivity_ d>
		a = bitmap;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Bitmap a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String b>
		c = s1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field String c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
