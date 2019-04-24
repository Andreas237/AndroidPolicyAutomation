// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.o.c;

import android.text.TextUtils;
import com.amazonaws.regions.Region;
import com.irobot.core.AssetId;
import com.irobot.core.AssetIdNetworkSessionAttribute;
import com.irobot.core.CallbackNetworkSessionAttribute;
import com.irobot.core.Error;
import com.irobot.core.NetworkAddress;
import com.irobot.core.NetworkAddressNetworkSessionAttribute;
import com.irobot.core.NetworkCallback;
import com.irobot.core.NetworkResponse;
import com.irobot.core.NetworkSessionAttributeKey;
import com.irobot.core.NetworkSessionCallback;
import com.irobot.home.aws.authentication.AwsCredentialsService;
import com.irobot.home.core.c;
import com.irobot.home.r.a;
import com.irobot.home.util.ConnectivityStateReceiver;
import com.irobot.home.util.o;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.irobot.home.o.c:
//			m, b

public class b extends m
	implements com.irobot.home.util.ConnectivityStateReceiver.a
{

	public b(HashMap hashmap)
	{
		super(hashmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void m(HashMap)>
	//    3    5:aload_0         
	//    4    6:iconst_5        
	//    5    7:new             #32  <Class a>
	//    6   10:dup             
	//    7   11:ldc1            #34  <String "AWSApiGW">
	//    8   13:iconst_0        
	//    9   14:invokespecial   #37  <Method void a(String, boolean)>
	//   10   17:invokestatic    #43  <Method ExecutorService Executors.newFixedThreadPool(int, java.util.concurrent.ThreadFactory)>
	//   11   20:putfield        #45  <Field ExecutorService c>
		junit.b.a.a("AwsApiGatewayNetworkSession requires a network address.", hashmap.containsKey(((Object) (NetworkSessionAttributeKey.NetworkAddress))));
	//   12   23:ldc1            #47  <String "AwsApiGatewayNetworkSession requires a network address.">
	//   13   25:aload_1         
	//   14   26:getstatic       #53  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.NetworkAddress>
	//   15   29:invokevirtual   #59  <Method boolean HashMap.containsKey(Object)>
	//   16   32:invokestatic    #63  <Method void junit.b.a.a(String, boolean)>
		junit.b.a.a("AwsApiGatewayNetworkSession requires an asset id.", hashmap.containsKey(((Object) (NetworkSessionAttributeKey.AssetId))));
	//   17   35:ldc1            #65  <String "AwsApiGatewayNetworkSession requires an asset id.">
	//   18   37:aload_1         
	//   19   38:getstatic       #68  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.AssetId>
	//   20   41:invokevirtual   #59  <Method boolean HashMap.containsKey(Object)>
	//   21   44:invokestatic    #63  <Method void junit.b.a.a(String, boolean)>
		e = ((NetworkAddressNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.NetworkAddress)))).address();
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:getstatic       #53  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.NetworkAddress>
	//   25   52:invokevirtual   #72  <Method Object HashMap.get(Object)>
	//   26   55:checkcast       #74  <Class NetworkAddressNetworkSessionAttribute>
	//   27   58:invokevirtual   #78  <Method NetworkAddress NetworkAddressNetworkSessionAttribute.address()>
	//   28   61:putfield        #80  <Field NetworkAddress e>
		f = ((AssetIdNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.AssetId)))).assetId();
	//   29   64:aload_0         
	//   30   65:aload_1         
	//   31   66:getstatic       #68  <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.AssetId>
	//   32   69:invokevirtual   #72  <Method Object HashMap.get(Object)>
	//   33   72:checkcast       #82  <Class AssetIdNetworkSessionAttribute>
	//   34   75:invokevirtual   #86  <Method AssetId AssetIdNetworkSessionAttribute.assetId()>
	//   35   78:putfield        #88  <Field AssetId f>
		hashmap = ((HashMap) (e));
	//   36   81:aload_0         
	//   37   82:getfield        #80  <Field NetworkAddress e>
	//   38   85:astore_1        
		boolean flag1 = true;
	//   39   86:iconst_1        
	//   40   87:istore_3        
		boolean flag;
		if(hashmap != null && !TextUtils.isEmpty(((CharSequence) (e.host()))))
	//*  41   88:aload_1         
	//*  42   89:ifnull          110
	//*  43   92:aload_0         
	//*  44   93:getfield        #80  <Field NetworkAddress e>
	//*  45   96:invokevirtual   #94  <Method String NetworkAddress.host()>
	//*  46   99:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  47  102:ifne            110
			flag = true;
	//   48  105:iconst_1        
	//   49  106:istore_2        
		else
	//*  50  107:goto            112
			flag = false;
	//   51  110:iconst_0        
	//   52  111:istore_2        
		junit.b.a.a("AwsApiGatewayNetworkSession requires a valid network address.", flag);
	//   53  112:ldc1            #102 <String "AwsApiGatewayNetworkSession requires a valid network address.">
	//   54  114:iload_2         
	//   55  115:invokestatic    #63  <Method void junit.b.a.a(String, boolean)>
		if(f != null && !TextUtils.isEmpty(((CharSequence) (f.getId()))))
	//*  56  118:aload_0         
	//*  57  119:getfield        #88  <Field AssetId f>
	//*  58  122:ifnull          143
	//*  59  125:aload_0         
	//*  60  126:getfield        #88  <Field AssetId f>
	//*  61  129:invokevirtual   #107 <Method String AssetId.getId()>
	//*  62  132:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  135:ifne            143
			flag = flag1;
	//   64  138:iload_3         
	//   65  139:istore_2        
		else
	//*  66  140:goto            145
			flag = false;
	//   67  143:iconst_0        
	//   68  144:istore_2        
		junit.b.a.a("AwsApiGatewayNetworkSession requires a valid asset id.", flag);
	//   69  145:ldc1            #109 <String "AwsApiGatewayNetworkSession requires a valid asset id.">
	//   70  147:iload_2         
	//   71  148:invokestatic    #63  <Method void junit.b.a.a(String, boolean)>
	//   72  151:aload_0         
	//   73  152:invokestatic    #114 <Method AwsCredentialsService AwsCredentialsService.f()>
	//   74  155:putfield        #116 <Field AwsCredentialsService d>
		hashmap = ((HashMap) (e.host()));
	//   75  158:aload_0         
	//   76  159:getfield        #80  <Field NetworkAddress e>
	//   77  162:invokevirtual   #94  <Method String NetworkAddress.host()>
	//   78  165:astore_1        
		com.irobot.awsservices.a.a a1 = new com.irobot.awsservices.a.a(com.irobot.awsservices.a.a.a.Asset, ((Object) (f.getId())));
	//   79  166:new             #118 <Class com.irobot.awsservices.a.a>
	//   80  169:dup             
	//   81  170:getstatic       #124 <Field com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a$a.Asset>
	//   82  173:aload_0         
	//   83  174:getfield        #88  <Field AssetId f>
	//   84  177:invokevirtual   #107 <Method String AssetId.getId()>
	//   85  180:invokespecial   #127 <Method void com.irobot.awsservices.a.a(com.irobot.awsservices.a.a$a, Object)>
	//   86  183:astore          4
		b = new com.irobot.awsservices.apigateway.b(a1, ((String) (hashmap)), Region.a(d.b(a1)));
	//   87  185:aload_0         
	//   88  186:new             #129 <Class com.irobot.awsservices.apigateway.b>
	//   89  189:dup             
	//   90  190:aload           4
	//   91  192:aload_1         
	//   92  193:aload_0         
	//   93  194:getfield        #116 <Field AwsCredentialsService d>
	//   94  197:aload           4
	//   95  199:invokevirtual   #132 <Method com.amazonaws.regions.Regions AwsCredentialsService.b(com.irobot.awsservices.a.a)>
	//   96  202:invokestatic    #137 <Method Region Region.a(com.amazonaws.regions.Regions)>
	//   97  205:invokespecial   #140 <Method void com.irobot.awsservices.apigateway.b(com.irobot.awsservices.a.a, String, Region)>
	//   98  208:putfield        #142 <Field com.irobot.awsservices.apigateway.b b>
		b.a(((com.irobot.awsservices.a.b) (d)));
	//   99  211:aload_0         
	//  100  212:getfield        #142 <Field com.irobot.awsservices.apigateway.b b>
	//  101  215:aload_0         
	//  102  216:getfield        #116 <Field AwsCredentialsService d>
	//  103  219:invokevirtual   #145 <Method void com.irobot.awsservices.apigateway.b.a(com.irobot.awsservices.a.b)>
	//  104  222:return          
	}

	static com.irobot.awsservices.apigateway.b a(b b1)
	{
		return b1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field com.irobot.awsservices.apigateway.b b>
	//    2    4:areturn         
	}

	static AwsCredentialsService b(b b1)
	{
		return b1.d;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field AwsCredentialsService d>
	//    2    4:areturn         
	}

	static String e()
	{
		return a;
	//    0    0:getstatic       #151 <Field String a>
	//    1    3:areturn         
	}

	public volatile int a(int i)
	{
		return super.a(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #154 <Method int com.irobot.home.o.c.m.a(int)>
	//    3    5:ireturn         
	}

	public HttpURLConnection a(String s, String s1, String s2, int i)
	{
		junit.b.a.a("AwsApiGatewayNetworkSession.createConnection should not be used", false);
	//    0    0:ldc1            #157 <String "AwsApiGatewayNetworkSession.createConnection should not be used">
	//    1    2:iconst_0        
	//    2    3:invokestatic    #63  <Method void junit.b.a.a(String, boolean)>
		return ((HttpURLConnection) (b.a(((java.util.Map) (new HashMap())))));
	//    3    6:aload_0         
	//    4    7:getfield        #142 <Field com.irobot.awsservices.apigateway.b b>
	//    5   10:new             #55  <Class HashMap>
	//    6   13:dup             
	//    7   14:invokespecial   #159 <Method void HashMap()>
	//    8   17:invokevirtual   #162 <Method javax.net.ssl.HttpsURLConnection com.irobot.awsservices.apigateway.b.a(java.util.Map)>
	//    9   20:areturn         
	}

	public void a()
	{
		super.a();
	//    0    0:aload_0         
	//    1    1:invokespecial   #164 <Method void com.irobot.home.o.c.m.a()>
		g = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #166 <Field NetworkSessionCallback g>
		ConnectivityStateReceiver.a().b(((com.irobot.home.util.ConnectivityStateReceiver.a) (this)));
	//    5    9:invokestatic    #171 <Method ConnectivityStateReceiver ConnectivityStateReceiver.a()>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #174 <Method boolean ConnectivityStateReceiver.b(com.irobot.home.util.ConnectivityStateReceiver$a)>
	//    8   16:pop             
		c.shutdown();
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field ExecutorService c>
	//   11   21:invokeinterface #179 <Method void ExecutorService.shutdown()>
	//   12   26:return          
	}

	public void a(String s, String s1, String s2, boolean flag, String s3, int i, n.a a1)
	{
		s = ((String) (new org.androidannotations.a.a.a.b(this, s1, s, i, s3, a1) {

			public void onRestClientExceptionThrown(org.c.b.b b1)
			{
				StringBuilder stringbuilder = new StringBuilder();
			//    0    0:new             #24  <Class StringBuilder>
			//    1    3:dup             
			//    2    4:invokespecial   #25  <Method void StringBuilder()>
			//    3    7:astore_2        
				stringbuilder.append("Rest client exception: ");
			//    4    8:aload_2         
			//    5    9:ldc1            #27  <String "Rest client exception: ">
			//    6   11:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//    7   14:pop             
				stringbuilder.append(b1.getMessage());
			//    8   15:aload_2         
			//    9   16:aload_1         
			//   10   17:invokevirtual   #37  <Method String org.c.b.b.getMessage()>
			//   11   20:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
			//   12   23:pop             
				o.e("SupportWebServiceHandler", stringbuilder.toString());
			//   13   24:ldc1            #39  <String "SupportWebServiceHandler">
			//   14   26:aload_2         
			//   15   27:invokevirtual   #42  <Method String StringBuilder.toString()>
			//   16   30:invokestatic    #48  <Method void o.e(String, String)>
			//   17   33:return          
			}

			final b a;

			
			{
				a = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field b a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
));
	//    0    0:new             #8   <Class b$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:aload_1         
	//    5    7:iload           6
	//    6    9:aload           5
	//    7   11:aload           7
	//    8   13:invokespecial   #183 <Method void b$1(b, String, String, int, String, n$a)>
	//    9   16:astore_1        
		c.execute(((Runnable) (s)));
	//   10   17:aload_0         
	//   11   18:getfield        #45  <Field ExecutorService c>
	//   12   21:aload_1         
	//   13   22:invokeinterface #187 <Method void ExecutorService.execute(Runnable)>
	//   14   27:return          
	}

	public void a(HashMap hashmap)
	{
		junit.b.a.a("AwsApiGatewayNetworkSession requires a session callback.", hashmap.containsKey(((Object) (NetworkSessionAttributeKey.Callback))));
	//    0    0:ldc1            #189 <String "AwsApiGatewayNetworkSession requires a session callback.">
	//    1    2:aload_1         
	//    2    3:getstatic       #192 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.Callback>
	//    3    6:invokevirtual   #59  <Method boolean HashMap.containsKey(Object)>
	//    4    9:invokestatic    #63  <Method void junit.b.a.a(String, boolean)>
		g = ((CallbackNetworkSessionAttribute)hashmap.get(((Object) (NetworkSessionAttributeKey.Callback)))).callback();
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:getstatic       #192 <Field NetworkSessionAttributeKey NetworkSessionAttributeKey.Callback>
	//    8   17:invokevirtual   #72  <Method Object HashMap.get(Object)>
	//    9   20:checkcast       #194 <Class CallbackNetworkSessionAttribute>
	//   10   23:invokevirtual   #198 <Method NetworkSessionCallback CallbackNetworkSessionAttribute.callback()>
	//   11   26:putfield        #166 <Field NetworkSessionCallback g>
		hashmap = ((HashMap) (b.a()));
	//   12   29:aload_0         
	//   13   30:getfield        #142 <Field com.irobot.awsservices.apigateway.b b>
	//   14   33:invokevirtual   #201 <Method com.irobot.awsservices.a.b$a com.irobot.awsservices.apigateway.b.a()>
	//   15   36:astore_1        
		if(g == null)
	//*  16   37:aload_0         
	//*  17   38:getfield        #166 <Field NetworkSessionCallback g>
	//*  18   41:ifnonnull       53
		{
			o.e(a, "Cannot startSession without a valid session callback. Ignoring request");
	//   19   44:getstatic       #151 <Field String a>
	//   20   47:ldc1            #203 <String "Cannot startSession without a valid session callback. Ignoring request">
	//   21   49:invokestatic    #208 <Method void o.e(String, String)>
			return;
	//   22   52:return          
		}
		if(hashmap == null)
	//*  23   53:aload_1         
	//*  24   54:ifnonnull       73
		{
			ConnectivityStateReceiver.a().a(((com.irobot.home.util.ConnectivityStateReceiver.a) (this)));
	//   25   57:invokestatic    #171 <Method ConnectivityStateReceiver ConnectivityStateReceiver.a()>
	//   26   60:aload_0         
	//   27   61:invokevirtual   #210 <Method boolean ConnectivityStateReceiver.a(com.irobot.home.util.ConnectivityStateReceiver$a)>
	//   28   64:pop             
			g.connected();
	//   29   65:aload_0         
	//   30   66:getfield        #166 <Field NetworkSessionCallback g>
	//   31   69:invokevirtual   #215 <Method void NetworkSessionCallback.connected()>
			return;
	//   32   72:return          
		}
		if(g.getNetworkCallback() != null)
	//*  33   73:aload_0         
	//*  34   74:getfield        #166 <Field NetworkSessionCallback g>
	//*  35   77:invokevirtual   #219 <Method NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//*  36   80:ifnull          145
		{
			int i = com.irobot.home.aws.authentication.a.a(((com.irobot.awsservices.a.a) (hashmap)).getMessage());
	//   37   83:aload_1         
	//   38   84:invokevirtual   #224 <Method String com.irobot.awsservices.a.b$a.getMessage()>
	//   39   87:invokestatic    #229 <Method int com.irobot.home.aws.authentication.a.a(String)>
	//   40   90:istore_2        
			hashmap = ((HashMap) (((com.irobot.awsservices.a.a) (hashmap)).getMessage()));
	//   41   91:aload_1         
	//   42   92:invokevirtual   #224 <Method String com.irobot.awsservices.a.b$a.getMessage()>
	//   43   95:astore_1        
			hashmap = ((HashMap) (Error.create(i, ((String) (hashmap)), com.irobot.home.core.c.a(((Throwable) (new Exception(((String) (hashmap)))))))));
	//   44   96:iload_2         
	//   45   97:aload_1         
	//   46   98:new             #231 <Class Exception>
	//   47  101:dup             
	//   48  102:aload_1         
	//   49  103:invokespecial   #234 <Method void Exception(String)>
	//   50  106:invokestatic    #239 <Method HashMap c.a(Throwable)>
	//   51  109:invokestatic    #245 <Method Error Error.create(int, String, HashMap)>
	//   52  112:astore_1        
			g.getNetworkCallback().onFailure(NetworkResponse.create(f, e, "GET", i), ((Error) (hashmap)));
	//   53  113:aload_0         
	//   54  114:getfield        #166 <Field NetworkSessionCallback g>
	//   55  117:invokevirtual   #219 <Method NetworkCallback NetworkSessionCallback.getNetworkCallback()>
	//   56  120:aload_0         
	//   57  121:getfield        #88  <Field AssetId f>
	//   58  124:aload_0         
	//   59  125:getfield        #80  <Field NetworkAddress e>
	//   60  128:ldc1            #247 <String "GET">
	//   61  130:iload_2         
	//   62  131:invokestatic    #252 <Method NetworkResponse NetworkResponse.create(AssetId, NetworkAddress, String, int)>
	//   63  134:aload_1         
	//   64  135:invokevirtual   #258 <Method void NetworkCallback.onFailure(NetworkResponse, Error)>
			g.disconnected();
	//   65  138:aload_0         
	//   66  139:getfield        #166 <Field NetworkSessionCallback g>
	//   67  142:invokevirtual   #261 <Method void NetworkSessionCallback.disconnected()>
		}
	//   68  145:return          
	}

	public volatile AssetId b()
	{
		return super.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #263 <Method AssetId m.b()>
	//    2    4:areturn         
	}

	public void b(boolean flag)
	{
		if(!flag && g != null)
	//*   0    0:iload_1         
	//*   1    1:ifne            27
	//*   2    4:aload_0         
	//*   3    5:getfield        #166 <Field NetworkSessionCallback g>
	//*   4    8:ifnull          27
		{
			o.e(a, "Reporting a disconnected to PA due to network loss.");
	//    5   11:getstatic       #151 <Field String a>
	//    6   14:ldc2            #266 <String "Reporting a disconnected to PA due to network loss.">
	//    7   17:invokestatic    #208 <Method void o.e(String, String)>
			g.disconnected();
	//    8   20:aload_0         
	//    9   21:getfield        #166 <Field NetworkSessionCallback g>
	//   10   24:invokevirtual   #261 <Method void NetworkSessionCallback.disconnected()>
		}
	//   11   27:return          
	}

	public volatile String c()
	{
		return super.c();
	//    0    0:aload_0         
	//    1    1:invokespecial   #268 <Method String com.irobot.home.o.c.m.c()>
	//    2    4:areturn         
	}

	public volatile NetworkAddress d()
	{
		return super.d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #270 <Method NetworkAddress m.d()>
	//    2    4:areturn         
	}

	public volatile boolean equals(Object obj)
	{
		return super.equals(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #273 <Method boolean m.equals(Object)>
	//    3    5:ireturn         
	}

	public volatile int hashCode()
	{
		return super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #277 <Method int m.hashCode()>
	//    2    4:ireturn         
	}

	private static final String a = "b";
	private final com.irobot.awsservices.apigateway.b b;
	private final ExecutorService c = Executors.newFixedThreadPool(5, ((java.util.concurrent.ThreadFactory) (new a("AWSApiGW", false))));
	private final AwsCredentialsService d = AwsCredentialsService.f();
	private NetworkAddress e;
	private AssetId f;
	private NetworkSessionCallback g;

	static 
	{
	//    0    0:return          
	}
}
