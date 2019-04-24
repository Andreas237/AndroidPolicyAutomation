// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.ui;

import android.widget.TextView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import java.util.Locale;

public class DebugTextViewHelper extends com.google.android.exoplayer2.Player.DefaultEventListener
	implements Runnable
{

	public DebugTextViewHelper(SimpleExoPlayer simpleexoplayer, TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void com.google.android.exoplayer2.Player$DefaultEventListener()>
		player = simpleexoplayer;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field SimpleExoPlayer player>
		textView = textview;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field TextView textView>
	//    8   14:return          
	}

	private static String getDecoderCountersBufferCountString(DecoderCounters decodercounters)
	{
		if(decodercounters == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
		{
			return "";
	//    2    4:ldc1            #29  <String "">
	//    3    6:areturn         
		} else
		{
			decodercounters.ensureUpdated();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #34  <Method void DecoderCounters.ensureUpdated()>
			StringBuilder stringbuilder = new StringBuilder();
	//    6   11:new             #36  <Class StringBuilder>
	//    7   14:dup             
	//    8   15:invokespecial   #37  <Method void StringBuilder()>
	//    9   18:astore_1        
			stringbuilder.append(" sib:");
	//   10   19:aload_1         
	//   11   20:ldc1            #39  <String " sib:">
	//   12   22:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
			stringbuilder.append(decodercounters.skippedInputBufferCount);
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:getfield        #46  <Field int DecoderCounters.skippedInputBufferCount>
	//   17   31:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   18   34:pop             
			stringbuilder.append(" sb:");
	//   19   35:aload_1         
	//   20   36:ldc1            #51  <String " sb:">
	//   21   38:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			stringbuilder.append(decodercounters.skippedOutputBufferCount);
	//   23   42:aload_1         
	//   24   43:aload_0         
	//   25   44:getfield        #54  <Field int DecoderCounters.skippedOutputBufferCount>
	//   26   47:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   27   50:pop             
			stringbuilder.append(" rb:");
	//   28   51:aload_1         
	//   29   52:ldc1            #56  <String " rb:">
	//   30   54:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
			stringbuilder.append(decodercounters.renderedOutputBufferCount);
	//   32   58:aload_1         
	//   33   59:aload_0         
	//   34   60:getfield        #59  <Field int DecoderCounters.renderedOutputBufferCount>
	//   35   63:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   36   66:pop             
			stringbuilder.append(" db:");
	//   37   67:aload_1         
	//   38   68:ldc1            #61  <String " db:">
	//   39   70:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   40   73:pop             
			stringbuilder.append(decodercounters.droppedBufferCount);
	//   41   74:aload_1         
	//   42   75:aload_0         
	//   43   76:getfield        #64  <Field int DecoderCounters.droppedBufferCount>
	//   44   79:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   45   82:pop             
			stringbuilder.append(" mcdb:");
	//   46   83:aload_1         
	//   47   84:ldc1            #66  <String " mcdb:">
	//   48   86:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   49   89:pop             
			stringbuilder.append(decodercounters.maxConsecutiveDroppedBufferCount);
	//   50   90:aload_1         
	//   51   91:aload_0         
	//   52   92:getfield        #69  <Field int DecoderCounters.maxConsecutiveDroppedBufferCount>
	//   53   95:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   54   98:pop             
			stringbuilder.append(" dk:");
	//   55   99:aload_1         
	//   56  100:ldc1            #71  <String " dk:">
	//   57  102:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   58  105:pop             
			stringbuilder.append(decodercounters.droppedToKeyframeCount);
	//   59  106:aload_1         
	//   60  107:aload_0         
	//   61  108:getfield        #74  <Field int DecoderCounters.droppedToKeyframeCount>
	//   62  111:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   63  114:pop             
			return stringbuilder.toString();
	//   64  115:aload_1         
	//   65  116:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   66  119:areturn         
		}
	}

	private static String getPixelAspectRatioString(float f)
	{
		if(f != -1F && f != 1.0F)
	//*   0    0:fload_0         
	//*   1    1:ldc1            #81  <Float -1F>
	//*   2    3:fcmpl           
	//*   3    4:ifeq            60
	//*   4    7:fload_0         
	//*   5    8:fconst_1        
	//*   6    9:fcmpl           
	//*   7   10:ifne            16
	//*   8   13:goto            60
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    9   16:new             #36  <Class StringBuilder>
	//   10   19:dup             
	//   11   20:invokespecial   #37  <Method void StringBuilder()>
	//   12   23:astore_1        
			stringbuilder.append(" par:");
	//   13   24:aload_1         
	//   14   25:ldc1            #83  <String " par:">
	//   15   27:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
			stringbuilder.append(String.format(Locale.US, "%.02f", new Object[] {
				Float.valueOf(f)
			}));
	//   17   31:aload_1         
	//   18   32:getstatic       #89  <Field Locale Locale.US>
	//   19   35:ldc1            #91  <String "%.02f">
	//   20   37:iconst_1        
	//   21   38:anewarray       Object[]
	//   22   41:dup             
	//   23   42:iconst_0        
	//   24   43:fload_0         
	//   25   44:invokestatic    #99  <Method Float Float.valueOf(float)>
	//   26   47:aastore         
	//   27   48:invokestatic    #105 <Method String String.format(Locale, String, Object[])>
	//   28   51:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			return stringbuilder.toString();
	//   30   55:aload_1         
	//   31   56:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   32   59:areturn         
		} else
		{
			return "";
	//   33   60:ldc1            #29  <String "">
	//   34   62:areturn         
		}
	}

	protected String getAudioString()
	{
		Format format = player.getAudioFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SimpleExoPlayer player>
	//    2    4:invokevirtual   #112 <Method Format SimpleExoPlayer.getAudioFormat()>
	//    3    7:astore_1        
		if(format == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       15
		{
			return "";
	//    6   12:ldc1            #29  <String "">
	//    7   14:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   15:new             #36  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #37  <Method void StringBuilder()>
	//   11   22:astore_2        
			stringbuilder.append("\n");
	//   12   23:aload_2         
	//   13   24:ldc1            #114 <String "\n">
	//   14   26:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(format.sampleMimeType);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:getfield        #120 <Field String Format.sampleMimeType>
	//   19   35:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append("(id:");
	//   21   39:aload_2         
	//   22   40:ldc1            #122 <String "(id:">
	//   23   42:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			stringbuilder.append(format.id);
	//   25   46:aload_2         
	//   26   47:aload_1         
	//   27   48:getfield        #125 <Field String Format.id>
	//   28   51:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			stringbuilder.append(" hz:");
	//   30   55:aload_2         
	//   31   56:ldc1            #127 <String " hz:">
	//   32   58:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
			stringbuilder.append(format.sampleRate);
	//   34   62:aload_2         
	//   35   63:aload_1         
	//   36   64:getfield        #130 <Field int Format.sampleRate>
	//   37   67:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   38   70:pop             
			stringbuilder.append(" ch:");
	//   39   71:aload_2         
	//   40   72:ldc1            #132 <String " ch:">
	//   41   74:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
			stringbuilder.append(format.channelCount);
	//   43   78:aload_2         
	//   44   79:aload_1         
	//   45   80:getfield        #135 <Field int Format.channelCount>
	//   46   83:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   47   86:pop             
			stringbuilder.append(getDecoderCountersBufferCountString(player.getAudioDecoderCounters()));
	//   48   87:aload_2         
	//   49   88:aload_0         
	//   50   89:getfield        #22  <Field SimpleExoPlayer player>
	//   51   92:invokevirtual   #139 <Method DecoderCounters SimpleExoPlayer.getAudioDecoderCounters()>
	//   52   95:invokestatic    #141 <Method String getDecoderCountersBufferCountString(DecoderCounters)>
	//   53   98:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   54  101:pop             
			stringbuilder.append(")");
	//   55  102:aload_2         
	//   56  103:ldc1            #143 <String ")">
	//   57  105:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   58  108:pop             
			return stringbuilder.toString();
	//   59  109:aload_2         
	//   60  110:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   61  113:areturn         
		}
	}

	protected String getDebugString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #36  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #37  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(getPlayerStateString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #147 <Method String getPlayerStateString()>
	//    7   13:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(getVideoString());
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #150 <Method String getVideoString()>
	//   12   22:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   13   25:pop             
		stringbuilder.append(getAudioString());
	//   14   26:aload_1         
	//   15   27:aload_0         
	//   16   28:invokevirtual   #152 <Method String getAudioString()>
	//   17   31:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   18   34:pop             
		return stringbuilder.toString();
	//   19   35:aload_1         
	//   20   36:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   21   39:areturn         
	}

	protected String getPlayerStateString()
	{
		String s;
		switch(player.getPlaybackState())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field SimpleExoPlayer player>
	//*   2    4:invokevirtual   #156 <Method int SimpleExoPlayer.getPlaybackState()>
		{
	//*   3    7:tableswitch     1 4: default 36
	//	               1 60
	//	               2 54
	//	               3 48
	//	               4 42
		default:
			s = "unknown";
	//    4   36:ldc1            #158 <String "unknown">
	//    5   38:astore_1        
			break;

	//*   6   39:goto            63
		case 4: // '\004'
			s = "ended";
	//    7   42:ldc1            #160 <String "ended">
	//    8   44:astore_1        
			break;

	//*   9   45:goto            63
		case 3: // '\003'
			s = "ready";
	//   10   48:ldc1            #162 <String "ready">
	//   11   50:astore_1        
			break;

	//*  12   51:goto            63
		case 2: // '\002'
			s = "buffering";
	//   13   54:ldc1            #164 <String "buffering">
	//   14   56:astore_1        
			break;

	//*  15   57:goto            63
		case 1: // '\001'
			s = "idle";
	//   16   60:ldc1            #166 <String "idle">
	//   17   62:astore_1        
			break;
		}
		return String.format("playWhenReady:%s playbackState:%s window:%s", new Object[] {
			Boolean.valueOf(player.getPlayWhenReady()), s, Integer.valueOf(player.getCurrentWindowIndex())
		});
	//   18   63:ldc1            #168 <String "playWhenReady:%s playbackState:%s window:%s">
	//   19   65:iconst_3        
	//   20   66:anewarray       Object[]
	//   21   69:dup             
	//   22   70:iconst_0        
	//   23   71:aload_0         
	//   24   72:getfield        #22  <Field SimpleExoPlayer player>
	//   25   75:invokevirtual   #172 <Method boolean SimpleExoPlayer.getPlayWhenReady()>
	//   26   78:invokestatic    #177 <Method Boolean Boolean.valueOf(boolean)>
	//   27   81:aastore         
	//   28   82:dup             
	//   29   83:iconst_1        
	//   30   84:aload_1         
	//   31   85:aastore         
	//   32   86:dup             
	//   33   87:iconst_2        
	//   34   88:aload_0         
	//   35   89:getfield        #22  <Field SimpleExoPlayer player>
	//   36   92:invokevirtual   #180 <Method int SimpleExoPlayer.getCurrentWindowIndex()>
	//   37   95:invokestatic    #185 <Method Integer Integer.valueOf(int)>
	//   38   98:aastore         
	//   39   99:invokestatic    #188 <Method String String.format(String, Object[])>
	//   40  102:areturn         
	}

	protected String getVideoString()
	{
		Format format = player.getVideoFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field SimpleExoPlayer player>
	//    2    4:invokevirtual   #191 <Method Format SimpleExoPlayer.getVideoFormat()>
	//    3    7:astore_1        
		if(format == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       15
		{
			return "";
	//    6   12:ldc1            #29  <String "">
	//    7   14:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   15:new             #36  <Class StringBuilder>
	//    9   18:dup             
	//   10   19:invokespecial   #37  <Method void StringBuilder()>
	//   11   22:astore_2        
			stringbuilder.append("\n");
	//   12   23:aload_2         
	//   13   24:ldc1            #114 <String "\n">
	//   14   26:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			stringbuilder.append(format.sampleMimeType);
	//   16   30:aload_2         
	//   17   31:aload_1         
	//   18   32:getfield        #120 <Field String Format.sampleMimeType>
	//   19   35:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
			stringbuilder.append("(id:");
	//   21   39:aload_2         
	//   22   40:ldc1            #122 <String "(id:">
	//   23   42:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
			stringbuilder.append(format.id);
	//   25   46:aload_2         
	//   26   47:aload_1         
	//   27   48:getfield        #125 <Field String Format.id>
	//   28   51:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			stringbuilder.append(" r:");
	//   30   55:aload_2         
	//   31   56:ldc1            #193 <String " r:">
	//   32   58:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   33   61:pop             
			stringbuilder.append(format.width);
	//   34   62:aload_2         
	//   35   63:aload_1         
	//   36   64:getfield        #196 <Field int Format.width>
	//   37   67:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   38   70:pop             
			stringbuilder.append("x");
	//   39   71:aload_2         
	//   40   72:ldc1            #198 <String "x">
	//   41   74:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   42   77:pop             
			stringbuilder.append(format.height);
	//   43   78:aload_2         
	//   44   79:aload_1         
	//   45   80:getfield        #201 <Field int Format.height>
	//   46   83:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   47   86:pop             
			stringbuilder.append(getPixelAspectRatioString(format.pixelWidthHeightRatio));
	//   48   87:aload_2         
	//   49   88:aload_1         
	//   50   89:getfield        #205 <Field float Format.pixelWidthHeightRatio>
	//   51   92:invokestatic    #207 <Method String getPixelAspectRatioString(float)>
	//   52   95:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   53   98:pop             
			stringbuilder.append(getDecoderCountersBufferCountString(player.getVideoDecoderCounters()));
	//   54   99:aload_2         
	//   55  100:aload_0         
	//   56  101:getfield        #22  <Field SimpleExoPlayer player>
	//   57  104:invokevirtual   #210 <Method DecoderCounters SimpleExoPlayer.getVideoDecoderCounters()>
	//   58  107:invokestatic    #141 <Method String getDecoderCountersBufferCountString(DecoderCounters)>
	//   59  110:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   60  113:pop             
			stringbuilder.append(")");
	//   61  114:aload_2         
	//   62  115:ldc1            #143 <String ")">
	//   63  117:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   64  120:pop             
			return stringbuilder.toString();
	//   65  121:aload_2         
	//   66  122:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   67  125:areturn         
		}
	}

	public final void onPlayerStateChanged(boolean flag, int i)
	{
		updateAndPost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #215 <Method void updateAndPost()>
	//    2    4:return          
	}

	public final void onPositionDiscontinuity(int i)
	{
		updateAndPost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #215 <Method void updateAndPost()>
	//    2    4:return          
	}

	public final void run()
	{
		updateAndPost();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #215 <Method void updateAndPost()>
	//    2    4:return          
	}

	public final void start()
	{
		if(started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field boolean started>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			started = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #221 <Field boolean started>
			player.addListener(((com.google.android.exoplayer2.Player.EventListener) (this)));
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field SimpleExoPlayer player>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #225 <Method void SimpleExoPlayer.addListener(com.google.android.exoplayer2.Player$EventListener)>
			updateAndPost();
	//   11   21:aload_0         
	//   12   22:invokevirtual   #215 <Method void updateAndPost()>
			return;
	//   13   25:return          
		}
	}

	public final void stop()
	{
		if(!started)
	//*   0    0:aload_0         
	//*   1    1:getfield        #221 <Field boolean started>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			started = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #221 <Field boolean started>
			player.removeListener(((com.google.android.exoplayer2.Player.EventListener) (this)));
	//    7   13:aload_0         
	//    8   14:getfield        #22  <Field SimpleExoPlayer player>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #229 <Method void SimpleExoPlayer.removeListener(com.google.android.exoplayer2.Player$EventListener)>
			textView.removeCallbacks(((Runnable) (this)));
	//   11   21:aload_0         
	//   12   22:getfield        #24  <Field TextView textView>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #235 <Method boolean TextView.removeCallbacks(Runnable)>
	//   15   29:pop             
			return;
	//   16   30:return          
		}
	}

	protected final void updateAndPost()
	{
		textView.setText(((CharSequence) (getDebugString())));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field TextView textView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #240 <Method String getDebugString()>
	//    4    8:invokevirtual   #244 <Method void TextView.setText(CharSequence)>
		textView.removeCallbacks(((Runnable) (this)));
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field TextView textView>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #235 <Method boolean TextView.removeCallbacks(Runnable)>
	//    9   19:pop             
		textView.postDelayed(((Runnable) (this)), 1000L);
	//   10   20:aload_0         
	//   11   21:getfield        #24  <Field TextView textView>
	//   12   24:aload_0         
	//   13   25:ldc2w           #245 <Long 1000L>
	//   14   28:invokevirtual   #250 <Method boolean TextView.postDelayed(Runnable, long)>
	//   15   31:pop             
	//   16   32:return          
	}

	private static final int REFRESH_INTERVAL_MS = 1000;
	private final SimpleExoPlayer player;
	private boolean started;
	private final TextView textView;
}
