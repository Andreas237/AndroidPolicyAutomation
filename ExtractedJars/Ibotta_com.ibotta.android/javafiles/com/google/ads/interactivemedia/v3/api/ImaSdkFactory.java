// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.api;

import android.content.Context;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.impl.*;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.impl.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.api:
//			ImaSdkSettings, AdsLoader, AdDisplayContainer, AdsRenderingSettings, 
//			AdsRequest, CompanionAdSlot, StreamDisplayContainer, StreamRequest

public class ImaSdkFactory
{

	private ImaSdkFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	private AdsLoader createAdsLoader(Context context, Uri uri, ImaSdkSettings imasdksettings, TestingConfiguration testingconfiguration)
	{
		context = ((Context) (new h(context, uri, imasdksettings, testingconfiguration)));
	//    0    0:new             #15  <Class h>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #18  <Method void h(Context, Uri, ImaSdkSettings, TestingConfiguration)>
	//    7   12:astore_1        
		((h) (context)).a();
	//    8   13:aload_1         
	//    9   14:invokevirtual   #21  <Method void h.a()>
		return ((AdsLoader) (context));
	//   10   17:aload_1         
	//   11   18:areturn         
	}

	private AdsLoader createAdsLoader(Context context, ImaSdkSettings imasdksettings, TestingConfiguration testingconfiguration)
	{
		return createAdsLoader(context, y.b, imasdksettings, testingconfiguration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #28  <Field Uri y.b>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokespecial   #30  <Method AdsLoader createAdsLoader(Context, Uri, ImaSdkSettings, TestingConfiguration)>
	//    6   10:areturn         
	}

	public static ImaSdkFactory getInstance()
	{
		if(instance == null)
	//*   0    0:getstatic       #34  <Field ImaSdkFactory instance>
	//*   1    3:ifnonnull       16
			instance = new ImaSdkFactory();
	//    2    6:new             #2   <Class ImaSdkFactory>
	//    3    9:dup             
	//    4   10:invokespecial   #35  <Method void ImaSdkFactory()>
	//    5   13:putstatic       #34  <Field ImaSdkFactory instance>
		return instance;
	//    6   16:getstatic       #34  <Field ImaSdkFactory instance>
	//    7   19:areturn         
	}

	public AdDisplayContainer createAdDisplayContainer()
	{
		return ((AdDisplayContainer) (new b()));
	//    0    0:new             #39  <Class b>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void b()>
	//    3    7:areturn         
	}

	public AdsLoader createAdsLoader(Context context)
	{
		return createAdsLoader(context, createImaSdkSettings());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #45  <Method ImaSdkSettings createImaSdkSettings()>
	//    4    6:invokevirtual   #48  <Method AdsLoader createAdsLoader(Context, ImaSdkSettings)>
	//    5    9:areturn         
	}

	public AdsLoader createAdsLoader(Context context, ImaSdkSettings imasdksettings)
	{
		return ((AdsLoader) (new h(context, y.b, imasdksettings)));
	//    0    0:new             #15  <Class h>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getstatic       #28  <Field Uri y.b>
	//    4    8:aload_2         
	//    5    9:invokespecial   #51  <Method void h(Context, Uri, ImaSdkSettings)>
	//    6   12:areturn         
	}

	public AdsRenderingSettings createAdsRenderingSettings()
	{
		return ((AdsRenderingSettings) (new l()));
	//    0    0:new             #55  <Class l>
	//    1    3:dup             
	//    2    4:invokespecial   #56  <Method void l()>
	//    3    7:areturn         
	}

	public AdsRequest createAdsRequest()
	{
		return ((AdsRequest) (new m()));
	//    0    0:new             #60  <Class m>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void m()>
	//    3    7:areturn         
	}

	public CompanionAdSlot createCompanionAdSlot()
	{
		return ((CompanionAdSlot) (new r()));
	//    0    0:new             #65  <Class r>
	//    1    3:dup             
	//    2    4:invokespecial   #66  <Method void r()>
	//    3    7:areturn         
	}

	public ImaSdkSettings createImaSdkSettings()
	{
		return new ImaSdkSettings();
	//    0    0:new             #68  <Class ImaSdkSettings>
	//    1    3:dup             
	//    2    4:invokespecial   #69  <Method void ImaSdkSettings()>
	//    3    7:areturn         
	}

	public StreamRequest createLiveStreamRequest(String s, String s1, StreamDisplayContainer streamdisplaycontainer)
	{
		aj aj1 = new aj();
	//    0    0:new             #73  <Class aj>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void aj()>
	//    3    7:astore          4
		aj1.a(s);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:invokevirtual   #77  <Method void aj.a(String)>
		aj1.d(s1);
	//    7   15:aload           4
	//    8   17:aload_2         
	//    9   18:invokevirtual   #80  <Method void aj.d(String)>
		aj1.a(streamdisplaycontainer);
	//   10   21:aload           4
	//   11   23:aload_3         
	//   12   24:invokevirtual   #83  <Method void aj.a(StreamDisplayContainer)>
		return ((StreamRequest) (aj1));
	//   13   27:aload           4
	//   14   29:areturn         
	}

	public StreamDisplayContainer createStreamDisplayContainer()
	{
		return ((StreamDisplayContainer) (new ah()));
	//    0    0:new             #87  <Class ah>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void ah()>
	//    3    7:areturn         
	}

	public StreamRequest createVodStreamRequest(String s, String s1, String s2, StreamDisplayContainer streamdisplaycontainer)
	{
		aj aj1 = new aj();
	//    0    0:new             #73  <Class aj>
	//    1    3:dup             
	//    2    4:invokespecial   #74  <Method void aj()>
	//    3    7:astore          5
		aj1.b(s);
	//    4    9:aload           5
	//    5   11:aload_1         
	//    6   12:invokevirtual   #92  <Method void aj.b(String)>
		aj1.c(s1);
	//    7   15:aload           5
	//    8   17:aload_2         
	//    9   18:invokevirtual   #95  <Method void aj.c(String)>
		aj1.d(s2);
	//   10   21:aload           5
	//   11   23:aload_3         
	//   12   24:invokevirtual   #80  <Method void aj.d(String)>
		aj1.a(streamdisplaycontainer);
	//   13   27:aload           5
	//   14   29:aload           4
	//   15   31:invokevirtual   #83  <Method void aj.a(StreamDisplayContainer)>
		return ((StreamRequest) (aj1));
	//   16   34:aload           5
	//   17   36:areturn         
	}

	private static ImaSdkFactory instance;
}
