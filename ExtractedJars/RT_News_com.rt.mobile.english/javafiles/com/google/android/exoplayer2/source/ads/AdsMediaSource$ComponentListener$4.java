// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.source.ads;


// Referenced classes of package com.google.android.exoplayer2.source.ads:
//			AdsMediaSource

class AdsMediaSource$ComponentListener$4
	implements Runnable
{

	public void run()
	{
		if(!AdsMediaSource.ComponentListener.access$200(AdsMediaSource.ComponentListener.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field AdsMediaSource$ComponentListener this$1>
	//*   2    4:invokestatic    #33  <Method boolean AdsMediaSource$ComponentListener.access$200(AdsMediaSource$ComponentListener)>
	//*   3    7:ifne            63
		{
			if(val$error.type == 3)
	//*   4   10:aload_0         
	//*   5   11:getfield        #24  <Field AdsMediaSource$AdLoadException val$error>
	//*   6   14:getfield        #39  <Field int AdsMediaSource$AdLoadException.type>
	//*   7   17:iconst_3        
	//*   8   18:icmpne          44
			{
				AdsMediaSource.access$500(this$0).onInternalAdLoadError(val$error.getRuntimeExceptionForUnexpected());
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
			AdsMediaSource.access$500(this$0).onAdLoadError(((java.io.IOException) (val$error)));
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

	AdsMediaSource$ComponentListener$4()
	{
		this$1 = final_componentlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field AdsMediaSource$ComponentListener this$1>
		val$error = AdsMediaSource.AdLoadException.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field AdsMediaSource$AdLoadException val$error>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
