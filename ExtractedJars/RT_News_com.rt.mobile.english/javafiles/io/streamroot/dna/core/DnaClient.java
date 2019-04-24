// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.streamroot.dna.core;

import android.content.Context;
import android.net.Uri;
import io.streamroot.dna.core.analytics.AnalyticsService;
import io.streamroot.dna.core.context.DnaContext;
import io.streamroot.dna.core.context.DnaContextFactory;
import io.streamroot.dna.core.context.config.Media;
import io.streamroot.dna.core.context.config.SessionInformation;
import io.streamroot.dna.core.log.LogLevel;
import io.streamroot.dna.core.log.Logger;
import io.streamroot.dna.core.transfer.DnaBehaviourService;
import io.streamroot.dna.core.utils.RelinkerLibraryLoader;
import java.lang.annotation.Annotation;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.webrtc.NativeLibraryLoader;
import org.webrtc.PeerConnectionFactory;

// Referenced classes of package io.streamroot.dna.core:
//			State, InformationCallback, PlayerInteractor, QosModule, 
//			BandwidthListener, DnaClientBuilder

public final class DnaClient
	implements AutoCloseable
{
	public static interface Experimental
		extends Annotation
	{
	}


	private DnaClient(HttpUrl httpurl, HttpUrl httpurl1, String s, int i, String s1, String s2, long l, LogLevel loglevel, Context context, PlayerInteractor playerinteractor, QosModule qosmodule, BandwidthListener bandwidthlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #124 <Method void Object()>
		originalManifestUrl = httpurl;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #126 <Field HttpUrl originalManifestUrl>
		backendHttpUrl = httpurl1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #128 <Field HttpUrl backendHttpUrl>
		streamrootKey = s;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #130 <Field String streamrootKey>
		latency = i;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #132 <Field int latency>
		contentId = s1;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #134 <Field String contentId>
		property = s2;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #136 <Field String property>
		Logger.INSTANCE.setLOG_LEVEL(loglevel);
	//   20   37:getstatic       #142 <Field Logger Logger.INSTANCE>
	//   21   40:aload           9
	//   22   42:invokevirtual   #146 <Method void Logger.setLOG_LEVEL(LogLevel)>
		if(nativeLibraryStatus.get() != 0) goto _L2; else goto _L1
	//   23   45:getstatic       #120 <Field AtomicInteger nativeLibraryStatus>
	//   24   48:invokevirtual   #149 <Method int AtomicInteger.get()>
	//   25   51:ifne            109
_L1:
		try
		{
			httpurl = ((HttpUrl) (org.webrtc.PeerConnectionFactory.InitializationOptions.builder(context.getApplicationContext())));
	//   26   54:aload           10
	//   27   56:invokevirtual   #155 <Method Context Context.getApplicationContext()>
	//   28   59:invokestatic    #161 <Method org.webrtc.PeerConnectionFactory$InitializationOptions$Builder org.webrtc.PeerConnectionFactory$InitializationOptions.builder(Context)>
	//   29   62:astore_1        
		}
	//*  30   63:aload_1         
	//*  31   64:new             #163 <Class RelinkerLibraryLoader>
	//*  32   67:dup             
	//*  33   68:aload           10
	//*  34   70:invokespecial   #166 <Method void RelinkerLibraryLoader(Context)>
	//*  35   73:checkcast       #168 <Class NativeLibraryLoader>
	//*  36   76:invokevirtual   #174 <Method org.webrtc.PeerConnectionFactory$InitializationOptions$Builder org.webrtc.PeerConnectionFactory$InitializationOptions$Builder.setNativeLibraryLoader(NativeLibraryLoader)>
	//*  37   79:iconst_0        
	//*  38   80:invokevirtual   #178 <Method org.webrtc.PeerConnectionFactory$InitializationOptions$Builder org.webrtc.PeerConnectionFactory$InitializationOptions$Builder.setEnableInternalTracer(boolean)>
	//*  39   83:invokevirtual   #182 <Method org.webrtc.PeerConnectionFactory$InitializationOptions org.webrtc.PeerConnectionFactory$InitializationOptions$Builder.createInitializationOptions()>
	//*  40   86:invokestatic    #188 <Method void PeerConnectionFactory.initialize(org.webrtc.PeerConnectionFactory$InitializationOptions)>
	//*  41   89:getstatic       #120 <Field AtomicInteger nativeLibraryStatus>
	//*  42   92:iconst_1        
	//*  43   93:invokevirtual   #192 <Method void AtomicInteger.set(int)>
	//*  44   96:goto            109
	//*  45   99:getstatic       #120 <Field AtomicInteger nativeLibraryStatus>
	//*  46  102:iconst_2        
	//*  47  103:invokevirtual   #192 <Method void AtomicInteger.set(int)>
	//*  48  106:goto            109
	//*  49  109:getstatic       #120 <Field AtomicInteger nativeLibraryStatus>
	//*  50  112:invokevirtual   #149 <Method int AtomicInteger.get()>
	//*  51  115:iconst_1        
	//*  52  116:icmpne          175
	//*  53  119:aload_0         
	//*  54  120:getstatic       #197 <Field DnaContextFactory DnaContextFactory.INSTANCE>
	//*  55  123:aload_0         
	//*  56  124:getfield        #130 <Field String streamrootKey>
	//*  57  127:aload_0         
	//*  58  128:getfield        #132 <Field int latency>
	//*  59  131:aload_0         
	//*  60  132:getfield        #134 <Field String contentId>
	//*  61  135:aload_0         
	//*  62  136:getfield        #136 <Field String property>
	//*  63  139:aload_0         
	//*  64  140:getfield        #128 <Field HttpUrl backendHttpUrl>
	//*  65  143:aload_0         
	//*  66  144:getfield        #126 <Field HttpUrl originalManifestUrl>
	//*  67  147:lload           7
	//*  68  149:aload           10
	//*  69  151:aload           11
	//*  70  153:aload           12
	//*  71  155:aload           13
	//*  72  157:invokevirtual   #201 <Method DnaContext DnaContextFactory.initContext(String, int, String, String, HttpUrl, HttpUrl, long, Context, PlayerInteractor, QosModule, BandwidthListener)>
	//*  73  160:putfield        #203 <Field DnaContext dnaContext>
	//*  74  163:return          
	//*  75  164:astore_1        
	//*  76  165:getstatic       #142 <Field Logger Logger.INSTANCE>
	//*  77  168:aload_1         
	//*  78  169:checkcast       #205 <Class Throwable>
	//*  79  172:invokevirtual   #209 <Method void Logger.error(Throwable)>
	//*  80  175:return          
		// Misplaced declaration of an exception variable
		catch(HttpUrl httpurl)
	//*  81  176:astore_1        
		{
			continue; /* Loop/switch isn't completed */
	//   82  177:goto            99
		}
		PeerConnectionFactory.initialize(((org.webrtc.PeerConnectionFactory.InitializationOptions.Builder) (httpurl)).setNativeLibraryLoader((NativeLibraryLoader)new RelinkerLibraryLoader(context)).setEnableInternalTracer(false).createInitializationOptions());
		nativeLibraryStatus.set(1);
		  goto _L2
_L4:
		nativeLibraryStatus.set(2);
_L2:
		if(nativeLibraryStatus.get() == 1)
			try
			{
				dnaContext = DnaContextFactory.INSTANCE.initContext(streamrootKey, latency, contentId, property, backendHttpUrl, originalManifestUrl, l, context, playerinteractor, qosmodule, bandwidthlistener);
				return;
			}
			// Misplaced declaration of an exception variable
			catch(HttpUrl httpurl)
			{
				Logger.INSTANCE.error((Throwable)httpurl);
			}
		return;
		httpurl;
	//   83  180:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//*  84  181:goto            99
	}

	public DnaClient(HttpUrl httpurl, HttpUrl httpurl1, String s, int i, String s1, String s2, long l, LogLevel loglevel, Context context, PlayerInteractor playerinteractor, QosModule qosmodule, BandwidthListener bandwidthlistener, DefaultConstructorMarker defaultconstructormarker)
	{
		this(httpurl, httpurl1, s, i, s1, s2, l, loglevel, context, playerinteractor, qosmodule, bandwidthlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:aload           5
	//    6    8:aload           6
	//    7   10:lload           7
	//    8   12:aload           9
	//    9   14:aload           10
	//   10   16:aload           11
	//   11   18:aload           12
	//   12   20:aload           13
	//   13   22:invokespecial   #212 <Method void DnaClient(HttpUrl, HttpUrl, String, int, String, String, long, LogLevel, Context, PlayerInteractor, QosModule, BandwidthListener)>
	//   14   25:return          
	}

	public static final int generateBufferTarget(int i, int j, Integer integer)
	{
	/* block-local class not found */
	class Companion {}

		return Companion.generateBufferTarget(i, j, integer);
	//    0    0:getstatic       #114 <Field DnaClient$Companion Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #218 <Method int DnaClient$Companion.generateBufferTarget(int, int, Integer)>
	//    5    9:ireturn         
	}

	public static final int generateBufferTarget(int i, int j, Integer integer, TimeUnit timeunit)
	{
		return Companion.generateBufferTarget(i, j, integer, timeunit);
	//    0    0:getstatic       #114 <Field DnaClient$Companion Companion>
	//    1    3:iload_0         
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #222 <Method int DnaClient$Companion.generateBufferTarget(int, int, Integer, TimeUnit)>
	//    6   10:ireturn         
	}

	public static final DnaClientBuilder newBuilder()
	{
		return Companion.newBuilder();
	//    0    0:getstatic       #114 <Field DnaClient$Companion Companion>
	//    1    3:invokevirtual   #226 <Method DnaClientBuilder DnaClient$Companion.newBuilder()>
	//    2    6:areturn         
	}

	public void close()
	{
		DnaContext dnacontext = dnaContext;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
		if(dnacontext != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          54
			try
			{
				dnacontext.close();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #231 <Method void DnaContext.close()>
				return;
	//    7   13:return          
			}
			catch(Exception exception)
	//*   8   14:astore_1        
			{
				Logger logger = Logger.INSTANCE;
	//    9   15:getstatic       #142 <Field Logger Logger.INSTANCE>
	//   10   18:astore_2        
				Throwable throwable = (Throwable)exception;
	//   11   19:aload_1         
	//   12   20:checkcast       #205 <Class Throwable>
	//   13   23:astore_3        
				String s = exception.getMessage();
	//   14   24:aload_1         
	//   15   25:invokevirtual   #234 <Method String Exception.getMessage()>
	//   16   28:astore_1        
				if(s == null)
	//*  17   29:aload_1         
	//*  18   30:ifnull          36
	//*  19   33:goto            39
					s = "";
	//   20   36:ldc1            #235 <String "">
	//   21   38:astore_1        
				logger.error(throwable, "[CLOSING] ->>>> [%s]", new Object[] {
					s
				});
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:ldc1            #237 <String "[CLOSING] ->>>> [%s]">
	//   25   43:iconst_1        
	//   26   44:anewarray       Object[]
	//   27   47:dup             
	//   28   48:iconst_0        
	//   29   49:aload_1         
	//   30   50:aastore         
	//   31   51:invokevirtual   #240 <Method void Logger.error(Throwable, String, Object[])>
			}
		return;
	//   32   54:return          
	}

	public final void dnaDownloadEnabled(boolean flag)
	{
		setDnaDownloadAllowed(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #250 <Method void setDnaDownloadAllowed(boolean)>
	//    3    5:return          
	}

	public final void dnaUploadEnabled(boolean flag)
	{
		setDnaUploadAllowed(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #254 <Method void setDnaUploadAllowed(boolean)>
	//    3    5:return          
	}

	public final void fetchStats(InformationCallback informationcallback)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (informationcallback)), "informationCallback");
	//    0    0:aload_1         
	//    1    1:ldc2            #256 <String "informationCallback">
	//    2    4:invokestatic    #262 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) (dnaContext));
	//    3    7:aload_0         
	//    4    8:getfield        #203 <Field DnaContext dnaContext>
	//    5   11:astore_2        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          31
		{
			obj = ((Object) (((DnaContext) (obj)).getAnalyticsService()));
	//    8   16:aload_2         
	//    9   17:invokevirtual   #266 <Method AnalyticsService DnaContext.getAnalyticsService()>
	//   10   20:astore_2        
			if(obj != null)
	//*  11   21:aload_2         
	//*  12   22:ifnull          31
			{
				((AnalyticsService) (obj)).getPublicAnalytics(informationcallback);
	//   13   25:aload_2         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #271 <Method void AnalyticsService.getPublicAnalytics(InformationCallback)>
				return;
	//   16   30:return          
			}
		}
		informationcallback.onInformation(State.DELEGATED, 0L, 0L, 0L, 0);
	//   17   31:aload_1         
	//   18   32:getstatic       #277 <Field State State.DELEGATED>
	//   19   35:lconst_0        
	//   20   36:lconst_0        
	//   21   37:lconst_0        
	//   22   38:iconst_0        
	//   23   39:invokeinterface #283 <Method void InformationCallback.onInformation(State, long, long, long, int)>
	//   24   44:return          
	}

	public final Uri getBackendUrl()
	{
		Uri uri = Uri.parse(backendHttpUrl.toString());
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field HttpUrl backendHttpUrl>
	//    2    4:invokevirtual   #288 <Method String HttpUrl.toString()>
	//    3    7:invokestatic    #294 <Method Uri Uri.parse(String)>
	//    4   10:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (uri)), "Uri.parse(backendHttpUrl.toString())");
	//    5   11:aload_1         
	//    6   12:ldc2            #296 <String "Uri.parse(backendHttpUrl.toString())">
	//    7   15:invokestatic    #299 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return uri;
	//    8   18:aload_1         
	//    9   19:areturn         
	}

	public final String getContentId()
	{
		return contentId;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field String contentId>
	//    2    4:areturn         
	}

	public final boolean getDnaDownloadAllowed()
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((DnaBehaviourService) (obj)).getDnaDownload();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #308 <Method boolean DnaBehaviourService.getDnaDownload()>
	//   12   22:ireturn         
		}
		return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public final Boolean getDnaDownloadOnCellularAllowed()
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((DnaBehaviourService) (obj)).getDnaDownloadOnCellular();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #311 <Method Boolean DnaBehaviourService.getDnaDownloadOnCellular()>
	//   12   22:areturn         
		}
		return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public final Boolean getDnaDownloadOnWifiEthernetAllowed()
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((DnaBehaviourService) (obj)).getDnaDownloadOnWifiEthernet();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #314 <Method Boolean DnaBehaviourService.getDnaDownloadOnWifiEthernet()>
	//   12   22:areturn         
		}
		return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public final boolean getDnaUploadAllowed()
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((DnaBehaviourService) (obj)).getDnaUpload();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #317 <Method boolean DnaBehaviourService.getDnaUpload()>
	//   12   22:ireturn         
		}
		return false;
	//   13   23:iconst_0        
	//   14   24:ireturn         
	}

	public final Boolean getDnaUploadOnCellularAllowed()
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((DnaBehaviourService) (obj)).getDnaUploadOnCellular();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #320 <Method Boolean DnaBehaviourService.getDnaUploadOnCellular()>
	//   12   22:areturn         
		}
		return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public final Boolean getDnaUploadOnWifiEthernetAllowed()
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_1        
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				return ((DnaBehaviourService) (obj)).getDnaUploadOnWifiEthernet();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #323 <Method Boolean DnaBehaviourService.getDnaUploadOnWifiEthernet()>
	//   12   22:areturn         
		}
		return null;
	//   13   23:aconst_null     
	//   14   24:areturn         
	}

	public final int getLatency()
	{
		return latency;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field int latency>
	//    2    4:ireturn         
	}

	public final Uri getManifestUrl()
	{
		Object obj;
label0:
		{
			obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_1        
			if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          48
			{
				obj = ((Object) (((DnaContext) (obj)).getSessionInformation()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #327 <Method SessionInformation DnaContext.getSessionInformation()>
	//    7   13:astore_1        
				if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          48
				{
					obj = ((Object) (((SessionInformation) (obj)).getMedia()));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #333 <Method Media SessionInformation.getMedia()>
	//   12   22:astore_1        
					if(obj != null)
	//*  13   23:aload_1         
	//*  14   24:ifnull          48
					{
						obj = ((Object) (((Media) (obj)).getLocalManifestUrl()));
	//   15   27:aload_1         
	//   16   28:invokevirtual   #339 <Method HttpUrl Media.getLocalManifestUrl()>
	//   17   31:astore_1        
						if(obj != null)
	//*  18   32:aload_1         
	//*  19   33:ifnull          48
						{
							obj = ((Object) (((HttpUrl) (obj)).toString()));
	//   20   36:aload_1         
	//   21   37:invokevirtual   #288 <Method String HttpUrl.toString()>
	//   22   40:astore_1        
							if(obj != null)
	//*  23   41:aload_1         
	//*  24   42:ifnull          48
								break label0;
	//   25   45:goto            56
						}
					}
				}
			}
			obj = ((Object) (originalManifestUrl.toString()));
	//   26   48:aload_0         
	//   27   49:getfield        #126 <Field HttpUrl originalManifestUrl>
	//   28   52:invokevirtual   #288 <Method String HttpUrl.toString()>
	//   29   55:astore_1        
		}
		obj = ((Object) (Uri.parse(((String) (obj)))));
	//   30   56:aload_1         
	//   31   57:invokestatic    #294 <Method Uri Uri.parse(String)>
	//   32   60:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(obj, "Uri.parse(dnaContext?.se\u2026alManifestUrl.toString())");
	//   33   61:aload_1         
	//   34   62:ldc2            #341 <String "Uri.parse(dnaContext?.se\u2026alManifestUrl.toString())">
	//   35   65:invokestatic    #299 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((Uri) (obj));
	//   36   68:aload_1         
	//   37   69:areturn         
	}

	public final String getProperty()
	{
		return property;
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field String property>
	//    2    4:areturn         
	}

	public final String getStreamrootKey()
	{
		return streamrootKey;
	//    0    0:aload_0         
	//    1    1:getfield        #130 <Field String streamrootKey>
	//    2    4:areturn         
	}

	public final void setDnaDownloadAllowed(boolean flag)
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				((DnaBehaviourService) (obj)).setDnaDownload(flag);
	//   10   18:aload_2         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #344 <Method void DnaBehaviourService.setDnaDownload(boolean)>
		}
	//   13   23:return          
	}

	public final void setDnaDownloadOnCellularAllowed(Boolean boolean1)
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				((DnaBehaviourService) (obj)).setDnaDownloadOnCellular(boolean1);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #347 <Method void DnaBehaviourService.setDnaDownloadOnCellular(Boolean)>
		}
	//   13   23:return          
	}

	public final void setDnaDownloadOnWifiEthernetAllowed(Boolean boolean1)
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				((DnaBehaviourService) (obj)).setDnaDownloadOnWifiEthernet(boolean1);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #350 <Method void DnaBehaviourService.setDnaDownloadOnWifiEthernet(Boolean)>
		}
	//   13   23:return          
	}

	public final void setDnaUploadAllowed(boolean flag)
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				((DnaBehaviourService) (obj)).setDnaUpload(flag);
	//   10   18:aload_2         
	//   11   19:iload_1         
	//   12   20:invokevirtual   #353 <Method void DnaBehaviourService.setDnaUpload(boolean)>
		}
	//   13   23:return          
	}

	public final void setDnaUploadOnCellularAllowed(Boolean boolean1)
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				((DnaBehaviourService) (obj)).setDnaUploadOnCellular(boolean1);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #356 <Method void DnaBehaviourService.setDnaUploadOnCellular(Boolean)>
		}
	//   13   23:return          
	}

	public final void setDnaUploadOnWifiEthernetAllowed(Boolean boolean1)
	{
		Object obj = ((Object) (dnaContext));
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field DnaContext dnaContext>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          23
		{
			obj = ((Object) (((DnaContext) (obj)).getDnaBehaviourService()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #303 <Method DnaBehaviourService DnaContext.getDnaBehaviourService()>
	//    7   13:astore_2        
			if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          23
				((DnaBehaviourService) (obj)).setDnaUploadOnWifiEthernet(boolean1);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #359 <Method void DnaBehaviourService.setDnaUploadOnWifiEthernet(Boolean)>
		}
	//   13   23:return          
	}

	public static final Companion Companion = new Companion(((DefaultConstructorMarker) (null)));
	public static final int DEFAULT_LATENCY = -1;
	private static final int NATIVE_LIBRARY_LOADED = 1;
	private static final int NATIVE_LIBRARY_LOAD_FAILED = 2;
	private static final int NATIVE_LIBRARY_LOAD_NEEDED = 0;
	private static AtomicInteger nativeLibraryStatus = new AtomicInteger();
	private final HttpUrl backendHttpUrl;
	private final String contentId;
	private DnaContext dnaContext;
	private final int latency;
	private final HttpUrl originalManifestUrl;
	private final String property;
	private final String streamrootKey;

	static 
	{
	//    0    0:new             #10  <Class DnaClient$Companion>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #112 <Method void DnaClient$Companion(DefaultConstructorMarker)>
	//    4    8:putstatic       #114 <Field DnaClient$Companion Companion>
	//    5   11:new             #116 <Class AtomicInteger>
	//    6   14:dup             
	//    7   15:invokespecial   #118 <Method void AtomicInteger()>
	//    8   18:putstatic       #120 <Field AtomicInteger nativeLibraryStatus>
	//*   9   21:return          
	}

	// Unreferenced inner class io/streamroot/dna/core/DnaClient$Builder
	/* block-local class not found */
	class Builder {}

}
