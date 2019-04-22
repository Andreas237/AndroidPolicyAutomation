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
	//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #14  <Method AudioAttributes android.media.session.MediaController$PlaybackInfo.getAudioAttributes()>
	//    3    7:areturn         
	}

	public static int getCurrentVolume(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getCurrentVolume();
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #20  <Method int android.media.session.MediaController$PlaybackInfo.getCurrentVolume()>
	//    3    7:ireturn         
	}

	public static int getLegacyAudioStream(Object obj)
	{
		return toLegacyStreamType(getAudioAttributes(obj));
	//    0    0:aload_0         
	//    1    1:invokestatic    #23  <Method AudioAttributes getAudioAttributes(Object)>
	//    2    4:invokestatic    #27  <Method int toLegacyStreamType(AudioAttributes)>
	//    3    7:ireturn         
	}

	public static int getMaxVolume(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getMaxVolume();
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #30  <Method int android.media.session.MediaController$PlaybackInfo.getMaxVolume()>
	//    3    7:ireturn         
	}

	public static int getPlaybackType(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getPlaybackType();
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #33  <Method int android.media.session.MediaController$PlaybackInfo.getPlaybackType()>
	//    3    7:ireturn         
	}

	public static int getVolumeControl(Object obj)
	{
		return ((android.media.session.MediaController.PlaybackInfo)obj).getVolumeControl();
	//    0    0:aload_0         
	//    1    1:checkcast       #11  <Class android.media.session.MediaController$PlaybackInfo>
	//    2    4:invokevirtual   #36  <Method int android.media.session.MediaController$PlaybackInfo.getVolumeControl()>
	//    3    7:ireturn         
	}

	private static int toLegacyStreamType(AudioAttributes audioattributes)
	{
		if((audioattributes.getFlags() & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #41  <Method int AudioAttributes.getFlags()>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:iconst_1        
	//*   5    7:icmpne          13
			return 7;
	//    6   10:bipush          7
	//    7   12:ireturn         
		if((audioattributes.getFlags() & 4) == 4)
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #41  <Method int AudioAttributes.getFlags()>
	//*  10   17:iconst_4        
	//*  11   18:iand            
	//*  12   19:iconst_4        
	//*  13   20:icmpne          26
			return 6;
	//   14   23:bipush          6
	//   15   25:ireturn         
		switch(audioattributes.getUsage())
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #44  <Method int AudioAttributes.getUsage()>
		{
	//*  18   30:tableswitch     1 14: default 100
	//	               1 115
	//	               2 113
	//	               3 110
	//	               4 108
	//	               5 106
	//	               6 104
	//	               7 106
	//	               8 106
	//	               9 106
	//	               10 106
	//	               11 115
	//	               12 115
	//	               13 102
	//	               14 115
		default:
			return 3;
	//   19  100:iconst_3        
	//   20  101:ireturn         

		case 13: // '\r'
			return 1;
	//   21  102:iconst_1        
	//   22  103:ireturn         

		case 6: // '\006'
			return 2;
	//   23  104:iconst_2        
	//   24  105:ireturn         

		case 5: // '\005'
		case 7: // '\007'
		case 8: // '\b'
		case 9: // '\t'
		case 10: // '\n'
			return 5;
	//   25  106:iconst_5        
	//   26  107:ireturn         

		case 4: // '\004'
			return 4;
	//   27  108:iconst_4        
	//   28  109:ireturn         

		case 3: // '\003'
			return 8;
	//   29  110:bipush          8
	//   30  112:ireturn         

		case 2: // '\002'
			return 0;
	//   31  113:iconst_0        
	//   32  114:ireturn         

		case 1: // '\001'
		case 11: // '\013'
		case 12: // '\f'
		case 14: // '\016'
			return 3;
	//   33  115:iconst_3        
	//   34  116:ireturn         
		}
	}
}
