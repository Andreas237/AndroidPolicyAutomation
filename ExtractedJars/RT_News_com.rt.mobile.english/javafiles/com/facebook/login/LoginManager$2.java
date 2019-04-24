// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import java.util.HashSet;

// Referenced classes of package com.facebook.login:
//			LoginManager

static final class LoginManager$2 extends HashSet
{

	LoginManager$2()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void HashSet()>
		add("ads_management");
	//    2    4:aload_0         
	//    3    5:ldc1            #16  <String "ads_management">
	//    4    7:invokevirtual   #20  <Method boolean add(Object)>
	//    5   10:pop             
		add("create_event");
	//    6   11:aload_0         
	//    7   12:ldc1            #22  <String "create_event">
	//    8   14:invokevirtual   #20  <Method boolean add(Object)>
	//    9   17:pop             
		add("rsvp_event");
	//   10   18:aload_0         
	//   11   19:ldc1            #24  <String "rsvp_event">
	//   12   21:invokevirtual   #20  <Method boolean add(Object)>
	//   13   24:pop             
	//   14   25:return          
	}
}
