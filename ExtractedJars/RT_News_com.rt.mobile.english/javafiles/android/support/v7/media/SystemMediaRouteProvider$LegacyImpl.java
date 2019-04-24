// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;
import android.content.res.Resources;
import android.media.AudioManager;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//			SystemMediaRouteProvider

static class SystemMediaRouteProvider$LegacyImpl extends SystemMediaRouteProvider
{
	final class DefaultRouteController extends MediaRouteProvider.RouteController
	{

		public void onSetVolume(int i)
		{
			mAudioManager.setStreamVolume(3, i, 0);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//    2    4:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//    3    7:iconst_3        
		//    4    8:iload_1         
		//    5    9:iconst_0        
		//    6   10:invokevirtual   #32  <Method void AudioManager.setStreamVolume(int, int, int)>
			publishRoutes();
		//    7   13:aload_0         
		//    8   14:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//    9   17:invokevirtual   #35  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
		//   10   20:return          
		}

		public void onUpdateVolume(int i)
		{
			int j = mAudioManager.getStreamVolume(3);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//    2    4:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//    3    7:iconst_3        
		//    4    8:invokevirtual   #40  <Method int AudioManager.getStreamVolume(int)>
		//    5   11:istore_2        
			if(Math.min(mAudioManager.getStreamMaxVolume(3), Math.max(0, i + j)) != j)
		//*   6   12:aload_0         
		//*   7   13:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//*   8   16:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//*   9   19:iconst_3        
		//*  10   20:invokevirtual   #43  <Method int AudioManager.getStreamMaxVolume(int)>
		//*  11   23:iconst_0        
		//*  12   24:iload_1         
		//*  13   25:iload_2         
		//*  14   26:iadd            
		//*  15   27:invokestatic    #49  <Method int Math.max(int, int)>
		//*  16   30:invokestatic    #52  <Method int Math.min(int, int)>
		//*  17   33:iload_2         
		//*  18   34:icmpeq          50
				mAudioManager.setStreamVolume(3, j, 0);
		//   19   37:aload_0         
		//   20   38:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//   21   41:getfield        #26  <Field AudioManager SystemMediaRouteProvider$LegacyImpl.mAudioManager>
		//   22   44:iconst_3        
		//   23   45:iload_2         
		//   24   46:iconst_0        
		//   25   47:invokevirtual   #32  <Method void AudioManager.setStreamVolume(int, int, int)>
			publishRoutes();
		//   26   50:aload_0         
		//   27   51:getfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//   28   54:invokevirtual   #35  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
		//   29   57:return          
		}

		final SystemMediaRouteProvider.LegacyImpl this$0;

		DefaultRouteController()
		{
			this$0 = SystemMediaRouteProvider.LegacyImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field SystemMediaRouteProvider$LegacyImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void MediaRouteProvider$RouteController()>
		//    5    9:return          
		}
	}

