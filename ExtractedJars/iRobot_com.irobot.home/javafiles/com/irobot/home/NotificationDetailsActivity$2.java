// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;

// Referenced classes of package com.irobot.home:
//			NotificationDetailsActivity, CustomVideoWebViewActivity_

class NotificationDetailsActivity$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		CustomVideoWebViewActivity_.a(((android.content.Context) (b))).a(a).a(true).b(b.g).b(b.h).c(b.i).a();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field NotificationDetailsActivity b>
	//    2    4:invokestatic    #32  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_.a(android.content.Context)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field String a>
	//    5   11:invokevirtual   #37  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.a(String)>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #40  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.a(boolean)>
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field NotificationDetailsActivity b>
	//   10   22:getfield        #43  <Field String NotificationDetailsActivity.g>
	//   11   25:invokevirtual   #45  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.b(String)>
	//   12   28:aload_0         
	//   13   29:getfield        #19  <Field NotificationDetailsActivity b>
	//   14   32:getfield        #49  <Field int NotificationDetailsActivity.h>
	//   15   35:invokevirtual   #52  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.b(int)>
	//   16   38:aload_0         
	//   17   39:getfield        #19  <Field NotificationDetailsActivity b>
	//   18   42:getfield        #54  <Field int NotificationDetailsActivity.i>
	//   19   45:invokevirtual   #57  <Method CustomVideoWebViewActivity_$a CustomVideoWebViewActivity_$a.c(int)>
	//   20   48:invokevirtual   #60  <Method org.androidannotations.api.a.e CustomVideoWebViewActivity_$a.a()>
	//   21   51:pop             
	//   22   52:return          
	}

	final String a;
	final NotificationDetailsActivity b;

	NotificationDetailsActivity$2(NotificationDetailsActivity notificationdetailsactivity, String s)
	{
		b = notificationdetailsactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field NotificationDetailsActivity b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
