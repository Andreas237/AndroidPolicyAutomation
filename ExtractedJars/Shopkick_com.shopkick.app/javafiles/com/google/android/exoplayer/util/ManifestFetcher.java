// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.os.*;
import android.text.TextUtils;
import com.google.android.exoplayer.upstream.*;
import java.io.IOException;
import java.util.concurrent.CancellationException;

public class ManifestFetcher
	implements com.google.android.exoplayer.upstream.Loader.Callback
{
	public static interface EventListener
	{

		public abstract void onManifestError(IOException ioexception);

		public abstract void onManifestRefreshStarted();

		public abstract void onManifestRefreshed();
	}

	public static interface ManifestCallback
	{

		public abstract void onSingleManifest(Object obj);

		public abstract void onSingleManifestError(IOException ioexception);
	}

	public static final class ManifestIOException extends IOException
	{

		public ManifestIOException(Throwable throwable)
		{
			super(throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void IOException(Throwable)>
		//    3    5:return          
		}
	}

	public static interface RedirectingManifest
	{

		public abstract String getNextManifestUri();
	}

	private class SingleFetchHelper
		implements com.google.android.exoplayer.upstream.Loader.Callback
	{

		private void releaseLoader()
		{
			singleUseLoader.release();
		//    0    0:aload_0         
		//    1    1:getfield        #45  <Field Loader singleUseLoader>
		//    2    4:invokevirtual   #52  <Method void Loader.release()>
		//    3    7:return          
		}

		public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
		{
			loadable = ((com.google.android.exoplayer.upstream.Loader.Loadable) (new ManifestIOException(((Throwable) (new CancellationException())))));
		//    0    0:new             #56  <Class ManifestFetcher$ManifestIOException>
		//    1    3:dup             
		//    2    4:new             #58  <Class CancellationException>
		//    3    7:dup             
		//    4    8:invokespecial   #59  <Method void CancellationException()>
		//    5   11:invokespecial   #62  <Method void ManifestFetcher$ManifestIOException(Throwable)>
		//    6   14:astore_1        
			wrappedCallback.onSingleManifestError(((IOException) (loadable)));
		//    7   15:aload_0         
		//    8   16:getfield        #36  <Field ManifestFetcher$ManifestCallback wrappedCallback>
		//    9   19:aload_1         
		//   10   20:invokeinterface #68  <Method void ManifestFetcher$ManifestCallback.onSingleManifestError(IOException)>
			releaseLoader();
		//   11   25:aload_0         
		//   12   26:invokespecial   #70  <Method void releaseLoader()>
			return;
		//   13   29:return          
			loadable;
		//   14   30:astore_1        
			releaseLoader();
		//   15   31:aload_0         
		//   16   32:invokespecial   #70  <Method void releaseLoader()>
			throw loadable;
		//   17   35:aload_1         
		//   18   36:athrow          
		}

		public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
		{
			loadable = ((com.google.android.exoplayer.upstream.Loader.Loadable) (singleUseLoadable.getResult()));
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field UriLoadable singleUseLoadable>
		//    2    4:invokevirtual   #77  <Method Object UriLoadable.getResult()>
		//    3    7:astore_1        
			onSingleFetchCompleted(((Object) (loadable)), loadStartTimestamp);
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field ManifestFetcher this$0>
		//    6   12:aload_1         
		//    7   13:aload_0         
		//    8   14:getfield        #79  <Field long loadStartTimestamp>
		//    9   17:invokevirtual   #83  <Method void ManifestFetcher.onSingleFetchCompleted(Object, long)>
			wrappedCallback.onSingleManifest(((Object) (loadable)));
		//   10   20:aload_0         
		//   11   21:getfield        #36  <Field ManifestFetcher$ManifestCallback wrappedCallback>
		//   12   24:aload_1         
		//   13   25:invokeinterface #87  <Method void ManifestFetcher$ManifestCallback.onSingleManifest(Object)>
			releaseLoader();
		//   14   30:aload_0         
		//   15   31:invokespecial   #70  <Method void releaseLoader()>
			return;
		//   16   34:return          
			loadable;
		//   17   35:astore_1        
			releaseLoader();
		//   18   36:aload_0         
		//   19   37:invokespecial   #70  <Method void releaseLoader()>
			throw loadable;
		//   20   40:aload_1         
		//   21   41:athrow          
		}

		public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
		{
			wrappedCallback.onSingleManifestError(ioexception);
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field ManifestFetcher$ManifestCallback wrappedCallback>
		//    2    4:aload_2         
		//    3    5:invokeinterface #68  <Method void ManifestFetcher$ManifestCallback.onSingleManifestError(IOException)>
			releaseLoader();
		//    4   10:aload_0         
		//    5   11:invokespecial   #70  <Method void releaseLoader()>
			return;
		//    6   14:return          
			loadable;
		//    7   15:astore_1        
			releaseLoader();
		//    8   16:aload_0         
		//    9   17:invokespecial   #70  <Method void releaseLoader()>
			throw loadable;
		//   10   20:aload_1         
		//   11   21:athrow          
		}

		public void startLoading()
		{
			loadStartTimestamp = SystemClock.elapsedRealtime();
		//    0    0:aload_0         
		//    1    1:invokestatic    #96  <Method long SystemClock.elapsedRealtime()>
		//    2    4:putfield        #79  <Field long loadStartTimestamp>
			singleUseLoader.startLoading(callbackLooper, ((com.google.android.exoplayer.upstream.Loader.Loadable) (singleUseLoadable)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
		//    3    7:aload_0         
		//    4    8:getfield        #45  <Field Loader singleUseLoader>
		//    5   11:aload_0         
		//    6   12:getfield        #34  <Field Looper callbackLooper>
		//    7   15:aload_0         
		//    8   16:getfield        #32  <Field UriLoadable singleUseLoadable>
		//    9   19:aload_0         
		//   10   20:invokevirtual   #99  <Method void Loader.startLoading(Looper, com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
		//   11   23:return          
		}

		private final Looper callbackLooper;
		private long loadStartTimestamp;
		private final UriLoadable singleUseLoadable;
		private final Loader singleUseLoader = new Loader("manifestLoader:single");
		final ManifestFetcher this$0;
		private final ManifestCallback wrappedCallback;

		public SingleFetchHelper(UriLoadable uriloadable, Looper looper, ManifestCallback manifestcallback)
		{
			this$0 = ManifestFetcher.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field ManifestFetcher this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #30  <Method void Object()>
			singleUseLoadable = uriloadable;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #32  <Field UriLoadable singleUseLoadable>
			callbackLooper = looper;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #34  <Field Looper callbackLooper>
			wrappedCallback = manifestcallback;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #36  <Field ManifestFetcher$ManifestCallback wrappedCallback>
		//   14   25:aload_0         
		//   15   26:new             #38  <Class Loader>
		//   16   29:dup             
		//   17   30:ldc1            #40  <String "manifestLoader:single">
		//   18   32:invokespecial   #43  <Method void Loader(String)>
		//   19   35:putfield        #45  <Field Loader singleUseLoader>
		//   20   38:return          
		}
	}


	public ManifestFetcher(String s, UriDataSource uridatasource, com.google.android.exoplayer.upstream.UriLoadable.Parser parser1)
	{
		this(s, uridatasource, parser1, ((Handler) (null)), ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #62  <Method void ManifestFetcher(String, UriDataSource, com.google.android.exoplayer.upstream.UriLoadable$Parser, Handler, ManifestFetcher$EventListener)>
	//    7    9:return          
	}

	public ManifestFetcher(String s, UriDataSource uridatasource, com.google.android.exoplayer.upstream.UriLoadable.Parser parser1, Handler handler, EventListener eventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void Object()>
		parser = parser1;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #70  <Field com.google.android.exoplayer.upstream.UriLoadable$Parser parser>
		manifestUri = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #72  <Field String manifestUri>
		uriDataSource = uridatasource;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #74  <Field UriDataSource uriDataSource>
		eventHandler = handler;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #76  <Field Handler eventHandler>
		eventListener = eventlistener;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #78  <Field ManifestFetcher$EventListener eventListener>
	//   17   31:return          
	}

	private long getRetryDelayMillis(long l)
	{
		return Math.min((l - 1L) * 1000L, 5000L);
	//    0    0:lload_1         
	//    1    1:lconst_1        
	//    2    2:lsub            
	//    3    3:ldc2w           #84  <Long 1000L>
	//    4    6:lmul            
	//    5    7:ldc2w           #86  <Long 5000L>
	//    6   10:invokestatic    #93  <Method long Math.min(long, long)>
	//    7   13:lreturn         
	}

	private void notifyManifestError(final IOException e)
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Handler eventHandler>
	//    2    4:astore_2        
		if(handler != null && eventListener != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #78  <Field ManifestFetcher$EventListener eventListener>
	//*   7   13:ifnull          30
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onManifestError(e);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field ManifestFetcher this$0>
				//    2    4:invokestatic    #30  <Method ManifestFetcher$EventListener ManifestFetcher.access$000(ManifestFetcher)>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field IOException val$e>
				//    5   11:invokeinterface #35  <Method void ManifestFetcher$EventListener.onManifestError(IOException)>
				//    6   16:return          
				}

				final ManifestFetcher this$0;
				final IOException val$e;

			
			{
				this$0 = ManifestFetcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ManifestFetcher this$0>
				e = ioexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field IOException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    8   16:aload_2         
	//    9   17:new             #13  <Class ManifestFetcher$3>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #98  <Method void ManifestFetcher$3(ManifestFetcher, IOException)>
	//   14   26:invokevirtual   #104 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void notifyManifestRefreshStarted()
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Handler eventHandler>
	//    2    4:astore_1        
		if(handler != null && eventListener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
	//*   5    9:aload_0         
	//*   6   10:getfield        #78  <Field ManifestFetcher$EventListener eventListener>
	//*   7   13:ifnull          29
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onManifestRefreshStarted();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ManifestFetcher this$0>
				//    2    4:invokestatic    #25  <Method ManifestFetcher$EventListener ManifestFetcher.access$000(ManifestFetcher)>
				//    3    7:invokeinterface #30  <Method void ManifestFetcher$EventListener.onManifestRefreshStarted()>
				//    4   12:return          
				}

				final ManifestFetcher this$0;

			
			{
				this$0 = ManifestFetcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ManifestFetcher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    8   16:aload_1         
	//    9   17:new             #9   <Class ManifestFetcher$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #108 <Method void ManifestFetcher$1(ManifestFetcher)>
	//   13   25:invokevirtual   #104 <Method boolean Handler.post(Runnable)>
	//   14   28:pop             
	//   15   29:return          
	}

	private void notifyManifestRefreshed()
	{
		Handler handler = eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Handler eventHandler>
	//    2    4:astore_1        
		if(handler != null && eventListener != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          29
	//*   5    9:aload_0         
	//*   6   10:getfield        #78  <Field ManifestFetcher$EventListener eventListener>
	//*   7   13:ifnull          29
			handler.post(new Runnable() {

				public void run()
				{
					eventListener.onManifestRefreshed();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field ManifestFetcher this$0>
				//    2    4:invokestatic    #25  <Method ManifestFetcher$EventListener ManifestFetcher.access$000(ManifestFetcher)>
				//    3    7:invokeinterface #30  <Method void ManifestFetcher$EventListener.onManifestRefreshed()>
				//    4   12:return          
				}

				final ManifestFetcher this$0;

			
			{
				this$0 = ManifestFetcher.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ManifestFetcher this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    8   16:aload_1         
	//    9   17:new             #11  <Class ManifestFetcher$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #110 <Method void ManifestFetcher$2(ManifestFetcher)>
	//   13   25:invokevirtual   #104 <Method boolean Handler.post(Runnable)>
	//   14   28:pop             
	//   15   29:return          
	}

	public void disable()
	{
		int i = enabledCount - 1;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int enabledCount>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:istore_1        
		enabledCount = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #113 <Field int enabledCount>
		if(i == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            34
		{
			Loader loader1 = loader;
	//   10   16:aload_0         
	//   11   17:getfield        #115 <Field Loader loader>
	//   12   20:astore_2        
			if(loader1 != null)
	//*  13   21:aload_2         
	//*  14   22:ifnull          34
			{
				loader1.release();
	//   15   25:aload_2         
	//   16   26:invokevirtual   #120 <Method void Loader.release()>
				loader = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #115 <Field Loader loader>
			}
		}
	//   20   34:return          
	}

	public void enable()
	{
		int i = enabledCount;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field int enabledCount>
	//    2    4:istore_1        
		enabledCount = i + 1;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #113 <Field int enabledCount>
		if(i == 0)
	//*   8   12:iload_1         
	//*   9   13:ifne            26
		{
			loadExceptionCount = 0;
	//   10   16:aload_0         
	//   11   17:iconst_0        
	//   12   18:putfield        #123 <Field int loadExceptionCount>
			loadException = null;
	//   13   21:aload_0         
	//   14   22:aconst_null     
	//   15   23:putfield        #125 <Field ManifestFetcher$ManifestIOException loadException>
		}
	//   16   26:return          
	}

	public Object getManifest()
	{
		return manifest;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field Object manifest>
	//    2    4:areturn         
	}

	public long getManifestLoadCompleteTimestamp()
	{
		return manifestLoadCompleteTimestamp;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field long manifestLoadCompleteTimestamp>
	//    2    4:lreturn         
	}

	public long getManifestLoadStartTimestamp()
	{
		return manifestLoadStartTimestamp;
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field long manifestLoadStartTimestamp>
	//    2    4:lreturn         
	}

	public void maybeThrowError()
		throws ManifestIOException
	{
		ManifestIOException manifestioexception = loadException;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field ManifestFetcher$ManifestIOException loadException>
	//    2    4:astore_1        
		if(manifestioexception != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
		{
			if(loadExceptionCount <= 1)
	//*   5    9:aload_0         
	//*   6   10:getfield        #123 <Field int loadExceptionCount>
	//*   7   13:iconst_1        
	//*   8   14:icmpgt          18
				return;
	//    9   17:return          
			else
				throw manifestioexception;
	//   10   18:aload_1         
	//   11   19:athrow          
		} else
		{
			return;
	//   12   20:return          
		}
	}

	public void onLoadCanceled(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
	//    0    0:return          
	}

	public void onLoadCompleted(com.google.android.exoplayer.upstream.Loader.Loadable loadable)
	{
		UriLoadable uriloadable = currentLoadable;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field UriLoadable currentLoadable>
	//    2    4:astore_2        
		if(uriloadable != loadable)
	//*   3    5:aload_2         
	//*   4    6:aload_1         
	//*   5    7:if_acmpeq       11
			return;
	//    6   10:return          
		manifest = uriloadable.getResult();
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #149 <Method Object UriLoadable.getResult()>
	//   10   16:putfield        #129 <Field Object manifest>
		manifestLoadStartTimestamp = currentLoadStartTimestamp;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #151 <Field long currentLoadStartTimestamp>
	//   14   24:putfield        #137 <Field long manifestLoadStartTimestamp>
		manifestLoadCompleteTimestamp = SystemClock.elapsedRealtime();
	//   15   27:aload_0         
	//   16   28:invokestatic    #156 <Method long SystemClock.elapsedRealtime()>
	//   17   31:putfield        #134 <Field long manifestLoadCompleteTimestamp>
		loadExceptionCount = 0;
	//   18   34:aload_0         
	//   19   35:iconst_0        
	//   20   36:putfield        #123 <Field int loadExceptionCount>
		loadException = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #125 <Field ManifestFetcher$ManifestIOException loadException>
		if(manifest instanceof RedirectingManifest)
	//*  24   44:aload_0         
	//*  25   45:getfield        #129 <Field Object manifest>
	//*  26   48:instanceof      #24  <Class ManifestFetcher$RedirectingManifest>
	//*  27   51:ifeq            79
		{
			loadable = ((com.google.android.exoplayer.upstream.Loader.Loadable) (((RedirectingManifest)manifest).getNextManifestUri()));
	//   28   54:aload_0         
	//   29   55:getfield        #129 <Field Object manifest>
	//   30   58:checkcast       #24  <Class ManifestFetcher$RedirectingManifest>
	//   31   61:invokeinterface #160 <Method String ManifestFetcher$RedirectingManifest.getNextManifestUri()>
	//   32   66:astore_1        
			if(!TextUtils.isEmpty(((CharSequence) (loadable))))
	//*  33   67:aload_1         
	//*  34   68:invokestatic    #166 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  35   71:ifne            79
				manifestUri = ((String) (loadable));
	//   36   74:aload_0         
	//   37   75:aload_1         
	//   38   76:putfield        #72  <Field String manifestUri>
		}
		notifyManifestRefreshed();
	//   39   79:aload_0         
	//   40   80:invokespecial   #168 <Method void notifyManifestRefreshed()>
	//   41   83:return          
	}

	public void onLoadError(com.google.android.exoplayer.upstream.Loader.Loadable loadable, IOException ioexception)
	{
		if(currentLoadable != loadable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field UriLoadable currentLoadable>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       9
		{
			return;
	//    4    8:return          
		} else
		{
			loadExceptionCount = loadExceptionCount + 1;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #123 <Field int loadExceptionCount>
	//    8   14:iconst_1        
	//    9   15:iadd            
	//   10   16:putfield        #123 <Field int loadExceptionCount>
			loadExceptionTimestamp = SystemClock.elapsedRealtime();
	//   11   19:aload_0         
	//   12   20:invokestatic    #156 <Method long SystemClock.elapsedRealtime()>
	//   13   23:putfield        #172 <Field long loadExceptionTimestamp>
			loadException = new ManifestIOException(((Throwable) (ioexception)));
	//   14   26:aload_0         
	//   15   27:new             #21  <Class ManifestFetcher$ManifestIOException>
	//   16   30:dup             
	//   17   31:aload_2         
	//   18   32:invokespecial   #175 <Method void ManifestFetcher$ManifestIOException(Throwable)>
	//   19   35:putfield        #125 <Field ManifestFetcher$ManifestIOException loadException>
			notifyManifestError(((IOException) (loadException)));
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #125 <Field ManifestFetcher$ManifestIOException loadException>
	//   23   43:invokespecial   #177 <Method void notifyManifestError(IOException)>
			return;
	//   24   46:return          
		}
	}

	void onSingleFetchCompleted(Object obj, long l)
	{
		manifest = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #129 <Field Object manifest>
		manifestLoadStartTimestamp = l;
	//    3    5:aload_0         
	//    4    6:lload_2         
	//    5    7:putfield        #137 <Field long manifestLoadStartTimestamp>
		manifestLoadCompleteTimestamp = SystemClock.elapsedRealtime();
	//    6   10:aload_0         
	//    7   11:invokestatic    #156 <Method long SystemClock.elapsedRealtime()>
	//    8   14:putfield        #134 <Field long manifestLoadCompleteTimestamp>
	//    9   17:return          
	}

	public void requestRefresh()
	{
		if(loadException != null && SystemClock.elapsedRealtime() < loadExceptionTimestamp + getRetryDelayMillis(loadExceptionCount))
	//*   0    0:aload_0         
	//*   1    1:getfield        #125 <Field ManifestFetcher$ManifestIOException loadException>
	//*   2    4:ifnull          29
	//*   3    7:invokestatic    #156 <Method long SystemClock.elapsedRealtime()>
	//*   4   10:aload_0         
	//*   5   11:getfield        #172 <Field long loadExceptionTimestamp>
	//*   6   14:aload_0         
	//*   7   15:aload_0         
	//*   8   16:getfield        #123 <Field int loadExceptionCount>
	//*   9   19:i2l             
	//*  10   20:invokespecial   #183 <Method long getRetryDelayMillis(long)>
	//*  11   23:ladd            
	//*  12   24:lcmp            
	//*  13   25:ifge            29
			return;
	//   14   28:return          
		if(loader == null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #115 <Field Loader loader>
	//*  17   33:ifnonnull       49
			loader = new Loader("manifestLoader");
	//   18   36:aload_0         
	//   19   37:new             #117 <Class Loader>
	//   20   40:dup             
	//   21   41:ldc1            #185 <String "manifestLoader">
	//   22   43:invokespecial   #188 <Method void Loader(String)>
	//   23   46:putfield        #115 <Field Loader loader>
		if(!loader.isLoading())
	//*  24   49:aload_0         
	//*  25   50:getfield        #115 <Field Loader loader>
	//*  26   53:invokevirtual   #192 <Method boolean Loader.isLoading()>
	//*  27   56:ifne            105
		{
			currentLoadable = new UriLoadable(manifestUri, uriDataSource, parser);
	//   28   59:aload_0         
	//   29   60:new             #146 <Class UriLoadable>
	//   30   63:dup             
	//   31   64:aload_0         
	//   32   65:getfield        #72  <Field String manifestUri>
	//   33   68:aload_0         
	//   34   69:getfield        #74  <Field UriDataSource uriDataSource>
	//   35   72:aload_0         
	//   36   73:getfield        #70  <Field com.google.android.exoplayer.upstream.UriLoadable$Parser parser>
	//   37   76:invokespecial   #194 <Method void UriLoadable(String, UriDataSource, com.google.android.exoplayer.upstream.UriLoadable$Parser)>
	//   38   79:putfield        #144 <Field UriLoadable currentLoadable>
			currentLoadStartTimestamp = SystemClock.elapsedRealtime();
	//   39   82:aload_0         
	//   40   83:invokestatic    #156 <Method long SystemClock.elapsedRealtime()>
	//   41   86:putfield        #151 <Field long currentLoadStartTimestamp>
			loader.startLoading(((com.google.android.exoplayer.upstream.Loader.Loadable) (currentLoadable)), ((com.google.android.exoplayer.upstream.Loader.Callback) (this)));
	//   42   89:aload_0         
	//   43   90:getfield        #115 <Field Loader loader>
	//   44   93:aload_0         
	//   45   94:getfield        #144 <Field UriLoadable currentLoadable>
	//   46   97:aload_0         
	//   47   98:invokevirtual   #198 <Method void Loader.startLoading(com.google.android.exoplayer.upstream.Loader$Loadable, com.google.android.exoplayer.upstream.Loader$Callback)>
			notifyManifestRefreshStarted();
	//   48  101:aload_0         
	//   49  102:invokespecial   #200 <Method void notifyManifestRefreshStarted()>
		}
	//   50  105:return          
	}

	public void singleLoad(Looper looper, ManifestCallback manifestcallback)
	{
		(new SingleFetchHelper(new UriLoadable(manifestUri, uriDataSource, parser), looper, manifestcallback)).startLoading();
	//    0    0:new             #27  <Class ManifestFetcher$SingleFetchHelper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:new             #146 <Class UriLoadable>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #72  <Field String manifestUri>
	//    7   13:aload_0         
	//    8   14:getfield        #74  <Field UriDataSource uriDataSource>
	//    9   17:aload_0         
	//   10   18:getfield        #70  <Field com.google.android.exoplayer.upstream.UriLoadable$Parser parser>
	//   11   21:invokespecial   #194 <Method void UriLoadable(String, UriDataSource, com.google.android.exoplayer.upstream.UriLoadable$Parser)>
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokespecial   #205 <Method void ManifestFetcher$SingleFetchHelper(ManifestFetcher, UriLoadable, Looper, ManifestFetcher$ManifestCallback)>
	//   15   29:invokevirtual   #207 <Method void ManifestFetcher$SingleFetchHelper.startLoading()>
	//   16   32:return          
	}

	public void updateManifestUri(String s)
	{
		manifestUri = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field String manifestUri>
	//    3    5:return          
	}

	private long currentLoadStartTimestamp;
	private UriLoadable currentLoadable;
	private int enabledCount;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private ManifestIOException loadException;
	private int loadExceptionCount;
	private long loadExceptionTimestamp;
	private Loader loader;
	private volatile Object manifest;
	private volatile long manifestLoadCompleteTimestamp;
	private volatile long manifestLoadStartTimestamp;
	volatile String manifestUri;
	private final com.google.android.exoplayer.upstream.UriLoadable.Parser parser;
	private final UriDataSource uriDataSource;


/*
	static EventListener access$000(ManifestFetcher manifestfetcher)
	{
		return manifestfetcher.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field ManifestFetcher$EventListener eventListener>
	//    2    4:areturn         
	}

*/
}
