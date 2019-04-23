// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.Context;
import android.view.Display;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//			MediaRouterJellybeanMr1, MediaRouteDescriptor

class SystemMediaRouteProvider$JellybeanMr1Impl extends SystemMediaRouteProvider.JellybeanImpl
	implements MediaRouterJellybeanMr1.Callback
{

	protected Object createCallbackObj()
	{
		return MediaRouterJellybeanMr1.createCallback(((MediaRouterJellybeanMr1.Callback) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method Object MediaRouterJellybeanMr1.createCallback(MediaRouterJellybeanMr1$Callback)>
	//    2    4:areturn         
	}

	protected boolean isConnecting(temRouteRecord temrouterecord)
	{
		if(mIsConnectingWorkaround == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field MediaRouterJellybeanMr1$IsConnectingWorkaround mIsConnectingWorkaround>
	//*   2    4:ifnonnull       18
			mIsConnectingWorkaround = new ound();
	//    3    7:aload_0         
	//    4    8:new             #29  <Class MediaRouterJellybeanMr1$IsConnectingWorkaround>
	//    5   11:dup             
	//    6   12:invokespecial   #32  <Method void MediaRouterJellybeanMr1$IsConnectingWorkaround()>
	//    7   15:putfield        #27  <Field MediaRouterJellybeanMr1$IsConnectingWorkaround mIsConnectingWorkaround>
		return mIsConnectingWorkaround.isConnecting(temrouterecord.mRouteObj);
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field MediaRouterJellybeanMr1$IsConnectingWorkaround mIsConnectingWorkaround>
	//   10   22:aload_1         
	//   11   23:getfield        #38  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   12   26:invokevirtual   #41  <Method boolean MediaRouterJellybeanMr1$IsConnectingWorkaround.isConnecting(Object)>
	//   13   29:ireturn         
	}

	protected void onBuildSystemRouteDescriptor(temRouteRecord temrouterecord, MediaRouteDescriptor.Builder builder)
	{
		super.onBuildSystemRouteDescriptor(temrouterecord, builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #45  <Method void SystemMediaRouteProvider$JellybeanImpl.onBuildSystemRouteDescriptor(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord, MediaRouteDescriptor$Builder)>
		if(!MediaRouterJellybeanMr1.RouteInfo.isEnabled(temrouterecord.mRouteObj))
	//*   4    6:aload_1         
	//*   5    7:getfield        #38  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//*   6   10:invokestatic    #50  <Method boolean MediaRouterJellybeanMr1$RouteInfo.isEnabled(Object)>
	//*   7   13:ifne            22
			builder.setEnabled(false);
	//    8   16:aload_2         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #56  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setEnabled(boolean)>
	//   11   21:pop             
		if(isConnecting(temrouterecord))
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:invokevirtual   #58  <Method boolean isConnecting(SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord)>
	//*  15   27:ifeq            36
			builder.setConnecting(true);
	//   16   30:aload_2         
	//   17   31:iconst_1        
	//   18   32:invokevirtual   #61  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setConnecting(boolean)>
	//   19   35:pop             
		temrouterecord = ((temRouteRecord) (MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(temrouterecord.mRouteObj)));
	//   20   36:aload_1         
	//   21   37:getfield        #38  <Field Object SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteObj>
	//   22   40:invokestatic    #65  <Method Display MediaRouterJellybeanMr1$RouteInfo.getPresentationDisplay(Object)>
	//   23   43:astore_1        
		if(temrouterecord != null)
	//*  24   44:aload_1         
	//*  25   45:ifnull          57
			builder.setPresentationDisplayId(((Display) (temrouterecord)).getDisplayId());
	//   26   48:aload_2         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #71  <Method int Display.getDisplayId()>
	//   29   53:invokevirtual   #75  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPresentationDisplayId(int)>
	//   30   56:pop             
	//   31   57:return          
	}

	public void onRoutePresentationDisplayChanged(Object obj)
	{
		int i = findSystemRouteRecord(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #81  <Method int findSystemRouteRecord(Object)>
	//    3    5:istore_2        
		if(i >= 0)
	//*   4    6:iload_2         
	//*   5    7:iflt            78
		{
			temRouteRecord temrouterecord = (temRouteRecord)mSystemRouteRecords.get(i);
	//    6   10:aload_0         
	//    7   11:getfield        #85  <Field ArrayList mSystemRouteRecords>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #91  <Method Object ArrayList.get(int)>
	//   10   18:checkcast       #34  <Class SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord>
	//   11   21:astore_3        
			obj = ((Object) (MediaRouterJellybeanMr1.RouteInfo.getPresentationDisplay(obj)));
	//   12   22:aload_1         
	//   13   23:invokestatic    #65  <Method Display MediaRouterJellybeanMr1$RouteInfo.getPresentationDisplay(Object)>
	//   14   26:astore_1        
			if(obj != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          39
				i = ((Display) (obj)).getDisplayId();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #71  <Method int Display.getDisplayId()>
	//   19   35:istore_2        
			else
	//*  20   36:goto            41
				i = -1;
	//   21   39:iconst_m1       
	//   22   40:istore_2        
			if(i != temrouterecord.mRouteDescriptor.getPresentationDisplayId())
	//*  23   41:iload_2         
	//*  24   42:aload_3         
	//*  25   43:getfield        #95  <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
	//*  26   46:invokevirtual   #100 <Method int MediaRouteDescriptor.getPresentationDisplayId()>
	//*  27   49:icmpeq          78
			{
				temrouterecord.mRouteDescriptor = (new MediaRouteDescriptor.Builder(temrouterecord.mRouteDescriptor)).setPresentationDisplayId(i).build();
	//   28   52:aload_3         
	//   29   53:new             #52  <Class MediaRouteDescriptor$Builder>
	//   30   56:dup             
	//   31   57:aload_3         
	//   32   58:getfield        #95  <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
	//   33   61:invokespecial   #103 <Method void MediaRouteDescriptor$Builder(MediaRouteDescriptor)>
	//   34   64:iload_2         
	//   35   65:invokevirtual   #75  <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPresentationDisplayId(int)>
	//   36   68:invokevirtual   #107 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
	//   37   71:putfield        #95  <Field MediaRouteDescriptor SystemMediaRouteProvider$JellybeanImpl$SystemRouteRecord.mRouteDescriptor>
				publishRoutes();
	//   38   74:aload_0         
	//   39   75:invokevirtual   #110 <Method void publishRoutes()>
			}
		}
	//   40   78:return          
	}

	protected void updateCallback()
	{
		super.updateCallback();
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method void SystemMediaRouteProvider$JellybeanImpl.updateCallback()>
		if(mActiveScanWorkaround == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #115 <Field MediaRouterJellybeanMr1$ActiveScanWorkaround mActiveScanWorkaround>
	//*   4    8:ifnonnull       30
			mActiveScanWorkaround = new nd(getContext(), getHandler());
	//    5   11:aload_0         
	//    6   12:new             #117 <Class MediaRouterJellybeanMr1$ActiveScanWorkaround>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:invokevirtual   #121 <Method Context getContext()>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #125 <Method android.os.Handler getHandler()>
	//   12   24:invokespecial   #128 <Method void MediaRouterJellybeanMr1$ActiveScanWorkaround(Context, android.os.Handler)>
	//   13   27:putfield        #115 <Field MediaRouterJellybeanMr1$ActiveScanWorkaround mActiveScanWorkaround>
		nd nd = mActiveScanWorkaround;
	//   14   30:aload_0         
	//   15   31:getfield        #115 <Field MediaRouterJellybeanMr1$ActiveScanWorkaround mActiveScanWorkaround>
	//   16   34:astore_2        
		int i;
		if(mActiveScan)
	//*  17   35:aload_0         
	//*  18   36:getfield        #132 <Field boolean mActiveScan>
	//*  19   39:ifeq            50
			i = mRouteTypes;
	//   20   42:aload_0         
	//   21   43:getfield        #136 <Field int mRouteTypes>
	//   22   46:istore_1        
		else
	//*  23   47:goto            52
			i = 0;
	//   24   50:iconst_0        
	//   25   51:istore_1        
		nd.setActiveScanRouteTypes(i);
	//   26   52:aload_2         
	//   27   53:iload_1         
	//   28   54:invokevirtual   #140 <Method void MediaRouterJellybeanMr1$ActiveScanWorkaround.setActiveScanRouteTypes(int)>
	//   29   57:return          
	}

	private nd mActiveScanWorkaround;
	private ound mIsConnectingWorkaround;

	public SystemMediaRouteProvider$JellybeanMr1Impl(Context context, SystemMediaRouteProvider.SyncCallback synccallback)
	{
		super(context, synccallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void SystemMediaRouteProvider$JellybeanImpl(Context, SystemMediaRouteProvider$SyncCallback)>
	//    4    6:return          
	}
}
