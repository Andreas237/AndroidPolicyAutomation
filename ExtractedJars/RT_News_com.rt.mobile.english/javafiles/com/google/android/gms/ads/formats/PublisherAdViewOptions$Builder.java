// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.formats;

import com.google.android.gms.ads.doubleclick.AppEventListener;

// Referenced classes of package com.google.android.gms.ads.formats:
//			PublisherAdViewOptions

public static final class PublisherAdViewOptions$Builder
{

	static boolean zza(PublisherAdViewOptions$Builder publisheradviewoptions$builder)
	{
		return publisheradviewoptions$builder.zzvm;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean zzvm>
	//    2    4:ireturn         
	}

	static AppEventListener zzb(PublisherAdViewOptions$Builder publisheradviewoptions$builder)
	{
		return publisheradviewoptions$builder.zzvo;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field AppEventListener zzvo>
	//    2    4:areturn         
	}

	public final PublisherAdViewOptions build()
	{
		return new PublisherAdViewOptions(this, ((zzb) (null)));
	//    0    0:new             #6   <Class PublisherAdViewOptions>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #29  <Method void PublisherAdViewOptions(PublisherAdViewOptions$Builder, zzb)>
	//    5    9:areturn         
	}

	public final PublisherAdViewOptions$Builder setAppEventListener(AppEventListener appeventlistener)
	{
		zzvo = appeventlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field AppEventListener zzvo>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final PublisherAdViewOptions$Builder setManualImpressionsEnabled(boolean flag)
	{
		zzvm = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean zzvm>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private boolean zzvm;
	private AppEventListener zzvo;

	public PublisherAdViewOptions$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzvm = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean zzvm>
	//    5    9:return          
	}
}
