// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.audio;

import android.content.*;

// Referenced classes of package com.google.android.exoplayer2.audio:
//			AudioCapabilitiesReceiver, AudioCapabilities

private final class AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver extends BroadcastReceiver
{

	public void onReceive(Context context, Intent intent)
	{
		if(!isInitialStickyBroadcast())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #26  <Method boolean isInitialStickyBroadcast()>
	//*   2    4:ifne            47
		{
			context = ((Context) (AudioCapabilities.getCapabilities(intent)));
	//    3    7:aload_2         
	//    4    8:invokestatic    #32  <Method AudioCapabilities AudioCapabilities.getCapabilities(Intent)>
	//    5   11:astore_1        
			if(!((AudioCapabilities) (context)).equals(((Object) (audioCapabilities))))
	//*   6   12:aload_1         
	//*   7   13:aload_0         
	//*   8   14:getfield        #13  <Field AudioCapabilitiesReceiver this$0>
	//*   9   17:getfield        #36  <Field AudioCapabilities AudioCapabilitiesReceiver.audioCapabilities>
	//*  10   20:invokevirtual   #40  <Method boolean AudioCapabilities.equals(Object)>
	//*  11   23:ifne            47
			{
				audioCapabilities = ((AudioCapabilities) (context));
	//   12   26:aload_0         
	//   13   27:getfield        #13  <Field AudioCapabilitiesReceiver this$0>
	//   14   30:aload_1         
	//   15   31:putfield        #36  <Field AudioCapabilities AudioCapabilitiesReceiver.audioCapabilities>
				AudioCapabilitiesReceiver.access$100(AudioCapabilitiesReceiver.this).onAudioCapabilitiesChanged(((AudioCapabilities) (context)));
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

	private AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver()
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

	AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void AudioCapabilitiesReceiver$HdmiAudioPlugBroadcastReceiver(AudioCapabilitiesReceiver)>
	//    3    5:return          
	}
}
