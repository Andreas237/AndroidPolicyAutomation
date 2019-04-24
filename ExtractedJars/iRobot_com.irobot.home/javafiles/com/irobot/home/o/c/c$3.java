// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import com.irobot.core.Error;
import com.irobot.core.NetworkJsonCallback;
import com.irobot.home.core.c;
import com.irobot.home.util.o;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

// Referenced classes of package com.irobot.home.o.c:
//			c

class c$3
	implements IMqttActionListener
{

	public void onFailure(IMqttToken imqtttoken, Throwable throwable)
	{
		if(c != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field NetworkJsonCallback c>
	//*   2    4:ifnull          82
		{
			o.b(com.irobot.home.o.c.c.g(), String.format("Failed to publish %s to topic %s", new Object[] {
				a, b
			}));
	//    3    7:invokestatic    #37  <Method String c.g()>
	//    4   10:ldc1            #39  <String "Failed to publish %s to topic %s">
	//    5   12:iconst_2        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_0         
	//   10   19:getfield        #23  <Field String a>
	//   11   22:aastore         
	//   12   23:dup             
	//   13   24:iconst_1        
	//   14   25:aload_0         
	//   15   26:getfield        #25  <Field String b>
	//   16   29:aastore         
	//   17   30:invokestatic    #45  <Method String String.format(String, Object[])>
	//   18   33:invokestatic    #50  <Method void o.b(String, String)>
			imqtttoken = ((IMqttToken) (new StringBuilder()));
	//   19   36:new             #52  <Class StringBuilder>
	//   20   39:dup             
	//   21   40:invokespecial   #53  <Method void StringBuilder()>
	//   22   43:astore_1        
			((StringBuilder) (imqtttoken)).append("Error publishing to ");
	//   23   44:aload_1         
	//   24   45:ldc1            #55  <String "Error publishing to ">
	//   25   47:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   26   50:pop             
			((StringBuilder) (imqtttoken)).append(b);
	//   27   51:aload_1         
	//   28   52:aload_0         
	//   29   53:getfield        #25  <Field String b>
	//   30   56:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
			imqtttoken = ((IMqttToken) (Error.create(0, ((StringBuilder) (imqtttoken)).toString(), com.irobot.home.core.c.a(throwable))));
	//   32   60:iconst_0        
	//   33   61:aload_1         
	//   34   62:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   35   65:aload_2         
	//   36   66:invokestatic    #67  <Method java.util.HashMap c.a(Throwable)>
	//   37   69:invokestatic    #73  <Method Error Error.create(int, String, java.util.HashMap)>
	//   38   72:astore_1        
			com.irobot.home.o.c.c.a(d, ((Error) (imqtttoken)));
	//   39   73:aload_0         
	//   40   74:getfield        #21  <Field com.irobot.home.o.c.c d>
	//   41   77:aload_1         
	//   42   78:invokestatic    #76  <Method void c.a(com.irobot.home.o.c.c, Error)>
			return;
	//   43   81:return          
		} else
		{
			throwable.printStackTrace();
	//   44   82:aload_2         
	//   45   83:invokevirtual   #81  <Method void Throwable.printStackTrace()>
			return;
	//   46   86:return          
		}
	}

	public void onSuccess(IMqttToken imqtttoken)
	{
		o.b(com.irobot.home.o.c.c.g(), String.format("Successfully published %s to topic %s", new Object[] {
			a, b
		}));
	//    0    0:invokestatic    #37  <Method String c.g()>
	//    1    3:ldc1            #85  <String "Successfully published %s to topic %s">
	//    2    5:iconst_2        
	//    3    6:anewarray       Object[]
	//    4    9:dup             
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:getfield        #23  <Field String a>
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:aload_0         
	//   12   19:getfield        #25  <Field String b>
	//   13   22:aastore         
	//   14   23:invokestatic    #45  <Method String String.format(String, Object[])>
	//   15   26:invokestatic    #50  <Method void o.b(String, String)>
		if(c != null)
	//*  16   29:aload_0         
	//*  17   30:getfield        #27  <Field NetworkJsonCallback c>
	//*  18   33:ifnull          54
			c.onSuccess(com.irobot.home.o.c.c.b(d), a);
	//   19   36:aload_0         
	//   20   37:getfield        #27  <Field NetworkJsonCallback c>
	//   21   40:aload_0         
	//   22   41:getfield        #21  <Field com.irobot.home.o.c.c d>
	//   23   44:invokestatic    #88  <Method com.irobot.core.NetworkResponse c.b(com.irobot.home.o.c.c)>
	//   24   47:aload_0         
	//   25   48:getfield        #23  <Field String a>
	//   26   51:invokevirtual   #93  <Method void NetworkJsonCallback.onSuccess(com.irobot.core.NetworkResponse, String)>
	//   27   54:return          
	}

	final String a;
	final String b;
	final NetworkJsonCallback c;
	final com.irobot.home.o.c.c d;

	c$3(com.irobot.home.o.c.c c1, String s, String s1, NetworkJsonCallback networkjsoncallback)
	{
		d = c1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field com.irobot.home.o.c.c d>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field String a>
		b = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field String b>
		c = networkjsoncallback;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field NetworkJsonCallback c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void Object()>
	//   14   25:return          
	}
}
