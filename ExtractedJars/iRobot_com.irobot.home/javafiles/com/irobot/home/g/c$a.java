// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.g;

import android.os.Bundle;
import org.androidannotations.api.a.c;

// Referenced classes of package com.irobot.home.g:
//			c, b

public static class c$a extends c
{

	public b a()
	{
		com.irobot.home.g.c c1 = new com.irobot.home.g.c();
	//    0    0:new             #7   <Class com.irobot.home.g.c>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void com.irobot.home.g.c()>
	//    3    7:astore_1        
		c1.setArguments(a);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field Bundle a>
	//    7   13:invokevirtual   #22  <Method void c.setArguments(Bundle)>
		return ((b) (c1));
	//    8   16:aload_1         
	//    9   17:areturn         
	}

	public c$a a(int i)
	{
		a.putInt("icon", i);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #25  <String "icon">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #31  <Method void Bundle.putInt(String, int)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public c$a a(String s)
	{
		a.putString("message", s);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #34  <String "message">
	//    3    6:aload_1         
	//    4    7:invokevirtual   #38  <Method void Bundle.putString(String, String)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public c$a a(boolean flag)
	{
		a.putBoolean("isNumberIcon", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #41  <String "isNumberIcon">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public c$a b(boolean flag)
	{
		a.putBoolean("autoDismiss", flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Bundle a>
	//    2    4:ldc1            #48  <String "autoDismiss">
	//    3    6:iload_1         
	//    4    7:invokevirtual   #45  <Method void Bundle.putBoolean(String, boolean)>
		return this;
	//    5   10:aload_0         
	//    6   11:areturn         
	}

	public c$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void c()>
	//    2    4:return          
	}
}
