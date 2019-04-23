// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.media;

import android.content.*;

final class SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION") && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3)
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #32  <Method String Intent.getAction()>
	//*   2    4:ldc1            #14  <String "android.media.VOLUME_CHANGED_ACTION">
	//*   3    6:invokevirtual   #38  <Method boolean String.equals(Object)>
	//*   4    9:ifeq            53
	//*   5   12:aload_2         
	//*   6   13:ldc1            #8   <String "android.media.EXTRA_VOLUME_STREAM_TYPE">
	//*   7   15:iconst_m1       
	//*   8   16:invokevirtual   #42  <Method int Intent.getIntExtra(String, int)>
	//*   9   19:iconst_3        
	//*  10   20:icmpne          53
		{
			int i = intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_VALUE", -1);
	//   11   23:aload_2         
	//   12   24:ldc1            #11  <String "android.media.EXTRA_VOLUME_STREAM_VALUE">
	//   13   26:iconst_m1       
	//   14   27:invokevirtual   #42  <Method int Intent.getIntExtra(String, int)>
	//   15   30:istore_3        
			if(i >= 0 && i != mLastReportedVolume)
	//*  16   31:iload_3         
	//*  17   32:iflt            53
	//*  18   35:iload_3         
	//*  19   36:aload_0         
	//*  20   37:getfield        #20  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//*  21   40:getfield        #48  <Field int SystemMediaRouteProvider$LegacyImpl.mLastReportedVolume>
	//*  22   43:icmpeq          53
				publishRoutes();
	//   23   46:aload_0         
	//   24   47:getfield        #20  <Field SystemMediaRouteProvider$LegacyImpl this$0>
	//   25   50:invokevirtual   #51  <Method void SystemMediaRouteProvider$LegacyImpl.publishRoutes()>
		}
	//   26   53:return          
	}

	public static final String EXTRA_VOLUME_STREAM_TYPE = "android.media.EXTRA_VOLUME_STREAM_TYPE";
	public static final String EXTRA_VOLUME_STREAM_VALUE = "android.media.EXTRA_VOLUME_STREAM_VALUE";
	public static final String VOLUME_CHANGED_ACTION = "android.media.VOLUME_CHANGED_ACTION";
	final SystemMediaRouteProvider.LegacyImpl this$0;

	SystemMediaRouteProvider$LegacyImpl$VolumeChangeReceiver()
	{
		this$0 = SystemMediaRouteProvider.LegacyImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field SystemMediaRouteProvider$LegacyImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #23  <Method void BroadcastReceiver()>
	//    5    9:return          
	}
}
