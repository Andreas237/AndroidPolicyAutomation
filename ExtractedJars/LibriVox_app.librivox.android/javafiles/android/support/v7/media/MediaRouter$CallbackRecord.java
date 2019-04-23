// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;


// Referenced classes of package android.support.v7.media:
//			MediaRouteSelector, MediaRouter

final class MediaRouter$CallbackRecord
{

	public boolean filterRouteEvent(MediaRouter.RouteInfo routeinfo)
	{
		return (mFlags & 2) != 0 || routeinfo.matchesSelector(mSelector);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field int mFlags>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifne            25
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #28  <Field MediaRouteSelector mSelector>
	//    8   14:invokevirtual   #39  <Method boolean MediaRouter$RouteInfo.matchesSelector(MediaRouteSelector)>
	//    9   17:ifeq            23
	//   10   20:goto            25
	//   11   23:iconst_0        
	//   12   24:ireturn         
	//   13   25:iconst_1        
	//   14   26:ireturn         
	}

	public final MediaRouter.Callback mCallback;
	public int mFlags;
	public final MediaRouter mRouter;
	public MediaRouteSelector mSelector;

	public MediaRouter$CallbackRecord(MediaRouter mediarouter, MediaRouter.Callback callback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mRouter = mediarouter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field MediaRouter mRouter>
		mCallback = callback;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field MediaRouter$Callback mCallback>
		mSelector = MediaRouteSelector.EMPTY;
	//    8   14:aload_0         
	//    9   15:getstatic       #26  <Field MediaRouteSelector MediaRouteSelector.EMPTY>
	//   10   18:putfield        #28  <Field MediaRouteSelector mSelector>
	//   11   21:return          
	}
}
