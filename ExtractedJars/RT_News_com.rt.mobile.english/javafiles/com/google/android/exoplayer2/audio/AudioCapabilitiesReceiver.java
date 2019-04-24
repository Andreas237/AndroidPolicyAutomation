// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.content.*;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioCapabilities

public final class AudioCapabilitiesReceiver
{
	private final class HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context1, Intent intent)
		{
			if(!isInitialStickyBroadcast())
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #26  <Method boolean isInitialStickyBroadcast()>
		//*   2    4:ifne            47
			{
				context1 = ((Context) (AudioCapabilities.getCapabilities(intent)));
		//    3    7:aload_2         
		//    4    8:invokestatic    #32  <Method AudioCapabilities AudioCapabilities.getCapabilities(Intent)>
		//    5   11:astore_1        
				if(!((AudioCapabilities) (context1)).equals(((Object) (audioCapabilities))))
		//*   6   12:aload_1         
		//*   7   13:aload_0         
		//*   8   14:getfield        #13  <Field AudioCapabilitiesReceiver this$0>
		//*   9   17:getfield        #36  <Field AudioCapabilities AudioCapabilitiesReceiver.audioCapabilities>
		//*  10   20:invokevirtual   #40  <Method boolean AudioCapabilities.equals(Object)>
		//*  11   23:ifne            47
				{
					audioCapabilities = ((AudioCapabilities) (context1));
		//   12   26:aload_0         
		//   13   27:getfield        #13  <Field AudioCapabilitiesReceiver this$0>
		//   14   30:aload_1         
		//   15   31:putfield        #36  <Field AudioCapabilities AudioCapabilitiesReceiver.audioCapabilities>
					listener.onAudioCapabilitiesChanged(((AudioCapabilities) (context1)));
		//   16   34:aload_0         
		//   17   35:getfield        #13  <Field AudioCapabilitiesReceiver this$0>
		//   18   38:invokestatic    #44  <Method AudioCapabilitiesReceiver$Listener AudioCapabilitiesReceiver.access$100(AudioCapabilitiesReceiver)>
		//   19   41:aload_1         
		//   20   42:invokeinterface #50  <Method void AudioCapabilitiesReceiver$Listener.onAudioCapabilitiesChanged(AudioCapabilities)>
				}
			}
		//   21   47:return          
		}

		final AudioCapabilitiesReceiver this$0;

		private HdmiAudioPlugBroadcastReceiver()
		{
			this$0 = AudioCapabilitiesReceiver.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AudioCapabilitiesReceiver this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}

	}

	public static interface Listener
	{

		public abstract void onAudioCapabilitiesChanged(AudioCapabilities audiocapabilities);
	}


	public AudioCapabilitiesReceiver(Context context1, Listener listener1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		context = (Context)Assertions.checkNotNull(((Object) (context1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #31  <Method Object Assertions.checkNotNull(Object)>
	//    5    9:checkcast       #33  <Class Context>
	//    6   12:putfield        #35  <Field Context context>
		listener = (Listener)Assertions.checkNotNull(((Object) (listener1)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #31  <Method Object Assertions.checkNotNull(Object)>
	//   10   20:checkcast       #11  <Class AudioCapabilitiesReceiver$Listener>
	//   11   23:putfield        #37  <Field AudioCapabilitiesReceiver$Listener listener>
		if(Util.SDK_INT >= 21)
	//*  12   26:getstatic       #43  <Field int Util.SDK_INT>
	//*  13   29:bipush          21
	//*  14   31:icmplt          47
			context1 = ((Context) (new HdmiAudioPlugBroadcastReceiver()));
	//   15   34:new             #8   <Class AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver>
	//   16   37:dup             
	//   17   38:aload_0         
	//   18   39:aconst_null     
	//   19   40:invokespecial   #46  <Method void AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver, AudioCapabilitiesReceiver$1)>
	//   20   43:astore_1        
		else
	//*  21   44:goto            49
			context1 = null;
	//   22   47:aconst_null     
	//   23   48:astore_1        
		receiver = ((BroadcastReceiver) (context1));
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:putfield        #48  <Field BroadcastReceiver receiver>
	//   27   54:return          
	}

	public AudioCapabilities register()
	{
		Intent intent;
		if(receiver == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field BroadcastReceiver receiver>
	//*   2    4:ifnonnull       12
			intent = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:goto            33
			intent = context.registerReceiver(receiver, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field Context context>
	//    8   16:aload_0         
	//    9   17:getfield        #48  <Field BroadcastReceiver receiver>
	//   10   20:new             #55  <Class IntentFilter>
	//   11   23:dup             
	//   12   24:ldc1            #57  <String "android.media.action.HDMI_AUDIO_PLUG">
	//   13   26:invokespecial   #60  <Method void IntentFilter(String)>
	//   14   29:invokevirtual   #64  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   15   32:astore_1        
		audioCapabilities = AudioCapabilities.getCapabilities(intent);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokestatic    #70  <Method AudioCapabilities AudioCapabilities.getCapabilities(Intent)>
	//   19   38:putfield        #72  <Field AudioCapabilities audioCapabilities>
		return audioCapabilities;
	//   20   41:aload_0         
	//   21   42:getfield        #72  <Field AudioCapabilities audioCapabilities>
	//   22   45:areturn         
	}

	public void unregister()
	{
		if(receiver != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field BroadcastReceiver receiver>
	//*   2    4:ifnull          18
			context.unregisterReceiver(receiver);
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Context context>
	//    5   11:aload_0         
	//    6   12:getfield        #48  <Field BroadcastReceiver receiver>
	//    7   15:invokevirtual   #77  <Method void Context.unregisterReceiver(BroadcastReceiver)>
	//    8   18:return          
	}

	AudioCapabilities audioCapabilities;
	private final Context context;
	private final Listener listener;
	private final BroadcastReceiver receiver;


/*
	static Listener access$100(AudioCapabilitiesReceiver audiocapabilitiesreceiver)
	{
		return audiocapabilitiesreceiver.listener;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AudioCapabilitiesReceiver$Listener listener>
	//    2    4:areturn         
	}

*/
}
