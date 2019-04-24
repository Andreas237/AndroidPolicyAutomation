// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;


// Referenced classes of package com.mixpanel.android.b:
//			m

class m$1
	implements com.mixpanel.android.mpmetrics.u$a
{

	public void a()
	{
		android.os.Message message = m.a(a).obtainMessage(4);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field m a>
	//    2    4:invokestatic    #23  <Method m$f m.a(m)>
	//    3    7:iconst_4        
	//    4    8:invokevirtual   #29  <Method android.os.Message m$f.obtainMessage(int)>
	//    5   11:astore_1        
		m.a(a).sendMessage(message);
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field m a>
	//    8   16:invokestatic    #23  <Method m$f m.a(m)>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #33  <Method boolean m$f.sendMessage(android.os.Message)>
	//   11   23:pop             
	//   12   24:return          
	}

	final m a;

	m$1(m m1)
	{
		a = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field m a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
