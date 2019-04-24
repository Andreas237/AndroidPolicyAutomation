// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.media.session;

import android.media.AudioAttributes;

// Referenced classes of package android.support.v4.media.session:
//			MediaControllerCompatApi21

public static class MediaControllerCompatApi21$PlaybackInfo
{

	public static AudioAttributes getAudioAttributes(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getAudioAttributes();
	//    0    0:aload_0         
	//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #26  <Method AudioAttributes android.media.session.MediaController$PlaybackInfo.getAudioAttributes()>
	//    3    7:areturn         
	}

	public static int getCurrentVolume(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getCurrentVolume();
	//    0    0:aload_0         
	//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #31  <Method int android.media.session.MediaController$PlaybackInfo.getCurrentVolume()>
	//    3    7:ireturn         
	}

	public static int getLegacyAudioStream(Object obj)
	{
		return toLegacyStreamType(getAudioAttributes(obj));
	//    0    0:aload_0         
	//    1    1:invokestatic    #34  <Method AudioAttributes getAudioAttributes(Object)>
	//    2    4:invokestatic    #38  <Method int toLegacyStreamType(AudioAttributes)>
	//    3    7:ireturn         
	}

	public static int getMaxVolume(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getMaxVolume();
	//    0    0:aload_0         
	//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #41  <Method int android.media.session.MediaController$PlaybackInfo.getMaxVolume()>
	//    3    7:ireturn         
	}

	public static int getPlaybackType(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getPlaybackType();
	//    0    0:aload_0         
	//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #44  <Method int android.media.session.MediaController$PlaybackInfo.getPlaybackType()>
	//    3    7:ireturn         
	}

	public static int getVolumeControl(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getVolumeControl();
	//    0    0:aload_0         
	//    1    1:checkcast       #23  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #47  <Method int android.media.session.MediaController$PlaybackInfo.getVolumeControl()>
	//    3    7:ireturn         
	}

	private static int toLegacyStreamType(AudioAttributes audioattributes)
	{
		if((audioattributes.getFlags() & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #52  <Method int AudioAttributes.getFlags()>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          13
			return 7;
	//    6   10:bipush          7
	//    7   12:ireturn         
		if((audioattributes.getFlags() & 4) == 4)
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #52  <Method int AudioAttributes.getFlags()>
	//*  10   17:iconst_4        
	//*  11   18:iand            
	//*  12   19:iconst_4        
	//*  13   20:icmpne          26
			return 6;
	//   14   23:bipush          6
	//   15   25:ireturn         
		switch(audioattributes.getUsage())
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #55  <Method int AudioAttributes.getUsage()>
		{
	//*  18   30:tableswitch     0 14: default 104
	//	               0 122
	//	               1 107
	//	               2 111
	//	               3 113
	//	               4 116
	//	               5 120
	//	               6 118
	//	               7 120
	//	               8 120
	//	               9 120
	//	               10 120
	//	               11 107
	//	               12 107
	//	               13 109
	//	               14 107
	//*  19  104:goto            122
		case 1: // '\001'
		case 11: // '\013'
		case 12: // '\f'
		case 14: // '\016'
			return 3;
	//   20  107:iconst_3        
	//   21  108:ireturn         

		case 13: // '\r'
			return 1;
	//   22  109:iconst_1        
	//   23  110:ireturn         

		case 2: // '\002'
			return 0;
	//   24  111:iconst_0        
	//   25  112:ireturn         

		case 3: // '\003'
			return 8;
	//   26  113:bipush          8
	//   27  115:ireturn         

		case 4: // '\004'
			return 4;
	//   28  116:iconst_4        
	//   29  117:ireturn         

		case 6: // '\006'
			return 2;
	//   30  118:iconst_2        
	//   31  119:ireturn         

		case 5: // '\005'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
			return 5;
	//   32  120:iconst_5        
	//   33  121:ireturn         
		}
		return 3;
	//   34  122:iconst_3        
	//   35  123:ireturn         
	}

	private static final int FLAG_SCO = 4;
	private static final int STREAM_BLUETOOTH_SCO = 6;
	private static final int STREAM_SYSTEM_ENFORCED = 7;

	public MediaControllerCompatApi21$PlaybackInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}
