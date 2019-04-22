// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appsflyer;

import android.text.TextUtils;
import com.newrelic.agent.android.instrumentation.URLConnectionInstrumentation;
import java.io.IOException;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

// Referenced classes of package com.appsflyer:
//			AFLogger, AppsFlyerProperties, s, AppsFlyerLib

public abstract class OneLinkHttpTask
	implements Runnable
{
	public static class HttpsUrlConnectionProvider
	{

		static HttpsURLConnection _mth02CA(String s1)
			throws IOException
		{
			return (HttpsURLConnection)URLConnectionInstrumentation.openConnection((new URL(s1)).openConnection());
		//    0    0:new             #19  <Class URL>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:invokespecial   #22  <Method void URL(String)>
		//    4    8:invokevirtual   #26  <Method URLConnection URL.openConnection()>
		//    5   11:invokestatic    #31  <Method URLConnection URLConnectionInstrumentation.openConnection(URLConnection)>
		//    6   14:checkcast       #33  <Class HttpsURLConnection>
		//    7   17:areturn         
		}

		public HttpsUrlConnectionProvider()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}


	OneLinkHttpTask(AppsFlyerLib appsflyerlib)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		_fld02CB = appsflyerlib;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field AppsFlyerLib _fld02CB>
	//    5    9:return          
	}

	public void run()
	{
		long l;
		Object obj;
		Object obj1;
		Object obj2;
		String s1;
		l = System.currentTimeMillis() / 1000L;
	//    0    0:invokestatic    #32  <Method long System.currentTimeMillis()>
	//    1    3:ldc2w           #33  <Long 1000L>
	//    2    6:ldiv            
	//    3    7:lstore_2        
		obj1 = "";
	//    4    8:ldc1            #36  <String "">
	//    5   10:astore          5
		obj2 = "";
	//    6   12:ldc1            #36  <String "">
	//    7   14:astore          6
		s1 = _mth02CE();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #39  <Method String _mth02CE()>
	//   10   20:astore          7
		AFLogger.afRDLog("oneLinkUrl: ".concat(String.valueOf(((Object) (s1)))));
	//   11   22:ldc1            #41  <String "oneLinkUrl: ">
	//   12   24:aload           7
	//   13   26:invokestatic    #47  <Method String String.valueOf(Object)>
	//   14   29:invokevirtual   #51  <Method String String.concat(String)>
	//   15   32:invokestatic    #57  <Method void AFLogger.afRDLog(String)>
		obj = obj1;
	//   16   35:aload           5
	//   17   37:astore          4
		HttpsURLConnection httpsurlconnection = HttpsUrlConnectionProvider._mth02CA(s1);
	//   18   39:aload           7
	//   19   41:invokestatic    #60  <Method HttpsURLConnection OneLinkHttpTask$HttpsUrlConnectionProvider._mth02CA(String)>
	//   20   44:astore          8
		obj = obj1;
	//   21   46:aload           5
	//   22   48:astore          4
		((URLConnection) (httpsurlconnection)).addRequestProperty("content-type", "application/json");
	//   23   50:aload           8
	//   24   52:ldc1            #62  <String "content-type">
	//   25   54:ldc1            #64  <String "application/json">
	//   26   56:invokevirtual   #70  <Method void URLConnection.addRequestProperty(String, String)>
		obj = obj1;
	//   27   59:aload           5
	//   28   61:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   29   63:new             #72  <Class StringBuilder>
	//   30   66:dup             
	//   31   67:invokespecial   #73  <Method void StringBuilder()>
	//   32   70:astore          9
		obj = obj1;
	//   33   72:aload           5
	//   34   74:astore          4
		stringbuilder1.append(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
	//   35   76:aload           9
	//   36   78:invokestatic    #79  <Method AppsFlyerProperties AppsFlyerProperties.getInstance()>
	//   37   81:ldc1            #81  <String "AppsFlyerKey">
	//   38   83:invokevirtual   #84  <Method String AppsFlyerProperties.getString(String)>
	//   39   86:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//   40   89:pop             
		obj = obj1;
	//   41   90:aload           5
	//   42   92:astore          4
		stringbuilder1.append(l);
	//   43   94:aload           9
	//   44   96:lload_2         
	//   45   97:invokevirtual   #91  <Method StringBuilder StringBuilder.append(long)>
	//   46  100:pop             
		obj = obj1;
	//   47  101:aload           5
	//   48  103:astore          4
		((URLConnection) (httpsurlconnection)).addRequestProperty("authorization", s._mth02CE(((Object) (stringbuilder1)).toString()));
	//   49  105:aload           8
	//   50  107:ldc1            #93  <String "authorization">
	//   51  109:aload           9
	//   52  111:invokevirtual   #96  <Method String Object.toString()>
	//   53  114:invokestatic    #100 <Method String s._mth02CE(String)>
	//   54  117:invokevirtual   #70  <Method void URLConnection.addRequestProperty(String, String)>
		obj = obj1;
	//   55  120:aload           5
	//   56  122:astore          4
		((URLConnection) (httpsurlconnection)).addRequestProperty("af-timestamp", String.valueOf(l));
	//   57  124:aload           8
	//   58  126:ldc1            #102 <String "af-timestamp">
	//   59  128:lload_2         
	//   60  129:invokestatic    #105 <Method String String.valueOf(long)>
	//   61  132:invokevirtual   #70  <Method void URLConnection.addRequestProperty(String, String)>
		obj = obj1;
	//   62  135:aload           5
	//   63  137:astore          4
		((URLConnection) (httpsurlconnection)).setReadTimeout(3000);
	//   64  139:aload           8
	//   65  141:sipush          3000
	//   66  144:invokevirtual   #109 <Method void URLConnection.setReadTimeout(int)>
		obj = obj1;
	//   67  147:aload           5
	//   68  149:astore          4
		((URLConnection) (httpsurlconnection)).setConnectTimeout(3000);
	//   69  151:aload           8
	//   70  153:sipush          3000
	//   71  156:invokevirtual   #112 <Method void URLConnection.setConnectTimeout(int)>
		obj = obj1;
	//   72  159:aload           5
	//   73  161:astore          4
		_mth02CE(httpsurlconnection);
	//   74  163:aload_0         
	//   75  164:aload           8
	//   76  166:invokevirtual   #115 <Method void _mth02CE(HttpsURLConnection)>
		obj = obj1;
	//   77  169:aload           5
	//   78  171:astore          4
		int i = ((HttpURLConnection) (httpsurlconnection)).getResponseCode();
	//   79  173:aload           8
	//   80  175:invokevirtual   #121 <Method int HttpURLConnection.getResponseCode()>
	//   81  178:istore_1        
		obj = obj1;
	//   82  179:aload           5
	//   83  181:astore          4
		obj1 = ((Object) (AppsFlyerLib._mth02CB(((HttpURLConnection) (httpsurlconnection)))));
	//   84  183:aload           8
	//   85  185:invokestatic    #126 <Method String AppsFlyerLib._mth02CB(HttpURLConnection)>
	//   86  188:astore          5
		if(i != 200)
			break MISSING_BLOCK_LABEL_217;
	//   87  190:iload_1         
	//   88  191:sipush          200
	//   89  194:icmpne          217
		obj = obj1;
	//   90  197:aload           5
	//   91  199:astore          4
		AFLogger.afInfoLog("Status 200 ok");
	//   92  201:ldc1            #128 <String "Status 200 ok">
	//   93  203:invokestatic    #131 <Method void AFLogger.afInfoLog(String)>
		obj = obj1;
	//   94  206:aload           5
	//   95  208:astore          4
		obj1 = obj2;
	//   96  210:aload           6
	//   97  212:astore          5
		break MISSING_BLOCK_LABEL_351;
	//   98  214:goto            351
		obj = obj1;
	//   99  217:aload           5
	//  100  219:astore          4
		obj2 = ((Object) (new StringBuilder("Response code = ")));
	//  101  221:new             #72  <Class StringBuilder>
	//  102  224:dup             
	//  103  225:ldc1            #133 <String "Response code = ">
	//  104  227:invokespecial   #135 <Method void StringBuilder(String)>
	//  105  230:astore          6
		obj = obj1;
	//  106  232:aload           5
	//  107  234:astore          4
		((StringBuilder) (obj2)).append(i);
	//  108  236:aload           6
	//  109  238:iload_1         
	//  110  239:invokevirtual   #138 <Method StringBuilder StringBuilder.append(int)>
	//  111  242:pop             
		obj = obj1;
	//  112  243:aload           5
	//  113  245:astore          4
		((StringBuilder) (obj2)).append(" content = ");
	//  114  247:aload           6
	//  115  249:ldc1            #140 <String " content = ">
	//  116  251:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  117  254:pop             
		obj = obj1;
	//  118  255:aload           5
	//  119  257:astore          4
		((StringBuilder) (obj2)).append(((String) (obj1)));
	//  120  259:aload           6
	//  121  261:aload           5
	//  122  263:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  123  266:pop             
		obj = obj1;
	//  124  267:aload           5
	//  125  269:astore          4
		obj2 = ((Object) (obj2.toString()));
	//  126  271:aload           6
	//  127  273:invokevirtual   #96  <Method String Object.toString()>
	//  128  276:astore          6
		obj = obj1;
	//  129  278:aload           5
	//  130  280:astore          4
		obj1 = obj2;
	//  131  282:aload           6
	//  132  284:astore          5
		break MISSING_BLOCK_LABEL_351;
	//  133  286:goto            351
		obj1;
	//  134  289:astore          5
		AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(((Object) (s1)))), ((Throwable) (obj1)));
	//  135  291:ldc1            #142 <String "Error while calling ">
	//  136  293:aload           7
	//  137  295:invokestatic    #47  <Method String String.valueOf(Object)>
	//  138  298:invokevirtual   #51  <Method String String.concat(String)>
	//  139  301:aload           5
	//  140  303:invokestatic    #146 <Method void AFLogger.afErrorLog(String, Throwable)>
		StringBuilder stringbuilder = new StringBuilder("Error while calling ");
	//  141  306:new             #72  <Class StringBuilder>
	//  142  309:dup             
	//  143  310:ldc1            #142 <String "Error while calling ">
	//  144  312:invokespecial   #135 <Method void StringBuilder(String)>
	//  145  315:astore          6
		stringbuilder.append(s1);
	//  146  317:aload           6
	//  147  319:aload           7
	//  148  321:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  149  324:pop             
		stringbuilder.append(" stacktrace: ");
	//  150  325:aload           6
	//  151  327:ldc1            #148 <String " stacktrace: ">
	//  152  329:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  153  332:pop             
		stringbuilder.append(obj1.toString());
	//  154  333:aload           6
	//  155  335:aload           5
	//  156  337:invokevirtual   #96  <Method String Object.toString()>
	//  157  340:invokevirtual   #88  <Method StringBuilder StringBuilder.append(String)>
	//  158  343:pop             
		obj1 = ((Object) (((Object) (stringbuilder)).toString()));
	//  159  344:aload           6
	//  160  346:invokevirtual   #96  <Method String Object.toString()>
	//  161  349:astore          5
		if(TextUtils.isEmpty(((CharSequence) (obj1))))
	//* 162  351:aload           5
	//* 163  353:invokestatic    #154 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 164  356:ifeq            379
		{
			AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(obj)));
	//  165  359:ldc1            #156 <String "Connection call succeeded: ">
	//  166  361:aload           4
	//  167  363:invokestatic    #47  <Method String String.valueOf(Object)>
	//  168  366:invokevirtual   #51  <Method String String.concat(String)>
	//  169  369:invokestatic    #131 <Method void AFLogger.afInfoLog(String)>
			_mth02CE(((String) (obj)));
	//  170  372:aload_0         
	//  171  373:aload           4
	//  172  375:invokevirtual   #158 <Method void _mth02CE(String)>
			return;
	//  173  378:return          
		} else
		{
			AFLogger.afWarnLog("Connection error: ".concat(String.valueOf(obj1)));
	//  174  379:ldc1            #160 <String "Connection error: ">
	//  175  381:aload           5
	//  176  383:invokestatic    #47  <Method String String.valueOf(Object)>
	//  177  386:invokevirtual   #51  <Method String String.concat(String)>
	//  178  389:invokestatic    #163 <Method void AFLogger.afWarnLog(String)>
			_mth02CB();
	//  179  392:aload_0         
	//  180  393:invokevirtual   #165 <Method void _mth02CB()>
			return;
	//  181  396:return          
		}
	}

	public void setConnProvider(HttpsUrlConnectionProvider httpsurlconnectionprovider)
	{
		_fld02CA = httpsurlconnectionprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #169 <Field OneLinkHttpTask$HttpsUrlConnectionProvider _fld02CA>
	//    3    5:return          
	}

	abstract void _mth02CB();

	abstract String _mth02CE();

	abstract void _mth02CE(String s1);

	abstract void _mth02CE(HttpsURLConnection httpsurlconnection)
		throws JSONException, IOException;

	private HttpsUrlConnectionProvider _fld02CA;
	private AppsFlyerLib _fld02CB;
	String _fld02CE;
}
