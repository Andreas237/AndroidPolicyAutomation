// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.*;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.*;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsLoader, AdPlaybackState, SinglePeriodAdTimeline

public final class AdsMediaSource extends CompositeMediaSource
{
	public static final class AdLoadException extends IOException
	{

		public static AdLoadException createForAd(Exception exception)
		{
			return new AdLoadException(0, exception);
		//    0    0:new             #2   <Class AdsMediaSource$AdLoadException>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
		//    5    9:areturn         
		}

		public static AdLoadException createForAdGroup(Exception exception, int i)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #36  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #39  <Method void StringBuilder()>
		//    3    7:astore_2        
			stringbuilder.append("Failed to load ad group ");
		//    4    8:aload_2         
		//    5    9:ldc1            #41  <String "Failed to load ad group ">
		//    6   11:invokevirtual   #45  <Method StringBuilder StringBuilder.append(String)>
		//    7   14:pop             
			stringbuilder.append(i);
		//    8   15:aload_2         
		//    9   16:iload_1         
		//   10   17:invokevirtual   #48  <Method StringBuilder StringBuilder.append(int)>
		//   11   20:pop             
			return new AdLoadException(1, ((Exception) (new IOException(stringbuilder.toString(), ((Throwable) (exception))))));
		//   12   21:new             #2   <Class AdsMediaSource$AdLoadException>
		//   13   24:dup             
		//   14   25:iconst_1        
		//   15   26:new             #4   <Class IOException>
		//   16   29:dup             
		//   17   30:aload_2         
		//   18   31:invokevirtual   #52  <Method String StringBuilder.toString()>
		//   19   34:aload_0         
		//   20   35:invokespecial   #55  <Method void IOException(String, Throwable)>
		//   21   38:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
		//   22   41:areturn         
		}

		public static AdLoadException createForAllAds(Exception exception)
		{
			return new AdLoadException(2, exception);
		//    0    0:new             #2   <Class AdsMediaSource$AdLoadException>
		//    1    3:dup             
		//    2    4:iconst_2        
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
		//    5    9:areturn         
		}

		public static AdLoadException createForUnexpected(RuntimeException runtimeexception)
		{
			return new AdLoadException(3, ((Exception) (runtimeexception)));
		//    0    0:new             #2   <Class AdsMediaSource$AdLoadException>
		//    1    3:dup             
		//    2    4:iconst_3        
		//    3    5:aload_0         
		//    4    6:invokespecial   #32  <Method void AdsMediaSource$AdLoadException(int, Exception)>
		//    5    9:areturn         
		}

		public RuntimeException getRuntimeExceptionForUnexpected()
		{
			boolean flag;
			if(type == 3)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field int type>
		//*   2    4:iconst_3        
		//*   3    5:icmpne          13
				flag = true;
		//    4    8:iconst_1        
		//    5    9:istore_1        
			else
		//*   6   10:goto            15
				flag = false;
		//    7   13:iconst_0        
		//    8   14:istore_1        
			Assertions.checkState(flag);
		//    9   15:iload_1         
		//   10   16:invokestatic    #66  <Method void Assertions.checkState(boolean)>
			return (RuntimeException)getCause();
		//   11   19:aload_0         
		//   12   20:invokevirtual   #70  <Method Throwable getCause()>
		//   13   23:checkcast       #72  <Class RuntimeException>
		//   14   26:areturn         
		}

		public static final int TYPE_AD = 0;
		public static final int TYPE_AD_GROUP = 1;
		public static final int TYPE_ALL_ADS = 2;
		public static final int TYPE_UNEXPECTED = 3;
		public final int type;

