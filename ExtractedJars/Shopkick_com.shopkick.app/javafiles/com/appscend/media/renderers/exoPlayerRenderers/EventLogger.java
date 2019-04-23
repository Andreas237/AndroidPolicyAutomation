// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.media.renderers.exoPlayerRenderers;

import android.os.SystemClock;
import android.util.Log;
import com.appscend.media.APSMediaPlayer;
import com.google.android.exoplayer.TimeRange;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.util.VerboseLogUtil;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class EventLogger
	implements ExoPlayerInterface.Listener, ExoPlayerInterface.InfoListener, ExoPlayerInterface.InternalErrorListener
{

	public EventLogger()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		loadStartTimeMs = new long[4];
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:newarray        long[]
	//    5    8:putfield        #50  <Field long[] loadStartTimeMs>
	//    6   11:return          
	}

	private String getSessionTimeString()
	{
		return getTimeString(SystemClock.elapsedRealtime() - sessionStartTimeMs);
	//    0    0:aload_0         
	//    1    1:invokestatic    #58  <Method long SystemClock.elapsedRealtime()>
	//    2    4:aload_0         
	//    3    5:getfield        #60  <Field long sessionStartTimeMs>
	//    4    8:lsub            
	//    5    9:invokespecial   #64  <Method String getTimeString(long)>
	//    6   12:areturn         
	}

	private String getStateString(int i)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 51
	//	               2 48
	//	               3 45
	//	               4 42
	//	               5 39
		default:
			return "?";
	//    2   36:ldc1            #68  <String "?">
	//    3   38:areturn         

		case 5: // '\005'
			return "E";
	//    4   39:ldc1            #70  <String "E">
	//    5   41:areturn         

		case 4: // '\004'
			return "R";
	//    6   42:ldc1            #72  <String "R">
	//    7   44:areturn         

		case 3: // '\003'
			return "B";
	//    8   45:ldc1            #74  <String "B">
	//    9   47:areturn         

		case 2: // '\002'
			return "P";
	//   10   48:ldc1            #76  <String "P">
	//   11   50:areturn         

		case 1: // '\001'
			return "I";
	//   12   51:ldc1            #78  <String "I">
	//   13   53:areturn         
		}
	}

	private String getTimeString(long l)
	{
		return TIME_FORMAT.format((float)l / 1000F);
	//    0    0:getstatic       #37  <Field NumberFormat TIME_FORMAT>
	//    1    3:lload_1         
	//    2    4:l2f             
	//    3    5:ldc1            #79  <Float 1000F>
	//    4    7:fdiv            
	//    5    8:f2d             
	//    6    9:invokevirtual   #83  <Method String NumberFormat.format(double)>
	//    7   12:areturn         
	}

	private void printInternalError(String s, Exception exception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("internalError [");
	//    4    8:aload_3         
	//    5    9:ldc1            #90  <String "internalError [">
	//    6   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   20:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_3         
	//   14   25:ldc1            #98  <String ", ">
	//   15   27:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(s);
	//   17   31:aload_3         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		stringbuilder.append("]");
	//   21   37:aload_3         
	//   22   38:ldc1            #100 <String "]">
	//   23   40:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   24   43:pop             
		Log.e("EventLogger", stringbuilder.toString(), ((Throwable) (exception)));
	//   25   44:ldc1            #14  <String "EventLogger">
	//   26   46:aload_3         
	//   27   47:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   28   50:aload_2         
	//   29   51:invokestatic    #109 <Method int Log.e(String, String, Throwable)>
	//   30   54:pop             
	//   31   55:return          
	}

	public void endSession()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("end [");
	//    4    8:aload_1         
	//    5    9:ldc1            #112 <String "end [">
	//    6   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   20:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_1         
	//   14   25:ldc1            #100 <String "]">
	//   15   27:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   17   31:ldc1            #14  <String "EventLogger">
	//   18   33:aload_1         
	//   19   34:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   20   37:invokestatic    #116 <Method int Log.d(String, String)>
	//   21   40:pop             
	//   22   41:return          
	}

	public void onAudioFormatEnabled(Format format, int i, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("audioFormat [");
	//    4    9:aload           5
	//    5   11:ldc1            #120 <String "audioFormat [">
	//    6   13:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   17:aload           5
	//    9   19:aload_0         
	//   10   20:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(", ");
	//   13   27:aload           5
	//   14   29:ldc1            #98  <String ", ">
	//   15   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(format.id);
	//   17   35:aload           5
	//   18   37:aload_1         
	//   19   38:getfield        #125 <Field String Format.id>
	//   20   41:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
		stringbuilder.append(", ");
	//   22   45:aload           5
	//   23   47:ldc1            #98  <String ", ">
	//   24   49:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append(Integer.toString(i));
	//   26   53:aload           5
	//   27   55:iload_2         
	//   28   56:invokestatic    #129 <Method String Integer.toString(int)>
	//   29   59:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   30   62:pop             
		stringbuilder.append("]");
	//   31   63:aload           5
	//   32   65:ldc1            #100 <String "]">
	//   33   67:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   34   70:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   35   71:ldc1            #14  <String "EventLogger">
	//   36   73:aload           5
	//   37   75:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   38   78:invokestatic    #116 <Method int Log.d(String, String)>
	//   39   81:pop             
	//   40   82:return          
	}

	public void onAudioTrackInitializationError(com.google.android.exoplayer.audio.AudioTrack.InitializationException initializationexception)
	{
		printInternalError("audioTrackInitializationError", ((Exception) (initializationexception)));
	//    0    0:aload_0         
	//    1    1:ldc1            #133 <String "audioTrackInitializationError">
	//    2    3:aload_1         
	//    3    4:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//    4    7:return          
	}

	public void onAudioTrackUnderrun(int i, long l, long l1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("audioTrackUnderrun [");
	//    4    9:aload           6
	//    5   11:ldc1            #139 <String "audioTrackUnderrun [">
	//    6   13:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(i);
	//    8   17:aload           6
	//    9   19:iload_1         
	//   10   20:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   11   23:pop             
		stringbuilder.append(", ");
	//   12   24:aload           6
	//   13   26:ldc1            #98  <String ", ">
	//   14   28:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(l);
	//   16   32:aload           6
	//   17   34:lload_2         
	//   18   35:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   19   38:pop             
		stringbuilder.append(", ");
	//   20   39:aload           6
	//   21   41:ldc1            #98  <String ", ">
	//   22   43:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(l1);
	//   24   47:aload           6
	//   25   49:lload           4
	//   26   51:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   27   54:pop             
		stringbuilder.append("]");
	//   28   55:aload           6
	//   29   57:ldc1            #100 <String "]">
	//   30   59:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		printInternalError(stringbuilder.toString(), ((Exception) (null)));
	//   32   63:aload_0         
	//   33   64:aload           6
	//   34   66:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   35   69:aconst_null     
	//   36   70:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//   37   73:return          
	}

	public void onAudioTrackWriteError(com.google.android.exoplayer.audio.AudioTrack.WriteException writeexception)
	{
		printInternalError("audioTrackWriteError", ((Exception) (writeexception)));
	//    0    0:aload_0         
	//    1    1:ldc1            #149 <String "audioTrackWriteError">
	//    2    3:aload_1         
	//    3    4:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//    4    7:return          
	}

	public void onAvailableRangeChanged(int i, TimeRange timerange)
	{
		availableRangeValuesUs = timerange.getCurrentBoundsUs(availableRangeValuesUs);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #153 <Field long[] availableRangeValuesUs>
	//    4    6:invokeinterface #159 <Method long[] TimeRange.getCurrentBoundsUs(long[])>
	//    5   11:putfield        #153 <Field long[] availableRangeValuesUs>
		StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #87  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #88  <Method void StringBuilder()>
	//    9   21:astore_3        
		stringbuilder.append("availableRange [");
	//   10   22:aload_3         
	//   11   23:ldc1            #161 <String "availableRange [">
	//   12   25:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
		stringbuilder.append(timerange.isStatic());
	//   14   29:aload_3         
	//   15   30:aload_2         
	//   16   31:invokeinterface #165 <Method boolean TimeRange.isStatic()>
	//   17   36:invokevirtual   #168 <Method StringBuilder StringBuilder.append(boolean)>
	//   18   39:pop             
		stringbuilder.append(", ");
	//   19   40:aload_3         
	//   20   41:ldc1            #98  <String ", ">
	//   21   43:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
		stringbuilder.append(availableRangeValuesUs[0]);
	//   23   47:aload_3         
	//   24   48:aload_0         
	//   25   49:getfield        #153 <Field long[] availableRangeValuesUs>
	//   26   52:iconst_0        
	//   27   53:laload          
	//   28   54:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   29   57:pop             
		stringbuilder.append(", ");
	//   30   58:aload_3         
	//   31   59:ldc1            #98  <String ", ">
	//   32   61:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   33   64:pop             
		stringbuilder.append(availableRangeValuesUs[1]);
	//   34   65:aload_3         
	//   35   66:aload_0         
	//   36   67:getfield        #153 <Field long[] availableRangeValuesUs>
	//   37   70:iconst_1        
	//   38   71:laload          
	//   39   72:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   40   75:pop             
		stringbuilder.append("]");
	//   41   76:aload_3         
	//   42   77:ldc1            #100 <String "]">
	//   43   79:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   45   83:ldc1            #14  <String "EventLogger">
	//   46   85:aload_3         
	//   47   86:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   48   89:invokestatic    #116 <Method int Log.d(String, String)>
	//   49   92:pop             
	//   50   93:return          
	}

	public void onBandwidthSample(int i, long l, long l1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("bandwidth [");
	//    4    9:aload           6
	//    5   11:ldc1            #171 <String "bandwidth [">
	//    6   13:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   17:aload           6
	//    9   19:aload_0         
	//   10   20:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(", ");
	//   13   27:aload           6
	//   14   29:ldc1            #98  <String ", ">
	//   15   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(l);
	//   17   35:aload           6
	//   18   37:lload_2         
	//   19   38:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   20   41:pop             
		stringbuilder.append(", ");
	//   21   42:aload           6
	//   22   44:ldc1            #98  <String ", ">
	//   23   46:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		stringbuilder.append(getTimeString(i));
	//   25   50:aload           6
	//   26   52:aload_0         
	//   27   53:iload_1         
	//   28   54:i2l             
	//   29   55:invokespecial   #64  <Method String getTimeString(long)>
	//   30   58:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
		stringbuilder.append(", ");
	//   32   62:aload           6
	//   33   64:ldc1            #98  <String ", ">
	//   34   66:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
		stringbuilder.append(l1);
	//   36   70:aload           6
	//   37   72:lload           4
	//   38   74:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   39   77:pop             
		stringbuilder.append("]");
	//   40   78:aload           6
	//   41   80:ldc1            #100 <String "]">
	//   42   82:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   43   85:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   44   86:ldc1            #14  <String "EventLogger">
	//   45   88:aload           6
	//   46   90:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   47   93:invokestatic    #116 <Method int Log.d(String, String)>
	//   48   96:pop             
	//   49   97:return          
	}

	public void onCryptoError(android.media.MediaCodec.CryptoException cryptoexception)
	{
		printInternalError("cryptoError", ((Exception) (cryptoexception)));
	//    0    0:aload_0         
	//    1    1:ldc1            #178 <String "cryptoError">
	//    2    3:aload_1         
	//    3    4:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//    4    7:return          
	}

	public void onDecoderInitializationError(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception)
	{
		printInternalError("decoderInitializationError", ((Exception) (decoderinitializationexception)));
	//    0    0:aload_0         
	//    1    1:ldc1            #183 <String "decoderInitializationError">
	//    2    3:aload_1         
	//    3    4:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//    4    7:return          
	}

	public void onDecoderInitialized(String s, long l, long l1)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("decoderInitialized [");
	//    4    9:aload           6
	//    5   11:ldc1            #187 <String "decoderInitialized [">
	//    6   13:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   17:aload           6
	//    9   19:aload_0         
	//   10   20:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(", ");
	//   13   27:aload           6
	//   14   29:ldc1            #98  <String ", ">
	//   15   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(s);
	//   17   35:aload           6
	//   18   37:aload_1         
	//   19   38:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   20   41:pop             
		stringbuilder.append("]");
	//   21   42:aload           6
	//   22   44:ldc1            #100 <String "]">
	//   23   46:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   25   50:ldc1            #14  <String "EventLogger">
	//   26   52:aload           6
	//   27   54:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   28   57:invokestatic    #116 <Method int Log.d(String, String)>
	//   29   60:pop             
	//   30   61:return          
	}

	public void onDrmSessionManagerError(Exception exception)
	{
		printInternalError("drmSessionManagerError", exception);
	//    0    0:aload_0         
	//    1    1:ldc1            #191 <String "drmSessionManagerError">
	//    2    3:aload_1         
	//    3    4:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//    4    7:return          
	}

	public void onDroppedFrames(int i, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("droppedFrames [");
	//    4    9:aload           4
	//    5   11:ldc1            #195 <String "droppedFrames [">
	//    6   13:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   17:aload           4
	//    9   19:aload_0         
	//   10   20:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   23:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   26:pop             
		stringbuilder.append(", ");
	//   13   27:aload           4
	//   14   29:ldc1            #98  <String ", ">
	//   15   31:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   34:pop             
		stringbuilder.append(i);
	//   17   35:aload           4
	//   18   37:iload_1         
	//   19   38:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   20   41:pop             
		stringbuilder.append("]");
	//   21   42:aload           4
	//   22   44:ldc1            #100 <String "]">
	//   23   46:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   24   49:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   25   50:ldc1            #14  <String "EventLogger">
	//   26   52:aload           4
	//   27   54:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   28   57:invokestatic    #116 <Method int Log.d(String, String)>
	//   29   60:pop             
	//   30   61:return          
	}

	public void onError(Exception exception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("playerFailed [");
	//    4    8:aload_2         
	//    5    9:ldc1            #198 <String "playerFailed [">
	//    6   11:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   20:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append("]");
	//   13   24:aload_2         
	//   14   25:ldc1            #100 <String "]">
	//   15   27:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		Log.e("EventLogger", stringbuilder.toString(), ((Throwable) (exception)));
	//   17   31:ldc1            #14  <String "EventLogger">
	//   18   33:aload_2         
	//   19   34:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   20   37:aload_1         
	//   21   38:invokestatic    #109 <Method int Log.e(String, String, Throwable)>
	//   22   41:pop             
		APSMediaPlayer.getInstance().trackforEvent(new ArrayList(), "internal playback error", com.appscend.media.APSMediaTrackingEvents.MediaEventType.ERROR, ((com.appscend.media.events.APSMediaEvent) (null)));
	//   23   42:invokestatic    #203 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   24   45:new             #205 <Class ArrayList>
	//   25   48:dup             
	//   26   49:invokespecial   #206 <Method void ArrayList()>
	//   27   52:ldc1            #208 <String "internal playback error">
	//   28   54:getstatic       #214 <Field com.appscend.media.APSMediaTrackingEvents$MediaEventType com.appscend.media.APSMediaTrackingEvents$MediaEventType.ERROR>
	//   29   57:aconst_null     
	//   30   58:invokevirtual   #218 <Method void APSMediaPlayer.trackforEvent(ArrayList, String, com.appscend.media.APSMediaTrackingEvents$MediaEventType, com.appscend.media.events.APSMediaEvent)>
		APSMediaPlayer.getInstance().unitFinished(com.appscend.media.APSMediaPlayer.MPMovieFinishReason.MPMovieFinishReasonPlaybackError);
	//   31   61:invokestatic    #203 <Method APSMediaPlayer APSMediaPlayer.getInstance()>
	//   32   64:getstatic       #224 <Field com.appscend.media.APSMediaPlayer$MPMovieFinishReason com.appscend.media.APSMediaPlayer$MPMovieFinishReason.MPMovieFinishReasonPlaybackError>
	//   33   67:invokevirtual   #228 <Method void APSMediaPlayer.unitFinished(com.appscend.media.APSMediaPlayer$MPMovieFinishReason)>
	//   34   70:return          
	}

	public void onLoadCompleted(int i, long l, int j, int k, Format format, long l1, long l2, long l3, long l4)
	{
		if(VerboseLogUtil.isTagEnabled("EventLogger"))
	//*   0    0:ldc1            #14  <String "EventLogger">
	//*   1    2:invokestatic    #236 <Method boolean VerboseLogUtil.isTagEnabled(String)>
	//*   2    5:ifeq            99
		{
			l = SystemClock.elapsedRealtime();
	//    3    8:invokestatic    #58  <Method long SystemClock.elapsedRealtime()>
	//    4   11:lstore_2        
			l1 = loadStartTimeMs[i];
	//    5   12:aload_0         
	//    6   13:getfield        #50  <Field long[] loadStartTimeMs>
	//    7   16:iload_1         
	//    8   17:laload          
	//    9   18:lstore          7
			format = ((Format) (new StringBuilder()));
	//   10   20:new             #87  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #88  <Method void StringBuilder()>
	//   13   27:astore          6
			((StringBuilder) (format)).append("loadEnd [");
	//   14   29:aload           6
	//   15   31:ldc1            #238 <String "loadEnd [">
	//   16   33:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   17   36:pop             
			((StringBuilder) (format)).append(getSessionTimeString());
	//   18   37:aload           6
	//   19   39:aload_0         
	//   20   40:invokespecial   #96  <Method String getSessionTimeString()>
	//   21   43:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   22   46:pop             
			((StringBuilder) (format)).append(", ");
	//   23   47:aload           6
	//   24   49:ldc1            #98  <String ", ">
	//   25   51:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			((StringBuilder) (format)).append(i);
	//   27   55:aload           6
	//   28   57:iload_1         
	//   29   58:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   30   61:pop             
			((StringBuilder) (format)).append(", ");
	//   31   62:aload           6
	//   32   64:ldc1            #98  <String ", ">
	//   33   66:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   34   69:pop             
			((StringBuilder) (format)).append(l - l1);
	//   35   70:aload           6
	//   36   72:lload_2         
	//   37   73:lload           7
	//   38   75:lsub            
	//   39   76:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   40   79:pop             
			((StringBuilder) (format)).append("]");
	//   41   80:aload           6
	//   42   82:ldc1            #100 <String "]">
	//   43   84:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
			Log.v("EventLogger", ((StringBuilder) (format)).toString());
	//   45   88:ldc1            #14  <String "EventLogger">
	//   46   90:aload           6
	//   47   92:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   48   95:invokestatic    #241 <Method int Log.v(String, String)>
	//   49   98:pop             
		}
	//   50   99:return          
	}

	public void onLoadError(int i, IOException ioexception)
	{
		printInternalError("loadError", ((Exception) (ioexception)));
	//    0    0:aload_0         
	//    1    1:ldc1            #245 <String "loadError">
	//    2    3:aload_2         
	//    3    4:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//    4    7:return          
	}

	public void onLoadStarted(int i, long l, int j, int k, Format format, long l1, long l2)
	{
		loadStartTimeMs[i] = SystemClock.elapsedRealtime();
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field long[] loadStartTimeMs>
	//    2    4:iload_1         
	//    3    5:invokestatic    #58  <Method long SystemClock.elapsedRealtime()>
	//    4    8:lastore         
		if(VerboseLogUtil.isTagEnabled("EventLogger"))
	//*   5    9:ldc1            #14  <String "EventLogger">
	//*   6   11:invokestatic    #236 <Method boolean VerboseLogUtil.isTagEnabled(String)>
	//*   7   14:ifeq            126
		{
			format = ((Format) (new StringBuilder()));
	//    8   17:new             #87  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #88  <Method void StringBuilder()>
	//   11   24:astore          6
			((StringBuilder) (format)).append("loadStart [");
	//   12   26:aload           6
	//   13   28:ldc1            #249 <String "loadStart [">
	//   14   30:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			((StringBuilder) (format)).append(getSessionTimeString());
	//   16   34:aload           6
	//   17   36:aload_0         
	//   18   37:invokespecial   #96  <Method String getSessionTimeString()>
	//   19   40:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
			((StringBuilder) (format)).append(", ");
	//   21   44:aload           6
	//   22   46:ldc1            #98  <String ", ">
	//   23   48:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   24   51:pop             
			((StringBuilder) (format)).append(i);
	//   25   52:aload           6
	//   26   54:iload_1         
	//   27   55:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   28   58:pop             
			((StringBuilder) (format)).append(", ");
	//   29   59:aload           6
	//   30   61:ldc1            #98  <String ", ">
	//   31   63:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
			((StringBuilder) (format)).append(j);
	//   33   67:aload           6
	//   34   69:iload           4
	//   35   71:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   36   74:pop             
			((StringBuilder) (format)).append(", ");
	//   37   75:aload           6
	//   38   77:ldc1            #98  <String ", ">
	//   39   79:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
			((StringBuilder) (format)).append(l1);
	//   41   83:aload           6
	//   42   85:lload           7
	//   43   87:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   44   90:pop             
			((StringBuilder) (format)).append(", ");
	//   45   91:aload           6
	//   46   93:ldc1            #98  <String ", ">
	//   47   95:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   48   98:pop             
			((StringBuilder) (format)).append(l2);
	//   49   99:aload           6
	//   50  101:lload           9
	//   51  103:invokevirtual   #145 <Method StringBuilder StringBuilder.append(long)>
	//   52  106:pop             
			((StringBuilder) (format)).append("]");
	//   53  107:aload           6
	//   54  109:ldc1            #100 <String "]">
	//   55  111:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   56  114:pop             
			Log.v("EventLogger", ((StringBuilder) (format)).toString());
	//   57  115:ldc1            #14  <String "EventLogger">
	//   58  117:aload           6
	//   59  119:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   60  122:invokestatic    #241 <Method int Log.v(String, String)>
	//   61  125:pop             
		}
	//   62  126:return          
	}

	public void onRendererInitializationError(Exception exception)
	{
		printInternalError("rendererInitError", exception);
	//    0    0:aload_0         
	//    1    1:ldc1            #252 <String "rendererInitError">
	//    2    3:aload_1         
	//    3    4:invokespecial   #135 <Method void printInternalError(String, Exception)>
	//    4    7:return          
	}

	public void onStateChanged(boolean flag, int i)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("state [");
	//    4    8:aload_3         
	//    5    9:ldc2            #256 <String "state [">
	//    6   12:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   21:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(", ");
	//   13   25:aload_3         
	//   14   26:ldc1            #98  <String ", ">
	//   15   28:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		stringbuilder.append(flag);
	//   17   32:aload_3         
	//   18   33:iload_1         
	//   19   34:invokevirtual   #168 <Method StringBuilder StringBuilder.append(boolean)>
	//   20   37:pop             
		stringbuilder.append(", ");
	//   21   38:aload_3         
	//   22   39:ldc1            #98  <String ", ">
	//   23   41:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
		stringbuilder.append(getStateString(i));
	//   25   45:aload_3         
	//   26   46:aload_0         
	//   27   47:iload_2         
	//   28   48:invokespecial   #258 <Method String getStateString(int)>
	//   29   51:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
		stringbuilder.append("]");
	//   31   55:aload_3         
	//   32   56:ldc1            #100 <String "]">
	//   33   58:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   35   62:ldc1            #14  <String "EventLogger">
	//   36   64:aload_3         
	//   37   65:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   38   68:invokestatic    #116 <Method int Log.d(String, String)>
	//   39   71:pop             
	//   40   72:return          
	}

	public void onVideoFormatEnabled(Format format, int i, long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("videoFormat [");
	//    4    9:aload           5
	//    5   11:ldc2            #261 <String "videoFormat [">
	//    6   14:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(getSessionTimeString());
	//    8   18:aload           5
	//    9   20:aload_0         
	//   10   21:invokespecial   #96  <Method String getSessionTimeString()>
	//   11   24:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:pop             
		stringbuilder.append(", ");
	//   13   28:aload           5
	//   14   30:ldc1            #98  <String ", ">
	//   15   32:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   16   35:pop             
		stringbuilder.append(format.id);
	//   17   36:aload           5
	//   18   38:aload_1         
	//   19   39:getfield        #125 <Field String Format.id>
	//   20   42:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
		stringbuilder.append(", ");
	//   22   46:aload           5
	//   23   48:ldc1            #98  <String ", ">
	//   24   50:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   25   53:pop             
		stringbuilder.append(Integer.toString(i));
	//   26   54:aload           5
	//   27   56:iload_2         
	//   28   57:invokestatic    #129 <Method String Integer.toString(int)>
	//   29   60:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   30   63:pop             
		stringbuilder.append("]");
	//   31   64:aload           5
	//   32   66:ldc1            #100 <String "]">
	//   33   68:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   34   71:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   35   72:ldc1            #14  <String "EventLogger">
	//   36   74:aload           5
	//   37   76:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   38   79:invokestatic    #116 <Method int Log.d(String, String)>
	//   39   82:pop             
	//   40   83:return          
	}

	public void onVideoSizeChanged(int i, int j, int k, float f)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #87  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #88  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append("videoSizeChanged [");
	//    4    9:aload           5
	//    5   11:ldc2            #265 <String "videoSizeChanged [">
	//    6   14:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		stringbuilder.append(i);
	//    8   18:aload           5
	//    9   20:iload_1         
	//   10   21:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   11   24:pop             
		stringbuilder.append(", ");
	//   12   25:aload           5
	//   13   27:ldc1            #98  <String ", ">
	//   14   29:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append(j);
	//   16   33:aload           5
	//   17   35:iload_2         
	//   18   36:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   19   39:pop             
		stringbuilder.append(", ");
	//   20   40:aload           5
	//   21   42:ldc1            #98  <String ", ">
	//   22   44:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(k);
	//   24   48:aload           5
	//   25   50:iload_3         
	//   26   51:invokevirtual   #142 <Method StringBuilder StringBuilder.append(int)>
	//   27   54:pop             
		stringbuilder.append(", ");
	//   28   55:aload           5
	//   29   57:ldc1            #98  <String ", ">
	//   30   59:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   31   62:pop             
		stringbuilder.append(f);
	//   32   63:aload           5
	//   33   65:fload           4
	//   34   67:invokevirtual   #268 <Method StringBuilder StringBuilder.append(float)>
	//   35   70:pop             
		stringbuilder.append("]");
	//   36   71:aload           5
	//   37   73:ldc1            #100 <String "]">
	//   38   75:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		Log.d("EventLogger", stringbuilder.toString());
	//   40   79:ldc1            #14  <String "EventLogger">
	//   41   81:aload           5
	//   42   83:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   43   86:invokestatic    #116 <Method int Log.d(String, String)>
	//   44   89:pop             
	//   45   90:return          
	}

	public void startSession()
	{
		sessionStartTimeMs = SystemClock.elapsedRealtime();
	//    0    0:aload_0         
	//    1    1:invokestatic    #58  <Method long SystemClock.elapsedRealtime()>
	//    2    4:putfield        #60  <Field long sessionStartTimeMs>
		Log.d("EventLogger", "start [0]");
	//    3    7:ldc1            #14  <String "EventLogger">
	//    4    9:ldc2            #271 <String "start [0]">
	//    5   12:invokestatic    #116 <Method int Log.d(String, String)>
	//    6   15:pop             
	//    7   16:return          
	}

	private static final String TAG = "EventLogger";
	private static final NumberFormat TIME_FORMAT;
	private long availableRangeValuesUs[];
	private long loadStartTimeMs[];
	private long sessionStartTimeMs;

	static 
	{
		TIME_FORMAT = NumberFormat.getInstance(Locale.US);
	//    0    0:getstatic       #29  <Field Locale Locale.US>
	//    1    3:invokestatic    #35  <Method NumberFormat NumberFormat.getInstance(Locale)>
	//    2    6:putstatic       #37  <Field NumberFormat TIME_FORMAT>
		TIME_FORMAT.setMinimumFractionDigits(2);
	//    3    9:getstatic       #37  <Field NumberFormat TIME_FORMAT>
	//    4   12:iconst_2        
	//    5   13:invokevirtual   #41  <Method void NumberFormat.setMinimumFractionDigits(int)>
		TIME_FORMAT.setMaximumFractionDigits(2);
	//    6   16:getstatic       #37  <Field NumberFormat TIME_FORMAT>
	//    7   19:iconst_2        
	//    8   20:invokevirtual   #44  <Method void NumberFormat.setMaximumFractionDigits(int)>
	//*   9   23:return          
	}
}
