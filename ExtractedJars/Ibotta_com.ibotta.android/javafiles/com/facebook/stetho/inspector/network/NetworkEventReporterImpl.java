// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;

import android.os.SystemClock;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.inspector.console.CLog;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.stetho.inspector.network:
//			NetworkEventReporter, AsyncPrettyPrinterRegistry, AsyncPrettyPrinterFactory, AsyncPrettyPrinter, 
//			PrettyPrinterDisplayType, ResourceTypeHelper, NetworkPeerManager, ResponseBodyFileManager, 
//			ResponseHandler, DecompressionHelper

public class NetworkEventReporterImpl
	implements NetworkEventReporter
{

	private NetworkEventReporterImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	static AsyncPrettyPrinter createPrettyPrinterForResponse(NetworkEventReporter.InspectorResponse inspectorresponse, AsyncPrettyPrinterRegistry asyncprettyprinterregistry)
	{
		if(asyncprettyprinterregistry != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
		{
			int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_2        
			for(int j = inspectorresponse.headerCount(); i < j; i++)
	//*   4    6:aload_0         
	//*   5    7:invokeinterface #24  <Method int NetworkEventReporter$InspectorResponse.headerCount()>
	//*   6   12:istore_3        
	//*   7   13:iload_2         
	//*   8   14:iload_3         
	//*   9   15:icmpge          65
			{
				AsyncPrettyPrinterFactory asyncprettyprinterfactory = asyncprettyprinterregistry.lookup(inspectorresponse.headerName(i));
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:iload_2         
	//   13   21:invokeinterface #28  <Method String NetworkEventReporter$InspectorResponse.headerName(int)>
	//   14   26:invokevirtual   #34  <Method AsyncPrettyPrinterFactory AsyncPrettyPrinterRegistry.lookup(String)>
	//   15   29:astore          4
				if(asyncprettyprinterfactory != null)
	//*  16   31:aload           4
	//*  17   33:ifnull          58
					return asyncprettyprinterfactory.getInstance(inspectorresponse.headerName(i), inspectorresponse.headerValue(i));
	//   18   36:aload           4
	//   19   38:aload_0         
	//   20   39:iload_2         
	//   21   40:invokeinterface #28  <Method String NetworkEventReporter$InspectorResponse.headerName(int)>
	//   22   45:aload_0         
	//   23   46:iload_2         
	//   24   47:invokeinterface #37  <Method String NetworkEventReporter$InspectorResponse.headerValue(int)>
	//   25   52:invokeinterface #43  <Method AsyncPrettyPrinter AsyncPrettyPrinterFactory.getInstance(String, String)>
	//   26   57:areturn         
			}

	//   27   58:iload_2         
	//   28   59:iconst_1        
	//   29   60:iadd            
	//   30   61:istore_2        
		}
	//*  31   62:goto            13
		return null;
	//   32   65:aconst_null     
	//   33   66:areturn         
	}

	private static com.facebook.stetho.inspector.protocol.module.Page.ResourceType determineResourceType(AsyncPrettyPrinter asyncprettyprinter, String s, ResourceTypeHelper resourcetypehelper)
	{
		if(asyncprettyprinter != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          14
			return asyncprettyprinter.getPrettifiedType().getResourceType();
	//    2    4:aload_0         
	//    3    5:invokeinterface #53  <Method PrettyPrinterDisplayType AsyncPrettyPrinter.getPrettifiedType()>
	//    4   10:invokevirtual   #59  <Method com.facebook.stetho.inspector.protocol.module.Page$ResourceType PrettyPrinterDisplayType.getResourceType()>
	//    5   13:areturn         
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          24
			return resourcetypehelper.determineResourceType(s);
	//    8   18:aload_2         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #64  <Method com.facebook.stetho.inspector.protocol.module.Page$ResourceType ResourceTypeHelper.determineResourceType(String)>
	//   11   23:areturn         
		else
			return com.facebook.stetho.inspector.protocol.module.Page.ResourceType.OTHER;
	//   12   24:getstatic       #70  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.OTHER>
	//   13   27:areturn         
	}

	private static JSONObject formatHeadersAsJSON(NetworkEventReporter.InspectorHeaders inspectorheaders)
	{
		int i;
		JSONObject jsonobject;
		jsonobject = new JSONObject();
	//    0    0:new             #76  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void JSONObject()>
	//    3    7:astore_2        
		i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
_L3:
		if(i >= inspectorheaders.headerCount()) goto _L2; else goto _L1
	//    6   10:iload_1         
	//    7   11:aload_0         
	//    8   12:invokeinterface #80  <Method int NetworkEventReporter$InspectorHeaders.headerCount()>
	//    9   17:icmpge          120
_L1:
		String s;
		String s1;
		s = inspectorheaders.headerName(i);
	//   10   20:aload_0         
	//   11   21:iload_1         
	//   12   22:invokeinterface #81  <Method String NetworkEventReporter$InspectorHeaders.headerName(int)>
	//   13   27:astore_3        
		s1 = inspectorheaders.headerValue(i);
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokeinterface #82  <Method String NetworkEventReporter$InspectorHeaders.headerValue(int)>
	//   17   35:astore          4
		if(jsonobject.has(s))
	//*  18   37:aload_2         
	//*  19   38:aload_3         
	//*  20   39:invokevirtual   #86  <Method boolean JSONObject.has(String)>
	//*  21   42:ifeq            95
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   22   45:new             #88  <Class StringBuilder>
	//   23   48:dup             
	//   24   49:invokespecial   #89  <Method void StringBuilder()>
	//   25   52:astore          5
			stringbuilder.append(jsonobject.getString(s));
	//   26   54:aload           5
	//   27   56:aload_2         
	//   28   57:aload_3         
	//   29   58:invokevirtual   #93  <Method String JSONObject.getString(String)>
	//   30   61:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
			stringbuilder.append("\n");
	//   32   65:aload           5
	//   33   67:ldc1            #99  <String "\n">
	//   34   69:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   35   72:pop             
			stringbuilder.append(s1);
	//   36   73:aload           5
	//   37   75:aload           4
	//   38   77:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   39   80:pop             
			jsonobject.put(s, ((Object) (stringbuilder.toString())));
	//   40   81:aload_2         
	//   41   82:aload_3         
	//   42   83:aload           5
	//   43   85:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   44   88:invokevirtual   #107 <Method JSONObject JSONObject.put(String, Object)>
	//   45   91:pop             
			continue; /* Loop/switch isn't completed */
	//   46   92:goto            103
		}
		try
		{
			jsonobject.put(s, ((Object) (s1)));
	//   47   95:aload_2         
	//   48   96:aload_3         
	//   49   97:aload           4
	//   50   99:invokevirtual   #107 <Method JSONObject JSONObject.put(String, Object)>
	//   51  102:pop             
		}
	//*  52  103:iload_1         
	//*  53  104:iconst_1        
	//*  54  105:iadd            
	//*  55  106:istore_1        
	//*  56  107:goto            10
		// Misplaced declaration of an exception variable
		catch(NetworkEventReporter.InspectorHeaders inspectorheaders)
	//*  57  110:astore_0        
		{
			throw new RuntimeException(((Throwable) (inspectorheaders)));
	//   58  111:new             #109 <Class RuntimeException>
	//   59  114:dup             
	//   60  115:aload_0         
	//   61  116:invokespecial   #112 <Method void RuntimeException(Throwable)>
	//   62  119:athrow          
		}
		i++;
		  goto _L3
_L2:
		return jsonobject;
	//   63  120:aload_2         
	//   64  121:areturn         
	}

	public static NetworkEventReporter get()
	{
		com/facebook/stetho/inspector/network/NetworkEventReporterImpl;
	//    0    0:ldc1            #2   <Class NetworkEventReporterImpl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		NetworkEventReporter networkeventreporter;
		if(sInstance == null)
	//*   2    3:getstatic       #116 <Field NetworkEventReporter sInstance>
	//*   3    6:ifnonnull       19
			sInstance = ((NetworkEventReporter) (new NetworkEventReporterImpl()));
	//    4    9:new             #2   <Class NetworkEventReporterImpl>
	//    5   12:dup             
	//    6   13:invokespecial   #117 <Method void NetworkEventReporterImpl()>
	//    7   16:putstatic       #116 <Field NetworkEventReporter sInstance>
		networkeventreporter = sInstance;
	//    8   19:getstatic       #116 <Field NetworkEventReporter sInstance>
	//    9   22:astore_0        
		com/facebook/stetho/inspector/network/NetworkEventReporterImpl;
	//   10   23:ldc1            #2   <Class NetworkEventReporterImpl>
		JVM INSTR monitorexit ;
	//   11   25:monitorexit     
		return networkeventreporter;
	//   12   26:aload_0         
	//   13   27:areturn         
		Exception exception;
		exception;
	//   14   28:astore_0        
	//*  15   29:ldc1            #2   <Class NetworkEventReporterImpl>
		throw exception;
	//   16   31:monitorexit     
	//   17   32:aload_0         
	//   18   33:athrow          
	}

	private String getContentType(NetworkEventReporter.InspectorHeaders inspectorheaders)
	{
		return inspectorheaders.firstHeaderValue("Content-Type");
	//    0    0:aload_1         
	//    1    1:ldc1            #121 <String "Content-Type">
	//    2    3:invokeinterface #124 <Method String NetworkEventReporter$InspectorHeaders.firstHeaderValue(String)>
	//    3    8:areturn         
	}

	private NetworkPeerManager getPeerManagerIfEnabled()
	{
		NetworkPeerManager networkpeermanager = NetworkPeerManager.getInstanceOrNull();
	//    0    0:invokestatic    #131 <Method NetworkPeerManager NetworkPeerManager.getInstanceOrNull()>
	//    1    3:astore_1        
		if(networkpeermanager != null && networkpeermanager.hasRegisteredPeers())
	//*   2    4:aload_1         
	//*   3    5:ifnull          17
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #135 <Method boolean NetworkPeerManager.hasRegisteredPeers()>
	//*   6   12:ifeq            17
			return networkpeermanager;
	//    7   15:aload_1         
	//    8   16:areturn         
		else
			return null;
	//    9   17:aconst_null     
	//   10   18:areturn         
	}

	private ResourceTypeHelper getResourceTypeHelper()
	{
		if(mResourceTypeHelper == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #140 <Field ResourceTypeHelper mResourceTypeHelper>
	//*   2    4:ifnonnull       18
			mResourceTypeHelper = new ResourceTypeHelper();
	//    3    7:aload_0         
	//    4    8:new             #61  <Class ResourceTypeHelper>
	//    5   11:dup             
	//    6   12:invokespecial   #141 <Method void ResourceTypeHelper()>
	//    7   15:putfield        #140 <Field ResourceTypeHelper mResourceTypeHelper>
		return mResourceTypeHelper;
	//    8   18:aload_0         
	//    9   19:getfield        #140 <Field ResourceTypeHelper mResourceTypeHelper>
	//   10   22:areturn         
	}

	private static AsyncPrettyPrinter initAsyncPrettyPrinterForResponse(NetworkEventReporter.InspectorResponse inspectorresponse, NetworkPeerManager networkpeermanager)
	{
		AsyncPrettyPrinter asyncprettyprinter = createPrettyPrinterForResponse(inspectorresponse, networkpeermanager.getAsyncPrettyPrinterRegistry());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #147 <Method AsyncPrettyPrinterRegistry NetworkPeerManager.getAsyncPrettyPrinterRegistry()>
	//    3    5:invokestatic    #149 <Method AsyncPrettyPrinter createPrettyPrinterForResponse(NetworkEventReporter$InspectorResponse, AsyncPrettyPrinterRegistry)>
	//    4    8:astore_2        
		if(asyncprettyprinter != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          27
			networkpeermanager.getResponseBodyFileManager().associateAsyncPrettyPrinterWithId(inspectorresponse.requestId(), asyncprettyprinter);
	//    7   13:aload_1         
	//    8   14:invokevirtual   #153 <Method ResponseBodyFileManager NetworkPeerManager.getResponseBodyFileManager()>
	//    9   17:aload_0         
	//   10   18:invokeinterface #156 <Method String NetworkEventReporter$InspectorResponse.requestId()>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #162 <Method void ResponseBodyFileManager.associateAsyncPrettyPrinterWithId(String, AsyncPrettyPrinter)>
		return asyncprettyprinter;
	//   13   27:aload_2         
	//   14   28:areturn         
	}

	private void loadingFailed(String s, String s1)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_3        
		if(networkpeermanager != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          59
		{
			com.facebook.stetho.inspector.protocol.module.Network.LoadingFailedParams loadingfailedparams = new com.facebook.stetho.inspector.protocol.module.Network.LoadingFailedParams();
	//    5    9:new             #168 <Class com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams>
	//    6   12:dup             
	//    7   13:invokespecial   #169 <Method void com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams()>
	//    8   16:astore          4
			loadingfailedparams.requestId = s;
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:putfield        #172 <Field String com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.requestId>
			loadingfailedparams.timestamp = (double)stethoNow() / 1000D;
	//   12   24:aload           4
	//   13   26:invokestatic    #176 <Method long stethoNow()>
	//   14   29:l2d             
	//   15   30:ldc2w           #177 <Double 1000D>
	//   16   33:ddiv            
	//   17   34:putfield        #182 <Field double com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.timestamp>
			loadingfailedparams.errorText = s1;
	//   18   37:aload           4
	//   19   39:aload_2         
	//   20   40:putfield        #185 <Field String com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.errorText>
			loadingfailedparams.type = com.facebook.stetho.inspector.protocol.module.Page.ResourceType.OTHER;
	//   21   43:aload           4
	//   22   45:getstatic       #70  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.OTHER>
	//   23   48:putfield        #188 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.type>
			networkpeermanager.sendNotificationToPeers("Network.loadingFailed", ((Object) (loadingfailedparams)));
	//   24   51:aload_3         
	//   25   52:ldc1            #190 <String "Network.loadingFailed">
	//   26   54:aload           4
	//   27   56:invokevirtual   #194 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   28   59:return          
	}

	private void loadingFinished(String s)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_2        
		if(networkpeermanager != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          41
		{
			com.facebook.stetho.inspector.protocol.module.Network.LoadingFinishedParams loadingfinishedparams = new com.facebook.stetho.inspector.protocol.module.Network.LoadingFinishedParams();
	//    5    9:new             #198 <Class com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams>
	//    6   12:dup             
	//    7   13:invokespecial   #199 <Method void com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams()>
	//    8   16:astore_3        
			loadingfinishedparams.requestId = s;
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:putfield        #200 <Field String com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams.requestId>
			loadingfinishedparams.timestamp = (double)stethoNow() / 1000D;
	//   12   22:aload_3         
	//   13   23:invokestatic    #176 <Method long stethoNow()>
	//   14   26:l2d             
	//   15   27:ldc2w           #177 <Double 1000D>
	//   16   30:ddiv            
	//   17   31:putfield        #201 <Field double com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams.timestamp>
			networkpeermanager.sendNotificationToPeers("Network.loadingFinished", ((Object) (loadingfinishedparams)));
	//   18   34:aload_2         
	//   19   35:ldc1            #203 <String "Network.loadingFinished">
	//   20   37:aload_3         
	//   21   38:invokevirtual   #194 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   22   41:return          
	}

	private static String readBodyAsString(NetworkPeerManager networkpeermanager, NetworkEventReporter.InspectorRequest inspectorrequest)
	{
		inspectorrequest = ((NetworkEventReporter.InspectorRequest) (inspectorrequest.body()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #215 <Method byte[] NetworkEventReporter$InspectorRequest.body()>
	//    2    6:astore_1        
		if(inspectorrequest == null)
			break MISSING_BLOCK_LABEL_73;
	//    3    7:aload_1         
	//    4    8:ifnull          73
		inspectorrequest = ((NetworkEventReporter.InspectorRequest) (new String(((byte []) (inspectorrequest)), Utf8Charset.INSTANCE)));
	//    5   11:new             #217 <Class String>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:getstatic       #223 <Field java.nio.charset.Charset Utf8Charset.INSTANCE>
	//    9   19:invokespecial   #226 <Method void String(byte[], java.nio.charset.Charset)>
	//   10   22:astore_1        
		return ((String) (inspectorrequest));
	//   11   23:aload_1         
	//   12   24:areturn         
		inspectorrequest;
	//   13   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   14   26:goto            30
		inspectorrequest;
	//   15   29:astore_1        
		com.facebook.stetho.inspector.protocol.module.Console.MessageLevel messagelevel = com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.WARNING;
	//   16   30:getstatic       #232 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.WARNING>
	//   17   33:astore_2        
		com.facebook.stetho.inspector.protocol.module.Console.MessageSource messagesource = com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK;
	//   18   34:getstatic       #238 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//   19   37:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   20   38:new             #88  <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #89  <Method void StringBuilder()>
	//   23   45:astore          4
		stringbuilder.append("Could not reproduce POST body: ");
	//   24   47:aload           4
	//   25   49:ldc1            #240 <String "Could not reproduce POST body: ">
	//   26   51:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		stringbuilder.append(((Object) (inspectorrequest)));
	//   28   55:aload           4
	//   29   57:aload_1         
	//   30   58:invokevirtual   #243 <Method StringBuilder StringBuilder.append(Object)>
	//   31   61:pop             
		CLog.writeToConsole(((com.facebook.stetho.inspector.helper.ChromePeerManager) (networkpeermanager)), messagelevel, messagesource, stringbuilder.toString());
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:aload           4
	//   36   67:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   37   70:invokestatic    #249 <Method void CLog.writeToConsole(com.facebook.stetho.inspector.helper.ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
		return null;
	//   38   73:aconst_null     
	//   39   74:areturn         
	}

	private static long stethoNow()
	{
		return SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #254 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lreturn         
	}

	public void dataReceived(String s, int i, int j)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore          4
		if(networkpeermanager != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          61
		{
			com.facebook.stetho.inspector.protocol.module.Network.DataReceivedParams datareceivedparams = new com.facebook.stetho.inspector.protocol.module.Network.DataReceivedParams();
	//    5   11:new             #258 <Class com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams>
	//    6   14:dup             
	//    7   15:invokespecial   #259 <Method void com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams()>
	//    8   18:astore          5
			datareceivedparams.requestId = s;
	//    9   20:aload           5
	//   10   22:aload_1         
	//   11   23:putfield        #260 <Field String com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.requestId>
			datareceivedparams.timestamp = (double)stethoNow() / 1000D;
	//   12   26:aload           5
	//   13   28:invokestatic    #176 <Method long stethoNow()>
	//   14   31:l2d             
	//   15   32:ldc2w           #177 <Double 1000D>
	//   16   35:ddiv            
	//   17   36:putfield        #261 <Field double com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.timestamp>
			datareceivedparams.dataLength = i;
	//   18   39:aload           5
	//   19   41:iload_2         
	//   20   42:putfield        #265 <Field int com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.dataLength>
			datareceivedparams.encodedDataLength = j;
	//   21   45:aload           5
	//   22   47:iload_3         
	//   23   48:putfield        #268 <Field int com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.encodedDataLength>
			networkpeermanager.sendNotificationToPeers("Network.dataReceived", ((Object) (datareceivedparams)));
	//   24   51:aload           4
	//   25   53:ldc2            #270 <String "Network.dataReceived">
	//   26   56:aload           5
	//   27   58:invokevirtual   #194 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   28   61:return          
	}

	public void dataSent(String s, int i, int j)
	{
		dataReceived(s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #273 <Method void dataReceived(String, int, int)>
	//    5    7:return          
	}

	public void httpExchangeFailed(String s, String s1)
	{
		loadingFailed(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #276 <Method void loadingFailed(String, String)>
	//    4    6:return          
	}

	public InputStream interpretResponseStream(String s, String s1, String s2, InputStream inputstream, ResponseHandler responsehandler)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore          9
		if(networkpeermanager == null) goto _L2; else goto _L1
	//    3    6:aload           9
	//    4    8:ifnull          139
_L1:
		boolean flag;
		com.facebook.stetho.inspector.protocol.module.Page.ResourceType resourcetype = null;
	//    5   11:aconst_null     
	//    6   12:astore          8
		if(inputstream == null)
	//*   7   14:aload           4
	//*   8   16:ifnonnull       28
		{
			responsehandler.onEOF();
	//    9   19:aload           5
	//   10   21:invokeinterface #283 <Method void ResponseHandler.onEOF()>
			return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
		}
		if(s1 != null)
	//*  13   28:aload_2         
	//*  14   29:ifnull          42
			resourcetype = getResourceTypeHelper().determineResourceType(s1);
	//   15   32:aload_0         
	//   16   33:invokespecial   #285 <Method ResourceTypeHelper getResourceTypeHelper()>
	//   17   36:aload_2         
	//   18   37:invokevirtual   #64  <Method com.facebook.stetho.inspector.protocol.module.Page$ResourceType ResourceTypeHelper.determineResourceType(String)>
	//   19   40:astore          8
		boolean flag1 = false;
	//   20   42:iconst_0        
	//   21   43:istore          7
		flag = flag1;
	//   22   45:iload           7
	//   23   47:istore          6
		if(resourcetype != null)
	//*  24   49:aload           8
	//*  25   51:ifnull          69
		{
			flag = flag1;
	//   26   54:iload           7
	//   27   56:istore          6
			if(resourcetype == com.facebook.stetho.inspector.protocol.module.Page.ResourceType.IMAGE)
	//*  28   58:aload           8
	//*  29   60:getstatic       #288 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.IMAGE>
	//*  30   63:if_acmpne       69
				flag = true;
	//   31   66:iconst_1        
	//   32   67:istore          6
		}
		s1 = ((String) (DecompressionHelper.teeInputWithDecompression(networkpeermanager, s, inputstream, networkpeermanager.getResponseBodyFileManager().openResponseBodyFile(s, flag), s2, responsehandler)));
	//   33   69:aload           9
	//   34   71:aload_1         
	//   35   72:aload           4
	//   36   74:aload           9
	//   37   76:invokevirtual   #153 <Method ResponseBodyFileManager NetworkPeerManager.getResponseBodyFileManager()>
	//   38   79:aload_1         
	//   39   80:iload           6
	//   40   82:invokevirtual   #292 <Method java.io.OutputStream ResponseBodyFileManager.openResponseBodyFile(String, boolean)>
	//   41   85:aload_3         
	//   42   86:aload           5
	//   43   88:invokestatic    #298 <Method InputStream DecompressionHelper.teeInputWithDecompression(NetworkPeerManager, String, InputStream, java.io.OutputStream, String, ResponseHandler)>
	//   44   91:astore_2        
		return ((InputStream) (s1));
	//   45   92:aload_2         
	//   46   93:areturn         
_L4:
		s1 = ((String) (com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.ERROR));
	//   47   94:getstatic       #301 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.ERROR>
	//   48   97:astore_2        
		s2 = ((String) (com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK));
	//   49   98:getstatic       #238 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//   50  101:astore_3        
		responsehandler = ((ResponseHandler) (new StringBuilder()));
	//   51  102:new             #88  <Class StringBuilder>
	//   52  105:dup             
	//   53  106:invokespecial   #89  <Method void StringBuilder()>
	//   54  109:astore          5
		((StringBuilder) (responsehandler)).append("Error writing response body data for request #");
	//   55  111:aload           5
	//   56  113:ldc2            #303 <String "Error writing response body data for request #">
	//   57  116:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   58  119:pop             
		((StringBuilder) (responsehandler)).append(s);
	//   59  120:aload           5
	//   60  122:aload_1         
	//   61  123:invokevirtual   #97  <Method StringBuilder StringBuilder.append(String)>
	//   62  126:pop             
		CLog.writeToConsole(((com.facebook.stetho.inspector.helper.ChromePeerManager) (networkpeermanager)), ((com.facebook.stetho.inspector.protocol.module.Console.MessageLevel) (s1)), ((com.facebook.stetho.inspector.protocol.module.Console.MessageSource) (s2)), ((StringBuilder) (responsehandler)).toString());
	//   63  127:aload           9
	//   64  129:aload_2         
	//   65  130:aload_3         
	//   66  131:aload           5
	//   67  133:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   68  136:invokestatic    #249 <Method void CLog.writeToConsole(com.facebook.stetho.inspector.helper.ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
_L2:
		return inputstream;
	//   69  139:aload           4
	//   70  141:areturn         
		s1;
	//   71  142:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  72  143:goto            94
	}

	public boolean isEnabled()
	{
		return getPeerManagerIfEnabled() != null;
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void requestWillBeSent(NetworkEventReporter.InspectorRequest inspectorrequest)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_3        
		if(networkpeermanager != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          245
		{
			com.facebook.stetho.inspector.protocol.module.Network.Request request = new com.facebook.stetho.inspector.protocol.module.Network.Request();
	//    5    9:new             #308 <Class com.facebook.stetho.inspector.protocol.module.Network$Request>
	//    6   12:dup             
	//    7   13:invokespecial   #309 <Method void com.facebook.stetho.inspector.protocol.module.Network$Request()>
	//    8   16:astore          4
			request.url = inspectorrequest.url();
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:invokeinterface #312 <Method String NetworkEventReporter$InspectorRequest.url()>
	//   12   26:putfield        #314 <Field String com.facebook.stetho.inspector.protocol.module.Network$Request.url>
			request.method = inspectorrequest.method();
	//   13   29:aload           4
	//   14   31:aload_1         
	//   15   32:invokeinterface #317 <Method String NetworkEventReporter$InspectorRequest.method()>
	//   16   37:putfield        #319 <Field String com.facebook.stetho.inspector.protocol.module.Network$Request.method>
			request.headers = formatHeadersAsJSON(((NetworkEventReporter.InspectorHeaders) (inspectorrequest)));
	//   17   40:aload           4
	//   18   42:aload_1         
	//   19   43:invokestatic    #321 <Method JSONObject formatHeadersAsJSON(NetworkEventReporter$InspectorHeaders)>
	//   20   46:putfield        #325 <Field JSONObject com.facebook.stetho.inspector.protocol.module.Network$Request.headers>
			request.postData = readBodyAsString(networkpeermanager, inspectorrequest);
	//   21   49:aload           4
	//   22   51:aload_3         
	//   23   52:aload_1         
	//   24   53:invokestatic    #327 <Method String readBodyAsString(NetworkPeerManager, NetworkEventReporter$InspectorRequest)>
	//   25   56:putfield        #330 <Field String com.facebook.stetho.inspector.protocol.module.Network$Request.postData>
			Object obj = ((Object) (inspectorrequest.friendlyName()));
	//   26   59:aload_1         
	//   27   60:invokeinterface #333 <Method String NetworkEventReporter$InspectorRequest.friendlyName()>
	//   28   65:astore          6
			Integer integer = inspectorrequest.friendlyNameExtra();
	//   29   67:aload_1         
	//   30   68:invokeinterface #337 <Method Integer NetworkEventReporter$InspectorRequest.friendlyNameExtra()>
	//   31   73:astore          7
			com.facebook.stetho.inspector.protocol.module.Network.Initiator initiator = new com.facebook.stetho.inspector.protocol.module.Network.Initiator();
	//   32   75:new             #339 <Class com.facebook.stetho.inspector.protocol.module.Network$Initiator>
	//   33   78:dup             
	//   34   79:invokespecial   #340 <Method void com.facebook.stetho.inspector.protocol.module.Network$Initiator()>
	//   35   82:astore          5
			initiator.type = com.facebook.stetho.inspector.protocol.module.Network.InitiatorType.SCRIPT;
	//   36   84:aload           5
	//   37   86:getstatic       #346 <Field com.facebook.stetho.inspector.protocol.module.Network$InitiatorType com.facebook.stetho.inspector.protocol.module.Network$InitiatorType.SCRIPT>
	//   38   89:putfield        #348 <Field com.facebook.stetho.inspector.protocol.module.Network$InitiatorType com.facebook.stetho.inspector.protocol.module.Network$Initiator.type>
			initiator.stackTrace = ((List) (new ArrayList()));
	//   39   92:aload           5
	//   40   94:new             #350 <Class ArrayList>
	//   41   97:dup             
	//   42   98:invokespecial   #351 <Method void ArrayList()>
	//   43  101:putfield        #355 <Field List com.facebook.stetho.inspector.protocol.module.Network$Initiator.stackTrace>
			List list = initiator.stackTrace;
	//   44  104:aload           5
	//   45  106:getfield        #355 <Field List com.facebook.stetho.inspector.protocol.module.Network$Initiator.stackTrace>
	//   46  109:astore          8
			int i;
			if(integer != null)
	//*  47  111:aload           7
	//*  48  113:ifnull          125
				i = integer.intValue();
	//   49  116:aload           7
	//   50  118:invokevirtual   #360 <Method int Integer.intValue()>
	//   51  121:istore_2        
			else
	//*  52  122:goto            127
				i = 0;
	//   53  125:iconst_0        
	//   54  126:istore_2        
			list.add(((Object) (new com.facebook.stetho.inspector.protocol.module.Console.CallFrame(((String) (obj)), ((String) (obj)), i, 0))));
	//   55  127:aload           8
	//   56  129:new             #362 <Class com.facebook.stetho.inspector.protocol.module.Console$CallFrame>
	//   57  132:dup             
	//   58  133:aload           6
	//   59  135:aload           6
	//   60  137:iload_2         
	//   61  138:iconst_0        
	//   62  139:invokespecial   #365 <Method void com.facebook.stetho.inspector.protocol.module.Console$CallFrame(String, String, int, int)>
	//   63  142:invokeinterface #371 <Method boolean List.add(Object)>
	//   64  147:pop             
			obj = ((Object) (new com.facebook.stetho.inspector.protocol.module.Network.RequestWillBeSentParams()));
	//   65  148:new             #373 <Class com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams>
	//   66  151:dup             
	//   67  152:invokespecial   #374 <Method void com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams()>
	//   68  155:astore          6
			obj.requestId = inspectorrequest.id();
	//   69  157:aload           6
	//   70  159:aload_1         
	//   71  160:invokeinterface #377 <Method String NetworkEventReporter$InspectorRequest.id()>
	//   72  165:putfield        #378 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.requestId>
			obj.frameId = "1";
	//   73  168:aload           6
	//   74  170:ldc2            #380 <String "1">
	//   75  173:putfield        #383 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.frameId>
			obj.loaderId = "1";
	//   76  176:aload           6
	//   77  178:ldc2            #380 <String "1">
	//   78  181:putfield        #386 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.loaderId>
			obj.documentURL = inspectorrequest.url();
	//   79  184:aload           6
	//   80  186:aload_1         
	//   81  187:invokeinterface #312 <Method String NetworkEventReporter$InspectorRequest.url()>
	//   82  192:putfield        #389 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.documentURL>
			obj.request = request;
	//   83  195:aload           6
	//   84  197:aload           4
	//   85  199:putfield        #393 <Field com.facebook.stetho.inspector.protocol.module.Network$Request com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.request>
			obj.timestamp = (double)stethoNow() / 1000D;
	//   86  202:aload           6
	//   87  204:invokestatic    #176 <Method long stethoNow()>
	//   88  207:l2d             
	//   89  208:ldc2w           #177 <Double 1000D>
	//   90  211:ddiv            
	//   91  212:putfield        #394 <Field double com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.timestamp>
			obj.initiator = initiator;
	//   92  215:aload           6
	//   93  217:aload           5
	//   94  219:putfield        #398 <Field com.facebook.stetho.inspector.protocol.module.Network$Initiator com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.initiator>
			obj.redirectResponse = null;
	//   95  222:aload           6
	//   96  224:aconst_null     
	//   97  225:putfield        #402 <Field com.facebook.stetho.inspector.protocol.module.Network$Response com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.redirectResponse>
			obj.type = com.facebook.stetho.inspector.protocol.module.Page.ResourceType.OTHER;
	//   98  228:aload           6
	//   99  230:getstatic       #70  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.OTHER>
	//  100  233:putfield        #403 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.type>
			networkpeermanager.sendNotificationToPeers("Network.requestWillBeSent", obj);
	//  101  236:aload_3         
	//  102  237:ldc2            #405 <String "Network.requestWillBeSent">
	//  103  240:aload           6
	//  104  242:invokevirtual   #194 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//  105  245:return          
	}

	public void responseHeadersReceived(NetworkEventReporter.InspectorResponse inspectorresponse)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #166 <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_3        
		if(networkpeermanager != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          207
		{
			com.facebook.stetho.inspector.protocol.module.Network.Response response = new com.facebook.stetho.inspector.protocol.module.Network.Response();
	//    5    9:new             #409 <Class com.facebook.stetho.inspector.protocol.module.Network$Response>
	//    6   12:dup             
	//    7   13:invokespecial   #410 <Method void com.facebook.stetho.inspector.protocol.module.Network$Response()>
	//    8   16:astore          4
			response.url = inspectorresponse.url();
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:invokeinterface #411 <Method String NetworkEventReporter$InspectorResponse.url()>
	//   12   26:putfield        #412 <Field String com.facebook.stetho.inspector.protocol.module.Network$Response.url>
			response.status = inspectorresponse.statusCode();
	//   13   29:aload           4
	//   14   31:aload_1         
	//   15   32:invokeinterface #415 <Method int NetworkEventReporter$InspectorResponse.statusCode()>
	//   16   37:putfield        #418 <Field int com.facebook.stetho.inspector.protocol.module.Network$Response.status>
			response.statusText = inspectorresponse.reasonPhrase();
	//   17   40:aload           4
	//   18   42:aload_1         
	//   19   43:invokeinterface #421 <Method String NetworkEventReporter$InspectorResponse.reasonPhrase()>
	//   20   48:putfield        #424 <Field String com.facebook.stetho.inspector.protocol.module.Network$Response.statusText>
			response.headers = formatHeadersAsJSON(((NetworkEventReporter.InspectorHeaders) (inspectorresponse)));
	//   21   51:aload           4
	//   22   53:aload_1         
	//   23   54:invokestatic    #321 <Method JSONObject formatHeadersAsJSON(NetworkEventReporter$InspectorHeaders)>
	//   24   57:putfield        #425 <Field JSONObject com.facebook.stetho.inspector.protocol.module.Network$Response.headers>
			String s = getContentType(((NetworkEventReporter.InspectorHeaders) (inspectorresponse)));
	//   25   60:aload_0         
	//   26   61:aload_1         
	//   27   62:invokespecial   #427 <Method String getContentType(NetworkEventReporter$InspectorHeaders)>
	//   28   65:astore          5
			Object obj;
			if(s != null)
	//*  29   67:aload           5
	//*  30   69:ifnull          85
				obj = ((Object) (getResourceTypeHelper().stripContentExtras(s)));
	//   31   72:aload_0         
	//   32   73:invokespecial   #285 <Method ResourceTypeHelper getResourceTypeHelper()>
	//   33   76:aload           5
	//   34   78:invokevirtual   #430 <Method String ResourceTypeHelper.stripContentExtras(String)>
	//   35   81:astore_2        
			else
	//*  36   82:goto            89
				obj = "application/octet-stream";
	//   37   85:ldc2            #432 <String "application/octet-stream">
	//   38   88:astore_2        
			response.mimeType = ((String) (obj));
	//   39   89:aload           4
	//   40   91:aload_2         
	//   41   92:putfield        #435 <Field String com.facebook.stetho.inspector.protocol.module.Network$Response.mimeType>
			response.connectionReused = inspectorresponse.connectionReused();
	//   42   95:aload           4
	//   43   97:aload_1         
	//   44   98:invokeinterface #438 <Method boolean NetworkEventReporter$InspectorResponse.connectionReused()>
	//   45  103:putfield        #441 <Field boolean com.facebook.stetho.inspector.protocol.module.Network$Response.connectionReused>
			response.connectionId = inspectorresponse.connectionId();
	//   46  106:aload           4
	//   47  108:aload_1         
	//   48  109:invokeinterface #444 <Method int NetworkEventReporter$InspectorResponse.connectionId()>
	//   49  114:putfield        #446 <Field int com.facebook.stetho.inspector.protocol.module.Network$Response.connectionId>
			response.fromDiskCache = Boolean.valueOf(inspectorresponse.fromDiskCache());
	//   50  117:aload           4
	//   51  119:aload_1         
	//   52  120:invokeinterface #449 <Method boolean NetworkEventReporter$InspectorResponse.fromDiskCache()>
	//   53  125:invokestatic    #455 <Method Boolean Boolean.valueOf(boolean)>
	//   54  128:putfield        #458 <Field Boolean com.facebook.stetho.inspector.protocol.module.Network$Response.fromDiskCache>
			obj = ((Object) (new com.facebook.stetho.inspector.protocol.module.Network.ResponseReceivedParams()));
	//   55  131:new             #460 <Class com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams>
	//   56  134:dup             
	//   57  135:invokespecial   #461 <Method void com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams()>
	//   58  138:astore_2        
			obj.requestId = inspectorresponse.requestId();
	//   59  139:aload_2         
	//   60  140:aload_1         
	//   61  141:invokeinterface #156 <Method String NetworkEventReporter$InspectorResponse.requestId()>
	//   62  146:putfield        #462 <Field String com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.requestId>
			obj.frameId = "1";
	//   63  149:aload_2         
	//   64  150:ldc2            #380 <String "1">
	//   65  153:putfield        #463 <Field String com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.frameId>
			obj.loaderId = "1";
	//   66  156:aload_2         
	//   67  157:ldc2            #380 <String "1">
	//   68  160:putfield        #464 <Field String com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.loaderId>
			obj.timestamp = (double)stethoNow() / 1000D;
	//   69  163:aload_2         
	//   70  164:invokestatic    #176 <Method long stethoNow()>
	//   71  167:l2d             
	//   72  168:ldc2w           #177 <Double 1000D>
	//   73  171:ddiv            
	//   74  172:putfield        #465 <Field double com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.timestamp>
			obj.response = response;
	//   75  175:aload_2         
	//   76  176:aload           4
	//   77  178:putfield        #468 <Field com.facebook.stetho.inspector.protocol.module.Network$Response com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.response>
			obj.type = determineResourceType(initAsyncPrettyPrinterForResponse(inspectorresponse, networkpeermanager), s, getResourceTypeHelper());
	//   78  181:aload_2         
	//   79  182:aload_1         
	//   80  183:aload_3         
	//   81  184:invokestatic    #470 <Method AsyncPrettyPrinter initAsyncPrettyPrinterForResponse(NetworkEventReporter$InspectorResponse, NetworkPeerManager)>
	//   82  187:aload           5
	//   83  189:aload_0         
	//   84  190:invokespecial   #285 <Method ResourceTypeHelper getResourceTypeHelper()>
	//   85  193:invokestatic    #472 <Method com.facebook.stetho.inspector.protocol.module.Page$ResourceType determineResourceType(AsyncPrettyPrinter, String, ResourceTypeHelper)>
	//   86  196:putfield        #473 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.type>
			networkpeermanager.sendNotificationToPeers("Network.responseReceived", obj);
	//   87  199:aload_3         
	//   88  200:ldc2            #475 <String "Network.responseReceived">
	//   89  203:aload_2         
	//   90  204:invokevirtual   #194 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   91  207:return          
	}

	public void responseReadFailed(String s, String s1)
	{
		loadingFailed(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #276 <Method void loadingFailed(String, String)>
	//    4    6:return          
	}

	public void responseReadFinished(String s)
	{
		loadingFinished(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #479 <Method void loadingFinished(String)>
	//    3    5:return          
	}

	private static NetworkEventReporter sInstance;
	private ResourceTypeHelper mResourceTypeHelper;
}
