// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.upstream.DataSpec;
import java.io.IOException;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource, AdsLoader

private final class AdsMediaSource$AdPrepareErrorListener
	implements com.google.android.exoplayer2.source.er
{

	public void onPrepareError(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, final IOException exception)
	{
		AdsMediaSource.access$700(AdsMediaSource.this, mediaperiodid).loadError(new DataSpec(adUri), 6, -1L, 0L, 0L, ((IOException) (AdsMediaSource.AdLoadException.createForAd(((Exception) (exception))))), true);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field AdsMediaSource this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #41  <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher AdsMediaSource.access$700(AdsMediaSource, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    4    8:new             #43  <Class DataSpec>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Uri adUri>
	//    8   16:invokespecial   #46  <Method void DataSpec(Uri)>
	//    9   19:bipush          6
	//   10   21:ldc2w           #47  <Long -1L>
	//   11   24:lconst_0        
	//   12   25:lconst_0        
	//   13   26:aload_2         
	//   14   27:invokestatic    #54  <Method AdsMediaSource$AdLoadException AdsMediaSource$AdLoadException.createForAd(Exception)>
	//   15   30:iconst_1        
	//   16   31:invokevirtual   #60  <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(DataSpec, int, long, long, long, IOException, boolean)>
		AdsMediaSource.access$1000(AdsMediaSource.this).post(new Runnable() {

			public void run()
			{
				AdsMediaSource.access$100(this$0).handlePrepareError(adGroupIndex, adIndexInAdGroup, exception);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
			//    2    4:getfield        #33  <Field AdsMediaSource AdsMediaSource$AdPrepareErrorListener.this$0>
			//    3    7:invokestatic    #37  <Method AdsLoader AdsMediaSource.access$100(AdsMediaSource)>
			//    4   10:aload_0         
			//    5   11:getfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
			//    6   14:invokestatic    #41  <Method int AdsMediaSource$AdPrepareErrorListener.access$800(AdsMediaSource$AdPrepareErrorListener)>
			//    7   17:aload_0         
			//    8   18:getfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
			//    9   21:invokestatic    #44  <Method int AdsMediaSource$AdPrepareErrorListener.access$900(AdsMediaSource$AdPrepareErrorListener)>
			//   10   24:aload_0         
			//   11   25:getfield        #24  <Field IOException val$exception>
			//   12   28:invokeinterface #50  <Method void AdsLoader.handlePrepareError(int, int, IOException)>
			//   13   33:return          
			}

			final AdsMediaSource.AdPrepareErrorListener this$1;
			final IOException val$exception;

			
			{
				this$1 = AdsMediaSource.AdPrepareErrorListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
				exception = ioexception;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field IOException val$exception>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   17   34:aload_0         
	//   18   35:getfield        #22  <Field AdsMediaSource this$0>
	//   19   38:invokestatic    #64  <Method Handler AdsMediaSource.access$1000(AdsMediaSource)>
	//   20   41:new             #11  <Class AdsMediaSource$AdPrepareErrorListener$1>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:aload_2         
	//   24   47:invokespecial   #67  <Method void AdsMediaSource$AdPrepareErrorListener$1(AdsMediaSource$AdPrepareErrorListener, IOException)>
	//   25   50:invokevirtual   #73  <Method boolean Handler.post(Runnable)>
	//   26   53:pop             
	//   27   54:return          
	}

	private final int adGroupIndex;
	private final int adIndexInAdGroup;
	private final Uri adUri;
	final AdsMediaSource this$0;


/*
	static int access$800(AdsMediaSource$AdPrepareErrorListener adsmediasource$adprepareerrorlistener)
	{
		return adsmediasource$adprepareerrorlistener.adGroupIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int adGroupIndex>
	//    2    4:ireturn         
	}

*/


/*
	static int access$900(AdsMediaSource$AdPrepareErrorListener adsmediasource$adprepareerrorlistener)
	{
		return adsmediasource$adprepareerrorlistener.adIndexInAdGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field int adIndexInAdGroup>
	//    2    4:ireturn         
	}

*/

	public AdsMediaSource$AdPrepareErrorListener(Uri uri, int i, int j)
	{
		this$0 = AdsMediaSource.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AdsMediaSource this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #25  <Method void Object()>
		adUri = uri;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Uri adUri>
		adGroupIndex = i;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #29  <Field int adGroupIndex>
		adIndexInAdGroup = j;
	//   11   19:aload_0         
	//   12   20:iload           4
	//   13   22:putfield        #31  <Field int adIndexInAdGroup>
	//   14   25:return          
	}
}
