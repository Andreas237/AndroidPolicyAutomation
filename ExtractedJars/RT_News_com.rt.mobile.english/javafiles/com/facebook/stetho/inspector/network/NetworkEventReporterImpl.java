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
//			NetworkEventReporter, NetworkPeerManager, ResourceTypeHelper, ResponseHandler, 
//			ResponseBodyFileManager, DecompressionHelper

public class NetworkEventReporterImpl
	implements NetworkEventReporter
{

	private NetworkEventReporterImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	private static JSONObject formatHeadersAsJSON(NetworkEventReporter.InspectorHeaders inspectorheaders)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #22  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void JSONObject()>
	//    3    7:astore_2        
		int i = 0;
	//    4    8:iconst_0        
	//    5    9:istore_1        
		while(i < inspectorheaders.headerCount()) 
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokeinterface #29  <Method int NetworkEventReporter$InspectorHeaders.headerCount()>
	//*   9   17:icmpge          56
		{
			try
			{
				jsonobject.put(inspectorheaders.headerName(i), ((Object) (inspectorheaders.headerValue(i))));
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:invokeinterface #33  <Method String NetworkEventReporter$InspectorHeaders.headerName(int)>
	//   14   28:aload_0         
	//   15   29:iload_1         
	//   16   30:invokeinterface #36  <Method String NetworkEventReporter$InspectorHeaders.headerValue(int)>
	//   17   35:invokevirtual   #40  <Method JSONObject JSONObject.put(String, Object)>
	//   18   38:pop             
			}
	//*  19   39:iload_1         
	//*  20   40:iconst_1        
	//*  21   41:iadd            
	//*  22   42:istore_1        
	//*  23   43:goto            10
			// Misplaced declaration of an exception variable
			catch(NetworkEventReporter.InspectorHeaders inspectorheaders)
	//*  24   46:astore_0        
			{
				throw new RuntimeException(((Throwable) (inspectorheaders)));
	//   25   47:new             #42  <Class RuntimeException>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:invokespecial   #45  <Method void RuntimeException(Throwable)>
	//   29   55:athrow          
			}
			i++;
		}
		return jsonobject;
	//   30   56:aload_2         
	//   31   57:areturn         
	}

	public static NetworkEventReporter get()
	{
		com/facebook/stetho/inspector/network/NetworkEventReporterImpl;
	//    0    0:ldc1            #2   <Class NetworkEventReporterImpl>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		NetworkEventReporter networkeventreporter;
		if(sInstance == null)
	//*   2    3:getstatic       #49  <Field NetworkEventReporter sInstance>
	//*   3    6:ifnonnull       19
			sInstance = ((NetworkEventReporter) (new NetworkEventReporterImpl()));
	//    4    9:new             #2   <Class NetworkEventReporterImpl>
	//    5   12:dup             
	//    6   13:invokespecial   #50  <Method void NetworkEventReporterImpl()>
	//    7   16:putstatic       #49  <Field NetworkEventReporter sInstance>
		networkeventreporter = sInstance;
	//    8   19:getstatic       #49  <Field NetworkEventReporter sInstance>
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
	//    1    1:ldc1            #54  <String "Content-Type">
	//    2    3:invokeinterface #58  <Method String NetworkEventReporter$InspectorHeaders.firstHeaderValue(String)>
	//    3    8:areturn         
	}

	private NetworkPeerManager getPeerManagerIfEnabled()
	{
		NetworkPeerManager networkpeermanager = NetworkPeerManager.getInstanceOrNull();
	//    0    0:invokestatic    #66  <Method NetworkPeerManager NetworkPeerManager.getInstanceOrNull()>
	//    1    3:astore_1        
		if(networkpeermanager != null && networkpeermanager.hasRegisteredPeers())
	//*   2    4:aload_1         
	//*   3    5:ifnull          17
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #70  <Method boolean NetworkPeerManager.hasRegisteredPeers()>
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
	//*   1    1:getfield        #75  <Field ResourceTypeHelper mResourceTypeHelper>
	//*   2    4:ifnonnull       18
			mResourceTypeHelper = new ResourceTypeHelper();
	//    3    7:aload_0         
	//    4    8:new             #77  <Class ResourceTypeHelper>
	//    5   11:dup             
	//    6   12:invokespecial   #78  <Method void ResourceTypeHelper()>
	//    7   15:putfield        #75  <Field ResourceTypeHelper mResourceTypeHelper>
		return mResourceTypeHelper;
	//    8   18:aload_0         
	//    9   19:getfield        #75  <Field ResourceTypeHelper mResourceTypeHelper>
	//   10   22:areturn         
	}

	private void loadingFailed(String s, String s1)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_3        
		if(networkpeermanager != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          59
		{
			com.facebook.stetho.inspector.protocol.module.Network.LoadingFailedParams loadingfailedparams = new com.facebook.stetho.inspector.protocol.module.Network.LoadingFailedParams();
	//    5    9:new             #84  <Class com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams>
	//    6   12:dup             
	//    7   13:invokespecial   #85  <Method void com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams()>
	//    8   16:astore          4
			loadingfailedparams.requestId = s;
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:putfield        #89  <Field String com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.requestId>
			loadingfailedparams.timestamp = (double)stethoNow() / 1000D;
	//   12   24:aload           4
	//   13   26:invokestatic    #93  <Method long stethoNow()>
	//   14   29:l2d             
	//   15   30:ldc2w           #94  <Double 1000D>
	//   16   33:ddiv            
	//   17   34:putfield        #99  <Field double com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.timestamp>
			loadingfailedparams.errorText = s1;
	//   18   37:aload           4
	//   19   39:aload_2         
	//   20   40:putfield        #102 <Field String com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.errorText>
			loadingfailedparams.type = com.facebook.stetho.inspector.protocol.module.Page.ResourceType.OTHER;
	//   21   43:aload           4
	//   22   45:getstatic       #108 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.OTHER>
	//   23   48:putfield        #111 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Network$LoadingFailedParams.type>
			networkpeermanager.sendNotificationToPeers("Network.loadingFailed", ((Object) (loadingfailedparams)));
	//   24   51:aload_3         
	//   25   52:ldc1            #113 <String "Network.loadingFailed">
	//   26   54:aload           4
	//   27   56:invokevirtual   #117 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   28   59:return          
	}

	private void loadingFinished(String s)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_2        
		if(networkpeermanager != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          41
		{
			com.facebook.stetho.inspector.protocol.module.Network.LoadingFinishedParams loadingfinishedparams = new com.facebook.stetho.inspector.protocol.module.Network.LoadingFinishedParams();
	//    5    9:new             #121 <Class com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams>
	//    6   12:dup             
	//    7   13:invokespecial   #122 <Method void com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams()>
	//    8   16:astore_3        
			loadingfinishedparams.requestId = s;
	//    9   17:aload_3         
	//   10   18:aload_1         
	//   11   19:putfield        #123 <Field String com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams.requestId>
			loadingfinishedparams.timestamp = (double)stethoNow() / 1000D;
	//   12   22:aload_3         
	//   13   23:invokestatic    #93  <Method long stethoNow()>
	//   14   26:l2d             
	//   15   27:ldc2w           #94  <Double 1000D>
	//   16   30:ddiv            
	//   17   31:putfield        #124 <Field double com.facebook.stetho.inspector.protocol.module.Network$LoadingFinishedParams.timestamp>
			networkpeermanager.sendNotificationToPeers("Network.loadingFinished", ((Object) (loadingfinishedparams)));
	//   18   34:aload_2         
	//   19   35:ldc1            #126 <String "Network.loadingFinished">
	//   20   37:aload_3         
	//   21   38:invokevirtual   #117 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   22   41:return          
	}

	private static String readBodyAsString(NetworkPeerManager networkpeermanager, NetworkEventReporter.InspectorRequest inspectorrequest)
	{
		inspectorrequest = ((NetworkEventReporter.InspectorRequest) (inspectorrequest.body()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #136 <Method byte[] NetworkEventReporter$InspectorRequest.body()>
	//    2    6:astore_1        
		if(inspectorrequest == null)
			break MISSING_BLOCK_LABEL_69;
	//    3    7:aload_1         
	//    4    8:ifnull          69
		inspectorrequest = ((NetworkEventReporter.InspectorRequest) (new String(((byte []) (inspectorrequest)), Utf8Charset.INSTANCE)));
	//    5   11:new             #138 <Class String>
	//    6   14:dup             
	//    7   15:aload_1         
	//    8   16:getstatic       #144 <Field java.nio.charset.Charset Utf8Charset.INSTANCE>
	//    9   19:invokespecial   #147 <Method void String(byte[], java.nio.charset.Charset)>
	//   10   22:astore_1        
		return ((String) (inspectorrequest));
	//   11   23:aload_1         
	//   12   24:areturn         
		inspectorrequest;
	//   13   25:astore_1        
		com.facebook.stetho.inspector.protocol.module.Console.MessageLevel messagelevel = com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.WARNING;
	//   14   26:getstatic       #153 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.WARNING>
	//   15   29:astore_2        
		com.facebook.stetho.inspector.protocol.module.Console.MessageSource messagesource = com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK;
	//   16   30:getstatic       #159 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//   17   33:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   18   34:new             #161 <Class StringBuilder>
	//   19   37:dup             
	//   20   38:invokespecial   #162 <Method void StringBuilder()>
	//   21   41:astore          4
		stringbuilder.append("Could not reproduce POST body: ");
	//   22   43:aload           4
	//   23   45:ldc1            #164 <String "Could not reproduce POST body: ">
	//   24   47:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   25   50:pop             
		stringbuilder.append(((Object) (inspectorrequest)));
	//   26   51:aload           4
	//   27   53:aload_1         
	//   28   54:invokevirtual   #171 <Method StringBuilder StringBuilder.append(Object)>
	//   29   57:pop             
		CLog.writeToConsole(((com.facebook.stetho.inspector.helper.ChromePeerManager) (networkpeermanager)), messagelevel, messagesource, stringbuilder.toString());
	//   30   58:aload_0         
	//   31   59:aload_2         
	//   32   60:aload_3         
	//   33   61:aload           4
	//   34   63:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   35   66:invokestatic    #181 <Method void CLog.writeToConsole(com.facebook.stetho.inspector.helper.ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
		return null;
	//   36   69:aconst_null     
	//   37   70:areturn         
	}

	private static long stethoNow()
	{
		return SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #186 <Method long SystemClock.elapsedRealtime()>
	//    1    3:lreturn         
	}

	public void dataReceived(String s, int i, int j)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore          4
		if(networkpeermanager != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          60
		{
			com.facebook.stetho.inspector.protocol.module.Network.DataReceivedParams datareceivedparams = new com.facebook.stetho.inspector.protocol.module.Network.DataReceivedParams();
	//    5   11:new             #190 <Class com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams>
	//    6   14:dup             
	//    7   15:invokespecial   #191 <Method void com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams()>
	//    8   18:astore          5
			datareceivedparams.requestId = s;
	//    9   20:aload           5
	//   10   22:aload_1         
	//   11   23:putfield        #192 <Field String com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.requestId>
			datareceivedparams.timestamp = (double)stethoNow() / 1000D;
	//   12   26:aload           5
	//   13   28:invokestatic    #93  <Method long stethoNow()>
	//   14   31:l2d             
	//   15   32:ldc2w           #94  <Double 1000D>
	//   16   35:ddiv            
	//   17   36:putfield        #193 <Field double com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.timestamp>
			datareceivedparams.dataLength = i;
	//   18   39:aload           5
	//   19   41:iload_2         
	//   20   42:putfield        #197 <Field int com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.dataLength>
			datareceivedparams.encodedDataLength = j;
	//   21   45:aload           5
	//   22   47:iload_3         
	//   23   48:putfield        #200 <Field int com.facebook.stetho.inspector.protocol.module.Network$DataReceivedParams.encodedDataLength>
			networkpeermanager.sendNotificationToPeers("Network.dataReceived", ((Object) (datareceivedparams)));
	//   24   51:aload           4
	//   25   53:ldc1            #202 <String "Network.dataReceived">
	//   26   55:aload           5
	//   27   57:invokevirtual   #117 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   28   60:return          
	}

	public void dataSent(String s, int i, int j)
	{
		dataReceived(s, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #205 <Method void dataReceived(String, int, int)>
	//    5    7:return          
	}

	public void httpExchangeFailed(String s, String s1)
	{
		loadingFailed(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #208 <Method void loadingFailed(String, String)>
	//    4    6:return          
	}

	public InputStream interpretResponseStream(String s, String s1, String s2, InputStream inputstream, ResponseHandler responsehandler)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore          9
		if(networkpeermanager == null) goto _L2; else goto _L1
	//    3    6:aload           9
	//    4    8:ifnull          138
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
	//   10   21:invokeinterface #215 <Method void ResponseHandler.onEOF()>
			return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
		}
		if(s1 != null)
	//*  13   28:aload_2         
	//*  14   29:ifnull          42
			resourcetype = getResourceTypeHelper().determineResourceType(s1);
	//   15   32:aload_0         
	//   16   33:invokespecial   #217 <Method ResourceTypeHelper getResourceTypeHelper()>
	//   17   36:aload_2         
	//   18   37:invokevirtual   #221 <Method com.facebook.stetho.inspector.protocol.module.Page$ResourceType ResourceTypeHelper.determineResourceType(String)>
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
	//*  29   60:getstatic       #224 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.IMAGE>
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
	//   37   76:invokevirtual   #228 <Method ResponseBodyFileManager NetworkPeerManager.getResponseBodyFileManager()>
	//   38   79:aload_1         
	//   39   80:iload           6
	//   40   82:invokevirtual   #234 <Method java.io.OutputStream ResponseBodyFileManager.openResponseBodyFile(String, boolean)>
	//   41   85:aload_3         
	//   42   86:aload           5
	//   43   88:invokestatic    #240 <Method InputStream DecompressionHelper.teeInputWithDecompression(NetworkPeerManager, String, InputStream, java.io.OutputStream, String, ResponseHandler)>
	//   44   91:astore_2        
		return ((InputStream) (s1));
	//   45   92:aload_2         
	//   46   93:areturn         
_L4:
		s1 = ((String) (com.facebook.stetho.inspector.protocol.module.Console.MessageLevel.ERROR));
	//   47   94:getstatic       #243 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageLevel com.facebook.stetho.inspector.protocol.module.Console$MessageLevel.ERROR>
	//   48   97:astore_2        
		s2 = ((String) (com.facebook.stetho.inspector.protocol.module.Console.MessageSource.NETWORK));
	//   49   98:getstatic       #159 <Field com.facebook.stetho.inspector.protocol.module.Console$MessageSource com.facebook.stetho.inspector.protocol.module.Console$MessageSource.NETWORK>
	//   50  101:astore_3        
		responsehandler = ((ResponseHandler) (new StringBuilder()));
	//   51  102:new             #161 <Class StringBuilder>
	//   52  105:dup             
	//   53  106:invokespecial   #162 <Method void StringBuilder()>
	//   54  109:astore          5
		((StringBuilder) (responsehandler)).append("Error writing response body data for request #");
	//   55  111:aload           5
	//   56  113:ldc1            #245 <String "Error writing response body data for request #">
	//   57  115:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   58  118:pop             
		((StringBuilder) (responsehandler)).append(s);
	//   59  119:aload           5
	//   60  121:aload_1         
	//   61  122:invokevirtual   #168 <Method StringBuilder StringBuilder.append(String)>
	//   62  125:pop             
		CLog.writeToConsole(((com.facebook.stetho.inspector.helper.ChromePeerManager) (networkpeermanager)), ((com.facebook.stetho.inspector.protocol.module.Console.MessageLevel) (s1)), ((com.facebook.stetho.inspector.protocol.module.Console.MessageSource) (s2)), ((StringBuilder) (responsehandler)).toString());
	//   63  126:aload           9
	//   64  128:aload_2         
	//   65  129:aload_3         
	//   66  130:aload           5
	//   67  132:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   68  135:invokestatic    #181 <Method void CLog.writeToConsole(com.facebook.stetho.inspector.helper.ChromePeerManager, com.facebook.stetho.inspector.protocol.module.Console$MessageLevel, com.facebook.stetho.inspector.protocol.module.Console$MessageSource, String)>
_L2:
		return inputstream;
	//   69  138:aload           4
	//   70  140:areturn         
		s1;
	//   71  141:astore_2        
		if(true) goto _L4; else goto _L3
_L3:
	//*  72  142:goto            94
	}

	public boolean isEnabled()
	{
		return getPeerManagerIfEnabled() != null;
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method NetworkPeerManager getPeerManagerIfEnabled()>
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
	//    1    1:invokespecial   #82  <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_3        
		if(networkpeermanager != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          245
		{
			com.facebook.stetho.inspector.protocol.module.Network.Request request = new com.facebook.stetho.inspector.protocol.module.Network.Request();
	//    5    9:new             #251 <Class com.facebook.stetho.inspector.protocol.module.Network$Request>
	//    6   12:dup             
	//    7   13:invokespecial   #252 <Method void com.facebook.stetho.inspector.protocol.module.Network$Request()>
	//    8   16:astore          4
			request.url = inspectorrequest.url();
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:invokeinterface #255 <Method String NetworkEventReporter$InspectorRequest.url()>
	//   12   26:putfield        #257 <Field String com.facebook.stetho.inspector.protocol.module.Network$Request.url>
			request.method = inspectorrequest.method();
	//   13   29:aload           4
	//   14   31:aload_1         
	//   15   32:invokeinterface #260 <Method String NetworkEventReporter$InspectorRequest.method()>
	//   16   37:putfield        #262 <Field String com.facebook.stetho.inspector.protocol.module.Network$Request.method>
			request.headers = formatHeadersAsJSON(((NetworkEventReporter.InspectorHeaders) (inspectorrequest)));
	//   17   40:aload           4
	//   18   42:aload_1         
	//   19   43:invokestatic    #264 <Method JSONObject formatHeadersAsJSON(NetworkEventReporter$InspectorHeaders)>
	//   20   46:putfield        #268 <Field JSONObject com.facebook.stetho.inspector.protocol.module.Network$Request.headers>
			request.postData = readBodyAsString(networkpeermanager, inspectorrequest);
	//   21   49:aload           4
	//   22   51:aload_3         
	//   23   52:aload_1         
	//   24   53:invokestatic    #270 <Method String readBodyAsString(NetworkPeerManager, NetworkEventReporter$InspectorRequest)>
	//   25   56:putfield        #273 <Field String com.facebook.stetho.inspector.protocol.module.Network$Request.postData>
			Object obj = ((Object) (inspectorrequest.friendlyName()));
	//   26   59:aload_1         
	//   27   60:invokeinterface #276 <Method String NetworkEventReporter$InspectorRequest.friendlyName()>
	//   28   65:astore          6
			Integer integer = inspectorrequest.friendlyNameExtra();
	//   29   67:aload_1         
	//   30   68:invokeinterface #280 <Method Integer NetworkEventReporter$InspectorRequest.friendlyNameExtra()>
	//   31   73:astore          7
			com.facebook.stetho.inspector.protocol.module.Network.Initiator initiator = new com.facebook.stetho.inspector.protocol.module.Network.Initiator();
	//   32   75:new             #282 <Class com.facebook.stetho.inspector.protocol.module.Network$Initiator>
	//   33   78:dup             
	//   34   79:invokespecial   #283 <Method void com.facebook.stetho.inspector.protocol.module.Network$Initiator()>
	//   35   82:astore          5
			initiator.type = com.facebook.stetho.inspector.protocol.module.Network.InitiatorType.SCRIPT;
	//   36   84:aload           5
	//   37   86:getstatic       #289 <Field com.facebook.stetho.inspector.protocol.module.Network$InitiatorType com.facebook.stetho.inspector.protocol.module.Network$InitiatorType.SCRIPT>
	//   38   89:putfield        #291 <Field com.facebook.stetho.inspector.protocol.module.Network$InitiatorType com.facebook.stetho.inspector.protocol.module.Network$Initiator.type>
			initiator.stackTrace = ((List) (new ArrayList()));
	//   39   92:aload           5
	//   40   94:new             #293 <Class ArrayList>
	//   41   97:dup             
	//   42   98:invokespecial   #294 <Method void ArrayList()>
	//   43  101:putfield        #298 <Field List com.facebook.stetho.inspector.protocol.module.Network$Initiator.stackTrace>
			List list = initiator.stackTrace;
	//   44  104:aload           5
	//   45  106:getfield        #298 <Field List com.facebook.stetho.inspector.protocol.module.Network$Initiator.stackTrace>
	//   46  109:astore          8
			int i;
			if(integer != null)
	//*  47  111:aload           7
	//*  48  113:ifnull          125
				i = integer.intValue();
	//   49  116:aload           7
	//   50  118:invokevirtual   #303 <Method int Integer.intValue()>
	//   51  121:istore_2        
			else
	//*  52  122:goto            127
				i = 0;
	//   53  125:iconst_0        
	//   54  126:istore_2        
			list.add(((Object) (new com.facebook.stetho.inspector.protocol.module.Console.CallFrame(((String) (obj)), ((String) (obj)), i, 0))));
	//   55  127:aload           8
	//   56  129:new             #305 <Class com.facebook.stetho.inspector.protocol.module.Console$CallFrame>
	//   57  132:dup             
	//   58  133:aload           6
	//   59  135:aload           6
	//   60  137:iload_2         
	//   61  138:iconst_0        
	//   62  139:invokespecial   #308 <Method void com.facebook.stetho.inspector.protocol.module.Console$CallFrame(String, String, int, int)>
	//   63  142:invokeinterface #314 <Method boolean List.add(Object)>
	//   64  147:pop             
			obj = ((Object) (new com.facebook.stetho.inspector.protocol.module.Network.RequestWillBeSentParams()));
	//   65  148:new             #316 <Class com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams>
	//   66  151:dup             
	//   67  152:invokespecial   #317 <Method void com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams()>
	//   68  155:astore          6
			obj.requestId = inspectorrequest.id();
	//   69  157:aload           6
	//   70  159:aload_1         
	//   71  160:invokeinterface #320 <Method String NetworkEventReporter$InspectorRequest.id()>
	//   72  165:putfield        #321 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.requestId>
			obj.frameId = "1";
	//   73  168:aload           6
	//   74  170:ldc2            #323 <String "1">
	//   75  173:putfield        #326 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.frameId>
			obj.loaderId = "1";
	//   76  176:aload           6
	//   77  178:ldc2            #323 <String "1">
	//   78  181:putfield        #329 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.loaderId>
			obj.documentURL = inspectorrequest.url();
	//   79  184:aload           6
	//   80  186:aload_1         
	//   81  187:invokeinterface #255 <Method String NetworkEventReporter$InspectorRequest.url()>
	//   82  192:putfield        #332 <Field String com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.documentURL>
			obj.request = request;
	//   83  195:aload           6
	//   84  197:aload           4
	//   85  199:putfield        #336 <Field com.facebook.stetho.inspector.protocol.module.Network$Request com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.request>
			obj.timestamp = (double)stethoNow() / 1000D;
	//   86  202:aload           6
	//   87  204:invokestatic    #93  <Method long stethoNow()>
	//   88  207:l2d             
	//   89  208:ldc2w           #94  <Double 1000D>
	//   90  211:ddiv            
	//   91  212:putfield        #337 <Field double com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.timestamp>
			obj.initiator = initiator;
	//   92  215:aload           6
	//   93  217:aload           5
	//   94  219:putfield        #341 <Field com.facebook.stetho.inspector.protocol.module.Network$Initiator com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.initiator>
			obj.redirectResponse = null;
	//   95  222:aload           6
	//   96  224:aconst_null     
	//   97  225:putfield        #345 <Field com.facebook.stetho.inspector.protocol.module.Network$Response com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.redirectResponse>
			obj.type = com.facebook.stetho.inspector.protocol.module.Page.ResourceType.OTHER;
	//   98  228:aload           6
	//   99  230:getstatic       #108 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.OTHER>
	//  100  233:putfield        #346 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Network$RequestWillBeSentParams.type>
			networkpeermanager.sendNotificationToPeers("Network.requestWillBeSent", obj);
	//  101  236:aload_3         
	//  102  237:ldc2            #348 <String "Network.requestWillBeSent">
	//  103  240:aload           6
	//  104  242:invokevirtual   #117 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//  105  245:return          
	}

	public void responseHeadersReceived(NetworkEventReporter.InspectorResponse inspectorresponse)
	{
		NetworkPeerManager networkpeermanager = getPeerManagerIfEnabled();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method NetworkPeerManager getPeerManagerIfEnabled()>
	//    2    4:astore_3        
		if(networkpeermanager != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          216
		{
			com.facebook.stetho.inspector.protocol.module.Network.Response response = new com.facebook.stetho.inspector.protocol.module.Network.Response();
	//    5    9:new             #352 <Class com.facebook.stetho.inspector.protocol.module.Network$Response>
	//    6   12:dup             
	//    7   13:invokespecial   #353 <Method void com.facebook.stetho.inspector.protocol.module.Network$Response()>
	//    8   16:astore          4
			response.url = inspectorresponse.url();
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:invokeinterface #356 <Method String NetworkEventReporter$InspectorResponse.url()>
	//   12   26:putfield        #357 <Field String com.facebook.stetho.inspector.protocol.module.Network$Response.url>
			response.status = inspectorresponse.statusCode();
	//   13   29:aload           4
	//   14   31:aload_1         
	//   15   32:invokeinterface #360 <Method int NetworkEventReporter$InspectorResponse.statusCode()>
	//   16   37:putfield        #363 <Field int com.facebook.stetho.inspector.protocol.module.Network$Response.status>
			response.statusText = inspectorresponse.reasonPhrase();
	//   17   40:aload           4
	//   18   42:aload_1         
	//   19   43:invokeinterface #366 <Method String NetworkEventReporter$InspectorResponse.reasonPhrase()>
	//   20   48:putfield        #369 <Field String com.facebook.stetho.inspector.protocol.module.Network$Response.statusText>
			response.headers = formatHeadersAsJSON(((NetworkEventReporter.InspectorHeaders) (inspectorresponse)));
	//   21   51:aload           4
	//   22   53:aload_1         
	//   23   54:invokestatic    #264 <Method JSONObject formatHeadersAsJSON(NetworkEventReporter$InspectorHeaders)>
	//   24   57:putfield        #370 <Field JSONObject com.facebook.stetho.inspector.protocol.module.Network$Response.headers>
			String s = getContentType(((NetworkEventReporter.InspectorHeaders) (inspectorresponse)));
	//   25   60:aload_0         
	//   26   61:aload_1         
	//   27   62:invokespecial   #372 <Method String getContentType(NetworkEventReporter$InspectorHeaders)>
	//   28   65:astore          5
			Object obj;
			if(s != null)
	//*  29   67:aload           5
	//*  30   69:ifnull          85
				obj = ((Object) (getResourceTypeHelper().stripContentExtras(s)));
	//   31   72:aload_0         
	//   32   73:invokespecial   #217 <Method ResourceTypeHelper getResourceTypeHelper()>
	//   33   76:aload           5
	//   34   78:invokevirtual   #375 <Method String ResourceTypeHelper.stripContentExtras(String)>
	//   35   81:astore_2        
			else
	//*  36   82:goto            89
				obj = "application/octet-stream";
	//   37   85:ldc2            #377 <String "application/octet-stream">
	//   38   88:astore_2        
			response.mimeType = ((String) (obj));
	//   39   89:aload           4
	//   40   91:aload_2         
	//   41   92:putfield        #380 <Field String com.facebook.stetho.inspector.protocol.module.Network$Response.mimeType>
			response.connectionReused = inspectorresponse.connectionReused();
	//   42   95:aload           4
	//   43   97:aload_1         
	//   44   98:invokeinterface #383 <Method boolean NetworkEventReporter$InspectorResponse.connectionReused()>
	//   45  103:putfield        #386 <Field boolean com.facebook.stetho.inspector.protocol.module.Network$Response.connectionReused>
			response.connectionId = inspectorresponse.connectionId();
	//   46  106:aload           4
	//   47  108:aload_1         
	//   48  109:invokeinterface #389 <Method int NetworkEventReporter$InspectorResponse.connectionId()>
	//   49  114:putfield        #391 <Field int com.facebook.stetho.inspector.protocol.module.Network$Response.connectionId>
			response.fromDiskCache = Boolean.valueOf(inspectorresponse.fromDiskCache());
	//   50  117:aload           4
	//   51  119:aload_1         
	//   52  120:invokeinterface #394 <Method boolean NetworkEventReporter$InspectorResponse.fromDiskCache()>
	//   53  125:invokestatic    #400 <Method Boolean Boolean.valueOf(boolean)>
	//   54  128:putfield        #403 <Field Boolean com.facebook.stetho.inspector.protocol.module.Network$Response.fromDiskCache>
			obj = ((Object) (new com.facebook.stetho.inspector.protocol.module.Network.ResponseReceivedParams()));
	//   55  131:new             #405 <Class com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams>
	//   56  134:dup             
	//   57  135:invokespecial   #406 <Method void com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams()>
	//   58  138:astore_2        
			obj.requestId = inspectorresponse.requestId();
	//   59  139:aload_2         
	//   60  140:aload_1         
	//   61  141:invokeinterface #408 <Method String NetworkEventReporter$InspectorResponse.requestId()>
	//   62  146:putfield        #409 <Field String com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.requestId>
			obj.frameId = "1";
	//   63  149:aload_2         
	//   64  150:ldc2            #323 <String "1">
	//   65  153:putfield        #410 <Field String com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.frameId>
			obj.loaderId = "1";
	//   66  156:aload_2         
	//   67  157:ldc2            #323 <String "1">
	//   68  160:putfield        #411 <Field String com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.loaderId>
			obj.timestamp = (double)stethoNow() / 1000D;
	//   69  163:aload_2         
	//   70  164:invokestatic    #93  <Method long stethoNow()>
	//   71  167:l2d             
	//   72  168:ldc2w           #94  <Double 1000D>
	//   73  171:ddiv            
	//   74  172:putfield        #412 <Field double com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.timestamp>
			if(s != null)
	//*  75  175:aload           5
	//*  76  177:ifnull          193
				inspectorresponse = ((NetworkEventReporter.InspectorResponse) (getResourceTypeHelper().determineResourceType(s)));
	//   77  180:aload_0         
	//   78  181:invokespecial   #217 <Method ResourceTypeHelper getResourceTypeHelper()>
	//   79  184:aload           5
	//   80  186:invokevirtual   #221 <Method com.facebook.stetho.inspector.protocol.module.Page$ResourceType ResourceTypeHelper.determineResourceType(String)>
	//   81  189:astore_1        
			else
	//*  82  190:goto            197
				inspectorresponse = ((NetworkEventReporter.InspectorResponse) (com.facebook.stetho.inspector.protocol.module.Page.ResourceType.OTHER));
	//   83  193:getstatic       #108 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.OTHER>
	//   84  196:astore_1        
			obj.type = ((com.facebook.stetho.inspector.protocol.module.Page.ResourceType) (inspectorresponse));
	//   85  197:aload_2         
	//   86  198:aload_1         
	//   87  199:putfield        #413 <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.type>
			obj.response = response;
	//   88  202:aload_2         
	//   89  203:aload           4
	//   90  205:putfield        #416 <Field com.facebook.stetho.inspector.protocol.module.Network$Response com.facebook.stetho.inspector.protocol.module.Network$ResponseReceivedParams.response>
			networkpeermanager.sendNotificationToPeers("Network.responseReceived", obj);
	//   91  208:aload_3         
	//   92  209:ldc2            #418 <String "Network.responseReceived">
	//   93  212:aload_2         
	//   94  213:invokevirtual   #117 <Method void NetworkPeerManager.sendNotificationToPeers(String, Object)>
		}
	//   95  216:return          
	}

	public void responseReadFailed(String s, String s1)
	{
		loadingFailed(s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #208 <Method void loadingFailed(String, String)>
	//    4    6:return          
	}

	public void responseReadFinished(String s)
	{
		loadingFinished(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #422 <Method void loadingFinished(String)>
	//    3    5:return          
	}

	private static NetworkEventReporter sInstance;
	private ResourceTypeHelper mResourceTypeHelper;
}
