// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import com.baidu.android.pushservice.a.b;
import com.baidu.android.pushservice.e.a;

// Referenced classes of package com.baidu.android.pushservice:
//			PushService, a

class PushService$2 extends com.baidu.android.pushservice.a.a.a
{

	public int a(String s, int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String a()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String a(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public String a(String s, int i, boolean flag, int j, int k)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(String s, String s1, b b1)
	{
		b1.b(30602, com.baidu.android.pushservice.PushService.a(a, s, ((String) (null))));
	//    0    0:aload_3         
	//    1    1:sipush          30602
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field PushService a>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
	//    7   13:invokeinterface #30  <Method void b.b(int, String)>
	//    8   18:return          
	}

	public void a(String s, String s1, boolean flag, b b1)
	{
		b1.a(30602, com.baidu.android.pushservice.PushService.a(a, s, ((String) (null))));
	//    0    0:aload           4
	//    1    2:sipush          30602
	//    2    5:aload_0         
	//    3    6:getfield        #12  <Field PushService a>
	//    4    9:aload_1         
	//    5   10:aconst_null     
	//    6   11:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
	//    7   14:invokeinterface #33  <Method void b.a(int, String)>
	//    8   19:return          
	}

	public void a(String s, String s1, boolean flag, String s2, b b1)
	{
		b1.a(30602, com.baidu.android.pushservice.PushService.a(a, s, s));
	//    0    0:aload           5
	//    1    2:sipush          30602
	//    2    5:aload_0         
	//    3    6:getfield        #12  <Field PushService a>
	//    4    9:aload_1         
	//    5   10:aload_1         
	//    6   11:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
	//    7   14:invokeinterface #33  <Method void b.a(int, String)>
	//    8   19:return          
	}

	public boolean a(String s, String s1)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean a(String s, String s1, int i)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean a(String s, String s1, String s2, String s3)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean a(String s, boolean flag)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int b(String s)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int b(String s, int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void b(String s, String s1, b b1)
	{
		b1.c(30602, com.baidu.android.pushservice.PushService.a(a, s, ((String) (null))));
	//    0    0:aload_3         
	//    1    1:sipush          30602
	//    2    4:aload_0         
	//    3    5:getfield        #12  <Field PushService a>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokestatic    #24  <Method String com.baidu.android.pushservice.PushService.a(PushService, String, String)>
	//    7   13:invokeinterface #42  <Method void b.c(int, String)>
	//    8   18:return          
	}

	public boolean b(String s, String s1)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public int c()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #45  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #46  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("getPushVersion ");
	//    4    8:aload_1         
	//    5    9:ldc1            #48  <String "getPushVersion ">
	//    6   11:invokevirtual   #52  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((int) (com.baidu.android.pushservice.a.a())));
	//    8   15:aload_1         
	//    9   16:invokestatic    #57  <Method short com.baidu.android.pushservice.a.a()>
	//   10   19:invokevirtual   #60  <Method StringBuilder StringBuilder.append(int)>
	//   11   22:pop             
		com.baidu.android.pushservice.e.a.c("PushService", stringbuilder.toString());
	//   12   23:ldc1            #62  <String "PushService">
	//   13   25:aload_1         
	//   14   26:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   15   29:invokestatic    #70  <Method void a.c(String, String)>
		return ((int) (com.baidu.android.pushservice.a.a()));
	//   16   32:invokestatic    #57  <Method short com.baidu.android.pushservice.a.a()>
	//   17   35:ireturn         
	}

	public int c(String s)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int c(String s, int i)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int d(String s)
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean e(String s)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String f(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	final PushService a;

	PushService$2(PushService pushservice)
	{
		a = pushservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field PushService a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void com.baidu.android.pushservice.a.a$a()>
	//    5    9:return          
	}
}
