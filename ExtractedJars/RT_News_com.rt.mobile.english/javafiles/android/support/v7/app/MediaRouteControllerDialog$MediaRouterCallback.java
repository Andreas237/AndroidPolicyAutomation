// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.support.v7.media.MediaRouter;
import android.util.Log;
import android.widget.SeekBar;
import java.util.Map;

// Referenced classes of package android.support.v7.app:
//			MediaRouteControllerDialog

private final class MediaRouteControllerDialog$MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
{

	public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		update(true);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #23  <Method void MediaRouteControllerDialog.update(boolean)>
	//    4    8:return          
	}

	public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		update(false);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #23  <Method void MediaRouteControllerDialog.update(boolean)>
	//    4    8:return          
	}

	public void onRouteVolumeChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
	{
		mediarouter = ((MediaRouter) ((SeekBar)mVolumeSliderMap.get(((Object) (routeinfo)))));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//    2    4:getfield        #29  <Field Map MediaRouteControllerDialog.mVolumeSliderMap>
	//    3    7:aload_2         
	//    4    8:invokeinterface #35  <Method Object Map.get(Object)>
	//    5   13:checkcast       #37  <Class SeekBar>
	//    6   16:astore_1        
		int i = routeinfo.getVolume();
	//    7   17:aload_2         
	//    8   18:invokevirtual   #43  <Method int android.support.v7.media.MediaRouter$RouteInfo.getVolume()>
	//    9   21:istore_3        
		if(MediaRouteControllerDialog.DEBUG)
	//*  10   22:getstatic       #47  <Field boolean MediaRouteControllerDialog.DEBUG>
	//*  11   25:ifeq            63
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   28:new             #49  <Class StringBuilder>
	//   13   31:dup             
	//   14   32:invokespecial   #50  <Method void StringBuilder()>
	//   15   35:astore          4
			stringbuilder.append("onRouteVolumeChanged(), route.getVolume:");
	//   16   37:aload           4
	//   17   39:ldc1            #52  <String "onRouteVolumeChanged(), route.getVolume:">
	//   18   41:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
			stringbuilder.append(i);
	//   20   45:aload           4
	//   21   47:iload_3         
	//   22   48:invokevirtual   #59  <Method StringBuilder StringBuilder.append(int)>
	//   23   51:pop             
			Log.d("MediaRouteCtrlDialog", stringbuilder.toString());
	//   24   52:ldc1            #61  <String "MediaRouteCtrlDialog">
	//   25   54:aload           4
	//   26   56:invokevirtual   #65  <Method String StringBuilder.toString()>
	//   27   59:invokestatic    #71  <Method int Log.d(String, String)>
	//   28   62:pop             
		}
		if(mediarouter != null && mRouteInVolumeSliderTouched != routeinfo)
	//*  29   63:aload_1         
	//*  30   64:ifnull          83
	//*  31   67:aload_0         
	//*  32   68:getfield        #13  <Field MediaRouteControllerDialog this$0>
	//*  33   71:getfield        #75  <Field android.support.v7.media.MediaRouter$RouteInfo MediaRouteControllerDialog.mRouteInVolumeSliderTouched>
	//*  34   74:aload_2         
	//*  35   75:if_acmpeq       83
			((SeekBar) (mediarouter)).setProgress(i);
	//   36   78:aload_1         
	//   37   79:iload_3         
	//   38   80:invokevirtual   #79  <Method void SeekBar.setProgress(int)>
	//   39   83:return          
	}

	final MediaRouteControllerDialog this$0;

	MediaRouteControllerDialog$MediaRouterCallback()
	{
		this$0 = MediaRouteControllerDialog.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field MediaRouteControllerDialog this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void android.support.v7.media.MediaRouter$Callback()>
	//    5    9:return          
	}
}
