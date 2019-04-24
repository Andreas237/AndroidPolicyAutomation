// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			MediaRouter, MediaRouteProvider, MediaRouteProviderDescriptor

private final class MediaRouter$GlobalMediaRouter$ProviderCallback extends MediaRouteProvider.Callback
{

	public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
	{
		updateProviderDescriptor(mediarouteprovider, mediarouteproviderdescriptor);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method void MediaRouter$GlobalMediaRouter.updateProviderDescriptor(MediaRouteProvider, MediaRouteProviderDescriptor)>
	//    5    9:return          
	}

	final MediaRouter.GlobalMediaRouter this$0;

	MediaRouter$GlobalMediaRouter$ProviderCallback()
	{
		this$0 = MediaRouter.GlobalMediaRouter.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MediaRouter$GlobalMediaRouter this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void MediaRouteProvider$Callback()>
	//    5    9:return          
	}
}