		private AdLoadException(int i, Exception exception)
		{
			super(((Throwable) (exception)));
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:invokespecial   #25  <Method void IOException(Throwable)>
			type = i;
		//    3    5:aload_0         
		//    4    6:iload_1         
		//    5    7:putfield        #27  <Field int type>
		//    6   10:return          
		}
	}

	public static interface AdLoadException.Type
		extends Annotation
	{
	}

	private final class AdPrepareErrorListener
		implements com.google.android.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener
	{

		public void onPrepareError(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, IOException ioexception)
		{
			createEventDispatcher(mediaperiodid).loadError(new DataSpec(adUri), 6, -1L, 0L, 0L, ((IOException) (AdLoadException.createForAd(((Exception) (ioexception))))), true);
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
			mainHandler.post(((_cls1) (ioexception)). new Runnable() {

				public void run()
				{
					adsLoader.handlePrepareError(adGroupIndex, adIndexInAdGroup, exception);
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

				final AdPrepareErrorListener this$1;
				final IOException val$exception;

			
			{
				this$1 = final_adprepareerrorlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AdsMediaSource$AdPrepareErrorListener this$1>
				exception = IOException.this;
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
		static int access$800(AdPrepareErrorListener adprepareerrorlistener)
		{
			return adprepareerrorlistener.adGroupIndex;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field int adGroupIndex>
		//    2    4:ireturn         
		}

*/


/*
		static int access$900(AdPrepareErrorListener adprepareerrorlistener)
		{
			return adprepareerrorlistener.adIndexInAdGroup;
		//    0    0:aload_0         
		//    1    1:getfield        #31  <Field int adIndexInAdGroup>
		//    2    4:ireturn         
		}

*/

		public AdPrepareErrorListener(Uri uri, int i, int j)
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

	private final class ComponentListener
		implements AdsLoader.EventListener
	{

		public void onAdClicked()
		{
			if(released)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field boolean released>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			if(eventHandler != null && eventListener != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #27  <Field AdsMediaSource this$0>
		//*   6   12:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
		//*   7   15:ifnull          47
		//*   8   18:aload_0         
		//*   9   19:getfield        #27  <Field AdsMediaSource this$0>
		//*  10   22:invokestatic    #49  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
		//*  11   25:ifnull          47
				eventHandler.post(new Runnable() {

					public void run()
					{
						if(!released)
					//*   0    0:aload_0         
					//*   1    1:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
					//*   2    4:invokestatic    #28  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
					//*   3    7:ifne            25
							eventListener.onAdClicked();
					//    4   10:aload_0         
					//    5   11:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
					//    6   14:getfield        #32  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
					//    7   17:invokestatic    #36  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
					//    8   20:invokeinterface #39  <Method void AdsMediaSource$EventListener.onAdClicked()>
					//    9   25:return          
					}

					final ComponentListener this$1;

			
			{
				this$1 = ComponentListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AdsMediaSource$ComponentListener this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//   12   28:aload_0         
		//   13   29:getfield        #27  <Field AdsMediaSource this$0>
		//   14   32:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
		//   15   35:new             #13  <Class AdsMediaSource$ComponentListener$2>
		//   16   38:dup             
		//   17   39:aload_0         
		//   18   40:invokespecial   #52  <Method void AdsMediaSource$ComponentListener$2(AdsMediaSource$ComponentListener)>
		//   19   43:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
		//   20   46:pop             
		//   21   47:return          
		}

		public void onAdLoadError(AdLoadException adloadexception, DataSpec dataspec)
		{
			if(released)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field boolean released>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			createEventDispatcher(((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (null))).loadError(dataspec, 6, -1L, 0L, 0L, ((IOException) (adloadexception)), true);
		//    4    8:aload_0         
		//    5    9:getfield        #27  <Field AdsMediaSource this$0>
		//    6   12:aconst_null     
		//    7   13:invokestatic    #62  <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher AdsMediaSource.access$600(AdsMediaSource, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
		//    8   16:aload_2         
		//    9   17:bipush          6
		//   10   19:ldc2w           #63  <Long -1L>
		//   11   22:lconst_0        
		//   12   23:lconst_0        
		//   13   24:aload_1         
		//   14   25:iconst_1        
		//   15   26:invokevirtual   #70  <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(DataSpec, int, long, long, long, IOException, boolean)>
			if(eventHandler != null && eventListener != null)
		//*  16   29:aload_0         
		//*  17   30:getfield        #27  <Field AdsMediaSource this$0>
		//*  18   33:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
		//*  19   36:ifnull          69
		//*  20   39:aload_0         
		//*  21   40:getfield        #27  <Field AdsMediaSource this$0>
		//*  22   43:invokestatic    #49  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
		//*  23   46:ifnull          69
				eventHandler.post(((_cls4) (adloadexception)). new Runnable() {

					public void run()
					{
						if(!released)
					//*   0    0:aload_0         
					//*   1    1:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
					//*   2    4:invokestatic    #33  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
					//*   3    7:ifne            63
						{
							if(error.type == 3)
					//*   4   10:aload_0         
					//*   5   11:getfield        #24  <Field AdsMediaSource$AdLoadException val$error>
					//*   6   14:getfield        #39  <Field int AdsMediaSource$AdLoadException.type>
					//*   7   17:iconst_3        
					//*   8   18:icmpne          44
							{
								eventListener.onInternalAdLoadError(error.getRuntimeExceptionForUnexpected());
					//    9   21:aload_0         
					//   10   22:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
					//   11   25:getfield        #43  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
					//   12   28:invokestatic    #47  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
					//   13   31:aload_0         
					//   14   32:getfield        #24  <Field AdsMediaSource$AdLoadException val$error>
					//   15   35:invokevirtual   #51  <Method RuntimeException AdsMediaSource$AdLoadException.getRuntimeExceptionForUnexpected()>
					//   16   38:invokeinterface #57  <Method void AdsMediaSource$EventListener.onInternalAdLoadError(RuntimeException)>
								return;
					//   17   43:return          
							}
							eventListener.onAdLoadError(((IOException) (error)));
					//   18   44:aload_0         
					//   19   45:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
					//   20   48:getfield        #43  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
					//   21   51:invokestatic    #47  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
					//   22   54:aload_0         
					//   23   55:getfield        #24  <Field AdsMediaSource$AdLoadException val$error>
					//   24   58:invokeinterface #60  <Method void AdsMediaSource$EventListener.onAdLoadError(IOException)>
						}
					//   25   63:return          
					}

					final ComponentListener this$1;
					final AdLoadException val$error;

			
			{
				this$1 = final_componentlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AdsMediaSource$ComponentListener this$1>
				error = AdLoadException.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AdsMediaSource$AdLoadException val$error>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//   24   49:aload_0         
		//   25   50:getfield        #27  <Field AdsMediaSource this$0>
		//   26   53:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
		//   27   56:new             #17  <Class AdsMediaSource$ComponentListener$4>
		//   28   59:dup             
		//   29   60:aload_0         
		//   30   61:aload_1         
		//   31   62:invokespecial   #73  <Method void AdsMediaSource$ComponentListener$4(AdsMediaSource$ComponentListener, AdsMediaSource$AdLoadException)>
		//   32   65:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
		//   33   68:pop             
		//   34   69:return          
		}

		public void onAdPlaybackState(AdPlaybackState adplaybackstate)
		{
			if(released)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field boolean released>
		//*   2    4:ifeq            8
			{
				return;
		//    3    7:return          
			} else
			{
				playerHandler.post(((_cls1) (adplaybackstate)). new Runnable() {

					public void run()
					{
						if(released)
					//*   0    0:aload_0         
					//*   1    1:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
					//*   2    4:invokestatic    #33  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
					//*   3    7:ifeq            11
						{
							return;
					//    4   10:return          
						} else
						{
							onAdPlaybackState(adPlaybackState);
					//    5   11:aload_0         
					//    6   12:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
					//    7   15:getfield        #37  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
					//    8   18:aload_0         
					//    9   19:getfield        #24  <Field AdPlaybackState val$adPlaybackState>
					//   10   22:invokestatic    #41  <Method void AdsMediaSource.access$300(AdsMediaSource, AdPlaybackState)>
							return;
					//   11   25:return          
						}
					}

					final ComponentListener this$1;
					final AdPlaybackState val$adPlaybackState;

			
			{
				this$1 = final_componentlistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AdsMediaSource$ComponentListener this$1>
				adPlaybackState = AdPlaybackState.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field AdPlaybackState val$adPlaybackState>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
				}
);
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field Handler playerHandler>
		//    6   12:new             #11  <Class AdsMediaSource$ComponentListener$1>
		//    7   15:dup             
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:invokespecial   #78  <Method void AdsMediaSource$ComponentListener$1(AdsMediaSource$ComponentListener, AdPlaybackState)>
		//   11   21:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
		//   12   24:pop             
				return;
		//   13   25:return          
			}
		}

		public void onAdTapped()
		{
			if(released)
		//*   0    0:aload_0         
		//*   1    1:getfield        #40  <Field boolean released>
		//*   2    4:ifeq            8
				return;
		//    3    7:return          
			if(eventHandler != null && eventListener != null)
		//*   4    8:aload_0         
		//*   5    9:getfield        #27  <Field AdsMediaSource this$0>
		//*   6   12:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
		//*   7   15:ifnull          47
		//*   8   18:aload_0         
		//*   9   19:getfield        #27  <Field AdsMediaSource this$0>
		//*  10   22:invokestatic    #49  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
		//*  11   25:ifnull          47
				eventHandler.post(new Runnable() {

					public void run()
					{
						if(!released)
					//*   0    0:aload_0         
					//*   1    1:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
					//*   2    4:invokestatic    #28  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
					//*   3    7:ifne            25
							eventListener.onAdTapped();
					//    4   10:aload_0         
					//    5   11:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
					//    6   14:getfield        #32  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
					//    7   17:invokestatic    #36  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
					//    8   20:invokeinterface #39  <Method void AdsMediaSource$EventListener.onAdTapped()>
					//    9   25:return          
					}

					final ComponentListener this$1;

			
			{
				this$1 = ComponentListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field AdsMediaSource$ComponentListener this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
				}
);
		//   12   28:aload_0         
		//   13   29:getfield        #27  <Field AdsMediaSource this$0>
		//   14   32:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
		//   15   35:new             #15  <Class AdsMediaSource$ComponentListener$3>
		//   16   38:dup             
		//   17   39:aload_0         
		//   18   40:invokespecial   #80  <Method void AdsMediaSource$ComponentListener$3(AdsMediaSource$ComponentListener)>
		//   19   43:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
		//   20   46:pop             
		//   21   47:return          
		}

		public void release()
		{
			released = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #40  <Field boolean released>
			playerHandler.removeCallbacksAndMessages(((Object) (null)));
		//    3    5:aload_0         
		//    4    6:getfield        #35  <Field Handler playerHandler>
		//    5    9:aconst_null     
		//    6   10:invokevirtual   #85  <Method void Handler.removeCallbacksAndMessages(Object)>
		//    7   13:return          
		}

		private final Handler playerHandler = new Handler();
		private volatile boolean released;
		final AdsMediaSource this$0;


/*
		static boolean access$200(ComponentListener componentlistener)
		{
			return componentlistener.released;
		//    0    0:aload_0         
		//    1    1:getfield        #40  <Field boolean released>
		//    2    4:ireturn         
		}

*/

		public ComponentListener()
		{
			this$0 = AdsMediaSource.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field AdsMediaSource this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #30  <Method void Object()>
		//    5    9:aload_0         
		//    6   10:new             #32  <Class Handler>
		//    7   13:dup             
		//    8   14:invokespecial   #33  <Method void Handler()>
		//    9   17:putfield        #35  <Field Handler playerHandler>
		//   10   20:return          
		}
	}

	public static interface EventListener
	{

		public abstract void onAdClicked();

		public abstract void onAdLoadError(IOException ioexception);

		public abstract void onAdTapped();

		public abstract void onInternalAdLoadError(RuntimeException runtimeexception);
	}

	public static interface MediaSourceFactory
	{

		public abstract MediaSource createMediaSource(Uri uri);

		public abstract int[] getSupportedTypes();
	}


	public AdsMediaSource(MediaSource mediasource, MediaSourceFactory mediasourcefactory, AdsLoader adsloader, ViewGroup viewgroup)
	{
		this(mediasource, mediasourcefactory, adsloader, viewgroup, ((Handler) (null)), ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aconst_null     
	//    6    7:aconst_null     
	//    7    8:invokespecial   #77  <Method void AdsMediaSource(MediaSource, AdsMediaSource$MediaSourceFactory, AdsLoader, ViewGroup, Handler, AdsMediaSource$EventListener)>
	//    8   11:return          
	}

	public AdsMediaSource(MediaSource mediasource, MediaSourceFactory mediasourcefactory, AdsLoader adsloader, ViewGroup viewgroup, Handler handler, EventListener eventlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void CompositeMediaSource()>
		contentMediaSource = mediasource;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #84  <Field MediaSource contentMediaSource>
		adMediaSourceFactory = mediasourcefactory;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #86  <Field AdsMediaSource$MediaSourceFactory adMediaSourceFactory>
		adsLoader = adsloader;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #88  <Field AdsLoader adsLoader>
		adUiViewGroup = viewgroup;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #90  <Field ViewGroup adUiViewGroup>
		eventHandler = handler;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #92  <Field Handler eventHandler>
		eventListener = eventlistener;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #94  <Field AdsMediaSource$EventListener eventListener>
		mainHandler = new Handler(Looper.getMainLooper());
	//   20   37:aload_0         
	//   21   38:new             #96  <Class Handler>
	//   22   41:dup             
	//   23   42:invokestatic    #102 <Method Looper Looper.getMainLooper()>
	//   24   45:invokespecial   #105 <Method void Handler(Looper)>
	//   25   48:putfield        #107 <Field Handler mainHandler>
		deferredMediaPeriodByAdMediaSource = ((Map) (new HashMap()));
	//   26   51:aload_0         
	//   27   52:new             #109 <Class HashMap>
	//   28   55:dup             
	//   29   56:invokespecial   #110 <Method void HashMap()>
	//   30   59:putfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
		period = new com.google.android.exoplayer2.Timeline.Period();
	//   31   62:aload_0         
	//   32   63:new             #114 <Class com.google.android.exoplayer2.Timeline$Period>
	//   33   66:dup             
	//   34   67:invokespecial   #115 <Method void com.google.android.exoplayer2.Timeline$Period()>
	//   35   70:putfield        #117 <Field com.google.android.exoplayer2.Timeline$Period period>
		adGroupMediaSources = new MediaSource[0][];
	//   36   73:aload_0         
	//   37   74:iconst_0        
	//   38   75:anewarray       MediaSource[][]
	//   39   78:putfield        #121 <Field MediaSource[][] adGroupMediaSources>
		adDurationsUs = new long[0][];
	//   40   81:aload_0         
	//   41   82:iconst_0        
	//   42   83:anewarray       long[][]
	//   43   86:putfield        #125 <Field long[][] adDurationsUs>
		adsloader.setSupportedContentTypes(mediasourcefactory.getSupportedTypes());
	//   44   89:aload_3         
	//   45   90:aload_2         
	//   46   91:invokeinterface #129 <Method int[] AdsMediaSource$MediaSourceFactory.getSupportedTypes()>
	//   47   96:invokeinterface #135 <Method void AdsLoader.setSupportedContentTypes(int[])>
	//   48  101:return          
	}

	public AdsMediaSource(MediaSource mediasource, com.google.android.exoplayer2.upstream.DataSource.Factory factory, AdsLoader adsloader, ViewGroup viewgroup)
	{
		this(mediasource, ((MediaSourceFactory) (new com.google.android.exoplayer2.source.ExtractorMediaSource.Factory(factory))), adsloader, viewgroup, ((Handler) (null)), ((EventListener) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #140 <Class com.google.android.exoplayer2.source.ExtractorMediaSource$Factory>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #143 <Method void com.google.android.exoplayer2.source.ExtractorMediaSource$Factory(com.google.android.exoplayer2.upstream.DataSource$Factory)>
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aconst_null     
	//    9   14:aconst_null     
	//   10   15:invokespecial   #77  <Method void AdsMediaSource(MediaSource, AdsMediaSource$MediaSourceFactory, AdsLoader, ViewGroup, Handler, AdsMediaSource$EventListener)>
	//   11   18:return          
	}

	public AdsMediaSource(MediaSource mediasource, com.google.android.exoplayer2.upstream.DataSource.Factory factory, AdsLoader adsloader, ViewGroup viewgroup, Handler handler, EventListener eventlistener)
	{
		this(mediasource, ((MediaSourceFactory) (new com.google.android.exoplayer2.source.ExtractorMediaSource.Factory(factory))), adsloader, viewgroup, handler, eventlistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #140 <Class com.google.android.exoplayer2.source.ExtractorMediaSource$Factory>
	//    3    5:dup             
	//    4    6:aload_2         
	//    5    7:invokespecial   #143 <Method void com.google.android.exoplayer2.source.ExtractorMediaSource$Factory(com.google.android.exoplayer2.upstream.DataSource$Factory)>
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:aload           5
	//    9   15:aload           6
	//   10   17:invokespecial   #77  <Method void AdsMediaSource(MediaSource, AdsMediaSource$MediaSourceFactory, AdsLoader, ViewGroup, Handler, AdsMediaSource$EventListener)>
	//   11   20:return          
	}

	private void maybeUpdateSourceInfo()
	{
		if(adPlaybackState != null && contentTimeline != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AdPlaybackState adPlaybackState>
	//*   2    4:ifnull          72
	//*   3    7:aload_0         
	//*   4    8:getfield        #171 <Field Timeline contentTimeline>
	//*   5   11:ifnull          72
		{
			adPlaybackState = adPlaybackState.withAdDurationsUs(adDurationsUs);
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #169 <Field AdPlaybackState adPlaybackState>
	//    9   19:aload_0         
	//   10   20:getfield        #125 <Field long[][] adDurationsUs>
	//   11   23:invokevirtual   #177 <Method AdPlaybackState AdPlaybackState.withAdDurationsUs(long[][])>
	//   12   26:putfield        #169 <Field AdPlaybackState adPlaybackState>
			Object obj;
			if(adPlaybackState.adGroupCount == 0)
	//*  13   29:aload_0         
	//*  14   30:getfield        #169 <Field AdPlaybackState adPlaybackState>
	//*  15   33:getfield        #181 <Field int AdPlaybackState.adGroupCount>
	//*  16   36:ifne            47
				obj = ((Object) (contentTimeline));
	//   17   39:aload_0         
	//   18   40:getfield        #171 <Field Timeline contentTimeline>
	//   19   43:astore_1        
			else
	//*  20   44:goto            63
				obj = ((Object) (new SinglePeriodAdTimeline(contentTimeline, adPlaybackState)));
	//   21   47:new             #183 <Class SinglePeriodAdTimeline>
	//   22   50:dup             
	//   23   51:aload_0         
	//   24   52:getfield        #171 <Field Timeline contentTimeline>
	//   25   55:aload_0         
	//   26   56:getfield        #169 <Field AdPlaybackState adPlaybackState>
	//   27   59:invokespecial   #186 <Method void SinglePeriodAdTimeline(Timeline, AdPlaybackState)>
	//   28   62:astore_1        
			refreshSourceInfo(((Timeline) (obj)), contentManifest);
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:aload_0         
	//   32   66:getfield        #188 <Field Object contentManifest>
	//   33   69:invokevirtual   #192 <Method void refreshSourceInfo(Timeline, Object)>
		}
	//   34   72:return          
	}

	private void onAdPlaybackState(AdPlaybackState adplaybackstate)
	{
		if(adPlaybackState == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AdPlaybackState adPlaybackState>
	//*   2    4:ifnonnull       50
		{
			adGroupMediaSources = new MediaSource[adplaybackstate.adGroupCount][];
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:getfield        #181 <Field int AdPlaybackState.adGroupCount>
	//    6   12:anewarray       MediaSource[][]
	//    7   15:putfield        #121 <Field MediaSource[][] adGroupMediaSources>
			Arrays.fill(((Object []) (adGroupMediaSources)), ((Object) (new MediaSource[0])));
	//    8   18:aload_0         
	//    9   19:getfield        #121 <Field MediaSource[][] adGroupMediaSources>
	//   10   22:iconst_0        
	//   11   23:anewarray       MediaSource[]
	//   12   26:invokestatic    #200 <Method void Arrays.fill(Object[], Object)>
			adDurationsUs = new long[adplaybackstate.adGroupCount][];
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:getfield        #181 <Field int AdPlaybackState.adGroupCount>
	//   16   34:anewarray       long[][]
	//   17   37:putfield        #125 <Field long[][] adDurationsUs>
			Arrays.fill(((Object []) (adDurationsUs)), ((Object) (new long[0])));
	//   18   40:aload_0         
	//   19   41:getfield        #125 <Field long[][] adDurationsUs>
	//   20   44:iconst_0        
	//   21   45:newarray        long[]
	//   22   47:invokestatic    #200 <Method void Arrays.fill(Object[], Object)>
		}
		adPlaybackState = adplaybackstate;
	//   23   50:aload_0         
	//   24   51:aload_1         
	//   25   52:putfield        #169 <Field AdPlaybackState adPlaybackState>
		maybeUpdateSourceInfo();
	//   26   55:aload_0         
	//   27   56:invokespecial   #202 <Method void maybeUpdateSourceInfo()>
	//   28   59:return          
	}

	private void onAdSourceInfoRefreshed(MediaSource mediasource, int i, int j, Timeline timeline)
	{
		int k = timeline.getPeriodCount();
	//    0    0:aload           4
	//    1    2:invokevirtual   #210 <Method int Timeline.getPeriodCount()>
	//    2    5:istore          6
		boolean flag = false;
	//    3    7:iconst_0        
	//    4    8:istore          5
		boolean flag1 = true;
	//    5   10:iconst_1        
	//    6   11:istore          7
		if(k != 1)
	//*   7   13:iload           6
	//*   8   15:iconst_1        
	//*   9   16:icmpne          22
	//*  10   19:goto            25
			flag1 = false;
	//   11   22:iconst_0        
	//   12   23:istore          7
		Assertions.checkArgument(flag1);
	//   13   25:iload           7
	//   14   27:invokestatic    #216 <Method void Assertions.checkArgument(boolean)>
		adDurationsUs[i][j] = timeline.getPeriod(0, period).getDurationUs();
	//   15   30:aload_0         
	//   16   31:getfield        #125 <Field long[][] adDurationsUs>
	//   17   34:iload_2         
	//   18   35:aaload          
	//   19   36:iload_3         
	//   20   37:aload           4
	//   21   39:iconst_0        
	//   22   40:aload_0         
	//   23   41:getfield        #117 <Field com.google.android.exoplayer2.Timeline$Period period>
	//   24   44:invokevirtual   #220 <Method com.google.android.exoplayer2.Timeline$Period Timeline.getPeriod(int, com.google.android.exoplayer2.Timeline$Period)>
	//   25   47:invokevirtual   #224 <Method long com.google.android.exoplayer2.Timeline$Period.getDurationUs()>
	//   26   50:lastore         
		if(deferredMediaPeriodByAdMediaSource.containsKey(((Object) (mediasource))))
	//*  27   51:aload_0         
	//*  28   52:getfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
	//*  29   55:aload_1         
	//*  30   56:invokeinterface #230 <Method boolean Map.containsKey(Object)>
	//*  31   61:ifeq            125
		{
			timeline = ((Timeline) ((List)deferredMediaPeriodByAdMediaSource.get(((Object) (mediasource)))));
	//   32   64:aload_0         
	//   33   65:getfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
	//   34   68:aload_1         
	//   35   69:invokeinterface #234 <Method Object Map.get(Object)>
	//   36   74:checkcast       #236 <Class List>
	//   37   77:astore          4
			for(i = ((int) (flag)); i < ((List) (timeline)).size(); i++)
	//*  38   79:iload           5
	//*  39   81:istore_2        
	//*  40   82:iload_2         
	//*  41   83:aload           4
	//*  42   85:invokeinterface #239 <Method int List.size()>
	//*  43   90:icmpge          114
				((DeferredMediaPeriod)((List) (timeline)).get(i)).createPeriod();
	//   44   93:aload           4
	//   45   95:iload_2         
	//   46   96:invokeinterface #242 <Method Object List.get(int)>
	//   47  101:checkcast       #244 <Class DeferredMediaPeriod>
	//   48  104:invokevirtual   #247 <Method void DeferredMediaPeriod.createPeriod()>

	//   49  107:iload_2         
	//   50  108:iconst_1        
	//   51  109:iadd            
	//   52  110:istore_2        
	//*  53  111:goto            82
			deferredMediaPeriodByAdMediaSource.remove(((Object) (mediasource)));
	//   54  114:aload_0         
	//   55  115:getfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
	//   56  118:aload_1         
	//   57  119:invokeinterface #250 <Method Object Map.remove(Object)>
	//   58  124:pop             
		}
		maybeUpdateSourceInfo();
	//   59  125:aload_0         
	//   60  126:invokespecial   #202 <Method void maybeUpdateSourceInfo()>
	//   61  129:return          
	}

	private void onContentSourceInfoRefreshed(Timeline timeline, Object obj)
	{
		contentTimeline = timeline;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #171 <Field Timeline contentTimeline>
		contentManifest = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #188 <Field Object contentManifest>
		maybeUpdateSourceInfo();
	//    6   10:aload_0         
	//    7   11:invokespecial   #202 <Method void maybeUpdateSourceInfo()>
	//    8   14:return          
	}

	public MediaPeriod createPeriod(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, Allocator allocator)
	{
		if(adPlaybackState.adGroupCount > 0 && mediaperiodid.isAd())
	//*   0    0:aload_0         
	//*   1    1:getfield        #169 <Field AdPlaybackState adPlaybackState>
	//*   2    4:getfield        #181 <Field int AdPlaybackState.adGroupCount>
	//*   3    7:ifle            268
	//*   4   10:aload_1         
	//*   5   11:invokevirtual   #258 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*   6   14:ifeq            268
		{
			int i = mediaperiodid.adGroupIndex;
	//    7   17:aload_1         
	//    8   18:getfield        #261 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//    9   21:istore_3        
			int j = mediaperiodid.adIndexInAdGroup;
	//   10   22:aload_1         
	//   11   23:getfield        #264 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//   12   26:istore          4
			Uri uri = adPlaybackState.adGroups[i].uris[j];
	//   13   28:aload_0         
	//   14   29:getfield        #169 <Field AdPlaybackState adPlaybackState>
	//   15   32:getfield        #268 <Field AdPlaybackState$AdGroup[] AdPlaybackState.adGroups>
	//   16   35:iload_3         
	//   17   36:aaload          
	//   18   37:getfield        #274 <Field Uri[] AdPlaybackState$AdGroup.uris>
	//   19   40:iload           4
	//   20   42:aaload          
	//   21   43:astore          7
			if(adGroupMediaSources[i].length <= j)
	//*  22   45:aload_0         
	//*  23   46:getfield        #121 <Field MediaSource[][] adGroupMediaSources>
	//*  24   49:iload_3         
	//*  25   50:aaload          
	//*  26   51:arraylength     
	//*  27   52:iload           4
	//*  28   54:icmpgt          182
			{
				MediaSource mediasource = adMediaSourceFactory.createMediaSource(uri);
	//   29   57:aload_0         
	//   30   58:getfield        #86  <Field AdsMediaSource$MediaSourceFactory adMediaSourceFactory>
	//   31   61:aload           7
	//   32   63:invokeinterface #278 <Method MediaSource AdsMediaSource$MediaSourceFactory.createMediaSource(Uri)>
	//   33   68:astore          8
				int k = adGroupMediaSources[i].length;
	//   34   70:aload_0         
	//   35   71:getfield        #121 <Field MediaSource[][] adGroupMediaSources>
	//   36   74:iload_3         
	//   37   75:aaload          
	//   38   76:arraylength     
	//   39   77:istore          5
				if(j >= k)
	//*  40   79:iload           4
	//*  41   81:iload           5
	//*  42   83:icmplt          145
				{
					int l = j + 1;
	//   43   86:iload           4
	//   44   88:iconst_1        
	//   45   89:iadd            
	//   46   90:istore          6
					adGroupMediaSources[i] = (MediaSource[])Arrays.copyOf(((Object []) (adGroupMediaSources[i])), l);
	//   47   92:aload_0         
	//   48   93:getfield        #121 <Field MediaSource[][] adGroupMediaSources>
	//   49   96:iload_3         
	//   50   97:aload_0         
	//   51   98:getfield        #121 <Field MediaSource[][] adGroupMediaSources>
	//   52  101:iload_3         
	//   53  102:aaload          
	//   54  103:iload           6
	//   55  105:invokestatic    #282 <Method Object[] Arrays.copyOf(Object[], int)>
	//   56  108:checkcast       #119 <Class MediaSource[]>
	//   57  111:aastore         
					adDurationsUs[i] = Arrays.copyOf(adDurationsUs[i], l);
	//   58  112:aload_0         
	//   59  113:getfield        #125 <Field long[][] adDurationsUs>
	//   60  116:iload_3         
	//   61  117:aload_0         
	//   62  118:getfield        #125 <Field long[][] adDurationsUs>
	//   63  121:iload_3         
	//   64  122:aaload          
	//   65  123:iload           6
	//   66  125:invokestatic    #285 <Method long[] Arrays.copyOf(long[], int)>
	//   67  128:aastore         
					Arrays.fill(adDurationsUs[i], k, l, 0x1L);
	//   68  129:aload_0         
	//   69  130:getfield        #125 <Field long[][] adDurationsUs>
	//   70  133:iload_3         
	//   71  134:aaload          
	//   72  135:iload           5
	//   73  137:iload           6
	//   74  139:ldc2w           #286 <Long 0x1L>
	//   75  142:invokestatic    #290 <Method void Arrays.fill(long[], int, int, long)>
				}
				adGroupMediaSources[i][j] = mediasource;
	//   76  145:aload_0         
	//   77  146:getfield        #121 <Field MediaSource[][] adGroupMediaSources>
	//   78  149:iload_3         
	//   79  150:aaload          
	//   80  151:iload           4
	//   81  153:aload           8
	//   82  155:aastore         
				deferredMediaPeriodByAdMediaSource.put(((Object) (mediasource)), ((Object) (new ArrayList())));
	//   83  156:aload_0         
	//   84  157:getfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
	//   85  160:aload           8
	//   86  162:new             #292 <Class ArrayList>
	//   87  165:dup             
	//   88  166:invokespecial   #293 <Method void ArrayList()>
	//   89  169:invokeinterface #297 <Method Object Map.put(Object, Object)>
	//   90  174:pop             
				prepareChildSource(((Object) (mediaperiodid)), mediasource);
	//   91  175:aload_0         
	//   92  176:aload_1         
	//   93  177:aload           8
	//   94  179:invokevirtual   #301 <Method void prepareChildSource(Object, MediaSource)>
			}
			MediaSource mediasource1 = adGroupMediaSources[i][j];
	//   95  182:aload_0         
	//   96  183:getfield        #121 <Field MediaSource[][] adGroupMediaSources>
	//   97  186:iload_3         
	//   98  187:aaload          
	//   99  188:iload           4
	//  100  190:aaload          
	//  101  191:astore          8
			mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (new DeferredMediaPeriod(mediasource1, new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(0, mediaperiodid.windowSequenceNumber), allocator)));
	//  102  193:new             #244 <Class DeferredMediaPeriod>
	//  103  196:dup             
	//  104  197:aload           8
	//  105  199:new             #254 <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//  106  202:dup             
	//  107  203:iconst_0        
	//  108  204:aload_1         
	//  109  205:getfield        #305 <Field long com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.windowSequenceNumber>
	//  110  208:invokespecial   #308 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int, long)>
	//  111  211:aload_2         
	//  112  212:invokespecial   #311 <Method void DeferredMediaPeriod(MediaSource, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, Allocator)>
	//  113  215:astore_1        
			((DeferredMediaPeriod) (mediaperiodid)).setPrepareErrorListener(((com.google.android.exoplayer2.source.DeferredMediaPeriod.PrepareErrorListener) (new AdPrepareErrorListener(uri, i, j))));
	//  114  216:aload_1         
	//  115  217:new             #17  <Class AdsMediaSource$AdPrepareErrorListener>
	//  116  220:dup             
	//  117  221:aload_0         
	//  118  222:aload           7
	//  119  224:iload_3         
	//  120  225:iload           4
	//  121  227:invokespecial   #314 <Method void AdsMediaSource$AdPrepareErrorListener(AdsMediaSource, Uri, int, int)>
	//  122  230:invokevirtual   #318 <Method void DeferredMediaPeriod.setPrepareErrorListener(com.google.android.exoplayer2.source.DeferredMediaPeriod$PrepareErrorListener)>
			allocator = ((Allocator) ((List)deferredMediaPeriodByAdMediaSource.get(((Object) (mediasource1)))));
	//  123  233:aload_0         
	//  124  234:getfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
	//  125  237:aload           8
	//  126  239:invokeinterface #234 <Method Object Map.get(Object)>
	//  127  244:checkcast       #236 <Class List>
	//  128  247:astore_2        
			if(allocator == null)
	//* 129  248:aload_2         
	//* 130  249:ifnonnull       258
			{
				((DeferredMediaPeriod) (mediaperiodid)).createPeriod();
	//  131  252:aload_1         
	//  132  253:invokevirtual   #247 <Method void DeferredMediaPeriod.createPeriod()>
				return ((MediaPeriod) (mediaperiodid));
	//  133  256:aload_1         
	//  134  257:areturn         
			} else
			{
				((List) (allocator)).add(((Object) (mediaperiodid)));
	//  135  258:aload_2         
	//  136  259:aload_1         
	//  137  260:invokeinterface #321 <Method boolean List.add(Object)>
	//  138  265:pop             
				return ((MediaPeriod) (mediaperiodid));
	//  139  266:aload_1         
	//  140  267:areturn         
			}
		} else
		{
			mediaperiodid = ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (new DeferredMediaPeriod(contentMediaSource, mediaperiodid, allocator)));
	//  141  268:new             #244 <Class DeferredMediaPeriod>
	//  142  271:dup             
	//  143  272:aload_0         
	//  144  273:getfield        #84  <Field MediaSource contentMediaSource>
	//  145  276:aload_1         
	//  146  277:aload_2         
	//  147  278:invokespecial   #311 <Method void DeferredMediaPeriod(MediaSource, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, Allocator)>
	//  148  281:astore_1        
			((DeferredMediaPeriod) (mediaperiodid)).createPeriod();
	//  149  282:aload_1         
	//  150  283:invokevirtual   #247 <Method void DeferredMediaPeriod.createPeriod()>
			return ((MediaPeriod) (mediaperiodid));
	//  151  286:aload_1         
	//  152  287:areturn         
		}
	}

	protected com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid1)
	{
		if(mediaperiodid.isAd())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #258 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*   2    4:ifeq            9
			return mediaperiodid;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return mediaperiodid1;
	//    5    9:aload_2         
	//    6   10:areturn         
	}

	protected volatile com.google.android.exoplayer2.source.MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Object obj, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		return getMediaPeriodIdForChildMediaPeriodId((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId)obj, mediaperiodid);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #254 <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #327 <Method com.google.android.exoplayer2.source.MediaSource$MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    5    9:areturn         
	}

	protected void onChildSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid, MediaSource mediasource, Timeline timeline, Object obj)
	{
		if(mediaperiodid.isAd())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #258 <Method boolean com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.isAd()>
	//*   2    4:ifeq            22
		{
			onAdSourceInfoRefreshed(mediasource, mediaperiodid.adGroupIndex, mediaperiodid.adIndexInAdGroup, timeline);
	//    3    7:aload_0         
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:getfield        #261 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adGroupIndex>
	//    7   13:aload_1         
	//    8   14:getfield        #264 <Field int com.google.android.exoplayer2.source.MediaSource$MediaPeriodId.adIndexInAdGroup>
	//    9   17:aload_3         
	//   10   18:invokespecial   #331 <Method void onAdSourceInfoRefreshed(MediaSource, int, int, Timeline)>
			return;
	//   11   21:return          
		} else
		{
			onContentSourceInfoRefreshed(timeline, obj);
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:aload           4
	//   15   26:invokespecial   #333 <Method void onContentSourceInfoRefreshed(Timeline, Object)>
			return;
	//   16   29:return          
		}
	}

	protected volatile void onChildSourceInfoRefreshed(Object obj, MediaSource mediasource, Timeline timeline, Object obj1)
	{
		onChildSourceInfoRefreshed((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId)obj, mediasource, timeline, obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #254 <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #336 <Method void onChildSourceInfoRefreshed(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId, MediaSource, Timeline, Object)>
	//    7   12:return          
	}

	public void prepareSourceInternal(final ExoPlayer player, boolean flag)
	{
		super.prepareSourceInternal(player, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #340 <Method void CompositeMediaSource.prepareSourceInternal(ExoPlayer, boolean)>
		Assertions.checkArgument(flag);
	//    4    6:iload_2         
	//    5    7:invokestatic    #216 <Method void Assertions.checkArgument(boolean)>
		final ComponentListener componentListener = new ComponentListener();
	//    6   10:new             #22  <Class AdsMediaSource$ComponentListener>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #343 <Method void AdsMediaSource$ComponentListener(AdsMediaSource)>
	//   10   18:astore_3        
		this.componentListener = componentListener;
	//   11   19:aload_0         
	//   12   20:aload_3         
	//   13   21:putfield        #345 <Field AdsMediaSource$ComponentListener componentListener>
		prepareChildSource(((Object) (new com.google.android.exoplayer2.source.MediaSource.MediaPeriodId(0))), contentMediaSource);
	//   14   24:aload_0         
	//   15   25:new             #254 <Class com.google.android.exoplayer2.source.MediaSource$MediaPeriodId>
	//   16   28:dup             
	//   17   29:iconst_0        
	//   18   30:invokespecial   #348 <Method void com.google.android.exoplayer2.source.MediaSource$MediaPeriodId(int)>
	//   19   33:aload_0         
	//   20   34:getfield        #84  <Field MediaSource contentMediaSource>
	//   21   37:invokevirtual   #301 <Method void prepareChildSource(Object, MediaSource)>
		mainHandler.post(new Runnable() {

			public void run()
			{
				adsLoader.attachPlayer(player, ((AdsLoader.EventListener) (componentListener)), adUiViewGroup);
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field AdsMediaSource this$0>
			//    2    4:invokestatic    #34  <Method AdsLoader AdsMediaSource.access$100(AdsMediaSource)>
			//    3    7:aload_0         
			//    4    8:getfield        #23  <Field ExoPlayer val$player>
			//    5   11:aload_0         
			//    6   12:getfield        #25  <Field AdsMediaSource$ComponentListener val$componentListener>
			//    7   15:aload_0         
			//    8   16:getfield        #21  <Field AdsMediaSource this$0>
			//    9   19:invokestatic    #38  <Method ViewGroup AdsMediaSource.access$000(AdsMediaSource)>
			//   10   22:invokeinterface #44  <Method void AdsLoader.attachPlayer(ExoPlayer, AdsLoader$EventListener, ViewGroup)>
			//   11   27:return          
			}

			final AdsMediaSource this$0;
			final ComponentListener val$componentListener;
			final ExoPlayer val$player;

			
			{
				this$0 = AdsMediaSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field AdsMediaSource this$0>
				player = exoplayer;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field ExoPlayer val$player>
				componentListener = componentlistener;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field AdsMediaSource$ComponentListener val$componentListener>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
		}
);
	//   22   40:aload_0         
	//   23   41:getfield        #107 <Field Handler mainHandler>
	//   24   44:new             #7   <Class AdsMediaSource$1>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:aload_3         
	//   29   51:invokespecial   #351 <Method void AdsMediaSource$1(AdsMediaSource, ExoPlayer, AdsMediaSource$ComponentListener)>
	//   30   54:invokevirtual   #355 <Method boolean Handler.post(Runnable)>
	//   31   57:pop             
	//   32   58:return          
	}

	public void releasePeriod(MediaPeriod mediaperiod)
	{
		mediaperiod = ((MediaPeriod) ((DeferredMediaPeriod)mediaperiod));
	//    0    0:aload_1         
	//    1    1:checkcast       #244 <Class DeferredMediaPeriod>
	//    2    4:astore_1        
		List list = (List)deferredMediaPeriodByAdMediaSource.get(((Object) (((DeferredMediaPeriod) (mediaperiod)).mediaSource)));
	//    3    5:aload_0         
	//    4    6:getfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
	//    5    9:aload_1         
	//    6   10:getfield        #360 <Field MediaSource DeferredMediaPeriod.mediaSource>
	//    7   13:invokeinterface #234 <Method Object Map.get(Object)>
	//    8   18:checkcast       #236 <Class List>
	//    9   21:astore_2        
		if(list != null)
	//*  10   22:aload_2         
	//*  11   23:ifnull          34
			list.remove(((Object) (mediaperiod)));
	//   12   26:aload_2         
	//   13   27:aload_1         
	//   14   28:invokeinterface #362 <Method boolean List.remove(Object)>
	//   15   33:pop             
		((DeferredMediaPeriod) (mediaperiod)).releasePeriod();
	//   16   34:aload_1         
	//   17   35:invokevirtual   #364 <Method void DeferredMediaPeriod.releasePeriod()>
	//   18   38:return          
	}

	public void releaseSourceInternal()
	{
		super.releaseSourceInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #367 <Method void CompositeMediaSource.releaseSourceInternal()>
		componentListener.release();
	//    2    4:aload_0         
	//    3    5:getfield        #345 <Field AdsMediaSource$ComponentListener componentListener>
	//    4    8:invokevirtual   #370 <Method void AdsMediaSource$ComponentListener.release()>
		componentListener = null;
	//    5   11:aload_0         
	//    6   12:aconst_null     
	//    7   13:putfield        #345 <Field AdsMediaSource$ComponentListener componentListener>
		deferredMediaPeriodByAdMediaSource.clear();
	//    8   16:aload_0         
	//    9   17:getfield        #112 <Field Map deferredMediaPeriodByAdMediaSource>
	//   10   20:invokeinterface #373 <Method void Map.clear()>
		contentTimeline = null;
	//   11   25:aload_0         
	//   12   26:aconst_null     
	//   13   27:putfield        #171 <Field Timeline contentTimeline>
		contentManifest = null;
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:putfield        #188 <Field Object contentManifest>
		adPlaybackState = null;
	//   17   35:aload_0         
	//   18   36:aconst_null     
	//   19   37:putfield        #169 <Field AdPlaybackState adPlaybackState>
		adGroupMediaSources = new MediaSource[0][];
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:anewarray       MediaSource[][]
	//   23   45:putfield        #121 <Field MediaSource[][] adGroupMediaSources>
		adDurationsUs = new long[0][];
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:anewarray       long[][]
	//   27   53:putfield        #125 <Field long[][] adDurationsUs>
		mainHandler.post(new Runnable() {

			public void run()
			{
				adsLoader.detachPlayer();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field AdsMediaSource this$0>
			//    2    4:invokestatic    #25  <Method AdsLoader AdsMediaSource.access$100(AdsMediaSource)>
			//    3    7:invokeinterface #30  <Method void AdsLoader.detachPlayer()>
			//    4   12:return          
			}

			final AdsMediaSource this$0;

			
			{
				this$0 = AdsMediaSource.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AdsMediaSource this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   28   56:aload_0         
	//   29   57:getfield        #107 <Field Handler mainHandler>
	//   30   60:new             #9   <Class AdsMediaSource$2>
	//   31   63:dup             
	//   32   64:aload_0         
	//   33   65:invokespecial   #374 <Method void AdsMediaSource$2(AdsMediaSource)>
	//   34   68:invokevirtual   #355 <Method boolean Handler.post(Runnable)>
	//   35   71:pop             
	//   36   72:return          
	}

	private static final String TAG = "AdsMediaSource";
	private long adDurationsUs[][];
	private MediaSource adGroupMediaSources[][];
	private final MediaSourceFactory adMediaSourceFactory;
	private AdPlaybackState adPlaybackState;
	private final ViewGroup adUiViewGroup;
	private final AdsLoader adsLoader;
	private ComponentListener componentListener;
	private Object contentManifest;
	private final MediaSource contentMediaSource;
	private Timeline contentTimeline;
	private final Map deferredMediaPeriodByAdMediaSource;
	private final Handler eventHandler;
	private final EventListener eventListener;
	private final Handler mainHandler;
	private final com.google.android.exoplayer2.Timeline.Period period;


/*
	static ViewGroup access$000(AdsMediaSource adsmediasource)
	{
		return adsmediasource.adUiViewGroup;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field ViewGroup adUiViewGroup>
	//    2    4:areturn         
	}

*/


/*
	static AdsLoader access$100(AdsMediaSource adsmediasource)
	{
		return adsmediasource.adsLoader;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field AdsLoader adsLoader>
	//    2    4:areturn         
	}

*/


/*
	static Handler access$1000(AdsMediaSource adsmediasource)
	{
		return adsmediasource.mainHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Handler mainHandler>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(AdsMediaSource adsmediasource, AdPlaybackState adplaybackstate)
	{
		adsmediasource.onAdPlaybackState(adplaybackstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #156 <Method void onAdPlaybackState(AdPlaybackState)>
		return;
	//    3    5:return          
	}

*/


/*
	static Handler access$400(AdsMediaSource adsmediasource)
	{
		return adsmediasource.eventHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field Handler eventHandler>
	//    2    4:areturn         
	}

*/


/*
	static EventListener access$500(AdsMediaSource adsmediasource)
	{
		return adsmediasource.eventListener;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field AdsMediaSource$EventListener eventListener>
	//    2    4:areturn         
	}

*/


/*
	static com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher access$600(AdsMediaSource adsmediasource, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		return adsmediasource.createEventDispatcher(mediaperiodid);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    3    5:areturn         
	}

*/


/*
	static com.google.android.exoplayer2.source.MediaSourceEventListener.EventDispatcher access$700(AdsMediaSource adsmediasource, com.google.android.exoplayer2.source.MediaSource.MediaPeriodId mediaperiodid)
	{
		return adsmediasource.createEventDispatcher(mediaperiodid);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #165 <Method com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher createEventDispatcher(com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)>
	//    3    5:areturn         
	}

*/
}
