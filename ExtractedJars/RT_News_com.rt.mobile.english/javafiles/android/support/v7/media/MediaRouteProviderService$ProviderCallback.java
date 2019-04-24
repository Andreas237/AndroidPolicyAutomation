// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			MediaRouteProviderService, MediaRouteProvider, MediaRouteProviderDescriptor

private final class MediaRouteProviderService$ProviderCallback extends MediaRouteProvider.Callback
{

	public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		sendDescriptorChanged(mediarouteproviderdescriptor);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteProviderService this$0>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #23  <Method void MediaRouteProviderService.sendDescriptorChanged(MediaRouteProviderDescriptor)>
	//    4    8:return          
	}

	final MediaRouteProviderService this$0;

	MediaRouteProviderService$ProviderCallback()
	{
		this$0 = MediaRouteProviderService.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field MediaRouteProviderService this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void MediaRouteProvider$Callback()>
	//    5    9:return          
	}
}
