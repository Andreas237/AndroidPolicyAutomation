// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.formats.OnPublisherAdViewLoadedListener;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzsb, zzane, zzks

final class zzsc
	implements Runnable
{

	zzsc(zzsb zzsb1, PublisherAdView publisheradview, zzks zzks)
	{
		zzbli = zzsb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field zzsb zzbli>
		zzblg = publisheradview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field PublisherAdView zzblg>
		zzblh = zzks;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #20  <Field zzks zzblh>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #23  <Method void Object()>
	//   11   19:return          
	}

	public final void run()
	{
		if(zzblg.zza(zzblh))
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field PublisherAdView zzblg>
	//*   2    4:aload_0         
	//*   3    5:getfield        #20  <Field zzks zzblh>
	//*   4    8:invokevirtual   #31  <Method boolean PublisherAdView.zza(zzks)>
	//*   5   11:ifeq            31
		{
			zzsb.zza(zzbli).onPublisherAdViewLoaded(zzblg);
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field zzsb zzbli>
	//    8   18:invokestatic    #36  <Method OnPublisherAdViewLoadedListener zzsb.zza(zzsb)>
	//    9   21:aload_0         
	//   10   22:getfield        #18  <Field PublisherAdView zzblg>
	//   11   25:invokeinterface #42  <Method void OnPublisherAdViewLoadedListener.onPublisherAdViewLoaded(PublisherAdView)>
			return;
	//   12   30:return          
		} else
		{
			zzane.zzdk("Could not bind.");
	//   13   31:ldc1            #44  <String "Could not bind.">
	//   14   33:invokestatic    #50  <Method void zzane.zzdk(String)>
			return;
	//   15   36:return          
		}
	}

	private final PublisherAdView zzblg;
	private final zzks zzblh;
	private final zzsb zzbli;
}
