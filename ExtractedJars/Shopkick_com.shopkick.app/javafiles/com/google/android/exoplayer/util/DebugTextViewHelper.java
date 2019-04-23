// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import android.widget.TextView;
import com.google.android.exoplayer.CodecCounters;
import com.google.android.exoplayer.chunk.Format;
import com.google.android.exoplayer.upstream.BandwidthMeter;

public final class DebugTextViewHelper
	implements Runnable
{
	public static interface Provider
	{

		public abstract BandwidthMeter getBandwidthMeter();

		public abstract CodecCounters getCodecCounters();

		public abstract long getCurrentPosition();

		public abstract Format getFormat();
	}


	public DebugTextViewHelper(Provider provider, TextView textview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		debuggable = provider;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field DebugTextViewHelper$Provider debuggable>
		textView = textview;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field TextView textView>
	//    8   14:return          
	}

	private String getBandwidthString()
	{
		BandwidthMeter bandwidthmeter = debuggable.getBandwidthMeter();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DebugTextViewHelper$Provider debuggable>
	//    2    4:invokeinterface #32  <Method BandwidthMeter DebugTextViewHelper$Provider.getBandwidthMeter()>
	//    3    9:astore_1        
		if(bandwidthmeter != null && bandwidthmeter.getBitrateEstimate() != -1L)
	//*   4   10:aload_1         
	//*   5   11:ifnull          65
	//*   6   14:aload_1         
	//*   7   15:invokeinterface #38  <Method long BandwidthMeter.getBitrateEstimate()>
	//*   8   20:ldc2w           #39  <Long -1L>
	//*   9   23:lcmp            
	//*  10   24:ifne            30
	//*  11   27:goto            65
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   30:new             #42  <Class StringBuilder>
	//   13   33:dup             
	//   14   34:invokespecial   #43  <Method void StringBuilder()>
	//   15   37:astore_2        
			stringbuilder.append("bw:");
	//   16   38:aload_2         
	//   17   39:ldc1            #45  <String "bw:">
	//   18   41:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:pop             
			stringbuilder.append(bandwidthmeter.getBitrateEstimate() / 1000L);
	//   20   45:aload_2         
	//   21   46:aload_1         
	//   22   47:invokeinterface #38  <Method long BandwidthMeter.getBitrateEstimate()>
	//   23   52:ldc2w           #50  <Long 1000L>
	//   24   55:ldiv            
	//   25   56:invokevirtual   #54  <Method StringBuilder StringBuilder.append(long)>
	//   26   59:pop             
			return stringbuilder.toString();
	//   27   60:aload_2         
	//   28   61:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   29   64:areturn         
		} else
		{
			return "bw:?";
	//   30   65:ldc1            #59  <String "bw:?">
	//   31   67:areturn         
		}
	}

	private String getQualityString()
	{
		Format format = debuggable.getFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DebugTextViewHelper$Provider debuggable>
	//    2    4:invokeinterface #64  <Method Format DebugTextViewHelper$Provider.getFormat()>
	//    3    9:astore_1        
		if(format == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       17
		{
			return "id:? br:? h:?";
	//    6   14:ldc1            #66  <String "id:? br:? h:?">
	//    7   16:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #42  <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #43  <Method void StringBuilder()>
	//   11   24:astore_2        
			stringbuilder.append("id:");
	//   12   25:aload_2         
	//   13   26:ldc1            #68  <String "id:">
	//   14   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
			stringbuilder.append(format.id);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:getfield        #74  <Field String Format.id>
	//   19   37:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			stringbuilder.append(" br:");
	//   21   41:aload_2         
	//   22   42:ldc1            #76  <String " br:">
	//   23   44:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
			stringbuilder.append(format.bitrate);
	//   25   48:aload_2         
	//   26   49:aload_1         
	//   27   50:getfield        #79  <Field int Format.bitrate>
	//   28   53:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   29   56:pop             
			stringbuilder.append(" h:");
	//   30   57:aload_2         
	//   31   58:ldc1            #84  <String " h:">
	//   32   60:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			stringbuilder.append(format.height);
	//   34   64:aload_2         
	//   35   65:aload_1         
	//   36   66:getfield        #87  <Field int Format.height>
	//   37   69:invokevirtual   #82  <Method StringBuilder StringBuilder.append(int)>
	//   38   72:pop             
			return stringbuilder.toString();
	//   39   73:aload_2         
	//   40   74:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   41   77:areturn         
		}
	}

	private String getRenderString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(getTimeString());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokespecial   #91  <Method String getTimeString()>
	//    7   13:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    8   16:pop             
		stringbuilder.append(" ");
	//    9   17:aload_1         
	//   10   18:ldc1            #93  <String " ">
	//   11   20:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(getQualityString());
	//   13   24:aload_1         
	//   14   25:aload_0         
	//   15   26:invokespecial   #95  <Method String getQualityString()>
	//   16   29:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   17   32:pop             
		stringbuilder.append(" ");
	//   18   33:aload_1         
	//   19   34:ldc1            #93  <String " ">
	//   20   36:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append(getBandwidthString());
	//   22   40:aload_1         
	//   23   41:aload_0         
	//   24   42:invokespecial   #97  <Method String getBandwidthString()>
	//   25   45:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   26   48:pop             
		stringbuilder.append(" ");
	//   27   49:aload_1         
	//   28   50:ldc1            #93  <String " ">
	//   29   52:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
		stringbuilder.append(getVideoCodecCountersString());
	//   31   56:aload_1         
	//   32   57:aload_0         
	//   33   58:invokespecial   #100 <Method String getVideoCodecCountersString()>
	//   34   61:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
		return stringbuilder.toString();
	//   36   65:aload_1         
	//   37   66:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   38   69:areturn         
	}

	private String getTimeString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #42  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #43  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ms(");
	//    4    8:aload_1         
	//    5    9:ldc1            #102 <String "ms(">
	//    6   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(debuggable.getCurrentPosition());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #23  <Field DebugTextViewHelper$Provider debuggable>
	//   11   20:invokeinterface #105 <Method long DebugTextViewHelper$Provider.getCurrentPosition()>
	//   12   25:invokevirtual   #54  <Method StringBuilder StringBuilder.append(long)>
	//   13   28:pop             
		stringbuilder.append(")");
	//   14   29:aload_1         
	//   15   30:ldc1            #107 <String ")">
	//   16   32:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		return stringbuilder.toString();
	//   18   36:aload_1         
	//   19   37:invokevirtual   #57  <Method String StringBuilder.toString()>
	//   20   40:areturn         
	}

	private String getVideoCodecCountersString()
	{
		CodecCounters codeccounters = debuggable.getCodecCounters();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field DebugTextViewHelper$Provider debuggable>
	//    2    4:invokeinterface #111 <Method CodecCounters DebugTextViewHelper$Provider.getCodecCounters()>
	//    3    9:astore_1        
		if(codeccounters == null)
	//*   4   10:aload_1         
	//*   5   11:ifnonnull       17
			return "";
	//    6   14:ldc1            #113 <String "">
	//    7   16:areturn         
		else
			return codeccounters.getDebugString();
	//    8   17:aload_1         
	//    9   18:invokevirtual   #118 <Method String CodecCounters.getDebugString()>
	//   10   21:areturn         
	}

	public void run()
	{
		textView.setText(((CharSequence) (getRenderString())));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TextView textView>
	//    2    4:aload_0         
	//    3    5:invokespecial   #121 <Method String getRenderString()>
	//    4    8:invokevirtual   #127 <Method void TextView.setText(CharSequence)>
		textView.postDelayed(((Runnable) (this)), 1000L);
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field TextView textView>
	//    7   15:aload_0         
	//    8   16:ldc2w           #50  <Long 1000L>
	//    9   19:invokevirtual   #131 <Method boolean TextView.postDelayed(Runnable, long)>
	//   10   22:pop             
	//   11   23:return          
	}

	public void start()
	{
		stop();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method void stop()>
		run();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #137 <Method void run()>
	//    4    8:return          
	}

	public void stop()
	{
		textView.removeCallbacks(((Runnable) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field TextView textView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #141 <Method boolean TextView.removeCallbacks(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	private static final int REFRESH_INTERVAL_MS = 1000;
	private final Provider debuggable;
	private final TextView textView;
}
