// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.dash.mpd;

import android.os.SystemClock;
import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.upstream.*;
import com.google.android.exoplayer.util.Assertions;
import com.google.android.exoplayer.util.Util;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//			UtcTimingElement

public final class UtcTimingElementResolver
	implements com.google.android.exoplayer.upstream.Loader.Callback
{
	private static class Iso8601Parser
		implements com.google.android.exoplayer.upstream.UriLoadable.Parser
	{

		public Long parse(String s, InputStream inputstream)
			throws ParserException, IOException
		{
			s = (new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))).readLine();
		//    0    0:new             #27  <Class BufferedReader>
		//    1    3:dup             
		//    2    4:new             #29  <Class InputStreamReader>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:invokespecial   #32  <Method void InputStreamReader(InputStream)>
		//    6   12:invokespecial   #35  <Method void BufferedReader(java.io.Reader)>
		//    7   15:invokevirtual   #39  <Method String BufferedReader.readLine()>
		//    8   18:astore_1        
			long l;
			try
			{
				inputstream = ((InputStream) (new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US)));
		//    9   19:new             #41  <Class SimpleDateFormat>
		//   10   22:dup             
		//   11   23:ldc1            #43  <String "yyyy-MM-dd'T'HH:mm:ss'Z'">
		//   12   25:getstatic       #49  <Field Locale Locale.US>
		//   13   28:invokespecial   #52  <Method void SimpleDateFormat(String, Locale)>
		//   14   31:astore_2        
				((SimpleDateFormat) (inputstream)).setTimeZone(TimeZone.getTimeZone("UTC"));
		//   15   32:aload_2         
		//   16   33:ldc1            #54  <String "UTC">
		//   17   35:invokestatic    #60  <Method TimeZone TimeZone.getTimeZone(String)>
		//   18   38:invokevirtual   #64  <Method void SimpleDateFormat.setTimeZone(TimeZone)>
				l = ((SimpleDateFormat) (inputstream)).parse(s).getTime();
		//   19   41:aload_2         
		//   20   42:aload_1         
		//   21   43:invokevirtual   #67  <Method Date SimpleDateFormat.parse(String)>
		//   22   46:invokevirtual   #73  <Method long Date.getTime()>
		//   23   49:lstore_3        
			}
		//*  24   50:lload_3         
		//*  25   51:invokestatic    #79  <Method Long Long.valueOf(long)>
		//*  26   54:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  27   55:astore_1        
			{
				throw new ParserException(((Throwable) (s)));
		//   28   56:new             #21  <Class ParserException>
		//   29   59:dup             
		//   30   60:aload_1         
		//   31   61:invokespecial   #82  <Method void ParserException(Throwable)>
		//   32   64:athrow          
			}
			return Long.valueOf(l);
		}

		public volatile Object parse(String s, InputStream inputstream)
			throws ParserException, IOException
		{
			return ((Object) (parse(s, inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #86  <Method Long parse(String, InputStream)>
		//    4    6:areturn         
		}

		private Iso8601Parser()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}

	public static interface UtcTimingCallback
	{

		public abstract void onTimestampError(UtcTimingElement utctimingelement, IOException ioexception);

		public abstract void onTimestampResolved(UtcTimingElement utctimingelement, long l);
	}

	private static class XsDateTimeParser
		implements com.google.android.exoplayer.upstream.UriLoadable.Parser
	{

		public Long parse(String s, InputStream inputstream)
			throws ParserException, IOException
		{
			s = (new BufferedReader(((java.io.Reader) (new InputStreamReader(inputstream))))).readLine();
		//    0    0:new             #27  <Class BufferedReader>
		//    1    3:dup             
		//    2    4:new             #29  <Class InputStreamReader>
		//    3    7:dup             
		//    4    8:aload_2         
		//    5    9:invokespecial   #32  <Method void InputStreamReader(InputStream)>
		//    6   12:invokespecial   #35  <Method void BufferedReader(java.io.Reader)>
		//    7   15:invokevirtual   #39  <Method String BufferedReader.readLine()>
		//    8   18:astore_1        
			long l;
			try
			{
				l = Util.parseXsDateTime(s);
		//    9   19:aload_1         
		//   10   20:invokestatic    #45  <Method long Util.parseXsDateTime(String)>
		//   11   23:lstore_3        
			}
		//*  12   24:lload_3         
		//*  13   25:invokestatic    #51  <Method Long Long.valueOf(long)>
		//*  14   28:areturn         
			// Misplaced declaration of an exception variable
			catch(String s)
		//*  15   29:astore_1        
			{
				throw new ParserException(((Throwable) (s)));
		//   16   30:new             #21  <Class ParserException>
		//   17   33:dup             
		//   18   34:aload_1         
		//   19   35:invokespecial   #54  <Method void ParserException(Throwable)>
		//   20   38:athrow          
			}
			return Long.valueOf(l);
		}

		public volatile Object parse(String s, InputStream inputstream)
			throws ParserException, IOException
		{
			return ((Object) (parse(s, inputstream)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #58  <Method Long parse(String, InputStream)>
		//    4    6:areturn         
		}

		private XsDateTimeParser()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}

	}


	private UtcTimingElementResolver(UriDataSource uridatasource, UtcTimingElement utctimingelement, long l, UtcTimingCallback utctimingcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		uriDataSource = uridatasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field UriDataSource uriDataSource>
		timingElement = (UtcTimingElement)Assertions.checkNotNull(((Object) (utctimingelement)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #43  <Method Object Assertions.checkNotNull(Object)>
	//    8   14:checkcast       #45  <Class UtcTimingElement>
	//    9   17:putfield        #47  <Field UtcTimingElement timingElement>
		timingElementElapsedRealtime = l;
	//   10   20:aload_0         
	//   11   21:lload_3         
	//   12   22:putfield        #49  <Field long timingElementElapsedRealtime>
		callback = (UtcTimingCallback)Assertions.checkNotNull(((Object) (utctimingcallback)));
	//   13   25:aload_0         
	//   14   26:aload           5
	//   15   28:invokestatic    #43  <Method Object Assertions.checkNotNull(Object)>
	//   16   31:checkcast       #13  <Class UtcTimingElementResolver$UtcTimingCallback>
	//   17   34:putfield        #51  <Field UtcTimingElementResolver$UtcTimingCallback callback>
	//   18   37:return          
	}

	private void releaseLoader()
	{
		singleUseLoader.release();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Loader singleUseLoader>
	//    2    4:invokevirtual   #60  <Method void Loader.release()>
	//    3    7:return          
	}

	private void resolve()
	{
		String s = timingElement.schemeIdUri;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field UtcTimingElement timingElement>
	//    2    4:getfield        #65  <Field String UtcTimingElement.schemeIdUri>
	//    3    7:astore_1        
		if(Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:direct:2012"))
	//*   4    8:aload_1         
	//*   5    9:ldc1            #67  <String "urn:mpeg:dash:utc:direct:2012">
	//*   6   11:invokestatic    #73  <Method boolean Util.areEqual(Object, Object)>
	//*   7   14:ifeq            22
		{
			resolveDirect();
	//    8   17:aload_0         
	//    9   18:invokespecial   #76  <Method void resolveDirect()>
			return;
	//   10   21:return          
		}
		if(Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:http-iso:2014"))
	//*  11   22:aload_1         
	//*  12   23:ldc1            #78  <String "urn:mpeg:dash:utc:http-iso:2014">
	//*  13   25:invokestatic    #73  <Method boolean Util.areEqual(Object, Object)>
	//*  14   28:ifeq            44
		{
			resolveHttp(((com.google.android.exoplayer.upstream.UriLoadable.Parser) (new Iso8601Parser())));
	//   15   31:aload_0         
	//   16   32:new             #10  <Class UtcTimingElementResolver$Iso8601Parser>
	//   17   35:dup             
	//   18   36:aconst_null     
	//   19   37:invokespecial   #81  <Method void UtcTimingElementResolver$Iso8601Parser(UtcTimingElementResolver$1)>
	//   20   40:invokespecial   #85  <Method void resolveHttp(com.google.android.exoplayer.upstream.UriLoadable$Parser)>
			return;
	//   21   43:return          
		}
		if(!Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:http-xsdate:2012") && !Util.areEqual(((Object) (s)), "urn:mpeg:dash:utc:http-xsdate:2014"))
	//*  22   44:aload_1         
	//*  23   45:ldc1            #87  <String "urn:mpeg:dash:utc:http-xsdate:2012">
	//*  24   47:invokestatic    #73  <Method boolean Util.areEqual(Object, Object)>
	//*  25   50:ifne            88
	//*  26   53:aload_1         
	//*  27   54:ldc1            #89  <String "urn:mpeg:dash:utc:http-xsdate:2014">
	//*  28   56:invokestatic    #73  <Method boolean Util.areEqual(Object, Object)>
	//*  29   59:ifeq            65
	//*  30   62:goto            88
		{
			callback.onTimestampError(timingElement, new IOException("Unsupported utc timing scheme"));
	//   31   65:aload_0         
	//   32   66:getfield        #51  <Field UtcTimingElementResolver$UtcTimingCallback callback>
	//   33   69:aload_0         
	//   34   70:getfield        #47  <Field UtcTimingElement timingElement>
	//   35   73:new             #91  <Class IOException>
	//   36   76:dup             
	//   37   77:ldc1            #93  <String "Unsupported utc timing scheme">
	//   38   79:invokespecial   #96  <Method void IOException(String)>
	//   39   82:invokeinterface #100 <Method void UtcTimingElementResolver$UtcTimingCallback.onTimestampError(UtcTimingElement, IOException)>
			return;
	//   40   87:return          
		} else
		{
			resolveHttp(((com.google.android.exoplayer.upstream.UriLoadable.Parser) (new XsDateTimeParser())));
	//   41   88:aload_0         
	//   42   89:new             #16  <Class UtcTimingElementResolver$XsDateTimeParser>
	//   43   92:dup             
	//   44   93:aconst_null     
	//   45   94:invokespecial   #101 <Method void UtcTimingElementResolver$XsDateTimeParser(UtcTimingElementResolver$1)>
	//   46   97:invokespecial   #85  <Method void resolveHttp(com.google.android.exoplayer.upstream.UriLoadable$Parser)>
			return;
	//   47  100:return          
		}
	}

	private void resolveDirect()
	{
		try
		{
			long l = Util.parseXsDateTime(timingElement.value);
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field UtcTimingElement timingElement>
	//    2    4:getfield        #106 <Field String UtcTimingElement.value>
	//    3    7:invokestatic    #110 <Method long Util.parseXsDateTime(String)>
	//    4   10:lstore_1        
			long l1 = timingElementElapsedRealtime;
	//    5   11:aload_0         
	//    6   12:getfield        #49  <Field long timingElementElapsedRealtime>
	//    7   15:lstore_3        
			callback.onTimestampResolved(timingElement, l - l1);
	//    8   16:aload_0         
	//    9   17:getfield        #51  <Field UtcTimingElementResolver$UtcTimingCallback callback>
	//   10   20:aload_0         
	//   11   21:getfield        #47  <Field UtcTimingElement timingElement>
	//   12   24:lload_1         
	//   13   25:lload_3         
	//   14   26:lsub            
	//   15   27:invokeinterface #114 <Method void UtcTimingElementResolver$UtcTimingCallback.onTimestampResolved(UtcTimingElement, long)>
			return;
	//   16   32:return          
		}
		catch(ParseException parseexception)
	//*  17   33:astore          5
		{
			callback.onTimestampError(timingElement, ((IOException) (new ParserException(((Throwable) (parseexception))))));
	//   18   35:aload_0         
	//   19   36:getfield        #51  <Field UtcTimingElementResolver$UtcTimingCallback callback>
	//   20   39:aload_0         
	//   21   40:getfield        #47  <Field UtcTimingElement timingElement>
	//   22   43:new             #116 <Class ParserException>
	//   23   46:dup             
	//   24   47:aload           5
	//   25   49:invokespecial   #119 <Method void ParserException(Throwable)>
	//   26   52:invokeinterface #100 <Method void UtcTimingElementResolver$UtcTimingCallback.onTimestampError(UtcTimingElement, IOException)>
		}
	//   27   57:return          
	}

	private void resolveHttp(com.google.android.exoplayer.upstream.UriLoadable.Parser parser)
	{
		singleUseLoader = new Loader("utctiming");
	//    0    0:aload_0         
	//    1    1:new             #57  <Class Loader>
	//    2    4:dup             
	//    3    5:ldc1            #121 <String "utctiming">
	//    4    7:invokespecial   #122 <Method void Loader(String)>
	//    5   10:putfield        #55  <Field Loader singleUseLoader>
		singleUseLoadable = new UriLoadable(timingElement.value, uriDataSource, parser);
	//    6   13:aload_0         
	//    7   14:new             #124 <Class UriLoadable>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:getfield        #47  <Field UtcTimingElement timingElement>
	//   11   22:getfield        #106 <Field String UtcTimingElement.value>
	//   12   25:aload_0         
	//   13   26:getfield        #37  <Field UriDataSource uriDataSource>
	//   14   29:aload_1         
	//   15   30:invokespecial   #127 <Method void UriLoadable(String, UriDataSource, com.google.android.exoplayer.upstream.UriLoadable$Parser)>
	//   16   33:putfield        #129 <Field UriLoadable singleUseLoadable>
		singleUseLoader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (singleUseLoadable)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   17   36:aload_0         
	//   18   37:getfield        #55  <Field Loader singleUseLoader>
	//   19   40:aload_0         
	//   20   41:getfield        #129 <Field UriLoadable singleUseLoadable>
	//   21   44:aload_0         
	//   22   45:invokevirtual   #133 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
	//   23   48:return          
	}

	public static void resolveTimingElement(UriDataSource uridatasource, UtcTimingElement utctimingelement, long l, UtcTimingCallback utctimingcallback)
	{
		(new UtcTimingElementResolver(uridatasource, utctimingelement, l, utctimingcallback)).resolve();
	//    0    0:new             #2   <Class UtcTimingElementResolver>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:lload_2         
	//    5    7:aload           4
	//    6    9:invokespecial   #138 <Method void UtcTimingElementResolver(UriDataSource, UtcTimingElement, long, UtcTimingElementResolver$UtcTimingCallback)>
	//    7   12:invokespecial   #140 <Method void resolve()>
	//    8   15:return          
	}

	public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		onLoadError(loadable, new IOException("Load cancelled", ((Throwable) (new CancellationException()))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #91  <Class IOException>
	//    3    5:dup             
	//    4    6:ldc1            #144 <String "Load cancelled">
	//    5    8:new             #146 <Class CancellationException>
	//    6   11:dup             
	//    7   12:invokespecial   #147 <Method void CancellationException()>
	//    8   15:invokespecial   #150 <Method void IOException(String, Throwable)>
	//    9   18:invokevirtual   #154 <Method void onLoadError(com.google.android.exoplayer.upstream.Loader$Loadable, IOException)>
	//   10   21:return          
	}

	public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		releaseLoader();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void releaseLoader()>
		long l = ((Long)singleUseLoadable.getResult()).longValue();
	//    2    4:aload_0         
	//    3    5:getfield        #129 <Field UriLoadable singleUseLoadable>
	//    4    8:invokevirtual   #161 <Method Object UriLoadable.getResult()>
	//    5   11:checkcast       #163 <Class Long>
	//    6   14:invokevirtual   #167 <Method long Long.longValue()>
	//    7   17:lstore_2        
		long l1 = SystemClock.elapsedRealtime();
	//    8   18:invokestatic    #172 <Method long SystemClock.elapsedRealtime()>
	//    9   21:lstore          4
		callback.onTimestampResolved(timingElement, l - l1);
	//   10   23:aload_0         
	//   11   24:getfield        #51  <Field UtcTimingElementResolver$UtcTimingCallback callback>
	//   12   27:aload_0         
	//   13   28:getfield        #47  <Field UtcTimingElement timingElement>
	//   14   31:lload_2         
	//   15   32:lload           4
	//   16   34:lsub            
	//   17   35:invokeinterface #114 <Method void UtcTimingElementResolver$UtcTimingCallback.onTimestampResolved(UtcTimingElement, long)>
	//   18   40:return          
	}

	public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
	{
		releaseLoader();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method void releaseLoader()>
		callback.onTimestampError(timingElement, ioexception);
	//    2    4:aload_0         
	//    3    5:getfield        #51  <Field UtcTimingElementResolver$UtcTimingCallback callback>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field UtcTimingElement timingElement>
	//    6   12:aload_2         
	//    7   13:invokeinterface #100 <Method void UtcTimingElementResolver$UtcTimingCallback.onTimestampError(UtcTimingElement, IOException)>
	//    8   18:return          
	}

	private final UtcTimingCallback callback;
	private UriLoadable singleUseLoadable;
	private Loader singleUseLoader;
	private final UtcTimingElement timingElement;
	private final long timingElementElapsedRealtime;
	private final UriDataSource uriDataSource;
}
