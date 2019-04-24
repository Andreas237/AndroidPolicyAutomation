// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.DataSpec;

// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource, AdPlaybackState

private final class AdsMediaSource$ComponentListener
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
		if(AdsMediaSource.access$400(AdsMediaSource.this) != null && AdsMediaSource.access$500(AdsMediaSource.this) != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #27  <Field AdsMediaSource this$0>
	//*   6   12:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
	//*   7   15:ifnull          47
	//*   8   18:aload_0         
	//*   9   19:getfield        #27  <Field AdsMediaSource this$0>
	//*  10   22:invokestatic    #49  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
	//*  11   25:ifnull          47
			AdsMediaSource.access$400(AdsMediaSource.this).post(new Runnable() {

				public void run()
				{
					if(!released)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
				//*   2    4:invokestatic    #28  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
				//*   3    7:ifne            25
						AdsMediaSource.access$500(this$0).onAdClicked();
				//    4   10:aload_0         
				//    5   11:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
				//    6   14:getfield        #32  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
				//    7   17:invokestatic    #36  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
				//    8   20:invokeinterface #39  <Method void AdsMediaSource$EventListener.onAdClicked()>
				//    9   25:return          
				}

				final AdsMediaSource.ComponentListener this$1;

			
			{
				this$1 = AdsMediaSource.ComponentListener.this;
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

	public void onAdLoadError(final AdsMediaSource.AdLoadException error, DataSpec dataspec)
	{
		if(released)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field boolean released>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		AdsMediaSource.access$600(AdsMediaSource.this, ((com.google.android.exoplayer2.source.MediaSource.MediaPeriodId) (null))).loadError(dataspec, 6, -1L, 0L, 0L, ((java.io.IOException) (error)), true);
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
	//   15   26:invokevirtual   #70  <Method void com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher.loadError(DataSpec, int, long, long, long, java.io.IOException, boolean)>
		if(AdsMediaSource.access$400(AdsMediaSource.this) != null && AdsMediaSource.access$500(AdsMediaSource.this) != null)
	//*  16   29:aload_0         
	//*  17   30:getfield        #27  <Field AdsMediaSource this$0>
	//*  18   33:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
	//*  19   36:ifnull          69
	//*  20   39:aload_0         
	//*  21   40:getfield        #27  <Field AdsMediaSource this$0>
	//*  22   43:invokestatic    #49  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
	//*  23   46:ifnull          69
			AdsMediaSource.access$400(AdsMediaSource.this).post(new Runnable() {

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
							AdsMediaSource.access$500(this$0).onInternalAdLoadError(error.getRuntimeExceptionForUnexpected());
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
						AdsMediaSource.access$500(this$0).onAdLoadError(((java.io.IOException) (error)));
				//   18   44:aload_0         
				//   19   45:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
				//   20   48:getfield        #43  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
				//   21   51:invokestatic    #47  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
				//   22   54:aload_0         
				//   23   55:getfield        #24  <Field AdsMediaSource$AdLoadException val$error>
				//   24   58:invokeinterface #60  <Method void AdsMediaSource$EventListener.onAdLoadError(java.io.IOException)>
					}
				//   25   63:return          
				}

				final AdsMediaSource.ComponentListener this$1;
				final AdsMediaSource.AdLoadException val$error;

			
			{
				this$1 = AdsMediaSource.ComponentListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AdsMediaSource$ComponentListener this$1>
				error = adloadexception;
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

	public void onAdPlaybackState(final AdPlaybackState adPlaybackState)
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
			playerHandler.post(new Runnable() {

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
						AdsMediaSource.access$300(this$0, adPlaybackState);
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

				final AdsMediaSource.ComponentListener this$1;
				final AdPlaybackState val$adPlaybackState;

			
			{
				this$1 = AdsMediaSource.ComponentListener.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field AdsMediaSource$ComponentListener this$1>
				adPlaybackState = adplaybackstate;
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
		if(AdsMediaSource.access$400(AdsMediaSource.this) != null && AdsMediaSource.access$500(AdsMediaSource.this) != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #27  <Field AdsMediaSource this$0>
	//*   6   12:invokestatic    #45  <Method Handler AdsMediaSource.access$400(AdsMediaSource)>
	//*   7   15:ifnull          47
	//*   8   18:aload_0         
	//*   9   19:getfield        #27  <Field AdsMediaSource this$0>
	//*  10   22:invokestatic    #49  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
	//*  11   25:ifnull          47
			AdsMediaSource.access$400(AdsMediaSource.this).post(new Runnable() {

				public void run()
				{
					if(!released)
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
				//*   2    4:invokestatic    #28  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
				//*   3    7:ifne            25
						AdsMediaSource.access$500(this$0).onAdTapped();
				//    4   10:aload_0         
				//    5   11:getfield        #20  <Field AdsMediaSource$ComponentListener this$1>
				//    6   14:getfield        #32  <Field AdsMediaSource AdsMediaSource$ComponentListener.this$0>
				//    7   17:invokestatic    #36  <Method AdsMediaSource$EventListener AdsMediaSource.access$500(AdsMediaSource)>
				//    8   20:invokeinterface #39  <Method void AdsMediaSource$EventListener.onAdTapped()>
				//    9   25:return          
				}

				final AdsMediaSource.ComponentListener this$1;

			
			{
				this$1 = AdsMediaSource.ComponentListener.this;
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
	static boolean access$200(AdsMediaSource$ComponentListener adsmediasource$componentlistener)
	{
		return adsmediasource$componentlistener.released;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean released>
	//    2    4:ireturn         
	}

*/

	public AdsMediaSource$ComponentListener()
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
