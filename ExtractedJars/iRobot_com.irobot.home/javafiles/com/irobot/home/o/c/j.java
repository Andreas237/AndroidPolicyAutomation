// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.irobot.core.AssetId;
import com.irobot.core.AssetIdNetworkSessionAttribute;
import com.irobot.core.CallbackNetworkSessionAttribute;
import com.irobot.core.ConnectionTimeoutNetworkSessionAttribute;
import com.irobot.core.NetworkAddress;
import com.irobot.core.NetworkAddressNetworkSessionAttribute;
import com.irobot.core.NetworkBinaryCallback;
import com.irobot.core.NetworkResponse;
import com.irobot.core.NetworkSessionAttributeKey;
import com.irobot.core.NetworkSessionCallback;
import com.irobot.home.r.a;
import com.irobot.home.util.o;
import com.mixpanel.android.a.f;
import java.security.KeyStore;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.irobot.home.o.c:
//			h, i, j, n

public class j
	implements h, i.b
{

	public j(HashMap hashmap, KeyStore keystore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		Object obj = ((Object) (new a("LSSDataProcessorService", false)));
	//    2    4:new             #34  <Class a>
	//    3    7:dup             
	//    4    8:ldc1            #36  <String "LSSDataProcessorService">
	//    5   10:iconst_0        
	//    6   11:invokespecial   #39  <Method void a(String, boolean)>
	//    7   14:astore          4
		boolean flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_3        
		a = Executors.newFixedThreadPool(1, ((java.util.concurrent.ThreadFactory) (obj)));
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:aload           4
	//   13   22:invokestatic    #45  <Method ExecutorService Executors.newFixedThreadPool(int, java.util.concurrent.ThreadFactory)>
	//   14   25:putfield        #47  <Field ExecutorService a>
		junit.b.a.a("Local Network Session requires an asset id.", hashmap.containsKey(((Object) (NetworkSessionAttributeKey.AssetId))));
	//   15   28:ldc1            #49  <String "Local Network Session requires an asset id.">
	//   16   30:aload_1         
	//   17   31:getstatic       #55  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.AssetId>
	//   18   34:invokevirtual   #61  <Method boolean HashMap.containsKey(Object)>
	//   19   37:invokestatic    #65  <Method void junit.b.a.a(String, boolean)>
		junit.b.a.a("Local Network Session requires a network address.", hashmap.containsKey(((Object) (NetworkSessionAttributeKey.NetworkAddress))));
	//   20   40:ldc1            #67  <String "Local Network Session requires a network address.">
	//   21   42:aload_1         
	//   22   43:getstatic       #70  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.NetworkAddress>
	//   23   46:invokevirtual   #61  <Method boolean HashMap.containsKey(Object)>
	//   24   49:invokestatic    #65  <Method void junit.b.a.a(String, boolean)>
		junit.b.a.a("Local Network Session requires a calback.", hashmap.containsKey(((Object) (NetworkSessionAttributeKey.Callback))));
	//   25   52:ldc1            #72  <String "Local Network Session requires a calback.">
	//   26   54:aload_1         
	//   27   55:getstatic       #75  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.Callback>
	//   28   58:invokevirtual   #61  <Method boolean HashMap.containsKey(Object)>
	//   29   61:invokestatic    #65  <Method void junit.b.a.a(String, boolean)>
		if(keystore == null)
	//*  30   64:aload_2         
	//*  31   65:ifnull          71
	//*  32   68:goto            73
			flag = false;
	//   33   71:iconst_0        
	//   34   72:istore_3        
		junit.b.a.a("Local Network Session requires a trust store.", flag);
	//   35   73:ldc1            #77  <String "Local Network Session requires a trust store.">
	//   36   75:iload_3         
	//   37   76:invokestatic    #65  <Method void junit.b.a.a(String, boolean)>
		obj = ((Object) (((NetworkAddressNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.NetworkAddress)))).address()));
	//   38   79:aload_1         
	//   39   80:getstatic       #70  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.NetworkAddress>
	//   40   83:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//   41   86:checkcast       #83  <Class NetworkAddressNetworkSessionAttribute>
	//   42   89:invokevirtual   #87  <Method NetworkAddress NetworkAddressNetworkSessionAttribute.address()>
	//   43   92:astore          4
		AssetId assetid = ((AssetIdNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.AssetId)))).assetId();
	//   44   94:aload_1         
	//   45   95:getstatic       #55  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.AssetId>
	//   46   98:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//   47  101:checkcast       #89  <Class AssetIdNetworkSessionAttribute>
	//   48  104:invokevirtual   #93  <Method AssetId AssetIdNetworkSessionAttribute.assetId()>
	//   49  107:astore          5
		NetworkSessionCallback networksessioncallback = ((CallbackNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.Callback)))).callback();
	//   50  109:aload_1         
	//   51  110:getstatic       #75  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.Callback>
	//   52  113:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//   53  116:checkcast       #95  <Class CallbackNetworkSessionAttribute>
	//   54  119:invokevirtual   #99  <Method NetworkSessionCallback CallbackNetworkSessionAttribute.callback()>
	//   55  122:astore          6
		b = assetid;
	//   56  124:aload_0         
	//   57  125:aload           5
	//   58  127:putfield        #101 <Field AssetId b>
		c = ((NetworkAddress) (obj));
	//   59  130:aload_0         
	//   60  131:aload           4
	//   61  133:putfield        #103 <Field NetworkAddress c>
		e = networksessioncallback;
	//   62  136:aload_0         
	//   63  137:aload           6
	//   64  139:putfield        #105 <Field NetworkSessionCallback e>
		d = hashmap;
	//   65  142:aload_0         
	//   66  143:aload_1         
	//   67  144:putfield        #107 <Field HashMap d>
		f = keystore;
	//   68  147:aload_0         
	//   69  148:aload_2         
	//   70  149:putfield        #109 <Field KeyStore f>
	//   71  152:return          
	}

	static NetworkResponse a(j j1)
	{
		return j1.j();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method NetworkResponse j()>
	//    2    4:areturn         
	}

	static String a(j j1, int k)
	{
		return j1.b(k);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #121 <Method String b(int)>
	//    3    5:areturn         
	}

	private String b(int k)
	{
		String s = "";
	//    0    0:ldc1            #123 <String "">
	//    1    2:astore_2        
		if(k == 1)
	//*   2    3:iload_1         
	//*   3    4:iconst_1        
	//*   4    5:icmpne          11
			s = "Certificate not valid";
	//    5    8:ldc1            #125 <String "Certificate not valid">
	//    6   10:astore_2        
		return s;
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	private NetworkResponse j()
	{
		return NetworkResponse.create(b, c, "N/A", 0);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field AssetId b>
	//    2    4:aload_0         
	//    3    5:getfield        #103 <Field NetworkAddress c>
	//    4    8:ldc1            #127 <String "N/A">
	//    5   10:iconst_0        
	//    6   11:invokestatic    #133 <Method NetworkResponse NetworkResponse.create(AssetId, NetworkAddress, String, int)>
	//    7   14:areturn         
	}

	public void a()
	{
		if(h())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #137 <Method boolean h()>
	//*   2    4:ifeq            48
		{
			g = null;
	//    3    7:aload_0         
	//    4    8:aconst_null     
	//    5    9:putfield        #139 <Field i g>
			b = null;
	//    6   12:aload_0         
	//    7   13:aconst_null     
	//    8   14:putfield        #101 <Field AssetId b>
			d = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #107 <Field HashMap d>
			c = null;
	//   12   22:aload_0         
	//   13   23:aconst_null     
	//   14   24:putfield        #103 <Field NetworkAddress c>
			f = null;
	//   15   27:aload_0         
	//   16   28:aconst_null     
	//   17   29:putfield        #109 <Field KeyStore f>
			e = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #105 <Field NetworkSessionCallback e>
			a.shutdownNow();
	//   21   37:aload_0         
	//   22   38:getfield        #47  <Field ExecutorService a>
	//   23   41:invokeinterface #145 <Method java.util.List ExecutorService.shutdownNow()>
	//   24   46:pop             
			return;
	//   25   47:return          
		} else
		{
			o.e("LSSNetworkSession", "Found an invalid session while invalidating session. [invalidate() should NOT have been called]");
	//   26   48:ldc1            #147 <String "LSSNetworkSession">
	//   27   50:ldc1            #149 <String "Found an invalid session while invalidating session. [invalidate() should NOT have been called]">
	//   28   52:invokestatic    #154 <Method void o.e(String, String)>
			return;
	//   29   55:return          
		}
	}

	public void a(int k)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #157 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #158 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Failure: errorCode: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #160 <String "Failure: errorCode: ">
	//    6   11:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toString(k));
	//    8   15:aload_2         
	//    9   16:iload_1         
	//   10   17:invokestatic    #169 <Method String Integer.toString(int)>
	//   11   20:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		o.e("LSSNetworkSession", stringbuilder.toString());
	//   13   24:ldc1            #147 <String "LSSNetworkSession">
	//   14   26:aload_2         
	//   15   27:invokevirtual   #172 <Method String StringBuilder.toString()>
	//   16   30:invokestatic    #154 <Method void o.e(String, String)>
		if(e != null)
	//*  17   33:aload_0         
	//*  18   34:getfield        #105 <Field NetworkSessionCallback e>
	//*  19   37:ifnull          80
		{
			com.irobot.core.NetworkCallback networkcallback = e.getNetworkCallback();
	//   20   40:aload_0         
	//   21   41:getfield        #105 <Field NetworkSessionCallback e>
	//   22   44:invokevirtual   #178 <Method com.irobot.core.NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//   23   47:astore_2        
			if(networkcallback != null)
	//*  24   48:aload_2         
	//*  25   49:ifnull          73
			{
				a.submit(((Runnable) (new BroadcastReceiver(this, k, networkcallback) {

					public void onReceive(Context context, Intent intent)
					{
						context = ((Context) (new JSONObject()));
					//    0    0:new             #24  <Class JSONObject>
					//    1    3:dup             
					//    2    4:invokespecial   #25  <Method void JSONObject()>
					//    3    7:astore_1        
						Object obj = ((Object) (intent.getBundleExtra("event_args")));
					//    4    8:aload_2         
					//    5    9:ldc1            #27  <String "event_args">
					//    6   11:invokevirtual   #33  <Method Bundle Intent.getBundleExtra(String)>
					//    7   14:astore_3        
						if(obj != null)
					//*   8   15:aload_3         
					//*   9   16:ifnull          118
						{
							for(Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext();)
					//*  10   19:aload_3         
					//*  11   20:invokevirtual   #39  <Method Set Bundle.keySet()>
					//*  12   23:invokeinterface #45  <Method Iterator Set.iterator()>
					//*  13   28:astore          4
					//*  14   30:aload           4
					//*  15   32:invokeinterface #51  <Method boolean Iterator.hasNext()>
					//*  16   37:ifeq            118
							{
								String s = (String)iterator.next();
					//   17   40:aload           4
					//   18   42:invokeinterface #55  <Method Object Iterator.next()>
					//   19   47:checkcast       #57  <Class String>
					//   20   50:astore          5
								try
								{
									((JSONObject) (context)).put(s, ((Bundle) (obj)).get(s));
					//   21   52:aload_1         
					//   22   53:aload           5
					//   23   55:aload_3         
					//   24   56:aload           5
					//   25   58:invokevirtual   #61  <Method Object Bundle.get(String)>
					//   26   61:invokevirtual   #65  <Method JSONObject JSONObject.put(String, Object)>
					//   27   64:pop             
								}
					//*  28   65:goto            30
								catch(JSONException jsonexception)
					//*  29   68:astore          6
								{
									StringBuilder stringbuilder2 = new StringBuilder();
					//   30   70:new             #67  <Class StringBuilder>
					//   31   73:dup             
					//   32   74:invokespecial   #68  <Method void StringBuilder()>
					//   33   77:astore          7
									stringbuilder2.append("failed to add key \"");
					//   34   79:aload           7
					//   35   81:ldc1            #70  <String "failed to add key \"">
					//   36   83:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   37   86:pop             
									stringbuilder2.append(s);
					//   38   87:aload           7
					//   39   89:aload           5
					//   40   91:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   41   94:pop             
									stringbuilder2.append("\" to properties for tracking bolts event");
					//   42   95:aload           7
					//   43   97:ldc1            #76  <String "\" to properties for tracking bolts event">
					//   44   99:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   45  102:pop             
									com.mixpanel.android.a.f.e("MixpanelAPI.AL", stringbuilder2.toString(), ((Throwable) (jsonexception)));
					//   46  103:ldc1            #78  <String "MixpanelAPI.AL">
					//   47  105:aload           7
					//   48  107:invokevirtual   #82  <Method String StringBuilder.toString()>
					//   49  110:aload           6
					//   50  112:invokestatic    #88  <Method void f.e(String, String, Throwable)>
								}
							}

						}
					//*  51  115:goto            30
						obj = ((Object) (a));
					//   52  118:aload_0         
					//   53  119:getfield        #14  <Field j a>
					//   54  122:astore_3        
						StringBuilder stringbuilder1 = new StringBuilder();
					//   55  123:new             #67  <Class StringBuilder>
					//   56  126:dup             
					//   57  127:invokespecial   #68  <Method void StringBuilder()>
					//   58  130:astore          4
						stringbuilder1.append("$");
					//   59  132:aload           4
					//   60  134:ldc1            #90  <String "$">
					//   61  136:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   62  139:pop             
						stringbuilder1.append(intent.getStringExtra("event_name"));
					//   63  140:aload           4
					//   64  142:aload_2         
					//   65  143:ldc1            #92  <String "event_name">
					//   66  145:invokevirtual   #96  <Method String Intent.getStringExtra(String)>
					//   67  148:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
					//   68  151:pop             
						((j) (obj)).a(stringbuilder1.toString(), ((JSONObject) (context)));
					//   69  152:aload_3         
					//   70  153:aload           4
					//   71  155:invokevirtual   #82  <Method String StringBuilder.toString()>
					//   72  158:aload_1         
					//   73  159:invokevirtual   #99  <Method void com.mixpanel.android.mpmetrics.j.a(String, JSONObject)>
					//   74  162:return          
					}

					final j a;

			
			{
				a = j1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field j a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
				}
)));
	//   26   52:aload_0         
	//   27   53:getfield        #47  <Field ExecutorService a>
	//   28   56:new             #12  <Class j$2>
	//   29   59:dup             
	//   30   60:aload_0         
	//   31   61:iload_1         
	//   32   62:aload_2         
	//   33   63:invokespecial   #181 <Method void j$2(j, int, com.irobot.core.NetworkCallback)>
	//   34   66:invokeinterface #185 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   35   71:pop             
				return;
	//   36   72:return          
			}
			o.e("LSSNetworkSession", "No callback to send connection status");
	//   37   73:ldc1            #147 <String "LSSNetworkSession">
	//   38   75:ldc1            #187 <String "No callback to send connection status">
	//   39   77:invokestatic    #154 <Method void o.e(String, String)>
		}
	//   40   80:return          
	}

	public void a(HashMap hashmap)
	{
		if(b != null && !TextUtils.isEmpty(((CharSequence) (b.getId()))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field AssetId b>
	//*   2    4:ifnull          116
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field AssetId b>
	//*   5   11:invokevirtual   #193 <Method String AssetId.getId()>
	//*   6   14:invokestatic    #199 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   17:ifeq            23
	//*   8   20:goto            116
		{
			if(e != null && f != null && c != null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #105 <Field NetworkSessionCallback e>
	//*  11   27:ifnull          109
	//*  12   30:aload_0         
	//*  13   31:getfield        #109 <Field KeyStore f>
	//*  14   34:ifnull          109
	//*  15   37:aload_0         
	//*  16   38:getfield        #103 <Field NetworkAddress c>
	//*  17   41:ifnull          109
			{
				g = new i(f, "roomba", b.getId(), c, ((i.b) (this)));
	//   18   44:aload_0         
	//   19   45:new             #201 <Class i>
	//   20   48:dup             
	//   21   49:aload_0         
	//   22   50:getfield        #109 <Field KeyStore f>
	//   23   53:ldc1            #203 <String "roomba">
	//   24   55:aload_0         
	//   25   56:getfield        #101 <Field AssetId b>
	//   26   59:invokevirtual   #193 <Method String AssetId.getId()>
	//   27   62:aload_0         
	//   28   63:getfield        #103 <Field NetworkAddress c>
	//   29   66:aload_0         
	//   30   67:invokespecial   #206 <Method void i(KeyStore, String, String, NetworkAddress, i$b)>
	//   31   70:putfield        #139 <Field i g>
				hashmap = ((HashMap) ((ConnectionTimeoutNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.ConnectionTimeout)))));
	//   32   73:aload_1         
	//   33   74:getstatic       #209 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.ConnectionTimeout>
	//   34   77:invokevirtual   #81  <Method Object HashMap.get(Object)>
	//   35   80:checkcast       #211 <Class ConnectionTimeoutNetworkSessionAttribute>
	//   36   83:astore_1        
				int k;
				if(hashmap != null)
	//*  37   84:aload_1         
	//*  38   85:ifnull          96
					k = ((ConnectionTimeoutNetworkSessionAttribute) (hashmap)).timeout();
	//   39   88:aload_1         
	//   40   89:invokevirtual   #215 <Method int ConnectionTimeoutNetworkSessionAttribute.timeout()>
	//   41   92:istore_2        
				else
	//*  42   93:goto            100
					k = 6000;
	//   43   96:sipush          6000
	//   44   99:istore_2        
				g.a(k);
	//   45  100:aload_0         
	//   46  101:getfield        #139 <Field i g>
	//   47  104:iload_2         
	//   48  105:invokevirtual   #217 <Method void com.irobot.home.o.c.i.a(int)>
				return;
	//   49  108:return          
			} else
			{
				junit.b.a.a("Connecting to an endpoint requires non null parameters", false);
	//   50  109:ldc1            #219 <String "Connecting to an endpoint requires non null parameters">
	//   51  111:iconst_0        
	//   52  112:invokestatic    #65  <Method void junit.b.a.a(String, boolean)>
				return;
	//   53  115:return          
			}
		} else
		{
			junit.b.a.a("Cannot start local service session with null or empty assetId", false);
	//   54  116:ldc1            #221 <String "Cannot start local service session with null or empty assetId">
	//   55  118:iconst_0        
	//   56  119:invokestatic    #65  <Method void junit.b.a.a(String, boolean)>
			return;
	//   57  122:return          
		}
	}

	public void a(byte abyte0[])
	{
		if(!i())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #226 <Method boolean i()>
	//*   2    4:ifne            15
		{
			o.e("LSSNetworkSession", "Cannot send, socket client not configured or not connected.");
	//    3    7:ldc1            #147 <String "LSSNetworkSession">
	//    4    9:ldc1            #228 <String "Cannot send, socket client not configured or not connected.">
	//    5   11:invokestatic    #154 <Method void o.e(String, String)>
			return;
	//    6   14:return          
		} else
		{
			g.a(abyte0);
	//    7   15:aload_0         
	//    8   16:getfield        #139 <Field i g>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #230 <Method void com.irobot.home.o.c.i.a(byte[])>
			return;
	//   11   23:return          
		}
	}

	public AssetId b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field AssetId b>
	//    2    4:areturn         
	}

	public void b(byte abyte0[])
	{
		if(e != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field NetworkSessionCallback e>
	//*   2    4:ifnull          42
		{
			com.irobot.core.NetworkCallback networkcallback = e.getNetworkCallback();
	//    3    7:aload_0         
	//    4    8:getfield        #105 <Field NetworkSessionCallback e>
	//    5   11:invokevirtual   #178 <Method com.irobot.core.NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//    6   14:astore_2        
			if(networkcallback instanceof NetworkBinaryCallback)
	//*   7   15:aload_2         
	//*   8   16:instanceof      #232 <Class NetworkBinaryCallback>
	//*   9   19:ifeq            42
				a.submit(((Runnable) (new q.b(this, networkcallback, abyte0) {

					public void a(SharedPreferences sharedpreferences)
					{
						sharedpreferences = ((SharedPreferences) (com.mixpanel.android.mpmetrics.n.a(sharedpreferences)));
					//    0    0:aload_1         
					//    1    1:invokestatic    #26  <Method org.json.JSONArray com.mixpanel.android.mpmetrics.n.a(SharedPreferences)>
					//    2    4:astore_1        
						if(sharedpreferences != null)
					//*   3    5:aload_1         
					//*   4    6:ifnull          17
							com.mixpanel.android.mpmetrics.j.a(a, ((org.json.JSONArray) (sharedpreferences)));
					//    5    9:aload_0         
					//    6   10:getfield        #16  <Field j a>
					//    7   13:aload_1         
					//    8   14:invokestatic    #29  <Method void com.mixpanel.android.mpmetrics.j.a(j, org.json.JSONArray)>
					//    9   17:return          
					}

					final j a;

			
			{
				a = j1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field j a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
				}
)));
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field ExecutorService a>
	//   12   26:new             #10  <Class j$1>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:aload_2         
	//   16   32:aload_1         
	//   17   33:invokespecial   #235 <Method void j$1(j, com.irobot.core.NetworkCallback, byte[])>
	//   18   36:invokeinterface #185 <Method java.util.concurrent.Future ExecutorService.submit(Runnable)>
	//   19   41:pop             
		}
	//   20   42:return          
	}

	public String c()
	{
		junit.b.a.a("Password is not provided to local secure socket network session.", false);
	//    0    0:ldc1            #237 <String "Password is not provided to local secure socket network session.">
	//    1    2:iconst_0        
	//    2    3:invokestatic    #65  <Method void junit.b.a.a(String, boolean)>
		return null;
	//    3    6:aconst_null     
	//    4    7:areturn         
	}

	public NetworkAddress d()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field NetworkAddress c>
	//    2    4:areturn         
	}

	public void e()
	{
		o.b("LSSNetworkSession", "Connection successful");
	//    0    0:ldc1            #147 <String "LSSNetworkSession">
	//    1    2:ldc1            #239 <String "Connection successful">
	//    2    4:invokestatic    #241 <Method void o.b(String, String)>
		if(e != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #105 <Field NetworkSessionCallback e>
	//*   5   11:ifnull          22
		{
			e.connected();
	//    6   14:aload_0         
	//    7   15:getfield        #105 <Field NetworkSessionCallback e>
	//    8   18:invokevirtual   #244 <Method void NetworkSessionCallback.connected()>
			return;
	//    9   21:return          
		} else
		{
			o.e("LSSNetworkSession", "No callback to send connection status");
	//   10   22:ldc1            #147 <String "LSSNetworkSession">
	//   11   24:ldc1            #187 <String "No callback to send connection status">
	//   12   26:invokestatic    #154 <Method void o.e(String, String)>
			return;
	//   13   29:return          
		}
	}

	public void f()
	{
		o.e("LSSNetworkSession", "disconnected");
	//    0    0:ldc1            #147 <String "LSSNetworkSession">
	//    1    2:ldc1            #246 <String "disconnected">
	//    2    4:invokestatic    #154 <Method void o.e(String, String)>
		if(e != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #105 <Field NetworkSessionCallback e>
	//*   5   11:ifnull          22
		{
			e.disconnected();
	//    6   14:aload_0         
	//    7   15:getfield        #105 <Field NetworkSessionCallback e>
	//    8   18:invokevirtual   #248 <Method void NetworkSessionCallback.disconnected()>
			return;
	//    9   21:return          
		} else
		{
			o.e("LSSNetworkSession", "No callback to send connection status");
	//   10   22:ldc1            #147 <String "LSSNetworkSession">
	//   11   24:ldc1            #187 <String "No callback to send connection status">
	//   12   26:invokestatic    #154 <Method void o.e(String, String)>
			return;
	//   13   29:return          
		}
	}

	public void g()
	{
		if(h())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #137 <Method boolean h()>
	//*   2    4:ifeq            18
		{
			g.c();
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field i g>
	//    5   11:invokevirtual   #250 <Method void i.c()>
			a();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #252 <Method void a()>
		}
	//    8   18:return          
	}

	public boolean h()
	{
		return g != null && !g.b();
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field i g>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field i g>
	//    5   11:invokevirtual   #254 <Method boolean i.b()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public boolean i()
	{
		return g != null && g.a();
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field i g>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field i g>
	//    5   11:invokevirtual   #256 <Method boolean com.irobot.home.o.c.i.a()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	private final ExecutorService a;
	private AssetId b;
	private NetworkAddress c;
	private HashMap d;
	private NetworkSessionCallback e;
	private KeyStore f;
	private i g;
}
