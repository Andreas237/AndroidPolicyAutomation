// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.media.AudioManager;

final class SystemMediaRouteProvider$LegacyImpl$DefaultRouteController extends MediaRouteProvider.RouteController
{

	public void onSetVolume(int i)
	{
		mAudioManager.setStreamVolume(3, i, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//    2    4:getfield        #22  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
	//    3    7:iconst_3        
	//    4    8:iload_1         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #28  <Method void AudioManager.setStreamVolume(int, int, int)>
		publishRoutes();
	//    7   13:aload_0         
	//    8   14:getfield        #10  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//    9   17:invokevirtual   #31  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
	//   10   20:return          
	}

	public void onUpdateVolume(int i)
	{
		int j = mAudioManager.getStreamVolume(3);
	//    0    0:aload_0         
	//    1    1:getfield        #10  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//    2    4:getfield        #22  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
	//    3    7:iconst_3        
	//    4    8:invokevirtual   #36  <Method int AudioManager.getStreamVolume(int)>
	//    5   11:istore_2        
		if(Math.min(mAudioManager.getStreamMaxVolume(3), Math.max(0, i + j)) != j)
	//*   6   12:aload_0         
	//*   7   13:getfield        #10  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//*   8   16:getfield        #22  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
	//*   9   19:iconst_3        
	//*  10   20:invokevirtual   #39  <Method int AudioManager.getStreamMaxVolume(int)>
	//*  11   23:iconst_0        
	//*  12   24:iload_1         
	//*  13   25:iload_2         
	//*  14   26:iadd            
	//*  15   27:invokestatic    #45  <Method int Math.max(int, int)>
	//*  16   30:invokestatic    #48  <Method int Math.min(int, int)>
	//*  17   33:iload_2         
	//*  18   34:icmpeq          50
			mAudioManager.setStreamVolume(3, j, 0);
	//   19   37:aload_0         
	//   20   38:getfield        #10  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//   21   41:getfield        #22  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
	//   22   44:iconst_3        
	//   23   45:iload_2         
	//   24   46:iconst_0        
	//   25   47:invokevirtual   #28  <Method void AudioManager.setStreamVolume(int, int, int)>
		publishRoutes();
	//   26   50:aload_0         
	//   27   51:getfield        #10  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//   28   54:invokevirtual   #31  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
	//   29   57:return          
	}

	final SystemMediaRouteProvider.LegacyImpl this$0;

	SystemMediaRouteProvider$LegacyImpl$DefaultRouteController()
	{
		this$0 = SystemMediaRouteProvider.LegacyImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #10  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #13  <Method void MediaRouteProvider$RouteController()>
	//    5    9:return          
	}
}
