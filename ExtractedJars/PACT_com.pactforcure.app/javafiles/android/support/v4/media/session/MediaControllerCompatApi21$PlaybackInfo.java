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
		byte byte0 = 3;
	//    0    0:iconst_3        
	//    1    1:istore_1        
		if((audioattributes.getFlags() & 1) != 1) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:invokevirtual   #52  <Method int AudioAttributes.getFlags()>
	//    4    6:iconst_1        
	//    5    7:iand            
	//    6    8:iconst_1        
	//    7    9:icmpne          17
_L1:
		byte0 = 7;
	//    8   12:bipush          7
	//    9   14:istore_1        
_L4:
		return ((int) (byte0));
	//   10   15:iload_1         
	//   11   16:ireturn         
_L2:
		if((audioattributes.getFlags() & 4) == 4)
	//*  12   17:aload_0         
	//*  13   18:invokevirtual   #52  <Method int AudioAttributes.getFlags()>
	//*  14   21:iconst_4        
	//*  15   22:iand            
	//*  16   23:iconst_4        
	//*  17   24:icmpne          30
			return 6;
	//   18   27:bipush          6
	//   19   29:ireturn         
		switch(audioattributes.getUsage())
	//*  20   30:aload_0         
	//*  21   31:invokevirtual   #55  <Method int AudioAttributes.getUsage()>
		{
	//*  22   34:tableswitch     1 14: default 104
	//	               1 15
	//	               2 106
	//	               3 110
	//	               4 113
	//	               5 117
	//	               6 115
	//	               7 117
	//	               8 117
	//	               9 117
	//	               10 117
	//	               11 15
	//	               12 15
	//	               13 108
	//	               14 15
		default:
			return 3;
	//   23  104:iconst_3        
	//   24  105:ireturn         

		case 2: // '\002'
			return 0;
	//   25  106:iconst_0        
	//   26  107:ireturn         

		case 13: // '\r'
			return 1;
	//   27  108:iconst_1        
	//   28  109:ireturn         

		case 3: // '\003'
			return 8;
	//   29  110:bipush          8
	//   30  112:ireturn         

		case 4: // '\004'
			return 4;
	//   31  113:iconst_4        
	//   32  114:ireturn         

		case 6: // '\006'
			return 2;
	//   33  115:iconst_2        
	//   34  116:ireturn         

		case 5: // '\005'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
			return 5;
	//   35  117:iconst_5        
	//   36  118:ireturn         

		case 1: // '\001'
		case 11: // '\013'
		case 12: // '\f'
		case 14: // '\016'
			break;
		}
		if(true) goto _L4; else goto _L3
_L3:
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