	final class VolumeChangeReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)
		//*   0    0:aload_2         
		//*   1    1:invokevirtual   #38  <Method String Intent.getAction()>
		//*   2    4:ldc1            #20  <String "android.media.VOLUME_CHANGED_ACTION">
		//*   3    6:invokevirtual   #44  <Method boolean String.equals(Object)>
		//*   4    9:ifeq            53
		//*   5   12:aload_2         
		//*   6   13:ldc1            #14  <String "android.media.EXTRA_VOLUME_STREAM_TYPE">
		//*   7   15:iconst_m1       
		//*   8   16:invokevirtual   #48  <Method int Intent.getIntExtra(String, int)>
		//*   9   19:iconst_3        
		//*  10   20:icmpne          53
			{
				int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
		//   11   23:aload_2         
		//   12   24:ldc1            #17  <String "android.media.EXTRA_VOLUME_STREAM_VALUE">
		//   13   26:iconst_m1       
		//   14   27:invokevirtual   #48  <Method int Intent.getIntExtra(String, int)>
		//   15   30:istore_3        
				if(i >= 0 && i != mLastReportedVolume)
		//*  16   31:iload_3         
		//*  17   32:iflt            53
		//*  18   35:iload_3         
		//*  19   36:aload_0         
		//*  20   37:getfield        #26  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//*  21   40:getfield        #52  <Field int SystemMediaRouteProvider$LegacyImpl.mLastReportedVolume>
		//*  22   43:icmpeq          53
					publishRoutes();
		//   23   46:aload_0         
		//   24   47:getfield        #26  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		//   25   50:invokevirtual   #55  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
			}
		//   26   53:return          
		}

		public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
		public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
		public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
		final SystemMediaRouteProvider.LegacyImpl this$0;

		VolumeChangeReceiver()
		{
			this$0 = SystemMediaRouteProvider.LegacyImpl.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #26  <Field SystemMediaRouteProvider$LegacyImpl this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #29  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}


	public MediaRouteProvider.RouteController onCreateRouteController(String s)
	{
		if(s.equals("DEFAULT_ROUTE"))
	//*   0    0:aload_1         
	//*   1    1:ldc1            #84  <String "DEFAULT_ROUTE">
	//*   2    3:invokevirtual   #89  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            18
			return ((MediaRouteProvider.RouteController) (new DefaultRouteController()));
	//    4    9:new             #7   <Class SystemMediaRouteProvider$LegacyImpl$DefaultRouteController>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #90  <Method void SystemMediaRouteProvider$LegacyImpl$DefaultRouteController(SystemMediaRouteProvider$LegacyImpl)>
	//    8   17:areturn         
		else
			return null;
	//    9   18:aconst_null     
	//   10   19:areturn         
	}

	void publishRoutes()
	{
		Object obj = ((Object) (getContext().getResources()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method Context getContext()>
	//    2    4:invokevirtual   #98  <Method Resources Context.getResources()>
	//    3    7:astore_2        
		int i = mAudioManager.getStreamMaxVolume(3);
	//    4    8:aload_0         
	//    5    9:getfield        #64  <Field AudioManager mAudioManager>
	//    6   12:iconst_3        
	//    7   13:invokevirtual   #102 <Method int AudioManager.getStreamMaxVolume(int)>
	//    8   16:istore_1        
		mLastReportedVolume = mAudioManager.getStreamVolume(3);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #64  <Field AudioManager mAudioManager>
	//   12   22:iconst_3        
	//   13   23:invokevirtual   #105 <Method int AudioManager.getStreamVolume(int)>
	//   14   26:putfield        #52  <Field int mLastReportedVolume>
		obj = ((Object) ((new MediaRouteDescriptor.Builder("DEFAULT_ROUTE", ((Resources) (obj)).getString(android.support.v7.mediarouter.R.string.mr_system_route_name))).addControlFilters(((java.util.Collection) (CONTROL_FILTERS))).setPlaybackStream(3).setPlaybackType(0).setVolumeHandling(1).setVolumeMax(i).setVolume(mLastReportedVolume).build()));
	//   15   29:new             #107 <Class MediaRouteDescriptor$Builder>
	//   16   32:dup             
	//   17   33:ldc1            #84  <String "DEFAULT_ROUTE">
	//   18   35:aload_2         
	//   19   36:getstatic       #112 <Field int android.support.v7.mediarouter.R$string.mr_system_route_name>
	//   20   39:invokevirtual   #118 <Method String Resources.getString(int)>
	//   21   42:invokespecial   #121 <Method void MediaRouteDescriptor$Builder(String, String)>
	//   22   45:getstatic       #42  <Field ArrayList CONTROL_FILTERS>
	//   23   48:invokevirtual   #125 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.addControlFilters(java.util.Collection)>
	//   24   51:iconst_3        
	//   25   52:invokevirtual   #129 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackStream(int)>
	//   26   55:iconst_0        
	//   27   56:invokevirtual   #132 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setPlaybackType(int)>
	//   28   59:iconst_1        
	//   29   60:invokevirtual   #135 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeHandling(int)>
	//   30   63:iload_1         
	//   31   64:invokevirtual   #138 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolumeMax(int)>
	//   32   67:aload_0         
	//   33   68:getfield        #52  <Field int mLastReportedVolume>
	//   34   71:invokevirtual   #141 <Method MediaRouteDescriptor$Builder MediaRouteDescriptor$Builder.setVolume(int)>
	//   35   74:invokevirtual   #145 <Method MediaRouteDescriptor MediaRouteDescriptor$Builder.build()>
	//   36   77:astore_2        
		setDescriptor((new ()).addRoute(((MediaRouteDescriptor) (obj))).build());
	//   37   78:aload_0         
	//   38   79:new             #147 <Class MediaRouteProviderDescriptor$Builder>
	//   39   82:dup             
	//   40   83:invokespecial   #148 <Method void MediaRouteProviderDescriptor$Builder()>
	//   41   86:aload_2         
	//   42   87:invokevirtual   #152 <Method MediaRouteProviderDescriptor$Builder MediaRouteProviderDescriptor$Builder.addRoute(MediaRouteDescriptor)>
	//   43   90:invokevirtual   #155 <Method MediaRouteProviderDescriptor MediaRouteProviderDescriptor$Builder.build()>
	//   44   93:invokevirtual   #159 <Method void setDescriptor(MediaRouteProviderDescriptor)>
	//   45   96:return          
	}

	private static final ArrayList CONTROL_FILTERS;
	static final int PLAYBACK_STREAM = 3;
	final AudioManager mAudioManager;
	int mLastReportedVolume;
	private final VolumeChangeReceiver mVolumeChangeReceiver = new VolumeChangeReceiver();

	static 
	{
		IntentFilter intentfilter = new IntentFilter();
	//    0    0:new             #26  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void IntentFilter()>
	//    3    7:astore_0        
		intentfilter.addCategory("android.media.intent.category.LIVE_AUDIO");
	//    4    8:aload_0         
	//    5    9:ldc1            #31  <String "android.media.intent.category.LIVE_AUDIO">
	//    6   11:invokevirtual   #35  <Method void IntentFilter.addCategory(String)>
		intentfilter.addCategory("android.media.intent.category.LIVE_VIDEO");
	//    7   14:aload_0         
	//    8   15:ldc1            #37  <String "android.media.intent.category.LIVE_VIDEO">
	//    9   17:invokevirtual   #35  <Method void IntentFilter.addCategory(String)>
		CONTROL_FILTERS = new ArrayList();
	//   10   20:new             #39  <Class ArrayList>
	//   11   23:dup             
	//   12   24:invokespecial   #40  <Method void ArrayList()>
	//   13   27:putstatic       #42  <Field ArrayList CONTROL_FILTERS>
		CONTROL_FILTERS.add(((Object) (intentfilter)));
	//   14   30:getstatic       #42  <Field ArrayList CONTROL_FILTERS>
	//   15   33:aload_0         
	//   16   34:invokevirtual   #46  <Method boolean ArrayList.add(Object)>
	//   17   37:pop             
	//*  18   38:return          
	}

	public SystemMediaRouteProvider$LegacyImpl(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void SystemMediaRouteProvider(Context)>
		mLastReportedVolume = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #52  <Field int mLastReportedVolume>
		mAudioManager = (AudioManager)context.getSystemService("audio");
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:ldc1            #54  <String "audio">
	//    9   14:invokevirtual   #60  <Method Object Context.getSystemService(String)>
	//   10   17:checkcast       #62  <Class AudioManager>
	//   11   20:putfield        #64  <Field AudioManager mAudioManager>
	//   12   23:aload_0         
	//   13   24:new             #10  <Class SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver>
	//   14   27:dup             
	//   15   28:aload_0         
	//   16   29:invokespecial   #67  <Method void SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver(SystemMediaRouteProvider$LegacyImpl)>
	//   17   32:putfield        #69  <Field SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver mVolumeChangeReceiver>
		context.registerReceiver(((BroadcastReceiver) (mVolumeChangeReceiver)), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
	//   18   35:aload_1         
	//   19   36:aload_0         
	//   20   37:getfield        #69  <Field SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver mVolumeChangeReceiver>
	//   21   40:new             #26  <Class IntentFilter>
	//   22   43:dup             
	//   23   44:ldc1            #71  <String "android.media.VOLUME_CHANGED_ACTION">
	//   24   46:invokespecial   #73  <Method void IntentFilter(String)>
	//   25   49:invokevirtual   #77  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   26   52:pop             
		publishRoutes();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #80  <Method void publishRoutes()>
	//   29   57:return          
	}
}
