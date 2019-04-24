// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.a;

import com.irobot.core.Error;
import com.irobot.core.NetworkAddress;
import com.irobot.core.NetworkJsonCallback;
import com.irobot.core.NetworkResponse;
import com.irobot.home.core.c;
import com.irobot.home.util.o;
import org.eclipse.paho.client.mqttv3.IMqttActionListener;
import org.eclipse.paho.client.mqttv3.IMqttToken;

// Referenced classes of package com.irobot.home.o.a:
//			c

class c$3$1
	implements com.irobot.home.o.c.n.a
{

	public void a(String s, int i, String s1, Error error)
	{
		if(b.d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field c$3 b>
	//*   2    4:getfield        #29  <Field NetworkJsonCallback c$3.d>
	//*   3    7:ifnull          72
		{
			s = ((String) (NetworkResponse.create(b.b, a, s, i)));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field c$3 b>
	//    6   14:getfield        #32  <Field com.irobot.core.AssetId c$3.b>
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field NetworkAddress a>
	//    9   21:aload_1         
	//   10   22:iload_2         
	//   11   23:invokestatic    #38  <Method NetworkResponse NetworkResponse.create(com.irobot.core.AssetId, NetworkAddress, String, int)>
	//   12   26:astore_1        
			if(error != null)
	//*  13   27:aload           4
	//*  14   29:ifnull          46
			{
				b.d.onFailure(((NetworkResponse) (s)), error);
	//   15   32:aload_0         
	//   16   33:getfield        #19  <Field c$3 b>
	//   17   36:getfield        #29  <Field NetworkJsonCallback c$3.d>
	//   18   39:aload_1         
	//   19   40:aload           4
	//   20   42:invokevirtual   #44  <Method void NetworkJsonCallback.onFailure(NetworkResponse, Error)>
				return;
	//   21   45:return          
			}
			error = ((Error) (b.d));
	//   22   46:aload_0         
	//   23   47:getfield        #19  <Field c$3 b>
	//   24   50:getfield        #29  <Field NetworkJsonCallback c$3.d>
	//   25   53:astore          4
			if(s1 == null)
	//*  26   55:aload_3         
	//*  27   56:ifnull          62
	//*  28   59:goto            65
				s1 = "";
	//   29   62:ldc1            #46  <String "">
	//   30   64:astore_3        
			((NetworkJsonCallback) (error)).onSuccess(((NetworkResponse) (s)), s1);
	//   31   65:aload           4
	//   32   67:aload_1         
	//   33   68:aload_3         
	//   34   69:invokevirtual   #50  <Method void NetworkJsonCallback.onSuccess(NetworkResponse, String)>
		}
	//   35   72:return          
	}

	final NetworkAddress a;
	final c._cls3 b;

	c$3$1(c._cls3 _pcls3, NetworkAddress networkaddress)
	{
		b = _pcls3;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field c$3 b>
		a = networkaddress;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field NetworkAddress a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}

	// Unreferenced inner class com/irobot/home/o/c/c$3

/* anonymous class */
	class c._cls3
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
		//   23   44:invokestatic    #88  <Method NetworkResponse c.b(com.irobot.home.o.c.c)>
		//   24   47:aload_0         
		//   25   48:getfield        #23  <Field String a>
		//   26   51:invokevirtual   #93  <Method void NetworkJsonCallback.onSuccess(NetworkResponse, String)>
		//   27   54:return          
		}

		final String a;
		final String b;
		final NetworkJsonCallback c;
		final com.irobot.home.o.c.c d;

			
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

}
