// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.java_websocket.e;


// Referenced classes of package com.mixpanel.android.java_websocket.e:
//			g, b

public class d extends g
	implements b
{

	public d()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void g()>
		a = "*";
	//    2    4:aload_0         
	//    3    5:ldc1            #14  <String "*">
	//    4    7:putfield        #16  <Field String a>
	//    5   10:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field String a>
	//    2    4:areturn         
	}

	public void a(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
		{
			throw new IllegalArgumentException("http resource descriptor must not be null");
	//    2    4:new             #21  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #23  <String "http resource descriptor must not be null">
	//    5   10:invokespecial   #25  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		} else
		{
			a = s;
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:putfield        #16  <Field String a>
			return;
	//   10   19:return          
		}
	}

	private String a;
}
