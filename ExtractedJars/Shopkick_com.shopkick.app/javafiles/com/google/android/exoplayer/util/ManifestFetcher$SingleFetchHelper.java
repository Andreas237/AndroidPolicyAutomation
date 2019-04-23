// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer.upstream.Loader;
import com.google.android.exoplayer.upstream.UriLoadable;
import java.io.IOException;
import java.util.concurrent.CancellationException;

// Referenced classes of package com.google.android.exoplayer.util:
//			ManifestFetcher

private class ManifestFetcher$SingleFetchHelper
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
		loadable = ((com.google.android.exoplayer.upstream.Loader.Loadable) (new n(((Throwable) (new CancellationException())))));
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
	private final ManifestFetcher.ManifestCallback wrappedCallback;

	public ManifestFetcher$SingleFetchHelper(UriLoadable uriloadable, Looper looper, ManifestFetcher.ManifestCallback manifestcallback)
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
