// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.mixpanel.android.b;

import android.os.Message;
import org.json.JSONObject;

// Referenced classes of package com.mixpanel.android.b:
//			m

private class m$a
	implements e$a
{

	public void a()
	{
		Message message = m.a(a).obtainMessage(4);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokestatic    #24  <Method m$f m.a(m)>
	//    3    7:iconst_4        
	//    4    8:invokevirtual   #30  <Method Message m$f.obtainMessage(int)>
	//    5   11:astore_1        
		m.a(a).sendMessage(message);
	//    6   12:aload_0         
	//    7   13:getfield        #14  <Field m a>
	//    8   16:invokestatic    #24  <Method m$f m.a(m)>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #34  <Method boolean m$f.sendMessage(Message)>
	//   11   23:pop             
	//   12   24:return          
	}

	public void a(JSONObject jsonobject)
	{
		Message message = m.a(a).obtainMessage(2);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokestatic    #24  <Method m$f m.a(m)>
	//    3    7:iconst_2        
	//    4    8:invokevirtual   #30  <Method Message m$f.obtainMessage(int)>
	//    5   11:astore_2        
		message.obj = ((Object) (jsonobject));
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:putfield        #41  <Field Object Message.obj>
		m.a(a).sendMessage(message);
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field m a>
	//   11   21:invokestatic    #24  <Method m$f m.a(m)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #34  <Method boolean m$f.sendMessage(Message)>
	//   14   28:pop             
	//   15   29:return          
	}

	public void b()
	{
		Message message = m.a(a).obtainMessage(8);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokestatic    #24  <Method m$f m.a(m)>
	//    3    7:bipush          8
	//    4    9:invokevirtual   #30  <Method Message m$f.obtainMessage(int)>
	//    5   12:astore_1        
		m.a(a).sendMessage(message);
	//    6   13:aload_0         
	//    7   14:getfield        #14  <Field m a>
	//    8   17:invokestatic    #24  <Method m$f m.a(m)>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #34  <Method boolean m$f.sendMessage(Message)>
	//   11   24:pop             
	//   12   25:return          
	}

	public void b(JSONObject jsonobject)
	{
		Message message = m.a(a).obtainMessage(3);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokestatic    #24  <Method m$f m.a(m)>
	//    3    7:iconst_3        
	//    4    8:invokevirtual   #30  <Method Message m$f.obtainMessage(int)>
	//    5   11:astore_2        
		message.obj = ((Object) (jsonobject));
	//    6   12:aload_2         
	//    7   13:aload_1         
	//    8   14:putfield        #41  <Field Object Message.obj>
		m.a(a).sendMessage(message);
	//    9   17:aload_0         
	//   10   18:getfield        #14  <Field m a>
	//   11   21:invokestatic    #24  <Method m$f m.a(m)>
	//   12   24:aload_2         
	//   13   25:invokevirtual   #34  <Method boolean m$f.sendMessage(Message)>
	//   14   28:pop             
	//   15   29:return          
	}

	public void c(JSONObject jsonobject)
	{
		Message message = m.a(a).obtainMessage(10);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokestatic    #24  <Method m$f m.a(m)>
	//    3    7:bipush          10
	//    4    9:invokevirtual   #30  <Method Message m$f.obtainMessage(int)>
	//    5   12:astore_2        
		message.obj = ((Object) (jsonobject));
	//    6   13:aload_2         
	//    7   14:aload_1         
	//    8   15:putfield        #41  <Field Object Message.obj>
		m.a(a).sendMessage(message);
	//    9   18:aload_0         
	//   10   19:getfield        #14  <Field m a>
	//   11   22:invokestatic    #24  <Method m$f m.a(m)>
	//   12   25:aload_2         
	//   13   26:invokevirtual   #34  <Method boolean m$f.sendMessage(Message)>
	//   14   29:pop             
	//   15   30:return          
	}

	public void d(JSONObject jsonobject)
	{
		Message message = m.a(a).obtainMessage(6);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokestatic    #24  <Method m$f m.a(m)>
	//    3    7:bipush          6
	//    4    9:invokevirtual   #30  <Method Message m$f.obtainMessage(int)>
	//    5   12:astore_2        
		message.obj = ((Object) (jsonobject));
	//    6   13:aload_2         
	//    7   14:aload_1         
	//    8   15:putfield        #41  <Field Object Message.obj>
		m.a(a).sendMessage(message);
	//    9   18:aload_0         
	//   10   19:getfield        #14  <Field m a>
	//   11   22:invokestatic    #24  <Method m$f m.a(m)>
	//   12   25:aload_2         
	//   13   26:invokevirtual   #34  <Method boolean m$f.sendMessage(Message)>
	//   14   29:pop             
	//   15   30:return          
	}

	public void e(JSONObject jsonobject)
	{
		Message message = m.a(a).obtainMessage(11);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field m a>
	//    2    4:invokestatic    #24  <Method m$f m.a(m)>
	//    3    7:bipush          11
	//    4    9:invokevirtual   #30  <Method Message m$f.obtainMessage(int)>
	//    5   12:astore_2        
		message.obj = ((Object) (jsonobject));
	//    6   13:aload_2         
	//    7   14:aload_1         
	//    8   15:putfield        #41  <Field Object Message.obj>
		m.a(a).sendMessage(message);
	//    9   18:aload_0         
	//   10   19:getfield        #14  <Field m a>
	//   11   22:invokestatic    #24  <Method m$f m.a(m)>
	//   12   25:aload_2         
	//   13   26:invokevirtual   #34  <Method boolean m$f.sendMessage(Message)>
	//   14   29:pop             
	//   15   30:return          
	}

	final m a;

	private m$a(m m1)
	{
		a = m1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field m a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}

	m$a(m m1, m$1 m$1)
	{
		this(m1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #21  <Method void m$a(m)>
	//    3    5:return          
	}
}
