// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Annotation;
import java.util.UUID;

public final class C
{
	public static interface AudioContentType
		extends Annotation
	{
	}

	public static interface AudioFlags
		extends Annotation
	{
	}

	public static interface AudioUsage
		extends Annotation
	{
	}

	public static interface BufferFlags
		extends Annotation
	{
	}

	public static interface ColorRange
		extends Annotation
	{
	}

	public static interface ColorSpace
		extends Annotation
	{
	}

	public static interface ColorTransfer
		extends Annotation
	{
	}

	public static interface ContentType
		extends Annotation
	{
	}

	public static interface CryptoMode
		extends Annotation
	{
	}

	public static interface Encoding
		extends Annotation
	{
	}

	public static interface PcmEncoding
		extends Annotation
	{
	}

	public static interface SelectionFlags
		extends Annotation
	{
	}

	public static interface StereoMode
		extends Annotation
	{
	}

	public static interface StreamType
		extends Annotation
	{
	}

	public static interface VideoScalingMode
		extends Annotation
	{
	}


	private C()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #289 <Method void Object()>
	//    2    4:return          
	}

	public static int generateAudioSessionIdV21(Context context)
	{
		return ((AudioManager)context.getSystemService("audio")).generateAudioSessionId();
	//    0    0:aload_0         
	//    1    1:ldc2            #296 <String "audio">
	//    2    4:invokevirtual   #302 <Method Object Context.getSystemService(String)>
	//    3    7:checkcast       #304 <Class AudioManager>
	//    4   10:invokevirtual   #308 <Method int AudioManager.generateAudioSessionId()>
	//    5   13:ireturn         
	}

	public static long msToUs(long l)
	{
		long l1 = l;
	//    0    0:lload_0         
	//    1    1:lstore_2        
		if(l != 0x1L)
	//*   2    2:lload_0         
	//*   3    3:ldc2w           #201 <Long 0x1L>
	//*   4    6:lcmp            
	//*   5    7:ifeq            26
		{
			if(l == 0x0L)
	//*   6   10:lload_0         
	//*   7   11:ldc2w           #198 <Long 0x0L>
	//*   8   14:lcmp            
	//*   9   15:ifne            20
				return l;
	//   10   18:lload_0         
	//   11   19:lreturn         
			l1 = l * 1000L;
	//   12   20:lload_0         
	//   13   21:ldc2w           #312 <Long 1000L>
	//   14   24:lmul            
	//   15   25:lstore_2        
		}
		return l1;
	//   16   26:lload_2         
	//   17   27:lreturn         
	}

	public static long usToMs(long l)
	{
		long l1 = l;
	//    0    0:lload_0         
	//    1    1:lstore_2        
		if(l != 0x1L)
	//*   2    2:lload_0         
	//*   3    3:ldc2w           #201 <Long 0x1L>
	//*   4    6:lcmp            
	//*   5    7:ifeq            26
		{
			if(l == 0x0L)
	//*   6   10:lload_0         
	//*   7   11:ldc2w           #198 <Long 0x0L>
	//*   8   14:lcmp            
	//*   9   15:ifne            20
				return l;
	//   10   18:lload_0         
	//   11   19:lreturn         
			l1 = l / 1000L;
	//   12   20:lload_0         
	//   13   21:ldc2w           #312 <Long 1000L>
	//   14   24:ldiv            
	//   15   25:lstore_2        
		}
		return l1;
	//   16   26:lload_2         
	//   17   27:lreturn         
	}

	public static final String ASCII_NAME = "US-ASCII";
	public static final int AUDIO_SESSION_ID_UNSET = 0;
	public static final int BUFFER_FLAG_DECODE_ONLY = 0x80000000;
	public static final int BUFFER_FLAG_ENCRYPTED = 0x40000000;
	public static final int BUFFER_FLAG_END_OF_STREAM = 4;
	public static final int BUFFER_FLAG_KEY_FRAME = 1;
	public static final String CENC_TYPE_cbc1 = "cbc1";
	public static final String CENC_TYPE_cbcs = "cbcs";
	public static final String CENC_TYPE_cenc = "cenc";
	public static final String CENC_TYPE_cens = "cens";
	public static final int CHANNEL_OUT_7POINT1_SURROUND;
	public static final UUID CLEARKEY_UUID = new UUID(0xa985b3c9L, 0xaf78d30eL);
	public static final int COLOR_RANGE_FULL = 1;
	public static final int COLOR_RANGE_LIMITED = 2;
	public static final int COLOR_SPACE_BT2020 = 6;
	public static final int COLOR_SPACE_BT601 = 2;
	public static final int COLOR_SPACE_BT709 = 1;
	public static final int COLOR_TRANSFER_HLG = 7;
	public static final int COLOR_TRANSFER_SDR = 3;
	public static final int COLOR_TRANSFER_ST2084 = 6;
	public static final UUID COMMON_PSSH_UUID = new UUID(0xc0b24d02L, 0x52e2fb4bL);
	public static final int CONTENT_TYPE_MOVIE = 3;
	public static final int CONTENT_TYPE_MUSIC = 2;
	public static final int CONTENT_TYPE_SONIFICATION = 4;
	public static final int CONTENT_TYPE_SPEECH = 1;
	public static final int CONTENT_TYPE_UNKNOWN = 0;
	public static final int CRYPTO_MODE_AES_CBC = 2;
	public static final int CRYPTO_MODE_AES_CTR = 1;
	public static final int CRYPTO_MODE_UNENCRYPTED = 0;
	public static final int DATA_TYPE_AD = 6;
	public static final int DATA_TYPE_CUSTOM_BASE = 10000;
	public static final int DATA_TYPE_DRM = 3;
	public static final int DATA_TYPE_MANIFEST = 4;
	public static final int DATA_TYPE_MEDIA = 1;
	public static final int DATA_TYPE_MEDIA_INITIALIZATION = 2;
	public static final int DATA_TYPE_TIME_SYNCHRONIZATION = 5;
	public static final int DATA_TYPE_UNKNOWN = 0;
	public static final int DEFAULT_AUDIO_BUFFER_SIZE = 0x360000;
	public static final int DEFAULT_BUFFER_SEGMENT_SIZE = 0x10000;
	public static final int DEFAULT_METADATA_BUFFER_SIZE = 0x20000;
	public static final int DEFAULT_MUXED_BUFFER_SIZE = 0x1000000;
	public static final int DEFAULT_TEXT_BUFFER_SIZE = 0x20000;
	public static final int DEFAULT_VIDEO_BUFFER_SIZE = 0xc80000;
	public static final int ENCODING_AC3 = 5;
	public static final int ENCODING_DOLBY_TRUEHD = 14;
	public static final int ENCODING_DTS = 7;
	public static final int ENCODING_DTS_HD = 8;
	public static final int ENCODING_E_AC3 = 6;
	public static final int ENCODING_INVALID = 0;
	public static final int ENCODING_PCM_16BIT = 2;
	public static final int ENCODING_PCM_24BIT = 0x80000000;
	public static final int ENCODING_PCM_32BIT = 0x40000000;
	public static final int ENCODING_PCM_8BIT = 3;
	public static final int ENCODING_PCM_FLOAT = 4;
	public static final int FLAG_AUDIBILITY_ENFORCED = 1;
	public static final int INDEX_UNSET = -1;
	public static final String LANGUAGE_UNDETERMINED = "und";
	public static final int LENGTH_UNSET = -1;
	public static final long MICROS_PER_SECOND = 0xf4240L;
	public static final int MSG_CUSTOM_BASE = 10000;
	public static final int MSG_SET_AUDIO_ATTRIBUTES = 3;
	public static final int MSG_SET_SCALING_MODE = 4;
	public static final int MSG_SET_SURFACE = 1;
	public static final int MSG_SET_VOLUME = 2;
	public static final long NANOS_PER_SECOND = 0x3b9aca00L;
	public static final int PERCENTAGE_UNSET = -1;
	public static final UUID PLAYREADY_UUID = new UUID(0x98404286L, 0xe0885f95L);
	public static final int POSITION_UNSET = -1;
	public static final int PRIORITY_DOWNLOAD = -1000;
	public static final int PRIORITY_PLAYBACK = 0;
	public static final int RESULT_BUFFER_READ = -4;
	public static final int RESULT_END_OF_INPUT = -1;
	public static final int RESULT_FORMAT_READ = -5;
	public static final int RESULT_MAX_LENGTH_EXCEEDED = -2;
	public static final int RESULT_NOTHING_READ = -3;
	public static final String SANS_SERIF_NAME = "sans-serif";
	public static final int SELECTION_FLAG_AUTOSELECT = 4;
	public static final int SELECTION_FLAG_DEFAULT = 1;
	public static final int SELECTION_FLAG_FORCED = 2;
	public static final int SELECTION_REASON_ADAPTIVE = 3;
	public static final int SELECTION_REASON_CUSTOM_BASE = 10000;
	public static final int SELECTION_REASON_INITIAL = 1;
	public static final int SELECTION_REASON_MANUAL = 2;
	public static final int SELECTION_REASON_TRICK_PLAY = 4;
	public static final int SELECTION_REASON_UNKNOWN = 0;
	public static final String SERIF_NAME = "serif";
	public static final int STEREO_MODE_LEFT_RIGHT = 2;
	public static final int STEREO_MODE_MONO = 0;
	public static final int STEREO_MODE_STEREO_MESH = 3;
	public static final int STEREO_MODE_TOP_BOTTOM = 1;
	public static final int STREAM_TYPE_ALARM = 4;
	public static final int STREAM_TYPE_DEFAULT = 3;
	public static final int STREAM_TYPE_DTMF = 8;
	public static final int STREAM_TYPE_MUSIC = 3;
	public static final int STREAM_TYPE_NOTIFICATION = 5;
	public static final int STREAM_TYPE_RING = 2;
	public static final int STREAM_TYPE_SYSTEM = 1;
	public static final int STREAM_TYPE_USE_DEFAULT = 0x80000000;
	public static final int STREAM_TYPE_VOICE_CALL = 0;
	public static final long TIME_END_OF_SOURCE = 0x0L;
	public static final long TIME_UNSET = 0x1L;
	public static final int TRACK_TYPE_AUDIO = 1;
	public static final int TRACK_TYPE_CUSTOM_BASE = 10000;
	public static final int TRACK_TYPE_DEFAULT = 0;
	public static final int TRACK_TYPE_METADATA = 4;
	public static final int TRACK_TYPE_NONE = 5;
	public static final int TRACK_TYPE_TEXT = 3;
	public static final int TRACK_TYPE_UNKNOWN = -1;
	public static final int TRACK_TYPE_VIDEO = 2;
	public static final int TYPE_DASH = 0;
	public static final int TYPE_HLS = 2;
	public static final int TYPE_OTHER = 3;
	public static final int TYPE_SS = 1;
	public static final int USAGE_ALARM = 4;
	public static final int USAGE_ASSISTANCE_ACCESSIBILITY = 11;
	public static final int USAGE_ASSISTANCE_NAVIGATION_GUIDANCE = 12;
	public static final int USAGE_ASSISTANCE_SONIFICATION = 13;
	public static final int USAGE_GAME = 14;
	public static final int USAGE_MEDIA = 1;
	public static final int USAGE_NOTIFICATION = 5;
	public static final int USAGE_NOTIFICATION_COMMUNICATION_DELAYED = 9;
	public static final int USAGE_NOTIFICATION_COMMUNICATION_INSTANT = 8;
	public static final int USAGE_NOTIFICATION_COMMUNICATION_REQUEST = 7;
	public static final int USAGE_NOTIFICATION_EVENT = 10;
	public static final int USAGE_NOTIFICATION_RINGTONE = 6;
	public static final int USAGE_UNKNOWN = 0;
	public static final int USAGE_VOICE_COMMUNICATION = 2;
	public static final int USAGE_VOICE_COMMUNICATION_SIGNALLING = 3;
	public static final String UTF16_NAME = "UTF-16";
	public static final String UTF8_NAME = "UTF-8";
	public static final UUID UUID_NIL = new UUID(0L, 0L);
	public static final int VIDEO_SCALING_MODE_DEFAULT = 1;
	public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT = 1;
	public static final int VIDEO_SCALING_MODE_SCALE_TO_FIT_WITH_CROPPING = 2;
	public static final UUID WIDEVINE_UUID = new UUID(0x79d64aceL, 0xd51d21edL);

	static 
	{
		int i;
		if(Util.SDK_INT < 23)
	//*   0    0:getstatic       #252 <Field int Util.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmpge          15
			i = 1020;
	//    3    8:sipush          1020
	//    4   11:istore_0        
		else
	//*   5   12:goto            19
			i = 6396;
	//    6   15:sipush          6396
	//    7   18:istore_0        
		CHANNEL_OUT_7POINT1_SURROUND = i;
	//    8   19:iload_0         
	//    9   20:putstatic       #254 <Field int CHANNEL_OUT_7POINT1_SURROUND>
	//   10   23:new             #256 <Class UUID>
	//   11   26:dup             
	//   12   27:lconst_0        
	//   13   28:lconst_0        
	//   14   29:invokespecial   #260 <Method void UUID(long, long)>
	//   15   32:putstatic       #262 <Field UUID UUID_NIL>
	//   16   35:new             #256 <Class UUID>
	//   17   38:dup             
	//   18   39:ldc2w           #263 <Long 0xc0b24d02L>
	//   19   42:ldc2w           #265 <Long 0x52e2fb4bL>
	//   20   45:invokespecial   #260 <Method void UUID(long, long)>
	//   21   48:putstatic       #268 <Field UUID COMMON_PSSH_UUID>
	//   22   51:new             #256 <Class UUID>
	//   23   54:dup             
	//   24   55:ldc2w           #269 <Long 0xa985b3c9L>
	//   25   58:ldc2w           #271 <Long 0xaf78d30eL>
	//   26   61:invokespecial   #260 <Method void UUID(long, long)>
	//   27   64:putstatic       #274 <Field UUID CLEARKEY_UUID>
	//   28   67:new             #256 <Class UUID>
	//   29   70:dup             
	//   30   71:ldc2w           #275 <Long 0x79d64aceL>
	//   31   74:ldc2w           #277 <Long 0xd51d21edL>
	//   32   77:invokespecial   #260 <Method void UUID(long, long)>
	//   33   80:putstatic       #280 <Field UUID WIDEVINE_UUID>
	//   34   83:new             #256 <Class UUID>
	//   35   86:dup             
	//   36   87:ldc2w           #281 <Long 0x98404286L>
	//   37   90:ldc2w           #283 <Long 0xe0885f95L>
	//   38   93:invokespecial   #260 <Method void UUID(long, long)>
	//   39   96:putstatic       #286 <Field UUID PLAYREADY_UUID>
	//*  40   99:return          
	}
}
